.class public final synthetic Lwb/t1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/t1;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/t1;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/t1;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/t1;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v9, p2

    .line 9
    check-cast v9, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v0, p3

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 p1, v0, 0x11

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v12, 0x1

    .line 28
    if-eq p1, v1, :cond_0

    .line 29
    .line 30
    move p1, v12

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move p1, v2

    .line 33
    :goto_0
    and-int/2addr v0, v12

    .line 34
    invoke-virtual {v9, v0, p1}, Li0/h0;->S(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    sget-object p1, Lp/j;->c:Lp/e;

    .line 41
    .line 42
    sget-object v0, Ly0/b;->s:Ly0/e;

    .line 43
    .line 44
    invoke-static {p1, v0, v9, v2}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-wide v0, v9, Li0/h0;->T:J

    .line 49
    .line 50
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 59
    .line 60
    invoke-static {v9, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 70
    .line 71
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 72
    .line 73
    .line 74
    iget-boolean v6, v9, Li0/h0;->S:Z

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    invoke-virtual {v9, v5}, Li0/h0;->k(Lfg/a;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 86
    .line 87
    invoke-static {v5, v9, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lx1/f;->d:Lx1/e;

    .line 91
    .line 92
    invoke-static {p1, v9, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 100
    .line 101
    invoke-static {v0, v9, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Lx1/f;->g:Lx1/d;

    .line 105
    .line 106
    invoke-static {p1, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Lx1/f;->c:Lx1/e;

    .line 110
    .line 111
    invoke-static {p1, v9, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lwb/t1;->h:Li0/a1;

    .line 115
    .line 116
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {p1, v9, v2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    sget-object v0, Li0/l;->a:Li0/e;

    .line 130
    .line 131
    if-ne p1, v0, :cond_2

    .line 132
    .line 133
    new-instance p1, Lwb/gl;

    .line 134
    .line 135
    const/16 v0, 0x1d

    .line 136
    .line 137
    iget-object v1, p0, Lwb/t1;->i:Li0/a1;

    .line 138
    .line 139
    invoke-direct {p1, v1, v0}, Lwb/gl;-><init>(Li0/a1;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    move-object v1, p1

    .line 146
    check-cast v1, Lfg/a;

    .line 147
    .line 148
    const/high16 p1, 0x3f800000    # 1.0f

    .line 149
    .line 150
    invoke-static {v3, p1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v9}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    const/16 v10, 0x1b6

    .line 159
    .line 160
    const/16 v11, 0x778

    .line 161
    .line 162
    const-string v0, "\u91cd\u8bd5"

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    const/4 v4, 0x0

    .line 166
    const/4 v5, 0x0

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v8, 0x0

    .line 169
    invoke-static/range {v0 .. v11}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9, v12}, Li0/h0;->p(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_3
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 177
    .line 178
    .line 179
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 180
    .line 181
    return-object p1

    .line 182
    :pswitch_0
    move-object v0, p2

    .line 183
    check-cast v0, Li0/h0;

    .line 184
    .line 185
    move-object/from16 v1, p3

    .line 186
    .line 187
    check-cast v1, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    and-int/lit8 p1, v1, 0x11

    .line 197
    .line 198
    const/16 v2, 0x10

    .line 199
    .line 200
    const/4 v3, 0x1

    .line 201
    if-eq p1, v2, :cond_4

    .line 202
    .line 203
    move p1, v3

    .line 204
    goto :goto_3

    .line 205
    :cond_4
    const/4 p1, 0x0

    .line 206
    :goto_3
    and-int/2addr v1, v3

    .line 207
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_5

    .line 212
    .line 213
    new-instance p1, Lwb/a2;

    .line 214
    .line 215
    const/16 v1, 0x1a

    .line 216
    .line 217
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 218
    .line 219
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 220
    .line 221
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 222
    .line 223
    .line 224
    const v1, 0x1935ee2e

    .line 225
    .line 226
    .line 227
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const/16 v1, 0x30

    .line 232
    .line 233
    const/4 v2, 0x0

    .line 234
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_5
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 239
    .line 240
    .line 241
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 242
    .line 243
    return-object p1

    .line 244
    :pswitch_1
    move-object v0, p2

    .line 245
    check-cast v0, Li0/h0;

    .line 246
    .line 247
    move-object/from16 v1, p3

    .line 248
    .line 249
    check-cast v1, Ljava/lang/Integer;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    and-int/lit8 p1, v1, 0x11

    .line 259
    .line 260
    const/16 v2, 0x10

    .line 261
    .line 262
    const/4 v3, 0x1

    .line 263
    if-eq p1, v2, :cond_6

    .line 264
    .line 265
    move p1, v3

    .line 266
    goto :goto_5

    .line 267
    :cond_6
    const/4 p1, 0x0

    .line 268
    :goto_5
    and-int/2addr v1, v3

    .line 269
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_7

    .line 274
    .line 275
    new-instance p1, Lwb/a2;

    .line 276
    .line 277
    const/16 v1, 0x19

    .line 278
    .line 279
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 280
    .line 281
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 282
    .line 283
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 284
    .line 285
    .line 286
    const v1, -0x410308a9

    .line 287
    .line 288
    .line 289
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const/16 v1, 0x30

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_7
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 301
    .line 302
    .line 303
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 304
    .line 305
    return-object p1

    .line 306
    :pswitch_2
    move-object v0, p2

    .line 307
    check-cast v0, Li0/h0;

    .line 308
    .line 309
    move-object/from16 v1, p3

    .line 310
    .line 311
    check-cast v1, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    and-int/lit8 p1, v1, 0x11

    .line 321
    .line 322
    const/16 v2, 0x10

    .line 323
    .line 324
    const/4 v3, 0x1

    .line 325
    if-eq p1, v2, :cond_8

    .line 326
    .line 327
    move p1, v3

    .line 328
    goto :goto_7

    .line 329
    :cond_8
    const/4 p1, 0x0

    .line 330
    :goto_7
    and-int/2addr v1, v3

    .line 331
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-eqz p1, :cond_9

    .line 336
    .line 337
    new-instance p1, Lwb/a2;

    .line 338
    .line 339
    const/4 v1, 0x1

    .line 340
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 341
    .line 342
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 343
    .line 344
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 345
    .line 346
    .line 347
    const v1, 0x134b54f3

    .line 348
    .line 349
    .line 350
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    const/16 v1, 0x30

    .line 355
    .line 356
    const/4 v2, 0x0

    .line 357
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_9
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 362
    .line 363
    .line 364
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 365
    .line 366
    return-object p1

    .line 367
    :pswitch_3
    move-object v0, p2

    .line 368
    check-cast v0, Li0/h0;

    .line 369
    .line 370
    move-object/from16 v1, p3

    .line 371
    .line 372
    check-cast v1, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    and-int/lit8 p1, v1, 0x11

    .line 382
    .line 383
    const/16 v2, 0x10

    .line 384
    .line 385
    const/4 v3, 0x1

    .line 386
    if-eq p1, v2, :cond_a

    .line 387
    .line 388
    move p1, v3

    .line 389
    goto :goto_9

    .line 390
    :cond_a
    const/4 p1, 0x0

    .line 391
    :goto_9
    and-int/2addr v1, v3

    .line 392
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_b

    .line 397
    .line 398
    new-instance p1, Lwb/a2;

    .line 399
    .line 400
    const/4 v1, 0x2

    .line 401
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 402
    .line 403
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 404
    .line 405
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 406
    .line 407
    .line 408
    const v1, 0x503c67ce

    .line 409
    .line 410
    .line 411
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    const/16 v1, 0x30

    .line 416
    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 419
    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_b
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 423
    .line 424
    .line 425
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 426
    .line 427
    return-object p1

    .line 428
    :pswitch_4
    move-object v0, p2

    .line 429
    check-cast v0, Li0/h0;

    .line 430
    .line 431
    move-object/from16 v1, p3

    .line 432
    .line 433
    check-cast v1, Ljava/lang/Integer;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    and-int/lit8 p1, v1, 0x11

    .line 443
    .line 444
    const/16 v2, 0x10

    .line 445
    .line 446
    const/4 v3, 0x1

    .line 447
    if-eq p1, v2, :cond_c

    .line 448
    .line 449
    move p1, v3

    .line 450
    goto :goto_b

    .line 451
    :cond_c
    const/4 p1, 0x0

    .line 452
    :goto_b
    and-int/2addr v1, v3

    .line 453
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    if-eqz p1, :cond_d

    .line 458
    .line 459
    new-instance p1, Lwb/a2;

    .line 460
    .line 461
    const/16 v1, 0x17

    .line 462
    .line 463
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 464
    .line 465
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 466
    .line 467
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 468
    .line 469
    .line 470
    const v1, -0x32dd8cce

    .line 471
    .line 472
    .line 473
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    const/16 v1, 0x30

    .line 478
    .line 479
    const/4 v2, 0x0

    .line 480
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 481
    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 485
    .line 486
    .line 487
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 488
    .line 489
    return-object p1

    .line 490
    :pswitch_5
    move-object v0, p2

    .line 491
    check-cast v0, Li0/h0;

    .line 492
    .line 493
    move-object/from16 v1, p3

    .line 494
    .line 495
    check-cast v1, Ljava/lang/Integer;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    and-int/lit8 p1, v1, 0x11

    .line 505
    .line 506
    const/16 v2, 0x10

    .line 507
    .line 508
    const/4 v3, 0x1

    .line 509
    if-eq p1, v2, :cond_e

    .line 510
    .line 511
    move p1, v3

    .line 512
    goto :goto_d

    .line 513
    :cond_e
    const/4 p1, 0x0

    .line 514
    :goto_d
    and-int/2addr v1, v3

    .line 515
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 516
    .line 517
    .line 518
    move-result p1

    .line 519
    if-eqz p1, :cond_f

    .line 520
    .line 521
    new-instance p1, Lwb/a2;

    .line 522
    .line 523
    const/16 v1, 0x16

    .line 524
    .line 525
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 526
    .line 527
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 528
    .line 529
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 530
    .line 531
    .line 532
    const v1, 0x303db4cc

    .line 533
    .line 534
    .line 535
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    const/16 v1, 0x30

    .line 540
    .line 541
    const/4 v2, 0x0

    .line 542
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 543
    .line 544
    .line 545
    goto :goto_e

    .line 546
    :cond_f
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 547
    .line 548
    .line 549
    :goto_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 550
    .line 551
    return-object p1

    .line 552
    :pswitch_6
    move-object v0, p2

    .line 553
    check-cast v0, Li0/h0;

    .line 554
    .line 555
    move-object/from16 v1, p3

    .line 556
    .line 557
    check-cast v1, Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    and-int/lit8 p1, v1, 0x11

    .line 567
    .line 568
    const/16 v2, 0x10

    .line 569
    .line 570
    const/4 v3, 0x1

    .line 571
    if-eq p1, v2, :cond_10

    .line 572
    .line 573
    move p1, v3

    .line 574
    goto :goto_f

    .line 575
    :cond_10
    const/4 p1, 0x0

    .line 576
    :goto_f
    and-int/2addr v1, v3

    .line 577
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 578
    .line 579
    .line 580
    move-result p1

    .line 581
    if-eqz p1, :cond_11

    .line 582
    .line 583
    new-instance p1, Lwb/a2;

    .line 584
    .line 585
    const/16 v1, 0x15

    .line 586
    .line 587
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 588
    .line 589
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 590
    .line 591
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 592
    .line 593
    .line 594
    const v1, -0x43bd5f9a

    .line 595
    .line 596
    .line 597
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 598
    .line 599
    .line 600
    move-result-object p1

    .line 601
    const/16 v1, 0x30

    .line 602
    .line 603
    const/4 v2, 0x0

    .line 604
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 605
    .line 606
    .line 607
    goto :goto_10

    .line 608
    :cond_11
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 609
    .line 610
    .line 611
    :goto_10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 612
    .line 613
    return-object p1

    .line 614
    :pswitch_7
    move-object v0, p2

    .line 615
    check-cast v0, Li0/h0;

    .line 616
    .line 617
    move-object/from16 v1, p3

    .line 618
    .line 619
    check-cast v1, Ljava/lang/Integer;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    and-int/lit8 p1, v1, 0x11

    .line 629
    .line 630
    const/16 v2, 0x10

    .line 631
    .line 632
    const/4 v3, 0x1

    .line 633
    if-eq p1, v2, :cond_12

    .line 634
    .line 635
    move p1, v3

    .line 636
    goto :goto_11

    .line 637
    :cond_12
    const/4 p1, 0x0

    .line 638
    :goto_11
    and-int/2addr v1, v3

    .line 639
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 640
    .line 641
    .line 642
    move-result p1

    .line 643
    if-eqz p1, :cond_13

    .line 644
    .line 645
    new-instance p1, Lwb/a2;

    .line 646
    .line 647
    const/16 v1, 0x18

    .line 648
    .line 649
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 650
    .line 651
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 652
    .line 653
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 654
    .line 655
    .line 656
    const v1, 0x7d4a01e4

    .line 657
    .line 658
    .line 659
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    const/16 v1, 0x30

    .line 664
    .line 665
    const/4 v2, 0x0

    .line 666
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 667
    .line 668
    .line 669
    goto :goto_12

    .line 670
    :cond_13
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 671
    .line 672
    .line 673
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 674
    .line 675
    return-object p1

    .line 676
    :pswitch_8
    move-object v0, p2

    .line 677
    check-cast v0, Li0/h0;

    .line 678
    .line 679
    move-object/from16 v1, p3

    .line 680
    .line 681
    check-cast v1, Ljava/lang/Integer;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    and-int/lit8 p1, v1, 0x11

    .line 691
    .line 692
    const/16 v2, 0x10

    .line 693
    .line 694
    const/4 v3, 0x1

    .line 695
    if-eq p1, v2, :cond_14

    .line 696
    .line 697
    move p1, v3

    .line 698
    goto :goto_13

    .line 699
    :cond_14
    const/4 p1, 0x0

    .line 700
    :goto_13
    and-int/2addr v1, v3

    .line 701
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 702
    .line 703
    .line 704
    move-result p1

    .line 705
    if-eqz p1, :cond_15

    .line 706
    .line 707
    new-instance p1, Lwb/a2;

    .line 708
    .line 709
    const/16 v1, 0x9

    .line 710
    .line 711
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 712
    .line 713
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 714
    .line 715
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 716
    .line 717
    .line 718
    const v1, -0x19d2a211

    .line 719
    .line 720
    .line 721
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 722
    .line 723
    .line 724
    move-result-object p1

    .line 725
    const/16 v1, 0x30

    .line 726
    .line 727
    const/4 v2, 0x0

    .line 728
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 729
    .line 730
    .line 731
    goto :goto_14

    .line 732
    :cond_15
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 733
    .line 734
    .line 735
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 736
    .line 737
    return-object p1

    .line 738
    :pswitch_9
    move-object v0, p2

    .line 739
    check-cast v0, Li0/h0;

    .line 740
    .line 741
    move-object/from16 v1, p3

    .line 742
    .line 743
    check-cast v1, Ljava/lang/Integer;

    .line 744
    .line 745
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    and-int/lit8 p1, v1, 0x11

    .line 753
    .line 754
    const/16 v2, 0x10

    .line 755
    .line 756
    const/4 v3, 0x1

    .line 757
    if-eq p1, v2, :cond_16

    .line 758
    .line 759
    move p1, v3

    .line 760
    goto :goto_15

    .line 761
    :cond_16
    const/4 p1, 0x0

    .line 762
    :goto_15
    and-int/2addr v1, v3

    .line 763
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 764
    .line 765
    .line 766
    move-result p1

    .line 767
    if-eqz p1, :cond_17

    .line 768
    .line 769
    new-instance p1, Lwb/a2;

    .line 770
    .line 771
    const/16 v1, 0x14

    .line 772
    .line 773
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 774
    .line 775
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 776
    .line 777
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 778
    .line 779
    .line 780
    const v1, -0x6339a603

    .line 781
    .line 782
    .line 783
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 784
    .line 785
    .line 786
    move-result-object p1

    .line 787
    const/16 v1, 0x30

    .line 788
    .line 789
    const/4 v2, 0x0

    .line 790
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 791
    .line 792
    .line 793
    goto :goto_16

    .line 794
    :cond_17
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 795
    .line 796
    .line 797
    :goto_16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 798
    .line 799
    return-object p1

    .line 800
    :pswitch_a
    move-object v0, p2

    .line 801
    check-cast v0, Li0/h0;

    .line 802
    .line 803
    move-object/from16 v1, p3

    .line 804
    .line 805
    check-cast v1, Ljava/lang/Integer;

    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    and-int/lit8 p1, v1, 0x11

    .line 815
    .line 816
    const/16 v2, 0x10

    .line 817
    .line 818
    const/4 v3, 0x1

    .line 819
    if-eq p1, v2, :cond_18

    .line 820
    .line 821
    move p1, v3

    .line 822
    goto :goto_17

    .line 823
    :cond_18
    const/4 p1, 0x0

    .line 824
    :goto_17
    and-int/2addr v1, v3

    .line 825
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 826
    .line 827
    .line 828
    move-result p1

    .line 829
    if-eqz p1, :cond_19

    .line 830
    .line 831
    new-instance p1, Lwb/a2;

    .line 832
    .line 833
    const/16 v1, 0xe

    .line 834
    .line 835
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 836
    .line 837
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 838
    .line 839
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 840
    .line 841
    .line 842
    const v1, 0x7b01bbfb

    .line 843
    .line 844
    .line 845
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    const/16 v1, 0x30

    .line 850
    .line 851
    const/4 v2, 0x0

    .line 852
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 853
    .line 854
    .line 855
    goto :goto_18

    .line 856
    :cond_19
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 857
    .line 858
    .line 859
    :goto_18
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 860
    .line 861
    return-object p1

    .line 862
    :pswitch_b
    move-object v0, p2

    .line 863
    check-cast v0, Li0/h0;

    .line 864
    .line 865
    move-object/from16 v1, p3

    .line 866
    .line 867
    check-cast v1, Ljava/lang/Integer;

    .line 868
    .line 869
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    and-int/lit8 p1, v1, 0x11

    .line 877
    .line 878
    const/16 v2, 0x10

    .line 879
    .line 880
    const/4 v3, 0x1

    .line 881
    if-eq p1, v2, :cond_1a

    .line 882
    .line 883
    move p1, v3

    .line 884
    goto :goto_19

    .line 885
    :cond_1a
    const/4 p1, 0x0

    .line 886
    :goto_19
    and-int/2addr v1, v3

    .line 887
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 888
    .line 889
    .line 890
    move-result p1

    .line 891
    if-eqz p1, :cond_1b

    .line 892
    .line 893
    new-instance p1, Lwb/a2;

    .line 894
    .line 895
    const/4 v1, 0x7

    .line 896
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 897
    .line 898
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 899
    .line 900
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 901
    .line 902
    .line 903
    const v1, -0x7e8e4f26

    .line 904
    .line 905
    .line 906
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 907
    .line 908
    .line 909
    move-result-object p1

    .line 910
    const/16 v1, 0x30

    .line 911
    .line 912
    const/4 v2, 0x0

    .line 913
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 914
    .line 915
    .line 916
    goto :goto_1a

    .line 917
    :cond_1b
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 918
    .line 919
    .line 920
    :goto_1a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 921
    .line 922
    return-object p1

    .line 923
    :pswitch_c
    move-object v0, p2

    .line 924
    check-cast v0, Li0/h0;

    .line 925
    .line 926
    move-object/from16 v1, p3

    .line 927
    .line 928
    check-cast v1, Ljava/lang/Integer;

    .line 929
    .line 930
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 931
    .line 932
    .line 933
    move-result v1

    .line 934
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    and-int/lit8 p1, v1, 0x11

    .line 938
    .line 939
    const/16 v2, 0x10

    .line 940
    .line 941
    const/4 v3, 0x1

    .line 942
    if-eq p1, v2, :cond_1c

    .line 943
    .line 944
    move p1, v3

    .line 945
    goto :goto_1b

    .line 946
    :cond_1c
    const/4 p1, 0x0

    .line 947
    :goto_1b
    and-int/2addr v1, v3

    .line 948
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 949
    .line 950
    .line 951
    move-result p1

    .line 952
    if-eqz p1, :cond_1d

    .line 953
    .line 954
    new-instance p1, Lwb/a2;

    .line 955
    .line 956
    const/16 v1, 0xb

    .line 957
    .line 958
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 959
    .line 960
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 961
    .line 962
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 963
    .line 964
    .line 965
    const v1, 0x20a2101c

    .line 966
    .line 967
    .line 968
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 969
    .line 970
    .line 971
    move-result-object p1

    .line 972
    const/16 v1, 0x30

    .line 973
    .line 974
    const/4 v2, 0x0

    .line 975
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 976
    .line 977
    .line 978
    goto :goto_1c

    .line 979
    :cond_1d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 980
    .line 981
    .line 982
    :goto_1c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 983
    .line 984
    return-object p1

    .line 985
    :pswitch_d
    move-object v0, p2

    .line 986
    check-cast v0, Li0/h0;

    .line 987
    .line 988
    move-object/from16 v1, p3

    .line 989
    .line 990
    check-cast v1, Ljava/lang/Integer;

    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    and-int/lit8 p1, v1, 0x11

    .line 1000
    .line 1001
    const/16 v2, 0x10

    .line 1002
    .line 1003
    const/4 v3, 0x1

    .line 1004
    if-eq p1, v2, :cond_1e

    .line 1005
    .line 1006
    move p1, v3

    .line 1007
    goto :goto_1d

    .line 1008
    :cond_1e
    const/4 p1, 0x0

    .line 1009
    :goto_1d
    and-int/2addr v1, v3

    .line 1010
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1011
    .line 1012
    .line 1013
    move-result p1

    .line 1014
    if-eqz p1, :cond_1f

    .line 1015
    .line 1016
    new-instance p1, Lwb/a2;

    .line 1017
    .line 1018
    const/16 v1, 0x10

    .line 1019
    .line 1020
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1021
    .line 1022
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1023
    .line 1024
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1025
    .line 1026
    .line 1027
    const v1, -0x402d90a2

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1031
    .line 1032
    .line 1033
    move-result-object p1

    .line 1034
    const/16 v1, 0x30

    .line 1035
    .line 1036
    const/4 v2, 0x0

    .line 1037
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1038
    .line 1039
    .line 1040
    goto :goto_1e

    .line 1041
    :cond_1f
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1042
    .line 1043
    .line 1044
    :goto_1e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1045
    .line 1046
    return-object p1

    .line 1047
    :pswitch_e
    move-object v0, p2

    .line 1048
    check-cast v0, Li0/h0;

    .line 1049
    .line 1050
    move-object/from16 v1, p3

    .line 1051
    .line 1052
    check-cast v1, Ljava/lang/Integer;

    .line 1053
    .line 1054
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1055
    .line 1056
    .line 1057
    move-result v1

    .line 1058
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    and-int/lit8 p1, v1, 0x11

    .line 1062
    .line 1063
    const/16 v2, 0x10

    .line 1064
    .line 1065
    const/4 v3, 0x1

    .line 1066
    if-eq p1, v2, :cond_20

    .line 1067
    .line 1068
    move p1, v3

    .line 1069
    goto :goto_1f

    .line 1070
    :cond_20
    const/4 p1, 0x0

    .line 1071
    :goto_1f
    and-int/2addr v1, v3

    .line 1072
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1073
    .line 1074
    .line 1075
    move-result p1

    .line 1076
    if-eqz p1, :cond_21

    .line 1077
    .line 1078
    new-instance p1, Lwb/a2;

    .line 1079
    .line 1080
    const/16 v1, 0xc

    .line 1081
    .line 1082
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1083
    .line 1084
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1085
    .line 1086
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1087
    .line 1088
    .line 1089
    const v1, 0x350d6a77

    .line 1090
    .line 1091
    .line 1092
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1093
    .line 1094
    .line 1095
    move-result-object p1

    .line 1096
    const/16 v1, 0x30

    .line 1097
    .line 1098
    const/4 v2, 0x0

    .line 1099
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_20

    .line 1103
    :cond_21
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1104
    .line 1105
    .line 1106
    :goto_20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1107
    .line 1108
    return-object p1

    .line 1109
    :pswitch_f
    move-object v0, p2

    .line 1110
    check-cast v0, Li0/h0;

    .line 1111
    .line 1112
    move-object/from16 v1, p3

    .line 1113
    .line 1114
    check-cast v1, Ljava/lang/Integer;

    .line 1115
    .line 1116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1117
    .line 1118
    .line 1119
    move-result v1

    .line 1120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    and-int/lit8 p1, v1, 0x11

    .line 1124
    .line 1125
    const/16 v2, 0x10

    .line 1126
    .line 1127
    const/4 v3, 0x1

    .line 1128
    if-eq p1, v2, :cond_22

    .line 1129
    .line 1130
    move p1, v3

    .line 1131
    goto :goto_21

    .line 1132
    :cond_22
    const/4 p1, 0x0

    .line 1133
    :goto_21
    and-int/2addr v1, v3

    .line 1134
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1135
    .line 1136
    .line 1137
    move-result p1

    .line 1138
    if-eqz p1, :cond_23

    .line 1139
    .line 1140
    new-instance p1, Lwb/a2;

    .line 1141
    .line 1142
    const/16 v1, 0xf

    .line 1143
    .line 1144
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1145
    .line 1146
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1147
    .line 1148
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1149
    .line 1150
    .line 1151
    const v1, -0x3cf2580b

    .line 1152
    .line 1153
    .line 1154
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1155
    .line 1156
    .line 1157
    move-result-object p1

    .line 1158
    const/16 v1, 0x30

    .line 1159
    .line 1160
    const/4 v2, 0x0

    .line 1161
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_22

    .line 1165
    :cond_23
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1166
    .line 1167
    .line 1168
    :goto_22
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1169
    .line 1170
    return-object p1

    .line 1171
    :pswitch_10
    move-object v0, p2

    .line 1172
    check-cast v0, Li0/h0;

    .line 1173
    .line 1174
    move-object/from16 v1, p3

    .line 1175
    .line 1176
    check-cast v1, Ljava/lang/Integer;

    .line 1177
    .line 1178
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1179
    .line 1180
    .line 1181
    move-result v1

    .line 1182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    and-int/lit8 p1, v1, 0x11

    .line 1186
    .line 1187
    const/16 v2, 0x10

    .line 1188
    .line 1189
    const/4 v3, 0x1

    .line 1190
    if-eq p1, v2, :cond_24

    .line 1191
    .line 1192
    move p1, v3

    .line 1193
    goto :goto_23

    .line 1194
    :cond_24
    const/4 p1, 0x0

    .line 1195
    :goto_23
    and-int/2addr v1, v3

    .line 1196
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1197
    .line 1198
    .line 1199
    move-result p1

    .line 1200
    if-eqz p1, :cond_25

    .line 1201
    .line 1202
    new-instance p1, Lwb/a2;

    .line 1203
    .line 1204
    const/16 v1, 0xa

    .line 1205
    .line 1206
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1207
    .line 1208
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1209
    .line 1210
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1211
    .line 1212
    .line 1213
    const v1, 0x2fc79628

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1217
    .line 1218
    .line 1219
    move-result-object p1

    .line 1220
    const/16 v1, 0x30

    .line 1221
    .line 1222
    const/4 v2, 0x0

    .line 1223
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1224
    .line 1225
    .line 1226
    goto :goto_24

    .line 1227
    :cond_25
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1228
    .line 1229
    .line 1230
    :goto_24
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1231
    .line 1232
    return-object p1

    .line 1233
    :pswitch_11
    move-object v0, p2

    .line 1234
    check-cast v0, Li0/h0;

    .line 1235
    .line 1236
    move-object/from16 v1, p3

    .line 1237
    .line 1238
    check-cast v1, Ljava/lang/Integer;

    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1241
    .line 1242
    .line 1243
    move-result v1

    .line 1244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1245
    .line 1246
    .line 1247
    and-int/lit8 p1, v1, 0x11

    .line 1248
    .line 1249
    const/16 v2, 0x10

    .line 1250
    .line 1251
    const/4 v3, 0x1

    .line 1252
    if-eq p1, v2, :cond_26

    .line 1253
    .line 1254
    move p1, v3

    .line 1255
    goto :goto_25

    .line 1256
    :cond_26
    const/4 p1, 0x0

    .line 1257
    :goto_25
    and-int/2addr v1, v3

    .line 1258
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1259
    .line 1260
    .line 1261
    move-result p1

    .line 1262
    if-eqz p1, :cond_27

    .line 1263
    .line 1264
    new-instance p1, Lwb/a2;

    .line 1265
    .line 1266
    const/16 v1, 0x11

    .line 1267
    .line 1268
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1269
    .line 1270
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1271
    .line 1272
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1273
    .line 1274
    .line 1275
    const v1, -0x229a36da

    .line 1276
    .line 1277
    .line 1278
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1279
    .line 1280
    .line 1281
    move-result-object p1

    .line 1282
    const/16 v1, 0x30

    .line 1283
    .line 1284
    const/4 v2, 0x0

    .line 1285
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_26

    .line 1289
    :cond_27
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1290
    .line 1291
    .line 1292
    :goto_26
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1293
    .line 1294
    return-object p1

    .line 1295
    :pswitch_12
    move-object v0, p2

    .line 1296
    check-cast v0, Li0/h0;

    .line 1297
    .line 1298
    move-object/from16 v1, p3

    .line 1299
    .line 1300
    check-cast v1, Ljava/lang/Integer;

    .line 1301
    .line 1302
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1303
    .line 1304
    .line 1305
    move-result v1

    .line 1306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    and-int/lit8 p1, v1, 0x11

    .line 1310
    .line 1311
    const/16 v2, 0x10

    .line 1312
    .line 1313
    const/4 v3, 0x1

    .line 1314
    if-eq p1, v2, :cond_28

    .line 1315
    .line 1316
    move p1, v3

    .line 1317
    goto :goto_27

    .line 1318
    :cond_28
    const/4 p1, 0x0

    .line 1319
    :goto_27
    and-int/2addr v1, v3

    .line 1320
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1321
    .line 1322
    .line 1323
    move-result p1

    .line 1324
    if-eqz p1, :cond_29

    .line 1325
    .line 1326
    new-instance p1, Lwb/a2;

    .line 1327
    .line 1328
    const/16 v1, 0x8

    .line 1329
    .line 1330
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1331
    .line 1332
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1333
    .line 1334
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1335
    .line 1336
    .line 1337
    const v1, -0x16243ed0

    .line 1338
    .line 1339
    .line 1340
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1341
    .line 1342
    .line 1343
    move-result-object p1

    .line 1344
    const/16 v1, 0x30

    .line 1345
    .line 1346
    const/4 v2, 0x0

    .line 1347
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_28

    .line 1351
    :cond_29
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1352
    .line 1353
    .line 1354
    :goto_28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1355
    .line 1356
    return-object p1

    .line 1357
    :pswitch_13
    move-object v0, p2

    .line 1358
    check-cast v0, Li0/h0;

    .line 1359
    .line 1360
    move-object/from16 v1, p3

    .line 1361
    .line 1362
    check-cast v1, Ljava/lang/Integer;

    .line 1363
    .line 1364
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1365
    .line 1366
    .line 1367
    move-result v1

    .line 1368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1369
    .line 1370
    .line 1371
    and-int/lit8 p1, v1, 0x11

    .line 1372
    .line 1373
    const/16 v2, 0x10

    .line 1374
    .line 1375
    const/4 v3, 0x1

    .line 1376
    if-eq p1, v2, :cond_2a

    .line 1377
    .line 1378
    move p1, v3

    .line 1379
    goto :goto_29

    .line 1380
    :cond_2a
    const/4 p1, 0x0

    .line 1381
    :goto_29
    and-int/2addr v1, v3

    .line 1382
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1383
    .line 1384
    .line 1385
    move-result p1

    .line 1386
    if-eqz p1, :cond_2b

    .line 1387
    .line 1388
    new-instance p1, Lwb/a2;

    .line 1389
    .line 1390
    const/16 v1, 0x13

    .line 1391
    .line 1392
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1393
    .line 1394
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1395
    .line 1396
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1397
    .line 1398
    .line 1399
    const v1, -0x60dc3ca0

    .line 1400
    .line 1401
    .line 1402
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1403
    .line 1404
    .line 1405
    move-result-object p1

    .line 1406
    const/16 v1, 0x30

    .line 1407
    .line 1408
    const/4 v2, 0x0

    .line 1409
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1410
    .line 1411
    .line 1412
    goto :goto_2a

    .line 1413
    :cond_2b
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1414
    .line 1415
    .line 1416
    :goto_2a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1417
    .line 1418
    return-object p1

    .line 1419
    :pswitch_14
    move-object v0, p2

    .line 1420
    check-cast v0, Li0/h0;

    .line 1421
    .line 1422
    move-object/from16 v1, p3

    .line 1423
    .line 1424
    check-cast v1, Ljava/lang/Integer;

    .line 1425
    .line 1426
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1427
    .line 1428
    .line 1429
    move-result v1

    .line 1430
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    and-int/lit8 p1, v1, 0x11

    .line 1434
    .line 1435
    const/16 v2, 0x10

    .line 1436
    .line 1437
    const/4 v3, 0x1

    .line 1438
    if-eq p1, v2, :cond_2c

    .line 1439
    .line 1440
    move p1, v3

    .line 1441
    goto :goto_2b

    .line 1442
    :cond_2c
    const/4 p1, 0x0

    .line 1443
    :goto_2b
    and-int/2addr v1, v3

    .line 1444
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1445
    .line 1446
    .line 1447
    move-result p1

    .line 1448
    if-eqz p1, :cond_2d

    .line 1449
    .line 1450
    new-instance p1, Lwb/a2;

    .line 1451
    .line 1452
    const/16 v1, 0x12

    .line 1453
    .line 1454
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1455
    .line 1456
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1457
    .line 1458
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1459
    .line 1460
    .line 1461
    const v1, -0x2c923f3e

    .line 1462
    .line 1463
    .line 1464
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1465
    .line 1466
    .line 1467
    move-result-object p1

    .line 1468
    const/16 v1, 0x30

    .line 1469
    .line 1470
    const/4 v2, 0x0

    .line 1471
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1472
    .line 1473
    .line 1474
    goto :goto_2c

    .line 1475
    :cond_2d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1476
    .line 1477
    .line 1478
    :goto_2c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1479
    .line 1480
    return-object p1

    .line 1481
    :pswitch_15
    move-object v0, p2

    .line 1482
    check-cast v0, Li0/h0;

    .line 1483
    .line 1484
    move-object/from16 v1, p3

    .line 1485
    .line 1486
    check-cast v1, Ljava/lang/Integer;

    .line 1487
    .line 1488
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1489
    .line 1490
    .line 1491
    move-result v1

    .line 1492
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1493
    .line 1494
    .line 1495
    and-int/lit8 p1, v1, 0x11

    .line 1496
    .line 1497
    const/16 v2, 0x10

    .line 1498
    .line 1499
    const/4 v3, 0x1

    .line 1500
    if-eq p1, v2, :cond_2e

    .line 1501
    .line 1502
    move p1, v3

    .line 1503
    goto :goto_2d

    .line 1504
    :cond_2e
    const/4 p1, 0x0

    .line 1505
    :goto_2d
    and-int/2addr v1, v3

    .line 1506
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1507
    .line 1508
    .line 1509
    move-result p1

    .line 1510
    if-eqz p1, :cond_2f

    .line 1511
    .line 1512
    new-instance p1, Lwb/a2;

    .line 1513
    .line 1514
    const/16 v1, 0xd

    .line 1515
    .line 1516
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1517
    .line 1518
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1519
    .line 1520
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1521
    .line 1522
    .line 1523
    const v1, 0x3c8e2370

    .line 1524
    .line 1525
    .line 1526
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1527
    .line 1528
    .line 1529
    move-result-object p1

    .line 1530
    const/16 v1, 0x30

    .line 1531
    .line 1532
    const/4 v2, 0x0

    .line 1533
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1534
    .line 1535
    .line 1536
    goto :goto_2e

    .line 1537
    :cond_2f
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1538
    .line 1539
    .line 1540
    :goto_2e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1541
    .line 1542
    return-object p1

    .line 1543
    :pswitch_16
    move-object v0, p2

    .line 1544
    check-cast v0, Li0/h0;

    .line 1545
    .line 1546
    move-object/from16 v1, p3

    .line 1547
    .line 1548
    check-cast v1, Ljava/lang/Integer;

    .line 1549
    .line 1550
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1551
    .line 1552
    .line 1553
    move-result v1

    .line 1554
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1555
    .line 1556
    .line 1557
    and-int/lit8 p1, v1, 0x11

    .line 1558
    .line 1559
    const/16 v2, 0x10

    .line 1560
    .line 1561
    const/4 v3, 0x1

    .line 1562
    if-eq p1, v2, :cond_30

    .line 1563
    .line 1564
    move p1, v3

    .line 1565
    goto :goto_2f

    .line 1566
    :cond_30
    const/4 p1, 0x0

    .line 1567
    :goto_2f
    and-int/2addr v1, v3

    .line 1568
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1569
    .line 1570
    .line 1571
    move-result p1

    .line 1572
    if-eqz p1, :cond_31

    .line 1573
    .line 1574
    new-instance p1, Lwb/a2;

    .line 1575
    .line 1576
    const/4 v1, 0x6

    .line 1577
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1578
    .line 1579
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1580
    .line 1581
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1582
    .line 1583
    .line 1584
    const v1, -0x5d98ad76

    .line 1585
    .line 1586
    .line 1587
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1588
    .line 1589
    .line 1590
    move-result-object p1

    .line 1591
    const/16 v1, 0x30

    .line 1592
    .line 1593
    const/4 v2, 0x0

    .line 1594
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1595
    .line 1596
    .line 1597
    goto :goto_30

    .line 1598
    :cond_31
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1599
    .line 1600
    .line 1601
    :goto_30
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1602
    .line 1603
    return-object p1

    .line 1604
    :pswitch_17
    move-object v0, p2

    .line 1605
    check-cast v0, Li0/h0;

    .line 1606
    .line 1607
    move-object/from16 v1, p3

    .line 1608
    .line 1609
    check-cast v1, Ljava/lang/Integer;

    .line 1610
    .line 1611
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1612
    .line 1613
    .line 1614
    move-result v1

    .line 1615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1616
    .line 1617
    .line 1618
    and-int/lit8 p1, v1, 0x11

    .line 1619
    .line 1620
    const/16 v2, 0x10

    .line 1621
    .line 1622
    const/4 v3, 0x1

    .line 1623
    if-eq p1, v2, :cond_32

    .line 1624
    .line 1625
    move p1, v3

    .line 1626
    goto :goto_31

    .line 1627
    :cond_32
    const/4 p1, 0x0

    .line 1628
    :goto_31
    and-int/2addr v1, v3

    .line 1629
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1630
    .line 1631
    .line 1632
    move-result p1

    .line 1633
    if-eqz p1, :cond_33

    .line 1634
    .line 1635
    new-instance p1, Lwb/a2;

    .line 1636
    .line 1637
    const/4 v1, 0x3

    .line 1638
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1639
    .line 1640
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1641
    .line 1642
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1643
    .line 1644
    .line 1645
    const v1, 0x32f0bbe9

    .line 1646
    .line 1647
    .line 1648
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1649
    .line 1650
    .line 1651
    move-result-object p1

    .line 1652
    const/16 v1, 0x30

    .line 1653
    .line 1654
    const/4 v2, 0x0

    .line 1655
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1656
    .line 1657
    .line 1658
    goto :goto_32

    .line 1659
    :cond_33
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1660
    .line 1661
    .line 1662
    :goto_32
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1663
    .line 1664
    return-object p1

    .line 1665
    :pswitch_18
    move-object v0, p2

    .line 1666
    check-cast v0, Li0/h0;

    .line 1667
    .line 1668
    move-object/from16 v1, p3

    .line 1669
    .line 1670
    check-cast v1, Ljava/lang/Integer;

    .line 1671
    .line 1672
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1673
    .line 1674
    .line 1675
    move-result v1

    .line 1676
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    and-int/lit8 p1, v1, 0x11

    .line 1680
    .line 1681
    const/16 v2, 0x10

    .line 1682
    .line 1683
    const/4 v3, 0x1

    .line 1684
    if-eq p1, v2, :cond_34

    .line 1685
    .line 1686
    move p1, v3

    .line 1687
    goto :goto_33

    .line 1688
    :cond_34
    const/4 p1, 0x0

    .line 1689
    :goto_33
    and-int/2addr v1, v3

    .line 1690
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1691
    .line 1692
    .line 1693
    move-result p1

    .line 1694
    if-eqz p1, :cond_35

    .line 1695
    .line 1696
    new-instance p1, Lwb/a2;

    .line 1697
    .line 1698
    const/4 v1, 0x4

    .line 1699
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1700
    .line 1701
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1702
    .line 1703
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1704
    .line 1705
    .line 1706
    const v1, 0x1ced3e1b

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1710
    .line 1711
    .line 1712
    move-result-object p1

    .line 1713
    const/16 v1, 0x30

    .line 1714
    .line 1715
    const/4 v2, 0x0

    .line 1716
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1717
    .line 1718
    .line 1719
    goto :goto_34

    .line 1720
    :cond_35
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1721
    .line 1722
    .line 1723
    :goto_34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1724
    .line 1725
    return-object p1

    .line 1726
    :pswitch_19
    move-object v0, p2

    .line 1727
    check-cast v0, Li0/h0;

    .line 1728
    .line 1729
    move-object/from16 v1, p3

    .line 1730
    .line 1731
    check-cast v1, Ljava/lang/Integer;

    .line 1732
    .line 1733
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1734
    .line 1735
    .line 1736
    move-result v1

    .line 1737
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1738
    .line 1739
    .line 1740
    and-int/lit8 p1, v1, 0x11

    .line 1741
    .line 1742
    const/16 v2, 0x10

    .line 1743
    .line 1744
    const/4 v3, 0x1

    .line 1745
    if-eq p1, v2, :cond_36

    .line 1746
    .line 1747
    move p1, v3

    .line 1748
    goto :goto_35

    .line 1749
    :cond_36
    const/4 p1, 0x0

    .line 1750
    :goto_35
    and-int/2addr v1, v3

    .line 1751
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1752
    .line 1753
    .line 1754
    move-result p1

    .line 1755
    if-eqz p1, :cond_37

    .line 1756
    .line 1757
    new-instance p1, Lwb/a2;

    .line 1758
    .line 1759
    const/4 v1, 0x5

    .line 1760
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1761
    .line 1762
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1763
    .line 1764
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1765
    .line 1766
    .line 1767
    const v1, 0xea477cd

    .line 1768
    .line 1769
    .line 1770
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1771
    .line 1772
    .line 1773
    move-result-object p1

    .line 1774
    const/16 v1, 0x30

    .line 1775
    .line 1776
    const/4 v2, 0x0

    .line 1777
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1778
    .line 1779
    .line 1780
    goto :goto_36

    .line 1781
    :cond_37
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1782
    .line 1783
    .line 1784
    :goto_36
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1785
    .line 1786
    return-object p1

    .line 1787
    :pswitch_1a
    move-object v0, p2

    .line 1788
    check-cast v0, Li0/h0;

    .line 1789
    .line 1790
    move-object/from16 v1, p3

    .line 1791
    .line 1792
    check-cast v1, Ljava/lang/Integer;

    .line 1793
    .line 1794
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1795
    .line 1796
    .line 1797
    move-result v1

    .line 1798
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    and-int/lit8 p1, v1, 0x11

    .line 1802
    .line 1803
    const/16 v2, 0x10

    .line 1804
    .line 1805
    const/4 v3, 0x1

    .line 1806
    if-eq p1, v2, :cond_38

    .line 1807
    .line 1808
    move p1, v3

    .line 1809
    goto :goto_37

    .line 1810
    :cond_38
    const/4 p1, 0x0

    .line 1811
    :goto_37
    and-int/2addr v1, v3

    .line 1812
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 1813
    .line 1814
    .line 1815
    move-result p1

    .line 1816
    if-eqz p1, :cond_39

    .line 1817
    .line 1818
    new-instance p1, Lwb/a2;

    .line 1819
    .line 1820
    const/4 v1, 0x0

    .line 1821
    iget-object v2, p0, Lwb/t1;->h:Li0/a1;

    .line 1822
    .line 1823
    iget-object v4, p0, Lwb/t1;->i:Li0/a1;

    .line 1824
    .line 1825
    invoke-direct {p1, v1, v2, v4}, Lwb/a2;-><init>(ILi0/a1;Li0/a1;)V

    .line 1826
    .line 1827
    .line 1828
    const v1, 0x6eb9e44e

    .line 1829
    .line 1830
    .line 1831
    invoke-static {v1, p1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1832
    .line 1833
    .line 1834
    move-result-object p1

    .line 1835
    const/16 v1, 0x30

    .line 1836
    .line 1837
    const/4 v2, 0x0

    .line 1838
    invoke-static {v2, p1, v0, v1, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1839
    .line 1840
    .line 1841
    goto :goto_38

    .line 1842
    :cond_39
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 1843
    .line 1844
    .line 1845
    :goto_38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1846
    .line 1847
    return-object p1

    .line 1848
    nop

    .line 1849
    :pswitch_data_0
    .packed-switch 0x0
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
