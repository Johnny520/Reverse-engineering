.class public Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForJarFile"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;
    }
.end annotation


# instance fields
.field private final file:Ljava/util/jar/JarFile;


# direct methods
.method public constructor <init>(Ljava/util/jar/JarFile;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$400(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;)Ljava/util/jar/JarFile;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getManifest()Ljava/util/jar/Manifest;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/jar/JarFile;->getManifest()Ljava/util/jar/Manifest;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/jar/JarFile;->entries()Ljava/util/Enumeration;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;Ljava/util/Enumeration;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public toClassFileLocator(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 0
    .param p1    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;-><init>(Ljava/util/jar/JarFile;)V

    .line 8
    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->file:Ljava/util/jar/JarFile;

    .line 12
    .line 13
    invoke-static {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/util/jar/JarFile;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
