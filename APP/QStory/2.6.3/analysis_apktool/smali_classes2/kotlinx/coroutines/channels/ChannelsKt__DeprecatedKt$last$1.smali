.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;
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
        0x7f,
        0x82
    }
    m = "last"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;",
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
    .locals 9

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v1, v4, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$1:I

    .line 40
    .line 41
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$0:I

    .line 42
    .line 43
    iget-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$4:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 52
    .line 53
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    move-object v2, v7

    .line 67
    goto :goto_4

    .line 68
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_2
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$1:I

    .line 75
    .line 76
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$0:I

    .line 77
    .line 78
    iget-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$3:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 81
    .line 82
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 85
    .line 86
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 89
    .line 90
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 93
    .line 94
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 106
    .line 107
    invoke-virtual {v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    move-object v7, v6

    .line 112
    move-object v6, v5

    .line 113
    move-object v5, p1

    .line 114
    :goto_1
    :try_start_2
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->L$4:Ljava/lang/Object;

    .line 123
    .line 124
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$0:I

    .line 125
    .line 126
    iput v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->I$1:I

    .line 127
    .line 128
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$last$1;->label:I

    .line 129
    .line 130
    invoke-virtual {v6, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v0, :cond_3

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_3
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 146
    .line 147
    invoke-virtual {v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    goto :goto_1

    .line 152
    :cond_4
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 153
    .line 154
    .line 155
    return-object v5

    .line 156
    :goto_3
    move-object v2, v6

    .line 157
    goto :goto_4

    .line 158
    :cond_5
    :try_start_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 159
    .line 160
    const-string p1, "ReceiveChannel is empty."

    .line 161
    .line 162
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 166
    :catchall_1
    move-exception p0

    .line 167
    goto :goto_3

    .line 168
    :cond_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 172
    :catchall_2
    move-exception p0

    .line 173
    :goto_4
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 174
    :catchall_3
    move-exception p1

    .line 175
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method
