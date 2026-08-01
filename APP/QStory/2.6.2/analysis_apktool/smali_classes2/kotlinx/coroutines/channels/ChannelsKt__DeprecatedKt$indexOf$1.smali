.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
        0x29b
    }
    m = "indexOf"
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

.field L$6:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;",
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
    .locals 11

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->label:I

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
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$2:I

    .line 37
    .line 38
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$1:I

    .line 39
    .line 40
    iget v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$0:I

    .line 41
    .line 42
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$6:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 45
    .line 46
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$5:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 49
    .line 50
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$4:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 53
    .line 54
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$3:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 57
    .line 58
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, Lkotlin/jvm/internal/Ref$IntRef;

    .line 61
    .line 62
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v10, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v10, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 67
    .line 68
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 80
    .line 81
    invoke-virtual {v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v9, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    iget p0, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 92
    .line 93
    new-instance p1, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :goto_1
    move-object v2, v7

    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception p0

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    :try_start_1
    iget p1, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 107
    .line 108
    add-int/2addr p1, v3

    .line 109
    iput p1, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 110
    .line 111
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$2:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$3:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$4:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$5:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->L$6:Ljava/lang/Object;

    .line 124
    .line 125
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$0:I

    .line 126
    .line 127
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$1:I

    .line 128
    .line 129
    iput v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->I$2:I

    .line 130
    .line 131
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$indexOf$1;->label:I

    .line 132
    .line 133
    invoke-virtual {v6, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    if-ne p1, v0, :cond_1

    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_3
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 141
    .line 142
    .line 143
    new-instance p0, Ljava/lang/Integer;

    .line 144
    .line 145
    const/4 p1, -0x1

    .line 146
    invoke-direct {p0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 151
    .line 152
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v2

    .line 156
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance p0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 160
    .line 161
    invoke-direct {p0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 162
    .line 163
    .line 164
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 165
    :catchall_1
    move-exception p0

    .line 166
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 167
    :catchall_2
    move-exception p1

    .line 168
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    throw p1
.end method
