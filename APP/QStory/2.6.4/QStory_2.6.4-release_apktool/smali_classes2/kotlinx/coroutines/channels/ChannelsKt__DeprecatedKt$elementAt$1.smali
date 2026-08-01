.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;
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
        0x44
    }
    m = "elementAt"
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
            "Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;",
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
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->label:I

    .line 9
    .line 10
    const-string v1, "ReceiveChannel doesn\'t contain element at index "

    .line 11
    .line 12
    and-int v2, p1, v0

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr p1, v0

    .line 17
    iput p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    iget v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->label:I

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-ne v2, v4, :cond_4

    .line 37
    .line 38
    iget v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$3:I

    .line 39
    .line 40
    iget v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$2:I

    .line 41
    .line 42
    iget v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$1:I

    .line 43
    .line 44
    iget v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$0:I

    .line 45
    .line 46
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 49
    .line 50
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 53
    .line 54
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 57
    .line 58
    iget-object v10, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v10, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 74
    .line 75
    invoke-virtual {v8}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    add-int/lit8 v10, v2, 0x1

    .line 80
    .line 81
    if-ne v7, v2, :cond_1

    .line 82
    .line 83
    invoke-interface {v9, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_1
    :try_start_1
    iput-object v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$1:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->L$3:Ljava/lang/Object;

    .line 94
    .line 95
    iput v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$0:I

    .line 96
    .line 97
    iput v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$1:I

    .line 98
    .line 99
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$2:I

    .line 100
    .line 101
    iput v10, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->I$3:I

    .line 102
    .line 103
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$elementAt$1;->label:I

    .line 104
    .line 105
    invoke-virtual {v8, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_2

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_2
    move v2, v10

    .line 113
    goto :goto_1

    .line 114
    :catchall_0
    move-exception p0

    .line 115
    move-object v3, v9

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 118
    .line 119
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const/16 v0, 0x2e

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 144
    .line 145
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v3

    .line 149
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    :catchall_2
    move-exception p1

    .line 156
    invoke-static {v3, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw p1
.end method
