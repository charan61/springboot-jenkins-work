pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
              // bat "rmdir  /s /q springboot-jenkins-work"
                bat "git clone https://github.com/charan61/springboot-jenkins-work.git"
                bat "mvn clean -f springboot-jenkins-work"
            }
        }
        stage('build') {
            steps {
                bat "mvn install -f springboot-jenkins-work"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f springboot-jenkins-work"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f springboot-jenkins-work"
            }
        }
    }
}