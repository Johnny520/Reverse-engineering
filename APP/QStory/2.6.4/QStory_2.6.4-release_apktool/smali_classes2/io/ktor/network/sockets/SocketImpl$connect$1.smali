.class final Lio/ktor/network/sockets/SocketImpl$connect$1;
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
    c = "io.ktor.network.sockets.SocketImpl"
    f = "SocketImpl.kt"
    l = {
        0x2f,
        0x41
    }
    m = "connect$ktor_network"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/network/sockets/SocketImpl$connect$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->this$0:Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->this$0:Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 16
    .line 17
    and-int v2, v1, v0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v0

    .line 22
    iput v1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/SocketImpl$connect$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Lio/ktor/network/sockets/SocketImpl$connect$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object v0, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v2, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x2

    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v5, :cond_2

    .line 43
    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    :goto_1
    iget-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p1, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->CONNECT:Lio/ktor/network/selector/SelectInterest;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v5}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏兰楪哲世(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 76
    .line 77
    .line 78
    iget-object v2, p1, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 79
    .line 80
    iput-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput v5, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 83
    .line 84
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    invoke-virtual {v2, p1, v0, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v1, :cond_5

    .line 91
    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :cond_5
    :goto_2
    iget-object v0, p1, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_16

    .line 101
    .line 102
    sget-boolean v2, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 103
    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->getLocalAddress()Ljava/net/SocketAddress;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    goto :goto_3

    .line 111
    :cond_6
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v6}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    :goto_3
    if-eqz v2, :cond_7

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->getRemoteAddress()Ljava/net/SocketAddress;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v7}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    :goto_4
    if-eqz v6, :cond_15

    .line 135
    .line 136
    if-eqz v7, :cond_15

    .line 137
    .line 138
    instance-of v8, v6, Ljava/net/InetSocketAddress;

    .line 139
    .line 140
    if-eqz v8, :cond_8

    .line 141
    .line 142
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_8
    move-object v6, v3

    .line 146
    :goto_5
    instance-of v8, v7, Ljava/net/InetSocketAddress;

    .line 147
    .line 148
    if-eqz v8, :cond_9

    .line 149
    .line 150
    check-cast v7, Ljava/net/InetSocketAddress;

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_9
    move-object v7, v3

    .line 154
    :goto_6
    const/4 v8, 0x0

    .line 155
    if-nez v6, :cond_a

    .line 156
    .line 157
    if-nez v7, :cond_a

    .line 158
    .line 159
    goto/16 :goto_b

    .line 160
    .line 161
    :cond_a
    const-string v9, ""

    .line 162
    .line 163
    if-eqz v6, :cond_b

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    if-eqz v10, :cond_b

    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    if-nez v10, :cond_c

    .line 176
    .line 177
    :cond_b
    move-object v10, v9

    .line 178
    :cond_c
    if-eqz v7, :cond_e

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    if-eqz v11, :cond_e

    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    if-nez v11, :cond_d

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_d
    move-object v9, v11

    .line 194
    :cond_e
    :goto_7
    if-eqz v7, :cond_f

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    if-eqz v11, :cond_f

    .line 201
    .line 202
    invoke-virtual {v11}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    goto :goto_8

    .line 207
    :cond_f
    move v11, v8

    .line 208
    :goto_8
    if-eqz v6, :cond_10

    .line 209
    .line 210
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getPort()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    goto :goto_9

    .line 219
    :cond_10
    move-object v6, v3

    .line 220
    :goto_9
    if-eqz v7, :cond_11

    .line 221
    .line 222
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getPort()I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    goto :goto_a

    .line 231
    :cond_11
    move-object v7, v3

    .line 232
    :goto_a
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_14

    .line 237
    .line 238
    if-nez v11, :cond_12

    .line 239
    .line 240
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_14

    .line 245
    .line 246
    :cond_12
    if-eqz v2, :cond_13

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_13
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_2

    .line 261
    .line 262
    :cond_14
    :goto_b
    sget-object p0, Lio/ktor/network/selector/SelectInterest;->CONNECT:Lio/ktor/network/selector/SelectInterest;

    .line 263
    .line 264
    invoke-virtual {p1, p0, v8}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏兰楪哲世(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 265
    .line 266
    .line 267
    return-object p1

    .line 268
    :cond_15
    const-string p0, "localAddress and remoteAddress should not be null."

    .line 269
    .line 270
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-object v3

    .line 274
    :cond_16
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->CONNECT:Lio/ktor/network/selector/SelectInterest;

    .line 275
    .line 276
    invoke-virtual {p1, v0, v5}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏兰楪哲世(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 277
    .line 278
    .line 279
    iget-object v2, p1, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 280
    .line 281
    iput-object p1, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->L$0:Ljava/lang/Object;

    .line 282
    .line 283
    iput v4, p0, Lio/ktor/network/sockets/SocketImpl$connect$1;->label:I

    .line 284
    .line 285
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 286
    .line 287
    invoke-virtual {v2, p1, v0, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-ne v0, v1, :cond_5

    .line 292
    .line 293
    :goto_c
    return-object v1
.end method
