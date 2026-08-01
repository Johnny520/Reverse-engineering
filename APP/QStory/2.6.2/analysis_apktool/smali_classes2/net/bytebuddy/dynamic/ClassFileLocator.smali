.class public interface abstract Lnet/bytebuddy/dynamic/ClassFileLocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$Filtering;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$PackageDiscriminating;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForUrl;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForModule;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$Simple;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
    }
.end annotation


# static fields
.field public static final CLASS_FILE_EXTENSION:Ljava/lang/String; = ".class"

.field public static final META_INF_VERSIONS:Ljava/lang/String; = "META-INF/versions/"


# virtual methods
.method public abstract locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
.end method
