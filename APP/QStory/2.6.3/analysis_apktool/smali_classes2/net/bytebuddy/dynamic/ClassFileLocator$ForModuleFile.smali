.class public Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/dynamic/ClassFileLocator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/ClassFileLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForModuleFile"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final BOOT_LOCATIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final JMOD_FILE_EXTENSION:Ljava/lang/String; = ".jmod"


# instance fields
.field private final zipFile:Ljava/util/zip/ZipFile;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "../jmods"

    .line 2
    .line 3
    const-string v1, "modules"

    .line 4
    .line 5
    const-string v2, "jmods"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->BOOT_LOCATIONS:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/util/zip/ZipFile;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 5
    .line 6
    return-void
.end method

.method public static of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;

    .line 2
    .line 3
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;-><init>(Ljava/util/zip/ZipFile;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static ofBootPath()Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 5

    .line 1
    const-string v0, "java.home"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x5c

    .line 8
    .line 9
    const/16 v2, 0x2f

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->BOOT_LOCATIONS:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v4, Ljava/io/File;

    .line 35
    .line 36
    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v4, v3

    .line 47
    :goto_0
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-static {v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->ofBootPath(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_2
    const-string v1, "Boot modules do not exist in "

    .line 55
    .line 56
    const-string v2, " for any of "

    .line 57
    .line 58
    invoke-static {v1, v0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->BOOT_LOCATIONS:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method

.method public static ofBootPath(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 6

    .line 68
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_0

    .line 69
    sget-object p0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    return-object p0

    .line 70
    :cond_0
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    move-result-object v0

    .line 71
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, p0, v3

    .line 73
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 74
    invoke-static {v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 76
    invoke-static {v4, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 77
    :cond_3
    new-instance p0, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    invoke-direct {p0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static ofModulePath()Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 1

    .line 141
    const-string v0, "jdk.module.path"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 142
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    return-object v0

    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->ofModulePath(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    return-object v0
.end method

.method public static ofModulePath(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 1

    .line 140
    const-string v0, "user.dir"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->ofModulePath(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p0

    return-object p0
.end method

.method public static ofModulePath(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 11

    .line 1
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "path.separator"

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    invoke-static {v2, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    array-length v2, p0

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v2, :cond_6

    .line 30
    .line 31
    aget-object v5, p0, v4

    .line 32
    .line 33
    new-instance v6, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v6, p1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const-string v7, ".jmod"

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_5

    .line 51
    .line 52
    array-length v6, v5

    .line 53
    move v8, v3

    .line 54
    :goto_1
    if-ge v8, v6, :cond_5

    .line 55
    .line 56
    aget-object v9, v5, v8

    .line 57
    .line 58
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_0

    .line 63
    .line 64
    invoke-static {v9, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_0
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_2

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-virtual {v10, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_1

    .line 87
    .line 88
    invoke-static {v9}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    goto :goto_2

    .line 93
    :cond_1
    invoke-static {v9, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    :goto_2
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_2
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    invoke-static {v6}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    goto :goto_4

    .line 124
    :cond_4
    invoke-static {v6}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_4
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_6
    new-instance p0, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 135
    .line 136
    invoke-direct {p0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "classes/"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    const/16 v3, 0x2f

    .line 13
    .line 14
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ".class"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    new-instance p0, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForModuleFile;->zipFile:Ljava/util/zip/ZipFile;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :try_start_0
    new-instance p1, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;

    .line 49
    .line 50
    sget-object v0, Lnet/bytebuddy/utility/StreamDrainer;->DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/StreamDrainer;->drain(Ljava/io/InputStream;)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {p1, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 65
    .line 66
    .line 67
    throw p1
.end method
