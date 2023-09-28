# jenkins-shared-library-May-2023

Jenkins Shared Library is the way of having a common pipeline code in the version control system which is git that can be called by any number of pipelines jobs just by referring to it in the pipeline code using @Library("<library_name>")_ 

Create .groovy file and put shared library code here 
    - Make sure to remember and provide a meaningful name for groovy 
    - Groovy filename is used as the function call 

Integrated it with Jenkins 
    - Manage Jenkins > System > Global Pipeline Libraries
        Name - Can give any name, we can call it in any job using this @Library("<name>")_
        Defaulr Version - git branch in which we keep our shared library 
        Retrieval method - Modren SCM 
        Source Code Management - Git

To call a shared library funciton / groovy script 
    - use the name of the script in the pipeline job (Jenkinsfile)
        example: 
                gitCheckout('main',
                            'itd_jenkins', 
                            'https://github.com/jaintpharsha/Devops-ITD-May-2023.git')