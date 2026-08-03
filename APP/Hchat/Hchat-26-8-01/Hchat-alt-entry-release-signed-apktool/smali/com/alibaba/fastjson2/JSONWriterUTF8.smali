.class final Lcom/alibaba/fastjson2/JSONWriterUTF8;
.super Lcom/alibaba/fastjson2/JSONWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field protected bytes:[B

.field final cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

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
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 25
    .line 26
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 27
    .line 28
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [B

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/16 p1, 0x2000

    .line 37
    .line 38
    new-array p1, p1, [B

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 41
    .line 42
    return-void
.end method

.method private grow(I)[B
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow0(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 5
    .line 6
    return-object p1
.end method

.method private grow0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 13
    .line 14
    return-void
.end method

.method private indent([BI)I
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    aput-byte v0, p1, p2

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
    invoke-static {p1, p2, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 21
    .line 22
    .line 23
    return v2
.end method

.method private writeQuote()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    int-to-byte v2, v2

    .line 24
    aput-byte v2, v0, v1

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 23
    .line 24
    array-length v3, v0

    .line 25
    if-le v2, v3, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    invoke-direct {p0, v0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_2
    const/16 v2, 0x5d

    .line 40
    .line 41
    aput-byte v2, v0, v1

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 23
    .line 24
    array-length v3, v0

    .line 25
    if-le v2, v3, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    invoke-direct {p0, v0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_2
    const/16 v2, 0x7d

    .line 40
    .line 41
    aput-byte v2, v0, v1

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow0(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public flushTo(Ljava/io/OutputStream;)I
    .locals 3

    .line 67
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    if-lez v0, :cond_0

    .line 68
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 69
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    :cond_0
    return v0
.end method

.method public flushTo(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_4

    .line 3
    .line 4
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 5
    .line 6
    if-eq p2, v1, :cond_4

    .line 7
    .line 8
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    if-ne p2, v1, :cond_3

    .line 16
    .line 17
    move v1, v0

    .line 18
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    if-ge v1, v3, :cond_2

    .line 22
    .line 23
    aget-byte v2, v2, v1

    .line 24
    .line 25
    if-gez v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 32
    .line 33
    invoke-virtual {p1, v2, v0, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 37
    .line 38
    return p2

    .line 39
    :cond_3
    :goto_1
    new-instance v1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 42
    .line 43
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 44
    .line 45
    invoke-direct {v1, v2, v0, v3}, Ljava/lang/String;-><init>([BII)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 53
    .line 54
    .line 55
    array-length p1, p2

    .line 56
    return p1

    .line 57
    :cond_4
    :goto_2
    iget p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 60
    .line 61
    invoke-virtual {p1, v1, v0, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 62
    .line 63
    .line 64
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 65
    .line 66
    return p2
.end method

.method public getBytes()[B
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public getBytes(Ljava/nio/charset/Charset;)[B
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 27
    .line 28
    array-length v3, v1

    .line 29
    if-le v2, v3, :cond_1

    .line 30
    .line 31
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    aput-byte v3, v1, v0

    .line 40
    .line 41
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    .locals 4

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
    add-int/lit8 v1, v0, 0x3

    .line 21
    .line 22
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 23
    .line 24
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->level:I

    .line 25
    .line 26
    mul-int/2addr v2, v3

    .line 27
    add-int/2addr v2, v1

    .line 28
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 29
    .line 30
    array-length v3, v1

    .line 31
    if-le v2, v3, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    aput-byte v3, v1, v0

    .line 42
    .line 43
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 6
    .line 7
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v4, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public write(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 13

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Lcom/alibaba/fastjson2/JSONWriter;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 16
    .line 17
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 18
    .line 19
    sget-wide v4, Lcom/alibaba/fastjson2/JSONWriter;->NONE_DIRECT_FEATURES:J

    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v7

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v4, 0x0

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 47
    .line 48
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 49
    .line 50
    array-length v2, v2

    .line 51
    const/4 v9, 0x1

    .line 52
    if-ne v0, v2, :cond_3

    .line 53
    .line 54
    add-int/2addr v0, v9

    .line 55
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 59
    .line 60
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 61
    .line 62
    add-int/lit8 v3, v2, 0x1

    .line 63
    .line 64
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 65
    .line 66
    const/16 v3, 0x7b

    .line 67
    .line 68
    aput-byte v3, v0, v2

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    move v0, v9

    .line 79
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_11

    .line 84
    .line 85
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/util/Map$Entry;

    .line 90
    .line 91
    move-object v3, v2

    .line 92
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 99
    .line 100
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 101
    .line 102
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 103
    .line 104
    iget-wide v11, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 105
    .line 106
    and-long/2addr v4, v11

    .line 107
    cmp-long v4, v4, v7

    .line 108
    .line 109
    if-nez v4, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    if-nez v0, :cond_6

    .line 113
    .line 114
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 115
    .line 116
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 117
    .line 118
    array-length v4, v4

    .line 119
    if-ne v0, v4, :cond_5

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 124
    .line 125
    .line 126
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 127
    .line 128
    iget v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 129
    .line 130
    add-int/lit8 v5, v4, 0x1

    .line 131
    .line 132
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 133
    .line 134
    const/16 v5, 0x2c

    .line 135
    .line 136
    aput-byte v5, v0, v4

    .line 137
    .line 138
    :cond_6
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    instance-of v3, v0, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeAny(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :goto_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 156
    .line 157
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 158
    .line 159
    array-length v3, v3

    .line 160
    if-ne v0, v3, :cond_8

    .line 161
    .line 162
    add-int/lit8 v0, v0, 0x1

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 165
    .line 166
    .line 167
    :cond_8
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 168
    .line 169
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 170
    .line 171
    add-int/lit8 v4, v3, 0x1

    .line 172
    .line 173
    iput v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 174
    .line 175
    const/16 v4, 0x3a

    .line 176
    .line 177
    aput-byte v4, v0, v3

    .line 178
    .line 179
    if-nez v2, :cond_9

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const-class v3, Ljava/lang/String;

    .line 190
    .line 191
    if-ne v0, v3, :cond_a

    .line 192
    .line 193
    check-cast v2, Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_a
    const-class v3, Ljava/lang/Integer;

    .line 200
    .line 201
    if-ne v0, v3, :cond_b

    .line 202
    .line 203
    check-cast v2, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_b
    const-class v3, Ljava/lang/Long;

    .line 210
    .line 211
    if-ne v0, v3, :cond_c

    .line 212
    .line 213
    check-cast v2, Ljava/lang/Long;

    .line 214
    .line 215
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_c
    const-class v3, Ljava/lang/Boolean;

    .line 220
    .line 221
    if-ne v0, v3, :cond_d

    .line 222
    .line 223
    check-cast v2, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_d
    const-class v3, Ljava/math/BigDecimal;

    .line 234
    .line 235
    if-ne v0, v3, :cond_e

    .line 236
    .line 237
    check-cast v2, Ljava/math/BigDecimal;

    .line 238
    .line 239
    const/4 v0, 0x0

    .line 240
    invoke-virtual {p0, v2, v7, v8, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_e
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 245
    .line 246
    if-ne v0, v3, :cond_f

    .line 247
    .line 248
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 249
    .line 250
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->write(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_f
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 255
    .line 256
    if-ne v0, v3, :cond_10

    .line 257
    .line 258
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 259
    .line 260
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_10
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 265
    .line 266
    invoke-virtual {v3, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const/4 v4, 0x0

    .line 271
    const-wide/16 v5, 0x0

    .line 272
    .line 273
    const/4 v3, 0x0

    .line 274
    move-object v1, p0

    .line 275
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 276
    .line 277
    .line 278
    :goto_2
    const/4 v0, 0x0

    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_11
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 282
    .line 283
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 284
    .line 285
    array-length v2, v2

    .line 286
    if-ne v0, v2, :cond_12

    .line 287
    .line 288
    add-int/2addr v0, v9

    .line 289
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 290
    .line 291
    .line 292
    :cond_12
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 293
    .line 294
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 295
    .line 296
    add-int/lit8 v3, v2, 0x1

    .line 297
    .line 298
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 299
    .line 300
    const/16 v3, 0x7d

    .line 301
    .line 302
    aput-byte v3, v0, v2

    .line 303
    .line 304
    return-void
.end method

.method public write(Ljava/util/List;)V
    .locals 13

    if-nez p1, :cond_0

    .line 305
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    return-void

    .line 306
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v2, v4

    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v2, v4

    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v2, v4

    .line 307
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    and-long/2addr v2, v4

    const-wide/16 v7, 0x0

    cmp-long v2, v2, v7

    if-eqz v2, :cond_1

    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 309
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    return-void

    .line 310
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v2, v2

    const/4 v9, 0x1

    if-ne v0, v2, :cond_2

    add-int/2addr v0, v9

    .line 311
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 312
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v3, 0x5b

    aput-byte v3, v0, v2

    .line 313
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    move v0, v9

    move v12, v11

    :goto_0
    if-ge v12, v10, :cond_d

    if-nez v0, :cond_4

    .line 314
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v2, v2

    if-ne v0, v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    .line 315
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 316
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v3, 0x2c

    aput-byte v3, v0, v2

    .line 317
    :cond_4
    invoke-interface {p1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    .line 318
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    .line 319
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 320
    const-class v3, Ljava/lang/String;

    if-ne v0, v3, :cond_6

    .line 321
    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 322
    :cond_6
    const-class v3, Ljava/lang/Integer;

    if-ne v0, v3, :cond_7

    .line 323
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    goto :goto_1

    .line 324
    :cond_7
    const-class v3, Ljava/lang/Long;

    if-ne v0, v3, :cond_8

    .line 325
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    goto :goto_1

    .line 326
    :cond_8
    const-class v3, Ljava/lang/Boolean;

    if-ne v0, v3, :cond_9

    .line 327
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    goto :goto_1

    .line 328
    :cond_9
    const-class v3, Ljava/math/BigDecimal;

    if-ne v0, v3, :cond_a

    .line 329
    check-cast v2, Ljava/math/BigDecimal;

    const/4 v0, 0x0

    invoke-virtual {p0, v2, v7, v8, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    goto :goto_1

    .line 330
    :cond_a
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    if-ne v0, v3, :cond_b

    .line 331
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->write(Ljava/util/List;)V

    goto :goto_1

    .line 332
    :cond_b
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    if-ne v0, v3, :cond_c

    .line 333
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    goto :goto_1

    .line 334
    :cond_c
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-virtual {v3, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    .line 335
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    :goto_1
    add-int/lit8 v12, v12, 0x1

    move v0, v11

    goto/16 :goto_0

    .line 336
    :cond_d
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v2, v2

    if-ne v0, v2, :cond_e

    add-int/2addr v0, v9

    .line 337
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 338
    :cond_e
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v3, 0x5d

    aput-byte v3, v0, v2

    return-void
.end method

.method public final write0(C)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    int-to-byte p1, p1

    .line 16
    aput-byte p1, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 21
    .line 22
    return-void
.end method

.method public writeBase64([B)V
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    shl-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 22
    .line 23
    int-to-byte v4, v4

    .line 24
    aput-byte v4, v0, v2

    .line 25
    .line 26
    array-length v2, p1

    .line 27
    div-int/lit8 v2, v2, 0x3

    .line 28
    .line 29
    mul-int/lit8 v2, v2, 0x3

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    :goto_0
    if-ge v5, v2, :cond_0

    .line 34
    .line 35
    add-int/lit8 v6, v5, 0x1

    .line 36
    .line 37
    aget-byte v7, p1, v5

    .line 38
    .line 39
    and-int/lit16 v7, v7, 0xff

    .line 40
    .line 41
    shl-int/lit8 v7, v7, 0x10

    .line 42
    .line 43
    add-int/lit8 v8, v5, 0x2

    .line 44
    .line 45
    aget-byte v6, p1, v6

    .line 46
    .line 47
    and-int/lit16 v6, v6, 0xff

    .line 48
    .line 49
    shl-int/lit8 v6, v6, 0x8

    .line 50
    .line 51
    or-int/2addr v6, v7

    .line 52
    add-int/lit8 v5, v5, 0x3

    .line 53
    .line 54
    aget-byte v7, p1, v8

    .line 55
    .line 56
    and-int/lit16 v7, v7, 0xff

    .line 57
    .line 58
    or-int/2addr v6, v7

    .line 59
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->CA:[C

    .line 60
    .line 61
    ushr-int/lit8 v8, v6, 0x12

    .line 62
    .line 63
    and-int/lit8 v8, v8, 0x3f

    .line 64
    .line 65
    aget-char v8, v7, v8

    .line 66
    .line 67
    int-to-byte v8, v8

    .line 68
    aput-byte v8, v0, v3

    .line 69
    .line 70
    add-int/lit8 v8, v3, 0x1

    .line 71
    .line 72
    ushr-int/lit8 v9, v6, 0xc

    .line 73
    .line 74
    and-int/lit8 v9, v9, 0x3f

    .line 75
    .line 76
    aget-char v9, v7, v9

    .line 77
    .line 78
    int-to-byte v9, v9

    .line 79
    aput-byte v9, v0, v8

    .line 80
    .line 81
    add-int/lit8 v8, v3, 0x2

    .line 82
    .line 83
    ushr-int/lit8 v9, v6, 0x6

    .line 84
    .line 85
    and-int/lit8 v9, v9, 0x3f

    .line 86
    .line 87
    aget-char v9, v7, v9

    .line 88
    .line 89
    int-to-byte v9, v9

    .line 90
    aput-byte v9, v0, v8

    .line 91
    .line 92
    add-int/lit8 v8, v3, 0x3

    .line 93
    .line 94
    and-int/lit8 v6, v6, 0x3f

    .line 95
    .line 96
    aget-char v6, v7, v6

    .line 97
    .line 98
    int-to-byte v6, v6

    .line 99
    aput-byte v6, v0, v8

    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    array-length v5, p1

    .line 105
    sub-int/2addr v5, v2

    .line 106
    if-lez v5, :cond_3

    .line 107
    .line 108
    aget-byte v2, p1, v2

    .line 109
    .line 110
    and-int/lit16 v2, v2, 0xff

    .line 111
    .line 112
    shl-int/lit8 v2, v2, 0xa

    .line 113
    .line 114
    if-ne v5, v1, :cond_1

    .line 115
    .line 116
    array-length v4, p1

    .line 117
    add-int/lit8 v4, v4, -0x1

    .line 118
    .line 119
    aget-byte p1, p1, v4

    .line 120
    .line 121
    and-int/lit16 p1, p1, 0xff

    .line 122
    .line 123
    shl-int/lit8 v4, p1, 0x2

    .line 124
    .line 125
    :cond_1
    or-int p1, v2, v4

    .line 126
    .line 127
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CA:[C

    .line 128
    .line 129
    shr-int/lit8 v4, p1, 0xc

    .line 130
    .line 131
    aget-char v4, v2, v4

    .line 132
    .line 133
    int-to-byte v4, v4

    .line 134
    aput-byte v4, v0, v3

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
    int-to-byte v6, v6

    .line 145
    aput-byte v6, v0, v4

    .line 146
    .line 147
    add-int/lit8 v4, v3, 0x2

    .line 148
    .line 149
    const/16 v6, 0x3d

    .line 150
    .line 151
    if-ne v5, v1, :cond_2

    .line 152
    .line 153
    and-int/lit8 p1, p1, 0x3f

    .line 154
    .line 155
    aget-char p1, v2, p1

    .line 156
    .line 157
    int-to-byte p1, p1

    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move p1, v6

    .line 160
    :goto_1
    aput-byte p1, v0, v4

    .line 161
    .line 162
    add-int/lit8 p1, v3, 0x3

    .line 163
    .line 164
    aput-byte v6, v0, p1

    .line 165
    .line 166
    add-int/lit8 v3, v3, 0x4

    .line 167
    .line 168
    :cond_3
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 169
    .line 170
    int-to-byte p1, p1

    .line 171
    aput-byte p1, v0, v3

    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 176
    .line 177
    return-void
.end method

.method public writeBigInt(Ljava/math/BigInteger;J)V
    .locals 3

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
    and-long/2addr p2, v1

    .line 23
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    cmp-long p2, p2, v1

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->LOW_BIGINT:Ljava/math/BigInteger;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-ltz p2, :cond_1

    .line 36
    .line 37
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->HIGH_BIGINT:Ljava/math/BigInteger;

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-lez p1, :cond_2

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 54
    .line 55
    add-int/2addr p2, p1

    .line 56
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 57
    .line 58
    array-length p3, p3

    .line 59
    if-lt p2, p3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 65
    .line 66
    iget p3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-virtual {v0, v1, p1, p2, p3}, Ljava/lang/String;->getBytes(II[BI)V

    .line 70
    .line 71
    .line 72
    iget p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 73
    .line 74
    add-int/2addr p2, p1

    .line 75
    iput p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 76
    .line 77
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    int-to-byte v4, v3

    .line 20
    aput-byte v4, v1, v0

    .line 21
    .line 22
    const/16 v4, 0x7f

    .line 23
    .line 24
    if-gt p1, v4, :cond_3

    .line 25
    .line 26
    const/16 v4, 0x5c

    .line 27
    .line 28
    if-eq p1, v4, :cond_2

    .line 29
    .line 30
    const/16 v5, 0x31

    .line 31
    .line 32
    const/16 v6, 0x75

    .line 33
    .line 34
    const/16 v7, 0x30

    .line 35
    .line 36
    packed-switch p1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    if-ne p1, v3, :cond_1

    .line 40
    .line 41
    aput-byte v4, v1, v2

    .line 42
    .line 43
    add-int/lit8 p1, v0, 0x2

    .line 44
    .line 45
    int-to-byte v2, v3

    .line 46
    aput-byte v2, v1, p1

    .line 47
    .line 48
    :goto_0
    add-int/lit8 v0, v0, 0x3

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_1
    add-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    int-to-byte p1, p1

    .line 55
    aput-byte p1, v1, v2

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_0
    aput-byte v4, v1, v2

    .line 60
    .line 61
    add-int/lit8 v2, v0, 0x2

    .line 62
    .line 63
    aput-byte v6, v1, v2

    .line 64
    .line 65
    add-int/lit8 v2, v0, 0x3

    .line 66
    .line 67
    aput-byte v7, v1, v2

    .line 68
    .line 69
    add-int/lit8 v2, v0, 0x4

    .line 70
    .line 71
    aput-byte v7, v1, v2

    .line 72
    .line 73
    add-int/lit8 v2, v0, 0x5

    .line 74
    .line 75
    aput-byte v5, v1, v2

    .line 76
    .line 77
    add-int/lit8 v2, v0, 0x6

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x47

    .line 80
    .line 81
    int-to-byte p1, p1

    .line 82
    aput-byte p1, v1, v2

    .line 83
    .line 84
    :goto_1
    add-int/lit8 v0, v0, 0x7

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_1
    aput-byte v4, v1, v2

    .line 89
    .line 90
    add-int/lit8 v2, v0, 0x2

    .line 91
    .line 92
    aput-byte v6, v1, v2

    .line 93
    .line 94
    add-int/lit8 v2, v0, 0x3

    .line 95
    .line 96
    aput-byte v7, v1, v2

    .line 97
    .line 98
    add-int/lit8 v2, v0, 0x4

    .line 99
    .line 100
    aput-byte v7, v1, v2

    .line 101
    .line 102
    add-int/lit8 v2, v0, 0x5

    .line 103
    .line 104
    aput-byte v5, v1, v2

    .line 105
    .line 106
    add-int/lit8 v2, v0, 0x6

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x20

    .line 109
    .line 110
    int-to-byte p1, p1

    .line 111
    aput-byte p1, v1, v2

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_2
    aput-byte v4, v1, v2

    .line 115
    .line 116
    add-int/lit8 p1, v0, 0x2

    .line 117
    .line 118
    const/16 v2, 0x72

    .line 119
    .line 120
    aput-byte v2, v1, p1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_3
    aput-byte v4, v1, v2

    .line 124
    .line 125
    add-int/lit8 p1, v0, 0x2

    .line 126
    .line 127
    const/16 v2, 0x66

    .line 128
    .line 129
    aput-byte v2, v1, p1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_4
    aput-byte v4, v1, v2

    .line 133
    .line 134
    add-int/lit8 v2, v0, 0x2

    .line 135
    .line 136
    aput-byte v6, v1, v2

    .line 137
    .line 138
    add-int/lit8 v2, v0, 0x3

    .line 139
    .line 140
    aput-byte v7, v1, v2

    .line 141
    .line 142
    add-int/lit8 v2, v0, 0x4

    .line 143
    .line 144
    aput-byte v7, v1, v2

    .line 145
    .line 146
    add-int/lit8 v2, v0, 0x5

    .line 147
    .line 148
    aput-byte v7, v1, v2

    .line 149
    .line 150
    add-int/lit8 v2, v0, 0x6

    .line 151
    .line 152
    add-int/lit8 p1, p1, 0x57

    .line 153
    .line 154
    int-to-byte p1, p1

    .line 155
    aput-byte p1, v1, v2

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_5
    aput-byte v4, v1, v2

    .line 159
    .line 160
    add-int/lit8 p1, v0, 0x2

    .line 161
    .line 162
    const/16 v2, 0x6e

    .line 163
    .line 164
    aput-byte v2, v1, p1

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :pswitch_6
    aput-byte v4, v1, v2

    .line 168
    .line 169
    add-int/lit8 p1, v0, 0x2

    .line 170
    .line 171
    const/16 v2, 0x74

    .line 172
    .line 173
    aput-byte v2, v1, p1

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_7
    aput-byte v4, v1, v2

    .line 177
    .line 178
    add-int/lit8 p1, v0, 0x2

    .line 179
    .line 180
    const/16 v2, 0x62

    .line 181
    .line 182
    aput-byte v2, v1, p1

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_8
    aput-byte v4, v1, v2

    .line 187
    .line 188
    add-int/lit8 v2, v0, 0x2

    .line 189
    .line 190
    aput-byte v6, v1, v2

    .line 191
    .line 192
    add-int/lit8 v2, v0, 0x3

    .line 193
    .line 194
    aput-byte v7, v1, v2

    .line 195
    .line 196
    add-int/lit8 v2, v0, 0x4

    .line 197
    .line 198
    aput-byte v7, v1, v2

    .line 199
    .line 200
    add-int/lit8 v2, v0, 0x5

    .line 201
    .line 202
    aput-byte v7, v1, v2

    .line 203
    .line 204
    add-int/lit8 v2, v0, 0x6

    .line 205
    .line 206
    add-int/2addr p1, v7

    .line 207
    int-to-byte p1, p1

    .line 208
    aput-byte p1, v1, v2

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_2
    aput-byte v4, v1, v2

    .line 212
    .line 213
    add-int/lit8 p1, v0, 0x2

    .line 214
    .line 215
    aput-byte v4, v1, p1

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_3
    const v4, 0xd800

    .line 220
    .line 221
    .line 222
    if-lt p1, v4, :cond_5

    .line 223
    .line 224
    const v4, 0xe000

    .line 225
    .line 226
    .line 227
    if-lt p1, v4, :cond_4

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    const-string v0, "illegal char "

    .line 231
    .line 232
    invoke-static {p1, v0}, Lah/a;->g(ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_5
    :goto_2
    const/16 v4, 0x7ff

    .line 237
    .line 238
    if-le p1, v4, :cond_6

    .line 239
    .line 240
    shr-int/lit8 v4, p1, 0xc

    .line 241
    .line 242
    and-int/lit8 v4, v4, 0xf

    .line 243
    .line 244
    or-int/lit16 v4, v4, 0xe0

    .line 245
    .line 246
    int-to-byte v4, v4

    .line 247
    aput-byte v4, v1, v2

    .line 248
    .line 249
    add-int/lit8 v2, v0, 0x2

    .line 250
    .line 251
    shr-int/lit8 v4, p1, 0x6

    .line 252
    .line 253
    and-int/lit8 v4, v4, 0x3f

    .line 254
    .line 255
    or-int/lit16 v4, v4, 0x80

    .line 256
    .line 257
    int-to-byte v4, v4

    .line 258
    aput-byte v4, v1, v2

    .line 259
    .line 260
    add-int/lit8 v2, v0, 0x3

    .line 261
    .line 262
    and-int/lit8 p1, p1, 0x3f

    .line 263
    .line 264
    or-int/lit16 p1, p1, 0x80

    .line 265
    .line 266
    int-to-byte p1, p1

    .line 267
    aput-byte p1, v1, v2

    .line 268
    .line 269
    add-int/lit8 v0, v0, 0x4

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_6
    shr-int/lit8 v4, p1, 0x6

    .line 273
    .line 274
    and-int/lit8 v4, v4, 0x1f

    .line 275
    .line 276
    or-int/lit16 v4, v4, 0xc0

    .line 277
    .line 278
    int-to-byte v4, v4

    .line 279
    aput-byte v4, v1, v2

    .line 280
    .line 281
    add-int/lit8 v2, v0, 0x2

    .line 282
    .line 283
    and-int/lit8 p1, p1, 0x3f

    .line 284
    .line 285
    or-int/lit16 p1, p1, 0x80

    .line 286
    .line 287
    int-to-byte p1, p1

    .line 288
    aput-byte p1, v1, v2

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :goto_3
    int-to-byte p1, v3

    .line 293
    aput-byte p1, v1, v0

    .line 294
    .line 295
    add-int/lit8 v0, v0, 0x1

    .line 296
    .line 297
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 298
    .line 299
    return-void

    .line 300
    nop

    .line 301
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    const/16 v2, 0x3a

    .line 16
    .line 17
    aput-byte v2, v1, v0

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 15
    .line 16
    array-length v3, v1

    .line 17
    if-le v2, v3, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    aput-byte v3, v1, v0

    .line 28
    .line 29
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x270f

    .line 23
    .line 24
    if-gt p1, v4, :cond_1

    .line 25
    .line 26
    div-int/lit16 v4, p1, 0x3e8

    .line 27
    .line 28
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 29
    .line 30
    mul-int/lit16 v6, v4, 0x3e8

    .line 31
    .line 32
    sub-int/2addr p1, v6

    .line 33
    aget p1, v5, p1

    .line 34
    .line 35
    add-int/lit8 v6, v0, 0x1

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x30

    .line 38
    .line 39
    int-to-byte v4, v4

    .line 40
    aput-byte v4, v2, v6

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
    aput-byte v6, v2, v4

    .line 48
    .line 49
    add-int/lit8 v4, v0, 0x3

    .line 50
    .line 51
    shr-int/lit8 v6, p1, 0x8

    .line 52
    .line 53
    int-to-byte v6, v6

    .line 54
    aput-byte v6, v2, v4

    .line 55
    .line 56
    add-int/lit8 v4, v0, 0x4

    .line 57
    .line 58
    int-to-byte p1, p1

    .line 59
    aput-byte p1, v2, v4

    .line 60
    .line 61
    aget p1, v5, p2

    .line 62
    .line 63
    add-int/lit8 p2, v0, 0x5

    .line 64
    .line 65
    shr-int/lit8 v4, p1, 0x8

    .line 66
    .line 67
    int-to-byte v4, v4

    .line 68
    aput-byte v4, v2, p2

    .line 69
    .line 70
    add-int/lit8 p2, v0, 0x6

    .line 71
    .line 72
    int-to-byte p1, p1

    .line 73
    aput-byte p1, v2, p2

    .line 74
    .line 75
    aget p1, v5, p3

    .line 76
    .line 77
    add-int/lit8 p2, v0, 0x7

    .line 78
    .line 79
    shr-int/lit8 p3, p1, 0x8

    .line 80
    .line 81
    int-to-byte p3, p3

    .line 82
    aput-byte p3, v2, p2

    .line 83
    .line 84
    add-int/lit8 p2, v0, 0x8

    .line 85
    .line 86
    int-to-byte p1, p1

    .line 87
    aput-byte p1, v2, p2

    .line 88
    .line 89
    aget p1, v5, p4

    .line 90
    .line 91
    add-int/lit8 p2, v0, 0x9

    .line 92
    .line 93
    shr-int/lit8 p3, p1, 0x8

    .line 94
    .line 95
    int-to-byte p3, p3

    .line 96
    aput-byte p3, v2, p2

    .line 97
    .line 98
    add-int/lit8 p2, v0, 0xa

    .line 99
    .line 100
    int-to-byte p1, p1

    .line 101
    aput-byte p1, v2, p2

    .line 102
    .line 103
    aget p1, v5, p5

    .line 104
    .line 105
    add-int/lit8 p2, v0, 0xb

    .line 106
    .line 107
    shr-int/lit8 p3, p1, 0x8

    .line 108
    .line 109
    int-to-byte p3, p3

    .line 110
    aput-byte p3, v2, p2

    .line 111
    .line 112
    add-int/lit8 p2, v0, 0xc

    .line 113
    .line 114
    int-to-byte p1, p1

    .line 115
    aput-byte p1, v2, p2

    .line 116
    .line 117
    aget p1, v5, p6

    .line 118
    .line 119
    add-int/lit8 p2, v0, 0xd

    .line 120
    .line 121
    shr-int/lit8 p3, p1, 0x8

    .line 122
    .line 123
    int-to-byte p3, p3

    .line 124
    aput-byte p3, v2, p2

    .line 125
    .line 126
    add-int/lit8 p2, v0, 0xe

    .line 127
    .line 128
    int-to-byte p1, p1

    .line 129
    aput-byte p1, v2, p2

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0xf

    .line 132
    .line 133
    int-to-byte p1, v3

    .line 134
    aput-byte p1, v2, v0

    .line 135
    .line 136
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 137
    .line 138
    return-void

    .line 139
    :cond_1
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 140
    .line 141
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public writeDateTime19(IIIIII)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x15

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x270f

    .line 23
    .line 24
    if-gt p1, v4, :cond_1

    .line 25
    .line 26
    div-int/lit16 v4, p1, 0x3e8

    .line 27
    .line 28
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 29
    .line 30
    mul-int/lit16 v6, v4, 0x3e8

    .line 31
    .line 32
    sub-int/2addr p1, v6

    .line 33
    aget p1, v5, p1

    .line 34
    .line 35
    add-int/lit8 v6, v0, 0x1

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x30

    .line 38
    .line 39
    int-to-byte v4, v4

    .line 40
    aput-byte v4, v2, v6

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
    aput-byte v6, v2, v4

    .line 48
    .line 49
    add-int/lit8 v4, v0, 0x3

    .line 50
    .line 51
    shr-int/lit8 v6, p1, 0x8

    .line 52
    .line 53
    int-to-byte v6, v6

    .line 54
    aput-byte v6, v2, v4

    .line 55
    .line 56
    add-int/lit8 v4, v0, 0x4

    .line 57
    .line 58
    int-to-byte p1, p1

    .line 59
    aput-byte p1, v2, v4

    .line 60
    .line 61
    add-int/lit8 p1, v0, 0x5

    .line 62
    .line 63
    const/16 v4, 0x2d

    .line 64
    .line 65
    aput-byte v4, v2, p1

    .line 66
    .line 67
    aget p1, v5, p2

    .line 68
    .line 69
    add-int/lit8 p2, v0, 0x6

    .line 70
    .line 71
    shr-int/lit8 v6, p1, 0x8

    .line 72
    .line 73
    int-to-byte v6, v6

    .line 74
    aput-byte v6, v2, p2

    .line 75
    .line 76
    add-int/lit8 p2, v0, 0x7

    .line 77
    .line 78
    int-to-byte p1, p1

    .line 79
    aput-byte p1, v2, p2

    .line 80
    .line 81
    add-int/lit8 p1, v0, 0x8

    .line 82
    .line 83
    aput-byte v4, v2, p1

    .line 84
    .line 85
    aget p1, v5, p3

    .line 86
    .line 87
    add-int/lit8 p2, v0, 0x9

    .line 88
    .line 89
    shr-int/lit8 p3, p1, 0x8

    .line 90
    .line 91
    int-to-byte p3, p3

    .line 92
    aput-byte p3, v2, p2

    .line 93
    .line 94
    add-int/lit8 p2, v0, 0xa

    .line 95
    .line 96
    int-to-byte p1, p1

    .line 97
    aput-byte p1, v2, p2

    .line 98
    .line 99
    add-int/lit8 p1, v0, 0xb

    .line 100
    .line 101
    const/16 p2, 0x20

    .line 102
    .line 103
    aput-byte p2, v2, p1

    .line 104
    .line 105
    aget p1, v5, p4

    .line 106
    .line 107
    add-int/lit8 p2, v0, 0xc

    .line 108
    .line 109
    shr-int/lit8 p3, p1, 0x8

    .line 110
    .line 111
    int-to-byte p3, p3

    .line 112
    aput-byte p3, v2, p2

    .line 113
    .line 114
    add-int/lit8 p2, v0, 0xd

    .line 115
    .line 116
    int-to-byte p1, p1

    .line 117
    aput-byte p1, v2, p2

    .line 118
    .line 119
    add-int/lit8 p1, v0, 0xe

    .line 120
    .line 121
    const/16 p2, 0x3a

    .line 122
    .line 123
    aput-byte p2, v2, p1

    .line 124
    .line 125
    aget p1, v5, p5

    .line 126
    .line 127
    add-int/lit8 p3, v0, 0xf

    .line 128
    .line 129
    shr-int/lit8 p4, p1, 0x8

    .line 130
    .line 131
    int-to-byte p4, p4

    .line 132
    aput-byte p4, v2, p3

    .line 133
    .line 134
    add-int/lit8 p3, v0, 0x10

    .line 135
    .line 136
    int-to-byte p1, p1

    .line 137
    aput-byte p1, v2, p3

    .line 138
    .line 139
    add-int/lit8 p1, v0, 0x11

    .line 140
    .line 141
    aput-byte p2, v2, p1

    .line 142
    .line 143
    aget p1, v5, p6

    .line 144
    .line 145
    add-int/lit8 p2, v0, 0x12

    .line 146
    .line 147
    shr-int/lit8 p3, p1, 0x8

    .line 148
    .line 149
    int-to-byte p3, p3

    .line 150
    aput-byte p3, v2, p2

    .line 151
    .line 152
    add-int/lit8 p2, v0, 0x13

    .line 153
    .line 154
    int-to-byte p1, p1

    .line 155
    aput-byte p1, v2, p2

    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x14

    .line 158
    .line 159
    int-to-byte p1, v3

    .line 160
    aput-byte p1, v2, v0

    .line 161
    .line 162
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 163
    .line 164
    return-void

    .line 165
    :cond_1
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 166
    .line 167
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
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
    add-int/lit8 v2, v2, 0x19

    .line 14
    .line 15
    add-int/2addr v2, v1

    .line 16
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 17
    .line 18
    array-length v1, v1

    .line 19
    if-lt v2, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 22
    .line 23
    .line 24
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 25
    .line 26
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 27
    .line 28
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 29
    .line 30
    int-to-byte v3, v3

    .line 31
    aput-byte v3, v1, v2

    .line 32
    .line 33
    add-int/2addr v2, v0

    .line 34
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/16 v2, 0x2d

    .line 39
    .line 40
    aput-byte v2, v1, p1

    .line 41
    .line 42
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 43
    .line 44
    aget p2, v3, p2

    .line 45
    .line 46
    add-int/lit8 v4, p1, 0x1

    .line 47
    .line 48
    shr-int/lit8 v5, p2, 0x8

    .line 49
    .line 50
    int-to-byte v5, v5

    .line 51
    aput-byte v5, v1, v4

    .line 52
    .line 53
    add-int/lit8 v4, p1, 0x2

    .line 54
    .line 55
    int-to-byte p2, p2

    .line 56
    aput-byte p2, v1, v4

    .line 57
    .line 58
    add-int/lit8 p2, p1, 0x3

    .line 59
    .line 60
    aput-byte v2, v1, p2

    .line 61
    .line 62
    aget p2, v3, p3

    .line 63
    .line 64
    add-int/lit8 p3, p1, 0x4

    .line 65
    .line 66
    shr-int/lit8 v4, p2, 0x8

    .line 67
    .line 68
    int-to-byte v4, v4

    .line 69
    aput-byte v4, v1, p3

    .line 70
    .line 71
    add-int/lit8 p3, p1, 0x5

    .line 72
    .line 73
    int-to-byte p2, p2

    .line 74
    aput-byte p2, v1, p3

    .line 75
    .line 76
    add-int/lit8 p2, p1, 0x6

    .line 77
    .line 78
    if-eqz p9, :cond_3

    .line 79
    .line 80
    const/16 p3, 0x54

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/16 p3, 0x20

    .line 84
    .line 85
    :goto_1
    int-to-byte p3, p3

    .line 86
    aput-byte p3, v1, p2

    .line 87
    .line 88
    aget p2, v3, p4

    .line 89
    .line 90
    add-int/lit8 p3, p1, 0x7

    .line 91
    .line 92
    shr-int/lit8 p4, p2, 0x8

    .line 93
    .line 94
    int-to-byte p4, p4

    .line 95
    aput-byte p4, v1, p3

    .line 96
    .line 97
    add-int/lit8 p3, p1, 0x8

    .line 98
    .line 99
    int-to-byte p2, p2

    .line 100
    aput-byte p2, v1, p3

    .line 101
    .line 102
    add-int/lit8 p2, p1, 0x9

    .line 103
    .line 104
    const/16 p3, 0x3a

    .line 105
    .line 106
    aput-byte p3, v1, p2

    .line 107
    .line 108
    aget p2, v3, p5

    .line 109
    .line 110
    add-int/lit8 p4, p1, 0xa

    .line 111
    .line 112
    shr-int/lit8 p5, p2, 0x8

    .line 113
    .line 114
    int-to-byte p5, p5

    .line 115
    aput-byte p5, v1, p4

    .line 116
    .line 117
    add-int/lit8 p4, p1, 0xb

    .line 118
    .line 119
    int-to-byte p2, p2

    .line 120
    aput-byte p2, v1, p4

    .line 121
    .line 122
    add-int/lit8 p2, p1, 0xc

    .line 123
    .line 124
    aput-byte p3, v1, p2

    .line 125
    .line 126
    aget p2, v3, p6

    .line 127
    .line 128
    add-int/lit8 p4, p1, 0xd

    .line 129
    .line 130
    shr-int/lit8 p5, p2, 0x8

    .line 131
    .line 132
    int-to-byte p5, p5

    .line 133
    aput-byte p5, v1, p4

    .line 134
    .line 135
    add-int/lit8 p4, p1, 0xe

    .line 136
    .line 137
    int-to-byte p2, p2

    .line 138
    aput-byte p2, v1, p4

    .line 139
    .line 140
    add-int/lit8 p2, p1, 0xf

    .line 141
    .line 142
    if-lez p7, :cond_6

    .line 143
    .line 144
    add-int/lit8 p4, p1, 0x10

    .line 145
    .line 146
    const/16 p5, 0x2e

    .line 147
    .line 148
    aput-byte p5, v1, p2

    .line 149
    .line 150
    div-int/lit8 p2, p7, 0xa

    .line 151
    .line 152
    div-int/lit8 p5, p2, 0xa

    .line 153
    .line 154
    mul-int/lit8 p6, p2, 0xa

    .line 155
    .line 156
    sub-int p6, p7, p6

    .line 157
    .line 158
    if-eqz p6, :cond_4

    .line 159
    .line 160
    aget p2, v3, p7

    .line 161
    .line 162
    shr-int/lit8 p5, p2, 0x10

    .line 163
    .line 164
    int-to-byte p5, p5

    .line 165
    aput-byte p5, v1, p4

    .line 166
    .line 167
    add-int/lit8 p4, p1, 0x11

    .line 168
    .line 169
    shr-int/lit8 p5, p2, 0x8

    .line 170
    .line 171
    int-to-byte p5, p5

    .line 172
    aput-byte p5, v1, p4

    .line 173
    .line 174
    add-int/lit8 p4, p1, 0x12

    .line 175
    .line 176
    int-to-byte p2, p2

    .line 177
    aput-byte p2, v1, p4

    .line 178
    .line 179
    add-int/lit8 p2, p1, 0x13

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    mul-int/lit8 p6, p5, 0xa

    .line 183
    .line 184
    sub-int p6, p2, p6

    .line 185
    .line 186
    if-eqz p6, :cond_5

    .line 187
    .line 188
    aget p2, v3, p2

    .line 189
    .line 190
    shr-int/lit8 p5, p2, 0x8

    .line 191
    .line 192
    int-to-byte p5, p5

    .line 193
    aput-byte p5, v1, p4

    .line 194
    .line 195
    add-int/lit8 p4, p1, 0x11

    .line 196
    .line 197
    int-to-byte p2, p2

    .line 198
    aput-byte p2, v1, p4

    .line 199
    .line 200
    add-int/lit8 p2, p1, 0x12

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_5
    add-int/lit8 p2, p1, 0x11

    .line 204
    .line 205
    add-int/lit8 p5, p5, 0x30

    .line 206
    .line 207
    int-to-byte p1, p5

    .line 208
    aput-byte p1, v1, p4

    .line 209
    .line 210
    :cond_6
    :goto_2
    if-eqz p9, :cond_a

    .line 211
    .line 212
    div-int/lit16 p1, p8, 0xe10

    .line 213
    .line 214
    if-nez p8, :cond_7

    .line 215
    .line 216
    add-int/lit8 p1, p2, 0x1

    .line 217
    .line 218
    const/16 p3, 0x5a

    .line 219
    .line 220
    aput-byte p3, v1, p2

    .line 221
    .line 222
    move p2, p1

    .line 223
    goto :goto_3

    .line 224
    :cond_7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 225
    .line 226
    .line 227
    move-result p4

    .line 228
    if-ltz p1, :cond_8

    .line 229
    .line 230
    const/16 v2, 0x2b

    .line 231
    .line 232
    :cond_8
    aput-byte v2, v1, p2

    .line 233
    .line 234
    aget p4, v3, p4

    .line 235
    .line 236
    add-int/lit8 p5, p2, 0x1

    .line 237
    .line 238
    shr-int/lit8 p6, p4, 0x8

    .line 239
    .line 240
    int-to-byte p6, p6

    .line 241
    aput-byte p6, v1, p5

    .line 242
    .line 243
    add-int/lit8 p5, p2, 0x2

    .line 244
    .line 245
    int-to-byte p4, p4

    .line 246
    aput-byte p4, v1, p5

    .line 247
    .line 248
    add-int/lit8 p4, p2, 0x3

    .line 249
    .line 250
    aput-byte p3, v1, p4

    .line 251
    .line 252
    mul-int/lit16 p1, p1, 0xe10

    .line 253
    .line 254
    sub-int/2addr p8, p1

    .line 255
    div-int/lit8 p8, p8, 0x3c

    .line 256
    .line 257
    if-gez p8, :cond_9

    .line 258
    .line 259
    neg-int p8, p8

    .line 260
    :cond_9
    aget p1, v3, p8

    .line 261
    .line 262
    add-int/lit8 p3, p2, 0x4

    .line 263
    .line 264
    shr-int/lit8 p4, p1, 0x8

    .line 265
    .line 266
    int-to-byte p4, p4

    .line 267
    aput-byte p4, v1, p3

    .line 268
    .line 269
    add-int/lit8 p3, p2, 0x5

    .line 270
    .line 271
    int-to-byte p1, p1

    .line 272
    aput-byte p1, v1, p3

    .line 273
    .line 274
    add-int/lit8 p2, p2, 0x6

    .line 275
    .line 276
    :cond_a
    :goto_3
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 277
    .line 278
    int-to-byte p1, p1

    .line 279
    aput-byte p1, v1, p2

    .line 280
    .line 281
    add-int/2addr p2, v0

    .line 282
    iput p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 283
    .line 284
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    int-to-byte v3, v3

    .line 20
    aput-byte v3, v1, v0

    .line 21
    .line 22
    invoke-static {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 27
    .line 28
    int-to-byte p2, p2

    .line 29
    aput-byte p2, v1, p1

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 34
    .line 35
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x270f

    .line 23
    .line 24
    if-gt p1, v4, :cond_1

    .line 25
    .line 26
    div-int/lit16 v4, p1, 0x3e8

    .line 27
    .line 28
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 29
    .line 30
    mul-int/lit16 v6, v4, 0x3e8

    .line 31
    .line 32
    sub-int/2addr p1, v6

    .line 33
    aget p1, v5, p1

    .line 34
    .line 35
    add-int/lit8 v6, v0, 0x1

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x30

    .line 38
    .line 39
    int-to-byte v4, v4

    .line 40
    aput-byte v4, v2, v6

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
    aput-byte v6, v2, v4

    .line 48
    .line 49
    add-int/lit8 v4, v0, 0x3

    .line 50
    .line 51
    shr-int/lit8 v6, p1, 0x8

    .line 52
    .line 53
    int-to-byte v6, v6

    .line 54
    aput-byte v6, v2, v4

    .line 55
    .line 56
    add-int/lit8 v4, v0, 0x4

    .line 57
    .line 58
    int-to-byte p1, p1

    .line 59
    aput-byte p1, v2, v4

    .line 60
    .line 61
    aget p1, v5, p2

    .line 62
    .line 63
    add-int/lit8 p2, v0, 0x5

    .line 64
    .line 65
    shr-int/lit8 v4, p1, 0x8

    .line 66
    .line 67
    int-to-byte v4, v4

    .line 68
    aput-byte v4, v2, p2

    .line 69
    .line 70
    add-int/lit8 p2, v0, 0x6

    .line 71
    .line 72
    int-to-byte p1, p1

    .line 73
    aput-byte p1, v2, p2

    .line 74
    .line 75
    aget p1, v5, p3

    .line 76
    .line 77
    add-int/lit8 p2, v0, 0x7

    .line 78
    .line 79
    shr-int/lit8 p3, p1, 0x8

    .line 80
    .line 81
    int-to-byte p3, p3

    .line 82
    aput-byte p3, v2, p2

    .line 83
    .line 84
    add-int/lit8 p2, v0, 0x8

    .line 85
    .line 86
    int-to-byte p1, p1

    .line 87
    aput-byte p1, v2, p2

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x9

    .line 90
    .line 91
    int-to-byte p1, v3

    .line 92
    aput-byte p1, v2, v0

    .line 93
    .line 94
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_1
    const-string p2, "Only 4 digits numbers are supported. Provided: "

    .line 98
    .line 99
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
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
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeRaw(Ljava/lang/String;)V

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
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 86
    .line 87
    array-length p4, p4

    .line 88
    if-lt v5, p4, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    aput-byte v5, p4, v4

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
    invoke-virtual {p1, v1, p2, p4, v4}, Ljava/lang/String;->getBytes(II[BI)V

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
    aput-byte v5, p4, p1

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

    add-int/lit8 v3, v2, 0x1a

    .line 101
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v4, v4

    if-lt v3, v4, :cond_1

    .line 102
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 103
    :cond_1
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    const/16 v4, 0x22

    if-eqz v0, :cond_2

    add-int/lit8 v5, v2, 0x1

    .line 104
    aput-byte v4, v3, v2

    move v2, v5

    .line 105
    :cond_2
    invoke-static {p1, p2, v3, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[BIZ)I

    move-result p1

    add-int/2addr p1, v2

    if-eqz v0, :cond_3

    add-int/lit8 p2, p1, 0x1

    .line 106
    aput-byte v4, v3, p1

    move p1, p2

    .line 107
    :cond_3
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
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 37
    .line 38
    array-length v5, v5

    .line 39
    if-lt v4, v5, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 45
    .line 46
    add-int/lit8 v5, v3, 0x1

    .line 47
    .line 48
    const/16 v6, 0x5b

    .line 49
    .line 50
    aput-byte v6, v4, v3

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
    aput-byte v6, v4, v5

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
    aput-byte v3, v4, v5

    .line 71
    .line 72
    move v5, v6

    .line 73
    :cond_4
    aget-wide v6, p1, v1

    .line 74
    .line 75
    invoke-static {v6, v7, v4, v5, v2}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[BIZ)I

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
    aput-byte v3, v4, v6

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
    aput-byte p1, v4, v5

    .line 94
    .line 95
    add-int/2addr v5, v2

    .line 96
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 97
    .line 98
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

    add-int/lit8 v3, v2, 0x11

    .line 106
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v4, v4

    if-lt v3, v4, :cond_1

    .line 107
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    :cond_1
    const/16 v3, 0x22

    if-eqz v0, :cond_2

    .line 108
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    add-int/lit8 v5, v2, 0x1

    aput-byte v3, v4, v2

    move v2, v5

    .line 109
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    invoke-static {p1, v4, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(F[BIZ)I

    move-result p1

    add-int/2addr p1, v2

    if-eqz v0, :cond_3

    .line 110
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    add-int/lit8 v1, p1, 0x1

    aput-byte v3, v0, p1

    move p1, v1

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
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 42
    .line 43
    array-length v5, v5

    .line 44
    if-lt v4, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 50
    .line 51
    add-int/lit8 v5, v3, 0x1

    .line 52
    .line 53
    const/16 v6, 0x5b

    .line 54
    .line 55
    aput-byte v6, v4, v3

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
    aput-byte v6, v4, v5

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
    aput-byte v3, v4, v5

    .line 76
    .line 77
    move v5, v6

    .line 78
    :cond_5
    aget v6, p1, v1

    .line 79
    .line 80
    invoke-static {v6, v4, v5, v2}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(F[BIZ)I

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
    aput-byte v3, v4, v6

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
    aput-byte p1, v4, v5

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
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 21
    .line 22
    const/16 v2, 0x78

    .line 23
    .line 24
    aput-byte v2, v0, v1

    .line 25
    .line 26
    add-int/lit8 v2, v1, 0x1

    .line 27
    .line 28
    const/16 v3, 0x27

    .line 29
    .line 30
    aput-byte v3, v0, v2

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
    int-to-byte v5, v5

    .line 59
    aput-byte v5, v0, v1

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
    int-to-byte v4, v4

    .line 68
    aput-byte v4, v0, v5

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
    aput-byte v3, v0, v1

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
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 24
    .line 25
    array-length v3, v3

    .line 26
    if-lt v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    int-to-byte v4, v4

    .line 40
    aput-byte v4, v2, v1

    .line 41
    .line 42
    move v1, v3

    .line 43
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    add-int/lit8 v0, p1, 0x1

    .line 50
    .line 51
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 52
    .line 53
    int-to-byte v1, v1

    .line 54
    aput-byte v1, v2, p1

    .line 55
    .line 56
    move p1, v0

    .line 57
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    return-void
.end method

.method public writeInt32(I)V
    .locals 5

    .line 103
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

    .line 104
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0xd

    .line 105
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v3, v3

    if-lt v2, v3, :cond_1

    .line 106
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 107
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    if-eqz v0, :cond_2

    add-int/lit8 v3, v1, 0x1

    .line 108
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    move v1, v3

    .line 109
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    move-result p1

    if-eqz v0, :cond_3

    add-int/lit8 v0, p1, 0x1

    .line 110
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v1, v1

    aput-byte v1, v2, p1

    move p1, v0

    .line 111
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
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 38
    .line 39
    array-length v5, v5

    .line 40
    if-lt v4, v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 46
    .line 47
    add-int/lit8 v5, v3, 0x1

    .line 48
    .line 49
    const/16 v6, 0x5b

    .line 50
    .line 51
    aput-byte v6, v4, v3

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
    aput-byte v6, v4, v5

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
    int-to-byte v6, v6

    .line 72
    aput-byte v6, v4, v5

    .line 73
    .line 74
    move v5, v3

    .line 75
    :cond_4
    aget v3, p1, v1

    .line 76
    .line 77
    invoke-static {v4, v5, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    add-int/lit8 v5, v3, 0x1

    .line 84
    .line 85
    iget-char v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 86
    .line 87
    int-to-byte v6, v6

    .line 88
    aput-byte v6, v4, v3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move v5, v3

    .line 92
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    const/16 p1, 0x5d

    .line 96
    .line 97
    aput-byte p1, v4, v5

    .line 98
    .line 99
    add-int/2addr v5, v2

    .line 100
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 101
    .line 102
    return-void
.end method

.method public writeInt64(J)V
    .locals 9

    .line 144
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 145
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

    .line 146
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v6, v3, 0x17

    .line 147
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v7, v7

    if-lt v6, v7, :cond_2

    .line 148
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 149
    :cond_2
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    if-eqz v2, :cond_3

    add-int/lit8 v7, v3, 0x1

    .line 150
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v8, v8

    aput-byte v8, v6, v3

    move v3, v7

    .line 151
    :cond_3
    invoke-static {v6, v3, p1, p2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([BIJ)I

    move-result v3

    if-eqz v2, :cond_4

    add-int/lit8 p1, v3, 0x1

    .line 152
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte p2, p2

    aput-byte p2, v6, v3

    :goto_2
    move v3, p1

    goto :goto_3

    .line 153
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

    .line 154
    aput-byte p2, v6, v3

    goto :goto_2

    .line 155
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
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 53
    .line 54
    array-length v4, v4

    .line 55
    if-lt v5, v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 61
    .line 62
    add-int/lit8 v5, v1, 0x1

    .line 63
    .line 64
    const/16 v7, 0x5b

    .line 65
    .line 66
    aput-byte v7, v4, v1

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
    aput-byte v8, v4, v5

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
    int-to-byte v11, v11

    .line 116
    aput-byte v11, v4, v5

    .line 117
    .line 118
    move v5, v10

    .line 119
    :cond_7
    invoke-static {v4, v5, v7, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([BIJ)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v9, :cond_8

    .line 124
    .line 125
    add-int/lit8 v7, v5, 0x1

    .line 126
    .line 127
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 128
    .line 129
    int-to-byte v8, v8

    .line 130
    aput-byte v8, v4, v5

    .line 131
    .line 132
    move v5, v7

    .line 133
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_9
    const/16 p1, 0x5d

    .line 137
    .line 138
    aput-byte p1, v4, v5

    .line 139
    .line 140
    add-int/2addr v5, v6

    .line 141
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 142
    .line 143
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
    add-int/lit8 v2, v1, 0x5

    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 24
    .line 25
    array-length v3, v3

    .line 26
    if-lt v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

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
    int-to-byte v4, v4

    .line 40
    aput-byte v4, v2, v1

    .line 41
    .line 42
    move v1, v3

    .line 43
    :cond_2
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    add-int/lit8 v0, p1, 0x1

    .line 50
    .line 51
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 52
    .line 53
    int-to-byte v1, v1

    .line 54
    aput-byte v1, v2, p1

    .line 55
    .line 56
    move p1, v0

    .line 57
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 25
    .line 26
    array-length v2, v2

    .line 27
    if-lt v1, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 33
    .line 34
    add-int/lit8 v2, v0, 0x1

    .line 35
    .line 36
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 37
    .line 38
    int-to-byte v3, v3

    .line 39
    aput-byte v3, v1, v0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {v1, v2, v0, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 58
    .line 59
    int-to-byte v0, v0

    .line 60
    aput-byte v0, v1, p1

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 65
    .line 66
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    int-to-byte v3, v3

    .line 20
    aput-byte v3, v1, v0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v1, v2, v3, v4, v0}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/lit8 v2, v0, 0x1

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    aput-byte v3, v1, v0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BILjava/time/LocalTime;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 57
    .line 58
    int-to-byte v0, v0

    .line 59
    aput-byte v0, v1, p1

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 64
    .line 65
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 18
    .line 19
    int-to-byte v3, v3

    .line 20
    aput-byte v3, v1, v0

    .line 21
    .line 22
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BILjava/time/LocalTime;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 27
    .line 28
    int-to-byte v0, v0

    .line 29
    aput-byte v0, v1, p1

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 34
    .line 35
    return-void
.end method

.method public writeName10Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0xd

    .line 66
    .line 67
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    return-void
.end method

.method public writeName11Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0xe

    .line 66
    .line 67
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    return-void
.end method

.method public writeName12Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0xf

    .line 66
    .line 67
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    return-void
.end method

.method public writeName13Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x10

    .line 66
    .line 67
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 68
    .line 69
    return-void
.end method

.method public writeName14Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 p1, v0, 0x10

    .line 66
    .line 67
    const/16 p2, 0x3a

    .line 68
    .line 69
    aput-byte p2, v3, p1

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x11

    .line 72
    .line 73
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 74
    .line 75
    return-void
.end method

.method public writeName15Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long v4, v8, p1

    .line 60
    .line 61
    move-wide v6, p3

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 p1, v0, 0x10

    .line 66
    .line 67
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 68
    .line 69
    int-to-byte p2, p2

    .line 70
    aput-byte p2, v3, p1

    .line 71
    .line 72
    add-int/lit8 p1, v0, 0x11

    .line 73
    .line 74
    const/16 p2, 0x3a

    .line 75
    .line 76
    aput-byte p2, v3, p1

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x12

    .line 79
    .line 80
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 81
    .line 82
    return-void
.end method

.method public writeName16Raw(JJ)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    add-int/lit8 v1, v0, 0x1

    .line 46
    .line 47
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 48
    .line 49
    int-to-byte v2, v2

    .line 50
    aput-byte v2, v3, v0

    .line 51
    .line 52
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 53
    .line 54
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 55
    .line 56
    int-to-long v10, v1

    .line 57
    add-long v4, v8, v10

    .line 58
    .line 59
    move-wide v6, p1

    .line 60
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 61
    .line 62
    .line 63
    add-long/2addr v8, v10

    .line 64
    const-wide/16 p1, 0x8

    .line 65
    .line 66
    add-long v4, v8, p1

    .line 67
    .line 68
    move-wide v6, p3

    .line 69
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 p1, v0, 0x12

    .line 73
    .line 74
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 75
    .line 76
    int-to-byte p2, p2

    .line 77
    aput-byte p2, v3, p1

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x13

    .line 80
    .line 81
    const/16 p1, 0x3a

    .line 82
    .line 83
    aput-byte p1, v3, v0

    .line 84
    .line 85
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 86
    .line 87
    return-void
.end method

.method public writeName2Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x5

    .line 56
    .line 57
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    return-void
.end method

.method public writeName3Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x6

    .line 56
    .line 57
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    return-void
.end method

.method public writeName4Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x7

    .line 56
    .line 57
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    return-void
.end method

.method public writeName5Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x8

    .line 56
    .line 57
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 58
    .line 59
    return-void
.end method

.method public writeName6Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 p1, v0, 0x8

    .line 56
    .line 57
    const/16 p2, 0x3a

    .line 58
    .line 59
    aput-byte p2, v3, p1

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x9

    .line 62
    .line 63
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 64
    .line 65
    return-void
.end method

.method public writeName7Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v6, v0

    .line 50
    add-long/2addr v4, v6

    .line 51
    move-wide v6, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 p1, v0, 0x8

    .line 56
    .line 57
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 58
    .line 59
    int-to-byte p2, p2

    .line 60
    aput-byte p2, v3, p1

    .line 61
    .line 62
    add-int/lit8 p1, v0, 0x9

    .line 63
    .line 64
    const/16 p2, 0x3a

    .line 65
    .line 66
    aput-byte p2, v3, p1

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0xa

    .line 69
    .line 70
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 71
    .line 72
    return-void
.end method

.method public writeName8Raw(J)V
    .locals 8

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 46
    .line 47
    int-to-byte v1, v1

    .line 48
    aput-byte v1, v3, v0

    .line 49
    .line 50
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 51
    .line 52
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 53
    .line 54
    int-to-long v6, v0

    .line 55
    add-long/2addr v4, v6

    .line 56
    const-wide/16 v6, 0x1

    .line 57
    .line 58
    add-long/2addr v4, v6

    .line 59
    move-wide v6, p1

    .line 60
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 p1, v0, 0x9

    .line 64
    .line 65
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 66
    .line 67
    int-to-byte p2, p2

    .line 68
    aput-byte p2, v3, p1

    .line 69
    .line 70
    add-int/lit8 p1, v0, 0xa

    .line 71
    .line 72
    const/16 p2, 0x3a

    .line 73
    .line 74
    aput-byte p2, v3, p1

    .line 75
    .line 76
    add-int/lit8 v0, v0, 0xb

    .line 77
    .line 78
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 79
    .line 80
    return-void
.end method

.method public writeName9Raw(JI)V
    .locals 12

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    move-object v3, v1

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
    const/16 v2, 0x2c

    .line 32
    .line 33
    aput-byte v2, v3, v0

    .line 34
    .line 35
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long v4, v8, v10

    .line 51
    .line 52
    move-wide v6, p1

    .line 53
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 54
    .line 55
    .line 56
    add-long/2addr v8, v10

    .line 57
    const-wide/16 p1, 0x8

    .line 58
    .line 59
    add-long/2addr v8, p1

    .line 60
    invoke-virtual {v2, v3, v8, v9, p3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0xc

    .line 64
    .line 65
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 66
    .line 67
    return-void
.end method

.method public writeNameRaw([B)V
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    array-length v3, v1

    .line 16
    if-le v2, v3, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

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
    aput-byte v4, v1, v0

    .line 35
    .line 36
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-direct {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->indent([BI)I

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

.method public writeNameRaw([BII)V
    .locals 2

    .line 55
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->indent:I

    add-int/2addr v0, v1

    .line 56
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 57
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 58
    :cond_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->startObject:Z

    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeComma()V

    .line 61
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 62
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeNameRaw([C)V
    .locals 1

    .line 63
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "UnsupportedOperation"

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeNameRaw([CII)V
    .locals 0

    .line 64
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "UnsupportedOperation"

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
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
    add-int/lit8 v1, v1, 0x2d

    .line 14
    .line 15
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 24
    .line 25
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 26
    .line 27
    add-int/lit8 v3, v2, 0x1

    .line 28
    .line 29
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 30
    .line 31
    int-to-byte v4, v4

    .line 32
    aput-byte v4, v1, v2

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/time/LocalDate;->getYear()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {v1, v3, v4, v5, v2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v3, v2, 0x1

    .line 59
    .line 60
    const/16 v4, 0x54

    .line 61
    .line 62
    aput-byte v4, v1, v2

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {v1, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BILjava/time/LocalTime;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    add-int/lit8 v0, p1, 0x1

    .line 79
    .line 80
    const/16 v2, 0x5a

    .line 81
    .line 82
    aput-byte v2, v1, p1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v0, v2, v3, v1, p1}, Ljava/lang/String;->getBytes(II[BI)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    add-int/2addr v0, p1

    .line 102
    :goto_0
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 103
    .line 104
    int-to-byte p1, p1

    .line 105
    aput-byte p1, v1, v0

    .line 106
    .line 107
    add-int/lit8 v0, v0, 0x1

    .line 108
    .line 109
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 110
    .line 111
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
    add-int/lit8 v1, v1, 0x2d

    .line 14
    .line 15
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 24
    .line 25
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 26
    .line 27
    add-int/lit8 v3, v2, 0x1

    .line 28
    .line 29
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 30
    .line 31
    int-to-byte v4, v4

    .line 32
    aput-byte v4, v1, v2

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/time/OffsetTime;->toLocalTime()Ljava/time/LocalTime;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v1, v3, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BILjava/time/LocalTime;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    const/16 v2, 0x5a

    .line 51
    .line 52
    aput-byte v2, v1, p1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v0, v2, v3, v1, p1}, Ljava/lang/String;->getBytes(II[BI)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr v0, p1

    .line 72
    :goto_0
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 73
    .line 74
    int-to-byte p1, p1

    .line 75
    aput-byte p1, v1, v0

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 80
    .line 81
    return-void
.end method

.method public writeRaw(C)V
    .locals 3

    const/16 v0, 0x80

    if-gt p1, v0, :cond_1

    .line 101
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 102
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void

    .line 104
    :cond_1
    const-string v0, "not support "

    invoke-static {p1, v0}, Lah/a;->g(ILjava/lang/String;)V

    return-void
.end method

.method public writeRaw(CC)V
    .locals 3

    .line 105
    const-string v0, "not support "

    const/16 v1, 0x80

    if-gt p1, v1, :cond_2

    if-gt p2, v1, :cond_1

    .line 106
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    .line 107
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v2, v2

    if-lt v1, v2, :cond_0

    add-int/lit8 v2, v0, 0x2

    .line 108
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 109
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    int-to-byte p1, p2

    .line 110
    aput-byte p1, v2, v1

    add-int/lit8 v0, v0, 0x2

    .line 111
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void

    .line 112
    :cond_1
    invoke-static {p2, v0}, Lah/a;->g(ILjava/lang/String;)V

    return-void

    .line 113
    :cond_2
    invoke-static {p1, v0}, Lah/a;->g(ILjava/lang/String;)V

    return-void
.end method

.method public writeRaw(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    mul-int/lit8 v1, v1, 0x3

    .line 9
    .line 10
    add-int/2addr v1, v0

    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v2, v2

    .line 14
    if-lt v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    array-length v3, p1

    .line 23
    if-ge v2, v3, :cond_3

    .line 24
    .line 25
    aget-char v3, p1, v2

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    if-lt v3, v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x7f

    .line 31
    .line 32
    if-gt v3, v4, :cond_1

    .line 33
    .line 34
    add-int/lit8 v4, v0, 0x1

    .line 35
    .line 36
    int-to-byte v3, v3

    .line 37
    aput-byte v3, v1, v0

    .line 38
    .line 39
    :goto_1
    move v0, v4

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v4, 0x7ff

    .line 42
    .line 43
    if-le v3, v4, :cond_2

    .line 44
    .line 45
    shr-int/lit8 v4, v3, 0xc

    .line 46
    .line 47
    and-int/lit8 v4, v4, 0xf

    .line 48
    .line 49
    or-int/lit16 v4, v4, 0xe0

    .line 50
    .line 51
    int-to-byte v4, v4

    .line 52
    aput-byte v4, v1, v0

    .line 53
    .line 54
    add-int/lit8 v4, v0, 0x1

    .line 55
    .line 56
    shr-int/lit8 v5, v3, 0x6

    .line 57
    .line 58
    and-int/lit8 v5, v5, 0x3f

    .line 59
    .line 60
    or-int/lit16 v5, v5, 0x80

    .line 61
    .line 62
    int-to-byte v5, v5

    .line 63
    aput-byte v5, v1, v4

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    add-int/lit8 v4, v0, 0x1

    .line 69
    .line 70
    shr-int/lit8 v5, v3, 0x6

    .line 71
    .line 72
    and-int/lit8 v5, v5, 0x1f

    .line 73
    .line 74
    or-int/lit16 v5, v5, 0xc0

    .line 75
    .line 76
    int-to-byte v5, v5

    .line 77
    aput-byte v5, v1, v0

    .line 78
    .line 79
    move v0, v4

    .line 80
    :goto_2
    add-int/lit8 v4, v0, 0x1

    .line 81
    .line 82
    and-int/lit8 v3, v3, 0x3f

    .line 83
    .line 84
    or-int/lit16 v3, v3, 0x80

    .line 85
    .line 86
    int-to-byte v3, v3

    .line 87
    aput-byte v3, v1, v0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 94
    .line 95
    return-void
.end method

.method public writeRaw([B)V
    .locals 4

    .line 96
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    array-length v1, p1

    add-int/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 98
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 100
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void
.end method

.method public writeReference(Ljava/lang/String;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->lastReference:Ljava/lang/String;

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    add-int/lit8 v2, v0, 0x8

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    const/16 v3, 0x7b

    .line 17
    .line 18
    aput-byte v3, v1, v0

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x1

    .line 21
    .line 22
    const/16 v4, 0x22

    .line 23
    .line 24
    aput-byte v4, v1, v3

    .line 25
    .line 26
    add-int/lit8 v3, v0, 0x2

    .line 27
    .line 28
    const/16 v5, 0x24

    .line 29
    .line 30
    aput-byte v5, v1, v3

    .line 31
    .line 32
    add-int/lit8 v3, v0, 0x3

    .line 33
    .line 34
    const/16 v5, 0x72

    .line 35
    .line 36
    aput-byte v5, v1, v3

    .line 37
    .line 38
    add-int/lit8 v3, v0, 0x4

    .line 39
    .line 40
    const/16 v5, 0x65

    .line 41
    .line 42
    aput-byte v5, v1, v3

    .line 43
    .line 44
    add-int/lit8 v3, v0, 0x5

    .line 45
    .line 46
    const/16 v5, 0x66

    .line 47
    .line 48
    aput-byte v5, v1, v3

    .line 49
    .line 50
    add-int/lit8 v3, v0, 0x6

    .line 51
    .line 52
    aput-byte v4, v1, v3

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x7

    .line 55
    .line 56
    const/16 v3, 0x3a

    .line 57
    .line 58
    aput-byte v3, v1, v0

    .line 59
    .line 60
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 66
    .line 67
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 68
    .line 69
    array-length v1, v0

    .line 70
    if-ne p1, v1, :cond_1

    .line 71
    .line 72
    add-int/lit8 v0, p1, 0x1

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_1
    const/16 v1, 0x7d

    .line 79
    .line 80
    aput-byte v1, v0, p1

    .line 81
    .line 82
    add-int/lit8 p1, p1, 0x1

    .line 83
    .line 84
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 85
    .line 86
    return-void
.end method

.method public writeString(B)V
    .locals 4

    .line 561
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

    .line 562
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    .line 563
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeInt8(B)V

    if-eqz v0, :cond_2

    .line 564
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(I)V
    .locals 4

    .line 569
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

    .line 570
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    .line 571
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeInt32(I)V

    if-eqz v0, :cond_2

    .line 572
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(J)V
    .locals 4

    .line 573
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

    .line 574
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    .line 575
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeInt64(J)V

    if-eqz v0, :cond_2

    .line 576
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 12

    if-nez p1, :cond_0

    .line 535
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    .line 536
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 537
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v2

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    const/4 v0, 0x0

    const/4 v4, 0x1

    move-wide v8, v2

    if-eqz p1, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v0

    .line 538
    :goto_0
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v10, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v8, v10

    cmp-long p1, v8, v6

    if-eqz p1, :cond_2

    move p1, v4

    goto :goto_1

    :cond_2
    move p1, v4

    move v4, v0

    .line 539
    :goto_1
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 540
    array-length v5, v1

    const/4 v6, 0x2

    const/4 v7, 0x3

    invoke-static {v5, v7, v2, v6}, Lp/a;->g(IIII)I

    move-result v5

    if-nez v4, :cond_3

    if-eqz v3, :cond_4

    .line 541
    :cond_3
    array-length v6, v1

    mul-int/2addr v6, v7

    add-int/2addr v5, v6

    .line 542
    :cond_4
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v6, v6

    if-lt v5, v6, :cond_5

    .line 543
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 544
    :cond_5
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    add-int/lit8 v6, v2, 0x1

    .line 545
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v7, v7

    aput-byte v7, v5, v2

    .line 546
    :goto_2
    array-length v2, v1

    if-ge v0, v2, :cond_7

    .line 547
    aget-char v2, v1, v0

    .line 548
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    if-eq v2, v7, :cond_7

    const/16 v7, 0x5c

    if-eq v2, v7, :cond_7

    const/16 v7, 0x20

    if-lt v2, v7, :cond_7

    const/16 v7, 0x7f

    if-gt v2, v7, :cond_7

    if-eqz v3, :cond_6

    const/16 v7, 0x3c

    if-eq v2, v7, :cond_7

    const/16 v7, 0x3e

    if-eq v2, v7, :cond_7

    const/16 v7, 0x28

    if-eq v2, v7, :cond_7

    const/16 v7, 0x29

    if-ne v2, v7, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v6, 0x1

    int-to-byte v2, v2

    .line 549
    aput-byte v2, v5, v6

    add-int/lit8 v0, v0, 0x1

    move v6, v7

    goto :goto_2

    .line 550
    :cond_7
    :goto_3
    array-length v2, v1

    if-ne v0, v2, :cond_8

    .line 551
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v0, v0

    aput-byte v0, v5, v6

    add-int/2addr v6, p1

    .line 552
    iput v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    return-void

    .line 553
    :cond_8
    iput v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 554
    array-length p1, v1

    if-ge v0, p1, :cond_9

    .line 555
    array-length v2, v1

    move v5, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeStringEscapedRest([CIZZI)V

    goto :goto_4

    :cond_9
    move-object v0, p0

    .line 556
    :goto_4
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v2, v2

    aput-byte v2, p1, v1

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

    .line 616
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->pretty:B

    if-eqz v0, :cond_0

    .line 617
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/util/List;)V

    return-void

    .line 618
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v1, v1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 619
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->grow(I)[B

    .line 620
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v2, 0x5b

    aput-byte v2, v0, v1

    .line 621
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    if-eqz v1, :cond_3

    .line 622
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v3, v3

    if-ne v2, v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    .line 623
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 624
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v4, 0x2c

    aput-byte v4, v2, v3

    .line 625
    :cond_3
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 626
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 627
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v0, v0

    if-ne p1, v0, :cond_5

    add-int/lit8 p1, p1, 0x1

    .line 628
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 629
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    const/16 v1, 0x5d

    aput-byte v1, p1, v0

    return-void
.end method

.method public writeString(S)V
    .locals 4

    .line 565
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

    .line 566
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    .line 567
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeInt16(S)V

    if-eqz v0, :cond_2

    .line 568
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeQuote()V

    :cond_2
    return-void
.end method

.method public writeString(Z)V
    .locals 4

    .line 557
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v0, v0

    .line 558
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    aput-byte v0, v1, v2

    .line 559
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 560
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    aput-byte v0, p1, v1

    return-void
.end method

.method public writeString([C)V
    .locals 13

    if-nez p1, :cond_0

    .line 577
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    .line 578
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

    move v10, v6

    goto :goto_0

    :cond_1
    move v10, v3

    .line 579
    :goto_0
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v7

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    move v11, v6

    goto :goto_1

    :cond_2
    move v11, v3

    .line 580
    :goto_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 581
    array-length v1, p1

    const/4 v2, 0x3

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v4}, Lp/a;->g(IIII)I

    move-result v1

    if-nez v11, :cond_3

    if-eqz v10, :cond_4

    .line 582
    :cond_3
    array-length v5, p1

    mul-int/2addr v5, v2

    add-int/2addr v1, v5

    .line 583
    :cond_4
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v2, v2

    if-lt v1, v2, :cond_5

    .line 584
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 585
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    add-int/lit8 v2, v0, 0x1

    .line 586
    iget-char v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    move v12, v3

    .line 587
    :goto_2
    array-length v0, p1

    if-ge v12, v0, :cond_7

    .line 588
    aget-char v0, p1, v12

    .line 589
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    if-eq v0, v3, :cond_7

    const/16 v3, 0x5c

    if-eq v0, v3, :cond_7

    const/16 v3, 0x20

    if-lt v0, v3, :cond_7

    const/16 v3, 0x7f

    if-gt v0, v3, :cond_7

    if-eqz v10, :cond_6

    const/16 v3, 0x3c

    if-eq v0, v3, :cond_7

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_7

    const/16 v3, 0x28

    if-eq v0, v3, :cond_7

    const/16 v3, 0x29

    if-ne v0, v3, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v3, v2, 0x1

    int-to-byte v0, v0

    .line 590
    aput-byte v0, v1, v2

    add-int/lit8 v12, v12, 0x1

    move v2, v3

    goto :goto_2

    .line 591
    :cond_7
    :goto_3
    iput v2, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 592
    array-length v0, p1

    sub-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x6

    add-int/2addr v0, v2

    add-int/2addr v0, v4

    .line 593
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length v1, v1

    if-lt v0, v1, :cond_8

    .line 594
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 595
    :cond_8
    array-length v0, p1

    if-ge v12, v0, :cond_9

    .line 596
    array-length v9, p1

    move-object v7, p0

    move-object v8, p1

    invoke-virtual/range {v7 .. v12}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeStringEscapedRest([CIZZI)V

    goto :goto_4

    :cond_9
    move-object v7, p0

    .line 597
    :goto_4
    iget-object p1, v7, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget v0, v7, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 v1, v0, 0x1

    iput v1, v7, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char v1, v7, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    return-void
.end method

.method public writeString([CII)V
    .locals 10

    if-nez p1, :cond_1

    .line 598
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->isEnabled(J)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 599
    const-string p1, ""

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    return-void

    .line 600
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    return-void

    :cond_1
    add-int v2, p2, p3

    .line 601
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v3, v0

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    const/4 v7, 0x1

    if-eqz v3, :cond_2

    move v3, v7

    goto :goto_0

    :cond_2
    move v3, v4

    .line 602
    :goto_0
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v8

    cmp-long v0, v0, v5

    if-eqz v0, :cond_3

    move v4, v7

    .line 603
    :cond_3
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    mul-int/lit8 p3, p3, 0x3

    add-int v1, v0, p3

    add-int/lit8 v1, v1, 0x2

    if-nez v4, :cond_4

    if-eqz v3, :cond_5

    :cond_4
    add-int/2addr v1, p3

    .line 604
    :cond_5
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length p3, p3

    if-lt v1, p3, :cond_6

    .line 605
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 606
    :cond_6
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    add-int/lit8 v1, v0, 0x1

    .line 607
    iget-char v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte v5, v5

    aput-byte v5, p3, v0

    move v5, p2

    :goto_1
    if-ge v5, v2, :cond_8

    .line 608
    aget-char p2, p1, v5

    .line 609
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    if-eq p2, v0, :cond_8

    const/16 v0, 0x5c

    if-eq p2, v0, :cond_8

    const/16 v0, 0x20

    if-lt p2, v0, :cond_8

    const/16 v0, 0x7f

    if-gt p2, v0, :cond_8

    if-eqz v3, :cond_7

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_8

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_8

    const/16 v0, 0x28

    if-eq p2, v0, :cond_8

    const/16 v0, 0x29

    if-ne p2, v0, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v0, v1, 0x1

    int-to-byte p2, p2

    .line 610
    aput-byte p2, p3, v1

    add-int/lit8 v5, v5, 0x1

    move v1, v0

    goto :goto_1

    .line 611
    :cond_8
    :goto_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    sub-int p2, v2, v5

    mul-int/lit8 p2, p2, 0x6

    add-int/2addr p2, v1

    add-int/lit8 p2, p2, 0x2

    .line 612
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    array-length p3, p3

    if-lt p2, p3, :cond_9

    .line 613
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    :cond_9
    move-object v0, p0

    if-ge v5, v2, :cond_a

    move-object v1, p1

    .line 614
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeStringEscapedRest([CIZZI)V

    .line 615
    :cond_a
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    iget p2, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    add-int/lit8 p3, p2, 0x1

    iput p3, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    iget-char p3, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    return-void
.end method

.method public writeString([CIIZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 8
    .line 9
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 12
    .line 13
    and-long/2addr v2, v4

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    iget v4, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 25
    .line 26
    array-length v5, v1

    .line 27
    const/4 v6, 0x3

    .line 28
    const/4 v7, 0x2

    .line 29
    invoke-static {v5, v6, v4, v7}, Lp/a;->g(IIII)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    mul-int/lit8 v5, p3, 0x3

    .line 36
    .line 37
    add-int/2addr v4, v5

    .line 38
    :cond_1
    iget-object v5, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 39
    .line 40
    array-length v5, v5

    .line 41
    if-lt v4, v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 47
    .line 48
    iget v5, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 49
    .line 50
    if-eqz p4, :cond_3

    .line 51
    .line 52
    add-int/lit8 v6, v5, 0x1

    .line 53
    .line 54
    iget-char v8, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 55
    .line 56
    int-to-byte v8, v8

    .line 57
    aput-byte v8, v4, v5

    .line 58
    .line 59
    move v5, v6

    .line 60
    :cond_3
    add-int v6, p2, p3

    .line 61
    .line 62
    move v8, v5

    .line 63
    move/from16 v5, p2

    .line 64
    .line 65
    :goto_1
    const/16 v9, 0x7f

    .line 66
    .line 67
    const/16 v10, 0x5c

    .line 68
    .line 69
    if-ge v5, v6, :cond_5

    .line 70
    .line 71
    aget-char v11, v1, v5

    .line 72
    .line 73
    iget-char v12, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 74
    .line 75
    if-eq v11, v12, :cond_5

    .line 76
    .line 77
    if-eq v11, v10, :cond_5

    .line 78
    .line 79
    const/16 v12, 0x20

    .line 80
    .line 81
    if-lt v11, v12, :cond_5

    .line 82
    .line 83
    if-le v11, v9, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    add-int/lit8 v9, v8, 0x1

    .line 87
    .line 88
    int-to-byte v10, v11

    .line 89
    aput-byte v10, v4, v8

    .line 90
    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    move v8, v9

    .line 94
    goto :goto_1

    .line 95
    :cond_5
    :goto_2
    if-ne v5, v6, :cond_7

    .line 96
    .line 97
    if-eqz p4, :cond_6

    .line 98
    .line 99
    add-int/lit8 v1, v8, 0x1

    .line 100
    .line 101
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 102
    .line 103
    int-to-byte v2, v2

    .line 104
    aput-byte v2, v4, v8

    .line 105
    .line 106
    move v8, v1

    .line 107
    :cond_6
    iput v8, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 108
    .line 109
    return-void

    .line 110
    :cond_7
    :goto_3
    if-ge v5, v6, :cond_12

    .line 111
    .line 112
    aget-char v11, v1, v5

    .line 113
    .line 114
    const/16 v12, 0x75

    .line 115
    .line 116
    if-gt v11, v9, :cond_a

    .line 117
    .line 118
    if-eq v11, v10, :cond_9

    .line 119
    .line 120
    const/16 v13, 0x31

    .line 121
    .line 122
    const/16 v14, 0x30

    .line 123
    .line 124
    packed-switch v11, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    iget-char v12, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 128
    .line 129
    if-ne v11, v12, :cond_8

    .line 130
    .line 131
    aput-byte v10, v4, v8

    .line 132
    .line 133
    add-int/lit8 v11, v8, 0x1

    .line 134
    .line 135
    int-to-byte v12, v12

    .line 136
    aput-byte v12, v4, v11

    .line 137
    .line 138
    :goto_4
    add-int/lit8 v8, v8, 0x2

    .line 139
    .line 140
    goto/16 :goto_8

    .line 141
    .line 142
    :cond_8
    add-int/lit8 v12, v8, 0x1

    .line 143
    .line 144
    int-to-byte v11, v11

    .line 145
    aput-byte v11, v4, v8

    .line 146
    .line 147
    move v8, v12

    .line 148
    goto/16 :goto_8

    .line 149
    .line 150
    :pswitch_0
    aput-byte v10, v4, v8

    .line 151
    .line 152
    add-int/lit8 v15, v8, 0x1

    .line 153
    .line 154
    aput-byte v12, v4, v15

    .line 155
    .line 156
    add-int/lit8 v12, v8, 0x2

    .line 157
    .line 158
    aput-byte v14, v4, v12

    .line 159
    .line 160
    add-int/lit8 v12, v8, 0x3

    .line 161
    .line 162
    aput-byte v14, v4, v12

    .line 163
    .line 164
    add-int/lit8 v12, v8, 0x4

    .line 165
    .line 166
    aput-byte v13, v4, v12

    .line 167
    .line 168
    add-int/lit8 v12, v8, 0x5

    .line 169
    .line 170
    add-int/lit8 v11, v11, 0x47

    .line 171
    .line 172
    int-to-byte v11, v11

    .line 173
    aput-byte v11, v4, v12

    .line 174
    .line 175
    :goto_5
    add-int/lit8 v8, v8, 0x6

    .line 176
    .line 177
    goto/16 :goto_8

    .line 178
    .line 179
    :pswitch_1
    aput-byte v10, v4, v8

    .line 180
    .line 181
    add-int/lit8 v15, v8, 0x1

    .line 182
    .line 183
    aput-byte v12, v4, v15

    .line 184
    .line 185
    add-int/lit8 v12, v8, 0x2

    .line 186
    .line 187
    aput-byte v14, v4, v12

    .line 188
    .line 189
    add-int/lit8 v12, v8, 0x3

    .line 190
    .line 191
    aput-byte v14, v4, v12

    .line 192
    .line 193
    add-int/lit8 v12, v8, 0x4

    .line 194
    .line 195
    aput-byte v13, v4, v12

    .line 196
    .line 197
    add-int/lit8 v12, v8, 0x5

    .line 198
    .line 199
    add-int/lit8 v11, v11, 0x20

    .line 200
    .line 201
    int-to-byte v11, v11

    .line 202
    aput-byte v11, v4, v12

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :pswitch_2
    aput-byte v10, v4, v8

    .line 206
    .line 207
    add-int/lit8 v11, v8, 0x1

    .line 208
    .line 209
    const/16 v12, 0x72

    .line 210
    .line 211
    aput-byte v12, v4, v11

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :pswitch_3
    aput-byte v10, v4, v8

    .line 215
    .line 216
    add-int/lit8 v11, v8, 0x1

    .line 217
    .line 218
    const/16 v12, 0x66

    .line 219
    .line 220
    aput-byte v12, v4, v11

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :pswitch_4
    aput-byte v10, v4, v8

    .line 224
    .line 225
    add-int/lit8 v13, v8, 0x1

    .line 226
    .line 227
    aput-byte v12, v4, v13

    .line 228
    .line 229
    add-int/lit8 v12, v8, 0x2

    .line 230
    .line 231
    aput-byte v14, v4, v12

    .line 232
    .line 233
    add-int/lit8 v12, v8, 0x3

    .line 234
    .line 235
    aput-byte v14, v4, v12

    .line 236
    .line 237
    add-int/lit8 v12, v8, 0x4

    .line 238
    .line 239
    aput-byte v14, v4, v12

    .line 240
    .line 241
    add-int/lit8 v12, v8, 0x5

    .line 242
    .line 243
    add-int/lit8 v11, v11, 0x57

    .line 244
    .line 245
    int-to-byte v11, v11

    .line 246
    aput-byte v11, v4, v12

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :pswitch_5
    aput-byte v10, v4, v8

    .line 250
    .line 251
    add-int/lit8 v11, v8, 0x1

    .line 252
    .line 253
    const/16 v12, 0x6e

    .line 254
    .line 255
    aput-byte v12, v4, v11

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :pswitch_6
    aput-byte v10, v4, v8

    .line 259
    .line 260
    add-int/lit8 v11, v8, 0x1

    .line 261
    .line 262
    const/16 v12, 0x74

    .line 263
    .line 264
    aput-byte v12, v4, v11

    .line 265
    .line 266
    goto/16 :goto_4

    .line 267
    .line 268
    :pswitch_7
    aput-byte v10, v4, v8

    .line 269
    .line 270
    add-int/lit8 v11, v8, 0x1

    .line 271
    .line 272
    const/16 v12, 0x62

    .line 273
    .line 274
    aput-byte v12, v4, v11

    .line 275
    .line 276
    goto/16 :goto_4

    .line 277
    .line 278
    :pswitch_8
    aput-byte v10, v4, v8

    .line 279
    .line 280
    add-int/lit8 v13, v8, 0x1

    .line 281
    .line 282
    aput-byte v12, v4, v13

    .line 283
    .line 284
    add-int/lit8 v12, v8, 0x2

    .line 285
    .line 286
    aput-byte v14, v4, v12

    .line 287
    .line 288
    add-int/lit8 v12, v8, 0x3

    .line 289
    .line 290
    aput-byte v14, v4, v12

    .line 291
    .line 292
    add-int/lit8 v12, v8, 0x4

    .line 293
    .line 294
    aput-byte v14, v4, v12

    .line 295
    .line 296
    add-int/lit8 v12, v8, 0x5

    .line 297
    .line 298
    add-int/lit8 v11, v11, 0x30

    .line 299
    .line 300
    int-to-byte v11, v11

    .line 301
    aput-byte v11, v4, v12

    .line 302
    .line 303
    goto/16 :goto_5

    .line 304
    .line 305
    :cond_9
    aput-byte v10, v4, v8

    .line 306
    .line 307
    add-int/lit8 v11, v8, 0x1

    .line 308
    .line 309
    aput-byte v10, v4, v11

    .line 310
    .line 311
    goto/16 :goto_4

    .line 312
    .line 313
    :cond_a
    if-eqz v2, :cond_b

    .line 314
    .line 315
    aput-byte v10, v4, v8

    .line 316
    .line 317
    add-int/lit8 v13, v8, 0x1

    .line 318
    .line 319
    aput-byte v12, v4, v13

    .line 320
    .line 321
    add-int/lit8 v12, v8, 0x2

    .line 322
    .line 323
    sget-object v13, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 324
    .line 325
    ushr-int/lit8 v14, v11, 0xc

    .line 326
    .line 327
    and-int/lit8 v14, v14, 0xf

    .line 328
    .line 329
    aget-char v14, v13, v14

    .line 330
    .line 331
    int-to-byte v14, v14

    .line 332
    aput-byte v14, v4, v12

    .line 333
    .line 334
    add-int/lit8 v12, v8, 0x3

    .line 335
    .line 336
    ushr-int/lit8 v14, v11, 0x8

    .line 337
    .line 338
    and-int/lit8 v14, v14, 0xf

    .line 339
    .line 340
    aget-char v14, v13, v14

    .line 341
    .line 342
    int-to-byte v14, v14

    .line 343
    aput-byte v14, v4, v12

    .line 344
    .line 345
    add-int/lit8 v12, v8, 0x4

    .line 346
    .line 347
    ushr-int/lit8 v14, v11, 0x4

    .line 348
    .line 349
    and-int/lit8 v14, v14, 0xf

    .line 350
    .line 351
    aget-char v14, v13, v14

    .line 352
    .line 353
    int-to-byte v14, v14

    .line 354
    aput-byte v14, v4, v12

    .line 355
    .line 356
    add-int/lit8 v12, v8, 0x5

    .line 357
    .line 358
    and-int/lit8 v11, v11, 0xf

    .line 359
    .line 360
    aget-char v11, v13, v11

    .line 361
    .line 362
    int-to-byte v11, v11

    .line 363
    aput-byte v11, v4, v12

    .line 364
    .line 365
    goto/16 :goto_5

    .line 366
    .line 367
    :cond_b
    const v12, 0xd800

    .line 368
    .line 369
    .line 370
    const/16 v13, 0x3f

    .line 371
    .line 372
    if-lt v11, v12, :cond_10

    .line 373
    .line 374
    const v12, 0xe000

    .line 375
    .line 376
    .line 377
    if-ge v11, v12, :cond_10

    .line 378
    .line 379
    const v14, 0xdc00

    .line 380
    .line 381
    .line 382
    if-ge v11, v14, :cond_f

    .line 383
    .line 384
    array-length v15, v1

    .line 385
    sub-int/2addr v15, v5

    .line 386
    if-ge v15, v7, :cond_c

    .line 387
    .line 388
    const/4 v11, -0x1

    .line 389
    goto :goto_6

    .line 390
    :cond_c
    add-int/lit8 v15, v5, 0x1

    .line 391
    .line 392
    aget-char v15, v1, v15

    .line 393
    .line 394
    if-lt v15, v14, :cond_e

    .line 395
    .line 396
    if-ge v15, v12, :cond_e

    .line 397
    .line 398
    shl-int/lit8 v11, v11, 0xa

    .line 399
    .line 400
    add-int/2addr v11, v15

    .line 401
    const v12, -0x35fdc00

    .line 402
    .line 403
    .line 404
    add-int/2addr v11, v12

    .line 405
    :goto_6
    if-gez v11, :cond_d

    .line 406
    .line 407
    add-int/lit8 v11, v8, 0x1

    .line 408
    .line 409
    aput-byte v13, v4, v8

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_d
    shr-int/lit8 v12, v11, 0x12

    .line 413
    .line 414
    or-int/lit16 v12, v12, 0xf0

    .line 415
    .line 416
    int-to-byte v12, v12

    .line 417
    aput-byte v12, v4, v8

    .line 418
    .line 419
    add-int/lit8 v12, v8, 0x1

    .line 420
    .line 421
    shr-int/lit8 v14, v11, 0xc

    .line 422
    .line 423
    and-int/2addr v14, v13

    .line 424
    or-int/lit16 v14, v14, 0x80

    .line 425
    .line 426
    int-to-byte v14, v14

    .line 427
    aput-byte v14, v4, v12

    .line 428
    .line 429
    add-int/lit8 v12, v8, 0x2

    .line 430
    .line 431
    shr-int/lit8 v14, v11, 0x6

    .line 432
    .line 433
    and-int/2addr v13, v14

    .line 434
    or-int/lit16 v13, v13, 0x80

    .line 435
    .line 436
    int-to-byte v13, v13

    .line 437
    aput-byte v13, v4, v12

    .line 438
    .line 439
    add-int/lit8 v12, v8, 0x3

    .line 440
    .line 441
    and-int/lit8 v11, v11, 0x3f

    .line 442
    .line 443
    or-int/lit16 v11, v11, 0x80

    .line 444
    .line 445
    int-to-byte v11, v11

    .line 446
    aput-byte v11, v4, v12

    .line 447
    .line 448
    add-int/lit8 v11, v8, 0x4

    .line 449
    .line 450
    add-int/lit8 v5, v5, 0x1

    .line 451
    .line 452
    :goto_7
    move v8, v11

    .line 453
    goto :goto_8

    .line 454
    :cond_e
    add-int/lit8 v11, v8, 0x1

    .line 455
    .line 456
    aput-byte v13, v4, v8

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :cond_f
    add-int/lit8 v11, v8, 0x1

    .line 460
    .line 461
    aput-byte v13, v4, v8

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_10
    const/16 v12, 0x7ff

    .line 465
    .line 466
    if-le v11, v12, :cond_11

    .line 467
    .line 468
    shr-int/lit8 v12, v11, 0xc

    .line 469
    .line 470
    and-int/lit8 v12, v12, 0xf

    .line 471
    .line 472
    or-int/lit16 v12, v12, 0xe0

    .line 473
    .line 474
    int-to-byte v12, v12

    .line 475
    aput-byte v12, v4, v8

    .line 476
    .line 477
    add-int/lit8 v12, v8, 0x1

    .line 478
    .line 479
    shr-int/lit8 v14, v11, 0x6

    .line 480
    .line 481
    and-int/2addr v13, v14

    .line 482
    or-int/lit16 v13, v13, 0x80

    .line 483
    .line 484
    int-to-byte v13, v13

    .line 485
    aput-byte v13, v4, v12

    .line 486
    .line 487
    add-int/lit8 v12, v8, 0x2

    .line 488
    .line 489
    and-int/lit8 v11, v11, 0x3f

    .line 490
    .line 491
    or-int/lit16 v11, v11, 0x80

    .line 492
    .line 493
    int-to-byte v11, v11

    .line 494
    aput-byte v11, v4, v12

    .line 495
    .line 496
    add-int/lit8 v8, v8, 0x3

    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_11
    shr-int/lit8 v12, v11, 0x6

    .line 500
    .line 501
    and-int/lit8 v12, v12, 0x1f

    .line 502
    .line 503
    or-int/lit16 v12, v12, 0xc0

    .line 504
    .line 505
    int-to-byte v12, v12

    .line 506
    aput-byte v12, v4, v8

    .line 507
    .line 508
    add-int/lit8 v12, v8, 0x1

    .line 509
    .line 510
    and-int/lit8 v11, v11, 0x3f

    .line 511
    .line 512
    or-int/lit16 v11, v11, 0x80

    .line 513
    .line 514
    int-to-byte v11, v11

    .line 515
    aput-byte v11, v4, v12

    .line 516
    .line 517
    goto/16 :goto_4

    .line 518
    .line 519
    :goto_8
    add-int/2addr v5, v3

    .line 520
    goto/16 :goto_3

    .line 521
    .line 522
    :cond_12
    if-eqz p4, :cond_13

    .line 523
    .line 524
    add-int/lit8 v1, v8, 0x1

    .line 525
    .line 526
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 527
    .line 528
    int-to-byte v2, v2

    .line 529
    aput-byte v2, v4, v8

    .line 530
    .line 531
    move v8, v1

    .line 532
    :cond_13
    iput v8, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 533
    .line 534
    return-void

    .line 535
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

    .line 630
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    return-void

    .line 631
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->startArray()V

    const/4 v0, 0x0

    .line 632
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    if-eqz v0, :cond_1

    .line 633
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeComma()V

    .line 634
    :cond_1
    aget-object v1, p1, v0

    if-nez v1, :cond_3

    .line 635
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v1, v3

    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->isEnabled(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 636
    const-string v1, ""

    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 637
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    .line 638
    :cond_3
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeString(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 639
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->endArray()V

    return-void
.end method

.method public writeStringEscaped([B)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x6

    .line 6
    invoke-static {v1, v3, v0, v2}, Lp/a;->g(IIII)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 19
    .line 20
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 21
    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 23
    .line 24
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v0, v4

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    cmp-long v0, v0, v4

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v1

    .line 38
    :goto_0
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 39
    .line 40
    iget v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 41
    .line 42
    add-int/lit8 v6, v5, 0x1

    .line 43
    .line 44
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 45
    .line 46
    int-to-byte v7, v7

    .line 47
    aput-byte v7, v4, v5

    .line 48
    .line 49
    :goto_1
    array-length v5, p1

    .line 50
    if-ge v1, v5, :cond_7

    .line 51
    .line 52
    aget-byte v5, p1, v1

    .line 53
    .line 54
    const/16 v7, 0x28

    .line 55
    .line 56
    const/16 v8, 0x75

    .line 57
    .line 58
    const/16 v9, 0x30

    .line 59
    .line 60
    const/16 v10, 0x5c

    .line 61
    .line 62
    if-eq v5, v7, :cond_5

    .line 63
    .line 64
    const/16 v7, 0x29

    .line 65
    .line 66
    if-eq v5, v7, :cond_5

    .line 67
    .line 68
    const/16 v7, 0x3c

    .line 69
    .line 70
    if-eq v5, v7, :cond_5

    .line 71
    .line 72
    const/16 v7, 0x3e

    .line 73
    .line 74
    if-eq v5, v7, :cond_5

    .line 75
    .line 76
    if-eq v5, v10, :cond_4

    .line 77
    .line 78
    const/16 v7, 0x31

    .line 79
    .line 80
    packed-switch v5, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 84
    .line 85
    if-ne v5, v7, :cond_2

    .line 86
    .line 87
    aput-byte v10, v4, v6

    .line 88
    .line 89
    add-int/lit8 v5, v6, 0x1

    .line 90
    .line 91
    int-to-byte v7, v7

    .line 92
    aput-byte v7, v4, v5

    .line 93
    .line 94
    :goto_2
    add-int/lit8 v6, v6, 0x2

    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_2
    if-gez v5, :cond_3

    .line 99
    .line 100
    and-int/lit16 v7, v5, 0xff

    .line 101
    .line 102
    shr-int/2addr v7, v3

    .line 103
    or-int/lit16 v7, v7, 0xc0

    .line 104
    .line 105
    int-to-byte v7, v7

    .line 106
    aput-byte v7, v4, v6

    .line 107
    .line 108
    add-int/lit8 v7, v6, 0x1

    .line 109
    .line 110
    and-int/lit8 v5, v5, 0x3f

    .line 111
    .line 112
    or-int/lit16 v5, v5, 0x80

    .line 113
    .line 114
    int-to-byte v5, v5

    .line 115
    aput-byte v5, v4, v7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    add-int/lit8 v7, v6, 0x1

    .line 119
    .line 120
    aput-byte v5, v4, v6

    .line 121
    .line 122
    :goto_3
    move v6, v7

    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :pswitch_0
    aput-byte v10, v4, v6

    .line 126
    .line 127
    add-int/lit8 v10, v6, 0x1

    .line 128
    .line 129
    aput-byte v8, v4, v10

    .line 130
    .line 131
    add-int/lit8 v8, v6, 0x2

    .line 132
    .line 133
    aput-byte v9, v4, v8

    .line 134
    .line 135
    add-int/lit8 v8, v6, 0x3

    .line 136
    .line 137
    aput-byte v9, v4, v8

    .line 138
    .line 139
    add-int/lit8 v8, v6, 0x4

    .line 140
    .line 141
    aput-byte v7, v4, v8

    .line 142
    .line 143
    add-int/lit8 v7, v6, 0x5

    .line 144
    .line 145
    add-int/lit8 v5, v5, 0x47

    .line 146
    .line 147
    int-to-byte v5, v5

    .line 148
    aput-byte v5, v4, v7

    .line 149
    .line 150
    :goto_4
    add-int/lit8 v6, v6, 0x6

    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :pswitch_1
    aput-byte v10, v4, v6

    .line 155
    .line 156
    add-int/lit8 v10, v6, 0x1

    .line 157
    .line 158
    aput-byte v8, v4, v10

    .line 159
    .line 160
    add-int/lit8 v8, v6, 0x2

    .line 161
    .line 162
    aput-byte v9, v4, v8

    .line 163
    .line 164
    add-int/lit8 v8, v6, 0x3

    .line 165
    .line 166
    aput-byte v9, v4, v8

    .line 167
    .line 168
    add-int/lit8 v8, v6, 0x4

    .line 169
    .line 170
    aput-byte v7, v4, v8

    .line 171
    .line 172
    add-int/lit8 v7, v6, 0x5

    .line 173
    .line 174
    add-int/lit8 v5, v5, 0x20

    .line 175
    .line 176
    int-to-byte v5, v5

    .line 177
    aput-byte v5, v4, v7

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :pswitch_2
    aput-byte v10, v4, v6

    .line 181
    .line 182
    add-int/lit8 v5, v6, 0x1

    .line 183
    .line 184
    const/16 v7, 0x72

    .line 185
    .line 186
    aput-byte v7, v4, v5

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :pswitch_3
    aput-byte v10, v4, v6

    .line 190
    .line 191
    add-int/lit8 v5, v6, 0x1

    .line 192
    .line 193
    const/16 v7, 0x66

    .line 194
    .line 195
    aput-byte v7, v4, v5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :pswitch_4
    aput-byte v10, v4, v6

    .line 199
    .line 200
    add-int/lit8 v7, v6, 0x1

    .line 201
    .line 202
    aput-byte v8, v4, v7

    .line 203
    .line 204
    add-int/lit8 v7, v6, 0x2

    .line 205
    .line 206
    aput-byte v9, v4, v7

    .line 207
    .line 208
    add-int/lit8 v7, v6, 0x3

    .line 209
    .line 210
    aput-byte v9, v4, v7

    .line 211
    .line 212
    add-int/lit8 v7, v6, 0x4

    .line 213
    .line 214
    aput-byte v9, v4, v7

    .line 215
    .line 216
    add-int/lit8 v7, v6, 0x5

    .line 217
    .line 218
    add-int/lit8 v5, v5, 0x57

    .line 219
    .line 220
    int-to-byte v5, v5

    .line 221
    aput-byte v5, v4, v7

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :pswitch_5
    aput-byte v10, v4, v6

    .line 225
    .line 226
    add-int/lit8 v5, v6, 0x1

    .line 227
    .line 228
    const/16 v7, 0x6e

    .line 229
    .line 230
    aput-byte v7, v4, v5

    .line 231
    .line 232
    goto/16 :goto_2

    .line 233
    .line 234
    :pswitch_6
    aput-byte v10, v4, v6

    .line 235
    .line 236
    add-int/lit8 v5, v6, 0x1

    .line 237
    .line 238
    const/16 v7, 0x74

    .line 239
    .line 240
    aput-byte v7, v4, v5

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_7
    aput-byte v10, v4, v6

    .line 245
    .line 246
    add-int/lit8 v5, v6, 0x1

    .line 247
    .line 248
    const/16 v7, 0x62

    .line 249
    .line 250
    aput-byte v7, v4, v5

    .line 251
    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    :pswitch_8
    aput-byte v10, v4, v6

    .line 255
    .line 256
    add-int/lit8 v7, v6, 0x1

    .line 257
    .line 258
    aput-byte v8, v4, v7

    .line 259
    .line 260
    add-int/lit8 v7, v6, 0x2

    .line 261
    .line 262
    aput-byte v9, v4, v7

    .line 263
    .line 264
    add-int/lit8 v7, v6, 0x3

    .line 265
    .line 266
    aput-byte v9, v4, v7

    .line 267
    .line 268
    add-int/lit8 v7, v6, 0x4

    .line 269
    .line 270
    aput-byte v9, v4, v7

    .line 271
    .line 272
    add-int/lit8 v7, v6, 0x5

    .line 273
    .line 274
    add-int/lit8 v5, v5, 0x30

    .line 275
    .line 276
    int-to-byte v5, v5

    .line 277
    aput-byte v5, v4, v7

    .line 278
    .line 279
    goto/16 :goto_4

    .line 280
    .line 281
    :cond_4
    aput-byte v10, v4, v6

    .line 282
    .line 283
    add-int/lit8 v5, v6, 0x1

    .line 284
    .line 285
    aput-byte v10, v4, v5

    .line 286
    .line 287
    goto/16 :goto_2

    .line 288
    .line 289
    :cond_5
    if-eqz v0, :cond_6

    .line 290
    .line 291
    aput-byte v10, v4, v6

    .line 292
    .line 293
    add-int/lit8 v7, v6, 0x1

    .line 294
    .line 295
    aput-byte v8, v4, v7

    .line 296
    .line 297
    add-int/lit8 v7, v6, 0x2

    .line 298
    .line 299
    aput-byte v9, v4, v7

    .line 300
    .line 301
    add-int/lit8 v7, v6, 0x3

    .line 302
    .line 303
    aput-byte v9, v4, v7

    .line 304
    .line 305
    add-int/lit8 v7, v6, 0x4

    .line 306
    .line 307
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 308
    .line 309
    ushr-int/lit8 v9, v5, 0x4

    .line 310
    .line 311
    and-int/lit8 v9, v9, 0xf

    .line 312
    .line 313
    aget-char v9, v8, v9

    .line 314
    .line 315
    int-to-byte v9, v9

    .line 316
    aput-byte v9, v4, v7

    .line 317
    .line 318
    add-int/lit8 v7, v6, 0x5

    .line 319
    .line 320
    and-int/lit8 v5, v5, 0xf

    .line 321
    .line 322
    aget-char v5, v8, v5

    .line 323
    .line 324
    int-to-byte v5, v5

    .line 325
    aput-byte v5, v4, v7

    .line 326
    .line 327
    goto/16 :goto_4

    .line 328
    .line 329
    :cond_6
    add-int/lit8 v7, v6, 0x1

    .line 330
    .line 331
    aput-byte v5, v4, v6

    .line 332
    .line 333
    goto/16 :goto_3

    .line 334
    .line 335
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 336
    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :cond_7
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 340
    .line 341
    int-to-byte p1, p1

    .line 342
    aput-byte p1, v4, v6

    .line 343
    .line 344
    add-int/2addr v6, v2

    .line 345
    iput v6, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 346
    .line 347
    return-void

    .line 348
    nop

    .line 349
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

.method public final writeStringEscapedRest([CIZZI)V
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    sub-int/2addr v0, p5

    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-static {v0, v2, v1, v3}, Lp/a;->g(IIII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 22
    .line 23
    :goto_0
    if-ge p5, p2, :cond_d

    .line 24
    .line 25
    aget-char v2, p1, p5

    .line 26
    .line 27
    const/16 v4, 0x7f

    .line 28
    .line 29
    const/16 v5, 0x75

    .line 30
    .line 31
    const/16 v6, 0x5c

    .line 32
    .line 33
    if-gt v2, v4, :cond_5

    .line 34
    .line 35
    const/16 v4, 0x28

    .line 36
    .line 37
    const/16 v7, 0x30

    .line 38
    .line 39
    if-eq v2, v4, :cond_3

    .line 40
    .line 41
    const/16 v4, 0x29

    .line 42
    .line 43
    if-eq v2, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0x3c

    .line 46
    .line 47
    if-eq v2, v4, :cond_3

    .line 48
    .line 49
    const/16 v4, 0x3e

    .line 50
    .line 51
    if-eq v2, v4, :cond_3

    .line 52
    .line 53
    if-eq v2, v6, :cond_2

    .line 54
    .line 55
    const/16 v4, 0x31

    .line 56
    .line 57
    packed-switch v2, :pswitch_data_0

    .line 58
    .line 59
    .line 60
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 61
    .line 62
    if-ne v2, v4, :cond_1

    .line 63
    .line 64
    aput-byte v6, v0, v1

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    int-to-byte v4, v4

    .line 69
    aput-byte v4, v0, v2

    .line 70
    .line 71
    :goto_1
    add-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_1
    add-int/lit8 v4, v1, 0x1

    .line 76
    .line 77
    int-to-byte v2, v2

    .line 78
    aput-byte v2, v0, v1

    .line 79
    .line 80
    :goto_2
    move v1, v4

    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :pswitch_0
    aput-byte v6, v0, v1

    .line 84
    .line 85
    add-int/lit8 v6, v1, 0x1

    .line 86
    .line 87
    aput-byte v5, v0, v6

    .line 88
    .line 89
    add-int/lit8 v5, v1, 0x2

    .line 90
    .line 91
    aput-byte v7, v0, v5

    .line 92
    .line 93
    add-int/lit8 v5, v1, 0x3

    .line 94
    .line 95
    aput-byte v7, v0, v5

    .line 96
    .line 97
    add-int/lit8 v5, v1, 0x4

    .line 98
    .line 99
    aput-byte v4, v0, v5

    .line 100
    .line 101
    add-int/lit8 v4, v1, 0x5

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x47

    .line 104
    .line 105
    int-to-byte v2, v2

    .line 106
    aput-byte v2, v0, v4

    .line 107
    .line 108
    :goto_3
    add-int/lit8 v1, v1, 0x6

    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :pswitch_1
    aput-byte v6, v0, v1

    .line 113
    .line 114
    add-int/lit8 v6, v1, 0x1

    .line 115
    .line 116
    aput-byte v5, v0, v6

    .line 117
    .line 118
    add-int/lit8 v5, v1, 0x2

    .line 119
    .line 120
    aput-byte v7, v0, v5

    .line 121
    .line 122
    add-int/lit8 v5, v1, 0x3

    .line 123
    .line 124
    aput-byte v7, v0, v5

    .line 125
    .line 126
    add-int/lit8 v5, v1, 0x4

    .line 127
    .line 128
    aput-byte v4, v0, v5

    .line 129
    .line 130
    add-int/lit8 v4, v1, 0x5

    .line 131
    .line 132
    add-int/lit8 v2, v2, 0x20

    .line 133
    .line 134
    int-to-byte v2, v2

    .line 135
    aput-byte v2, v0, v4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :pswitch_2
    aput-byte v6, v0, v1

    .line 139
    .line 140
    add-int/lit8 v2, v1, 0x1

    .line 141
    .line 142
    const/16 v4, 0x72

    .line 143
    .line 144
    aput-byte v4, v0, v2

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_3
    aput-byte v6, v0, v1

    .line 148
    .line 149
    add-int/lit8 v2, v1, 0x1

    .line 150
    .line 151
    const/16 v4, 0x66

    .line 152
    .line 153
    aput-byte v4, v0, v2

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :pswitch_4
    aput-byte v6, v0, v1

    .line 157
    .line 158
    add-int/lit8 v4, v1, 0x1

    .line 159
    .line 160
    aput-byte v5, v0, v4

    .line 161
    .line 162
    add-int/lit8 v4, v1, 0x2

    .line 163
    .line 164
    aput-byte v7, v0, v4

    .line 165
    .line 166
    add-int/lit8 v4, v1, 0x3

    .line 167
    .line 168
    aput-byte v7, v0, v4

    .line 169
    .line 170
    add-int/lit8 v4, v1, 0x4

    .line 171
    .line 172
    aput-byte v7, v0, v4

    .line 173
    .line 174
    add-int/lit8 v4, v1, 0x5

    .line 175
    .line 176
    add-int/lit8 v2, v2, 0x57

    .line 177
    .line 178
    int-to-byte v2, v2

    .line 179
    aput-byte v2, v0, v4

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :pswitch_5
    aput-byte v6, v0, v1

    .line 183
    .line 184
    add-int/lit8 v2, v1, 0x1

    .line 185
    .line 186
    const/16 v4, 0x6e

    .line 187
    .line 188
    aput-byte v4, v0, v2

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :pswitch_6
    aput-byte v6, v0, v1

    .line 192
    .line 193
    add-int/lit8 v2, v1, 0x1

    .line 194
    .line 195
    const/16 v4, 0x74

    .line 196
    .line 197
    aput-byte v4, v0, v2

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :pswitch_7
    aput-byte v6, v0, v1

    .line 202
    .line 203
    add-int/lit8 v2, v1, 0x1

    .line 204
    .line 205
    const/16 v4, 0x62

    .line 206
    .line 207
    aput-byte v4, v0, v2

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :pswitch_8
    aput-byte v6, v0, v1

    .line 212
    .line 213
    add-int/lit8 v4, v1, 0x1

    .line 214
    .line 215
    aput-byte v5, v0, v4

    .line 216
    .line 217
    add-int/lit8 v4, v1, 0x2

    .line 218
    .line 219
    aput-byte v7, v0, v4

    .line 220
    .line 221
    add-int/lit8 v4, v1, 0x3

    .line 222
    .line 223
    aput-byte v7, v0, v4

    .line 224
    .line 225
    add-int/lit8 v4, v1, 0x4

    .line 226
    .line 227
    aput-byte v7, v0, v4

    .line 228
    .line 229
    add-int/lit8 v4, v1, 0x5

    .line 230
    .line 231
    add-int/lit8 v2, v2, 0x30

    .line 232
    .line 233
    int-to-byte v2, v2

    .line 234
    aput-byte v2, v0, v4

    .line 235
    .line 236
    goto/16 :goto_3

    .line 237
    .line 238
    :cond_2
    aput-byte v6, v0, v1

    .line 239
    .line 240
    add-int/lit8 v2, v1, 0x1

    .line 241
    .line 242
    aput-byte v6, v0, v2

    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :cond_3
    if-eqz p3, :cond_4

    .line 247
    .line 248
    aput-byte v6, v0, v1

    .line 249
    .line 250
    add-int/lit8 v4, v1, 0x1

    .line 251
    .line 252
    aput-byte v5, v0, v4

    .line 253
    .line 254
    add-int/lit8 v4, v1, 0x2

    .line 255
    .line 256
    aput-byte v7, v0, v4

    .line 257
    .line 258
    add-int/lit8 v4, v1, 0x3

    .line 259
    .line 260
    aput-byte v7, v0, v4

    .line 261
    .line 262
    add-int/lit8 v4, v1, 0x4

    .line 263
    .line 264
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 265
    .line 266
    ushr-int/lit8 v6, v2, 0x4

    .line 267
    .line 268
    and-int/lit8 v6, v6, 0xf

    .line 269
    .line 270
    aget-char v6, v5, v6

    .line 271
    .line 272
    int-to-byte v6, v6

    .line 273
    aput-byte v6, v0, v4

    .line 274
    .line 275
    add-int/lit8 v4, v1, 0x5

    .line 276
    .line 277
    and-int/lit8 v2, v2, 0xf

    .line 278
    .line 279
    aget-char v2, v5, v2

    .line 280
    .line 281
    int-to-byte v2, v2

    .line 282
    aput-byte v2, v0, v4

    .line 283
    .line 284
    goto/16 :goto_3

    .line 285
    .line 286
    :cond_4
    add-int/lit8 v4, v1, 0x1

    .line 287
    .line 288
    int-to-byte v2, v2

    .line 289
    aput-byte v2, v0, v1

    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :cond_5
    if-eqz p4, :cond_6

    .line 294
    .line 295
    aput-byte v6, v0, v1

    .line 296
    .line 297
    add-int/lit8 v4, v1, 0x1

    .line 298
    .line 299
    aput-byte v5, v0, v4

    .line 300
    .line 301
    add-int/lit8 v4, v1, 0x2

    .line 302
    .line 303
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 304
    .line 305
    ushr-int/lit8 v6, v2, 0xc

    .line 306
    .line 307
    and-int/lit8 v6, v6, 0xf

    .line 308
    .line 309
    aget-char v6, v5, v6

    .line 310
    .line 311
    int-to-byte v6, v6

    .line 312
    aput-byte v6, v0, v4

    .line 313
    .line 314
    add-int/lit8 v4, v1, 0x3

    .line 315
    .line 316
    ushr-int/lit8 v6, v2, 0x8

    .line 317
    .line 318
    and-int/lit8 v6, v6, 0xf

    .line 319
    .line 320
    aget-char v6, v5, v6

    .line 321
    .line 322
    int-to-byte v6, v6

    .line 323
    aput-byte v6, v0, v4

    .line 324
    .line 325
    add-int/lit8 v4, v1, 0x4

    .line 326
    .line 327
    ushr-int/lit8 v6, v2, 0x4

    .line 328
    .line 329
    and-int/lit8 v6, v6, 0xf

    .line 330
    .line 331
    aget-char v6, v5, v6

    .line 332
    .line 333
    int-to-byte v6, v6

    .line 334
    aput-byte v6, v0, v4

    .line 335
    .line 336
    add-int/lit8 v4, v1, 0x5

    .line 337
    .line 338
    and-int/lit8 v2, v2, 0xf

    .line 339
    .line 340
    aget-char v2, v5, v2

    .line 341
    .line 342
    int-to-byte v2, v2

    .line 343
    aput-byte v2, v0, v4

    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_6
    const v4, 0xd800

    .line 348
    .line 349
    .line 350
    const/16 v5, 0x3f

    .line 351
    .line 352
    if-lt v2, v4, :cond_b

    .line 353
    .line 354
    const v4, 0xe000

    .line 355
    .line 356
    .line 357
    if-ge v2, v4, :cond_b

    .line 358
    .line 359
    const v6, 0xdc00

    .line 360
    .line 361
    .line 362
    if-ge v2, v6, :cond_a

    .line 363
    .line 364
    array-length v7, p1

    .line 365
    sub-int/2addr v7, p5

    .line 366
    if-ge v7, v3, :cond_7

    .line 367
    .line 368
    const/4 v2, -0x1

    .line 369
    goto :goto_4

    .line 370
    :cond_7
    add-int/lit8 v7, p5, 0x1

    .line 371
    .line 372
    aget-char v7, p1, v7

    .line 373
    .line 374
    if-lt v7, v6, :cond_9

    .line 375
    .line 376
    if-ge v7, v4, :cond_9

    .line 377
    .line 378
    shl-int/lit8 v2, v2, 0xa

    .line 379
    .line 380
    add-int/2addr v2, v7

    .line 381
    const v4, -0x35fdc00

    .line 382
    .line 383
    .line 384
    add-int/2addr v2, v4

    .line 385
    :goto_4
    if-gez v2, :cond_8

    .line 386
    .line 387
    add-int/lit8 v2, v1, 0x1

    .line 388
    .line 389
    aput-byte v5, v0, v1

    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_8
    shr-int/lit8 v4, v2, 0x12

    .line 393
    .line 394
    or-int/lit16 v4, v4, 0xf0

    .line 395
    .line 396
    int-to-byte v4, v4

    .line 397
    aput-byte v4, v0, v1

    .line 398
    .line 399
    add-int/lit8 v4, v1, 0x1

    .line 400
    .line 401
    shr-int/lit8 v6, v2, 0xc

    .line 402
    .line 403
    and-int/2addr v6, v5

    .line 404
    or-int/lit16 v6, v6, 0x80

    .line 405
    .line 406
    int-to-byte v6, v6

    .line 407
    aput-byte v6, v0, v4

    .line 408
    .line 409
    add-int/lit8 v4, v1, 0x2

    .line 410
    .line 411
    shr-int/lit8 v6, v2, 0x6

    .line 412
    .line 413
    and-int/2addr v5, v6

    .line 414
    or-int/lit16 v5, v5, 0x80

    .line 415
    .line 416
    int-to-byte v5, v5

    .line 417
    aput-byte v5, v0, v4

    .line 418
    .line 419
    add-int/lit8 v4, v1, 0x3

    .line 420
    .line 421
    and-int/lit8 v2, v2, 0x3f

    .line 422
    .line 423
    or-int/lit16 v2, v2, 0x80

    .line 424
    .line 425
    int-to-byte v2, v2

    .line 426
    aput-byte v2, v0, v4

    .line 427
    .line 428
    add-int/lit8 v2, v1, 0x4

    .line 429
    .line 430
    add-int/lit8 p5, p5, 0x1

    .line 431
    .line 432
    :goto_5
    move v1, v2

    .line 433
    goto :goto_6

    .line 434
    :cond_9
    add-int/lit8 v2, v1, 0x1

    .line 435
    .line 436
    aput-byte v5, v0, v1

    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_a
    add-int/lit8 v2, v1, 0x1

    .line 440
    .line 441
    aput-byte v5, v0, v1

    .line 442
    .line 443
    goto :goto_5

    .line 444
    :cond_b
    const/16 v4, 0x7ff

    .line 445
    .line 446
    if-le v2, v4, :cond_c

    .line 447
    .line 448
    shr-int/lit8 v4, v2, 0xc

    .line 449
    .line 450
    and-int/lit8 v4, v4, 0xf

    .line 451
    .line 452
    or-int/lit16 v4, v4, 0xe0

    .line 453
    .line 454
    int-to-byte v4, v4

    .line 455
    aput-byte v4, v0, v1

    .line 456
    .line 457
    add-int/lit8 v4, v1, 0x1

    .line 458
    .line 459
    shr-int/lit8 v6, v2, 0x6

    .line 460
    .line 461
    and-int/2addr v5, v6

    .line 462
    or-int/lit16 v5, v5, 0x80

    .line 463
    .line 464
    int-to-byte v5, v5

    .line 465
    aput-byte v5, v0, v4

    .line 466
    .line 467
    add-int/lit8 v4, v1, 0x2

    .line 468
    .line 469
    and-int/lit8 v2, v2, 0x3f

    .line 470
    .line 471
    or-int/lit16 v2, v2, 0x80

    .line 472
    .line 473
    int-to-byte v2, v2

    .line 474
    aput-byte v2, v0, v4

    .line 475
    .line 476
    add-int/lit8 v1, v1, 0x3

    .line 477
    .line 478
    goto :goto_6

    .line 479
    :cond_c
    shr-int/lit8 v4, v2, 0x6

    .line 480
    .line 481
    and-int/lit8 v4, v4, 0x1f

    .line 482
    .line 483
    or-int/lit16 v4, v4, 0xc0

    .line 484
    .line 485
    int-to-byte v4, v4

    .line 486
    aput-byte v4, v0, v1

    .line 487
    .line 488
    add-int/lit8 v4, v1, 0x1

    .line 489
    .line 490
    and-int/lit8 v2, v2, 0x3f

    .line 491
    .line 492
    or-int/lit16 v2, v2, 0x80

    .line 493
    .line 494
    int-to-byte v2, v2

    .line 495
    aput-byte v2, v0, v4

    .line 496
    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :goto_6
    add-int/lit8 p5, p5, 0x1

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :cond_d
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 504
    .line 505
    return-void

    .line 506
    nop

    .line 507
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
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 28
    .line 29
    int-to-byte v3, v3

    .line 30
    move v4, v1

    .line 31
    :goto_1
    array-length v5, p1

    .line 32
    if-ge v4, v5, :cond_4

    .line 33
    .line 34
    aget-byte v5, p1, v4

    .line 35
    .line 36
    if-eq v5, v3, :cond_3

    .line 37
    .line 38
    const/16 v6, 0x5c

    .line 39
    .line 40
    if-eq v5, v6, :cond_3

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    if-lt v5, v6, :cond_3

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/16 v6, 0x3c

    .line 49
    .line 50
    if-eq v5, v6, :cond_3

    .line 51
    .line 52
    const/16 v6, 0x3e

    .line 53
    .line 54
    if-eq v5, v6, :cond_3

    .line 55
    .line 56
    const/16 v6, 0x28

    .line 57
    .line 58
    if-eq v5, v6, :cond_3

    .line 59
    .line 60
    const/16 v6, 0x29

    .line 61
    .line 62
    if-ne v5, v6, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    move v0, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v0, v1

    .line 71
    :goto_3
    iget v4, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 72
    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    array-length v0, p1

    .line 76
    add-int/2addr v0, v4

    .line 77
    add-int/lit8 v0, v0, 0x2

    .line 78
    .line 79
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 80
    .line 81
    array-length v5, v5

    .line 82
    if-lt v0, v5, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 85
    .line 86
    .line 87
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 88
    .line 89
    aput-byte v3, v0, v4

    .line 90
    .line 91
    add-int/lit8 v5, v4, 0x1

    .line 92
    .line 93
    array-length v6, p1

    .line 94
    invoke-static {p1, v1, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    array-length p1, p1

    .line 98
    add-int/2addr p1, v2

    .line 99
    add-int/2addr p1, v4

    .line 100
    aput-byte v3, v0, p1

    .line 101
    .line 102
    add-int/2addr p1, v2

    .line 103
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 104
    .line 105
    return-void

    .line 106
    :cond_6
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->writeStringEscaped([B)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public writeStringUTF16([B)V
    .locals 14

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
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

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
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

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
    const/4 v5, 0x4

    .line 43
    const/4 v7, 0x2

    .line 44
    invoke-static {v4, v5, v1, v7}, Lp/a;->g(IIII)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    array-length v5, p1

    .line 51
    mul-int/2addr v5, v7

    .line 52
    add-int/2addr v4, v5

    .line 53
    :cond_3
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 54
    .line 55
    array-length v5, v5

    .line 56
    if-lt v4, v5, :cond_4

    .line 57
    .line 58
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 59
    .line 60
    .line 61
    :cond_4
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 62
    .line 63
    add-int/lit8 v5, v1, 0x1

    .line 64
    .line 65
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 66
    .line 67
    int-to-byte v8, v8

    .line 68
    aput-byte v8, v4, v1

    .line 69
    .line 70
    :goto_2
    array-length v1, p1

    .line 71
    if-ge v3, v1, :cond_11

    .line 72
    .line 73
    add-int/lit8 v1, v3, 0x1

    .line 74
    .line 75
    aget-byte v8, p1, v3

    .line 76
    .line 77
    add-int/lit8 v9, v3, 0x2

    .line 78
    .line 79
    aget-byte v1, p1, v1

    .line 80
    .line 81
    const/16 v10, 0x75

    .line 82
    .line 83
    const/16 v11, 0x5c

    .line 84
    .line 85
    if-nez v1, :cond_9

    .line 86
    .line 87
    if-ltz v8, :cond_9

    .line 88
    .line 89
    const/16 v1, 0x28

    .line 90
    .line 91
    const/16 v3, 0x30

    .line 92
    .line 93
    if-eq v8, v1, :cond_7

    .line 94
    .line 95
    const/16 v1, 0x29

    .line 96
    .line 97
    if-eq v8, v1, :cond_7

    .line 98
    .line 99
    const/16 v1, 0x3c

    .line 100
    .line 101
    if-eq v8, v1, :cond_7

    .line 102
    .line 103
    const/16 v1, 0x3e

    .line 104
    .line 105
    if-eq v8, v1, :cond_7

    .line 106
    .line 107
    if-eq v8, v11, :cond_6

    .line 108
    .line 109
    const/16 v1, 0x31

    .line 110
    .line 111
    packed-switch v8, :pswitch_data_0

    .line 112
    .line 113
    .line 114
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 115
    .line 116
    if-ne v8, v1, :cond_5

    .line 117
    .line 118
    aput-byte v11, v4, v5

    .line 119
    .line 120
    add-int/lit8 v3, v5, 0x1

    .line 121
    .line 122
    int-to-byte v1, v1

    .line 123
    aput-byte v1, v4, v3

    .line 124
    .line 125
    :goto_3
    add-int/lit8 v5, v5, 0x2

    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :cond_5
    add-int/lit8 v1, v5, 0x1

    .line 130
    .line 131
    aput-byte v8, v4, v5

    .line 132
    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :pswitch_0
    aput-byte v11, v4, v5

    .line 136
    .line 137
    add-int/lit8 v11, v5, 0x1

    .line 138
    .line 139
    aput-byte v10, v4, v11

    .line 140
    .line 141
    add-int/lit8 v10, v5, 0x2

    .line 142
    .line 143
    aput-byte v3, v4, v10

    .line 144
    .line 145
    add-int/lit8 v10, v5, 0x3

    .line 146
    .line 147
    aput-byte v3, v4, v10

    .line 148
    .line 149
    add-int/lit8 v3, v5, 0x4

    .line 150
    .line 151
    aput-byte v1, v4, v3

    .line 152
    .line 153
    add-int/lit8 v1, v5, 0x5

    .line 154
    .line 155
    add-int/lit8 v8, v8, 0x47

    .line 156
    .line 157
    int-to-byte v3, v8

    .line 158
    aput-byte v3, v4, v1

    .line 159
    .line 160
    :goto_4
    add-int/lit8 v5, v5, 0x6

    .line 161
    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :pswitch_1
    aput-byte v11, v4, v5

    .line 165
    .line 166
    add-int/lit8 v11, v5, 0x1

    .line 167
    .line 168
    aput-byte v10, v4, v11

    .line 169
    .line 170
    add-int/lit8 v10, v5, 0x2

    .line 171
    .line 172
    aput-byte v3, v4, v10

    .line 173
    .line 174
    add-int/lit8 v10, v5, 0x3

    .line 175
    .line 176
    aput-byte v3, v4, v10

    .line 177
    .line 178
    add-int/lit8 v3, v5, 0x4

    .line 179
    .line 180
    aput-byte v1, v4, v3

    .line 181
    .line 182
    add-int/lit8 v1, v5, 0x5

    .line 183
    .line 184
    add-int/lit8 v8, v8, 0x20

    .line 185
    .line 186
    int-to-byte v3, v8

    .line 187
    aput-byte v3, v4, v1

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :pswitch_2
    aput-byte v11, v4, v5

    .line 191
    .line 192
    add-int/lit8 v1, v5, 0x1

    .line 193
    .line 194
    const/16 v3, 0x72

    .line 195
    .line 196
    aput-byte v3, v4, v1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_3
    aput-byte v11, v4, v5

    .line 200
    .line 201
    add-int/lit8 v1, v5, 0x1

    .line 202
    .line 203
    const/16 v3, 0x66

    .line 204
    .line 205
    aput-byte v3, v4, v1

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :pswitch_4
    aput-byte v11, v4, v5

    .line 209
    .line 210
    add-int/lit8 v1, v5, 0x1

    .line 211
    .line 212
    aput-byte v10, v4, v1

    .line 213
    .line 214
    add-int/lit8 v1, v5, 0x2

    .line 215
    .line 216
    aput-byte v3, v4, v1

    .line 217
    .line 218
    add-int/lit8 v1, v5, 0x3

    .line 219
    .line 220
    aput-byte v3, v4, v1

    .line 221
    .line 222
    add-int/lit8 v1, v5, 0x4

    .line 223
    .line 224
    aput-byte v3, v4, v1

    .line 225
    .line 226
    add-int/lit8 v1, v5, 0x5

    .line 227
    .line 228
    add-int/lit8 v8, v8, 0x57

    .line 229
    .line 230
    int-to-byte v3, v8

    .line 231
    aput-byte v3, v4, v1

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :pswitch_5
    aput-byte v11, v4, v5

    .line 235
    .line 236
    add-int/lit8 v1, v5, 0x1

    .line 237
    .line 238
    const/16 v3, 0x6e

    .line 239
    .line 240
    aput-byte v3, v4, v1

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :pswitch_6
    aput-byte v11, v4, v5

    .line 244
    .line 245
    add-int/lit8 v1, v5, 0x1

    .line 246
    .line 247
    const/16 v3, 0x74

    .line 248
    .line 249
    aput-byte v3, v4, v1

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :pswitch_7
    aput-byte v11, v4, v5

    .line 253
    .line 254
    add-int/lit8 v1, v5, 0x1

    .line 255
    .line 256
    const/16 v3, 0x62

    .line 257
    .line 258
    aput-byte v3, v4, v1

    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :pswitch_8
    aput-byte v11, v4, v5

    .line 263
    .line 264
    add-int/lit8 v1, v5, 0x1

    .line 265
    .line 266
    aput-byte v10, v4, v1

    .line 267
    .line 268
    add-int/lit8 v1, v5, 0x2

    .line 269
    .line 270
    aput-byte v3, v4, v1

    .line 271
    .line 272
    add-int/lit8 v1, v5, 0x3

    .line 273
    .line 274
    aput-byte v3, v4, v1

    .line 275
    .line 276
    add-int/lit8 v1, v5, 0x4

    .line 277
    .line 278
    aput-byte v3, v4, v1

    .line 279
    .line 280
    add-int/lit8 v1, v5, 0x5

    .line 281
    .line 282
    add-int/lit8 v8, v8, 0x30

    .line 283
    .line 284
    int-to-byte v3, v8

    .line 285
    aput-byte v3, v4, v1

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_6
    aput-byte v11, v4, v5

    .line 289
    .line 290
    add-int/lit8 v1, v5, 0x1

    .line 291
    .line 292
    aput-byte v11, v4, v1

    .line 293
    .line 294
    goto/16 :goto_3

    .line 295
    .line 296
    :cond_7
    if-eqz v0, :cond_8

    .line 297
    .line 298
    aput-byte v11, v4, v5

    .line 299
    .line 300
    add-int/lit8 v1, v5, 0x1

    .line 301
    .line 302
    aput-byte v10, v4, v1

    .line 303
    .line 304
    add-int/lit8 v1, v5, 0x2

    .line 305
    .line 306
    aput-byte v3, v4, v1

    .line 307
    .line 308
    add-int/lit8 v1, v5, 0x3

    .line 309
    .line 310
    aput-byte v3, v4, v1

    .line 311
    .line 312
    add-int/lit8 v1, v5, 0x4

    .line 313
    .line 314
    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 315
    .line 316
    ushr-int/lit8 v10, v8, 0x4

    .line 317
    .line 318
    and-int/lit8 v10, v10, 0xf

    .line 319
    .line 320
    aget-char v10, v3, v10

    .line 321
    .line 322
    int-to-byte v10, v10

    .line 323
    aput-byte v10, v4, v1

    .line 324
    .line 325
    add-int/lit8 v1, v5, 0x5

    .line 326
    .line 327
    and-int/lit8 v8, v8, 0xf

    .line 328
    .line 329
    aget-char v3, v3, v8

    .line 330
    .line 331
    int-to-byte v3, v3

    .line 332
    aput-byte v3, v4, v1

    .line 333
    .line 334
    goto/16 :goto_4

    .line 335
    .line 336
    :cond_8
    add-int/lit8 v1, v5, 0x1

    .line 337
    .line 338
    aput-byte v8, v4, v5

    .line 339
    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :cond_9
    and-int/lit16 v8, v8, 0xff

    .line 343
    .line 344
    and-int/lit16 v1, v1, 0xff

    .line 345
    .line 346
    shl-int/lit8 v1, v1, 0x8

    .line 347
    .line 348
    or-int/2addr v1, v8

    .line 349
    int-to-char v1, v1

    .line 350
    const/16 v8, 0x800

    .line 351
    .line 352
    if-ge v1, v8, :cond_a

    .line 353
    .line 354
    shr-int/lit8 v3, v1, 0x6

    .line 355
    .line 356
    or-int/lit16 v3, v3, 0xc0

    .line 357
    .line 358
    int-to-byte v3, v3

    .line 359
    aput-byte v3, v4, v5

    .line 360
    .line 361
    add-int/lit8 v3, v5, 0x1

    .line 362
    .line 363
    and-int/lit8 v1, v1, 0x3f

    .line 364
    .line 365
    or-int/lit16 v1, v1, 0x80

    .line 366
    .line 367
    int-to-byte v1, v1

    .line 368
    aput-byte v1, v4, v3

    .line 369
    .line 370
    goto/16 :goto_3

    .line 371
    .line 372
    :cond_a
    if-eqz v2, :cond_b

    .line 373
    .line 374
    aput-byte v11, v4, v5

    .line 375
    .line 376
    add-int/lit8 v3, v5, 0x1

    .line 377
    .line 378
    aput-byte v10, v4, v3

    .line 379
    .line 380
    add-int/lit8 v3, v5, 0x2

    .line 381
    .line 382
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter;->DIGITS:[C

    .line 383
    .line 384
    ushr-int/lit8 v10, v1, 0xc

    .line 385
    .line 386
    and-int/lit8 v10, v10, 0xf

    .line 387
    .line 388
    aget-char v10, v8, v10

    .line 389
    .line 390
    int-to-byte v10, v10

    .line 391
    aput-byte v10, v4, v3

    .line 392
    .line 393
    add-int/lit8 v3, v5, 0x3

    .line 394
    .line 395
    ushr-int/lit8 v10, v1, 0x8

    .line 396
    .line 397
    and-int/lit8 v10, v10, 0xf

    .line 398
    .line 399
    aget-char v10, v8, v10

    .line 400
    .line 401
    int-to-byte v10, v10

    .line 402
    aput-byte v10, v4, v3

    .line 403
    .line 404
    add-int/lit8 v3, v5, 0x4

    .line 405
    .line 406
    ushr-int/lit8 v10, v1, 0x4

    .line 407
    .line 408
    and-int/lit8 v10, v10, 0xf

    .line 409
    .line 410
    aget-char v10, v8, v10

    .line 411
    .line 412
    int-to-byte v10, v10

    .line 413
    aput-byte v10, v4, v3

    .line 414
    .line 415
    add-int/lit8 v3, v5, 0x5

    .line 416
    .line 417
    and-int/lit8 v1, v1, 0xf

    .line 418
    .line 419
    aget-char v1, v8, v1

    .line 420
    .line 421
    int-to-byte v1, v1

    .line 422
    aput-byte v1, v4, v3

    .line 423
    .line 424
    goto/16 :goto_4

    .line 425
    .line 426
    :cond_b
    const v8, 0xd800

    .line 427
    .line 428
    .line 429
    const/16 v10, 0x3f

    .line 430
    .line 431
    if-lt v1, v8, :cond_10

    .line 432
    .line 433
    const v8, 0xe000

    .line 434
    .line 435
    .line 436
    if-ge v1, v8, :cond_10

    .line 437
    .line 438
    add-int/lit8 v11, v3, 0x1

    .line 439
    .line 440
    const v12, 0xdc00

    .line 441
    .line 442
    .line 443
    if-ge v1, v12, :cond_f

    .line 444
    .line 445
    array-length v13, p1

    .line 446
    sub-int/2addr v13, v11

    .line 447
    if-ge v13, v7, :cond_c

    .line 448
    .line 449
    const/4 v1, -0x1

    .line 450
    goto :goto_5

    .line 451
    :cond_c
    add-int/lit8 v11, v3, 0x2

    .line 452
    .line 453
    aget-byte v11, p1, v11

    .line 454
    .line 455
    add-int/lit8 v13, v3, 0x3

    .line 456
    .line 457
    aget-byte v13, p1, v13

    .line 458
    .line 459
    and-int/lit16 v11, v11, 0xff

    .line 460
    .line 461
    and-int/lit16 v13, v13, 0xff

    .line 462
    .line 463
    shl-int/lit8 v13, v13, 0x8

    .line 464
    .line 465
    or-int/2addr v11, v13

    .line 466
    int-to-char v11, v11

    .line 467
    if-lt v11, v12, :cond_e

    .line 468
    .line 469
    if-ge v11, v8, :cond_e

    .line 470
    .line 471
    add-int/lit8 v9, v3, 0x4

    .line 472
    .line 473
    shl-int/lit8 v1, v1, 0xa

    .line 474
    .line 475
    add-int/2addr v1, v11

    .line 476
    const v3, -0x35fdc00

    .line 477
    .line 478
    .line 479
    add-int/2addr v1, v3

    .line 480
    :goto_5
    if-gez v1, :cond_d

    .line 481
    .line 482
    add-int/lit8 v1, v5, 0x1

    .line 483
    .line 484
    aput-byte v10, v4, v5

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_d
    shr-int/lit8 v3, v1, 0x12

    .line 488
    .line 489
    or-int/lit16 v3, v3, 0xf0

    .line 490
    .line 491
    int-to-byte v3, v3

    .line 492
    aput-byte v3, v4, v5

    .line 493
    .line 494
    add-int/lit8 v3, v5, 0x1

    .line 495
    .line 496
    shr-int/lit8 v8, v1, 0xc

    .line 497
    .line 498
    and-int/2addr v8, v10

    .line 499
    or-int/lit16 v8, v8, 0x80

    .line 500
    .line 501
    int-to-byte v8, v8

    .line 502
    aput-byte v8, v4, v3

    .line 503
    .line 504
    add-int/lit8 v3, v5, 0x2

    .line 505
    .line 506
    shr-int/lit8 v8, v1, 0x6

    .line 507
    .line 508
    and-int/2addr v8, v10

    .line 509
    or-int/lit16 v8, v8, 0x80

    .line 510
    .line 511
    int-to-byte v8, v8

    .line 512
    aput-byte v8, v4, v3

    .line 513
    .line 514
    add-int/lit8 v3, v5, 0x3

    .line 515
    .line 516
    and-int/lit8 v1, v1, 0x3f

    .line 517
    .line 518
    or-int/lit16 v1, v1, 0x80

    .line 519
    .line 520
    int-to-byte v1, v1

    .line 521
    aput-byte v1, v4, v3

    .line 522
    .line 523
    add-int/lit8 v1, v5, 0x4

    .line 524
    .line 525
    goto :goto_6

    .line 526
    :cond_e
    add-int/lit8 v1, v5, 0x1

    .line 527
    .line 528
    aput-byte v10, v4, v5

    .line 529
    .line 530
    :goto_6
    move v5, v1

    .line 531
    :goto_7
    move v3, v9

    .line 532
    goto/16 :goto_2

    .line 533
    .line 534
    :cond_f
    add-int/lit8 v1, v5, 0x1

    .line 535
    .line 536
    aput-byte v10, v4, v5

    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_10
    shr-int/lit8 v3, v1, 0xc

    .line 540
    .line 541
    or-int/lit16 v3, v3, 0xe0

    .line 542
    .line 543
    int-to-byte v3, v3

    .line 544
    aput-byte v3, v4, v5

    .line 545
    .line 546
    add-int/lit8 v3, v5, 0x1

    .line 547
    .line 548
    shr-int/lit8 v8, v1, 0x6

    .line 549
    .line 550
    and-int/2addr v8, v10

    .line 551
    or-int/lit16 v8, v8, 0x80

    .line 552
    .line 553
    int-to-byte v8, v8

    .line 554
    aput-byte v8, v4, v3

    .line 555
    .line 556
    add-int/lit8 v3, v5, 0x2

    .line 557
    .line 558
    and-int/lit8 v1, v1, 0x3f

    .line 559
    .line 560
    or-int/lit16 v1, v1, 0x80

    .line 561
    .line 562
    int-to-byte v1, v1

    .line 563
    aput-byte v1, v4, v3

    .line 564
    .line 565
    add-int/lit8 v5, v5, 0x3

    .line 566
    .line 567
    goto :goto_7

    .line 568
    :cond_11
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 569
    .line 570
    int-to-byte p1, p1

    .line 571
    aput-byte p1, v4, v5

    .line 572
    .line 573
    add-int/2addr v5, v6

    .line 574
    iput v5, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 575
    .line 576
    return-void

    .line 577
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

.method public writeTimeHHMMSS8(III)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 14
    .line 15
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 21
    .line 22
    aget p1, v4, p1

    .line 23
    .line 24
    add-int/lit8 v5, v0, 0x1

    .line 25
    .line 26
    shr-int/lit8 v6, p1, 0x8

    .line 27
    .line 28
    int-to-byte v6, v6

    .line 29
    aput-byte v6, v2, v5

    .line 30
    .line 31
    add-int/lit8 v5, v0, 0x2

    .line 32
    .line 33
    int-to-byte p1, p1

    .line 34
    aput-byte p1, v2, v5

    .line 35
    .line 36
    add-int/lit8 p1, v0, 0x3

    .line 37
    .line 38
    const/16 v5, 0x3a

    .line 39
    .line 40
    aput-byte v5, v2, p1

    .line 41
    .line 42
    aget p1, v4, p2

    .line 43
    .line 44
    add-int/lit8 p2, v0, 0x4

    .line 45
    .line 46
    shr-int/lit8 v6, p1, 0x8

    .line 47
    .line 48
    int-to-byte v6, v6

    .line 49
    aput-byte v6, v2, p2

    .line 50
    .line 51
    add-int/lit8 p2, v0, 0x5

    .line 52
    .line 53
    int-to-byte p1, p1

    .line 54
    aput-byte p1, v2, p2

    .line 55
    .line 56
    add-int/lit8 p1, v0, 0x6

    .line 57
    .line 58
    aput-byte v5, v2, p1

    .line 59
    .line 60
    aget p1, v4, p3

    .line 61
    .line 62
    add-int/lit8 p2, v0, 0x7

    .line 63
    .line 64
    shr-int/lit8 p3, p1, 0x8

    .line 65
    .line 66
    int-to-byte p3, p3

    .line 67
    aput-byte p3, v2, p2

    .line 68
    .line 69
    add-int/lit8 p2, v0, 0x8

    .line 70
    .line 71
    int-to-byte p1, p1

    .line 72
    aput-byte p1, v2, p2

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x9

    .line 75
    .line 76
    int-to-byte p1, v3

    .line 77
    aput-byte p1, v2, v0

    .line 78
    .line 79
    iput v1, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 80
    .line 81
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
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 22
    .line 23
    array-length v6, v6

    .line 24
    if-lt v5, v6, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_LOOKUP:[C

    .line 30
    .line 31
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 32
    .line 33
    iget v7, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 34
    .line 35
    const/16 v8, 0x22

    .line 36
    .line 37
    aput-byte v8, v6, v7

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
    aput-byte v0, v16, v18

    .line 173
    .line 174
    add-int/lit8 v0, v17, 0x2

    .line 175
    .line 176
    int-to-byte v10, v10

    .line 177
    aput-byte v10, v16, v0

    .line 178
    .line 179
    add-int/lit8 v0, v17, 0x3

    .line 180
    .line 181
    shr-int/lit8 v10, v12, 0x8

    .line 182
    .line 183
    int-to-byte v10, v10

    .line 184
    aput-byte v10, v16, v0

    .line 185
    .line 186
    add-int/lit8 v0, v17, 0x4

    .line 187
    .line 188
    int-to-byte v10, v12

    .line 189
    aput-byte v10, v16, v0

    .line 190
    .line 191
    add-int/lit8 v0, v17, 0x5

    .line 192
    .line 193
    shr-int/lit8 v10, v19, 0x8

    .line 194
    .line 195
    int-to-byte v10, v10

    .line 196
    aput-byte v10, v16, v0

    .line 197
    .line 198
    add-int/lit8 v0, v17, 0x6

    .line 199
    .line 200
    move/from16 v10, v19

    .line 201
    .line 202
    int-to-byte v10, v10

    .line 203
    aput-byte v10, v16, v0

    .line 204
    .line 205
    add-int/lit8 v0, v17, 0x7

    .line 206
    .line 207
    shr-int/lit8 v10, v8, 0x8

    .line 208
    .line 209
    int-to-byte v10, v10

    .line 210
    aput-byte v10, v16, v0

    .line 211
    .line 212
    add-int/lit8 v0, v17, 0x8

    .line 213
    .line 214
    int-to-byte v8, v8

    .line 215
    aput-byte v8, v16, v0

    .line 216
    .line 217
    add-int/lit8 v0, v17, 0x9

    .line 218
    .line 219
    const/16 v8, 0x2d

    .line 220
    .line 221
    aput-byte v8, v16, v0

    .line 222
    .line 223
    add-int/lit8 v0, v17, 0xa

    .line 224
    .line 225
    shr-int/lit8 v10, v2, 0x8

    .line 226
    .line 227
    int-to-byte v10, v10

    .line 228
    aput-byte v10, v16, v0

    .line 229
    .line 230
    add-int/lit8 v0, v17, 0xb

    .line 231
    .line 232
    int-to-byte v2, v2

    .line 233
    aput-byte v2, v16, v0

    .line 234
    .line 235
    add-int/lit8 v0, v17, 0xc

    .line 236
    .line 237
    shr-int/lit8 v2, v9, 0x8

    .line 238
    .line 239
    int-to-byte v2, v2

    .line 240
    aput-byte v2, v16, v0

    .line 241
    .line 242
    add-int/lit8 v0, v17, 0xd

    .line 243
    .line 244
    int-to-byte v2, v9

    .line 245
    aput-byte v2, v16, v0

    .line 246
    .line 247
    add-int/lit8 v0, v17, 0xe

    .line 248
    .line 249
    aput-byte v8, v16, v0

    .line 250
    .line 251
    add-int/lit8 v0, v17, 0xf

    .line 252
    .line 253
    shr-int/lit8 v2, v11, 0x8

    .line 254
    .line 255
    int-to-byte v2, v2

    .line 256
    aput-byte v2, v16, v0

    .line 257
    .line 258
    add-int/lit8 v0, v17, 0x10

    .line 259
    .line 260
    int-to-byte v2, v11

    .line 261
    aput-byte v2, v16, v0

    .line 262
    .line 263
    add-int/lit8 v0, v17, 0x11

    .line 264
    .line 265
    shr-int/lit8 v2, v1, 0x8

    .line 266
    .line 267
    int-to-byte v2, v2

    .line 268
    aput-byte v2, v16, v0

    .line 269
    .line 270
    add-int/lit8 v0, v17, 0x12

    .line 271
    .line 272
    int-to-byte v1, v1

    .line 273
    aput-byte v1, v16, v0

    .line 274
    .line 275
    add-int/lit8 v0, v17, 0x13

    .line 276
    .line 277
    aput-byte v8, v16, v0

    .line 278
    .line 279
    add-int/lit8 v0, v17, 0x14

    .line 280
    .line 281
    shr-int/lit8 v1, v13, 0x8

    .line 282
    .line 283
    int-to-byte v1, v1

    .line 284
    aput-byte v1, v16, v0

    .line 285
    .line 286
    add-int/lit8 v0, v17, 0x15

    .line 287
    .line 288
    int-to-byte v1, v13

    .line 289
    aput-byte v1, v16, v0

    .line 290
    .line 291
    add-int/lit8 v0, v17, 0x16

    .line 292
    .line 293
    shr-int/lit8 v1, v5, 0x8

    .line 294
    .line 295
    int-to-byte v1, v1

    .line 296
    aput-byte v1, v16, v0

    .line 297
    .line 298
    add-int/lit8 v0, v17, 0x17

    .line 299
    .line 300
    int-to-byte v1, v5

    .line 301
    aput-byte v1, v16, v0

    .line 302
    .line 303
    add-int/lit8 v0, v17, 0x18

    .line 304
    .line 305
    aput-byte v8, v16, v0

    .line 306
    .line 307
    add-int/lit8 v0, v17, 0x19

    .line 308
    .line 309
    shr-int/lit8 v1, v6, 0x8

    .line 310
    .line 311
    int-to-byte v1, v1

    .line 312
    aput-byte v1, v16, v0

    .line 313
    .line 314
    add-int/lit8 v0, v17, 0x1a

    .line 315
    .line 316
    int-to-byte v1, v6

    .line 317
    aput-byte v1, v16, v0

    .line 318
    .line 319
    add-int/lit8 v0, v17, 0x1b

    .line 320
    .line 321
    shr-int/lit8 v1, v14, 0x8

    .line 322
    .line 323
    int-to-byte v1, v1

    .line 324
    aput-byte v1, v16, v0

    .line 325
    .line 326
    add-int/lit8 v0, v17, 0x1c

    .line 327
    .line 328
    int-to-byte v1, v14

    .line 329
    aput-byte v1, v16, v0

    .line 330
    .line 331
    add-int/lit8 v0, v17, 0x1d

    .line 332
    .line 333
    shr-int/lit8 v1, v4, 0x8

    .line 334
    .line 335
    int-to-byte v1, v1

    .line 336
    aput-byte v1, v16, v0

    .line 337
    .line 338
    add-int/lit8 v0, v17, 0x1e

    .line 339
    .line 340
    int-to-byte v1, v4

    .line 341
    aput-byte v1, v16, v0

    .line 342
    .line 343
    add-int/lit8 v0, v17, 0x1f

    .line 344
    .line 345
    shr-int/lit8 v1, v15, 0x8

    .line 346
    .line 347
    int-to-byte v1, v1

    .line 348
    aput-byte v1, v16, v0

    .line 349
    .line 350
    add-int/lit8 v0, v17, 0x20

    .line 351
    .line 352
    int-to-byte v1, v15

    .line 353
    aput-byte v1, v16, v0

    .line 354
    .line 355
    add-int/lit8 v0, v17, 0x21

    .line 356
    .line 357
    shr-int/lit8 v1, v7, 0x8

    .line 358
    .line 359
    int-to-byte v1, v1

    .line 360
    aput-byte v1, v16, v0

    .line 361
    .line 362
    add-int/lit8 v0, v17, 0x22

    .line 363
    .line 364
    int-to-byte v1, v7

    .line 365
    aput-byte v1, v16, v0

    .line 366
    .line 367
    add-int/lit8 v7, v17, 0x23

    .line 368
    .line 369
    shr-int/lit8 v0, v3, 0x8

    .line 370
    .line 371
    int-to-byte v0, v0

    .line 372
    aput-byte v0, v16, v7

    .line 373
    .line 374
    add-int/lit8 v7, v17, 0x24

    .line 375
    .line 376
    int-to-byte v0, v3

    .line 377
    aput-byte v0, v16, v7

    .line 378
    .line 379
    add-int/lit8 v7, v17, 0x25

    .line 380
    .line 381
    aput-byte p1, v16, v7

    .line 382
    .line 383
    add-int/lit8 v7, v17, 0x26

    .line 384
    .line 385
    move-object/from16 v0, p0

    .line 386
    .line 387
    iput v7, v0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 388
    .line 389
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
    iget-object v10, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 75
    .line 76
    array-length v10, v10

    .line 77
    if-lt v9, v10, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->ensureCapacity(I)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-object v9, p0, Lcom/alibaba/fastjson2/JSONWriterUTF8;->bytes:[B

    .line 83
    .line 84
    add-int/lit8 v10, v6, 0x1

    .line 85
    .line 86
    iget-char v11, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 87
    .line 88
    int-to-byte v11, v11

    .line 89
    aput-byte v11, v9, v6

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Ljava/time/LocalDate;->getYear()I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-virtual {v6}, Ljava/time/LocalDate;->getMonthValue()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    invoke-virtual {v6}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    invoke-static {v9, v10, v11, v12, v6}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    add-int/lit8 v10, v6, 0x1

    .line 112
    .line 113
    const/16 v11, 0x54

    .line 114
    .line 115
    aput-byte v11, v9, v6

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {v9, v10, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BILjava/time/LocalTime;)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ne v3, v8, :cond_7

    .line 126
    .line 127
    add-int/lit8 v0, p1, 0x1

    .line 128
    .line 129
    const/16 v1, 0x5a

    .line 130
    .line 131
    aput-byte v1, v9, p1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    if-eq v0, v5, :cond_9

    .line 135
    .line 136
    if-ne v0, v4, :cond_8

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    add-int/lit8 v0, p1, 0x1

    .line 140
    .line 141
    const/16 v3, 0x5b

    .line 142
    .line 143
    aput-byte v3, v9, p1

    .line 144
    .line 145
    invoke-virtual {v1, v7, v2, v9, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 146
    .line 147
    .line 148
    add-int/2addr v0, v2

    .line 149
    add-int/lit8 p1, v0, 0x1

    .line 150
    .line 151
    const/16 v1, 0x5d

    .line 152
    .line 153
    aput-byte v1, v9, v0

    .line 154
    .line 155
    move v0, p1

    .line 156
    goto :goto_3

    .line 157
    :cond_9
    :goto_2
    invoke-virtual {v1, v7, v2, v9, p1}, Ljava/lang/String;->getBytes(II[BI)V

    .line 158
    .line 159
    .line 160
    add-int v0, p1, v2

    .line 161
    .line 162
    :goto_3
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONWriter;->quote:C

    .line 163
    .line 164
    int-to-byte p1, p1

    .line 165
    aput-byte p1, v9, v0

    .line 166
    .line 167
    add-int/2addr v0, v8

    .line 168
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter;->off:I

    .line 169
    .line 170
    return-void
.end method
