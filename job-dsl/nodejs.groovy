job('NodeJS example') {
    scm {
        git('git@github.com:crivas/jenkins-course.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('crivas')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
