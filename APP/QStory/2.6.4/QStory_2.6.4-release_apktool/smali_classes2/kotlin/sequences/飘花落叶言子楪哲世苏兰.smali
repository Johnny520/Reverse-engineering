.class public abstract Lkotlin/sequences/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子世兰楪哲苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪哲世兰苏;
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
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static 飘花落叶言子世兰楪苏哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/lang/Object;
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
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static 飘花落叶言子世兰苏哲楪(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;
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
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Ljava/util/List;

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

.method public static 飘花落叶言子世兰苏楪哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪世兰哲苏;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    const/16 p1, 0x9

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p1, v0, v1, p0}, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public static 飘花落叶言子世哲兰楪苏(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
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
    invoke-direct {v1, v2, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;-><init>(IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

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

.method public static 飘花落叶言子世哲兰苏楪(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x1

    .line 30
    add-int/2addr v2, v4

    .line 31
    if-le v2, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v4, 0x0

    .line 37
    invoke-static {v0, v3, v4}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Appendable;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static 飘花落叶言子世哲楪兰苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    sget-object v1, Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$1;->INSTANCE:Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$1;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static 飘花落叶言子世哲楪苏兰(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    sget-object v1, Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$2;->INSTANCE:Lkotlin/sequences/SequencesKt___SequencesKt$flatMap$2;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static 飘花落叶言子世哲苏兰楪(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
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
    const/16 v2, 0x1a

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final 飘花落叶言子世哲苏楪兰(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    instance-of v1, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 13
    .line 14
    new-instance v1, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    iget-object v2, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 17
    .line 18
    iget-object p0, p0, Lkotlin/sequences/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    invoke-direct {v1, v2, p0, v0}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    new-instance v1, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 25
    .line 26
    new-instance v2, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    invoke-direct {v2, v3}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏世兰;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0, v2, v0}, Lkotlin/sequences/飘花落叶言子楪苏世哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public static 飘花落叶言子世苏兰哲楪(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
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
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method
