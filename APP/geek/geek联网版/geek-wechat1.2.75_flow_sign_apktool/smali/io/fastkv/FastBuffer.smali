.class Lio/fastkv/FastBuffer;
.super Ljava/lang/Object;


# static fields
.field private static final INVALID_STRING:Ljava/lang/String; = "Invalid String"

.field private static final MAX_CHAR_LEN:I = 0x800


# instance fields
.field private charBuf:[C

.field public hb:[B

.field public position:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    new-array p1, p1, [B

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/fastkv/FastBuffer;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lio/fastkv/FastBuffer;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lio/fastkv/FastBuffer;->charBuf:[C

    .line 5
    iput-object p1, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 6
    iput p2, p0, Lio/fastkv/FastBuffer;->position:I

    return-void
.end method

.method private encodeStr(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_4

    .line 11
    .line 12
    add-int/lit8 v4, v3, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/16 v6, 0x80

    .line 19
    .line 20
    if-ge v5, v6, :cond_0

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    int-to-byte v5, v5

    .line 25
    aput-byte v5, v0, v1

    .line 26
    .line 27
    move v1, v3

    .line 28
    :goto_1
    move v3, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v7, 0x800

    .line 31
    .line 32
    if-ge v5, v7, :cond_1

    .line 33
    .line 34
    add-int/lit8 v3, v1, 0x1

    .line 35
    .line 36
    ushr-int/lit8 v7, v5, 0x6

    .line 37
    .line 38
    or-int/lit16 v7, v7, 0xc0

    .line 39
    .line 40
    int-to-byte v7, v7

    .line 41
    aput-byte v7, v0, v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x2

    .line 44
    .line 45
    and-int/lit8 v5, v5, 0x3f

    .line 46
    .line 47
    or-int/2addr v5, v6

    .line 48
    int-to-byte v5, v5

    .line 49
    aput-byte v5, v0, v3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const v7, 0xd800

    .line 53
    .line 54
    .line 55
    if-lt v5, v7, :cond_3

    .line 56
    .line 57
    const v7, 0xdfff

    .line 58
    .line 59
    .line 60
    if-le v5, v7, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 64
    .line 65
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    shl-int/lit8 v5, v5, 0xa

    .line 70
    .line 71
    add-int/2addr v5, v4

    .line 72
    const v4, -0x35fdc00

    .line 73
    .line 74
    .line 75
    add-int/2addr v5, v4

    .line 76
    add-int/lit8 v4, v1, 0x1

    .line 77
    .line 78
    ushr-int/lit8 v7, v5, 0x12

    .line 79
    .line 80
    or-int/lit16 v7, v7, 0xf0

    .line 81
    .line 82
    int-to-byte v7, v7

    .line 83
    aput-byte v7, v0, v1

    .line 84
    .line 85
    add-int/lit8 v7, v1, 0x2

    .line 86
    .line 87
    ushr-int/lit8 v8, v5, 0xc

    .line 88
    .line 89
    and-int/lit8 v8, v8, 0x3f

    .line 90
    .line 91
    or-int/2addr v8, v6

    .line 92
    int-to-byte v8, v8

    .line 93
    aput-byte v8, v0, v4

    .line 94
    .line 95
    add-int/lit8 v4, v1, 0x3

    .line 96
    .line 97
    ushr-int/lit8 v8, v5, 0x6

    .line 98
    .line 99
    and-int/lit8 v8, v8, 0x3f

    .line 100
    .line 101
    or-int/2addr v8, v6

    .line 102
    int-to-byte v8, v8

    .line 103
    aput-byte v8, v0, v7

    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x4

    .line 106
    .line 107
    and-int/lit8 v5, v5, 0x3f

    .line 108
    .line 109
    or-int/2addr v5, v6

    .line 110
    int-to-byte v5, v5

    .line 111
    aput-byte v5, v0, v4

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    :goto_2
    add-int/lit8 v3, v1, 0x1

    .line 115
    .line 116
    ushr-int/lit8 v7, v5, 0xc

    .line 117
    .line 118
    or-int/lit16 v7, v7, 0xe0

    .line 119
    .line 120
    int-to-byte v7, v7

    .line 121
    aput-byte v7, v0, v1

    .line 122
    .line 123
    add-int/lit8 v7, v1, 0x2

    .line 124
    .line 125
    ushr-int/lit8 v8, v5, 0x6

    .line 126
    .line 127
    and-int/lit8 v8, v8, 0x3f

    .line 128
    .line 129
    or-int/2addr v8, v6

    .line 130
    int-to-byte v8, v8

    .line 131
    aput-byte v8, v0, v3

    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x3

    .line 134
    .line 135
    and-int/lit8 v3, v5, 0x3f

    .line 136
    .line 137
    or-int/2addr v3, v6

    .line 138
    int-to-byte v3, v3

    .line 139
    aput-byte v3, v0, v7

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 143
    .line 144
    return-void
.end method

.method private getCharBuf(I)[C
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->charBuf:[C

    .line 2
    .line 3
    const/16 v1, 0x800

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x100

    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    new-array p1, v0, [C

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-array p1, v1, [C

    .line 15
    .line 16
    :goto_0
    iput-object p1, p0, Lio/fastkv/FastBuffer;->charBuf:[C

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    array-length v2, v0

    .line 20
    if-ge v2, p1, :cond_2

    .line 21
    .line 22
    new-array p1, v1, [C

    .line 23
    .line 24
    iput-object p1, p0, Lio/fastkv/FastBuffer;->charBuf:[C

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_2
    return-object v0
.end method

.method public static getStringSize(Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_4

    .line 8
    .line 9
    add-int/lit8 v3, v1, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/16 v5, 0x80

    .line 16
    .line 17
    if-ge v4, v5, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    :goto_1
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v5, 0x800

    .line 24
    .line 25
    if-ge v4, v5, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const v5, 0xd800

    .line 31
    .line 32
    .line 33
    if-lt v4, v5, :cond_3

    .line 34
    .line 35
    const v5, 0xdfff

    .line 36
    .line 37
    .line 38
    if-le v4, v5, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    add-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    return v2
.end method

.method public static getVarint32Size(I)I
    .locals 1

    .line 1
    shr-int/lit8 v0, p0, 0x7

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    shr-int/lit8 v0, p0, 0xe

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    shr-int/lit8 v0, p0, 0x15

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    return p0

    .line 19
    :cond_2
    shr-int/lit8 p0, p0, 0x1c

    .line 20
    .line 21
    if-nez p0, :cond_3

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    return p0

    .line 25
    :cond_3
    const/4 p0, 0x5

    .line 26
    return p0
.end method


# virtual methods
.method public declared-synchronized decodeStr([BII)Ljava/lang/String;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p3}, Lio/fastkv/FastBuffer;->getCharBuf(I)[C

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    add-int/2addr p3, p2

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge p2, p3, :cond_8

    .line 10
    .line 11
    add-int/lit8 v3, p2, 0x1

    .line 12
    .line 13
    aget-byte v4, p1, p2

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    add-int/lit8 p2, v2, 0x1

    .line 18
    .line 19
    int-to-char v4, v4

    .line 20
    aput-char v4, v0, v2

    .line 21
    .line 22
    move v2, p2

    .line 23
    move p2, v3

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    const/16 v5, -0x20

    .line 29
    .line 30
    const/16 v6, -0x41

    .line 31
    .line 32
    if-ge v4, v5, :cond_2

    .line 33
    .line 34
    add-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    aget-byte v3, p1, v3

    .line 37
    .line 38
    const/16 v5, -0x3e

    .line 39
    .line 40
    if-lt v4, v5, :cond_1

    .line 41
    .line 42
    if-gt v3, v6, :cond_1

    .line 43
    .line 44
    add-int/lit8 v5, v2, 0x1

    .line 45
    .line 46
    and-int/lit8 v4, v4, 0x1f

    .line 47
    .line 48
    shl-int/lit8 v4, v4, 0x6

    .line 49
    .line 50
    and-int/lit8 v3, v3, 0x3f

    .line 51
    .line 52
    or-int/2addr v3, v4

    .line 53
    int-to-char v3, v3

    .line 54
    aput-char v3, v0, v2

    .line 55
    .line 56
    :goto_1
    move v2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string p2, "Invalid String"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    const/16 v7, -0x10

    .line 67
    .line 68
    if-ge v4, v7, :cond_6

    .line 69
    .line 70
    add-int/lit8 v7, p2, 0x2

    .line 71
    .line 72
    aget-byte v3, p1, v3

    .line 73
    .line 74
    add-int/lit8 p2, p2, 0x3

    .line 75
    .line 76
    aget-byte v7, p1, v7

    .line 77
    .line 78
    const/16 v8, -0x60

    .line 79
    .line 80
    if-ne v4, v5, :cond_3

    .line 81
    .line 82
    if-lt v3, v8, :cond_5

    .line 83
    .line 84
    :cond_3
    const/16 v5, -0x13

    .line 85
    .line 86
    if-ne v4, v5, :cond_4

    .line 87
    .line 88
    if-ge v3, v8, :cond_5

    .line 89
    .line 90
    :cond_4
    if-gt v3, v6, :cond_5

    .line 91
    .line 92
    if-gt v7, v6, :cond_5

    .line 93
    .line 94
    add-int/lit8 v5, v2, 0x1

    .line 95
    .line 96
    and-int/lit8 v4, v4, 0xf

    .line 97
    .line 98
    shl-int/lit8 v4, v4, 0xc

    .line 99
    .line 100
    and-int/lit8 v3, v3, 0x3f

    .line 101
    .line 102
    shl-int/lit8 v3, v3, 0x6

    .line 103
    .line 104
    or-int/2addr v3, v4

    .line 105
    and-int/lit8 v4, v7, 0x3f

    .line 106
    .line 107
    or-int/2addr v3, v4

    .line 108
    int-to-char v3, v3

    .line 109
    aput-char v3, v0, v2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    const-string p2, "Invalid String"

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_6
    add-int/lit8 v5, p2, 0x2

    .line 121
    .line 122
    aget-byte v3, p1, v3

    .line 123
    .line 124
    add-int/lit8 v7, p2, 0x3

    .line 125
    .line 126
    aget-byte v5, p1, v5

    .line 127
    .line 128
    add-int/lit8 p2, p2, 0x4

    .line 129
    .line 130
    aget-byte v7, p1, v7

    .line 131
    .line 132
    if-gt v3, v6, :cond_7

    .line 133
    .line 134
    shl-int/lit8 v8, v4, 0x1c

    .line 135
    .line 136
    add-int/lit8 v9, v3, 0x70

    .line 137
    .line 138
    add-int/2addr v9, v8

    .line 139
    shr-int/lit8 v8, v9, 0x1e

    .line 140
    .line 141
    if-nez v8, :cond_7

    .line 142
    .line 143
    if-gt v5, v6, :cond_7

    .line 144
    .line 145
    if-gt v7, v6, :cond_7

    .line 146
    .line 147
    and-int/lit8 v4, v4, 0x7

    .line 148
    .line 149
    shl-int/lit8 v4, v4, 0x12

    .line 150
    .line 151
    and-int/lit8 v3, v3, 0x3f

    .line 152
    .line 153
    shl-int/lit8 v3, v3, 0xc

    .line 154
    .line 155
    or-int/2addr v3, v4

    .line 156
    and-int/lit8 v4, v5, 0x3f

    .line 157
    .line 158
    shl-int/lit8 v4, v4, 0x6

    .line 159
    .line 160
    or-int/2addr v3, v4

    .line 161
    and-int/lit8 v4, v7, 0x3f

    .line 162
    .line 163
    or-int/2addr v3, v4

    .line 164
    add-int/lit8 v4, v2, 0x1

    .line 165
    .line 166
    ushr-int/lit8 v5, v3, 0xa

    .line 167
    .line 168
    const v6, 0xd7c0

    .line 169
    .line 170
    .line 171
    add-int/2addr v5, v6

    .line 172
    int-to-char v5, v5

    .line 173
    aput-char v5, v0, v2

    .line 174
    .line 175
    add-int/lit8 v2, v2, 0x2

    .line 176
    .line 177
    and-int/lit16 v3, v3, 0x3ff

    .line 178
    .line 179
    const v5, 0xdc00

    .line 180
    .line 181
    .line 182
    add-int/2addr v3, v5

    .line 183
    int-to-char v3, v3

    .line 184
    aput-char v3, v0, v4

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 189
    .line 190
    const-string p2, "Invalid String"

    .line 191
    .line 192
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_8
    if-gt p2, p3, :cond_9

    .line 197
    .line 198
    new-instance p1, Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {p1, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    monitor-exit p0

    .line 204
    return-object p1

    .line 205
    :cond_9
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string p2, "Invalid String"

    .line 208
    .line 209
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    throw p1
.end method

.method public get()B
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    return v0
.end method

.method public getBytes(I)[B
    .locals 4

    .line 1
    new-array v0, p1, [B

    .line 2
    iget-object v1, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v2, p0, Lio/fastkv/FastBuffer;->position:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/2addr v1, p1

    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    return-object v0
.end method

.method public getBytes(Lio/fastkv/interfaces/FastCipher;I)[B
    .locals 0

    .line 4
    invoke-virtual {p0, p2}, Lio/fastkv/FastBuffer;->getBytes(I)[B

    move-result-object p2

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1, p2}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public getChecksum(II)J
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-gtz p2, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    shr-int/lit8 v2, p2, 0x3

    .line 7
    .line 8
    and-int/lit8 p2, p2, 0x7

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    move v5, p1

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v5}, Lio/fastkv/FastBuffer;->getLong(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    xor-long/2addr v0, v6

    .line 20
    add-int/lit8 v5, v5, 0x8

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    shl-int/lit8 p2, p2, 0x3

    .line 26
    .line 27
    :goto_1
    if-ge v3, p2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 30
    .line 31
    add-int/lit8 v4, v5, 0x1

    .line 32
    .line 33
    aget-byte v2, v2, v5

    .line 34
    .line 35
    int-to-long v5, v2

    .line 36
    const-wide/16 v7, 0xff

    .line 37
    .line 38
    and-long/2addr v5, v7

    .line 39
    shl-long/2addr v5, v3

    .line 40
    xor-long/2addr v0, v5

    .line 41
    add-int/lit8 v3, v3, 0x8

    .line 42
    .line 43
    move v5, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    and-int/lit8 p1, p1, 0x7

    .line 46
    .line 47
    shl-int/lit8 p1, p1, 0x3

    .line 48
    .line 49
    shl-long v2, v0, p1

    .line 50
    .line 51
    rsub-int/lit8 p1, p1, 0x40

    .line 52
    .line 53
    ushr-long p1, v0, p1

    .line 54
    .line 55
    or-long/2addr p1, v2

    .line 56
    return-wide p1
.end method

.method public getDouble(Lio/fastkv/interfaces/FastCipher;)D
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lio/fastkv/FastBuffer;->getLong(Lio/fastkv/interfaces/FastCipher;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public getFloat(Lio/fastkv/interfaces/FastCipher;)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/fastkv/FastBuffer;->getInt(Lio/fastkv/interfaces/FastCipher;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getInt()I
    .locals 5

    .line 2
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Lio/fastkv/FastBuffer;->position:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x3

    iput v3, p0, Lio/fastkv/FastBuffer;->position:I

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    aget-byte v0, v0, v3

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method public getInt(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    aget-byte v2, v0, p1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, p1, 0x2

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte v2, v0, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    aget-byte p1, v0, p1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v1

    return p1
.end method

.method public getInt(Lio/fastkv/interfaces/FastCipher;)I
    .locals 1

    .line 3
    invoke-virtual {p0}, Lio/fastkv/FastBuffer;->getInt()I

    move-result v0

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1, v0}, Lio/fastkv/interfaces/FastCipher;->decrypt(I)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public getLong()J
    .locals 3

    .line 2
    iget v0, p0, Lio/fastkv/FastBuffer;->position:I

    invoke-virtual {p0, v0}, Lio/fastkv/FastBuffer;->getLong(I)J

    move-result-wide v0

    .line 3
    iget v2, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/lit8 v2, v2, 0x8

    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    return-wide v0
.end method

.method public getLong(I)J
    .locals 9

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    aget-byte v2, v0, p1

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    add-int/lit8 v6, p1, 0x2

    aget-byte v1, v0, v1

    int-to-long v7, v1

    and-long/2addr v7, v4

    const/16 v1, 0x8

    shl-long/2addr v7, v1

    or-long v1, v2, v7

    add-int/lit8 v3, p1, 0x3

    aget-byte v6, v0, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v1, v6

    add-int/lit8 v6, p1, 0x4

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v4

    const/16 v3, 0x18

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 v3, p1, 0x5

    aget-byte v6, v0, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    or-long/2addr v1, v6

    add-int/lit8 v6, p1, 0x6

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v4

    const/16 v3, 0x28

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 p1, p1, 0x7

    aget-byte v3, v0, v6

    int-to-long v6, v3

    and-long v3, v6, v4

    const/16 v5, 0x30

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    aget-byte p1, v0, p1

    int-to-long v3, p1

    const/16 p1, 0x38

    shl-long/2addr v3, p1

    or-long v0, v1, v3

    return-wide v0
.end method

.method public getLong(Lio/fastkv/interfaces/FastCipher;)J
    .locals 2

    .line 4
    invoke-virtual {p0}, Lio/fastkv/FastBuffer;->getLong()J

    move-result-wide v0

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1, v0, v1}, Lio/fastkv/interfaces/FastCipher;->decrypt(J)J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method public getShort()S
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    and-int/lit16 v3, v3, 0xff

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 16
    .line 17
    aget-byte v0, v0, v2

    .line 18
    .line 19
    shl-int/lit8 v0, v0, 0x8

    .line 20
    .line 21
    or-int/2addr v0, v3

    .line 22
    int-to-short v0, v0

    .line 23
    return v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 4

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 7
    const-string p1, ""

    return-object p1

    :cond_1
    const/16 v0, 0x800

    if-le p1, v0, :cond_2

    .line 8
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v2, p0, Lio/fastkv/FastBuffer;->position:I

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    invoke-virtual {p0, v0, v1, p1}, Lio/fastkv/FastBuffer;->decodeStr([BII)Ljava/lang/String;

    move-result-object v0

    .line 9
    :goto_0
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/2addr v1, p1

    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    return-object v0
.end method

.method public getString(Lio/fastkv/interfaces/FastCipher;I)Ljava/lang/String;
    .locals 3

    if-eqz p1, :cond_3

    if-gtz p2, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int v2, v1, p2

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    .line 2
    invoke-interface {p1, v0}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    array-length v0, p1

    const/16 v1, 0x800

    if-le v0, v1, :cond_2

    .line 4
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object p1, v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lio/fastkv/FastBuffer;->decodeStr([BII)Ljava/lang/String;

    move-result-object p1

    .line 5
    :goto_0
    iget v0, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/2addr v0, p2

    iput v0, p0, Lio/fastkv/FastBuffer;->position:I

    return-object p1

    .line 6
    :cond_3
    :goto_1
    invoke-virtual {p0, p2}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getVarint32()I
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    shr-int/lit8 v4, v3, 0x7

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    and-int/lit8 v3, v3, 0x7f

    .line 17
    .line 18
    add-int/lit8 v4, v1, 0x2

    .line 19
    .line 20
    iput v4, p0, Lio/fastkv/FastBuffer;->position:I

    .line 21
    .line 22
    aget-byte v2, v0, v2

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    or-int/2addr v2, v3

    .line 27
    shr-int/lit8 v3, v2, 0xe

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    and-int/lit16 v2, v2, 0x3fff

    .line 33
    .line 34
    add-int/lit8 v3, v1, 0x3

    .line 35
    .line 36
    iput v3, p0, Lio/fastkv/FastBuffer;->position:I

    .line 37
    .line 38
    aget-byte v4, v0, v4

    .line 39
    .line 40
    shl-int/lit8 v4, v4, 0xe

    .line 41
    .line 42
    or-int/2addr v2, v4

    .line 43
    shr-int/lit8 v4, v2, 0x15

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    return v2

    .line 48
    :cond_2
    const v4, 0x1fffff

    .line 49
    .line 50
    .line 51
    and-int/2addr v2, v4

    .line 52
    add-int/lit8 v4, v1, 0x4

    .line 53
    .line 54
    iput v4, p0, Lio/fastkv/FastBuffer;->position:I

    .line 55
    .line 56
    aget-byte v3, v0, v3

    .line 57
    .line 58
    shl-int/lit8 v3, v3, 0x15

    .line 59
    .line 60
    or-int/2addr v2, v3

    .line 61
    shr-int/lit8 v3, v2, 0x1c

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    return v2

    .line 66
    :cond_3
    const v3, 0xfffffff

    .line 67
    .line 68
    .line 69
    and-int/2addr v2, v3

    .line 70
    add-int/lit8 v1, v1, 0x5

    .line 71
    .line 72
    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 73
    .line 74
    aget-byte v0, v0, v4

    .line 75
    .line 76
    shl-int/lit8 v0, v0, 0x1c

    .line 77
    .line 78
    or-int/2addr v0, v2

    .line 79
    return v0
.end method

.method public final put(B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 8
    .line 9
    aput-byte p1, v0, v1

    .line 10
    .line 11
    return-void
.end method

.method public putBytes([B)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 5
    .line 6
    iget v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    iput p1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public putInt(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    int-to-byte v3, p1

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    .line 2
    iput v3, p0, Lio/fastkv/FastBuffer;->position:I

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    .line 3
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    .line 4
    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    return-void
.end method

.method public putInt(II)V
    .locals 4

    .line 5
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    int-to-byte v2, p2

    aput-byte v2, v0, p1

    add-int/lit8 v2, p1, 0x2

    shr-int/lit8 v3, p2, 0x8

    int-to-byte v3, v3

    .line 6
    aput-byte v3, v0, v1

    add-int/lit8 p1, p1, 0x3

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    .line 7
    aput-byte v1, v0, v2

    shr-int/lit8 p2, p2, 0x18

    int-to-byte p2, p2

    .line 8
    aput-byte p2, v0, p1

    return-void
.end method

.method public putLong(IJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    long-to-int v2, p2

    int-to-byte v2, v2

    aput-byte v2, v0, p1

    add-int/lit8 v2, p1, 0x2

    const/16 v3, 0x8

    shr-long v3, p2, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 2
    aput-byte v3, v0, v1

    add-int/lit8 v1, p1, 0x3

    const/16 v3, 0x10

    shr-long v3, p2, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 3
    aput-byte v3, v0, v2

    add-int/lit8 v2, p1, 0x4

    const/16 v3, 0x18

    shr-long v3, p2, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 4
    aput-byte v3, v0, v1

    add-int/lit8 v1, p1, 0x5

    const/16 v3, 0x20

    shr-long v3, p2, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 5
    aput-byte v3, v0, v2

    add-int/lit8 v2, p1, 0x6

    const/16 v3, 0x28

    shr-long v3, p2, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 6
    aput-byte v3, v0, v1

    add-int/lit8 p1, p1, 0x7

    const/16 v1, 0x30

    shr-long v3, p2, v1

    long-to-int v1, v3

    int-to-byte v1, v1

    .line 7
    aput-byte v1, v0, v2

    const/16 v1, 0x38

    shr-long/2addr p2, v1

    long-to-int p2, p2

    int-to-byte p2, p2

    .line 8
    aput-byte p2, v0, p1

    return-void
.end method

.method public putLong(J)V
    .locals 1

    .line 9
    iget v0, p0, Lio/fastkv/FastBuffer;->position:I

    invoke-virtual {p0, v0, p1, p2}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 10
    iget p1, p0, Lio/fastkv/FastBuffer;->position:I

    add-int/lit8 p1, p1, 0x8

    iput p1, p0, Lio/fastkv/FastBuffer;->position:I

    return-void
.end method

.method public putShort(S)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lio/fastkv/FastBuffer;->position:I

    .line 8
    .line 9
    int-to-byte v3, p1

    .line 10
    aput-byte v3, v0, v1

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    iput v1, p0, Lio/fastkv/FastBuffer;->position:I

    .line 15
    .line 16
    shr-int/lit8 p1, p1, 0x8

    .line 17
    .line 18
    int-to-byte p1, p1

    .line 19
    aput-byte p1, v0, v2

    .line 20
    .line 21
    return-void
.end method

.method public putString(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lio/fastkv/FastBuffer;->encodeStr(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public putVarint32(II)I
    .locals 3

    :goto_0
    and-int/lit8 v0, p2, -0x80

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    and-int/lit8 v2, p2, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, p1

    ushr-int/lit8 p2, p2, 0x7

    move p1, v1

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lio/fastkv/FastBuffer;->hb:[B

    add-int/lit8 v1, p1, 0x1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return v1
.end method

.method public putVarint32(I)V
    .locals 1

    .line 3
    iget v0, p0, Lio/fastkv/FastBuffer;->position:I

    invoke-virtual {p0, v0, p1}, Lio/fastkv/FastBuffer;->putVarint32(II)I

    move-result p1

    iput p1, p0, Lio/fastkv/FastBuffer;->position:I

    return-void
.end method
