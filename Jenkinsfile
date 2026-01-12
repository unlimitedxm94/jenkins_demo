pipeline {
    agent any

    tools {
        jdk 'jdk-17'
        maven 'maven-3.9'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/unlimitedxm94/jenkins_demo.git'
            }
        }

        stage('Build') {
            steps {
                dir('simpleweb') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
        
        stage('Run') {
            steps {
                dir('simpleweb') {
                    // 后台运行 JAR
                    sh 'nohup java -jar target/simpleweb-0.0.1-SNAPSHOT.jar > app.log 2>&1 &'
                }
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