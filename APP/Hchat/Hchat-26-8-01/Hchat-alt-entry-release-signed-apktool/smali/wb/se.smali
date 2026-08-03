.class public final synthetic Lwb/se;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/p;I)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    .line 2
    iput p3, p0, Lwb/se;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/se;->h:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/se;->i:Lfg/p;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lfg/p;IB)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/se;->g:I

    iput-object p1, p0, Lwb/se;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/se;->i:Lfg/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/se;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, Lwb/se;->h:Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, p0, Lwb/se;->i:Lfg/p;

    .line 21
    .line 22
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->J0(Ljava/util/List;Lfg/p;Li0/h0;I)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    and-int/lit8 v0, p2, 0x3

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    const/4 v2, 0x1

    .line 36
    const/4 v3, 0x0

    .line 37
    if-eq v0, v1, :cond_0

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v0, v3

    .line 42
    :goto_0
    and-int/2addr p2, v2

    .line 43
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_7

    .line 48
    .line 49
    iget-object p2, p0, Lwb/se;->h:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const p2, -0x65724483

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 61
    .line 62
    .line 63
    const-string p2, "\u6ca1\u6709\u5339\u914d\u529f\u80fd"

    .line 64
    .line 65
    const/4 v0, 0x6

    .line 66
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_1
    const v0, -0x657160bc

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move v1, v3

    .line 84
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    add-int/lit8 v5, v1, 0x1

    .line 95
    .line 96
    if-ltz v1, :cond_5

    .line 97
    .line 98
    check-cast v4, Lwb/d3;

    .line 99
    .line 100
    iget-object v6, p0, Lwb/se;->i:Lfg/p;

    .line 101
    .line 102
    invoke-virtual {p1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    or-int/2addr v7, v8

    .line 111
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-nez v7, :cond_2

    .line 116
    .line 117
    sget-object v7, Li0/l;->a:Li0/e;

    .line 118
    .line 119
    if-ne v8, v7, :cond_3

    .line 120
    .line 121
    :cond_2
    new-instance v8, Lsh/v1;

    .line 122
    .line 123
    const/16 v7, 0xa

    .line 124
    .line 125
    invoke-direct {v8, v6, v7, v4}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    check-cast v8, Lfg/a;

    .line 132
    .line 133
    invoke-static {v4, v8, p1, v3}, Lwb/ho;->K0(Lwb/d3;Lfg/a;Li0/h0;I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    sub-int/2addr v4, v2

    .line 141
    if-ge v1, v4, :cond_4

    .line 142
    .line 143
    const v1, -0x36df11de

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 147
    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    const v1, -0x36de4728    # -662413.5f

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 164
    .line 165
    .line 166
    :goto_2
    move v1, v5

    .line 167
    goto :goto_1

    .line 168
    :cond_5
    invoke-static {}, La/a;->Q0()V

    .line 169
    .line 170
    .line 171
    const/4 p1, 0x0

    .line 172
    throw p1

    .line 173
    :cond_6
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 178
    .line 179
    .line 180
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 181
    .line 182
    return-object p1

    .line 183
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    and-int/lit8 v0, p2, 0x3

    .line 188
    .line 189
    const/4 v1, 0x2

    .line 190
    const/4 v2, 0x1

    .line 191
    const/4 v3, 0x0

    .line 192
    if-eq v0, v1, :cond_8

    .line 193
    .line 194
    move v0, v2

    .line 195
    goto :goto_4

    .line 196
    :cond_8
    move v0, v3

    .line 197
    :goto_4
    and-int/2addr p2, v2

    .line 198
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_10

    .line 203
    .line 204
    iget-object p2, p0, Lwb/se;->h:Ljava/util/List;

    .line 205
    .line 206
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    const p2, 0x3b3e804f

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 216
    .line 217
    .line 218
    const-string p2, "\u6682\u65e0\u6a21\u677f\u3002\u65b0\u589e\u540e\u53ef\u8bbe\u4e3a\u9ed8\u8ba4\u89c4\u5219\u6216\u5206\u914d\u7ed9\u6307\u5b9a\u804a\u5929\u3002"

    .line 219
    .line 220
    const/4 v0, 0x6

    .line 221
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_8

    .line 228
    .line 229
    :cond_9
    const v0, 0x3b400b70

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move v1, v3

    .line 240
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_f

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    add-int/lit8 v5, v1, 0x1

    .line 251
    .line 252
    if-ltz v1, :cond_e

    .line 253
    .line 254
    check-cast v4, Lua/i;

    .line 255
    .line 256
    iget-object v6, v4, Lua/i;->b:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eqz v7, :cond_a

    .line 263
    .line 264
    const-string v6, "\u6a21\u677f "

    .line 265
    .line 266
    invoke-static {v5, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    :cond_a
    invoke-static {v4}, Lwb/ho;->w5(Lua/i;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    iget-object v8, p0, Lwb/se;->i:Lfg/p;

    .line 275
    .line 276
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    invoke-virtual {p1, v1}, Li0/h0;->d(I)Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    or-int/2addr v9, v10

    .line 285
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    or-int/2addr v9, v10

    .line 290
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    if-nez v9, :cond_b

    .line 295
    .line 296
    sget-object v9, Li0/l;->a:Li0/e;

    .line 297
    .line 298
    if-ne v10, v9, :cond_c

    .line 299
    .line 300
    :cond_b
    new-instance v10, Lhb/e0;

    .line 301
    .line 302
    const/16 v9, 0xa

    .line 303
    .line 304
    invoke-direct {v10, v8, v1, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_c
    check-cast v10, Lfg/a;

    .line 311
    .line 312
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 313
    .line 314
    .line 315
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    sub-int/2addr v4, v2

    .line 320
    if-ge v1, v4, :cond_d

    .line 321
    .line 322
    const v1, 0x5c31a192    # 1.9999488E17f

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 326
    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 330
    .line 331
    .line 332
    :goto_6
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 333
    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_d
    const v1, 0x2a02c53e

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :goto_7
    move v1, v5

    .line 344
    goto :goto_5

    .line 345
    :cond_e
    invoke-static {}, La/a;->Q0()V

    .line 346
    .line 347
    .line 348
    const/4 p1, 0x0

    .line 349
    throw p1

    .line 350
    :cond_f
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_10
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 355
    .line 356
    .line 357
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 358
    .line 359
    return-object p1

    .line 360
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result p2

    .line 364
    and-int/lit8 v0, p2, 0x3

    .line 365
    .line 366
    const/4 v1, 0x2

    .line 367
    const/4 v2, 0x1

    .line 368
    const/4 v3, 0x0

    .line 369
    if-eq v0, v1, :cond_11

    .line 370
    .line 371
    move v0, v2

    .line 372
    goto :goto_9

    .line 373
    :cond_11
    move v0, v3

    .line 374
    :goto_9
    and-int/2addr p2, v2

    .line 375
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 376
    .line 377
    .line 378
    move-result p2

    .line 379
    if-eqz p2, :cond_19

    .line 380
    .line 381
    iget-object p2, p0, Lwb/se;->h:Ljava/util/List;

    .line 382
    .line 383
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_12

    .line 388
    .line 389
    const p2, -0x6010a1e9

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 393
    .line 394
    .line 395
    const-string p2, "\u6682\u65e0\u6a21\u677f\u3002\u6a21\u677f\u53ea\u914d\u7f6e\u62a2\u5305\u7b56\u7565\uff0c\u9002\u7528\u804a\u5929\u5728\u201c\u9002\u7528\u804a\u5929\u201d\u91cc\u5206\u914d\u3002"

    .line 396
    .line 397
    const/4 v0, 0x6

    .line 398
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_d

    .line 405
    .line 406
    :cond_12
    const v0, -0x600ef7c8

    .line 407
    .line 408
    .line 409
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 410
    .line 411
    .line 412
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    move v1, v3

    .line 417
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    if-eqz v4, :cond_18

    .line 422
    .line 423
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    add-int/lit8 v5, v1, 0x1

    .line 428
    .line 429
    if-ltz v1, :cond_17

    .line 430
    .line 431
    check-cast v4, Lna/j;

    .line 432
    .line 433
    iget-object v6, v4, Lna/j;->b:Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v7

    .line 439
    if-eqz v7, :cond_13

    .line 440
    .line 441
    const-string v6, "\u6a21\u677f "

    .line 442
    .line 443
    invoke-static {v5, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    :cond_13
    invoke-static {v4}, Lwb/ho;->u5(Lna/j;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    iget-object v8, p0, Lwb/se;->i:Lfg/p;

    .line 452
    .line 453
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    invoke-virtual {p1, v1}, Li0/h0;->d(I)Z

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    or-int/2addr v9, v10

    .line 462
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    or-int/2addr v9, v10

    .line 467
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    if-nez v9, :cond_14

    .line 472
    .line 473
    sget-object v9, Li0/l;->a:Li0/e;

    .line 474
    .line 475
    if-ne v10, v9, :cond_15

    .line 476
    .line 477
    :cond_14
    new-instance v10, Lhb/e0;

    .line 478
    .line 479
    const/16 v9, 0x8

    .line 480
    .line 481
    invoke-direct {v10, v8, v1, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    :cond_15
    check-cast v10, Lfg/a;

    .line 488
    .line 489
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    sub-int/2addr v4, v2

    .line 497
    if-ge v1, v4, :cond_16

    .line 498
    .line 499
    const v1, -0x414d7fa6

    .line 500
    .line 501
    .line 502
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 503
    .line 504
    .line 505
    const/4 v1, 0x0

    .line 506
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 507
    .line 508
    .line 509
    :goto_b
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_16
    const v1, 0x179dbf76

    .line 514
    .line 515
    .line 516
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 517
    .line 518
    .line 519
    goto :goto_b

    .line 520
    :goto_c
    move v1, v5

    .line 521
    goto :goto_a

    .line 522
    :cond_17
    invoke-static {}, La/a;->Q0()V

    .line 523
    .line 524
    .line 525
    const/4 p1, 0x0

    .line 526
    throw p1

    .line 527
    :cond_18
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 528
    .line 529
    .line 530
    goto :goto_d

    .line 531
    :cond_19
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 532
    .line 533
    .line 534
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 535
    .line 536
    return-object p1

    .line 537
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    and-int/lit8 v0, p2, 0x3

    .line 542
    .line 543
    const/4 v1, 0x2

    .line 544
    const/4 v2, 0x1

    .line 545
    const/4 v3, 0x0

    .line 546
    if-eq v0, v1, :cond_1a

    .line 547
    .line 548
    move v0, v2

    .line 549
    goto :goto_e

    .line 550
    :cond_1a
    move v0, v3

    .line 551
    :goto_e
    and-int/2addr p2, v2

    .line 552
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 553
    .line 554
    .line 555
    move-result p2

    .line 556
    if-eqz p2, :cond_22

    .line 557
    .line 558
    iget-object p2, p0, Lwb/se;->h:Ljava/util/List;

    .line 559
    .line 560
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_1b

    .line 565
    .line 566
    const p2, 0x46e070a0    # 28728.312f

    .line 567
    .line 568
    .line 569
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 570
    .line 571
    .line 572
    const-string p2, "\u6682\u65e0\u6a21\u677f\u3002\u6a21\u677f\u53ea\u914d\u7f6e\u6d88\u606f\u7c7b\u578b\u548c\u5173\u952e\u8bcd\uff0c\u540d\u5355\u5728\u201c\u540d\u5355\u7ba1\u7406\u201d\u91cc\u5206\u914d\u6a21\u677f\u3002"

    .line 573
    .line 574
    const/4 v0, 0x6

    .line 575
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 579
    .line 580
    .line 581
    goto/16 :goto_12

    .line 582
    .line 583
    :cond_1b
    const v0, 0x46e22a22

    .line 584
    .line 585
    .line 586
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 587
    .line 588
    .line 589
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    move v1, v3

    .line 594
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    if-eqz v4, :cond_21

    .line 599
    .line 600
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    add-int/lit8 v5, v1, 0x1

    .line 605
    .line 606
    if-ltz v1, :cond_20

    .line 607
    .line 608
    check-cast v4, Laa/h;

    .line 609
    .line 610
    iget-object v6, v4, Laa/h;->b:Ljava/lang/String;

    .line 611
    .line 612
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 613
    .line 614
    .line 615
    move-result v7

    .line 616
    if-eqz v7, :cond_1c

    .line 617
    .line 618
    const-string v6, "\u6a21\u677f "

    .line 619
    .line 620
    invoke-static {v5, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    :cond_1c
    invoke-static {v4}, Lwb/ho;->r5(Laa/h;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    iget-object v8, p0, Lwb/se;->i:Lfg/p;

    .line 629
    .line 630
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v9

    .line 634
    invoke-virtual {p1, v1}, Li0/h0;->d(I)Z

    .line 635
    .line 636
    .line 637
    move-result v10

    .line 638
    or-int/2addr v9, v10

    .line 639
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v10

    .line 643
    or-int/2addr v9, v10

    .line 644
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    if-nez v9, :cond_1d

    .line 649
    .line 650
    sget-object v9, Li0/l;->a:Li0/e;

    .line 651
    .line 652
    if-ne v10, v9, :cond_1e

    .line 653
    .line 654
    :cond_1d
    new-instance v10, Lhb/e0;

    .line 655
    .line 656
    const/4 v9, 0x7

    .line 657
    invoke-direct {v10, v8, v1, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    :cond_1e
    check-cast v10, Lfg/a;

    .line 664
    .line 665
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 666
    .line 667
    .line 668
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    sub-int/2addr v4, v2

    .line 673
    if-ge v1, v4, :cond_1f

    .line 674
    .line 675
    const v1, -0x1ae6df4a

    .line 676
    .line 677
    .line 678
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 679
    .line 680
    .line 681
    const/4 v1, 0x0

    .line 682
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 683
    .line 684
    .line 685
    :goto_10
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 686
    .line 687
    .line 688
    goto :goto_11

    .line 689
    :cond_1f
    const v1, -0x41f4d566

    .line 690
    .line 691
    .line 692
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 693
    .line 694
    .line 695
    goto :goto_10

    .line 696
    :goto_11
    move v1, v5

    .line 697
    goto :goto_f

    .line 698
    :cond_20
    invoke-static {}, La/a;->Q0()V

    .line 699
    .line 700
    .line 701
    const/4 p1, 0x0

    .line 702
    throw p1

    .line 703
    :cond_21
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 704
    .line 705
    .line 706
    goto :goto_12

    .line 707
    :cond_22
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 708
    .line 709
    .line 710
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 711
    .line 712
    return-object p1

    .line 713
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
