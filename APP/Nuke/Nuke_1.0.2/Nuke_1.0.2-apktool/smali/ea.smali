.class public final Lea;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lea;->i:I

    .line 2
    .line 3
    iput-object p2, p0, Lea;->j:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lea;->i:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, La83;->a:La83;

    .line 9
    .line 10
    iget-object v0, v0, Lea;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Lu93;

    .line 16
    .line 17
    iget-object v0, v0, Lu93;->h:Lnx1;

    .line 18
    .line 19
    invoke-virtual {v0, v5}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v5

    .line 23
    :pswitch_0
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 24
    .line 25
    check-cast v0, Lq03;

    .line 26
    .line 27
    iget-object v0, v0, Lq03;->a:Landroid/view/View;

    .line 28
    .line 29
    invoke-direct {v1, v0, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_1
    check-cast v0, Lhw2;

    .line 34
    .line 35
    invoke-virtual {v0}, Lhw2;->a()Lf71;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, v0, Lf71;->h:Lr61;

    .line 40
    .line 41
    invoke-virtual {v1}, Lr61;->o()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljk1;

    .line 46
    .line 47
    iget-object v2, v2, Ljk1;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lzk1;

    .line 50
    .line 51
    iget v2, v2, Lzk1;->j:I

    .line 52
    .line 53
    iget v6, v0, Lf71;->u:I

    .line 54
    .line 55
    if-eq v6, v2, :cond_5

    .line 56
    .line 57
    iget-object v0, v0, Lf71;->m:Lrk1;

    .line 58
    .line 59
    iget-object v2, v0, Lrk1;->c:[Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v0, v0, Lrk1;->a:[J

    .line 62
    .line 63
    array-length v6, v0

    .line 64
    add-int/lit8 v6, v6, -0x2

    .line 65
    .line 66
    const/4 v7, 0x7

    .line 67
    if-ltz v6, :cond_3

    .line 68
    .line 69
    move v8, v3

    .line 70
    :goto_0
    aget-wide v9, v0, v8

    .line 71
    .line 72
    not-long v11, v9

    .line 73
    shl-long/2addr v11, v7

    .line 74
    and-long/2addr v11, v9

    .line 75
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v11, v13

    .line 81
    cmp-long v11, v11, v13

    .line 82
    .line 83
    if-eqz v11, :cond_2

    .line 84
    .line 85
    sub-int v11, v8, v6

    .line 86
    .line 87
    not-int v11, v11

    .line 88
    ushr-int/lit8 v11, v11, 0x1f

    .line 89
    .line 90
    const/16 v12, 0x8

    .line 91
    .line 92
    rsub-int/lit8 v11, v11, 0x8

    .line 93
    .line 94
    move v13, v3

    .line 95
    :goto_1
    if-ge v13, v11, :cond_1

    .line 96
    .line 97
    const-wide/16 v14, 0xff

    .line 98
    .line 99
    and-long/2addr v14, v9

    .line 100
    const-wide/16 v16, 0x80

    .line 101
    .line 102
    cmp-long v14, v14, v16

    .line 103
    .line 104
    if-gez v14, :cond_0

    .line 105
    .line 106
    shl-int/lit8 v14, v8, 0x3

    .line 107
    .line 108
    add-int/2addr v14, v13

    .line 109
    aget-object v14, v2, v14

    .line 110
    .line 111
    check-cast v14, Lx61;

    .line 112
    .line 113
    iput-boolean v4, v14, Lx61;->d:Z

    .line 114
    .line 115
    :cond_0
    shr-long/2addr v9, v12

    .line 116
    add-int/lit8 v13, v13, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    if-ne v11, v12, :cond_3

    .line 120
    .line 121
    :cond_2
    if-eq v8, v6, :cond_3

    .line 122
    .line 123
    add-int/lit8 v8, v8, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    iget-object v0, v1, Lr61;->o:Lr61;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    iget-object v0, v1, Lr61;->N:Lv61;

    .line 131
    .line 132
    iget-boolean v0, v0, Lv61;->e:Z

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    invoke-static {v1, v3, v7}, Lr61;->T(Lr61;ZI)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    invoke-virtual {v1}, Lr61;->q()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_5

    .line 145
    .line 146
    invoke-static {v1, v3, v7}, Lr61;->V(Lr61;ZI)V

    .line 147
    .line 148
    .line 149
    :cond_5
    :goto_2
    return-object v5

    .line 150
    :pswitch_2
    check-cast v0, Lq62;

    .line 151
    .line 152
    iput-object v2, v0, Lq62;->h:Ll6;

    .line 153
    .line 154
    const-string v1, "OnPositionedDispatch"

    .line 155
    .line 156
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    invoke-virtual {v0}, Lq62;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 163
    .line 164
    .line 165
    return-object v5

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :pswitch_3
    check-cast v0, Ld22;

    .line 172
    .line 173
    invoke-static {v0}, Ld22;->m(Ld22;)Lc61;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-eqz v1, :cond_6

    .line 178
    .line 179
    invoke-interface {v1}, Lc61;->w()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_6

    .line 184
    .line 185
    move-object v2, v1

    .line 186
    :cond_6
    if-eqz v2, :cond_7

    .line 187
    .line 188
    invoke-virtual {v0}, Ld22;->getPopupContentSize-bOM6tXw()Lh11;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    move v3, v4

    .line 195
    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0

    .line 200
    :pswitch_4
    check-cast v0, Lxm1;

    .line 201
    .line 202
    invoke-virtual {v0}, Lxm1;->M0()Lj20;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_5
    check-cast v0, Ltm1;

    .line 208
    .line 209
    iget-object v0, v0, Ltm1;->d:Lj20;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_6
    new-instance v1, Lg80;

    .line 213
    .line 214
    check-cast v0, Lug1;

    .line 215
    .line 216
    iget-object v0, v0, Lug1;->k:Ljava/lang/String;

    .line 217
    .line 218
    invoke-direct {v1, v0}, Lg80;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v1

    .line 222
    :pswitch_7
    check-cast v0, Lna1;

    .line 223
    .line 224
    iget-object v0, v0, Lna1;->a:Ln4;

    .line 225
    .line 226
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lle1;

    .line 229
    .line 230
    iget-boolean v1, v0, Lle1;->i:Z

    .line 231
    .line 232
    if-eqz v1, :cond_8

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_8
    iget-boolean v1, v0, Lle1;->j:Z

    .line 236
    .line 237
    if-eqz v1, :cond_9

    .line 238
    .line 239
    const-string v1, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 240
    .line 241
    invoke-static {v1}, Lk22;->a(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_9
    invoke-virtual {v0}, Lle1;->a()V

    .line 245
    .line 246
    .line 247
    iput-boolean v4, v0, Lle1;->j:Z

    .line 248
    .line 249
    :goto_3
    return-object v5

    .line 250
    :pswitch_8
    check-cast v0, Lx61;

    .line 251
    .line 252
    iget-object v1, v0, Lx61;->g:Lnx1;

    .line 253
    .line 254
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_a

    .line 265
    .line 266
    iget-object v0, v0, Lx61;->c:Lfy;

    .line 267
    .line 268
    if-eqz v0, :cond_a

    .line 269
    .line 270
    invoke-virtual {v0}, Lfy;->l()V

    .line 271
    .line 272
    .line 273
    :cond_a
    return-object v5

    .line 274
    :pswitch_9
    check-cast v0, Lr61;

    .line 275
    .line 276
    iget-object v0, v0, Lr61;->N:Lv61;

    .line 277
    .line 278
    iget-object v1, v0, Lv61;->p:Lmf1;

    .line 279
    .line 280
    iput-boolean v4, v1, Lmf1;->F:Z

    .line 281
    .line 282
    iget-object v0, v0, Lv61;->q:Lqd1;

    .line 283
    .line 284
    if-eqz v0, :cond_b

    .line 285
    .line 286
    iput-boolean v4, v0, Lqd1;->z:Z

    .line 287
    .line 288
    :cond_b
    return-object v5

    .line 289
    :pswitch_a
    check-cast v0, Lb5;

    .line 290
    .line 291
    iget-object v0, v0, Lb5;->i:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Landroid/view/View;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-string v1, "input_method"

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_b
    check-cast v0, Lpl0;

    .line 312
    .line 313
    invoke-virtual {v0}, Lpl0;->O0()Lel0;

    .line 314
    .line 315
    .line 316
    return-object v5

    .line 317
    :pswitch_c
    new-instance v1, Ly70;

    .line 318
    .line 319
    check-cast v0, Lji0;

    .line 320
    .line 321
    iget-object v0, v0, Lji0;->k:Ljava/lang/String;

    .line 322
    .line 323
    invoke-direct {v1, v0}, Ly70;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-object v1

    .line 327
    :pswitch_d
    check-cast v0, Lg80;

    .line 328
    .line 329
    new-instance v1, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v2, "("

    .line 332
    .line 333
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v3, v0, Lg80;->c:Ljava/util/ArrayList;

    .line 337
    .line 338
    sget-object v7, Lv6;->E:Lv6;

    .line 339
    .line 340
    const/16 v8, 0x1e

    .line 341
    .line 342
    const-string v4, ""

    .line 343
    .line 344
    const/4 v5, 0x0

    .line 345
    const/4 v6, 0x0

    .line 346
    invoke-static/range {v3 .. v8}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    const-string v2, ")"

    .line 354
    .line 355
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    iget-object v0, v0, Lg80;->d:Ljava/lang/String;

    .line 359
    .line 360
    invoke-static {v0}, Li80;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_e
    check-cast v0, Ly70;

    .line 373
    .line 374
    iget-object v0, v0, Ly70;->c:Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v0}, Li80;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    return-object v0

    .line 381
    :pswitch_f
    check-cast v0, Llx;

    .line 382
    .line 383
    const-wide/16 v3, 0x0

    .line 384
    .line 385
    invoke-static {v3, v4, v3, v4}, Lh11;->a(JJ)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    iget-object v0, v0, Llx;->a:Landroid/view/View;

    .line 390
    .line 391
    if-eqz v1, :cond_14

    .line 392
    .line 393
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    move-object v1, v0

    .line 398
    :goto_4
    instance-of v3, v1, Landroid/content/ContextWrapper;

    .line 399
    .line 400
    if-eqz v3, :cond_10

    .line 401
    .line 402
    instance-of v3, v1, Landroid/app/Activity;

    .line 403
    .line 404
    if-eqz v3, :cond_c

    .line 405
    .line 406
    :goto_5
    move-object v2, v1

    .line 407
    goto :goto_6

    .line 408
    :cond_c
    instance-of v3, v1, Landroid/inputmethodservice/InputMethodService;

    .line 409
    .line 410
    if-eqz v3, :cond_d

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_d
    instance-of v3, v1, Landroid/app/Application;

    .line 414
    .line 415
    if-eqz v3, :cond_e

    .line 416
    .line 417
    goto :goto_5

    .line 418
    :cond_e
    check-cast v1, Landroid/content/ContextWrapper;

    .line 419
    .line 420
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    if-nez v3, :cond_f

    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_f
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    goto :goto_4

    .line 432
    :cond_10
    :goto_6
    const-wide v3, 0xffffffffL

    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    const/16 v1, 0x20

    .line 438
    .line 439
    if-eqz v2, :cond_13

    .line 440
    .line 441
    sget-object v0, Lnf3;->a:Lmf3;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    sget-object v0, Lmf3;->b:Lof3;

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-object v5, v2

    .line 452
    check-cast v5, Landroid/content/ContextWrapper;

    .line 453
    .line 454
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 455
    .line 456
    const/16 v7, 0x22

    .line 457
    .line 458
    if-lt v6, v7, :cond_11

    .line 459
    .line 460
    sget-object v6, Lg70;->i:Lg70;

    .line 461
    .line 462
    goto :goto_7

    .line 463
    :cond_11
    const/16 v7, 0x1e

    .line 464
    .line 465
    if-lt v6, v7, :cond_12

    .line 466
    .line 467
    sget-object v6, Lzl;->i:Lzl;

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_12
    sget-object v6, Lsn;->X:Lsn;

    .line 471
    .line 472
    :goto_7
    iget-object v0, v0, Lof3;->b:Lf70;

    .line 473
    .line 474
    invoke-interface {v6, v5, v0}, Lpf3;->d(Landroid/content/ContextWrapper;Lf70;)Llf3;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Llf3;->a()Landroid/graphics/Rect;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    invoke-virtual {v0}, Llf3;->a()Landroid/graphics/Rect;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    int-to-long v5, v5

    .line 495
    shl-long/2addr v5, v1

    .line 496
    int-to-long v0, v0

    .line 497
    and-long/2addr v0, v3

    .line 498
    or-long/2addr v0, v5

    .line 499
    invoke-static {v2}, Lse;->m(Landroid/content/Context;)Li70;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-static {v0, v1}, Ls11;->q0(J)J

    .line 504
    .line 505
    .line 506
    move-result-wide v3

    .line 507
    invoke-interface {v2, v3, v4}, Le70;->y(J)J

    .line 508
    .line 509
    .line 510
    move-result-wide v2

    .line 511
    new-instance v4, Lk70;

    .line 512
    .line 513
    invoke-direct {v4, v0, v1, v2, v3}, Lk70;-><init>(JJ)V

    .line 514
    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_13
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-static {v0}, Lse;->m(Landroid/content/Context;)Li70;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    iget v5, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 530
    .line 531
    int-to-float v5, v5

    .line 532
    iget v2, v2, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 533
    .line 534
    int-to-float v2, v2

    .line 535
    invoke-static {v5, v2}, Lp7;->a(FF)J

    .line 536
    .line 537
    .line 538
    move-result-wide v5

    .line 539
    invoke-interface {v0, v5, v6}, Le70;->d0(J)J

    .line 540
    .line 541
    .line 542
    move-result-wide v7

    .line 543
    shr-long v9, v7, v1

    .line 544
    .line 545
    long-to-int v0, v9

    .line 546
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    float-to-int v0, v0

    .line 551
    and-long/2addr v7, v3

    .line 552
    long-to-int v2, v7

    .line 553
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    float-to-int v2, v2

    .line 558
    int-to-long v7, v0

    .line 559
    shl-long v0, v7, v1

    .line 560
    .line 561
    int-to-long v7, v2

    .line 562
    and-long v2, v7, v3

    .line 563
    .line 564
    or-long/2addr v0, v2

    .line 565
    new-instance v4, Lk70;

    .line 566
    .line 567
    invoke-direct {v4, v0, v1, v5, v6}, Lk70;-><init>(JJ)V

    .line 568
    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_14
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0}, Lse;->m(Landroid/content/Context;)Li70;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-static {v3, v4}, Ls11;->q0(J)J

    .line 580
    .line 581
    .line 582
    move-result-wide v1

    .line 583
    invoke-interface {v0, v1, v2}, Le70;->y(J)J

    .line 584
    .line 585
    .line 586
    move-result-wide v0

    .line 587
    new-instance v2, Lk70;

    .line 588
    .line 589
    invoke-direct {v2, v3, v4, v0, v1}, Lk70;-><init>(JJ)V

    .line 590
    .line 591
    .line 592
    move-object v4, v2

    .line 593
    :goto_8
    return-object v4

    .line 594
    :pswitch_10
    new-instance v1, Lu70;

    .line 595
    .line 596
    check-cast v0, Lus;

    .line 597
    .line 598
    iget-object v0, v0, Lus;->j:Ljava/lang/String;

    .line 599
    .line 600
    invoke-direct {v1, v0}, Lu70;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    return-object v1

    .line 604
    :pswitch_11
    check-cast v0, Lo62;

    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_12
    new-instance v1, Lu70;

    .line 608
    .line 609
    check-cast v0, Lud;

    .line 610
    .line 611
    iget-object v0, v0, Lud;->i:Ljava/lang/String;

    .line 612
    .line 613
    invoke-direct {v1, v0}, Lu70;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    return-object v1

    .line 617
    :pswitch_13
    check-cast v0, Ly33;

    .line 618
    .line 619
    invoke-virtual {v0}, Ly33;->c()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    sget-object v2, Lif0;->j:Lif0;

    .line 624
    .line 625
    if-ne v1, v2, :cond_15

    .line 626
    .line 627
    iget-object v0, v0, Ly33;->d:Lnx1;

    .line 628
    .line 629
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    if-ne v0, v2, :cond_15

    .line 634
    .line 635
    move v3, v4

    .line 636
    :cond_15
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    return-object v0

    .line 641
    :pswitch_14
    return-object v5

    .line 642
    :pswitch_15
    check-cast v0, Lga;

    .line 643
    .line 644
    iget-object v0, v0, Lga;->j:Lj20;

    .line 645
    .line 646
    invoke-static {v0, v2}, Lte;->o(Lj20;Lxh1;)V

    .line 647
    .line 648
    .line 649
    return-object v5

    .line 650
    nop

    .line 651
    :pswitch_data_0
    .packed-switch 0x0
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
