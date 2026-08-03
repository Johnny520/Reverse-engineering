.class public final Lhh/g;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic i:Lhh/i;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Lhh/i;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lhh/g;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Lhh/g;->i:Lhh/i;

    .line 5
    .line 6
    iput-object p2, p0, Lhh/g;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    iput p3, p0, Lhh/g;->j:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/i;II)V
    .locals 0

    .line 15
    iput p4, p0, Lhh/g;->g:I

    iput-object p1, p0, Lhh/g;->h:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lhh/g;->i:Lhh/i;

    iput p3, p0, Lhh/g;->j:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lhh/g;->g:I

    .line 2
    .line 3
    iget v1, p0, Lhh/g;->j:I

    .line 4
    .line 5
    iget-object v2, p0, Lhh/g;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 6
    .line 7
    iget-object v3, p0, Lhh/g;->i:Lhh/i;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v3, Lhh/i;->k:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v1, v0}, Lf1/n0;->k(II)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const/4 v3, 0x1

    .line 26
    new-array v3, v3, [J

    .line 27
    .line 28
    aput-wide v0, v3, v4

    .line 29
    .line 30
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 31
    .line 32
    invoke-static {v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    invoke-static {v0, v5, v6, v3}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v1, Ljh/a;

    .line 48
    .line 49
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 53
    .line 54
    invoke-static {v0, v3}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    add-int/2addr v5, v3

    .line 63
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lhh/j;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_0
    if-ge v4, v3, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v0}, Lhh/e;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lhh/i;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    const/4 v0, 0x0

    .line 102
    :goto_1
    return-object v0

    .line 103
    :pswitch_0
    iget-object v0, v3, Lhh/i;->m:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-static {v1, v5}, Lf1/n0;->k(II)J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    invoke-static {v3}, Ltf/m;->Q1(Ljava/util/ArrayList;)[J

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 151
    .line 152
    invoke-static {v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6, v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodByIds(J[J)[B

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v1, Ljh/a;

    .line 171
    .line 172
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 173
    .line 174
    .line 175
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 176
    .line 177
    invoke-static {v0, v3}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    add-int/2addr v5, v3

    .line 186
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Lhh/p;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljh/a;->m()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    :goto_3
    if-ge v4, v3, :cond_3

    .line 199
    .line 200
    invoke-virtual {v1, v4}, Ljh/a;->o(I)Ljh/p;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {v2, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    add-int/lit8 v4, v4, 0x1

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_3
    return-object v0

    .line 218
    :pswitch_1
    iget-object v0, v3, Lhh/i;->l:Ljava/util/ArrayList;

    .line 219
    .line 220
    new-instance v3, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_4

    .line 238
    .line 239
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    check-cast v5, Ljava/lang/Number;

    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-static {v1, v5}, Lf1/n0;->k(II)J

    .line 250
    .line 251
    .line 252
    move-result-wide v5

    .line 253
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_4
    invoke-static {v3}, Ltf/m;->Q1(Ljava/util/ArrayList;)[J

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 266
    .line 267
    invoke-static {v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 268
    .line 269
    .line 270
    move-result-wide v5

    .line 271
    invoke-static {v1, v5, v6, v0}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v1, Ljh/a;

    .line 283
    .line 284
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 285
    .line 286
    .line 287
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 288
    .line 289
    invoke-static {v0, v3}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    add-int/2addr v5, v3

    .line 298
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 299
    .line 300
    .line 301
    new-instance v0, Lhh/j;

    .line 302
    .line 303
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    :goto_5
    if-ge v4, v3, :cond_5

    .line 311
    .line 312
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-static {v2, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    add-int/lit8 v4, v4, 0x1

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_5
    return-object v0

    .line 330
    :pswitch_2
    iget-object v0, v3, Lhh/i;->n:Ljava/util/ArrayList;

    .line 331
    .line 332
    new-instance v3, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_6

    .line 350
    .line 351
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    check-cast v5, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    invoke-static {v1, v5}, Lf1/n0;->k(II)J

    .line 362
    .line 363
    .line 364
    move-result-wide v5

    .line 365
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_6
    invoke-static {v3}, Ltf/m;->Q1(Ljava/util/ArrayList;)[J

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 378
    .line 379
    invoke-static {v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 380
    .line 381
    .line 382
    move-result-wide v5

    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-static {v5, v6, v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetFieldByIds(J[J)[B

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v1, Ljh/a;

    .line 398
    .line 399
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 400
    .line 401
    .line 402
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 403
    .line 404
    invoke-static {v0, v3}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    add-int/2addr v5, v3

    .line 413
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 414
    .line 415
    .line 416
    new-instance v0, Lhh/m;

    .line 417
    .line 418
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 419
    .line 420
    .line 421
    const/4 v3, 0x4

    .line 422
    invoke-virtual {v1, v3}, Lg6/c;->b(I)I

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_7

    .line 427
    .line 428
    invoke-virtual {v1, v3}, Lg6/c;->f(I)I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    goto :goto_7

    .line 433
    :cond_7
    move v3, v4

    .line 434
    :goto_7
    if-ge v4, v3, :cond_8

    .line 435
    .line 436
    invoke-virtual {v1, v4}, Ljh/a;->j(I)Ljh/o;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-static {v2, v5}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    add-int/lit8 v4, v4, 0x1

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_8
    return-object v0

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
