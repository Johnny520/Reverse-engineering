.class final Lcom/alibaba/fastjson2/JSONWriterUTF16;
.super Lcom/alibaba/fastjson2/JSONWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

.field protected chars:[C


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, p1, v2, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;ZLjava/nio/charset/Charset;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    and-int/2addr p1, v1

    .line 22
    aget-object p1, v0, p1

    .line 23
    .line 24
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 25
    .line 26
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 27
    .line 28
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [C

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/16 p1, 0x2000

    .line 37
    .line 38
    new-array p1, p1, [C

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 41
    .line 42
    return-void
.end method

.method private grow(I)[C
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow0(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 5
    .line 6
    return-object p1
.end method

.method private grow0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/JSONWriter;->newCapacity(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 13
    .line 14
    return-void
.end method

.method private indent([CI)I
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    aput-char v0, p1, p2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p2, v0

    .line 7
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 8
    .line 9
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 10
    .line 11
    mul-int/2addr v2, v1

    .line 12
    add-int/2addr v2, p2

    .line 13
    if-ne v1, v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x9

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0x20

    .line 19
    .line 20
    :goto_0
    invoke-static {p1, p2, v2, v0}, Ljava/util/Arrays;->fill([CIIC)V

    .line 21
    .line 22
    .line 23
    return v2
.end method

.method private static indent([CII)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0xa

    .line 24
    aput-char v1, p0, p1

    add-int/2addr p2, v0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int/lit8 p1, v0, 0x1

    const/16 v1, 0x9

    .line 25
    aput-char v1, p0, v0

    move v0, p1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static putIntUnaligned([CII)V
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    const/4 p1, 0x1

    .line 7
    shl-long/2addr v3, p1

    .line 8
    add-long/2addr v1, v3

    .line 9
    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static putLong([CIJ)V
    .locals 12

    .line 156
    sget-wide v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    shl-int/lit8 p1, p1, 0x1

    int-to-long v2, p1

    add-long v6, v0, v2

    .line 157
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    const-wide/16 v1, 0xff

    and-long/2addr v1, p2

    const-wide/32 v3, 0xff00

    and-long/2addr v3, p2

    const/16 p1, 0x8

    shl-long/2addr v3, p1

    or-long/2addr v1, v3

    const-wide/32 v3, 0xff0000

    and-long/2addr v3, p2

    const/16 v10, 0x10

    shl-long/2addr v3, v10

    or-long/2addr v1, v3

    const-wide v3, 0xff000000L

    and-long/2addr v3, p2

    const/16 v11, 0x18

    shl-long/2addr v3, v11

    or-long v8, v1, v3

    move-object v5, p0

    move-object v4, v0

    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v1, v5

    const-wide/16 v2, 0x8

    add-long/2addr v2, v6

    const-wide v4, 0xff00000000L

    and-long/2addr v4, p2

    const/16 p0, 0x20

    shr-long/2addr v4, p0

    const-wide v6, 0xff0000000000L

    and-long/2addr v6, p2

    shr-long/2addr v6, v11

    or-long/2addr v4, v6

    const-wide/high16 v6, 0xff000000000000L

    and-long/2addr v6, p2

    shr-long/2addr v6, v10

    or-long/2addr v4, v6

    const-wide/high16 v6, -0x100000000000000L

    and-long/2addr p2, v6

    shr-long p0, p2, p1

    or-long/2addr v4, p0

    .line 158
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    return-void
.end method

.method private static putLong([CIJI)V
    .locals 21

    .line 152
    sget-wide v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    shl-int/lit8 v2, p1, 0x1

    int-to-long v2, v2

    add-long v6, v0, v2

    .line 153
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    const-wide/16 v10, 0xff

    and-long v1, p2, v10

    const-wide/32 v12, 0xff00

    and-long v3, p2, v12

    const/16 v14, 0x8

    shl-long/2addr v3, v14

    or-long/2addr v1, v3

    const-wide/32 v15, 0xff0000

    and-long v3, p2, v15

    const/16 v17, 0x10

    shl-long v3, v3, v17

    or-long/2addr v1, v3

    const-wide v18, 0xff000000L

    and-long v3, p2, v18

    const/16 v20, 0x18

    shl-long v3, v3, v20

    or-long v8, v1, v3

    move-object/from16 v5, p0

    move-object v4, v0

    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    const-wide/16 v1, 0x8

    add-long v2, v6, v1

    const-wide v4, 0xff00000000L

    and-long v4, p2, v4

    const/16 v1, 0x20

    shr-long/2addr v4, v1

    const-wide v8, 0xff0000000000L

    and-long v8, p2, v8

    shr-long v8, v8, v20

    or-long/2addr v4, v8

    const-wide/high16 v8, 0xff000000000000L

    and-long v8, p2, v8

    shr-long v8, v8, v17

    or-long/2addr v4, v8

    const-wide/high16 v8, -0x100000000000000L

    and-long v8, p2, v8

    shr-long/2addr v8, v14

    or-long/2addr v4, v8

    move-object/from16 v1, p0

    .line 154
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    const-wide/16 v1, 0x10

    add-long v2, v6, v1

    move/from16 v1, p4

    int-to-long v4, v1

    and-long v6, v4, v10

    and-long v8, v4, v12

    shl-long/2addr v8, v14

    or-long/2addr v6, v8

    and-long v8, v4, v15

    shl-long v8, v8, v17

    or-long/2addr v6, v8

    and-long v4, v4, v18

    shl-long v4, v4, v20

    or-long/2addr v4, v6

    move-object/from16 v1, p0

    .line 155
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    return-void
.end method

.method private static putLong([CIJJ)V
    .locals 30

    .line 1
    sget-wide v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 2
    .line 3
    shl-int/lit8 v2, p1, 0x1

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    add-long v6, v0, v2

    .line 7
    .line 8
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 9
    .line 10
    const-wide/16 v10, 0xff

    .line 11
    .line 12
    and-long v1, p2, v10

    .line 13
    .line 14
    const-wide/32 v12, 0xff00

    .line 15
    .line 16
    .line 17
    and-long v3, p2, v12

    .line 18
    .line 19
    const/16 v14, 0x8

    .line 20
    .line 21
    shl-long/2addr v3, v14

    .line 22
    or-long/2addr v1, v3

    .line 23
    const-wide/32 v15, 0xff0000

    .line 24
    .line 25
    .line 26
    and-long v3, p2, v15

    .line 27
    .line 28
    const/16 v17, 0x10

    .line 29
    .line 30
    shl-long v3, v3, v17

    .line 31
    .line 32
    or-long/2addr v1, v3

    .line 33
    const-wide v18, 0xff000000L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long v3, p2, v18

    .line 39
    .line 40
    const/16 v20, 0x18

    .line 41
    .line 42
    shl-long v3, v3, v20

    .line 43
    .line 44
    or-long v8, v1, v3

    .line 45
    .line 46
    move-object/from16 v5, p0

    .line 47
    .line 48
    move-object v4, v0

    .line 49
    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v1, 0x8

    .line 53
    .line 54
    add-long v2, v6, v1

    .line 55
    .line 56
    const-wide v8, 0xff00000000L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    and-long v4, p2, v8

    .line 62
    .line 63
    const/16 v21, 0x20

    .line 64
    .line 65
    shr-long v4, v4, v21

    .line 66
    .line 67
    const-wide v22, 0xff0000000000L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long v24, p2, v22

    .line 73
    .line 74
    shr-long v24, v24, v20

    .line 75
    .line 76
    or-long v4, v4, v24

    .line 77
    .line 78
    const-wide/high16 v24, 0xff000000000000L

    .line 79
    .line 80
    and-long v26, p2, v24

    .line 81
    .line 82
    shr-long v26, v26, v17

    .line 83
    .line 84
    or-long v4, v4, v26

    .line 85
    .line 86
    const-wide/high16 v26, -0x100000000000000L

    .line 87
    .line 88
    and-long v28, p2, v26

    .line 89
    .line 90
    shr-long v28, v28, v14

    .line 91
    .line 92
    or-long v4, v4, v28

    .line 93
    .line 94
    move-object/from16 v1, p0

    .line 95
    .line 96
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 97
    .line 98
    .line 99
    const-wide/16 v1, 0x10

    .line 100
    .line 101
    add-long v2, v6, v1

    .line 102
    .line 103
    and-long v4, p4, v10

    .line 104
    .line 105
    and-long v10, p4, v12

    .line 106
    .line 107
    shl-long/2addr v10, v14

    .line 108
    or-long/2addr v4, v10

    .line 109
    and-long v10, p4, v15

    .line 110
    .line 111
    shl-long v10, v10, v17

    .line 112
    .line 113
    or-long/2addr v4, v10

    .line 114
    and-long v10, p4, v18

    .line 115
    .line 116
    shl-long v10, v10, v20

    .line 117
    .line 118
    or-long/2addr v4, v10

    .line 119
    move-object/from16 v1, p0

    .line 120
    .line 121
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 122
    .line 123
    .line 124
    const-wide/16 v1, 0x18

    .line 125
    .line 126
    add-long v2, v6, v1

    .line 127
    .line 128
    and-long v4, p4, v8

    .line 129
    .line 130
    shr-long v4, v4, v21

    .line 131
    .line 132
    and-long v6, p4, v22

    .line 133
    .line 134
    shr-long v6, v6, v20

    .line 135
    .line 136
    or-long/2addr v4, v6

    .line 137
    and-long v6, p4, v24

    .line 138
    .line 139
    shr-long v6, v6, v17

    .line 140
    .line 141
    or-long/2addr v4, v6

    .line 142
    and-long v6, p4, v26

    .line 143
    .line 144
    shr-long/2addr v6, v14

    .line 145
    or-long/2addr v4, v6

    .line 146
    move-object/from16 v1, p0

    .line 147
    .line 148
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method private writeQuote()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 20
    .line 21
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 22
    .line 23
    aput-char v2, v0, v1

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/high16 v2, 0x100000

    .line 5
    .line 6
    if-le v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 12
    .line 13
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public endArray()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 6
    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iget-byte v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    mul-int/2addr v3, v0

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    :goto_0
    add-int/2addr v2, v3

    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 23
    .line 24
    array-length v3, v0

    .line 25
    if-le v2, v3, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_2
    const/16 v2, 0x5d

    .line 40
    .line 41
    aput-char v2, v0, v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 46
    .line 47
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 48
    .line 49
    return-void
.end method

.method public endObject()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 6
    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iget-byte v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    mul-int/2addr v3, v0

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    :goto_0
    add-int/2addr v2, v3

    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 23
    .line 24
    array-length v3, v0

    .line 25
    if-le v2, v3, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_2
    const/16 v2, 0x7d

    .line 40
    .line 41
    aput-char v2, v0, v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 46
    .line 47
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 48
    .line 49
    return-void
.end method

.method public ensureCapacity(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow0(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public flushTo(Ljava/io/OutputStream;)I
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 10
    .line 11
    aget-char v4, v3, v1

    .line 12
    .line 13
    const/16 v5, 0x80

    .line 14
    .line 15
    if-lt v4, v5, :cond_0

    .line 16
    .line 17
    mul-int/lit8 v1, v2, 0x3

    .line 18
    .line 19
    new-array v1, v1, [B

    .line 20
    .line 21
    invoke-static {v3, v0, v2, v1, v0}, Lcom/alibaba/fastjson2/util/IOUtils;->encodeUTF8([CII[BI)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1, v1, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 29
    .line 30
    return v2

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-array v1, v2, [B

    .line 35
    .line 36
    move v3, v0

    .line 37
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 38
    .line 39
    if-ge v3, v4, :cond_2

    .line 40
    .line 41
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 42
    .line 43
    aget-char v4, v4, v3

    .line 44
    .line 45
    int-to-byte v4, v4

    .line 46
    aput-byte v4, v1, v3

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 52
    .line 53
    .line 54
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 55
    .line 56
    return v2

    .line 57
    :cond_3
    const-string p1, "out is nulll"

    .line 58
    .line 59
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    return p1
.end method

.method public flushTo(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)I
    .locals 2

    .line 68
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    .line 69
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 71
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 72
    array-length p1, p2

    return p1

    .line 73
    :cond_1
    const-string p1, "out is null"

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public flushTo(Ljava/io/Writer;)V
    .locals 3

    .line 64
    :try_start_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    if-lez v0, :cond_0

    .line 65
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/Writer;->write([CII)V

    .line 66
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 67
    :goto_0
    const-string v0, "flushTo error"

    invoke-static {v0, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getBytes()[B
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    .line 65
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    if-ge v1, v2, :cond_1

    .line 66
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    aget-char v4, v3, v1

    const/16 v5, 0x80

    if-lt v4, v5, :cond_0

    mul-int/lit8 v1, v2, 0x3

    .line 67
    new-array v1, v1, [B

    .line 68
    invoke-static {v3, v0, v2, v1, v0}, Lcom/alibaba/fastjson2/util/IOUtils;->encodeUTF8([CII[BI)I

    move-result v0

    .line 69
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 70
    :cond_1
    new-array v1, v2, [B

    .line 71
    :goto_1
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    if-ge v0, v2, :cond_2

    .line 72
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    aget-char v2, v2, v0

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public getBytes(Ljava/nio/charset/Charset;)[B
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 8
    .line 9
    aget-char v3, v3, v1

    .line 10
    .line 11
    const/16 v4, 0x80

    .line 12
    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    if-eq p1, v1, :cond_4

    .line 22
    .line 23
    sget-object v1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    if-eq p1, v1, :cond_4

    .line 26
    .line 27
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    if-ne p1, v1, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :goto_1
    new-instance v1, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 35
    .line 36
    invoke-direct {v1, v3, v0, v2}, Ljava/lang/String;-><init>([CII)V

    .line 37
    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 42
    .line 43
    :cond_3
    invoke-virtual {v1, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_4
    :goto_2
    new-array p1, v2, [B

    .line 49
    .line 50
    :goto_3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 51
    .line 52
    if-ge v0, v1, :cond_5

    .line 53
    .line 54
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 55
    .line 56
    aget-char v1, v1, v0

    .line 57
    .line 58
    int-to-byte v1, v1

    .line 59
    aput-byte v1, p1, v0

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_5
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    return v0
.end method

.method public startArray()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->overflowLevel()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 17
    .line 18
    add-int/lit8 v1, v0, 0x3

    .line 19
    .line 20
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 21
    .line 22
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 23
    .line 24
    mul-int/2addr v2, v3

    .line 25
    add-int/2addr v2, v1

    .line 26
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 27
    .line 28
    array-length v3, v1

    .line 29
    if-le v2, v3, :cond_1

    .line 30
    .line 31
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    const/16 v3, 0x5b

    .line 38
    .line 39
    aput-char v3, v1, v0

    .line 40
    .line 41
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :cond_2
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public startObject()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    .line 10
    .line 11
    if-le v0, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->overflowLevel()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 17
    .line 18
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 19
    .line 20
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 21
    .line 22
    add-int/lit8 v2, v0, 0x3

    .line 23
    .line 24
    iget-byte v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 25
    .line 26
    iget v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 27
    .line 28
    mul-int/2addr v3, v4

    .line 29
    add-int/2addr v3, v2

    .line 30
    array-length v2, v1

    .line 31
    if-le v3, v2, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 38
    .line 39
    const/16 v3, 0x7b

    .line 40
    .line 41
    aput-char v3, v1, v0

    .line 42
    .line 43
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :cond_2
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 52
    .line 53
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public write(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 12

    .line 246
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    if-eqz v0, :cond_0

    .line 247
    invoke-super/range {p0 .. p1}, Lcom/alibaba/fastjson2/JSONWriter;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 248
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    return-void

    .line 249
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-wide v4, Lcom/alibaba/fastjson2/JSONWriter;->NONE_DIRECT_FEATURES:J

    and-long/2addr v2, v4

    const-wide/16 v7, 0x0

    cmp-long v2, v2, v7

    if-eqz v2, :cond_2

    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 251
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    return-void

    :cond_2
    const/16 v0, 0x7b

    .line 252
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeRaw(C)V

    .line 253
    invoke-virtual {p1}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    move-object v3, v2

    .line 254
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    .line 255
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v10, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v10

    cmp-long v4, v4, v7

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    if-nez v0, :cond_4

    const/16 v0, 0x2c

    .line 256
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeRaw(C)V

    .line 257
    :cond_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 258
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 259
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 260
    :cond_5
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeAny(Ljava/lang/Object;)V

    :goto_1
    const/16 v0, 0x3a

    .line 261
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeRaw(C)V

    if-nez v2, :cond_6

    .line 262
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_2

    .line 263
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 264
    const-class v3, Ljava/lang/String;

    if-ne v0, v3, :cond_7

    .line 265
    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    goto :goto_2

    .line 266
    :cond_7
    const-class v3, Ljava/lang/Integer;

    if-ne v0, v3, :cond_8

    .line 267
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    goto :goto_2

    .line 268
    :cond_8
    const-class v3, Ljava/lang/Long;

    if-ne v0, v3, :cond_9

    .line 269
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    goto :goto_2

    .line 270
    :cond_9
    const-class v3, Ljava/lang/Boolean;

    if-ne v0, v3, :cond_a

    .line 271
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    goto :goto_2

    .line 272
    :cond_a
    const-class v3, Ljava/math/BigDecimal;

    if-ne v0, v3, :cond_b

    .line 273
    check-cast v2, Ljava/math/BigDecimal;

    const/4 v0, 0x0

    invoke-virtual {p0, v2, v7, v8, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    goto :goto_2

    .line 274
    :cond_b
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    if-ne v0, v3, :cond_c

    .line 275
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->write(Ljava/util/List;)V

    goto :goto_2

    .line 276
    :cond_c
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    if-ne v0, v3, :cond_d

    .line 277
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    goto :goto_2

    .line 278
    :cond_d
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-virtual {v3, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    .line 279
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    :goto_2
    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_e
    const/16 v0, 0x7d

    .line 280
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeRaw(C)V

    return-void
.end method

.method public write(Ljava/util/List;)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    or-long/2addr v2, v4

    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr v2, v4

    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    or-long/2addr v2, v4

    .line 26
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 27
    .line 28
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 29
    .line 30
    and-long/2addr v2, v4

    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    cmp-long v2, v2, v7

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v4, 0x0

    .line 46
    const-wide/16 v5, 0x0

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    move-object v1, p0

    .line 50
    move-object v2, p1

    .line 51
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 56
    .line 57
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 58
    .line 59
    array-length v2, v2

    .line 60
    const/4 v9, 0x1

    .line 61
    if-ne v0, v2, :cond_2

    .line 62
    .line 63
    add-int/2addr v0, v9

    .line 64
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 68
    .line 69
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 70
    .line 71
    add-int/lit8 v3, v2, 0x1

    .line 72
    .line 73
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 74
    .line 75
    const/16 v3, 0x5b

    .line 76
    .line 77
    aput-char v3, v0, v2

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const/4 v11, 0x0

    .line 84
    move v0, v9

    .line 85
    move v12, v11

    .line 86
    :goto_0
    if-ge v12, v10, :cond_d

    .line 87
    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 91
    .line 92
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 93
    .line 94
    array-length v2, v2

    .line 95
    if-ne v0, v2, :cond_3

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 100
    .line 101
    .line 102
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 103
    .line 104
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 105
    .line 106
    add-int/lit8 v3, v2, 0x1

    .line 107
    .line 108
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 109
    .line 110
    const/16 v3, 0x2c

    .line 111
    .line 112
    aput-char v3, v0, v2

    .line 113
    .line 114
    :cond_4
    invoke-interface {p1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-nez v2, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-class v3, Ljava/lang/String;

    .line 129
    .line 130
    if-ne v0, v3, :cond_6

    .line 131
    .line 132
    check-cast v2, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    const-class v3, Ljava/lang/Integer;

    .line 139
    .line 140
    if-ne v0, v3, :cond_7

    .line 141
    .line 142
    check-cast v2, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_7
    const-class v3, Ljava/lang/Long;

    .line 149
    .line 150
    if-ne v0, v3, :cond_8

    .line 151
    .line 152
    check-cast v2, Ljava/lang/Long;

    .line 153
    .line 154
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_8
    const-class v3, Ljava/lang/Boolean;

    .line 159
    .line 160
    if-ne v0, v3, :cond_9

    .line 161
    .line 162
    check-cast v2, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_9
    const-class v3, Ljava/math/BigDecimal;

    .line 173
    .line 174
    if-ne v0, v3, :cond_a

    .line 175
    .line 176
    check-cast v2, Ljava/math/BigDecimal;

    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-virtual {p0, v2, v7, v8, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_a
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 184
    .line 185
    if-ne v0, v3, :cond_b

    .line 186
    .line 187
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 188
    .line 189
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->write(Ljava/util/List;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_b
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 194
    .line 195
    if-ne v0, v3, :cond_c

    .line 196
    .line 197
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 198
    .line 199
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_c
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 204
    .line 205
    invoke-virtual {v3, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    const/4 v4, 0x0

    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    move-object v1, p0

    .line 214
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 215
    .line 216
    .line 217
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 218
    .line 219
    move v0, v11

    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_d
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 223
    .line 224
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 225
    .line 226
    array-length v2, v2

    .line 227
    if-ne v0, v2, :cond_e

    .line 228
    .line 229
    add-int/2addr v0, v9

    .line 230
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 231
    .line 232
    .line 233
    :cond_e
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 234
    .line 235
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 236
    .line 237
    add-int/lit8 v3, v2, 0x1

    .line 238
    .line 239
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 240
    .line 241
    const/16 v3, 0x5d

    .line 242
    .line 243
    aput-char v3, v0, v2

    .line 244
    .line 245
    return-void
.end method

.method public write0(C)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    aput-char p1, v1, v0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 20
    .line 21
    return-void
.end method

.method public writeBase64([B)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    div-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    shl-int/2addr v0, v1

    .line 16
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    add-int/2addr v0, v1

    .line 20
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 24
    .line 25
    add-int/lit8 v3, v2, 0x1

    .line 26
    .line 27
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 28
    .line 29
    aput-char v4, v0, v2

    .line 30
    .line 31
    array-length v2, p1

    .line 32
    div-int/lit8 v2, v2, 0x3

    .line 33
    .line 34
    mul-int/lit8 v2, v2, 0x3

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v5, v2, :cond_1

    .line 39
    .line 40
    add-int/lit8 v6, v5, 0x1

    .line 41
    .line 42
    aget-byte v7, p1, v5

    .line 43
    .line 44
    and-int/lit16 v7, v7, 0xff

    .line 45
    .line 46
    shl-int/lit8 v7, v7, 0x10

    .line 47
    .line 48
    add-int/lit8 v8, v5, 0x2

    .line 49
    .line 50
    aget-byte v6, p1, v6

    .line 51
    .line 52
    and-int/lit16 v6, v6, 0xff

    .line 53
    .line 54
    shl-int/lit8 v6, v6, 0x8

    .line 55
    .line 56
    or-int/2addr v6, v7

    .line 57
    add-int/lit8 v5, v5, 0x3

    .line 58
    .line 59
    aget-byte v7, p1, v8

    .line 60
    .line 61
    and-int/lit16 v7, v7, 0xff

    .line 62
    .line 63
    or-int/2addr v6, v7

    .line 64
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->CA:[C

    .line 65
    .line 66
    ushr-int/lit8 v8, v6, 0x12

    .line 67
    .line 68
    and-int/lit8 v8, v8, 0x3f

    .line 69
    .line 70
    aget-char v8, v7, v8

    .line 71
    .line 72
    aput-char v8, v0, v3

    .line 73
    .line 74
    add-int/lit8 v8, v3, 0x1

    .line 75
    .line 76
    ushr-int/lit8 v9, v6, 0xc

    .line 77
    .line 78
    and-int/lit8 v9, v9, 0x3f

    .line 79
    .line 80
    aget-char v9, v7, v9

    .line 81
    .line 82
    aput-char v9, v0, v8

    .line 83
    .line 84
    add-int/lit8 v8, v3, 0x2

    .line 85
    .line 86
    ushr-int/lit8 v9, v6, 0x6

    .line 87
    .line 88
    and-int/lit8 v9, v9, 0x3f

    .line 89
    .line 90
    aget-char v9, v7, v9

    .line 91
    .line 92
    aput-char v9, v0, v8

    .line 93
    .line 94
    add-int/lit8 v8, v3, 0x3

    .line 95
    .line 96
    and-int/lit8 v6, v6, 0x3f

    .line 97
    .line 98
    aget-char v6, v7, v6

    .line 99
    .line 100
    aput-char v6, v0, v8

    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    array-length v5, p1

    .line 106
    sub-int/2addr v5, v2

    .line 107
    if-lez v5, :cond_4

    .line 108
    .line 109
    aget-byte v2, p1, v2

    .line 110
    .line 111
    and-int/lit16 v2, v2, 0xff

    .line 112
    .line 113
    shl-int/lit8 v2, v2, 0xa

    .line 114
    .line 115
    if-ne v5, v1, :cond_2

    .line 116
    .line 117
    array-length v4, p1

    .line 118
    add-int/lit8 v4, v4, -0x1

    .line 119
    .line 120
    aget-byte p1, p1, v4

    .line 121
    .line 122
    and-int/lit16 p1, p1, 0xff

    .line 123
    .line 124
    shl-int/lit8 v4, p1, 0x2

    .line 125
    .line 126
    :cond_2
    or-int p1, v2, v4

    .line 127
    .line 128
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CA:[C

    .line 129
    .line 130
    shr-int/lit8 v4, p1, 0xc

    .line 131
    .line 132
    aget-char v4, v2, v4

    .line 133
    .line 134
    aput-char v4, v0, v3

    .line 135
    .line 136
    add-int/lit8 v4, v3, 0x1

    .line 137
    .line 138
    ushr-int/lit8 v6, p1, 0x6

    .line 139
    .line 140
    and-int/lit8 v6, v6, 0x3f

    .line 141
    .line 142
    aget-char v6, v2, v6

    .line 143
    .line 144
    aput-char v6, v0, v4

    .line 145
    .line 146
    add-int/lit8 v4, v3, 0x2

    .line 147
    .line 148
    const/16 v6, 0x3d

    .line 149
    .line 150
    if-ne v5, v1, :cond_3

    .line 151
    .line 152
    and-int/lit8 p1, p1, 0x3f

    .line 153
    .line 154
    aget-char p1, v2, p1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    move p1, v6

    .line 158
    :goto_1
    aput-char p1, v0, v4

    .line 159
    .line 160
    add-int/lit8 p1, v3, 0x3

    .line 161
    .line 162
    aput-char v6, v0, p1

    .line 163
    .line 164
    add-int/lit8 v3, v3, 0x4

    .line 165
    .line 166
    :cond_4
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 167
    .line 168
    aput-char p1, v0, v3

    .line 169
    .line 170
    add-int/lit8 v3, v3, 0x1

    .line 171
    .line 172
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 173
    .line 174
    return-void
.end method

.method public writeBigInt(Ljava/math/BigInteger;J)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNumberNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/16 v0, 0xa

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 14
    .line 15
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 16
    .line 17
    or-long/2addr p2, v1

    .line 18
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 19
    .line 20
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 21
    .line 22
    and-long/2addr v1, p2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->LOW_BIGINT:Ljava/math/BigInteger;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ltz v1, :cond_1

    .line 38
    .line 39
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->HIGH_BIGINT:Ljava/math/BigInteger;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-lez p1, :cond_2

    .line 46
    .line 47
    :cond_1
    move p1, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move p1, v2

    .line 50
    :goto_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 51
    .line 52
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 53
    .line 54
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 55
    .line 56
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 57
    .line 58
    or-long/2addr v6, v8

    .line 59
    and-long/2addr p2, v6

    .line 60
    cmp-long p2, p2, v3

    .line 61
    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    move p2, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move p2, v2

    .line 67
    :goto_1
    if-nez p1, :cond_5

    .line 68
    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v5, v2

    .line 73
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 78
    .line 79
    add-int/2addr p2, p1

    .line 80
    add-int/lit8 p2, p2, 0x2

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 86
    .line 87
    iget p3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 88
    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    add-int/lit8 v1, p3, 0x1

    .line 92
    .line 93
    const/16 v3, 0x22

    .line 94
    .line 95
    aput-char v3, p2, p3

    .line 96
    .line 97
    invoke-virtual {v0, v2, p1, p2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 98
    .line 99
    .line 100
    add-int/2addr v1, p1

    .line 101
    add-int/lit8 p1, v1, 0x1

    .line 102
    .line 103
    aput-char v3, p2, v1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-virtual {v0, v2, p1, p2, p3}, Ljava/lang/String;->getChars(II[CI)V

    .line 107
    .line 108
    .line 109
    add-int/2addr p1, p3

    .line 110
    :goto_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 111
    .line 112
    return-void
.end method

.method public writeChar(C)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    aput-char v3, v1, v0

    .line 20
    .line 21
    const/16 v4, 0x22

    .line 22
    .line 23
    const/16 v5, 0x5c

    .line 24
    .line 25
    if-eq p1, v4, :cond_2

    .line 26
    .line 27
    const/16 v4, 0x27

    .line 28
    .line 29
    if-eq p1, v4, :cond_2

    .line 30
    .line 31
    if-eq p1, v5, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x31

    .line 34
    .line 35
    const/16 v6, 0x75

    .line 36
    .line 37
    const/16 v7, 0x30

    .line 38
    .line 39
    packed-switch p1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x2

    .line 43
    .line 44
    aput-char p1, v1, v2

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :pswitch_0
    aput-char v5, v1, v2

    .line 49
    .line 50
    add-int/lit8 v2, v0, 0x2

    .line 51
    .line 52
    aput-char v6, v1, v2

    .line 53
    .line 54
    add-int/lit8 v2, v0, 0x3

    .line 55
    .line 56
    aput-char v7, v1, v2

    .line 57
    .line 58
    add-int/lit8 v2, v0, 0x4

    .line 59
    .line 60
    aput-char v7, v1, v2

    .line 61
    .line 62
    add-int/lit8 v2, v0, 0x5

    .line 63
    .line 64
    aput-char v4, v1, v2

    .line 65
    .line 66
    add-int/lit8 v2, v0, 0x6

    .line 67
    .line 68
    add-int/lit8 p1, p1, 0x47

    .line 69
    .line 70
    int-to-char p1, p1

    .line 71
    aput-char p1, v1, v2

    .line 72
    .line 73
    :goto_0
    add-int/lit8 v0, v0, 0x7

    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :pswitch_1
    aput-char v5, v1, v2

    .line 78
    .line 79
    add-int/lit8 v2, v0, 0x2

    .line 80
    .line 81
    aput-char v6, v1, v2

    .line 82
    .line 83
    add-int/lit8 v2, v0, 0x3

    .line 84
    .line 85
    aput-char v7, v1, v2

    .line 86
    .line 87
    add-int/lit8 v2, v0, 0x4

    .line 88
    .line 89
    aput-char v7, v1, v2

    .line 90
    .line 91
    add-int/lit8 v2, v0, 0x5

    .line 92
    .line 93
    aput-char v4, v1, v2

    .line 94
    .line 95
    add-int/lit8 v2, v0, 0x6

    .line 96
    .line 97
    add-int/lit8 p1, p1, 0x20

    .line 98
    .line 99
    int-to-char p1, p1

    .line 100
    aput-char p1, v1, v2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_2
    aput-char v5, v1, v2

    .line 104
    .line 105
    add-int/lit8 p1, v0, 0x2

    .line 106
    .line 107
    const/16 v2, 0x72

    .line 108
    .line 109
    aput-char v2, v1, p1

    .line 110
    .line 111
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_3
    aput-char v5, v1, v2

    .line 115
    .line 116
    add-int/lit8 p1, v0, 0x2

    .line 117
    .line 118
    const/16 v2, 0x66

    .line 119
    .line 120
    aput-char v2, v1, p1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :pswitch_4
    aput-char v5, v1, v2

    .line 124
    .line 125
    add-int/lit8 v2, v0, 0x2

    .line 126
    .line 127
    aput-char v6, v1, v2

    .line 128
    .line 129
    add-int/lit8 v2, v0, 0x3

    .line 130
    .line 131
    aput-char v7, v1, v2

    .line 132
    .line 133
    add-int/lit8 v2, v0, 0x4

    .line 134
    .line 135
    aput-char v7, v1, v2

    .line 136
    .line 137
    add-int/lit8 v2, v0, 0x5

    .line 138
    .line 139
    aput-char v7, v1, v2

    .line 140
    .line 141
    add-int/lit8 v2, v0, 0x6

    .line 142
    .line 143
    add-int/lit8 p1, p1, 0x57

    .line 144
    .line 145
    int-to-char p1, p1

    .line 146
    aput-char p1, v1, v2

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :pswitch_5
    aput-char v5, v1, v2

    .line 150
    .line 151
    add-int/lit8 p1, v0, 0x2

    .line 152
    .line 153
    const/16 v2, 0x6e

    .line 154
    .line 155
    aput-char v2, v1, p1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_6
    aput-char v5, v1, v2

    .line 159
    .line 160
    add-int/lit8 p1, v0, 0x2

    .line 161
    .line 162
    const/16 v2, 0x74

    .line 163
    .line 164
    aput-char v2, v1, p1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :pswitch_7
    aput-char v5, v1, v2

    .line 168
    .line 169
    add-int/lit8 p1, v0, 0x2

    .line 170
    .line 171
    const/16 v2, 0x62

    .line 172
    .line 173
    aput-char v2, v1, p1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :pswitch_8
    aput-char v5, v1, v2

    .line 177
    .line 178
    add-int/lit8 v2, v0, 0x2

    .line 179
    .line 180
    aput-char v6, v1, v2

    .line 181
    .line 182
    add-int/lit8 v2, v0, 0x3

    .line 183
    .line 184
    aput-char v7, v1, v2

    .line 185
    .line 186
    add-int/lit8 v2, v0, 0x4

    .line 187
    .line 188
    aput-char v7, v1, v2

    .line 189
    .line 190
    add-int/lit8 v2, v0, 0x5

    .line 191
    .line 192
    aput-char v7, v1, v2

    .line 193
    .line 194
    add-int/lit8 v2, v0, 0x6

    .line 195
    .line 196
    add-int/2addr p1, v7

    .line 197
    int-to-char p1, p1

    .line 198
    aput-char p1, v1, v2

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_1
    aput-char v5, v1, v2

    .line 202
    .line 203
    add-int/lit8 v2, v0, 0x2

    .line 204
    .line 205
    aput-char p1, v1, v2

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_2
    if-ne p1, v3, :cond_3

    .line 209
    .line 210
    add-int/lit8 v0, v0, 0x2

    .line 211
    .line 212
    aput-char v5, v1, v2

    .line 213
    .line 214
    move v2, v0

    .line 215
    :cond_3
    add-int/lit8 v0, v2, 0x1

    .line 216
    .line 217
    aput-char p1, v1, v2

    .line 218
    .line 219
    :goto_2
    aput-char v3, v1, v0

    .line 220
    .line 221
    add-int/lit8 v0, v0, 0x1

    .line 222
    .line 223
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 224
    .line 225
    return-void

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public writeColon()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    const/16 v2, 0x3a

    .line 16
    .line 17
    aput-char v2, v1, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 22
    .line 23
    return-void
.end method

.method public writeComma()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x2

    .line 7
    .line 8
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 9
    .line 10
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 11
    .line 12
    mul-int/2addr v2, v3

    .line 13
    add-int/2addr v2, v1

    .line 14
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 15
    .line 16
    array-length v3, v1

    .line 17
    if-le v2, v3, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 24
    .line 25
    const/16 v3, 0x2c

    .line 26
    .line 27
    aput-char v3, v1, v0

    .line 28
    .line 29
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :cond_1
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 38
    .line 39
    return-void
.end method

.method public writeDateTime14(IIIIII)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    aput-char v3, v2, v0

    .line 18
    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x270f

    .line 22
    .line 23
    if-gt p1, v4, :cond_1

    .line 24
    .line 25
    div-int/lit16 v4, p1, 0x3e8

    .line 26
    .line 27
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 28
    .line 29
    mul-int/lit16 v6, v4, 0x3e8

    .line 30
    .line 31
    sub-int/2addr p1, v6

    .line 32
    aget p1, v5, p1

    .line 33
    .line 34
    add-int/lit8 v6, v0, 0x1

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x30

    .line 37
    .line 38
    int-to-byte v4, v4

    .line 39
    int-to-char v4, v4

    .line 40
    aput-char v4, v2, v6

    .line 41
    .line 42
    add-int/lit8 v4, v0, 0x2

    .line 43
    .line 44
    shr-int/lit8 v6, p1, 0x10

    .line 45
    .line 46
    int-to-byte v6, v6

    .line 47
    int-to-char v6, v6

    .line 48
    aput-char v6, v2, v4

    .line 49
    .line 50
    add-int/lit8 v4, v0, 0x3

    .line 51
    .line 52
    shr-int/lit8 v6, p1, 0x8

    .line 53
    .line 54
    int-to-byte v6, v6

    .line 55
    int-to-char v6, v6

    .line 56
    aput-char v6, v2, v4

    .line 57
    .line 58
    add-int/lit8 v4, v0, 0x4

    .line 59
    .line 60
    int-to-byte p1, p1

    .line 61
    int-to-char p1, p1

    .line 62
    aput-char p1, v2, v4

    .line 63
    .line 64
    aget p1, v5, p2

    .line 65
    .line 66
    add-int/lit8 p2, v0, 0x5

    .line 67
    .line 68
    shr-int/lit8 v4, p1, 0x8

    .line 69
    .line 70
    int-to-byte v4, v4

    .line 71
    int-to-char v4, v4

    .line 72
    aput-char v4, v2, p2

    .line 73
    .line 74
    add-int/lit8 p2, v0, 0x6

    .line 75
    .line 76
    int-to-byte p1, p1

    .line 77
    int-to-char p1, p1

    .line 78
    aput-char p1, v2, p2

    .line 79
    .line 80
    aget p1, v5, p3

    .line 81
    .line 82
    add-int/lit8 p2, v0, 0x7

    .line 83
    .line 84
    shr-int/lit8 p3, p1, 0x8

    .line 85
    .line 86
    int-to-byte p3, p3

    .line 87
    int-to-char p3, p3

    .line 88
    aput-char p3, v2, p2

    .line 89
    .line 90
    add-int/lit8 p2, v0, 0x8

    .line 91
    .line 92
    int-to-byte p1, p1

    .line 93
    int-to-char p1, p1

    .line 94
    aput-char p1, v2, p2

    .line 95
    .line 96
    aget p1, v5, p4

    .line 97
    .line 98
    add-int/lit8 p2, v0, 0x9

    .line 99
    .line 100
    shr-int/lit8 p3, p1, 0x8

    .line 101
    .line 102
    int-to-byte p3, p3

    .line 103
    int-to-char p3, p3

    .line 104
    aput-char p3, v2, p2

    .line 105
    .line 106
    add-int/lit8 p2, v0, 0xa

    .line 107
    .line 108
    int-to-byte p1, p1

    .line 109
    int-to-char p1, p1

    .line 110
    aput-char p1, v2, p2

    .line 111
    .line 112
    aget p1, v5, p5

    .line 113
    .line 114
    add-int/lit8 p2, v0, 0xb

    .line 115
    .line 116
    shr-int/lit8 p3, p1, 0x8

    .line 117
    .line 118
    int-to-byte p3, p3

    .line 119
    int-to-char p3, p3

    .line 120
    aput-char p3, v2, p2

    .line 121
    .line 122
    add-int/lit8 p2, v0, 0xc

    .line 123
    .line 124
    int-to-byte p1, p1

    .line 125
    int-to-char p1, p1

    .line 126
    aput-char p1, v2, p2

    .line 127
    .line 128
    aget p1, v5, p6

    .line 129
    .line 130
    add-int/lit8 p2, v0, 0xd

    .line 131
    .line 132
    shr-int/lit8 p3, p1, 0x8

    .line 133
    .line 134
    int-to-byte p3, p3

    .line 135
    int-to-char p3, p3

    .line 136
    aput-char p3, v2, p2

    .line 137
    .line 138
    add-int/lit8 p2, v0, 0xe

    .line 139
    .line 140
    int-to-byte p1, p1

    .line 141
    int-to-char p1, p1

    .line 142
    aput-char p1, v2, p2

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0xf

    .line 145
    .line 146
    aput-char v3, v2, v0

    .line 147
    .line 148
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 149
    .line 150
    return-void

    .line 151
    :cond_1
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 152
    .line 153
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public writeDateTime19(IIIIII)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 9
    .line 10
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 11
    .line 12
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 13
    .line 14
    aput-char v2, v0, v1

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    const/16 v3, 0x270f

    .line 19
    .line 20
    if-gt p1, v3, :cond_0

    .line 21
    .line 22
    div-int/lit16 v3, p1, 0x3e8

    .line 23
    .line 24
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 25
    .line 26
    mul-int/lit16 v5, v3, 0x3e8

    .line 27
    .line 28
    sub-int/2addr p1, v5

    .line 29
    aget p1, v4, p1

    .line 30
    .line 31
    add-int/lit8 v5, v1, 0x1

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x30

    .line 34
    .line 35
    int-to-byte v3, v3

    .line 36
    int-to-char v3, v3

    .line 37
    aput-char v3, v0, v5

    .line 38
    .line 39
    add-int/lit8 v3, v1, 0x2

    .line 40
    .line 41
    shr-int/lit8 v5, p1, 0x10

    .line 42
    .line 43
    int-to-byte v5, v5

    .line 44
    int-to-char v5, v5

    .line 45
    aput-char v5, v0, v3

    .line 46
    .line 47
    add-int/lit8 v3, v1, 0x3

    .line 48
    .line 49
    shr-int/lit8 v5, p1, 0x8

    .line 50
    .line 51
    int-to-byte v5, v5

    .line 52
    int-to-char v5, v5

    .line 53
    aput-char v5, v0, v3

    .line 54
    .line 55
    add-int/lit8 v3, v1, 0x4

    .line 56
    .line 57
    int-to-byte p1, p1

    .line 58
    int-to-char p1, p1

    .line 59
    aput-char p1, v0, v3

    .line 60
    .line 61
    add-int/lit8 p1, v1, 0x5

    .line 62
    .line 63
    const/16 v3, 0x2d

    .line 64
    .line 65
    aput-char v3, v0, p1

    .line 66
    .line 67
    aget p1, v4, p2

    .line 68
    .line 69
    add-int/lit8 p2, v1, 0x6

    .line 70
    .line 71
    shr-int/lit8 v5, p1, 0x8

    .line 72
    .line 73
    int-to-byte v5, v5

    .line 74
    int-to-char v5, v5

    .line 75
    aput-char v5, v0, p2

    .line 76
    .line 77
    add-int/lit8 p2, v1, 0x7

    .line 78
    .line 79
    int-to-byte p1, p1

    .line 80
    int-to-char p1, p1

    .line 81
    aput-char p1, v0, p2

    .line 82
    .line 83
    add-int/lit8 p1, v1, 0x8

    .line 84
    .line 85
    aput-char v3, v0, p1

    .line 86
    .line 87
    aget p1, v4, p3

    .line 88
    .line 89
    add-int/lit8 p2, v1, 0x9

    .line 90
    .line 91
    shr-int/lit8 p3, p1, 0x8

    .line 92
    .line 93
    int-to-byte p3, p3

    .line 94
    int-to-char p3, p3

    .line 95
    aput-char p3, v0, p2

    .line 96
    .line 97
    add-int/lit8 p2, v1, 0xa

    .line 98
    .line 99
    int-to-byte p1, p1

    .line 100
    int-to-char p1, p1

    .line 101
    aput-char p1, v0, p2

    .line 102
    .line 103
    add-int/lit8 p1, v1, 0xb

    .line 104
    .line 105
    const/16 p2, 0x20

    .line 106
    .line 107
    aput-char p2, v0, p1

    .line 108
    .line 109
    aget p1, v4, p4

    .line 110
    .line 111
    add-int/lit8 p2, v1, 0xc

    .line 112
    .line 113
    shr-int/lit8 p3, p1, 0x8

    .line 114
    .line 115
    int-to-byte p3, p3

    .line 116
    int-to-char p3, p3

    .line 117
    aput-char p3, v0, p2

    .line 118
    .line 119
    add-int/lit8 p2, v1, 0xd

    .line 120
    .line 121
    int-to-byte p1, p1

    .line 122
    int-to-char p1, p1

    .line 123
    aput-char p1, v0, p2

    .line 124
    .line 125
    add-int/lit8 p1, v1, 0xe

    .line 126
    .line 127
    const/16 p2, 0x3a

    .line 128
    .line 129
    aput-char p2, v0, p1

    .line 130
    .line 131
    aget p1, v4, p5

    .line 132
    .line 133
    add-int/lit8 p3, v1, 0xf

    .line 134
    .line 135
    shr-int/lit8 p4, p1, 0x8

    .line 136
    .line 137
    int-to-byte p4, p4

    .line 138
    int-to-char p4, p4

    .line 139
    aput-char p4, v0, p3

    .line 140
    .line 141
    add-int/lit8 p3, v1, 0x10

    .line 142
    .line 143
    int-to-byte p1, p1

    .line 144
    int-to-char p1, p1

    .line 145
    aput-char p1, v0, p3

    .line 146
    .line 147
    add-int/lit8 p1, v1, 0x11

    .line 148
    .line 149
    aput-char p2, v0, p1

    .line 150
    .line 151
    aget p1, v4, p6

    .line 152
    .line 153
    add-int/lit8 p2, v1, 0x12

    .line 154
    .line 155
    shr-int/lit8 p3, p1, 0x8

    .line 156
    .line 157
    int-to-byte p3, p3

    .line 158
    int-to-char p3, p3

    .line 159
    aput-char p3, v0, p2

    .line 160
    .line 161
    add-int/lit8 p2, v1, 0x13

    .line 162
    .line 163
    int-to-byte p1, p1

    .line 164
    int-to-char p1, p1

    .line 165
    aput-char p1, v0, p2

    .line 166
    .line 167
    add-int/lit8 p1, v1, 0x14

    .line 168
    .line 169
    int-to-byte p2, v2

    .line 170
    int-to-char p2, p2

    .line 171
    aput-char p2, v0, p1

    .line 172
    .line 173
    add-int/lit8 v1, v1, 0x15

    .line 174
    .line 175
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 176
    .line 177
    return-void

    .line 178
    :cond_0
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 179
    .line 180
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public writeDateTimeISO8601(IIIIIIIIZ)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p9, :cond_1

    .line 3
    .line 4
    if-nez p8, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x6

    .line 9
    goto :goto_0

    .line 10
    :cond_1
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 12
    .line 13
    add-int/lit8 v3, v2, 0x19

    .line 14
    .line 15
    add-int/2addr v3, v1

    .line 16
    add-int v1, v2, v3

    .line 17
    .line 18
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 19
    .line 20
    array-length v4, v4

    .line 21
    if-lt v1, v4, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 27
    .line 28
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 29
    .line 30
    aput-char v3, v1, v2

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/16 v2, 0x2d

    .line 38
    .line 39
    aput-char v2, v1, p1

    .line 40
    .line 41
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 42
    .line 43
    aget p2, v3, p2

    .line 44
    .line 45
    add-int/lit8 v4, p1, 0x1

    .line 46
    .line 47
    shr-int/lit8 v5, p2, 0x8

    .line 48
    .line 49
    int-to-byte v5, v5

    .line 50
    int-to-char v5, v5

    .line 51
    aput-char v5, v1, v4

    .line 52
    .line 53
    add-int/lit8 v4, p1, 0x2

    .line 54
    .line 55
    int-to-byte p2, p2

    .line 56
    int-to-char p2, p2

    .line 57
    aput-char p2, v1, v4

    .line 58
    .line 59
    add-int/lit8 p2, p1, 0x3

    .line 60
    .line 61
    aput-char v2, v1, p2

    .line 62
    .line 63
    aget p2, v3, p3

    .line 64
    .line 65
    add-int/lit8 p3, p1, 0x4

    .line 66
    .line 67
    shr-int/lit8 v4, p2, 0x8

    .line 68
    .line 69
    int-to-byte v4, v4

    .line 70
    int-to-char v4, v4

    .line 71
    aput-char v4, v1, p3

    .line 72
    .line 73
    add-int/lit8 p3, p1, 0x5

    .line 74
    .line 75
    int-to-byte p2, p2

    .line 76
    int-to-char p2, p2

    .line 77
    aput-char p2, v1, p3

    .line 78
    .line 79
    add-int/lit8 p2, p1, 0x6

    .line 80
    .line 81
    if-eqz p9, :cond_3

    .line 82
    .line 83
    const/16 p3, 0x54

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const/16 p3, 0x20

    .line 87
    .line 88
    :goto_1
    int-to-byte p3, p3

    .line 89
    int-to-char p3, p3

    .line 90
    aput-char p3, v1, p2

    .line 91
    .line 92
    aget p2, v3, p4

    .line 93
    .line 94
    add-int/lit8 p3, p1, 0x7

    .line 95
    .line 96
    shr-int/lit8 p4, p2, 0x8

    .line 97
    .line 98
    int-to-byte p4, p4

    .line 99
    int-to-char p4, p4

    .line 100
    aput-char p4, v1, p3

    .line 101
    .line 102
    add-int/lit8 p3, p1, 0x8

    .line 103
    .line 104
    int-to-byte p2, p2

    .line 105
    int-to-char p2, p2

    .line 106
    aput-char p2, v1, p3

    .line 107
    .line 108
    add-int/lit8 p2, p1, 0x9

    .line 109
    .line 110
    const/16 p3, 0x3a

    .line 111
    .line 112
    aput-char p3, v1, p2

    .line 113
    .line 114
    aget p2, v3, p5

    .line 115
    .line 116
    add-int/lit8 p4, p1, 0xa

    .line 117
    .line 118
    shr-int/lit8 p5, p2, 0x8

    .line 119
    .line 120
    int-to-byte p5, p5

    .line 121
    int-to-char p5, p5

    .line 122
    aput-char p5, v1, p4

    .line 123
    .line 124
    add-int/lit8 p4, p1, 0xb

    .line 125
    .line 126
    int-to-byte p2, p2

    .line 127
    int-to-char p2, p2

    .line 128
    aput-char p2, v1, p4

    .line 129
    .line 130
    add-int/lit8 p2, p1, 0xc

    .line 131
    .line 132
    aput-char p3, v1, p2

    .line 133
    .line 134
    aget p2, v3, p6

    .line 135
    .line 136
    add-int/lit8 p4, p1, 0xd

    .line 137
    .line 138
    shr-int/lit8 p5, p2, 0x8

    .line 139
    .line 140
    int-to-byte p5, p5

    .line 141
    int-to-char p5, p5

    .line 142
    aput-char p5, v1, p4

    .line 143
    .line 144
    add-int/lit8 p4, p1, 0xe

    .line 145
    .line 146
    int-to-byte p2, p2

    .line 147
    int-to-char p2, p2

    .line 148
    aput-char p2, v1, p4

    .line 149
    .line 150
    add-int/lit8 p2, p1, 0xf

    .line 151
    .line 152
    if-lez p7, :cond_6

    .line 153
    .line 154
    add-int/lit8 p4, p1, 0x10

    .line 155
    .line 156
    const/16 p5, 0x2e

    .line 157
    .line 158
    aput-char p5, v1, p2

    .line 159
    .line 160
    div-int/lit8 p2, p7, 0xa

    .line 161
    .line 162
    div-int/lit8 p5, p2, 0xa

    .line 163
    .line 164
    mul-int/lit8 p6, p2, 0xa

    .line 165
    .line 166
    sub-int p6, p7, p6

    .line 167
    .line 168
    if-eqz p6, :cond_4

    .line 169
    .line 170
    aget p2, v3, p7

    .line 171
    .line 172
    shr-int/lit8 p5, p2, 0x10

    .line 173
    .line 174
    int-to-byte p5, p5

    .line 175
    int-to-char p5, p5

    .line 176
    aput-char p5, v1, p4

    .line 177
    .line 178
    add-int/lit8 p4, p1, 0x11

    .line 179
    .line 180
    shr-int/lit8 p5, p2, 0x8

    .line 181
    .line 182
    int-to-byte p5, p5

    .line 183
    int-to-char p5, p5

    .line 184
    aput-char p5, v1, p4

    .line 185
    .line 186
    add-int/lit8 p4, p1, 0x12

    .line 187
    .line 188
    int-to-byte p2, p2

    .line 189
    int-to-char p2, p2

    .line 190
    aput-char p2, v1, p4

    .line 191
    .line 192
    add-int/lit8 p2, p1, 0x13

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_4
    mul-int/lit8 p6, p5, 0xa

    .line 196
    .line 197
    sub-int p6, p2, p6

    .line 198
    .line 199
    if-eqz p6, :cond_5

    .line 200
    .line 201
    aget p2, v3, p2

    .line 202
    .line 203
    shr-int/lit8 p5, p2, 0x8

    .line 204
    .line 205
    int-to-byte p5, p5

    .line 206
    int-to-char p5, p5

    .line 207
    aput-char p5, v1, p4

    .line 208
    .line 209
    add-int/lit8 p4, p1, 0x11

    .line 210
    .line 211
    int-to-byte p2, p2

    .line 212
    int-to-char p2, p2

    .line 213
    aput-char p2, v1, p4

    .line 214
    .line 215
    add-int/lit8 p2, p1, 0x12

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    add-int/lit8 p2, p1, 0x11

    .line 219
    .line 220
    add-int/lit8 p5, p5, 0x30

    .line 221
    .line 222
    int-to-byte p1, p5

    .line 223
    int-to-char p1, p1

    .line 224
    aput-char p1, v1, p4

    .line 225
    .line 226
    :cond_6
    :goto_2
    if-eqz p9, :cond_a

    .line 227
    .line 228
    div-int/lit16 p1, p8, 0xe10

    .line 229
    .line 230
    if-nez p8, :cond_7

    .line 231
    .line 232
    add-int/lit8 p1, p2, 0x1

    .line 233
    .line 234
    const/16 p3, 0x5a

    .line 235
    .line 236
    aput-char p3, v1, p2

    .line 237
    .line 238
    move p2, p1

    .line 239
    goto :goto_3

    .line 240
    :cond_7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    if-ltz p1, :cond_8

    .line 245
    .line 246
    const/16 v2, 0x2b

    .line 247
    .line 248
    :cond_8
    aput-char v2, v1, p2

    .line 249
    .line 250
    aget p4, v3, p4

    .line 251
    .line 252
    add-int/lit8 p5, p2, 0x1

    .line 253
    .line 254
    shr-int/lit8 p6, p4, 0x8

    .line 255
    .line 256
    int-to-byte p6, p6

    .line 257
    int-to-char p6, p6

    .line 258
    aput-char p6, v1, p5

    .line 259
    .line 260
    add-int/lit8 p5, p2, 0x2

    .line 261
    .line 262
    int-to-byte p4, p4

    .line 263
    int-to-char p4, p4

    .line 264
    aput-char p4, v1, p5

    .line 265
    .line 266
    add-int/lit8 p4, p2, 0x3

    .line 267
    .line 268
    aput-char p3, v1, p4

    .line 269
    .line 270
    mul-int/lit16 p1, p1, 0xe10

    .line 271
    .line 272
    sub-int/2addr p8, p1

    .line 273
    div-int/lit8 p8, p8, 0x3c

    .line 274
    .line 275
    if-gez p8, :cond_9

    .line 276
    .line 277
    neg-int p8, p8

    .line 278
    :cond_9
    aget p1, v3, p8

    .line 279
    .line 280
    add-int/lit8 p3, p2, 0x4

    .line 281
    .line 282
    shr-int/lit8 p4, p1, 0x8

    .line 283
    .line 284
    int-to-byte p4, p4

    .line 285
    int-to-char p4, p4

    .line 286
    aput-char p4, v1, p3

    .line 287
    .line 288
    add-int/lit8 p3, p2, 0x5

    .line 289
    .line 290
    int-to-byte p1, p1

    .line 291
    int-to-char p1, p1

    .line 292
    aput-char p1, v1, p3

    .line 293
    .line 294
    add-int/lit8 p2, p2, 0x6

    .line 295
    .line 296
    :cond_a
    :goto_3
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 297
    .line 298
    aput-char p1, v1, p2

    .line 299
    .line 300
    add-int/2addr p2, v0

    .line 301
    iput p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 302
    .line 303
    return-void
.end method

.method public writeDateYYYMMDD10(III)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    aput-char v3, v1, v0

    .line 20
    .line 21
    invoke-static {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 26
    .line 27
    aput-char p2, v1, p1

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 32
    .line 33
    return-void
.end method

.method public writeDateYYYMMDD8(III)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    aput-char v3, v2, v0

    .line 18
    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x270f

    .line 22
    .line 23
    if-gt p1, v4, :cond_1

    .line 24
    .line 25
    div-int/lit16 v4, p1, 0x3e8

    .line 26
    .line 27
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 28
    .line 29
    mul-int/lit16 v6, v4, 0x3e8

    .line 30
    .line 31
    sub-int/2addr p1, v6

    .line 32
    aget p1, v5, p1

    .line 33
    .line 34
    add-int/lit8 v6, v0, 0x1

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x30

    .line 37
    .line 38
    int-to-byte v4, v4

    .line 39
    int-to-char v4, v4

    .line 40
    aput-char v4, v2, v6

    .line 41
    .line 42
    add-int/lit8 v4, v0, 0x2

    .line 43
    .line 44
    shr-int/lit8 v6, p1, 0x10

    .line 45
    .line 46
    int-to-byte v6, v6

    .line 47
    int-to-char v6, v6

    .line 48
    aput-char v6, v2, v4

    .line 49
    .line 50
    add-int/lit8 v4, v0, 0x3

    .line 51
    .line 52
    shr-int/lit8 v6, p1, 0x8

    .line 53
    .line 54
    int-to-byte v6, v6

    .line 55
    int-to-char v6, v6

    .line 56
    aput-char v6, v2, v4

    .line 57
    .line 58
    add-int/lit8 v4, v0, 0x4

    .line 59
    .line 60
    int-to-byte p1, p1

    .line 61
    int-to-char p1, p1

    .line 62
    aput-char p1, v2, v4

    .line 63
    .line 64
    aget p1, v5, p2

    .line 65
    .line 66
    add-int/lit8 p2, v0, 0x5

    .line 67
    .line 68
    shr-int/lit8 v4, p1, 0x8

    .line 69
    .line 70
    int-to-byte v4, v4

    .line 71
    int-to-char v4, v4

    .line 72
    aput-char v4, v2, p2

    .line 73
    .line 74
    add-int/lit8 p2, v0, 0x6

    .line 75
    .line 76
    int-to-byte p1, p1

    .line 77
    int-to-char p1, p1

    .line 78
    aput-char p1, v2, p2

    .line 79
    .line 80
    aget p1, v5, p3

    .line 81
    .line 82
    add-int/lit8 p2, v0, 0x7

    .line 83
    .line 84
    shr-int/lit8 p3, p1, 0x8

    .line 85
    .line 86
    int-to-byte p3, p3

    .line 87
    int-to-char p3, p3

    .line 88
    aput-char p3, v2, p2

    .line 89
    .line 90
    add-int/lit8 p2, v0, 0x8

    .line 91
    .line 92
    int-to-byte p1, p1

    .line 93
    int-to-char p1, p1

    .line 94
    aput-char p1, v2, p2

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x9

    .line 97
    .line 98
    aput-char v3, v2, v0

    .line 99
    .line 100
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 101
    .line 102
    return-void

    .line 103
    :cond_1
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 104
    .line 105
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeDecimalNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    if-eqz p4, :cond_1

    .line 8
    .line 9
    invoke-virtual {p4, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeRaw(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 18
    .line 19
    iget-wide v0, p4, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 20
    .line 21
    or-long/2addr p2, v0

    .line 22
    invoke-virtual {p1}, Ljava/math/BigDecimal;->precision()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 27
    .line 28
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 29
    .line 30
    and-long/2addr v0, p2

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 40
    .line 41
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 42
    .line 43
    and-long/2addr v4, p2

    .line 44
    cmp-long v0, v4, v2

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    const/16 v0, 0x10

    .line 49
    .line 50
    if-lt p4, v0, :cond_4

    .line 51
    .line 52
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->LOW:Ljava/math/BigDecimal;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-ltz v0, :cond_3

    .line 59
    .line 60
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->HIGH:Ljava/math/BigDecimal;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-lez v0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move v0, v1

    .line 71
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 72
    .line 73
    add-int/2addr p4, v4

    .line 74
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    add-int/2addr v5, p4

    .line 83
    add-int/lit8 v5, v5, 0x7

    .line 84
    .line 85
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 86
    .line 87
    array-length p4, p4

    .line 88
    if-lt v5, p4, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 94
    .line 95
    const/16 v5, 0x22

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    add-int/lit8 v6, v4, 0x1

    .line 100
    .line 101
    aput-char v5, p4, v4

    .line 102
    .line 103
    move v4, v6

    .line 104
    :cond_6
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBigDecimalAsPlain:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 105
    .line 106
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 107
    .line 108
    and-long/2addr p2, v6

    .line 109
    cmp-long p2, p2, v2

    .line 110
    .line 111
    if-eqz p2, :cond_7

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_2

    .line 118
    :cond_7
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-virtual {p1, v1, p2, p4, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    add-int/2addr p1, v4

    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    add-int/lit8 p2, p1, 0x1

    .line 137
    .line 138
    aput-char v5, p4, p1

    .line 139
    .line 140
    move p1, p2

    .line 141
    :cond_8
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 142
    .line 143
    return-void
.end method

.method public writeDouble(D)V
    .locals 6

    .line 99
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 100
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0x18

    if-eqz v0, :cond_1

    add-int/lit8 v3, v2, 0x1a

    .line 101
    :cond_1
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v4, v4

    if-lt v3, v4, :cond_2

    .line 102
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 103
    :cond_2
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    const/16 v4, 0x22

    if-eqz v0, :cond_3

    add-int/lit8 v5, v2, 0x1

    .line 104
    aput-char v4, v3, v2

    move v2, v5

    .line 105
    :cond_3
    invoke-static {p1, p2, v3, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[CIZ)I

    move-result p1

    add-int/2addr p1, v2

    if-eqz v0, :cond_4

    add-int/lit8 p2, p1, 0x1

    .line 106
    aput-char v4, v3, p1

    move p1, p2

    .line 107
    :cond_4
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeDouble([D)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/16 v5, 0x1b

    .line 31
    .line 32
    invoke-static {v4, v5, v3, v2}, Lp/a;->g(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 37
    .line 38
    array-length v5, v5

    .line 39
    if-lt v4, v5, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 45
    .line 46
    add-int/lit8 v5, v3, 0x1

    .line 47
    .line 48
    const/16 v6, 0x5b

    .line 49
    .line 50
    aput-char v6, v4, v3

    .line 51
    .line 52
    :goto_1
    array-length v3, p1

    .line 53
    if-ge v1, v3, :cond_6

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    add-int/lit8 v3, v5, 0x1

    .line 58
    .line 59
    const/16 v6, 0x2c

    .line 60
    .line 61
    aput-char v6, v4, v5

    .line 62
    .line 63
    move v5, v3

    .line 64
    :cond_3
    const/16 v3, 0x22

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    add-int/lit8 v6, v5, 0x1

    .line 69
    .line 70
    aput-char v3, v4, v5

    .line 71
    .line 72
    move v5, v6

    .line 73
    :cond_4
    aget-wide v6, p1, v1

    .line 74
    .line 75
    invoke-static {v6, v7, v4, v5, v2}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[CIZ)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    add-int/2addr v6, v5

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    add-int/lit8 v5, v6, 0x1

    .line 83
    .line 84
    aput-char v3, v4, v6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    move v5, v6

    .line 88
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    const/16 p1, 0x5d

    .line 92
    .line 93
    aput-char p1, v4, v5

    .line 94
    .line 95
    add-int/2addr v5, v2

    .line 96
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 97
    .line 98
    return-void
.end method

.method public writeDoubleArray(DD)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 21
    .line 22
    add-int/lit8 v3, v2, 0x33

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    add-int/lit8 v3, v2, 0x35

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 32
    .line 33
    add-int/lit8 v4, v2, 0x1

    .line 34
    .line 35
    const/16 v5, 0x5b

    .line 36
    .line 37
    aput-char v5, v3, v2

    .line 38
    .line 39
    const/16 v5, 0x22

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x2

    .line 44
    .line 45
    aput-char v5, v3, v4

    .line 46
    .line 47
    move v4, v2

    .line 48
    :cond_2
    invoke-static {p1, p2, v3, v4, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[CIZ)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    add-int/2addr p1, v4

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    add-int/lit8 p2, p1, 0x1

    .line 56
    .line 57
    aput-char v5, v3, p1

    .line 58
    .line 59
    move p1, p2

    .line 60
    :cond_3
    add-int/lit8 p2, p1, 0x1

    .line 61
    .line 62
    const/16 v2, 0x2c

    .line 63
    .line 64
    aput-char v2, v3, p1

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    add-int/lit8 p1, p1, 0x2

    .line 69
    .line 70
    aput-char v5, v3, p2

    .line 71
    .line 72
    move p2, p1

    .line 73
    :cond_4
    invoke-static {p3, p4, v3, p2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[CIZ)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    add-int/2addr p1, p2

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    add-int/lit8 p2, p1, 0x1

    .line 81
    .line 82
    aput-char v5, v3, p1

    .line 83
    .line 84
    move p1, p2

    .line 85
    :cond_5
    const/16 p2, 0x5d

    .line 86
    .line 87
    aput-char p2, v3, p1

    .line 88
    .line 89
    add-int/2addr p1, v1

    .line 90
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 91
    .line 92
    return-void
.end method

.method public writeFloat(F)V
    .locals 6

    .line 104
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 105
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0xf

    if-eqz v0, :cond_1

    add-int/lit8 v3, v2, 0x11

    .line 106
    :cond_1
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 107
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    const/16 v4, 0x22

    if-eqz v0, :cond_2

    add-int/lit8 v5, v2, 0x1

    .line 108
    aput-char v4, v3, v2

    move v2, v5

    .line 109
    :cond_2
    invoke-static {p1, v3, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(F[CIZ)I

    move-result p1

    add-int/2addr p1, v2

    if-eqz v0, :cond_3

    add-int/lit8 v0, p1, 0x1

    .line 110
    aput-char v4, v3, p1

    move p1, v0

    .line 111
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeFloat([F)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const/16 v5, 0x10

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/16 v5, 0x12

    .line 36
    .line 37
    :goto_1
    invoke-static {v4, v5, v3, v2}, Lp/a;->g(IIII)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 42
    .line 43
    array-length v5, v5

    .line 44
    if-lt v4, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 50
    .line 51
    add-int/lit8 v5, v3, 0x1

    .line 52
    .line 53
    const/16 v6, 0x5b

    .line 54
    .line 55
    aput-char v6, v4, v3

    .line 56
    .line 57
    :goto_2
    array-length v3, p1

    .line 58
    if-ge v1, v3, :cond_7

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    add-int/lit8 v3, v5, 0x1

    .line 63
    .line 64
    const/16 v6, 0x2c

    .line 65
    .line 66
    aput-char v6, v4, v5

    .line 67
    .line 68
    move v5, v3

    .line 69
    :cond_4
    const/16 v3, 0x22

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    add-int/lit8 v6, v5, 0x1

    .line 74
    .line 75
    aput-char v3, v4, v5

    .line 76
    .line 77
    move v5, v6

    .line 78
    :cond_5
    aget v6, p1, v1

    .line 79
    .line 80
    invoke-static {v6, v4, v5, v2}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(F[CIZ)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    add-int/2addr v6, v5

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    add-int/lit8 v5, v6, 0x1

    .line 88
    .line 89
    aput-char v3, v4, v6

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    move v5, v6

    .line 93
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_7
    const/16 p1, 0x5d

    .line 97
    .line 98
    aput-char p1, v4, v5

    .line 99
    .line 100
    add-int/2addr v5, v2

    .line 101
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 102
    .line 103
    return-void
.end method

.method public writeHex([B)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    mul-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    add-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 21
    .line 22
    const/16 v2, 0x78

    .line 23
    .line 24
    aput-char v2, v0, v1

    .line 25
    .line 26
    add-int/lit8 v2, v1, 0x1

    .line 27
    .line 28
    const/16 v3, 0x27

    .line 29
    .line 30
    aput-char v3, v0, v2

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    array-length v4, p1

    .line 36
    if-ge v2, v4, :cond_3

    .line 37
    .line 38
    aget-byte v4, p1, v2

    .line 39
    .line 40
    and-int/lit16 v5, v4, 0xff

    .line 41
    .line 42
    shr-int/lit8 v5, v5, 0x4

    .line 43
    .line 44
    and-int/lit8 v4, v4, 0xf

    .line 45
    .line 46
    const/16 v6, 0x37

    .line 47
    .line 48
    const/16 v7, 0x30

    .line 49
    .line 50
    const/16 v8, 0xa

    .line 51
    .line 52
    if-ge v5, v8, :cond_1

    .line 53
    .line 54
    move v9, v7

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v9, v6

    .line 57
    :goto_1
    add-int/2addr v5, v9

    .line 58
    int-to-char v5, v5

    .line 59
    aput-char v5, v0, v1

    .line 60
    .line 61
    add-int/lit8 v5, v1, 0x1

    .line 62
    .line 63
    if-ge v4, v8, :cond_2

    .line 64
    .line 65
    move v6, v7

    .line 66
    :cond_2
    add-int/2addr v4, v6

    .line 67
    int-to-char v4, v4

    .line 68
    aput-char v4, v0, v5

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x2

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    aput-char v3, v0, v1

    .line 76
    .line 77
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 80
    .line 81
    return-void
.end method

.method public writeInt16(S)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x7

    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 24
    .line 25
    array-length v3, v3

    .line 26
    if-lt v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    add-int/lit8 v3, v1, 0x1

    .line 36
    .line 37
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 38
    .line 39
    aput-char v4, v2, v1

    .line 40
    .line 41
    move v1, v3

    .line 42
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 51
    .line 52
    aput-char v1, v2, p1

    .line 53
    .line 54
    move p1, v0

    .line 55
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 56
    .line 57
    return-void
.end method

.method public writeInt32(I)V
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 102
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0xd

    .line 103
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v3, v3

    if-lt v2, v3, :cond_1

    .line 104
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 105
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    if-eqz v0, :cond_2

    add-int/lit8 v3, v1, 0x1

    .line 106
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v4, v2, v1

    move v1, v3

    .line 107
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    move-result p1

    if-eqz v0, :cond_3

    add-int/lit8 v0, p1, 0x1

    .line 108
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v1, v2, p1

    move p1, v0

    .line 109
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeInt32([I)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/16 v5, 0xd

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    invoke-static {v4, v5, v3, v6}, Lp/a;->g(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 38
    .line 39
    array-length v5, v5

    .line 40
    if-lt v4, v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 46
    .line 47
    add-int/lit8 v5, v3, 0x1

    .line 48
    .line 49
    const/16 v6, 0x5b

    .line 50
    .line 51
    aput-char v6, v4, v3

    .line 52
    .line 53
    :goto_1
    array-length v3, p1

    .line 54
    if-ge v1, v3, :cond_6

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    add-int/lit8 v3, v5, 0x1

    .line 59
    .line 60
    const/16 v6, 0x2c

    .line 61
    .line 62
    aput-char v6, v4, v5

    .line 63
    .line 64
    move v5, v3

    .line 65
    :cond_3
    if-eqz v0, :cond_4

    .line 66
    .line 67
    add-int/lit8 v3, v5, 0x1

    .line 68
    .line 69
    iget-char v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 70
    .line 71
    aput-char v6, v4, v5

    .line 72
    .line 73
    move v5, v3

    .line 74
    :cond_4
    aget v3, p1, v1

    .line 75
    .line 76
    invoke-static {v4, v5, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    add-int/lit8 v5, v3, 0x1

    .line 83
    .line 84
    iget-char v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 85
    .line 86
    aput-char v6, v4, v3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    move v5, v3

    .line 90
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    const/16 p1, 0x5d

    .line 94
    .line 95
    aput-char p1, v4, v5

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 99
    .line 100
    return-void
.end method

.method public writeInt64(J)V
    .locals 9

    .line 142
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 143
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v2, v4

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const-wide v2, 0x1fffffffffffffL

    cmp-long v2, p1, v2

    if-gtz v2, :cond_1

    const-wide v2, -0x1fffffffffffffL

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 144
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v6, v3, 0x17

    .line 145
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v7, v7

    if-lt v6, v7, :cond_2

    .line 146
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 147
    :cond_2
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    if-eqz v2, :cond_3

    add-int/lit8 v7, v3, 0x1

    .line 148
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v8, v6, v3

    move v3, v7

    .line 149
    :cond_3
    invoke-static {v6, v3, p1, p2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([CIJ)I

    move-result v3

    if-eqz v2, :cond_4

    add-int/lit8 p1, v3, 0x1

    .line 150
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char p2, v6, v3

    :goto_2
    move v3, p1

    goto :goto_3

    .line 151
    :cond_4
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v7, v0

    cmp-long v2, v7, v4

    if-eqz v2, :cond_5

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteNumberClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v7

    cmp-long v0, v0, v4

    if-nez v0, :cond_5

    const-wide/32 v0, -0x80000000

    cmp-long v0, p1, v0

    if-ltz v0, :cond_5

    const-wide/32 v0, 0x7fffffff

    cmp-long p1, p1, v0

    if-gtz p1, :cond_5

    add-int/lit8 p1, v3, 0x1

    const/16 p2, 0x4c

    .line 152
    aput-char p2, v6, v3

    goto :goto_2

    .line 153
    :cond_5
    :goto_3
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeInt64([J)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v2, v0

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move v2, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v2, v3

    .line 27
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 32
    .line 33
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 34
    .line 35
    or-long/2addr v7, v9

    .line 36
    and-long/2addr v0, v7

    .line 37
    cmp-long v0, v0, v4

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    move v0, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v0, v3

    .line 44
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 45
    .line 46
    add-int/lit8 v4, v1, 0x2

    .line 47
    .line 48
    array-length v5, p1

    .line 49
    mul-int/lit8 v5, v5, 0x17

    .line 50
    .line 51
    add-int/2addr v5, v4

    .line 52
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 53
    .line 54
    array-length v4, v4

    .line 55
    if-lt v5, v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 61
    .line 62
    add-int/lit8 v5, v1, 0x1

    .line 63
    .line 64
    const/16 v7, 0x5b

    .line 65
    .line 66
    aput-char v7, v4, v1

    .line 67
    .line 68
    move v1, v3

    .line 69
    :goto_2
    array-length v7, p1

    .line 70
    if-ge v1, v7, :cond_9

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    add-int/lit8 v7, v5, 0x1

    .line 75
    .line 76
    const/16 v8, 0x2c

    .line 77
    .line 78
    aput-char v8, v4, v5

    .line 79
    .line 80
    move v5, v7

    .line 81
    :cond_4
    aget-wide v7, p1, v1

    .line 82
    .line 83
    if-nez v0, :cond_6

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    const-wide v9, 0x1fffffffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long v9, v7, v9

    .line 93
    .line 94
    if-gtz v9, :cond_5

    .line 95
    .line 96
    const-wide v9, -0x1fffffffffffffL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    cmp-long v9, v7, v9

    .line 102
    .line 103
    if-ltz v9, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move v9, v3

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    :goto_3
    move v9, v6

    .line 109
    :goto_4
    if-eqz v9, :cond_7

    .line 110
    .line 111
    add-int/lit8 v10, v5, 0x1

    .line 112
    .line 113
    iget-char v11, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 114
    .line 115
    aput-char v11, v4, v5

    .line 116
    .line 117
    move v5, v10

    .line 118
    :cond_7
    invoke-static {v4, v5, v7, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([CIJ)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v9, :cond_8

    .line 123
    .line 124
    add-int/lit8 v7, v5, 0x1

    .line 125
    .line 126
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 127
    .line 128
    aput-char v8, v4, v5

    .line 129
    .line 130
    move v5, v7

    .line 131
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_9
    const/16 p1, 0x5d

    .line 135
    .line 136
    aput-char p1, v4, v5

    .line 137
    .line 138
    add-int/2addr v5, v6

    .line 139
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 140
    .line 141
    return-void
.end method

.method public writeInt8(B)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x7

    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 24
    .line 25
    array-length v3, v3

    .line 26
    if-lt v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    add-int/lit8 v3, v1, 0x1

    .line 36
    .line 37
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 38
    .line 39
    aput-char v4, v2, v1

    .line 40
    .line 41
    move v1, v3

    .line 42
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 51
    .line 52
    aput-char v1, v2, p1

    .line 53
    .line 54
    move p1, v0

    .line 55
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 56
    .line 57
    return-void
.end method

.method public writeLocalDate(Ljava/time/LocalDate;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormat:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDateWithFormat(Ljava/time/LocalDate;Lcom/alibaba/fastjson2/JSONWriter$Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 21
    .line 22
    add-int/lit8 v1, v0, 0x12

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 25
    .line 26
    array-length v2, v2

    .line 27
    if-lt v1, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 33
    .line 34
    add-int/lit8 v2, v0, 0x1

    .line 35
    .line 36
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 37
    .line 38
    aput-char v3, v1, v0

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {v1, v2, v0, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 57
    .line 58
    aput-char v0, v1, p1

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 63
    .line 64
    return-void
.end method

.method public writeLocalDateTime(Ljava/time/LocalDateTime;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x26

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    aput-char v3, v1, v0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v1, v2, v3, v4, v0}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/lit8 v2, v0, 0x1

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    aput-char v3, v1, v0

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CILjava/time/LocalTime;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 56
    .line 57
    aput-char v0, v1, p1

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 62
    .line 63
    return-void
.end method

.method public final writeLocalTime(Ljava/time/LocalTime;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x14

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    aput-char v3, v1, v0

    .line 20
    .line 21
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CILjava/time/LocalTime;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 26
    .line 27
    aput-char v0, v1, p1

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 32
    .line 33
    return-void
.end method

.method public writeName10Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x12

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0xd

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 57
    .line 58
    return-void
.end method

.method public writeName11Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x12

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0xe

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 57
    .line 58
    return-void
.end method

.method public writeName12Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x12

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0xf

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 57
    .line 58
    return-void
.end method

.method public writeName13Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x12

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0x10

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 57
    .line 58
    return-void
.end method

.method public writeName14Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x13

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0x10

    .line 55
    .line 56
    const/16 p1, 0x3a

    .line 57
    .line 58
    aput-char p1, v2, v3

    .line 59
    .line 60
    add-int/lit8 v3, v0, 0x11

    .line 61
    .line 62
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 63
    .line 64
    return-void
.end method

.method public writeName15Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x14

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    :goto_0
    move-wide v4, p1

    .line 29
    move-wide v6, p3

    .line 30
    move v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-wide v4, p1

    .line 48
    move-wide v6, p3

    .line 49
    move v3, v1

    .line 50
    :goto_1
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 51
    .line 52
    .line 53
    move v0, v3

    .line 54
    add-int/lit8 v3, v0, 0x10

    .line 55
    .line 56
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 57
    .line 58
    aput-char p1, v2, v3

    .line 59
    .line 60
    add-int/lit8 v3, v0, 0x11

    .line 61
    .line 62
    const/16 p1, 0x3a

    .line 63
    .line 64
    aput-char p1, v2, v3

    .line 65
    .line 66
    add-int/lit8 v3, v0, 0x12

    .line 67
    .line 68
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 69
    .line 70
    return-void
.end method

.method public writeName16Raw(JJ)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x15

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 30
    .line 31
    const/16 v3, 0x2c

    .line 32
    .line 33
    aput-char v3, v2, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move v0, v1

    .line 45
    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 46
    .line 47
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 48
    .line 49
    aput-char v1, v2, v0

    .line 50
    .line 51
    move-wide v4, p1

    .line 52
    move-wide v6, p3

    .line 53
    invoke-static/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJJ)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 p1, v0, 0x11

    .line 57
    .line 58
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 59
    .line 60
    aput-char p2, v2, p1

    .line 61
    .line 62
    add-int/lit8 p1, v0, 0x12

    .line 63
    .line 64
    const/16 p2, 0x3a

    .line 65
    .line 66
    aput-char p2, v2, p1

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x13

    .line 69
    .line 70
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 71
    .line 72
    return-void
.end method

.method public writeName2Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x5

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public final writeName3Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x6

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public writeName4Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x7

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public writeName5Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x8

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public writeName6Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xb

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 p1, v0, 0x8

    .line 48
    .line 49
    const/16 p2, 0x3a

    .line 50
    .line 51
    aput-char p2, v1, p1

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x9

    .line 54
    .line 55
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 56
    .line 57
    return-void
.end method

.method public writeName7Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xc

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 p1, v0, 0x8

    .line 48
    .line 49
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 50
    .line 51
    aput-char p2, v1, p1

    .line 52
    .line 53
    add-int/lit8 p1, v0, 0x9

    .line 54
    .line 55
    const/16 p2, 0x3a

    .line 56
    .line 57
    aput-char p2, v1, p1

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0xa

    .line 60
    .line 61
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 62
    .line 63
    return-void
.end method

.method public writeName8Raw(J)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    add-int/lit8 v2, v0, 0x1

    .line 45
    .line 46
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 47
    .line 48
    aput-char v3, v1, v0

    .line 49
    .line 50
    invoke-static {v1, v2, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJ)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 p1, v0, 0x9

    .line 54
    .line 55
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 56
    .line 57
    aput-char p2, v1, p1

    .line 58
    .line 59
    add-int/lit8 p1, v0, 0xa

    .line 60
    .line 61
    const/16 p2, 0x3a

    .line 62
    .line 63
    aput-char p2, v1, p1

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0xb

    .line 66
    .line 67
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    return-void
.end method

.method public writeName9Raw(JI)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xe

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    add-int/2addr v2, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    aput-char v3, v1, v0

    .line 33
    .line 34
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    :goto_0
    invoke-static {v1, v0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->putLong([CIJI)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0xc

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 50
    .line 51
    return-void
.end method

.method public writeNameRaw([B)V
    .locals 1

    .line 65
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "UnsupportedOperation"

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeNameRaw([C)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v1, v0

    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 8
    .line 9
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 10
    .line 11
    mul-int/2addr v2, v3

    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    array-length v3, v1

    .line 16
    if-le v2, v3, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    const/16 v4, 0x2c

    .line 33
    .line 34
    aput-char v4, v1, v0

    .line 35
    .line 36
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->indent([CI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move v0, v2

    .line 46
    :goto_0
    array-length v2, p1

    .line 47
    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    array-length p1, p1

    .line 51
    add-int/2addr v0, p1

    .line 52
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 53
    .line 54
    return-void
.end method

.method public writeNameRaw([CII)V
    .locals 4

    .line 55
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int v1, v0, p3

    add-int/lit8 v1, v1, 0x2

    .line 56
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    mul-int/2addr v2, v3

    add-int/2addr v2, v1

    .line 57
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 58
    array-length v3, v1

    if-le v2, v3, :cond_0

    .line 59
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    move-result-object v1

    .line 60
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    .line 61
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v0, 0x1

    const/16 v3, 0x2c

    .line 62
    aput-char v3, v1, v0

    move v0, v2

    .line 63
    :goto_0
    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v0, p3

    .line 64
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public final writeOffsetDateTime(Ljava/time/OffsetDateTime;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x2d

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 16
    .line 17
    array-length v3, v3

    .line 18
    if-lt v2, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 24
    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 28
    .line 29
    aput-char v4, v2, v1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/time/LocalDate;->getYear()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v2, v3, v4, v5, v1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/lit8 v3, v1, 0x1

    .line 56
    .line 57
    const/16 v4, 0x54

    .line 58
    .line 59
    aput-char v4, v2, v1

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v2, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CILjava/time/LocalTime;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_2

    .line 74
    .line 75
    add-int/lit8 v0, p1, 0x1

    .line 76
    .line 77
    const/16 v1, 0x5a

    .line 78
    .line 79
    aput-char v1, v2, p1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-virtual {v0, v1, v3, v2, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/2addr v0, p1

    .line 99
    :goto_0
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 100
    .line 101
    aput-char p1, v2, v0

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 106
    .line 107
    return-void
.end method

.method public final writeOffsetTime(Ljava/time/OffsetTime;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getOffset()Ljava/time/ZoneOffset;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x19

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 16
    .line 17
    array-length v3, v3

    .line 18
    if-lt v2, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 24
    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 28
    .line 29
    aput-char v4, v2, v1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/time/OffsetTime;->toLocalTime()Ljava/time/LocalTime;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v2, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CILjava/time/LocalTime;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    add-int/lit8 v0, p1, 0x1

    .line 46
    .line 47
    const/16 v1, 0x5a

    .line 48
    .line 49
    aput-char v1, v2, p1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v0, v1, v3, v2, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, p1

    .line 69
    :goto_0
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 70
    .line 71
    aput-char p1, v2, v0

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 76
    .line 77
    return-void
.end method

.method public writeRaw(C)V
    .locals 3

    .line 38
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v1, v1

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 39
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    aput-char p1, v0, v1

    return-void
.end method

.method public writeRaw(CC)V
    .locals 3

    .line 41
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    .line 42
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v2, v2

    if-lt v1, v2, :cond_0

    add-int/lit8 v2, v0, 0x2

    .line 43
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 44
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    aput-char p1, v2, v0

    .line 45
    aput-char p2, v2, v1

    add-int/lit8 v0, v0, 0x2

    .line 46
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeRaw(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 16
    .line 17
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p1, v3, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    add-int/2addr p1, v0

    .line 30
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 31
    .line 32
    return-void
.end method

.method public writeRaw([B)V
    .locals 1

    .line 47
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "UnsupportedOperation"

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeRaw([CII)V
    .locals 2

    .line 33
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr v0, p3

    .line 34
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 35
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeReference(Ljava/lang/String;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->lastReference:Ljava/lang/String;

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    add-int/lit8 v2, v0, 0x9

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    const/16 v2, 0x7b

    .line 17
    .line 18
    aput-char v2, v1, v0

    .line 19
    .line 20
    add-int/lit8 v2, v0, 0x1

    .line 21
    .line 22
    const/16 v3, 0x22

    .line 23
    .line 24
    aput-char v3, v1, v2

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    const/16 v4, 0x24

    .line 29
    .line 30
    aput-char v4, v1, v2

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x3

    .line 33
    .line 34
    const/16 v4, 0x72

    .line 35
    .line 36
    aput-char v4, v1, v2

    .line 37
    .line 38
    add-int/lit8 v2, v0, 0x4

    .line 39
    .line 40
    const/16 v4, 0x65

    .line 41
    .line 42
    aput-char v4, v1, v2

    .line 43
    .line 44
    add-int/lit8 v2, v0, 0x5

    .line 45
    .line 46
    const/16 v4, 0x66

    .line 47
    .line 48
    aput-char v4, v1, v2

    .line 49
    .line 50
    add-int/lit8 v2, v0, 0x6

    .line 51
    .line 52
    aput-char v3, v1, v2

    .line 53
    .line 54
    add-int/lit8 v2, v0, 0x7

    .line 55
    .line 56
    const/16 v3, 0x3a

    .line 57
    .line 58
    aput-char v3, v1, v2

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x8

    .line 61
    .line 62
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 70
    .line 71
    array-length v1, v0

    .line 72
    if-ne p1, v1, :cond_1

    .line 73
    .line 74
    add-int/lit8 v0, p1, 0x1

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->grow(I)[C

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_1
    const/16 v1, 0x7d

    .line 81
    .line 82
    aput-char v1, v0, p1

    .line 83
    .line 84
    add-int/lit8 p1, p1, 0x1

    .line 85
    .line 86
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 87
    .line 88
    return-void
.end method

.method public final writeString(B)V
    .locals 4

    .line 358
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 359
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    .line 360
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeInt8(B)V

    if-eqz v0, :cond_2

    .line 361
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    :cond_2
    return-void
.end method

.method public final writeString(I)V
    .locals 4

    .line 366
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 367
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    .line 368
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeInt32(I)V

    if-eqz v0, :cond_2

    .line 369
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    :cond_2
    return-void
.end method

.method public final writeString(J)V
    .locals 4

    .line 370
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 371
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    .line 372
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeInt64(J)V

    if-eqz v0, :cond_2

    .line 373
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 9

    if-nez p1, :cond_0

    .line 339
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_1

    move v2, v6

    goto :goto_0

    :cond_1
    move v2, v3

    .line 341
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v7

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    move v0, v6

    goto :goto_1

    :cond_2
    move v0, v3

    .line 342
    :goto_1
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 343
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 344
    iget v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, 0x2

    .line 345
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v7, v7

    if-lt v5, v7, :cond_3

    .line 346
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    :cond_3
    move v5, v3

    :goto_2
    if-ge v5, v4, :cond_7

    .line 347
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x5c

    if-eq v7, v8, :cond_6

    if-eq v7, v1, :cond_6

    const/16 v8, 0x20

    if-lt v7, v8, :cond_6

    if-eqz v0, :cond_4

    const/16 v8, 0x3c

    if-eq v7, v8, :cond_6

    const/16 v8, 0x3e

    if-eq v7, v8, :cond_6

    const/16 v8, 0x28

    if-eq v7, v8, :cond_6

    const/16 v8, 0x29

    if-eq v7, v8, :cond_6

    :cond_4
    if-eqz v2, :cond_5

    const/16 v8, 0x7f

    if-le v7, v8, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 348
    :cond_6
    :goto_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeStringEscape(Ljava/lang/String;)V

    return-void

    .line 349
    :cond_7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 350
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    add-int/lit8 v5, v0, 0x1

    .line 351
    aput-char v1, v2, v0

    .line 352
    invoke-virtual {p1, v3, v4, v2, v5}, Ljava/lang/String;->getChars(II[CI)V

    add-int/2addr v5, v4

    .line 353
    aput-char v1, v2, v5

    add-int/2addr v5, v6

    .line 354
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeString(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 374
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    if-eqz v0, :cond_0

    .line 375
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/util/List;)V

    return-void

    .line 376
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v1, v1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 377
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v2, 0x5b

    aput-char v2, v0, v1

    .line 379
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    if-eqz v1, :cond_3

    .line 380
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v3, v3

    if-ne v2, v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    .line 381
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 382
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v4, 0x2c

    aput-char v4, v2, v3

    .line 383
    :cond_3
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 384
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 385
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v0, v0

    if-ne p1, v0, :cond_5

    add-int/lit8 p1, p1, 0x1

    .line 386
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 387
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v1, 0x5d

    aput-char v1, p1, v0

    return-void
.end method

.method public final writeString(S)V
    .locals 4

    .line 362
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 363
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    .line 364
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeInt16(S)V

    if-eqz v0, :cond_2

    .line 365
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(Z)V
    .locals 3

    .line 355
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v2, v0, v1

    .line 356
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 357
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v1, p1, v0

    return-void
.end method

.method public writeString([C)V
    .locals 9

    if-nez p1, :cond_0

    .line 398
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_1

    move v2, v6

    goto :goto_0

    :cond_1
    move v2, v3

    .line 400
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v7

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    move v0, v6

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    move v1, v3

    .line 401
    :goto_2
    array-length v4, p1

    if-ge v1, v4, :cond_5

    .line 402
    aget-char v4, p1, v1

    const/16 v5, 0x5c

    if-eq v4, v5, :cond_6

    .line 403
    iget-char v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    if-eq v4, v5, :cond_6

    const/16 v5, 0x20

    if-ge v4, v5, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v2, :cond_4

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_6

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_6

    const/16 v5, 0x28

    if-eq v4, v5, :cond_6

    const/16 v5, 0x29

    if-ne v4, v5, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    move v6, v0

    :cond_6
    :goto_3
    if-nez v6, :cond_8

    .line 404
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    array-length v1, p1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x2

    .line 405
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v1, v1

    if-le v0, v1, :cond_7

    .line 406
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 407
    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v4, v0, v1

    .line 408
    array-length v1, p1

    invoke-static {p1, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 409
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    array-length p1, p1

    add-int/2addr v0, p1

    .line 410
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v1, p1, v0

    return-void

    .line 411
    :cond_8
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeStringEscape([C)V

    return-void
.end method

.method public writeString([CII)V
    .locals 5

    if-nez p1, :cond_0

    .line 412
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move v2, p2

    :goto_1
    if-ge v2, p3, :cond_3

    .line 414
    aget-char v3, p1, v2

    const/16 v4, 0x5c

    if-eq v3, v4, :cond_4

    .line 415
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    if-eq v3, v4, :cond_4

    const/16 v4, 0x20

    if-ge v3, v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v1, v0

    :cond_4
    :goto_2
    if-nez v1, :cond_6

    .line 416
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x2

    .line 417
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    array-length v1, v1

    if-lt v0, v1, :cond_5

    .line 418
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 419
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char v3, v0, v1

    .line 420
    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 421
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr p1, p3

    .line 422
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    add-int/lit8 p3, p1, 0x1

    iput p3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char p3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    aput-char p3, p2, p1

    return-void

    .line 423
    :cond_6
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeStringEscape(Ljava/lang/String;)V

    return-void
.end method

.method public writeString([CIIZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 20
    .line 21
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 22
    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, v2, 0x2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_1
    if-eqz v0, :cond_2

    .line 30
    .line 31
    mul-int/lit8 v4, p3, 0x6

    .line 32
    .line 33
    :goto_2
    add-int/2addr v4, v3

    .line 34
    goto :goto_3

    .line 35
    :cond_2
    mul-int/lit8 v4, p3, 0x2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :goto_3
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 39
    .line 40
    array-length v3, v3

    .line 41
    sub-int v3, v4, v3

    .line 42
    .line 43
    if-lez v3, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 49
    .line 50
    if-eqz p4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, v2, 0x1

    .line 53
    .line 54
    aput-char v1, v3, v2

    .line 55
    .line 56
    move v2, v4

    .line 57
    :cond_4
    add-int/2addr p3, p2

    .line 58
    array-length v4, p1

    .line 59
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    :goto_4
    if-ge p2, p3, :cond_9

    .line 64
    .line 65
    aget-char v4, p1, p2

    .line 66
    .line 67
    const/16 v5, 0x22

    .line 68
    .line 69
    const/16 v6, 0x5c

    .line 70
    .line 71
    if-eq v4, v5, :cond_7

    .line 72
    .line 73
    const/16 v5, 0x27

    .line 74
    .line 75
    if-eq v4, v5, :cond_7

    .line 76
    .line 77
    if-eq v4, v6, :cond_6

    .line 78
    .line 79
    const/16 v5, 0x31

    .line 80
    .line 81
    const/16 v7, 0x75

    .line 82
    .line 83
    const/16 v8, 0x30

    .line 84
    .line 85
    packed-switch v4, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    const/16 v5, 0x7f

    .line 91
    .line 92
    if-le v4, v5, :cond_5

    .line 93
    .line 94
    aput-char v6, v3, v2

    .line 95
    .line 96
    add-int/lit8 v5, v2, 0x1

    .line 97
    .line 98
    aput-char v7, v3, v5

    .line 99
    .line 100
    add-int/lit8 v5, v2, 0x2

    .line 101
    .line 102
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 103
    .line 104
    ushr-int/lit8 v7, v4, 0xc

    .line 105
    .line 106
    and-int/lit8 v7, v7, 0xf

    .line 107
    .line 108
    aget-char v7, v6, v7

    .line 109
    .line 110
    aput-char v7, v3, v5

    .line 111
    .line 112
    add-int/lit8 v5, v2, 0x3

    .line 113
    .line 114
    ushr-int/lit8 v7, v4, 0x8

    .line 115
    .line 116
    and-int/lit8 v7, v7, 0xf

    .line 117
    .line 118
    aget-char v7, v6, v7

    .line 119
    .line 120
    aput-char v7, v3, v5

    .line 121
    .line 122
    add-int/lit8 v5, v2, 0x4

    .line 123
    .line 124
    ushr-int/lit8 v7, v4, 0x4

    .line 125
    .line 126
    and-int/lit8 v7, v7, 0xf

    .line 127
    .line 128
    aget-char v7, v6, v7

    .line 129
    .line 130
    aput-char v7, v3, v5

    .line 131
    .line 132
    add-int/lit8 v5, v2, 0x5

    .line 133
    .line 134
    and-int/lit8 v4, v4, 0xf

    .line 135
    .line 136
    aget-char v4, v6, v4

    .line 137
    .line 138
    aput-char v4, v3, v5

    .line 139
    .line 140
    :goto_5
    add-int/lit8 v2, v2, 0x6

    .line 141
    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_5
    add-int/lit8 v5, v2, 0x1

    .line 145
    .line 146
    aput-char v4, v3, v2

    .line 147
    .line 148
    :goto_6
    move v2, v5

    .line 149
    goto/16 :goto_8

    .line 150
    .line 151
    :pswitch_0
    aput-char v6, v3, v2

    .line 152
    .line 153
    add-int/lit8 v6, v2, 0x1

    .line 154
    .line 155
    aput-char v7, v3, v6

    .line 156
    .line 157
    add-int/lit8 v6, v2, 0x2

    .line 158
    .line 159
    aput-char v8, v3, v6

    .line 160
    .line 161
    add-int/lit8 v6, v2, 0x3

    .line 162
    .line 163
    aput-char v8, v3, v6

    .line 164
    .line 165
    add-int/lit8 v6, v2, 0x4

    .line 166
    .line 167
    aput-char v5, v3, v6

    .line 168
    .line 169
    add-int/lit8 v5, v2, 0x5

    .line 170
    .line 171
    add-int/lit8 v4, v4, 0x47

    .line 172
    .line 173
    int-to-char v4, v4

    .line 174
    aput-char v4, v3, v5

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :pswitch_1
    aput-char v6, v3, v2

    .line 178
    .line 179
    add-int/lit8 v6, v2, 0x1

    .line 180
    .line 181
    aput-char v7, v3, v6

    .line 182
    .line 183
    add-int/lit8 v6, v2, 0x2

    .line 184
    .line 185
    aput-char v8, v3, v6

    .line 186
    .line 187
    add-int/lit8 v6, v2, 0x3

    .line 188
    .line 189
    aput-char v8, v3, v6

    .line 190
    .line 191
    add-int/lit8 v6, v2, 0x4

    .line 192
    .line 193
    aput-char v5, v3, v6

    .line 194
    .line 195
    add-int/lit8 v5, v2, 0x5

    .line 196
    .line 197
    add-int/lit8 v4, v4, 0x20

    .line 198
    .line 199
    int-to-char v4, v4

    .line 200
    aput-char v4, v3, v5

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :pswitch_2
    aput-char v6, v3, v2

    .line 204
    .line 205
    add-int/lit8 v4, v2, 0x1

    .line 206
    .line 207
    const/16 v5, 0x72

    .line 208
    .line 209
    aput-char v5, v3, v4

    .line 210
    .line 211
    :goto_7
    add-int/lit8 v2, v2, 0x2

    .line 212
    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :pswitch_3
    aput-char v6, v3, v2

    .line 216
    .line 217
    add-int/lit8 v4, v2, 0x1

    .line 218
    .line 219
    const/16 v5, 0x66

    .line 220
    .line 221
    aput-char v5, v3, v4

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :pswitch_4
    aput-char v6, v3, v2

    .line 225
    .line 226
    add-int/lit8 v5, v2, 0x1

    .line 227
    .line 228
    aput-char v7, v3, v5

    .line 229
    .line 230
    add-int/lit8 v5, v2, 0x2

    .line 231
    .line 232
    aput-char v8, v3, v5

    .line 233
    .line 234
    add-int/lit8 v5, v2, 0x3

    .line 235
    .line 236
    aput-char v8, v3, v5

    .line 237
    .line 238
    add-int/lit8 v5, v2, 0x4

    .line 239
    .line 240
    aput-char v8, v3, v5

    .line 241
    .line 242
    add-int/lit8 v5, v2, 0x5

    .line 243
    .line 244
    add-int/lit8 v4, v4, 0x57

    .line 245
    .line 246
    int-to-char v4, v4

    .line 247
    aput-char v4, v3, v5

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :pswitch_5
    aput-char v6, v3, v2

    .line 251
    .line 252
    add-int/lit8 v4, v2, 0x1

    .line 253
    .line 254
    const/16 v5, 0x6e

    .line 255
    .line 256
    aput-char v5, v3, v4

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :pswitch_6
    aput-char v6, v3, v2

    .line 260
    .line 261
    add-int/lit8 v4, v2, 0x1

    .line 262
    .line 263
    const/16 v5, 0x74

    .line 264
    .line 265
    aput-char v5, v3, v4

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :pswitch_7
    aput-char v6, v3, v2

    .line 269
    .line 270
    add-int/lit8 v4, v2, 0x1

    .line 271
    .line 272
    const/16 v5, 0x62

    .line 273
    .line 274
    aput-char v5, v3, v4

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :pswitch_8
    aput-char v6, v3, v2

    .line 278
    .line 279
    add-int/lit8 v5, v2, 0x1

    .line 280
    .line 281
    aput-char v7, v3, v5

    .line 282
    .line 283
    add-int/lit8 v5, v2, 0x2

    .line 284
    .line 285
    aput-char v8, v3, v5

    .line 286
    .line 287
    add-int/lit8 v5, v2, 0x3

    .line 288
    .line 289
    aput-char v8, v3, v5

    .line 290
    .line 291
    add-int/lit8 v5, v2, 0x4

    .line 292
    .line 293
    aput-char v8, v3, v5

    .line 294
    .line 295
    add-int/lit8 v5, v2, 0x5

    .line 296
    .line 297
    add-int/lit8 v4, v4, 0x30

    .line 298
    .line 299
    int-to-char v4, v4

    .line 300
    aput-char v4, v3, v5

    .line 301
    .line 302
    goto/16 :goto_5

    .line 303
    .line 304
    :cond_6
    aput-char v6, v3, v2

    .line 305
    .line 306
    add-int/lit8 v5, v2, 0x1

    .line 307
    .line 308
    aput-char v4, v3, v5

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_7
    if-ne v4, v1, :cond_8

    .line 312
    .line 313
    add-int/lit8 v5, v2, 0x1

    .line 314
    .line 315
    aput-char v6, v3, v2

    .line 316
    .line 317
    move v2, v5

    .line 318
    :cond_8
    add-int/lit8 v5, v2, 0x1

    .line 319
    .line 320
    aput-char v4, v3, v2

    .line 321
    .line 322
    goto/16 :goto_6

    .line 323
    .line 324
    :goto_8
    add-int/lit8 p2, p2, 0x1

    .line 325
    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :cond_9
    if-eqz p4, :cond_a

    .line 329
    .line 330
    add-int/lit8 p1, v2, 0x1

    .line 331
    .line 332
    aput-char v1, v3, v2

    .line 333
    .line 334
    move v2, p1

    .line 335
    :cond_a
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 336
    .line 337
    return-void

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public writeString([Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    .line 388
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    return-void

    .line 389
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->startArray()V

    const/4 v0, 0x0

    .line 390
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    if-eqz v0, :cond_1

    .line 391
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeComma()V

    .line 392
    :cond_1
    aget-object v1, p1, v0

    if-nez v1, :cond_3

    .line 393
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v1, v3

    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->isEnabled(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 394
    const-string v1, ""

    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 395
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    .line 396
    :cond_3
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeString(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 397
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->endArray()V

    return-void
.end method

.method public final writeStringEscape(Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v4, v2

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v8, 0x1

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    move v4, v8

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, v5

    .line 27
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    and-long/2addr v2, v9

    .line 32
    cmp-long v2, v2, v6

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    move v2, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v2, v5

    .line 39
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 40
    .line 41
    const/4 v6, 0x6

    .line 42
    const/4 v7, 0x2

    .line 43
    invoke-static {v0, v6, v3, v7}, Lp/a;->g(IIII)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 48
    .line 49
    .line 50
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 51
    .line 52
    add-int/lit8 v7, v3, 0x1

    .line 53
    .line 54
    aput-char v1, v6, v3

    .line 55
    .line 56
    :goto_2
    if-ge v5, v0, :cond_8

    .line 57
    .line 58
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/16 v9, 0x22

    .line 63
    .line 64
    const/16 v10, 0x5c

    .line 65
    .line 66
    if-eq v3, v9, :cond_6

    .line 67
    .line 68
    const/16 v9, 0x3c

    .line 69
    .line 70
    const/16 v11, 0x75

    .line 71
    .line 72
    const/16 v12, 0x30

    .line 73
    .line 74
    if-eq v3, v9, :cond_4

    .line 75
    .line 76
    const/16 v9, 0x3e

    .line 77
    .line 78
    if-eq v3, v9, :cond_4

    .line 79
    .line 80
    if-eq v3, v10, :cond_3

    .line 81
    .line 82
    const/16 v9, 0x31

    .line 83
    .line 84
    packed-switch v3, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    packed-switch v3, :pswitch_data_1

    .line 88
    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    const/16 v9, 0x7f

    .line 93
    .line 94
    if-le v3, v9, :cond_2

    .line 95
    .line 96
    aput-char v10, v6, v7

    .line 97
    .line 98
    add-int/lit8 v9, v7, 0x1

    .line 99
    .line 100
    aput-char v11, v6, v9

    .line 101
    .line 102
    add-int/lit8 v9, v7, 0x2

    .line 103
    .line 104
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 105
    .line 106
    ushr-int/lit8 v11, v3, 0xc

    .line 107
    .line 108
    and-int/lit8 v11, v11, 0xf

    .line 109
    .line 110
    aget-char v11, v10, v11

    .line 111
    .line 112
    aput-char v11, v6, v9

    .line 113
    .line 114
    add-int/lit8 v9, v7, 0x3

    .line 115
    .line 116
    ushr-int/lit8 v11, v3, 0x8

    .line 117
    .line 118
    and-int/lit8 v11, v11, 0xf

    .line 119
    .line 120
    aget-char v11, v10, v11

    .line 121
    .line 122
    aput-char v11, v6, v9

    .line 123
    .line 124
    add-int/lit8 v9, v7, 0x4

    .line 125
    .line 126
    ushr-int/lit8 v11, v3, 0x4

    .line 127
    .line 128
    and-int/lit8 v11, v11, 0xf

    .line 129
    .line 130
    aget-char v11, v10, v11

    .line 131
    .line 132
    aput-char v11, v6, v9

    .line 133
    .line 134
    add-int/lit8 v9, v7, 0x5

    .line 135
    .line 136
    and-int/lit8 v3, v3, 0xf

    .line 137
    .line 138
    aget-char v3, v10, v3

    .line 139
    .line 140
    aput-char v3, v6, v9

    .line 141
    .line 142
    :goto_3
    add-int/lit8 v7, v7, 0x6

    .line 143
    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_2
    add-int/lit8 v9, v7, 0x1

    .line 147
    .line 148
    aput-char v3, v6, v7

    .line 149
    .line 150
    :goto_4
    move v7, v9

    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :pswitch_0
    aput-char v10, v6, v7

    .line 154
    .line 155
    add-int/lit8 v10, v7, 0x1

    .line 156
    .line 157
    aput-char v11, v6, v10

    .line 158
    .line 159
    add-int/lit8 v10, v7, 0x2

    .line 160
    .line 161
    aput-char v12, v6, v10

    .line 162
    .line 163
    add-int/lit8 v10, v7, 0x3

    .line 164
    .line 165
    aput-char v12, v6, v10

    .line 166
    .line 167
    add-int/lit8 v10, v7, 0x4

    .line 168
    .line 169
    aput-char v9, v6, v10

    .line 170
    .line 171
    add-int/lit8 v9, v7, 0x5

    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x47

    .line 174
    .line 175
    int-to-char v3, v3

    .line 176
    aput-char v3, v6, v9

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_1
    aput-char v10, v6, v7

    .line 180
    .line 181
    add-int/lit8 v10, v7, 0x1

    .line 182
    .line 183
    aput-char v11, v6, v10

    .line 184
    .line 185
    add-int/lit8 v10, v7, 0x2

    .line 186
    .line 187
    aput-char v12, v6, v10

    .line 188
    .line 189
    add-int/lit8 v10, v7, 0x3

    .line 190
    .line 191
    aput-char v12, v6, v10

    .line 192
    .line 193
    add-int/lit8 v10, v7, 0x4

    .line 194
    .line 195
    aput-char v9, v6, v10

    .line 196
    .line 197
    add-int/lit8 v9, v7, 0x5

    .line 198
    .line 199
    add-int/lit8 v3, v3, 0x20

    .line 200
    .line 201
    int-to-char v3, v3

    .line 202
    aput-char v3, v6, v9

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :pswitch_2
    aput-char v10, v6, v7

    .line 206
    .line 207
    add-int/lit8 v3, v7, 0x1

    .line 208
    .line 209
    const/16 v9, 0x72

    .line 210
    .line 211
    aput-char v9, v6, v3

    .line 212
    .line 213
    :goto_5
    add-int/lit8 v7, v7, 0x2

    .line 214
    .line 215
    goto/16 :goto_6

    .line 216
    .line 217
    :pswitch_3
    aput-char v10, v6, v7

    .line 218
    .line 219
    add-int/lit8 v3, v7, 0x1

    .line 220
    .line 221
    const/16 v9, 0x66

    .line 222
    .line 223
    aput-char v9, v6, v3

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :pswitch_4
    aput-char v10, v6, v7

    .line 227
    .line 228
    add-int/lit8 v9, v7, 0x1

    .line 229
    .line 230
    aput-char v11, v6, v9

    .line 231
    .line 232
    add-int/lit8 v9, v7, 0x2

    .line 233
    .line 234
    aput-char v12, v6, v9

    .line 235
    .line 236
    add-int/lit8 v9, v7, 0x3

    .line 237
    .line 238
    aput-char v12, v6, v9

    .line 239
    .line 240
    add-int/lit8 v9, v7, 0x4

    .line 241
    .line 242
    aput-char v12, v6, v9

    .line 243
    .line 244
    add-int/lit8 v9, v7, 0x5

    .line 245
    .line 246
    add-int/lit8 v3, v3, 0x57

    .line 247
    .line 248
    int-to-char v3, v3

    .line 249
    aput-char v3, v6, v9

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :pswitch_5
    aput-char v10, v6, v7

    .line 253
    .line 254
    add-int/lit8 v3, v7, 0x1

    .line 255
    .line 256
    const/16 v9, 0x6e

    .line 257
    .line 258
    aput-char v9, v6, v3

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :pswitch_6
    aput-char v10, v6, v7

    .line 262
    .line 263
    add-int/lit8 v3, v7, 0x1

    .line 264
    .line 265
    const/16 v9, 0x74

    .line 266
    .line 267
    aput-char v9, v6, v3

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :pswitch_7
    aput-char v10, v6, v7

    .line 271
    .line 272
    add-int/lit8 v3, v7, 0x1

    .line 273
    .line 274
    const/16 v9, 0x62

    .line 275
    .line 276
    aput-char v9, v6, v3

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :pswitch_8
    aput-char v10, v6, v7

    .line 280
    .line 281
    add-int/lit8 v9, v7, 0x1

    .line 282
    .line 283
    aput-char v11, v6, v9

    .line 284
    .line 285
    add-int/lit8 v9, v7, 0x2

    .line 286
    .line 287
    aput-char v12, v6, v9

    .line 288
    .line 289
    add-int/lit8 v9, v7, 0x3

    .line 290
    .line 291
    aput-char v12, v6, v9

    .line 292
    .line 293
    add-int/lit8 v9, v7, 0x4

    .line 294
    .line 295
    aput-char v12, v6, v9

    .line 296
    .line 297
    add-int/lit8 v9, v7, 0x5

    .line 298
    .line 299
    add-int/lit8 v3, v3, 0x30

    .line 300
    .line 301
    int-to-char v3, v3

    .line 302
    aput-char v3, v6, v9

    .line 303
    .line 304
    goto/16 :goto_3

    .line 305
    .line 306
    :cond_3
    aput-char v10, v6, v7

    .line 307
    .line 308
    add-int/lit8 v9, v7, 0x1

    .line 309
    .line 310
    aput-char v3, v6, v9

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_4
    :pswitch_9
    if-eqz v2, :cond_5

    .line 314
    .line 315
    aput-char v10, v6, v7

    .line 316
    .line 317
    add-int/lit8 v9, v7, 0x1

    .line 318
    .line 319
    aput-char v11, v6, v9

    .line 320
    .line 321
    add-int/lit8 v9, v7, 0x2

    .line 322
    .line 323
    aput-char v12, v6, v9

    .line 324
    .line 325
    add-int/lit8 v9, v7, 0x3

    .line 326
    .line 327
    aput-char v12, v6, v9

    .line 328
    .line 329
    add-int/lit8 v9, v7, 0x4

    .line 330
    .line 331
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 332
    .line 333
    ushr-int/lit8 v11, v3, 0x4

    .line 334
    .line 335
    and-int/lit8 v11, v11, 0xf

    .line 336
    .line 337
    aget-char v11, v10, v11

    .line 338
    .line 339
    aput-char v11, v6, v9

    .line 340
    .line 341
    add-int/lit8 v9, v7, 0x5

    .line 342
    .line 343
    and-int/lit8 v3, v3, 0xf

    .line 344
    .line 345
    aget-char v3, v10, v3

    .line 346
    .line 347
    aput-char v3, v6, v9

    .line 348
    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :cond_5
    add-int/lit8 v9, v7, 0x1

    .line 352
    .line 353
    aput-char v3, v6, v7

    .line 354
    .line 355
    goto/16 :goto_4

    .line 356
    .line 357
    :cond_6
    :pswitch_a
    if-ne v3, v1, :cond_7

    .line 358
    .line 359
    add-int/lit8 v9, v7, 0x1

    .line 360
    .line 361
    aput-char v10, v6, v7

    .line 362
    .line 363
    move v7, v9

    .line 364
    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 365
    .line 366
    aput-char v3, v6, v7

    .line 367
    .line 368
    goto/16 :goto_4

    .line 369
    .line 370
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 371
    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :cond_8
    aput-char v1, v6, v7

    .line 375
    .line 376
    add-int/2addr v7, v8

    .line 377
    iput v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 378
    .line 379
    return-void

    .line 380
    nop

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method public final writeStringEscape([B)V
    .locals 13

    .line 444
    array-length v0, p1

    .line 445
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 446
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const/4 v5, 0x0

    const/4 v8, 0x1

    if-eqz v4, :cond_0

    move v4, v8

    goto :goto_0

    :cond_0
    move v4, v5

    .line 447
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v9

    cmp-long v2, v2, v6

    if-eqz v2, :cond_1

    move v2, v8

    goto :goto_1

    :cond_1
    move v2, v5

    .line 448
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/4 v6, 0x6

    const/4 v7, 0x2

    invoke-static {v0, v6, v3, v7}, Lp/a;->g(IIII)I

    move-result v6

    .line 449
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 450
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    add-int/lit8 v7, v3, 0x1

    .line 451
    aput-char v1, v6, v3

    :goto_2
    if-ge v5, v0, :cond_8

    .line 452
    aget-byte v3, p1, v5

    and-int/lit16 v3, v3, 0xff

    int-to-char v3, v3

    const/16 v9, 0x22

    const/16 v10, 0x5c

    if-eq v3, v9, :cond_6

    const/16 v9, 0x3c

    const/16 v11, 0x75

    const/16 v12, 0x30

    if-eq v3, v9, :cond_4

    const/16 v9, 0x3e

    if-eq v3, v9, :cond_4

    if-eq v3, v10, :cond_3

    const/16 v9, 0x31

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    if-eqz v4, :cond_2

    const/16 v9, 0x7f

    if-le v3, v9, :cond_2

    .line 453
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 454
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 455
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 456
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 457
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    ushr-int/lit8 v11, v3, 0x4

    and-int/lit8 v11, v11, 0xf

    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x5

    and-int/lit8 v3, v3, 0xf

    .line 458
    aget-char v3, v10, v3

    aput-char v3, v6, v9

    :goto_3
    add-int/lit8 v7, v7, 0x6

    goto/16 :goto_6

    :cond_2
    add-int/lit8 v9, v7, 0x1

    .line 459
    aput-char v3, v6, v7

    :goto_4
    move v7, v9

    goto/16 :goto_6

    .line 460
    :pswitch_0
    aput-char v10, v6, v7

    add-int/lit8 v10, v7, 0x1

    .line 461
    aput-char v11, v6, v10

    add-int/lit8 v10, v7, 0x2

    .line 462
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x3

    .line 463
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x4

    .line 464
    aput-char v9, v6, v10

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x47

    int-to-char v3, v3

    .line 465
    aput-char v3, v6, v9

    goto :goto_3

    .line 466
    :pswitch_1
    aput-char v10, v6, v7

    add-int/lit8 v10, v7, 0x1

    .line 467
    aput-char v11, v6, v10

    add-int/lit8 v10, v7, 0x2

    .line 468
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x3

    .line 469
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x4

    .line 470
    aput-char v9, v6, v10

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x20

    int-to-char v3, v3

    .line 471
    aput-char v3, v6, v9

    goto :goto_3

    .line 472
    :pswitch_2
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x72

    .line 473
    aput-char v9, v6, v3

    :goto_5
    add-int/lit8 v7, v7, 0x2

    goto/16 :goto_6

    .line 474
    :pswitch_3
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x66

    .line 475
    aput-char v9, v6, v3

    goto :goto_5

    .line 476
    :pswitch_4
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 477
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 478
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 479
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 480
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x57

    int-to-char v3, v3

    .line 481
    aput-char v3, v6, v9

    goto :goto_3

    .line 482
    :pswitch_5
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x6e

    .line 483
    aput-char v9, v6, v3

    goto :goto_5

    .line 484
    :pswitch_6
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x74

    .line 485
    aput-char v9, v6, v3

    goto :goto_5

    .line 486
    :pswitch_7
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x62

    .line 487
    aput-char v9, v6, v3

    goto :goto_5

    .line 488
    :pswitch_8
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 489
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 490
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 491
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 492
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    .line 493
    aput-char v3, v6, v9

    goto/16 :goto_3

    .line 494
    :cond_3
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 495
    aput-char v3, v6, v9

    goto :goto_5

    :cond_4
    :pswitch_9
    if-eqz v2, :cond_5

    .line 496
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 497
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 498
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 499
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 500
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    ushr-int/lit8 v11, v3, 0x4

    and-int/lit8 v11, v11, 0xf

    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x5

    and-int/lit8 v3, v3, 0xf

    .line 501
    aget-char v3, v10, v3

    aput-char v3, v6, v9

    goto/16 :goto_3

    :cond_5
    add-int/lit8 v9, v7, 0x1

    .line 502
    aput-char v3, v6, v7

    goto/16 :goto_4

    :cond_6
    :pswitch_a
    if-ne v3, v1, :cond_7

    add-int/lit8 v9, v7, 0x1

    .line 503
    aput-char v10, v6, v7

    move v7, v9

    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 504
    aput-char v3, v6, v7

    goto/16 :goto_4

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 505
    :cond_8
    aput-char v1, v6, v7

    add-int/2addr v7, v8

    .line 506
    iput v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method public final writeStringEscape([C)V
    .locals 13

    .line 381
    array-length v0, p1

    .line 382
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 383
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const/4 v5, 0x0

    const/4 v8, 0x1

    if-eqz v4, :cond_0

    move v4, v8

    goto :goto_0

    :cond_0
    move v4, v5

    .line 384
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v9

    cmp-long v2, v2, v6

    if-eqz v2, :cond_1

    move v2, v8

    goto :goto_1

    :cond_1
    move v2, v5

    .line 385
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/4 v6, 0x6

    const/4 v7, 0x2

    invoke-static {v0, v6, v3, v7}, Lp/a;->g(IIII)I

    move-result v6

    .line 386
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 387
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    add-int/lit8 v7, v3, 0x1

    .line 388
    aput-char v1, v6, v3

    :goto_2
    if-ge v5, v0, :cond_8

    .line 389
    aget-char v3, p1, v5

    const/16 v9, 0x22

    const/16 v10, 0x5c

    if-eq v3, v9, :cond_6

    const/16 v9, 0x3c

    const/16 v11, 0x75

    const/16 v12, 0x30

    if-eq v3, v9, :cond_4

    const/16 v9, 0x3e

    if-eq v3, v9, :cond_4

    if-eq v3, v10, :cond_3

    const/16 v9, 0x31

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    if-eqz v4, :cond_2

    const/16 v9, 0x7f

    if-le v3, v9, :cond_2

    .line 390
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 391
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 392
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    ushr-int/lit8 v11, v3, 0xc

    and-int/lit8 v11, v11, 0xf

    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x3

    ushr-int/lit8 v11, v3, 0x8

    and-int/lit8 v11, v11, 0xf

    .line 393
    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x4

    ushr-int/lit8 v11, v3, 0x4

    and-int/lit8 v11, v11, 0xf

    .line 394
    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x5

    and-int/lit8 v3, v3, 0xf

    .line 395
    aget-char v3, v10, v3

    aput-char v3, v6, v9

    :goto_3
    add-int/lit8 v7, v7, 0x6

    goto/16 :goto_6

    :cond_2
    add-int/lit8 v9, v7, 0x1

    .line 396
    aput-char v3, v6, v7

    :goto_4
    move v7, v9

    goto/16 :goto_6

    .line 397
    :pswitch_0
    aput-char v10, v6, v7

    add-int/lit8 v10, v7, 0x1

    .line 398
    aput-char v11, v6, v10

    add-int/lit8 v10, v7, 0x2

    .line 399
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x3

    .line 400
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x4

    .line 401
    aput-char v9, v6, v10

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x47

    int-to-char v3, v3

    .line 402
    aput-char v3, v6, v9

    goto :goto_3

    .line 403
    :pswitch_1
    aput-char v10, v6, v7

    add-int/lit8 v10, v7, 0x1

    .line 404
    aput-char v11, v6, v10

    add-int/lit8 v10, v7, 0x2

    .line 405
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x3

    .line 406
    aput-char v12, v6, v10

    add-int/lit8 v10, v7, 0x4

    .line 407
    aput-char v9, v6, v10

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x20

    int-to-char v3, v3

    .line 408
    aput-char v3, v6, v9

    goto :goto_3

    .line 409
    :pswitch_2
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x72

    .line 410
    aput-char v9, v6, v3

    :goto_5
    add-int/lit8 v7, v7, 0x2

    goto/16 :goto_6

    .line 411
    :pswitch_3
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x66

    .line 412
    aput-char v9, v6, v3

    goto :goto_5

    .line 413
    :pswitch_4
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 414
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 415
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 416
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 417
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x57

    int-to-char v3, v3

    .line 418
    aput-char v3, v6, v9

    goto :goto_3

    .line 419
    :pswitch_5
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x6e

    .line 420
    aput-char v9, v6, v3

    goto :goto_5

    .line 421
    :pswitch_6
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x74

    .line 422
    aput-char v9, v6, v3

    goto :goto_5

    .line 423
    :pswitch_7
    aput-char v10, v6, v7

    add-int/lit8 v3, v7, 0x1

    const/16 v9, 0x62

    .line 424
    aput-char v9, v6, v3

    goto :goto_5

    .line 425
    :pswitch_8
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 426
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 427
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 428
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 429
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x5

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    .line 430
    aput-char v3, v6, v9

    goto/16 :goto_3

    .line 431
    :cond_3
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 432
    aput-char v3, v6, v9

    goto :goto_5

    :cond_4
    :pswitch_9
    if-eqz v2, :cond_5

    .line 433
    aput-char v10, v6, v7

    add-int/lit8 v9, v7, 0x1

    .line 434
    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x2

    .line 435
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x3

    .line 436
    aput-char v12, v6, v9

    add-int/lit8 v9, v7, 0x4

    .line 437
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    ushr-int/lit8 v11, v3, 0x4

    and-int/lit8 v11, v11, 0xf

    aget-char v11, v10, v11

    aput-char v11, v6, v9

    add-int/lit8 v9, v7, 0x5

    and-int/lit8 v3, v3, 0xf

    .line 438
    aget-char v3, v10, v3

    aput-char v3, v6, v9

    goto/16 :goto_3

    :cond_5
    add-int/lit8 v9, v7, 0x1

    .line 439
    aput-char v3, v6, v7

    goto/16 :goto_4

    :cond_6
    :pswitch_a
    if-ne v3, v1, :cond_7

    add-int/lit8 v9, v7, 0x1

    .line 440
    aput-char v10, v6, v7

    move v7, v9

    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 441
    aput-char v3, v6, v7

    goto/16 :goto_4

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 442
    :cond_8
    aput-char v1, v6, v7

    add-int/2addr v7, v8

    .line 443
    iput v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method public final writeStringEscapeUTF16([B)V
    .locals 13

    .line 1
    array-length v0, p1

    .line 2
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 3
    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 5
    .line 6
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 7
    .line 8
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 9
    .line 10
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 11
    .line 12
    and-long/2addr v4, v2

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    cmp-long v4, v4, v6

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v8, 0x1

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move v4, v8

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v5

    .line 24
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 25
    .line 26
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 27
    .line 28
    and-long/2addr v2, v9

    .line 29
    cmp-long v2, v2, v6

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move v2, v8

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v5

    .line 36
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 37
    .line 38
    const/4 v6, 0x6

    .line 39
    const/4 v7, 0x2

    .line 40
    invoke-static {v0, v6, v3, v7}, Lp/a;->g(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 45
    .line 46
    .line 47
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 48
    .line 49
    add-int/lit8 v7, v3, 0x1

    .line 50
    .line 51
    aput-char v1, v6, v3

    .line 52
    .line 53
    :goto_2
    if-ge v5, v0, :cond_8

    .line 54
    .line 55
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 56
    .line 57
    sget v9, Lsun/misc/Unsafe;->ARRAY_CHAR_BASE_OFFSET:I

    .line 58
    .line 59
    int-to-long v9, v9

    .line 60
    int-to-long v11, v5

    .line 61
    add-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, p1, v9, v10}, Lsun/misc/Unsafe;->getChar(Ljava/lang/Object;J)C

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/16 v9, 0x22

    .line 67
    .line 68
    const/16 v10, 0x5c

    .line 69
    .line 70
    if-eq v3, v9, :cond_6

    .line 71
    .line 72
    const/16 v9, 0x3c

    .line 73
    .line 74
    const/16 v11, 0x75

    .line 75
    .line 76
    const/16 v12, 0x30

    .line 77
    .line 78
    if-eq v3, v9, :cond_4

    .line 79
    .line 80
    const/16 v9, 0x3e

    .line 81
    .line 82
    if-eq v3, v9, :cond_4

    .line 83
    .line 84
    if-eq v3, v10, :cond_3

    .line 85
    .line 86
    const/16 v9, 0x31

    .line 87
    .line 88
    packed-switch v3, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    packed-switch v3, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    const/16 v9, 0x7f

    .line 97
    .line 98
    if-le v3, v9, :cond_2

    .line 99
    .line 100
    aput-char v10, v6, v7

    .line 101
    .line 102
    add-int/lit8 v9, v7, 0x1

    .line 103
    .line 104
    aput-char v11, v6, v9

    .line 105
    .line 106
    add-int/lit8 v9, v7, 0x2

    .line 107
    .line 108
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 109
    .line 110
    ushr-int/lit8 v11, v3, 0xc

    .line 111
    .line 112
    and-int/lit8 v11, v11, 0xf

    .line 113
    .line 114
    aget-char v11, v10, v11

    .line 115
    .line 116
    aput-char v11, v6, v9

    .line 117
    .line 118
    add-int/lit8 v9, v7, 0x3

    .line 119
    .line 120
    ushr-int/lit8 v11, v3, 0x8

    .line 121
    .line 122
    and-int/lit8 v11, v11, 0xf

    .line 123
    .line 124
    aget-char v11, v10, v11

    .line 125
    .line 126
    aput-char v11, v6, v9

    .line 127
    .line 128
    add-int/lit8 v9, v7, 0x4

    .line 129
    .line 130
    ushr-int/lit8 v11, v3, 0x4

    .line 131
    .line 132
    and-int/lit8 v11, v11, 0xf

    .line 133
    .line 134
    aget-char v11, v10, v11

    .line 135
    .line 136
    aput-char v11, v6, v9

    .line 137
    .line 138
    add-int/lit8 v9, v7, 0x5

    .line 139
    .line 140
    and-int/lit8 v3, v3, 0xf

    .line 141
    .line 142
    aget-char v3, v10, v3

    .line 143
    .line 144
    aput-char v3, v6, v9

    .line 145
    .line 146
    :goto_3
    add-int/lit8 v7, v7, 0x6

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_2
    add-int/lit8 v9, v7, 0x1

    .line 151
    .line 152
    aput-char v3, v6, v7

    .line 153
    .line 154
    :goto_4
    move v7, v9

    .line 155
    goto/16 :goto_6

    .line 156
    .line 157
    :pswitch_0
    aput-char v10, v6, v7

    .line 158
    .line 159
    add-int/lit8 v10, v7, 0x1

    .line 160
    .line 161
    aput-char v11, v6, v10

    .line 162
    .line 163
    add-int/lit8 v10, v7, 0x2

    .line 164
    .line 165
    aput-char v12, v6, v10

    .line 166
    .line 167
    add-int/lit8 v10, v7, 0x3

    .line 168
    .line 169
    aput-char v12, v6, v10

    .line 170
    .line 171
    add-int/lit8 v10, v7, 0x4

    .line 172
    .line 173
    aput-char v9, v6, v10

    .line 174
    .line 175
    add-int/lit8 v9, v7, 0x5

    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x47

    .line 178
    .line 179
    int-to-char v3, v3

    .line 180
    aput-char v3, v6, v9

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :pswitch_1
    aput-char v10, v6, v7

    .line 184
    .line 185
    add-int/lit8 v10, v7, 0x1

    .line 186
    .line 187
    aput-char v11, v6, v10

    .line 188
    .line 189
    add-int/lit8 v10, v7, 0x2

    .line 190
    .line 191
    aput-char v12, v6, v10

    .line 192
    .line 193
    add-int/lit8 v10, v7, 0x3

    .line 194
    .line 195
    aput-char v12, v6, v10

    .line 196
    .line 197
    add-int/lit8 v10, v7, 0x4

    .line 198
    .line 199
    aput-char v9, v6, v10

    .line 200
    .line 201
    add-int/lit8 v9, v7, 0x5

    .line 202
    .line 203
    add-int/lit8 v3, v3, 0x20

    .line 204
    .line 205
    int-to-char v3, v3

    .line 206
    aput-char v3, v6, v9

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_2
    aput-char v10, v6, v7

    .line 210
    .line 211
    add-int/lit8 v3, v7, 0x1

    .line 212
    .line 213
    const/16 v9, 0x72

    .line 214
    .line 215
    aput-char v9, v6, v3

    .line 216
    .line 217
    :goto_5
    add-int/lit8 v7, v7, 0x2

    .line 218
    .line 219
    goto/16 :goto_6

    .line 220
    .line 221
    :pswitch_3
    aput-char v10, v6, v7

    .line 222
    .line 223
    add-int/lit8 v3, v7, 0x1

    .line 224
    .line 225
    const/16 v9, 0x66

    .line 226
    .line 227
    aput-char v9, v6, v3

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :pswitch_4
    aput-char v10, v6, v7

    .line 231
    .line 232
    add-int/lit8 v9, v7, 0x1

    .line 233
    .line 234
    aput-char v11, v6, v9

    .line 235
    .line 236
    add-int/lit8 v9, v7, 0x2

    .line 237
    .line 238
    aput-char v12, v6, v9

    .line 239
    .line 240
    add-int/lit8 v9, v7, 0x3

    .line 241
    .line 242
    aput-char v12, v6, v9

    .line 243
    .line 244
    add-int/lit8 v9, v7, 0x4

    .line 245
    .line 246
    aput-char v12, v6, v9

    .line 247
    .line 248
    add-int/lit8 v9, v7, 0x5

    .line 249
    .line 250
    add-int/lit8 v3, v3, 0x57

    .line 251
    .line 252
    int-to-char v3, v3

    .line 253
    aput-char v3, v6, v9

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :pswitch_5
    aput-char v10, v6, v7

    .line 257
    .line 258
    add-int/lit8 v3, v7, 0x1

    .line 259
    .line 260
    const/16 v9, 0x6e

    .line 261
    .line 262
    aput-char v9, v6, v3

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :pswitch_6
    aput-char v10, v6, v7

    .line 266
    .line 267
    add-int/lit8 v3, v7, 0x1

    .line 268
    .line 269
    const/16 v9, 0x74

    .line 270
    .line 271
    aput-char v9, v6, v3

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :pswitch_7
    aput-char v10, v6, v7

    .line 275
    .line 276
    add-int/lit8 v3, v7, 0x1

    .line 277
    .line 278
    const/16 v9, 0x62

    .line 279
    .line 280
    aput-char v9, v6, v3

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :pswitch_8
    aput-char v10, v6, v7

    .line 284
    .line 285
    add-int/lit8 v9, v7, 0x1

    .line 286
    .line 287
    aput-char v11, v6, v9

    .line 288
    .line 289
    add-int/lit8 v9, v7, 0x2

    .line 290
    .line 291
    aput-char v12, v6, v9

    .line 292
    .line 293
    add-int/lit8 v9, v7, 0x3

    .line 294
    .line 295
    aput-char v12, v6, v9

    .line 296
    .line 297
    add-int/lit8 v9, v7, 0x4

    .line 298
    .line 299
    aput-char v12, v6, v9

    .line 300
    .line 301
    add-int/lit8 v9, v7, 0x5

    .line 302
    .line 303
    add-int/lit8 v3, v3, 0x30

    .line 304
    .line 305
    int-to-char v3, v3

    .line 306
    aput-char v3, v6, v9

    .line 307
    .line 308
    goto/16 :goto_3

    .line 309
    .line 310
    :cond_3
    aput-char v10, v6, v7

    .line 311
    .line 312
    add-int/lit8 v9, v7, 0x1

    .line 313
    .line 314
    aput-char v3, v6, v9

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_4
    :pswitch_9
    if-eqz v2, :cond_5

    .line 318
    .line 319
    aput-char v10, v6, v7

    .line 320
    .line 321
    add-int/lit8 v9, v7, 0x1

    .line 322
    .line 323
    aput-char v11, v6, v9

    .line 324
    .line 325
    add-int/lit8 v9, v7, 0x2

    .line 326
    .line 327
    aput-char v12, v6, v9

    .line 328
    .line 329
    add-int/lit8 v9, v7, 0x3

    .line 330
    .line 331
    aput-char v12, v6, v9

    .line 332
    .line 333
    add-int/lit8 v9, v7, 0x4

    .line 334
    .line 335
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 336
    .line 337
    ushr-int/lit8 v11, v3, 0x4

    .line 338
    .line 339
    and-int/lit8 v11, v11, 0xf

    .line 340
    .line 341
    aget-char v11, v10, v11

    .line 342
    .line 343
    aput-char v11, v6, v9

    .line 344
    .line 345
    add-int/lit8 v9, v7, 0x5

    .line 346
    .line 347
    and-int/lit8 v3, v3, 0xf

    .line 348
    .line 349
    aget-char v3, v10, v3

    .line 350
    .line 351
    aput-char v3, v6, v9

    .line 352
    .line 353
    goto/16 :goto_3

    .line 354
    .line 355
    :cond_5
    add-int/lit8 v9, v7, 0x1

    .line 356
    .line 357
    aput-char v3, v6, v7

    .line 358
    .line 359
    goto/16 :goto_4

    .line 360
    .line 361
    :cond_6
    :pswitch_a
    if-ne v3, v1, :cond_7

    .line 362
    .line 363
    add-int/lit8 v9, v7, 0x1

    .line 364
    .line 365
    aput-char v10, v6, v7

    .line 366
    .line 367
    move v7, v9

    .line 368
    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 369
    .line 370
    aput-char v3, v6, v7

    .line 371
    .line 372
    goto/16 :goto_4

    .line 373
    .line 374
    :goto_6
    add-int/lit8 v5, v5, 0x2

    .line 375
    .line 376
    goto/16 :goto_2

    .line 377
    .line 378
    :cond_8
    aput-char v1, v6, v7

    .line 379
    .line 380
    add-int/2addr v7, v8

    .line 381
    iput v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 382
    .line 383
    return-void

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method public writeStringLatin1([B)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v0, v1

    .line 26
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 27
    .line 28
    array-length v3, p1

    .line 29
    add-int/2addr v3, v2

    .line 30
    add-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 33
    .line 34
    array-length v4, v4

    .line 35
    if-lt v3, v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 41
    .line 42
    add-int/lit8 v4, v2, 0x1

    .line 43
    .line 44
    iget-char v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 45
    .line 46
    aput-char v5, v3, v2

    .line 47
    .line 48
    :goto_1
    array-length v5, p1

    .line 49
    if-ge v1, v5, :cond_6

    .line 50
    .line 51
    aget-byte v5, p1, v1

    .line 52
    .line 53
    const/16 v6, 0x5c

    .line 54
    .line 55
    if-eq v5, v6, :cond_5

    .line 56
    .line 57
    iget-char v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 58
    .line 59
    if-eq v5, v6, :cond_5

    .line 60
    .line 61
    const/16 v6, 0x20

    .line 62
    .line 63
    if-ge v5, v6, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    if-eqz v0, :cond_4

    .line 67
    .line 68
    const/16 v6, 0x3c

    .line 69
    .line 70
    if-eq v5, v6, :cond_5

    .line 71
    .line 72
    const/16 v6, 0x3e

    .line 73
    .line 74
    if-eq v5, v6, :cond_5

    .line 75
    .line 76
    const/16 v6, 0x28

    .line 77
    .line 78
    if-eq v5, v6, :cond_5

    .line 79
    .line 80
    const/16 v6, 0x29

    .line 81
    .line 82
    if-ne v5, v6, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    add-int/lit8 v6, v4, 0x1

    .line 86
    .line 87
    int-to-char v5, v5

    .line 88
    aput-char v5, v3, v4

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    move v4, v6

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    :goto_2
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeStringEscape([B)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_6
    add-int/lit8 p1, v4, 0x1

    .line 101
    .line 102
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 103
    .line 104
    aput-char v0, v3, v4

    .line 105
    .line 106
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 107
    .line 108
    return-void
.end method

.method public writeStringUTF16([B)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v2, v0

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move v2, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v2, v3

    .line 27
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    and-long/2addr v0, v7

    .line 32
    cmp-long v0, v0, v4

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    move v0, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v3

    .line 39
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 40
    .line 41
    array-length v4, p1

    .line 42
    add-int/2addr v4, v1

    .line 43
    add-int/lit8 v4, v4, 0x2

    .line 44
    .line 45
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 46
    .line 47
    array-length v5, v5

    .line 48
    if-lt v4, v5, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 54
    .line 55
    add-int/lit8 v5, v1, 0x1

    .line 56
    .line 57
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 58
    .line 59
    aput-char v7, v4, v1

    .line 60
    .line 61
    :goto_2
    array-length v1, p1

    .line 62
    if-ge v3, v1, :cond_7

    .line 63
    .line 64
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 65
    .line 66
    sget v7, Lsun/misc/Unsafe;->ARRAY_BYTE_BASE_OFFSET:I

    .line 67
    .line 68
    int-to-long v7, v7

    .line 69
    int-to-long v9, v3

    .line 70
    add-long/2addr v7, v9

    .line 71
    invoke-virtual {v1, p1, v7, v8}, Lsun/misc/Unsafe;->getChar(Ljava/lang/Object;J)C

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/16 v7, 0x5c

    .line 76
    .line 77
    if-eq v1, v7, :cond_6

    .line 78
    .line 79
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 80
    .line 81
    if-eq v1, v7, :cond_6

    .line 82
    .line 83
    const/16 v7, 0x20

    .line 84
    .line 85
    if-lt v1, v7, :cond_6

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    const/16 v7, 0x3c

    .line 90
    .line 91
    if-eq v1, v7, :cond_6

    .line 92
    .line 93
    const/16 v7, 0x3e

    .line 94
    .line 95
    if-eq v1, v7, :cond_6

    .line 96
    .line 97
    const/16 v7, 0x28

    .line 98
    .line 99
    if-eq v1, v7, :cond_6

    .line 100
    .line 101
    const/16 v7, 0x29

    .line 102
    .line 103
    if-eq v1, v7, :cond_6

    .line 104
    .line 105
    :cond_4
    if-eqz v0, :cond_5

    .line 106
    .line 107
    const/16 v7, 0x7f

    .line 108
    .line 109
    if-le v1, v7, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    add-int/lit8 v7, v5, 0x1

    .line 113
    .line 114
    aput-char v1, v4, v5

    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x2

    .line 117
    .line 118
    move v5, v7

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    :goto_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->writeStringEscapeUTF16([B)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 125
    .line 126
    aput-char p1, v4, v5

    .line 127
    .line 128
    add-int/2addr v5, v6

    .line 129
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 130
    .line 131
    return-void
.end method

.method public writeTimeHHMMSS8(III)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    int-to-char v4, v4

    .line 19
    aput-char v4, v2, v0

    .line 20
    .line 21
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 22
    .line 23
    aget p1, v4, p1

    .line 24
    .line 25
    add-int/lit8 v5, v0, 0x1

    .line 26
    .line 27
    shr-int/lit8 v6, p1, 0x8

    .line 28
    .line 29
    int-to-byte v6, v6

    .line 30
    int-to-char v6, v6

    .line 31
    aput-char v6, v2, v5

    .line 32
    .line 33
    add-int/lit8 v5, v0, 0x2

    .line 34
    .line 35
    int-to-byte p1, p1

    .line 36
    int-to-char p1, p1

    .line 37
    aput-char p1, v2, v5

    .line 38
    .line 39
    add-int/lit8 p1, v0, 0x3

    .line 40
    .line 41
    const/16 v5, 0x3a

    .line 42
    .line 43
    aput-char v5, v2, p1

    .line 44
    .line 45
    aget p1, v4, p2

    .line 46
    .line 47
    add-int/lit8 p2, v0, 0x4

    .line 48
    .line 49
    shr-int/lit8 v6, p1, 0x8

    .line 50
    .line 51
    int-to-byte v6, v6

    .line 52
    int-to-char v6, v6

    .line 53
    aput-char v6, v2, p2

    .line 54
    .line 55
    add-int/lit8 p2, v0, 0x5

    .line 56
    .line 57
    int-to-byte p1, p1

    .line 58
    int-to-char p1, p1

    .line 59
    aput-char p1, v2, p2

    .line 60
    .line 61
    add-int/lit8 p1, v0, 0x6

    .line 62
    .line 63
    aput-char v5, v2, p1

    .line 64
    .line 65
    aget p1, v4, p3

    .line 66
    .line 67
    add-int/lit8 p2, v0, 0x7

    .line 68
    .line 69
    shr-int/lit8 p3, p1, 0x8

    .line 70
    .line 71
    int-to-byte p3, p3

    .line 72
    int-to-char p3, p3

    .line 73
    aput-char p3, v2, p2

    .line 74
    .line 75
    add-int/lit8 p2, v0, 0x8

    .line 76
    .line 77
    int-to-byte p1, p1

    .line 78
    int-to-char p1, p1

    .line 79
    aput-char p1, v2, p2

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x9

    .line 82
    .line 83
    int-to-byte p1, v3

    .line 84
    int-to-char p1, p1

    .line 85
    aput-char p1, v2, v0

    .line 86
    .line 87
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 88
    .line 89
    return-void
.end method

.method public writeUUID(Ljava/util/UUID;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget v5, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 18
    .line 19
    add-int/lit8 v5, v5, 0x26

    .line 20
    .line 21
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 22
    .line 23
    array-length v6, v6

    .line 24
    if-lt v5, v6, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_LOOKUP:[C

    .line 30
    .line 31
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 32
    .line 33
    iget v7, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 34
    .line 35
    const/16 v8, 0x22

    .line 36
    .line 37
    aput-char v8, v6, v7

    .line 38
    .line 39
    const/16 v9, 0x38

    .line 40
    .line 41
    shr-long v10, v1, v9

    .line 42
    .line 43
    long-to-int v10, v10

    .line 44
    and-int/lit16 v10, v10, 0xff

    .line 45
    .line 46
    aget-char v10, v5, v10

    .line 47
    .line 48
    const/16 v11, 0x30

    .line 49
    .line 50
    shr-long v12, v1, v11

    .line 51
    .line 52
    long-to-int v12, v12

    .line 53
    and-int/lit16 v12, v12, 0xff

    .line 54
    .line 55
    aget-char v12, v5, v12

    .line 56
    .line 57
    const/16 v13, 0x28

    .line 58
    .line 59
    shr-long v14, v1, v13

    .line 60
    .line 61
    long-to-int v14, v14

    .line 62
    and-int/lit16 v14, v14, 0xff

    .line 63
    .line 64
    aget-char v14, v5, v14

    .line 65
    .line 66
    const/16 v15, 0x20

    .line 67
    .line 68
    move/from16 p1, v8

    .line 69
    .line 70
    move/from16 v16, v9

    .line 71
    .line 72
    shr-long v8, v1, v15

    .line 73
    .line 74
    long-to-int v8, v8

    .line 75
    and-int/lit16 v8, v8, 0xff

    .line 76
    .line 77
    aget-char v8, v5, v8

    .line 78
    .line 79
    long-to-int v1, v1

    .line 80
    shr-int/lit8 v2, v1, 0x18

    .line 81
    .line 82
    and-int/lit16 v2, v2, 0xff

    .line 83
    .line 84
    aget-char v2, v5, v2

    .line 85
    .line 86
    shr-int/lit8 v9, v1, 0x10

    .line 87
    .line 88
    and-int/lit16 v9, v9, 0xff

    .line 89
    .line 90
    aget-char v9, v5, v9

    .line 91
    .line 92
    move/from16 v17, v11

    .line 93
    .line 94
    shr-int/lit8 v11, v1, 0x8

    .line 95
    .line 96
    and-int/lit16 v11, v11, 0xff

    .line 97
    .line 98
    aget-char v11, v5, v11

    .line 99
    .line 100
    and-int/lit16 v1, v1, 0xff

    .line 101
    .line 102
    aget-char v1, v5, v1

    .line 103
    .line 104
    move/from16 v18, v13

    .line 105
    .line 106
    move/from16 v19, v14

    .line 107
    .line 108
    shr-long v13, v3, v16

    .line 109
    .line 110
    long-to-int v13, v13

    .line 111
    and-int/lit16 v13, v13, 0xff

    .line 112
    .line 113
    aget-char v13, v5, v13

    .line 114
    .line 115
    move-object v14, v5

    .line 116
    move-object/from16 v16, v6

    .line 117
    .line 118
    shr-long v5, v3, v17

    .line 119
    .line 120
    long-to-int v5, v5

    .line 121
    and-int/lit16 v5, v5, 0xff

    .line 122
    .line 123
    aget-char v5, v14, v5

    .line 124
    .line 125
    move/from16 v17, v7

    .line 126
    .line 127
    shr-long v6, v3, v18

    .line 128
    .line 129
    long-to-int v6, v6

    .line 130
    and-int/lit16 v6, v6, 0xff

    .line 131
    .line 132
    aget-char v6, v14, v6

    .line 133
    .line 134
    move-object v7, v14

    .line 135
    shr-long v14, v3, v15

    .line 136
    .line 137
    long-to-int v14, v14

    .line 138
    and-int/lit16 v14, v14, 0xff

    .line 139
    .line 140
    aget-char v14, v7, v14

    .line 141
    .line 142
    long-to-int v3, v3

    .line 143
    shr-int/lit8 v4, v3, 0x18

    .line 144
    .line 145
    and-int/lit16 v4, v4, 0xff

    .line 146
    .line 147
    aget-char v4, v7, v4

    .line 148
    .line 149
    shr-int/lit8 v15, v3, 0x10

    .line 150
    .line 151
    and-int/lit16 v15, v15, 0xff

    .line 152
    .line 153
    aget-char v15, v7, v15

    .line 154
    .line 155
    move-object/from16 v18, v7

    .line 156
    .line 157
    shr-int/lit8 v7, v3, 0x8

    .line 158
    .line 159
    and-int/lit16 v7, v7, 0xff

    .line 160
    .line 161
    aget-char v7, v18, v7

    .line 162
    .line 163
    and-int/lit16 v3, v3, 0xff

    .line 164
    .line 165
    aget-char v3, v18, v3

    .line 166
    .line 167
    add-int/lit8 v18, v17, 0x1

    .line 168
    .line 169
    shr-int/lit8 v0, v10, 0x8

    .line 170
    .line 171
    int-to-byte v0, v0

    .line 172
    int-to-char v0, v0

    .line 173
    aput-char v0, v16, v18

    .line 174
    .line 175
    add-int/lit8 v0, v17, 0x2

    .line 176
    .line 177
    int-to-byte v10, v10

    .line 178
    int-to-char v10, v10

    .line 179
    aput-char v10, v16, v0

    .line 180
    .line 181
    add-int/lit8 v0, v17, 0x3

    .line 182
    .line 183
    shr-int/lit8 v10, v12, 0x8

    .line 184
    .line 185
    int-to-byte v10, v10

    .line 186
    int-to-char v10, v10

    .line 187
    aput-char v10, v16, v0

    .line 188
    .line 189
    add-int/lit8 v0, v17, 0x4

    .line 190
    .line 191
    int-to-byte v10, v12

    .line 192
    int-to-char v10, v10

    .line 193
    aput-char v10, v16, v0

    .line 194
    .line 195
    add-int/lit8 v0, v17, 0x5

    .line 196
    .line 197
    shr-int/lit8 v10, v19, 0x8

    .line 198
    .line 199
    int-to-byte v10, v10

    .line 200
    int-to-char v10, v10

    .line 201
    aput-char v10, v16, v0

    .line 202
    .line 203
    add-int/lit8 v0, v17, 0x6

    .line 204
    .line 205
    move/from16 v10, v19

    .line 206
    .line 207
    int-to-byte v10, v10

    .line 208
    int-to-char v10, v10

    .line 209
    aput-char v10, v16, v0

    .line 210
    .line 211
    add-int/lit8 v0, v17, 0x7

    .line 212
    .line 213
    shr-int/lit8 v10, v8, 0x8

    .line 214
    .line 215
    int-to-byte v10, v10

    .line 216
    int-to-char v10, v10

    .line 217
    aput-char v10, v16, v0

    .line 218
    .line 219
    add-int/lit8 v0, v17, 0x8

    .line 220
    .line 221
    int-to-byte v8, v8

    .line 222
    int-to-char v8, v8

    .line 223
    aput-char v8, v16, v0

    .line 224
    .line 225
    add-int/lit8 v0, v17, 0x9

    .line 226
    .line 227
    const/16 v8, 0x2d

    .line 228
    .line 229
    aput-char v8, v16, v0

    .line 230
    .line 231
    add-int/lit8 v0, v17, 0xa

    .line 232
    .line 233
    shr-int/lit8 v10, v2, 0x8

    .line 234
    .line 235
    int-to-byte v10, v10

    .line 236
    int-to-char v10, v10

    .line 237
    aput-char v10, v16, v0

    .line 238
    .line 239
    add-int/lit8 v0, v17, 0xb

    .line 240
    .line 241
    int-to-byte v2, v2

    .line 242
    int-to-char v2, v2

    .line 243
    aput-char v2, v16, v0

    .line 244
    .line 245
    add-int/lit8 v0, v17, 0xc

    .line 246
    .line 247
    shr-int/lit8 v2, v9, 0x8

    .line 248
    .line 249
    int-to-byte v2, v2

    .line 250
    int-to-char v2, v2

    .line 251
    aput-char v2, v16, v0

    .line 252
    .line 253
    add-int/lit8 v0, v17, 0xd

    .line 254
    .line 255
    int-to-byte v2, v9

    .line 256
    int-to-char v2, v2

    .line 257
    aput-char v2, v16, v0

    .line 258
    .line 259
    add-int/lit8 v0, v17, 0xe

    .line 260
    .line 261
    aput-char v8, v16, v0

    .line 262
    .line 263
    add-int/lit8 v0, v17, 0xf

    .line 264
    .line 265
    shr-int/lit8 v2, v11, 0x8

    .line 266
    .line 267
    int-to-byte v2, v2

    .line 268
    int-to-char v2, v2

    .line 269
    aput-char v2, v16, v0

    .line 270
    .line 271
    add-int/lit8 v0, v17, 0x10

    .line 272
    .line 273
    int-to-byte v2, v11

    .line 274
    int-to-char v2, v2

    .line 275
    aput-char v2, v16, v0

    .line 276
    .line 277
    add-int/lit8 v0, v17, 0x11

    .line 278
    .line 279
    shr-int/lit8 v2, v1, 0x8

    .line 280
    .line 281
    int-to-byte v2, v2

    .line 282
    int-to-char v2, v2

    .line 283
    aput-char v2, v16, v0

    .line 284
    .line 285
    add-int/lit8 v0, v17, 0x12

    .line 286
    .line 287
    int-to-byte v1, v1

    .line 288
    int-to-char v1, v1

    .line 289
    aput-char v1, v16, v0

    .line 290
    .line 291
    add-int/lit8 v0, v17, 0x13

    .line 292
    .line 293
    aput-char v8, v16, v0

    .line 294
    .line 295
    add-int/lit8 v0, v17, 0x14

    .line 296
    .line 297
    shr-int/lit8 v1, v13, 0x8

    .line 298
    .line 299
    int-to-byte v1, v1

    .line 300
    int-to-char v1, v1

    .line 301
    aput-char v1, v16, v0

    .line 302
    .line 303
    add-int/lit8 v0, v17, 0x15

    .line 304
    .line 305
    int-to-byte v1, v13

    .line 306
    int-to-char v1, v1

    .line 307
    aput-char v1, v16, v0

    .line 308
    .line 309
    add-int/lit8 v0, v17, 0x16

    .line 310
    .line 311
    shr-int/lit8 v1, v5, 0x8

    .line 312
    .line 313
    int-to-byte v1, v1

    .line 314
    int-to-char v1, v1

    .line 315
    aput-char v1, v16, v0

    .line 316
    .line 317
    add-int/lit8 v0, v17, 0x17

    .line 318
    .line 319
    int-to-byte v1, v5

    .line 320
    int-to-char v1, v1

    .line 321
    aput-char v1, v16, v0

    .line 322
    .line 323
    add-int/lit8 v0, v17, 0x18

    .line 324
    .line 325
    aput-char v8, v16, v0

    .line 326
    .line 327
    add-int/lit8 v0, v17, 0x19

    .line 328
    .line 329
    shr-int/lit8 v1, v6, 0x8

    .line 330
    .line 331
    int-to-byte v1, v1

    .line 332
    int-to-char v1, v1

    .line 333
    aput-char v1, v16, v0

    .line 334
    .line 335
    add-int/lit8 v0, v17, 0x1a

    .line 336
    .line 337
    int-to-byte v1, v6

    .line 338
    int-to-char v1, v1

    .line 339
    aput-char v1, v16, v0

    .line 340
    .line 341
    add-int/lit8 v0, v17, 0x1b

    .line 342
    .line 343
    shr-int/lit8 v1, v14, 0x8

    .line 344
    .line 345
    int-to-byte v1, v1

    .line 346
    int-to-char v1, v1

    .line 347
    aput-char v1, v16, v0

    .line 348
    .line 349
    add-int/lit8 v0, v17, 0x1c

    .line 350
    .line 351
    int-to-byte v1, v14

    .line 352
    int-to-char v1, v1

    .line 353
    aput-char v1, v16, v0

    .line 354
    .line 355
    add-int/lit8 v0, v17, 0x1d

    .line 356
    .line 357
    shr-int/lit8 v1, v4, 0x8

    .line 358
    .line 359
    int-to-byte v1, v1

    .line 360
    int-to-char v1, v1

    .line 361
    aput-char v1, v16, v0

    .line 362
    .line 363
    add-int/lit8 v0, v17, 0x1e

    .line 364
    .line 365
    int-to-byte v1, v4

    .line 366
    int-to-char v1, v1

    .line 367
    aput-char v1, v16, v0

    .line 368
    .line 369
    add-int/lit8 v0, v17, 0x1f

    .line 370
    .line 371
    shr-int/lit8 v1, v15, 0x8

    .line 372
    .line 373
    int-to-byte v1, v1

    .line 374
    int-to-char v1, v1

    .line 375
    aput-char v1, v16, v0

    .line 376
    .line 377
    add-int/lit8 v0, v17, 0x20

    .line 378
    .line 379
    int-to-byte v1, v15

    .line 380
    int-to-char v1, v1

    .line 381
    aput-char v1, v16, v0

    .line 382
    .line 383
    add-int/lit8 v0, v17, 0x21

    .line 384
    .line 385
    shr-int/lit8 v1, v7, 0x8

    .line 386
    .line 387
    int-to-byte v1, v1

    .line 388
    int-to-char v1, v1

    .line 389
    aput-char v1, v16, v0

    .line 390
    .line 391
    add-int/lit8 v0, v17, 0x22

    .line 392
    .line 393
    int-to-byte v1, v7

    .line 394
    int-to-char v1, v1

    .line 395
    aput-char v1, v16, v0

    .line 396
    .line 397
    add-int/lit8 v7, v17, 0x23

    .line 398
    .line 399
    shr-int/lit8 v0, v3, 0x8

    .line 400
    .line 401
    int-to-byte v0, v0

    .line 402
    int-to-char v0, v0

    .line 403
    aput-char v0, v16, v7

    .line 404
    .line 405
    add-int/lit8 v7, v17, 0x24

    .line 406
    .line 407
    int-to-byte v0, v3

    .line 408
    int-to-char v0, v0

    .line 409
    aput-char v0, v16, v7

    .line 410
    .line 411
    add-int/lit8 v7, v17, 0x25

    .line 412
    .line 413
    aput-char p1, v16, v7

    .line 414
    .line 415
    add-int/lit8 v7, v17, 0x26

    .line 416
    .line 417
    move-object/from16 v0, p0

    .line 418
    .line 419
    iput v7, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 420
    .line 421
    return-void
.end method

.method public final writeZonedDateTime(Ljava/time/ZonedDateTime;)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 20
    .line 21
    const/16 v4, 0x2d

    .line 22
    .line 23
    const/16 v5, 0x2b

    .line 24
    .line 25
    const-string v6, "Z"

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    if-eq v3, v0, :cond_5

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-gt v2, v0, :cond_1

    .line 33
    .line 34
    const-string v0, "UTC"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eq v0, v5, :cond_2

    .line 56
    .line 57
    if-ne v0, v4, :cond_4

    .line 58
    .line 59
    :cond_2
    move v3, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v0, v7

    .line 62
    :cond_4
    add-int/lit8 v3, v2, 0x2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    :goto_0
    move-object v1, v6

    .line 66
    move v0, v7

    .line 67
    move v3, v8

    .line 68
    :goto_1
    iget v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 69
    .line 70
    add-int v9, v6, v3

    .line 71
    .line 72
    add-int/lit8 v9, v9, 0x26

    .line 73
    .line 74
    iget-object v10, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 75
    .line 76
    array-length v10, v10

    .line 77
    if-lt v9, v10, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/JSONWriterUTF16;->ensureCapacity(I)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-object v9, p0, Lcom/alibaba/fastjson2/JSONWriterUTF16;->chars:[C

    .line 83
    .line 84
    add-int/lit8 v10, v6, 0x1

    .line 85
    .line 86
    iget-char v11, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 87
    .line 88
    aput-char v11, v9, v6

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Ljava/time/LocalDate;->getYear()I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    invoke-virtual {v6}, Ljava/time/LocalDate;->getMonthValue()I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    invoke-virtual {v6}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-static {v9, v10, v11, v12, v6}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    add-int/lit8 v10, v6, 0x1

    .line 111
    .line 112
    const/16 v11, 0x54

    .line 113
    .line 114
    aput-char v11, v9, v6

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {v9, v10, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CILjava/time/LocalTime;)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-ne v3, v8, :cond_7

    .line 125
    .line 126
    add-int/lit8 v0, p1, 0x1

    .line 127
    .line 128
    const/16 v1, 0x5a

    .line 129
    .line 130
    aput-char v1, v9, p1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    if-eq v0, v5, :cond_9

    .line 134
    .line 135
    if-ne v0, v4, :cond_8

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    add-int/lit8 v0, p1, 0x1

    .line 139
    .line 140
    const/16 v3, 0x5b

    .line 141
    .line 142
    aput-char v3, v9, p1

    .line 143
    .line 144
    invoke-virtual {v1, v7, v2, v9, v0}, Ljava/lang/String;->getChars(II[CI)V

    .line 145
    .line 146
    .line 147
    add-int/2addr v0, v2

    .line 148
    add-int/lit8 p1, v0, 0x1

    .line 149
    .line 150
    const/16 v1, 0x5d

    .line 151
    .line 152
    aput-char v1, v9, v0

    .line 153
    .line 154
    move v0, p1

    .line 155
    goto :goto_3

    .line 156
    :cond_9
    :goto_2
    invoke-virtual {v1, v7, v2, v9, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 157
    .line 158
    .line 159
    add-int v0, p1, v2

    .line 160
    .line 161
    :goto_3
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 162
    .line 163
    aput-char p1, v9, v0

    .line 164
    .line 165
    add-int/2addr v0, v8

    .line 166
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 167
    .line 168
    return-void
.end method
