.class public Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;
.super Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/ClassFileLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForJarFile"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final RUNTIME_LOCATIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final close:Z
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->IGNORE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation
.end field

.field private final jarFile:Ljava/util/jar/JarFile;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "../lib/rt.jar"

    .line 2
    .line 3
    const-string v1, "../Classes/classes.jar"

    .line 4
    .line 5
    const-string v2, "lib/rt.jar"

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
    sput-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->RUNTIME_LOCATIONS:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/util/jar/JarFile;)V
    .locals 2

    .line 9
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;-><init>([ILjava/util/jar/JarFile;Z)V

    return-void
.end method

.method public constructor <init>([ILjava/util/jar/JarFile;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;-><init>([I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 5
    .line 6
    iput-boolean p3, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->close:Z

    .line 7
    .line 8
    return-void
.end method

.method public static of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 5

    .line 160
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;

    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    new-instance v2, Ljava/util/jar/JarFile;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, p0, v3, v4}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;ZI)V

    invoke-direct {v0, v1, v2, v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;-><init>([ILjava/util/jar/JarFile;Z)V

    return-object v0
.end method

.method public static of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 3

    .line 158
    new-instance v0, Ljava/util/jar/JarFile;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;ZI)V

    invoke-static {v0, p1, v2}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/util/jar/JarFile;Lnet/bytebuddy/ClassFileVersion;Z)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/util/jar/JarFile;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 1

    const/4 v0, 0x0

    .line 159
    invoke-static {p0, p1, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/util/jar/JarFile;Lnet/bytebuddy/ClassFileVersion;Z)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p0

    return-object p0
.end method

.method private static of(Ljava/util/jar/JarFile;Lnet/bytebuddy/ClassFileVersion;Z)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getJavaVersion()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;-><init>(Ljava/util/jar/JarFile;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/util/jar/JarFile;->getManifest()Ljava/util/jar/Manifest;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "Multi-Release"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    new-instance v0, Ljava/util/TreeSet;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/jar/JarFile;->entries()Ljava/util/Enumeration;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :catch_0
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/util/jar/JarEntry;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, ".class"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const-string v3, "META-INF/versions/"

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    const/16 v3, 0x2f

    .line 79
    .line 80
    const/16 v4, 0x12

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->indexOf(II)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v3, 0x7

    .line 95
    if-le v2, v3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getJavaVersion()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-gt v2, v3, :cond_1

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    new-array p1, p1, [I

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const/4 v2, 0x0

    .line 122
    :goto_1
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-ge v2, v3, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    sub-int/2addr v3, v2

    .line 133
    add-int/lit8 v3, v3, -0x1

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    aput v4, p1, v3

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    sget-object p1, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    .line 151
    .line 152
    :cond_4
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;

    .line 153
    .line 154
    invoke-direct {v0, p1, p0, p2}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;-><init>([ILjava/util/jar/JarFile;Z)V

    .line 155
    .line 156
    .line 157
    return-object v0
.end method

.method public static ofClassPath()Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 1

    .line 69
    const-string v0, "java.class.path"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->ofClassPath(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    return-object v0
.end method

.method public static ofClassPath(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 6

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
    sget-object v2, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    array-length v2, p0

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v2, :cond_2

    .line 25
    .line 26
    aget-object v4, p0, v3

    .line 27
    .line 28
    new-instance v5, Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-static {v5, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-static {v5, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance p0, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public static ofRuntimeJar()Lnet/bytebuddy/dynamic/ClassFileLocator;
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
    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->RUNTIME_LOCATIONS:Ljava/util/List;

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
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

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
    invoke-static {v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->of(Ljava/io/File;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_2
    const-string v1, "Runtime jar does not exist in "

    .line 55
    .line 56
    const-string v2, " for any of "

    .line 57
    .line 58
    invoke-static {v1, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->RUNTIME_LOCATIONS:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->close:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->close()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public doLocate(Ljava/lang/String;)[B
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/jar/JarFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/jar/JarFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :try_start_0
    sget-object p1, Lnet/bytebuddy/utility/StreamDrainer;->DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lnet/bytebuddy/utility/StreamDrainer;->drain(Ljava/io/InputStream;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForJarFile;->jarFile:Ljava/util/jar/JarFile;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method
