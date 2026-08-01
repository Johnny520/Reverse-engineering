.class public abstract Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static final 飘花落叶言子世楪兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;Ljava/nio/ByteBuffer;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final 飘花落叶言子世楪兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$toByteArray$1;->label:I

    .line 51
    .line 52
    invoke-static {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏世兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v1, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    :goto_1
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 62
    .line 63
    long-to-int p0, v0

    .line 64
    invoke-static {p1, p0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static final 飘花落叶言子世楪哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->label:I

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
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

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
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    move-object p1, p0

    .line 53
    check-cast p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 54
    .line 55
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 67
    .line 68
    array-length p2, p2

    .line 69
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    iput v5, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->label:I

    .line 74
    .line 75
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Comparable;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    invoke-static {p2, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    iget-object p1, p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 89
    .line 90
    array-length p1, p1

    .line 91
    int-to-long p1, p1

    .line 92
    iput-object v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$skipIfFound$1;->label:I

    .line 97
    .line 98
    invoke-static {p0, p1, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, v1, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object v1

    .line 105
    :cond_5
    :goto_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    return-object p0
.end method

.method public static final 飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$reader$job$1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p3, p2, v1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$reader$job$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    invoke-static {p0, p1, v1, v0, p3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Lio/ktor/utils/io/飘花落叶言子楪苏哲世兰;

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    invoke-direct {p1, p2, p3}, Lio/ktor/utils/io/飘花落叶言子楪苏哲世兰;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世兰苏楪哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 22
    .line 23
    .line 24
    new-instance p1, Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 25
    .line 26
    invoke-direct {p1, p2, p0}, Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method

.method public static final 飘花落叶言子世楪苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BLkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->label:I

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
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    move-object p3, p0

    .line 40
    check-cast p3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 41
    .line 42
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p2, p0

    .line 45
    check-cast p2, Lkotlin/jvm/internal/Ref$IntRef;

    .line 46
    .line 47
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget p4, p2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 62
    .line 63
    iput-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1;->label:I

    .line 68
    .line 69
    invoke-static {p0, p1, v3, p4, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    iget-wide p0, p3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 77
    .line 78
    iget p4, p2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 79
    .line 80
    int-to-long v0, p4

    .line 81
    add-long/2addr p0, v0

    .line 82
    iput-wide p0, p3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 83
    .line 84
    iput v3, p2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 85
    .line 86
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 87
    .line 88
    return-object p0
.end method

.method public static final 飘花落叶言子世楪苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;

    .line 11
    .line 12
    iget v3, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x5

    .line 36
    const/4 v6, 0x4

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    if-eqz v4, :cond_6

    .line 42
    .line 43
    if-eq v4, v9, :cond_5

    .line 44
    .line 45
    if-eq v4, v8, :cond_4

    .line 46
    .line 47
    if-eq v4, v7, :cond_3

    .line 48
    .line 49
    if-eq v4, v6, :cond_2

    .line 50
    .line 51
    if-ne v4, v5, :cond_1

    .line 52
    .line 53
    iget-object v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_c

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v10

    .line 68
    :cond_2
    iget-object v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 71
    .line 72
    iget-object v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 75
    .line 76
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object v13, v0

    .line 80
    move-object v0, v10

    .line 81
    goto/16 :goto_a

    .line 82
    .line 83
    :cond_3
    iget-boolean v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 84
    .line 85
    iget-wide v11, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 86
    .line 87
    iget-object v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 90
    .line 91
    iget-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v13, [B

    .line 94
    .line 95
    iget-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    .line 98
    .line 99
    iget-object v15, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v15, [I

    .line 102
    .line 103
    iget-object v5, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 106
    .line 107
    iget-object v6, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v6, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 110
    .line 111
    move-object/from16 v16, v10

    .line 112
    .line 113
    iget-object v10, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 116
    .line 117
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move v1, v7

    .line 121
    goto/16 :goto_8

    .line 122
    .line 123
    :cond_4
    move-object/from16 v16, v10

    .line 124
    .line 125
    iget-byte v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->B$0:B

    .line 126
    .line 127
    iget-boolean v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 128
    .line 129
    iget-wide v5, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 130
    .line 131
    iget-object v10, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 134
    .line 135
    iget-object v11, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v11, [B

    .line 138
    .line 139
    iget-object v12, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v12, Lkotlin/jvm/internal/Ref$IntRef;

    .line 142
    .line 143
    iget-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v13, [I

    .line 146
    .line 147
    iget-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 150
    .line 151
    iget-object v15, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v15, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 154
    .line 155
    iget-object v7, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 158
    .line 159
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_5
    move-object/from16 v16, v10

    .line 165
    .line 166
    iget-boolean v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 167
    .line 168
    iget-wide v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 169
    .line 170
    iget-object v6, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Lkotlin/jvm/internal/Ref$LongRef;

    .line 173
    .line 174
    iget-object v7, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v7, [B

    .line 177
    .line 178
    iget-object v10, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 181
    .line 182
    iget-object v11, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v11, [I

    .line 185
    .line 186
    iget-object v12, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v12, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 189
    .line 190
    iget-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v13, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 193
    .line 194
    iget-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 197
    .line 198
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object v15, v13

    .line 202
    move-object v13, v11

    .line 203
    move-object v11, v7

    .line 204
    move-object v7, v14

    .line 205
    move-object v14, v12

    .line 206
    move-object v12, v10

    .line 207
    move-object v10, v6

    .line 208
    move-wide v5, v4

    .line 209
    move v4, v0

    .line 210
    goto/16 :goto_4

    .line 211
    .line 212
    :cond_6
    move-object/from16 v16, v10

    .line 213
    .line 214
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object v1, v0, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 218
    .line 219
    array-length v4, v1

    .line 220
    if-lez v4, :cond_15

    .line 221
    .line 222
    array-length v4, v1

    .line 223
    new-array v4, v4, [I

    .line 224
    .line 225
    array-length v1, v1

    .line 226
    const/4 v5, 0x0

    .line 227
    move v6, v9

    .line 228
    :goto_1
    if-ge v6, v1, :cond_9

    .line 229
    .line 230
    :goto_2
    if-lez v5, :cond_7

    .line 231
    .line 232
    invoke-virtual {v0, v6}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-virtual {v0, v5}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-eq v7, v10, :cond_7

    .line 241
    .line 242
    add-int/lit8 v5, v5, -0x1

    .line 243
    .line 244
    aget v5, v4, v5

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_7
    invoke-virtual {v0, v6}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    invoke-virtual {v0, v5}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-ne v7, v10, :cond_8

    .line 256
    .line 257
    add-int/lit8 v5, v5, 0x1

    .line 258
    .line 259
    :cond_8
    aput v5, v4, v6

    .line 260
    .line 261
    add-int/lit8 v6, v6, 0x1

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_9
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 265
    .line 266
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 267
    .line 268
    .line 269
    iget-object v5, v0, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 270
    .line 271
    array-length v5, v5

    .line 272
    new-array v5, v5, [B

    .line 273
    .line 274
    new-instance v6, Lkotlin/jvm/internal/Ref$LongRef;

    .line 275
    .line 276
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 277
    .line 278
    .line 279
    move-object v7, v1

    .line 280
    move-object v10, v2

    .line 281
    move-object v11, v4

    .line 282
    move-object v12, v5

    .line 283
    move-object v13, v6

    .line 284
    move-object/from16 v2, p2

    .line 285
    .line 286
    move-wide/from16 v4, p3

    .line 287
    .line 288
    move/from16 v6, p5

    .line 289
    .line 290
    move-object v1, v0

    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    :goto_3
    invoke-interface {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 294
    .line 295
    .line 296
    move-result v14

    .line 297
    if-nez v14, :cond_11

    .line 298
    .line 299
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v1, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v2, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v11, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v7, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v12, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v13, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 312
    .line 313
    iput-wide v4, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 314
    .line 315
    iput-boolean v6, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 316
    .line 317
    iput v9, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 318
    .line 319
    invoke-static {v0, v10}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    if-ne v14, v3, :cond_a

    .line 324
    .line 325
    goto/16 :goto_b

    .line 326
    .line 327
    :cond_a
    move-wide/from16 v19, v4

    .line 328
    .line 329
    move v4, v6

    .line 330
    move-wide/from16 v5, v19

    .line 331
    .line 332
    move-object v15, v1

    .line 333
    move-object v1, v14

    .line 334
    move-object v14, v2

    .line 335
    move-object v2, v10

    .line 336
    move-object v10, v13

    .line 337
    move-object v13, v11

    .line 338
    move-object v11, v12

    .line 339
    move-object v12, v7

    .line 340
    move-object v7, v0

    .line 341
    :goto_4
    check-cast v1, Ljava/lang/Number;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    iget v1, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 348
    .line 349
    if-lez v1, :cond_c

    .line 350
    .line 351
    invoke-virtual {v15, v1}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eq v0, v1, :cond_c

    .line 356
    .line 357
    iput-object v7, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 358
    .line 359
    iput-object v15, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 360
    .line 361
    iput-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v12, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object v11, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v10, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 370
    .line 371
    iput-wide v5, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 372
    .line 373
    iput-boolean v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 374
    .line 375
    iput-byte v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->B$0:B

    .line 376
    .line 377
    iput v8, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 378
    .line 379
    invoke-static {v14, v11, v12, v10, v2}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BLkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-ne v1, v3, :cond_b

    .line 384
    .line 385
    goto/16 :goto_b

    .line 386
    .line 387
    :cond_b
    :goto_5
    int-to-byte v1, v0

    .line 388
    :goto_6
    iget v8, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 389
    .line 390
    if-lez v8, :cond_c

    .line 391
    .line 392
    invoke-virtual {v15, v8}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-eq v1, v8, :cond_c

    .line 397
    .line 398
    iget v8, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 399
    .line 400
    sub-int/2addr v8, v9

    .line 401
    aget v8, v13, v8

    .line 402
    .line 403
    iput v8, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_c
    move-object/from16 v19, v13

    .line 407
    .line 408
    move-object v13, v11

    .line 409
    move-object/from16 v20, v14

    .line 410
    .line 411
    move-object v14, v12

    .line 412
    move-wide v11, v5

    .line 413
    move-object/from16 v5, v20

    .line 414
    .line 415
    move-object v6, v15

    .line 416
    move-object/from16 v15, v19

    .line 417
    .line 418
    iget v1, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 419
    .line 420
    invoke-virtual {v6, v1}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-ne v0, v1, :cond_e

    .line 425
    .line 426
    iget v1, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 427
    .line 428
    int-to-byte v0, v0

    .line 429
    aput-byte v0, v13, v1

    .line 430
    .line 431
    add-int/2addr v1, v9

    .line 432
    iput v1, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 433
    .line 434
    iget-object v0, v6, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 435
    .line 436
    array-length v0, v0

    .line 437
    if-ne v1, v0, :cond_d

    .line 438
    .line 439
    iget-wide v0, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 440
    .line 441
    new-instance v2, Ljava/lang/Long;

    .line 442
    .line 443
    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 444
    .line 445
    .line 446
    return-object v2

    .line 447
    :cond_d
    move-object v1, v6

    .line 448
    move-object v0, v7

    .line 449
    move v6, v4

    .line 450
    move-object/from16 v19, v10

    .line 451
    .line 452
    move-object v10, v2

    .line 453
    move-object v2, v5

    .line 454
    move-wide v4, v11

    .line 455
    move-object v12, v13

    .line 456
    move-object/from16 v13, v19

    .line 457
    .line 458
    :goto_7
    move-object v7, v14

    .line 459
    move-object v11, v15

    .line 460
    goto :goto_9

    .line 461
    :cond_e
    int-to-byte v0, v0

    .line 462
    iput-object v7, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v6, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 465
    .line 466
    iput-object v5, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 467
    .line 468
    iput-object v15, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 469
    .line 470
    iput-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 471
    .line 472
    iput-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v10, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 475
    .line 476
    iput-wide v11, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->J$0:J

    .line 477
    .line 478
    iput-boolean v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->Z$0:Z

    .line 479
    .line 480
    const/4 v1, 0x3

    .line 481
    iput v1, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 482
    .line 483
    invoke-static {v5, v0, v2}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    if-ne v0, v3, :cond_f

    .line 488
    .line 489
    goto/16 :goto_b

    .line 490
    .line 491
    :cond_f
    move v0, v4

    .line 492
    move-object v4, v10

    .line 493
    move-object v10, v7

    .line 494
    :goto_8
    iget-wide v7, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 495
    .line 496
    const-wide/16 v17, 0x1

    .line 497
    .line 498
    move-object/from16 p0, v2

    .line 499
    .line 500
    add-long v1, v7, v17

    .line 501
    .line 502
    iput-wide v1, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 503
    .line 504
    new-instance v1, Ljava/lang/Long;

    .line 505
    .line 506
    invoke-direct {v1, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 507
    .line 508
    .line 509
    move-object v2, v5

    .line 510
    move-object v1, v6

    .line 511
    move v6, v0

    .line 512
    move-object v0, v10

    .line 513
    move-object/from16 v10, p0

    .line 514
    .line 515
    move-object/from16 v19, v13

    .line 516
    .line 517
    move-object v13, v4

    .line 518
    move-wide v4, v11

    .line 519
    move-object/from16 v12, v19

    .line 520
    .line 521
    goto :goto_7

    .line 522
    :goto_9
    iget-wide v14, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 523
    .line 524
    cmp-long v8, v14, v4

    .line 525
    .line 526
    if-gtz v8, :cond_10

    .line 527
    .line 528
    const/4 v8, 0x2

    .line 529
    goto/16 :goto_3

    .line 530
    .line 531
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    const-string v2, "Limit of "

    .line 534
    .line 535
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    const-string v2, " bytes exceeded while scanning for \""

    .line 542
    .line 543
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    iget-object v1, v1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 550
    .line 551
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    new-instance v2, Ljava/lang/String;

    .line 555
    .line 556
    sget-object v3, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 557
    .line 558
    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 559
    .line 560
    .line 561
    const/16 v1, 0x22

    .line 562
    .line 563
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    return-object v16

    .line 571
    :cond_11
    if-eqz v6, :cond_14

    .line 572
    .line 573
    iput-object v2, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 574
    .line 575
    iput-object v13, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 576
    .line 577
    move-object/from16 v0, v16

    .line 578
    .line 579
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$2:Ljava/lang/Object;

    .line 580
    .line 581
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$3:Ljava/lang/Object;

    .line 582
    .line 583
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$4:Ljava/lang/Object;

    .line 584
    .line 585
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$5:Ljava/lang/Object;

    .line 586
    .line 587
    iput-object v0, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$6:Ljava/lang/Object;

    .line 588
    .line 589
    const/4 v1, 0x4

    .line 590
    iput v1, v10, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 591
    .line 592
    invoke-static {v2, v12, v7, v13, v10}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BLkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    if-ne v1, v3, :cond_12

    .line 597
    .line 598
    goto :goto_b

    .line 599
    :cond_12
    move-object v4, v2

    .line 600
    move-object v2, v10

    .line 601
    :goto_a
    iput-object v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$0:Ljava/lang/Object;

    .line 602
    .line 603
    iput-object v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->L$1:Ljava/lang/Object;

    .line 604
    .line 605
    const/4 v0, 0x5

    .line 606
    iput v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUntil$1;->label:I

    .line 607
    .line 608
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 609
    .line 610
    invoke-virtual {v4, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    if-ne v0, v3, :cond_13

    .line 615
    .line 616
    :goto_b
    return-object v3

    .line 617
    :cond_13
    move-object v0, v13

    .line 618
    :goto_c
    iget-wide v0, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 619
    .line 620
    new-instance v2, Ljava/lang/Long;

    .line 621
    .line 622
    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 623
    .line 624
    .line 625
    return-object v2

    .line 626
    :cond_14
    new-instance v0, Ljava/io/IOException;

    .line 627
    .line 628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-object v1, v1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    new-instance v2, Ljava/lang/String;

    .line 637
    .line 638
    sget-object v3, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 639
    .line 640
    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 641
    .line 642
    .line 643
    const-string v1, "\n"

    .line 644
    .line 645
    const-string v3, "\\n"

    .line 646
    .line 647
    invoke-static {v2, v1, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    new-instance v2, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    const-string v3, "Expected \""

    .line 654
    .line 655
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    const-string v1, "\" but encountered end of input"

    .line 662
    .line 663
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    throw v0

    .line 674
    :cond_15
    const-string v0, "Empty match string not permitted for readUntil"

    .line 675
    .line 676
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    const/16 v16, 0x0

    .line 680
    .line 681
    return-object v16
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

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
    iput v2, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v3, :cond_5

    .line 39
    .line 40
    if-eq v3, v7, :cond_4

    .line 41
    .line 42
    if-eq v3, v6, :cond_3

    .line 43
    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    if-eq v3, v4, :cond_1

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v8

    .line 54
    :cond_1
    iget-object v1, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_2
    iget-wide v2, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 64
    .line 65
    iget-wide v4, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    iget-wide v9, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 73
    .line 74
    iget-wide v11, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 75
    .line 76
    iget-object v3, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    iget-object v13, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 83
    .line 84
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    move-object/from16 v16, v13

    .line 88
    .line 89
    move-object v13, v1

    .line 90
    move-object/from16 v1, v16

    .line 91
    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_4
    iget-wide v9, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 98
    .line 99
    iget-wide v11, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 100
    .line 101
    iget-object v3, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 104
    .line 105
    iget-object v13, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 108
    .line 109
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object/from16 v3, p1

    .line 117
    .line 118
    move-wide/from16 v9, p2

    .line 119
    .line 120
    move-wide v11, v9

    .line 121
    move-object v13, v1

    .line 122
    move-object/from16 v1, p0

    .line 123
    .line 124
    :goto_1
    :try_start_2
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_8

    .line 129
    .line 130
    const-wide/16 v14, 0x0

    .line 131
    .line 132
    cmp-long v0, v9, v14

    .line 133
    .line 134
    if-lez v0, :cond_8

    .line 135
    .line 136
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    iput-object v1, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v3, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 149
    .line 150
    iput-wide v11, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 151
    .line 152
    iput-wide v9, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 153
    .line 154
    iput v7, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 155
    .line 156
    invoke-interface {v1, v7, v13}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    if-ne v0, v2, :cond_6

    .line 161
    .line 162
    goto/16 :goto_6

    .line 163
    .line 164
    :catchall_1
    move-exception v0

    .line 165
    move-object/from16 v16, v13

    .line 166
    .line 167
    move-object v13, v1

    .line 168
    move-object/from16 v1, v16

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_6
    move-object/from16 v16, v13

    .line 172
    .line 173
    move-object v13, v1

    .line 174
    move-object/from16 v1, v16

    .line 175
    .line 176
    :goto_2
    :try_start_3
    invoke-interface {v13}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v14

    .line 184
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 185
    .line 186
    .line 187
    move-result-wide v14

    .line 188
    invoke-interface {v13}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object v7, v3

    .line 193
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 194
    .line 195
    invoke-virtual {v7}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 196
    .line 197
    .line 198
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    :try_start_4
    invoke-interface {v0, v3, v14, v15}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世兰楪苏哲(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V

    .line 200
    .line 201
    .line 202
    sub-long/2addr v9, v14

    .line 203
    iput-object v13, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v7, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 206
    .line 207
    iput-wide v11, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 208
    .line 209
    iput-wide v9, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 210
    .line 211
    iput v6, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 212
    .line 213
    invoke-virtual {v7, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 217
    if-ne v0, v2, :cond_7

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_7
    move-object v3, v13

    .line 221
    move-object v13, v1

    .line 222
    move-object v1, v3

    .line 223
    move-object v3, v7

    .line 224
    :goto_3
    const/4 v7, 0x1

    .line 225
    goto :goto_1

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    move-object v3, v7

    .line 228
    goto :goto_5

    .line 229
    :cond_8
    iput-object v8, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v8, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 232
    .line 233
    iput-wide v11, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$0:J

    .line 234
    .line 235
    iput-wide v9, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->J$1:J

    .line 236
    .line 237
    iput v5, v13, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 238
    .line 239
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 240
    .line 241
    invoke-virtual {v3, v13}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-ne v0, v2, :cond_9

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_9
    move-wide v2, v9

    .line 249
    move-wide v4, v11

    .line 250
    :goto_4
    sub-long/2addr v4, v2

    .line 251
    new-instance v0, Ljava/lang/Long;

    .line 252
    .line 253
    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 254
    .line 255
    .line 256
    return-object v0

    .line 257
    :goto_5
    :try_start_5
    invoke-interface {v13, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 264
    :catchall_3
    move-exception v0

    .line 265
    iput-object v0, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$0:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v8, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->L$1:Ljava/lang/Object;

    .line 268
    .line 269
    iput v4, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$2;->label:I

    .line 270
    .line 271
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 272
    .line 273
    invoke-virtual {v3, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-ne v1, v2, :cond_a

    .line 278
    .line 279
    :goto_6
    return-object v2

    .line 280
    :cond_a
    move-object v1, v0

    .line 281
    :goto_7
    throw v1
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_6

    .line 37
    .line 38
    if-eq v2, v6, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v7

    .line 52
    :cond_1
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Ljava/lang/Throwable;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_2
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_3
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 69
    .line 70
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    iget-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    :cond_4
    move-wide v10, p0

    .line 82
    move-object p0, v8

    .line 83
    move-wide v8, v10

    .line 84
    move-object p1, v2

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_5
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 90
    .line 91
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 94
    .line 95
    iget-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 98
    .line 99
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const-wide/16 v8, 0x0

    .line 107
    .line 108
    :goto_1
    :try_start_2
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_8

    .line 113
    .line 114
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    move-object v2, p1

    .line 119
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 120
    .line 121
    invoke-virtual {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    :try_start_3
    invoke-interface {p2, p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J

    .line 126
    .line 127
    .line 128
    move-result-wide p1

    .line 129
    add-long/2addr v8, p1

    .line 130
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-wide v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 135
    .line 136
    iput v6, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 137
    .line 138
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 142
    if-ne p1, v1, :cond_7

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    move-wide v10, v8

    .line 146
    move-object v8, p0

    .line 147
    move-wide p0, v10

    .line 148
    :goto_2
    :try_start_4
    iput-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 153
    .line 154
    iput v5, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 155
    .line 156
    invoke-interface {v8, v6, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    if-ne p2, v1, :cond_4

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :catchall_1
    move-exception p1

    .line 164
    move-object v8, p0

    .line 165
    move-object p0, p1

    .line 166
    goto :goto_5

    .line 167
    :goto_3
    move-object v8, p0

    .line 168
    move-object v2, p1

    .line 169
    move-object p0, p2

    .line 170
    goto :goto_5

    .line 171
    :catchall_2
    move-exception p2

    .line 172
    goto :goto_3

    .line 173
    :cond_8
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 176
    .line 177
    iput-wide v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->J$0:J

    .line 178
    .line 179
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 180
    .line 181
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-ne p0, v1, :cond_9

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    move-wide p0, v8

    .line 191
    :goto_4
    new-instance p2, Ljava/lang/Long;

    .line 192
    .line 193
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 194
    .line 195
    .line 196
    return-object p2

    .line 197
    :goto_5
    :try_start_5
    invoke-interface {v8, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v2, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 204
    :catchall_3
    move-exception p0

    .line 205
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyTo$1;->label:I

    .line 210
    .line 211
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 212
    .line 213
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-ne p1, v1, :cond_a

    .line 218
    .line 219
    :goto_6
    return-object v1

    .line 220
    :cond_a
    :goto_7
    throw p0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_6

    .line 37
    .line 38
    if-eq v2, v6, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v7

    .line 52
    :cond_1
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Ljava/lang/Throwable;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_2
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_3
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 69
    .line 70
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    iget-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    :cond_4
    move-wide v10, p0

    .line 82
    move-object p0, v8

    .line 83
    move-wide v8, v10

    .line 84
    move-object p1, v2

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_5
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 90
    .line 91
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 94
    .line 95
    iget-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 98
    .line 99
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const-wide/16 v8, 0x0

    .line 107
    .line 108
    :goto_1
    :try_start_2
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_8

    .line 113
    .line 114
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    move-object v2, p1

    .line 119
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 120
    .line 121
    invoke-virtual {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    :try_start_3
    invoke-interface {p2, p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J

    .line 126
    .line 127
    .line 128
    move-result-wide p1

    .line 129
    add-long/2addr v8, p1

    .line 130
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-wide v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 135
    .line 136
    iput v6, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 137
    .line 138
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 142
    if-ne p1, v1, :cond_7

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    move-wide v10, v8

    .line 146
    move-object v8, p0

    .line 147
    move-wide p0, v10

    .line 148
    :goto_2
    :try_start_4
    iput-object v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 153
    .line 154
    iput v5, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 155
    .line 156
    invoke-interface {v8, v6, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    if-ne p2, v1, :cond_4

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :catchall_1
    move-exception p1

    .line 164
    move-object v8, p0

    .line 165
    move-object p0, p1

    .line 166
    goto :goto_5

    .line 167
    :goto_3
    move-object v8, p0

    .line 168
    move-object v2, p1

    .line 169
    move-object p0, p2

    .line 170
    goto :goto_5

    .line 171
    :catchall_2
    move-exception p2

    .line 172
    goto :goto_3

    .line 173
    :cond_8
    :try_start_5
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 177
    if-nez p2, :cond_a

    .line 178
    .line 179
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 182
    .line 183
    iput-wide v8, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->J$0:J

    .line 184
    .line 185
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 186
    .line 187
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    if-ne p0, v1, :cond_9

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    move-wide p0, v8

    .line 197
    :goto_4
    new-instance p2, Ljava/lang/Long;

    .line 198
    .line 199
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 200
    .line 201
    .line 202
    return-object p2

    .line 203
    :cond_a
    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 204
    :goto_5
    :try_start_7
    invoke-interface {v8, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v2, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 211
    :catchall_3
    move-exception p0

    .line 212
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$0:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v7, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->L$1:Ljava/lang/Object;

    .line 215
    .line 216
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$copyAndClose$1;->label:I

    .line 217
    .line 218
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 219
    .line 220
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v1, :cond_b

    .line 225
    .line 226
    :goto_6
    return-object v1

    .line 227
    :cond_b
    :goto_7
    throw p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/ktor/utils/io/ByteWriteChannelKt$close$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/ktor/utils/io/ByteWriteChannelKt$close$1;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    const-string v1, "Channel was cancelled"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    if-eq v2, v4, :cond_3

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    iget p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->I$0:I

    .line 40
    .line 41
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v5, p1

    .line 49
    move p1, p0

    .line 50
    move-object p0, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_3
    iget p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->I$0:I

    .line 60
    .line 61
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-ge p2, p1, :cond_7

    .line 77
    .line 78
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->I$0:I

    .line 81
    .line 82
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->label:I

    .line 83
    .line 84
    invoke-interface {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, v1, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move v5, p1

    .line 92
    move-object p1, p0

    .line 93
    move p0, v5

    .line 94
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->I$0:I

    .line 105
    .line 106
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$awaitUntilReadable$1;->label:I

    .line 107
    .line 108
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-ne p2, v1, :cond_1

    .line 113
    .line 114
    :goto_3
    return-object v1

    .line 115
    :cond_6
    move-object v5, p1

    .line 116
    move p1, p0

    .line 117
    move-object p0, v5

    .line 118
    :cond_7
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-lt p0, p1, :cond_8

    .line 123
    .line 124
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_8
    new-instance p0, Ljava/io/EOFException;

    .line 128
    .line 129
    const-string p1, "Not enough data available"

    .line 130
    .line 131
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p0
.end method

.method public static final 飘花落叶言子楪兰世哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->J$0:J

    .line 37
    .line 38
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p2, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 41
    .line 42
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 45
    .line 46
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p3, p2

    .line 50
    move-wide p1, p0

    .line 51
    move-object p0, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p3, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    const-wide/16 v4, 0x0

    .line 75
    .line 76
    cmp-long v2, p1, v4

    .line 77
    .line 78
    if-lez v2, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    cmp-long v2, p1, v6

    .line 89
    .line 90
    if-ltz v2, :cond_3

    .line 91
    .line 92
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    sub-long v4, p1, v4

    .line 101
    .line 102
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1, p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J

    .line 107
    .line 108
    .line 109
    move-result-wide p1

    .line 110
    new-instance v2, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2, p3, p1, p2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世兰楪苏哲(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V

    .line 121
    .line 122
    .line 123
    :goto_2
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    iput-wide v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->J$0:J

    .line 128
    .line 129
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$2;->label:I

    .line 130
    .line 131
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v1, :cond_4

    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_4
    move-wide p1, v4

    .line 139
    goto :goto_1

    .line 140
    :cond_5
    check-cast p3, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    return-object p3
.end method

.method public static final 飘花落叶言子楪兰世苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->I$0:I

    .line 37
    .line 38
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    move-object v10, p2

    .line 66
    move p2, p1

    .line 67
    move-object p1, v10

    .line 68
    :goto_1
    iget-wide v4, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 69
    .line 70
    int-to-long v6, p2

    .line 71
    cmp-long v2, v4, v6

    .line 72
    .line 73
    if-gez v2, :cond_6

    .line 74
    .line 75
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    iput p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->I$0:I

    .line 90
    .line 91
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readPacket$1;->label:I

    .line 92
    .line 93
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-ne v2, v1, :cond_3

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_3
    move-object v2, p0

    .line 101
    move p0, p2

    .line 102
    :goto_2
    move p2, p0

    .line 103
    move-object p0, v2

    .line 104
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    int-to-long v6, p2

    .line 119
    iget-wide v8, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 120
    .line 121
    sub-long v8, v6, v8

    .line 122
    .line 123
    cmp-long v2, v4, v8

    .line 124
    .line 125
    if-lez v2, :cond_5

    .line 126
    .line 127
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-wide v4, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 132
    .line 133
    sub-long/2addr v6, v4

    .line 134
    invoke-interface {v2, p1, v6, v7}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世兰楪苏哲(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {v2, p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    new-instance v2, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-direct {v2, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 153
    .line 154
    int-to-long v2, p2

    .line 155
    cmp-long p0, v0, v2

    .line 156
    .line 157
    if-ltz p0, :cond_7

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_7
    new-instance p0, Ljava/io/EOFException;

    .line 161
    .line 162
    const-string v0, "Not enough data available, required "

    .line 163
    .line 164
    const-string v1, " bytes but only "

    .line 165
    .line 166
    invoke-static {p2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 171
    .line 172
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string p1, " available"

    .line 176
    .line 177
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0
.end method

.method public static final 飘花落叶言子楪兰哲世苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->label:I

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
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8Line$1;->label:I

    .line 62
    .line 63
    invoke-static {p0, p2, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    move-object v5, p2

    .line 71
    move-object p2, p0

    .line 72
    move-object p0, v5

    .line 73
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public static final 飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;

    .line 11
    .line 12
    iget v3, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const-wide/16 v10, 0x1

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x1

    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    if-eq v4, v13, :cond_3

    .line 46
    .line 47
    if-eq v4, v7, :cond_2

    .line 48
    .line 49
    if-ne v4, v6, :cond_1

    .line 50
    .line 51
    iget-object v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v16, 0x0

    .line 59
    .line 60
    goto/16 :goto_a

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v12

    .line 68
    :cond_2
    iget v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$1:I

    .line 69
    .line 70
    iget v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$0:I

    .line 71
    .line 72
    iget-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v14, Ljava/lang/Appendable;

    .line 75
    .line 76
    iget-object v15, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v14

    .line 84
    move-object v14, v15

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    iget v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$0:I

    .line 87
    .line 88
    iget-object v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/Appendable;

    .line 91
    .line 92
    iget-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move-object v1, v4

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    iput-object v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    move-object/from16 v1, p1

    .line 117
    .line 118
    iput-object v1, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$1:Ljava/lang/Object;

    .line 119
    .line 120
    move/from16 v4, p2

    .line 121
    .line 122
    iput v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$0:I

    .line 123
    .line 124
    iput v13, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 125
    .line 126
    invoke-interface {v0, v13, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    if-ne v14, v3, :cond_6

    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_5
    move-object/from16 v1, p1

    .line 135
    .line 136
    move/from16 v4, p2

    .line 137
    .line 138
    :cond_6
    move-object v14, v0

    .line 139
    move v0, v4

    .line 140
    :goto_1
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_7

    .line 145
    .line 146
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_7
    const/4 v4, 0x0

    .line 150
    move/from16 v23, v4

    .line 151
    .line 152
    move v4, v0

    .line 153
    move/from16 v0, v23

    .line 154
    .line 155
    :goto_2
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-nez v15, :cond_1a

    .line 160
    .line 161
    iput-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    iput v4, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$0:I

    .line 166
    .line 167
    iput v0, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->I$1:I

    .line 168
    .line 169
    iput v7, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 170
    .line 171
    invoke-interface {v14, v13, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    if-ne v15, v3, :cond_8

    .line 176
    .line 177
    goto/16 :goto_9

    .line 178
    .line 179
    :cond_8
    :goto_3
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    const/16 v7, 0xd

    .line 184
    .line 185
    const-wide/16 v16, 0x0

    .line 186
    .line 187
    invoke-static {v15, v7}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;B)J

    .line 188
    .line 189
    .line 190
    move-result-wide v8

    .line 191
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v7, v5}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;B)J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const-wide/16 v18, -0x1

    .line 200
    .line 201
    cmp-long v20, v8, v18

    .line 202
    .line 203
    const v15, 0x7fffffff

    .line 204
    .line 205
    .line 206
    if-nez v20, :cond_b

    .line 207
    .line 208
    cmp-long v20, v6, v18

    .line 209
    .line 210
    if-nez v20, :cond_b

    .line 211
    .line 212
    if-ne v4, v15, :cond_9

    .line 213
    .line 214
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v1, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    sub-int v6, v4, v0

    .line 227
    .line 228
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-static {v7}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 233
    .line 234
    .line 235
    move-result-wide v7

    .line 236
    long-to-int v7, v7

    .line 237
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    add-int/2addr v0, v6

    .line 242
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    int-to-long v8, v6

    .line 247
    invoke-static {v7, v8, v9}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-interface {v1, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 252
    .line 253
    .line 254
    if-eq v0, v4, :cond_a

    .line 255
    .line 256
    :goto_4
    const/4 v6, 0x3

    .line 257
    :goto_5
    const/4 v7, 0x2

    .line 258
    goto :goto_2

    .line 259
    :cond_a
    new-instance v0, Lio/ktor/utils/io/charsets/TooLongLineException;

    .line 260
    .line 261
    const-string v1, "Line exceeds limit of "

    .line 262
    .line 263
    const-string v2, " characters"

    .line 264
    .line 265
    invoke-static {v4, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-direct {v0, v1}, Lio/ktor/utils/io/charsets/TooLongLineException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :cond_b
    cmp-long v20, v8, v16

    .line 274
    .line 275
    if-ltz v20, :cond_e

    .line 276
    .line 277
    add-long v21, v8, v10

    .line 278
    .line 279
    cmp-long v21, v6, v21

    .line 280
    .line 281
    if-nez v21, :cond_e

    .line 282
    .line 283
    if-eq v4, v15, :cond_c

    .line 284
    .line 285
    move-wide v2, v8

    .line 286
    goto :goto_6

    .line 287
    :cond_c
    sub-int/2addr v4, v0

    .line 288
    long-to-int v0, v8

    .line 289
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    int-to-long v2, v0

    .line 294
    :goto_6
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0, v2, v3}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-interface {v1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 303
    .line 304
    .line 305
    cmp-long v0, v2, v8

    .line 306
    .line 307
    if-nez v0, :cond_d

    .line 308
    .line 309
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const-wide/16 v1, 0x2

    .line 314
    .line 315
    invoke-static {v0, v1, v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 316
    .line 317
    .line 318
    :cond_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 319
    .line 320
    return-object v0

    .line 321
    :cond_e
    if-ltz v20, :cond_f

    .line 322
    .line 323
    cmp-long v18, v6, v18

    .line 324
    .line 325
    if-eqz v18, :cond_10

    .line 326
    .line 327
    cmp-long v18, v8, v6

    .line 328
    .line 329
    if-gez v18, :cond_f

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_f
    const/4 v8, 0x3

    .line 333
    goto/16 :goto_b

    .line 334
    .line 335
    :cond_10
    :goto_7
    if-eq v4, v15, :cond_11

    .line 336
    .line 337
    move-wide v6, v8

    .line 338
    goto :goto_8

    .line 339
    :cond_11
    sub-int/2addr v4, v0

    .line 340
    long-to-int v0, v8

    .line 341
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    int-to-long v6, v0

    .line 346
    :goto_8
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0, v6, v7}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-interface {v1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 355
    .line 356
    .line 357
    cmp-long v0, v6, v8

    .line 358
    .line 359
    if-nez v0, :cond_12

    .line 360
    .line 361
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0, v10, v11}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 366
    .line 367
    .line 368
    :cond_12
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_14

    .line 377
    .line 378
    iput-object v14, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$0:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v12, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->L$1:Ljava/lang/Object;

    .line 381
    .line 382
    const/4 v8, 0x3

    .line 383
    iput v8, v2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readUTF8LineTo$1;->label:I

    .line 384
    .line 385
    invoke-interface {v14, v13, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    if-ne v0, v3, :cond_13

    .line 390
    .line 391
    :goto_9
    return-object v3

    .line 392
    :cond_13
    move-object v0, v14

    .line 393
    :goto_a
    move-object v14, v0

    .line 394
    :cond_14
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iget-wide v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 403
    .line 404
    cmp-long v1, v16, v1

    .line 405
    .line 406
    if-gez v1, :cond_16

    .line 407
    .line 408
    iget-object v0, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 414
    .line 415
    iget v0, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 416
    .line 417
    aget-byte v0, v1, v0

    .line 418
    .line 419
    if-ne v0, v5, :cond_15

    .line 420
    .line 421
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v0, v10, v11}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 426
    .line 427
    .line 428
    :cond_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 429
    .line 430
    return-object v0

    .line 431
    :cond_16
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 432
    .line 433
    iget-wide v2, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 434
    .line 435
    new-instance v0, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v4, "position (0) is not within the range [0..size("

    .line 438
    .line 439
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string v2, "))"

    .line 446
    .line 447
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v1

    .line 458
    :goto_b
    cmp-long v9, v6, v16

    .line 459
    .line 460
    if-ltz v9, :cond_19

    .line 461
    .line 462
    if-eq v4, v15, :cond_17

    .line 463
    .line 464
    move-wide v2, v6

    .line 465
    goto :goto_c

    .line 466
    :cond_17
    sub-int/2addr v4, v0

    .line 467
    long-to-int v0, v6

    .line 468
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    int-to-long v2, v0

    .line 473
    :goto_c
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0, v2, v3}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-interface {v1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 482
    .line 483
    .line 484
    cmp-long v0, v2, v6

    .line 485
    .line 486
    if-nez v0, :cond_18

    .line 487
    .line 488
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v0, v10, v11}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 493
    .line 494
    .line 495
    :cond_18
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 496
    .line 497
    return-object v0

    .line 498
    :cond_19
    move v6, v8

    .line 499
    goto/16 :goto_5

    .line 500
    .line 501
    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 502
    .line 503
    return-object v0
.end method

.method public static final 飘花落叶言子楪兰苏世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 39
    .line 40
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p1, p0

    .line 48
    move-object p0, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪世哲兰苏;)J

    .line 78
    .line 79
    .line 80
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readRemaining$1;->label:I

    .line 85
    .line 86
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-ne v2, v1, :cond_3

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-nez p0, :cond_5

    .line 98
    .line 99
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_5
    throw p0
.end method

.method public static final 飘花落叶言子楪兰苏哲世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readShort$1;->label:I

    .line 57
    .line 58
    const/4 p1, 0x2

    .line 59
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readShort()S

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    new-instance p1, Ljava/lang/Short;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Ljava/lang/Short;-><init>(S)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;[BILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, -0x1

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->I$1:I

    .line 39
    .line 40
    iget p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->I$0:I

    .line 41
    .line 42
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [B

    .line 45
    .line 46
    iget-object v0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 49
    .line 50
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move p3, p2

    .line 54
    move-object p2, p1

    .line 55
    move p1, p0

    .line 56
    move-object p0, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0

    .line 65
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    if-eqz p3, :cond_3

    .line 73
    .line 74
    new-instance p0, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-direct {p0, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-interface {p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-eqz p3, :cond_5

    .line 89
    .line 90
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->I$0:I

    .line 95
    .line 96
    iput p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->I$1:I

    .line 97
    .line 98
    iput v5, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readAvailable$1;->label:I

    .line 99
    .line 100
    invoke-interface {p0, v5, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-ne p3, v1, :cond_4

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_4
    move p3, p2

    .line 108
    move-object p2, p1

    .line 109
    move p1, v3

    .line 110
    :goto_1
    move-object v6, p2

    .line 111
    move p2, p1

    .line 112
    move-object p1, v6

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move p3, p2

    .line 115
    move p2, v3

    .line 116
    :goto_2
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    new-instance p0, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-direct {p0, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 125
    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_6
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    add-int/2addr p3, p2

    .line 139
    invoke-interface {p0, p2, p1, p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子苏楪哲世兰(I[BI)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-ne p0, v4, :cond_7

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    move v3, p0

    .line 147
    :goto_3
    new-instance p0, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-direct {p0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 150
    .line 151
    .line 152
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->label:I

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    move-object p1, p0

    .line 40
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    new-instance p0, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-direct {p0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_3
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-interface {p2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$readAvailable$1;->label:I

    .line 87
    .line 88
    invoke-interface {p0, v4, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-ne p2, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    new-instance p0, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-direct {p0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;Ljava/nio/ByteBuffer;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    new-instance p1, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 118
    .line 119
    .line 120
    return-object p1
.end method

.method public static final 飘花落叶言子楪哲兰世苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readInt$1;->label:I

    .line 57
    .line 58
    const/4 p1, 0x4

    .line 59
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readInt()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    new-instance p1, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method

.method public static final 飘花落叶言子楪哲兰苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readLong$1;->label:I

    .line 57
    .line 58
    const/16 p1, 0x8

    .line 59
    .line 60
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readLong()J

    .line 72
    .line 73
    .line 74
    move-result-wide p0

    .line 75
    new-instance v0, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-direct {v0, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public static final 飘花落叶言子楪哲苏世兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p1, p0

    .line 48
    move-object p0, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {p1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪世哲兰苏;)J

    .line 76
    .line 77
    .line 78
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$1;->label:I

    .line 83
    .line 84
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-ne v2, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-nez p0, :cond_5

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_5
    throw p0
.end method

.method public static final 飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByte$1;->label:I

    .line 67
    .line 68
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_4
    new-instance p0, Ljava/io/EOFException;

    .line 99
    .line 100
    const-string p1, "Not enough data available"

    .line 101
    .line 102
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->J$1:J

    .line 37
    .line 38
    iget-wide v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->J$0:J

    .line 39
    .line 40
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-wide v4, p1

    .line 59
    :goto_1
    const-wide/16 v6, 0x0

    .line 60
    .line 61
    cmp-long p3, p1, v6

    .line 62
    .line 63
    if-lez p3, :cond_5

    .line 64
    .line 65
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-nez p3, :cond_5

    .line 70
    .line 71
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput-wide v4, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->J$0:J

    .line 80
    .line 81
    iput-wide p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->J$1:J

    .line 82
    .line 83
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discard$1;->label:I

    .line 84
    .line 85
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-ne p3, v1, :cond_3

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    move-wide v8, p1

    .line 93
    move-object p2, p0

    .line 94
    move-wide p0, v8

    .line 95
    :goto_2
    move-wide v8, p0

    .line 96
    move-object p0, p2

    .line 97
    move-wide p1, v8

    .line 98
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-static {p3}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    invoke-static {p1, p2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-static {p3, v6, v7}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 115
    .line 116
    .line 117
    sub-long/2addr p1, v6

    .line 118
    goto :goto_1

    .line 119
    :cond_5
    sub-long/2addr v4, p1

    .line 120
    new-instance p0, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-direct {p0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 123
    .line 124
    .line 125
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/channels/FileChannel;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->label:I

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
    iget p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->I$0:I

    .line 38
    .line 39
    iget-wide p1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->J$0:J

    .line 40
    .line 41
    iget-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p3, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    iget-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    iget-object v3, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 52
    .line 53
    iget-object v5, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    cmp-long p4, p2, v5

    .line 73
    .line 74
    if-ltz p4, :cond_d

    .line 75
    .line 76
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    if-eqz p4, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    new-instance p0, Ljava/lang/Long;

    .line 89
    .line 90
    invoke-direct {p0, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    throw p0

    .line 95
    :cond_4
    new-instance p4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    invoke-direct {p4}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v2, Lio/ktor/utils/io/飘花落叶言子楪哲世兰苏;

    .line 101
    .line 102
    invoke-direct {v2, p2, p3, p4, p1}, Lio/ktor/utils/io/飘花落叶言子楪哲世兰苏;-><init>(JLkotlin/jvm/internal/Ref$LongRef;Ljava/nio/channels/WritableByteChannel;)V

    .line 103
    .line 104
    .line 105
    move-object v3, p4

    .line 106
    :cond_5
    iget-wide v5, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 107
    .line 108
    cmp-long p1, v5, p2

    .line 109
    .line 110
    if-gez p1, :cond_b

    .line 111
    .line 112
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-lez p1, :cond_6

    .line 117
    .line 118
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-ltz p1, :cond_6

    .line 123
    .line 124
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1, v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v3, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$2:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->L$3:Ljava/lang/Object;

    .line 139
    .line 140
    iput-wide p2, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->J$0:J

    .line 141
    .line 142
    const/4 p1, 0x0

    .line 143
    iput p1, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->I$0:I

    .line 144
    .line 145
    iput v4, v0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$copyTo$1;->label:I

    .line 146
    .line 147
    invoke-interface {p0, v4, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    if-ne p4, v1, :cond_7

    .line 152
    .line 153
    return-object v1

    .line 154
    :cond_7
    move-object v5, p0

    .line 155
    move p0, p1

    .line 156
    move-wide p1, p2

    .line 157
    move-object p3, v5

    .line 158
    :goto_1
    invoke-interface {p3}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 159
    .line 160
    .line 161
    move-result p4

    .line 162
    if-eqz p4, :cond_9

    .line 163
    .line 164
    if-gtz p0, :cond_8

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    .line 168
    .line 169
    const-string p2, "Not enough bytes available: required "

    .line 170
    .line 171
    const-string p4, " but "

    .line 172
    .line 173
    invoke-static {p0, p2, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p2, " available"

    .line 185
    .line 186
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_9
    :goto_2
    invoke-static {p3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-lez p0, :cond_a

    .line 202
    .line 203
    invoke-interface {p3}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p0, v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 208
    .line 209
    .line 210
    :cond_a
    move-wide p2, p1

    .line 211
    move-object p0, v5

    .line 212
    :goto_3
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_5

    .line 217
    .line 218
    :cond_b
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-nez p0, :cond_c

    .line 223
    .line 224
    iget-wide p0, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 225
    .line 226
    new-instance p2, Ljava/lang/Long;

    .line 227
    .line 228
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 229
    .line 230
    .line 231
    return-object p2

    .line 232
    :cond_c
    throw p0

    .line 233
    :cond_d
    const-string p0, "Limit shouldn\'t be negative: "

    .line 234
    .line 235
    invoke-static {p2, p3, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(JLjava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-object v3
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 13
    .line 14
    long-to-int p0, v0

    .line 15
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Comparable;
    .locals 5

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->I$0:I

    .line 38
    .line 39
    iget-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 42
    .line 43
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    iput-object p0, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->I$0:I

    .line 66
    .line 67
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$peek$1;->label:I

    .line 68
    .line 69
    invoke-interface {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_4

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_5

    .line 83
    .line 84
    :goto_2
    return-object v4

    .line 85
    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->peek()Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 98
    .line 99
    invoke-direct {p1, p0}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;-><init>([B)V

    .line 100
    .line 101
    .line 102
    return-object p1
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->label:I

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
    iput v1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->J$0:J

    .line 37
    .line 38
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-wide p1, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->J$0:J

    .line 53
    .line 54
    iput v3, v0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$discardExact$1;->label:I

    .line 55
    .line 56
    invoke-static {p0, p1, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    if-ne p3, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    cmp-long p0, v0, p1

    .line 70
    .line 71
    if-ltz p0, :cond_4

    .line 72
    .line 73
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    new-instance p0, Ljava/io/EOFException;

    .line 77
    .line 78
    new-instance p3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v0, "Unable to discard "

    .line 81
    .line 82
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, " bytes"

    .line 89
    .line 90
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    instance-of v1, p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p0, :cond_1

    .line 22
    .line 23
    iget-boolean p0, p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne p0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 37
    .line 38
    long-to-int p0, v1

    .line 39
    const/high16 v1, 0x100000

    .line 40
    .line 41
    if-lt p0, v1, :cond_2

    .line 42
    .line 43
    :goto_1
    invoke-virtual {v0, p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 48
    .line 49
    if-ne p0, p1, :cond_2

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    throw v1
.end method
