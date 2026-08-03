.class public final Lo7/f;
.super Lo7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lj7/d;

.field public final n:Ll7/c;

.field public final o:Ld7/b;

.field public final p:Ls7/e;

.field public final q:Lo7/b;

.field public final r:Lo7/b;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Lo7/e;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lj7/d;

    .line 6
    .line 7
    invoke-direct {v0}, Lk7/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo7/f;->m:Lj7/d;

    .line 11
    .line 12
    new-instance v1, Ll7/c;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, v2}, Ll7/c;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lo7/f;->n:Ll7/c;

    .line 19
    .line 20
    new-instance v2, Ld7/b;

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v2, v4, v3}, Ld7/b;-><init>(Lk7/f;I)V

    .line 25
    .line 26
    .line 27
    iput-object v2, p0, Lo7/f;->o:Ld7/b;

    .line 28
    .line 29
    new-instance v3, Ls7/e;

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lo7/b;-><init>(Lk7/f;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lo7/f;->p:Ls7/e;

    .line 35
    .line 36
    new-instance v5, Lo7/b;

    .line 37
    .line 38
    invoke-direct {v5, v4}, Lo7/b;-><init>(Lk7/f;)V

    .line 39
    .line 40
    .line 41
    iput-object v5, p0, Lo7/f;->q:Lo7/b;

    .line 42
    .line 43
    new-instance v6, Lo7/b;

    .line 44
    .line 45
    invoke-direct {v6, v4}, Lo7/b;-><init>(Lk7/f;)V

    .line 46
    .line 47
    .line 48
    iput-object v6, p0, Lo7/f;->r:Lo7/b;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {p0, v4, v0}, Lo7/e;->P(ILk7/a;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, v0, v1}, Lo7/e;->P(ILk7/a;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-virtual {p0, v0, v2}, Lo7/e;->P(ILk7/a;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    invoke-virtual {p0, v0, v3}, Lo7/e;->P(ILk7/a;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    invoke-virtual {p0, v0, v5}, Lo7/e;->P(ILk7/a;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x5

    .line 71
    invoke-virtual {p0, v0, v6}, Lo7/e;->P(ILk7/a;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 8

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    iget v1, p1, Lq7/b;->k:I

    .line 13
    .line 14
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0xe

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const-class v4, Lo7/j;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    iget-object v6, p0, Lo7/f;->m:Lj7/d;

    .line 25
    .line 26
    if-ne v0, v2, :cond_6

    .line 27
    .line 28
    new-instance v0, Lp7/g;

    .line 29
    .line 30
    invoke-direct {v0}, Lp7/g;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0}, Lk7/c;->p()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-lt v2, v7, :cond_5

    .line 42
    .line 43
    iget v2, p1, Lq7/b;->k:I

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, Lq7/b;->g(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, Lp7/g;->r:Lr7/c;

    .line 52
    .line 53
    iget-object v0, v0, Lr7/b;->k:[B

    .line 54
    .line 55
    aget-byte v0, v0, v5

    .line 56
    .line 57
    invoke-virtual {v6, v0}, Lj7/d;->k0(B)Lo7/j;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    invoke-virtual {v6}, Lo7/b;->P()Lk7/a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lo7/j;

    .line 69
    .line 70
    iget-object v5, v2, Lo7/j;->l:Ll7/j;

    .line 71
    .line 72
    iget-object v6, v5, Ll7/a;->m:Lp7/a;

    .line 73
    .line 74
    check-cast v6, Lp7/g;

    .line 75
    .line 76
    iget-object v6, v6, Lp7/g;->r:Lr7/c;

    .line 77
    .line 78
    invoke-virtual {v6, v0}, Lr7/c;->P(B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v4}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Lo7/j;

    .line 86
    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    iget-object v3, v4, Lo7/j;->m:Lj7/e;

    .line 90
    .line 91
    :cond_2
    iput-byte v0, v3, Lj7/e;->m:B

    .line 92
    .line 93
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 94
    .line 95
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ll7/m;

    .line 110
    .line 111
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 112
    .line 113
    check-cast v4, Lp7/k;

    .line 114
    .line 115
    iget-object v4, v4, Lp7/k;->r:Lr7/c;

    .line 116
    .line 117
    invoke-virtual {v4, v0}, Lr7/c;->P(B)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v2, Lo7/j;->m:Lj7/e;

    .line 122
    .line 123
    iput-byte v0, v3, Lj7/e;->m:B

    .line 124
    .line 125
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 126
    .line 127
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ll7/m;

    .line 142
    .line 143
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 144
    .line 145
    check-cast v4, Lp7/k;

    .line 146
    .line 147
    iget-object v4, v4, Lp7/k;->r:Lr7/c;

    .line 148
    .line 149
    invoke-virtual {v4, v0}, Lr7/c;->P(B)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    :goto_3
    iget-object v0, v2, Lo7/j;->l:Ll7/j;

    .line 154
    .line 155
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_8

    .line 159
    .line 160
    :cond_5
    const-string v0, "Too few bytes to read spec header, available = "

    .line 161
    .line 162
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-static {p1, v0}, Lj8/o;->u(ILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_6
    const/16 v2, 0xd

    .line 171
    .line 172
    if-ne v0, v2, :cond_b

    .line 173
    .line 174
    invoke-static {p1}, Lp7/k;->U(Lq7/b;)Lp7/k;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v0, v0, Lp7/k;->r:Lr7/c;

    .line 179
    .line 180
    iget-object v0, v0, Lr7/b;->k:[B

    .line 181
    .line 182
    aget-byte v0, v0, v5

    .line 183
    .line 184
    invoke-virtual {v6, v0}, Lj7/d;->k0(B)Lo7/j;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_7
    invoke-virtual {v6}, Lo7/b;->P()Lk7/a;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    check-cast v2, Lo7/j;

    .line 196
    .line 197
    iget-object v5, v2, Lo7/j;->l:Ll7/j;

    .line 198
    .line 199
    iget-object v6, v5, Ll7/a;->m:Lp7/a;

    .line 200
    .line 201
    check-cast v6, Lp7/g;

    .line 202
    .line 203
    iget-object v6, v6, Lp7/g;->r:Lr7/c;

    .line 204
    .line 205
    invoke-virtual {v6, v0}, Lr7/c;->P(B)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5, v4}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, Lo7/j;

    .line 213
    .line 214
    if-eqz v4, :cond_8

    .line 215
    .line 216
    iget-object v3, v4, Lo7/j;->m:Lj7/e;

    .line 217
    .line 218
    :cond_8
    iput-byte v0, v3, Lj7/e;->m:B

    .line 219
    .line 220
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 221
    .line 222
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_9

    .line 231
    .line 232
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, Ll7/m;

    .line 237
    .line 238
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 239
    .line 240
    check-cast v4, Lp7/k;

    .line 241
    .line 242
    iget-object v4, v4, Lp7/k;->r:Lr7/c;

    .line 243
    .line 244
    invoke-virtual {v4, v0}, Lr7/c;->P(B)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_9
    iget-object v3, v2, Lo7/j;->m:Lj7/e;

    .line 249
    .line 250
    iput-byte v0, v3, Lj7/e;->m:B

    .line 251
    .line 252
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 253
    .line 254
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_a

    .line 263
    .line 264
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    check-cast v4, Ll7/m;

    .line 269
    .line 270
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 271
    .line 272
    check-cast v4, Lp7/k;

    .line 273
    .line 274
    iget-object v4, v4, Lp7/k;->r:Lr7/c;

    .line 275
    .line 276
    invoke-virtual {v4, v0}, Lr7/c;->P(B)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_a
    :goto_6
    iget-object v0, v2, Lo7/j;->m:Lj7/e;

    .line 281
    .line 282
    invoke-virtual {v0}, Lo7/b;->P()Lk7/a;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Ll7/m;

    .line 287
    .line 288
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_8

    .line 292
    .line 293
    :cond_b
    const/16 v2, 0xf

    .line 294
    .line 295
    if-ne v0, v2, :cond_d

    .line 296
    .line 297
    new-instance v0, Ll7/c;

    .line 298
    .line 299
    const/4 v2, 0x1

    .line 300
    invoke-direct {v0, v2}, Ll7/c;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, p0, Lo7/f;->n:Ll7/c;

    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget-object v0, v0, Ll7/c;->p:Lo7/b;

    .line 312
    .line 313
    check-cast v0, Lj7/a;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v5}, Lk7/b;->j0(Z)Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_11

    .line 327
    .line 328
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    check-cast v3, Lv7/g;

    .line 333
    .line 334
    iget-object v4, v2, Ll7/c;->p:Lo7/b;

    .line 335
    .line 336
    check-cast v4, Lj7/a;

    .line 337
    .line 338
    if-nez v3, :cond_c

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_c
    invoke-virtual {v4, v3}, Lo7/b;->M(Lk7/a;)Z

    .line 342
    .line 343
    .line 344
    iget-object v3, v2, Ll7/a;->m:Lp7/a;

    .line 345
    .line 346
    check-cast v3, Lp7/c;

    .line 347
    .line 348
    iget-object v3, v3, Lp7/c;->r:Lr7/f;

    .line 349
    .line 350
    iget-object v4, v4, Lo7/b;->k:Lz7/c;

    .line 351
    .line 352
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    invoke-virtual {v3, v4}, Lr7/f;->k(I)V

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_d
    const/16 v2, 0x10

    .line 361
    .line 362
    if-ne v0, v2, :cond_e

    .line 363
    .line 364
    iget-object v0, p0, Lo7/f;->p:Ls7/e;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    new-instance v2, Ll7/c;

    .line 370
    .line 371
    const/4 v3, 0x2

    .line 372
    invoke-direct {v2, v3}, Ll7/c;-><init>(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v2}, Lo7/b;->M(Lk7/a;)Z

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, p1}, Lk7/a;->G(Lq7/b;)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_e
    const/16 v2, 0x11

    .line 383
    .line 384
    if-ne v0, v2, :cond_f

    .line 385
    .line 386
    new-instance v0, Ll7/c;

    .line 387
    .line 388
    const/4 v2, 0x0

    .line 389
    invoke-direct {v0, v2}, Ll7/c;-><init>(I)V

    .line 390
    .line 391
    .line 392
    iget-object v2, p0, Lo7/f;->q:Lo7/b;

    .line 393
    .line 394
    invoke-virtual {v2, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_f
    const/16 v2, 0x12

    .line 402
    .line 403
    if-ne v0, v2, :cond_10

    .line 404
    .line 405
    new-instance v0, Ll7/k;

    .line 406
    .line 407
    invoke-direct {v0}, Ll7/k;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 411
    .line 412
    .line 413
    iget-object v2, p0, Lo7/f;->o:Ld7/b;

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_10
    new-instance v0, Ll7/j;

    .line 420
    .line 421
    const/4 v2, 0x1

    .line 422
    invoke-direct {v0, v2}, Ll7/j;-><init>(I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 426
    .line 427
    .line 428
    iget-object v2, p0, Lo7/f;->r:Lo7/b;

    .line 429
    .line 430
    invoke-virtual {v2, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 431
    .line 432
    .line 433
    :cond_11
    :goto_8
    iget v0, p1, Lq7/b;->k:I

    .line 434
    .line 435
    if-eq v1, v0, :cond_12

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_12
    :goto_9
    return-void
.end method
