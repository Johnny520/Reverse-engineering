.class final Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
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
    if-eqz v0, :cond_5

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-eq v0, v3, :cond_2

    .line 23
    .line 24
    if-ne v0, v4, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_2
    iget-object v0, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    :try_start_1
    iput-object v2, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v4, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 58
    .line 59
    invoke-interface {v0, v2, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_0
    invoke-static {v2, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 67
    .line 68
    .line 69
    throw v2

    .line 70
    :catchall_0
    :try_start_2
    throw v2

    .line 71
    :goto_1
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    :catchall_1
    invoke-static {v2, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 73
    .line 74
    .line 75
    throw v2

    .line 76
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput v3, p0, Lio/ktor/client/plugins/sse/BuildersKt$serverSentEvents$1;->label:I

    .line 86
    .line 87
    sget-object p0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 88
    .line 89
    sget p0, Lio/ktor/client/plugins/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 90
    .line 91
    throw v2
.end method
