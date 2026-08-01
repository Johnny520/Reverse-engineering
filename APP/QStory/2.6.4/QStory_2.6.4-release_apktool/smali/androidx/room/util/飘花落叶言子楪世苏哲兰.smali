.class public abstract Landroidx/room/util/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;


# direct methods
.method public static final 飘花落叶言子楪世兰哲苏(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SELECT changes()"

    .line 5
    .line 6
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-interface {v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲苏楪世兰()Z

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 18
    long-to-int v2, v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v0, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_0
    const-string v0, "SELECT last_insert_rowid()"

    .line 29
    .line 30
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :try_start_1
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲苏楪世兰()Z

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    invoke-static {p0, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-wide v0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    :catchall_1
    move-exception v1

    .line 48
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :catchall_2
    move-exception p0

    .line 53
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 54
    :catchall_3
    move-exception v1

    .line 55
    invoke-static {v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v1
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/room/飘花落叶言子楪兰哲苏世;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 3

    .line 1
    invoke-interface {p2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Landroidx/room/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Landroidx/room/飘花落叶言子世楪兰苏哲;

    .line 6
    .line 7
    invoke-interface {p2, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/room/飘花落叶言子世楪兰哲苏;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p2, Landroidx/room/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p2, v0

    .line 20
    :goto_0
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const-string v2, "coroutineScope"

    .line 25
    .line 26
    if-eqz v1, :cond_6

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 35
    .line 36
    invoke-interface {p0, p2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_2
    if-eqz p1, :cond_4

    .line 46
    .line 47
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    const-string p0, "transactionContext"

    .line 53
    .line 54
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_4
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    if-eqz p0, :cond_5

    .line 61
    .line 62
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_6
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 70
    .line 71
    if-eqz p0, :cond_8

    .line 72
    .line 73
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 74
    .line 75
    if-eqz p2, :cond_7

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_7
    sget-object p2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 79
    .line 80
    :goto_1
    invoke-interface {p0, p2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, v2}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnName(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v5, 0x0

    .line 34
    const/16 v6, 0x3f

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v1 .. v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "Column \'"

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, "\' does not exist. Available columns: ["

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 p0, 0x5d

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Ljava/lang/Iterable;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/16 v6, 0x38

    .line 15
    .line 16
    const-string v2, ",\n"

    .line 17
    .line 18
    const-string v3, "\n"

    .line 19
    .line 20
    const-string v4, "\n"

    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世兰楪(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "},"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, " }"

    .line 38
    .line 39
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    move v0, v2

    .line 21
    move v3, v0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ge v0, v5, :cond_6

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    add-int/lit8 v6, v4, 0x1

    .line 34
    .line 35
    const/16 v7, 0x28

    .line 36
    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    if-eq v5, v7, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    if-eq v5, v7, :cond_4

    .line 43
    .line 44
    const/16 v7, 0x29

    .line 45
    .line 46
    if-eq v5, v7, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    add-int/lit8 v3, v3, -0x1

    .line 50
    .line 51
    if-nez v3, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    sub-int/2addr v5, v1

    .line 58
    if-eq v4, v5, :cond_5

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    :cond_5
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    move v4, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_6
    if-nez v3, :cond_7

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sub-int/2addr v0, v1

    .line 74
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰哲世楪苏(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    :cond_7
    :goto_2
    return v2
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const/4 v3, -0x1

    .line 14
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnName(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v3

    .line 31
    :goto_1
    if-ltz v2, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    const-string v0, "`"

    .line 35
    .line 36
    const/16 v2, 0x60

    .line 37
    .line 38
    invoke-static {v2, v0, p1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnCount()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :goto_2
    if-ge v1, v0, :cond_4

    .line 47
    .line 48
    invoke-interface {p0, v1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getColumnName(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move v1, v3

    .line 63
    :goto_3
    if-ltz v1, :cond_5

    .line 64
    .line 65
    return v1

    .line 66
    :cond_5
    return v3
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Ljava/util/Collection;)Ljava/lang/String;
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const/16 v5, 0x3e

    .line 6
    .line 7
    const-string v1, ","

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世兰楪(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "},"

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世兰楪(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Ljava/util/Collection;)Ljava/lang/String;
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const/16 v5, 0x3e

    .line 6
    .line 7
    const-string v1, ","

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世兰楪(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, " }"

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世兰楪(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Z)Landroidx/room/util/飘花落叶言子楪世兰苏哲;
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PRAGMA index_xinfo(`"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "`)"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :try_start_0
    const-string v0, "seqno"

    .line 25
    .line 26
    invoke-static {p0, v0}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v1, "cid"

    .line 31
    .line 32
    invoke-static {p0, v1}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v2, "name"

    .line 37
    .line 38
    invoke-static {p0, v2}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "desc"

    .line 43
    .line 44
    invoke-static {p0, v3}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, -0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-eq v0, v4, :cond_6

    .line 51
    .line 52
    if-eq v1, v4, :cond_6

    .line 53
    .line 54
    if-eq v2, v4, :cond_6

    .line 55
    .line 56
    if-ne v3, v4, :cond_0

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲苏楪世兰()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-interface {p0, v1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    long-to-int v7, v7

    .line 81
    if-gez v7, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    long-to-int v7, v7

    .line 89
    invoke-interface {p0, v2}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲世兰楪(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {p0, v3}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    cmp-long v9, v9, v11

    .line 100
    .line 101
    if-lez v9, :cond_2

    .line 102
    .line 103
    const-string v9, "DESC"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_2
    const-string v9, "ASC"

    .line 110
    .line 111
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/Iterable;

    .line 131
    .line 132
    new-instance v1, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    invoke-direct {v1, v2}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰世楪苏(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    .line 143
    .line 144
    const/16 v2, 0xa

    .line 145
    .line 146
    invoke-static {v0, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_4

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Ljava/util/Map$Entry;

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/lang/Iterable;

    .line 188
    .line 189
    new-instance v3, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 190
    .line 191
    const/4 v4, 0x2

    .line 192
    invoke-direct {v3, v4}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰世楪苏(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v3, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-static {v1, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Ljava/util/Map$Entry;

    .line 223
    .line 224
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_5
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Landroidx/room/util/飘花落叶言子楪世兰苏哲;

    .line 239
    .line 240
    invoke-direct {v2, p1, p2, v0, v1}, Landroidx/room/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    .line 243
    invoke-static {p0, v5}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    return-object v2

    .line 247
    :cond_6
    :goto_4
    invoke-static {p0, v5}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    return-object v5

    .line 251
    :goto_5
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 252
    :catchall_1
    move-exception p2

    .line 253
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    throw p2
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Landroidx/room/飘花落叶言子楪兰哲苏世;ZZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 20
    .line 21
    :goto_0
    move-object v6, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v7, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v1, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x3

    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eq v1, v8, :cond_3

    .line 42
    .line 43
    if-eq v1, v4, :cond_2

    .line 44
    .line 45
    if-ne v1, v3, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_2
    iget-boolean p0, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->Z$1:Z

    .line 58
    .line 59
    iget-boolean p1, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->Z$0:Z

    .line 60
    .line 61
    iget-object v1, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 64
    .line 65
    iget-object v4, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move v12, p0

    .line 73
    move-object v13, v1

    .line 74
    move-object v10, v4

    .line 75
    :goto_2
    move v11, p1

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰世哲()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲兰世()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    new-instance v0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    move-object v3, p0

    .line 106
    move v2, p1

    .line 107
    move/from16 v1, p2

    .line 108
    .line 109
    move-object/from16 v5, p3

    .line 110
    .line 111
    invoke-direct/range {v0 .. v5}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;-><init>(ZZLandroidx/room/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v0

    .line 115
    iput v8, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 116
    .line 117
    invoke-virtual {p0, p1, v2, v6}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰哲世(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v7, :cond_5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    return-object p0

    .line 125
    :cond_6
    move/from16 v5, p2

    .line 126
    .line 127
    iput-object p0, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    move-object/from16 v8, p3

    .line 130
    .line 131
    iput-object v8, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput-boolean p1, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->Z$0:Z

    .line 134
    .line 135
    iput-boolean v5, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->Z$1:Z

    .line 136
    .line 137
    iput v4, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 138
    .line 139
    invoke-static {p0, v5, v6}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Landroidx/room/飘花落叶言子楪兰哲苏世;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-ne v4, v7, :cond_7

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_7
    move-object v10, p0

    .line 147
    move-object v0, v4

    .line 148
    move v12, v5

    .line 149
    move-object v13, v8

    .line 150
    goto :goto_2

    .line 151
    :goto_3
    check-cast v0, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 152
    .line 153
    new-instance v8, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1;

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    invoke-direct/range {v8 .. v13}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Landroidx/room/飘花落叶言子楪兰哲苏世;ZZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 157
    .line 158
    .line 159
    iput-object v2, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v2, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->L$1:Ljava/lang/Object;

    .line 162
    .line 163
    iput v3, v6, Landroidx/room/util/DBUtil__DBUtil_androidKt$performSuspending$1;->label:I

    .line 164
    .line 165
    invoke-static {v0, v8, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v7, :cond_8

    .line 170
    .line 171
    :goto_4
    return-object v7

    .line 172
    :cond_8
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "seq"

    .line 8
    .line 9
    invoke-static {p0, v1}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "from"

    .line 14
    .line 15
    invoke-static {p0, v2}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "to"

    .line 20
    .line 21
    invoke-static {p0, v3}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlin/collections/builders/ListBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :goto_0
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲苏楪世兰()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    new-instance v5, Landroidx/room/util/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    long-to-int v6, v6

    .line 42
    invoke-interface {p0, v1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    long-to-int v7, v7

    .line 47
    invoke-interface {p0, v2}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲世兰楪(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-interface {p0, v3}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲世兰楪(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-direct {v5, v6, v7, v8, v9}, Landroidx/room/util/飘花落叶言子楪世苏兰哲;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v4}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method
