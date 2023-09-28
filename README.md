# jenkins-shared-library-May-2023

Create .groovy file and put shared library code here 
    - Make sure to remember and provide a meaningful name for groovy 
    - Groovy filename is used as the function call 

Integrated it with Jenkins 
    - Manage Jenkins > System > Global Pipeline Libraries
        Name - Can give any name, we can call it in any job using this @Library("<name>")_
        Defaulr Version - git branch in which we keep our shared library 
        Retrieval method - Modren SCM 
        Source Code Management - Git


docker_build_may_class