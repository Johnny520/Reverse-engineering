.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private token:J


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public static final d(Lorg/luckypray/dexkit/DexKitBridge;)J
    .locals 4

    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_0

    return-wide v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "DexKitBridge is not valid"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic f(J[J)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    move-result-object p0

    return-object p0
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

.method private static final native nativeSetThreadNum(JI)V
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    iput-wide v2, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final finalize()V
    .locals 0

    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    return-void
.end method

.method public final i(Lkh;)LD9;
    .locals 4

    new-instance v0, LCh;

    invoke-direct {v0}, LCh;-><init>()V

    invoke-virtual {p1, v0}, Lkh;->N(LCh;)I

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->d(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, LCh;->h()[B

    move-result-object p1

    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance v0, La;

    invoke-direct {v0}, La;-><init>()V

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2, p1}, La;->c(ILjava/nio/ByteBuffer;)V

    new-instance p1, LD9;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, La;->f(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, La;->g(I)La;

    move-result-object v3

    invoke-static {p0, v3}, LfG;->R(Lorg/luckypray/dexkit/DexKitBridge;La;)LC9;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    new-instance v0, LWb;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, LWb;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-le v2, v1, :cond_2

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2
    return-object p1
.end method

.method public final l(Lkh;)LSr;
    .locals 18

    new-instance v0, LCh;

    invoke-direct {v0}, LCh;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lkh;->N(LCh;)I

    invoke-static/range {p0 .. p0}, Lorg/luckypray/dexkit/DexKitBridge;->d(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, LCh;->h()[B

    move-result-object v0

    invoke-static {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v1, La;

    invoke-direct {v1}, La;-><init>()V

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3, v0}, La;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, LSr;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, La;->b(I)I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, La;->f(I)I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_d

    new-instance v6, La;

    invoke-direct {v6}, La;-><init>()V

    invoke-virtual {v1, v2}, La;->b(I)I

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-virtual {v1, v7}, La;->e(I)I

    move-result v7

    mul-int/lit8 v9, v5, 0x4

    add-int/2addr v9, v7

    invoke-virtual {v1, v9}, La;->a(I)I

    move-result v7

    iget-object v9, v1, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v7, v9}, La;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_2

    :cond_1
    move-object v6, v8

    :goto_2
    const/16 v7, 0xa

    invoke-virtual {v6, v7}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_2

    iget-object v9, v6, La;->b:Ljava/nio/ByteBuffer;

    iget v10, v6, La;->a:I

    add-int/2addr v7, v10

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    goto :goto_3

    :cond_2
    const/4 v7, 0x0

    :goto_3
    const/high16 v9, 0x20000

    and-int v10, v7, v9

    if-lez v10, :cond_3

    xor-int/2addr v7, v9

    or-int/lit8 v7, v7, 0x20

    :cond_3
    move v14, v7

    invoke-virtual {v6, v2}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_4

    iget-object v9, v6, La;->b:Ljava/nio/ByteBuffer;

    iget v10, v6, La;->a:I

    add-int/2addr v7, v10

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    move v11, v7

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    const/4 v7, 0x6

    invoke-virtual {v6, v7}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_5

    iget-object v9, v6, La;->b:Ljava/nio/ByteBuffer;

    iget v10, v6, La;->a:I

    add-int/2addr v7, v10

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    move v12, v7

    goto :goto_5

    :cond_5
    const/4 v12, 0x0

    :goto_5
    const/16 v7, 0x8

    invoke-virtual {v6, v7}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_6

    iget-object v9, v6, La;->b:Ljava/nio/ByteBuffer;

    iget v10, v6, La;->a:I

    add-int/2addr v7, v10

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    move v13, v7

    goto :goto_6

    :cond_6
    const/4 v13, 0x0

    :goto_6
    const/16 v7, 0xc

    invoke-virtual {v6, v7}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_7

    iget v8, v6, La;->a:I

    add-int/2addr v7, v8

    invoke-virtual {v6, v7}, La;->d(I)Ljava/lang/String;

    move-result-object v8

    :cond_7
    if-nez v8, :cond_8

    const-string v8, ""

    :cond_8
    move-object v15, v8

    const/16 v7, 0xe

    invoke-virtual {v6, v7}, La;->b(I)I

    move-result v7

    if-eqz v7, :cond_9

    iget-object v8, v6, La;->b:Ljava/nio/ByteBuffer;

    iget v9, v6, La;->a:I

    add-int/2addr v7, v9

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    move/from16 v16, v7

    goto :goto_7

    :cond_9
    const/16 v16, 0x0

    :goto_7
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/16 v8, 0x10

    invoke-virtual {v6, v8}, La;->b(I)I

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v6, v9}, La;->f(I)I

    move-result v9

    goto :goto_8

    :cond_a
    const/4 v9, 0x0

    :goto_8
    const/4 v10, 0x0

    :goto_9
    if-ge v10, v9, :cond_c

    invoke-virtual {v6, v8}, La;->b(I)I

    move-result v2

    if-eqz v2, :cond_b

    iget-object v4, v6, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v2}, La;->e(I)I

    move-result v2

    mul-int/lit8 v17, v10, 0x4

    add-int v2, v17, v2

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    :goto_a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x4

    goto :goto_9

    :cond_c
    new-instance v9, LRr;

    move-object/from16 v10, p0

    move-object/from16 v17, v7

    invoke-direct/range {v9 .. v17}, LRr;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V

    invoke-virtual {v0, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    const/4 v2, 0x4

    goto/16 :goto_1

    :cond_d
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_e

    new-instance v1, LWb;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, LWb;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-le v3, v2, :cond_e

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_e
    return-object v0
.end method
