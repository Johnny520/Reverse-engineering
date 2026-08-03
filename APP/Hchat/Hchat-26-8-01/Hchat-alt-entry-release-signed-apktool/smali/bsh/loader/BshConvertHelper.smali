.class public Lbsh/loader/BshConvertHelper;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private appendClassToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/lang/String;[B)V
    .locals 1

    .line 1
    new-instance v0, Lk4/b;

    .line 2
    .line 3
    invoke-direct {v0, p5, p6}, Lk4/b;-><init>(Ljava/lang/String;[B)V

    .line 4
    .line 5
    .line 6
    sget-object p5, Lk4/d;->a:Lk4/d;

    .line 7
    .line 8
    iput-object p5, v0, Lk4/b;->l:Lk4/d;

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1, v0, p2, p3, p4}, Loh/h;->Y(Lm4/b;Lk4/b;Lo4/a;Ln4/a;Lr4/p;)Lr4/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    invoke-virtual {p4, p1}, Lr4/p;->a(Lr4/k;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p1

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string p3, "...while processing "

    .line 22
    .line 23
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p3, v0, Lk4/b;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2, p1}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    throw p1
.end method

.method private appendJarToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/io/InputStream;)I
    .locals 10

    .line 1
    new-instance v1, Ljava/util/zip/ZipInputStream;

    .line 2
    .line 3
    invoke-direct {v1, p5}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    const/4 p5, 0x0

    .line 7
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    const-string v0, ".class"

    .line 25
    .line 26
    invoke-virtual {v8, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const-string v0, "META-INF/"

    .line 33
    .line 34
    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, Lbsh/loader/DataUtil;->readAllBytes(Ljava/io/InputStream;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    move-object v3, p0

    .line 45
    move-object v4, p1

    .line 46
    move-object v5, p2

    .line 47
    move-object v6, p3

    .line 48
    move-object v7, p4

    .line 49
    invoke-direct/range {v3 .. v9}, Lbsh/loader/BshConvertHelper;->appendClassToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    add-int/lit8 p5, p5, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    move-object v4, p1

    .line 59
    move-object v5, p2

    .line 60
    move-object v6, p3

    .line 61
    move-object v7, p4

    .line 62
    :goto_1
    move-object p1, v4

    .line 63
    move-object p2, v5

    .line 64
    move-object p3, v6

    .line 65
    move-object p4, v7

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->close()V

    .line 68
    .line 69
    .line 70
    return p5

    .line 71
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move-object p2, v0

    .line 77
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :goto_3
    throw p1
.end method

.method private convertAarToDex(Ljava/lang/String;)[B
    .locals 8

    .line 1
    new-instance v4, Ln4/a;

    .line 2
    .line 3
    invoke-direct {v4}, Ln4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lo4/a;

    .line 7
    .line 8
    invoke-direct {v3}, Lo4/a;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lm4/b;

    .line 12
    .line 13
    invoke-direct {v2}, Lm4/b;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v5, Lr4/p;

    .line 17
    .line 18
    invoke-direct {v5, v4}, Lr4/p;-><init>(Ln4/a;)V

    .line 19
    .line 20
    .line 21
    new-instance v7, Ljava/util/zip/ZipInputStream;

    .line 22
    .line 23
    new-instance v0, Ljava/io/FileInputStream;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v7, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v7}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v6, "classes.jar"

    .line 50
    .line 51
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    const-string v6, "libs/"

    .line 58
    .line 59
    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_0

    .line 64
    .line 65
    const-string v6, ".jar"

    .line 66
    .line 67
    invoke-virtual {v1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    :goto_1
    invoke-static {v7}, Lbsh/loader/DataUtil;->readAllBytes(Ljava/io/InputStream;)[B

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v6, Ljava/io/ByteArrayInputStream;

    .line 82
    .line 83
    invoke-direct {v6, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 84
    .line 85
    .line 86
    move-object v1, p0

    .line 87
    invoke-direct/range {v1 .. v6}, Lbsh/loader/BshConvertHelper;->appendJarToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/io/InputStream;)I

    .line 88
    .line 89
    .line 90
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    add-int/2addr v0, v6

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {v7}, Ljava/util/zip/ZipInputStream;->close()V

    .line 94
    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 101
    .line 102
    .line 103
    :try_start_1
    invoke-virtual {v5, p1}, Lr4/p;->d(Ljava/io/ByteArrayOutputStream;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 111
    .line 112
    .line 113
    return-object v0

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object v1, v0

    .line 116
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_2
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    throw v1

    .line 126
    :cond_4
    const-string v0, "No class file found in aar "

    .line 127
    .line 128
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x0

    .line 136
    return-object p1

    .line 137
    :goto_3
    :try_start_3
    invoke-virtual {v7}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catchall_3
    move-exception v0

    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :goto_4
    throw p1
.end method

.method private convertClassToDex(Ljava/lang/String;[B)[B
    .locals 8

    .line 1
    new-instance v4, Ln4/a;

    .line 2
    .line 3
    invoke-direct {v4}, Ln4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lo4/a;

    .line 7
    .line 8
    invoke-direct {v3}, Lo4/a;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lm4/b;

    .line 12
    .line 13
    invoke-direct {v2}, Lm4/b;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x2e

    .line 17
    .line 18
    const/16 v1, 0x2f

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, ".class"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 33
    .line 34
    .line 35
    :try_start_0
    new-instance v5, Lr4/p;

    .line 36
    .line 37
    invoke-direct {v5, v4}, Lr4/p;-><init>(Ln4/a;)V

    .line 38
    .line 39
    .line 40
    move-object v1, p0

    .line 41
    move-object v7, p2

    .line 42
    invoke-direct/range {v1 .. v7}, Lbsh/loader/BshConvertHelper;->appendClassToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/lang/String;[B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, p1}, Lr4/p;->d(Ljava/io/ByteArrayOutputStream;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 49
    .line 50
    .line 51
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p2, v0

    .line 58
    :try_start_1
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    throw p2
.end method

.method private convertJarToDex(Ljava/lang/String;)[B
    .locals 7

    .line 1
    new-instance v4, Ln4/a;

    .line 2
    .line 3
    invoke-direct {v4}, Ln4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lo4/a;

    .line 7
    .line 8
    invoke-direct {v3}, Lo4/a;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lm4/b;

    .line 12
    .line 13
    invoke-direct {v2}, Lm4/b;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v5, Lr4/p;

    .line 17
    .line 18
    invoke-direct {v5, v4}, Lr4/p;-><init>(Ln4/a;)V

    .line 19
    .line 20
    .line 21
    new-instance v6, Ljava/io/FileInputStream;

    .line 22
    .line 23
    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object v1, p0

    .line 27
    :try_start_0
    invoke-direct/range {v1 .. v6}, Lbsh/loader/BshConvertHelper;->appendJarToDex(Lm4/b;Lo4/a;Ln4/a;Lr4/p;Ljava/io/InputStream;)I

    .line 28
    .line 29
    .line 30
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 32
    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v5, p1}, Lr4/p;->d(Ljava/io/ByteArrayOutputStream;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object v1, v0

    .line 54
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_1
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    throw v1

    .line 64
    :cond_0
    const-string v0, "No class file found in jar "

    .line 65
    .line 66
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    return-object p1

    .line 75
    :catchall_2
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_3
    move-exception v0

    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    throw p1
.end method


# virtual methods
.method public convertAarToLoader(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/loader/BshConvertHelper;->convertAarToDex(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lbsh/loader/BshConvertHelper;->createCustomLoader([BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public convertClassToLoader(Ljava/lang/String;[BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbsh/loader/BshConvertHelper;->convertClassToDex(Ljava/lang/String;[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p3}, Lbsh/loader/BshConvertHelper;->createCustomLoader([BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public convertDexToLoader(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Ljava/nio/file/Files;->readAllBytes(Ljava/nio/file/Path;)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1, p2}, Lbsh/loader/BshConvertHelper;->createCustomLoader([BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public convertJarToLoader(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/loader/BshConvertHelper;->convertJarToDex(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lbsh/loader/BshConvertHelper;->createCustomLoader([BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public createCustomLoader([BLjava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ldalvik/system/InMemoryDexClassLoader;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Ldalvik/system/InMemoryDexClassLoader;-><init>(Ljava/nio/ByteBuffer;Ljava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
