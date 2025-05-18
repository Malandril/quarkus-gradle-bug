# Gradle cache bug reproducer

Run the following to reproduce the error, in which internal gradle dependencies are not refreshed.

```shell
gradle qB -Pversion=7.5.0 && find dep/ -iname '*.jar' -exec rm {} \; && gradle qB -Pversion=70.5.0
```
