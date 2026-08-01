.class public abstract Lcom/google/protobuf/GeneratedMessage;
.super Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;,
        Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;,
        Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;
    }
.end annotation


# static fields
.field static final PRE22_GENCODE_ERROR_PROPERTY:Ljava/lang/String; = "com.google.protobuf.error_on_unsafe_pre22_gencode"

.field static final PRE22_GENCODE_SILENCE_PROPERTY:Ljava/lang/String; = "com.google.protobuf.use_unsafe_pre22_gencode"

.field static final PRE22_GENCODE_VULNERABILITY_MESSAGE:Ljava/lang/String; = "As of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2"

.field protected static alwaysUseFieldBuilders:Z = false

.field protected static final loggedPre22TypeNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final logger:Ljava/util/logging/Logger;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field protected unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/google/protobuf/GeneratedMessage;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/protobuf/GeneratedMessage;->logger:Ljava/util/logging/Logger;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/google/protobuf/GeneratedMessage;->loggedPre22TypeNames:Ljava/util/Set;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getDefaultInstance()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ")V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 12
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    return-void
.end method

.method public static synthetic access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage;->getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$500(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessage;->checkNotLite(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$800(Lcom/google/protobuf/GeneratedMessage;Z)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;->getAllFieldsMutable(Z)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static checkNotLite(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageT:",
            "Lcom/google/protobuf/GeneratedMessage$ExtendableMessage<",
            "TMessageT;>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u5b50\u54f2\u82cf;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;->飘花落叶言子楪世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Expected non-lite extension."

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

.method public static computeStringSize(ILjava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/2addr v0, p1

    .line 20
    add-int/2addr v0, p0

    .line 21
    return v0

    .line 22
    :cond_0
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/ByteString;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public static computeStringSizeNoTag(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    sget-boolean v0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 8
    .line 9
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    add-int/2addr v0, p0

    .line 18
    return v0

    .line 19
    :cond_0
    check-cast p0, Lcom/google/protobuf/ByteString;

    .line 20
    .line 21
    sget-boolean v0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0
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

.method public static emptyList(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public static emptyLongList()Lcom/google/protobuf/飘花落叶言世子苏哲楪兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 2
    .line 3
    return-object v0
.end method

.method public static enableAlwaysUseFieldBuildersForTesting()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->setAlwaysUseFieldBuildersForTesting(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private getAllFieldsMutable(Z)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰世苏()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_6

    .line 22
    .line 23
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 28
    .line 29
    iget-object v4, v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲苏兰:Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget v3, v4, Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;->飘花落叶言子楪兰苏世哲:I

    .line 34
    .line 35
    add-int/lit8 v3, v3, -0x1

    .line 36
    .line 37
    add-int/2addr v2, v3

    .line 38
    invoke-virtual {p0, v4}, Lcom/google/protobuf/GeneratedMessage;->hasOneof(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    invoke-virtual {p0, v4}, Lcom/google/protobuf/GeneratedMessage;->getOneofFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessage;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_5

    .line 67
    .line 68
    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessage;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    sget-object v5, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->STRING:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 86
    .line 87
    if-ne v4, v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessage;->getFieldRaw(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessage;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    return-object v0
.end method

.method private static varargs getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

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
    new-instance v0, Ljava/lang/IllegalStateException;

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
    invoke-direct {v0, p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method private static varargs invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

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
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static isStringEmpty(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    check-cast p0, Lcom/google/protobuf/ByteString;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public static makeMutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "ListT::Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;",
            ">(T",
            "ListT;",
            ")T",
            "ListT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 18
    invoke-static {p0, v0}, Lcom/google/protobuf/GeneratedMessage;->makeMutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    move-result-object p0

    return-object p0
.end method

.method public static makeMutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "ListT::Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u5170\u696a;",
            ">(T",
            "ListT;",
            "I)T",
            "ListT;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    mul-int/lit8 p1, v0, 0x2

    .line 8
    .line 9
    :cond_0
    if-gtz p1, :cond_1

    .line 10
    .line 11
    const/16 p1, 0xa

    .line 12
    .line 13
    :cond_1
    invoke-interface {p0, p1}, Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;->飘花落叶言子楪苏兰哲世(I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static maybeSerializeBooleanEntryTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Ljava/util/Map<",
            "Ljava/lang/Boolean;",
            "TV;>;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "IZ)V"
        }
    .end annotation

    .line 1
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2, v0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p3, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public static newFileScopedGeneratedExtension(Ljava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingT::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lcom/google/protobuf/Extension$ExtensionType;->IMMUTABLE:Lcom/google/protobuf/Extension$ExtensionType;

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, p1, v2}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;-><init>(Lcom/google/protobuf/飘花落叶言楪哲子苏兰世;Ljava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;Lcom/google/protobuf/Extension$ExtensionType;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static newMessageScopedGeneratedExtension(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;ILjava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingT::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            "I",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 2
    .line 3
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪哲子苏兰世;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲子苏兰世;-><init>(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;I)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lcom/google/protobuf/Extension$ExtensionType;->IMMUTABLE:Lcom/google/protobuf/Extension$ExtensionType;

    .line 9
    .line 10
    invoke-direct {v0, v1, p2, p3, p0}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;-><init>(Lcom/google/protobuf/飘花落叶言楪哲子苏兰世;Ljava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;Lcom/google/protobuf/Extension$ExtensionType;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Ljava/io/InputStream;",
            ")TM;"
        }
    .end annotation

    .line 1
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    throw p0
.end method

.method public static parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Ljava/io/InputStream;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TM;"
        }
    .end annotation

    .line 18
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            ")TM;"
        }
    .end annotation

    .line 50
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 51
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 52
    invoke-interface {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 53
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 54
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TM;"
        }
    .end annotation

    .line 55
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 56
    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 57
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 58
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Ljava/io/InputStream;",
            ")TM;"
        }
    .end annotation

    .line 1
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :try_start_1
    invoke-virtual {p1, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    .line 20
    .line 21
    .line 22
    :try_start_2
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 23
    .line 24
    .line 25
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 26
    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception p1

    .line 31
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    throw p0
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_0

    .line 36
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    throw p0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u696a\u54f2\u5b50\u5170;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;",
            "Ljava/io/InputStream;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")TM;"
        }
    .end annotation

    .line 41
    :try_start_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    move-result-object p1

    .line 44
    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p2, 0x0

    .line 45
    :try_start_1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    :try_start_2
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 47
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p1

    .line 48
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static serializeBooleanMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage;->serializeMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static serializeIntegerMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage;->serializeMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static serializeLongMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage;->serializeMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static serializeMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method public static serializeStringMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage;->serializeMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static setAlwaysUseFieldBuildersForTesting(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return-void
.end method

.method public static warnPre22Gencode(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "com.google.protobuf.use_unsafe_pre22_gencode"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "Vulnerable protobuf generated type in use: "

    .line 15
    .line 16
    const-string v1, "\nAs of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2"

    .line 17
    .line 18
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "com.google.protobuf.error_on_unsafe_pre22_gencode"

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object v1, Lcom/google/protobuf/GeneratedMessage;->loggedPre22TypeNames:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_1
    sget-object p0, Lcom/google/protobuf/GeneratedMessage;->logger:Ljava/util/logging/Logger;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p2, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏哲兰楪(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast p2, Lcom/google/protobuf/ByteString;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰苏世哲(ILcom/google/protobuf/ByteString;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static writeStringNoTag(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰楪哲(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/ByteString;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getAllFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessage;->getAllFieldsMutable(Z)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getAllFieldsRaw()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessage;->getAllFieldsMutable(Z)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getFieldRaw(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getOneofFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Lcom/google/protobuf/飘花落叶言楪哲苏世兰子;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏世兰子;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This is supposed to be overridden by subclasses."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p2, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;->飘花落叶言子楪苏哲世兰(ILcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;->飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/GeneratedMessage;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getSerializedSize()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getAllFieldsRaw()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 16
    .line 17
    return v0
.end method

.method public getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/GeneratedMessage;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public hasOneof(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Lcom/google/protobuf/飘花落叶言楪哲苏世兰子;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言楪哲苏世兰子;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/GeneratedMessage;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public abstract internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
.end method

.method public internalGetMapField(I)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "No map fields found in "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public internalGetMapFieldReflection(I)Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage;->internalGetMapField(I)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public isInitialized()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰世苏()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲苏兰()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessage;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    return v3

    .line 39
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v4, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 44
    .line 45
    if-ne v2, v4, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessage;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 74
    .line 75
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->isInitialized()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    return v3

    .line 82
    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessage;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessage;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 93
    .line 94
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->isInitialized()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_0

    .line 99
    .line 100
    return v3

    .line 101
    :cond_4
    const/4 p0, 0x1

    .line 102
    return p0
.end method

.method public makeExtensionsImmutable()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessage;->warnPre22Gencode(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method

.method public newInstance(Lcom/google/protobuf/飘花落叶言楪兰子哲苏世;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This method must be overridden by the subclass."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p4, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public parseUnknownFieldProto3(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/GeneratedMessage;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public setUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getAllFieldsRaw()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
