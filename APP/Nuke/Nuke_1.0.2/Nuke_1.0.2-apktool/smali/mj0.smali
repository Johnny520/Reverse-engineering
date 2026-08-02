.class public final Lmj0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public b:I

.field public c:I

.field public d:[I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I

.field public i:[I

.field public j:I

.field public k:I

.field public final l:Lsn;

.field public final m:Ljx2;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lsn;->H:Lsn;

    .line 2
    .line 3
    invoke-static {}, Ljx2;->d()Ljx2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iput v2, p0, Lmj0;->c:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lmj0;->d:[I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, p0, Lmj0;->e:I

    .line 18
    .line 19
    iput-boolean v2, p0, Lmj0;->f:Z

    .line 20
    .line 21
    iput-boolean v2, p0, Lmj0;->g:Z

    .line 22
    .line 23
    const/16 v3, 0x10

    .line 24
    .line 25
    new-array v3, v3, [I

    .line 26
    .line 27
    iput-object v3, p0, Lmj0;->i:[I

    .line 28
    .line 29
    iput v2, p0, Lmj0;->j:I

    .line 30
    .line 31
    iput v2, p0, Lmj0;->k:I

    .line 32
    .line 33
    iput-object v0, p0, Lmj0;->l:Lsn;

    .line 34
    .line 35
    const/16 v0, 0x400

    .line 36
    .line 37
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    iput-object v1, p0, Lmj0;->m:Ljx2;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lmj0;->b:I

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1, v0}, Lmj0;->k(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lmj0;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lmj0;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-virtual {p0, v1, v0}, Lmj0;->k(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lmj0;->j()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sub-int/2addr v0, p1

    .line 11
    add-int/2addr v0, v1

    .line 12
    iget-object p1, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iget v2, p0, Lmj0;->b:I

    .line 15
    .line 16
    sub-int/2addr v2, v1

    .line 17
    iput v2, p0, Lmj0;->b:I

    .line 18
    .line 19
    invoke-virtual {p1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final c(II)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lmj0;->b(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lmj0;->l(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final d(S)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-virtual {p0, v1, v0}, Lmj0;->k(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lmj0;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lmj0;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final e(Ljava/lang/CharSequence;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lmj0;->m:Ljx2;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v4

    .line 16
    :goto_0
    const/16 v6, 0x80

    .line 17
    .line 18
    if-ge v5, v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-ge v7, v6, :cond_0

    .line 25
    .line 26
    add-int/lit8 v5, v5, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v7, v3

    .line 30
    :goto_1
    const v8, 0xdfff

    .line 31
    .line 32
    .line 33
    const v9, 0xd800

    .line 34
    .line 35
    .line 36
    const/16 v10, 0x800

    .line 37
    .line 38
    const/4 v11, 0x1

    .line 39
    if-ge v5, v3, :cond_6

    .line 40
    .line 41
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    if-ge v12, v10, :cond_1

    .line 46
    .line 47
    rsub-int/lit8 v8, v12, 0x7f

    .line 48
    .line 49
    ushr-int/lit8 v8, v8, 0x1f

    .line 50
    .line 51
    add-int/2addr v7, v8

    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    move v13, v4

    .line 60
    :goto_2
    if-ge v5, v12, :cond_5

    .line 61
    .line 62
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-ge v14, v10, :cond_2

    .line 67
    .line 68
    rsub-int/lit8 v14, v14, 0x7f

    .line 69
    .line 70
    ushr-int/lit8 v14, v14, 0x1f

    .line 71
    .line 72
    add-int/2addr v13, v14

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    add-int/lit8 v13, v13, 0x2

    .line 75
    .line 76
    if-gt v9, v14, :cond_4

    .line 77
    .line 78
    if-gt v14, v8, :cond_4

    .line 79
    .line 80
    invoke-static {v1, v5}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    const/high16 v15, 0x10000

    .line 85
    .line 86
    if-lt v14, v15, :cond_3

    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    new-instance v0, Lo01;

    .line 92
    .line 93
    invoke-direct {v0, v5, v12}, Lo01;-><init>(II)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_4
    :goto_3
    add-int/2addr v5, v11

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    add-int/2addr v7, v13

    .line 100
    :cond_6
    if-lt v7, v3, :cond_1d

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Lmj0;->a(B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v11, v7, v11}, Lmj0;->n(III)V

    .line 106
    .line 107
    .line 108
    iget-object v3, v0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    iget v5, v0, Lmj0;->b:I

    .line 111
    .line 112
    sub-int/2addr v5, v7

    .line 113
    iput v5, v0, Lmj0;->b:I

    .line 114
    .line 115
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 116
    .line 117
    .line 118
    iget-object v3, v0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const-string v5, " at index "

    .line 128
    .line 129
    const-string v7, "Failed writing "

    .line 130
    .line 131
    if-eqz v2, :cond_13

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    add-int/2addr v13, v2

    .line 146
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    add-int/2addr v14, v13

    .line 155
    :goto_4
    move/from16 v16, v11

    .line 156
    .line 157
    if-ge v4, v15, :cond_7

    .line 158
    .line 159
    add-int v11, v4, v13

    .line 160
    .line 161
    if-ge v11, v14, :cond_7

    .line 162
    .line 163
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-ge v8, v6, :cond_7

    .line 168
    .line 169
    int-to-byte v8, v8

    .line 170
    aput-byte v8, v12, v11

    .line 171
    .line 172
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    move/from16 v11, v16

    .line 175
    .line 176
    const v8, 0xdfff

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    if-ne v4, v15, :cond_8

    .line 181
    .line 182
    add-int/2addr v13, v15

    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :cond_8
    add-int/2addr v13, v4

    .line 186
    :goto_5
    if-ge v4, v15, :cond_12

    .line 187
    .line 188
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-ge v8, v6, :cond_9

    .line 193
    .line 194
    if-ge v13, v14, :cond_9

    .line 195
    .line 196
    add-int/lit8 v11, v13, 0x1

    .line 197
    .line 198
    int-to-byte v8, v8

    .line 199
    aput-byte v8, v12, v13

    .line 200
    .line 201
    move v13, v11

    .line 202
    goto/16 :goto_6

    .line 203
    .line 204
    :cond_9
    if-ge v8, v10, :cond_a

    .line 205
    .line 206
    add-int/lit8 v11, v14, -0x2

    .line 207
    .line 208
    if-gt v13, v11, :cond_a

    .line 209
    .line 210
    add-int/lit8 v11, v13, 0x1

    .line 211
    .line 212
    ushr-int/lit8 v10, v8, 0x6

    .line 213
    .line 214
    or-int/lit16 v10, v10, 0x3c0

    .line 215
    .line 216
    int-to-byte v10, v10

    .line 217
    aput-byte v10, v12, v13

    .line 218
    .line 219
    add-int/lit8 v13, v13, 0x2

    .line 220
    .line 221
    and-int/lit8 v8, v8, 0x3f

    .line 222
    .line 223
    or-int/2addr v8, v6

    .line 224
    int-to-byte v8, v8

    .line 225
    aput-byte v8, v12, v11

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_a
    if-lt v8, v9, :cond_b

    .line 229
    .line 230
    const v10, 0xdfff

    .line 231
    .line 232
    .line 233
    if-ge v10, v8, :cond_c

    .line 234
    .line 235
    :cond_b
    add-int/lit8 v10, v14, -0x3

    .line 236
    .line 237
    if-gt v13, v10, :cond_c

    .line 238
    .line 239
    add-int/lit8 v10, v13, 0x1

    .line 240
    .line 241
    ushr-int/lit8 v11, v8, 0xc

    .line 242
    .line 243
    or-int/lit16 v11, v11, 0x1e0

    .line 244
    .line 245
    int-to-byte v11, v11

    .line 246
    aput-byte v11, v12, v13

    .line 247
    .line 248
    add-int/lit8 v11, v13, 0x2

    .line 249
    .line 250
    ushr-int/lit8 v17, v8, 0x6

    .line 251
    .line 252
    and-int/lit8 v9, v17, 0x3f

    .line 253
    .line 254
    or-int/2addr v9, v6

    .line 255
    int-to-byte v9, v9

    .line 256
    aput-byte v9, v12, v10

    .line 257
    .line 258
    add-int/lit8 v13, v13, 0x3

    .line 259
    .line 260
    and-int/lit8 v8, v8, 0x3f

    .line 261
    .line 262
    or-int/2addr v8, v6

    .line 263
    int-to-byte v8, v8

    .line 264
    aput-byte v8, v12, v11

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_c
    add-int/lit8 v9, v14, -0x4

    .line 268
    .line 269
    if-gt v13, v9, :cond_f

    .line 270
    .line 271
    add-int/lit8 v9, v4, 0x1

    .line 272
    .line 273
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    if-eq v9, v10, :cond_e

    .line 278
    .line 279
    invoke-interface {v1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    invoke-static {v8, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-eqz v10, :cond_d

    .line 288
    .line 289
    invoke-static {v8, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    add-int/lit8 v8, v13, 0x1

    .line 294
    .line 295
    ushr-int/lit8 v10, v4, 0x12

    .line 296
    .line 297
    or-int/lit16 v10, v10, 0xf0

    .line 298
    .line 299
    int-to-byte v10, v10

    .line 300
    aput-byte v10, v12, v13

    .line 301
    .line 302
    add-int/lit8 v10, v13, 0x2

    .line 303
    .line 304
    ushr-int/lit8 v11, v4, 0xc

    .line 305
    .line 306
    and-int/lit8 v11, v11, 0x3f

    .line 307
    .line 308
    or-int/2addr v11, v6

    .line 309
    int-to-byte v11, v11

    .line 310
    aput-byte v11, v12, v8

    .line 311
    .line 312
    add-int/lit8 v8, v13, 0x3

    .line 313
    .line 314
    ushr-int/lit8 v11, v4, 0x6

    .line 315
    .line 316
    and-int/lit8 v11, v11, 0x3f

    .line 317
    .line 318
    or-int/2addr v11, v6

    .line 319
    int-to-byte v11, v11

    .line 320
    aput-byte v11, v12, v10

    .line 321
    .line 322
    add-int/lit8 v13, v13, 0x4

    .line 323
    .line 324
    and-int/lit8 v4, v4, 0x3f

    .line 325
    .line 326
    or-int/2addr v4, v6

    .line 327
    int-to-byte v4, v4

    .line 328
    aput-byte v4, v12, v8

    .line 329
    .line 330
    move v4, v9

    .line 331
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 332
    .line 333
    const v9, 0xd800

    .line 334
    .line 335
    .line 336
    const/16 v10, 0x800

    .line 337
    .line 338
    goto/16 :goto_5

    .line 339
    .line 340
    :cond_d
    move v4, v9

    .line 341
    :cond_e
    new-instance v0, Lo01;

    .line 342
    .line 343
    add-int/lit8 v4, v4, -0x1

    .line 344
    .line 345
    invoke-direct {v0, v4, v15}, Lo01;-><init>(II)V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :cond_f
    const v0, 0xd800

    .line 350
    .line 351
    .line 352
    if-gt v0, v8, :cond_11

    .line 353
    .line 354
    const v10, 0xdfff

    .line 355
    .line 356
    .line 357
    if-gt v8, v10, :cond_11

    .line 358
    .line 359
    add-int/lit8 v0, v4, 0x1

    .line 360
    .line 361
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-eq v0, v2, :cond_10

    .line 366
    .line 367
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    invoke-static {v8, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-nez v0, :cond_11

    .line 376
    .line 377
    :cond_10
    new-instance v0, Lo01;

    .line 378
    .line 379
    invoke-direct {v0, v4, v15}, Lo01;-><init>(II)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_11
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 384
    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v0

    .line 407
    :cond_12
    :goto_7
    sub-int/2addr v13, v2

    .line 408
    invoke-virtual {v3, v13}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 409
    .line 410
    .line 411
    goto/16 :goto_e

    .line 412
    .line 413
    :cond_13
    move/from16 v16, v11

    .line 414
    .line 415
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    :goto_8
    if-ge v4, v2, :cond_14

    .line 424
    .line 425
    :try_start_0
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 426
    .line 427
    .line 428
    move-result v9

    .line 429
    if-ge v9, v6, :cond_14

    .line 430
    .line 431
    add-int v10, v8, v4

    .line 432
    .line 433
    int-to-byte v9, v9

    .line 434
    invoke-virtual {v3, v10, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 435
    .line 436
    .line 437
    add-int/lit8 v4, v4, 0x1

    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_14
    if-ne v4, v2, :cond_15

    .line 441
    .line 442
    add-int v2, v8, v4

    .line 443
    .line 444
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 445
    .line 446
    .line 447
    goto/16 :goto_e

    .line 448
    .line 449
    :cond_15
    add-int/2addr v8, v4

    .line 450
    :goto_9
    if-ge v4, v2, :cond_1c

    .line 451
    .line 452
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 453
    .line 454
    .line 455
    move-result v9

    .line 456
    if-ge v9, v6, :cond_16

    .line 457
    .line 458
    int-to-byte v9, v9

    .line 459
    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_5

    .line 460
    .line 461
    .line 462
    const/16 v10, 0x800

    .line 463
    .line 464
    :goto_a
    const v11, 0xd800

    .line 465
    .line 466
    .line 467
    const v12, 0xdfff

    .line 468
    .line 469
    .line 470
    goto/16 :goto_d

    .line 471
    .line 472
    :cond_16
    const/16 v10, 0x800

    .line 473
    .line 474
    if-ge v9, v10, :cond_17

    .line 475
    .line 476
    add-int/lit8 v11, v8, 0x1

    .line 477
    .line 478
    ushr-int/lit8 v12, v9, 0x6

    .line 479
    .line 480
    or-int/lit16 v12, v12, 0xc0

    .line 481
    .line 482
    int-to-byte v12, v12

    .line 483
    :try_start_1
    invoke-virtual {v3, v8, v12}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 484
    .line 485
    .line 486
    and-int/lit8 v8, v9, 0x3f

    .line 487
    .line 488
    or-int/2addr v8, v6

    .line 489
    int-to-byte v8, v8

    .line 490
    invoke-virtual {v3, v11, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 491
    .line 492
    .line 493
    move v8, v11

    .line 494
    goto :goto_a

    .line 495
    :catch_0
    move v8, v11

    .line 496
    goto/16 :goto_f

    .line 497
    .line 498
    :cond_17
    const v11, 0xd800

    .line 499
    .line 500
    .line 501
    const v12, 0xdfff

    .line 502
    .line 503
    .line 504
    if-lt v9, v11, :cond_1b

    .line 505
    .line 506
    if-ge v12, v9, :cond_18

    .line 507
    .line 508
    goto :goto_c

    .line 509
    :cond_18
    add-int/lit8 v13, v4, 0x1

    .line 510
    .line 511
    if-eq v13, v2, :cond_1a

    .line 512
    .line 513
    :try_start_2
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    invoke-static {v9, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 518
    .line 519
    .line 520
    move-result v14

    .line 521
    if-eqz v14, :cond_19

    .line 522
    .line 523
    invoke-static {v9, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 524
    .line 525
    .line 526
    move-result v4
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 527
    add-int/lit8 v9, v8, 0x1

    .line 528
    .line 529
    ushr-int/lit8 v14, v4, 0x12

    .line 530
    .line 531
    or-int/lit16 v14, v14, 0xf0

    .line 532
    .line 533
    int-to-byte v14, v14

    .line 534
    :try_start_3
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 535
    .line 536
    .line 537
    add-int/lit8 v14, v8, 0x2

    .line 538
    .line 539
    ushr-int/lit8 v15, v4, 0xc

    .line 540
    .line 541
    and-int/lit8 v15, v15, 0x3f

    .line 542
    .line 543
    or-int/2addr v15, v6

    .line 544
    int-to-byte v15, v15

    .line 545
    :try_start_4
    invoke-virtual {v3, v9, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    .line 546
    .line 547
    .line 548
    add-int/lit8 v8, v8, 0x3

    .line 549
    .line 550
    ushr-int/lit8 v9, v4, 0x6

    .line 551
    .line 552
    and-int/lit8 v9, v9, 0x3f

    .line 553
    .line 554
    or-int/2addr v9, v6

    .line 555
    int-to-byte v9, v9

    .line 556
    :try_start_5
    invoke-virtual {v3, v14, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 557
    .line 558
    .line 559
    and-int/lit8 v4, v4, 0x3f

    .line 560
    .line 561
    or-int/2addr v4, v6

    .line 562
    int-to-byte v4, v4

    .line 563
    invoke-virtual {v3, v8, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 564
    .line 565
    .line 566
    move v4, v13

    .line 567
    goto :goto_d

    .line 568
    :catch_1
    :goto_b
    move v4, v13

    .line 569
    goto :goto_f

    .line 570
    :catch_2
    move v4, v13

    .line 571
    move v8, v14

    .line 572
    goto :goto_f

    .line 573
    :catch_3
    move v8, v9

    .line 574
    goto :goto_b

    .line 575
    :cond_19
    move v4, v13

    .line 576
    :cond_1a
    :try_start_6
    new-instance v0, Lo01;

    .line 577
    .line 578
    invoke-direct {v0, v4, v2}, Lo01;-><init>(II)V

    .line 579
    .line 580
    .line 581
    throw v0
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    .line 582
    :cond_1b
    :goto_c
    add-int/lit8 v13, v8, 0x1

    .line 583
    .line 584
    ushr-int/lit8 v14, v9, 0xc

    .line 585
    .line 586
    or-int/lit16 v14, v14, 0xe0

    .line 587
    .line 588
    int-to-byte v14, v14

    .line 589
    :try_start_7
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_4

    .line 590
    .line 591
    .line 592
    add-int/lit8 v8, v8, 0x2

    .line 593
    .line 594
    ushr-int/lit8 v14, v9, 0x6

    .line 595
    .line 596
    and-int/lit8 v14, v14, 0x3f

    .line 597
    .line 598
    or-int/2addr v14, v6

    .line 599
    int-to-byte v14, v14

    .line 600
    :try_start_8
    invoke-virtual {v3, v13, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 601
    .line 602
    .line 603
    and-int/lit8 v9, v9, 0x3f

    .line 604
    .line 605
    or-int/2addr v9, v6

    .line 606
    int-to-byte v9, v9

    .line 607
    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 608
    .line 609
    .line 610
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 611
    .line 612
    add-int/lit8 v8, v8, 0x1

    .line 613
    .line 614
    goto/16 :goto_9

    .line 615
    .line 616
    :catch_4
    move v8, v13

    .line 617
    goto :goto_f

    .line 618
    :cond_1c
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    .line 619
    .line 620
    .line 621
    :goto_e
    invoke-virtual {v0}, Lmj0;->h()I

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    return v0

    .line 626
    :catch_5
    :goto_f
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    sub-int/2addr v8, v2

    .line 635
    add-int/lit8 v8, v8, 0x1

    .line 636
    .line 637
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    add-int/2addr v2, v0

    .line 642
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 643
    .line 644
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    new-instance v3, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    throw v0

    .line 670
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 671
    .line 672
    int-to-long v1, v7

    .line 673
    const-wide v3, 0x100000000L

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    add-long/2addr v1, v3

    .line 679
    new-instance v3, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    const-string v4, "UTF-8 length does not fit in int: "

    .line 682
    .line 683
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    throw v0
.end method

.method public final f([I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmj0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    array-length v1, p1

    .line 7
    invoke-virtual {p0, v0, v1, v0}, Lmj0;->n(III)V

    .line 8
    .line 9
    .line 10
    array-length v0, p1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v0, :cond_0

    .line 14
    .line 15
    aget v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lmj0;->b(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lmj0;->h()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    const-string p0, "FlatBuffers: object serialization must not be nested."

    .line 29
    .line 30
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final g()I
    .locals 11

    .line 1
    iget-object v0, p0, Lmj0;->d:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    iget-boolean v0, p0, Lmj0;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-virtual {p0, v0, v1}, Lmj0;->k(II)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    iget v3, p0, Lmj0;->b:I

    .line 17
    .line 18
    sub-int/2addr v3, v0

    .line 19
    iput v3, p0, Lmj0;->b:I

    .line 20
    .line 21
    invoke-virtual {v2, v3, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lmj0;->j()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lmj0;->e:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    :goto_0
    if-ltz v2, :cond_0

    .line 33
    .line 34
    iget-object v3, p0, Lmj0;->d:[I

    .line 35
    .line 36
    aget v3, v3, v2

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    add-int/lit8 v2, v2, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v2

    .line 44
    :goto_1
    if-ltz v3, :cond_2

    .line 45
    .line 46
    iget-object v4, p0, Lmj0;->d:[I

    .line 47
    .line 48
    aget v4, v4, v3

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    sub-int v4, v0, v4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move v4, v1

    .line 56
    :goto_2
    int-to-short v4, v4

    .line 57
    invoke-virtual {p0, v4}, Lmj0;->d(S)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget v3, p0, Lmj0;->h:I

    .line 64
    .line 65
    sub-int v3, v0, v3

    .line 66
    .line 67
    int-to-short v3, v3

    .line 68
    invoke-virtual {p0, v3}, Lmj0;->d(S)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x3

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    mul-int/2addr v2, v3

    .line 75
    int-to-short v2, v2

    .line 76
    invoke-virtual {p0, v2}, Lmj0;->d(S)V

    .line 77
    .line 78
    .line 79
    move v2, v1

    .line 80
    :goto_3
    iget v4, p0, Lmj0;->j:I

    .line 81
    .line 82
    if-ge v2, v4, :cond_6

    .line 83
    .line 84
    iget-object v4, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    iget-object v5, p0, Lmj0;->i:[I

    .line 91
    .line 92
    aget v5, v5, v2

    .line 93
    .line 94
    sub-int/2addr v4, v5

    .line 95
    iget v5, p0, Lmj0;->b:I

    .line 96
    .line 97
    iget-object v6, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-object v7, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-ne v6, v7, :cond_5

    .line 110
    .line 111
    move v7, v3

    .line 112
    :goto_4
    if-ge v7, v6, :cond_4

    .line 113
    .line 114
    iget-object v8, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    add-int v9, v4, v7

    .line 117
    .line 118
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    iget-object v9, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    add-int v10, v5, v7

    .line 125
    .line 126
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eq v8, v9, :cond_3

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_3
    add-int/lit8 v7, v7, 0x2

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    iget-object v4, p0, Lmj0;->i:[I

    .line 137
    .line 138
    aget v2, v4, v2

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move v2, v1

    .line 145
    :goto_6
    if-eqz v2, :cond_7

    .line 146
    .line 147
    iget-object v3, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    sub-int/2addr v3, v0

    .line 154
    iput v3, p0, Lmj0;->b:I

    .line 155
    .line 156
    iget-object v4, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    sub-int/2addr v2, v0

    .line 159
    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_7
    iget v2, p0, Lmj0;->j:I

    .line 164
    .line 165
    iget-object v4, p0, Lmj0;->i:[I

    .line 166
    .line 167
    array-length v5, v4

    .line 168
    if-ne v2, v5, :cond_8

    .line 169
    .line 170
    mul-int/2addr v2, v3

    .line 171
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iput-object v2, p0, Lmj0;->i:[I

    .line 176
    .line 177
    :cond_8
    iget-object v2, p0, Lmj0;->i:[I

    .line 178
    .line 179
    iget v3, p0, Lmj0;->j:I

    .line 180
    .line 181
    add-int/lit8 v4, v3, 0x1

    .line 182
    .line 183
    iput v4, p0, Lmj0;->j:I

    .line 184
    .line 185
    invoke-virtual {p0}, Lmj0;->j()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    aput v4, v2, v3

    .line 190
    .line 191
    iget-object v2, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    sub-int/2addr v3, v0

    .line 198
    invoke-virtual {p0}, Lmj0;->j()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    sub-int/2addr v4, v0

    .line 203
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 204
    .line 205
    .line 206
    :goto_7
    iput-boolean v1, p0, Lmj0;->f:Z

    .line 207
    .line 208
    return v0

    .line 209
    :cond_9
    const-string p0, "FlatBuffers: endTable called without startTable"

    .line 210
    .line 211
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    return v1
.end method

.method public final h()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lmj0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lmj0;->f:Z

    .line 7
    .line 8
    iget v0, p0, Lmj0;->k:I

    .line 9
    .line 10
    iget-object v1, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v2, p0, Lmj0;->b:I

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x4

    .line 15
    .line 16
    iput v2, p0, Lmj0;->b:I

    .line 17
    .line 18
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lmj0;->j()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const-string p0, "FlatBuffers: endVector called without startVector"

    .line 27
    .line 28
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final i(I)V
    .locals 2

    .line 1
    iget v0, p0, Lmj0;->c:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v0, v1}, Lmj0;->k(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lmj0;->b(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v0, p0, Lmj0;->b:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lmj0;->g:Z

    .line 19
    .line 20
    return-void
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lmj0;->b:I

    .line 8
    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final k(II)V
    .locals 7

    .line 1
    iget v0, p0, Lmj0;->c:I

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lmj0;->c:I

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lmj0;->b:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    add-int/2addr v0, p2

    .line 17
    not-int v0, v0

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    add-int/lit8 v1, p1, -0x1

    .line 21
    .line 22
    and-int/2addr v0, v1

    .line 23
    :goto_0
    iget v1, p0, Lmj0;->b:I

    .line 24
    .line 25
    add-int v2, v0, p1

    .line 26
    .line 27
    add-int/2addr v2, p2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-ge v1, v2, :cond_4

    .line 30
    .line 31
    iget-object v1, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    const/16 v5, 0x400

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const v5, 0x7ffffff7

    .line 49
    .line 50
    .line 51
    if-eq v4, v5, :cond_3

    .line 52
    .line 53
    const/high16 v6, -0x40000000    # -2.0f

    .line 54
    .line 55
    and-int/2addr v6, v4

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    shl-int/lit8 v5, v4, 0x1

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lmj0;->l:Lsn;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 74
    .line 75
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    sub-int/2addr v5, v4

    .line 88
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iget v2, p0, Lmj0;->b:I

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    sub-int/2addr v3, v1

    .line 103
    add-int/2addr v3, v2

    .line 104
    iput v3, p0, Lmj0;->b:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    const-string p0, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    .line 108
    .line 109
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    move p1, v3

    .line 114
    :goto_2
    if-ge p1, v0, :cond_5

    .line 115
    .line 116
    iget-object p2, p0, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    iget v1, p0, Lmj0;->b:I

    .line 119
    .line 120
    add-int/lit8 v1, v1, -0x1

    .line 121
    .line 122
    iput v1, p0, Lmj0;->b:I

    .line 123
    .line 124
    invoke-virtual {p2, v1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    add-int/lit8 p1, p1, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    return-void
.end method

.method public final l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmj0;->d:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lmj0;->j()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aput p0, v0, p1

    .line 8
    .line 9
    return-void
.end method

.method public final m(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmj0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lmj0;->d:[I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-ge v0, p1, :cond_1

    .line 11
    .line 12
    :cond_0
    new-array v0, p1, [I

    .line 13
    .line 14
    iput-object v0, p0, Lmj0;->d:[I

    .line 15
    .line 16
    :cond_1
    iput p1, p0, Lmj0;->e:I

    .line 17
    .line 18
    iget-object v0, p0, Lmj0;->d:[I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lmj0;->f:Z

    .line 26
    .line 27
    invoke-virtual {p0}, Lmj0;->j()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lmj0;->h:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const-string p0, "FlatBuffers: object serialization must not be nested."

    .line 35
    .line 36
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final n(III)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lmj0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p2, p0, Lmj0;->k:I

    .line 6
    .line 7
    mul-int/2addr p1, p2

    .line 8
    const/4 p2, 0x4

    .line 9
    invoke-virtual {p0, p2, p1}, Lmj0;->k(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3, p1}, Lmj0;->k(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lmj0;->f:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FlatBuffers: object serialization must not be nested."

    .line 20
    .line 21
    invoke-static {p0}, Ls;->i(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
