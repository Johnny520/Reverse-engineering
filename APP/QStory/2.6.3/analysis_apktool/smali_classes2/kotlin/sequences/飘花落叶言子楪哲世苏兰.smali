.class public abstract Lkotlin/sequences/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子哲楪世兰苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object v0

    .line 27
    :cond_1
    const-string p0, "Sequence is empty."

    .line 28
    .line 29
    invoke-static {p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static 飘花落叶言子哲楪世苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/io/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    new-instance v1, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static 飘花落叶言子哲楪兰世苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪世兰哲(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v1
.end method

.method public static 飘花落叶言子哲楪苏世兰(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪哲世兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static 飘花落叶言子哲楪苏兰世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪世兰哲苏;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    const/4 p1, 0x6

    .line 9
    invoke-direct {p0, p1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p1, v0, v1, p0}, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public static 飘花落叶言子苏兰世哲楪(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    sget-object v1, Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$1;->INSTANCE:Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$1;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static 飘花落叶言子苏兰世楪哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    sget-object v1, Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$2;->INSTANCE:Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$2;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static 飘花落叶言子苏兰哲世楪(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lkotlin/sequences/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lkotlin/io/飘花落叶言子楪苏哲世兰;

    .line 10
    .line 11
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 12
    .line 13
    const/16 v2, 0x16

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final 飘花落叶言子苏兰哲楪世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    instance-of v1, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    new-instance v1, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    iget-object v2, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 16
    .line 17
    iget-object p0, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    invoke-direct {v1, v2, p0, v0}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    new-instance v1, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    new-instance v2, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-direct {v2, v3}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0, v2, v0}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public static 飘花落叶言子苏兰楪哲世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Lkotlin/sequences/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Lkotlin/sequences/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/sequences/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_2
    const-string p0, "Requested element count "

    .line 24
    .line 25
    const-string v0, " is less than zero."

    .line 26
    .line 27
    invoke-static {p1, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method
