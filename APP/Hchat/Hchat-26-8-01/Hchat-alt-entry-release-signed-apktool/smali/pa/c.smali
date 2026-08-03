.class public final Lpa/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;Ll3/l;Lna/b;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lpa/c;->g:Ljava/lang/Object;

    .line 29
    iput-object p1, p0, Lpa/c;->c:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Lpa/c;->d:Ljava/lang/Object;

    .line 31
    iput-object p3, p0, Lpa/c;->e:Ljava/lang/Object;

    .line 32
    iput-object p4, p0, Lpa/c;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu3/c;Li/e0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpa/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lpa/c;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Luf/d;

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    invoke-direct {p1, p2}, Luf/d;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lpa/c;->e:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lpa/c;->f:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "a"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return-object v0

    .line 13
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :catchall_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/reflect/Field;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 36
    .line 37
    :try_start_2
    invoke-static {v1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "toByteArray"

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    new-array v4, v4, [Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "parseFrom"

    .line 65
    .line 66
    const-class v4, [B

    .line 67
    .line 68
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    if-nez v2, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-object v1

    .line 80
    :catchall_2
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static e([BII)[J
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge p1, p2, :cond_1

    .line 6
    .line 7
    const/16 v4, 0x40

    .line 8
    .line 9
    if-ge v3, v4, :cond_1

    .line 10
    .line 11
    add-int/lit8 v4, p1, 0x1

    .line 12
    .line 13
    aget-byte p1, p0, p1

    .line 14
    .line 15
    and-int/lit8 v5, p1, 0x7f

    .line 16
    .line 17
    int-to-long v5, v5

    .line 18
    shl-long/2addr v5, v3

    .line 19
    or-long/2addr v0, v5

    .line 20
    and-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    int-to-long p0, v4

    .line 25
    const/4 p2, 0x2

    .line 26
    new-array p2, p2, [J

    .line 27
    .line 28
    aput-wide v0, p2, v2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aput-wide p0, p2, v0

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x7

    .line 35
    .line 36
    move p1, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string p0, "bad varint"

    .line 39
    .line 40
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static g([BII)Lg8/b;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_e

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-gt p1, v1, :cond_e

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    if-le p2, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    move v4, v3

    .line 21
    :cond_1
    :goto_0
    if-ge v3, p1, :cond_d

    .line 22
    .line 23
    :try_start_0
    invoke-static {p0, v3, p1}, Lpa/c;->e([BII)[J

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    aget-wide v5, v3, v2

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    aget-wide v8, v3, v7

    .line 31
    .line 32
    long-to-int v3, v8

    .line 33
    const-wide/16 v8, 0x0

    .line 34
    .line 35
    cmp-long v8, v5, v8

    .line 36
    .line 37
    if-nez v8, :cond_2

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_2
    const/4 v8, 0x3

    .line 42
    ushr-long v9, v5, v8

    .line 43
    .line 44
    long-to-int v9, v9

    .line 45
    const-wide/16 v10, 0x7

    .line 46
    .line 47
    and-long/2addr v10, v5

    .line 48
    long-to-int v10, v10

    .line 49
    if-lez v9, :cond_e

    .line 50
    .line 51
    if-eq v10, v8, :cond_e

    .line 52
    .line 53
    const/4 v8, 0x4

    .line 54
    if-eq v10, v8, :cond_e

    .line 55
    .line 56
    const/4 v9, 0x5

    .line 57
    if-le v10, v9, :cond_3

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_3
    invoke-static {v1, v5, v6}, Lpa/c;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 62
    .line 63
    .line 64
    if-nez v10, :cond_4

    .line 65
    .line 66
    invoke-static {p0, v3, p1}, Lpa/c;->e([BII)[J

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    aget-wide v5, v3, v2

    .line 71
    .line 72
    invoke-static {v1, v5, v6}, Lpa/c;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 73
    .line 74
    .line 75
    aget-wide v5, v3, v7

    .line 76
    .line 77
    long-to-int v3, v5

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    if-ne v10, v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v5, v3, 0x8

    .line 82
    .line 83
    if-le v5, p1, :cond_5

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_5
    const/16 v6, 0x8

    .line 88
    .line 89
    invoke-virtual {v1, p0, v3, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 90
    .line 91
    .line 92
    :goto_1
    move v3, v5

    .line 93
    goto :goto_0

    .line 94
    :cond_6
    const/4 v5, 0x2

    .line 95
    if-ne v10, v5, :cond_b

    .line 96
    .line 97
    invoke-static {p0, v3, p1}, Lpa/c;->e([BII)[J

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    aget-wide v5, v3, v2

    .line 102
    .line 103
    long-to-int v5, v5

    .line 104
    aget-wide v8, v3, v7

    .line 105
    .line 106
    long-to-int v3, v8

    .line 107
    if-ltz v5, :cond_e

    .line 108
    .line 109
    add-int/2addr v5, v3

    .line 110
    if-le v5, p1, :cond_7

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    invoke-static {p0, v3, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    array-length v6, v3

    .line 118
    if-lez v6, :cond_8

    .line 119
    .line 120
    array-length v6, v3

    .line 121
    add-int/2addr v7, p2

    .line 122
    invoke-static {v3, v6, v7}, Lpa/c;->g([BII)Lg8/b;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    goto :goto_2

    .line 127
    :cond_8
    move-object v6, v0

    .line 128
    :goto_2
    if-eqz v6, :cond_9

    .line 129
    .line 130
    iget v7, v6, Lg8/b;->c:I

    .line 131
    .line 132
    if-lez v7, :cond_9

    .line 133
    .line 134
    iget-object v6, v6, Lg8/b;->b:[B

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_9
    move v7, v2

    .line 138
    move-object v6, v3

    .line 139
    :goto_3
    if-nez v7, :cond_a

    .line 140
    .line 141
    invoke-static {v3}, Lpa/c;->h([B)[B

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {v3, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-nez v3, :cond_a

    .line 150
    .line 151
    add-int/lit8 v7, v7, 0x1

    .line 152
    .line 153
    move-object v6, v8

    .line 154
    :cond_a
    array-length v3, v6

    .line 155
    int-to-long v8, v3

    .line 156
    invoke-static {v1, v8, v9}, Lpa/c;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 157
    .line 158
    .line 159
    array-length v3, v6

    .line 160
    invoke-virtual {v1, v6, v2, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 161
    .line 162
    .line 163
    add-int/2addr v4, v7

    .line 164
    goto :goto_1

    .line 165
    :cond_b
    if-ne v10, v9, :cond_1

    .line 166
    .line 167
    add-int/lit8 v5, v3, 0x4

    .line 168
    .line 169
    if-le v5, p1, :cond_c

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_c
    invoke-virtual {v1, p0, v3, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_d
    new-instance p0, Lg8/b;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {p0, p1, v4}, Lg8/b;-><init>([BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :catchall_0
    :cond_e
    :goto_4
    return-object v0
.end method

.method public static h([B)[B
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 6
    .line 7
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "username="

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-gez v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v2, v2, 0x9

    .line 22
    .line 23
    const-string v3, "&"

    .line 24
    .line 25
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-gez v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :cond_2
    const/4 v4, 0x0

    .line 36
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v3, Lpa/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    move-object v3, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const-string v3, "%40"

    .line 59
    .line 60
    const-string v5, "%40%40"

    .line 61
    .line 62
    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v5, "@"

    .line 67
    .line 68
    const-string v6, "@@"

    .line 69
    .line 70
    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :goto_0
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {v2, v3}, Lpa/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 103
    .line 104
    .line 105
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :catchall_0
    :goto_1
    return-object p0
.end method

.method public static i(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x7f

    .line 11
    .line 12
    and-long/2addr v0, p1

    .line 13
    const-wide/16 v2, 0x80

    .line 14
    .line 15
    or-long/2addr v0, v2

    .line 16
    long-to-int v0, v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    ushr-long/2addr p1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    long-to-int p1, p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lpa/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    :cond_0
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lpa/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->packetQueueClasses:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    array-length v3, v2

    .line 51
    const/4 v4, 0x0

    .line 52
    :goto_1
    if-ge v4, v3, :cond_1

    .line 53
    .line 54
    aget-object v5, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    :try_start_1
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    const-string v8, "dispatch"

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_3

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    array-length v7, v7

    .line 93
    const/4 v8, 0x3

    .line 94
    if-ne v7, v8, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-nez v7, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    :catchall_0
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    :cond_5
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpa/c;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lna/b;->h:Lna/e;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public f([B)[B
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    array-length v1, p1

    .line 3
    if-nez v1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    array-length v3, p1

    .line 10
    const/4 v4, 0x4

    .line 11
    if-lt v3, v4, :cond_1

    .line 12
    .line 13
    aget-byte v3, p1, v1

    .line 14
    .line 15
    and-int/lit16 v3, v3, 0xff

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-static {p1, v1, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    array-length v3, p1

    .line 24
    invoke-static {p1, v4, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 25
    .line 26
    .line 27
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_7

    .line 31
    :cond_1
    move-object v3, p1

    .line 32
    :goto_0
    if-eqz v3, :cond_4

    .line 33
    .line 34
    :try_start_1
    array-length v4, v3

    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    array-length v4, v3

    .line 39
    invoke-static {v3, v4, v1}, Lpa/c;->g([BII)Lg8/b;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-nez v4, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iget v5, v4, Lg8/b;->c:I

    .line 47
    .line 48
    if-lez v5, :cond_4

    .line 49
    .line 50
    iget-object v4, v4, Lg8/b;->b:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_1
    :cond_4
    :goto_1
    move-object v4, v3

    .line 54
    :goto_2
    :try_start_2
    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_5

    .line 59
    .line 60
    :goto_3
    return-object v0

    .line 61
    :cond_5
    if-eqz v2, :cond_8

    .line 62
    .line 63
    array-length v3, v2

    .line 64
    if-nez v3, :cond_6

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_6
    if-eqz v4, :cond_a

    .line 68
    .line 69
    array-length v3, v4

    .line 70
    if-nez v3, :cond_7

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    array-length v3, v2

    .line 74
    array-length v5, v4

    .line 75
    add-int/2addr v3, v5

    .line 76
    new-array v3, v3, [B

    .line 77
    .line 78
    array-length v5, v2

    .line 79
    invoke-static {v2, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    .line 81
    .line 82
    array-length v2, v2

    .line 83
    array-length v5, v4

    .line 84
    invoke-static {v4, v1, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    move-object v2, v3

    .line 88
    goto :goto_5

    .line 89
    :cond_8
    :goto_4
    if-nez v4, :cond_9

    .line 90
    .line 91
    new-array v2, v1, [B

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_9
    move-object v2, v4

    .line 95
    :cond_a
    :goto_5
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 96
    .line 97
    .line 98
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    if-eqz p1, :cond_b

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_b
    move-object v0, v2

    .line 103
    :goto_6
    return-object v0

    .line 104
    :goto_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v2, "ERROR \u53d1\u5305PB\u7be1\u6539\u5931\u8d25: "

    .line 107
    .line 108
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0, p1}, Lpa/c;->d(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v0
.end method
