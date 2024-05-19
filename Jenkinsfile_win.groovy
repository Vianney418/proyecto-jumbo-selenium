pipeline{

    agent any

    stages{

        stage('Compile Stage') {

            steps {
                script {
                    def MAVEN_HOME = tool name: 'maven_3_9_6', type: 'maven'
                    withEnv(["PATH+MAVEN=${MAVEN_HOME}/bin"]) {
                        bat "${MAVEN_HOME}\\bin\\mvn clean compile"
                    }
                }
            }
        }


        stage('Test Stage'){
            steps {
                script{
                    def MAVEN_HOME = tool name: 'maven_3_9_6', type: 'maven'
                    withEnv (["PATH+MAVEN=${MAVEN_HOME}/bin"]) {
                        bat "${MAVEN_HOME}\\bin\\mvn clean verify -Dcucumber.filter.tags=\"@TEST1 or @TEST2\""
                    }
                }
            }
        }

        stage ('Cucumber Reports'){
            steps{
                cucumber buildStatus: "UNSTABLE",
                fileIncludePattern: "**/cucumber.json",
                jsonReportDirectory: 'target'
            }
        }
    }
}