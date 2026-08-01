.class public abstract Lp22;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field protected bb:Ljava/nio/ByteBuffer;

.field protected bb_pos:I

.field utf8:Lf72;

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
    sget-object v0, Lf72;->α:Lh72;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lh72;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lf72;->α:Lh72;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lf72;->α:Lh72;

    .line 16
    .line 17
    iput-object v0, p0, Lp22;->utf8:Lf72;

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

.method public static __string(ILjava/nio/ByteBuffer;Lf72;)Ljava/lang/String;
    .locals 11

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
    check-cast p2, Lh72;

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
    const/16 v1, -0x10

    .line 22
    .line 23
    const/16 v2, -0x20

    .line 24
    .line 25
    const-string v3, "Invalid UTF-8"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz p2, :cond_a

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/2addr p1, v0

    .line 39
    or-int v0, p1, p0

    .line 40
    .line 41
    array-length v5, p2

    .line 42
    sub-int/2addr v5, p1

    .line 43
    sub-int/2addr v5, p0

    .line 44
    or-int/2addr v0, v5

    .line 45
    if-ltz v0, :cond_9

    .line 46
    .line 47
    add-int v0, p1, p0

    .line 48
    .line 49
    new-array v9, p0, [C

    .line 50
    .line 51
    move p0, v4

    .line 52
    :goto_0
    if-ge p1, v0, :cond_0

    .line 53
    .line 54
    aget-byte v5, p2, p1

    .line 55
    .line 56
    if-ltz v5, :cond_0

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    add-int/lit8 v6, p0, 0x1

    .line 61
    .line 62
    int-to-char v5, v5

    .line 63
    aput-char v5, v9, p0

    .line 64
    .line 65
    move p0, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v10, p0

    .line 68
    :goto_1
    if-ge p1, v0, :cond_8

    .line 69
    .line 70
    add-int/lit8 p0, p1, 0x1

    .line 71
    .line 72
    aget-byte v5, p2, p1

    .line 73
    .line 74
    if-ltz v5, :cond_2

    .line 75
    .line 76
    add-int/lit8 p1, v10, 0x1

    .line 77
    .line 78
    int-to-char v5, v5

    .line 79
    aput-char v5, v9, v10

    .line 80
    .line 81
    :goto_2
    if-ge p0, v0, :cond_1

    .line 82
    .line 83
    aget-byte v5, p2, p0

    .line 84
    .line 85
    if-ltz v5, :cond_1

    .line 86
    .line 87
    add-int/lit8 p0, p0, 0x1

    .line 88
    .line 89
    add-int/lit8 v6, p1, 0x1

    .line 90
    .line 91
    int-to-char v5, v5

    .line 92
    aput-char v5, v9, p1

    .line 93
    .line 94
    move p1, v6

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move v10, p1

    .line 97
    move p1, p0

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    if-ge v5, v2, :cond_4

    .line 100
    .line 101
    if-ge p0, v0, :cond_3

    .line 102
    .line 103
    add-int/lit8 p1, p1, 0x2

    .line 104
    .line 105
    aget-byte p0, p2, p0

    .line 106
    .line 107
    add-int/lit8 v6, v10, 0x1

    .line 108
    .line 109
    invoke-static {v5, p0, v9, v10}, Lg81;->λ(BB[CI)V

    .line 110
    .line 111
    .line 112
    move v10, v6

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    return-object p0

    .line 119
    :cond_4
    if-ge v5, v1, :cond_6

    .line 120
    .line 121
    add-int/lit8 v6, v0, -0x1

    .line 122
    .line 123
    if-ge p0, v6, :cond_5

    .line 124
    .line 125
    add-int/lit8 v6, p1, 0x2

    .line 126
    .line 127
    aget-byte p0, p2, p0

    .line 128
    .line 129
    add-int/lit8 p1, p1, 0x3

    .line 130
    .line 131
    aget-byte v6, p2, v6

    .line 132
    .line 133
    add-int/lit8 v7, v10, 0x1

    .line 134
    .line 135
    invoke-static {v5, p0, v6, v9, v10}, Lg81;->κ(BBB[CI)V

    .line 136
    .line 137
    .line 138
    move v10, v7

    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p0, 0x0

    .line 144
    return-object p0

    .line 145
    :cond_6
    add-int/lit8 v6, v0, -0x2

    .line 146
    .line 147
    if-ge p0, v6, :cond_7

    .line 148
    .line 149
    add-int/lit8 v6, p1, 0x2

    .line 150
    .line 151
    aget-byte p0, p2, p0

    .line 152
    .line 153
    add-int/lit8 v7, p1, 0x3

    .line 154
    .line 155
    aget-byte v6, p2, v6

    .line 156
    .line 157
    add-int/lit8 p1, p1, 0x4

    .line 158
    .line 159
    aget-byte v8, p2, v7

    .line 160
    .line 161
    move v7, v6

    .line 162
    move v6, p0

    .line 163
    invoke-static/range {v5 .. v10}, Lg81;->ι(BBBB[CI)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x2

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 p0, 0x0

    .line 173
    return-object p0

    .line 174
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {p0, v9, v4, v10}, Ljava/lang/String;-><init>([CII)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 181
    .line 182
    array-length p2, p2

    .line 183
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    filled-new-array {p2, p1, p0}, [Ljava/lang/Object;

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
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_a
    or-int p2, v0, p0

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    sub-int/2addr v5, v0

    .line 216
    sub-int/2addr v5, p0

    .line 217
    or-int/2addr p2, v5

    .line 218
    if-ltz p2, :cond_14

    .line 219
    .line 220
    add-int p2, v0, p0

    .line 221
    .line 222
    new-array v9, p0, [C

    .line 223
    .line 224
    move p0, v4

    .line 225
    :goto_3
    if-ge v0, p2, :cond_b

    .line 226
    .line 227
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-ltz v5, :cond_b

    .line 232
    .line 233
    add-int/lit8 v0, v0, 0x1

    .line 234
    .line 235
    add-int/lit8 v6, p0, 0x1

    .line 236
    .line 237
    int-to-char v5, v5

    .line 238
    aput-char v5, v9, p0

    .line 239
    .line 240
    move p0, v6

    .line 241
    goto :goto_3

    .line 242
    :cond_b
    move v10, p0

    .line 243
    :goto_4
    if-ge v0, p2, :cond_13

    .line 244
    .line 245
    add-int/lit8 p0, v0, 0x1

    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-ltz v5, :cond_d

    .line 252
    .line 253
    add-int/lit8 v0, v10, 0x1

    .line 254
    .line 255
    int-to-char v5, v5

    .line 256
    aput-char v5, v9, v10

    .line 257
    .line 258
    :goto_5
    if-ge p0, p2, :cond_c

    .line 259
    .line 260
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-ltz v5, :cond_c

    .line 265
    .line 266
    add-int/lit8 p0, p0, 0x1

    .line 267
    .line 268
    add-int/lit8 v6, v0, 0x1

    .line 269
    .line 270
    int-to-char v5, v5

    .line 271
    aput-char v5, v9, v0

    .line 272
    .line 273
    move v0, v6

    .line 274
    goto :goto_5

    .line 275
    :cond_c
    move v10, v0

    .line 276
    move v0, p0

    .line 277
    goto :goto_4

    .line 278
    :cond_d
    if-ge v5, v2, :cond_f

    .line 279
    .line 280
    if-ge p0, p2, :cond_e

    .line 281
    .line 282
    add-int/lit8 v0, v0, 0x2

    .line 283
    .line 284
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    add-int/lit8 v6, v10, 0x1

    .line 289
    .line 290
    invoke-static {v5, p0, v9, v10}, Lg81;->λ(BB[CI)V

    .line 291
    .line 292
    .line 293
    move v10, v6

    .line 294
    goto :goto_4

    .line 295
    :cond_e
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    const/4 p0, 0x0

    .line 299
    return-object p0

    .line 300
    :cond_f
    if-ge v5, v1, :cond_11

    .line 301
    .line 302
    add-int/lit8 v6, p2, -0x1

    .line 303
    .line 304
    if-ge p0, v6, :cond_10

    .line 305
    .line 306
    add-int/lit8 v6, v0, 0x2

    .line 307
    .line 308
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    add-int/lit8 v0, v0, 0x3

    .line 313
    .line 314
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    add-int/lit8 v7, v10, 0x1

    .line 319
    .line 320
    invoke-static {v5, p0, v6, v9, v10}, Lg81;->κ(BBB[CI)V

    .line 321
    .line 322
    .line 323
    move v10, v7

    .line 324
    goto :goto_4

    .line 325
    :cond_10
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const/4 p0, 0x0

    .line 329
    return-object p0

    .line 330
    :cond_11
    add-int/lit8 v6, p2, -0x2

    .line 331
    .line 332
    if-ge p0, v6, :cond_12

    .line 333
    .line 334
    add-int/lit8 v6, v0, 0x2

    .line 335
    .line 336
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    add-int/lit8 v7, v0, 0x3

    .line 341
    .line 342
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    add-int/lit8 v0, v0, 0x4

    .line 347
    .line 348
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    move v7, v6

    .line 353
    move v6, p0

    .line 354
    invoke-static/range {v5 .. v10}, Lg81;->ι(BBBB[CI)V

    .line 355
    .line 356
    .line 357
    add-int/lit8 v10, v10, 0x2

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_12
    invoke-static {v3}, Lγ;->ν(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const/4 p0, 0x0

    .line 364
    return-object p0

    .line 365
    :cond_13
    new-instance p0, Ljava/lang/String;

    .line 366
    .line 367
    invoke-direct {p0, v9, v4, v10}, Ljava/lang/String;-><init>([CII)V

    .line 368
    .line 369
    .line 370
    return-object p0

    .line 371
    :cond_14
    new-instance p2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    filled-new-array {p1, v0, p0}, [Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    const-string p1, "buffer limit=%d, index=%d, limit=%d"

    .line 394
    .line 395
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-direct {p2, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw p2
.end method

.method public static __union(Lp22;ILjava/nio/ByteBuffer;)Lp22;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lp22;->__indirect(ILjava/nio/ByteBuffer;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lp22;->__reset(ILjava/nio/ByteBuffer;)V

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
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    iget v0, p0, Lp22;->vtable_size:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    iget p0, p0, Lp22;->vtable_start:I

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
    invoke-virtual {p0, v0, v1}, Lp22;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public __reset(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lp22;->bb_pos:I

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
    iput p1, p0, Lp22;->vtable_start:I

    .line 13
    .line 14
    iget-object p2, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lp22;->vtable_size:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lp22;->bb_pos:I

    .line 25
    .line 26
    iput p1, p0, Lp22;->vtable_start:I

    .line 27
    .line 28
    iput p1, p0, Lp22;->vtable_size:I

    .line 29
    .line 30
    return-void
.end method

.method public __string(I)Ljava/lang/String;
    .locals 1

    .line 403
    iget-object v0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    iget-object p0, p0, Lp22;->utf8:Lf72;

    invoke-static {p1, v0, p0}, Lp22;->__string(ILjava/nio/ByteBuffer;Lf72;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public __union(Lp22;I)Lp22;
    .locals 0

    .line 9
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2, p0}, Lp22;->__union(Lp22;ILjava/nio/ByteBuffer;)Lp22;

    move-result-object p0

    return-object p0
.end method

.method public __vector(I)I
    .locals 1

    .line 1
    iget v0, p0, Lp22;->bb_pos:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    invoke-virtual {p0, p1}, Lp22;->__offset(I)I

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
    iget-object v0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    invoke-virtual {p0, p1}, Lp22;->__vector(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lp22;->__vector_len(I)I

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
    invoke-virtual {p0, p2}, Lp22;->__offset(I)I

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
    invoke-virtual {p0, p2}, Lp22;->__vector(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lp22;->__vector_len(I)I

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
    iget v0, p0, Lp22;->bb_pos:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

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
    new-instance v2, Liz1;

    .line 21
    .line 22
    invoke-direct {v2, p0, p2}, Liz1;-><init>(Lp22;Ljava/nio/ByteBuffer;)V

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
