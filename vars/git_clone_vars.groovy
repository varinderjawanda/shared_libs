def url (repo) {
  def GIT_URL = "https://github.com/varinderjawanda/${repo}"
  echo "Cloning GIT URL: ${GIT_URL}"
  sh "git clione ${GIT_URL} && ls -lrt"
}
