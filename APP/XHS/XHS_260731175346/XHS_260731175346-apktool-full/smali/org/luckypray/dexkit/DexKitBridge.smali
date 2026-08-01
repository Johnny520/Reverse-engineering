.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public volatile ᛱᛱᛲᲇ:J

.field public final ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    invoke-static {p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 16
    .line 17
    return-void
.end method

.method private static final native nativeBatchFindClassUsingStrings(J[B)[B
.end method

.method private static final native nativeBatchFindMethodUsingStrings(J[B)[B
.end method

.method private static final native nativeExportDexFile(JLjava/lang/String;)V
.end method

.method private static final native nativeFieldGetMethods(JJ)[B
.end method

.method private static final native nativeFieldPutMethods(JJ)[B
.end method

.method private static final native nativeFindClass(J[B)[B
.end method

.method private static final native nativeFindField(J[B)[B
.end method

.method private static final native nativeFindMethod(J[B)[B
.end method

.method private static final native nativeGetCallMethods(JJ)[B
.end method

.method private static final native nativeGetClassAnnotations(JJ)[B
.end method

.method private static final native nativeGetClassByIds(J[J)[B
.end method

.method private static final native nativeGetClassData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetDexNum(J)I
.end method

.method private static final native nativeGetFieldAnnotations(JJ)[B
.end method

.method private static final native nativeGetFieldByIds(J[J)[B
.end method

.method private static final native nativeGetFieldData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetInvokeMethods(JJ)[B
.end method

.method private static final native nativeGetMethodAnnotations(JJ)[B
.end method

.method private static final native nativeGetMethodByIds(J[J)[B
.end method

.method private static final native nativeGetMethodData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetMethodOpCodes(JJ)[I
.end method

.method private static final native nativeGetMethodUsingFields(JJ)[B
.end method

.method private static final native nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeGetParameterAnnotations(JJ)[B
.end method

.method private static final native nativeGetParameterNames(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeInitDexKit(Ljava/lang/String;Ljava/lang/String;)J
.end method

.method private static final native nativeInitDexKitByBytesArray([[BLjava/lang/String;)J
.end method

.method private static final native nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;ZLjava/lang/String;)J
.end method

.method private static final native nativeInitFullCache(J)V
.end method

.method private static final native nativeRelease(J)V
.end method

.method private static final native nativeSetMaxConcurrentQueries(JI)V
.end method

.method private static final native nativeSetThreadNum(JI)V
.end method

.method public static final synthetic ᛱᛱᛲᲇ(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldGetMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic ᛳᲁᲇᛸ(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetCallMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic ᲇᛴᲇᛵ(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetInvokeMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v3

    .line 20
    :goto_0
    move v4, v3

    .line 21
    :goto_1
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-wide v4, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    cmp-long v8, v4, v6

    .line 41
    .line 42
    if-nez v8, :cond_3

    .line 43
    .line 44
    :goto_2
    if-ge v3, v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :try_start_1
    iput-wide v6, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 57
    .line 58
    invoke-static {v4, v5}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    :goto_3
    if-ge v3, v2, :cond_4

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    :goto_4
    if-ge v3, v2, :cond_5

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 83
    .line 84
    .line 85
    throw p0
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, Lxhss/ᛳᲁᲇᛸ;

    .line 34
    .line 35
    invoke-direct {v0}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/2addr v2, v1

    .line 56
    invoke-virtual {v0, v2, p1}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lxhss/ᲈᛴᲀᛲ;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x0

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v2, v3

    .line 78
    :goto_0
    if-ge v3, v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lxhss/ᛳᲁᲇᛸ;->ᛸᛴᛶᛳ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {p0, v4}, Lxhss/ᛸᛶᛳᛷ;->ᲀᲇᛳᲁ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᛳᛸᛸᛵ;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    const/4 v0, 0x1

    .line 99
    if-le p0, v0, :cond_2

    .line 100
    .line 101
    new-instance p0, Lxhss/ᛸᛲᲇᲁ;

    .line 102
    .line 103
    invoke-direct {p0, v1}, Lxhss/ᛸᛲᲇᲁ;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-le v1, v0, :cond_2

    .line 111
    .line 112
    invoke-static {p1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-object p1

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 119
    .line 120
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 127
    .line 128
    .line 129
    throw p0
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛶᲀᛱ;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, v1, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-wide v3, v1, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmp-long v5, v3, v5

    .line 21
    .line 22
    if-eqz v5, :cond_a

    .line 23
    .line 24
    invoke-static {v3, v4, v0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindField(J[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v8, Lxhss/ᛳᲁᲇᛸ;

    .line 36
    .line 37
    invoke-direct {v8}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v2

    .line 58
    invoke-virtual {v8, v3, v0}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 59
    .line 60
    .line 61
    new-instance v9, Lxhss/ᲈᛶᲀᛱ;

    .line 62
    .line 63
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    const/4 v10, 0x4

    .line 67
    invoke-virtual {v8, v10}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v11, 0x0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    invoke-virtual {v8, v0}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    move v12, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v12, v11

    .line 81
    :goto_0
    move v13, v11

    .line 82
    :goto_1
    if-ge v13, v12, :cond_8

    .line 83
    .line 84
    new-instance v0, Lxhss/ᛳᲁᲇᛸ;

    .line 85
    .line 86
    invoke-direct {v0}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v10}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v3, 0x0

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    invoke-virtual {v8, v2}, Lxhss/ᛳᲁᲇᛸ;->ᛷᛴᛷᛱ(I)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    mul-int/lit8 v4, v13, 0x4

    .line 101
    .line 102
    add-int/2addr v4, v2

    .line 103
    invoke-virtual {v8, v4}, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ(I)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    iget-object v4, v8, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0, v2, v4}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    move-object v0, v3

    .line 114
    :goto_2
    new-instance v2, Lxhss/ᲀᛷᲀᲇ;

    .line 115
    .line 116
    invoke-virtual {v0, v10}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    iget-object v5, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    iget v6, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 125
    .line 126
    add-int/2addr v4, v6

    .line 127
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    goto :goto_3

    .line 132
    :cond_2
    move v4, v11

    .line 133
    :goto_3
    const/4 v5, 0x6

    .line 134
    invoke-virtual {v0, v5}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_3

    .line 139
    .line 140
    iget-object v6, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    iget v7, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 143
    .line 144
    add-int/2addr v5, v7

    .line 145
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    goto :goto_4

    .line 150
    :cond_3
    move v5, v11

    .line 151
    :goto_4
    const/16 v6, 0x8

    .line 152
    .line 153
    invoke-virtual {v0, v6}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_4

    .line 158
    .line 159
    iget-object v7, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    iget v14, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 162
    .line 163
    add-int/2addr v6, v14

    .line 164
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    goto :goto_5

    .line 169
    :cond_4
    move v6, v11

    .line 170
    :goto_5
    const/16 v7, 0xa

    .line 171
    .line 172
    invoke-virtual {v0, v7}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-eqz v7, :cond_5

    .line 177
    .line 178
    iget-object v14, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 179
    .line 180
    iget v15, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 181
    .line 182
    add-int/2addr v7, v15

    .line 183
    invoke-virtual {v14, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    goto :goto_6

    .line 188
    :cond_5
    move v7, v11

    .line 189
    :goto_6
    const/16 v14, 0xc

    .line 190
    .line 191
    invoke-virtual {v0, v14}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    if-eqz v14, :cond_6

    .line 196
    .line 197
    iget v3, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 198
    .line 199
    add-int/2addr v14, v3

    .line 200
    invoke-virtual {v0, v14}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛴᲇᛵ(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :cond_6
    const/16 v14, 0xe

    .line 205
    .line 206
    invoke-virtual {v0, v14}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    if-eqz v14, :cond_7

    .line 211
    .line 212
    iget-object v15, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 213
    .line 214
    iget v0, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 215
    .line 216
    add-int/2addr v14, v0

    .line 217
    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    move/from16 v16, v7

    .line 222
    .line 223
    move v7, v0

    .line 224
    move-object v0, v2

    .line 225
    move v2, v4

    .line 226
    move v4, v6

    .line 227
    move-object v6, v3

    .line 228
    move v3, v5

    .line 229
    move/from16 v5, v16

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_7
    move-object v0, v2

    .line 233
    move v2, v4

    .line 234
    move v4, v6

    .line 235
    move-object v6, v3

    .line 236
    move v3, v5

    .line 237
    move v5, v7

    .line 238
    move v7, v11

    .line 239
    :goto_7
    invoke-direct/range {v0 .. v7}, Lxhss/ᲀᛷᲀᲇ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v9, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    add-int/lit8 v13, v13, 0x1

    .line 246
    .line 247
    move-object/from16 v1, p0

    .line 248
    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :cond_8
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    const/4 v1, 0x1

    .line 256
    if-le v0, v1, :cond_9

    .line 257
    .line 258
    new-instance v0, Lxhss/ᛸᛲᲇᲁ;

    .line 259
    .line 260
    const/4 v2, 0x3

    .line 261
    invoke-direct {v0, v2}, Lxhss/ᛸᛲᲇᲁ;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-le v2, v1, :cond_9

    .line 269
    .line 270
    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 271
    .line 272
    .line 273
    :cond_9
    return-object v9

    .line 274
    :catchall_0
    move-exception v0

    .line 275
    goto :goto_8

    .line 276
    :cond_a
    :try_start_1
    const-string v0, "DexKitBridge is not valid"

    .line 277
    .line 278
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 279
    .line 280
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 284
    :goto_8
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 285
    .line 286
    .line 287
    throw v0
.end method

.method public final ᛸᛶᲈᛶ([J)Lxhss/ᛵᛲᛴᛵ;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v3, v1, v3

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lxhss/ᛳᲁᲇᛸ;

    .line 30
    .line 31
    invoke-direct {v0}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v1

    .line 52
    invoke-virtual {v0, v2, p1}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lxhss/ᛵᛲᛴᛵ;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v1, v2

    .line 74
    :goto_0
    if-ge v2, v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲀᲇᛳᲁ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {p0, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛴᛷᛱ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᲇᛸᛳᛸ;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    return-object p1

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 94
    .line 95
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 102
    .line 103
    .line 104
    throw p0
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛷᛴᛲᛲ;)Lxhss/ᛵᛲᛴᛵ;
    .locals 5

    .line 1
    new-instance v0, Lxhss/ᛸᛴᛶᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    cmp-long v3, v1, v3

    .line 27
    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Lxhss/ᛳᲁᲇᛸ;

    .line 42
    .line 43
    invoke-direct {v0}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v2, v1

    .line 64
    invoke-virtual {v0, v2, p1}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lxhss/ᛵᛲᛴᛵ;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x4

    .line 73
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/4 v2, 0x0

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move v1, v2

    .line 86
    :goto_0
    if-ge v2, v1, :cond_1

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲀᲇᛳᲁ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {p0, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛴᛷᛱ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᲇᛸᛳᛸ;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const/4 v0, 0x1

    .line 107
    if-le p0, v0, :cond_2

    .line 108
    .line 109
    new-instance p0, Lxhss/ᛸᛲᲇᲁ;

    .line 110
    .line 111
    const/4 v1, 0x2

    .line 112
    invoke-direct {p0, v1}, Lxhss/ᛸᛲᲇᲁ;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-le v1, v0, :cond_2

    .line 120
    .line 121
    invoke-static {p1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    return-object p1

    .line 125
    :catchall_0
    move-exception p0

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 128
    .line 129
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 136
    .line 137
    .line 138
    throw p0
.end method
