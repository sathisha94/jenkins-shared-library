def call(String git_branch = 'main', String git_credentials = null, String git_url = null) {    
        echo "This is gitCheckout.groovy"
        checkout([$class: 'GitSCM', 
                  branches: [[name: "*/${GIT_BRANCH}"]], 
                  userRemoteConfigs: [[credentialsId: "${GIT_CREDS}", url: "${GIT_URL}"]]
                ])     
}