pipeline {
	agent any

environment {
        // Specify the Maven installation name configured in Jenkins
        MAVEN_HOME = tool name: 'pipeline-maven', type: 'maven'
    }

	

	tools {
		jdk 'jdk17'
	}

	stages {

		stage('Build'){
			steps 
			{
			withMaven(maven: 'pipeline-maven') {
                    bat 'mvn clean package'
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

