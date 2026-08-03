.class public final synthetic Lc9/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc9/c0;Ljava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    iput v0, p0, Lc9/i;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9/i;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lc9/i;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lc9/i;->g:I

    iput-object p1, p0, Lc9/i;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc9/i;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lc9/i;->g:I

    .line 6
    .line 7
    const-wide/16 v3, 0x1f4

    .line 8
    .line 9
    const/4 v5, 0x7

    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x2

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x1

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ln/k;

    .line 22
    .line 23
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ln/j;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ln/k;->b(Ln/j;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ls1/t;

    .line 38
    .line 39
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lgg/q;

    .line 42
    .line 43
    check-cast v0, Lk/k0;

    .line 44
    .line 45
    invoke-interface {v0, v2}, Lk/k0;->X(Ls1/t;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-boolean v2, v3, Lgg/q;->g:Z

    .line 50
    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    :cond_0
    move v10, v11

    .line 56
    :cond_1
    iput-boolean v10, v3, Lgg/q;->g:Z

    .line 57
    .line 58
    xor-int/lit8 v0, v10, 0x1

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_1
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lp1/b;

    .line 68
    .line 69
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Lgg/q;

    .line 72
    .line 73
    check-cast v0, Lk/k0;

    .line 74
    .line 75
    invoke-interface {v0, v2}, Lk/k0;->B0(Lp1/b;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-boolean v2, v3, Lgg/q;->g:Z

    .line 80
    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    :cond_2
    move v10, v11

    .line 86
    :cond_3
    iput-boolean v10, v3, Lgg/q;->g:Z

    .line 87
    .line 88
    xor-int/lit8 v0, v10, 0x1

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :pswitch_2
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Lf1/j0;

    .line 98
    .line 99
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, v3

    .line 102
    check-cast v6, Lf1/s;

    .line 103
    .line 104
    move-object v4, v0

    .line 105
    check-cast v4, Lx1/h0;

    .line 106
    .line 107
    invoke-virtual {v4}, Lx1/h0;->e()V

    .line 108
    .line 109
    .line 110
    iget-object v5, v2, Lf1/j0;->f:Lf1/j;

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/16 v9, 0x3c

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-static/range {v4 .. v9}, Lh1/d;->s0(Lh1/d;Lf1/j;Lf1/s;FLh1/g;I)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_3
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v4, v2

    .line 125
    check-cast v4, Lf1/j;

    .line 126
    .line 127
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v5, v2

    .line 130
    check-cast v5, Lf1/s;

    .line 131
    .line 132
    move-object v3, v0

    .line 133
    check-cast v3, Lx1/h0;

    .line 134
    .line 135
    invoke-virtual {v3}, Lx1/h0;->e()V

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/16 v8, 0x3c

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    invoke-static/range {v3 .. v8}, Lh1/d;->s0(Lh1/d;Lf1/j;Lf1/s;FLh1/g;I)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_4
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Ln/k;

    .line 151
    .line 152
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Ln/l;

    .line 155
    .line 156
    check-cast v0, Ljava/lang/Throwable;

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ln/k;->b(Ln/j;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_5
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, Landroid/content/Context;

    .line 167
    .line 168
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, Ljava/lang/ClassLoader;

    .line 171
    .line 172
    check-cast v0, Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v4, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 178
    .line 179
    const-string v4, "Hchat_fav_voice"

    .line 180
    .line 181
    const-string v5, "silk"

    .line 182
    .line 183
    invoke-static {v2, v3, v0, v4, v5}, Lj8/d;->j(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_6
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, Li0/y1;

    .line 191
    .line 192
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, Ljava/lang/Throwable;

    .line 195
    .line 196
    check-cast v0, Ljava/lang/Throwable;

    .line 197
    .line 198
    iget-object v4, v2, Li0/y1;->c:Ljava/lang/Object;

    .line 199
    .line 200
    monitor-enter v4

    .line 201
    if-eqz v3, :cond_5

    .line 202
    .line 203
    if-eqz v0, :cond_6

    .line 204
    .line 205
    :try_start_0
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 206
    .line 207
    if-nez v5, :cond_4

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_4
    move-object v0, v8

    .line 211
    :goto_0
    if-eqz v0, :cond_6

    .line 212
    .line 213
    invoke-static {v3, v0}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    goto :goto_2

    .line 219
    :cond_5
    move-object v3, v8

    .line 220
    :cond_6
    :goto_1
    iput-object v3, v2, Li0/y1;->e:Ljava/lang/Throwable;

    .line 221
    .line 222
    iget-object v0, v2, Li0/y1;->u:Ltg/b0;

    .line 223
    .line 224
    sget-object v2, Li0/u1;->g:Li0/u1;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v8, v2}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    .line 231
    .line 232
    monitor-exit v4

    .line 233
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 234
    .line 235
    return-object v0

    .line 236
    :goto_2
    monitor-exit v4

    .line 237
    throw v0

    .line 238
    :pswitch_7
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Li0/q;

    .line 241
    .line 242
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v3, Lf/l0;

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Li0/q;->z(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    if-eqz v3, :cond_7

    .line 250
    .line 251
    invoke-virtual {v3, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    :cond_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_8
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, Ljava/util/Set;

    .line 260
    .line 261
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v3, Li0/z0;

    .line 264
    .line 265
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_c

    .line 270
    .line 271
    iget-object v2, v3, Li0/z0;->h:Lf/k0;

    .line 272
    .line 273
    iget-object v3, v3, Li0/z0;->j:Lf/l0;

    .line 274
    .line 275
    invoke-virtual {v2, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-eqz v0, :cond_c

    .line 280
    .line 281
    instance-of v2, v0, Lf/l0;

    .line 282
    .line 283
    if-eqz v2, :cond_b

    .line 284
    .line 285
    check-cast v0, Lf/l0;

    .line 286
    .line 287
    iget-object v2, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v0, v0, Lf/l0;->a:[J

    .line 290
    .line 291
    array-length v4, v0

    .line 292
    sub-int/2addr v4, v9

    .line 293
    if-ltz v4, :cond_c

    .line 294
    .line 295
    move v6, v10

    .line 296
    :goto_3
    aget-wide v7, v0, v6

    .line 297
    .line 298
    not-long v11, v7

    .line 299
    shl-long/2addr v11, v5

    .line 300
    and-long/2addr v11, v7

    .line 301
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    and-long/2addr v11, v13

    .line 307
    cmp-long v9, v11, v13

    .line 308
    .line 309
    if-eqz v9, :cond_a

    .line 310
    .line 311
    sub-int v9, v6, v4

    .line 312
    .line 313
    not-int v9, v9

    .line 314
    ushr-int/lit8 v9, v9, 0x1f

    .line 315
    .line 316
    const/16 v11, 0x8

    .line 317
    .line 318
    rsub-int/lit8 v9, v9, 0x8

    .line 319
    .line 320
    move v12, v10

    .line 321
    :goto_4
    if-ge v12, v9, :cond_9

    .line 322
    .line 323
    const-wide/16 v13, 0xff

    .line 324
    .line 325
    and-long/2addr v13, v7

    .line 326
    const-wide/16 v15, 0x80

    .line 327
    .line 328
    cmp-long v13, v13, v15

    .line 329
    .line 330
    if-gez v13, :cond_8

    .line 331
    .line 332
    shl-int/lit8 v13, v6, 0x3

    .line 333
    .line 334
    add-int/2addr v13, v12

    .line 335
    aget-object v13, v2, v13

    .line 336
    .line 337
    check-cast v13, Lsg/p;

    .line 338
    .line 339
    invoke-virtual {v3, v13}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_8
    shr-long/2addr v7, v11

    .line 343
    add-int/lit8 v12, v12, 0x1

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_9
    if-ne v9, v11, :cond_c

    .line 347
    .line 348
    :cond_a
    if-eq v6, v4, :cond_c

    .line 349
    .line 350
    add-int/lit8 v6, v6, 0x1

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_b
    check-cast v0, Lsg/p;

    .line 354
    .line 355
    invoke-virtual {v3, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    :cond_c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 359
    .line 360
    return-object v0

    .line 361
    :pswitch_9
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v2, Li0/z0;

    .line 364
    .line 365
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v3, Lsg/p;

    .line 368
    .line 369
    iget-object v2, v2, Li0/z0;->i:Ljava/util/ArrayList;

    .line 370
    .line 371
    new-instance v4, Li0/w0;

    .line 372
    .line 373
    invoke-direct {v4, v0, v3}, Li0/w0;-><init>(Ljava/lang/Object;Lsg/p;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_a
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, Li/k1;

    .line 385
    .line 386
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v3, Li/g1;

    .line 389
    .line 390
    check-cast v0, Li0/a0;

    .line 391
    .line 392
    iget-object v0, v2, Li/k1;->i:Lw0/p;

    .line 393
    .line 394
    invoke-virtual {v0, v3}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    new-instance v0, Lci/w;

    .line 398
    .line 399
    const/4 v4, 0x4

    .line 400
    invoke-direct {v0, v2, v4, v3}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v0

    .line 404
    :pswitch_b
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v2, Li/k1;

    .line 407
    .line 408
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v3, Li/d1;

    .line 411
    .line 412
    check-cast v0, Li0/a0;

    .line 413
    .line 414
    new-instance v0, Lci/w;

    .line 415
    .line 416
    invoke-direct {v0, v2, v7, v3}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    return-object v0

    .line 420
    :pswitch_c
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v2, Li/k1;

    .line 423
    .line 424
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v3, Li/k1;

    .line 427
    .line 428
    check-cast v0, Li0/a0;

    .line 429
    .line 430
    iget-object v0, v2, Li/k1;->j:Lw0/p;

    .line 431
    .line 432
    invoke-virtual {v0, v3}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    new-instance v0, Lci/w;

    .line 436
    .line 437
    invoke-direct {v0, v2, v9, v3}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_d
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, Lqg/t;

    .line 444
    .line 445
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v3, Li/k1;

    .line 448
    .line 449
    check-cast v0, Li0/a0;

    .line 450
    .line 451
    new-instance v0, Li/i1;

    .line 452
    .line 453
    invoke-direct {v0, v3, v8}, Li/i1;-><init>(Li/k1;Lwf/c;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v2, v8, v0, v11}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 457
    .line 458
    .line 459
    new-instance v0, Li/j1;

    .line 460
    .line 461
    invoke-direct {v0, v10}, Li/j1;-><init>(I)V

    .line 462
    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_e
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v2, Li/g0;

    .line 468
    .line 469
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v3, Li/d0;

    .line 472
    .line 473
    check-cast v0, Li0/a0;

    .line 474
    .line 475
    iget-object v0, v2, Li/g0;->a:Lj0/b;

    .line 476
    .line 477
    invoke-virtual {v0, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    iget-object v0, v2, Li/g0;->b:Li0/j1;

    .line 481
    .line 482
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 483
    .line 484
    invoke-virtual {v0, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    new-instance v0, Lci/w;

    .line 488
    .line 489
    invoke-direct {v0, v2, v11, v3}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v0

    .line 493
    :pswitch_f
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v2, Lc9/c0;

    .line 496
    .line 497
    iget-object v3, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v3, Ljava/util/List;

    .line 500
    .line 501
    check-cast v0, Ljava/util/Set;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    check-cast v0, Ljava/lang/Iterable;

    .line 507
    .line 508
    new-instance v4, Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    :cond_d
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    if-eqz v5, :cond_f

    .line 522
    .line 523
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    check-cast v5, Ljava/lang/Number;

    .line 528
    .line 529
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    invoke-static {v5, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    check-cast v5, Lsf/e;

    .line 538
    .line 539
    if-eqz v5, :cond_e

    .line 540
    .line 541
    iget-object v5, v5, Lsf/e;->g:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v5, Ljava/lang/Integer;

    .line 544
    .line 545
    goto :goto_6

    .line 546
    :cond_e
    move-object v5, v8

    .line 547
    :goto_6
    if-eqz v5, :cond_d

    .line 548
    .line 549
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    goto :goto_5

    .line 553
    :cond_f
    invoke-static {v4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    move-object v3, v0

    .line 558
    check-cast v3, Ljava/util/Collection;

    .line 559
    .line 560
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-nez v3, :cond_10

    .line 565
    .line 566
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    invoke-virtual {v2, v3, v0}, Lc9/c0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    :cond_10
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_10
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v2, Lfg/a;

    .line 579
    .line 580
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v3, Lfg/a;

    .line 583
    .line 584
    check-cast v0, Lz/g;

    .line 585
    .line 586
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    if-eqz v3, :cond_11

    .line 590
    .line 591
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    check-cast v2, Ljava/lang/Boolean;

    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 598
    .line 599
    .line 600
    move-result v11

    .line 601
    :cond_11
    if-eqz v11, :cond_12

    .line 602
    .line 603
    invoke-interface {v0}, Lz/g;->close()V

    .line 604
    .line 605
    .line 606
    :cond_12
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 607
    .line 608
    return-object v0

    .line 609
    :pswitch_11
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v2, Ld9/m;

    .line 612
    .line 613
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v3, Landroid/app/Activity;

    .line 616
    .line 617
    check-cast v0, Ljava/lang/Boolean;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_13

    .line 624
    .line 625
    const-string v0, "\u81ea\u5b9a\u4e49\u5934\u50cf\u5df2\u4fdd\u5b58"

    .line 626
    .line 627
    goto :goto_7

    .line 628
    :cond_13
    const-string v0, "\u5934\u50cf\u8bbe\u7f6e\u5931\u8d25"

    .line 629
    .line 630
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    if-eqz v3, :cond_14

    .line 634
    .line 635
    new-instance v2, Landroid/os/Handler;

    .line 636
    .line 637
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 642
    .line 643
    .line 644
    new-instance v4, Lc9/t;

    .line 645
    .line 646
    invoke-direct {v4, v3, v0, v7}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 650
    .line 651
    .line 652
    :cond_14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 653
    .line 654
    return-object v0

    .line 655
    :pswitch_12
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 656
    .line 657
    move-object v7, v2

    .line 658
    check-cast v7, Lv1/b1;

    .line 659
    .line 660
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v2, Lci/n0;

    .line 663
    .line 664
    move-object v6, v0

    .line 665
    check-cast v6, Lv1/a1;

    .line 666
    .line 667
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    new-instance v10, Lb0/d0;

    .line 671
    .line 672
    invoke-direct {v10, v2, v5}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 673
    .line 674
    .line 675
    const/4 v11, 0x4

    .line 676
    const/4 v8, 0x0

    .line 677
    const/4 v9, 0x0

    .line 678
    invoke-static/range {v6 .. v11}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 679
    .line 680
    .line 681
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_13
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v2, Lgg/t;

    .line 687
    .line 688
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v3, Lci/e0;

    .line 691
    .line 692
    iget-object v4, v3, Lci/e0;->z:Lci/p0;

    .line 693
    .line 694
    check-cast v0, Ljava/lang/Long;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 697
    .line 698
    .line 699
    move-result-wide v5

    .line 700
    iget-wide v7, v2, Lgg/t;->g:J

    .line 701
    .line 702
    const-wide/16 v11, -0x1

    .line 703
    .line 704
    cmp-long v0, v7, v11

    .line 705
    .line 706
    if-nez v0, :cond_15

    .line 707
    .line 708
    iput-wide v5, v2, Lgg/t;->g:J

    .line 709
    .line 710
    goto :goto_8

    .line 711
    :cond_15
    sub-long v7, v5, v7

    .line 712
    .line 713
    long-to-float v0, v7

    .line 714
    const v7, 0x4e6e6b28    # 1.0E9f

    .line 715
    .line 716
    .line 717
    div-float/2addr v0, v7

    .line 718
    iput-wide v5, v2, Lgg/t;->g:J

    .line 719
    .line 720
    invoke-virtual {v4, v0}, Lci/p0;->b(F)Z

    .line 721
    .line 722
    .line 723
    move-result v10

    .line 724
    iget-wide v4, v4, Lci/p0;->c:D

    .line 725
    .line 726
    double-to-float v0, v4

    .line 727
    invoke-virtual {v3, v0}, Lci/e0;->q1(F)V

    .line 728
    .line 729
    .line 730
    iget v0, v3, Lci/e0;->C:F

    .line 731
    .line 732
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    iget v2, v3, Lci/e0;->C:F

    .line 737
    .line 738
    iget v4, v3, Lci/e0;->E:F

    .line 739
    .line 740
    invoke-static {v2, v4}, Lci/k0;->b(FF)F

    .line 741
    .line 742
    .line 743
    move-result v2

    .line 744
    mul-float/2addr v2, v0

    .line 745
    iput v2, v3, Lci/e0;->D:F

    .line 746
    .line 747
    :goto_8
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    return-object v0

    .line 752
    :pswitch_14
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 753
    .line 754
    move-object v8, v2

    .line 755
    check-cast v8, Lv1/b1;

    .line 756
    .line 757
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v2, Lci/e0;

    .line 760
    .line 761
    move-object v7, v0

    .line 762
    check-cast v7, Lv1/a1;

    .line 763
    .line 764
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    new-instance v11, Lb0/d0;

    .line 768
    .line 769
    invoke-direct {v11, v2, v6}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 770
    .line 771
    .line 772
    const/4 v12, 0x4

    .line 773
    const/4 v9, 0x0

    .line 774
    const/4 v10, 0x0

    .line 775
    invoke-static/range {v7 .. v12}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 776
    .line 777
    .line 778
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_15
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v2, Lw0/p;

    .line 784
    .line 785
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v3, Lw0/p;

    .line 788
    .line 789
    check-cast v0, Li0/a0;

    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    new-instance v0, Lci/w;

    .line 795
    .line 796
    invoke-direct {v0, v2, v10, v3}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    return-object v0

    .line 800
    :pswitch_16
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 801
    .line 802
    move-object v4, v2

    .line 803
    check-cast v4, Lv1/b1;

    .line 804
    .line 805
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v2, Lci/s;

    .line 808
    .line 809
    move-object v3, v0

    .line 810
    check-cast v3, Lv1/a1;

    .line 811
    .line 812
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    new-instance v7, Lci/q;

    .line 816
    .line 817
    invoke-direct {v7, v2, v11}, Lci/q;-><init>(Lci/s;I)V

    .line 818
    .line 819
    .line 820
    const/4 v8, 0x4

    .line 821
    const/4 v5, 0x0

    .line 822
    const/4 v6, 0x0

    .line 823
    invoke-static/range {v3 .. v8}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 824
    .line 825
    .line 826
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 827
    .line 828
    return-object v0

    .line 829
    :pswitch_17
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 830
    .line 831
    move-object v9, v2

    .line 832
    check-cast v9, Luf/c;

    .line 833
    .line 834
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v2, Lfg/l;

    .line 837
    .line 838
    check-cast v0, Ljava/util/Set;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    check-cast v0, Ljava/lang/Iterable;

    .line 844
    .line 845
    new-instance v3, Ldg/n;

    .line 846
    .line 847
    invoke-direct {v3, v0, v6}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 848
    .line 849
    .line 850
    new-instance v7, Lc0/f;

    .line 851
    .line 852
    const-class v0, Ltf/m;

    .line 853
    .line 854
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    move-result-object v10

    .line 858
    const-string v11, "getOrNull"

    .line 859
    .line 860
    const-string v12, "getOrNull(Ljava/util/List;I)Ljava/lang/Object;"

    .line 861
    .line 862
    const/4 v14, 0x0

    .line 863
    const/16 v15, 0xa

    .line 864
    .line 865
    const/4 v8, 0x1

    .line 866
    const/4 v13, 0x1

    .line 867
    invoke-direct/range {v7 .. v15}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 868
    .line 869
    .line 870
    invoke-static {v3, v7}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    new-instance v3, Lb4/b;

    .line 875
    .line 876
    const/16 v4, 0x10

    .line 877
    .line 878
    invoke-direct {v3, v4}, Lb4/b;-><init>(I)V

    .line 879
    .line 880
    .line 881
    new-instance v4, Ldg/j;

    .line 882
    .line 883
    sget-object v5, Lng/q;->n:Lng/q;

    .line 884
    .line 885
    invoke-direct {v4, v0, v3, v5}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 886
    .line 887
    .line 888
    invoke-static {v4}, Lng/m;->S(Lng/j;)Lng/c;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_18
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v2, Lgg/u;

    .line 905
    .line 906
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 909
    .line 910
    check-cast v0, Lc9/a;

    .line 911
    .line 912
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    iget-object v2, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v2, Ljava/lang/Iterable;

    .line 918
    .line 919
    iget-object v4, v0, Lc9/a;->c:Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v2, v4}, Ltf/m;->o1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    if-eqz v2, :cond_16

    .line 926
    .line 927
    iget-object v0, v0, Lc9/a;->a:Ljava/lang/String;

    .line 928
    .line 929
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    if-nez v0, :cond_16

    .line 934
    .line 935
    move v10, v11

    .line 936
    :cond_16
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    return-object v0

    .line 941
    :pswitch_19
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v2, Lfg/a;

    .line 944
    .line 945
    iget-object v3, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v3, Landroid/app/Activity;

    .line 948
    .line 949
    check-cast v0, Lc9/p2;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    iget-object v0, v0, Lc9/p2;->a:Ljava/lang/String;

    .line 955
    .line 956
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 957
    .line 958
    .line 959
    move-result v4

    .line 960
    if-nez v4, :cond_17

    .line 961
    .line 962
    invoke-static {v3, v0}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    :cond_17
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 969
    .line 970
    return-object v0

    .line 971
    :pswitch_1a
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 972
    .line 973
    move-object v10, v2

    .line 974
    check-cast v10, Landroid/app/Activity;

    .line 975
    .line 976
    iget-object v2, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v2, Ljava/util/ArrayList;

    .line 979
    .line 980
    check-cast v0, Ljava/util/List;

    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    invoke-static {v0}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    check-cast v0, Lwb/jv;

    .line 990
    .line 991
    if-eqz v0, :cond_18

    .line 992
    .line 993
    const-string v11, "\u53d1\u9001\u7fa4\u804a\u9080\u8bf7"

    .line 994
    .line 995
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    iget-object v4, v0, Lwb/jv;->b:Ljava/lang/String;

    .line 1000
    .line 1001
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    const-string v7, "\u5c06\u9080\u8bf7\u5f53\u524d\u5206\u7ec4\u4e2d\u7684 "

    .line 1004
    .line 1005
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    .line 1011
    const-string v3, " \u4f4d\u597d\u53cb\u52a0\u5165\u201c"

    .line 1012
    .line 1013
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    .line 1019
    const-string v3, "\u201d\u3002"

    .line 1020
    .line 1021
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v12

    .line 1028
    new-instance v13, Lb0/s;

    .line 1029
    .line 1030
    invoke-direct {v13, v10, v2, v0, v9}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1031
    .line 1032
    .line 1033
    new-instance v14, Lbi/c;

    .line 1034
    .line 1035
    invoke-direct {v14, v6}, Lbi/c;-><init>(I)V

    .line 1036
    .line 1037
    .line 1038
    sget-object v15, Lwb/lv;->j:Lwb/lv;

    .line 1039
    .line 1040
    invoke-static/range {v10 .. v15}, Lwb/y2;->S1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1041
    .line 1042
    .line 1043
    :cond_18
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    :pswitch_1b
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 1047
    .line 1048
    check-cast v2, Ljava/util/ArrayList;

    .line 1049
    .line 1050
    iget-object v5, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v5, Lwb/jv;

    .line 1053
    .line 1054
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1055
    .line 1056
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v6

    .line 1063
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v6

    .line 1070
    const/16 v7, 0x1e

    .line 1071
    .line 1072
    invoke-static {v7, v2}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v7

    .line 1076
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v7

    .line 1080
    move v8, v10

    .line 1081
    :cond_19
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    if-eqz v9, :cond_1c

    .line 1086
    .line 1087
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v9

    .line 1091
    check-cast v9, Ljava/util/List;

    .line 1092
    .line 1093
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v12

    .line 1097
    if-eqz v12, :cond_1a

    .line 1098
    .line 1099
    goto :goto_9

    .line 1100
    :cond_1a
    if-eqz v6, :cond_1b

    .line 1101
    .line 1102
    iget-object v12, v5, Lwb/jv;->a:Ljava/lang/String;

    .line 1103
    .line 1104
    invoke-virtual {v6, v12, v9}, Lg8/d;->m(Ljava/lang/String;Ljava/util/List;)Z

    .line 1105
    .line 1106
    .line 1107
    move-result v12

    .line 1108
    if-ne v12, v11, :cond_1b

    .line 1109
    .line 1110
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1111
    .line 1112
    .line 1113
    move-result v9

    .line 1114
    add-int/2addr v8, v9

    .line 1115
    :cond_1b
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v9

    .line 1119
    if-nez v9, :cond_19

    .line 1120
    .line 1121
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 1122
    .line 1123
    .line 1124
    goto :goto_9

    .line 1125
    :cond_1c
    new-instance v0, Lc9/y;

    .line 1126
    .line 1127
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    const-string v3, "\u9080\u8bf7"

    .line 1132
    .line 1133
    invoke-direct {v0, v3, v8, v2, v10}, Lc9/y;-><init>(Ljava/lang/String;IIZ)V

    .line 1134
    .line 1135
    .line 1136
    return-object v0

    .line 1137
    :pswitch_1c
    iget-object v2, v1, Lc9/i;->h:Ljava/lang/Object;

    .line 1138
    .line 1139
    check-cast v2, Ljava/util/List;

    .line 1140
    .line 1141
    iget-object v5, v1, Lc9/i;->i:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v5, Ljava/lang/String;

    .line 1144
    .line 1145
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1146
    .line 1147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v6

    .line 1154
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v7

    .line 1158
    move v8, v10

    .line 1159
    :cond_1d
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v9

    .line 1163
    if-eqz v9, :cond_20

    .line 1164
    .line 1165
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v9

    .line 1169
    check-cast v9, Ljava/lang/String;

    .line 1170
    .line 1171
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1172
    .line 1173
    .line 1174
    move-result v12

    .line 1175
    if-eqz v12, :cond_1e

    .line 1176
    .line 1177
    goto :goto_a

    .line 1178
    :cond_1e
    if-eqz v6, :cond_1f

    .line 1179
    .line 1180
    invoke-virtual {v6, v9, v5}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v9

    .line 1184
    if-ne v9, v11, :cond_1f

    .line 1185
    .line 1186
    add-int/lit8 v8, v8, 0x1

    .line 1187
    .line 1188
    :cond_1f
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1189
    .line 1190
    .line 1191
    move-result v9

    .line 1192
    if-nez v9, :cond_1d

    .line 1193
    .line 1194
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 1195
    .line 1196
    .line 1197
    goto :goto_a

    .line 1198
    :cond_20
    new-instance v0, Lc9/y;

    .line 1199
    .line 1200
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    const-string v3, "\u53d1\u9001"

    .line 1205
    .line 1206
    invoke-direct {v0, v3, v8, v2, v10}, Lc9/y;-><init>(Ljava/lang/String;IIZ)V

    .line 1207
    .line 1208
    .line 1209
    return-object v0

    .line 1210
    nop

    .line 1211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
