.class public final Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;
.super Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# instance fields
.field private volatile cachedSerializedSize:I

.field private final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Object;"
        }
    .end annotation
.end field

.field private final metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u82cf\u5b50\u5170;"
        }
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Object;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u82cf\u5b50\u5170;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5b50\u54f2\u5170\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 6
    .line 7
    :try_start_0
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 8
    .line 9
    invoke-static {p1, p2, p3}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :catch_1
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :goto_0
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0

    .line 40
    :goto_1
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言世楪苏兰哲子;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u82cf\u5b50\u5170;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 53
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 54
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 55
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世楪苏兰哲子;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u4e16\u82cf\u5170;",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 48
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 49
    iput-object p5, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 50
    new-instance p3, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    invoke-direct {p3, p1, p0, p2, p4}, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;-><init>(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$FieldType;)V

    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    return-void
.end method

.method public static synthetic access$000(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->isInitialized(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private checkFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "Wrong FieldDescriptor \""

    .line 19
    .line 20
    const-string v1, "\" used in message \""

    .line 21
    .line 22
    invoke-static {v0, p1, v1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static isInitialized(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u82cf\u5b50\u5170;",
            "TV;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 12
    .line 13
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;->isInitialized()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static newDefaultInstance(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u4e16\u82cf\u5170;",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "TK;",
            "Lcom/google/protobuf/WireFormat$FieldType;",
            "TV;)",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;-><init>(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public getAllFields()Ljava/util/Map;
    .locals 4
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
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 7
    .line 8
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰世苏()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 4
    .line 5
    return-object p0
.end method

.method public getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->checkFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getKey()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰世苏(I)Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_1
    return-object p0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMetadata()Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u82cf\u5b50\u5170;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言世楪哲子兰苏;

    .line 4
    .line 5
    return-object p0
.end method

.method public getRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string p1, "There is no repeated field in a map entry message."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string p1, "There is no repeated field in a map entry message."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->cachedSerializedSize:I

    .line 20
    .line 21
    return v0
.end method

.method public getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getDefaultInstance()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->checkFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public isInitialized()Z
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->isInitialized(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言世楪苏兰哲子;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;ZZLcom/google/protobuf/飘花落叶言世楪苏兰哲子;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->metadata:Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->key:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->value:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, p0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
