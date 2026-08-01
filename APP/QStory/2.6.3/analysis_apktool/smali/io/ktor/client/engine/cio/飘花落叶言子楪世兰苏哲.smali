.class public final Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic connections:I

.field volatile synthetic lastActivity:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const-string v1, "connections"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/io/Serializable;
    .locals 9

    .line 1
    instance-of v0, p1, Lio/ktor/client/engine/cio/Endpoint$connect$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->label:I

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
    iput v1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/client/engine/cio/Endpoint$connect$1;-><init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->label:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz p1, :cond_a

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    sget-object v3, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eq p1, v4, :cond_8

    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    if-eq p1, v5, :cond_3

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    const/4 v5, 0x4

    .line 45
    if-eq p1, v4, :cond_2

    .line 46
    .line 47
    if-ne p1, v5, :cond_1

    .line 48
    .line 49
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 52
    .line 53
    iget-object v4, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    iget-object v0, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v5, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 70
    .line 71
    new-instance v6, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    invoke-direct {v6, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0, v6}, Lio/ktor/network/sockets/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 77
    .line 78
    .line 79
    new-instance v7, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 80
    .line 81
    invoke-direct {v7, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0, v7}, Lio/ktor/network/sockets/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 85
    .line 86
    .line 87
    invoke-direct {v5, p0, v6, v7}, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)V

    .line 88
    .line 89
    .line 90
    new-instance p0, Lkotlin/Pair;

    .line 91
    .line 92
    invoke-direct {p0, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 97
    .line 98
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_2
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$4:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 105
    .line 106
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$3:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 109
    .line 110
    iget-object v2, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$2:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    iget-object v4, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 117
    .line 118
    iget-object v4, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 121
    .line 122
    :try_start_1
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iput-object v4, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v2, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$2:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$3:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$4:Ljava/lang/Object;

    .line 137
    .line 138
    iput v5, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->label:I

    .line 139
    .line 140
    new-instance p0, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    sget p0, Lio/ktor/network/tls/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 146
    .line 147
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :catchall_0
    move-object v0, v4

    .line 149
    :catchall_1
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 150
    .line 151
    .line 152
    :catchall_2
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 156
    :catchall_3
    move-exception p0

    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :cond_3
    iget p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->I$1:I

    .line 160
    .line 161
    iget v5, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->I$0:I

    .line 162
    .line 163
    iget-object v6, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$3:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 166
    .line 167
    iget-object v7, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 170
    .line 171
    iget-object v8, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$1:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v8, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 174
    .line 175
    iget-object v0, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$0:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 178
    .line 179
    :try_start_4
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 183
    .line 184
    if-nez p0, :cond_9

    .line 185
    .line 186
    iget p0, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 187
    .line 188
    add-int/2addr p0, v4

    .line 189
    iput p0, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 190
    .line 191
    add-int/2addr p1, v4

    .line 192
    if-lt p1, v5, :cond_7

    .line 193
    .line 194
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 195
    .line 196
    .line 197
    iget p0, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    if-ne p0, v5, :cond_6

    .line 203
    .line 204
    sget-object p0, Lio/ktor/client/plugins/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    new-instance p0, Lio/ktor/client/network/sockets/ConnectTimeoutException;

    .line 210
    .line 211
    new-instance p1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v0, "Connect timeout has expired [url="

    .line 214
    .line 215
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v8, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v0, ", connect_timeout="

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8}, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 233
    .line 234
    if-eqz v0, :cond_4

    .line 235
    .line 236
    iget-object v0, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 237
    .line 238
    if-nez v0, :cond_5

    .line 239
    .line 240
    :cond_4
    const-string v0, "unknown"

    .line 241
    .line 242
    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v0, " ms]"

    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-direct {p0, p1, v1}, Lio/ktor/client/network/sockets/ConnectTimeoutException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_6
    new-instance p0, Lio/ktor/client/engine/cio/FailToConnectException;

    .line 259
    .line 260
    invoke-direct {p0}, Lio/ktor/client/engine/cio/FailToConnectException;-><init>()V

    .line 261
    .line 262
    .line 263
    :goto_1
    throw p0

    .line 264
    :cond_7
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 268
    :cond_8
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$2:Ljava/lang/Object;

    .line 269
    .line 270
    move-object v6, p1

    .line 271
    check-cast v6, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 272
    .line 273
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$1:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 276
    .line 277
    iget-object p1, v0, Lio/ktor/client/engine/cio/Endpoint$connect$1;->L$0:Ljava/lang/Object;

    .line 278
    .line 279
    move-object v0, p1

    .line 280
    check-cast v0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 281
    .line 282
    :try_start_6
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 286
    .line 287
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance p1, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 291
    .line 292
    new-instance v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 293
    .line 294
    invoke-direct {v1, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 295
    .line 296
    .line 297
    invoke-interface {p0, v1}, Lio/ktor/network/sockets/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 298
    .line 299
    .line 300
    new-instance v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 301
    .line 302
    invoke-direct {v4, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 303
    .line 304
    .line 305
    invoke-interface {p0, v4}, Lio/ktor/network/sockets/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 306
    .line 307
    .line 308
    invoke-direct {p1, p0, v1, v4}, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    new-instance p0, Lkotlin/Pair;

    .line 315
    .line 316
    invoke-direct {p0, v6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :goto_2
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 321
    .line 322
    .line 323
    throw p0

    .line 324
    :cond_a
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    throw v1
.end method
