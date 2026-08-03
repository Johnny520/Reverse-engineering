.class public final synthetic Lh0/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lh0/f;->h:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 11
    iput p3, p0, Lh0/f;->g:I

    iput-boolean p1, p0, Lh0/f;->h:Z

    iput-object p2, p0, Lh0/f;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lh0/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    check-cast p1, Lr/d;

    .line 11
    .line 12
    check-cast p2, Li0/h0;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 p1, p3, 0x11

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    if-eq p1, v1, :cond_0

    .line 29
    .line 30
    move p1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    and-int/2addr p3, v2

    .line 34
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    new-instance p1, Lw/v;

    .line 41
    .line 42
    const/4 p3, 0x4

    .line 43
    iget-boolean v1, p0, Lh0/f;->h:Z

    .line 44
    .line 45
    invoke-direct {p1, v1, v0, p3}, Lw/v;-><init>(ZLjava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    const p3, 0x525a9c64

    .line 49
    .line 50
    .line 51
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const/16 p3, 0x30

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {v0, p1, p2, p3, v2}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 63
    .line 64
    .line 65
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_0
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    check-cast p1, Lr/d;

    .line 73
    .line 74
    check-cast p2, Li0/h0;

    .line 75
    .line 76
    check-cast p3, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    and-int/lit8 p1, p3, 0x11

    .line 86
    .line 87
    const/16 v1, 0x10

    .line 88
    .line 89
    const/4 v2, 0x1

    .line 90
    if-eq p1, v1, :cond_2

    .line 91
    .line 92
    move p1, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    const/4 p1, 0x0

    .line 95
    :goto_2
    and-int/2addr p3, v2

    .line 96
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    new-instance p1, Lw/v;

    .line 103
    .line 104
    const/4 p3, 0x2

    .line 105
    iget-boolean v1, p0, Lh0/f;->h:Z

    .line 106
    .line 107
    invoke-direct {p1, v1, v0, p3}, Lw/v;-><init>(ZLjava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    const p3, -0x579ce9f5

    .line 111
    .line 112
    .line 113
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const/16 p3, 0x30

    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    invoke-static {v0, p1, p2, p3, v2}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 125
    .line 126
    .line 127
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object p1

    .line 130
    :pswitch_1
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Le9/c;

    .line 133
    .line 134
    check-cast p1, Lr/d;

    .line 135
    .line 136
    check-cast p2, Li0/h0;

    .line 137
    .line 138
    check-cast p3, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    and-int/lit8 p1, p3, 0x11

    .line 148
    .line 149
    const/16 v1, 0x10

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    if-eq p1, v1, :cond_4

    .line 153
    .line 154
    move p1, v2

    .line 155
    goto :goto_4

    .line 156
    :cond_4
    const/4 p1, 0x0

    .line 157
    :goto_4
    and-int/2addr p3, v2

    .line 158
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    new-instance p1, Lw/v;

    .line 165
    .line 166
    const/4 p3, 0x3

    .line 167
    iget-boolean v1, p0, Lh0/f;->h:Z

    .line 168
    .line 169
    invoke-direct {p1, v1, v0, p3}, Lw/v;-><init>(ZLjava/lang/Object;I)V

    .line 170
    .line 171
    .line 172
    const p3, -0x4d001da5

    .line 173
    .line 174
    .line 175
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const/16 p3, 0x30

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-static {v0, p1, p2, p3, v2}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 187
    .line 188
    .line 189
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_2
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lfg/l;

    .line 195
    .line 196
    check-cast p1, Lr/d;

    .line 197
    .line 198
    check-cast p2, Li0/h0;

    .line 199
    .line 200
    check-cast p3, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    and-int/lit8 p1, p3, 0x11

    .line 210
    .line 211
    const/16 v1, 0x10

    .line 212
    .line 213
    const/4 v2, 0x1

    .line 214
    if-eq p1, v1, :cond_6

    .line 215
    .line 216
    move p1, v2

    .line 217
    goto :goto_6

    .line 218
    :cond_6
    const/4 p1, 0x0

    .line 219
    :goto_6
    and-int/2addr p3, v2

    .line 220
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_7

    .line 225
    .line 226
    new-instance p1, Lw/v;

    .line 227
    .line 228
    const/4 p3, 0x1

    .line 229
    iget-boolean v1, p0, Lh0/f;->h:Z

    .line 230
    .line 231
    invoke-direct {p1, v1, v0, p3}, Lw/v;-><init>(ZLjava/lang/Object;I)V

    .line 232
    .line 233
    .line 234
    const p3, 0x2a624025

    .line 235
    .line 236
    .line 237
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    const/16 p3, 0x30

    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-static {v0, p1, p2, p3, v2}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 249
    .line 250
    .line 251
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 252
    .line 253
    return-object p1

    .line 254
    :pswitch_3
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Lw/j1;

    .line 257
    .line 258
    iget-object v1, v0, Lw/j1;->f:Li0/j1;

    .line 259
    .line 260
    check-cast p1, Ly0/o;

    .line 261
    .line 262
    check-cast p2, Li0/h0;

    .line 263
    .line 264
    check-cast p3, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    const p1, -0x7f685f60

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2, p1}, Li0/h0;->a0(I)V

    .line 273
    .line 274
    .line 275
    sget-object p1, Ly1/h1;->n:Li0/m2;

    .line 276
    .line 277
    invoke-virtual {p2, p1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    sget-object p3, Lu2/m;->h:Lu2/m;

    .line 282
    .line 283
    const/4 v2, 0x1

    .line 284
    const/4 v3, 0x0

    .line 285
    if-ne p1, p3, :cond_8

    .line 286
    .line 287
    move p1, v2

    .line 288
    goto :goto_8

    .line 289
    :cond_8
    move p1, v3

    .line 290
    :goto_8
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p3

    .line 294
    check-cast p3, Lm/p1;

    .line 295
    .line 296
    sget-object v4, Lm/p1;->g:Lm/p1;

    .line 297
    .line 298
    if-eq p3, v4, :cond_a

    .line 299
    .line 300
    if-nez p1, :cond_9

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_9
    move p1, v3

    .line 304
    goto :goto_a

    .line 305
    :cond_a
    :goto_9
    move p1, v2

    .line 306
    :goto_a
    invoke-virtual {p2, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p3

    .line 310
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    sget-object v5, Li0/l;->a:Li0/e;

    .line 315
    .line 316
    if-nez p3, :cond_b

    .line 317
    .line 318
    if-ne v4, v5, :cond_c

    .line 319
    .line 320
    :cond_b
    new-instance v4, Lnb/a;

    .line 321
    .line 322
    const/16 p3, 0x15

    .line 323
    .line 324
    invoke-direct {v4, v0, p3}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_c
    check-cast v4, Lfg/l;

    .line 331
    .line 332
    invoke-static {v4, p2}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 333
    .line 334
    .line 335
    move-result-object p3

    .line 336
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    if-ne v4, v5, :cond_d

    .line 341
    .line 342
    new-instance v4, Lb0/l;

    .line 343
    .line 344
    const/16 v6, 0x9

    .line 345
    .line 346
    invoke-direct {v4, p3, v6}, Lb0/l;-><init>(Li0/a1;I)V

    .line 347
    .line 348
    .line 349
    new-instance p3, Lm/r;

    .line 350
    .line 351
    invoke-direct {p3, v4}, Lm/r;-><init>(Lfg/l;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p2, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    move-object v4, p3

    .line 358
    :cond_d
    check-cast v4, Lm/i2;

    .line 359
    .line 360
    invoke-virtual {p2, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result p3

    .line 364
    invoke-virtual {p2, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    or-int/2addr p3, v6

    .line 369
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    if-nez p3, :cond_e

    .line 374
    .line 375
    if-ne v6, v5, :cond_f

    .line 376
    .line 377
    :cond_e
    new-instance v6, Lw/i1;

    .line 378
    .line 379
    invoke-direct {v6, v4, v0}, Lw/i1;-><init>(Lm/i2;Lw/j1;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p2, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :cond_f
    check-cast v6, Lw/i1;

    .line 386
    .line 387
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p3

    .line 391
    check-cast p3, Lm/p1;

    .line 392
    .line 393
    iget-boolean v1, p0, Lh0/f;->h:Z

    .line 394
    .line 395
    if-eqz v1, :cond_10

    .line 396
    .line 397
    iget-object v0, v0, Lw/j1;->b:Li0/f1;

    .line 398
    .line 399
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    const/4 v1, 0x0

    .line 404
    cmpg-float v0, v0, v1

    .line 405
    .line 406
    if-nez v0, :cond_11

    .line 407
    .line 408
    :cond_10
    move v2, v3

    .line 409
    :cond_11
    invoke-static {v6, p3, v2, p1}, Lm/a2;->b(Lw/i1;Lm/p1;ZZ)Ly0/o;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 414
    .line 415
    .line 416
    return-object p1

    .line 417
    :pswitch_4
    iget-object v0, p0, Lh0/f;->i:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lfg/a;

    .line 420
    .line 421
    check-cast p1, Ly0/o;

    .line 422
    .line 423
    check-cast p2, Li0/h0;

    .line 424
    .line 425
    check-cast p3, Ljava/lang/Integer;

    .line 426
    .line 427
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    const p3, -0xbba9706

    .line 431
    .line 432
    .line 433
    invoke-virtual {p2, p3}, Li0/h0;->a0(I)V

    .line 434
    .line 435
    .line 436
    sget-object p3, Lh0/l1;->a:Li0/u;

    .line 437
    .line 438
    invoke-virtual {p2, p3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p3

    .line 442
    check-cast p3, Lh0/k1;

    .line 443
    .line 444
    iget-wide v1, p3, Lh0/k1;->a:J

    .line 445
    .line 446
    invoke-virtual {p2, v1, v2}, Li0/h0;->e(J)Z

    .line 447
    .line 448
    .line 449
    move-result p3

    .line 450
    invoke-virtual {p2, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    or-int/2addr p3, v3

    .line 455
    iget-boolean v3, p0, Lh0/f;->h:Z

    .line 456
    .line 457
    invoke-virtual {p2, v3}, Li0/h0;->g(Z)Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    or-int/2addr p3, v4

    .line 462
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    if-nez p3, :cond_12

    .line 467
    .line 468
    sget-object p3, Li0/l;->a:Li0/e;

    .line 469
    .line 470
    if-ne v4, p3, :cond_13

    .line 471
    .line 472
    :cond_12
    new-instance v4, Lh0/g;

    .line 473
    .line 474
    invoke-direct {v4, v1, v2, v0, v3}, Lh0/g;-><init>(JLfg/a;Z)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {p2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_13
    check-cast v4, Lfg/l;

    .line 481
    .line 482
    invoke-static {p1, v4}, Lc1/h;->e(Ly0/o;Lfg/l;)Ly0/o;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    const/4 p3, 0x0

    .line 487
    invoke-virtual {p2, p3}, Li0/h0;->p(Z)V

    .line 488
    .line 489
    .line 490
    return-object p1

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
