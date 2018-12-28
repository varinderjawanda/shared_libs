def url (repo) {
  def GIT_URL = "https://github.com/varinderjawanda/${repo}"
  echo "Cloning GIT URL: ${GIT_URL}"
  sh "git clone ${GIT_URL} && cd ${repo} && ls -lrt"
}
