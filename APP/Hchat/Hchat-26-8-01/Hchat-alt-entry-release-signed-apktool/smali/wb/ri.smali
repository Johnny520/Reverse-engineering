.class public final synthetic Lwb/ri;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx8/b;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Lx8/b;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/ri;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/ri;->h:Lx8/b;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ri;->i:Lfg/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ri;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v11, 0x0

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v10

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v11

    .line 30
    :goto_0
    and-int/2addr v1, v10

    .line 31
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_c

    .line 36
    .line 37
    iget-object v1, v0, Lwb/ri;->h:Lx8/b;

    .line 38
    .line 39
    iget-boolean v2, v1, Lx8/b;->c:Z

    .line 40
    .line 41
    iget v12, v1, Lx8/b;->f:I

    .line 42
    .line 43
    iget-object v13, v0, Lwb/ri;->i:Lfg/l;

    .line 44
    .line 45
    invoke-virtual {v7, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    or-int/2addr v3, v4

    .line 54
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget-object v14, Li0/l;->a:Li0/e;

    .line 59
    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    if-ne v4, v14, :cond_2

    .line 63
    .line 64
    :cond_1
    new-instance v4, Lwb/mj;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v4, v3, v13, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    move-object v6, v4

    .line 74
    check-cast v6, Lfg/l;

    .line 75
    .line 76
    const/16 v8, 0x1b0

    .line 77
    .line 78
    const/16 v9, 0x8

    .line 79
    .line 80
    const-string v3, "\u542f\u7528\u89c4\u5219"

    .line 81
    .line 82
    const-string v4, "\u5173\u95ed\u540e\u4fdd\u7559\u914d\u7f6e\u4f46\u4e0d\u89e6\u53d1"

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 86
    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    invoke-static {v15, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 90
    .line 91
    .line 92
    iget-object v4, v1, Lx8/b;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v7, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    or-int/2addr v2, v3

    .line 103
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v2, :cond_3

    .line 108
    .line 109
    if-ne v3, v14, :cond_4

    .line 110
    .line 111
    :cond_3
    new-instance v3, Lwb/mj;

    .line 112
    .line 113
    const/4 v2, 0x1

    .line 114
    invoke-direct {v3, v2, v13, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    move-object v6, v3

    .line 121
    check-cast v6, Lfg/l;

    .line 122
    .line 123
    const/16 v8, 0x36

    .line 124
    .line 125
    const/16 v9, 0x8

    .line 126
    .line 127
    const-string v2, "\u89c4\u5219\u540d\u79f0"

    .line 128
    .line 129
    const-string v3, "\u7528\u4e8e\u5217\u8868\u91cc\u8bc6\u522b\u89c4\u5219"

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 133
    .line 134
    .line 135
    invoke-static {v15, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 136
    .line 137
    .line 138
    invoke-static {v12}, Lwb/ho;->K4(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {}, Lwb/ho;->L4()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    iget v5, v1, Lx8/b;->f:I

    .line 147
    .line 148
    invoke-virtual {v7, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    or-int/2addr v2, v6

    .line 157
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-nez v2, :cond_5

    .line 162
    .line 163
    if-ne v6, v14, :cond_6

    .line 164
    .line 165
    :cond_5
    new-instance v6, Lwb/mj;

    .line 166
    .line 167
    const/4 v2, 0x2

    .line 168
    invoke-direct {v6, v2, v13, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_6
    check-cast v6, Lfg/l;

    .line 175
    .line 176
    move-object v8, v7

    .line 177
    const/4 v7, 0x0

    .line 178
    const/4 v9, 0x6

    .line 179
    const-string v2, "\u5339\u914d\u65b9\u5f0f"

    .line 180
    .line 181
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 182
    .line 183
    .line 184
    move-object v7, v8

    .line 185
    const/4 v2, 0x3

    .line 186
    if-eq v12, v2, :cond_9

    .line 187
    .line 188
    const v2, -0x1d26606b

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v2}, Li0/h0;->a0(I)V

    .line 192
    .line 193
    .line 194
    invoke-static {v15, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 195
    .line 196
    .line 197
    iget-object v4, v1, Lx8/b;->d:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v7, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    or-int/2addr v2, v3

    .line 208
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    if-nez v2, :cond_7

    .line 213
    .line 214
    if-ne v3, v14, :cond_8

    .line 215
    .line 216
    :cond_7
    new-instance v3, Lwb/mj;

    .line 217
    .line 218
    const/4 v2, 0x3

    .line 219
    invoke-direct {v3, v2, v13, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_8
    move-object v6, v3

    .line 226
    check-cast v6, Lfg/l;

    .line 227
    .line 228
    const/16 v8, 0xc36

    .line 229
    .line 230
    const/4 v9, 0x0

    .line 231
    const-string v2, "\u5173\u952e\u8bcd"

    .line 232
    .line 233
    const-string v3, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528 |\u3001\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 234
    .line 235
    const/4 v5, 0x2

    .line 236
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_9
    const v2, -0x1d227ce8

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v2}, Li0/h0;->a0(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {v15, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 250
    .line 251
    .line 252
    iget-object v4, v1, Lx8/b;->e:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v7, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    or-int/2addr v2, v3

    .line 263
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-nez v2, :cond_a

    .line 268
    .line 269
    if-ne v3, v14, :cond_b

    .line 270
    .line 271
    :cond_a
    new-instance v3, Lwb/mj;

    .line 272
    .line 273
    const/4 v2, 0x4

    .line 274
    invoke-direct {v3, v2, v13, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_b
    move-object v6, v3

    .line 281
    check-cast v6, Lfg/l;

    .line 282
    .line 283
    const/16 v8, 0xc36

    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    const-string v2, "\u6392\u9664\u5173\u952e\u8bcd"

    .line 287
    .line 288
    const-string v3, "\u5305\u542b\u4efb\u4e00\u5173\u952e\u8bcd\u65f6\u4e0d\u89e6\u53d1\uff0c\u591a\u4e2a\u7528 |\u3001\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 289
    .line 290
    const/4 v5, 0x2

    .line 291
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_1

    .line 298
    :cond_c
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 299
    .line 300
    .line 301
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 302
    .line 303
    return-object v1

    .line 304
    :pswitch_0
    move-object/from16 v5, p1

    .line 305
    .line 306
    check-cast v5, Li0/h0;

    .line 307
    .line 308
    move-object/from16 v1, p2

    .line 309
    .line 310
    check-cast v1, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    and-int/lit8 v2, v1, 0x3

    .line 317
    .line 318
    const/4 v3, 0x2

    .line 319
    const/4 v10, 0x0

    .line 320
    const/4 v11, 0x1

    .line 321
    if-eq v2, v3, :cond_d

    .line 322
    .line 323
    move v2, v11

    .line 324
    goto :goto_2

    .line 325
    :cond_d
    move v2, v10

    .line 326
    :goto_2
    and-int/2addr v1, v11

    .line 327
    invoke-virtual {v5, v1, v2}, Li0/h0;->S(IZ)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_20

    .line 332
    .line 333
    iget-object v1, v0, Lwb/ri;->h:Lx8/b;

    .line 334
    .line 335
    iget v2, v1, Lx8/b;->l:I

    .line 336
    .line 337
    invoke-static {}, Lwb/ho;->J4()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    const/4 v12, 0x0

    .line 350
    if-eqz v4, :cond_f

    .line 351
    .line 352
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    move-object v6, v4

    .line 357
    check-cast v6, Lwb/bp;

    .line 358
    .line 359
    iget v6, v6, Lwb/bp;->b:I

    .line 360
    .line 361
    if-ne v6, v2, :cond_e

    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_f
    move-object v4, v12

    .line 365
    :goto_3
    check-cast v4, Lwb/bp;

    .line 366
    .line 367
    const-string v13, "\u4e0d\u9650"

    .line 368
    .line 369
    if-eqz v4, :cond_10

    .line 370
    .line 371
    iget-object v2, v4, Lwb/bp;->a:Ljava/lang/String;

    .line 372
    .line 373
    if-eqz v2, :cond_10

    .line 374
    .line 375
    move-object v3, v2

    .line 376
    goto :goto_4

    .line 377
    :cond_10
    move-object v3, v13

    .line 378
    :goto_4
    invoke-static {}, Lwb/ho;->J4()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget v2, v1, Lx8/b;->l:I

    .line 383
    .line 384
    iget-object v14, v0, Lwb/ri;->i:Lfg/l;

    .line 385
    .line 386
    invoke-virtual {v5, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    invoke-virtual {v5, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    or-int/2addr v6, v7

    .line 395
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    sget-object v15, Li0/l;->a:Li0/e;

    .line 400
    .line 401
    if-nez v6, :cond_11

    .line 402
    .line 403
    if-ne v7, v15, :cond_12

    .line 404
    .line 405
    :cond_11
    new-instance v7, Lwb/mj;

    .line 406
    .line 407
    const/4 v6, 0x6

    .line 408
    invoke-direct {v7, v6, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :cond_12
    move-object v6, v7

    .line 415
    check-cast v6, Lfg/l;

    .line 416
    .line 417
    const/4 v7, 0x0

    .line 418
    const/4 v9, 0x6

    .line 419
    move-object v8, v5

    .line 420
    move v5, v2

    .line 421
    const-string v2, "@ \u89e6\u53d1"

    .line 422
    .line 423
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 424
    .line 425
    .line 426
    const/4 v2, 0x0

    .line 427
    invoke-static {v2, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 428
    .line 429
    .line 430
    iget v3, v1, Lx8/b;->m:I

    .line 431
    .line 432
    invoke-static {}, Lwb/ho;->M4()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-eqz v5, :cond_14

    .line 445
    .line 446
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    move-object v6, v5

    .line 451
    check-cast v6, Lwb/bp;

    .line 452
    .line 453
    iget v6, v6, Lwb/bp;->b:I

    .line 454
    .line 455
    if-ne v6, v3, :cond_13

    .line 456
    .line 457
    move-object v12, v5

    .line 458
    :cond_14
    check-cast v12, Lwb/bp;

    .line 459
    .line 460
    if-eqz v12, :cond_15

    .line 461
    .line 462
    iget-object v3, v12, Lwb/bp;->a:Ljava/lang/String;

    .line 463
    .line 464
    if-eqz v3, :cond_15

    .line 465
    .line 466
    goto :goto_5

    .line 467
    :cond_15
    move-object v3, v13

    .line 468
    :goto_5
    invoke-static {}, Lwb/ho;->M4()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    iget v5, v1, Lx8/b;->m:I

    .line 473
    .line 474
    invoke-virtual {v8, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    or-int/2addr v6, v7

    .line 483
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    if-nez v6, :cond_16

    .line 488
    .line 489
    if-ne v7, v15, :cond_17

    .line 490
    .line 491
    :cond_16
    new-instance v7, Lwb/mj;

    .line 492
    .line 493
    const/4 v6, 0x7

    .line 494
    invoke-direct {v7, v6, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    :cond_17
    move-object v6, v7

    .line 501
    check-cast v6, Lfg/l;

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const/4 v9, 0x6

    .line 505
    move v12, v2

    .line 506
    const-string v2, "\u62cd\u4e00\u62cd"

    .line 507
    .line 508
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 509
    .line 510
    .line 511
    invoke-static {v12, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 512
    .line 513
    .line 514
    iget-object v7, v1, Lx8/b;->n:Ljava/lang/String;

    .line 515
    .line 516
    invoke-virtual {v8, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    or-int/2addr v2, v3

    .line 525
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    if-nez v2, :cond_18

    .line 530
    .line 531
    if-ne v3, v15, :cond_19

    .line 532
    .line 533
    :cond_18
    new-instance v3, Lwb/mj;

    .line 534
    .line 535
    const/16 v2, 0x8

    .line 536
    .line 537
    invoke-direct {v3, v2, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    :cond_19
    move-object v4, v3

    .line 544
    check-cast v4, Lfg/l;

    .line 545
    .line 546
    const/16 v2, 0x186

    .line 547
    .line 548
    const/4 v3, 0x0

    .line 549
    const-string v6, "\u5f00\u59cb\u65f6\u95f4"

    .line 550
    .line 551
    move-object v5, v8

    .line 552
    const/4 v8, 0x1

    .line 553
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 554
    .line 555
    .line 556
    move-object v8, v5

    .line 557
    invoke-static {v12, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 558
    .line 559
    .line 560
    iget-object v7, v1, Lx8/b;->o:Ljava/lang/String;

    .line 561
    .line 562
    invoke-virtual {v8, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    or-int/2addr v2, v3

    .line 571
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    if-nez v2, :cond_1a

    .line 576
    .line 577
    if-ne v3, v15, :cond_1b

    .line 578
    .line 579
    :cond_1a
    new-instance v3, Lwb/mj;

    .line 580
    .line 581
    const/16 v2, 0x9

    .line 582
    .line 583
    invoke-direct {v3, v2, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    :cond_1b
    move-object v4, v3

    .line 590
    check-cast v4, Lfg/l;

    .line 591
    .line 592
    const/16 v2, 0x186

    .line 593
    .line 594
    const/4 v3, 0x0

    .line 595
    const-string v6, "\u7ed3\u675f\u65f6\u95f4"

    .line 596
    .line 597
    move-object v5, v8

    .line 598
    const/4 v8, 0x1

    .line 599
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 600
    .line 601
    .line 602
    move-object v8, v5

    .line 603
    invoke-static {v12, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 604
    .line 605
    .line 606
    iget v2, v1, Lx8/b;->p:I

    .line 607
    .line 608
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-virtual {v8, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    or-int/2addr v2, v3

    .line 621
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    if-nez v2, :cond_1c

    .line 626
    .line 627
    if-ne v3, v15, :cond_1d

    .line 628
    .line 629
    :cond_1c
    new-instance v3, Lwb/mj;

    .line 630
    .line 631
    const/16 v2, 0xa

    .line 632
    .line 633
    invoke-direct {v3, v2, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    :cond_1d
    move-object v5, v3

    .line 640
    check-cast v5, Lfg/l;

    .line 641
    .line 642
    const/16 v7, 0x36

    .line 643
    .line 644
    const-string v2, "\u6700\u5927\u56de\u590d\u6b21\u6570"

    .line 645
    .line 646
    const-string v3, "0 \u8868\u793a\u4e0d\u9650\u5236\uff0c\u6309\u89c4\u5219/\u4f1a\u8bdd/\u53d1\u9001\u8005\u7edf\u8ba1"

    .line 647
    .line 648
    move-object v6, v8

    .line 649
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 650
    .line 651
    .line 652
    invoke-static {v12, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 653
    .line 654
    .line 655
    iget-wide v2, v1, Lx8/b;->q:J

    .line 656
    .line 657
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v4

    .line 661
    invoke-virtual {v8, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    or-int/2addr v2, v3

    .line 670
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    if-nez v2, :cond_1e

    .line 675
    .line 676
    if-ne v3, v15, :cond_1f

    .line 677
    .line 678
    :cond_1e
    new-instance v3, Lwb/mj;

    .line 679
    .line 680
    const/16 v2, 0xb

    .line 681
    .line 682
    invoke-direct {v3, v2, v14, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    :cond_1f
    move-object v5, v3

    .line 689
    check-cast v5, Lfg/l;

    .line 690
    .line 691
    const/16 v7, 0x36

    .line 692
    .line 693
    const-string v2, "\u56de\u590d\u51b7\u5374\u65f6\u95f4"

    .line 694
    .line 695
    const-string v3, "\u5355\u4f4d\u79d2\uff0c0 \u8868\u793a\u4e0d\u9650\u5236\uff1b\u540c\u4e00\u89c4\u5219\u5728\u540c\u4e00\u4f1a\u8bdd\u5185\u51b7\u5374"

    .line 696
    .line 697
    move-object v6, v8

    .line 698
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 699
    .line 700
    .line 701
    goto :goto_6

    .line 702
    :cond_20
    move-object v8, v5

    .line 703
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 704
    .line 705
    .line 706
    :goto_6
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 707
    .line 708
    return-object v1

    .line 709
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
