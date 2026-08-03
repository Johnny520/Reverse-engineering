.class public final synthetic Lwb/rg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ldb/c;


# direct methods
.method public synthetic constructor <init>(ILdb/c;Lfg/l;)V
    .locals 0

    .line 12
    iput p1, p0, Lwb/rg;->g:I

    iput-object p3, p0, Lwb/rg;->h:Lfg/l;

    iput-object p2, p0, Lwb/rg;->i:Ldb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldb/c;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lwb/rg;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/rg;->i:Ldb/c;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/rg;->h:Lfg/l;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/rg;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 v1, 0x0

    .line 42
    :goto_1
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 43
    .line 44
    iget v3, v2, Ldb/c;->u:I

    .line 45
    .line 46
    if-ne v1, v3, :cond_3

    .line 47
    .line 48
    iget-object v3, v2, Ldb/c;->f:Ljava/util/List;

    .line 49
    .line 50
    :goto_2
    move-object v7, v3

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :goto_3
    const/16 v25, 0x0

    .line 56
    .line 57
    const v26, 0x2fffdf

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const-wide/16 v8, 0x0

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    const-wide/16 v16, 0x0

    .line 73
    .line 74
    const/16 v18, 0x0

    .line 75
    .line 76
    const/16 v19, 0x0

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    const/16 v21, 0x0

    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const/16 v23, 0x0

    .line 85
    .line 86
    move/from16 v24, v1

    .line 87
    .line 88
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 93
    .line 94
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 98
    .line 99
    return-object v1

    .line 100
    :pswitch_0
    move-object/from16 v1, p1

    .line 101
    .line 102
    check-cast v1, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/4 v2, 0x0

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    goto :goto_5

    .line 121
    :cond_4
    move v1, v2

    .line 122
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const/4 v4, 0x1

    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    if-ne v1, v4, :cond_5

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_5
    const/4 v3, 0x0

    .line 133
    :cond_6
    :goto_6
    if-eqz v3, :cond_7

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    goto :goto_7

    .line 140
    :cond_7
    move v1, v2

    .line 141
    :goto_7
    iget-object v5, v0, Lwb/rg;->i:Ldb/c;

    .line 142
    .line 143
    iget v3, v5, Ldb/c;->r:I

    .line 144
    .line 145
    if-ne v1, v3, :cond_8

    .line 146
    .line 147
    goto/16 :goto_a

    .line 148
    .line 149
    :cond_8
    if-nez v1, :cond_9

    .line 150
    .line 151
    const/16 v28, 0x0

    .line 152
    .line 153
    const v29, 0x3dffff

    .line 154
    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    const-wide/16 v11, 0x0

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    const/16 v16, 0x0

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    const-wide/16 v19, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const/16 v23, 0x0

    .line 179
    .line 180
    const/16 v25, 0x0

    .line 181
    .line 182
    const/16 v26, 0x0

    .line 183
    .line 184
    const/16 v27, 0x0

    .line 185
    .line 186
    move/from16 v24, v1

    .line 187
    .line 188
    invoke-static/range {v5 .. v29}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    goto :goto_a

    .line 193
    :cond_9
    move/from16 v24, v1

    .line 194
    .line 195
    invoke-static {v5}, Lwb/ho;->X6(Ldb/c;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-static {v5, v4}, Lwb/ho;->W6(Ldb/c;I)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    const/4 v6, 0x2

    .line 212
    invoke-static {v5, v6}, Lwb/ho;->W6(Ldb/c;I)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-nez v1, :cond_a

    .line 221
    .line 222
    if-nez v3, :cond_a

    .line 223
    .line 224
    move/from16 v25, v4

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_a
    if-nez v1, :cond_b

    .line 228
    .line 229
    if-nez v7, :cond_b

    .line 230
    .line 231
    move/from16 v25, v6

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_b
    if-nez v3, :cond_d

    .line 235
    .line 236
    const/4 v2, 0x3

    .line 237
    :cond_c
    :goto_8
    move/from16 v25, v2

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_d
    if-nez v7, :cond_c

    .line 241
    .line 242
    const/4 v2, 0x4

    .line 243
    goto :goto_8

    .line 244
    :goto_9
    const/16 v28, 0x0

    .line 245
    .line 246
    const v29, 0x29ffdf

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v8, 0x0

    .line 252
    const/4 v9, 0x0

    .line 253
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 254
    .line 255
    const-wide/16 v11, 0x0

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    const/16 v18, 0x0

    .line 265
    .line 266
    const-wide/16 v19, 0x0

    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    .line 270
    const/16 v22, 0x0

    .line 271
    .line 272
    const/16 v23, 0x0

    .line 273
    .line 274
    const/16 v26, 0x0

    .line 275
    .line 276
    const/16 v27, 0x0

    .line 277
    .line 278
    invoke-static/range {v5 .. v29}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    :goto_a
    iget-object v1, v0, Lwb/rg;->h:Lfg/l;

    .line 283
    .line 284
    invoke-interface {v1, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    goto/16 :goto_4

    .line 288
    .line 289
    :pswitch_1
    move-object/from16 v20, p1

    .line 290
    .line 291
    check-cast v20, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    const/16 v25, 0x0

    .line 297
    .line 298
    const v26, 0x3effff

    .line 299
    .line 300
    .line 301
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 302
    .line 303
    const/4 v3, 0x0

    .line 304
    const/4 v4, 0x0

    .line 305
    const/4 v5, 0x0

    .line 306
    const/4 v6, 0x0

    .line 307
    const/4 v7, 0x0

    .line 308
    const-wide/16 v8, 0x0

    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    const/4 v11, 0x0

    .line 312
    const/4 v12, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    const/4 v14, 0x0

    .line 315
    const/4 v15, 0x0

    .line 316
    const-wide/16 v16, 0x0

    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    const/16 v22, 0x0

    .line 325
    .line 326
    const/16 v23, 0x0

    .line 327
    .line 328
    const/16 v24, 0x0

    .line 329
    .line 330
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 335
    .line 336
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    goto/16 :goto_4

    .line 340
    .line 341
    :pswitch_2
    move-object/from16 v1, p1

    .line 342
    .line 343
    check-cast v1, Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    const/16 v2, 0xa

    .line 349
    .line 350
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const/4 v2, 0x0

    .line 355
    if-eqz v1, :cond_e

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    const/16 v3, 0xe10

    .line 362
    .line 363
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    :cond_e
    move v14, v2

    .line 368
    const/16 v26, 0x0

    .line 369
    .line 370
    const v27, 0x3ffbff

    .line 371
    .line 372
    .line 373
    iget-object v3, v0, Lwb/rg;->i:Ldb/c;

    .line 374
    .line 375
    const/4 v4, 0x0

    .line 376
    const/4 v5, 0x0

    .line 377
    const/4 v6, 0x0

    .line 378
    const/4 v7, 0x0

    .line 379
    const/4 v8, 0x0

    .line 380
    const-wide/16 v9, 0x0

    .line 381
    .line 382
    const/4 v11, 0x0

    .line 383
    const/4 v12, 0x0

    .line 384
    const/4 v13, 0x0

    .line 385
    const/4 v15, 0x0

    .line 386
    const/16 v16, 0x0

    .line 387
    .line 388
    const-wide/16 v17, 0x0

    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    const/16 v20, 0x0

    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const/16 v22, 0x0

    .line 397
    .line 398
    const/16 v23, 0x0

    .line 399
    .line 400
    const/16 v24, 0x0

    .line 401
    .line 402
    const/16 v25, 0x0

    .line 403
    .line 404
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 409
    .line 410
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    goto/16 :goto_4

    .line 414
    .line 415
    :pswitch_3
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    const/16 v2, 0xa

    .line 423
    .line 424
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    const/4 v2, 0x0

    .line 429
    if-eqz v1, :cond_f

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    const/16 v3, 0xe10

    .line 436
    .line 437
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    :cond_f
    move v13, v2

    .line 442
    const/16 v26, 0x0

    .line 443
    .line 444
    const v27, 0x3ffdff

    .line 445
    .line 446
    .line 447
    iget-object v3, v0, Lwb/rg;->i:Ldb/c;

    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    const/4 v5, 0x0

    .line 451
    const/4 v6, 0x0

    .line 452
    const/4 v7, 0x0

    .line 453
    const/4 v8, 0x0

    .line 454
    const-wide/16 v9, 0x0

    .line 455
    .line 456
    const/4 v11, 0x0

    .line 457
    const/4 v12, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    const-wide/16 v17, 0x0

    .line 463
    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    const/16 v20, 0x0

    .line 467
    .line 468
    const/16 v21, 0x0

    .line 469
    .line 470
    const/16 v22, 0x0

    .line 471
    .line 472
    const/16 v23, 0x0

    .line 473
    .line 474
    const/16 v24, 0x0

    .line 475
    .line 476
    const/16 v25, 0x0

    .line 477
    .line 478
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 483
    .line 484
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    goto/16 :goto_4

    .line 488
    .line 489
    :pswitch_4
    move-object/from16 v1, p1

    .line 490
    .line 491
    check-cast v1, Ljava/lang/Boolean;

    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 494
    .line 495
    .line 496
    move-result v14

    .line 497
    const/16 v25, 0x0

    .line 498
    .line 499
    const v26, 0x3ff7ff

    .line 500
    .line 501
    .line 502
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 503
    .line 504
    const/4 v3, 0x0

    .line 505
    const/4 v4, 0x0

    .line 506
    const/4 v5, 0x0

    .line 507
    const/4 v6, 0x0

    .line 508
    const/4 v7, 0x0

    .line 509
    const-wide/16 v8, 0x0

    .line 510
    .line 511
    const/4 v10, 0x0

    .line 512
    const/4 v11, 0x0

    .line 513
    const/4 v12, 0x0

    .line 514
    const/4 v13, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const-wide/16 v16, 0x0

    .line 517
    .line 518
    const/16 v18, 0x0

    .line 519
    .line 520
    const/16 v19, 0x0

    .line 521
    .line 522
    const/16 v20, 0x0

    .line 523
    .line 524
    const/16 v21, 0x0

    .line 525
    .line 526
    const/16 v22, 0x0

    .line 527
    .line 528
    const/16 v23, 0x0

    .line 529
    .line 530
    const/16 v24, 0x0

    .line 531
    .line 532
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 537
    .line 538
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    goto/16 :goto_4

    .line 542
    .line 543
    :pswitch_5
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 551
    .line 552
    iget-object v3, v2, Ldb/c;->i:Ljava/util/Set;

    .line 553
    .line 554
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    iget-object v4, v2, Ldb/c;->i:Ljava/util/Set;

    .line 559
    .line 560
    if-eqz v3, :cond_10

    .line 561
    .line 562
    invoke-static {v4, v1}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    :goto_b
    move-object v11, v1

    .line 567
    goto :goto_c

    .line 568
    :cond_10
    invoke-static {v4, v1}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    goto :goto_b

    .line 573
    :goto_c
    const/16 v25, 0x0

    .line 574
    .line 575
    const v26, 0x3ffeff

    .line 576
    .line 577
    .line 578
    const/4 v3, 0x0

    .line 579
    const/4 v4, 0x0

    .line 580
    const/4 v5, 0x0

    .line 581
    const/4 v6, 0x0

    .line 582
    const/4 v7, 0x0

    .line 583
    const-wide/16 v8, 0x0

    .line 584
    .line 585
    const/4 v10, 0x0

    .line 586
    const/4 v12, 0x0

    .line 587
    const/4 v13, 0x0

    .line 588
    const/4 v14, 0x0

    .line 589
    const/4 v15, 0x0

    .line 590
    const-wide/16 v16, 0x0

    .line 591
    .line 592
    const/16 v18, 0x0

    .line 593
    .line 594
    const/16 v19, 0x0

    .line 595
    .line 596
    const/16 v20, 0x0

    .line 597
    .line 598
    const/16 v21, 0x0

    .line 599
    .line 600
    const/16 v22, 0x0

    .line 601
    .line 602
    const/16 v23, 0x0

    .line 603
    .line 604
    const/16 v24, 0x0

    .line 605
    .line 606
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 611
    .line 612
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    goto/16 :goto_4

    .line 616
    .line 617
    :pswitch_6
    move-object/from16 v1, p1

    .line 618
    .line 619
    check-cast v1, Ljava/lang/String;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    const/16 v2, 0xa

    .line 625
    .line 626
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    if-eqz v1, :cond_11

    .line 631
    .line 632
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    :goto_d
    move v10, v1

    .line 637
    goto :goto_e

    .line 638
    :cond_11
    const/4 v1, 0x0

    .line 639
    goto :goto_d

    .line 640
    :goto_e
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 641
    .line 642
    const/4 v1, 0x2

    .line 643
    if-ne v10, v1, :cond_13

    .line 644
    .line 645
    iget-object v3, v2, Ldb/c;->i:Ljava/util/Set;

    .line 646
    .line 647
    check-cast v3, Ljava/util/Collection;

    .line 648
    .line 649
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v4

    .line 653
    if-eqz v4, :cond_12

    .line 654
    .line 655
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    :cond_12
    check-cast v3, Ljava/util/Set;

    .line 664
    .line 665
    :goto_f
    move-object v11, v3

    .line 666
    goto :goto_10

    .line 667
    :cond_13
    sget-object v3, Ltf/v;->g:Ltf/v;

    .line 668
    .line 669
    goto :goto_f

    .line 670
    :goto_10
    const/16 v25, 0x0

    .line 671
    .line 672
    const v26, 0x3ffe7f

    .line 673
    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    const/4 v4, 0x0

    .line 677
    const/4 v5, 0x0

    .line 678
    const/4 v6, 0x0

    .line 679
    const/4 v7, 0x0

    .line 680
    const-wide/16 v8, 0x0

    .line 681
    .line 682
    const/4 v12, 0x0

    .line 683
    const/4 v13, 0x0

    .line 684
    const/4 v14, 0x0

    .line 685
    const/4 v15, 0x0

    .line 686
    const-wide/16 v16, 0x0

    .line 687
    .line 688
    const/16 v18, 0x0

    .line 689
    .line 690
    const/16 v19, 0x0

    .line 691
    .line 692
    const/16 v20, 0x0

    .line 693
    .line 694
    const/16 v21, 0x0

    .line 695
    .line 696
    const/16 v22, 0x0

    .line 697
    .line 698
    const/16 v23, 0x0

    .line 699
    .line 700
    const/16 v24, 0x0

    .line 701
    .line 702
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 707
    .line 708
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    goto/16 :goto_4

    .line 712
    .line 713
    :pswitch_7
    move-object/from16 v1, p1

    .line 714
    .line 715
    check-cast v1, Ljava/lang/String;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    iget-object v2, v0, Lwb/rg;->i:Ldb/c;

    .line 721
    .line 722
    iget-object v3, v2, Ldb/c;->t:Ljava/util/List;

    .line 723
    .line 724
    new-instance v4, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 727
    .line 728
    .line 729
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-eqz v5, :cond_15

    .line 738
    .line 739
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    move-object v6, v5

    .line 744
    check-cast v6, Ldb/a;

    .line 745
    .line 746
    iget v6, v6, Ldb/a;->a:I

    .line 747
    .line 748
    if-nez v6, :cond_14

    .line 749
    .line 750
    goto :goto_11

    .line 751
    :cond_14
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    goto :goto_11

    .line 755
    :cond_15
    new-instance v3, Ljava/util/ArrayList;

    .line 756
    .line 757
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 758
    .line 759
    .line 760
    new-instance v4, Ldb/a;

    .line 761
    .line 762
    const/4 v5, 0x0

    .line 763
    invoke-direct {v4, v5, v1}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v3, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    const/16 v25, 0x0

    .line 770
    .line 771
    const v26, 0x37ffff

    .line 772
    .line 773
    .line 774
    move-object/from16 v23, v3

    .line 775
    .line 776
    const/4 v3, 0x0

    .line 777
    const/4 v4, 0x0

    .line 778
    const/4 v5, 0x0

    .line 779
    const/4 v6, 0x0

    .line 780
    const/4 v7, 0x0

    .line 781
    const-wide/16 v8, 0x0

    .line 782
    .line 783
    const/4 v10, 0x0

    .line 784
    const/4 v11, 0x0

    .line 785
    const/4 v12, 0x0

    .line 786
    const/4 v13, 0x0

    .line 787
    const/4 v14, 0x0

    .line 788
    const/4 v15, 0x0

    .line 789
    const-wide/16 v16, 0x0

    .line 790
    .line 791
    const/16 v18, 0x0

    .line 792
    .line 793
    const/16 v19, 0x0

    .line 794
    .line 795
    const/16 v20, 0x0

    .line 796
    .line 797
    const/16 v21, 0x0

    .line 798
    .line 799
    const/16 v22, 0x0

    .line 800
    .line 801
    const/16 v24, 0x0

    .line 802
    .line 803
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 808
    .line 809
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    goto/16 :goto_4

    .line 813
    .line 814
    :pswitch_8
    move-object/from16 v1, p1

    .line 815
    .line 816
    check-cast v1, Ljava/lang/String;

    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    const/16 v2, 0xa

    .line 822
    .line 823
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    const/4 v2, 0x0

    .line 828
    if-eqz v1, :cond_16

    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    goto :goto_12

    .line 835
    :cond_16
    move v1, v2

    .line 836
    :goto_12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    if-ltz v1, :cond_17

    .line 841
    .line 842
    const/4 v4, 0x5

    .line 843
    if-ge v1, v4, :cond_17

    .line 844
    .line 845
    goto :goto_13

    .line 846
    :cond_17
    const/4 v3, 0x0

    .line 847
    :goto_13
    if-eqz v3, :cond_18

    .line 848
    .line 849
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    :cond_18
    move/from16 v23, v2

    .line 854
    .line 855
    const/16 v26, 0x0

    .line 856
    .line 857
    const v27, 0x3bffff

    .line 858
    .line 859
    .line 860
    iget-object v3, v0, Lwb/rg;->i:Ldb/c;

    .line 861
    .line 862
    const/4 v4, 0x0

    .line 863
    const/4 v5, 0x0

    .line 864
    const/4 v6, 0x0

    .line 865
    const/4 v7, 0x0

    .line 866
    const/4 v8, 0x0

    .line 867
    const-wide/16 v9, 0x0

    .line 868
    .line 869
    const/4 v11, 0x0

    .line 870
    const/4 v12, 0x0

    .line 871
    const/4 v13, 0x0

    .line 872
    const/4 v14, 0x0

    .line 873
    const/4 v15, 0x0

    .line 874
    const/16 v16, 0x0

    .line 875
    .line 876
    const-wide/16 v17, 0x0

    .line 877
    .line 878
    const/16 v19, 0x0

    .line 879
    .line 880
    const/16 v20, 0x0

    .line 881
    .line 882
    const/16 v21, 0x0

    .line 883
    .line 884
    const/16 v22, 0x0

    .line 885
    .line 886
    const/16 v24, 0x0

    .line 887
    .line 888
    const/16 v25, 0x0

    .line 889
    .line 890
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 895
    .line 896
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    goto/16 :goto_4

    .line 900
    .line 901
    :pswitch_9
    move-object/from16 v1, p1

    .line 902
    .line 903
    check-cast v1, Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    const/16 v2, 0xa

    .line 909
    .line 910
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    const/4 v2, 0x0

    .line 915
    if-eqz v1, :cond_19

    .line 916
    .line 917
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    const/16 v3, 0xe10

    .line 922
    .line 923
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    :cond_19
    move v14, v2

    .line 928
    const/16 v26, 0x0

    .line 929
    .line 930
    const v27, 0x3ffbff

    .line 931
    .line 932
    .line 933
    iget-object v3, v0, Lwb/rg;->i:Ldb/c;

    .line 934
    .line 935
    const/4 v4, 0x0

    .line 936
    const/4 v5, 0x0

    .line 937
    const/4 v6, 0x0

    .line 938
    const/4 v7, 0x0

    .line 939
    const/4 v8, 0x0

    .line 940
    const-wide/16 v9, 0x0

    .line 941
    .line 942
    const/4 v11, 0x0

    .line 943
    const/4 v12, 0x0

    .line 944
    const/4 v13, 0x0

    .line 945
    const/4 v15, 0x0

    .line 946
    const/16 v16, 0x0

    .line 947
    .line 948
    const-wide/16 v17, 0x0

    .line 949
    .line 950
    const/16 v19, 0x0

    .line 951
    .line 952
    const/16 v20, 0x0

    .line 953
    .line 954
    const/16 v21, 0x0

    .line 955
    .line 956
    const/16 v22, 0x0

    .line 957
    .line 958
    const/16 v23, 0x0

    .line 959
    .line 960
    const/16 v24, 0x0

    .line 961
    .line 962
    const/16 v25, 0x0

    .line 963
    .line 964
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 969
    .line 970
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    goto/16 :goto_4

    .line 974
    .line 975
    :pswitch_a
    move-object/from16 v1, p1

    .line 976
    .line 977
    check-cast v1, Ljava/lang/String;

    .line 978
    .line 979
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    const/16 v2, 0xa

    .line 983
    .line 984
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    const/4 v2, 0x0

    .line 989
    if-eqz v1, :cond_1a

    .line 990
    .line 991
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 992
    .line 993
    .line 994
    move-result v1

    .line 995
    const/16 v3, 0xe10

    .line 996
    .line 997
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 998
    .line 999
    .line 1000
    move-result v2

    .line 1001
    :cond_1a
    move v13, v2

    .line 1002
    const/16 v26, 0x0

    .line 1003
    .line 1004
    const v27, 0x3ffdff

    .line 1005
    .line 1006
    .line 1007
    iget-object v3, v0, Lwb/rg;->i:Ldb/c;

    .line 1008
    .line 1009
    const/4 v4, 0x0

    .line 1010
    const/4 v5, 0x0

    .line 1011
    const/4 v6, 0x0

    .line 1012
    const/4 v7, 0x0

    .line 1013
    const/4 v8, 0x0

    .line 1014
    const-wide/16 v9, 0x0

    .line 1015
    .line 1016
    const/4 v11, 0x0

    .line 1017
    const/4 v12, 0x0

    .line 1018
    const/4 v14, 0x0

    .line 1019
    const/4 v15, 0x0

    .line 1020
    const/16 v16, 0x0

    .line 1021
    .line 1022
    const-wide/16 v17, 0x0

    .line 1023
    .line 1024
    const/16 v19, 0x0

    .line 1025
    .line 1026
    const/16 v20, 0x0

    .line 1027
    .line 1028
    const/16 v21, 0x0

    .line 1029
    .line 1030
    const/16 v22, 0x0

    .line 1031
    .line 1032
    const/16 v23, 0x0

    .line 1033
    .line 1034
    const/16 v24, 0x0

    .line 1035
    .line 1036
    const/16 v25, 0x0

    .line 1037
    .line 1038
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    iget-object v2, v0, Lwb/rg;->h:Lfg/l;

    .line 1043
    .line 1044
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    goto/16 :goto_4

    .line 1048
    .line 1049
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
