pipeline {
	agent any


	tools {
		jdk 'jdk17'
	}

	stages {
       
       
		stage('Build'){
			steps 
			{
			bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn clean install -DskipTests"
		

			}
		}

		stage('Test'){
			steps{
				bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn test"
			}
		}

 stage('SonarQube analysis') {
            agent any
            steps {
              withSonarQubeEnv('SonarServer1') {
                bat 'D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn sonar:sonar'
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

