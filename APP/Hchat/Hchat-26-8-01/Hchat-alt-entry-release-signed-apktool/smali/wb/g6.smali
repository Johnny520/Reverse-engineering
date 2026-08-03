.class public final synthetic Lwb/g6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Lr/z;

.field public final synthetic i:Li0/j1;

.field public final synthetic j:Li0/j1;

.field public final synthetic k:Li0/j1;

.field public final synthetic l:Li0/j1;

.field public final synthetic m:Z

.field public final synthetic n:Lgg/q;

.field public final synthetic o:Lwb/o6;

.field public final synthetic p:Lgg/u;

.field public final synthetic q:Ljava/util/ArrayList;

.field public final synthetic r:Lgg/u;

.field public final synthetic s:Landroid/view/ViewGroup;

.field public final synthetic t:Lc9/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lr/z;Li0/j1;Li0/j1;Li0/j1;Li0/j1;ZLgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/g6;->g:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/g6;->h:Lr/z;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/g6;->i:Li0/j1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/g6;->j:Li0/j1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/g6;->k:Li0/j1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/g6;->l:Li0/j1;

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/g6;->m:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwb/g6;->n:Lgg/q;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/g6;->o:Lwb/o6;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/g6;->p:Lgg/u;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/g6;->q:Ljava/util/ArrayList;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/g6;->r:Lgg/u;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/g6;->s:Landroid/view/ViewGroup;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/g6;->t:Lc9/a1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lh/n;

    .line 6
    .line 7
    move-object/from16 v5, p2

    .line 8
    .line 9
    check-cast v5, Lwb/x2;

    .line 10
    .line 11
    move-object/from16 v11, p3

    .line 12
    .line 13
    check-cast v11, Li0/h0;

    .line 14
    .line 15
    move-object/from16 v2, p4

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    and-int/lit8 v1, v2, 0x30

    .line 27
    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    and-int/lit8 v1, v2, 0x40

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_0
    if-eqz v1, :cond_1

    .line 46
    .line 47
    move v1, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/16 v1, 0x10

    .line 50
    .line 51
    :goto_1
    or-int/2addr v2, v1

    .line 52
    :cond_2
    and-int/lit16 v1, v2, 0x91

    .line 53
    .line 54
    const/16 v4, 0x90

    .line 55
    .line 56
    const/4 v6, 0x1

    .line 57
    const/4 v7, 0x0

    .line 58
    if-eq v1, v4, :cond_3

    .line 59
    .line 60
    move v1, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v1, v7

    .line 63
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 64
    .line 65
    invoke-virtual {v11, v4, v1}, Li0/h0;->S(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_36

    .line 70
    .line 71
    const/4 v4, 0x2

    .line 72
    iget-object v8, v0, Lwb/g6;->g:Landroid/app/Activity;

    .line 73
    .line 74
    iget-object v9, v0, Lwb/g6;->k:Li0/j1;

    .line 75
    .line 76
    iget-object v10, v0, Lwb/g6;->l:Li0/j1;

    .line 77
    .line 78
    sget-object v12, Li0/l;->a:Li0/e;

    .line 79
    .line 80
    if-nez v5, :cond_14

    .line 81
    .line 82
    const v2, -0x4ec459bd

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lvb/c;->a:Lvb/c;

    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    sget-object v3, Lvb/c;->b:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v3, v0, Lwb/g6;->i:Li0/j1;

    .line 105
    .line 106
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lwb/t4;

    .line 111
    .line 112
    iget-object v13, v0, Lwb/g6;->j:Li0/j1;

    .line 113
    .line 114
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    check-cast v14, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v15, :cond_4

    .line 133
    .line 134
    if-ne v1, v12, :cond_5

    .line 135
    .line 136
    :cond_4
    new-instance v1, Lwb/h6;

    .line 137
    .line 138
    invoke-direct {v1, v3, v7}, Lwb/h6;-><init>(Li0/j1;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    check-cast v1, Lfg/l;

    .line 145
    .line 146
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    if-nez v3, :cond_6

    .line 155
    .line 156
    if-ne v15, v12, :cond_7

    .line 157
    .line 158
    :cond_6
    new-instance v15, Lwb/i6;

    .line 159
    .line 160
    invoke-direct {v15, v9, v6}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    check-cast v15, Lfg/a;

    .line 167
    .line 168
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    if-nez v3, :cond_8

    .line 177
    .line 178
    if-ne v6, v12, :cond_9

    .line 179
    .line 180
    :cond_8
    new-instance v6, Lwb/h6;

    .line 181
    .line 182
    invoke-direct {v6, v9, v4}, Lwb/h6;-><init>(Li0/j1;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_9
    check-cast v6, Lfg/l;

    .line 189
    .line 190
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    if-nez v3, :cond_a

    .line 199
    .line 200
    if-ne v7, v12, :cond_b

    .line 201
    .line 202
    :cond_a
    new-instance v7, Lwb/h6;

    .line 203
    .line 204
    const/4 v3, 0x3

    .line 205
    invoke-direct {v7, v9, v3}, Lwb/h6;-><init>(Li0/j1;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_b
    check-cast v7, Lfg/l;

    .line 212
    .line 213
    invoke-virtual {v11, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    move-object/from16 p4, v1

    .line 222
    .line 223
    const/4 v1, 0x4

    .line 224
    if-nez v3, :cond_c

    .line 225
    .line 226
    if-ne v4, v12, :cond_d

    .line 227
    .line 228
    :cond_c
    new-instance v4, Lwb/h6;

    .line 229
    .line 230
    invoke-direct {v4, v10, v1}, Lwb/h6;-><init>(Li0/j1;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_d
    check-cast v4, Lfg/l;

    .line 237
    .line 238
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    if-nez v3, :cond_e

    .line 247
    .line 248
    if-ne v10, v12, :cond_f

    .line 249
    .line 250
    :cond_e
    new-instance v10, Lwb/i6;

    .line 251
    .line 252
    const/4 v3, 0x2

    .line 253
    invoke-direct {v10, v9, v3}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_f
    move-object/from16 v16, v10

    .line 260
    .line 261
    check-cast v16, Lfg/a;

    .line 262
    .line 263
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    if-nez v3, :cond_10

    .line 272
    .line 273
    if-ne v10, v12, :cond_11

    .line 274
    .line 275
    :cond_10
    new-instance v10, Lwb/i6;

    .line 276
    .line 277
    const/4 v3, 0x3

    .line 278
    invoke-direct {v10, v9, v3}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_11
    move-object/from16 v17, v10

    .line 285
    .line 286
    check-cast v17, Lfg/a;

    .line 287
    .line 288
    invoke-virtual {v11, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    if-nez v3, :cond_12

    .line 297
    .line 298
    if-ne v9, v12, :cond_13

    .line 299
    .line 300
    :cond_12
    new-instance v9, Lwb/i6;

    .line 301
    .line 302
    invoke-direct {v9, v13, v1}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_13
    move-object/from16 v18, v9

    .line 309
    .line 310
    check-cast v18, Lfg/a;

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    move-object v13, v6

    .line 315
    move-object v6, v8

    .line 316
    iget-object v8, v0, Lwb/g6;->h:Lr/z;

    .line 317
    .line 318
    move-object v9, v5

    .line 319
    move-object/from16 v19, v11

    .line 320
    .line 321
    move v10, v14

    .line 322
    move-object v12, v15

    .line 323
    const/4 v1, 0x0

    .line 324
    move-object/from16 v11, p4

    .line 325
    .line 326
    move-object v15, v4

    .line 327
    move-object v14, v7

    .line 328
    move-object v7, v2

    .line 329
    invoke-static/range {v6 .. v20}, Lwb/ho;->N1(Landroid/content/Context;Ljava/util/List;Lr/z;Lwb/t4;ILfg/l;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 330
    .line 331
    .line 332
    move-object/from16 v11, v19

    .line 333
    .line 334
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_a

    .line 338
    .line 339
    :cond_14
    move v1, v7

    .line 340
    move-object v7, v8

    .line 341
    instance-of v4, v5, Lwb/w2;

    .line 342
    .line 343
    if-eqz v4, :cond_1b

    .line 344
    .line 345
    const v2, -0x4eb0eb92

    .line 346
    .line 347
    .line 348
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 349
    .line 350
    .line 351
    sget-object v2, Lvb/c;->a:Lvb/c;

    .line 352
    .line 353
    new-instance v2, Ljava/util/ArrayList;

    .line 354
    .line 355
    sget-object v3, Lvb/c;->b:Ljava/util/ArrayList;

    .line 356
    .line 357
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    if-nez v3, :cond_15

    .line 376
    .line 377
    if-ne v4, v12, :cond_16

    .line 378
    .line 379
    :cond_15
    new-instance v4, Lwb/i6;

    .line 380
    .line 381
    const/4 v3, 0x5

    .line 382
    invoke-direct {v4, v9, v3}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v11, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    :cond_16
    move-object v8, v4

    .line 389
    check-cast v8, Lfg/a;

    .line 390
    .line 391
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    if-nez v3, :cond_17

    .line 400
    .line 401
    if-ne v4, v12, :cond_18

    .line 402
    .line 403
    :cond_17
    new-instance v4, Lb0/t;

    .line 404
    .line 405
    const/16 v3, 0x1b

    .line 406
    .line 407
    invoke-direct {v4, v9, v3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v11, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :cond_18
    move-object v9, v4

    .line 414
    check-cast v9, Lfg/p;

    .line 415
    .line 416
    invoke-virtual {v11, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    if-nez v3, :cond_19

    .line 425
    .line 426
    if-ne v4, v12, :cond_1a

    .line 427
    .line 428
    :cond_19
    new-instance v4, Lwb/h6;

    .line 429
    .line 430
    invoke-direct {v4, v10, v6}, Lwb/h6;-><init>(Li0/j1;I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v11, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    :cond_1a
    move-object v10, v4

    .line 437
    check-cast v10, Lfg/l;

    .line 438
    .line 439
    const/4 v12, 0x0

    .line 440
    move-object v6, v7

    .line 441
    move-object v7, v2

    .line 442
    invoke-static/range {v6 .. v12}, Lwb/ho;->G3(Landroid/content/Context;Ljava/util/List;Lfg/a;Lfg/p;Lfg/l;Li0/h0;I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 446
    .line 447
    .line 448
    goto/16 :goto_a

    .line 449
    .line 450
    :cond_1b
    instance-of v4, v5, Lwb/t2;

    .line 451
    .line 452
    if-eqz v4, :cond_22

    .line 453
    .line 454
    const v4, -0x4ea3621c

    .line 455
    .line 456
    .line 457
    invoke-virtual {v11, v4}, Li0/h0;->a0(I)V

    .line 458
    .line 459
    .line 460
    move-object v4, v5

    .line 461
    check-cast v4, Lwb/t2;

    .line 462
    .line 463
    iget-object v4, v4, Lwb/t2;->a:Lwb/c3;

    .line 464
    .line 465
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v7

    .line 469
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    if-nez v7, :cond_1c

    .line 474
    .line 475
    if-ne v8, v12, :cond_1d

    .line 476
    .line 477
    :cond_1c
    new-instance v8, Lwb/i6;

    .line 478
    .line 479
    invoke-direct {v8, v9, v1}, Lwb/i6;-><init>(Li0/j1;I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v11, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    :cond_1d
    check-cast v8, Lfg/a;

    .line 486
    .line 487
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    and-int/lit8 v10, v2, 0x70

    .line 492
    .line 493
    if-eq v10, v3, :cond_1f

    .line 494
    .line 495
    and-int/lit8 v2, v2, 0x40

    .line 496
    .line 497
    if-eqz v2, :cond_1e

    .line 498
    .line 499
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    if-eqz v2, :cond_1e

    .line 504
    .line 505
    goto :goto_3

    .line 506
    :cond_1e
    move v6, v1

    .line 507
    :cond_1f
    :goto_3
    or-int v2, v7, v6

    .line 508
    .line 509
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    if-nez v2, :cond_20

    .line 514
    .line 515
    if-ne v3, v12, :cond_21

    .line 516
    .line 517
    :cond_20
    new-instance v3, Lm/b;

    .line 518
    .line 519
    const/16 v2, 0x1d

    .line 520
    .line 521
    invoke-direct {v3, v9, v2, v5}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_21
    check-cast v3, Lfg/l;

    .line 528
    .line 529
    invoke-static {v4, v8, v3, v11, v1}, Lwb/ho;->G0(Lwb/c3;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_a

    .line 536
    .line 537
    :cond_22
    instance-of v4, v5, Lwb/s2;

    .line 538
    .line 539
    if-eqz v4, :cond_2f

    .line 540
    .line 541
    const v4, -0x4e9bb2f1

    .line 542
    .line 543
    .line 544
    invoke-virtual {v11, v4}, Li0/h0;->a0(I)V

    .line 545
    .line 546
    .line 547
    move-object v4, v5

    .line 548
    check-cast v4, Lwb/s2;

    .line 549
    .line 550
    iget-object v4, v4, Lwb/s2;->a:Lvb/a;

    .line 551
    .line 552
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v8

    .line 556
    and-int/lit8 v10, v2, 0x70

    .line 557
    .line 558
    if-eq v10, v3, :cond_24

    .line 559
    .line 560
    and-int/lit8 v13, v2, 0x40

    .line 561
    .line 562
    if-eqz v13, :cond_23

    .line 563
    .line 564
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v13

    .line 568
    if-eqz v13, :cond_23

    .line 569
    .line 570
    goto :goto_4

    .line 571
    :cond_23
    move v13, v1

    .line 572
    goto :goto_5

    .line 573
    :cond_24
    :goto_4
    move v13, v6

    .line 574
    :goto_5
    or-int/2addr v8, v13

    .line 575
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v13

    .line 579
    if-nez v8, :cond_25

    .line 580
    .line 581
    if-ne v13, v12, :cond_26

    .line 582
    .line 583
    :cond_25
    new-instance v13, Lwb/j6;

    .line 584
    .line 585
    invoke-direct {v13, v9, v5, v1}, Lwb/j6;-><init>(Li0/j1;Lwb/x2;I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v11, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_26
    move-object v8, v13

    .line 592
    check-cast v8, Lfg/a;

    .line 593
    .line 594
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v13

    .line 598
    if-eq v10, v3, :cond_28

    .line 599
    .line 600
    and-int/lit8 v14, v2, 0x40

    .line 601
    .line 602
    if-eqz v14, :cond_27

    .line 603
    .line 604
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v14

    .line 608
    if-eqz v14, :cond_27

    .line 609
    .line 610
    goto :goto_6

    .line 611
    :cond_27
    move v14, v1

    .line 612
    goto :goto_7

    .line 613
    :cond_28
    :goto_6
    move v14, v6

    .line 614
    :goto_7
    or-int/2addr v13, v14

    .line 615
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v14

    .line 619
    if-nez v13, :cond_29

    .line 620
    .line 621
    if-ne v14, v12, :cond_2a

    .line 622
    .line 623
    :cond_29
    new-instance v14, Lwb/j6;

    .line 624
    .line 625
    invoke-direct {v14, v9, v5, v6}, Lwb/j6;-><init>(Li0/j1;Lwb/x2;I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v11, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    :cond_2a
    check-cast v14, Lfg/a;

    .line 632
    .line 633
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v13

    .line 637
    if-eq v10, v3, :cond_2c

    .line 638
    .line 639
    and-int/lit8 v2, v2, 0x40

    .line 640
    .line 641
    if-eqz v2, :cond_2b

    .line 642
    .line 643
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    if-eqz v2, :cond_2b

    .line 648
    .line 649
    goto :goto_8

    .line 650
    :cond_2b
    move v6, v1

    .line 651
    :cond_2c
    :goto_8
    or-int v2, v13, v6

    .line 652
    .line 653
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    if-nez v2, :cond_2d

    .line 658
    .line 659
    if-ne v3, v12, :cond_2e

    .line 660
    .line 661
    :cond_2d
    new-instance v3, Lwb/j6;

    .line 662
    .line 663
    const/4 v2, 0x2

    .line 664
    invoke-direct {v3, v9, v5, v2}, Lwb/j6;-><init>(Li0/j1;Lwb/x2;I)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    :cond_2e
    move-object v10, v3

    .line 671
    check-cast v10, Lfg/a;

    .line 672
    .line 673
    const/4 v12, 0x0

    .line 674
    move-object v6, v7

    .line 675
    move-object v9, v14

    .line 676
    move-object v7, v4

    .line 677
    invoke-static/range {v6 .. v12}, Lwb/ho;->L0(Landroid/content/Context;Lvb/a;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 678
    .line 679
    .line 680
    move-object v13, v11

    .line 681
    invoke-virtual {v13, v1}, Li0/h0;->p(Z)V

    .line 682
    .line 683
    .line 684
    goto/16 :goto_a

    .line 685
    .line 686
    :cond_2f
    move-object v14, v7

    .line 687
    move-object v13, v11

    .line 688
    instance-of v4, v5, Lwb/u2;

    .line 689
    .line 690
    if-eqz v4, :cond_30

    .line 691
    .line 692
    const v2, -0x4e8e63f8

    .line 693
    .line 694
    .line 695
    invoke-virtual {v13, v2}, Li0/h0;->a0(I)V

    .line 696
    .line 697
    .line 698
    sget-object v15, Lwb/y2;->n:Lwb/y2;

    .line 699
    .line 700
    new-instance v2, Lwb/k6;

    .line 701
    .line 702
    iget-boolean v3, v0, Lwb/g6;->m:Z

    .line 703
    .line 704
    iget-object v6, v0, Lwb/g6;->n:Lgg/q;

    .line 705
    .line 706
    iget-object v7, v0, Lwb/g6;->o:Lwb/o6;

    .line 707
    .line 708
    iget-object v8, v0, Lwb/g6;->p:Lgg/u;

    .line 709
    .line 710
    move-object v4, v9

    .line 711
    iget-object v9, v0, Lwb/g6;->q:Ljava/util/ArrayList;

    .line 712
    .line 713
    iget-object v10, v0, Lwb/g6;->r:Lgg/u;

    .line 714
    .line 715
    iget-object v11, v0, Lwb/g6;->s:Landroid/view/ViewGroup;

    .line 716
    .line 717
    iget-object v12, v0, Lwb/g6;->t:Lc9/a1;

    .line 718
    .line 719
    invoke-direct/range {v2 .. v12}, Lwb/k6;-><init>(ZLi0/j1;Lwb/x2;Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 720
    .line 721
    .line 722
    move/from16 v18, v3

    .line 723
    .line 724
    move-object/from16 v20, v6

    .line 725
    .line 726
    move-object/from16 v19, v7

    .line 727
    .line 728
    move-object/from16 v17, v8

    .line 729
    .line 730
    move-object/from16 v21, v9

    .line 731
    .line 732
    move-object/from16 v22, v10

    .line 733
    .line 734
    new-instance v16, Lia/n;

    .line 735
    .line 736
    move-object/from16 v23, v11

    .line 737
    .line 738
    move-object/from16 v24, v12

    .line 739
    .line 740
    invoke-direct/range {v16 .. v24}, Lia/n;-><init>(Lgg/u;ZLwb/o6;Lgg/q;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 741
    .line 742
    .line 743
    const/16 v11, 0xc00

    .line 744
    .line 745
    move-object v8, v2

    .line 746
    move-object v10, v13

    .line 747
    move-object v7, v14

    .line 748
    move-object v6, v15

    .line 749
    move-object/from16 v9, v16

    .line 750
    .line 751
    invoke-virtual/range {v6 .. v11}, Lwb/y2;->u0(Landroid/content/Context;Lwb/k6;Lia/n;Li0/h0;I)V

    .line 752
    .line 753
    .line 754
    move-object v11, v10

    .line 755
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 756
    .line 757
    .line 758
    goto :goto_a

    .line 759
    :cond_30
    move-object v4, v9

    .line 760
    move-object v11, v13

    .line 761
    move-object v7, v14

    .line 762
    instance-of v8, v5, Lwb/v2;

    .line 763
    .line 764
    if-eqz v8, :cond_35

    .line 765
    .line 766
    const v8, -0x4e81385b

    .line 767
    .line 768
    .line 769
    invoke-virtual {v11, v8}, Li0/h0;->a0(I)V

    .line 770
    .line 771
    .line 772
    sget-object v8, Lwb/y2;->m:Lwb/y2;

    .line 773
    .line 774
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v9

    .line 778
    and-int/lit8 v10, v2, 0x70

    .line 779
    .line 780
    if-eq v10, v3, :cond_32

    .line 781
    .line 782
    and-int/lit8 v2, v2, 0x40

    .line 783
    .line 784
    if-eqz v2, :cond_31

    .line 785
    .line 786
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_31

    .line 791
    .line 792
    goto :goto_9

    .line 793
    :cond_31
    move v6, v1

    .line 794
    :cond_32
    :goto_9
    or-int v2, v9, v6

    .line 795
    .line 796
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    if-nez v2, :cond_33

    .line 801
    .line 802
    if-ne v3, v12, :cond_34

    .line 803
    .line 804
    :cond_33
    new-instance v3, Lwb/j6;

    .line 805
    .line 806
    const/4 v2, 0x3

    .line 807
    invoke-direct {v3, v4, v5, v2}, Lwb/j6;-><init>(Li0/j1;Lwb/x2;I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    :cond_34
    check-cast v3, Lfg/a;

    .line 814
    .line 815
    const/16 v2, 0x180

    .line 816
    .line 817
    invoke-virtual {v8, v7, v3, v11, v2}, Lwb/y2;->y1(Landroid/content/Context;Lfg/a;Li0/h0;I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 821
    .line 822
    .line 823
    goto :goto_a

    .line 824
    :cond_35
    const v2, -0x4e7cf3f8

    .line 825
    .line 826
    .line 827
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 831
    .line 832
    .line 833
    goto :goto_a

    .line 834
    :cond_36
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 835
    .line 836
    .line 837
    :goto_a
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 838
    .line 839
    return-object v1
.end method
