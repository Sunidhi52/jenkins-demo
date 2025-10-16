pipeline {
    agent any

    tools {
        maven 'MAVEN'      // Maven installation configured in Jenkins
        jdk 'JAVA_HOME'     // JDK configured in Jenkins
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
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running TestNG tests via Maven...'
                // Make sure your pom.xml has surefire configured to use testng.xml
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
                echo 'Running the application...'
                bat 'java -jar "%WORKSPACE%\\target\\Jenkins_demo-1.0-SNAPSHOT.jar"'
            }
        }
    }

    post {
        success {
            echo '✅ Build, test, and deployment succeeded!'
        }
        failure {
            echo '❌ Build or tests failed! Please check logs.'
        }
    }
}
