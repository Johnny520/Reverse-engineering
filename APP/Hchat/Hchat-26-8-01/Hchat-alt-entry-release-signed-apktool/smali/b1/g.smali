.class public final Lb1/g;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld1/b0;Ld1/p;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lb1/g;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Lb1/g;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lb1/g;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p3, Lgg/m;

    .line 9
    .line 10
    iput-object p3, p0, Lb1/g;->j:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p4, p0, Lb1/g;->g:I

    iput-object p1, p0, Lb1/g;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb1/g;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb1/g;->j:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lb1/g;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, Lh1/d;

    .line 11
    .line 12
    iget-object v2, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lx2/v;

    .line 15
    .line 16
    iget-object v3, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lx1/f0;

    .line 19
    .line 20
    iget-object v4, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Lx2/v;

    .line 23
    .line 24
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v2}, Lx2/h;->getView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/16 v6, 0x8

    .line 41
    .line 42
    if-eq v5, v6, :cond_2

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    iput-boolean v5, v2, Lx2/h;->E:Z

    .line 46
    .line 47
    iget-object v3, v3, Lx1/f0;->t:Lx1/r1;

    .line 48
    .line 49
    instance-of v5, v3, Ly1/t;

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    check-cast v3, Ly1/t;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v3, 0x0

    .line 57
    :goto_0
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-static {v0}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v3}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 v0, 0x0

    .line 74
    iput-boolean v0, v2, Lx2/h;->E:Z

    .line 75
    .line 76
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_0
    move-object/from16 v0, p1

    .line 80
    .line 81
    check-cast v0, Lh1/d;

    .line 82
    .line 83
    iget-object v2, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Lx1/h0;

    .line 86
    .line 87
    iget-object v3, v2, Lx1/h0;->g:Lh1/b;

    .line 88
    .line 89
    iget-object v4, v2, Lx1/h0;->h:Lx1/m;

    .line 90
    .line 91
    iget-object v5, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Lx1/m;

    .line 94
    .line 95
    iput-object v5, v2, Lx1/h0;->h:Lx1/m;

    .line 96
    .line 97
    :try_start_0
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Lb5/c;->s()Lu2/c;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v6}, Lb5/c;->u()Lu2/m;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, Lb5/c;->p()Lf1/u;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v8}, Lb5/c;->v()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v0, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Li1/b;

    .line 136
    .line 137
    iget-object v10, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v10, Lfg/l;

    .line 140
    .line 141
    iget-object v11, v3, Lh1/b;->h:Lb5/c;

    .line 142
    .line 143
    invoke-virtual {v11}, Lb5/c;->s()Lu2/c;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    iget-object v12, v3, Lh1/b;->h:Lb5/c;

    .line 148
    .line 149
    invoke-virtual {v12}, Lb5/c;->u()Lu2/m;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    iget-object v13, v3, Lh1/b;->h:Lb5/c;

    .line 154
    .line 155
    invoke-virtual {v13}, Lb5/c;->p()Lf1/u;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    iget-object v14, v3, Lh1/b;->h:Lb5/c;

    .line 160
    .line 161
    invoke-virtual {v14}, Lb5/c;->v()J

    .line 162
    .line 163
    .line 164
    move-result-wide v14

    .line 165
    iget-object v1, v3, Lh1/b;->h:Lb5/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 166
    .line 167
    move-object/from16 p1, v4

    .line 168
    .line 169
    :try_start_1
    iget-object v4, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v4, Li1/b;

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Lb5/c;->R(Lu2/c;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v6}, Lb5/c;->S(Lu2/m;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v7}, Lb5/c;->P(Lf1/u;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v8, v9}, Lb5/c;->U(J)V

    .line 183
    .line 184
    .line 185
    iput-object v0, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 186
    .line 187
    invoke-interface {v7}, Lf1/u;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    :try_start_2
    invoke-interface {v10, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    .line 192
    .line 193
    :try_start_3
    invoke-interface {v7}, Lf1/u;->p()V

    .line 194
    .line 195
    .line 196
    iget-object v0, v3, Lh1/b;->h:Lb5/c;

    .line 197
    .line 198
    invoke-virtual {v0, v11}, Lb5/c;->R(Lu2/c;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v12}, Lb5/c;->S(Lu2/m;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v13}, Lb5/c;->P(Lf1/u;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v14, v15}, Lb5/c;->U(J)V

    .line 208
    .line 209
    .line 210
    iput-object v4, v0, Lb5/c;->b:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 211
    .line 212
    move-object/from16 v1, p1

    .line 213
    .line 214
    iput-object v1, v2, Lx1/h0;->h:Lx1/m;

    .line 215
    .line 216
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 217
    .line 218
    return-object v0

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    move-object/from16 v1, p1

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :catchall_1
    move-exception v0

    .line 224
    move-object/from16 v1, p1

    .line 225
    .line 226
    :try_start_4
    invoke-interface {v7}, Lf1/u;->p()V

    .line 227
    .line 228
    .line 229
    iget-object v3, v3, Lh1/b;->h:Lb5/c;

    .line 230
    .line 231
    invoke-virtual {v3, v11}, Lb5/c;->R(Lu2/c;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v12}, Lb5/c;->S(Lu2/m;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v13}, Lb5/c;->P(Lf1/u;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v14, v15}, Lb5/c;->U(J)V

    .line 241
    .line 242
    .line 243
    iput-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 244
    .line 245
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 246
    :catchall_2
    move-exception v0

    .line 247
    goto :goto_1

    .line 248
    :catchall_3
    move-exception v0

    .line 249
    move-object v1, v4

    .line 250
    :goto_1
    iput-object v1, v2, Lx1/h0;->h:Lx1/m;

    .line 251
    .line 252
    throw v0

    .line 253
    :pswitch_1
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, Lh/f0;

    .line 256
    .line 257
    move-object/from16 v1, p0

    .line 258
    .line 259
    iget-object v2, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v2, Lh/s0;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    const/4 v3, 0x0

    .line 268
    if-eqz v0, :cond_5

    .line 269
    .line 270
    const/4 v4, 0x1

    .line 271
    if-eq v0, v4, :cond_4

    .line 272
    .line 273
    const/4 v4, 0x2

    .line 274
    if-ne v0, v4, :cond_3

    .line 275
    .line 276
    iget-object v0, v2, Lh/s0;->a:Lh/h1;

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_3
    invoke-static {}, Lokio/a;->k()V

    .line 280
    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    goto :goto_4

    .line 284
    :cond_4
    iget-object v0, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 285
    .line 286
    move-object v3, v0

    .line 287
    check-cast v3, Lf1/u0;

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_5
    iget-object v0, v2, Lh/s0;->a:Lh/h1;

    .line 291
    .line 292
    :goto_2
    if-eqz v3, :cond_6

    .line 293
    .line 294
    iget-wide v2, v3, Lf1/u0;->a:J

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_6
    sget-wide v2, Lf1/u0;->b:J

    .line 298
    .line 299
    :goto_3
    new-instance v0, Lf1/u0;

    .line 300
    .line 301
    invoke-direct {v0, v2, v3}, Lf1/u0;-><init>(J)V

    .line 302
    .line 303
    .line 304
    :goto_4
    return-object v0

    .line 305
    :pswitch_2
    move-object/from16 v0, p1

    .line 306
    .line 307
    check-cast v0, Lf1/d0;

    .line 308
    .line 309
    iget-object v2, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v2, Li0/l2;

    .line 312
    .line 313
    iget-object v3, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, Li0/l2;

    .line 316
    .line 317
    const/high16 v4, 0x3f800000    # 1.0f

    .line 318
    .line 319
    if-eqz v3, :cond_7

    .line 320
    .line 321
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    check-cast v3, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    goto :goto_5

    .line 332
    :cond_7
    move v3, v4

    .line 333
    :goto_5
    invoke-interface {v0, v3}, Lf1/d0;->n(F)V

    .line 334
    .line 335
    .line 336
    if-eqz v2, :cond_8

    .line 337
    .line 338
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    check-cast v3, Ljava/lang/Number;

    .line 343
    .line 344
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    goto :goto_6

    .line 349
    :cond_8
    move v3, v4

    .line 350
    :goto_6
    invoke-interface {v0, v3}, Lf1/d0;->q(F)V

    .line 351
    .line 352
    .line 353
    if-eqz v2, :cond_9

    .line 354
    .line 355
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    check-cast v2, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    :cond_9
    invoke-interface {v0, v4}, Lf1/d0;->i(F)V

    .line 366
    .line 367
    .line 368
    iget-object v2, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Li0/l2;

    .line 371
    .line 372
    if-eqz v2, :cond_a

    .line 373
    .line 374
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Lf1/u0;

    .line 379
    .line 380
    iget-wide v2, v2, Lf1/u0;->a:J

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_a
    sget-wide v2, Lf1/u0;->b:J

    .line 384
    .line 385
    :goto_7
    invoke-interface {v0, v2, v3}, Lf1/d0;->H0(J)V

    .line 386
    .line 387
    .line 388
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_3
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, Li0/a0;

    .line 394
    .line 395
    iget-object v0, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lw0/p;

    .line 398
    .line 399
    iget-object v2, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v2, Lh/t;

    .line 402
    .line 403
    new-instance v3, Lh/f;

    .line 404
    .line 405
    const/4 v4, 0x0

    .line 406
    iget-object v5, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 407
    .line 408
    invoke-direct {v3, v0, v5, v2, v4}, Lh/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 409
    .line 410
    .line 411
    return-object v3

    .line 412
    :pswitch_4
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Ld1/b0;

    .line 415
    .line 416
    iget-object v2, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v2, Ld1/b0;

    .line 419
    .line 420
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-eqz v2, :cond_b

    .line 425
    .line 426
    const/4 v0, 0x0

    .line 427
    goto :goto_8

    .line 428
    :cond_b
    iget-object v2, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v2, Ld1/p;

    .line 431
    .line 432
    iget-object v2, v2, Ld1/p;->c:Ld1/b0;

    .line 433
    .line 434
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-nez v2, :cond_c

    .line 439
    .line 440
    iget-object v2, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v2, Lgg/m;

    .line 443
    .line 444
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Ljava/lang/Boolean;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    :goto_8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    goto :goto_9

    .line 459
    :cond_c
    const-string v0, "Focus search landed at the root."

    .line 460
    .line 461
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    :goto_9
    return-object v0

    .line 466
    :pswitch_5
    move-object/from16 v0, p1

    .line 467
    .line 468
    check-cast v0, Lx1/e2;

    .line 469
    .line 470
    move-object v2, v0

    .line 471
    check-cast v2, Lb1/h;

    .line 472
    .line 473
    iget-object v3, v1, Lb1/g;->i:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v3, Lb1/h;

    .line 476
    .line 477
    invoke-static {v3}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    check-cast v3, Ly1/t;

    .line 482
    .line 483
    invoke-virtual {v3}, Ly1/t;->getDragAndDropManager()Lb1/c;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lb1/b;

    .line 488
    .line 489
    iget-object v3, v3, Lb1/b;->b:Lf/f;

    .line 490
    .line 491
    invoke-virtual {v3, v2}, Lf/f;->contains(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-eqz v3, :cond_d

    .line 496
    .line 497
    iget-object v3, v1, Lb1/g;->j:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v3, Landroidx/lifecycle/x;

    .line 500
    .line 501
    invoke-static {v3}, Lx6/d;->C(Landroidx/lifecycle/x;)J

    .line 502
    .line 503
    .line 504
    move-result-wide v3

    .line 505
    invoke-static {v2, v3, v4}, Lr9/e0;->h(Lb1/h;J)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_d

    .line 510
    .line 511
    iget-object v2, v1, Lb1/g;->h:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v2, Lgg/u;

    .line 514
    .line 515
    iput-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 516
    .line 517
    sget-object v0, Lx1/d2;->i:Lx1/d2;

    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_d
    sget-object v0, Lx1/d2;->g:Lx1/d2;

    .line 521
    .line 522
    :goto_a
    return-object v0

    .line 523
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
