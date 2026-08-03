.class public final Lhh/f;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V
    .locals 0

    .line 1
    iput p5, p0, Lhh/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput p3, p0, Lhh/f;->i:I

    .line 6
    .line 7
    iput p4, p0, Lhh/f;->j:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lhh/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lhh/f;->i:I

    .line 7
    .line 8
    iget v1, p0, Lhh/f;->j:I

    .line 9
    .line 10
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 15
    .line 16
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 17
    .line 18
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_0
    iget v0, p0, Lhh/f;->i:I

    .line 35
    .line 36
    iget v1, p0, Lhh/f;->j:I

    .line 37
    .line 38
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 43
    .line 44
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 45
    .line 46
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodUsingFields(JJ)[B

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v1, Ljh/a;

    .line 65
    .line 66
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 67
    .line 68
    .line 69
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 70
    .line 71
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/2addr v4, v2

    .line 80
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x4

    .line 89
    invoke-virtual {v1, v2}, Lg6/c;->b(I)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v4, 0x0

    .line 94
    if-eqz v2, :cond_0

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lg6/c;->f(I)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move v2, v4

    .line 102
    :goto_0
    if-ge v4, v2, :cond_1

    .line 103
    .line 104
    invoke-virtual {v1, v4}, Ljh/a;->n(I)Ljh/a;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {v3, v5}, Lig/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/a;)Lhh/q;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_1
    return-object v0

    .line 122
    :pswitch_1
    iget v0, p0, Lhh/f;->i:I

    .line 123
    .line 124
    iget v1, p0, Lhh/f;->j:I

    .line 125
    .line 126
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 131
    .line 132
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 133
    .line 134
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v4, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetParameterNames(JJ)[Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_2

    .line 146
    .line 147
    new-instance v1, Ljava/util/ArrayList;

    .line 148
    .line 149
    array-length v2, v0

    .line 150
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    array-length v2, v0

    .line 154
    const/4 v3, 0x0

    .line 155
    :goto_1
    if-ge v3, v2, :cond_3

    .line 156
    .line 157
    aget-object v4, v0, v3

    .line 158
    .line 159
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    const/4 v1, 0x0

    .line 166
    :cond_3
    return-object v1

    .line 167
    :pswitch_2
    iget v0, p0, Lhh/f;->i:I

    .line 168
    .line 169
    iget v1, p0, Lhh/f;->j:I

    .line 170
    .line 171
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 176
    .line 177
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 178
    .line 179
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v4

    .line 183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetParameterAnnotations(JJ)[B

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance v1, Ljh/a;

    .line 198
    .line 199
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 200
    .line 201
    .line 202
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 203
    .line 204
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    add-int/2addr v4, v2

    .line 213
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 214
    .line 215
    .line 216
    new-instance v0, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    const/4 v2, 0x4

    .line 222
    invoke-virtual {v1, v2}, Lg6/c;->b(I)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    const/4 v4, 0x0

    .line 227
    if-eqz v2, :cond_4

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Lg6/c;->f(I)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    goto :goto_2

    .line 234
    :cond_4
    move v2, v4

    .line 235
    :goto_2
    move v5, v4

    .line 236
    :goto_3
    if-ge v5, v2, :cond_6

    .line 237
    .line 238
    invoke-virtual {v1, v5}, Ljh/a;->h(I)Ljh/a;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v7, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Ljh/a;->k()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    move v9, v4

    .line 255
    :goto_4
    if-ge v9, v8, :cond_5

    .line 256
    .line 257
    invoke-virtual {v6, v9}, Ljh/a;->g(I)Ljh/c;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v3, v10}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    add-int/lit8 v9, v9, 0x1

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_5
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    add-int/lit8 v5, v5, 0x1

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_6
    return-object v0

    .line 281
    :pswitch_3
    iget v0, p0, Lhh/f;->i:I

    .line 282
    .line 283
    iget v1, p0, Lhh/f;->j:I

    .line 284
    .line 285
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 286
    .line 287
    .line 288
    move-result-wide v0

    .line 289
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 290
    .line 291
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 292
    .line 293
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v3, v4, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodOpCodes(JJ)[I

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, Ltf/l;->K0([I)Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :pswitch_4
    iget v0, p0, Lhh/f;->i:I

    .line 310
    .line 311
    iget v1, p0, Lhh/f;->j:I

    .line 312
    .line 313
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 314
    .line 315
    .line 316
    move-result-wide v0

    .line 317
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 318
    .line 319
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 320
    .line 321
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetInvokeMethods(JJ)[B

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    new-instance v1, Ljh/a;

    .line 340
    .line 341
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 342
    .line 343
    .line 344
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 345
    .line 346
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    add-int/2addr v4, v2

    .line 355
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 356
    .line 357
    .line 358
    new-instance v0, Lhh/p;

    .line 359
    .line 360
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1}, Ljh/a;->m()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    const/4 v4, 0x0

    .line 368
    :goto_5
    if-ge v4, v2, :cond_7

    .line 369
    .line 370
    invoke-virtual {v1, v4}, Ljh/a;->o(I)Ljh/p;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-static {v3, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    add-int/lit8 v4, v4, 0x1

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_7
    return-object v0

    .line 388
    :pswitch_5
    iget v0, p0, Lhh/f;->i:I

    .line 389
    .line 390
    iget v1, p0, Lhh/f;->j:I

    .line 391
    .line 392
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 393
    .line 394
    .line 395
    move-result-wide v0

    .line 396
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 397
    .line 398
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 399
    .line 400
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 401
    .line 402
    .line 403
    move-result-wide v4

    .line 404
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetCallMethods(JJ)[B

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    new-instance v1, Ljh/a;

    .line 419
    .line 420
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 421
    .line 422
    .line 423
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 424
    .line 425
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    add-int/2addr v4, v2

    .line 434
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 435
    .line 436
    .line 437
    new-instance v0, Lhh/p;

    .line 438
    .line 439
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1}, Ljh/a;->m()I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    const/4 v4, 0x0

    .line 447
    :goto_6
    if-ge v4, v2, :cond_8

    .line 448
    .line 449
    invoke-virtual {v1, v4}, Ljh/a;->o(I)Ljh/p;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-static {v3, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    add-int/lit8 v4, v4, 0x1

    .line 464
    .line 465
    goto :goto_6

    .line 466
    :cond_8
    return-object v0

    .line 467
    :pswitch_6
    iget v0, p0, Lhh/f;->i:I

    .line 468
    .line 469
    iget v1, p0, Lhh/f;->j:I

    .line 470
    .line 471
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 472
    .line 473
    .line 474
    move-result-wide v0

    .line 475
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 476
    .line 477
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 478
    .line 479
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 480
    .line 481
    .line 482
    move-result-wide v4

    .line 483
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodAnnotations(JJ)[B

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    new-instance v1, Ljh/a;

    .line 498
    .line 499
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 500
    .line 501
    .line 502
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 503
    .line 504
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    add-int/2addr v4, v2

    .line 513
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 514
    .line 515
    .line 516
    new-instance v0, Ljava/util/ArrayList;

    .line 517
    .line 518
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1}, Ljh/a;->k()I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    const/4 v4, 0x0

    .line 526
    :goto_7
    if-ge v4, v2, :cond_9

    .line 527
    .line 528
    invoke-virtual {v1, v4}, Ljh/a;->g(I)Ljh/c;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-static {v3, v5}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    add-int/lit8 v4, v4, 0x1

    .line 543
    .line 544
    goto :goto_7

    .line 545
    :cond_9
    return-object v0

    .line 546
    :pswitch_7
    iget v0, p0, Lhh/f;->i:I

    .line 547
    .line 548
    iget v1, p0, Lhh/f;->j:I

    .line 549
    .line 550
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 551
    .line 552
    .line 553
    move-result-wide v0

    .line 554
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 555
    .line 556
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 557
    .line 558
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 559
    .line 560
    .line 561
    move-result-wide v4

    .line 562
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFieldPutMethods(JJ)[B

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    new-instance v1, Ljh/a;

    .line 577
    .line 578
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 579
    .line 580
    .line 581
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 582
    .line 583
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 588
    .line 589
    .line 590
    move-result v4

    .line 591
    add-int/2addr v4, v2

    .line 592
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Lhh/p;

    .line 596
    .line 597
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1}, Ljh/a;->m()I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    const/4 v4, 0x0

    .line 605
    :goto_8
    if-ge v4, v2, :cond_a

    .line 606
    .line 607
    invoke-virtual {v1, v4}, Ljh/a;->o(I)Ljh/p;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-static {v3, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    add-int/lit8 v4, v4, 0x1

    .line 622
    .line 623
    goto :goto_8

    .line 624
    :cond_a
    return-object v0

    .line 625
    :pswitch_8
    iget v0, p0, Lhh/f;->i:I

    .line 626
    .line 627
    iget v1, p0, Lhh/f;->j:I

    .line 628
    .line 629
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 630
    .line 631
    .line 632
    move-result-wide v0

    .line 633
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 634
    .line 635
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 636
    .line 637
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 638
    .line 639
    .line 640
    move-result-wide v4

    .line 641
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFieldGetMethods(JJ)[B

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    new-instance v1, Ljh/a;

    .line 656
    .line 657
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 658
    .line 659
    .line 660
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 661
    .line 662
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 667
    .line 668
    .line 669
    move-result v4

    .line 670
    add-int/2addr v4, v2

    .line 671
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 672
    .line 673
    .line 674
    new-instance v0, Lhh/p;

    .line 675
    .line 676
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1}, Ljh/a;->m()I

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    const/4 v4, 0x0

    .line 684
    :goto_9
    if-ge v4, v2, :cond_b

    .line 685
    .line 686
    invoke-virtual {v1, v4}, Ljh/a;->o(I)Ljh/p;

    .line 687
    .line 688
    .line 689
    move-result-object v5

    .line 690
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-static {v3, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    add-int/lit8 v4, v4, 0x1

    .line 701
    .line 702
    goto :goto_9

    .line 703
    :cond_b
    return-object v0

    .line 704
    :pswitch_9
    iget v0, p0, Lhh/f;->i:I

    .line 705
    .line 706
    iget v1, p0, Lhh/f;->j:I

    .line 707
    .line 708
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 709
    .line 710
    .line 711
    move-result-wide v0

    .line 712
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 713
    .line 714
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 715
    .line 716
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 717
    .line 718
    .line 719
    move-result-wide v4

    .line 720
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetFieldAnnotations(JJ)[B

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    new-instance v1, Ljh/a;

    .line 735
    .line 736
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 737
    .line 738
    .line 739
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 740
    .line 741
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 746
    .line 747
    .line 748
    move-result v4

    .line 749
    add-int/2addr v4, v2

    .line 750
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 751
    .line 752
    .line 753
    new-instance v0, Ljava/util/ArrayList;

    .line 754
    .line 755
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1}, Ljh/a;->k()I

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    const/4 v4, 0x0

    .line 763
    :goto_a
    if-ge v4, v2, :cond_c

    .line 764
    .line 765
    invoke-virtual {v1, v4}, Ljh/a;->g(I)Ljh/c;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    invoke-static {v3, v5}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 773
    .line 774
    .line 775
    move-result-object v5

    .line 776
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    add-int/lit8 v4, v4, 0x1

    .line 780
    .line 781
    goto :goto_a

    .line 782
    :cond_c
    return-object v0

    .line 783
    :pswitch_a
    iget v0, p0, Lhh/f;->i:I

    .line 784
    .line 785
    iget v1, p0, Lhh/f;->j:I

    .line 786
    .line 787
    invoke-static {v0, v1}, Lf1/n0;->k(II)J

    .line 788
    .line 789
    .line 790
    move-result-wide v0

    .line 791
    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 792
    .line 793
    iget-object v3, p0, Lhh/f;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 794
    .line 795
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 796
    .line 797
    .line 798
    move-result-wide v4

    .line 799
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetClassAnnotations(JJ)[B

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    new-instance v1, Ljh/a;

    .line 814
    .line 815
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 816
    .line 817
    .line 818
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 819
    .line 820
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 825
    .line 826
    .line 827
    move-result v4

    .line 828
    add-int/2addr v4, v2

    .line 829
    invoke-virtual {v1, v4, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 830
    .line 831
    .line 832
    new-instance v0, Ljava/util/ArrayList;

    .line 833
    .line 834
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1}, Ljh/a;->k()I

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    const/4 v4, 0x0

    .line 842
    :goto_b
    if-ge v4, v2, :cond_d

    .line 843
    .line 844
    invoke-virtual {v1, v4}, Ljh/a;->g(I)Ljh/c;

    .line 845
    .line 846
    .line 847
    move-result-object v5

    .line 848
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    invoke-static {v3, v5}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    add-int/lit8 v4, v4, 0x1

    .line 859
    .line 860
    goto :goto_b

    .line 861
    :cond_d
    return-object v0

    .line 862
    nop

    :pswitch_data_0
    .packed-switch 0x0
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
