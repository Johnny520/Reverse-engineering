.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;
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
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt"
    f = "Deprecated.kt"
    l = {
        0xa6,
        0xa9
    }
    m = "single"
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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;",
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
    .locals 8

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->label:I

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
    iget-object v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 44
    .line 45
    iget-object v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 48
    .line 49
    iget-object v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 52
    .line 53
    iget-object p0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    move-object v2, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_2
    iget v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->I$1:I

    .line 71
    .line 72
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->I$0:I

    .line 73
    .line 74
    iget-object v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$3:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 77
    .line 78
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 81
    .line 82
    iget-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 85
    .line 86
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 89
    .line 90
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    check-cast v5, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 102
    .line 103
    invoke-virtual {v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$2:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->L$4:Ljava/lang/Object;

    .line 116
    .line 117
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->I$0:I

    .line 118
    .line 119
    iput v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->I$1:I

    .line 120
    .line 121
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$single$1;->label:I

    .line 122
    .line 123
    invoke-virtual {v5, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    if-ne p0, v0, :cond_3

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_3
    move-object v0, p1

    .line 131
    move-object v1, v6

    .line 132
    move-object p1, p0

    .line 133
    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    if-nez p0, :cond_4

    .line 140
    .line 141
    invoke-interface {v1, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_4
    :try_start_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 146
    .line 147
    const-string p1, "ReceiveChannel has more than one element."

    .line 148
    .line 149
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    move-object v2, v6

    .line 155
    goto :goto_2

    .line 156
    :cond_5
    :try_start_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 157
    .line 158
    const-string p1, "ReceiveChannel is empty."

    .line 159
    .line 160
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 164
    :cond_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 168
    :catchall_2
    move-exception p0

    .line 169
    :goto_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 170
    :catchall_3
    move-exception p1

    .line 171
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw p1
.end method
