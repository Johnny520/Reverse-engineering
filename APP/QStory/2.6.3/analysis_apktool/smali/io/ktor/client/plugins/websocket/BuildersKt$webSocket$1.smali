.class final Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.websocket.BuildersKt"
    f = "builders.kt"
    l = {
        0xf2,
        0xf5,
        0x65,
        0x67,
        0x67,
        0x108,
        0x108
    }
    m = "webSocket"
.end annotation


# instance fields
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
            "Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;",
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
    iput-object p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->label:I

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
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    iget-object p0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Throwable;

    .line 26
    .line 27
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    throw p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :pswitch_1
    iget-object p0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Throwable;

    .line 44
    .line 45
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_0
    :try_start_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :pswitch_3
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    :cond_3
    :try_start_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_5
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :pswitch_4
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 105
    .line 106
    if-nez v0, :cond_a

    .line 107
    .line 108
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    if-nez v0, :cond_9

    .line 111
    .line 112
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    if-nez v0, :cond_8

    .line 115
    .line 116
    :try_start_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 117
    .line 118
    .line 119
    :try_start_5
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 124
    .line 125
    const/4 p1, 0x4

    .line 126
    iput p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->label:I

    .line 127
    .line 128
    invoke-static {v2, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_6

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_6
    :goto_0
    throw v2

    .line 136
    :catchall_1
    move-exception p1

    .line 137
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$3:Ljava/lang/Object;

    .line 144
    .line 145
    const/4 p1, 0x5

    .line 146
    iput p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->label:I

    .line 147
    .line 148
    invoke-static {v2, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v1, :cond_7

    .line 153
    .line 154
    :goto_1
    return-object v1

    .line 155
    :cond_7
    :goto_2
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 156
    :cond_8
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 157
    .line 158
    .line 159
    return-object v2

    .line 160
    :cond_9
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 161
    .line 162
    .line 163
    return-object v2

    .line 164
    :cond_a
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 165
    .line 166
    .line 167
    return-object v2

    .line 168
    :pswitch_5
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 169
    .line 170
    if-nez v0, :cond_d

    .line 171
    .line 172
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 173
    .line 174
    if-nez v0, :cond_c

    .line 175
    .line 176
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 179
    .line 180
    :try_start_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    if-eqz p1, :cond_b

    .line 184
    .line 185
    new-instance p1, Ljava/lang/ClassCastException;

    .line 186
    .line 187
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    .line 192
    .line 193
    const-string v0, "null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession"

    .line 194
    .line 195
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 199
    :cond_c
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 200
    .line 201
    .line 202
    return-object v2

    .line 203
    :cond_d
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 204
    .line 205
    .line 206
    return-object v2

    .line 207
    :pswitch_6
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    if-nez v0, :cond_f

    .line 210
    .line 211
    iget-object v0, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 214
    .line 215
    :try_start_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 216
    .line 217
    .line 218
    if-nez p1, :cond_e

    .line 219
    .line 220
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 221
    :goto_3
    :try_start_9
    iput-object p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$0:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$1:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$2:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v2, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->L$3:Ljava/lang/Object;

    .line 228
    .line 229
    const/4 p1, 0x7

    .line 230
    iput p1, p0, Lio/ktor/client/plugins/websocket/BuildersKt$webSocket$1;->label:I
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_0

    .line 231
    .line 232
    throw v2

    .line 233
    :cond_e
    :try_start_a
    new-instance p0, Ljava/lang/ClassCastException;

    .line 234
    .line 235
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 236
    .line 237
    .line 238
    throw p0
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_0

    .line 239
    :catch_0
    move-exception p0

    .line 240
    invoke-static {p0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏兰哲楪(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    throw p0

    .line 245
    :cond_f
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 246
    .line 247
    .line 248
    return-object v2

    .line 249
    :pswitch_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    sget p0, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 253
    .line 254
    sget p0, Lio/ktor/client/plugins/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 255
    .line 256
    throw v2

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
