.class final Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;
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
    c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt"
    f = "Channels.common.kt"
    l = {
        0x115
    }
    m = "toList"
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

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;",
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
    .locals 12

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v0, v3, :cond_2

    .line 18
    .line 19
    iget v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$3:I

    .line 20
    .line 21
    iget v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$2:I

    .line 22
    .line 23
    iget v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$1:I

    .line 24
    .line 25
    iget v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$0:I

    .line 26
    .line 27
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$7:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 30
    .line 31
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$6:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 34
    .line 35
    iget-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$5:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 38
    .line 39
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v9, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;

    .line 42
    .line 43
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v9, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 46
    .line 47
    iget-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v9, Ljava/util/List;

    .line 50
    .line 51
    iget-object v10, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/util/List;

    .line 54
    .line 55
    iget-object v11, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v11, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 58
    .line 59
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 71
    .line 72
    invoke-virtual {v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {v9, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v10, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$1:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v9, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$2:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$3:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$4:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v8, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$5:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$6:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->L$7:Ljava/lang/Object;

    .line 94
    .line 95
    iput v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$0:I

    .line 96
    .line 97
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$1:I

    .line 98
    .line 99
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$2:I

    .line 100
    .line 101
    iput v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->I$3:I

    .line 102
    .line 103
    iput v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$toList$1;->label:I

    .line 104
    .line 105
    invoke-virtual {v7, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    if-ne p1, v1, :cond_0

    .line 110
    .line 111
    return-object v1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    move-object v2, v8

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    invoke-interface {v8, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast v10, Lkotlin/collections/builders/ListBuilder;

    .line 122
    .line 123
    invoke-virtual {v10}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 129
    .line 130
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v2

    .line 134
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lkotlin/collections/builders/ListBuilder;

    .line 138
    .line 139
    .line 140
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    :goto_0
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 143
    :catchall_2
    move-exception p1

    .line 144
    invoke-static {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method
