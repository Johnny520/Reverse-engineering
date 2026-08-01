.class public final Lcom/google/protobuf/飘花落叶言世苏子兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 2
    .line 3
    new-instance p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 4
    .line 5
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, v0, v1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;ILjava/lang/Object;)I
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p3, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :goto_0
    return p0

    .line 20
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-static {p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getMetadata()Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v2, v3, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0, v0, v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲(IIII)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世兰哲()Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getMetadata()Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    move-object p0, p1

    .line 2
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 6
    .line 7
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    check-cast p2, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 4
    .line 5
    iget-boolean p0, p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

    .line 12
    .line 13
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lcom/google/protobuf/MapFieldLite;->copy(Ljava/util/Map;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {p0, v0, v1, v2}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世兰哲()Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2}, Lcom/google/protobuf/MapFieldLite;->copy(Ljava/util/Map;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;->putAll(Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    iget-boolean p0, p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 4
    .line 5
    xor-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    return p0
.end method
