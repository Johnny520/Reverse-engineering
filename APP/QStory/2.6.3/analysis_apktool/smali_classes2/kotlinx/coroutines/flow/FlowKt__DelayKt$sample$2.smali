.class final Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;
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
        "downstream",
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
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2"
    f = "Delay.kt"
    l = {
        0x19c
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $periodMillis:J

.field final synthetic $this_sample:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$periodMillis:J

    .line 2
    .line 3
    iput-object p3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$this_sample:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

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

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;

    .line 2
    .line 3
    iget-wide v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$periodMillis:J

    .line 4
    .line 5
    iget-object p0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$this_sample:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p0, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;-><init>(JLkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$1:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 10
    .line 11
    iget v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->label:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-ne v3, v5, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$5:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$4:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 27
    .line 28
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$3:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 31
    .line 32
    iget-object v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$2:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v6

    .line 46
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$values$1;

    .line 50
    .line 51
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$this_sample:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    invoke-direct {p1, v3, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$values$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 54
    .line 55
    .line 56
    const/4 v3, -0x1

    .line 57
    invoke-static {v0, v6, v3, p1, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 62
    .line 63
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-wide v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->$periodMillis:J

    .line 67
    .line 68
    new-instance v9, Lkotlinx/coroutines/flow/FlowKt__DelayKt$fixedPeriodTicker$1;

    .line 69
    .line 70
    invoke-direct {v9, v7, v8, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$fixedPeriodTicker$1;-><init>(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v6, v4, v9, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰苏世;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v7, p1

    .line 78
    :cond_2
    :goto_0
    iget-object p1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object v8, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 81
    .line 82
    if-eq p1, v8, :cond_3

    .line 83
    .line 84
    new-instance p1, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 85
    .line 86
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-direct {p1, v8}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世兰苏()Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v9, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1;

    .line 98
    .line 99
    invoke-direct {v9, v3, v0, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v8, v9}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲世兰()Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    new-instance v9, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2;

    .line 110
    .line 111
    invoke-direct {v9, v3, v1, v6}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v8, v9}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 115
    .line 116
    .line 117
    iput-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$1:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v7, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$2:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$3:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$4:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->L$5:Ljava/lang/Object;

    .line 128
    .line 129
    iput v4, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->I$0:I

    .line 130
    .line 131
    iput v4, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->I$1:I

    .line 132
    .line 133
    iput v5, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->label:I

    .line 134
    .line 135
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v2, :cond_2

    .line 140
    .line 141
    return-object v2

    .line 142
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 143
    .line 144
    return-object p0
.end method
