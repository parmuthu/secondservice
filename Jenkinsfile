pipeline {
	agent any


	tools {
		jdk 'jdk17'
	}

	stages {
       
       
		stage('Build'){
			steps 
			{
			bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn install -DskipTests"
		

			}
		}

		stage('Test'){
			steps{
				bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn test"
			}
		}

 stage('Code analysis') {
            agent any
            steps {
              withSonarQubeEnv('SonarServer1') {
                bat 'D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn clean install sonar:sonar  -Dsonar.java.binaries=target/classes  -Dsonar.projectKey=com.microservice.secondservice  -Dsonar.projectName=secondservice   -Dsonar.host.url=http://localhost:9000   -Dsonar.token=4522f85c32aa8c6ff6b3e51d6e3c4727b2bae713'
              }
            
            }
          }
          
		stage('Deploy') {
			steps {
			  echo "Deploy to server"
			}
		}
	}
}

