.class public final synthetic Lsh/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/p;


# direct methods
.method public synthetic constructor <init>(ILfg/p;)V
    .locals 0

    .line 1
    iput p1, p0, Lsh/i0;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lsh/i0;->h:Lfg/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lsh/i0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

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
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-static {p1, v3}, Lci/k0;->a(Li0/h0;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 39
    .line 40
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 45
    .line 46
    .line 47
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    and-int/lit8 v0, p2, 0x3

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    const/4 v2, 0x1

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eq v0, v1, :cond_2

    .line 64
    .line 65
    move v0, v2

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v0, v3

    .line 68
    :goto_2
    and-int/2addr p2, v2

    .line 69
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    invoke-static {p1, v3}, Lci/k0;->a(Li0/h0;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 83
    .line 84
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 89
    .line 90
    .line 91
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_1
    check-cast p1, Lv0/b;

    .line 95
    .line 96
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 97
    .line 98
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x0

    .line 109
    :goto_4
    if-ge v1, v0, :cond_6

    .line 110
    .line 111
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    iget-object v3, p1, Lv0/b;->h:Lv0/f;

    .line 118
    .line 119
    if-eqz v3, :cond_5

    .line 120
    .line 121
    invoke-interface {v3, v2}, Lv0/f;->a(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_4

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string p2, "item at index "

    .line 131
    .line 132
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p2, " can\'t be saved: "

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p2

    .line 160
    :cond_5
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_6
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_7

    .line 168
    .line 169
    new-instance p1, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_7
    const/4 p1, 0x0

    .line 176
    :goto_6
    return-object p1

    .line 177
    :pswitch_2
    check-cast p1, Li0/h0;

    .line 178
    .line 179
    check-cast p2, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    and-int/lit8 v0, p2, 0x3

    .line 186
    .line 187
    const/4 v1, 0x2

    .line 188
    const/4 v2, 0x0

    .line 189
    const/4 v3, 0x1

    .line 190
    if-eq v0, v1, :cond_8

    .line 191
    .line 192
    move v0, v3

    .line 193
    goto :goto_7

    .line 194
    :cond_8
    move v0, v2

    .line 195
    :goto_7
    and-int/2addr p2, v3

    .line 196
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-eqz p2, :cond_a

    .line 201
    .line 202
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 203
    .line 204
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    iget-wide v0, p1, Li0/h0;->T:J

    .line 209
    .line 210
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 219
    .line 220
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 230
    .line 231
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 232
    .line 233
    .line 234
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 235
    .line 236
    if-eqz v6, :cond_9

    .line 237
    .line 238
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_9
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 243
    .line 244
    .line 245
    :goto_8
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 246
    .line 247
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 251
    .line 252
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 260
    .line 261
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 262
    .line 263
    .line 264
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 265
    .line 266
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 267
    .line 268
    .line 269
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 270
    .line 271
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 279
    .line 280
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_a
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 288
    .line 289
    .line 290
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 291
    .line 292
    return-object p1

    .line 293
    :pswitch_3
    check-cast p1, Li0/h0;

    .line 294
    .line 295
    check-cast p2, Ljava/lang/Integer;

    .line 296
    .line 297
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result p2

    .line 301
    and-int/lit8 v0, p2, 0x3

    .line 302
    .line 303
    const/4 v1, 0x2

    .line 304
    const/4 v2, 0x0

    .line 305
    const/4 v3, 0x1

    .line 306
    if-eq v0, v1, :cond_b

    .line 307
    .line 308
    move v0, v3

    .line 309
    goto :goto_a

    .line 310
    :cond_b
    move v0, v2

    .line 311
    :goto_a
    and-int/2addr p2, v3

    .line 312
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 313
    .line 314
    .line 315
    move-result p2

    .line 316
    if-eqz p2, :cond_d

    .line 317
    .line 318
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 319
    .line 320
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    iget-wide v0, p1, Li0/h0;->T:J

    .line 325
    .line 326
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 335
    .line 336
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 346
    .line 347
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 348
    .line 349
    .line 350
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 351
    .line 352
    if-eqz v6, :cond_c

    .line 353
    .line 354
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 355
    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_c
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 359
    .line 360
    .line 361
    :goto_b
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 362
    .line 363
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 367
    .line 368
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 376
    .line 377
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 378
    .line 379
    .line 380
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 381
    .line 382
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 383
    .line 384
    .line 385
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 386
    .line 387
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 395
    .line 396
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 400
    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 404
    .line 405
    .line 406
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 407
    .line 408
    return-object p1

    .line 409
    :pswitch_4
    check-cast p1, Li0/h0;

    .line 410
    .line 411
    check-cast p2, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 414
    .line 415
    .line 416
    move-result p2

    .line 417
    and-int/lit8 v0, p2, 0x3

    .line 418
    .line 419
    const/4 v1, 0x2

    .line 420
    const/4 v2, 0x0

    .line 421
    const/4 v3, 0x1

    .line 422
    if-eq v0, v1, :cond_e

    .line 423
    .line 424
    move v0, v3

    .line 425
    goto :goto_d

    .line 426
    :cond_e
    move v0, v2

    .line 427
    :goto_d
    and-int/2addr p2, v3

    .line 428
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    if-eqz p2, :cond_10

    .line 433
    .line 434
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 435
    .line 436
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    iget-wide v0, p1, Li0/h0;->T:J

    .line 441
    .line 442
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 451
    .line 452
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 457
    .line 458
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 462
    .line 463
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 464
    .line 465
    .line 466
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 467
    .line 468
    if-eqz v6, :cond_f

    .line 469
    .line 470
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 471
    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_f
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 475
    .line 476
    .line 477
    :goto_e
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 478
    .line 479
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 483
    .line 484
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object p2

    .line 491
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 492
    .line 493
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 494
    .line 495
    .line 496
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 497
    .line 498
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 499
    .line 500
    .line 501
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 502
    .line 503
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object p2

    .line 510
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 511
    .line 512
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 516
    .line 517
    .line 518
    goto :goto_f

    .line 519
    :cond_10
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 520
    .line 521
    .line 522
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 523
    .line 524
    return-object p1

    .line 525
    :pswitch_5
    check-cast p1, Li0/h0;

    .line 526
    .line 527
    check-cast p2, Ljava/lang/Integer;

    .line 528
    .line 529
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result p2

    .line 533
    and-int/lit8 v0, p2, 0x3

    .line 534
    .line 535
    const/4 v1, 0x2

    .line 536
    const/4 v2, 0x0

    .line 537
    const/4 v3, 0x1

    .line 538
    if-eq v0, v1, :cond_11

    .line 539
    .line 540
    move v0, v3

    .line 541
    goto :goto_10

    .line 542
    :cond_11
    move v0, v2

    .line 543
    :goto_10
    and-int/2addr p2, v3

    .line 544
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 545
    .line 546
    .line 547
    move-result p2

    .line 548
    if-eqz p2, :cond_13

    .line 549
    .line 550
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 551
    .line 552
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 553
    .line 554
    .line 555
    move-result-object p2

    .line 556
    iget-wide v0, p1, Li0/h0;->T:J

    .line 557
    .line 558
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 567
    .line 568
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 573
    .line 574
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 578
    .line 579
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 580
    .line 581
    .line 582
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 583
    .line 584
    if-eqz v6, :cond_12

    .line 585
    .line 586
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 587
    .line 588
    .line 589
    goto :goto_11

    .line 590
    :cond_12
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 591
    .line 592
    .line 593
    :goto_11
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 594
    .line 595
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 599
    .line 600
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object p2

    .line 607
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 608
    .line 609
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 610
    .line 611
    .line 612
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 613
    .line 614
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 615
    .line 616
    .line 617
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 618
    .line 619
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object p2

    .line 626
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 627
    .line 628
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 632
    .line 633
    .line 634
    goto :goto_12

    .line 635
    :cond_13
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 636
    .line 637
    .line 638
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 639
    .line 640
    return-object p1

    .line 641
    :pswitch_6
    check-cast p1, Li0/h0;

    .line 642
    .line 643
    check-cast p2, Ljava/lang/Integer;

    .line 644
    .line 645
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 646
    .line 647
    .line 648
    move-result p2

    .line 649
    and-int/lit8 v0, p2, 0x3

    .line 650
    .line 651
    const/4 v1, 0x2

    .line 652
    const/4 v2, 0x0

    .line 653
    const/4 v3, 0x1

    .line 654
    if-eq v0, v1, :cond_14

    .line 655
    .line 656
    move v0, v3

    .line 657
    goto :goto_13

    .line 658
    :cond_14
    move v0, v2

    .line 659
    :goto_13
    and-int/2addr p2, v3

    .line 660
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 661
    .line 662
    .line 663
    move-result p2

    .line 664
    if-eqz p2, :cond_16

    .line 665
    .line 666
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 667
    .line 668
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 669
    .line 670
    .line 671
    move-result-object p2

    .line 672
    iget-wide v0, p1, Li0/h0;->T:J

    .line 673
    .line 674
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 683
    .line 684
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 689
    .line 690
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 694
    .line 695
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 696
    .line 697
    .line 698
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 699
    .line 700
    if-eqz v6, :cond_15

    .line 701
    .line 702
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 703
    .line 704
    .line 705
    goto :goto_14

    .line 706
    :cond_15
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 707
    .line 708
    .line 709
    :goto_14
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 710
    .line 711
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 715
    .line 716
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object p2

    .line 723
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 724
    .line 725
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 726
    .line 727
    .line 728
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 729
    .line 730
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 731
    .line 732
    .line 733
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 734
    .line 735
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object p2

    .line 742
    iget-object v0, p0, Lsh/i0;->h:Lfg/p;

    .line 743
    .line 744
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 748
    .line 749
    .line 750
    goto :goto_15

    .line 751
    :cond_16
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 752
    .line 753
    .line 754
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 755
    .line 756
    return-object p1

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
