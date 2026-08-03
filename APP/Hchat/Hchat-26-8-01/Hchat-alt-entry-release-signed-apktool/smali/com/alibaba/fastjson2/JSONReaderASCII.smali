.class final Lcom/alibaba/fastjson2/JSONReaderASCII;
.super Lcom/alibaba/fastjson2/JSONReaderUTF8;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final str:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderASCII;->str:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iput-object p2, p1, Lcom/alibaba/fastjson2/JSONReaderASCII;->str:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 9
    .line 10
    return-void
.end method

.method public static getLong([BI)J
    .locals 7

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 6
    .line 7
    sget v1, Lsun/misc/Unsafe;->ARRAY_BYTE_BASE_OFFSET:I

    .line 8
    .line 9
    int-to-long v1, v1

    .line 10
    int-to-long v3, p1

    .line 11
    add-long/2addr v1, v3

    .line 12
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0

    .line 17
    :cond_0
    add-int/lit8 v0, p1, 0x7

    .line 18
    .line 19
    aget-byte v0, p0, v0

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    const/16 v2, 0x38

    .line 23
    .line 24
    shl-long/2addr v0, v2

    .line 25
    add-int/lit8 v2, p1, 0x6

    .line 26
    .line 27
    aget-byte v2, p0, v2

    .line 28
    .line 29
    int-to-long v2, v2

    .line 30
    const-wide/16 v4, 0xff

    .line 31
    .line 32
    and-long/2addr v2, v4

    .line 33
    const/16 v6, 0x30

    .line 34
    .line 35
    shl-long/2addr v2, v6

    .line 36
    add-long/2addr v0, v2

    .line 37
    add-int/lit8 v2, p1, 0x5

    .line 38
    .line 39
    aget-byte v2, p0, v2

    .line 40
    .line 41
    int-to-long v2, v2

    .line 42
    and-long/2addr v2, v4

    .line 43
    const/16 v6, 0x28

    .line 44
    .line 45
    shl-long/2addr v2, v6

    .line 46
    add-long/2addr v0, v2

    .line 47
    add-int/lit8 v2, p1, 0x4

    .line 48
    .line 49
    aget-byte v2, p0, v2

    .line 50
    .line 51
    int-to-long v2, v2

    .line 52
    and-long/2addr v2, v4

    .line 53
    const/16 v6, 0x20

    .line 54
    .line 55
    shl-long/2addr v2, v6

    .line 56
    add-long/2addr v0, v2

    .line 57
    add-int/lit8 v2, p1, 0x3

    .line 58
    .line 59
    aget-byte v2, p0, v2

    .line 60
    .line 61
    int-to-long v2, v2

    .line 62
    and-long/2addr v2, v4

    .line 63
    const/16 v6, 0x18

    .line 64
    .line 65
    shl-long/2addr v2, v6

    .line 66
    add-long/2addr v0, v2

    .line 67
    add-int/lit8 v2, p1, 0x2

    .line 68
    .line 69
    aget-byte v2, p0, v2

    .line 70
    .line 71
    int-to-long v2, v2

    .line 72
    and-long/2addr v2, v4

    .line 73
    const/16 v6, 0x10

    .line 74
    .line 75
    shl-long/2addr v2, v6

    .line 76
    add-long/2addr v0, v2

    .line 77
    add-int/lit8 v2, p1, 0x1

    .line 78
    .line 79
    aget-byte v2, p0, v2

    .line 80
    .line 81
    int-to-long v2, v2

    .line 82
    and-long/2addr v2, v4

    .line 83
    const/16 v6, 0x8

    .line 84
    .line 85
    shl-long/2addr v2, v6

    .line 86
    add-long/2addr v0, v2

    .line 87
    aget-byte p0, p0, p1

    .line 88
    .line 89
    int-to-long p0, p0

    .line 90
    and-long/2addr p0, v4

    .line 91
    add-long/2addr v0, p0

    .line 92
    return-wide v0
.end method


# virtual methods
.method public getFieldName()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 6
    .line 7
    sub-int v3, v1, v2

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 10
    .line 11
    if-nez v4, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderASCII;->str:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, [C

    .line 41
    .line 42
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 43
    .line 44
    :cond_2
    if-eqz v1, :cond_3

    .line 45
    .line 46
    array-length v2, v1

    .line 47
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 48
    .line 49
    if-ge v2, v3, :cond_4

    .line 50
    .line 51
    :cond_3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 52
    .line 53
    new-array v1, v1, [C

    .line 54
    .line 55
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 56
    .line 57
    :cond_4
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    move v4, v3

    .line 61
    :goto_0
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 62
    .line 63
    if-ge v2, v5, :cond_a

    .line 64
    .line 65
    aget-byte v5, v0, v2

    .line 66
    .line 67
    and-int/lit16 v5, v5, 0xff

    .line 68
    .line 69
    int-to-char v5, v5

    .line 70
    const/16 v6, 0x5c

    .line 71
    .line 72
    if-ne v5, v6, :cond_8

    .line 73
    .line 74
    add-int/lit8 v5, v2, 0x1

    .line 75
    .line 76
    aget-byte v6, v0, v5

    .line 77
    .line 78
    int-to-char v6, v6

    .line 79
    const/16 v7, 0x2a

    .line 80
    .line 81
    if-eq v6, v7, :cond_7

    .line 82
    .line 83
    const/16 v7, 0x2b

    .line 84
    .line 85
    if-eq v6, v7, :cond_7

    .line 86
    .line 87
    const/16 v7, 0x40

    .line 88
    .line 89
    if-eq v6, v7, :cond_7

    .line 90
    .line 91
    const/16 v7, 0x75

    .line 92
    .line 93
    if-eq v6, v7, :cond_6

    .line 94
    .line 95
    const/16 v7, 0x78

    .line 96
    .line 97
    if-eq v6, v7, :cond_5

    .line 98
    .line 99
    packed-switch v6, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    packed-switch v6, :pswitch_data_1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    move v9, v5

    .line 110
    move v5, v2

    .line 111
    move v2, v9

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    add-int/lit8 v5, v2, 0x2

    .line 114
    .line 115
    aget-byte v5, v0, v5

    .line 116
    .line 117
    add-int/lit8 v2, v2, 0x3

    .line 118
    .line 119
    aget-byte v6, v0, v2

    .line 120
    .line 121
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    goto :goto_1

    .line 126
    :cond_6
    add-int/lit8 v5, v2, 0x2

    .line 127
    .line 128
    aget-byte v5, v0, v5

    .line 129
    .line 130
    add-int/lit8 v6, v2, 0x3

    .line 131
    .line 132
    aget-byte v6, v0, v6

    .line 133
    .line 134
    add-int/lit8 v7, v2, 0x4

    .line 135
    .line 136
    aget-byte v7, v0, v7

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x5

    .line 139
    .line 140
    aget-byte v8, v0, v2

    .line 141
    .line 142
    invoke-static {v5, v6, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    goto :goto_1

    .line 147
    :cond_7
    :pswitch_0
    move v2, v5

    .line 148
    move v5, v6

    .line 149
    goto :goto_1

    .line 150
    :cond_8
    const/16 v6, 0x22

    .line 151
    .line 152
    if-ne v5, v6, :cond_9

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_9
    :goto_1
    aput-char v5, v1, v4

    .line 156
    .line 157
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    add-int/lit8 v4, v4, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_a
    :goto_2
    new-instance v0, Ljava/lang/String;

    .line 163
    .line 164
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 165
    .line 166
    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 167
    .line 168
    .line 169
    return-object v0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getNameHashCodeLCase()J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 6
    .line 7
    const/16 v3, 0x27

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v5, v2, -0x1

    .line 14
    .line 15
    aget-byte v5, v1, v5

    .line 16
    .line 17
    if-ne v5, v3, :cond_0

    .line 18
    .line 19
    move v5, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v4

    .line 22
    :goto_0
    const/4 v8, 0x0

    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    :goto_1
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 26
    .line 27
    const/16 v14, 0x2d

    .line 28
    .line 29
    const/16 v15, 0x5f

    .line 30
    .line 31
    const-wide/16 v16, 0x0

    .line 32
    .line 33
    const/16 v6, 0x78

    .line 34
    .line 35
    const/16 v7, 0x75

    .line 36
    .line 37
    const/16 v12, 0x5c

    .line 38
    .line 39
    const/16 v13, 0x20

    .line 40
    .line 41
    if-ge v2, v11, :cond_a

    .line 42
    .line 43
    aget-byte v11, v1, v2

    .line 44
    .line 45
    if-ne v11, v12, :cond_3

    .line 46
    .line 47
    add-int/lit8 v11, v2, 0x1

    .line 48
    .line 49
    aget-byte v12, v1, v11

    .line 50
    .line 51
    if-eq v12, v7, :cond_2

    .line 52
    .line 53
    if-eq v12, v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    move/from16 v19, v11

    .line 60
    .line 61
    move v11, v2

    .line 62
    move/from16 v2, v19

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    add-int/lit8 v11, v2, 0x2

    .line 66
    .line 67
    aget-byte v11, v1, v11

    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x3

    .line 70
    .line 71
    aget-byte v12, v1, v2

    .line 72
    .line 73
    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    add-int/lit8 v11, v2, 0x2

    .line 79
    .line 80
    aget-byte v11, v1, v11

    .line 81
    .line 82
    add-int/lit8 v12, v2, 0x3

    .line 83
    .line 84
    aget-byte v12, v1, v12

    .line 85
    .line 86
    add-int/lit8 v18, v2, 0x4

    .line 87
    .line 88
    aget-byte v6, v1, v18

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x5

    .line 91
    .line 92
    aget-byte v7, v1, v2

    .line 93
    .line 94
    invoke-static {v11, v12, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    if-ne v11, v5, :cond_4

    .line 100
    .line 101
    goto/16 :goto_9

    .line 102
    .line 103
    :cond_4
    :goto_2
    const/16 v6, 0xff

    .line 104
    .line 105
    if-gt v11, v6, :cond_9

    .line 106
    .line 107
    if-ltz v11, :cond_9

    .line 108
    .line 109
    const/16 v6, 0x8

    .line 110
    .line 111
    if-ge v8, v6, :cond_9

    .line 112
    .line 113
    if-nez v8, :cond_5

    .line 114
    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :cond_5
    if-eq v11, v15, :cond_7

    .line 120
    .line 121
    if-eq v11, v14, :cond_7

    .line 122
    .line 123
    if-ne v11, v13, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/16 v7, 0x41

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    :goto_3
    add-int/lit8 v7, v2, 0x1

    .line 130
    .line 131
    aget-byte v7, v1, v7

    .line 132
    .line 133
    if-eq v7, v4, :cond_6

    .line 134
    .line 135
    if-eq v7, v3, :cond_6

    .line 136
    .line 137
    if-eq v7, v11, :cond_6

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :goto_4
    if-lt v11, v7, :cond_8

    .line 141
    .line 142
    const/16 v7, 0x5a

    .line 143
    .line 144
    if-gt v11, v7, :cond_8

    .line 145
    .line 146
    add-int/lit8 v11, v11, 0x20

    .line 147
    .line 148
    int-to-char v11, v11

    .line 149
    :cond_8
    packed-switch v8, :pswitch_data_0

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :pswitch_0
    int-to-byte v6, v11

    .line 154
    int-to-long v6, v6

    .line 155
    const/16 v11, 0x38

    .line 156
    .line 157
    shl-long/2addr v6, v11

    .line 158
    const-wide v11, 0xffffffffffffffL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    :goto_5
    and-long/2addr v9, v11

    .line 164
    add-long/2addr v9, v6

    .line 165
    goto :goto_6

    .line 166
    :pswitch_1
    int-to-byte v6, v11

    .line 167
    int-to-long v6, v6

    .line 168
    const/16 v11, 0x30

    .line 169
    .line 170
    shl-long/2addr v6, v11

    .line 171
    const-wide v11, 0xffffffffffffL

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :pswitch_2
    int-to-byte v6, v11

    .line 178
    int-to-long v6, v6

    .line 179
    const/16 v11, 0x28

    .line 180
    .line 181
    shl-long/2addr v6, v11

    .line 182
    const-wide v11, 0xffffffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :pswitch_3
    int-to-byte v6, v11

    .line 189
    int-to-long v6, v6

    .line 190
    shl-long/2addr v6, v13

    .line 191
    const-wide v11, 0xffffffffL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :pswitch_4
    int-to-byte v6, v11

    .line 198
    shl-int/lit8 v6, v6, 0x18

    .line 199
    .line 200
    int-to-long v6, v6

    .line 201
    const-wide/32 v11, 0xffffff

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :pswitch_5
    int-to-byte v6, v11

    .line 206
    shl-int/lit8 v6, v6, 0x10

    .line 207
    .line 208
    int-to-long v6, v6

    .line 209
    const-wide/32 v11, 0xffff

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :pswitch_6
    int-to-byte v7, v11

    .line 214
    shl-int/lit8 v6, v7, 0x8

    .line 215
    .line 216
    int-to-long v6, v6

    .line 217
    const-wide/16 v11, 0xff

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :pswitch_7
    int-to-byte v6, v11

    .line 221
    int-to-long v9, v6

    .line 222
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 223
    .line 224
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :cond_9
    :goto_8
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 229
    .line 230
    move-wide/from16 v9, v16

    .line 231
    .line 232
    :cond_a
    :goto_9
    cmp-long v6, v9, v16

    .line 233
    .line 234
    if-eqz v6, :cond_b

    .line 235
    .line 236
    return-wide v9

    .line 237
    :cond_b
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    :goto_a
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 243
    .line 244
    if-ge v2, v8, :cond_14

    .line 245
    .line 246
    aget-byte v8, v1, v2

    .line 247
    .line 248
    const/16 v9, 0x5c

    .line 249
    .line 250
    if-ne v8, v9, :cond_e

    .line 251
    .line 252
    add-int/lit8 v8, v2, 0x1

    .line 253
    .line 254
    aget-byte v10, v1, v8

    .line 255
    .line 256
    const/16 v11, 0x75

    .line 257
    .line 258
    if-eq v10, v11, :cond_d

    .line 259
    .line 260
    const/16 v12, 0x78

    .line 261
    .line 262
    if-eq v10, v12, :cond_c

    .line 263
    .line 264
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    move/from16 v19, v8

    .line 269
    .line 270
    move v8, v2

    .line 271
    move/from16 v2, v19

    .line 272
    .line 273
    goto :goto_b

    .line 274
    :cond_c
    add-int/lit8 v8, v2, 0x2

    .line 275
    .line 276
    aget-byte v8, v1, v8

    .line 277
    .line 278
    add-int/lit8 v2, v2, 0x3

    .line 279
    .line 280
    aget-byte v10, v1, v2

    .line 281
    .line 282
    invoke-static {v8, v10}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    goto :goto_b

    .line 287
    :cond_d
    const/16 v12, 0x78

    .line 288
    .line 289
    add-int/lit8 v8, v2, 0x2

    .line 290
    .line 291
    aget-byte v8, v1, v8

    .line 292
    .line 293
    add-int/lit8 v10, v2, 0x3

    .line 294
    .line 295
    aget-byte v10, v1, v10

    .line 296
    .line 297
    add-int/lit8 v16, v2, 0x4

    .line 298
    .line 299
    aget-byte v9, v1, v16

    .line 300
    .line 301
    add-int/lit8 v2, v2, 0x5

    .line 302
    .line 303
    aget-byte v11, v1, v2

    .line 304
    .line 305
    invoke-static {v8, v10, v9, v11}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    goto :goto_b

    .line 310
    :cond_e
    const/16 v12, 0x78

    .line 311
    .line 312
    if-ne v8, v5, :cond_f

    .line 313
    .line 314
    goto :goto_e

    .line 315
    :cond_f
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 316
    .line 317
    if-eq v8, v15, :cond_11

    .line 318
    .line 319
    if-eq v8, v14, :cond_11

    .line 320
    .line 321
    if-ne v8, v13, :cond_10

    .line 322
    .line 323
    goto :goto_c

    .line 324
    :cond_10
    const/16 v9, 0x41

    .line 325
    .line 326
    goto :goto_d

    .line 327
    :cond_11
    :goto_c
    aget-byte v9, v1, v2

    .line 328
    .line 329
    if-eq v9, v4, :cond_10

    .line 330
    .line 331
    if-eq v9, v3, :cond_10

    .line 332
    .line 333
    if-eq v9, v8, :cond_10

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :goto_d
    const/16 v10, 0x5a

    .line 337
    .line 338
    if-lt v8, v9, :cond_12

    .line 339
    .line 340
    if-gt v8, v10, :cond_12

    .line 341
    .line 342
    add-int/lit8 v8, v8, 0x20

    .line 343
    .line 344
    int-to-char v8, v8

    .line 345
    :cond_12
    if-gez v8, :cond_13

    .line 346
    .line 347
    and-int/lit16 v8, v8, 0xff

    .line 348
    .line 349
    :cond_13
    int-to-long v3, v8

    .line 350
    xor-long/2addr v3, v6

    .line 351
    const-wide v6, 0x100000001b3L

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    mul-long/2addr v6, v3

    .line 357
    const/16 v3, 0x27

    .line 358
    .line 359
    const/16 v4, 0x22

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_14
    :goto_e
    return-wide v6

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public next()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    :goto_0
    move v1, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    aget-byte v1, v0, v1

    .line 17
    .line 18
    :goto_1
    if-eqz v1, :cond_3

    .line 19
    .line 20
    if-lez v1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x20

    .line 23
    .line 24
    if-gt v1, v4, :cond_1

    .line 25
    .line 26
    const-wide/16 v4, 0x1

    .line 27
    .line 28
    shl-long/2addr v4, v1

    .line 29
    const-wide v6, 0x100003701L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v4, v6

    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    cmp-long v4, v4, v6

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 43
    .line 44
    and-int/lit16 v0, v1, 0xff

    .line 45
    .line 46
    int-to-char v0, v0

    .line 47
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 48
    .line 49
    const/16 v0, 0x2f

    .line 50
    .line 51
    if-ne v1, v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void

    .line 57
    :cond_3
    :goto_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 58
    .line 59
    if-ne v2, v1, :cond_4

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    add-int/lit8 v1, v2, 0x1

    .line 63
    .line 64
    aget-byte v2, v0, v2

    .line 65
    .line 66
    move v8, v2

    .line 67
    move v2, v1

    .line 68
    move v1, v8

    .line 69
    goto :goto_1
.end method

.method public nextIfNullOrEmptyString()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    const/16 v5, 0x75

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v7, 0x6c

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/16 v9, 0x6e

    .line 18
    .line 19
    if-ne v1, v9, :cond_0

    .line 20
    .line 21
    add-int/lit8 v10, v3, 0x2

    .line 22
    .line 23
    if-ge v10, v2, :cond_0

    .line 24
    .line 25
    aget-byte v11, v4, v3

    .line 26
    .line 27
    if-ne v11, v5, :cond_0

    .line 28
    .line 29
    add-int/lit8 v11, v3, 0x1

    .line 30
    .line 31
    aget-byte v11, v4, v11

    .line 32
    .line 33
    if-ne v11, v7, :cond_0

    .line 34
    .line 35
    aget-byte v10, v4, v10

    .line 36
    .line 37
    if-ne v10, v7, :cond_0

    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/16 v10, 0x22

    .line 43
    .line 44
    if-eq v1, v10, :cond_2

    .line 45
    .line 46
    const/16 v10, 0x27

    .line 47
    .line 48
    if-ne v1, v10, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return v6

    .line 52
    :cond_2
    :goto_0
    if-ge v3, v2, :cond_3

    .line 53
    .line 54
    aget-byte v10, v4, v3

    .line 55
    .line 56
    if-ne v10, v1, :cond_3

    .line 57
    .line 58
    add-int/2addr v3, v8

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    add-int/lit8 v10, v3, 0x4

    .line 61
    .line 62
    if-ge v10, v2, :cond_c

    .line 63
    .line 64
    aget-byte v11, v4, v3

    .line 65
    .line 66
    if-ne v11, v9, :cond_c

    .line 67
    .line 68
    add-int/lit8 v9, v3, 0x1

    .line 69
    .line 70
    aget-byte v9, v4, v9

    .line 71
    .line 72
    if-ne v9, v5, :cond_c

    .line 73
    .line 74
    add-int/lit8 v5, v3, 0x2

    .line 75
    .line 76
    aget-byte v5, v4, v5

    .line 77
    .line 78
    if-ne v5, v7, :cond_c

    .line 79
    .line 80
    add-int/lit8 v5, v3, 0x3

    .line 81
    .line 82
    aget-byte v5, v4, v5

    .line 83
    .line 84
    if-ne v5, v7, :cond_c

    .line 85
    .line 86
    aget-byte v5, v4, v10

    .line 87
    .line 88
    if-ne v5, v1, :cond_c

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x5

    .line 91
    .line 92
    :goto_1
    const/16 v1, 0x1a

    .line 93
    .line 94
    if-ne v3, v2, :cond_4

    .line 95
    .line 96
    move v5, v3

    .line 97
    :goto_2
    move v3, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    add-int/lit8 v5, v3, 0x1

    .line 100
    .line 101
    aget-byte v3, v4, v3

    .line 102
    .line 103
    :goto_3
    const-wide/16 v9, 0x0

    .line 104
    .line 105
    const-wide v11, 0x100003701L

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    const-wide/16 v13, 0x1

    .line 111
    .line 112
    const/16 v7, 0x20

    .line 113
    .line 114
    if-ltz v3, :cond_6

    .line 115
    .line 116
    if-gt v3, v7, :cond_6

    .line 117
    .line 118
    shl-long v15, v13, v3

    .line 119
    .line 120
    and-long/2addr v15, v11

    .line 121
    cmp-long v15, v15, v9

    .line 122
    .line 123
    if-eqz v15, :cond_6

    .line 124
    .line 125
    if-ne v5, v2, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    add-int/lit8 v3, v5, 0x1

    .line 129
    .line 130
    aget-byte v5, v4, v5

    .line 131
    .line 132
    move/from16 v17, v5

    .line 133
    .line 134
    move v5, v3

    .line 135
    move/from16 v3, v17

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    const/16 v15, 0x2c

    .line 139
    .line 140
    if-ne v3, v15, :cond_7

    .line 141
    .line 142
    move v6, v8

    .line 143
    :cond_7
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 144
    .line 145
    if-eqz v6, :cond_9

    .line 146
    .line 147
    if-ne v5, v2, :cond_8

    .line 148
    .line 149
    :goto_4
    move v3, v1

    .line 150
    goto :goto_6

    .line 151
    :cond_8
    add-int/lit8 v3, v5, 0x1

    .line 152
    .line 153
    aget-byte v5, v4, v5

    .line 154
    .line 155
    :goto_5
    move/from16 v17, v5

    .line 156
    .line 157
    move v5, v3

    .line 158
    move/from16 v3, v17

    .line 159
    .line 160
    :cond_9
    :goto_6
    if-ltz v3, :cond_b

    .line 161
    .line 162
    if-gt v3, v7, :cond_b

    .line 163
    .line 164
    shl-long v15, v13, v3

    .line 165
    .line 166
    and-long/2addr v15, v11

    .line 167
    cmp-long v6, v15, v9

    .line 168
    .line 169
    if-eqz v6, :cond_b

    .line 170
    .line 171
    if-ne v5, v2, :cond_a

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_a
    add-int/lit8 v3, v5, 0x1

    .line 175
    .line 176
    aget-byte v5, v4, v5

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_b
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 180
    .line 181
    and-int/lit16 v1, v3, 0xff

    .line 182
    .line 183
    int-to-char v1, v1

    .line 184
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 185
    .line 186
    return v8

    .line 187
    :cond_c
    return v6
.end method

.method public nextIfObjectStart()Z
    .locals 9

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x7b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 14
    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    move v2, v1

    .line 20
    :goto_0
    move v1, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    aget-byte v1, v0, v1

    .line 25
    .line 26
    :goto_1
    if-eqz v1, :cond_4

    .line 27
    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    if-gt v1, v4, :cond_2

    .line 31
    .line 32
    const-wide/16 v4, 0x1

    .line 33
    .line 34
    shl-long/2addr v4, v1

    .line 35
    const-wide v6, 0x100003701L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v4, v6

    .line 41
    const-wide/16 v6, 0x0

    .line 42
    .line 43
    cmp-long v4, v4, v6

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    and-int/lit16 v0, v1, 0xff

    .line 49
    .line 50
    int-to-char v0, v0

    .line 51
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 52
    .line 53
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 54
    .line 55
    const/16 v0, 0x2f

    .line 56
    .line 57
    if-ne v1, v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 60
    .line 61
    .line 62
    :cond_3
    const/4 v0, 0x1

    .line 63
    return v0

    .line 64
    :cond_4
    :goto_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 65
    .line 66
    if-ne v2, v1, :cond_5

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    add-int/lit8 v1, v2, 0x1

    .line 70
    .line 71
    aget-byte v2, v0, v2

    .line 72
    .line 73
    move v8, v2

    .line 74
    move v2, v1

    .line 75
    move v1, v8

    .line 76
    goto :goto_1
.end method

.method public readFieldName()Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 12
    .line 13
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 14
    .line 15
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 16
    .line 17
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr v5, v7

    .line 20
    cmp-long v2, v5, v3

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    throw v1

    .line 30
    :cond_1
    :goto_0
    const/16 v2, 0x22

    .line 31
    .line 32
    if-eq v1, v2, :cond_3

    .line 33
    .line 34
    const/16 v2, 0x27

    .line 35
    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 39
    .line 40
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 41
    .line 42
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 43
    .line 44
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr v5, v7

    .line 47
    cmp-long v2, v5, v3

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONReader;->isFirstIdentifier(I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameUnquote()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    return-object v1

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    return-object v1

    .line 64
    :cond_3
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 68
    .line 69
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 72
    .line 73
    move v8, v5

    .line 74
    move v7, v6

    .line 75
    :goto_1
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 76
    .line 77
    const/16 v10, 0x20

    .line 78
    .line 79
    const/4 v11, 0x1

    .line 80
    if-ge v7, v9, :cond_d

    .line 81
    .line 82
    aget-byte v12, v2, v7

    .line 83
    .line 84
    const/16 v13, 0x5c

    .line 85
    .line 86
    if-ne v12, v13, :cond_6

    .line 87
    .line 88
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 89
    .line 90
    add-int/lit8 v9, v7, 0x1

    .line 91
    .line 92
    aget-byte v9, v2, v9

    .line 93
    .line 94
    const/16 v10, 0x75

    .line 95
    .line 96
    if-ne v9, v10, :cond_4

    .line 97
    .line 98
    const/4 v9, 0x6

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/16 v10, 0x78

    .line 101
    .line 102
    if-ne v9, v10, :cond_5

    .line 103
    .line 104
    const/4 v9, 0x4

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const/4 v9, 0x2

    .line 107
    :goto_2
    add-int/2addr v7, v9

    .line 108
    goto :goto_5

    .line 109
    :cond_6
    if-ne v12, v1, :cond_c

    .line 110
    .line 111
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 112
    .line 113
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 114
    .line 115
    add-int/lit8 v7, v7, 0x1

    .line 116
    .line 117
    if-ge v7, v9, :cond_7

    .line 118
    .line 119
    aget-byte v1, v2, v7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    const/16 v1, 0x1a

    .line 123
    .line 124
    :goto_3
    if-gt v1, v10, :cond_8

    .line 125
    .line 126
    const-wide/16 v8, 0x1

    .line 127
    .line 128
    shl-long/2addr v8, v1

    .line 129
    const-wide v12, 0x100003701L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    and-long/2addr v8, v12

    .line 135
    cmp-long v8, v8, v3

    .line 136
    .line 137
    if-eqz v8, :cond_8

    .line 138
    .line 139
    add-int/lit8 v7, v7, 0x1

    .line 140
    .line 141
    aget-byte v1, v2, v7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    const/16 v8, 0x3a

    .line 145
    .line 146
    if-ne v1, v8, :cond_b

    .line 147
    .line 148
    add-int/2addr v7, v11

    .line 149
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 150
    .line 151
    if-ge v7, v1, :cond_a

    .line 152
    .line 153
    aget-byte v1, v2, v7

    .line 154
    .line 155
    :goto_4
    if-gt v1, v10, :cond_9

    .line 156
    .line 157
    const-wide/16 v8, 0x1

    .line 158
    .line 159
    shl-long/2addr v8, v1

    .line 160
    const-wide v12, 0x100003701L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v8, v12

    .line 166
    cmp-long v8, v8, v3

    .line 167
    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    add-int/lit8 v7, v7, 0x1

    .line 171
    .line 172
    aget-byte v1, v2, v7

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    add-int/lit8 v3, v7, 0x1

    .line 176
    .line 177
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 178
    .line 179
    int-to-char v1, v1

    .line 180
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_a
    const/16 v1, 0x1a

    .line 184
    .line 185
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 186
    .line 187
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    throw v1

    .line 192
    :cond_b
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 193
    .line 194
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    throw v1

    .line 199
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 200
    .line 201
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_d
    :goto_6
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 206
    .line 207
    if-lt v1, v6, :cond_14

    .line 208
    .line 209
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 210
    .line 211
    if-nez v3, :cond_13

    .line 212
    .line 213
    sub-int/2addr v1, v6

    .line 214
    const/16 v7, 0x38

    .line 215
    .line 216
    const/16 v9, 0x28

    .line 217
    .line 218
    const/16 v12, 0x18

    .line 219
    .line 220
    const/16 v13, 0x10

    .line 221
    .line 222
    const/16 v14, 0x8

    .line 223
    .line 224
    const-wide/16 v15, 0xff

    .line 225
    .line 226
    packed-switch v1, :pswitch_data_0

    .line 227
    .line 228
    .line 229
    move/from16 v21, v10

    .line 230
    .line 231
    const-wide/16 v14, -0x1

    .line 232
    .line 233
    const-wide/16 v16, -0x1

    .line 234
    .line 235
    const-wide/16 v18, -0x1

    .line 236
    .line 237
    goto/16 :goto_c

    .line 238
    .line 239
    :pswitch_0
    add-int/lit8 v17, v6, 0x7

    .line 240
    .line 241
    const-wide/16 v18, -0x1

    .line 242
    .line 243
    aget-byte v3, v2, v17

    .line 244
    .line 245
    int-to-long v3, v3

    .line 246
    shl-long/2addr v3, v7

    .line 247
    add-int/lit8 v17, v6, 0x6

    .line 248
    .line 249
    aget-byte v5, v2, v17

    .line 250
    .line 251
    move/from16 v17, v7

    .line 252
    .line 253
    const/16 v20, 0x30

    .line 254
    .line 255
    int-to-long v7, v5

    .line 256
    and-long/2addr v7, v15

    .line 257
    shl-long v7, v7, v20

    .line 258
    .line 259
    add-long/2addr v3, v7

    .line 260
    add-int/lit8 v5, v6, 0x5

    .line 261
    .line 262
    aget-byte v5, v2, v5

    .line 263
    .line 264
    int-to-long v7, v5

    .line 265
    and-long/2addr v7, v15

    .line 266
    shl-long/2addr v7, v9

    .line 267
    add-long/2addr v3, v7

    .line 268
    add-int/lit8 v5, v6, 0x4

    .line 269
    .line 270
    aget-byte v5, v2, v5

    .line 271
    .line 272
    int-to-long v7, v5

    .line 273
    and-long/2addr v7, v15

    .line 274
    shl-long/2addr v7, v10

    .line 275
    add-long/2addr v3, v7

    .line 276
    add-int/lit8 v5, v6, 0x3

    .line 277
    .line 278
    aget-byte v5, v2, v5

    .line 279
    .line 280
    int-to-long v7, v5

    .line 281
    and-long/2addr v7, v15

    .line 282
    shl-long/2addr v7, v12

    .line 283
    add-long/2addr v3, v7

    .line 284
    add-int/lit8 v5, v6, 0x2

    .line 285
    .line 286
    aget-byte v5, v2, v5

    .line 287
    .line 288
    int-to-long v7, v5

    .line 289
    and-long/2addr v7, v15

    .line 290
    shl-long/2addr v7, v13

    .line 291
    add-long/2addr v3, v7

    .line 292
    add-int/lit8 v5, v6, 0x1

    .line 293
    .line 294
    aget-byte v5, v2, v5

    .line 295
    .line 296
    int-to-long v7, v5

    .line 297
    and-long/2addr v7, v15

    .line 298
    shl-long/2addr v7, v14

    .line 299
    add-long/2addr v3, v7

    .line 300
    aget-byte v5, v2, v6

    .line 301
    .line 302
    int-to-long v7, v5

    .line 303
    and-long/2addr v7, v15

    .line 304
    add-long/2addr v3, v7

    .line 305
    add-int/lit8 v5, v6, 0xf

    .line 306
    .line 307
    aget-byte v5, v2, v5

    .line 308
    .line 309
    int-to-long v7, v5

    .line 310
    shl-long v7, v7, v17

    .line 311
    .line 312
    add-int/lit8 v5, v6, 0xe

    .line 313
    .line 314
    aget-byte v5, v2, v5

    .line 315
    .line 316
    move/from16 v22, v9

    .line 317
    .line 318
    move/from16 v21, v10

    .line 319
    .line 320
    int-to-long v9, v5

    .line 321
    and-long/2addr v9, v15

    .line 322
    shl-long v9, v9, v20

    .line 323
    .line 324
    add-long/2addr v7, v9

    .line 325
    add-int/lit8 v5, v6, 0xd

    .line 326
    .line 327
    aget-byte v5, v2, v5

    .line 328
    .line 329
    int-to-long v9, v5

    .line 330
    and-long/2addr v9, v15

    .line 331
    shl-long v9, v9, v22

    .line 332
    .line 333
    add-long/2addr v7, v9

    .line 334
    add-int/lit8 v5, v6, 0xc

    .line 335
    .line 336
    aget-byte v5, v2, v5

    .line 337
    .line 338
    int-to-long v9, v5

    .line 339
    and-long/2addr v9, v15

    .line 340
    shl-long v9, v9, v21

    .line 341
    .line 342
    add-long/2addr v7, v9

    .line 343
    add-int/lit8 v5, v6, 0xb

    .line 344
    .line 345
    aget-byte v5, v2, v5

    .line 346
    .line 347
    int-to-long v9, v5

    .line 348
    and-long/2addr v9, v15

    .line 349
    shl-long/2addr v9, v12

    .line 350
    add-long/2addr v7, v9

    .line 351
    add-int/lit8 v5, v6, 0xa

    .line 352
    .line 353
    aget-byte v5, v2, v5

    .line 354
    .line 355
    int-to-long v9, v5

    .line 356
    and-long/2addr v9, v15

    .line 357
    shl-long/2addr v9, v13

    .line 358
    add-long/2addr v7, v9

    .line 359
    add-int/lit8 v5, v6, 0x9

    .line 360
    .line 361
    aget-byte v5, v2, v5

    .line 362
    .line 363
    int-to-long v9, v5

    .line 364
    and-long/2addr v9, v15

    .line 365
    shl-long/2addr v9, v14

    .line 366
    add-long/2addr v7, v9

    .line 367
    add-int/lit8 v5, v6, 0x8

    .line 368
    .line 369
    aget-byte v5, v2, v5

    .line 370
    .line 371
    :goto_7
    int-to-long v9, v5

    .line 372
    and-long/2addr v9, v15

    .line 373
    add-long/2addr v7, v9

    .line 374
    move-wide v14, v3

    .line 375
    move-wide/from16 v16, v7

    .line 376
    .line 377
    goto/16 :goto_c

    .line 378
    .line 379
    :pswitch_1
    move/from16 v17, v7

    .line 380
    .line 381
    move/from16 v22, v9

    .line 382
    .line 383
    move/from16 v21, v10

    .line 384
    .line 385
    const-wide/16 v18, -0x1

    .line 386
    .line 387
    const/16 v20, 0x30

    .line 388
    .line 389
    add-int/lit8 v3, v6, 0x6

    .line 390
    .line 391
    aget-byte v3, v2, v3

    .line 392
    .line 393
    int-to-long v3, v3

    .line 394
    shl-long v3, v3, v20

    .line 395
    .line 396
    add-int/lit8 v5, v6, 0x5

    .line 397
    .line 398
    aget-byte v5, v2, v5

    .line 399
    .line 400
    int-to-long v7, v5

    .line 401
    and-long/2addr v7, v15

    .line 402
    shl-long v7, v7, v22

    .line 403
    .line 404
    add-long/2addr v3, v7

    .line 405
    add-int/lit8 v5, v6, 0x4

    .line 406
    .line 407
    aget-byte v5, v2, v5

    .line 408
    .line 409
    int-to-long v7, v5

    .line 410
    and-long/2addr v7, v15

    .line 411
    shl-long v7, v7, v21

    .line 412
    .line 413
    add-long/2addr v3, v7

    .line 414
    add-int/lit8 v5, v6, 0x3

    .line 415
    .line 416
    aget-byte v5, v2, v5

    .line 417
    .line 418
    int-to-long v7, v5

    .line 419
    and-long/2addr v7, v15

    .line 420
    shl-long/2addr v7, v12

    .line 421
    add-long/2addr v3, v7

    .line 422
    add-int/lit8 v5, v6, 0x2

    .line 423
    .line 424
    aget-byte v5, v2, v5

    .line 425
    .line 426
    int-to-long v7, v5

    .line 427
    and-long/2addr v7, v15

    .line 428
    shl-long/2addr v7, v13

    .line 429
    add-long/2addr v3, v7

    .line 430
    add-int/lit8 v5, v6, 0x1

    .line 431
    .line 432
    aget-byte v5, v2, v5

    .line 433
    .line 434
    int-to-long v7, v5

    .line 435
    and-long/2addr v7, v15

    .line 436
    shl-long/2addr v7, v14

    .line 437
    add-long/2addr v3, v7

    .line 438
    aget-byte v5, v2, v6

    .line 439
    .line 440
    int-to-long v7, v5

    .line 441
    and-long/2addr v7, v15

    .line 442
    add-long/2addr v3, v7

    .line 443
    add-int/lit8 v5, v6, 0xe

    .line 444
    .line 445
    aget-byte v5, v2, v5

    .line 446
    .line 447
    int-to-long v7, v5

    .line 448
    shl-long v7, v7, v17

    .line 449
    .line 450
    add-int/lit8 v5, v6, 0xd

    .line 451
    .line 452
    aget-byte v5, v2, v5

    .line 453
    .line 454
    int-to-long v9, v5

    .line 455
    and-long/2addr v9, v15

    .line 456
    shl-long v9, v9, v20

    .line 457
    .line 458
    add-long/2addr v7, v9

    .line 459
    add-int/lit8 v5, v6, 0xc

    .line 460
    .line 461
    aget-byte v5, v2, v5

    .line 462
    .line 463
    int-to-long v9, v5

    .line 464
    and-long/2addr v9, v15

    .line 465
    shl-long v9, v9, v22

    .line 466
    .line 467
    add-long/2addr v7, v9

    .line 468
    add-int/lit8 v5, v6, 0xb

    .line 469
    .line 470
    aget-byte v5, v2, v5

    .line 471
    .line 472
    int-to-long v9, v5

    .line 473
    and-long/2addr v9, v15

    .line 474
    shl-long v9, v9, v21

    .line 475
    .line 476
    add-long/2addr v7, v9

    .line 477
    add-int/lit8 v5, v6, 0xa

    .line 478
    .line 479
    aget-byte v5, v2, v5

    .line 480
    .line 481
    int-to-long v9, v5

    .line 482
    and-long/2addr v9, v15

    .line 483
    shl-long/2addr v9, v12

    .line 484
    add-long/2addr v7, v9

    .line 485
    add-int/lit8 v5, v6, 0x9

    .line 486
    .line 487
    aget-byte v5, v2, v5

    .line 488
    .line 489
    int-to-long v9, v5

    .line 490
    and-long/2addr v9, v15

    .line 491
    shl-long/2addr v9, v13

    .line 492
    add-long/2addr v7, v9

    .line 493
    add-int/lit8 v5, v6, 0x8

    .line 494
    .line 495
    aget-byte v5, v2, v5

    .line 496
    .line 497
    int-to-long v9, v5

    .line 498
    and-long/2addr v9, v15

    .line 499
    shl-long/2addr v9, v14

    .line 500
    add-long/2addr v7, v9

    .line 501
    add-int/lit8 v5, v6, 0x7

    .line 502
    .line 503
    aget-byte v5, v2, v5

    .line 504
    .line 505
    goto/16 :goto_7

    .line 506
    .line 507
    :pswitch_2
    move/from16 v17, v7

    .line 508
    .line 509
    move/from16 v22, v9

    .line 510
    .line 511
    move/from16 v21, v10

    .line 512
    .line 513
    const-wide/16 v18, -0x1

    .line 514
    .line 515
    const/16 v20, 0x30

    .line 516
    .line 517
    add-int/lit8 v3, v6, 0x5

    .line 518
    .line 519
    aget-byte v3, v2, v3

    .line 520
    .line 521
    int-to-long v3, v3

    .line 522
    shl-long v3, v3, v22

    .line 523
    .line 524
    add-int/lit8 v5, v6, 0x4

    .line 525
    .line 526
    aget-byte v5, v2, v5

    .line 527
    .line 528
    int-to-long v7, v5

    .line 529
    and-long/2addr v7, v15

    .line 530
    shl-long v7, v7, v21

    .line 531
    .line 532
    add-long/2addr v3, v7

    .line 533
    add-int/lit8 v5, v6, 0x3

    .line 534
    .line 535
    aget-byte v5, v2, v5

    .line 536
    .line 537
    int-to-long v7, v5

    .line 538
    and-long/2addr v7, v15

    .line 539
    shl-long/2addr v7, v12

    .line 540
    add-long/2addr v3, v7

    .line 541
    add-int/lit8 v5, v6, 0x2

    .line 542
    .line 543
    aget-byte v5, v2, v5

    .line 544
    .line 545
    int-to-long v7, v5

    .line 546
    and-long/2addr v7, v15

    .line 547
    shl-long/2addr v7, v13

    .line 548
    add-long/2addr v3, v7

    .line 549
    add-int/lit8 v5, v6, 0x1

    .line 550
    .line 551
    aget-byte v5, v2, v5

    .line 552
    .line 553
    int-to-long v7, v5

    .line 554
    and-long/2addr v7, v15

    .line 555
    shl-long/2addr v7, v14

    .line 556
    add-long/2addr v3, v7

    .line 557
    aget-byte v5, v2, v6

    .line 558
    .line 559
    int-to-long v7, v5

    .line 560
    and-long/2addr v7, v15

    .line 561
    add-long/2addr v3, v7

    .line 562
    add-int/lit8 v5, v6, 0xd

    .line 563
    .line 564
    aget-byte v5, v2, v5

    .line 565
    .line 566
    int-to-long v7, v5

    .line 567
    shl-long v7, v7, v17

    .line 568
    .line 569
    add-int/lit8 v5, v6, 0xc

    .line 570
    .line 571
    aget-byte v5, v2, v5

    .line 572
    .line 573
    int-to-long v9, v5

    .line 574
    and-long/2addr v9, v15

    .line 575
    shl-long v9, v9, v20

    .line 576
    .line 577
    add-long/2addr v7, v9

    .line 578
    add-int/lit8 v5, v6, 0xb

    .line 579
    .line 580
    aget-byte v5, v2, v5

    .line 581
    .line 582
    int-to-long v9, v5

    .line 583
    and-long/2addr v9, v15

    .line 584
    shl-long v9, v9, v22

    .line 585
    .line 586
    add-long/2addr v7, v9

    .line 587
    add-int/lit8 v5, v6, 0xa

    .line 588
    .line 589
    aget-byte v5, v2, v5

    .line 590
    .line 591
    int-to-long v9, v5

    .line 592
    and-long/2addr v9, v15

    .line 593
    shl-long v9, v9, v21

    .line 594
    .line 595
    add-long/2addr v7, v9

    .line 596
    add-int/lit8 v5, v6, 0x9

    .line 597
    .line 598
    aget-byte v5, v2, v5

    .line 599
    .line 600
    int-to-long v9, v5

    .line 601
    and-long/2addr v9, v15

    .line 602
    shl-long/2addr v9, v12

    .line 603
    add-long/2addr v7, v9

    .line 604
    add-int/lit8 v5, v6, 0x8

    .line 605
    .line 606
    aget-byte v5, v2, v5

    .line 607
    .line 608
    int-to-long v9, v5

    .line 609
    and-long/2addr v9, v15

    .line 610
    shl-long/2addr v9, v13

    .line 611
    add-long/2addr v7, v9

    .line 612
    add-int/lit8 v5, v6, 0x7

    .line 613
    .line 614
    aget-byte v5, v2, v5

    .line 615
    .line 616
    int-to-long v9, v5

    .line 617
    and-long/2addr v9, v15

    .line 618
    shl-long/2addr v9, v14

    .line 619
    add-long/2addr v7, v9

    .line 620
    add-int/lit8 v5, v6, 0x6

    .line 621
    .line 622
    aget-byte v5, v2, v5

    .line 623
    .line 624
    goto/16 :goto_7

    .line 625
    .line 626
    :pswitch_3
    move/from16 v17, v7

    .line 627
    .line 628
    move/from16 v22, v9

    .line 629
    .line 630
    move/from16 v21, v10

    .line 631
    .line 632
    const-wide/16 v18, -0x1

    .line 633
    .line 634
    const/16 v20, 0x30

    .line 635
    .line 636
    add-int/lit8 v3, v6, 0x4

    .line 637
    .line 638
    aget-byte v3, v2, v3

    .line 639
    .line 640
    int-to-long v3, v3

    .line 641
    shl-long v3, v3, v21

    .line 642
    .line 643
    add-int/lit8 v5, v6, 0x3

    .line 644
    .line 645
    aget-byte v5, v2, v5

    .line 646
    .line 647
    int-to-long v7, v5

    .line 648
    shl-long/2addr v7, v12

    .line 649
    add-long/2addr v3, v7

    .line 650
    add-int/lit8 v5, v6, 0x2

    .line 651
    .line 652
    aget-byte v5, v2, v5

    .line 653
    .line 654
    int-to-long v7, v5

    .line 655
    shl-long/2addr v7, v13

    .line 656
    add-long/2addr v3, v7

    .line 657
    add-int/lit8 v5, v6, 0x1

    .line 658
    .line 659
    aget-byte v5, v2, v5

    .line 660
    .line 661
    int-to-long v7, v5

    .line 662
    shl-long/2addr v7, v14

    .line 663
    add-long/2addr v3, v7

    .line 664
    aget-byte v5, v2, v6

    .line 665
    .line 666
    int-to-long v7, v5

    .line 667
    add-long/2addr v3, v7

    .line 668
    add-int/lit8 v5, v6, 0xc

    .line 669
    .line 670
    aget-byte v5, v2, v5

    .line 671
    .line 672
    int-to-long v7, v5

    .line 673
    shl-long v7, v7, v17

    .line 674
    .line 675
    add-int/lit8 v5, v6, 0xb

    .line 676
    .line 677
    aget-byte v5, v2, v5

    .line 678
    .line 679
    int-to-long v9, v5

    .line 680
    and-long/2addr v9, v15

    .line 681
    shl-long v9, v9, v20

    .line 682
    .line 683
    add-long/2addr v7, v9

    .line 684
    add-int/lit8 v5, v6, 0xa

    .line 685
    .line 686
    aget-byte v5, v2, v5

    .line 687
    .line 688
    int-to-long v9, v5

    .line 689
    and-long/2addr v9, v15

    .line 690
    shl-long v9, v9, v22

    .line 691
    .line 692
    add-long/2addr v7, v9

    .line 693
    add-int/lit8 v5, v6, 0x9

    .line 694
    .line 695
    aget-byte v5, v2, v5

    .line 696
    .line 697
    int-to-long v9, v5

    .line 698
    and-long/2addr v9, v15

    .line 699
    shl-long v9, v9, v21

    .line 700
    .line 701
    add-long/2addr v7, v9

    .line 702
    add-int/lit8 v5, v6, 0x8

    .line 703
    .line 704
    aget-byte v5, v2, v5

    .line 705
    .line 706
    int-to-long v9, v5

    .line 707
    and-long/2addr v9, v15

    .line 708
    shl-long/2addr v9, v12

    .line 709
    add-long/2addr v7, v9

    .line 710
    add-int/lit8 v5, v6, 0x7

    .line 711
    .line 712
    aget-byte v5, v2, v5

    .line 713
    .line 714
    int-to-long v9, v5

    .line 715
    and-long/2addr v9, v15

    .line 716
    shl-long/2addr v9, v13

    .line 717
    add-long/2addr v7, v9

    .line 718
    add-int/lit8 v5, v6, 0x6

    .line 719
    .line 720
    aget-byte v5, v2, v5

    .line 721
    .line 722
    int-to-long v9, v5

    .line 723
    and-long/2addr v9, v15

    .line 724
    shl-long/2addr v9, v14

    .line 725
    add-long/2addr v7, v9

    .line 726
    add-int/lit8 v5, v6, 0x5

    .line 727
    .line 728
    aget-byte v5, v2, v5

    .line 729
    .line 730
    goto/16 :goto_7

    .line 731
    .line 732
    :pswitch_4
    move/from16 v17, v7

    .line 733
    .line 734
    move/from16 v22, v9

    .line 735
    .line 736
    move/from16 v21, v10

    .line 737
    .line 738
    const-wide/16 v18, -0x1

    .line 739
    .line 740
    const/16 v20, 0x30

    .line 741
    .line 742
    add-int/lit8 v3, v6, 0x3

    .line 743
    .line 744
    aget-byte v3, v2, v3

    .line 745
    .line 746
    shl-int/2addr v3, v12

    .line 747
    add-int/lit8 v4, v6, 0x2

    .line 748
    .line 749
    aget-byte v4, v2, v4

    .line 750
    .line 751
    shl-int/2addr v4, v13

    .line 752
    add-int/2addr v3, v4

    .line 753
    add-int/lit8 v4, v6, 0x1

    .line 754
    .line 755
    aget-byte v4, v2, v4

    .line 756
    .line 757
    shl-int/2addr v4, v14

    .line 758
    add-int/2addr v3, v4

    .line 759
    aget-byte v4, v2, v6

    .line 760
    .line 761
    add-int/2addr v3, v4

    .line 762
    int-to-long v3, v3

    .line 763
    add-int/lit8 v5, v6, 0xb

    .line 764
    .line 765
    aget-byte v5, v2, v5

    .line 766
    .line 767
    int-to-long v7, v5

    .line 768
    shl-long v7, v7, v17

    .line 769
    .line 770
    add-int/lit8 v5, v6, 0xa

    .line 771
    .line 772
    aget-byte v5, v2, v5

    .line 773
    .line 774
    int-to-long v9, v5

    .line 775
    and-long/2addr v9, v15

    .line 776
    shl-long v9, v9, v20

    .line 777
    .line 778
    add-long/2addr v7, v9

    .line 779
    add-int/lit8 v5, v6, 0x9

    .line 780
    .line 781
    aget-byte v5, v2, v5

    .line 782
    .line 783
    int-to-long v9, v5

    .line 784
    and-long/2addr v9, v15

    .line 785
    shl-long v9, v9, v22

    .line 786
    .line 787
    add-long/2addr v7, v9

    .line 788
    add-int/lit8 v5, v6, 0x8

    .line 789
    .line 790
    aget-byte v5, v2, v5

    .line 791
    .line 792
    int-to-long v9, v5

    .line 793
    and-long/2addr v9, v15

    .line 794
    shl-long v9, v9, v21

    .line 795
    .line 796
    add-long/2addr v7, v9

    .line 797
    add-int/lit8 v5, v6, 0x7

    .line 798
    .line 799
    aget-byte v5, v2, v5

    .line 800
    .line 801
    int-to-long v9, v5

    .line 802
    and-long/2addr v9, v15

    .line 803
    shl-long/2addr v9, v12

    .line 804
    add-long/2addr v7, v9

    .line 805
    add-int/lit8 v5, v6, 0x6

    .line 806
    .line 807
    aget-byte v5, v2, v5

    .line 808
    .line 809
    int-to-long v9, v5

    .line 810
    and-long/2addr v9, v15

    .line 811
    shl-long/2addr v9, v13

    .line 812
    add-long/2addr v7, v9

    .line 813
    add-int/lit8 v5, v6, 0x5

    .line 814
    .line 815
    aget-byte v5, v2, v5

    .line 816
    .line 817
    int-to-long v9, v5

    .line 818
    and-long/2addr v9, v15

    .line 819
    shl-long/2addr v9, v14

    .line 820
    add-long/2addr v7, v9

    .line 821
    add-int/lit8 v5, v6, 0x4

    .line 822
    .line 823
    aget-byte v5, v2, v5

    .line 824
    .line 825
    goto/16 :goto_7

    .line 826
    .line 827
    :pswitch_5
    move/from16 v17, v7

    .line 828
    .line 829
    move/from16 v22, v9

    .line 830
    .line 831
    move/from16 v21, v10

    .line 832
    .line 833
    const-wide/16 v18, -0x1

    .line 834
    .line 835
    const/16 v20, 0x30

    .line 836
    .line 837
    add-int/lit8 v3, v6, 0x2

    .line 838
    .line 839
    aget-byte v3, v2, v3

    .line 840
    .line 841
    shl-int/2addr v3, v13

    .line 842
    add-int/lit8 v4, v6, 0x1

    .line 843
    .line 844
    aget-byte v4, v2, v4

    .line 845
    .line 846
    shl-int/2addr v4, v14

    .line 847
    add-int/2addr v3, v4

    .line 848
    aget-byte v4, v2, v6

    .line 849
    .line 850
    add-int/2addr v3, v4

    .line 851
    int-to-long v3, v3

    .line 852
    add-int/lit8 v5, v6, 0xa

    .line 853
    .line 854
    aget-byte v5, v2, v5

    .line 855
    .line 856
    int-to-long v7, v5

    .line 857
    shl-long v7, v7, v17

    .line 858
    .line 859
    add-int/lit8 v5, v6, 0x9

    .line 860
    .line 861
    aget-byte v5, v2, v5

    .line 862
    .line 863
    int-to-long v9, v5

    .line 864
    and-long/2addr v9, v15

    .line 865
    shl-long v9, v9, v20

    .line 866
    .line 867
    add-long/2addr v7, v9

    .line 868
    add-int/lit8 v5, v6, 0x8

    .line 869
    .line 870
    aget-byte v5, v2, v5

    .line 871
    .line 872
    int-to-long v9, v5

    .line 873
    and-long/2addr v9, v15

    .line 874
    shl-long v9, v9, v22

    .line 875
    .line 876
    add-long/2addr v7, v9

    .line 877
    add-int/lit8 v5, v6, 0x7

    .line 878
    .line 879
    aget-byte v5, v2, v5

    .line 880
    .line 881
    int-to-long v9, v5

    .line 882
    and-long/2addr v9, v15

    .line 883
    shl-long v9, v9, v21

    .line 884
    .line 885
    add-long/2addr v7, v9

    .line 886
    add-int/lit8 v5, v6, 0x6

    .line 887
    .line 888
    aget-byte v5, v2, v5

    .line 889
    .line 890
    int-to-long v9, v5

    .line 891
    and-long/2addr v9, v15

    .line 892
    shl-long/2addr v9, v12

    .line 893
    add-long/2addr v7, v9

    .line 894
    add-int/lit8 v5, v6, 0x5

    .line 895
    .line 896
    aget-byte v5, v2, v5

    .line 897
    .line 898
    int-to-long v9, v5

    .line 899
    and-long/2addr v9, v15

    .line 900
    shl-long/2addr v9, v13

    .line 901
    add-long/2addr v7, v9

    .line 902
    add-int/lit8 v5, v6, 0x4

    .line 903
    .line 904
    aget-byte v5, v2, v5

    .line 905
    .line 906
    int-to-long v9, v5

    .line 907
    and-long/2addr v9, v15

    .line 908
    shl-long/2addr v9, v14

    .line 909
    add-long/2addr v7, v9

    .line 910
    add-int/lit8 v5, v6, 0x3

    .line 911
    .line 912
    aget-byte v5, v2, v5

    .line 913
    .line 914
    goto/16 :goto_7

    .line 915
    .line 916
    :pswitch_6
    move/from16 v17, v7

    .line 917
    .line 918
    move/from16 v22, v9

    .line 919
    .line 920
    move/from16 v21, v10

    .line 921
    .line 922
    const-wide/16 v18, -0x1

    .line 923
    .line 924
    const/16 v20, 0x30

    .line 925
    .line 926
    add-int/lit8 v3, v6, 0x1

    .line 927
    .line 928
    aget-byte v3, v2, v3

    .line 929
    .line 930
    shl-int/2addr v3, v14

    .line 931
    aget-byte v4, v2, v6

    .line 932
    .line 933
    add-int/2addr v3, v4

    .line 934
    int-to-long v3, v3

    .line 935
    add-int/lit8 v5, v6, 0x9

    .line 936
    .line 937
    aget-byte v5, v2, v5

    .line 938
    .line 939
    int-to-long v7, v5

    .line 940
    shl-long v7, v7, v17

    .line 941
    .line 942
    add-int/lit8 v5, v6, 0x8

    .line 943
    .line 944
    aget-byte v5, v2, v5

    .line 945
    .line 946
    int-to-long v9, v5

    .line 947
    and-long/2addr v9, v15

    .line 948
    shl-long v9, v9, v20

    .line 949
    .line 950
    add-long/2addr v7, v9

    .line 951
    add-int/lit8 v5, v6, 0x7

    .line 952
    .line 953
    aget-byte v5, v2, v5

    .line 954
    .line 955
    int-to-long v9, v5

    .line 956
    and-long/2addr v9, v15

    .line 957
    shl-long v9, v9, v22

    .line 958
    .line 959
    add-long/2addr v7, v9

    .line 960
    add-int/lit8 v5, v6, 0x6

    .line 961
    .line 962
    aget-byte v5, v2, v5

    .line 963
    .line 964
    int-to-long v9, v5

    .line 965
    and-long/2addr v9, v15

    .line 966
    shl-long v9, v9, v21

    .line 967
    .line 968
    add-long/2addr v7, v9

    .line 969
    add-int/lit8 v5, v6, 0x5

    .line 970
    .line 971
    aget-byte v5, v2, v5

    .line 972
    .line 973
    int-to-long v9, v5

    .line 974
    and-long/2addr v9, v15

    .line 975
    shl-long/2addr v9, v12

    .line 976
    add-long/2addr v7, v9

    .line 977
    add-int/lit8 v5, v6, 0x4

    .line 978
    .line 979
    aget-byte v5, v2, v5

    .line 980
    .line 981
    int-to-long v9, v5

    .line 982
    and-long/2addr v9, v15

    .line 983
    shl-long/2addr v9, v13

    .line 984
    add-long/2addr v7, v9

    .line 985
    add-int/lit8 v5, v6, 0x3

    .line 986
    .line 987
    aget-byte v5, v2, v5

    .line 988
    .line 989
    int-to-long v9, v5

    .line 990
    and-long/2addr v9, v15

    .line 991
    shl-long/2addr v9, v14

    .line 992
    add-long/2addr v7, v9

    .line 993
    add-int/lit8 v5, v6, 0x2

    .line 994
    .line 995
    aget-byte v5, v2, v5

    .line 996
    .line 997
    goto/16 :goto_7

    .line 998
    .line 999
    :pswitch_7
    move/from16 v17, v7

    .line 1000
    .line 1001
    move/from16 v22, v9

    .line 1002
    .line 1003
    move/from16 v21, v10

    .line 1004
    .line 1005
    const-wide/16 v18, -0x1

    .line 1006
    .line 1007
    const/16 v20, 0x30

    .line 1008
    .line 1009
    aget-byte v3, v2, v6

    .line 1010
    .line 1011
    int-to-long v3, v3

    .line 1012
    add-int/lit8 v5, v6, 0x8

    .line 1013
    .line 1014
    aget-byte v5, v2, v5

    .line 1015
    .line 1016
    int-to-long v7, v5

    .line 1017
    shl-long v7, v7, v17

    .line 1018
    .line 1019
    add-int/lit8 v5, v6, 0x7

    .line 1020
    .line 1021
    aget-byte v5, v2, v5

    .line 1022
    .line 1023
    int-to-long v9, v5

    .line 1024
    and-long/2addr v9, v15

    .line 1025
    shl-long v9, v9, v20

    .line 1026
    .line 1027
    add-long/2addr v7, v9

    .line 1028
    add-int/lit8 v5, v6, 0x6

    .line 1029
    .line 1030
    aget-byte v5, v2, v5

    .line 1031
    .line 1032
    int-to-long v9, v5

    .line 1033
    and-long/2addr v9, v15

    .line 1034
    shl-long v9, v9, v22

    .line 1035
    .line 1036
    add-long/2addr v7, v9

    .line 1037
    add-int/lit8 v5, v6, 0x5

    .line 1038
    .line 1039
    aget-byte v5, v2, v5

    .line 1040
    .line 1041
    int-to-long v9, v5

    .line 1042
    and-long/2addr v9, v15

    .line 1043
    shl-long v9, v9, v21

    .line 1044
    .line 1045
    add-long/2addr v7, v9

    .line 1046
    add-int/lit8 v5, v6, 0x4

    .line 1047
    .line 1048
    aget-byte v5, v2, v5

    .line 1049
    .line 1050
    int-to-long v9, v5

    .line 1051
    and-long/2addr v9, v15

    .line 1052
    shl-long/2addr v9, v12

    .line 1053
    add-long/2addr v7, v9

    .line 1054
    add-int/lit8 v5, v6, 0x3

    .line 1055
    .line 1056
    aget-byte v5, v2, v5

    .line 1057
    .line 1058
    int-to-long v9, v5

    .line 1059
    and-long/2addr v9, v15

    .line 1060
    shl-long/2addr v9, v13

    .line 1061
    add-long/2addr v7, v9

    .line 1062
    add-int/lit8 v5, v6, 0x2

    .line 1063
    .line 1064
    aget-byte v5, v2, v5

    .line 1065
    .line 1066
    int-to-long v9, v5

    .line 1067
    and-long/2addr v9, v15

    .line 1068
    shl-long/2addr v9, v14

    .line 1069
    add-long/2addr v7, v9

    .line 1070
    add-int/lit8 v5, v6, 0x1

    .line 1071
    .line 1072
    aget-byte v5, v2, v5

    .line 1073
    .line 1074
    goto/16 :goto_7

    .line 1075
    .line 1076
    :pswitch_8
    move/from16 v17, v7

    .line 1077
    .line 1078
    move/from16 v22, v9

    .line 1079
    .line 1080
    move/from16 v21, v10

    .line 1081
    .line 1082
    const-wide/16 v18, -0x1

    .line 1083
    .line 1084
    const/16 v20, 0x30

    .line 1085
    .line 1086
    add-int/lit8 v3, v6, 0x7

    .line 1087
    .line 1088
    aget-byte v3, v2, v3

    .line 1089
    .line 1090
    int-to-long v3, v3

    .line 1091
    shl-long v3, v3, v17

    .line 1092
    .line 1093
    add-int/lit8 v5, v6, 0x6

    .line 1094
    .line 1095
    aget-byte v5, v2, v5

    .line 1096
    .line 1097
    int-to-long v7, v5

    .line 1098
    and-long/2addr v7, v15

    .line 1099
    shl-long v7, v7, v20

    .line 1100
    .line 1101
    add-long/2addr v3, v7

    .line 1102
    add-int/lit8 v5, v6, 0x5

    .line 1103
    .line 1104
    aget-byte v5, v2, v5

    .line 1105
    .line 1106
    int-to-long v7, v5

    .line 1107
    and-long/2addr v7, v15

    .line 1108
    shl-long v7, v7, v22

    .line 1109
    .line 1110
    add-long/2addr v3, v7

    .line 1111
    add-int/lit8 v5, v6, 0x4

    .line 1112
    .line 1113
    aget-byte v5, v2, v5

    .line 1114
    .line 1115
    int-to-long v7, v5

    .line 1116
    and-long/2addr v7, v15

    .line 1117
    shl-long v7, v7, v21

    .line 1118
    .line 1119
    add-long/2addr v3, v7

    .line 1120
    add-int/lit8 v5, v6, 0x3

    .line 1121
    .line 1122
    aget-byte v5, v2, v5

    .line 1123
    .line 1124
    int-to-long v7, v5

    .line 1125
    and-long/2addr v7, v15

    .line 1126
    shl-long/2addr v7, v12

    .line 1127
    add-long/2addr v3, v7

    .line 1128
    add-int/lit8 v5, v6, 0x2

    .line 1129
    .line 1130
    aget-byte v5, v2, v5

    .line 1131
    .line 1132
    int-to-long v7, v5

    .line 1133
    and-long/2addr v7, v15

    .line 1134
    shl-long/2addr v7, v13

    .line 1135
    add-long/2addr v3, v7

    .line 1136
    add-int/lit8 v5, v6, 0x1

    .line 1137
    .line 1138
    aget-byte v5, v2, v5

    .line 1139
    .line 1140
    int-to-long v7, v5

    .line 1141
    and-long/2addr v7, v15

    .line 1142
    shl-long/2addr v7, v14

    .line 1143
    add-long/2addr v3, v7

    .line 1144
    aget-byte v5, v2, v6

    .line 1145
    .line 1146
    :goto_8
    int-to-long v7, v5

    .line 1147
    and-long/2addr v7, v15

    .line 1148
    add-long/2addr v3, v7

    .line 1149
    :goto_9
    move-wide v14, v3

    .line 1150
    move-wide/from16 v16, v18

    .line 1151
    .line 1152
    goto/16 :goto_c

    .line 1153
    .line 1154
    :pswitch_9
    move/from16 v22, v9

    .line 1155
    .line 1156
    move/from16 v21, v10

    .line 1157
    .line 1158
    const-wide/16 v18, -0x1

    .line 1159
    .line 1160
    const/16 v20, 0x30

    .line 1161
    .line 1162
    add-int/lit8 v3, v6, 0x6

    .line 1163
    .line 1164
    aget-byte v3, v2, v3

    .line 1165
    .line 1166
    int-to-long v3, v3

    .line 1167
    shl-long v3, v3, v20

    .line 1168
    .line 1169
    add-int/lit8 v5, v6, 0x5

    .line 1170
    .line 1171
    aget-byte v5, v2, v5

    .line 1172
    .line 1173
    int-to-long v7, v5

    .line 1174
    and-long/2addr v7, v15

    .line 1175
    shl-long v7, v7, v22

    .line 1176
    .line 1177
    add-long/2addr v3, v7

    .line 1178
    add-int/lit8 v5, v6, 0x4

    .line 1179
    .line 1180
    aget-byte v5, v2, v5

    .line 1181
    .line 1182
    int-to-long v7, v5

    .line 1183
    and-long/2addr v7, v15

    .line 1184
    shl-long v7, v7, v21

    .line 1185
    .line 1186
    add-long/2addr v3, v7

    .line 1187
    add-int/lit8 v5, v6, 0x3

    .line 1188
    .line 1189
    aget-byte v5, v2, v5

    .line 1190
    .line 1191
    int-to-long v7, v5

    .line 1192
    and-long/2addr v7, v15

    .line 1193
    shl-long/2addr v7, v12

    .line 1194
    add-long/2addr v3, v7

    .line 1195
    add-int/lit8 v5, v6, 0x2

    .line 1196
    .line 1197
    aget-byte v5, v2, v5

    .line 1198
    .line 1199
    int-to-long v7, v5

    .line 1200
    and-long/2addr v7, v15

    .line 1201
    shl-long/2addr v7, v13

    .line 1202
    add-long/2addr v3, v7

    .line 1203
    add-int/lit8 v5, v6, 0x1

    .line 1204
    .line 1205
    aget-byte v5, v2, v5

    .line 1206
    .line 1207
    int-to-long v7, v5

    .line 1208
    and-long/2addr v7, v15

    .line 1209
    shl-long/2addr v7, v14

    .line 1210
    add-long/2addr v3, v7

    .line 1211
    aget-byte v5, v2, v6

    .line 1212
    .line 1213
    goto :goto_8

    .line 1214
    :pswitch_a
    move/from16 v22, v9

    .line 1215
    .line 1216
    move/from16 v21, v10

    .line 1217
    .line 1218
    const-wide/16 v18, -0x1

    .line 1219
    .line 1220
    add-int/lit8 v3, v6, 0x5

    .line 1221
    .line 1222
    aget-byte v3, v2, v3

    .line 1223
    .line 1224
    int-to-long v3, v3

    .line 1225
    shl-long v3, v3, v22

    .line 1226
    .line 1227
    add-int/lit8 v5, v6, 0x4

    .line 1228
    .line 1229
    aget-byte v5, v2, v5

    .line 1230
    .line 1231
    int-to-long v7, v5

    .line 1232
    and-long/2addr v7, v15

    .line 1233
    shl-long v7, v7, v21

    .line 1234
    .line 1235
    add-long/2addr v3, v7

    .line 1236
    add-int/lit8 v5, v6, 0x3

    .line 1237
    .line 1238
    aget-byte v5, v2, v5

    .line 1239
    .line 1240
    int-to-long v7, v5

    .line 1241
    and-long/2addr v7, v15

    .line 1242
    shl-long/2addr v7, v12

    .line 1243
    add-long/2addr v3, v7

    .line 1244
    add-int/lit8 v5, v6, 0x2

    .line 1245
    .line 1246
    aget-byte v5, v2, v5

    .line 1247
    .line 1248
    int-to-long v7, v5

    .line 1249
    and-long/2addr v7, v15

    .line 1250
    shl-long/2addr v7, v13

    .line 1251
    add-long/2addr v3, v7

    .line 1252
    add-int/lit8 v5, v6, 0x1

    .line 1253
    .line 1254
    aget-byte v5, v2, v5

    .line 1255
    .line 1256
    int-to-long v7, v5

    .line 1257
    and-long/2addr v7, v15

    .line 1258
    shl-long/2addr v7, v14

    .line 1259
    add-long/2addr v3, v7

    .line 1260
    aget-byte v5, v2, v6

    .line 1261
    .line 1262
    goto :goto_8

    .line 1263
    :pswitch_b
    move/from16 v21, v10

    .line 1264
    .line 1265
    const-wide/16 v18, -0x1

    .line 1266
    .line 1267
    add-int/lit8 v3, v6, 0x4

    .line 1268
    .line 1269
    aget-byte v3, v2, v3

    .line 1270
    .line 1271
    int-to-long v3, v3

    .line 1272
    shl-long v3, v3, v21

    .line 1273
    .line 1274
    add-int/lit8 v5, v6, 0x3

    .line 1275
    .line 1276
    aget-byte v5, v2, v5

    .line 1277
    .line 1278
    int-to-long v7, v5

    .line 1279
    and-long/2addr v7, v15

    .line 1280
    shl-long/2addr v7, v12

    .line 1281
    add-long/2addr v3, v7

    .line 1282
    add-int/lit8 v5, v6, 0x2

    .line 1283
    .line 1284
    aget-byte v5, v2, v5

    .line 1285
    .line 1286
    int-to-long v7, v5

    .line 1287
    and-long/2addr v7, v15

    .line 1288
    shl-long/2addr v7, v13

    .line 1289
    add-long/2addr v3, v7

    .line 1290
    add-int/lit8 v5, v6, 0x1

    .line 1291
    .line 1292
    aget-byte v5, v2, v5

    .line 1293
    .line 1294
    int-to-long v7, v5

    .line 1295
    and-long/2addr v7, v15

    .line 1296
    shl-long/2addr v7, v14

    .line 1297
    add-long/2addr v3, v7

    .line 1298
    aget-byte v5, v2, v6

    .line 1299
    .line 1300
    goto/16 :goto_8

    .line 1301
    .line 1302
    :pswitch_c
    move/from16 v21, v10

    .line 1303
    .line 1304
    const-wide/16 v18, -0x1

    .line 1305
    .line 1306
    add-int/lit8 v3, v6, 0x3

    .line 1307
    .line 1308
    aget-byte v3, v2, v3

    .line 1309
    .line 1310
    shl-int/2addr v3, v12

    .line 1311
    add-int/lit8 v4, v6, 0x2

    .line 1312
    .line 1313
    aget-byte v4, v2, v4

    .line 1314
    .line 1315
    and-int/lit16 v4, v4, 0xff

    .line 1316
    .line 1317
    shl-int/2addr v4, v13

    .line 1318
    add-int/2addr v3, v4

    .line 1319
    add-int/lit8 v4, v6, 0x1

    .line 1320
    .line 1321
    aget-byte v4, v2, v4

    .line 1322
    .line 1323
    and-int/lit16 v4, v4, 0xff

    .line 1324
    .line 1325
    shl-int/2addr v4, v14

    .line 1326
    add-int/2addr v3, v4

    .line 1327
    aget-byte v4, v2, v6

    .line 1328
    .line 1329
    :goto_a
    and-int/lit16 v4, v4, 0xff

    .line 1330
    .line 1331
    add-int/2addr v3, v4

    .line 1332
    :goto_b
    int-to-long v3, v3

    .line 1333
    goto/16 :goto_9

    .line 1334
    .line 1335
    :pswitch_d
    move/from16 v21, v10

    .line 1336
    .line 1337
    const-wide/16 v18, -0x1

    .line 1338
    .line 1339
    add-int/lit8 v3, v6, 0x2

    .line 1340
    .line 1341
    aget-byte v3, v2, v3

    .line 1342
    .line 1343
    shl-int/2addr v3, v13

    .line 1344
    add-int/lit8 v4, v6, 0x1

    .line 1345
    .line 1346
    aget-byte v4, v2, v4

    .line 1347
    .line 1348
    and-int/lit16 v4, v4, 0xff

    .line 1349
    .line 1350
    shl-int/2addr v4, v14

    .line 1351
    add-int/2addr v3, v4

    .line 1352
    aget-byte v4, v2, v6

    .line 1353
    .line 1354
    goto :goto_a

    .line 1355
    :pswitch_e
    move/from16 v21, v10

    .line 1356
    .line 1357
    const-wide/16 v18, -0x1

    .line 1358
    .line 1359
    add-int/lit8 v3, v6, 0x1

    .line 1360
    .line 1361
    aget-byte v3, v2, v3

    .line 1362
    .line 1363
    and-int/lit16 v3, v3, 0xff

    .line 1364
    .line 1365
    shl-int/2addr v3, v14

    .line 1366
    aget-byte v4, v2, v6

    .line 1367
    .line 1368
    goto :goto_a

    .line 1369
    :pswitch_f
    move/from16 v21, v10

    .line 1370
    .line 1371
    const-wide/16 v18, -0x1

    .line 1372
    .line 1373
    aget-byte v3, v2, v6

    .line 1374
    .line 1375
    and-int/lit16 v3, v3, 0xff

    .line 1376
    .line 1377
    goto :goto_b

    .line 1378
    :goto_c
    cmp-long v3, v14, v18

    .line 1379
    .line 1380
    if-eqz v3, :cond_13

    .line 1381
    .line 1382
    cmp-long v3, v16, v18

    .line 1383
    .line 1384
    if-eqz v3, :cond_10

    .line 1385
    .line 1386
    xor-long v3, v14, v16

    .line 1387
    .line 1388
    ushr-long v7, v3, v21

    .line 1389
    .line 1390
    xor-long/2addr v3, v7

    .line 1391
    long-to-int v3, v3

    .line 1392
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1393
    .line 1394
    array-length v5, v4

    .line 1395
    sub-int/2addr v5, v11

    .line 1396
    and-int/2addr v3, v5

    .line 1397
    aget-object v4, v4, v3

    .line 1398
    .line 1399
    if-nez v4, :cond_f

    .line 1400
    .line 1401
    new-array v4, v1, [C

    .line 1402
    .line 1403
    const/4 v5, 0x0

    .line 1404
    :goto_d
    if-ge v5, v1, :cond_e

    .line 1405
    .line 1406
    add-int v7, v6, v5

    .line 1407
    .line 1408
    aget-byte v7, v2, v7

    .line 1409
    .line 1410
    and-int/lit16 v7, v7, 0xff

    .line 1411
    .line 1412
    int-to-char v7, v7

    .line 1413
    aput-char v7, v4, v5

    .line 1414
    .line 1415
    add-int/lit8 v5, v5, 0x1

    .line 1416
    .line 1417
    goto :goto_d

    .line 1418
    :cond_e
    new-instance v13, Ljava/lang/String;

    .line 1419
    .line 1420
    invoke-direct {v13, v4}, Ljava/lang/String;-><init>([C)V

    .line 1421
    .line 1422
    .line 1423
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1424
    .line 1425
    new-instance v12, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1426
    .line 1427
    invoke-direct/range {v12 .. v17}, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;-><init>(Ljava/lang/String;JJ)V

    .line 1428
    .line 1429
    .line 1430
    aput-object v12, v1, v3

    .line 1431
    .line 1432
    return-object v13

    .line 1433
    :cond_f
    iget-wide v1, v4, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value0:J

    .line 1434
    .line 1435
    cmp-long v1, v1, v14

    .line 1436
    .line 1437
    if-nez v1, :cond_13

    .line 1438
    .line 1439
    iget-wide v1, v4, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value1:J

    .line 1440
    .line 1441
    cmp-long v1, v1, v16

    .line 1442
    .line 1443
    if-nez v1, :cond_13

    .line 1444
    .line 1445
    iget-object v1, v4, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->name:Ljava/lang/String;

    .line 1446
    .line 1447
    return-object v1

    .line 1448
    :cond_10
    ushr-long v3, v14, v21

    .line 1449
    .line 1450
    xor-long/2addr v3, v14

    .line 1451
    long-to-int v3, v3

    .line 1452
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1453
    .line 1454
    array-length v5, v4

    .line 1455
    sub-int/2addr v5, v11

    .line 1456
    and-int/2addr v3, v5

    .line 1457
    aget-object v4, v4, v3

    .line 1458
    .line 1459
    if-nez v4, :cond_12

    .line 1460
    .line 1461
    new-array v4, v1, [C

    .line 1462
    .line 1463
    const/4 v5, 0x0

    .line 1464
    :goto_e
    if-ge v5, v1, :cond_11

    .line 1465
    .line 1466
    add-int v7, v6, v5

    .line 1467
    .line 1468
    aget-byte v7, v2, v7

    .line 1469
    .line 1470
    and-int/lit16 v7, v7, 0xff

    .line 1471
    .line 1472
    int-to-char v7, v7

    .line 1473
    aput-char v7, v4, v5

    .line 1474
    .line 1475
    add-int/lit8 v5, v5, 0x1

    .line 1476
    .line 1477
    goto :goto_e

    .line 1478
    :cond_11
    new-instance v1, Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-direct {v1, v4}, Ljava/lang/String;-><init>([C)V

    .line 1481
    .line 1482
    .line 1483
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1484
    .line 1485
    new-instance v4, Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1486
    .line 1487
    invoke-direct {v4, v1, v14, v15}, Lcom/alibaba/fastjson2/util/NameCacheEntry;-><init>(Ljava/lang/String;J)V

    .line 1488
    .line 1489
    .line 1490
    aput-object v4, v2, v3

    .line 1491
    .line 1492
    return-object v1

    .line 1493
    :cond_12
    iget-wide v1, v4, Lcom/alibaba/fastjson2/util/NameCacheEntry;->value:J

    .line 1494
    .line 1495
    cmp-long v1, v1, v14

    .line 1496
    .line 1497
    if-nez v1, :cond_13

    .line 1498
    .line 1499
    iget-object v1, v4, Lcom/alibaba/fastjson2/util/NameCacheEntry;->name:Ljava/lang/String;

    .line 1500
    .line 1501
    return-object v1

    .line 1502
    :cond_13
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderASCII;->getFieldName()Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    return-object v1

    .line 1507
    :cond_14
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 1508
    .line 1509
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    throw v1

    .line 1514
    nop

    .line 1515
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readFieldNameHashCode()J
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x2f

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 12
    .line 13
    .line 14
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 15
    .line 16
    :cond_0
    const/16 v3, 0x27

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    if-ne v2, v3, :cond_2

    .line 21
    .line 22
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 23
    .line 24
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 25
    .line 26
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 27
    .line 28
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 29
    .line 30
    and-long/2addr v6, v8

    .line 31
    cmp-long v6, v6, v4

    .line 32
    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    throw v1

    .line 41
    :cond_2
    :goto_0
    const/16 v6, 0x22

    .line 42
    .line 43
    if-eq v2, v6, :cond_7

    .line 44
    .line 45
    if-eq v2, v3, :cond_7

    .line 46
    .line 47
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 48
    .line 49
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 50
    .line 51
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 52
    .line 53
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 54
    .line 55
    and-long/2addr v6, v8

    .line 56
    cmp-long v1, v6, v4

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONReader;->isFirstIdentifier(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderASCII;->readFieldNameHashCodeUnquote()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    return-wide v1

    .line 71
    :cond_3
    const/16 v1, 0x7d

    .line 72
    .line 73
    if-eq v2, v1, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->isNull()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    const/16 v1, 0x5b

    .line 83
    .line 84
    if-ne v2, v1, :cond_5

    .line 85
    .line 86
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 87
    .line 88
    if-lez v1, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderASCII;->getFieldName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    new-instance v3, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v4, "illegal fieldName input "

    .line 99
    .line 100
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, ", previous fieldName "

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    goto :goto_1

    .line 119
    :cond_5
    const-string v1, "illegal fieldName input"

    .line 120
    .line 121
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :goto_1
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_2
    const-wide/16 v1, 0x0

    .line 133
    .line 134
    return-wide v1

    .line 135
    :cond_6
    :goto_3
    const-wide/16 v1, -0x1

    .line 136
    .line 137
    return-wide v1

    .line 138
    :cond_7
    const/4 v3, 0x0

    .line 139
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 143
    .line 144
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 145
    .line 146
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 147
    .line 148
    add-int/lit8 v7, v6, 0x9

    .line 149
    .line 150
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 151
    .line 152
    const/16 v13, 0x10

    .line 153
    .line 154
    const/16 v14, 0xff

    .line 155
    .line 156
    const/16 v15, 0x8

    .line 157
    .line 158
    const-wide/16 v16, 0xff

    .line 159
    .line 160
    const/4 v3, 0x1

    .line 161
    move-wide/from16 v18, v4

    .line 162
    .line 163
    const/16 v4, 0x5c

    .line 164
    .line 165
    if-ge v7, v8, :cond_8

    .line 166
    .line 167
    aget-byte v5, v1, v6

    .line 168
    .line 169
    if-ne v5, v2, :cond_9

    .line 170
    .line 171
    :cond_8
    move/from16 v23, v13

    .line 172
    .line 173
    const/16 v20, 0x30

    .line 174
    .line 175
    const/16 v21, 0x28

    .line 176
    .line 177
    const/16 v22, 0x18

    .line 178
    .line 179
    const/16 v24, 0x20

    .line 180
    .line 181
    goto/16 :goto_6

    .line 182
    .line 183
    :cond_9
    add-int/lit8 v8, v6, 0x1

    .line 184
    .line 185
    const/16 v20, 0x30

    .line 186
    .line 187
    aget-byte v9, v1, v8

    .line 188
    .line 189
    if-ne v9, v2, :cond_a

    .line 190
    .line 191
    if-eqz v5, :cond_a

    .line 192
    .line 193
    if-eq v5, v4, :cond_a

    .line 194
    .line 195
    const/16 v21, 0x28

    .line 196
    .line 197
    const/16 v22, 0x18

    .line 198
    .line 199
    int-to-long v10, v5

    .line 200
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 201
    .line 202
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 203
    .line 204
    add-int/lit8 v6, v6, 0x2

    .line 205
    .line 206
    :goto_4
    move/from16 v23, v13

    .line 207
    .line 208
    :goto_5
    const/16 v24, 0x20

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_a
    const/16 v21, 0x28

    .line 213
    .line 214
    const/16 v22, 0x18

    .line 215
    .line 216
    add-int/lit8 v8, v6, 0x2

    .line 217
    .line 218
    aget-byte v10, v1, v8

    .line 219
    .line 220
    if-ne v10, v2, :cond_b

    .line 221
    .line 222
    if-eqz v9, :cond_b

    .line 223
    .line 224
    if-eq v5, v4, :cond_b

    .line 225
    .line 226
    if-eq v9, v4, :cond_b

    .line 227
    .line 228
    shl-int/lit8 v7, v9, 0x8

    .line 229
    .line 230
    and-int/2addr v5, v14

    .line 231
    add-int/2addr v7, v5

    .line 232
    int-to-long v10, v7

    .line 233
    const/4 v5, 0x2

    .line 234
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 235
    .line 236
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 237
    .line 238
    add-int/lit8 v6, v6, 0x3

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_b
    add-int/lit8 v8, v6, 0x3

    .line 242
    .line 243
    aget-byte v11, v1, v8

    .line 244
    .line 245
    if-ne v11, v2, :cond_c

    .line 246
    .line 247
    if-eqz v10, :cond_c

    .line 248
    .line 249
    if-eq v5, v4, :cond_c

    .line 250
    .line 251
    if-eq v9, v4, :cond_c

    .line 252
    .line 253
    if-eq v10, v4, :cond_c

    .line 254
    .line 255
    shl-int/lit8 v7, v10, 0x10

    .line 256
    .line 257
    and-int/2addr v9, v14

    .line 258
    shl-int/2addr v9, v15

    .line 259
    add-int/2addr v7, v9

    .line 260
    and-int/2addr v5, v14

    .line 261
    add-int/2addr v7, v5

    .line 262
    int-to-long v10, v7

    .line 263
    const/4 v5, 0x3

    .line 264
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 265
    .line 266
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 267
    .line 268
    add-int/lit8 v6, v6, 0x4

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_c
    add-int/lit8 v8, v6, 0x4

    .line 272
    .line 273
    move/from16 v23, v13

    .line 274
    .line 275
    aget-byte v13, v1, v8

    .line 276
    .line 277
    if-ne v13, v2, :cond_d

    .line 278
    .line 279
    if-eqz v11, :cond_d

    .line 280
    .line 281
    if-eq v5, v4, :cond_d

    .line 282
    .line 283
    if-eq v9, v4, :cond_d

    .line 284
    .line 285
    if-eq v10, v4, :cond_d

    .line 286
    .line 287
    if-eq v11, v4, :cond_d

    .line 288
    .line 289
    shl-int/lit8 v7, v11, 0x18

    .line 290
    .line 291
    and-int/2addr v10, v14

    .line 292
    shl-int/lit8 v10, v10, 0x10

    .line 293
    .line 294
    add-int/2addr v7, v10

    .line 295
    and-int/2addr v9, v14

    .line 296
    shl-int/2addr v9, v15

    .line 297
    add-int/2addr v7, v9

    .line 298
    and-int/2addr v5, v14

    .line 299
    add-int/2addr v7, v5

    .line 300
    int-to-long v10, v7

    .line 301
    const/4 v5, 0x4

    .line 302
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 303
    .line 304
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 305
    .line 306
    add-int/lit8 v6, v6, 0x5

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_d
    add-int/lit8 v8, v6, 0x5

    .line 310
    .line 311
    const/16 v24, 0x20

    .line 312
    .line 313
    aget-byte v12, v1, v8

    .line 314
    .line 315
    if-ne v12, v2, :cond_e

    .line 316
    .line 317
    if-eqz v13, :cond_e

    .line 318
    .line 319
    if-eq v5, v4, :cond_e

    .line 320
    .line 321
    if-eq v9, v4, :cond_e

    .line 322
    .line 323
    if-eq v10, v4, :cond_e

    .line 324
    .line 325
    if-eq v11, v4, :cond_e

    .line 326
    .line 327
    if-eq v13, v4, :cond_e

    .line 328
    .line 329
    int-to-long v12, v13

    .line 330
    shl-long v12, v12, v24

    .line 331
    .line 332
    move/from16 v25, v15

    .line 333
    .line 334
    int-to-long v14, v11

    .line 335
    and-long v14, v14, v16

    .line 336
    .line 337
    shl-long v14, v14, v22

    .line 338
    .line 339
    add-long/2addr v12, v14

    .line 340
    int-to-long v10, v10

    .line 341
    and-long v10, v10, v16

    .line 342
    .line 343
    shl-long v10, v10, v23

    .line 344
    .line 345
    add-long/2addr v12, v10

    .line 346
    int-to-long v9, v9

    .line 347
    and-long v9, v9, v16

    .line 348
    .line 349
    shl-long v9, v9, v25

    .line 350
    .line 351
    add-long/2addr v12, v9

    .line 352
    int-to-long v9, v5

    .line 353
    and-long v9, v9, v16

    .line 354
    .line 355
    add-long v10, v12, v9

    .line 356
    .line 357
    const/4 v5, 0x5

    .line 358
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 359
    .line 360
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 361
    .line 362
    add-int/lit8 v6, v6, 0x6

    .line 363
    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :cond_e
    move/from16 v25, v15

    .line 367
    .line 368
    add-int/lit8 v8, v6, 0x6

    .line 369
    .line 370
    aget-byte v14, v1, v8

    .line 371
    .line 372
    if-ne v14, v2, :cond_f

    .line 373
    .line 374
    if-eqz v12, :cond_f

    .line 375
    .line 376
    if-eq v5, v4, :cond_f

    .line 377
    .line 378
    if-eq v9, v4, :cond_f

    .line 379
    .line 380
    if-eq v10, v4, :cond_f

    .line 381
    .line 382
    if-eq v11, v4, :cond_f

    .line 383
    .line 384
    if-eq v13, v4, :cond_f

    .line 385
    .line 386
    if-eq v12, v4, :cond_f

    .line 387
    .line 388
    int-to-long v14, v12

    .line 389
    shl-long v14, v14, v21

    .line 390
    .line 391
    int-to-long v12, v13

    .line 392
    and-long v12, v12, v16

    .line 393
    .line 394
    shl-long v12, v12, v24

    .line 395
    .line 396
    add-long/2addr v14, v12

    .line 397
    int-to-long v11, v11

    .line 398
    and-long v11, v11, v16

    .line 399
    .line 400
    shl-long v11, v11, v22

    .line 401
    .line 402
    add-long/2addr v14, v11

    .line 403
    int-to-long v10, v10

    .line 404
    and-long v10, v10, v16

    .line 405
    .line 406
    shl-long v10, v10, v23

    .line 407
    .line 408
    add-long/2addr v14, v10

    .line 409
    int-to-long v9, v9

    .line 410
    and-long v9, v9, v16

    .line 411
    .line 412
    shl-long v9, v9, v25

    .line 413
    .line 414
    add-long/2addr v14, v9

    .line 415
    int-to-long v9, v5

    .line 416
    and-long v9, v9, v16

    .line 417
    .line 418
    add-long v10, v14, v9

    .line 419
    .line 420
    const/4 v5, 0x6

    .line 421
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 422
    .line 423
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 424
    .line 425
    add-int/lit8 v6, v6, 0x7

    .line 426
    .line 427
    goto/16 :goto_7

    .line 428
    .line 429
    :cond_f
    add-int/lit8 v8, v6, 0x7

    .line 430
    .line 431
    aget-byte v15, v1, v8

    .line 432
    .line 433
    if-ne v15, v2, :cond_10

    .line 434
    .line 435
    if-eqz v14, :cond_10

    .line 436
    .line 437
    if-eq v5, v4, :cond_10

    .line 438
    .line 439
    if-eq v9, v4, :cond_10

    .line 440
    .line 441
    if-eq v10, v4, :cond_10

    .line 442
    .line 443
    if-eq v11, v4, :cond_10

    .line 444
    .line 445
    if-eq v13, v4, :cond_10

    .line 446
    .line 447
    if-eq v12, v4, :cond_10

    .line 448
    .line 449
    if-eq v14, v4, :cond_10

    .line 450
    .line 451
    int-to-long v14, v14

    .line 452
    shl-long v14, v14, v20

    .line 453
    .line 454
    int-to-long v3, v12

    .line 455
    and-long v3, v3, v16

    .line 456
    .line 457
    shl-long v3, v3, v21

    .line 458
    .line 459
    add-long/2addr v14, v3

    .line 460
    int-to-long v3, v13

    .line 461
    and-long v3, v3, v16

    .line 462
    .line 463
    shl-long v3, v3, v24

    .line 464
    .line 465
    add-long/2addr v14, v3

    .line 466
    int-to-long v3, v11

    .line 467
    and-long v3, v3, v16

    .line 468
    .line 469
    shl-long v3, v3, v22

    .line 470
    .line 471
    add-long/2addr v14, v3

    .line 472
    int-to-long v3, v10

    .line 473
    and-long v3, v3, v16

    .line 474
    .line 475
    shl-long v3, v3, v23

    .line 476
    .line 477
    add-long/2addr v14, v3

    .line 478
    int-to-long v3, v9

    .line 479
    and-long v3, v3, v16

    .line 480
    .line 481
    shl-long v3, v3, v25

    .line 482
    .line 483
    add-long/2addr v14, v3

    .line 484
    int-to-long v3, v5

    .line 485
    and-long v3, v3, v16

    .line 486
    .line 487
    add-long v10, v14, v3

    .line 488
    .line 489
    const/4 v3, 0x7

    .line 490
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 491
    .line 492
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 493
    .line 494
    add-int/lit8 v6, v6, 0x8

    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_10
    add-int/lit8 v3, v6, 0x8

    .line 498
    .line 499
    aget-byte v4, v1, v3

    .line 500
    .line 501
    if-ne v4, v2, :cond_11

    .line 502
    .line 503
    if-eqz v15, :cond_11

    .line 504
    .line 505
    const/16 v4, 0x5c

    .line 506
    .line 507
    if-eq v5, v4, :cond_11

    .line 508
    .line 509
    if-eq v9, v4, :cond_11

    .line 510
    .line 511
    if-eq v10, v4, :cond_11

    .line 512
    .line 513
    if-eq v11, v4, :cond_11

    .line 514
    .line 515
    if-eq v13, v4, :cond_11

    .line 516
    .line 517
    if-eq v12, v4, :cond_11

    .line 518
    .line 519
    if-eq v14, v4, :cond_11

    .line 520
    .line 521
    if-eq v15, v4, :cond_11

    .line 522
    .line 523
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/JSONReaderASCII;->getLong([BI)J

    .line 524
    .line 525
    .line 526
    move-result-wide v10

    .line 527
    move/from16 v4, v25

    .line 528
    .line 529
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 530
    .line 531
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 532
    .line 533
    move v6, v7

    .line 534
    goto :goto_7

    .line 535
    :cond_11
    :goto_6
    move-wide/from16 v10, v18

    .line 536
    .line 537
    :goto_7
    cmp-long v3, v10, v18

    .line 538
    .line 539
    const/16 v4, 0x78

    .line 540
    .line 541
    const/16 v5, 0x75

    .line 542
    .line 543
    if-nez v3, :cond_19

    .line 544
    .line 545
    const/4 v3, 0x0

    .line 546
    :goto_8
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 547
    .line 548
    if-ge v6, v7, :cond_19

    .line 549
    .line 550
    aget-byte v7, v1, v6

    .line 551
    .line 552
    if-ne v7, v2, :cond_13

    .line 553
    .line 554
    if-nez v3, :cond_12

    .line 555
    .line 556
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 557
    .line 558
    goto/16 :goto_11

    .line 559
    .line 560
    :cond_12
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 561
    .line 562
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 563
    .line 564
    add-int/lit8 v6, v6, 0x1

    .line 565
    .line 566
    goto/16 :goto_11

    .line 567
    .line 568
    :cond_13
    const/16 v8, 0x5c

    .line 569
    .line 570
    if-ne v7, v8, :cond_14

    .line 571
    .line 572
    const/4 v8, 0x1

    .line 573
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 574
    .line 575
    add-int/lit8 v7, v6, 0x1

    .line 576
    .line 577
    aget-byte v8, v1, v7

    .line 578
    .line 579
    if-eq v8, v5, :cond_16

    .line 580
    .line 581
    if-eq v8, v4, :cond_15

    .line 582
    .line 583
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    move v8, v7

    .line 588
    move v7, v6

    .line 589
    move v6, v8

    .line 590
    :cond_14
    :goto_9
    const/16 v8, 0xff

    .line 591
    .line 592
    goto :goto_a

    .line 593
    :cond_15
    add-int/lit8 v7, v6, 0x2

    .line 594
    .line 595
    aget-byte v7, v1, v7

    .line 596
    .line 597
    add-int/lit8 v6, v6, 0x3

    .line 598
    .line 599
    aget-byte v8, v1, v6

    .line 600
    .line 601
    invoke-static {v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    goto :goto_9

    .line 606
    :cond_16
    add-int/lit8 v7, v6, 0x2

    .line 607
    .line 608
    aget-byte v7, v1, v7

    .line 609
    .line 610
    add-int/lit8 v8, v6, 0x3

    .line 611
    .line 612
    aget-byte v8, v1, v8

    .line 613
    .line 614
    add-int/lit8 v9, v6, 0x4

    .line 615
    .line 616
    aget-byte v9, v1, v9

    .line 617
    .line 618
    add-int/lit8 v6, v6, 0x5

    .line 619
    .line 620
    aget-byte v12, v1, v6

    .line 621
    .line 622
    invoke-static {v7, v8, v9, v12}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    goto :goto_9

    .line 627
    :goto_a
    if-gt v7, v8, :cond_18

    .line 628
    .line 629
    const/16 v8, 0x8

    .line 630
    .line 631
    if-ge v3, v8, :cond_18

    .line 632
    .line 633
    if-nez v3, :cond_17

    .line 634
    .line 635
    if-nez v7, :cond_17

    .line 636
    .line 637
    goto :goto_10

    .line 638
    :cond_17
    packed-switch v3, :pswitch_data_0

    .line 639
    .line 640
    .line 641
    :goto_b
    const/16 v25, 0x8

    .line 642
    .line 643
    :goto_c
    const/16 v26, 0x1

    .line 644
    .line 645
    goto :goto_f

    .line 646
    :pswitch_0
    int-to-byte v7, v7

    .line 647
    int-to-long v7, v7

    .line 648
    const/16 v9, 0x38

    .line 649
    .line 650
    shl-long/2addr v7, v9

    .line 651
    const-wide v12, 0xffffffffffffffL

    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    :goto_d
    and-long v9, v10, v12

    .line 657
    .line 658
    add-long/2addr v7, v9

    .line 659
    move-wide v10, v7

    .line 660
    goto :goto_b

    .line 661
    :pswitch_1
    int-to-byte v7, v7

    .line 662
    int-to-long v7, v7

    .line 663
    shl-long v7, v7, v20

    .line 664
    .line 665
    const-wide v12, 0xffffffffffffL

    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    goto :goto_d

    .line 671
    :pswitch_2
    int-to-byte v7, v7

    .line 672
    int-to-long v7, v7

    .line 673
    shl-long v7, v7, v21

    .line 674
    .line 675
    const-wide v12, 0xffffffffffL

    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    goto :goto_d

    .line 681
    :pswitch_3
    int-to-byte v7, v7

    .line 682
    int-to-long v7, v7

    .line 683
    shl-long v7, v7, v24

    .line 684
    .line 685
    const-wide v12, 0xffffffffL

    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    goto :goto_d

    .line 691
    :pswitch_4
    int-to-byte v7, v7

    .line 692
    shl-int/lit8 v7, v7, 0x18

    .line 693
    .line 694
    int-to-long v7, v7

    .line 695
    const-wide/32 v12, 0xffffff

    .line 696
    .line 697
    .line 698
    goto :goto_d

    .line 699
    :pswitch_5
    int-to-byte v7, v7

    .line 700
    shl-int/lit8 v7, v7, 0x10

    .line 701
    .line 702
    int-to-long v7, v7

    .line 703
    const-wide/32 v12, 0xffff

    .line 704
    .line 705
    .line 706
    goto :goto_d

    .line 707
    :pswitch_6
    int-to-byte v7, v7

    .line 708
    const/16 v25, 0x8

    .line 709
    .line 710
    shl-int/lit8 v7, v7, 0x8

    .line 711
    .line 712
    int-to-long v7, v7

    .line 713
    and-long v9, v10, v16

    .line 714
    .line 715
    add-long/2addr v7, v9

    .line 716
    :goto_e
    move-wide v10, v7

    .line 717
    goto :goto_c

    .line 718
    :pswitch_7
    const/16 v25, 0x8

    .line 719
    .line 720
    int-to-byte v7, v7

    .line 721
    int-to-long v7, v7

    .line 722
    goto :goto_e

    .line 723
    :goto_f
    add-int/lit8 v6, v6, 0x1

    .line 724
    .line 725
    add-int/lit8 v3, v3, 0x1

    .line 726
    .line 727
    goto/16 :goto_8

    .line 728
    .line 729
    :cond_18
    :goto_10
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 730
    .line 731
    move-wide/from16 v10, v18

    .line 732
    .line 733
    :cond_19
    :goto_11
    cmp-long v3, v10, v18

    .line 734
    .line 735
    if-eqz v3, :cond_1a

    .line 736
    .line 737
    goto :goto_16

    .line 738
    :cond_1a
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    move-wide v10, v7

    .line 744
    const/4 v3, 0x0

    .line 745
    :goto_12
    aget-byte v7, v1, v6

    .line 746
    .line 747
    const/16 v8, 0x5c

    .line 748
    .line 749
    if-ne v7, v8, :cond_1d

    .line 750
    .line 751
    const/4 v9, 0x1

    .line 752
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 753
    .line 754
    add-int/lit8 v7, v6, 0x1

    .line 755
    .line 756
    aget-byte v9, v1, v7

    .line 757
    .line 758
    if-eq v9, v5, :cond_1c

    .line 759
    .line 760
    if-eq v9, v4, :cond_1b

    .line 761
    .line 762
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    :goto_13
    const/16 v26, 0x1

    .line 767
    .line 768
    goto :goto_15

    .line 769
    :cond_1b
    add-int/lit8 v7, v6, 0x2

    .line 770
    .line 771
    aget-byte v7, v1, v7

    .line 772
    .line 773
    add-int/lit8 v6, v6, 0x3

    .line 774
    .line 775
    aget-byte v9, v1, v6

    .line 776
    .line 777
    invoke-static {v7, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 778
    .line 779
    .line 780
    move-result v7

    .line 781
    :goto_14
    move/from16 v26, v7

    .line 782
    .line 783
    move v7, v6

    .line 784
    move/from16 v6, v26

    .line 785
    .line 786
    goto :goto_13

    .line 787
    :cond_1c
    add-int/lit8 v7, v6, 0x2

    .line 788
    .line 789
    aget-byte v7, v1, v7

    .line 790
    .line 791
    add-int/lit8 v9, v6, 0x3

    .line 792
    .line 793
    aget-byte v9, v1, v9

    .line 794
    .line 795
    add-int/lit8 v12, v6, 0x4

    .line 796
    .line 797
    aget-byte v12, v1, v12

    .line 798
    .line 799
    add-int/lit8 v6, v6, 0x5

    .line 800
    .line 801
    aget-byte v13, v1, v6

    .line 802
    .line 803
    invoke-static {v7, v9, v12, v13}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 804
    .line 805
    .line 806
    move-result v7

    .line 807
    goto :goto_14

    .line 808
    :goto_15
    add-int/lit8 v7, v7, 0x1

    .line 809
    .line 810
    int-to-long v12, v6

    .line 811
    xor-long v9, v10, v12

    .line 812
    .line 813
    const-wide v11, 0x100000001b3L

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    mul-long/2addr v9, v11

    .line 819
    move v6, v7

    .line 820
    move-wide v10, v9

    .line 821
    move/from16 v9, v24

    .line 822
    .line 823
    const/16 v12, 0xff

    .line 824
    .line 825
    goto/16 :goto_1c

    .line 826
    .line 827
    :cond_1d
    const/16 v26, 0x1

    .line 828
    .line 829
    if-ne v7, v2, :cond_25

    .line 830
    .line 831
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 832
    .line 833
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 834
    .line 835
    add-int/lit8 v6, v6, 0x1

    .line 836
    .line 837
    :goto_16
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 838
    .line 839
    const/16 v3, 0x1a

    .line 840
    .line 841
    if-ne v6, v2, :cond_1e

    .line 842
    .line 843
    move v4, v3

    .line 844
    goto :goto_17

    .line 845
    :cond_1e
    add-int/lit8 v2, v6, 0x1

    .line 846
    .line 847
    aget-byte v4, v1, v6

    .line 848
    .line 849
    move v6, v2

    .line 850
    :goto_17
    move/from16 v2, v24

    .line 851
    .line 852
    :goto_18
    if-gt v4, v2, :cond_20

    .line 853
    .line 854
    const-wide/16 v7, 0x1

    .line 855
    .line 856
    shl-long/2addr v7, v4

    .line 857
    const-wide v12, 0x100003701L

    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    and-long/2addr v7, v12

    .line 863
    cmp-long v2, v7, v18

    .line 864
    .line 865
    if-eqz v2, :cond_20

    .line 866
    .line 867
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 868
    .line 869
    if-ne v6, v2, :cond_1f

    .line 870
    .line 871
    move v4, v3

    .line 872
    goto :goto_19

    .line 873
    :cond_1f
    add-int/lit8 v2, v6, 0x1

    .line 874
    .line 875
    aget-byte v4, v1, v6

    .line 876
    .line 877
    move v6, v2

    .line 878
    :goto_19
    const/16 v2, 0x20

    .line 879
    .line 880
    goto :goto_18

    .line 881
    :cond_20
    const/16 v2, 0x3a

    .line 882
    .line 883
    if-ne v4, v2, :cond_24

    .line 884
    .line 885
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 886
    .line 887
    if-ne v6, v2, :cond_21

    .line 888
    .line 889
    move v4, v3

    .line 890
    goto :goto_1a

    .line 891
    :cond_21
    add-int/lit8 v2, v6, 0x1

    .line 892
    .line 893
    aget-byte v4, v1, v6

    .line 894
    .line 895
    move v6, v2

    .line 896
    :goto_1a
    const/16 v9, 0x20

    .line 897
    .line 898
    :goto_1b
    if-gt v4, v9, :cond_23

    .line 899
    .line 900
    const-wide/16 v7, 0x1

    .line 901
    .line 902
    shl-long/2addr v7, v4

    .line 903
    const-wide v12, 0x100003701L

    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    and-long/2addr v7, v12

    .line 909
    cmp-long v2, v7, v18

    .line 910
    .line 911
    if-eqz v2, :cond_23

    .line 912
    .line 913
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 914
    .line 915
    if-ne v6, v2, :cond_22

    .line 916
    .line 917
    move v4, v3

    .line 918
    goto :goto_1b

    .line 919
    :cond_22
    add-int/lit8 v2, v6, 0x1

    .line 920
    .line 921
    aget-byte v4, v1, v6

    .line 922
    .line 923
    move v6, v2

    .line 924
    goto :goto_1b

    .line 925
    :cond_23
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 926
    .line 927
    const/16 v12, 0xff

    .line 928
    .line 929
    and-int/lit16 v1, v4, 0xff

    .line 930
    .line 931
    int-to-char v1, v1

    .line 932
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 933
    .line 934
    return-wide v10

    .line 935
    :cond_24
    const-string v1, "expect \':\', but "

    .line 936
    .line 937
    invoke-static {v4, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    goto/16 :goto_2

    .line 949
    .line 950
    :cond_25
    move/from16 v9, v24

    .line 951
    .line 952
    const/16 v12, 0xff

    .line 953
    .line 954
    add-int/lit8 v6, v6, 0x1

    .line 955
    .line 956
    and-int/lit16 v7, v7, 0xff

    .line 957
    .line 958
    int-to-long v13, v7

    .line 959
    xor-long/2addr v10, v13

    .line 960
    const-wide v13, 0x100000001b3L

    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    mul-long/2addr v10, v13

    .line 966
    :goto_1c
    add-int/lit8 v3, v3, 0x1

    .line 967
    .line 968
    move/from16 v24, v9

    .line 969
    .line 970
    goto/16 :goto_12

    .line 971
    .line 972
    nop

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final readFieldNameHashCodeUnquote()J
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 9
    .line 10
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 11
    .line 12
    iget-char v5, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 13
    .line 14
    add-int/lit8 v6, v2, -0x1

    .line 15
    .line 16
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 17
    .line 18
    move v9, v1

    .line 19
    move v8, v5

    .line 20
    const-wide/16 v10, 0x0

    .line 21
    .line 22
    :goto_0
    const-wide/16 v16, 0x0

    .line 23
    .line 24
    const/16 v7, 0x5d

    .line 25
    .line 26
    const/16 v12, 0x5b

    .line 27
    .line 28
    const/16 v13, 0xd

    .line 29
    .line 30
    const/16 v14, 0xc

    .line 31
    .line 32
    const-wide v19, 0x100003701L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v21, 0x1

    .line 38
    .line 39
    const/16 v15, 0x3a

    .line 40
    .line 41
    const/16 v1, 0x1a

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    if-gt v2, v3, :cond_a

    .line 45
    .line 46
    if-eq v8, v14, :cond_7

    .line 47
    .line 48
    if-eq v8, v13, :cond_7

    .line 49
    .line 50
    if-eq v8, v1, :cond_7

    .line 51
    .line 52
    if-eq v8, v15, :cond_7

    .line 53
    .line 54
    if-eq v8, v12, :cond_7

    .line 55
    .line 56
    if-eq v8, v7, :cond_7

    .line 57
    .line 58
    const/16 v7, 0x7b

    .line 59
    .line 60
    if-eq v8, v7, :cond_7

    .line 61
    .line 62
    const/16 v7, 0x7d

    .line 63
    .line 64
    if-eq v8, v7, :cond_7

    .line 65
    .line 66
    const/16 v7, 0x20

    .line 67
    .line 68
    if-eq v8, v7, :cond_7

    .line 69
    .line 70
    const/16 v7, 0x21

    .line 71
    .line 72
    if-eq v8, v7, :cond_7

    .line 73
    .line 74
    packed-switch v8, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    packed-switch v8, :pswitch_data_1

    .line 78
    .line 79
    .line 80
    packed-switch v8, :pswitch_data_2

    .line 81
    .line 82
    .line 83
    const/16 v7, 0x5c

    .line 84
    .line 85
    if-ne v8, v7, :cond_0

    .line 86
    .line 87
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 88
    .line 89
    add-int/lit8 v8, v2, 0x1

    .line 90
    .line 91
    aget-byte v12, v4, v2

    .line 92
    .line 93
    int-to-char v12, v12

    .line 94
    const/16 v13, 0x22

    .line 95
    .line 96
    if-eq v12, v13, :cond_3

    .line 97
    .line 98
    if-eq v12, v15, :cond_3

    .line 99
    .line 100
    const/16 v13, 0x40

    .line 101
    .line 102
    if-eq v12, v13, :cond_3

    .line 103
    .line 104
    if-eq v12, v7, :cond_3

    .line 105
    .line 106
    const/16 v7, 0x75

    .line 107
    .line 108
    if-eq v12, v7, :cond_2

    .line 109
    .line 110
    const/16 v7, 0x78

    .line 111
    .line 112
    if-eq v12, v7, :cond_1

    .line 113
    .line 114
    const/16 v2, 0x2a

    .line 115
    .line 116
    if-eq v12, v2, :cond_3

    .line 117
    .line 118
    const/16 v2, 0x2b

    .line 119
    .line 120
    if-eq v12, v2, :cond_3

    .line 121
    .line 122
    packed-switch v12, :pswitch_data_3

    .line 123
    .line 124
    .line 125
    packed-switch v12, :pswitch_data_4

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    move v7, v8

    .line 133
    move v8, v2

    .line 134
    move v2, v7

    .line 135
    :cond_0
    :goto_1
    const/16 v7, 0xff

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_1
    aget-byte v7, v4, v8

    .line 139
    .line 140
    add-int/lit8 v8, v2, 0x2

    .line 141
    .line 142
    aget-byte v8, v4, v8

    .line 143
    .line 144
    invoke-static {v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    add-int/lit8 v2, v2, 0x3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    aget-byte v7, v4, v8

    .line 152
    .line 153
    add-int/lit8 v8, v2, 0x2

    .line 154
    .line 155
    aget-byte v8, v4, v8

    .line 156
    .line 157
    add-int/lit8 v12, v2, 0x3

    .line 158
    .line 159
    aget-byte v12, v4, v12

    .line 160
    .line 161
    add-int/lit8 v13, v2, 0x4

    .line 162
    .line 163
    aget-byte v13, v4, v13

    .line 164
    .line 165
    invoke-static {v7, v8, v12, v13}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    add-int/lit8 v2, v2, 0x5

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    :pswitch_0
    move v2, v8

    .line 173
    move v8, v12

    .line 174
    goto :goto_1

    .line 175
    :goto_2
    if-gt v8, v7, :cond_6

    .line 176
    .line 177
    const/16 v7, 0x8

    .line 178
    .line 179
    if-ge v9, v7, :cond_6

    .line 180
    .line 181
    if-nez v9, :cond_4

    .line 182
    .line 183
    if-nez v8, :cond_4

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_4
    int-to-byte v6, v8

    .line 187
    packed-switch v9, :pswitch_data_5

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :pswitch_1
    int-to-long v6, v6

    .line 192
    const/16 v8, 0x38

    .line 193
    .line 194
    shl-long/2addr v6, v8

    .line 195
    const-wide v12, 0xffffffffffffffL

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    :goto_3
    and-long/2addr v10, v12

    .line 201
    add-long/2addr v10, v6

    .line 202
    goto :goto_4

    .line 203
    :pswitch_2
    int-to-long v6, v6

    .line 204
    const/16 v8, 0x30

    .line 205
    .line 206
    shl-long/2addr v6, v8

    .line 207
    const-wide v12, 0xffffffffffffL

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :pswitch_3
    int-to-long v6, v6

    .line 214
    const/16 v8, 0x28

    .line 215
    .line 216
    shl-long/2addr v6, v8

    .line 217
    const-wide v12, 0xffffffffffL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :pswitch_4
    int-to-long v6, v6

    .line 224
    const/16 v23, 0x20

    .line 225
    .line 226
    shl-long v6, v6, v23

    .line 227
    .line 228
    const-wide v12, 0xffffffffL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :pswitch_5
    shl-int/lit8 v6, v6, 0x18

    .line 235
    .line 236
    int-to-long v6, v6

    .line 237
    const-wide/32 v12, 0xffffff

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :pswitch_6
    shl-int/lit8 v6, v6, 0x10

    .line 242
    .line 243
    int-to-long v6, v6

    .line 244
    const-wide/32 v12, 0xffff

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :pswitch_7
    shl-int/lit8 v6, v6, 0x8

    .line 249
    .line 250
    int-to-long v6, v6

    .line 251
    const-wide/16 v12, 0xff

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :pswitch_8
    int-to-long v10, v6

    .line 255
    :goto_4
    if-ne v2, v3, :cond_5

    .line 256
    .line 257
    move v8, v1

    .line 258
    goto :goto_5

    .line 259
    :cond_5
    add-int/lit8 v1, v2, 0x1

    .line 260
    .line 261
    aget-byte v2, v4, v2

    .line 262
    .line 263
    const/16 v7, 0xff

    .line 264
    .line 265
    and-int/2addr v2, v7

    .line 266
    move v8, v2

    .line 267
    move v2, v1

    .line 268
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_6
    :goto_6
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 274
    .line 275
    add-int/2addr v2, v6

    .line 276
    move-wide/from16 v10, v16

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_7
    :pswitch_9
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 280
    .line 281
    if-ne v8, v1, :cond_8

    .line 282
    .line 283
    move v5, v2

    .line 284
    goto :goto_7

    .line 285
    :cond_8
    add-int/lit8 v5, v2, -0x1

    .line 286
    .line 287
    :goto_7
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 288
    .line 289
    const/16 v7, 0x20

    .line 290
    .line 291
    if-gt v8, v7, :cond_a

    .line 292
    .line 293
    shl-long v12, v21, v8

    .line 294
    .line 295
    and-long v12, v12, v19

    .line 296
    .line 297
    cmp-long v5, v12, v16

    .line 298
    .line 299
    if-eqz v5, :cond_a

    .line 300
    .line 301
    if-ne v2, v3, :cond_9

    .line 302
    .line 303
    move v5, v1

    .line 304
    goto :goto_8

    .line 305
    :cond_9
    add-int/lit8 v5, v2, 0x1

    .line 306
    .line 307
    aget-byte v2, v4, v2

    .line 308
    .line 309
    int-to-char v2, v2

    .line 310
    move/from16 v24, v5

    .line 311
    .line 312
    move v5, v2

    .line 313
    move/from16 v2, v24

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_a
    move v5, v8

    .line 317
    :goto_8
    cmp-long v7, v10, v16

    .line 318
    .line 319
    if-eqz v7, :cond_b

    .line 320
    .line 321
    goto/16 :goto_10

    .line 322
    .line 323
    :cond_b
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    move-wide v10, v7

    .line 329
    move v7, v5

    .line 330
    move v5, v2

    .line 331
    const/4 v2, 0x0

    .line 332
    :goto_9
    const/16 v8, 0x5c

    .line 333
    .line 334
    if-ne v7, v8, :cond_11

    .line 335
    .line 336
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 337
    .line 338
    add-int/lit8 v7, v5, 0x1

    .line 339
    .line 340
    aget-byte v9, v4, v5

    .line 341
    .line 342
    const/16 v13, 0x22

    .line 343
    .line 344
    if-eq v9, v13, :cond_e

    .line 345
    .line 346
    if-eq v9, v15, :cond_e

    .line 347
    .line 348
    const/16 v12, 0x40

    .line 349
    .line 350
    if-eq v9, v12, :cond_f

    .line 351
    .line 352
    if-eq v9, v8, :cond_f

    .line 353
    .line 354
    const/16 v6, 0x75

    .line 355
    .line 356
    if-eq v9, v6, :cond_d

    .line 357
    .line 358
    const/16 v6, 0x78

    .line 359
    .line 360
    if-eq v9, v6, :cond_c

    .line 361
    .line 362
    const/16 v5, 0x2a

    .line 363
    .line 364
    if-eq v9, v5, :cond_f

    .line 365
    .line 366
    const/16 v5, 0x2b

    .line 367
    .line 368
    if-eq v9, v5, :cond_f

    .line 369
    .line 370
    packed-switch v9, :pswitch_data_6

    .line 371
    .line 372
    .line 373
    packed-switch v9, :pswitch_data_7

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    goto :goto_a

    .line 381
    :cond_c
    aget-byte v6, v4, v7

    .line 382
    .line 383
    add-int/lit8 v7, v5, 0x2

    .line 384
    .line 385
    aget-byte v7, v4, v7

    .line 386
    .line 387
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    add-int/lit8 v7, v5, 0x3

    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_d
    aget-byte v6, v4, v7

    .line 395
    .line 396
    add-int/lit8 v7, v5, 0x2

    .line 397
    .line 398
    aget-byte v7, v4, v7

    .line 399
    .line 400
    add-int/lit8 v9, v5, 0x3

    .line 401
    .line 402
    aget-byte v9, v4, v9

    .line 403
    .line 404
    add-int/lit8 v18, v5, 0x4

    .line 405
    .line 406
    aget-byte v8, v4, v18

    .line 407
    .line 408
    invoke-static {v6, v7, v9, v8}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 409
    .line 410
    .line 411
    move-result v9

    .line 412
    add-int/lit8 v7, v5, 0x5

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_e
    const/16 v12, 0x40

    .line 416
    .line 417
    :cond_f
    :goto_a
    :pswitch_a
    int-to-long v5, v9

    .line 418
    xor-long/2addr v5, v10

    .line 419
    const-wide v8, 0x100000001b3L

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    mul-long/2addr v5, v8

    .line 425
    if-ne v7, v3, :cond_10

    .line 426
    .line 427
    move v8, v7

    .line 428
    move v7, v1

    .line 429
    goto :goto_b

    .line 430
    :cond_10
    add-int/lit8 v8, v7, 0x1

    .line 431
    .line 432
    aget-byte v7, v4, v7

    .line 433
    .line 434
    const/16 v9, 0xff

    .line 435
    .line 436
    and-int/2addr v7, v9

    .line 437
    :goto_b
    move-wide v10, v5

    .line 438
    move v5, v8

    .line 439
    const/16 v8, 0x5b

    .line 440
    .line 441
    const/16 v9, 0x5d

    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_11
    const/16 v12, 0x40

    .line 445
    .line 446
    const/16 v13, 0x22

    .line 447
    .line 448
    if-eq v7, v14, :cond_13

    .line 449
    .line 450
    const/16 v6, 0xd

    .line 451
    .line 452
    if-eq v7, v6, :cond_13

    .line 453
    .line 454
    if-eq v7, v1, :cond_13

    .line 455
    .line 456
    if-eq v7, v15, :cond_13

    .line 457
    .line 458
    const/16 v8, 0x5b

    .line 459
    .line 460
    if-eq v7, v8, :cond_13

    .line 461
    .line 462
    const/16 v9, 0x5d

    .line 463
    .line 464
    if-eq v7, v9, :cond_13

    .line 465
    .line 466
    const/16 v6, 0x7b

    .line 467
    .line 468
    if-eq v7, v6, :cond_13

    .line 469
    .line 470
    const/16 v6, 0x7d

    .line 471
    .line 472
    if-eq v7, v6, :cond_13

    .line 473
    .line 474
    const/16 v6, 0x20

    .line 475
    .line 476
    if-eq v7, v6, :cond_13

    .line 477
    .line 478
    const/16 v6, 0x21

    .line 479
    .line 480
    if-eq v7, v6, :cond_13

    .line 481
    .line 482
    packed-switch v7, :pswitch_data_8

    .line 483
    .line 484
    .line 485
    packed-switch v7, :pswitch_data_9

    .line 486
    .line 487
    .line 488
    packed-switch v7, :pswitch_data_a

    .line 489
    .line 490
    .line 491
    int-to-long v6, v7

    .line 492
    xor-long/2addr v6, v10

    .line 493
    const-wide v10, 0x100000001b3L

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    mul-long/2addr v6, v10

    .line 499
    if-ne v5, v3, :cond_12

    .line 500
    .line 501
    move v10, v5

    .line 502
    move v5, v1

    .line 503
    goto :goto_c

    .line 504
    :cond_12
    add-int/lit8 v10, v5, 0x1

    .line 505
    .line 506
    aget-byte v5, v4, v5

    .line 507
    .line 508
    const/16 v11, 0xff

    .line 509
    .line 510
    and-int/2addr v5, v11

    .line 511
    :goto_c
    move-wide/from16 v24, v6

    .line 512
    .line 513
    move v7, v5

    .line 514
    move v5, v10

    .line 515
    move-wide/from16 v10, v24

    .line 516
    .line 517
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 518
    .line 519
    const/4 v6, 0x1

    .line 520
    goto/16 :goto_9

    .line 521
    .line 522
    :cond_13
    :pswitch_b
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 523
    .line 524
    if-ne v7, v1, :cond_14

    .line 525
    .line 526
    move v2, v5

    .line 527
    goto :goto_e

    .line 528
    :cond_14
    add-int/lit8 v2, v5, -0x1

    .line 529
    .line 530
    :goto_e
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 531
    .line 532
    move v2, v5

    .line 533
    move v5, v7

    .line 534
    :goto_f
    const/16 v7, 0x20

    .line 535
    .line 536
    if-gt v5, v7, :cond_16

    .line 537
    .line 538
    shl-long v6, v21, v5

    .line 539
    .line 540
    and-long v6, v6, v19

    .line 541
    .line 542
    cmp-long v6, v6, v16

    .line 543
    .line 544
    if-eqz v6, :cond_16

    .line 545
    .line 546
    if-ne v2, v3, :cond_15

    .line 547
    .line 548
    move v5, v1

    .line 549
    goto :goto_f

    .line 550
    :cond_15
    add-int/lit8 v5, v2, 0x1

    .line 551
    .line 552
    aget-byte v2, v4, v2

    .line 553
    .line 554
    const/16 v7, 0xff

    .line 555
    .line 556
    and-int/2addr v2, v7

    .line 557
    move/from16 v24, v5

    .line 558
    .line 559
    move v5, v2

    .line 560
    move/from16 v2, v24

    .line 561
    .line 562
    goto :goto_f

    .line 563
    :cond_16
    :goto_10
    if-ne v5, v15, :cond_19

    .line 564
    .line 565
    if-ne v2, v3, :cond_17

    .line 566
    .line 567
    move v5, v2

    .line 568
    move v2, v1

    .line 569
    goto :goto_11

    .line 570
    :cond_17
    add-int/lit8 v5, v2, 0x1

    .line 571
    .line 572
    aget-byte v2, v4, v2

    .line 573
    .line 574
    const/16 v7, 0xff

    .line 575
    .line 576
    and-int/2addr v2, v7

    .line 577
    :goto_11
    move v7, v5

    .line 578
    move v5, v2

    .line 579
    move v2, v7

    .line 580
    const/16 v7, 0x20

    .line 581
    .line 582
    :goto_12
    if-gt v5, v7, :cond_19

    .line 583
    .line 584
    shl-long v8, v21, v5

    .line 585
    .line 586
    and-long v8, v8, v19

    .line 587
    .line 588
    cmp-long v6, v8, v16

    .line 589
    .line 590
    if-eqz v6, :cond_19

    .line 591
    .line 592
    if-ne v2, v3, :cond_18

    .line 593
    .line 594
    move v5, v1

    .line 595
    const/16 v9, 0xff

    .line 596
    .line 597
    goto :goto_12

    .line 598
    :cond_18
    add-int/lit8 v5, v2, 0x1

    .line 599
    .line 600
    aget-byte v2, v4, v2

    .line 601
    .line 602
    const/16 v9, 0xff

    .line 603
    .line 604
    and-int/2addr v2, v9

    .line 605
    move/from16 v24, v5

    .line 606
    .line 607
    move v5, v2

    .line 608
    move/from16 v2, v24

    .line 609
    .line 610
    goto :goto_12

    .line 611
    :cond_19
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 612
    .line 613
    int-to-char v1, v5

    .line 614
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 615
    .line 616
    return-wide v10

    .line 617
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    :pswitch_data_1
    .packed-switch 0x28
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    :pswitch_data_3
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    :pswitch_data_4
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :pswitch_data_6
    .packed-switch 0x2d
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    :pswitch_data_7
    .packed-switch 0x3c
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    :pswitch_data_8
    .packed-switch 0x8
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    :pswitch_data_9
    .packed-switch 0x28
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    :pswitch_data_a
    .packed-switch 0x3c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public readString()Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    int-to-byte v1, v1

    .line 6
    const/16 v2, 0x22

    .line 7
    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/16 v3, 0x27

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readStringNotMatch()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    return-object v1

    .line 20
    :cond_1
    :goto_0
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 21
    .line 22
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 23
    .line 24
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 25
    .line 26
    sub-int v6, v5, v4

    .line 27
    .line 28
    and-int/lit8 v6, v6, -0x4

    .line 29
    .line 30
    add-int/2addr v6, v4

    .line 31
    const/4 v7, 0x0

    .line 32
    move v8, v4

    .line 33
    move v9, v7

    .line 34
    move v10, v9

    .line 35
    move v11, v10

    .line 36
    move v12, v11

    .line 37
    :goto_1
    const/16 v13, 0x5c

    .line 38
    .line 39
    if-ge v8, v6, :cond_5

    .line 40
    .line 41
    aget-byte v10, v3, v8

    .line 42
    .line 43
    add-int/lit8 v11, v8, 0x1

    .line 44
    .line 45
    aget-byte v11, v3, v11

    .line 46
    .line 47
    add-int/lit8 v12, v8, 0x2

    .line 48
    .line 49
    aget-byte v12, v3, v12

    .line 50
    .line 51
    add-int/lit8 v15, v8, 0x3

    .line 52
    .line 53
    aget-byte v15, v3, v15

    .line 54
    .line 55
    if-eq v10, v13, :cond_5

    .line 56
    .line 57
    if-eq v11, v13, :cond_5

    .line 58
    .line 59
    if-eq v12, v13, :cond_5

    .line 60
    .line 61
    if-ne v15, v13, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    if-eq v10, v1, :cond_4

    .line 65
    .line 66
    if-eq v11, v1, :cond_4

    .line 67
    .line 68
    if-eq v12, v1, :cond_4

    .line 69
    .line 70
    if-ne v15, v1, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    add-int/lit8 v8, v8, 0x4

    .line 74
    .line 75
    add-int/lit8 v9, v9, 0x4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    const/4 v6, 0x1

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    :goto_3
    move v6, v7

    .line 81
    :goto_4
    const/16 v15, 0x78

    .line 82
    .line 83
    const/16 v16, 0x1

    .line 84
    .line 85
    const/16 v14, 0x75

    .line 86
    .line 87
    const/16 v17, 0x2

    .line 88
    .line 89
    if-eqz v6, :cond_9

    .line 90
    .line 91
    if-ne v10, v1, :cond_6

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_6
    if-ne v11, v1, :cond_7

    .line 95
    .line 96
    add-int/lit8 v8, v8, 0x1

    .line 97
    .line 98
    add-int/lit8 v9, v9, 0x1

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    if-ne v12, v1, :cond_8

    .line 102
    .line 103
    add-int/lit8 v8, v8, 0x2

    .line 104
    .line 105
    add-int/lit8 v9, v9, 0x2

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_8
    add-int/lit8 v8, v8, 0x3

    .line 109
    .line 110
    add-int/lit8 v9, v9, 0x3

    .line 111
    .line 112
    :goto_5
    move v6, v7

    .line 113
    goto :goto_8

    .line 114
    :cond_9
    move v6, v7

    .line 115
    :goto_6
    if-ge v8, v5, :cond_2c

    .line 116
    .line 117
    aget-byte v10, v3, v8

    .line 118
    .line 119
    if-ne v10, v13, :cond_c

    .line 120
    .line 121
    add-int/lit8 v6, v8, 0x1

    .line 122
    .line 123
    aget-byte v6, v3, v6

    .line 124
    .line 125
    if-ne v6, v14, :cond_a

    .line 126
    .line 127
    const/4 v6, 0x6

    .line 128
    goto :goto_7

    .line 129
    :cond_a
    if-ne v6, v15, :cond_b

    .line 130
    .line 131
    const/4 v6, 0x4

    .line 132
    goto :goto_7

    .line 133
    :cond_b
    move/from16 v6, v17

    .line 134
    .line 135
    :goto_7
    add-int/2addr v8, v6

    .line 136
    move/from16 v6, v16

    .line 137
    .line 138
    goto/16 :goto_15

    .line 139
    .line 140
    :cond_c
    if-ne v10, v1, :cond_2b

    .line 141
    .line 142
    :goto_8
    const/4 v10, 0x0

    .line 143
    if-eqz v6, :cond_1a

    .line 144
    .line 145
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 146
    .line 147
    if-nez v6, :cond_d

    .line 148
    .line 149
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 150
    .line 151
    iget-object v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 152
    .line 153
    invoke-virtual {v6, v8, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, [C

    .line 158
    .line 159
    iput-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 160
    .line 161
    :cond_d
    if-eqz v6, :cond_e

    .line 162
    .line 163
    array-length v8, v6

    .line 164
    if-ge v8, v9, :cond_f

    .line 165
    .line 166
    :cond_e
    new-array v6, v9, [C

    .line 167
    .line 168
    iput-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 169
    .line 170
    :cond_f
    move v8, v7

    .line 171
    :goto_9
    aget-byte v11, v3, v4

    .line 172
    .line 173
    and-int/lit16 v11, v11, 0xff

    .line 174
    .line 175
    int-to-char v11, v11

    .line 176
    if-ne v11, v13, :cond_18

    .line 177
    .line 178
    add-int/lit8 v11, v4, 0x1

    .line 179
    .line 180
    aget-byte v12, v3, v11

    .line 181
    .line 182
    int-to-char v12, v12

    .line 183
    if-eq v12, v2, :cond_17

    .line 184
    .line 185
    if-eq v12, v13, :cond_17

    .line 186
    .line 187
    const/16 v13, 0x62

    .line 188
    .line 189
    if-eq v12, v13, :cond_16

    .line 190
    .line 191
    const/16 v13, 0x66

    .line 192
    .line 193
    if-eq v12, v13, :cond_15

    .line 194
    .line 195
    const/16 v13, 0x6e

    .line 196
    .line 197
    if-eq v12, v13, :cond_14

    .line 198
    .line 199
    const/16 v13, 0x72

    .line 200
    .line 201
    if-eq v12, v13, :cond_13

    .line 202
    .line 203
    if-eq v12, v15, :cond_12

    .line 204
    .line 205
    const/16 v13, 0x74

    .line 206
    .line 207
    if-eq v12, v13, :cond_11

    .line 208
    .line 209
    if-eq v12, v14, :cond_10

    .line 210
    .line 211
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    :goto_a
    move/from16 v19, v11

    .line 216
    .line 217
    move v11, v4

    .line 218
    move/from16 v4, v19

    .line 219
    .line 220
    goto :goto_b

    .line 221
    :cond_10
    add-int/lit8 v11, v4, 0x2

    .line 222
    .line 223
    aget-byte v11, v3, v11

    .line 224
    .line 225
    add-int/lit8 v12, v4, 0x3

    .line 226
    .line 227
    aget-byte v12, v3, v12

    .line 228
    .line 229
    add-int/lit8 v13, v4, 0x4

    .line 230
    .line 231
    aget-byte v13, v3, v13

    .line 232
    .line 233
    add-int/lit8 v4, v4, 0x5

    .line 234
    .line 235
    aget-byte v14, v3, v4

    .line 236
    .line 237
    invoke-static {v11, v12, v13, v14}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    goto :goto_b

    .line 242
    :cond_11
    const/16 v4, 0x9

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_12
    add-int/lit8 v11, v4, 0x2

    .line 246
    .line 247
    aget-byte v11, v3, v11

    .line 248
    .line 249
    add-int/lit8 v4, v4, 0x3

    .line 250
    .line 251
    aget-byte v12, v3, v4

    .line 252
    .line 253
    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    goto :goto_b

    .line 258
    :cond_13
    const/16 v4, 0xd

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_14
    const/16 v4, 0xa

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_15
    const/16 v4, 0xc

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_16
    const/16 v4, 0x8

    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_17
    move v4, v11

    .line 271
    move v11, v12

    .line 272
    goto :goto_b

    .line 273
    :cond_18
    if-ne v11, v1, :cond_19

    .line 274
    .line 275
    new-instance v1, Ljava/lang/String;

    .line 276
    .line 277
    invoke-direct {v1, v6, v7, v9}, Ljava/lang/String;-><init>([CII)V

    .line 278
    .line 279
    .line 280
    move v8, v4

    .line 281
    goto :goto_d

    .line 282
    :cond_19
    :goto_b
    aput-char v11, v6, v8

    .line 283
    .line 284
    add-int/lit8 v4, v4, 0x1

    .line 285
    .line 286
    add-int/lit8 v8, v8, 0x1

    .line 287
    .line 288
    const/16 v13, 0x5c

    .line 289
    .line 290
    const/16 v14, 0x75

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_1a
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderASCII;->str:Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v1, :cond_1b

    .line 296
    .line 297
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    goto :goto_d

    .line 302
    :cond_1b
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 303
    .line 304
    sub-int v4, v8, v1

    .line 305
    .line 306
    sget v6, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 307
    .line 308
    if-ge v6, v2, :cond_20

    .line 309
    .line 310
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 311
    .line 312
    if-nez v2, :cond_1c

    .line 313
    .line 314
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 315
    .line 316
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 317
    .line 318
    invoke-virtual {v2, v6, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, [C

    .line 323
    .line 324
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 325
    .line 326
    :cond_1c
    if-eqz v2, :cond_1d

    .line 327
    .line 328
    array-length v6, v2

    .line 329
    if-ge v6, v4, :cond_1e

    .line 330
    .line 331
    :cond_1d
    new-array v2, v4, [C

    .line 332
    .line 333
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 334
    .line 335
    :cond_1e
    move v6, v7

    .line 336
    :goto_c
    if-ge v6, v4, :cond_1f

    .line 337
    .line 338
    add-int v9, v1, v6

    .line 339
    .line 340
    aget-byte v9, v3, v9

    .line 341
    .line 342
    and-int/lit16 v9, v9, 0xff

    .line 343
    .line 344
    int-to-char v9, v9

    .line 345
    aput-char v9, v2, v6

    .line 346
    .line 347
    add-int/lit8 v6, v6, 0x1

    .line 348
    .line 349
    goto :goto_c

    .line 350
    :cond_1f
    new-instance v1, Ljava/lang/String;

    .line 351
    .line 352
    invoke-direct {v1, v2, v7, v4}, Ljava/lang/String;-><init>([CII)V

    .line 353
    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_20
    new-instance v2, Ljava/lang/String;

    .line 357
    .line 358
    sget-object v6, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 359
    .line 360
    invoke-direct {v2, v3, v1, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 361
    .line 362
    .line 363
    move-object v1, v2

    .line 364
    :goto_d
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 365
    .line 366
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 367
    .line 368
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 369
    .line 370
    iget-wide v13, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 371
    .line 372
    and-long/2addr v11, v13

    .line 373
    const-wide/16 v13, 0x0

    .line 374
    .line 375
    cmp-long v2, v11, v13

    .line 376
    .line 377
    if-eqz v2, :cond_21

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_22

    .line 388
    .line 389
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 390
    .line 391
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 392
    .line 393
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 394
    .line 395
    move v4, v8

    .line 396
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 397
    .line 398
    and-long v6, v11, v7

    .line 399
    .line 400
    cmp-long v2, v6, v13

    .line 401
    .line 402
    if-eqz v2, :cond_23

    .line 403
    .line 404
    goto :goto_e

    .line 405
    :cond_22
    move v4, v8

    .line 406
    :cond_23
    move-object v10, v1

    .line 407
    :goto_e
    add-int/lit8 v8, v4, 0x1

    .line 408
    .line 409
    const/16 v1, 0x1a

    .line 410
    .line 411
    if-ne v8, v5, :cond_24

    .line 412
    .line 413
    :goto_f
    move v4, v1

    .line 414
    goto :goto_11

    .line 415
    :cond_24
    add-int/lit8 v2, v4, 0x2

    .line 416
    .line 417
    aget-byte v4, v3, v8

    .line 418
    .line 419
    :goto_10
    move v8, v2

    .line 420
    :goto_11
    const-wide v6, 0x100003701L

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    const-wide/16 v11, 0x1

    .line 426
    .line 427
    const/16 v2, 0x20

    .line 428
    .line 429
    if-gt v4, v2, :cond_26

    .line 430
    .line 431
    shl-long v17, v11, v4

    .line 432
    .line 433
    and-long v17, v17, v6

    .line 434
    .line 435
    cmp-long v9, v17, v13

    .line 436
    .line 437
    if-eqz v9, :cond_26

    .line 438
    .line 439
    if-ne v8, v5, :cond_25

    .line 440
    .line 441
    goto :goto_f

    .line 442
    :cond_25
    add-int/lit8 v2, v8, 0x1

    .line 443
    .line 444
    aget-byte v4, v3, v8

    .line 445
    .line 446
    goto :goto_10

    .line 447
    :cond_26
    const/16 v9, 0x2c

    .line 448
    .line 449
    if-ne v4, v9, :cond_27

    .line 450
    .line 451
    move/from16 v9, v16

    .line 452
    .line 453
    goto :goto_12

    .line 454
    :cond_27
    const/4 v9, 0x0

    .line 455
    :goto_12
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 456
    .line 457
    if-eqz v9, :cond_2a

    .line 458
    .line 459
    if-ne v8, v5, :cond_28

    .line 460
    .line 461
    move v4, v8

    .line 462
    move v8, v1

    .line 463
    goto :goto_13

    .line 464
    :cond_28
    add-int/lit8 v4, v8, 0x1

    .line 465
    .line 466
    aget-byte v8, v3, v8

    .line 467
    .line 468
    :goto_13
    move/from16 v19, v8

    .line 469
    .line 470
    move v8, v4

    .line 471
    move/from16 v4, v19

    .line 472
    .line 473
    :goto_14
    if-gt v4, v2, :cond_2a

    .line 474
    .line 475
    shl-long v15, v11, v4

    .line 476
    .line 477
    and-long/2addr v15, v6

    .line 478
    cmp-long v9, v15, v13

    .line 479
    .line 480
    if-eqz v9, :cond_2a

    .line 481
    .line 482
    if-ne v8, v5, :cond_29

    .line 483
    .line 484
    move v4, v1

    .line 485
    goto :goto_14

    .line 486
    :cond_29
    add-int/lit8 v4, v8, 0x1

    .line 487
    .line 488
    aget-byte v8, v3, v8

    .line 489
    .line 490
    goto :goto_13

    .line 491
    :cond_2a
    and-int/lit16 v1, v4, 0xff

    .line 492
    .line 493
    int-to-char v1, v1

    .line 494
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 495
    .line 496
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 497
    .line 498
    return-object v10

    .line 499
    :cond_2b
    add-int/lit8 v8, v8, 0x1

    .line 500
    .line 501
    :goto_15
    add-int/lit8 v9, v9, 0x1

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const/16 v13, 0x5c

    .line 505
    .line 506
    const/16 v14, 0x75

    .line 507
    .line 508
    goto/16 :goto_6

    .line 509
    .line 510
    :cond_2c
    const-string v1, "invalid escape character EOI"

    .line 511
    .line 512
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    const/4 v1, 0x0

    .line 516
    return-object v1
.end method

.method public readString0()V
    .locals 12

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 7
    .line 8
    move v3, v2

    .line 9
    :goto_0
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    aget-byte v6, v4, v5

    .line 14
    .line 15
    const/16 v7, 0x78

    .line 16
    .line 17
    const/16 v8, 0x75

    .line 18
    .line 19
    const/16 v9, 0x5c

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    if-ne v6, v9, :cond_2

    .line 23
    .line 24
    iput-boolean v10, p0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 25
    .line 26
    add-int/lit8 v6, v5, 0x1

    .line 27
    .line 28
    iput v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    aget-byte v4, v4, v6

    .line 31
    .line 32
    if-eq v4, v8, :cond_1

    .line 33
    .line 34
    if-eq v4, v7, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    add-int/lit8 v5, v5, 0x3

    .line 38
    .line 39
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v5, v5, 0x5

    .line 43
    .line 44
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 47
    .line 48
    add-int/2addr v4, v10

    .line 49
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_2
    if-ne v6, v0, :cond_b

    .line 54
    .line 55
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    new-array v0, v3, [C

    .line 60
    .line 61
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 62
    .line 63
    move v1, v2

    .line 64
    :goto_2
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 65
    .line 66
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 67
    .line 68
    aget-byte v5, v3, v4

    .line 69
    .line 70
    and-int/lit16 v5, v5, 0xff

    .line 71
    .line 72
    int-to-char v5, v5

    .line 73
    const/16 v6, 0x22

    .line 74
    .line 75
    if-ne v5, v9, :cond_5

    .line 76
    .line 77
    add-int/lit8 v5, v4, 0x1

    .line 78
    .line 79
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 80
    .line 81
    aget-byte v5, v3, v5

    .line 82
    .line 83
    int-to-char v5, v5

    .line 84
    if-eq v5, v6, :cond_6

    .line 85
    .line 86
    if-eq v5, v9, :cond_6

    .line 87
    .line 88
    if-eq v5, v8, :cond_4

    .line 89
    .line 90
    if-eq v5, v7, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    add-int/lit8 v5, v4, 0x2

    .line 98
    .line 99
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 100
    .line 101
    aget-byte v5, v3, v5

    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x3

    .line 104
    .line 105
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 106
    .line 107
    aget-byte v3, v3, v4

    .line 108
    .line 109
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    add-int/lit8 v5, v4, 0x2

    .line 115
    .line 116
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 117
    .line 118
    aget-byte v5, v3, v5

    .line 119
    .line 120
    add-int/lit8 v6, v4, 0x3

    .line 121
    .line 122
    iput v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 123
    .line 124
    aget-byte v6, v3, v6

    .line 125
    .line 126
    add-int/lit8 v11, v4, 0x4

    .line 127
    .line 128
    iput v11, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 129
    .line 130
    aget-byte v11, v3, v11

    .line 131
    .line 132
    add-int/lit8 v4, v4, 0x5

    .line 133
    .line 134
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 135
    .line 136
    aget-byte v3, v3, v4

    .line 137
    .line 138
    invoke-static {v5, v6, v11, v3}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    goto :goto_3

    .line 143
    :cond_5
    if-ne v5, v6, :cond_6

    .line 144
    .line 145
    new-instance v1, Ljava/lang/String;

    .line 146
    .line 147
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    :goto_3
    aput-char v5, v0, v1

    .line 152
    .line 153
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 154
    .line 155
    add-int/2addr v3, v10

    .line 156
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 157
    .line 158
    add-int/2addr v1, v10

    .line 159
    goto :goto_2

    .line 160
    :cond_7
    sub-int/2addr v5, v1

    .line 161
    invoke-virtual {p0, v1, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    :goto_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 166
    .line 167
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 168
    .line 169
    add-int/2addr v3, v10

    .line 170
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 171
    .line 172
    aget-byte v0, v0, v3

    .line 173
    .line 174
    :goto_5
    const/16 v3, 0x20

    .line 175
    .line 176
    if-gt v0, v3, :cond_8

    .line 177
    .line 178
    const-wide/16 v3, 0x1

    .line 179
    .line 180
    shl-long/2addr v3, v0

    .line 181
    const-wide v5, 0x100003701L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v3, v5

    .line 187
    const-wide/16 v5, 0x0

    .line 188
    .line 189
    cmp-long v3, v3, v5

    .line 190
    .line 191
    if-eqz v3, :cond_8

    .line 192
    .line 193
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 194
    .line 195
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 196
    .line 197
    add-int/2addr v3, v10

    .line 198
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 199
    .line 200
    aget-byte v0, v0, v3

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_8
    const/16 v3, 0x2c

    .line 204
    .line 205
    if-ne v0, v3, :cond_9

    .line 206
    .line 207
    move v2, v10

    .line 208
    :cond_9
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 209
    .line 210
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 211
    .line 212
    if-eqz v2, :cond_a

    .line 213
    .line 214
    add-int/2addr v3, v10

    .line 215
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderASCII;->next()V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    add-int/2addr v3, v10

    .line 222
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 223
    .line 224
    int-to-char v0, v0

    .line 225
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 226
    .line 227
    :goto_6
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 228
    .line 229
    return-void

    .line 230
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 233
    .line 234
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 235
    .line 236
    goto/16 :goto_0
.end method

.method public readValueHashCode()J
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x27

    .line 10
    .line 11
    if-eq v1, v3, :cond_0

    .line 12
    .line 13
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 23
    .line 24
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 27
    .line 28
    move v9, v5

    .line 29
    const-wide/16 v10, 0x0

    .line 30
    .line 31
    :goto_0
    iget v12, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 32
    .line 33
    const/16 v13, 0xff

    .line 34
    .line 35
    const/16 v14, 0x78

    .line 36
    .line 37
    const/16 v15, 0x75

    .line 38
    .line 39
    const/16 v5, 0x5c

    .line 40
    .line 41
    const-wide/16 v16, 0x0

    .line 42
    .line 43
    if-ge v6, v12, :cond_1

    .line 44
    .line 45
    aget-byte v8, v3, v6

    .line 46
    .line 47
    if-ne v8, v1, :cond_3

    .line 48
    .line 49
    if-nez v9, :cond_2

    .line 50
    .line 51
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 52
    .line 53
    move-wide/from16 v10, v16

    .line 54
    .line 55
    :cond_1
    :goto_1
    const/16 v19, 0x20

    .line 56
    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_2
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 60
    .line 61
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    if-ne v8, v5, :cond_6

    .line 67
    .line 68
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 69
    .line 70
    add-int/lit8 v8, v6, 0x1

    .line 71
    .line 72
    aget-byte v12, v3, v8

    .line 73
    .line 74
    if-eq v12, v15, :cond_5

    .line 75
    .line 76
    if-eq v12, v14, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    move/from16 v19, v8

    .line 83
    .line 84
    move v8, v6

    .line 85
    move/from16 v6, v19

    .line 86
    .line 87
    :goto_2
    const/16 v19, 0x20

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    add-int/lit8 v8, v6, 0x2

    .line 91
    .line 92
    aget-byte v8, v3, v8

    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x3

    .line 95
    .line 96
    aget-byte v12, v3, v6

    .line 97
    .line 98
    invoke-static {v8, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    add-int/lit8 v8, v6, 0x2

    .line 104
    .line 105
    aget-byte v8, v3, v8

    .line 106
    .line 107
    add-int/lit8 v12, v6, 0x3

    .line 108
    .line 109
    aget-byte v12, v3, v12

    .line 110
    .line 111
    add-int/lit8 v18, v6, 0x4

    .line 112
    .line 113
    const/16 v19, 0x20

    .line 114
    .line 115
    aget-byte v7, v3, v18

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x5

    .line 118
    .line 119
    aget-byte v2, v3, v6

    .line 120
    .line 121
    invoke-static {v8, v12, v7, v2}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/16 v19, 0x20

    .line 127
    .line 128
    const/16 v2, -0x3d

    .line 129
    .line 130
    if-eq v8, v2, :cond_7

    .line 131
    .line 132
    const/16 v2, -0x3e

    .line 133
    .line 134
    if-ne v8, v2, :cond_8

    .line 135
    .line 136
    :cond_7
    and-int/lit8 v2, v8, 0x1f

    .line 137
    .line 138
    shl-int/lit8 v2, v2, 0x6

    .line 139
    .line 140
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    aget-byte v7, v3, v6

    .line 143
    .line 144
    and-int/lit8 v7, v7, 0x3f

    .line 145
    .line 146
    or-int/2addr v2, v7

    .line 147
    int-to-char v8, v2

    .line 148
    :cond_8
    :goto_3
    if-gt v8, v13, :cond_a

    .line 149
    .line 150
    if-ltz v8, :cond_a

    .line 151
    .line 152
    const/16 v2, 0x8

    .line 153
    .line 154
    if-ge v9, v2, :cond_a

    .line 155
    .line 156
    if-nez v9, :cond_9

    .line 157
    .line 158
    if-nez v8, :cond_9

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_9
    packed-switch v9, :pswitch_data_0

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :pswitch_0
    int-to-byte v2, v8

    .line 166
    int-to-long v7, v2

    .line 167
    const/16 v2, 0x38

    .line 168
    .line 169
    shl-long/2addr v7, v2

    .line 170
    const-wide v12, 0xffffffffffffffL

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    :goto_4
    and-long/2addr v10, v12

    .line 176
    add-long/2addr v10, v7

    .line 177
    goto :goto_5

    .line 178
    :pswitch_1
    int-to-byte v2, v8

    .line 179
    int-to-long v7, v2

    .line 180
    const/16 v2, 0x30

    .line 181
    .line 182
    shl-long/2addr v7, v2

    .line 183
    const-wide v12, 0xffffffffffffL

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :pswitch_2
    int-to-byte v2, v8

    .line 190
    int-to-long v7, v2

    .line 191
    const/16 v2, 0x28

    .line 192
    .line 193
    shl-long/2addr v7, v2

    .line 194
    const-wide v12, 0xffffffffffL

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :pswitch_3
    int-to-byte v2, v8

    .line 201
    int-to-long v7, v2

    .line 202
    shl-long v7, v7, v19

    .line 203
    .line 204
    const-wide v12, 0xffffffffL

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :pswitch_4
    int-to-byte v2, v8

    .line 211
    shl-int/lit8 v2, v2, 0x18

    .line 212
    .line 213
    int-to-long v7, v2

    .line 214
    const-wide/32 v12, 0xffffff

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :pswitch_5
    int-to-byte v2, v8

    .line 219
    shl-int/lit8 v2, v2, 0x10

    .line 220
    .line 221
    int-to-long v7, v2

    .line 222
    const-wide/32 v12, 0xffff

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :pswitch_6
    int-to-byte v5, v8

    .line 227
    shl-int/lit8 v2, v5, 0x8

    .line 228
    .line 229
    int-to-long v7, v2

    .line 230
    const-wide/16 v12, 0xff

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :pswitch_7
    int-to-byte v2, v8

    .line 234
    int-to-long v10, v2

    .line 235
    :goto_5
    add-int/2addr v6, v4

    .line 236
    add-int/lit8 v9, v9, 0x1

    .line 237
    .line 238
    const/16 v2, 0x22

    .line 239
    .line 240
    const/4 v5, 0x0

    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_a
    :goto_6
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 244
    .line 245
    move-wide/from16 v10, v16

    .line 246
    .line 247
    :goto_7
    cmp-long v1, v10, v16

    .line 248
    .line 249
    if-eqz v1, :cond_b

    .line 250
    .line 251
    move/from16 v20, v4

    .line 252
    .line 253
    goto/16 :goto_b

    .line 254
    .line 255
    :cond_b
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    move-wide v10, v1

    .line 261
    const/4 v1, 0x0

    .line 262
    :goto_8
    aget-byte v2, v3, v6

    .line 263
    .line 264
    const-wide v7, 0x100000001b3L

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    if-ne v2, v5, :cond_e

    .line 270
    .line 271
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 272
    .line 273
    add-int/lit8 v2, v6, 0x1

    .line 274
    .line 275
    aget-byte v9, v3, v2

    .line 276
    .line 277
    if-eq v9, v15, :cond_d

    .line 278
    .line 279
    if-eq v9, v14, :cond_c

    .line 280
    .line 281
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    :goto_9
    move/from16 v20, v4

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_c
    add-int/lit8 v2, v6, 0x2

    .line 289
    .line 290
    aget-byte v2, v3, v2

    .line 291
    .line 292
    add-int/lit8 v6, v6, 0x3

    .line 293
    .line 294
    aget-byte v9, v3, v6

    .line 295
    .line 296
    invoke-static {v2, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    move/from16 v20, v6

    .line 301
    .line 302
    move v6, v2

    .line 303
    move/from16 v2, v20

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_d
    add-int/lit8 v2, v6, 0x2

    .line 307
    .line 308
    aget-byte v2, v3, v2

    .line 309
    .line 310
    add-int/lit8 v9, v6, 0x3

    .line 311
    .line 312
    aget-byte v9, v3, v9

    .line 313
    .line 314
    add-int/lit8 v12, v6, 0x4

    .line 315
    .line 316
    aget-byte v12, v3, v12

    .line 317
    .line 318
    add-int/lit8 v6, v6, 0x5

    .line 319
    .line 320
    move/from16 v20, v4

    .line 321
    .line 322
    aget-byte v4, v3, v6

    .line 323
    .line 324
    invoke-static {v2, v9, v12, v4}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    move/from16 v23, v6

    .line 329
    .line 330
    move v6, v2

    .line 331
    move/from16 v2, v23

    .line 332
    .line 333
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 334
    .line 335
    int-to-long v5, v6

    .line 336
    xor-long/2addr v5, v10

    .line 337
    mul-long/2addr v5, v7

    .line 338
    move-wide v10, v5

    .line 339
    move/from16 v9, v19

    .line 340
    .line 341
    move v6, v2

    .line 342
    goto/16 :goto_11

    .line 343
    .line 344
    :cond_e
    move/from16 v20, v4

    .line 345
    .line 346
    const/16 v5, 0x22

    .line 347
    .line 348
    if-ne v2, v5, :cond_16

    .line 349
    .line 350
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 351
    .line 352
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 353
    .line 354
    add-int/lit8 v6, v6, 0x1

    .line 355
    .line 356
    :goto_b
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 357
    .line 358
    const/16 v2, 0x1a

    .line 359
    .line 360
    if-ne v6, v1, :cond_f

    .line 361
    .line 362
    move v4, v2

    .line 363
    goto :goto_c

    .line 364
    :cond_f
    add-int/lit8 v1, v6, 0x1

    .line 365
    .line 366
    aget-byte v4, v3, v6

    .line 367
    .line 368
    move v6, v1

    .line 369
    :goto_c
    const-wide v7, 0x100003701L

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    const-wide/16 v14, 0x1

    .line 375
    .line 376
    move/from16 v1, v19

    .line 377
    .line 378
    if-gt v4, v1, :cond_11

    .line 379
    .line 380
    shl-long v21, v14, v4

    .line 381
    .line 382
    and-long v21, v21, v7

    .line 383
    .line 384
    cmp-long v1, v21, v16

    .line 385
    .line 386
    if-eqz v1, :cond_11

    .line 387
    .line 388
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 389
    .line 390
    if-ne v6, v1, :cond_10

    .line 391
    .line 392
    move v4, v2

    .line 393
    goto :goto_d

    .line 394
    :cond_10
    add-int/lit8 v1, v6, 0x1

    .line 395
    .line 396
    aget-byte v4, v3, v6

    .line 397
    .line 398
    move v6, v1

    .line 399
    :goto_d
    const/16 v19, 0x20

    .line 400
    .line 401
    goto :goto_c

    .line 402
    :cond_11
    const/16 v1, 0x2c

    .line 403
    .line 404
    if-ne v4, v1, :cond_12

    .line 405
    .line 406
    move/from16 v1, v20

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :cond_12
    const/4 v1, 0x0

    .line 410
    :goto_e
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 411
    .line 412
    if-eqz v1, :cond_15

    .line 413
    .line 414
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 415
    .line 416
    if-ne v6, v1, :cond_13

    .line 417
    .line 418
    move v4, v2

    .line 419
    goto :goto_f

    .line 420
    :cond_13
    add-int/lit8 v1, v6, 0x1

    .line 421
    .line 422
    aget-byte v4, v3, v6

    .line 423
    .line 424
    move v6, v1

    .line 425
    :goto_f
    const/16 v9, 0x20

    .line 426
    .line 427
    :goto_10
    if-gt v4, v9, :cond_15

    .line 428
    .line 429
    shl-long v18, v14, v4

    .line 430
    .line 431
    and-long v18, v18, v7

    .line 432
    .line 433
    cmp-long v1, v18, v16

    .line 434
    .line 435
    if-eqz v1, :cond_15

    .line 436
    .line 437
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 438
    .line 439
    if-ne v6, v1, :cond_14

    .line 440
    .line 441
    move v4, v2

    .line 442
    goto :goto_10

    .line 443
    :cond_14
    add-int/lit8 v1, v6, 0x1

    .line 444
    .line 445
    aget-byte v4, v3, v6

    .line 446
    .line 447
    move v6, v1

    .line 448
    goto :goto_10

    .line 449
    :cond_15
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 450
    .line 451
    and-int/lit16 v1, v4, 0xff

    .line 452
    .line 453
    int-to-char v1, v1

    .line 454
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 455
    .line 456
    return-wide v10

    .line 457
    :cond_16
    move/from16 v9, v19

    .line 458
    .line 459
    add-int/lit8 v6, v6, 0x1

    .line 460
    .line 461
    int-to-long v4, v2

    .line 462
    xor-long/2addr v4, v10

    .line 463
    mul-long/2addr v4, v7

    .line 464
    move-wide v10, v4

    .line 465
    :goto_11
    add-int/lit8 v1, v1, 0x1

    .line 466
    .line 467
    move/from16 v19, v9

    .line 468
    .line 469
    move/from16 v4, v20

    .line 470
    .line 471
    const/16 v5, 0x5c

    .line 472
    .line 473
    goto/16 :goto_8

    .line 474
    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
