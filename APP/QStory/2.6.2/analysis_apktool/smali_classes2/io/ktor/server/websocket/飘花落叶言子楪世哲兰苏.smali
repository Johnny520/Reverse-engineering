.class public abstract Lio/ktor/server/websocket/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "Starting websocket session for "

    .line 2
    .line 3
    instance-of v1, p3, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p3

    .line 8
    check-cast v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->label:I

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
    iput v2, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;

    .line 23
    .line 24
    invoke-direct {v1, p3}, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v6, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/ktor/util/cio/ChannelIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v5

    .line 59
    :cond_2
    iget-object p0, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    move-object p1, p0

    .line 62
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    iget-object p0, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lio/ktor/websocket/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    :try_start_1
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lio/ktor/util/cio/ChannelIOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :try_start_2
    sget-object p3, Lio/ktor/server/websocket/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 76
    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {p3, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance p3, Lio/ktor/server/websocket/飘花落叶言子楪世苏兰哲;

    .line 104
    .line 105
    invoke-direct {p3, p1, p0}, Lio/ktor/server/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/websocket/飘花落叶言子楪世哲苏兰;)V

    .line 106
    .line 107
    .line 108
    iput-object p0, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object p1, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    iput v6, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->label:I

    .line 113
    .line 114
    invoke-interface {p2, p3, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-ne p2, v2, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    :goto_1
    iput-object p1, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v5, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput v4, v1, Lio/ktor/server/websocket/RoutingKt$handleServerSession$1;->label:I

    .line 126
    .line 127
    invoke-static {p0, v1}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lio/ktor/util/cio/ChannelIOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    if-ne p0, v2, :cond_5

    .line 132
    .line 133
    :goto_2
    return-object v2

    .line 134
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 135
    .line 136
    return-object p0

    .line 137
    :goto_4
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object p1, p1, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 145
    .line 146
    check-cast p1, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;

    .line 147
    .line 148
    iget-object p1, p1, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 149
    .line 150
    const-string p2, "Websocket handler failed"

    .line 151
    .line 152
    invoke-interface {p1, p2, p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :catch_0
    move-exception p0

    .line 157
    throw p0

    .line 158
    :catch_1
    move-exception p0

    .line 159
    throw p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    iget-object p0, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lio/ktor/websocket/飘花落叶言子楪世哲苏兰;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p0}, Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    sget-object v2, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lio/ktor/server/websocket/飘花落叶言子楪苏世哲兰;

    .line 75
    .line 76
    invoke-static {p2}, Lio/ktor/server/application/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    check-cast p2, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    iget-wide v7, p2, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:J

    .line 83
    .line 84
    sget-object p2, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 85
    .line 86
    instance-of p2, p0, Lio/ktor/websocket/飘花落叶言子楪世哲苏兰;

    .line 87
    .line 88
    if-nez p2, :cond_7

    .line 89
    .line 90
    new-instance p2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;

    .line 91
    .line 92
    invoke-direct {p2, p0, v7, v8}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;-><init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;J)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->getAttributes()Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v7, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 104
    .line 105
    invoke-virtual {v2, v7}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/util/List;

    .line 110
    .line 111
    invoke-virtual {p2, v2}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0}, Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iput-object p2, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput v6, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->label:I

    .line 121
    .line 122
    invoke-static {p2, p0, p1, v0}, Lio/ktor/server/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v1, :cond_4

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move-object p0, p2

    .line 130
    :goto_1
    iput-object v3, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput v5, v0, Lio/ktor/server/websocket/RoutingKt$proceedWebSocket$1;->label:I

    .line 133
    .line 134
    invoke-interface {p0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏兰楪()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 139
    .line 140
    invoke-interface {p0, p1}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 148
    .line 149
    invoke-interface {p0, v0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v1, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move-object p0, v4

    .line 157
    :goto_2
    if-ne p0, v1, :cond_6

    .line 158
    .line 159
    :goto_3
    return-object v1

    .line 160
    :cond_6
    return-object v4

    .line 161
    :cond_7
    const-string p0, "Cannot wrap other DefaultWebSocketSession"

    .line 162
    .line 163
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v3
.end method
