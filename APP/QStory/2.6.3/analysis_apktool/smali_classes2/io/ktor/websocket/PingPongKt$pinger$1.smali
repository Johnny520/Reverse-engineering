.class final Lio/ktor/websocket/PingPongKt$pinger$1;
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
    c = "io.ktor.websocket.PingPongKt$pinger$1"
    f = "PingPong.kt"
    l = {
        0x41,
        0x4a,
        0x60
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

.field final synthetic $onTimeout:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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

.field final synthetic $periodMillis:J

.field final synthetic $timeoutMillis:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(JJL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/websocket/PingPongKt$pinger$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$periodMillis:J

    .line 2
    .line 3
    iput-wide p3, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$timeoutMillis:J

    .line 4
    .line 5
    iput-object p5, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$onTimeout:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    iput-object p6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    iput-object p7, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 9
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
    new-instance v0, Lio/ktor/websocket/PingPongKt$pinger$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$periodMillis:J

    .line 4
    .line 5
    iget-wide v3, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$timeoutMillis:J

    .line 6
    .line 7
    iget-object v5, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$onTimeout:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    iget-object v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iget-object v7, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    move-object v8, p2

    .line 14
    invoke-direct/range {v0 .. v8}, Lio/ktor/websocket/PingPongKt$pinger$1;-><init>(JJL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/websocket/PingPongKt$pinger$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/websocket/PingPongKt$pinger$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/websocket/PingPongKt$pinger$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/websocket/PingPongKt$pinger$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    if-eq v1, v4, :cond_2

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v5

    .line 28
    :cond_1
    iget-object v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$1:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, [B

    .line 31
    .line 32
    iget-object v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Lkotlin/random/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_1 .. :try_end_1} :catch_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    iget-object v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, [B

    .line 44
    .line 45
    iget-object v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Lkotlin/random/飘花落叶言子楪世兰苏哲;

    .line 48
    .line 49
    :try_start_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v6, "Starting WebSocket pinger coroutine with period "

    .line 61
    .line 62
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-wide v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$periodMillis:J

    .line 66
    .line 67
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v6, " ms and timeout "

    .line 71
    .line 72
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-wide v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$timeoutMillis:J

    .line 76
    .line 77
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v6, " ms"

    .line 81
    .line 82
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {p1, v1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    new-instance p1, Lkotlin/random/XorWowRandom;

    .line 99
    .line 100
    long-to-int v1, v6

    .line 101
    const/16 v8, 0x20

    .line 102
    .line 103
    shr-long/2addr v6, v8

    .line 104
    long-to-int v6, v6

    .line 105
    invoke-direct {p1, v1, v6}, Lkotlin/random/XorWowRandom;-><init>(II)V

    .line 106
    .line 107
    .line 108
    new-array v1, v8, [B

    .line 109
    .line 110
    :goto_0
    :try_start_3
    iget-wide v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$periodMillis:J

    .line 111
    .line 112
    new-instance v8, Lio/ktor/websocket/PingPongKt$pinger$1$1;

    .line 113
    .line 114
    iget-object v9, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 115
    .line 116
    invoke-direct {v8, v9, v5}, Lio/ktor/websocket/PingPongKt$pinger$1$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput v4, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->label:I

    .line 124
    .line 125
    invoke-static {v6, v7, v8, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-ne v6, v0, :cond_4

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    move-object v6, p1

    .line 133
    :goto_1
    invoke-virtual {v6, v1}, Lkotlin/random/飘花落叶言子楪世兰苏哲;->nextBytes([B)[B

    .line 134
    .line 135
    .line 136
    new-instance p1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v7, "[ping "

    .line 142
    .line 143
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-static {v1}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰([B)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v7, " ping]"

    .line 154
    .line 155
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget-wide v7, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$timeoutMillis:J

    .line 163
    .line 164
    new-instance v9, Lio/ktor/websocket/PingPongKt$pinger$1$rc$1;

    .line 165
    .line 166
    iget-object v10, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$outgoing:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 167
    .line 168
    iget-object v11, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 169
    .line 170
    invoke-direct {v9, v10, p1, v11, v5}, Lio/ktor/websocket/PingPongKt$pinger$1$rc$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Ljava/lang/String;Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 171
    .line 172
    .line 173
    iput-object v6, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$1:Ljava/lang/Object;

    .line 176
    .line 177
    iput v3, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->label:I

    .line 178
    .line 179
    invoke-static {v7, v8, v9, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-ne p1, v0, :cond_5

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    :goto_2
    check-cast p1, Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 187
    .line 188
    if-nez p1, :cond_6

    .line 189
    .line 190
    sget-object p1, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 191
    .line 192
    const-string v1, "WebSocket pinger has timed out"

    .line 193
    .line 194
    invoke-interface {p1, v1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->$onTimeout:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 198
    .line 199
    new-instance v1, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 200
    .line 201
    sget-object v3, Lio/ktor/websocket/CloseReason$Codes;->INTERNAL_ERROR:Lio/ktor/websocket/CloseReason$Codes;

    .line 202
    .line 203
    const-string v4, "Ping timeout"

    .line 204
    .line 205
    invoke-direct {v1, v3, v4}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    iput-object v5, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$0:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v5, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->L$1:Ljava/lang/Object;

    .line 211
    .line 212
    iput v2, p0, Lio/ktor/websocket/PingPongKt$pinger$1;->label:I

    .line 213
    .line 214
    invoke-interface {p1, v1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_3 .. :try_end_3} :catch_0

    .line 218
    if-ne p0, v0, :cond_7

    .line 219
    .line 220
    :goto_3
    return-object v0

    .line 221
    :cond_6
    move-object p1, v6

    .line 222
    goto :goto_0

    .line 223
    :catch_0
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 224
    .line 225
    return-object p0
.end method
