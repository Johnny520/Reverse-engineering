.class public final Lp8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp8/b;

.field public static final b:Ljava/nio/charset/Charset;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lp8/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp8/b;->a:Lp8/b;

    .line 7
    .line 8
    const-string v0, "ISO-8859-1"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lp8/b;->b:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    new-instance v0, Log/k;

    .line 17
    .line 18
    const-string v1, "(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)\\s*=\\s*[\"\'](\\d+)[\"\']"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Log/k;

    .line 24
    .line 25
    const-string v2, "<(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)>\\s*(\\d+)\\s*</"

    .line 26
    .line 27
    invoke-direct {v1, v2}, Log/k;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Log/k;

    .line 31
    .line 32
    const-string v3, "(?:Item|GContainerItem):Length\\s*=\\s*[\"\'](\\d+)[\"\'][^>]{0,1024}(?:Item|GContainerItem):Semantic\\s*=\\s*[\"\'](?:MotionPhoto|MicroVideo)[\"\']"

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, v3, v4}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Log/k;

    .line 39
    .line 40
    const-string v5, "(?:Item|GContainerItem):Semantic\\s*=\\s*[\"\'](?:MotionPhoto|MicroVideo)[\"\'][^>]{0,1024}(?:Item|GContainerItem):Length\\s*=\\s*[\"\'](\\d+)[\"\']"

    .line 41
    .line 42
    invoke-direct {v3, v5, v4}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v0, v1, v2, v3}, [Log/k;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lp8/b;->c:Ljava/util/List;

    .line 54
    .line 55
    return-void
.end method

.method public static a(Ljava/io/File;Lp8/a;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget-wide v5, p1, Lp8/a;->a:J

    .line 14
    .line 15
    iget-wide p0, p1, Lp8/a;->b:J

    .line 16
    .line 17
    new-instance v7, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, "|"

    .line 26
    .line 27
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-static {v7, v0, v5, v6, v0}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :try_start_0
    const-string p1, "SHA-256"

    .line 50
    .line 51
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const-string v0, ""

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 79
    .line 80
    .line 81
    array-length v2, p1

    .line 82
    const/4 v3, 0x0

    .line 83
    move v4, v3

    .line 84
    :goto_0
    if-ge v3, v2, :cond_1

    .line 85
    .line 86
    aget-byte v5, p1, v3

    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    add-int/2addr v4, v6

    .line 90
    if-le v4, v6, :cond_0

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-string v7, "%02x"

    .line 100
    .line 101
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 114
    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const/16 v0, 0x18

    .line 127
    .line 128
    invoke-static {v0, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    new-instance v0, Lsf/f;

    .line 135
    .line 136
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object p1, v0

    .line 140
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    instance-of v0, p1, Lsf/f;

    .line 149
    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    move-object p1, p0

    .line 153
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 154
    .line 155
    return-object p1
.end method

.method public static b(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sparse-switch v0, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_0
    const-string v0, "webp"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :sswitch_1
    const-string v0, "heif"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :sswitch_2
    const-string v0, "heic"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :sswitch_3
    const-string v0, "avif"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :sswitch_4
    const-string v0, "png"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    :goto_0
    const-string p0, "jpg"

    .line 67
    .line 68
    :cond_0
    return-object p0

    .line 69
    :sswitch_data_0
    .sparse-switch
        0x1b229 -> :sswitch_4
        0x2de012 -> :sswitch_3
        0x30ced7 -> :sswitch_2
        0x30ceda -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(Ljava/io/File;)Z
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    const-string v1, "r"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/16 v1, 0xff

    .line 13
    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 v1, 0xd8

    .line 21
    .line 22
    if-ne p0, v1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :try_start_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :goto_1
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_4
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 43
    :catchall_2
    move-exception p0

    .line 44
    new-instance v0, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p0, v0

    .line 50
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    instance-of v1, p0, Lsf/f;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    move-object p0, v0

    .line 57
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
.end method

.method public static d(Ljava/io/RandomAccessFile;JJ)Lp8/a;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    if-ltz v5, :cond_11

    .line 10
    .line 11
    const-wide/16 v5, 0x8

    .line 12
    .line 13
    add-long v7, v1, v5

    .line 14
    .line 15
    cmp-long v7, v7, p1

    .line 16
    .line 17
    if-lez v7, :cond_0

    .line 18
    .line 19
    goto/16 :goto_7

    .line 20
    .line 21
    :cond_0
    move-wide v8, v1

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    :goto_0
    add-long v14, v8, v5

    .line 27
    .line 28
    cmp-long v14, v14, p1

    .line 29
    .line 30
    if-gtz v14, :cond_10

    .line 31
    .line 32
    add-int/lit8 v14, v10, 0x1

    .line 33
    .line 34
    const/16 v15, 0x2710

    .line 35
    .line 36
    if-ge v10, v15, :cond_10

    .line 37
    .line 38
    invoke-virtual {v0, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    move-wide v15, v3

    .line 46
    int-to-long v3, v10

    .line 47
    const-wide v17, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long v3, v3, v17

    .line 53
    .line 54
    const/4 v10, 0x4

    .line 55
    new-array v5, v10, [B

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    :goto_1
    const/16 v19, 0x1

    .line 62
    .line 63
    if-ge v6, v10, :cond_3

    .line 64
    .line 65
    aget-byte v7, v5, v6

    .line 66
    .line 67
    and-int/lit16 v7, v7, 0xff

    .line 68
    .line 69
    const/16 v10, 0x20

    .line 70
    .line 71
    if-gt v10, v7, :cond_1

    .line 72
    .line 73
    const/16 v10, 0x7f

    .line 74
    .line 75
    if-ge v7, v10, :cond_1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    const/16 v19, 0x0

    .line 79
    .line 80
    :goto_2
    if-nez v19, :cond_2

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    const/4 v10, 0x4

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    cmp-long v6, v3, v15

    .line 89
    .line 90
    const-wide/16 v20, 0x10

    .line 91
    .line 92
    const-wide/16 v22, 0x1

    .line 93
    .line 94
    if-nez v6, :cond_4

    .line 95
    .line 96
    sub-long v24, p1, v8

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    cmp-long v7, v3, v22

    .line 100
    .line 101
    if-nez v7, :cond_5

    .line 102
    .line 103
    add-long v24, v8, v20

    .line 104
    .line 105
    cmp-long v7, v24, p1

    .line 106
    .line 107
    if-gtz v7, :cond_11

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readLong()J

    .line 110
    .line 111
    .line 112
    move-result-wide v24

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    move-wide/from16 v24, v3

    .line 115
    .line 116
    :goto_3
    cmp-long v3, v3, v22

    .line 117
    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    const-wide/16 v20, 0x8

    .line 122
    .line 123
    :goto_4
    cmp-long v3, v24, v20

    .line 124
    .line 125
    if-ltz v3, :cond_10

    .line 126
    .line 127
    sub-long v3, p1, v8

    .line 128
    .line 129
    cmp-long v3, v24, v3

    .line 130
    .line 131
    if-lez v3, :cond_7

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    sget-object v3, Lp8/b;->b:Ljava/nio/charset/Charset;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v4, Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {v4, v5, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 142
    .line 143
    .line 144
    cmp-long v3, v8, v1

    .line 145
    .line 146
    const-string v5, "ftyp"

    .line 147
    .line 148
    if-nez v3, :cond_8

    .line 149
    .line 150
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_8

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    const v7, 0x302065

    .line 162
    .line 163
    .line 164
    if-eq v3, v7, :cond_d

    .line 165
    .line 166
    const v5, 0x33100a

    .line 167
    .line 168
    .line 169
    if-eq v3, v5, :cond_b

    .line 170
    .line 171
    const v5, 0x333b09

    .line 172
    .line 173
    .line 174
    if-eq v3, v5, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    const-string v3, "moov"

    .line 178
    .line 179
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-nez v3, :cond_a

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_a
    move/from16 v13, v19

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_b
    const-string v3, "mdat"

    .line 190
    .line 191
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_c

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_c
    move/from16 v12, v19

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_d
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_e

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_e
    move/from16 v11, v19

    .line 209
    .line 210
    :goto_5
    add-long v8, v8, v24

    .line 211
    .line 212
    if-nez v6, :cond_f

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_f
    move v10, v14

    .line 216
    move-wide v3, v15

    .line 217
    const-wide/16 v5, 0x8

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_10
    :goto_6
    if-eqz v11, :cond_11

    .line 222
    .line 223
    if-eqz v12, :cond_11

    .line 224
    .line 225
    if-eqz v13, :cond_11

    .line 226
    .line 227
    cmp-long v0, v8, v1

    .line 228
    .line 229
    if-lez v0, :cond_11

    .line 230
    .line 231
    new-instance v0, Lp8/a;

    .line 232
    .line 233
    invoke-direct {v0, v1, v2, v8, v9}, Lp8/a;-><init>(JJ)V

    .line 234
    .line 235
    .line 236
    return-object v0

    .line 237
    :cond_11
    :goto_7
    const/4 v0, 0x0

    .line 238
    return-object v0
.end method

.method public static e(Ljava/io/File;Ljava/io/File;JJ)Z
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p4, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-gtz v2, :cond_0

    .line 7
    .line 8
    return v3

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long v2, v4, p4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    new-instance v2, Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, ".tmp"

    .line 36
    .line 37
    invoke-static {v5, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 45
    .line 46
    const-string v5, "r"

    .line 47
    .line 48
    invoke-direct {v4, p0, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    .line 50
    .line 51
    :try_start_1
    invoke-virtual {v4, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 52
    .line 53
    .line 54
    new-instance p0, Ljava/io/FileOutputStream;

    .line 55
    .line 56
    invoke-direct {p0, v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 57
    .line 58
    .line 59
    const/high16 p2, 0x40000

    .line 60
    .line 61
    :try_start_2
    new-array p3, p2, [B

    .line 62
    .line 63
    :goto_0
    cmp-long v5, p4, v0

    .line 64
    .line 65
    if-lez v5, :cond_3

    .line 66
    .line 67
    int-to-long v5, p2

    .line 68
    invoke-static {v5, v6, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    long-to-int v5, v5

    .line 73
    invoke-virtual {v4, p3, v3, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-lez v5, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, p3, v3, v5}, Ljava/io/FileOutputStream;->write([BII)V

    .line 80
    .line 81
    .line 82
    int-to-long v5, v5

    .line 83
    sub-long/2addr p4, v5

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p2, "unexpected end of source"

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_3
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/io/FileDescriptor;->sync()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    .line 101
    .line 102
    :try_start_3
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 103
    .line 104
    .line 105
    :try_start_4
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_5

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    const-string p1, "cannot replace cache file"

    .line 124
    .line 125
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    :goto_1
    invoke-virtual {v2, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_6

    .line 136
    .line 137
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    const-string p1, "cannot finalize cache file"

    .line 143
    .line 144
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 148
    :catchall_2
    move-exception p0

    .line 149
    goto :goto_3

    .line 150
    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 151
    :catchall_3
    move-exception p2

    .line 152
    :try_start_6
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 156
    :goto_3
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 157
    :catchall_4
    move-exception p1

    .line 158
    :try_start_8
    invoke-static {v4, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 162
    :goto_4
    new-instance p1, Lsf/f;

    .line 163
    .line 164
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object p0, p1

    .line 168
    :goto_5
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-nez p1, :cond_7

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_7
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 176
    .line 177
    .line 178
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 179
    .line 180
    :goto_6
    check-cast p0, Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    return p0
.end method
