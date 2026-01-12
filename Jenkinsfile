pipeline {
    agent any

    tools {
        jdk 'jdk-17'
        maven 'maven-3.9'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://www.github.com/asdasd.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ Build Success'
        }
        failure {
            echo '❌ Build Failed'
        }
    }
}