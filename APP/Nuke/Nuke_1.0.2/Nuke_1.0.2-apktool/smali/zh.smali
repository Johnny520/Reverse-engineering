.class public final Lzh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzh;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lzh;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lzh;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lzh;->h:I

    .line 6
    .line 7
    const/16 v3, 0x17

    .line 8
    .line 9
    const/16 v4, 0x16

    .line 10
    .line 11
    const/16 v5, 0x15

    .line 12
    .line 13
    const/16 v6, 0x14

    .line 14
    .line 15
    const/16 v7, 0x13

    .line 16
    .line 17
    const/4 v9, 0x6

    .line 18
    const/4 v10, 0x2

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x4

    .line 21
    const/4 v13, 0x3

    .line 22
    const/4 v14, 0x5

    .line 23
    const/4 v8, 0x1

    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljc3;

    .line 36
    .line 37
    iget-object v2, v2, Ljc3;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lxk1;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/Set;

    .line 50
    .line 51
    invoke-static {v1, v2}, Lnp2;->d0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/util/Set;

    .line 61
    .line 62
    invoke-static {v1, v2}, Lnp2;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_0
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, La83;->a:La83;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    check-cast v1, Ld51;

    .line 73
    .line 74
    iget-object v1, v1, Ld51;->a:Landroid/view/KeyEvent;

    .line 75
    .line 76
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lyk0;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    if-nez v11, :cond_2

    .line 85
    .line 86
    :cond_1
    :goto_1
    const/4 v15, 0x0

    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_2
    const/16 v15, 0x201

    .line 90
    .line 91
    invoke-virtual {v11, v15}, Landroid/view/InputDevice;->supportsSource(I)Z

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    if-nez v15, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v11}, Landroid/view/InputDevice;->isVirtual()Z

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    if-eqz v11, :cond_4

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getSource()I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    const v15, 0x2000001

    .line 109
    .line 110
    .line 111
    if-eq v11, v15, :cond_4

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-static {v1}, Lqp0;->C(Landroid/view/KeyEvent;)I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-ne v11, v10, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getSource()I

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    const/16 v11, 0x101

    .line 125
    .line 126
    if-ne v10, v11, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    invoke-static {v7, v1}, Lsp0;->l(ILandroid/view/KeyEvent;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_6

    .line 134
    .line 135
    check-cast v2, Lbl0;

    .line 136
    .line 137
    invoke-virtual {v2, v14, v8}, Lbl0;->g(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    goto :goto_2

    .line 142
    :cond_6
    invoke-static {v6, v1}, Lsp0;->l(ILandroid/view/KeyEvent;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_7

    .line 147
    .line 148
    check-cast v2, Lbl0;

    .line 149
    .line 150
    invoke-virtual {v2, v9, v8}, Lbl0;->g(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    goto :goto_2

    .line 155
    :cond_7
    invoke-static {v5, v1}, Lsp0;->l(ILandroid/view/KeyEvent;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_8

    .line 160
    .line 161
    check-cast v2, Lbl0;

    .line 162
    .line 163
    invoke-virtual {v2, v13, v8}, Lbl0;->g(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    goto :goto_2

    .line 168
    :cond_8
    invoke-static {v4, v1}, Lsp0;->l(ILandroid/view/KeyEvent;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_9

    .line 173
    .line 174
    check-cast v2, Lbl0;

    .line 175
    .line 176
    invoke-virtual {v2, v12, v8}, Lbl0;->g(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    goto :goto_2

    .line 181
    :cond_9
    invoke-static {v3, v1}, Lsp0;->l(ILandroid/view/KeyEvent;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_1

    .line 186
    .line 187
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lt91;

    .line 190
    .line 191
    iget-object v0, v0, Lt91;->c:Lbt2;

    .line 192
    .line 193
    if-eqz v0, :cond_a

    .line 194
    .line 195
    check-cast v0, Lv60;

    .line 196
    .line 197
    invoke-virtual {v0}, Lv60;->b()V

    .line 198
    .line 199
    .line 200
    :cond_a
    move v15, v8

    .line 201
    :goto_2
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0

    .line 206
    :pswitch_1
    iget-object v2, v0, Lzh;->i:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Lmp;

    .line 209
    .line 210
    iget-object v0, v0, Lzh;->j:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    invoke-virtual {v0, v3, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    invoke-virtual {v2}, Lmp;->y()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Lmp;->h(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    sget-object v0, La83;->a:La83;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_2
    check-cast v1, Ljava/lang/Throwable;

    .line 234
    .line 235
    iget-object v1, v0, Lzh;->j:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Landroid/app/Activity;

    .line 238
    .line 239
    new-instance v2, Ly4;

    .line 240
    .line 241
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lo72;

    .line 244
    .line 245
    invoke-direct {v2, v13, v0}, Ly4;-><init>(ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, La83;->a:La83;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_3
    check-cast v1, Ljava/lang/Class;

    .line 255
    .line 256
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v2, Lhi0;

    .line 259
    .line 260
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 261
    .line 262
    move-object v3, v0

    .line 263
    check-cast v3, Lyf1;

    .line 264
    .line 265
    const-class v4, Ljava/lang/reflect/Field;

    .line 266
    .line 267
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget-object v5, Ltl;->e:Li51;

    .line 271
    .line 272
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    goto :goto_3

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    new-instance v1, Lx92;

    .line 283
    .line 284
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    move-object v0, v1

    .line 288
    :goto_3
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-eqz v1, :cond_c

    .line 293
    .line 294
    new-instance v6, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    const-string v7, "Failed to get declared fields in "

    .line 297
    .line 298
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v5, " because got an exception."

    .line 305
    .line 306
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-static {v5, v1}, Ltp0;->S(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    :cond_c
    instance-of v1, v0, Lx92;

    .line 317
    .line 318
    if-eqz v1, :cond_d

    .line 319
    .line 320
    move-object v0, v11

    .line 321
    :cond_d
    check-cast v0, Ljava/util/List;

    .line 322
    .line 323
    if-nez v0, :cond_e

    .line 324
    .line 325
    sget-object v0, Lbe0;->h:Lbe0;

    .line 326
    .line 327
    :cond_e
    new-instance v1, Lng;

    .line 328
    .line 329
    invoke-direct {v1, v8, v0}, Lng;-><init>(ILjava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v1, v2, v3}, Ltl;->i(Lng;Lzf1;Lyf1;)Lbj0;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    sget-object v1, Lgg1;->j:Lgg1;

    .line 337
    .line 338
    new-instance v5, Lbj0;

    .line 339
    .line 340
    invoke-direct {v5, v0, v1, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 341
    .line 342
    .line 343
    const-string v0, "isEnumConstant"

    .line 344
    .line 345
    new-instance v1, Lz81;

    .line 346
    .line 347
    invoke-direct {v1, v10}, Lz81;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-static {v5, v3, v0, v11, v1}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const-string v1, "isEnumConstantNot"

    .line 355
    .line 356
    new-instance v5, Lz81;

    .line 357
    .line 358
    invoke-direct {v5, v13}, Lz81;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v3, v1, v11, v5}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    const-string v1, "type"

    .line 366
    .line 367
    iget-object v5, v2, Lhi0;->g:Ljava/lang/Class;

    .line 368
    .line 369
    new-instance v6, Lcg1;

    .line 370
    .line 371
    invoke-direct {v6, v3, v8}, Lcg1;-><init>(Lyf1;I)V

    .line 372
    .line 373
    .line 374
    invoke-static {v0, v3, v1, v5, v6}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const-string v1, "typeCondition"

    .line 379
    .line 380
    iget-object v2, v2, Lhi0;->h:Lin0;

    .line 381
    .line 382
    new-instance v5, Lz81;

    .line 383
    .line 384
    invoke-direct {v5, v12}, Lz81;-><init>(I)V

    .line 385
    .line 386
    .line 387
    invoke-static {v0, v3, v1, v2, v5}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const-string v1, "genericType"

    .line 392
    .line 393
    new-instance v2, Lz81;

    .line 394
    .line 395
    invoke-direct {v2, v14}, Lz81;-><init>(I)V

    .line 396
    .line 397
    .line 398
    invoke-static {v0, v3, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    const-string v1, "genericTypeCondition"

    .line 403
    .line 404
    new-instance v2, Lz81;

    .line 405
    .line 406
    invoke-direct {v2, v9}, Lz81;-><init>(I)V

    .line 407
    .line 408
    .line 409
    invoke-static {v0, v3, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    new-instance v1, Lnx0;

    .line 414
    .line 415
    const/16 v2, 0x19

    .line 416
    .line 417
    invoke-direct {v1, v2}, Lnx0;-><init>(I)V

    .line 418
    .line 419
    .line 420
    new-instance v2, Lbj0;

    .line 421
    .line 422
    invoke-direct {v2, v0, v1, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 423
    .line 424
    .line 425
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    const-class v1, Ljava/lang/reflect/Method;

    .line 430
    .line 431
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-eqz v1, :cond_f

    .line 440
    .line 441
    new-instance v0, Lhg1;

    .line 442
    .line 443
    const/4 v1, 0x0

    .line 444
    invoke-direct {v0, v3, v1}, Lhg1;-><init>(Lyf1;I)V

    .line 445
    .line 446
    .line 447
    new-instance v1, Lbj0;

    .line 448
    .line 449
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 450
    .line 451
    .line 452
    goto :goto_4

    .line 453
    :cond_f
    const-class v1, Ljava/lang/reflect/Constructor;

    .line 454
    .line 455
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_10

    .line 464
    .line 465
    new-instance v0, Lhg1;

    .line 466
    .line 467
    invoke-direct {v0, v3, v8}, Lhg1;-><init>(Lyf1;I)V

    .line 468
    .line 469
    .line 470
    new-instance v1, Lbj0;

    .line 471
    .line 472
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 473
    .line 474
    .line 475
    goto :goto_4

    .line 476
    :cond_10
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_11

    .line 485
    .line 486
    new-instance v0, Lhg1;

    .line 487
    .line 488
    invoke-direct {v0, v3, v10}, Lhg1;-><init>(Lyf1;I)V

    .line 489
    .line 490
    .line 491
    new-instance v1, Lbj0;

    .line 492
    .line 493
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 494
    .line 495
    .line 496
    :goto_4
    invoke-static {v1}, Lwo2;->T(Luo2;)Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v11

    .line 500
    goto :goto_5

    .line 501
    :cond_11
    const-string v0, "Unsupported member type: "

    .line 502
    .line 503
    invoke-static {v0, v2}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    :goto_5
    return-object v11

    .line 507
    :pswitch_4
    check-cast v1, Ljava/lang/Class;

    .line 508
    .line 509
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v2, Lzf1;

    .line 512
    .line 513
    check-cast v2, Lsg1;

    .line 514
    .line 515
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 516
    .line 517
    move-object v15, v0

    .line 518
    check-cast v15, Lyf1;

    .line 519
    .line 520
    const-class v16, Ljava/lang/reflect/Method;

    .line 521
    .line 522
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    sget-object v5, Ltl;->e:Li51;

    .line 526
    .line 527
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 535
    goto :goto_6

    .line 536
    :catchall_1
    move-exception v0

    .line 537
    new-instance v1, Lx92;

    .line 538
    .line 539
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 540
    .line 541
    .line 542
    move-object v0, v1

    .line 543
    :goto_6
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    if-eqz v1, :cond_12

    .line 548
    .line 549
    new-instance v6, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    const-string v7, "Failed to get declared methods in "

    .line 552
    .line 553
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    const-string v5, " because got an exception."

    .line 560
    .line 561
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    invoke-static {v5, v1}, Ltp0;->S(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    :cond_12
    instance-of v1, v0, Lx92;

    .line 572
    .line 573
    if-eqz v1, :cond_13

    .line 574
    .line 575
    move-object v0, v11

    .line 576
    :cond_13
    check-cast v0, Ljava/util/List;

    .line 577
    .line 578
    if-nez v0, :cond_14

    .line 579
    .line 580
    sget-object v0, Lbe0;->h:Lbe0;

    .line 581
    .line 582
    :cond_14
    new-instance v1, Lng;

    .line 583
    .line 584
    invoke-direct {v1, v8, v0}, Lng;-><init>(ILjava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    invoke-static {v1, v2, v15}, Ltl;->i(Lng;Lzf1;Lyf1;)Lbj0;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sget-object v1, Lgg1;->i:Lgg1;

    .line 592
    .line 593
    new-instance v5, Lbj0;

    .line 594
    .line 595
    invoke-direct {v5, v0, v1, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 596
    .line 597
    .line 598
    const-string v0, "parameters"

    .line 599
    .line 600
    iget-object v1, v2, Lsg1;->g:Ljava/util/ArrayList;

    .line 601
    .line 602
    new-instance v6, Lcg1;

    .line 603
    .line 604
    invoke-direct {v6, v15, v10}, Lcg1;-><init>(Lyf1;I)V

    .line 605
    .line 606
    .line 607
    invoke-static {v5, v15, v0, v1, v6}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    const-string v1, "parametersNot"

    .line 612
    .line 613
    iget-object v5, v2, Lsg1;->h:Ljava/util/ArrayList;

    .line 614
    .line 615
    new-instance v6, Lcg1;

    .line 616
    .line 617
    invoke-direct {v6, v15, v14}, Lcg1;-><init>(Lyf1;I)V

    .line 618
    .line 619
    .line 620
    invoke-static {v0, v15, v1, v5, v6}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    const-string v1, "parametersCondition"

    .line 625
    .line 626
    iget-object v5, v2, Lsg1;->i:Lin0;

    .line 627
    .line 628
    new-instance v6, Lz81;

    .line 629
    .line 630
    invoke-direct {v6, v4}, Lz81;-><init>(I)V

    .line 631
    .line 632
    .line 633
    invoke-static {v0, v15, v1, v5, v6}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    const-string v1, "parameterCount"

    .line 638
    .line 639
    iget-object v4, v2, Lsg1;->l:Ljava/lang/Integer;

    .line 640
    .line 641
    new-instance v5, Lz81;

    .line 642
    .line 643
    invoke-direct {v5, v3}, Lz81;-><init>(I)V

    .line 644
    .line 645
    .line 646
    invoke-static {v0, v15, v1, v4, v5}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    const-string v1, "parameterCountCondition"

    .line 651
    .line 652
    new-instance v3, Lz81;

    .line 653
    .line 654
    const/16 v4, 0x18

    .line 655
    .line 656
    invoke-direct {v3, v4}, Lz81;-><init>(I)V

    .line 657
    .line 658
    .line 659
    invoke-static {v0, v15, v1, v11, v3}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    const-string v1, "typeParameters"

    .line 664
    .line 665
    iget-object v3, v2, Lsg1;->j:Ljava/util/LinkedHashSet;

    .line 666
    .line 667
    new-instance v4, Lz81;

    .line 668
    .line 669
    const/16 v5, 0x19

    .line 670
    .line 671
    invoke-direct {v4, v5}, Lz81;-><init>(I)V

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    const-string v1, "typeParametersNot"

    .line 679
    .line 680
    iget-object v3, v2, Lsg1;->k:Ljava/util/LinkedHashSet;

    .line 681
    .line 682
    new-instance v4, Lz81;

    .line 683
    .line 684
    const/16 v5, 0x1a

    .line 685
    .line 686
    invoke-direct {v4, v5}, Lz81;-><init>(I)V

    .line 687
    .line 688
    .line 689
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    const-string v1, "exceptionTypes"

    .line 694
    .line 695
    iget-object v3, v2, Lsg1;->m:Ljava/util/LinkedHashSet;

    .line 696
    .line 697
    new-instance v4, Lcg1;

    .line 698
    .line 699
    invoke-direct {v4, v15, v9}, Lcg1;-><init>(Lyf1;I)V

    .line 700
    .line 701
    .line 702
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    const-string v1, "exceptionTypesNot"

    .line 707
    .line 708
    iget-object v3, v2, Lsg1;->n:Ljava/util/LinkedHashSet;

    .line 709
    .line 710
    new-instance v4, Lcg1;

    .line 711
    .line 712
    const/4 v5, 0x7

    .line 713
    invoke-direct {v4, v15, v5}, Lcg1;-><init>(Lyf1;I)V

    .line 714
    .line 715
    .line 716
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    const-string v1, "genericExceptionTypes"

    .line 721
    .line 722
    iget-object v3, v2, Lsg1;->o:Ljava/util/LinkedHashSet;

    .line 723
    .line 724
    new-instance v4, Lz81;

    .line 725
    .line 726
    const/16 v6, 0x1c

    .line 727
    .line 728
    invoke-direct {v4, v6}, Lz81;-><init>(I)V

    .line 729
    .line 730
    .line 731
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    const-string v1, "genericExceptionTypesNot"

    .line 736
    .line 737
    iget-object v3, v2, Lsg1;->p:Ljava/util/LinkedHashSet;

    .line 738
    .line 739
    new-instance v4, Lz81;

    .line 740
    .line 741
    invoke-direct {v4, v5}, Lz81;-><init>(I)V

    .line 742
    .line 743
    .line 744
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    const-string v1, "genericParameters"

    .line 749
    .line 750
    iget-object v3, v2, Lsg1;->q:Ljava/util/LinkedHashSet;

    .line 751
    .line 752
    new-instance v4, Lz81;

    .line 753
    .line 754
    const/16 v5, 0x8

    .line 755
    .line 756
    invoke-direct {v4, v5}, Lz81;-><init>(I)V

    .line 757
    .line 758
    .line 759
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    const-string v1, "genericParametersNot"

    .line 764
    .line 765
    iget-object v3, v2, Lsg1;->r:Ljava/util/LinkedHashSet;

    .line 766
    .line 767
    new-instance v4, Lz81;

    .line 768
    .line 769
    const/16 v6, 0x9

    .line 770
    .line 771
    invoke-direct {v4, v6}, Lz81;-><init>(I)V

    .line 772
    .line 773
    .line 774
    invoke-static {v0, v15, v1, v3, v4}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    const-string v1, "isVarArgs"

    .line 779
    .line 780
    new-instance v3, Lz81;

    .line 781
    .line 782
    const/16 v4, 0xb

    .line 783
    .line 784
    invoke-direct {v3, v4}, Lz81;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-static {v0, v15, v1, v11, v3}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    const-string v1, "isVarArgsNot"

    .line 792
    .line 793
    new-instance v3, Lz81;

    .line 794
    .line 795
    const/16 v7, 0xc

    .line 796
    .line 797
    invoke-direct {v3, v7}, Lz81;-><init>(I)V

    .line 798
    .line 799
    .line 800
    invoke-static {v0, v15, v1, v11, v3}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    const-string v1, "parameterAnnotations"

    .line 805
    .line 806
    iget-object v3, v2, Lsg1;->s:Ljava/util/ArrayList;

    .line 807
    .line 808
    new-instance v9, Lcg1;

    .line 809
    .line 810
    invoke-direct {v9, v15, v13}, Lcg1;-><init>(Lyf1;I)V

    .line 811
    .line 812
    .line 813
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const-string v1, "parameterAnnotationsNot"

    .line 818
    .line 819
    iget-object v3, v2, Lsg1;->t:Ljava/util/ArrayList;

    .line 820
    .line 821
    new-instance v9, Lcg1;

    .line 822
    .line 823
    invoke-direct {v9, v15, v12}, Lcg1;-><init>(Lyf1;I)V

    .line 824
    .line 825
    .line 826
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    const-string v1, "annotatedReturnType"

    .line 831
    .line 832
    iget-object v3, v2, Lsg1;->u:Ljava/util/LinkedHashSet;

    .line 833
    .line 834
    new-instance v9, Lz81;

    .line 835
    .line 836
    const/16 v10, 0xd

    .line 837
    .line 838
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 839
    .line 840
    .line 841
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    const-string v1, "annotatedReturnTypeNot"

    .line 846
    .line 847
    iget-object v3, v2, Lsg1;->v:Ljava/util/LinkedHashSet;

    .line 848
    .line 849
    new-instance v9, Lz81;

    .line 850
    .line 851
    const/16 v10, 0xe

    .line 852
    .line 853
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 854
    .line 855
    .line 856
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    const-string v1, "annotatedReceiverType"

    .line 861
    .line 862
    iget-object v3, v2, Lsg1;->w:Ljava/util/LinkedHashSet;

    .line 863
    .line 864
    new-instance v9, Lz81;

    .line 865
    .line 866
    const/16 v10, 0xf

    .line 867
    .line 868
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 869
    .line 870
    .line 871
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    const-string v1, "annotatedReceiverTypeNot"

    .line 876
    .line 877
    iget-object v3, v2, Lsg1;->x:Ljava/util/LinkedHashSet;

    .line 878
    .line 879
    new-instance v9, Lz81;

    .line 880
    .line 881
    const/16 v10, 0x10

    .line 882
    .line 883
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 884
    .line 885
    .line 886
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    const-string v1, "annotatedParameterTypes"

    .line 891
    .line 892
    iget-object v3, v2, Lsg1;->y:Ljava/util/LinkedHashSet;

    .line 893
    .line 894
    new-instance v9, Lz81;

    .line 895
    .line 896
    const/16 v10, 0x11

    .line 897
    .line 898
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 899
    .line 900
    .line 901
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    const-string v1, "annotatedParameterTypesNot"

    .line 906
    .line 907
    iget-object v3, v2, Lsg1;->z:Ljava/util/LinkedHashSet;

    .line 908
    .line 909
    new-instance v9, Lz81;

    .line 910
    .line 911
    const/16 v10, 0x13

    .line 912
    .line 913
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 914
    .line 915
    .line 916
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    const-string v1, "annotatedExceptionTypes"

    .line 921
    .line 922
    iget-object v3, v2, Lsg1;->A:Ljava/util/LinkedHashSet;

    .line 923
    .line 924
    new-instance v9, Lz81;

    .line 925
    .line 926
    const/16 v10, 0x14

    .line 927
    .line 928
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 929
    .line 930
    .line 931
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    const-string v1, "annotatedExceptionTypesNot"

    .line 936
    .line 937
    iget-object v3, v2, Lsg1;->B:Ljava/util/LinkedHashSet;

    .line 938
    .line 939
    new-instance v9, Lz81;

    .line 940
    .line 941
    const/16 v10, 0x15

    .line 942
    .line 943
    invoke-direct {v9, v10}, Lz81;-><init>(I)V

    .line 944
    .line 945
    .line 946
    invoke-static {v0, v15, v1, v3, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    sget-object v1, Lgg1;->k:Lgg1;

    .line 951
    .line 952
    new-instance v3, Lbj0;

    .line 953
    .line 954
    invoke-direct {v3, v0, v1, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 955
    .line 956
    .line 957
    const-string v0, "returnType"

    .line 958
    .line 959
    iget-object v1, v2, Lsg1;->C:Ljava/lang/Class;

    .line 960
    .line 961
    new-instance v9, Lcg1;

    .line 962
    .line 963
    const/4 v10, 0x0

    .line 964
    invoke-direct {v9, v15, v10}, Lcg1;-><init>(Lyf1;I)V

    .line 965
    .line 966
    .line 967
    invoke-static {v3, v15, v0, v1, v9}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    const-string v1, "returnTypeCondition"

    .line 972
    .line 973
    iget-object v2, v2, Lsg1;->D:Lin0;

    .line 974
    .line 975
    new-instance v3, Lz81;

    .line 976
    .line 977
    const/16 v9, 0xa

    .line 978
    .line 979
    invoke-direct {v3, v9}, Lz81;-><init>(I)V

    .line 980
    .line 981
    .line 982
    invoke-static {v0, v15, v1, v2, v3}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    const-string v1, "genericReturnType"

    .line 987
    .line 988
    new-instance v2, Lz81;

    .line 989
    .line 990
    const/16 v3, 0x12

    .line 991
    .line 992
    invoke-direct {v2, v3}, Lz81;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    const-string v1, "genericReturnTypeCondition"

    .line 1000
    .line 1001
    new-instance v2, Lz81;

    .line 1002
    .line 1003
    const/16 v3, 0x1b

    .line 1004
    .line 1005
    invoke-direct {v2, v3}, Lz81;-><init>(I)V

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    const-string v1, "isBridge"

    .line 1013
    .line 1014
    new-instance v2, Leg1;

    .line 1015
    .line 1016
    const/4 v3, 0x0

    .line 1017
    invoke-direct {v2, v3, v14}, Leg1;-><init>(BI)V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    const-string v1, "isBridgeNot"

    .line 1025
    .line 1026
    new-instance v2, Leg1;

    .line 1027
    .line 1028
    invoke-direct {v2, v3, v5}, Leg1;-><init>(BI)V

    .line 1029
    .line 1030
    .line 1031
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    const-string v1, "isDefault"

    .line 1036
    .line 1037
    new-instance v2, Leg1;

    .line 1038
    .line 1039
    invoke-direct {v2, v3, v6}, Leg1;-><init>(BI)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    const-string v1, "isDefaultNot"

    .line 1047
    .line 1048
    new-instance v2, Leg1;

    .line 1049
    .line 1050
    invoke-direct {v2, v3, v9}, Leg1;-><init>(BI)V

    .line 1051
    .line 1052
    .line 1053
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    const-string v1, "defaultValue"

    .line 1058
    .line 1059
    new-instance v2, Leg1;

    .line 1060
    .line 1061
    invoke-direct {v2, v3, v4}, Leg1;-><init>(BI)V

    .line 1062
    .line 1063
    .line 1064
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    const-string v1, "defaultValueCondition"

    .line 1069
    .line 1070
    new-instance v2, Leg1;

    .line 1071
    .line 1072
    invoke-direct {v2, v3, v7}, Leg1;-><init>(BI)V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v0, v15, v1, v11, v2}, Ltl;->y(Luo2;Lyf1;Ljava/lang/String;Ljava/lang/Object;Lmn0;)Lbj0;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    new-instance v1, Lnx0;

    .line 1080
    .line 1081
    const/16 v2, 0x19

    .line 1082
    .line 1083
    invoke-direct {v1, v2}, Lnx0;-><init>(I)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v2, Lbj0;

    .line 1087
    .line 1088
    invoke-direct {v2, v0, v1, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static/range {v16 .. v16}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-static/range {v16 .. v16}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v1

    .line 1103
    if-eqz v1, :cond_15

    .line 1104
    .line 1105
    new-instance v0, Lhg1;

    .line 1106
    .line 1107
    invoke-direct {v0, v15, v13}, Lhg1;-><init>(Lyf1;I)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v1, Lbj0;

    .line 1111
    .line 1112
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_7

    .line 1116
    :cond_15
    const-class v1, Ljava/lang/reflect/Constructor;

    .line 1117
    .line 1118
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v1

    .line 1126
    if-eqz v1, :cond_16

    .line 1127
    .line 1128
    new-instance v0, Lhg1;

    .line 1129
    .line 1130
    invoke-direct {v0, v15, v12}, Lhg1;-><init>(Lyf1;I)V

    .line 1131
    .line 1132
    .line 1133
    new-instance v1, Lbj0;

    .line 1134
    .line 1135
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 1136
    .line 1137
    .line 1138
    goto :goto_7

    .line 1139
    :cond_16
    const-class v1, Ljava/lang/reflect/Field;

    .line 1140
    .line 1141
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    invoke-virtual {v0, v1}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v0

    .line 1149
    if-eqz v0, :cond_17

    .line 1150
    .line 1151
    new-instance v0, Lhg1;

    .line 1152
    .line 1153
    invoke-direct {v0, v15, v14}, Lhg1;-><init>(Lyf1;I)V

    .line 1154
    .line 1155
    .line 1156
    new-instance v1, Lbj0;

    .line 1157
    .line 1158
    invoke-direct {v1, v2, v0, v8}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 1159
    .line 1160
    .line 1161
    :goto_7
    invoke-static {v1}, Lwo2;->T(Luo2;)Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v11

    .line 1165
    goto :goto_8

    .line 1166
    :cond_17
    const-string v0, "Unsupported member type: "

    .line 1167
    .line 1168
    invoke-static {v0, v2}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1169
    .line 1170
    .line 1171
    :goto_8
    return-object v11

    .line 1172
    :pswitch_5
    check-cast v1, Ljava/lang/Throwable;

    .line 1173
    .line 1174
    iget-object v1, v0, Lzh;->j:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v1, Lf90;

    .line 1177
    .line 1178
    iget-object v2, v1, Lf90;->b:Ljava/lang/Object;

    .line 1179
    .line 1180
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v0, Lmp;

    .line 1183
    .line 1184
    monitor-enter v2

    .line 1185
    :try_start_2
    iget-object v1, v1, Lf90;->c:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v1, Ljava/util/ArrayList;

    .line 1188
    .line 1189
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1190
    .line 1191
    .line 1192
    monitor-exit v2

    .line 1193
    sget-object v0, La83;->a:La83;

    .line 1194
    .line 1195
    return-object v0

    .line 1196
    :catchall_2
    move-exception v0

    .line 1197
    monitor-exit v2

    .line 1198
    throw v0

    .line 1199
    :pswitch_6
    check-cast v1, Ljava/lang/Number;

    .line 1200
    .line 1201
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1202
    .line 1203
    .line 1204
    move-result v1

    .line 1205
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v2, Lye;

    .line 1208
    .line 1209
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v0, Ljava/util/List;

    .line 1216
    .line 1217
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    invoke-virtual {v2, v3, v0}, Lye;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    return-object v0

    .line 1226
    :pswitch_7
    move-object v4, v1

    .line 1227
    check-cast v4, Lbs2;

    .line 1228
    .line 1229
    sget-object v1, Lds2;->c:Ljava/lang/Object;

    .line 1230
    .line 1231
    monitor-enter v1

    .line 1232
    :try_start_3
    sget-wide v2, Lds2;->e:J

    .line 1233
    .line 1234
    const-wide/16 v5, 0x1

    .line 1235
    .line 1236
    add-long/2addr v5, v2

    .line 1237
    sput-wide v5, Lds2;->e:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1238
    .line 1239
    monitor-exit v1

    .line 1240
    iget-object v1, v0, Lzh;->j:Ljava/lang/Object;

    .line 1241
    .line 1242
    move-object v5, v1

    .line 1243
    check-cast v5, Lin0;

    .line 1244
    .line 1245
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1246
    .line 1247
    move-object v6, v0

    .line 1248
    check-cast v6, Lin0;

    .line 1249
    .line 1250
    new-instance v1, Lwk1;

    .line 1251
    .line 1252
    invoke-direct/range {v1 .. v6}, Lwk1;-><init>(JLbs2;Lin0;Lin0;)V

    .line 1253
    .line 1254
    .line 1255
    return-object v1

    .line 1256
    :catchall_3
    move-exception v0

    .line 1257
    monitor-exit v1

    .line 1258
    throw v0

    .line 1259
    :pswitch_8
    const/4 v3, 0x0

    .line 1260
    check-cast v1, Ld51;

    .line 1261
    .line 1262
    iget-object v1, v1, Ld51;->a:Landroid/view/KeyEvent;

    .line 1263
    .line 1264
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v2, Lt91;

    .line 1267
    .line 1268
    invoke-virtual {v2}, Lt91;->a()Ltr0;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v2

    .line 1272
    sget-object v4, Ltr0;->i:Ltr0;

    .line 1273
    .line 1274
    if-ne v2, v4, :cond_18

    .line 1275
    .line 1276
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 1277
    .line 1278
    .line 1279
    move-result v2

    .line 1280
    if-ne v2, v12, :cond_18

    .line 1281
    .line 1282
    invoke-static {v1}, Lqp0;->C(Landroid/view/KeyEvent;)I

    .line 1283
    .line 1284
    .line 1285
    move-result v1

    .line 1286
    if-ne v1, v8, :cond_18

    .line 1287
    .line 1288
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v0, Lb03;

    .line 1291
    .line 1292
    invoke-virtual {v0, v11}, Lb03;->g(Lrs1;)V

    .line 1293
    .line 1294
    .line 1295
    move v15, v8

    .line 1296
    goto :goto_9

    .line 1297
    :cond_18
    move v15, v3

    .line 1298
    :goto_9
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    return-object v0

    .line 1303
    :pswitch_9
    check-cast v1, Ljava/lang/Number;

    .line 1304
    .line 1305
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1306
    .line 1307
    .line 1308
    move-result v1

    .line 1309
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v2, Lye;

    .line 1312
    .line 1313
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v3

    .line 1317
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v0, Ljava/util/List;

    .line 1320
    .line 1321
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-virtual {v2, v3, v0}, Lye;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    return-object v0

    .line 1330
    :pswitch_a
    check-cast v1, Ljava/lang/Boolean;

    .line 1331
    .line 1332
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v2, Lg33;

    .line 1339
    .line 1340
    iget-object v2, v2, Lg33;->a:Ljava/lang/String;

    .line 1341
    .line 1342
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1343
    .line 1344
    check-cast v0, Lxk1;

    .line 1345
    .line 1346
    if-eqz v1, :cond_19

    .line 1347
    .line 1348
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    check-cast v1, Ljava/util/Set;

    .line 1353
    .line 1354
    invoke-static {v1, v2}, Lnp2;->d0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    goto :goto_a

    .line 1359
    :cond_19
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v1

    .line 1363
    check-cast v1, Ljava/util/Set;

    .line 1364
    .line 1365
    invoke-static {v1, v2}, Lnp2;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    :goto_a
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 1370
    .line 1371
    .line 1372
    sget-object v0, La83;->a:La83;

    .line 1373
    .line 1374
    return-object v0

    .line 1375
    :pswitch_b
    check-cast v1, Ljava/lang/Boolean;

    .line 1376
    .line 1377
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v1

    .line 1381
    iget-object v2, v0, Lzh;->j:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v2, Ls62;

    .line 1384
    .line 1385
    iget-object v2, v2, Ls62;->a:Ljava/lang/String;

    .line 1386
    .line 1387
    iget-object v0, v0, Lzh;->i:Ljava/lang/Object;

    .line 1388
    .line 1389
    check-cast v0, Lxk1;

    .line 1390
    .line 1391
    if-eqz v1, :cond_1a

    .line 1392
    .line 1393
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v1

    .line 1397
    check-cast v1, Ljava/util/Set;

    .line 1398
    .line 1399
    invoke-static {v1, v2}, Lnp2;->d0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    goto :goto_b

    .line 1404
    :cond_1a
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v1

    .line 1408
    check-cast v1, Ljava/util/Set;

    .line 1409
    .line 1410
    invoke-static {v1, v2}, Lnp2;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    :goto_b
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 1415
    .line 1416
    .line 1417
    sget-object v0, La83;->a:La83;

    .line 1418
    .line 1419
    return-object v0

    .line 1420
    nop

    .line 1421
    :pswitch_data_0
    .packed-switch 0x0
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
