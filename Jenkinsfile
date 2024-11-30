pipeline {
    agent any

    tools{
        maven 'maven3'
        jdk 'jdk17'
    }

    stages {
        stage('Compile') {
            steps {
               sh "mvn compile"
            }
        }
        stage('Test') {
            steps {
             sh "mvn compile"
            }
        }
        stage('Package') {
            steps {
            sh "mvn package"
            }
        }
    }
}
