.class public final synthetic Lwb/lf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/lf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/lf;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/lf;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/lf;->j:Lfg/p;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/lf;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    and-int/2addr p2, v2

    .line 25
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_c

    .line 30
    .line 31
    iget-object p2, p0, Lwb/lf;->h:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const p2, 0x104512e1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 43
    .line 44
    .line 45
    const-string p2, "\u6682\u65e0\u6a21\u677f\u3002\u65b0\u589e\u540e\u53ef\u6279\u91cf\u5957\u7528\u5230\u76d1\u542c\u7fa4\u3002"

    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const v0, 0x10469813

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move v1, v3

    .line 67
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_b

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    add-int/lit8 v5, v1, 0x1

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    if-ltz v1, :cond_a

    .line 81
    .line 82
    check-cast v4, Lq9/g;

    .line 83
    .line 84
    iget-object v7, v4, Lq9/g;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_2

    .line 91
    .line 92
    const-string v7, "\u6a21\u677f "

    .line 93
    .line 94
    invoke-static {v5, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    :cond_2
    invoke-static {v4}, Lwb/ho;->n5(Lq9/g;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    iget-object v9, p0, Lwb/lf;->i:Ljava/util/List;

    .line 103
    .line 104
    if-eqz v9, :cond_3

    .line 105
    .line 106
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_3

    .line 111
    .line 112
    move v10, v3

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    move v10, v3

    .line 119
    :cond_4
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_6

    .line 124
    .line 125
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    check-cast v11, Lq9/h;

    .line 130
    .line 131
    iget-object v11, v11, Lq9/h;->c:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v12, v4, Lq9/g;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_4

    .line 140
    .line 141
    add-int/lit8 v10, v10, 0x1

    .line 142
    .line 143
    if-ltz v10, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-static {}, La/a;->P0()V

    .line 147
    .line 148
    .line 149
    throw v6

    .line 150
    :cond_6
    :goto_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v8, " \u00b7 \u5df2\u7ed1\u5b9a "

    .line 159
    .line 160
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v8, " \u4e2a\u7fa4"

    .line 167
    .line 168
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    iget-object v8, p0, Lwb/lf;->j:Lfg/p;

    .line 176
    .line 177
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    invoke-virtual {p1, v1}, Li0/h0;->d(I)Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    or-int/2addr v9, v10

    .line 186
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    or-int/2addr v9, v10

    .line 191
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    if-nez v9, :cond_7

    .line 196
    .line 197
    sget-object v9, Li0/l;->a:Li0/e;

    .line 198
    .line 199
    if-ne v10, v9, :cond_8

    .line 200
    .line 201
    :cond_7
    new-instance v10, Lhb/e0;

    .line 202
    .line 203
    const/16 v9, 0x9

    .line 204
    .line 205
    invoke-direct {v10, v8, v1, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    check-cast v10, Lfg/a;

    .line 212
    .line 213
    invoke-static {v7, v6, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    sub-int/2addr v4, v2

    .line 221
    if-ge v1, v4, :cond_9

    .line 222
    .line 223
    const v1, -0x5fcfffd4

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 227
    .line 228
    .line 229
    const/4 v1, 0x0

    .line 230
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 231
    .line 232
    .line 233
    :goto_4
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_9
    const v1, 0x65d039e4

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :goto_5
    move v1, v5

    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :cond_a
    invoke-static {}, La/a;->Q0()V

    .line 248
    .line 249
    .line 250
    throw v6

    .line 251
    :cond_b
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_c
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 256
    .line 257
    .line 258
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 259
    .line 260
    return-object p1

    .line 261
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 262
    .line 263
    const/4 v1, 0x2

    .line 264
    const/4 v2, 0x1

    .line 265
    const/4 v3, 0x0

    .line 266
    if-eq v0, v1, :cond_d

    .line 267
    .line 268
    move v0, v2

    .line 269
    goto :goto_7

    .line 270
    :cond_d
    move v0, v3

    .line 271
    :goto_7
    and-int/2addr p2, v2

    .line 272
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-eqz p2, :cond_19

    .line 277
    .line 278
    iget-object p2, p0, Lwb/lf;->h:Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_e

    .line 285
    .line 286
    const p2, -0x4c19e3e6

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 290
    .line 291
    .line 292
    const-string p2, "\u6682\u65e0\u6a21\u677f\u3002\u6a21\u677f\u4fdd\u5b58\u4e00\u6574\u5957\u8fdb\u9000\u7fa4\u56de\u590d\u914d\u7f6e\uff0c\u518d\u6279\u91cf\u5957\u7528\u5230\u76d1\u542c\u7fa4\u3002"

    .line 293
    .line 294
    const/4 v0, 0x6

    .line 295
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_d

    .line 302
    .line 303
    :cond_e
    const v0, -0x4c182c73

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    move v1, v3

    .line 314
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_18

    .line 319
    .line 320
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    add-int/lit8 v5, v1, 0x1

    .line 325
    .line 326
    const/4 v6, 0x0

    .line 327
    if-ltz v1, :cond_17

    .line 328
    .line 329
    check-cast v4, Lo9/q;

    .line 330
    .line 331
    iget-object v7, p0, Lwb/lf;->i:Ljava/util/List;

    .line 332
    .line 333
    if-eqz v7, :cond_f

    .line 334
    .line 335
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    if-eqz v8, :cond_f

    .line 340
    .line 341
    move v8, v3

    .line 342
    goto :goto_a

    .line 343
    :cond_f
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    move v8, v3

    .line 348
    :cond_10
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-eqz v9, :cond_12

    .line 353
    .line 354
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    check-cast v9, Lo9/r;

    .line 359
    .line 360
    iget-object v9, v9, Lo9/r;->c:Ljava/lang/String;

    .line 361
    .line 362
    iget-object v10, v4, Lo9/q;->a:Ljava/lang/String;

    .line 363
    .line 364
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    if-eqz v9, :cond_10

    .line 369
    .line 370
    add-int/lit8 v8, v8, 0x1

    .line 371
    .line 372
    if-ltz v8, :cond_11

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_11
    invoke-static {}, La/a;->P0()V

    .line 376
    .line 377
    .line 378
    throw v6

    .line 379
    :cond_12
    :goto_a
    iget-object v6, v4, Lo9/q;->b:Ljava/lang/String;

    .line 380
    .line 381
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    if-eqz v7, :cond_13

    .line 386
    .line 387
    const-string v6, "\u6a21\u677f "

    .line 388
    .line 389
    invoke-static {v5, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    :cond_13
    invoke-static {v4}, Lwb/ho;->m5(Lo9/q;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    new-instance v9, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v7, " \u00b7 \u5df2\u7ed1\u5b9a "

    .line 406
    .line 407
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v7, " \u4e2a\u7fa4"

    .line 414
    .line 415
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    iget-object v8, p0, Lwb/lf;->j:Lfg/p;

    .line 423
    .line 424
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    invoke-virtual {p1, v1}, Li0/h0;->d(I)Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    or-int/2addr v9, v10

    .line 433
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    or-int/2addr v9, v10

    .line 438
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    if-nez v9, :cond_14

    .line 443
    .line 444
    sget-object v9, Li0/l;->a:Li0/e;

    .line 445
    .line 446
    if-ne v10, v9, :cond_15

    .line 447
    .line 448
    :cond_14
    new-instance v10, Lhb/e0;

    .line 449
    .line 450
    const/4 v9, 0x4

    .line 451
    invoke-direct {v10, v8, v1, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {p1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_15
    check-cast v10, Lfg/a;

    .line 458
    .line 459
    invoke-static {v6, v7, v10, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 460
    .line 461
    .line 462
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    sub-int/2addr v4, v2

    .line 467
    if-ge v1, v4, :cond_16

    .line 468
    .line 469
    const v1, 0x1bc4279a

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 473
    .line 474
    .line 475
    const/4 v1, 0x0

    .line 476
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 477
    .line 478
    .line 479
    :goto_b
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 480
    .line 481
    .line 482
    goto :goto_c

    .line 483
    :cond_16
    const v1, 0x5cc10036

    .line 484
    .line 485
    .line 486
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 487
    .line 488
    .line 489
    goto :goto_b

    .line 490
    :goto_c
    move v1, v5

    .line 491
    goto/16 :goto_8

    .line 492
    .line 493
    :cond_17
    invoke-static {}, La/a;->Q0()V

    .line 494
    .line 495
    .line 496
    throw v6

    .line 497
    :cond_18
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 498
    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_19
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 502
    .line 503
    .line 504
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 505
    .line 506
    return-object p1

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
