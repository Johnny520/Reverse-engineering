.class public abstract Lc61;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field protected bb:Ljava/nio/ByteBuffer;

.field protected bb_pos:I

.field utf8:Lya1;

.field private vtable_size:I

.field private vtable_start:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lya1;->a:Lab1;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lab1;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lya1;->a:Lab1;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lya1;->a:Lab1;

    .line 16
    .line 17
    iput-object v0, p0, Lc61;->utf8:Lya1;

    .line 18
    .line 19
    return-void
.end method

.method public static __has_identifier(Ljava/nio/ByteBuffer;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v2, v0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    add-int/2addr v4, v1

    .line 21
    add-int/2addr v4, v2

    .line 22
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    int-to-char v4, v4

    .line 27
    if-eq v3, v4, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 36
    .line 37
    const-string p1, "FlatBuffers: file identifier must be length 4"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static __indirect(ILjava/nio/ByteBuffer;)I
    .locals 0

    .line 9
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static __offset(IILjava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p1

    .line 6
    add-int/2addr p0, v0

    .line 7
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sub-int/2addr p0, p1

    .line 12
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method

.method public static __string(ILjava/nio/ByteBuffer;Lya1;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p0

    .line 6
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    check-cast p2, Lab1;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v1, 0x0

    .line 22
    const/16 v2, -0x10

    .line 23
    .line 24
    const/16 v3, -0x20

    .line 25
    .line 26
    const-string v4, "Invalid UTF-8"

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz p2, :cond_a

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    add-int/2addr p1, v0

    .line 40
    or-int v0, p1, p0

    .line 41
    .line 42
    array-length v6, p2

    .line 43
    sub-int/2addr v6, p1

    .line 44
    sub-int/2addr v6, p0

    .line 45
    or-int/2addr v0, v6

    .line 46
    if-ltz v0, :cond_9

    .line 47
    .line 48
    add-int v0, p1, p0

    .line 49
    .line 50
    new-array v10, p0, [C

    .line 51
    .line 52
    move p0, v5

    .line 53
    :goto_0
    if-ge p1, v0, :cond_0

    .line 54
    .line 55
    aget-byte v6, p2, p1

    .line 56
    .line 57
    if-ltz v6, :cond_0

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    add-int/lit8 v7, p0, 0x1

    .line 62
    .line 63
    int-to-char v6, v6

    .line 64
    aput-char v6, v10, p0

    .line 65
    .line 66
    move p0, v7

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v11, p0

    .line 69
    :goto_1
    if-ge p1, v0, :cond_8

    .line 70
    .line 71
    add-int/lit8 p0, p1, 0x1

    .line 72
    .line 73
    aget-byte v6, p2, p1

    .line 74
    .line 75
    if-ltz v6, :cond_2

    .line 76
    .line 77
    add-int/lit8 p1, v11, 0x1

    .line 78
    .line 79
    int-to-char v6, v6

    .line 80
    aput-char v6, v10, v11

    .line 81
    .line 82
    :goto_2
    if-ge p0, v0, :cond_1

    .line 83
    .line 84
    aget-byte v6, p2, p0

    .line 85
    .line 86
    if-ltz v6, :cond_1

    .line 87
    .line 88
    add-int/lit8 p0, p0, 0x1

    .line 89
    .line 90
    add-int/lit8 v7, p1, 0x1

    .line 91
    .line 92
    int-to-char v6, v6

    .line 93
    aput-char v6, v10, p1

    .line 94
    .line 95
    move p1, v7

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    move v11, p1

    .line 98
    move p1, p0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    if-ge v6, v3, :cond_4

    .line 101
    .line 102
    if-ge p0, v0, :cond_3

    .line 103
    .line 104
    add-int/lit8 p1, p1, 0x2

    .line 105
    .line 106
    aget-byte p0, p2, p0

    .line 107
    .line 108
    add-int/lit8 v7, v11, 0x1

    .line 109
    .line 110
    invoke-static {v6, p0, v10, v11}, Lz60;->B(BB[CI)V

    .line 111
    .line 112
    .line 113
    move v11, v7

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_4
    if-ge v6, v2, :cond_6

    .line 120
    .line 121
    add-int/lit8 v7, v0, -0x1

    .line 122
    .line 123
    if-ge p0, v7, :cond_5

    .line 124
    .line 125
    add-int/lit8 v7, p1, 0x2

    .line 126
    .line 127
    aget-byte p0, p2, p0

    .line 128
    .line 129
    add-int/lit8 p1, p1, 0x3

    .line 130
    .line 131
    aget-byte v7, p2, v7

    .line 132
    .line 133
    add-int/lit8 v8, v11, 0x1

    .line 134
    .line 135
    invoke-static {v6, p0, v7, v10, v11}, Lz60;->A(BBB[CI)V

    .line 136
    .line 137
    .line 138
    move v11, v8

    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_6
    add-int/lit8 v7, v0, -0x2

    .line 145
    .line 146
    if-ge p0, v7, :cond_7

    .line 147
    .line 148
    add-int/lit8 v7, p1, 0x2

    .line 149
    .line 150
    aget-byte p0, p2, p0

    .line 151
    .line 152
    add-int/lit8 v8, p1, 0x3

    .line 153
    .line 154
    aget-byte v7, p2, v7

    .line 155
    .line 156
    add-int/lit8 p1, p1, 0x4

    .line 157
    .line 158
    aget-byte v9, p2, v8

    .line 159
    .line 160
    move v8, v7

    .line 161
    move v7, p0

    .line 162
    invoke-static/range {v6 .. v11}, Lz60;->z(BBBB[CI)V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v11, v11, 0x2

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_7
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 173
    .line 174
    invoke-direct {p0, v10, v5, v11}, Ljava/lang/String;-><init>([CII)V

    .line 175
    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 179
    .line 180
    array-length p2, p2

    .line 181
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    filled-new-array {p2, p1, p0}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 198
    .line 199
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_a
    or-int p2, v0, p0

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    sub-int/2addr v6, v0

    .line 214
    sub-int/2addr v6, p0

    .line 215
    or-int/2addr p2, v6

    .line 216
    if-ltz p2, :cond_14

    .line 217
    .line 218
    add-int p2, v0, p0

    .line 219
    .line 220
    new-array v10, p0, [C

    .line 221
    .line 222
    move p0, v5

    .line 223
    :goto_3
    if-ge v0, p2, :cond_b

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-ltz v6, :cond_b

    .line 230
    .line 231
    add-int/lit8 v0, v0, 0x1

    .line 232
    .line 233
    add-int/lit8 v7, p0, 0x1

    .line 234
    .line 235
    int-to-char v6, v6

    .line 236
    aput-char v6, v10, p0

    .line 237
    .line 238
    move p0, v7

    .line 239
    goto :goto_3

    .line 240
    :cond_b
    move v11, p0

    .line 241
    :goto_4
    if-ge v0, p2, :cond_13

    .line 242
    .line 243
    add-int/lit8 p0, v0, 0x1

    .line 244
    .line 245
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    if-ltz v6, :cond_d

    .line 250
    .line 251
    add-int/lit8 v0, v11, 0x1

    .line 252
    .line 253
    int-to-char v6, v6

    .line 254
    aput-char v6, v10, v11

    .line 255
    .line 256
    :goto_5
    if-ge p0, p2, :cond_c

    .line 257
    .line 258
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-ltz v6, :cond_c

    .line 263
    .line 264
    add-int/lit8 p0, p0, 0x1

    .line 265
    .line 266
    add-int/lit8 v7, v0, 0x1

    .line 267
    .line 268
    int-to-char v6, v6

    .line 269
    aput-char v6, v10, v0

    .line 270
    .line 271
    move v0, v7

    .line 272
    goto :goto_5

    .line 273
    :cond_c
    move v11, v0

    .line 274
    move v0, p0

    .line 275
    goto :goto_4

    .line 276
    :cond_d
    if-ge v6, v3, :cond_f

    .line 277
    .line 278
    if-ge p0, p2, :cond_e

    .line 279
    .line 280
    add-int/lit8 v0, v0, 0x2

    .line 281
    .line 282
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    add-int/lit8 v7, v11, 0x1

    .line 287
    .line 288
    invoke-static {v6, p0, v10, v11}, Lz60;->B(BB[CI)V

    .line 289
    .line 290
    .line 291
    move v11, v7

    .line 292
    goto :goto_4

    .line 293
    :cond_e
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-object v1

    .line 297
    :cond_f
    if-ge v6, v2, :cond_11

    .line 298
    .line 299
    add-int/lit8 v7, p2, -0x1

    .line 300
    .line 301
    if-ge p0, v7, :cond_10

    .line 302
    .line 303
    add-int/lit8 v7, v0, 0x2

    .line 304
    .line 305
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    add-int/lit8 v0, v0, 0x3

    .line 310
    .line 311
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    add-int/lit8 v8, v11, 0x1

    .line 316
    .line 317
    invoke-static {v6, p0, v7, v10, v11}, Lz60;->A(BBB[CI)V

    .line 318
    .line 319
    .line 320
    move v11, v8

    .line 321
    goto :goto_4

    .line 322
    :cond_10
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-object v1

    .line 326
    :cond_11
    add-int/lit8 v7, p2, -0x2

    .line 327
    .line 328
    if-ge p0, v7, :cond_12

    .line 329
    .line 330
    add-int/lit8 v7, v0, 0x2

    .line 331
    .line 332
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    add-int/lit8 v8, v0, 0x3

    .line 337
    .line 338
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    add-int/lit8 v0, v0, 0x4

    .line 343
    .line 344
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    move v8, v7

    .line 349
    move v7, p0

    .line 350
    invoke-static/range {v6 .. v11}, Lz60;->z(BBBB[CI)V

    .line 351
    .line 352
    .line 353
    add-int/lit8 v11, v11, 0x2

    .line 354
    .line 355
    goto :goto_4

    .line 356
    :cond_12
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-object v1

    .line 360
    :cond_13
    new-instance p0, Ljava/lang/String;

    .line 361
    .line 362
    invoke-direct {p0, v10, v5, v11}, Ljava/lang/String;-><init>([CII)V

    .line 363
    .line 364
    .line 365
    return-object p0

    .line 366
    :cond_14
    new-instance p2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    filled-new-array {p1, v0, p0}, [Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    const-string p1, "buffer limit=%d, index=%d, limit=%d"

    .line 389
    .line 390
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-direct {p2, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw p2
.end method

.method public static __union(Lc61;ILjava/nio/ByteBuffer;)Lc61;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lc61;->__indirect(ILjava/nio/ByteBuffer;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lc61;->__reset(ILjava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static compareStrings(IILjava/nio/ByteBuffer;)I
    .locals 8

    .line 1
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p0

    .line 6
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/2addr p0, p1

    .line 11
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v0, v0, 0x4

    .line 20
    .line 21
    add-int/lit8 p0, p0, 0x4

    .line 22
    .line 23
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v2, :cond_1

    .line 29
    .line 30
    add-int v4, v3, v0

    .line 31
    .line 32
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int v6, v3, p0

    .line 37
    .line 38
    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eq v5, v7, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    sub-int/2addr p0, p1

    .line 53
    return p0

    .line 54
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sub-int/2addr p1, v1

    .line 58
    return p1
.end method

.method public static compareStrings(I[BLjava/nio/ByteBuffer;)I
    .locals 7

    .line 59
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p0

    .line 60
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    .line 61
    array-length v1, p1

    add-int/lit8 v0, v0, 0x4

    .line 62
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, v0

    .line 63
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    aget-byte v6, p1, v3

    if-eq v5, v6, :cond_0

    .line 64
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    aget-byte p1, p1, v3

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr p0, v1

    return p0
.end method


# virtual methods
.method public __indirect(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

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

.method public __offset(I)I
    .locals 1

    .line 18
    iget v0, p0, Lc61;->vtable_size:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    iget p0, p0, Lc61;->vtable_start:I

    add-int/2addr p0, p1

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public __reset()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v0, v1}, Lc61;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public __reset(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lc61;->bb_pos:I

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
    iput p1, p0, Lc61;->vtable_start:I

    .line 13
    .line 14
    iget-object p2, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lc61;->vtable_size:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lc61;->bb_pos:I

    .line 25
    .line 26
    iput p1, p0, Lc61;->vtable_start:I

    .line 27
    .line 28
    iput p1, p0, Lc61;->vtable_size:I

    .line 29
    .line 30
    return-void
.end method

.method public __string(I)Ljava/lang/String;
    .locals 1

    .line 398
    iget-object v0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    iget-object p0, p0, Lc61;->utf8:Lya1;

    invoke-static {p1, v0, p0}, Lc61;->__string(ILjava/nio/ByteBuffer;Lya1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public __union(Lc61;I)Lc61;
    .locals 0

    .line 9
    iget-object p0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2, p0}, Lc61;->__union(Lc61;ILjava/nio/ByteBuffer;)Lc61;

    move-result-object p0

    return-object p0
.end method

.method public __vector(I)I
    .locals 1

    .line 1
    iget v0, p0, Lc61;->bb_pos:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object p0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

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

.method public __vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lc61;->__offset(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object v0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, p1}, Lc61;->__vector(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lc61;->__vector_len(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    mul-int/2addr p0, p2

    .line 33
    add-int/2addr p0, v1

    .line 34
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public __vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lc61;->__offset(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0, p2}, Lc61;->__vector(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lc61;->__vector_len(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    mul-int/2addr p0, p3

    .line 21
    add-int/2addr p0, v0

    .line 22
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    return-object p1
.end method

.method public __vector_len(I)I
    .locals 1

    .line 1
    iget v0, p0, Lc61;->bb_pos:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

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
    iget-object p0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

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

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lc61;->bb:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public sortTables([ILjava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Ljava/lang/Integer;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    array-length v3, p1

    .line 7
    if-ge v2, v3, :cond_0

    .line 8
    .line 9
    aget v3, p1, v2

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    aput-object v3, v0, v2

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, Lb61;

    .line 21
    .line 22
    invoke-direct {v2, p0, p2}, Lb61;-><init>(Lc61;Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    :goto_1
    array-length p0, p1

    .line 29
    if-ge v1, p0, :cond_1

    .line 30
    .line 31
    aget-object p0, v0, v1

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    aput p0, p1, v1

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    return-void
.end method
