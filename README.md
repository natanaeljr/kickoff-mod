Kick-Off Mod
============

This project is a _minecraft forge mod_.
Created to get started with [Minecraft] modding (again) using the amazing [Forge][ForgeForum] modding tool.
This repository holds a chronological path of my study on how to properly create a minecraft
forge mod for the version _1.12.2_.

Here goes the journal...

Primer
-----

**1.** Learn how the [Gradle] build system works. Essentially, you need to know how to setup a java
application with Gradle using command line only.

**2.** This leads to learning the basics of the [Groovy] programming language which is essential for
writing Grandle configuration files.

**3.** Now it starts.. Download MinecraftForge MDK for version 1.12.2 on the [link][Forge1.12.2].

**4.** **Note:** The MinecraftForge [official documentation][ForgeDocs] provides a great way to get started with
concepts of the Forge API and mods in general. I really recommend you read it a little bit every day,
and refer to it often, as it is updated now and then.

**5.** Extract the following files from the Example Mod provided in the MDK to your new mod directory:
```
    ├── gradle/wrapper/         - Project's specifications of Gradle version
    ├── src/main/               - Mod source code in Java, resources and tests
    ├── build.gradle            - Gradle build script
    ├── gradle.properties       - Gradle configuration properties
    ├── gradlew                 - Gradle wrapper file for UNIX (use this to execute commands)
    └── gradlew.bat             - Gradle wrapper file for Windows (or this one)
```

And run the following command inside the directory to get the workspace ready with all resources:
  - ``./gradlew setupDecompWorkspace``: This will download a bunch of artifacts from the internet
needed to decompile and build Minecraft and forge.

These are the basic necessary files to start developing a forge mod. From this point on, we only
need to customize it to get on making whatever _awesome_ mod we want.

**6.** Adjust the initial configuration files:

_build.gradle_:
```groovy
version = "0.1-alpha"
group = "natanaeljr.kickoff"
archivesBaseName = "kickoff"
```
_src/main/resources/mcmod.info_:
```json
[{
  "modid": "kickoff",
  "name": "Kick-Off",
  "description": "Getting started with Forge Modding.",
  "version": "${version}",
  "mcversion": "${mcversion}",
  "url": "github.com/natanaeljr/kickoff-mod",
  "updateUrl": "",
  "authorList": ["Natanael J. Rabello"],
  "credits": "The Forge and FML guys, for making this modding infrastructure",
  "logoFile": "",
  "screenshots": [],
  "dependencies": []
}]
```

**7.** Now we are able to get onto preparing our mod entrance class. See this
[commit](https://github.com/natanaeljr/kickoff-mod/commit/a9a0dafba3a957b64291b48ec48f5255c4ec428c).

**8.** Add our own first custom block to minecraft:
[The BOX block](https://github.com/natanaeljr/kickoff-mod/commit/273aaddd9afc349afaf6e93ea0c42b03290f82fb).

**9.** Properly register the block and its item version:
[Register BOX](https://github.com/natanaeljr/kickoff-mod/commit/10aaf228f12aa7b29a6c92b13f27594e9a9d07fc).

**10.** Add the models and cardboard texture for the bOX block:
[BOX Model](https://github.com/natanaeljr/kickoff-mod/commit/b17f56127475d7db4ff63dd36e918c85c806de1c).

**11.** Set different textures to each of the BOX block's faces:
[[JSON model](https://github.com/natanaeljr/kickoff-mod/commit/e38e93bb8afa14ec609b1b3b018b1d62e4a73ea2)]
[[Box block class](https://github.com/natanaeljr/kickoff-mod/commit/ce886acfe8c32d54fee7e783af87a6fb065d8298)]
[[Facing property](https://github.com/natanaeljr/kickoff-mod/commit/56848557d7e466737130302ae51540bc5b875b6b)]

**12.** BOX block name translation:
[localization](https://github.com/natanaeljr/KIckoff-mod/commit/40f848bf616db131ec029846afe995c129f0347f)


[Minecraft]: https://minecraft.net

[ForgeForum]: http://minecraftforge.net

[MinecraftForge]: https://files.minecraftforge.net/

[ForgeDocs]: https://mcforge.readthedocs.io/en/latest/

[Forge1.12.2]: https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html

[Gradle]: https://gradle.org

[Groovy]: http://groovy-lang.org/
