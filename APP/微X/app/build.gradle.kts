import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.google.devtools.ksp)
	alias(libs.plugins.kotlin.compose)
	alias(libs.plugins.kotlin.serialization)
}

android {
	namespace = libs.versions.namespace.get()
	compileSdk {
		version = release(libs.versions.compileSdk.get().toInt()) {
			minorApiLevel = libs.versions.compileSdkMinor.get().toInt()
		}
	}
	ndkVersion = libs.versions.ndk.get()

	defaultConfig {
		applicationId = libs.versions.namespace.get()
		minSdk = libs.versions.minSdk.get().toInt()
		targetSdk = libs.versions.targetSdk.get().toInt()
		versionCode = 1
		versionName = "1"

		buildConfigField("String", "TAG", "\"WeChatXRemap\"")
		buildConfigField("long", "BUILD_TIMESTAMP", "${System.currentTimeMillis()}L")
	}

	splits {
		abi {
			reset()
			isEnable = true
			include(
				"arm64-v8a",
				"armeabi-v7a",
			)
			isUniversalApk = false
		}
	}

	sourceSets["main"].jniLibs.directories += "src/main/jniLibs"

	var foundKeystore = false

	@Suppress("LocalVariableName")
	signingConfigs {
		val _storeFile = System.getenv("WEKIT_KEYSTORE_FILE")
			?: runCatching { project.property("WEKIT_KEYSTORE_FILE") }.getOrNull() as? String?
		val _storePassword = System.getenv("WEKIT_KEYSTORE_PASSWORD")
			?: runCatching { project.property("WEKIT_KEYSTORE_PASSWORD") }.getOrNull() as? String?
		val _keyAlias = System.getenv("WEKIT_KEY_ALIAS")
			?: runCatching { project.property("WEKIT_KEY_ALIAS") }.getOrNull() as? String?
		val _keyPassword = System.getenv("WEKIT_KEY_PASSWORD")
			?: runCatching { project.property("WEKIT_KEY_PASSWORD") }.getOrNull() as? String?

		if (_storeFile != null && _storePassword != null && _keyAlias != null && _keyPassword != null) {
			create("release") {
				foundKeystore = true
				storeFile = file(_storeFile)
				storePassword = _storePassword
				keyAlias = _keyAlias
				keyPassword = _keyPassword

				enableV1Signing = false
				enableV2Signing = true
				enableV3Signing = true
				enableV4Signing = true
			}
		}
	}

	buildTypes {
		debug {
			signingConfig = signingConfigs.getByName(if (foundKeystore) "release" else "debug")
		}

		release {
			optimization.enable = true
			signingConfig = signingConfigs.getByName(if (foundKeystore) "release" else "debug")
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.toVersion(libs.versions.jdk.get().toInt())
		targetCompatibility = JavaVersion.toVersion(libs.versions.jdk.get().toInt())
	}

	packaging {
		resources.excludes += listOf(
			"kotlin/**",
			"**.bin",
			"kotlin-tooling-metadata.json",
			"META-INF/INDEX.LIST"
		)
		resources.merges += listOf(
			"META-INF/io.netty.versions.properties",
			"META-INF/xposed/*",
			"org/mozilla/javascript/**"
		)
	}

	@Suppress("UnstableApiUsage")
	androidResources {
		localeFilters += setOf("zh")
	}

	buildFeatures {
		resValues = false
		compose = true
		buildConfig = true
	}
}

tasks.withType<KotlinCompile> {
	compilerOptions {
		jvmTarget.set(JvmTarget.fromTarget(libs.versions.jdk.get()))
	}
}

dependencies {
	// some dependencies
}
