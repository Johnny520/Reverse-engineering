.class public final synthetic Lk6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lk6;->d:I

    iput-object p2, p0, Lk6;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpf1;J)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lk6;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk6;->d:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lo81;

    .line 14
    .line 15
    iget-object v1, v0, Lo81;->Q:Lsw;

    .line 16
    .line 17
    iget-boolean v0, v0, Lo81;->P:Z

    .line 18
    .line 19
    xor-int/2addr v0, v3

    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object v0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lr71;

    .line 33
    .line 34
    iput-object v5, v0, Lr71;->B:Lq71;

    .line 35
    .line 36
    invoke-static {v0}, Lz60;->D(Lvz0;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lv50;->m(Lr50;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkl;->r(Ltq;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, Le31;

    .line 52
    .line 53
    :goto_0
    iget-object v5, v1, Le31;->g:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v5

    .line 56
    :try_start_0
    iget-boolean v0, v1, Le31;->c:Z

    .line 57
    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    iput-boolean v3, v1, Le31;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    .line 62
    :try_start_1
    iget-object v0, v1, Le31;->f:Lsh0;

    .line 63
    .line 64
    iget-object v6, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v0, v0, Lsh0;->f:I

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    :goto_1
    if-ge v7, v0, :cond_4

    .line 70
    .line 71
    aget-object v8, v6, v7

    .line 72
    .line 73
    check-cast v8, Ld31;

    .line 74
    .line 75
    iget-object v9, v8, Ld31;->g:Lkh0;

    .line 76
    .line 77
    iget-object v8, v8, Ld31;->a:Lsw;

    .line 78
    .line 79
    iget-object v10, v9, Lkh0;->b:[Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v11, v9, Lkh0;->a:[J

    .line 82
    .line 83
    array-length v12, v11

    .line 84
    sub-int/2addr v12, v2

    .line 85
    if-ltz v12, :cond_3

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    :goto_2
    aget-wide v14, v11, v13

    .line 89
    .line 90
    not-long v2, v14

    .line 91
    const/16 v16, 0x7

    .line 92
    .line 93
    shl-long v2, v2, v16

    .line 94
    .line 95
    and-long/2addr v2, v14

    .line 96
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long v2, v2, v16

    .line 102
    .line 103
    cmp-long v2, v2, v16

    .line 104
    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    sub-int v2, v13, v12

    .line 108
    .line 109
    not-int v2, v2

    .line 110
    ushr-int/lit8 v2, v2, 0x1f

    .line 111
    .line 112
    const/16 v3, 0x8

    .line 113
    .line 114
    rsub-int/lit8 v2, v2, 0x8

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    :goto_3
    if-ge v4, v2, :cond_1

    .line 118
    .line 119
    const-wide/16 v17, 0xff

    .line 120
    .line 121
    and-long v17, v14, v17

    .line 122
    .line 123
    const-wide/16 v19, 0x80

    .line 124
    .line 125
    cmp-long v17, v17, v19

    .line 126
    .line 127
    if-gez v17, :cond_0

    .line 128
    .line 129
    shl-int/lit8 v17, v13, 0x3

    .line 130
    .line 131
    add-int v17, v17, v4

    .line 132
    .line 133
    move/from16 p0, v3

    .line 134
    .line 135
    aget-object v3, v10, v17

    .line 136
    .line 137
    invoke-interface {v8, v3}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_0
    move/from16 p0, v3

    .line 142
    .line 143
    :goto_4
    shr-long v14, v14, p0

    .line 144
    .line 145
    add-int/lit8 v4, v4, 0x1

    .line 146
    .line 147
    move/from16 v3, p0

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_1
    if-ne v2, v3, :cond_3

    .line 151
    .line 152
    :cond_2
    if-eq v13, v12, :cond_3

    .line 153
    .line 154
    add-int/lit8 v13, v13, 0x1

    .line 155
    .line 156
    const/4 v2, 0x2

    .line 157
    const/4 v3, 0x1

    .line 158
    goto :goto_2

    .line 159
    :cond_3
    invoke-virtual {v9}, Lkh0;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    .line 161
    .line 162
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    const/4 v2, 0x2

    .line 165
    const/4 v3, 0x1

    .line 166
    goto :goto_1

    .line 167
    :goto_5
    const/4 v2, 0x0

    .line 168
    goto :goto_6

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    goto :goto_5

    .line 171
    :cond_4
    const/4 v2, 0x0

    .line 172
    :try_start_2
    iput-boolean v2, v1, Le31;->c:Z

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :catchall_1
    move-exception v0

    .line 176
    goto :goto_8

    .line 177
    :goto_6
    iput-boolean v2, v1, Le31;->c:Z

    .line 178
    .line 179
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 180
    :cond_5
    :goto_7
    monitor-exit v5

    .line 181
    invoke-virtual {v1}, Le31;->a()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_6

    .line 186
    .line 187
    sget-object v0, Lna1;->a:Lna1;

    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_6
    const/4 v2, 0x2

    .line 191
    const/4 v3, 0x1

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :goto_8
    monitor-exit v5

    .line 195
    throw v0

    .line 196
    :pswitch_2
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lu01;

    .line 199
    .line 200
    iget-object v0, v0, Lu01;->e:Lgp0;

    .line 201
    .line 202
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lq11;

    .line 207
    .line 208
    iget-wide v1, v1, Lq11;->a:J

    .line 209
    .line 210
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    cmp-long v1, v1, v3

    .line 216
    .line 217
    if-nez v1, :cond_7

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_7
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lq11;

    .line 225
    .line 226
    iget-wide v1, v1, Lq11;->a:J

    .line 227
    .line 228
    invoke-static {v1, v2}, Lq11;->c(J)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_8

    .line 233
    .line 234
    :goto_9
    return-object v5

    .line 235
    :cond_8
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Lq11;

    .line 240
    .line 241
    iget-wide v0, v0, Lq11;->a:J

    .line 242
    .line 243
    throw v5

    .line 244
    :pswitch_3
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Landroid/view/ViewParent;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_4
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lry0;

    .line 252
    .line 253
    sget-object v1, Lbn0;->a:Lej;

    .line 254
    .line 255
    invoke-static {v0, v1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Lk5;

    .line 260
    .line 261
    iput-object v1, v0, Lry0;->D:Lk5;

    .line 262
    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    new-instance v6, Lj5;

    .line 266
    .line 267
    iget-object v7, v1, Lk5;->a:Landroid/content/Context;

    .line 268
    .line 269
    iget-object v8, v1, Lk5;->b:Lym;

    .line 270
    .line 271
    iget-wide v9, v1, Lk5;->c:J

    .line 272
    .line 273
    iget-object v11, v1, Lk5;->d:Ljn0;

    .line 274
    .line 275
    invoke-direct/range {v6 .. v11}, Lj5;-><init>(Landroid/content/Context;Lym;JLjn0;)V

    .line 276
    .line 277
    .line 278
    move-object v5, v6

    .line 279
    :cond_9
    iput-object v5, v0, Lry0;->E:Lj5;

    .line 280
    .line 281
    sget-object v0, Lna1;->a:Lna1;

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_5
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Lnx0;

    .line 287
    .line 288
    invoke-interface {v0}, Lx90;->getLifecycle()Ls90;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    new-instance v2, Lrt0;

    .line 293
    .line 294
    const/4 v3, 0x0

    .line 295
    invoke-direct {v2, v3, v0}, Lrt0;-><init>(ILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v2}, Ls90;->a(Lw90;)V

    .line 299
    .line 300
    .line 301
    sget-object v0, Lna1;->a:Lna1;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_6
    const/4 v3, 0x0

    .line 305
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Lcx0;

    .line 308
    .line 309
    iget-object v0, v0, Lcx0;->f:Llx0;

    .line 310
    .line 311
    if-eqz v0, :cond_b

    .line 312
    .line 313
    new-array v1, v3, [Luo0;

    .line 314
    .line 315
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, [Luo0;

    .line 320
    .line 321
    invoke-static {v1}, Lkl;->h([Luo0;)Landroid/os/Bundle;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v0, v1}, Llx0;->b(Landroid/os/Bundle;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_a

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_a
    move-object v5, v1

    .line 336
    :cond_b
    :goto_a
    return-object v5

    .line 337
    :pswitch_7
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Lvw0;

    .line 340
    .line 341
    iget-object v1, v0, Lvw0;->d:Lqx0;

    .line 342
    .line 343
    iget-object v2, v0, Lvw0;->g:Ljava/lang/Object;

    .line 344
    .line 345
    if-eqz v2, :cond_c

    .line 346
    .line 347
    invoke-interface {v1, v0, v2}, Lqx0;->i(Lvw0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    goto :goto_b

    .line 352
    :cond_c
    const-string v0, "Value should be initialized"

    .line 353
    .line 354
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_b
    return-object v5

    .line 358
    :pswitch_8
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lbl0;

    .line 361
    .line 362
    new-instance v1, Lzk0;

    .line 363
    .line 364
    invoke-direct {v1, v0}, Lzk0;-><init>(Lbl0;)V

    .line 365
    .line 366
    .line 367
    return-object v1

    .line 368
    :pswitch_9
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Lmd;

    .line 371
    .line 372
    invoke-interface {v0}, Lmd;->q()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    instance-of v1, v0, Lvd;

    .line 377
    .line 378
    if-nez v1, :cond_d

    .line 379
    .line 380
    move-object v5, v0

    .line 381
    :cond_d
    check-cast v5, Lfg0;

    .line 382
    .line 383
    return-object v5

    .line 384
    :pswitch_a
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lc90;

    .line 387
    .line 388
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    iget v0, v0, Lv80;->n:I

    .line 393
    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    return-object v0

    .line 399
    :pswitch_b
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v0, Ljava/util/List;

    .line 402
    .line 403
    const/4 v1, 0x2

    .line 404
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    check-cast v0, Ljava/lang/Integer;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_c
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v0, Ldg;

    .line 417
    .line 418
    iget-object v0, v0, Ldg;->O:Lhw;

    .line 419
    .line 420
    if-eqz v0, :cond_e

    .line 421
    .line 422
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    :cond_e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_d
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lpf1;

    .line 431
    .line 432
    check-cast v0, Lqb;

    .line 433
    .line 434
    throw v5

    .line 435
    :pswitch_e
    iget-object v0, v0, Lk6;->e:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Ll6;

    .line 438
    .line 439
    invoke-static {v0}, Lkl;->r(Ltq;)V

    .line 440
    .line 441
    .line 442
    sget-object v0, Lna1;->a:Lna1;

    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
