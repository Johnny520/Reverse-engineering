.class public final L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:S

.field public 飘花落叶言子楪世兰苏哲:[I

.field public 飘花落叶言子楪世哲兰苏:[I

.field public 飘花落叶言子楪世哲苏兰:[I

.field public 飘花落叶言子楪世苏兰哲:[I

.field public final synthetic 飘花落叶言子楪世苏哲兰:I

.field public 飘花落叶言子楪苏世兰哲:I

.field public 飘花落叶言子楪苏世哲兰:S

.field public 飘花落叶言子楪苏哲世兰:[I

.field public 飘花落叶言子楪苏哲兰世:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;I)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/16 v5, 0x46

    .line 12
    .line 13
    if-eq v3, v5, :cond_2e

    .line 14
    .line 15
    const/16 v8, 0x4c

    .line 16
    .line 17
    const-string v9, "com/alibaba/fastjson2/reader/FieldReader"

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    if-eq v3, v8, :cond_f

    .line 21
    .line 22
    const v12, 0x400001

    .line 23
    .line 24
    .line 25
    const/16 v13, 0x53

    .line 26
    .line 27
    if-eq v3, v13, :cond_e

    .line 28
    .line 29
    const/16 v14, 0x56

    .line 30
    .line 31
    if-eq v3, v14, :cond_d

    .line 32
    .line 33
    const/16 v14, 0x49

    .line 34
    .line 35
    if-eq v3, v14, :cond_e

    .line 36
    .line 37
    const v15, 0x400004

    .line 38
    .line 39
    .line 40
    const v16, 0x400002

    .line 41
    .line 42
    .line 43
    const/16 v4, 0x4a

    .line 44
    .line 45
    if-eq v3, v4, :cond_c

    .line 46
    .line 47
    const/16 v17, 0x0

    .line 48
    .line 49
    const/16 v6, 0x5a

    .line 50
    .line 51
    if-eq v3, v6, :cond_e

    .line 52
    .line 53
    const v18, 0x400003

    .line 54
    .line 55
    .line 56
    const/high16 v19, 0x800000

    .line 57
    .line 58
    const/16 v7, 0x5b

    .line 59
    .line 60
    if-eq v3, v7, :cond_0

    .line 61
    .line 62
    packed-switch v3, :pswitch_data_0

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 66
    .line 67
    .line 68
    return v17

    .line 69
    :pswitch_0
    return v18

    .line 70
    :cond_0
    add-int/lit8 v3, v2, 0x1

    .line 71
    .line 72
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    if-ne v11, v7, :cond_1

    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eq v7, v5, :cond_b

    .line 86
    .line 87
    if-eq v7, v8, :cond_6

    .line 88
    .line 89
    if-eq v7, v13, :cond_5

    .line 90
    .line 91
    if-eq v7, v6, :cond_4

    .line 92
    .line 93
    if-eq v7, v14, :cond_3

    .line 94
    .line 95
    if-eq v7, v4, :cond_2

    .line 96
    .line 97
    packed-switch v7, :pswitch_data_1

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 101
    .line 102
    .line 103
    return v17

    .line 104
    :pswitch_1
    move/from16 v4, v18

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :pswitch_2
    const v4, 0x40000b

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :pswitch_3
    const v4, 0x40000a

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_2
    move v4, v15

    .line 116
    goto :goto_3

    .line 117
    :cond_3
    move v4, v12

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    const v4, 0x400009

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    const v4, 0x40000c

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    if-nez v2, :cond_8

    .line 128
    .line 129
    const-string v4, "[Lcom/alibaba/fastjson2/writer/FieldWriter;"

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-nez v4, :cond_9

    .line 136
    .line 137
    const-string v4, "[Lcom/alibaba/fastjson2/reader/FieldReader;"

    .line 138
    .line 139
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-nez v4, :cond_7

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    const-string v9, "Lcom/alibaba/fastjson2/reader/FieldReader"

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    :goto_1
    const/4 v9, 0x0

    .line 150
    :cond_9
    :goto_2
    if-nez v9, :cond_a

    .line 151
    .line 152
    add-int/lit8 v4, v3, 0x1

    .line 153
    .line 154
    invoke-static {v10, v4, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    :cond_a
    invoke-virtual {v0, v9}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    or-int v4, v0, v19

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_b
    move/from16 v4, v16

    .line 166
    .line 167
    :goto_3
    sub-int/2addr v3, v2

    .line 168
    shl-int/lit8 v0, v3, 0x1a

    .line 169
    .line 170
    or-int/2addr v0, v4

    .line 171
    return v0

    .line 172
    :cond_c
    return v15

    .line 173
    :cond_d
    const/16 v17, 0x0

    .line 174
    .line 175
    return v17

    .line 176
    :cond_e
    :pswitch_4
    return v12

    .line 177
    :cond_f
    const/16 v17, 0x0

    .line 178
    .line 179
    const/high16 v19, 0x800000

    .line 180
    .line 181
    const/4 v3, 0x3

    .line 182
    const/4 v4, -0x1

    .line 183
    const/4 v5, 0x2

    .line 184
    const-string v6, "java/lang/Class"

    .line 185
    .line 186
    const-string v7, "com/alibaba/fastjson2/reader/ObjectReader"

    .line 187
    .line 188
    const-string v8, "java/lang/String"

    .line 189
    .line 190
    const-string v11, "java/lang/Object"

    .line 191
    .line 192
    if-nez v2, :cond_1c

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    sparse-switch v12, :sswitch_data_0

    .line 199
    .line 200
    .line 201
    goto/16 :goto_5

    .line 202
    .line 203
    :sswitch_0
    const-string v3, "Ljava/lang/reflect/Type;"

    .line 204
    .line 205
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_10

    .line 210
    .line 211
    goto/16 :goto_5

    .line 212
    .line 213
    :cond_10
    const/16 v3, 0xb

    .line 214
    .line 215
    goto/16 :goto_4

    .line 216
    .line 217
    :sswitch_1
    const-string v3, "Ljava/lang/Object;"

    .line 218
    .line 219
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_11

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :cond_11
    const/16 v3, 0xa

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :sswitch_2
    const-string v3, "Ljava/lang/Class;"

    .line 231
    .line 232
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_12

    .line 237
    .line 238
    goto/16 :goto_5

    .line 239
    .line 240
    :cond_12
    const/16 v3, 0x9

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :sswitch_3
    const-string v3, "Ljava/lang/String;"

    .line 244
    .line 245
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-nez v3, :cond_13

    .line 250
    .line 251
    goto/16 :goto_5

    .line 252
    .line 253
    :cond_13
    const/16 v3, 0x8

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :sswitch_4
    const-string v3, "Lcom/alibaba/fastjson2/reader/ObjectReader;"

    .line 257
    .line 258
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-nez v3, :cond_14

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_14
    const/4 v3, 0x7

    .line 266
    goto :goto_4

    .line 267
    :sswitch_5
    const-string v3, "Lcom/alibaba/fastjson2/JSONWriter;"

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-nez v3, :cond_15

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_15
    const/4 v3, 0x6

    .line 277
    goto :goto_4

    .line 278
    :sswitch_6
    const-string v3, "Ljava/util/function/Supplier;"

    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-nez v3, :cond_16

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_16
    const/4 v3, 0x5

    .line 288
    goto :goto_4

    .line 289
    :sswitch_7
    const-string v3, "Ljava/util/List;"

    .line 290
    .line 291
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-nez v3, :cond_17

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_17
    const/4 v3, 0x4

    .line 299
    goto :goto_4

    .line 300
    :sswitch_8
    const-string v5, "Lsun/misc/Unsafe;"

    .line 301
    .line 302
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-nez v5, :cond_18

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_18
    :goto_4
    move v4, v3

    .line 310
    goto :goto_5

    .line 311
    :sswitch_9
    const-string v3, "Lcom/alibaba/fastjson2/JSONReader;"

    .line 312
    .line 313
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_19

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_19
    move v4, v5

    .line 321
    goto :goto_5

    .line 322
    :sswitch_a
    const-string v3, "Lcom/alibaba/fastjson2/reader/FieldReader;"

    .line 323
    .line 324
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-nez v3, :cond_1a

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_1a
    move v4, v10

    .line 332
    goto :goto_5

    .line 333
    :sswitch_b
    const-string v3, "Lcom/alibaba/fastjson2/writer/FieldWriter;"

    .line 334
    .line 335
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-nez v3, :cond_1b

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_1b
    move/from16 v4, v17

    .line 343
    .line 344
    :goto_5
    packed-switch v4, :pswitch_data_2

    .line 345
    .line 346
    .line 347
    :goto_6
    const/4 v9, 0x0

    .line 348
    goto :goto_7

    .line 349
    :pswitch_5
    const-string v9, "java/lang/reflect/Type"

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :pswitch_6
    move-object v9, v11

    .line 353
    goto :goto_7

    .line 354
    :pswitch_7
    move-object v9, v6

    .line 355
    goto :goto_7

    .line 356
    :pswitch_8
    move-object v9, v8

    .line 357
    goto :goto_7

    .line 358
    :pswitch_9
    move-object v9, v7

    .line 359
    goto :goto_7

    .line 360
    :pswitch_a
    const-string v9, "com/alibaba/fastjson2/JSONWriter"

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :pswitch_b
    const-string v9, "java/util/function/Supplier"

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :pswitch_c
    const-string v9, "java/util/List"

    .line 367
    .line 368
    goto :goto_7

    .line 369
    :pswitch_d
    const-string v9, "sun/misc/Unsafe"

    .line 370
    .line 371
    goto :goto_7

    .line 372
    :pswitch_e
    const-string v9, "com/alibaba/fastjson2/JSONReader"

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :pswitch_f
    const-string v9, "com/alibaba/fastjson2/writer/FieldWriter"

    .line 376
    .line 377
    :goto_7
    :pswitch_10
    move-object v11, v9

    .line 378
    goto/16 :goto_e

    .line 379
    .line 380
    :cond_1c
    if-ne v2, v5, :cond_1e

    .line 381
    .line 382
    const-string v3, "()Ljava/lang/Class;"

    .line 383
    .line 384
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    if-nez v3, :cond_1d

    .line 389
    .line 390
    const-string v3, "()Ljava/lang/String;"

    .line 391
    .line 392
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-nez v3, :cond_2a

    .line 397
    .line 398
    goto/16 :goto_d

    .line 399
    .line 400
    :cond_1d
    move-object v11, v6

    .line 401
    goto/16 :goto_e

    .line 402
    .line 403
    :cond_1e
    if-ne v2, v3, :cond_22

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    sparse-switch v3, :sswitch_data_1

    .line 410
    .line 411
    .line 412
    :goto_8
    move v6, v4

    .line 413
    goto :goto_9

    .line 414
    :sswitch_c
    const-string v3, "(I)Ljava/lang/Integer;"

    .line 415
    .line 416
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-nez v3, :cond_1f

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_1f
    move v6, v5

    .line 424
    goto :goto_9

    .line 425
    :sswitch_d
    const-string v3, "(I)Ljava/lang/Object;"

    .line 426
    .line 427
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-nez v3, :cond_20

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_20
    move v6, v10

    .line 435
    goto :goto_9

    .line 436
    :sswitch_e
    const-string v3, "(J)Lcom/alibaba/fastjson2/reader/FieldReader;"

    .line 437
    .line 438
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-nez v3, :cond_21

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_21
    move/from16 v6, v17

    .line 446
    .line 447
    :goto_9
    packed-switch v6, :pswitch_data_3

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :pswitch_11
    const-string v9, "java/lang/Integer"

    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_22
    const/16 v6, 0x24

    .line 455
    .line 456
    if-ne v2, v6, :cond_24

    .line 457
    .line 458
    const-string v3, "(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;"

    .line 459
    .line 460
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    if-nez v3, :cond_2c

    .line 465
    .line 466
    const-string v3, "(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;"

    .line 467
    .line 468
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-nez v3, :cond_23

    .line 473
    .line 474
    goto/16 :goto_d

    .line 475
    .line 476
    :cond_23
    move-object v11, v7

    .line 477
    goto/16 :goto_e

    .line 478
    .line 479
    :cond_24
    const/16 v6, 0x36

    .line 480
    .line 481
    if-ne v2, v6, :cond_25

    .line 482
    .line 483
    const-string v3, "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;"

    .line 484
    .line 485
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-nez v3, :cond_23

    .line 490
    .line 491
    const-string v3, "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;"

    .line 492
    .line 493
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-nez v3, :cond_2c

    .line 498
    .line 499
    goto/16 :goto_d

    .line 500
    .line 501
    :cond_25
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 502
    .line 503
    .line 504
    move-result v6

    .line 505
    sparse-switch v6, :sswitch_data_2

    .line 506
    .line 507
    .line 508
    :goto_a
    move v6, v4

    .line 509
    goto :goto_b

    .line 510
    :sswitch_f
    const-string v5, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;"

    .line 511
    .line 512
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-nez v5, :cond_26

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_26
    move v6, v3

    .line 520
    goto :goto_b

    .line 521
    :sswitch_10
    const-string v3, "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;"

    .line 522
    .line 523
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    if-nez v3, :cond_27

    .line 528
    .line 529
    goto :goto_a

    .line 530
    :cond_27
    move v6, v5

    .line 531
    goto :goto_b

    .line 532
    :sswitch_11
    const-string v3, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;"

    .line 533
    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-nez v3, :cond_28

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_28
    move v6, v10

    .line 542
    goto :goto_b

    .line 543
    :sswitch_12
    const-string v3, "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;"

    .line 544
    .line 545
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    if-nez v3, :cond_29

    .line 550
    .line 551
    goto :goto_a

    .line 552
    :cond_29
    move/from16 v6, v17

    .line 553
    .line 554
    :goto_b
    const-string v3, "com/alibaba/fastjson2/writer/ObjectWriter"

    .line 555
    .line 556
    packed-switch v6, :pswitch_data_4

    .line 557
    .line 558
    .line 559
    goto :goto_d

    .line 560
    :pswitch_12
    const/16 v4, 0x35

    .line 561
    .line 562
    if-ne v2, v4, :cond_2b

    .line 563
    .line 564
    :goto_c
    move-object v11, v3

    .line 565
    goto :goto_e

    .line 566
    :pswitch_13
    const/16 v3, 0x3e

    .line 567
    .line 568
    if-ne v2, v3, :cond_2b

    .line 569
    .line 570
    :cond_2a
    move-object v11, v8

    .line 571
    goto :goto_e

    .line 572
    :pswitch_14
    const/16 v4, 0x3c

    .line 573
    .line 574
    if-ne v2, v4, :cond_2b

    .line 575
    .line 576
    goto :goto_c

    .line 577
    :pswitch_15
    const/16 v3, 0x4f

    .line 578
    .line 579
    if-ne v2, v3, :cond_2b

    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_2b
    :goto_d
    const/4 v11, 0x0

    .line 583
    :cond_2c
    :goto_e
    if-nez v11, :cond_2d

    .line 584
    .line 585
    add-int/2addr v2, v10

    .line 586
    invoke-static {v10, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    :cond_2d
    invoke-virtual {v0, v11}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    or-int v0, v0, v19

    .line 595
    .line 596
    return v0

    .line 597
    :cond_2e
    const v16, 0x400002

    .line 598
    .line 599
    .line 600
    return v16

    .line 601
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    :sswitch_data_0
    .sparse-switch
        -0x5f90b664 -> :sswitch_b
        -0x1ce01304 -> :sswitch_a
        -0x1960e9e -> :sswitch_9
        0x7ca041 -> :sswitch_8
        0x7865b31 -> :sswitch_7
        0x11b14ee4 -> :sswitch_6
        0x1d901bb2 -> :sswitch_5
        0x39486bdb -> :sswitch_4
        0x523beb0a -> :sswitch_3
        0x5a7e2503 -> :sswitch_2
        0x5f790d9c -> :sswitch_1
        0x7a59cb2f -> :sswitch_0
    .end sparse-switch

    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_10
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    :sswitch_data_1
    .sparse-switch
        0x1c0f8383 -> :sswitch_e
        0x54cf32c4 -> :sswitch_d
        0x61acf5d5 -> :sswitch_c
    .end sparse-switch

    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_6
        :pswitch_11
    .end packed-switch

    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    :sswitch_data_2
    .sparse-switch
        -0x3c3d4970 -> :sswitch_12
        -0xfb4ac65 -> :sswitch_11
        0x8e7ba93 -> :sswitch_10
        0x62ac16fb -> :sswitch_f
    .end sparse-switch

    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世兰苏哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v4, 0x46

    .line 10
    .line 11
    if-eq v2, v4, :cond_c

    .line 12
    .line 13
    const/high16 v5, 0x2000000

    .line 14
    .line 15
    const/16 v6, 0x4c

    .line 16
    .line 17
    if-eq v2, v6, :cond_b

    .line 18
    .line 19
    const v7, 0x1000001

    .line 20
    .line 21
    .line 22
    const/16 v8, 0x53

    .line 23
    .line 24
    if-eq v2, v8, :cond_a

    .line 25
    .line 26
    const/16 v9, 0x56

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-eq v2, v9, :cond_9

    .line 30
    .line 31
    const/16 v9, 0x49

    .line 32
    .line 33
    if-eq v2, v9, :cond_a

    .line 34
    .line 35
    const v11, 0x1000004

    .line 36
    .line 37
    .line 38
    const/16 v12, 0x4a

    .line 39
    .line 40
    if-eq v2, v12, :cond_8

    .line 41
    .line 42
    const/16 v13, 0x5a

    .line 43
    .line 44
    if-eq v2, v13, :cond_a

    .line 45
    .line 46
    const v14, 0x1000003

    .line 47
    .line 48
    .line 49
    const/16 v15, 0x5b

    .line 50
    .line 51
    if-eq v2, v15, :cond_0

    .line 52
    .line 53
    packed-switch v2, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 57
    .line 58
    .line 59
    return v10

    .line 60
    :pswitch_0
    return v14

    .line 61
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 62
    .line 63
    const v16, 0x1000002

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ne v3, v15, :cond_1

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eq v3, v4, :cond_7

    .line 80
    .line 81
    if-eq v3, v6, :cond_6

    .line 82
    .line 83
    if-eq v3, v8, :cond_5

    .line 84
    .line 85
    if-eq v3, v13, :cond_4

    .line 86
    .line 87
    if-eq v3, v9, :cond_3

    .line 88
    .line 89
    if-eq v3, v12, :cond_2

    .line 90
    .line 91
    packed-switch v3, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 95
    .line 96
    .line 97
    return v10

    .line 98
    :pswitch_1
    move v3, v14

    .line 99
    goto :goto_1

    .line 100
    :pswitch_2
    const v3, 0x100000b

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_3
    const v3, 0x100000a

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    move v3, v11

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move v3, v7

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    const v3, 0x1000009

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    const v3, 0x100000c

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    add-int/lit8 v4, v4, -0x1

    .line 127
    .line 128
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    or-int v3, v0, v5

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    move/from16 v3, v16

    .line 140
    .line 141
    :goto_1
    sub-int v2, v2, p2

    .line 142
    .line 143
    shl-int/lit8 v0, v2, 0x1c

    .line 144
    .line 145
    or-int/2addr v0, v3

    .line 146
    return v0

    .line 147
    :cond_8
    return v11

    .line 148
    :cond_9
    return v10

    .line 149
    :cond_a
    :pswitch_4
    return v7

    .line 150
    :cond_b
    add-int/lit8 v2, p2, 0x1

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    add-int/lit8 v3, v3, -0x1

    .line 157
    .line 158
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    or-int/2addr v0, v5

    .line 167
    return v0

    .line 168
    :cond_c
    const v16, 0x1000002

    .line 169
    .line 170
    .line 171
    return v16

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static 飘花落叶言子楪苏兰世哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;I[II)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    aget v2, p2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_7

    .line 11
    .line 12
    :cond_0
    const v4, 0xfffffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v1

    .line 16
    const v5, 0x1000005

    .line 17
    .line 18
    .line 19
    if-ne v4, v5, :cond_2

    .line 20
    .line 21
    if-ne v2, v5, :cond_1

    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_1
    move v1, v5

    .line 26
    :cond_2
    const/4 v4, 0x1

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    aput v1, p2, p3

    .line 30
    .line 31
    return v4

    .line 32
    :cond_3
    const/high16 v6, -0x10000000

    .line 33
    .line 34
    and-int v7, v2, v6

    .line 35
    .line 36
    const/high16 v8, 0x1000000

    .line 37
    .line 38
    const/high16 v9, 0xf000000

    .line 39
    .line 40
    const/high16 v10, 0x2000000

    .line 41
    .line 42
    if-nez v7, :cond_7

    .line 43
    .line 44
    and-int v11, v2, v9

    .line 45
    .line 46
    if-ne v11, v10, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-ne v2, v5, :cond_14

    .line 50
    .line 51
    and-int v0, v1, v6

    .line 52
    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    and-int v0, v1, v9

    .line 56
    .line 57
    if-ne v0, v10, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    move v1, v8

    .line 61
    :cond_6
    :goto_0
    move v8, v1

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_7
    :goto_1
    if-ne v1, v5, :cond_8

    .line 65
    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_8
    const/high16 v5, -0x1000000

    .line 69
    .line 70
    and-int v11, v1, v5

    .line 71
    .line 72
    and-int/2addr v5, v2

    .line 73
    const-string v12, "java/lang/Object"

    .line 74
    .line 75
    if-ne v11, v5, :cond_10

    .line 76
    .line 77
    and-int v5, v2, v9

    .line 78
    .line 79
    if-ne v5, v10, :cond_f

    .line 80
    .line 81
    and-int v5, v1, v6

    .line 82
    .line 83
    or-int/2addr v5, v10

    .line 84
    const v6, 0xfffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v6

    .line 88
    and-int/2addr v6, v2

    .line 89
    int-to-long v7, v1

    .line 90
    int-to-long v9, v6

    .line 91
    const/16 v11, 0x20

    .line 92
    .line 93
    shl-long/2addr v9, v11

    .line 94
    or-long v16, v7, v9

    .line 95
    .line 96
    add-int v7, v1, v6

    .line 97
    .line 98
    const v8, 0x7fffffff

    .line 99
    .line 100
    .line 101
    const/16 v9, 0x82

    .line 102
    .line 103
    add-int/2addr v7, v9

    .line 104
    and-int/2addr v7, v8

    .line 105
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    :goto_2
    if-eqz v8, :cond_a

    .line 110
    .line 111
    iget v10, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 112
    .line 113
    if-ne v10, v9, :cond_9

    .line 114
    .line 115
    iget v10, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 116
    .line 117
    if-ne v10, v7, :cond_9

    .line 118
    .line 119
    iget-wide v10, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 120
    .line 121
    cmp-long v10, v10, v16

    .line 122
    .line 123
    if-nez v10, :cond_9

    .line 124
    .line 125
    iget v0, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 126
    .line 127
    goto/16 :goto_4

    .line 128
    .line 129
    :cond_9
    iget-object v8, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_a
    iget-object v8, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 135
    .line 136
    aget-object v1, v8, v1

    .line 137
    .line 138
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 139
    .line 140
    aget-object v6, v8, v6

    .line 141
    .line 142
    iget-object v6, v6, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 143
    .line 144
    const-class v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    const/16 v9, 0x2e

    .line 151
    .line 152
    const/16 v10, 0x2f

    .line 153
    .line 154
    :try_start_0
    invoke-virtual {v1, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-static {v11, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 162
    :try_start_1
    invoke-virtual {v6, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    invoke-static {v13, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 170
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_b

    .line 175
    .line 176
    move-object v12, v1

    .line 177
    goto :goto_3

    .line 178
    :cond_b
    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_c

    .line 183
    .line 184
    move-object v12, v6

    .line 185
    goto :goto_3

    .line 186
    :cond_c
    invoke-virtual {v11}, Ljava/lang/Class;->isInterface()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_e

    .line 191
    .line 192
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_d

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_d
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_d

    .line 208
    .line 209
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v1, v9, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    :cond_e
    :goto_3
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    new-instance v13, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 222
    .line 223
    iget v14, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 224
    .line 225
    const/16 v15, 0x82

    .line 226
    .line 227
    move/from16 v18, v7

    .line 228
    .line 229
    invoke-direct/range {v13 .. v18}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IIJI)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 233
    .line 234
    .line 235
    iput v1, v13, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 236
    .line 237
    move v0, v1

    .line 238
    :goto_4
    or-int v8, v5, v0

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :catch_0
    move-exception v0

    .line 242
    new-instance v1, Ljava/lang/TypeNotPresentException;

    .line 243
    .line 244
    invoke-direct {v1, v6, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    throw v1

    .line 248
    :catch_1
    move-exception v0

    .line 249
    new-instance v2, Ljava/lang/TypeNotPresentException;

    .line 250
    .line 251
    invoke-direct {v2, v1, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    throw v2

    .line 255
    :cond_f
    and-int/2addr v1, v6

    .line 256
    add-int/2addr v1, v6

    .line 257
    or-int/2addr v1, v10

    .line 258
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    :goto_5
    or-int v8, v1, v0

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_10
    and-int v5, v1, v6

    .line 266
    .line 267
    if-nez v5, :cond_11

    .line 268
    .line 269
    and-int v11, v1, v9

    .line 270
    .line 271
    if-ne v11, v10, :cond_14

    .line 272
    .line 273
    :cond_11
    if-eqz v5, :cond_12

    .line 274
    .line 275
    and-int/2addr v1, v9

    .line 276
    if-eq v1, v10, :cond_12

    .line 277
    .line 278
    add-int/2addr v5, v6

    .line 279
    :cond_12
    if-eqz v7, :cond_13

    .line 280
    .line 281
    and-int v1, v2, v9

    .line 282
    .line 283
    if-eq v1, v10, :cond_13

    .line 284
    .line 285
    add-int/2addr v7, v6

    .line 286
    :cond_13
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    or-int/2addr v1, v10

    .line 291
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    goto :goto_5

    .line 296
    :cond_14
    :goto_6
    if-eq v8, v2, :cond_15

    .line 297
    .line 298
    aput v8, p2, p3

    .line 299
    .line 300
    return v4

    .line 301
    :cond_15
    :goto_7
    return v3
.end method

.method public static 飘花落叶言子楪苏兰哲世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;I[II)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    aget v2, p2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    const v4, 0x3ffffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v1

    .line 16
    const v5, 0x400005

    .line 17
    .line 18
    .line 19
    if-ne v4, v5, :cond_2

    .line 20
    .line 21
    if-ne v2, v5, :cond_1

    .line 22
    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_1
    move v1, v5

    .line 26
    :cond_2
    const/4 v4, 0x1

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    aput v1, p2, p3

    .line 30
    .line 31
    return v4

    .line 32
    :cond_3
    const/high16 v6, -0x4000000

    .line 33
    .line 34
    and-int v7, v2, v6

    .line 35
    .line 36
    const/high16 v8, 0x400000

    .line 37
    .line 38
    const/high16 v9, 0x3c00000

    .line 39
    .line 40
    const/high16 v10, 0x800000

    .line 41
    .line 42
    if-nez v7, :cond_7

    .line 43
    .line 44
    and-int v11, v2, v9

    .line 45
    .line 46
    if-ne v11, v10, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-ne v2, v5, :cond_5

    .line 50
    .line 51
    and-int v0, v1, v6

    .line 52
    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    and-int v0, v1, v9

    .line 56
    .line 57
    if-ne v0, v10, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    move v1, v8

    .line 61
    :cond_6
    :goto_0
    move v8, v1

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_7
    :goto_1
    if-ne v1, v5, :cond_8

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_8
    const/high16 v5, -0x400000

    .line 69
    .line 70
    and-int v11, v1, v5

    .line 71
    .line 72
    and-int/2addr v5, v2

    .line 73
    const-string v12, "java/lang/Object"

    .line 74
    .line 75
    if-ne v11, v5, :cond_13

    .line 76
    .line 77
    and-int v5, v2, v9

    .line 78
    .line 79
    if-ne v5, v10, :cond_12

    .line 80
    .line 81
    and-int v5, v1, v6

    .line 82
    .line 83
    or-int/2addr v5, v10

    .line 84
    const v6, 0xfffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v6

    .line 88
    and-int/2addr v6, v2

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/16 v7, 0x20

    .line 93
    .line 94
    if-ge v1, v6, :cond_9

    .line 95
    .line 96
    int-to-long v8, v1

    .line 97
    int-to-long v10, v6

    .line 98
    :goto_2
    shl-long/2addr v10, v7

    .line 99
    or-long v7, v8, v10

    .line 100
    .line 101
    move-wide/from16 v19, v7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    int-to-long v8, v6

    .line 105
    int-to-long v10, v1

    .line 106
    goto :goto_2

    .line 107
    :goto_3
    add-int/lit16 v7, v1, 0x82

    .line 108
    .line 109
    add-int/2addr v7, v6

    .line 110
    const v8, 0x7fffffff

    .line 111
    .line 112
    .line 113
    and-int/2addr v7, v8

    .line 114
    iget-object v8, v0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 115
    .line 116
    array-length v9, v8

    .line 117
    rem-int v9, v7, v9

    .line 118
    .line 119
    aget-object v8, v8, v9

    .line 120
    .line 121
    :goto_4
    if-eqz v8, :cond_b

    .line 122
    .line 123
    iget v9, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 124
    .line 125
    const/16 v10, 0x82

    .line 126
    .line 127
    if-ne v9, v10, :cond_a

    .line 128
    .line 129
    iget v9, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 130
    .line 131
    if-ne v9, v7, :cond_a

    .line 132
    .line 133
    iget-wide v9, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 134
    .line 135
    cmp-long v9, v9, v19

    .line 136
    .line 137
    if-nez v9, :cond_a

    .line 138
    .line 139
    iget v0, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 140
    .line 141
    goto/16 :goto_6

    .line 142
    .line 143
    :cond_a
    iget-object v8, v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_b
    iget-object v8, v0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 149
    .line 150
    aget-object v1, v8, v1

    .line 151
    .line 152
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 153
    .line 154
    aget-object v6, v8, v6

    .line 155
    .line 156
    iget-object v6, v6, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v8, v0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;

    .line 159
    .line 160
    invoke-virtual {v8, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    if-eqz v9, :cond_11

    .line 165
    .line 166
    invoke-virtual {v8, v6}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    if-nez v8, :cond_c

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_c
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    if-eqz v10, :cond_d

    .line 178
    .line 179
    move-object v12, v1

    .line 180
    goto :goto_5

    .line 181
    :cond_d
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_e

    .line 186
    .line 187
    move-object v12, v6

    .line 188
    goto :goto_5

    .line 189
    :cond_e
    invoke-virtual {v9}, Ljava/lang/Class;->isInterface()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_10

    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_f

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_f
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_f

    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const/16 v6, 0x2e

    .line 217
    .line 218
    const/16 v8, 0x2f

    .line 219
    .line 220
    invoke-virtual {v1, v6, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    :cond_10
    :goto_5
    invoke-virtual {v0, v12}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    new-instance v13, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 229
    .line 230
    iget v14, v0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 231
    .line 232
    const/16 v18, 0x0

    .line 233
    .line 234
    const/16 v22, 0x1

    .line 235
    .line 236
    const/16 v15, 0x82

    .line 237
    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    move/from16 v21, v7

    .line 243
    .line 244
    invoke-direct/range {v13 .. v22}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v13}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 248
    .line 249
    .line 250
    iput v1, v13, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 251
    .line 252
    move v0, v1

    .line 253
    :goto_6
    or-int v8, v5, v0

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_11
    const-string v0, "class not found "

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return v3

    .line 266
    :cond_12
    and-int/2addr v1, v6

    .line 267
    add-int/2addr v1, v6

    .line 268
    or-int/2addr v1, v10

    .line 269
    invoke-virtual {v0, v12}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    :goto_7
    or-int v8, v1, v0

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_13
    and-int v5, v1, v6

    .line 277
    .line 278
    if-nez v5, :cond_14

    .line 279
    .line 280
    and-int v11, v1, v9

    .line 281
    .line 282
    if-ne v11, v10, :cond_17

    .line 283
    .line 284
    :cond_14
    if-eqz v5, :cond_15

    .line 285
    .line 286
    and-int/2addr v1, v9

    .line 287
    if-eq v1, v10, :cond_15

    .line 288
    .line 289
    add-int/2addr v5, v6

    .line 290
    :cond_15
    if-eqz v7, :cond_16

    .line 291
    .line 292
    and-int v1, v2, v9

    .line 293
    .line 294
    if-eq v1, v10, :cond_16

    .line 295
    .line 296
    add-int/2addr v7, v6

    .line 297
    :cond_16
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    or-int/2addr v1, v10

    .line 302
    invoke-virtual {v0, v12}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    goto :goto_7

    .line 307
    :cond_17
    :goto_8
    if-eq v8, v2, :cond_18

    .line 308
    .line 309
    aput v8, p2, p3

    .line 310
    .line 311
    return v4

    .line 312
    :cond_18
    :goto_9
    return v3
.end method


# virtual methods
.method public 飘花落叶言子楪世哲兰苏(IIL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const/4 v10, 0x3

    .line 12
    const/4 v11, 0x4

    .line 13
    const/16 v12, 0x5b

    .line 14
    .line 15
    const v13, 0x400002

    .line 16
    .line 17
    .line 18
    const/4 v14, 0x2

    .line 19
    const/4 v15, 0x0

    .line 20
    const/high16 v16, 0x100000

    .line 21
    .line 22
    const v6, 0x400003

    .line 23
    .line 24
    .line 25
    const/high16 v17, 0x800000

    .line 26
    .line 27
    const/high16 v18, 0x3c00000

    .line 28
    .line 29
    const v9, 0x400001

    .line 30
    .line 31
    .line 32
    const v5, 0x400004

    .line 33
    .line 34
    .line 35
    const/high16 v7, 0x400000

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    packed-switch v1, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    :pswitch_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-ne v2, v12, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    or-int v1, v1, v17

    .line 65
    .line 66
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ne v2, v12, :cond_1

    .line 80
    .line 81
    const-string v2, "["

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    const/high16 v2, 0x4800000

    .line 92
    .line 93
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    or-int/2addr v1, v2

    .line 98
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    iget-object v10, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/16 v3, 0x81

    .line 112
    .line 113
    add-int/2addr v1, v3

    .line 114
    add-int/2addr v1, v2

    .line 115
    const v5, 0x7fffffff

    .line 116
    .line 117
    .line 118
    and-int v13, v1, v5

    .line 119
    .line 120
    iget-object v1, v4, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 121
    .line 122
    array-length v5, v1

    .line 123
    rem-int v5, v13, v5

    .line 124
    .line 125
    aget-object v1, v1, v5

    .line 126
    .line 127
    :goto_0
    if-eqz v1, :cond_3

    .line 128
    .line 129
    iget v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 130
    .line 131
    if-ne v5, v3, :cond_2

    .line 132
    .line 133
    iget v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 134
    .line 135
    if-ne v5, v13, :cond_2

    .line 136
    .line 137
    iget-wide v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 138
    .line 139
    int-to-long v7, v2

    .line 140
    cmp-long v5, v5, v7

    .line 141
    .line 142
    if-nez v5, :cond_2

    .line 143
    .line 144
    iget-object v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_2

    .line 151
    .line 152
    iget v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_3
    new-instance v5, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 161
    .line 162
    iget v6, v4, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 163
    .line 164
    int-to-long v11, v2

    .line 165
    const/4 v14, 0x1

    .line 166
    const/16 v7, 0x81

    .line 167
    .line 168
    const/4 v8, 0x0

    .line 169
    const/4 v9, 0x0

    .line 170
    invoke-direct/range {v5 .. v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v5}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    :goto_1
    const/high16 v2, 0xc00000

    .line 178
    .line 179
    or-int/2addr v1, v2

    .line 180
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_4
    iget-object v2, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const/16 v2, 0xb8

    .line 190
    .line 191
    if-eq v1, v2, :cond_6

    .line 192
    .line 193
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    const/16 v5, 0xb7

    .line 198
    .line 199
    if-ne v1, v5, :cond_6

    .line 200
    .line 201
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    const/16 v5, 0x3c

    .line 208
    .line 209
    if-ne v1, v5, :cond_6

    .line 210
    .line 211
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 212
    .line 213
    if-nez v1, :cond_4

    .line 214
    .line 215
    new-array v1, v14, [I

    .line 216
    .line 217
    iput-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 218
    .line 219
    :cond_4
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 220
    .line 221
    array-length v1, v1

    .line 222
    iget v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 223
    .line 224
    if-lt v5, v1, :cond_5

    .line 225
    .line 226
    add-int/2addr v5, v8

    .line 227
    mul-int/lit8 v6, v1, 0x2

    .line 228
    .line 229
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    new-array v5, v5, [I

    .line 234
    .line 235
    iget-object v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 236
    .line 237
    invoke-static {v6, v15, v5, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 238
    .line 239
    .line 240
    iput-object v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 241
    .line 242
    :cond_5
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 243
    .line 244
    iget v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 245
    .line 246
    add-int/lit8 v6, v5, 0x1

    .line 247
    .line 248
    iput v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 249
    .line 250
    aput v2, v1, v5

    .line 251
    .line 252
    :cond_6
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :pswitch_5
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_6
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_7
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 277
    .line 278
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_8
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_9
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_a
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_b
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_c
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_d
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :pswitch_e
    invoke-virtual {v0, v2, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_f
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_10
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :pswitch_11
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_12
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_13
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :pswitch_14
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :pswitch_15
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_16
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :pswitch_17
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-virtual {v0, v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 420
    .line 421
    .line 422
    add-int/lit8 v1, v2, 0x1

    .line 423
    .line 424
    invoke-virtual {v0, v1, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 425
    .line 426
    .line 427
    if-lez v2, :cond_e

    .line 428
    .line 429
    add-int/lit8 v1, v2, -0x1

    .line 430
    .line 431
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-eq v2, v5, :cond_9

    .line 436
    .line 437
    if-ne v2, v6, :cond_7

    .line 438
    .line 439
    goto :goto_2

    .line 440
    :cond_7
    and-int v3, v2, v18

    .line 441
    .line 442
    const/high16 v4, 0x1000000

    .line 443
    .line 444
    if-eq v3, v4, :cond_8

    .line 445
    .line 446
    const/high16 v4, 0x1400000

    .line 447
    .line 448
    if-ne v3, v4, :cond_e

    .line 449
    .line 450
    :cond_8
    or-int v2, v2, v16

    .line 451
    .line 452
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :cond_9
    :goto_2
    invoke-virtual {v0, v1, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 457
    .line 458
    .line 459
    return-void

    .line 460
    :pswitch_18
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual {v0, v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 465
    .line 466
    .line 467
    if-lez v2, :cond_e

    .line 468
    .line 469
    add-int/lit8 v1, v2, -0x1

    .line 470
    .line 471
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eq v2, v5, :cond_c

    .line 476
    .line 477
    if-ne v2, v6, :cond_a

    .line 478
    .line 479
    goto :goto_3

    .line 480
    :cond_a
    and-int v3, v2, v18

    .line 481
    .line 482
    const/high16 v4, 0x1000000

    .line 483
    .line 484
    if-eq v3, v4, :cond_b

    .line 485
    .line 486
    const/high16 v4, 0x1400000

    .line 487
    .line 488
    if-ne v3, v4, :cond_e

    .line 489
    .line 490
    :cond_b
    or-int v2, v2, v16

    .line 491
    .line 492
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :cond_c
    :goto_3
    invoke-virtual {v0, v1, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_19
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    const v2, 0x400005

    .line 508
    .line 509
    .line 510
    if-ne v1, v2, :cond_d

    .line 511
    .line 512
    goto :goto_4

    .line 513
    :cond_d
    const/high16 v2, -0x4000000

    .line 514
    .line 515
    add-int/2addr v1, v2

    .line 516
    :goto_4
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_1a
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :pswitch_1b
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :pswitch_1c
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_1d
    iget v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 546
    .line 547
    packed-switch v1, :pswitch_data_1

    .line 548
    .line 549
    .line 550
    packed-switch v1, :pswitch_data_2

    .line 551
    .line 552
    .line 553
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_1e
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 558
    .line 559
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_1f
    const-string v1, "java/lang/invoke/MethodType"

    .line 564
    .line 565
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    or-int v1, v1, v17

    .line 570
    .line 571
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :pswitch_20
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 576
    .line 577
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    or-int v1, v1, v17

    .line 582
    .line 583
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :pswitch_21
    const-string v1, "java/lang/String"

    .line 588
    .line 589
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    or-int v1, v1, v17

    .line 594
    .line 595
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_22
    const-string v1, "java/lang/Class"

    .line 600
    .line 601
    invoke-virtual {v4, v1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    or-int v1, v1, v17

    .line 606
    .line 607
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :pswitch_23
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :pswitch_24
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :pswitch_25
    invoke-virtual {v0, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_26
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :pswitch_27
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 637
    .line 638
    .line 639
    return-void

    .line 640
    :pswitch_28
    invoke-virtual {v0, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :pswitch_29
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :pswitch_2a
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 652
    .line 653
    .line 654
    return-void

    .line 655
    :pswitch_2b
    const v2, 0x400005

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 659
    .line 660
    .line 661
    :cond_e
    :pswitch_2c
    return-void

    .line 662
    nop

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_29
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_2a
        :pswitch_2a
        :pswitch_1d
        :pswitch_0
        :pswitch_0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_1c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1b
        :pswitch_1a
        :pswitch_0
        :pswitch_0
        :pswitch_19
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_16
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_0
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_1b
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_1b
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_1b
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_1b
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_1b
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_1b
        :pswitch_f
        :pswitch_1b
        :pswitch_f
        :pswitch_1b
        :pswitch_f
        :pswitch_1b
        :pswitch_10
        :pswitch_1b
        :pswitch_10
        :pswitch_1b
        :pswitch_10
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_1b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_d
        :pswitch_0
        :pswitch_1b
        :pswitch_1a
        :pswitch_0
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_9
        :pswitch_1b
        :pswitch_1b
        :pswitch_9
        :pswitch_9
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_2c
        :pswitch_0
        :pswitch_0
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_2c
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_a
        :pswitch_15
        :pswitch_1
        :pswitch_a
        :pswitch_15
        :pswitch_15
        :pswitch_0
        :pswitch_0
        :pswitch_15
        :pswitch_15
    .end packed-switch

    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch

    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    :pswitch_data_2
    .packed-switch 0xf
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch
.end method

.method public 飘花落叶言子楪世哲苏兰(IIL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x1000005

    .line 12
    .line 13
    .line 14
    const v6, 0x1000002

    .line 15
    .line 16
    .line 17
    const v8, 0x1000001

    .line 18
    .line 19
    .line 20
    const v9, 0x1000003

    .line 21
    .line 22
    .line 23
    const v10, 0x1000004

    .line 24
    .line 25
    .line 26
    const/high16 v11, 0x1000000

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v1, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    const/high16 v13, 0x5000000

    .line 35
    .line 36
    const/high16 v14, 0x4000000

    .line 37
    .line 38
    const/high16 v15, 0xf000000

    .line 39
    .line 40
    const/high16 v16, 0x2000000

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    const/high16 v17, 0x100000

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    packed-switch v1, :pswitch_data_2

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/16 v13, 0x5b

    .line 51
    .line 52
    const/4 v14, 0x4

    .line 53
    const/4 v15, 0x0

    .line 54
    packed-switch v1, :pswitch_data_3

    .line 55
    .line 56
    .line 57
    packed-switch v1, :pswitch_data_4

    .line 58
    .line 59
    .line 60
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_0
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_1
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ne v2, v13, :cond_0

    .line 83
    .line 84
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    or-int v1, v1, v16

    .line 93
    .line 94
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_2
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-ne v2, v13, :cond_1

    .line 108
    .line 109
    const-string v2, "["

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_1
    const/high16 v2, 0x12000000

    .line 120
    .line 121
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    or-int/2addr v1, v2

    .line 126
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_3
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 131
    .line 132
    .line 133
    packed-switch v2, :pswitch_data_5

    .line 134
    .line 135
    .line 136
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_4
    const v1, 0x11000004

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_5
    const v1, 0x11000001

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_6
    const v1, 0x1100000c

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_7
    const v1, 0x1100000a

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_8
    const v1, 0x11000003

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_9
    const v1, 0x11000002

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_a
    const v1, 0x1100000b

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_b
    const v1, 0x11000009

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_c
    iget-object v10, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    const/16 v3, 0x81

    .line 206
    .line 207
    add-int/2addr v1, v3

    .line 208
    add-int/2addr v1, v2

    .line 209
    const v5, 0x7fffffff

    .line 210
    .line 211
    .line 212
    and-int v7, v1, v5

    .line 213
    .line 214
    invoke-virtual {v4, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :goto_0
    if-eqz v1, :cond_3

    .line 219
    .line 220
    iget v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 221
    .line 222
    if-ne v5, v3, :cond_2

    .line 223
    .line 224
    iget v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 225
    .line 226
    if-ne v5, v7, :cond_2

    .line 227
    .line 228
    iget-wide v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 229
    .line 230
    int-to-long v8, v2

    .line 231
    cmp-long v5, v5, v8

    .line 232
    .line 233
    if-nez v5, :cond_2

    .line 234
    .line 235
    iget-object v5, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_2

    .line 242
    .line 243
    iget v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_2
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 249
    .line 250
    goto :goto_0

    .line 251
    :cond_3
    new-instance v5, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 252
    .line 253
    iget v6, v4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 254
    .line 255
    int-to-long v8, v2

    .line 256
    invoke-direct/range {v5 .. v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IIJLjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    :goto_1
    const/high16 v2, 0x3000000

    .line 264
    .line 265
    or-int/2addr v1, v2

    .line 266
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_d
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_e
    iget-object v2, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const/16 v2, 0xb8

    .line 287
    .line 288
    if-eq v1, v2, :cond_6

    .line 289
    .line 290
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    const/16 v5, 0xb7

    .line 295
    .line 296
    if-ne v1, v5, :cond_6

    .line 297
    .line 298
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    const/16 v5, 0x3c

    .line 305
    .line 306
    if-ne v1, v5, :cond_6

    .line 307
    .line 308
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 309
    .line 310
    if-nez v1, :cond_4

    .line 311
    .line 312
    new-array v1, v7, [I

    .line 313
    .line 314
    iput-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 315
    .line 316
    :cond_4
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 317
    .line 318
    array-length v1, v1

    .line 319
    iget v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 320
    .line 321
    if-lt v5, v1, :cond_5

    .line 322
    .line 323
    add-int/2addr v5, v12

    .line 324
    mul-int/lit8 v6, v1, 0x2

    .line 325
    .line 326
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    new-array v5, v5, [I

    .line 331
    .line 332
    iget-object v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 333
    .line 334
    invoke-static {v6, v15, v5, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 335
    .line 336
    .line 337
    iput-object v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 338
    .line 339
    :cond_5
    iget-object v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 340
    .line 341
    iget v5, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 342
    .line 343
    add-int/lit8 v6, v5, 0x1

    .line 344
    .line 345
    iput v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 346
    .line 347
    aput v2, v1, v5

    .line 348
    .line 349
    :cond_6
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 350
    .line 351
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_f
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 356
    .line 357
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_10
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 365
    .line 366
    .line 367
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 368
    .line 369
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_11
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :pswitch_12
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_13
    const-string v0, "JSR/RET are not supported with computeFrames option"

    .line 386
    .line 387
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :pswitch_14
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_15
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_16
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_17
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :pswitch_18
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :pswitch_19
    invoke-virtual {v0, v2, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_1a
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_1b
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_1c
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_1d
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_1e
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :pswitch_1f
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    :pswitch_20
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_21
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_22
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :pswitch_23
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 616
    .line 617
    .line 618
    return-void

    .line 619
    :pswitch_24
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :pswitch_25
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_26
    invoke-virtual {v0, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :pswitch_27
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :pswitch_28
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    invoke-virtual {v0, v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 643
    .line 644
    .line 645
    add-int/lit8 v1, v2, 0x1

    .line 646
    .line 647
    invoke-virtual {v0, v1, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 648
    .line 649
    .line 650
    if-lez v2, :cond_e

    .line 651
    .line 652
    add-int/lit8 v1, v2, -0x1

    .line 653
    .line 654
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    if-eq v2, v10, :cond_9

    .line 659
    .line 660
    if-ne v2, v9, :cond_7

    .line 661
    .line 662
    goto :goto_2

    .line 663
    :cond_7
    and-int v3, v2, v15

    .line 664
    .line 665
    if-eq v3, v14, :cond_8

    .line 666
    .line 667
    if-ne v3, v13, :cond_e

    .line 668
    .line 669
    :cond_8
    or-int v2, v2, v17

    .line 670
    .line 671
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :cond_9
    :goto_2
    invoke-virtual {v0, v1, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_29
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    invoke-virtual {v0, v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 684
    .line 685
    .line 686
    if-lez v2, :cond_e

    .line 687
    .line 688
    add-int/lit8 v1, v2, -0x1

    .line 689
    .line 690
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    if-eq v2, v10, :cond_c

    .line 695
    .line 696
    if-ne v2, v9, :cond_a

    .line 697
    .line 698
    goto :goto_3

    .line 699
    :cond_a
    and-int v3, v2, v15

    .line 700
    .line 701
    if-eq v3, v14, :cond_b

    .line 702
    .line 703
    if-ne v3, v13, :cond_e

    .line 704
    .line 705
    :cond_b
    or-int v2, v2, v17

    .line 706
    .line 707
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 708
    .line 709
    .line 710
    return-void

    .line 711
    :cond_c
    :goto_3
    invoke-virtual {v0, v1, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(II)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :pswitch_2a
    invoke-virtual {v0, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()I

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    if-ne v1, v5, :cond_d

    .line 723
    .line 724
    goto :goto_4

    .line 725
    :cond_d
    const/high16 v2, -0x10000000

    .line 726
    .line 727
    add-int/2addr v1, v2

    .line 728
    :goto_4
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 729
    .line 730
    .line 731
    return-void

    .line 732
    :pswitch_2b
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 739
    .line 740
    .line 741
    return-void

    .line 742
    :pswitch_2c
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_2d
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_2e
    invoke-virtual {v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 763
    .line 764
    .line 765
    return-void

    .line 766
    :pswitch_2f
    invoke-virtual {v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(I)I

    .line 767
    .line 768
    .line 769
    move-result v1

    .line 770
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :pswitch_30
    const/high16 v16, 0x2000000

    .line 775
    .line 776
    iget v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 777
    .line 778
    packed-switch v1, :pswitch_data_6

    .line 779
    .line 780
    .line 781
    packed-switch v1, :pswitch_data_7

    .line 782
    .line 783
    .line 784
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 785
    .line 786
    .line 787
    return-void

    .line 788
    :pswitch_31
    iget-object v1, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 789
    .line 790
    invoke-virtual {v0, v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    return-void

    .line 794
    :pswitch_32
    const-string v1, "java/lang/invoke/MethodType"

    .line 795
    .line 796
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    or-int v1, v1, v16

    .line 801
    .line 802
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 803
    .line 804
    .line 805
    return-void

    .line 806
    :pswitch_33
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 807
    .line 808
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    move-result v1

    .line 812
    or-int v1, v1, v16

    .line 813
    .line 814
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 815
    .line 816
    .line 817
    return-void

    .line 818
    :pswitch_34
    const-string v1, "java/lang/String"

    .line 819
    .line 820
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 821
    .line 822
    .line 823
    move-result v1

    .line 824
    or-int v1, v1, v16

    .line 825
    .line 826
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 827
    .line 828
    .line 829
    return-void

    .line 830
    :pswitch_35
    const-string v1, "java/lang/Class"

    .line 831
    .line 832
    invoke-virtual {v4, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 833
    .line 834
    .line 835
    move-result v1

    .line 836
    or-int v1, v1, v16

    .line 837
    .line 838
    invoke-virtual {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 839
    .line 840
    .line 841
    return-void

    .line 842
    :pswitch_36
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 846
    .line 847
    .line 848
    return-void

    .line 849
    :pswitch_37
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :pswitch_38
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 857
    .line 858
    .line 859
    return-void

    .line 860
    :pswitch_39
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 861
    .line 862
    .line 863
    return-void

    .line 864
    :pswitch_3a
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :pswitch_3b
    invoke-virtual {v0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 872
    .line 873
    .line 874
    return-void

    .line 875
    :pswitch_3c
    invoke-virtual {v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 879
    .line 880
    .line 881
    return-void

    .line 882
    :pswitch_3d
    invoke-virtual {v0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 883
    .line 884
    .line 885
    return-void

    .line 886
    :pswitch_3e
    invoke-virtual {v0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 887
    .line 888
    .line 889
    :cond_e
    :pswitch_3f
    return-void

    .line 890
    nop

    .line 891
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_3a
        :pswitch_3a
        :pswitch_3d
        :pswitch_3d
        :pswitch_30
    .end packed-switch

    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_2f
    .end packed-switch

    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    :pswitch_data_2
    .packed-switch 0x2e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2e
        :pswitch_2e
        :pswitch_29
        :pswitch_28
        :pswitch_29
        :pswitch_28
        :pswitch_29
    .end packed-switch

    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    :pswitch_data_3
    .packed-switch 0x4f
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_2e
        :pswitch_2c
        :pswitch_2b
        :pswitch_15
        :pswitch_18
        :pswitch_16
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_14
        :pswitch_2e
        :pswitch_2e
        :pswitch_14
        :pswitch_14
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_3f
        :pswitch_13
        :pswitch_13
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_3f
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_15
        :pswitch_25
        :pswitch_1
        :pswitch_15
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    :pswitch_data_4
    .packed-switch 0xc5
        :pswitch_0
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0xf
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏兰哲(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世兰哲苏;)V
    .locals 13

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    array-length v5, v0

    .line 8
    const/4 v6, 0x2

    .line 9
    const v7, 0x400003

    .line 10
    .line 11
    .line 12
    const v8, 0x400004

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    if-ge v2, v5, :cond_3

    .line 17
    .line 18
    aget v5, v0, v2

    .line 19
    .line 20
    if-eq v5, v8, :cond_1

    .line 21
    .line 22
    if-ne v5, v7, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v6, v9

    .line 26
    :cond_1
    :goto_1
    add-int/2addr v2, v6

    .line 27
    const/high16 v6, 0x400000

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:[I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v5, v4

    .line 43
    :goto_2
    array-length v10, v2

    .line 44
    if-ge v4, v10, :cond_6

    .line 45
    .line 46
    aget v10, v2, v4

    .line 47
    .line 48
    if-eq v10, v8, :cond_5

    .line 49
    .line 50
    if-ne v10, v7, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v10, v9

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_3
    move v10, v6

    .line 56
    :goto_4
    add-int/2addr v4, v10

    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    iget p0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 65
    .line 66
    invoke-virtual {p1, p0, v3, v5}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰楪苏(III)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x3

    .line 70
    move v4, v1

    .line 71
    :goto_5
    add-int/lit8 v10, v3, -0x1

    .line 72
    .line 73
    if-lez v3, :cond_9

    .line 74
    .line 75
    aget v3, v0, v4

    .line 76
    .line 77
    if-eq v3, v8, :cond_8

    .line 78
    .line 79
    if-ne v3, v7, :cond_7

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_7
    move v11, v9

    .line 83
    goto :goto_7

    .line 84
    :cond_8
    :goto_6
    move v11, v6

    .line 85
    :goto_7
    add-int/2addr v4, v11

    .line 86
    add-int/lit8 v11, p0, 0x1

    .line 87
    .line 88
    iget-object v12, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:[I

    .line 89
    .line 90
    aput v3, v12, p0

    .line 91
    .line 92
    move v3, v10

    .line 93
    move p0, v11

    .line 94
    goto :goto_5

    .line 95
    :cond_9
    :goto_8
    add-int/lit8 v0, v5, -0x1

    .line 96
    .line 97
    if-lez v5, :cond_c

    .line 98
    .line 99
    aget v3, v2, v1

    .line 100
    .line 101
    if-eq v3, v8, :cond_b

    .line 102
    .line 103
    if-ne v3, v7, :cond_a

    .line 104
    .line 105
    goto :goto_9

    .line 106
    :cond_a
    move v4, v9

    .line 107
    goto :goto_a

    .line 108
    :cond_b
    :goto_9
    move v4, v6

    .line 109
    :goto_a
    add-int/2addr v1, v4

    .line 110
    add-int/lit8 v4, p0, 0x1

    .line 111
    .line 112
    iget-object v5, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:[I

    .line 113
    .line 114
    aput v3, v5, p0

    .line 115
    .line 116
    move v5, v0

    .line 117
    move p0, v4

    .line 118
    goto :goto_8

    .line 119
    :cond_c
    invoke-virtual {p1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲苏兰楪()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V
    .locals 13

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    array-length v5, v0

    .line 8
    const/4 v6, 0x2

    .line 9
    const v7, 0x1000003

    .line 10
    .line 11
    .line 12
    const v8, 0x1000004

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    if-ge v2, v5, :cond_3

    .line 17
    .line 18
    aget v5, v0, v2

    .line 19
    .line 20
    if-eq v5, v8, :cond_1

    .line 21
    .line 22
    if-ne v5, v7, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v6, v9

    .line 26
    :cond_1
    :goto_1
    add-int/2addr v2, v6

    .line 27
    const/high16 v6, 0x1000000

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:[I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v5, v4

    .line 43
    :goto_2
    array-length v10, v2

    .line 44
    if-ge v4, v10, :cond_6

    .line 45
    .line 46
    aget v10, v2, v4

    .line 47
    .line 48
    if-eq v10, v8, :cond_5

    .line 49
    .line 50
    if-ne v10, v7, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v10, v9

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_3
    move v10, v6

    .line 56
    :goto_4
    add-int/2addr v4, v10

    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    iget p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 65
    .line 66
    invoke-virtual {p1, p0, v3, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(III)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x3

    .line 70
    move v4, v1

    .line 71
    :goto_5
    add-int/lit8 v10, v3, -0x1

    .line 72
    .line 73
    if-lez v3, :cond_9

    .line 74
    .line 75
    aget v3, v0, v4

    .line 76
    .line 77
    if-eq v3, v8, :cond_8

    .line 78
    .line 79
    if-ne v3, v7, :cond_7

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_7
    move v11, v9

    .line 83
    goto :goto_7

    .line 84
    :cond_8
    :goto_6
    move v11, v6

    .line 85
    :goto_7
    add-int/2addr v4, v11

    .line 86
    add-int/lit8 v11, p0, 0x1

    .line 87
    .line 88
    iget-object v12, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:[I

    .line 89
    .line 90
    aput v3, v12, p0

    .line 91
    .line 92
    move v3, v10

    .line 93
    move p0, v11

    .line 94
    goto :goto_5

    .line 95
    :cond_9
    :goto_8
    add-int/lit8 v0, v5, -0x1

    .line 96
    .line 97
    if-lez v5, :cond_c

    .line 98
    .line 99
    aget v3, v2, v1

    .line 100
    .line 101
    if-eq v3, v8, :cond_b

    .line 102
    .line 103
    if-ne v3, v7, :cond_a

    .line 104
    .line 105
    goto :goto_9

    .line 106
    :cond_a
    move v4, v9

    .line 107
    goto :goto_a

    .line 108
    :cond_b
    :goto_9
    move v4, v6

    .line 109
    :goto_a
    add-int/2addr v1, v4

    .line 110
    add-int/lit8 v4, p0, 0x1

    .line 111
    .line 112
    iget-object v5, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:[I

    .line 113
    .line 114
    aput v3, v5, p0

    .line 115
    .line 116
    move v5, v0

    .line 117
    move p0, v4

    .line 118
    goto :goto_8

    .line 119
    :cond_c
    invoke-virtual {p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(II)V
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 17
    .line 18
    array-length v0, v0

    .line 19
    if-lt p1, v0, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, p1, 0x1

    .line 22
    .line 23
    mul-int/lit8 v2, v0, 0x2

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-array v1, v1, [I

    .line 30
    .line 31
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 38
    .line 39
    :cond_1
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 40
    .line 41
    aput p2, p0, p1

    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const/16 v0, 0xa

    .line 49
    .line 50
    new-array v0, v0, [I

    .line 51
    .line 52
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 53
    .line 54
    :cond_2
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 55
    .line 56
    array-length v0, v0

    .line 57
    if-lt p1, v0, :cond_3

    .line 58
    .line 59
    add-int/lit8 v1, p1, 0x1

    .line 60
    .line 61
    mul-int/lit8 v2, v0, 0x2

    .line 62
    .line 63
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    new-array v1, v1, [I

    .line 68
    .line 69
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 76
    .line 77
    :cond_3
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 78
    .line 79
    aput p2, p0, p1

    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲世兰苏(I)V
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 7
    .line 8
    if-lt v0, p1, :cond_0

    .line 9
    .line 10
    sub-int/2addr v0, p1

    .line 11
    int-to-short p1, v0

    .line 12
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 16
    .line 17
    sub-int/2addr p1, v0

    .line 18
    sub-int/2addr v1, p1

    .line 19
    int-to-short p1, v1

    .line 20
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :pswitch_0
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 27
    .line 28
    if-lt v0, p1, :cond_1

    .line 29
    .line 30
    sub-int/2addr v0, p1

    .line 31
    int-to-short p1, v0

    .line 32
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 36
    .line 37
    sub-int/2addr p1, v0

    .line 38
    sub-int/2addr v1, p1

    .line 39
    int-to-short p1, v1

    .line 40
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 44
    .line 45
    :goto_1
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲世苏兰()I
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    int-to-short v0, v0

    .line 15
    iput-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 16
    .line 17
    aget p0, v1, v0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    int-to-short v0, v0

    .line 25
    iput-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 26
    .line 27
    neg-int p0, v0

    .line 28
    const/high16 v0, 0x1400000

    .line 29
    .line 30
    or-int/2addr p0, v0

    .line 31
    :goto_0
    return p0

    .line 32
    :pswitch_0
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 33
    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 37
    .line 38
    add-int/lit8 v0, v0, -0x1

    .line 39
    .line 40
    int-to-short v0, v0

    .line 41
    iput-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 42
    .line 43
    aget p0, v1, v0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 47
    .line 48
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    int-to-short v0, v0

    .line 51
    iput-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 52
    .line 53
    neg-int p0, v0

    .line 54
    const/high16 v0, 0x5000000

    .line 55
    .line 56
    or-int/2addr p0, v0

    .line 57
    :goto_1
    return p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪哲兰世苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x28

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x29

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    :cond_0
    invoke-static {p1, p2, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 25
    .line 26
    .line 27
    const p2, 0x1000004

    .line 28
    .line 29
    .line 30
    if-eq p1, p2, :cond_1

    .line 31
    .line 32
    const p2, 0x1000003

    .line 33
    .line 34
    .line 35
    if-ne p1, p2, :cond_2

    .line 36
    .line 37
    :cond_1
    const/high16 p1, 0x1000000

    .line 38
    .line 39
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method

.method public 飘花落叶言子楪哲兰苏世(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x14

    .line 9
    .line 10
    const/16 v2, 0x12

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, -0x1

    .line 17
    sparse-switch v0, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :sswitch_0
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;J)V"

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    const/16 v7, 0x19

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :sswitch_1
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;I)V"

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_1
    const/16 v7, 0x18

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :sswitch_2
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;"

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_2
    const/16 v7, 0x17

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :sswitch_3
    const-string v0, "(I)Ljava/lang/Integer;"

    .line 65
    .line 66
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_3
    const/16 v7, 0x16

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :sswitch_4
    const-string v0, "(Ljava/lang/Object;)Z"

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :cond_4
    const/16 v7, 0x15

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :sswitch_5
    const-string v0, "(Ljava/lang/Object;)V"

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_5

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :cond_5
    move v7, v1

    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :sswitch_6
    const-string v0, "(I)Ljava/lang/Object;"

    .line 106
    .line 107
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :cond_6
    const/16 v7, 0x13

    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :sswitch_7
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V"

    .line 120
    .line 121
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_7

    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :cond_7
    move v7, v2

    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :sswitch_8
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V"

    .line 133
    .line 134
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_8

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_8
    const/16 v7, 0x11

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :sswitch_9
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;)Z"

    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_9

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_9
    const/16 v7, 0x10

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :sswitch_a
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;)V"

    .line 161
    .line 162
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_a

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_a
    const/16 v7, 0xf

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :sswitch_b
    const-string v0, "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z"

    .line 175
    .line 176
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_b

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    const/16 v7, 0xe

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :sswitch_c
    const-string v0, "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;"

    .line 189
    .line 190
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_c

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_c
    const/16 v7, 0xd

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :sswitch_d
    const-string v0, "(J)Z"

    .line 203
    .line 204
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_d

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_d
    const/16 v7, 0xc

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :sswitch_e
    const-string v0, "(J)V"

    .line 217
    .line 218
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_e

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_e
    const/16 v7, 0xb

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :sswitch_f
    const-string v0, "(I)V"

    .line 231
    .line 232
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_f

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_f
    const/16 v7, 0xa

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :sswitch_10
    const-string v0, "()Z"

    .line 245
    .line 246
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_10

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_10
    const/16 v7, 0x9

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :sswitch_11
    const-string v0, "()V"

    .line 259
    .line 260
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-nez v0, :cond_11

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :cond_11
    const/16 v7, 0x8

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :sswitch_12
    const-string v0, "()J"

    .line 273
    .line 274
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_12

    .line 279
    .line 280
    goto :goto_0

    .line 281
    :cond_12
    const/4 v7, 0x7

    .line 282
    goto :goto_0

    .line 283
    :sswitch_13
    const-string v0, "()I"

    .line 284
    .line 285
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_13

    .line 290
    .line 291
    goto :goto_0

    .line 292
    :cond_13
    const/4 v7, 0x6

    .line 293
    goto :goto_0

    .line 294
    :sswitch_14
    const-string v0, "()Ljava/lang/Class;"

    .line 295
    .line 296
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_14

    .line 301
    .line 302
    goto :goto_0

    .line 303
    :cond_14
    const/4 v7, 0x5

    .line 304
    goto :goto_0

    .line 305
    :sswitch_15
    const-string v0, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V"

    .line 306
    .line 307
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-nez v0, :cond_15

    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_15
    const/4 v7, 0x4

    .line 315
    goto :goto_0

    .line 316
    :sswitch_16
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;"

    .line 317
    .line 318
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-nez v0, :cond_16

    .line 323
    .line 324
    goto :goto_0

    .line 325
    :cond_16
    move v7, v3

    .line 326
    goto :goto_0

    .line 327
    :sswitch_17
    const-string v0, "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V"

    .line 328
    .line 329
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_17

    .line 334
    .line 335
    goto :goto_0

    .line 336
    :cond_17
    move v7, v4

    .line 337
    goto :goto_0

    .line 338
    :sswitch_18
    const-string v0, "(Ljava/lang/String;)V"

    .line 339
    .line 340
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_18

    .line 345
    .line 346
    goto :goto_0

    .line 347
    :cond_18
    move v7, v6

    .line 348
    goto :goto_0

    .line 349
    :sswitch_19
    const-string v0, "(Ljava/lang/Enum;)V"

    .line 350
    .line 351
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_19

    .line 356
    .line 357
    goto :goto_0

    .line 358
    :cond_19
    move v7, v5

    .line 359
    :goto_0
    packed-switch v7, :pswitch_data_0

    .line 360
    .line 361
    .line 362
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    const/16 v1, 0x28

    .line 367
    .line 368
    if-ne v0, v1, :cond_1d

    .line 369
    .line 370
    move v0, v6

    .line 371
    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    const/16 v2, 0x29

    .line 376
    .line 377
    if-eq v1, v2, :cond_1c

    .line 378
    .line 379
    :goto_2
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    const/16 v2, 0x5b

    .line 384
    .line 385
    if-ne v1, v2, :cond_1a

    .line 386
    .line 387
    add-int/lit8 v0, v0, 0x1

    .line 388
    .line 389
    goto :goto_2

    .line 390
    :cond_1a
    add-int/lit8 v1, v0, 0x1

    .line 391
    .line 392
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    const/16 v2, 0x4c

    .line 397
    .line 398
    if-ne v0, v2, :cond_1b

    .line 399
    .line 400
    const/16 v0, 0x3b

    .line 401
    .line 402
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->indexOf(II)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    add-int/2addr v0, v6

    .line 407
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    goto :goto_1

    .line 412
    :cond_1b
    move v0, v1

    .line 413
    goto :goto_1

    .line 414
    :cond_1c
    add-int/lit8 v1, v0, 0x1

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_1d
    move v1, v5

    .line 418
    goto :goto_3

    .line 419
    :pswitch_0
    const/16 v1, 0x25

    .line 420
    .line 421
    goto :goto_3

    .line 422
    :pswitch_1
    const/16 v1, 0x34

    .line 423
    .line 424
    goto :goto_3

    .line 425
    :pswitch_2
    const/16 v1, 0x35

    .line 426
    .line 427
    goto :goto_3

    .line 428
    :pswitch_3
    const/16 v1, 0x24

    .line 429
    .line 430
    goto :goto_3

    .line 431
    :pswitch_4
    const/16 v1, 0x2c

    .line 432
    .line 433
    goto :goto_3

    .line 434
    :pswitch_5
    const/16 v1, 0x3e

    .line 435
    .line 436
    goto :goto_3

    .line 437
    :pswitch_6
    move v1, v3

    .line 438
    goto :goto_3

    .line 439
    :pswitch_7
    move v1, v4

    .line 440
    goto :goto_3

    .line 441
    :pswitch_8
    const/16 v1, 0x48

    .line 442
    .line 443
    goto :goto_3

    .line 444
    :pswitch_9
    const/16 v1, 0x3c

    .line 445
    .line 446
    goto :goto_3

    .line 447
    :pswitch_a
    const/16 v1, 0x61

    .line 448
    .line 449
    goto :goto_3

    .line 450
    :pswitch_b
    move v1, v2

    .line 451
    :goto_3
    :pswitch_c
    invoke-static {p1, p2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;Ljava/lang/String;I)I

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-eqz p1, :cond_1f

    .line 456
    .line 457
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 458
    .line 459
    .line 460
    const p2, 0x400004

    .line 461
    .line 462
    .line 463
    if-eq p1, p2, :cond_1e

    .line 464
    .line 465
    const p2, 0x400003

    .line 466
    .line 467
    .line 468
    if-ne p1, p2, :cond_1f

    .line 469
    .line 470
    :cond_1e
    const/high16 p1, 0x400000

    .line 471
    .line 472
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(I)V

    .line 473
    .line 474
    .line 475
    :cond_1f
    return-void

    .line 476
    nop

    .line 477
    :sswitch_data_0
    .sparse-switch
        -0x79cdcef1 -> :sswitch_19
        -0x552c4e01 -> :sswitch_18
        -0x1c1066ca -> :sswitch_17
        -0xfb4ac65 -> :sswitch_16
        -0xa827247 -> :sswitch_15
        -0x7855dde -> :sswitch_14
        0x9b68 -> :sswitch_13
        0x9b69 -> :sswitch_12
        0x9b75 -> :sswitch_11
        0x9b79 -> :sswitch_10
        0x13462e -> :sswitch_f
        0x1349ef -> :sswitch_e
        0x1349f3 -> :sswitch_d
        0x8e7ba93 -> :sswitch_c
        0x9ab2784 -> :sswitch_b
        0xc3108a7 -> :sswitch_a
        0xc3108ab -> :sswitch_9
        0x1a2191fe -> :sswitch_8
        0x4715fa41 -> :sswitch_7
        0x54cf32c4 -> :sswitch_6
        0x5d527811 -> :sswitch_5
        0x5d527815 -> :sswitch_4
        0x61acf5d5 -> :sswitch_3
        0x62ac16fb -> :sswitch_2
        0x79f07f3c -> :sswitch_1
        0x79f082fd -> :sswitch_0
    .end sparse-switch

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_c
        :pswitch_c
        :pswitch_6
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲苏世兰(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v1, 0x44

    .line 4
    .line 5
    const/16 v2, 0x4a

    .line 6
    .line 7
    const/16 v3, 0x28

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    shr-int/2addr p1, v5

    .line 26
    sub-int/2addr p1, v6

    .line 27
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    if-eq v0, v2, :cond_2

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    :goto_0
    invoke-virtual {p0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ne v0, v3, :cond_3

    .line 49
    .line 50
    invoke-static {p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    shr-int/2addr p1, v5

    .line 55
    sub-int/2addr p1, v6

    .line 56
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    if-eq v0, v2, :cond_5

    .line 61
    .line 62
    if-ne v0, v1, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {p0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    :goto_2
    invoke-virtual {p0, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(I)V

    .line 70
    .line 71
    .line 72
    :goto_3
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲苏兰世(I)V
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-array v0, v1, [I

    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 21
    .line 22
    if-lt v1, v0, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    mul-int/lit8 v3, v0, 0x2

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    new-array v1, v1, [I

    .line 33
    .line 34
    iget-object v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 35
    .line 36
    invoke-static {v3, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 42
    .line 43
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 44
    .line 45
    add-int/lit8 v2, v1, 0x1

    .line 46
    .line 47
    int-to-short v2, v2

    .line 48
    iput-short v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 49
    .line 50
    aput p1, v0, v1

    .line 51
    .line 52
    iget-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 53
    .line 54
    add-int/2addr p1, v2

    .line 55
    int-to-short p1, p1

    .line 56
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    iget-short v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:S

    .line 61
    .line 62
    if-le p1, v0, :cond_2

    .line 63
    .line 64
    iput-short p1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:S

    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :pswitch_0
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    new-array v0, v1, [I

    .line 72
    .line 73
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 76
    .line 77
    array-length v0, v0

    .line 78
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 79
    .line 80
    if-lt v1, v0, :cond_4

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    mul-int/lit8 v3, v0, 0x2

    .line 85
    .line 86
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    new-array v1, v1, [I

    .line 91
    .line 92
    iget-object v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 93
    .line 94
    invoke-static {v3, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 98
    .line 99
    :cond_4
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:[I

    .line 100
    .line 101
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 102
    .line 103
    add-int/lit8 v2, v1, 0x1

    .line 104
    .line 105
    int-to-short v2, v2

    .line 106
    iput-short v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:S

    .line 107
    .line 108
    aput p1, v0, v1

    .line 109
    .line 110
    iget-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 111
    .line 112
    add-int/2addr p1, v2

    .line 113
    int-to-short p1, p1

    .line 114
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 117
    .line 118
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:S

    .line 119
    .line 120
    if-le p1, v0, :cond_5

    .line 121
    .line 122
    iput-short p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:S

    .line 123
    .line 124
    :cond_5
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪苏世兰哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;I)I
    .locals 8

    .line 1
    const v0, 0x1000006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x1000000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0x3000000

    .line 10
    .line 11
    if-ne v1, v2, :cond_5

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_5

    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 19
    .line 20
    aget v2, v2, v1

    .line 21
    .line 22
    const/high16 v3, -0x10000000

    .line 23
    .line 24
    and-int/2addr v3, v2

    .line 25
    const/high16 v4, 0xf000000

    .line 26
    .line 27
    and-int/2addr v4, v2

    .line 28
    const v5, 0xfffff

    .line 29
    .line 30
    .line 31
    and-int v6, v2, v5

    .line 32
    .line 33
    const/high16 v7, 0x4000000

    .line 34
    .line 35
    if-ne v4, v7, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:[I

    .line 38
    .line 39
    aget v2, v2, v6

    .line 40
    .line 41
    :goto_1
    add-int/2addr v2, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/high16 v7, 0x5000000

    .line 44
    .line 45
    if-ne v4, v7, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:[I

    .line 48
    .line 49
    array-length v4, v2

    .line 50
    sub-int/2addr v4, v6

    .line 51
    aget v2, v2, v4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 55
    .line 56
    const/high16 p0, 0x2000000

    .line 57
    .line 58
    if-ne p2, v0, :cond_3

    .line 59
    .line 60
    iget-object p2, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_3
    or-int/2addr p0, p1

    .line 67
    return p0

    .line 68
    :cond_3
    and-int/2addr p2, v5

    .line 69
    iget-object v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 70
    .line 71
    aget-object p2, v0, p2

    .line 72
    .line 73
    iget-object p2, p2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    return p2
.end method

.method public 飘花落叶言子楪苏世哲兰(II)I
    .locals 8

    .line 1
    const/high16 v0, -0x4000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/high16 v1, 0x3c00000

    .line 5
    .line 6
    and-int/2addr v1, p1

    .line 7
    const/high16 v2, 0x1000000

    .line 8
    .line 9
    const/high16 v3, 0x400000

    .line 10
    .line 11
    const v4, 0x400003

    .line 12
    .line 13
    .line 14
    const v5, 0x400004

    .line 15
    .line 16
    .line 17
    const/high16 v6, 0x100000

    .line 18
    .line 19
    const v7, 0xfffff

    .line 20
    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:[I

    .line 25
    .line 26
    and-int p2, p1, v7

    .line 27
    .line 28
    aget p0, p0, p2

    .line 29
    .line 30
    add-int/2addr v0, p0

    .line 31
    and-int p0, p1, v6

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    if-eq v0, v5, :cond_0

    .line 36
    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    return v3

    .line 40
    :cond_1
    return v0

    .line 41
    :cond_2
    const/high16 v2, 0x1400000

    .line 42
    .line 43
    if-ne v1, v2, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:[I

    .line 46
    .line 47
    and-int v1, p1, v7

    .line 48
    .line 49
    sub-int/2addr p2, v1

    .line 50
    aget p0, p0, p2

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    and-int p0, p1, v6

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    if-eq v0, v5, :cond_3

    .line 58
    .line 59
    if-ne v0, v4, :cond_4

    .line 60
    .line 61
    :cond_3
    return v3

    .line 62
    :cond_4
    return v0

    .line 63
    :cond_5
    return p1
.end method

.method public 飘花落叶言子楪苏哲世兰(L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;I)I
    .locals 8

    .line 1
    const v0, 0x400006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x400000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0xc00000

    .line 10
    .line 11
    if-ne v1, v2, :cond_5

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_5

    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:[I

    .line 19
    .line 20
    aget v2, v2, v1

    .line 21
    .line 22
    const/high16 v3, -0x4000000

    .line 23
    .line 24
    and-int/2addr v3, v2

    .line 25
    const/high16 v4, 0x3c00000

    .line 26
    .line 27
    and-int/2addr v4, v2

    .line 28
    const v5, 0xfffff

    .line 29
    .line 30
    .line 31
    and-int v6, v2, v5

    .line 32
    .line 33
    const/high16 v7, 0x1000000

    .line 34
    .line 35
    if-ne v4, v7, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:[I

    .line 38
    .line 39
    aget v2, v2, v6

    .line 40
    .line 41
    :goto_1
    add-int/2addr v2, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/high16 v7, 0x1400000

    .line 44
    .line 45
    if-ne v4, v7, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:[I

    .line 48
    .line 49
    array-length v4, v2

    .line 50
    sub-int/2addr v4, v6

    .line 51
    aget v2, v2, v4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 55
    .line 56
    const/high16 p0, 0x800000

    .line 57
    .line 58
    if-ne p2, v0, :cond_3

    .line 59
    .line 60
    iget-object p2, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_3
    or-int/2addr p0, p1

    .line 67
    return p0

    .line 68
    :cond_3
    iget-object v0, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 69
    .line 70
    and-int/2addr p2, v5

    .line 71
    aget-object p2, v0, p2

    .line 72
    .line 73
    iget-object p2, p2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    return p2
.end method

.method public final 飘花落叶言子楪苏哲兰世(I)I
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 7
    .line 8
    const/high16 v0, 0x1000000

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    array-length v1, p0

    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    aget v1, p0, p1

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    or-int v1, p1, v0

    .line 21
    .line 22
    aput v1, p0, p1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    or-int v1, p1, v0

    .line 26
    .line 27
    :cond_2
    :goto_1
    return v1

    .line 28
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 29
    .line 30
    const/high16 v0, 0x4000000

    .line 31
    .line 32
    if-eqz p0, :cond_4

    .line 33
    .line 34
    array-length v1, p0

    .line 35
    if-lt p1, v1, :cond_3

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_3
    aget v1, p0, p1

    .line 39
    .line 40
    if-nez v1, :cond_5

    .line 41
    .line 42
    or-int v1, p1, v0

    .line 43
    .line 44
    aput v1, p0, p1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_2
    or-int v1, p1, v0

    .line 48
    .line 49
    :cond_5
    :goto_3
    return v1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
