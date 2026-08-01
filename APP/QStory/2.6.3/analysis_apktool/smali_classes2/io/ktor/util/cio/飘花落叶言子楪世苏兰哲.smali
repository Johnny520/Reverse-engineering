.class public abstract Lio/ktor/util/cio/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static final 飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SeekableByteChannel;Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    instance-of v4, v3, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;

    .line 13
    .line 14
    iget v5, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->label:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;

    .line 27
    .line 28
    invoke-direct {v4, v3}, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v6, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->label:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const-string v8, ". Should be in 0.."

    .line 39
    .line 40
    const-string v9, "Invalid number of bytes written: "

    .line 41
    .line 42
    const/4 v11, -0x1

    .line 43
    const/4 v12, 0x2

    .line 44
    const/4 v13, 0x1

    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    if-eq v6, v13, :cond_2

    .line 48
    .line 49
    if-ne v6, v12, :cond_1

    .line 50
    .line 51
    iget-wide v0, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->J$0:J

    .line 52
    .line 53
    iget-object v2, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 56
    .line 57
    iget-object v6, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 60
    .line 61
    iget-object v14, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v14, Lkotlin/jvm/internal/Ref$LongRef;

    .line 64
    .line 65
    iget-object v15, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v15, Ljava/nio/channels/SeekableByteChannel;

    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v3, v4

    .line 73
    move-object v4, v2

    .line 74
    move-object v2, v6

    .line 75
    move-object v6, v3

    .line 76
    move-object/from16 v16, v7

    .line 77
    .line 78
    move v7, v13

    .line 79
    move-object v3, v15

    .line 80
    move-object v15, v8

    .line 81
    move v8, v12

    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 85
    .line 86
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v7

    .line 90
    :cond_2
    iget-object v0, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 93
    .line 94
    iget-object v1, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 97
    .line 98
    iget-object v2, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ljava/nio/channels/SeekableByteChannel;

    .line 101
    .line 102
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object v3, v2

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_3
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v14, 0x0

    .line 112
    .line 113
    cmp-long v3, v1, v14

    .line 114
    .line 115
    if-lez v3, :cond_4

    .line 116
    .line 117
    move-object/from16 v3, p0

    .line 118
    .line 119
    invoke-interface {v3, v1, v2}, Ljava/nio/channels/SeekableByteChannel;->position(J)Ljava/nio/channels/SeekableByteChannel;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    move-object/from16 v3, p0

    .line 124
    .line 125
    :goto_1
    const-wide/16 v14, -0x1

    .line 126
    .line 127
    cmp-long v6, p4, v14

    .line 128
    .line 129
    if-nez v6, :cond_b

    .line 130
    .line 131
    iget-object v0, v0, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 132
    .line 133
    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 134
    .line 135
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 136
    .line 137
    .line 138
    move-object/from16 v19, v1

    .line 139
    .line 140
    move-object v1, v0

    .line 141
    move-object/from16 v0, v19

    .line 142
    .line 143
    :goto_2
    iget-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 144
    .line 145
    if-nez v2, :cond_14

    .line 146
    .line 147
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 148
    .line 149
    invoke-virtual {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v13}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    iget-object v12, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 161
    .line 162
    iget v14, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 163
    .line 164
    array-length v15, v12

    .line 165
    sub-int/2addr v15, v14

    .line 166
    invoke-static {v12, v14, v15}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-interface {v3, v12}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-eq v15, v11, :cond_5

    .line 178
    .line 179
    move v15, v13

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    const/4 v15, 0x0

    .line 182
    :goto_3
    xor-int/2addr v15, v13

    .line 183
    iput-boolean v15, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 184
    .line 185
    invoke-virtual {v12}, Ljava/nio/Buffer;->position()I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    sub-int/2addr v12, v14

    .line 190
    if-ne v12, v13, :cond_6

    .line 191
    .line 192
    iget v14, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 193
    .line 194
    add-int/2addr v14, v12

    .line 195
    iput v14, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 196
    .line 197
    iget-wide v14, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 198
    .line 199
    int-to-long v10, v12

    .line 200
    add-long/2addr v14, v10

    .line 201
    iput-wide v14, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    if-ltz v12, :cond_a

    .line 205
    .line 206
    invoke-virtual {v6}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-gt v12, v10, :cond_a

    .line 211
    .line 212
    if-eqz v12, :cond_7

    .line 213
    .line 214
    iget v10, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 215
    .line 216
    add-int/2addr v10, v12

    .line 217
    iput v10, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 218
    .line 219
    iget-wide v10, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 220
    .line 221
    int-to-long v14, v12

    .line 222
    add-long/2addr v10, v14

    .line 223
    iput-wide v10, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_7
    invoke-static {v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_8

    .line 231
    .line 232
    invoke-virtual {v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 233
    .line 234
    .line 235
    :cond_8
    :goto_4
    iput-object v3, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$0:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v1, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$1:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v0, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$2:Ljava/lang/Object;

    .line 240
    .line 241
    iput v13, v4, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->label:I

    .line 242
    .line 243
    invoke-virtual {v1, v4}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-ne v2, v5, :cond_9

    .line 248
    .line 249
    goto/16 :goto_a

    .line 250
    .line 251
    :cond_9
    :goto_5
    const/4 v11, -0x1

    .line 252
    goto :goto_2

    .line 253
    :cond_a
    invoke-static {v12, v9, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v6}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    invoke-static {v0, v1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 262
    .line 263
    .line 264
    return-object v7

    .line 265
    :cond_b
    new-instance v6, Lkotlin/jvm/internal/Ref$LongRef;

    .line 266
    .line 267
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 268
    .line 269
    .line 270
    iput-wide v1, v6, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 271
    .line 272
    iget-object v0, v0, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 273
    .line 274
    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 275
    .line 276
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 277
    .line 278
    .line 279
    move-object v2, v0

    .line 280
    move-object v14, v6

    .line 281
    move-object v6, v4

    .line 282
    move-object v4, v1

    .line 283
    move-wide/from16 v0, p4

    .line 284
    .line 285
    :goto_6
    iget-boolean v10, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 286
    .line 287
    if-nez v10, :cond_14

    .line 288
    .line 289
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 290
    .line 291
    invoke-virtual {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v10, v13}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    iget-object v15, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 303
    .line 304
    move-object/from16 v16, v7

    .line 305
    .line 306
    iget v7, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 307
    .line 308
    array-length v12, v15

    .line 309
    sub-int/2addr v12, v7

    .line 310
    invoke-static {v15, v7, v12}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move/from16 p0, v7

    .line 318
    .line 319
    move-object v15, v8

    .line 320
    iget-wide v7, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 321
    .line 322
    sub-long v7, v0, v7

    .line 323
    .line 324
    const-wide/16 v17, 0x1

    .line 325
    .line 326
    add-long v7, v7, v17

    .line 327
    .line 328
    move/from16 v17, v13

    .line 329
    .line 330
    invoke-virtual {v12}, Ljava/nio/Buffer;->remaining()I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    move-wide/from16 p1, v0

    .line 335
    .line 336
    int-to-long v0, v13

    .line 337
    cmp-long v0, v7, v0

    .line 338
    .line 339
    if-gez v0, :cond_c

    .line 340
    .line 341
    invoke-virtual {v12}, Ljava/nio/Buffer;->limit()I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-virtual {v12}, Ljava/nio/Buffer;->position()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    long-to-int v7, v7

    .line 350
    add-int/2addr v1, v7

    .line 351
    invoke-virtual {v12, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 352
    .line 353
    .line 354
    invoke-interface {v3, v12}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    invoke-virtual {v12, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 359
    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_c
    invoke-interface {v3, v12}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    :goto_7
    if-lez v1, :cond_d

    .line 367
    .line 368
    iget-wide v7, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 369
    .line 370
    move-wide/from16 p3, v7

    .line 371
    .line 372
    int-to-long v7, v1

    .line 373
    add-long v7, p3, v7

    .line 374
    .line 375
    iput-wide v7, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 376
    .line 377
    :cond_d
    const/4 v0, -0x1

    .line 378
    if-eq v1, v0, :cond_e

    .line 379
    .line 380
    iget-wide v7, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 381
    .line 382
    cmp-long v1, v7, p1

    .line 383
    .line 384
    if-gtz v1, :cond_e

    .line 385
    .line 386
    move/from16 v1, v17

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_e
    const/4 v1, 0x0

    .line 390
    :goto_8
    xor-int/lit8 v1, v1, 0x1

    .line 391
    .line 392
    iput-boolean v1, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 393
    .line 394
    invoke-virtual {v12}, Ljava/nio/Buffer;->position()I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    sub-int v1, v1, p0

    .line 399
    .line 400
    move/from16 v7, v17

    .line 401
    .line 402
    if-ne v1, v7, :cond_f

    .line 403
    .line 404
    iget v8, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 405
    .line 406
    add-int/2addr v8, v1

    .line 407
    iput v8, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 408
    .line 409
    iget-wide v11, v10, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 410
    .line 411
    int-to-long v0, v1

    .line 412
    add-long/2addr v11, v0

    .line 413
    iput-wide v11, v10, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_f
    if-ltz v1, :cond_13

    .line 417
    .line 418
    invoke-virtual {v11}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-gt v1, v0, :cond_13

    .line 423
    .line 424
    if-eqz v1, :cond_10

    .line 425
    .line 426
    iget v0, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 427
    .line 428
    add-int/2addr v0, v1

    .line 429
    iput v0, v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 430
    .line 431
    iget-wide v11, v10, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 432
    .line 433
    int-to-long v0, v1

    .line 434
    add-long/2addr v11, v0

    .line 435
    iput-wide v11, v10, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 436
    .line 437
    goto :goto_9

    .line 438
    :cond_10
    invoke-static {v11}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_11

    .line 443
    .line 444
    invoke-virtual {v10}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 445
    .line 446
    .line 447
    :cond_11
    :goto_9
    iput-object v3, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$0:Ljava/lang/Object;

    .line 448
    .line 449
    iput-object v14, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$1:Ljava/lang/Object;

    .line 450
    .line 451
    iput-object v2, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$2:Ljava/lang/Object;

    .line 452
    .line 453
    iput-object v4, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->L$3:Ljava/lang/Object;

    .line 454
    .line 455
    move-wide/from16 v0, p1

    .line 456
    .line 457
    iput-wide v0, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->J$0:J

    .line 458
    .line 459
    const/4 v8, 0x2

    .line 460
    iput v8, v6, Lio/ktor/util/cio/FileChannelsKt$writeToScope$1;->label:I

    .line 461
    .line 462
    invoke-virtual {v2, v6}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    if-ne v10, v5, :cond_12

    .line 467
    .line 468
    :goto_a
    return-object v5

    .line 469
    :cond_12
    :goto_b
    move v13, v7

    .line 470
    move v12, v8

    .line 471
    move-object v8, v15

    .line 472
    move-object/from16 v7, v16

    .line 473
    .line 474
    goto/16 :goto_6

    .line 475
    .line 476
    :cond_13
    invoke-static {v1, v9, v15}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-virtual {v11}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    invoke-static {v0, v1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 485
    .line 486
    .line 487
    return-object v16

    .line 488
    :cond_14
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 489
    .line 490
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/nio/file/Path;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 11

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/nio/file/Files;->size(Ljava/nio/file/Path;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 16
    .line 17
    .line 18
    move-result-object v10

    .line 19
    new-instance v1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 20
    .line 21
    const-string v2, "file-reader"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lio/ktor/util/cio/FileChannelsAtNioPathKt$readChannel$1;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    const-wide/16 v4, -0x1

    .line 36
    .line 37
    move-object v8, p0

    .line 38
    invoke-direct/range {v1 .. v9}, Lio/ktor/util/cio/FileChannelsAtNioPathKt$readChannel$1;-><init>(JJJLjava/nio/file/Path;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v10, v0, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p0, p0, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 46
    .line 47
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/io/File;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 10

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 16
    .line 17
    const/16 v2, 0xf

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 31
    .line 32
    const-string v2, "file-reader"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    const-wide/16 v4, -0x1

    .line 47
    .line 48
    invoke-direct/range {v1 .. v9}, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;-><init>(JJJLkotlin/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 56
    .line 57
    const/16 v1, 0x10

    .line 58
    .line 59
    invoke-direct {v0, v8, v1}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v2, v0, v3}, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 70
    .line 71
    .line 72
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 78
    .line 79
    return-object p0
.end method
