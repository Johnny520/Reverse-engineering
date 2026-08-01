.class public final Lb1/b;
.super LN0/h;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic c:LJ/b;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lb1/d;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb1/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb1/b;->c:LJ/b;

    iput-object p2, p0, Lb1/b;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput p3, p0, Lb1/b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;LJ/b;II)V
    .locals 0

    .line 1
    iput p4, p0, Lb1/b;->a:I

    iput-object p1, p0, Lb1/b;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lb1/b;->c:LJ/b;

    iput p3, p0, Lb1/b;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "wrap(res)"

    .line 4
    .line 5
    iget-object v3, p0, Lb1/b;->b:Lorg/luckypray/dexkit/DexKitBridge;

    .line 6
    .line 7
    iget v4, p0, Lb1/b;->d:I

    .line 8
    .line 9
    iget-object v5, p0, Lb1/b;->c:LJ/b;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    iget v8, p0, Lb1/b;->a:I

    .line 14
    .line 15
    packed-switch v8, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, Lb1/f;

    .line 19
    .line 20
    iget v0, v5, Lb1/f;->d:I

    .line 21
    .line 22
    invoke-static {v4, v0}, LJ/b;->a(II)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    new-array v4, v7, [J

    .line 27
    .line 28
    aput-wide v0, v4, v6

    .line 29
    .line 30
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {v0, v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->a(J[J)[B

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ld1/a;

    .line 46
    .line 47
    invoke-direct {v1}, Ld1/a;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-static {v0, v2}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/2addr v4, v2

    .line 61
    invoke-virtual {v1, v4, v0}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lb1/e;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ld1/a;->h()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    :goto_0
    if-ge v6, v2, :cond_0

    .line 74
    .line 75
    invoke-virtual {v1, v6}, Ld1/a;->g(I)Ld1/a;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v4}, LD/h;->m(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/d;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    add-int/2addr v6, v7

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {v0}, Lb1/a;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lb1/d;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_0
    check-cast v5, Lb1/d;

    .line 99
    .line 100
    iget-object v1, v5, Lb1/d;->d:Ljava/lang/Integer;

    .line 101
    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {v4, v1}, LJ/b;->a(II)J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    new-array v1, v7, [J

    .line 113
    .line 114
    aput-wide v4, v1, v6

    .line 115
    .line 116
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    invoke-static {v4, v5, v1}, Lorg/luckypray/dexkit/DexKitBridge;->a(J[J)[B

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v2, Ld1/a;

    .line 132
    .line 133
    invoke-direct {v2}, Ld1/a;-><init>()V

    .line 134
    .line 135
    .line 136
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 137
    .line 138
    invoke-static {v1, v4}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    add-int/2addr v5, v4

    .line 147
    invoke-virtual {v2, v5, v1}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Lb1/e;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ld1/a;->h()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    :goto_1
    if-ge v6, v4, :cond_1

    .line 160
    .line 161
    invoke-virtual {v2, v6}, Ld1/a;->g(I)Ld1/a;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v5}, LN0/g;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v3, v5}, LD/h;->m(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/d;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    add-int/2addr v6, v7

    .line 176
    goto :goto_1

    .line 177
    :cond_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_2

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    invoke-virtual {v1}, Lb1/a;->a()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :goto_2
    check-cast v0, Lb1/d;

    .line 189
    .line 190
    :cond_3
    return-object v0

    .line 191
    :pswitch_1
    check-cast v5, Lb1/d;

    .line 192
    .line 193
    iget-object v0, v5, Lb1/d;->e:Ljava/util/ArrayList;

    .line 194
    .line 195
    new-instance v1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_4

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Ljava/lang/Number;

    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    invoke-static {v4, v5}, LJ/b;->a(II)J

    .line 225
    .line 226
    .line 227
    move-result-wide v8

    .line 228
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_4
    invoke-static {v1}, LF0/k;->x0(Ljava/util/ArrayList;)[J

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    invoke-static {v4, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge;->a(J[J)[B

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    new-instance v1, Ld1/a;

    .line 256
    .line 257
    invoke-direct {v1}, Ld1/a;-><init>()V

    .line 258
    .line 259
    .line 260
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 261
    .line 262
    invoke-static {v0, v2}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    add-int/2addr v4, v2

    .line 271
    invoke-virtual {v1, v4, v0}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, Lb1/e;

    .line 275
    .line 276
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1}, Ld1/a;->h()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    :goto_4
    if-ge v6, v2, :cond_5

    .line 284
    .line 285
    invoke-virtual {v1, v6}, Ld1/a;->g(I)Ld1/a;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v3, v4}, LD/h;->m(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/d;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    add-int/2addr v6, v7

    .line 300
    goto :goto_4

    .line 301
    :cond_5
    return-object v0

    .line 302
    :pswitch_2
    check-cast v5, Lb1/d;

    .line 303
    .line 304
    iget-object v5, v5, Lb1/d;->f:Ljava/util/ArrayList;

    .line 305
    .line 306
    new-instance v8, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eqz v9, :cond_6

    .line 324
    .line 325
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    check-cast v9, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    invoke-static {v4, v9}, LJ/b;->a(II)J

    .line 336
    .line 337
    .line 338
    move-result-wide v9

    .line 339
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_6
    invoke-static {v8}, LF0/k;->x0(Ljava/util/ArrayList;)[J

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 352
    .line 353
    .line 354
    move-result-wide v8

    .line 355
    invoke-static {v8, v9, v4}, Lorg/luckypray/dexkit/DexKitBridge;->b(J[J)[B

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-static {}, LS/a;->a()LS/a;

    .line 367
    .line 368
    .line 369
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 370
    .line 371
    invoke-static {v4, v2}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    add-int/2addr v5, v2

    .line 380
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    sub-int v2, v5, v2

    .line 385
    .line 386
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    new-instance v9, Lb1/g;

    .line 391
    .line 392
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    if-ge v1, v8, :cond_7

    .line 396
    .line 397
    add-int/lit8 v10, v2, 0x4

    .line 398
    .line 399
    invoke-virtual {v4, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    goto :goto_6

    .line 404
    :cond_7
    move v10, v6

    .line 405
    :goto_6
    if-eqz v10, :cond_8

    .line 406
    .line 407
    add-int/2addr v10, v5

    .line 408
    invoke-virtual {v4, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    add-int/2addr v11, v10

    .line 413
    invoke-virtual {v4, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    goto :goto_7

    .line 418
    :cond_8
    move v10, v6

    .line 419
    :goto_7
    move v11, v6

    .line 420
    :goto_8
    if-ge v11, v10, :cond_b

    .line 421
    .line 422
    new-instance v12, Ld1/a;

    .line 423
    .line 424
    invoke-direct {v12}, Ld1/a;-><init>()V

    .line 425
    .line 426
    .line 427
    if-ge v1, v8, :cond_9

    .line 428
    .line 429
    add-int/lit8 v13, v2, 0x4

    .line 430
    .line 431
    invoke-virtual {v4, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 432
    .line 433
    .line 434
    move-result v13

    .line 435
    goto :goto_9

    .line 436
    :cond_9
    move v13, v6

    .line 437
    :goto_9
    if-eqz v13, :cond_a

    .line 438
    .line 439
    add-int/2addr v13, v5

    .line 440
    invoke-virtual {v4, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 441
    .line 442
    .line 443
    move-result v14

    .line 444
    add-int/2addr v14, v13

    .line 445
    add-int/2addr v14, v1

    .line 446
    mul-int/lit8 v13, v11, 0x4

    .line 447
    .line 448
    add-int/2addr v13, v14

    .line 449
    invoke-virtual {v4, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 450
    .line 451
    .line 452
    move-result v14

    .line 453
    add-int/2addr v14, v13

    .line 454
    invoke-virtual {v12, v14, v4}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 455
    .line 456
    .line 457
    goto :goto_a

    .line 458
    :cond_a
    move-object v12, v0

    .line 459
    :goto_a
    invoke-static {v12}, LN0/g;->b(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v3, v12}, LD/h;->n(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/f;

    .line 463
    .line 464
    .line 465
    move-result-object v12

    .line 466
    invoke-virtual {v9, v12}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    add-int/2addr v11, v7

    .line 470
    goto :goto_8

    .line 471
    :cond_b
    return-object v9

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
