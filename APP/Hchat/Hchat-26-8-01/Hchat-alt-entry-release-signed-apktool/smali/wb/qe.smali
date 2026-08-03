.class public final synthetic Lwb/qe;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ldb/c;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILdb/c;Lfg/l;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/qe;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/qe;->h:Ldb/c;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/qe;->i:Lfg/l;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/qe;->g:I

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
    const/4 v4, 0x1

    .line 24
    if-eq v2, v3, :cond_0

    .line 25
    .line 26
    move v2, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    :goto_0
    and-int/2addr v1, v4

    .line 30
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    iget-object v1, v0, Lwb/qe;->h:Ldb/c;

    .line 37
    .line 38
    iget-object v4, v1, Ldb/c;->q:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v2, v0, Lwb/qe;->i:Lfg/l;

    .line 41
    .line 42
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    or-int/2addr v3, v5

    .line 51
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    sget-object v3, Li0/l;->a:Li0/e;

    .line 58
    .line 59
    if-ne v5, v3, :cond_2

    .line 60
    .line 61
    :cond_1
    new-instance v5, Lwb/rg;

    .line 62
    .line 63
    const/16 v3, 0x9

    .line 64
    .line 65
    invoke-direct {v5, v3, v1, v2}, Lwb/rg;-><init>(ILdb/c;Lfg/l;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    move-object v6, v5

    .line 72
    check-cast v6, Lfg/l;

    .line 73
    .line 74
    const/16 v8, 0x36

    .line 75
    .line 76
    const/16 v9, 0x8

    .line 77
    .line 78
    const-string v2, "\u4efb\u52a1\u5907\u6ce8"

    .line 79
    .line 80
    const-string v3, "\u7528\u4e8e\u5728\u4efb\u52a1\u5217\u8868\u533a\u5206\u4efb\u52a1\uff0c\u53ef\u7559\u7a7a"

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 91
    .line 92
    return-object v1

    .line 93
    :pswitch_0
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Li0/h0;

    .line 96
    .line 97
    move-object/from16 v2, p2

    .line 98
    .line 99
    check-cast v2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    and-int/lit8 v3, v2, 0x3

    .line 106
    .line 107
    const/4 v5, 0x1

    .line 108
    const/4 v6, 0x2

    .line 109
    if-eq v3, v6, :cond_4

    .line 110
    .line 111
    move v3, v5

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    const/4 v3, 0x0

    .line 114
    :goto_2
    and-int/2addr v2, v5

    .line 115
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_17

    .line 120
    .line 121
    iget-object v2, v0, Lwb/qe;->h:Ldb/c;

    .line 122
    .line 123
    iget-object v3, v2, Ldb/c;->q:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v7, v2, Ldb/c;->f:Ljava/util/List;

    .line 126
    .line 127
    iget v8, v2, Ldb/c;->r:I

    .line 128
    .line 129
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-nez v9, :cond_5

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    const/4 v3, 0x0

    .line 145
    :goto_3
    const-string v9, "\u670b\u53cb\u5708"

    .line 146
    .line 147
    const-string v10, " \u00b7 "

    .line 148
    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_6
    if-ne v8, v5, :cond_7

    .line 153
    .line 154
    iget v3, v2, Ldb/c;->s:I

    .line 155
    .line 156
    invoke-static {v3}, Lwb/ho;->Y6(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-string v11, "\u670b\u53cb\u5708 \u00b7 "

    .line 161
    .line 162
    invoke-virtual {v11, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    goto :goto_5

    .line 167
    :cond_7
    invoke-static {v2}, Lwb/ho;->U6(Ldb/c;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v2}, Lwb/ho;->d7(Ldb/c;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    if-ne v8, v5, :cond_8

    .line 176
    .line 177
    move-object v12, v9

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    invoke-static {v7}, Lwb/ho;->a7(Ljava/util/List;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    :goto_4
    invoke-static {v11, v3, v10, v12}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    :goto_5
    iget v11, v2, Ldb/c;->h:I

    .line 188
    .line 189
    if-eq v11, v5, :cond_d

    .line 190
    .line 191
    if-eq v11, v6, :cond_9

    .line 192
    .line 193
    const-string v6, "\u5355\u6b21"

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_9
    iget-object v6, v2, Ldb/c;->i:Ljava/util/Set;

    .line 197
    .line 198
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    const-string v12, "\u6bcf\u5468"

    .line 203
    .line 204
    if-eqz v11, :cond_a

    .line 205
    .line 206
    :goto_6
    move-object v6, v12

    .line 207
    goto :goto_8

    .line 208
    :cond_a
    invoke-static {}, Lwb/ho;->e7()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    new-instance v13, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    :cond_b
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-eqz v14, :cond_c

    .line 226
    .line 227
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    move-object v15, v14

    .line 232
    check-cast v15, Lsf/e;

    .line 233
    .line 234
    iget-object v15, v15, Lsf/e;->g:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-interface {v6, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    if-eqz v15, :cond_b

    .line 241
    .line 242
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_c
    new-instance v6, Lwb/pb;

    .line 247
    .line 248
    const/16 v11, 0x18

    .line 249
    .line 250
    invoke-direct {v6, v11}, Lwb/pb;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const/16 v18, 0x1e

    .line 254
    .line 255
    const-string v14, ""

    .line 256
    .line 257
    const/4 v15, 0x0

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    move-object/from16 v17, v6

    .line 261
    .line 262
    invoke-static/range {v13 .. v18}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    if-eqz v11, :cond_e

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_d
    const-string v6, "\u6bcf\u5929"

    .line 274
    .line 275
    :cond_e
    :goto_8
    iget-wide v11, v2, Ldb/c;->n:J

    .line 276
    .line 277
    const-wide/16 v13, 0x0

    .line 278
    .line 279
    cmp-long v11, v11, v13

    .line 280
    .line 281
    const-string v12, ""

    .line 282
    .line 283
    if-lez v11, :cond_f

    .line 284
    .line 285
    iget v11, v2, Ldb/c;->o:I

    .line 286
    .line 287
    iget v13, v2, Ldb/c;->p:I

    .line 288
    .line 289
    const-string v14, " \u00b7 \u4e0a\u6b21 "

    .line 290
    .line 291
    const-string v15, "/"

    .line 292
    .line 293
    invoke-static {v11, v14, v15, v13}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    goto :goto_9

    .line 298
    :cond_f
    move-object v11, v12

    .line 299
    :goto_9
    const-string v13, " / "

    .line 300
    .line 301
    if-nez v8, :cond_11

    .line 302
    .line 303
    iget v12, v2, Ldb/c;->u:I

    .line 304
    .line 305
    if-ne v12, v5, :cond_10

    .line 306
    .line 307
    const-string v12, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_10
    const-string v12, "\u6a21\u5757\u901a\u9053"

    .line 311
    .line 312
    :goto_a
    invoke-virtual {v12, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    :cond_11
    invoke-static {v2}, La2/a;->v(Ldb/c;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v14

    .line 320
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 321
    .line 322
    .line 323
    move-result v15

    .line 324
    move-object/from16 v16, v3

    .line 325
    .line 326
    iget-wide v3, v2, Ldb/c;->g:J

    .line 327
    .line 328
    if-gt v15, v5, :cond_12

    .line 329
    .line 330
    invoke-static {v3, v4}, Lwb/ho;->b7(J)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    goto :goto_b

    .line 335
    :cond_12
    invoke-static {v3, v4}, Lwb/ho;->b7(J)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    new-instance v14, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string v3, " \u7b49 "

    .line 352
    .line 353
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    const-string v3, " \u4e2a\u65f6\u95f4"

    .line 360
    .line 361
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    :goto_b
    invoke-static {v12, v3, v13, v6, v11}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    iget-object v4, v2, Ldb/c;->q:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-eqz v4, :cond_13

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_13
    invoke-static {v2}, Lwb/ho;->U6(Ldb/c;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-static {v2}, Lwb/ho;->d7(Ldb/c;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    if-ne v8, v5, :cond_14

    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_14
    invoke-static {v7}, Lwb/ho;->a7(Ljava/util/List;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    :goto_c
    new-instance v5, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    :goto_d
    iget-object v4, v0, Lwb/qe;->i:Lfg/l;

    .line 424
    .line 425
    invoke-virtual {v1, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    invoke-virtual {v1, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    or-int/2addr v5, v6

    .line 434
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    if-nez v5, :cond_15

    .line 439
    .line 440
    sget-object v5, Li0/l;->a:Li0/e;

    .line 441
    .line 442
    if-ne v6, v5, :cond_16

    .line 443
    .line 444
    :cond_15
    new-instance v6, Lwb/yg;

    .line 445
    .line 446
    const/4 v5, 0x1

    .line 447
    invoke-direct {v6, v5, v2, v4}, Lwb/yg;-><init>(ILdb/c;Lfg/l;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_16
    check-cast v6, Lfg/a;

    .line 454
    .line 455
    move-object/from16 v2, v16

    .line 456
    .line 457
    const/4 v4, 0x0

    .line 458
    invoke-static {v2, v3, v6, v1, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 459
    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_17
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 463
    .line 464
    .line 465
    :goto_e
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 466
    .line 467
    return-object v1

    .line 468
    :pswitch_1
    move-object/from16 v6, p1

    .line 469
    .line 470
    check-cast v6, Li0/h0;

    .line 471
    .line 472
    move-object/from16 v1, p2

    .line 473
    .line 474
    check-cast v1, Ljava/lang/Integer;

    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    and-int/lit8 v2, v1, 0x3

    .line 481
    .line 482
    const/4 v3, 0x2

    .line 483
    const/4 v8, 0x0

    .line 484
    const/4 v9, 0x1

    .line 485
    if-eq v2, v3, :cond_18

    .line 486
    .line 487
    move v2, v9

    .line 488
    goto :goto_f

    .line 489
    :cond_18
    move v2, v8

    .line 490
    :goto_f
    and-int/2addr v1, v9

    .line 491
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-eqz v1, :cond_1e

    .line 496
    .line 497
    iget-object v1, v0, Lwb/qe;->h:Ldb/c;

    .line 498
    .line 499
    iget v2, v1, Ldb/c;->j:I

    .line 500
    .line 501
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    iget-object v10, v0, Lwb/qe;->i:Lfg/l;

    .line 506
    .line 507
    invoke-virtual {v6, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    invoke-virtual {v6, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    or-int/2addr v2, v3

    .line 516
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    sget-object v11, Li0/l;->a:Li0/e;

    .line 521
    .line 522
    if-nez v2, :cond_19

    .line 523
    .line 524
    if-ne v3, v11, :cond_1a

    .line 525
    .line 526
    :cond_19
    new-instance v3, Lwb/rg;

    .line 527
    .line 528
    const/4 v2, 0x0

    .line 529
    invoke-direct {v3, v2, v1, v10}, Lwb/rg;-><init>(ILdb/c;Lfg/l;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    :cond_1a
    move-object v5, v3

    .line 536
    check-cast v5, Lfg/l;

    .line 537
    .line 538
    const/16 v7, 0x36

    .line 539
    .line 540
    const-string v2, "\u804a\u5929\u95f4\u9694"

    .line 541
    .line 542
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u591a\u4e2a\u804a\u5929\u4e4b\u95f4\u7684\u7b49\u5f85\u65f6\u95f4"

    .line 543
    .line 544
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 545
    .line 546
    .line 547
    invoke-static {v1}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-le v2, v9, :cond_1d

    .line 556
    .line 557
    const v2, -0x4b54fdfc

    .line 558
    .line 559
    .line 560
    invoke-virtual {v6, v2}, Li0/h0;->a0(I)V

    .line 561
    .line 562
    .line 563
    const/4 v2, 0x0

    .line 564
    invoke-static {v2, v6, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 565
    .line 566
    .line 567
    iget v2, v1, Ldb/c;->k:I

    .line 568
    .line 569
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-virtual {v6, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    invoke-virtual {v6, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    or-int/2addr v2, v3

    .line 582
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    if-nez v2, :cond_1b

    .line 587
    .line 588
    if-ne v3, v11, :cond_1c

    .line 589
    .line 590
    :cond_1b
    new-instance v3, Lwb/rg;

    .line 591
    .line 592
    const/4 v2, 0x1

    .line 593
    invoke-direct {v3, v2, v1, v10}, Lwb/rg;-><init>(ILdb/c;Lfg/l;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    :cond_1c
    move-object v5, v3

    .line 600
    check-cast v5, Lfg/l;

    .line 601
    .line 602
    const/16 v7, 0x30

    .line 603
    .line 604
    const-string v2, "\u591a\u6761\u95f4\u9694"

    .line 605
    .line 606
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u540c\u4e00\u804a\u5929\u8fde\u7eed\u53d1\u9001\u7684\u7b49\u5f85\u65f6\u95f4"

    .line 607
    .line 608
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v6, v8}, Li0/h0;->p(Z)V

    .line 612
    .line 613
    .line 614
    goto :goto_10

    .line 615
    :cond_1d
    const v1, -0x4b4fba55

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v6, v8}, Li0/h0;->p(Z)V

    .line 622
    .line 623
    .line 624
    goto :goto_10

    .line 625
    :cond_1e
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 626
    .line 627
    .line 628
    :goto_10
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 629
    .line 630
    return-object v1

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
