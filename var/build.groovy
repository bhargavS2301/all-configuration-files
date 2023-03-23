def call(){
  echo "build the package using with maven"
  sh 'mvn clean package'
}
