pipeline {
    agent any

    tools {
        maven 'MAVEN'    // Use the Maven installation configured in Jenkins (Manage Jenkins → Tools)
        jdk 'JAVA_HOME'      // Use your configured JDK (adjust name as per your Jenkins setup)
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Cloning repository from GitHub...'
                git branch: 'master', url: 'https://github.com/Sunidhi52/jenkins-demo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Running Maven clean and compile...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Maven tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Simulating deployment to staging server...'
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
