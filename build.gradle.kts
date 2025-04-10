plugins {
    kotlin("jvm") version "2.0.21"
    id("com.typewritermc.module-plugin") version "1.1.3"
}

typewriter {
    namespace = "gamesofeducation"

    extension {
        name = "Skeleton"
        shortDescription = "A skeleton extension meant as an example"
        description = """
            A skeleton extension meant as an example that people can use as
            a base to build custom Typewriter extensions
                """.trimIndent()
        engineVersion = "0.8.0"
        channel = com.typewritermc.moduleplugin.ReleaseChannel.BETA

        paper()
//        paper {
//            // Optional - If you want to make sure a plugin is required to be installed to use this extension
//            dependency("<plugin name>")
//        }
    }
}

kotlin {
    jvmToolchain(21)
}