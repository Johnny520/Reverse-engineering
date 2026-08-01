.class public final Lcom/google/protobuf/飘花落叶言世苏子兰哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/MapFieldLite;->emptyMapField()Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/MapFieldLite;->mutableCopy()Lcom/google/protobuf/MapFieldLite;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;ILjava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    if-nez p3, :cond_2

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    :goto_0
    return p0

    .line 28
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 43
    .line 44
    .line 45
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    return-object p1
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    move-object p0, p1

    .line 2
    check-cast p0, Lcom/google/protobuf/MapFieldLite;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/MapFieldLite;->makeImmutable()V

    .line 5
    .line 6
    .line 7
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    check-cast p2, Lcom/google/protobuf/MapFieldLite;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->isMutable()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->mutableCopy()Lcom/google/protobuf/MapFieldLite;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/protobuf/MapFieldLite;->mergeFrom(Lcom/google/protobuf/MapFieldLite;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-object p1
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    return-object p1
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/MapFieldLite;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->isMutable()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method
