pipeline {
	agent any

	environment {
		MAVEN_HOME = tool 'maven'
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

