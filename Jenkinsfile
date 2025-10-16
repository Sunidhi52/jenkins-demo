pipeline {
    agent any

    tools {
        maven 'Maven-3.9.0'  // adjust to your Maven tool name in Jenkins
        jdk 'Java-21'         // adjust to your JDK tool name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Sunidhi52/jenkins-demo.git', credentialsId: 'jenkins_nidz'
            }
        }

        stage('Build') {
            steps {
                echo "🔨 Running Maven clean and compile..."
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo "🧪 Running TestNG tests..."
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo "📦 Packaging the application..."
                bat 'mvn package'
            }
        }

        stage('Deploy & Run Jar') {
            steps {
                echo "🚀 Running the application jar..."
                // Use full path to jar or relative path; ensure Main-Class is set in POM
                bat 'java -jar target\\Jenkins_demo-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            echo "✅ Build, tests, and jar execution succeeded!"
        }
        failure {
            echo "❌ Something went wrong! Check the logs above."
        }
    }
}
