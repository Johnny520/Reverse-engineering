.class public abstract Lox2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:I

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public final e:Ljx2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljx2;->d()Ljx2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lox2;->e:Ljx2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    add-int/2addr p0, p1

    .line 8
    return p0
.end method

.method public final b(I)I
    .locals 1

    .line 1
    iget v0, p0, Lox2;->d:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iget p0, p0, Lox2;->c:I

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final c(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lox2;->a:I

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
    iput p1, p0, Lox2;->c:I

    .line 13
    .line 14
    iget-object p2, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lox2;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lox2;->a:I

    .line 25
    .line 26
    iput p1, p0, Lox2;->c:I

    .line 27
    .line 28
    iput p1, p0, Lox2;->d:I

    .line 29
    .line 30
    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

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
    iget-object p0, p0, Lox2;->e:Ljx2;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/16 v3, -0x10

    .line 25
    .line 26
    const/16 v4, -0x20

    .line 27
    .line 28
    const-string v5, "Invalid UTF-8"

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eqz p0, :cond_a

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, v1

    .line 42
    or-int v1, v0, p1

    .line 43
    .line 44
    array-length v7, p0

    .line 45
    sub-int/2addr v7, v0

    .line 46
    sub-int/2addr v7, p1

    .line 47
    or-int/2addr v1, v7

    .line 48
    if-ltz v1, :cond_9

    .line 49
    .line 50
    add-int v1, v0, p1

    .line 51
    .line 52
    new-array v11, p1, [C

    .line 53
    .line 54
    move p1, v6

    .line 55
    :goto_0
    if-ge v0, v1, :cond_0

    .line 56
    .line 57
    aget-byte v7, p0, v0

    .line 58
    .line 59
    if-ltz v7, :cond_0

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    add-int/lit8 v8, p1, 0x1

    .line 64
    .line 65
    int-to-char v7, v7

    .line 66
    aput-char v7, v11, p1

    .line 67
    .line 68
    move p1, v8

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v12, p1

    .line 71
    :goto_1
    if-ge v0, v1, :cond_8

    .line 72
    .line 73
    add-int/lit8 p1, v0, 0x1

    .line 74
    .line 75
    aget-byte v7, p0, v0

    .line 76
    .line 77
    if-ltz v7, :cond_2

    .line 78
    .line 79
    add-int/lit8 v0, v12, 0x1

    .line 80
    .line 81
    int-to-char v7, v7

    .line 82
    aput-char v7, v11, v12

    .line 83
    .line 84
    :goto_2
    if-ge p1, v1, :cond_1

    .line 85
    .line 86
    aget-byte v7, p0, p1

    .line 87
    .line 88
    if-ltz v7, :cond_1

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    add-int/lit8 v8, v0, 0x1

    .line 93
    .line 94
    int-to-char v7, v7

    .line 95
    aput-char v7, v11, v0

    .line 96
    .line 97
    move v0, v8

    .line 98
    goto :goto_2

    .line 99
    :cond_1
    move v12, v0

    .line 100
    move v0, p1

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    if-ge v7, v4, :cond_4

    .line 103
    .line 104
    if-ge p1, v1, :cond_3

    .line 105
    .line 106
    add-int/lit8 v0, v0, 0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    add-int/lit8 v8, v12, 0x1

    .line 111
    .line 112
    invoke-static {v7, p1, v11, v12}, Lgg3;->d(BB[CI)V

    .line 113
    .line 114
    .line 115
    move v12, v8

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :cond_4
    if-ge v7, v3, :cond_6

    .line 122
    .line 123
    add-int/lit8 v8, v1, -0x1

    .line 124
    .line 125
    if-ge p1, v8, :cond_5

    .line 126
    .line 127
    add-int/lit8 v8, v0, 0x2

    .line 128
    .line 129
    aget-byte p1, p0, p1

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x3

    .line 132
    .line 133
    aget-byte v8, p0, v8

    .line 134
    .line 135
    add-int/lit8 v9, v12, 0x1

    .line 136
    .line 137
    invoke-static {v7, p1, v8, v11, v12}, Lgg3;->c(BBB[CI)V

    .line 138
    .line 139
    .line 140
    move v12, v9

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v2

    .line 146
    :cond_6
    add-int/lit8 v8, v1, -0x2

    .line 147
    .line 148
    if-ge p1, v8, :cond_7

    .line 149
    .line 150
    add-int/lit8 v8, v0, 0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    add-int/lit8 v9, v0, 0x3

    .line 155
    .line 156
    aget-byte v8, p0, v8

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x4

    .line 159
    .line 160
    aget-byte v10, p0, v9

    .line 161
    .line 162
    move v9, v8

    .line 163
    move v8, p1

    .line 164
    invoke-static/range {v7 .. v12}, Lgg3;->b(BBBB[CI)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v12, v12, 0x2

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object v2

    .line 174
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {p0, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 181
    .line 182
    array-length p0, p0

    .line 183
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 200
    .line 201
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-direct {v1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_a
    or-int p0, v1, p1

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    sub-int/2addr v7, v1

    .line 216
    sub-int/2addr v7, p1

    .line 217
    or-int/2addr p0, v7

    .line 218
    if-ltz p0, :cond_14

    .line 219
    .line 220
    add-int p0, v1, p1

    .line 221
    .line 222
    new-array v11, p1, [C

    .line 223
    .line 224
    move p1, v6

    .line 225
    :goto_3
    if-ge v1, p0, :cond_b

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-ltz v7, :cond_b

    .line 232
    .line 233
    add-int/lit8 v1, v1, 0x1

    .line 234
    .line 235
    add-int/lit8 v8, p1, 0x1

    .line 236
    .line 237
    int-to-char v7, v7

    .line 238
    aput-char v7, v11, p1

    .line 239
    .line 240
    move p1, v8

    .line 241
    goto :goto_3

    .line 242
    :cond_b
    move v12, p1

    .line 243
    :goto_4
    if-ge v1, p0, :cond_13

    .line 244
    .line 245
    add-int/lit8 p1, v1, 0x1

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    if-ltz v7, :cond_d

    .line 252
    .line 253
    add-int/lit8 v1, v12, 0x1

    .line 254
    .line 255
    int-to-char v7, v7

    .line 256
    aput-char v7, v11, v12

    .line 257
    .line 258
    :goto_5
    if-ge p1, p0, :cond_c

    .line 259
    .line 260
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    if-ltz v7, :cond_c

    .line 265
    .line 266
    add-int/lit8 p1, p1, 0x1

    .line 267
    .line 268
    add-int/lit8 v8, v1, 0x1

    .line 269
    .line 270
    int-to-char v7, v7

    .line 271
    aput-char v7, v11, v1

    .line 272
    .line 273
    move v1, v8

    .line 274
    goto :goto_5

    .line 275
    :cond_c
    move v12, v1

    .line 276
    move v1, p1

    .line 277
    goto :goto_4

    .line 278
    :cond_d
    if-ge v7, v4, :cond_f

    .line 279
    .line 280
    if-ge p1, p0, :cond_e

    .line 281
    .line 282
    add-int/lit8 v1, v1, 0x2

    .line 283
    .line 284
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    add-int/lit8 v8, v12, 0x1

    .line 289
    .line 290
    invoke-static {v7, p1, v11, v12}, Lgg3;->d(BB[CI)V

    .line 291
    .line 292
    .line 293
    move v12, v8

    .line 294
    goto :goto_4

    .line 295
    :cond_e
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v2

    .line 299
    :cond_f
    if-ge v7, v3, :cond_11

    .line 300
    .line 301
    add-int/lit8 v8, p0, -0x1

    .line 302
    .line 303
    if-ge p1, v8, :cond_10

    .line 304
    .line 305
    add-int/lit8 v8, v1, 0x2

    .line 306
    .line 307
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    add-int/lit8 v1, v1, 0x3

    .line 312
    .line 313
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    add-int/lit8 v9, v12, 0x1

    .line 318
    .line 319
    invoke-static {v7, p1, v8, v11, v12}, Lgg3;->c(BBB[CI)V

    .line 320
    .line 321
    .line 322
    move v12, v9

    .line 323
    goto :goto_4

    .line 324
    :cond_10
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-object v2

    .line 328
    :cond_11
    add-int/lit8 v8, p0, -0x2

    .line 329
    .line 330
    if-ge p1, v8, :cond_12

    .line 331
    .line 332
    add-int/lit8 v8, v1, 0x2

    .line 333
    .line 334
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    add-int/lit8 v9, v1, 0x3

    .line 339
    .line 340
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    add-int/lit8 v1, v1, 0x4

    .line 345
    .line 346
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    move v9, v8

    .line 351
    move v8, p1

    .line 352
    invoke-static/range {v7 .. v12}, Lgg3;->b(BBBB[CI)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v12, v12, 0x2

    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_12
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return-object v2

    .line 362
    :cond_13
    new-instance p0, Ljava/lang/String;

    .line 363
    .line 364
    invoke-direct {p0, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 365
    .line 366
    .line 367
    return-object p0

    .line 368
    :cond_14
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    .line 391
    .line 392
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw p0
.end method

.method public final e(I)I
    .locals 1

    .line 1
    iget v0, p0, Lox2;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/2addr p0, p1

    .line 11
    add-int/lit8 p0, p0, 0x4

    .line 12
    .line 13
    return p0
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget v0, p0, Lox2;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

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
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
