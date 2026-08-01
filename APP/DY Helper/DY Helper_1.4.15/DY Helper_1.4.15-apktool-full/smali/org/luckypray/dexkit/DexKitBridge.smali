.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/DexKitBridge$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;


# instance fields
.field private final lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private volatile token:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ljava/lang/ClassLoader;Z)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 28
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByClassLoader(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/ClassLoader;Z)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;ZLzq;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
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
    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKit(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lzq;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>([[B)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 25
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByBytesArray(Lorg/luckypray/dexkit/DexKitBridge$Companion;[[B)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>([[BLzq;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[B)V

    return-void
.end method

.method public static final synthetic access$nativeBatchFindClassUsingStrings(J[B)[B
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

.method public static final synthetic access$nativeBatchFindMethodUsingStrings(J[B)[B
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

.method public static final synthetic access$nativeExportDexFile(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeExportDexFile(JLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeFieldGetMethods(JJ)[B
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

.method public static final synthetic access$nativeFieldPutMethods(JJ)[B
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

.method public static final synthetic access$nativeFindClass(J[B)[B
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

.method public static final synthetic access$nativeFindField(J[B)[B
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

.method public static final synthetic access$nativeFindMethod(J[B)[B
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

.method public static final synthetic access$nativeGetCallMethods(JJ)[B
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

.method public static final synthetic access$nativeGetClassAnnotations(JJ)[B
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

.method public static final synthetic access$nativeGetClassByIds(J[J)[B
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

.method public static final synthetic access$nativeGetClassData(JLjava/lang/String;)[B
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

.method public static final synthetic access$nativeGetDexNum(J)I
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

.method public static final synthetic access$nativeGetFieldAnnotations(JJ)[B
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

.method public static final synthetic access$nativeGetFieldByIds(J[J)[B
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

.method public static final synthetic access$nativeGetFieldData(JLjava/lang/String;)[B
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

.method public static final synthetic access$nativeGetInvokeMethods(JJ)[B
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

.method public static final synthetic access$nativeGetMethodAnnotations(JJ)[B
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

.method public static final synthetic access$nativeGetMethodByIds(J[J)[B
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

.method public static final synthetic access$nativeGetMethodData(JLjava/lang/String;)[B
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

.method public static final synthetic access$nativeGetMethodOpCodes(JJ)[I
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

.method public static final synthetic access$nativeGetMethodUsingFields(JJ)[B
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

.method public static final synthetic access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
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

.method public static final synthetic access$nativeGetParameterAnnotations(JJ)[B
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

.method public static final synthetic access$nativeGetParameterNames(JJ)[Ljava/lang/String;
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

.method public static final synthetic access$nativeInitDexKit(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByBytesArray([[B)J
    .locals 2

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByBytesArray([[B)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$nativeInitFullCache(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitFullCache(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeRelease(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeSetMaxConcurrentQueries(JI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetMaxConcurrentQueries(JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeSetThreadNum(JI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetThreadNum(JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final batchFindClassUsingStrings([B)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$res$1;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;->getRootAsBatchClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->getItemsLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    move v3, v2

    .line 36
    :goto_0
    if-ge v3, v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getUnionKey()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v6, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 53
    .line 54
    invoke-direct {v6}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getClassesLength()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    move v8, v2

    .line 62
    :goto_1
    if-ge v8, v7, :cond_0

    .line 63
    .line 64
    sget-object v9, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 65
    .line 66
    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/4 v7, 0x1

    .line 88
    if-le v4, v7, :cond_1

    .line 89
    .line 90
    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;

    .line 91
    .line 92
    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {v6, v4}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    return-object v0
.end method

.method private final batchFindMethodUsingStrings([B)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$res$1;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;->getRootAsBatchMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->getItemsLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    move v3, v2

    .line 36
    :goto_0
    if-ge v3, v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchMethodMeta;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getUnionKey()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v6, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 53
    .line 54
    invoke-direct {v6}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getMethodsLength()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    move v8, v2

    .line 62
    :goto_1
    if-ge v8, v7, :cond_0

    .line 63
    .line 64
    sget-object v9, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 65
    .line 66
    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/4 v7, 0x1

    .line 88
    if-le v4, v7, :cond_1

    .line 89
    .line 90
    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;

    .line 91
    .line 92
    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {v6, v4}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    return-object v0
.end method

.method public static final create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method public static final create([[B)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create([[B)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method private final findClass([B)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 5

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findClass$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findClass$res$1;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 26
    .line 27
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    if-ge v2, v1, :cond_0

    .line 36
    .line 37
    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 p1, 0x1

    .line 61
    if-le p0, p1, :cond_1

    .line 62
    .line 63
    new-instance p0, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;

    .line 64
    .line 65
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-object v0
.end method

.method private final findField([B)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 5

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findField$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findField$res$1;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 26
    .line 27
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    if-ge v2, v1, :cond_0

    .line 36
    .line 37
    sget-object v3, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 p1, 0x1

    .line 61
    if-le p0, p1, :cond_1

    .line 62
    .line 63
    new-instance p0, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;

    .line 64
    .line 65
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-object v0
.end method

.method private final findMethod([B)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 5

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$findMethod$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$res$1;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 26
    .line 27
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    if-ge v2, v1, :cond_0

    .line 36
    .line 37
    sget-object v3, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 p1, 0x1

    .line 61
    if-le p0, p1, :cond_1

    .line 62
    .line 63
    new-instance p0, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;

    .line 64
    .line 65
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-object v0
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

.method private final withNativeWriteToken(La80;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La80;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-wide v4, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    cmp-long p0, v4, v6

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :goto_2
    if-ge v3, v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 67
    .line 68
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_3
    if-ge v3, v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 83
    .line 84
    .line 85
    throw p0
.end method


# virtual methods
.method public final synthetic batchFindClassUsingStrings(La80;)Ljava/util/Map;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindClassUsingStrings([B)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic batchFindMethodUsingStrings(La80;)Ljava/util/Map;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindMethodUsingStrings([B)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public close()V
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-wide v4, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
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
    iput-wide v6, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 57
    .line 58
    sget-object p0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 59
    .line 60
    invoke-static {p0, v4, v5}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeRelease(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :goto_3
    if-ge v3, v2, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    :goto_4
    if-ge v3, v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 85
    .line 86
    .line 87
    throw p0
.end method

.method public final exportDexFile(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$exportDexFile$1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$exportDexFile$1;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final synthetic findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p0

    return-object p0
.end method

.method public final findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass([B)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic findField(La80;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p0

    return-object p0
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findField([B)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p0

    return-object p0
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod([B)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getCallMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getCallMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getCallMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 26
    .line 27
    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final synthetic getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final getClassData(Ljava/lang/Class;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/ClassData;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p0

    return-object p0
.end method

.method public final getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x4c

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lq02;->з(Ljava/lang/CharSequence;)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x3b

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v0, 0x2e

    .line 29
    .line 30
    const/16 v1, 0x2f

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "L"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, ";"

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_0
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;

    .line 64
    .line 65
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, [B

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    sget-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 77
    .line 78
    sget-object v1, Lorg/luckypray/dexkit/schema/-ClassMeta;->Companion:Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;

    .line 79
    .line 80
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;->getRootAsClassMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_1
    const/4 p0, 0x0

    .line 97
    return-object p0

    .line 98
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 99
    .line 100
    const-string p1, "Char sequence is empty."

    .line 101
    .line 102
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
.end method

.method public final getDexNum()I
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final synthetic getFieldAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getFieldAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getFieldAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final synthetic getFieldByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getFieldByIds$res$1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getFieldByIds$res$1;-><init>([J)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [B

    .line 14
    .line 15
    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 29
    .line 30
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_0

    .line 39
    .line 40
    sget-object v3, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public final getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getFieldData$1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getFieldData$1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, [B

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 23
    .line 24
    sget-object v1, Lorg/luckypray/dexkit/schema/-FieldMeta;->Companion:Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;->getRootAsFieldMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final getFieldData(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getInvokeMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getInvokeMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getInvokeMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 26
    .line 27
    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final synthetic getMethodAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final synthetic getMethodByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodByIds$res$1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getMethodByIds$res$1;-><init>([J)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [B

    .line 14
    .line 15
    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 29
    .line 30
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_0

    .line 39
    .line 40
    sget-object v3, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public final getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodData$1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getMethodData$1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, [B

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 23
    .line 24
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMeta;->Companion:Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->getRootAsMethodMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final getMethodData(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/MethodData;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodData(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethodOpCodes$dexkit_android_release(J)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodOpCodes$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodOpCodes$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [I

    .line 11
    .line 12
    invoke-static {p0}, Lg7;->м([I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final synthetic getMethodUsingFields$dexkit_android_release(J)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingFields$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingFields$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;->getRootAsUsingFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->getItemsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/UsingFieldData;->-Companion:Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-UsingFieldMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-UsingFieldMeta;)Lorg/luckypray/dexkit/result/UsingFieldData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final synthetic getMethodUsingStrings$dexkit_android_release(J)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingStrings$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getMethodUsingStrings$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final synthetic getParameterAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 9

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getParameterAnnotations$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getParameterAnnotations$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;->getRootAsParametersAnnotationMetaArrayHoler(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->getAnnotationsArrayLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    move v2, v1

    .line 36
    :goto_0
    if-ge v2, v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->annotationsArray(I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v4, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    move v6, v1

    .line 55
    :goto_1
    if-ge v6, v5, :cond_0

    .line 56
    .line 57
    sget-object v7, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 58
    .line 59
    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, p0, v8}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    return-object p2
.end method

.method public final synthetic getParameterNames$dexkit_android_release(J)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getParameterNames$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$getParameterNames$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

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
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

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

.method public final synthetic getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getTypeByIds$res$1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$getTypeByIds$res$1;-><init>([J)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [B

    .line 14
    .line 15
    sget-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 29
    .line 30
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_0

    .line 39
    .line 40
    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public final initFullCache()V
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isValid()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final synthetic readFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$readFieldMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$readFieldMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 26
    .line 27
    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method

.method public final setMaxConcurrentQueries(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$setMaxConcurrentQueries$2;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$setMaxConcurrentQueries$2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeWriteToken(La80;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "maxConcurrentQueries must be >= 0"

    .line 13
    .line 14
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setThreadNum(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeWriteToken(La80;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "threadNum must be > 0"

    .line 13
    .line 14
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final synthetic withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->lifecycleLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmp-long p0, v1, v3

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :try_start_1
    const-string p0, "DexKitBridge is not valid"

    .line 36
    .line 37
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public final synthetic writeFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$writeFieldMethods$res$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$writeFieldMethods$res$1;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->withNativeReadToken$dexkit_android_release(La80;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [B

    .line 11
    .line 12
    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 26
    .line 27
    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object p2
.end method
