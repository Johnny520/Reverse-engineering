.class final Lio/ktor/websocket/PingPongKt$ponger$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.websocket.PingPongKt$ponger$1"
    f = "PingPong.kt"
    l = {
        0x75,
        0x20
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
        }
    .end annotation
.end field

.field final synthetic $outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/websocket/PingPongKt$ponger$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
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
    new-instance p1, Lio/ktor/websocket/PingPongKt$ponger$1;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lio/ktor/websocket/PingPongKt$ponger$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/websocket/PingPongKt$ponger$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/websocket/PingPongKt$ponger$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/websocket/PingPongKt$ponger$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/websocket/PingPongKt$ponger$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    if-eq v1, v4, :cond_2

    .line 11
    .line 12
    if-ne v1, v3, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$2:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 17
    .line 18
    iget-object v5, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$1:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 21
    .line 22
    iget-object v6, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    move-object p1, v6

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_3

    .line 33
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    iget-object v1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 42
    .line 43
    iget-object v5, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 46
    .line 47
    iget-object v6, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 50
    .line 51
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_2
    iget-object v5, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    iget-object p1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;
    :try_end_2
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    .line 62
    :try_start_3
    invoke-interface {v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->iterator()Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_0
    iput-object p1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v5, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->label:I

    .line 73
    .line 74
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-ne v6, v0, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v9, v6

    .line 84
    move-object v6, p1

    .line 85
    move-object p1, v9

    .line 86
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 95
    .line 96
    invoke-virtual {v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;

    .line 101
    .line 102
    sget-object v7, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 103
    .line 104
    const-string v8, "Received ping message, sending pong message"

    .line 105
    .line 106
    invoke-interface {v7, v8}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v7, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;

    .line 110
    .line 111
    iget-object p1, p1, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 112
    .line 113
    sget-object v8, Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;

    .line 114
    .line 115
    invoke-direct {v7, p1, v8}, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;-><init>([BLkotlinx/coroutines/飘花落叶言子世哲兰楪苏;)V

    .line 116
    .line 117
    .line 118
    iput-object v6, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v5, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    iput v3, p0, Lio/ktor/websocket/PingPongKt$ponger$1;->label:I

    .line 125
    .line 126
    invoke-interface {v6, v7, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    if-ne p1, v0, :cond_0

    .line 131
    .line 132
    :goto_2
    return-object v0

    .line 133
    :cond_5
    :try_start_4
    invoke-interface {v5, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V
    :try_end_4
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_4 .. :try_end_4} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 138
    :catchall_1
    move-exception p1

    .line 139
    :try_start_6
    invoke-static {v5, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p1
    :try_end_6
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_6 .. :try_end_6} :catch_0

    .line 143
    :catch_0
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 144
    .line 145
    return-object p0
.end method
