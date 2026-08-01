.class public final Ld1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public final e:LS/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LS/a;->a()LS/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ld1/a;->e:LS/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/2addr v0, p1

    .line 8
    return v0
.end method

.method public final b(I)I
    .locals 2

    .line 1
    iget v0, p0, Ld1/a;->d:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iget v1, p0, Ld1/a;->c:I

    .line 8
    .line 9
    add-int/2addr v1, p1

    .line 10
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public final c(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ld1/a;->a:I

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    sub-int/2addr p1, p2

    .line 12
    iput p1, p0, Ld1/a;->c:I

    .line 13
    .line 14
    iget-object p2, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Ld1/a;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Ld1/a;->a:I

    .line 25
    .line 26
    iput p1, p0, Ld1/a;->c:I

    .line 27
    .line 28
    iput p1, p0, Ld1/a;->d:I

    .line 29
    .line 30
    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, p1

    .line 8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int/lit8 v1, v1, 0x4

    .line 13
    .line 14
    iget-object v2, p0, Ld1/a;->e:LS/a;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, -0x10

    .line 24
    .line 25
    const/16 v4, -0x20

    .line 26
    .line 27
    const-string v5, "Invalid UTF-8"

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz v2, :cond_a

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v1

    .line 41
    or-int v1, v0, p1

    .line 42
    .line 43
    array-length v7, v2

    .line 44
    sub-int/2addr v7, v0

    .line 45
    sub-int/2addr v7, p1

    .line 46
    or-int/2addr v1, v7

    .line 47
    if-ltz v1, :cond_9

    .line 48
    .line 49
    add-int v1, v0, p1

    .line 50
    .line 51
    new-array v11, p1, [C

    .line 52
    .line 53
    move p1, v6

    .line 54
    :goto_0
    if-ge v0, v1, :cond_0

    .line 55
    .line 56
    aget-byte v7, v2, v0

    .line 57
    .line 58
    if-ltz v7, :cond_0

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    add-int/lit8 v8, p1, 0x1

    .line 63
    .line 64
    int-to-char v7, v7

    .line 65
    aput-char v7, v11, p1

    .line 66
    .line 67
    move p1, v8

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v12, p1

    .line 70
    :goto_1
    if-ge v0, v1, :cond_8

    .line 71
    .line 72
    add-int/lit8 p1, v0, 0x1

    .line 73
    .line 74
    aget-byte v7, v2, v0

    .line 75
    .line 76
    if-ltz v7, :cond_2

    .line 77
    .line 78
    add-int/lit8 v0, v12, 0x1

    .line 79
    .line 80
    int-to-char v7, v7

    .line 81
    aput-char v7, v11, v12

    .line 82
    .line 83
    :goto_2
    if-ge p1, v1, :cond_1

    .line 84
    .line 85
    aget-byte v7, v2, p1

    .line 86
    .line 87
    if-ltz v7, :cond_1

    .line 88
    .line 89
    add-int/lit8 p1, p1, 0x1

    .line 90
    .line 91
    add-int/lit8 v8, v0, 0x1

    .line 92
    .line 93
    int-to-char v7, v7

    .line 94
    aput-char v7, v11, v0

    .line 95
    .line 96
    move v0, v8

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    move v12, v0

    .line 99
    move v0, p1

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    if-ge v7, v4, :cond_4

    .line 102
    .line 103
    if-ge p1, v1, :cond_3

    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x2

    .line 106
    .line 107
    aget-byte p1, v2, p1

    .line 108
    .line 109
    add-int/lit8 v8, v12, 0x1

    .line 110
    .line 111
    invoke-static {v7, p1, v11, v12}, LD/h;->z(BB[CI)V

    .line 112
    .line 113
    .line 114
    move v12, v8

    .line 115
    goto :goto_1

    .line 116
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_4
    if-ge v7, v3, :cond_6

    .line 123
    .line 124
    add-int/lit8 v8, v1, -0x1

    .line 125
    .line 126
    if-ge p1, v8, :cond_5

    .line 127
    .line 128
    add-int/lit8 v8, v0, 0x2

    .line 129
    .line 130
    aget-byte p1, v2, p1

    .line 131
    .line 132
    add-int/lit8 v0, v0, 0x3

    .line 133
    .line 134
    aget-byte v8, v2, v8

    .line 135
    .line 136
    add-int/lit8 v9, v12, 0x1

    .line 137
    .line 138
    invoke-static {v7, p1, v8, v11, v12}, LD/h;->y(BBB[CI)V

    .line 139
    .line 140
    .line 141
    move v12, v9

    .line 142
    goto :goto_1

    .line 143
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 144
    .line 145
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_6
    add-int/lit8 v8, v1, -0x2

    .line 150
    .line 151
    if-ge p1, v8, :cond_7

    .line 152
    .line 153
    add-int/lit8 v8, v0, 0x2

    .line 154
    .line 155
    aget-byte p1, v2, p1

    .line 156
    .line 157
    add-int/lit8 v9, v0, 0x3

    .line 158
    .line 159
    aget-byte v8, v2, v8

    .line 160
    .line 161
    add-int/lit8 v0, v0, 0x4

    .line 162
    .line 163
    aget-byte v10, v2, v9

    .line 164
    .line 165
    move v9, v8

    .line 166
    move v8, p1

    .line 167
    invoke-static/range {v7 .. v12}, LD/h;->x(BBBB[CI)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v12, v12, 0x2

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 174
    .line 175
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_8
    new-instance p1, Ljava/lang/String;

    .line 180
    .line 181
    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 182
    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 186
    .line 187
    array-length v2, v2

    .line 188
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    filled-new-array {v2, v0, p1}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const-string v0, "buffer length=%d, index=%d, size=%d"

    .line 205
    .line 206
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v1

    .line 214
    :cond_a
    or-int v2, v1, p1

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    sub-int/2addr v7, v1

    .line 221
    sub-int/2addr v7, p1

    .line 222
    or-int/2addr v2, v7

    .line 223
    if-ltz v2, :cond_14

    .line 224
    .line 225
    add-int v2, v1, p1

    .line 226
    .line 227
    new-array v11, p1, [C

    .line 228
    .line 229
    move p1, v6

    .line 230
    :goto_3
    if-ge v1, v2, :cond_b

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-ltz v7, :cond_b

    .line 237
    .line 238
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    add-int/lit8 v8, p1, 0x1

    .line 241
    .line 242
    int-to-char v7, v7

    .line 243
    aput-char v7, v11, p1

    .line 244
    .line 245
    move p1, v8

    .line 246
    goto :goto_3

    .line 247
    :cond_b
    move v12, p1

    .line 248
    :goto_4
    if-ge v1, v2, :cond_13

    .line 249
    .line 250
    add-int/lit8 p1, v1, 0x1

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    if-ltz v7, :cond_d

    .line 257
    .line 258
    add-int/lit8 v1, v12, 0x1

    .line 259
    .line 260
    int-to-char v7, v7

    .line 261
    aput-char v7, v11, v12

    .line 262
    .line 263
    :goto_5
    if-ge p1, v2, :cond_c

    .line 264
    .line 265
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-ltz v7, :cond_c

    .line 270
    .line 271
    add-int/lit8 p1, p1, 0x1

    .line 272
    .line 273
    add-int/lit8 v8, v1, 0x1

    .line 274
    .line 275
    int-to-char v7, v7

    .line 276
    aput-char v7, v11, v1

    .line 277
    .line 278
    move v1, v8

    .line 279
    goto :goto_5

    .line 280
    :cond_c
    move v12, v1

    .line 281
    move v1, p1

    .line 282
    goto :goto_4

    .line 283
    :cond_d
    if-ge v7, v4, :cond_f

    .line 284
    .line 285
    if-ge p1, v2, :cond_e

    .line 286
    .line 287
    add-int/lit8 v1, v1, 0x2

    .line 288
    .line 289
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    add-int/lit8 v8, v12, 0x1

    .line 294
    .line 295
    invoke-static {v7, p1, v11, v12}, LD/h;->z(BB[CI)V

    .line 296
    .line 297
    .line 298
    move v12, v8

    .line 299
    goto :goto_4

    .line 300
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw p1

    .line 306
    :cond_f
    if-ge v7, v3, :cond_11

    .line 307
    .line 308
    add-int/lit8 v8, v2, -0x1

    .line 309
    .line 310
    if-ge p1, v8, :cond_10

    .line 311
    .line 312
    add-int/lit8 v8, v1, 0x2

    .line 313
    .line 314
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    add-int/lit8 v1, v1, 0x3

    .line 319
    .line 320
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    add-int/lit8 v9, v12, 0x1

    .line 325
    .line 326
    invoke-static {v7, p1, v8, v11, v12}, LD/h;->y(BBB[CI)V

    .line 327
    .line 328
    .line 329
    move v12, v9

    .line 330
    goto :goto_4

    .line 331
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 332
    .line 333
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p1

    .line 337
    :cond_11
    add-int/lit8 v8, v2, -0x2

    .line 338
    .line 339
    if-ge p1, v8, :cond_12

    .line 340
    .line 341
    add-int/lit8 v8, v1, 0x2

    .line 342
    .line 343
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    add-int/lit8 v9, v1, 0x3

    .line 348
    .line 349
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    add-int/lit8 v1, v1, 0x4

    .line 354
    .line 355
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    move v9, v8

    .line 360
    move v8, p1

    .line 361
    invoke-static/range {v7 .. v12}, LD/h;->x(BBBB[CI)V

    .line 362
    .line 363
    .line 364
    add-int/lit8 v12, v12, 0x2

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw p1

    .line 373
    :cond_13
    new-instance p1, Ljava/lang/String;

    .line 374
    .line 375
    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 376
    .line 377
    .line 378
    return-object p1

    .line 379
    :cond_14
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    .line 402
    .line 403
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-direct {v2, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v2
.end method

.method public final e(I)I
    .locals 1

    .line 1
    iget v0, p0, Ld1/a;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/2addr v0, p1

    .line 11
    add-int/lit8 v0, v0, 0x4

    .line 12
    .line 13
    return v0
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget v0, p0, Ld1/a;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/2addr v0, p1

    .line 11
    iget-object p1, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public g(I)Ld1/a;
    .locals 3

    .line 1
    new-instance v0, Ld1/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {p0, v1}, Ld1/a;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ld1/a;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/2addr p1, v1

    .line 18
    add-int/2addr p1, v2

    .line 19
    invoke-virtual {p0, p1}, Ld1/a;->a(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v1, p0, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    const-string v2, "bb"

    .line 26
    .line 27
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, v1}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public h()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Ld1/a;->b(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ld1/a;->f(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method
