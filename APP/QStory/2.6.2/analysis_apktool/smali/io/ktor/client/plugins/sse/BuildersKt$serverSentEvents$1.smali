.class final Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.sse.BuildersKt"
    f = "builders.kt"
    l = {
        0x69,
        0x6b
    }
    m = "serverSentEvents-mY9Nd3A"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 9
    .line 10
    sget-object v2, Lio/ktor/client/plugins/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    iput v0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 14
    .line 15
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-eq v0, v3, :cond_1

    .line 23
    .line 24
    if-eq v0, v4, :cond_0

    .line 25
    .line 26
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    iget-object p0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput-object v2, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    iput v4, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 56
    .line 57
    invoke-interface {v0, v2, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    if-ne p0, v1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_2
    :goto_0
    invoke-static {v2, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 65
    .line 66
    .line 67
    throw v2

    .line 68
    :catchall_0
    :try_start_2
    throw v2

    .line 69
    :goto_1
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    :catchall_1
    invoke-static {v2, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 71
    .line 72
    .line 73
    throw v2

    .line 74
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 80
    .line 81
    sget-object p0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    sget p0, Lio/ktor/client/plugins/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 84
    .line 85
    throw v2
.end method
