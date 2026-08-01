.class final Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;
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
    c = "io.ktor.network.sockets.DatagramSendChannel"
    f = "DatagramSendChannel.kt"
    l = {
        0x88
    }
    m = "sendSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->this$0:Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;

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
    .locals 3

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->this$0:Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;

    .line 11
    .line 12
    sget-object v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->label:I

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
    iput v1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->label:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;

    .line 28
    .line 29
    invoke-direct {v0, p1, p0}, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    iget-object p1, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v0, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->label:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    if-eq v0, v2, :cond_1

    .line 44
    .line 45
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    iget-object v0, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 56
    .line 57
    iget-object v2, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    iget-object p0, p0, Lio/ktor/network/sockets/DatagramSendChannel$sendSuspend$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 79
    .line 80
    throw v1
.end method
