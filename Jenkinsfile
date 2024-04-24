pipeline {
	agent any

	environment {
		mavenHome = tool 'maven'
	}

	tools {
		jdk 'jdk17'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			  echo "Deploy to server"
			}
		}
	}
}

