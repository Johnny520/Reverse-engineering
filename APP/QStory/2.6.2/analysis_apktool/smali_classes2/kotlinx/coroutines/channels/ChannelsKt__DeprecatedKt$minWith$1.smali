.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;
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
        0x1d0,
        0x1d2
    }
    m = "minWith"
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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;",
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
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_7

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
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$1:I

    .line 40
    .line 41
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$0:I

    .line 42
    .line 43
    iget-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$5:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$4:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$3:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 52
    .line 53
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Ljava/util/Comparator;

    .line 60
    .line 61
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 64
    .line 65
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    move-object v2, v7

    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_2
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$1:I

    .line 80
    .line 81
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$0:I

    .line 82
    .line 83
    iget-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$4:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 86
    .line 87
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$3:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 90
    .line 91
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 94
    .line 95
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, Ljava/util/Comparator;

    .line 98
    .line 99
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 102
    .line 103
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    check-cast p1, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    if-nez p1, :cond_3

    .line 113
    .line 114
    invoke-interface {v6, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_3
    :try_start_2
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 119
    .line 120
    invoke-virtual {v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    move-object v8, v7

    .line 125
    move-object v7, v6

    .line 126
    move-object v6, v5

    .line 127
    :goto_1
    move-object v5, p1

    .line 128
    :cond_4
    :try_start_3
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$2:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$3:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$4:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->L$5:Ljava/lang/Object;

    .line 139
    .line 140
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$0:I

    .line 141
    .line 142
    iput v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->I$1:I

    .line 143
    .line 144
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$minWith$1;->label:I

    .line 145
    .line 146
    invoke-virtual {v6, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_5

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 162
    .line 163
    invoke-virtual {v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {v8, v5, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    if-lez v9, :cond_4

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_6
    invoke-interface {v7, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 175
    .line 176
    .line 177
    return-object v5

    .line 178
    :goto_3
    move-object v2, v6

    .line 179
    goto :goto_4

    .line 180
    :catchall_1
    move-exception p0

    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 186
    :catchall_2
    move-exception p0

    .line 187
    :goto_4
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 188
    :catchall_3
    move-exception p1

    .line 189
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw p1
.end method
