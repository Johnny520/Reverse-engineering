.class public final Lyyds/ᛴᛶᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:[B

.field public ᛱᲈᲁ:Z

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

.field public ᛳᲁᲁᲇ:Lyyds/ᛵᛵᲀᛲ;

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:Z

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Ljava/io/BufferedOutputStream;)V
    .locals 2

    .line 1
    const-wide v0, -0x61da4e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲈᛵᛷ:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ:Z

    .line 19
    .line 20
    const/16 v0, 0xa

    .line 21
    .line 22
    iput v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛳᛶᲁ:I

    .line 23
    .line 24
    iput p1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᲈᲈᲁ:I

    .line 25
    .line 26
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᛴᛶᲈᲈ;Ljava/util/ArrayList;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, -0x61da8e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v2, 0x7fffffff

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-lt v1, v3, :cond_1

    .line 35
    .line 36
    move v3, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    div-int/2addr v3, v1

    .line 43
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    add-int/lit8 v5, v5, -0x1

    .line 53
    .line 54
    const/16 v6, 0x2e

    .line 55
    .line 56
    if-lez v3, :cond_f

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-static {v7, v5, v3}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const/16 v8, 0xff

    .line 64
    .line 65
    if-ltz v5, :cond_6

    .line 66
    .line 67
    move-object/from16 v9, p1

    .line 68
    .line 69
    move v10, v7

    .line 70
    :goto_1
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    move-object v12, v11

    .line 75
    check-cast v12, Landroid/graphics/Bitmap;

    .line 76
    .line 77
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v19

    .line 85
    mul-int v11, v15, v19

    .line 86
    .line 87
    new-array v13, v11, [I

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    move/from16 v18, v15

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v19}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 97
    .line 98
    .line 99
    div-int/lit16 v12, v11, 0x2710

    .line 100
    .line 101
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    add-int/lit8 v11, v11, -0x1

    .line 106
    .line 107
    if-lez v12, :cond_5

    .line 108
    .line 109
    invoke-static {v7, v11, v12}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-ltz v11, :cond_4

    .line 114
    .line 115
    move v14, v7

    .line 116
    :goto_2
    aget v15, v13, v14

    .line 117
    .line 118
    shr-int/lit8 v2, v15, 0x18

    .line 119
    .line 120
    and-int/2addr v2, v8

    .line 121
    iget-boolean v7, v0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 122
    .line 123
    if-eqz v7, :cond_2

    .line 124
    .line 125
    const/16 v7, 0x80

    .line 126
    .line 127
    if-lt v2, v7, :cond_3

    .line 128
    .line 129
    :cond_2
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_3
    if-eq v14, v11, :cond_4

    .line 137
    .line 138
    add-int/2addr v14, v12

    .line 139
    const v2, 0x7fffffff

    .line 140
    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    if-eq v10, v5, :cond_6

    .line 145
    .line 146
    add-int/2addr v10, v3

    .line 147
    const v2, 0x7fffffff

    .line 148
    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    goto :goto_1

    .line 152
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-wide v1, -0x61dcce68a836eL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v12, v6}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/16 v3, 0x300

    .line 179
    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    new-array v1, v3, [B

    .line 183
    .line 184
    iput-object v1, v0, Lyyds/ᛴᛶᲈᲈ;->ᛱᛳᲇ:[B

    .line 185
    .line 186
    const/4 v1, 0x0

    .line 187
    iput-object v1, v0, Lyyds/ᛴᛶᲈᲈ;->ᛳᲁᲁᲇ:Lyyds/ᛵᛵᲀᛲ;

    .line 188
    .line 189
    iput-boolean v4, v0, Lyyds/ᛴᛶᲈᲈ;->ᲇᛱᛲ:Z

    .line 190
    .line 191
    return-void

    .line 192
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const/4 v5, 0x3

    .line 197
    mul-int/2addr v2, v5

    .line 198
    new-array v2, v2, [B

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    const/4 v7, 0x0

    .line 205
    :goto_3
    if-ge v7, v6, :cond_8

    .line 206
    .line 207
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    check-cast v9, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    mul-int/lit8 v10, v7, 0x3

    .line 218
    .line 219
    and-int/lit16 v11, v9, 0xff

    .line 220
    .line 221
    int-to-byte v11, v11

    .line 222
    aput-byte v11, v2, v10

    .line 223
    .line 224
    add-int/lit8 v11, v10, 0x1

    .line 225
    .line 226
    shr-int/lit8 v12, v9, 0x8

    .line 227
    .line 228
    and-int/2addr v12, v8

    .line 229
    int-to-byte v12, v12

    .line 230
    aput-byte v12, v2, v11

    .line 231
    .line 232
    add-int/lit8 v10, v10, 0x2

    .line 233
    .line 234
    shr-int/lit8 v9, v9, 0x10

    .line 235
    .line 236
    and-int/2addr v9, v8

    .line 237
    int-to-byte v9, v9

    .line 238
    aput-byte v9, v2, v10

    .line 239
    .line 240
    add-int/lit8 v7, v7, 0x1

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_8
    new-instance v6, Lyyds/ᛵᛵᲀᛲ;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    mul-int/2addr v1, v5

    .line 250
    iget v7, v0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛳᛶᲁ:I

    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    invoke-direct {v6, v1, v7, v9, v2}, Lyyds/ᛵᛵᲀᛲ;-><init>(III[B)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6}, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ()[B

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-static {v9, v3}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-static {v2, v5}, Lyyds/ᛳᛵᲀ;->ᛷᛲᲈᛱ(Lyyds/ᲈᲈᲀᲈ;I)Lyyds/ᲇᲁᲁᲁ;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    iget v3, v2, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 269
    .line 270
    iget v7, v2, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 271
    .line 272
    iget v2, v2, Lyyds/ᲇᲁᲁᲁ;->ᛲᛴᛳᛲ:I

    .line 273
    .line 274
    if-lez v2, :cond_9

    .line 275
    .line 276
    if-le v3, v7, :cond_a

    .line 277
    .line 278
    :cond_9
    if-gez v2, :cond_b

    .line 279
    .line 280
    if-gt v7, v3, :cond_b

    .line 281
    .line 282
    :cond_a
    :goto_4
    aget-byte v9, v1, v3

    .line 283
    .line 284
    add-int/lit8 v10, v3, 0x2

    .line 285
    .line 286
    aget-byte v11, v1, v10

    .line 287
    .line 288
    aput-byte v11, v1, v3

    .line 289
    .line 290
    aput-byte v9, v1, v10

    .line 291
    .line 292
    if-eq v3, v7, :cond_b

    .line 293
    .line 294
    add-int/2addr v3, v2

    .line 295
    goto :goto_4

    .line 296
    :cond_b
    iget-boolean v2, v0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 297
    .line 298
    if-eqz v2, :cond_e

    .line 299
    .line 300
    iput v8, v0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 301
    .line 302
    const/16 v2, 0x2fd

    .line 303
    .line 304
    aget-byte v2, v1, v2

    .line 305
    .line 306
    and-int/2addr v2, v8

    .line 307
    const/16 v3, 0x2fe

    .line 308
    .line 309
    aget-byte v3, v1, v3

    .line 310
    .line 311
    and-int/2addr v3, v8

    .line 312
    const/16 v7, 0x2ff

    .line 313
    .line 314
    aget-byte v7, v1, v7

    .line 315
    .line 316
    and-int/2addr v7, v8

    .line 317
    const v9, 0x7fffffff

    .line 318
    .line 319
    .line 320
    const/4 v10, 0x0

    .line 321
    const/4 v11, 0x0

    .line 322
    :goto_5
    const/16 v12, 0x100

    .line 323
    .line 324
    if-ge v10, v12, :cond_d

    .line 325
    .line 326
    if-eq v10, v8, :cond_c

    .line 327
    .line 328
    mul-int/lit8 v12, v10, 0x3

    .line 329
    .line 330
    aget-byte v13, v1, v12

    .line 331
    .line 332
    and-int/2addr v13, v8

    .line 333
    sub-int/2addr v13, v2

    .line 334
    add-int/lit8 v14, v12, 0x1

    .line 335
    .line 336
    aget-byte v14, v1, v14

    .line 337
    .line 338
    and-int/2addr v14, v8

    .line 339
    sub-int/2addr v14, v3

    .line 340
    add-int/lit8 v12, v12, 0x2

    .line 341
    .line 342
    aget-byte v12, v1, v12

    .line 343
    .line 344
    and-int/2addr v12, v8

    .line 345
    sub-int/2addr v12, v7

    .line 346
    mul-int/2addr v13, v13

    .line 347
    mul-int/2addr v14, v14

    .line 348
    add-int/2addr v14, v13

    .line 349
    mul-int/2addr v12, v12

    .line 350
    add-int/2addr v12, v14

    .line 351
    if-ge v12, v9, :cond_c

    .line 352
    .line 353
    move v11, v10

    .line 354
    move v9, v12

    .line 355
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_d
    iput v11, v0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 359
    .line 360
    iget v2, v0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 361
    .line 362
    mul-int/2addr v2, v5

    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    aput-byte v17, v1, v2

    .line 366
    .line 367
    add-int/lit8 v3, v2, 0x1

    .line 368
    .line 369
    aput-byte v17, v1, v3

    .line 370
    .line 371
    add-int/lit8 v2, v2, 0x2

    .line 372
    .line 373
    aput-byte v17, v1, v2

    .line 374
    .line 375
    :cond_e
    iput-object v1, v0, Lyyds/ᛴᛶᲈᲈ;->ᛱᛳᲇ:[B

    .line 376
    .line 377
    iput-object v6, v0, Lyyds/ᛴᛶᲈᲈ;->ᛳᲁᲁᲇ:Lyyds/ᛵᛵᲀᛲ;

    .line 378
    .line 379
    iput-boolean v4, v0, Lyyds/ᛴᛶᲈᲈ;->ᲇᛱᛲ:Z

    .line 380
    .line 381
    return-void

    .line 382
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-wide v1, -0x61dafe68a836eL

    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v0, v3, v6}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()V
    .locals 5

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0xf9

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᲈᲈᲁ:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x2

    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move v0, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, v2

    .line 31
    :goto_0
    iget-boolean v4, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 32
    .line 33
    shl-int/2addr v0, v3

    .line 34
    or-int/2addr v0, v4

    .line 35
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛴᛳᛲ:I

    .line 39
    .line 40
    div-int/lit8 v0, v0, 0xa

    .line 41
    .line 42
    if-ge v0, v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v3, v0

    .line 46
    :goto_1
    invoke-virtual {p0, v3}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget p0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move p0, v2

    .line 57
    :goto_2
    invoke-virtual {v1, p0}, Ljava/io/OutputStream;->write(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/graphics/Bitmap;)V
    .locals 10

    .line 1
    const-wide v0, -0x61dfee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛱᲈᲁ:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    iput-boolean v1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛱᲈᲁ:Z

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    mul-int v0, v5, v9

    .line 43
    .line 44
    new-array v3, v0, [I

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    move v8, v5

    .line 50
    move-object v2, p1

    .line 51
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v3}, Lyyds/ᛴᛶᲈᲈ;->ᲀᛲᛳᲀ([I)[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    iget-object v2, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    :try_start_1
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛵᛸᛸᛷ:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 68
    .line 69
    .line 70
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 73
    .line 74
    .line 75
    const/16 v0, 0xf7

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛱᛳᲇ:[B

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    array-length v4, v0

    .line 92
    invoke-virtual {v2, v0, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 93
    .line 94
    .line 95
    array-length v0, v0

    .line 96
    rsub-int v0, v0, 0x300

    .line 97
    .line 98
    move v4, v3

    .line 99
    :goto_0
    if-ge v4, v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    :goto_1
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲈᛵᛷ:I

    .line 108
    .line 109
    if-ltz v0, :cond_4

    .line 110
    .line 111
    const/16 v0, 0x21

    .line 112
    .line 113
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 114
    .line 115
    .line 116
    const/16 v0, 0xff

    .line 117
    .line 118
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 119
    .line 120
    .line 121
    const/16 v0, 0xb

    .line 122
    .line 123
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 124
    .line 125
    .line 126
    const-wide v4, -0x61e05e68a836eL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget-object v4, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 136
    .line 137
    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-wide v4, -0x61e11e68a836eL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 150
    .line 151
    .line 152
    const/4 v0, 0x3

    .line 153
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 157
    .line 158
    .line 159
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲈᛵᛷ:I

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 165
    .line 166
    .line 167
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛴᛶᲈᲈ;->ᛲᛴᛳᛲ()V

    .line 168
    .line 169
    .line 170
    const/16 v0, 0x2c

    .line 171
    .line 172
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v3}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v3}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 179
    .line 180
    .line 181
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛵᛸᛸᛷ:I

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 184
    .line 185
    .line 186
    iget v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ([B)V

    .line 195
    .line 196
    .line 197
    iput-boolean v3, p0, Lyyds/ᛴᛶᲈᲈ;->ᛶᛷᛲᲁ:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 198
    .line 199
    :catch_0
    :goto_2
    return-void
.end method

.method public final ᛶᛷᛲᲁ(I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    shr-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ᲀᛲᛳᲀ([I)[B
    .locals 11

    .line 1
    array-length v0, p1

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    iget-object v2, p0, Lyyds/ᛴᛶᲈᲈ;->ᛳᲁᲁᲇ:Lyyds/ᛵᛵᲀᛲ;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 10
    .line 11
    if-eqz p1, :cond_9

    .line 12
    .line 13
    :goto_0
    if-ge v3, v0, :cond_9

    .line 14
    .line 15
    iget p1, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 16
    .line 17
    int-to-byte p1, p1

    .line 18
    aput-byte p1, v1, v3

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-boolean v4, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᛱᛲ:Z

    .line 24
    .line 25
    if-nez v4, :cond_6

    .line 26
    .line 27
    new-array v1, v0, [B

    .line 28
    .line 29
    mul-int/lit8 v2, v0, 0x3

    .line 30
    .line 31
    new-array v4, v2, [B

    .line 32
    .line 33
    move v5, v3

    .line 34
    :goto_1
    if-ge v5, v0, :cond_1

    .line 35
    .line 36
    aget v6, p1, v5

    .line 37
    .line 38
    mul-int/lit8 v7, v5, 0x3

    .line 39
    .line 40
    and-int/lit16 v8, v6, 0xff

    .line 41
    .line 42
    int-to-byte v8, v8

    .line 43
    aput-byte v8, v4, v7

    .line 44
    .line 45
    add-int/lit8 v8, v7, 0x1

    .line 46
    .line 47
    shr-int/lit8 v9, v6, 0x8

    .line 48
    .line 49
    and-int/lit16 v9, v9, 0xff

    .line 50
    .line 51
    int-to-byte v9, v9

    .line 52
    aput-byte v9, v4, v8

    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x2

    .line 55
    .line 56
    shr-int/lit8 v6, v6, 0x10

    .line 57
    .line 58
    and-int/lit16 v6, v6, 0xff

    .line 59
    .line 60
    int-to-byte v6, v6

    .line 61
    aput-byte v6, v4, v7

    .line 62
    .line 63
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    new-instance v5, Lyyds/ᛵᛵᲀᛲ;

    .line 67
    .line 68
    iget v6, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛳᛶᲁ:I

    .line 69
    .line 70
    invoke-direct {v5, v2, v6, v3, v4}, Lyyds/ᛵᛵᲀᛲ;-><init>(III[B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ()[B

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/16 v4, 0x300

    .line 78
    .line 79
    invoke-static {v3, v4}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const/4 v6, 0x3

    .line 84
    invoke-static {v4, v6}, Lyyds/ᛳᛵᲀ;->ᛷᛲᲈᛱ(Lyyds/ᲈᲈᲀᲈ;I)Lyyds/ᲇᲁᲁᲁ;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget v6, v4, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 89
    .line 90
    iget v7, v4, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 91
    .line 92
    iget v4, v4, Lyyds/ᲇᲁᲁᲁ;->ᛲᛴᛳᛲ:I

    .line 93
    .line 94
    if-lez v4, :cond_2

    .line 95
    .line 96
    if-le v6, v7, :cond_3

    .line 97
    .line 98
    :cond_2
    if-gez v4, :cond_4

    .line 99
    .line 100
    if-gt v7, v6, :cond_4

    .line 101
    .line 102
    :cond_3
    :goto_2
    aget-byte v8, v2, v6

    .line 103
    .line 104
    add-int/lit8 v9, v6, 0x2

    .line 105
    .line 106
    aget-byte v10, v2, v9

    .line 107
    .line 108
    aput-byte v10, v2, v6

    .line 109
    .line 110
    aput-byte v8, v2, v9

    .line 111
    .line 112
    if-eq v6, v7, :cond_4

    .line 113
    .line 114
    add-int/2addr v6, v4

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    iput-object v2, p0, Lyyds/ᛴᛶᲈᲈ;->ᛱᛳᲇ:[B

    .line 117
    .line 118
    :goto_3
    if-ge v3, v0, :cond_5

    .line 119
    .line 120
    aget p0, p1, v3

    .line 121
    .line 122
    and-int/lit16 v2, p0, 0xff

    .line 123
    .line 124
    shr-int/lit8 v4, p0, 0x8

    .line 125
    .line 126
    and-int/lit16 v4, v4, 0xff

    .line 127
    .line 128
    shr-int/lit8 p0, p0, 0x10

    .line 129
    .line 130
    and-int/lit16 p0, p0, 0xff

    .line 131
    .line 132
    invoke-virtual {v5, v2, v4, p0}, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ(III)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    int-to-byte p0, p0

    .line 137
    aput-byte p0, v1, v3

    .line 138
    .line 139
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    return-object v1

    .line 143
    :cond_6
    :goto_4
    if-ge v3, v0, :cond_9

    .line 144
    .line 145
    aget v4, p1, v3

    .line 146
    .line 147
    shr-int/lit8 v5, v4, 0x18

    .line 148
    .line 149
    and-int/lit16 v5, v5, 0xff

    .line 150
    .line 151
    iget-boolean v6, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 152
    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    const/16 v6, 0x80

    .line 156
    .line 157
    if-ge v5, v6, :cond_7

    .line 158
    .line 159
    iget v4, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 160
    .line 161
    int-to-byte v4, v4

    .line 162
    aput-byte v4, v1, v3

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    and-int/lit16 v5, v4, 0xff

    .line 166
    .line 167
    shr-int/lit8 v6, v4, 0x8

    .line 168
    .line 169
    and-int/lit16 v6, v6, 0xff

    .line 170
    .line 171
    shr-int/lit8 v4, v4, 0x10

    .line 172
    .line 173
    and-int/lit16 v4, v4, 0xff

    .line 174
    .line 175
    invoke-virtual {v2, v5, v6, v4}, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ(III)I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    iget-boolean v5, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 180
    .line 181
    if-eqz v5, :cond_8

    .line 182
    .line 183
    iget v5, p0, Lyyds/ᛴᛶᲈᲈ;->ᛷᛵᲇᲀ:I

    .line 184
    .line 185
    if-ne v4, v5, :cond_8

    .line 186
    .line 187
    iget v4, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 188
    .line 189
    :cond_8
    int-to-byte v4, v4

    .line 190
    aput-byte v4, v1, v3

    .line 191
    .line 192
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_9
    return-object v1
.end method

.method public final ᲇᲇᲇᛱ([B)V
    .locals 16

    .line 1
    new-instance v0, Lyyds/ᛲᛶᛵ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛶᛵ;-><init>(I[B)V

    .line 7
    .line 8
    .line 9
    const-wide v2, -0x61da1e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p0

    .line 18
    .line 19
    iget-object v2, v2, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 20
    .line 21
    iget v3, v0, Lyyds/ᛲᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v3, 0x1

    .line 27
    .line 28
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛷᲈᲈᲁ:I

    .line 29
    .line 30
    iput-boolean v1, v0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 31
    .line 32
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    shl-int v4, v5, v4

    .line 36
    .line 37
    sub-int/2addr v4, v5

    .line 38
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 39
    .line 40
    shl-int v3, v5, v3

    .line 41
    .line 42
    iput v3, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 43
    .line 44
    add-int/lit8 v4, v3, 0x1

    .line 45
    .line 46
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 47
    .line 48
    add-int/lit8 v4, v3, 0x2

    .line 49
    .line 50
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 51
    .line 52
    iput v1, v0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 53
    .line 54
    iget-object v4, v0, Lyyds/ᛲᛶᛵ;->ᛵᛸᛸᛷ:[I

    .line 55
    .line 56
    array-length v6, v4

    .line 57
    if-nez v6, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 60
    .line 61
    .line 62
    iget v3, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 63
    .line 64
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_0
    aget v3, v4, v1

    .line 70
    .line 71
    const/16 v6, 0x138b

    .line 72
    .line 73
    move v8, v1

    .line 74
    move v7, v6

    .line 75
    :goto_0
    const/high16 v9, 0x10000

    .line 76
    .line 77
    if-ge v7, v9, :cond_1

    .line 78
    .line 79
    add-int/lit8 v8, v8, 0x1

    .line 80
    .line 81
    mul-int/lit8 v7, v7, 0x2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    rsub-int/lit8 v7, v8, 0x8

    .line 85
    .line 86
    move v8, v1

    .line 87
    :goto_1
    const/4 v9, -0x1

    .line 88
    iget-object v10, v0, Lyyds/ᛲᛶᛵ;->ᲇᲇᲇᛱ:[I

    .line 89
    .line 90
    if-ge v8, v6, :cond_2

    .line 91
    .line 92
    aput v9, v10, v8

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget v8, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 98
    .line 99
    invoke-virtual {v0, v8, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 100
    .line 101
    .line 102
    array-length v8, v4

    .line 103
    move v11, v5

    .line 104
    :goto_2
    if-ge v11, v8, :cond_b

    .line 105
    .line 106
    aget v12, v4, v11

    .line 107
    .line 108
    shl-int/lit8 v13, v12, 0xc

    .line 109
    .line 110
    add-int/2addr v13, v3

    .line 111
    shl-int/2addr v12, v7

    .line 112
    xor-int/2addr v12, v3

    .line 113
    aget v14, v10, v12

    .line 114
    .line 115
    iget-object v15, v0, Lyyds/ᛲᛶᛵ;->ᛶᛷᛲᲁ:[I

    .line 116
    .line 117
    if-ne v14, v13, :cond_3

    .line 118
    .line 119
    aget v3, v15, v12

    .line 120
    .line 121
    move/from16 p0, v9

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_3
    if-ltz v14, :cond_8

    .line 125
    .line 126
    rsub-int v14, v12, 0x138b

    .line 127
    .line 128
    if-nez v12, :cond_4

    .line 129
    .line 130
    move v14, v5

    .line 131
    :cond_4
    :goto_3
    sub-int/2addr v12, v14

    .line 132
    if-gez v12, :cond_5

    .line 133
    .line 134
    add-int/lit16 v12, v12, 0x138b

    .line 135
    .line 136
    :cond_5
    move/from16 p0, v9

    .line 137
    .line 138
    aget v9, v10, v12

    .line 139
    .line 140
    if-ne v9, v13, :cond_6

    .line 141
    .line 142
    aget v3, v15, v12

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    if-gez v9, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    move/from16 v9, p0

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    move/from16 p0, v9

    .line 152
    .line 153
    :goto_4
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 154
    .line 155
    .line 156
    aget v3, v4, v11

    .line 157
    .line 158
    iget v9, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 159
    .line 160
    const/16 v14, 0x1000

    .line 161
    .line 162
    if-ge v9, v14, :cond_9

    .line 163
    .line 164
    add-int/lit8 v14, v9, 0x1

    .line 165
    .line 166
    iput v14, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 167
    .line 168
    aput v9, v15, v12

    .line 169
    .line 170
    aput v13, v10, v12

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    move v9, v1

    .line 174
    :goto_5
    if-ge v9, v6, :cond_a

    .line 175
    .line 176
    aput p0, v10, v9

    .line 177
    .line 178
    add-int/lit8 v9, v9, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    iget v9, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 182
    .line 183
    add-int/lit8 v12, v9, 0x2

    .line 184
    .line 185
    iput v12, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 186
    .line 187
    iput-boolean v5, v0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 188
    .line 189
    invoke-virtual {v0, v9, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 190
    .line 191
    .line 192
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 193
    .line 194
    move/from16 v9, p0

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_b
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 198
    .line 199
    .line 200
    iget v3, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 201
    .line 202
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 203
    .line 204
    .line 205
    :goto_7
    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 2
    .line 3
    const-wide v1, -0x61de9e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-wide v2, -0x61df0e68a836eL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ:Z

    .line 35
    .line 36
    return-void
.end method
