package org.jawanda
def checkOutFrom(repo) {
  git url: "git@github.com:varinderjawanda/${repo}"
}
return this
