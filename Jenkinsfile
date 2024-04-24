pipeline {
	agent any

	

	tools {
		jdk 'jdk17'
	}

	stages {

		stage('Build'){
			steps {
				bat "D:\\apache-maven-3.6.3-bin\\apache-maven-3.6.3\\bin\\mvn clean install -DskipTests"
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

