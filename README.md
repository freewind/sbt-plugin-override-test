sbt-plugin-override-test
==========================

There is a problem in this project:

```
cd plugin-test
./sbt helloMessage
```

You can see it output a `None`, but I have already defined in `plugin-test/build.sbt`:

```scala
helloMessage in ThisBuild := Some("hello from this build")
```

If I remove the `projects` definition from the file, i.e. remove:

```scala
lazy val root = project in file(".")

lazy val core = project in file("core")
```

It will output:

```
Some(hello from this build)
```

as I expected.

Where is wrong? Why my setting of `helloMessage` doesn't override the default value `None`?