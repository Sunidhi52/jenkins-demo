pipeline {
    agent any

    tools {
        // Set Maven and JDK tools installed in Jenkins
        maven 'MAVEN'
        jdk 'JAVA_HOME'
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Running Maven clean and compile...'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Maven tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Simulating deployment to staging server...'

                // Run the jar created
                echo 'Running the JAR file...'
                bat 'java -jar target\\Jenkins_demo-1.0-SNAPSHOT.jar'

                echo 'Deployment completed successfully!'
            }
        }
    }

    post {
        success {
            echo '✅ Build and deployment succeeded!'
        }
        failure {
            echo '❌ Build failed! Please check logs.'
        }
    }
}
