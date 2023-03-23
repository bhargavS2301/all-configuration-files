def call(){
  echo "upload artfactory to s3 bucket"
  sh 'aws cp s3${WORKSPACE}/target/*.war s3://arts3up
}
