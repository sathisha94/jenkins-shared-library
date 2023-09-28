def call(String dockerfile = 'Dockerfile', 
         String image_name = null, 
         String image_tag = null,
         String registryURL = null,
         String registryCredentials = null) {    
        echo "This is dockerBuild.groovy"
        def dockerImage = docker.build("${image_name}:${image_tag}", "-f ${} .")
        docker.withRegistry("${registryURL}", "${registryCredentials}") {
            dockerImage.push()
        }    
        sh 'docker images'                   
}