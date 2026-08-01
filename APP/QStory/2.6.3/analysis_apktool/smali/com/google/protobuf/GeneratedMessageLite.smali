.class public abstract Lcom/google/protobuf/GeneratedMessageLite;
.super Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;,
        Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;,
        Lcom/google/protobuf/GeneratedMessageLite$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/protobuf/GeneratedMessageLite;->defaultInstanceMap:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 6
    .line 7
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic access$000(Lcom/google/protobuf/GeneratedMessageLite;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->isInitialized(Lcom/google/protobuf/GeneratedMessageLite;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$100(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkIsLite(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$300(Lcom/google/protobuf/GeneratedMessageLite;[BIILcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;[BIILcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static checkIsLite(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Lcom/google/protobuf/GeneratedMessageLite$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "BuilderType:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u82cf\u5b50;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;->飘花落叶言子楪世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Expected a lite extension."

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method private static checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->newUninitializedMessageException()Lcom/google/protobuf/UninitializedMessageException;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/UninitializedMessageException;->asInvalidProtocolBufferException()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-object p0
.end method

.method private computeSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a;",
            ")I"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public static emptyBooleanList()Lcom/google/protobuf/飘花落叶言楪兰哲苏世子;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    return-object v0
.end method

.method public static emptyDoubleList()Lcom/google/protobuf/飘花落叶言世子楪苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;

    .line 2
    .line 3
    return-object v0
.end method

.method public static emptyFloatList()Lcom/google/protobuf/飘花落叶言世子楪兰苏哲;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 2
    .line 3
    return-object v0
.end method

.method public static emptyLongList()Lcom/google/protobuf/飘花落叶言世子苏哲楪兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 2
    .line 3
    return-object v0
.end method

.method public static emptyProtobufList()Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private ensureUnknownFieldsInitialized()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static getDefaultInstance(Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite;->defaultInstanceMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite;->defaultInstanceMap:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    const-string v0, "Class initialization cannot fail."

    .line 35
    .line 36
    invoke-static {v0, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    :goto_0
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->getDefaultInstanceForType()Lcom/google/protobuf/GeneratedMessageLite;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object v1, Lcom/google/protobuf/GeneratedMessageLite;->defaultInstanceMap:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_2
    return-object v0
.end method

.method public static varargs getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p2

    .line 7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Generated message class \""

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "\" missing method \""

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, "\"."

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method public static varargs invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object p0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    instance-of p1, p0, Ljava/lang/Error;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "Unexpected exception thrown by generated accessor method."

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    check-cast p0, Ljava/lang/Error;

    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    throw p0

    .line 32
    :catch_1
    move-exception p0

    .line 33
    const-string p1, "Couldn\'t use Java reflection to implement protocol message reflection."

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method private static final isInitialized(Lcom/google/protobuf/GeneratedMessageLite;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;Z)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->GET_MEMOIZED_IS_INITIALIZED:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Byte;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    sget-object p1, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->SET_MEMOIZED_IS_INITIALIZED:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v2, v1

    .line 48
    :goto_0
    invoke-virtual {p0, p1, v2, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_3
    return v0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 3
    .line 4
    iget v0, v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪哲兰苏世:I

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪苏世兰哲(I)Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言世子楪兰苏哲;)Lcom/google/protobuf/飘花落叶言世子楪兰苏哲;
    .locals 1

    .line 18
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;

    .line 19
    iget v0, v0, Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪哲兰苏世:I

    mul-int/lit8 v0, v0, 0x2

    .line 20
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪苏世哲兰(I)Lcom/google/protobuf/飘花落叶言楪哲子世苏兰;

    move-result-object p0

    return-object p0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言世子楪苏哲兰;)Lcom/google/protobuf/飘花落叶言世子楪苏哲兰;
    .locals 1

    .line 21
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;

    .line 22
    iget v0, v0, Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;->飘花落叶言子楪哲兰苏世:I

    mul-int/lit8 v0, v0, 0x2

    .line 23
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;->飘花落叶言子楪苏世哲兰(I)Lcom/google/protobuf/飘花落叶言楪世子哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    .line 28
    invoke-interface {p0, v0}, Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;->飘花落叶言子楪苏兰哲世(I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    move-result-object p0

    return-object p0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲楪兰;)Lcom/google/protobuf/飘花落叶言世子苏哲楪兰;
    .locals 1

    .line 15
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 16
    iget v0, v0, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪哲兰苏世:I

    mul-int/lit8 v0, v0, 0x2

    .line 17
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪苏世兰哲(I)Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    move-result-object p0

    return-object p0
.end method

.method public static mutableCopy(Lcom/google/protobuf/飘花落叶言楪兰哲苏世子;)Lcom/google/protobuf/飘花落叶言楪兰哲苏世子;
    .locals 1

    .line 24
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;

    .line 25
    iget v0, v0, Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:I

    mul-int/lit8 v0, v0, 0x2

    .line 26
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I)Lcom/google/protobuf/飘花落叶言子楪兰世哲苏;

    move-result-object p0

    return-object p0
.end method

.method public static newMessageInfo(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲苏兰楪子;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲苏兰楪子;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newRepeatedGeneratedExtension(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;ILcom/google/protobuf/WireFormat$FieldType;ZLjava/lang/Class;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u54f2\u5b50\u696a\u5170;",
            "Type:",
            "Ljava/lang/Object;",
            ">(TContainingType;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u54f2\u5b50\u696a\u5170;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u82cf\u5170;",
            "I",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "Z",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u82cf\u5b50;"
        }
    .end annotation

    .line 1
    sget-object p6, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 2
    .line 3
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 4
    .line 5
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move v6, p5

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;-><init>(Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;ILcom/google/protobuf/WireFormat$FieldType;ZZ)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, p6, p1, v1}, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static newSingularGeneratedExtension(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;ILcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u54f2\u5b50\u696a\u5170;",
            "Type:",
            "Ljava/lang/Object;",
            ">(TContainingType;TType;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u54f2\u5b50\u696a\u5170;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u82cf\u5170;",
            "I",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u82cf\u5b50;"
        }
    .end annotation

    .line 1
    new-instance p6, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 2
    .line 3
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v1, p3

    .line 8
    move v2, p4

    .line 9
    move-object v3, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;-><init>(Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;ILcom/google/protobuf/WireFormat$FieldType;ZZ)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p6, p0, p1, p2, v0}, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;)V

    .line 14
    .line 15
    .line 16
    return-object p6
.end method

.method public static parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/io/InputStream;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 14
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 15
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/ByteString;",
            ")TT;"
        }
    .end annotation

    .line 19
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 20
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/ByteString;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 21
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            ")TT;"
        }
    .end annotation

    .line 33
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 34
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/io/InputStream;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 31
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 32
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/nio/ByteBuffer;",
            ")TT;"
        }
    .end annotation

    .line 18
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/nio/ByteBuffer;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 29
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;[B)TT;"
        }
    .end annotation

    .line 22
    array-length v0, p1

    .line 23
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v1

    const/4 v2, 0x0

    .line 24
    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;[BIILcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 25
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;[B",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 26
    array-length v1, p1

    .line 27
    invoke-static {p0, p1, v0, v1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;[BIILcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    .line 28
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageLite;->checkMessageInitialized(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method private static parsePartialDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Ljava/io/InputStream;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪哲苏兰(Ljava/io/InputStream;I)I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 14
    new-instance v1, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p1, v0, v2}, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;-><init>(Ljava/io/InputStream;II)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :try_start_1
    invoke-virtual {p1, v2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0

    .line 38
    :catch_1
    move-exception p0

    .line 39
    new-instance p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :catch_2
    move-exception p0

    .line 46
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->getThrownFromInputStream()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    new-instance p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 55
    .line 56
    .line 57
    move-object p0, p1

    .line 58
    :cond_1
    throw p0
.end method

.method private static parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/ByteString;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 124
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->newCodedInput()Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    move-result-object p1

    .line 125
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    const/4 p2, 0x0

    .line 126
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 127
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            ")TT;"
        }
    .end annotation

    .line 123
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public static parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->newMutableInstance()Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p1, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言子世哲楪兰苏;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Lcom/google/protobuf/飘花落叶言子世哲楪兰苏;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lcom/google/protobuf/飘花落叶言子世哲楪兰苏;-><init>(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v0, p0, v1, p2}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/protobuf/UninitializedMessageException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :catch_1
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :catch_2
    move-exception p1

    .line 40
    goto :goto_3

    .line 41
    :catch_3
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of p1, p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 55
    .line 56
    throw p0

    .line 57
    :cond_1
    throw p0

    .line 58
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    instance-of p2, p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 71
    .line 72
    throw p0

    .line 73
    :cond_2
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 74
    .line 75
    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/UninitializedMessageException;->asInvalidProtocolBufferException()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    throw p0

    .line 92
    :goto_3
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getThrownFromInputStream()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_3

    .line 97
    .line 98
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 99
    .line 100
    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 101
    .line 102
    .line 103
    move-object p1, p2

    .line 104
    :cond_3
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    throw p0
.end method

.method private static parsePartialFrom(Lcom/google/protobuf/GeneratedMessageLite;[BIILcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/GeneratedMessageLite;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(TT;[BII",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TT;"
        }
    .end annotation

    if-nez p3, :cond_0

    return-object p0

    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->newMutableInstance()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v1

    .line 110
    :try_start_0
    sget-object p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    move-result-object v0

    add-int v4, p2, p3

    .line 113
    new-instance v5, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;

    invoke-direct {v5, p4}, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;-><init>(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    move-object v2, p1

    move v3, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)V

    .line 114
    invoke-interface {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/protobuf/UninitializedMessageException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_3

    return-object v1

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 115
    :catch_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    .line 116
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    if-eqz p1, :cond_1

    .line 117
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/InvalidProtocolBufferException;

    throw p0

    .line 118
    :cond_1
    new-instance p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p1, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    .line 119
    :goto_1
    invoke-virtual {p0}, Lcom/google/protobuf/UninitializedMessageException;->asInvalidProtocolBufferException()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    .line 120
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->getThrownFromInputStream()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 121
    new-instance p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    move-object p0, p1

    .line 122
    :cond_2
    invoke-virtual {p0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->markImmutable()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite;->defaultInstanceMap:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public buildMessageInfo()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->BUILD_MESSAGE_INFO:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public clearMemoizedHashCode()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 3
    .line 4
    return-void
.end method

.method public clearMemoizedSerializedSize()V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite;->setMemoizedSerializedSize(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public computeHashCode()I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessageLite;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final createBuilder()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType2:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            "BuilderType2:",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2;",
            ">()TBuilderType2;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->NEW_BUILDER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType2:",
            "Lcom/google/protobuf/GeneratedMessageLite;",
            "BuilderType2:",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2;",
            ">(TMessageType2;)TBuilderType2;"
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;

    const/4 p0, 0x0

    throw p0
.end method

.method public abstract dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast p1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 34
    .line 35
    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/GeneratedMessageLite;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/GeneratedMessageLite;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/GeneratedMessageLite;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->GET_DEFAULT_INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 9
    .line 10
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->getDefaultInstanceForType()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    return-object p0
.end method

.method public getMemoizedHashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 2
    .line 3
    return p0
.end method

.method public getMemoizedSerializedSize()I
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 2
    .line 3
    const v0, 0x7fffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    return p0
.end method

.method public final getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->GET_PARSER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 9
    .line 10
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite;->getSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I

    move-result p0

    return p0
.end method

.method public getSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->isMutable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->computeSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const-string p1, "serialized size must be non-negative, was "

    .line 15
    .line 16
    invoke-static {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->getMemoizedSerializedSize()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const v1, 0x7fffffff

    .line 30
    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->getMemoizedSerializedSize()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->computeSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->setMemoizedSerializedSize(I)V

    .line 44
    .line 45
    .line 46
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->isMutable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->computeHashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->hashCodeIsNotMemoized()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->computeHashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite;->setMemoizedHashCode(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->getMemoizedHashCode()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public hashCodeIsNotMemoized()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->getMemoizedHashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    .line 52
    invoke-static {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite;->isInitialized(Lcom/google/protobuf/GeneratedMessageLite;Z)Z

    move-result p0

    return p0
.end method

.method public isMutable()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public makeImmutable()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->markImmutable()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public markImmutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 8
    .line 9
    return-void
.end method

.method public mergeLengthDelimitedField(ILcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;->ensureUnknownFieldsInitialized()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏哲兰()V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    shl-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    or-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "Zero is not a valid field number."

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;)Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 8
    .line 9
    return-void
.end method

.method public mergeVarintField(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;->ensureUnknownFieldsInitialized()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏哲兰()V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    shl-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    int-to-long v0, p2

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Zero is not a valid field number."

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->newBuilderForType()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final newBuilderForType()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->NEW_BUILDER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public newMutableInstance()Lcom/google/protobuf/GeneratedMessageLite;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/GeneratedMessageLite;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->NEW_MUTABLE_INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 9
    .line 10
    return-object p0
.end method

.method public parseUnknownField(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;->ensureUnknownFieldsInitialized()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public setMemoizedHashCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 2
    .line 3
    return-void
.end method

.method public setMemoizedSerializedSize(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    and-int/2addr p1, v1

    .line 12
    or-int/2addr p1, v0

    .line 13
    iput p1, p0, Lcom/google/protobuf/GeneratedMessageLite;->memoizedSerializedSize:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "serialized size must be non-negative, was "

    .line 17
    .line 18
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final toBuilder()Lcom/google/protobuf/飘花落叶言楪兰世苏子哲;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->NEW_BUILDER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/protobuf/GeneratedMessageLite;->dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p0, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言世苏哲楪子兰;->飘花落叶言子楪世苏哲兰:[C

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "# "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p0, v1, v0}, Lcom/google/protobuf/飘花落叶言世苏哲楪子兰;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/GeneratedMessageLite;Ljava/lang/StringBuilder;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p1, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;-><init>(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
