.class public final L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I


# virtual methods
.method public final build()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p0}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->isInitialized()Z

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
    new-instance v0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 7
    .line 8
    iput-object v1, v0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-virtual {p0}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)V
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

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
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->hasPluginId()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->getPluginId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    or-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    iput v1, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 23
    .line 24
    iput v0, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->hasData()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->getData()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget v1, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 40
    .line 41
    or-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    iput v1, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 44
    .line 45
    iput-object v0, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->access$28800(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;
    .locals 4

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏哲兰;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

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
    iget v2, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->access$28502(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;I)I

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    or-int/lit8 v3, v3, 0x2

    .line 26
    .line 27
    :cond_1
    iget-object p0, p0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->access$28602(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->access$28702(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;I)I

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)V

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
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)V

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
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;
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
    invoke-virtual {p0, v0}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method
