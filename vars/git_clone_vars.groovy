package org.jawanda
def url (repo) {
  echo "Cloning GIT URL: ${repo}"
  org.jawanda.checkOutFrom(repo)
}
