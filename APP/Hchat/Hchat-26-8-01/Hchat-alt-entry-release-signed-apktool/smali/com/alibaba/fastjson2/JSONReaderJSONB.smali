.class final Lcom/alibaba/fastjson2/JSONReaderJSONB;
.super Lcom/alibaba/fastjson2/JSONReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final BASE:J

.field static final FIXED_TYPE_SIZE:[B

.field static GB18030:Ljava/nio/charset/Charset;

.field static final SHANGHAI_ZONE_ID_NAME_BYTES:[B


# instance fields
.field protected final bytes:[B

.field protected final cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

.field protected charBuf:[C

.field protected final end:I

.field protected final length:I

.field protected strBegin:I

.field protected strlen:I

.field protected strtype:B

.field protected symbol0Begin:I

.field protected symbol0Hash:J

.field protected symbol0Length:I

.field protected symbol0StrType:B

.field protected final symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

.field protected symbols:[J

.field protected type:B

.field protected valueBytes:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, [B

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    sput-wide v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 11
    .line 12
    const-string v0, "Asia/Shanghai"

    .line 13
    .line 14
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->SHANGHAI_ZONE_ID_NAME_BYTES:[B

    .line 19
    .line 20
    const/16 v0, 0x100

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_0

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->FIXED_TYPE_SIZE:[B

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x0t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x0t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x0t
        0x5t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        0x25t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x0t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x9t
        0x5t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
        0x9t
        0x0t
        0x5t
        0x0t
        0x0t
        0x0t
        0x0t
        0x3t
        0x2t
        0x9t
        0x5t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x3t
        0x0t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x2t
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    sub-int/2addr v3, v0

    .line 17
    and-int v0, v1, v3

    .line 18
    .line 19
    aget-object v0, v2, v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 22
    .line 23
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [B

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget v0, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 35
    .line 36
    new-array v0, v0, [B

    .line 37
    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    move v2, v1

    .line 40
    :cond_1
    :goto_0
    :try_start_0
    array-length v3, v0

    .line 41
    sub-int/2addr v3, v2

    .line 42
    invoke-virtual {p2, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I

    .line 43
    .line 44
    .line 45
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    const/4 v4, -0x1

    .line 47
    if-ne v3, v4, :cond_2

    .line 48
    .line 49
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 50
    .line 51
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->length:I

    .line 54
    .line 55
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 56
    .line 57
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    add-int/2addr v2, v3

    .line 63
    :try_start_1
    array-length v3, v0

    .line 64
    if-ne v2, v3, :cond_1

    .line 65
    .line 66
    array-length v3, v0

    .line 67
    iget v4, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 68
    .line 69
    add-int/2addr v3, v4

    .line 70
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception p1

    .line 76
    const-string p2, "read error"

    .line 77
    .line 78
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V
    .locals 1

    const/4 v0, 0x1

    .line 83
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 84
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 85
    iput p3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->length:I

    add-int/2addr p3, p4

    .line 87
    iput p3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 88
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 89
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    array-length p3, p1

    sub-int/2addr p3, v0

    and-int/2addr p2, p3

    aget-object p1, p1, p2

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    return-void
.end method

.method public static getInt([BI)I
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public static getInt3([BII)I
    .locals 1

    .line 1
    add-int/lit8 p2, p2, -0x44

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x10

    .line 4
    .line 5
    aget-byte v0, p0, p1

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    shl-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    add-int/2addr p2, v0

    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    aget-byte p0, p0, p1

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    add-int/2addr p2, p0

    .line 19
    return p2
.end method

.method private getObjectReaderContext(Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/Class;Ljava/lang/ClassLoader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    :try_start_0
    const-class p3, Lcom/alibaba/fastjson2/JSON;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_0
    invoke-virtual {p3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :catch_0
    :cond_1
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_2
    return-object p1
.end method

.method private notSupportString()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "readString not support type "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 11
    .line 12
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", offset "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 35
    .line 36
    array-length v2, v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method private static notSupportType(B)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "name not support input : "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method private readBigInteger0(B)Ljava/math/BigInteger;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    const/16 v1, -0x6f

    .line 4
    .line 5
    if-eq p1, v1, :cond_12

    .line 6
    .line 7
    const/16 v1, -0x47

    .line 8
    .line 9
    if-eq p1, v1, :cond_10

    .line 10
    .line 11
    const/16 v1, 0x48

    .line 12
    .line 13
    if-eq p1, v1, :cond_f

    .line 14
    .line 15
    const/16 v1, 0x7c

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    const/16 v3, 0x2e

    .line 19
    .line 20
    if-eq p1, v1, :cond_d

    .line 21
    .line 22
    const/16 v1, 0x79

    .line 23
    .line 24
    if-eq p1, v1, :cond_b

    .line 25
    .line 26
    const/16 v1, 0x7a

    .line 27
    .line 28
    if-eq p1, v1, :cond_9

    .line 29
    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    packed-switch p1, :pswitch_data_1

    .line 34
    .line 35
    .line 36
    const/16 v1, -0x10

    .line 37
    .line 38
    if-lt p1, v1, :cond_0

    .line 39
    .line 40
    const/16 v1, 0x2f

    .line 41
    .line 42
    if-gt p1, v1, :cond_0

    .line 43
    .line 44
    int-to-long v0, p1

    .line 45
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_0
    const/16 v1, 0x30

    .line 51
    .line 52
    if-lt p1, v1, :cond_1

    .line 53
    .line 54
    const/16 v1, 0x3f

    .line 55
    .line 56
    if-gt p1, v1, :cond_1

    .line 57
    .line 58
    add-int/lit8 p1, p1, -0x38

    .line 59
    .line 60
    shl-int/lit8 p1, p1, 0x8

    .line 61
    .line 62
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    add-int/lit8 v2, v1, 0x1

    .line 65
    .line 66
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 67
    .line 68
    aget-byte v0, v0, v1

    .line 69
    .line 70
    and-int/lit16 v0, v0, 0xff

    .line 71
    .line 72
    add-int/2addr p1, v0

    .line 73
    int-to-long v0, p1

    .line 74
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_1
    const/16 v1, 0x40

    .line 80
    .line 81
    if-lt p1, v1, :cond_2

    .line 82
    .line 83
    const/16 v1, 0x47

    .line 84
    .line 85
    if-gt p1, v1, :cond_2

    .line 86
    .line 87
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x2

    .line 96
    .line 97
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 98
    .line 99
    int-to-long v0, p1

    .line 100
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_2
    const/16 v1, -0x28

    .line 106
    .line 107
    if-lt p1, v1, :cond_3

    .line 108
    .line 109
    const/16 v1, -0x11

    .line 110
    .line 111
    if-gt p1, v1, :cond_3

    .line 112
    .line 113
    add-int/lit8 p1, p1, 0x20

    .line 114
    .line 115
    int-to-long v0, p1

    .line 116
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :cond_3
    const/16 v1, -0x38

    .line 122
    .line 123
    if-lt p1, v1, :cond_4

    .line 124
    .line 125
    const/16 v1, -0x29

    .line 126
    .line 127
    if-gt p1, v1, :cond_4

    .line 128
    .line 129
    add-int/lit8 p1, p1, 0x30

    .line 130
    .line 131
    shl-int/lit8 p1, p1, 0x8

    .line 132
    .line 133
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 134
    .line 135
    add-int/lit8 v2, v1, 0x1

    .line 136
    .line 137
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 138
    .line 139
    aget-byte v0, v0, v1

    .line 140
    .line 141
    and-int/lit16 v0, v0, 0xff

    .line 142
    .line 143
    add-int/2addr p1, v0

    .line 144
    int-to-long v0, p1

    .line 145
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    :cond_4
    const/16 v1, -0x40

    .line 151
    .line 152
    if-lt p1, v1, :cond_5

    .line 153
    .line 154
    const/16 v1, -0x39

    .line 155
    .line 156
    if-gt p1, v1, :cond_5

    .line 157
    .line 158
    add-int/lit8 p1, p1, 0x3c

    .line 159
    .line 160
    shl-int/lit8 p1, p1, 0x10

    .line 161
    .line 162
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 163
    .line 164
    add-int/lit8 v2, v1, 0x1

    .line 165
    .line 166
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 167
    .line 168
    aget-byte v3, v0, v1

    .line 169
    .line 170
    and-int/lit16 v3, v3, 0xff

    .line 171
    .line 172
    shl-int/lit8 v3, v3, 0x8

    .line 173
    .line 174
    add-int/2addr p1, v3

    .line 175
    add-int/lit8 v1, v1, 0x2

    .line 176
    .line 177
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 178
    .line 179
    aget-byte v0, v0, v2

    .line 180
    .line 181
    and-int/lit16 v0, v0, 0xff

    .line 182
    .line 183
    add-int/2addr p1, v0

    .line 184
    int-to-long v0, p1

    .line 185
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    return-object p1

    .line 190
    :cond_5
    const/16 v0, 0x49

    .line 191
    .line 192
    if-lt p1, v0, :cond_6

    .line 193
    .line 194
    const/16 v1, 0x78

    .line 195
    .line 196
    if-gt p1, v1, :cond_6

    .line 197
    .line 198
    sub-int/2addr p1, v0

    .line 199
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 200
    .line 201
    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 206
    .line 207
    add-int/2addr v1, p1

    .line 208
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 209
    .line 210
    new-instance p1, Ljava/math/BigInteger;

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_6
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    throw p1

    .line 221
    :pswitch_0
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 222
    .line 223
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 224
    .line 225
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 226
    .line 227
    int-to-long v3, v3

    .line 228
    add-long/2addr v1, v3

    .line 229
    invoke-virtual {p1, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 230
    .line 231
    .line 232
    move-result-wide v0

    .line 233
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 234
    .line 235
    add-int/lit8 p1, p1, 0x8

    .line 236
    .line 237
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 238
    .line 239
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 240
    .line 241
    if-eqz p1, :cond_7

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    :goto_0
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    return-object p1

    .line 253
    :pswitch_1
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 254
    .line 255
    add-int/lit8 v1, p1, 0x1

    .line 256
    .line 257
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 258
    .line 259
    aget-byte p1, v0, p1

    .line 260
    .line 261
    int-to-long v0, p1

    .line 262
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    return-object p1

    .line 267
    :pswitch_2
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 268
    .line 269
    add-int/lit8 v1, p1, 0x1

    .line 270
    .line 271
    aget-byte v1, v0, v1

    .line 272
    .line 273
    and-int/lit16 v1, v1, 0xff

    .line 274
    .line 275
    aget-byte v0, v0, p1

    .line 276
    .line 277
    shl-int/lit8 v0, v0, 0x8

    .line 278
    .line 279
    add-int/2addr v1, v0

    .line 280
    add-int/lit8 p1, p1, 0x2

    .line 281
    .line 282
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 283
    .line 284
    int-to-long v0, v1

    .line 285
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    return-object p1

    .line 290
    :pswitch_3
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 291
    .line 292
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 297
    .line 298
    add-int/lit8 v0, v0, 0x4

    .line 299
    .line 300
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 301
    .line 302
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    float-to-long v0, p1

    .line 307
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    return-object p1

    .line 312
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    int-to-float p1, p1

    .line 317
    float-to-long v0, p1

    .line 318
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    return-object p1

    .line 323
    :pswitch_5
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 324
    .line 325
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 326
    .line 327
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 328
    .line 329
    int-to-long v3, v3

    .line 330
    add-long/2addr v1, v3

    .line 331
    invoke-virtual {p1, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v0

    .line 335
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 336
    .line 337
    add-int/lit8 p1, p1, 0x8

    .line 338
    .line 339
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 340
    .line 341
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 342
    .line 343
    if-eqz p1, :cond_8

    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 347
    .line 348
    .line 349
    move-result-wide v0

    .line 350
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 351
    .line 352
    .line 353
    move-result-wide v0

    .line 354
    double-to-long v0, v0

    .line 355
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    return-object p1

    .line 360
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 361
    .line 362
    .line 363
    move-result-wide v0

    .line 364
    long-to-double v0, v0

    .line 365
    double-to-long v0, v0

    .line 366
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    return-object p1

    .line 371
    :pswitch_7
    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 372
    .line 373
    return-object p1

    .line 374
    :pswitch_8
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_9
    const/4 p1, 0x0

    .line 378
    return-object p1

    .line 379
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    new-instance v1, Ljava/lang/String;

    .line 384
    .line 385
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 386
    .line 387
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 388
    .line 389
    invoke-direct {v1, v0, v4, p1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 390
    .line 391
    .line 392
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 393
    .line 394
    add-int/2addr v0, p1

    .line 395
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 396
    .line 397
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-ne p1, v2, :cond_a

    .line 402
    .line 403
    new-instance p1, Ljava/math/BigInteger;

    .line 404
    .line 405
    invoke-direct {p1, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return-object p1

    .line 409
    :cond_a
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    return-object p1

    .line 418
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    new-instance v1, Ljava/lang/String;

    .line 423
    .line 424
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 425
    .line 426
    sget-object v5, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 427
    .line 428
    invoke-direct {v1, v0, v4, p1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 429
    .line 430
    .line 431
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 432
    .line 433
    add-int/2addr v0, p1

    .line 434
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 435
    .line 436
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-ne p1, v2, :cond_c

    .line 441
    .line 442
    new-instance p1, Ljava/math/BigInteger;

    .line 443
    .line 444
    invoke-direct {p1, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    return-object p1

    .line 448
    :cond_c
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    return-object p1

    .line 457
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    new-instance v1, Ljava/lang/String;

    .line 462
    .line 463
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 464
    .line 465
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 466
    .line 467
    invoke-direct {v1, v0, v4, p1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 468
    .line 469
    .line 470
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 471
    .line 472
    add-int/2addr v0, p1

    .line 473
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 474
    .line 475
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    if-ne p1, v2, :cond_e

    .line 480
    .line 481
    new-instance p1, Ljava/math/BigInteger;

    .line 482
    .line 483
    invoke-direct {p1, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    return-object p1

    .line 487
    :cond_e
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    return-object p1

    .line 496
    :cond_f
    :pswitch_a
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 497
    .line 498
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 499
    .line 500
    .line 501
    move-result p1

    .line 502
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 503
    .line 504
    add-int/lit8 v0, v0, 0x4

    .line 505
    .line 506
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 507
    .line 508
    int-to-long v0, p1

    .line 509
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    return-object p1

    .line 514
    :cond_10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 515
    .line 516
    .line 517
    move-result p1

    .line 518
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    if-nez p1, :cond_11

    .line 523
    .line 524
    new-instance p1, Ljava/math/BigDecimal;

    .line 525
    .line 526
    invoke-direct {p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 527
    .line 528
    .line 529
    goto :goto_2

    .line 530
    :cond_11
    new-instance v1, Ljava/math/BigDecimal;

    .line 531
    .line 532
    invoke-direct {v1, v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 533
    .line 534
    .line 535
    move-object p1, v1

    .line 536
    :goto_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    return-object p1

    .line 541
    :cond_12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    new-array v0, p1, [B

    .line 546
    .line 547
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 548
    .line 549
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 550
    .line 551
    const/4 v3, 0x0

    .line 552
    invoke-static {v1, v2, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 553
    .line 554
    .line 555
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 556
    .line 557
    add-int/2addr v1, p1

    .line 558
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 559
    .line 560
    new-instance p1, Ljava/math/BigInteger;

    .line 561
    .line 562
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>([B)V

    .line 563
    .line 564
    .line 565
    return-object p1

    .line 566
    nop

    .line 567
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method private readBoolValue0(B)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 6
    .line 7
    const/16 v3, -0x51

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eq v1, v3, :cond_1c

    .line 12
    .line 13
    const/16 v3, 0x4a

    .line 14
    .line 15
    const/16 v13, 0x66

    .line 16
    .line 17
    const/16 v14, 0x75

    .line 18
    .line 19
    const/16 v15, 0x72

    .line 20
    .line 21
    const/16 v6, 0x74

    .line 22
    .line 23
    const/16 v7, 0x59

    .line 24
    .line 25
    const-string v8, "not support input "

    .line 26
    .line 27
    const/16 v9, 0x45

    .line 28
    .line 29
    const/16 v10, 0x4e

    .line 30
    .line 31
    const/16 v11, 0x65

    .line 32
    .line 33
    const/16 v16, 0x5

    .line 34
    .line 35
    const/4 v12, 0x4

    .line 36
    if-eq v1, v3, :cond_e

    .line 37
    .line 38
    if-eqz v1, :cond_d

    .line 39
    .line 40
    if-eq v1, v5, :cond_c

    .line 41
    .line 42
    const/16 v3, 0x4d

    .line 43
    .line 44
    if-eq v1, v3, :cond_b

    .line 45
    .line 46
    if-eq v1, v10, :cond_a

    .line 47
    .line 48
    packed-switch v1, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    throw v1

    .line 56
    :pswitch_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 61
    .line 62
    new-array v6, v3, [B

    .line 63
    .line 64
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 65
    .line 66
    invoke-static {v2, v7, v6, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x7d

    .line 70
    .line 71
    if-ne v1, v2, :cond_0

    .line 72
    .line 73
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/16 v2, 0x7c

    .line 77
    .line 78
    if-ne v1, v2, :cond_1

    .line 79
    .line 80
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 84
    .line 85
    :goto_0
    new-instance v2, Ljava/lang/String;

    .line 86
    .line 87
    invoke-direct {v2, v6, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 88
    .line 89
    .line 90
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 91
    .line 92
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 93
    .line 94
    add-int/2addr v1, v3

    .line 95
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const/4 v3, -0x1

    .line 102
    sparse-switch v1, :sswitch_data_0

    .line 103
    .line 104
    .line 105
    :goto_1
    move v12, v3

    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :sswitch_0
    const-string v1, "false"

    .line 109
    .line 110
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    const/4 v12, 0x7

    .line 118
    goto :goto_2

    .line 119
    :sswitch_1
    const-string v1, "FALSE"

    .line 120
    .line 121
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_3

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const/4 v12, 0x6

    .line 129
    goto :goto_2

    .line 130
    :sswitch_2
    const-string v1, "true"

    .line 131
    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    move/from16 v12, v16

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :sswitch_3
    const-string v1, "TRUE"

    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_9

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :sswitch_4
    const-string v1, "Y"

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_5

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    const/4 v12, 0x3

    .line 161
    goto :goto_2

    .line 162
    :sswitch_5
    const-string v1, "N"

    .line 163
    .line 164
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    const/4 v12, 0x2

    .line 172
    goto :goto_2

    .line 173
    :sswitch_6
    const-string v1, "1"

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_7

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_7
    move v12, v5

    .line 183
    goto :goto_2

    .line 184
    :sswitch_7
    const-string v1, "0"

    .line 185
    .line 186
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_8

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_8
    move v12, v4

    .line 194
    :cond_9
    :goto_2
    packed-switch v12, :pswitch_data_1

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return v4

    .line 205
    :pswitch_1
    return v5

    .line 206
    :pswitch_2
    return v4

    .line 207
    :pswitch_3
    move/from16 v17, v4

    .line 208
    .line 209
    goto/16 :goto_5

    .line 210
    .line 211
    :cond_a
    move/from16 v17, v4

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_b
    move/from16 v17, v4

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_c
    return v5

    .line 218
    :cond_d
    return v4

    .line 219
    :cond_e
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 220
    .line 221
    aget-byte v3, v2, v1

    .line 222
    .line 223
    move/from16 v17, v4

    .line 224
    .line 225
    const/16 v4, 0x31

    .line 226
    .line 227
    if-eq v3, v4, :cond_1b

    .line 228
    .line 229
    if-ne v3, v7, :cond_f

    .line 230
    .line 231
    goto/16 :goto_7

    .line 232
    .line 233
    :cond_f
    const/16 v4, 0x30

    .line 234
    .line 235
    if-eq v3, v4, :cond_1a

    .line 236
    .line 237
    if-ne v3, v10, :cond_10

    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_10
    :goto_3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 242
    .line 243
    aget-byte v3, v2, v1

    .line 244
    .line 245
    if-ne v3, v6, :cond_11

    .line 246
    .line 247
    add-int/lit8 v4, v1, 0x1

    .line 248
    .line 249
    aget-byte v4, v2, v4

    .line 250
    .line 251
    if-ne v4, v15, :cond_11

    .line 252
    .line 253
    add-int/lit8 v4, v1, 0x2

    .line 254
    .line 255
    aget-byte v4, v2, v4

    .line 256
    .line 257
    if-ne v4, v14, :cond_11

    .line 258
    .line 259
    add-int/lit8 v4, v1, 0x3

    .line 260
    .line 261
    aget-byte v4, v2, v4

    .line 262
    .line 263
    if-ne v4, v11, :cond_11

    .line 264
    .line 265
    add-int/2addr v1, v12

    .line 266
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 267
    .line 268
    return v5

    .line 269
    :cond_11
    const/16 v4, 0x54

    .line 270
    .line 271
    if-ne v3, v4, :cond_12

    .line 272
    .line 273
    add-int/lit8 v3, v1, 0x1

    .line 274
    .line 275
    aget-byte v3, v2, v3

    .line 276
    .line 277
    const/16 v4, 0x52

    .line 278
    .line 279
    if-ne v3, v4, :cond_12

    .line 280
    .line 281
    add-int/lit8 v3, v1, 0x2

    .line 282
    .line 283
    aget-byte v3, v2, v3

    .line 284
    .line 285
    const/16 v4, 0x55

    .line 286
    .line 287
    if-ne v3, v4, :cond_12

    .line 288
    .line 289
    add-int/lit8 v3, v1, 0x3

    .line 290
    .line 291
    aget-byte v3, v2, v3

    .line 292
    .line 293
    if-ne v3, v9, :cond_12

    .line 294
    .line 295
    add-int/2addr v1, v12

    .line 296
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 297
    .line 298
    return v5

    .line 299
    :cond_12
    :goto_4
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 300
    .line 301
    aget-byte v3, v2, v1

    .line 302
    .line 303
    if-ne v3, v13, :cond_13

    .line 304
    .line 305
    add-int/lit8 v4, v1, 0x1

    .line 306
    .line 307
    aget-byte v4, v2, v4

    .line 308
    .line 309
    const/16 v13, 0x61

    .line 310
    .line 311
    if-ne v4, v13, :cond_13

    .line 312
    .line 313
    add-int/lit8 v4, v1, 0x2

    .line 314
    .line 315
    aget-byte v4, v2, v4

    .line 316
    .line 317
    const/16 v13, 0x6c

    .line 318
    .line 319
    if-ne v4, v13, :cond_13

    .line 320
    .line 321
    add-int/lit8 v4, v1, 0x3

    .line 322
    .line 323
    aget-byte v4, v2, v4

    .line 324
    .line 325
    const/16 v13, 0x73

    .line 326
    .line 327
    if-ne v4, v13, :cond_13

    .line 328
    .line 329
    add-int/lit8 v4, v1, 0x4

    .line 330
    .line 331
    aget-byte v4, v2, v4

    .line 332
    .line 333
    if-ne v4, v11, :cond_13

    .line 334
    .line 335
    add-int/lit8 v1, v1, 0x5

    .line 336
    .line 337
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 338
    .line 339
    return v17

    .line 340
    :cond_13
    const/16 v4, 0x46

    .line 341
    .line 342
    if-ne v3, v4, :cond_14

    .line 343
    .line 344
    add-int/lit8 v3, v1, 0x1

    .line 345
    .line 346
    aget-byte v3, v2, v3

    .line 347
    .line 348
    const/16 v4, 0x41

    .line 349
    .line 350
    if-ne v3, v4, :cond_14

    .line 351
    .line 352
    add-int/lit8 v3, v1, 0x2

    .line 353
    .line 354
    aget-byte v3, v2, v3

    .line 355
    .line 356
    const/16 v4, 0x4c

    .line 357
    .line 358
    if-ne v3, v4, :cond_14

    .line 359
    .line 360
    add-int/lit8 v3, v1, 0x3

    .line 361
    .line 362
    aget-byte v3, v2, v3

    .line 363
    .line 364
    const/16 v4, 0x53

    .line 365
    .line 366
    if-ne v3, v4, :cond_14

    .line 367
    .line 368
    add-int/lit8 v3, v1, 0x4

    .line 369
    .line 370
    aget-byte v3, v2, v3

    .line 371
    .line 372
    if-ne v3, v9, :cond_14

    .line 373
    .line 374
    add-int/lit8 v1, v1, 0x5

    .line 375
    .line 376
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 377
    .line 378
    return v17

    .line 379
    :cond_14
    :goto_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 384
    .line 385
    if-ne v1, v5, :cond_16

    .line 386
    .line 387
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 388
    .line 389
    aget-byte v4, v2, v3

    .line 390
    .line 391
    if-ne v4, v7, :cond_15

    .line 392
    .line 393
    add-int/2addr v3, v5

    .line 394
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 395
    .line 396
    return v5

    .line 397
    :cond_15
    if-ne v4, v10, :cond_19

    .line 398
    .line 399
    add-int/2addr v3, v5

    .line 400
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 401
    .line 402
    return v5

    .line 403
    :cond_16
    if-ne v1, v12, :cond_17

    .line 404
    .line 405
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 406
    .line 407
    aget-byte v4, v2, v3

    .line 408
    .line 409
    if-ne v4, v6, :cond_17

    .line 410
    .line 411
    add-int/lit8 v4, v3, 0x1

    .line 412
    .line 413
    aget-byte v4, v2, v4

    .line 414
    .line 415
    if-ne v4, v15, :cond_17

    .line 416
    .line 417
    add-int/lit8 v4, v3, 0x2

    .line 418
    .line 419
    aget-byte v4, v2, v4

    .line 420
    .line 421
    if-ne v4, v14, :cond_17

    .line 422
    .line 423
    add-int/lit8 v4, v3, 0x3

    .line 424
    .line 425
    aget-byte v4, v2, v4

    .line 426
    .line 427
    if-ne v4, v11, :cond_17

    .line 428
    .line 429
    add-int/2addr v3, v12

    .line 430
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 431
    .line 432
    return v5

    .line 433
    :cond_17
    move/from16 v3, v16

    .line 434
    .line 435
    if-ne v1, v3, :cond_19

    .line 436
    .line 437
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 438
    .line 439
    aget-byte v4, v2, v3

    .line 440
    .line 441
    const/16 v5, 0x66

    .line 442
    .line 443
    if-ne v4, v5, :cond_18

    .line 444
    .line 445
    add-int/lit8 v5, v3, 0x1

    .line 446
    .line 447
    aget-byte v5, v2, v5

    .line 448
    .line 449
    const/16 v13, 0x61

    .line 450
    .line 451
    if-ne v5, v13, :cond_18

    .line 452
    .line 453
    add-int/lit8 v5, v3, 0x2

    .line 454
    .line 455
    aget-byte v5, v2, v5

    .line 456
    .line 457
    const/16 v13, 0x6c

    .line 458
    .line 459
    if-ne v5, v13, :cond_18

    .line 460
    .line 461
    add-int/lit8 v5, v3, 0x3

    .line 462
    .line 463
    aget-byte v5, v2, v5

    .line 464
    .line 465
    const/16 v13, 0x73

    .line 466
    .line 467
    if-ne v5, v13, :cond_18

    .line 468
    .line 469
    add-int/lit8 v5, v3, 0x4

    .line 470
    .line 471
    aget-byte v5, v2, v5

    .line 472
    .line 473
    if-ne v5, v11, :cond_18

    .line 474
    .line 475
    const/16 v16, 0x5

    .line 476
    .line 477
    add-int/lit8 v3, v3, 0x5

    .line 478
    .line 479
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 480
    .line 481
    return v17

    .line 482
    :cond_18
    const/16 v5, 0x46

    .line 483
    .line 484
    if-ne v4, v5, :cond_19

    .line 485
    .line 486
    add-int/lit8 v4, v3, 0x1

    .line 487
    .line 488
    aget-byte v4, v2, v4

    .line 489
    .line 490
    const/16 v5, 0x41

    .line 491
    .line 492
    if-ne v4, v5, :cond_19

    .line 493
    .line 494
    add-int/lit8 v4, v3, 0x2

    .line 495
    .line 496
    aget-byte v4, v2, v4

    .line 497
    .line 498
    const/16 v5, 0x4c

    .line 499
    .line 500
    if-ne v4, v5, :cond_19

    .line 501
    .line 502
    add-int/lit8 v4, v3, 0x3

    .line 503
    .line 504
    aget-byte v4, v2, v4

    .line 505
    .line 506
    const/16 v5, 0x53

    .line 507
    .line 508
    if-ne v4, v5, :cond_19

    .line 509
    .line 510
    add-int/lit8 v4, v3, 0x4

    .line 511
    .line 512
    aget-byte v4, v2, v4

    .line 513
    .line 514
    if-ne v4, v9, :cond_19

    .line 515
    .line 516
    const/16 v16, 0x5

    .line 517
    .line 518
    add-int/lit8 v3, v3, 0x5

    .line 519
    .line 520
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 521
    .line 522
    return v17

    .line 523
    :cond_19
    new-instance v3, Ljava/lang/String;

    .line 524
    .line 525
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 526
    .line 527
    sget-object v5, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 528
    .line 529
    invoke-direct {v3, v2, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 530
    .line 531
    .line 532
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 533
    .line 534
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 535
    .line 536
    add-int/2addr v1, v2

    .line 537
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 538
    .line 539
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    return v17

    .line 547
    :cond_1a
    :goto_6
    add-int/2addr v1, v5

    .line 548
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 549
    .line 550
    return v17

    .line 551
    :cond_1b
    :goto_7
    add-int/2addr v1, v5

    .line 552
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 553
    .line 554
    return v5

    .line 555
    :cond_1c
    move/from16 v17, v4

    .line 556
    .line 557
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 558
    .line 559
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 560
    .line 561
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 562
    .line 563
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 564
    .line 565
    and-long/2addr v1, v3

    .line 566
    const-wide/16 v3, 0x0

    .line 567
    .line 568
    cmp-long v1, v1, v3

    .line 569
    .line 570
    if-nez v1, :cond_1d

    .line 571
    .line 572
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 573
    .line 574
    return v17

    .line 575
    :cond_1d
    const-string v1, "long value not support input null"

    .line 576
    .line 577
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    return v17

    .line 585
    :pswitch_data_0
    .packed-switch 0x79
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_7
        0x31 -> :sswitch_6
        0x4e -> :sswitch_5
        0x59 -> :sswitch_4
        0x276d8e -> :sswitch_3
        0x36758e -> :sswitch_2
        0x3f92103 -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch

    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
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
    .line 630
    .line 631
    .line 632
    .line 633
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private readDecimal0(B)Ljava/math/BigDecimal;
    .locals 5

    .line 1
    const/16 v0, 0x48

    .line 2
    .line 3
    if-eq p1, v0, :cond_c

    .line 4
    .line 5
    const/16 v0, 0x7c

    .line 6
    .line 7
    if-eq p1, v0, :cond_b

    .line 8
    .line 9
    const/16 v0, 0x79

    .line 10
    .line 11
    if-eq p1, v0, :cond_a

    .line 12
    .line 13
    const/16 v0, 0x7a

    .line 14
    .line 15
    if-eq p1, v0, :cond_9

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    packed-switch p1, :pswitch_data_1

    .line 21
    .line 22
    .line 23
    const/16 v0, -0x10

    .line 24
    .line 25
    if-lt p1, v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x2f

    .line 28
    .line 29
    if-gt p1, v0, :cond_0

    .line 30
    .line 31
    int-to-long v0, p1

    .line 32
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    const/16 v0, 0x30

    .line 38
    .line 39
    if-lt p1, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x3f

    .line 42
    .line 43
    if-gt p1, v0, :cond_1

    .line 44
    .line 45
    add-int/lit8 p1, p1, -0x38

    .line 46
    .line 47
    shl-int/lit8 p1, p1, 0x8

    .line 48
    .line 49
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 50
    .line 51
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    add-int/lit8 v2, v1, 0x1

    .line 54
    .line 55
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 56
    .line 57
    aget-byte v0, v0, v1

    .line 58
    .line 59
    and-int/lit16 v0, v0, 0xff

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    int-to-long v0, p1

    .line 63
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_1
    const/16 v0, 0x40

    .line 69
    .line 70
    if-lt p1, v0, :cond_2

    .line 71
    .line 72
    const/16 v0, 0x47

    .line 73
    .line 74
    if-gt p1, v0, :cond_2

    .line 75
    .line 76
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 77
    .line 78
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 79
    .line 80
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    add-int/lit8 v0, v0, 0x2

    .line 87
    .line 88
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    int-to-long v0, p1

    .line 91
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_2
    const/16 v0, -0x28

    .line 97
    .line 98
    if-lt p1, v0, :cond_3

    .line 99
    .line 100
    const/16 v0, -0x11

    .line 101
    .line 102
    if-gt p1, v0, :cond_3

    .line 103
    .line 104
    add-int/lit8 p1, p1, 0x20

    .line 105
    .line 106
    int-to-long v0, p1

    .line 107
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_3
    const/16 v0, -0x38

    .line 113
    .line 114
    if-lt p1, v0, :cond_4

    .line 115
    .line 116
    const/16 v0, -0x29

    .line 117
    .line 118
    if-gt p1, v0, :cond_4

    .line 119
    .line 120
    add-int/lit8 p1, p1, 0x30

    .line 121
    .line 122
    shl-int/lit8 p1, p1, 0x8

    .line 123
    .line 124
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 125
    .line 126
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 127
    .line 128
    add-int/lit8 v2, v1, 0x1

    .line 129
    .line 130
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 131
    .line 132
    aget-byte v0, v0, v1

    .line 133
    .line 134
    and-int/lit16 v0, v0, 0xff

    .line 135
    .line 136
    add-int/2addr p1, v0

    .line 137
    int-to-long v0, p1

    .line 138
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_4
    const/16 v0, -0x40

    .line 144
    .line 145
    if-lt p1, v0, :cond_5

    .line 146
    .line 147
    const/16 v0, -0x39

    .line 148
    .line 149
    if-gt p1, v0, :cond_5

    .line 150
    .line 151
    add-int/lit8 p1, p1, 0x3c

    .line 152
    .line 153
    shl-int/lit8 p1, p1, 0x10

    .line 154
    .line 155
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 156
    .line 157
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 158
    .line 159
    add-int/lit8 v2, v1, 0x1

    .line 160
    .line 161
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 162
    .line 163
    aget-byte v3, v0, v1

    .line 164
    .line 165
    and-int/lit16 v3, v3, 0xff

    .line 166
    .line 167
    shl-int/lit8 v3, v3, 0x8

    .line 168
    .line 169
    add-int/2addr p1, v3

    .line 170
    add-int/lit8 v1, v1, 0x2

    .line 171
    .line 172
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 173
    .line 174
    aget-byte v0, v0, v2

    .line 175
    .line 176
    and-int/lit16 v0, v0, 0xff

    .line 177
    .line 178
    add-int/2addr p1, v0

    .line 179
    int-to-long v0, p1

    .line 180
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1

    .line 185
    :cond_5
    const/16 v0, 0x49

    .line 186
    .line 187
    if-lt p1, v0, :cond_6

    .line 188
    .line 189
    const/16 v1, 0x78

    .line 190
    .line 191
    if-gt p1, v1, :cond_6

    .line 192
    .line 193
    sub-int/2addr p1, v0

    .line 194
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 195
    .line 196
    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 201
    .line 202
    add-int/2addr v1, p1

    .line 203
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 204
    .line 205
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    return-object p1

    .line 210
    :cond_6
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    throw p1

    .line 215
    :pswitch_0
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 216
    .line 217
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 218
    .line 219
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 220
    .line 221
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 222
    .line 223
    int-to-long v3, v3

    .line 224
    add-long/2addr v1, v3

    .line 225
    invoke-virtual {p1, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 230
    .line 231
    add-int/lit8 p1, p1, 0x8

    .line 232
    .line 233
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 234
    .line 235
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 236
    .line 237
    if-eqz p1, :cond_7

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v0

    .line 244
    :goto_0
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    return-object p1

    .line 249
    :pswitch_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 250
    .line 251
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 252
    .line 253
    add-int/lit8 v1, v0, 0x1

    .line 254
    .line 255
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 256
    .line 257
    aget-byte p1, p1, v0

    .line 258
    .line 259
    int-to-long v0, p1

    .line 260
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    return-object p1

    .line 265
    :pswitch_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 266
    .line 267
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 268
    .line 269
    add-int/lit8 v1, v0, 0x1

    .line 270
    .line 271
    aget-byte v1, p1, v1

    .line 272
    .line 273
    and-int/lit16 v1, v1, 0xff

    .line 274
    .line 275
    aget-byte p1, p1, v0

    .line 276
    .line 277
    shl-int/lit8 p1, p1, 0x8

    .line 278
    .line 279
    add-int/2addr v1, p1

    .line 280
    add-int/lit8 v0, v0, 0x2

    .line 281
    .line 282
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 283
    .line 284
    int-to-long v0, v1

    .line 285
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    return-object p1

    .line 290
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    new-instance v0, Ljava/math/BigDecimal;

    .line 295
    .line 296
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 297
    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_4
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 301
    .line 302
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 303
    .line 304
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 309
    .line 310
    add-int/lit8 v0, v0, 0x4

    .line 311
    .line 312
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 313
    .line 314
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    float-to-long v0, p1

    .line 319
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    return-object p1

    .line 324
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    int-to-float p1, p1

    .line 329
    float-to-long v0, p1

    .line 330
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    return-object p1

    .line 335
    :pswitch_6
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 336
    .line 337
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 338
    .line 339
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 340
    .line 341
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 342
    .line 343
    int-to-long v3, v3

    .line 344
    add-long/2addr v1, v3

    .line 345
    invoke-virtual {p1, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 346
    .line 347
    .line 348
    move-result-wide v0

    .line 349
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 350
    .line 351
    add-int/lit8 p1, p1, 0x8

    .line 352
    .line 353
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 354
    .line 355
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 356
    .line 357
    if-eqz p1, :cond_8

    .line 358
    .line 359
    goto :goto_1

    .line 360
    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 361
    .line 362
    .line 363
    move-result-wide v0

    .line 364
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 365
    .line 366
    .line 367
    move-result-wide v0

    .line 368
    double-to-long v0, v0

    .line 369
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    return-object p1

    .line 374
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 375
    .line 376
    .line 377
    move-result-wide v0

    .line 378
    long-to-double v0, v0

    .line 379
    double-to-long v0, v0

    .line 380
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    return-object p1

    .line 385
    :pswitch_8
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 386
    .line 387
    return-object p1

    .line 388
    :pswitch_9
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 389
    .line 390
    return-object p1

    .line 391
    :pswitch_a
    const/4 p1, 0x0

    .line 392
    return-object p1

    .line 393
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    new-instance v0, Ljava/lang/String;

    .line 398
    .line 399
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 400
    .line 401
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 402
    .line 403
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 404
    .line 405
    invoke-direct {v0, v1, v2, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 406
    .line 407
    .line 408
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 409
    .line 410
    add-int/2addr v1, p1

    .line 411
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 412
    .line 413
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    return-object p1

    .line 418
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    new-instance v0, Ljava/lang/String;

    .line 423
    .line 424
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 425
    .line 426
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 427
    .line 428
    sget-object v3, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 429
    .line 430
    invoke-direct {v0, v1, v2, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 431
    .line 432
    .line 433
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 434
    .line 435
    add-int/2addr v1, p1

    .line 436
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 437
    .line 438
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    return-object p1

    .line 443
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 444
    .line 445
    .line 446
    move-result p1

    .line 447
    new-instance v0, Ljava/lang/String;

    .line 448
    .line 449
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 450
    .line 451
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 452
    .line 453
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 454
    .line 455
    invoke-direct {v0, v1, v2, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 456
    .line 457
    .line 458
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 459
    .line 460
    add-int/2addr v1, p1

    .line 461
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 462
    .line 463
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    return-object p1

    .line 468
    :cond_c
    :pswitch_b
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 469
    .line 470
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 471
    .line 472
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 477
    .line 478
    add-int/lit8 v0, v0, 0x4

    .line 479
    .line 480
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 481
    .line 482
    int-to-long v0, p1

    .line 483
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    return-object p1

    .line 488
    nop

    .line 489
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
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
    :pswitch_data_1
    .packed-switch -0x45
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_b
    .end packed-switch
.end method

.method private readDoubleValue0()D
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x4a

    .line 12
    .line 13
    if-eq v3, v4, :cond_16

    .line 14
    .line 15
    const/16 v4, -0x49

    .line 16
    .line 17
    if-eq v3, v4, :cond_14

    .line 18
    .line 19
    const/16 v4, -0x47

    .line 20
    .line 21
    if-eq v3, v4, :cond_12

    .line 22
    .line 23
    const/16 v4, 0x48

    .line 24
    .line 25
    if-eq v3, v4, :cond_10

    .line 26
    .line 27
    const/16 v4, 0x7c

    .line 28
    .line 29
    const/4 v5, -0x1

    .line 30
    const/16 v6, 0x2e

    .line 31
    .line 32
    if-eq v3, v4, :cond_e

    .line 33
    .line 34
    const/16 v4, 0x79

    .line 35
    .line 36
    if-eq v3, v4, :cond_c

    .line 37
    .line 38
    const/16 v4, 0x7a

    .line 39
    .line 40
    if-eq v3, v4, :cond_a

    .line 41
    .line 42
    const-wide/16 v7, 0x0

    .line 43
    .line 44
    packed-switch v3, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    packed-switch v3, :pswitch_data_1

    .line 48
    .line 49
    .line 50
    const/16 v4, -0x10

    .line 51
    .line 52
    if-lt v3, v4, :cond_0

    .line 53
    .line 54
    const/16 v4, 0x2f

    .line 55
    .line 56
    if-gt v3, v4, :cond_0

    .line 57
    .line 58
    int-to-double v0, v3

    .line 59
    return-wide v0

    .line 60
    :cond_0
    const/16 v4, 0x30

    .line 61
    .line 62
    if-lt v3, v4, :cond_1

    .line 63
    .line 64
    const/16 v4, 0x3f

    .line 65
    .line 66
    if-gt v3, v4, :cond_1

    .line 67
    .line 68
    add-int/lit8 v3, v3, -0x38

    .line 69
    .line 70
    shl-int/lit8 v3, v3, 0x8

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x2

    .line 73
    .line 74
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    aget-byte v0, v0, v2

    .line 77
    .line 78
    and-int/lit16 v0, v0, 0xff

    .line 79
    .line 80
    add-int/2addr v3, v0

    .line 81
    int-to-double v0, v3

    .line 82
    return-wide v0

    .line 83
    :cond_1
    const/16 v4, 0x40

    .line 84
    .line 85
    if-lt v3, v4, :cond_2

    .line 86
    .line 87
    const/16 v4, 0x47

    .line 88
    .line 89
    if-gt v3, v4, :cond_2

    .line 90
    .line 91
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x2

    .line 98
    .line 99
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 100
    .line 101
    int-to-double v0, v0

    .line 102
    return-wide v0

    .line 103
    :cond_2
    const/16 v4, -0x28

    .line 104
    .line 105
    if-lt v3, v4, :cond_3

    .line 106
    .line 107
    const/16 v7, -0x11

    .line 108
    .line 109
    if-gt v3, v7, :cond_3

    .line 110
    .line 111
    sub-int/2addr v3, v4

    .line 112
    int-to-long v0, v3

    .line 113
    const-wide/16 v2, -0x8

    .line 114
    .line 115
    add-long/2addr v0, v2

    .line 116
    long-to-double v0, v0

    .line 117
    return-wide v0

    .line 118
    :cond_3
    const/16 v4, -0x38

    .line 119
    .line 120
    if-lt v3, v4, :cond_4

    .line 121
    .line 122
    const/16 v4, -0x29

    .line 123
    .line 124
    if-gt v3, v4, :cond_4

    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x30

    .line 127
    .line 128
    shl-int/lit8 v3, v3, 0x8

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x2

    .line 131
    .line 132
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 133
    .line 134
    aget-byte v0, v0, v2

    .line 135
    .line 136
    and-int/lit16 v0, v0, 0xff

    .line 137
    .line 138
    add-int/2addr v3, v0

    .line 139
    int-to-double v0, v3

    .line 140
    return-wide v0

    .line 141
    :cond_4
    const/16 v4, -0x40

    .line 142
    .line 143
    if-lt v3, v4, :cond_5

    .line 144
    .line 145
    const/16 v4, -0x39

    .line 146
    .line 147
    if-gt v3, v4, :cond_5

    .line 148
    .line 149
    add-int/lit8 v3, v3, 0x3c

    .line 150
    .line 151
    shl-int/lit8 v3, v3, 0x10

    .line 152
    .line 153
    add-int/lit8 v4, v1, 0x2

    .line 154
    .line 155
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 156
    .line 157
    aget-byte v2, v0, v2

    .line 158
    .line 159
    and-int/lit16 v2, v2, 0xff

    .line 160
    .line 161
    shl-int/lit8 v2, v2, 0x8

    .line 162
    .line 163
    add-int/2addr v3, v2

    .line 164
    add-int/lit8 v1, v1, 0x3

    .line 165
    .line 166
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 167
    .line 168
    aget-byte v0, v0, v4

    .line 169
    .line 170
    and-int/lit16 v0, v0, 0xff

    .line 171
    .line 172
    add-int/2addr v3, v0

    .line 173
    int-to-double v0, v3

    .line 174
    return-wide v0

    .line 175
    :cond_5
    const/16 v0, 0x49

    .line 176
    .line 177
    if-lt v3, v0, :cond_7

    .line 178
    .line 179
    const/16 v1, 0x78

    .line 180
    .line 181
    if-gt v3, v1, :cond_7

    .line 182
    .line 183
    sub-int/2addr v3, v0

    .line 184
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 189
    .line 190
    add-int/2addr v1, v3

    .line 191
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 192
    .line 193
    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-ne v1, v5, :cond_6

    .line 198
    .line 199
    new-instance v1, Ljava/math/BigInteger;

    .line 200
    .line 201
    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    int-to-double v0, v0

    .line 209
    return-wide v0

    .line 210
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    int-to-double v0, v0

    .line 219
    return-wide v0

    .line 220
    :cond_7
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    throw v0

    .line 225
    :pswitch_0
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 226
    .line 227
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 228
    .line 229
    int-to-long v5, v2

    .line 230
    add-long/2addr v3, v5

    .line 231
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x8

    .line 238
    .line 239
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 240
    .line 241
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 242
    .line 243
    if-eqz v2, :cond_8

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 247
    .line 248
    .line 249
    move-result-wide v0

    .line 250
    :goto_0
    long-to-double v0, v0

    .line 251
    return-wide v0

    .line 252
    :pswitch_1
    add-int/lit8 v1, v1, 0x2

    .line 253
    .line 254
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 255
    .line 256
    aget-byte v0, v0, v2

    .line 257
    .line 258
    int-to-double v0, v0

    .line 259
    return-wide v0

    .line 260
    :pswitch_2
    add-int/lit8 v3, v1, 0x2

    .line 261
    .line 262
    aget-byte v3, v0, v3

    .line 263
    .line 264
    and-int/lit16 v3, v3, 0xff

    .line 265
    .line 266
    aget-byte v0, v0, v2

    .line 267
    .line 268
    shl-int/lit8 v0, v0, 0x8

    .line 269
    .line 270
    add-int/2addr v3, v0

    .line 271
    add-int/lit8 v1, v1, 0x3

    .line 272
    .line 273
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 274
    .line 275
    int-to-double v0, v3

    .line 276
    return-wide v0

    .line 277
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 278
    .line 279
    .line 280
    move-result-wide v0

    .line 281
    long-to-double v0, v0

    .line 282
    return-wide v0

    .line 283
    :pswitch_4
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 284
    .line 285
    return-wide v0

    .line 286
    :pswitch_5
    return-wide v7

    .line 287
    :pswitch_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 288
    .line 289
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 290
    .line 291
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 292
    .line 293
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 294
    .line 295
    and-long/2addr v0, v2

    .line 296
    const-wide/16 v2, 0x0

    .line 297
    .line 298
    cmp-long v0, v0, v2

    .line 299
    .line 300
    if-nez v0, :cond_9

    .line 301
    .line 302
    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 304
    .line 305
    return-wide v7

    .line 306
    :cond_9
    const-string v0, "long value not support input null"

    .line 307
    .line 308
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-wide/16 v0, 0x0

    .line 316
    .line 317
    return-wide v0

    .line 318
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    new-instance v2, Ljava/lang/String;

    .line 323
    .line 324
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 325
    .line 326
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 327
    .line 328
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 329
    .line 330
    .line 331
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 332
    .line 333
    add-int/2addr v0, v1

    .line 334
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 335
    .line 336
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-ne v0, v5, :cond_b

    .line 341
    .line 342
    new-instance v0, Ljava/math/BigInteger;

    .line 343
    .line 344
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    int-to-double v0, v0

    .line 352
    return-wide v0

    .line 353
    :cond_b
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    int-to-double v0, v0

    .line 362
    return-wide v0

    .line 363
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    new-instance v2, Ljava/lang/String;

    .line 368
    .line 369
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 370
    .line 371
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 372
    .line 373
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 374
    .line 375
    .line 376
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 377
    .line 378
    add-int/2addr v0, v1

    .line 379
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 380
    .line 381
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-ne v0, v5, :cond_d

    .line 386
    .line 387
    new-instance v0, Ljava/math/BigInteger;

    .line 388
    .line 389
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    int-to-double v0, v0

    .line 397
    return-wide v0

    .line 398
    :cond_d
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    int-to-double v0, v0

    .line 407
    return-wide v0

    .line 408
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    new-instance v2, Ljava/lang/String;

    .line 413
    .line 414
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 415
    .line 416
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 417
    .line 418
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 419
    .line 420
    .line 421
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 422
    .line 423
    add-int/2addr v0, v1

    .line 424
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 425
    .line 426
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-ne v0, v5, :cond_f

    .line 431
    .line 432
    new-instance v0, Ljava/math/BigInteger;

    .line 433
    .line 434
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    int-to-double v0, v0

    .line 442
    return-wide v0

    .line 443
    :cond_f
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    int-to-double v0, v0

    .line 452
    return-wide v0

    .line 453
    :cond_10
    :pswitch_7
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 454
    .line 455
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 456
    .line 457
    int-to-long v5, v2

    .line 458
    add-long/2addr v3, v5

    .line 459
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 464
    .line 465
    add-int/lit8 v1, v1, 0x4

    .line 466
    .line 467
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 468
    .line 469
    sget-boolean v1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 470
    .line 471
    if-eqz v1, :cond_11

    .line 472
    .line 473
    int-to-double v0, v0

    .line 474
    return-wide v0

    .line 475
    :cond_11
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    int-to-double v0, v0

    .line 480
    return-wide v0

    .line 481
    :cond_12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    if-nez v0, :cond_13

    .line 490
    .line 491
    new-instance v0, Ljava/math/BigDecimal;

    .line 492
    .line 493
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 494
    .line 495
    .line 496
    goto :goto_1

    .line 497
    :cond_13
    new-instance v2, Ljava/math/BigDecimal;

    .line 498
    .line 499
    invoke-direct {v2, v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 500
    .line 501
    .line 502
    move-object v0, v2

    .line 503
    :goto_1
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    int-to-double v0, v0

    .line 508
    return-wide v0

    .line 509
    :cond_14
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 510
    .line 511
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 512
    .line 513
    int-to-long v5, v2

    .line 514
    add-long/2addr v3, v5

    .line 515
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 520
    .line 521
    add-int/lit8 v1, v1, 0x4

    .line 522
    .line 523
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 524
    .line 525
    sget-boolean v1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 526
    .line 527
    if-eqz v1, :cond_15

    .line 528
    .line 529
    goto :goto_2

    .line 530
    :cond_15
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    float-to-double v0, v0

    .line 539
    return-wide v0

    .line 540
    :cond_16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    int-to-float v0, v0

    .line 545
    float-to-double v0, v0

    .line 546
    return-wide v0

    .line 547
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method private readFloat0()F
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x47

    .line 12
    .line 13
    if-eq v3, v4, :cond_12

    .line 14
    .line 15
    const/16 v4, 0x48

    .line 16
    .line 17
    if-eq v3, v4, :cond_11

    .line 18
    .line 19
    const/16 v4, 0x7c

    .line 20
    .line 21
    const/4 v5, -0x1

    .line 22
    const/16 v6, 0x2e

    .line 23
    .line 24
    if-eq v3, v4, :cond_f

    .line 25
    .line 26
    const/16 v4, 0x79

    .line 27
    .line 28
    if-eq v3, v4, :cond_d

    .line 29
    .line 30
    const/16 v4, 0x7a

    .line 31
    .line 32
    if-eq v3, v4, :cond_b

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    packed-switch v3, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch v3, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    const/16 v4, -0x10

    .line 42
    .line 43
    if-lt v3, v4, :cond_0

    .line 44
    .line 45
    const/16 v4, 0x2f

    .line 46
    .line 47
    if-gt v3, v4, :cond_0

    .line 48
    .line 49
    int-to-float v0, v3

    .line 50
    return v0

    .line 51
    :cond_0
    const/16 v4, 0x30

    .line 52
    .line 53
    if-lt v3, v4, :cond_1

    .line 54
    .line 55
    const/16 v4, 0x3f

    .line 56
    .line 57
    if-gt v3, v4, :cond_1

    .line 58
    .line 59
    add-int/lit8 v3, v3, -0x38

    .line 60
    .line 61
    shl-int/lit8 v3, v3, 0x8

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 66
    .line 67
    aget-byte v0, v0, v2

    .line 68
    .line 69
    and-int/lit16 v0, v0, 0xff

    .line 70
    .line 71
    add-int/2addr v3, v0

    .line 72
    int-to-float v0, v3

    .line 73
    return v0

    .line 74
    :cond_1
    const/16 v4, 0x40

    .line 75
    .line 76
    if-lt v3, v4, :cond_2

    .line 77
    .line 78
    const/16 v4, 0x47

    .line 79
    .line 80
    if-gt v3, v4, :cond_2

    .line 81
    .line 82
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x2

    .line 89
    .line 90
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 91
    .line 92
    int-to-float v0, v0

    .line 93
    return v0

    .line 94
    :cond_2
    const/16 v4, -0x28

    .line 95
    .line 96
    if-lt v3, v4, :cond_3

    .line 97
    .line 98
    const/16 v4, -0x11

    .line 99
    .line 100
    if-gt v3, v4, :cond_3

    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x20

    .line 103
    .line 104
    int-to-float v0, v3

    .line 105
    return v0

    .line 106
    :cond_3
    const/16 v4, -0x38

    .line 107
    .line 108
    if-lt v3, v4, :cond_4

    .line 109
    .line 110
    const/16 v4, -0x29

    .line 111
    .line 112
    if-gt v3, v4, :cond_4

    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x30

    .line 115
    .line 116
    shl-int/lit8 v3, v3, 0x8

    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x2

    .line 119
    .line 120
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 121
    .line 122
    aget-byte v0, v0, v2

    .line 123
    .line 124
    and-int/lit16 v0, v0, 0xff

    .line 125
    .line 126
    add-int/2addr v3, v0

    .line 127
    int-to-float v0, v3

    .line 128
    return v0

    .line 129
    :cond_4
    const/16 v4, -0x40

    .line 130
    .line 131
    if-lt v3, v4, :cond_5

    .line 132
    .line 133
    const/16 v4, -0x39

    .line 134
    .line 135
    if-gt v3, v4, :cond_5

    .line 136
    .line 137
    add-int/lit8 v3, v3, 0x3c

    .line 138
    .line 139
    shl-int/lit8 v3, v3, 0x10

    .line 140
    .line 141
    add-int/lit8 v4, v1, 0x2

    .line 142
    .line 143
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 144
    .line 145
    aget-byte v2, v0, v2

    .line 146
    .line 147
    and-int/lit16 v2, v2, 0xff

    .line 148
    .line 149
    shl-int/lit8 v2, v2, 0x8

    .line 150
    .line 151
    add-int/2addr v3, v2

    .line 152
    add-int/lit8 v1, v1, 0x3

    .line 153
    .line 154
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 155
    .line 156
    aget-byte v0, v0, v4

    .line 157
    .line 158
    and-int/lit16 v0, v0, 0xff

    .line 159
    .line 160
    add-int/2addr v3, v0

    .line 161
    int-to-float v0, v3

    .line 162
    return v0

    .line 163
    :cond_5
    const/16 v0, 0x49

    .line 164
    .line 165
    if-lt v3, v0, :cond_7

    .line 166
    .line 167
    const/16 v1, 0x78

    .line 168
    .line 169
    if-gt v3, v1, :cond_7

    .line 170
    .line 171
    sub-int/2addr v3, v0

    .line 172
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 177
    .line 178
    add-int/2addr v1, v3

    .line 179
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 180
    .line 181
    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-ne v1, v5, :cond_6

    .line 186
    .line 187
    new-instance v1, Ljava/math/BigInteger;

    .line 188
    .line 189
    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    int-to-float v0, v0

    .line 197
    return v0

    .line 198
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    int-to-float v0, v0

    .line 207
    return v0

    .line 208
    :cond_7
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    throw v0

    .line 213
    :pswitch_0
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 214
    .line 215
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 216
    .line 217
    int-to-long v5, v2

    .line 218
    add-long/2addr v3, v5

    .line 219
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 220
    .line 221
    .line 222
    move-result-wide v0

    .line 223
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 224
    .line 225
    add-int/lit8 v2, v2, 0x8

    .line 226
    .line 227
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 228
    .line 229
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 230
    .line 231
    if-eqz v2, :cond_8

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    :goto_0
    long-to-float v0, v0

    .line 239
    return v0

    .line 240
    :pswitch_1
    add-int/lit8 v1, v1, 0x2

    .line 241
    .line 242
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 243
    .line 244
    aget-byte v0, v0, v2

    .line 245
    .line 246
    int-to-float v0, v0

    .line 247
    return v0

    .line 248
    :pswitch_2
    add-int/lit8 v3, v1, 0x2

    .line 249
    .line 250
    aget-byte v3, v0, v3

    .line 251
    .line 252
    and-int/lit16 v3, v3, 0xff

    .line 253
    .line 254
    aget-byte v0, v0, v2

    .line 255
    .line 256
    shl-int/lit8 v0, v0, 0x8

    .line 257
    .line 258
    add-int/2addr v3, v0

    .line 259
    add-int/lit8 v1, v1, 0x3

    .line 260
    .line 261
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 262
    .line 263
    int-to-float v0, v3

    .line 264
    return v0

    .line 265
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    int-to-float v0, v0

    .line 270
    return v0

    .line 271
    :pswitch_4
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 272
    .line 273
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 274
    .line 275
    int-to-long v5, v2

    .line 276
    add-long/2addr v3, v5

    .line 277
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 278
    .line 279
    .line 280
    move-result-wide v0

    .line 281
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 282
    .line 283
    add-int/lit8 v2, v2, 0x8

    .line 284
    .line 285
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 286
    .line 287
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 288
    .line 289
    if-eqz v2, :cond_9

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_9
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 293
    .line 294
    .line 295
    move-result-wide v0

    .line 296
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    double-to-float v0, v0

    .line 301
    return v0

    .line 302
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 303
    .line 304
    .line 305
    move-result-wide v0

    .line 306
    long-to-double v0, v0

    .line 307
    double-to-float v0, v0

    .line 308
    return v0

    .line 309
    :pswitch_6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 310
    .line 311
    return v0

    .line 312
    :pswitch_7
    return v4

    .line 313
    :pswitch_8
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 314
    .line 315
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 316
    .line 317
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 318
    .line 319
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 320
    .line 321
    and-long/2addr v0, v2

    .line 322
    const-wide/16 v2, 0x0

    .line 323
    .line 324
    cmp-long v0, v0, v2

    .line 325
    .line 326
    if-nez v0, :cond_a

    .line 327
    .line 328
    const/4 v0, 0x1

    .line 329
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 330
    .line 331
    return v4

    .line 332
    :cond_a
    const-string v0, "long value not support input null"

    .line 333
    .line 334
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const/4 v0, 0x0

    .line 342
    return v0

    .line 343
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    new-instance v2, Ljava/lang/String;

    .line 348
    .line 349
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 350
    .line 351
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 352
    .line 353
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 354
    .line 355
    .line 356
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 357
    .line 358
    add-int/2addr v0, v1

    .line 359
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 360
    .line 361
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-ne v0, v5, :cond_c

    .line 366
    .line 367
    new-instance v0, Ljava/math/BigInteger;

    .line 368
    .line 369
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    int-to-float v0, v0

    .line 377
    return v0

    .line 378
    :cond_c
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    int-to-float v0, v0

    .line 387
    return v0

    .line 388
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    new-instance v2, Ljava/lang/String;

    .line 393
    .line 394
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 395
    .line 396
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 397
    .line 398
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 399
    .line 400
    .line 401
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 402
    .line 403
    add-int/2addr v0, v1

    .line 404
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 405
    .line 406
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-ne v0, v5, :cond_e

    .line 411
    .line 412
    new-instance v0, Ljava/math/BigInteger;

    .line 413
    .line 414
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    int-to-float v0, v0

    .line 422
    return v0

    .line 423
    :cond_e
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    int-to-float v0, v0

    .line 432
    return v0

    .line 433
    :cond_f
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    new-instance v2, Ljava/lang/String;

    .line 438
    .line 439
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 440
    .line 441
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 442
    .line 443
    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 444
    .line 445
    .line 446
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 447
    .line 448
    add-int/2addr v0, v1

    .line 449
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 450
    .line 451
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-ne v0, v5, :cond_10

    .line 456
    .line 457
    new-instance v0, Ljava/math/BigInteger;

    .line 458
    .line 459
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    int-to-float v0, v0

    .line 467
    return v0

    .line 468
    :cond_10
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    int-to-float v0, v0

    .line 477
    return v0

    .line 478
    :cond_11
    :pswitch_9
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 483
    .line 484
    add-int/lit8 v1, v1, 0x4

    .line 485
    .line 486
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 487
    .line 488
    int-to-float v0, v0

    .line 489
    return v0

    .line 490
    :cond_12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    if-nez v0, :cond_13

    .line 499
    .line 500
    new-instance v0, Ljava/math/BigDecimal;

    .line 501
    .line 502
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 503
    .line 504
    .line 505
    goto :goto_2

    .line 506
    :cond_13
    new-instance v2, Ljava/math/BigDecimal;

    .line 507
    .line 508
    invoke-direct {v2, v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 509
    .line 510
    .line 511
    move-object v0, v2

    .line 512
    :goto_2
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    int-to-float v0, v0

    .line 517
    return v0

    .line 518
    nop

    .line 519
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_9
    .end packed-switch
.end method

.method private readGB18030()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 10
    .line 11
    sget-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "GB18030"

    .line 16
    .line 17
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method private readInt32Value0([BB)I
    .locals 5

    .line 1
    const/16 v0, -0x28

    .line 2
    .line 3
    if-lt p2, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, -0x11

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    add-int/lit8 p2, p2, 0x20

    .line 10
    .line 11
    return p2

    .line 12
    :cond_0
    const/16 v0, -0x38

    .line 13
    .line 14
    if-lt p2, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, -0x29

    .line 17
    .line 18
    if-gt p2, v0, :cond_1

    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x30

    .line 21
    .line 22
    shl-int/lit8 p2, p2, 0x8

    .line 23
    .line 24
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    add-int/lit8 v1, v0, 0x1

    .line 27
    .line 28
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    aget-byte p1, p1, v0

    .line 31
    .line 32
    and-int/lit16 p1, p1, 0xff

    .line 33
    .line 34
    add-int/2addr p2, p1

    .line 35
    return p2

    .line 36
    :cond_1
    const/16 v0, -0x40

    .line 37
    .line 38
    if-lt p2, v0, :cond_2

    .line 39
    .line 40
    const/16 v0, -0x39

    .line 41
    .line 42
    if-gt p2, v0, :cond_2

    .line 43
    .line 44
    add-int/lit8 p2, p2, 0x3c

    .line 45
    .line 46
    shl-int/lit8 p2, p2, 0x10

    .line 47
    .line 48
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    add-int/lit8 v1, v0, 0x1

    .line 51
    .line 52
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 53
    .line 54
    aget-byte v2, p1, v0

    .line 55
    .line 56
    and-int/lit16 v2, v2, 0xff

    .line 57
    .line 58
    shl-int/lit8 v2, v2, 0x8

    .line 59
    .line 60
    add-int/2addr p2, v2

    .line 61
    add-int/lit8 v0, v0, 0x2

    .line 62
    .line 63
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 64
    .line 65
    aget-byte p1, p1, v1

    .line 66
    .line 67
    and-int/lit16 p1, p1, 0xff

    .line 68
    .line 69
    add-int/2addr p2, p1

    .line 70
    return p2

    .line 71
    :cond_2
    const/16 v0, -0x54

    .line 72
    .line 73
    if-eq p2, v0, :cond_f

    .line 74
    .line 75
    const/16 v0, -0x53

    .line 76
    .line 77
    if-eq p2, v0, :cond_f

    .line 78
    .line 79
    const/16 v0, -0x47

    .line 80
    .line 81
    if-eq p2, v0, :cond_d

    .line 82
    .line 83
    const/16 v0, 0x7c

    .line 84
    .line 85
    const/4 v1, -0x1

    .line 86
    const/16 v2, 0x2e

    .line 87
    .line 88
    if-eq p2, v0, :cond_b

    .line 89
    .line 90
    const/16 v0, 0x79

    .line 91
    .line 92
    if-eq p2, v0, :cond_9

    .line 93
    .line 94
    const/16 v0, 0x7a

    .line 95
    .line 96
    if-eq p2, v0, :cond_7

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    const/4 v3, 0x1

    .line 100
    packed-switch p2, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    packed-switch p2, :pswitch_data_1

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x49

    .line 107
    .line 108
    if-lt p2, v0, :cond_4

    .line 109
    .line 110
    const/16 v3, 0x78

    .line 111
    .line 112
    if-gt p2, v3, :cond_4

    .line 113
    .line 114
    sub-int/2addr p2, v0

    .line 115
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    add-int/2addr v0, p2

    .line 124
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 125
    .line 126
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-ne p2, v1, :cond_3

    .line 131
    .line 132
    new-instance p2, Ljava/math/BigInteger;

    .line 133
    .line 134
    invoke-direct {p2, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/math/BigInteger;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    return p1

    .line 142
    :cond_3
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    return p1

    .line 151
    :cond_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 156
    .line 157
    array-length p1, p1

    .line 158
    const-string v1, "readInt32Value not support "

    .line 159
    .line 160
    invoke-static {v1, v0, p1, p2}, Lah/a;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    return p1

    .line 165
    :pswitch_0
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 166
    .line 167
    sget-wide v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 168
    .line 169
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 170
    .line 171
    int-to-long v2, v2

    .line 172
    add-long/2addr v0, v2

    .line 173
    invoke-virtual {p2, p1, v0, v1}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 174
    .line 175
    .line 176
    move-result-wide p1

    .line 177
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 178
    .line 179
    add-int/lit8 v0, v0, 0x8

    .line 180
    .line 181
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 182
    .line 183
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 184
    .line 185
    if-eqz v0, :cond_5

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_5
    invoke-static {p1, p2}, Ljava/lang/Long;->reverseBytes(J)J

    .line 189
    .line 190
    .line 191
    move-result-wide p1

    .line 192
    :goto_0
    long-to-int p1, p1

    .line 193
    return p1

    .line 194
    :pswitch_1
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 195
    .line 196
    add-int/lit8 v0, p2, 0x1

    .line 197
    .line 198
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 199
    .line 200
    aget-byte p1, p1, p2

    .line 201
    .line 202
    return p1

    .line 203
    :pswitch_2
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 204
    .line 205
    add-int/lit8 v0, p2, 0x1

    .line 206
    .line 207
    aget-byte v0, p1, v0

    .line 208
    .line 209
    and-int/lit16 v0, v0, 0xff

    .line 210
    .line 211
    aget-byte p1, p1, p2

    .line 212
    .line 213
    shl-int/lit8 p1, p1, 0x8

    .line 214
    .line 215
    add-int/2addr v0, p1

    .line 216
    add-int/lit8 p2, p2, 0x2

    .line 217
    .line 218
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 219
    .line 220
    return v0

    .line 221
    :pswitch_3
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 222
    .line 223
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 228
    .line 229
    add-int/lit8 p2, p2, 0x4

    .line 230
    .line 231
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 232
    .line 233
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    float-to-int p1, p1

    .line 238
    return p1

    .line 239
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    int-to-float p1, p1

    .line 244
    float-to-int p1, p1

    .line 245
    return p1

    .line 246
    :pswitch_5
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 247
    .line 248
    sub-int/2addr p1, v3

    .line 249
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readDoubleValue()D

    .line 252
    .line 253
    .line 254
    move-result-wide p1

    .line 255
    double-to-int p1, p1

    .line 256
    return p1

    .line 257
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 258
    .line 259
    .line 260
    move-result-wide p1

    .line 261
    long-to-int p1, p1

    .line 262
    return p1

    .line 263
    :pswitch_7
    return v3

    .line 264
    :pswitch_8
    return v0

    .line 265
    :pswitch_9
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 266
    .line 267
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 268
    .line 269
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 270
    .line 271
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 272
    .line 273
    and-long/2addr p1, v1

    .line 274
    const-wide/16 v1, 0x0

    .line 275
    .line 276
    cmp-long p1, p1, v1

    .line 277
    .line 278
    if-nez p1, :cond_6

    .line 279
    .line 280
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 281
    .line 282
    return v0

    .line 283
    :cond_6
    const-string p1, "int value not support input null"

    .line 284
    .line 285
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const/4 p1, 0x0

    .line 293
    return p1

    .line 294
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 295
    .line 296
    .line 297
    move-result p2

    .line 298
    new-instance v0, Ljava/lang/String;

    .line 299
    .line 300
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 301
    .line 302
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 303
    .line 304
    invoke-direct {v0, p1, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 305
    .line 306
    .line 307
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 308
    .line 309
    add-int/2addr p1, p2

    .line 310
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 311
    .line 312
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-ne p1, v1, :cond_8

    .line 317
    .line 318
    new-instance p1, Ljava/math/BigInteger;

    .line 319
    .line 320
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    return p1

    .line 328
    :cond_8
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    return p1

    .line 337
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 342
    .line 343
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 348
    .line 349
    add-int/2addr v0, p1

    .line 350
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 351
    .line 352
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    if-ne p1, v1, :cond_a

    .line 357
    .line 358
    new-instance p1, Ljava/math/BigInteger;

    .line 359
    .line 360
    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    return p1

    .line 368
    :cond_a
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    return p1

    .line 377
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 378
    .line 379
    .line 380
    move-result p2

    .line 381
    new-instance v0, Ljava/lang/String;

    .line 382
    .line 383
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 384
    .line 385
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 386
    .line 387
    invoke-direct {v0, p1, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 388
    .line 389
    .line 390
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 391
    .line 392
    add-int/2addr p1, p2

    .line 393
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 394
    .line 395
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-ne p1, v1, :cond_c

    .line 400
    .line 401
    new-instance p1, Ljava/math/BigInteger;

    .line 402
    .line 403
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    return p1

    .line 411
    :cond_c
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    return p1

    .line 420
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    if-nez p1, :cond_e

    .line 429
    .line 430
    new-instance p1, Ljava/math/BigDecimal;

    .line 431
    .line 432
    invoke-direct {p1, p2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 433
    .line 434
    .line 435
    goto :goto_1

    .line 436
    :cond_e
    new-instance v0, Ljava/math/BigDecimal;

    .line 437
    .line 438
    invoke-direct {v0, p2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 439
    .line 440
    .line 441
    move-object p1, v0

    .line 442
    :goto_1
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    return p1

    .line 447
    :cond_f
    :pswitch_a
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 448
    .line 449
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 454
    .line 455
    add-int/lit8 p2, p2, 0x4

    .line 456
    .line 457
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 458
    .line 459
    return p1

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method private readInt32ValueError(B)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "readInt32Value not support "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, ", offset "

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "/"

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 33
    .line 34
    array-length p1, p1

    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method private readInt64Value0([BB)J
    .locals 5

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-lt p2, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x3f

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    add-int/lit8 p2, p2, -0x38

    .line 10
    .line 11
    shl-int/lit8 p2, p2, 0x8

    .line 12
    .line 13
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 18
    .line 19
    aget-byte p1, p1, v0

    .line 20
    .line 21
    and-int/lit16 p1, p1, 0xff

    .line 22
    .line 23
    add-int/2addr p2, p1

    .line 24
    int-to-long p1, p2

    .line 25
    return-wide p1

    .line 26
    :cond_0
    const/16 v0, -0x10

    .line 27
    .line 28
    if-lt p2, v0, :cond_1

    .line 29
    .line 30
    const/16 v0, 0x2f

    .line 31
    .line 32
    if-gt p2, v0, :cond_1

    .line 33
    .line 34
    int-to-long p1, p2

    .line 35
    return-wide p1

    .line 36
    :cond_1
    const/16 v0, 0x40

    .line 37
    .line 38
    if-lt p2, v0, :cond_2

    .line 39
    .line 40
    const/16 v0, 0x47

    .line 41
    .line 42
    if-gt p2, v0, :cond_2

    .line 43
    .line 44
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    invoke-static {p1, v0, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 51
    .line 52
    add-int/lit8 p2, p2, 0x2

    .line 53
    .line 54
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    int-to-long p1, p1

    .line 57
    return-wide p1

    .line 58
    :cond_2
    const/16 v0, -0x47

    .line 59
    .line 60
    if-eq p2, v0, :cond_10

    .line 61
    .line 62
    const/16 v0, 0x48

    .line 63
    .line 64
    if-eq p2, v0, :cond_f

    .line 65
    .line 66
    const/16 v0, 0x7c

    .line 67
    .line 68
    const/4 v1, -0x1

    .line 69
    const/16 v2, 0x2e

    .line 70
    .line 71
    if-eq p2, v0, :cond_d

    .line 72
    .line 73
    const/16 v0, -0x44

    .line 74
    .line 75
    if-eq p2, v0, :cond_c

    .line 76
    .line 77
    const/16 v0, -0x43

    .line 78
    .line 79
    if-eq p2, v0, :cond_b

    .line 80
    .line 81
    const/16 v0, 0x79

    .line 82
    .line 83
    if-eq p2, v0, :cond_9

    .line 84
    .line 85
    const/16 v0, 0x7a

    .line 86
    .line 87
    if-eq p2, v0, :cond_7

    .line 88
    .line 89
    packed-switch p2, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    const-wide/16 v3, 0x0

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    packed-switch p2, :pswitch_data_1

    .line 96
    .line 97
    .line 98
    const/16 v0, 0x49

    .line 99
    .line 100
    if-lt p2, v0, :cond_4

    .line 101
    .line 102
    const/16 v3, 0x78

    .line 103
    .line 104
    if-gt p2, v3, :cond_4

    .line 105
    .line 106
    sub-int/2addr p2, v0

    .line 107
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 114
    .line 115
    add-int/2addr v0, p2

    .line 116
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 117
    .line 118
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-ne p2, v1, :cond_3

    .line 123
    .line 124
    new-instance p2, Ljava/math/BigInteger;

    .line 125
    .line 126
    invoke-direct {p2, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/math/BigInteger;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide p1

    .line 133
    return-wide p1

    .line 134
    :cond_3
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide p1

    .line 142
    return-wide p1

    .line 143
    :cond_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 148
    .line 149
    array-length p1, p1

    .line 150
    const-string v1, "readInt64Value not support "

    .line 151
    .line 152
    invoke-static {v1, v0, p1, p2}, Lah/a;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    const-wide/16 p1, 0x0

    .line 156
    .line 157
    return-wide p1

    .line 158
    :pswitch_0
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 159
    .line 160
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 165
    .line 166
    add-int/lit8 p2, p2, 0x4

    .line 167
    .line 168
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 169
    .line 170
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    float-to-long p1, p1

    .line 175
    return-wide p1

    .line 176
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    int-to-float p1, p1

    .line 181
    float-to-long p1, p1

    .line 182
    return-wide p1

    .line 183
    :pswitch_2
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 184
    .line 185
    sub-int/2addr p1, v0

    .line 186
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readDoubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide p1

    .line 192
    double-to-long p1, p1

    .line 193
    return-wide p1

    .line 194
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 195
    .line 196
    .line 197
    move-result-wide p1

    .line 198
    long-to-double p1, p1

    .line 199
    double-to-long p1, p1

    .line 200
    return-wide p1

    .line 201
    :pswitch_4
    const-wide/16 p1, 0x1

    .line 202
    .line 203
    return-wide p1

    .line 204
    :pswitch_5
    return-wide v3

    .line 205
    :pswitch_6
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 206
    .line 207
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 208
    .line 209
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 210
    .line 211
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 212
    .line 213
    and-long/2addr p1, v1

    .line 214
    cmp-long p1, p1, v3

    .line 215
    .line 216
    if-nez p1, :cond_5

    .line 217
    .line 218
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 219
    .line 220
    return-wide v3

    .line 221
    :cond_5
    const-string p1, "long value not support input null"

    .line 222
    .line 223
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const-wide/16 p1, 0x0

    .line 231
    .line 232
    return-wide p1

    .line 233
    :pswitch_7
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 234
    .line 235
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    int-to-long p1, p1

    .line 240
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 241
    .line 242
    add-int/lit8 v0, v0, 0x4

    .line 243
    .line 244
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 245
    .line 246
    const-wide/32 v0, 0xea60

    .line 247
    .line 248
    .line 249
    mul-long/2addr p1, v0

    .line 250
    return-wide p1

    .line 251
    :pswitch_8
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 252
    .line 253
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    int-to-long p1, p1

    .line 258
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 259
    .line 260
    add-int/lit8 v0, v0, 0x4

    .line 261
    .line 262
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 263
    .line 264
    const-wide/16 v0, 0x3e8

    .line 265
    .line 266
    mul-long/2addr p1, v0

    .line 267
    return-wide p1

    .line 268
    :pswitch_9
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 269
    .line 270
    sget-wide v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 271
    .line 272
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 273
    .line 274
    int-to-long v2, v2

    .line 275
    add-long/2addr v0, v2

    .line 276
    invoke-virtual {p2, p1, v0, v1}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 277
    .line 278
    .line 279
    move-result-wide p1

    .line 280
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 281
    .line 282
    add-int/lit8 v0, v0, 0x8

    .line 283
    .line 284
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 285
    .line 286
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 287
    .line 288
    if-eqz v0, :cond_6

    .line 289
    .line 290
    return-wide p1

    .line 291
    :cond_6
    invoke-static {p1, p2}, Ljava/lang/Long;->reverseBytes(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide p1

    .line 295
    return-wide p1

    .line 296
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    new-instance v0, Ljava/lang/String;

    .line 301
    .line 302
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 303
    .line 304
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 305
    .line 306
    invoke-direct {v0, p1, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 307
    .line 308
    .line 309
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 310
    .line 311
    add-int/2addr p1, p2

    .line 312
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 313
    .line 314
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-ne p1, v1, :cond_8

    .line 319
    .line 320
    new-instance p1, Ljava/math/BigInteger;

    .line 321
    .line 322
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    int-to-long p1, p1

    .line 330
    return-wide p1

    .line 331
    :cond_8
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    int-to-long p1, p1

    .line 340
    return-wide p1

    .line 341
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 346
    .line 347
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 352
    .line 353
    add-int/2addr v0, p1

    .line 354
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 355
    .line 356
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-ne p1, v1, :cond_a

    .line 361
    .line 362
    new-instance p1, Ljava/math/BigInteger;

    .line 363
    .line 364
    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    int-to-long p1, p1

    .line 372
    return-wide p1

    .line 373
    :cond_a
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    int-to-long p1, p1

    .line 382
    return-wide p1

    .line 383
    :cond_b
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 384
    .line 385
    add-int/lit8 v0, p2, 0x1

    .line 386
    .line 387
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 388
    .line 389
    aget-byte p1, p1, p2

    .line 390
    .line 391
    int-to-long p1, p1

    .line 392
    return-wide p1

    .line 393
    :cond_c
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 394
    .line 395
    add-int/lit8 v0, p2, 0x1

    .line 396
    .line 397
    aget-byte v0, p1, v0

    .line 398
    .line 399
    and-int/lit16 v0, v0, 0xff

    .line 400
    .line 401
    aget-byte p1, p1, p2

    .line 402
    .line 403
    shl-int/lit8 p1, p1, 0x8

    .line 404
    .line 405
    add-int/2addr v0, p1

    .line 406
    add-int/lit8 p2, p2, 0x2

    .line 407
    .line 408
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 409
    .line 410
    int-to-long p1, v0

    .line 411
    return-wide p1

    .line 412
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 413
    .line 414
    .line 415
    move-result p2

    .line 416
    new-instance v0, Ljava/lang/String;

    .line 417
    .line 418
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 419
    .line 420
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 421
    .line 422
    invoke-direct {v0, p1, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 423
    .line 424
    .line 425
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 426
    .line 427
    add-int/2addr p1, p2

    .line 428
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 429
    .line 430
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-ne p1, v1, :cond_e

    .line 435
    .line 436
    new-instance p1, Ljava/math/BigInteger;

    .line 437
    .line 438
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    int-to-long p1, p1

    .line 446
    return-wide p1

    .line 447
    :cond_e
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    int-to-long p1, p1

    .line 456
    return-wide p1

    .line 457
    :cond_f
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 458
    .line 459
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 464
    .line 465
    add-int/lit8 p2, p2, 0x4

    .line 466
    .line 467
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 468
    .line 469
    int-to-long p1, p1

    .line 470
    return-wide p1

    .line 471
    :cond_10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 472
    .line 473
    .line 474
    move-result p1

    .line 475
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 476
    .line 477
    .line 478
    move-result-object p2

    .line 479
    if-nez p1, :cond_11

    .line 480
    .line 481
    new-instance p1, Ljava/math/BigDecimal;

    .line 482
    .line 483
    invoke-direct {p1, p2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 484
    .line 485
    .line 486
    goto :goto_0

    .line 487
    :cond_11
    new-instance v0, Ljava/math/BigDecimal;

    .line 488
    .line 489
    invoke-direct {v0, p2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 490
    .line 491
    .line 492
    move-object p1, v0

    .line 493
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 494
    .line 495
    .line 496
    move-result-wide p1

    .line 497
    return-wide p1

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :pswitch_data_1
    .packed-switch -0x51
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private readInt64ValueError(B)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "readInt64Value not support "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, ", offset "

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "/"

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 33
    .line 34
    array-length p1, p1

    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method private readLocalDate0(I)Ljava/time/LocalDate;
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x78

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getStringLength()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "TODO : "

    .line 17
    .line 18
    const-string v1, ", "

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1, v0}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1

    .line 33
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate11()Ljava/time/LocalDate;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate10()Ljava/time/LocalDate;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate9()Ljava/time/LocalDate;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate8()Ljava/time/LocalDate;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_0
    const/16 v0, 0x7a

    .line 54
    .line 55
    if-eq p1, v0, :cond_1

    .line 56
    .line 57
    const/16 v0, 0x79

    .line 58
    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    :cond_1
    int-to-byte p1, p1

    .line 62
    iput-byte p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 63
    .line 64
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 65
    .line 66
    add-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 75
    .line 76
    packed-switch p1, :pswitch_data_1

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate11()Ljava/time/LocalDate;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate10()Ljava/time/LocalDate;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate9()Ljava/time/LocalDate;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate8()Ljava/time/LocalDate;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private readLocalDateTime0(I)Ljava/time/LocalDateTime;
    .locals 2

    .line 1
    const/16 v0, -0x57

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate()Ljava/time/LocalDate;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 14
    .line 15
    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_1
    const/16 v0, -0x56

    .line 21
    .line 22
    if-ne p1, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_2
    const/16 v0, 0x49

    .line 34
    .line 35
    if-lt p1, v0, :cond_9

    .line 36
    .line 37
    const/16 v0, 0x78

    .line 38
    .line 39
    if-gt p1, v0, :cond_9

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getStringLength()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    packed-switch p1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    :pswitch_0
    goto :goto_0

    .line 49
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTimeX(I)Ljava/time/LocalDateTime;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_4
    :goto_0
    const-string v0, "TODO : "

    .line 68
    .line 69
    const-string v1, ", "

    .line 70
    .line 71
    invoke-static {p1, v0, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p1, v0}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime18()Ljava/time/LocalDateTime;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime17()Ljava/time/LocalDateTime;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime16()Ljava/time/LocalDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate11()Ljava/time/LocalDate;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-nez p1, :cond_5

    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_5
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 117
    .line 118
    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate10()Ljava/time/LocalDate;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-nez p1, :cond_6

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_6
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 131
    .line 132
    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate9()Ljava/time/LocalDate;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_7
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 145
    .line 146
    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate8()Ljava/time/LocalDate;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-nez p1, :cond_8

    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_8
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 159
    .line 160
    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_9
    int-to-byte p1, p1

    .line 166
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    const-string v0, "not support type : "

    .line 171
    .line 172
    invoke-static {p1, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 p1, 0x0

    .line 176
    return-object p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private readStringError()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "string value not support input "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 11
    .line 12
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " offset "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 35
    .line 36
    array-length v2, v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method private readStringNonAscii()Ljava/lang/String;
    .locals 8

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2
    .line 3
    const/16 v1, 0x7a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 9
    .line 10
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 11
    .line 12
    aget-byte v3, v0, v1

    .line 13
    .line 14
    const/16 v4, -0x10

    .line 15
    .line 16
    if-lt v3, v4, :cond_0

    .line 17
    .line 18
    const/16 v4, 0x2f

    .line 19
    .line 20
    if-gt v3, v4, :cond_0

    .line 21
    .line 22
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v4, 0x30

    .line 30
    .line 31
    if-lt v3, v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x3f

    .line 34
    .line 35
    if-gt v3, v4, :cond_1

    .line 36
    .line 37
    add-int/lit8 v3, v3, -0x38

    .line 38
    .line 39
    shl-int/lit8 v3, v3, 0x8

    .line 40
    .line 41
    add-int/lit8 v4, v1, 0x1

    .line 42
    .line 43
    aget-byte v0, v0, v4

    .line 44
    .line 45
    and-int/lit16 v0, v0, 0xff

    .line 46
    .line 47
    add-int/2addr v3, v0

    .line 48
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x2

    .line 51
    .line 52
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 60
    .line 61
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 62
    .line 63
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 64
    .line 65
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 66
    .line 67
    :goto_1
    move-object v1, v0

    .line 68
    move-object v0, v2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/16 v1, 0x7b

    .line 71
    .line 72
    if-ne v0, v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 79
    .line 80
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 83
    .line 84
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const/16 v1, 0x7c

    .line 88
    .line 89
    if-ne v0, v1, :cond_4

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readUTF16LE()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const/16 v1, 0x7d

    .line 99
    .line 100
    if-ne v0, v1, :cond_6

    .line 101
    .line 102
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readUTF16BE()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    const/16 v1, 0x7e

    .line 113
    .line 114
    if-ne v0, v1, :cond_c

    .line 115
    .line 116
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readGB18030()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    sget-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :goto_2
    const-wide/16 v3, 0x0

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 127
    .line 128
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 129
    .line 130
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 131
    .line 132
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 133
    .line 134
    and-long/2addr v1, v5

    .line 135
    cmp-long v1, v1, v3

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :cond_7
    return-object v0

    .line 144
    :cond_8
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 145
    .line 146
    if-gez v0, :cond_9

    .line 147
    .line 148
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 149
    .line 150
    neg-int v0, v0

    .line 151
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0

    .line 156
    :cond_9
    new-instance v5, Ljava/lang/String;

    .line 157
    .line 158
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 159
    .line 160
    iget v7, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 161
    .line 162
    invoke-direct {v5, v6, v7, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 163
    .line 164
    .line 165
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 166
    .line 167
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 168
    .line 169
    add-int/2addr v0, v1

    .line 170
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 171
    .line 172
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 173
    .line 174
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 175
    .line 176
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 177
    .line 178
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 179
    .line 180
    and-long/2addr v0, v6

    .line 181
    cmp-long v0, v0, v3

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    :cond_a
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 190
    .line 191
    if-nez v0, :cond_b

    .line 192
    .line 193
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 194
    .line 195
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 196
    .line 197
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 198
    .line 199
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 200
    .line 201
    and-long/2addr v0, v6

    .line 202
    cmp-long v0, v0, v3

    .line 203
    .line 204
    if-eqz v0, :cond_b

    .line 205
    .line 206
    return-object v2

    .line 207
    :cond_b
    return-object v5

    .line 208
    :cond_c
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readStringTypeNotMatch()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0
.end method

.method private readStringTypeNotMatch()Ljava/lang/String;
    .locals 7

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2
    .line 3
    const/16 v1, -0x10

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/16 v1, 0x30

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x3f

    .line 21
    .line 22
    if-gt v0, v1, :cond_1

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x38

    .line 25
    .line 26
    shl-int/lit8 v0, v0, 0x8

    .line 27
    .line 28
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 29
    .line 30
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 31
    .line 32
    add-int/lit8 v3, v2, 0x1

    .line 33
    .line 34
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 35
    .line 36
    aget-byte v1, v1, v2

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0xff

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    const/16 v1, 0x40

    .line 47
    .line 48
    if-lt v0, v1, :cond_2

    .line 49
    .line 50
    const/16 v1, 0x47

    .line 51
    .line 52
    if-gt v0, v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 55
    .line 56
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 57
    .line 58
    invoke-static {v1, v2, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_2
    const/16 v1, -0x28

    .line 74
    .line 75
    if-lt v0, v1, :cond_3

    .line 76
    .line 77
    const/16 v1, -0x11

    .line 78
    .line 79
    if-gt v0, v1, :cond_3

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x20

    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :cond_3
    const/16 v1, -0x38

    .line 89
    .line 90
    if-lt v0, v1, :cond_4

    .line 91
    .line 92
    const/16 v1, -0x29

    .line 93
    .line 94
    if-gt v0, v1, :cond_4

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x30

    .line 97
    .line 98
    shl-int/lit8 v0, v0, 0x8

    .line 99
    .line 100
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 101
    .line 102
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 103
    .line 104
    add-int/lit8 v3, v2, 0x1

    .line 105
    .line 106
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 107
    .line 108
    aget-byte v1, v1, v2

    .line 109
    .line 110
    and-int/lit16 v1, v1, 0xff

    .line 111
    .line 112
    add-int/2addr v0, v1

    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :cond_4
    const/16 v1, -0x40

    .line 119
    .line 120
    if-lt v0, v1, :cond_5

    .line 121
    .line 122
    const/16 v1, -0x39

    .line 123
    .line 124
    if-gt v0, v1, :cond_5

    .line 125
    .line 126
    add-int/lit8 v0, v0, 0x3c

    .line 127
    .line 128
    shl-int/lit8 v0, v0, 0x10

    .line 129
    .line 130
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 131
    .line 132
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 133
    .line 134
    add-int/lit8 v3, v2, 0x1

    .line 135
    .line 136
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 137
    .line 138
    aget-byte v4, v1, v2

    .line 139
    .line 140
    and-int/lit16 v4, v4, 0xff

    .line 141
    .line 142
    shl-int/lit8 v4, v4, 0x8

    .line 143
    .line 144
    add-int/2addr v0, v4

    .line 145
    add-int/lit8 v2, v2, 0x2

    .line 146
    .line 147
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 148
    .line 149
    aget-byte v1, v1, v3

    .line 150
    .line 151
    and-int/lit16 v1, v1, 0xff

    .line 152
    .line 153
    add-int/2addr v0, v1

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :cond_5
    const/16 v1, -0x6e

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    if-eq v0, v1, :cond_d

    .line 163
    .line 164
    const/16 v1, -0x51

    .line 165
    .line 166
    if-eq v0, v1, :cond_c

    .line 167
    .line 168
    const/16 v1, 0x48

    .line 169
    .line 170
    if-eq v0, v1, :cond_b

    .line 171
    .line 172
    const/16 v1, -0x42

    .line 173
    .line 174
    if-eq v0, v1, :cond_9

    .line 175
    .line 176
    const/16 v1, -0x41

    .line 177
    .line 178
    if-eq v0, v1, :cond_b

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    packed-switch v0, :pswitch_data_0

    .line 182
    .line 183
    .line 184
    packed-switch v0, :pswitch_data_1

    .line 185
    .line 186
    .line 187
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportString()Lcom/alibaba/fastjson2/JSONException;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    throw v0

    .line 192
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    new-array v2, v0, [B

    .line 197
    .line 198
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 199
    .line 200
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 201
    .line 202
    invoke-static {v3, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    .line 204
    .line 205
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 206
    .line 207
    add-int/2addr v1, v0

    .line 208
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 209
    .line 210
    new-instance v0, Ljava/math/BigInteger;

    .line 211
    .line 212
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0

    .line 220
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-nez v0, :cond_6

    .line 229
    .line 230
    new-instance v0, Ljava/math/BigDecimal;

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_6
    new-instance v2, Ljava/math/BigDecimal;

    .line 237
    .line 238
    invoke-direct {v2, v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 239
    .line 240
    .line 241
    move-object v0, v2

    .line 242
    :goto_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 248
    .line 249
    .line 250
    move-result-wide v0

    .line 251
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    return-object v0

    .line 256
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 257
    .line 258
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 259
    .line 260
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 265
    .line 266
    add-int/lit8 v1, v1, 0x4

    .line 267
    .line 268
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    int-to-float v0, v0

    .line 284
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :pswitch_5
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 290
    .line 291
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 292
    .line 293
    sget-wide v2, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 294
    .line 295
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 296
    .line 297
    int-to-long v4, v4

    .line 298
    add-long/2addr v2, v4

    .line 299
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 304
    .line 305
    add-int/lit8 v2, v2, 0x8

    .line 306
    .line 307
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 308
    .line 309
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 310
    .line 311
    if-eqz v2, :cond_7

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 315
    .line 316
    .line 317
    move-result-wide v0

    .line 318
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 319
    .line 320
    .line 321
    move-result-wide v0

    .line 322
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 328
    .line 329
    .line 330
    move-result-wide v0

    .line 331
    long-to-double v0, v0

    .line 332
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    return-object v0

    .line 337
    :pswitch_7
    const-string v0, "1.0"

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_8
    const-string v0, "0.0"

    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_9
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 344
    .line 345
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 346
    .line 347
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    int-to-long v2, v0

    .line 352
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 353
    .line 354
    add-int/lit8 v0, v0, 0x4

    .line 355
    .line 356
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 357
    .line 358
    const-wide/32 v4, 0xea60

    .line 359
    .line 360
    .line 361
    mul-long/2addr v2, v4

    .line 362
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 363
    .line 364
    invoke-static {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->toString(JZLjava/time/ZoneId;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :pswitch_a
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 370
    .line 371
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 372
    .line 373
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    int-to-long v2, v0

    .line 378
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 379
    .line 380
    add-int/lit8 v0, v0, 0x4

    .line 381
    .line 382
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 383
    .line 384
    const-wide/16 v4, 0x3e8

    .line 385
    .line 386
    mul-long/2addr v2, v4

    .line 387
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 388
    .line 389
    invoke-static {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->toString(JZLjava/time/ZoneId;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    return-object v0

    .line 394
    :pswitch_b
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 395
    .line 396
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 397
    .line 398
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 399
    .line 400
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 401
    .line 402
    int-to-long v5, v5

    .line 403
    add-long/2addr v3, v5

    .line 404
    invoke-virtual {v0, v2, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v2

    .line 408
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 409
    .line 410
    add-int/lit8 v0, v0, 0x8

    .line 411
    .line 412
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 413
    .line 414
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 415
    .line 416
    if-eqz v0, :cond_8

    .line 417
    .line 418
    goto :goto_2

    .line 419
    :cond_8
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 420
    .line 421
    .line 422
    move-result-wide v2

    .line 423
    :goto_2
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 424
    .line 425
    invoke-static {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->toString(JZLjava/time/ZoneId;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    return-object v0

    .line 430
    :cond_9
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 431
    .line 432
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 433
    .line 434
    sget-wide v2, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 435
    .line 436
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 437
    .line 438
    int-to-long v4, v4

    .line 439
    add-long/2addr v2, v4

    .line 440
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 441
    .line 442
    .line 443
    move-result-wide v0

    .line 444
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 445
    .line 446
    if-nez v2, :cond_a

    .line 447
    .line 448
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    :cond_a
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 453
    .line 454
    add-int/lit8 v2, v2, 0x8

    .line 455
    .line 456
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 457
    .line 458
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    return-object v0

    .line 463
    :cond_b
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 464
    .line 465
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 466
    .line 467
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    int-to-long v0, v0

    .line 472
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 473
    .line 474
    add-int/lit8 v2, v2, 0x4

    .line 475
    .line 476
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 477
    .line 478
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    return-object v0

    .line 483
    :cond_c
    return-object v2

    .line 484
    :cond_d
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 485
    .line 486
    add-int/lit8 v0, v0, -0x1

    .line 487
    .line 488
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 489
    .line 490
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    if-nez v0, :cond_e

    .line 495
    .line 496
    return-object v2

    .line 497
    :cond_e
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteThrowableClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 498
    .line 499
    filled-new-array {v1}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    return-object v0

    .line 508
    nop

    .line 509
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch -0x4e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private readStringUTF8()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x10

    .line 8
    .line 9
    if-lt v2, v3, :cond_0

    .line 10
    .line 11
    const/16 v3, 0x2f

    .line 12
    .line 13
    if-gt v2, v3, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v3, 0x30

    .line 23
    .line 24
    if-lt v2, v3, :cond_1

    .line 25
    .line 26
    const/16 v3, 0x3f

    .line 27
    .line 28
    if-gt v2, v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v1, 0x1

    .line 31
    .line 32
    add-int/lit8 v2, v2, -0x38

    .line 33
    .line 34
    shl-int/lit8 v2, v2, 0x8

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    add-int/2addr v2, v0

    .line 45
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 53
    .line 54
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    return-object v0
.end method

.method private readTimestampWithTimeZone()Ljava/time/ZonedDateTime;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    shl-int/lit8 v3, v3, 0x8

    .line 12
    .line 13
    add-int/lit8 v4, v1, 0x2

    .line 14
    .line 15
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    aget-byte v2, v0, v2

    .line 18
    .line 19
    and-int/lit16 v2, v2, 0xff

    .line 20
    .line 21
    add-int v5, v3, v2

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x3

    .line 24
    .line 25
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 26
    .line 27
    aget-byte v6, v0, v4

    .line 28
    .line 29
    add-int/lit8 v3, v1, 0x4

    .line 30
    .line 31
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    aget-byte v7, v0, v2

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x5

    .line 36
    .line 37
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 38
    .line 39
    aget-byte v8, v0, v3

    .line 40
    .line 41
    add-int/lit8 v3, v1, 0x6

    .line 42
    .line 43
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 44
    .line 45
    aget-byte v9, v0, v2

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x7

    .line 48
    .line 49
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 50
    .line 51
    aget-byte v10, v0, v3

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    sget-object v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->SHANGHAI_ZONE_ID_NAME_BYTES:[B

    .line 58
    .line 59
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    array-length v3, v1

    .line 62
    add-int/2addr v2, v3

    .line 63
    array-length v3, v0

    .line 64
    if-ge v2, v3, :cond_2

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    :goto_0
    array-length v3, v1

    .line 68
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    if-ge v2, v3, :cond_1

    .line 71
    .line 72
    add-int/2addr v4, v2

    .line 73
    aget-byte v3, v0, v4

    .line 74
    .line 75
    aget-byte v4, v1, v2

    .line 76
    .line 77
    if-eq v3, v4, :cond_0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    array-length v0, v1

    .line 84
    add-int/2addr v4, v0

    .line 85
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    .line 87
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 95
    .line 96
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :goto_2
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
.end method

.method private readUTF16BE()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method private readUTF16LE()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x10

    .line 8
    .line 9
    if-lt v2, v3, :cond_0

    .line 10
    .line 11
    const/16 v3, 0x2f

    .line 12
    .line 13
    if-gt v2, v3, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v3, 0x30

    .line 23
    .line 24
    if-lt v2, v3, :cond_1

    .line 25
    .line 26
    const/16 v3, 0x3f

    .line 27
    .line 28
    if-gt v2, v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v1, 0x1

    .line 31
    .line 32
    add-int/lit8 v2, v2, -0x38

    .line 33
    .line 34
    shl-int/lit8 v2, v2, 0x8

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    add-int/2addr v2, v0

    .line 45
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 53
    .line 54
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 57
    .line 58
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    const-string v0, ""

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    return-object v0
.end method

.method private readZonedDateTime0(I)Ljava/time/ZonedDateTime;
    .locals 11

    .line 1
    const/16 v0, -0x58

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, -0x57

    .line 6
    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, -0x42

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x49

    .line 17
    .line 18
    if-lt p1, v0, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x78

    .line 21
    .line 22
    if-gt p1, v1, :cond_0

    .line 23
    .line 24
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    sub-int/2addr p1, v0

    .line 31
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    int-to-byte p1, p1

    .line 37
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "type not support : "

    .line 42
    .line 43
    invoke-static {p1, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :pswitch_0
    const/4 p1, 0x0

    .line 49
    return-object p1

    .line 50
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-long v2, p1

    .line 59
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 64
    .line 65
    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 71
    .line 72
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    int-to-long v0, p1

    .line 79
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x4

    .line 82
    .line 83
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 84
    .line 85
    const-wide/16 v2, 0x3c

    .line 86
    .line 87
    mul-long/2addr v0, v2

    .line 88
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 93
    .line 94
    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 100
    .line 101
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 102
    .line 103
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    int-to-long v0, p1

    .line 108
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    add-int/lit8 p1, p1, 0x4

    .line 111
    .line 112
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 113
    .line 114
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 119
    .line 120
    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :cond_1
    :pswitch_4
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 126
    .line 127
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 128
    .line 129
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 130
    .line 131
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 132
    .line 133
    int-to-long v3, v3

    .line 134
    add-long/2addr v1, v3

    .line 135
    invoke-virtual {p1, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 140
    .line 141
    add-int/lit8 p1, p1, 0x8

    .line 142
    .line 143
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 144
    .line 145
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 146
    .line 147
    if-eqz p1, :cond_2

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    :goto_0
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 159
    .line 160
    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 166
    .line 167
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 168
    .line 169
    add-int/lit8 v1, v0, 0x1

    .line 170
    .line 171
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 172
    .line 173
    aget-byte v2, p1, v0

    .line 174
    .line 175
    shl-int/lit8 v2, v2, 0x8

    .line 176
    .line 177
    add-int/lit8 v3, v0, 0x2

    .line 178
    .line 179
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 180
    .line 181
    aget-byte v1, p1, v1

    .line 182
    .line 183
    and-int/lit16 v1, v1, 0xff

    .line 184
    .line 185
    add-int/2addr v2, v1

    .line 186
    add-int/lit8 v1, v0, 0x3

    .line 187
    .line 188
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 189
    .line 190
    aget-byte v3, p1, v3

    .line 191
    .line 192
    add-int/lit8 v0, v0, 0x4

    .line 193
    .line 194
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 195
    .line 196
    aget-byte p1, p1, v1

    .line 197
    .line 198
    invoke-static {v2, v3, p1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 203
    .line 204
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 205
    .line 206
    invoke-static {p1, v0, v1}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    return-object p1

    .line 211
    :cond_4
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 212
    .line 213
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 214
    .line 215
    add-int/lit8 v1, v0, 0x1

    .line 216
    .line 217
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 218
    .line 219
    aget-byte v2, p1, v0

    .line 220
    .line 221
    shl-int/lit8 v2, v2, 0x8

    .line 222
    .line 223
    add-int/lit8 v3, v0, 0x2

    .line 224
    .line 225
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 226
    .line 227
    aget-byte v1, p1, v1

    .line 228
    .line 229
    and-int/lit16 v1, v1, 0xff

    .line 230
    .line 231
    add-int v4, v2, v1

    .line 232
    .line 233
    add-int/lit8 v1, v0, 0x3

    .line 234
    .line 235
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 236
    .line 237
    aget-byte v5, p1, v3

    .line 238
    .line 239
    add-int/lit8 v2, v0, 0x4

    .line 240
    .line 241
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 242
    .line 243
    aget-byte v6, p1, v1

    .line 244
    .line 245
    add-int/lit8 v1, v0, 0x5

    .line 246
    .line 247
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 248
    .line 249
    aget-byte v7, p1, v2

    .line 250
    .line 251
    add-int/lit8 v2, v0, 0x6

    .line 252
    .line 253
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 254
    .line 255
    aget-byte v8, p1, v1

    .line 256
    .line 257
    add-int/lit8 v0, v0, 0x7

    .line 258
    .line 259
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 260
    .line 261
    aget-byte v9, p1, v2

    .line 262
    .line 263
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-static/range {v4 .. v10}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 272
    .line 273
    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    return-object p1

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static typeRefNotFound(I)Lcom/alibaba/fastjson2/JSONException;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "type ref not found : "

    .line 4
    .line 5
    invoke-static {p0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method


# virtual methods
.method public final autoTypeError()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "auotype not support : "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x6e

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v0, v2, :cond_7

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 21
    .line 22
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 23
    .line 24
    cmp-long p2, p2, v5

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-interface {p2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    if-eqz p3, :cond_0

    .line 37
    .line 38
    if-ne p3, p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, v5, v6, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerIfAbsent(JLcom/alibaba/fastjson2/reader/ObjectReader;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 45
    .line 46
    iget-object v4, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 47
    .line 48
    move-object v7, p1

    .line 49
    move-wide v8, p4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {v4, p1, v7, v8, v9}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :cond_1
    if-eqz p1, :cond_2

    .line 67
    .line 68
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 78
    .line 79
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 80
    .line 81
    or-long/2addr p1, v8

    .line 82
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 83
    .line 84
    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 85
    .line 86
    and-long/2addr p3, p1

    .line 87
    const-wide/16 v8, 0x0

    .line 88
    .line 89
    cmp-long p3, p3, v8

    .line 90
    .line 91
    if-nez p3, :cond_4

    .line 92
    .line 93
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 94
    .line 95
    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 96
    .line 97
    and-long/2addr p3, p1

    .line 98
    cmp-long p3, p3, v8

    .line 99
    .line 100
    if-nez p3, :cond_3

    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->autoTypeError()V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    if-eqz p3, :cond_5

    .line 111
    .line 112
    invoke-interface {p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    if-eqz p4, :cond_5

    .line 117
    .line 118
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 119
    .line 120
    .line 121
    move-result-object p5

    .line 122
    if-eqz p5, :cond_5

    .line 123
    .line 124
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eq p5, v0, :cond_5

    .line 133
    .line 134
    invoke-direct {p0, p3, p4, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getObjectReaderContext(Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/Class;Ljava/lang/ClassLoader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    :cond_5
    if-nez p3, :cond_6

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-virtual {v1, p3, v7, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    if-nez p3, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->autoTypeError()V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 154
    .line 155
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 156
    .line 157
    aget-byte p1, p1, p2

    .line 158
    .line 159
    iput-byte p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 160
    .line 161
    return-object p3

    .line 162
    :cond_7
    return-object v3
.end method

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->valueBytes:[B

    .line 2
    .line 3
    const/high16 v1, 0x100000

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 13
    .line 14
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    if-ge v2, v1, :cond_1

    .line 23
    .line 24
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public error(B)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isString()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, p1, -0x1

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/16 v2, 0x20

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_0
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 42
    .line 43
    :cond_1
    const-string p1, ", offset "

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x2f

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 59
    .line 60
    array-length p1, p1

    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public getFieldName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getLatin1String(II)Ljava/lang/String;
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

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
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

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
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

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
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

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

.method public final getNameHashCode()J
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-wide v5, v1

    .line 7
    move v4, v3

    .line 8
    :goto_0
    iget v7, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 9
    .line 10
    if-ge v4, v7, :cond_2

    .line 11
    .line 12
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 13
    .line 14
    aget-byte v8, v7, v0

    .line 15
    .line 16
    if-ltz v8, :cond_1

    .line 17
    .line 18
    const/16 v9, 0x8

    .line 19
    .line 20
    if-ge v4, v9, :cond_1

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget v9, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 25
    .line 26
    aget-byte v7, v7, v9

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_0
    packed-switch v4, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :pswitch_0
    int-to-long v7, v8

    .line 36
    const/16 v9, 0x38

    .line 37
    .line 38
    shl-long/2addr v7, v9

    .line 39
    const-wide v9, 0xffffffffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :goto_1
    and-long/2addr v5, v9

    .line 45
    add-long/2addr v5, v7

    .line 46
    goto :goto_2

    .line 47
    :pswitch_1
    int-to-long v7, v8

    .line 48
    const/16 v9, 0x30

    .line 49
    .line 50
    shl-long/2addr v7, v9

    .line 51
    const-wide v9, 0xffffffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_2
    int-to-long v7, v8

    .line 58
    const/16 v9, 0x28

    .line 59
    .line 60
    shl-long/2addr v7, v9

    .line 61
    const-wide v9, 0xffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :pswitch_3
    int-to-long v7, v8

    .line 68
    const/16 v9, 0x20

    .line 69
    .line 70
    shl-long/2addr v7, v9

    .line 71
    const-wide v9, 0xffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_4
    shl-int/lit8 v7, v8, 0x18

    .line 78
    .line 79
    int-to-long v7, v7

    .line 80
    const-wide/32 v9, 0xffffff

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_5
    shl-int/lit8 v7, v8, 0x10

    .line 85
    .line 86
    int-to-long v7, v7

    .line 87
    const-wide/32 v9, 0xffff

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_6
    shl-int/lit8 v7, v8, 0x8

    .line 92
    .line 93
    int-to-long v7, v7

    .line 94
    const-wide/16 v9, 0xff

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_7
    int-to-long v5, v8

    .line 98
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    :goto_3
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 104
    .line 105
    move-wide v5, v1

    .line 106
    :cond_2
    cmp-long v1, v5, v1

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    return-wide v5

    .line 111
    :cond_3
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    :goto_4
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 117
    .line 118
    if-ge v3, v4, :cond_4

    .line 119
    .line 120
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 121
    .line 122
    add-int/lit8 v5, v0, 0x1

    .line 123
    .line 124
    aget-byte v0, v4, v0

    .line 125
    .line 126
    int-to-long v6, v0

    .line 127
    xor-long v0, v1, v6

    .line 128
    .line 129
    const-wide v6, 0x100000001b3L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    mul-long v1, v0, v6

    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    move v0, v5

    .line 139
    goto :goto_4

    .line 140
    :cond_4
    return-wide v1

    .line 141
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

.method public getNameHashCodeLCase()J
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-wide v5, v1

    .line 7
    move v4, v3

    .line 8
    :goto_0
    iget v7, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 9
    .line 10
    const/16 v8, 0x5a

    .line 11
    .line 12
    const/16 v9, 0x41

    .line 13
    .line 14
    const/16 v10, 0x2d

    .line 15
    .line 16
    const/16 v11, 0x5f

    .line 17
    .line 18
    const/16 v12, 0x20

    .line 19
    .line 20
    if-ge v4, v7, :cond_5

    .line 21
    .line 22
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 23
    .line 24
    aget-byte v13, v7, v0

    .line 25
    .line 26
    if-ltz v13, :cond_4

    .line 27
    .line 28
    const/16 v14, 0x8

    .line 29
    .line 30
    if-ge v4, v14, :cond_4

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    iget v14, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 35
    .line 36
    aget-byte v14, v7, v14

    .line 37
    .line 38
    if-nez v14, :cond_0

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_0
    if-eq v13, v11, :cond_1

    .line 42
    .line 43
    if-eq v13, v10, :cond_1

    .line 44
    .line 45
    if-ne v13, v12, :cond_2

    .line 46
    .line 47
    :cond_1
    add-int/lit8 v10, v0, 0x1

    .line 48
    .line 49
    aget-byte v7, v7, v10

    .line 50
    .line 51
    if-eq v7, v13, :cond_2

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    if-lt v13, v9, :cond_3

    .line 55
    .line 56
    if-gt v13, v8, :cond_3

    .line 57
    .line 58
    add-int/lit8 v13, v13, 0x20

    .line 59
    .line 60
    int-to-byte v13, v13

    .line 61
    :cond_3
    packed-switch v4, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :pswitch_0
    int-to-long v7, v13

    .line 66
    const/16 v9, 0x38

    .line 67
    .line 68
    shl-long/2addr v7, v9

    .line 69
    const-wide v9, 0xffffffffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    :goto_1
    and-long/2addr v5, v9

    .line 75
    add-long/2addr v5, v7

    .line 76
    goto :goto_2

    .line 77
    :pswitch_1
    int-to-long v7, v13

    .line 78
    const/16 v9, 0x30

    .line 79
    .line 80
    shl-long/2addr v7, v9

    .line 81
    const-wide v9, 0xffffffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_2
    int-to-long v7, v13

    .line 88
    const/16 v9, 0x28

    .line 89
    .line 90
    shl-long/2addr v7, v9

    .line 91
    const-wide v9, 0xffffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_3
    int-to-long v7, v13

    .line 98
    shl-long/2addr v7, v12

    .line 99
    const-wide v9, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    shl-int/lit8 v7, v13, 0x18

    .line 106
    .line 107
    int-to-long v7, v7

    .line 108
    const-wide/32 v9, 0xffffff

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_5
    shl-int/lit8 v7, v13, 0x10

    .line 113
    .line 114
    int-to-long v7, v7

    .line 115
    const-wide/32 v9, 0xffff

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_6
    shl-int/lit8 v7, v13, 0x8

    .line 120
    .line 121
    int-to-long v7, v7

    .line 122
    const-wide/16 v9, 0xff

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_7
    int-to-long v5, v13

    .line 126
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    :goto_4
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 132
    .line 133
    move-wide v5, v1

    .line 134
    :cond_5
    cmp-long v1, v5, v1

    .line 135
    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    return-wide v5

    .line 139
    :cond_6
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :goto_5
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 145
    .line 146
    if-ge v3, v4, :cond_a

    .line 147
    .line 148
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 149
    .line 150
    add-int/lit8 v5, v0, 0x1

    .line 151
    .line 152
    aget-byte v0, v4, v0

    .line 153
    .line 154
    if-lt v0, v9, :cond_7

    .line 155
    .line 156
    if-gt v0, v8, :cond_7

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x20

    .line 159
    .line 160
    int-to-byte v0, v0

    .line 161
    :cond_7
    if-eq v0, v11, :cond_9

    .line 162
    .line 163
    if-eq v0, v10, :cond_9

    .line 164
    .line 165
    if-ne v0, v12, :cond_8

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_8
    int-to-long v6, v0

    .line 169
    xor-long v0, v1, v6

    .line 170
    .line 171
    const-wide v6, 0x100000001b3L

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    mul-long/2addr v0, v6

    .line 177
    move-wide v1, v0

    .line 178
    :cond_9
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 179
    .line 180
    move v0, v5

    .line 181
    goto :goto_5

    .line 182
    :cond_a
    return-wide v1

    .line 183
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

.method public getRawInt()I
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 14
    .line 15
    int-to-long v5, v0

    .line 16
    add-long/2addr v3, v5

    .line 17
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public getRawLong()J
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 14
    .line 15
    int-to-long v5, v0

    .line 16
    add-long/2addr v3, v5

    .line 17
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0

    .line 22
    :cond_0
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    return-wide v0
.end method

.method public getString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2
    .line 3
    const/16 v1, -0x51

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 10
    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 14
    .line 15
    neg-int v1, v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    const/16 v3, 0x79

    .line 22
    .line 23
    if-eq v0, v3, :cond_7

    .line 24
    .line 25
    const/16 v3, 0x49

    .line 26
    .line 27
    if-lt v0, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x78

    .line 30
    .line 31
    if-gt v0, v3, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/16 v2, 0x7a

    .line 35
    .line 36
    if-ne v0, v2, :cond_3

    .line 37
    .line 38
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    const/16 v2, 0x7b

    .line 42
    .line 43
    if-ne v0, v2, :cond_4

    .line 44
    .line 45
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    const/16 v2, 0x7c

    .line 49
    .line 50
    if-ne v0, v2, :cond_5

    .line 51
    .line 52
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    const/16 v2, 0x7d

    .line 56
    .line 57
    if-ne v0, v2, :cond_6

    .line 58
    .line 59
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    throw v0

    .line 67
    :cond_7
    :goto_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 68
    .line 69
    sget v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 70
    .line 71
    const/16 v4, 0x22

    .line 72
    .line 73
    if-ge v3, v4, :cond_c

    .line 74
    .line 75
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 76
    .line 77
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 82
    .line 83
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 84
    .line 85
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, [C

    .line 90
    .line 91
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 92
    .line 93
    :cond_8
    if-eqz v1, :cond_9

    .line 94
    .line 95
    array-length v2, v1

    .line 96
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 97
    .line 98
    if-ge v2, v3, :cond_a

    .line 99
    .line 100
    :cond_9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 101
    .line 102
    new-array v1, v1, [C

    .line 103
    .line 104
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 105
    .line 106
    :cond_a
    const/4 v2, 0x0

    .line 107
    move v3, v2

    .line 108
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 109
    .line 110
    if-ge v3, v4, :cond_b

    .line 111
    .line 112
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 113
    .line 114
    add-int v5, v0, v3

    .line 115
    .line 116
    aget-byte v4, v4, v5

    .line 117
    .line 118
    and-int/lit16 v4, v4, 0xff

    .line 119
    .line 120
    int-to-char v4, v4

    .line 121
    aput-char v4, v1, v3

    .line 122
    .line 123
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_b
    new-instance v0, Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {v0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_c
    :goto_2
    new-instance v2, Ljava/lang/String;

    .line 133
    .line 134
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 135
    .line 136
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 137
    .line 138
    invoke-direct {v2, v3, v4, v1, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 139
    .line 140
    .line 141
    return-object v2
.end method

.method public final getStringLength()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    iput-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 8
    .line 9
    const/16 v1, 0x49

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v2, 0x78

    .line 14
    .line 15
    if-ge v0, v2, :cond_0

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    return v0

    .line 19
    :cond_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lj8/o;->w(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public getType()B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public isArray()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    return v3

    .line 10
    :cond_0
    aget-byte v0, v1, v0

    .line 11
    .line 12
    const/16 v1, -0x6c

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    const/16 v1, -0x5c

    .line 17
    .line 18
    if-gt v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_1
    return v3
.end method

.method public isBinary()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x6f

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isDate()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x59

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, -0x52

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public isEnd()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

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

.method public isInt()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x46

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x48

    .line 12
    .line 13
    if-le v0, v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v1, -0x54

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const/16 v1, -0x53

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/16 v1, -0x55

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method public isNull()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x51

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isNumber()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x4e

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x48

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public isObject()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    const/16 v1, -0x5a

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public isReference()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v0, v2, :cond_0

    .line 7
    .line 8
    aget-byte v0, v1, v0

    .line 9
    .line 10
    const/16 v1, -0x6d

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public isString()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v0, v2, :cond_0

    .line 7
    .line 8
    aget-byte v0, v1, v0

    .line 9
    .line 10
    iput-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 11
    .line 12
    const/16 v1, 0x49

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method public mark()Lcom/alibaba/fastjson2/JSONReader$SavePoint;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$SavePoint;

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader$SavePoint;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public next()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    return-void
.end method

.method public nextIfArrayEnd()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public nextIfArrayStart()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public nextIfComma()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public nextIfInfinity()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfMatch(B)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    add-int/2addr v1, p1

    .line 11
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public nextIfMatch(C)Z
    .locals 1

    .line 16
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "UnsupportedOperation"

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public nextIfMatchIdent(CCC)Z
    .locals 0

    .line 1
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p2, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public nextIfMatchIdent(CCCC)Z
    .locals 0

    .line 9
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "UnsupportedOperation"

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public nextIfMatchIdent(CCCCC)Z
    .locals 0

    .line 10
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "UnsupportedOperation"

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public nextIfMatchIdent(CCCCCC)Z
    .locals 0

    .line 11
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "UnsupportedOperation"

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public nextIfMatchTypedAny()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x6e

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr v1, v0

    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public nextIfName4Match10(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0xb

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x7

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const-wide v4, 0xffffffffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v2, v4

    .line 30
    cmp-long p1, v2, p1

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public nextIfName4Match11(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0xc

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x8

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    cmp-long p1, v2, p1

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public nextIfName4Match12(JB)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xd

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long/2addr v4, v6

    .line 17
    const-wide/16 v6, 0x9

    .line 18
    .line 19
    sub-long/2addr v4, v6

    .line 20
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    cmp-long p1, v3, p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0xc

    .line 29
    .line 30
    aget-byte p1, v0, v1

    .line 31
    .line 32
    if-eq p1, p3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public nextIfName4Match13(JI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xe

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0xf

    .line 8
    .line 9
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 10
    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 16
    .line 17
    int-to-long v5, v2

    .line 18
    add-long v7, v3, v5

    .line 19
    .line 20
    const-wide/16 v9, 0xa

    .line 21
    .line 22
    sub-long/2addr v7, v9

    .line 23
    invoke-virtual {v1, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    cmp-long p1, v7, p1

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    add-long/2addr v3, v5

    .line 32
    const-wide/16 p1, 0x2

    .line 33
    .line 34
    sub-long/2addr v3, p1

    .line 35
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eq p1, p3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public nextIfName4Match14(JI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0xf

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0xb

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v3, v5

    .line 30
    const-wide/16 p1, 0x3

    .line 31
    .line 32
    sub-long/2addr v3, p1

    .line 33
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const p2, 0xffffff

    .line 38
    .line 39
    .line 40
    and-int/2addr p1, p2

    .line 41
    if-eq p1, p3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    return p1

    .line 48
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 49
    return p1
.end method

.method public nextIfName4Match15(JI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x10

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0xc

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v3, v5

    .line 30
    const-wide/16 p1, 0x4

    .line 31
    .line 32
    sub-long/2addr v3, p1

    .line 33
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eq p1, p3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public nextIfName4Match16(JIB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x11

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0xd

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v4, v6

    .line 30
    const-wide/16 p1, 0x5

    .line 31
    .line 32
    sub-long/2addr v4, p1

    .line 33
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, p3, :cond_1

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x10

    .line 40
    .line 41
    aget-byte p1, v0, v1

    .line 42
    .line 43
    move/from16 p2, p4

    .line 44
    .line 45
    if-eq p1, p2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public nextIfName4Match17(JJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x12

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x13

    .line 8
    .line 9
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 10
    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 16
    .line 17
    int-to-long v5, v2

    .line 18
    add-long v7, v3, v5

    .line 19
    .line 20
    const-wide/16 v9, 0xe

    .line 21
    .line 22
    sub-long/2addr v7, v9

    .line 23
    invoke-virtual {v1, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    cmp-long p1, v7, p1

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    add-long/2addr v3, v5

    .line 32
    const-wide/16 p1, 0x6

    .line 33
    .line 34
    sub-long/2addr v3, p1

    .line 35
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    const-wide v0, 0xffffffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr p1, v0

    .line 45
    cmp-long p1, p1, p3

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public nextIfName4Match18(JJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x13

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0xf

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v3, v5

    .line 30
    const-wide/16 p1, 0x7

    .line 31
    .line 32
    sub-long/2addr v3, p1

    .line 33
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    const-wide v2, 0xffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr p1, v2

    .line 43
    cmp-long p1, p1, p3

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public nextIfName4Match19(JJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x14

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x10

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v3, v5

    .line 30
    const-wide/16 p1, 0x8

    .line 31
    .line 32
    sub-long/2addr v3, p1

    .line 33
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    cmp-long p1, p1, p3

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public nextIfName4Match2()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfName4Match20(JJB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x15

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x11

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long/2addr v4, v6

    .line 30
    const-wide/16 p1, 0x9

    .line 31
    .line 32
    sub-long/2addr v4, p1

    .line 33
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    cmp-long p1, p1, p3

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x14

    .line 42
    .line 43
    aget-byte p1, v0, v1

    .line 44
    .line 45
    move/from16 p2, p5

    .line 46
    .line 47
    if-eq p1, p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public nextIfName4Match21(JJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x16

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x12

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0xa

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x2

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    move/from16 p2, p5

    .line 51
    .line 52
    if-eq p1, p2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public nextIfName4Match22(JJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x17

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x13

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0xb

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x3

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const p2, 0xffffff

    .line 51
    .line 52
    .line 53
    and-int/2addr p1, p2

    .line 54
    move/from16 p2, p5

    .line 55
    .line 56
    if-eq p1, p2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 64
    return p1
.end method

.method public nextIfName4Match23(JJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x18

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x14

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0xc

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x4

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    move/from16 p2, p5

    .line 51
    .line 52
    if-eq p1, p2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public nextIfName4Match24(JJIB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x19

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x15

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v4, v6

    .line 30
    .line 31
    const-wide/16 v8, 0xd

    .line 32
    .line 33
    sub-long/2addr p1, v8

    .line 34
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v4, v6

    .line 43
    const-wide/16 p1, 0x5

    .line 44
    .line 45
    sub-long/2addr v4, p1

    .line 46
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    move/from16 p2, p5

    .line 51
    .line 52
    if-ne p1, p2, :cond_1

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x18

    .line 55
    .line 56
    aget-byte p1, v0, v1

    .line 57
    .line 58
    move/from16 p2, p6

    .line 59
    .line 60
    if-eq p1, p2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    return p1

    .line 67
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 68
    return p1
.end method

.method public nextIfName4Match25(JJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1a

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x16

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0xe

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x6

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    const-wide p3, 0xffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr p1, p3

    .line 56
    cmp-long p1, p1, p5

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method public nextIfName4Match26(JJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1b

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x17

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0xf

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x7

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    const-wide p3, 0xffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr p1, p3

    .line 56
    cmp-long p1, p1, p5

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method public nextIfName4Match27(JJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1c

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x18

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x10

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v3, v5

    .line 43
    const-wide/16 p1, 0x8

    .line 44
    .line 45
    sub-long/2addr v3, p1

    .line 46
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    cmp-long p1, p1, p5

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public nextIfName4Match28(JJJB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1d

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x19

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v4, v6

    .line 30
    .line 31
    const-wide/16 v8, 0x11

    .line 32
    .line 33
    sub-long/2addr p1, v8

    .line 34
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long/2addr v4, v6

    .line 43
    const-wide/16 p1, 0x9

    .line 44
    .line 45
    sub-long/2addr v4, p1

    .line 46
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    cmp-long p1, p1, p5

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1c

    .line 55
    .line 56
    aget-byte p1, v0, v1

    .line 57
    .line 58
    move/from16 p2, p7

    .line 59
    .line 60
    if-eq p1, p2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    return p1

    .line 67
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 68
    return p1
.end method

.method public nextIfName4Match29(JJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1e

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x1a

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x12

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0xa

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x2

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    move/from16 p2, p7

    .line 64
    .line 65
    if-eq p1, p2, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    return p1

    .line 72
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 73
    return p1
.end method

.method public nextIfName4Match3()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0
.end method

.method public nextIfName4Match30(JJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1f

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x1b

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x13

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0xb

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x3

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const p2, 0xffffff

    .line 64
    .line 65
    .line 66
    and-int/2addr p1, p2

    .line 67
    move/from16 p2, p7

    .line 68
    .line 69
    if-eq p1, p2, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 77
    return p1
.end method

.method public nextIfName4Match31(JJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x20

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x1c

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x14

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0xc

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x4

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    move/from16 p2, p7

    .line 64
    .line 65
    if-eq p1, p2, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    return p1

    .line 72
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 73
    return p1
.end method

.method public nextIfName4Match32(JJJIB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x21

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x1d

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v4, v6

    .line 30
    .line 31
    const-wide/16 v8, 0x15

    .line 32
    .line 33
    sub-long/2addr p1, v8

    .line 34
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v4, v6

    .line 43
    .line 44
    const-wide/16 v8, 0xd

    .line 45
    .line 46
    sub-long/2addr p1, v8

    .line 47
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v4, v6

    .line 56
    const-wide/16 p1, 0x5

    .line 57
    .line 58
    sub-long/2addr v4, p1

    .line 59
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    move/from16 p2, p7

    .line 64
    .line 65
    if-ne p1, p2, :cond_1

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x20

    .line 68
    .line 69
    aget-byte p1, v0, v1

    .line 70
    .line 71
    move/from16 p2, p8

    .line 72
    .line 73
    if-eq p1, p2, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 81
    return p1
.end method

.method public nextIfName4Match33(JJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x22

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x1e

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x16

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0xe

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x6

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    const-wide p3, 0xffffffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr p1, p3

    .line 69
    cmp-long p1, p1, p7

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 79
    return p1
.end method

.method public nextIfName4Match34(JJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x23

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x1f

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x17

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0xf

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x7

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    const-wide p3, 0xffffffffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr p1, p3

    .line 69
    cmp-long p1, p1, p7

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 79
    return p1
.end method

.method public nextIfName4Match35(JJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x24

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x20

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x18

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x10

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    const-wide/16 p1, 0x8

    .line 57
    .line 58
    sub-long/2addr v3, p1

    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    cmp-long p1, p1, p7

    .line 64
    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    return p1

    .line 72
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 73
    return p1
.end method

.method public nextIfName4Match36(JJJJB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x25

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x21

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v4, v6

    .line 30
    .line 31
    const-wide/16 v8, 0x19

    .line 32
    .line 33
    sub-long/2addr p1, v8

    .line 34
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v4, v6

    .line 43
    .line 44
    const-wide/16 v8, 0x11

    .line 45
    .line 46
    sub-long/2addr p1, v8

    .line 47
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long/2addr v4, v6

    .line 56
    const-wide/16 p1, 0x9

    .line 57
    .line 58
    sub-long/2addr v4, p1

    .line 59
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    cmp-long p1, p1, p7

    .line 64
    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x24

    .line 68
    .line 69
    aget-byte p1, v0, v1

    .line 70
    .line 71
    move/from16 p2, p9

    .line 72
    .line 73
    if-eq p1, p2, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 81
    return p1
.end method

.method public nextIfName4Match37(JJJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x26

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x22

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x1a

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x12

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0xa

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x2

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    move/from16 p2, p9

    .line 77
    .line 78
    if-eq p1, p2, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 86
    return p1
.end method

.method public nextIfName4Match38(JJJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x27

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x23

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x1b

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x13

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0xb

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x3

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const p2, 0xffffff

    .line 77
    .line 78
    .line 79
    and-int/2addr p1, p2

    .line 80
    move/from16 p2, p9

    .line 81
    .line 82
    if-eq p1, p2, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    return p1

    .line 89
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 90
    return p1
.end method

.method public nextIfName4Match39(JJJJI)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x28

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x24

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x1c

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x14

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0xc

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x4

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    move/from16 p2, p9

    .line 77
    .line 78
    if-eq p1, p2, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 86
    return p1
.end method

.method public nextIfName4Match4(B)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x5

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-gt v2, v3, :cond_1

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x4

    .line 12
    .line 13
    aget-byte v0, v0, v1

    .line 14
    .line 15
    if-eq v0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public nextIfName4Match40(JJJJIB)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x29

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v6, v2

    .line 16
    add-long v8, v4, v6

    .line 17
    .line 18
    const-wide/16 v10, 0x25

    .line 19
    .line 20
    sub-long/2addr v8, v10

    .line 21
    invoke-virtual {v3, v0, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    cmp-long p1, v8, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v4, v6

    .line 30
    .line 31
    const-wide/16 v8, 0x1d

    .line 32
    .line 33
    sub-long/2addr p1, v8

    .line 34
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v4, v6

    .line 43
    .line 44
    const-wide/16 v8, 0x15

    .line 45
    .line 46
    sub-long/2addr p1, v8

    .line 47
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v4, v6

    .line 56
    .line 57
    const-wide/16 v8, 0xd

    .line 58
    .line 59
    sub-long/2addr p1, v8

    .line 60
    invoke-virtual {v3, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v4, v6

    .line 69
    const-wide/16 p1, 0x5

    .line 70
    .line 71
    sub-long/2addr v4, p1

    .line 72
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    move/from16 p2, p9

    .line 77
    .line 78
    if-ne p1, p2, :cond_1

    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x28

    .line 81
    .line 82
    aget-byte p1, v0, v1

    .line 83
    .line 84
    move/from16 p2, p10

    .line 85
    .line 86
    if-eq p1, p2, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    return p1

    .line 93
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 94
    return p1
.end method

.method public nextIfName4Match41(JJJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2a

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x26

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x1e

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x16

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0xe

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x6

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    const-wide p3, 0xffffffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    and-long/2addr p1, p3

    .line 82
    cmp-long p1, p1, p9

    .line 83
    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    return p1

    .line 91
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 92
    return p1
.end method

.method public nextIfName4Match42(JJJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2b

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x27

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x1f

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x17

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0xf

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x7

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    const-wide p3, 0xffffffffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    and-long/2addr p1, p3

    .line 82
    cmp-long p1, p1, p9

    .line 83
    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    return p1

    .line 91
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 92
    return p1
.end method

.method public nextIfName4Match43(JJJJJ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2c

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long v7, v3, v5

    .line 17
    .line 18
    const-wide/16 v9, 0x28

    .line 19
    .line 20
    sub-long/2addr v7, v9

    .line 21
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long p1, v7, p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    add-long p1, v3, v5

    .line 30
    .line 31
    const-wide/16 v7, 0x20

    .line 32
    .line 33
    sub-long/2addr p1, v7

    .line 34
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    cmp-long p1, p1, p3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    add-long p1, v3, v5

    .line 43
    .line 44
    const-wide/16 p3, 0x18

    .line 45
    .line 46
    sub-long/2addr p1, p3

    .line 47
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    cmp-long p1, p1, p5

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    add-long p1, v3, v5

    .line 56
    .line 57
    const-wide/16 p3, 0x10

    .line 58
    .line 59
    sub-long/2addr p1, p3

    .line 60
    invoke-virtual {v2, v0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    cmp-long p1, p1, p7

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    add-long/2addr v3, v5

    .line 69
    const-wide/16 p1, 0x8

    .line 70
    .line 71
    sub-long/2addr v3, p1

    .line 72
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    cmp-long p1, p1, p9

    .line 77
    .line 78
    if-eqz p1, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 86
    return p1
.end method

.method public nextIfName4Match5(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-gt v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x2

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq v0, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public nextIfName4Match6(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x7

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-gt v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x3

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const v2, 0xffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr v0, v2

    .line 28
    if-eq v0, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public nextIfName4Match7(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x8

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-gt v1, v2, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x4

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq v0, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public nextIfName4Match8(IB)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

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
    if-ne v3, p1, :cond_1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x8

    .line 27
    .line 28
    aget-byte p1, v0, v1

    .line 29
    .line 30
    if-eq p1, p2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public nextIfName4Match9(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xa

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0xb

    .line 8
    .line 9
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->end:I

    .line 10
    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 16
    .line 17
    int-to-long v5, v2

    .line 18
    add-long/2addr v3, v5

    .line 19
    const-wide/16 v5, 0x6

    .line 20
    .line 21
    sub-long/2addr v3, v5

    .line 22
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    const-wide v3, 0xffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v0, v3

    .line 32
    cmp-long p1, v0, p1

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public nextIfNull()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr v1, v0

    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public nextIfNullOrEmptyString()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    add-int/2addr v1, v3

    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    const/16 v2, 0x49

    .line 17
    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    add-int/2addr v1, v3

    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return v3
.end method

.method public nextIfObjectEnd()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x5b

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    add-int/2addr v1, v0

    .line 15
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    return v0
.end method

.method public nextIfObjectStart()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x5a

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    add-int/2addr v1, v0

    .line 15
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    return v0
.end method

.method public nextIfSet()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public read(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 181
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    .line 182
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 184
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    .line 185
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/util/Map;J)V
    .locals 5

    .line 1
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte p2, p2, p3

    .line 6
    .line 7
    const/16 v0, -0x5a

    .line 8
    .line 9
    if-ne p2, v0, :cond_a

    .line 10
    .line 11
    add-int/lit8 p3, p3, 0x1

    .line 12
    .line 13
    iput p3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 16
    .line 17
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 18
    .line 19
    aget-byte p2, p2, p3

    .line 20
    .line 21
    const/16 v1, -0x5b

    .line 22
    .line 23
    if-ne p2, v1, :cond_0

    .line 24
    .line 25
    add-int/lit8 p3, p3, 0x1

    .line 26
    .line 27
    iput p3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/16 p3, 0x49

    .line 31
    .line 32
    if-lt p2, p3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isReference()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const-string v1, ".."

    .line 54
    .line 55
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {p1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 70
    .line 71
    .line 72
    const/4 p3, 0x0

    .line 73
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 78
    .line 79
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 80
    .line 81
    aget-byte v1, v1, v2

    .line 82
    .line 83
    if-lt v1, p3, :cond_4

    .line 84
    .line 85
    const/16 p3, 0x7e

    .line 86
    .line 87
    if-gt v1, p3, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    const/16 p3, -0x10

    .line 95
    .line 96
    if-lt v1, p3, :cond_5

    .line 97
    .line 98
    const/16 p3, 0x2f

    .line 99
    .line 100
    if-gt v1, p3, :cond_5

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    const/16 p3, -0x4f

    .line 112
    .line 113
    if-ne v1, p3, :cond_6

    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 118
    .line 119
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    const/16 p3, -0x50

    .line 123
    .line 124
    if-ne v1, p3, :cond_7

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 129
    .line 130
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    if-ne v1, v0, :cond_8

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    goto :goto_2

    .line 140
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    :goto_2
    if-nez p3, :cond_9

    .line 145
    .line 146
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 147
    .line 148
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 149
    .line 150
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 151
    .line 152
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 153
    .line 154
    and-long/2addr v1, v3

    .line 155
    const-wide/16 v3, 0x0

    .line 156
    .line 157
    cmp-long v1, v1, v3

    .line 158
    .line 159
    if-eqz v1, :cond_9

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_9
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_a
    iget-byte p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->error(B)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    const-string p2, "object not support input "

    .line 175
    .line 176
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public readAny()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const-string v4, "/"

    .line 9
    .line 10
    if-ge v0, v3, :cond_3e

    .line 11
    .line 12
    add-int/lit8 v3, v0, 0x1

    .line 13
    .line 14
    iput v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 15
    .line 16
    aget-byte v5, v2, v0

    .line 17
    .line 18
    iput-byte v5, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 19
    .line 20
    const/16 v6, 0x48

    .line 21
    .line 22
    if-eq v5, v6, :cond_3d

    .line 23
    .line 24
    const-string v6, ", offset "

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const-wide/16 v8, 0x0

    .line 28
    .line 29
    packed-switch v5, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    const-string v10, ".."

    .line 33
    .line 34
    const/16 v11, 0x2f

    .line 35
    .line 36
    const/16 v12, -0x10

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    const/16 v14, 0x49

    .line 40
    .line 41
    packed-switch v5, :pswitch_data_1

    .line 42
    .line 43
    .line 44
    packed-switch v5, :pswitch_data_2

    .line 45
    .line 46
    .line 47
    if-lt v5, v12, :cond_0

    .line 48
    .line 49
    if-gt v5, v11, :cond_0

    .line 50
    .line 51
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_0
    const/16 v4, 0x30

    .line 57
    .line 58
    if-lt v5, v4, :cond_1

    .line 59
    .line 60
    const/16 v4, 0x3f

    .line 61
    .line 62
    if-gt v5, v4, :cond_1

    .line 63
    .line 64
    add-int/lit8 v5, v5, -0x38

    .line 65
    .line 66
    shl-int/lit8 v4, v5, 0x8

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x2

    .line 69
    .line 70
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 71
    .line 72
    aget-byte v0, v2, v3

    .line 73
    .line 74
    and-int/lit16 v0, v0, 0xff

    .line 75
    .line 76
    add-int/2addr v4, v0

    .line 77
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :cond_1
    const/16 v4, 0x40

    .line 83
    .line 84
    if-lt v5, v4, :cond_2

    .line 85
    .line 86
    const/16 v4, 0x47

    .line 87
    .line 88
    if-gt v5, v4, :cond_2

    .line 89
    .line 90
    invoke-static {v2, v3, v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x2

    .line 97
    .line 98
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :cond_2
    const/16 v4, -0x28

    .line 106
    .line 107
    if-lt v5, v4, :cond_3

    .line 108
    .line 109
    const/16 v6, -0x11

    .line 110
    .line 111
    if-gt v5, v6, :cond_3

    .line 112
    .line 113
    sub-int/2addr v5, v4

    .line 114
    int-to-long v2, v5

    .line 115
    const-wide/16 v4, -0x8

    .line 116
    .line 117
    add-long/2addr v2, v4

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_3
    const/16 v4, -0x38

    .line 124
    .line 125
    if-lt v5, v4, :cond_4

    .line 126
    .line 127
    const/16 v4, -0x29

    .line 128
    .line 129
    if-gt v5, v4, :cond_4

    .line 130
    .line 131
    add-int/lit8 v5, v5, 0x30

    .line 132
    .line 133
    shl-int/lit8 v4, v5, 0x8

    .line 134
    .line 135
    int-to-long v4, v4

    .line 136
    add-int/lit8 v0, v0, 0x2

    .line 137
    .line 138
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 139
    .line 140
    aget-byte v0, v2, v3

    .line 141
    .line 142
    and-int/lit16 v0, v0, 0xff

    .line 143
    .line 144
    int-to-long v2, v0

    .line 145
    add-long/2addr v4, v2

    .line 146
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :cond_4
    const/16 v4, -0x40

    .line 152
    .line 153
    if-lt v5, v4, :cond_5

    .line 154
    .line 155
    const/16 v4, -0x39

    .line 156
    .line 157
    if-gt v5, v4, :cond_5

    .line 158
    .line 159
    add-int/lit8 v5, v5, 0x3c

    .line 160
    .line 161
    shl-int/lit8 v4, v5, 0x10

    .line 162
    .line 163
    add-int/lit8 v5, v0, 0x2

    .line 164
    .line 165
    iput v5, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 166
    .line 167
    aget-byte v3, v2, v3

    .line 168
    .line 169
    and-int/lit16 v3, v3, 0xff

    .line 170
    .line 171
    shl-int/lit8 v3, v3, 0x8

    .line 172
    .line 173
    add-int/2addr v4, v3

    .line 174
    add-int/lit8 v0, v0, 0x3

    .line 175
    .line 176
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 177
    .line 178
    aget-byte v0, v2, v5

    .line 179
    .line 180
    and-int/lit16 v0, v0, 0xff

    .line 181
    .line 182
    add-int/2addr v4, v0

    .line 183
    int-to-long v2, v4

    .line 184
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :cond_5
    const/16 v0, -0x6c

    .line 190
    .line 191
    if-lt v5, v0, :cond_e

    .line 192
    .line 193
    const/16 v2, -0x5c

    .line 194
    .line 195
    if-gt v5, v2, :cond_e

    .line 196
    .line 197
    if-ne v5, v2, :cond_6

    .line 198
    .line 199
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    goto :goto_0

    .line 204
    :cond_6
    add-int/lit8 v0, v5, 0x6c

    .line 205
    .line 206
    :goto_0
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 207
    .line 208
    if-nez v0, :cond_9

    .line 209
    .line 210
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 211
    .line 212
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 213
    .line 214
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 215
    .line 216
    and-long/2addr v3, v5

    .line 217
    cmp-long v0, v3, v8

    .line 218
    .line 219
    if-eqz v0, :cond_7

    .line 220
    .line 221
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_7
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 228
    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0

    .line 236
    :cond_8
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 237
    .line 238
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :cond_9
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 243
    .line 244
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 245
    .line 246
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 247
    .line 248
    and-long/2addr v2, v4

    .line 249
    cmp-long v2, v2, v8

    .line 250
    .line 251
    if-eqz v2, :cond_a

    .line 252
    .line 253
    new-instance v2, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_a
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 260
    .line 261
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 262
    .line 263
    .line 264
    :goto_1
    if-ge v13, v0, :cond_d

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isReference()Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_c

    .line 271
    .line 272
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_b

    .line 281
    .line 282
    invoke-interface {v2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_b
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-virtual {v1, v2, v13, v3}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_d
    return-object v2

    .line 308
    :cond_e
    if-lt v5, v14, :cond_13

    .line 309
    .line 310
    const/16 v0, 0x79

    .line 311
    .line 312
    if-gt v5, v0, :cond_13

    .line 313
    .line 314
    if-ne v5, v0, :cond_f

    .line 315
    .line 316
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    goto :goto_3

    .line 321
    :cond_f
    add-int/lit8 v0, v5, -0x49

    .line 322
    .line 323
    :goto_3
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 324
    .line 325
    if-gez v0, :cond_10

    .line 326
    .line 327
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 328
    .line 329
    neg-int v0, v0

    .line 330
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :cond_10
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 336
    .line 337
    invoke-virtual {v1, v2, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 342
    .line 343
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 344
    .line 345
    add-int/2addr v2, v3

    .line 346
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 347
    .line 348
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 349
    .line 350
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 351
    .line 352
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 353
    .line 354
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 355
    .line 356
    and-long/2addr v2, v4

    .line 357
    cmp-long v2, v2, v8

    .line 358
    .line 359
    if-eqz v2, :cond_11

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    :cond_11
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 366
    .line 367
    if-nez v2, :cond_12

    .line 368
    .line 369
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 370
    .line 371
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 372
    .line 373
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 374
    .line 375
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 376
    .line 377
    and-long/2addr v2, v4

    .line 378
    cmp-long v2, v2, v8

    .line 379
    .line 380
    if-eqz v2, :cond_12

    .line 381
    .line 382
    return-object v7

    .line 383
    :cond_12
    return-object v0

    .line 384
    :cond_13
    const/16 v0, 0x7f

    .line 385
    .line 386
    if-ne v5, v0, :cond_15

    .line 387
    .line 388
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 393
    .line 394
    if-gez v0, :cond_14

    .line 395
    .line 396
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 397
    .line 398
    neg-int v0, v0

    .line 399
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    return-object v0

    .line 404
    :cond_14
    const-string v0, "not support symbol : "

    .line 405
    .line 406
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 407
    .line 408
    invoke-static {v2, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 409
    .line 410
    .line 411
    const/4 v0, 0x0

    .line 412
    return-object v0

    .line 413
    :cond_15
    iget-byte v0, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->error(B)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const-string v2, "not support type : "

    .line 420
    .line 421
    invoke-static {v0, v2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    const/4 v0, 0x0

    .line 425
    return-object v0

    .line 426
    :pswitch_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 427
    .line 428
    if-nez v0, :cond_16

    .line 429
    .line 430
    const-string v0, "GB18030"

    .line 431
    .line 432
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    sput-object v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 437
    .line 438
    :cond_16
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    new-instance v2, Ljava/lang/String;

    .line 443
    .line 444
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 445
    .line 446
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 447
    .line 448
    sget-object v5, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 449
    .line 450
    invoke-direct {v2, v3, v4, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 451
    .line 452
    .line 453
    if-nez v0, :cond_17

    .line 454
    .line 455
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 456
    .line 457
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 458
    .line 459
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 460
    .line 461
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 462
    .line 463
    and-long/2addr v3, v5

    .line 464
    cmp-long v3, v3, v8

    .line 465
    .line 466
    if-eqz v3, :cond_17

    .line 467
    .line 468
    goto :goto_4

    .line 469
    :cond_17
    move-object v7, v2

    .line 470
    :goto_4
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 471
    .line 472
    add-int/2addr v2, v0

    .line 473
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 474
    .line 475
    return-object v7

    .line 476
    :pswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    new-instance v2, Ljava/lang/String;

    .line 481
    .line 482
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 483
    .line 484
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 485
    .line 486
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 487
    .line 488
    invoke-direct {v2, v3, v4, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 489
    .line 490
    .line 491
    if-nez v0, :cond_18

    .line 492
    .line 493
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 494
    .line 495
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 496
    .line 497
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 498
    .line 499
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 500
    .line 501
    and-long/2addr v3, v5

    .line 502
    cmp-long v3, v3, v8

    .line 503
    .line 504
    if-eqz v3, :cond_18

    .line 505
    .line 506
    goto :goto_5

    .line 507
    :cond_18
    move-object v7, v2

    .line 508
    :goto_5
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 509
    .line 510
    add-int/2addr v2, v0

    .line 511
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 512
    .line 513
    return-object v7

    .line 514
    :pswitch_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    new-instance v2, Ljava/lang/String;

    .line 519
    .line 520
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 521
    .line 522
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 523
    .line 524
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 525
    .line 526
    invoke-direct {v2, v3, v4, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 527
    .line 528
    .line 529
    if-nez v0, :cond_19

    .line 530
    .line 531
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 532
    .line 533
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 534
    .line 535
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 536
    .line 537
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 538
    .line 539
    and-long/2addr v3, v5

    .line 540
    cmp-long v3, v3, v8

    .line 541
    .line 542
    if-eqz v3, :cond_19

    .line 543
    .line 544
    goto :goto_6

    .line 545
    :cond_19
    move-object v7, v2

    .line 546
    :goto_6
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 547
    .line 548
    add-int/2addr v2, v0

    .line 549
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 550
    .line 551
    return-object v7

    .line 552
    :pswitch_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    new-instance v2, Ljava/lang/String;

    .line 557
    .line 558
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 559
    .line 560
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 561
    .line 562
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 563
    .line 564
    invoke-direct {v2, v3, v4, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 565
    .line 566
    .line 567
    if-nez v0, :cond_1a

    .line 568
    .line 569
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 570
    .line 571
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 572
    .line 573
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 574
    .line 575
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 576
    .line 577
    and-long/2addr v3, v5

    .line 578
    cmp-long v3, v3, v8

    .line 579
    .line 580
    if-eqz v3, :cond_1a

    .line 581
    .line 582
    goto :goto_7

    .line 583
    :cond_1a
    move-object v7, v2

    .line 584
    :goto_7
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 585
    .line 586
    add-int/2addr v2, v0

    .line 587
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 588
    .line 589
    return-object v7

    .line 590
    :pswitch_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    new-instance v2, Ljava/lang/String;

    .line 595
    .line 596
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 597
    .line 598
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 599
    .line 600
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 601
    .line 602
    invoke-direct {v2, v3, v4, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 603
    .line 604
    .line 605
    if-nez v0, :cond_1b

    .line 606
    .line 607
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 608
    .line 609
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 610
    .line 611
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 612
    .line 613
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 614
    .line 615
    and-long/2addr v3, v5

    .line 616
    cmp-long v3, v3, v8

    .line 617
    .line 618
    if-eqz v3, :cond_1b

    .line 619
    .line 620
    goto :goto_8

    .line 621
    :cond_1b
    move-object v7, v2

    .line 622
    :goto_8
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 623
    .line 624
    add-int/2addr v2, v0

    .line 625
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 626
    .line 627
    return-object v7

    .line 628
    :pswitch_5
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 633
    .line 634
    add-int/lit8 v2, v2, 0x4

    .line 635
    .line 636
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 637
    .line 638
    new-instance v2, Ljava/lang/Long;

    .line 639
    .line 640
    int-to-long v3, v0

    .line 641
    invoke-direct {v2, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 642
    .line 643
    .line 644
    return-object v2

    .line 645
    :pswitch_6
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 646
    .line 647
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 648
    .line 649
    int-to-long v6, v3

    .line 650
    add-long/2addr v4, v6

    .line 651
    invoke-virtual {v0, v2, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 652
    .line 653
    .line 654
    move-result-wide v2

    .line 655
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 656
    .line 657
    add-int/lit8 v0, v0, 0x8

    .line 658
    .line 659
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 660
    .line 661
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 662
    .line 663
    if-eqz v0, :cond_1c

    .line 664
    .line 665
    goto :goto_9

    .line 666
    :cond_1c
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 667
    .line 668
    .line 669
    move-result-wide v2

    .line 670
    :goto_9
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    return-object v0

    .line 675
    :pswitch_7
    add-int/lit8 v0, v0, 0x2

    .line 676
    .line 677
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 678
    .line 679
    aget-byte v0, v2, v3

    .line 680
    .line 681
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    return-object v0

    .line 686
    :pswitch_8
    add-int/lit8 v4, v0, 0x2

    .line 687
    .line 688
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 689
    .line 690
    aget-byte v3, v2, v3

    .line 691
    .line 692
    shl-int/lit8 v3, v3, 0x8

    .line 693
    .line 694
    add-int/lit8 v0, v0, 0x3

    .line 695
    .line 696
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 697
    .line 698
    aget-byte v0, v2, v4

    .line 699
    .line 700
    and-int/lit16 v0, v0, 0xff

    .line 701
    .line 702
    add-int/2addr v3, v0

    .line 703
    int-to-short v0, v3

    .line 704
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    return-object v0

    .line 709
    :pswitch_9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    new-array v2, v0, [B

    .line 714
    .line 715
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 716
    .line 717
    iget v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 718
    .line 719
    invoke-static {v3, v4, v2, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 720
    .line 721
    .line 722
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 723
    .line 724
    add-int/2addr v3, v0

    .line 725
    iput v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 726
    .line 727
    new-instance v0, Ljava/math/BigInteger;

    .line 728
    .line 729
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 730
    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 734
    .line 735
    .line 736
    move-result-wide v2

    .line 737
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    return-object v0

    .line 742
    :pswitch_b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    if-nez v0, :cond_1d

    .line 751
    .line 752
    new-instance v0, Ljava/math/BigDecimal;

    .line 753
    .line 754
    invoke-direct {v0, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 755
    .line 756
    .line 757
    return-object v0

    .line 758
    :cond_1d
    new-instance v3, Ljava/math/BigDecimal;

    .line 759
    .line 760
    invoke-direct {v3, v2, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 761
    .line 762
    .line 763
    return-object v3

    .line 764
    :pswitch_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 765
    .line 766
    .line 767
    move-result-wide v2

    .line 768
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    return-object v0

    .line 773
    :pswitch_d
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 778
    .line 779
    add-int/lit8 v2, v2, 0x4

    .line 780
    .line 781
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 782
    .line 783
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 784
    .line 785
    .line 786
    move-result v0

    .line 787
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    return-object v0

    .line 792
    :pswitch_e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    int-to-float v0, v0

    .line 797
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    return-object v0

    .line 802
    :pswitch_f
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 803
    .line 804
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 805
    .line 806
    int-to-long v6, v3

    .line 807
    add-long/2addr v4, v6

    .line 808
    invoke-virtual {v0, v2, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 809
    .line 810
    .line 811
    move-result-wide v2

    .line 812
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 813
    .line 814
    add-int/lit8 v0, v0, 0x8

    .line 815
    .line 816
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 817
    .line 818
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 819
    .line 820
    if-eqz v0, :cond_1e

    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_1e
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 824
    .line 825
    .line 826
    move-result-wide v2

    .line 827
    :goto_a
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 828
    .line 829
    .line 830
    move-result-wide v2

    .line 831
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    return-object v0

    .line 836
    :pswitch_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 837
    .line 838
    .line 839
    move-result-wide v2

    .line 840
    long-to-double v2, v2

    .line 841
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    return-object v0

    .line 846
    :pswitch_11
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 847
    .line 848
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    return-object v0

    .line 853
    :pswitch_12
    const-wide/16 v2, 0x0

    .line 854
    .line 855
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    return-object v0

    .line 860
    :pswitch_13
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 861
    .line 862
    return-object v0

    .line 863
    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 864
    .line 865
    return-object v0

    .line 866
    :pswitch_15
    return-object v7

    .line 867
    :pswitch_16
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 868
    .line 869
    .line 870
    move-result-wide v2

    .line 871
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 872
    .line 873
    .line 874
    move-result v0

    .line 875
    int-to-long v4, v0

    .line 876
    invoke-static {v2, v3, v4, v5}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    return-object v0

    .line 881
    :pswitch_17
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    int-to-long v2, v0

    .line 886
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 887
    .line 888
    add-int/lit8 v0, v0, 0x4

    .line 889
    .line 890
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 891
    .line 892
    new-instance v0, Ljava/util/Date;

    .line 893
    .line 894
    const-wide/32 v4, 0xea60

    .line 895
    .line 896
    .line 897
    mul-long/2addr v2, v4

    .line 898
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 899
    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_18
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    int-to-long v2, v0

    .line 907
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 908
    .line 909
    add-int/lit8 v0, v0, 0x4

    .line 910
    .line 911
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 912
    .line 913
    new-instance v0, Ljava/util/Date;

    .line 914
    .line 915
    const-wide/16 v4, 0x3e8

    .line 916
    .line 917
    mul-long/2addr v2, v4

    .line 918
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 919
    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_19
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 923
    .line 924
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 925
    .line 926
    int-to-long v6, v3

    .line 927
    add-long/2addr v4, v6

    .line 928
    invoke-virtual {v0, v2, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 929
    .line 930
    .line 931
    move-result-wide v2

    .line 932
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 933
    .line 934
    add-int/lit8 v0, v0, 0x8

    .line 935
    .line 936
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 937
    .line 938
    new-instance v0, Ljava/util/Date;

    .line 939
    .line 940
    sget-boolean v4, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 941
    .line 942
    if-eqz v4, :cond_1f

    .line 943
    .line 944
    goto :goto_b

    .line 945
    :cond_1f
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 946
    .line 947
    .line 948
    move-result-wide v2

    .line 949
    :goto_b
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 950
    .line 951
    .line 952
    return-object v0

    .line 953
    :pswitch_1a
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTimestampWithTimeZone()Ljava/time/ZonedDateTime;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    return-object v0

    .line 958
    :pswitch_1b
    add-int/lit8 v4, v0, 0x2

    .line 959
    .line 960
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 961
    .line 962
    aget-byte v3, v2, v3

    .line 963
    .line 964
    shl-int/lit8 v3, v3, 0x8

    .line 965
    .line 966
    add-int/lit8 v5, v0, 0x3

    .line 967
    .line 968
    iput v5, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 969
    .line 970
    aget-byte v4, v2, v4

    .line 971
    .line 972
    and-int/lit16 v4, v4, 0xff

    .line 973
    .line 974
    add-int/2addr v3, v4

    .line 975
    add-int/lit8 v4, v0, 0x4

    .line 976
    .line 977
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 978
    .line 979
    aget-byte v5, v2, v5

    .line 980
    .line 981
    add-int/lit8 v0, v0, 0x5

    .line 982
    .line 983
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 984
    .line 985
    aget-byte v0, v2, v4

    .line 986
    .line 987
    invoke-static {v3, v5, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    return-object v0

    .line 992
    :pswitch_1c
    add-int/lit8 v4, v0, 0x2

    .line 993
    .line 994
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 995
    .line 996
    aget-byte v3, v2, v3

    .line 997
    .line 998
    shl-int/lit8 v3, v3, 0x8

    .line 999
    .line 1000
    add-int/lit8 v5, v0, 0x3

    .line 1001
    .line 1002
    iput v5, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1003
    .line 1004
    aget-byte v4, v2, v4

    .line 1005
    .line 1006
    and-int/lit16 v4, v4, 0xff

    .line 1007
    .line 1008
    add-int v6, v3, v4

    .line 1009
    .line 1010
    add-int/lit8 v3, v0, 0x4

    .line 1011
    .line 1012
    iput v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1013
    .line 1014
    aget-byte v7, v2, v5

    .line 1015
    .line 1016
    add-int/lit8 v4, v0, 0x5

    .line 1017
    .line 1018
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1019
    .line 1020
    aget-byte v8, v2, v3

    .line 1021
    .line 1022
    add-int/lit8 v3, v0, 0x6

    .line 1023
    .line 1024
    iput v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1025
    .line 1026
    aget-byte v9, v2, v4

    .line 1027
    .line 1028
    add-int/lit8 v4, v0, 0x7

    .line 1029
    .line 1030
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1031
    .line 1032
    aget-byte v10, v2, v3

    .line 1033
    .line 1034
    add-int/lit8 v0, v0, 0x8

    .line 1035
    .line 1036
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1037
    .line 1038
    aget-byte v11, v2, v4

    .line 1039
    .line 1040
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 1041
    .line 1042
    .line 1043
    move-result v12

    .line 1044
    invoke-static/range {v6 .. v12}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    return-object v0

    .line 1049
    :pswitch_1d
    add-int/lit8 v4, v0, 0x2

    .line 1050
    .line 1051
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1052
    .line 1053
    aget-byte v3, v2, v3

    .line 1054
    .line 1055
    add-int/lit8 v5, v0, 0x3

    .line 1056
    .line 1057
    iput v5, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1058
    .line 1059
    aget-byte v4, v2, v4

    .line 1060
    .line 1061
    add-int/lit8 v0, v0, 0x4

    .line 1062
    .line 1063
    iput v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1064
    .line 1065
    aget-byte v0, v2, v5

    .line 1066
    .line 1067
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 1068
    .line 1069
    .line 1070
    move-result v2

    .line 1071
    invoke-static {v3, v4, v0, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    return-object v0

    .line 1076
    :pswitch_1e
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1077
    .line 1078
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1079
    .line 1080
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1081
    .line 1082
    move-wide v15, v8

    .line 1083
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1084
    .line 1085
    and-long/2addr v2, v8

    .line 1086
    cmp-long v0, v2, v15

    .line 1087
    .line 1088
    const/4 v2, 0x1

    .line 1089
    if-eqz v0, :cond_20

    .line 1090
    .line 1091
    move v0, v2

    .line 1092
    goto :goto_c

    .line 1093
    :cond_20
    move v0, v13

    .line 1094
    :goto_c
    move-object v3, v7

    .line 1095
    :goto_d
    iget-object v5, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1096
    .line 1097
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1098
    .line 1099
    aget-byte v5, v5, v8

    .line 1100
    .line 1101
    const/16 v9, -0x5b

    .line 1102
    .line 1103
    if-ne v5, v9, :cond_23

    .line 1104
    .line 1105
    add-int/2addr v8, v2

    .line 1106
    iput v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1107
    .line 1108
    if-nez v3, :cond_22

    .line 1109
    .line 1110
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1111
    .line 1112
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1113
    .line 1114
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1115
    .line 1116
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1117
    .line 1118
    and-long/2addr v2, v4

    .line 1119
    cmp-long v0, v2, v15

    .line 1120
    .line 1121
    if-eqz v0, :cond_21

    .line 1122
    .line 1123
    new-instance v0, Ljava/util/HashMap;

    .line 1124
    .line 1125
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1126
    .line 1127
    .line 1128
    return-object v0

    .line 1129
    :cond_21
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 1130
    .line 1131
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :cond_22
    return-object v3

    .line 1136
    :cond_23
    if-eqz v0, :cond_27

    .line 1137
    .line 1138
    if-nez v13, :cond_27

    .line 1139
    .line 1140
    if-lt v5, v14, :cond_27

    .line 1141
    .line 1142
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldNameHashCode()J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v8

    .line 1146
    const-wide v17, 0x6570797440L

    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    cmp-long v5, v8, v17

    .line 1152
    .line 1153
    if-nez v5, :cond_26

    .line 1154
    .line 1155
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readValueHashCode()J

    .line 1156
    .line 1157
    .line 1158
    move-result-wide v8

    .line 1159
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1160
    .line 1161
    invoke-virtual {v0, v8, v9}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    if-nez v0, :cond_25

    .line 1166
    .line 1167
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1172
    .line 1173
    invoke-virtual {v3, v0, v7}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    if-eqz v3, :cond_24

    .line 1178
    .line 1179
    move-object v0, v3

    .line 1180
    goto :goto_e

    .line 1181
    :cond_24
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1182
    .line 1183
    const-string v3, "auotype not support : "

    .line 1184
    .line 1185
    invoke-static {v3, v0, v6}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1190
    .line 1191
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1195
    .line 1196
    .line 1197
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1198
    .line 1199
    array-length v3, v3

    .line 1200
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    throw v2

    .line 1211
    :cond_25
    :goto_e
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->typeRedirect:Z

    .line 1212
    .line 1213
    const/4 v3, 0x0

    .line 1214
    const-wide/16 v4, 0x0

    .line 1215
    .line 1216
    const/4 v2, 0x0

    .line 1217
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    return-object v0

    .line 1222
    :cond_26
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v5

    .line 1226
    goto :goto_f

    .line 1227
    :cond_27
    if-lt v5, v14, :cond_28

    .line 1228
    .line 1229
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldName()Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v5

    .line 1233
    goto :goto_f

    .line 1234
    :cond_28
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v5

    .line 1238
    :goto_f
    if-nez v3, :cond_2b

    .line 1239
    .line 1240
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1241
    .line 1242
    iget-wide v8, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1243
    .line 1244
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1245
    .line 1246
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1247
    .line 1248
    and-long/2addr v8, v11

    .line 1249
    cmp-long v2, v8, v15

    .line 1250
    .line 1251
    if-eqz v2, :cond_29

    .line 1252
    .line 1253
    new-instance v3, Ljava/util/HashMap;

    .line 1254
    .line 1255
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_10

    .line 1259
    :cond_29
    iget-object v2, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 1260
    .line 1261
    if-eqz v2, :cond_2a

    .line 1262
    .line 1263
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    move-object v3, v2

    .line 1268
    check-cast v3, Ljava/util/Map;

    .line 1269
    .line 1270
    goto :goto_10

    .line 1271
    :cond_2a
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1272
    .line 1273
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1274
    .line 1275
    .line 1276
    :cond_2b
    :goto_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isReference()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v2

    .line 1280
    if-eqz v2, :cond_2d

    .line 1281
    .line 1282
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v8

    .line 1290
    if-eqz v8, :cond_2c

    .line 1291
    .line 1292
    invoke-interface {v3, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    :goto_11
    move-object/from16 v19, v10

    .line 1296
    .line 1297
    goto/16 :goto_13

    .line 1298
    .line 1299
    :cond_2c
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    invoke-virtual {v1, v3, v5, v2}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-interface {v3, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    goto :goto_11

    .line 1310
    :cond_2d
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1311
    .line 1312
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1313
    .line 1314
    aget-byte v2, v2, v8

    .line 1315
    .line 1316
    if-lt v2, v14, :cond_2e

    .line 1317
    .line 1318
    const/16 v9, 0x7e

    .line 1319
    .line 1320
    if-gt v2, v9, :cond_2e

    .line 1321
    .line 1322
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    const/16 v9, -0x10

    .line 1327
    .line 1328
    const/16 v11, 0x2f

    .line 1329
    .line 1330
    goto :goto_12

    .line 1331
    :cond_2e
    const/16 v9, -0x10

    .line 1332
    .line 1333
    const/16 v11, 0x2f

    .line 1334
    .line 1335
    if-lt v2, v9, :cond_2f

    .line 1336
    .line 1337
    if-gt v2, v11, :cond_2f

    .line 1338
    .line 1339
    add-int/lit8 v8, v8, 0x1

    .line 1340
    .line 1341
    iput v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1342
    .line 1343
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    goto :goto_12

    .line 1348
    :cond_2f
    const/16 v12, -0x4f

    .line 1349
    .line 1350
    if-ne v2, v12, :cond_30

    .line 1351
    .line 1352
    add-int/lit8 v8, v8, 0x1

    .line 1353
    .line 1354
    iput v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1355
    .line 1356
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1357
    .line 1358
    goto :goto_12

    .line 1359
    :cond_30
    const/16 v12, -0x50

    .line 1360
    .line 1361
    if-ne v2, v12, :cond_31

    .line 1362
    .line 1363
    add-int/lit8 v8, v8, 0x1

    .line 1364
    .line 1365
    iput v8, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1366
    .line 1367
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1368
    .line 1369
    goto :goto_12

    .line 1370
    :cond_31
    const/16 v8, -0x5a

    .line 1371
    .line 1372
    if-ne v2, v8, :cond_32

    .line 1373
    .line 1374
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v2

    .line 1378
    goto :goto_12

    .line 1379
    :cond_32
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    :goto_12
    if-nez v2, :cond_33

    .line 1384
    .line 1385
    iget-object v8, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1386
    .line 1387
    move-object v12, v10

    .line 1388
    iget-wide v9, v8, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1389
    .line 1390
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1391
    .line 1392
    move-object/from16 v19, v12

    .line 1393
    .line 1394
    iget-wide v11, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1395
    .line 1396
    and-long v8, v9, v11

    .line 1397
    .line 1398
    cmp-long v8, v8, v15

    .line 1399
    .line 1400
    if-eqz v8, :cond_34

    .line 1401
    .line 1402
    goto :goto_13

    .line 1403
    :cond_33
    move-object/from16 v19, v10

    .line 1404
    .line 1405
    :cond_34
    invoke-interface {v3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    :goto_13
    add-int/lit8 v13, v13, 0x1

    .line 1409
    .line 1410
    move-object/from16 v10, v19

    .line 1411
    .line 1412
    const/4 v2, 0x1

    .line 1413
    const/16 v11, 0x2f

    .line 1414
    .line 1415
    const/16 v12, -0x10

    .line 1416
    .line 1417
    goto/16 :goto_d

    .line 1418
    .line 1419
    :pswitch_1f
    move-wide v15, v8

    .line 1420
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode()J

    .line 1421
    .line 1422
    .line 1423
    move-result-wide v21

    .line 1424
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1425
    .line 1426
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 1427
    .line 1428
    if-eqz v2, :cond_36

    .line 1429
    .line 1430
    const/16 v23, 0x0

    .line 1431
    .line 1432
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1433
    .line 1434
    move-object/from16 v20, v2

    .line 1435
    .line 1436
    move-wide/from16 v24, v8

    .line 1437
    .line 1438
    invoke-interface/range {v20 .. v25}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    move-wide/from16 v2, v21

    .line 1443
    .line 1444
    if-nez v0, :cond_35

    .line 1445
    .line 1446
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    iget-object v5, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1451
    .line 1452
    iget-object v8, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 1453
    .line 1454
    iget-wide v9, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1455
    .line 1456
    invoke-interface {v8, v0, v7, v9, v10}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    :cond_35
    if-eqz v0, :cond_37

    .line 1461
    .line 1462
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1463
    .line 1464
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    const/4 v3, 0x0

    .line 1469
    const-wide/16 v4, 0x0

    .line 1470
    .line 1471
    const/4 v2, 0x0

    .line 1472
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    return-object v0

    .line 1477
    :cond_36
    move-wide/from16 v2, v21

    .line 1478
    .line 1479
    :cond_37
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1480
    .line 1481
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 1482
    .line 1483
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1484
    .line 1485
    iget-wide v10, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1486
    .line 1487
    and-long/2addr v8, v10

    .line 1488
    cmp-long v5, v8, v15

    .line 1489
    .line 1490
    if-eqz v5, :cond_3a

    .line 1491
    .line 1492
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v0

    .line 1496
    if-nez v0, :cond_39

    .line 1497
    .line 1498
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 1503
    .line 1504
    invoke-virtual {v2, v0, v7}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    if-eqz v2, :cond_38

    .line 1509
    .line 1510
    move-object v0, v2

    .line 1511
    goto :goto_14

    .line 1512
    :cond_38
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1513
    .line 1514
    const-string v3, "autoType not support : "

    .line 1515
    .line 1516
    invoke-static {v3, v0, v6}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1521
    .line 1522
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1526
    .line 1527
    .line 1528
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1529
    .line 1530
    array-length v3, v3

    .line 1531
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1539
    .line 1540
    .line 1541
    throw v2

    .line 1542
    :cond_39
    :goto_14
    const/4 v3, 0x0

    .line 1543
    const-wide/16 v4, 0x0

    .line 1544
    .line 1545
    const/4 v2, 0x0

    .line 1546
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    return-object v0

    .line 1551
    :cond_3a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isObject()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v0

    .line 1555
    if-eqz v0, :cond_3b

    .line 1556
    .line 1557
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    return-object v0

    .line 1562
    :cond_3b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isArray()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v0

    .line 1566
    if-eqz v0, :cond_3c

    .line 1567
    .line 1568
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readArray()Ljava/util/List;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    return-object v0

    .line 1573
    :cond_3c
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 1574
    .line 1575
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1576
    .line 1577
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1578
    .line 1579
    array-length v3, v3

    .line 1580
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1581
    .line 1582
    const-string v6, "autoType not support , offset "

    .line 1583
    .line 1584
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v2

    .line 1600
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1601
    .line 1602
    .line 1603
    throw v0

    .line 1604
    :pswitch_20
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 1605
    .line 1606
    .line 1607
    move-result v0

    .line 1608
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1609
    .line 1610
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1611
    .line 1612
    add-int v4, v3, v0

    .line 1613
    .line 1614
    invoke-static {v2, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1619
    .line 1620
    add-int/2addr v3, v0

    .line 1621
    iput v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1622
    .line 1623
    return-object v2

    .line 1624
    :pswitch_21
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 1625
    .line 1626
    .line 1627
    move-result v0

    .line 1628
    int-to-char v0, v0

    .line 1629
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    return-object v0

    .line 1634
    :cond_3d
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 1635
    .line 1636
    .line 1637
    move-result v0

    .line 1638
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1639
    .line 1640
    add-int/lit8 v2, v2, 0x4

    .line 1641
    .line 1642
    iput v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1643
    .line 1644
    new-instance v2, Ljava/lang/Integer;

    .line 1645
    .line 1646
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 1647
    .line 1648
    .line 1649
    return-object v2

    .line 1650
    :cond_3e
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 1651
    .line 1652
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1653
    .line 1654
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 1655
    .line 1656
    array-length v3, v3

    .line 1657
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1658
    .line 1659
    const-string v6, "readAny overflow : "

    .line 1660
    .line 1661
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v2

    .line 1677
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1678
    .line 1679
    .line 1680
    throw v0

    .line 1681
    :pswitch_data_0
    .packed-switch -0x70
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    :pswitch_data_1
    .packed-switch -0x5a
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
    .end packed-switch

    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    :pswitch_data_2
    .packed-switch 0x7a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readArray()Ljava/util/List;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v0, :cond_17

    .line 13
    .line 14
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 15
    .line 16
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 17
    .line 18
    aget-byte v6, v4, v5

    .line 19
    .line 20
    const/16 v7, 0x7e

    .line 21
    .line 22
    const/16 v8, 0x49

    .line 23
    .line 24
    if-lt v6, v8, :cond_0

    .line 25
    .line 26
    if-gt v6, v7, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_0
    const/16 v9, -0x10

    .line 35
    .line 36
    if-lt v6, v9, :cond_1

    .line 37
    .line 38
    const/16 v9, 0x2f

    .line 39
    .line 40
    if-gt v6, v9, :cond_1

    .line 41
    .line 42
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_1
    const/16 v9, -0x4f

    .line 53
    .line 54
    if-ne v6, v9, :cond_2

    .line 55
    .line 56
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 59
    .line 60
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    const/16 v9, -0x50

    .line 65
    .line 66
    if-ne v6, v9, :cond_3

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 71
    .line 72
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    goto/16 :goto_8

    .line 75
    .line 76
    :cond_3
    const/16 v9, -0x5a

    .line 77
    .line 78
    if-ne v6, v9, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_4
    const/16 v10, -0x42

    .line 87
    .line 88
    if-ne v6, v10, :cond_6

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 95
    .line 96
    sget-wide v7, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 97
    .line 98
    int-to-long v9, v5

    .line 99
    add-long/2addr v7, v9

    .line 100
    invoke-virtual {v6, v4, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x8

    .line 107
    .line 108
    iput v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    sget-boolean v6, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 111
    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    invoke-static {v4, v5}, Ljava/lang/Long;->reverseBytes(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_6
    const-string v10, ".."

    .line 126
    .line 127
    const/16 v11, -0x6c

    .line 128
    .line 129
    if-lt v6, v11, :cond_10

    .line 130
    .line 131
    const/16 v11, -0x5c

    .line 132
    .line 133
    if-gt v6, v11, :cond_10

    .line 134
    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 138
    .line 139
    if-ne v6, v11, :cond_7

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    goto :goto_2

    .line 146
    :cond_7
    add-int/lit8 v4, v6, 0x6c

    .line 147
    .line 148
    :goto_2
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 149
    .line 150
    const-wide/16 v11, 0x0

    .line 151
    .line 152
    if-nez v4, :cond_a

    .line 153
    .line 154
    iget-wide v6, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 155
    .line 156
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 157
    .line 158
    iget-wide v8, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 159
    .line 160
    and-long/2addr v6, v8

    .line 161
    cmp-long v4, v6, v11

    .line 162
    .line 163
    if-eqz v4, :cond_8

    .line 164
    .line 165
    new-instance v4, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_8

    .line 171
    .line 172
    :cond_8
    iget-object v4, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 173
    .line 174
    if-eqz v4, :cond_9

    .line 175
    .line 176
    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    goto/16 :goto_8

    .line 181
    .line 182
    :cond_9
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 183
    .line 184
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_8

    .line 188
    .line 189
    :cond_a
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 190
    .line 191
    sget-object v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 192
    .line 193
    iget-wide v13, v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 194
    .line 195
    and-long/2addr v5, v13

    .line 196
    cmp-long v5, v5, v11

    .line 197
    .line 198
    if-eqz v5, :cond_b

    .line 199
    .line 200
    new-instance v5, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_b
    new-instance v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 207
    .line 208
    invoke-direct {v5, v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 209
    .line 210
    .line 211
    :goto_3
    move v6, v2

    .line 212
    :goto_4
    if-ge v6, v4, :cond_12

    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isReference()Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_d

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-eqz v12, :cond_c

    .line 229
    .line 230
    invoke-interface {v5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_c
    const/4 v12, 0x0

    .line 235
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    invoke-static {v11}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual {p0, v5, v6, v11}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 243
    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_d
    iget-object v11, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 247
    .line 248
    iget v12, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 249
    .line 250
    aget-byte v11, v11, v12

    .line 251
    .line 252
    if-lt v11, v8, :cond_e

    .line 253
    .line 254
    if-gt v11, v7, :cond_e

    .line 255
    .line 256
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    goto :goto_5

    .line 261
    :cond_e
    if-ne v11, v9, :cond_f

    .line 262
    .line 263
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    goto :goto_5

    .line 268
    :cond_f
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    :goto_5
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_10
    const/16 v7, 0x30

    .line 279
    .line 280
    if-lt v6, v7, :cond_11

    .line 281
    .line 282
    const/16 v7, 0x3f

    .line 283
    .line 284
    if-gt v6, v7, :cond_11

    .line 285
    .line 286
    add-int/lit8 v6, v6, -0x38

    .line 287
    .line 288
    shl-int/lit8 v6, v6, 0x8

    .line 289
    .line 290
    add-int/lit8 v5, v5, 0x1

    .line 291
    .line 292
    aget-byte v4, v4, v5

    .line 293
    .line 294
    and-int/lit16 v4, v4, 0xff

    .line 295
    .line 296
    add-int/2addr v6, v4

    .line 297
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 302
    .line 303
    add-int/lit8 v5, v5, 0x2

    .line 304
    .line 305
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_11
    const/16 v7, 0x40

    .line 309
    .line 310
    if-lt v6, v7, :cond_13

    .line 311
    .line 312
    const/16 v7, 0x47

    .line 313
    .line 314
    if-gt v6, v7, :cond_13

    .line 315
    .line 316
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 323
    .line 324
    add-int/lit8 v5, v5, 0x3

    .line 325
    .line 326
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 327
    .line 328
    new-instance v5, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 331
    .line 332
    .line 333
    :cond_12
    :goto_7
    move-object v4, v5

    .line 334
    goto :goto_8

    .line 335
    :cond_13
    const/16 v7, 0x48

    .line 336
    .line 337
    if-ne v6, v7, :cond_14

    .line 338
    .line 339
    add-int/lit8 v5, v5, 0x1

    .line 340
    .line 341
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 346
    .line 347
    add-int/lit8 v5, v5, 0x5

    .line 348
    .line 349
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 350
    .line 351
    new-instance v5, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_14
    const/16 v4, -0x6d

    .line 358
    .line 359
    if-ne v6, v4, :cond_16

    .line 360
    .line 361
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-eqz v5, :cond_15

    .line 370
    .line 371
    move-object v4, v1

    .line 372
    goto :goto_8

    .line 373
    :cond_15
    invoke-static {v4}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {p0, v1, v3, v4}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    :goto_8
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    :goto_9
    add-int/lit8 v3, v3, 0x1

    .line 389
    .line 390
    goto/16 :goto_0

    .line 391
    .line 392
    :cond_17
    return-object v1
.end method

.method public readArray(Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 4

    .line 393
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->nextIfNull()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    aget-byte v0, v0, v1

    const/16 v1, -0x6e

    if-ne v0, v1, :cond_3

    .line 395
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p1

    .line 396
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 397
    check-cast p1, Ljava/util/List;

    return-object p1

    .line 398
    :cond_1
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 399
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    check-cast p1, Ljava/util/Collection;

    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(Ljava/util/Collection;)V

    return-object v0

    .line 400
    :cond_2
    const-string v0, "not support class "

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 401
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    move-result v0

    .line 402
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 403
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method public readArray(Ljava/util/Collection;Ljava/lang/reflect/Type;)V
    .locals 3

    .line 404
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 405
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public readBigDecimal()Ljava/math/BigDecimal;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v1, v0, v1

    .line 10
    .line 11
    const/16 v2, -0x47

    .line 12
    .line 13
    if-ne v1, v2, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    aget-byte v3, v0, v2

    .line 22
    .line 23
    const/16 v4, -0x46

    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v2, v3, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :cond_0
    const/16 v4, 0x48

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-long v2, v0

    .line 51
    invoke-static {v2, v3, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x5

    .line 58
    .line 59
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    const/16 v4, -0x42

    .line 63
    .line 64
    if-ne v3, v4, :cond_3

    .line 65
    .line 66
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 67
    .line 68
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 69
    .line 70
    int-to-long v6, v2

    .line 71
    add-long/2addr v4, v6

    .line 72
    const-wide/16 v6, 0x1

    .line 73
    .line 74
    add-long/2addr v4, v6

    .line 75
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    :goto_0
    invoke-static {v2, v3, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x9

    .line 95
    .line 96
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    new-instance v1, Ljava/math/BigDecimal;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_4
    new-instance v2, Ljava/math/BigDecimal;

    .line 112
    .line 113
    invoke-direct {v2, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_5
    const/16 v0, -0x48

    .line 118
    .line 119
    if-ne v1, v0, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :cond_6
    invoke-direct {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readDecimal0(B)Ljava/math/BigDecimal;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0
.end method

.method public readBigInteger()Ljava/math/BigInteger;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    const/16 v1, -0x46

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/16 v1, -0x45

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-array v1, v0, [B

    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 35
    .line 36
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 43
    .line 44
    add-int/2addr v2, v0

    .line 45
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 46
    .line 47
    new-instance v0, Ljava/math/BigInteger;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger0(B)Ljava/math/BigInteger;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public readBinary()[B
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    const/16 v1, -0x6f

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-array v1, v0, [B

    .line 20
    .line 21
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 22
    .line 23
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    throw v0
.end method

.method public readBool()Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    const/16 v1, -0x51

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/16 v1, -0x4f

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    const/16 v1, -0x50

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBoolValue0(B)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public readBoolValue()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 5
    .line 6
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 11
    .line 12
    aget-byte v1, v1, v2

    .line 13
    .line 14
    const/16 v2, -0x4f

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/16 v2, -0x50

    .line 21
    .line 22
    if-ne v1, v2, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    invoke-direct {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBoolValue0(B)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public readCharValue()C
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x70

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    int-to-char v0, v0

    .line 20
    return v0

    .line 21
    :cond_0
    const/16 v3, 0x49

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    if-le v2, v3, :cond_2

    .line 32
    .line 33
    const/16 v3, 0x78

    .line 34
    .line 35
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    add-int/lit8 v2, v1, 0x1

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x2

    .line 40
    .line 41
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 42
    .line 43
    aget-byte v0, v0, v2

    .line 44
    .line 45
    and-int/lit16 v0, v0, 0xff

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    return v0

    .line 66
    :cond_4
    :goto_1
    return v4
.end method

.method public readDate()Ljava/util/Date;
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const-wide/16 v3, 0x1

    .line 8
    .line 9
    const-wide/16 v5, 0x3e8

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :pswitch_0
    add-int/2addr v0, v7

    .line 19
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    int-to-long v2, v2

    .line 30
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_1
    add-int/2addr v0, v7

    .line 40
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-long v0, v0

    .line 45
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x5

    .line 48
    .line 49
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 50
    .line 51
    new-instance v2, Ljava/util/Date;

    .line 52
    .line 53
    const-wide/32 v3, 0xea60

    .line 54
    .line 55
    .line 56
    mul-long/2addr v0, v3

    .line 57
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_2
    add-int/2addr v0, v7

    .line 62
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-long v0, v0

    .line 67
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x5

    .line 70
    .line 71
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 72
    .line 73
    new-instance v2, Ljava/util/Date;

    .line 74
    .line 75
    mul-long/2addr v0, v5

    .line 76
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :pswitch_3
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 81
    .line 82
    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 83
    .line 84
    int-to-long v7, v0

    .line 85
    add-long/2addr v5, v7

    .line 86
    add-long/2addr v5, v3

    .line 87
    invoke-virtual {v2, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x9

    .line 94
    .line 95
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    new-instance v2, Ljava/util/Date;

    .line 98
    .line 99
    sget-boolean v3, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 100
    .line 101
    if-eqz v3, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    :goto_0
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 109
    .line 110
    .line 111
    return-object v2

    .line 112
    :pswitch_4
    add-int/2addr v0, v7

    .line 113
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 114
    .line 115
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTimestampWithTimeZone()Ljava/time/ZonedDateTime;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    goto :goto_1

    .line 120
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate()Ljava/time/LocalDate;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 125
    .line 126
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    goto :goto_1

    .line 141
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime()Ljava/time/LocalDateTime;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    goto :goto_1

    .line 156
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime()Ljava/time/LocalTime;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const/16 v1, 0x7b2

    .line 161
    .line 162
    invoke-static {v1, v7, v7}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    :goto_1
    if-eqz v8, :cond_2

    .line 181
    .line 182
    invoke-interface {v8}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v2}, Ljava/time/LocalTime;->getNano()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    const-wide/16 v7, 0x0

    .line 195
    .line 196
    cmp-long v7, v0, v7

    .line 197
    .line 198
    const v8, 0xf4240

    .line 199
    .line 200
    .line 201
    if-gez v7, :cond_1

    .line 202
    .line 203
    if-lez v2, :cond_1

    .line 204
    .line 205
    add-long/2addr v0, v3

    .line 206
    mul-long/2addr v0, v5

    .line 207
    div-int/2addr v2, v8

    .line 208
    add-int/lit16 v2, v2, -0x3e8

    .line 209
    .line 210
    :goto_2
    int-to-long v2, v2

    .line 211
    add-long/2addr v0, v2

    .line 212
    goto :goto_3

    .line 213
    :cond_1
    mul-long/2addr v0, v5

    .line 214
    div-int/2addr v2, v8

    .line 215
    goto :goto_2

    .line 216
    :goto_3
    new-instance v2, Ljava/util/Date;

    .line 217
    .line 218
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 219
    .line 220
    .line 221
    return-object v2

    .line 222
    :cond_2
    invoke-super {p0}, Lcom/alibaba/fastjson2/JSONReader;->readDate()Ljava/util/Date;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch -0x59
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

.method public readDoubleValue()D
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x4b

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x8

    .line 12
    .line 13
    aget-byte v2, v0, v2

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    const-wide/16 v4, 0xff

    .line 17
    .line 18
    and-long/2addr v2, v4

    .line 19
    add-int/lit8 v6, v1, 0x7

    .line 20
    .line 21
    aget-byte v6, v0, v6

    .line 22
    .line 23
    int-to-long v6, v6

    .line 24
    and-long/2addr v6, v4

    .line 25
    const/16 v8, 0x8

    .line 26
    .line 27
    shl-long/2addr v6, v8

    .line 28
    add-long/2addr v2, v6

    .line 29
    add-int/lit8 v6, v1, 0x6

    .line 30
    .line 31
    aget-byte v6, v0, v6

    .line 32
    .line 33
    int-to-long v6, v6

    .line 34
    and-long/2addr v6, v4

    .line 35
    const/16 v8, 0x10

    .line 36
    .line 37
    shl-long/2addr v6, v8

    .line 38
    add-long/2addr v2, v6

    .line 39
    add-int/lit8 v6, v1, 0x5

    .line 40
    .line 41
    aget-byte v6, v0, v6

    .line 42
    .line 43
    int-to-long v6, v6

    .line 44
    and-long/2addr v6, v4

    .line 45
    const/16 v8, 0x18

    .line 46
    .line 47
    shl-long/2addr v6, v8

    .line 48
    add-long/2addr v2, v6

    .line 49
    add-int/lit8 v6, v1, 0x4

    .line 50
    .line 51
    aget-byte v6, v0, v6

    .line 52
    .line 53
    int-to-long v6, v6

    .line 54
    and-long/2addr v6, v4

    .line 55
    const/16 v8, 0x20

    .line 56
    .line 57
    shl-long/2addr v6, v8

    .line 58
    add-long/2addr v2, v6

    .line 59
    add-int/lit8 v6, v1, 0x3

    .line 60
    .line 61
    aget-byte v6, v0, v6

    .line 62
    .line 63
    int-to-long v6, v6

    .line 64
    and-long/2addr v6, v4

    .line 65
    const/16 v8, 0x28

    .line 66
    .line 67
    shl-long/2addr v6, v8

    .line 68
    add-long/2addr v2, v6

    .line 69
    add-int/lit8 v6, v1, 0x2

    .line 70
    .line 71
    aget-byte v6, v0, v6

    .line 72
    .line 73
    int-to-long v6, v6

    .line 74
    and-long/2addr v4, v6

    .line 75
    const/16 v6, 0x30

    .line 76
    .line 77
    shl-long/2addr v4, v6

    .line 78
    add-long/2addr v2, v4

    .line 79
    add-int/lit8 v4, v1, 0x1

    .line 80
    .line 81
    aget-byte v0, v0, v4

    .line 82
    .line 83
    int-to-long v4, v0

    .line 84
    const/16 v0, 0x38

    .line 85
    .line 86
    shl-long/2addr v4, v0

    .line 87
    add-long/2addr v2, v4

    .line 88
    add-int/lit8 v1, v1, 0x9

    .line 89
    .line 90
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 91
    .line 92
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    return-wide v0

    .line 97
    :cond_0
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readDoubleValue0()D

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    return-wide v0
.end method

.method public readFieldName()Ljava/lang/String;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    aget-byte v3, v1, v2

    .line 8
    .line 9
    iput-byte v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 10
    .line 11
    const/16 v4, -0x51

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    add-int/2addr v2, v6

    .line 18
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 19
    .line 20
    return-object v5

    .line 21
    :cond_0
    add-int/lit8 v4, v2, 0x1

    .line 22
    .line 23
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    const/16 v7, 0x7f

    .line 26
    .line 27
    if-ne v3, v7, :cond_1

    .line 28
    .line 29
    move v3, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_0
    const/16 v7, 0x20

    .line 33
    .line 34
    const/16 v8, 0x8

    .line 35
    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    aget-byte v4, v1, v4

    .line 39
    .line 40
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 41
    .line 42
    const/16 v9, -0x10

    .line 43
    .line 44
    if-lt v4, v9, :cond_4

    .line 45
    .line 46
    const/16 v9, 0x48

    .line 47
    .line 48
    if-gt v4, v9, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-gez v1, :cond_2

    .line 55
    .line 56
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 57
    .line 58
    neg-int v1, v1

    .line 59
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    return-object v1

    .line 64
    :cond_2
    if-nez v1, :cond_3

    .line 65
    .line 66
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 67
    .line 68
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 69
    .line 70
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 71
    .line 72
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 73
    .line 74
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 75
    .line 76
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    return-object v1

    .line 83
    :cond_3
    mul-int/lit8 v1, v1, 0x2

    .line 84
    .line 85
    add-int/2addr v1, v6

    .line 86
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 87
    .line 88
    aget-wide v1, v2, v1

    .line 89
    .line 90
    long-to-int v3, v1

    .line 91
    int-to-byte v4, v3

    .line 92
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 93
    .line 94
    shr-int/2addr v3, v8

    .line 95
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 96
    .line 97
    shr-long/2addr v1, v7

    .line 98
    long-to-int v1, v1

    .line 99
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    return-object v1

    .line 106
    :cond_4
    add-int/lit8 v2, v2, 0x2

    .line 107
    .line 108
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    :cond_5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 113
    .line 114
    iget-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 115
    .line 116
    const/16 v9, 0x49

    .line 117
    .line 118
    const/16 v10, 0x38

    .line 119
    .line 120
    const/16 v11, 0x30

    .line 121
    .line 122
    if-lt v4, v9, :cond_c

    .line 123
    .line 124
    const/16 v9, 0x79

    .line 125
    .line 126
    if-gt v4, v9, :cond_c

    .line 127
    .line 128
    const/16 v9, 0x79

    .line 129
    .line 130
    if-ne v4, v9, :cond_6

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 137
    .line 138
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 139
    .line 140
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 141
    .line 142
    :goto_1
    move/from16 v18, v8

    .line 143
    .line 144
    const/16 v21, 0x10

    .line 145
    .line 146
    const-wide/16 v22, -0x1

    .line 147
    .line 148
    goto/16 :goto_8

    .line 149
    .line 150
    :cond_6
    add-int/lit8 v4, v4, -0x49

    .line 151
    .line 152
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 153
    .line 154
    sget-boolean v9, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 155
    .line 156
    const/16 v15, 0x28

    .line 157
    .line 158
    const-wide/16 v16, 0xff

    .line 159
    .line 160
    if-eqz v9, :cond_7

    .line 161
    .line 162
    packed-switch v4, :pswitch_data_0

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_0
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 167
    .line 168
    sget-wide v9, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 169
    .line 170
    move/from16 v18, v8

    .line 171
    .line 172
    move-wide v15, v9

    .line 173
    int-to-long v8, v2

    .line 174
    add-long v9, v15, v8

    .line 175
    .line 176
    invoke-virtual {v4, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v8

    .line 180
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 181
    .line 182
    int-to-long v10, v2

    .line 183
    add-long/2addr v10, v15

    .line 184
    const-wide/16 v15, 0x8

    .line 185
    .line 186
    add-long/2addr v10, v15

    .line 187
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 188
    .line 189
    .line 190
    move-result-wide v10

    .line 191
    move-wide v12, v8

    .line 192
    move-wide v14, v10

    .line 193
    const/16 v21, 0x10

    .line 194
    .line 195
    const-wide/16 v22, -0x1

    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :pswitch_1
    move/from16 v18, v8

    .line 200
    .line 201
    add-int/lit8 v4, v2, 0x6

    .line 202
    .line 203
    aget-byte v4, v1, v4

    .line 204
    .line 205
    const-wide v19, 0xffffffffL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    int-to-long v9, v4

    .line 211
    shl-long v8, v9, v11

    .line 212
    .line 213
    add-int/lit8 v4, v2, 0x5

    .line 214
    .line 215
    aget-byte v4, v1, v4

    .line 216
    .line 217
    int-to-long v10, v4

    .line 218
    and-long v10, v10, v16

    .line 219
    .line 220
    shl-long/2addr v10, v15

    .line 221
    add-long/2addr v8, v10

    .line 222
    add-int/lit8 v4, v2, 0x4

    .line 223
    .line 224
    aget-byte v4, v1, v4

    .line 225
    .line 226
    int-to-long v10, v4

    .line 227
    and-long v10, v10, v16

    .line 228
    .line 229
    shl-long/2addr v10, v7

    .line 230
    add-long/2addr v8, v10

    .line 231
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 232
    .line 233
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 234
    .line 235
    const/16 v21, 0x10

    .line 236
    .line 237
    const-wide/16 v22, -0x1

    .line 238
    .line 239
    int-to-long v12, v2

    .line 240
    add-long/2addr v12, v10

    .line 241
    invoke-virtual {v4, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    int-to-long v12, v2

    .line 246
    and-long v12, v12, v19

    .line 247
    .line 248
    add-long/2addr v8, v12

    .line 249
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 250
    .line 251
    int-to-long v12, v2

    .line 252
    add-long/2addr v10, v12

    .line 253
    const-wide/16 v12, 0x7

    .line 254
    .line 255
    add-long/2addr v10, v12

    .line 256
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v10

    .line 260
    :goto_2
    move-wide v12, v8

    .line 261
    move-wide v14, v10

    .line 262
    goto/16 :goto_a

    .line 263
    .line 264
    :pswitch_2
    move/from16 v18, v8

    .line 265
    .line 266
    const-wide v19, 0xffffffffL

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    const/16 v21, 0x10

    .line 272
    .line 273
    const-wide/16 v22, -0x1

    .line 274
    .line 275
    add-int/lit8 v4, v2, 0x5

    .line 276
    .line 277
    aget-byte v4, v1, v4

    .line 278
    .line 279
    int-to-long v8, v4

    .line 280
    shl-long/2addr v8, v15

    .line 281
    add-int/lit8 v4, v2, 0x4

    .line 282
    .line 283
    aget-byte v4, v1, v4

    .line 284
    .line 285
    int-to-long v10, v4

    .line 286
    and-long v10, v10, v16

    .line 287
    .line 288
    shl-long/2addr v10, v7

    .line 289
    add-long/2addr v8, v10

    .line 290
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 291
    .line 292
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 293
    .line 294
    int-to-long v12, v2

    .line 295
    add-long/2addr v12, v10

    .line 296
    invoke-virtual {v4, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    int-to-long v12, v2

    .line 301
    and-long v12, v12, v19

    .line 302
    .line 303
    add-long/2addr v8, v12

    .line 304
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 305
    .line 306
    int-to-long v12, v2

    .line 307
    add-long/2addr v10, v12

    .line 308
    const-wide/16 v12, 0x6

    .line 309
    .line 310
    add-long/2addr v10, v12

    .line 311
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v10

    .line 315
    goto :goto_2

    .line 316
    :pswitch_3
    move/from16 v18, v8

    .line 317
    .line 318
    const-wide v19, 0xffffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    const/16 v21, 0x10

    .line 324
    .line 325
    const-wide/16 v22, -0x1

    .line 326
    .line 327
    add-int/lit8 v4, v2, 0x4

    .line 328
    .line 329
    aget-byte v4, v1, v4

    .line 330
    .line 331
    int-to-long v8, v4

    .line 332
    shl-long/2addr v8, v7

    .line 333
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 334
    .line 335
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 336
    .line 337
    int-to-long v12, v2

    .line 338
    add-long/2addr v12, v10

    .line 339
    invoke-virtual {v4, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    int-to-long v12, v2

    .line 344
    and-long v12, v12, v19

    .line 345
    .line 346
    add-long/2addr v8, v12

    .line 347
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 348
    .line 349
    int-to-long v12, v2

    .line 350
    add-long/2addr v10, v12

    .line 351
    const-wide/16 v12, 0x5

    .line 352
    .line 353
    add-long/2addr v10, v12

    .line 354
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v10

    .line 358
    goto :goto_2

    .line 359
    :pswitch_4
    move/from16 v18, v8

    .line 360
    .line 361
    const/16 v21, 0x10

    .line 362
    .line 363
    const-wide/16 v22, -0x1

    .line 364
    .line 365
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 366
    .line 367
    sget-wide v8, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 368
    .line 369
    int-to-long v10, v2

    .line 370
    add-long/2addr v10, v8

    .line 371
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    int-to-long v10, v2

    .line 376
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 377
    .line 378
    int-to-long v12, v2

    .line 379
    add-long/2addr v8, v12

    .line 380
    const-wide/16 v12, 0x4

    .line 381
    .line 382
    add-long/2addr v8, v12

    .line 383
    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 384
    .line 385
    .line 386
    move-result-wide v8

    .line 387
    :goto_3
    move-wide v14, v8

    .line 388
    move-wide v12, v10

    .line 389
    goto/16 :goto_a

    .line 390
    .line 391
    :pswitch_5
    move/from16 v18, v8

    .line 392
    .line 393
    const/16 v21, 0x10

    .line 394
    .line 395
    const-wide/16 v22, -0x1

    .line 396
    .line 397
    aget-byte v4, v1, v2

    .line 398
    .line 399
    shl-int/lit8 v4, v4, 0x10

    .line 400
    .line 401
    int-to-long v8, v4

    .line 402
    add-int/lit8 v4, v2, 0x1

    .line 403
    .line 404
    aget-byte v4, v1, v4

    .line 405
    .line 406
    int-to-long v10, v4

    .line 407
    and-long v10, v10, v16

    .line 408
    .line 409
    shl-long v10, v10, v18

    .line 410
    .line 411
    add-long/2addr v8, v10

    .line 412
    add-int/lit8 v4, v2, 0x2

    .line 413
    .line 414
    aget-byte v4, v1, v4

    .line 415
    .line 416
    int-to-long v10, v4

    .line 417
    and-long v10, v10, v16

    .line 418
    .line 419
    add-long/2addr v8, v10

    .line 420
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 421
    .line 422
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 423
    .line 424
    int-to-long v12, v2

    .line 425
    add-long/2addr v10, v12

    .line 426
    const-wide/16 v12, 0x3

    .line 427
    .line 428
    add-long/2addr v10, v12

    .line 429
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 430
    .line 431
    .line 432
    move-result-wide v10

    .line 433
    goto/16 :goto_2

    .line 434
    .line 435
    :pswitch_6
    move/from16 v18, v8

    .line 436
    .line 437
    const/16 v21, 0x10

    .line 438
    .line 439
    const-wide/16 v22, -0x1

    .line 440
    .line 441
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 442
    .line 443
    sget-wide v8, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 444
    .line 445
    int-to-long v10, v2

    .line 446
    add-long/2addr v10, v8

    .line 447
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    int-to-long v10, v2

    .line 452
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 453
    .line 454
    int-to-long v12, v2

    .line 455
    add-long/2addr v8, v12

    .line 456
    const-wide/16 v12, 0x2

    .line 457
    .line 458
    add-long/2addr v8, v12

    .line 459
    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 460
    .line 461
    .line 462
    move-result-wide v8

    .line 463
    goto :goto_3

    .line 464
    :pswitch_7
    move/from16 v18, v8

    .line 465
    .line 466
    const/16 v21, 0x10

    .line 467
    .line 468
    const-wide/16 v22, -0x1

    .line 469
    .line 470
    aget-byte v4, v1, v2

    .line 471
    .line 472
    int-to-long v8, v4

    .line 473
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 474
    .line 475
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 476
    .line 477
    int-to-long v12, v2

    .line 478
    add-long/2addr v10, v12

    .line 479
    const-wide/16 v12, 0x1

    .line 480
    .line 481
    add-long/2addr v10, v12

    .line 482
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 483
    .line 484
    .line 485
    move-result-wide v10

    .line 486
    goto/16 :goto_2

    .line 487
    .line 488
    :pswitch_8
    move/from16 v18, v8

    .line 489
    .line 490
    const/16 v21, 0x10

    .line 491
    .line 492
    const-wide/16 v22, -0x1

    .line 493
    .line 494
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 495
    .line 496
    sget-wide v8, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 497
    .line 498
    int-to-long v10, v2

    .line 499
    add-long/2addr v8, v10

    .line 500
    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 501
    .line 502
    .line 503
    move-result-wide v8

    .line 504
    :goto_4
    move-wide v12, v8

    .line 505
    move-wide/from16 v14, v22

    .line 506
    .line 507
    goto/16 :goto_a

    .line 508
    .line 509
    :pswitch_9
    move/from16 v18, v8

    .line 510
    .line 511
    const-wide v19, 0xffffffffL

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    const/16 v21, 0x10

    .line 517
    .line 518
    const-wide/16 v22, -0x1

    .line 519
    .line 520
    add-int/lit8 v4, v2, 0x6

    .line 521
    .line 522
    aget-byte v4, v1, v4

    .line 523
    .line 524
    int-to-long v8, v4

    .line 525
    shl-long/2addr v8, v11

    .line 526
    add-int/lit8 v4, v2, 0x5

    .line 527
    .line 528
    aget-byte v4, v1, v4

    .line 529
    .line 530
    int-to-long v10, v4

    .line 531
    and-long v10, v10, v16

    .line 532
    .line 533
    shl-long/2addr v10, v15

    .line 534
    add-long/2addr v8, v10

    .line 535
    add-int/lit8 v4, v2, 0x4

    .line 536
    .line 537
    aget-byte v4, v1, v4

    .line 538
    .line 539
    int-to-long v10, v4

    .line 540
    and-long v10, v10, v16

    .line 541
    .line 542
    shl-long/2addr v10, v7

    .line 543
    add-long/2addr v8, v10

    .line 544
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 545
    .line 546
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 547
    .line 548
    int-to-long v12, v2

    .line 549
    add-long/2addr v10, v12

    .line 550
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    :goto_5
    int-to-long v10, v2

    .line 555
    and-long v10, v10, v19

    .line 556
    .line 557
    :goto_6
    add-long/2addr v8, v10

    .line 558
    goto :goto_4

    .line 559
    :pswitch_a
    move/from16 v18, v8

    .line 560
    .line 561
    const-wide v19, 0xffffffffL

    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    const/16 v21, 0x10

    .line 567
    .line 568
    const-wide/16 v22, -0x1

    .line 569
    .line 570
    add-int/lit8 v4, v2, 0x5

    .line 571
    .line 572
    aget-byte v4, v1, v4

    .line 573
    .line 574
    int-to-long v8, v4

    .line 575
    shl-long/2addr v8, v15

    .line 576
    add-int/lit8 v4, v2, 0x4

    .line 577
    .line 578
    aget-byte v4, v1, v4

    .line 579
    .line 580
    int-to-long v10, v4

    .line 581
    and-long v10, v10, v16

    .line 582
    .line 583
    shl-long/2addr v10, v7

    .line 584
    add-long/2addr v8, v10

    .line 585
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 586
    .line 587
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 588
    .line 589
    int-to-long v12, v2

    .line 590
    add-long/2addr v10, v12

    .line 591
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    goto :goto_5

    .line 596
    :pswitch_b
    move/from16 v18, v8

    .line 597
    .line 598
    const-wide v19, 0xffffffffL

    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    const/16 v21, 0x10

    .line 604
    .line 605
    const-wide/16 v22, -0x1

    .line 606
    .line 607
    add-int/lit8 v4, v2, 0x4

    .line 608
    .line 609
    aget-byte v4, v1, v4

    .line 610
    .line 611
    int-to-long v8, v4

    .line 612
    shl-long/2addr v8, v7

    .line 613
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 614
    .line 615
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 616
    .line 617
    int-to-long v12, v2

    .line 618
    add-long/2addr v10, v12

    .line 619
    invoke-virtual {v4, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    goto :goto_5

    .line 624
    :pswitch_c
    move/from16 v18, v8

    .line 625
    .line 626
    const/16 v21, 0x10

    .line 627
    .line 628
    const-wide/16 v22, -0x1

    .line 629
    .line 630
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 631
    .line 632
    sget-wide v8, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 633
    .line 634
    int-to-long v10, v2

    .line 635
    add-long/2addr v8, v10

    .line 636
    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    int-to-long v8, v2

    .line 641
    goto/16 :goto_4

    .line 642
    .line 643
    :pswitch_d
    move/from16 v18, v8

    .line 644
    .line 645
    const/16 v21, 0x10

    .line 646
    .line 647
    const-wide/16 v22, -0x1

    .line 648
    .line 649
    add-int/lit8 v4, v2, 0x2

    .line 650
    .line 651
    aget-byte v4, v1, v4

    .line 652
    .line 653
    shl-int/lit8 v4, v4, 0x10

    .line 654
    .line 655
    int-to-long v8, v4

    .line 656
    add-int/lit8 v4, v2, 0x1

    .line 657
    .line 658
    aget-byte v4, v1, v4

    .line 659
    .line 660
    int-to-long v10, v4

    .line 661
    and-long v10, v10, v16

    .line 662
    .line 663
    shl-long v10, v10, v18

    .line 664
    .line 665
    add-long/2addr v8, v10

    .line 666
    aget-byte v2, v1, v2

    .line 667
    .line 668
    :goto_7
    int-to-long v10, v2

    .line 669
    and-long v10, v10, v16

    .line 670
    .line 671
    goto :goto_6

    .line 672
    :pswitch_e
    move/from16 v18, v8

    .line 673
    .line 674
    const/16 v21, 0x10

    .line 675
    .line 676
    const-wide/16 v22, -0x1

    .line 677
    .line 678
    add-int/lit8 v4, v2, 0x1

    .line 679
    .line 680
    aget-byte v4, v1, v4

    .line 681
    .line 682
    int-to-long v8, v4

    .line 683
    and-long v8, v8, v16

    .line 684
    .line 685
    shl-long v8, v8, v18

    .line 686
    .line 687
    aget-byte v2, v1, v2

    .line 688
    .line 689
    goto :goto_7

    .line 690
    :pswitch_f
    move/from16 v18, v8

    .line 691
    .line 692
    const/16 v21, 0x10

    .line 693
    .line 694
    const-wide/16 v22, -0x1

    .line 695
    .line 696
    aget-byte v2, v1, v2

    .line 697
    .line 698
    int-to-long v8, v2

    .line 699
    and-long v8, v8, v16

    .line 700
    .line 701
    goto/16 :goto_4

    .line 702
    .line 703
    :cond_7
    move/from16 v18, v8

    .line 704
    .line 705
    const/16 v21, 0x10

    .line 706
    .line 707
    const-wide/16 v22, -0x1

    .line 708
    .line 709
    packed-switch v4, :pswitch_data_1

    .line 710
    .line 711
    .line 712
    :goto_8
    move-wide/from16 v12, v22

    .line 713
    .line 714
    move-wide v14, v12

    .line 715
    goto/16 :goto_a

    .line 716
    .line 717
    :pswitch_10
    add-int/lit8 v4, v2, 0x7

    .line 718
    .line 719
    aget-byte v4, v1, v4

    .line 720
    .line 721
    int-to-long v12, v4

    .line 722
    shl-long/2addr v12, v10

    .line 723
    add-int/lit8 v4, v2, 0x6

    .line 724
    .line 725
    aget-byte v4, v1, v4

    .line 726
    .line 727
    shl-int/2addr v4, v11

    .line 728
    const/16 v14, 0x18

    .line 729
    .line 730
    int-to-long v8, v4

    .line 731
    add-long/2addr v12, v8

    .line 732
    add-int/lit8 v4, v2, 0x5

    .line 733
    .line 734
    aget-byte v4, v1, v4

    .line 735
    .line 736
    int-to-long v8, v4

    .line 737
    and-long v8, v8, v16

    .line 738
    .line 739
    shl-long/2addr v8, v15

    .line 740
    add-long/2addr v12, v8

    .line 741
    add-int/lit8 v4, v2, 0x4

    .line 742
    .line 743
    aget-byte v4, v1, v4

    .line 744
    .line 745
    int-to-long v8, v4

    .line 746
    and-long v8, v8, v16

    .line 747
    .line 748
    shl-long/2addr v8, v7

    .line 749
    add-long/2addr v12, v8

    .line 750
    add-int/lit8 v4, v2, 0x3

    .line 751
    .line 752
    aget-byte v4, v1, v4

    .line 753
    .line 754
    int-to-long v8, v4

    .line 755
    and-long v8, v8, v16

    .line 756
    .line 757
    shl-long/2addr v8, v14

    .line 758
    add-long/2addr v12, v8

    .line 759
    add-int/lit8 v4, v2, 0x2

    .line 760
    .line 761
    aget-byte v4, v1, v4

    .line 762
    .line 763
    int-to-long v8, v4

    .line 764
    and-long v8, v8, v16

    .line 765
    .line 766
    shl-long v8, v8, v21

    .line 767
    .line 768
    add-long/2addr v12, v8

    .line 769
    add-int/lit8 v4, v2, 0x1

    .line 770
    .line 771
    aget-byte v4, v1, v4

    .line 772
    .line 773
    int-to-long v8, v4

    .line 774
    and-long v8, v8, v16

    .line 775
    .line 776
    shl-long v8, v8, v18

    .line 777
    .line 778
    add-long/2addr v12, v8

    .line 779
    aget-byte v4, v1, v2

    .line 780
    .line 781
    int-to-long v8, v4

    .line 782
    and-long v8, v8, v16

    .line 783
    .line 784
    add-long/2addr v8, v12

    .line 785
    add-int/lit8 v4, v2, 0xf

    .line 786
    .line 787
    aget-byte v4, v1, v4

    .line 788
    .line 789
    int-to-long v12, v4

    .line 790
    shl-long/2addr v12, v10

    .line 791
    add-int/lit8 v4, v2, 0xe

    .line 792
    .line 793
    aget-byte v4, v1, v4

    .line 794
    .line 795
    move/from16 v20, v14

    .line 796
    .line 797
    move/from16 v19, v15

    .line 798
    .line 799
    int-to-long v14, v4

    .line 800
    and-long v14, v14, v16

    .line 801
    .line 802
    shl-long v10, v14, v11

    .line 803
    .line 804
    add-long/2addr v12, v10

    .line 805
    add-int/lit8 v4, v2, 0xd

    .line 806
    .line 807
    aget-byte v4, v1, v4

    .line 808
    .line 809
    int-to-long v10, v4

    .line 810
    and-long v10, v10, v16

    .line 811
    .line 812
    shl-long v10, v10, v19

    .line 813
    .line 814
    add-long/2addr v12, v10

    .line 815
    add-int/lit8 v4, v2, 0xc

    .line 816
    .line 817
    aget-byte v4, v1, v4

    .line 818
    .line 819
    int-to-long v10, v4

    .line 820
    and-long v10, v10, v16

    .line 821
    .line 822
    shl-long/2addr v10, v7

    .line 823
    add-long/2addr v12, v10

    .line 824
    add-int/lit8 v4, v2, 0xb

    .line 825
    .line 826
    aget-byte v4, v1, v4

    .line 827
    .line 828
    int-to-long v10, v4

    .line 829
    and-long v10, v10, v16

    .line 830
    .line 831
    shl-long v10, v10, v20

    .line 832
    .line 833
    add-long/2addr v12, v10

    .line 834
    add-int/lit8 v4, v2, 0xa

    .line 835
    .line 836
    aget-byte v4, v1, v4

    .line 837
    .line 838
    int-to-long v10, v4

    .line 839
    and-long v10, v10, v16

    .line 840
    .line 841
    shl-long v10, v10, v21

    .line 842
    .line 843
    add-long/2addr v12, v10

    .line 844
    add-int/lit8 v4, v2, 0x9

    .line 845
    .line 846
    aget-byte v4, v1, v4

    .line 847
    .line 848
    int-to-long v10, v4

    .line 849
    and-long v10, v10, v16

    .line 850
    .line 851
    shl-long v10, v10, v18

    .line 852
    .line 853
    add-long/2addr v12, v10

    .line 854
    add-int/lit8 v2, v2, 0x8

    .line 855
    .line 856
    aget-byte v2, v1, v2

    .line 857
    .line 858
    :goto_9
    int-to-long v10, v2

    .line 859
    and-long v10, v10, v16

    .line 860
    .line 861
    add-long/2addr v10, v12

    .line 862
    goto/16 :goto_2

    .line 863
    .line 864
    :pswitch_11
    move/from16 v19, v15

    .line 865
    .line 866
    const/16 v20, 0x18

    .line 867
    .line 868
    add-int/lit8 v4, v2, 0x6

    .line 869
    .line 870
    aget-byte v4, v1, v4

    .line 871
    .line 872
    int-to-long v8, v4

    .line 873
    shl-long/2addr v8, v11

    .line 874
    add-int/lit8 v4, v2, 0x5

    .line 875
    .line 876
    aget-byte v4, v1, v4

    .line 877
    .line 878
    int-to-long v12, v4

    .line 879
    and-long v12, v12, v16

    .line 880
    .line 881
    shl-long v12, v12, v19

    .line 882
    .line 883
    add-long/2addr v8, v12

    .line 884
    add-int/lit8 v4, v2, 0x4

    .line 885
    .line 886
    aget-byte v4, v1, v4

    .line 887
    .line 888
    int-to-long v12, v4

    .line 889
    and-long v12, v12, v16

    .line 890
    .line 891
    shl-long/2addr v12, v7

    .line 892
    add-long/2addr v8, v12

    .line 893
    add-int/lit8 v4, v2, 0x3

    .line 894
    .line 895
    aget-byte v4, v1, v4

    .line 896
    .line 897
    int-to-long v12, v4

    .line 898
    and-long v12, v12, v16

    .line 899
    .line 900
    shl-long v12, v12, v20

    .line 901
    .line 902
    add-long/2addr v8, v12

    .line 903
    add-int/lit8 v4, v2, 0x2

    .line 904
    .line 905
    aget-byte v4, v1, v4

    .line 906
    .line 907
    int-to-long v12, v4

    .line 908
    and-long v12, v12, v16

    .line 909
    .line 910
    shl-long v12, v12, v21

    .line 911
    .line 912
    add-long/2addr v8, v12

    .line 913
    add-int/lit8 v4, v2, 0x1

    .line 914
    .line 915
    aget-byte v4, v1, v4

    .line 916
    .line 917
    int-to-long v12, v4

    .line 918
    and-long v12, v12, v16

    .line 919
    .line 920
    shl-long v12, v12, v18

    .line 921
    .line 922
    add-long/2addr v8, v12

    .line 923
    aget-byte v4, v1, v2

    .line 924
    .line 925
    int-to-long v12, v4

    .line 926
    and-long v12, v12, v16

    .line 927
    .line 928
    add-long/2addr v8, v12

    .line 929
    add-int/lit8 v4, v2, 0xe

    .line 930
    .line 931
    aget-byte v4, v1, v4

    .line 932
    .line 933
    int-to-long v12, v4

    .line 934
    shl-long/2addr v12, v10

    .line 935
    add-int/lit8 v4, v2, 0xd

    .line 936
    .line 937
    aget-byte v4, v1, v4

    .line 938
    .line 939
    int-to-long v14, v4

    .line 940
    and-long v14, v14, v16

    .line 941
    .line 942
    shl-long v10, v14, v11

    .line 943
    .line 944
    add-long/2addr v12, v10

    .line 945
    add-int/lit8 v4, v2, 0xc

    .line 946
    .line 947
    aget-byte v4, v1, v4

    .line 948
    .line 949
    int-to-long v10, v4

    .line 950
    and-long v10, v10, v16

    .line 951
    .line 952
    shl-long v10, v10, v19

    .line 953
    .line 954
    add-long/2addr v12, v10

    .line 955
    add-int/lit8 v4, v2, 0xb

    .line 956
    .line 957
    aget-byte v4, v1, v4

    .line 958
    .line 959
    int-to-long v10, v4

    .line 960
    and-long v10, v10, v16

    .line 961
    .line 962
    shl-long/2addr v10, v7

    .line 963
    add-long/2addr v12, v10

    .line 964
    add-int/lit8 v4, v2, 0xa

    .line 965
    .line 966
    aget-byte v4, v1, v4

    .line 967
    .line 968
    int-to-long v10, v4

    .line 969
    and-long v10, v10, v16

    .line 970
    .line 971
    shl-long v10, v10, v20

    .line 972
    .line 973
    add-long/2addr v12, v10

    .line 974
    add-int/lit8 v4, v2, 0x9

    .line 975
    .line 976
    aget-byte v4, v1, v4

    .line 977
    .line 978
    int-to-long v10, v4

    .line 979
    and-long v10, v10, v16

    .line 980
    .line 981
    shl-long v10, v10, v21

    .line 982
    .line 983
    add-long/2addr v12, v10

    .line 984
    add-int/lit8 v4, v2, 0x8

    .line 985
    .line 986
    aget-byte v4, v1, v4

    .line 987
    .line 988
    int-to-long v10, v4

    .line 989
    and-long v10, v10, v16

    .line 990
    .line 991
    shl-long v10, v10, v18

    .line 992
    .line 993
    add-long/2addr v12, v10

    .line 994
    add-int/lit8 v2, v2, 0x7

    .line 995
    .line 996
    aget-byte v2, v1, v2

    .line 997
    .line 998
    goto/16 :goto_9

    .line 999
    .line 1000
    :pswitch_12
    move/from16 v19, v15

    .line 1001
    .line 1002
    const/16 v20, 0x18

    .line 1003
    .line 1004
    add-int/lit8 v4, v2, 0x5

    .line 1005
    .line 1006
    aget-byte v4, v1, v4

    .line 1007
    .line 1008
    int-to-long v8, v4

    .line 1009
    shl-long v8, v8, v19

    .line 1010
    .line 1011
    add-int/lit8 v4, v2, 0x4

    .line 1012
    .line 1013
    aget-byte v4, v1, v4

    .line 1014
    .line 1015
    int-to-long v12, v4

    .line 1016
    and-long v12, v12, v16

    .line 1017
    .line 1018
    shl-long/2addr v12, v7

    .line 1019
    add-long/2addr v8, v12

    .line 1020
    add-int/lit8 v4, v2, 0x3

    .line 1021
    .line 1022
    aget-byte v4, v1, v4

    .line 1023
    .line 1024
    int-to-long v12, v4

    .line 1025
    and-long v12, v12, v16

    .line 1026
    .line 1027
    shl-long v12, v12, v20

    .line 1028
    .line 1029
    add-long/2addr v8, v12

    .line 1030
    add-int/lit8 v4, v2, 0x2

    .line 1031
    .line 1032
    aget-byte v4, v1, v4

    .line 1033
    .line 1034
    int-to-long v12, v4

    .line 1035
    and-long v12, v12, v16

    .line 1036
    .line 1037
    shl-long v12, v12, v21

    .line 1038
    .line 1039
    add-long/2addr v8, v12

    .line 1040
    add-int/lit8 v4, v2, 0x1

    .line 1041
    .line 1042
    aget-byte v4, v1, v4

    .line 1043
    .line 1044
    int-to-long v12, v4

    .line 1045
    and-long v12, v12, v16

    .line 1046
    .line 1047
    shl-long v12, v12, v18

    .line 1048
    .line 1049
    add-long/2addr v8, v12

    .line 1050
    aget-byte v4, v1, v2

    .line 1051
    .line 1052
    int-to-long v12, v4

    .line 1053
    and-long v12, v12, v16

    .line 1054
    .line 1055
    add-long/2addr v8, v12

    .line 1056
    add-int/lit8 v4, v2, 0xd

    .line 1057
    .line 1058
    aget-byte v4, v1, v4

    .line 1059
    .line 1060
    int-to-long v12, v4

    .line 1061
    shl-long/2addr v12, v10

    .line 1062
    add-int/lit8 v4, v2, 0xc

    .line 1063
    .line 1064
    aget-byte v4, v1, v4

    .line 1065
    .line 1066
    int-to-long v14, v4

    .line 1067
    and-long v14, v14, v16

    .line 1068
    .line 1069
    shl-long v10, v14, v11

    .line 1070
    .line 1071
    add-long/2addr v12, v10

    .line 1072
    add-int/lit8 v4, v2, 0xb

    .line 1073
    .line 1074
    aget-byte v4, v1, v4

    .line 1075
    .line 1076
    int-to-long v10, v4

    .line 1077
    and-long v10, v10, v16

    .line 1078
    .line 1079
    shl-long v10, v10, v19

    .line 1080
    .line 1081
    add-long/2addr v12, v10

    .line 1082
    add-int/lit8 v4, v2, 0xa

    .line 1083
    .line 1084
    aget-byte v4, v1, v4

    .line 1085
    .line 1086
    int-to-long v10, v4

    .line 1087
    and-long v10, v10, v16

    .line 1088
    .line 1089
    shl-long/2addr v10, v7

    .line 1090
    add-long/2addr v12, v10

    .line 1091
    add-int/lit8 v4, v2, 0x9

    .line 1092
    .line 1093
    aget-byte v4, v1, v4

    .line 1094
    .line 1095
    int-to-long v10, v4

    .line 1096
    and-long v10, v10, v16

    .line 1097
    .line 1098
    shl-long v10, v10, v20

    .line 1099
    .line 1100
    add-long/2addr v12, v10

    .line 1101
    add-int/lit8 v4, v2, 0x8

    .line 1102
    .line 1103
    aget-byte v4, v1, v4

    .line 1104
    .line 1105
    int-to-long v10, v4

    .line 1106
    and-long v10, v10, v16

    .line 1107
    .line 1108
    shl-long v10, v10, v21

    .line 1109
    .line 1110
    add-long/2addr v12, v10

    .line 1111
    add-int/lit8 v4, v2, 0x7

    .line 1112
    .line 1113
    aget-byte v4, v1, v4

    .line 1114
    .line 1115
    int-to-long v10, v4

    .line 1116
    and-long v10, v10, v16

    .line 1117
    .line 1118
    shl-long v10, v10, v18

    .line 1119
    .line 1120
    add-long/2addr v12, v10

    .line 1121
    add-int/lit8 v2, v2, 0x6

    .line 1122
    .line 1123
    aget-byte v2, v1, v2

    .line 1124
    .line 1125
    goto/16 :goto_9

    .line 1126
    .line 1127
    :pswitch_13
    move/from16 v19, v15

    .line 1128
    .line 1129
    const/16 v20, 0x18

    .line 1130
    .line 1131
    add-int/lit8 v4, v2, 0x4

    .line 1132
    .line 1133
    aget-byte v4, v1, v4

    .line 1134
    .line 1135
    int-to-long v8, v4

    .line 1136
    shl-long/2addr v8, v7

    .line 1137
    add-int/lit8 v4, v2, 0x3

    .line 1138
    .line 1139
    aget-byte v4, v1, v4

    .line 1140
    .line 1141
    int-to-long v12, v4

    .line 1142
    and-long v12, v12, v16

    .line 1143
    .line 1144
    shl-long v12, v12, v20

    .line 1145
    .line 1146
    add-long/2addr v8, v12

    .line 1147
    add-int/lit8 v4, v2, 0x2

    .line 1148
    .line 1149
    aget-byte v4, v1, v4

    .line 1150
    .line 1151
    int-to-long v12, v4

    .line 1152
    and-long v12, v12, v16

    .line 1153
    .line 1154
    shl-long v12, v12, v21

    .line 1155
    .line 1156
    add-long/2addr v8, v12

    .line 1157
    add-int/lit8 v4, v2, 0x1

    .line 1158
    .line 1159
    aget-byte v4, v1, v4

    .line 1160
    .line 1161
    int-to-long v12, v4

    .line 1162
    and-long v12, v12, v16

    .line 1163
    .line 1164
    shl-long v12, v12, v18

    .line 1165
    .line 1166
    add-long/2addr v8, v12

    .line 1167
    aget-byte v4, v1, v2

    .line 1168
    .line 1169
    int-to-long v12, v4

    .line 1170
    and-long v12, v12, v16

    .line 1171
    .line 1172
    add-long/2addr v8, v12

    .line 1173
    add-int/lit8 v4, v2, 0xc

    .line 1174
    .line 1175
    aget-byte v4, v1, v4

    .line 1176
    .line 1177
    int-to-long v12, v4

    .line 1178
    shl-long/2addr v12, v10

    .line 1179
    add-int/lit8 v4, v2, 0xb

    .line 1180
    .line 1181
    aget-byte v4, v1, v4

    .line 1182
    .line 1183
    int-to-long v14, v4

    .line 1184
    and-long v14, v14, v16

    .line 1185
    .line 1186
    shl-long v10, v14, v11

    .line 1187
    .line 1188
    add-long/2addr v12, v10

    .line 1189
    add-int/lit8 v4, v2, 0xa

    .line 1190
    .line 1191
    aget-byte v4, v1, v4

    .line 1192
    .line 1193
    int-to-long v10, v4

    .line 1194
    and-long v10, v10, v16

    .line 1195
    .line 1196
    shl-long v10, v10, v19

    .line 1197
    .line 1198
    add-long/2addr v12, v10

    .line 1199
    add-int/lit8 v4, v2, 0x9

    .line 1200
    .line 1201
    aget-byte v4, v1, v4

    .line 1202
    .line 1203
    int-to-long v10, v4

    .line 1204
    and-long v10, v10, v16

    .line 1205
    .line 1206
    shl-long/2addr v10, v7

    .line 1207
    add-long/2addr v12, v10

    .line 1208
    add-int/lit8 v4, v2, 0x8

    .line 1209
    .line 1210
    aget-byte v4, v1, v4

    .line 1211
    .line 1212
    int-to-long v10, v4

    .line 1213
    and-long v10, v10, v16

    .line 1214
    .line 1215
    shl-long v10, v10, v20

    .line 1216
    .line 1217
    add-long/2addr v12, v10

    .line 1218
    add-int/lit8 v4, v2, 0x7

    .line 1219
    .line 1220
    aget-byte v4, v1, v4

    .line 1221
    .line 1222
    int-to-long v10, v4

    .line 1223
    and-long v10, v10, v16

    .line 1224
    .line 1225
    shl-long v10, v10, v21

    .line 1226
    .line 1227
    add-long/2addr v12, v10

    .line 1228
    add-int/lit8 v4, v2, 0x6

    .line 1229
    .line 1230
    aget-byte v4, v1, v4

    .line 1231
    .line 1232
    int-to-long v10, v4

    .line 1233
    and-long v10, v10, v16

    .line 1234
    .line 1235
    shl-long v10, v10, v18

    .line 1236
    .line 1237
    add-long/2addr v12, v10

    .line 1238
    add-int/lit8 v2, v2, 0x5

    .line 1239
    .line 1240
    aget-byte v2, v1, v2

    .line 1241
    .line 1242
    goto/16 :goto_9

    .line 1243
    .line 1244
    :pswitch_14
    move/from16 v19, v15

    .line 1245
    .line 1246
    const/16 v20, 0x18

    .line 1247
    .line 1248
    add-int/lit8 v4, v2, 0x3

    .line 1249
    .line 1250
    aget-byte v4, v1, v4

    .line 1251
    .line 1252
    shl-int/lit8 v4, v4, 0x18

    .line 1253
    .line 1254
    int-to-long v8, v4

    .line 1255
    add-int/lit8 v4, v2, 0x2

    .line 1256
    .line 1257
    aget-byte v4, v1, v4

    .line 1258
    .line 1259
    int-to-long v12, v4

    .line 1260
    and-long v12, v12, v16

    .line 1261
    .line 1262
    shl-long v12, v12, v21

    .line 1263
    .line 1264
    add-long/2addr v8, v12

    .line 1265
    add-int/lit8 v4, v2, 0x1

    .line 1266
    .line 1267
    aget-byte v4, v1, v4

    .line 1268
    .line 1269
    int-to-long v12, v4

    .line 1270
    and-long v12, v12, v16

    .line 1271
    .line 1272
    shl-long v12, v12, v18

    .line 1273
    .line 1274
    add-long/2addr v8, v12

    .line 1275
    aget-byte v4, v1, v2

    .line 1276
    .line 1277
    int-to-long v12, v4

    .line 1278
    and-long v12, v12, v16

    .line 1279
    .line 1280
    add-long/2addr v8, v12

    .line 1281
    add-int/lit8 v4, v2, 0xb

    .line 1282
    .line 1283
    aget-byte v4, v1, v4

    .line 1284
    .line 1285
    int-to-long v12, v4

    .line 1286
    shl-long/2addr v12, v10

    .line 1287
    add-int/lit8 v4, v2, 0xa

    .line 1288
    .line 1289
    aget-byte v4, v1, v4

    .line 1290
    .line 1291
    int-to-long v14, v4

    .line 1292
    and-long v14, v14, v16

    .line 1293
    .line 1294
    shl-long v10, v14, v11

    .line 1295
    .line 1296
    add-long/2addr v12, v10

    .line 1297
    add-int/lit8 v4, v2, 0x9

    .line 1298
    .line 1299
    aget-byte v4, v1, v4

    .line 1300
    .line 1301
    int-to-long v10, v4

    .line 1302
    and-long v10, v10, v16

    .line 1303
    .line 1304
    shl-long v10, v10, v19

    .line 1305
    .line 1306
    add-long/2addr v12, v10

    .line 1307
    add-int/lit8 v4, v2, 0x8

    .line 1308
    .line 1309
    aget-byte v4, v1, v4

    .line 1310
    .line 1311
    int-to-long v10, v4

    .line 1312
    and-long v10, v10, v16

    .line 1313
    .line 1314
    shl-long/2addr v10, v7

    .line 1315
    add-long/2addr v12, v10

    .line 1316
    add-int/lit8 v4, v2, 0x7

    .line 1317
    .line 1318
    aget-byte v4, v1, v4

    .line 1319
    .line 1320
    int-to-long v10, v4

    .line 1321
    and-long v10, v10, v16

    .line 1322
    .line 1323
    shl-long v10, v10, v20

    .line 1324
    .line 1325
    add-long/2addr v12, v10

    .line 1326
    add-int/lit8 v4, v2, 0x6

    .line 1327
    .line 1328
    aget-byte v4, v1, v4

    .line 1329
    .line 1330
    int-to-long v10, v4

    .line 1331
    and-long v10, v10, v16

    .line 1332
    .line 1333
    shl-long v10, v10, v21

    .line 1334
    .line 1335
    add-long/2addr v12, v10

    .line 1336
    add-int/lit8 v4, v2, 0x5

    .line 1337
    .line 1338
    aget-byte v4, v1, v4

    .line 1339
    .line 1340
    int-to-long v10, v4

    .line 1341
    and-long v10, v10, v16

    .line 1342
    .line 1343
    shl-long v10, v10, v18

    .line 1344
    .line 1345
    add-long/2addr v12, v10

    .line 1346
    add-int/lit8 v2, v2, 0x4

    .line 1347
    .line 1348
    aget-byte v2, v1, v2

    .line 1349
    .line 1350
    goto/16 :goto_9

    .line 1351
    .line 1352
    :pswitch_15
    move/from16 v19, v15

    .line 1353
    .line 1354
    const/16 v20, 0x18

    .line 1355
    .line 1356
    add-int/lit8 v4, v2, 0x2

    .line 1357
    .line 1358
    aget-byte v4, v1, v4

    .line 1359
    .line 1360
    shl-int/lit8 v4, v4, 0x10

    .line 1361
    .line 1362
    int-to-long v8, v4

    .line 1363
    add-int/lit8 v4, v2, 0x1

    .line 1364
    .line 1365
    aget-byte v4, v1, v4

    .line 1366
    .line 1367
    int-to-long v12, v4

    .line 1368
    and-long v12, v12, v16

    .line 1369
    .line 1370
    shl-long v12, v12, v18

    .line 1371
    .line 1372
    add-long/2addr v8, v12

    .line 1373
    aget-byte v4, v1, v2

    .line 1374
    .line 1375
    int-to-long v12, v4

    .line 1376
    and-long v12, v12, v16

    .line 1377
    .line 1378
    add-long/2addr v8, v12

    .line 1379
    add-int/lit8 v4, v2, 0xa

    .line 1380
    .line 1381
    aget-byte v4, v1, v4

    .line 1382
    .line 1383
    int-to-long v12, v4

    .line 1384
    shl-long/2addr v12, v10

    .line 1385
    add-int/lit8 v4, v2, 0x9

    .line 1386
    .line 1387
    aget-byte v4, v1, v4

    .line 1388
    .line 1389
    int-to-long v14, v4

    .line 1390
    and-long v14, v14, v16

    .line 1391
    .line 1392
    shl-long v10, v14, v11

    .line 1393
    .line 1394
    add-long/2addr v12, v10

    .line 1395
    add-int/lit8 v4, v2, 0x8

    .line 1396
    .line 1397
    aget-byte v4, v1, v4

    .line 1398
    .line 1399
    int-to-long v10, v4

    .line 1400
    and-long v10, v10, v16

    .line 1401
    .line 1402
    shl-long v10, v10, v19

    .line 1403
    .line 1404
    add-long/2addr v12, v10

    .line 1405
    add-int/lit8 v4, v2, 0x7

    .line 1406
    .line 1407
    aget-byte v4, v1, v4

    .line 1408
    .line 1409
    int-to-long v10, v4

    .line 1410
    and-long v10, v10, v16

    .line 1411
    .line 1412
    shl-long/2addr v10, v7

    .line 1413
    add-long/2addr v12, v10

    .line 1414
    add-int/lit8 v4, v2, 0x6

    .line 1415
    .line 1416
    aget-byte v4, v1, v4

    .line 1417
    .line 1418
    int-to-long v10, v4

    .line 1419
    and-long v10, v10, v16

    .line 1420
    .line 1421
    shl-long v10, v10, v20

    .line 1422
    .line 1423
    add-long/2addr v12, v10

    .line 1424
    add-int/lit8 v4, v2, 0x5

    .line 1425
    .line 1426
    aget-byte v4, v1, v4

    .line 1427
    .line 1428
    int-to-long v10, v4

    .line 1429
    and-long v10, v10, v16

    .line 1430
    .line 1431
    shl-long v10, v10, v21

    .line 1432
    .line 1433
    add-long/2addr v12, v10

    .line 1434
    add-int/lit8 v4, v2, 0x4

    .line 1435
    .line 1436
    aget-byte v4, v1, v4

    .line 1437
    .line 1438
    int-to-long v10, v4

    .line 1439
    and-long v10, v10, v16

    .line 1440
    .line 1441
    shl-long v10, v10, v18

    .line 1442
    .line 1443
    add-long/2addr v12, v10

    .line 1444
    add-int/lit8 v2, v2, 0x3

    .line 1445
    .line 1446
    aget-byte v2, v1, v2

    .line 1447
    .line 1448
    goto/16 :goto_9

    .line 1449
    .line 1450
    :pswitch_16
    move/from16 v19, v15

    .line 1451
    .line 1452
    const/16 v20, 0x18

    .line 1453
    .line 1454
    add-int/lit8 v4, v2, 0x1

    .line 1455
    .line 1456
    aget-byte v4, v1, v4

    .line 1457
    .line 1458
    shl-int/lit8 v4, v4, 0x8

    .line 1459
    .line 1460
    int-to-long v8, v4

    .line 1461
    aget-byte v4, v1, v2

    .line 1462
    .line 1463
    int-to-long v12, v4

    .line 1464
    and-long v12, v12, v16

    .line 1465
    .line 1466
    add-long/2addr v8, v12

    .line 1467
    add-int/lit8 v4, v2, 0x9

    .line 1468
    .line 1469
    aget-byte v4, v1, v4

    .line 1470
    .line 1471
    int-to-long v12, v4

    .line 1472
    shl-long/2addr v12, v10

    .line 1473
    add-int/lit8 v4, v2, 0x8

    .line 1474
    .line 1475
    aget-byte v4, v1, v4

    .line 1476
    .line 1477
    int-to-long v14, v4

    .line 1478
    and-long v14, v14, v16

    .line 1479
    .line 1480
    shl-long v10, v14, v11

    .line 1481
    .line 1482
    add-long/2addr v12, v10

    .line 1483
    add-int/lit8 v4, v2, 0x7

    .line 1484
    .line 1485
    aget-byte v4, v1, v4

    .line 1486
    .line 1487
    int-to-long v10, v4

    .line 1488
    and-long v10, v10, v16

    .line 1489
    .line 1490
    shl-long v10, v10, v19

    .line 1491
    .line 1492
    add-long/2addr v12, v10

    .line 1493
    add-int/lit8 v4, v2, 0x6

    .line 1494
    .line 1495
    aget-byte v4, v1, v4

    .line 1496
    .line 1497
    int-to-long v10, v4

    .line 1498
    and-long v10, v10, v16

    .line 1499
    .line 1500
    shl-long/2addr v10, v7

    .line 1501
    add-long/2addr v12, v10

    .line 1502
    add-int/lit8 v4, v2, 0x5

    .line 1503
    .line 1504
    aget-byte v4, v1, v4

    .line 1505
    .line 1506
    int-to-long v10, v4

    .line 1507
    and-long v10, v10, v16

    .line 1508
    .line 1509
    shl-long v10, v10, v20

    .line 1510
    .line 1511
    add-long/2addr v12, v10

    .line 1512
    add-int/lit8 v4, v2, 0x4

    .line 1513
    .line 1514
    aget-byte v4, v1, v4

    .line 1515
    .line 1516
    int-to-long v10, v4

    .line 1517
    and-long v10, v10, v16

    .line 1518
    .line 1519
    shl-long v10, v10, v21

    .line 1520
    .line 1521
    add-long/2addr v12, v10

    .line 1522
    add-int/lit8 v4, v2, 0x3

    .line 1523
    .line 1524
    aget-byte v4, v1, v4

    .line 1525
    .line 1526
    int-to-long v10, v4

    .line 1527
    and-long v10, v10, v16

    .line 1528
    .line 1529
    shl-long v10, v10, v18

    .line 1530
    .line 1531
    add-long/2addr v12, v10

    .line 1532
    add-int/lit8 v2, v2, 0x2

    .line 1533
    .line 1534
    aget-byte v2, v1, v2

    .line 1535
    .line 1536
    goto/16 :goto_9

    .line 1537
    .line 1538
    :pswitch_17
    move/from16 v19, v15

    .line 1539
    .line 1540
    const/16 v20, 0x18

    .line 1541
    .line 1542
    aget-byte v4, v1, v2

    .line 1543
    .line 1544
    int-to-long v8, v4

    .line 1545
    add-int/lit8 v4, v2, 0x8

    .line 1546
    .line 1547
    aget-byte v4, v1, v4

    .line 1548
    .line 1549
    int-to-long v12, v4

    .line 1550
    shl-long/2addr v12, v10

    .line 1551
    add-int/lit8 v4, v2, 0x7

    .line 1552
    .line 1553
    aget-byte v4, v1, v4

    .line 1554
    .line 1555
    shl-int/2addr v4, v11

    .line 1556
    int-to-long v10, v4

    .line 1557
    add-long/2addr v12, v10

    .line 1558
    add-int/lit8 v4, v2, 0x6

    .line 1559
    .line 1560
    aget-byte v4, v1, v4

    .line 1561
    .line 1562
    int-to-long v10, v4

    .line 1563
    and-long v10, v10, v16

    .line 1564
    .line 1565
    shl-long v10, v10, v19

    .line 1566
    .line 1567
    add-long/2addr v12, v10

    .line 1568
    add-int/lit8 v4, v2, 0x5

    .line 1569
    .line 1570
    aget-byte v4, v1, v4

    .line 1571
    .line 1572
    int-to-long v10, v4

    .line 1573
    and-long v10, v10, v16

    .line 1574
    .line 1575
    shl-long/2addr v10, v7

    .line 1576
    add-long/2addr v12, v10

    .line 1577
    add-int/lit8 v4, v2, 0x4

    .line 1578
    .line 1579
    aget-byte v4, v1, v4

    .line 1580
    .line 1581
    int-to-long v10, v4

    .line 1582
    and-long v10, v10, v16

    .line 1583
    .line 1584
    shl-long v10, v10, v20

    .line 1585
    .line 1586
    add-long/2addr v12, v10

    .line 1587
    add-int/lit8 v4, v2, 0x3

    .line 1588
    .line 1589
    aget-byte v4, v1, v4

    .line 1590
    .line 1591
    int-to-long v10, v4

    .line 1592
    and-long v10, v10, v16

    .line 1593
    .line 1594
    shl-long v10, v10, v21

    .line 1595
    .line 1596
    add-long/2addr v12, v10

    .line 1597
    add-int/lit8 v4, v2, 0x2

    .line 1598
    .line 1599
    aget-byte v4, v1, v4

    .line 1600
    .line 1601
    int-to-long v10, v4

    .line 1602
    and-long v10, v10, v16

    .line 1603
    .line 1604
    shl-long v10, v10, v18

    .line 1605
    .line 1606
    add-long/2addr v12, v10

    .line 1607
    add-int/2addr v2, v6

    .line 1608
    aget-byte v2, v1, v2

    .line 1609
    .line 1610
    goto/16 :goto_9

    .line 1611
    .line 1612
    :pswitch_18
    move/from16 v19, v15

    .line 1613
    .line 1614
    const/16 v20, 0x18

    .line 1615
    .line 1616
    add-int/lit8 v4, v2, 0x7

    .line 1617
    .line 1618
    aget-byte v4, v1, v4

    .line 1619
    .line 1620
    int-to-long v8, v4

    .line 1621
    shl-long/2addr v8, v10

    .line 1622
    add-int/lit8 v4, v2, 0x6

    .line 1623
    .line 1624
    aget-byte v4, v1, v4

    .line 1625
    .line 1626
    int-to-long v12, v4

    .line 1627
    and-long v12, v12, v16

    .line 1628
    .line 1629
    shl-long v10, v12, v11

    .line 1630
    .line 1631
    add-long/2addr v8, v10

    .line 1632
    add-int/lit8 v4, v2, 0x5

    .line 1633
    .line 1634
    aget-byte v4, v1, v4

    .line 1635
    .line 1636
    int-to-long v10, v4

    .line 1637
    and-long v10, v10, v16

    .line 1638
    .line 1639
    shl-long v10, v10, v19

    .line 1640
    .line 1641
    add-long/2addr v8, v10

    .line 1642
    add-int/lit8 v4, v2, 0x4

    .line 1643
    .line 1644
    aget-byte v4, v1, v4

    .line 1645
    .line 1646
    int-to-long v10, v4

    .line 1647
    and-long v10, v10, v16

    .line 1648
    .line 1649
    shl-long/2addr v10, v7

    .line 1650
    add-long/2addr v8, v10

    .line 1651
    add-int/lit8 v4, v2, 0x3

    .line 1652
    .line 1653
    aget-byte v4, v1, v4

    .line 1654
    .line 1655
    int-to-long v10, v4

    .line 1656
    and-long v10, v10, v16

    .line 1657
    .line 1658
    shl-long v10, v10, v20

    .line 1659
    .line 1660
    add-long/2addr v8, v10

    .line 1661
    add-int/lit8 v4, v2, 0x2

    .line 1662
    .line 1663
    aget-byte v4, v1, v4

    .line 1664
    .line 1665
    int-to-long v10, v4

    .line 1666
    and-long v10, v10, v16

    .line 1667
    .line 1668
    shl-long v10, v10, v21

    .line 1669
    .line 1670
    add-long/2addr v8, v10

    .line 1671
    add-int/lit8 v4, v2, 0x1

    .line 1672
    .line 1673
    aget-byte v4, v1, v4

    .line 1674
    .line 1675
    int-to-long v10, v4

    .line 1676
    and-long v10, v10, v16

    .line 1677
    .line 1678
    shl-long v10, v10, v18

    .line 1679
    .line 1680
    add-long/2addr v8, v10

    .line 1681
    aget-byte v2, v1, v2

    .line 1682
    .line 1683
    goto/16 :goto_7

    .line 1684
    .line 1685
    :pswitch_19
    move/from16 v19, v15

    .line 1686
    .line 1687
    const/16 v20, 0x18

    .line 1688
    .line 1689
    add-int/lit8 v4, v2, 0x6

    .line 1690
    .line 1691
    aget-byte v4, v1, v4

    .line 1692
    .line 1693
    int-to-long v8, v4

    .line 1694
    shl-long/2addr v8, v11

    .line 1695
    add-int/lit8 v4, v2, 0x5

    .line 1696
    .line 1697
    aget-byte v4, v1, v4

    .line 1698
    .line 1699
    int-to-long v10, v4

    .line 1700
    and-long v10, v10, v16

    .line 1701
    .line 1702
    shl-long v10, v10, v19

    .line 1703
    .line 1704
    add-long/2addr v8, v10

    .line 1705
    add-int/lit8 v4, v2, 0x4

    .line 1706
    .line 1707
    aget-byte v4, v1, v4

    .line 1708
    .line 1709
    int-to-long v10, v4

    .line 1710
    and-long v10, v10, v16

    .line 1711
    .line 1712
    shl-long/2addr v10, v7

    .line 1713
    add-long/2addr v8, v10

    .line 1714
    add-int/lit8 v4, v2, 0x4

    .line 1715
    .line 1716
    aget-byte v4, v1, v4

    .line 1717
    .line 1718
    int-to-long v10, v4

    .line 1719
    and-long v10, v10, v16

    .line 1720
    .line 1721
    shl-long v10, v10, v20

    .line 1722
    .line 1723
    add-long/2addr v8, v10

    .line 1724
    add-int/lit8 v4, v2, 0x3

    .line 1725
    .line 1726
    aget-byte v4, v1, v4

    .line 1727
    .line 1728
    int-to-long v10, v4

    .line 1729
    and-long v10, v10, v16

    .line 1730
    .line 1731
    shl-long v10, v10, v21

    .line 1732
    .line 1733
    add-long/2addr v8, v10

    .line 1734
    add-int/lit8 v4, v2, 0x2

    .line 1735
    .line 1736
    aget-byte v4, v1, v4

    .line 1737
    .line 1738
    int-to-long v10, v4

    .line 1739
    and-long v10, v10, v16

    .line 1740
    .line 1741
    shl-long v10, v10, v18

    .line 1742
    .line 1743
    add-long/2addr v8, v10

    .line 1744
    aget-byte v2, v1, v2

    .line 1745
    .line 1746
    goto/16 :goto_7

    .line 1747
    .line 1748
    :pswitch_1a
    move/from16 v19, v15

    .line 1749
    .line 1750
    const/16 v20, 0x18

    .line 1751
    .line 1752
    add-int/lit8 v4, v2, 0x5

    .line 1753
    .line 1754
    aget-byte v4, v1, v4

    .line 1755
    .line 1756
    int-to-long v8, v4

    .line 1757
    shl-long v8, v8, v19

    .line 1758
    .line 1759
    add-int/lit8 v4, v2, 0x4

    .line 1760
    .line 1761
    aget-byte v4, v1, v4

    .line 1762
    .line 1763
    int-to-long v10, v4

    .line 1764
    and-long v10, v10, v16

    .line 1765
    .line 1766
    shl-long/2addr v10, v7

    .line 1767
    add-long/2addr v8, v10

    .line 1768
    add-int/lit8 v4, v2, 0x3

    .line 1769
    .line 1770
    aget-byte v4, v1, v4

    .line 1771
    .line 1772
    int-to-long v10, v4

    .line 1773
    and-long v10, v10, v16

    .line 1774
    .line 1775
    shl-long v10, v10, v20

    .line 1776
    .line 1777
    add-long/2addr v8, v10

    .line 1778
    add-int/lit8 v4, v2, 0x2

    .line 1779
    .line 1780
    aget-byte v4, v1, v4

    .line 1781
    .line 1782
    int-to-long v10, v4

    .line 1783
    and-long v10, v10, v16

    .line 1784
    .line 1785
    shl-long v10, v10, v21

    .line 1786
    .line 1787
    add-long/2addr v8, v10

    .line 1788
    add-int/lit8 v4, v2, 0x1

    .line 1789
    .line 1790
    aget-byte v4, v1, v4

    .line 1791
    .line 1792
    int-to-long v10, v4

    .line 1793
    and-long v10, v10, v16

    .line 1794
    .line 1795
    shl-long v10, v10, v18

    .line 1796
    .line 1797
    add-long/2addr v8, v10

    .line 1798
    aget-byte v2, v1, v2

    .line 1799
    .line 1800
    goto/16 :goto_7

    .line 1801
    .line 1802
    :pswitch_1b
    const/16 v20, 0x18

    .line 1803
    .line 1804
    add-int/lit8 v4, v2, 0x4

    .line 1805
    .line 1806
    aget-byte v4, v1, v4

    .line 1807
    .line 1808
    int-to-long v8, v4

    .line 1809
    shl-long/2addr v8, v7

    .line 1810
    add-int/lit8 v4, v2, 0x3

    .line 1811
    .line 1812
    aget-byte v4, v1, v4

    .line 1813
    .line 1814
    int-to-long v10, v4

    .line 1815
    and-long v10, v10, v16

    .line 1816
    .line 1817
    shl-long v10, v10, v20

    .line 1818
    .line 1819
    add-long/2addr v8, v10

    .line 1820
    add-int/lit8 v4, v2, 0x2

    .line 1821
    .line 1822
    aget-byte v4, v1, v4

    .line 1823
    .line 1824
    int-to-long v10, v4

    .line 1825
    and-long v10, v10, v16

    .line 1826
    .line 1827
    shl-long v10, v10, v21

    .line 1828
    .line 1829
    add-long/2addr v8, v10

    .line 1830
    add-int/lit8 v4, v2, 0x1

    .line 1831
    .line 1832
    aget-byte v4, v1, v4

    .line 1833
    .line 1834
    int-to-long v10, v4

    .line 1835
    and-long v10, v10, v16

    .line 1836
    .line 1837
    shl-long v10, v10, v18

    .line 1838
    .line 1839
    add-long/2addr v8, v10

    .line 1840
    aget-byte v2, v1, v2

    .line 1841
    .line 1842
    goto/16 :goto_7

    .line 1843
    .line 1844
    :pswitch_1c
    const/16 v20, 0x18

    .line 1845
    .line 1846
    add-int/lit8 v4, v2, 0x3

    .line 1847
    .line 1848
    aget-byte v4, v1, v4

    .line 1849
    .line 1850
    shl-int/lit8 v4, v4, 0x18

    .line 1851
    .line 1852
    int-to-long v8, v4

    .line 1853
    add-int/lit8 v4, v2, 0x2

    .line 1854
    .line 1855
    aget-byte v4, v1, v4

    .line 1856
    .line 1857
    int-to-long v10, v4

    .line 1858
    and-long v10, v10, v16

    .line 1859
    .line 1860
    shl-long v10, v10, v21

    .line 1861
    .line 1862
    add-long/2addr v8, v10

    .line 1863
    add-int/lit8 v4, v2, 0x1

    .line 1864
    .line 1865
    aget-byte v4, v1, v4

    .line 1866
    .line 1867
    int-to-long v10, v4

    .line 1868
    and-long v10, v10, v16

    .line 1869
    .line 1870
    shl-long v10, v10, v18

    .line 1871
    .line 1872
    add-long/2addr v8, v10

    .line 1873
    aget-byte v2, v1, v2

    .line 1874
    .line 1875
    goto/16 :goto_7

    .line 1876
    .line 1877
    :pswitch_1d
    add-int/lit8 v4, v2, 0x2

    .line 1878
    .line 1879
    aget-byte v4, v1, v4

    .line 1880
    .line 1881
    shl-int/lit8 v4, v4, 0x10

    .line 1882
    .line 1883
    int-to-long v8, v4

    .line 1884
    add-int/lit8 v4, v2, 0x1

    .line 1885
    .line 1886
    aget-byte v4, v1, v4

    .line 1887
    .line 1888
    int-to-long v10, v4

    .line 1889
    and-long v10, v10, v16

    .line 1890
    .line 1891
    shl-long v10, v10, v18

    .line 1892
    .line 1893
    add-long/2addr v8, v10

    .line 1894
    aget-byte v2, v1, v2

    .line 1895
    .line 1896
    goto/16 :goto_7

    .line 1897
    .line 1898
    :goto_a
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1899
    .line 1900
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 1901
    .line 1902
    add-int v8, v2, v4

    .line 1903
    .line 1904
    sub-int/2addr v8, v6

    .line 1905
    aget-byte v8, v1, v8

    .line 1906
    .line 1907
    if-lez v8, :cond_b

    .line 1908
    .line 1909
    cmp-long v8, v12, v22

    .line 1910
    .line 1911
    if-eqz v8, :cond_b

    .line 1912
    .line 1913
    cmp-long v8, v14, v22

    .line 1914
    .line 1915
    if-eqz v8, :cond_9

    .line 1916
    .line 1917
    xor-long v8, v12, v14

    .line 1918
    .line 1919
    ushr-long v10, v8, v7

    .line 1920
    .line 1921
    xor-long/2addr v8, v10

    .line 1922
    long-to-int v8, v8

    .line 1923
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1924
    .line 1925
    array-length v10, v9

    .line 1926
    sub-int/2addr v10, v6

    .line 1927
    and-int/2addr v8, v10

    .line 1928
    aget-object v10, v9, v8

    .line 1929
    .line 1930
    if-nez v10, :cond_8

    .line 1931
    .line 1932
    invoke-virtual {v0, v2, v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v11

    .line 1936
    new-instance v10, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 1937
    .line 1938
    invoke-direct/range {v10 .. v15}, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;-><init>(Ljava/lang/String;JJ)V

    .line 1939
    .line 1940
    .line 1941
    aput-object v10, v9, v8

    .line 1942
    .line 1943
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1944
    .line 1945
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 1946
    .line 1947
    add-int/2addr v2, v4

    .line 1948
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1949
    .line 1950
    goto :goto_b

    .line 1951
    :cond_8
    iget-wide v8, v10, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value0:J

    .line 1952
    .line 1953
    cmp-long v8, v8, v12

    .line 1954
    .line 1955
    if-nez v8, :cond_b

    .line 1956
    .line 1957
    iget-wide v8, v10, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value1:J

    .line 1958
    .line 1959
    cmp-long v8, v8, v14

    .line 1960
    .line 1961
    if-nez v8, :cond_b

    .line 1962
    .line 1963
    add-int/2addr v2, v4

    .line 1964
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1965
    .line 1966
    iget-object v11, v10, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->name:Ljava/lang/String;

    .line 1967
    .line 1968
    goto :goto_b

    .line 1969
    :cond_9
    ushr-long v8, v12, v7

    .line 1970
    .line 1971
    xor-long/2addr v8, v12

    .line 1972
    long-to-int v8, v8

    .line 1973
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1974
    .line 1975
    array-length v10, v9

    .line 1976
    sub-int/2addr v10, v6

    .line 1977
    and-int/2addr v8, v10

    .line 1978
    aget-object v10, v9, v8

    .line 1979
    .line 1980
    if-nez v10, :cond_a

    .line 1981
    .line 1982
    invoke-virtual {v0, v2, v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v11

    .line 1986
    new-instance v2, Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 1987
    .line 1988
    invoke-direct {v2, v11, v12, v13}, Lcom/alibaba/fastjson2/util/NameCacheEntry;-><init>(Ljava/lang/String;J)V

    .line 1989
    .line 1990
    .line 1991
    aput-object v2, v9, v8

    .line 1992
    .line 1993
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1994
    .line 1995
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 1996
    .line 1997
    add-int/2addr v2, v4

    .line 1998
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1999
    .line 2000
    goto :goto_b

    .line 2001
    :cond_a
    iget-wide v8, v10, Lcom/alibaba/fastjson2/util/NameCacheEntry;->value:J

    .line 2002
    .line 2003
    cmp-long v8, v8, v12

    .line 2004
    .line 2005
    if-nez v8, :cond_b

    .line 2006
    .line 2007
    add-int/2addr v2, v4

    .line 2008
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2009
    .line 2010
    iget-object v11, v10, Lcom/alibaba/fastjson2/util/NameCacheEntry;->name:Ljava/lang/String;

    .line 2011
    .line 2012
    goto :goto_b

    .line 2013
    :cond_b
    move-object v11, v5

    .line 2014
    :goto_b
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 2015
    .line 2016
    goto/16 :goto_e

    .line 2017
    .line 2018
    :cond_c
    move/from16 v18, v8

    .line 2019
    .line 2020
    const/16 v21, 0x10

    .line 2021
    .line 2022
    const/16 v8, 0x7a

    .line 2023
    .line 2024
    if-ne v4, v8, :cond_10

    .line 2025
    .line 2026
    aget-byte v4, v1, v2

    .line 2027
    .line 2028
    const/16 v8, -0x10

    .line 2029
    .line 2030
    if-lt v4, v8, :cond_d

    .line 2031
    .line 2032
    const/16 v8, 0x2f

    .line 2033
    .line 2034
    if-gt v4, v8, :cond_d

    .line 2035
    .line 2036
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2037
    .line 2038
    add-int/2addr v2, v6

    .line 2039
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2040
    .line 2041
    goto :goto_c

    .line 2042
    :cond_d
    if-lt v4, v11, :cond_e

    .line 2043
    .line 2044
    const/16 v8, 0x3f

    .line 2045
    .line 2046
    if-gt v4, v8, :cond_e

    .line 2047
    .line 2048
    sub-int/2addr v4, v10

    .line 2049
    shl-int/lit8 v4, v4, 0x8

    .line 2050
    .line 2051
    add-int/lit8 v8, v2, 0x1

    .line 2052
    .line 2053
    aget-byte v8, v1, v8

    .line 2054
    .line 2055
    and-int/lit16 v8, v8, 0xff

    .line 2056
    .line 2057
    add-int/2addr v4, v8

    .line 2058
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2059
    .line 2060
    add-int/lit8 v2, v2, 0x2

    .line 2061
    .line 2062
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2063
    .line 2064
    goto :goto_c

    .line 2065
    :cond_e
    const/16 v8, 0x40

    .line 2066
    .line 2067
    if-lt v4, v8, :cond_f

    .line 2068
    .line 2069
    const/16 v8, 0x47

    .line 2070
    .line 2071
    if-gt v4, v8, :cond_f

    .line 2072
    .line 2073
    add-int/2addr v2, v6

    .line 2074
    invoke-static {v1, v2, v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 2075
    .line 2076
    .line 2077
    move-result v2

    .line 2078
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2079
    .line 2080
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2081
    .line 2082
    add-int/lit8 v2, v2, 0x3

    .line 2083
    .line 2084
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2085
    .line 2086
    goto :goto_c

    .line 2087
    :cond_f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2088
    .line 2089
    .line 2090
    move-result v2

    .line 2091
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2092
    .line 2093
    :goto_c
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2094
    .line 2095
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2096
    .line 2097
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2098
    .line 2099
    :goto_d
    move-object v11, v5

    .line 2100
    goto :goto_e

    .line 2101
    :cond_10
    const/16 v2, 0x7b

    .line 2102
    .line 2103
    if-ne v4, v2, :cond_11

    .line 2104
    .line 2105
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2106
    .line 2107
    .line 2108
    move-result v2

    .line 2109
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2110
    .line 2111
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2112
    .line 2113
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2114
    .line 2115
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 2116
    .line 2117
    goto :goto_d

    .line 2118
    :cond_11
    const/16 v2, 0x7c

    .line 2119
    .line 2120
    if-ne v4, v2, :cond_12

    .line 2121
    .line 2122
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2123
    .line 2124
    .line 2125
    move-result v2

    .line 2126
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2127
    .line 2128
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2129
    .line 2130
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2131
    .line 2132
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 2133
    .line 2134
    goto :goto_d

    .line 2135
    :cond_12
    const/16 v2, 0x7d

    .line 2136
    .line 2137
    if-ne v4, v2, :cond_13

    .line 2138
    .line 2139
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2140
    .line 2141
    .line 2142
    move-result v2

    .line 2143
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2144
    .line 2145
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2146
    .line 2147
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2148
    .line 2149
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 2150
    .line 2151
    goto :goto_d

    .line 2152
    :cond_13
    const/16 v2, 0x7e

    .line 2153
    .line 2154
    if-ne v4, v2, :cond_15

    .line 2155
    .line 2156
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 2157
    .line 2158
    .line 2159
    move-result v2

    .line 2160
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2161
    .line 2162
    sget-object v2, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 2163
    .line 2164
    if-nez v2, :cond_14

    .line 2165
    .line 2166
    const-string v2, "GB18030"

    .line 2167
    .line 2168
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v2

    .line 2172
    sput-object v2, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 2173
    .line 2174
    :cond_14
    sget-object v2, Lcom/alibaba/fastjson2/JSONReaderJSONB;->GB18030:Ljava/nio/charset/Charset;

    .line 2175
    .line 2176
    goto :goto_d

    .line 2177
    :cond_15
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2178
    .line 2179
    goto :goto_d

    .line 2180
    :goto_e
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2181
    .line 2182
    if-gez v4, :cond_16

    .line 2183
    .line 2184
    iget-object v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 2185
    .line 2186
    neg-int v4, v4

    .line 2187
    invoke-virtual {v8, v4}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v11

    .line 2191
    :cond_16
    if-nez v11, :cond_1d

    .line 2192
    .line 2193
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 2194
    .line 2195
    if-ne v2, v4, :cond_1b

    .line 2196
    .line 2197
    sget v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 2198
    .line 2199
    const/16 v8, 0x22

    .line 2200
    .line 2201
    if-ge v4, v8, :cond_1b

    .line 2202
    .line 2203
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 2204
    .line 2205
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2206
    .line 2207
    if-nez v4, :cond_17

    .line 2208
    .line 2209
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2210
    .line 2211
    iget-object v9, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 2212
    .line 2213
    invoke-virtual {v4, v9, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v4

    .line 2217
    check-cast v4, [C

    .line 2218
    .line 2219
    iput-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 2220
    .line 2221
    :cond_17
    if-eqz v4, :cond_18

    .line 2222
    .line 2223
    array-length v5, v4

    .line 2224
    if-ge v5, v8, :cond_19

    .line 2225
    .line 2226
    :cond_18
    new-array v4, v8, [C

    .line 2227
    .line 2228
    iput-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 2229
    .line 2230
    :cond_19
    const/4 v5, 0x0

    .line 2231
    :goto_f
    if-ge v5, v8, :cond_1a

    .line 2232
    .line 2233
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2234
    .line 2235
    add-int/2addr v9, v5

    .line 2236
    aget-byte v9, v1, v9

    .line 2237
    .line 2238
    and-int/lit16 v9, v9, 0xff

    .line 2239
    .line 2240
    int-to-char v9, v9

    .line 2241
    aput-char v9, v4, v5

    .line 2242
    .line 2243
    add-int/lit8 v5, v5, 0x1

    .line 2244
    .line 2245
    goto :goto_f

    .line 2246
    :cond_1a
    new-instance v11, Ljava/lang/String;

    .line 2247
    .line 2248
    const/4 v5, 0x0

    .line 2249
    invoke-direct {v11, v4, v5, v8}, Ljava/lang/String;-><init>([CII)V

    .line 2250
    .line 2251
    .line 2252
    :cond_1b
    if-nez v11, :cond_1c

    .line 2253
    .line 2254
    new-instance v4, Ljava/lang/String;

    .line 2255
    .line 2256
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2257
    .line 2258
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2259
    .line 2260
    invoke-direct {v4, v1, v5, v8, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2261
    .line 2262
    .line 2263
    move-object v11, v4

    .line 2264
    :cond_1c
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2265
    .line 2266
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2267
    .line 2268
    add-int/2addr v1, v2

    .line 2269
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2270
    .line 2271
    :cond_1d
    if-eqz v3, :cond_22

    .line 2272
    .line 2273
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 2274
    .line 2275
    .line 2276
    move-result v1

    .line 2277
    if-nez v1, :cond_1e

    .line 2278
    .line 2279
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2280
    .line 2281
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 2282
    .line 2283
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2284
    .line 2285
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 2286
    .line 2287
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2288
    .line 2289
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 2290
    .line 2291
    return-object v11

    .line 2292
    :cond_1e
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 2293
    .line 2294
    if-nez v2, :cond_20

    .line 2295
    .line 2296
    mul-int/lit8 v2, v1, 0x2

    .line 2297
    .line 2298
    add-int/lit8 v2, v2, 0x2

    .line 2299
    .line 2300
    if-ge v2, v7, :cond_1f

    .line 2301
    .line 2302
    move v2, v7

    .line 2303
    :cond_1f
    new-array v2, v2, [J

    .line 2304
    .line 2305
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 2306
    .line 2307
    goto :goto_10

    .line 2308
    :cond_20
    array-length v3, v2

    .line 2309
    mul-int/lit8 v4, v1, 0x2

    .line 2310
    .line 2311
    add-int/lit8 v4, v4, 0x2

    .line 2312
    .line 2313
    if-ge v3, v4, :cond_21

    .line 2314
    .line 2315
    array-length v3, v2

    .line 2316
    add-int/lit8 v3, v3, 0x10

    .line 2317
    .line 2318
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 2319
    .line 2320
    .line 2321
    move-result-object v2

    .line 2322
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 2323
    .line 2324
    :cond_21
    :goto_10
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 2325
    .line 2326
    int-to-long v2, v2

    .line 2327
    shl-long/2addr v2, v7

    .line 2328
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 2329
    .line 2330
    int-to-long v4, v4

    .line 2331
    shl-long v4, v4, v18

    .line 2332
    .line 2333
    add-long/2addr v2, v4

    .line 2334
    iget-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2335
    .line 2336
    int-to-long v4, v4

    .line 2337
    add-long/2addr v2, v4

    .line 2338
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 2339
    .line 2340
    mul-int/lit8 v1, v1, 0x2

    .line 2341
    .line 2342
    add-int/2addr v1, v6

    .line 2343
    aput-wide v2, v4, v1

    .line 2344
    .line 2345
    :cond_22
    return-object v11

    .line 2346
    nop

    .line 2347
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

    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public readFieldNameHashCode()J
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    aget-byte v4, v1, v2

    .line 12
    .line 13
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 14
    .line 15
    const/16 v5, 0x7f

    .line 16
    .line 17
    if-ne v4, v5, :cond_0

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v5, 0x0

    .line 22
    :goto_0
    const/16 v8, 0x2f

    .line 23
    .line 24
    const/16 v9, -0x10

    .line 25
    .line 26
    const/16 v10, 0x8

    .line 27
    .line 28
    const-wide/16 v11, 0x0

    .line 29
    .line 30
    const/16 v13, 0x20

    .line 31
    .line 32
    if-eqz v5, :cond_7

    .line 33
    .line 34
    aget-byte v4, v1, v3

    .line 35
    .line 36
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 37
    .line 38
    if-lt v4, v9, :cond_6

    .line 39
    .line 40
    const/16 v3, 0x48

    .line 41
    .line 42
    if-gt v4, v3, :cond_6

    .line 43
    .line 44
    if-gt v4, v8, :cond_1

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x2

    .line 47
    .line 48
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    :goto_1
    if-gez v4, :cond_2

    .line 56
    .line 57
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 58
    .line 59
    neg-int v2, v4

    .line 60
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    return-wide v1

    .line 65
    :cond_2
    if-nez v4, :cond_4

    .line 66
    .line 67
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 68
    .line 69
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 70
    .line 71
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 72
    .line 73
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 74
    .line 75
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 76
    .line 77
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 78
    .line 79
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 80
    .line 81
    cmp-long v1, v1, v11

    .line 82
    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getNameHashCode()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    iput-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 90
    .line 91
    :cond_3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 92
    .line 93
    return-wide v1

    .line 94
    :cond_4
    mul-int/lit8 v4, v4, 0x2

    .line 95
    .line 96
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 97
    .line 98
    add-int/lit8 v2, v4, 0x1

    .line 99
    .line 100
    aget-wide v2, v1, v2

    .line 101
    .line 102
    long-to-int v5, v2

    .line 103
    int-to-byte v6, v5

    .line 104
    iput-byte v6, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 105
    .line 106
    shr-int/2addr v5, v10

    .line 107
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 108
    .line 109
    shr-long/2addr v2, v13

    .line 110
    long-to-int v2, v2

    .line 111
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 112
    .line 113
    aget-wide v2, v1, v4

    .line 114
    .line 115
    cmp-long v1, v2, v11

    .line 116
    .line 117
    if-nez v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getNameHashCode()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 124
    .line 125
    aput-wide v1, v3, v4

    .line 126
    .line 127
    return-wide v1

    .line 128
    :cond_5
    return-wide v2

    .line 129
    :cond_6
    add-int/lit8 v2, v2, 0x2

    .line 130
    .line 131
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 132
    .line 133
    :cond_7
    const/16 v2, 0x49

    .line 134
    .line 135
    if-lt v4, v2, :cond_8

    .line 136
    .line 137
    const/16 v2, 0x78

    .line 138
    .line 139
    if-gt v4, v2, :cond_8

    .line 140
    .line 141
    add-int/lit8 v2, v4, -0x49

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    const/16 v2, 0x79

    .line 145
    .line 146
    if-eq v4, v2, :cond_a

    .line 147
    .line 148
    const/16 v2, 0x7a

    .line 149
    .line 150
    if-ne v4, v2, :cond_9

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldNameHashCodeError()Lcom/alibaba/fastjson2/JSONException;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    throw v1

    .line 158
    :cond_a
    :goto_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    :goto_3
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 163
    .line 164
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 165
    .line 166
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 167
    .line 168
    if-gez v2, :cond_b

    .line 169
    .line 170
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 171
    .line 172
    neg-int v6, v2

    .line 173
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 174
    .line 175
    .line 176
    move-result-wide v11

    .line 177
    move/from16 v21, v10

    .line 178
    .line 179
    move v7, v13

    .line 180
    const/16 v18, 0x1

    .line 181
    .line 182
    goto/16 :goto_a

    .line 183
    .line 184
    :cond_b
    if-gt v2, v10, :cond_c

    .line 185
    .line 186
    add-int v14, v3, v2

    .line 187
    .line 188
    array-length v15, v1

    .line 189
    if-gt v14, v15, :cond_c

    .line 190
    .line 191
    const-wide v16, 0xffffffffL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    packed-switch v2, :pswitch_data_0

    .line 197
    .line 198
    .line 199
    sget-object v14, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 200
    .line 201
    sget-wide v15, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 202
    .line 203
    const/16 v18, 0x1

    .line 204
    .line 205
    int-to-long v6, v3

    .line 206
    add-long/2addr v6, v15

    .line 207
    invoke-virtual {v14, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    move/from16 v21, v10

    .line 212
    .line 213
    move-wide/from16 v22, v11

    .line 214
    .line 215
    :goto_4
    move-wide v11, v6

    .line 216
    move v7, v13

    .line 217
    goto/16 :goto_8

    .line 218
    .line 219
    :pswitch_0
    const/16 v18, 0x1

    .line 220
    .line 221
    add-int/lit8 v6, v3, 0x6

    .line 222
    .line 223
    aget-byte v6, v1, v6

    .line 224
    .line 225
    int-to-long v6, v6

    .line 226
    const/16 v14, 0x30

    .line 227
    .line 228
    shl-long/2addr v6, v14

    .line 229
    add-int/lit8 v14, v3, 0x5

    .line 230
    .line 231
    aget-byte v14, v1, v14

    .line 232
    .line 233
    int-to-long v14, v14

    .line 234
    const-wide/16 v19, 0xff

    .line 235
    .line 236
    and-long v14, v14, v19

    .line 237
    .line 238
    const/16 v21, 0x28

    .line 239
    .line 240
    shl-long v14, v14, v21

    .line 241
    .line 242
    add-long/2addr v6, v14

    .line 243
    add-int/lit8 v14, v3, 0x4

    .line 244
    .line 245
    aget-byte v14, v1, v14

    .line 246
    .line 247
    int-to-long v14, v14

    .line 248
    and-long v14, v14, v19

    .line 249
    .line 250
    shl-long/2addr v14, v13

    .line 251
    add-long/2addr v6, v14

    .line 252
    sget-object v14, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 253
    .line 254
    sget-wide v19, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 255
    .line 256
    move/from16 v21, v10

    .line 257
    .line 258
    move-wide/from16 v22, v11

    .line 259
    .line 260
    int-to-long v10, v3

    .line 261
    add-long v10, v19, v10

    .line 262
    .line 263
    invoke-virtual {v14, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    int-to-long v10, v3

    .line 268
    and-long v10, v10, v16

    .line 269
    .line 270
    add-long/2addr v6, v10

    .line 271
    goto :goto_4

    .line 272
    :pswitch_1
    move/from16 v21, v10

    .line 273
    .line 274
    move-wide/from16 v22, v11

    .line 275
    .line 276
    const/16 v18, 0x1

    .line 277
    .line 278
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 279
    .line 280
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 281
    .line 282
    int-to-long v14, v3

    .line 283
    add-long v19, v10, v14

    .line 284
    .line 285
    const-wide/16 v24, 0x4

    .line 286
    .line 287
    move v7, v13

    .line 288
    move-wide/from16 v26, v14

    .line 289
    .line 290
    add-long v13, v19, v24

    .line 291
    .line 292
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    int-to-long v12, v3

    .line 297
    shl-long/2addr v12, v7

    .line 298
    add-long v10, v10, v26

    .line 299
    .line 300
    invoke-virtual {v6, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    int-to-long v10, v3

    .line 305
    and-long v10, v10, v16

    .line 306
    .line 307
    add-long/2addr v12, v10

    .line 308
    move-wide v11, v12

    .line 309
    goto/16 :goto_8

    .line 310
    .line 311
    :pswitch_2
    move/from16 v21, v10

    .line 312
    .line 313
    move-wide/from16 v22, v11

    .line 314
    .line 315
    move v7, v13

    .line 316
    const/16 v18, 0x1

    .line 317
    .line 318
    add-int/lit8 v6, v3, 0x4

    .line 319
    .line 320
    aget-byte v6, v1, v6

    .line 321
    .line 322
    int-to-long v10, v6

    .line 323
    shl-long/2addr v10, v7

    .line 324
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 325
    .line 326
    sget-wide v12, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 327
    .line 328
    int-to-long v14, v3

    .line 329
    add-long/2addr v12, v14

    .line 330
    invoke-virtual {v6, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    :goto_5
    int-to-long v12, v3

    .line 335
    and-long v12, v12, v16

    .line 336
    .line 337
    add-long/2addr v10, v12

    .line 338
    :goto_6
    move-wide v11, v10

    .line 339
    goto :goto_8

    .line 340
    :pswitch_3
    move/from16 v21, v10

    .line 341
    .line 342
    move-wide/from16 v22, v11

    .line 343
    .line 344
    move v7, v13

    .line 345
    const/16 v18, 0x1

    .line 346
    .line 347
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 348
    .line 349
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 350
    .line 351
    int-to-long v12, v3

    .line 352
    add-long/2addr v10, v12

    .line 353
    invoke-virtual {v6, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    :goto_7
    int-to-long v10, v3

    .line 358
    goto :goto_6

    .line 359
    :pswitch_4
    move/from16 v21, v10

    .line 360
    .line 361
    move-wide/from16 v22, v11

    .line 362
    .line 363
    move v7, v13

    .line 364
    const/16 v18, 0x1

    .line 365
    .line 366
    add-int/lit8 v6, v3, 0x2

    .line 367
    .line 368
    aget-byte v6, v1, v6

    .line 369
    .line 370
    shl-int/lit8 v6, v6, 0x10

    .line 371
    .line 372
    int-to-long v10, v6

    .line 373
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 374
    .line 375
    sget-wide v12, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 376
    .line 377
    const-wide/32 v16, 0xffff

    .line 378
    .line 379
    .line 380
    int-to-long v14, v3

    .line 381
    add-long/2addr v12, v14

    .line 382
    invoke-virtual {v6, v1, v12, v13}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    goto :goto_5

    .line 387
    :pswitch_5
    move/from16 v21, v10

    .line 388
    .line 389
    move-wide/from16 v22, v11

    .line 390
    .line 391
    move v7, v13

    .line 392
    const-wide/32 v16, 0xffff

    .line 393
    .line 394
    .line 395
    const/16 v18, 0x1

    .line 396
    .line 397
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 398
    .line 399
    sget-wide v10, Lcom/alibaba/fastjson2/JSONReaderJSONB;->BASE:J

    .line 400
    .line 401
    int-to-long v12, v3

    .line 402
    add-long/2addr v10, v12

    .line 403
    invoke-virtual {v6, v1, v10, v11}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    int-to-long v10, v3

    .line 408
    and-long v10, v10, v16

    .line 409
    .line 410
    goto :goto_6

    .line 411
    :pswitch_6
    move/from16 v21, v10

    .line 412
    .line 413
    move-wide/from16 v22, v11

    .line 414
    .line 415
    move v7, v13

    .line 416
    const/16 v18, 0x1

    .line 417
    .line 418
    aget-byte v3, v1, v3

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_c
    move/from16 v21, v10

    .line 422
    .line 423
    move-wide/from16 v22, v11

    .line 424
    .line 425
    move v7, v13

    .line 426
    const/16 v18, 0x1

    .line 427
    .line 428
    move-wide/from16 v11, v22

    .line 429
    .line 430
    :goto_8
    cmp-long v3, v11, v22

    .line 431
    .line 432
    if-eqz v3, :cond_d

    .line 433
    .line 434
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 435
    .line 436
    add-int/2addr v3, v2

    .line 437
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_d
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    move-wide v11, v10

    .line 446
    const/4 v6, 0x0

    .line 447
    :goto_9
    if-ge v6, v2, :cond_e

    .line 448
    .line 449
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 450
    .line 451
    add-int/lit8 v10, v3, 0x1

    .line 452
    .line 453
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 454
    .line 455
    aget-byte v3, v1, v3

    .line 456
    .line 457
    int-to-long v13, v3

    .line 458
    xor-long v10, v11, v13

    .line 459
    .line 460
    const-wide v12, 0x100000001b3L

    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    mul-long v11, v10, v12

    .line 466
    .line 467
    add-int/lit8 v6, v6, 0x1

    .line 468
    .line 469
    goto :goto_9

    .line 470
    :cond_e
    :goto_a
    if-eqz v5, :cond_13

    .line 471
    .line 472
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 473
    .line 474
    aget-byte v1, v1, v3

    .line 475
    .line 476
    if-lt v1, v9, :cond_f

    .line 477
    .line 478
    if-gt v1, v8, :cond_f

    .line 479
    .line 480
    add-int/lit8 v3, v3, 0x1

    .line 481
    .line 482
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    :goto_b
    if-nez v1, :cond_10

    .line 490
    .line 491
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 492
    .line 493
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 494
    .line 495
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 496
    .line 497
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 498
    .line 499
    iput-wide v11, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 500
    .line 501
    return-wide v11

    .line 502
    :cond_10
    shl-int/lit8 v1, v1, 0x1

    .line 503
    .line 504
    add-int/lit8 v3, v1, 0x2

    .line 505
    .line 506
    iget-object v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 507
    .line 508
    if-nez v5, :cond_11

    .line 509
    .line 510
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    new-array v3, v3, [J

    .line 515
    .line 516
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 517
    .line 518
    goto :goto_c

    .line 519
    :cond_11
    array-length v6, v5

    .line 520
    if-ge v6, v3, :cond_12

    .line 521
    .line 522
    add-int/lit8 v3, v1, 0x12

    .line 523
    .line 524
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 529
    .line 530
    :cond_12
    :goto_c
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 531
    .line 532
    aput-wide v11, v3, v1

    .line 533
    .line 534
    add-int/lit8 v1, v1, 0x1

    .line 535
    .line 536
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 537
    .line 538
    int-to-long v5, v5

    .line 539
    const/16 v7, 0x20

    .line 540
    .line 541
    shl-long/2addr v5, v7

    .line 542
    int-to-long v7, v2

    .line 543
    shl-long v7, v7, v21

    .line 544
    .line 545
    add-long/2addr v5, v7

    .line 546
    int-to-long v7, v4

    .line 547
    add-long/2addr v5, v7

    .line 548
    aput-wide v5, v3, v1

    .line 549
    .line 550
    :cond_13
    return-wide v11

    .line 551
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readFieldNameHashCodeError()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "fieldName not support input type "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 9
    .line 10
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 18
    .line 19
    const/16 v2, -0x6d

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    const-string v1, " "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_0
    const-string v1, ", offset "

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public readFieldNameHashCodeUnquote()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldNameHashCode()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public readFloatValue()F
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x49

    .line 8
    .line 9
    if-ne v2, v3, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 14
    .line 15
    int-to-long v5, v1

    .line 16
    add-long/2addr v3, v5

    .line 17
    const-wide/16 v5, 0x1

    .line 18
    .line 19
    add-long/2addr v3, v5

    .line 20
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/lit8 v1, v1, 0x5

    .line 25
    .line 26
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 27
    .line 28
    sget-boolean v1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0

    .line 42
    :cond_1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFloat0()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    return v0
.end method

.method public readHex()[B
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    new-array v2, v1, [B

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v1, :cond_2

    .line 15
    .line 16
    mul-int/lit8 v4, v3, 0x2

    .line 17
    .line 18
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0x37

    .line 29
    .line 30
    const/16 v7, 0x30

    .line 31
    .line 32
    const/16 v8, 0x39

    .line 33
    .line 34
    if-gt v5, v8, :cond_0

    .line 35
    .line 36
    move v9, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v9, v6

    .line 39
    :goto_1
    sub-int/2addr v5, v9

    .line 40
    if-gt v4, v8, :cond_1

    .line 41
    .line 42
    move v6, v7

    .line 43
    :cond_1
    sub-int/2addr v4, v6

    .line 44
    shl-int/lit8 v5, v5, 0x4

    .line 45
    .line 46
    or-int/2addr v4, v5

    .line 47
    int-to-byte v4, v4

    .line 48
    aput-byte v4, v2, v3

    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v2
.end method

.method public readIfNull()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr v1, v0

    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public readInstant()Ljava/time/Instant;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v1, v0, v1

    .line 10
    .line 11
    const/16 v3, -0x42

    .line 12
    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    int-to-long v2, v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_1
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-long v0, v0

    .line 45
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x4

    .line 48
    .line 49
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 50
    .line 51
    const-wide/16 v5, 0x3c

    .line 52
    .line 53
    mul-long/2addr v0, v5

    .line 54
    invoke-static {v0, v1, v3, v4}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_2
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v0, v0

    .line 64
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x4

    .line 67
    .line 68
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    invoke-static {v0, v1, v3, v4}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :cond_0
    :pswitch_3
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 76
    .line 77
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 78
    .line 79
    int-to-long v5, v2

    .line 80
    add-long/2addr v3, v5

    .line 81
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x8

    .line 88
    .line 89
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 90
    .line 91
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 92
    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    :goto_0
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readInt32()Ljava/lang/Integer;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    aget-byte v3, v0, v1

    .line 8
    .line 9
    const/16 v4, -0x51

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/16 v4, -0x10

    .line 18
    .line 19
    if-lt v3, v4, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x2f

    .line 22
    .line 23
    if-gt v3, v4, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/16 v4, 0x30

    .line 27
    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    const/16 v4, 0x3f

    .line 31
    .line 32
    if-gt v3, v4, :cond_2

    .line 33
    .line 34
    add-int/lit8 v3, v3, -0x38

    .line 35
    .line 36
    shl-int/lit8 v3, v3, 0x8

    .line 37
    .line 38
    aget-byte v0, v0, v2

    .line 39
    .line 40
    and-int/lit16 v0, v0, 0xff

    .line 41
    .line 42
    add-int/2addr v3, v0

    .line 43
    add-int/lit8 v2, v1, 0x2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/16 v4, 0x40

    .line 47
    .line 48
    if-lt v3, v4, :cond_3

    .line 49
    .line 50
    const/16 v4, 0x47

    .line 51
    .line 52
    if-gt v3, v4, :cond_3

    .line 53
    .line 54
    add-int/lit8 v3, v3, -0x44

    .line 55
    .line 56
    shl-int/lit8 v3, v3, 0x10

    .line 57
    .line 58
    aget-byte v2, v0, v2

    .line 59
    .line 60
    and-int/lit16 v2, v2, 0xff

    .line 61
    .line 62
    shl-int/lit8 v2, v2, 0x8

    .line 63
    .line 64
    add-int/2addr v3, v2

    .line 65
    add-int/lit8 v2, v1, 0x2

    .line 66
    .line 67
    aget-byte v0, v0, v2

    .line 68
    .line 69
    and-int/lit16 v0, v0, 0xff

    .line 70
    .line 71
    add-int/2addr v3, v0

    .line 72
    add-int/lit8 v2, v1, 0x3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/16 v4, 0x48

    .line 76
    .line 77
    if-ne v3, v4, :cond_5

    .line 78
    .line 79
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 80
    .line 81
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 82
    .line 83
    int-to-long v6, v2

    .line 84
    add-long/2addr v4, v6

    .line 85
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 90
    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    :cond_4
    move v3, v0

    .line 98
    add-int/lit8 v2, v1, 0x5

    .line 99
    .line 100
    :goto_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 108
    .line 109
    invoke-direct {p0, v0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value0([BB)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public readInt32Value()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    aget-byte v3, v0, v1

    .line 8
    .line 9
    const/16 v4, -0x10

    .line 10
    .line 11
    if-lt v3, v4, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x2f

    .line 14
    .line 15
    if-gt v3, v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v4, 0x30

    .line 19
    .line 20
    if-lt v3, v4, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x3f

    .line 23
    .line 24
    if-gt v3, v4, :cond_1

    .line 25
    .line 26
    add-int/lit8 v3, v3, -0x38

    .line 27
    .line 28
    shl-int/lit8 v3, v3, 0x8

    .line 29
    .line 30
    aget-byte v0, v0, v2

    .line 31
    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    add-int/2addr v3, v0

    .line 35
    add-int/lit8 v2, v1, 0x2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v4, 0x40

    .line 39
    .line 40
    if-lt v3, v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x47

    .line 43
    .line 44
    if-gt v3, v4, :cond_2

    .line 45
    .line 46
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    add-int/lit8 v2, v1, 0x3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/16 v4, 0x48

    .line 54
    .line 55
    if-ne v3, v4, :cond_3

    .line 56
    .line 57
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/lit8 v2, v1, 0x5

    .line 62
    .line 63
    :goto_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 64
    .line 65
    return v3

    .line 66
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 67
    .line 68
    invoke-direct {p0, v0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value0([BB)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    return v0
.end method

.method public readInt64()Ljava/lang/Long;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    aget-byte v3, v0, v1

    .line 8
    .line 9
    const/16 v4, -0x51

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/16 v4, -0x28

    .line 18
    .line 19
    if-lt v3, v4, :cond_1

    .line 20
    .line 21
    const/16 v4, -0x11

    .line 22
    .line 23
    if-gt v3, v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x20

    .line 26
    .line 27
    int-to-long v0, v3

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    const/16 v4, -0x38

    .line 31
    .line 32
    if-lt v3, v4, :cond_2

    .line 33
    .line 34
    const/16 v4, -0x29

    .line 35
    .line 36
    if-gt v3, v4, :cond_2

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x30

    .line 39
    .line 40
    shl-int/lit8 v3, v3, 0x8

    .line 41
    .line 42
    aget-byte v0, v0, v2

    .line 43
    .line 44
    and-int/lit16 v0, v0, 0xff

    .line 45
    .line 46
    add-int/2addr v3, v0

    .line 47
    int-to-long v2, v3

    .line 48
    add-int/lit8 v0, v1, 0x2

    .line 49
    .line 50
    :goto_0
    move-wide v8, v2

    .line 51
    move v2, v0

    .line 52
    move-wide v0, v8

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    const/16 v4, -0x40

    .line 55
    .line 56
    if-lt v3, v4, :cond_3

    .line 57
    .line 58
    const/16 v4, -0x39

    .line 59
    .line 60
    if-gt v3, v4, :cond_3

    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x3c

    .line 63
    .line 64
    shl-int/lit8 v3, v3, 0x10

    .line 65
    .line 66
    aget-byte v2, v0, v2

    .line 67
    .line 68
    and-int/lit16 v2, v2, 0xff

    .line 69
    .line 70
    shl-int/lit8 v2, v2, 0x8

    .line 71
    .line 72
    add-int/2addr v3, v2

    .line 73
    add-int/lit8 v2, v1, 0x2

    .line 74
    .line 75
    aget-byte v0, v0, v2

    .line 76
    .line 77
    and-int/lit16 v0, v0, 0xff

    .line 78
    .line 79
    add-int/2addr v3, v0

    .line 80
    int-to-long v2, v3

    .line 81
    add-int/lit8 v0, v1, 0x3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const/16 v4, -0x41

    .line 85
    .line 86
    if-ne v3, v4, :cond_5

    .line 87
    .line 88
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 89
    .line 90
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 91
    .line 92
    int-to-long v6, v2

    .line 93
    add-long/2addr v4, v6

    .line 94
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    :goto_1
    int-to-long v2, v0

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    goto :goto_1

    .line 109
    :goto_2
    add-int/lit8 v0, v1, 0x5

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const/16 v4, -0x42

    .line 113
    .line 114
    if-ne v3, v4, :cond_7

    .line 115
    .line 116
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 117
    .line 118
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 119
    .line 120
    int-to-long v6, v2

    .line 121
    add-long/2addr v4, v6

    .line 122
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 127
    .line 128
    if-nez v0, :cond_6

    .line 129
    .line 130
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    :cond_6
    add-int/lit8 v0, v1, 0x9

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :goto_3
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 138
    .line 139
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :cond_7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 145
    .line 146
    invoke-direct {p0, v0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value0([BB)J

    .line 147
    .line 148
    .line 149
    move-result-wide v0

    .line 150
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0
.end method

.method public readInt64Value()J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 5
    .line 6
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    aget-byte v3, v0, v1

    .line 11
    .line 12
    const/16 v4, -0x28

    .line 13
    .line 14
    if-lt v3, v4, :cond_0

    .line 15
    .line 16
    const/16 v4, -0x11

    .line 17
    .line 18
    if-gt v3, v4, :cond_0

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x20

    .line 21
    .line 22
    int-to-long v0, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/16 v4, -0x38

    .line 25
    .line 26
    if-lt v3, v4, :cond_1

    .line 27
    .line 28
    const/16 v4, -0x29

    .line 29
    .line 30
    if-gt v3, v4, :cond_1

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x30

    .line 33
    .line 34
    shl-int/lit8 v3, v3, 0x8

    .line 35
    .line 36
    aget-byte v0, v0, v2

    .line 37
    .line 38
    and-int/lit16 v0, v0, 0xff

    .line 39
    .line 40
    add-int/2addr v3, v0

    .line 41
    int-to-long v2, v3

    .line 42
    add-int/lit8 v0, v1, 0x2

    .line 43
    .line 44
    :goto_0
    move-wide v8, v2

    .line 45
    move v2, v0

    .line 46
    move-wide v0, v8

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 v4, -0x40

    .line 49
    .line 50
    if-lt v3, v4, :cond_2

    .line 51
    .line 52
    const/16 v4, -0x39

    .line 53
    .line 54
    if-gt v3, v4, :cond_2

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x3c

    .line 57
    .line 58
    shl-int/lit8 v3, v3, 0x10

    .line 59
    .line 60
    aget-byte v2, v0, v2

    .line 61
    .line 62
    and-int/lit16 v2, v2, 0xff

    .line 63
    .line 64
    shl-int/lit8 v2, v2, 0x8

    .line 65
    .line 66
    add-int/2addr v3, v2

    .line 67
    add-int/lit8 v2, v1, 0x2

    .line 68
    .line 69
    aget-byte v0, v0, v2

    .line 70
    .line 71
    and-int/lit16 v0, v0, 0xff

    .line 72
    .line 73
    add-int/2addr v3, v0

    .line 74
    int-to-long v2, v3

    .line 75
    add-int/lit8 v0, v1, 0x3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/16 v4, -0x41

    .line 79
    .line 80
    if-ne v3, v4, :cond_3

    .line 81
    .line 82
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v2, v0

    .line 87
    add-int/lit8 v0, v1, 0x5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const/16 v4, -0x42

    .line 91
    .line 92
    if-ne v3, v4, :cond_5

    .line 93
    .line 94
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 95
    .line 96
    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 97
    .line 98
    int-to-long v6, v2

    .line 99
    add-long/2addr v4, v6

    .line 100
    invoke-virtual {v3, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 105
    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    :cond_4
    add-int/lit8 v0, v1, 0x9

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    return-wide v0

    .line 118
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 119
    .line 120
    invoke-direct {p0, v0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value0([BB)J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    return-wide v0
.end method

.method public readInt64ValueArray()[J
    .locals 5

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->nextIfMatch(B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sget-wide v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64ValueArray;->HASH_TYPE:J

    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    sget-wide v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64Array;->HASH_TYPE:J

    .line 20
    .line 21
    cmp-long v2, v0, v2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    sget-wide v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32Array;->HASH_TYPE:J

    .line 26
    .line 27
    cmp-long v2, v0, v2

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    sget-wide v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32ValueArray;->HASH_TYPE:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, "not support "

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, -0x1

    .line 70
    if-ne v0, v1, :cond_2

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    return-object v0

    .line 74
    :cond_2
    new-array v1, v0, [J

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    :goto_1
    if-ge v2, v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    aput-wide v3, v1, v2

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    return-object v1
.end method

.method public readLength()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x10

    .line 12
    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x2f

    .line 16
    .line 17
    if-gt v3, v4, :cond_0

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    const/16 v4, 0x30

    .line 21
    .line 22
    if-lt v3, v4, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x3f

    .line 25
    .line 26
    if-gt v3, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v3, -0x38

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x8

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 35
    .line 36
    aget-byte v0, v0, v2

    .line 37
    .line 38
    and-int/lit16 v0, v0, 0xff

    .line 39
    .line 40
    add-int/2addr v3, v0

    .line 41
    return v3

    .line 42
    :cond_1
    const/16 v1, 0x40

    .line 43
    .line 44
    if-lt v3, v1, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x47

    .line 47
    .line 48
    if-gt v3, v1, :cond_2

    .line 49
    .line 50
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x2

    .line 57
    .line 58
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 59
    .line 60
    return v0

    .line 61
    :cond_2
    const/16 v1, 0x48

    .line 62
    .line 63
    if-ne v3, v1, :cond_4

    .line 64
    .line 65
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x4

    .line 72
    .line 73
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 74
    .line 75
    const/high16 v1, 0x10000000

    .line 76
    .line 77
    if-gt v0, v1, :cond_3

    .line 78
    .line 79
    return v0

    .line 80
    :cond_3
    const-string v0, "input length overflow"

    .line 81
    .line 82
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    return v0

    .line 87
    :cond_4
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    throw v0
.end method

.method public readList([Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    aget-object v3, p1, v2

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v1
.end method

.method public readLocalDate()Ljava/time/LocalDate;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x57

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    aget-byte v2, v0, v2

    .line 18
    .line 19
    shl-int/lit8 v2, v2, 0x8

    .line 20
    .line 21
    add-int/lit8 v4, v1, 0x3

    .line 22
    .line 23
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    aget-byte v3, v0, v3

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    add-int/2addr v2, v3

    .line 30
    add-int/lit8 v3, v1, 0x4

    .line 31
    .line 32
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 33
    .line 34
    aget-byte v4, v0, v4

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x5

    .line 37
    .line 38
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    invoke-static {v2, v4, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_0
    const/16 v0, -0x51

    .line 48
    .line 49
    if-ne v2, v0, :cond_1

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_1
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDate0(I)Ljava/time/LocalDate;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method

.method public final readLocalDate10()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2
    .line 3
    const/16 v1, 0x79

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x7a

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([BI)Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 27
    .line 28
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    aget-byte v2, v0, v1

    .line 31
    .line 32
    const/16 v3, 0x53

    .line 33
    .line 34
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([BI)Ljava/time/LocalDate;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0xb

    .line 47
    .line 48
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    const-string v0, "date only support string input"

    .line 52
    .line 53
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0
.end method

.method public final readLocalDate11()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 2
    .line 3
    const/16 v1, 0x79

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x7a

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([BI)Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 27
    .line 28
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    aget-byte v2, v0, v1

    .line 31
    .line 32
    const/16 v3, 0x54

    .line 33
    .line 34
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([BI)Ljava/time/LocalDate;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0xc

    .line 47
    .line 48
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    const-string v0, "date only support string input"

    .line 52
    .line 53
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0
.end method

.method public readLocalDate8()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x51

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([BI)Ljava/time/LocalDate;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x9

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public readLocalDate9()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x52

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([BI)Ljava/time/LocalDate;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xa

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public readLocalDateTime()Ljava/time/LocalDateTime;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x58

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    aget-byte v2, v0, v2

    .line 18
    .line 19
    shl-int/lit8 v2, v2, 0x8

    .line 20
    .line 21
    add-int/lit8 v4, v1, 0x3

    .line 22
    .line 23
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    aget-byte v3, v0, v3

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    add-int v5, v2, v3

    .line 30
    .line 31
    add-int/lit8 v2, v1, 0x4

    .line 32
    .line 33
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    aget-byte v6, v0, v4

    .line 36
    .line 37
    add-int/lit8 v3, v1, 0x5

    .line 38
    .line 39
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 40
    .line 41
    aget-byte v7, v0, v2

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x6

    .line 44
    .line 45
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 46
    .line 47
    aget-byte v8, v0, v3

    .line 48
    .line 49
    add-int/lit8 v3, v1, 0x7

    .line 50
    .line 51
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    aget-byte v9, v0, v2

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x8

    .line 56
    .line 57
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 58
    .line 59
    aget-byte v10, v0, v3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :cond_0
    const/16 v0, -0x51

    .line 71
    .line 72
    if-ne v2, v0, :cond_1

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    return-object v0

    .line 80
    :cond_1
    invoke-direct {p0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalDateTime0(I)Ljava/time/LocalDateTime;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0
.end method

.method public final readLocalDateTime12()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x55

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime12([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTime14()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x57

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime14([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xf

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTime16()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x59

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime16([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTime17()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x5a

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime17([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x12

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTime18()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x5b

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime18([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x13

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTime19()Ljava/time/LocalDateTime;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 8
    .line 9
    const/16 v3, 0x5c

    .line 10
    .line 11
    const-string v4, "date only support string input"

    .line 12
    .line 13
    if-ne v2, v3, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([BI)Ljava/time/LocalDateTime;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x14

    .line 26
    .line 27
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-static {v4}, Lah/a;->w(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-static {v4}, Lah/a;->w(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final readLocalDateTime20()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x5d

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime20([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x15

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalDateTimeX(I)Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 8
    .line 9
    const/16 v3, 0x49

    .line 10
    .line 11
    if-lt v2, v3, :cond_1

    .line 12
    .line 13
    const/16 v3, 0x78

    .line 14
    .line 15
    if-gt v2, v3, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x15

    .line 18
    .line 19
    if-lt p1, v2, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x1d

    .line 22
    .line 23
    if-gt p1, v2, :cond_0

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTimeX([BII)Ljava/time/LocalDateTime;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    const-string p1, "illegal LocalDateTime string : "

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_1
    const-string p1, "date only support string input"

    .line 53
    .line 54
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0
.end method

.method public readLocalTime()Ljava/time/LocalTime;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, -0x59

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    aget-byte v2, v0, v2

    .line 18
    .line 19
    add-int/lit8 v4, v1, 0x3

    .line 20
    .line 21
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    aget-byte v3, v0, v3

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x4

    .line 26
    .line 27
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    aget-byte v0, v0, v4

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v2, v3, v0, v1}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :cond_0
    const/16 v0, 0x49

    .line 41
    .line 42
    if-lt v2, v0, :cond_4

    .line 43
    .line 44
    const/16 v0, 0x78

    .line 45
    .line 46
    if-gt v2, v0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getStringLength()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x5

    .line 53
    if-eq v0, v1, :cond_3

    .line 54
    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-eq v0, v1, :cond_2

    .line 58
    .line 59
    const/16 v1, 0x12

    .line 60
    .line 61
    if-eq v0, v1, :cond_1

    .line 62
    .line 63
    packed-switch v0, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    const-string v1, "not support len : "

    .line 67
    .line 68
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    return-object v0

    .line 77
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime12()Ljava/time/LocalTime;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime11()Ljava/time/LocalTime;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime10()Ljava/time/LocalTime;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime18()Ljava/time/LocalTime;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime8()Ljava/time/LocalTime;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0

    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLocalTime5()Ljava/time/LocalTime;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readLocalTime10()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x53

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime10([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xb

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalTime11()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x54

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime11([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xc

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalTime12()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x55

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime12([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public readLocalTime15()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x58

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime15([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalTime18()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x5b

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime18([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x13

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalTime5()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x4e

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime5([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x6

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public final readLocalTime8()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x51

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x9

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public readLocalTime9()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x51

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xa

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "date only support string input"

    .line 27
    .line 28
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public readMillis19()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x5c

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 14
    .line 15
    iget-object v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19([BILjava/time/ZoneId;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x14

    .line 24
    .line 25
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_0
    const-string v0, "date only support string input"

    .line 29
    .line 30
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    return-wide v0
.end method

.method public readNull()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 12
    .line 13
    const/16 v1, -0x51

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "null not match, "

    .line 19
    .line 20
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 21
    .line 22
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public readNullOrNewDate()Ljava/util/Date;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public readNumber()Ljava/lang/Number;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x10

    .line 12
    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x2f

    .line 16
    .line 17
    if-gt v3, v4, :cond_0

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/16 v4, 0x30

    .line 25
    .line 26
    if-lt v3, v4, :cond_1

    .line 27
    .line 28
    const/16 v4, 0x3f

    .line 29
    .line 30
    if-gt v3, v4, :cond_1

    .line 31
    .line 32
    add-int/lit8 v3, v3, -0x38

    .line 33
    .line 34
    shl-int/lit8 v3, v3, 0x8

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    aget-byte v0, v0, v2

    .line 41
    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    add-int/2addr v3, v0

    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_1
    const/16 v4, 0x40

    .line 51
    .line 52
    if-lt v3, v4, :cond_2

    .line 53
    .line 54
    const/16 v4, 0x47

    .line 55
    .line 56
    if-gt v3, v4, :cond_2

    .line 57
    .line 58
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_2
    const/16 v4, -0x28

    .line 74
    .line 75
    if-lt v3, v4, :cond_3

    .line 76
    .line 77
    const/16 v5, -0x11

    .line 78
    .line 79
    if-gt v3, v5, :cond_3

    .line 80
    .line 81
    sub-int/2addr v3, v4

    .line 82
    int-to-long v0, v3

    .line 83
    const-wide/16 v2, -0x8

    .line 84
    .line 85
    add-long/2addr v0, v2

    .line 86
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :cond_3
    const/16 v4, -0x38

    .line 92
    .line 93
    if-lt v3, v4, :cond_4

    .line 94
    .line 95
    const/16 v4, -0x29

    .line 96
    .line 97
    if-gt v3, v4, :cond_4

    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x30

    .line 100
    .line 101
    shl-int/lit8 v3, v3, 0x8

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x2

    .line 104
    .line 105
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 106
    .line 107
    aget-byte v0, v0, v2

    .line 108
    .line 109
    and-int/lit16 v0, v0, 0xff

    .line 110
    .line 111
    add-int/2addr v3, v0

    .line 112
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :cond_4
    const/16 v4, -0x40

    .line 118
    .line 119
    if-lt v3, v4, :cond_5

    .line 120
    .line 121
    const/16 v4, -0x39

    .line 122
    .line 123
    if-gt v3, v4, :cond_5

    .line 124
    .line 125
    add-int/lit8 v3, v3, 0x3c

    .line 126
    .line 127
    shl-int/lit8 v3, v3, 0x10

    .line 128
    .line 129
    add-int/lit8 v4, v1, 0x2

    .line 130
    .line 131
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 132
    .line 133
    aget-byte v2, v0, v2

    .line 134
    .line 135
    and-int/lit16 v2, v2, 0xff

    .line 136
    .line 137
    shl-int/lit8 v2, v2, 0x8

    .line 138
    .line 139
    add-int/2addr v3, v2

    .line 140
    add-int/lit8 v1, v1, 0x3

    .line 141
    .line 142
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 143
    .line 144
    aget-byte v0, v0, v4

    .line 145
    .line 146
    and-int/lit16 v0, v0, 0xff

    .line 147
    .line 148
    add-int/2addr v3, v0

    .line 149
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :cond_5
    const/16 v4, -0x6e

    .line 155
    .line 156
    if-eq v3, v4, :cond_d

    .line 157
    .line 158
    const/16 v4, 0x48

    .line 159
    .line 160
    if-eq v3, v4, :cond_c

    .line 161
    .line 162
    const/16 v4, 0x79

    .line 163
    .line 164
    if-eq v3, v4, :cond_b

    .line 165
    .line 166
    const/16 v4, 0x7a

    .line 167
    .line 168
    if-eq v3, v4, :cond_a

    .line 169
    .line 170
    packed-switch v3, :pswitch_data_0

    .line 171
    .line 172
    .line 173
    const/16 v0, 0x49

    .line 174
    .line 175
    if-lt v3, v0, :cond_6

    .line 176
    .line 177
    const/16 v1, 0x78

    .line 178
    .line 179
    if-gt v3, v1, :cond_6

    .line 180
    .line 181
    sub-int/2addr v3, v0

    .line 182
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 187
    .line 188
    add-int/2addr v1, v3

    .line 189
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 190
    .line 191
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    return-object v0

    .line 196
    :cond_6
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    throw v0

    .line 201
    :pswitch_0
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 206
    .line 207
    add-int/lit8 v1, v1, 0x4

    .line 208
    .line 209
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 210
    .line 211
    int-to-long v0, v0

    .line 212
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :pswitch_1
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 218
    .line 219
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 220
    .line 221
    int-to-long v5, v2

    .line 222
    add-long/2addr v3, v5

    .line 223
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 228
    .line 229
    add-int/lit8 v2, v2, 0x8

    .line 230
    .line 231
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 232
    .line 233
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 234
    .line 235
    if-eqz v2, :cond_7

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v0

    .line 242
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :pswitch_2
    add-int/lit8 v1, v1, 0x2

    .line 248
    .line 249
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 250
    .line 251
    aget-byte v0, v0, v2

    .line 252
    .line 253
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :pswitch_3
    add-int/lit8 v3, v1, 0x2

    .line 259
    .line 260
    aget-byte v3, v0, v3

    .line 261
    .line 262
    and-int/lit16 v3, v3, 0xff

    .line 263
    .line 264
    aget-byte v0, v0, v2

    .line 265
    .line 266
    shl-int/lit8 v0, v0, 0x8

    .line 267
    .line 268
    add-int/2addr v3, v0

    .line 269
    add-int/lit8 v1, v1, 0x3

    .line 270
    .line 271
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 272
    .line 273
    int-to-short v0, v3

    .line 274
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    new-array v1, v0, [B

    .line 284
    .line 285
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 286
    .line 287
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 288
    .line 289
    const/4 v4, 0x0

    .line 290
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 291
    .line 292
    .line 293
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 294
    .line 295
    add-int/2addr v2, v0

    .line 296
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 297
    .line 298
    new-instance v0, Ljava/math/BigInteger;

    .line 299
    .line 300
    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 305
    .line 306
    .line 307
    move-result-wide v0

    .line 308
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-nez v0, :cond_8

    .line 322
    .line 323
    new-instance v0, Ljava/math/BigDecimal;

    .line 324
    .line 325
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 326
    .line 327
    .line 328
    return-object v0

    .line 329
    :cond_8
    new-instance v2, Ljava/math/BigDecimal;

    .line 330
    .line 331
    invoke-direct {v2, v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 332
    .line 333
    .line 334
    return-object v2

    .line 335
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 336
    .line 337
    .line 338
    move-result-wide v0

    .line 339
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_8
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 349
    .line 350
    add-int/lit8 v1, v1, 0x4

    .line 351
    .line 352
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 353
    .line 354
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    return-object v0

    .line 363
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    int-to-float v0, v0

    .line 368
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    return-object v0

    .line 373
    :pswitch_a
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 374
    .line 375
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 376
    .line 377
    int-to-long v5, v2

    .line 378
    add-long/2addr v3, v5

    .line 379
    invoke-virtual {v1, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 380
    .line 381
    .line 382
    move-result-wide v0

    .line 383
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 384
    .line 385
    add-int/lit8 v2, v2, 0x8

    .line 386
    .line 387
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 388
    .line 389
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 390
    .line 391
    if-eqz v2, :cond_9

    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_9
    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 395
    .line 396
    .line 397
    move-result-wide v0

    .line 398
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 399
    .line 400
    .line 401
    move-result-wide v0

    .line 402
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    return-object v0

    .line 407
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 408
    .line 409
    .line 410
    move-result-wide v0

    .line 411
    long-to-double v0, v0

    .line 412
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    return-object v0

    .line 417
    :pswitch_c
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 418
    .line 419
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    return-object v0

    .line 424
    :pswitch_d
    const-wide/16 v0, 0x0

    .line 425
    .line 426
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    return-object v0

    .line 431
    :pswitch_e
    const/4 v0, 0x0

    .line 432
    return-object v0

    .line 433
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    new-instance v1, Ljava/lang/String;

    .line 438
    .line 439
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 440
    .line 441
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 442
    .line 443
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 444
    .line 445
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 446
    .line 447
    .line 448
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 449
    .line 450
    add-int/2addr v2, v0

    .line 451
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 452
    .line 453
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    return-object v0

    .line 458
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 463
    .line 464
    invoke-virtual {p0, v1, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getLatin1String(II)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 469
    .line 470
    add-int/2addr v2, v0

    .line 471
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 472
    .line 473
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    return-object v0

    .line 478
    :cond_c
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 483
    .line 484
    add-int/lit8 v1, v1, 0x4

    .line 485
    .line 486
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 487
    .line 488
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    const-string v1, "not support input type : "

    .line 498
    .line 499
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    const/4 v0, 0x0

    .line 507
    return-object v0

    .line 508
    nop

    .line 509
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public readNumber0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public readObject()Ljava/util/Map;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 6
    .line 7
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 8
    .line 9
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    add-int/lit8 v6, v5, 0x1

    .line 12
    .line 13
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    aget-byte v5, v1, v5

    .line 16
    .line 17
    iput-byte v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 18
    .line 19
    const/16 v6, -0x51

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    if-ne v5, v6, :cond_0

    .line 23
    .line 24
    return-object v7

    .line 25
    :cond_0
    const/16 v6, -0x5a

    .line 26
    .line 27
    if-lt v5, v6, :cond_20

    .line 28
    .line 29
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 30
    .line 31
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 32
    .line 33
    and-long/2addr v8, v3

    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    cmp-long v5, v8, v10

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    new-instance v2, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 58
    .line 59
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    aget-byte v8, v1, v5

    .line 65
    .line 66
    const/16 v9, -0x5b

    .line 67
    .line 68
    if-ne v8, v9, :cond_3

    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    return-object v2

    .line 75
    :cond_3
    const/16 v5, 0x49

    .line 76
    .line 77
    if-lt v8, v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readFieldName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    :goto_1
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    aget-byte v12, v1, v9

    .line 91
    .line 92
    const-string v13, ".."

    .line 93
    .line 94
    const/16 v14, -0x6d

    .line 95
    .line 96
    if-ne v12, v14, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-interface {v2, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :goto_2
    move/from16 v18, v6

    .line 112
    .line 113
    move-wide/from16 v16, v10

    .line 114
    .line 115
    move-object v10, v7

    .line 116
    goto/16 :goto_10

    .line 117
    .line 118
    :cond_5
    invoke-static {v5}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v0, v2, v8, v5}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    const/16 v15, 0x7e

    .line 127
    .line 128
    if-lt v12, v5, :cond_7

    .line 129
    .line 130
    if-gt v12, v15, :cond_7

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    move/from16 v18, v6

    .line 137
    .line 138
    move-wide/from16 v16, v10

    .line 139
    .line 140
    :goto_3
    move-object v10, v7

    .line 141
    goto/16 :goto_f

    .line 142
    .line 143
    :cond_7
    move-wide/from16 v16, v10

    .line 144
    .line 145
    const/16 v10, 0x2f

    .line 146
    .line 147
    const/16 v11, -0x10

    .line 148
    .line 149
    if-lt v12, v11, :cond_8

    .line 150
    .line 151
    if-gt v12, v10, :cond_8

    .line 152
    .line 153
    add-int/lit8 v9, v9, 0x1

    .line 154
    .line 155
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 156
    .line 157
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    :goto_4
    move/from16 v18, v6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_8
    const/16 v15, -0x4f

    .line 165
    .line 166
    if-ne v12, v15, :cond_9

    .line 167
    .line 168
    add-int/lit8 v9, v9, 0x1

    .line 169
    .line 170
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 171
    .line 172
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    const/16 v15, -0x50

    .line 176
    .line 177
    if-ne v12, v15, :cond_a

    .line 178
    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 180
    .line 181
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 182
    .line 183
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_a
    if-ne v12, v6, :cond_b

    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    goto :goto_4

    .line 193
    :cond_b
    const/16 v15, -0x42

    .line 194
    .line 195
    if-ne v12, v15, :cond_d

    .line 196
    .line 197
    add-int/lit8 v9, v9, 0x1

    .line 198
    .line 199
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 200
    .line 201
    sget-object v5, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 202
    .line 203
    sget-wide v10, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 204
    .line 205
    int-to-long v12, v9

    .line 206
    add-long/2addr v10, v12

    .line 207
    invoke-virtual {v5, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 208
    .line 209
    .line 210
    move-result-wide v9

    .line 211
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 212
    .line 213
    add-int/lit8 v5, v5, 0x8

    .line 214
    .line 215
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 216
    .line 217
    sget-boolean v5, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 218
    .line 219
    if-eqz v5, :cond_c

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_c
    invoke-static {v9, v10}, Ljava/lang/Long;->reverseBytes(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v9

    .line 226
    :goto_5
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    goto :goto_4

    .line 231
    :cond_d
    const/16 v15, 0x3f

    .line 232
    .line 233
    const/16 v6, 0x30

    .line 234
    .line 235
    const/16 v5, -0x6c

    .line 236
    .line 237
    if-lt v12, v5, :cond_1b

    .line 238
    .line 239
    const/16 v5, -0x5c

    .line 240
    .line 241
    if-gt v12, v5, :cond_1b

    .line 242
    .line 243
    add-int/lit8 v7, v9, 0x1

    .line 244
    .line 245
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 246
    .line 247
    if-ne v12, v5, :cond_10

    .line 248
    .line 249
    aget-byte v5, v1, v7

    .line 250
    .line 251
    if-lt v5, v11, :cond_e

    .line 252
    .line 253
    if-gt v5, v10, :cond_e

    .line 254
    .line 255
    add-int/lit8 v9, v9, 0x2

    .line 256
    .line 257
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_e
    if-lt v5, v6, :cond_f

    .line 261
    .line 262
    if-gt v5, v15, :cond_f

    .line 263
    .line 264
    add-int/lit8 v5, v5, -0x38

    .line 265
    .line 266
    shl-int/lit8 v5, v5, 0x8

    .line 267
    .line 268
    add-int/lit8 v6, v9, 0x2

    .line 269
    .line 270
    aget-byte v6, v1, v6

    .line 271
    .line 272
    and-int/lit16 v6, v6, 0xff

    .line 273
    .line 274
    add-int/2addr v5, v6

    .line 275
    add-int/lit8 v9, v9, 0x3

    .line 276
    .line 277
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    goto :goto_6

    .line 285
    :cond_10
    add-int/lit8 v5, v12, 0x6c

    .line 286
    .line 287
    :goto_6
    if-nez v5, :cond_13

    .line 288
    .line 289
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 290
    .line 291
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 292
    .line 293
    and-long/2addr v5, v3

    .line 294
    cmp-long v5, v5, v16

    .line 295
    .line 296
    if-eqz v5, :cond_11

    .line 297
    .line 298
    new-instance v5, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 301
    .line 302
    .line 303
    :goto_7
    const/4 v10, 0x0

    .line 304
    const/16 v15, -0x5a

    .line 305
    .line 306
    goto/16 :goto_d

    .line 307
    .line 308
    :cond_11
    iget-object v5, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 309
    .line 310
    iget-object v5, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 311
    .line 312
    if-eqz v5, :cond_12

    .line 313
    .line 314
    invoke-interface {v5}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    goto :goto_7

    .line 319
    :cond_12
    new-instance v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 320
    .line 321
    invoke-direct {v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_13
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 326
    .line 327
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 328
    .line 329
    and-long/2addr v6, v3

    .line 330
    cmp-long v6, v6, v16

    .line 331
    .line 332
    if-eqz v6, :cond_14

    .line 333
    .line 334
    new-instance v6, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_14
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 341
    .line 342
    iget-object v6, v6, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 343
    .line 344
    if-eqz v6, :cond_15

    .line 345
    .line 346
    invoke-interface {v6}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    check-cast v6, Ljava/util/List;

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_15
    new-instance v6, Lcom/alibaba/fastjson2/JSONArray;

    .line 354
    .line 355
    invoke-direct {v6, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 356
    .line 357
    .line 358
    :goto_8
    const/4 v7, 0x0

    .line 359
    :goto_9
    if-ge v7, v5, :cond_1a

    .line 360
    .line 361
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 362
    .line 363
    aget-byte v9, v1, v9

    .line 364
    .line 365
    if-ne v9, v14, :cond_17

    .line 366
    .line 367
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readReference()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    if-eqz v10, :cond_16

    .line 376
    .line 377
    invoke-interface {v6, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    const/4 v10, 0x0

    .line 381
    :goto_a
    const/16 v11, 0x49

    .line 382
    .line 383
    const/16 v12, 0x7e

    .line 384
    .line 385
    const/16 v15, -0x5a

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_16
    const/4 v10, 0x0

    .line 389
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    invoke-static {v9}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    invoke-virtual {v0, v6, v7, v9}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 397
    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_17
    const/4 v10, 0x0

    .line 401
    const/16 v11, 0x49

    .line 402
    .line 403
    const/16 v12, 0x7e

    .line 404
    .line 405
    if-lt v9, v11, :cond_18

    .line 406
    .line 407
    if-gt v9, v12, :cond_18

    .line 408
    .line 409
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    const/16 v15, -0x5a

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_18
    const/16 v15, -0x5a

    .line 417
    .line 418
    if-ne v9, v15, :cond_19

    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    goto :goto_b

    .line 425
    :cond_19
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    :goto_b
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_1a
    const/4 v10, 0x0

    .line 436
    const/16 v15, -0x5a

    .line 437
    .line 438
    move-object v5, v6

    .line 439
    :goto_d
    move/from16 v18, v15

    .line 440
    .line 441
    goto :goto_f

    .line 442
    :cond_1b
    move-object v10, v7

    .line 443
    const/16 v18, -0x5a

    .line 444
    .line 445
    if-lt v12, v6, :cond_1c

    .line 446
    .line 447
    if-gt v12, v15, :cond_1c

    .line 448
    .line 449
    add-int/lit8 v12, v12, -0x38

    .line 450
    .line 451
    shl-int/lit8 v5, v12, 0x8

    .line 452
    .line 453
    add-int/lit8 v9, v9, 0x1

    .line 454
    .line 455
    aget-byte v6, v1, v9

    .line 456
    .line 457
    and-int/lit16 v6, v6, 0xff

    .line 458
    .line 459
    add-int/2addr v5, v6

    .line 460
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 465
    .line 466
    add-int/lit8 v6, v6, 0x2

    .line 467
    .line 468
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_1c
    const/16 v5, 0x40

    .line 472
    .line 473
    if-lt v12, v5, :cond_1d

    .line 474
    .line 475
    const/16 v5, 0x47

    .line 476
    .line 477
    if-gt v12, v5, :cond_1d

    .line 478
    .line 479
    add-int/lit8 v9, v9, 0x1

    .line 480
    .line 481
    invoke-static {v1, v9, v12}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 486
    .line 487
    add-int/lit8 v6, v6, 0x3

    .line 488
    .line 489
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 490
    .line 491
    new-instance v6, Ljava/lang/Integer;

    .line 492
    .line 493
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 494
    .line 495
    .line 496
    :goto_e
    move-object v5, v6

    .line 497
    goto :goto_f

    .line 498
    :cond_1d
    const/16 v5, 0x48

    .line 499
    .line 500
    if-ne v12, v5, :cond_1e

    .line 501
    .line 502
    add-int/lit8 v9, v9, 0x1

    .line 503
    .line 504
    invoke-static {v1, v9}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt([BI)I

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 509
    .line 510
    add-int/lit8 v6, v6, 0x5

    .line 511
    .line 512
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 513
    .line 514
    new-instance v6, Ljava/lang/Integer;

    .line 515
    .line 516
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 517
    .line 518
    .line 519
    goto :goto_e

    .line 520
    :cond_1e
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    :goto_f
    if-nez v5, :cond_1f

    .line 525
    .line 526
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 527
    .line 528
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 529
    .line 530
    and-long/2addr v6, v3

    .line 531
    cmp-long v6, v6, v16

    .line 532
    .line 533
    if-eqz v6, :cond_1f

    .line 534
    .line 535
    goto :goto_10

    .line 536
    :cond_1f
    invoke-interface {v2, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    :goto_10
    move-object v7, v10

    .line 540
    move-wide/from16 v10, v16

    .line 541
    .line 542
    move/from16 v6, v18

    .line 543
    .line 544
    goto/16 :goto_0

    .line 545
    .line 546
    :cond_20
    const/16 v1, -0x6e

    .line 547
    .line 548
    if-ne v5, v1, :cond_21

    .line 549
    .line 550
    const-wide/16 v2, 0x0

    .line 551
    .line 552
    const-wide/16 v4, 0x0

    .line 553
    .line 554
    const-class v1, Ljava/util/Map;

    .line 555
    .line 556
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    const/4 v3, 0x0

    .line 561
    const/4 v2, 0x0

    .line 562
    move-object v0, v1

    .line 563
    move-object/from16 v1, p0

    .line 564
    .line 565
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/util/Map;

    .line 570
    .line 571
    return-object v0

    .line 572
    :cond_21
    invoke-static {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    throw v0
.end method

.method public readOffsetDateTime()Ljava/time/OffsetDateTime;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public readOffsetTime()Ljava/time/OffsetTime;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toOffsetTime()Ljava/time/OffsetTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public readPattern()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public readReference()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x6d

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isString()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->error(B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "reference not support input "

    .line 35
    .line 36
    invoke-static {v0, v1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    iput-byte v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 12
    .line 13
    const/16 v4, -0x51

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    return-object v5

    .line 19
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 20
    .line 21
    const/16 v4, 0x49

    .line 22
    .line 23
    if-lt v3, v4, :cond_d

    .line 24
    .line 25
    const/16 v6, 0x79

    .line 26
    .line 27
    if-gt v3, v6, :cond_d

    .line 28
    .line 29
    if-ne v3, v6, :cond_4

    .line 30
    .line 31
    aget-byte v2, v0, v2

    .line 32
    .line 33
    const/16 v3, -0x10

    .line 34
    .line 35
    if-lt v2, v3, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x2f

    .line 38
    .line 39
    if-gt v2, v3, :cond_1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 v3, 0x30

    .line 47
    .line 48
    if-lt v2, v3, :cond_2

    .line 49
    .line 50
    const/16 v3, 0x3f

    .line 51
    .line 52
    if-gt v2, v3, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, -0x38

    .line 55
    .line 56
    shl-int/lit8 v2, v2, 0x8

    .line 57
    .line 58
    add-int/lit8 v3, v1, 0x2

    .line 59
    .line 60
    aget-byte v0, v0, v3

    .line 61
    .line 62
    and-int/lit16 v0, v0, 0xff

    .line 63
    .line 64
    add-int/2addr v2, v0

    .line 65
    add-int/lit8 v1, v1, 0x3

    .line 66
    .line 67
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/16 v3, 0x40

    .line 71
    .line 72
    if-lt v2, v3, :cond_3

    .line 73
    .line 74
    const/16 v3, 0x47

    .line 75
    .line 76
    if-gt v2, v3, :cond_3

    .line 77
    .line 78
    add-int/lit8 v1, v1, 0x2

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getInt3([BII)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    add-int/lit8 v0, v0, 0x3

    .line 87
    .line 88
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    add-int/lit8 v2, v3, -0x49

    .line 101
    .line 102
    :goto_1
    if-gez v2, :cond_5

    .line 103
    .line 104
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 105
    .line 106
    neg-int v1, v2

    .line 107
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 113
    .line 114
    sget v0, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 115
    .line 116
    const/16 v1, 0x22

    .line 117
    .line 118
    if-ge v0, v1, :cond_a

    .line 119
    .line 120
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 125
    .line 126
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->cacheItem:Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 127
    .line 128
    invoke-virtual {v0, v1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, [C

    .line 133
    .line 134
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 135
    .line 136
    :cond_6
    if-eqz v0, :cond_7

    .line 137
    .line 138
    array-length v1, v0

    .line 139
    if-ge v1, v2, :cond_8

    .line 140
    .line 141
    :cond_7
    new-array v0, v2, [C

    .line 142
    .line 143
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->charBuf:[C

    .line 144
    .line 145
    :cond_8
    const/4 v1, 0x0

    .line 146
    move v3, v1

    .line 147
    :goto_2
    if-ge v3, v2, :cond_9

    .line 148
    .line 149
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 150
    .line 151
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 152
    .line 153
    add-int/2addr v6, v3

    .line 154
    aget-byte v4, v4, v6

    .line 155
    .line 156
    and-int/lit16 v4, v4, 0xff

    .line 157
    .line 158
    int-to-char v4, v4

    .line 159
    aput-char v4, v0, v3

    .line 160
    .line 161
    add-int/lit8 v3, v3, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_9
    new-instance v3, Ljava/lang/String;

    .line 165
    .line 166
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    new-instance v3, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 173
    .line 174
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 175
    .line 176
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 177
    .line 178
    invoke-direct {v3, v0, v1, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 182
    .line 183
    add-int/2addr v0, v2

    .line 184
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 185
    .line 186
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 187
    .line 188
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 189
    .line 190
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 191
    .line 192
    iget-wide v6, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 193
    .line 194
    and-long/2addr v0, v6

    .line 195
    const-wide/16 v6, 0x0

    .line 196
    .line 197
    cmp-long v0, v0, v6

    .line 198
    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    :cond_b
    if-nez v2, :cond_c

    .line 206
    .line 207
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 208
    .line 209
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 210
    .line 211
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 212
    .line 213
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 214
    .line 215
    and-long/2addr v0, v8

    .line 216
    cmp-long v0, v0, v6

    .line 217
    .line 218
    if-eqz v0, :cond_c

    .line 219
    .line 220
    return-object v5

    .line 221
    :cond_c
    return-object v3

    .line 222
    :cond_d
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readStringNonAscii()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0
.end method

.method public readStringArray()[Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->nextIfMatch(B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sget-wide v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplStringArray;->HASH_TYPE:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "not support type "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    return-object v0

    .line 47
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->startArray()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, -0x1

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0

    .line 56
    :cond_2
    new-array v1, v0, [Ljava/lang/String;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    :goto_1
    if-ge v2, v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    aput-object v3, v1, v2

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    return-object v1
.end method

.method public readTypeHashCode()J
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 8
    .line 9
    const/16 v3, 0x79

    .line 10
    .line 11
    if-ne v2, v3, :cond_5

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x1

    .line 14
    .line 15
    aget-byte v3, v0, v3

    .line 16
    .line 17
    const/16 v4, 0x8

    .line 18
    .line 19
    if-le v3, v4, :cond_5

    .line 20
    .line 21
    const/16 v5, 0x3f

    .line 22
    .line 23
    if-gt v3, v5, :cond_5

    .line 24
    .line 25
    const/16 v5, 0x2f

    .line 26
    .line 27
    if-gt v3, v5, :cond_0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/lit8 v3, v3, -0x38

    .line 33
    .line 34
    shl-int/2addr v3, v4

    .line 35
    add-int/lit8 v6, v1, 0x2

    .line 36
    .line 37
    aget-byte v6, v0, v6

    .line 38
    .line 39
    and-int/lit16 v6, v6, 0xff

    .line 40
    .line 41
    add-int/2addr v3, v6

    .line 42
    add-int/lit8 v1, v1, 0x3

    .line 43
    .line 44
    :goto_0
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    move v9, v1

    .line 51
    :goto_1
    if-ge v8, v3, :cond_1

    .line 52
    .line 53
    add-int/lit8 v10, v9, 0x1

    .line 54
    .line 55
    aget-byte v9, v0, v9

    .line 56
    .line 57
    int-to-long v11, v9

    .line 58
    xor-long/2addr v6, v11

    .line 59
    const-wide v11, 0x100000001b3L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v6, v11

    .line 65
    add-int/lit8 v8, v8, 0x1

    .line 66
    .line 67
    move v9, v10

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    aget-byte v0, v0, v9

    .line 70
    .line 71
    if-ltz v0, :cond_5

    .line 72
    .line 73
    if-gt v0, v5, :cond_5

    .line 74
    .line 75
    add-int/lit8 v9, v9, 0x1

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 80
    .line 81
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 82
    .line 83
    iput-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 84
    .line 85
    iput-wide v6, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    mul-int/lit8 v0, v0, 0x2

    .line 89
    .line 90
    add-int/lit8 v5, v0, 0x2

    .line 91
    .line 92
    iget-object v8, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 93
    .line 94
    const/16 v10, 0x20

    .line 95
    .line 96
    if-nez v8, :cond_3

    .line 97
    .line 98
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    new-array v5, v5, [J

    .line 103
    .line 104
    iput-object v5, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    array-length v11, v8

    .line 108
    if-ge v11, v5, :cond_4

    .line 109
    .line 110
    add-int/lit8 v5, v0, 0x12

    .line 111
    .line 112
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    iput-object v5, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 117
    .line 118
    :cond_4
    :goto_2
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 119
    .line 120
    add-int/lit8 v0, v0, 0x1

    .line 121
    .line 122
    int-to-long v11, v1

    .line 123
    shl-long v10, v11, v10

    .line 124
    .line 125
    int-to-long v12, v3

    .line 126
    shl-long/2addr v12, v4

    .line 127
    add-long/2addr v10, v12

    .line 128
    int-to-long v12, v2

    .line 129
    add-long/2addr v10, v12

    .line 130
    aput-wide v10, v5, v0

    .line 131
    .line 132
    :goto_3
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 133
    .line 134
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 135
    .line 136
    iput v9, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 137
    .line 138
    return-wide v6

    .line 139
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode0()J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    return-wide v0
.end method

.method public readTypeHashCode0()J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    aget-byte v3, v1, v2

    .line 8
    .line 9
    iput-byte v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 10
    .line 11
    const/16 v4, 0x7f

    .line 12
    .line 13
    const/16 v5, 0x48

    .line 14
    .line 15
    const/16 v6, 0x2f

    .line 16
    .line 17
    const/16 v7, -0x10

    .line 18
    .line 19
    const/16 v8, 0x20

    .line 20
    .line 21
    const-wide/16 v9, 0x0

    .line 22
    .line 23
    const/16 v11, 0x8

    .line 24
    .line 25
    if-ne v3, v4, :cond_5

    .line 26
    .line 27
    add-int/lit8 v3, v2, 0x1

    .line 28
    .line 29
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 30
    .line 31
    aget-byte v3, v1, v3

    .line 32
    .line 33
    iput-byte v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 34
    .line 35
    if-lt v3, v7, :cond_5

    .line 36
    .line 37
    if-gt v3, v5, :cond_5

    .line 38
    .line 39
    if-gt v3, v6, :cond_0

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x2

    .line 42
    .line 43
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_0
    if-gez v3, :cond_1

    .line 51
    .line 52
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 53
    .line 54
    neg-int v2, v3

    .line 55
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    return-wide v1

    .line 60
    :cond_1
    if-nez v3, :cond_3

    .line 61
    .line 62
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 63
    .line 64
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 65
    .line 66
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 67
    .line 68
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 69
    .line 70
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 71
    .line 72
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 73
    .line 74
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 75
    .line 76
    cmp-long v1, v1, v9

    .line 77
    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getNameHashCode()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    iput-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 85
    .line 86
    :cond_2
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 87
    .line 88
    return-wide v1

    .line 89
    :cond_3
    mul-int/lit8 v3, v3, 0x2

    .line 90
    .line 91
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 92
    .line 93
    add-int/lit8 v2, v3, 0x1

    .line 94
    .line 95
    aget-wide v4, v1, v2

    .line 96
    .line 97
    long-to-int v2, v4

    .line 98
    int-to-byte v6, v2

    .line 99
    iput-byte v6, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 100
    .line 101
    shr-int/2addr v2, v11

    .line 102
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 103
    .line 104
    shr-long/2addr v4, v8

    .line 105
    long-to-int v2, v4

    .line 106
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 107
    .line 108
    aget-wide v4, v1, v3

    .line 109
    .line 110
    cmp-long v1, v4, v9

    .line 111
    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getNameHashCode()J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 119
    .line 120
    aput-wide v1, v4, v3

    .line 121
    .line 122
    return-wide v1

    .line 123
    :cond_4
    return-wide v4

    .line 124
    :cond_5
    const/16 v2, 0x3f

    .line 125
    .line 126
    if-lt v3, v7, :cond_d

    .line 127
    .line 128
    if-gt v3, v5, :cond_d

    .line 129
    .line 130
    if-gt v3, v6, :cond_6

    .line 131
    .line 132
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 133
    .line 134
    add-int/lit8 v1, v1, 0x1

    .line 135
    .line 136
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 137
    .line 138
    move v5, v3

    .line 139
    goto :goto_1

    .line 140
    :cond_6
    if-gt v3, v2, :cond_7

    .line 141
    .line 142
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 143
    .line 144
    add-int/lit8 v4, v2, 0x1

    .line 145
    .line 146
    add-int/lit8 v5, v3, -0x38

    .line 147
    .line 148
    shl-int/2addr v5, v11

    .line 149
    add-int/lit8 v2, v2, 0x2

    .line 150
    .line 151
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 152
    .line 153
    aget-byte v1, v1, v4

    .line 154
    .line 155
    and-int/lit16 v1, v1, 0xff

    .line 156
    .line 157
    add-int/2addr v5, v1

    .line 158
    goto :goto_1

    .line 159
    :cond_7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    :goto_1
    if-nez v5, :cond_9

    .line 164
    .line 165
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 166
    .line 167
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 168
    .line 169
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 170
    .line 171
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 172
    .line 173
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 174
    .line 175
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 176
    .line 177
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 178
    .line 179
    cmp-long v1, v1, v9

    .line 180
    .line 181
    if-nez v1, :cond_8

    .line 182
    .line 183
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    iput-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 192
    .line 193
    :cond_8
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    if-gez v5, :cond_a

    .line 197
    .line 198
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 199
    .line 200
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 201
    .line 202
    neg-int v2, v5

    .line 203
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 204
    .line 205
    .line 206
    move-result-wide v1

    .line 207
    goto :goto_2

    .line 208
    :cond_a
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 209
    .line 210
    mul-int/lit8 v2, v5, 0x2

    .line 211
    .line 212
    aget-wide v3, v1, v2

    .line 213
    .line 214
    cmp-long v6, v3, v9

    .line 215
    .line 216
    if-nez v6, :cond_b

    .line 217
    .line 218
    add-int/lit8 v2, v2, 0x1

    .line 219
    .line 220
    aget-wide v2, v1, v2

    .line 221
    .line 222
    long-to-int v1, v2

    .line 223
    int-to-byte v4, v1

    .line 224
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 225
    .line 226
    shr-int/2addr v1, v11

    .line 227
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 228
    .line 229
    shr-long v1, v2, v8

    .line 230
    .line 231
    long-to-int v1, v1

    .line 232
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 239
    .line 240
    .line 241
    move-result-wide v1

    .line 242
    goto :goto_2

    .line 243
    :cond_b
    move-wide v1, v3

    .line 244
    :goto_2
    const-wide/16 v3, -0x1

    .line 245
    .line 246
    cmp-long v3, v1, v3

    .line 247
    .line 248
    if-eqz v3, :cond_c

    .line 249
    .line 250
    return-wide v1

    .line 251
    :cond_c
    invoke-static {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->typeRefNotFound(I)Lcom/alibaba/fastjson2/JSONException;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    throw v1

    .line 256
    :cond_d
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 257
    .line 258
    add-int/lit8 v5, v4, 0x1

    .line 259
    .line 260
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 261
    .line 262
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 263
    .line 264
    const/16 v12, 0x30

    .line 265
    .line 266
    const/16 v13, 0x7d

    .line 267
    .line 268
    const/16 v14, 0x7c

    .line 269
    .line 270
    const/16 v15, 0x7b

    .line 271
    .line 272
    move-wide/from16 v16, v9

    .line 273
    .line 274
    const/16 v9, 0x7a

    .line 275
    .line 276
    const/16 v10, 0x49

    .line 277
    .line 278
    const/16 v18, 0x38

    .line 279
    .line 280
    if-lt v3, v10, :cond_e

    .line 281
    .line 282
    const/16 v10, 0x78

    .line 283
    .line 284
    if-gt v3, v10, :cond_e

    .line 285
    .line 286
    add-int/lit8 v2, v3, -0x49

    .line 287
    .line 288
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_e
    const/16 v10, 0x79

    .line 292
    .line 293
    if-eq v3, v10, :cond_10

    .line 294
    .line 295
    if-eq v3, v9, :cond_10

    .line 296
    .line 297
    if-eq v3, v15, :cond_10

    .line 298
    .line 299
    if-eq v3, v14, :cond_10

    .line 300
    .line 301
    if-ne v3, v13, :cond_f

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_f
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readStringError()Lcom/alibaba/fastjson2/JSONException;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    throw v1

    .line 309
    :cond_10
    :goto_3
    aget-byte v5, v1, v5

    .line 310
    .line 311
    if-lt v5, v7, :cond_11

    .line 312
    .line 313
    if-gt v5, v6, :cond_11

    .line 314
    .line 315
    add-int/lit8 v4, v4, 0x2

    .line 316
    .line 317
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 318
    .line 319
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_11
    if-lt v5, v12, :cond_12

    .line 323
    .line 324
    if-gt v5, v2, :cond_12

    .line 325
    .line 326
    add-int/lit8 v2, v4, 0x2

    .line 327
    .line 328
    add-int/lit8 v5, v5, -0x38

    .line 329
    .line 330
    shl-int/2addr v5, v11

    .line 331
    add-int/lit8 v4, v4, 0x3

    .line 332
    .line 333
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 334
    .line 335
    aget-byte v2, v1, v2

    .line 336
    .line 337
    and-int/lit16 v2, v2, 0xff

    .line 338
    .line 339
    add-int/2addr v5, v2

    .line 340
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_12
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 348
    .line 349
    :goto_4
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 350
    .line 351
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 352
    .line 353
    :goto_5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 354
    .line 355
    if-gez v2, :cond_13

    .line 356
    .line 357
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 358
    .line 359
    neg-int v2, v2

    .line 360
    invoke-virtual {v4, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 361
    .line 362
    .line 363
    move-result-wide v4

    .line 364
    goto/16 :goto_12

    .line 365
    .line 366
    :cond_13
    const-wide v4, 0x100000001b3L

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    const-wide v19, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    if-ne v3, v9, :cond_16

    .line 377
    .line 378
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 379
    .line 380
    add-int/2addr v9, v2

    .line 381
    :goto_6
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 382
    .line 383
    if-ge v2, v9, :cond_15

    .line 384
    .line 385
    aget-byte v10, v1, v2

    .line 386
    .line 387
    if-ltz v10, :cond_14

    .line 388
    .line 389
    add-int/lit8 v2, v2, 0x1

    .line 390
    .line 391
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_14
    and-int/lit16 v10, v10, 0xff

    .line 395
    .line 396
    shr-int/lit8 v12, v10, 0x4

    .line 397
    .line 398
    packed-switch v12, :pswitch_data_0

    .line 399
    .line 400
    .line 401
    const-string v1, "malformed input around byte "

    .line 402
    .line 403
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 404
    .line 405
    invoke-static {v2, v1}, Lah/a;->y(ILjava/lang/String;)V

    .line 406
    .line 407
    .line 408
    const-wide/16 v1, 0x0

    .line 409
    .line 410
    return-wide v1

    .line 411
    :pswitch_0
    add-int/lit8 v12, v2, 0x1

    .line 412
    .line 413
    aget-byte v12, v1, v12

    .line 414
    .line 415
    add-int/lit8 v13, v2, 0x2

    .line 416
    .line 417
    aget-byte v13, v1, v13

    .line 418
    .line 419
    invoke-static {v10, v12, v13, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 424
    .line 425
    add-int/lit8 v2, v2, 0x3

    .line 426
    .line 427
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 428
    .line 429
    goto :goto_7

    .line 430
    :pswitch_1
    add-int/lit8 v12, v2, 0x1

    .line 431
    .line 432
    aget-byte v12, v1, v12

    .line 433
    .line 434
    invoke-static {v10, v12, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 439
    .line 440
    add-int/lit8 v2, v2, 0x2

    .line 441
    .line 442
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 443
    .line 444
    :goto_7
    int-to-long v12, v10

    .line 445
    xor-long v12, v19, v12

    .line 446
    .line 447
    mul-long v19, v12, v4

    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_15
    move-wide/from16 v4, v19

    .line 451
    .line 452
    goto/16 :goto_12

    .line 453
    .line 454
    :cond_16
    const/4 v9, 0x0

    .line 455
    if-eq v3, v15, :cond_17

    .line 456
    .line 457
    if-ne v3, v13, :cond_18

    .line 458
    .line 459
    :cond_17
    move-wide/from16 v21, v4

    .line 460
    .line 461
    goto/16 :goto_10

    .line 462
    .line 463
    :cond_18
    if-ne v3, v14, :cond_19

    .line 464
    .line 465
    :goto_8
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 466
    .line 467
    if-ge v9, v2, :cond_15

    .line 468
    .line 469
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 470
    .line 471
    add-int v10, v2, v9

    .line 472
    .line 473
    aget-byte v10, v1, v10

    .line 474
    .line 475
    add-int/2addr v2, v9

    .line 476
    add-int/lit8 v2, v2, 0x1

    .line 477
    .line 478
    aget-byte v2, v1, v2

    .line 479
    .line 480
    and-int/lit16 v10, v10, 0xff

    .line 481
    .line 482
    and-int/lit16 v2, v2, 0xff

    .line 483
    .line 484
    shl-int/2addr v2, v11

    .line 485
    or-int/2addr v2, v10

    .line 486
    int-to-char v2, v2

    .line 487
    int-to-long v12, v2

    .line 488
    xor-long v12, v19, v12

    .line 489
    .line 490
    mul-long v19, v12, v4

    .line 491
    .line 492
    add-int/lit8 v9, v9, 0x2

    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_19
    if-gt v2, v11, :cond_1d

    .line 496
    .line 497
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 498
    .line 499
    move v10, v9

    .line 500
    move-wide/from16 v13, v16

    .line 501
    .line 502
    :goto_9
    iget v15, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 503
    .line 504
    if-ge v10, v15, :cond_1c

    .line 505
    .line 506
    iget v15, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 507
    .line 508
    move-wide/from16 v21, v4

    .line 509
    .line 510
    aget-byte v4, v1, v15

    .line 511
    .line 512
    if-ltz v4, :cond_1b

    .line 513
    .line 514
    if-nez v4, :cond_1a

    .line 515
    .line 516
    aget-byte v5, v1, v2

    .line 517
    .line 518
    if-nez v5, :cond_1a

    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_1a
    packed-switch v10, :pswitch_data_1

    .line 522
    .line 523
    .line 524
    goto :goto_b

    .line 525
    :pswitch_2
    int-to-long v4, v4

    .line 526
    shl-long v4, v4, v18

    .line 527
    .line 528
    const-wide v23, 0xffffffffffffffL

    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    :goto_a
    and-long v13, v13, v23

    .line 534
    .line 535
    add-long/2addr v13, v4

    .line 536
    goto :goto_b

    .line 537
    :pswitch_3
    int-to-long v4, v4

    .line 538
    shl-long/2addr v4, v12

    .line 539
    const-wide v23, 0xffffffffffffL

    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :pswitch_4
    int-to-long v4, v4

    .line 546
    const/16 v23, 0x28

    .line 547
    .line 548
    shl-long v4, v4, v23

    .line 549
    .line 550
    const-wide v23, 0xffffffffffL

    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    goto :goto_a

    .line 556
    :pswitch_5
    int-to-long v4, v4

    .line 557
    shl-long/2addr v4, v8

    .line 558
    const-wide v23, 0xffffffffL

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    goto :goto_a

    .line 564
    :pswitch_6
    shl-int/lit8 v4, v4, 0x18

    .line 565
    .line 566
    int-to-long v4, v4

    .line 567
    const-wide/32 v23, 0xffffff

    .line 568
    .line 569
    .line 570
    goto :goto_a

    .line 571
    :pswitch_7
    shl-int/lit8 v4, v4, 0x10

    .line 572
    .line 573
    int-to-long v4, v4

    .line 574
    const-wide/32 v23, 0xffff

    .line 575
    .line 576
    .line 577
    goto :goto_a

    .line 578
    :pswitch_8
    shl-int/lit8 v4, v4, 0x8

    .line 579
    .line 580
    int-to-long v4, v4

    .line 581
    const-wide/16 v23, 0xff

    .line 582
    .line 583
    goto :goto_a

    .line 584
    :pswitch_9
    int-to-long v13, v4

    .line 585
    :goto_b
    add-int/lit8 v15, v15, 0x1

    .line 586
    .line 587
    iput v15, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 588
    .line 589
    add-int/lit8 v10, v10, 0x1

    .line 590
    .line 591
    move-wide/from16 v4, v21

    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_1b
    :goto_c
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 595
    .line 596
    :goto_d
    move-wide/from16 v4, v16

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_1c
    move-wide/from16 v21, v4

    .line 600
    .line 601
    move-wide v4, v13

    .line 602
    goto :goto_e

    .line 603
    :cond_1d
    move-wide/from16 v21, v4

    .line 604
    .line 605
    goto :goto_d

    .line 606
    :goto_e
    cmp-long v2, v4, v16

    .line 607
    .line 608
    if-eqz v2, :cond_1e

    .line 609
    .line 610
    goto :goto_12

    .line 611
    :cond_1e
    move-wide/from16 v4, v19

    .line 612
    .line 613
    :goto_f
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 614
    .line 615
    if-ge v9, v2, :cond_1f

    .line 616
    .line 617
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 618
    .line 619
    add-int/lit8 v10, v2, 0x1

    .line 620
    .line 621
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 622
    .line 623
    aget-byte v2, v1, v2

    .line 624
    .line 625
    int-to-long v12, v2

    .line 626
    xor-long/2addr v4, v12

    .line 627
    mul-long v4, v4, v21

    .line 628
    .line 629
    add-int/lit8 v9, v9, 0x1

    .line 630
    .line 631
    goto :goto_f

    .line 632
    :goto_10
    move-wide/from16 v4, v19

    .line 633
    .line 634
    :goto_11
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 635
    .line 636
    if-ge v9, v2, :cond_1f

    .line 637
    .line 638
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 639
    .line 640
    add-int v10, v2, v9

    .line 641
    .line 642
    aget-byte v10, v1, v10

    .line 643
    .line 644
    add-int/2addr v2, v9

    .line 645
    add-int/lit8 v2, v2, 0x1

    .line 646
    .line 647
    aget-byte v2, v1, v2

    .line 648
    .line 649
    and-int/lit16 v2, v2, 0xff

    .line 650
    .line 651
    and-int/lit16 v10, v10, 0xff

    .line 652
    .line 653
    shl-int/2addr v10, v11

    .line 654
    or-int/2addr v2, v10

    .line 655
    int-to-char v2, v2

    .line 656
    int-to-long v12, v2

    .line 657
    xor-long/2addr v4, v12

    .line 658
    mul-long v4, v4, v21

    .line 659
    .line 660
    add-int/lit8 v9, v9, 0x2

    .line 661
    .line 662
    goto :goto_11

    .line 663
    :cond_1f
    :goto_12
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 664
    .line 665
    aget-byte v1, v1, v2

    .line 666
    .line 667
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 668
    .line 669
    if-lt v1, v7, :cond_20

    .line 670
    .line 671
    if-gt v1, v6, :cond_20

    .line 672
    .line 673
    add-int/lit8 v2, v2, 0x1

    .line 674
    .line 675
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 676
    .line 677
    goto :goto_13

    .line 678
    :cond_20
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    :goto_13
    if-nez v1, :cond_21

    .line 683
    .line 684
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 685
    .line 686
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Begin:I

    .line 687
    .line 688
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 689
    .line 690
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Length:I

    .line 691
    .line 692
    iput-byte v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0StrType:B

    .line 693
    .line 694
    iput-wide v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbol0Hash:J

    .line 695
    .line 696
    return-wide v4

    .line 697
    :cond_21
    mul-int/lit8 v1, v1, 0x2

    .line 698
    .line 699
    add-int/lit8 v2, v1, 0x2

    .line 700
    .line 701
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 702
    .line 703
    if-nez v6, :cond_22

    .line 704
    .line 705
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    new-array v2, v2, [J

    .line 710
    .line 711
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 712
    .line 713
    goto :goto_14

    .line 714
    :cond_22
    array-length v7, v6

    .line 715
    if-ge v7, v2, :cond_23

    .line 716
    .line 717
    add-int/lit8 v2, v1, 0x12

    .line 718
    .line 719
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    iput-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 724
    .line 725
    :cond_23
    :goto_14
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 726
    .line 727
    int-to-long v6, v2

    .line 728
    shl-long/2addr v6, v8

    .line 729
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 730
    .line 731
    int-to-long v8, v2

    .line 732
    shl-long/2addr v8, v11

    .line 733
    add-long/2addr v6, v8

    .line 734
    int-to-long v2, v3

    .line 735
    add-long/2addr v6, v2

    .line 736
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbols:[J

    .line 737
    .line 738
    add-int/lit8 v1, v1, 0x1

    .line 739
    .line 740
    aput-wide v6, v2, v1

    .line 741
    .line 742
    return-wide v4

    .line 743
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    :pswitch_data_1
    .packed-switch 0x0
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

.method public readUUID()Ljava/util/UUID;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    aget-byte v4, v1, v2

    .line 12
    .line 13
    const/16 v5, -0x6f

    .line 14
    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    if-eq v4, v5, :cond_17

    .line 18
    .line 19
    const/16 v5, -0x51

    .line 20
    .line 21
    if-eq v4, v5, :cond_16

    .line 22
    .line 23
    const/16 v5, 0x69

    .line 24
    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    if-eq v4, v5, :cond_13

    .line 28
    .line 29
    const/16 v5, 0x6d

    .line 30
    .line 31
    const-string v12, "Invalid UUID string:  "

    .line 32
    .line 33
    const/16 v15, 0xe

    .line 34
    .line 35
    const/16 v16, 0x9

    .line 36
    .line 37
    const/16 v7, 0x17

    .line 38
    .line 39
    const/16 v17, 0x4

    .line 40
    .line 41
    const/16 v9, 0x12

    .line 42
    .line 43
    const/16 v10, 0xd

    .line 44
    .line 45
    const/16 v11, 0x8

    .line 46
    .line 47
    const/16 v20, 0x18

    .line 48
    .line 49
    const/16 v13, 0x24

    .line 50
    .line 51
    const/16 v14, 0x2d

    .line 52
    .line 53
    if-eq v4, v5, :cond_c

    .line 54
    .line 55
    const/16 v2, 0x79

    .line 56
    .line 57
    if-eq v4, v2, :cond_1

    .line 58
    .line 59
    const/16 v2, 0x7a

    .line 60
    .line 61
    if-ne v4, v2, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    throw v1

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-ne v2, v8, :cond_4

    .line 74
    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    :goto_1
    if-ge v7, v6, :cond_2

    .line 79
    .line 80
    shl-long v2, v2, v17

    .line 81
    .line 82
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 83
    .line 84
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    add-int/2addr v5, v7

    .line 87
    aget-byte v5, v1, v5

    .line 88
    .line 89
    add-int/lit8 v5, v5, -0x30

    .line 90
    .line 91
    aget-byte v4, v4, v5

    .line 92
    .line 93
    int-to-long v4, v4

    .line 94
    add-long/2addr v2, v4

    .line 95
    add-int/lit8 v7, v7, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const-wide/16 v10, 0x0

    .line 99
    .line 100
    :goto_2
    if-ge v6, v8, :cond_3

    .line 101
    .line 102
    shl-long v4, v10, v17

    .line 103
    .line 104
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 105
    .line 106
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 107
    .line 108
    add-int/2addr v9, v6

    .line 109
    aget-byte v9, v1, v9

    .line 110
    .line 111
    add-int/lit8 v9, v9, -0x30

    .line 112
    .line 113
    aget-byte v7, v7, v9

    .line 114
    .line 115
    int-to-long v9, v7

    .line 116
    add-long v10, v4, v9

    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    add-int/2addr v1, v8

    .line 124
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 125
    .line 126
    goto/16 :goto_13

    .line 127
    .line 128
    :cond_4
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 129
    .line 130
    if-ne v2, v13, :cond_b

    .line 131
    .line 132
    add-int/lit8 v2, v3, 0x8

    .line 133
    .line 134
    aget-byte v2, v1, v2

    .line 135
    .line 136
    add-int/lit8 v4, v3, 0xd

    .line 137
    .line 138
    aget-byte v4, v1, v4

    .line 139
    .line 140
    add-int/lit8 v5, v3, 0x12

    .line 141
    .line 142
    aget-byte v5, v1, v5

    .line 143
    .line 144
    add-int/2addr v3, v7

    .line 145
    aget-byte v3, v1, v3

    .line 146
    .line 147
    if-ne v2, v14, :cond_a

    .line 148
    .line 149
    if-ne v4, v14, :cond_a

    .line 150
    .line 151
    if-ne v5, v14, :cond_a

    .line 152
    .line 153
    if-ne v3, v14, :cond_a

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    const-wide/16 v3, 0x0

    .line 157
    .line 158
    :goto_3
    if-ge v2, v11, :cond_5

    .line 159
    .line 160
    shl-long v3, v3, v17

    .line 161
    .line 162
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 163
    .line 164
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 165
    .line 166
    add-int/2addr v6, v2

    .line 167
    aget-byte v6, v1, v6

    .line 168
    .line 169
    add-int/lit8 v6, v6, -0x30

    .line 170
    .line 171
    aget-byte v5, v5, v6

    .line 172
    .line 173
    int-to-long v5, v5

    .line 174
    add-long/2addr v3, v5

    .line 175
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    move/from16 v2, v16

    .line 179
    .line 180
    :goto_4
    if-ge v2, v10, :cond_6

    .line 181
    .line 182
    shl-long v3, v3, v17

    .line 183
    .line 184
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 185
    .line 186
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 187
    .line 188
    add-int/2addr v6, v2

    .line 189
    aget-byte v6, v1, v6

    .line 190
    .line 191
    add-int/lit8 v6, v6, -0x30

    .line 192
    .line 193
    aget-byte v5, v5, v6

    .line 194
    .line 195
    int-to-long v5, v5

    .line 196
    add-long/2addr v3, v5

    .line 197
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    :goto_5
    if-ge v15, v9, :cond_7

    .line 201
    .line 202
    shl-long v2, v3, v17

    .line 203
    .line 204
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 205
    .line 206
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 207
    .line 208
    add-int/2addr v5, v15

    .line 209
    aget-byte v5, v1, v5

    .line 210
    .line 211
    add-int/lit8 v5, v5, -0x30

    .line 212
    .line 213
    aget-byte v4, v4, v5

    .line 214
    .line 215
    int-to-long v4, v4

    .line 216
    add-long v3, v2, v4

    .line 217
    .line 218
    add-int/lit8 v15, v15, 0x1

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_7
    const-wide/16 v10, 0x0

    .line 222
    .line 223
    const/16 v14, 0x13

    .line 224
    .line 225
    :goto_6
    if-ge v14, v7, :cond_8

    .line 226
    .line 227
    shl-long v5, v10, v17

    .line 228
    .line 229
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 230
    .line 231
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 232
    .line 233
    add-int/2addr v8, v14

    .line 234
    aget-byte v8, v1, v8

    .line 235
    .line 236
    add-int/lit8 v8, v8, -0x30

    .line 237
    .line 238
    aget-byte v2, v2, v8

    .line 239
    .line 240
    int-to-long v8, v2

    .line 241
    add-long v10, v5, v8

    .line 242
    .line 243
    add-int/lit8 v14, v14, 0x1

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_8
    move/from16 v2, v20

    .line 247
    .line 248
    :goto_7
    if-ge v2, v13, :cond_9

    .line 249
    .line 250
    shl-long v5, v10, v17

    .line 251
    .line 252
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 253
    .line 254
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 255
    .line 256
    add-int/2addr v8, v2

    .line 257
    aget-byte v8, v1, v8

    .line 258
    .line 259
    add-int/lit8 v8, v8, -0x30

    .line 260
    .line 261
    aget-byte v7, v7, v8

    .line 262
    .line 263
    int-to-long v7, v7

    .line 264
    add-long v10, v5, v7

    .line 265
    .line 266
    add-int/lit8 v2, v2, 0x1

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_9
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 270
    .line 271
    add-int/2addr v1, v13

    .line 272
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 273
    .line 274
    move-wide/from16 v18, v10

    .line 275
    .line 276
    move-wide v10, v3

    .line 277
    goto :goto_8

    .line 278
    :cond_a
    const-wide/16 v10, 0x0

    .line 279
    .line 280
    const-wide/16 v18, 0x0

    .line 281
    .line 282
    :goto_8
    move-wide v2, v10

    .line 283
    move-wide/from16 v10, v18

    .line 284
    .line 285
    goto/16 :goto_13

    .line 286
    .line 287
    :cond_b
    new-instance v4, Ljava/lang/String;

    .line 288
    .line 289
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 290
    .line 291
    invoke-direct {v4, v1, v3, v2, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 292
    .line 293
    .line 294
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 295
    .line 296
    add-int/2addr v1, v2

    .line 297
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 298
    .line 299
    invoke-virtual {v12, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const/4 v1, 0x0

    .line 307
    return-object v1

    .line 308
    :cond_c
    add-int/lit8 v4, v2, 0x9

    .line 309
    .line 310
    aget-byte v4, v1, v4

    .line 311
    .line 312
    add-int/lit8 v5, v2, 0xe

    .line 313
    .line 314
    aget-byte v5, v1, v5

    .line 315
    .line 316
    add-int/lit8 v6, v2, 0x13

    .line 317
    .line 318
    aget-byte v6, v1, v6

    .line 319
    .line 320
    add-int/lit8 v2, v2, 0x18

    .line 321
    .line 322
    aget-byte v2, v1, v2

    .line 323
    .line 324
    if-ne v4, v14, :cond_12

    .line 325
    .line 326
    if-ne v5, v14, :cond_12

    .line 327
    .line 328
    if-ne v6, v14, :cond_12

    .line 329
    .line 330
    if-ne v2, v14, :cond_12

    .line 331
    .line 332
    const/4 v2, 0x0

    .line 333
    const-wide/16 v3, 0x0

    .line 334
    .line 335
    :goto_9
    if-ge v2, v11, :cond_d

    .line 336
    .line 337
    shl-long v3, v3, v17

    .line 338
    .line 339
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 340
    .line 341
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 342
    .line 343
    add-int/2addr v6, v2

    .line 344
    aget-byte v6, v1, v6

    .line 345
    .line 346
    add-int/lit8 v6, v6, -0x30

    .line 347
    .line 348
    aget-byte v5, v5, v6

    .line 349
    .line 350
    int-to-long v5, v5

    .line 351
    add-long/2addr v3, v5

    .line 352
    add-int/lit8 v2, v2, 0x1

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_d
    move/from16 v2, v16

    .line 356
    .line 357
    :goto_a
    if-ge v2, v10, :cond_e

    .line 358
    .line 359
    shl-long v3, v3, v17

    .line 360
    .line 361
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 362
    .line 363
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 364
    .line 365
    add-int/2addr v6, v2

    .line 366
    aget-byte v6, v1, v6

    .line 367
    .line 368
    add-int/lit8 v6, v6, -0x30

    .line 369
    .line 370
    aget-byte v5, v5, v6

    .line 371
    .line 372
    int-to-long v5, v5

    .line 373
    add-long/2addr v3, v5

    .line 374
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_e
    move-wide v2, v3

    .line 378
    :goto_b
    if-ge v15, v9, :cond_f

    .line 379
    .line 380
    shl-long v2, v2, v17

    .line 381
    .line 382
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 383
    .line 384
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 385
    .line 386
    add-int/2addr v5, v15

    .line 387
    aget-byte v5, v1, v5

    .line 388
    .line 389
    add-int/lit8 v5, v5, -0x30

    .line 390
    .line 391
    aget-byte v4, v4, v5

    .line 392
    .line 393
    int-to-long v4, v4

    .line 394
    add-long/2addr v2, v4

    .line 395
    add-int/lit8 v15, v15, 0x1

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :cond_f
    const-wide/16 v10, 0x0

    .line 399
    .line 400
    const/16 v14, 0x13

    .line 401
    .line 402
    :goto_c
    if-ge v14, v7, :cond_10

    .line 403
    .line 404
    shl-long v4, v10, v17

    .line 405
    .line 406
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 407
    .line 408
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 409
    .line 410
    add-int/2addr v8, v14

    .line 411
    aget-byte v8, v1, v8

    .line 412
    .line 413
    add-int/lit8 v8, v8, -0x30

    .line 414
    .line 415
    aget-byte v6, v6, v8

    .line 416
    .line 417
    int-to-long v8, v6

    .line 418
    add-long v10, v4, v8

    .line 419
    .line 420
    add-int/lit8 v14, v14, 0x1

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_10
    move/from16 v4, v20

    .line 424
    .line 425
    :goto_d
    if-ge v4, v13, :cond_11

    .line 426
    .line 427
    shl-long v5, v10, v17

    .line 428
    .line 429
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 430
    .line 431
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 432
    .line 433
    add-int/2addr v8, v4

    .line 434
    aget-byte v8, v1, v8

    .line 435
    .line 436
    add-int/lit8 v8, v8, -0x30

    .line 437
    .line 438
    aget-byte v7, v7, v8

    .line 439
    .line 440
    int-to-long v7, v7

    .line 441
    add-long v10, v5, v7

    .line 442
    .line 443
    add-int/lit8 v4, v4, 0x1

    .line 444
    .line 445
    goto :goto_d

    .line 446
    :cond_11
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 447
    .line 448
    add-int/2addr v1, v13

    .line 449
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 450
    .line 451
    goto/16 :goto_13

    .line 452
    .line 453
    :cond_12
    new-instance v2, Ljava/lang/String;

    .line 454
    .line 455
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 456
    .line 457
    invoke-direct {v2, v1, v3, v13, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    const/4 v1, 0x0

    .line 468
    return-object v1

    .line 469
    :cond_13
    const/16 v17, 0x4

    .line 470
    .line 471
    const-wide/16 v2, 0x0

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    :goto_e
    if-ge v7, v6, :cond_14

    .line 475
    .line 476
    shl-long v2, v2, v17

    .line 477
    .line 478
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 479
    .line 480
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 481
    .line 482
    add-int/2addr v5, v7

    .line 483
    aget-byte v5, v1, v5

    .line 484
    .line 485
    add-int/lit8 v5, v5, -0x30

    .line 486
    .line 487
    aget-byte v4, v4, v5

    .line 488
    .line 489
    int-to-long v4, v4

    .line 490
    add-long/2addr v2, v4

    .line 491
    add-int/lit8 v7, v7, 0x1

    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_14
    const-wide/16 v10, 0x0

    .line 495
    .line 496
    :goto_f
    if-ge v6, v8, :cond_15

    .line 497
    .line 498
    shl-long v4, v10, v17

    .line 499
    .line 500
    sget-object v7, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 501
    .line 502
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 503
    .line 504
    add-int/2addr v9, v6

    .line 505
    aget-byte v9, v1, v9

    .line 506
    .line 507
    add-int/lit8 v9, v9, -0x30

    .line 508
    .line 509
    aget-byte v7, v7, v9

    .line 510
    .line 511
    int-to-long v9, v7

    .line 512
    add-long v10, v4, v9

    .line 513
    .line 514
    add-int/lit8 v6, v6, 0x1

    .line 515
    .line 516
    goto :goto_f

    .line 517
    :cond_15
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 518
    .line 519
    add-int/2addr v1, v8

    .line 520
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 521
    .line 522
    goto :goto_13

    .line 523
    :cond_16
    const/4 v1, 0x0

    .line 524
    return-object v1

    .line 525
    :cond_17
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-ne v2, v6, :cond_1a

    .line 530
    .line 531
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 532
    .line 533
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 534
    .line 535
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 536
    .line 537
    int-to-long v7, v5

    .line 538
    add-long/2addr v7, v3

    .line 539
    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 540
    .line 541
    .line 542
    move-result-wide v7

    .line 543
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 544
    .line 545
    int-to-long v9, v5

    .line 546
    add-long/2addr v3, v9

    .line 547
    const-wide/16 v9, 0x8

    .line 548
    .line 549
    add-long/2addr v3, v9

    .line 550
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 551
    .line 552
    .line 553
    move-result-wide v1

    .line 554
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 555
    .line 556
    add-int/2addr v3, v6

    .line 557
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 558
    .line 559
    sget-boolean v3, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 560
    .line 561
    if-eqz v3, :cond_18

    .line 562
    .line 563
    move-wide v4, v7

    .line 564
    goto :goto_10

    .line 565
    :cond_18
    invoke-static {v7, v8}, Ljava/lang/Long;->reverseBytes(J)J

    .line 566
    .line 567
    .line 568
    move-result-wide v4

    .line 569
    :goto_10
    if-eqz v3, :cond_19

    .line 570
    .line 571
    :goto_11
    move-wide v10, v1

    .line 572
    goto :goto_12

    .line 573
    :cond_19
    invoke-static {v1, v2}, Ljava/lang/Long;->reverseBytes(J)J

    .line 574
    .line 575
    .line 576
    move-result-wide v1

    .line 577
    goto :goto_11

    .line 578
    :goto_12
    move-wide v2, v4

    .line 579
    :goto_13
    new-instance v1, Ljava/util/UUID;

    .line 580
    .line 581
    invoke-direct {v1, v2, v3, v10, v11}, Ljava/util/UUID;-><init>(JJ)V

    .line 582
    .line 583
    .line 584
    return-object v1

    .line 585
    :cond_1a
    const-string v1, "uuid not support "

    .line 586
    .line 587
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    const/4 v1, 0x0

    .line 595
    return-object v1
.end method

.method public readValueHashCode()J
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    aget-byte v2, v1, v2

    .line 12
    .line 13
    iput-byte v2, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 14
    .line 15
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 16
    .line 17
    const/16 v3, 0x49

    .line 18
    .line 19
    const/16 v4, 0x7f

    .line 20
    .line 21
    if-lt v2, v3, :cond_0

    .line 22
    .line 23
    const/16 v3, 0x78

    .line 24
    .line 25
    if-gt v2, v3, :cond_0

    .line 26
    .line 27
    add-int/lit8 v3, v2, -0x49

    .line 28
    .line 29
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/16 v3, 0x79

    .line 33
    .line 34
    if-eq v2, v3, :cond_3

    .line 35
    .line 36
    const/16 v3, 0x7a

    .line 37
    .line 38
    if-eq v2, v3, :cond_3

    .line 39
    .line 40
    const/16 v3, 0x7b

    .line 41
    .line 42
    if-eq v2, v3, :cond_3

    .line 43
    .line 44
    const/16 v3, 0x7c

    .line 45
    .line 46
    if-eq v2, v3, :cond_3

    .line 47
    .line 48
    const/16 v3, 0x7d

    .line 49
    .line 50
    if-ne v2, v3, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    if-ne v2, v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 60
    .line 61
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 62
    .line 63
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readStringError()Lcom/alibaba/fastjson2/JSONException;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    throw v1

    .line 71
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 76
    .line 77
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 78
    .line 79
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strBegin:I

    .line 80
    .line 81
    :goto_1
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 82
    .line 83
    if-gez v3, :cond_4

    .line 84
    .line 85
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 86
    .line 87
    neg-int v2, v3

    .line 88
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getHashCode(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    return-wide v1

    .line 93
    :cond_4
    const/16 v5, 0x7a

    .line 94
    .line 95
    const-wide v8, 0x100000001b3L

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    const/4 v10, 0x2

    .line 101
    if-ne v2, v5, :cond_7

    .line 102
    .line 103
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 104
    .line 105
    add-int/2addr v2, v3

    .line 106
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :goto_2
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 112
    .line 113
    if-ge v3, v2, :cond_6

    .line 114
    .line 115
    aget-byte v4, v1, v3

    .line 116
    .line 117
    if-ltz v4, :cond_5

    .line 118
    .line 119
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    and-int/lit16 v4, v4, 0xff

    .line 125
    .line 126
    shr-int/lit8 v5, v4, 0x4

    .line 127
    .line 128
    packed-switch v5, :pswitch_data_0

    .line 129
    .line 130
    .line 131
    const-string v1, "malformed input around byte "

    .line 132
    .line 133
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 134
    .line 135
    invoke-static {v2, v1}, Lah/a;->y(ILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-wide/16 v1, 0x0

    .line 139
    .line 140
    return-wide v1

    .line 141
    :pswitch_0
    add-int/lit8 v5, v3, 0x1

    .line 142
    .line 143
    aget-byte v5, v1, v5

    .line 144
    .line 145
    add-int/lit8 v11, v3, 0x2

    .line 146
    .line 147
    aget-byte v11, v1, v11

    .line 148
    .line 149
    invoke-static {v4, v5, v11, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(IIII)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x3

    .line 156
    .line 157
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_1
    add-int/lit8 v5, v3, 0x1

    .line 161
    .line 162
    aget-byte v5, v1, v5

    .line 163
    .line 164
    invoke-static {v4, v5, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->char2_utf8(III)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 169
    .line 170
    add-int/2addr v3, v10

    .line 171
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 172
    .line 173
    :goto_3
    int-to-long v3, v4

    .line 174
    xor-long/2addr v3, v6

    .line 175
    mul-long v6, v3, v8

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    return-wide v6

    .line 179
    :cond_7
    const/16 v5, 0x7b

    .line 180
    .line 181
    const-wide/16 v11, 0xff

    .line 182
    .line 183
    const-wide/32 v13, 0xffff

    .line 184
    .line 185
    .line 186
    const-wide/32 v15, 0xffffff

    .line 187
    .line 188
    .line 189
    const-wide v17, 0xffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    const/16 v19, 0x20

    .line 195
    .line 196
    const-wide v20, 0xffffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    const/16 v22, 0x28

    .line 202
    .line 203
    const-wide v23, 0xffffffffffffL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    const/16 v25, 0x30

    .line 209
    .line 210
    const-wide v26, 0xffffffffffffffL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    const/16 v28, 0x38

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    const/16 v6, 0x10

    .line 220
    .line 221
    const-wide/16 v32, 0x0

    .line 222
    .line 223
    const/16 v7, 0x8

    .line 224
    .line 225
    if-ne v2, v5, :cond_11

    .line 226
    .line 227
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 228
    .line 229
    aget-byte v5, v1, v2

    .line 230
    .line 231
    move-wide/from16 v34, v8

    .line 232
    .line 233
    const/4 v8, -0x2

    .line 234
    if-ne v5, v8, :cond_d

    .line 235
    .line 236
    add-int/lit8 v8, v2, 0x1

    .line 237
    .line 238
    aget-byte v8, v1, v8

    .line 239
    .line 240
    const/4 v9, -0x1

    .line 241
    if-ne v8, v9, :cond_d

    .line 242
    .line 243
    if-gt v3, v6, :cond_b

    .line 244
    .line 245
    move v3, v10

    .line 246
    move-wide/from16 v5, v32

    .line 247
    .line 248
    :goto_4
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 249
    .line 250
    if-ge v3, v8, :cond_a

    .line 251
    .line 252
    add-int v8, v2, v3

    .line 253
    .line 254
    aget-byte v9, v1, v8

    .line 255
    .line 256
    add-int/lit8 v8, v8, 0x1

    .line 257
    .line 258
    aget-byte v8, v1, v8

    .line 259
    .line 260
    and-int/lit16 v8, v8, 0xff

    .line 261
    .line 262
    and-int/lit16 v9, v9, 0xff

    .line 263
    .line 264
    shl-int/2addr v9, v7

    .line 265
    or-int/2addr v8, v9

    .line 266
    int-to-char v8, v8

    .line 267
    if-gt v8, v4, :cond_9

    .line 268
    .line 269
    if-nez v3, :cond_8

    .line 270
    .line 271
    if-nez v8, :cond_8

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_8
    int-to-byte v8, v8

    .line 275
    add-int/lit8 v9, v3, -0x2

    .line 276
    .line 277
    shr-int/lit8 v9, v9, 0x1

    .line 278
    .line 279
    packed-switch v9, :pswitch_data_1

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :pswitch_2
    int-to-long v8, v8

    .line 284
    shl-long v8, v8, v28

    .line 285
    .line 286
    and-long v5, v5, v26

    .line 287
    .line 288
    :goto_5
    add-long/2addr v5, v8

    .line 289
    goto :goto_6

    .line 290
    :pswitch_3
    int-to-long v8, v8

    .line 291
    shl-long v8, v8, v25

    .line 292
    .line 293
    and-long v5, v5, v23

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :pswitch_4
    int-to-long v8, v8

    .line 297
    shl-long v8, v8, v22

    .line 298
    .line 299
    and-long v5, v5, v20

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :pswitch_5
    int-to-long v8, v8

    .line 303
    shl-long v8, v8, v19

    .line 304
    .line 305
    and-long v5, v5, v17

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :pswitch_6
    shl-int/lit8 v8, v8, 0x18

    .line 309
    .line 310
    int-to-long v8, v8

    .line 311
    and-long/2addr v5, v15

    .line 312
    goto :goto_5

    .line 313
    :pswitch_7
    shl-int/lit8 v8, v8, 0x10

    .line 314
    .line 315
    int-to-long v8, v8

    .line 316
    and-long/2addr v5, v13

    .line 317
    goto :goto_5

    .line 318
    :pswitch_8
    shl-int/lit8 v8, v8, 0x8

    .line 319
    .line 320
    int-to-long v8, v8

    .line 321
    and-long/2addr v5, v11

    .line 322
    goto :goto_5

    .line 323
    :pswitch_9
    int-to-long v5, v8

    .line 324
    :goto_6
    add-int/lit8 v3, v3, 0x2

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_9
    :goto_7
    move-wide/from16 v5, v32

    .line 328
    .line 329
    :cond_a
    cmp-long v3, v5, v32

    .line 330
    .line 331
    if-eqz v3, :cond_b

    .line 332
    .line 333
    return-wide v5

    .line 334
    :cond_b
    const-wide v30, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    :goto_8
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 340
    .line 341
    if-ge v10, v3, :cond_c

    .line 342
    .line 343
    add-int v3, v2, v10

    .line 344
    .line 345
    aget-byte v4, v1, v3

    .line 346
    .line 347
    add-int/lit8 v3, v3, 0x1

    .line 348
    .line 349
    aget-byte v3, v1, v3

    .line 350
    .line 351
    and-int/lit16 v3, v3, 0xff

    .line 352
    .line 353
    and-int/lit16 v4, v4, 0xff

    .line 354
    .line 355
    shl-int/2addr v4, v7

    .line 356
    or-int/2addr v3, v4

    .line 357
    int-to-char v3, v3

    .line 358
    int-to-long v3, v3

    .line 359
    xor-long v3, v30, v3

    .line 360
    .line 361
    mul-long v30, v3, v34

    .line 362
    .line 363
    add-int/lit8 v10, v10, 0x2

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_c
    return-wide v30

    .line 367
    :cond_d
    const/4 v3, -0x1

    .line 368
    if-ne v5, v3, :cond_f

    .line 369
    .line 370
    add-int/lit8 v3, v2, 0x1

    .line 371
    .line 372
    aget-byte v3, v1, v3

    .line 373
    .line 374
    const/4 v4, -0x2

    .line 375
    if-ne v3, v4, :cond_f

    .line 376
    .line 377
    const-wide v30, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    :goto_9
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 383
    .line 384
    if-ge v10, v3, :cond_e

    .line 385
    .line 386
    add-int v3, v2, v10

    .line 387
    .line 388
    aget-byte v4, v1, v3

    .line 389
    .line 390
    add-int/lit8 v3, v3, 0x1

    .line 391
    .line 392
    aget-byte v3, v1, v3

    .line 393
    .line 394
    and-int/lit16 v4, v4, 0xff

    .line 395
    .line 396
    and-int/lit16 v3, v3, 0xff

    .line 397
    .line 398
    shl-int/2addr v3, v7

    .line 399
    or-int/2addr v3, v4

    .line 400
    int-to-char v3, v3

    .line 401
    int-to-long v3, v3

    .line 402
    xor-long v3, v30, v3

    .line 403
    .line 404
    mul-long v30, v3, v34

    .line 405
    .line 406
    add-int/lit8 v10, v10, 0x2

    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_e
    return-wide v30

    .line 410
    :cond_f
    move/from16 v3, v29

    .line 411
    .line 412
    const-wide v30, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    :goto_a
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 418
    .line 419
    if-ge v3, v4, :cond_10

    .line 420
    .line 421
    add-int v4, v2, v3

    .line 422
    .line 423
    aget-byte v5, v1, v4

    .line 424
    .line 425
    add-int/lit8 v4, v4, 0x1

    .line 426
    .line 427
    aget-byte v4, v1, v4

    .line 428
    .line 429
    and-int/lit16 v5, v5, 0xff

    .line 430
    .line 431
    and-int/lit16 v4, v4, 0xff

    .line 432
    .line 433
    shl-int/2addr v4, v7

    .line 434
    or-int/2addr v4, v5

    .line 435
    int-to-char v4, v4

    .line 436
    int-to-long v4, v4

    .line 437
    xor-long v4, v30, v4

    .line 438
    .line 439
    mul-long v30, v4, v34

    .line 440
    .line 441
    add-int/lit8 v3, v3, 0x2

    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_10
    return-wide v30

    .line 445
    :cond_11
    move-wide/from16 v34, v8

    .line 446
    .line 447
    const/16 v5, 0x7d

    .line 448
    .line 449
    if-ne v2, v5, :cond_17

    .line 450
    .line 451
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 452
    .line 453
    if-gt v3, v6, :cond_15

    .line 454
    .line 455
    move/from16 v3, v29

    .line 456
    .line 457
    move-wide/from16 v5, v32

    .line 458
    .line 459
    :goto_b
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 460
    .line 461
    if-ge v3, v8, :cond_14

    .line 462
    .line 463
    add-int v8, v2, v3

    .line 464
    .line 465
    aget-byte v9, v1, v8

    .line 466
    .line 467
    add-int/lit8 v8, v8, 0x1

    .line 468
    .line 469
    aget-byte v8, v1, v8

    .line 470
    .line 471
    and-int/lit16 v8, v8, 0xff

    .line 472
    .line 473
    and-int/lit16 v9, v9, 0xff

    .line 474
    .line 475
    shl-int/2addr v9, v7

    .line 476
    or-int/2addr v8, v9

    .line 477
    int-to-char v8, v8

    .line 478
    if-gt v8, v4, :cond_13

    .line 479
    .line 480
    if-nez v3, :cond_12

    .line 481
    .line 482
    if-nez v8, :cond_12

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_12
    int-to-byte v8, v8

    .line 486
    shr-int/lit8 v9, v3, 0x1

    .line 487
    .line 488
    packed-switch v9, :pswitch_data_2

    .line 489
    .line 490
    .line 491
    goto :goto_d

    .line 492
    :pswitch_a
    int-to-long v8, v8

    .line 493
    shl-long v8, v8, v28

    .line 494
    .line 495
    and-long v5, v5, v26

    .line 496
    .line 497
    :goto_c
    add-long/2addr v5, v8

    .line 498
    goto :goto_d

    .line 499
    :pswitch_b
    int-to-long v8, v8

    .line 500
    shl-long v8, v8, v25

    .line 501
    .line 502
    and-long v5, v5, v23

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :pswitch_c
    int-to-long v8, v8

    .line 506
    shl-long v8, v8, v22

    .line 507
    .line 508
    and-long v5, v5, v20

    .line 509
    .line 510
    goto :goto_c

    .line 511
    :pswitch_d
    int-to-long v8, v8

    .line 512
    shl-long v8, v8, v19

    .line 513
    .line 514
    and-long v5, v5, v17

    .line 515
    .line 516
    goto :goto_c

    .line 517
    :pswitch_e
    shl-int/lit8 v8, v8, 0x18

    .line 518
    .line 519
    int-to-long v8, v8

    .line 520
    and-long/2addr v5, v15

    .line 521
    goto :goto_c

    .line 522
    :pswitch_f
    shl-int/lit8 v8, v8, 0x10

    .line 523
    .line 524
    int-to-long v8, v8

    .line 525
    and-long/2addr v5, v13

    .line 526
    goto :goto_c

    .line 527
    :pswitch_10
    shl-int/lit8 v8, v8, 0x8

    .line 528
    .line 529
    int-to-long v8, v8

    .line 530
    and-long/2addr v5, v11

    .line 531
    goto :goto_c

    .line 532
    :pswitch_11
    int-to-long v5, v8

    .line 533
    :goto_d
    add-int/lit8 v3, v3, 0x2

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_13
    :goto_e
    move-wide/from16 v5, v32

    .line 537
    .line 538
    :cond_14
    cmp-long v3, v5, v32

    .line 539
    .line 540
    if-eqz v3, :cond_15

    .line 541
    .line 542
    return-wide v5

    .line 543
    :cond_15
    move/from16 v3, v29

    .line 544
    .line 545
    const-wide v30, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    :goto_f
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 551
    .line 552
    if-ge v3, v4, :cond_16

    .line 553
    .line 554
    add-int v4, v2, v3

    .line 555
    .line 556
    aget-byte v5, v1, v4

    .line 557
    .line 558
    add-int/lit8 v4, v4, 0x1

    .line 559
    .line 560
    aget-byte v4, v1, v4

    .line 561
    .line 562
    and-int/lit16 v4, v4, 0xff

    .line 563
    .line 564
    and-int/lit16 v5, v5, 0xff

    .line 565
    .line 566
    shl-int/2addr v5, v7

    .line 567
    or-int/2addr v4, v5

    .line 568
    int-to-char v4, v4

    .line 569
    int-to-long v4, v4

    .line 570
    xor-long v4, v30, v4

    .line 571
    .line 572
    mul-long v30, v4, v34

    .line 573
    .line 574
    add-int/lit8 v3, v3, 0x2

    .line 575
    .line 576
    goto :goto_f

    .line 577
    :cond_16
    return-wide v30

    .line 578
    :cond_17
    const/16 v5, 0x7c

    .line 579
    .line 580
    if-ne v2, v5, :cond_1d

    .line 581
    .line 582
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 583
    .line 584
    if-gt v3, v6, :cond_1b

    .line 585
    .line 586
    move/from16 v3, v29

    .line 587
    .line 588
    move-wide/from16 v5, v32

    .line 589
    .line 590
    :goto_10
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 591
    .line 592
    if-ge v3, v8, :cond_1a

    .line 593
    .line 594
    add-int v8, v2, v3

    .line 595
    .line 596
    aget-byte v9, v1, v8

    .line 597
    .line 598
    add-int/lit8 v8, v8, 0x1

    .line 599
    .line 600
    aget-byte v8, v1, v8

    .line 601
    .line 602
    and-int/lit16 v9, v9, 0xff

    .line 603
    .line 604
    and-int/lit16 v8, v8, 0xff

    .line 605
    .line 606
    shl-int/2addr v8, v7

    .line 607
    or-int/2addr v8, v9

    .line 608
    int-to-char v8, v8

    .line 609
    if-gt v8, v4, :cond_19

    .line 610
    .line 611
    if-nez v3, :cond_18

    .line 612
    .line 613
    if-nez v8, :cond_18

    .line 614
    .line 615
    goto :goto_13

    .line 616
    :cond_18
    int-to-byte v8, v8

    .line 617
    shr-int/lit8 v9, v3, 0x1

    .line 618
    .line 619
    packed-switch v9, :pswitch_data_3

    .line 620
    .line 621
    .line 622
    goto :goto_12

    .line 623
    :pswitch_12
    int-to-long v8, v8

    .line 624
    shl-long v8, v8, v28

    .line 625
    .line 626
    and-long v5, v5, v26

    .line 627
    .line 628
    :goto_11
    add-long/2addr v5, v8

    .line 629
    goto :goto_12

    .line 630
    :pswitch_13
    int-to-long v8, v8

    .line 631
    shl-long v8, v8, v25

    .line 632
    .line 633
    and-long v5, v5, v23

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :pswitch_14
    int-to-long v8, v8

    .line 637
    shl-long v8, v8, v22

    .line 638
    .line 639
    and-long v5, v5, v20

    .line 640
    .line 641
    goto :goto_11

    .line 642
    :pswitch_15
    int-to-long v8, v8

    .line 643
    shl-long v8, v8, v19

    .line 644
    .line 645
    and-long v5, v5, v17

    .line 646
    .line 647
    goto :goto_11

    .line 648
    :pswitch_16
    shl-int/lit8 v8, v8, 0x18

    .line 649
    .line 650
    int-to-long v8, v8

    .line 651
    and-long/2addr v5, v15

    .line 652
    goto :goto_11

    .line 653
    :pswitch_17
    shl-int/lit8 v8, v8, 0x10

    .line 654
    .line 655
    int-to-long v8, v8

    .line 656
    and-long/2addr v5, v13

    .line 657
    goto :goto_11

    .line 658
    :pswitch_18
    shl-int/lit8 v8, v8, 0x8

    .line 659
    .line 660
    int-to-long v8, v8

    .line 661
    and-long/2addr v5, v11

    .line 662
    goto :goto_11

    .line 663
    :pswitch_19
    int-to-long v5, v8

    .line 664
    :goto_12
    add-int/lit8 v3, v3, 0x2

    .line 665
    .line 666
    goto :goto_10

    .line 667
    :cond_19
    :goto_13
    move-wide/from16 v5, v32

    .line 668
    .line 669
    :cond_1a
    cmp-long v3, v5, v32

    .line 670
    .line 671
    if-eqz v3, :cond_1b

    .line 672
    .line 673
    return-wide v5

    .line 674
    :cond_1b
    move/from16 v3, v29

    .line 675
    .line 676
    const-wide v30, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    :goto_14
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 682
    .line 683
    if-ge v3, v4, :cond_1c

    .line 684
    .line 685
    add-int v4, v2, v3

    .line 686
    .line 687
    aget-byte v5, v1, v4

    .line 688
    .line 689
    add-int/lit8 v4, v4, 0x1

    .line 690
    .line 691
    aget-byte v4, v1, v4

    .line 692
    .line 693
    and-int/lit16 v5, v5, 0xff

    .line 694
    .line 695
    and-int/lit16 v4, v4, 0xff

    .line 696
    .line 697
    shl-int/2addr v4, v7

    .line 698
    or-int/2addr v4, v5

    .line 699
    int-to-char v4, v4

    .line 700
    int-to-long v4, v4

    .line 701
    xor-long v4, v30, v4

    .line 702
    .line 703
    mul-long v30, v4, v34

    .line 704
    .line 705
    add-int/lit8 v3, v3, 0x2

    .line 706
    .line 707
    goto :goto_14

    .line 708
    :cond_1c
    return-wide v30

    .line 709
    :cond_1d
    if-gt v3, v7, :cond_21

    .line 710
    .line 711
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 712
    .line 713
    move/from16 v3, v29

    .line 714
    .line 715
    move-wide/from16 v4, v32

    .line 716
    .line 717
    :goto_15
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 718
    .line 719
    if-ge v3, v6, :cond_20

    .line 720
    .line 721
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 722
    .line 723
    aget-byte v7, v1, v6

    .line 724
    .line 725
    if-ltz v7, :cond_1f

    .line 726
    .line 727
    if-nez v7, :cond_1e

    .line 728
    .line 729
    aget-byte v8, v1, v2

    .line 730
    .line 731
    if-nez v8, :cond_1e

    .line 732
    .line 733
    goto :goto_18

    .line 734
    :cond_1e
    packed-switch v3, :pswitch_data_4

    .line 735
    .line 736
    .line 737
    goto :goto_17

    .line 738
    :pswitch_1a
    int-to-long v7, v7

    .line 739
    shl-long v7, v7, v28

    .line 740
    .line 741
    and-long v4, v4, v26

    .line 742
    .line 743
    :goto_16
    add-long/2addr v4, v7

    .line 744
    goto :goto_17

    .line 745
    :pswitch_1b
    int-to-long v7, v7

    .line 746
    shl-long v7, v7, v25

    .line 747
    .line 748
    and-long v4, v4, v23

    .line 749
    .line 750
    goto :goto_16

    .line 751
    :pswitch_1c
    int-to-long v7, v7

    .line 752
    shl-long v7, v7, v22

    .line 753
    .line 754
    and-long v4, v4, v20

    .line 755
    .line 756
    goto :goto_16

    .line 757
    :pswitch_1d
    int-to-long v7, v7

    .line 758
    shl-long v7, v7, v19

    .line 759
    .line 760
    and-long v4, v4, v17

    .line 761
    .line 762
    goto :goto_16

    .line 763
    :pswitch_1e
    shl-int/lit8 v7, v7, 0x18

    .line 764
    .line 765
    int-to-long v7, v7

    .line 766
    and-long/2addr v4, v15

    .line 767
    goto :goto_16

    .line 768
    :pswitch_1f
    shl-int/lit8 v7, v7, 0x10

    .line 769
    .line 770
    int-to-long v7, v7

    .line 771
    and-long/2addr v4, v13

    .line 772
    goto :goto_16

    .line 773
    :pswitch_20
    shl-int/lit8 v7, v7, 0x8

    .line 774
    .line 775
    int-to-long v7, v7

    .line 776
    and-long/2addr v4, v11

    .line 777
    goto :goto_16

    .line 778
    :pswitch_21
    int-to-long v4, v7

    .line 779
    :goto_17
    add-int/lit8 v6, v6, 0x1

    .line 780
    .line 781
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 782
    .line 783
    add-int/lit8 v3, v3, 0x1

    .line 784
    .line 785
    goto :goto_15

    .line 786
    :cond_1f
    :goto_18
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 787
    .line 788
    move-wide/from16 v4, v32

    .line 789
    .line 790
    :cond_20
    cmp-long v2, v4, v32

    .line 791
    .line 792
    if-eqz v2, :cond_21

    .line 793
    .line 794
    return-wide v4

    .line 795
    :cond_21
    move/from16 v2, v29

    .line 796
    .line 797
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    :goto_19
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 803
    .line 804
    if-ge v2, v3, :cond_22

    .line 805
    .line 806
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 807
    .line 808
    add-int/lit8 v4, v3, 0x1

    .line 809
    .line 810
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 811
    .line 812
    aget-byte v3, v1, v3

    .line 813
    .line 814
    int-to-long v3, v3

    .line 815
    xor-long/2addr v3, v6

    .line 816
    mul-long v6, v3, v34

    .line 817
    .line 818
    add-int/lit8 v2, v2, 0x1

    .line 819
    .line 820
    goto :goto_19

    .line 821
    :cond_22
    return-wide v6

    .line 822
    nop

    .line 823
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

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
    .line 852
    .line 853
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method

.method public readZonedDateTime()Ljava/time/ZonedDateTime;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x56

    .line 12
    .line 13
    if-ne v3, v4, :cond_2

    .line 14
    .line 15
    add-int/lit8 v3, v1, 0x2

    .line 16
    .line 17
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 18
    .line 19
    aget-byte v2, v0, v2

    .line 20
    .line 21
    shl-int/lit8 v2, v2, 0x8

    .line 22
    .line 23
    add-int/lit8 v4, v1, 0x3

    .line 24
    .line 25
    iput v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 26
    .line 27
    aget-byte v3, v0, v3

    .line 28
    .line 29
    and-int/lit16 v3, v3, 0xff

    .line 30
    .line 31
    add-int v5, v2, v3

    .line 32
    .line 33
    add-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    aget-byte v6, v0, v4

    .line 38
    .line 39
    add-int/lit8 v3, v1, 0x5

    .line 40
    .line 41
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 42
    .line 43
    aget-byte v7, v0, v2

    .line 44
    .line 45
    add-int/lit8 v2, v1, 0x6

    .line 46
    .line 47
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 48
    .line 49
    aget-byte v8, v0, v3

    .line 50
    .line 51
    add-int/lit8 v3, v1, 0x7

    .line 52
    .line 53
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 54
    .line 55
    aget-byte v9, v0, v2

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    aget-byte v10, v0, v3

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readValueHashCode()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    const-wide v3, -0x42a0403329fb87bfL    # -4.511835427849096E-13

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v1, v1, v3

    .line 81
    .line 82
    if-nez v1, :cond_0

    .line 83
    .line 84
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_1

    .line 106
    .line 107
    move-object v1, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 110
    .line 111
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :goto_0
    const/4 v2, 0x0

    .line 116
    invoke-static {v0, v1, v2}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0

    .line 121
    :cond_2
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readZonedDateTime0(I)Ljava/time/ZonedDateTime;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method

.method public final readZonedDateTimeX(I)Ljava/time/ZonedDateTime;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-byte v2, v0, v1

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 8
    .line 9
    const/16 v3, 0x49

    .line 10
    .line 11
    if-lt v2, v3, :cond_1

    .line 12
    .line 13
    const/16 v3, 0x78

    .line 14
    .line 15
    if-gt v2, v3, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x13

    .line 18
    .line 19
    if-lt p1, v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 24
    .line 25
    iget-object v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 26
    .line 27
    invoke-static {v0, v1, p1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    const-string p1, "illegal LocalDateTime string : "

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_1
    const-string p1, "date only support string input"

    .line 53
    .line 54
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0
.end method

.method public reset(Lcom/alibaba/fastjson2/JSONReader$SavePoint;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->offset:I

    .line 2
    .line 3
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget p1, p1, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->current:I

    .line 6
    .line 7
    int-to-byte p1, p1

    .line 8
    iput-byte p1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 9
    .line 10
    return-void
.end method

.method public skipComment()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public skipName()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v1, v0, v1

    .line 10
    .line 11
    iput-byte v1, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strtype:B

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/16 v4, 0x49

    .line 15
    .line 16
    if-lt v1, v4, :cond_0

    .line 17
    .line 18
    const/16 v5, 0x78

    .line 19
    .line 20
    if-gt v1, v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v1, v4

    .line 23
    add-int/2addr v1, v2

    .line 24
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    const/16 v4, 0x79

    .line 28
    .line 29
    if-eq v1, v4, :cond_4

    .line 30
    .line 31
    const/16 v4, 0x7a

    .line 32
    .line 33
    if-eq v1, v4, :cond_4

    .line 34
    .line 35
    const/16 v4, 0x7b

    .line 36
    .line 37
    if-eq v1, v4, :cond_4

    .line 38
    .line 39
    const/16 v4, 0x7c

    .line 40
    .line 41
    if-eq v1, v4, :cond_4

    .line 42
    .line 43
    const/16 v4, 0x7d

    .line 44
    .line 45
    if-ne v1, v4, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/16 v4, 0x7f

    .line 49
    .line 50
    if-ne v1, v4, :cond_3

    .line 51
    .line 52
    aget-byte v0, v0, v2

    .line 53
    .line 54
    const/16 v1, -0x10

    .line 55
    .line 56
    if-lt v0, v1, :cond_2

    .line 57
    .line 58
    const/16 v1, 0x48

    .line 59
    .line 60
    if-gt v0, v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 63
    .line 64
    .line 65
    return v3

    .line 66
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 70
    .line 71
    .line 72
    return v3

    .line 73
    :cond_3
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    throw v0

    .line 78
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readLength()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->strlen:I

    .line 83
    .line 84
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    add-int/2addr v1, v0

    .line 87
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 88
    .line 89
    return v3
.end method

.method public skipValue()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    const/16 v3, 0x48

    .line 12
    .line 13
    if-eq v0, v3, :cond_12

    .line 14
    .line 15
    const/16 v3, 0x49

    .line 16
    .line 17
    if-eq v0, v3, :cond_11

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    packed-switch v0, :pswitch_data_1

    .line 24
    .line 25
    .line 26
    packed-switch v0, :pswitch_data_2

    .line 27
    .line 28
    .line 29
    packed-switch v0, :pswitch_data_3

    .line 30
    .line 31
    .line 32
    packed-switch v0, :pswitch_data_4

    .line 33
    .line 34
    .line 35
    packed-switch v0, :pswitch_data_5

    .line 36
    .line 37
    .line 38
    const/16 v5, -0x10

    .line 39
    .line 40
    if-lt v0, v5, :cond_0

    .line 41
    .line 42
    const/16 v5, 0x2f

    .line 43
    .line 44
    if-gt v0, v5, :cond_0

    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_0
    const/16 v5, -0x28

    .line 49
    .line 50
    if-lt v0, v5, :cond_1

    .line 51
    .line 52
    const/16 v5, -0x11

    .line 53
    .line 54
    if-gt v0, v5, :cond_1

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_1
    const/16 v5, 0x30

    .line 59
    .line 60
    if-lt v0, v5, :cond_2

    .line 61
    .line 62
    const/16 v5, 0x3f

    .line 63
    .line 64
    if-gt v0, v5, :cond_2

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x2

    .line 67
    .line 68
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    const/16 v5, 0x40

    .line 72
    .line 73
    if-lt v0, v5, :cond_3

    .line 74
    .line 75
    const/16 v5, 0x47

    .line 76
    .line 77
    if-gt v0, v5, :cond_3

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x3

    .line 80
    .line 81
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    if-lt v0, v3, :cond_4

    .line 85
    .line 86
    const/16 v5, 0x78

    .line 87
    .line 88
    if-gt v0, v5, :cond_4

    .line 89
    .line 90
    sub-int/2addr v0, v3

    .line 91
    add-int/2addr v0, v2

    .line 92
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    const/16 v2, -0x38

    .line 96
    .line 97
    if-lt v0, v2, :cond_5

    .line 98
    .line 99
    const/16 v2, -0x29

    .line 100
    .line 101
    if-gt v0, v2, :cond_5

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x2

    .line 104
    .line 105
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    const/16 v2, -0x40

    .line 109
    .line 110
    if-lt v0, v2, :cond_6

    .line 111
    .line 112
    const/16 v2, -0x39

    .line 113
    .line 114
    if-gt v0, v2, :cond_6

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x3

    .line 117
    .line 118
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    const/16 v1, -0x6c

    .line 122
    .line 123
    if-lt v0, v1, :cond_a

    .line 124
    .line 125
    const/16 v2, -0x5c

    .line 126
    .line 127
    if-gt v0, v2, :cond_a

    .line 128
    .line 129
    if-ne v0, v2, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_0

    .line 136
    :cond_7
    sub-int/2addr v0, v1

    .line 137
    :goto_0
    const/4 v1, 0x0

    .line 138
    :goto_1
    if-ge v1, v0, :cond_11

    .line 139
    .line 140
    sget-object v2, Lcom/alibaba/fastjson2/JSONReaderJSONB;->FIXED_TYPE_SIZE:[B

    .line 141
    .line 142
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 143
    .line 144
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 145
    .line 146
    aget-byte v3, v3, v5

    .line 147
    .line 148
    and-int/lit16 v3, v3, 0xff

    .line 149
    .line 150
    aget-byte v2, v2, v3

    .line 151
    .line 152
    if-lez v2, :cond_8

    .line 153
    .line 154
    add-int/2addr v5, v2

    .line 155
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    if-ne v2, v4, :cond_9

    .line 159
    .line 160
    add-int/lit8 v5, v5, 0x1

    .line 161
    .line 162
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 169
    .line 170
    add-int/2addr v3, v2

    .line 171
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->skipValue()V

    .line 175
    .line 176
    .line 177
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_a
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->notSupportType(B)Lcom/alibaba/fastjson2/JSONException;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    throw v0

    .line 185
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 190
    .line 191
    add-int/2addr v1, v0

    .line 192
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_1
    add-int/lit8 v1, v1, 0x2

    .line 196
    .line 197
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_2
    add-int/lit8 v1, v1, 0x3

    .line 201
    .line 202
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readBigInteger()Ljava/math/BigInteger;

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt64Value()J

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_7
    add-int/lit8 v1, v1, 0x9

    .line 225
    .line 226
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 227
    .line 228
    return-void

    .line 229
    :pswitch_8
    add-int/lit8 v1, v1, 0x8

    .line 230
    .line 231
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 232
    .line 233
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :pswitch_9
    add-int/lit8 v1, v1, 0x8

    .line 241
    .line 242
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 243
    .line 244
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_a
    add-int/lit8 v1, v1, 0x4

    .line 249
    .line 250
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :goto_3
    :pswitch_b
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 257
    .line 258
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 259
    .line 260
    aget-byte v0, v0, v1

    .line 261
    .line 262
    const/16 v2, -0x5b

    .line 263
    .line 264
    if-ne v0, v2, :cond_b

    .line 265
    .line 266
    add-int/lit8 v1, v1, 0x1

    .line 267
    .line 268
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 269
    .line 270
    return-void

    .line 271
    :cond_b
    sget-object v2, Lcom/alibaba/fastjson2/JSONReaderJSONB;->FIXED_TYPE_SIZE:[B

    .line 272
    .line 273
    and-int/lit16 v0, v0, 0xff

    .line 274
    .line 275
    aget-byte v0, v2, v0

    .line 276
    .line 277
    if-lez v0, :cond_c

    .line 278
    .line 279
    add-int/2addr v1, v0

    .line 280
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_c
    if-ne v0, v4, :cond_d

    .line 284
    .line 285
    add-int/lit8 v1, v1, 0x1

    .line 286
    .line 287
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 294
    .line 295
    add-int/2addr v1, v0

    .line 296
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->skipName()Z

    .line 300
    .line 301
    .line 302
    :goto_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 303
    .line 304
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 305
    .line 306
    aget-byte v0, v0, v1

    .line 307
    .line 308
    and-int/lit16 v0, v0, 0xff

    .line 309
    .line 310
    aget-byte v0, v2, v0

    .line 311
    .line 312
    if-lez v0, :cond_e

    .line 313
    .line 314
    add-int/2addr v1, v0

    .line 315
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 316
    .line 317
    goto :goto_3

    .line 318
    :cond_e
    if-ne v0, v4, :cond_f

    .line 319
    .line 320
    add-int/lit8 v1, v1, 0x1

    .line 321
    .line 322
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 323
    .line 324
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 329
    .line 330
    add-int/2addr v1, v0

    .line 331
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_f
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->skipValue()V

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :pswitch_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isString()Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_10

    .line 343
    .line 344
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->skipName()Z

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_10
    const-string v1, "skip not support type "

    .line 349
    .line 350
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-static {v0, v1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readTypeHashCode()J

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->skipValue()V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 370
    .line 371
    add-int/2addr v1, v0

    .line 372
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 373
    .line 374
    :cond_11
    :goto_5
    :pswitch_f
    return-void

    .line 375
    :cond_12
    :pswitch_10
    add-int/lit8 v1, v1, 0x5

    .line 376
    .line 377
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 378
    .line 379
    return-void

    .line 380
    nop

    .line 381
    :pswitch_data_0
    .packed-switch -0x6f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_f
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
    :pswitch_data_1
    .packed-switch -0x5a
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_10
        :pswitch_8
        :pswitch_7
        :pswitch_10
        :pswitch_10
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch -0x51
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch -0x4c
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_10
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_4
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_10
    .end packed-switch

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
    :pswitch_data_5
    .packed-switch 0x79
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public startArray()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/JSONReaderJSONB;->type:B

    .line 12
    .line 13
    const/16 v1, -0x51

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/16 v1, -0x6c

    .line 20
    .line 21
    if-lt v0, v1, :cond_1

    .line 22
    .line 23
    const/16 v2, -0x5d

    .line 24
    .line 25
    if-gt v0, v2, :cond_1

    .line 26
    .line 27
    neg-int v2, v0

    .line 28
    int-to-char v2, v2

    .line 29
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    return v0

    .line 33
    :cond_1
    const/16 v1, -0x6f

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0

    .line 42
    :cond_2
    const/16 v1, -0x5c

    .line 43
    .line 44
    if-ne v0, v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readInt32Value()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    return v0

    .line 51
    :cond_3
    const-string v1, "array not support input "

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->error(B)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0, v1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return v0
.end method
