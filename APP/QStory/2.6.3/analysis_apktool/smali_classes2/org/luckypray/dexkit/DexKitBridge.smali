.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "Ljava/io/Closeable;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public volatile 飘花落叶言子楪哲苏兰世:J


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

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
    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 25
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    move-result-wide v0

    .line 26
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J

    return-void
.end method

.method public constructor <init>([[B)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 21
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByBytesArray([[B)J

    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J

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

.method private static final native nativeInitDexKit(Ljava/lang/String;)J
.end method

.method private static final native nativeInitDexKitByBytesArray([[B)J
.end method

.method private static final native nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
.end method

.method private static final native nativeInitFullCache(J)V
.end method

.method private static final native nativeRelease(J)V
.end method

.method private static final native nativeSetMaxConcurrentQueries(JI)V
.end method

.method private static final native nativeSetThreadNum(JI)V
.end method

.method public static final synthetic 飘花落叶言子世兰哲苏楪(JJ)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世兰楪哲苏(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingFields(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世兰楪苏哲(JJ)[I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodOpCodes(JJ)[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世哲苏兰楪(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世哲苏楪兰(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世楪哲苏兰(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世楪苏哲兰(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世苏楪兰哲(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子世苏楪哲兰(JJ)[B
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

.method public static final synthetic 飘花落叶言子楪世兰哲苏(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeExportDexFile(JLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪世哲苏兰(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindMethodUsingStrings(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪世苏兰哲(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindClassUsingStrings(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪兰世哲苏(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪兰苏世哲(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetDexNum(J)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic 飘花落叶言子楪兰苏哲世(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪哲世苏兰(JJ)[B
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

.method public static final synthetic 飘花落叶言子楪哲兰苏世(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪哲苏世兰(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪苏世兰哲(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldPutMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪苏世哲兰(JJ)[B
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

.method public static final synthetic 飘花落叶言子楪苏兰世哲(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindField(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪苏兰哲世(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪苏哲兰世(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子苏世哲楪兰(IJ)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetThreadNum(JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic 飘花落叶言子苏世楪兰哲(IJ)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetMaxConcurrentQueries(JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic 飘花落叶言子苏世楪哲兰(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitFullCache(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic 飘花落叶言子苏楪兰哲世(JJ)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterNames(JJ)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子苏楪哲兰世(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterAnnotations(JJ)[B

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
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-wide v4, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J
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
    iput-wide v6, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J

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

.method public final 飘花落叶言子哲楪世兰苏(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$readFieldMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$readFieldMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    if-ge v1, v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子哲楪世苏兰([J)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getTypeByIds$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getTypeByIds$res$1;-><init>([J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v1

    .line 42
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v1, v2

    .line 64
    :goto_0
    if-ge v2, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲兰苏;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method

.method public final synthetic 飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子楪哲苏兰世:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long p0, v1, v3

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 33
    .line 34
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 41
    .line 42
    .line 43
    throw p0
.end method

.method public final 飘花落叶言子哲楪苏兰世(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$writeFieldMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$writeFieldMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    if-ge v1, v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子苏世兰哲楪(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世兰苏哲;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    invoke-virtual {p1}, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findMethod$res$1;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$res$1;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, [B

    .line 15
    .line 16
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 50
    .line 51
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    :goto_0
    if-ge v2, v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    const/4 v0, 0x1

    .line 83
    if-le p0, v0, :cond_1

    .line 84
    .line 85
    new-instance p0, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    invoke-direct {p0, v0}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p0}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世(Ljava/util/List;Ljava/util/Comparator;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-object p1
.end method

.method public final 飘花落叶言子苏世兰楪哲(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 4

    .line 1
    invoke-virtual {p1}, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findField$res$1;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findField$res$1;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, [B

    .line 15
    .line 16
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 50
    .line 51
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v1, v2

    .line 68
    :goto_0
    if-ge v2, v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v3}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    const/4 v0, 0x1

    .line 92
    if-le p0, v0, :cond_2

    .line 93
    .line 94
    new-instance p0, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 95
    .line 96
    const/4 v0, 0x6

    .line 97
    invoke-direct {p0, v0}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p0}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object p1
.end method

.method public final 飘花落叶言子苏世哲兰楪(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 4

    .line 1
    invoke-virtual {p1}, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findClass$res$1;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findClass$res$1;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, [B

    .line 15
    .line 16
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 50
    .line 51
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v1, v2

    .line 68
    :goto_0
    if-ge v2, v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲兰苏;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    const/4 v0, 0x1

    .line 92
    if-le p0, v0, :cond_2

    .line 93
    .line 94
    new-instance p0, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 95
    .line 96
    const/4 v0, 0x5

    .line 97
    invoke-direct {p0, v0}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p0}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object p1
.end method

.method public final synthetic 飘花落叶言子苏兰世哲楪(J)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingStrings$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingStrings$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子苏兰世楪哲(J)Ljava/util/ArrayList;
    .locals 13

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingFields$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingFields$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/flatbuffers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Lcom/google/flatbuffers/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    .line 22
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, p2

    .line 40
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    sub-int p2, v0, p2

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x4

    .line 57
    if-ge v4, v1, :cond_0

    .line 58
    .line 59
    add-int/lit8 v5, p2, 0x4

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v5, v3

    .line 67
    :goto_0
    if-eqz v5, :cond_1

    .line 68
    .line 69
    add-int/2addr v5, v0

    .line 70
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    add-int/2addr v6, v5

    .line 75
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v5, v3

    .line 81
    :goto_1
    move v6, v3

    .line 82
    :goto_2
    if-ge v6, v5, :cond_9

    .line 83
    .line 84
    new-instance v7, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    invoke-direct {v7}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 87
    .line 88
    .line 89
    if-ge v4, v1, :cond_2

    .line 90
    .line 91
    add-int/lit8 v8, p2, 0x4

    .line 92
    .line 93
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    move v8, v3

    .line 99
    :goto_3
    const/4 v9, 0x0

    .line 100
    if-eqz v8, :cond_3

    .line 101
    .line 102
    add-int/2addr v8, v0

    .line 103
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    add-int/2addr v10, v8

    .line 108
    add-int/2addr v10, v4

    .line 109
    mul-int/lit8 v8, v6, 0x4

    .line 110
    .line 111
    add-int/2addr v8, v10

    .line 112
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    add-int/2addr v10, v8

    .line 117
    invoke-virtual {v7, p1, v10}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_3
    move-object v7, v9

    .line 122
    :goto_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v8, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;

    .line 126
    .line 127
    invoke-direct {v8}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_4

    .line 135
    .line 136
    iget v9, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 137
    .line 138
    add-int/2addr v10, v9

    .line 139
    invoke-virtual {v7, v10}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(I)I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    iget-object v10, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v10, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 149
    .line 150
    .line 151
    move-object v9, v8

    .line 152
    :cond_4
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {p0, v9}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const/4 v9, 0x6

    .line 160
    invoke-virtual {v7, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_5

    .line 165
    .line 166
    iget-object v11, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    iget v12, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 169
    .line 170
    add-int/2addr v10, v12

    .line 171
    invoke-virtual {v11, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    goto :goto_5

    .line 176
    :cond_5
    move v10, v3

    .line 177
    :goto_5
    const/4 v11, 0x1

    .line 178
    if-ne v10, v11, :cond_6

    .line 179
    .line 180
    sget-object v7, Lorg/luckypray/dexkit/result/FieldUsingType;->Read:Lorg/luckypray/dexkit/result/FieldUsingType;

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_6
    const/4 v11, 0x2

    .line 184
    if-ne v10, v11, :cond_7

    .line 185
    .line 186
    sget-object v7, Lorg/luckypray/dexkit/result/FieldUsingType;->Write:Lorg/luckypray/dexkit/result/FieldUsingType;

    .line 187
    .line 188
    :goto_6
    new-instance v9, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏兰世哲;

    .line 189
    .line 190
    invoke-direct {v9, v8, v7}, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏兰世哲;-><init>(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;Lorg/luckypray/dexkit/result/FieldUsingType;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    add-int/lit8 v6, v6, 0x1

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 200
    .line 201
    invoke-virtual {v7, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_8

    .line 206
    .line 207
    iget-object p2, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 208
    .line 209
    iget v0, v7, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 210
    .line 211
    add-int/2addr p1, v0

    .line 212
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    :cond_8
    const-string p1, "Unknown using type: "

    .line 217
    .line 218
    invoke-static {v3, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_9
    return-object v2
.end method

.method public final synthetic 飘花落叶言子苏兰哲世楪(J)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getParameterNames$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getParameterNames$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    array-length p2, p0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length p2, p0

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-ge v0, p2, :cond_0

    .line 23
    .line 24
    aget-object v1, p0, v0

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object p1

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final 飘花落叶言子苏兰哲楪世(J)Ljava/util/ArrayList;
    .locals 12

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getParameterAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getParameterAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/flatbuffers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Lcom/google/flatbuffers/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    .line 22
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, p2

    .line 40
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    sub-int p2, v0, p2

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x4

    .line 57
    if-ge v4, v1, :cond_0

    .line 58
    .line 59
    add-int/lit8 v5, p2, 0x4

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v5, v3

    .line 67
    :goto_0
    if-eqz v5, :cond_1

    .line 68
    .line 69
    add-int/2addr v5, v0

    .line 70
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    add-int/2addr v6, v5

    .line 75
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v5, v3

    .line 81
    :goto_1
    move v6, v3

    .line 82
    :goto_2
    if-ge v6, v5, :cond_6

    .line 83
    .line 84
    new-instance v7, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    invoke-direct {v7}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 87
    .line 88
    .line 89
    if-ge v4, v1, :cond_2

    .line 90
    .line 91
    add-int/lit8 v8, p2, 0x4

    .line 92
    .line 93
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    move v8, v3

    .line 99
    :goto_3
    if-eqz v8, :cond_3

    .line 100
    .line 101
    add-int/2addr v8, v0

    .line 102
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    add-int/2addr v9, v8

    .line 107
    add-int/2addr v9, v4

    .line 108
    mul-int/lit8 v8, v6, 0x4

    .line 109
    .line 110
    add-int/2addr v8, v9

    .line 111
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    add-int/2addr v9, v8

    .line 116
    invoke-virtual {v7, p1, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_3
    const/4 v7, 0x0

    .line 121
    :goto_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v8, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-eqz v9, :cond_4

    .line 134
    .line 135
    invoke-virtual {v7, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    goto :goto_5

    .line 140
    :cond_4
    move v9, v3

    .line 141
    :goto_5
    move v10, v3

    .line 142
    :goto_6
    if-ge v10, v9, :cond_5

    .line 143
    .line 144
    invoke-virtual {v7, v10}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v11}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏哲兰;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    add-int/lit8 v10, v10, 0x1

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_5
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_6
    return-object v2
.end method

.method public final 飘花落叶言子苏兰楪世哲([J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodByIds$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getMethodByIds$res$1;-><init>([J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v1

    .line 42
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-ge v2, v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-object p1
.end method

.method public final synthetic 飘花落叶言子苏兰楪哲世(J)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodOpCodes$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodOpCodes$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [I

    .line 11
    .line 12
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世哲兰楪([I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子苏哲世兰楪([J)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getFieldByIds$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getFieldByIds$res$1;-><init>([J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v1

    .line 42
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v1, v2

    .line 64
    :goto_0
    if-ge v2, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v3}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏世兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method

.method public final 飘花落叶言子苏哲世楪兰(J)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getFieldAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getFieldAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v1

    .line 64
    :goto_0
    if-ge v1, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method

.method public final 飘花落叶言子苏哲兰世楪(J)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v1

    .line 64
    :goto_0
    if-ge v1, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method

.method public final 飘花落叶言子苏哲兰楪世(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getInvokeMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getInvokeMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    if-ge v1, v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子苏哲楪世兰(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getCallMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getCallMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    if-ge v1, v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪哲苏兰世;)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子苏哲楪兰世(J)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪苏世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-direct {p2}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p2, p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v1

    .line 64
    :goto_0
    if-ge v1, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p2, v1}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Lorg/luckypray/dexkit/DexKitBridge;L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method
