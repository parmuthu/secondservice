pipeline {
	agent any

	environment {
		mavenHome = tool 'pipeline-maven'
	}
	

	tools {
		jdk 'jdk17'
	}

	stages {

		stage('Build'){
			steps 
			{
			 withMaven(maven: 'pipeline-maven') {
                    bat "mvn clean package -DskipTests"
                }
				

			}
		}

		stage('Test'){
			steps{
				bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn test"
			}
		}

		stage('Deploy') {
			steps {
			  echo "Deploy to server"
			}
		}
	}
}

