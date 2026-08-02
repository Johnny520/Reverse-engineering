.class public final synthetic Lta;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lta;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lta;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lta;->h:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ll13;

    .line 13
    .line 14
    iput-object v4, v0, Ll13;->F:Lk13;

    .line 15
    .line 16
    invoke-static {v0}, Lqp0;->E(Lon2;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lgf1;->A(Lj61;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lci0;->M(Lmc0;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lfz2;

    .line 31
    .line 32
    iget-boolean v1, v0, Lth1;->u:Z

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-static {v0}, Lpp0;->o(Lt60;)Lqy2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Lqy2;->b:Lqy2;

    .line 42
    .line 43
    :goto_0
    return-object v0

    .line 44
    :pswitch_1
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroid/app/RemoteAction;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/app/RemoteAction;->getActionIntent()Landroid/app/PendingIntent;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v2, 0x22

    .line 55
    .line 56
    if-lt v0, v2, :cond_1

    .line 57
    .line 58
    :try_start_0
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lzr0;->e(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v1, v0}, Lzr0;->n(Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception v0

    .line 75
    const-string v2, "TextClassification"

    .line 76
    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v4, "error sending pendingIntent: "

    .line 80
    .line 81
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, " error: "

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {v1}, Landroid/app/PendingIntent;->send()V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v0, La83;->a:La83;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_2
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v1, v0

    .line 112
    check-cast v1, Lts2;

    .line 113
    .line 114
    :goto_2
    iget-object v4, v1, Lts2;->g:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v4

    .line 117
    :try_start_1
    iget-boolean v0, v1, Lts2;->c:Z

    .line 118
    .line 119
    if-nez v0, :cond_7

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    iput-boolean v0, v1, Lts2;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 123
    .line 124
    :try_start_2
    iget-object v0, v1, Lts2;->f:Lzk1;

    .line 125
    .line 126
    iget-object v5, v0, Lzk1;->h:[Ljava/lang/Object;

    .line 127
    .line 128
    iget v0, v0, Lzk1;->j:I

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    :goto_3
    if-ge v6, v0, :cond_6

    .line 132
    .line 133
    aget-object v7, v5, v6

    .line 134
    .line 135
    check-cast v7, Lss2;

    .line 136
    .line 137
    iget-object v8, v7, Lss2;->g:Lsk1;

    .line 138
    .line 139
    iget-object v7, v7, Lss2;->a:Lin0;

    .line 140
    .line 141
    iget-object v9, v8, Lsk1;->b:[Ljava/lang/Object;

    .line 142
    .line 143
    iget-object v10, v8, Lsk1;->a:[J

    .line 144
    .line 145
    array-length v11, v10

    .line 146
    sub-int/2addr v11, v2

    .line 147
    if-ltz v11, :cond_5

    .line 148
    .line 149
    const/4 v12, 0x0

    .line 150
    :goto_4
    aget-wide v13, v10, v12

    .line 151
    .line 152
    not-long v2, v13

    .line 153
    const/16 v16, 0x7

    .line 154
    .line 155
    shl-long v2, v2, v16

    .line 156
    .line 157
    and-long/2addr v2, v13

    .line 158
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    and-long v2, v2, v16

    .line 164
    .line 165
    cmp-long v2, v2, v16

    .line 166
    .line 167
    if-eqz v2, :cond_4

    .line 168
    .line 169
    sub-int v2, v12, v11

    .line 170
    .line 171
    not-int v2, v2

    .line 172
    ushr-int/lit8 v2, v2, 0x1f

    .line 173
    .line 174
    const/16 v3, 0x8

    .line 175
    .line 176
    rsub-int/lit8 v2, v2, 0x8

    .line 177
    .line 178
    const/4 v15, 0x0

    .line 179
    :goto_5
    if-ge v15, v2, :cond_3

    .line 180
    .line 181
    const-wide/16 v17, 0xff

    .line 182
    .line 183
    and-long v17, v13, v17

    .line 184
    .line 185
    const-wide/16 v19, 0x80

    .line 186
    .line 187
    cmp-long v17, v17, v19

    .line 188
    .line 189
    if-gez v17, :cond_2

    .line 190
    .line 191
    shl-int/lit8 v17, v12, 0x3

    .line 192
    .line 193
    add-int v17, v17, v15

    .line 194
    .line 195
    move/from16 p0, v3

    .line 196
    .line 197
    aget-object v3, v9, v17

    .line 198
    .line 199
    invoke-interface {v7, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_2
    move/from16 p0, v3

    .line 204
    .line 205
    :goto_6
    shr-long v13, v13, p0

    .line 206
    .line 207
    add-int/lit8 v15, v15, 0x1

    .line 208
    .line 209
    move/from16 v3, p0

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_3
    if-ne v2, v3, :cond_5

    .line 213
    .line 214
    :cond_4
    if-eq v12, v11, :cond_5

    .line 215
    .line 216
    add-int/lit8 v12, v12, 0x1

    .line 217
    .line 218
    const/4 v2, 0x2

    .line 219
    goto :goto_4

    .line 220
    :cond_5
    invoke-virtual {v8}, Lsk1;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    .line 222
    .line 223
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    const/4 v2, 0x2

    .line 226
    goto :goto_3

    .line 227
    :goto_7
    const/4 v2, 0x0

    .line 228
    goto :goto_8

    .line 229
    :catchall_0
    move-exception v0

    .line 230
    goto :goto_7

    .line 231
    :cond_6
    const/4 v2, 0x0

    .line 232
    :try_start_3
    iput-boolean v2, v1, Lts2;->c:Z

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    goto :goto_a

    .line 237
    :goto_8
    iput-boolean v2, v1, Lts2;->c:Z

    .line 238
    .line 239
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 240
    :cond_7
    :goto_9
    monitor-exit v4

    .line 241
    invoke-virtual {v1}, Lts2;->b()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_8

    .line 246
    .line 247
    sget-object v0, La83;->a:La83;

    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_8
    const/4 v2, 0x2

    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :goto_a
    monitor-exit v4

    .line 254
    throw v0

    .line 255
    :pswitch_3
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Laq2;

    .line 258
    .line 259
    iget-object v1, v0, Laq2;->j:Lnx1;

    .line 260
    .line 261
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Lgr2;

    .line 266
    .line 267
    iget-wide v2, v2, Lgr2;->a:J

    .line 268
    .line 269
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    cmp-long v2, v2, v5

    .line 275
    .line 276
    if-nez v2, :cond_9

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_9
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    check-cast v2, Lgr2;

    .line 284
    .line 285
    iget-wide v2, v2, Lgr2;->a:J

    .line 286
    .line 287
    invoke-static {v2, v3}, Lgr2;->c(J)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_a

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_a
    iget-object v0, v0, Laq2;->h:Lzp2;

    .line 295
    .line 296
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Lgr2;

    .line 301
    .line 302
    iget-wide v1, v1, Lgr2;->a:J

    .line 303
    .line 304
    invoke-virtual {v0, v1, v2}, Lzp2;->b(J)Landroid/graphics/Shader;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    :goto_b
    return-object v4

    .line 309
    :pswitch_4
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lap2;

    .line 312
    .line 313
    iget-object v1, v0, Lap2;->j:[Lyo2;

    .line 314
    .line 315
    invoke-static {v0, v1}, Lsp0;->F(Lyo2;[Lyo2;)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :pswitch_5
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_6
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lpl2;

    .line 330
    .line 331
    sget-object v1, Lxv1;->a:Lmy;

    .line 332
    .line 333
    invoke-static {v0, v1}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    check-cast v1, Lt8;

    .line 338
    .line 339
    iput-object v1, v0, Lpl2;->G:Lt8;

    .line 340
    .line 341
    if-eqz v1, :cond_b

    .line 342
    .line 343
    new-instance v5, Ls8;

    .line 344
    .line 345
    iget-object v6, v1, Lt8;->a:Landroid/content/Context;

    .line 346
    .line 347
    iget-object v7, v1, Lt8;->b:Le70;

    .line 348
    .line 349
    iget-wide v8, v1, Lt8;->c:J

    .line 350
    .line 351
    iget-object v10, v1, Lt8;->d:Ljw1;

    .line 352
    .line 353
    invoke-direct/range {v5 .. v10}, Ls8;-><init>(Landroid/content/Context;Le70;JLjw1;)V

    .line 354
    .line 355
    .line 356
    move-object v4, v5

    .line 357
    :cond_b
    iput-object v4, v0, Lpl2;->H:Ls8;

    .line 358
    .line 359
    sget-object v0, La83;->a:La83;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_7
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Ldq1;

    .line 365
    .line 366
    iget-object v0, v0, Ldq1;->i:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Lvn1;

    .line 369
    .line 370
    iget-object v1, v0, Lvn1;->d:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v1, Ldf2;

    .line 373
    .line 374
    iget-object v1, v1, Ldf2;->d:Luk2;

    .line 375
    .line 376
    iget-object v0, v0, Lvn1;->b:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Lu22;

    .line 379
    .line 380
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 381
    .line 382
    invoke-interface {v1, v0}, Luk2;->d(Lth2;)Lvk2;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    return-object v0

    .line 387
    :pswitch_8
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Ltc2;

    .line 390
    .line 391
    invoke-interface {v0}, Lia1;->getLifecycle()Lba1;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    new-instance v2, Ln62;

    .line 396
    .line 397
    const/4 v3, 0x0

    .line 398
    invoke-direct {v2, v3, v0}, Ln62;-><init>(ILjava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v2}, Lba1;->a(Lha1;)V

    .line 402
    .line 403
    .line 404
    sget-object v0, La83;->a:La83;

    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_9
    const/4 v3, 0x0

    .line 408
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Lic2;

    .line 411
    .line 412
    iget-object v0, v0, Lic2;->j:Lrc2;

    .line 413
    .line 414
    if-eqz v0, :cond_d

    .line 415
    .line 416
    new-array v1, v3, [Low1;

    .line 417
    .line 418
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, [Low1;

    .line 423
    .line 424
    invoke-static {v1}, Ltl;->l([Low1;)Landroid/os/Bundle;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v0, v1}, Lrc2;->b(Landroid/os/Bundle;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_c

    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_c
    move-object v4, v1

    .line 439
    :cond_d
    :goto_c
    return-object v4

    .line 440
    :pswitch_a
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v0, Lbc2;

    .line 443
    .line 444
    iget-object v1, v0, Lbc2;->h:Lwc2;

    .line 445
    .line 446
    iget-object v2, v0, Lbc2;->k:Ljava/lang/Object;

    .line 447
    .line 448
    if-eqz v2, :cond_e

    .line 449
    .line 450
    invoke-interface {v1, v0, v2}, Lwc2;->m(Lbc2;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    goto :goto_d

    .line 455
    :cond_e
    const-string v0, "Value should be initialized"

    .line 456
    .line 457
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_d
    return-object v4

    .line 461
    :pswitch_b
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v0, Lot1;

    .line 464
    .line 465
    new-instance v1, Lmt1;

    .line 466
    .line 467
    invoke-direct {v1, v0}, Lmt1;-><init>(Lot1;)V

    .line 468
    .line 469
    .line 470
    return-object v1

    .line 471
    :pswitch_c
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lep1;

    .line 474
    .line 475
    iget-object v0, v0, Lep1;->b:Lsc;

    .line 476
    .line 477
    invoke-virtual {v0}, Lsc;->d()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    check-cast v0, Ljava/lang/Number;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    return-object v0

    .line 492
    :pswitch_d
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Ln31;

    .line 495
    .line 496
    sget-object v1, La83;->a:La83;

    .line 497
    .line 498
    sget-object v2, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 499
    .line 500
    invoke-static {}, Lam1;->c()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, Ln31;->a()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    check-cast v0, Ljava/lang/Boolean;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-nez v0, :cond_f

    .line 514
    .line 515
    const-string v2, "NukeNativePerf"

    .line 516
    .line 517
    const-string v3, "native probe failed"

    .line 518
    .line 519
    :try_start_4
    const-string v0, "[NukeNativePerf]native probe failed"

    .line 520
    .line 521
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 522
    .line 523
    .line 524
    move-object v4, v1

    .line 525
    goto :goto_e

    .line 526
    :catchall_2
    move-exception v0

    .line 527
    new-instance v4, Lx92;

    .line 528
    .line 529
    invoke-direct {v4, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 530
    .line 531
    .line 532
    :goto_e
    instance-of v0, v4, Lx92;

    .line 533
    .line 534
    if-eqz v0, :cond_f

    .line 535
    .line 536
    const/4 v0, 0x6

    .line 537
    invoke-static {v0, v2, v3}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 538
    .line 539
    .line 540
    :cond_f
    return-object v1

    .line 541
    :pswitch_e
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Lu91;

    .line 544
    .line 545
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 546
    .line 547
    iget-object v0, v0, Lu91;->a:Landroid/view/View;

    .line 548
    .line 549
    const/4 v2, 0x0

    .line 550
    invoke-direct {v1, v0, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 551
    .line 552
    .line 553
    return-object v1

    .line 554
    :pswitch_f
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Ld91;

    .line 557
    .line 558
    invoke-virtual {v0}, Ld91;->g()Lx81;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    iget v0, v0, Lx81;->n:I

    .line 563
    .line 564
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    return-object v0

    .line 569
    :pswitch_10
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lsz0;

    .line 572
    .line 573
    iget-object v0, v0, Lsz0;->i:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v0, Landroid/view/View;

    .line 576
    .line 577
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    const-string v1, "input_method"

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 591
    .line 592
    return-object v0

    .line 593
    :pswitch_11
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v0, Lj20;

    .line 596
    .line 597
    invoke-interface {v0}, Lj20;->g()La20;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-static {v0}, Lte;->F(La20;)F

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    return-object v0

    .line 610
    :pswitch_12
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 611
    .line 612
    move-object v1, v0

    .line 613
    check-cast v1, Lqv0;

    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    :try_start_5
    iget-object v0, v1, Lqv0;->D:Lyv0;

    .line 619
    .line 620
    const/4 v2, 0x0

    .line 621
    const/4 v15, 0x2

    .line 622
    invoke-virtual {v0, v15, v2, v2}, Lyv0;->j(IIZ)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 623
    .line 624
    .line 625
    goto :goto_f

    .line 626
    :catch_1
    move-exception v0

    .line 627
    sget-object v2, Lcg0;->k:Lcg0;

    .line 628
    .line 629
    invoke-virtual {v1, v2, v2, v0}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 630
    .line 631
    .line 632
    :goto_f
    sget-object v0, La83;->a:La83;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_13
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, Lin0;

    .line 638
    .line 639
    new-instance v1, Lc0;

    .line 640
    .line 641
    const/16 v2, 0x1d

    .line 642
    .line 643
    invoke-direct {v1, v2}, Lc0;-><init>(I)V

    .line 644
    .line 645
    .line 646
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    sget-object v0, La83;->a:La83;

    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_14
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Ljava/util/List;

    .line 655
    .line 656
    return-object v0

    .line 657
    :pswitch_15
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v0, Lsz0;

    .line 660
    .line 661
    iget-object v0, v0, Lsz0;->j:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v0, Ljx1;

    .line 664
    .line 665
    invoke-virtual {v0}, Ljx1;->g()F

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    return-object v0

    .line 674
    :pswitch_16
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v0, Lcz2;

    .line 677
    .line 678
    invoke-interface {v0}, Lcz2;->close()V

    .line 679
    .line 680
    .line 681
    sget-object v0, La83;->a:La83;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_17
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Lt91;

    .line 687
    .line 688
    invoke-virtual {v0}, Lt91;->d()Lz03;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    return-object v0

    .line 693
    :pswitch_18
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, Lqv1;

    .line 696
    .line 697
    new-instance v1, Ltz2;

    .line 698
    .line 699
    const/4 v2, 0x0

    .line 700
    invoke-direct {v1, v0, v2}, Ltz2;-><init>(Lqv1;F)V

    .line 701
    .line 702
    .line 703
    return-object v1

    .line 704
    :pswitch_19
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Lo62;

    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_1a
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, [Ljava/lang/Object;

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    new-instance v1, Lt2;

    .line 717
    .line 718
    invoke-direct {v1, v0}, Lt2;-><init>([Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    return-object v1

    .line 722
    :pswitch_1b
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lry2;

    .line 725
    .line 726
    invoke-interface {v0}, Lry2;->v0()Lqy2;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    return-object v0

    .line 731
    :pswitch_1c
    iget-object v0, v0, Lta;->i:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v0, Lua;

    .line 734
    .line 735
    invoke-static {v0}, Lci0;->M(Lmc0;)V

    .line 736
    .line 737
    .line 738
    sget-object v0, La83;->a:La83;

    .line 739
    .line 740
    return-object v0

    .line 741
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
