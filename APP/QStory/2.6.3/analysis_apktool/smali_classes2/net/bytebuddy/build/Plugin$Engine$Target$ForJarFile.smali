.class public Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForJarFile"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final file:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;->file:Ljava/io/File;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;->file:Ljava/io/File;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;->file:Ljava/io/File;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;->file:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/File;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public write(Ljava/util/jar/Manifest;)Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;
    .locals 2
    .param p1    # Ljava/util/jar/Manifest;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;->file:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    new-instance p0, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink$ForJarOutputStream;

    .line 11
    .line 12
    new-instance p1, Ljava/util/jar/JarOutputStream;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink$ForJarOutputStream;-><init>(Ljava/util/jar/JarOutputStream;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :catch_2
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance p0, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink$ForJarOutputStream;

    .line 28
    .line 29
    new-instance v1, Ljava/util/jar/JarOutputStream;

    .line 30
    .line 31
    invoke-direct {v1, v0, p1}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/jar/Manifest;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink$ForJarOutputStream;-><init>(Ljava/util/jar/JarOutputStream;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :goto_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :goto_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :goto_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 47
    .line 48
    .line 49
    throw p0
.end method
