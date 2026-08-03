.class public abstract Lzb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lsf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwb/pp;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lwb/pp;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lsf/i;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lzb/b;->a:Lsf/i;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, "_"

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    new-instance p0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_1
    const-string p1, "[\\\\/:*?\"<>|\\r\\n]+"

    .line 47
    .line 48
    invoke-static {p1, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const/16 p1, 0x2e

    .line 53
    .line 54
    const-string v1, ""

    .line 55
    .line 56
    invoke-static {p0, p1, v1}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-static {p0, v0, p2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :cond_2
    return-object p0
.end method

.method public static b([BILm8/c;)V
    .locals 11

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_6

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-static {v0, p1}, Lr9/e0;->r0(II)Llg/d;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-static {v1, v2}, Lr9/e0;->n0(Llg/d;I)Llg/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v3, v1, Llg/b;->g:I

    .line 17
    .line 18
    iget v4, v1, Llg/b;->h:I

    .line 19
    .line 20
    iget v1, v1, Llg/b;->i:I

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    if-le v3, v4, :cond_2

    .line 25
    .line 26
    :cond_1
    if-gez v1, :cond_9

    .line 27
    .line 28
    if-gt v4, v3, :cond_9

    .line 29
    .line 30
    :cond_2
    :goto_0
    iget v5, p2, Lm8/c;->a:I

    .line 31
    .line 32
    iget-object v6, p2, Lm8/c;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, [Ljava/math/BigInteger;

    .line 35
    .line 36
    aget-object v6, v6, v5

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {p2}, Lm8/c;->n()V

    .line 41
    .line 42
    .line 43
    const/16 v5, 0xff

    .line 44
    .line 45
    iput v5, p2, Lm8/c;->a:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    add-int/lit8 v5, v5, -0x1

    .line 49
    .line 50
    iput v5, p2, Lm8/c;->a:I

    .line 51
    .line 52
    :goto_1
    new-array v5, v2, [B

    .line 53
    .line 54
    move v7, v0

    .line 55
    :goto_2
    if-lt v7, v2, :cond_6

    .line 56
    .line 57
    sub-int v6, p1, v3

    .line 58
    .line 59
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    move v6, v0

    .line 64
    :goto_3
    if-lt v6, v8, :cond_5

    .line 65
    .line 66
    if-ne v3, v4, :cond_4

    .line 67
    .line 68
    goto :goto_6

    .line 69
    :cond_4
    add-int/2addr v3, v1

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    add-int v7, v3, v6

    .line 72
    .line 73
    aget-byte v9, p0, v7

    .line 74
    .line 75
    aget-byte v10, v5, v6

    .line 76
    .line 77
    xor-int/2addr v9, v10

    .line 78
    int-to-byte v9, v9

    .line 79
    aput-byte v9, p0, v7

    .line 80
    .line 81
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_6
    mul-int/lit8 v8, v7, 0x8

    .line 85
    .line 86
    invoke-virtual {v6, v8}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const-wide/16 v9, 0xff

    .line 91
    .line 92
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    rsub-int/lit8 v9, v7, 0x7

    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/math/BigInteger;->toByteArray()[B

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    array-length v10, v8

    .line 110
    if-nez v10, :cond_7

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    goto :goto_4

    .line 114
    :cond_7
    array-length v10, v8

    .line 115
    add-int/lit8 v10, v10, -0x1

    .line 116
    .line 117
    aget-byte v8, v8, v10

    .line 118
    .line 119
    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    :goto_4
    if-eqz v8, :cond_8

    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/Byte;->byteValue()B

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    move v8, v0

    .line 131
    :goto_5
    aput-byte v8, v5, v9

    .line 132
    .line 133
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_9
    :goto_6
    return-void
.end method

.method public static c(Ljava/io/File;Ljava/io/File;Ljava/math/BigInteger;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    new-instance p1, Lm8/c;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Lm8/c;-><init>(Ljava/math/BigInteger;)V

    .line 14
    .line 15
    .line 16
    const/high16 p2, 0x2000000

    .line 17
    .line 18
    new-array p2, p2, [B

    .line 19
    .line 20
    const/high16 v1, 0x20000

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p2}, Ljava/io/FileInputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    const/4 v3, -0x1

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    if-lez v1, :cond_1

    .line 39
    .line 40
    :try_start_3
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {p2, v3, p1}, Lzb/b;->b([BILm8/c;)V

    .line 45
    .line 46
    .line 47
    sub-int/2addr v1, v3

    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_1
    const/4 v3, 0x0

    .line 52
    invoke-virtual {p0, p2, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 57
    :catchall_2
    move-exception p2

    .line 58
    :try_start_5
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 62
    :goto_3
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 63
    :catchall_3
    move-exception p1

    .line 64
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_1
    new-instance v1, Ljava/io/File;

    .line 20
    .line 21
    const-string v2, "Finder"

    .line 22
    .line 23
    invoke-static {p0, v2}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v2, "finder_video"

    .line 28
    .line 29
    const-string v3, "mp4"

    .line 30
    .line 31
    invoke-static {p3, v2, v3}, Lzb/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-direct {v1, p0, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Ljava/io/File;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, ".tmp"

    .line 49
    .line 50
    invoke-static {v2, v3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {p0, p3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p3, 0x0

    .line 58
    :try_start_0
    invoke-static {p0, p1, p3}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    new-instance p1, Ljava/math/BigInteger;

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, p1}, Lzb/b;->c(Ljava/io/File;Ljava/io/File;Ljava/math/BigInteger;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    move-object p1, v1

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object p1, v0

    .line 80
    goto :goto_1

    .line 81
    :goto_0
    new-instance p2, Lsf/f;

    .line 82
    .line 83
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p1, p2

    .line 87
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string p3, "[Hchat:MediaDownloader] \u89c6\u9891\u53f7\u89c6\u9891\u4e0b\u8f7d\u89e3\u5bc6\u5931\u8d25: "

    .line 104
    .line 105
    invoke-static {p3, p0, p2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    instance-of p0, p1, Lsf/f;

    .line 109
    .line 110
    if-eqz p0, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    move-object v0, p1

    .line 114
    :goto_2
    check-cast v0, Ljava/io/File;

    .line 115
    .line 116
    :cond_5
    :goto_3
    return-object v0
.end method

.method public static final e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    const-string v1, "Image"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "image"

    .line 22
    .line 23
    invoke-static {p1}, Lzb/b;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p2, v1, v2}, Lzb/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {v0, p0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    invoke-static {v0, p1, p0}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_6

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v4, 0x0

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v2, v4

    .line 46
    :goto_1
    if-eqz v2, :cond_1

    .line 47
    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {v2}, Lzb/b;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v5, "_"

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, "."

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :cond_4
    :goto_2
    invoke-static {p0, v2, v4}, Lzb/b;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    return-object v0
.end method

.method public static g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    .line 23
    .line 24
    new-instance v3, Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    const-string v4, "."

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    new-instance v8, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v4, ".download."

    .line 53
    .line 54
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v4, ".tmp"

    .line 61
    .line 62
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move-object v3, p0

    .line 74
    :goto_2
    new-instance v2, Lokhttp3/Request$Builder;

    .line 75
    .line 76
    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object v2, Lzb/b;->a:Lsf/i;

    .line 92
    .line 93
    invoke-virtual {v2}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lokhttp3/OkHttpClient;

    .line 98
    .line 99
    invoke-virtual {v2, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :try_start_2
    invoke-virtual {p1}, Lokhttp3/Response;->isSuccessful()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_3

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    .line 116
    :goto_3
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    .line 118
    .line 119
    move-object p1, v1

    .line 120
    goto :goto_9

    .line 121
    :catchall_1
    move-exception v2

    .line 122
    goto :goto_7

    .line 123
    :cond_3
    :try_start_4
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    new-instance v4, Ljava/io/BufferedInputStream;

    .line 130
    .line 131
    invoke-virtual {v2}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {v4, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    .line 137
    .line 138
    :try_start_5
    new-instance v2, Ljava/io/FileOutputStream;

    .line 139
    .line 140
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 141
    .line 142
    .line 143
    const/16 v5, 0x2000

    .line 144
    .line 145
    :try_start_6
    new-array v5, v5, [B

    .line 146
    .line 147
    :goto_4
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-gtz v6, :cond_5

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 154
    .line 155
    .line 156
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 157
    .line 158
    .line 159
    :try_start_8
    invoke-virtual {v4}, Ljava/io/BufferedInputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 160
    .line 161
    .line 162
    :try_start_9
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 163
    .line 164
    .line 165
    if-eqz p2, :cond_4

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    const/4 v3, 0x1

    .line 176
    new-array v3, v3, [Ljava/nio/file/CopyOption;

    .line 177
    .line 178
    sget-object v4, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 179
    .line 180
    aput-object v4, v3, v0

    .line 181
    .line 182
    invoke-static {p1, v2, v3}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 183
    .line 184
    .line 185
    :cond_4
    move-object p1, p0

    .line 186
    goto :goto_9

    .line 187
    :catchall_2
    move-exception v2

    .line 188
    goto :goto_6

    .line 189
    :catchall_3
    move-exception v3

    .line 190
    goto :goto_5

    .line 191
    :cond_5
    :try_start_a
    invoke-virtual {v2, v5, v0, v6}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :goto_5
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 196
    :catchall_4
    move-exception v5

    .line 197
    :try_start_c
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    throw v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 201
    :goto_6
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 202
    :catchall_5
    move-exception v3

    .line 203
    :try_start_e
    invoke-static {v4, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    throw v3

    .line 207
    :cond_6
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :goto_7
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 212
    :catchall_6
    move-exception v3

    .line 213
    :try_start_10
    invoke-static {p1, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 217
    :goto_8
    new-instance v2, Lsf/f;

    .line 218
    .line 219
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    move-object p1, v2

    .line 223
    :goto_9
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    if-eqz v2, :cond_8

    .line 228
    .line 229
    if-eqz p2, :cond_7

    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    if-eqz p2, :cond_7

    .line 236
    .line 237
    new-instance v3, Lzb/a;

    .line 238
    .line 239
    invoke-direct {v3, p0}, Lzb/a;-><init>(Ljava/io/File;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, v3}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    if-eqz p0, :cond_7

    .line 247
    .line 248
    array-length p2, p0

    .line 249
    :goto_a
    if-ge v0, p2, :cond_7

    .line 250
    .line 251
    aget-object v3, p0, v0

    .line 252
    .line 253
    :try_start_11
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 254
    .line 255
    .line 256
    :catchall_7
    add-int/lit8 v0, v0, 0x1

    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    const-string p2, "[Hchat:MediaDownloader] \u4e0b\u8f7d\u5931\u8d25: "

    .line 264
    .line 265
    invoke-static {p2, p0, v2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    :cond_8
    instance-of p0, p1, Lsf/f;

    .line 269
    .line 270
    if-eqz p0, :cond_9

    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_9
    move-object v1, p1

    .line 274
    :goto_b
    check-cast v1, Ljava/io/File;

    .line 275
    .line 276
    return-object v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    move-object p0, v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    new-instance v1, Lsf/f;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :cond_0
    :goto_0
    nop

    .line 23
    instance-of v1, p0, Lsf/f;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :cond_1
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    const/16 v1, 0x2e

    .line 31
    .line 32
    invoke-static {p0, v1, v0}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-static {v0, p0, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v1, "png"

    .line 47
    .line 48
    sparse-switch v0, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :sswitch_0
    const-string v0, "webp"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :sswitch_1
    const-string v0, "jpeg"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :sswitch_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :sswitch_3
    const-string v0, "mp4"

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :sswitch_4
    const-string v0, "jpg"

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :sswitch_5
    const-string v0, "gif"

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :sswitch_6
    const-string v0, "bmp"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_2

    .line 111
    .line 112
    :goto_1
    move-object p0, v1

    .line 113
    :cond_2
    return-object p0

    .line 114
    nop

    .line 115
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_6
        0x18fc4 -> :sswitch_5
        0x19be1 -> :sswitch_4
        0x1a6f1 -> :sswitch_3
        0x1b229 -> :sswitch_2
        0x31e068 -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public static final i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object p0, v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    array-length v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    aget-object v5, v1, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v6, v3

    .line 30
    :goto_1
    if-eqz v6, :cond_2

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move-object v5, v0

    .line 39
    goto :goto_3

    .line 40
    :goto_2
    new-instance v5, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v5, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_3
    instance-of v1, v5, Lsf/f;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object v0, v5

    .line 51
    :goto_4
    check-cast v0, Ljava/io/File;

    .line 52
    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_5
    new-instance v0, Ljava/io/File;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string v1, "/storage/emulated/0/Android/media/"

    .line 63
    .line 64
    invoke-static {v1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_5
    new-instance p0, Ljava/io/File;

    .line 72
    .line 73
    new-instance v1, Ljava/io/File;

    .line 74
    .line 75
    const-string v2, "Hchat"

    .line 76
    .line 77
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 84
    .line 85
    .line 86
    return-object p0
.end method
