.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt"
    f = "Deprecated.kt"
    l = {
        0x53
    }
    m = "elementAtOrNull"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;",
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
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-ne v1, v3, :cond_4

    .line 35
    .line 36
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$3:I

    .line 37
    .line 38
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$2:I

    .line 39
    .line 40
    iget v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$1:I

    .line 41
    .line 42
    iget v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$0:I

    .line 43
    .line 44
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$3:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 47
    .line 48
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 51
    .line 52
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 55
    .line 56
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 59
    .line 60
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 72
    .line 73
    invoke-virtual {v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    add-int/lit8 v9, v1, 0x1

    .line 78
    .line 79
    if-ne v6, v1, :cond_1

    .line 80
    .line 81
    invoke-interface {v8, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_1
    :try_start_1
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$2:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->L$3:Ljava/lang/Object;

    .line 92
    .line 93
    iput v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$0:I

    .line 94
    .line 95
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$1:I

    .line 96
    .line 97
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$2:I

    .line 98
    .line 99
    iput v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->I$3:I

    .line 100
    .line 101
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAtOrNull$1;->label:I

    .line 102
    .line 103
    invoke-virtual {v7, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    if-ne p1, v0, :cond_2

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_2
    move v1, v9

    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    move-object v2, v8

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-interface {v8, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 120
    .line 121
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 131
    :catchall_2
    move-exception p1

    .line 132
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw p1
.end method
