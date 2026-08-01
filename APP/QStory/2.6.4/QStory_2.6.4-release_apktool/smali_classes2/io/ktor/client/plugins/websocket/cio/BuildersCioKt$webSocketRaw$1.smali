.class final Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt"
    f = "buildersCio.kt"
    l = {
        0x3f,
        0x47,
        0x4b,
        0x49,
        0x4b,
        0x4b
    }
    m = "webSocketRaw"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
            "Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;",
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
    .locals 3

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    iget-object p0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :pswitch_1
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_4

    .line 42
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :pswitch_3
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :pswitch_4
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    if-nez p1, :cond_6

    .line 72
    .line 73
    :try_start_2
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    const/4 p1, 0x2

    .line 76
    iput p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 77
    .line 78
    invoke-interface {v0, v2, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    if-ne p1, v1, :cond_2

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_2
    :goto_0
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    const/4 p1, 0x3

    .line 88
    iput p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 89
    .line 90
    invoke-static {v2, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v1, :cond_4

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :goto_1
    :try_start_3
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    const/4 v0, 0x4

    .line 100
    iput v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 101
    .line 102
    invoke-static {v2, p1, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    if-ne p1, v1, :cond_3

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_3
    :goto_2
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    const/4 p1, 0x5

    .line 112
    iput p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 113
    .line 114
    invoke-static {v2, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, v1, :cond_4

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_4
    :goto_3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :goto_4
    iput-object p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    const/4 v0, 0x6

    .line 127
    iput v0, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 128
    .line 129
    invoke-static {v2, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v1, :cond_5

    .line 134
    .line 135
    :goto_5
    return-object v1

    .line 136
    :cond_5
    move-object p0, p1

    .line 137
    :goto_6
    throw p0

    .line 138
    :cond_6
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 139
    .line 140
    .line 141
    return-object v2

    .line 142
    :pswitch_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->L$0:Ljava/lang/Object;

    .line 146
    .line 147
    const/4 p1, 0x1

    .line 148
    iput p1, p0, Lio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRaw$1;->label:I

    .line 149
    .line 150
    new-instance p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;

    .line 151
    .line 152
    invoke-direct {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;-><init>()V

    .line 153
    .line 154
    .line 155
    sget-object p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 156
    .line 157
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;

    .line 158
    .line 159
    invoke-direct {p0}, Lio/ktor/util/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲()Lkotlinx/coroutines/飘花落叶言子哲世楪苏兰;

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Z)Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
