.class public abstract Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    :cond_1
    sget-object p4, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 13
    .line 14
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->DEFAULT:Lkotlinx/coroutines/CoroutineStart;

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-static {p2, v1, p4}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p0, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲兰苏(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;

    .line 26
    .line 27
    const/4 p4, 0x1

    .line 28
    invoke-direct {p1, p0, p2, p4, p4}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;ZZ)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p3, p1, p1}, Lkotlinx/coroutines/CoroutineStart;->invoke(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "Channel was consumed, consumer had failed"

    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {p0, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    move-object p1, p0

    .line 40
    check-cast p1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    iget-object p0, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 66
    .line 67
    invoke-interface {p2, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, p0, :cond_4

    .line 72
    .line 73
    :try_start_1
    iput-object p0, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p1, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    iput p2, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->I$0:I

    .line 79
    .line 80
    iput v4, v0, Lkotlinx/coroutines/channels/ProduceKt$awaitClose$1;->label:I

    .line 81
    .line 82
    new-instance p2, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 83
    .line 84
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p2, v4, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲()V

    .line 92
    .line 93
    .line 94
    new-instance v0, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;

    .line 95
    .line 96
    const/16 v2, 0x13

    .line 97
    .line 98
    invoke-direct {v0, p2, v2}, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    if-ne p0, v1, :cond_3

    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_3
    :goto_1
    invoke-interface {p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 117
    .line 118
    return-object p0

    .line 119
    :goto_2
    invoke-interface {p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :cond_4
    const-string p0, "awaitClose() can only be invoked from the producer context"

    .line 124
    .line 125
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v3
.end method

.method public static final 飘花落叶言子楪世哲苏兰(JJLkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 23

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;

    .line 11
    .line 12
    iget v4, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    const/4 v7, 0x3

    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v5, :cond_5

    .line 40
    .line 41
    if-eq v5, v9, :cond_4

    .line 42
    .line 43
    if-eq v5, v8, :cond_3

    .line 44
    .line 45
    if-eq v5, v7, :cond_2

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    iget-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 50
    .line 51
    iget-wide v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 52
    .line 53
    iget-wide v11, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 54
    .line 55
    iget-wide v13, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 56
    .line 57
    iget-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 60
    .line 61
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-wide/from16 v21, v13

    .line 65
    .line 66
    move-wide v13, v0

    .line 67
    move-wide v0, v11

    .line 68
    move-wide/from16 v11, v21

    .line 69
    .line 70
    move v2, v6

    .line 71
    goto/16 :goto_9

    .line 72
    .line 73
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    return-object v0

    .line 80
    :cond_2
    iget-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 81
    .line 82
    iget-wide v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 83
    .line 84
    iget-wide v11, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 85
    .line 86
    iget-wide v13, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 87
    .line 88
    iget-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-wide/from16 v21, v13

    .line 96
    .line 97
    move v14, v7

    .line 98
    move-wide v6, v0

    .line 99
    move-wide v0, v11

    .line 100
    move-wide/from16 v11, v21

    .line 101
    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_3
    iget-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 105
    .line 106
    iget-wide v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 107
    .line 108
    iget-wide v11, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 109
    .line 110
    iget-wide v13, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 111
    .line 112
    iget-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :goto_1
    move-wide/from16 p0, v9

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    iget-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 123
    .line 124
    iget-wide v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 125
    .line 126
    iget-wide v11, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 127
    .line 128
    iget-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 131
    .line 132
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-wide/from16 v21, v9

    .line 136
    .line 137
    move-wide v9, v0

    .line 138
    move-wide/from16 v0, v21

    .line 139
    .line 140
    move-object v2, v5

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 146
    .line 147
    .line 148
    move-result-wide v10

    .line 149
    invoke-static {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世兰苏(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v12

    .line 153
    add-long/2addr v10, v12

    .line 154
    move-object/from16 v2, p4

    .line 155
    .line 156
    iput-object v2, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 157
    .line 158
    move-wide/from16 v12, p0

    .line 159
    .line 160
    iput-wide v12, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 161
    .line 162
    iput-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 163
    .line 164
    iput-wide v10, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 165
    .line 166
    iput v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 167
    .line 168
    invoke-static {v0, v1, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    if-ne v5, v4, :cond_6

    .line 173
    .line 174
    goto/16 :goto_8

    .line 175
    .line 176
    :cond_6
    move-wide v9, v10

    .line 177
    move-wide v11, v12

    .line 178
    :goto_2
    invoke-static {v11, v12}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世兰苏(J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v13

    .line 182
    :goto_3
    add-long/2addr v9, v13

    .line 183
    iput-object v2, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-wide v11, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 186
    .line 187
    iput-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 188
    .line 189
    iput-wide v9, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 190
    .line 191
    iput-wide v13, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 192
    .line 193
    iput v8, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 194
    .line 195
    sget-object v5, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 196
    .line 197
    invoke-interface {v2, v5, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    if-ne v5, v4, :cond_7

    .line 202
    .line 203
    goto/16 :goto_8

    .line 204
    .line 205
    :cond_7
    move-wide/from16 p0, v11

    .line 206
    .line 207
    move-wide v11, v0

    .line 208
    move-wide v0, v13

    .line 209
    move-wide/from16 v13, p0

    .line 210
    .line 211
    move-object v5, v2

    .line 212
    goto :goto_1

    .line 213
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 214
    .line 215
    .line 216
    move-result-wide v8

    .line 217
    sub-long v15, p0, v8

    .line 218
    .line 219
    const-wide/16 v17, 0x0

    .line 220
    .line 221
    cmp-long v2, v15, v17

    .line 222
    .line 223
    if-gez v2, :cond_8

    .line 224
    .line 225
    move-wide/from16 v6, v17

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    move-wide v6, v15

    .line 229
    :goto_5
    cmp-long v15, v6, v17

    .line 230
    .line 231
    const-wide/32 v19, 0xf4240

    .line 232
    .line 233
    .line 234
    if-nez v15, :cond_a

    .line 235
    .line 236
    cmp-long v15, v0, v17

    .line 237
    .line 238
    if-eqz v15, :cond_a

    .line 239
    .line 240
    sub-long v15, v8, p0

    .line 241
    .line 242
    rem-long/2addr v15, v0

    .line 243
    move-wide/from16 v17, v11

    .line 244
    .line 245
    sub-long v10, v0, v15

    .line 246
    .line 247
    move-wide/from16 p0, v10

    .line 248
    .line 249
    add-long v10, v8, p0

    .line 250
    .line 251
    move-wide/from16 p3, v6

    .line 252
    .line 253
    div-long v6, p0, v19

    .line 254
    .line 255
    iput-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 256
    .line 257
    iput-wide v13, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 258
    .line 259
    move-wide v15, v13

    .line 260
    move-wide/from16 v12, v17

    .line 261
    .line 262
    iput-wide v12, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 263
    .line 264
    iput-wide v10, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 265
    .line 266
    iput-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 267
    .line 268
    iput-wide v8, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$4:J

    .line 269
    .line 270
    move-wide/from16 v8, p3

    .line 271
    .line 272
    iput-wide v8, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$5:J

    .line 273
    .line 274
    move-wide/from16 v8, p0

    .line 275
    .line 276
    iput-wide v8, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$6:J

    .line 277
    .line 278
    const/4 v14, 0x3

    .line 279
    iput v14, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 280
    .line 281
    invoke-static {v6, v7, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    if-ne v6, v4, :cond_9

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_9
    move-wide v6, v0

    .line 289
    move-wide v9, v10

    .line 290
    move-wide v0, v12

    .line 291
    move-wide v11, v15

    .line 292
    :goto_6
    move-wide/from16 v21, v6

    .line 293
    .line 294
    move v7, v14

    .line 295
    move-wide/from16 v13, v21

    .line 296
    .line 297
    move-object v2, v5

    .line 298
    const/4 v6, 0x4

    .line 299
    :goto_7
    const/4 v8, 0x2

    .line 300
    goto :goto_3

    .line 301
    :cond_a
    move-wide v15, v13

    .line 302
    const/4 v14, 0x3

    .line 303
    move-wide v12, v11

    .line 304
    div-long v10, v6, v19

    .line 305
    .line 306
    iput-object v5, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->L$0:Ljava/lang/Object;

    .line 307
    .line 308
    move-wide v14, v15

    .line 309
    iput-wide v14, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$0:J

    .line 310
    .line 311
    iput-wide v12, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$1:J

    .line 312
    .line 313
    move-wide/from16 v17, v12

    .line 314
    .line 315
    move-wide/from16 v12, p0

    .line 316
    .line 317
    iput-wide v12, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$2:J

    .line 318
    .line 319
    iput-wide v0, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$3:J

    .line 320
    .line 321
    iput-wide v8, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$4:J

    .line 322
    .line 323
    iput-wide v6, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->J$5:J

    .line 324
    .line 325
    const/4 v2, 0x4

    .line 326
    iput v2, v3, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedPeriodTicker$1;->label:I

    .line 327
    .line 328
    invoke-static {v10, v11, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    if-ne v6, v4, :cond_b

    .line 333
    .line 334
    :goto_8
    return-object v4

    .line 335
    :cond_b
    move-wide v9, v12

    .line 336
    move-wide v11, v14

    .line 337
    move-wide v13, v0

    .line 338
    move-wide/from16 v0, v17

    .line 339
    .line 340
    :goto_9
    move v6, v2

    .line 341
    move-object v2, v5

    .line 342
    const/4 v7, 0x3

    .line 343
    goto :goto_7
.end method

.method public static final 飘花落叶言子楪世苏兰哲(JJLkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 8

    .line 1
    instance-of v0, p5, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;

    .line 21
    .line 22
    invoke-direct {v0, p5}, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_5

    .line 35
    .line 36
    if-eq v2, v5, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    iget-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 43
    .line 44
    iget-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 45
    .line 46
    iget-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p4, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 49
    .line 50
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    move-wide v6, p2

    .line 54
    move-wide p2, p0

    .line 55
    move-wide p0, v6

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_3
    iget-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 65
    .line 66
    iget-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 67
    .line 68
    iget-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p4, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 71
    .line 72
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    iget-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 77
    .line 78
    iget-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 79
    .line 80
    iget-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p4, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 83
    .line 84
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iput-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 94
    .line 95
    iput-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 96
    .line 97
    iput v5, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

    .line 98
    .line 99
    invoke-static {p2, p3, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    if-ne p5, v1, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    :goto_1
    iput-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    iput-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 109
    .line 110
    iput-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 111
    .line 112
    iput v4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

    .line 113
    .line 114
    sget-object p5, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 115
    .line 116
    invoke-interface {p4, p5, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p5

    .line 120
    if-ne p5, v1, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    move-wide v6, p2

    .line 124
    move-wide p2, p0

    .line 125
    move-wide p0, v6

    .line 126
    :goto_2
    iput-object p4, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    iput-wide p2, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$0:J

    .line 129
    .line 130
    iput-wide p0, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->J$1:J

    .line 131
    .line 132
    iput v3, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$fixedDelayTicker$1;->label:I

    .line 133
    .line 134
    invoke-static {p2, p3, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p5

    .line 138
    if-ne p5, v1, :cond_1

    .line 139
    .line 140
    :goto_3
    return-object v1
.end method

.method public static 飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget-object p2, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 12
    .line 13
    :cond_1
    const/4 p1, -0x2

    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, p1, :cond_8

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    if-eq p0, p1, :cond_6

    .line 19
    .line 20
    if-eqz p0, :cond_4

    .line 21
    .line 22
    const p1, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-eq p0, p1, :cond_3

    .line 26
    .line 27
    sget-object p1, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 28
    .line 29
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    new-instance p1, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_2
    new-instance p1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;

    .line 38
    .line 39
    invoke-direct {p1, p0, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;-><init>(ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_3
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_4
    sget-object p0, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 50
    .line 51
    if-ne p2, p0, :cond_5

    .line 52
    .line 53
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;

    .line 60
    .line 61
    invoke-direct {p0, v0, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;-><init>(ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_6
    sget-object p0, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 66
    .line 67
    if-ne p2, p0, :cond_7

    .line 68
    .line 69
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;

    .line 70
    .line 71
    sget-object p1, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 72
    .line 73
    invoke-direct {p0, v0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;-><init>(ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_7
    const-string p0, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 78
    .line 79
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return-object p0

    .line 84
    :cond_8
    sget-object p0, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 85
    .line 86
    if-ne p2, p0, :cond_9

    .line 87
    .line 88
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 89
    .line 90
    sget-object p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世哲兰;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sget p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 96
    .line 97
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_9
    new-instance p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;

    .line 102
    .line 103
    invoke-direct {p0, v0, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;-><init>(ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 104
    .line 105
    .line 106
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget p0, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$2:I

    .line 42
    .line 43
    iget p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$1:I

    .line 44
    .line 45
    iget v2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$0:I

    .line 46
    .line 47
    iget-object v7, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$5:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 50
    .line 51
    iget-object v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$4:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 54
    .line 55
    iget-object v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$3:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 58
    .line 59
    iget-object v9, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 62
    .line 63
    iget-object v9, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 66
    .line 67
    iget-object v10, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v10, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 70
    .line 71
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    move-object p2, v8

    .line 75
    move v8, p0

    .line 76
    move-object p0, p2

    .line 77
    :cond_1
    move-object p2, v7

    .line 78
    move v7, p1

    .line 79
    move-object p1, v9

    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 85
    .line 86
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v6

    .line 90
    :cond_3
    iget p0, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$2:I

    .line 91
    .line 92
    iget p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$1:I

    .line 93
    .line 94
    iget v2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$0:I

    .line 95
    .line 96
    iget-object v7, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$5:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 99
    .line 100
    iget-object v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$4:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 103
    .line 104
    iget-object v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$3:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 107
    .line 108
    iget-object v9, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$2:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 111
    .line 112
    iget-object v9, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$1:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 115
    .line 116
    iget-object v10, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 119
    .line 120
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    move-object v11, v8

    .line 124
    move v8, p0

    .line 125
    move-object p0, v11

    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :try_start_2
    invoke-interface {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->iterator()Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    move v2, v5

    .line 135
    move v7, v2

    .line 136
    move v8, v7

    .line 137
    :goto_1
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p0, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$3:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$4:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object p2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$5:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$6:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$7:Ljava/lang/Object;

    .line 152
    .line 153
    iput v2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$0:I

    .line 154
    .line 155
    iput v7, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$1:I

    .line 156
    .line 157
    iput v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$2:I

    .line 158
    .line 159
    iput v4, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->label:I

    .line 160
    .line 161
    check-cast p2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 162
    .line 163
    invoke-virtual {p2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    if-ne v9, v1, :cond_5

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    move-object v11, v9

    .line 171
    move-object v9, p1

    .line 172
    move p1, v7

    .line 173
    move-object v7, p2

    .line 174
    move-object p2, v11

    .line 175
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_6

    .line 182
    .line 183
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 184
    .line 185
    invoke-virtual {v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$0:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v9, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$1:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$2:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object p0, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$3:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$4:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v7, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$5:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$6:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v6, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->L$7:Ljava/lang/Object;

    .line 204
    .line 205
    iput v2, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$0:I

    .line 206
    .line 207
    iput p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$1:I

    .line 208
    .line 209
    iput v8, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$2:I

    .line 210
    .line 211
    iput v5, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->I$3:I

    .line 212
    .line 213
    iput v3, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$toChannel$1;->label:I

    .line 214
    .line 215
    invoke-interface {v9, p2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 219
    if-ne p2, v1, :cond_1

    .line 220
    .line 221
    :goto_3
    return-object v1

    .line 222
    :catchall_1
    move-exception p1

    .line 223
    move-object v8, p0

    .line 224
    move-object p0, p1

    .line 225
    goto :goto_4

    .line 226
    :cond_6
    invoke-interface {p0, v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 227
    .line 228
    .line 229
    return-object v9

    .line 230
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 231
    :catchall_2
    move-exception p1

    .line 232
    invoke-static {v8, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    throw p1
.end method
