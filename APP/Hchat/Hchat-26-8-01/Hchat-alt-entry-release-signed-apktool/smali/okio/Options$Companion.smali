.class public final Lokio/Options$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokio/Options;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokio/Options$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lokio/Buffer;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lokio/ByteString;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    move/from16 v10, p4

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    move/from16 v1, p6

    .line 10
    .line 11
    move/from16 v11, p7

    .line 12
    .line 13
    move-object/from16 v8, p8

    .line 14
    .line 15
    const-string v2, "Failed requirement."

    .line 16
    .line 17
    if-ge v1, v11, :cond_11

    .line 18
    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-ge v3, v11, :cond_1

    .line 21
    .line 22
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lokio/ByteString;

    .line 27
    .line 28
    invoke-virtual {v4}, Lokio/ByteString;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-lt v4, v10, :cond_0

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v2}, Lj8/o;->t(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lokio/ByteString;

    .line 46
    .line 47
    add-int/lit8 v3, v11, -0x1

    .line 48
    .line 49
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lokio/ByteString;

    .line 54
    .line 55
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ne v10, v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lokio/ByteString;

    .line 78
    .line 79
    move v6, v1

    .line 80
    move v1, v2

    .line 81
    move-object v2, v4

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v6, v1

    .line 84
    const/4 v1, -0x1

    .line 85
    :goto_1
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {v3, v10}, Lokio/ByteString;->getByte(I)B

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    const/4 v13, 0x2

    .line 94
    if-eq v4, v7, :cond_c

    .line 95
    .line 96
    add-int/lit8 v2, v6, 0x1

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    :goto_2
    if-ge v2, v11, :cond_4

    .line 100
    .line 101
    add-int/lit8 v4, v2, -0x1

    .line 102
    .line 103
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Lokio/ByteString;

    .line 108
    .line 109
    invoke-virtual {v4, v10}, Lokio/ByteString;->getByte(I)B

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, Lokio/ByteString;

    .line 118
    .line 119
    invoke-virtual {v7, v10}, Lokio/ByteString;->getByte(I)B

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eq v4, v7, :cond_3

    .line 124
    .line 125
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-direct {v0, v9}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v14

    .line 134
    add-long v14, p1, v14

    .line 135
    .line 136
    const/16 v16, -0x1

    .line 137
    .line 138
    int-to-long v12, v13

    .line 139
    add-long/2addr v14, v12

    .line 140
    mul-int/lit8 v2, v3, 0x2

    .line 141
    .line 142
    int-to-long v12, v2

    .line 143
    add-long/2addr v14, v12

    .line 144
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 148
    .line 149
    .line 150
    move v1, v6

    .line 151
    :goto_3
    if-ge v1, v11, :cond_7

    .line 152
    .line 153
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Lokio/ByteString;

    .line 158
    .line 159
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eq v1, v6, :cond_5

    .line 164
    .line 165
    add-int/lit8 v3, v1, -0x1

    .line 166
    .line 167
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lokio/ByteString;

    .line 172
    .line 173
    invoke-virtual {v3, v10}, Lokio/ByteString;->getByte(I)B

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eq v2, v3, :cond_6

    .line 178
    .line 179
    :cond_5
    and-int/lit16 v2, v2, 0xff

    .line 180
    .line 181
    invoke-virtual {v9, v2}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 182
    .line 183
    .line 184
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    new-instance v3, Lokio/Buffer;

    .line 188
    .line 189
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 190
    .line 191
    .line 192
    :goto_4
    if-ge v6, v11, :cond_b

    .line 193
    .line 194
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Lokio/ByteString;

    .line 199
    .line 200
    invoke-virtual {v1, v10}, Lokio/ByteString;->getByte(I)B

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    add-int/lit8 v2, v6, 0x1

    .line 205
    .line 206
    move v4, v2

    .line 207
    :goto_5
    if-ge v4, v11, :cond_9

    .line 208
    .line 209
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    check-cast v7, Lokio/ByteString;

    .line 214
    .line 215
    invoke-virtual {v7, v10}, Lokio/ByteString;->getByte(I)B

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eq v1, v7, :cond_8

    .line 220
    .line 221
    move v7, v4

    .line 222
    goto :goto_6

    .line 223
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_9
    move v7, v11

    .line 227
    :goto_6
    if-ne v2, v7, :cond_a

    .line 228
    .line 229
    add-int/lit8 v1, v10, 0x1

    .line 230
    .line 231
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Lokio/ByteString;

    .line 236
    .line 237
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-ne v1, v2, :cond_a

    .line 242
    .line 243
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Ljava/lang/Number;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 254
    .line 255
    .line 256
    move-wide v1, v14

    .line 257
    goto :goto_7

    .line 258
    :cond_a
    invoke-direct {v0, v3}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    add-long/2addr v1, v14

    .line 263
    long-to-int v1, v1

    .line 264
    mul-int/lit8 v1, v1, -0x1

    .line 265
    .line 266
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 267
    .line 268
    .line 269
    add-int/lit8 v4, v10, 0x1

    .line 270
    .line 271
    move-wide v1, v14

    .line 272
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 273
    .line 274
    .line 275
    :goto_7
    move-wide v14, v1

    .line 276
    move v6, v7

    .line 277
    goto :goto_4

    .line 278
    :cond_b
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_c
    const/16 v16, -0x1

    .line 283
    .line 284
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-virtual {v3}, Lokio/ByteString;->size()I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    const/4 v7, 0x0

    .line 297
    move v12, v10

    .line 298
    :goto_8
    if-ge v12, v4, :cond_d

    .line 299
    .line 300
    invoke-virtual {v2, v12}, Lokio/ByteString;->getByte(I)B

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    invoke-virtual {v3, v12}, Lokio/ByteString;->getByte(I)B

    .line 305
    .line 306
    .line 307
    move-result v15

    .line 308
    if-ne v14, v15, :cond_d

    .line 309
    .line 310
    add-int/lit8 v7, v7, 0x1

    .line 311
    .line 312
    add-int/lit8 v12, v12, 0x1

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_d
    invoke-direct {v0, v9}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 316
    .line 317
    .line 318
    move-result-wide v3

    .line 319
    add-long v3, p1, v3

    .line 320
    .line 321
    int-to-long v12, v13

    .line 322
    add-long/2addr v3, v12

    .line 323
    int-to-long v12, v7

    .line 324
    add-long/2addr v3, v12

    .line 325
    const-wide/16 v12, 0x1

    .line 326
    .line 327
    add-long/2addr v3, v12

    .line 328
    neg-int v12, v7

    .line 329
    invoke-virtual {v9, v12}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 333
    .line 334
    .line 335
    add-int v1, v10, v7

    .line 336
    .line 337
    :goto_9
    if-ge v10, v1, :cond_e

    .line 338
    .line 339
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    and-int/lit16 v7, v7, 0xff

    .line 344
    .line 345
    invoke-virtual {v9, v7}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 346
    .line 347
    .line 348
    add-int/lit8 v10, v10, 0x1

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_e
    add-int/lit8 v2, v6, 0x1

    .line 352
    .line 353
    if-ne v2, v11, :cond_10

    .line 354
    .line 355
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    check-cast v2, Lokio/ByteString;

    .line 360
    .line 361
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-ne v1, v2, :cond_f

    .line 366
    .line 367
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    check-cast v1, Ljava/lang/Number;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_f
    const-string v1, "Check failed."

    .line 382
    .line 383
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_10
    move-wide/from16 v17, v3

    .line 388
    .line 389
    move v4, v1

    .line 390
    move-wide/from16 v1, v17

    .line 391
    .line 392
    new-instance v3, Lokio/Buffer;

    .line 393
    .line 394
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-direct {v0, v3}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 398
    .line 399
    .line 400
    move-result-wide v12

    .line 401
    add-long/2addr v12, v1

    .line 402
    long-to-int v7, v12

    .line 403
    mul-int/lit8 v7, v7, -0x1

    .line 404
    .line 405
    invoke-virtual {v9, v7}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 406
    .line 407
    .line 408
    move v7, v11

    .line 409
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :cond_11
    invoke-static {v2}, Lj8/o;->t(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    return-void
.end method

.method public static synthetic buildTrieRecursive$default(Lokio/Options$Companion;JLokio/Buffer;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    .locals 9

    .line 1
    and-int/lit8 v0, p9, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p9, 0x4

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    move v4, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v4, p4

    .line 16
    :goto_0
    and-int/lit8 p1, p9, 0x10

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    move v6, p2

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    move v6, p6

    .line 23
    :goto_1
    and-int/lit8 p1, p9, 0x20

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    move v7, p1

    .line 32
    :goto_2
    move-object v0, p0

    .line 33
    move-object v3, p3

    .line 34
    move-object v5, p5

    .line 35
    move-object/from16 v8, p8

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move/from16 v7, p7

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :goto_3
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final getIntCount(Lokio/Buffer;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 p1, 0x4

    .line 6
    int-to-long v2, p1

    .line 7
    div-long/2addr v0, v2

    .line 8
    return-wide v0
.end method


# virtual methods
.method public final varargs of([Lokio/ByteString;)Lokio/Options;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, -0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lokio/Options;

    .line 13
    .line 14
    new-array v1, v4, [Lokio/ByteString;

    .line 15
    .line 16
    filled-new-array {v4, v3}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v0, v1, v3, v2}, Lokio/Options;-><init>([Lokio/ByteString;[ILgg/g;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance v10, Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v1, Ltf/j;

    .line 27
    .line 28
    invoke-direct {v1, v0, v4}, Ltf/j;-><init>([Ljava/lang/Object;Z)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v10}, Ltf/q;->f1(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    array-length v5, v0

    .line 40
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    array-length v5, v0

    .line 44
    move v6, v4

    .line 45
    :goto_0
    if-ge v6, v5, :cond_1

    .line 46
    .line 47
    aget-object v7, v0, v6

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-array v3, v4, [Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, [Ljava/lang/Integer;

    .line 66
    .line 67
    array-length v3, v1

    .line 68
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, La/a;->C0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    array-length v1, v0

    .line 77
    move v3, v4

    .line 78
    move v5, v3

    .line 79
    :goto_1
    if-ge v3, v1, :cond_2

    .line 80
    .line 81
    aget-object v6, v0, v3

    .line 82
    .line 83
    add-int/lit8 v7, v5, 0x1

    .line 84
    .line 85
    invoke-static {v10, v6}, La/a;->p(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v13, v6, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    move v5, v7

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lokio/ByteString;

    .line 105
    .line 106
    invoke-virtual {v1}, Lokio/ByteString;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-lez v1, :cond_8

    .line 111
    .line 112
    move v1, v4

    .line 113
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ge v1, v3, :cond_6

    .line 118
    .line 119
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lokio/ByteString;

    .line 124
    .line 125
    add-int/lit8 v5, v1, 0x1

    .line 126
    .line 127
    move v6, v5

    .line 128
    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-ge v6, v7, :cond_5

    .line 133
    .line 134
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lokio/ByteString;

    .line 139
    .line 140
    invoke-virtual {v7, v3}, Lokio/ByteString;->startsWith(Lokio/ByteString;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_5

    .line 145
    .line 146
    invoke-virtual {v7}, Lokio/ByteString;->size()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v3}, Lokio/ByteString;->size()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-eq v8, v9, :cond_4

    .line 155
    .line 156
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Ljava/lang/Number;

    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-le v7, v8, :cond_3

    .line 177
    .line 178
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    const-string v0, "duplicate option: "

    .line 189
    .line 190
    invoke-static {v7, v0}, Lj8/o;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    return-object v0

    .line 195
    :cond_5
    move v1, v5

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    new-instance v8, Lokio/Buffer;

    .line 198
    .line 199
    invoke-direct {v8}, Lokio/Buffer;-><init>()V

    .line 200
    .line 201
    .line 202
    const/16 v14, 0x35

    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const-wide/16 v6, 0x0

    .line 206
    .line 207
    const/4 v9, 0x0

    .line 208
    const/4 v11, 0x0

    .line 209
    const/4 v12, 0x0

    .line 210
    move-object/from16 v5, p0

    .line 211
    .line 212
    invoke-static/range {v5 .. v15}, Lokio/Options$Companion;->buildTrieRecursive$default(Lokio/Options$Companion;JLokio/Buffer;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v5, v8}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    long-to-int v1, v6

    .line 220
    new-array v1, v1, [I

    .line 221
    .line 222
    :goto_4
    invoke-virtual {v8}, Lokio/Buffer;->exhausted()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_7

    .line 227
    .line 228
    add-int/lit8 v3, v4, 0x1

    .line 229
    .line 230
    invoke-virtual {v8}, Lokio/Buffer;->readInt()I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    aput v6, v1, v4

    .line 235
    .line 236
    move v4, v3

    .line 237
    goto :goto_4

    .line 238
    :cond_7
    new-instance v3, Lokio/Options;

    .line 239
    .line 240
    array-length v4, v0

    .line 241
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, [Lokio/ByteString;

    .line 246
    .line 247
    invoke-direct {v3, v0, v1, v2}, Lokio/Options;-><init>([Lokio/ByteString;[ILgg/g;)V

    .line 248
    .line 249
    .line 250
    return-object v3

    .line 251
    :cond_8
    move-object/from16 v5, p0

    .line 252
    .line 253
    const-string v0, "the empty byte string is not a supported option"

    .line 254
    .line 255
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    const/4 v0, 0x0

    .line 259
    return-object v0
.end method
