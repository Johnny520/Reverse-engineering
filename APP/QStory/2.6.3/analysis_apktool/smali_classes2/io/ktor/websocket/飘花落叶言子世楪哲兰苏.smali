.class public final Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪兰世苏哲:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ZL飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 11
    .line 12
    iput-object p2, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    iput-boolean p3, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 15
    .line 16
    iput-object p4, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    const/4 p1, 0x6

    .line 19
    const/16 p2, 0x8

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-static {p2, p1, p3}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 27
    .line 28
    new-instance p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 34
    .line 35
    const/16 p4, 0x400

    .line 36
    .line 37
    invoke-direct {p2, p4}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 43
    .line 44
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 45
    .line 46
    const-string p2, "ws-writer"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->ATOMIC:Lkotlinx/coroutines/CoroutineStart;

    .line 52
    .line 53
    new-instance p4, Lio/ktor/websocket/WebSocketWriter$writeLoopJob$1;

    .line 54
    .line 55
    invoke-direct {p4, p0, p3}, Lio/ktor/websocket/WebSocketWriter$writeLoopJob$1;-><init>(Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1, p2, p4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 63
    .line 64
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;-><init>(Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 33
    .line 34
    const-string v3, "unknown message "

    .line 35
    .line 36
    const-string v4, "WebSocket closed."

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v6

    .line 49
    :pswitch_0
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Ljava/lang/Throwable;

    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_c

    .line 57
    .line 58
    :pswitch_1
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 61
    .line 62
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :pswitch_2
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 70
    .line 71
    iget-object p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    iget-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 78
    .line 79
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :cond_1
    move-object v8, v2

    .line 83
    move-object v2, p0

    .line 84
    move-object p0, v8

    .line 85
    goto :goto_3

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :catch_0
    move-exception p0

    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :pswitch_3
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 95
    .line 96
    iget-object p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    iget-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 103
    .line 104
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :pswitch_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 112
    .line 113
    .line 114
    :try_start_2
    iget-object p2, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 120
    .line 121
    invoke-direct {v2, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    :goto_1
    iput-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 129
    .line 130
    const/4 p2, 0x1

    .line 131
    iput p2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 132
    .line 133
    move-object p2, v2

    .line 134
    check-cast p2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 135
    .line 136
    invoke-virtual {p2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2
    :try_end_2
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    if-ne v2, v1, :cond_3

    .line 141
    .line 142
    goto/16 :goto_b

    .line 143
    .line 144
    :cond_3
    move-object v8, v2

    .line 145
    move-object v2, p0

    .line 146
    move-object p0, p2

    .line 147
    move-object p2, v8

    .line 148
    :goto_2
    :try_start_3
    check-cast p2, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    if-eqz p2, :cond_6

    .line 155
    .line 156
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 157
    .line 158
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    instance-of v7, p2, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 163
    .line 164
    if-eqz v7, :cond_4

    .line 165
    .line 166
    check-cast p2, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 167
    .line 168
    iput-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 173
    .line 174
    const/4 v7, 0x2

    .line 175
    iput v7, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 176
    .line 177
    invoke-virtual {v2, p2, p1, v0}, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p2
    :try_end_3
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    if-ne p2, v1, :cond_1

    .line 182
    .line 183
    goto/16 :goto_b

    .line 184
    .line 185
    :goto_3
    :try_start_4
    check-cast p2, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result p2
    :try_end_4
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 191
    if-eqz p2, :cond_2

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catchall_1
    move-exception p1

    .line 195
    move-object v2, p0

    .line 196
    move-object p0, p1

    .line 197
    goto :goto_5

    .line 198
    :catch_1
    move-exception p1

    .line 199
    move-object v2, p0

    .line 200
    move-object p0, p1

    .line 201
    goto/16 :goto_6

    .line 202
    .line 203
    :cond_4
    :try_start_5
    instance-of v7, p2, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 204
    .line 205
    if-eqz v7, :cond_5

    .line 206
    .line 207
    check-cast p2, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 208
    .line 209
    invoke-virtual {p2}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 210
    .line 211
    .line 212
    move-object v8, v2

    .line 213
    move-object v2, p0

    .line 214
    move-object p0, v8

    .line 215
    goto :goto_1

    .line 216
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    new-instance p1, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p0
    :try_end_5
    .catch Lio/ktor/util/cio/ChannelWriteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 237
    :cond_6
    move-object p0, v2

    .line 238
    :goto_4
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 239
    .line 240
    invoke-static {v4, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p1, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 248
    .line 249
    iput-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 254
    .line 255
    const/4 p2, 0x3

    .line 256
    iput p2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 257
    .line 258
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    if-ne p1, v1, :cond_8

    .line 265
    .line 266
    goto/16 :goto_b

    .line 267
    .line 268
    :goto_5
    :try_start_6
    iget-object p1, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 269
    .line 270
    invoke-virtual {p1, p0, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 271
    .line 272
    .line 273
    iget-object p0, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 274
    .line 275
    invoke-static {v4, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-virtual {p0, p1, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 280
    .line 281
    .line 282
    iget-object p0, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 283
    .line 284
    iput-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 289
    .line 290
    const/4 p1, 0x5

    .line 291
    iput p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 292
    .line 293
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 294
    .line 295
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    if-ne p0, v1, :cond_7

    .line 300
    .line 301
    goto/16 :goto_b

    .line 302
    .line 303
    :cond_7
    move-object p0, v2

    .line 304
    goto :goto_7

    .line 305
    :catchall_2
    move-exception p0

    .line 306
    goto/16 :goto_a

    .line 307
    .line 308
    :goto_6
    :try_start_7
    iget-object p1, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 309
    .line 310
    const-string p2, "Failed to write to WebSocket."

    .line 311
    .line 312
    invoke-static {p2, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p1, p0, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 317
    .line 318
    .line 319
    iget-object p0, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 320
    .line 321
    invoke-static {v4, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p0, p1, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 326
    .line 327
    .line 328
    iget-object p0, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 329
    .line 330
    iput-object v2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 335
    .line 336
    const/4 p1, 0x4

    .line 337
    iput p1, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 338
    .line 339
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 340
    .line 341
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    if-ne p0, v1, :cond_7

    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_8
    :goto_7
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 349
    .line 350
    invoke-virtual {p0, v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Throwable;)Z

    .line 351
    .line 352
    .line 353
    :cond_9
    :goto_8
    :try_start_8
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-static {p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    if-nez p1, :cond_a

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_a
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 365
    .line 366
    if-nez p2, :cond_9

    .line 367
    .line 368
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;

    .line 369
    .line 370
    if-nez p2, :cond_9

    .line 371
    .line 372
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;

    .line 373
    .line 374
    if-eqz p2, :cond_b

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_b
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 378
    .line 379
    if-eqz p2, :cond_c

    .line 380
    .line 381
    check-cast p1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 382
    .line 383
    invoke-virtual {p1}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_c
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子楪苏兰世哲;

    .line 388
    .line 389
    if-nez p2, :cond_9

    .line 390
    .line 391
    instance-of p2, p1, Lio/ktor/websocket/飘花落叶言子楪世兰哲苏;

    .line 392
    .line 393
    if-eqz p2, :cond_d

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 397
    .line 398
    new-instance p2, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw p0
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_2

    .line 417
    :catch_2
    :goto_9
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 418
    .line 419
    goto :goto_b

    .line 420
    :goto_a
    iget-object p1, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 421
    .line 422
    invoke-static {v4, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 423
    .line 424
    .line 425
    move-result-object p2

    .line 426
    invoke-virtual {p1, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 427
    .line 428
    .line 429
    iget-object p1, v2, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 430
    .line 431
    iput-object p0, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$0:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$1:Ljava/lang/Object;

    .line 434
    .line 435
    iput-object v6, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->L$2:Ljava/lang/Object;

    .line 436
    .line 437
    const/4 p2, 0x6

    .line 438
    iput p2, v0, Lio/ktor/websocket/WebSocketWriter$writeLoop$1;->label:I

    .line 439
    .line 440
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 441
    .line 442
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    if-ne p1, v1, :cond_e

    .line 447
    .line 448
    :goto_b
    return-object v1

    .line 449
    :cond_e
    :goto_c
    throw p0

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;

    .line 13
    .line 14
    iget v4, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;-><init>(Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    if-eq v5, v9, :cond_3

    .line 44
    .line 45
    if-eq v5, v8, :cond_2

    .line 46
    .line 47
    if-ne v5, v7, :cond_1

    .line 48
    .line 49
    iget v0, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 50
    .line 51
    iget-object v1, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 54
    .line 55
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v10

    .line 66
    :cond_2
    iget v0, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 67
    .line 68
    iget-object v1, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$3:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 71
    .line 72
    iget-object v5, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$2:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 75
    .line 76
    iget-object v11, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    iget-object v12, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v12, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move v6, v8

    .line 88
    move v7, v9

    .line 89
    goto/16 :goto_17

    .line 90
    .line 91
    :cond_3
    iget v0, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 92
    .line 93
    iget-object v1, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 96
    .line 97
    iget-object v5, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    iget-object v11, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v11, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move v7, v9

    .line 109
    move-object v12, v11

    .line 110
    move-object v11, v5

    .line 111
    move-object v5, v1

    .line 112
    goto/16 :goto_15

    .line 113
    .line 114
    :cond_4
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 118
    .line 119
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-object v5, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v5, v5, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v5, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 133
    .line 134
    invoke-virtual {v5, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    instance-of v1, v1, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 138
    .line 139
    move-object v5, v3

    .line 140
    move v3, v1

    .line 141
    move-object/from16 v1, p2

    .line 142
    .line 143
    :goto_1
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 144
    .line 145
    if-nez v11, :cond_9

    .line 146
    .line 147
    if-nez v3, :cond_9

    .line 148
    .line 149
    iget-object v11, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 150
    .line 151
    iget-object v12, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v12, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 154
    .line 155
    invoke-virtual {v12}, Ljava/util/concurrent/ArrayBlockingQueue;->remainingCapacity()I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-lez v12, :cond_9

    .line 160
    .line 161
    iget-object v12, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 162
    .line 163
    invoke-virtual {v12}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-static {v12}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    if-nez v12, :cond_5

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_5
    instance-of v13, v12, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 175
    .line 176
    if-eqz v13, :cond_6

    .line 177
    .line 178
    iput-object v12, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    instance-of v13, v12, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 182
    .line 183
    if-eqz v13, :cond_7

    .line 184
    .line 185
    check-cast v12, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 186
    .line 187
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v3, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 193
    .line 194
    invoke-virtual {v3, v12}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    move v3, v9

    .line 198
    goto :goto_1

    .line 199
    :cond_7
    instance-of v13, v12, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 200
    .line 201
    if-eqz v13, :cond_8

    .line 202
    .line 203
    check-cast v12, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object v11, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v11, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 211
    .line 212
    invoke-virtual {v11, v12}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_8
    const-string v0, "unknown message "

    .line 217
    .line 218
    invoke-static {v12, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v10

    .line 226
    :cond_9
    :goto_2
    if-eqz v3, :cond_a

    .line 227
    .line 228
    iget-object v11, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 229
    .line 230
    invoke-virtual {v11, v10}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Throwable;)Z

    .line 231
    .line 232
    .line 233
    :cond_a
    iget-object v11, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 234
    .line 235
    iget-object v12, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v12, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 238
    .line 239
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    if-eqz v12, :cond_10

    .line 244
    .line 245
    iget-object v11, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    if-eqz v11, :cond_b

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_b
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    if-eqz v11, :cond_c

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_c
    iget-object v0, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 260
    .line 261
    iput-object v2, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v10, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$1:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v10, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$2:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v10, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$3:Ljava/lang/Object;

    .line 268
    .line 269
    iput v3, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 270
    .line 271
    iput v7, v5, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 272
    .line 273
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 274
    .line 275
    invoke-virtual {v0, v5}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-ne v0, v4, :cond_d

    .line 280
    .line 281
    goto/16 :goto_16

    .line 282
    .line 283
    :cond_d
    move-object v1, v2

    .line 284
    move v0, v3

    .line 285
    :goto_3
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 288
    .line 289
    if-eqz v1, :cond_e

    .line 290
    .line 291
    invoke-virtual {v1}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 292
    .line 293
    .line 294
    :cond_e
    if-eqz v0, :cond_f

    .line 295
    .line 296
    move v6, v9

    .line 297
    goto :goto_4

    .line 298
    :cond_f
    const/4 v6, 0x0

    .line 299
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :cond_10
    :goto_5
    iget-object v11, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 305
    .line 306
    iget-boolean v12, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 307
    .line 308
    iput-boolean v12, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 309
    .line 310
    iget-object v12, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v12, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    :goto_6
    iget-object v13, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v13, Ljava/nio/ByteBuffer;

    .line 320
    .line 321
    const v14, 0x7fffffff

    .line 322
    .line 323
    .line 324
    if-nez v13, :cond_11

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_11
    invoke-static {v13, v1, v14}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    .line 328
    .line 329
    .line 330
    invoke-virtual {v13}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    if-nez v13, :cond_12

    .line 335
    .line 336
    iput-object v10, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 337
    .line 338
    :goto_7
    invoke-virtual {v12}, Ljava/util/concurrent/ArrayBlockingQueue;->peek()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    check-cast v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 343
    .line 344
    if-nez v13, :cond_13

    .line 345
    .line 346
    :cond_12
    :goto_8
    move-object v9, v10

    .line 347
    goto/16 :goto_14

    .line 348
    .line 349
    :cond_13
    iget-object v15, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/nio/ByteBuffer;

    .line 350
    .line 351
    iget-boolean v6, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 352
    .line 353
    const/16 v16, 0x4

    .line 354
    .line 355
    if-eqz v6, :cond_14

    .line 356
    .line 357
    invoke-static/range {v16 .. v16}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    sget-object v17, Lkotlin/random/飘花落叶言子楪世兰苏哲;->Default:Lkotlin/random/Random$Default;

    .line 362
    .line 363
    invoke-virtual/range {v17 .. v17}, Lkotlin/random/Random$Default;->nextInt()I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 371
    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_14
    move-object v7, v10

    .line 375
    :goto_9
    iput-object v7, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    const/16 v8, 0x7e

    .line 382
    .line 383
    if-ge v7, v8, :cond_15

    .line 384
    .line 385
    const/4 v7, 0x2

    .line 386
    goto :goto_a

    .line 387
    :cond_15
    const/16 v9, 0x7fff

    .line 388
    .line 389
    if-gt v7, v9, :cond_16

    .line 390
    .line 391
    move/from16 v7, v16

    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_16
    const/16 v7, 0xa

    .line 395
    .line 396
    :goto_a
    if-eqz v6, :cond_17

    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_17
    const/16 v16, 0x0

    .line 400
    .line 401
    :goto_b
    add-int v7, v7, v16

    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    if-ge v9, v7, :cond_18

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_18
    iget-boolean v7, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Z

    .line 411
    .line 412
    iget-object v9, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lio/ktor/websocket/FrameType;

    .line 413
    .line 414
    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    .line 415
    .line 416
    .line 417
    move-result v14

    .line 418
    if-ge v14, v8, :cond_19

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_19
    const v10, 0xffff

    .line 422
    .line 423
    .line 424
    if-gt v14, v10, :cond_1a

    .line 425
    .line 426
    move v14, v8

    .line 427
    goto :goto_c

    .line 428
    :cond_1a
    const/16 v14, 0x7f

    .line 429
    .line 430
    :goto_c
    iget-object v10, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v10, Lio/ktor/websocket/FrameType;

    .line 433
    .line 434
    if-nez v10, :cond_1c

    .line 435
    .line 436
    if-nez v7, :cond_1b

    .line 437
    .line 438
    iput-object v9, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 439
    .line 440
    :cond_1b
    invoke-virtual {v9}, Lio/ktor/websocket/FrameType;->getOpcode()I

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    goto :goto_d

    .line 445
    :cond_1c
    if-ne v10, v9, :cond_1e

    .line 446
    .line 447
    if-eqz v7, :cond_1d

    .line 448
    .line 449
    const/4 v9, 0x0

    .line 450
    iput-object v9, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 451
    .line 452
    :cond_1d
    const/4 v9, 0x0

    .line 453
    goto :goto_d

    .line 454
    :cond_1e
    invoke-virtual {v9}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-eqz v10, :cond_28

    .line 459
    .line 460
    invoke-virtual {v9}, Lio/ktor/websocket/FrameType;->getOpcode()I

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    :goto_d
    if-eqz v7, :cond_1f

    .line 465
    .line 466
    const/16 v7, 0x80

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_1f
    const/4 v7, 0x0

    .line 470
    :goto_e
    iget-boolean v10, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 471
    .line 472
    if-eqz v10, :cond_20

    .line 473
    .line 474
    const/16 v10, 0x40

    .line 475
    .line 476
    goto :goto_f

    .line 477
    :cond_20
    const/4 v10, 0x0

    .line 478
    :goto_f
    or-int/2addr v7, v10

    .line 479
    iget-boolean v10, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:Z

    .line 480
    .line 481
    if-eqz v10, :cond_21

    .line 482
    .line 483
    const/16 v10, 0x20

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_21
    const/4 v10, 0x0

    .line 487
    :goto_10
    or-int/2addr v7, v10

    .line 488
    iget-boolean v10, v13, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:Z

    .line 489
    .line 490
    if-eqz v10, :cond_22

    .line 491
    .line 492
    const/16 v10, 0x10

    .line 493
    .line 494
    goto :goto_11

    .line 495
    :cond_22
    const/4 v10, 0x0

    .line 496
    :goto_11
    or-int/2addr v7, v10

    .line 497
    or-int/2addr v7, v9

    .line 498
    int-to-byte v7, v7

    .line 499
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 500
    .line 501
    .line 502
    if-eqz v6, :cond_23

    .line 503
    .line 504
    const/16 v10, 0x80

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_23
    const/4 v10, 0x0

    .line 508
    :goto_12
    or-int v6, v10, v14

    .line 509
    .line 510
    int-to-byte v6, v6

    .line 511
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 512
    .line 513
    .line 514
    if-eq v14, v8, :cond_25

    .line 515
    .line 516
    const/16 v6, 0x7f

    .line 517
    .line 518
    if-eq v14, v6, :cond_24

    .line 519
    .line 520
    goto :goto_13

    .line 521
    :cond_24
    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    int-to-long v6, v6

    .line 526
    invoke-virtual {v1, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 527
    .line 528
    .line 529
    goto :goto_13

    .line 530
    :cond_25
    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    .line 531
    .line 532
    .line 533
    move-result v6

    .line 534
    int-to-short v6, v6

    .line 535
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 536
    .line 537
    .line 538
    :goto_13
    iget-object v6, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 541
    .line 542
    if-eqz v6, :cond_26

    .line 543
    .line 544
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    if-eqz v6, :cond_26

    .line 549
    .line 550
    const v7, 0x7fffffff

    .line 551
    .line 552
    .line 553
    invoke-static {v6, v1, v7}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    .line 554
    .line 555
    .line 556
    :cond_26
    invoke-virtual {v12}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    iget-object v6, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 562
    .line 563
    if-eqz v6, :cond_27

    .line 564
    .line 565
    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    const v9, 0x7fffffff

    .line 584
    .line 585
    .line 586
    invoke-static {v8, v7, v9}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    .line 587
    .line 588
    .line 589
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 590
    .line 591
    .line 592
    invoke-static {v7, v6}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    .line 593
    .line 594
    .line 595
    move-object v15, v7

    .line 596
    :cond_27
    iput-object v15, v11, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 597
    .line 598
    const/4 v7, 0x3

    .line 599
    const/4 v8, 0x2

    .line 600
    const/4 v9, 0x1

    .line 601
    const/4 v10, 0x0

    .line 602
    goto/16 :goto_6

    .line 603
    .line 604
    :cond_28
    const-string v0, "Can\'t continue with different data frame opcode"

    .line 605
    .line 606
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    const/4 v9, 0x0

    .line 610
    return-object v9

    .line 611
    :goto_14
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 612
    .line 613
    .line 614
    move-object/from16 v18, v5

    .line 615
    .line 616
    move v5, v3

    .line 617
    move-object/from16 v3, v18

    .line 618
    .line 619
    :cond_29
    iget-object v6, v0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 620
    .line 621
    iput-object v0, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 622
    .line 623
    iput-object v1, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$1:Ljava/lang/Object;

    .line 624
    .line 625
    iput-object v2, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$2:Ljava/lang/Object;

    .line 626
    .line 627
    iput-object v9, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$3:Ljava/lang/Object;

    .line 628
    .line 629
    iput v5, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 630
    .line 631
    const/4 v7, 0x1

    .line 632
    iput v7, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 633
    .line 634
    invoke-static {v6, v1, v3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    if-ne v6, v4, :cond_2a

    .line 639
    .line 640
    goto :goto_16

    .line 641
    :cond_2a
    move-object v12, v0

    .line 642
    move-object v11, v1

    .line 643
    move v0, v5

    .line 644
    move-object v5, v2

    .line 645
    :goto_15
    iget-object v1, v12, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 646
    .line 647
    iget-object v2, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v2, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 650
    .line 651
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    if-eqz v2, :cond_2d

    .line 656
    .line 657
    iget-object v1, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 660
    .line 661
    if-eqz v1, :cond_2b

    .line 662
    .line 663
    goto :goto_19

    .line 664
    :cond_2b
    invoke-virtual {v11}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-nez v1, :cond_2d

    .line 669
    .line 670
    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 673
    .line 674
    if-eqz v1, :cond_2d

    .line 675
    .line 676
    iget-object v2, v12, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 677
    .line 678
    iput-object v12, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$0:Ljava/lang/Object;

    .line 679
    .line 680
    iput-object v11, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$1:Ljava/lang/Object;

    .line 681
    .line 682
    iput-object v5, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$2:Ljava/lang/Object;

    .line 683
    .line 684
    iput-object v1, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->L$3:Ljava/lang/Object;

    .line 685
    .line 686
    iput v0, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->I$0:I

    .line 687
    .line 688
    const/4 v6, 0x2

    .line 689
    iput v6, v3, Lio/ktor/websocket/WebSocketWriter$drainQueueAndSerialize$1;->label:I

    .line 690
    .line 691
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 692
    .line 693
    invoke-virtual {v2, v3}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    if-ne v2, v4, :cond_2c

    .line 698
    .line 699
    :goto_16
    return-object v4

    .line 700
    :cond_2c
    :goto_17
    invoke-virtual {v1}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 701
    .line 702
    .line 703
    const/4 v9, 0x0

    .line 704
    iput-object v9, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 705
    .line 706
    :goto_18
    move-object v2, v5

    .line 707
    move-object v1, v11

    .line 708
    move v5, v0

    .line 709
    move-object v0, v12

    .line 710
    goto :goto_1a

    .line 711
    :cond_2d
    :goto_19
    const/4 v6, 0x2

    .line 712
    const/4 v9, 0x0

    .line 713
    goto :goto_18

    .line 714
    :goto_1a
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 715
    .line 716
    if-nez v8, :cond_2e

    .line 717
    .line 718
    if-eqz v5, :cond_2f

    .line 719
    .line 720
    :cond_2e
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 721
    .line 722
    .line 723
    move-result v8

    .line 724
    if-nez v8, :cond_29

    .line 725
    .line 726
    :cond_2f
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 727
    .line 728
    .line 729
    move v8, v5

    .line 730
    move-object v5, v3

    .line 731
    move v3, v8

    .line 732
    move v8, v6

    .line 733
    move-object v10, v9

    .line 734
    move v9, v7

    .line 735
    const/4 v7, 0x3

    .line 736
    goto/16 :goto_1
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lio/ktor/websocket/WebSocketWriter$flush$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/websocket/WebSocketWriter$flush$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/websocket/WebSocketWriter$flush$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/websocket/WebSocketWriter$flush$1;-><init>(Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 30
    .line 31
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v7

    .line 55
    :cond_2
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-object p0, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 66
    .line 67
    iget-object v2, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 70
    .line 71
    iget-object v6, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;

    .line 74
    .line 75
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :catch_0
    move-object p1, v2

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;

    .line 87
    .line 88
    iget-object v2, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 89
    .line 90
    sget-object v8, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 91
    .line 92
    invoke-interface {v2, v8}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 97
    .line 98
    invoke-direct {p1, v2}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;-><init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 99
    .line 100
    .line 101
    :try_start_1
    iget-object v2, p0, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 102
    .line 103
    iput-object p0, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$2:Ljava/lang/Object;

    .line 108
    .line 109
    iput v6, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 110
    .line 111
    invoke-interface {v2, p1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    if-ne p0, v1, :cond_5

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_5
    move-object v2, p1

    .line 119
    goto :goto_4

    .line 120
    :catchall_1
    move-exception p0

    .line 121
    move-object v9, p1

    .line 122
    move-object p1, p0

    .line 123
    move-object p0, v9

    .line 124
    goto :goto_1

    .line 125
    :catch_1
    move-object v6, p0

    .line 126
    move-object p0, p1

    .line 127
    goto :goto_2

    .line 128
    :goto_1
    invoke-virtual {p0}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :goto_2
    invoke-virtual {p0}, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 133
    .line 134
    .line 135
    iget-object p0, v6, Lio/ktor/websocket/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 136
    .line 137
    iput-object p1, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v7, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v7, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    iput v5, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-ne p0, v1, :cond_6

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_6
    move-object p0, p1

    .line 153
    :goto_3
    move-object v2, p0

    .line 154
    :goto_4
    iput-object v7, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v7, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v7, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput v4, v0, Lio/ktor/websocket/WebSocketWriter$flush$1;->label:I

    .line 161
    .line 162
    iget-object p0, v2, Lio/ktor/websocket/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 169
    .line 170
    if-ne p0, p1, :cond_7

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    move-object p0, v3

    .line 174
    :goto_5
    if-ne p0, v1, :cond_8

    .line 175
    .line 176
    :goto_6
    return-object v1

    .line 177
    :cond_8
    return-object v3
.end method
