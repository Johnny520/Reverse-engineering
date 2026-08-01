.class final Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;
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
    c = "io.ktor.client.engine.cio.Endpoint"
    f = "Endpoint.kt"
    l = {
        0x55,
        0x5c
    }
    m = "makePipelineRequest"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/engine/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    sget-object v1, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 18
    .line 19
    and-int v2, v1, v0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    iput v1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;

    .line 28
    .line 29
    invoke-direct {v0, p1, p0}, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;-><init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v0, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v3, 0x2

    .line 44
    if-eq v0, v2, :cond_2

    .line 45
    .line 46
    if-ne v0, v3, :cond_1

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    iget-object v0, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 68
    .line 69
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v1, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, p0, Lio/ktor/client/engine/cio/Endpoint$makePipelineRequest$1;->label:I

    .line 80
    .line 81
    throw v1

    .line 82
    :catchall_0
    throw v1

    .line 83
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method
