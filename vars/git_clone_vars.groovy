//import org.jawanda*
def url (repo) {
  echo "from vars - Cloning GIT URL: ${repo}"
  def clone = git_clone.CheckOutFrom(repo)
}
