package org.jawanda
class CheckOutFrom {
  string repo
  
  CheckOutFrom (repo)
    this.repo = repo
  println "from res - Cloning GIT URL: ${repo}"
}
def clone = [repo] as CheckOutFrom
return this
    //git url: "git@github.com:varinderjawanda/${repo}"
