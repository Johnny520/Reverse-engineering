.class public final Lcom/google/protobuf/飘花落叶言苏子兰世楪哲;
.super Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->newBuilder()Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0

    .line 28
    :catch_1
    move-exception p1

    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
.end method
