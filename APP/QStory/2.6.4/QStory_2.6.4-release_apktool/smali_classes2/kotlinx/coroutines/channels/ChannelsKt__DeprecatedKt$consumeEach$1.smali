.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt"
    f = "Deprecated.kt"
    l = {
        0x29
    }
    m = "consumeEach"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;",
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
    .locals 10

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v0, v3, :cond_4

    .line 18
    .line 19
    iget v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$2:I

    .line 20
    .line 21
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$1:I

    .line 22
    .line 23
    iget v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$0:I

    .line 24
    .line 25
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$5:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 28
    .line 29
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$4:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 32
    .line 33
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$3:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 36
    .line 37
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    if-nez v8, :cond_3

    .line 40
    .line 41
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v8, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    if-nez v9, :cond_2

    .line 48
    .line 49
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 61
    .line 62
    invoke-virtual {v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {v8, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$2:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$3:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$4:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->L$5:Ljava/lang/Object;

    .line 80
    .line 81
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$0:I

    .line 82
    .line 83
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$1:I

    .line 84
    .line 85
    iput v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->I$2:I

    .line 86
    .line 87
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1;->label:I

    .line 88
    .line 89
    invoke-virtual {v6, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    if-ne p1, v1, :cond_0

    .line 94
    .line 95
    return-object v1

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 102
    .line 103
    return-object p0

    .line 104
    :goto_0
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 109
    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_3
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 113
    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 117
    .line 118
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    throw v2
.end method
