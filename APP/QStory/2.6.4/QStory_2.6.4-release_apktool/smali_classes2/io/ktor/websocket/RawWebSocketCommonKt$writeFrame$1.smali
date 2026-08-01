.class final Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;
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
    c = "io.ktor.websocket.RawWebSocketCommonKt"
    f = "RawWebSocketCommon.kt"
    l = {
        0xae,
        0xb8,
        0xbb,
        0xbc,
        0xc4,
        0xca
    }
    m = "writeFrame"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

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
            "Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;",
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
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

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
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    iget-object v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    sget-object v6, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 36
    .line 37
    const/4 v7, 0x4

    .line 38
    const/4 v8, 0x0

    .line 39
    const/16 v9, 0x7f

    .line 40
    .line 41
    const/16 v11, 0x7e

    .line 42
    .line 43
    packed-switch v3, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v8

    .line 52
    :pswitch_0
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :pswitch_1
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$0:I

    .line 57
    .line 58
    iget-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v9, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 61
    .line 62
    iget-object v11, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v1, v3

    .line 70
    move/from16 p1, v5

    .line 71
    .line 72
    move-object v3, v6

    .line 73
    move-object v8, v11

    .line 74
    goto/16 :goto_8

    .line 75
    .line 76
    :pswitch_2
    iget-boolean v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 77
    .line 78
    iget-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v9, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 81
    .line 82
    iget-object v11, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move v14, v3

    .line 90
    move/from16 p1, v5

    .line 91
    .line 92
    move-object v3, v6

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :pswitch_3
    iget-boolean v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 96
    .line 97
    iget-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 100
    .line 101
    iget-object v11, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 104
    .line 105
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move v14, v3

    .line 109
    move/from16 p1, v5

    .line 110
    .line 111
    move-object v3, v6

    .line 112
    move-object v8, v11

    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :pswitch_4
    iget v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$1:I

    .line 116
    .line 117
    iget v13, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$0:I

    .line 118
    .line 119
    iget-boolean v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 120
    .line 121
    iget-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v15, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 124
    .line 125
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 128
    .line 129
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :pswitch_5
    iget v13, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$0:I

    .line 134
    .line 135
    iget-boolean v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 136
    .line 137
    iget-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v8, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 140
    .line 141
    iget-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 144
    .line 145
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    if-ge v13, v11, :cond_1

    .line 149
    .line 150
    move v1, v13

    .line 151
    goto :goto_1

    .line 152
    :cond_1
    const v1, 0xffff

    .line 153
    .line 154
    .line 155
    if-gt v13, v1, :cond_2

    .line 156
    .line 157
    move v1, v11

    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move v1, v9

    .line 160
    :goto_1
    if-eqz v3, :cond_3

    .line 161
    .line 162
    const/16 v15, 0x80

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    const/4 v15, 0x0

    .line 166
    :goto_2
    or-int/2addr v15, v1

    .line 167
    int-to-byte v15, v15

    .line 168
    iput-object v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 171
    .line 172
    iput-boolean v3, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 173
    .line 174
    iput v13, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$0:I

    .line 175
    .line 176
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$1:I

    .line 177
    .line 178
    iput v5, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 179
    .line 180
    invoke-static {v14, v15, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    if-ne v15, v2, :cond_4

    .line 185
    .line 186
    goto/16 :goto_c

    .line 187
    .line 188
    :cond_4
    move-object v15, v8

    .line 189
    move-object v8, v14

    .line 190
    move v14, v3

    .line 191
    move v3, v1

    .line 192
    :goto_3
    if-eq v3, v11, :cond_8

    .line 193
    .line 194
    if-eq v3, v9, :cond_5

    .line 195
    .line 196
    move/from16 p1, v5

    .line 197
    .line 198
    move-object v3, v6

    .line 199
    goto/16 :goto_7

    .line 200
    .line 201
    :cond_5
    move/from16 p1, v5

    .line 202
    .line 203
    move-object v3, v6

    .line 204
    int-to-long v5, v13

    .line 205
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    iput-boolean v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 210
    .line 211
    iput v7, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 212
    .line 213
    sget-object v1, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 214
    .line 215
    move-object v1, v8

    .line 216
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 217
    .line 218
    invoke-virtual {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    const/16 v11, 0x8

    .line 223
    .line 224
    invoke-virtual {v9, v11}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    move/from16 v16, v11

    .line 229
    .line 230
    iget-object v11, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 231
    .line 232
    iget v7, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 233
    .line 234
    add-int/lit8 v17, v7, 0x1

    .line 235
    .line 236
    const/16 v18, 0x38

    .line 237
    .line 238
    ushr-long v18, v5, v18

    .line 239
    .line 240
    const-wide/16 v20, 0xff

    .line 241
    .line 242
    move-object/from16 v23, v11

    .line 243
    .line 244
    and-long v10, v18, v20

    .line 245
    .line 246
    long-to-int v10, v10

    .line 247
    int-to-byte v10, v10

    .line 248
    aput-byte v10, v23, v7

    .line 249
    .line 250
    add-int/lit8 v10, v7, 0x2

    .line 251
    .line 252
    const/16 v11, 0x30

    .line 253
    .line 254
    ushr-long v18, v5, v11

    .line 255
    .line 256
    move-wide/from16 v24, v5

    .line 257
    .line 258
    and-long v4, v18, v20

    .line 259
    .line 260
    long-to-int v4, v4

    .line 261
    int-to-byte v4, v4

    .line 262
    aput-byte v4, v23, v17

    .line 263
    .line 264
    add-int/lit8 v4, v7, 0x3

    .line 265
    .line 266
    const/16 v5, 0x28

    .line 267
    .line 268
    ushr-long v5, v24, v5

    .line 269
    .line 270
    and-long v5, v5, v20

    .line 271
    .line 272
    long-to-int v5, v5

    .line 273
    int-to-byte v5, v5

    .line 274
    aput-byte v5, v23, v10

    .line 275
    .line 276
    add-int/lit8 v5, v7, 0x4

    .line 277
    .line 278
    const/16 v6, 0x20

    .line 279
    .line 280
    ushr-long v17, v24, v6

    .line 281
    .line 282
    and-long v11, v17, v20

    .line 283
    .line 284
    long-to-int v11, v11

    .line 285
    int-to-byte v11, v11

    .line 286
    aput-byte v11, v23, v4

    .line 287
    .line 288
    add-int/lit8 v4, v7, 0x5

    .line 289
    .line 290
    const/16 v11, 0x18

    .line 291
    .line 292
    ushr-long v11, v24, v11

    .line 293
    .line 294
    and-long v11, v11, v20

    .line 295
    .line 296
    long-to-int v11, v11

    .line 297
    int-to-byte v11, v11

    .line 298
    aput-byte v11, v23, v5

    .line 299
    .line 300
    add-int/lit8 v5, v7, 0x6

    .line 301
    .line 302
    const/16 v11, 0x10

    .line 303
    .line 304
    ushr-long v11, v24, v11

    .line 305
    .line 306
    and-long v11, v11, v20

    .line 307
    .line 308
    long-to-int v11, v11

    .line 309
    int-to-byte v11, v11

    .line 310
    aput-byte v11, v23, v4

    .line 311
    .line 312
    add-int/lit8 v4, v7, 0x7

    .line 313
    .line 314
    ushr-long v11, v24, v16

    .line 315
    .line 316
    and-long v11, v11, v20

    .line 317
    .line 318
    long-to-int v11, v11

    .line 319
    int-to-byte v11, v11

    .line 320
    aput-byte v11, v23, v5

    .line 321
    .line 322
    add-int/lit8 v7, v7, 0x8

    .line 323
    .line 324
    and-long v11, v24, v20

    .line 325
    .line 326
    long-to-int v5, v11

    .line 327
    int-to-byte v5, v5

    .line 328
    aput-byte v5, v23, v4

    .line 329
    .line 330
    iput v7, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 331
    .line 332
    iget-wide v4, v9, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 333
    .line 334
    const-wide/16 v11, 0x8

    .line 335
    .line 336
    add-long/2addr v4, v11

    .line 337
    iput-wide v4, v9, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 338
    .line 339
    invoke-static {v1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-ne v1, v2, :cond_6

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_6
    move-object v1, v3

    .line 347
    :goto_4
    if-ne v1, v2, :cond_7

    .line 348
    .line 349
    goto/16 :goto_c

    .line 350
    .line 351
    :cond_7
    move-object v11, v8

    .line 352
    move-object v9, v15

    .line 353
    :goto_5
    move-object v15, v9

    .line 354
    move-object v8, v11

    .line 355
    goto :goto_7

    .line 356
    :cond_8
    move/from16 p1, v5

    .line 357
    .line 358
    move-object v3, v6

    .line 359
    int-to-short v1, v13

    .line 360
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 361
    .line 362
    iput-object v15, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 363
    .line 364
    iput-boolean v14, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->Z$0:Z

    .line 365
    .line 366
    const/4 v11, 0x3

    .line 367
    iput v11, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 368
    .line 369
    invoke-static {v8, v1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;SLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    if-ne v1, v2, :cond_9

    .line 374
    .line 375
    goto/16 :goto_c

    .line 376
    .line 377
    :cond_9
    move-object v9, v15

    .line 378
    :goto_6
    move-object v15, v9

    .line 379
    :goto_7
    iget-object v1, v15, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 380
    .line 381
    array-length v4, v1

    .line 382
    new-instance v9, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 383
    .line 384
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 385
    .line 386
    .line 387
    const/4 v6, 0x0

    .line 388
    invoke-virtual {v9, v1, v6, v4}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->write([BII)V

    .line 389
    .line 390
    .line 391
    const/4 v1, 0x1

    .line 392
    if-ne v14, v1, :cond_c

    .line 393
    .line 394
    sget-object v1, Lkotlin/random/飘花落叶言子楪世兰苏哲;->Default:Lkotlin/random/Random$Default;

    .line 395
    .line 396
    invoke-virtual {v1}, Lkotlin/random/Random$Default;->nextInt()I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    iput-object v8, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v9, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 403
    .line 404
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->I$0:I

    .line 405
    .line 406
    const/4 v4, 0x5

    .line 407
    iput v4, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 408
    .line 409
    invoke-static {v8, v1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    if-ne v4, v2, :cond_a

    .line 414
    .line 415
    goto :goto_c

    .line 416
    :cond_a
    :goto_8
    shr-int/lit8 v4, v1, 0x18

    .line 417
    .line 418
    int-to-byte v4, v4

    .line 419
    shr-int/lit8 v5, v1, 0x10

    .line 420
    .line 421
    int-to-byte v5, v5

    .line 422
    shr-int/lit8 v7, v1, 0x8

    .line 423
    .line 424
    int-to-byte v7, v7

    .line 425
    int-to-byte v1, v1

    .line 426
    const/4 v10, 0x4

    .line 427
    new-array v10, v10, [B

    .line 428
    .line 429
    const/4 v6, 0x0

    .line 430
    aput-byte v4, v10, v6

    .line 431
    .line 432
    const/16 v22, 0x1

    .line 433
    .line 434
    aput-byte v5, v10, v22

    .line 435
    .line 436
    aput-byte v7, v10, p1

    .line 437
    .line 438
    const/4 v11, 0x3

    .line 439
    aput-byte v1, v10, v11

    .line 440
    .line 441
    new-instance v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 442
    .line 443
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-static {v9}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 447
    .line 448
    .line 449
    move-result-wide v4

    .line 450
    long-to-int v4, v4

    .line 451
    move v12, v6

    .line 452
    :goto_9
    if-ge v12, v4, :cond_b

    .line 453
    .line 454
    invoke-interface {v9}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    rem-int/lit8 v6, v12, 0x4

    .line 459
    .line 460
    aget-byte v6, v10, v6

    .line 461
    .line 462
    xor-int/2addr v5, v6

    .line 463
    int-to-byte v5, v5

    .line 464
    invoke-virtual {v1, v5}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(B)V

    .line 465
    .line 466
    .line 467
    add-int/lit8 v12, v12, 0x1

    .line 468
    .line 469
    goto :goto_9

    .line 470
    :cond_b
    move-object v9, v1

    .line 471
    :goto_a
    const/4 v4, 0x0

    .line 472
    goto :goto_b

    .line 473
    :cond_c
    if-nez v14, :cond_e

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :goto_b
    iput-object v4, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$0:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v4, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->L$1:Ljava/lang/Object;

    .line 479
    .line 480
    const/4 v1, 0x6

    .line 481
    iput v1, v0, Lio/ktor/websocket/RawWebSocketCommonKt$writeFrame$1;->label:I

    .line 482
    .line 483
    invoke-static {v8, v9, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    if-ne v0, v2, :cond_d

    .line 488
    .line 489
    :goto_c
    return-object v2

    .line 490
    :cond_d
    return-object v3

    .line 491
    :cond_e
    const/4 v4, 0x0

    .line 492
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 493
    .line 494
    .line 495
    return-object v4

    .line 496
    :pswitch_6
    move-object v4, v8

    .line 497
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    throw v4

    .line 501
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
