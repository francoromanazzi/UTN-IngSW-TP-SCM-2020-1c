pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }

    stage('Test') {
      steps {
        sh 'ls'
      }
    }

    stage('Analyze') {
      parallel {
        stage('Sonarqube') {
          steps {
            sh './gradlew sonarqube -Dsonar.host.url=http://localhost:9000'
          }
        }

        stage('Jacoco') {
          steps {
            sh 'ls'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        sh 'ls'
      }
    }

  }
}