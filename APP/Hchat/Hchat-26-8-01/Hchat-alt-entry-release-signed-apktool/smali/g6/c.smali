.class public abstract Lg6/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public final e:Lg6/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lg6/a;->a()Lg6/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lg6/c;->e:Lg6/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

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
    iget v0, p0, Lg6/c;->d:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iget v1, p0, Lg6/c;->c:I

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
    iput-object p2, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lg6/c;->a:I

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
    iput p1, p0, Lg6/c;->c:I

    .line 13
    .line 14
    iget-object p2, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lg6/c;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lg6/c;->a:I

    .line 25
    .line 26
    iput p1, p0, Lg6/c;->c:I

    .line 27
    .line 28
    iput p1, p0, Lg6/c;->d:I

    .line 29
    .line 30
    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

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
    iget-object v2, p0, Lg6/c;->e:Lg6/a;

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
    invoke-static {v7, p1, v11, v12}, Lig/a;->F(BB[CI)V

    .line 112
    .line 113
    .line 114
    move v12, v8

    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x0

    .line 120
    return-object p1

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
    aget-byte p1, v2, p1

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x3

    .line 132
    .line 133
    aget-byte v8, v2, v8

    .line 134
    .line 135
    add-int/lit8 v9, v12, 0x1

    .line 136
    .line 137
    invoke-static {v7, p1, v8, v11, v12}, Lig/a;->E(BBB[CI)V

    .line 138
    .line 139
    .line 140
    move v12, v9

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    return-object p1

    .line 147
    :cond_6
    add-int/lit8 v8, v1, -0x2

    .line 148
    .line 149
    if-ge p1, v8, :cond_7

    .line 150
    .line 151
    add-int/lit8 v8, v0, 0x2

    .line 152
    .line 153
    aget-byte p1, v2, p1

    .line 154
    .line 155
    add-int/lit8 v9, v0, 0x3

    .line 156
    .line 157
    aget-byte v8, v2, v8

    .line 158
    .line 159
    add-int/lit8 v0, v0, 0x4

    .line 160
    .line 161
    aget-byte v10, v2, v9

    .line 162
    .line 163
    move v9, v8

    .line 164
    move v8, p1

    .line 165
    invoke-static/range {v7 .. v12}, Lig/a;->D(BBBB[CI)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v12, v12, 0x2

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 p1, 0x0

    .line 175
    return-object p1

    .line 176
    :cond_8
    new-instance p1, Ljava/lang/String;

    .line 177
    .line 178
    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 183
    .line 184
    array-length v2, v2

    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    filled-new-array {v2, v0, p1}, [Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-string v0, "buffer length=%d, index=%d, size=%d"

    .line 202
    .line 203
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_a
    or-int v2, v1, p1

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    sub-int/2addr v7, v1

    .line 218
    sub-int/2addr v7, p1

    .line 219
    or-int/2addr v2, v7

    .line 220
    if-ltz v2, :cond_14

    .line 221
    .line 222
    add-int v2, v1, p1

    .line 223
    .line 224
    new-array v11, p1, [C

    .line 225
    .line 226
    move p1, v6

    .line 227
    :goto_3
    if-ge v1, v2, :cond_b

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    if-ltz v7, :cond_b

    .line 234
    .line 235
    add-int/lit8 v1, v1, 0x1

    .line 236
    .line 237
    add-int/lit8 v8, p1, 0x1

    .line 238
    .line 239
    int-to-char v7, v7

    .line 240
    aput-char v7, v11, p1

    .line 241
    .line 242
    move p1, v8

    .line 243
    goto :goto_3

    .line 244
    :cond_b
    move v12, p1

    .line 245
    :goto_4
    if-ge v1, v2, :cond_13

    .line 246
    .line 247
    add-int/lit8 p1, v1, 0x1

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-ltz v7, :cond_d

    .line 254
    .line 255
    add-int/lit8 v1, v12, 0x1

    .line 256
    .line 257
    int-to-char v7, v7

    .line 258
    aput-char v7, v11, v12

    .line 259
    .line 260
    :goto_5
    if-ge p1, v2, :cond_c

    .line 261
    .line 262
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-ltz v7, :cond_c

    .line 267
    .line 268
    add-int/lit8 p1, p1, 0x1

    .line 269
    .line 270
    add-int/lit8 v8, v1, 0x1

    .line 271
    .line 272
    int-to-char v7, v7

    .line 273
    aput-char v7, v11, v1

    .line 274
    .line 275
    move v1, v8

    .line 276
    goto :goto_5

    .line 277
    :cond_c
    move v12, v1

    .line 278
    move v1, p1

    .line 279
    goto :goto_4

    .line 280
    :cond_d
    if-ge v7, v4, :cond_f

    .line 281
    .line 282
    if-ge p1, v2, :cond_e

    .line 283
    .line 284
    add-int/lit8 v1, v1, 0x2

    .line 285
    .line 286
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    add-int/lit8 v8, v12, 0x1

    .line 291
    .line 292
    invoke-static {v7, p1, v11, v12}, Lig/a;->F(BB[CI)V

    .line 293
    .line 294
    .line 295
    move v12, v8

    .line 296
    goto :goto_4

    .line 297
    :cond_e
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const/4 p1, 0x0

    .line 301
    return-object p1

    .line 302
    :cond_f
    if-ge v7, v3, :cond_11

    .line 303
    .line 304
    add-int/lit8 v8, v2, -0x1

    .line 305
    .line 306
    if-ge p1, v8, :cond_10

    .line 307
    .line 308
    add-int/lit8 v8, v1, 0x2

    .line 309
    .line 310
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    add-int/lit8 v1, v1, 0x3

    .line 315
    .line 316
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    add-int/lit8 v9, v12, 0x1

    .line 321
    .line 322
    invoke-static {v7, p1, v8, v11, v12}, Lig/a;->E(BBB[CI)V

    .line 323
    .line 324
    .line 325
    move v12, v9

    .line 326
    goto :goto_4

    .line 327
    :cond_10
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    const/4 p1, 0x0

    .line 331
    return-object p1

    .line 332
    :cond_11
    add-int/lit8 v8, v2, -0x2

    .line 333
    .line 334
    if-ge p1, v8, :cond_12

    .line 335
    .line 336
    add-int/lit8 v8, v1, 0x2

    .line 337
    .line 338
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    add-int/lit8 v9, v1, 0x3

    .line 343
    .line 344
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    add-int/lit8 v1, v1, 0x4

    .line 349
    .line 350
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    move v9, v8

    .line 355
    move v8, p1

    .line 356
    invoke-static/range {v7 .. v12}, Lig/a;->D(BBBB[CI)V

    .line 357
    .line 358
    .line 359
    add-int/lit8 v12, v12, 0x2

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_12
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const/4 p1, 0x0

    .line 366
    return-object p1

    .line 367
    :cond_13
    new-instance p1, Ljava/lang/String;

    .line 368
    .line 369
    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    .line 370
    .line 371
    .line 372
    return-object p1

    .line 373
    :cond_14
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    .line 396
    .line 397
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    invoke-direct {v2, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v2
.end method

.method public final e(I)I
    .locals 1

    .line 1
    iget v0, p0, Lg6/c;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

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
    iget v0, p0, Lg6/c;->a:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

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
    iget-object p1, p0, Lg6/c;->b:Ljava/nio/ByteBuffer;

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
