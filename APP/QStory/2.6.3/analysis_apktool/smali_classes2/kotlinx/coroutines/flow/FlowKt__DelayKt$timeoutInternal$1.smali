.class final Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "downStream",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1"
    f = "Delay.kt"
    l = {
        0x19d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $$v$c$kotlin-time-Duration$-timeout$0:J

.field final synthetic $this_timeoutInternal:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field I$2:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(JLkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$$v$c$kotlin-time-Duration$-timeout$0:J

    .line 2
    .line 3
    iput-object p3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$this_timeoutInternal:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$$v$c$kotlin-time-Duration$-timeout$0:J

    .line 4
    .line 5
    iget-object p0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$this_timeoutInternal:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p0, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;-><init>(JLkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$1:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 10
    .line 11
    iget v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->label:I

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->I$0:I

    .line 21
    .line 22
    iget-wide v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->J$0:J

    .line 23
    .line 24
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$3:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 27
    .line 28
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$2:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v6

    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-wide v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$$v$c$kotlin-time-Duration$-timeout$0:J

    .line 46
    .line 47
    const-wide/16 v9, 0x0

    .line 48
    .line 49
    invoke-static {v7, v8, v9, v10}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(JJ)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-lez p1, :cond_6

    .line 54
    .line 55
    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$this_timeoutInternal:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 56
    .line 57
    invoke-static {p1}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    instance-of v3, p1, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move-object v3, p1

    .line 66
    check-cast v3, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v3, v6

    .line 70
    :goto_0
    if-nez v3, :cond_3

    .line 71
    .line 72
    new-instance v3, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世哲兰;

    .line 73
    .line 74
    const/16 v7, 0xe

    .line 75
    .line 76
    invoke-direct {v3, p1, v5, v6, v7}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世哲兰;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;ILkotlinx/coroutines/channels/BufferOverflow;I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v3, v0}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-wide v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->$$v$c$kotlin-time-Duration$-timeout$0:J

    .line 84
    .line 85
    move-object v3, p1

    .line 86
    move v0, v5

    .line 87
    :cond_4
    new-instance p1, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 88
    .line 89
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-direct {p1, v9}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世兰苏()Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    new-instance v10, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1;

    .line 101
    .line 102
    invoke-direct {v10, v1, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v9, v10}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 106
    .line 107
    .line 108
    new-instance v9, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$2;

    .line 109
    .line 110
    invoke-direct {v9, v7, v8, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$2;-><init>(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v7, v8}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰楪哲(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v10

    .line 117
    invoke-static {p1, v10, v11, v9}, Lkotlinx/coroutines/selects/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 118
    .line 119
    .line 120
    iput-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->L$3:Ljava/lang/Object;

    .line 127
    .line 128
    iput-wide v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->J$0:J

    .line 129
    .line 130
    iput v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->I$0:I

    .line 131
    .line 132
    iput v5, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->I$1:I

    .line 133
    .line 134
    iput v5, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->I$2:I

    .line 135
    .line 136
    iput v4, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1;->label:I

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v2, :cond_5

    .line 143
    .line 144
    return-object v2

    .line 145
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_4

    .line 152
    .line 153
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_6
    new-instance p0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 157
    .line 158
    const-string p1, "Timed out immediately"

    .line 159
    .line 160
    invoke-direct {p0, p1}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0
.end method
