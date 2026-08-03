.class Lcom/alibaba/fastjson2/JSONReaderUTF8;
.super Lcom/alibaba/fastjson2/JSONReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final REF:I


# instance fields
.field protected byteBuf:[B

.field protected final bytes:[B

.field protected final cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

.field protected charBuf:[C

.field protected final end:I

.field protected final in:Ljava/io/InputStream;

.field protected final length:I

.field protected nameAscii:Z

.field protected nameBegin:I

.field protected nameEnd:I

.field protected nameLength:I

.field protected referenceBegin:I

.field protected final start:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x24726566

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const v0, 0x66657224

    .line 10
    .line 11
    .line 12
    :goto_0
    sput v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->REF:I

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V
    .locals 5

    const/4 v0, 0x0

    .line 117
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 118
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v1, v3

    .line 119
    aget-object v1, v2, v1

    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 120
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-nez v1, :cond_0

    .line 121
    iget v1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    new-array v1, v1, [B

    :cond_0
    move v2, v0

    .line 122
    :cond_1
    :goto_0
    :try_start_0
    array-length v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p2, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    .line 123
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->byteBuf:[B

    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 124
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 125
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->length:I

    .line 126
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->in:Ljava/io/InputStream;

    .line 127
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->start:I

    .line 128
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 129
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 130
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_2

    .line 131
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    :cond_2
    return-void

    :cond_3
    add-int/2addr v2, v3

    .line 132
    :try_start_1
    array-length v3, v1

    if-ne v2, v3, :cond_1

    .line 133
    array-length v3, v1

    iget v4, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    add-int/2addr v3, v4

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 134
    const-string p2, "read error"

    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V
    .locals 5

    const/4 p2, 0x0

    .line 135
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 136
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    and-int/2addr p1, v0

    .line 137
    aget-object p1, p2, p1

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 138
    iput-object p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 139
    iput p5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->length:I

    const/4 p1, 0x0

    .line 140
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->in:Ljava/io/InputStream;

    .line 141
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->start:I

    add-int/2addr p5, p4

    .line 142
    iput p5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    const/16 p1, 0x1a

    if-lt p4, p5, :cond_0

    move p2, p4

    :goto_0
    move p4, p1

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p4, 0x1

    .line 143
    aget-byte p4, p3, p4

    :goto_1
    const/16 p5, 0x20

    if-gt p4, p5, :cond_2

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p4

    const-wide v2, 0x100003701L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p5, v0, v2

    if-eqz p5, :cond_2

    .line 144
    iget p4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-ne p2, p4, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 p4, p2, 0x1

    aget-byte p2, p3, p2

    move v4, p4

    move p4, p2

    move p2, v4

    goto :goto_1

    :cond_2
    if-gez p4, :cond_3

    .line 145
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    return-void

    .line 146
    :cond_3
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    int-to-char p1, p4

    .line 147
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p1, 0x2f

    if-ne p4, p1, :cond_4

    .line 148
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    :cond_4
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x1

    .line 17
    sub-int/2addr v2, v3

    .line 18
    and-int/2addr p1, v2

    .line 19
    aget-object p1, v1, p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 22
    .line 23
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [B

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    array-length v4, p1

    .line 39
    if-ge v4, v1, :cond_1

    .line 40
    .line 41
    :cond_0
    new-array p1, v1, [B

    .line 42
    .line 43
    :cond_1
    invoke-virtual {p2, p1, v0, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->byteBuf:[B

    .line 47
    .line 48
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 49
    .line 50
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->length:I

    .line 51
    .line 52
    iput-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->in:Ljava/io/InputStream;

    .line 53
    .line 54
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->start:I

    .line 55
    .line 56
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 57
    .line 58
    const/16 p2, 0x1a

    .line 59
    .line 60
    if-gtz v1, :cond_2

    .line 61
    .line 62
    move v3, v0

    .line 63
    :goto_0
    move v0, p2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    aget-byte v0, p1, v0

    .line 66
    .line 67
    :goto_1
    const/16 v1, 0x20

    .line 68
    .line 69
    if-gt v0, v1, :cond_4

    .line 70
    .line 71
    const-wide/16 v1, 0x1

    .line 72
    .line 73
    shl-long/2addr v1, v0

    .line 74
    const-wide v4, 0x100003701L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v1, v4

    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    cmp-long v1, v1, v4

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 87
    .line 88
    if-ne v3, v0, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    add-int/lit8 v0, v3, 0x1

    .line 92
    .line 93
    aget-byte v1, p1, v3

    .line 94
    .line 95
    move v3, v0

    .line 96
    move v0, v1

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-gez v0, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    int-to-char p1, v0

    .line 107
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 108
    .line 109
    const/16 p1, 0x2f

    .line 110
    .line 111
    if-ne v0, p1, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 114
    .line 115
    .line 116
    :cond_6
    return-void
.end method

.method public static char2_utf8(III)I
    .locals 2

    and-int/lit16 v0, p1, 0xc0

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    and-int/lit8 p0, p0, 0x1f

    shl-int/lit8 p0, p0, 0x6

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p0, p1

    return p0

    .line 95
    :cond_0
    const-string p0, "malformed input around byte "

    .line 96
    invoke-static {p2, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 97
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static char2_utf8(IIII)I
    .locals 2

    and-int/lit16 v0, p1, 0xc0

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    and-int/lit16 v0, p2, 0xc0

    if-ne v0, v1, :cond_0

    and-int/lit8 p0, p0, 0xf

    shl-int/lit8 p0, p0, 0xc

    and-int/lit8 p1, p1, 0x3f

    shl-int/lit8 p1, p1, 0x6

    or-int/2addr p0, p1

    and-int/lit8 p1, p2, 0x3f

    or-int/2addr p0, p1

    return p0

    .line 92
    :cond_0
    const-string p0, "malformed input around byte "

    .line 93
    invoke-static {p3, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 94
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static char2_utf8([BII[CI)V
    .locals 4

    .line 1
    shr-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const-string v2, "malformed input around byte "

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    aget-byte v0, p0, v0

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x2

    .line 13
    .line 14
    aget-byte v1, p0, v1

    .line 15
    .line 16
    add-int/lit8 v3, p1, 0x3

    .line 17
    .line 18
    aget-byte p0, p0, v3

    .line 19
    .line 20
    shl-int/lit8 p2, p2, 0x12

    .line 21
    .line 22
    shl-int/lit8 v3, v0, 0xc

    .line 23
    .line 24
    xor-int/2addr p2, v3

    .line 25
    shl-int/lit8 v3, v1, 0x6

    .line 26
    .line 27
    xor-int/2addr p2, v3

    .line 28
    const v3, 0x381f80

    .line 29
    .line 30
    .line 31
    xor-int/2addr v3, p0

    .line 32
    xor-int/2addr p2, v3

    .line 33
    and-int/lit16 v0, v0, 0xc0

    .line 34
    .line 35
    const/16 v3, 0x80

    .line 36
    .line 37
    if-ne v0, v3, :cond_0

    .line 38
    .line 39
    and-int/lit16 v0, v1, 0xc0

    .line 40
    .line 41
    if-ne v0, v3, :cond_0

    .line 42
    .line 43
    and-int/lit16 p0, p0, 0xc0

    .line 44
    .line 45
    if-ne p0, v3, :cond_0

    .line 46
    .line 47
    const/high16 p0, 0x10000

    .line 48
    .line 49
    if-lt p2, p0, :cond_0

    .line 50
    .line 51
    const/high16 p0, 0x110000

    .line 52
    .line 53
    if-ge p2, p0, :cond_0

    .line 54
    .line 55
    ushr-int/lit8 p0, p2, 0xa

    .line 56
    .line 57
    const p1, 0xd7c0

    .line 58
    .line 59
    .line 60
    add-int/2addr p0, p1

    .line 61
    int-to-char p0, p0

    .line 62
    aput-char p0, p3, p4

    .line 63
    .line 64
    add-int/lit8 p4, p4, 0x1

    .line 65
    .line 66
    and-int/lit16 p0, p2, 0x3ff

    .line 67
    .line 68
    const p1, 0xdc00

    .line 69
    .line 70
    .line 71
    add-int/2addr p0, p1

    .line 72
    int-to-char p0, p0

    .line 73
    aput-char p0, p3, p4

    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-static {p1, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    invoke-static {p1, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private char_utf8(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    and-int/lit16 v1, p1, 0xff

    .line 4
    .line 5
    shr-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    shr-int/lit8 v1, p1, 0x3

    .line 11
    .line 12
    const/4 v2, -0x2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    aget-byte v1, v0, p2

    .line 16
    .line 17
    add-int/lit8 v2, p2, 0x1

    .line 18
    .line 19
    aget-byte v2, v0, v2

    .line 20
    .line 21
    add-int/lit8 v3, p2, 0x2

    .line 22
    .line 23
    aget-byte v0, v0, v3

    .line 24
    .line 25
    shl-int/lit8 p1, p1, 0x12

    .line 26
    .line 27
    shl-int/lit8 v1, v1, 0xc

    .line 28
    .line 29
    xor-int/2addr p1, v1

    .line 30
    shl-int/lit8 v1, v2, 0x6

    .line 31
    .line 32
    xor-int/2addr p1, v1

    .line 33
    const v1, 0x381f80

    .line 34
    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    xor-int/2addr p1, v0

    .line 38
    add-int/lit8 p2, p2, 0x3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p1, "malformed input around byte "

    .line 42
    .line 43
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    aget-byte p1, v0, p2

    .line 52
    .line 53
    add-int/lit8 v2, p2, 0x1

    .line 54
    .line 55
    aget-byte v0, v0, v2

    .line 56
    .line 57
    invoke-static {v1, p1, v0, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    add-int/lit8 p2, p2, 0x2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_1
    add-int/lit8 p1, p2, 0x1

    .line 65
    .line 66
    aget-byte p2, v0, p2

    .line 67
    .line 68
    invoke-static {v1, p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    move v4, p2

    .line 73
    move p2, p1

    .line 74
    move p1, v4

    .line 75
    :goto_0
    int-to-char p1, p1

    .line 76
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private isReference0([BIII)Z
    .locals 14

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    add-int/lit8 v1, p2, 0x6

    .line 4
    .line 5
    aget-byte v2, p1, v1

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    if-ltz v2, :cond_1

    .line 20
    .line 21
    if-gt v2, v9, :cond_1

    .line 22
    .line 23
    shl-long v11, v7, v2

    .line 24
    .line 25
    and-long/2addr v11, v5

    .line 26
    cmp-long v11, v11, v3

    .line 27
    .line 28
    if-eqz v11, :cond_1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    if-lt v1, v0, :cond_0

    .line 33
    .line 34
    return v10

    .line 35
    :cond_0
    aget-byte v2, p1, v1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v11, 0x3a

    .line 39
    .line 40
    if-ne v2, v11, :cond_6

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    add-int/2addr v1, v2

    .line 44
    if-lt v1, v0, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    aget-byte v11, p1, v1

    .line 48
    .line 49
    :goto_1
    if-ltz v11, :cond_4

    .line 50
    .line 51
    if-gt v11, v9, :cond_4

    .line 52
    .line 53
    shl-long v12, v7, v11

    .line 54
    .line 55
    and-long/2addr v12, v5

    .line 56
    cmp-long v12, v12, v3

    .line 57
    .line 58
    if-eqz v12, :cond_4

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    if-lt v1, v0, :cond_3

    .line 63
    .line 64
    return v10

    .line 65
    :cond_3
    aget-byte v11, p1, v1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move/from16 v3, p4

    .line 69
    .line 70
    if-ne v11, v3, :cond_6

    .line 71
    .line 72
    add-int/lit8 v3, v1, 0x1

    .line 73
    .line 74
    if-ge v3, v0, :cond_5

    .line 75
    .line 76
    aget-byte p1, p1, v3

    .line 77
    .line 78
    const/16 v0, 0x24

    .line 79
    .line 80
    if-eq p1, v0, :cond_5

    .line 81
    .line 82
    const/16 v0, 0x2e

    .line 83
    .line 84
    if-eq p1, v0, :cond_5

    .line 85
    .line 86
    const/16 v0, 0x40

    .line 87
    .line 88
    if-eq p1, v0, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->referenceBegin:I

    .line 92
    .line 93
    return v2

    .line 94
    :cond_6
    :goto_2
    return v10
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->byteBuf:[B

    .line 4
    .line 5
    const/high16 v2, 0x100000

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    if-ge v3, v2, :cond_0

    .line 11
    .line 12
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    array-length v3, v1

    .line 22
    if-ge v3, v2, :cond_1

    .line 23
    .line 24
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->in:Ljava/io/InputStream;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    :catch_0
    :cond_2
    return-void
.end method

.method public getFieldName()Ljava/lang/String;
    .locals 13

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
    sub-int/2addr v1, v2

    .line 8
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 9
    .line 10
    if-nez v3, :cond_1

    .line 11
    .line 12
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v3, Ljava/lang/String;

    .line 22
    .line 23
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    invoke-direct {v3, v0, v2, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, [C

    .line 43
    .line 44
    iput-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 45
    .line 46
    :cond_2
    if-eqz v2, :cond_3

    .line 47
    .line 48
    array-length v3, v2

    .line 49
    if-ge v3, v1, :cond_4

    .line 50
    .line 51
    :cond_3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 52
    .line 53
    new-array v2, v1, [C

    .line 54
    .line 55
    iput-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 56
    .line 57
    :cond_4
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

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
    if-ge v1, v5, :cond_d

    .line 64
    .line 65
    aget-byte v5, v0, v1

    .line 66
    .line 67
    if-gez v5, :cond_7

    .line 68
    .line 69
    and-int/lit16 v6, v5, 0xff

    .line 70
    .line 71
    shr-int/lit8 v6, v6, 0x4

    .line 72
    .line 73
    const/16 v7, 0x80

    .line 74
    .line 75
    const-string v8, "malformed input around byte "

    .line 76
    .line 77
    packed-switch v6, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v8}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    return-object v0

    .line 89
    :pswitch_0
    add-int/lit8 v6, v1, 0x1

    .line 90
    .line 91
    aget-byte v6, v0, v6

    .line 92
    .line 93
    add-int/lit8 v9, v1, 0x2

    .line 94
    .line 95
    aget-byte v10, v0, v9

    .line 96
    .line 97
    and-int/lit16 v11, v6, 0xc0

    .line 98
    .line 99
    if-ne v11, v7, :cond_5

    .line 100
    .line 101
    and-int/lit16 v11, v10, 0xc0

    .line 102
    .line 103
    if-ne v11, v7, :cond_5

    .line 104
    .line 105
    and-int/lit8 v5, v5, 0xf

    .line 106
    .line 107
    shl-int/lit8 v5, v5, 0xc

    .line 108
    .line 109
    and-int/lit8 v6, v6, 0x3f

    .line 110
    .line 111
    shl-int/lit8 v6, v6, 0x6

    .line 112
    .line 113
    or-int/2addr v5, v6

    .line 114
    and-int/lit8 v6, v10, 0x3f

    .line 115
    .line 116
    or-int/2addr v5, v6

    .line 117
    add-int/lit8 v1, v1, 0x3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-static {v9, v8}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    return-object v0

    .line 129
    :pswitch_1
    add-int/lit8 v6, v1, 0x1

    .line 130
    .line 131
    aget-byte v6, v0, v6

    .line 132
    .line 133
    and-int/lit16 v9, v6, 0xc0

    .line 134
    .line 135
    if-ne v9, v7, :cond_6

    .line 136
    .line 137
    and-int/lit8 v5, v5, 0x1f

    .line 138
    .line 139
    shl-int/lit8 v5, v5, 0x6

    .line 140
    .line 141
    and-int/lit8 v6, v6, 0x3f

    .line 142
    .line 143
    or-int/2addr v5, v6

    .line 144
    add-int/lit8 v1, v1, 0x2

    .line 145
    .line 146
    :goto_1
    int-to-char v5, v5

    .line 147
    aput-char v5, v2, v4

    .line 148
    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :cond_6
    invoke-static {v1, v8}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    return-object v0

    .line 160
    :cond_7
    const/16 v6, 0x22

    .line 161
    .line 162
    const/16 v7, 0x5c

    .line 163
    .line 164
    if-ne v5, v7, :cond_b

    .line 165
    .line 166
    add-int/lit8 v5, v1, 0x1

    .line 167
    .line 168
    aget-byte v8, v0, v5

    .line 169
    .line 170
    int-to-char v8, v8

    .line 171
    if-eq v8, v6, :cond_a

    .line 172
    .line 173
    const/16 v6, 0x3a

    .line 174
    .line 175
    if-eq v8, v6, :cond_a

    .line 176
    .line 177
    const/16 v6, 0x40

    .line 178
    .line 179
    if-eq v8, v6, :cond_a

    .line 180
    .line 181
    if-eq v8, v7, :cond_a

    .line 182
    .line 183
    const/16 v6, 0x75

    .line 184
    .line 185
    if-eq v8, v6, :cond_9

    .line 186
    .line 187
    const/16 v6, 0x78

    .line 188
    .line 189
    if-eq v8, v6, :cond_8

    .line 190
    .line 191
    const/16 v1, 0x2a

    .line 192
    .line 193
    if-eq v8, v1, :cond_a

    .line 194
    .line 195
    const/16 v1, 0x2b

    .line 196
    .line 197
    if-eq v8, v1, :cond_a

    .line 198
    .line 199
    packed-switch v8, :pswitch_data_1

    .line 200
    .line 201
    .line 202
    packed-switch v8, :pswitch_data_2

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v8}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    move v12, v5

    .line 210
    move v5, v1

    .line 211
    move v1, v12

    .line 212
    goto :goto_2

    .line 213
    :cond_8
    add-int/lit8 v5, v1, 0x2

    .line 214
    .line 215
    aget-byte v5, v0, v5

    .line 216
    .line 217
    add-int/lit8 v1, v1, 0x3

    .line 218
    .line 219
    aget-byte v6, v0, v1

    .line 220
    .line 221
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    goto :goto_2

    .line 226
    :cond_9
    add-int/lit8 v5, v1, 0x2

    .line 227
    .line 228
    aget-byte v5, v0, v5

    .line 229
    .line 230
    add-int/lit8 v6, v1, 0x3

    .line 231
    .line 232
    aget-byte v6, v0, v6

    .line 233
    .line 234
    add-int/lit8 v7, v1, 0x4

    .line 235
    .line 236
    aget-byte v7, v0, v7

    .line 237
    .line 238
    add-int/lit8 v1, v1, 0x5

    .line 239
    .line 240
    aget-byte v8, v0, v1

    .line 241
    .line 242
    invoke-static {v5, v6, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    goto :goto_2

    .line 247
    :cond_a
    :pswitch_2
    move v1, v5

    .line 248
    move v5, v8

    .line 249
    goto :goto_2

    .line 250
    :cond_b
    if-ne v5, v6, :cond_c

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_c
    :goto_2
    int-to-char v5, v5

    .line 254
    aput-char v5, v2, v4

    .line 255
    .line 256
    add-int/lit8 v1, v1, 0x1

    .line 257
    .line 258
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_d
    :goto_4
    new-instance v0, Ljava/lang/String;

    .line 263
    .line 264
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 265
    .line 266
    invoke-direct {v0, v2, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final getLatin1String(II)Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, p2, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [C

    .line 31
    .line 32
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 33
    .line 34
    :cond_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    array-length v1, v0

    .line 37
    if-ge v1, p2, :cond_3

    .line 38
    .line 39
    :cond_2
    new-array v0, p2, [C

    .line 40
    .line 41
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 42
    .line 43
    :cond_3
    const/4 v1, 0x0

    .line 44
    move v2, v1

    .line 45
    :goto_0
    if-ge v2, p2, :cond_4

    .line 46
    .line 47
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 48
    .line 49
    add-int v4, p1, v2

    .line 50
    .line 51
    aget-byte v3, v3, v4

    .line 52
    .line 53
    and-int/lit16 v3, v3, 0xff

    .line 54
    .line 55
    int-to-char v3, v3

    .line 56
    aput-char v3, v0, v2

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    new-instance p1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {p1, v0, v1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 64
    .line 65
    .line 66
    return-object p1
.end method

.method public getNameHashCodeLCase()J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    const/16 v3, 0x27

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v5, v1, -0x1

    .line 14
    .line 15
    aget-byte v5, v2, v5

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
    const/16 v12, 0x78

    .line 28
    .line 29
    const/16 v13, 0x75

    .line 30
    .line 31
    const/16 v14, 0x5c

    .line 32
    .line 33
    const-wide/16 v16, 0x0

    .line 34
    .line 35
    const/16 v7, 0x2d

    .line 36
    .line 37
    const/16 v15, 0x5f

    .line 38
    .line 39
    const/16 v6, 0x20

    .line 40
    .line 41
    if-ge v1, v11, :cond_c

    .line 42
    .line 43
    aget-byte v11, v2, v1

    .line 44
    .line 45
    if-ne v11, v14, :cond_3

    .line 46
    .line 47
    add-int/lit8 v11, v1, 0x1

    .line 48
    .line 49
    aget-byte v14, v2, v11

    .line 50
    .line 51
    if-eq v14, v13, :cond_2

    .line 52
    .line 53
    if-eq v14, v12, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, v14}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    move/from16 v19, v11

    .line 60
    .line 61
    move v11, v1

    .line 62
    move/from16 v1, v19

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_1
    add-int/lit8 v11, v1, 0x2

    .line 66
    .line 67
    aget-byte v11, v2, v11

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x3

    .line 70
    .line 71
    aget-byte v14, v2, v1

    .line 72
    .line 73
    invoke-static {v11, v14}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    add-int/lit8 v11, v1, 0x2

    .line 79
    .line 80
    aget-byte v11, v2, v11

    .line 81
    .line 82
    add-int/lit8 v14, v1, 0x3

    .line 83
    .line 84
    aget-byte v14, v2, v14

    .line 85
    .line 86
    add-int/lit8 v18, v1, 0x4

    .line 87
    .line 88
    aget-byte v12, v2, v18

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x5

    .line 91
    .line 92
    aget-byte v13, v2, v1

    .line 93
    .line 94
    invoke-static {v11, v14, v12, v13}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const/16 v12, -0x3d

    .line 100
    .line 101
    if-eq v11, v12, :cond_5

    .line 102
    .line 103
    const/16 v12, -0x3e

    .line 104
    .line 105
    if-ne v11, v12, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    if-ne v11, v5, :cond_6

    .line 109
    .line 110
    goto/16 :goto_a

    .line 111
    .line 112
    :cond_5
    :goto_2
    and-int/lit8 v11, v11, 0x1f

    .line 113
    .line 114
    shl-int/lit8 v11, v11, 0x6

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    aget-byte v12, v2, v1

    .line 119
    .line 120
    and-int/lit8 v12, v12, 0x3f

    .line 121
    .line 122
    or-int/2addr v11, v12

    .line 123
    :cond_6
    :goto_3
    const/16 v12, 0x8

    .line 124
    .line 125
    if-ge v8, v12, :cond_b

    .line 126
    .line 127
    const/16 v13, 0xff

    .line 128
    .line 129
    if-gt v11, v13, :cond_b

    .line 130
    .line 131
    if-ltz v11, :cond_b

    .line 132
    .line 133
    if-nez v8, :cond_7

    .line 134
    .line 135
    if-nez v11, :cond_7

    .line 136
    .line 137
    goto/16 :goto_9

    .line 138
    .line 139
    :cond_7
    if-eq v11, v15, :cond_9

    .line 140
    .line 141
    if-eq v11, v7, :cond_9

    .line 142
    .line 143
    if-ne v11, v6, :cond_8

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    const/16 v7, 0x41

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_9
    :goto_4
    add-int/lit8 v7, v1, 0x1

    .line 150
    .line 151
    aget-byte v7, v2, v7

    .line 152
    .line 153
    if-eq v7, v4, :cond_8

    .line 154
    .line 155
    if-eq v7, v3, :cond_8

    .line 156
    .line 157
    if-eq v7, v11, :cond_8

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :goto_5
    if-lt v11, v7, :cond_a

    .line 161
    .line 162
    const/16 v7, 0x5a

    .line 163
    .line 164
    if-gt v11, v7, :cond_a

    .line 165
    .line 166
    add-int/lit8 v11, v11, 0x20

    .line 167
    .line 168
    int-to-char v11, v11

    .line 169
    :cond_a
    packed-switch v8, :pswitch_data_0

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :pswitch_0
    int-to-byte v6, v11

    .line 174
    int-to-long v6, v6

    .line 175
    const/16 v11, 0x38

    .line 176
    .line 177
    shl-long/2addr v6, v11

    .line 178
    const-wide v11, 0xffffffffffffffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    :goto_6
    and-long/2addr v9, v11

    .line 184
    add-long/2addr v9, v6

    .line 185
    goto :goto_7

    .line 186
    :pswitch_1
    int-to-byte v6, v11

    .line 187
    int-to-long v6, v6

    .line 188
    const/16 v11, 0x30

    .line 189
    .line 190
    shl-long/2addr v6, v11

    .line 191
    const-wide v11, 0xffffffffffffL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :pswitch_2
    int-to-byte v6, v11

    .line 198
    int-to-long v6, v6

    .line 199
    const/16 v11, 0x28

    .line 200
    .line 201
    shl-long/2addr v6, v11

    .line 202
    const-wide v11, 0xffffffffffL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :pswitch_3
    int-to-byte v7, v11

    .line 209
    int-to-long v11, v7

    .line 210
    shl-long v6, v11, v6

    .line 211
    .line 212
    const-wide v11, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :pswitch_4
    int-to-byte v6, v11

    .line 219
    shl-int/lit8 v6, v6, 0x18

    .line 220
    .line 221
    int-to-long v6, v6

    .line 222
    const-wide/32 v11, 0xffffff

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :pswitch_5
    int-to-byte v6, v11

    .line 227
    shl-int/lit8 v6, v6, 0x10

    .line 228
    .line 229
    int-to-long v6, v6

    .line 230
    const-wide/32 v11, 0xffff

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :pswitch_6
    int-to-byte v6, v11

    .line 235
    shl-int/2addr v6, v12

    .line 236
    int-to-long v6, v6

    .line 237
    const-wide/16 v11, 0xff

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :pswitch_7
    int-to-byte v6, v11

    .line 241
    int-to-long v9, v6

    .line 242
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 243
    .line 244
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_b
    :goto_9
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 249
    .line 250
    move-wide/from16 v9, v16

    .line 251
    .line 252
    :cond_c
    :goto_a
    cmp-long v8, v9, v16

    .line 253
    .line 254
    if-eqz v8, :cond_d

    .line 255
    .line 256
    return-wide v9

    .line 257
    :cond_d
    iget-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 258
    .line 259
    const-wide v9, 0x100000001b3L

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    const-wide v11, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    if-eqz v8, :cond_12

    .line 270
    .line 271
    iget-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 272
    .line 273
    if-nez v8, :cond_12

    .line 274
    .line 275
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 276
    .line 277
    :goto_b
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 278
    .line 279
    if-ge v1, v5, :cond_11

    .line 280
    .line 281
    aget-byte v5, v2, v1

    .line 282
    .line 283
    const/16 v8, 0x41

    .line 284
    .line 285
    if-lt v5, v8, :cond_e

    .line 286
    .line 287
    const/16 v8, 0x5a

    .line 288
    .line 289
    if-gt v5, v8, :cond_e

    .line 290
    .line 291
    add-int/lit8 v5, v5, 0x20

    .line 292
    .line 293
    :cond_e
    if-eq v5, v15, :cond_f

    .line 294
    .line 295
    if-eq v5, v7, :cond_f

    .line 296
    .line 297
    if-ne v5, v6, :cond_10

    .line 298
    .line 299
    :cond_f
    add-int/lit8 v8, v1, 0x1

    .line 300
    .line 301
    aget-byte v8, v2, v8

    .line 302
    .line 303
    if-eq v8, v4, :cond_10

    .line 304
    .line 305
    if-eq v8, v3, :cond_10

    .line 306
    .line 307
    if-eq v8, v5, :cond_10

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_10
    int-to-long v13, v5

    .line 311
    xor-long/2addr v11, v13

    .line 312
    mul-long/2addr v11, v9

    .line 313
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_11
    return-wide v11

    .line 317
    :cond_12
    :goto_d
    aget-byte v3, v2, v1

    .line 318
    .line 319
    const/16 v4, 0x5c

    .line 320
    .line 321
    if-ne v3, v4, :cond_15

    .line 322
    .line 323
    add-int/lit8 v3, v1, 0x1

    .line 324
    .line 325
    aget-byte v8, v2, v3

    .line 326
    .line 327
    const/16 v13, 0x75

    .line 328
    .line 329
    if-eq v8, v13, :cond_14

    .line 330
    .line 331
    const/16 v14, 0x78

    .line 332
    .line 333
    if-eq v8, v14, :cond_13

    .line 334
    .line 335
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    :goto_e
    move-wide/from16 v16, v9

    .line 340
    .line 341
    goto :goto_f

    .line 342
    :cond_13
    add-int/lit8 v3, v1, 0x2

    .line 343
    .line 344
    aget-byte v3, v2, v3

    .line 345
    .line 346
    add-int/lit8 v1, v1, 0x3

    .line 347
    .line 348
    aget-byte v8, v2, v1

    .line 349
    .line 350
    invoke-static {v3, v8}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    move/from16 v16, v3

    .line 355
    .line 356
    move v3, v1

    .line 357
    move/from16 v1, v16

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_14
    const/16 v14, 0x78

    .line 361
    .line 362
    add-int/lit8 v3, v1, 0x2

    .line 363
    .line 364
    aget-byte v3, v2, v3

    .line 365
    .line 366
    add-int/lit8 v8, v1, 0x3

    .line 367
    .line 368
    aget-byte v8, v2, v8

    .line 369
    .line 370
    add-int/lit8 v16, v1, 0x4

    .line 371
    .line 372
    aget-byte v4, v2, v16

    .line 373
    .line 374
    add-int/lit8 v1, v1, 0x5

    .line 375
    .line 376
    move-wide/from16 v16, v9

    .line 377
    .line 378
    aget-byte v9, v2, v1

    .line 379
    .line 380
    invoke-static {v3, v8, v4, v9}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    move/from16 v19, v3

    .line 385
    .line 386
    move v3, v1

    .line 387
    move/from16 v1, v19

    .line 388
    .line 389
    :goto_f
    add-int/lit8 v3, v3, 0x1

    .line 390
    .line 391
    const/16 v4, 0x5a

    .line 392
    .line 393
    const/16 v8, 0x41

    .line 394
    .line 395
    goto :goto_11

    .line 396
    :cond_15
    move-wide/from16 v16, v9

    .line 397
    .line 398
    const/16 v13, 0x75

    .line 399
    .line 400
    const/16 v14, 0x78

    .line 401
    .line 402
    if-ne v3, v5, :cond_16

    .line 403
    .line 404
    return-wide v11

    .line 405
    :cond_16
    if-ltz v3, :cond_18

    .line 406
    .line 407
    const/16 v8, 0x41

    .line 408
    .line 409
    const/16 v4, 0x5a

    .line 410
    .line 411
    if-lt v3, v8, :cond_17

    .line 412
    .line 413
    if-gt v3, v4, :cond_17

    .line 414
    .line 415
    add-int/lit8 v3, v3, 0x20

    .line 416
    .line 417
    :cond_17
    add-int/lit8 v1, v1, 0x1

    .line 418
    .line 419
    :goto_10
    move/from16 v19, v3

    .line 420
    .line 421
    move v3, v1

    .line 422
    move/from16 v1, v19

    .line 423
    .line 424
    goto :goto_11

    .line 425
    :cond_18
    const/16 v4, 0x5a

    .line 426
    .line 427
    const/16 v8, 0x41

    .line 428
    .line 429
    and-int/lit16 v9, v3, 0xff

    .line 430
    .line 431
    shr-int/lit8 v9, v9, 0x4

    .line 432
    .line 433
    packed-switch v9, :pswitch_data_1

    .line 434
    .line 435
    .line 436
    const-string v2, "malformed input around byte "

    .line 437
    .line 438
    invoke-static {v1, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const-wide/16 v1, 0x0

    .line 446
    .line 447
    return-wide v1

    .line 448
    :pswitch_8
    add-int/lit8 v9, v1, 0x1

    .line 449
    .line 450
    aget-byte v9, v2, v9

    .line 451
    .line 452
    add-int/lit8 v10, v1, 0x2

    .line 453
    .line 454
    aget-byte v10, v2, v10

    .line 455
    .line 456
    and-int/lit8 v3, v3, 0xf

    .line 457
    .line 458
    shl-int/lit8 v3, v3, 0xc

    .line 459
    .line 460
    and-int/lit8 v9, v9, 0x3f

    .line 461
    .line 462
    shl-int/lit8 v9, v9, 0x6

    .line 463
    .line 464
    or-int/2addr v3, v9

    .line 465
    and-int/lit8 v9, v10, 0x3f

    .line 466
    .line 467
    or-int/2addr v3, v9

    .line 468
    add-int/lit8 v1, v1, 0x3

    .line 469
    .line 470
    goto :goto_10

    .line 471
    :pswitch_9
    add-int/lit8 v9, v1, 0x1

    .line 472
    .line 473
    aget-byte v9, v2, v9

    .line 474
    .line 475
    and-int/lit8 v3, v3, 0x1f

    .line 476
    .line 477
    shl-int/lit8 v3, v3, 0x6

    .line 478
    .line 479
    and-int/lit8 v9, v9, 0x3f

    .line 480
    .line 481
    or-int/2addr v3, v9

    .line 482
    add-int/lit8 v1, v1, 0x2

    .line 483
    .line 484
    goto :goto_10

    .line 485
    :goto_11
    if-eq v1, v15, :cond_1a

    .line 486
    .line 487
    if-eq v1, v7, :cond_1a

    .line 488
    .line 489
    if-ne v1, v6, :cond_19

    .line 490
    .line 491
    goto :goto_12

    .line 492
    :cond_19
    int-to-long v9, v1

    .line 493
    xor-long/2addr v9, v11

    .line 494
    mul-long v11, v9, v16

    .line 495
    .line 496
    :cond_1a
    :goto_12
    move v1, v3

    .line 497
    move-wide/from16 v9, v16

    .line 498
    .line 499
    goto/16 :goto_d

    .line 500
    .line 501
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

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_9
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final getRawInt()I
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 13
    .line 14
    int-to-long v5, v0

    .line 15
    add-long/2addr v3, v5

    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    sub-long/2addr v3, v5

    .line 19
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final getRawLong()J
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 13
    .line 14
    int-to-long v5, v0

    .line 15
    add-long/2addr v3, v5

    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    sub-long/2addr v3, v5

    .line 19
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0

    .line 24
    :cond_0
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    return-wide v0
.end method

.method public final getString()Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 7
    .line 8
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 9
    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 11
    .line 12
    sub-int/2addr v2, v1

    .line 13
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 14
    .line 15
    if-nez v3, :cond_2

    .line 16
    .line 17
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v3, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :cond_2
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 35
    .line 36
    new-array v2, v2, [C

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    :goto_0
    aget-byte v4, v0, v1

    .line 40
    .line 41
    if-gez v4, :cond_7

    .line 42
    .line 43
    and-int/lit16 v5, v4, 0xff

    .line 44
    .line 45
    shr-int/lit8 v6, v5, 0x4

    .line 46
    .line 47
    const-string v7, "malformed input around byte "

    .line 48
    .line 49
    const/16 v8, 0x80

    .line 50
    .line 51
    packed-switch v6, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    shr-int/lit8 v6, v4, 0x3

    .line 55
    .line 56
    const/4 v9, -0x2

    .line 57
    if-ne v6, v9, :cond_4

    .line 58
    .line 59
    add-int/lit8 v5, v1, 0x1

    .line 60
    .line 61
    aget-byte v5, v0, v5

    .line 62
    .line 63
    add-int/lit8 v6, v1, 0x2

    .line 64
    .line 65
    aget-byte v6, v0, v6

    .line 66
    .line 67
    add-int/lit8 v9, v1, 0x3

    .line 68
    .line 69
    aget-byte v9, v0, v9

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x4

    .line 72
    .line 73
    shl-int/lit8 v4, v4, 0x12

    .line 74
    .line 75
    shl-int/lit8 v10, v5, 0xc

    .line 76
    .line 77
    xor-int/2addr v4, v10

    .line 78
    shl-int/lit8 v10, v6, 0x6

    .line 79
    .line 80
    xor-int/2addr v4, v10

    .line 81
    const v10, 0x381f80

    .line 82
    .line 83
    .line 84
    xor-int/2addr v10, v9

    .line 85
    xor-int/2addr v4, v10

    .line 86
    and-int/lit16 v5, v5, 0xc0

    .line 87
    .line 88
    if-ne v5, v8, :cond_3

    .line 89
    .line 90
    and-int/lit16 v5, v6, 0xc0

    .line 91
    .line 92
    if-ne v5, v8, :cond_3

    .line 93
    .line 94
    and-int/lit16 v5, v9, 0xc0

    .line 95
    .line 96
    if-ne v5, v8, :cond_3

    .line 97
    .line 98
    const/high16 v5, 0x10000

    .line 99
    .line 100
    if-lt v4, v5, :cond_3

    .line 101
    .line 102
    const/high16 v5, 0x110000

    .line 103
    .line 104
    if-ge v4, v5, :cond_3

    .line 105
    .line 106
    add-int/lit8 v5, v3, 0x1

    .line 107
    .line 108
    ushr-int/lit8 v6, v4, 0xa

    .line 109
    .line 110
    const v7, 0xd7c0

    .line 111
    .line 112
    .line 113
    add-int/2addr v6, v7

    .line 114
    int-to-char v6, v6

    .line 115
    aput-char v6, v2, v3

    .line 116
    .line 117
    and-int/lit16 v3, v4, 0x3ff

    .line 118
    .line 119
    const v4, 0xdc00

    .line 120
    .line 121
    .line 122
    add-int/2addr v3, v4

    .line 123
    int-to-char v3, v3

    .line 124
    aput-char v3, v2, v5

    .line 125
    .line 126
    move v3, v5

    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_3
    invoke-static {v1, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    return-object v0

    .line 138
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_0
    add-int/lit8 v5, v1, 0x1

    .line 142
    .line 143
    aget-byte v5, v0, v5

    .line 144
    .line 145
    add-int/lit8 v6, v1, 0x2

    .line 146
    .line 147
    aget-byte v9, v0, v6

    .line 148
    .line 149
    and-int/lit16 v10, v5, 0xc0

    .line 150
    .line 151
    if-ne v10, v8, :cond_5

    .line 152
    .line 153
    and-int/lit16 v10, v9, 0xc0

    .line 154
    .line 155
    if-ne v10, v8, :cond_5

    .line 156
    .line 157
    and-int/lit8 v4, v4, 0xf

    .line 158
    .line 159
    shl-int/lit8 v4, v4, 0xc

    .line 160
    .line 161
    and-int/lit8 v5, v5, 0x3f

    .line 162
    .line 163
    shl-int/lit8 v5, v5, 0x6

    .line 164
    .line 165
    or-int/2addr v4, v5

    .line 166
    and-int/lit8 v5, v9, 0x3f

    .line 167
    .line 168
    or-int/2addr v5, v4

    .line 169
    add-int/lit8 v1, v1, 0x3

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_5
    invoke-static {v6, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    return-object v0

    .line 181
    :pswitch_1
    add-int/lit8 v5, v1, 0x1

    .line 182
    .line 183
    aget-byte v5, v0, v5

    .line 184
    .line 185
    and-int/lit16 v6, v5, 0xc0

    .line 186
    .line 187
    if-ne v6, v8, :cond_6

    .line 188
    .line 189
    and-int/lit8 v4, v4, 0x1f

    .line 190
    .line 191
    shl-int/lit8 v4, v4, 0x6

    .line 192
    .line 193
    and-int/lit8 v5, v5, 0x3f

    .line 194
    .line 195
    or-int/2addr v5, v4

    .line 196
    add-int/lit8 v1, v1, 0x2

    .line 197
    .line 198
    :goto_1
    int-to-char v4, v5

    .line 199
    aput-char v4, v2, v3

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    invoke-static {v1, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    return-object v0

    .line 211
    :cond_7
    const/16 v5, 0x22

    .line 212
    .line 213
    const/16 v6, 0x5c

    .line 214
    .line 215
    if-ne v4, v6, :cond_b

    .line 216
    .line 217
    add-int/lit8 v4, v1, 0x1

    .line 218
    .line 219
    aget-byte v7, v0, v4

    .line 220
    .line 221
    int-to-char v7, v7

    .line 222
    if-eq v7, v5, :cond_a

    .line 223
    .line 224
    if-eq v7, v6, :cond_a

    .line 225
    .line 226
    const/16 v5, 0x75

    .line 227
    .line 228
    if-eq v7, v5, :cond_9

    .line 229
    .line 230
    const/16 v5, 0x78

    .line 231
    .line 232
    if-eq v7, v5, :cond_8

    .line 233
    .line 234
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    move v11, v4

    .line 239
    move v4, v1

    .line 240
    move v1, v11

    .line 241
    goto :goto_2

    .line 242
    :cond_8
    add-int/lit8 v4, v1, 0x2

    .line 243
    .line 244
    aget-byte v4, v0, v4

    .line 245
    .line 246
    add-int/lit8 v1, v1, 0x3

    .line 247
    .line 248
    aget-byte v5, v0, v1

    .line 249
    .line 250
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    goto :goto_2

    .line 255
    :cond_9
    add-int/lit8 v4, v1, 0x2

    .line 256
    .line 257
    aget-byte v4, v0, v4

    .line 258
    .line 259
    add-int/lit8 v5, v1, 0x3

    .line 260
    .line 261
    aget-byte v5, v0, v5

    .line 262
    .line 263
    add-int/lit8 v6, v1, 0x4

    .line 264
    .line 265
    aget-byte v6, v0, v6

    .line 266
    .line 267
    add-int/lit8 v1, v1, 0x5

    .line 268
    .line 269
    aget-byte v7, v0, v1

    .line 270
    .line 271
    invoke-static {v4, v5, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    goto :goto_2

    .line 276
    :cond_a
    move v1, v4

    .line 277
    move v4, v7

    .line 278
    goto :goto_2

    .line 279
    :cond_b
    if-ne v4, v5, :cond_c

    .line 280
    .line 281
    new-instance v0, Ljava/lang/String;

    .line 282
    .line 283
    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    .line 284
    .line 285
    .line 286
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_c
    :goto_2
    int-to-char v4, v4

    .line 290
    aput-char v4, v2, v3

    .line 291
    .line 292
    add-int/lit8 v1, v1, 0x1

    .line 293
    .line 294
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    nop

    .line 299
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getStringLength()I
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 22
    .line 23
    add-int/lit8 v3, v1, 0x8

    .line 24
    .line 25
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    array-length v4, v2

    .line 30
    if-ge v3, v4, :cond_2

    .line 31
    .line 32
    aget-byte v4, v2, v1

    .line 33
    .line 34
    if-eq v4, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 v4, v1, 0x1

    .line 37
    .line 38
    aget-byte v4, v2, v4

    .line 39
    .line 40
    if-eq v4, v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v4, v1, 0x2

    .line 43
    .line 44
    aget-byte v4, v2, v4

    .line 45
    .line 46
    if-eq v4, v0, :cond_2

    .line 47
    .line 48
    add-int/lit8 v4, v1, 0x3

    .line 49
    .line 50
    aget-byte v4, v2, v4

    .line 51
    .line 52
    if-eq v4, v0, :cond_2

    .line 53
    .line 54
    add-int/lit8 v4, v1, 0x4

    .line 55
    .line 56
    aget-byte v4, v2, v4

    .line 57
    .line 58
    if-eq v4, v0, :cond_2

    .line 59
    .line 60
    add-int/lit8 v4, v1, 0x5

    .line 61
    .line 62
    aget-byte v4, v2, v4

    .line 63
    .line 64
    if-eq v4, v0, :cond_2

    .line 65
    .line 66
    add-int/lit8 v4, v1, 0x6

    .line 67
    .line 68
    aget-byte v4, v2, v4

    .line 69
    .line 70
    if-eq v4, v0, :cond_2

    .line 71
    .line 72
    add-int/lit8 v4, v1, 0x7

    .line 73
    .line 74
    aget-byte v4, v2, v4

    .line 75
    .line 76
    if-eq v4, v0, :cond_2

    .line 77
    .line 78
    const/16 v1, 0x8

    .line 79
    .line 80
    move v5, v3

    .line 81
    move v3, v1

    .line 82
    move v1, v5

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/4 v3, 0x0

    .line 85
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 86
    .line 87
    if-ge v1, v4, :cond_4

    .line 88
    .line 89
    aget-byte v4, v2, v1

    .line 90
    .line 91
    if-ne v4, v0, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_2
    return v3
.end method

.method public final info(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    const/16 v5, 0xa

    .line 8
    .line 9
    if-ge v1, v4, :cond_1

    .line 10
    .line 11
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 12
    .line 13
    if-ge v1, v4, :cond_1

    .line 14
    .line 15
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 16
    .line 17
    aget-byte v4, v4, v1

    .line 18
    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    move v2, v0

    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    add-int/2addr v2, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ", "

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_2
    const-string p1, "offset "

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, ", character "

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, ", line "

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p1, ", column "

    .line 78
    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p1, ", fastjson-version 2.0.60"

    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    if-le v3, v0, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/16 v5, 0x20

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    new-instance p1, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 101
    .line 102
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->start:I

    .line 103
    .line 104
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->length:I

    .line 105
    .line 106
    const v4, 0xffff

    .line 107
    .line 108
    .line 109
    if-ge v3, v4, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move v3, v4

    .line 113
    :goto_2
    invoke-direct {p1, v0, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method

.method public final isArray()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x5b

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final isNull()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 14
    .line 15
    aget-byte v0, v1, v0

    .line 16
    .line 17
    const/16 v1, 0x75

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final isReference()Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    const-wide v2, 0x200000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 20
    .line 21
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 22
    .line 23
    const/16 v5, 0x7b

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 31
    .line 32
    if-ne v4, v5, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    aget-byte v6, v0, v4

    .line 36
    .line 37
    :goto_0
    const/16 v7, 0x20

    .line 38
    .line 39
    const-wide/16 v8, 0x1

    .line 40
    .line 41
    if-gt v6, v7, :cond_4

    .line 42
    .line 43
    shl-long v10, v8, v6

    .line 44
    .line 45
    const-wide v12, 0x100003701L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v10, v12

    .line 51
    cmp-long v7, v10, v2

    .line 52
    .line 53
    if-eqz v7, :cond_4

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    if-lt v4, v5, :cond_3

    .line 58
    .line 59
    return v1

    .line 60
    :cond_3
    aget-byte v6, v0, v4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    add-int/lit8 v2, v4, 0x6

    .line 64
    .line 65
    if-ge v2, v5, :cond_6

    .line 66
    .line 67
    add-int/lit8 v2, v4, 0x5

    .line 68
    .line 69
    aget-byte v2, v0, v2

    .line 70
    .line 71
    if-ne v2, v6, :cond_6

    .line 72
    .line 73
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 74
    .line 75
    sget-wide v10, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 76
    .line 77
    int-to-long v12, v4

    .line 78
    add-long/2addr v10, v12

    .line 79
    add-long/2addr v10, v8

    .line 80
    invoke-virtual {v2, v0, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    sget v3, Lcom/alibaba/fastjson2/JSONReaderUTF8;->REF:I

    .line 85
    .line 86
    if-eq v2, v3, :cond_5

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-direct {p0, v0, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->isReference0([BIII)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    return v0

    .line 94
    :cond_6
    :goto_1
    return v1
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
    const/16 v4, 0x20

    .line 19
    .line 20
    if-gt v1, v4, :cond_2

    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    shl-long/2addr v4, v1

    .line 25
    const-wide v6, 0x100003701L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v4, v4, v6

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 38
    .line 39
    if-ne v2, v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v1, v2, 0x1

    .line 43
    .line 44
    aget-byte v2, v0, v2

    .line 45
    .line 46
    move v8, v2

    .line 47
    move v2, v1

    .line 48
    move v1, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-gez v1, :cond_3

    .line 51
    .line 52
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 57
    .line 58
    int-to-char v0, v1

    .line 59
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 60
    .line 61
    const/16 v0, 0x2f

    .line 62
    .line 63
    if-ne v1, v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method public nextIfArrayEnd()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x5d

    .line 10
    .line 11
    if-eq v1, v4, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    return v1

    .line 15
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 16
    .line 17
    const/16 v4, 0x1a

    .line 18
    .line 19
    if-ne v3, v1, :cond_1

    .line 20
    .line 21
    move v1, v3

    .line 22
    :goto_0
    move v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v1, v3, 0x1

    .line 25
    .line 26
    aget-byte v3, v2, v3

    .line 27
    .line 28
    :goto_1
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    const-wide v7, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v9, 0x1

    .line 36
    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    if-gt v3, v11, :cond_3

    .line 40
    .line 41
    shl-long v12, v9, v3

    .line 42
    .line 43
    and-long/2addr v12, v7

    .line 44
    cmp-long v12, v12, v5

    .line 45
    .line 46
    if-eqz v12, :cond_3

    .line 47
    .line 48
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 49
    .line 50
    if-ne v1, v3, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 54
    .line 55
    aget-byte v1, v2, v1

    .line 56
    .line 57
    move/from16 v16, v3

    .line 58
    .line 59
    move v3, v1

    .line 60
    move/from16 v1, v16

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/16 v12, 0x2c

    .line 64
    .line 65
    const/4 v13, 0x1

    .line 66
    if-ne v3, v12, :cond_6

    .line 67
    .line 68
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 69
    .line 70
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 71
    .line 72
    if-ne v1, v3, :cond_4

    .line 73
    .line 74
    move v3, v1

    .line 75
    move v1, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-int/lit8 v3, v1, 0x1

    .line 78
    .line 79
    aget-byte v1, v2, v1

    .line 80
    .line 81
    :goto_2
    move/from16 v16, v3

    .line 82
    .line 83
    move v3, v1

    .line 84
    move/from16 v1, v16

    .line 85
    .line 86
    :goto_3
    if-gt v3, v11, :cond_6

    .line 87
    .line 88
    shl-long v14, v9, v3

    .line 89
    .line 90
    and-long/2addr v14, v7

    .line 91
    cmp-long v12, v14, v5

    .line 92
    .line 93
    if-eqz v12, :cond_6

    .line 94
    .line 95
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 96
    .line 97
    if-ne v1, v3, :cond_5

    .line 98
    .line 99
    move v3, v4

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    add-int/lit8 v3, v1, 0x1

    .line 102
    .line 103
    aget-byte v1, v2, v1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    if-gez v3, :cond_7

    .line 107
    .line 108
    invoke-direct {v0, v3, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 109
    .line 110
    .line 111
    return v13

    .line 112
    :cond_7
    int-to-char v2, v3

    .line 113
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    const/16 v1, 0x2f

    .line 118
    .line 119
    if-ne v3, v1, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 122
    .line 123
    .line 124
    :cond_8
    return v13
.end method

.method public nextIfArrayStart()Z
    .locals 9

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x5b

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
    const/16 v4, 0x20

    .line 27
    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    const-wide/16 v4, 0x1

    .line 31
    .line 32
    shl-long/2addr v4, v1

    .line 33
    const-wide v6, 0x100003701L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 46
    .line 47
    if-ne v2, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    add-int/lit8 v1, v2, 0x1

    .line 51
    .line 52
    aget-byte v2, v0, v2

    .line 53
    .line 54
    move v8, v2

    .line 55
    move v2, v1

    .line 56
    move v1, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v0, 0x1

    .line 59
    if-gez v1, :cond_4

    .line 60
    .line 61
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 62
    .line 63
    .line 64
    return v0

    .line 65
    :cond_4
    int-to-char v3, v1

    .line 66
    iput-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 67
    .line 68
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    const/16 v2, 0x2f

    .line 71
    .line 72
    if-ne v1, v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 75
    .line 76
    .line 77
    :cond_5
    return v0
.end method

.method public nextIfComma()Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/16 v10, 0x1a

    .line 19
    .line 20
    if-gt v2, v9, :cond_1

    .line 21
    .line 22
    shl-long v11, v7, v2

    .line 23
    .line 24
    and-long/2addr v11, v5

    .line 25
    cmp-long v11, v11, v3

    .line 26
    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    move v2, v10

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    aget-byte v1, v0, v1

    .line 38
    .line 39
    move v13, v2

    .line 40
    move v2, v1

    .line 41
    move v1, v13

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v11, 0x2c

    .line 44
    .line 45
    if-eq v2, v11, :cond_2

    .line 46
    .line 47
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 48
    .line 49
    int-to-char v0, v2

    .line 50
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    return v0

    .line 54
    :cond_2
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 55
    .line 56
    if-ne v1, v2, :cond_3

    .line 57
    .line 58
    move v2, v1

    .line 59
    :goto_1
    move v1, v10

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 62
    .line 63
    aget-byte v1, v0, v1

    .line 64
    .line 65
    :goto_2
    if-gt v1, v9, :cond_5

    .line 66
    .line 67
    shl-long v11, v7, v1

    .line 68
    .line 69
    and-long/2addr v11, v5

    .line 70
    cmp-long v11, v11, v3

    .line 71
    .line 72
    if-eqz v11, :cond_5

    .line 73
    .line 74
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 75
    .line 76
    if-ne v2, v1, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    add-int/lit8 v1, v2, 0x1

    .line 80
    .line 81
    aget-byte v2, v0, v2

    .line 82
    .line 83
    move v13, v2

    .line 84
    move v2, v1

    .line 85
    move v1, v13

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const/4 v0, 0x1

    .line 88
    if-gez v1, :cond_6

    .line 89
    .line 90
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 91
    .line 92
    .line 93
    return v0

    .line 94
    :cond_6
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 95
    .line 96
    int-to-char v2, v1

    .line 97
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 98
    .line 99
    const/16 v2, 0x2f

    .line 100
    .line 101
    if-ne v1, v2, :cond_7

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 104
    .line 105
    .line 106
    :cond_7
    return v0
.end method

.method public final nextIfInfinity()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x49

    .line 8
    .line 9
    if-ne v2, v3, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x6

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 14
    .line 15
    if-ge v2, v3, :cond_3

    .line 16
    .line 17
    aget-byte v4, v0, v1

    .line 18
    .line 19
    const/16 v5, 0x6e

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    add-int/lit8 v4, v1, 0x1

    .line 24
    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v6, 0x66

    .line 28
    .line 29
    if-ne v4, v6, :cond_3

    .line 30
    .line 31
    add-int/lit8 v4, v1, 0x2

    .line 32
    .line 33
    aget-byte v4, v0, v4

    .line 34
    .line 35
    const/16 v6, 0x69

    .line 36
    .line 37
    if-ne v4, v6, :cond_3

    .line 38
    .line 39
    add-int/lit8 v4, v1, 0x3

    .line 40
    .line 41
    aget-byte v4, v0, v4

    .line 42
    .line 43
    if-ne v4, v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v4, v1, 0x4

    .line 46
    .line 47
    aget-byte v4, v0, v4

    .line 48
    .line 49
    if-ne v4, v6, :cond_3

    .line 50
    .line 51
    add-int/lit8 v4, v1, 0x5

    .line 52
    .line 53
    aget-byte v4, v0, v4

    .line 54
    .line 55
    const/16 v5, 0x74

    .line 56
    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    aget-byte v2, v0, v2

    .line 60
    .line 61
    const/16 v4, 0x79

    .line 62
    .line 63
    if-ne v2, v4, :cond_3

    .line 64
    .line 65
    add-int/lit8 v2, v1, 0x7

    .line 66
    .line 67
    const/16 v4, 0x1a

    .line 68
    .line 69
    if-ne v2, v3, :cond_0

    .line 70
    .line 71
    move v1, v2

    .line 72
    :goto_0
    move v2, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 75
    .line 76
    aget-byte v2, v0, v2

    .line 77
    .line 78
    :goto_1
    const/16 v3, 0x20

    .line 79
    .line 80
    if-gt v2, v3, :cond_2

    .line 81
    .line 82
    const-wide/16 v5, 0x1

    .line 83
    .line 84
    shl-long/2addr v5, v2

    .line 85
    const-wide v7, 0x100003701L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v5, v7

    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    cmp-long v3, v5, v7

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 98
    .line 99
    if-ne v1, v2, :cond_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 103
    .line 104
    aget-byte v1, v0, v1

    .line 105
    .line 106
    move v9, v2

    .line 107
    move v2, v1

    .line 108
    move v1, v9

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    int-to-char v0, v2

    .line 113
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    const/4 v0, 0x1

    .line 116
    return v0

    .line 117
    :cond_3
    const/4 v0, 0x0

    .line 118
    return v0
.end method

.method public nextIfMatch(C)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/16 v10, 0x1a

    .line 19
    .line 20
    if-gt v2, v9, :cond_1

    .line 21
    .line 22
    shl-long v11, v7, v2

    .line 23
    .line 24
    and-long/2addr v11, v5

    .line 25
    cmp-long v11, v11, v3

    .line 26
    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    move v2, v10

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    aget-byte v1, v0, v1

    .line 38
    .line 39
    move v13, v2

    .line 40
    move v2, v1

    .line 41
    move v1, v13

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-eq v2, p1, :cond_2

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_2
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 48
    .line 49
    if-ne v1, p1, :cond_3

    .line 50
    .line 51
    move p1, v1

    .line 52
    :goto_1
    move v1, v10

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    add-int/lit8 p1, v1, 0x1

    .line 55
    .line 56
    aget-byte v1, v0, v1

    .line 57
    .line 58
    :goto_2
    if-gt v1, v9, :cond_5

    .line 59
    .line 60
    shl-long v11, v7, v1

    .line 61
    .line 62
    and-long/2addr v11, v5

    .line 63
    cmp-long v2, v11, v3

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 68
    .line 69
    if-ne p1, v1, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    add-int/lit8 v1, p1, 0x1

    .line 73
    .line 74
    aget-byte p1, v0, p1

    .line 75
    .line 76
    move v13, v1

    .line 77
    move v1, p1

    .line 78
    move p1, v13

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    const/4 v0, 0x1

    .line 81
    if-gez v1, :cond_6

    .line 82
    .line 83
    invoke-direct {p0, v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 84
    .line 85
    .line 86
    return v0

    .line 87
    :cond_6
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    int-to-char p1, v1

    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/16 p1, 0x2f

    .line 93
    .line 94
    if-ne v1, p1, :cond_7

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 97
    .line 98
    .line 99
    :cond_7
    return v0
.end method

.method public final nextIfMatchIdent(CCC)Z
    .locals 7

    .line 147
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 148
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 149
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x2

    .line 150
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-gt v2, v3, :cond_6

    aget-byte v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p1, p2

    if-eq p2, p3, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x3

    .line 151
    aget-byte p3, p1, v2

    move v2, v0

    :goto_1
    const/16 v0, 0x20

    if-gt p3, v0, :cond_4

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p3

    const-wide v5, 0x100003701L

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-eqz v0, :cond_4

    .line 152
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-byte v0, p1, v2

    move v2, p3

    move p3, v0

    goto :goto_1

    .line 153
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x3

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 154
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    int-to-char p1, p3

    .line 155
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public final nextIfMatchIdent(CCCC)Z
    .locals 7

    .line 129
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 130
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 131
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x3

    .line 132
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-gt v2, v3, :cond_6

    aget-byte v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p1, p2

    if-ne p2, p3, :cond_6

    add-int/lit8 p2, v0, 0x2

    aget-byte p2, p1, p2

    if-eq p2, p4, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x4

    .line 133
    aget-byte p3, p1, v2

    move v2, v0

    :goto_1
    const/16 p4, 0x20

    if-gt p3, p4, :cond_4

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p3

    const-wide v5, 0x100003701L

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p4, v3, v5

    if-eqz p4, :cond_4

    .line 134
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-byte p4, p1, v2

    move v2, p3

    move p3, p4

    goto :goto_1

    .line 135
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x4

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 136
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    int-to-char p1, p3

    .line 137
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public final nextIfMatchIdent(CCCCC)Z
    .locals 5

    .line 138
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 139
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 140
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x4

    .line 141
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-gt v2, v3, :cond_6

    aget-byte v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p1, p2

    if-ne p2, p3, :cond_6

    add-int/lit8 p2, v0, 0x2

    aget-byte p2, p1, p2

    if-ne p2, p4, :cond_6

    add-int/lit8 p2, v0, 0x3

    aget-byte p2, p1, p2

    if-eq p2, p5, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x5

    .line 142
    aget-byte p3, p1, v2

    move v2, v0

    :goto_1
    const/16 p4, 0x20

    if-gt p3, p4, :cond_4

    const-wide/16 p4, 0x1

    shl-long/2addr p4, p3

    const-wide v3, 0x100003701L

    and-long/2addr p4, v3

    const-wide/16 v3, 0x0

    cmp-long p4, p4, v3

    if-eqz p4, :cond_4

    .line 143
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-byte p4, p1, v2

    move v2, p3

    move p3, p4

    goto :goto_1

    .line 144
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x5

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 145
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    int-to-char p1, p3

    .line 146
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public final nextIfMatchIdent(CCCCCC)Z
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x5

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 14
    .line 15
    if-gt v2, v3, :cond_6

    .line 16
    .line 17
    aget-byte v4, p1, v0

    .line 18
    .line 19
    if-ne v4, p2, :cond_6

    .line 20
    .line 21
    add-int/lit8 p2, v0, 0x1

    .line 22
    .line 23
    aget-byte p2, p1, p2

    .line 24
    .line 25
    if-ne p2, p3, :cond_6

    .line 26
    .line 27
    add-int/lit8 p2, v0, 0x2

    .line 28
    .line 29
    aget-byte p2, p1, p2

    .line 30
    .line 31
    if-ne p2, p4, :cond_6

    .line 32
    .line 33
    add-int/lit8 p2, v0, 0x3

    .line 34
    .line 35
    aget-byte p2, p1, p2

    .line 36
    .line 37
    if-ne p2, p5, :cond_6

    .line 38
    .line 39
    add-int/lit8 p2, v0, 0x4

    .line 40
    .line 41
    aget-byte p2, p1, p2

    .line 42
    .line 43
    if-eq p2, p6, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const/16 p2, 0x1a

    .line 47
    .line 48
    if-ne v2, v3, :cond_2

    .line 49
    .line 50
    :goto_0
    move p3, p2

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x6

    .line 53
    .line 54
    aget-byte p3, p1, v2

    .line 55
    .line 56
    move v2, v0

    .line 57
    :goto_1
    const/16 p4, 0x20

    .line 58
    .line 59
    if-gt p3, p4, :cond_4

    .line 60
    .line 61
    const-wide/16 p4, 0x1

    .line 62
    .line 63
    shl-long/2addr p4, p3

    .line 64
    const-wide v3, 0x100003701L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr p4, v3

    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    cmp-long p4, p4, v3

    .line 73
    .line 74
    if-eqz p4, :cond_4

    .line 75
    .line 76
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 77
    .line 78
    if-ne v2, p3, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    add-int/lit8 p3, v2, 0x1

    .line 82
    .line 83
    aget-byte p4, p1, v2

    .line 84
    .line 85
    move v2, p3

    .line 86
    move p3, p4

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x6

    .line 91
    .line 92
    if-ne v2, p1, :cond_5

    .line 93
    .line 94
    if-eq p3, p2, :cond_5

    .line 95
    .line 96
    const/16 p1, 0x28

    .line 97
    .line 98
    if-eq p3, p1, :cond_5

    .line 99
    .line 100
    const/16 p1, 0x5b

    .line 101
    .line 102
    if-eq p3, p1, :cond_5

    .line 103
    .line 104
    const/16 p1, 0x5d

    .line 105
    .line 106
    if-eq p3, p1, :cond_5

    .line 107
    .line 108
    const/16 p1, 0x29

    .line 109
    .line 110
    if-eq p3, p1, :cond_5

    .line 111
    .line 112
    const/16 p1, 0x3a

    .line 113
    .line 114
    if-eq p3, p1, :cond_5

    .line 115
    .line 116
    const/16 p1, 0x2c

    .line 117
    .line 118
    if-eq p3, p1, :cond_5

    .line 119
    .line 120
    return v1

    .line 121
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    int-to-char p1, p3

    .line 124
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 125
    .line 126
    const/4 p1, 0x1

    .line 127
    return p1

    .line 128
    :cond_6
    :goto_2
    return v1
.end method

.method public final nextIfName4Match10(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xc

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x9

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    add-int/lit8 p1, v1, 0xb

    .line 31
    .line 32
    aget-byte p1, v0, p1

    .line 33
    .line 34
    const/16 p2, 0x3a

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v1, v1, 0xd

    .line 40
    .line 41
    aget-byte p1, v0, v2

    .line 42
    .line 43
    and-int/lit16 p1, p1, 0xff

    .line 44
    .line 45
    :goto_0
    const/16 p2, 0x20

    .line 46
    .line 47
    if-gt p1, p2, :cond_2

    .line 48
    .line 49
    const-wide/16 v2, 0x1

    .line 50
    .line 51
    shl-long/2addr v2, p1

    .line 52
    const-wide v4, 0x100003701L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v2, v4

    .line 58
    const-wide/16 v4, 0x0

    .line 59
    .line 60
    cmp-long p2, v2, v4

    .line 61
    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    add-int/lit8 p1, v1, 0x1

    .line 65
    .line 66
    aget-byte p2, v0, v1

    .line 67
    .line 68
    and-int/lit16 p2, p2, 0xff

    .line 69
    .line 70
    move v1, p1

    .line 71
    move p1, p2

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 74
    .line 75
    int-to-char p1, p1

    .line 76
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match11(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xd

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0xa

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    add-int/lit8 p1, v1, 0xb

    .line 31
    .line 32
    aget-byte p1, v0, p1

    .line 33
    .line 34
    const/16 p2, 0x22

    .line 35
    .line 36
    if-ne p1, p2, :cond_3

    .line 37
    .line 38
    add-int/lit8 p1, v1, 0xc

    .line 39
    .line 40
    aget-byte p1, v0, p1

    .line 41
    .line 42
    const/16 p2, 0x3a

    .line 43
    .line 44
    if-eq p1, p2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v1, v1, 0xe

    .line 48
    .line 49
    aget-byte p1, v0, v2

    .line 50
    .line 51
    and-int/lit16 p1, p1, 0xff

    .line 52
    .line 53
    :goto_0
    const/16 p2, 0x20

    .line 54
    .line 55
    if-gt p1, p2, :cond_2

    .line 56
    .line 57
    const-wide/16 v2, 0x1

    .line 58
    .line 59
    shl-long/2addr v2, p1

    .line 60
    const-wide v4, 0x100003701L

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v2, v4

    .line 66
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    cmp-long p2, v2, v4

    .line 69
    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    add-int/lit8 p1, v1, 0x1

    .line 73
    .line 74
    aget-byte p2, v0, v1

    .line 75
    .line 76
    and-int/lit16 p2, p2, 0xff

    .line 77
    .line 78
    move v1, p1

    .line 79
    move p1, p2

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    int-to-char p1, p1

    .line 84
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    return p1

    .line 88
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match12(JB)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xe

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0xb

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    add-int/lit8 p1, v1, 0xb

    .line 31
    .line 32
    aget-byte p1, v0, p1

    .line 33
    .line 34
    if-ne p1, p3, :cond_3

    .line 35
    .line 36
    add-int/lit8 p1, v1, 0xc

    .line 37
    .line 38
    aget-byte p1, v0, p1

    .line 39
    .line 40
    const/16 p2, 0x22

    .line 41
    .line 42
    if-ne p1, p2, :cond_3

    .line 43
    .line 44
    add-int/lit8 p1, v1, 0xd

    .line 45
    .line 46
    aget-byte p1, v0, p1

    .line 47
    .line 48
    const/16 p2, 0x3a

    .line 49
    .line 50
    if-eq p1, p2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v1, v1, 0xf

    .line 54
    .line 55
    aget-byte p1, v0, v2

    .line 56
    .line 57
    and-int/lit16 p1, p1, 0xff

    .line 58
    .line 59
    :goto_0
    const/16 p2, 0x20

    .line 60
    .line 61
    if-gt p1, p2, :cond_2

    .line 62
    .line 63
    const-wide/16 p2, 0x1

    .line 64
    .line 65
    shl-long/2addr p2, p1

    .line 66
    const-wide v2, 0x100003701L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr p2, v2

    .line 72
    const-wide/16 v2, 0x0

    .line 73
    .line 74
    cmp-long p2, p2, v2

    .line 75
    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    add-int/lit8 p1, v1, 0x1

    .line 79
    .line 80
    aget-byte p2, v0, v1

    .line 81
    .line 82
    and-int/lit16 p2, p2, 0xff

    .line 83
    .line 84
    move v1, p1

    .line 85
    move p1, p2

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    int-to-char p1, p1

    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    return p1

    .line 94
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match13(JI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xf

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0xc

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x4

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move/from16 v5, p3

    .line 40
    .line 41
    if-eq v3, v5, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x10

    .line 45
    .line 46
    aget-byte v2, v0, v2

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0xff

    .line 49
    .line 50
    :goto_0
    const/16 v3, 0x20

    .line 51
    .line 52
    if-gt v2, v3, :cond_2

    .line 53
    .line 54
    const-wide/16 v3, 0x1

    .line 55
    .line 56
    shl-long/2addr v3, v2

    .line 57
    const-wide v5, 0x100003701L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v3, v5

    .line 63
    const-wide/16 v5, 0x0

    .line 64
    .line 65
    cmp-long v3, v3, v5

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    add-int/lit8 v2, v1, 0x1

    .line 70
    .line 71
    aget-byte v1, v0, v1

    .line 72
    .line 73
    and-int/lit16 v1, v1, 0xff

    .line 74
    .line 75
    move v13, v2

    .line 76
    move v2, v1

    .line 77
    move v1, v13

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 80
    .line 81
    int-to-char v0, v2

    .line 82
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    return v0

    .line 86
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match14(JI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x10

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0xd

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x5

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move/from16 v5, p3

    .line 40
    .line 41
    if-ne v3, v5, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0xf

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    const/16 v5, 0x3a

    .line 48
    .line 49
    if-eq v3, v5, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x11

    .line 53
    .line 54
    aget-byte v2, v0, v2

    .line 55
    .line 56
    and-int/lit16 v2, v2, 0xff

    .line 57
    .line 58
    :goto_0
    const/16 v3, 0x20

    .line 59
    .line 60
    if-gt v2, v3, :cond_2

    .line 61
    .line 62
    const-wide/16 v3, 0x1

    .line 63
    .line 64
    shl-long/2addr v3, v2

    .line 65
    const-wide v5, 0x100003701L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v3, v5

    .line 71
    const-wide/16 v5, 0x0

    .line 72
    .line 73
    cmp-long v3, v3, v5

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    add-int/lit8 v2, v1, 0x1

    .line 78
    .line 79
    aget-byte v1, v0, v1

    .line 80
    .line 81
    and-int/lit16 v1, v1, 0xff

    .line 82
    .line 83
    move v13, v2

    .line 84
    move v2, v1

    .line 85
    move v1, v13

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    int-to-char v0, v2

    .line 90
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    return v0

    .line 94
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match15(JI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x11

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0xe

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x6

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move/from16 v5, p3

    .line 40
    .line 41
    if-ne v3, v5, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0xf

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    const/16 v5, 0x22

    .line 48
    .line 49
    if-ne v3, v5, :cond_3

    .line 50
    .line 51
    add-int/lit8 v3, v1, 0x10

    .line 52
    .line 53
    aget-byte v3, v0, v3

    .line 54
    .line 55
    const/16 v5, 0x3a

    .line 56
    .line 57
    if-eq v3, v5, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x12

    .line 61
    .line 62
    aget-byte v2, v0, v2

    .line 63
    .line 64
    and-int/lit16 v2, v2, 0xff

    .line 65
    .line 66
    :goto_0
    const/16 v3, 0x20

    .line 67
    .line 68
    if-gt v2, v3, :cond_2

    .line 69
    .line 70
    const-wide/16 v3, 0x1

    .line 71
    .line 72
    shl-long/2addr v3, v2

    .line 73
    const-wide v5, 0x100003701L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v3, v5

    .line 79
    const-wide/16 v5, 0x0

    .line 80
    .line 81
    cmp-long v3, v3, v5

    .line 82
    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    add-int/lit8 v2, v1, 0x1

    .line 86
    .line 87
    aget-byte v1, v0, v1

    .line 88
    .line 89
    and-int/lit16 v1, v1, 0xff

    .line 90
    .line 91
    move v13, v2

    .line 92
    move v2, v1

    .line 93
    move v1, v13

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    int-to-char v0, v2

    .line 98
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    return v0

    .line 102
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match16(JIB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x12

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0xf

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x7

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move/from16 v5, p3

    .line 40
    .line 41
    if-ne v3, v5, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0xf

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    move/from16 v5, p4

    .line 48
    .line 49
    if-ne v3, v5, :cond_3

    .line 50
    .line 51
    add-int/lit8 v3, v1, 0x10

    .line 52
    .line 53
    aget-byte v3, v0, v3

    .line 54
    .line 55
    const/16 v5, 0x22

    .line 56
    .line 57
    if-ne v3, v5, :cond_3

    .line 58
    .line 59
    add-int/lit8 v3, v1, 0x11

    .line 60
    .line 61
    aget-byte v3, v0, v3

    .line 62
    .line 63
    const/16 v5, 0x3a

    .line 64
    .line 65
    if-eq v3, v5, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v1, v1, 0x13

    .line 69
    .line 70
    aget-byte v2, v0, v2

    .line 71
    .line 72
    and-int/lit16 v2, v2, 0xff

    .line 73
    .line 74
    :goto_0
    const/16 v3, 0x20

    .line 75
    .line 76
    if-gt v2, v3, :cond_2

    .line 77
    .line 78
    const-wide/16 v3, 0x1

    .line 79
    .line 80
    shl-long/2addr v3, v2

    .line 81
    const-wide v5, 0x100003701L

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v3, v5

    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    cmp-long v3, v3, v5

    .line 90
    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    add-int/lit8 v2, v1, 0x1

    .line 94
    .line 95
    aget-byte v1, v0, v1

    .line 96
    .line 97
    and-int/lit16 v1, v1, 0xff

    .line 98
    .line 99
    move v13, v2

    .line 100
    move v2, v1

    .line 101
    move v1, v13

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 104
    .line 105
    int-to-char v0, v2

    .line 106
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    return v0

    .line 110
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match17(JJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x13

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x10

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x8

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    cmp-long v3, v5, p3

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x14

    .line 45
    .line 46
    aget-byte v2, v0, v2

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0xff

    .line 49
    .line 50
    :goto_0
    const/16 v3, 0x20

    .line 51
    .line 52
    if-gt v2, v3, :cond_2

    .line 53
    .line 54
    const-wide/16 v3, 0x1

    .line 55
    .line 56
    shl-long/2addr v3, v2

    .line 57
    const-wide v5, 0x100003701L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v3, v5

    .line 63
    const-wide/16 v5, 0x0

    .line 64
    .line 65
    cmp-long v3, v3, v5

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    add-int/lit8 v2, v1, 0x1

    .line 70
    .line 71
    aget-byte v1, v0, v1

    .line 72
    .line 73
    and-int/lit16 v1, v1, 0xff

    .line 74
    .line 75
    move v13, v2

    .line 76
    move v2, v1

    .line 77
    move v1, v13

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 80
    .line 81
    int-to-char v0, v2

    .line 82
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    return v0

    .line 86
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match18(JJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x14

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x11

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0x9

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    cmp-long v3, v5, p3

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x13

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    const/16 v5, 0x3a

    .line 48
    .line 49
    if-eq v3, v5, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x15

    .line 53
    .line 54
    aget-byte v2, v0, v2

    .line 55
    .line 56
    and-int/lit16 v2, v2, 0xff

    .line 57
    .line 58
    :goto_0
    const/16 v3, 0x20

    .line 59
    .line 60
    if-gt v2, v3, :cond_2

    .line 61
    .line 62
    const-wide/16 v3, 0x1

    .line 63
    .line 64
    shl-long/2addr v3, v2

    .line 65
    const-wide v5, 0x100003701L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v3, v5

    .line 71
    const-wide/16 v5, 0x0

    .line 72
    .line 73
    cmp-long v3, v3, v5

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    add-int/lit8 v2, v1, 0x1

    .line 78
    .line 79
    aget-byte v1, v0, v1

    .line 80
    .line 81
    and-int/lit16 v1, v1, 0xff

    .line 82
    .line 83
    move v13, v2

    .line 84
    move v2, v1

    .line 85
    move v1, v13

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    int-to-char v0, v2

    .line 90
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    return v0

    .line 94
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match19(JJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x15

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x12

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0xa

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    cmp-long v3, v5, p3

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x13

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    const/16 v5, 0x22

    .line 48
    .line 49
    if-ne v3, v5, :cond_3

    .line 50
    .line 51
    add-int/lit8 v3, v1, 0x14

    .line 52
    .line 53
    aget-byte v3, v0, v3

    .line 54
    .line 55
    const/16 v5, 0x3a

    .line 56
    .line 57
    if-eq v3, v5, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x16

    .line 61
    .line 62
    aget-byte v2, v0, v2

    .line 63
    .line 64
    and-int/lit16 v2, v2, 0xff

    .line 65
    .line 66
    :goto_0
    const/16 v3, 0x20

    .line 67
    .line 68
    if-gt v2, v3, :cond_2

    .line 69
    .line 70
    const-wide/16 v3, 0x1

    .line 71
    .line 72
    shl-long/2addr v3, v2

    .line 73
    const-wide v5, 0x100003701L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v3, v5

    .line 79
    const-wide/16 v5, 0x0

    .line 80
    .line 81
    cmp-long v3, v3, v5

    .line 82
    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    add-int/lit8 v2, v1, 0x1

    .line 86
    .line 87
    aget-byte v1, v0, v1

    .line 88
    .line 89
    and-int/lit16 v1, v1, 0xff

    .line 90
    .line 91
    move v13, v2

    .line 92
    move v2, v1

    .line 93
    move v1, v13

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    int-to-char v0, v2

    .line 98
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    return v0

    .line 102
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match2()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    aget-byte v3, v0, v3

    .line 16
    .line 17
    const/16 v5, 0x3a

    .line 18
    .line 19
    if-eq v3, v5, :cond_1

    .line 20
    .line 21
    return v4

    .line 22
    :cond_1
    add-int/lit8 v1, v1, 0x5

    .line 23
    .line 24
    aget-byte v2, v0, v2

    .line 25
    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    :goto_0
    const/16 v3, 0x20

    .line 29
    .line 30
    if-gt v2, v3, :cond_2

    .line 31
    .line 32
    const-wide/16 v3, 0x1

    .line 33
    .line 34
    shl-long/2addr v3, v2

    .line 35
    const-wide v5, 0x100003701L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v3, v5

    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    cmp-long v3, v3, v5

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    add-int/lit8 v2, v1, 0x1

    .line 48
    .line 49
    aget-byte v1, v0, v1

    .line 50
    .line 51
    and-int/lit16 v1, v1, 0xff

    .line 52
    .line 53
    move v7, v2

    .line 54
    move v2, v1

    .line 55
    move v1, v7

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 58
    .line 59
    int-to-char v0, v2

    .line 60
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    return v0
.end method

.method public final nextIfName4Match20(JJB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x16

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x13

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long/2addr v5, v7

    .line 32
    const-wide/16 v7, 0xb

    .line 33
    .line 34
    sub-long/2addr v5, v7

    .line 35
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    cmp-long v3, v5, p3

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x13

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    move/from16 v5, p5

    .line 48
    .line 49
    if-ne v3, v5, :cond_3

    .line 50
    .line 51
    add-int/lit8 v3, v1, 0x14

    .line 52
    .line 53
    aget-byte v3, v0, v3

    .line 54
    .line 55
    const/16 v5, 0x22

    .line 56
    .line 57
    if-ne v3, v5, :cond_3

    .line 58
    .line 59
    add-int/lit8 v3, v1, 0x15

    .line 60
    .line 61
    aget-byte v3, v0, v3

    .line 62
    .line 63
    const/16 v5, 0x3a

    .line 64
    .line 65
    if-eq v3, v5, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v1, v1, 0x17

    .line 69
    .line 70
    aget-byte v2, v0, v2

    .line 71
    .line 72
    and-int/lit16 v2, v2, 0xff

    .line 73
    .line 74
    :goto_0
    const/16 v3, 0x20

    .line 75
    .line 76
    if-gt v2, v3, :cond_2

    .line 77
    .line 78
    const-wide/16 v3, 0x1

    .line 79
    .line 80
    shl-long/2addr v3, v2

    .line 81
    const-wide v5, 0x100003701L

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v3, v5

    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    cmp-long v3, v3, v5

    .line 90
    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    add-int/lit8 v2, v1, 0x1

    .line 94
    .line 95
    aget-byte v1, v0, v1

    .line 96
    .line 97
    and-int/lit16 v1, v1, 0xff

    .line 98
    .line 99
    move v13, v2

    .line 100
    move v2, v1

    .line 101
    move v1, v13

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 104
    .line 105
    int-to-char v0, v2

    .line 106
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    return v0

    .line 110
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match21(JJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x17

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x14

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0xc

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x4

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move/from16 v5, p5

    .line 53
    .line 54
    if-eq v3, v5, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    add-int/lit8 v1, v1, 0x18

    .line 58
    .line 59
    aget-byte v2, v0, v2

    .line 60
    .line 61
    and-int/lit16 v2, v2, 0xff

    .line 62
    .line 63
    :goto_0
    const/16 v3, 0x20

    .line 64
    .line 65
    if-gt v2, v3, :cond_2

    .line 66
    .line 67
    const-wide/16 v3, 0x1

    .line 68
    .line 69
    shl-long/2addr v3, v2

    .line 70
    const-wide v5, 0x100003701L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v3, v5

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    cmp-long v3, v3, v5

    .line 79
    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    add-int/lit8 v2, v1, 0x1

    .line 83
    .line 84
    aget-byte v1, v0, v1

    .line 85
    .line 86
    and-int/lit16 v1, v1, 0xff

    .line 87
    .line 88
    move v13, v2

    .line 89
    move v2, v1

    .line 90
    move v1, v13

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    int-to-char v0, v2

    .line 95
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    return v0

    .line 99
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match22(JJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x18

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x15

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0xd

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x5

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move/from16 v5, p5

    .line 53
    .line 54
    if-ne v3, v5, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x17

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    const/16 v5, 0x3a

    .line 61
    .line 62
    if-eq v3, v5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v1, v1, 0x19

    .line 66
    .line 67
    aget-byte v2, v0, v2

    .line 68
    .line 69
    and-int/lit16 v2, v2, 0xff

    .line 70
    .line 71
    :goto_0
    const/16 v3, 0x20

    .line 72
    .line 73
    if-gt v2, v3, :cond_2

    .line 74
    .line 75
    const-wide/16 v3, 0x1

    .line 76
    .line 77
    shl-long/2addr v3, v2

    .line 78
    const-wide v5, 0x100003701L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v3, v5

    .line 84
    const-wide/16 v5, 0x0

    .line 85
    .line 86
    cmp-long v3, v3, v5

    .line 87
    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    add-int/lit8 v2, v1, 0x1

    .line 91
    .line 92
    aget-byte v1, v0, v1

    .line 93
    .line 94
    and-int/lit16 v1, v1, 0xff

    .line 95
    .line 96
    move v13, v2

    .line 97
    move v2, v1

    .line 98
    move v1, v13

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    int-to-char v0, v2

    .line 103
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    return v0

    .line 107
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match23(JJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x19

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x16

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0xe

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x6

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move/from16 v5, p5

    .line 53
    .line 54
    if-ne v3, v5, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x17

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    const/16 v5, 0x22

    .line 61
    .line 62
    if-ne v3, v5, :cond_3

    .line 63
    .line 64
    add-int/lit8 v3, v1, 0x18

    .line 65
    .line 66
    aget-byte v3, v0, v3

    .line 67
    .line 68
    const/16 v5, 0x3a

    .line 69
    .line 70
    if-eq v3, v5, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    add-int/lit8 v1, v1, 0x1a

    .line 74
    .line 75
    aget-byte v2, v0, v2

    .line 76
    .line 77
    and-int/lit16 v2, v2, 0xff

    .line 78
    .line 79
    :goto_0
    const/16 v3, 0x20

    .line 80
    .line 81
    if-gt v2, v3, :cond_2

    .line 82
    .line 83
    const-wide/16 v3, 0x1

    .line 84
    .line 85
    shl-long/2addr v3, v2

    .line 86
    const-wide v5, 0x100003701L

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v3, v5

    .line 92
    const-wide/16 v5, 0x0

    .line 93
    .line 94
    cmp-long v3, v3, v5

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    add-int/lit8 v2, v1, 0x1

    .line 99
    .line 100
    aget-byte v1, v0, v1

    .line 101
    .line 102
    and-int/lit16 v1, v1, 0xff

    .line 103
    .line 104
    move v13, v2

    .line 105
    move v2, v1

    .line 106
    move v1, v13

    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    int-to-char v0, v2

    .line 111
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 112
    .line 113
    const/4 v0, 0x1

    .line 114
    return v0

    .line 115
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match24(JJIB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1a

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x17

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0xf

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x7

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move/from16 v5, p5

    .line 53
    .line 54
    if-ne v3, v5, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x17

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    move/from16 v5, p6

    .line 61
    .line 62
    if-ne v3, v5, :cond_3

    .line 63
    .line 64
    add-int/lit8 v3, v1, 0x18

    .line 65
    .line 66
    aget-byte v3, v0, v3

    .line 67
    .line 68
    const/16 v5, 0x22

    .line 69
    .line 70
    if-ne v3, v5, :cond_3

    .line 71
    .line 72
    add-int/lit8 v3, v1, 0x19

    .line 73
    .line 74
    aget-byte v3, v0, v3

    .line 75
    .line 76
    const/16 v5, 0x3a

    .line 77
    .line 78
    if-eq v3, v5, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    add-int/lit8 v1, v1, 0x1b

    .line 82
    .line 83
    aget-byte v2, v0, v2

    .line 84
    .line 85
    and-int/lit16 v2, v2, 0xff

    .line 86
    .line 87
    :goto_0
    const/16 v3, 0x20

    .line 88
    .line 89
    if-gt v2, v3, :cond_2

    .line 90
    .line 91
    const-wide/16 v3, 0x1

    .line 92
    .line 93
    shl-long/2addr v3, v2

    .line 94
    const-wide v5, 0x100003701L

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long/2addr v3, v5

    .line 100
    const-wide/16 v5, 0x0

    .line 101
    .line 102
    cmp-long v3, v3, v5

    .line 103
    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    add-int/lit8 v2, v1, 0x1

    .line 107
    .line 108
    aget-byte v1, v0, v1

    .line 109
    .line 110
    and-int/lit16 v1, v1, 0xff

    .line 111
    .line 112
    move v13, v2

    .line 113
    move v2, v1

    .line 114
    move v1, v13

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 117
    .line 118
    int-to-char v0, v2

    .line 119
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    return v0

    .line 123
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match25(JJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1b

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x18

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x10

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x8

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    cmp-long v3, v5, p5

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    add-int/lit8 v1, v1, 0x1c

    .line 58
    .line 59
    aget-byte v2, v0, v2

    .line 60
    .line 61
    and-int/lit16 v2, v2, 0xff

    .line 62
    .line 63
    :goto_0
    const/16 v3, 0x20

    .line 64
    .line 65
    if-gt v2, v3, :cond_2

    .line 66
    .line 67
    const-wide/16 v3, 0x1

    .line 68
    .line 69
    shl-long/2addr v3, v2

    .line 70
    const-wide v5, 0x100003701L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v3, v5

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    cmp-long v3, v3, v5

    .line 79
    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    add-int/lit8 v2, v1, 0x1

    .line 83
    .line 84
    aget-byte v1, v0, v1

    .line 85
    .line 86
    and-int/lit16 v1, v1, 0xff

    .line 87
    .line 88
    move v13, v2

    .line 89
    move v2, v1

    .line 90
    move v1, v13

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    int-to-char v0, v2

    .line 95
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    return v0

    .line 99
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match26(JJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1c

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x19

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x11

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0x9

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    cmp-long v3, v5, p5

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x1b

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    const/16 v5, 0x3a

    .line 61
    .line 62
    if-eq v3, v5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v1, v1, 0x1d

    .line 66
    .line 67
    aget-byte v2, v0, v2

    .line 68
    .line 69
    and-int/lit16 v2, v2, 0xff

    .line 70
    .line 71
    :goto_0
    const/16 v3, 0x20

    .line 72
    .line 73
    if-gt v2, v3, :cond_2

    .line 74
    .line 75
    const-wide/16 v3, 0x1

    .line 76
    .line 77
    shl-long/2addr v3, v2

    .line 78
    const-wide v5, 0x100003701L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v3, v5

    .line 84
    const-wide/16 v5, 0x0

    .line 85
    .line 86
    cmp-long v3, v3, v5

    .line 87
    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    add-int/lit8 v2, v1, 0x1

    .line 91
    .line 92
    aget-byte v1, v0, v1

    .line 93
    .line 94
    and-int/lit16 v1, v1, 0xff

    .line 95
    .line 96
    move v13, v2

    .line 97
    move v2, v1

    .line 98
    move v1, v13

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    int-to-char v0, v2

    .line 103
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    return v0

    .line 107
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match27(JJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1d

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1a

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x12

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0xa

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    cmp-long v3, v5, p5

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x1b

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    const/16 v5, 0x22

    .line 61
    .line 62
    if-ne v3, v5, :cond_3

    .line 63
    .line 64
    add-int/lit8 v3, v1, 0x1c

    .line 65
    .line 66
    aget-byte v3, v0, v3

    .line 67
    .line 68
    const/16 v5, 0x3a

    .line 69
    .line 70
    if-eq v3, v5, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    add-int/lit8 v1, v1, 0x1e

    .line 74
    .line 75
    aget-byte v2, v0, v2

    .line 76
    .line 77
    and-int/lit16 v2, v2, 0xff

    .line 78
    .line 79
    :goto_0
    const/16 v3, 0x20

    .line 80
    .line 81
    if-gt v2, v3, :cond_2

    .line 82
    .line 83
    const-wide/16 v3, 0x1

    .line 84
    .line 85
    shl-long/2addr v3, v2

    .line 86
    const-wide v5, 0x100003701L

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v3, v5

    .line 92
    const-wide/16 v5, 0x0

    .line 93
    .line 94
    cmp-long v3, v3, v5

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    add-int/lit8 v2, v1, 0x1

    .line 99
    .line 100
    aget-byte v1, v0, v1

    .line 101
    .line 102
    and-int/lit16 v1, v1, 0xff

    .line 103
    .line 104
    move v13, v2

    .line 105
    move v2, v1

    .line 106
    move v1, v13

    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    int-to-char v0, v2

    .line 111
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 112
    .line 113
    const/4 v0, 0x1

    .line 114
    return v0

    .line 115
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match28(JJJB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1e

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1b

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x13

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    const-wide/16 v7, 0xb

    .line 46
    .line 47
    sub-long/2addr v5, v7

    .line 48
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    cmp-long v3, v5, p5

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v1, 0x1b

    .line 57
    .line 58
    aget-byte v3, v0, v3

    .line 59
    .line 60
    move/from16 v5, p7

    .line 61
    .line 62
    if-ne v3, v5, :cond_3

    .line 63
    .line 64
    add-int/lit8 v3, v1, 0x1c

    .line 65
    .line 66
    aget-byte v3, v0, v3

    .line 67
    .line 68
    const/16 v5, 0x22

    .line 69
    .line 70
    if-ne v3, v5, :cond_3

    .line 71
    .line 72
    add-int/lit8 v3, v1, 0x1d

    .line 73
    .line 74
    aget-byte v3, v0, v3

    .line 75
    .line 76
    const/16 v5, 0x3a

    .line 77
    .line 78
    if-eq v3, v5, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    add-int/lit8 v1, v1, 0x1f

    .line 82
    .line 83
    aget-byte v2, v0, v2

    .line 84
    .line 85
    and-int/lit16 v2, v2, 0xff

    .line 86
    .line 87
    :goto_0
    const/16 v3, 0x20

    .line 88
    .line 89
    if-gt v2, v3, :cond_2

    .line 90
    .line 91
    const-wide/16 v3, 0x1

    .line 92
    .line 93
    shl-long/2addr v3, v2

    .line 94
    const-wide v5, 0x100003701L

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long/2addr v3, v5

    .line 100
    const-wide/16 v5, 0x0

    .line 101
    .line 102
    cmp-long v3, v3, v5

    .line 103
    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    add-int/lit8 v2, v1, 0x1

    .line 107
    .line 108
    aget-byte v1, v0, v1

    .line 109
    .line 110
    and-int/lit16 v1, v1, 0xff

    .line 111
    .line 112
    move v13, v2

    .line 113
    move v2, v1

    .line 114
    move v1, v13

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 117
    .line 118
    int-to-char v0, v2

    .line 119
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    return v0

    .line 123
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match29(JJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1f

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1c

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x14

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0xc

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x4

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    move/from16 v5, p7

    .line 66
    .line 67
    if-eq v3, v5, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/16 v3, 0x20

    .line 71
    .line 72
    add-int/2addr v1, v3

    .line 73
    aget-byte v2, v0, v2

    .line 74
    .line 75
    and-int/lit16 v2, v2, 0xff

    .line 76
    .line 77
    :goto_0
    if-gt v2, v3, :cond_2

    .line 78
    .line 79
    const-wide/16 v4, 0x1

    .line 80
    .line 81
    shl-long/2addr v4, v2

    .line 82
    const-wide v6, 0x100003701L

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    and-long/2addr v4, v6

    .line 88
    const-wide/16 v6, 0x0

    .line 89
    .line 90
    cmp-long v4, v4, v6

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    add-int/lit8 v2, v1, 0x1

    .line 95
    .line 96
    aget-byte v1, v0, v1

    .line 97
    .line 98
    and-int/lit16 v1, v1, 0xff

    .line 99
    .line 100
    move v13, v2

    .line 101
    move v2, v1

    .line 102
    move v1, v13

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    int-to-char v0, v2

    .line 107
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    return v0

    .line 111
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match3()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x5

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    aget-byte v3, v0, v3

    .line 16
    .line 17
    const/16 v5, 0x22

    .line 18
    .line 19
    if-ne v3, v5, :cond_3

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x4

    .line 22
    .line 23
    aget-byte v1, v0, v1

    .line 24
    .line 25
    const/16 v3, 0x3a

    .line 26
    .line 27
    if-eq v1, v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    aget-byte v1, v0, v2

    .line 31
    .line 32
    :goto_0
    and-int/lit16 v1, v1, 0xff

    .line 33
    .line 34
    const/16 v3, 0x20

    .line 35
    .line 36
    if-gt v1, v3, :cond_2

    .line 37
    .line 38
    const-wide/16 v3, 0x1

    .line 39
    .line 40
    shl-long/2addr v3, v1

    .line 41
    const-wide v5, 0x100003701L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v3, v5

    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    cmp-long v3, v3, v5

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    aget-byte v1, v0, v2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v0, 0x1

    .line 59
    add-int/2addr v2, v0

    .line 60
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 61
    .line 62
    int-to-char v1, v1

    .line 63
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 64
    .line 65
    return v0

    .line 66
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match30(JJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x20

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1d

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x15

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0xd

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x5

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    move/from16 v5, p7

    .line 66
    .line 67
    if-ne v3, v5, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x1f

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    const/16 v5, 0x3a

    .line 74
    .line 75
    if-eq v3, v5, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/lit8 v1, v1, 0x21

    .line 79
    .line 80
    aget-byte v2, v0, v2

    .line 81
    .line 82
    and-int/lit16 v2, v2, 0xff

    .line 83
    .line 84
    :goto_0
    const/16 v3, 0x20

    .line 85
    .line 86
    if-gt v2, v3, :cond_2

    .line 87
    .line 88
    const-wide/16 v3, 0x1

    .line 89
    .line 90
    shl-long/2addr v3, v2

    .line 91
    const-wide v5, 0x100003701L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v3, v5

    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    cmp-long v3, v3, v5

    .line 100
    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    add-int/lit8 v2, v1, 0x1

    .line 104
    .line 105
    aget-byte v1, v0, v1

    .line 106
    .line 107
    and-int/lit16 v1, v1, 0xff

    .line 108
    .line 109
    move v13, v2

    .line 110
    move v2, v1

    .line 111
    move v1, v13

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 114
    .line 115
    int-to-char v0, v2

    .line 116
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 117
    .line 118
    const/4 v0, 0x1

    .line 119
    return v0

    .line 120
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match31(JJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x21

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1e

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x16

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0xe

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x6

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    move/from16 v5, p7

    .line 66
    .line 67
    if-ne v3, v5, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x1f

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    const/16 v5, 0x22

    .line 74
    .line 75
    if-ne v3, v5, :cond_3

    .line 76
    .line 77
    add-int/lit8 v3, v1, 0x20

    .line 78
    .line 79
    aget-byte v3, v0, v3

    .line 80
    .line 81
    const/16 v6, 0x3a

    .line 82
    .line 83
    if-eq v3, v6, :cond_1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    add-int/2addr v1, v5

    .line 87
    aget-byte v2, v0, v2

    .line 88
    .line 89
    and-int/lit16 v2, v2, 0xff

    .line 90
    .line 91
    :goto_0
    const/16 v3, 0x20

    .line 92
    .line 93
    if-gt v2, v3, :cond_2

    .line 94
    .line 95
    const-wide/16 v3, 0x1

    .line 96
    .line 97
    shl-long/2addr v3, v2

    .line 98
    const-wide v5, 0x100003701L

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v3, v5

    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    cmp-long v3, v3, v5

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    add-int/lit8 v2, v1, 0x1

    .line 111
    .line 112
    aget-byte v1, v0, v1

    .line 113
    .line 114
    and-int/lit16 v1, v1, 0xff

    .line 115
    .line 116
    move v13, v2

    .line 117
    move v2, v1

    .line 118
    move v1, v13

    .line 119
    goto :goto_0

    .line 120
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 121
    .line 122
    int-to-char v0, v2

    .line 123
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    return v0

    .line 127
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match32(JJJIB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x22

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x1f

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x17

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0xf

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x7

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    move/from16 v5, p7

    .line 66
    .line 67
    if-ne v3, v5, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x1f

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    move/from16 v5, p8

    .line 74
    .line 75
    if-ne v3, v5, :cond_3

    .line 76
    .line 77
    add-int/lit8 v3, v1, 0x20

    .line 78
    .line 79
    aget-byte v3, v0, v3

    .line 80
    .line 81
    const/16 v5, 0x22

    .line 82
    .line 83
    if-ne v3, v5, :cond_3

    .line 84
    .line 85
    add-int/lit8 v3, v1, 0x21

    .line 86
    .line 87
    aget-byte v3, v0, v3

    .line 88
    .line 89
    const/16 v5, 0x3a

    .line 90
    .line 91
    if-eq v3, v5, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    add-int/lit8 v1, v1, 0x23

    .line 95
    .line 96
    aget-byte v2, v0, v2

    .line 97
    .line 98
    and-int/lit16 v2, v2, 0xff

    .line 99
    .line 100
    :goto_0
    const/16 v3, 0x20

    .line 101
    .line 102
    if-gt v2, v3, :cond_2

    .line 103
    .line 104
    const-wide/16 v3, 0x1

    .line 105
    .line 106
    shl-long/2addr v3, v2

    .line 107
    const-wide v5, 0x100003701L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    and-long/2addr v3, v5

    .line 113
    const-wide/16 v5, 0x0

    .line 114
    .line 115
    cmp-long v3, v3, v5

    .line 116
    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    add-int/lit8 v2, v1, 0x1

    .line 120
    .line 121
    aget-byte v1, v0, v1

    .line 122
    .line 123
    and-int/lit16 v1, v1, 0xff

    .line 124
    .line 125
    move v13, v2

    .line 126
    move v2, v1

    .line 127
    move v1, v13

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 130
    .line 131
    int-to-char v0, v2

    .line 132
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    return v0

    .line 136
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match33(JJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x23

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x20

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x18

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x10

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x8

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    cmp-long v3, v5, p7

    .line 66
    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    add-int/lit8 v1, v1, 0x24

    .line 71
    .line 72
    aget-byte v2, v0, v2

    .line 73
    .line 74
    and-int/lit16 v2, v2, 0xff

    .line 75
    .line 76
    :goto_0
    const/16 v3, 0x20

    .line 77
    .line 78
    if-gt v2, v3, :cond_2

    .line 79
    .line 80
    const-wide/16 v3, 0x1

    .line 81
    .line 82
    shl-long/2addr v3, v2

    .line 83
    const-wide v5, 0x100003701L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v3, v5

    .line 89
    const-wide/16 v5, 0x0

    .line 90
    .line 91
    cmp-long v3, v3, v5

    .line 92
    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    add-int/lit8 v2, v1, 0x1

    .line 96
    .line 97
    aget-byte v1, v0, v1

    .line 98
    .line 99
    and-int/lit16 v1, v1, 0xff

    .line 100
    .line 101
    move v13, v2

    .line 102
    move v2, v1

    .line 103
    move v1, v13

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 106
    .line 107
    int-to-char v0, v2

    .line 108
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    return v0

    .line 112
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match34(JJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x24

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x21

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x19

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x11

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x9

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    cmp-long v3, v5, p7

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x23

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    const/16 v5, 0x3a

    .line 74
    .line 75
    if-eq v3, v5, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/lit8 v1, v1, 0x25

    .line 79
    .line 80
    aget-byte v2, v0, v2

    .line 81
    .line 82
    and-int/lit16 v2, v2, 0xff

    .line 83
    .line 84
    :goto_0
    const/16 v3, 0x20

    .line 85
    .line 86
    if-gt v2, v3, :cond_2

    .line 87
    .line 88
    const-wide/16 v3, 0x1

    .line 89
    .line 90
    shl-long/2addr v3, v2

    .line 91
    const-wide v5, 0x100003701L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v3, v5

    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    cmp-long v3, v3, v5

    .line 100
    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    add-int/lit8 v2, v1, 0x1

    .line 104
    .line 105
    aget-byte v1, v0, v1

    .line 106
    .line 107
    and-int/lit16 v1, v1, 0xff

    .line 108
    .line 109
    move v13, v2

    .line 110
    move v2, v1

    .line 111
    move v1, v13

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 114
    .line 115
    int-to-char v0, v2

    .line 116
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 117
    .line 118
    const/4 v0, 0x1

    .line 119
    return v0

    .line 120
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match35(JJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x25

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x22

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1a

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x12

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0xa

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    cmp-long v3, v5, p7

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x23

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    const/16 v5, 0x22

    .line 74
    .line 75
    if-ne v3, v5, :cond_3

    .line 76
    .line 77
    add-int/lit8 v3, v1, 0x24

    .line 78
    .line 79
    aget-byte v3, v0, v3

    .line 80
    .line 81
    const/16 v5, 0x3a

    .line 82
    .line 83
    if-eq v3, v5, :cond_1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    add-int/lit8 v1, v1, 0x26

    .line 87
    .line 88
    aget-byte v2, v0, v2

    .line 89
    .line 90
    and-int/lit16 v2, v2, 0xff

    .line 91
    .line 92
    :goto_0
    const/16 v3, 0x20

    .line 93
    .line 94
    if-gt v2, v3, :cond_2

    .line 95
    .line 96
    const-wide/16 v3, 0x1

    .line 97
    .line 98
    shl-long/2addr v3, v2

    .line 99
    const-wide v5, 0x100003701L

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long/2addr v3, v5

    .line 105
    const-wide/16 v5, 0x0

    .line 106
    .line 107
    cmp-long v3, v3, v5

    .line 108
    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    add-int/lit8 v2, v1, 0x1

    .line 112
    .line 113
    aget-byte v1, v0, v1

    .line 114
    .line 115
    and-int/lit16 v1, v1, 0xff

    .line 116
    .line 117
    move v13, v2

    .line 118
    move v2, v1

    .line 119
    move v1, v13

    .line 120
    goto :goto_0

    .line 121
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    int-to-char v0, v2

    .line 124
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 125
    .line 126
    const/4 v0, 0x1

    .line 127
    return v0

    .line 128
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match36(JJJJB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x26

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x23

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1b

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x13

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0xb

    .line 59
    .line 60
    sub-long/2addr v5, v7

    .line 61
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    cmp-long v3, v5, p7

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x23

    .line 70
    .line 71
    aget-byte v3, v0, v3

    .line 72
    .line 73
    move/from16 v5, p9

    .line 74
    .line 75
    if-ne v3, v5, :cond_3

    .line 76
    .line 77
    add-int/lit8 v3, v1, 0x24

    .line 78
    .line 79
    aget-byte v3, v0, v3

    .line 80
    .line 81
    const/16 v5, 0x22

    .line 82
    .line 83
    if-ne v3, v5, :cond_3

    .line 84
    .line 85
    add-int/lit8 v3, v1, 0x25

    .line 86
    .line 87
    aget-byte v3, v0, v3

    .line 88
    .line 89
    const/16 v5, 0x3a

    .line 90
    .line 91
    if-eq v3, v5, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    add-int/lit8 v1, v1, 0x27

    .line 95
    .line 96
    aget-byte v2, v0, v2

    .line 97
    .line 98
    and-int/lit16 v2, v2, 0xff

    .line 99
    .line 100
    :goto_0
    const/16 v3, 0x20

    .line 101
    .line 102
    if-gt v2, v3, :cond_2

    .line 103
    .line 104
    const-wide/16 v3, 0x1

    .line 105
    .line 106
    shl-long/2addr v3, v2

    .line 107
    const-wide v5, 0x100003701L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    and-long/2addr v3, v5

    .line 113
    const-wide/16 v5, 0x0

    .line 114
    .line 115
    cmp-long v3, v3, v5

    .line 116
    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    add-int/lit8 v2, v1, 0x1

    .line 120
    .line 121
    aget-byte v1, v0, v1

    .line 122
    .line 123
    and-int/lit16 v1, v1, 0xff

    .line 124
    .line 125
    move v13, v2

    .line 126
    move v2, v1

    .line 127
    move v1, v13

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 130
    .line 131
    int-to-char v0, v2

    .line 132
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    return v0

    .line 136
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match37(JJJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x27

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x24

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1c

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x14

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0xc

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x4

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move/from16 v5, p9

    .line 79
    .line 80
    if-eq v3, v5, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 v1, v1, 0x28

    .line 84
    .line 85
    aget-byte v2, v0, v2

    .line 86
    .line 87
    and-int/lit16 v2, v2, 0xff

    .line 88
    .line 89
    :goto_0
    const/16 v3, 0x20

    .line 90
    .line 91
    if-gt v2, v3, :cond_2

    .line 92
    .line 93
    const-wide/16 v3, 0x1

    .line 94
    .line 95
    shl-long/2addr v3, v2

    .line 96
    const-wide v5, 0x100003701L

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v3, v5

    .line 102
    const-wide/16 v5, 0x0

    .line 103
    .line 104
    cmp-long v3, v3, v5

    .line 105
    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    add-int/lit8 v2, v1, 0x1

    .line 109
    .line 110
    aget-byte v1, v0, v1

    .line 111
    .line 112
    and-int/lit16 v1, v1, 0xff

    .line 113
    .line 114
    move v13, v2

    .line 115
    move v2, v1

    .line 116
    move v1, v13

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 119
    .line 120
    int-to-char v0, v2

    .line 121
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    return v0

    .line 125
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match38(JJJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x28

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x25

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1d

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x15

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0xd

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x5

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move/from16 v5, p9

    .line 79
    .line 80
    if-ne v3, v5, :cond_3

    .line 81
    .line 82
    add-int/lit8 v3, v1, 0x27

    .line 83
    .line 84
    aget-byte v3, v0, v3

    .line 85
    .line 86
    const/16 v5, 0x3a

    .line 87
    .line 88
    if-eq v3, v5, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    add-int/lit8 v1, v1, 0x29

    .line 92
    .line 93
    aget-byte v2, v0, v2

    .line 94
    .line 95
    and-int/lit16 v2, v2, 0xff

    .line 96
    .line 97
    :goto_0
    const/16 v3, 0x20

    .line 98
    .line 99
    if-gt v2, v3, :cond_2

    .line 100
    .line 101
    const-wide/16 v3, 0x1

    .line 102
    .line 103
    shl-long/2addr v3, v2

    .line 104
    const-wide v5, 0x100003701L

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long/2addr v3, v5

    .line 110
    const-wide/16 v5, 0x0

    .line 111
    .line 112
    cmp-long v3, v3, v5

    .line 113
    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    add-int/lit8 v2, v1, 0x1

    .line 117
    .line 118
    aget-byte v1, v0, v1

    .line 119
    .line 120
    and-int/lit16 v1, v1, 0xff

    .line 121
    .line 122
    move v13, v2

    .line 123
    move v2, v1

    .line 124
    move v1, v13

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 127
    .line 128
    int-to-char v0, v2

    .line 129
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 130
    .line 131
    const/4 v0, 0x1

    .line 132
    return v0

    .line 133
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match39(JJJJI)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x29

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x26

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1e

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x16

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0xe

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x6

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move/from16 v5, p9

    .line 79
    .line 80
    if-ne v3, v5, :cond_3

    .line 81
    .line 82
    add-int/lit8 v3, v1, 0x27

    .line 83
    .line 84
    aget-byte v3, v0, v3

    .line 85
    .line 86
    const/16 v5, 0x22

    .line 87
    .line 88
    if-ne v3, v5, :cond_3

    .line 89
    .line 90
    add-int/lit8 v3, v1, 0x28

    .line 91
    .line 92
    aget-byte v3, v0, v3

    .line 93
    .line 94
    const/16 v5, 0x3a

    .line 95
    .line 96
    if-eq v3, v5, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    add-int/lit8 v1, v1, 0x2a

    .line 100
    .line 101
    aget-byte v2, v0, v2

    .line 102
    .line 103
    and-int/lit16 v2, v2, 0xff

    .line 104
    .line 105
    :goto_0
    const/16 v3, 0x20

    .line 106
    .line 107
    if-gt v2, v3, :cond_2

    .line 108
    .line 109
    const-wide/16 v3, 0x1

    .line 110
    .line 111
    shl-long/2addr v3, v2

    .line 112
    const-wide v5, 0x100003701L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long/2addr v3, v5

    .line 118
    const-wide/16 v5, 0x0

    .line 119
    .line 120
    cmp-long v3, v3, v5

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    add-int/lit8 v2, v1, 0x1

    .line 125
    .line 126
    aget-byte v1, v0, v1

    .line 127
    .line 128
    and-int/lit16 v1, v1, 0xff

    .line 129
    .line 130
    move v13, v2

    .line 131
    move v2, v1

    .line 132
    move v1, v13

    .line 133
    goto :goto_0

    .line 134
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 135
    .line 136
    int-to-char v0, v2

    .line 137
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    return v0

    .line 141
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match4(B)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x6

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    aget-byte v3, v0, v3

    .line 14
    .line 15
    if-ne v3, p1, :cond_2

    .line 16
    .line 17
    add-int/lit8 p1, v1, 0x4

    .line 18
    .line 19
    aget-byte p1, v0, p1

    .line 20
    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-ne p1, v3, :cond_2

    .line 24
    .line 25
    add-int/lit8 p1, v1, 0x5

    .line 26
    .line 27
    aget-byte p1, v0, p1

    .line 28
    .line 29
    const/16 v3, 0x3a

    .line 30
    .line 31
    if-eq p1, v3, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    aget-byte p1, v0, v2

    .line 37
    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    :goto_0
    const/16 v2, 0x20

    .line 41
    .line 42
    if-gt p1, v2, :cond_1

    .line 43
    .line 44
    const-wide/16 v2, 0x1

    .line 45
    .line 46
    shl-long/2addr v2, p1

    .line 47
    const-wide v4, 0x100003701L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v2, v4

    .line 53
    const-wide/16 v4, 0x0

    .line 54
    .line 55
    cmp-long v2, v2, v4

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    add-int/lit8 p1, v1, 0x1

    .line 60
    .line 61
    aget-byte v1, v0, v1

    .line 62
    .line 63
    and-int/lit16 v1, v1, 0xff

    .line 64
    .line 65
    move v6, v1

    .line 66
    move v1, p1

    .line 67
    move p1, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    int-to-char p1, p1

    .line 72
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 77
    return p1
.end method

.method public final nextIfName4Match40(JJJJIB)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2a

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x27

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x1f

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x17

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0xf

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x7

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move/from16 v5, p9

    .line 79
    .line 80
    if-ne v3, v5, :cond_3

    .line 81
    .line 82
    add-int/lit8 v3, v1, 0x27

    .line 83
    .line 84
    aget-byte v3, v0, v3

    .line 85
    .line 86
    move/from16 v5, p10

    .line 87
    .line 88
    if-ne v3, v5, :cond_3

    .line 89
    .line 90
    add-int/lit8 v3, v1, 0x28

    .line 91
    .line 92
    aget-byte v3, v0, v3

    .line 93
    .line 94
    const/16 v5, 0x22

    .line 95
    .line 96
    if-ne v3, v5, :cond_3

    .line 97
    .line 98
    add-int/lit8 v3, v1, 0x29

    .line 99
    .line 100
    aget-byte v3, v0, v3

    .line 101
    .line 102
    const/16 v5, 0x3a

    .line 103
    .line 104
    if-eq v3, v5, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    add-int/lit8 v1, v1, 0x2b

    .line 108
    .line 109
    aget-byte v2, v0, v2

    .line 110
    .line 111
    and-int/lit16 v2, v2, 0xff

    .line 112
    .line 113
    :goto_0
    const/16 v3, 0x20

    .line 114
    .line 115
    if-gt v2, v3, :cond_2

    .line 116
    .line 117
    const-wide/16 v3, 0x1

    .line 118
    .line 119
    shl-long/2addr v3, v2

    .line 120
    const-wide v5, 0x100003701L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    and-long/2addr v3, v5

    .line 126
    const-wide/16 v5, 0x0

    .line 127
    .line 128
    cmp-long v3, v3, v5

    .line 129
    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    add-int/lit8 v2, v1, 0x1

    .line 133
    .line 134
    aget-byte v1, v0, v1

    .line 135
    .line 136
    and-int/lit16 v1, v1, 0xff

    .line 137
    .line 138
    move v13, v2

    .line 139
    move v2, v1

    .line 140
    move v1, v13

    .line 141
    goto :goto_0

    .line 142
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 143
    .line 144
    int-to-char v0, v2

    .line 145
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 146
    .line 147
    const/4 v0, 0x1

    .line 148
    return v0

    .line 149
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match41(JJJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2b

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x28

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x20

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x18

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0x10

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x8

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    cmp-long v3, v5, p9

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 v1, v1, 0x2c

    .line 84
    .line 85
    aget-byte v2, v0, v2

    .line 86
    .line 87
    and-int/lit16 v2, v2, 0xff

    .line 88
    .line 89
    :goto_0
    const/16 v3, 0x20

    .line 90
    .line 91
    if-gt v2, v3, :cond_2

    .line 92
    .line 93
    const-wide/16 v3, 0x1

    .line 94
    .line 95
    shl-long/2addr v3, v2

    .line 96
    const-wide v5, 0x100003701L

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v3, v5

    .line 102
    const-wide/16 v5, 0x0

    .line 103
    .line 104
    cmp-long v3, v3, v5

    .line 105
    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    add-int/lit8 v2, v1, 0x1

    .line 109
    .line 110
    aget-byte v1, v0, v1

    .line 111
    .line 112
    and-int/lit16 v1, v1, 0xff

    .line 113
    .line 114
    move v13, v2

    .line 115
    move v2, v1

    .line 116
    move v1, v13

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 119
    .line 120
    int-to-char v0, v2

    .line 121
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    return v0

    .line 125
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match42(JJJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2c

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x29

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x21

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x19

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0x11

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0x9

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    cmp-long v3, v5, p9

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    add-int/lit8 v3, v1, 0x2b

    .line 83
    .line 84
    aget-byte v3, v0, v3

    .line 85
    .line 86
    const/16 v5, 0x3a

    .line 87
    .line 88
    if-eq v3, v5, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    add-int/lit8 v1, v1, 0x2d

    .line 92
    .line 93
    aget-byte v2, v0, v2

    .line 94
    .line 95
    and-int/lit16 v2, v2, 0xff

    .line 96
    .line 97
    :goto_0
    const/16 v3, 0x20

    .line 98
    .line 99
    if-gt v2, v3, :cond_2

    .line 100
    .line 101
    const-wide/16 v3, 0x1

    .line 102
    .line 103
    shl-long/2addr v3, v2

    .line 104
    const-wide v5, 0x100003701L

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long/2addr v3, v5

    .line 110
    const-wide/16 v5, 0x0

    .line 111
    .line 112
    cmp-long v3, v3, v5

    .line 113
    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    add-int/lit8 v2, v1, 0x1

    .line 117
    .line 118
    aget-byte v1, v0, v1

    .line 119
    .line 120
    and-int/lit16 v1, v1, 0xff

    .line 121
    .line 122
    move v13, v2

    .line 123
    move v2, v1

    .line 124
    move v1, v13

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 127
    .line 128
    int-to-char v0, v2

    .line 129
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 130
    .line 131
    const/4 v0, 0x1

    .line 132
    return v0

    .line 133
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match43(JJJJJ)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2d

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long v9, v5, v7

    .line 19
    .line 20
    const-wide/16 v11, 0x2a

    .line 21
    .line 22
    sub-long/2addr v9, v11

    .line 23
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    cmp-long v9, v9, p1

    .line 28
    .line 29
    if-nez v9, :cond_3

    .line 30
    .line 31
    add-long v9, v5, v7

    .line 32
    .line 33
    const-wide/16 v11, 0x22

    .line 34
    .line 35
    sub-long/2addr v9, v11

    .line 36
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long v9, v9, p3

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    add-long v9, v5, v7

    .line 45
    .line 46
    const-wide/16 v11, 0x1a

    .line 47
    .line 48
    sub-long/2addr v9, v11

    .line 49
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v9, v9, p5

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    add-long v9, v5, v7

    .line 58
    .line 59
    const-wide/16 v11, 0x12

    .line 60
    .line 61
    sub-long/2addr v9, v11

    .line 62
    invoke-virtual {v3, v0, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    cmp-long v9, v9, p7

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/16 v7, 0xa

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    cmp-long v3, v5, p9

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    add-int/lit8 v3, v1, 0x2b

    .line 83
    .line 84
    aget-byte v3, v0, v3

    .line 85
    .line 86
    const/16 v5, 0x22

    .line 87
    .line 88
    if-ne v3, v5, :cond_3

    .line 89
    .line 90
    add-int/lit8 v3, v1, 0x2c

    .line 91
    .line 92
    aget-byte v3, v0, v3

    .line 93
    .line 94
    const/16 v5, 0x3a

    .line 95
    .line 96
    if-eq v3, v5, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    add-int/lit8 v1, v1, 0x2e

    .line 100
    .line 101
    aget-byte v2, v0, v2

    .line 102
    .line 103
    and-int/lit16 v2, v2, 0xff

    .line 104
    .line 105
    :goto_0
    const/16 v3, 0x20

    .line 106
    .line 107
    if-gt v2, v3, :cond_2

    .line 108
    .line 109
    const-wide/16 v3, 0x1

    .line 110
    .line 111
    shl-long/2addr v3, v2

    .line 112
    const-wide v5, 0x100003701L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long/2addr v3, v5

    .line 118
    const-wide/16 v5, 0x0

    .line 119
    .line 120
    cmp-long v3, v3, v5

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    add-int/lit8 v2, v1, 0x1

    .line 125
    .line 126
    aget-byte v1, v0, v1

    .line 127
    .line 128
    and-int/lit16 v1, v1, 0xff

    .line 129
    .line 130
    move v13, v2

    .line 131
    move v2, v1

    .line 132
    move v1, v13

    .line 133
    goto :goto_0

    .line 134
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 135
    .line 136
    int-to-char v0, v2

    .line 137
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    return v0

    .line 141
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match5(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x7

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long/2addr v4, v6

    .line 17
    const-wide/16 v6, 0x4

    .line 18
    .line 19
    sub-long/2addr v4, v6

    .line 20
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eq v3, p1, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    aget-byte p1, v0, v2

    .line 30
    .line 31
    and-int/lit16 p1, p1, 0xff

    .line 32
    .line 33
    :goto_0
    const/16 v2, 0x20

    .line 34
    .line 35
    if-gt p1, v2, :cond_1

    .line 36
    .line 37
    const-wide/16 v2, 0x1

    .line 38
    .line 39
    shl-long/2addr v2, p1

    .line 40
    const-wide v4, 0x100003701L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v2, v4

    .line 46
    const-wide/16 v4, 0x0

    .line 47
    .line 48
    cmp-long v2, v2, v4

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    add-int/lit8 p1, v1, 0x1

    .line 53
    .line 54
    aget-byte v1, v0, v1

    .line 55
    .line 56
    and-int/lit16 v1, v1, 0xff

    .line 57
    .line 58
    move v8, v1

    .line 59
    move v1, p1

    .line 60
    move p1, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    int-to-char p1, p1

    .line 65
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    return p1

    .line 69
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 70
    return p1
.end method

.method public final nextIfName4Match6(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long/2addr v4, v6

    .line 17
    const-wide/16 v6, 0x5

    .line 18
    .line 19
    sub-long/2addr v4, v6

    .line 20
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ne v3, p1, :cond_2

    .line 25
    .line 26
    add-int/lit8 p1, v1, 0x7

    .line 27
    .line 28
    aget-byte p1, v0, p1

    .line 29
    .line 30
    const/16 v3, 0x3a

    .line 31
    .line 32
    if-eq p1, v3, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x9

    .line 36
    .line 37
    aget-byte p1, v0, v2

    .line 38
    .line 39
    and-int/lit16 p1, p1, 0xff

    .line 40
    .line 41
    :goto_0
    const/16 v2, 0x20

    .line 42
    .line 43
    if-gt p1, v2, :cond_1

    .line 44
    .line 45
    const-wide/16 v2, 0x1

    .line 46
    .line 47
    shl-long/2addr v2, p1

    .line 48
    const-wide v4, 0x100003701L

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v4

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    cmp-long v2, v2, v4

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    add-int/lit8 p1, v1, 0x1

    .line 61
    .line 62
    aget-byte v1, v0, v1

    .line 63
    .line 64
    and-int/lit16 v1, v1, 0xff

    .line 65
    .line 66
    move v8, v1

    .line 67
    move v1, p1

    .line 68
    move p1, v8

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 71
    .line 72
    int-to-char p1, p1

    .line 73
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 78
    return p1
.end method

.method public final nextIfName4Match7(I)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x6

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ne v3, p1, :cond_3

    .line 27
    .line 28
    add-int/lit8 p1, v1, 0x7

    .line 29
    .line 30
    aget-byte p1, v0, p1

    .line 31
    .line 32
    const/16 v3, 0x22

    .line 33
    .line 34
    if-ne p1, v3, :cond_3

    .line 35
    .line 36
    add-int/lit8 p1, v1, 0x8

    .line 37
    .line 38
    aget-byte p1, v0, p1

    .line 39
    .line 40
    const/16 v3, 0x3a

    .line 41
    .line 42
    if-eq p1, v3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    add-int/lit8 v1, v1, 0xa

    .line 46
    .line 47
    aget-byte p1, v0, v2

    .line 48
    .line 49
    and-int/lit16 p1, p1, 0xff

    .line 50
    .line 51
    :goto_0
    const/16 v2, 0x20

    .line 52
    .line 53
    if-gt p1, v2, :cond_2

    .line 54
    .line 55
    const-wide/16 v2, 0x1

    .line 56
    .line 57
    shl-long/2addr v2, p1

    .line 58
    const-wide v4, 0x100003701L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v2, v4

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    cmp-long v2, v2, v4

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    add-int/lit8 p1, v1, 0x1

    .line 71
    .line 72
    aget-byte v1, v0, v1

    .line 73
    .line 74
    and-int/lit16 v1, v1, 0xff

    .line 75
    .line 76
    move v9, v1

    .line 77
    move v1, p1

    .line 78
    move p1, v9

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    int-to-char p1, p1

    .line 83
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    return p1

    .line 87
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match8(IB)Z
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    return v3

    .line 11
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 12
    .line 13
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v1

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x7

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v4, v2, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ne v4, p1, :cond_3

    .line 27
    .line 28
    add-int/lit8 p1, v0, 0x7

    .line 29
    .line 30
    aget-byte p1, v2, p1

    .line 31
    .line 32
    if-ne p1, p2, :cond_3

    .line 33
    .line 34
    add-int/lit8 p1, v0, 0x8

    .line 35
    .line 36
    aget-byte p1, v2, p1

    .line 37
    .line 38
    const/16 p2, 0x22

    .line 39
    .line 40
    if-ne p1, p2, :cond_3

    .line 41
    .line 42
    add-int/lit8 p1, v0, 0x9

    .line 43
    .line 44
    aget-byte p1, v2, p1

    .line 45
    .line 46
    const/16 p2, 0x3a

    .line 47
    .line 48
    if-eq p1, p2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v0, v0, 0xb

    .line 52
    .line 53
    aget-byte p1, v2, v1

    .line 54
    .line 55
    and-int/lit16 p1, p1, 0xff

    .line 56
    .line 57
    :goto_0
    const/16 p2, 0x20

    .line 58
    .line 59
    if-gt p1, p2, :cond_2

    .line 60
    .line 61
    const-wide/16 v3, 0x1

    .line 62
    .line 63
    shl-long/2addr v3, p1

    .line 64
    const-wide v5, 0x100003701L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v3, v5

    .line 70
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    cmp-long p2, v3, v5

    .line 73
    .line 74
    if-eqz p2, :cond_2

    .line 75
    .line 76
    add-int/lit8 p1, v0, 0x1

    .line 77
    .line 78
    aget-byte p2, v2, v0

    .line 79
    .line 80
    and-int/lit16 p2, p2, 0xff

    .line 81
    .line 82
    move v0, p1

    .line 83
    move p1, p2

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    .line 87
    int-to-char p1, p1

    .line 88
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 89
    .line 90
    const/4 p1, 0x1

    .line 91
    return p1

    .line 92
    :cond_3
    :goto_1
    return v3
.end method

.method public final nextIfName4Match9(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xb

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x8

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    add-int/lit8 v1, v1, 0xc

    .line 32
    .line 33
    aget-byte p1, v0, v2

    .line 34
    .line 35
    and-int/lit16 p1, p1, 0xff

    .line 36
    .line 37
    :goto_0
    const/16 p2, 0x20

    .line 38
    .line 39
    if-gt p1, p2, :cond_2

    .line 40
    .line 41
    const-wide/16 v2, 0x1

    .line 42
    .line 43
    shl-long/2addr v2, p1

    .line 44
    const-wide v4, 0x100003701L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v2, v4

    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    cmp-long p2, v2, v4

    .line 53
    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    add-int/lit8 p1, v1, 0x1

    .line 57
    .line 58
    aget-byte p2, v0, v1

    .line 59
    .line 60
    and-int/lit16 p2, p2, 0xff

    .line 61
    .line 62
    move v1, p1

    .line 63
    move p1, p2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 66
    .line 67
    int-to-char p1, p1

    .line 68
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    return p1
.end method

.method public final nextIfName8Match0()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x7

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x1a

    .line 12
    .line 13
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    aget-byte v2, v0, v1

    .line 18
    .line 19
    :goto_0
    and-int/lit16 v2, v2, 0xff

    .line 20
    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    if-gt v2, v3, :cond_1

    .line 24
    .line 25
    const-wide/16 v3, 0x1

    .line 26
    .line 27
    shl-long/2addr v3, v2

    .line 28
    const-wide v5, 0x100003701L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v3, v5

    .line 34
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    cmp-long v3, v3, v5

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    aget-byte v2, v0, v1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x1

    .line 46
    add-int/2addr v1, v0

    .line 47
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 48
    .line 49
    int-to-char v1, v2

    .line 50
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 51
    .line 52
    return v0
.end method

.method public final nextIfName8Match1()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v1, v1, 0x7

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    const/16 v3, 0x3a

    .line 18
    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    return v4

    .line 22
    :cond_1
    aget-byte v1, v0, v2

    .line 23
    .line 24
    :goto_0
    and-int/lit16 v1, v1, 0xff

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-gt v1, v3, :cond_2

    .line 29
    .line 30
    const-wide/16 v3, 0x1

    .line 31
    .line 32
    shl-long/2addr v3, v1

    .line 33
    const-wide v5, 0x100003701L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v3, v5

    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    cmp-long v3, v3, v5

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    aget-byte v1, v0, v2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x1

    .line 51
    add-int/2addr v2, v0

    .line 52
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 53
    .line 54
    int-to-char v1, v1

    .line 55
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 56
    .line 57
    return v0
.end method

.method public final nextIfName8Match2()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x7

    .line 14
    .line 15
    aget-byte v3, v0, v3

    .line 16
    .line 17
    const/16 v5, 0x22

    .line 18
    .line 19
    if-ne v3, v5, :cond_3

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x8

    .line 22
    .line 23
    aget-byte v1, v0, v1

    .line 24
    .line 25
    const/16 v3, 0x3a

    .line 26
    .line 27
    if-eq v1, v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    aget-byte v1, v0, v2

    .line 31
    .line 32
    :goto_0
    and-int/lit16 v1, v1, 0xff

    .line 33
    .line 34
    const/16 v3, 0x20

    .line 35
    .line 36
    if-gt v1, v3, :cond_2

    .line 37
    .line 38
    const-wide/16 v3, 0x1

    .line 39
    .line 40
    shl-long/2addr v3, v1

    .line 41
    const-wide v5, 0x100003701L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v3, v5

    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    cmp-long v3, v3, v5

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    aget-byte v1, v0, v2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v0, 0x1

    .line 59
    add-int/2addr v2, v0

    .line 60
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 61
    .line 62
    int-to-char v1, v1

    .line 63
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 64
    .line 65
    return v0

    .line 66
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfNull()Z
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 16
    .line 17
    aget-byte v0, v1, v0

    .line 18
    .line 19
    const/16 v1, 0x75

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readNull()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
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
    if-ge v10, v2, :cond_d

    .line 63
    .line 64
    aget-byte v11, v4, v3

    .line 65
    .line 66
    if-ne v11, v9, :cond_d

    .line 67
    .line 68
    add-int/lit8 v9, v3, 0x1

    .line 69
    .line 70
    aget-byte v9, v4, v9

    .line 71
    .line 72
    if-ne v9, v5, :cond_d

    .line 73
    .line 74
    add-int/lit8 v5, v3, 0x2

    .line 75
    .line 76
    aget-byte v5, v4, v5

    .line 77
    .line 78
    if-ne v5, v7, :cond_d

    .line 79
    .line 80
    add-int/lit8 v5, v3, 0x3

    .line 81
    .line 82
    aget-byte v5, v4, v5

    .line 83
    .line 84
    if-ne v5, v7, :cond_d

    .line 85
    .line 86
    aget-byte v5, v4, v10

    .line 87
    .line 88
    if-ne v5, v1, :cond_d

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
    if-gez v3, :cond_c

    .line 180
    .line 181
    invoke-direct {v0, v3, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 182
    .line 183
    .line 184
    return v8

    .line 185
    :cond_c
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 186
    .line 187
    int-to-char v1, v3

    .line 188
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 189
    .line 190
    return v8

    .line 191
    :cond_d
    return v6
.end method

.method public nextIfObjectEnd()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x7d

    .line 10
    .line 11
    if-eq v1, v4, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    return v1

    .line 15
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 16
    .line 17
    const/16 v4, 0x1a

    .line 18
    .line 19
    if-ne v3, v1, :cond_1

    .line 20
    .line 21
    move v1, v3

    .line 22
    :goto_0
    move v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v1, v3, 0x1

    .line 25
    .line 26
    aget-byte v3, v2, v3

    .line 27
    .line 28
    :goto_1
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    const-wide v7, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v9, 0x1

    .line 36
    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    if-gt v3, v11, :cond_3

    .line 40
    .line 41
    shl-long v12, v9, v3

    .line 42
    .line 43
    and-long/2addr v12, v7

    .line 44
    cmp-long v12, v12, v5

    .line 45
    .line 46
    if-eqz v12, :cond_3

    .line 47
    .line 48
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 49
    .line 50
    if-ne v1, v3, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 54
    .line 55
    aget-byte v1, v2, v1

    .line 56
    .line 57
    move/from16 v16, v3

    .line 58
    .line 59
    move v3, v1

    .line 60
    move/from16 v1, v16

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/16 v12, 0x2c

    .line 64
    .line 65
    const/4 v13, 0x1

    .line 66
    if-ne v3, v12, :cond_6

    .line 67
    .line 68
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 69
    .line 70
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 71
    .line 72
    if-ne v1, v3, :cond_4

    .line 73
    .line 74
    move v3, v1

    .line 75
    move v1, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-int/lit8 v3, v1, 0x1

    .line 78
    .line 79
    aget-byte v1, v2, v1

    .line 80
    .line 81
    :goto_2
    move/from16 v16, v3

    .line 82
    .line 83
    move v3, v1

    .line 84
    move/from16 v1, v16

    .line 85
    .line 86
    :goto_3
    if-gt v3, v11, :cond_6

    .line 87
    .line 88
    shl-long v14, v9, v3

    .line 89
    .line 90
    and-long/2addr v14, v7

    .line 91
    cmp-long v12, v14, v5

    .line 92
    .line 93
    if-eqz v12, :cond_6

    .line 94
    .line 95
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 96
    .line 97
    if-ne v1, v3, :cond_5

    .line 98
    .line 99
    move v3, v4

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    add-int/lit8 v3, v1, 0x1

    .line 102
    .line 103
    aget-byte v1, v2, v1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    if-gez v3, :cond_7

    .line 107
    .line 108
    invoke-direct {v0, v3, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 109
    .line 110
    .line 111
    return v13

    .line 112
    :cond_7
    int-to-char v2, v3

    .line 113
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    const/16 v1, 0x2f

    .line 118
    .line 119
    if-ne v3, v1, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 122
    .line 123
    .line 124
    :cond_8
    return v13
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
    const/16 v4, 0x20

    .line 27
    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    const-wide/16 v4, 0x1

    .line 31
    .line 32
    shl-long/2addr v4, v1

    .line 33
    const-wide v6, 0x100003701L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 46
    .line 47
    if-ne v2, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    add-int/lit8 v1, v2, 0x1

    .line 51
    .line 52
    aget-byte v2, v0, v2

    .line 53
    .line 54
    move v8, v2

    .line 55
    move v2, v1

    .line 56
    move v1, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v0, 0x1

    .line 59
    if-gez v1, :cond_4

    .line 60
    .line 61
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 62
    .line 63
    .line 64
    return v0

    .line 65
    :cond_4
    int-to-char v3, v1

    .line 66
    iput-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 67
    .line 68
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    const/16 v2, 0x2f

    .line 71
    .line 72
    if-ne v1, v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 75
    .line 76
    .line 77
    :cond_5
    return v0
.end method

.method public final nextIfSet()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x53

    .line 8
    .line 9
    if-ne v2, v3, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 14
    .line 15
    if-ge v2, v3, :cond_3

    .line 16
    .line 17
    aget-byte v4, v0, v1

    .line 18
    .line 19
    const/16 v5, 0x65

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    aget-byte v2, v0, v2

    .line 24
    .line 25
    const/16 v4, 0x74

    .line 26
    .line 27
    if-ne v2, v4, :cond_3

    .line 28
    .line 29
    add-int/lit8 v2, v1, 0x2

    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    if-ne v2, v3, :cond_0

    .line 34
    .line 35
    move v1, v2

    .line 36
    :goto_0
    move v2, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x3

    .line 39
    .line 40
    aget-byte v2, v0, v2

    .line 41
    .line 42
    :goto_1
    const/16 v3, 0x20

    .line 43
    .line 44
    if-gt v2, v3, :cond_2

    .line 45
    .line 46
    const-wide/16 v5, 0x1

    .line 47
    .line 48
    shl-long/2addr v5, v2

    .line 49
    const-wide v7, 0x100003701L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v5, v7

    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    cmp-long v3, v5, v7

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 62
    .line 63
    if-ne v1, v2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    aget-byte v1, v0, v1

    .line 69
    .line 70
    move v9, v2

    .line 71
    move v2, v1

    .line 72
    move v1, v9

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    int-to-char v0, v2

    .line 77
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    return v0

    .line 81
    :cond_3
    const/4 v0, 0x0

    .line 82
    return v0
.end method

.method public final nextIfValue4Match10(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xb

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x8

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    aget-byte p1, v0, v2

    .line 32
    .line 33
    and-int/lit16 p1, p1, 0xff

    .line 34
    .line 35
    const/16 p2, 0x2c

    .line 36
    .line 37
    if-eq p1, p2, :cond_2

    .line 38
    .line 39
    const/16 v3, 0x7d

    .line 40
    .line 41
    if-eq p1, v3, :cond_2

    .line 42
    .line 43
    const/16 v3, 0x5d

    .line 44
    .line 45
    if-eq p1, v3, :cond_2

    .line 46
    .line 47
    return v4

    .line 48
    :cond_2
    const/4 v3, 0x1

    .line 49
    if-ne p1, p2, :cond_4

    .line 50
    .line 51
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 52
    .line 53
    add-int/lit8 v2, v1, 0xc

    .line 54
    .line 55
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 56
    .line 57
    if-ne v2, p1, :cond_3

    .line 58
    .line 59
    const/16 p1, 0x1a

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    aget-byte p1, v0, v2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 66
    .line 67
    if-gt p1, p2, :cond_5

    .line 68
    .line 69
    const-wide/16 v4, 0x1

    .line 70
    .line 71
    shl-long/2addr v4, p1

    .line 72
    const-wide v6, 0x100003701L

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v4, v6

    .line 78
    const-wide/16 v6, 0x0

    .line 79
    .line 80
    cmp-long p2, v4, v6

    .line 81
    .line 82
    if-eqz p2, :cond_5

    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    aget-byte p1, v0, v2

    .line 87
    .line 88
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    add-int/2addr v2, v3

    .line 92
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    int-to-char p1, p1

    .line 95
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 96
    .line 97
    return v3
.end method

.method public final nextIfValue4Match11(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xc

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x9

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long p1, v5, p1

    .line 27
    .line 28
    if-nez p1, :cond_6

    .line 29
    .line 30
    add-int/lit8 p1, v1, 0xb

    .line 31
    .line 32
    aget-byte p1, v0, p1

    .line 33
    .line 34
    const/16 p2, 0x22

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    aget-byte p1, v0, v2

    .line 40
    .line 41
    and-int/lit16 p1, p1, 0xff

    .line 42
    .line 43
    const/16 p2, 0x2c

    .line 44
    .line 45
    if-eq p1, p2, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x7d

    .line 48
    .line 49
    if-eq p1, v3, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x5d

    .line 52
    .line 53
    if-eq p1, v3, :cond_2

    .line 54
    .line 55
    return v4

    .line 56
    :cond_2
    const/4 v3, 0x1

    .line 57
    if-ne p1, p2, :cond_4

    .line 58
    .line 59
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 60
    .line 61
    add-int/lit8 v2, v1, 0xd

    .line 62
    .line 63
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 64
    .line 65
    if-ne v2, p1, :cond_3

    .line 66
    .line 67
    const/16 p1, 0x1a

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    aget-byte p1, v0, v2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 74
    .line 75
    if-gt p1, p2, :cond_5

    .line 76
    .line 77
    const-wide/16 v4, 0x1

    .line 78
    .line 79
    shl-long/2addr v4, p1

    .line 80
    const-wide v6, 0x100003701L

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr v4, v6

    .line 86
    const-wide/16 v6, 0x0

    .line 87
    .line 88
    cmp-long p2, v4, v6

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    aget-byte p1, v0, v2

    .line 95
    .line 96
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    add-int/2addr v2, v3

    .line 100
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    int-to-char p1, p1

    .line 103
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    return v3

    .line 106
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextIfValue4Match2()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x4

    .line 14
    .line 15
    aget-byte v2, v0, v2

    .line 16
    .line 17
    and-int/lit16 v2, v2, 0xff

    .line 18
    .line 19
    const/16 v6, 0x2c

    .line 20
    .line 21
    if-eq v2, v6, :cond_1

    .line 22
    .line 23
    const/16 v7, 0x7d

    .line 24
    .line 25
    if-eq v2, v7, :cond_1

    .line 26
    .line 27
    const/16 v7, 0x5d

    .line 28
    .line 29
    if-eq v2, v7, :cond_1

    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    const/4 v4, 0x1

    .line 33
    if-ne v2, v6, :cond_3

    .line 34
    .line 35
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 36
    .line 37
    if-ne v5, v3, :cond_2

    .line 38
    .line 39
    const/16 v1, 0x1a

    .line 40
    .line 41
    move v2, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    add-int/lit8 v1, v1, 0x5

    .line 44
    .line 45
    aget-byte v2, v0, v5

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :goto_0
    const/16 v1, 0x20

    .line 49
    .line 50
    if-gt v2, v1, :cond_4

    .line 51
    .line 52
    const-wide/16 v6, 0x1

    .line 53
    .line 54
    shl-long/2addr v6, v2

    .line 55
    const-wide v8, 0x100003701L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v6, v8

    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    cmp-long v1, v6, v8

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    add-int/lit8 v1, v5, 0x1

    .line 68
    .line 69
    aget-byte v2, v0, v5

    .line 70
    .line 71
    :goto_1
    and-int/lit16 v2, v2, 0xff

    .line 72
    .line 73
    move v5, v1

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 76
    .line 77
    int-to-char v0, v2

    .line 78
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 79
    .line 80
    return v4
.end method

.method public final nextIfValue4Match3()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-byte v5, v0, v5

    .line 16
    .line 17
    const/16 v6, 0x22

    .line 18
    .line 19
    if-eq v5, v6, :cond_1

    .line 20
    .line 21
    return v4

    .line 22
    :cond_1
    aget-byte v5, v0, v2

    .line 23
    .line 24
    and-int/lit16 v5, v5, 0xff

    .line 25
    .line 26
    const/16 v6, 0x2c

    .line 27
    .line 28
    if-eq v5, v6, :cond_2

    .line 29
    .line 30
    const/16 v7, 0x7d

    .line 31
    .line 32
    if-eq v5, v7, :cond_2

    .line 33
    .line 34
    const/16 v7, 0x5d

    .line 35
    .line 36
    if-eq v5, v7, :cond_2

    .line 37
    .line 38
    return v4

    .line 39
    :cond_2
    const/4 v4, 0x1

    .line 40
    if-ne v5, v6, :cond_4

    .line 41
    .line 42
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 43
    .line 44
    add-int/lit8 v2, v1, 0x5

    .line 45
    .line 46
    if-ne v2, v3, :cond_3

    .line 47
    .line 48
    const/16 v1, 0x1a

    .line 49
    .line 50
    :goto_0
    move v5, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    aget-byte v1, v0, v2

    .line 53
    .line 54
    and-int/lit16 v1, v1, 0xff

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_1
    const/16 v1, 0x20

    .line 58
    .line 59
    if-gt v5, v1, :cond_5

    .line 60
    .line 61
    const-wide/16 v6, 0x1

    .line 62
    .line 63
    shl-long/2addr v6, v5

    .line 64
    const-wide v8, 0x100003701L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v6, v8

    .line 70
    const-wide/16 v8, 0x0

    .line 71
    .line 72
    cmp-long v1, v6, v8

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    aget-byte v1, v0, v2

    .line 79
    .line 80
    and-int/lit16 v5, v1, 0xff

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    add-int/2addr v2, v4

    .line 84
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    int-to-char v0, v5

    .line 87
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 88
    .line 89
    return v4
.end method

.method public final nextIfValue4Match4(B)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x5

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-byte v5, v0, v5

    .line 16
    .line 17
    if-ne v5, p1, :cond_6

    .line 18
    .line 19
    add-int/lit8 p1, v1, 0x4

    .line 20
    .line 21
    aget-byte p1, v0, p1

    .line 22
    .line 23
    const/16 v5, 0x22

    .line 24
    .line 25
    if-eq p1, v5, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    aget-byte p1, v0, v2

    .line 29
    .line 30
    and-int/lit16 p1, p1, 0xff

    .line 31
    .line 32
    const/16 v5, 0x2c

    .line 33
    .line 34
    if-eq p1, v5, :cond_2

    .line 35
    .line 36
    const/16 v6, 0x7d

    .line 37
    .line 38
    if-eq p1, v6, :cond_2

    .line 39
    .line 40
    const/16 v6, 0x5d

    .line 41
    .line 42
    if-eq p1, v6, :cond_2

    .line 43
    .line 44
    return v4

    .line 45
    :cond_2
    const/4 v4, 0x1

    .line 46
    if-ne p1, v5, :cond_4

    .line 47
    .line 48
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 49
    .line 50
    add-int/lit8 v2, v1, 0x6

    .line 51
    .line 52
    if-ne v2, v3, :cond_3

    .line 53
    .line 54
    const/16 p1, 0x1a

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    aget-byte p1, v0, v2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 61
    .line 62
    if-gt p1, v1, :cond_5

    .line 63
    .line 64
    const-wide/16 v5, 0x1

    .line 65
    .line 66
    shl-long/2addr v5, p1

    .line 67
    const-wide v7, 0x100003701L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v5, v7

    .line 73
    const-wide/16 v7, 0x0

    .line 74
    .line 75
    cmp-long v1, v5, v7

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    aget-byte p1, v0, v2

    .line 82
    .line 83
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    add-int/2addr v2, v4

    .line 87
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    int-to-char p1, p1

    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextIfValue4Match5(BB)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x6

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-byte v5, v0, v5

    .line 16
    .line 17
    if-ne v5, p1, :cond_6

    .line 18
    .line 19
    add-int/lit8 p1, v1, 0x4

    .line 20
    .line 21
    aget-byte p1, v0, p1

    .line 22
    .line 23
    if-ne p1, p2, :cond_6

    .line 24
    .line 25
    add-int/lit8 p1, v1, 0x5

    .line 26
    .line 27
    aget-byte p1, v0, p1

    .line 28
    .line 29
    const/16 p2, 0x22

    .line 30
    .line 31
    if-eq p1, p2, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    aget-byte p1, v0, v2

    .line 35
    .line 36
    and-int/lit16 p1, p1, 0xff

    .line 37
    .line 38
    const/16 p2, 0x2c

    .line 39
    .line 40
    if-eq p1, p2, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x7d

    .line 43
    .line 44
    if-eq p1, v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x5d

    .line 47
    .line 48
    if-eq p1, v5, :cond_2

    .line 49
    .line 50
    return v4

    .line 51
    :cond_2
    const/4 v4, 0x1

    .line 52
    if-ne p1, p2, :cond_4

    .line 53
    .line 54
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 55
    .line 56
    add-int/lit8 v2, v1, 0x7

    .line 57
    .line 58
    if-ne v2, v3, :cond_3

    .line 59
    .line 60
    const/16 p1, 0x1a

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    aget-byte p1, v0, v2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 67
    .line 68
    if-gt p1, p2, :cond_5

    .line 69
    .line 70
    const-wide/16 v5, 0x1

    .line 71
    .line 72
    shl-long/2addr v5, p1

    .line 73
    const-wide v7, 0x100003701L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v5, v7

    .line 79
    const-wide/16 v7, 0x0

    .line 80
    .line 81
    cmp-long p2, v5, v7

    .line 82
    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    aget-byte p1, v0, v2

    .line 88
    .line 89
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    add-int/2addr v2, v4

    .line 93
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 94
    .line 95
    int-to-char p1, p1

    .line 96
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 97
    .line 98
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextIfValue4Match6(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x7

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x4

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eq v3, p1, :cond_1

    .line 27
    .line 28
    return v4

    .line 29
    :cond_1
    aget-byte p1, v0, v2

    .line 30
    .line 31
    and-int/lit16 p1, p1, 0xff

    .line 32
    .line 33
    const/16 v3, 0x2c

    .line 34
    .line 35
    if-eq p1, v3, :cond_2

    .line 36
    .line 37
    const/16 v5, 0x7d

    .line 38
    .line 39
    if-eq p1, v5, :cond_2

    .line 40
    .line 41
    const/16 v5, 0x5d

    .line 42
    .line 43
    if-eq p1, v5, :cond_2

    .line 44
    .line 45
    return v4

    .line 46
    :cond_2
    const/4 v4, 0x1

    .line 47
    if-ne p1, v3, :cond_4

    .line 48
    .line 49
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    add-int/lit8 v2, v1, 0x8

    .line 52
    .line 53
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 54
    .line 55
    if-ne v2, p1, :cond_3

    .line 56
    .line 57
    const/16 p1, 0x1a

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    aget-byte p1, v0, v2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 64
    .line 65
    if-gt p1, v1, :cond_5

    .line 66
    .line 67
    const-wide/16 v5, 0x1

    .line 68
    .line 69
    shl-long/2addr v5, p1

    .line 70
    const-wide v7, 0x100003701L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v5, v7

    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    cmp-long v1, v5, v7

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    aget-byte p1, v0, v2

    .line 85
    .line 86
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    add-int/2addr v2, v4

    .line 90
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 91
    .line 92
    int-to-char p1, p1

    .line 93
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 94
    .line 95
    return v4
.end method

.method public final nextIfValue4Match7(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x5

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ne v3, p1, :cond_6

    .line 27
    .line 28
    add-int/lit8 p1, v1, 0x7

    .line 29
    .line 30
    aget-byte p1, v0, p1

    .line 31
    .line 32
    const/16 v3, 0x22

    .line 33
    .line 34
    if-eq p1, v3, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    aget-byte p1, v0, v2

    .line 38
    .line 39
    and-int/lit16 p1, p1, 0xff

    .line 40
    .line 41
    const/16 v3, 0x2c

    .line 42
    .line 43
    if-eq p1, v3, :cond_2

    .line 44
    .line 45
    const/16 v5, 0x7d

    .line 46
    .line 47
    if-eq p1, v5, :cond_2

    .line 48
    .line 49
    const/16 v5, 0x5d

    .line 50
    .line 51
    if-eq p1, v5, :cond_2

    .line 52
    .line 53
    return v4

    .line 54
    :cond_2
    const/4 v4, 0x1

    .line 55
    if-ne p1, v3, :cond_4

    .line 56
    .line 57
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 58
    .line 59
    add-int/lit8 v2, v1, 0x9

    .line 60
    .line 61
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 62
    .line 63
    if-ne v2, p1, :cond_3

    .line 64
    .line 65
    const/16 p1, 0x1a

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    aget-byte p1, v0, v2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 72
    .line 73
    if-gt p1, v1, :cond_5

    .line 74
    .line 75
    const-wide/16 v5, 0x1

    .line 76
    .line 77
    shl-long/2addr v5, p1

    .line 78
    const-wide v7, 0x100003701L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v5, v7

    .line 84
    const-wide/16 v7, 0x0

    .line 85
    .line 86
    cmp-long v1, v5, v7

    .line 87
    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    aget-byte p1, v0, v2

    .line 93
    .line 94
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    add-int/2addr v2, v4

    .line 98
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 99
    .line 100
    int-to-char p1, p1

    .line 101
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 102
    .line 103
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextIfValue4Match8(IB)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x6

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ne v3, p1, :cond_6

    .line 27
    .line 28
    add-int/lit8 p1, v1, 0x7

    .line 29
    .line 30
    aget-byte p1, v0, p1

    .line 31
    .line 32
    if-ne p1, p2, :cond_6

    .line 33
    .line 34
    add-int/lit8 p1, v1, 0x8

    .line 35
    .line 36
    aget-byte p1, v0, p1

    .line 37
    .line 38
    const/16 p2, 0x22

    .line 39
    .line 40
    if-eq p1, p2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    aget-byte p1, v0, v2

    .line 44
    .line 45
    and-int/lit16 p1, p1, 0xff

    .line 46
    .line 47
    const/16 p2, 0x2c

    .line 48
    .line 49
    if-eq p1, p2, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x7d

    .line 52
    .line 53
    if-eq p1, v3, :cond_2

    .line 54
    .line 55
    const/16 v3, 0x5d

    .line 56
    .line 57
    if-eq p1, v3, :cond_2

    .line 58
    .line 59
    return v4

    .line 60
    :cond_2
    const/4 v3, 0x1

    .line 61
    if-ne p1, p2, :cond_4

    .line 62
    .line 63
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 64
    .line 65
    add-int/lit8 v2, v1, 0xa

    .line 66
    .line 67
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 68
    .line 69
    if-ne v2, p1, :cond_3

    .line 70
    .line 71
    const/16 p1, 0x1a

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    aget-byte p1, v0, v2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 78
    .line 79
    if-gt p1, p2, :cond_5

    .line 80
    .line 81
    const-wide/16 v4, 0x1

    .line 82
    .line 83
    shl-long/2addr v4, p1

    .line 84
    const-wide v6, 0x100003701L

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v4, v6

    .line 90
    const-wide/16 v6, 0x0

    .line 91
    .line 92
    cmp-long p2, v4, v6

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    aget-byte p1, v0, v2

    .line 99
    .line 100
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    add-int/2addr v2, v3

    .line 104
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    int-to-char p1, p1

    .line 107
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 108
    .line 109
    return v3

    .line 110
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextIfValue4Match9(IBB)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xa

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 16
    .line 17
    int-to-long v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    const-wide/16 v7, 0x7

    .line 20
    .line 21
    sub-long/2addr v5, v7

    .line 22
    invoke-virtual {v3, v0, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ne v3, p1, :cond_6

    .line 27
    .line 28
    add-int/lit8 p1, v1, 0x7

    .line 29
    .line 30
    aget-byte p1, v0, p1

    .line 31
    .line 32
    if-ne p1, p2, :cond_6

    .line 33
    .line 34
    add-int/lit8 p1, v1, 0x8

    .line 35
    .line 36
    aget-byte p1, v0, p1

    .line 37
    .line 38
    if-ne p1, p3, :cond_6

    .line 39
    .line 40
    add-int/lit8 p1, v1, 0x9

    .line 41
    .line 42
    aget-byte p1, v0, p1

    .line 43
    .line 44
    const/16 p2, 0x22

    .line 45
    .line 46
    if-eq p1, p2, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    aget-byte p1, v0, v2

    .line 50
    .line 51
    and-int/lit16 p1, p1, 0xff

    .line 52
    .line 53
    const/16 p2, 0x2c

    .line 54
    .line 55
    if-eq p1, p2, :cond_2

    .line 56
    .line 57
    const/16 p3, 0x7d

    .line 58
    .line 59
    if-eq p1, p3, :cond_2

    .line 60
    .line 61
    const/16 p3, 0x5d

    .line 62
    .line 63
    if-eq p1, p3, :cond_2

    .line 64
    .line 65
    return v4

    .line 66
    :cond_2
    const/4 p3, 0x1

    .line 67
    if-ne p1, p2, :cond_4

    .line 68
    .line 69
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 70
    .line 71
    add-int/lit8 v2, v1, 0xb

    .line 72
    .line 73
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 74
    .line 75
    if-ne v2, p1, :cond_3

    .line 76
    .line 77
    const/16 p1, 0x1a

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    aget-byte p1, v0, v2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 84
    .line 85
    if-gt p1, p2, :cond_5

    .line 86
    .line 87
    const-wide/16 v3, 0x1

    .line 88
    .line 89
    shl-long/2addr v3, p1

    .line 90
    const-wide v5, 0x100003701L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v3, v5

    .line 96
    const-wide/16 v5, 0x0

    .line 97
    .line 98
    cmp-long p2, v3, v5

    .line 99
    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    aget-byte p1, v0, v2

    .line 105
    .line 106
    :goto_1
    and-int/lit16 p1, p1, 0xff

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    add-int/2addr v2, p3

    .line 110
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    int-to-char p1, p1

    .line 113
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    return p3

    .line 116
    :cond_6
    :goto_2
    return v4
.end method

.method public final nextWithoutComment()V
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
    const/16 v4, 0x20

    .line 19
    .line 20
    if-gt v1, v4, :cond_2

    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    shl-long/2addr v4, v1

    .line 25
    const-wide v6, 0x100003701L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v4, v4, v6

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 38
    .line 39
    if-ne v2, v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v1, v2, 0x1

    .line 43
    .line 44
    aget-byte v2, v0, v2

    .line 45
    .line 46
    move v8, v2

    .line 47
    move v2, v1

    .line 48
    move v1, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-gez v1, :cond_3

    .line 51
    .line 52
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 57
    .line 58
    int-to-char v0, v1

    .line 59
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 60
    .line 61
    return-void
.end method

.method public final readBigDecimal()Ljava/math/BigDecimal;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    const/16 v4, 0x27

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, v3

    .line 22
    move v3, v7

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 25
    .line 26
    aget-byte v9, v0, v3

    .line 27
    .line 28
    if-ne v9, v2, :cond_3

    .line 29
    .line 30
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 31
    .line 32
    if-ne v4, v2, :cond_2

    .line 33
    .line 34
    const/16 v6, 0x1a

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    add-int/2addr v3, v5

    .line 38
    aget-byte v0, v0, v4

    .line 39
    .line 40
    int-to-char v6, v0

    .line 41
    move v4, v3

    .line 42
    :goto_1
    iput-char v6, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 43
    .line 44
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfComma()Z

    .line 47
    .line 48
    .line 49
    return-object v8

    .line 50
    :cond_3
    move v3, v2

    .line 51
    move v2, v9

    .line 52
    :goto_2
    const/16 v9, 0x2b

    .line 53
    .line 54
    const/16 v10, 0x2d

    .line 55
    .line 56
    const/4 v11, 0x1

    .line 57
    if-ne v2, v10, :cond_4

    .line 58
    .line 59
    iput-boolean v11, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 60
    .line 61
    add-int/lit8 v2, v4, 0x1

    .line 62
    .line 63
    aget-byte v12, v0, v4

    .line 64
    .line 65
    :goto_3
    move/from16 v27, v12

    .line 66
    .line 67
    move v12, v2

    .line 68
    move/from16 v2, v27

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 72
    .line 73
    if-ne v2, v9, :cond_5

    .line 74
    .line 75
    add-int/lit8 v2, v4, 0x1

    .line 76
    .line 77
    aget-byte v12, v0, v4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    move v12, v4

    .line 81
    :goto_4
    iput-byte v11, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 82
    .line 83
    const-wide/16 v13, 0x0

    .line 84
    .line 85
    move v15, v7

    .line 86
    move/from16 v18, v15

    .line 87
    .line 88
    move-wide/from16 v16, v13

    .line 89
    .line 90
    :goto_5
    const/16 v19, 0x1f

    .line 91
    .line 92
    const/16 v6, 0x39

    .line 93
    .line 94
    const-wide/16 v20, 0xa

    .line 95
    .line 96
    move-object/from16 v22, v8

    .line 97
    .line 98
    const/16 v8, 0x30

    .line 99
    .line 100
    if-lt v2, v8, :cond_a

    .line 101
    .line 102
    if-gt v2, v6, :cond_a

    .line 103
    .line 104
    if-nez v15, :cond_7

    .line 105
    .line 106
    mul-long v23, v16, v20

    .line 107
    .line 108
    or-long v25, v16, v20

    .line 109
    .line 110
    ushr-long v25, v25, v19

    .line 111
    .line 112
    cmp-long v18, v25, v13

    .line 113
    .line 114
    if-eqz v18, :cond_8

    .line 115
    .line 116
    div-long v25, v23, v20

    .line 117
    .line 118
    cmp-long v18, v25, v16

    .line 119
    .line 120
    if-nez v18, :cond_6

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    move v15, v11

    .line 124
    :cond_7
    move-wide/from16 v25, v13

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, -0x30

    .line 128
    .line 129
    move-wide/from16 v25, v13

    .line 130
    .line 131
    int-to-long v13, v2

    .line 132
    add-long v16, v23, v13

    .line 133
    .line 134
    :goto_7
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 135
    .line 136
    if-ne v12, v2, :cond_9

    .line 137
    .line 138
    add-int/lit8 v12, v12, 0x1

    .line 139
    .line 140
    move/from16 v18, v11

    .line 141
    .line 142
    const/16 v2, 0x1a

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_9
    add-int/lit8 v2, v12, 0x1

    .line 146
    .line 147
    aget-byte v6, v0, v12

    .line 148
    .line 149
    move v12, v2

    .line 150
    move v2, v6

    .line 151
    move/from16 v18, v11

    .line 152
    .line 153
    move-object/from16 v8, v22

    .line 154
    .line 155
    move-wide/from16 v13, v25

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    move-wide/from16 v25, v13

    .line 159
    .line 160
    :goto_8
    cmp-long v13, v16, v25

    .line 161
    .line 162
    if-gez v13, :cond_b

    .line 163
    .line 164
    move v15, v11

    .line 165
    :cond_b
    iput-short v7, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 166
    .line 167
    const/16 v13, 0x2e

    .line 168
    .line 169
    if-ne v2, v13, :cond_10

    .line 170
    .line 171
    iput-byte v5, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 172
    .line 173
    add-int/lit8 v2, v12, 0x1

    .line 174
    .line 175
    aget-byte v12, v0, v12

    .line 176
    .line 177
    move/from16 v27, v12

    .line 178
    .line 179
    move v12, v2

    .line 180
    move/from16 v2, v27

    .line 181
    .line 182
    :goto_9
    if-lt v2, v8, :cond_10

    .line 183
    .line 184
    if-gt v2, v6, :cond_10

    .line 185
    .line 186
    iget-short v13, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 187
    .line 188
    add-int/2addr v13, v11

    .line 189
    int-to-short v13, v13

    .line 190
    iput-short v13, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 191
    .line 192
    if-nez v15, :cond_e

    .line 193
    .line 194
    mul-long v13, v16, v20

    .line 195
    .line 196
    or-long v23, v16, v20

    .line 197
    .line 198
    ushr-long v23, v23, v19

    .line 199
    .line 200
    cmp-long v18, v23, v25

    .line 201
    .line 202
    if-eqz v18, :cond_d

    .line 203
    .line 204
    div-long v23, v13, v20

    .line 205
    .line 206
    cmp-long v18, v23, v16

    .line 207
    .line 208
    if-nez v18, :cond_c

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_c
    move v15, v11

    .line 212
    goto :goto_b

    .line 213
    :cond_d
    :goto_a
    add-int/lit8 v2, v2, -0x30

    .line 214
    .line 215
    int-to-long v5, v2

    .line 216
    add-long/2addr v13, v5

    .line 217
    move-wide/from16 v16, v13

    .line 218
    .line 219
    :cond_e
    :goto_b
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 220
    .line 221
    if-ne v12, v2, :cond_f

    .line 222
    .line 223
    add-int/lit8 v12, v12, 0x1

    .line 224
    .line 225
    move/from16 v18, v11

    .line 226
    .line 227
    move-wide/from16 v5, v16

    .line 228
    .line 229
    const/16 v2, 0x1a

    .line 230
    .line 231
    goto :goto_c

    .line 232
    :cond_f
    add-int/lit8 v2, v12, 0x1

    .line 233
    .line 234
    aget-byte v5, v0, v12

    .line 235
    .line 236
    move v12, v2

    .line 237
    move v2, v5

    .line 238
    move/from16 v18, v11

    .line 239
    .line 240
    const/4 v5, 0x2

    .line 241
    const/16 v6, 0x39

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_10
    move-wide/from16 v5, v16

    .line 245
    .line 246
    :goto_c
    const/16 v13, 0x65

    .line 247
    .line 248
    if-eq v2, v13, :cond_12

    .line 249
    .line 250
    const/16 v14, 0x45

    .line 251
    .line 252
    if-ne v2, v14, :cond_11

    .line 253
    .line 254
    goto :goto_d

    .line 255
    :cond_11
    move v9, v7

    .line 256
    goto :goto_12

    .line 257
    :cond_12
    :goto_d
    add-int/lit8 v2, v12, 0x1

    .line 258
    .line 259
    aget-byte v14, v0, v12

    .line 260
    .line 261
    if-ne v14, v10, :cond_13

    .line 262
    .line 263
    move v10, v11

    .line 264
    goto :goto_e

    .line 265
    :cond_13
    move v10, v7

    .line 266
    :goto_e
    if-nez v10, :cond_15

    .line 267
    .line 268
    if-ne v14, v9, :cond_14

    .line 269
    .line 270
    goto :goto_f

    .line 271
    :cond_14
    move v9, v7

    .line 272
    goto :goto_10

    .line 273
    :cond_15
    :goto_f
    add-int/lit8 v12, v12, 0x2

    .line 274
    .line 275
    aget-byte v14, v0, v2

    .line 276
    .line 277
    move v9, v7

    .line 278
    move v2, v12

    .line 279
    :goto_10
    if-lt v14, v8, :cond_18

    .line 280
    .line 281
    const/16 v12, 0x39

    .line 282
    .line 283
    if-gt v14, v12, :cond_18

    .line 284
    .line 285
    add-int/lit8 v14, v14, -0x30

    .line 286
    .line 287
    mul-int/lit8 v9, v9, 0xa

    .line 288
    .line 289
    add-int/2addr v9, v14

    .line 290
    const/16 v14, 0x7ff

    .line 291
    .line 292
    if-gt v9, v14, :cond_17

    .line 293
    .line 294
    iget v14, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 295
    .line 296
    if-ne v2, v14, :cond_16

    .line 297
    .line 298
    add-int/lit8 v2, v2, 0x1

    .line 299
    .line 300
    move v12, v2

    .line 301
    move/from16 v18, v11

    .line 302
    .line 303
    const/16 v2, 0x1a

    .line 304
    .line 305
    goto :goto_11

    .line 306
    :cond_16
    add-int/lit8 v14, v2, 0x1

    .line 307
    .line 308
    aget-byte v2, v0, v2

    .line 309
    .line 310
    move/from16 v18, v14

    .line 311
    .line 312
    move v14, v2

    .line 313
    move/from16 v2, v18

    .line 314
    .line 315
    move/from16 v18, v11

    .line 316
    .line 317
    goto :goto_10

    .line 318
    :cond_17
    const-string v0, "too large exp value : "

    .line 319
    .line 320
    invoke-static {v9, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    return-object v0

    .line 329
    :cond_18
    move v12, v2

    .line 330
    move v2, v14

    .line 331
    :goto_11
    if-eqz v10, :cond_19

    .line 332
    .line 333
    neg-int v9, v9

    .line 334
    :cond_19
    int-to-short v8, v9

    .line 335
    iput-short v8, v1, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 336
    .line 337
    const/4 v8, 0x2

    .line 338
    iput-byte v8, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 339
    .line 340
    :goto_12
    if-ne v12, v4, :cond_26

    .line 341
    .line 342
    const/16 v8, 0x6e

    .line 343
    .line 344
    const/16 v10, 0x75

    .line 345
    .line 346
    const/16 v14, 0x6c

    .line 347
    .line 348
    if-ne v2, v8, :cond_1e

    .line 349
    .line 350
    add-int/lit8 v8, v12, 0x1

    .line 351
    .line 352
    aget-byte v7, v0, v12

    .line 353
    .line 354
    if-ne v7, v10, :cond_1c

    .line 355
    .line 356
    add-int/lit8 v7, v12, 0x2

    .line 357
    .line 358
    aget-byte v8, v0, v8

    .line 359
    .line 360
    if-ne v8, v14, :cond_1d

    .line 361
    .line 362
    add-int/lit8 v8, v12, 0x3

    .line 363
    .line 364
    aget-byte v7, v0, v7

    .line 365
    .line 366
    if-ne v7, v14, :cond_1c

    .line 367
    .line 368
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 369
    .line 370
    iget-wide v13, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 371
    .line 372
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 373
    .line 374
    move/from16 v19, v12

    .line 375
    .line 376
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 377
    .line 378
    and-long v10, v13, v11

    .line 379
    .line 380
    cmp-long v2, v10, v25

    .line 381
    .line 382
    if-nez v2, :cond_1b

    .line 383
    .line 384
    const/4 v2, 0x1

    .line 385
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 386
    .line 387
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 388
    .line 389
    if-ne v8, v2, :cond_1a

    .line 390
    .line 391
    const/16 v2, 0x1a

    .line 392
    .line 393
    goto :goto_13

    .line 394
    :cond_1a
    aget-byte v2, v0, v8

    .line 395
    .line 396
    :goto_13
    add-int/lit8 v12, v19, 0x4

    .line 397
    .line 398
    :goto_14
    const/4 v7, 0x0

    .line 399
    const/4 v8, 0x1

    .line 400
    const/16 v18, 0x1

    .line 401
    .line 402
    goto/16 :goto_1a

    .line 403
    .line 404
    :cond_1b
    const-string v0, "long value not support input null"

    .line 405
    .line 406
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const/4 v0, 0x0

    .line 414
    return-object v0

    .line 415
    :cond_1c
    move v12, v8

    .line 416
    goto :goto_15

    .line 417
    :cond_1d
    move v12, v7

    .line 418
    goto :goto_15

    .line 419
    :cond_1e
    move/from16 v19, v12

    .line 420
    .line 421
    :goto_15
    const/16 v7, 0x74

    .line 422
    .line 423
    if-ne v2, v7, :cond_20

    .line 424
    .line 425
    add-int/lit8 v7, v12, 0x3

    .line 426
    .line 427
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 428
    .line 429
    if-gt v7, v8, :cond_20

    .line 430
    .line 431
    aget-byte v11, v0, v12

    .line 432
    .line 433
    const/16 v14, 0x72

    .line 434
    .line 435
    if-ne v11, v14, :cond_20

    .line 436
    .line 437
    add-int/lit8 v11, v12, 0x1

    .line 438
    .line 439
    aget-byte v11, v0, v11

    .line 440
    .line 441
    if-ne v11, v10, :cond_20

    .line 442
    .line 443
    add-int/lit8 v10, v12, 0x2

    .line 444
    .line 445
    aget-byte v10, v0, v10

    .line 446
    .line 447
    if-ne v10, v13, :cond_20

    .line 448
    .line 449
    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 450
    .line 451
    if-ne v7, v8, :cond_1f

    .line 452
    .line 453
    const/16 v7, 0x1a

    .line 454
    .line 455
    goto :goto_16

    .line 456
    :cond_1f
    aget-byte v7, v0, v7

    .line 457
    .line 458
    :goto_16
    add-int/lit8 v12, v12, 0x4

    .line 459
    .line 460
    :goto_17
    move-object/from16 v22, v2

    .line 461
    .line 462
    move v2, v7

    .line 463
    goto :goto_14

    .line 464
    :cond_20
    const/16 v7, 0x66

    .line 465
    .line 466
    if-ne v2, v7, :cond_22

    .line 467
    .line 468
    add-int/lit8 v7, v12, 0x4

    .line 469
    .line 470
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 471
    .line 472
    if-gt v7, v8, :cond_22

    .line 473
    .line 474
    aget-byte v10, v0, v12

    .line 475
    .line 476
    const/16 v11, 0x61

    .line 477
    .line 478
    if-ne v10, v11, :cond_22

    .line 479
    .line 480
    add-int/lit8 v10, v12, 0x1

    .line 481
    .line 482
    aget-byte v10, v0, v10

    .line 483
    .line 484
    const/16 v11, 0x6c

    .line 485
    .line 486
    if-ne v10, v11, :cond_22

    .line 487
    .line 488
    add-int/lit8 v10, v12, 0x2

    .line 489
    .line 490
    aget-byte v10, v0, v10

    .line 491
    .line 492
    const/16 v11, 0x73

    .line 493
    .line 494
    if-ne v10, v11, :cond_22

    .line 495
    .line 496
    add-int/lit8 v10, v12, 0x3

    .line 497
    .line 498
    aget-byte v10, v0, v10

    .line 499
    .line 500
    if-ne v10, v13, :cond_22

    .line 501
    .line 502
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 503
    .line 504
    if-ne v7, v8, :cond_21

    .line 505
    .line 506
    const/16 v7, 0x1a

    .line 507
    .line 508
    goto :goto_18

    .line 509
    :cond_21
    aget-byte v7, v0, v7

    .line 510
    .line 511
    :goto_18
    add-int/lit8 v12, v12, 0x5

    .line 512
    .line 513
    goto :goto_17

    .line 514
    :cond_22
    const/16 v7, 0x7b

    .line 515
    .line 516
    if-ne v2, v7, :cond_23

    .line 517
    .line 518
    if-nez v3, :cond_23

    .line 519
    .line 520
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 521
    .line 522
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 523
    .line 524
    .line 525
    move-wide/from16 v2, v25

    .line 526
    .line 527
    invoke-virtual {v1, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->readObject(Ljava/lang/Object;J)V

    .line 528
    .line 529
    .line 530
    const/4 v7, 0x0

    .line 531
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 532
    .line 533
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->decimal(Lcom/alibaba/fastjson2/JSONObject;)Ljava/math/BigDecimal;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    return-object v0

    .line 538
    :cond_23
    const/4 v7, 0x0

    .line 539
    const/16 v8, 0x5b

    .line 540
    .line 541
    if-ne v2, v8, :cond_25

    .line 542
    .line 543
    if-nez v3, :cond_25

    .line 544
    .line 545
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_24

    .line 554
    .line 555
    const/4 v2, 0x1

    .line 556
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 557
    .line 558
    return-object v22

    .line 559
    :cond_24
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    const/4 v0, 0x0

    .line 567
    return-object v0

    .line 568
    :cond_25
    :goto_19
    move v8, v7

    .line 569
    goto :goto_1a

    .line 570
    :cond_26
    move/from16 v19, v12

    .line 571
    .line 572
    goto :goto_19

    .line 573
    :goto_1a
    sub-int v10, v12, v4

    .line 574
    .line 575
    if-eqz v3, :cond_29

    .line 576
    .line 577
    if-eq v2, v3, :cond_27

    .line 578
    .line 579
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 584
    .line 585
    .line 586
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 587
    return-object v0

    .line 588
    :catch_0
    move-exception v0

    .line 589
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 598
    .line 599
    .line 600
    const/4 v0, 0x0

    .line 601
    return-object v0

    .line 602
    :cond_27
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 603
    .line 604
    if-lt v12, v2, :cond_28

    .line 605
    .line 606
    const/16 v2, 0x1a

    .line 607
    .line 608
    goto :goto_1b

    .line 609
    :cond_28
    add-int/lit8 v2, v12, 0x1

    .line 610
    .line 611
    aget-byte v3, v0, v12

    .line 612
    .line 613
    move v12, v2

    .line 614
    move v2, v3

    .line 615
    :cond_29
    :goto_1b
    if-nez v8, :cond_2f

    .line 616
    .line 617
    if-nez v9, :cond_2b

    .line 618
    .line 619
    if-nez v15, :cond_2b

    .line 620
    .line 621
    const-wide/16 v25, 0x0

    .line 622
    .line 623
    cmp-long v3, v5, v25

    .line 624
    .line 625
    if-eqz v3, :cond_2b

    .line 626
    .line 627
    iget-boolean v3, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 628
    .line 629
    if-eqz v3, :cond_2a

    .line 630
    .line 631
    neg-long v5, v5

    .line 632
    :cond_2a
    iget-short v3, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 633
    .line 634
    invoke-static {v5, v6, v3}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 635
    .line 636
    .line 637
    move-result-object v22

    .line 638
    const/4 v8, 0x1

    .line 639
    :cond_2b
    const/16 v17, 0x1

    .line 640
    .line 641
    if-nez v8, :cond_2c

    .line 642
    .line 643
    add-int/lit8 v4, v4, -0x1

    .line 644
    .line 645
    invoke-static {v0, v4, v10}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([BII)Ljava/math/BigDecimal;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    move-object/from16 v22, v3

    .line 650
    .line 651
    :cond_2c
    const/16 v3, 0x4c

    .line 652
    .line 653
    if-eq v2, v3, :cond_2d

    .line 654
    .line 655
    const/16 v3, 0x46

    .line 656
    .line 657
    if-eq v2, v3, :cond_2d

    .line 658
    .line 659
    const/16 v3, 0x44

    .line 660
    .line 661
    if-eq v2, v3, :cond_2d

    .line 662
    .line 663
    const/16 v3, 0x42

    .line 664
    .line 665
    if-eq v2, v3, :cond_2d

    .line 666
    .line 667
    const/16 v3, 0x53

    .line 668
    .line 669
    if-ne v2, v3, :cond_30

    .line 670
    .line 671
    :cond_2d
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 672
    .line 673
    if-lt v12, v2, :cond_2e

    .line 674
    .line 675
    :goto_1c
    const/16 v2, 0x1a

    .line 676
    .line 677
    goto :goto_1e

    .line 678
    :cond_2e
    add-int/lit8 v2, v12, 0x1

    .line 679
    .line 680
    aget-byte v3, v0, v12

    .line 681
    .line 682
    :goto_1d
    move v12, v2

    .line 683
    move v2, v3

    .line 684
    goto :goto_1e

    .line 685
    :cond_2f
    const/16 v17, 0x1

    .line 686
    .line 687
    :cond_30
    :goto_1e
    const-wide v3, 0x100003701L

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    const-wide/16 v5, 0x1

    .line 693
    .line 694
    const/16 v8, 0x20

    .line 695
    .line 696
    if-gt v2, v8, :cond_32

    .line 697
    .line 698
    shl-long v9, v5, v2

    .line 699
    .line 700
    and-long/2addr v9, v3

    .line 701
    const-wide/16 v25, 0x0

    .line 702
    .line 703
    cmp-long v9, v9, v25

    .line 704
    .line 705
    if-eqz v9, :cond_32

    .line 706
    .line 707
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 708
    .line 709
    if-ne v12, v2, :cond_31

    .line 710
    .line 711
    goto :goto_1c

    .line 712
    :cond_31
    add-int/lit8 v2, v12, 0x1

    .line 713
    .line 714
    aget-byte v3, v0, v12

    .line 715
    .line 716
    goto :goto_1d

    .line 717
    :cond_32
    const/16 v9, 0x2c

    .line 718
    .line 719
    if-ne v2, v9, :cond_33

    .line 720
    .line 721
    move/from16 v7, v17

    .line 722
    .line 723
    :cond_33
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 724
    .line 725
    if-eqz v7, :cond_36

    .line 726
    .line 727
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 728
    .line 729
    if-ne v12, v2, :cond_34

    .line 730
    .line 731
    const/16 v7, 0x1a

    .line 732
    .line 733
    goto :goto_1f

    .line 734
    :cond_34
    add-int/lit8 v2, v12, 0x1

    .line 735
    .line 736
    aget-byte v7, v0, v12

    .line 737
    .line 738
    goto :goto_21

    .line 739
    :goto_1f
    move v2, v7

    .line 740
    :goto_20
    if-gt v2, v8, :cond_36

    .line 741
    .line 742
    shl-long v9, v5, v2

    .line 743
    .line 744
    and-long/2addr v9, v3

    .line 745
    const-wide/16 v25, 0x0

    .line 746
    .line 747
    cmp-long v7, v9, v25

    .line 748
    .line 749
    if-eqz v7, :cond_36

    .line 750
    .line 751
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 752
    .line 753
    if-ne v12, v2, :cond_35

    .line 754
    .line 755
    const/16 v2, 0x1a

    .line 756
    .line 757
    goto :goto_20

    .line 758
    :cond_35
    add-int/lit8 v2, v12, 0x1

    .line 759
    .line 760
    aget-byte v7, v0, v12

    .line 761
    .line 762
    :goto_21
    move v12, v2

    .line 763
    goto :goto_1f

    .line 764
    :cond_36
    if-eqz v18, :cond_37

    .line 765
    .line 766
    int-to-char v0, v2

    .line 767
    iput-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 768
    .line 769
    iput v12, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 770
    .line 771
    return-object v22

    .line 772
    :cond_37
    const-string v0, "illegal input error"

    .line 773
    .line 774
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    const/4 v0, 0x0

    .line 782
    return-object v0
.end method

.method public final readBoolValue()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 5
    .line 6
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 9
    .line 10
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 11
    .line 12
    const/16 v5, 0x74

    .line 13
    .line 14
    const/16 v6, 0x65

    .line 15
    .line 16
    const/16 v7, 0x75

    .line 17
    .line 18
    const-wide/16 v8, 0x0

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v5, v3, 0x2

    .line 24
    .line 25
    array-length v11, v2

    .line 26
    if-ge v5, v11, :cond_1

    .line 27
    .line 28
    aget-byte v11, v2, v3

    .line 29
    .line 30
    const/16 v12, 0x72

    .line 31
    .line 32
    if-ne v11, v12, :cond_1

    .line 33
    .line 34
    add-int/lit8 v11, v3, 0x1

    .line 35
    .line 36
    aget-byte v11, v2, v11

    .line 37
    .line 38
    if-ne v11, v7, :cond_1

    .line 39
    .line 40
    aget-byte v5, v2, v5

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x3

    .line 45
    .line 46
    :cond_0
    :goto_0
    move v4, v10

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_1
    const/16 v5, 0x66

    .line 50
    .line 51
    const/16 v11, 0x6c

    .line 52
    .line 53
    if-ne v4, v5, :cond_3

    .line 54
    .line 55
    add-int/lit8 v5, v3, 0x3

    .line 56
    .line 57
    array-length v12, v2

    .line 58
    if-ge v5, v12, :cond_3

    .line 59
    .line 60
    aget-byte v12, v2, v3

    .line 61
    .line 62
    const/16 v13, 0x61

    .line 63
    .line 64
    if-ne v12, v13, :cond_3

    .line 65
    .line 66
    add-int/lit8 v12, v3, 0x1

    .line 67
    .line 68
    aget-byte v12, v2, v12

    .line 69
    .line 70
    if-ne v12, v11, :cond_3

    .line 71
    .line 72
    add-int/lit8 v12, v3, 0x2

    .line 73
    .line 74
    aget-byte v12, v2, v12

    .line 75
    .line 76
    const/16 v13, 0x73

    .line 77
    .line 78
    if-ne v12, v13, :cond_3

    .line 79
    .line 80
    aget-byte v5, v2, v5

    .line 81
    .line 82
    if-ne v5, v6, :cond_3

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x4

    .line 85
    .line 86
    :cond_2
    :goto_1
    move v4, v1

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    const/16 v5, 0x2d

    .line 90
    .line 91
    if-eq v4, v5, :cond_16

    .line 92
    .line 93
    const/16 v5, 0x30

    .line 94
    .line 95
    if-lt v4, v5, :cond_4

    .line 96
    .line 97
    const/16 v6, 0x39

    .line 98
    .line 99
    if-gt v4, v6, :cond_4

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_4
    const/16 v6, 0x6e

    .line 104
    .line 105
    if-ne v4, v6, :cond_6

    .line 106
    .line 107
    add-int/lit8 v6, v3, 0x2

    .line 108
    .line 109
    array-length v12, v2

    .line 110
    if-ge v6, v12, :cond_6

    .line 111
    .line 112
    aget-byte v12, v2, v3

    .line 113
    .line 114
    if-ne v12, v7, :cond_6

    .line 115
    .line 116
    add-int/lit8 v7, v3, 0x1

    .line 117
    .line 118
    aget-byte v7, v2, v7

    .line 119
    .line 120
    if-ne v7, v11, :cond_6

    .line 121
    .line 122
    aget-byte v6, v2, v6

    .line 123
    .line 124
    if-ne v6, v11, :cond_6

    .line 125
    .line 126
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 127
    .line 128
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 129
    .line 130
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 131
    .line 132
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 133
    .line 134
    and-long/2addr v4, v6

    .line 135
    cmp-long v4, v4, v8

    .line 136
    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    const-string v1, "boolean value not support input null"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    const/4 v1, 0x0

    .line 154
    return v1

    .line 155
    :cond_6
    const/16 v6, 0x22

    .line 156
    .line 157
    if-ne v4, v6, :cond_15

    .line 158
    .line 159
    add-int/lit8 v4, v3, 0x1

    .line 160
    .line 161
    array-length v7, v2

    .line 162
    const-string v11, "can not convert to boolean : "

    .line 163
    .line 164
    if-ge v4, v7, :cond_10

    .line 165
    .line 166
    aget-byte v4, v2, v4

    .line 167
    .line 168
    if-ne v4, v6, :cond_10

    .line 169
    .line 170
    aget-byte v4, v2, v3

    .line 171
    .line 172
    add-int/lit8 v3, v3, 0x2

    .line 173
    .line 174
    if-eq v4, v5, :cond_2

    .line 175
    .line 176
    const/16 v5, 0x4e

    .line 177
    .line 178
    if-ne v4, v5, :cond_7

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    const/16 v5, 0x31

    .line 182
    .line 183
    if-eq v4, v5, :cond_0

    .line 184
    .line 185
    const/16 v5, 0x59

    .line 186
    .line 187
    if-ne v4, v5, :cond_8

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_8
    invoke-static {v4, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :goto_3
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 200
    .line 201
    const/16 v6, 0x1a

    .line 202
    .line 203
    if-ne v3, v5, :cond_9

    .line 204
    .line 205
    move v5, v3

    .line 206
    :goto_4
    move v3, v6

    .line 207
    goto :goto_5

    .line 208
    :cond_9
    add-int/lit8 v5, v3, 0x1

    .line 209
    .line 210
    aget-byte v3, v2, v3

    .line 211
    .line 212
    int-to-char v3, v3

    .line 213
    :goto_5
    const-wide v11, 0x100003701L

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    const-wide/16 v13, 0x1

    .line 219
    .line 220
    const/16 v7, 0x20

    .line 221
    .line 222
    if-gt v3, v7, :cond_b

    .line 223
    .line 224
    shl-long v15, v13, v3

    .line 225
    .line 226
    and-long/2addr v15, v11

    .line 227
    cmp-long v15, v15, v8

    .line 228
    .line 229
    if-eqz v15, :cond_b

    .line 230
    .line 231
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 232
    .line 233
    if-lt v5, v3, :cond_a

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_a
    add-int/lit8 v3, v5, 0x1

    .line 237
    .line 238
    aget-byte v5, v2, v5

    .line 239
    .line 240
    move/from16 v17, v5

    .line 241
    .line 242
    move v5, v3

    .line 243
    move/from16 v3, v17

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_b
    const/16 v15, 0x2c

    .line 247
    .line 248
    if-ne v3, v15, :cond_c

    .line 249
    .line 250
    move v1, v10

    .line 251
    :cond_c
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 252
    .line 253
    if-eqz v1, :cond_f

    .line 254
    .line 255
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 256
    .line 257
    if-lt v5, v1, :cond_d

    .line 258
    .line 259
    :goto_6
    move v3, v6

    .line 260
    goto :goto_8

    .line 261
    :cond_d
    add-int/lit8 v1, v5, 0x1

    .line 262
    .line 263
    aget-byte v3, v2, v5

    .line 264
    .line 265
    :goto_7
    move v5, v1

    .line 266
    :goto_8
    if-gt v3, v7, :cond_f

    .line 267
    .line 268
    shl-long v15, v13, v3

    .line 269
    .line 270
    and-long/2addr v15, v11

    .line 271
    cmp-long v1, v15, v8

    .line 272
    .line 273
    if-eqz v1, :cond_f

    .line 274
    .line 275
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 276
    .line 277
    if-lt v5, v1, :cond_e

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_e
    add-int/lit8 v1, v5, 0x1

    .line 281
    .line 282
    aget-byte v3, v2, v5

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_f
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 286
    .line 287
    int-to-char v1, v3

    .line 288
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 289
    .line 290
    return v4

    .line 291
    :cond_10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const-string v3, "true"

    .line 296
    .line 297
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_11

    .line 302
    .line 303
    return v10

    .line 304
    :cond_11
    const-string v3, "false"

    .line 305
    .line 306
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_12

    .line 311
    .line 312
    return v1

    .line 313
    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_14

    .line 318
    .line 319
    const-string v3, "null"

    .line 320
    .line 321
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_13

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_13
    invoke-virtual {v11, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :cond_14
    :goto_9
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 338
    .line 339
    return v1

    .line 340
    :cond_15
    const-string v1, "syntax error : "

    .line 341
    .line 342
    invoke-static {v4, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :cond_16
    :goto_a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 352
    .line 353
    .line 354
    iget-byte v2, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 355
    .line 356
    if-ne v2, v10, :cond_1a

    .line 357
    .line 358
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 359
    .line 360
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 361
    .line 362
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 363
    .line 364
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 365
    .line 366
    and-long/2addr v2, v4

    .line 367
    cmp-long v2, v2, v8

    .line 368
    .line 369
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 370
    .line 371
    if-eqz v2, :cond_19

    .line 372
    .line 373
    if-nez v3, :cond_18

    .line 374
    .line 375
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 376
    .line 377
    if-nez v2, :cond_18

    .line 378
    .line 379
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 380
    .line 381
    if-nez v2, :cond_18

    .line 382
    .line 383
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 384
    .line 385
    if-eqz v2, :cond_17

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_17
    return v1

    .line 389
    :cond_18
    :goto_b
    return v10

    .line 390
    :cond_19
    if-nez v3, :cond_1a

    .line 391
    .line 392
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 393
    .line 394
    if-nez v2, :cond_1a

    .line 395
    .line 396
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 397
    .line 398
    if-nez v2, :cond_1a

    .line 399
    .line 400
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 401
    .line 402
    if-ne v2, v10, :cond_1a

    .line 403
    .line 404
    return v10

    .line 405
    :cond_1a
    return v1
.end method

.method public final readDoubleValue()D
    .locals 35

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
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v2, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v3

    .line 21
    move v3, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v3, v4, :cond_2

    .line 25
    .line 26
    move v5, v3

    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 31
    .line 32
    aget-byte v3, v1, v3

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-ne v3, v2, :cond_4

    .line 39
    .line 40
    if-ne v5, v4, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x1a

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 46
    .line 47
    aget-byte v3, v1, v5

    .line 48
    .line 49
    move v5, v2

    .line 50
    :goto_2
    move-object v7, v1

    .line 51
    const-wide/16 v11, 0x0

    .line 52
    .line 53
    const/4 v13, 0x1

    .line 54
    const-wide/16 v14, 0x0

    .line 55
    .line 56
    const-wide/16 v16, 0x1

    .line 57
    .line 58
    const-wide/16 v18, 0x0

    .line 59
    .line 60
    goto/16 :goto_1b

    .line 61
    .line 62
    :cond_4
    const/16 v6, 0x2b

    .line 63
    .line 64
    const/16 v7, 0x2d

    .line 65
    .line 66
    const-wide/16 v16, 0x1

    .line 67
    .line 68
    const/16 v9, 0x39

    .line 69
    .line 70
    const/16 v10, 0x30

    .line 71
    .line 72
    if-lt v3, v10, :cond_5

    .line 73
    .line 74
    if-gt v3, v9, :cond_5

    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    rsub-int/lit8 v11, v3, 0x30

    .line 79
    .line 80
    int-to-long v11, v11

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    if-eq v3, v7, :cond_6

    .line 85
    .line 86
    if-ne v3, v6, :cond_7

    .line 87
    .line 88
    :cond_6
    move-wide/from16 v11, v18

    .line 89
    .line 90
    :goto_3
    cmp-long v20, v11, v18

    .line 91
    .line 92
    const-wide/16 v21, 0x64

    .line 93
    .line 94
    const-wide v23, -0x147ae147ae147aeL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const/4 v13, -0x1

    .line 100
    if-gtz v20, :cond_8

    .line 101
    .line 102
    const-wide/16 v25, 0x0

    .line 103
    .line 104
    add-int/lit8 v14, v5, 0x1

    .line 105
    .line 106
    if-ge v14, v4, :cond_9

    .line 107
    .line 108
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eq v14, v13, :cond_9

    .line 113
    .line 114
    cmp-long v13, v23, v11

    .line 115
    .line 116
    if-gtz v13, :cond_7

    .line 117
    .line 118
    mul-long v11, v11, v21

    .line 119
    .line 120
    int-to-long v13, v14

    .line 121
    sub-long/2addr v11, v13

    .line 122
    add-int/lit8 v5, v5, 0x2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move-wide/from16 v11, v16

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    const-wide/16 v25, 0x0

    .line 129
    .line 130
    :cond_9
    const-wide/16 v27, 0xa

    .line 131
    .line 132
    const-wide v29, -0xcccccccccccccccL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-gtz v20, :cond_b

    .line 138
    .line 139
    if-ge v5, v4, :cond_b

    .line 140
    .line 141
    const-wide/16 v31, 0x30

    .line 142
    .line 143
    aget-byte v14, v1, v5

    .line 144
    .line 145
    if-lt v14, v10, :cond_c

    .line 146
    .line 147
    if-gt v14, v9, :cond_c

    .line 148
    .line 149
    cmp-long v15, v29, v11

    .line 150
    .line 151
    if-gtz v15, :cond_a

    .line 152
    .line 153
    mul-long v11, v11, v27

    .line 154
    .line 155
    add-long v11, v11, v31

    .line 156
    .line 157
    int-to-long v6, v14

    .line 158
    sub-long/2addr v11, v6

    .line 159
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_a
    move-wide/from16 v11, v16

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_b
    const-wide/16 v31, 0x30

    .line 166
    .line 167
    move v14, v3

    .line 168
    :cond_c
    :goto_4
    cmp-long v6, v11, v18

    .line 169
    .line 170
    if-gtz v6, :cond_11

    .line 171
    .line 172
    if-ge v5, v4, :cond_11

    .line 173
    .line 174
    aget-byte v6, v1, v5

    .line 175
    .line 176
    const/16 v7, 0x2e

    .line 177
    .line 178
    if-ne v6, v7, :cond_11

    .line 179
    .line 180
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    :goto_5
    cmp-long v7, v11, v18

    .line 184
    .line 185
    if-gtz v7, :cond_e

    .line 186
    .line 187
    add-int/lit8 v15, v5, 0x1

    .line 188
    .line 189
    if-ge v15, v4, :cond_e

    .line 190
    .line 191
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-eq v15, v13, :cond_e

    .line 196
    .line 197
    cmp-long v7, v23, v11

    .line 198
    .line 199
    if-gtz v7, :cond_d

    .line 200
    .line 201
    mul-long v11, v11, v21

    .line 202
    .line 203
    move/from16 v33, v14

    .line 204
    .line 205
    int-to-long v13, v15

    .line 206
    sub-long/2addr v11, v13

    .line 207
    add-int/lit8 v5, v5, 0x2

    .line 208
    .line 209
    add-int/lit8 v6, v6, 0x2

    .line 210
    .line 211
    move/from16 v14, v33

    .line 212
    .line 213
    const/4 v13, -0x1

    .line 214
    goto :goto_5

    .line 215
    :cond_d
    move-wide/from16 v11, v16

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_e
    move/from16 v33, v14

    .line 219
    .line 220
    if-gtz v7, :cond_10

    .line 221
    .line 222
    if-ge v5, v4, :cond_10

    .line 223
    .line 224
    aget-byte v14, v1, v5

    .line 225
    .line 226
    if-lt v14, v10, :cond_12

    .line 227
    .line 228
    if-gt v14, v9, :cond_12

    .line 229
    .line 230
    cmp-long v7, v29, v11

    .line 231
    .line 232
    if-gtz v7, :cond_f

    .line 233
    .line 234
    mul-long v11, v11, v27

    .line 235
    .line 236
    add-long v11, v11, v31

    .line 237
    .line 238
    int-to-long v9, v14

    .line 239
    sub-long/2addr v11, v9

    .line 240
    add-int/lit8 v5, v5, 0x1

    .line 241
    .line 242
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_f
    move-wide/from16 v11, v16

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_10
    move/from16 v14, v33

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_11
    move/from16 v33, v14

    .line 252
    .line 253
    move/from16 v14, v33

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    :cond_12
    :goto_6
    cmp-long v9, v11, v18

    .line 257
    .line 258
    if-gtz v9, :cond_14

    .line 259
    .line 260
    if-ne v5, v4, :cond_13

    .line 261
    .line 262
    const/16 v14, 0x1a

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_13
    add-int/lit8 v10, v5, 0x1

    .line 266
    .line 267
    aget-byte v5, v1, v5

    .line 268
    .line 269
    move v14, v5

    .line 270
    move v5, v10

    .line 271
    :cond_14
    :goto_7
    if-gtz v9, :cond_24

    .line 272
    .line 273
    const/16 v9, 0x65

    .line 274
    .line 275
    if-eq v14, v9, :cond_18

    .line 276
    .line 277
    const/16 v9, 0x45

    .line 278
    .line 279
    if-ne v14, v9, :cond_15

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_15
    const/16 v7, 0x4c

    .line 283
    .line 284
    if-eq v14, v7, :cond_16

    .line 285
    .line 286
    const/16 v7, 0x46

    .line 287
    .line 288
    if-eq v14, v7, :cond_16

    .line 289
    .line 290
    const/16 v7, 0x44

    .line 291
    .line 292
    if-eq v14, v7, :cond_16

    .line 293
    .line 294
    const/16 v7, 0x42

    .line 295
    .line 296
    if-eq v14, v7, :cond_16

    .line 297
    .line 298
    const/16 v7, 0x53

    .line 299
    .line 300
    if-ne v14, v7, :cond_24

    .line 301
    .line 302
    :cond_16
    if-ne v5, v4, :cond_17

    .line 303
    .line 304
    const/16 v14, 0x1a

    .line 305
    .line 306
    goto/16 :goto_12

    .line 307
    .line 308
    :cond_17
    add-int/lit8 v7, v5, 0x1

    .line 309
    .line 310
    aget-byte v5, v1, v5

    .line 311
    .line 312
    move v14, v5

    .line 313
    move v5, v7

    .line 314
    goto/16 :goto_12

    .line 315
    .line 316
    :cond_18
    :goto_8
    if-ne v5, v4, :cond_19

    .line 317
    .line 318
    move v9, v5

    .line 319
    const/16 v5, 0x1a

    .line 320
    .line 321
    :goto_9
    const/16 v10, 0x2d

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_19
    add-int/lit8 v9, v5, 0x1

    .line 325
    .line 326
    aget-byte v5, v1, v5

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :goto_a
    if-ne v5, v10, :cond_1a

    .line 330
    .line 331
    const/4 v10, 0x1

    .line 332
    goto :goto_b

    .line 333
    :cond_1a
    const/4 v10, 0x0

    .line 334
    :goto_b
    if-nez v10, :cond_1d

    .line 335
    .line 336
    const/16 v15, 0x2b

    .line 337
    .line 338
    if-ne v5, v15, :cond_1b

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_1b
    if-eq v5, v8, :cond_1c

    .line 342
    .line 343
    :goto_c
    const/16 v13, 0x30

    .line 344
    .line 345
    goto :goto_e

    .line 346
    :cond_1c
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    throw v1

    .line 351
    :cond_1d
    :goto_d
    if-ne v9, v4, :cond_1e

    .line 352
    .line 353
    const/16 v5, 0x1a

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_1e
    add-int/lit8 v5, v9, 0x1

    .line 357
    .line 358
    aget-byte v9, v1, v9

    .line 359
    .line 360
    move/from16 v34, v9

    .line 361
    .line 362
    move v9, v5

    .line 363
    move/from16 v5, v34

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :goto_e
    if-lt v5, v13, :cond_23

    .line 367
    .line 368
    const/16 v7, 0x39

    .line 369
    .line 370
    if-gt v5, v7, :cond_23

    .line 371
    .line 372
    add-int/lit8 v5, v5, -0x30

    .line 373
    .line 374
    :goto_f
    if-ge v9, v4, :cond_20

    .line 375
    .line 376
    aget-byte v14, v1, v9

    .line 377
    .line 378
    if-lt v14, v13, :cond_20

    .line 379
    .line 380
    if-gt v14, v7, :cond_20

    .line 381
    .line 382
    add-int/lit8 v14, v14, -0x30

    .line 383
    .line 384
    mul-int/lit8 v5, v5, 0xa

    .line 385
    .line 386
    add-int/2addr v5, v14

    .line 387
    const/16 v14, 0x7ff

    .line 388
    .line 389
    if-gt v5, v14, :cond_1f

    .line 390
    .line 391
    add-int/lit8 v9, v9, 0x1

    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_1f
    const-string v1, "too large exp value : "

    .line 395
    .line 396
    invoke-static {v5, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const-wide/16 v1, 0x0

    .line 404
    .line 405
    return-wide v1

    .line 406
    :cond_20
    if-eqz v10, :cond_21

    .line 407
    .line 408
    neg-int v5, v5

    .line 409
    :cond_21
    sub-int/2addr v6, v5

    .line 410
    if-ne v9, v4, :cond_22

    .line 411
    .line 412
    const/16 v7, 0x1a

    .line 413
    .line 414
    goto :goto_10

    .line 415
    :cond_22
    add-int/lit8 v5, v9, 0x1

    .line 416
    .line 417
    aget-byte v7, v1, v9

    .line 418
    .line 419
    move v9, v5

    .line 420
    :goto_10
    move v14, v7

    .line 421
    :goto_11
    move v5, v9

    .line 422
    goto :goto_12

    .line 423
    :cond_23
    move v14, v5

    .line 424
    move-wide/from16 v11, v16

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_24
    :goto_12
    cmp-long v7, v11, v18

    .line 428
    .line 429
    if-gtz v7, :cond_27

    .line 430
    .line 431
    if-eqz v2, :cond_27

    .line 432
    .line 433
    if-ne v14, v2, :cond_26

    .line 434
    .line 435
    if-ne v5, v4, :cond_25

    .line 436
    .line 437
    move v2, v5

    .line 438
    const/16 v5, 0x1a

    .line 439
    .line 440
    goto :goto_13

    .line 441
    :cond_25
    add-int/lit8 v2, v5, 0x1

    .line 442
    .line 443
    aget-byte v5, v1, v5

    .line 444
    .line 445
    :goto_13
    move v14, v5

    .line 446
    move v5, v2

    .line 447
    goto :goto_14

    .line 448
    :cond_26
    move-wide/from16 v11, v16

    .line 449
    .line 450
    :cond_27
    :goto_14
    cmp-long v2, v11, v18

    .line 451
    .line 452
    if-gtz v2, :cond_30

    .line 453
    .line 454
    if-nez v6, :cond_28

    .line 455
    .line 456
    long-to-double v9, v11

    .line 457
    move-object v7, v1

    .line 458
    move v13, v2

    .line 459
    :goto_15
    const/4 v1, 0x1

    .line 460
    goto :goto_16

    .line 461
    :cond_28
    long-to-double v9, v11

    .line 462
    move-object v7, v1

    .line 463
    move v13, v2

    .line 464
    double-to-long v1, v9

    .line 465
    cmp-long v1, v1, v11

    .line 466
    .line 467
    if-nez v1, :cond_2a

    .line 468
    .line 469
    if-lez v6, :cond_29

    .line 470
    .line 471
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_10_POW:[D

    .line 472
    .line 473
    array-length v2, v1

    .line 474
    if-ge v6, v2, :cond_29

    .line 475
    .line 476
    aget-wide v21, v1, v6

    .line 477
    .line 478
    div-double v9, v9, v21

    .line 479
    .line 480
    goto :goto_15

    .line 481
    :cond_29
    if-gez v6, :cond_2a

    .line 482
    .line 483
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_10_POW:[D

    .line 484
    .line 485
    array-length v2, v1

    .line 486
    neg-int v2, v2

    .line 487
    if-le v6, v2, :cond_2a

    .line 488
    .line 489
    neg-int v2, v6

    .line 490
    aget-wide v21, v1, v2

    .line 491
    .line 492
    mul-double v9, v9, v21

    .line 493
    .line 494
    goto :goto_15

    .line 495
    :cond_2a
    move-wide/from16 v9, v25

    .line 496
    .line 497
    const/4 v1, 0x0

    .line 498
    :goto_16
    if-nez v1, :cond_2d

    .line 499
    .line 500
    const/16 v1, -0x80

    .line 501
    .line 502
    if-le v6, v1, :cond_2c

    .line 503
    .line 504
    const/16 v1, 0x80

    .line 505
    .line 506
    if-ge v6, v1, :cond_2c

    .line 507
    .line 508
    const/16 v1, 0x2d

    .line 509
    .line 510
    if-ne v3, v1, :cond_2b

    .line 511
    .line 512
    const/4 v13, -0x1

    .line 513
    goto :goto_17

    .line 514
    :cond_2b
    const/4 v13, 0x1

    .line 515
    :goto_17
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 516
    .line 517
    .line 518
    move-result-wide v1

    .line 519
    invoke-static {v13, v1, v2, v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->doubleValue(IJI)D

    .line 520
    .line 521
    .line 522
    move-result-wide v1

    .line 523
    :goto_18
    move v3, v14

    .line 524
    const/4 v13, 0x0

    .line 525
    move-wide v14, v1

    .line 526
    goto :goto_1b

    .line 527
    :cond_2c
    move v3, v14

    .line 528
    move-wide/from16 v11, v16

    .line 529
    .line 530
    :goto_19
    const/4 v13, 0x0

    .line 531
    move-wide v14, v9

    .line 532
    goto :goto_1b

    .line 533
    :cond_2d
    const/16 v1, 0x2d

    .line 534
    .line 535
    if-eq v3, v1, :cond_2e

    .line 536
    .line 537
    cmpl-double v1, v9, v25

    .line 538
    .line 539
    if-eqz v1, :cond_2f

    .line 540
    .line 541
    :goto_1a
    neg-double v1, v9

    .line 542
    goto :goto_18

    .line 543
    :cond_2e
    if-nez v13, :cond_2f

    .line 544
    .line 545
    goto :goto_1a

    .line 546
    :cond_2f
    move v3, v14

    .line 547
    goto :goto_19

    .line 548
    :cond_30
    move-object v7, v1

    .line 549
    move v3, v14

    .line 550
    move-wide/from16 v14, v25

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    :goto_1b
    cmp-long v1, v11, v18

    .line 554
    .line 555
    if-lez v1, :cond_31

    .line 556
    .line 557
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readNumber0()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getDoubleValue()D

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    return-wide v1

    .line 565
    :cond_31
    :goto_1c
    const-wide v1, 0x100003701L

    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    const/16 v6, 0x20

    .line 571
    .line 572
    if-gt v3, v6, :cond_33

    .line 573
    .line 574
    shl-long v9, v16, v3

    .line 575
    .line 576
    and-long/2addr v9, v1

    .line 577
    cmp-long v9, v9, v18

    .line 578
    .line 579
    if-eqz v9, :cond_33

    .line 580
    .line 581
    if-ne v5, v4, :cond_32

    .line 582
    .line 583
    const/16 v3, 0x1a

    .line 584
    .line 585
    goto :goto_1c

    .line 586
    :cond_32
    add-int/lit8 v1, v5, 0x1

    .line 587
    .line 588
    aget-byte v2, v7, v5

    .line 589
    .line 590
    move v5, v1

    .line 591
    move v3, v2

    .line 592
    goto :goto_1c

    .line 593
    :cond_33
    if-ne v3, v8, :cond_34

    .line 594
    .line 595
    const/4 v8, 0x1

    .line 596
    goto :goto_1d

    .line 597
    :cond_34
    const/4 v8, 0x0

    .line 598
    :goto_1d
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 599
    .line 600
    if-eqz v8, :cond_37

    .line 601
    .line 602
    if-ne v5, v4, :cond_35

    .line 603
    .line 604
    move v3, v5

    .line 605
    const/16 v5, 0x1a

    .line 606
    .line 607
    goto :goto_1e

    .line 608
    :cond_35
    add-int/lit8 v3, v5, 0x1

    .line 609
    .line 610
    aget-byte v5, v7, v5

    .line 611
    .line 612
    :goto_1e
    move/from16 v34, v5

    .line 613
    .line 614
    move v5, v3

    .line 615
    move/from16 v3, v34

    .line 616
    .line 617
    :goto_1f
    if-gt v3, v6, :cond_37

    .line 618
    .line 619
    shl-long v8, v16, v3

    .line 620
    .line 621
    and-long/2addr v8, v1

    .line 622
    cmp-long v8, v8, v18

    .line 623
    .line 624
    if-eqz v8, :cond_37

    .line 625
    .line 626
    if-ne v5, v4, :cond_36

    .line 627
    .line 628
    const/16 v3, 0x1a

    .line 629
    .line 630
    goto :goto_1f

    .line 631
    :cond_36
    add-int/lit8 v3, v5, 0x1

    .line 632
    .line 633
    aget-byte v5, v7, v5

    .line 634
    .line 635
    goto :goto_1e

    .line 636
    :cond_37
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 637
    .line 638
    int-to-char v1, v3

    .line 639
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 640
    .line 641
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 642
    .line 643
    return-wide v14
.end method

.method public readFieldName()Ljava/lang/String;
    .locals 24

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
    const/4 v5, 0x1

    .line 67
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 71
    .line 72
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 75
    .line 76
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 77
    .line 78
    move v10, v6

    .line 79
    move v9, v7

    .line 80
    :goto_1
    const/16 v11, 0x20

    .line 81
    .line 82
    if-ge v9, v8, :cond_11

    .line 83
    .line 84
    aget-byte v12, v2, v9

    .line 85
    .line 86
    const/16 v13, 0x5c

    .line 87
    .line 88
    const/4 v14, 0x4

    .line 89
    const/4 v15, 0x2

    .line 90
    if-ne v12, v13, :cond_6

    .line 91
    .line 92
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 93
    .line 94
    add-int/lit8 v11, v9, 0x1

    .line 95
    .line 96
    aget-byte v11, v2, v11

    .line 97
    .line 98
    const/16 v12, 0x75

    .line 99
    .line 100
    if-ne v11, v12, :cond_4

    .line 101
    .line 102
    const/4 v14, 0x6

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/16 v12, 0x78

    .line 105
    .line 106
    if-ne v11, v12, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move v14, v15

    .line 110
    :goto_2
    add-int/2addr v9, v14

    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :cond_6
    if-ne v12, v1, :cond_d

    .line 114
    .line 115
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 116
    .line 117
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 118
    .line 119
    add-int/lit8 v9, v9, 0x1

    .line 120
    .line 121
    if-ge v9, v8, :cond_7

    .line 122
    .line 123
    aget-byte v1, v2, v9

    .line 124
    .line 125
    :goto_3
    and-int/lit16 v1, v1, 0xff

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    const/16 v1, 0x1a

    .line 129
    .line 130
    :goto_4
    if-gt v1, v11, :cond_8

    .line 131
    .line 132
    const-wide/16 v12, 0x1

    .line 133
    .line 134
    shl-long/2addr v12, v1

    .line 135
    const-wide v16, 0x100003701L

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    and-long v12, v12, v16

    .line 141
    .line 142
    cmp-long v10, v12, v3

    .line 143
    .line 144
    if-eqz v10, :cond_8

    .line 145
    .line 146
    add-int/lit8 v9, v9, 0x1

    .line 147
    .line 148
    aget-byte v1, v2, v9

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    const/16 v10, 0x3a

    .line 152
    .line 153
    if-ne v1, v10, :cond_c

    .line 154
    .line 155
    add-int/lit8 v1, v9, 0x1

    .line 156
    .line 157
    if-ne v1, v8, :cond_9

    .line 158
    .line 159
    :goto_5
    const/16 v9, 0x1a

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_9
    add-int/2addr v9, v15

    .line 163
    aget-byte v1, v2, v1

    .line 164
    .line 165
    :goto_6
    move/from16 v23, v9

    .line 166
    .line 167
    move v9, v1

    .line 168
    move/from16 v1, v23

    .line 169
    .line 170
    :goto_7
    if-gt v9, v11, :cond_b

    .line 171
    .line 172
    const-wide/16 v12, 0x1

    .line 173
    .line 174
    shl-long/2addr v12, v9

    .line 175
    const-wide v14, 0x100003701L

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    and-long/2addr v12, v14

    .line 181
    cmp-long v10, v12, v3

    .line 182
    .line 183
    if-eqz v10, :cond_b

    .line 184
    .line 185
    if-ne v1, v8, :cond_a

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_a
    add-int/lit8 v9, v1, 0x1

    .line 189
    .line 190
    aget-byte v1, v2, v1

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_b
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 194
    .line 195
    int-to-char v3, v9

    .line 196
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 197
    .line 198
    move v9, v1

    .line 199
    goto :goto_9

    .line 200
    :cond_c
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    throw v1

    .line 205
    :cond_d
    if-ltz v12, :cond_e

    .line 206
    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_e
    iget-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 211
    .line 212
    if-eqz v11, :cond_f

    .line 213
    .line 214
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 215
    .line 216
    :cond_f
    and-int/lit16 v11, v12, 0xff

    .line 217
    .line 218
    shr-int/2addr v11, v14

    .line 219
    packed-switch v11, :pswitch_data_0

    .line 220
    .line 221
    .line 222
    shr-int/lit8 v11, v12, 0x3

    .line 223
    .line 224
    const/4 v13, -0x2

    .line 225
    if-ne v11, v13, :cond_10

    .line 226
    .line 227
    add-int/lit8 v9, v9, 0x4

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_10
    invoke-static {v9, v12}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    throw v1

    .line 235
    :pswitch_0
    add-int/lit8 v9, v9, 0x3

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :pswitch_1
    add-int/lit8 v9, v9, 0x2

    .line 239
    .line 240
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_11
    :goto_9
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 245
    .line 246
    if-lt v1, v7, :cond_1d

    .line 247
    .line 248
    sub-int/2addr v1, v7

    .line 249
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 250
    .line 251
    if-nez v3, :cond_1c

    .line 252
    .line 253
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 254
    .line 255
    if-eqz v3, :cond_15

    .line 256
    .line 257
    const/16 v12, 0x28

    .line 258
    .line 259
    const/16 v13, 0x18

    .line 260
    .line 261
    const/16 v14, 0x10

    .line 262
    .line 263
    const/16 v15, 0x8

    .line 264
    .line 265
    packed-switch v1, :pswitch_data_1

    .line 266
    .line 267
    .line 268
    move/from16 v16, v11

    .line 269
    .line 270
    const-wide/16 v12, -0x1

    .line 271
    .line 272
    const-wide/16 v14, -0x1

    .line 273
    .line 274
    const-wide/16 v18, -0x1

    .line 275
    .line 276
    goto/16 :goto_f

    .line 277
    .line 278
    :pswitch_2
    add-int/lit8 v16, v7, 0x7

    .line 279
    .line 280
    const/16 v17, 0x38

    .line 281
    .line 282
    aget-byte v4, v2, v16

    .line 283
    .line 284
    const-wide/16 v18, -0x1

    .line 285
    .line 286
    int-to-long v8, v4

    .line 287
    shl-long v8, v8, v17

    .line 288
    .line 289
    add-int/lit8 v4, v7, 0x6

    .line 290
    .line 291
    aget-byte v4, v2, v4

    .line 292
    .line 293
    move/from16 v16, v11

    .line 294
    .line 295
    const/16 v20, 0x30

    .line 296
    .line 297
    int-to-long v10, v4

    .line 298
    shl-long v10, v10, v20

    .line 299
    .line 300
    add-long/2addr v8, v10

    .line 301
    add-int/lit8 v4, v7, 0x5

    .line 302
    .line 303
    aget-byte v4, v2, v4

    .line 304
    .line 305
    int-to-long v10, v4

    .line 306
    shl-long/2addr v10, v12

    .line 307
    add-long/2addr v8, v10

    .line 308
    add-int/lit8 v4, v7, 0x4

    .line 309
    .line 310
    aget-byte v4, v2, v4

    .line 311
    .line 312
    int-to-long v10, v4

    .line 313
    shl-long v10, v10, v16

    .line 314
    .line 315
    add-long/2addr v8, v10

    .line 316
    add-int/lit8 v4, v7, 0x3

    .line 317
    .line 318
    aget-byte v4, v2, v4

    .line 319
    .line 320
    int-to-long v10, v4

    .line 321
    shl-long/2addr v10, v13

    .line 322
    add-long/2addr v8, v10

    .line 323
    add-int/lit8 v4, v7, 0x2

    .line 324
    .line 325
    aget-byte v4, v2, v4

    .line 326
    .line 327
    int-to-long v10, v4

    .line 328
    shl-long/2addr v10, v14

    .line 329
    add-long/2addr v8, v10

    .line 330
    add-int/lit8 v4, v7, 0x1

    .line 331
    .line 332
    aget-byte v4, v2, v4

    .line 333
    .line 334
    int-to-long v10, v4

    .line 335
    shl-long/2addr v10, v15

    .line 336
    add-long/2addr v8, v10

    .line 337
    aget-byte v4, v2, v7

    .line 338
    .line 339
    int-to-long v10, v4

    .line 340
    add-long/2addr v8, v10

    .line 341
    add-int/lit8 v4, v7, 0xf

    .line 342
    .line 343
    aget-byte v4, v2, v4

    .line 344
    .line 345
    int-to-long v10, v4

    .line 346
    shl-long v10, v10, v17

    .line 347
    .line 348
    add-int/lit8 v4, v7, 0xe

    .line 349
    .line 350
    aget-byte v4, v2, v4

    .line 351
    .line 352
    move/from16 v21, v12

    .line 353
    .line 354
    move/from16 v22, v13

    .line 355
    .line 356
    int-to-long v12, v4

    .line 357
    shl-long v12, v12, v20

    .line 358
    .line 359
    add-long/2addr v10, v12

    .line 360
    add-int/lit8 v4, v7, 0xd

    .line 361
    .line 362
    aget-byte v4, v2, v4

    .line 363
    .line 364
    int-to-long v12, v4

    .line 365
    shl-long v12, v12, v21

    .line 366
    .line 367
    add-long/2addr v10, v12

    .line 368
    add-int/lit8 v4, v7, 0xc

    .line 369
    .line 370
    aget-byte v4, v2, v4

    .line 371
    .line 372
    int-to-long v12, v4

    .line 373
    shl-long v12, v12, v16

    .line 374
    .line 375
    add-long/2addr v10, v12

    .line 376
    add-int/lit8 v4, v7, 0xb

    .line 377
    .line 378
    aget-byte v4, v2, v4

    .line 379
    .line 380
    int-to-long v12, v4

    .line 381
    shl-long v12, v12, v22

    .line 382
    .line 383
    add-long/2addr v10, v12

    .line 384
    add-int/lit8 v4, v7, 0xa

    .line 385
    .line 386
    aget-byte v4, v2, v4

    .line 387
    .line 388
    int-to-long v12, v4

    .line 389
    shl-long/2addr v12, v14

    .line 390
    add-long/2addr v10, v12

    .line 391
    add-int/lit8 v4, v7, 0x9

    .line 392
    .line 393
    aget-byte v4, v2, v4

    .line 394
    .line 395
    int-to-long v12, v4

    .line 396
    shl-long/2addr v12, v15

    .line 397
    add-long/2addr v10, v12

    .line 398
    add-int/lit8 v4, v7, 0x8

    .line 399
    .line 400
    aget-byte v4, v2, v4

    .line 401
    .line 402
    :goto_a
    int-to-long v12, v4

    .line 403
    add-long/2addr v10, v12

    .line 404
    move-wide v12, v8

    .line 405
    move-wide v14, v10

    .line 406
    goto/16 :goto_f

    .line 407
    .line 408
    :pswitch_3
    move/from16 v16, v11

    .line 409
    .line 410
    move/from16 v21, v12

    .line 411
    .line 412
    move/from16 v22, v13

    .line 413
    .line 414
    const/16 v17, 0x38

    .line 415
    .line 416
    const-wide/16 v18, -0x1

    .line 417
    .line 418
    const/16 v20, 0x30

    .line 419
    .line 420
    add-int/lit8 v4, v7, 0x6

    .line 421
    .line 422
    aget-byte v4, v2, v4

    .line 423
    .line 424
    int-to-long v8, v4

    .line 425
    shl-long v8, v8, v20

    .line 426
    .line 427
    add-int/lit8 v4, v7, 0x5

    .line 428
    .line 429
    aget-byte v4, v2, v4

    .line 430
    .line 431
    int-to-long v10, v4

    .line 432
    shl-long v10, v10, v21

    .line 433
    .line 434
    add-long/2addr v8, v10

    .line 435
    add-int/lit8 v4, v7, 0x4

    .line 436
    .line 437
    aget-byte v4, v2, v4

    .line 438
    .line 439
    int-to-long v10, v4

    .line 440
    shl-long v10, v10, v16

    .line 441
    .line 442
    add-long/2addr v8, v10

    .line 443
    add-int/lit8 v4, v7, 0x3

    .line 444
    .line 445
    aget-byte v4, v2, v4

    .line 446
    .line 447
    int-to-long v10, v4

    .line 448
    shl-long v10, v10, v22

    .line 449
    .line 450
    add-long/2addr v8, v10

    .line 451
    add-int/lit8 v4, v7, 0x2

    .line 452
    .line 453
    aget-byte v4, v2, v4

    .line 454
    .line 455
    int-to-long v10, v4

    .line 456
    shl-long/2addr v10, v14

    .line 457
    add-long/2addr v8, v10

    .line 458
    add-int/lit8 v4, v7, 0x1

    .line 459
    .line 460
    aget-byte v4, v2, v4

    .line 461
    .line 462
    int-to-long v10, v4

    .line 463
    shl-long/2addr v10, v15

    .line 464
    add-long/2addr v8, v10

    .line 465
    aget-byte v4, v2, v7

    .line 466
    .line 467
    int-to-long v10, v4

    .line 468
    add-long/2addr v8, v10

    .line 469
    add-int/lit8 v4, v7, 0xe

    .line 470
    .line 471
    aget-byte v4, v2, v4

    .line 472
    .line 473
    int-to-long v10, v4

    .line 474
    shl-long v10, v10, v17

    .line 475
    .line 476
    add-int/lit8 v4, v7, 0xd

    .line 477
    .line 478
    aget-byte v4, v2, v4

    .line 479
    .line 480
    int-to-long v12, v4

    .line 481
    shl-long v12, v12, v20

    .line 482
    .line 483
    add-long/2addr v10, v12

    .line 484
    add-int/lit8 v4, v7, 0xc

    .line 485
    .line 486
    aget-byte v4, v2, v4

    .line 487
    .line 488
    int-to-long v12, v4

    .line 489
    shl-long v12, v12, v21

    .line 490
    .line 491
    add-long/2addr v10, v12

    .line 492
    add-int/lit8 v4, v7, 0xb

    .line 493
    .line 494
    aget-byte v4, v2, v4

    .line 495
    .line 496
    int-to-long v12, v4

    .line 497
    shl-long v12, v12, v16

    .line 498
    .line 499
    add-long/2addr v10, v12

    .line 500
    add-int/lit8 v4, v7, 0xa

    .line 501
    .line 502
    aget-byte v4, v2, v4

    .line 503
    .line 504
    int-to-long v12, v4

    .line 505
    shl-long v12, v12, v22

    .line 506
    .line 507
    add-long/2addr v10, v12

    .line 508
    add-int/lit8 v4, v7, 0x9

    .line 509
    .line 510
    aget-byte v4, v2, v4

    .line 511
    .line 512
    int-to-long v12, v4

    .line 513
    shl-long/2addr v12, v14

    .line 514
    add-long/2addr v10, v12

    .line 515
    add-int/lit8 v4, v7, 0x8

    .line 516
    .line 517
    aget-byte v4, v2, v4

    .line 518
    .line 519
    int-to-long v12, v4

    .line 520
    shl-long/2addr v12, v15

    .line 521
    add-long/2addr v10, v12

    .line 522
    add-int/lit8 v4, v7, 0x7

    .line 523
    .line 524
    aget-byte v4, v2, v4

    .line 525
    .line 526
    goto :goto_a

    .line 527
    :pswitch_4
    move/from16 v16, v11

    .line 528
    .line 529
    move/from16 v21, v12

    .line 530
    .line 531
    move/from16 v22, v13

    .line 532
    .line 533
    const/16 v17, 0x38

    .line 534
    .line 535
    const-wide/16 v18, -0x1

    .line 536
    .line 537
    const/16 v20, 0x30

    .line 538
    .line 539
    add-int/lit8 v4, v7, 0x5

    .line 540
    .line 541
    aget-byte v4, v2, v4

    .line 542
    .line 543
    int-to-long v8, v4

    .line 544
    shl-long v8, v8, v21

    .line 545
    .line 546
    add-int/lit8 v4, v7, 0x4

    .line 547
    .line 548
    aget-byte v4, v2, v4

    .line 549
    .line 550
    int-to-long v10, v4

    .line 551
    shl-long v10, v10, v16

    .line 552
    .line 553
    add-long/2addr v8, v10

    .line 554
    add-int/lit8 v4, v7, 0x3

    .line 555
    .line 556
    aget-byte v4, v2, v4

    .line 557
    .line 558
    int-to-long v10, v4

    .line 559
    shl-long v10, v10, v22

    .line 560
    .line 561
    add-long/2addr v8, v10

    .line 562
    add-int/lit8 v4, v7, 0x2

    .line 563
    .line 564
    aget-byte v4, v2, v4

    .line 565
    .line 566
    int-to-long v10, v4

    .line 567
    shl-long/2addr v10, v14

    .line 568
    add-long/2addr v8, v10

    .line 569
    add-int/lit8 v4, v7, 0x1

    .line 570
    .line 571
    aget-byte v4, v2, v4

    .line 572
    .line 573
    int-to-long v10, v4

    .line 574
    shl-long/2addr v10, v15

    .line 575
    add-long/2addr v8, v10

    .line 576
    aget-byte v4, v2, v7

    .line 577
    .line 578
    int-to-long v10, v4

    .line 579
    add-long/2addr v8, v10

    .line 580
    add-int/lit8 v4, v7, 0xd

    .line 581
    .line 582
    aget-byte v4, v2, v4

    .line 583
    .line 584
    int-to-long v10, v4

    .line 585
    shl-long v10, v10, v17

    .line 586
    .line 587
    add-int/lit8 v4, v7, 0xc

    .line 588
    .line 589
    aget-byte v4, v2, v4

    .line 590
    .line 591
    int-to-long v12, v4

    .line 592
    shl-long v12, v12, v20

    .line 593
    .line 594
    add-long/2addr v10, v12

    .line 595
    add-int/lit8 v4, v7, 0xb

    .line 596
    .line 597
    aget-byte v4, v2, v4

    .line 598
    .line 599
    int-to-long v12, v4

    .line 600
    shl-long v12, v12, v21

    .line 601
    .line 602
    add-long/2addr v10, v12

    .line 603
    add-int/lit8 v4, v7, 0xa

    .line 604
    .line 605
    aget-byte v4, v2, v4

    .line 606
    .line 607
    int-to-long v12, v4

    .line 608
    shl-long v12, v12, v16

    .line 609
    .line 610
    add-long/2addr v10, v12

    .line 611
    add-int/lit8 v4, v7, 0x9

    .line 612
    .line 613
    aget-byte v4, v2, v4

    .line 614
    .line 615
    int-to-long v12, v4

    .line 616
    shl-long v12, v12, v22

    .line 617
    .line 618
    add-long/2addr v10, v12

    .line 619
    add-int/lit8 v4, v7, 0x8

    .line 620
    .line 621
    aget-byte v4, v2, v4

    .line 622
    .line 623
    int-to-long v12, v4

    .line 624
    shl-long/2addr v12, v14

    .line 625
    add-long/2addr v10, v12

    .line 626
    add-int/lit8 v4, v7, 0x7

    .line 627
    .line 628
    aget-byte v4, v2, v4

    .line 629
    .line 630
    int-to-long v12, v4

    .line 631
    shl-long/2addr v12, v15

    .line 632
    add-long/2addr v10, v12

    .line 633
    add-int/lit8 v4, v7, 0x6

    .line 634
    .line 635
    aget-byte v4, v2, v4

    .line 636
    .line 637
    goto/16 :goto_a

    .line 638
    .line 639
    :pswitch_5
    move/from16 v16, v11

    .line 640
    .line 641
    move/from16 v21, v12

    .line 642
    .line 643
    move/from16 v22, v13

    .line 644
    .line 645
    const/16 v17, 0x38

    .line 646
    .line 647
    const-wide/16 v18, -0x1

    .line 648
    .line 649
    const/16 v20, 0x30

    .line 650
    .line 651
    add-int/lit8 v4, v7, 0x4

    .line 652
    .line 653
    aget-byte v4, v2, v4

    .line 654
    .line 655
    int-to-long v8, v4

    .line 656
    shl-long v8, v8, v16

    .line 657
    .line 658
    add-int/lit8 v4, v7, 0x3

    .line 659
    .line 660
    aget-byte v4, v2, v4

    .line 661
    .line 662
    int-to-long v10, v4

    .line 663
    shl-long v10, v10, v22

    .line 664
    .line 665
    add-long/2addr v8, v10

    .line 666
    add-int/lit8 v4, v7, 0x2

    .line 667
    .line 668
    aget-byte v4, v2, v4

    .line 669
    .line 670
    int-to-long v10, v4

    .line 671
    shl-long/2addr v10, v14

    .line 672
    add-long/2addr v8, v10

    .line 673
    add-int/lit8 v4, v7, 0x1

    .line 674
    .line 675
    aget-byte v4, v2, v4

    .line 676
    .line 677
    int-to-long v10, v4

    .line 678
    shl-long/2addr v10, v15

    .line 679
    add-long/2addr v8, v10

    .line 680
    aget-byte v4, v2, v7

    .line 681
    .line 682
    int-to-long v10, v4

    .line 683
    add-long/2addr v8, v10

    .line 684
    add-int/lit8 v4, v7, 0xc

    .line 685
    .line 686
    aget-byte v4, v2, v4

    .line 687
    .line 688
    int-to-long v10, v4

    .line 689
    shl-long v10, v10, v17

    .line 690
    .line 691
    add-int/lit8 v4, v7, 0xb

    .line 692
    .line 693
    aget-byte v4, v2, v4

    .line 694
    .line 695
    int-to-long v12, v4

    .line 696
    shl-long v12, v12, v20

    .line 697
    .line 698
    add-long/2addr v10, v12

    .line 699
    add-int/lit8 v4, v7, 0xa

    .line 700
    .line 701
    aget-byte v4, v2, v4

    .line 702
    .line 703
    int-to-long v12, v4

    .line 704
    shl-long v12, v12, v21

    .line 705
    .line 706
    add-long/2addr v10, v12

    .line 707
    add-int/lit8 v4, v7, 0x9

    .line 708
    .line 709
    aget-byte v4, v2, v4

    .line 710
    .line 711
    int-to-long v12, v4

    .line 712
    shl-long v12, v12, v16

    .line 713
    .line 714
    add-long/2addr v10, v12

    .line 715
    add-int/lit8 v4, v7, 0x8

    .line 716
    .line 717
    aget-byte v4, v2, v4

    .line 718
    .line 719
    int-to-long v12, v4

    .line 720
    shl-long v12, v12, v22

    .line 721
    .line 722
    add-long/2addr v10, v12

    .line 723
    add-int/lit8 v4, v7, 0x7

    .line 724
    .line 725
    aget-byte v4, v2, v4

    .line 726
    .line 727
    int-to-long v12, v4

    .line 728
    shl-long/2addr v12, v14

    .line 729
    add-long/2addr v10, v12

    .line 730
    add-int/lit8 v4, v7, 0x6

    .line 731
    .line 732
    aget-byte v4, v2, v4

    .line 733
    .line 734
    int-to-long v12, v4

    .line 735
    shl-long/2addr v12, v15

    .line 736
    add-long/2addr v10, v12

    .line 737
    add-int/lit8 v4, v7, 0x5

    .line 738
    .line 739
    aget-byte v4, v2, v4

    .line 740
    .line 741
    goto/16 :goto_a

    .line 742
    .line 743
    :pswitch_6
    move/from16 v16, v11

    .line 744
    .line 745
    move/from16 v21, v12

    .line 746
    .line 747
    move/from16 v22, v13

    .line 748
    .line 749
    const/16 v17, 0x38

    .line 750
    .line 751
    const-wide/16 v18, -0x1

    .line 752
    .line 753
    const/16 v20, 0x30

    .line 754
    .line 755
    add-int/lit8 v4, v7, 0x3

    .line 756
    .line 757
    aget-byte v4, v2, v4

    .line 758
    .line 759
    shl-int/lit8 v4, v4, 0x18

    .line 760
    .line 761
    add-int/lit8 v8, v7, 0x2

    .line 762
    .line 763
    aget-byte v8, v2, v8

    .line 764
    .line 765
    shl-int/2addr v8, v14

    .line 766
    add-int/2addr v4, v8

    .line 767
    add-int/lit8 v8, v7, 0x1

    .line 768
    .line 769
    aget-byte v8, v2, v8

    .line 770
    .line 771
    shl-int/2addr v8, v15

    .line 772
    add-int/2addr v4, v8

    .line 773
    aget-byte v8, v2, v7

    .line 774
    .line 775
    add-int/2addr v4, v8

    .line 776
    int-to-long v8, v4

    .line 777
    add-int/lit8 v4, v7, 0xb

    .line 778
    .line 779
    aget-byte v4, v2, v4

    .line 780
    .line 781
    int-to-long v10, v4

    .line 782
    shl-long v10, v10, v17

    .line 783
    .line 784
    add-int/lit8 v4, v7, 0xa

    .line 785
    .line 786
    aget-byte v4, v2, v4

    .line 787
    .line 788
    int-to-long v12, v4

    .line 789
    shl-long v12, v12, v20

    .line 790
    .line 791
    add-long/2addr v10, v12

    .line 792
    add-int/lit8 v4, v7, 0x9

    .line 793
    .line 794
    aget-byte v4, v2, v4

    .line 795
    .line 796
    int-to-long v12, v4

    .line 797
    shl-long v12, v12, v21

    .line 798
    .line 799
    add-long/2addr v10, v12

    .line 800
    add-int/lit8 v4, v7, 0x8

    .line 801
    .line 802
    aget-byte v4, v2, v4

    .line 803
    .line 804
    int-to-long v12, v4

    .line 805
    shl-long v12, v12, v16

    .line 806
    .line 807
    add-long/2addr v10, v12

    .line 808
    add-int/lit8 v4, v7, 0x7

    .line 809
    .line 810
    aget-byte v4, v2, v4

    .line 811
    .line 812
    int-to-long v12, v4

    .line 813
    shl-long v12, v12, v22

    .line 814
    .line 815
    add-long/2addr v10, v12

    .line 816
    add-int/lit8 v4, v7, 0x6

    .line 817
    .line 818
    aget-byte v4, v2, v4

    .line 819
    .line 820
    int-to-long v12, v4

    .line 821
    shl-long/2addr v12, v14

    .line 822
    add-long/2addr v10, v12

    .line 823
    add-int/lit8 v4, v7, 0x5

    .line 824
    .line 825
    aget-byte v4, v2, v4

    .line 826
    .line 827
    int-to-long v12, v4

    .line 828
    shl-long/2addr v12, v15

    .line 829
    add-long/2addr v10, v12

    .line 830
    add-int/lit8 v4, v7, 0x4

    .line 831
    .line 832
    aget-byte v4, v2, v4

    .line 833
    .line 834
    goto/16 :goto_a

    .line 835
    .line 836
    :pswitch_7
    move/from16 v16, v11

    .line 837
    .line 838
    move/from16 v21, v12

    .line 839
    .line 840
    move/from16 v22, v13

    .line 841
    .line 842
    const/16 v17, 0x38

    .line 843
    .line 844
    const-wide/16 v18, -0x1

    .line 845
    .line 846
    const/16 v20, 0x30

    .line 847
    .line 848
    add-int/lit8 v4, v7, 0x2

    .line 849
    .line 850
    aget-byte v4, v2, v4

    .line 851
    .line 852
    shl-int/2addr v4, v14

    .line 853
    add-int/lit8 v8, v7, 0x1

    .line 854
    .line 855
    aget-byte v8, v2, v8

    .line 856
    .line 857
    shl-int/2addr v8, v15

    .line 858
    add-int/2addr v4, v8

    .line 859
    aget-byte v8, v2, v7

    .line 860
    .line 861
    add-int/2addr v4, v8

    .line 862
    int-to-long v8, v4

    .line 863
    add-int/lit8 v4, v7, 0xa

    .line 864
    .line 865
    aget-byte v4, v2, v4

    .line 866
    .line 867
    int-to-long v10, v4

    .line 868
    shl-long v10, v10, v17

    .line 869
    .line 870
    add-int/lit8 v4, v7, 0x9

    .line 871
    .line 872
    aget-byte v4, v2, v4

    .line 873
    .line 874
    int-to-long v12, v4

    .line 875
    shl-long v12, v12, v20

    .line 876
    .line 877
    add-long/2addr v10, v12

    .line 878
    add-int/lit8 v4, v7, 0x8

    .line 879
    .line 880
    aget-byte v4, v2, v4

    .line 881
    .line 882
    int-to-long v12, v4

    .line 883
    shl-long v12, v12, v21

    .line 884
    .line 885
    add-long/2addr v10, v12

    .line 886
    add-int/lit8 v4, v7, 0x7

    .line 887
    .line 888
    aget-byte v4, v2, v4

    .line 889
    .line 890
    int-to-long v12, v4

    .line 891
    shl-long v12, v12, v16

    .line 892
    .line 893
    add-long/2addr v10, v12

    .line 894
    add-int/lit8 v4, v7, 0x6

    .line 895
    .line 896
    aget-byte v4, v2, v4

    .line 897
    .line 898
    int-to-long v12, v4

    .line 899
    shl-long v12, v12, v22

    .line 900
    .line 901
    add-long/2addr v10, v12

    .line 902
    add-int/lit8 v4, v7, 0x5

    .line 903
    .line 904
    aget-byte v4, v2, v4

    .line 905
    .line 906
    int-to-long v12, v4

    .line 907
    shl-long/2addr v12, v14

    .line 908
    add-long/2addr v10, v12

    .line 909
    add-int/lit8 v4, v7, 0x4

    .line 910
    .line 911
    aget-byte v4, v2, v4

    .line 912
    .line 913
    int-to-long v12, v4

    .line 914
    shl-long/2addr v12, v15

    .line 915
    add-long/2addr v10, v12

    .line 916
    add-int/lit8 v4, v7, 0x3

    .line 917
    .line 918
    aget-byte v4, v2, v4

    .line 919
    .line 920
    goto/16 :goto_a

    .line 921
    .line 922
    :pswitch_8
    move/from16 v16, v11

    .line 923
    .line 924
    move/from16 v21, v12

    .line 925
    .line 926
    move/from16 v22, v13

    .line 927
    .line 928
    const/16 v17, 0x38

    .line 929
    .line 930
    const-wide/16 v18, -0x1

    .line 931
    .line 932
    const/16 v20, 0x30

    .line 933
    .line 934
    add-int/lit8 v4, v7, 0x1

    .line 935
    .line 936
    aget-byte v4, v2, v4

    .line 937
    .line 938
    shl-int/2addr v4, v15

    .line 939
    aget-byte v8, v2, v7

    .line 940
    .line 941
    add-int/2addr v4, v8

    .line 942
    int-to-long v8, v4

    .line 943
    add-int/lit8 v4, v7, 0x9

    .line 944
    .line 945
    aget-byte v4, v2, v4

    .line 946
    .line 947
    int-to-long v10, v4

    .line 948
    shl-long v10, v10, v17

    .line 949
    .line 950
    add-int/lit8 v4, v7, 0x8

    .line 951
    .line 952
    aget-byte v4, v2, v4

    .line 953
    .line 954
    int-to-long v12, v4

    .line 955
    shl-long v12, v12, v20

    .line 956
    .line 957
    add-long/2addr v10, v12

    .line 958
    add-int/lit8 v4, v7, 0x7

    .line 959
    .line 960
    aget-byte v4, v2, v4

    .line 961
    .line 962
    int-to-long v12, v4

    .line 963
    shl-long v12, v12, v21

    .line 964
    .line 965
    add-long/2addr v10, v12

    .line 966
    add-int/lit8 v4, v7, 0x6

    .line 967
    .line 968
    aget-byte v4, v2, v4

    .line 969
    .line 970
    int-to-long v12, v4

    .line 971
    shl-long v12, v12, v16

    .line 972
    .line 973
    add-long/2addr v10, v12

    .line 974
    add-int/lit8 v4, v7, 0x5

    .line 975
    .line 976
    aget-byte v4, v2, v4

    .line 977
    .line 978
    int-to-long v12, v4

    .line 979
    shl-long v12, v12, v22

    .line 980
    .line 981
    add-long/2addr v10, v12

    .line 982
    add-int/lit8 v4, v7, 0x4

    .line 983
    .line 984
    aget-byte v4, v2, v4

    .line 985
    .line 986
    int-to-long v12, v4

    .line 987
    shl-long/2addr v12, v14

    .line 988
    add-long/2addr v10, v12

    .line 989
    add-int/lit8 v4, v7, 0x3

    .line 990
    .line 991
    aget-byte v4, v2, v4

    .line 992
    .line 993
    int-to-long v12, v4

    .line 994
    shl-long/2addr v12, v15

    .line 995
    add-long/2addr v10, v12

    .line 996
    add-int/lit8 v4, v7, 0x2

    .line 997
    .line 998
    aget-byte v4, v2, v4

    .line 999
    .line 1000
    goto/16 :goto_a

    .line 1001
    .line 1002
    :pswitch_9
    move/from16 v16, v11

    .line 1003
    .line 1004
    move/from16 v21, v12

    .line 1005
    .line 1006
    move/from16 v22, v13

    .line 1007
    .line 1008
    const/16 v17, 0x38

    .line 1009
    .line 1010
    const-wide/16 v18, -0x1

    .line 1011
    .line 1012
    const/16 v20, 0x30

    .line 1013
    .line 1014
    aget-byte v4, v2, v7

    .line 1015
    .line 1016
    int-to-long v8, v4

    .line 1017
    add-int/lit8 v4, v7, 0x8

    .line 1018
    .line 1019
    aget-byte v4, v2, v4

    .line 1020
    .line 1021
    int-to-long v10, v4

    .line 1022
    shl-long v10, v10, v17

    .line 1023
    .line 1024
    add-int/lit8 v4, v7, 0x7

    .line 1025
    .line 1026
    aget-byte v4, v2, v4

    .line 1027
    .line 1028
    int-to-long v12, v4

    .line 1029
    shl-long v12, v12, v20

    .line 1030
    .line 1031
    add-long/2addr v10, v12

    .line 1032
    add-int/lit8 v4, v7, 0x6

    .line 1033
    .line 1034
    aget-byte v4, v2, v4

    .line 1035
    .line 1036
    int-to-long v12, v4

    .line 1037
    shl-long v12, v12, v21

    .line 1038
    .line 1039
    add-long/2addr v10, v12

    .line 1040
    add-int/lit8 v4, v7, 0x5

    .line 1041
    .line 1042
    aget-byte v4, v2, v4

    .line 1043
    .line 1044
    int-to-long v12, v4

    .line 1045
    shl-long v12, v12, v16

    .line 1046
    .line 1047
    add-long/2addr v10, v12

    .line 1048
    add-int/lit8 v4, v7, 0x4

    .line 1049
    .line 1050
    aget-byte v4, v2, v4

    .line 1051
    .line 1052
    int-to-long v12, v4

    .line 1053
    shl-long v12, v12, v22

    .line 1054
    .line 1055
    add-long/2addr v10, v12

    .line 1056
    add-int/lit8 v4, v7, 0x3

    .line 1057
    .line 1058
    aget-byte v4, v2, v4

    .line 1059
    .line 1060
    int-to-long v12, v4

    .line 1061
    shl-long/2addr v12, v14

    .line 1062
    add-long/2addr v10, v12

    .line 1063
    add-int/lit8 v4, v7, 0x2

    .line 1064
    .line 1065
    aget-byte v4, v2, v4

    .line 1066
    .line 1067
    int-to-long v12, v4

    .line 1068
    shl-long/2addr v12, v15

    .line 1069
    add-long/2addr v10, v12

    .line 1070
    add-int/lit8 v4, v7, 0x1

    .line 1071
    .line 1072
    aget-byte v4, v2, v4

    .line 1073
    .line 1074
    goto/16 :goto_a

    .line 1075
    .line 1076
    :pswitch_a
    move/from16 v16, v11

    .line 1077
    .line 1078
    move/from16 v21, v12

    .line 1079
    .line 1080
    move/from16 v22, v13

    .line 1081
    .line 1082
    const/16 v17, 0x38

    .line 1083
    .line 1084
    const-wide/16 v18, -0x1

    .line 1085
    .line 1086
    const/16 v20, 0x30

    .line 1087
    .line 1088
    add-int/lit8 v4, v7, 0x7

    .line 1089
    .line 1090
    aget-byte v4, v2, v4

    .line 1091
    .line 1092
    int-to-long v8, v4

    .line 1093
    shl-long v8, v8, v17

    .line 1094
    .line 1095
    add-int/lit8 v4, v7, 0x6

    .line 1096
    .line 1097
    aget-byte v4, v2, v4

    .line 1098
    .line 1099
    int-to-long v10, v4

    .line 1100
    shl-long v10, v10, v20

    .line 1101
    .line 1102
    add-long/2addr v8, v10

    .line 1103
    add-int/lit8 v4, v7, 0x5

    .line 1104
    .line 1105
    aget-byte v4, v2, v4

    .line 1106
    .line 1107
    int-to-long v10, v4

    .line 1108
    shl-long v10, v10, v21

    .line 1109
    .line 1110
    add-long/2addr v8, v10

    .line 1111
    add-int/lit8 v4, v7, 0x4

    .line 1112
    .line 1113
    aget-byte v4, v2, v4

    .line 1114
    .line 1115
    int-to-long v10, v4

    .line 1116
    shl-long v10, v10, v16

    .line 1117
    .line 1118
    add-long/2addr v8, v10

    .line 1119
    add-int/lit8 v4, v7, 0x3

    .line 1120
    .line 1121
    aget-byte v4, v2, v4

    .line 1122
    .line 1123
    int-to-long v10, v4

    .line 1124
    shl-long v10, v10, v22

    .line 1125
    .line 1126
    add-long/2addr v8, v10

    .line 1127
    add-int/lit8 v4, v7, 0x2

    .line 1128
    .line 1129
    aget-byte v4, v2, v4

    .line 1130
    .line 1131
    int-to-long v10, v4

    .line 1132
    shl-long/2addr v10, v14

    .line 1133
    add-long/2addr v8, v10

    .line 1134
    add-int/lit8 v4, v7, 0x1

    .line 1135
    .line 1136
    aget-byte v4, v2, v4

    .line 1137
    .line 1138
    int-to-long v10, v4

    .line 1139
    shl-long/2addr v10, v15

    .line 1140
    add-long/2addr v8, v10

    .line 1141
    aget-byte v4, v2, v7

    .line 1142
    .line 1143
    :goto_b
    int-to-long v10, v4

    .line 1144
    add-long/2addr v8, v10

    .line 1145
    :goto_c
    move-wide v12, v8

    .line 1146
    move-wide/from16 v14, v18

    .line 1147
    .line 1148
    goto/16 :goto_f

    .line 1149
    .line 1150
    :pswitch_b
    move/from16 v16, v11

    .line 1151
    .line 1152
    move/from16 v21, v12

    .line 1153
    .line 1154
    move/from16 v22, v13

    .line 1155
    .line 1156
    const-wide/16 v18, -0x1

    .line 1157
    .line 1158
    const/16 v20, 0x30

    .line 1159
    .line 1160
    add-int/lit8 v4, v7, 0x6

    .line 1161
    .line 1162
    aget-byte v4, v2, v4

    .line 1163
    .line 1164
    int-to-long v8, v4

    .line 1165
    shl-long v8, v8, v20

    .line 1166
    .line 1167
    add-int/lit8 v4, v7, 0x5

    .line 1168
    .line 1169
    aget-byte v4, v2, v4

    .line 1170
    .line 1171
    int-to-long v10, v4

    .line 1172
    shl-long v10, v10, v21

    .line 1173
    .line 1174
    add-long/2addr v8, v10

    .line 1175
    add-int/lit8 v4, v7, 0x4

    .line 1176
    .line 1177
    aget-byte v4, v2, v4

    .line 1178
    .line 1179
    int-to-long v10, v4

    .line 1180
    shl-long v10, v10, v16

    .line 1181
    .line 1182
    add-long/2addr v8, v10

    .line 1183
    add-int/lit8 v4, v7, 0x3

    .line 1184
    .line 1185
    aget-byte v4, v2, v4

    .line 1186
    .line 1187
    int-to-long v10, v4

    .line 1188
    shl-long v10, v10, v22

    .line 1189
    .line 1190
    add-long/2addr v8, v10

    .line 1191
    add-int/lit8 v4, v7, 0x2

    .line 1192
    .line 1193
    aget-byte v4, v2, v4

    .line 1194
    .line 1195
    int-to-long v10, v4

    .line 1196
    shl-long/2addr v10, v14

    .line 1197
    add-long/2addr v8, v10

    .line 1198
    add-int/lit8 v4, v7, 0x1

    .line 1199
    .line 1200
    aget-byte v4, v2, v4

    .line 1201
    .line 1202
    int-to-long v10, v4

    .line 1203
    shl-long/2addr v10, v15

    .line 1204
    add-long/2addr v8, v10

    .line 1205
    aget-byte v4, v2, v7

    .line 1206
    .line 1207
    goto :goto_b

    .line 1208
    :pswitch_c
    move/from16 v16, v11

    .line 1209
    .line 1210
    move/from16 v21, v12

    .line 1211
    .line 1212
    move/from16 v22, v13

    .line 1213
    .line 1214
    const-wide/16 v18, -0x1

    .line 1215
    .line 1216
    add-int/lit8 v4, v7, 0x5

    .line 1217
    .line 1218
    aget-byte v4, v2, v4

    .line 1219
    .line 1220
    int-to-long v8, v4

    .line 1221
    shl-long v8, v8, v21

    .line 1222
    .line 1223
    add-int/lit8 v4, v7, 0x4

    .line 1224
    .line 1225
    aget-byte v4, v2, v4

    .line 1226
    .line 1227
    int-to-long v10, v4

    .line 1228
    shl-long v10, v10, v16

    .line 1229
    .line 1230
    add-long/2addr v8, v10

    .line 1231
    add-int/lit8 v4, v7, 0x3

    .line 1232
    .line 1233
    aget-byte v4, v2, v4

    .line 1234
    .line 1235
    int-to-long v10, v4

    .line 1236
    shl-long v10, v10, v22

    .line 1237
    .line 1238
    add-long/2addr v8, v10

    .line 1239
    add-int/lit8 v4, v7, 0x2

    .line 1240
    .line 1241
    aget-byte v4, v2, v4

    .line 1242
    .line 1243
    int-to-long v10, v4

    .line 1244
    shl-long/2addr v10, v14

    .line 1245
    add-long/2addr v8, v10

    .line 1246
    add-int/lit8 v4, v7, 0x1

    .line 1247
    .line 1248
    aget-byte v4, v2, v4

    .line 1249
    .line 1250
    int-to-long v10, v4

    .line 1251
    shl-long/2addr v10, v15

    .line 1252
    add-long/2addr v8, v10

    .line 1253
    aget-byte v4, v2, v7

    .line 1254
    .line 1255
    goto :goto_b

    .line 1256
    :pswitch_d
    move/from16 v16, v11

    .line 1257
    .line 1258
    move/from16 v22, v13

    .line 1259
    .line 1260
    const-wide/16 v18, -0x1

    .line 1261
    .line 1262
    add-int/lit8 v4, v7, 0x4

    .line 1263
    .line 1264
    aget-byte v4, v2, v4

    .line 1265
    .line 1266
    int-to-long v8, v4

    .line 1267
    shl-long v8, v8, v16

    .line 1268
    .line 1269
    add-int/lit8 v4, v7, 0x3

    .line 1270
    .line 1271
    aget-byte v4, v2, v4

    .line 1272
    .line 1273
    int-to-long v10, v4

    .line 1274
    shl-long v10, v10, v22

    .line 1275
    .line 1276
    add-long/2addr v8, v10

    .line 1277
    add-int/lit8 v4, v7, 0x2

    .line 1278
    .line 1279
    aget-byte v4, v2, v4

    .line 1280
    .line 1281
    int-to-long v10, v4

    .line 1282
    shl-long/2addr v10, v14

    .line 1283
    add-long/2addr v8, v10

    .line 1284
    add-int/lit8 v4, v7, 0x1

    .line 1285
    .line 1286
    aget-byte v4, v2, v4

    .line 1287
    .line 1288
    int-to-long v10, v4

    .line 1289
    shl-long/2addr v10, v15

    .line 1290
    add-long/2addr v8, v10

    .line 1291
    aget-byte v4, v2, v7

    .line 1292
    .line 1293
    goto/16 :goto_b

    .line 1294
    .line 1295
    :pswitch_e
    move/from16 v16, v11

    .line 1296
    .line 1297
    move/from16 v22, v13

    .line 1298
    .line 1299
    const-wide/16 v18, -0x1

    .line 1300
    .line 1301
    add-int/lit8 v4, v7, 0x3

    .line 1302
    .line 1303
    aget-byte v4, v2, v4

    .line 1304
    .line 1305
    shl-int/lit8 v4, v4, 0x18

    .line 1306
    .line 1307
    add-int/lit8 v8, v7, 0x2

    .line 1308
    .line 1309
    aget-byte v8, v2, v8

    .line 1310
    .line 1311
    shl-int/2addr v8, v14

    .line 1312
    add-int/2addr v4, v8

    .line 1313
    add-int/lit8 v8, v7, 0x1

    .line 1314
    .line 1315
    aget-byte v8, v2, v8

    .line 1316
    .line 1317
    shl-int/2addr v8, v15

    .line 1318
    add-int/2addr v4, v8

    .line 1319
    aget-byte v8, v2, v7

    .line 1320
    .line 1321
    :goto_d
    add-int/2addr v4, v8

    .line 1322
    :goto_e
    int-to-long v8, v4

    .line 1323
    goto/16 :goto_c

    .line 1324
    .line 1325
    :pswitch_f
    move/from16 v16, v11

    .line 1326
    .line 1327
    const-wide/16 v18, -0x1

    .line 1328
    .line 1329
    add-int/lit8 v4, v7, 0x2

    .line 1330
    .line 1331
    aget-byte v4, v2, v4

    .line 1332
    .line 1333
    shl-int/2addr v4, v14

    .line 1334
    add-int/lit8 v8, v7, 0x1

    .line 1335
    .line 1336
    aget-byte v8, v2, v8

    .line 1337
    .line 1338
    shl-int/2addr v8, v15

    .line 1339
    add-int/2addr v4, v8

    .line 1340
    aget-byte v8, v2, v7

    .line 1341
    .line 1342
    goto :goto_d

    .line 1343
    :pswitch_10
    move/from16 v16, v11

    .line 1344
    .line 1345
    const-wide/16 v18, -0x1

    .line 1346
    .line 1347
    add-int/lit8 v4, v7, 0x1

    .line 1348
    .line 1349
    aget-byte v4, v2, v4

    .line 1350
    .line 1351
    shl-int/2addr v4, v15

    .line 1352
    aget-byte v8, v2, v7

    .line 1353
    .line 1354
    goto :goto_d

    .line 1355
    :pswitch_11
    move/from16 v16, v11

    .line 1356
    .line 1357
    const-wide/16 v18, -0x1

    .line 1358
    .line 1359
    aget-byte v4, v2, v7

    .line 1360
    .line 1361
    goto :goto_e

    .line 1362
    :goto_f
    cmp-long v4, v12, v18

    .line 1363
    .line 1364
    if-eqz v4, :cond_15

    .line 1365
    .line 1366
    cmp-long v4, v14, v18

    .line 1367
    .line 1368
    if-eqz v4, :cond_13

    .line 1369
    .line 1370
    xor-long v8, v12, v14

    .line 1371
    .line 1372
    ushr-long v10, v8, v16

    .line 1373
    .line 1374
    xor-long/2addr v8, v10

    .line 1375
    long-to-int v4, v8

    .line 1376
    sget-object v8, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1377
    .line 1378
    array-length v9, v8

    .line 1379
    sub-int/2addr v9, v5

    .line 1380
    and-int/2addr v4, v9

    .line 1381
    aget-object v5, v8, v4

    .line 1382
    .line 1383
    if-nez v5, :cond_12

    .line 1384
    .line 1385
    invoke-virtual {v0, v7, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v11

    .line 1389
    new-instance v10, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1390
    .line 1391
    invoke-direct/range {v10 .. v15}, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;-><init>(Ljava/lang/String;JJ)V

    .line 1392
    .line 1393
    .line 1394
    aput-object v10, v8, v4

    .line 1395
    .line 1396
    return-object v11

    .line 1397
    :cond_12
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value0:J

    .line 1398
    .line 1399
    cmp-long v4, v8, v12

    .line 1400
    .line 1401
    if-nez v4, :cond_15

    .line 1402
    .line 1403
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value1:J

    .line 1404
    .line 1405
    cmp-long v4, v8, v14

    .line 1406
    .line 1407
    if-nez v4, :cond_15

    .line 1408
    .line 1409
    iget-object v1, v5, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->name:Ljava/lang/String;

    .line 1410
    .line 1411
    return-object v1

    .line 1412
    :cond_13
    ushr-long v8, v12, v16

    .line 1413
    .line 1414
    xor-long/2addr v8, v12

    .line 1415
    long-to-int v4, v8

    .line 1416
    sget-object v8, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1417
    .line 1418
    array-length v9, v8

    .line 1419
    sub-int/2addr v9, v5

    .line 1420
    and-int/2addr v4, v9

    .line 1421
    aget-object v5, v8, v4

    .line 1422
    .line 1423
    if-nez v5, :cond_14

    .line 1424
    .line 1425
    invoke-virtual {v0, v7, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    new-instance v2, Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1430
    .line 1431
    invoke-direct {v2, v1, v12, v13}, Lcom/alibaba/fastjson2/util/NameCacheEntry;-><init>(Ljava/lang/String;J)V

    .line 1432
    .line 1433
    .line 1434
    aput-object v2, v8, v4

    .line 1435
    .line 1436
    return-object v1

    .line 1437
    :cond_14
    iget-wide v8, v5, Lcom/alibaba/fastjson2/util/NameCacheEntry;->value:J

    .line 1438
    .line 1439
    cmp-long v4, v8, v12

    .line 1440
    .line 1441
    if-nez v4, :cond_15

    .line 1442
    .line 1443
    iget-object v1, v5, Lcom/alibaba/fastjson2/util/NameCacheEntry;->name:Ljava/lang/String;

    .line 1444
    .line 1445
    return-object v1

    .line 1446
    :cond_15
    if-eqz v3, :cond_1b

    .line 1447
    .line 1448
    sget v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 1449
    .line 1450
    const/16 v4, 0x22

    .line 1451
    .line 1452
    if-ge v3, v4, :cond_1a

    .line 1453
    .line 1454
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 1455
    .line 1456
    if-nez v3, :cond_16

    .line 1457
    .line 1458
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1459
    .line 1460
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 1461
    .line 1462
    const/4 v5, 0x0

    .line 1463
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v3

    .line 1467
    check-cast v3, [C

    .line 1468
    .line 1469
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 1470
    .line 1471
    :cond_16
    if-eqz v3, :cond_17

    .line 1472
    .line 1473
    array-length v4, v3

    .line 1474
    if-ge v4, v1, :cond_18

    .line 1475
    .line 1476
    :cond_17
    new-array v3, v1, [C

    .line 1477
    .line 1478
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 1479
    .line 1480
    :cond_18
    move v4, v6

    .line 1481
    :goto_10
    if-ge v4, v1, :cond_19

    .line 1482
    .line 1483
    add-int v5, v7, v4

    .line 1484
    .line 1485
    aget-byte v5, v2, v5

    .line 1486
    .line 1487
    int-to-char v5, v5

    .line 1488
    aput-char v5, v3, v4

    .line 1489
    .line 1490
    add-int/lit8 v4, v4, 0x1

    .line 1491
    .line 1492
    goto :goto_10

    .line 1493
    :cond_19
    new-instance v2, Ljava/lang/String;

    .line 1494
    .line 1495
    invoke-direct {v2, v3, v6, v1}, Ljava/lang/String;-><init>([CII)V

    .line 1496
    .line 1497
    .line 1498
    return-object v2

    .line 1499
    :cond_1a
    new-instance v3, Ljava/lang/String;

    .line 1500
    .line 1501
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 1502
    .line 1503
    invoke-direct {v3, v2, v7, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1504
    .line 1505
    .line 1506
    return-object v3

    .line 1507
    :cond_1b
    new-instance v3, Ljava/lang/String;

    .line 1508
    .line 1509
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1510
    .line 1511
    invoke-direct {v3, v2, v7, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1512
    .line 1513
    .line 1514
    return-object v3

    .line 1515
    :cond_1c
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getFieldName()Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    return-object v1

    .line 1520
    :cond_1d
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 1521
    .line 1522
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v1

    .line 1526
    throw v1

    .line 1527
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
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
    .end packed-switch
.end method

.method public readFieldNameHashCode()J
    .locals 29

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
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readFieldNameHashCodeUnquote()J

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
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getFieldName()Ljava/lang/String;

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
    const/4 v3, 0x1

    .line 139
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 143
    .line 144
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 145
    .line 146
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 147
    .line 148
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 149
    .line 150
    add-int/lit8 v9, v7, 0x9

    .line 151
    .line 152
    const/16 v15, 0x8

    .line 153
    .line 154
    move-wide/from16 v16, v4

    .line 155
    .line 156
    const/16 v4, 0x5c

    .line 157
    .line 158
    if-ge v9, v8, :cond_10

    .line 159
    .line 160
    aget-byte v5, v1, v7

    .line 161
    .line 162
    if-ne v5, v2, :cond_8

    .line 163
    .line 164
    move v5, v7

    .line 165
    move-wide/from16 v6, v16

    .line 166
    .line 167
    const/16 v18, 0x38

    .line 168
    .line 169
    const/16 v19, 0x30

    .line 170
    .line 171
    :goto_4
    const/16 v21, 0x28

    .line 172
    .line 173
    :goto_5
    const/16 v22, 0x20

    .line 174
    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_8
    const/16 v18, 0x38

    .line 178
    .line 179
    add-int/lit8 v10, v7, 0x1

    .line 180
    .line 181
    const/16 v19, 0x30

    .line 182
    .line 183
    aget-byte v11, v1, v10

    .line 184
    .line 185
    if-ne v11, v2, :cond_9

    .line 186
    .line 187
    if-eq v5, v4, :cond_9

    .line 188
    .line 189
    if-lez v5, :cond_9

    .line 190
    .line 191
    move/from16 v20, v7

    .line 192
    .line 193
    int-to-long v6, v5

    .line 194
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 195
    .line 196
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 197
    .line 198
    add-int/lit8 v5, v20, 0x2

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    move/from16 v20, v7

    .line 202
    .line 203
    add-int/lit8 v7, v20, 0x2

    .line 204
    .line 205
    aget-byte v6, v1, v7

    .line 206
    .line 207
    if-ne v6, v2, :cond_a

    .line 208
    .line 209
    if-eq v5, v4, :cond_a

    .line 210
    .line 211
    if-eq v11, v4, :cond_a

    .line 212
    .line 213
    if-ltz v5, :cond_a

    .line 214
    .line 215
    if-lez v11, :cond_a

    .line 216
    .line 217
    shl-int/lit8 v6, v11, 0x8

    .line 218
    .line 219
    add-int/2addr v6, v5

    .line 220
    int-to-long v5, v6

    .line 221
    const/4 v9, 0x2

    .line 222
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 223
    .line 224
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 225
    .line 226
    add-int/lit8 v7, v20, 0x3

    .line 227
    .line 228
    :goto_6
    move-wide/from16 v21, v5

    .line 229
    .line 230
    move v5, v7

    .line 231
    move-wide/from16 v6, v21

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_a
    add-int/lit8 v7, v20, 0x3

    .line 235
    .line 236
    aget-byte v10, v1, v7

    .line 237
    .line 238
    if-ne v10, v2, :cond_b

    .line 239
    .line 240
    if-eq v5, v4, :cond_b

    .line 241
    .line 242
    if-eq v11, v4, :cond_b

    .line 243
    .line 244
    if-eq v6, v4, :cond_b

    .line 245
    .line 246
    if-ltz v5, :cond_b

    .line 247
    .line 248
    if-ltz v11, :cond_b

    .line 249
    .line 250
    if-lez v6, :cond_b

    .line 251
    .line 252
    shl-int/lit8 v6, v6, 0x10

    .line 253
    .line 254
    shl-int/lit8 v9, v11, 0x8

    .line 255
    .line 256
    add-int/2addr v6, v9

    .line 257
    add-int/2addr v6, v5

    .line 258
    int-to-long v5, v6

    .line 259
    const/4 v9, 0x3

    .line 260
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 261
    .line 262
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 263
    .line 264
    add-int/lit8 v7, v20, 0x4

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_b
    add-int/lit8 v7, v20, 0x4

    .line 268
    .line 269
    const/16 v21, 0x28

    .line 270
    .line 271
    aget-byte v12, v1, v7

    .line 272
    .line 273
    if-ne v12, v2, :cond_c

    .line 274
    .line 275
    if-eq v5, v4, :cond_c

    .line 276
    .line 277
    if-eq v11, v4, :cond_c

    .line 278
    .line 279
    if-eq v6, v4, :cond_c

    .line 280
    .line 281
    if-eq v10, v4, :cond_c

    .line 282
    .line 283
    if-ltz v5, :cond_c

    .line 284
    .line 285
    if-ltz v11, :cond_c

    .line 286
    .line 287
    if-ltz v6, :cond_c

    .line 288
    .line 289
    if-lez v10, :cond_c

    .line 290
    .line 291
    shl-int/lit8 v9, v10, 0x18

    .line 292
    .line 293
    shl-int/lit8 v6, v6, 0x10

    .line 294
    .line 295
    add-int/2addr v9, v6

    .line 296
    shl-int/lit8 v6, v11, 0x8

    .line 297
    .line 298
    add-int/2addr v9, v6

    .line 299
    add-int/2addr v9, v5

    .line 300
    int-to-long v5, v9

    .line 301
    const/4 v9, 0x4

    .line 302
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 303
    .line 304
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 305
    .line 306
    add-int/lit8 v7, v20, 0x5

    .line 307
    .line 308
    move-wide/from16 v27, v5

    .line 309
    .line 310
    move v5, v7

    .line 311
    move-wide/from16 v6, v27

    .line 312
    .line 313
    goto/16 :goto_5

    .line 314
    .line 315
    :cond_c
    add-int/lit8 v7, v20, 0x5

    .line 316
    .line 317
    const/16 v22, 0x20

    .line 318
    .line 319
    aget-byte v14, v1, v7

    .line 320
    .line 321
    if-ne v14, v2, :cond_d

    .line 322
    .line 323
    if-eq v5, v4, :cond_d

    .line 324
    .line 325
    if-eq v11, v4, :cond_d

    .line 326
    .line 327
    if-eq v6, v4, :cond_d

    .line 328
    .line 329
    if-eq v10, v4, :cond_d

    .line 330
    .line 331
    if-eq v12, v4, :cond_d

    .line 332
    .line 333
    if-ltz v5, :cond_d

    .line 334
    .line 335
    if-ltz v11, :cond_d

    .line 336
    .line 337
    if-ltz v6, :cond_d

    .line 338
    .line 339
    if-ltz v10, :cond_d

    .line 340
    .line 341
    if-lez v12, :cond_d

    .line 342
    .line 343
    int-to-long v13, v12

    .line 344
    shl-long v12, v13, v22

    .line 345
    .line 346
    shl-int/lit8 v9, v10, 0x18

    .line 347
    .line 348
    int-to-long v9, v9

    .line 349
    add-long/2addr v12, v9

    .line 350
    shl-int/lit8 v6, v6, 0x10

    .line 351
    .line 352
    int-to-long v9, v6

    .line 353
    add-long/2addr v12, v9

    .line 354
    shl-int/lit8 v6, v11, 0x8

    .line 355
    .line 356
    int-to-long v9, v6

    .line 357
    add-long/2addr v12, v9

    .line 358
    int-to-long v5, v5

    .line 359
    add-long/2addr v5, v12

    .line 360
    const/4 v9, 0x5

    .line 361
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 362
    .line 363
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 364
    .line 365
    add-int/lit8 v7, v20, 0x6

    .line 366
    .line 367
    move-wide/from16 v27, v5

    .line 368
    .line 369
    move v5, v7

    .line 370
    move-wide/from16 v6, v27

    .line 371
    .line 372
    goto/16 :goto_8

    .line 373
    .line 374
    :cond_d
    add-int/lit8 v7, v20, 0x6

    .line 375
    .line 376
    aget-byte v13, v1, v7

    .line 377
    .line 378
    if-ne v13, v2, :cond_e

    .line 379
    .line 380
    if-eq v5, v4, :cond_e

    .line 381
    .line 382
    if-eq v11, v4, :cond_e

    .line 383
    .line 384
    if-eq v6, v4, :cond_e

    .line 385
    .line 386
    if-eq v10, v4, :cond_e

    .line 387
    .line 388
    if-eq v12, v4, :cond_e

    .line 389
    .line 390
    if-eq v14, v4, :cond_e

    .line 391
    .line 392
    if-ltz v5, :cond_e

    .line 393
    .line 394
    if-ltz v11, :cond_e

    .line 395
    .line 396
    if-ltz v6, :cond_e

    .line 397
    .line 398
    if-ltz v10, :cond_e

    .line 399
    .line 400
    if-ltz v12, :cond_e

    .line 401
    .line 402
    if-lez v14, :cond_e

    .line 403
    .line 404
    int-to-long v13, v14

    .line 405
    shl-long v13, v13, v21

    .line 406
    .line 407
    int-to-long v3, v12

    .line 408
    shl-long v3, v3, v22

    .line 409
    .line 410
    add-long/2addr v13, v3

    .line 411
    shl-int/lit8 v3, v10, 0x18

    .line 412
    .line 413
    int-to-long v3, v3

    .line 414
    add-long/2addr v13, v3

    .line 415
    shl-int/lit8 v3, v6, 0x10

    .line 416
    .line 417
    int-to-long v3, v3

    .line 418
    add-long/2addr v13, v3

    .line 419
    shl-int/lit8 v3, v11, 0x8

    .line 420
    .line 421
    int-to-long v3, v3

    .line 422
    add-long/2addr v13, v3

    .line 423
    int-to-long v3, v5

    .line 424
    add-long/2addr v3, v13

    .line 425
    const/4 v5, 0x6

    .line 426
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 427
    .line 428
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 429
    .line 430
    add-int/lit8 v7, v20, 0x7

    .line 431
    .line 432
    :goto_7
    move v5, v7

    .line 433
    move-wide v6, v3

    .line 434
    goto/16 :goto_8

    .line 435
    .line 436
    :cond_e
    add-int/lit8 v7, v20, 0x7

    .line 437
    .line 438
    aget-byte v3, v1, v7

    .line 439
    .line 440
    if-ne v3, v2, :cond_f

    .line 441
    .line 442
    const/16 v4, 0x5c

    .line 443
    .line 444
    if-eq v5, v4, :cond_f

    .line 445
    .line 446
    if-eq v11, v4, :cond_f

    .line 447
    .line 448
    if-eq v6, v4, :cond_f

    .line 449
    .line 450
    if-eq v10, v4, :cond_f

    .line 451
    .line 452
    if-eq v12, v4, :cond_f

    .line 453
    .line 454
    if-eq v14, v4, :cond_f

    .line 455
    .line 456
    if-eq v13, v4, :cond_f

    .line 457
    .line 458
    if-ltz v5, :cond_f

    .line 459
    .line 460
    if-ltz v11, :cond_f

    .line 461
    .line 462
    if-ltz v6, :cond_f

    .line 463
    .line 464
    if-ltz v10, :cond_f

    .line 465
    .line 466
    if-ltz v12, :cond_f

    .line 467
    .line 468
    if-ltz v14, :cond_f

    .line 469
    .line 470
    if-lez v13, :cond_f

    .line 471
    .line 472
    int-to-long v3, v13

    .line 473
    shl-long v3, v3, v19

    .line 474
    .line 475
    int-to-long v13, v14

    .line 476
    shl-long v13, v13, v21

    .line 477
    .line 478
    add-long/2addr v3, v13

    .line 479
    int-to-long v12, v12

    .line 480
    shl-long v12, v12, v22

    .line 481
    .line 482
    add-long/2addr v3, v12

    .line 483
    shl-int/lit8 v9, v10, 0x18

    .line 484
    .line 485
    int-to-long v9, v9

    .line 486
    add-long/2addr v3, v9

    .line 487
    shl-int/lit8 v6, v6, 0x10

    .line 488
    .line 489
    int-to-long v9, v6

    .line 490
    add-long/2addr v3, v9

    .line 491
    shl-int/lit8 v6, v11, 0x8

    .line 492
    .line 493
    int-to-long v9, v6

    .line 494
    add-long/2addr v3, v9

    .line 495
    int-to-long v5, v5

    .line 496
    add-long/2addr v3, v5

    .line 497
    const/4 v5, 0x7

    .line 498
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 499
    .line 500
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 501
    .line 502
    add-int/lit8 v7, v20, 0x8

    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_f
    add-int/lit8 v7, v20, 0x8

    .line 506
    .line 507
    aget-byte v4, v1, v7

    .line 508
    .line 509
    if-ne v4, v2, :cond_11

    .line 510
    .line 511
    const/16 v4, 0x5c

    .line 512
    .line 513
    if-eq v5, v4, :cond_11

    .line 514
    .line 515
    if-eq v11, v4, :cond_11

    .line 516
    .line 517
    if-eq v6, v4, :cond_11

    .line 518
    .line 519
    if-eq v10, v4, :cond_11

    .line 520
    .line 521
    if-eq v12, v4, :cond_11

    .line 522
    .line 523
    if-eq v14, v4, :cond_11

    .line 524
    .line 525
    if-eq v13, v4, :cond_11

    .line 526
    .line 527
    if-eq v3, v4, :cond_11

    .line 528
    .line 529
    if-ltz v5, :cond_11

    .line 530
    .line 531
    if-ltz v11, :cond_11

    .line 532
    .line 533
    if-ltz v6, :cond_11

    .line 534
    .line 535
    if-ltz v10, :cond_11

    .line 536
    .line 537
    if-ltz v12, :cond_11

    .line 538
    .line 539
    if-ltz v14, :cond_11

    .line 540
    .line 541
    if-ltz v13, :cond_11

    .line 542
    .line 543
    if-lez v3, :cond_11

    .line 544
    .line 545
    int-to-long v3, v3

    .line 546
    shl-long v3, v3, v18

    .line 547
    .line 548
    move-wide/from16 v25, v3

    .line 549
    .line 550
    int-to-long v3, v13

    .line 551
    shl-long v3, v3, v19

    .line 552
    .line 553
    add-long v3, v25, v3

    .line 554
    .line 555
    int-to-long v13, v14

    .line 556
    shl-long v13, v13, v21

    .line 557
    .line 558
    add-long/2addr v3, v13

    .line 559
    int-to-long v12, v12

    .line 560
    shl-long v12, v12, v22

    .line 561
    .line 562
    add-long/2addr v3, v12

    .line 563
    shl-int/lit8 v10, v10, 0x18

    .line 564
    .line 565
    int-to-long v12, v10

    .line 566
    add-long/2addr v3, v12

    .line 567
    shl-int/lit8 v6, v6, 0x10

    .line 568
    .line 569
    int-to-long v12, v6

    .line 570
    add-long/2addr v3, v12

    .line 571
    shl-int/lit8 v6, v11, 0x8

    .line 572
    .line 573
    int-to-long v10, v6

    .line 574
    add-long/2addr v3, v10

    .line 575
    int-to-long v5, v5

    .line 576
    add-long/2addr v3, v5

    .line 577
    iput v15, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 578
    .line 579
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 580
    .line 581
    move-wide v6, v3

    .line 582
    move v5, v9

    .line 583
    goto :goto_8

    .line 584
    :cond_10
    move/from16 v20, v7

    .line 585
    .line 586
    const/16 v18, 0x38

    .line 587
    .line 588
    const/16 v19, 0x30

    .line 589
    .line 590
    const/16 v21, 0x28

    .line 591
    .line 592
    const/16 v22, 0x20

    .line 593
    .line 594
    :cond_11
    move-wide/from16 v6, v16

    .line 595
    .line 596
    move/from16 v5, v20

    .line 597
    .line 598
    :goto_8
    cmp-long v3, v6, v16

    .line 599
    .line 600
    const/16 v4, 0x78

    .line 601
    .line 602
    const/16 v9, 0x75

    .line 603
    .line 604
    if-nez v3, :cond_1b

    .line 605
    .line 606
    const/4 v3, 0x0

    .line 607
    :goto_9
    if-ge v5, v8, :cond_1b

    .line 608
    .line 609
    aget-byte v10, v1, v5

    .line 610
    .line 611
    if-ne v10, v2, :cond_13

    .line 612
    .line 613
    if-nez v3, :cond_12

    .line 614
    .line 615
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 616
    .line 617
    goto/16 :goto_10

    .line 618
    .line 619
    :cond_12
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 620
    .line 621
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 622
    .line 623
    add-int/lit8 v5, v5, 0x1

    .line 624
    .line 625
    goto/16 :goto_10

    .line 626
    .line 627
    :cond_13
    const/16 v11, 0xff

    .line 628
    .line 629
    const/16 v12, 0x5c

    .line 630
    .line 631
    if-ne v10, v12, :cond_17

    .line 632
    .line 633
    const/4 v12, 0x1

    .line 634
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 635
    .line 636
    add-int/lit8 v10, v5, 0x1

    .line 637
    .line 638
    aget-byte v12, v1, v10

    .line 639
    .line 640
    if-eq v12, v9, :cond_15

    .line 641
    .line 642
    if-eq v12, v4, :cond_14

    .line 643
    .line 644
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 645
    .line 646
    .line 647
    move-result v5

    .line 648
    move/from16 v27, v10

    .line 649
    .line 650
    move v10, v5

    .line 651
    move/from16 v5, v27

    .line 652
    .line 653
    goto :goto_a

    .line 654
    :cond_14
    add-int/lit8 v10, v5, 0x2

    .line 655
    .line 656
    aget-byte v10, v1, v10

    .line 657
    .line 658
    add-int/lit8 v5, v5, 0x3

    .line 659
    .line 660
    aget-byte v12, v1, v5

    .line 661
    .line 662
    invoke-static {v10, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 663
    .line 664
    .line 665
    move-result v10

    .line 666
    goto :goto_a

    .line 667
    :cond_15
    add-int/lit8 v10, v5, 0x2

    .line 668
    .line 669
    aget-byte v10, v1, v10

    .line 670
    .line 671
    add-int/lit8 v12, v5, 0x3

    .line 672
    .line 673
    aget-byte v12, v1, v12

    .line 674
    .line 675
    add-int/lit8 v13, v5, 0x4

    .line 676
    .line 677
    aget-byte v13, v1, v13

    .line 678
    .line 679
    add-int/lit8 v5, v5, 0x5

    .line 680
    .line 681
    aget-byte v14, v1, v5

    .line 682
    .line 683
    invoke-static {v10, v12, v13, v14}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 684
    .line 685
    .line 686
    move-result v10

    .line 687
    :goto_a
    if-le v10, v11, :cond_16

    .line 688
    .line 689
    const/4 v12, 0x0

    .line 690
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 691
    .line 692
    :cond_16
    const/16 v23, 0x6

    .line 693
    .line 694
    goto :goto_b

    .line 695
    :cond_17
    const/16 v12, -0x3d

    .line 696
    .line 697
    if-eq v10, v12, :cond_18

    .line 698
    .line 699
    const/16 v12, -0x3e

    .line 700
    .line 701
    if-ne v10, v12, :cond_16

    .line 702
    .line 703
    :cond_18
    add-int/lit8 v5, v5, 0x1

    .line 704
    .line 705
    aget-byte v12, v1, v5

    .line 706
    .line 707
    and-int/lit8 v10, v10, 0x1f

    .line 708
    .line 709
    const/16 v23, 0x6

    .line 710
    .line 711
    shl-int/lit8 v10, v10, 0x6

    .line 712
    .line 713
    and-int/lit8 v12, v12, 0x3f

    .line 714
    .line 715
    or-int/2addr v10, v12

    .line 716
    int-to-char v10, v10

    .line 717
    const/4 v12, 0x0

    .line 718
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 719
    .line 720
    :goto_b
    if-gt v10, v11, :cond_1a

    .line 721
    .line 722
    if-ltz v10, :cond_1a

    .line 723
    .line 724
    if-ge v3, v15, :cond_1a

    .line 725
    .line 726
    if-nez v3, :cond_19

    .line 727
    .line 728
    if-nez v10, :cond_19

    .line 729
    .line 730
    goto :goto_f

    .line 731
    :cond_19
    packed-switch v3, :pswitch_data_0

    .line 732
    .line 733
    .line 734
    :goto_c
    const/16 v24, 0x1

    .line 735
    .line 736
    goto :goto_e

    .line 737
    :pswitch_0
    int-to-byte v10, v10

    .line 738
    int-to-long v10, v10

    .line 739
    shl-long v10, v10, v18

    .line 740
    .line 741
    const-wide v12, 0xffffffffffffffL

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    :goto_d
    and-long/2addr v6, v12

    .line 747
    add-long/2addr v10, v6

    .line 748
    move-wide v6, v10

    .line 749
    goto :goto_c

    .line 750
    :pswitch_1
    int-to-byte v10, v10

    .line 751
    int-to-long v10, v10

    .line 752
    shl-long v10, v10, v19

    .line 753
    .line 754
    const-wide v12, 0xffffffffffffL

    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    goto :goto_d

    .line 760
    :pswitch_2
    int-to-byte v10, v10

    .line 761
    int-to-long v10, v10

    .line 762
    shl-long v10, v10, v21

    .line 763
    .line 764
    const-wide v12, 0xffffffffffL

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    goto :goto_d

    .line 770
    :pswitch_3
    int-to-byte v10, v10

    .line 771
    int-to-long v10, v10

    .line 772
    shl-long v10, v10, v22

    .line 773
    .line 774
    const-wide v12, 0xffffffffL

    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    goto :goto_d

    .line 780
    :pswitch_4
    int-to-byte v10, v10

    .line 781
    shl-int/lit8 v10, v10, 0x18

    .line 782
    .line 783
    int-to-long v10, v10

    .line 784
    const-wide/32 v12, 0xffffff

    .line 785
    .line 786
    .line 787
    goto :goto_d

    .line 788
    :pswitch_5
    int-to-byte v10, v10

    .line 789
    shl-int/lit8 v10, v10, 0x10

    .line 790
    .line 791
    int-to-long v10, v10

    .line 792
    const-wide/32 v12, 0xffff

    .line 793
    .line 794
    .line 795
    goto :goto_d

    .line 796
    :pswitch_6
    int-to-byte v10, v10

    .line 797
    shl-int/2addr v10, v15

    .line 798
    int-to-long v10, v10

    .line 799
    const-wide/16 v12, 0xff

    .line 800
    .line 801
    goto :goto_d

    .line 802
    :pswitch_7
    int-to-byte v6, v10

    .line 803
    int-to-long v6, v6

    .line 804
    goto :goto_c

    .line 805
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 806
    .line 807
    add-int/lit8 v3, v3, 0x1

    .line 808
    .line 809
    goto/16 :goto_9

    .line 810
    .line 811
    :cond_1a
    :goto_f
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 812
    .line 813
    move-wide/from16 v6, v16

    .line 814
    .line 815
    :cond_1b
    :goto_10
    cmp-long v3, v6, v16

    .line 816
    .line 817
    if-eqz v3, :cond_1c

    .line 818
    .line 819
    goto :goto_15

    .line 820
    :cond_1c
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    const/4 v12, 0x0

    .line 826
    :goto_11
    aget-byte v3, v1, v5

    .line 827
    .line 828
    const/16 v10, 0x5c

    .line 829
    .line 830
    if-ne v3, v10, :cond_1f

    .line 831
    .line 832
    const/4 v11, 0x1

    .line 833
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 834
    .line 835
    add-int/lit8 v3, v5, 0x1

    .line 836
    .line 837
    aget-byte v11, v1, v3

    .line 838
    .line 839
    if-eq v11, v9, :cond_1e

    .line 840
    .line 841
    if-eq v11, v4, :cond_1d

    .line 842
    .line 843
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    :goto_12
    const/16 v24, 0x1

    .line 848
    .line 849
    goto :goto_14

    .line 850
    :cond_1d
    add-int/lit8 v3, v5, 0x2

    .line 851
    .line 852
    aget-byte v3, v1, v3

    .line 853
    .line 854
    add-int/lit8 v5, v5, 0x3

    .line 855
    .line 856
    aget-byte v11, v1, v5

    .line 857
    .line 858
    invoke-static {v3, v11}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    :goto_13
    move/from16 v24, v5

    .line 863
    .line 864
    move v5, v3

    .line 865
    move/from16 v3, v24

    .line 866
    .line 867
    goto :goto_12

    .line 868
    :cond_1e
    add-int/lit8 v3, v5, 0x2

    .line 869
    .line 870
    aget-byte v3, v1, v3

    .line 871
    .line 872
    add-int/lit8 v11, v5, 0x3

    .line 873
    .line 874
    aget-byte v11, v1, v11

    .line 875
    .line 876
    add-int/lit8 v13, v5, 0x4

    .line 877
    .line 878
    aget-byte v13, v1, v13

    .line 879
    .line 880
    add-int/lit8 v5, v5, 0x5

    .line 881
    .line 882
    aget-byte v14, v1, v5

    .line 883
    .line 884
    invoke-static {v3, v11, v13, v14}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 885
    .line 886
    .line 887
    move-result v3

    .line 888
    goto :goto_13

    .line 889
    :goto_14
    add-int/lit8 v3, v3, 0x1

    .line 890
    .line 891
    int-to-long v13, v5

    .line 892
    xor-long v5, v6, v13

    .line 893
    .line 894
    const-wide v13, 0x100000001b3L

    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    mul-long/2addr v5, v13

    .line 900
    move-wide v6, v5

    .line 901
    move/from16 v11, v22

    .line 902
    .line 903
    const/4 v13, 0x0

    .line 904
    move v5, v3

    .line 905
    goto/16 :goto_1c

    .line 906
    .line 907
    :cond_1f
    const/16 v24, 0x1

    .line 908
    .line 909
    if-ne v3, v2, :cond_27

    .line 910
    .line 911
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 912
    .line 913
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 914
    .line 915
    add-int/lit8 v5, v5, 0x1

    .line 916
    .line 917
    :goto_15
    const/16 v2, 0x1a

    .line 918
    .line 919
    if-ne v5, v8, :cond_20

    .line 920
    .line 921
    move v4, v2

    .line 922
    goto :goto_16

    .line 923
    :cond_20
    add-int/lit8 v3, v5, 0x1

    .line 924
    .line 925
    aget-byte v4, v1, v5

    .line 926
    .line 927
    move v5, v3

    .line 928
    :goto_16
    move/from16 v3, v22

    .line 929
    .line 930
    :goto_17
    if-gt v4, v3, :cond_22

    .line 931
    .line 932
    const-wide/16 v9, 0x1

    .line 933
    .line 934
    shl-long/2addr v9, v4

    .line 935
    const-wide v11, 0x100003701L

    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    and-long/2addr v9, v11

    .line 941
    cmp-long v3, v9, v16

    .line 942
    .line 943
    if-eqz v3, :cond_22

    .line 944
    .line 945
    if-ne v5, v8, :cond_21

    .line 946
    .line 947
    move v4, v2

    .line 948
    goto :goto_18

    .line 949
    :cond_21
    add-int/lit8 v3, v5, 0x1

    .line 950
    .line 951
    aget-byte v4, v1, v5

    .line 952
    .line 953
    move v5, v3

    .line 954
    :goto_18
    const/16 v3, 0x20

    .line 955
    .line 956
    goto :goto_17

    .line 957
    :cond_22
    const/16 v3, 0x3a

    .line 958
    .line 959
    if-ne v4, v3, :cond_26

    .line 960
    .line 961
    if-ne v5, v8, :cond_23

    .line 962
    .line 963
    move v4, v2

    .line 964
    goto :goto_19

    .line 965
    :cond_23
    add-int/lit8 v3, v5, 0x1

    .line 966
    .line 967
    aget-byte v4, v1, v5

    .line 968
    .line 969
    move v5, v3

    .line 970
    :goto_19
    const/16 v11, 0x20

    .line 971
    .line 972
    :goto_1a
    if-gt v4, v11, :cond_25

    .line 973
    .line 974
    const-wide/16 v9, 0x1

    .line 975
    .line 976
    shl-long/2addr v9, v4

    .line 977
    const-wide v12, 0x100003701L

    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    and-long/2addr v9, v12

    .line 983
    cmp-long v3, v9, v16

    .line 984
    .line 985
    if-eqz v3, :cond_25

    .line 986
    .line 987
    if-ne v5, v8, :cond_24

    .line 988
    .line 989
    move v4, v2

    .line 990
    goto :goto_1a

    .line 991
    :cond_24
    add-int/lit8 v3, v5, 0x1

    .line 992
    .line 993
    aget-byte v4, v1, v5

    .line 994
    .line 995
    move v5, v3

    .line 996
    goto :goto_1a

    .line 997
    :cond_25
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 998
    .line 999
    int-to-char v1, v4

    .line 1000
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 1001
    .line 1002
    return-wide v6

    .line 1003
    :cond_26
    const-string v1, "expect \':\', but "

    .line 1004
    .line 1005
    invoke-static {v4, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    goto/16 :goto_2

    .line 1017
    .line 1018
    :cond_27
    move/from16 v11, v22

    .line 1019
    .line 1020
    if-ltz v3, :cond_28

    .line 1021
    .line 1022
    add-int/lit8 v5, v5, 0x1

    .line 1023
    .line 1024
    const/4 v13, 0x0

    .line 1025
    goto :goto_1b

    .line 1026
    :cond_28
    and-int/lit16 v3, v3, 0xff

    .line 1027
    .line 1028
    shr-int/lit8 v13, v3, 0x4

    .line 1029
    .line 1030
    packed-switch v13, :pswitch_data_1

    .line 1031
    .line 1032
    .line 1033
    const-string v1, "malformed input around byte "

    .line 1034
    .line 1035
    invoke-static {v5, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_2

    .line 1043
    .line 1044
    :pswitch_8
    add-int/lit8 v13, v5, 0x1

    .line 1045
    .line 1046
    aget-byte v13, v1, v13

    .line 1047
    .line 1048
    add-int/lit8 v14, v5, 0x2

    .line 1049
    .line 1050
    aget-byte v14, v1, v14

    .line 1051
    .line 1052
    invoke-static {v3, v13, v14, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 1053
    .line 1054
    .line 1055
    move-result v3

    .line 1056
    add-int/lit8 v5, v5, 0x3

    .line 1057
    .line 1058
    const/4 v13, 0x0

    .line 1059
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 1060
    .line 1061
    goto :goto_1b

    .line 1062
    :pswitch_9
    const/4 v13, 0x0

    .line 1063
    add-int/lit8 v14, v5, 0x1

    .line 1064
    .line 1065
    aget-byte v14, v1, v14

    .line 1066
    .line 1067
    invoke-static {v3, v14, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    add-int/lit8 v5, v5, 0x2

    .line 1072
    .line 1073
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 1074
    .line 1075
    :goto_1b
    int-to-long v14, v3

    .line 1076
    xor-long/2addr v6, v14

    .line 1077
    const-wide v14, 0x100000001b3L

    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    mul-long/2addr v6, v14

    .line 1083
    :goto_1c
    add-int/lit8 v12, v12, 0x1

    .line 1084
    .line 1085
    move/from16 v22, v11

    .line 1086
    .line 1087
    goto/16 :goto_11

    .line 1088
    .line 1089
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

    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_9
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public readFieldNameHashCodeUnquote()J
    .locals 28

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
    const/16 v6, 0x5d

    .line 25
    .line 26
    const/16 v7, 0x5b

    .line 27
    .line 28
    const/16 v1, 0xd

    .line 29
    .line 30
    const-wide v19, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v21, 0x1

    .line 36
    .line 37
    const/16 v12, 0xc

    .line 38
    .line 39
    const/16 v13, 0x3a

    .line 40
    .line 41
    const/16 v14, 0x1a

    .line 42
    .line 43
    const/4 v15, 0x1

    .line 44
    if-gt v2, v3, :cond_c

    .line 45
    .line 46
    if-eq v8, v12, :cond_9

    .line 47
    .line 48
    if-eq v8, v1, :cond_9

    .line 49
    .line 50
    if-eq v8, v14, :cond_9

    .line 51
    .line 52
    if-eq v8, v13, :cond_9

    .line 53
    .line 54
    if-eq v8, v7, :cond_9

    .line 55
    .line 56
    if-eq v8, v6, :cond_9

    .line 57
    .line 58
    const/16 v6, 0x7b

    .line 59
    .line 60
    if-eq v8, v6, :cond_9

    .line 61
    .line 62
    const/16 v6, 0x7d

    .line 63
    .line 64
    if-eq v8, v6, :cond_9

    .line 65
    .line 66
    const/16 v6, 0x20

    .line 67
    .line 68
    if-eq v8, v6, :cond_9

    .line 69
    .line 70
    const/16 v6, 0x21

    .line 71
    .line 72
    if-eq v8, v6, :cond_9

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
    const/16 v6, 0x5c

    .line 84
    .line 85
    if-ne v8, v6, :cond_3

    .line 86
    .line 87
    iput-boolean v15, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 88
    .line 89
    add-int/lit8 v8, v2, 0x1

    .line 90
    .line 91
    aget-byte v7, v4, v2

    .line 92
    .line 93
    int-to-char v7, v7

    .line 94
    const/16 v1, 0x22

    .line 95
    .line 96
    if-eq v7, v1, :cond_2

    .line 97
    .line 98
    if-eq v7, v13, :cond_2

    .line 99
    .line 100
    const/16 v1, 0x40

    .line 101
    .line 102
    if-eq v7, v1, :cond_2

    .line 103
    .line 104
    if-eq v7, v6, :cond_2

    .line 105
    .line 106
    const/16 v1, 0x75

    .line 107
    .line 108
    if-eq v7, v1, :cond_1

    .line 109
    .line 110
    const/16 v1, 0x78

    .line 111
    .line 112
    if-eq v7, v1, :cond_0

    .line 113
    .line 114
    const/16 v1, 0x2a

    .line 115
    .line 116
    if-eq v7, v1, :cond_2

    .line 117
    .line 118
    const/16 v1, 0x2b

    .line 119
    .line 120
    if-eq v7, v1, :cond_2

    .line 121
    .line 122
    packed-switch v7, :pswitch_data_3

    .line 123
    .line 124
    .line 125
    packed-switch v7, :pswitch_data_4

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    move v2, v8

    .line 133
    move v8, v1

    .line 134
    goto :goto_1

    .line 135
    :cond_0
    aget-byte v1, v4, v8

    .line 136
    .line 137
    add-int/lit8 v6, v2, 0x2

    .line 138
    .line 139
    aget-byte v6, v4, v6

    .line 140
    .line 141
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    add-int/lit8 v2, v2, 0x3

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    aget-byte v1, v4, v8

    .line 149
    .line 150
    add-int/lit8 v6, v2, 0x2

    .line 151
    .line 152
    aget-byte v6, v4, v6

    .line 153
    .line 154
    add-int/lit8 v7, v2, 0x3

    .line 155
    .line 156
    aget-byte v7, v4, v7

    .line 157
    .line 158
    add-int/lit8 v8, v2, 0x4

    .line 159
    .line 160
    aget-byte v8, v4, v8

    .line 161
    .line 162
    invoke-static {v1, v6, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    add-int/lit8 v2, v2, 0x5

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    :pswitch_0
    move v2, v8

    .line 170
    move v8, v7

    .line 171
    :cond_3
    :goto_1
    if-gez v8, :cond_5

    .line 172
    .line 173
    and-int/lit16 v1, v8, 0xff

    .line 174
    .line 175
    shr-int/lit8 v6, v1, 0x4

    .line 176
    .line 177
    packed-switch v6, :pswitch_data_5

    .line 178
    .line 179
    .line 180
    shr-int/lit8 v1, v8, 0x3

    .line 181
    .line 182
    const/4 v6, -0x2

    .line 183
    if-ne v1, v6, :cond_4

    .line 184
    .line 185
    aget-byte v1, v4, v2

    .line 186
    .line 187
    add-int/lit8 v6, v2, 0x1

    .line 188
    .line 189
    aget-byte v6, v4, v6

    .line 190
    .line 191
    add-int/lit8 v7, v2, 0x2

    .line 192
    .line 193
    aget-byte v7, v4, v7

    .line 194
    .line 195
    shl-int/lit8 v8, v8, 0x12

    .line 196
    .line 197
    shl-int/2addr v1, v12

    .line 198
    xor-int/2addr v1, v8

    .line 199
    shl-int/lit8 v6, v6, 0x6

    .line 200
    .line 201
    xor-int/2addr v1, v6

    .line 202
    const v6, 0x381f80

    .line 203
    .line 204
    .line 205
    xor-int/2addr v6, v7

    .line 206
    xor-int v8, v1, v6

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    const-string v1, "malformed input around byte "

    .line 210
    .line 211
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :goto_2
    const-wide/16 v1, 0x0

    .line 219
    .line 220
    return-wide v1

    .line 221
    :pswitch_1
    aget-byte v6, v4, v2

    .line 222
    .line 223
    add-int/lit8 v7, v2, 0x1

    .line 224
    .line 225
    aget-byte v7, v4, v7

    .line 226
    .line 227
    invoke-static {v1, v6, v7, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    add-int/lit8 v2, v2, 0x2

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :pswitch_2
    add-int/lit8 v6, v2, 0x1

    .line 235
    .line 236
    aget-byte v2, v4, v2

    .line 237
    .line 238
    invoke-static {v1, v2, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    move v2, v6

    .line 243
    :cond_5
    :goto_3
    const/16 v1, 0xff

    .line 244
    .line 245
    if-gt v8, v1, :cond_8

    .line 246
    .line 247
    const/16 v1, 0x8

    .line 248
    .line 249
    if-ge v9, v1, :cond_8

    .line 250
    .line 251
    if-nez v9, :cond_6

    .line 252
    .line 253
    if-nez v8, :cond_6

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_6
    int-to-byte v1, v8

    .line 257
    packed-switch v9, :pswitch_data_6

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :pswitch_3
    int-to-long v6, v1

    .line 262
    const/16 v1, 0x38

    .line 263
    .line 264
    shl-long/2addr v6, v1

    .line 265
    const-wide v12, 0xffffffffffffffL

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    :goto_4
    and-long/2addr v10, v12

    .line 271
    add-long/2addr v10, v6

    .line 272
    goto :goto_5

    .line 273
    :pswitch_4
    int-to-long v6, v1

    .line 274
    const/16 v1, 0x30

    .line 275
    .line 276
    shl-long/2addr v6, v1

    .line 277
    const-wide v12, 0xffffffffffffL

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :pswitch_5
    int-to-long v6, v1

    .line 284
    const/16 v1, 0x28

    .line 285
    .line 286
    shl-long/2addr v6, v1

    .line 287
    const-wide v12, 0xffffffffffL

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :pswitch_6
    int-to-long v6, v1

    .line 294
    const/16 v24, 0x20

    .line 295
    .line 296
    shl-long v6, v6, v24

    .line 297
    .line 298
    const-wide v12, 0xffffffffL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :pswitch_7
    shl-int/lit8 v1, v1, 0x18

    .line 305
    .line 306
    int-to-long v6, v1

    .line 307
    const-wide/32 v12, 0xffffff

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :pswitch_8
    shl-int/lit8 v1, v1, 0x10

    .line 312
    .line 313
    int-to-long v6, v1

    .line 314
    const-wide/32 v12, 0xffff

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :pswitch_9
    shl-int/lit8 v1, v1, 0x8

    .line 319
    .line 320
    int-to-long v6, v1

    .line 321
    const-wide/16 v12, 0xff

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :pswitch_a
    int-to-long v10, v1

    .line 325
    :goto_5
    if-ne v2, v3, :cond_7

    .line 326
    .line 327
    move v8, v14

    .line 328
    goto :goto_6

    .line 329
    :cond_7
    add-int/lit8 v1, v2, 0x1

    .line 330
    .line 331
    aget-byte v2, v4, v2

    .line 332
    .line 333
    move v8, v2

    .line 334
    move v2, v1

    .line 335
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 336
    .line 337
    const/4 v1, 0x0

    .line 338
    goto/16 :goto_0

    .line 339
    .line 340
    :cond_8
    :goto_7
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 341
    .line 342
    add-int/lit8 v2, v1, 0x1

    .line 343
    .line 344
    move-wide/from16 v10, v16

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_9
    :pswitch_b
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 348
    .line 349
    if-ne v8, v14, :cond_a

    .line 350
    .line 351
    move v1, v2

    .line 352
    goto :goto_8

    .line 353
    :cond_a
    add-int/lit8 v1, v2, -0x1

    .line 354
    .line 355
    :goto_8
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 356
    .line 357
    const/16 v6, 0x20

    .line 358
    .line 359
    if-gt v8, v6, :cond_c

    .line 360
    .line 361
    shl-long v5, v21, v8

    .line 362
    .line 363
    and-long v5, v5, v19

    .line 364
    .line 365
    cmp-long v1, v5, v16

    .line 366
    .line 367
    if-eqz v1, :cond_c

    .line 368
    .line 369
    if-ne v2, v3, :cond_b

    .line 370
    .line 371
    move v5, v14

    .line 372
    goto :goto_9

    .line 373
    :cond_b
    add-int/lit8 v1, v2, 0x1

    .line 374
    .line 375
    aget-byte v2, v4, v2

    .line 376
    .line 377
    int-to-char v2, v2

    .line 378
    move v5, v2

    .line 379
    move v2, v1

    .line 380
    goto :goto_9

    .line 381
    :cond_c
    move v5, v8

    .line 382
    :goto_9
    cmp-long v1, v10, v16

    .line 383
    .line 384
    if-eqz v1, :cond_d

    .line 385
    .line 386
    goto/16 :goto_14

    .line 387
    .line 388
    :cond_d
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    move-wide v10, v6

    .line 394
    const/4 v1, 0x0

    .line 395
    :goto_a
    const/16 v8, 0x5c

    .line 396
    .line 397
    if-ne v5, v8, :cond_12

    .line 398
    .line 399
    iput-boolean v15, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 400
    .line 401
    add-int/lit8 v5, v2, 0x1

    .line 402
    .line 403
    aget-byte v9, v4, v2

    .line 404
    .line 405
    const/16 v6, 0x22

    .line 406
    .line 407
    const-wide v25, 0x100000001b3L

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    if-eq v9, v6, :cond_10

    .line 413
    .line 414
    if-eq v9, v13, :cond_10

    .line 415
    .line 416
    const/16 v7, 0x40

    .line 417
    .line 418
    if-eq v9, v7, :cond_10

    .line 419
    .line 420
    if-eq v9, v8, :cond_10

    .line 421
    .line 422
    const/16 v7, 0x75

    .line 423
    .line 424
    if-eq v9, v7, :cond_f

    .line 425
    .line 426
    const/16 v7, 0x78

    .line 427
    .line 428
    if-eq v9, v7, :cond_e

    .line 429
    .line 430
    const/16 v2, 0x2a

    .line 431
    .line 432
    if-eq v9, v2, :cond_10

    .line 433
    .line 434
    const/16 v2, 0x2b

    .line 435
    .line 436
    if-eq v9, v2, :cond_10

    .line 437
    .line 438
    packed-switch v9, :pswitch_data_7

    .line 439
    .line 440
    .line 441
    packed-switch v9, :pswitch_data_8

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 445
    .line 446
    .line 447
    move-result v9

    .line 448
    goto :goto_b

    .line 449
    :cond_e
    aget-byte v5, v4, v5

    .line 450
    .line 451
    add-int/lit8 v7, v2, 0x2

    .line 452
    .line 453
    aget-byte v7, v4, v7

    .line 454
    .line 455
    invoke-static {v5, v7}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    add-int/lit8 v5, v2, 0x3

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_f
    aget-byte v5, v4, v5

    .line 463
    .line 464
    add-int/lit8 v7, v2, 0x2

    .line 465
    .line 466
    aget-byte v7, v4, v7

    .line 467
    .line 468
    add-int/lit8 v9, v2, 0x3

    .line 469
    .line 470
    aget-byte v9, v4, v9

    .line 471
    .line 472
    add-int/lit8 v23, v2, 0x4

    .line 473
    .line 474
    aget-byte v6, v4, v23

    .line 475
    .line 476
    invoke-static {v5, v7, v9, v6}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 477
    .line 478
    .line 479
    move-result v9

    .line 480
    add-int/lit8 v5, v2, 0x5

    .line 481
    .line 482
    :cond_10
    :goto_b
    :pswitch_c
    int-to-long v6, v9

    .line 483
    xor-long/2addr v6, v10

    .line 484
    mul-long v6, v6, v25

    .line 485
    .line 486
    if-ne v5, v3, :cond_11

    .line 487
    .line 488
    move v2, v5

    .line 489
    move v5, v14

    .line 490
    goto :goto_c

    .line 491
    :cond_11
    add-int/lit8 v2, v5, 0x1

    .line 492
    .line 493
    aget-byte v5, v4, v5

    .line 494
    .line 495
    :goto_c
    move-wide v10, v6

    .line 496
    const/16 v9, 0x5d

    .line 497
    .line 498
    goto/16 :goto_11

    .line 499
    .line 500
    :cond_12
    const-wide v25, 0x100000001b3L

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    if-eq v5, v12, :cond_17

    .line 506
    .line 507
    const/16 v6, 0xd

    .line 508
    .line 509
    if-eq v5, v6, :cond_17

    .line 510
    .line 511
    if-eq v5, v14, :cond_17

    .line 512
    .line 513
    if-eq v5, v13, :cond_17

    .line 514
    .line 515
    const/16 v7, 0x5b

    .line 516
    .line 517
    if-eq v5, v7, :cond_17

    .line 518
    .line 519
    const/16 v9, 0x5d

    .line 520
    .line 521
    if-eq v5, v9, :cond_17

    .line 522
    .line 523
    const/16 v6, 0x7b

    .line 524
    .line 525
    if-eq v5, v6, :cond_17

    .line 526
    .line 527
    const/16 v6, 0x7d

    .line 528
    .line 529
    if-eq v5, v6, :cond_17

    .line 530
    .line 531
    const/16 v6, 0x20

    .line 532
    .line 533
    if-eq v5, v6, :cond_17

    .line 534
    .line 535
    const/16 v6, 0x21

    .line 536
    .line 537
    if-eq v5, v6, :cond_17

    .line 538
    .line 539
    packed-switch v5, :pswitch_data_9

    .line 540
    .line 541
    .line 542
    packed-switch v5, :pswitch_data_a

    .line 543
    .line 544
    .line 545
    packed-switch v5, :pswitch_data_b

    .line 546
    .line 547
    .line 548
    if-gez v5, :cond_14

    .line 549
    .line 550
    and-int/lit16 v6, v5, 0xff

    .line 551
    .line 552
    shr-int/lit8 v23, v6, 0x4

    .line 553
    .line 554
    packed-switch v23, :pswitch_data_c

    .line 555
    .line 556
    .line 557
    shr-int/lit8 v6, v5, 0x3

    .line 558
    .line 559
    const/4 v7, -0x2

    .line 560
    if-ne v6, v7, :cond_13

    .line 561
    .line 562
    aget-byte v6, v4, v2

    .line 563
    .line 564
    add-int/lit8 v7, v2, 0x1

    .line 565
    .line 566
    aget-byte v7, v4, v7

    .line 567
    .line 568
    add-int/lit8 v23, v2, 0x2

    .line 569
    .line 570
    aget-byte v23, v4, v23

    .line 571
    .line 572
    shl-int/lit8 v5, v5, 0x12

    .line 573
    .line 574
    shl-int/2addr v6, v12

    .line 575
    xor-int/2addr v5, v6

    .line 576
    shl-int/lit8 v6, v7, 0x6

    .line 577
    .line 578
    xor-int/2addr v5, v6

    .line 579
    const v6, 0x381f80

    .line 580
    .line 581
    .line 582
    xor-int v6, v23, v6

    .line 583
    .line 584
    xor-int/2addr v5, v6

    .line 585
    add-int/lit8 v2, v2, 0x3

    .line 586
    .line 587
    const/4 v6, 0x0

    .line 588
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 589
    .line 590
    move v7, v6

    .line 591
    goto :goto_d

    .line 592
    :cond_13
    const-string v1, "malformed input around byte "

    .line 593
    .line 594
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    goto/16 :goto_2

    .line 602
    .line 603
    :pswitch_d
    aget-byte v5, v4, v2

    .line 604
    .line 605
    add-int/lit8 v7, v2, 0x1

    .line 606
    .line 607
    aget-byte v7, v4, v7

    .line 608
    .line 609
    invoke-static {v6, v5, v7, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    add-int/lit8 v2, v2, 0x2

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 617
    .line 618
    goto :goto_d

    .line 619
    :pswitch_e
    const/4 v7, 0x0

    .line 620
    add-int/lit8 v5, v2, 0x1

    .line 621
    .line 622
    aget-byte v2, v4, v2

    .line 623
    .line 624
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 629
    .line 630
    move/from16 v27, v5

    .line 631
    .line 632
    move v5, v2

    .line 633
    move/from16 v2, v27

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_14
    const/4 v7, 0x0

    .line 637
    :goto_d
    const v6, 0xffff

    .line 638
    .line 639
    .line 640
    if-le v5, v6, :cond_15

    .line 641
    .line 642
    ushr-int/lit8 v6, v5, 0xa

    .line 643
    .line 644
    const v18, 0xd7c0

    .line 645
    .line 646
    .line 647
    add-int v6, v6, v18

    .line 648
    .line 649
    int-to-long v7, v6

    .line 650
    xor-long v6, v10, v7

    .line 651
    .line 652
    mul-long v6, v6, v25

    .line 653
    .line 654
    and-int/lit16 v5, v5, 0x3ff

    .line 655
    .line 656
    const v8, 0xdc00

    .line 657
    .line 658
    .line 659
    add-int/2addr v5, v8

    .line 660
    int-to-long v10, v5

    .line 661
    xor-long v5, v6, v10

    .line 662
    .line 663
    :goto_e
    mul-long v5, v5, v25

    .line 664
    .line 665
    goto :goto_f

    .line 666
    :cond_15
    int-to-long v5, v5

    .line 667
    xor-long/2addr v5, v10

    .line 668
    goto :goto_e

    .line 669
    :goto_f
    if-ne v2, v3, :cond_16

    .line 670
    .line 671
    move v7, v2

    .line 672
    move v2, v14

    .line 673
    goto :goto_10

    .line 674
    :cond_16
    add-int/lit8 v7, v2, 0x1

    .line 675
    .line 676
    aget-byte v2, v4, v2

    .line 677
    .line 678
    :goto_10
    move-wide v10, v5

    .line 679
    move v5, v2

    .line 680
    move v2, v7

    .line 681
    :goto_11
    add-int/lit8 v1, v1, 0x1

    .line 682
    .line 683
    goto/16 :goto_a

    .line 684
    .line 685
    :cond_17
    :pswitch_f
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 686
    .line 687
    if-ne v5, v14, :cond_18

    .line 688
    .line 689
    move v1, v2

    .line 690
    goto :goto_12

    .line 691
    :cond_18
    add-int/lit8 v1, v2, -0x1

    .line 692
    .line 693
    :goto_12
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 694
    .line 695
    :goto_13
    const/16 v6, 0x20

    .line 696
    .line 697
    if-gt v5, v6, :cond_1a

    .line 698
    .line 699
    shl-long v6, v21, v5

    .line 700
    .line 701
    and-long v6, v6, v19

    .line 702
    .line 703
    cmp-long v1, v6, v16

    .line 704
    .line 705
    if-eqz v1, :cond_1a

    .line 706
    .line 707
    if-ne v2, v3, :cond_19

    .line 708
    .line 709
    move v5, v14

    .line 710
    goto :goto_13

    .line 711
    :cond_19
    add-int/lit8 v1, v2, 0x1

    .line 712
    .line 713
    aget-byte v2, v4, v2

    .line 714
    .line 715
    move v5, v2

    .line 716
    move v2, v1

    .line 717
    goto :goto_13

    .line 718
    :cond_1a
    :goto_14
    if-ne v5, v13, :cond_1d

    .line 719
    .line 720
    if-ne v2, v3, :cond_1b

    .line 721
    .line 722
    move v1, v2

    .line 723
    move v2, v14

    .line 724
    goto :goto_15

    .line 725
    :cond_1b
    add-int/lit8 v1, v2, 0x1

    .line 726
    .line 727
    aget-byte v2, v4, v2

    .line 728
    .line 729
    int-to-char v2, v2

    .line 730
    :goto_15
    move v5, v2

    .line 731
    const/16 v6, 0x20

    .line 732
    .line 733
    :goto_16
    move v2, v1

    .line 734
    :goto_17
    if-gt v5, v6, :cond_1d

    .line 735
    .line 736
    shl-long v7, v21, v5

    .line 737
    .line 738
    and-long v7, v7, v19

    .line 739
    .line 740
    cmp-long v1, v7, v16

    .line 741
    .line 742
    if-eqz v1, :cond_1d

    .line 743
    .line 744
    if-ne v2, v3, :cond_1c

    .line 745
    .line 746
    move v5, v14

    .line 747
    goto :goto_17

    .line 748
    :cond_1c
    add-int/lit8 v1, v2, 0x1

    .line 749
    .line 750
    aget-byte v2, v4, v2

    .line 751
    .line 752
    move v5, v2

    .line 753
    goto :goto_16

    .line 754
    :cond_1d
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 755
    .line 756
    int-to-char v1, v5

    .line 757
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 758
    .line 759
    return-wide v10

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    :pswitch_data_1
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

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    :pswitch_data_3
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    :pswitch_data_4
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    :pswitch_data_5
    .packed-switch 0xc
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    :pswitch_data_7
    .packed-switch 0x2d
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    :pswitch_data_8
    .packed-switch 0x3c
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    .line 862
    :pswitch_data_9
    .packed-switch 0x8
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x28
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x3c
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0xc
        :pswitch_e
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public final readFloatValue()F
    .locals 32

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
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v2, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v3

    .line 21
    move v3, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v3, v4, :cond_2

    .line 25
    .line 26
    move v5, v3

    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 31
    .line 32
    aget-byte v3, v1, v3

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-ne v3, v2, :cond_4

    .line 39
    .line 40
    if-ne v5, v4, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x1a

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 46
    .line 47
    aget-byte v3, v1, v5

    .line 48
    .line 49
    move v5, v2

    .line 50
    :goto_2
    const-wide/16 v11, 0x0

    .line 51
    .line 52
    const/4 v13, 0x1

    .line 53
    const/4 v14, 0x0

    .line 54
    const-wide/16 v16, 0x1

    .line 55
    .line 56
    const-wide/16 v18, 0x0

    .line 57
    .line 58
    goto/16 :goto_19

    .line 59
    .line 60
    :cond_4
    const/16 v15, 0x2b

    .line 61
    .line 62
    const/16 v6, 0x2d

    .line 63
    .line 64
    const/16 v7, 0x39

    .line 65
    .line 66
    const-wide/16 v16, 0x1

    .line 67
    .line 68
    const/16 v9, 0x30

    .line 69
    .line 70
    if-lt v3, v9, :cond_5

    .line 71
    .line 72
    if-gt v3, v7, :cond_5

    .line 73
    .line 74
    rsub-int/lit8 v10, v3, 0x30

    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    int-to-long v11, v10

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const-wide/16 v18, 0x0

    .line 81
    .line 82
    if-eq v3, v6, :cond_6

    .line 83
    .line 84
    if-ne v3, v15, :cond_7

    .line 85
    .line 86
    :cond_6
    move-wide/from16 v11, v18

    .line 87
    .line 88
    :goto_3
    cmp-long v10, v11, v18

    .line 89
    .line 90
    const-wide/16 v20, 0x64

    .line 91
    .line 92
    const-wide v22, -0x147ae147ae147aeL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    const/4 v13, -0x1

    .line 98
    if-gtz v10, :cond_8

    .line 99
    .line 100
    const/16 v24, 0x0

    .line 101
    .line 102
    add-int/lit8 v14, v5, 0x1

    .line 103
    .line 104
    if-ge v14, v4, :cond_9

    .line 105
    .line 106
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-eq v14, v13, :cond_9

    .line 111
    .line 112
    cmp-long v10, v22, v11

    .line 113
    .line 114
    if-gtz v10, :cond_7

    .line 115
    .line 116
    mul-long v11, v11, v20

    .line 117
    .line 118
    int-to-long v13, v14

    .line 119
    sub-long/2addr v11, v13

    .line 120
    add-int/lit8 v5, v5, 0x2

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    move-wide/from16 v11, v16

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    const/16 v24, 0x0

    .line 127
    .line 128
    :cond_9
    const-wide/16 v25, 0x30

    .line 129
    .line 130
    const-wide/16 v27, 0xa

    .line 131
    .line 132
    const-wide v29, -0xcccccccccccccccL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-gtz v10, :cond_b

    .line 138
    .line 139
    if-ge v5, v4, :cond_b

    .line 140
    .line 141
    aget-byte v10, v1, v5

    .line 142
    .line 143
    if-lt v10, v9, :cond_c

    .line 144
    .line 145
    if-gt v10, v7, :cond_c

    .line 146
    .line 147
    cmp-long v14, v29, v11

    .line 148
    .line 149
    if-gtz v14, :cond_a

    .line 150
    .line 151
    mul-long v11, v11, v27

    .line 152
    .line 153
    add-long v11, v11, v25

    .line 154
    .line 155
    int-to-long v6, v10

    .line 156
    sub-long/2addr v11, v6

    .line 157
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_a
    move-wide/from16 v11, v16

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_b
    move v10, v3

    .line 164
    :cond_c
    :goto_4
    cmp-long v6, v11, v18

    .line 165
    .line 166
    if-gtz v6, :cond_10

    .line 167
    .line 168
    if-ge v5, v4, :cond_10

    .line 169
    .line 170
    aget-byte v6, v1, v5

    .line 171
    .line 172
    const/16 v7, 0x2e

    .line 173
    .line 174
    if-ne v6, v7, :cond_10

    .line 175
    .line 176
    add-int/lit8 v5, v5, 0x1

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    :goto_5
    cmp-long v7, v11, v18

    .line 180
    .line 181
    if-gtz v7, :cond_e

    .line 182
    .line 183
    add-int/lit8 v14, v5, 0x1

    .line 184
    .line 185
    if-ge v14, v4, :cond_e

    .line 186
    .line 187
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-eq v14, v13, :cond_e

    .line 192
    .line 193
    cmp-long v7, v22, v11

    .line 194
    .line 195
    if-gtz v7, :cond_d

    .line 196
    .line 197
    mul-long v11, v11, v20

    .line 198
    .line 199
    int-to-long v13, v14

    .line 200
    sub-long/2addr v11, v13

    .line 201
    add-int/lit8 v5, v5, 0x2

    .line 202
    .line 203
    add-int/lit8 v6, v6, 0x2

    .line 204
    .line 205
    const/4 v13, -0x1

    .line 206
    goto :goto_5

    .line 207
    :cond_d
    move-wide/from16 v11, v16

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_e
    if-gtz v7, :cond_11

    .line 211
    .line 212
    if-ge v5, v4, :cond_11

    .line 213
    .line 214
    aget-byte v10, v1, v5

    .line 215
    .line 216
    if-lt v10, v9, :cond_11

    .line 217
    .line 218
    const/16 v7, 0x39

    .line 219
    .line 220
    if-gt v10, v7, :cond_11

    .line 221
    .line 222
    cmp-long v7, v29, v11

    .line 223
    .line 224
    if-gtz v7, :cond_f

    .line 225
    .line 226
    mul-long v11, v11, v27

    .line 227
    .line 228
    add-long v11, v11, v25

    .line 229
    .line 230
    int-to-long v13, v10

    .line 231
    sub-long/2addr v11, v13

    .line 232
    add-int/lit8 v5, v5, 0x1

    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_f
    move-wide/from16 v11, v16

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_10
    const/4 v6, 0x0

    .line 241
    :cond_11
    :goto_6
    cmp-long v7, v11, v18

    .line 242
    .line 243
    if-gtz v7, :cond_13

    .line 244
    .line 245
    if-ne v5, v4, :cond_12

    .line 246
    .line 247
    const/16 v10, 0x1a

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_12
    add-int/lit8 v10, v5, 0x1

    .line 251
    .line 252
    aget-byte v5, v1, v5

    .line 253
    .line 254
    move/from16 v31, v10

    .line 255
    .line 256
    move v10, v5

    .line 257
    move/from16 v5, v31

    .line 258
    .line 259
    :cond_13
    :goto_7
    if-gtz v7, :cond_23

    .line 260
    .line 261
    const/16 v7, 0x65

    .line 262
    .line 263
    if-eq v10, v7, :cond_17

    .line 264
    .line 265
    const/16 v7, 0x45

    .line 266
    .line 267
    if-ne v10, v7, :cond_14

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_14
    const/16 v7, 0x4c

    .line 271
    .line 272
    if-eq v10, v7, :cond_15

    .line 273
    .line 274
    const/16 v7, 0x46

    .line 275
    .line 276
    if-eq v10, v7, :cond_15

    .line 277
    .line 278
    const/16 v7, 0x44

    .line 279
    .line 280
    if-eq v10, v7, :cond_15

    .line 281
    .line 282
    const/16 v7, 0x42

    .line 283
    .line 284
    if-eq v10, v7, :cond_15

    .line 285
    .line 286
    const/16 v7, 0x53

    .line 287
    .line 288
    if-ne v10, v7, :cond_23

    .line 289
    .line 290
    :cond_15
    if-ne v5, v4, :cond_16

    .line 291
    .line 292
    const/16 v10, 0x1a

    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    .line 296
    :cond_16
    add-int/lit8 v7, v5, 0x1

    .line 297
    .line 298
    aget-byte v5, v1, v5

    .line 299
    .line 300
    move v10, v5

    .line 301
    move v5, v7

    .line 302
    goto/16 :goto_10

    .line 303
    .line 304
    :cond_17
    :goto_8
    if-ne v5, v4, :cond_18

    .line 305
    .line 306
    move v7, v5

    .line 307
    const/16 v5, 0x1a

    .line 308
    .line 309
    :goto_9
    const/16 v14, 0x2d

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_18
    add-int/lit8 v7, v5, 0x1

    .line 313
    .line 314
    aget-byte v5, v1, v5

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :goto_a
    if-ne v5, v14, :cond_19

    .line 318
    .line 319
    const/4 v10, 0x1

    .line 320
    goto :goto_b

    .line 321
    :cond_19
    const/4 v10, 0x0

    .line 322
    :goto_b
    if-nez v10, :cond_1c

    .line 323
    .line 324
    if-ne v5, v15, :cond_1a

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_1a
    if-eq v5, v8, :cond_1b

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    throw v1

    .line 335
    :cond_1c
    :goto_c
    if-ne v7, v4, :cond_1d

    .line 336
    .line 337
    const/16 v5, 0x1a

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_1d
    add-int/lit8 v5, v7, 0x1

    .line 341
    .line 342
    aget-byte v7, v1, v7

    .line 343
    .line 344
    move/from16 v31, v7

    .line 345
    .line 346
    move v7, v5

    .line 347
    move/from16 v5, v31

    .line 348
    .line 349
    :goto_d
    if-lt v5, v9, :cond_22

    .line 350
    .line 351
    const/16 v13, 0x39

    .line 352
    .line 353
    if-gt v5, v13, :cond_22

    .line 354
    .line 355
    add-int/lit8 v5, v5, -0x30

    .line 356
    .line 357
    :goto_e
    if-ge v7, v4, :cond_1f

    .line 358
    .line 359
    aget-byte v15, v1, v7

    .line 360
    .line 361
    if-lt v15, v9, :cond_1f

    .line 362
    .line 363
    if-gt v15, v13, :cond_1f

    .line 364
    .line 365
    add-int/lit8 v15, v15, -0x30

    .line 366
    .line 367
    mul-int/lit8 v5, v5, 0xa

    .line 368
    .line 369
    add-int/2addr v5, v15

    .line 370
    const/16 v15, 0x7ff

    .line 371
    .line 372
    if-gt v5, v15, :cond_1e

    .line 373
    .line 374
    add-int/lit8 v7, v7, 0x1

    .line 375
    .line 376
    goto :goto_e

    .line 377
    :cond_1e
    const-string v1, "too large exp value : "

    .line 378
    .line 379
    invoke-static {v5, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    const/4 v1, 0x0

    .line 387
    return v1

    .line 388
    :cond_1f
    if-eqz v10, :cond_20

    .line 389
    .line 390
    neg-int v5, v5

    .line 391
    :cond_20
    sub-int/2addr v6, v5

    .line 392
    if-ne v7, v4, :cond_21

    .line 393
    .line 394
    move v5, v7

    .line 395
    const/16 v7, 0x1a

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_21
    add-int/lit8 v5, v7, 0x1

    .line 399
    .line 400
    aget-byte v7, v1, v7

    .line 401
    .line 402
    :goto_f
    move v10, v7

    .line 403
    goto :goto_10

    .line 404
    :cond_22
    move v10, v5

    .line 405
    move v5, v7

    .line 406
    move-wide/from16 v11, v16

    .line 407
    .line 408
    :cond_23
    :goto_10
    cmp-long v7, v11, v18

    .line 409
    .line 410
    if-gtz v7, :cond_26

    .line 411
    .line 412
    if-eqz v2, :cond_26

    .line 413
    .line 414
    if-ne v10, v2, :cond_25

    .line 415
    .line 416
    if-ne v5, v4, :cond_24

    .line 417
    .line 418
    move v2, v5

    .line 419
    const/16 v5, 0x1a

    .line 420
    .line 421
    goto :goto_11

    .line 422
    :cond_24
    add-int/lit8 v2, v5, 0x1

    .line 423
    .line 424
    aget-byte v5, v1, v5

    .line 425
    .line 426
    :goto_11
    move v10, v5

    .line 427
    move v5, v2

    .line 428
    goto :goto_12

    .line 429
    :cond_25
    move-wide/from16 v11, v16

    .line 430
    .line 431
    :cond_26
    :goto_12
    cmp-long v2, v11, v18

    .line 432
    .line 433
    if-gtz v2, :cond_2f

    .line 434
    .line 435
    if-nez v6, :cond_27

    .line 436
    .line 437
    long-to-float v7, v11

    .line 438
    :goto_13
    const/4 v9, 0x1

    .line 439
    goto :goto_14

    .line 440
    :cond_27
    long-to-float v7, v11

    .line 441
    float-to-long v14, v7

    .line 442
    cmp-long v9, v14, v11

    .line 443
    .line 444
    if-nez v9, :cond_29

    .line 445
    .line 446
    if-lez v6, :cond_28

    .line 447
    .line 448
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->FLOAT_10_POW:[F

    .line 449
    .line 450
    array-length v13, v9

    .line 451
    if-ge v6, v13, :cond_28

    .line 452
    .line 453
    aget v9, v9, v6

    .line 454
    .line 455
    div-float/2addr v7, v9

    .line 456
    goto :goto_13

    .line 457
    :cond_28
    if-gez v6, :cond_29

    .line 458
    .line 459
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->FLOAT_10_POW:[F

    .line 460
    .line 461
    array-length v13, v9

    .line 462
    neg-int v13, v13

    .line 463
    if-le v6, v13, :cond_29

    .line 464
    .line 465
    neg-int v13, v6

    .line 466
    aget v9, v9, v13

    .line 467
    .line 468
    mul-float/2addr v7, v9

    .line 469
    goto :goto_13

    .line 470
    :cond_29
    move/from16 v7, v24

    .line 471
    .line 472
    const/4 v9, 0x0

    .line 473
    :goto_14
    if-nez v9, :cond_2c

    .line 474
    .line 475
    const/16 v2, -0x80

    .line 476
    .line 477
    if-le v6, v2, :cond_2b

    .line 478
    .line 479
    const/16 v2, 0x80

    .line 480
    .line 481
    if-ge v6, v2, :cond_2b

    .line 482
    .line 483
    const/16 v14, 0x2d

    .line 484
    .line 485
    if-ne v3, v14, :cond_2a

    .line 486
    .line 487
    const/4 v13, -0x1

    .line 488
    goto :goto_15

    .line 489
    :cond_2a
    const/4 v13, 0x1

    .line 490
    :goto_15
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 491
    .line 492
    .line 493
    move-result-wide v2

    .line 494
    invoke-static {v13, v2, v3, v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->floatValue(IJI)F

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    :goto_16
    move v3, v10

    .line 499
    :goto_17
    const/4 v13, 0x0

    .line 500
    goto :goto_19

    .line 501
    :cond_2b
    move v14, v7

    .line 502
    move v3, v10

    .line 503
    move-wide/from16 v11, v16

    .line 504
    .line 505
    goto :goto_17

    .line 506
    :cond_2c
    const/16 v14, 0x2d

    .line 507
    .line 508
    if-eq v3, v14, :cond_2d

    .line 509
    .line 510
    cmpl-float v2, v7, v24

    .line 511
    .line 512
    if-eqz v2, :cond_2e

    .line 513
    .line 514
    :goto_18
    neg-float v14, v7

    .line 515
    goto :goto_16

    .line 516
    :cond_2d
    if-nez v2, :cond_2e

    .line 517
    .line 518
    goto :goto_18

    .line 519
    :cond_2e
    move v14, v7

    .line 520
    goto :goto_16

    .line 521
    :cond_2f
    move v3, v10

    .line 522
    move/from16 v14, v24

    .line 523
    .line 524
    goto :goto_17

    .line 525
    :goto_19
    cmp-long v2, v11, v18

    .line 526
    .line 527
    if-lez v2, :cond_30

    .line 528
    .line 529
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readNumber0()V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getFloatValue()F

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    return v1

    .line 537
    :cond_30
    :goto_1a
    const-wide v6, 0x100003701L

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    const/16 v2, 0x20

    .line 543
    .line 544
    if-gt v3, v2, :cond_32

    .line 545
    .line 546
    shl-long v9, v16, v3

    .line 547
    .line 548
    and-long/2addr v9, v6

    .line 549
    cmp-long v9, v9, v18

    .line 550
    .line 551
    if-eqz v9, :cond_32

    .line 552
    .line 553
    if-ne v5, v4, :cond_31

    .line 554
    .line 555
    const/16 v3, 0x1a

    .line 556
    .line 557
    goto :goto_1a

    .line 558
    :cond_31
    add-int/lit8 v2, v5, 0x1

    .line 559
    .line 560
    aget-byte v3, v1, v5

    .line 561
    .line 562
    move v5, v2

    .line 563
    goto :goto_1a

    .line 564
    :cond_32
    if-ne v3, v8, :cond_33

    .line 565
    .line 566
    const/4 v8, 0x1

    .line 567
    goto :goto_1b

    .line 568
    :cond_33
    const/4 v8, 0x0

    .line 569
    :goto_1b
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 570
    .line 571
    if-eqz v8, :cond_36

    .line 572
    .line 573
    if-ne v5, v4, :cond_34

    .line 574
    .line 575
    move v3, v5

    .line 576
    const/16 v5, 0x1a

    .line 577
    .line 578
    goto :goto_1c

    .line 579
    :cond_34
    add-int/lit8 v3, v5, 0x1

    .line 580
    .line 581
    aget-byte v5, v1, v5

    .line 582
    .line 583
    :goto_1c
    move/from16 v31, v5

    .line 584
    .line 585
    move v5, v3

    .line 586
    move/from16 v3, v31

    .line 587
    .line 588
    :goto_1d
    if-gt v3, v2, :cond_36

    .line 589
    .line 590
    shl-long v8, v16, v3

    .line 591
    .line 592
    and-long/2addr v8, v6

    .line 593
    cmp-long v8, v8, v18

    .line 594
    .line 595
    if-eqz v8, :cond_36

    .line 596
    .line 597
    if-ne v5, v4, :cond_35

    .line 598
    .line 599
    const/16 v3, 0x1a

    .line 600
    .line 601
    goto :goto_1d

    .line 602
    :cond_35
    add-int/lit8 v3, v5, 0x1

    .line 603
    .line 604
    aget-byte v5, v1, v5

    .line 605
    .line 606
    goto :goto_1c

    .line 607
    :cond_36
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 608
    .line 609
    int-to-char v1, v3

    .line 610
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 611
    .line 612
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 613
    .line 614
    return v14
.end method

.method public final readHex()[B
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 6
    .line 7
    iget-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 8
    .line 9
    const/16 v4, 0x78

    .line 10
    .line 11
    const/16 v5, 0x1a

    .line 12
    .line 13
    if-ne v3, v4, :cond_1

    .line 14
    .line 15
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    move v3, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    aget-byte v1, v2, v1

    .line 24
    .line 25
    move/from16 v16, v3

    .line 26
    .line 27
    move v3, v1

    .line 28
    move/from16 v1, v16

    .line 29
    .line 30
    :cond_1
    :goto_0
    const/16 v4, 0x27

    .line 31
    .line 32
    const-string v6, "illegal state. "

    .line 33
    .line 34
    if-eq v3, v4, :cond_3

    .line 35
    .line 36
    const/16 v4, 0x22

    .line 37
    .line 38
    if-ne v3, v4, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-static {v3, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    const/4 v1, 0x0

    .line 49
    return-object v1

    .line 50
    :cond_3
    :goto_2
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 51
    .line 52
    if-ne v1, v4, :cond_4

    .line 53
    .line 54
    move v4, v1

    .line 55
    :goto_3
    move v7, v5

    .line 56
    goto :goto_4

    .line 57
    :cond_4
    add-int/lit8 v4, v1, 0x1

    .line 58
    .line 59
    aget-byte v7, v2, v1

    .line 60
    .line 61
    :goto_4
    const/16 v8, 0x39

    .line 62
    .line 63
    const/16 v9, 0x30

    .line 64
    .line 65
    if-lt v7, v9, :cond_5

    .line 66
    .line 67
    if-le v7, v8, :cond_6

    .line 68
    .line 69
    :cond_5
    const/16 v10, 0x41

    .line 70
    .line 71
    if-lt v7, v10, :cond_8

    .line 72
    .line 73
    const/16 v10, 0x46

    .line 74
    .line 75
    if-gt v7, v10, :cond_8

    .line 76
    .line 77
    :cond_6
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 78
    .line 79
    if-ne v4, v7, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    add-int/lit8 v7, v4, 0x1

    .line 83
    .line 84
    aget-byte v4, v2, v4

    .line 85
    .line 86
    move/from16 v16, v7

    .line 87
    .line 88
    move v7, v4

    .line 89
    move/from16 v4, v16

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_8
    if-ne v7, v3, :cond_17

    .line 93
    .line 94
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 95
    .line 96
    if-ne v4, v3, :cond_9

    .line 97
    .line 98
    move v3, v4

    .line 99
    move v4, v5

    .line 100
    goto :goto_5

    .line 101
    :cond_9
    add-int/lit8 v3, v4, 0x1

    .line 102
    .line 103
    aget-byte v4, v2, v4

    .line 104
    .line 105
    :goto_5
    sub-int v7, v3, v1

    .line 106
    .line 107
    add-int/lit8 v10, v7, -0x2

    .line 108
    .line 109
    const/4 v11, 0x1

    .line 110
    if-ne v4, v5, :cond_a

    .line 111
    .line 112
    add-int/lit8 v10, v7, -0x1

    .line 113
    .line 114
    :cond_a
    rem-int/lit8 v7, v10, 0x2

    .line 115
    .line 116
    if-nez v7, :cond_16

    .line 117
    .line 118
    div-int/lit8 v10, v10, 0x2

    .line 119
    .line 120
    new-array v6, v10, [B

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    :goto_6
    if-ge v7, v10, :cond_d

    .line 124
    .line 125
    mul-int/lit8 v12, v7, 0x2

    .line 126
    .line 127
    add-int/2addr v12, v1

    .line 128
    aget-byte v13, v2, v12

    .line 129
    .line 130
    add-int/2addr v12, v11

    .line 131
    aget-byte v12, v2, v12

    .line 132
    .line 133
    const/16 v14, 0x37

    .line 134
    .line 135
    if-gt v13, v8, :cond_b

    .line 136
    .line 137
    move v15, v9

    .line 138
    goto :goto_7

    .line 139
    :cond_b
    move v15, v14

    .line 140
    :goto_7
    sub-int/2addr v13, v15

    .line 141
    if-gt v12, v8, :cond_c

    .line 142
    .line 143
    move v14, v9

    .line 144
    :cond_c
    sub-int/2addr v12, v14

    .line 145
    shl-int/lit8 v13, v13, 0x4

    .line 146
    .line 147
    or-int/2addr v12, v13

    .line 148
    int-to-byte v12, v12

    .line 149
    aput-byte v12, v6, v7

    .line 150
    .line 151
    add-int/lit8 v7, v7, 0x1

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_d
    :goto_8
    const-wide/16 v7, 0x0

    .line 155
    .line 156
    const-wide v9, 0x100003701L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    const-wide/16 v12, 0x1

    .line 162
    .line 163
    const/16 v1, 0x20

    .line 164
    .line 165
    if-gt v4, v1, :cond_f

    .line 166
    .line 167
    shl-long v14, v12, v4

    .line 168
    .line 169
    and-long/2addr v14, v9

    .line 170
    cmp-long v14, v14, v7

    .line 171
    .line 172
    if-eqz v14, :cond_f

    .line 173
    .line 174
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 175
    .line 176
    if-ne v3, v1, :cond_e

    .line 177
    .line 178
    move v4, v5

    .line 179
    goto :goto_8

    .line 180
    :cond_e
    add-int/lit8 v1, v3, 0x1

    .line 181
    .line 182
    aget-byte v3, v2, v3

    .line 183
    .line 184
    move v4, v3

    .line 185
    move v3, v1

    .line 186
    goto :goto_8

    .line 187
    :cond_f
    const/16 v14, 0x2c

    .line 188
    .line 189
    if-ne v4, v14, :cond_15

    .line 190
    .line 191
    iget v14, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 192
    .line 193
    if-lt v3, v14, :cond_10

    .line 194
    .line 195
    goto :goto_b

    .line 196
    :cond_10
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 197
    .line 198
    if-ne v3, v14, :cond_11

    .line 199
    .line 200
    move v4, v3

    .line 201
    :goto_9
    move v3, v5

    .line 202
    goto :goto_a

    .line 203
    :cond_11
    add-int/lit8 v4, v3, 0x1

    .line 204
    .line 205
    aget-byte v3, v2, v3

    .line 206
    .line 207
    :goto_a
    if-gt v3, v1, :cond_13

    .line 208
    .line 209
    shl-long v14, v12, v3

    .line 210
    .line 211
    and-long/2addr v14, v9

    .line 212
    cmp-long v11, v14, v7

    .line 213
    .line 214
    if-eqz v11, :cond_13

    .line 215
    .line 216
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 217
    .line 218
    if-ne v4, v3, :cond_12

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_12
    add-int/lit8 v3, v4, 0x1

    .line 222
    .line 223
    aget-byte v4, v2, v4

    .line 224
    .line 225
    move/from16 v16, v4

    .line 226
    .line 227
    move v4, v3

    .line 228
    move/from16 v3, v16

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_13
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 232
    .line 233
    int-to-char v1, v3

    .line 234
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 235
    .line 236
    const/16 v2, 0x2f

    .line 237
    .line 238
    if-ne v1, v2, :cond_14

    .line 239
    .line 240
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 241
    .line 242
    .line 243
    :cond_14
    return-object v6

    .line 244
    :cond_15
    :goto_b
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 245
    .line 246
    int-to-char v1, v4

    .line 247
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 248
    .line 249
    return-object v6

    .line 250
    :cond_16
    invoke-static {v10, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_17
    invoke-static {v7, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_1
.end method

.method public final readIfNull()Z
    .locals 18

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
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x6e

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-ne v2, v4, :cond_7

    .line 13
    .line 14
    aget-byte v2, v1, v3

    .line 15
    .line 16
    const/16 v4, 0x75

    .line 17
    .line 18
    if-ne v2, v4, :cond_7

    .line 19
    .line 20
    add-int/lit8 v2, v3, 0x1

    .line 21
    .line 22
    aget-byte v2, v1, v2

    .line 23
    .line 24
    const/16 v4, 0x6c

    .line 25
    .line 26
    if-ne v2, v4, :cond_7

    .line 27
    .line 28
    add-int/lit8 v2, v3, 0x2

    .line 29
    .line 30
    aget-byte v2, v1, v2

    .line 31
    .line 32
    if-ne v2, v4, :cond_7

    .line 33
    .line 34
    add-int/lit8 v2, v3, 0x3

    .line 35
    .line 36
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 37
    .line 38
    const/16 v6, 0x1a

    .line 39
    .line 40
    if-ne v2, v4, :cond_0

    .line 41
    .line 42
    move v2, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    aget-byte v2, v1, v2

    .line 45
    .line 46
    int-to-char v2, v2

    .line 47
    :goto_0
    add-int/lit8 v3, v3, 0x4

    .line 48
    .line 49
    :goto_1
    const-wide/16 v7, 0x0

    .line 50
    .line 51
    const-wide v9, 0x100003701L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const-wide/16 v11, 0x1

    .line 57
    .line 58
    const/16 v4, 0x20

    .line 59
    .line 60
    if-gt v2, v4, :cond_2

    .line 61
    .line 62
    shl-long v13, v11, v2

    .line 63
    .line 64
    and-long/2addr v13, v9

    .line 65
    cmp-long v13, v13, v7

    .line 66
    .line 67
    if-eqz v13, :cond_2

    .line 68
    .line 69
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 70
    .line 71
    if-ne v3, v2, :cond_1

    .line 72
    .line 73
    move v2, v6

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    add-int/lit8 v2, v3, 0x1

    .line 76
    .line 77
    aget-byte v3, v1, v3

    .line 78
    .line 79
    move/from16 v17, v3

    .line 80
    .line 81
    move v3, v2

    .line 82
    move/from16 v2, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/16 v13, 0x2c

    .line 86
    .line 87
    const/4 v14, 0x1

    .line 88
    if-ne v2, v13, :cond_3

    .line 89
    .line 90
    move v5, v14

    .line 91
    :cond_3
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 92
    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 96
    .line 97
    if-ne v3, v2, :cond_4

    .line 98
    .line 99
    move v2, v3

    .line 100
    move v3, v6

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    add-int/lit8 v2, v3, 0x1

    .line 103
    .line 104
    aget-byte v3, v1, v3

    .line 105
    .line 106
    int-to-char v3, v3

    .line 107
    :goto_2
    move/from16 v17, v3

    .line 108
    .line 109
    move v3, v2

    .line 110
    move/from16 v2, v17

    .line 111
    .line 112
    :goto_3
    if-gt v2, v4, :cond_6

    .line 113
    .line 114
    shl-long v15, v11, v2

    .line 115
    .line 116
    and-long/2addr v15, v9

    .line 117
    cmp-long v5, v15, v7

    .line 118
    .line 119
    if-eqz v5, :cond_6

    .line 120
    .line 121
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 122
    .line 123
    if-ne v3, v2, :cond_5

    .line 124
    .line 125
    move v2, v6

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    add-int/lit8 v2, v3, 0x1

    .line 128
    .line 129
    aget-byte v3, v1, v3

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 133
    .line 134
    int-to-char v1, v2

    .line 135
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 136
    .line 137
    return v14

    .line 138
    :cond_7
    return v5
.end method

.method public final readInt32Value()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    add-int/lit8 v5, v2, 0x1

    .line 24
    .line 25
    aget-byte v2, v4, v2

    .line 26
    .line 27
    move/from16 v20, v2

    .line 28
    .line 29
    move v2, v1

    .line 30
    move/from16 v1, v20

    .line 31
    .line 32
    :goto_1
    const/16 v7, 0x39

    .line 33
    .line 34
    const/16 v8, 0x2d

    .line 35
    .line 36
    const/16 v9, 0x30

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    if-lt v1, v9, :cond_2

    .line 40
    .line 41
    if-gt v1, v7, :cond_2

    .line 42
    .line 43
    rsub-int/lit8 v11, v1, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    if-eq v1, v8, :cond_4

    .line 47
    .line 48
    const/16 v11, 0x2b

    .line 49
    .line 50
    if-ne v1, v11, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v11, v10

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    :goto_2
    const/4 v11, 0x0

    .line 56
    :goto_3
    add-int/lit8 v12, v5, 0x1

    .line 57
    .line 58
    if-ge v12, v3, :cond_7

    .line 59
    .line 60
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    const/4 v14, -0x1

    .line 65
    if-eq v13, v14, :cond_7

    .line 66
    .line 67
    const v14, -0x147ae14

    .line 68
    .line 69
    .line 70
    if-gt v14, v11, :cond_5

    .line 71
    .line 72
    move v14, v10

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/4 v14, 0x0

    .line 75
    :goto_4
    if-gtz v11, :cond_6

    .line 76
    .line 77
    move v15, v10

    .line 78
    goto :goto_5

    .line 79
    :cond_6
    const/4 v15, 0x0

    .line 80
    :goto_5
    and-int/2addr v14, v15

    .line 81
    if-eqz v14, :cond_7

    .line 82
    .line 83
    mul-int/lit8 v11, v11, 0x64

    .line 84
    .line 85
    sub-int/2addr v11, v13

    .line 86
    add-int/lit8 v5, v5, 0x2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    if-ge v5, v3, :cond_a

    .line 90
    .line 91
    aget-byte v13, v4, v5

    .line 92
    .line 93
    if-lt v13, v9, :cond_a

    .line 94
    .line 95
    if-gt v13, v7, :cond_a

    .line 96
    .line 97
    const v7, -0xccccccc

    .line 98
    .line 99
    .line 100
    if-gt v7, v11, :cond_8

    .line 101
    .line 102
    move v7, v10

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/4 v7, 0x0

    .line 105
    :goto_6
    if-gtz v11, :cond_9

    .line 106
    .line 107
    move v14, v10

    .line 108
    goto :goto_7

    .line 109
    :cond_9
    const/4 v14, 0x0

    .line 110
    :goto_7
    and-int/2addr v7, v14

    .line 111
    if-eqz v7, :cond_a

    .line 112
    .line 113
    mul-int/lit8 v11, v11, 0xa

    .line 114
    .line 115
    add-int/2addr v11, v9

    .line 116
    sub-int/2addr v11, v13

    .line 117
    move v5, v12

    .line 118
    :cond_a
    const/16 v7, 0x1a

    .line 119
    .line 120
    if-ne v5, v3, :cond_b

    .line 121
    .line 122
    move v9, v5

    .line 123
    move v5, v7

    .line 124
    goto :goto_8

    .line 125
    :cond_b
    add-int/lit8 v9, v5, 0x1

    .line 126
    .line 127
    aget-byte v5, v4, v5

    .line 128
    .line 129
    :goto_8
    if-gtz v11, :cond_1a

    .line 130
    .line 131
    const/high16 v12, -0x80000000

    .line 132
    .line 133
    if-lt v12, v11, :cond_c

    .line 134
    .line 135
    if-ne v1, v8, :cond_1a

    .line 136
    .line 137
    :cond_c
    sget-object v12, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 138
    .line 139
    and-int/lit16 v13, v5, 0xff

    .line 140
    .line 141
    aget-boolean v12, v12, v13

    .line 142
    .line 143
    if-eqz v12, :cond_1a

    .line 144
    .line 145
    if-eqz v2, :cond_d

    .line 146
    .line 147
    if-ne v5, v2, :cond_1a

    .line 148
    .line 149
    :cond_d
    if-eqz v2, :cond_f

    .line 150
    .line 151
    if-ne v9, v3, :cond_e

    .line 152
    .line 153
    move v5, v7

    .line 154
    goto :goto_9

    .line 155
    :cond_e
    add-int/lit8 v2, v9, 0x1

    .line 156
    .line 157
    aget-byte v5, v4, v9

    .line 158
    .line 159
    move v9, v2

    .line 160
    :cond_f
    :goto_9
    const/16 v2, 0x4c

    .line 161
    .line 162
    if-eq v5, v2, :cond_10

    .line 163
    .line 164
    const/16 v2, 0x46

    .line 165
    .line 166
    if-eq v5, v2, :cond_10

    .line 167
    .line 168
    const/16 v2, 0x44

    .line 169
    .line 170
    if-eq v5, v2, :cond_10

    .line 171
    .line 172
    const/16 v2, 0x42

    .line 173
    .line 174
    if-eq v5, v2, :cond_10

    .line 175
    .line 176
    const/16 v2, 0x53

    .line 177
    .line 178
    if-ne v5, v2, :cond_12

    .line 179
    .line 180
    :cond_10
    if-ne v9, v3, :cond_11

    .line 181
    .line 182
    :goto_a
    move v5, v7

    .line 183
    goto :goto_c

    .line 184
    :cond_11
    add-int/lit8 v2, v9, 0x1

    .line 185
    .line 186
    aget-byte v5, v4, v9

    .line 187
    .line 188
    :goto_b
    move v9, v2

    .line 189
    :cond_12
    :goto_c
    const-wide/16 v12, 0x0

    .line 190
    .line 191
    const-wide v14, 0x100003701L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    const-wide/16 v16, 0x1

    .line 197
    .line 198
    const/16 v2, 0x20

    .line 199
    .line 200
    if-gt v5, v2, :cond_14

    .line 201
    .line 202
    shl-long v18, v16, v5

    .line 203
    .line 204
    and-long v18, v18, v14

    .line 205
    .line 206
    cmp-long v18, v18, v12

    .line 207
    .line 208
    if-eqz v18, :cond_14

    .line 209
    .line 210
    if-ne v9, v3, :cond_13

    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_13
    add-int/lit8 v2, v9, 0x1

    .line 214
    .line 215
    aget-byte v5, v4, v9

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_14
    const/16 v6, 0x2c

    .line 219
    .line 220
    if-ne v5, v6, :cond_15

    .line 221
    .line 222
    move v6, v10

    .line 223
    goto :goto_d

    .line 224
    :cond_15
    const/4 v6, 0x0

    .line 225
    :goto_d
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 226
    .line 227
    if-eqz v6, :cond_18

    .line 228
    .line 229
    if-ne v9, v3, :cond_16

    .line 230
    .line 231
    move v6, v7

    .line 232
    goto :goto_e

    .line 233
    :cond_16
    add-int/lit8 v5, v9, 0x1

    .line 234
    .line 235
    aget-byte v6, v4, v9

    .line 236
    .line 237
    int-to-char v6, v6

    .line 238
    goto :goto_10

    .line 239
    :goto_e
    move v5, v6

    .line 240
    :goto_f
    if-gt v5, v2, :cond_18

    .line 241
    .line 242
    shl-long v18, v16, v5

    .line 243
    .line 244
    and-long v18, v18, v14

    .line 245
    .line 246
    cmp-long v6, v18, v12

    .line 247
    .line 248
    if-eqz v6, :cond_18

    .line 249
    .line 250
    if-ne v9, v3, :cond_17

    .line 251
    .line 252
    move v5, v7

    .line 253
    goto :goto_f

    .line 254
    :cond_17
    add-int/lit8 v5, v9, 0x1

    .line 255
    .line 256
    aget-byte v6, v4, v9

    .line 257
    .line 258
    :goto_10
    move v9, v5

    .line 259
    goto :goto_e

    .line 260
    :cond_18
    int-to-char v2, v5

    .line 261
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 262
    .line 263
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 264
    .line 265
    if-ne v1, v8, :cond_19

    .line 266
    .line 267
    return v11

    .line 268
    :cond_19
    neg-int v1, v11

    .line 269
    return v1

    .line 270
    :cond_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32ValueOverflow()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    return v1
.end method

.method public final readInt64Value()J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    add-int/lit8 v5, v2, 0x1

    .line 24
    .line 25
    aget-byte v2, v4, v2

    .line 26
    .line 27
    move/from16 v22, v2

    .line 28
    .line 29
    move v2, v1

    .line 30
    move/from16 v1, v22

    .line 31
    .line 32
    :goto_1
    const/16 v7, 0x39

    .line 33
    .line 34
    const/16 v10, 0x2d

    .line 35
    .line 36
    const/16 v11, 0x30

    .line 37
    .line 38
    const-wide/16 v12, 0x0

    .line 39
    .line 40
    if-lt v1, v11, :cond_2

    .line 41
    .line 42
    if-gt v1, v7, :cond_2

    .line 43
    .line 44
    rsub-int/lit8 v14, v1, 0x30

    .line 45
    .line 46
    int-to-long v14, v14

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    if-eq v1, v10, :cond_4

    .line 49
    .line 50
    const/16 v14, 0x2b

    .line 51
    .line 52
    if-ne v1, v14, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const-wide/16 v14, 0x1

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    :goto_2
    move-wide v14, v12

    .line 59
    :goto_3
    add-int/lit8 v6, v5, 0x1

    .line 60
    .line 61
    const/16 v17, 0x1

    .line 62
    .line 63
    const-wide/16 v18, 0x1

    .line 64
    .line 65
    if-ge v6, v3, :cond_7

    .line 66
    .line 67
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([BI)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const/4 v9, -0x1

    .line 72
    if-eq v8, v9, :cond_7

    .line 73
    .line 74
    const-wide v20, -0x147ae147ae147aeL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long v9, v20, v14

    .line 80
    .line 81
    if-gtz v9, :cond_5

    .line 82
    .line 83
    move/from16 v9, v17

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    const/4 v9, 0x0

    .line 87
    :goto_4
    cmp-long v20, v14, v12

    .line 88
    .line 89
    if-gtz v20, :cond_6

    .line 90
    .line 91
    move/from16 v20, v17

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_6
    const/16 v20, 0x0

    .line 95
    .line 96
    :goto_5
    and-int v9, v9, v20

    .line 97
    .line 98
    if-eqz v9, :cond_7

    .line 99
    .line 100
    const-wide/16 v20, 0x64

    .line 101
    .line 102
    mul-long v14, v14, v20

    .line 103
    .line 104
    int-to-long v8, v8

    .line 105
    sub-long/2addr v14, v8

    .line 106
    add-int/lit8 v5, v5, 0x2

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    if-ge v5, v3, :cond_a

    .line 110
    .line 111
    aget-byte v8, v4, v5

    .line 112
    .line 113
    if-lt v8, v11, :cond_a

    .line 114
    .line 115
    if-gt v8, v7, :cond_a

    .line 116
    .line 117
    const-wide v20, -0xcccccccccccccccL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    cmp-long v7, v20, v14

    .line 123
    .line 124
    if-gtz v7, :cond_8

    .line 125
    .line 126
    move/from16 v7, v17

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    const/4 v7, 0x0

    .line 130
    :goto_6
    cmp-long v9, v14, v12

    .line 131
    .line 132
    if-gtz v9, :cond_9

    .line 133
    .line 134
    move/from16 v9, v17

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_9
    const/4 v9, 0x0

    .line 138
    :goto_7
    and-int/2addr v7, v9

    .line 139
    if-eqz v7, :cond_a

    .line 140
    .line 141
    const-wide/16 v20, 0xa

    .line 142
    .line 143
    mul-long v14, v14, v20

    .line 144
    .line 145
    const-wide/16 v20, 0x30

    .line 146
    .line 147
    add-long v14, v14, v20

    .line 148
    .line 149
    int-to-long v7, v8

    .line 150
    sub-long/2addr v14, v7

    .line 151
    move v5, v6

    .line 152
    :cond_a
    const/16 v6, 0x1a

    .line 153
    .line 154
    if-ne v5, v3, :cond_b

    .line 155
    .line 156
    move v7, v5

    .line 157
    move v5, v6

    .line 158
    goto :goto_8

    .line 159
    :cond_b
    add-int/lit8 v7, v5, 0x1

    .line 160
    .line 161
    aget-byte v5, v4, v5

    .line 162
    .line 163
    :goto_8
    cmp-long v8, v14, v12

    .line 164
    .line 165
    if-gtz v8, :cond_1a

    .line 166
    .line 167
    const-wide/high16 v8, -0x8000000000000000L

    .line 168
    .line 169
    cmp-long v8, v8, v14

    .line 170
    .line 171
    if-ltz v8, :cond_c

    .line 172
    .line 173
    if-ne v1, v10, :cond_1a

    .line 174
    .line 175
    :cond_c
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 176
    .line 177
    and-int/lit16 v9, v5, 0xff

    .line 178
    .line 179
    aget-boolean v8, v8, v9

    .line 180
    .line 181
    if-eqz v8, :cond_1a

    .line 182
    .line 183
    if-eqz v2, :cond_d

    .line 184
    .line 185
    if-ne v5, v2, :cond_1a

    .line 186
    .line 187
    :cond_d
    if-eqz v2, :cond_f

    .line 188
    .line 189
    if-ne v7, v3, :cond_e

    .line 190
    .line 191
    move v5, v6

    .line 192
    goto :goto_9

    .line 193
    :cond_e
    add-int/lit8 v2, v7, 0x1

    .line 194
    .line 195
    aget-byte v5, v4, v7

    .line 196
    .line 197
    move v7, v2

    .line 198
    :cond_f
    :goto_9
    const/16 v2, 0x4c

    .line 199
    .line 200
    if-eq v5, v2, :cond_10

    .line 201
    .line 202
    const/16 v2, 0x46

    .line 203
    .line 204
    if-eq v5, v2, :cond_10

    .line 205
    .line 206
    const/16 v2, 0x44

    .line 207
    .line 208
    if-eq v5, v2, :cond_10

    .line 209
    .line 210
    const/16 v2, 0x42

    .line 211
    .line 212
    if-eq v5, v2, :cond_10

    .line 213
    .line 214
    const/16 v2, 0x53

    .line 215
    .line 216
    if-ne v5, v2, :cond_12

    .line 217
    .line 218
    :cond_10
    if-ne v7, v3, :cond_11

    .line 219
    .line 220
    :goto_a
    move v5, v6

    .line 221
    goto :goto_c

    .line 222
    :cond_11
    add-int/lit8 v2, v7, 0x1

    .line 223
    .line 224
    aget-byte v5, v4, v7

    .line 225
    .line 226
    :goto_b
    move v7, v2

    .line 227
    :cond_12
    :goto_c
    const-wide v8, 0x100003701L

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    const/16 v2, 0x20

    .line 233
    .line 234
    if-gt v5, v2, :cond_14

    .line 235
    .line 236
    shl-long v20, v18, v5

    .line 237
    .line 238
    and-long v20, v20, v8

    .line 239
    .line 240
    cmp-long v11, v20, v12

    .line 241
    .line 242
    if-eqz v11, :cond_14

    .line 243
    .line 244
    if-ne v7, v3, :cond_13

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_13
    add-int/lit8 v2, v7, 0x1

    .line 248
    .line 249
    aget-byte v5, v4, v7

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_14
    const/16 v11, 0x2c

    .line 253
    .line 254
    if-ne v5, v11, :cond_15

    .line 255
    .line 256
    move/from16 v11, v17

    .line 257
    .line 258
    goto :goto_d

    .line 259
    :cond_15
    const/4 v11, 0x0

    .line 260
    :goto_d
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 261
    .line 262
    if-eqz v11, :cond_18

    .line 263
    .line 264
    if-ne v7, v3, :cond_16

    .line 265
    .line 266
    move v5, v7

    .line 267
    move v7, v6

    .line 268
    goto :goto_e

    .line 269
    :cond_16
    add-int/lit8 v5, v7, 0x1

    .line 270
    .line 271
    aget-byte v7, v4, v7

    .line 272
    .line 273
    int-to-char v7, v7

    .line 274
    :goto_e
    move/from16 v22, v7

    .line 275
    .line 276
    move v7, v5

    .line 277
    move/from16 v5, v22

    .line 278
    .line 279
    :goto_f
    if-gt v5, v2, :cond_18

    .line 280
    .line 281
    shl-long v16, v18, v5

    .line 282
    .line 283
    and-long v16, v16, v8

    .line 284
    .line 285
    cmp-long v11, v16, v12

    .line 286
    .line 287
    if-eqz v11, :cond_18

    .line 288
    .line 289
    if-ne v7, v3, :cond_17

    .line 290
    .line 291
    move v5, v6

    .line 292
    goto :goto_f

    .line 293
    :cond_17
    add-int/lit8 v5, v7, 0x1

    .line 294
    .line 295
    aget-byte v7, v4, v7

    .line 296
    .line 297
    goto :goto_e

    .line 298
    :cond_18
    int-to-char v2, v5

    .line 299
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 300
    .line 301
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 302
    .line 303
    if-ne v1, v10, :cond_19

    .line 304
    .line 305
    return-wide v14

    .line 306
    :cond_19
    neg-long v1, v14

    .line 307
    return-wide v1

    .line 308
    :cond_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64ValueOverflow()J

    .line 309
    .line 310
    .line 311
    move-result-wide v1

    .line 312
    return-wide v1
.end method

.method public final readLocalDate()Ljava/time/LocalDate;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget-char v3, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-eq v3, v4, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x27

    .line 14
    .line 15
    if-ne v3, v4, :cond_b

    .line 16
    .line 17
    :cond_0
    iget-object v4, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 18
    .line 19
    iget-object v5, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    iget-boolean v5, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 24
    .line 25
    if-nez v5, :cond_1

    .line 26
    .line 27
    iget-boolean v5, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    iget-boolean v5, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    iget-boolean v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 36
    .line 37
    if-eqz v4, :cond_b

    .line 38
    .line 39
    :cond_1
    add-int/lit8 v4, v2, 0xa

    .line 40
    .line 41
    array-length v5, v0

    .line 42
    const/16 v8, 0x2d

    .line 43
    .line 44
    const/16 v10, 0xa

    .line 45
    .line 46
    if-ge v4, v5, :cond_5

    .line 47
    .line 48
    iget v5, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 49
    .line 50
    if-ge v4, v5, :cond_5

    .line 51
    .line 52
    add-int/lit8 v5, v2, 0x4

    .line 53
    .line 54
    aget-byte v5, v0, v5

    .line 55
    .line 56
    if-ne v5, v8, :cond_5

    .line 57
    .line 58
    add-int/lit8 v5, v2, 0x7

    .line 59
    .line 60
    aget-byte v5, v0, v5

    .line 61
    .line 62
    if-ne v5, v8, :cond_5

    .line 63
    .line 64
    aget-byte v4, v0, v4

    .line 65
    .line 66
    if-ne v4, v3, :cond_5

    .line 67
    .line 68
    aget-byte v4, v0, v2

    .line 69
    .line 70
    add-int/lit8 v5, v2, 0x1

    .line 71
    .line 72
    aget-byte v5, v0, v5

    .line 73
    .line 74
    add-int/lit8 v11, v2, 0x2

    .line 75
    .line 76
    aget-byte v11, v0, v11

    .line 77
    .line 78
    add-int/lit8 v12, v2, 0x3

    .line 79
    .line 80
    aget-byte v12, v0, v12

    .line 81
    .line 82
    add-int/lit8 v13, v2, 0x5

    .line 83
    .line 84
    aget-byte v13, v0, v13

    .line 85
    .line 86
    add-int/lit8 v14, v2, 0x6

    .line 87
    .line 88
    aget-byte v14, v0, v14

    .line 89
    .line 90
    add-int/lit8 v15, v2, 0x8

    .line 91
    .line 92
    aget-byte v15, v0, v15

    .line 93
    .line 94
    add-int/lit8 v16, v2, 0x9

    .line 95
    .line 96
    aget-byte v6, v0, v16

    .line 97
    .line 98
    const/16 v16, 0x1

    .line 99
    .line 100
    const/16 v9, 0x30

    .line 101
    .line 102
    if-lt v4, v9, :cond_6

    .line 103
    .line 104
    const/16 v8, 0x39

    .line 105
    .line 106
    if-gt v4, v8, :cond_6

    .line 107
    .line 108
    if-lt v5, v9, :cond_6

    .line 109
    .line 110
    if-gt v5, v8, :cond_6

    .line 111
    .line 112
    if-lt v11, v9, :cond_6

    .line 113
    .line 114
    if-gt v11, v8, :cond_6

    .line 115
    .line 116
    if-lt v12, v9, :cond_6

    .line 117
    .line 118
    if-gt v12, v8, :cond_6

    .line 119
    .line 120
    sub-int/2addr v4, v9

    .line 121
    mul-int/lit16 v4, v4, 0x3e8

    .line 122
    .line 123
    const/16 v7, 0x64

    .line 124
    .line 125
    invoke-static {v5, v9, v7, v4}, Lp/a;->z(IIII)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v11, v9, v10, v4}, Lp/a;->z(IIII)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    sub-int/2addr v12, v9

    .line 134
    add-int/2addr v12, v4

    .line 135
    if-lt v13, v9, :cond_6

    .line 136
    .line 137
    if-gt v13, v8, :cond_6

    .line 138
    .line 139
    if-lt v14, v9, :cond_6

    .line 140
    .line 141
    if-gt v14, v8, :cond_6

    .line 142
    .line 143
    sub-int/2addr v13, v9

    .line 144
    mul-int/2addr v13, v10

    .line 145
    sub-int/2addr v14, v9

    .line 146
    add-int/2addr v14, v13

    .line 147
    if-lt v15, v9, :cond_6

    .line 148
    .line 149
    if-gt v15, v8, :cond_6

    .line 150
    .line 151
    if-lt v6, v9, :cond_6

    .line 152
    .line 153
    if-gt v6, v8, :cond_6

    .line 154
    .line 155
    sub-int/2addr v15, v9

    .line 156
    mul-int/2addr v15, v10

    .line 157
    sub-int/2addr v6, v9

    .line 158
    add-int/2addr v6, v15

    .line 159
    if-nez v12, :cond_2

    .line 160
    .line 161
    if-nez v14, :cond_2

    .line 162
    .line 163
    if-nez v6, :cond_2

    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    goto :goto_0

    .line 167
    :cond_2
    :try_start_0
    invoke-static {v12, v14, v6}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 168
    .line 169
    .line 170
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :goto_0
    add-int/lit8 v2, v2, 0xb

    .line 172
    .line 173
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 176
    .line 177
    .line 178
    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 179
    .line 180
    const/16 v3, 0x2c

    .line 181
    .line 182
    if-ne v2, v3, :cond_3

    .line 183
    .line 184
    move/from16 v6, v16

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_3
    const/4 v6, 0x0

    .line 188
    :goto_1
    iput-boolean v6, v1, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 189
    .line 190
    if-eqz v6, :cond_4

    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 193
    .line 194
    .line 195
    :cond_4
    return-object v0

    .line 196
    :catch_0
    move-exception v0

    .line 197
    const-string v2, "read date error"

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    return-object v0

    .line 208
    :cond_5
    const/16 v16, 0x1

    .line 209
    .line 210
    :cond_6
    add-int/lit8 v4, v2, 0x11

    .line 211
    .line 212
    iget v5, v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 213
    .line 214
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    const/4 v5, -0x1

    .line 219
    move v6, v2

    .line 220
    move v7, v5

    .line 221
    :goto_2
    if-ge v6, v4, :cond_8

    .line 222
    .line 223
    aget-byte v8, v0, v6

    .line 224
    .line 225
    if-ne v8, v3, :cond_7

    .line 226
    .line 227
    move v7, v6

    .line 228
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_8
    if-eq v7, v5, :cond_b

    .line 232
    .line 233
    sub-int v3, v7, v2

    .line 234
    .line 235
    if-le v3, v10, :cond_b

    .line 236
    .line 237
    add-int/lit8 v4, v7, -0x6

    .line 238
    .line 239
    aget-byte v4, v0, v4

    .line 240
    .line 241
    const/16 v5, 0x2d

    .line 242
    .line 243
    if-ne v4, v5, :cond_b

    .line 244
    .line 245
    add-int/lit8 v4, v7, -0x3

    .line 246
    .line 247
    aget-byte v4, v0, v4

    .line 248
    .line 249
    if-ne v4, v5, :cond_b

    .line 250
    .line 251
    add-int/lit8 v3, v3, -0x6

    .line 252
    .line 253
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    add-int/lit8 v3, v7, -0x5

    .line 258
    .line 259
    const/4 v4, 0x2

    .line 260
    invoke-static {v0, v3, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    add-int/lit8 v5, v7, -0x2

    .line 265
    .line 266
    invoke-static {v0, v5, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-static {v2, v3, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    add-int/lit8 v7, v7, 0x1

    .line 275
    .line 276
    iput v7, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 279
    .line 280
    .line 281
    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 282
    .line 283
    const/16 v3, 0x2c

    .line 284
    .line 285
    if-ne v2, v3, :cond_9

    .line 286
    .line 287
    move/from16 v6, v16

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_9
    const/4 v6, 0x0

    .line 291
    :goto_3
    iput-boolean v6, v1, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 292
    .line 293
    if-eqz v6, :cond_a

    .line 294
    .line 295
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 296
    .line 297
    .line 298
    :cond_a
    return-object v0

    .line 299
    :cond_b
    invoke-super {v1}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate()Ljava/time/LocalDate;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0
.end method

.method public final readLocalDate10()Ljava/time/LocalDate;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([BI)Ljava/time/LocalDate;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xb

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    const-string v1, "read date error"

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_3
    const-string v0, "localDate only support string input"

    .line 58
    .line 59
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1
.end method

.method public final readLocalDate11()Ljava/time/LocalDate;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([BI)Ljava/time/LocalDate;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xb

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localDate only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDate8()Ljava/time/LocalDate;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([BI)Ljava/time/LocalDate;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x9

    .line 18
    .line 19
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 22
    .line 23
    .line 24
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    const/16 v2, 0x2c

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    const-string v1, "read date error"

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    const/4 v0, 0x0

    .line 52
    return-object v0

    .line 53
    :cond_2
    const-string v0, "localDate only support string input"

    .line 54
    .line 55
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1
.end method

.method public final readLocalDate9()Ljava/time/LocalDate;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([BI)Ljava/time/LocalDate;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0xa

    .line 18
    .line 19
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 22
    .line 23
    .line 24
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    const/16 v2, 0x2c

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    const-string v1, "read date error"

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    const/4 v0, 0x0

    .line 52
    return-object v0

    .line 53
    :cond_2
    const-string v0, "localDate only support string input"

    .line 54
    .line 55
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1
.end method

.method public final readLocalDateTime12()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime12([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTime14()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime14([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xf

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTime16()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime16([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTime17()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime17([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x12

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTime18()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime18([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x13

    .line 18
    .line 19
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 22
    .line 23
    .line 24
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    const/16 v2, 0x2c

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object v0

    .line 41
    :cond_2
    const-string v0, "date only support string input"

    .line 42
    .line 43
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    return-object v0
.end method

.method public final readLocalDateTime19()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x14

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTime20()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime20([BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x15

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "date only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalDateTimeX(I)Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTimeX([BII)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    add-int/2addr p1, v2

    .line 23
    add-int/2addr p1, v1

    .line 24
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 27
    .line 28
    .line 29
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 30
    .line 31
    const/16 v1, 0x2c

    .line 32
    .line 33
    if-ne p1, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    :goto_0
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string p1, "date only support string input"

    .line 46
    .line 47
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public final readLocalTime10()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime10([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xb

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime11()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime11([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xc

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime12()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime12([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime15()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime15([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime18()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime18([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x13

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime5()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime5([BI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x6

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public final readLocalTime8()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([BI)Ljava/time/LocalTime;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x9

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 26
    .line 27
    .line 28
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 29
    .line 30
    const/16 v2, 0x2c

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v0

    .line 45
    :cond_3
    const-string v0, "localTime only support string input"

    .line 46
    .line 47
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public final readLocalTime9()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([BI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xa

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public final readMillis19()J
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_1
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x12

    .line 23
    .line 24
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-lt v2, v3, :cond_2

    .line 28
    .line 29
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 33
    .line 34
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 35
    .line 36
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 37
    .line 38
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19([BILjava/time/ZoneId;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 43
    .line 44
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    add-int/lit8 v6, v5, 0x13

    .line 47
    .line 48
    aget-byte v3, v3, v6

    .line 49
    .line 50
    if-ne v3, v0, :cond_5

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x14

    .line 53
    .line 54
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 57
    .line 58
    .line 59
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 60
    .line 61
    const/16 v3, 0x2c

    .line 62
    .line 63
    if-ne v0, v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/4 v4, 0x0

    .line 67
    :goto_2
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-wide v1

    .line 75
    :cond_5
    const-string v0, "illegal date input"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0
.end method

.method public final readNaN()D
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x61

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    aget-byte v2, v0, v2

    .line 14
    .line 15
    const/16 v3, 0x4e

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 22
    .line 23
    const/16 v4, 0x1a

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    :goto_0
    move v2, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x3

    .line 31
    .line 32
    aget-byte v2, v0, v2

    .line 33
    .line 34
    :goto_1
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    const-wide v7, 0x100003701L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide/16 v9, 0x1

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    if-gt v2, v3, :cond_2

    .line 46
    .line 47
    shl-long v11, v9, v2

    .line 48
    .line 49
    and-long/2addr v11, v7

    .line 50
    cmp-long v11, v11, v5

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 55
    .line 56
    if-lt v1, v2, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 60
    .line 61
    aget-byte v1, v0, v1

    .line 62
    .line 63
    move v13, v2

    .line 64
    move v2, v1

    .line 65
    move v1, v13

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/16 v11, 0x2c

    .line 68
    .line 69
    if-ne v2, v11, :cond_3

    .line 70
    .line 71
    const/4 v11, 0x1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const/4 v11, 0x0

    .line 74
    :goto_2
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 75
    .line 76
    if-eqz v11, :cond_6

    .line 77
    .line 78
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 79
    .line 80
    if-lt v1, v2, :cond_4

    .line 81
    .line 82
    move v2, v1

    .line 83
    move v1, v4

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 86
    .line 87
    aget-byte v1, v0, v1

    .line 88
    .line 89
    :goto_3
    move v13, v2

    .line 90
    move v2, v1

    .line 91
    move v1, v13

    .line 92
    :goto_4
    if-gt v2, v3, :cond_6

    .line 93
    .line 94
    shl-long v11, v9, v2

    .line 95
    .line 96
    and-long/2addr v11, v7

    .line 97
    cmp-long v11, v11, v5

    .line 98
    .line 99
    if-eqz v11, :cond_6

    .line 100
    .line 101
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 102
    .line 103
    if-lt v1, v2, :cond_5

    .line 104
    .line 105
    move v2, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 108
    .line 109
    aget-byte v1, v0, v1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    int-to-char v0, v2

    .line 113
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 118
    .line 119
    return-wide v0

    .line 120
    :cond_7
    const-string v0, "json syntax error, not NaN "

    .line 121
    .line 122
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-wide/16 v0, 0x0

    .line 130
    .line 131
    return-wide v0
.end method

.method public final readNull()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x75

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    aget-byte v2, v0, v2

    .line 14
    .line 15
    const/16 v3, 0x6c

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    aget-byte v2, v0, v2

    .line 22
    .line 23
    if-ne v2, v3, :cond_7

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x3

    .line 26
    .line 27
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 28
    .line 29
    const/16 v4, 0x1a

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    move v1, v2

    .line 34
    :goto_0
    move v2, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x4

    .line 37
    .line 38
    aget-byte v2, v0, v2

    .line 39
    .line 40
    :goto_1
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    const-wide v7, 0x100003701L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide/16 v9, 0x1

    .line 48
    .line 49
    const/16 v3, 0x20

    .line 50
    .line 51
    if-gt v2, v3, :cond_2

    .line 52
    .line 53
    shl-long v11, v9, v2

    .line 54
    .line 55
    and-long/2addr v11, v7

    .line 56
    cmp-long v11, v11, v5

    .line 57
    .line 58
    if-eqz v11, :cond_2

    .line 59
    .line 60
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 61
    .line 62
    if-lt v1, v2, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 66
    .line 67
    aget-byte v1, v0, v1

    .line 68
    .line 69
    move v13, v2

    .line 70
    move v2, v1

    .line 71
    move v1, v13

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/16 v11, 0x2c

    .line 74
    .line 75
    if-ne v2, v11, :cond_3

    .line 76
    .line 77
    const/4 v11, 0x1

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v11, 0x0

    .line 80
    :goto_2
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 81
    .line 82
    if-eqz v11, :cond_6

    .line 83
    .line 84
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 85
    .line 86
    if-lt v1, v2, :cond_4

    .line 87
    .line 88
    move v2, v1

    .line 89
    move v1, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 92
    .line 93
    aget-byte v1, v0, v1

    .line 94
    .line 95
    :goto_3
    move v13, v2

    .line 96
    move v2, v1

    .line 97
    move v1, v13

    .line 98
    :goto_4
    if-gt v2, v3, :cond_6

    .line 99
    .line 100
    shl-long v11, v9, v2

    .line 101
    .line 102
    and-long/2addr v11, v7

    .line 103
    cmp-long v11, v11, v5

    .line 104
    .line 105
    if-eqz v11, :cond_6

    .line 106
    .line 107
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 108
    .line 109
    if-lt v1, v2, :cond_5

    .line 110
    .line 111
    move v2, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 114
    .line 115
    aget-byte v1, v0, v1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    int-to-char v0, v2

    .line 119
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 120
    .line 121
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    const-string v0, "json syntax error, not match null"

    .line 125
    .line 126
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final readNullOrNewDate()Ljava/util/Date;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x2

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const-wide v7, 0x100003701L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/16 v9, 0x1

    .line 19
    .line 20
    const/16 v11, 0x20

    .line 21
    .line 22
    const/16 v12, 0x1a

    .line 23
    .line 24
    if-ge v3, v4, :cond_1

    .line 25
    .line 26
    aget-byte v13, v1, v2

    .line 27
    .line 28
    const/16 v14, 0x75

    .line 29
    .line 30
    if-ne v13, v14, :cond_1

    .line 31
    .line 32
    add-int/lit8 v13, v2, 0x1

    .line 33
    .line 34
    aget-byte v13, v1, v13

    .line 35
    .line 36
    const/16 v14, 0x6c

    .line 37
    .line 38
    if-ne v13, v14, :cond_1

    .line 39
    .line 40
    aget-byte v13, v1, v3

    .line 41
    .line 42
    if-ne v13, v14, :cond_1

    .line 43
    .line 44
    add-int/lit8 v3, v2, 0x3

    .line 45
    .line 46
    if-ne v3, v4, :cond_0

    .line 47
    .line 48
    move v3, v12

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    aget-byte v3, v1, v3

    .line 51
    .line 52
    :goto_0
    add-int/lit8 v2, v2, 0x4

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    move-wide/from16 v16, v5

    .line 56
    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v13, v2, 0x1

    .line 60
    .line 61
    if-ge v13, v4, :cond_14

    .line 62
    .line 63
    aget-byte v14, v1, v2

    .line 64
    .line 65
    const/16 v15, 0x65

    .line 66
    .line 67
    if-ne v14, v15, :cond_14

    .line 68
    .line 69
    aget-byte v13, v1, v13

    .line 70
    .line 71
    const/16 v14, 0x77

    .line 72
    .line 73
    if-ne v13, v14, :cond_14

    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x3

    .line 76
    .line 77
    if-ne v2, v4, :cond_2

    .line 78
    .line 79
    :goto_1
    move v3, v12

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    aget-byte v3, v1, v3

    .line 82
    .line 83
    :goto_2
    if-gt v3, v11, :cond_4

    .line 84
    .line 85
    shl-long v13, v9, v3

    .line 86
    .line 87
    and-long/2addr v13, v7

    .line 88
    cmp-long v4, v13, v5

    .line 89
    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 93
    .line 94
    if-ne v2, v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    add-int/lit8 v3, v2, 0x1

    .line 98
    .line 99
    aget-byte v2, v1, v2

    .line 100
    .line 101
    move/from16 v18, v3

    .line 102
    .line 103
    move v3, v2

    .line 104
    move/from16 v2, v18

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    add-int/lit8 v4, v2, 0x4

    .line 108
    .line 109
    iget v13, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 110
    .line 111
    const-string v14, "json syntax error, not match new Date"

    .line 112
    .line 113
    if-ge v4, v13, :cond_13

    .line 114
    .line 115
    move-wide/from16 v16, v5

    .line 116
    .line 117
    const/16 v5, 0x44

    .line 118
    .line 119
    if-ne v3, v5, :cond_13

    .line 120
    .line 121
    aget-byte v3, v1, v2

    .line 122
    .line 123
    const/16 v5, 0x61

    .line 124
    .line 125
    if-ne v3, v5, :cond_13

    .line 126
    .line 127
    add-int/lit8 v3, v2, 0x1

    .line 128
    .line 129
    aget-byte v3, v1, v3

    .line 130
    .line 131
    const/16 v5, 0x74

    .line 132
    .line 133
    if-ne v3, v5, :cond_13

    .line 134
    .line 135
    add-int/lit8 v3, v2, 0x2

    .line 136
    .line 137
    aget-byte v3, v1, v3

    .line 138
    .line 139
    if-ne v3, v15, :cond_13

    .line 140
    .line 141
    add-int/lit8 v2, v2, 0x3

    .line 142
    .line 143
    if-ne v2, v13, :cond_5

    .line 144
    .line 145
    :goto_3
    move v2, v12

    .line 146
    goto :goto_4

    .line 147
    :cond_5
    aget-byte v2, v1, v2

    .line 148
    .line 149
    :goto_4
    if-gt v2, v11, :cond_7

    .line 150
    .line 151
    shl-long v5, v9, v2

    .line 152
    .line 153
    and-long/2addr v5, v7

    .line 154
    cmp-long v3, v5, v16

    .line 155
    .line 156
    if-eqz v3, :cond_7

    .line 157
    .line 158
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 159
    .line 160
    if-ne v4, v2, :cond_6

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    add-int/lit8 v2, v4, 0x1

    .line 164
    .line 165
    aget-byte v3, v1, v4

    .line 166
    .line 167
    move v4, v2

    .line 168
    move v2, v3

    .line 169
    goto :goto_4

    .line 170
    :cond_7
    const/16 v3, 0x28

    .line 171
    .line 172
    if-ne v2, v3, :cond_12

    .line 173
    .line 174
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 175
    .line 176
    if-ge v4, v2, :cond_12

    .line 177
    .line 178
    add-int/lit8 v2, v4, 0x1

    .line 179
    .line 180
    aget-byte v3, v1, v4

    .line 181
    .line 182
    :goto_5
    if-gt v3, v11, :cond_9

    .line 183
    .line 184
    shl-long v4, v9, v3

    .line 185
    .line 186
    and-long/2addr v4, v7

    .line 187
    cmp-long v4, v4, v16

    .line 188
    .line 189
    if-eqz v4, :cond_9

    .line 190
    .line 191
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 192
    .line 193
    if-ne v2, v3, :cond_8

    .line 194
    .line 195
    move v3, v12

    .line 196
    goto :goto_5

    .line 197
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 198
    .line 199
    aget-byte v2, v1, v2

    .line 200
    .line 201
    move/from16 v18, v3

    .line 202
    .line 203
    move v3, v2

    .line 204
    move/from16 v2, v18

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_9
    int-to-char v3, v3

    .line 208
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 209
    .line 210
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readInt64Value()J

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 217
    .line 218
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 219
    .line 220
    const/16 v6, 0x29

    .line 221
    .line 222
    if-ne v4, v6, :cond_11

    .line 223
    .line 224
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 225
    .line 226
    if-lt v5, v4, :cond_a

    .line 227
    .line 228
    move v4, v5

    .line 229
    move v5, v12

    .line 230
    goto :goto_6

    .line 231
    :cond_a
    add-int/lit8 v4, v5, 0x1

    .line 232
    .line 233
    aget-byte v5, v1, v5

    .line 234
    .line 235
    :goto_6
    new-instance v6, Ljava/util/Date;

    .line 236
    .line 237
    invoke-direct {v6, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 238
    .line 239
    .line 240
    move v2, v4

    .line 241
    move v3, v5

    .line 242
    move-object v4, v6

    .line 243
    :goto_7
    if-gt v3, v11, :cond_c

    .line 244
    .line 245
    shl-long v5, v9, v3

    .line 246
    .line 247
    and-long/2addr v5, v7

    .line 248
    cmp-long v5, v5, v16

    .line 249
    .line 250
    if-eqz v5, :cond_c

    .line 251
    .line 252
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 253
    .line 254
    if-ne v2, v3, :cond_b

    .line 255
    .line 256
    move v3, v12

    .line 257
    goto :goto_7

    .line 258
    :cond_b
    add-int/lit8 v3, v2, 0x1

    .line 259
    .line 260
    aget-byte v2, v1, v2

    .line 261
    .line 262
    move/from16 v18, v3

    .line 263
    .line 264
    move v3, v2

    .line 265
    move/from16 v2, v18

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_c
    const/16 v5, 0x2c

    .line 269
    .line 270
    if-ne v3, v5, :cond_d

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    goto :goto_8

    .line 274
    :cond_d
    const/4 v5, 0x0

    .line 275
    :goto_8
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 276
    .line 277
    if-eqz v5, :cond_10

    .line 278
    .line 279
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 280
    .line 281
    if-ne v2, v3, :cond_e

    .line 282
    .line 283
    move v3, v2

    .line 284
    move v2, v12

    .line 285
    goto :goto_9

    .line 286
    :cond_e
    add-int/lit8 v3, v2, 0x1

    .line 287
    .line 288
    aget-byte v2, v1, v2

    .line 289
    .line 290
    :goto_9
    move/from16 v18, v3

    .line 291
    .line 292
    move v3, v2

    .line 293
    move/from16 v2, v18

    .line 294
    .line 295
    :goto_a
    if-gt v3, v11, :cond_10

    .line 296
    .line 297
    shl-long v5, v9, v3

    .line 298
    .line 299
    and-long/2addr v5, v7

    .line 300
    cmp-long v5, v5, v16

    .line 301
    .line 302
    if-eqz v5, :cond_10

    .line 303
    .line 304
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 305
    .line 306
    if-ne v2, v3, :cond_f

    .line 307
    .line 308
    move v3, v12

    .line 309
    goto :goto_a

    .line 310
    :cond_f
    add-int/lit8 v3, v2, 0x1

    .line 311
    .line 312
    aget-byte v2, v1, v2

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_10
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 316
    .line 317
    int-to-char v1, v3

    .line 318
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 319
    .line 320
    return-object v4

    .line 321
    :cond_11
    invoke-static {v5, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :goto_b
    const/4 v1, 0x0

    .line 329
    return-object v1

    .line 330
    :cond_12
    invoke-static {v4, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_13
    invoke-static {v2, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_14
    const-string v1, "json syntax error, not match null or new Date"

    .line 347
    .line 348
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto :goto_b
.end method

.method public final readNumber0()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 5
    .line 6
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 7
    .line 8
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 9
    .line 10
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 11
    .line 12
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 13
    .line 14
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 15
    .line 16
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 17
    .line 18
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 19
    .line 20
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 21
    .line 22
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 23
    .line 24
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 27
    .line 28
    const/16 v6, 0x22

    .line 29
    .line 30
    const/4 v7, 0x5

    .line 31
    const-wide v10, 0x100003701L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/16 v12, 0x1

    .line 37
    .line 38
    const/16 v14, 0x20

    .line 39
    .line 40
    const/4 v15, 0x2

    .line 41
    const/16 v16, 0x1a

    .line 42
    .line 43
    const-wide/16 v17, 0x0

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    if-eq v4, v6, :cond_1

    .line 47
    .line 48
    const/16 v6, 0x27

    .line 49
    .line 50
    if-ne v4, v6, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v6, v1

    .line 54
    move v9, v2

    .line 55
    :goto_0
    move-wide/from16 v19, v10

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    :goto_1
    add-int/lit8 v6, v2, 0x1

    .line 59
    .line 60
    aget-byte v9, v3, v2

    .line 61
    .line 62
    int-to-char v9, v9

    .line 63
    if-ne v9, v4, :cond_5

    .line 64
    .line 65
    if-ne v6, v5, :cond_2

    .line 66
    .line 67
    :goto_2
    move/from16 v1, v16

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    add-int/2addr v2, v15

    .line 71
    aget-byte v1, v3, v6

    .line 72
    .line 73
    move v6, v2

    .line 74
    :goto_3
    if-gt v1, v14, :cond_4

    .line 75
    .line 76
    shl-long v19, v12, v1

    .line 77
    .line 78
    and-long v19, v19, v10

    .line 79
    .line 80
    cmp-long v2, v19, v17

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    if-ne v6, v5, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    add-int/lit8 v1, v6, 0x1

    .line 88
    .line 89
    aget-byte v2, v3, v6

    .line 90
    .line 91
    move v6, v1

    .line 92
    move v1, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    int-to-char v1, v1

    .line 95
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 96
    .line 97
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfComma()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 104
    .line 105
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 106
    .line 107
    iput-byte v7, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    move/from16 v19, v6

    .line 111
    .line 112
    move v6, v4

    .line 113
    move v4, v9

    .line 114
    move/from16 v9, v19

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :goto_4
    const/16 v10, 0x2b

    .line 118
    .line 119
    const/16 v11, 0x2d

    .line 120
    .line 121
    move-wide/from16 v21, v12

    .line 122
    .line 123
    const-string v12, "illegal input"

    .line 124
    .line 125
    if-ne v4, v11, :cond_7

    .line 126
    .line 127
    if-eq v9, v5, :cond_6

    .line 128
    .line 129
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 130
    .line 131
    add-int/lit8 v4, v9, 0x1

    .line 132
    .line 133
    aget-byte v13, v3, v9

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_7
    if-ne v4, v10, :cond_9

    .line 145
    .line 146
    if-eq v9, v5, :cond_8

    .line 147
    .line 148
    add-int/lit8 v4, v9, 0x1

    .line 149
    .line 150
    aget-byte v13, v3, v9

    .line 151
    .line 152
    move/from16 v27, v13

    .line 153
    .line 154
    move v13, v4

    .line 155
    move/from16 v4, v27

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_8
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_9
    move v13, v9

    .line 167
    :goto_5
    move/from16 v27, v13

    .line 168
    .line 169
    move v13, v4

    .line 170
    move/from16 v4, v27

    .line 171
    .line 172
    :goto_6
    iput-byte v8, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 173
    .line 174
    move/from16 v23, v1

    .line 175
    .line 176
    move/from16 v24, v23

    .line 177
    .line 178
    :goto_7
    const/16 v14, 0x39

    .line 179
    .line 180
    const/16 v25, 0xa

    .line 181
    .line 182
    const/16 v1, 0x30

    .line 183
    .line 184
    const v7, -0xccccccc

    .line 185
    .line 186
    .line 187
    if-lt v13, v1, :cond_e

    .line 188
    .line 189
    if-gt v13, v14, :cond_e

    .line 190
    .line 191
    if-nez v23, :cond_b

    .line 192
    .line 193
    add-int/lit8 v13, v13, -0x30

    .line 194
    .line 195
    move/from16 v26, v8

    .line 196
    .line 197
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 198
    .line 199
    mul-int/lit8 v8, v8, 0xa

    .line 200
    .line 201
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 202
    .line 203
    if-ge v8, v7, :cond_a

    .line 204
    .line 205
    :goto_8
    move/from16 v23, v26

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_a
    sub-int/2addr v8, v13

    .line 209
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 210
    .line 211
    if-ge v8, v7, :cond_c

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_b
    move/from16 v26, v8

    .line 215
    .line 216
    :cond_c
    :goto_9
    if-ne v4, v5, :cond_d

    .line 217
    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    move/from16 v13, v16

    .line 221
    .line 222
    move/from16 v24, v26

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_d
    add-int/lit8 v1, v4, 0x1

    .line 226
    .line 227
    aget-byte v13, v3, v4

    .line 228
    .line 229
    move v4, v1

    .line 230
    move/from16 v8, v26

    .line 231
    .line 232
    move/from16 v24, v8

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    const/4 v7, 0x5

    .line 236
    goto :goto_7

    .line 237
    :cond_e
    move/from16 v26, v8

    .line 238
    .line 239
    :goto_a
    const/16 v8, 0x2e

    .line 240
    .line 241
    if-ne v13, v8, :cond_13

    .line 242
    .line 243
    iput-byte v15, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 244
    .line 245
    if-eq v4, v5, :cond_12

    .line 246
    .line 247
    add-int/lit8 v8, v4, 0x1

    .line 248
    .line 249
    aget-byte v4, v3, v4

    .line 250
    .line 251
    move v13, v4

    .line 252
    :goto_b
    move v4, v8

    .line 253
    if-lt v13, v1, :cond_13

    .line 254
    .line 255
    if-gt v13, v14, :cond_13

    .line 256
    .line 257
    if-nez v23, :cond_10

    .line 258
    .line 259
    add-int/lit8 v13, v13, -0x30

    .line 260
    .line 261
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 262
    .line 263
    mul-int/lit8 v8, v8, 0xa

    .line 264
    .line 265
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 266
    .line 267
    if-ge v8, v7, :cond_f

    .line 268
    .line 269
    :goto_c
    move/from16 v23, v26

    .line 270
    .line 271
    goto :goto_d

    .line 272
    :cond_f
    sub-int/2addr v8, v13

    .line 273
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 274
    .line 275
    if-ge v8, v7, :cond_10

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_10
    :goto_d
    iget-short v8, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 279
    .line 280
    add-int/lit8 v8, v8, 0x1

    .line 281
    .line 282
    int-to-short v8, v8

    .line 283
    iput-short v8, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 284
    .line 285
    if-ne v4, v5, :cond_11

    .line 286
    .line 287
    add-int/lit8 v4, v4, 0x1

    .line 288
    .line 289
    move/from16 v13, v16

    .line 290
    .line 291
    move/from16 v24, v26

    .line 292
    .line 293
    goto :goto_e

    .line 294
    :cond_11
    add-int/lit8 v8, v4, 0x1

    .line 295
    .line 296
    aget-byte v13, v3, v4

    .line 297
    .line 298
    move/from16 v24, v26

    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_12
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_13
    :goto_e
    if-eqz v23, :cond_18

    .line 310
    .line 311
    iget-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 312
    .line 313
    if-eqz v7, :cond_14

    .line 314
    .line 315
    move v8, v9

    .line 316
    goto :goto_f

    .line 317
    :cond_14
    add-int/lit8 v8, v9, -0x1

    .line 318
    .line 319
    :goto_f
    iget-short v12, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 320
    .line 321
    if-lez v12, :cond_15

    .line 322
    .line 323
    add-int/lit8 v12, v4, -0x2

    .line 324
    .line 325
    :goto_10
    sub-int/2addr v12, v8

    .line 326
    goto :goto_11

    .line 327
    :cond_15
    add-int/lit8 v12, v4, -0x1

    .line 328
    .line 329
    goto :goto_10

    .line 330
    :goto_11
    const/16 v15, 0x26

    .line 331
    .line 332
    if-le v12, v15, :cond_17

    .line 333
    .line 334
    const/16 v12, 0x8

    .line 335
    .line 336
    iput-byte v12, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 337
    .line 338
    if-eqz v7, :cond_16

    .line 339
    .line 340
    add-int/lit8 v8, v8, -0x1

    .line 341
    .line 342
    :cond_16
    new-instance v7, Ljava/lang/String;

    .line 343
    .line 344
    add-int/lit8 v12, v4, -0x1

    .line 345
    .line 346
    sub-int/2addr v12, v8

    .line 347
    invoke-direct {v7, v3, v8, v12}, Ljava/lang/String;-><init>([BII)V

    .line 348
    .line 349
    .line 350
    iput-object v7, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 351
    .line 352
    goto :goto_12

    .line 353
    :cond_17
    add-int/lit8 v7, v4, -0x1

    .line 354
    .line 355
    invoke-virtual {v0, v3, v8, v7}, Lcom/alibaba/fastjson2/JSONReader;->bigInt([BII)V

    .line 356
    .line 357
    .line 358
    goto :goto_12

    .line 359
    :cond_18
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 360
    .line 361
    neg-int v7, v7

    .line 362
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 363
    .line 364
    :goto_12
    const/16 v7, 0x65

    .line 365
    .line 366
    if-eq v13, v7, :cond_19

    .line 367
    .line 368
    const/16 v8, 0x45

    .line 369
    .line 370
    if-ne v13, v8, :cond_20

    .line 371
    .line 372
    :cond_19
    add-int/lit8 v8, v4, 0x1

    .line 373
    .line 374
    aget-byte v12, v3, v4

    .line 375
    .line 376
    if-ne v12, v11, :cond_1a

    .line 377
    .line 378
    add-int/lit8 v4, v4, 0x2

    .line 379
    .line 380
    aget-byte v12, v3, v8

    .line 381
    .line 382
    move/from16 v8, v26

    .line 383
    .line 384
    :goto_13
    const/4 v10, 0x0

    .line 385
    goto :goto_15

    .line 386
    :cond_1a
    if-ne v12, v10, :cond_1b

    .line 387
    .line 388
    add-int/lit8 v4, v4, 0x2

    .line 389
    .line 390
    aget-byte v8, v3, v8

    .line 391
    .line 392
    int-to-char v12, v8

    .line 393
    :goto_14
    const/4 v8, 0x0

    .line 394
    goto :goto_13

    .line 395
    :cond_1b
    move v4, v8

    .line 396
    goto :goto_14

    .line 397
    :goto_15
    if-lt v12, v1, :cond_1e

    .line 398
    .line 399
    if-gt v12, v14, :cond_1e

    .line 400
    .line 401
    add-int/lit8 v12, v12, -0x30

    .line 402
    .line 403
    mul-int/lit8 v10, v10, 0xa

    .line 404
    .line 405
    add-int/2addr v10, v12

    .line 406
    const/16 v11, 0x7ff

    .line 407
    .line 408
    if-gt v10, v11, :cond_1d

    .line 409
    .line 410
    if-ne v4, v5, :cond_1c

    .line 411
    .line 412
    move/from16 v13, v16

    .line 413
    .line 414
    move/from16 v24, v26

    .line 415
    .line 416
    goto :goto_16

    .line 417
    :cond_1c
    add-int/lit8 v11, v4, 0x1

    .line 418
    .line 419
    aget-byte v12, v3, v4

    .line 420
    .line 421
    move v4, v11

    .line 422
    move/from16 v24, v26

    .line 423
    .line 424
    goto :goto_15

    .line 425
    :cond_1d
    const-string v1, "too large exp value : "

    .line 426
    .line 427
    invoke-static {v10, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :cond_1e
    move v13, v12

    .line 436
    :goto_16
    if-eqz v8, :cond_1f

    .line 437
    .line 438
    neg-int v10, v10

    .line 439
    :cond_1f
    int-to-short v1, v10

    .line 440
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 441
    .line 442
    const/4 v1, 0x2

    .line 443
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 444
    .line 445
    :cond_20
    if-ne v4, v9, :cond_2b

    .line 446
    .line 447
    const/16 v1, 0x6e

    .line 448
    .line 449
    const/16 v8, 0x75

    .line 450
    .line 451
    const/16 v10, 0x6c

    .line 452
    .line 453
    if-ne v13, v1, :cond_23

    .line 454
    .line 455
    aget-byte v1, v3, v4

    .line 456
    .line 457
    if-ne v1, v8, :cond_22

    .line 458
    .line 459
    add-int/lit8 v1, v4, 0x1

    .line 460
    .line 461
    aget-byte v1, v3, v1

    .line 462
    .line 463
    if-ne v1, v10, :cond_22

    .line 464
    .line 465
    add-int/lit8 v1, v4, 0x2

    .line 466
    .line 467
    aget-byte v1, v3, v1

    .line 468
    .line 469
    if-ne v1, v10, :cond_22

    .line 470
    .line 471
    add-int/lit8 v1, v4, 0x3

    .line 472
    .line 473
    move/from16 v7, v26

    .line 474
    .line 475
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 476
    .line 477
    const/4 v7, 0x5

    .line 478
    iput-byte v7, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 479
    .line 480
    if-ne v1, v5, :cond_21

    .line 481
    .line 482
    :goto_17
    move v4, v1

    .line 483
    move/from16 v13, v16

    .line 484
    .line 485
    goto :goto_19

    .line 486
    :cond_21
    add-int/lit8 v4, v4, 0x4

    .line 487
    .line 488
    aget-byte v1, v3, v1

    .line 489
    .line 490
    :goto_18
    move v13, v1

    .line 491
    :goto_19
    const/4 v7, 0x0

    .line 492
    :goto_1a
    const/4 v8, 0x1

    .line 493
    const/16 v24, 0x1

    .line 494
    .line 495
    goto/16 :goto_1c

    .line 496
    .line 497
    :cond_22
    const/4 v7, 0x0

    .line 498
    const/4 v8, 0x1

    .line 499
    goto/16 :goto_1c

    .line 500
    .line 501
    :cond_23
    const/16 v1, 0x74

    .line 502
    .line 503
    const/4 v11, 0x4

    .line 504
    if-ne v13, v1, :cond_25

    .line 505
    .line 506
    aget-byte v1, v3, v4

    .line 507
    .line 508
    const/16 v12, 0x72

    .line 509
    .line 510
    if-ne v1, v12, :cond_25

    .line 511
    .line 512
    add-int/lit8 v1, v4, 0x1

    .line 513
    .line 514
    aget-byte v1, v3, v1

    .line 515
    .line 516
    if-ne v1, v8, :cond_25

    .line 517
    .line 518
    add-int/lit8 v1, v4, 0x2

    .line 519
    .line 520
    aget-byte v1, v3, v1

    .line 521
    .line 522
    if-ne v1, v7, :cond_25

    .line 523
    .line 524
    add-int/lit8 v1, v4, 0x3

    .line 525
    .line 526
    const/4 v7, 0x1

    .line 527
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 528
    .line 529
    iput-byte v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 530
    .line 531
    if-ne v1, v5, :cond_24

    .line 532
    .line 533
    goto :goto_17

    .line 534
    :cond_24
    add-int/lit8 v4, v4, 0x4

    .line 535
    .line 536
    aget-byte v1, v3, v1

    .line 537
    .line 538
    goto :goto_18

    .line 539
    :cond_25
    const/16 v1, 0x66

    .line 540
    .line 541
    const/16 v8, 0x61

    .line 542
    .line 543
    if-ne v13, v1, :cond_27

    .line 544
    .line 545
    add-int/lit8 v1, v4, 0x3

    .line 546
    .line 547
    if-ge v1, v5, :cond_27

    .line 548
    .line 549
    aget-byte v12, v3, v4

    .line 550
    .line 551
    if-ne v12, v8, :cond_27

    .line 552
    .line 553
    add-int/lit8 v12, v4, 0x1

    .line 554
    .line 555
    aget-byte v12, v3, v12

    .line 556
    .line 557
    if-ne v12, v10, :cond_27

    .line 558
    .line 559
    add-int/lit8 v10, v4, 0x2

    .line 560
    .line 561
    aget-byte v10, v3, v10

    .line 562
    .line 563
    const/16 v12, 0x73

    .line 564
    .line 565
    if-ne v10, v12, :cond_27

    .line 566
    .line 567
    aget-byte v1, v3, v1

    .line 568
    .line 569
    if-ne v1, v7, :cond_27

    .line 570
    .line 571
    add-int/lit8 v1, v4, 0x4

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 575
    .line 576
    iput-byte v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 577
    .line 578
    if-ne v1, v5, :cond_26

    .line 579
    .line 580
    move v4, v1

    .line 581
    move/from16 v13, v16

    .line 582
    .line 583
    goto :goto_1a

    .line 584
    :cond_26
    add-int/lit8 v4, v4, 0x5

    .line 585
    .line 586
    aget-byte v1, v3, v1

    .line 587
    .line 588
    move v13, v1

    .line 589
    goto :goto_1a

    .line 590
    :cond_27
    const/4 v7, 0x0

    .line 591
    const/16 v1, 0x4e

    .line 592
    .line 593
    if-ne v13, v1, :cond_29

    .line 594
    .line 595
    aget-byte v10, v3, v4

    .line 596
    .line 597
    if-ne v10, v8, :cond_29

    .line 598
    .line 599
    add-int/lit8 v8, v4, 0x1

    .line 600
    .line 601
    aget-byte v8, v3, v8

    .line 602
    .line 603
    if-ne v8, v1, :cond_29

    .line 604
    .line 605
    add-int/lit8 v1, v4, 0x2

    .line 606
    .line 607
    const/4 v8, 0x1

    .line 608
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 609
    .line 610
    const/16 v10, 0xe

    .line 611
    .line 612
    iput-byte v10, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 613
    .line 614
    if-ne v1, v5, :cond_28

    .line 615
    .line 616
    move v4, v1

    .line 617
    move/from16 v13, v16

    .line 618
    .line 619
    goto :goto_1b

    .line 620
    :cond_28
    add-int/lit8 v4, v4, 0x3

    .line 621
    .line 622
    aget-byte v1, v3, v1

    .line 623
    .line 624
    move v13, v1

    .line 625
    :goto_1b
    move/from16 v24, v8

    .line 626
    .line 627
    goto :goto_1c

    .line 628
    :cond_29
    const/4 v8, 0x1

    .line 629
    const/16 v1, 0x7b

    .line 630
    .line 631
    if-ne v13, v1, :cond_2a

    .line 632
    .line 633
    if-nez v6, :cond_2a

    .line 634
    .line 635
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 636
    .line 637
    int-to-char v1, v13

    .line 638
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 639
    .line 640
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 645
    .line 646
    const/4 v1, 0x6

    .line 647
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 648
    .line 649
    return-void

    .line 650
    :cond_2a
    const/16 v1, 0x5b

    .line 651
    .line 652
    if-ne v13, v1, :cond_2c

    .line 653
    .line 654
    if-nez v6, :cond_2c

    .line 655
    .line 656
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 657
    .line 658
    int-to-char v1, v13

    .line 659
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 660
    .line 661
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 666
    .line 667
    const/4 v1, 0x7

    .line 668
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 669
    .line 670
    return-void

    .line 671
    :cond_2b
    move/from16 v8, v26

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    :cond_2c
    :goto_1c
    if-eqz v6, :cond_2f

    .line 675
    .line 676
    if-eq v13, v6, :cond_2d

    .line 677
    .line 678
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 679
    .line 680
    int-to-char v1, v6

    .line 681
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 682
    .line 683
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readString0()V

    .line 684
    .line 685
    .line 686
    const/4 v1, 0x3

    .line 687
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 688
    .line 689
    return-void

    .line 690
    :cond_2d
    if-ne v4, v5, :cond_2e

    .line 691
    .line 692
    move/from16 v13, v16

    .line 693
    .line 694
    goto :goto_1d

    .line 695
    :cond_2e
    add-int/lit8 v1, v4, 0x1

    .line 696
    .line 697
    aget-byte v2, v3, v4

    .line 698
    .line 699
    move v4, v1

    .line 700
    move v13, v2

    .line 701
    :cond_2f
    :goto_1d
    const/16 v1, 0x4c

    .line 702
    .line 703
    if-eq v13, v1, :cond_31

    .line 704
    .line 705
    const/16 v1, 0x46

    .line 706
    .line 707
    if-eq v13, v1, :cond_31

    .line 708
    .line 709
    const/16 v1, 0x44

    .line 710
    .line 711
    if-eq v13, v1, :cond_31

    .line 712
    .line 713
    const/16 v1, 0x42

    .line 714
    .line 715
    if-eq v13, v1, :cond_31

    .line 716
    .line 717
    const/16 v1, 0x53

    .line 718
    .line 719
    if-ne v13, v1, :cond_30

    .line 720
    .line 721
    goto :goto_1f

    .line 722
    :cond_30
    :goto_1e
    const/16 v1, 0x20

    .line 723
    .line 724
    goto :goto_23

    .line 725
    :cond_31
    :goto_1f
    const/16 v1, 0x42

    .line 726
    .line 727
    if-eq v13, v1, :cond_36

    .line 728
    .line 729
    const/16 v1, 0x44

    .line 730
    .line 731
    if-eq v13, v1, :cond_35

    .line 732
    .line 733
    const/16 v1, 0x46

    .line 734
    .line 735
    if-eq v13, v1, :cond_34

    .line 736
    .line 737
    const/16 v1, 0x4c

    .line 738
    .line 739
    if-eq v13, v1, :cond_33

    .line 740
    .line 741
    const/16 v1, 0x53

    .line 742
    .line 743
    if-eq v13, v1, :cond_32

    .line 744
    .line 745
    goto :goto_20

    .line 746
    :cond_32
    if-nez v23, :cond_37

    .line 747
    .line 748
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 749
    .line 750
    const/4 v2, 0x2

    .line 751
    if-eq v1, v2, :cond_37

    .line 752
    .line 753
    move/from16 v1, v25

    .line 754
    .line 755
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 756
    .line 757
    goto :goto_20

    .line 758
    :cond_33
    const/4 v2, 0x2

    .line 759
    sub-int v1, v4, v9

    .line 760
    .line 761
    const/16 v6, 0x13

    .line 762
    .line 763
    if-ge v1, v6, :cond_37

    .line 764
    .line 765
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 766
    .line 767
    if-eq v1, v2, :cond_37

    .line 768
    .line 769
    const/16 v1, 0xb

    .line 770
    .line 771
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 772
    .line 773
    goto :goto_20

    .line 774
    :cond_34
    const/16 v1, 0xc

    .line 775
    .line 776
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 777
    .line 778
    goto :goto_20

    .line 779
    :cond_35
    const/16 v1, 0xd

    .line 780
    .line 781
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 782
    .line 783
    goto :goto_20

    .line 784
    :cond_36
    if-nez v23, :cond_37

    .line 785
    .line 786
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 787
    .line 788
    const/4 v2, 0x2

    .line 789
    if-eq v1, v2, :cond_37

    .line 790
    .line 791
    const/16 v1, 0x9

    .line 792
    .line 793
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 794
    .line 795
    :cond_37
    :goto_20
    if-ne v4, v5, :cond_38

    .line 796
    .line 797
    :goto_21
    move/from16 v13, v16

    .line 798
    .line 799
    goto :goto_1e

    .line 800
    :cond_38
    add-int/lit8 v1, v4, 0x1

    .line 801
    .line 802
    aget-byte v2, v3, v4

    .line 803
    .line 804
    :goto_22
    move v4, v1

    .line 805
    move v13, v2

    .line 806
    goto :goto_1e

    .line 807
    :goto_23
    if-gt v13, v1, :cond_3a

    .line 808
    .line 809
    shl-long v1, v21, v13

    .line 810
    .line 811
    and-long v1, v1, v19

    .line 812
    .line 813
    cmp-long v1, v1, v17

    .line 814
    .line 815
    if-eqz v1, :cond_3a

    .line 816
    .line 817
    if-ne v4, v5, :cond_39

    .line 818
    .line 819
    goto :goto_21

    .line 820
    :cond_39
    add-int/lit8 v1, v4, 0x1

    .line 821
    .line 822
    aget-byte v2, v3, v4

    .line 823
    .line 824
    goto :goto_22

    .line 825
    :cond_3a
    const/16 v1, 0x2c

    .line 826
    .line 827
    if-ne v13, v1, :cond_3b

    .line 828
    .line 829
    move v1, v8

    .line 830
    goto :goto_24

    .line 831
    :cond_3b
    move v1, v7

    .line 832
    :goto_24
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 833
    .line 834
    if-eqz v1, :cond_3e

    .line 835
    .line 836
    if-ne v4, v5, :cond_3c

    .line 837
    .line 838
    move/from16 v2, v16

    .line 839
    .line 840
    goto :goto_25

    .line 841
    :cond_3c
    add-int/lit8 v1, v4, 0x1

    .line 842
    .line 843
    aget-byte v2, v3, v4

    .line 844
    .line 845
    move v4, v1

    .line 846
    :goto_25
    move v13, v2

    .line 847
    const/16 v1, 0x20

    .line 848
    .line 849
    :goto_26
    if-gt v13, v1, :cond_3e

    .line 850
    .line 851
    shl-long v6, v21, v13

    .line 852
    .line 853
    and-long v6, v6, v19

    .line 854
    .line 855
    cmp-long v2, v6, v17

    .line 856
    .line 857
    if-eqz v2, :cond_3e

    .line 858
    .line 859
    if-ne v4, v5, :cond_3d

    .line 860
    .line 861
    move/from16 v13, v16

    .line 862
    .line 863
    goto :goto_26

    .line 864
    :cond_3d
    add-int/lit8 v2, v4, 0x1

    .line 865
    .line 866
    aget-byte v4, v3, v4

    .line 867
    .line 868
    move v13, v4

    .line 869
    move v4, v2

    .line 870
    goto :goto_26

    .line 871
    :cond_3e
    if-eqz v24, :cond_3f

    .line 872
    .line 873
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 874
    .line 875
    int-to-char v1, v13

    .line 876
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 877
    .line 878
    return-void

    .line 879
    :cond_3f
    const-string v1, "illegal input error"

    .line 880
    .line 881
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    return-void
.end method

.method public final readOffsetDateTime()Ljava/time/OffsetDateTime;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 8
    .line 9
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v4, v5, :cond_0

    .line 14
    .line 15
    const/16 v6, 0x27

    .line 16
    .line 17
    if-ne v4, v6, :cond_f

    .line 18
    .line 19
    :cond_0
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 20
    .line 21
    iget-boolean v6, v6, Lcom/alibaba/fastjson2/JSONReader$Context;->formatComplex:Z

    .line 22
    .line 23
    if-nez v6, :cond_f

    .line 24
    .line 25
    add-int/lit8 v6, v2, 0x13

    .line 26
    .line 27
    array-length v7, v1

    .line 28
    if-ge v6, v7, :cond_f

    .line 29
    .line 30
    if-ge v6, v3, :cond_f

    .line 31
    .line 32
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->yy([BI)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, -0x1

    .line 37
    if-eq v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v9, v2, 0x2

    .line 40
    .line 41
    invoke-static {v1, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->ymd([BI)J

    .line 42
    .line 43
    .line 44
    move-result-wide v9

    .line 45
    const-wide/16 v11, -0x1

    .line 46
    .line 47
    cmp-long v13, v9, v11

    .line 48
    .line 49
    if-eqz v13, :cond_f

    .line 50
    .line 51
    add-int/lit8 v13, v2, 0xa

    .line 52
    .line 53
    aget-byte v13, v1, v13

    .line 54
    .line 55
    const/16 v14, 0x20

    .line 56
    .line 57
    if-eq v13, v14, :cond_1

    .line 58
    .line 59
    const/16 v15, 0x54

    .line 60
    .line 61
    if-ne v13, v15, :cond_f

    .line 62
    .line 63
    :cond_1
    add-int/lit8 v13, v2, 0xb

    .line 64
    .line 65
    move-wide v15, v11

    .line 66
    invoke-static {v1, v13}, Lcom/alibaba/fastjson2/util/DateUtils;->hms([BI)J

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    cmp-long v13, v11, v15

    .line 71
    .line 72
    if-eqz v13, :cond_f

    .line 73
    .line 74
    add-int/lit8 v13, v2, 0x14

    .line 75
    .line 76
    aget-byte v6, v1, v6

    .line 77
    .line 78
    const/16 v15, 0x2e

    .line 79
    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    if-ne v6, v15, :cond_2

    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x15

    .line 85
    .line 86
    aget-byte v6, v1, v13

    .line 87
    .line 88
    move v13, v2

    .line 89
    :cond_2
    move/from16 v2, v16

    .line 90
    .line 91
    move v15, v2

    .line 92
    :goto_0
    const/16 v14, 0x30

    .line 93
    .line 94
    move/from16 v17, v14

    .line 95
    .line 96
    if-lt v6, v14, :cond_3

    .line 97
    .line 98
    const/16 v14, 0x39

    .line 99
    .line 100
    if-gt v6, v14, :cond_3

    .line 101
    .line 102
    mul-int/lit8 v2, v2, 0xa

    .line 103
    .line 104
    add-int/lit8 v14, v6, -0x30

    .line 105
    .line 106
    add-int/2addr v2, v14

    .line 107
    add-int/lit8 v15, v15, 0x1

    .line 108
    .line 109
    if-ge v13, v3, :cond_3

    .line 110
    .line 111
    add-int/lit8 v6, v13, 0x1

    .line 112
    .line 113
    aget-byte v13, v1, v13

    .line 114
    .line 115
    move/from16 v28, v13

    .line 116
    .line 117
    move v13, v6

    .line 118
    move/from16 v6, v28

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    if-eqz v15, :cond_4

    .line 122
    .line 123
    invoke-static {v2, v15}, Lcom/alibaba/fastjson2/util/DateUtils;->nanos(II)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    :cond_4
    move/from16 v24, v2

    .line 128
    .line 129
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 130
    .line 131
    const/16 v14, 0x5a

    .line 132
    .line 133
    const/4 v15, 0x1

    .line 134
    if-ne v6, v14, :cond_5

    .line 135
    .line 136
    add-int/lit8 v5, v13, 0x1

    .line 137
    .line 138
    aget-byte v6, v1, v13

    .line 139
    .line 140
    move-object/from16 v25, v2

    .line 141
    .line 142
    move v13, v5

    .line 143
    goto :goto_1

    .line 144
    :cond_5
    if-eq v6, v4, :cond_6

    .line 145
    .line 146
    invoke-static {v1, v5, v13, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->indexOfChar([BIII)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eq v5, v8, :cond_6

    .line 151
    .line 152
    add-int/lit8 v2, v13, -0x1

    .line 153
    .line 154
    sub-int v6, v5, v13

    .line 155
    .line 156
    add-int/2addr v6, v15

    .line 157
    invoke-static {v1, v2, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->zoneOffset([BII)Ljava/time/ZoneOffset;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    add-int/lit8 v13, v5, 0x1

    .line 162
    .line 163
    move-object/from16 v25, v2

    .line 164
    .line 165
    move v6, v4

    .line 166
    goto :goto_1

    .line 167
    :cond_6
    move-object/from16 v25, v2

    .line 168
    .line 169
    :goto_1
    if-ne v6, v4, :cond_f

    .line 170
    .line 171
    const/16 v2, 0x1a

    .line 172
    .line 173
    if-lt v13, v3, :cond_7

    .line 174
    .line 175
    :goto_2
    move v5, v2

    .line 176
    goto :goto_4

    .line 177
    :cond_7
    add-int/lit8 v4, v13, 0x1

    .line 178
    .line 179
    aget-byte v5, v1, v13

    .line 180
    .line 181
    :goto_3
    move v13, v4

    .line 182
    :goto_4
    const-wide/16 v18, 0x0

    .line 183
    .line 184
    const-wide v20, 0x100003701L

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    const-wide/16 v22, 0x1

    .line 190
    .line 191
    const/16 v4, 0x20

    .line 192
    .line 193
    if-gt v5, v4, :cond_9

    .line 194
    .line 195
    shl-long v26, v22, v5

    .line 196
    .line 197
    and-long v26, v26, v20

    .line 198
    .line 199
    cmp-long v4, v26, v18

    .line 200
    .line 201
    if-eqz v4, :cond_9

    .line 202
    .line 203
    if-ne v13, v3, :cond_8

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_8
    add-int/lit8 v4, v13, 0x1

    .line 207
    .line 208
    aget-byte v5, v1, v13

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_9
    const/16 v4, 0x2c

    .line 212
    .line 213
    if-ne v5, v4, :cond_a

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_a
    move/from16 v15, v16

    .line 217
    .line 218
    :goto_5
    iput-boolean v15, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 219
    .line 220
    if-eqz v15, :cond_d

    .line 221
    .line 222
    if-ne v13, v3, :cond_b

    .line 223
    .line 224
    move v5, v2

    .line 225
    goto :goto_6

    .line 226
    :cond_b
    add-int/lit8 v4, v13, 0x1

    .line 227
    .line 228
    aget-byte v5, v1, v13

    .line 229
    .line 230
    int-to-char v5, v5

    .line 231
    move v13, v4

    .line 232
    :goto_6
    const/16 v4, 0x20

    .line 233
    .line 234
    :goto_7
    if-gt v5, v4, :cond_d

    .line 235
    .line 236
    shl-long v14, v22, v5

    .line 237
    .line 238
    and-long v14, v14, v20

    .line 239
    .line 240
    cmp-long v6, v14, v18

    .line 241
    .line 242
    if-eqz v6, :cond_d

    .line 243
    .line 244
    if-ne v13, v3, :cond_c

    .line 245
    .line 246
    move v5, v2

    .line 247
    goto :goto_7

    .line 248
    :cond_c
    add-int/lit8 v5, v13, 0x1

    .line 249
    .line 250
    aget-byte v6, v1, v13

    .line 251
    .line 252
    move v13, v5

    .line 253
    move v5, v6

    .line 254
    goto :goto_7

    .line 255
    :cond_d
    if-gez v5, :cond_e

    .line 256
    .line 257
    invoke-direct {v0, v5, v13}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char_utf8(II)V

    .line 258
    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_e
    iput v13, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 262
    .line 263
    int-to-char v1, v5

    .line 264
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 265
    .line 266
    :goto_8
    long-to-int v1, v9

    .line 267
    and-int/lit16 v1, v1, 0xff

    .line 268
    .line 269
    add-int v18, v7, v1

    .line 270
    .line 271
    const/16 v1, 0x18

    .line 272
    .line 273
    shr-long v2, v9, v1

    .line 274
    .line 275
    long-to-int v2, v2

    .line 276
    and-int/lit16 v2, v2, 0xff

    .line 277
    .line 278
    shr-long v3, v9, v17

    .line 279
    .line 280
    long-to-int v3, v3

    .line 281
    and-int/lit16 v3, v3, 0xff

    .line 282
    .line 283
    long-to-int v4, v11

    .line 284
    and-int/lit16 v4, v4, 0xff

    .line 285
    .line 286
    shr-long v5, v11, v1

    .line 287
    .line 288
    long-to-int v1, v5

    .line 289
    and-int/lit16 v1, v1, 0xff

    .line 290
    .line 291
    shr-long v5, v11, v17

    .line 292
    .line 293
    long-to-int v5, v5

    .line 294
    and-int/lit16 v5, v5, 0xff

    .line 295
    .line 296
    move/from16 v22, v1

    .line 297
    .line 298
    move/from16 v19, v2

    .line 299
    .line 300
    move/from16 v20, v3

    .line 301
    .line 302
    move/from16 v21, v4

    .line 303
    .line 304
    move/from16 v23, v5

    .line 305
    .line 306
    invoke-static/range {v18 .. v25}, Ljava/time/OffsetDateTime;->of(IIIIIIILjava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    return-object v1

    .line 311
    :cond_f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-nez v1, :cond_10

    .line 316
    .line 317
    const/4 v1, 0x0

    .line 318
    return-object v1

    .line 319
    :cond_10
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    return-object v1
.end method

.method public final readOffsetTime()Ljava/time/OffsetTime;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 6
    .line 7
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    const-string v5, "illegal offsetTime"

    .line 12
    .line 13
    if-eq v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x27

    .line 16
    .line 17
    if-ne v3, v4, :cond_c

    .line 18
    .line 19
    :cond_0
    iget-object v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 20
    .line 21
    if-nez v2, :cond_c

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x8

    .line 24
    .line 25
    array-length v4, v0

    .line 26
    if-ge v2, v4, :cond_c

    .line 27
    .line 28
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 29
    .line 30
    if-ge v2, v4, :cond_c

    .line 31
    .line 32
    add-int/lit8 v4, v1, 0x2

    .line 33
    .line 34
    aget-byte v4, v0, v4

    .line 35
    .line 36
    const/16 v6, 0x3a

    .line 37
    .line 38
    if-ne v4, v6, :cond_c

    .line 39
    .line 40
    add-int/lit8 v4, v1, 0x5

    .line 41
    .line 42
    aget-byte v4, v0, v4

    .line 43
    .line 44
    if-ne v4, v6, :cond_c

    .line 45
    .line 46
    aget-byte v4, v0, v1

    .line 47
    .line 48
    add-int/lit8 v6, v1, 0x1

    .line 49
    .line 50
    aget-byte v6, v0, v6

    .line 51
    .line 52
    add-int/lit8 v7, v1, 0x3

    .line 53
    .line 54
    aget-byte v7, v0, v7

    .line 55
    .line 56
    add-int/lit8 v8, v1, 0x4

    .line 57
    .line 58
    aget-byte v8, v0, v8

    .line 59
    .line 60
    add-int/lit8 v9, v1, 0x6

    .line 61
    .line 62
    aget-byte v9, v0, v9

    .line 63
    .line 64
    add-int/lit8 v10, v1, 0x7

    .line 65
    .line 66
    aget-byte v10, v0, v10

    .line 67
    .line 68
    const/16 v11, 0x30

    .line 69
    .line 70
    if-lt v4, v11, :cond_b

    .line 71
    .line 72
    const/16 v12, 0x39

    .line 73
    .line 74
    if-gt v4, v12, :cond_b

    .line 75
    .line 76
    if-lt v6, v11, :cond_b

    .line 77
    .line 78
    if-gt v6, v12, :cond_b

    .line 79
    .line 80
    sub-int/2addr v4, v11

    .line 81
    mul-int/lit8 v4, v4, 0xa

    .line 82
    .line 83
    sub-int/2addr v6, v11

    .line 84
    add-int/2addr v6, v4

    .line 85
    if-lt v7, v11, :cond_a

    .line 86
    .line 87
    if-gt v7, v12, :cond_a

    .line 88
    .line 89
    if-lt v8, v11, :cond_a

    .line 90
    .line 91
    if-gt v8, v12, :cond_a

    .line 92
    .line 93
    sub-int/2addr v7, v11

    .line 94
    mul-int/lit8 v7, v7, 0xa

    .line 95
    .line 96
    sub-int/2addr v8, v11

    .line 97
    add-int/2addr v8, v7

    .line 98
    if-lt v9, v11, :cond_9

    .line 99
    .line 100
    if-gt v9, v12, :cond_9

    .line 101
    .line 102
    if-lt v10, v11, :cond_9

    .line 103
    .line 104
    if-gt v10, v12, :cond_9

    .line 105
    .line 106
    sub-int/2addr v9, v11

    .line 107
    mul-int/lit8 v9, v9, 0xa

    .line 108
    .line 109
    sub-int/2addr v10, v11

    .line 110
    add-int/2addr v10, v9

    .line 111
    add-int/lit8 v4, v1, 0x19

    .line 112
    .line 113
    const/4 v5, -0x1

    .line 114
    move v7, v2

    .line 115
    move v9, v5

    .line 116
    :goto_0
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x1

    .line 118
    if-ge v7, v4, :cond_4

    .line 119
    .line 120
    iget v13, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 121
    .line 122
    if-ge v7, v13, :cond_4

    .line 123
    .line 124
    array-length v13, v0

    .line 125
    if-ge v7, v13, :cond_4

    .line 126
    .line 127
    aget-byte v13, v0, v7

    .line 128
    .line 129
    if-ne v9, v5, :cond_2

    .line 130
    .line 131
    const/16 v14, 0x5a

    .line 132
    .line 133
    if-eq v13, v14, :cond_1

    .line 134
    .line 135
    const/16 v14, 0x2b

    .line 136
    .line 137
    if-eq v13, v14, :cond_1

    .line 138
    .line 139
    const/16 v14, 0x2d

    .line 140
    .line 141
    if-ne v13, v14, :cond_2

    .line 142
    .line 143
    :cond_1
    sub-int v9, v7, v2

    .line 144
    .line 145
    sub-int/2addr v9, v12

    .line 146
    :cond_2
    if-ne v13, v3, :cond_3

    .line 147
    .line 148
    sub-int/2addr v7, v1

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    move v7, v11

    .line 154
    :goto_1
    if-gtz v9, :cond_5

    .line 155
    .line 156
    move v2, v11

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    add-int/lit8 v2, v1, 0x9

    .line 159
    .line 160
    invoke-static {v0, v9, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->readNanos([BII)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    :goto_2
    add-int/lit8 v3, v7, -0x9

    .line 165
    .line 166
    sub-int/2addr v3, v9

    .line 167
    if-gt v3, v12, :cond_6

    .line 168
    .line 169
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    new-instance v4, Ljava/lang/String;

    .line 173
    .line 174
    add-int/lit8 v1, v1, 0x9

    .line 175
    .line 176
    add-int/2addr v1, v9

    .line 177
    invoke-direct {v4, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 178
    .line 179
    .line 180
    invoke-static {v4}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_3
    invoke-static {v6, v8, v10, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1, v0}, Ljava/time/OffsetTime;->of(Ljava/time/LocalTime;Ljava/time/ZoneOffset;)Ljava/time/OffsetTime;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 193
    .line 194
    add-int/lit8 v7, v7, 0x2

    .line 195
    .line 196
    add-int/2addr v7, v1

    .line 197
    iput v7, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 200
    .line 201
    .line 202
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 203
    .line 204
    const/16 v2, 0x2c

    .line 205
    .line 206
    if-ne v1, v2, :cond_7

    .line 207
    .line 208
    move v11, v12

    .line 209
    :cond_7
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 210
    .line 211
    if-eqz v11, :cond_8

    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 214
    .line 215
    .line 216
    :cond_8
    return-object v0

    .line 217
    :cond_9
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_4
    const/4 v0, 0x0

    .line 225
    return-object v0

    .line 226
    :cond_a
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_b
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_c
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4
.end method

.method public final readPattern()Ljava/lang/String;
    .locals 15

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2f

    .line 4
    .line 5
    if-ne v0, v1, :cond_9

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 8
    .line 9
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    move v3, v2

    .line 12
    :goto_0
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 13
    .line 14
    if-ge v3, v4, :cond_1

    .line 15
    .line 16
    aget-byte v4, v0, v3

    .line 17
    .line 18
    if-ne v4, v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :goto_1
    new-instance v1, Ljava/lang/String;

    .line 25
    .line 26
    sub-int v4, v3, v2

    .line 27
    .line 28
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-direct {v1, v0, v2, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v3, 0x1

    .line 34
    .line 35
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 36
    .line 37
    const/16 v5, 0x1a

    .line 38
    .line 39
    if-ne v2, v4, :cond_2

    .line 40
    .line 41
    move v3, v2

    .line 42
    :goto_2
    move v2, v5

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 45
    .line 46
    aget-byte v2, v0, v2

    .line 47
    .line 48
    :goto_3
    const-wide/16 v6, 0x0

    .line 49
    .line 50
    const-wide v8, 0x100003701L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const-wide/16 v10, 0x1

    .line 56
    .line 57
    const/16 v4, 0x20

    .line 58
    .line 59
    if-gt v2, v4, :cond_4

    .line 60
    .line 61
    shl-long v12, v10, v2

    .line 62
    .line 63
    and-long/2addr v12, v8

    .line 64
    cmp-long v12, v12, v6

    .line 65
    .line 66
    if-eqz v12, :cond_4

    .line 67
    .line 68
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 69
    .line 70
    if-ne v3, v2, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    add-int/lit8 v2, v3, 0x1

    .line 74
    .line 75
    aget-byte v3, v0, v3

    .line 76
    .line 77
    move v14, v3

    .line 78
    move v3, v2

    .line 79
    move v2, v14

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    const/16 v12, 0x2c

    .line 82
    .line 83
    if-ne v2, v12, :cond_5

    .line 84
    .line 85
    const/4 v12, 0x1

    .line 86
    goto :goto_4

    .line 87
    :cond_5
    const/4 v12, 0x0

    .line 88
    :goto_4
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 89
    .line 90
    if-eqz v12, :cond_8

    .line 91
    .line 92
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 93
    .line 94
    if-ne v3, v2, :cond_6

    .line 95
    .line 96
    move v2, v3

    .line 97
    move v3, v5

    .line 98
    goto :goto_5

    .line 99
    :cond_6
    add-int/lit8 v2, v3, 0x1

    .line 100
    .line 101
    aget-byte v3, v0, v3

    .line 102
    .line 103
    :goto_5
    move v14, v3

    .line 104
    move v3, v2

    .line 105
    move v2, v14

    .line 106
    :goto_6
    if-gt v2, v4, :cond_8

    .line 107
    .line 108
    shl-long v12, v10, v2

    .line 109
    .line 110
    and-long/2addr v12, v8

    .line 111
    cmp-long v12, v12, v6

    .line 112
    .line 113
    if-eqz v12, :cond_8

    .line 114
    .line 115
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 116
    .line 117
    if-ne v3, v2, :cond_7

    .line 118
    .line 119
    move v2, v5

    .line 120
    goto :goto_6

    .line 121
    :cond_7
    add-int/lit8 v2, v3, 0x1

    .line 122
    .line 123
    aget-byte v3, v0, v3

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 127
    .line 128
    int-to-char v0, v2

    .line 129
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_9
    const-string v0, "illegal pattern"

    .line 133
    .line 134
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    return-object v0
.end method

.method public final readReference()Ljava/lang/String;
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->referenceBegin:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    aget-byte v0, v1, v0

    .line 16
    .line 17
    int-to-char v0, v0

    .line 18
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 27
    .line 28
    :goto_0
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const-wide v6, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v8, 0x1

    .line 36
    .line 37
    const/16 v10, 0x20

    .line 38
    .line 39
    const/16 v11, 0x1a

    .line 40
    .line 41
    if-gt v2, v10, :cond_2

    .line 42
    .line 43
    shl-long v12, v8, v2

    .line 44
    .line 45
    and-long/2addr v12, v6

    .line 46
    cmp-long v12, v12, v4

    .line 47
    .line 48
    if-eqz v12, :cond_2

    .line 49
    .line 50
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 51
    .line 52
    if-ne v3, v2, :cond_1

    .line 53
    .line 54
    move v2, v11

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    add-int/lit8 v2, v3, 0x1

    .line 57
    .line 58
    aget-byte v3, v1, v3

    .line 59
    .line 60
    move v14, v3

    .line 61
    move v3, v2

    .line 62
    move v2, v14

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/16 v12, 0x7d

    .line 65
    .line 66
    if-ne v2, v12, :cond_a

    .line 67
    .line 68
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 69
    .line 70
    if-ne v3, v2, :cond_3

    .line 71
    .line 72
    move v2, v3

    .line 73
    :goto_1
    move v3, v11

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    add-int/lit8 v2, v3, 0x1

    .line 76
    .line 77
    aget-byte v3, v1, v3

    .line 78
    .line 79
    :goto_2
    if-gt v3, v10, :cond_5

    .line 80
    .line 81
    shl-long v12, v8, v3

    .line 82
    .line 83
    and-long/2addr v12, v6

    .line 84
    cmp-long v12, v12, v4

    .line 85
    .line 86
    if-eqz v12, :cond_5

    .line 87
    .line 88
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 89
    .line 90
    if-ne v2, v3, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    add-int/lit8 v3, v2, 0x1

    .line 94
    .line 95
    aget-byte v2, v1, v2

    .line 96
    .line 97
    move v14, v3

    .line 98
    move v3, v2

    .line 99
    move v2, v14

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/16 v12, 0x2c

    .line 102
    .line 103
    if-ne v3, v12, :cond_6

    .line 104
    .line 105
    const/4 v12, 0x1

    .line 106
    goto :goto_3

    .line 107
    :cond_6
    const/4 v12, 0x0

    .line 108
    :goto_3
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 109
    .line 110
    if-eqz v12, :cond_9

    .line 111
    .line 112
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 113
    .line 114
    if-ne v2, v3, :cond_7

    .line 115
    .line 116
    move v3, v2

    .line 117
    move v2, v11

    .line 118
    goto :goto_4

    .line 119
    :cond_7
    add-int/lit8 v3, v2, 0x1

    .line 120
    .line 121
    aget-byte v2, v1, v2

    .line 122
    .line 123
    :goto_4
    move v14, v3

    .line 124
    move v3, v2

    .line 125
    move v2, v14

    .line 126
    :goto_5
    if-gt v3, v10, :cond_9

    .line 127
    .line 128
    shl-long v12, v8, v3

    .line 129
    .line 130
    and-long/2addr v12, v6

    .line 131
    cmp-long v12, v12, v4

    .line 132
    .line 133
    if-eqz v12, :cond_9

    .line 134
    .line 135
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 136
    .line 137
    if-ne v2, v3, :cond_8

    .line 138
    .line 139
    move v3, v11

    .line 140
    goto :goto_5

    .line 141
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 142
    .line 143
    aget-byte v2, v1, v2

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    int-to-char v1, v3

    .line 147
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 148
    .line 149
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_a
    const-string v1, "illegal reference : "

    .line 153
    .line 154
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 21

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
    const/16 v3, 0x22

    .line 8
    .line 9
    if-eq v2, v3, :cond_1

    .line 10
    .line 11
    const/16 v4, 0x27

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readStringNotMatch()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    return-object v1

    .line 21
    :cond_1
    :goto_0
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    move v8, v4

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    :goto_1
    if-ge v8, v5, :cond_25

    .line 33
    .line 34
    aget-byte v11, v1, v8

    .line 35
    .line 36
    const/16 v12, 0x78

    .line 37
    .line 38
    const/16 v13, 0x75

    .line 39
    .line 40
    const/16 v15, 0x5c

    .line 41
    .line 42
    const/16 v16, 0x4

    .line 43
    .line 44
    const/16 v17, 0x2

    .line 45
    .line 46
    if-ne v11, v15, :cond_4

    .line 47
    .line 48
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 49
    .line 50
    add-int/lit8 v11, v8, 0x1

    .line 51
    .line 52
    aget-byte v11, v1, v11

    .line 53
    .line 54
    if-ne v11, v13, :cond_2

    .line 55
    .line 56
    const/4 v14, 0x6

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    if-ne v11, v12, :cond_3

    .line 59
    .line 60
    move/from16 v14, v16

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move/from16 v14, v17

    .line 64
    .line 65
    :goto_2
    add-int/2addr v8, v14

    .line 66
    move/from16 v18, v7

    .line 67
    .line 68
    goto/16 :goto_14

    .line 69
    .line 70
    :cond_4
    if-ltz v11, :cond_24

    .line 71
    .line 72
    if-ne v11, v2, :cond_23

    .line 73
    .line 74
    iget-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 75
    .line 76
    move/from16 v18, v7

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    if-eqz v11, :cond_13

    .line 80
    .line 81
    iget-object v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 82
    .line 83
    if-nez v8, :cond_5

    .line 84
    .line 85
    sget-object v8, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 86
    .line 87
    iget-object v10, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 88
    .line 89
    invoke-virtual {v8, v10, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, [C

    .line 94
    .line 95
    iput-object v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 96
    .line 97
    :cond_5
    if-eqz v8, :cond_7

    .line 98
    .line 99
    array-length v10, v8

    .line 100
    if-ge v10, v9, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    :goto_3
    move-object v11, v8

    .line 104
    goto :goto_5

    .line 105
    :cond_7
    :goto_4
    new-array v8, v9, [C

    .line 106
    .line 107
    iput-object v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :goto_5
    move v8, v6

    .line 111
    :goto_6
    aget-byte v10, v1, v4

    .line 112
    .line 113
    const/16 v19, 0xc

    .line 114
    .line 115
    if-ne v10, v15, :cond_10

    .line 116
    .line 117
    add-int/lit8 v10, v4, 0x1

    .line 118
    .line 119
    const/16 v20, 0x6

    .line 120
    .line 121
    aget-byte v14, v1, v10

    .line 122
    .line 123
    if-eq v14, v3, :cond_f

    .line 124
    .line 125
    if-eq v14, v15, :cond_f

    .line 126
    .line 127
    const/16 v15, 0x62

    .line 128
    .line 129
    if-eq v14, v15, :cond_e

    .line 130
    .line 131
    const/16 v15, 0x66

    .line 132
    .line 133
    if-eq v14, v15, :cond_8

    .line 134
    .line 135
    const/16 v15, 0x6e

    .line 136
    .line 137
    if-eq v14, v15, :cond_d

    .line 138
    .line 139
    const/16 v15, 0x72

    .line 140
    .line 141
    if-eq v14, v15, :cond_c

    .line 142
    .line 143
    if-eq v14, v12, :cond_b

    .line 144
    .line 145
    const/16 v15, 0x74

    .line 146
    .line 147
    if-eq v14, v15, :cond_a

    .line 148
    .line 149
    if-eq v14, v13, :cond_9

    .line 150
    .line 151
    invoke-virtual {v0, v14}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 152
    .line 153
    .line 154
    move-result v19

    .line 155
    :cond_8
    :goto_7
    move/from16 v14, v19

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_9
    add-int/lit8 v10, v4, 0x2

    .line 159
    .line 160
    aget-byte v10, v1, v10

    .line 161
    .line 162
    add-int/lit8 v14, v4, 0x3

    .line 163
    .line 164
    aget-byte v14, v1, v14

    .line 165
    .line 166
    add-int/lit8 v15, v4, 0x4

    .line 167
    .line 168
    aget-byte v15, v1, v15

    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x5

    .line 171
    .line 172
    aget-byte v12, v1, v4

    .line 173
    .line 174
    invoke-static {v10, v14, v15, v12}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 175
    .line 176
    .line 177
    move-result v19

    .line 178
    :goto_8
    move v10, v4

    .line 179
    goto :goto_7

    .line 180
    :cond_a
    const/16 v19, 0x9

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_b
    add-int/lit8 v10, v4, 0x2

    .line 184
    .line 185
    aget-byte v10, v1, v10

    .line 186
    .line 187
    add-int/lit8 v4, v4, 0x3

    .line 188
    .line 189
    aget-byte v12, v1, v4

    .line 190
    .line 191
    invoke-static {v10, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 192
    .line 193
    .line 194
    move-result v19

    .line 195
    goto :goto_8

    .line 196
    :cond_c
    const/16 v19, 0xd

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_d
    const/16 v19, 0xa

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_e
    const/16 v19, 0x8

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_f
    :goto_9
    int-to-char v4, v14

    .line 206
    aput-char v4, v11, v8

    .line 207
    .line 208
    add-int/lit8 v10, v10, 0x1

    .line 209
    .line 210
    move v4, v10

    .line 211
    goto :goto_a

    .line 212
    :cond_10
    const/16 v20, 0x6

    .line 213
    .line 214
    if-ne v10, v2, :cond_11

    .line 215
    .line 216
    new-instance v2, Ljava/lang/String;

    .line 217
    .line 218
    invoke-direct {v2, v11, v6, v9}, Ljava/lang/String;-><init>([CII)V

    .line 219
    .line 220
    .line 221
    move v8, v4

    .line 222
    goto/16 :goto_c

    .line 223
    .line 224
    :cond_11
    if-ltz v10, :cond_12

    .line 225
    .line 226
    int-to-char v10, v10

    .line 227
    aput-char v10, v11, v8

    .line 228
    .line 229
    add-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_12
    and-int/lit16 v12, v10, 0xff

    .line 233
    .line 234
    shr-int/lit8 v12, v12, 0x4

    .line 235
    .line 236
    packed-switch v12, :pswitch_data_0

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v4, v10, v11, v8}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8([BII[CI)V

    .line 240
    .line 241
    .line 242
    add-int/lit8 v4, v4, 0x4

    .line 243
    .line 244
    add-int/lit8 v8, v8, 0x1

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :pswitch_0
    and-int/lit8 v10, v10, 0xf

    .line 248
    .line 249
    shl-int/lit8 v10, v10, 0xc

    .line 250
    .line 251
    add-int/lit8 v12, v4, 0x1

    .line 252
    .line 253
    aget-byte v12, v1, v12

    .line 254
    .line 255
    and-int/lit8 v12, v12, 0x3f

    .line 256
    .line 257
    shl-int/lit8 v12, v12, 0x6

    .line 258
    .line 259
    or-int/2addr v10, v12

    .line 260
    add-int/lit8 v12, v4, 0x2

    .line 261
    .line 262
    aget-byte v12, v1, v12

    .line 263
    .line 264
    and-int/lit8 v12, v12, 0x3f

    .line 265
    .line 266
    or-int/2addr v10, v12

    .line 267
    int-to-char v10, v10

    .line 268
    aput-char v10, v11, v8

    .line 269
    .line 270
    add-int/lit8 v4, v4, 0x3

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :pswitch_1
    add-int/lit8 v12, v4, 0x1

    .line 274
    .line 275
    aget-byte v12, v1, v12

    .line 276
    .line 277
    and-int/lit8 v10, v10, 0x1f

    .line 278
    .line 279
    shl-int/lit8 v10, v10, 0x6

    .line 280
    .line 281
    and-int/lit8 v12, v12, 0x3f

    .line 282
    .line 283
    or-int/2addr v10, v12

    .line 284
    int-to-char v10, v10

    .line 285
    aput-char v10, v11, v8

    .line 286
    .line 287
    add-int/lit8 v4, v4, 0x2

    .line 288
    .line 289
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 290
    .line 291
    const/16 v12, 0x78

    .line 292
    .line 293
    const/16 v15, 0x5c

    .line 294
    .line 295
    goto/16 :goto_6

    .line 296
    .line 297
    :cond_13
    if-eqz v10, :cond_19

    .line 298
    .line 299
    sub-int v2, v8, v4

    .line 300
    .line 301
    sget v9, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 302
    .line 303
    if-ge v9, v3, :cond_18

    .line 304
    .line 305
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 306
    .line 307
    if-nez v3, :cond_14

    .line 308
    .line 309
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 310
    .line 311
    iget-object v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 312
    .line 313
    invoke-virtual {v3, v9, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    check-cast v3, [C

    .line 318
    .line 319
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 320
    .line 321
    :cond_14
    if-eqz v3, :cond_15

    .line 322
    .line 323
    array-length v9, v3

    .line 324
    if-ge v9, v2, :cond_16

    .line 325
    .line 326
    :cond_15
    new-array v3, v2, [C

    .line 327
    .line 328
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->charBuf:[C

    .line 329
    .line 330
    :cond_16
    move v9, v6

    .line 331
    :goto_b
    if-ge v9, v2, :cond_17

    .line 332
    .line 333
    add-int v10, v4, v9

    .line 334
    .line 335
    aget-byte v10, v1, v10

    .line 336
    .line 337
    int-to-char v10, v10

    .line 338
    aput-char v10, v3, v9

    .line 339
    .line 340
    add-int/lit8 v9, v9, 0x1

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_17
    new-instance v4, Ljava/lang/String;

    .line 344
    .line 345
    invoke-direct {v4, v3, v6, v2}, Ljava/lang/String;-><init>([CII)V

    .line 346
    .line 347
    .line 348
    move-object v2, v4

    .line 349
    goto :goto_c

    .line 350
    :cond_18
    new-instance v3, Ljava/lang/String;

    .line 351
    .line 352
    sget-object v9, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 353
    .line 354
    invoke-direct {v3, v1, v4, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 355
    .line 356
    .line 357
    move-object v2, v3

    .line 358
    goto :goto_c

    .line 359
    :cond_19
    new-instance v2, Ljava/lang/String;

    .line 360
    .line 361
    sub-int v3, v8, v4

    .line 362
    .line 363
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 364
    .line 365
    invoke-direct {v2, v1, v4, v3, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 366
    .line 367
    .line 368
    :goto_c
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 369
    .line 370
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 371
    .line 372
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 373
    .line 374
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 375
    .line 376
    and-long/2addr v3, v9

    .line 377
    const-wide/16 v9, 0x0

    .line 378
    .line 379
    cmp-long v3, v3, v9

    .line 380
    .line 381
    if-eqz v3, :cond_1a

    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    if-eqz v3, :cond_1b

    .line 392
    .line 393
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 394
    .line 395
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 396
    .line 397
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 398
    .line 399
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 400
    .line 401
    and-long/2addr v3, v11

    .line 402
    cmp-long v3, v3, v9

    .line 403
    .line 404
    if-eqz v3, :cond_1b

    .line 405
    .line 406
    goto :goto_d

    .line 407
    :cond_1b
    move-object v7, v2

    .line 408
    :goto_d
    add-int/lit8 v2, v8, 0x1

    .line 409
    .line 410
    const/16 v3, 0x1a

    .line 411
    .line 412
    if-ne v2, v5, :cond_1c

    .line 413
    .line 414
    move v8, v2

    .line 415
    :goto_e
    move v2, v3

    .line 416
    goto :goto_f

    .line 417
    :cond_1c
    add-int/lit8 v8, v8, 0x2

    .line 418
    .line 419
    aget-byte v2, v1, v2

    .line 420
    .line 421
    :goto_f
    const-wide v11, 0x100003701L

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    const-wide/16 v13, 0x1

    .line 427
    .line 428
    const/16 v4, 0x20

    .line 429
    .line 430
    if-gt v2, v4, :cond_1e

    .line 431
    .line 432
    shl-long v15, v13, v2

    .line 433
    .line 434
    and-long/2addr v15, v11

    .line 435
    cmp-long v15, v15, v9

    .line 436
    .line 437
    if-eqz v15, :cond_1e

    .line 438
    .line 439
    if-ne v8, v5, :cond_1d

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_1d
    add-int/lit8 v2, v8, 0x1

    .line 443
    .line 444
    aget-byte v4, v1, v8

    .line 445
    .line 446
    move v8, v2

    .line 447
    move v2, v4

    .line 448
    goto :goto_f

    .line 449
    :cond_1e
    const/16 v15, 0x2c

    .line 450
    .line 451
    if-ne v2, v15, :cond_1f

    .line 452
    .line 453
    move/from16 v6, v18

    .line 454
    .line 455
    :cond_1f
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 456
    .line 457
    if-eqz v6, :cond_22

    .line 458
    .line 459
    if-ne v8, v5, :cond_20

    .line 460
    .line 461
    move v6, v3

    .line 462
    goto :goto_10

    .line 463
    :cond_20
    add-int/lit8 v2, v8, 0x1

    .line 464
    .line 465
    aget-byte v6, v1, v8

    .line 466
    .line 467
    goto :goto_12

    .line 468
    :goto_10
    move v2, v6

    .line 469
    :goto_11
    if-gt v2, v4, :cond_22

    .line 470
    .line 471
    shl-long v15, v13, v2

    .line 472
    .line 473
    and-long/2addr v15, v11

    .line 474
    cmp-long v6, v15, v9

    .line 475
    .line 476
    if-eqz v6, :cond_22

    .line 477
    .line 478
    if-ne v8, v5, :cond_21

    .line 479
    .line 480
    move v2, v3

    .line 481
    goto :goto_11

    .line 482
    :cond_21
    add-int/lit8 v2, v8, 0x1

    .line 483
    .line 484
    aget-byte v6, v1, v8

    .line 485
    .line 486
    :goto_12
    move v8, v2

    .line 487
    goto :goto_10

    .line 488
    :cond_22
    int-to-char v1, v2

    .line 489
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 490
    .line 491
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 492
    .line 493
    return-object v7

    .line 494
    :cond_23
    move/from16 v18, v7

    .line 495
    .line 496
    add-int/lit8 v8, v8, 0x1

    .line 497
    .line 498
    goto :goto_14

    .line 499
    :cond_24
    move/from16 v18, v7

    .line 500
    .line 501
    and-int/lit16 v7, v11, 0xff

    .line 502
    .line 503
    shr-int/lit8 v7, v7, 0x4

    .line 504
    .line 505
    packed-switch v7, :pswitch_data_1

    .line 506
    .line 507
    .line 508
    add-int/lit8 v8, v8, 0x4

    .line 509
    .line 510
    add-int/lit8 v9, v9, 0x1

    .line 511
    .line 512
    :goto_13
    move v10, v6

    .line 513
    goto :goto_14

    .line 514
    :pswitch_2
    add-int/lit8 v8, v8, 0x3

    .line 515
    .line 516
    goto :goto_13

    .line 517
    :pswitch_3
    add-int/lit8 v8, v8, 0x2

    .line 518
    .line 519
    goto :goto_13

    .line 520
    :goto_14
    add-int/lit8 v9, v9, 0x1

    .line 521
    .line 522
    move/from16 v7, v18

    .line 523
    .line 524
    goto/16 :goto_1

    .line 525
    .line 526
    :cond_25
    const-string v1, "invalid escape character EOI"

    .line 527
    .line 528
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    const/4 v1, 0x0

    .line 532
    return-object v1

    .line 533
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public readString0()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 9
    .line 10
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    move v6, v2

    .line 14
    move v7, v3

    .line 15
    move v8, v5

    .line 16
    :goto_0
    aget-byte v9, v4, v6

    .line 17
    .line 18
    const/16 v10, 0x78

    .line 19
    .line 20
    const/16 v11, 0x75

    .line 21
    .line 22
    const/16 v12, 0x5c

    .line 23
    .line 24
    const/4 v13, 0x6

    .line 25
    const/4 v14, 0x4

    .line 26
    if-ne v9, v12, :cond_2

    .line 27
    .line 28
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 29
    .line 30
    add-int/lit8 v9, v6, 0x1

    .line 31
    .line 32
    aget-byte v9, v4, v9

    .line 33
    .line 34
    if-ne v9, v11, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-ne v9, v10, :cond_1

    .line 38
    .line 39
    move v13, v14

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v13, 0x2

    .line 42
    :goto_1
    add-int/2addr v6, v13

    .line 43
    move/from16 v16, v5

    .line 44
    .line 45
    goto/16 :goto_b

    .line 46
    .line 47
    :cond_2
    const/4 v15, -0x2

    .line 48
    const-string v3, "malformed input around byte "

    .line 49
    .line 50
    if-ltz v9, :cond_11

    .line 51
    .line 52
    if-ne v9, v1, :cond_10

    .line 53
    .line 54
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 55
    .line 56
    if-eqz v1, :cond_b

    .line 57
    .line 58
    new-array v1, v7, [C

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    :goto_2
    aget-byte v7, v4, v2

    .line 62
    .line 63
    const/16 v8, 0x22

    .line 64
    .line 65
    if-ne v7, v12, :cond_6

    .line 66
    .line 67
    add-int/lit8 v7, v2, 0x1

    .line 68
    .line 69
    aget-byte v9, v4, v7

    .line 70
    .line 71
    if-eq v9, v8, :cond_3

    .line 72
    .line 73
    if-eq v9, v12, :cond_3

    .line 74
    .line 75
    if-eq v9, v11, :cond_5

    .line 76
    .line 77
    if-eq v9, v10, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    :cond_3
    :goto_3
    move/from16 v16, v5

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    add-int/lit8 v7, v2, 0x2

    .line 87
    .line 88
    aget-byte v7, v4, v7

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x3

    .line 91
    .line 92
    aget-byte v8, v4, v2

    .line 93
    .line 94
    invoke-static {v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    move v7, v2

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    add-int/lit8 v7, v2, 0x2

    .line 101
    .line 102
    aget-byte v7, v4, v7

    .line 103
    .line 104
    add-int/lit8 v8, v2, 0x3

    .line 105
    .line 106
    aget-byte v8, v4, v8

    .line 107
    .line 108
    add-int/lit8 v9, v2, 0x4

    .line 109
    .line 110
    aget-byte v9, v4, v9

    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x5

    .line 113
    .line 114
    move/from16 v16, v5

    .line 115
    .line 116
    aget-byte v5, v4, v2

    .line 117
    .line 118
    invoke-static {v7, v8, v9, v5}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    move v7, v2

    .line 123
    :goto_4
    int-to-char v2, v9

    .line 124
    aput-char v2, v1, v6

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    move v2, v7

    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_6
    move/from16 v16, v5

    .line 132
    .line 133
    if-ne v7, v8, :cond_7

    .line 134
    .line 135
    new-instance v3, Ljava/lang/String;

    .line 136
    .line 137
    invoke-direct {v3, v1}, Ljava/lang/String;-><init>([C)V

    .line 138
    .line 139
    .line 140
    move v6, v2

    .line 141
    goto/16 :goto_6

    .line 142
    .line 143
    :cond_7
    if-ltz v7, :cond_8

    .line 144
    .line 145
    int-to-char v5, v7

    .line 146
    aput-char v5, v1, v6

    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto/16 :goto_5

    .line 151
    .line 152
    :cond_8
    and-int/lit16 v5, v7, 0xff

    .line 153
    .line 154
    shr-int/2addr v5, v14

    .line 155
    packed-switch v5, :pswitch_data_0

    .line 156
    .line 157
    .line 158
    shr-int/lit8 v5, v7, 0x3

    .line 159
    .line 160
    if-ne v5, v15, :cond_a

    .line 161
    .line 162
    add-int/lit8 v5, v2, 0x1

    .line 163
    .line 164
    add-int/lit8 v8, v2, 0x2

    .line 165
    .line 166
    aget-byte v5, v4, v5

    .line 167
    .line 168
    add-int/lit8 v9, v2, 0x3

    .line 169
    .line 170
    aget-byte v8, v4, v8

    .line 171
    .line 172
    add-int/lit8 v2, v2, 0x4

    .line 173
    .line 174
    aget-byte v9, v4, v9

    .line 175
    .line 176
    shl-int/lit8 v7, v7, 0x12

    .line 177
    .line 178
    shl-int/lit8 v17, v5, 0xc

    .line 179
    .line 180
    xor-int v7, v7, v17

    .line 181
    .line 182
    shl-int/lit8 v17, v8, 0x6

    .line 183
    .line 184
    xor-int v7, v7, v17

    .line 185
    .line 186
    const v17, 0x381f80

    .line 187
    .line 188
    .line 189
    xor-int v17, v9, v17

    .line 190
    .line 191
    xor-int v7, v7, v17

    .line 192
    .line 193
    and-int/lit16 v5, v5, 0xc0

    .line 194
    .line 195
    const/16 v10, 0x80

    .line 196
    .line 197
    if-ne v5, v10, :cond_9

    .line 198
    .line 199
    and-int/lit16 v5, v8, 0xc0

    .line 200
    .line 201
    if-ne v5, v10, :cond_9

    .line 202
    .line 203
    and-int/lit16 v5, v9, 0xc0

    .line 204
    .line 205
    if-ne v5, v10, :cond_9

    .line 206
    .line 207
    const/high16 v5, 0x10000

    .line 208
    .line 209
    if-lt v7, v5, :cond_9

    .line 210
    .line 211
    const/high16 v5, 0x110000

    .line 212
    .line 213
    if-ge v7, v5, :cond_9

    .line 214
    .line 215
    add-int/lit8 v5, v6, 0x1

    .line 216
    .line 217
    ushr-int/lit8 v8, v7, 0xa

    .line 218
    .line 219
    const v9, 0xd7c0

    .line 220
    .line 221
    .line 222
    add-int/2addr v8, v9

    .line 223
    int-to-char v8, v8

    .line 224
    aput-char v8, v1, v6

    .line 225
    .line 226
    and-int/lit16 v6, v7, 0x3ff

    .line 227
    .line 228
    const v7, 0xdc00

    .line 229
    .line 230
    .line 231
    add-int/2addr v6, v7

    .line 232
    int-to-char v6, v6

    .line 233
    aput-char v6, v1, v5

    .line 234
    .line 235
    move v6, v5

    .line 236
    goto :goto_5

    .line 237
    :cond_9
    invoke-static {v2, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_a
    invoke-static {v2, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_0
    add-int/lit8 v5, v2, 0x1

    .line 254
    .line 255
    add-int/lit8 v8, v2, 0x2

    .line 256
    .line 257
    aget-byte v5, v4, v5

    .line 258
    .line 259
    add-int/lit8 v2, v2, 0x3

    .line 260
    .line 261
    aget-byte v8, v4, v8

    .line 262
    .line 263
    and-int/lit8 v7, v7, 0xf

    .line 264
    .line 265
    shl-int/lit8 v7, v7, 0xc

    .line 266
    .line 267
    and-int/lit8 v5, v5, 0x3f

    .line 268
    .line 269
    shl-int/2addr v5, v13

    .line 270
    or-int/2addr v5, v7

    .line 271
    and-int/lit8 v7, v8, 0x3f

    .line 272
    .line 273
    or-int/2addr v5, v7

    .line 274
    int-to-char v5, v5

    .line 275
    aput-char v5, v1, v6

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :pswitch_1
    add-int/lit8 v5, v2, 0x1

    .line 279
    .line 280
    add-int/lit8 v2, v2, 0x2

    .line 281
    .line 282
    aget-byte v5, v4, v5

    .line 283
    .line 284
    and-int/lit8 v7, v7, 0x1f

    .line 285
    .line 286
    shl-int/2addr v7, v13

    .line 287
    and-int/lit8 v5, v5, 0x3f

    .line 288
    .line 289
    or-int/2addr v5, v7

    .line 290
    int-to-char v5, v5

    .line 291
    aput-char v5, v1, v6

    .line 292
    .line 293
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 294
    .line 295
    move/from16 v5, v16

    .line 296
    .line 297
    const/16 v10, 0x78

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_b
    move/from16 v16, v5

    .line 302
    .line 303
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 304
    .line 305
    if-eqz v8, :cond_c

    .line 306
    .line 307
    sub-int v2, v6, v1

    .line 308
    .line 309
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->getLatin1String(II)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    goto :goto_6

    .line 314
    :cond_c
    new-instance v3, Ljava/lang/String;

    .line 315
    .line 316
    sub-int v2, v6, v1

    .line 317
    .line 318
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 319
    .line 320
    invoke-direct {v3, v4, v1, v2, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 321
    .line 322
    .line 323
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 324
    .line 325
    aget-byte v1, v4, v6

    .line 326
    .line 327
    :goto_7
    const/16 v2, 0x20

    .line 328
    .line 329
    if-gt v1, v2, :cond_d

    .line 330
    .line 331
    const-wide/16 v7, 0x1

    .line 332
    .line 333
    shl-long/2addr v7, v1

    .line 334
    const-wide v9, 0x100003701L

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    and-long/2addr v7, v9

    .line 340
    const-wide/16 v9, 0x0

    .line 341
    .line 342
    cmp-long v2, v7, v9

    .line 343
    .line 344
    if-eqz v2, :cond_d

    .line 345
    .line 346
    add-int/lit8 v6, v6, 0x1

    .line 347
    .line 348
    aget-byte v1, v4, v6

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_d
    const/16 v2, 0x2c

    .line 352
    .line 353
    if-ne v1, v2, :cond_e

    .line 354
    .line 355
    move/from16 v4, v16

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_e
    const/4 v4, 0x0

    .line 359
    :goto_8
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 360
    .line 361
    add-int/lit8 v6, v6, 0x1

    .line 362
    .line 363
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 364
    .line 365
    if-ne v1, v2, :cond_f

    .line 366
    .line 367
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 368
    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_f
    int-to-char v1, v1

    .line 372
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 373
    .line 374
    :goto_9
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 375
    .line 376
    return-void

    .line 377
    :cond_10
    move/from16 v16, v5

    .line 378
    .line 379
    add-int/lit8 v6, v6, 0x1

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_11
    move/from16 v16, v5

    .line 383
    .line 384
    and-int/lit16 v5, v9, 0xff

    .line 385
    .line 386
    shr-int/2addr v5, v14

    .line 387
    packed-switch v5, :pswitch_data_1

    .line 388
    .line 389
    .line 390
    shr-int/lit8 v5, v9, 0x3

    .line 391
    .line 392
    if-ne v5, v15, :cond_12

    .line 393
    .line 394
    add-int/lit8 v6, v6, 0x4

    .line 395
    .line 396
    add-int/lit8 v7, v7, 0x1

    .line 397
    .line 398
    :goto_a
    const/4 v8, 0x0

    .line 399
    goto :goto_b

    .line 400
    :cond_12
    invoke-static {v6, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_2
    add-int/lit8 v6, v6, 0x3

    .line 409
    .line 410
    goto :goto_a

    .line 411
    :pswitch_3
    add-int/lit8 v6, v6, 0x2

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 415
    .line 416
    move/from16 v5, v16

    .line 417
    .line 418
    const/4 v3, 0x0

    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final readUUID()Ljava/util/UUID;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x6e

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readNull()V

    .line 11
    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    const/16 v2, 0x22

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const/16 v2, 0x27

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v1, "syntax error, can not read uuid"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    return-object v1

    .line 34
    :cond_2
    :goto_0
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 35
    .line 36
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 37
    .line 38
    add-int/lit8 v5, v4, 0x24

    .line 39
    .line 40
    array-length v6, v2

    .line 41
    const/16 v7, 0x20

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const-wide/16 v9, 0x0

    .line 45
    .line 46
    const/4 v11, 0x4

    .line 47
    if-ge v5, v6, :cond_8

    .line 48
    .line 49
    aget-byte v5, v2, v5

    .line 50
    .line 51
    if-ne v5, v1, :cond_8

    .line 52
    .line 53
    add-int/lit8 v5, v4, 0x8

    .line 54
    .line 55
    aget-byte v5, v2, v5

    .line 56
    .line 57
    const/16 v6, 0x2d

    .line 58
    .line 59
    if-ne v5, v6, :cond_8

    .line 60
    .line 61
    add-int/lit8 v5, v4, 0xd

    .line 62
    .line 63
    aget-byte v5, v2, v5

    .line 64
    .line 65
    if-ne v5, v6, :cond_8

    .line 66
    .line 67
    add-int/lit8 v5, v4, 0x12

    .line 68
    .line 69
    aget-byte v5, v2, v5

    .line 70
    .line 71
    if-ne v5, v6, :cond_8

    .line 72
    .line 73
    add-int/lit8 v5, v4, 0x17

    .line 74
    .line 75
    aget-byte v5, v2, v5

    .line 76
    .line 77
    if-ne v5, v6, :cond_8

    .line 78
    .line 79
    move v1, v8

    .line 80
    move-wide v5, v9

    .line 81
    :goto_1
    const/16 v3, 0x8

    .line 82
    .line 83
    if-ge v1, v3, :cond_3

    .line 84
    .line 85
    shl-long/2addr v5, v11

    .line 86
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 87
    .line 88
    add-int v12, v4, v1

    .line 89
    .line 90
    aget-byte v12, v2, v12

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x30

    .line 93
    .line 94
    aget-byte v3, v3, v12

    .line 95
    .line 96
    int-to-long v12, v3

    .line 97
    add-long/2addr v5, v12

    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/16 v1, 0x9

    .line 102
    .line 103
    :goto_2
    const/16 v3, 0xd

    .line 104
    .line 105
    if-ge v1, v3, :cond_4

    .line 106
    .line 107
    shl-long/2addr v5, v11

    .line 108
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 109
    .line 110
    add-int v12, v4, v1

    .line 111
    .line 112
    aget-byte v12, v2, v12

    .line 113
    .line 114
    add-int/lit8 v12, v12, -0x30

    .line 115
    .line 116
    aget-byte v3, v3, v12

    .line 117
    .line 118
    int-to-long v12, v3

    .line 119
    add-long/2addr v5, v12

    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const/16 v1, 0xe

    .line 124
    .line 125
    :goto_3
    const/16 v3, 0x12

    .line 126
    .line 127
    if-ge v1, v3, :cond_5

    .line 128
    .line 129
    shl-long/2addr v5, v11

    .line 130
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 131
    .line 132
    add-int v12, v4, v1

    .line 133
    .line 134
    aget-byte v12, v2, v12

    .line 135
    .line 136
    add-int/lit8 v12, v12, -0x30

    .line 137
    .line 138
    aget-byte v3, v3, v12

    .line 139
    .line 140
    int-to-long v12, v3

    .line 141
    add-long/2addr v5, v12

    .line 142
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    const/16 v1, 0x13

    .line 146
    .line 147
    move-wide v12, v9

    .line 148
    :goto_4
    const/16 v3, 0x17

    .line 149
    .line 150
    if-ge v1, v3, :cond_6

    .line 151
    .line 152
    shl-long/2addr v12, v11

    .line 153
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 154
    .line 155
    add-int v14, v4, v1

    .line 156
    .line 157
    aget-byte v14, v2, v14

    .line 158
    .line 159
    add-int/lit8 v14, v14, -0x30

    .line 160
    .line 161
    aget-byte v3, v3, v14

    .line 162
    .line 163
    int-to-long v14, v3

    .line 164
    add-long/2addr v12, v14

    .line 165
    add-int/lit8 v1, v1, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    const/16 v1, 0x18

    .line 169
    .line 170
    :goto_5
    const/16 v3, 0x24

    .line 171
    .line 172
    if-ge v1, v3, :cond_7

    .line 173
    .line 174
    shl-long/2addr v12, v11

    .line 175
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 176
    .line 177
    add-int v14, v4, v1

    .line 178
    .line 179
    aget-byte v14, v2, v14

    .line 180
    .line 181
    add-int/lit8 v14, v14, -0x30

    .line 182
    .line 183
    aget-byte v3, v3, v14

    .line 184
    .line 185
    int-to-long v14, v3

    .line 186
    add-long/2addr v12, v14

    .line 187
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_7
    add-int/lit8 v4, v4, 0x25

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_8
    add-int/lit8 v5, v4, 0x20

    .line 194
    .line 195
    array-length v6, v2

    .line 196
    if-ge v5, v6, :cond_10

    .line 197
    .line 198
    aget-byte v5, v2, v5

    .line 199
    .line 200
    if-ne v5, v1, :cond_10

    .line 201
    .line 202
    move v1, v8

    .line 203
    move-wide v5, v9

    .line 204
    :goto_6
    const/16 v3, 0x10

    .line 205
    .line 206
    if-ge v1, v3, :cond_9

    .line 207
    .line 208
    shl-long/2addr v5, v11

    .line 209
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 210
    .line 211
    add-int v12, v4, v1

    .line 212
    .line 213
    aget-byte v12, v2, v12

    .line 214
    .line 215
    add-int/lit8 v12, v12, -0x30

    .line 216
    .line 217
    aget-byte v3, v3, v12

    .line 218
    .line 219
    int-to-long v12, v3

    .line 220
    add-long/2addr v5, v12

    .line 221
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_9
    move-wide v12, v9

    .line 225
    :goto_7
    if-ge v3, v7, :cond_a

    .line 226
    .line 227
    shl-long/2addr v12, v11

    .line 228
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 229
    .line 230
    add-int v14, v4, v3

    .line 231
    .line 232
    aget-byte v14, v2, v14

    .line 233
    .line 234
    add-int/lit8 v14, v14, -0x30

    .line 235
    .line 236
    aget-byte v1, v1, v14

    .line 237
    .line 238
    int-to-long v14, v1

    .line 239
    add-long/2addr v12, v14

    .line 240
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_a
    add-int/lit8 v4, v4, 0x21

    .line 244
    .line 245
    :goto_8
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 246
    .line 247
    const/16 v3, 0x1a

    .line 248
    .line 249
    if-ne v4, v1, :cond_b

    .line 250
    .line 251
    move v1, v4

    .line 252
    :goto_9
    move v4, v3

    .line 253
    goto :goto_a

    .line 254
    :cond_b
    add-int/lit8 v1, v4, 0x1

    .line 255
    .line 256
    aget-byte v4, v2, v4

    .line 257
    .line 258
    :goto_a
    if-gt v4, v7, :cond_d

    .line 259
    .line 260
    const-wide/16 v14, 0x1

    .line 261
    .line 262
    shl-long/2addr v14, v4

    .line 263
    const-wide v16, 0x100003701L

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    and-long v14, v14, v16

    .line 269
    .line 270
    cmp-long v11, v14, v9

    .line 271
    .line 272
    if-eqz v11, :cond_d

    .line 273
    .line 274
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 275
    .line 276
    if-ne v1, v4, :cond_c

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_c
    add-int/lit8 v4, v1, 0x1

    .line 280
    .line 281
    aget-byte v1, v2, v1

    .line 282
    .line 283
    move/from16 v18, v4

    .line 284
    .line 285
    move v4, v1

    .line 286
    move/from16 v1, v18

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_d
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 290
    .line 291
    const/16 v1, 0x2c

    .line 292
    .line 293
    if-ne v4, v1, :cond_e

    .line 294
    .line 295
    const/4 v8, 0x1

    .line 296
    :cond_e
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 297
    .line 298
    if-eqz v8, :cond_f

    .line 299
    .line 300
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 301
    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_f
    int-to-char v1, v4

    .line 305
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 306
    .line 307
    :goto_b
    new-instance v1, Ljava/util/UUID;

    .line 308
    .line 309
    invoke-direct {v1, v5, v6, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    .line 310
    .line 311
    .line 312
    return-object v1

    .line 313
    :cond_10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_11

    .line 322
    .line 323
    return-object v3

    .line 324
    :cond_11
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    return-object v1
.end method

.method public readValueHashCode()J
    .locals 25

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
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 29
    .line 30
    move v10, v5

    .line 31
    const-wide/16 v11, 0x0

    .line 32
    .line 33
    :goto_0
    const/16 v13, 0x78

    .line 34
    .line 35
    const/16 v14, 0x75

    .line 36
    .line 37
    const/16 v15, 0x5c

    .line 38
    .line 39
    const-wide/16 v16, 0x0

    .line 40
    .line 41
    if-ge v6, v7, :cond_1

    .line 42
    .line 43
    aget-byte v9, v3, v6

    .line 44
    .line 45
    if-ne v9, v1, :cond_3

    .line 46
    .line 47
    if-nez v10, :cond_2

    .line 48
    .line 49
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 50
    .line 51
    move-wide/from16 v11, v16

    .line 52
    .line 53
    :cond_1
    :goto_1
    const/16 v20, 0x20

    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_2
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 58
    .line 59
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 60
    .line 61
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    if-ne v9, v15, :cond_6

    .line 65
    .line 66
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 67
    .line 68
    add-int/lit8 v9, v6, 0x1

    .line 69
    .line 70
    aget-byte v5, v3, v9

    .line 71
    .line 72
    if-eq v5, v14, :cond_5

    .line 73
    .line 74
    if-eq v5, v13, :cond_4

    .line 75
    .line 76
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    move v6, v9

    .line 81
    const/16 v20, 0x20

    .line 82
    .line 83
    move v9, v5

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    add-int/lit8 v5, v6, 0x2

    .line 86
    .line 87
    aget-byte v5, v3, v5

    .line 88
    .line 89
    add-int/lit8 v6, v6, 0x3

    .line 90
    .line 91
    aget-byte v9, v3, v6

    .line 92
    .line 93
    invoke-static {v5, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    const/16 v20, 0x20

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    add-int/lit8 v5, v6, 0x2

    .line 101
    .line 102
    aget-byte v5, v3, v5

    .line 103
    .line 104
    add-int/lit8 v9, v6, 0x3

    .line 105
    .line 106
    aget-byte v9, v3, v9

    .line 107
    .line 108
    add-int/lit8 v19, v6, 0x4

    .line 109
    .line 110
    const/16 v20, 0x20

    .line 111
    .line 112
    aget-byte v8, v3, v19

    .line 113
    .line 114
    add-int/lit8 v6, v6, 0x5

    .line 115
    .line 116
    aget-byte v2, v3, v6

    .line 117
    .line 118
    invoke-static {v5, v9, v8, v2}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    const/16 v20, 0x20

    .line 124
    .line 125
    const/16 v2, -0x3d

    .line 126
    .line 127
    if-eq v9, v2, :cond_7

    .line 128
    .line 129
    const/16 v2, -0x3e

    .line 130
    .line 131
    if-ne v9, v2, :cond_8

    .line 132
    .line 133
    :cond_7
    and-int/lit8 v2, v9, 0x1f

    .line 134
    .line 135
    shl-int/lit8 v2, v2, 0x6

    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x1

    .line 138
    .line 139
    aget-byte v5, v3, v6

    .line 140
    .line 141
    and-int/lit8 v5, v5, 0x3f

    .line 142
    .line 143
    or-int/2addr v2, v5

    .line 144
    int-to-char v9, v2

    .line 145
    :cond_8
    :goto_2
    const/16 v2, 0xff

    .line 146
    .line 147
    if-gt v9, v2, :cond_a

    .line 148
    .line 149
    if-ltz v9, :cond_a

    .line 150
    .line 151
    const/16 v2, 0x8

    .line 152
    .line 153
    if-ge v10, v2, :cond_a

    .line 154
    .line 155
    if-nez v10, :cond_9

    .line 156
    .line 157
    if-nez v9, :cond_9

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    packed-switch v10, :pswitch_data_0

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :pswitch_0
    int-to-byte v2, v9

    .line 165
    int-to-long v8, v2

    .line 166
    const/16 v2, 0x38

    .line 167
    .line 168
    shl-long/2addr v8, v2

    .line 169
    const-wide v13, 0xffffffffffffffL

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    :goto_3
    and-long/2addr v11, v13

    .line 175
    add-long/2addr v11, v8

    .line 176
    goto :goto_4

    .line 177
    :pswitch_1
    int-to-byte v2, v9

    .line 178
    int-to-long v8, v2

    .line 179
    const/16 v2, 0x30

    .line 180
    .line 181
    shl-long/2addr v8, v2

    .line 182
    const-wide v13, 0xffffffffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :pswitch_2
    int-to-byte v2, v9

    .line 189
    int-to-long v8, v2

    .line 190
    const/16 v2, 0x28

    .line 191
    .line 192
    shl-long/2addr v8, v2

    .line 193
    const-wide v13, 0xffffffffffL

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_3
    int-to-byte v2, v9

    .line 200
    int-to-long v8, v2

    .line 201
    shl-long v8, v8, v20

    .line 202
    .line 203
    const-wide v13, 0xffffffffL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_4
    int-to-byte v2, v9

    .line 210
    shl-int/lit8 v2, v2, 0x18

    .line 211
    .line 212
    int-to-long v8, v2

    .line 213
    const-wide/32 v13, 0xffffff

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :pswitch_5
    int-to-byte v2, v9

    .line 218
    shl-int/lit8 v2, v2, 0x10

    .line 219
    .line 220
    int-to-long v8, v2

    .line 221
    const-wide/32 v13, 0xffff

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :pswitch_6
    int-to-byte v5, v9

    .line 226
    shl-int/lit8 v2, v5, 0x8

    .line 227
    .line 228
    int-to-long v8, v2

    .line 229
    const-wide/16 v13, 0xff

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :pswitch_7
    int-to-byte v2, v9

    .line 233
    int-to-long v11, v2

    .line 234
    :goto_4
    add-int/2addr v6, v4

    .line 235
    add-int/lit8 v10, v10, 0x1

    .line 236
    .line 237
    const/16 v2, 0x22

    .line 238
    .line 239
    const/4 v5, 0x0

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_a
    :goto_5
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameBegin:I

    .line 243
    .line 244
    move-wide/from16 v11, v16

    .line 245
    .line 246
    :goto_6
    cmp-long v1, v11, v16

    .line 247
    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    move/from16 v21, v4

    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_b
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    move-wide v11, v1

    .line 259
    const/4 v1, 0x0

    .line 260
    :goto_7
    aget-byte v2, v3, v6

    .line 261
    .line 262
    const-wide v8, 0x100000001b3L

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    if-ne v2, v15, :cond_e

    .line 268
    .line 269
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 270
    .line 271
    add-int/lit8 v2, v6, 0x1

    .line 272
    .line 273
    aget-byte v5, v3, v2

    .line 274
    .line 275
    if-eq v5, v14, :cond_d

    .line 276
    .line 277
    if-eq v5, v13, :cond_c

    .line 278
    .line 279
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    :goto_8
    move/from16 v21, v4

    .line 284
    .line 285
    goto :goto_9

    .line 286
    :cond_c
    add-int/lit8 v2, v6, 0x2

    .line 287
    .line 288
    aget-byte v2, v3, v2

    .line 289
    .line 290
    add-int/lit8 v5, v6, 0x3

    .line 291
    .line 292
    aget-byte v6, v3, v5

    .line 293
    .line 294
    invoke-static {v2, v6}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    move/from16 v21, v5

    .line 299
    .line 300
    move v5, v2

    .line 301
    move/from16 v2, v21

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_d
    add-int/lit8 v2, v6, 0x2

    .line 305
    .line 306
    aget-byte v2, v3, v2

    .line 307
    .line 308
    add-int/lit8 v5, v6, 0x3

    .line 309
    .line 310
    aget-byte v5, v3, v5

    .line 311
    .line 312
    add-int/lit8 v10, v6, 0x4

    .line 313
    .line 314
    aget-byte v10, v3, v10

    .line 315
    .line 316
    add-int/lit8 v6, v6, 0x5

    .line 317
    .line 318
    move/from16 v21, v4

    .line 319
    .line 320
    aget-byte v4, v3, v6

    .line 321
    .line 322
    invoke-static {v2, v5, v10, v4}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    move v2, v6

    .line 327
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 328
    .line 329
    int-to-long v4, v5

    .line 330
    xor-long/2addr v4, v11

    .line 331
    mul-long/2addr v4, v8

    .line 332
    move v6, v2

    .line 333
    :goto_a
    move-wide v11, v4

    .line 334
    const/4 v4, 0x0

    .line 335
    goto/16 :goto_13

    .line 336
    .line 337
    :cond_e
    move/from16 v21, v4

    .line 338
    .line 339
    const/16 v4, 0x22

    .line 340
    .line 341
    if-ne v2, v4, :cond_16

    .line 342
    .line 343
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameLength:I

    .line 344
    .line 345
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameEnd:I

    .line 346
    .line 347
    add-int/lit8 v6, v6, 0x1

    .line 348
    .line 349
    :goto_b
    const/16 v1, 0x1a

    .line 350
    .line 351
    if-ne v6, v7, :cond_f

    .line 352
    .line 353
    move v4, v1

    .line 354
    goto :goto_c

    .line 355
    :cond_f
    add-int/lit8 v2, v6, 0x1

    .line 356
    .line 357
    aget-byte v4, v3, v6

    .line 358
    .line 359
    move v6, v2

    .line 360
    :goto_c
    const-wide v8, 0x100003701L

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    const-wide/16 v13, 0x1

    .line 366
    .line 367
    move/from16 v2, v20

    .line 368
    .line 369
    if-gt v4, v2, :cond_11

    .line 370
    .line 371
    shl-long v22, v13, v4

    .line 372
    .line 373
    and-long v22, v22, v8

    .line 374
    .line 375
    cmp-long v2, v22, v16

    .line 376
    .line 377
    if-eqz v2, :cond_11

    .line 378
    .line 379
    if-ne v6, v7, :cond_10

    .line 380
    .line 381
    move v4, v1

    .line 382
    goto :goto_d

    .line 383
    :cond_10
    add-int/lit8 v2, v6, 0x1

    .line 384
    .line 385
    aget-byte v4, v3, v6

    .line 386
    .line 387
    move v6, v2

    .line 388
    :goto_d
    const/16 v20, 0x20

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_11
    const/16 v2, 0x2c

    .line 392
    .line 393
    if-ne v4, v2, :cond_12

    .line 394
    .line 395
    move/from16 v2, v21

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_12
    const/4 v2, 0x0

    .line 399
    :goto_e
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 400
    .line 401
    if-eqz v2, :cond_15

    .line 402
    .line 403
    if-ne v6, v7, :cond_13

    .line 404
    .line 405
    move v4, v1

    .line 406
    goto :goto_f

    .line 407
    :cond_13
    add-int/lit8 v2, v6, 0x1

    .line 408
    .line 409
    aget-byte v4, v3, v6

    .line 410
    .line 411
    move v6, v2

    .line 412
    :goto_f
    const/16 v5, 0x20

    .line 413
    .line 414
    :goto_10
    if-gt v4, v5, :cond_15

    .line 415
    .line 416
    shl-long v18, v13, v4

    .line 417
    .line 418
    and-long v18, v18, v8

    .line 419
    .line 420
    cmp-long v2, v18, v16

    .line 421
    .line 422
    if-eqz v2, :cond_15

    .line 423
    .line 424
    if-ne v6, v7, :cond_14

    .line 425
    .line 426
    move v4, v1

    .line 427
    goto :goto_10

    .line 428
    :cond_14
    add-int/lit8 v2, v6, 0x1

    .line 429
    .line 430
    aget-byte v4, v3, v6

    .line 431
    .line 432
    move v6, v2

    .line 433
    goto :goto_10

    .line 434
    :cond_15
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 435
    .line 436
    int-to-char v1, v4

    .line 437
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 438
    .line 439
    return-wide v11

    .line 440
    :cond_16
    move/from16 v5, v20

    .line 441
    .line 442
    if-ltz v2, :cond_17

    .line 443
    .line 444
    add-int/lit8 v6, v6, 0x1

    .line 445
    .line 446
    move-wide/from16 v23, v8

    .line 447
    .line 448
    const/4 v4, 0x0

    .line 449
    goto/16 :goto_12

    .line 450
    .line 451
    :cond_17
    and-int/lit16 v10, v2, 0xff

    .line 452
    .line 453
    shr-int/lit8 v10, v10, 0x4

    .line 454
    .line 455
    packed-switch v10, :pswitch_data_1

    .line 456
    .line 457
    .line 458
    shr-int/lit8 v10, v2, 0x3

    .line 459
    .line 460
    const/4 v4, -0x2

    .line 461
    const-string v5, "malformed input around byte "

    .line 462
    .line 463
    if-ne v10, v4, :cond_19

    .line 464
    .line 465
    add-int/lit8 v4, v6, 0x1

    .line 466
    .line 467
    add-int/lit8 v10, v6, 0x2

    .line 468
    .line 469
    aget-byte v4, v3, v4

    .line 470
    .line 471
    add-int/lit8 v22, v6, 0x3

    .line 472
    .line 473
    aget-byte v10, v3, v10

    .line 474
    .line 475
    add-int/lit8 v6, v6, 0x4

    .line 476
    .line 477
    move-wide/from16 v23, v8

    .line 478
    .line 479
    aget-byte v8, v3, v22

    .line 480
    .line 481
    shl-int/lit8 v2, v2, 0x12

    .line 482
    .line 483
    shl-int/lit8 v9, v4, 0xc

    .line 484
    .line 485
    xor-int/2addr v2, v9

    .line 486
    shl-int/lit8 v9, v10, 0x6

    .line 487
    .line 488
    xor-int/2addr v2, v9

    .line 489
    const v9, 0x381f80

    .line 490
    .line 491
    .line 492
    xor-int/2addr v9, v8

    .line 493
    xor-int/2addr v2, v9

    .line 494
    and-int/lit16 v4, v4, 0xc0

    .line 495
    .line 496
    const/16 v9, 0x80

    .line 497
    .line 498
    if-ne v4, v9, :cond_18

    .line 499
    .line 500
    and-int/lit16 v4, v10, 0xc0

    .line 501
    .line 502
    if-ne v4, v9, :cond_18

    .line 503
    .line 504
    and-int/lit16 v4, v8, 0xc0

    .line 505
    .line 506
    if-ne v4, v9, :cond_18

    .line 507
    .line 508
    const/high16 v4, 0x10000

    .line 509
    .line 510
    if-lt v2, v4, :cond_18

    .line 511
    .line 512
    const/high16 v4, 0x110000

    .line 513
    .line 514
    if-ge v2, v4, :cond_18

    .line 515
    .line 516
    ushr-int/lit8 v4, v2, 0xa

    .line 517
    .line 518
    const v5, 0xd7c0

    .line 519
    .line 520
    .line 521
    add-int/2addr v4, v5

    .line 522
    int-to-char v4, v4

    .line 523
    and-int/lit16 v2, v2, 0x3ff

    .line 524
    .line 525
    const v5, 0xdc00

    .line 526
    .line 527
    .line 528
    add-int/2addr v2, v5

    .line 529
    int-to-char v2, v2

    .line 530
    int-to-long v4, v4

    .line 531
    xor-long/2addr v4, v11

    .line 532
    mul-long v4, v4, v23

    .line 533
    .line 534
    int-to-long v8, v2

    .line 535
    xor-long/2addr v4, v8

    .line 536
    mul-long v4, v4, v23

    .line 537
    .line 538
    add-int/lit8 v1, v1, 0x1

    .line 539
    .line 540
    goto/16 :goto_a

    .line 541
    .line 542
    :cond_18
    invoke-static {v6, v5}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    :goto_11
    const-wide/16 v1, 0x0

    .line 550
    .line 551
    return-wide v1

    .line 552
    :cond_19
    invoke-static {v6, v5}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    goto :goto_11

    .line 560
    :pswitch_8
    move-wide/from16 v23, v8

    .line 561
    .line 562
    add-int/lit8 v4, v6, 0x1

    .line 563
    .line 564
    aget-byte v4, v3, v4

    .line 565
    .line 566
    add-int/lit8 v5, v6, 0x2

    .line 567
    .line 568
    aget-byte v5, v3, v5

    .line 569
    .line 570
    invoke-static {v2, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    add-int/lit8 v6, v6, 0x3

    .line 575
    .line 576
    const/4 v4, 0x0

    .line 577
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 578
    .line 579
    goto :goto_12

    .line 580
    :pswitch_9
    move-wide/from16 v23, v8

    .line 581
    .line 582
    const/4 v4, 0x0

    .line 583
    add-int/lit8 v5, v6, 0x1

    .line 584
    .line 585
    aget-byte v5, v3, v5

    .line 586
    .line 587
    invoke-static {v2, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    add-int/lit8 v6, v6, 0x2

    .line 592
    .line 593
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nameAscii:Z

    .line 594
    .line 595
    :goto_12
    int-to-long v8, v2

    .line 596
    xor-long/2addr v8, v11

    .line 597
    mul-long v8, v8, v23

    .line 598
    .line 599
    move-wide v11, v8

    .line 600
    :goto_13
    add-int/lit8 v1, v1, 0x1

    .line 601
    .line 602
    move/from16 v4, v21

    .line 603
    .line 604
    const/16 v20, 0x20

    .line 605
    .line 606
    goto/16 :goto_7

    .line 607
    .line 608
    nop

    .line 609
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

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
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
    .line 628
    .line 629
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_9
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final readZonedDateTimeX(I)Ljava/time/ZonedDateTime;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    const/16 v0, 0x13

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const/16 v0, 0x1e

    .line 14
    .line 15
    const/16 v2, 0x5a

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 20
    .line 21
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    add-int/lit8 v4, v3, 0x1d

    .line 24
    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    if-ne v4, v2, :cond_1

    .line 28
    .line 29
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime29([BI)Ljava/time/LocalDateTime;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 34
    .line 35
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/16 v0, 0x1d

    .line 41
    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 45
    .line 46
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 47
    .line 48
    add-int/lit8 v4, v3, 0x1c

    .line 49
    .line 50
    aget-byte v4, v0, v4

    .line 51
    .line 52
    if-ne v4, v2, :cond_2

    .line 53
    .line 54
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime28([BI)Ljava/time/LocalDateTime;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 59
    .line 60
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/16 v0, 0x1c

    .line 66
    .line 67
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 70
    .line 71
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 72
    .line 73
    add-int/lit8 v4, v3, 0x1b

    .line 74
    .line 75
    aget-byte v4, v0, v4

    .line 76
    .line 77
    if-ne v4, v2, :cond_3

    .line 78
    .line 79
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime27([BI)Ljava/time/LocalDateTime;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 84
    .line 85
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const/16 v0, 0x1b

    .line 91
    .line 92
    if-ne p1, v0, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 95
    .line 96
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 97
    .line 98
    add-int/lit8 v4, v3, 0x1a

    .line 99
    .line 100
    aget-byte v4, v0, v4

    .line 101
    .line 102
    if-ne v4, v2, :cond_4

    .line 103
    .line 104
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime26([BI)Ljava/time/LocalDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 109
    .line 110
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 116
    .line 117
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 118
    .line 119
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 120
    .line 121
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 122
    .line 123
    invoke-static {v0, v2, p1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_0
    if-nez v0, :cond_5

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_5
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 131
    .line 132
    const/4 v2, 0x1

    .line 133
    add-int/2addr p1, v2

    .line 134
    add-int/2addr p1, v1

    .line 135
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 138
    .line 139
    .line 140
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 141
    .line 142
    const/16 v1, 0x2c

    .line 143
    .line 144
    if-ne p1, v1, :cond_6

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    const/4 v2, 0x0

    .line 148
    :goto_1
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 149
    .line 150
    if-eqz v2, :cond_7

    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 153
    .line 154
    .line 155
    :cond_7
    return-object v0

    .line 156
    :cond_8
    const-string p1, "date only support string input"

    .line 157
    .line 158
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const/4 p1, 0x0

    .line 162
    return-object p1
.end method

.method public final skipComment()V
    .locals 13

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_a

    .line 8
    .line 9
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 10
    .line 11
    aget-byte v3, v2, v0

    .line 12
    .line 13
    const/16 v4, 0x2a

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/16 v6, 0x2f

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-ne v3, v6, :cond_9

    .line 24
    .line 25
    move v3, v5

    .line 26
    :goto_0
    add-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    aget-byte v1, v2, v1

    .line 29
    .line 30
    :goto_1
    if-eqz v3, :cond_2

    .line 31
    .line 32
    if-ne v1, v4, :cond_1

    .line 33
    .line 34
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 35
    .line 36
    if-gt v0, v1, :cond_1

    .line 37
    .line 38
    aget-byte v1, v2, v0

    .line 39
    .line 40
    if-ne v1, v6, :cond_1

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    :goto_2
    move v1, v7

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    move v1, v5

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    const/16 v8, 0xa

    .line 49
    .line 50
    if-ne v1, v8, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :goto_3
    iget v8, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 54
    .line 55
    const/16 v9, 0x1a

    .line 56
    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    if-lt v0, v8, :cond_3

    .line 60
    .line 61
    goto :goto_6

    .line 62
    :cond_3
    aget-byte v1, v2, v0

    .line 63
    .line 64
    :goto_4
    const/16 v3, 0x20

    .line 65
    .line 66
    if-gt v1, v3, :cond_5

    .line 67
    .line 68
    const-wide/16 v3, 0x1

    .line 69
    .line 70
    shl-long/2addr v3, v1

    .line 71
    const-wide v10, 0x100003701L

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr v3, v10

    .line 77
    const-wide/16 v10, 0x0

    .line 78
    .line 79
    cmp-long v3, v3, v10

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 86
    .line 87
    if-lt v0, v1, :cond_4

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_4
    aget-byte v1, v2, v0

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move v9, v1

    .line 94
    :goto_5
    add-int/2addr v0, v7

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    if-lt v0, v8, :cond_8

    .line 97
    .line 98
    :goto_6
    int-to-char v1, v9

    .line 99
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 100
    .line 101
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 102
    .line 103
    if-ne v9, v6, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipComment()V

    .line 106
    .line 107
    .line 108
    :cond_7
    return-void

    .line 109
    :cond_8
    add-int/lit8 v1, v0, 0x1

    .line 110
    .line 111
    aget-byte v0, v2, v0

    .line 112
    .line 113
    move v12, v1

    .line 114
    move v1, v0

    .line 115
    move v0, v12

    .line 116
    goto :goto_1

    .line 117
    :cond_9
    const-string v0, "parse comment error"

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final skipName()Z
    .locals 15

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/16 v3, 0x27

    .line 6
    .line 7
    if-ne v0, v3, :cond_1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 10
    .line 11
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 12
    .line 13
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 14
    .line 15
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 16
    .line 17
    and-long/2addr v4, v6

    .line 18
    cmp-long v4, v4, v1

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    throw v0

    .line 28
    :cond_1
    :goto_0
    const/16 v4, 0x22

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-eq v0, v4, :cond_3

    .line 32
    .line 33
    if-eq v0, v3, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 36
    .line 37
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 38
    .line 39
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 40
    .line 41
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 42
    .line 43
    and-long/2addr v3, v6

    .line 44
    cmp-long v0, v3, v1

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->readFieldNameHashCodeUnquote()J

    .line 49
    .line 50
    .line 51
    return v5

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    throw v0

    .line 57
    :cond_3
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 58
    .line 59
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->bytes:[B

    .line 60
    .line 61
    :goto_1
    add-int/lit8 v6, v3, 0x1

    .line 62
    .line 63
    aget-byte v7, v4, v3

    .line 64
    .line 65
    const/16 v8, 0x5c

    .line 66
    .line 67
    if-ne v7, v8, :cond_6

    .line 68
    .line 69
    aget-byte v3, v4, v6

    .line 70
    .line 71
    const/16 v7, 0x75

    .line 72
    .line 73
    if-ne v3, v7, :cond_4

    .line 74
    .line 75
    const/4 v3, 0x5

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const/16 v7, 0x78

    .line 78
    .line 79
    if-ne v3, v7, :cond_5

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move v3, v5

    .line 84
    :goto_2
    add-int/2addr v3, v6

    .line 85
    goto :goto_1

    .line 86
    :cond_6
    if-ne v7, v0, :cond_e

    .line 87
    .line 88
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 89
    .line 90
    const/16 v7, 0x1a

    .line 91
    .line 92
    if-ne v6, v0, :cond_7

    .line 93
    .line 94
    :goto_3
    move v0, v7

    .line 95
    goto :goto_4

    .line 96
    :cond_7
    add-int/lit8 v3, v3, 0x2

    .line 97
    .line 98
    aget-byte v0, v4, v6

    .line 99
    .line 100
    move v6, v3

    .line 101
    :goto_4
    const-wide v8, 0x100003701L

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    const-wide/16 v10, 0x1

    .line 107
    .line 108
    const/16 v3, 0x20

    .line 109
    .line 110
    if-gt v0, v3, :cond_9

    .line 111
    .line 112
    shl-long v12, v10, v0

    .line 113
    .line 114
    and-long/2addr v12, v8

    .line 115
    cmp-long v12, v12, v1

    .line 116
    .line 117
    if-eqz v12, :cond_9

    .line 118
    .line 119
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 120
    .line 121
    if-ne v6, v0, :cond_8

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    add-int/lit8 v0, v6, 0x1

    .line 125
    .line 126
    aget-byte v3, v4, v6

    .line 127
    .line 128
    move v6, v0

    .line 129
    move v0, v3

    .line 130
    goto :goto_4

    .line 131
    :cond_9
    const/16 v12, 0x3a

    .line 132
    .line 133
    if-ne v0, v12, :cond_d

    .line 134
    .line 135
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 136
    .line 137
    if-ne v6, v0, :cond_a

    .line 138
    .line 139
    move v0, v6

    .line 140
    :goto_5
    move v6, v7

    .line 141
    goto :goto_6

    .line 142
    :cond_a
    add-int/lit8 v0, v6, 0x1

    .line 143
    .line 144
    aget-byte v6, v4, v6

    .line 145
    .line 146
    :goto_6
    if-gt v6, v3, :cond_c

    .line 147
    .line 148
    shl-long v12, v10, v6

    .line 149
    .line 150
    and-long/2addr v12, v8

    .line 151
    cmp-long v12, v12, v1

    .line 152
    .line 153
    if-eqz v12, :cond_c

    .line 154
    .line 155
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 156
    .line 157
    if-ne v0, v6, :cond_b

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_b
    add-int/lit8 v6, v0, 0x1

    .line 161
    .line 162
    aget-byte v0, v4, v0

    .line 163
    .line 164
    move v14, v6

    .line 165
    move v6, v0

    .line 166
    move v0, v14

    .line 167
    goto :goto_6

    .line 168
    :cond_c
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 169
    .line 170
    int-to-char v0, v6

    .line 171
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 172
    .line 173
    return v5

    .line 174
    :cond_d
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(I)Lcom/alibaba/fastjson2/JSONException;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    throw v0

    .line 179
    :cond_e
    move v3, v6

    .line 180
    goto :goto_1
.end method

.method public final skipValue()V
    .locals 20

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
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;->end:I

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 13
    .line 14
    const/16 v6, 0x7d

    .line 15
    .line 16
    const/16 v7, 0x5d

    .line 17
    .line 18
    const/16 v8, 0x27

    .line 19
    .line 20
    const/16 v11, 0x75

    .line 21
    .line 22
    const/16 v14, 0x22

    .line 23
    .line 24
    if-eq v2, v14, :cond_32

    .line 25
    .line 26
    if-eq v2, v8, :cond_32

    .line 27
    .line 28
    const/16 v8, 0x65

    .line 29
    .line 30
    const/16 v14, 0x53

    .line 31
    .line 32
    const/16 v15, 0x2e

    .line 33
    .line 34
    const-wide/16 v16, 0x0

    .line 35
    .line 36
    const/16 v9, 0x2d

    .line 37
    .line 38
    const/16 v10, 0x2b

    .line 39
    .line 40
    if-eq v2, v10, :cond_15

    .line 41
    .line 42
    const/16 v12, 0x66

    .line 43
    .line 44
    const/16 v13, 0x6c

    .line 45
    .line 46
    if-eq v2, v12, :cond_11

    .line 47
    .line 48
    const/16 v12, 0x6e

    .line 49
    .line 50
    if-eq v2, v12, :cond_d

    .line 51
    .line 52
    const/16 v12, 0x74

    .line 53
    .line 54
    if-eq v2, v12, :cond_9

    .line 55
    .line 56
    if-eq v2, v9, :cond_15

    .line 57
    .line 58
    if-eq v2, v15, :cond_15

    .line 59
    .line 60
    packed-switch v2, :pswitch_data_0

    .line 61
    .line 62
    .line 63
    const/16 v8, 0x5b

    .line 64
    .line 65
    if-ne v2, v8, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 68
    .line 69
    .line 70
    move v2, v5

    .line 71
    :goto_0
    iget-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 72
    .line 73
    if-ne v3, v7, :cond_1

    .line 74
    .line 75
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 76
    .line 77
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 78
    .line 79
    if-ne v2, v4, :cond_0

    .line 80
    .line 81
    :goto_1
    move v3, v2

    .line 82
    :goto_2
    const/16 v2, 0x1a

    .line 83
    .line 84
    goto/16 :goto_17

    .line 85
    .line 86
    :cond_0
    add-int/lit8 v3, v2, 0x1

    .line 87
    .line 88
    aget-byte v2, v1, v2

    .line 89
    .line 90
    goto/16 :goto_17

    .line 91
    .line 92
    :cond_1
    if-eqz v2, :cond_3

    .line 93
    .line 94
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->valueError()Lcom/alibaba/fastjson2/JSONException;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    throw v1

    .line 104
    :cond_3
    :goto_3
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipValue()V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    const/16 v8, 0x7b

    .line 113
    .line 114
    if-ne v2, v8, :cond_7

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->next()V

    .line 117
    .line 118
    .line 119
    :goto_4
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 120
    .line 121
    if-ne v2, v6, :cond_6

    .line 122
    .line 123
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 124
    .line 125
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 126
    .line 127
    if-ne v2, v4, :cond_5

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 131
    .line 132
    aget-byte v2, v1, v2

    .line 133
    .line 134
    goto/16 :goto_17

    .line 135
    .line 136
    :cond_6
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipName()Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipValue()V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    if-ne v2, v14, :cond_8

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfSet()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_8

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->skipValue()V

    .line 152
    .line 153
    .line 154
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 155
    .line 156
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 157
    .line 158
    goto/16 :goto_17

    .line 159
    .line 160
    :cond_8
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    throw v1

    .line 165
    :cond_9
    add-int/lit8 v5, v3, 0x3

    .line 166
    .line 167
    if-gt v5, v4, :cond_c

    .line 168
    .line 169
    aget-byte v9, v1, v3

    .line 170
    .line 171
    const/16 v10, 0x72

    .line 172
    .line 173
    if-ne v9, v10, :cond_b

    .line 174
    .line 175
    add-int/lit8 v9, v3, 0x1

    .line 176
    .line 177
    aget-byte v9, v1, v9

    .line 178
    .line 179
    if-ne v9, v11, :cond_b

    .line 180
    .line 181
    add-int/lit8 v9, v3, 0x2

    .line 182
    .line 183
    aget-byte v9, v1, v9

    .line 184
    .line 185
    if-ne v9, v8, :cond_b

    .line 186
    .line 187
    if-ne v5, v4, :cond_a

    .line 188
    .line 189
    :goto_5
    move v3, v5

    .line 190
    goto :goto_2

    .line 191
    :cond_a
    add-int/lit8 v3, v3, 0x4

    .line 192
    .line 193
    aget-byte v2, v1, v5

    .line 194
    .line 195
    goto/16 :goto_17

    .line 196
    .line 197
    :cond_b
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    throw v1

    .line 202
    :cond_c
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    throw v1

    .line 207
    :cond_d
    add-int/lit8 v5, v3, 0x3

    .line 208
    .line 209
    if-gt v5, v4, :cond_10

    .line 210
    .line 211
    aget-byte v8, v1, v3

    .line 212
    .line 213
    if-ne v8, v11, :cond_f

    .line 214
    .line 215
    add-int/lit8 v8, v3, 0x1

    .line 216
    .line 217
    aget-byte v8, v1, v8

    .line 218
    .line 219
    if-ne v8, v13, :cond_f

    .line 220
    .line 221
    add-int/lit8 v8, v3, 0x2

    .line 222
    .line 223
    aget-byte v8, v1, v8

    .line 224
    .line 225
    if-ne v8, v13, :cond_f

    .line 226
    .line 227
    if-ne v5, v4, :cond_e

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_e
    add-int/lit8 v3, v3, 0x4

    .line 231
    .line 232
    aget-byte v2, v1, v5

    .line 233
    .line 234
    goto/16 :goto_17

    .line 235
    .line 236
    :cond_f
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    throw v1

    .line 241
    :cond_10
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    throw v1

    .line 246
    :cond_11
    add-int/lit8 v5, v3, 0x4

    .line 247
    .line 248
    if-gt v5, v4, :cond_14

    .line 249
    .line 250
    aget-byte v9, v1, v3

    .line 251
    .line 252
    const/16 v10, 0x61

    .line 253
    .line 254
    if-ne v9, v10, :cond_13

    .line 255
    .line 256
    add-int/lit8 v9, v3, 0x1

    .line 257
    .line 258
    aget-byte v9, v1, v9

    .line 259
    .line 260
    if-ne v9, v13, :cond_13

    .line 261
    .line 262
    add-int/lit8 v9, v3, 0x2

    .line 263
    .line 264
    aget-byte v9, v1, v9

    .line 265
    .line 266
    const/16 v10, 0x73

    .line 267
    .line 268
    if-ne v9, v10, :cond_13

    .line 269
    .line 270
    add-int/lit8 v9, v3, 0x3

    .line 271
    .line 272
    aget-byte v9, v1, v9

    .line 273
    .line 274
    if-ne v9, v8, :cond_13

    .line 275
    .line 276
    if-ne v5, v4, :cond_12

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_12
    add-int/lit8 v3, v3, 0x5

    .line 280
    .line 281
    aget-byte v2, v1, v5

    .line 282
    .line 283
    goto/16 :goto_17

    .line 284
    .line 285
    :cond_13
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    throw v1

    .line 290
    :cond_14
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    throw v1

    .line 295
    :cond_15
    :pswitch_0
    if-eq v2, v9, :cond_16

    .line 296
    .line 297
    if-ne v2, v10, :cond_17

    .line 298
    .line 299
    :cond_16
    if-ge v3, v4, :cond_31

    .line 300
    .line 301
    add-int/lit8 v2, v3, 0x1

    .line 302
    .line 303
    aget-byte v3, v1, v3

    .line 304
    .line 305
    move/from16 v19, v3

    .line 306
    .line 307
    move v3, v2

    .line 308
    move/from16 v2, v19

    .line 309
    .line 310
    :cond_17
    if-ne v2, v15, :cond_18

    .line 311
    .line 312
    const/4 v11, 0x1

    .line 313
    goto :goto_6

    .line 314
    :cond_18
    move v11, v5

    .line 315
    :goto_6
    const/16 v12, 0x39

    .line 316
    .line 317
    const/16 v13, 0x30

    .line 318
    .line 319
    if-nez v11, :cond_1c

    .line 320
    .line 321
    if-lt v2, v13, :cond_1c

    .line 322
    .line 323
    if-gt v2, v12, :cond_1c

    .line 324
    .line 325
    :cond_19
    if-ne v3, v4, :cond_1a

    .line 326
    .line 327
    const/16 v2, 0x1a

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_1a
    add-int/lit8 v2, v3, 0x1

    .line 331
    .line 332
    aget-byte v3, v1, v3

    .line 333
    .line 334
    move/from16 v19, v3

    .line 335
    .line 336
    move v3, v2

    .line 337
    move/from16 v2, v19

    .line 338
    .line 339
    :goto_7
    if-lt v2, v13, :cond_1b

    .line 340
    .line 341
    if-le v2, v12, :cond_19

    .line 342
    .line 343
    :cond_1b
    const/4 v11, 0x1

    .line 344
    goto :goto_8

    .line 345
    :cond_1c
    move v11, v5

    .line 346
    :goto_8
    const/16 v5, 0x4c

    .line 347
    .line 348
    if-eqz v11, :cond_1e

    .line 349
    .line 350
    if-eq v2, v5, :cond_1d

    .line 351
    .line 352
    const/16 v7, 0x46

    .line 353
    .line 354
    if-eq v2, v7, :cond_1d

    .line 355
    .line 356
    const/16 v7, 0x44

    .line 357
    .line 358
    if-eq v2, v7, :cond_1d

    .line 359
    .line 360
    const/16 v7, 0x42

    .line 361
    .line 362
    if-eq v2, v7, :cond_1d

    .line 363
    .line 364
    if-ne v2, v14, :cond_1e

    .line 365
    .line 366
    :cond_1d
    add-int/lit8 v2, v3, 0x1

    .line 367
    .line 368
    aget-byte v3, v1, v3

    .line 369
    .line 370
    move/from16 v19, v3

    .line 371
    .line 372
    move v3, v2

    .line 373
    move/from16 v2, v19

    .line 374
    .line 375
    :cond_1e
    if-ne v2, v15, :cond_23

    .line 376
    .line 377
    if-ne v3, v4, :cond_1f

    .line 378
    .line 379
    const/16 v2, 0x1a

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_1f
    add-int/lit8 v2, v3, 0x1

    .line 383
    .line 384
    aget-byte v3, v1, v3

    .line 385
    .line 386
    move/from16 v19, v3

    .line 387
    .line 388
    move v3, v2

    .line 389
    move/from16 v2, v19

    .line 390
    .line 391
    :goto_9
    if-lt v2, v13, :cond_22

    .line 392
    .line 393
    if-gt v2, v12, :cond_22

    .line 394
    .line 395
    :cond_20
    if-ne v3, v4, :cond_21

    .line 396
    .line 397
    const/16 v2, 0x1a

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_21
    add-int/lit8 v2, v3, 0x1

    .line 401
    .line 402
    aget-byte v3, v1, v3

    .line 403
    .line 404
    move/from16 v19, v3

    .line 405
    .line 406
    move v3, v2

    .line 407
    move/from16 v2, v19

    .line 408
    .line 409
    :goto_a
    if-lt v2, v13, :cond_22

    .line 410
    .line 411
    if-le v2, v12, :cond_20

    .line 412
    .line 413
    :cond_22
    const/4 v7, 0x1

    .line 414
    goto :goto_b

    .line 415
    :cond_23
    const/4 v7, 0x0

    .line 416
    :goto_b
    if-nez v11, :cond_25

    .line 417
    .line 418
    if-eqz v7, :cond_24

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_24
    invoke-static {v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    throw v1

    .line 426
    :cond_25
    :goto_c
    if-eq v2, v8, :cond_26

    .line 427
    .line 428
    const/16 v7, 0x45

    .line 429
    .line 430
    if-ne v2, v7, :cond_2c

    .line 431
    .line 432
    :cond_26
    add-int/lit8 v2, v3, 0x1

    .line 433
    .line 434
    aget-byte v7, v1, v3

    .line 435
    .line 436
    if-eq v7, v10, :cond_28

    .line 437
    .line 438
    if-ne v7, v9, :cond_27

    .line 439
    .line 440
    goto :goto_d

    .line 441
    :cond_27
    const/16 v18, 0x0

    .line 442
    .line 443
    goto :goto_e

    .line 444
    :cond_28
    :goto_d
    if-ge v2, v4, :cond_30

    .line 445
    .line 446
    add-int/lit8 v3, v3, 0x2

    .line 447
    .line 448
    aget-byte v7, v1, v2

    .line 449
    .line 450
    move v2, v3

    .line 451
    const/16 v18, 0x1

    .line 452
    .line 453
    :goto_e
    if-lt v7, v13, :cond_2b

    .line 454
    .line 455
    if-gt v7, v12, :cond_2b

    .line 456
    .line 457
    :goto_f
    if-ne v2, v4, :cond_29

    .line 458
    .line 459
    move v3, v2

    .line 460
    const/16 v2, 0x1a

    .line 461
    .line 462
    goto :goto_10

    .line 463
    :cond_29
    add-int/lit8 v3, v2, 0x1

    .line 464
    .line 465
    aget-byte v2, v1, v2

    .line 466
    .line 467
    :goto_10
    if-lt v2, v13, :cond_2c

    .line 468
    .line 469
    if-le v2, v12, :cond_2a

    .line 470
    .line 471
    goto :goto_11

    .line 472
    :cond_2a
    move v2, v3

    .line 473
    goto :goto_f

    .line 474
    :cond_2b
    if-nez v18, :cond_2f

    .line 475
    .line 476
    move v3, v2

    .line 477
    move v2, v7

    .line 478
    :cond_2c
    :goto_11
    if-eq v2, v5, :cond_2d

    .line 479
    .line 480
    const/16 v5, 0x46

    .line 481
    .line 482
    if-eq v2, v5, :cond_2d

    .line 483
    .line 484
    const/16 v5, 0x44

    .line 485
    .line 486
    if-eq v2, v5, :cond_2d

    .line 487
    .line 488
    const/16 v5, 0x42

    .line 489
    .line 490
    if-eq v2, v5, :cond_2d

    .line 491
    .line 492
    if-ne v2, v14, :cond_3a

    .line 493
    .line 494
    :cond_2d
    if-ne v3, v4, :cond_2e

    .line 495
    .line 496
    :goto_12
    goto/16 :goto_2

    .line 497
    .line 498
    :cond_2e
    add-int/lit8 v2, v3, 0x1

    .line 499
    .line 500
    aget-byte v3, v1, v3

    .line 501
    .line 502
    :goto_13
    move/from16 v19, v3

    .line 503
    .line 504
    move v3, v2

    .line 505
    move/from16 v2, v19

    .line 506
    .line 507
    goto :goto_17

    .line 508
    :cond_2f
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    throw v1

    .line 513
    :cond_30
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    throw v1

    .line 518
    :cond_31
    invoke-static {v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    throw v1

    .line 523
    :cond_32
    const-wide/16 v16, 0x0

    .line 524
    .line 525
    if-ne v2, v8, :cond_34

    .line 526
    .line 527
    iget-object v5, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 528
    .line 529
    iget-wide v7, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 530
    .line 531
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 532
    .line 533
    iget-wide v9, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 534
    .line 535
    and-long/2addr v7, v9

    .line 536
    cmp-long v5, v7, v16

    .line 537
    .line 538
    if-nez v5, :cond_33

    .line 539
    .line 540
    goto :goto_14

    .line 541
    :cond_33
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    throw v1

    .line 546
    :cond_34
    :goto_14
    add-int/lit8 v5, v3, 0x1

    .line 547
    .line 548
    aget-byte v3, v1, v3

    .line 549
    .line 550
    :goto_15
    const/16 v7, 0x5c

    .line 551
    .line 552
    if-ne v3, v7, :cond_38

    .line 553
    .line 554
    add-int/lit8 v3, v5, 0x1

    .line 555
    .line 556
    aget-byte v7, v1, v5

    .line 557
    .line 558
    if-ne v7, v11, :cond_35

    .line 559
    .line 560
    add-int/lit8 v3, v5, 0x5

    .line 561
    .line 562
    goto :goto_16

    .line 563
    :cond_35
    const/16 v8, 0x78

    .line 564
    .line 565
    if-ne v7, v8, :cond_36

    .line 566
    .line 567
    add-int/lit8 v3, v5, 0x3

    .line 568
    .line 569
    goto :goto_16

    .line 570
    :cond_36
    const/16 v5, 0x5c

    .line 571
    .line 572
    if-eq v7, v5, :cond_37

    .line 573
    .line 574
    if-eq v7, v14, :cond_37

    .line 575
    .line 576
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 577
    .line 578
    .line 579
    :cond_37
    :goto_16
    add-int/lit8 v5, v3, 0x1

    .line 580
    .line 581
    aget-byte v3, v1, v3

    .line 582
    .line 583
    goto :goto_15

    .line 584
    :cond_38
    if-ne v3, v2, :cond_42

    .line 585
    .line 586
    if-ne v5, v4, :cond_39

    .line 587
    .line 588
    goto/16 :goto_5

    .line 589
    .line 590
    :cond_39
    add-int/lit8 v2, v5, 0x1

    .line 591
    .line 592
    aget-byte v3, v1, v5

    .line 593
    .line 594
    goto :goto_13

    .line 595
    :cond_3a
    :goto_17
    const/16 v5, 0x20

    .line 596
    .line 597
    if-gt v2, v5, :cond_3c

    .line 598
    .line 599
    const-wide/16 v7, 0x1

    .line 600
    .line 601
    shl-long/2addr v7, v2

    .line 602
    const-wide v9, 0x100003701L

    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    and-long/2addr v7, v9

    .line 608
    cmp-long v5, v7, v16

    .line 609
    .line 610
    if-eqz v5, :cond_3c

    .line 611
    .line 612
    if-ne v3, v4, :cond_3b

    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_3b
    add-int/lit8 v2, v3, 0x1

    .line 616
    .line 617
    aget-byte v3, v1, v3

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_3c
    const/16 v5, 0x2c

    .line 621
    .line 622
    if-ne v2, v5, :cond_3f

    .line 623
    .line 624
    const/4 v7, 0x1

    .line 625
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 626
    .line 627
    if-ne v3, v4, :cond_3d

    .line 628
    .line 629
    move v2, v3

    .line 630
    const/16 v3, 0x1a

    .line 631
    .line 632
    goto :goto_18

    .line 633
    :cond_3d
    add-int/lit8 v2, v3, 0x1

    .line 634
    .line 635
    aget-byte v3, v1, v3

    .line 636
    .line 637
    :goto_18
    move/from16 v19, v3

    .line 638
    .line 639
    move v3, v2

    .line 640
    move/from16 v2, v19

    .line 641
    .line 642
    :goto_19
    const/16 v5, 0x20

    .line 643
    .line 644
    if-gt v2, v5, :cond_3f

    .line 645
    .line 646
    const-wide/16 v7, 0x1

    .line 647
    .line 648
    shl-long/2addr v7, v2

    .line 649
    const-wide v9, 0x100003701L

    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    and-long/2addr v7, v9

    .line 655
    cmp-long v5, v7, v16

    .line 656
    .line 657
    if-eqz v5, :cond_3f

    .line 658
    .line 659
    if-ne v3, v4, :cond_3e

    .line 660
    .line 661
    const/16 v2, 0x1a

    .line 662
    .line 663
    goto :goto_19

    .line 664
    :cond_3e
    add-int/lit8 v2, v3, 0x1

    .line 665
    .line 666
    aget-byte v3, v1, v3

    .line 667
    .line 668
    goto :goto_18

    .line 669
    :cond_3f
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 670
    .line 671
    if-nez v1, :cond_41

    .line 672
    .line 673
    const/16 v8, 0x1a

    .line 674
    .line 675
    if-eq v2, v8, :cond_41

    .line 676
    .line 677
    if-eq v2, v6, :cond_41

    .line 678
    .line 679
    const/16 v9, 0x5d

    .line 680
    .line 681
    if-eq v2, v9, :cond_41

    .line 682
    .line 683
    if-ne v2, v8, :cond_40

    .line 684
    .line 685
    goto :goto_1a

    .line 686
    :cond_40
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    throw v1

    .line 691
    :cond_41
    :goto_1a
    int-to-char v1, v2

    .line 692
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 693
    .line 694
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 695
    .line 696
    return-void

    .line 697
    :cond_42
    const/4 v7, 0x1

    .line 698
    const/16 v8, 0x1a

    .line 699
    .line 700
    const/16 v9, 0x5d

    .line 701
    .line 702
    add-int/lit8 v3, v5, 0x1

    .line 703
    .line 704
    aget-byte v5, v1, v5

    .line 705
    .line 706
    move/from16 v19, v5

    .line 707
    .line 708
    move v5, v3

    .line 709
    move/from16 v3, v19

    .line 710
    .line 711
    goto/16 :goto_15

    .line 712
    .line 713
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
