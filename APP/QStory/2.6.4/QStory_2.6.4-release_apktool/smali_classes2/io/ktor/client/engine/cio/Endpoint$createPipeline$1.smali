.class final Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;
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
    c = "io.ktor.client.engine.cio.Endpoint"
    f = "Endpoint.kt"
    l = {
        0xb7
    }
    m = "createPipeline"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
            "Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

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
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    sget-object v1, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

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
    iput v1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;

    .line 28
    .line 29
    invoke-direct {v0, p1, p0}, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;-><init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    iget-object v0, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v2, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    if-eq v2, v4, :cond_1

    .line 44
    .line 45
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_1
    iget-object p0, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    move-object p1, p0

    .line 54
    check-cast p1, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v4, p0, Lio/ktor/client/engine/cio/Endpoint$createPipeline$1;->label:I

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/io/Serializable;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-ne v0, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast v0, Lkotlin/Pair;

    .line 75
    .line 76
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 81
    .line 82
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    throw v3
.end method
