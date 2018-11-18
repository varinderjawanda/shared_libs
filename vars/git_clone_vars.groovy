package org.jawanda
def url (repo) {
  echo "Cloning GIT URL: ${repo}"
  checkOutFrom(repo)
}
