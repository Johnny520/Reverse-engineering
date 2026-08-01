.class final Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;
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
    c = "io.ktor.websocket.RawWebSocketCommonKt"
    f = "RawWebSocketCommon.kt"
    l = {
        0xd6,
        0xd7,
        0xea,
        0xeb,
        0xf3,
        0xfb
    }
    m = "readFrame"
.end annotation


# instance fields
.field B$0:B

.field B$1:B

.field I$0:I

.field I$1:I

.field J$0:J

.field J$1:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;",
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
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 13
    .line 14
    and-int v3, v1, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    iget-object v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v9, 0x4

    .line 37
    const/4 v10, 0x2

    .line 38
    const/4 v11, 0x1

    .line 39
    packed-switch v3, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v4

    .line 48
    :pswitch_0
    iget v2, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$1:I

    .line 49
    .line 50
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 51
    .line 52
    iget-byte v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 53
    .line 54
    iget-object v0, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lio/ktor/websocket/FrameType;

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move/from16 v17, v5

    .line 62
    .line 63
    move v15, v10

    .line 64
    goto/16 :goto_11

    .line 65
    .line 66
    :pswitch_1
    iget-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$1:J

    .line 67
    .line 68
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 69
    .line 70
    iget-byte v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 71
    .line 72
    iget-wide v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 73
    .line 74
    iget-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v15, Lio/ktor/websocket/FrameType;

    .line 77
    .line 78
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 81
    .line 82
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move/from16 v17, v5

    .line 86
    .line 87
    move-object v9, v15

    .line 88
    move v15, v10

    .line 89
    goto/16 :goto_e

    .line 90
    .line 91
    :pswitch_2
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 92
    .line 93
    iget-byte v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$1:B

    .line 94
    .line 95
    iget-byte v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 96
    .line 97
    iget-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 98
    .line 99
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, Lio/ktor/websocket/FrameType;

    .line 102
    .line 103
    iget-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 106
    .line 107
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move/from16 v17, v5

    .line 111
    .line 112
    goto/16 :goto_9

    .line 113
    .line 114
    :pswitch_3
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 115
    .line 116
    iget-byte v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$1:B

    .line 117
    .line 118
    iget-byte v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 119
    .line 120
    iget-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 121
    .line 122
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v8, Lio/ktor/websocket/FrameType;

    .line 125
    .line 126
    iget-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 129
    .line 130
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move/from16 v17, v5

    .line 134
    .line 135
    goto/16 :goto_a

    .line 136
    .line 137
    :pswitch_4
    iget-byte v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 138
    .line 139
    iget v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 140
    .line 141
    iget-wide v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 142
    .line 143
    iget-object v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v12, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 146
    .line 147
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object v14, v12

    .line 151
    move-wide v12, v7

    .line 152
    move v7, v3

    .line 153
    goto :goto_2

    .line 154
    :pswitch_5
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 155
    .line 156
    iget-wide v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 157
    .line 158
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_6
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iput-object v4, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 170
    .line 171
    const-wide/16 v6, 0x0

    .line 172
    .line 173
    iput-wide v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 174
    .line 175
    iput v5, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 176
    .line 177
    iput v11, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 178
    .line 179
    invoke-static {v4, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-ne v1, v2, :cond_1

    .line 184
    .line 185
    goto/16 :goto_10

    .line 186
    .line 187
    :cond_1
    move-object v8, v4

    .line 188
    move v3, v5

    .line 189
    :goto_1
    check-cast v1, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    iput-wide v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 198
    .line 199
    iput v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 200
    .line 201
    iput-byte v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 202
    .line 203
    iput v10, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 204
    .line 205
    invoke-static {v8, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    if-ne v12, v2, :cond_2

    .line 210
    .line 211
    goto/16 :goto_10

    .line 212
    .line 213
    :cond_2
    move-wide/from16 v25, v6

    .line 214
    .line 215
    move v7, v1

    .line 216
    move-object v1, v12

    .line 217
    move-wide/from16 v12, v25

    .line 218
    .line 219
    move v6, v3

    .line 220
    move-object v14, v8

    .line 221
    :goto_2
    check-cast v1, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    and-int/lit8 v3, v7, 0xf

    .line 228
    .line 229
    if-nez v3, :cond_4

    .line 230
    .line 231
    if-eqz v6, :cond_3

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_3
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 235
    .line 236
    const-string v1, "Can\'t continue finished frames"

    .line 237
    .line 238
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :cond_4
    :goto_3
    if-nez v3, :cond_5

    .line 243
    .line 244
    move v8, v6

    .line 245
    goto :goto_4

    .line 246
    :cond_5
    move v8, v3

    .line 247
    :goto_4
    sget-object v15, Lio/ktor/websocket/FrameType;->Companion:Lio/ktor/websocket/飘花落叶言子楪哲苏世兰;

    .line 248
    .line 249
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    if-ltz v8, :cond_6

    .line 253
    .line 254
    invoke-static {}, Lio/ktor/websocket/FrameType;->access$getMaxOpcode$cp()I

    .line 255
    .line 256
    .line 257
    move-result v15

    .line 258
    if-gt v8, v15, :cond_6

    .line 259
    .line 260
    invoke-static {}, Lio/ktor/websocket/FrameType;->access$getByOpcodeArray$cp()[Lio/ktor/websocket/FrameType;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    aget-object v15, v15, v8

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_6
    move-object v15, v4

    .line 268
    :goto_5
    if-eqz v15, :cond_23

    .line 269
    .line 270
    if-eqz v3, :cond_8

    .line 271
    .line 272
    if-eqz v6, :cond_8

    .line 273
    .line 274
    invoke-virtual {v15}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_7

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_7
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 282
    .line 283
    const-string v1, "Can\'t start new data frame before finishing previous one"

    .line 284
    .line 285
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v0

    .line 289
    :cond_8
    :goto_6
    and-int/lit16 v3, v7, 0x80

    .line 290
    .line 291
    if-eqz v3, :cond_9

    .line 292
    .line 293
    move v3, v11

    .line 294
    goto :goto_7

    .line 295
    :cond_9
    move v3, v5

    .line 296
    :goto_7
    invoke-virtual {v15}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-eqz v6, :cond_b

    .line 301
    .line 302
    if-eqz v3, :cond_a

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_a
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 306
    .line 307
    const-string v1, "control frames can\'t be fragmented"

    .line 308
    .line 309
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_b
    :goto_8
    and-int/lit8 v6, v1, 0x7f

    .line 314
    .line 315
    const/16 v8, 0x7e

    .line 316
    .line 317
    if-eq v6, v8, :cond_e

    .line 318
    .line 319
    const/16 v8, 0x7f

    .line 320
    .line 321
    if-eq v6, v8, :cond_c

    .line 322
    .line 323
    move/from16 v17, v5

    .line 324
    .line 325
    int-to-long v5, v6

    .line 326
    move-object v8, v14

    .line 327
    move-object v9, v15

    .line 328
    move v14, v7

    .line 329
    move v15, v10

    .line 330
    move-wide/from16 v25, v12

    .line 331
    .line 332
    move-wide v12, v5

    .line 333
    move-wide/from16 v6, v25

    .line 334
    .line 335
    goto/16 :goto_b

    .line 336
    .line 337
    :cond_c
    move/from16 v17, v5

    .line 338
    .line 339
    iput-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 340
    .line 341
    iput-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 342
    .line 343
    iput-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 344
    .line 345
    iput-byte v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 346
    .line 347
    iput-byte v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$1:B

    .line 348
    .line 349
    iput v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 350
    .line 351
    iput v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 352
    .line 353
    invoke-static {v14, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    if-ne v5, v2, :cond_d

    .line 358
    .line 359
    goto/16 :goto_10

    .line 360
    .line 361
    :cond_d
    move v6, v1

    .line 362
    move-object v1, v5

    .line 363
    move-object v8, v15

    .line 364
    :goto_9
    check-cast v1, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 367
    .line 368
    .line 369
    move-result-wide v18

    .line 370
    move v1, v6

    .line 371
    move-object v9, v8

    .line 372
    move v15, v10

    .line 373
    move-object v8, v14

    .line 374
    move v14, v7

    .line 375
    move-wide v6, v12

    .line 376
    move-wide/from16 v12, v18

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_e
    move/from16 v17, v5

    .line 380
    .line 381
    iput-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 382
    .line 383
    iput-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 384
    .line 385
    iput-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 386
    .line 387
    iput-byte v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 388
    .line 389
    iput-byte v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$1:B

    .line 390
    .line 391
    iput v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 392
    .line 393
    const/4 v5, 0x3

    .line 394
    iput v5, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 395
    .line 396
    invoke-static {v14, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    if-ne v5, v2, :cond_f

    .line 401
    .line 402
    goto/16 :goto_10

    .line 403
    .line 404
    :cond_f
    move v6, v1

    .line 405
    move-object v1, v5

    .line 406
    move-object v8, v15

    .line 407
    :goto_a
    check-cast v1, Ljava/lang/Number;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/Number;->shortValue()S

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    move v15, v10

    .line 414
    int-to-long v9, v1

    .line 415
    const-wide/32 v18, 0xffff

    .line 416
    .line 417
    .line 418
    and-long v9, v9, v18

    .line 419
    .line 420
    move v1, v6

    .line 421
    move-object/from16 v25, v14

    .line 422
    .line 423
    move v14, v7

    .line 424
    move-wide v6, v12

    .line 425
    move-wide v12, v9

    .line 426
    move-object v9, v8

    .line 427
    move-object/from16 v8, v25

    .line 428
    .line 429
    :goto_b
    invoke-virtual {v9}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    if-eqz v10, :cond_11

    .line 434
    .line 435
    const-wide/16 v18, 0x7d

    .line 436
    .line 437
    cmp-long v10, v12, v18

    .line 438
    .line 439
    if-gtz v10, :cond_10

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_10
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 443
    .line 444
    const-string v1, "control frames can\'t be larger than 125 bytes"

    .line 445
    .line 446
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v0

    .line 450
    :cond_11
    :goto_c
    and-int/lit16 v1, v1, 0x80

    .line 451
    .line 452
    if-eqz v1, :cond_12

    .line 453
    .line 454
    move v1, v11

    .line 455
    goto :goto_d

    .line 456
    :cond_12
    move/from16 v1, v17

    .line 457
    .line 458
    :goto_d
    if-ne v1, v11, :cond_14

    .line 459
    .line 460
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 463
    .line 464
    iput-wide v6, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$0:J

    .line 465
    .line 466
    iput-byte v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 467
    .line 468
    iput v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 469
    .line 470
    iput-wide v12, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->J$1:J

    .line 471
    .line 472
    const/4 v1, 0x5

    .line 473
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 474
    .line 475
    invoke-static {v8, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-ne v1, v2, :cond_13

    .line 480
    .line 481
    goto :goto_10

    .line 482
    :cond_13
    :goto_e
    check-cast v1, Ljava/lang/Number;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    goto :goto_f

    .line 489
    :cond_14
    if-nez v1, :cond_22

    .line 490
    .line 491
    const/4 v1, -0x1

    .line 492
    :goto_f
    const-wide/32 v18, 0x7fffffff

    .line 493
    .line 494
    .line 495
    cmp-long v10, v12, v18

    .line 496
    .line 497
    if-gtz v10, :cond_21

    .line 498
    .line 499
    cmp-long v6, v12, v6

    .line 500
    .line 501
    if-gtz v6, :cond_21

    .line 502
    .line 503
    long-to-int v6, v12

    .line 504
    iput-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$0:Ljava/lang/Object;

    .line 505
    .line 506
    iput-object v4, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->L$1:Ljava/lang/Object;

    .line 507
    .line 508
    iput-byte v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->B$0:B

    .line 509
    .line 510
    iput v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$0:I

    .line 511
    .line 512
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->I$1:I

    .line 513
    .line 514
    const/4 v7, 0x6

    .line 515
    iput v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$readFrame$1;->label:I

    .line 516
    .line 517
    invoke-static {v8, v6, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-ne v0, v2, :cond_15

    .line 522
    .line 523
    :goto_10
    return-object v2

    .line 524
    :cond_15
    move v2, v1

    .line 525
    move v12, v14

    .line 526
    move-object v1, v0

    .line 527
    move-object v0, v9

    .line 528
    :goto_11
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 529
    .line 530
    const/4 v6, -0x1

    .line 531
    if-ne v2, v6, :cond_16

    .line 532
    .line 533
    goto :goto_13

    .line 534
    :cond_16
    shr-int/lit8 v6, v2, 0x18

    .line 535
    .line 536
    int-to-byte v6, v6

    .line 537
    shr-int/lit8 v7, v2, 0x10

    .line 538
    .line 539
    int-to-byte v7, v7

    .line 540
    shr-int/lit8 v8, v2, 0x8

    .line 541
    .line 542
    int-to-byte v8, v8

    .line 543
    int-to-byte v2, v2

    .line 544
    const/4 v5, 0x4

    .line 545
    new-array v9, v5, [B

    .line 546
    .line 547
    aput-byte v6, v9, v17

    .line 548
    .line 549
    aput-byte v7, v9, v11

    .line 550
    .line 551
    aput-byte v8, v9, v15

    .line 552
    .line 553
    const/16 v16, 0x3

    .line 554
    .line 555
    aput-byte v2, v9, v16

    .line 556
    .line 557
    new-instance v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 558
    .line 559
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-static {v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 563
    .line 564
    .line 565
    move-result-wide v6

    .line 566
    long-to-int v6, v6

    .line 567
    move/from16 v7, v17

    .line 568
    .line 569
    :goto_12
    if-ge v7, v6, :cond_17

    .line 570
    .line 571
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    rem-int/lit8 v10, v7, 0x4

    .line 576
    .line 577
    aget-byte v10, v9, v10

    .line 578
    .line 579
    xor-int/2addr v8, v10

    .line 580
    int-to-byte v8, v8

    .line 581
    invoke-virtual {v2, v8}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(B)V

    .line 582
    .line 583
    .line 584
    add-int/lit8 v7, v7, 0x1

    .line 585
    .line 586
    goto :goto_12

    .line 587
    :cond_17
    move-object v1, v2

    .line 588
    :goto_13
    if-eqz v3, :cond_18

    .line 589
    .line 590
    move/from16 v19, v11

    .line 591
    .line 592
    goto :goto_14

    .line 593
    :cond_18
    move/from16 v19, v17

    .line 594
    .line 595
    :goto_14
    invoke-static {v1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)[B

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    and-int/lit8 v2, v12, 0x40

    .line 600
    .line 601
    if-eqz v2, :cond_19

    .line 602
    .line 603
    move/from16 v22, v11

    .line 604
    .line 605
    goto :goto_15

    .line 606
    :cond_19
    move/from16 v22, v17

    .line 607
    .line 608
    :goto_15
    and-int/lit8 v2, v12, 0x20

    .line 609
    .line 610
    if-eqz v2, :cond_1a

    .line 611
    .line 612
    move/from16 v23, v11

    .line 613
    .line 614
    goto :goto_16

    .line 615
    :cond_1a
    move/from16 v23, v17

    .line 616
    .line 617
    :goto_16
    and-int/lit8 v2, v12, 0x10

    .line 618
    .line 619
    if-eqz v2, :cond_1b

    .line 620
    .line 621
    move/from16 v24, v11

    .line 622
    .line 623
    goto :goto_17

    .line 624
    :cond_1b
    move/from16 v24, v17

    .line 625
    .line 626
    :goto_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    sget-object v2, Lio/ktor/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 630
    .line 631
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    aget v0, v2, v0

    .line 636
    .line 637
    if-eq v0, v11, :cond_20

    .line 638
    .line 639
    if-eq v0, v15, :cond_1f

    .line 640
    .line 641
    const/4 v2, 0x3

    .line 642
    if-eq v0, v2, :cond_1e

    .line 643
    .line 644
    const/4 v5, 0x4

    .line 645
    if-eq v0, v5, :cond_1d

    .line 646
    .line 647
    const/4 v2, 0x5

    .line 648
    if-ne v0, v2, :cond_1c

    .line 649
    .line 650
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;

    .line 651
    .line 652
    sget-object v2, Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;

    .line 653
    .line 654
    invoke-direct {v0, v1, v2}, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;-><init>([BLkotlinx/coroutines/飘花落叶言子世哲苏楪兰;)V

    .line 655
    .line 656
    .line 657
    return-object v0

    .line 658
    :cond_1c
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 659
    .line 660
    .line 661
    return-object v4

    .line 662
    :cond_1d
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;

    .line 663
    .line 664
    invoke-direct {v0, v1}, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;-><init>([B)V

    .line 665
    .line 666
    .line 667
    return-object v0

    .line 668
    :cond_1e
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 669
    .line 670
    invoke-direct {v0, v1}, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;-><init>([B)V

    .line 671
    .line 672
    .line 673
    return-object v0

    .line 674
    :cond_1f
    new-instance v18, Lio/ktor/websocket/飘花落叶言子楪苏兰世哲;

    .line 675
    .line 676
    sget-object v20, Lio/ktor/websocket/FrameType;->TEXT:Lio/ktor/websocket/FrameType;

    .line 677
    .line 678
    move-object/from16 v21, v1

    .line 679
    .line 680
    invoke-direct/range {v18 .. v24}, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;-><init>(ZLio/ktor/websocket/FrameType;[BZZZ)V

    .line 681
    .line 682
    .line 683
    return-object v18

    .line 684
    :cond_20
    move-object/from16 v21, v1

    .line 685
    .line 686
    new-instance v18, Lio/ktor/websocket/飘花落叶言子楪世兰哲苏;

    .line 687
    .line 688
    sget-object v20, Lio/ktor/websocket/FrameType;->BINARY:Lio/ktor/websocket/FrameType;

    .line 689
    .line 690
    invoke-direct/range {v18 .. v24}, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;-><init>(ZLio/ktor/websocket/FrameType;[BZZZ)V

    .line 691
    .line 692
    .line 693
    return-object v18

    .line 694
    :cond_21
    new-instance v0, Lio/ktor/websocket/FrameTooBigException;

    .line 695
    .line 696
    invoke-direct {v0, v12, v13}, Lio/ktor/websocket/FrameTooBigException;-><init>(J)V

    .line 697
    .line 698
    .line 699
    throw v0

    .line 700
    :cond_22
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 701
    .line 702
    .line 703
    return-object v4

    .line 704
    :cond_23
    const-string v0, "Unsupported opcode: "

    .line 705
    .line 706
    invoke-static {v8, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    return-object v4

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
