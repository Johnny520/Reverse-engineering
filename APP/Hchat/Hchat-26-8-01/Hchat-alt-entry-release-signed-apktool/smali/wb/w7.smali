.class public final synthetic Lwb/w7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/w7;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/w7;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/w7;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/w7;->j:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/w7;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/w7;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/w7;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/w7;->n:Li0/a1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/w7;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lp/x0;

    .line 11
    .line 12
    move-object/from16 v11, p2

    .line 13
    .line 14
    check-cast v11, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v3, v2, 0x6

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v3

    .line 41
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v3, 0x0

    .line 51
    :goto_1
    and-int/2addr v2, v5

    .line 52
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 59
    .line 60
    iget-object v3, v0, Lwb/w7;->h:Lsh/x;

    .line 61
    .line 62
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1}, Lp/x0;->c()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    add-float/2addr v3, v4

    .line 77
    invoke-interface {v1}, Lp/x0;->a()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v4, 0x54

    .line 82
    .line 83
    int-to-float v4, v4

    .line 84
    add-float/2addr v1, v4

    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v13, v0, Lwb/w7;->j:Landroid/content/SharedPreferences;

    .line 91
    .line 92
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-nez v1, :cond_3

    .line 101
    .line 102
    sget-object v1, Li0/l;->a:Li0/e;

    .line 103
    .line 104
    if-ne v3, v1, :cond_4

    .line 105
    .line 106
    :cond_3
    new-instance v12, Lwb/eh;

    .line 107
    .line 108
    const/16 v18, 0x4

    .line 109
    .line 110
    iget-object v14, v0, Lwb/w7;->k:Li0/a1;

    .line 111
    .line 112
    iget-object v15, v0, Lwb/w7;->l:Li0/a1;

    .line 113
    .line 114
    iget-object v1, v0, Lwb/w7;->m:Li0/a1;

    .line 115
    .line 116
    iget-object v3, v0, Lwb/w7;->n:Li0/a1;

    .line 117
    .line 118
    move-object/from16 v16, v1

    .line 119
    .line 120
    move-object/from16 v17, v3

    .line 121
    .line 122
    invoke-direct/range {v12 .. v18}, Lwb/eh;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v3, v12

    .line 129
    :cond_4
    move-object v10, v3

    .line 130
    check-cast v10, Lfg/l;

    .line 131
    .line 132
    const/4 v12, 0x0

    .line 133
    const/16 v13, 0x1f8

    .line 134
    .line 135
    iget-object v3, v0, Lwb/w7;->i:Lr/z;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v8, 0x0

    .line 141
    const/4 v9, 0x0

    .line 142
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 147
    .line 148
    .line 149
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 150
    .line 151
    return-object v1

    .line 152
    :pswitch_0
    move-object/from16 v1, p1

    .line 153
    .line 154
    check-cast v1, Lp/x0;

    .line 155
    .line 156
    move-object/from16 v11, p2

    .line 157
    .line 158
    check-cast v11, Li0/h0;

    .line 159
    .line 160
    move-object/from16 v2, p3

    .line 161
    .line 162
    check-cast v2, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    and-int/lit8 v3, v2, 0x6

    .line 172
    .line 173
    if-nez v3, :cond_7

    .line 174
    .line 175
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    const/4 v3, 0x4

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    const/4 v3, 0x2

    .line 184
    :goto_3
    or-int/2addr v2, v3

    .line 185
    :cond_7
    and-int/lit8 v3, v2, 0x13

    .line 186
    .line 187
    const/16 v4, 0x12

    .line 188
    .line 189
    const/4 v5, 0x1

    .line 190
    if-eq v3, v4, :cond_8

    .line 191
    .line 192
    move v3, v5

    .line 193
    goto :goto_4

    .line 194
    :cond_8
    const/4 v3, 0x0

    .line 195
    :goto_4
    and-int/2addr v2, v5

    .line 196
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_b

    .line 201
    .line 202
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 203
    .line 204
    iget-object v3, v0, Lwb/w7;->h:Lsh/x;

    .line 205
    .line 206
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 207
    .line 208
    const/4 v4, 0x0

    .line 209
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-interface {v1}, Lp/x0;->c()F

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    const/16 v4, 0x8

    .line 218
    .line 219
    int-to-float v4, v4

    .line 220
    add-float/2addr v3, v4

    .line 221
    invoke-interface {v1}, Lp/x0;->a()F

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    const/16 v4, 0x54

    .line 226
    .line 227
    int-to-float v4, v4

    .line 228
    add-float/2addr v1, v4

    .line 229
    const/4 v4, 0x5

    .line 230
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iget-object v13, v0, Lwb/w7;->j:Landroid/content/SharedPreferences;

    .line 235
    .line 236
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-nez v1, :cond_9

    .line 245
    .line 246
    sget-object v1, Li0/l;->a:Li0/e;

    .line 247
    .line 248
    if-ne v3, v1, :cond_a

    .line 249
    .line 250
    :cond_9
    new-instance v12, Lwb/eh;

    .line 251
    .line 252
    const/16 v18, 0x2

    .line 253
    .line 254
    iget-object v14, v0, Lwb/w7;->k:Li0/a1;

    .line 255
    .line 256
    iget-object v15, v0, Lwb/w7;->l:Li0/a1;

    .line 257
    .line 258
    iget-object v1, v0, Lwb/w7;->m:Li0/a1;

    .line 259
    .line 260
    iget-object v3, v0, Lwb/w7;->n:Li0/a1;

    .line 261
    .line 262
    move-object/from16 v16, v1

    .line 263
    .line 264
    move-object/from16 v17, v3

    .line 265
    .line 266
    invoke-direct/range {v12 .. v18}, Lwb/eh;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    move-object v3, v12

    .line 273
    :cond_a
    move-object v10, v3

    .line 274
    check-cast v10, Lfg/l;

    .line 275
    .line 276
    const/4 v12, 0x0

    .line 277
    const/16 v13, 0x1f8

    .line 278
    .line 279
    iget-object v3, v0, Lwb/w7;->i:Lr/z;

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    const/4 v6, 0x0

    .line 283
    const/4 v7, 0x0

    .line 284
    const/4 v8, 0x0

    .line 285
    const/4 v9, 0x0

    .line 286
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 287
    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_b
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 291
    .line 292
    .line 293
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 294
    .line 295
    return-object v1

    .line 296
    :pswitch_1
    move-object/from16 v1, p1

    .line 297
    .line 298
    check-cast v1, Lp/x0;

    .line 299
    .line 300
    move-object/from16 v11, p2

    .line 301
    .line 302
    check-cast v11, Li0/h0;

    .line 303
    .line 304
    move-object/from16 v2, p3

    .line 305
    .line 306
    check-cast v2, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    and-int/lit8 v3, v2, 0x6

    .line 316
    .line 317
    if-nez v3, :cond_d

    .line 318
    .line 319
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_c

    .line 324
    .line 325
    const/4 v3, 0x4

    .line 326
    goto :goto_6

    .line 327
    :cond_c
    const/4 v3, 0x2

    .line 328
    :goto_6
    or-int/2addr v2, v3

    .line 329
    :cond_d
    and-int/lit8 v3, v2, 0x13

    .line 330
    .line 331
    const/16 v4, 0x12

    .line 332
    .line 333
    const/4 v5, 0x1

    .line 334
    if-eq v3, v4, :cond_e

    .line 335
    .line 336
    move v3, v5

    .line 337
    goto :goto_7

    .line 338
    :cond_e
    const/4 v3, 0x0

    .line 339
    :goto_7
    and-int/2addr v2, v5

    .line 340
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-eqz v2, :cond_11

    .line 345
    .line 346
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 347
    .line 348
    iget-object v3, v0, Lwb/w7;->h:Lsh/x;

    .line 349
    .line 350
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 351
    .line 352
    const/4 v4, 0x0

    .line 353
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-interface {v1}, Lp/x0;->c()F

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    const/16 v4, 0x8

    .line 362
    .line 363
    int-to-float v4, v4

    .line 364
    add-float/2addr v3, v4

    .line 365
    invoke-interface {v1}, Lp/x0;->a()F

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    const/16 v4, 0x54

    .line 370
    .line 371
    int-to-float v4, v4

    .line 372
    add-float/2addr v1, v4

    .line 373
    const/4 v4, 0x5

    .line 374
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    iget-object v13, v0, Lwb/w7;->j:Landroid/content/SharedPreferences;

    .line 379
    .line 380
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    if-nez v1, :cond_f

    .line 389
    .line 390
    sget-object v1, Li0/l;->a:Li0/e;

    .line 391
    .line 392
    if-ne v3, v1, :cond_10

    .line 393
    .line 394
    :cond_f
    new-instance v12, Lwb/eh;

    .line 395
    .line 396
    const/16 v18, 0x3

    .line 397
    .line 398
    iget-object v14, v0, Lwb/w7;->k:Li0/a1;

    .line 399
    .line 400
    iget-object v15, v0, Lwb/w7;->l:Li0/a1;

    .line 401
    .line 402
    iget-object v1, v0, Lwb/w7;->m:Li0/a1;

    .line 403
    .line 404
    iget-object v3, v0, Lwb/w7;->n:Li0/a1;

    .line 405
    .line 406
    move-object/from16 v16, v1

    .line 407
    .line 408
    move-object/from16 v17, v3

    .line 409
    .line 410
    invoke-direct/range {v12 .. v18}, Lwb/eh;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    move-object v3, v12

    .line 417
    :cond_10
    move-object v10, v3

    .line 418
    check-cast v10, Lfg/l;

    .line 419
    .line 420
    const/4 v12, 0x0

    .line 421
    const/16 v13, 0x1f8

    .line 422
    .line 423
    iget-object v3, v0, Lwb/w7;->i:Lr/z;

    .line 424
    .line 425
    const/4 v5, 0x0

    .line 426
    const/4 v6, 0x0

    .line 427
    const/4 v7, 0x0

    .line 428
    const/4 v8, 0x0

    .line 429
    const/4 v9, 0x0

    .line 430
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 431
    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_11
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 435
    .line 436
    .line 437
    :goto_8
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 438
    .line 439
    return-object v1

    .line 440
    :pswitch_2
    move-object/from16 v1, p1

    .line 441
    .line 442
    check-cast v1, Lp/x0;

    .line 443
    .line 444
    move-object/from16 v11, p2

    .line 445
    .line 446
    check-cast v11, Li0/h0;

    .line 447
    .line 448
    move-object/from16 v2, p3

    .line 449
    .line 450
    check-cast v2, Ljava/lang/Integer;

    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    and-int/lit8 v3, v2, 0x6

    .line 460
    .line 461
    if-nez v3, :cond_13

    .line 462
    .line 463
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-eqz v3, :cond_12

    .line 468
    .line 469
    const/4 v3, 0x4

    .line 470
    goto :goto_9

    .line 471
    :cond_12
    const/4 v3, 0x2

    .line 472
    :goto_9
    or-int/2addr v2, v3

    .line 473
    :cond_13
    and-int/lit8 v3, v2, 0x13

    .line 474
    .line 475
    const/16 v4, 0x12

    .line 476
    .line 477
    const/4 v5, 0x1

    .line 478
    if-eq v3, v4, :cond_14

    .line 479
    .line 480
    move v3, v5

    .line 481
    goto :goto_a

    .line 482
    :cond_14
    const/4 v3, 0x0

    .line 483
    :goto_a
    and-int/2addr v2, v5

    .line 484
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_17

    .line 489
    .line 490
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 491
    .line 492
    iget-object v3, v0, Lwb/w7;->h:Lsh/x;

    .line 493
    .line 494
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 495
    .line 496
    const/4 v4, 0x0

    .line 497
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-interface {v1}, Lp/x0;->c()F

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    const/16 v4, 0x8

    .line 506
    .line 507
    int-to-float v4, v4

    .line 508
    add-float/2addr v3, v4

    .line 509
    invoke-interface {v1}, Lp/x0;->a()F

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    const/16 v4, 0x54

    .line 514
    .line 515
    int-to-float v4, v4

    .line 516
    add-float/2addr v1, v4

    .line 517
    const/4 v4, 0x5

    .line 518
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    iget-object v13, v0, Lwb/w7;->j:Landroid/content/SharedPreferences;

    .line 523
    .line 524
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    if-nez v1, :cond_15

    .line 533
    .line 534
    sget-object v1, Li0/l;->a:Li0/e;

    .line 535
    .line 536
    if-ne v3, v1, :cond_16

    .line 537
    .line 538
    :cond_15
    new-instance v12, Lwb/eh;

    .line 539
    .line 540
    const/16 v18, 0x1

    .line 541
    .line 542
    iget-object v14, v0, Lwb/w7;->k:Li0/a1;

    .line 543
    .line 544
    iget-object v15, v0, Lwb/w7;->l:Li0/a1;

    .line 545
    .line 546
    iget-object v1, v0, Lwb/w7;->m:Li0/a1;

    .line 547
    .line 548
    iget-object v3, v0, Lwb/w7;->n:Li0/a1;

    .line 549
    .line 550
    move-object/from16 v16, v1

    .line 551
    .line 552
    move-object/from16 v17, v3

    .line 553
    .line 554
    invoke-direct/range {v12 .. v18}, Lwb/eh;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    move-object v3, v12

    .line 561
    :cond_16
    move-object v10, v3

    .line 562
    check-cast v10, Lfg/l;

    .line 563
    .line 564
    const/4 v12, 0x0

    .line 565
    const/16 v13, 0x1f8

    .line 566
    .line 567
    iget-object v3, v0, Lwb/w7;->i:Lr/z;

    .line 568
    .line 569
    const/4 v5, 0x0

    .line 570
    const/4 v6, 0x0

    .line 571
    const/4 v7, 0x0

    .line 572
    const/4 v8, 0x0

    .line 573
    const/4 v9, 0x0

    .line 574
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 575
    .line 576
    .line 577
    goto :goto_b

    .line 578
    :cond_17
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 579
    .line 580
    .line 581
    :goto_b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 582
    .line 583
    return-object v1

    .line 584
    nop

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
