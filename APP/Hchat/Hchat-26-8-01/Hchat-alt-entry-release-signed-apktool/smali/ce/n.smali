.class public final synthetic Lce/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lce/n;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lce/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr7/u;

    .line 7
    .line 8
    iget-object v0, p1, Lr7/u;->p:Lr7/s;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object p1, p1, Lr7/u;->m:Lo7/b;

    .line 15
    .line 16
    iget-object p1, p1, Lo7/b;->k:Lz7/c;

    .line 17
    .line 18
    invoke-virtual {p1}, Lz7/c;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    :goto_0
    xor-int/2addr v1, p1

    .line 28
    :goto_1
    return v1

    .line 29
    :pswitch_0
    check-cast p1, Lr7/n;

    .line 30
    .line 31
    invoke-virtual {p1}, Lr7/n;->N()Lr7/o;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget p1, p1, Lr7/f;->n:I

    .line 39
    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    :goto_2
    const/4 p1, 0x1

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    :goto_3
    return p1

    .line 46
    :pswitch_1
    check-cast p1, Lv7/d;

    .line 47
    .line 48
    invoke-virtual {p1}, Lv7/d;->y()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :pswitch_2
    check-cast p1, Lv7/d;

    .line 54
    .line 55
    invoke-virtual {p1}, Lv7/d;->y()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    xor-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    return p1

    .line 62
    :pswitch_3
    instance-of p1, p1, Lr7/t;

    .line 63
    .line 64
    xor-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    return p1

    .line 67
    :pswitch_4
    check-cast p1, Lqe/s;

    .line 68
    .line 69
    iget-boolean p1, p1, Lqe/s;->b:Z

    .line 70
    .line 71
    return p1

    .line 72
    :pswitch_5
    check-cast p1, Lqe/s;

    .line 73
    .line 74
    iget-boolean p1, p1, Lqe/s;->b:Z

    .line 75
    .line 76
    xor-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    return p1

    .line 79
    :pswitch_6
    const-class v0, Lqe/f;

    .line 80
    .line 81
    check-cast p1, Lqe/d;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    return p1

    .line 88
    :pswitch_7
    check-cast p1, Lqe/d;

    .line 89
    .line 90
    invoke-interface {p1}, Lqe/d;->getType()Lqd/j;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    instance-of p1, p1, Lqd/c;

    .line 98
    .line 99
    return p1

    .line 100
    :pswitch_8
    check-cast p1, Lud/p;

    .line 101
    .line 102
    iget-object p1, p1, Lud/p;->k:Lpd/k;

    .line 103
    .line 104
    sget-object v0, Lpd/k;->X:Lpd/k;

    .line 105
    .line 106
    if-ne p1, v0, :cond_4

    .line 107
    .line 108
    const/4 p1, 0x1

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    const/4 p1, 0x0

    .line 111
    :goto_4
    return p1

    .line 112
    :pswitch_9
    check-cast p1, Ljava/util/Map$Entry;

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Loc/b;

    .line 119
    .line 120
    invoke-interface {p1}, Loc/b;->r()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    xor-int/lit8 p1, p1, 0x1

    .line 125
    .line 126
    return p1

    .line 127
    :pswitch_a
    check-cast p1, Lm7/u;

    .line 128
    .line 129
    iget-object v0, p1, Lk7/a;->h:Lk7/a;

    .line 130
    .line 131
    const/4 v1, 0x1

    .line 132
    if-nez v0, :cond_5

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_5
    iget-object v0, p1, Lm7/b;->p:Lr7/f;

    .line 136
    .line 137
    iget v0, v0, Lr7/f;->n:I

    .line 138
    .line 139
    const/4 v2, -0x1

    .line 140
    if-ne v0, v2, :cond_6

    .line 141
    .line 142
    iget-object p1, p1, Lm7/b;->o:Lr7/f;

    .line 143
    .line 144
    iget p1, p1, Lr7/f;->n:I

    .line 145
    .line 146
    if-ne p1, v2, :cond_6

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_6
    const/4 v1, 0x0

    .line 150
    :goto_5
    return v1

    .line 151
    :pswitch_b
    check-cast p1, Lm7/j;

    .line 152
    .line 153
    invoke-virtual {p1}, Lm7/j;->R()Ld7/b;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 158
    .line 159
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_7

    .line 164
    .line 165
    invoke-virtual {p1}, Lm7/j;->V()Lm7/t;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v0, v0, Lm7/t;->w:Lm7/d;

    .line 170
    .line 171
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 172
    .line 173
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_7

    .line 178
    .line 179
    iget-object v0, p1, Lm7/q;->k:Lk7/c;

    .line 180
    .line 181
    check-cast v0, Lm7/k;

    .line 182
    .line 183
    iget-object v0, v0, Lm7/k;->m:Lm7/v;

    .line 184
    .line 185
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 186
    .line 187
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_7

    .line 192
    .line 193
    invoke-virtual {p1}, Lm7/j;->V()Lm7/t;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Lm7/b;->U()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Ly7/a;->f(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_7

    .line 206
    .line 207
    const/4 p1, 0x1

    .line 208
    goto :goto_6

    .line 209
    :cond_7
    const/4 p1, 0x0

    .line 210
    :goto_6
    return p1

    .line 211
    :pswitch_c
    check-cast p1, Lxd/c;

    .line 212
    .line 213
    iget-object v0, p1, Lxd/c;->a:Ljava/util/List;

    .line 214
    .line 215
    sget-object v1, Lxd/d;->m:Luf/d;

    .line 216
    .line 217
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    iget-object p1, p1, Lxd/c;->b:Lud/j;

    .line 224
    .line 225
    invoke-static {p1}, Lf8/i;->n0(Lud/j;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_8

    .line 230
    .line 231
    const/4 p1, 0x1

    .line 232
    goto :goto_7

    .line 233
    :cond_8
    const/4 p1, 0x0

    .line 234
    :goto_7
    return p1

    .line 235
    :pswitch_d
    check-cast p1, Ll7/f;

    .line 236
    .line 237
    invoke-virtual {p1}, Ll7/f;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    return p1

    .line 242
    :pswitch_e
    check-cast p1, Lud/p;

    .line 243
    .line 244
    iget-object p1, p1, Lud/p;->k:Lpd/k;

    .line 245
    .line 246
    sget-object v0, Lpd/k;->T:Lpd/k;

    .line 247
    .line 248
    if-ne p1, v0, :cond_9

    .line 249
    .line 250
    const/4 p1, 0x1

    .line 251
    goto :goto_8

    .line 252
    :cond_9
    const/4 p1, 0x0

    .line 253
    :goto_8
    return p1

    .line 254
    :pswitch_f
    check-cast p1, Lxd/c;

    .line 255
    .line 256
    iget-object p1, p1, Lxd/c;->a:Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/4 v1, 0x0

    .line 263
    const/4 v2, 0x1

    .line 264
    if-ne v0, v2, :cond_a

    .line 265
    .line 266
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    sget-object v0, Lxd/d;->m:Luf/d;

    .line 271
    .line 272
    if-ne p1, v0, :cond_a

    .line 273
    .line 274
    move v1, v2

    .line 275
    :cond_a
    return v1

    .line 276
    :pswitch_10
    check-cast p1, Lud/j;

    .line 277
    .line 278
    sget-object v0, Lmd/a;->u:Lmd/a;

    .line 279
    .line 280
    check-cast p1, Lmd/e;

    .line 281
    .line 282
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 283
    .line 284
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    return p1

    .line 289
    :pswitch_11
    check-cast p1, Lud/p;

    .line 290
    .line 291
    sget-object v0, Lmd/a;->O:Lmd/a;

    .line 292
    .line 293
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 294
    .line 295
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    return p1

    .line 300
    :pswitch_12
    check-cast p1, Lud/j;

    .line 301
    .line 302
    invoke-static {p1}, Lke/g;->t0(Lud/j;)Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    return p1

    .line 307
    :pswitch_13
    check-cast p1, Lk7/a;

    .line 308
    .line 309
    invoke-virtual {p1}, Lk7/a;->y()Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    xor-int/lit8 p1, p1, 0x1

    .line 314
    .line 315
    return p1

    .line 316
    :pswitch_14
    check-cast p1, Ll7/m;

    .line 317
    .line 318
    iget-object p1, p1, Ll7/m;->o:Ls7/b;

    .line 319
    .line 320
    const/4 v0, 0x1

    .line 321
    invoke-virtual {p1, v0}, Ls7/b;->n0(Z)Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    xor-int/2addr p1, v0

    .line 330
    return p1

    .line 331
    :pswitch_15
    check-cast p1, Ljava/util/List;

    .line 332
    .line 333
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    xor-int/lit8 p1, p1, 0x1

    .line 338
    .line 339
    return p1

    .line 340
    :pswitch_16
    check-cast p1, Lud/r;

    .line 341
    .line 342
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 343
    .line 344
    invoke-virtual {p1}, Lud/e;->a0()Lud/e;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    iget p1, p1, Lud/e;->y:I

    .line 349
    .line 350
    const/4 v0, 0x4

    .line 351
    if-eq p1, v0, :cond_c

    .line 352
    .line 353
    const/4 v0, 0x5

    .line 354
    if-ne p1, v0, :cond_b

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_b
    const/4 p1, 0x0

    .line 358
    goto :goto_a

    .line 359
    :cond_c
    :goto_9
    const/4 p1, 0x1

    .line 360
    :goto_a
    return p1

    .line 361
    :pswitch_17
    check-cast p1, Lud/a;

    .line 362
    .line 363
    sget-object v0, Lpd/k;->r:Lpd/k;

    .line 364
    .line 365
    invoke-static {p1, v0}, La/a;->v(Lud/h;Lpd/k;)Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    return p1

    .line 370
    :pswitch_18
    check-cast p1, Lae/h;

    .line 371
    .line 372
    iget-boolean v0, p1, Lae/h;->l:Z

    .line 373
    .line 374
    if-nez v0, :cond_e

    .line 375
    .line 376
    iget-object p1, p1, Lae/h;->h:Ljava/util/List;

    .line 377
    .line 378
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-eqz p1, :cond_d

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_d
    const/4 p1, 0x0

    .line 386
    goto :goto_c

    .line 387
    :cond_e
    :goto_b
    const/4 p1, 0x1

    .line 388
    :goto_c
    return p1

    .line 389
    :pswitch_19
    check-cast p1, Ljava/util/Map$Entry;

    .line 390
    .line 391
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Ljava/lang/Integer;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    const/4 v0, 0x3

    .line 402
    if-le p1, v0, :cond_f

    .line 403
    .line 404
    const/4 p1, 0x1

    .line 405
    goto :goto_d

    .line 406
    :cond_f
    const/4 p1, 0x0

    .line 407
    :goto_d
    return p1

    .line 408
    :pswitch_1a
    check-cast p1, Lud/a;

    .line 409
    .line 410
    sget-object v0, Lpd/k;->Z:Lpd/k;

    .line 411
    .line 412
    invoke-static {p1, v0}, La/a;->v(Lud/h;Lpd/k;)Z

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    return p1

    .line 417
    :pswitch_1b
    check-cast p1, Lnd/h0;

    .line 418
    .line 419
    iget p1, p1, Lnd/h0;->g:I

    .line 420
    .line 421
    const/4 v0, 0x2

    .line 422
    if-ne p1, v0, :cond_10

    .line 423
    .line 424
    const/4 p1, 0x1

    .line 425
    goto :goto_e

    .line 426
    :cond_10
    const/4 p1, 0x0

    .line 427
    :goto_e
    return p1

    .line 428
    :pswitch_1c
    check-cast p1, Lnd/h0;

    .line 429
    .line 430
    iget v0, p1, Lnd/h0;->g:I

    .line 431
    .line 432
    const/4 v1, 0x1

    .line 433
    if-ne v0, v1, :cond_11

    .line 434
    .line 435
    iget-object v0, p1, Lnd/h0;->i:Lud/a;

    .line 436
    .line 437
    iget-object p1, p1, Lnd/h0;->h:Lud/a;

    .line 438
    .line 439
    if-eq v0, p1, :cond_11

    .line 440
    .line 441
    iget-object p1, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 442
    .line 443
    iget v0, v0, Lud/a;->j:I

    .line 444
    .line 445
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    .line 446
    .line 447
    .line 448
    move-result p1

    .line 449
    if-eqz p1, :cond_12

    .line 450
    .line 451
    :cond_11
    const/4 v1, 0x0

    .line 452
    :cond_12
    return v1

    .line 453
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
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
