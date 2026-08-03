.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "SourceFile"

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
.field private token:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/ClassLoader;Z)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByClassLoader(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/ClassLoader;Z)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;ZLQ0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKit(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>([[B)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByBytesArray(Lorg/luckypray/dexkit/DexKitBridge$Companion;[[B)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>([[BLQ0/d;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[B)V

    return-void
.end method

.method public static final synthetic access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J
    .locals 2

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeBatchFindClassUsingStrings(J[B)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindClassUsingStrings(J[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeBatchFindMethodUsingStrings(J[B)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindMethodUsingStrings(J[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeExportDexFile(JLjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeExportDexFile(JLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$nativeFieldGetMethods(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldGetMethods(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeFieldPutMethods(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldPutMethods(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeFindClass(J[B)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeFindField(J[B)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindField(J[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeFindMethod(J[B)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetCallMethods(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetCallMethods(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetClassAnnotations(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassAnnotations(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetClassByIds(J[J)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetClassData(JLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassData(JLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetDexNum(J)I
    .locals 0

    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetDexNum(J)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$nativeGetFieldAnnotations(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldAnnotations(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetFieldByIds(J[J)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldByIds(J[J)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetFieldData(JLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldData(JLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetInvokeMethods(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetInvokeMethods(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodAnnotations(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodAnnotations(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodByIds(J[J)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodByIds(J[J)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodData(JLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodData(JLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodOpCodes(JJ)[I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodOpCodes(JJ)[I

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodUsingFields(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingFields(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetParameterAnnotations(JJ)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterAnnotations(JJ)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeGetParameterNames(JJ)[Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterNames(JJ)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nativeInitDexKit(Ljava/lang/String;)J
    .locals 2

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByBytesArray([[B)J
    .locals 2

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByBytesArray([[B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
    .locals 0

    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$nativeInitFullCache(J)V
    .locals 0

    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitFullCache(J)V

    return-void
.end method

.method public static final synthetic access$nativeRelease(J)V
    .locals 0

    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    return-void
.end method

.method public static final synthetic access$nativeSetThreadNum(JI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetThreadNum(JI)V

    return-void
.end method

.method private final batchFindClassUsingStrings(LP0/l;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final batchFindClassUsingStrings$dexkit_android_release(Lcom/google/flatbuffers/b;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/flatbuffers/b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindClassUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;->getRootAsBatchClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->getItemsLength()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v6, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v6}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getClassesLength()I

    move-result v7

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_0

    sget-object v9, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v10

    invoke-static {v10}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_1

    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;

    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;-><init>()V

    invoke-static {v6, v4}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final batchFindMethodUsingStrings(LP0/l;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final batchFindMethodUsingStrings$dexkit_android_release(Lcom/google/flatbuffers/b;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/flatbuffers/b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;->getRootAsBatchMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->getItemsLength()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchMethodMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v6, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v6}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getMethodsLength()I

    move-result v7

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_0

    sget-object v9, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v10

    invoke-static {v10}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_1

    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;

    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;-><init>()V

    invoke-static {v6, v4}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method public static final create([[B)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create([[B)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method private final findClass(LP0/l;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/result/ClassDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p1

    return-object p1
.end method

.method private final findClass$dexkit_android_release(Lcom/google/flatbuffers/b;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 5

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindClass(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method private final findField(LP0/l;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/result/FieldDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p1

    return-object p1
.end method

.method private final findField$dexkit_android_release(Lcom/google/flatbuffers/b;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 5

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindField(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method private final findMethod(LP0/l;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/result/MethodDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
.end method

.method private final findMethod$dexkit_android_release(Lcom/google/flatbuffers/b;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 5

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindMethod(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method private final getCallMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetCallMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getFieldAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getFieldByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 5

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final getInvokeMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetInvokeMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getMethodAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getMethodByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 5

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final getMethodOpCodes$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodOpCodes(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[I

    move-result-object p1

    invoke-static {p1}, LE0/j;->p0([I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final getMethodUsingFields$dexkit_android_release(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/UsingFieldData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodUsingFields(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;->getRootAsUsingFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->getItemsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/UsingFieldData;->-Companion:Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-UsingFieldMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-UsingFieldMeta;)Lorg/luckypray/dexkit/result/UsingFieldData;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final getMethodUsingStrings$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LE0/j;->q0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final getParameterAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetParameterAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;->getRootAsParametersAnnotationMetaArrayHoler(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->getAnnotationsArrayLength()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->annotationsArray(I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v5

    move v6, v1

    :goto_1
    if-ge v6, v5, :cond_0

    sget-object v7, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v8

    invoke-static {v8}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v7, p0, v8}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method private final getParameterNames$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetParameterNames(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    return-object p2
.end method

.method private final getSafeToken()J
    .locals 4

    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DexKitBridge is not valid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 5

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
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

.method private static final native nativeSetThreadNum(JI)V
.end method

.method private final readFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFieldGetMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private final writeFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFieldPutMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    sget-object p2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "wrap(res)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance p2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {p2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method


# virtual methods
.method public final batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 11
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

    const-string v0, "batchFind"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/google/flatbuffers/b;

    invoke-direct {v0}, Lcom/google/flatbuffers/b;-><init>()V

    .line 2
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    .line 3
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindClassUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;->getRootAsBatchClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->getItemsLength()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v6, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v6}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getClassesLength()I

    move-result v7

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_0

    sget-object v9, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v10

    invoke-static {v10}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_1

    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;

    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;-><init>()V

    invoke-static {v6, v4}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 11
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

    const-string v0, "batchFind"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/google/flatbuffers/b;

    invoke-direct {v0}, Lcom/google/flatbuffers/b;-><init>()V

    .line 2
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    .line 3
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;->getRootAsBatchMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->getItemsLength()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchMethodMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v6, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v6}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {v4}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getMethodsLength()I

    move-result v7

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_0

    sget-object v9, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v10

    invoke-static {v10}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_1

    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;

    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;-><init>()V

    invoke-static {v6, v4}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeRelease(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
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
    monitor-exit p0

    throw v0
.end method

.method public final exportDexFile(Ljava/lang/String;)V
    .locals 3

    const-string v0, "outPath"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeExportDexFile(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)V

    return-void
.end method

.method public final finalize()V
    .locals 0

    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    return-void
.end method

.method public final findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 5

    const-string v0, "findClass"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/google/flatbuffers/b;

    invoke-direct {v0}, Lcom/google/flatbuffers/b;-><init>()V

    .line 2
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    .line 3
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindClass(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 5

    const-string v0, "findField"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/google/flatbuffers/b;

    invoke-direct {v0}, Lcom/google/flatbuffers/b;-><init>()V

    .line 2
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    .line 3
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindField(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 5

    const-string v0, "findMethod"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/google/flatbuffers/b;

    invoke-direct {v0}, Lcom/google/flatbuffers/b;-><init>()V

    .line 2
    invoke-static {p1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    .line 3
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/flatbuffers/b;->q()[B

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindMethod(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object p1

    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "wrap(res)"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object p1

    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    sget-object v3, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v4

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    new-instance p1, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;

    invoke-direct {p1}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;-><init>()V

    invoke-static {v0, p1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method public final getClassData(Ljava/lang/Class;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/ClassData;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    return-object p1
.end method

.method public final getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 3

    const-string v0, "identifier"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Char sequence is empty."

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x4c

    if-ne v0, v2, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, LW0/j;->L0(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 v0, 0x2e

    const/16 v1, 0x2f

    .line 6
    invoke-static {p1, v0, v1}, LW0/r;->G0(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    const-string v0, "L"

    const-string v1, ";"

    .line 7
    invoke-static {v0, p1, v1}, LS/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    :goto_0
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_2

    .line 10
    sget-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    sget-object v1, Lorg/luckypray/dexkit/schema/-ClassMeta;->Companion:Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v2, "wrap(it)"

    invoke-static {p1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;->getRootAsClassMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1

    .line 11
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDexNum()I
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetDexNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)I

    move-result v0

    return v0
.end method

.method public final getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    sget-object v1, Lorg/luckypray/dexkit/schema/-FieldMeta;->Companion:Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v2, "wrap(it)"

    invoke-static {p1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;->getRootAsFieldMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getFieldData(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    sget-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMeta;->Companion:Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v2, "wrap(it)"

    invoke-static {p1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->getRootAsMethodMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getMethodData(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/MethodData;"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodData(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1

    const-string v0, "method"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p1

    return-object p1
.end method

.method public final initFullCache()V
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitFullCache(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    return-void
.end method

.method public final isValid()Z
    .locals 4

    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final setThreadNum(I)V
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeSetThreadNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;JI)V

    return-void
.end method
