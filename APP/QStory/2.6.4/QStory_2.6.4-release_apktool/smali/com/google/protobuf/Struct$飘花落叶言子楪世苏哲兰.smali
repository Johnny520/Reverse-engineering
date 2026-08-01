.class public final Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世兰哲子苏楪;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Struct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# static fields
.field private static final fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;


# instance fields
.field private bitField0_:I

.field private fields_:Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5b50\u696a\u5170\u54f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/Struct;)V
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    new-instance v3, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 22
    .line 23
    sget-object v4, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 24
    .line 25
    int-to-double v5, v2

    .line 26
    const-wide/high16 v7, 0x3fe8000000000000L    # 0.75

    .line 27
    .line 28
    div-double/2addr v5, v7

    .line 29
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    double-to-int v2, v5

    .line 34
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v5, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v0, v4, v5}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世兰哲()Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v5, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 79
    .line 80
    check-cast v5, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v2, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 86
    .line 87
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;)Lcom/google/protobuf/Value;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, v4, v2}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const/4 p0, 0x0

    .line 96
    iput-boolean p0, v3, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 97
    .line 98
    invoke-static {p1, v3}, Lcom/google/protobuf/Struct;->access$302(Lcom/google/protobuf/Struct;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5b50\u696a\u5170\u54f2;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fields_:Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 6
    .line 7
    sget-object v0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;-><init>(Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-object p0
.end method

.method private internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5b50\u696a\u5170\u54f2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fields_:Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 6
    .line 7
    sget-object v1, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;-><init>(Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fields_:Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 15
    .line 16
    or-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fields_:Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/Struct;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->newUninitializedMessageException(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/Struct;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/Struct;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/Struct;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onBuilt()V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 27
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 23
    .line 24
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 25
    .line 26
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearFields()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 23
    .line 24
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 25
    .line 26
    return-object p0
.end method

.method public containsFields(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "map key"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Struct;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFields()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->getFieldsMap()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getFieldsCount()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getFieldsMap()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 6
    .line 7
    sget-object v1, Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪苏世兰哲()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;-><init>(Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getFieldsOrDefault(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p2, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 18
    .line 19
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;)Lcom/google/protobuf/Value;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    return-object p2

    .line 36
    :cond_1
    const-string p0, "map key"

    .line 37
    .line 38
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public getFieldsOrThrow(Ljava/lang/String;)Lcom/google/protobuf/Value;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->fieldsConverter:Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 19
    .line 20
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;)Lcom/google/protobuf/Value;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    const-string p0, "map key"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public getMutableFields()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪苏世兰哲()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Struct;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public internalGetMapFieldReflection(I)Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "Invalid map field number: "

    .line 10
    .line 11
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public internalGetMutableMapFieldReflection(I)Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "Invalid map field number: "

    .line 10
    .line 11
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 92
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 93
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    move-result-object v0

    .line 94
    invoke-static {p1}, Lcom/google/protobuf/Struct;->access$400(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    move-result-object v1

    .line 95
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    move-result-object v0

    .line 96
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lcom/google/protobuf/MapFieldLite;->copy(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 97
    iget v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 98
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 99
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 89
    instance-of v0, p1, Lcom/google/protobuf/Struct;

    if-eqz v0, :cond_0

    .line 90
    check-cast p1, Lcom/google/protobuf/Struct;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 91
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v1, v3, :cond_2

    .line 17
    .line 18
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    :cond_1
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :catch_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    sget-object v1, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 61
    .line 62
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget v1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 66
    .line 67
    or-int/2addr v1, v2

    .line 68
    iput v1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 81
    .line 82
    .line 83
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 88
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 87
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 86
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 85
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 84
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 100
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public putAllFields(Ljava/util/Map;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;)",
            "Lcom/google/protobuf/Struct$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    throw p0

    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 48
    .line 49
    or-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    iput p1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 52
    .line 53
    return-object p0
.end method

.method public putFields(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    iput p1, p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string p0, "map value"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const-string p0, "map key"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public putFieldsBuilderIfAbsent(Ljava/lang/String;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/google/protobuf/Value;->newBuilder()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    instance-of v1, v0, Lcom/google/protobuf/Value;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast v0, Lcom/google/protobuf/Value;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/protobuf/Value;->toBuilder()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    check-cast v0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    return-object v0
.end method

.method public removeFields(Ljava/lang/String;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->internalGetMutableFields()Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "map key"

    .line 16
    .line 17
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method
