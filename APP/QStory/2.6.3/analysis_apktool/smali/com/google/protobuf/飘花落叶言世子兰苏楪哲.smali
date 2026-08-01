.class public final Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 13
    .line 14
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/ByteString;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/ByteString;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const-string p0, "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"

    .line 26
    .line 27
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
