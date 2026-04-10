pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'
        jdk 'Java 11'
    }

    stages {
        stage('Clonar') {
            steps {
                git 'https://github.com/tu-usuario/FactorialApp.git'
            }
        }

        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Pruebas') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build y pruebas exitosas'
        }
        failure {
            echo 'Falló el proceso'
        }
    }
}
