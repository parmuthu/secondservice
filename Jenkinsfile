pipeline {
	agent any

	

	tools {
		jdk 'jdk17'
	}

	stages {

		stage('Build'){
			steps {
<<<<<<< HEAD
				bat "D:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn clean install -DskipTests"
=======
				bat "D:\\apache-maven-3.6.3-bin\\apache-maven-3.6.3\\bin\\mvn clean install -DskipTests"
>>>>>>> e0139bbf88b9c4e8c1f607465ed475a7f33a1725
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

