.class public final Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 11
    .line 12
    iput-object p3, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    new-instance p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    invoke-direct {p1}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏兰楪()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;L飘花落叶言楪兰哲子苏世/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->label:I

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
    iput v1, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;-><init>(Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

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
    return-object v2

    .line 50
    :cond_2
    iget-object p1, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 53
    .line 54
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p2, "\r\n"

    .line 70
    .line 71
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput-object p1, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput v4, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->label:I

    .line 81
    .line 82
    invoke-static {p1, p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, p3, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_1
    iput-object v2, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput v3, v0, Lio/ktor/server/sse/DefaultServerSSESession$writeSSE$1;->label:I

    .line 92
    .line 93
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, p3, :cond_5

    .line 100
    .line 101
    :goto_2
    return-object p3

    .line 102
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 103
    .line 104
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lio/ktor/server/sse/DefaultServerSSESession$close$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->label:I

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
    iput v1, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/server/sse/DefaultServerSSESession$close$1;-><init>(Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_5

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_2
    iget-object p0, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$1:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    iget-object v2, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object p1, p0

    .line 68
    move-object p0, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p0, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p1, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 76
    .line 77
    iput-object p1, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput v4, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->label:I

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-ne v2, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    :try_start_1
    iget-object p0, p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 89
    .line 90
    iput-object p1, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v5, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, Lio/ktor/server/sse/DefaultServerSSESession$close$1;->label:I

    .line 95
    .line 96
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    if-ne p0, v1, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object v1

    .line 105
    :cond_5
    move-object p0, p1

    .line 106
    :goto_3
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 107
    .line 108
    invoke-virtual {p0, v5}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 112
    .line 113
    return-object p0

    .line 114
    :goto_4
    move-object v6, p1

    .line 115
    move-object p1, p0

    .line 116
    move-object p0, v6

    .line 117
    goto :goto_5

    .line 118
    :catchall_1
    move-exception p0

    .line 119
    goto :goto_4

    .line 120
    :goto_5
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 121
    .line 122
    invoke-virtual {p0, v5}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    throw p1
.end method
