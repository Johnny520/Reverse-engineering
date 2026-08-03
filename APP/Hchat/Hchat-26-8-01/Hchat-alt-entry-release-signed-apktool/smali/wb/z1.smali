.class public final synthetic Lwb/z1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;I)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    .line 2
    iput p3, p0, Lwb/z1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/z1;->h:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/z1;->i:Lfg/l;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;IB)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/z1;->g:I

    iput-object p1, p0, Lwb/z1;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/z1;->i:Lfg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/z1;->g:I

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
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    iget-object p2, p0, Lwb/z1;->h:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lwb/z1;->i:Lfg/l;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    or-int/2addr v0, v2

    .line 43
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    sget-object v0, Li0/l;->a:Li0/e;

    .line 50
    .line 51
    if-ne v2, v0, :cond_2

    .line 52
    .line 53
    :cond_1
    new-instance v2, Lwb/xi;

    .line 54
    .line 55
    const/16 v0, 0x11

    .line 56
    .line 57
    invoke-direct {v2, p2, v1, v0}, Lwb/xi;-><init>(Ljava/lang/Object;Lfg/l;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    check-cast v2, Lfg/a;

    .line 64
    .line 65
    const/16 p2, 0x36

    .line 66
    .line 67
    const-string v0, "\u6dfb\u52a0 MCP"

    .line 68
    .line 69
    const-string v1, "\u53ef\u540c\u65f6\u542f\u7528\u591a\u4e2a\u8fdc\u7a0b MCP \u670d\u52a1\u5668"

    .line 70
    .line 71
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 p2, 0x1

    .line 85
    invoke-static {p2}, Li0/r;->C(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object v0, p0, Lwb/z1;->h:Ljava/util/List;

    .line 90
    .line 91
    iget-object v1, p0, Lwb/z1;->i:Lfg/l;

    .line 92
    .line 93
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->G2(Ljava/util/List;Lfg/l;Li0/h0;I)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    and-int/lit8 v0, p2, 0x3

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    const/4 v2, 0x1

    .line 107
    const/4 v3, 0x0

    .line 108
    if-eq v0, v1, :cond_4

    .line 109
    .line 110
    move v0, v2

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move v0, v3

    .line 113
    :goto_2
    and-int/2addr p2, v2

    .line 114
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_b

    .line 119
    .line 120
    iget-object p2, p0, Lwb/z1;->h:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    const p2, -0x6fb5532b

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 132
    .line 133
    .line 134
    const-string p2, "\u6ca1\u6709\u5339\u914d\u63d2\u4ef6"

    .line 135
    .line 136
    const/4 v0, 0x6

    .line 137
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_5
    const v0, -0x6fb4728a

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    move v1, v3

    .line 155
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_a

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    add-int/lit8 v5, v1, 0x1

    .line 166
    .line 167
    if-ltz v1, :cond_9

    .line 168
    .line 169
    check-cast v4, Leb/c0;

    .line 170
    .line 171
    iget-object v6, p0, Lwb/z1;->i:Lfg/l;

    .line 172
    .line 173
    invoke-virtual {p1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    or-int/2addr v7, v8

    .line 182
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    if-nez v7, :cond_6

    .line 187
    .line 188
    sget-object v7, Li0/l;->a:Li0/e;

    .line 189
    .line 190
    if-ne v8, v7, :cond_7

    .line 191
    .line 192
    :cond_6
    new-instance v8, Lwb/q9;

    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    invoke-direct {v8, v6, v4, v7}, Lwb/q9;-><init>(Lfg/l;Leb/c0;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    check-cast v8, Lfg/a;

    .line 202
    .line 203
    const/16 v6, 0x8

    .line 204
    .line 205
    invoke-static {v4, v8, p1, v6}, Lwb/ho;->H2(Leb/c0;Lfg/a;Li0/h0;I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    sub-int/2addr v4, v2

    .line 213
    if-ge v1, v4, :cond_8

    .line 214
    .line 215
    const v1, 0x328c6dad

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 219
    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    const v1, 0x328d3863

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 236
    .line 237
    .line 238
    :goto_4
    move v1, v5

    .line 239
    goto :goto_3

    .line 240
    :cond_9
    invoke-static {}, La/a;->Q0()V

    .line 241
    .line 242
    .line 243
    const/4 p1, 0x0

    .line 244
    throw p1

    .line 245
    :cond_a
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 250
    .line 251
    .line 252
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 253
    .line 254
    return-object p1

    .line 255
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    and-int/lit8 v0, p2, 0x3

    .line 260
    .line 261
    const/4 v1, 0x2

    .line 262
    const/4 v2, 0x1

    .line 263
    const/4 v3, 0x0

    .line 264
    if-eq v0, v1, :cond_c

    .line 265
    .line 266
    move v0, v2

    .line 267
    goto :goto_6

    .line 268
    :cond_c
    move v0, v3

    .line 269
    :goto_6
    and-int/2addr p2, v2

    .line 270
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-eqz p2, :cond_13

    .line 275
    .line 276
    iget-object p2, p0, Lwb/z1;->h:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    const p2, -0x615d6a5

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 288
    .line 289
    .line 290
    const-string p2, "\u6682\u65e0\u7fa4\u804a\u6807\u7b7e"

    .line 291
    .line 292
    const/4 v0, 0x6

    .line 293
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_a

    .line 300
    .line 301
    :cond_d
    const v0, -0x6148eb9

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    move v1, v3

    .line 312
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    if-eqz v4, :cond_12

    .line 317
    .line 318
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    add-int/lit8 v5, v1, 0x1

    .line 323
    .line 324
    if-ltz v1, :cond_11

    .line 325
    .line 326
    check-cast v4, Ln9/a;

    .line 327
    .line 328
    iget-object v6, v4, Ln9/a;->b:Ljava/lang/String;

    .line 329
    .line 330
    iget-object v7, v4, Ln9/a;->c:Ljava/util/Set;

    .line 331
    .line 332
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    const-string v8, " \u4e2a\u7fa4\u804a"

    .line 337
    .line 338
    invoke-static {v7, v8}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    iget-object v8, p0, Lwb/z1;->i:Lfg/l;

    .line 343
    .line 344
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    or-int/2addr v9, v10

    .line 353
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    if-nez v9, :cond_e

    .line 358
    .line 359
    sget-object v9, Li0/l;->a:Li0/e;

    .line 360
    .line 361
    if-ne v10, v9, :cond_f

    .line 362
    .line 363
    :cond_e
    new-instance v10, Lwb/jh;

    .line 364
    .line 365
    const/4 v9, 0x1

    .line 366
    invoke-direct {v10, v8, v4, v9}, Lwb/jh;-><init>(Lfg/l;Ln9/a;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_f
    check-cast v10, Lfg/a;

    .line 373
    .line 374
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 375
    .line 376
    .line 377
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    sub-int/2addr v4, v2

    .line 382
    if-ge v1, v4, :cond_10

    .line 383
    .line 384
    const v1, 0x68d37250

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 388
    .line 389
    .line 390
    const/4 v1, 0x0

    .line 391
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 392
    .line 393
    .line 394
    :goto_8
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 395
    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_10
    const v1, -0x4e64f3c0

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 402
    .line 403
    .line 404
    goto :goto_8

    .line 405
    :goto_9
    move v1, v5

    .line 406
    goto :goto_7

    .line 407
    :cond_11
    invoke-static {}, La/a;->Q0()V

    .line 408
    .line 409
    .line 410
    const/4 p1, 0x0

    .line 411
    throw p1

    .line 412
    :cond_12
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 413
    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_13
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 417
    .line 418
    .line 419
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 420
    .line 421
    return-object p1

    .line 422
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    and-int/lit8 v0, p2, 0x3

    .line 427
    .line 428
    const/4 v1, 0x2

    .line 429
    const/4 v2, 0x1

    .line 430
    const/4 v3, 0x0

    .line 431
    if-eq v0, v1, :cond_14

    .line 432
    .line 433
    move v0, v2

    .line 434
    goto :goto_b

    .line 435
    :cond_14
    move v0, v3

    .line 436
    :goto_b
    and-int/2addr p2, v2

    .line 437
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    if-eqz p2, :cond_19

    .line 442
    .line 443
    iget-object p2, p0, Lwb/z1;->h:Ljava/util/List;

    .line 444
    .line 445
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    move v1, v3

    .line 450
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    if-eqz v4, :cond_1a

    .line 455
    .line 456
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    add-int/lit8 v5, v1, 0x1

    .line 461
    .line 462
    if-ltz v1, :cond_18

    .line 463
    .line 464
    check-cast v4, Lwb/c3;

    .line 465
    .line 466
    iget-object v6, p0, Lwb/z1;->i:Lfg/l;

    .line 467
    .line 468
    invoke-virtual {p1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    or-int/2addr v7, v8

    .line 477
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    if-nez v7, :cond_15

    .line 482
    .line 483
    sget-object v7, Li0/l;->a:Li0/e;

    .line 484
    .line 485
    if-ne v8, v7, :cond_16

    .line 486
    .line 487
    :cond_15
    new-instance v8, Lsh/v1;

    .line 488
    .line 489
    const/16 v7, 0xe

    .line 490
    .line 491
    invoke-direct {v8, v6, v7, v4}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    :cond_16
    check-cast v8, Lfg/a;

    .line 498
    .line 499
    invoke-static {v4, v8, p1, v3}, Lwb/ho;->F0(Lwb/c3;Lfg/a;Li0/h0;I)V

    .line 500
    .line 501
    .line 502
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    sub-int/2addr v4, v2

    .line 507
    if-ge v1, v4, :cond_17

    .line 508
    .line 509
    const v1, -0x74261381

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 513
    .line 514
    .line 515
    const/4 v1, 0x0

    .line 516
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 520
    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_17
    const v1, -0x742548cb

    .line 524
    .line 525
    .line 526
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 530
    .line 531
    .line 532
    :goto_d
    move v1, v5

    .line 533
    goto :goto_c

    .line 534
    :cond_18
    invoke-static {}, La/a;->Q0()V

    .line 535
    .line 536
    .line 537
    const/4 p1, 0x0

    .line 538
    throw p1

    .line 539
    :cond_19
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 540
    .line 541
    .line 542
    :cond_1a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 543
    .line 544
    return-object p1

    .line 545
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 546
    .line 547
    .line 548
    move-result p2

    .line 549
    and-int/lit8 v0, p2, 0x3

    .line 550
    .line 551
    const/4 v1, 0x2

    .line 552
    const/4 v2, 0x1

    .line 553
    const/4 v3, 0x0

    .line 554
    if-eq v0, v1, :cond_1b

    .line 555
    .line 556
    move v0, v2

    .line 557
    goto :goto_e

    .line 558
    :cond_1b
    move v0, v3

    .line 559
    :goto_e
    and-int/2addr p2, v2

    .line 560
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 561
    .line 562
    .line 563
    move-result p2

    .line 564
    if-eqz p2, :cond_22

    .line 565
    .line 566
    iget-object p2, p0, Lwb/z1;->h:Ljava/util/List;

    .line 567
    .line 568
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-eqz v0, :cond_1c

    .line 573
    .line 574
    const p2, -0x737287c4

    .line 575
    .line 576
    .line 577
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 578
    .line 579
    .line 580
    const-string p2, "\u6ca1\u6709\u5176\u5b83\u53ef\u7528\u5206\u7ec4"

    .line 581
    .line 582
    const/4 v0, 0x6

    .line 583
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_12

    .line 590
    .line 591
    :cond_1c
    const v0, -0x73713495    # -2.2000992E-31f

    .line 592
    .line 593
    .line 594
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 595
    .line 596
    .line 597
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    move v1, v3

    .line 602
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    if-eqz v4, :cond_21

    .line 607
    .line 608
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    add-int/lit8 v5, v1, 0x1

    .line 613
    .line 614
    if-ltz v1, :cond_20

    .line 615
    .line 616
    check-cast v4, Lwb/g2;

    .line 617
    .line 618
    const-string v6, "  "

    .line 619
    .line 620
    iget v7, v4, Lwb/g2;->b:I

    .line 621
    .line 622
    invoke-static {v7, v6}, Log/t;->Z(ILjava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    iget-object v7, v4, Lwb/g2;->a:Lc9/a;

    .line 627
    .line 628
    iget-object v7, v7, Lc9/a;->b:Ljava/lang/String;

    .line 629
    .line 630
    invoke-static {v6, v7}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    iget-object v7, v4, Lwb/g2;->c:Ljava/lang/String;

    .line 635
    .line 636
    iget-object v8, p0, Lwb/z1;->i:Lfg/l;

    .line 637
    .line 638
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v9

    .line 642
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v10

    .line 646
    or-int/2addr v9, v10

    .line 647
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v10

    .line 651
    if-nez v9, :cond_1d

    .line 652
    .line 653
    sget-object v9, Li0/l;->a:Li0/e;

    .line 654
    .line 655
    if-ne v10, v9, :cond_1e

    .line 656
    .line 657
    :cond_1d
    new-instance v10, Lwb/b2;

    .line 658
    .line 659
    const/4 v9, 0x1

    .line 660
    invoke-direct {v10, v8, v4, v9}, Lwb/b2;-><init>(Lfg/l;Lwb/g2;I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :cond_1e
    check-cast v10, Lfg/a;

    .line 667
    .line 668
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 669
    .line 670
    .line 671
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    sub-int/2addr v4, v2

    .line 676
    if-ge v1, v4, :cond_1f

    .line 677
    .line 678
    const v1, 0x6d5c3f91

    .line 679
    .line 680
    .line 681
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 682
    .line 683
    .line 684
    const/4 v1, 0x0

    .line 685
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 686
    .line 687
    .line 688
    :goto_10
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 689
    .line 690
    .line 691
    goto :goto_11

    .line 692
    :cond_1f
    const v1, 0x3e2be71f

    .line 693
    .line 694
    .line 695
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 696
    .line 697
    .line 698
    goto :goto_10

    .line 699
    :goto_11
    move v1, v5

    .line 700
    goto :goto_f

    .line 701
    :cond_20
    invoke-static {}, La/a;->Q0()V

    .line 702
    .line 703
    .line 704
    const/4 p1, 0x0

    .line 705
    throw p1

    .line 706
    :cond_21
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 707
    .line 708
    .line 709
    goto :goto_12

    .line 710
    :cond_22
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 711
    .line 712
    .line 713
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 714
    .line 715
    return-object p1

    .line 716
    nop

    .line 717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
