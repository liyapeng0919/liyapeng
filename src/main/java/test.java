public class test {

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ git log --pretty=oneline
    fatal: your current branch 'master' does not have any commits yet

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ git log --prety=oneline
    fatal: your current branch 'master' does not have any commits yet

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ git log --pretty=online
    fatal: invalid --pretty format: online

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ git log
    fatal: your current branch 'master' does not have any commits yet

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ pwd
/c/Users/liyapeng/Desktop

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ cd d
    bash: cd: d: No such file or directory

    liyapeng@DESKTOP-107LCDE MINGW64 ~/Desktop (master)
    $ cd /d

    liyapeng@DESKTOP-107LCDE MINGW64 /d
    $ cd Java/IDE/git/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ ls
    Git/  path/  test/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ pwd
/d/Java/IDE/git

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ ll
    total 8
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 14:42 Git/
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 15:30 path/
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 15:33 test/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ cd path/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git/path (master)
    $ git log
    commit 4ed2bc5c96f6e7f5df55a30ed5b09e2259c8f572 (HEAD -> master)
    Author: liyapeng <18310804291@163.com>
    Date:   Mon Apr 15 15:41:28 2019 +0800

    sdefewf

    commit 7ceb1e2624e674abc62b2cc5f835f5dcf11a44e2
    Author: liyapeng <18310804291@163.com>
    Date:   Mon Apr 15 15:12:48 2019 +0800

    sdfjsdfj

    commit 643033844b95118fdbf2da102725e9839429e26f
    Author: liyapeng <18310804291@163.com>
    Date:   Mon Apr 15 15:01:39 2019 +0800

    sdefewf

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git/path (master)
    $ cd ..

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ ls
    Git/  path/  test/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/git
    $ cd ..

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE
    $ ll
    total 12
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 15:33  git/
    drwxr-xr-x 1 liyapeng 197121 0 3月  31 21:22 'IntelliJ IDEA 2018.3.5'/
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 15:46  project/
    drwxr-xr-x 1 liyapeng 197121 0 4月  15 15:55  testMaven/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE
    $ cd testMaven/

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/testMaven (master)
    $ git log
    commit 7532066b51c444ec5d4132d6160298f5ce54c4d9 (HEAD -> master)
    Author: liyapeng <18310804291@163.com>
    Date:   Mon Apr 15 15:56:05 2019 +0800

            201915501111111

    commit cac632c8c5a9fca31de6b881c1ca3a900ba9b4bd
    Author: liyapeng <18310804291@163.com>
    Date:   Mon Apr 15 15:52:04 2019 +0800

            20191550

    liyapeng@DESKTOP-107LCDE MINGW64 /d/Java/IDE/testMaven (master)
    $

}
