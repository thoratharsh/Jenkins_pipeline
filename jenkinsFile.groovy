pipeline { 
    agent any
    stages {
        stage('Build') { 
            steps { 
                echo 'build stage completed sucessfully' 
            }
        }
        stage('Test'){
            steps {
                echo 'Test stage completed successfully'
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy stage completed successfully"
            }
        }
    }
}