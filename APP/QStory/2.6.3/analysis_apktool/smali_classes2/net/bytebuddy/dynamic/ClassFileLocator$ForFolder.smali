.class public Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;
.super Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/ClassFileLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForFolder"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final folder:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;-><init>([ILjava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>([ILjava/io/File;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;-><init>([I)V

    .line 8
    iput-object p2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->folder:Ljava/io/File;

    return-void
.end method

.method public static of(Ljava/io/File;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 6

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
    new-instance p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;

    .line 10
    .line 11
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    .line 12
    .line 13
    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;-><init>([ILjava/io/File;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    const-string v1, "META-INF/MANIFEST.MF"

    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance v1, Ljava/io/FileInputStream;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    new-instance v0, Ljava/util/jar/Manifest;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v3, "Multi-Release"

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_1
    move v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_5

    .line 66
    .line 67
    new-instance v0, Ljava/io/File;

    .line 68
    .line 69
    const-string v1, "META-INF/versions/"

    .line 70
    .line 71
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    new-instance v1, Ljava/util/TreeSet;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    .line 83
    .line 84
    .line 85
    move v3, v2

    .line 86
    :goto_1
    array-length v4, v0

    .line 87
    if-ge v3, v4, :cond_3

    .line 88
    .line 89
    :try_start_1
    aget-object v4, v0, v3

    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/4 v5, 0x7

    .line 100
    if-le v4, v5, :cond_2

    .line 101
    .line 102
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getJavaVersion()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-gt v4, v5, :cond_2

    .line 107
    .line 108
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v1, v4}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    .line 114
    .line 115
    :catch_0
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    new-array p1, p1, [I

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :goto_2
    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-ge v2, v3, :cond_6

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sub-int/2addr v3, v2

    .line 139
    add-int/lit8 v3, v3, -0x1

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    aput v4, p1, v3

    .line 152
    .line 153
    add-int/lit8 v2, v2, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    sget-object p1, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    sget-object p1, Lnet/bytebuddy/dynamic/ClassFileLocator$MultiReleaseAware;->NO_MULTI_RELEASE:[I

    .line 160
    .line 161
    :cond_6
    :goto_3
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;

    .line 162
    .line 163
    invoke-direct {v0, p1, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;-><init>([ILjava/io/File;)V

    .line 164
    .line 165
    .line 166
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public doLocate(Ljava/lang/String;)[B
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->folder:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    new-instance p0, Ljava/io/FileInputStream;

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    sget-object p1, Lnet/bytebuddy/utility/StreamDrainer;->DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lnet/bytebuddy/utility/StreamDrainer;->drain(Ljava/io/InputStream;)[B

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return-object p0
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->folder:Ljava/io/File;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->folder:Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForFolder;->folder:Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method
