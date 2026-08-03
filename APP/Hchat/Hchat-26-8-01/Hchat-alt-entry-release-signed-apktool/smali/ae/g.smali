.class public final synthetic Lae/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lae/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lae/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget v0, p0, Lae/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/function/Consumer;

    .line 9
    .line 10
    check-cast p1, Lyd/b;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lyd/b;->P(Ljava/util/function/Consumer;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lxe/l;

    .line 29
    .line 30
    check-cast p1, Lbe/a;

    .line 31
    .line 32
    iget-object v0, v0, Lxe/l;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 35
    .line 36
    invoke-virtual {p1}, Lbe/a;->e()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lte/b;

    .line 47
    .line 48
    check-cast p1, Ljava/util/function/Consumer;

    .line 49
    .line 50
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ltd/b;

    .line 57
    .line 58
    check-cast p1, Lud/p;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lud/p;->V(Lud/p;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lpd/n;

    .line 67
    .line 68
    check-cast p1, Lqd/l;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lud/p;->I(Lqd/l;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_5
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lf5/g;

    .line 77
    .line 78
    check-cast p1, Lqd/r;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lf5/g;->c(Lqd/l;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_6
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lqe/n;

    .line 87
    .line 88
    check-cast p1, Lqd/s;

    .line 89
    .line 90
    iget-object v1, p1, Lqd/s;->l:Lp4/t;

    .line 91
    .line 92
    iget-object v2, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 97
    .line 98
    .line 99
    iget-object v2, p1, Lqd/s;->i:Lqd/r;

    .line 100
    .line 101
    iget-object v3, v2, Lqd/r;->m:Lqd/s;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    if-eqz v3, :cond_0

    .line 105
    .line 106
    invoke-virtual {v3}, Lqd/s;->d()Lqd/j;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    sget-object v3, Lmd/a;->N:Lmd/a;

    .line 112
    .line 113
    iget-object v5, v2, Lmd/e;->g:Lmd/f;

    .line 114
    .line 115
    invoke-virtual {v5, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_1

    .line 120
    .line 121
    iget-object v3, v2, Lqd/l;->i:Lqd/j;

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    move-object v3, v4

    .line 125
    :goto_0
    const/4 v5, 0x0

    .line 126
    sget-object v6, Lmd/a;->Y:Lmd/a;

    .line 127
    .line 128
    const/4 v7, 0x1

    .line 129
    if-eqz v3, :cond_2

    .line 130
    .line 131
    new-instance v2, Lqe/g;

    .line 132
    .line 133
    invoke-direct {v2, v7, v5, v3}, Lqe/g;-><init>(IILqd/j;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v2}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_8

    .line 140
    .line 141
    :cond_2
    iget-object v3, v2, Lqd/l;->j:Lud/p;

    .line 142
    .line 143
    if-eqz v3, :cond_13

    .line 144
    .line 145
    iget-object v8, v3, Lud/p;->l:Lqd/r;

    .line 146
    .line 147
    if-nez v8, :cond_3

    .line 148
    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_3
    iget-object v2, v3, Lud/p;->k:Lpd/k;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_12

    .line 158
    .line 159
    const/16 v8, 0xc

    .line 160
    .line 161
    if-eq v2, v8, :cond_10

    .line 162
    .line 163
    const/16 v8, 0x14

    .line 164
    .line 165
    if-eq v2, v8, :cond_e

    .line 166
    .line 167
    const/16 v8, 0x22

    .line 168
    .line 169
    if-eq v2, v8, :cond_a

    .line 170
    .line 171
    const/16 v8, 0x26

    .line 172
    .line 173
    if-eq v2, v8, :cond_7

    .line 174
    .line 175
    const/16 v8, 0x1d

    .line 176
    .line 177
    if-eq v2, v8, :cond_6

    .line 178
    .line 179
    const/16 v8, 0x1e

    .line 180
    .line 181
    if-eq v2, v8, :cond_4

    .line 182
    .line 183
    iget-object v2, v3, Lud/p;->l:Lqd/r;

    .line 184
    .line 185
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 186
    .line 187
    new-instance v3, Lqe/g;

    .line 188
    .line 189
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v3}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_8

    .line 196
    .line 197
    :cond_4
    check-cast v3, Lpd/j;

    .line 198
    .line 199
    iget-object v2, v3, Lud/p;->l:Lqd/r;

    .line 200
    .line 201
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 202
    .line 203
    invoke-virtual {v2}, Lqd/j;->c()Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_5

    .line 208
    .line 209
    new-instance v7, Lqe/h;

    .line 210
    .line 211
    iget-object v8, v0, Lqe/n;->g:Lud/u;

    .line 212
    .line 213
    invoke-direct {v7, v8, v3, v2}, Lqe/h;-><init>(Lud/u;Lpd/j;Lqd/j;)V

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_5
    new-instance v3, Lqe/g;

    .line 218
    .line 219
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 220
    .line 221
    .line 222
    move-object v7, v3

    .line 223
    :goto_1
    invoke-static {v1, v7}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_8

    .line 227
    .line 228
    :cond_6
    check-cast v3, Lpd/j;

    .line 229
    .line 230
    iget-object v2, v3, Lpd/j;->o:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, Lqd/j;

    .line 233
    .line 234
    new-instance v3, Lqe/g;

    .line 235
    .line 236
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v3}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_8

    .line 243
    .line 244
    :cond_7
    check-cast v3, Ltd/a;

    .line 245
    .line 246
    iget v2, v3, Ltd/a;->p:I

    .line 247
    .line 248
    if-ne v2, v7, :cond_8

    .line 249
    .line 250
    move v2, v7

    .line 251
    goto :goto_2

    .line 252
    :cond_8
    move v2, v5

    .line 253
    :goto_2
    iget-object v3, v3, Ltd/a;->o:Lod/d;

    .line 254
    .line 255
    if-eqz v2, :cond_9

    .line 256
    .line 257
    iget-object v2, v0, Lqe/n;->g:Lud/u;

    .line 258
    .line 259
    iget-object v8, v3, Lod/d;->j:Lod/a;

    .line 260
    .line 261
    invoke-virtual {v2, v8}, Lud/u;->f(Lod/a;)Lud/e;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    if-eqz v2, :cond_9

    .line 266
    .line 267
    sget-object v8, Lmd/a;->s:Lmd/a;

    .line 268
    .line 269
    iget-object v9, v2, Lmd/e;->g:Lmd/f;

    .line 270
    .line 271
    invoke-virtual {v9, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_9

    .line 276
    .line 277
    sget-object v8, Lmd/b;->h:Lmd/b;

    .line 278
    .line 279
    iget-object v2, v2, Lmd/e;->g:Lmd/f;

    .line 280
    .line 281
    invoke-virtual {v2, v8}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, Lnd/a;

    .line 286
    .line 287
    if-eqz v2, :cond_9

    .line 288
    .line 289
    iget v8, v2, Lnd/a;->i:I

    .line 290
    .line 291
    if-ne v8, v7, :cond_9

    .line 292
    .line 293
    iget-object v2, v2, Lnd/a;->h:Lqd/j;

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_9
    iget-object v2, v3, Lod/d;->j:Lod/a;

    .line 297
    .line 298
    iget-object v2, v2, Lod/a;->g:Lqd/j;

    .line 299
    .line 300
    :goto_3
    new-instance v3, Lqe/g;

    .line 301
    .line 302
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v1, v3}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_8

    .line 309
    .line 310
    :cond_a
    check-cast v3, Lpd/n;

    .line 311
    .line 312
    iget-object v2, v3, Lpd/n;->p:Lod/d;

    .line 313
    .line 314
    iget-object v2, v2, Lod/d;->h:Lqd/j;

    .line 315
    .line 316
    iget-object v8, v0, Lqe/n;->g:Lud/u;

    .line 317
    .line 318
    iget-object v8, v8, Lud/u;->h:Lfe/a;

    .line 319
    .line 320
    invoke-virtual {v8, v3}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    if-eqz v8, :cond_b

    .line 325
    .line 326
    invoke-interface {v8}, Lud/m;->e()Lqd/j;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    if-eqz v8, :cond_b

    .line 331
    .line 332
    invoke-virtual {v8}, Lqd/j;->b()Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-eqz v9, :cond_b

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_b
    move-object v8, v4

    .line 340
    :goto_4
    if-eqz v8, :cond_d

    .line 341
    .line 342
    invoke-virtual {v8}, Lqd/j;->c()Z

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    if-eqz v9, :cond_c

    .line 347
    .line 348
    iget v9, v3, Lpd/n;->o:I

    .line 349
    .line 350
    iget-object v10, v3, Lud/p;->m:Ljava/util/List;

    .line 351
    .line 352
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    if-eqz v10, :cond_d

    .line 357
    .line 358
    if-eq v9, v7, :cond_d

    .line 359
    .line 360
    const/4 v10, 0x5

    .line 361
    if-eq v9, v10, :cond_d

    .line 362
    .line 363
    new-instance v2, Lqe/i;

    .line 364
    .line 365
    iget-object v7, v0, Lqe/n;->g:Lud/u;

    .line 366
    .line 367
    invoke-direct {v2, v7, v3, v8}, Lqe/i;-><init>(Lud/u;Lpd/n;Lqd/j;)V

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_c
    move-object v2, v8

    .line 372
    :cond_d
    new-instance v3, Lqe/g;

    .line 373
    .line 374
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 375
    .line 376
    .line 377
    move-object v2, v3

    .line 378
    :goto_5
    invoke-static {v1, v2}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_e
    iget-object v2, v3, Lmd/e;->g:Lmd/f;

    .line 383
    .line 384
    invoke-virtual {v2, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_f

    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_f
    new-instance v2, Lqe/f;

    .line 392
    .line 393
    iget-object v7, v0, Lqe/n;->g:Lud/u;

    .line 394
    .line 395
    check-cast v3, Lpd/j;

    .line 396
    .line 397
    invoke-direct {v2, v7, v3}, Lqe/f;-><init>(Lud/u;Lpd/j;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v1, v2}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 401
    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_10
    sget-object v2, Lmd/b;->E:Lmd/b;

    .line 405
    .line 406
    iget-object v8, v3, Lmd/e;->g:Lmd/f;

    .line 407
    .line 408
    invoke-virtual {v8, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    check-cast v2, Lae/c;

    .line 413
    .line 414
    if-eqz v2, :cond_11

    .line 415
    .line 416
    iget-object v2, v2, Lae/c;->g:Lae/f;

    .line 417
    .line 418
    iget-object v2, v2, Lae/f;->a:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-eqz v3, :cond_14

    .line 429
    .line 430
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    check-cast v3, Lod/a;

    .line 435
    .line 436
    new-instance v8, Lqe/g;

    .line 437
    .line 438
    iget-object v3, v3, Lod/a;->g:Lqd/j;

    .line 439
    .line 440
    invoke-direct {v8, v7, v5, v3}, Lqe/g;-><init>(IILqd/j;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v1, v8}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 444
    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_11
    new-instance v2, Lqe/g;

    .line 448
    .line 449
    iget-object v3, v3, Lud/p;->l:Lqd/r;

    .line 450
    .line 451
    iget-object v3, v3, Lqd/l;->i:Lqd/j;

    .line 452
    .line 453
    invoke-direct {v2, v7, v5, v3}, Lqe/g;-><init>(IILqd/j;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v1, v2}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 457
    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_12
    invoke-virtual {v3, v5}, Lud/p;->S(I)Lqd/l;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Lqd/n;

    .line 465
    .line 466
    new-instance v3, Lqe/g;

    .line 467
    .line 468
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 469
    .line 470
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v1, v3}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 474
    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_13
    :goto_7
    new-instance v3, Lqe/g;

    .line 478
    .line 479
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 480
    .line 481
    invoke-direct {v3, v7, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 482
    .line 483
    .line 484
    invoke-static {v1, v3}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 485
    .line 486
    .line 487
    :cond_14
    :goto_8
    iget-object p1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_1d

    .line 498
    .line 499
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    check-cast v2, Lqd/r;

    .line 504
    .line 505
    iget-object v3, v2, Lqd/l;->j:Lud/p;

    .line 506
    .line 507
    if-nez v3, :cond_15

    .line 508
    .line 509
    :goto_a
    move-object v10, v4

    .line 510
    goto/16 :goto_d

    .line 511
    .line 512
    :cond_15
    instance-of v7, v3, Lpd/b;

    .line 513
    .line 514
    const/4 v8, 0x2

    .line 515
    if-eqz v7, :cond_1b

    .line 516
    .line 517
    move-object v7, v3

    .line 518
    check-cast v7, Lpd/b;

    .line 519
    .line 520
    invoke-virtual {v7}, Lpd/b;->k0()Lqd/l;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    if-nez v9, :cond_17

    .line 525
    .line 526
    :cond_16
    :goto_b
    move-object v10, v4

    .line 527
    goto :goto_c

    .line 528
    :cond_17
    iget-object v10, v0, Lqe/n;->g:Lud/u;

    .line 529
    .line 530
    iget-object v10, v10, Lud/u;->h:Lfe/a;

    .line 531
    .line 532
    invoke-virtual {v10, v7}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 533
    .line 534
    .line 535
    move-result-object v10

    .line 536
    if-nez v10, :cond_18

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :cond_18
    if-eq v9, v2, :cond_1a

    .line 540
    .line 541
    invoke-virtual {v7, v2}, Lud/p;->T(Lqd/l;)I

    .line 542
    .line 543
    .line 544
    move-result v9

    .line 545
    invoke-virtual {v7}, Lpd/b;->j0()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    sub-int/2addr v9, v11

    .line 550
    invoke-interface {v10}, Lud/m;->c()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    check-cast v9, Lqd/j;

    .line 559
    .line 560
    invoke-virtual {v9}, Lqd/j;->c()Z

    .line 561
    .line 562
    .line 563
    move-result v10

    .line 564
    if-nez v10, :cond_19

    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_19
    new-instance v10, Lqe/j;

    .line 568
    .line 569
    iget-object v11, v0, Lqe/n;->g:Lud/u;

    .line 570
    .line 571
    invoke-direct {v10, v11, v7, v2, v9}, Lqe/j;-><init>(Lud/u;Lpd/b;Lqd/r;Lqd/j;)V

    .line 572
    .line 573
    .line 574
    goto :goto_c

    .line 575
    :cond_1a
    instance-of v7, v10, Lud/r;

    .line 576
    .line 577
    if-eqz v7, :cond_16

    .line 578
    .line 579
    check-cast v10, Lud/r;

    .line 580
    .line 581
    invoke-static {v10}, Lfe/a;->h(Lud/r;)Lod/a;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    new-instance v10, Lqe/g;

    .line 586
    .line 587
    iget-object v7, v7, Lod/a;->g:Lqd/j;

    .line 588
    .line 589
    invoke-direct {v10, v8, v5, v7}, Lqe/g;-><init>(IILqd/j;)V

    .line 590
    .line 591
    .line 592
    :goto_c
    if-eqz v10, :cond_1b

    .line 593
    .line 594
    goto :goto_d

    .line 595
    :cond_1b
    iget-object v7, v3, Lud/p;->k:Lpd/k;

    .line 596
    .line 597
    sget-object v9, Lpd/k;->A:Lpd/k;

    .line 598
    .line 599
    if-ne v7, v9, :cond_1c

    .line 600
    .line 601
    iget-object v3, v3, Lmd/e;->g:Lmd/f;

    .line 602
    .line 603
    invoke-virtual {v3, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-eqz v3, :cond_1c

    .line 608
    .line 609
    goto :goto_a

    .line 610
    :cond_1c
    new-instance v10, Lqe/g;

    .line 611
    .line 612
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 613
    .line 614
    invoke-direct {v10, v8, v5, v2}, Lqe/g;-><init>(IILqd/j;)V

    .line 615
    .line 616
    .line 617
    :goto_d
    invoke-static {v1, v10}, Lqe/n;->i(Lp4/t;Lqe/d;)V

    .line 618
    .line 619
    .line 620
    goto :goto_9

    .line 621
    :cond_1d
    return-void

    .line 622
    :pswitch_7
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, Lne/a;

    .line 625
    .line 626
    check-cast p1, Lud/e;

    .line 627
    .line 628
    invoke-virtual {v0, p1}, Lne/a;->h(Lud/e;)Z

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :pswitch_8
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v0, Lna/e;

    .line 635
    .line 636
    check-cast p1, Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    :pswitch_9
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v0, Ljava/util/Map;

    .line 645
    .line 646
    check-cast p1, Loc/b;

    .line 647
    .line 648
    invoke-interface {p1}, Loc/b;->a()Loc/a;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :pswitch_a
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, Loc/b;

    .line 659
    .line 660
    check-cast p1, Ljava/util/Map;

    .line 661
    .line 662
    invoke-interface {v0}, Loc/b;->a()Loc/a;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    return-void

    .line 670
    :pswitch_b
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, Loc/a;

    .line 673
    .line 674
    check-cast p1, Ljava/util/Map;

    .line 675
    .line 676
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    return-void

    .line 680
    :pswitch_c
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Ljava/util/Set;

    .line 683
    .line 684
    check-cast p1, Lud/a;

    .line 685
    .line 686
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    return-void

    .line 690
    :pswitch_d
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v0, Lhb/r;

    .line 693
    .line 694
    check-cast p1, Lud/h;

    .line 695
    .line 696
    iget-object v0, v0, Lhb/r;->d:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, Ljava/util/ArrayList;

    .line 699
    .line 700
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :pswitch_e
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Lfd/h;

    .line 707
    .line 708
    check-cast p1, Ljava/lang/Boolean;

    .line 709
    .line 710
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 711
    .line 712
    .line 713
    move-result p1

    .line 714
    iput-boolean p1, v0, Lfd/h;->g:Z

    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_f
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, Lae/f;

    .line 720
    .line 721
    check-cast p1, Lud/a;

    .line 722
    .line 723
    iget-object v0, v0, Lae/f;->d:Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :pswitch_10
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v0, Lze/c;

    .line 732
    .line 733
    check-cast p1, Lud/a;

    .line 734
    .line 735
    invoke-virtual {v0, p1}, Lze/c;->a(Lud/a;)V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_11
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v0, Lbsh/GeneratedClass;

    .line 742
    .line 743
    check-cast p1, Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {v0, p1}, Lbsh/This;->a(Lbsh/GeneratedClass;Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_12
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v0, Lbe/h0;

    .line 752
    .line 753
    check-cast p1, Lud/e;

    .line 754
    .line 755
    :try_start_0
    invoke-static {p1}, Lbe/h0;->k(Lud/e;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 756
    .line 757
    .line 758
    goto :goto_f

    .line 759
    :catch_0
    move-exception v1

    .line 760
    goto :goto_e

    .line 761
    :catch_1
    move-exception v1

    .line 762
    :goto_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    const-string v2, "Anonymous visitor error"

    .line 766
    .line 767
    invoke-static {p1, v2, v1}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 768
    .line 769
    .line 770
    :goto_f
    iget-object p1, p1, Lud/e;->v:Ljava/util/List;

    .line 771
    .line 772
    new-instance v1, Lae/g;

    .line 773
    .line 774
    const/4 v2, 0x4

    .line 775
    invoke-direct {v1, v0, v2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 776
    .line 777
    .line 778
    invoke-interface {p1, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 779
    .line 780
    .line 781
    return-void

    .line 782
    :pswitch_13
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 785
    .line 786
    check-cast p1, Lqd/l;

    .line 787
    .line 788
    check-cast p1, Lqd/r;

    .line 789
    .line 790
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 791
    .line 792
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    if-eqz v1, :cond_1e

    .line 797
    .line 798
    invoke-virtual {p1}, Lqd/s;->g()Ljava/util/List;

    .line 799
    .line 800
    .line 801
    move-result-object p1

    .line 802
    invoke-static {p1, v0}, Lbe/b;->v(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 803
    .line 804
    .line 805
    :cond_1e
    return-void

    .line 806
    :pswitch_14
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v0, Lqd/k;

    .line 809
    .line 810
    check-cast p1, Lqd/s;

    .line 811
    .line 812
    iget-object v1, p1, Lqd/s;->m:Lqd/k;

    .line 813
    .line 814
    if-eqz v1, :cond_21

    .line 815
    .line 816
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    iget-boolean v2, v1, Lqd/k;->f:Z

    .line 821
    .line 822
    const/4 v3, 0x1

    .line 823
    if-eqz v2, :cond_1f

    .line 824
    .line 825
    iput-boolean v3, v0, Lqd/k;->f:Z

    .line 826
    .line 827
    :cond_1f
    iget-boolean v2, v1, Lqd/k;->e:Z

    .line 828
    .line 829
    if-eqz v2, :cond_20

    .line 830
    .line 831
    iput-boolean v3, v0, Lqd/k;->e:Z

    .line 832
    .line 833
    :cond_20
    iget-boolean v1, v1, Lqd/k;->d:Z

    .line 834
    .line 835
    if-eqz v1, :cond_21

    .line 836
    .line 837
    iput-boolean v3, v0, Lqd/k;->d:Z

    .line 838
    .line 839
    :cond_21
    invoke-virtual {p1, v0}, Lqd/s;->m(Lqd/k;)V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :pswitch_15
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Lbe/d;

    .line 846
    .line 847
    check-cast p1, Lud/e;

    .line 848
    .line 849
    invoke-virtual {v0, p1}, Lbe/d;->h(Lud/e;)Z

    .line 850
    .line 851
    .line 852
    return-void

    .line 853
    :pswitch_16
    iget-object v0, p0, Lae/g;->b:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Lae/h;

    .line 856
    .line 857
    check-cast p1, Lae/f;

    .line 858
    .line 859
    iput-object v0, p1, Lae/f;->g:Lae/h;

    .line 860
    .line 861
    return-void

    .line 862
    nop

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
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
