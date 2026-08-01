.class public final Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;


# virtual methods
.method public final build()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->isInitialized()Z

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
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;->INV:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 9
    .line 10
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)V
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->hasProjection()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->getProjection()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    or-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->hasType()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->getType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    and-int/2addr v1, v2

    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 46
    .line 47
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eq v1, v3, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 70
    .line 71
    :goto_0
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 72
    .line 73
    or-int/2addr v0, v2

    .line 74
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->hasTypeId()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->getTypeId()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 87
    .line 88
    or-int/lit8 v1, v1, 0x4

    .line 89
    .line 90
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 91
    .line 92
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 95
    .line 96
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->access$5600(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 105
    .line 106
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;
    .locals 5

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏哲兰;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->access$5202(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument$Projection;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 29
    .line 30
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->access$5302(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    or-int/lit8 v3, v3, 0x4

    .line 38
    .line 39
    :cond_2
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 40
    .line 41
    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->access$5402(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;I)I

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->access$5502(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;I)I

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    :try_start_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method
