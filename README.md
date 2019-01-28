Kick-Off Mod
============

This project is a _minecraft forge mod_.
Created to get started with [Minecraft] modding (again) using the amazing [Forge][ForgeForum] modding tool.
This repository holds a cronological path of my study on how to properly create a minecraft
forge mod for the version _1.12.2_.

Here goes the journal...

Prime
-----

**1.** Learn how the [Gradle] build system works. Essentially, you need to know how to setup a java
application with Gradle using command line only.

**2.** This leads to learning the basics of the [Groovy] programming language which is essential for
writing Grandle configuration files.

**3.** Now it starts.. Download MinecraftForge MDK for version 1.12.2 on the [link][Forge1.12.2].

**4.** **Note:** The MinecraftForge [official documentation][ForgeDocs] provides a great way to get started with the
concepts of Forge API and mods in general. I really recommend you read it a little bit every day,
and refer to it often, as it is updated now and then.

**5.** Extract the following files from the Example Mod provided in the MDK:
```
    ├── gradle/wrapper/
    ├── src/main/
    ├── build.gradle
    ├── gradle.properties
    ├── gradlew
    └── gradlew.bat
```

These are the basic necessary files to start developing a forge mod. From this point on, we only
need to customize it to get on making whatever _awesome_ mod we want.

**6.** TODO: continue..


[Minecraft]: https://minecraft.net

[ForgeForum]: http://minecraftforge.net

[MinecraftForge]: https://files.minecraftforge.net/

[ForgeDocs]: https://mcforge.readthedocs.io/en/latest/

[Forge1.12.2]: https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html

[Gradle]: https://gradle.org

[Groovy]: http://groovy-lang.org/
