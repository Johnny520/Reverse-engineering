.class public abstract Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static final 飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    rem-int v4, v2, v0

    .line 28
    .line 29
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    xor-int/2addr v3, v4

    .line 34
    int-to-byte v3, v3

    .line 35
    invoke-virtual {p0, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;)Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;
    .locals 4

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    new-instance v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    array-length v3, p0

    .line 16
    invoke-static {v0, p0, v1, v3}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(Lkotlinx/io/飘花落叶言子楪苏哲兰世;[BII)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-static {v0, v2, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;Ljava/nio/charset/Charset;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;S)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    sget-object v0, Lio/ktor/websocket/CloseReason$Codes;->NORMAL:Lio/ktor/websocket/CloseReason$Codes;

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-direct {p1, v0, v1}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    sget-object v1, Lio/ktor/websocket/CloseReason$Codes;->INTERNAL_ERROR:Lio/ktor/websocket/CloseReason$Codes;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, v1, p1}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v0

    .line 27
    :goto_0
    invoke-static {p0, p1, p2}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    if-ne p0, p1, :cond_1

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/websocket/CloseReason$Codes;->NORMAL:Lio/ktor/websocket/CloseReason$Codes;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0, p1}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lio/ktor/websocket/WebSocketSessionKt$close$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->label:I

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
    iput v1, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/websocket/WebSocketSessionKt$close$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p0, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 53
    .line 54
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_2
    new-instance p2, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;-><init>(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;)V

    .line 64
    .line 65
    .line 66
    iput-object p0, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v5, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->label:I

    .line 69
    .line 70
    invoke-interface {p0, p2, v0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰苏世哲(Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_1
    iput-object v3, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput v4, v0, Lio/ktor/websocket/WebSocketSessionKt$close$1;->label:I

    .line 80
    .line 81
    invoke-interface {p0, v0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰哲世(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    if-ne p0, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :catchall_0
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 89
    .line 90
    return-object p0
.end method
