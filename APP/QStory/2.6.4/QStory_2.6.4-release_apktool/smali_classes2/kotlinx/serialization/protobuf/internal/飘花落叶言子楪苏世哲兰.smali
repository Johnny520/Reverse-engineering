.class public final Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世哲兰;
.super Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子世楪苏兰哲:Z


# virtual methods
.method public final 飘花落叶言子世楪苏哲兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Z

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->getKind()Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object v1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    instance-of v0, v0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 30
    .line 31
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->getKind()Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "Type "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " cannot be directly child of oneof element"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏世兰哲楪()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    const-wide/16 v2, 0x4c2c

    .line 63
    .line 64
    cmp-long v2, v0, v2

    .line 65
    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    iget-object v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 69
    .line 70
    invoke-static {v2, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    invoke-static {v0, v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏(J)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    new-instance v2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;

    .line 84
    .line 85
    iget-object v3, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;

    .line 86
    .line 87
    invoke-static {v3, v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;J)Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 92
    .line 93
    invoke-direct {v2, p0, v0, p1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :cond_3
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 98
    .line 99
    const-string p1, "An oneof element cannot be directly child of another oneof element"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0
.end method
