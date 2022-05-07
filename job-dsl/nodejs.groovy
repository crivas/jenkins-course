job('NodeJS example') {
    scm {
        git {
            remote {
                github('crivas/jenkins-course', 'ssh')
                credentials('github')
            }            
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
