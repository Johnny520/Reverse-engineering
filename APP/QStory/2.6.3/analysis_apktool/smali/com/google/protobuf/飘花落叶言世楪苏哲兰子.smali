.class public final Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;


# instance fields
.field public 飘花落叶言子楪世苏哲兰:[Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;


# virtual methods
.method public final isSupported(Ljava/lang/Class;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;->飘花落叶言子楪世苏哲兰:[Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    aget-object v3, p0, v2

    .line 9
    .line 10
    invoke-interface {v3, p1}, Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;->isSupported(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;->飘花落叶言子楪世苏哲兰:[Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    invoke-interface {v2, p1}, Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;->isSupported(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/google/protobuf/飘花落叶言世苏楪兰子哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "No factory is available for message type: "

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method
