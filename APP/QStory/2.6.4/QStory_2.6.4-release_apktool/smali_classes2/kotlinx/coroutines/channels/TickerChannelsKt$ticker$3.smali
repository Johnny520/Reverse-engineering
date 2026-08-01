.class final Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3"
    f = "TickerChannels.kt"
    l = {
        0x44,
        0x45
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $delayMillis:J

.field final synthetic $initialDelayMillis:J

.field final synthetic $mode:Lkotlinx/coroutines/channels/TickerMode;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/TickerMode;JJLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/TickerMode;",
            "JJ",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$mode:Lkotlinx/coroutines/channels/TickerMode;

    .line 2
    .line 3
    iput-wide p2, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$delayMillis:J

    .line 4
    .line 5
    iput-wide p4, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$initialDelayMillis:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
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
    new-instance v0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$mode:Lkotlinx/coroutines/channels/TickerMode;

    .line 4
    .line 5
    iget-wide v2, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$delayMillis:J

    .line 6
    .line 7
    iget-wide v4, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$initialDelayMillis:J

    .line 8
    .line 9
    move-object v6, p2

    .line 10
    invoke-direct/range {v0 .. v6}, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;-><init>(Lkotlinx/coroutines/channels/TickerMode;JJLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v5, :cond_0

    .line 15
    .line 16
    if-ne v2, v4, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$mode:Lkotlinx/coroutines/channels/TickerMode;

    .line 32
    .line 33
    sget-object v2, Lkotlinx/coroutines/channels/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    aget p1, v2, p1

    .line 40
    .line 41
    if-eq p1, v5, :cond_4

    .line 42
    .line 43
    if-ne p1, v4, :cond_3

    .line 44
    .line 45
    iget-wide v6, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$delayMillis:J

    .line 46
    .line 47
    iget-wide v8, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$initialDelayMillis:J

    .line 48
    .line 49
    move-object v10, v0

    .line 50
    check-cast v10, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;

    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iput-object v3, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v4, p0, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->label:I

    .line 58
    .line 59
    move-object v11, p0

    .line 60
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(JJLkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_5

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :cond_4
    move-object v7, p0

    .line 72
    move-object p0, v3

    .line 73
    iget-wide v2, v7, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$delayMillis:J

    .line 74
    .line 75
    move p1, v5

    .line 76
    iget-wide v4, v7, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->$initialDelayMillis:J

    .line 77
    .line 78
    move-object v6, v0

    .line 79
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iput-object p0, v7, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput p1, v7, Lkotlinx/coroutines/channels/TickerChannelsKt$ticker$3;->label:I

    .line 87
    .line 88
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰(JJLkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v1, :cond_5

    .line 93
    .line 94
    :goto_0
    return-object v1

    .line 95
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 96
    .line 97
    return-object p0
.end method
