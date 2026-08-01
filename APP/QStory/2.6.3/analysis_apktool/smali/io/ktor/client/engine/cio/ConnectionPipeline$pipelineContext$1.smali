.class final Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1"
    f = "ConnectionPipeline.kt"
    l = {
        0x2c,
        0x31,
        0x32,
        0x38,
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $keepAliveTime:J

.field final synthetic $overProxy:Z

.field final synthetic $tasks:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(JLio/ktor/client/engine/cio/飘花落叶言子楪世哲苏兰;ZLkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lio/ktor/client/engine/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            "Z",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$keepAliveTime:J

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iput-boolean p4, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$overProxy:Z

    .line 6
    .line 7
    iput-object p5, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$tasks:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$keepAliveTime:J

    .line 4
    .line 5
    iget-object v3, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    iget-boolean v4, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$overProxy:Z

    .line 8
    .line 9
    iget-object v5, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$tasks:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;-><init>(JLio/ktor/client/engine/cio/飘花落叶言子楪世哲苏兰;ZLkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    if-eq v1, v2, :cond_4

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    if-eq v1, v4, :cond_3

    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    if-eq v1, v4, :cond_2

    .line 16
    .line 17
    const/4 v4, 0x4

    .line 18
    if-eq v1, v4, :cond_1

    .line 19
    .line 20
    const/4 v4, 0x5

    .line 21
    if-ne v1, v4, :cond_0

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    :cond_2
    iget-object p0, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :try_start_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 47
    :cond_3
    iget-object p0, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 56
    :cond_4
    :try_start_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    :try_start_7
    iget-wide v4, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$keepAliveTime:J

    .line 64
    .line 65
    new-instance p1, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1$task$1;

    .line 66
    .line 67
    iget-object v1, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->$tasks:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    invoke-direct {p1, v1, v3}, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1$task$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 70
    .line 71
    .line 72
    iput v2, p0, Lio/ktor/client/engine/cio/ConnectionPipeline$pipelineContext$1;->label:I

    .line 73
    .line 74
    invoke-static {v4, v5, p1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_6

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_6
    :goto_1
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 88
    :catchall_0
    :try_start_9
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 89
    :catchall_1
    throw v3

    .line 90
    :catch_0
    throw v3

    .line 91
    :catch_1
    throw v3

    .line 92
    :catch_2
    throw v3
.end method
