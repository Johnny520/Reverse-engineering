.class final Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;
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
    c = "io.ktor.client.engine.cio.Endpoint"
    f = "Endpoint.kt"
    l = {
        0x65,
        0x82,
        0x84,
        0x85
    }
    m = "makeDedicatedRequest"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/engine/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

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
    .locals 13

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    sget-object v1, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 18
    .line 19
    and-int v2, v1, v0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    iput v1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;

    .line 28
    .line 29
    invoke-direct {v0, p1, p0}, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;-><init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    iget-object v0, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v2, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz v2, :cond_6

    .line 42
    .line 43
    if-eq v2, v4, :cond_5

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    if-eq v2, p1, :cond_4

    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    const/4 v4, 0x4

    .line 50
    if-eq v2, p1, :cond_2

    .line 51
    .line 52
    if-ne v2, v4, :cond_1

    .line 53
    .line 54
    iget-object p0, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :cond_2
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$4:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v9, p1

    .line 75
    check-cast v9, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;

    .line 76
    .line 77
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$3:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v7, p1

    .line 80
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 81
    .line 82
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v6, p1

    .line 85
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 86
    .line 87
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v8, p1

    .line 90
    check-cast v8, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 91
    .line 92
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v10, p1

    .line 95
    check-cast v10, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 96
    .line 97
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iput-object v10, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$1:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$2:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$3:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$4:Ljava/lang/Object;

    .line 109
    .line 110
    iput v4, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 111
    .line 112
    :try_start_2
    new-instance v5, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2;

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-direct/range {v5 .. v11}, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v8, v5, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪兰苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 122
    if-ne v0, v1, :cond_3

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_3
    move-object p0, v10

    .line 126
    :goto_1
    :try_start_3
    check-cast v0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    .line 128
    return-object v0

    .line 129
    :goto_2
    move-object p1, p0

    .line 130
    goto :goto_3

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    move-object p0, v0

    .line 133
    goto :goto_2

    .line 134
    :goto_3
    move-object p0, v10

    .line 135
    goto :goto_6

    .line 136
    :catchall_2
    move-exception v0

    .line 137
    move-object p1, v0

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    iget-object p0, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 142
    .line 143
    :try_start_4
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    check-cast v0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_5
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$2:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 152
    .line 153
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$1:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 156
    .line 157
    iget-object p0, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 160
    .line 161
    :try_start_5
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 162
    .line 163
    .line 164
    move-object v12, p1

    .line 165
    move-object p1, p0

    .line 166
    move-object p0, v12

    .line 167
    goto :goto_5

    .line 168
    :catchall_3
    move-exception v0

    .line 169
    move-object p0, v0

    .line 170
    move-object v12, p1

    .line 171
    move-object p1, p0

    .line 172
    move-object p0, v12

    .line 173
    goto :goto_6

    .line 174
    :cond_6
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :try_start_6
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$1:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->L$2:Ljava/lang/Object;

    .line 182
    .line 183
    iput v4, p0, Lio/ktor/client/engine/cio/Endpoint$makeDedicatedRequest$1;->label:I

    .line 184
    .line 185
    invoke-virtual {p1, p0}, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/io/Serializable;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 189
    if-ne v0, v1, :cond_7

    .line 190
    .line 191
    :goto_4
    return-object v1

    .line 192
    :cond_7
    move-object p0, v3

    .line 193
    :goto_5
    :try_start_7
    check-cast v0, Lkotlin/Pair;

    .line 194
    .line 195
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 200
    .line 201
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 206
    .line 207
    iget-object v0, v0, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 213
    :catchall_4
    move-exception v0

    .line 214
    move-object p1, v0

    .line 215
    move-object p0, v3

    .line 216
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    :goto_7
    if-eqz v0, :cond_8

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    goto :goto_8

    .line 232
    :cond_8
    move-object v1, v3

    .line 233
    :goto_8
    if-eqz v1, :cond_9

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    goto :goto_7

    .line 240
    :cond_9
    move-object v3, v0

    .line 241
    :cond_a
    nop

    .line 242
    instance-of v0, v3, Ljava/net/SocketTimeoutException;

    .line 243
    .line 244
    if-eqz v0, :cond_d

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sget-object v1, Lio/ktor/client/plugins/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 251
    .line 252
    new-instance v1, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v2, "Socket timeout has expired [url="

    .line 255
    .line 256
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget-object v2, p0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 260
    .line 261
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v2, ", socket_timeout="

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    check-cast p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 274
    .line 275
    if-eqz p0, :cond_b

    .line 276
    .line 277
    iget-object p0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 278
    .line 279
    if-nez p0, :cond_c

    .line 280
    .line 281
    :cond_b
    const-string p0, "unknown"

    .line 282
    .line 283
    :cond_c
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string p0, "] ms"

    .line 287
    .line 288
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    new-instance v1, Ljava/net/SocketTimeoutException;

    .line 296
    .line 297
    invoke-direct {v1, p0}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 301
    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :goto_9
    if-nez v1, :cond_e

    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_e
    move-object p1, v1

    .line 312
    :goto_a
    throw p1
.end method
