//import org.jawanda*
def url (repo) {
  echo "from vars - Cloning GIT URL: ${repo}"
    git_clone.CheckOutFrom(${repo})
}
