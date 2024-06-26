pipeline{

    agent any
    tools {
        // Especifica el nombre de la herramienta de Maven configurada en Jenkins
        maven 'maven_3_9_6'
    }
    stages {
        stage('Compile') {
            steps {
                // Ejecuta las tareas de compilación con Maven
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Ejecuta las pruebas con Maven
                sh 'mvn clean verify -Dcucumber.filter.tags="@TEST1 or @TEST2"'
            }
        }
        // Otras etapas del pipeline

        stage('Cucumber Reports'){
            steps{
                cucumber buildStatus: "UNSTABLE",
                        fileIncludePattern: "**/cucumber.json",
                        jsonReportDirectory: 'target'
            }
        }

    }

}