.class public final Lk1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lk1;->ε:I

    iput-object p2, p0, Lk1;->ζ:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lbr1;Ll1;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lk1;->ε:I

    .line 3
    .line 4
    iput-object p1, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lk1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 7
    .line 8
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lj32;

    .line 11
    .line 12
    iget-object p0, p0, Lj32;->α:Landroid/view/View;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lh12;

    .line 22
    .line 23
    invoke-virtual {p0}, Lh12;->α()Lkq0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object v0, p0, Lkq0;->ε:Lyp0;

    .line 28
    .line 29
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lh21;

    .line 34
    .line 35
    iget-object v1, v1, Lh21;->ε:Lk21;

    .line 36
    .line 37
    iget v1, v1, Lk21;->η:I

    .line 38
    .line 39
    iget v2, p0, Lkq0;->ρ:I

    .line 40
    .line 41
    if-eq v2, v1, :cond_5

    .line 42
    .line 43
    iget-object p0, p0, Lkq0;->ι:Lb21;

    .line 44
    .line 45
    iget-object v1, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p0, p0, Lb21;->α:[J

    .line 48
    .line 49
    array-length v2, p0

    .line 50
    add-int/lit8 v2, v2, -0x2

    .line 51
    .line 52
    const/4 v3, 0x7

    .line 53
    const/4 v4, 0x0

    .line 54
    if-ltz v2, :cond_3

    .line 55
    .line 56
    move v5, v4

    .line 57
    :goto_0
    aget-wide v6, p0, v5

    .line 58
    .line 59
    not-long v8, v6

    .line 60
    shl-long/2addr v8, v3

    .line 61
    and-long/2addr v8, v6

    .line 62
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v8, v10

    .line 68
    cmp-long v8, v8, v10

    .line 69
    .line 70
    if-eqz v8, :cond_2

    .line 71
    .line 72
    sub-int v8, v5, v2

    .line 73
    .line 74
    not-int v8, v8

    .line 75
    ushr-int/lit8 v8, v8, 0x1f

    .line 76
    .line 77
    const/16 v9, 0x8

    .line 78
    .line 79
    rsub-int/lit8 v8, v8, 0x8

    .line 80
    .line 81
    move v10, v4

    .line 82
    :goto_1
    if-ge v10, v8, :cond_1

    .line 83
    .line 84
    const-wide/16 v11, 0xff

    .line 85
    .line 86
    and-long/2addr v11, v6

    .line 87
    const-wide/16 v13, 0x80

    .line 88
    .line 89
    cmp-long v11, v11, v13

    .line 90
    .line 91
    if-gez v11, :cond_0

    .line 92
    .line 93
    shl-int/lit8 v11, v5, 0x3

    .line 94
    .line 95
    add-int/2addr v11, v10

    .line 96
    aget-object v11, v1, v11

    .line 97
    .line 98
    check-cast v11, Ldq0;

    .line 99
    .line 100
    const/4 v12, 0x1

    .line 101
    iput-boolean v12, v11, Ldq0;->δ:Z

    .line 102
    .line 103
    :cond_0
    shr-long/2addr v6, v9

    .line 104
    add-int/lit8 v10, v10, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    if-ne v8, v9, :cond_3

    .line 108
    .line 109
    :cond_2
    if-eq v5, v2, :cond_3

    .line 110
    .line 111
    add-int/lit8 v5, v5, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    iget-object p0, v0, Lyp0;->μ:Lyp0;

    .line 115
    .line 116
    if-eqz p0, :cond_4

    .line 117
    .line 118
    iget-object p0, v0, Lyp0;->Λ:Lbq0;

    .line 119
    .line 120
    iget-boolean p0, p0, Lbq0;->ε:Z

    .line 121
    .line 122
    if-nez p0, :cond_5

    .line 123
    .line 124
    invoke-static {v0, v4, v3}, Lyp0;->Σ(Lyp0;ZI)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-virtual {v0}, Lyp0;->ο()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_5

    .line 133
    .line 134
    invoke-static {v0, v4, v3}, Lyp0;->Υ(Lyp0;ZI)V

    .line 135
    .line 136
    .line 137
    :cond_5
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_1
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Lol1;

    .line 143
    .line 144
    const/4 v0, 0x0

    .line 145
    iput-object v0, p0, Lol1;->θ:Lr0;

    .line 146
    .line 147
    const-string v0, "OnPositionedDispatch"

    .line 148
    .line 149
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :try_start_0
    invoke-virtual {p0}, Lol1;->α()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    sget-object p0, Ls62;->α:Ls62;

    .line 159
    .line 160
    return-object p0

    .line 161
    :catchall_0
    move-exception p0

    .line 162
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 163
    .line 164
    .line 165
    throw p0

    .line 166
    :pswitch_2
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Llr0;

    .line 169
    .line 170
    iget-object p0, p0, Llr0;->α:Ln;

    .line 171
    .line 172
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, Lvw0;

    .line 175
    .line 176
    iget-boolean v0, p0, Lvw0;->ζ:Z

    .line 177
    .line 178
    if-eqz v0, :cond_6

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    iget-boolean v0, p0, Lvw0;->η:Z

    .line 182
    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 186
    .line 187
    invoke-static {v0}, Lqi1;->α(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-virtual {p0}, Lvw0;->α()V

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Lvw0;->η:Z

    .line 195
    .line 196
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_3
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, Ldq0;

    .line 202
    .line 203
    iget-object v0, p0, Ldq0;->ζ:Lx91;

    .line 204
    .line 205
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_8

    .line 216
    .line 217
    iget-object p0, p0, Ldq0;->γ:Lzn;

    .line 218
    .line 219
    if-eqz p0, :cond_8

    .line 220
    .line 221
    invoke-virtual {p0}, Lzn;->λ()V

    .line 222
    .line 223
    .line 224
    :cond_8
    sget-object p0, Ls62;->α:Ls62;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_4
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p0, Lyp0;

    .line 230
    .line 231
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 232
    .line 233
    iget-object v0, p0, Lbq0;->π:Lox0;

    .line 234
    .line 235
    const/4 v1, 0x1

    .line 236
    iput-boolean v1, v0, Lox0;->Δ:Z

    .line 237
    .line 238
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 239
    .line 240
    if-eqz p0, :cond_9

    .line 241
    .line 242
    iput-boolean v1, p0, Ljw0;->ψ:Z

    .line 243
    .line 244
    :cond_9
    sget-object p0, Ls62;->α:Ls62;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_5
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Ln5;

    .line 250
    .line 251
    iget-object p0, p0, Ln5;->ζ:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p0, Landroid/view/View;

    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    const-string v0, "input_method"

    .line 260
    .line 261
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 269
    .line 270
    return-object p0

    .line 271
    :pswitch_6
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p0, Lc50;

    .line 274
    .line 275
    invoke-virtual {p0}, Lc50;->Д()Lz40;

    .line 276
    .line 277
    .line 278
    sget-object p0, Ls62;->α:Ls62;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_7
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p0, Lpn;

    .line 284
    .line 285
    const-wide/16 v0, 0x0

    .line 286
    .line 287
    invoke-static {v0, v1, v0, v1}, Lbn0;->α(JJ)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    iget-object p0, p0, Lpn;->α:Landroid/view/View;

    .line 292
    .line 293
    if-eqz v2, :cond_11

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    move-object v0, p0

    .line 300
    :goto_4
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 301
    .line 302
    const/4 v2, 0x0

    .line 303
    if-eqz v1, :cond_d

    .line 304
    .line 305
    instance-of v1, v0, Landroid/app/Activity;

    .line 306
    .line 307
    if-eqz v1, :cond_a

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_a
    instance-of v1, v0, Landroid/inputmethodservice/InputMethodService;

    .line 311
    .line 312
    if-eqz v1, :cond_b

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_b
    instance-of v1, v0, Landroid/app/Application;

    .line 316
    .line 317
    if-eqz v1, :cond_c

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_c
    check-cast v0, Landroid/content/ContextWrapper;

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-nez v1, :cond_e

    .line 327
    .line 328
    :cond_d
    move-object v0, v2

    .line 329
    goto :goto_5

    .line 330
    :cond_e
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    goto :goto_4

    .line 335
    :goto_5
    const-wide v1, 0xffffffffL

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    const/16 v3, 0x20

    .line 341
    .line 342
    if-eqz v0, :cond_10

    .line 343
    .line 344
    sget-object p0, Lvc2;->α:Luc2;

    .line 345
    .line 346
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    sget-object p0, Luc2;->β:Lwc2;

    .line 350
    .line 351
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-object v4, v0

    .line 355
    check-cast v4, Landroid/content/ContextWrapper;

    .line 356
    .line 357
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 358
    .line 359
    const/16 v6, 0x22

    .line 360
    .line 361
    if-lt v5, v6, :cond_f

    .line 362
    .line 363
    sget-object v5, Lyc2;->ε:Lyc2;

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_f
    sget-object v5, Lxn0;->Θ:Lxn0;

    .line 367
    .line 368
    :goto_6
    iget-object p0, p0, Lwc2;->β:Lx;

    .line 369
    .line 370
    invoke-interface {v5, v4, p0}, Lxc2;->γ(Landroid/content/ContextWrapper;Lx;)Ltc2;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-virtual {p0}, Ltc2;->α()Landroid/graphics/Rect;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    invoke-virtual {p0}, Ltc2;->α()Landroid/graphics/Rect;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 387
    .line 388
    .line 389
    move-result p0

    .line 390
    int-to-long v4, v4

    .line 391
    shl-long v3, v4, v3

    .line 392
    .line 393
    int-to-long v5, p0

    .line 394
    and-long/2addr v1, v5

    .line 395
    or-long/2addr v1, v3

    .line 396
    invoke-static {v0}, Ljx0;->α(Landroid/content/Context;)Las;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-static {v1, v2}, Ls1;->Ζ(J)J

    .line 401
    .line 402
    .line 403
    move-result-wide v3

    .line 404
    invoke-interface {p0, v3, v4}, Lyr;->τ(J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v3

    .line 408
    new-instance p0, Lcs;

    .line 409
    .line 410
    invoke-direct {p0, v1, v2, v3, v4}, Lcs;-><init>(JJ)V

    .line 411
    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_10
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {p0}, Ljx0;->α(Landroid/content/Context;)Las;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    iget v4, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 427
    .line 428
    int-to-float v4, v4

    .line 429
    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 430
    .line 431
    int-to-float v0, v0

    .line 432
    invoke-static {v4, v0}, Ls1;->α(FF)J

    .line 433
    .line 434
    .line 435
    move-result-wide v4

    .line 436
    invoke-interface {p0, v4, v5}, Lyr;->Ψ(J)J

    .line 437
    .line 438
    .line 439
    move-result-wide v6

    .line 440
    shr-long v8, v6, v3

    .line 441
    .line 442
    long-to-int p0, v8

    .line 443
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    float-to-int p0, p0

    .line 448
    and-long/2addr v6, v1

    .line 449
    long-to-int v0, v6

    .line 450
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    float-to-int v0, v0

    .line 455
    int-to-long v6, p0

    .line 456
    shl-long/2addr v6, v3

    .line 457
    int-to-long v8, v0

    .line 458
    and-long v0, v8, v1

    .line 459
    .line 460
    or-long/2addr v0, v6

    .line 461
    new-instance p0, Lcs;

    .line 462
    .line 463
    invoke-direct {p0, v0, v1, v4, v5}, Lcs;-><init>(JJ)V

    .line 464
    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-static {p0}, Ljx0;->α(Landroid/content/Context;)Las;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-static {v0, v1}, Ls1;->Ζ(J)J

    .line 476
    .line 477
    .line 478
    move-result-wide v2

    .line 479
    invoke-interface {p0, v2, v3}, Lyr;->τ(J)J

    .line 480
    .line 481
    .line 482
    move-result-wide v2

    .line 483
    new-instance p0, Lcs;

    .line 484
    .line 485
    invoke-direct {p0, v0, v1, v2, v3}, Lcs;-><init>(JJ)V

    .line 486
    .line 487
    .line 488
    :goto_7
    return-object p0

    .line 489
    :pswitch_8
    iget-object p0, p0, Lk1;->ζ:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast p0, Lbr1;

    .line 492
    .line 493
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object p0, Ls62;->α:Ls62;

    .line 497
    .line 498
    return-object p0

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
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
