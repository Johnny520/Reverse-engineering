.class public final Lt3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:I

.field public γ:I

.field public δ:I

.field public ε:Ljava/lang/Integer;

.field public ζ:I

.field public η:I

.field public θ:I

.field public ι:Z

.field public κ:Ljava/io/OutputStream;

.field public λ:Landroid/graphics/Bitmap;

.field public μ:[B

.field public ν:[B

.field public ξ:I

.field public ο:[B

.field public π:[Z

.field public ρ:I

.field public σ:I

.field public τ:Z

.field public υ:Z

.field public φ:I

.field public χ:Z


# virtual methods
.method public final α(Landroid/graphics/Bitmap;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lt3;->ι:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lt3;->υ:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lt3;->γ:I

    .line 13
    .line 14
    iget v2, p0, Lt3;->δ:I

    .line 15
    .line 16
    iput v0, p0, Lt3;->α:I

    .line 17
    .line 18
    iput v2, p0, Lt3;->β:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v0, p0, Lt3;->α:I

    .line 30
    .line 31
    iput v2, p0, Lt3;->β:I

    .line 32
    .line 33
    :goto_0
    iput-object p1, p0, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    invoke-virtual {p0}, Lt3;->δ()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lt3;->β()V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, p0, Lt3;->τ:Z

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget p1, p0, Lt3;->α:I

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lt3;->ι(I)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lt3;->β:I

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lt3;->ι(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 56
    .line 57
    iget v0, p0, Lt3;->ρ:I

    .line 58
    .line 59
    or-int/lit16 v0, v0, 0xf0

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lt3;->η()V

    .line 75
    .line 76
    .line 77
    iget p1, p0, Lt3;->η:I

    .line 78
    .line 79
    if-ltz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lt3;->ζ()V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-virtual {p0}, Lt3;->ε()V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 88
    .line 89
    const/16 v0, 0x2c

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lt3;->ι(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1}, Lt3;->ι(I)V

    .line 98
    .line 99
    .line 100
    iget p1, p0, Lt3;->α:I

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lt3;->ι(I)V

    .line 103
    .line 104
    .line 105
    iget p1, p0, Lt3;->β:I

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lt3;->ι(I)V

    .line 108
    .line 109
    .line 110
    iget-boolean p1, p0, Lt3;->τ:Z

    .line 111
    .line 112
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    iget p1, p0, Lt3;->ρ:I

    .line 121
    .line 122
    or-int/lit16 p1, p1, 0x80

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 125
    .line 126
    .line 127
    :goto_1
    iget-boolean p1, p0, Lt3;->τ:Z

    .line 128
    .line 129
    if-nez p1, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, Lt3;->η()V

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-virtual {p0}, Lt3;->θ()V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x1

    .line 138
    iput-boolean v1, p0, Lt3;->τ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    return p1

    .line 141
    :catch_0
    :goto_2
    return v1
.end method

.method public final β()V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt3;->π:[Z

    .line 4
    .line 5
    iget-object v2, v0, Lt3;->μ:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    div-int/lit8 v4, v3, 0x3

    .line 9
    .line 10
    new-array v5, v4, [B

    .line 11
    .line 12
    iput-object v5, v0, Lt3;->ν:[B

    .line 13
    .line 14
    iget v5, v0, Lt3;->φ:I

    .line 15
    .line 16
    const/16 v6, 0x100

    .line 17
    .line 18
    new-array v7, v6, [I

    .line 19
    .line 20
    new-array v8, v6, [I

    .line 21
    .line 22
    new-array v9, v6, [I

    .line 23
    .line 24
    const/16 v10, 0x20

    .line 25
    .line 26
    new-array v11, v10, [I

    .line 27
    .line 28
    new-array v12, v6, [[I

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    :goto_0
    const/4 v15, 0x4

    .line 32
    const/16 v16, 0x2

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    if-ge v14, v6, :cond_0

    .line 37
    .line 38
    new-array v15, v15, [I

    .line 39
    .line 40
    aput-object v15, v12, v14

    .line 41
    .line 42
    const/16 v18, 0x1

    .line 43
    .line 44
    shl-int/lit8 v13, v14, 0xc

    .line 45
    .line 46
    div-int/2addr v13, v6

    .line 47
    aput v13, v15, v16

    .line 48
    .line 49
    aput v13, v15, v18

    .line 50
    .line 51
    aput v13, v15, v17

    .line 52
    .line 53
    aput v6, v9, v14

    .line 54
    .line 55
    aput v17, v8, v14

    .line 56
    .line 57
    add-int/lit8 v14, v14, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/16 v18, 0x1

    .line 61
    .line 62
    const/16 v13, 0x5e5

    .line 63
    .line 64
    if-ge v3, v13, :cond_1

    .line 65
    .line 66
    move/from16 v5, v18

    .line 67
    .line 68
    :cond_1
    add-int/lit8 v14, v5, -0x1

    .line 69
    .line 70
    const/16 v19, 0x3

    .line 71
    .line 72
    div-int/lit8 v14, v14, 0x3

    .line 73
    .line 74
    add-int/lit8 v14, v14, 0x1e

    .line 75
    .line 76
    mul-int/lit8 v5, v5, 0x3

    .line 77
    .line 78
    div-int v5, v3, v5

    .line 79
    .line 80
    div-int/lit8 v20, v5, 0x64

    .line 81
    .line 82
    move/from16 v21, v15

    .line 83
    .line 84
    move/from16 v15, v17

    .line 85
    .line 86
    :goto_1
    const/16 v13, 0x400

    .line 87
    .line 88
    if-ge v15, v10, :cond_2

    .line 89
    .line 90
    mul-int v10, v15, v15

    .line 91
    .line 92
    rsub-int v10, v10, 0x400

    .line 93
    .line 94
    mul-int/2addr v10, v6

    .line 95
    div-int/2addr v10, v13

    .line 96
    mul-int/2addr v10, v13

    .line 97
    aput v10, v11, v15

    .line 98
    .line 99
    add-int/lit8 v15, v15, 0x1

    .line 100
    .line 101
    const/16 v10, 0x20

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    const/16 v10, 0x5e5

    .line 105
    .line 106
    if-ge v3, v10, :cond_3

    .line 107
    .line 108
    move/from16 v10, v19

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    rem-int/lit16 v15, v3, 0x1f3

    .line 112
    .line 113
    if-eqz v15, :cond_4

    .line 114
    .line 115
    const/16 v10, 0x5d9

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    rem-int/lit16 v15, v3, 0x1eb

    .line 119
    .line 120
    if-eqz v15, :cond_5

    .line 121
    .line 122
    const/16 v10, 0x5c1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    rem-int/lit16 v15, v3, 0x1e7

    .line 126
    .line 127
    if-eqz v15, :cond_6

    .line 128
    .line 129
    const/16 v10, 0x5b5

    .line 130
    .line 131
    :cond_6
    :goto_2
    const/16 v15, 0x800

    .line 132
    .line 133
    move/from16 v25, v13

    .line 134
    .line 135
    move/from16 v13, v17

    .line 136
    .line 137
    move/from16 v24, v13

    .line 138
    .line 139
    const/16 v23, 0x20

    .line 140
    .line 141
    :goto_3
    const/16 v6, 0xff

    .line 142
    .line 143
    if-ge v13, v5, :cond_18

    .line 144
    .line 145
    move-object/from16 v26, v1

    .line 146
    .line 147
    aget-byte v1, v2, v24

    .line 148
    .line 149
    and-int/2addr v1, v6

    .line 150
    shl-int/lit8 v1, v1, 0x4

    .line 151
    .line 152
    add-int/lit8 v27, v24, 0x1

    .line 153
    .line 154
    move/from16 v28, v1

    .line 155
    .line 156
    aget-byte v1, v2, v27

    .line 157
    .line 158
    and-int/2addr v1, v6

    .line 159
    shl-int/lit8 v1, v1, 0x4

    .line 160
    .line 161
    add-int/lit8 v27, v24, 0x2

    .line 162
    .line 163
    move/from16 v29, v1

    .line 164
    .line 165
    aget-byte v1, v2, v27

    .line 166
    .line 167
    and-int/2addr v1, v6

    .line 168
    shl-int/lit8 v1, v1, 0x4

    .line 169
    .line 170
    const v6, 0x7fffffff

    .line 171
    .line 172
    .line 173
    move/from16 v27, v1

    .line 174
    .line 175
    move-object/from16 v30, v2

    .line 176
    .line 177
    move/from16 v33, v5

    .line 178
    .line 179
    move v1, v6

    .line 180
    move/from16 v2, v17

    .line 181
    .line 182
    const/16 v31, -0x1

    .line 183
    .line 184
    const/16 v32, -0x1

    .line 185
    .line 186
    :goto_4
    const/16 v5, 0x100

    .line 187
    .line 188
    if-ge v2, v5, :cond_c

    .line 189
    .line 190
    aget-object v5, v12, v2

    .line 191
    .line 192
    aget v34, v5, v17

    .line 193
    .line 194
    move/from16 v35, v2

    .line 195
    .line 196
    sub-int v2, v34, v28

    .line 197
    .line 198
    if-gez v2, :cond_7

    .line 199
    .line 200
    neg-int v2, v2

    .line 201
    :cond_7
    aget v34, v5, v18

    .line 202
    .line 203
    move/from16 v36, v2

    .line 204
    .line 205
    sub-int v2, v34, v29

    .line 206
    .line 207
    if-gez v2, :cond_8

    .line 208
    .line 209
    neg-int v2, v2

    .line 210
    :cond_8
    add-int v2, v36, v2

    .line 211
    .line 212
    aget v5, v5, v16

    .line 213
    .line 214
    sub-int v5, v5, v27

    .line 215
    .line 216
    if-gez v5, :cond_9

    .line 217
    .line 218
    neg-int v5, v5

    .line 219
    :cond_9
    add-int/2addr v2, v5

    .line 220
    if-ge v2, v6, :cond_a

    .line 221
    .line 222
    move v6, v2

    .line 223
    move/from16 v31, v35

    .line 224
    .line 225
    :cond_a
    aget v5, v8, v35

    .line 226
    .line 227
    shr-int/lit8 v5, v5, 0xc

    .line 228
    .line 229
    sub-int/2addr v2, v5

    .line 230
    if-ge v2, v1, :cond_b

    .line 231
    .line 232
    move v1, v2

    .line 233
    move/from16 v32, v35

    .line 234
    .line 235
    :cond_b
    aget v2, v9, v35

    .line 236
    .line 237
    shr-int/lit8 v5, v2, 0xa

    .line 238
    .line 239
    sub-int/2addr v2, v5

    .line 240
    aput v2, v9, v35

    .line 241
    .line 242
    aget v2, v8, v35

    .line 243
    .line 244
    shl-int/lit8 v5, v5, 0xa

    .line 245
    .line 246
    add-int/2addr v2, v5

    .line 247
    aput v2, v8, v35

    .line 248
    .line 249
    add-int/lit8 v2, v35, 0x1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_c
    aget v1, v9, v31

    .line 253
    .line 254
    add-int/lit8 v1, v1, 0x40

    .line 255
    .line 256
    aput v1, v9, v31

    .line 257
    .line 258
    aget v1, v8, v31

    .line 259
    .line 260
    const/high16 v2, 0x10000

    .line 261
    .line 262
    sub-int/2addr v1, v2

    .line 263
    aput v1, v8, v31

    .line 264
    .line 265
    aget-object v1, v12, v32

    .line 266
    .line 267
    aget v2, v1, v17

    .line 268
    .line 269
    sub-int v5, v2, v28

    .line 270
    .line 271
    mul-int v5, v5, v25

    .line 272
    .line 273
    const/16 v6, 0x400

    .line 274
    .line 275
    div-int/2addr v5, v6

    .line 276
    sub-int/2addr v2, v5

    .line 277
    aput v2, v1, v17

    .line 278
    .line 279
    aget v2, v1, v18

    .line 280
    .line 281
    sub-int v5, v2, v29

    .line 282
    .line 283
    mul-int v5, v5, v25

    .line 284
    .line 285
    div-int/2addr v5, v6

    .line 286
    sub-int/2addr v2, v5

    .line 287
    aput v2, v1, v18

    .line 288
    .line 289
    aget v2, v1, v16

    .line 290
    .line 291
    sub-int v5, v2, v27

    .line 292
    .line 293
    mul-int v5, v5, v25

    .line 294
    .line 295
    div-int/2addr v5, v6

    .line 296
    sub-int/2addr v2, v5

    .line 297
    aput v2, v1, v16

    .line 298
    .line 299
    if-eqz v23, :cond_12

    .line 300
    .line 301
    sub-int v1, v32, v23

    .line 302
    .line 303
    const/4 v2, -0x1

    .line 304
    if-ge v1, v2, :cond_d

    .line 305
    .line 306
    move v1, v2

    .line 307
    :cond_d
    add-int v2, v32, v23

    .line 308
    .line 309
    const/16 v5, 0x100

    .line 310
    .line 311
    if-le v2, v5, :cond_e

    .line 312
    .line 313
    const/16 v2, 0x100

    .line 314
    .line 315
    :cond_e
    add-int/lit8 v5, v32, 0x1

    .line 316
    .line 317
    add-int/lit8 v32, v32, -0x1

    .line 318
    .line 319
    move/from16 v22, v18

    .line 320
    .line 321
    move/from16 v6, v32

    .line 322
    .line 323
    :goto_5
    if-lt v5, v2, :cond_f

    .line 324
    .line 325
    if-le v6, v1, :cond_12

    .line 326
    .line 327
    :cond_f
    add-int/lit8 v31, v22, 0x1

    .line 328
    .line 329
    aget v22, v11, v22

    .line 330
    .line 331
    const/high16 v32, 0x40000

    .line 332
    .line 333
    if-ge v5, v2, :cond_10

    .line 334
    .line 335
    add-int/lit8 v34, v5, 0x1

    .line 336
    .line 337
    aget-object v5, v12, v5

    .line 338
    .line 339
    :try_start_0
    aget v35, v5, v17

    .line 340
    .line 341
    sub-int v36, v35, v28

    .line 342
    .line 343
    mul-int v36, v36, v22

    .line 344
    .line 345
    div-int v36, v36, v32

    .line 346
    .line 347
    sub-int v35, v35, v36

    .line 348
    .line 349
    aput v35, v5, v17

    .line 350
    .line 351
    aget v35, v5, v18

    .line 352
    .line 353
    sub-int v36, v35, v29

    .line 354
    .line 355
    mul-int v36, v36, v22

    .line 356
    .line 357
    div-int v36, v36, v32

    .line 358
    .line 359
    sub-int v35, v35, v36

    .line 360
    .line 361
    aput v35, v5, v18

    .line 362
    .line 363
    aget v35, v5, v16

    .line 364
    .line 365
    sub-int v36, v35, v27

    .line 366
    .line 367
    mul-int v36, v36, v22

    .line 368
    .line 369
    div-int v36, v36, v32

    .line 370
    .line 371
    sub-int v35, v35, v36

    .line 372
    .line 373
    aput v35, v5, v16
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    .line 375
    :catch_0
    move/from16 v5, v34

    .line 376
    .line 377
    :cond_10
    if-le v6, v1, :cond_11

    .line 378
    .line 379
    add-int/lit8 v34, v6, -0x1

    .line 380
    .line 381
    aget-object v6, v12, v6

    .line 382
    .line 383
    :try_start_1
    aget v35, v6, v17

    .line 384
    .line 385
    sub-int v36, v35, v28

    .line 386
    .line 387
    mul-int v36, v36, v22

    .line 388
    .line 389
    div-int v36, v36, v32

    .line 390
    .line 391
    sub-int v35, v35, v36

    .line 392
    .line 393
    aput v35, v6, v17

    .line 394
    .line 395
    aget v35, v6, v18

    .line 396
    .line 397
    sub-int v36, v35, v29

    .line 398
    .line 399
    mul-int v36, v36, v22

    .line 400
    .line 401
    div-int v36, v36, v32

    .line 402
    .line 403
    sub-int v35, v35, v36

    .line 404
    .line 405
    aput v35, v6, v18

    .line 406
    .line 407
    aget v35, v6, v16

    .line 408
    .line 409
    sub-int v36, v35, v27

    .line 410
    .line 411
    mul-int v36, v36, v22

    .line 412
    .line 413
    div-int v36, v36, v32

    .line 414
    .line 415
    sub-int v35, v35, v36

    .line 416
    .line 417
    aput v35, v6, v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 418
    .line 419
    :catch_1
    move/from16 v22, v31

    .line 420
    .line 421
    move/from16 v6, v34

    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_11
    move/from16 v22, v31

    .line 425
    .line 426
    goto :goto_5

    .line 427
    :cond_12
    add-int v1, v24, v10

    .line 428
    .line 429
    if-lt v1, v3, :cond_13

    .line 430
    .line 431
    sub-int/2addr v1, v3

    .line 432
    :cond_13
    move/from16 v24, v1

    .line 433
    .line 434
    add-int/lit8 v13, v13, 0x1

    .line 435
    .line 436
    if-nez v20, :cond_14

    .line 437
    .line 438
    move/from16 v20, v18

    .line 439
    .line 440
    :cond_14
    rem-int v1, v13, v20

    .line 441
    .line 442
    if-nez v1, :cond_17

    .line 443
    .line 444
    div-int v1, v25, v14

    .line 445
    .line 446
    sub-int v25, v25, v1

    .line 447
    .line 448
    div-int/lit8 v1, v15, 0x1e

    .line 449
    .line 450
    sub-int/2addr v15, v1

    .line 451
    shr-int/lit8 v1, v15, 0x6

    .line 452
    .line 453
    move/from16 v2, v18

    .line 454
    .line 455
    if-gt v1, v2, :cond_15

    .line 456
    .line 457
    move/from16 v1, v17

    .line 458
    .line 459
    :cond_15
    move/from16 v2, v17

    .line 460
    .line 461
    :goto_6
    if-ge v2, v1, :cond_16

    .line 462
    .line 463
    mul-int v5, v1, v1

    .line 464
    .line 465
    mul-int v6, v2, v2

    .line 466
    .line 467
    sub-int v6, v5, v6

    .line 468
    .line 469
    move/from16 v22, v1

    .line 470
    .line 471
    const/16 v1, 0x100

    .line 472
    .line 473
    mul-int/2addr v6, v1

    .line 474
    div-int/2addr v6, v5

    .line 475
    mul-int v6, v6, v25

    .line 476
    .line 477
    aput v6, v11, v2

    .line 478
    .line 479
    add-int/lit8 v2, v2, 0x1

    .line 480
    .line 481
    move/from16 v1, v22

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_16
    move/from16 v22, v1

    .line 485
    .line 486
    move/from16 v23, v22

    .line 487
    .line 488
    :cond_17
    move-object/from16 v1, v26

    .line 489
    .line 490
    move-object/from16 v2, v30

    .line 491
    .line 492
    move/from16 v5, v33

    .line 493
    .line 494
    const/16 v18, 0x1

    .line 495
    .line 496
    goto/16 :goto_3

    .line 497
    .line 498
    :cond_18
    move-object/from16 v26, v1

    .line 499
    .line 500
    const/4 v2, -0x1

    .line 501
    move/from16 v3, v17

    .line 502
    .line 503
    :goto_7
    const/16 v1, 0x100

    .line 504
    .line 505
    if-ge v3, v1, :cond_19

    .line 506
    .line 507
    aget-object v1, v12, v3

    .line 508
    .line 509
    aget v5, v1, v17

    .line 510
    .line 511
    shr-int/lit8 v5, v5, 0x4

    .line 512
    .line 513
    aput v5, v1, v17

    .line 514
    .line 515
    const/16 v18, 0x1

    .line 516
    .line 517
    aget v5, v1, v18

    .line 518
    .line 519
    shr-int/lit8 v5, v5, 0x4

    .line 520
    .line 521
    aput v5, v1, v18

    .line 522
    .line 523
    aget v5, v1, v16

    .line 524
    .line 525
    shr-int/lit8 v5, v5, 0x4

    .line 526
    .line 527
    aput v5, v1, v16

    .line 528
    .line 529
    aput v3, v1, v19

    .line 530
    .line 531
    add-int/lit8 v3, v3, 0x1

    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_19
    move v8, v1

    .line 535
    move/from16 v1, v17

    .line 536
    .line 537
    move v3, v1

    .line 538
    move v5, v3

    .line 539
    :goto_8
    const/16 v18, 0x1

    .line 540
    .line 541
    if-ge v1, v8, :cond_1f

    .line 542
    .line 543
    aget-object v9, v12, v1

    .line 544
    .line 545
    aget v10, v9, v18

    .line 546
    .line 547
    add-int/lit8 v11, v1, 0x1

    .line 548
    .line 549
    move v14, v1

    .line 550
    move v13, v11

    .line 551
    :goto_9
    if-ge v13, v8, :cond_1b

    .line 552
    .line 553
    aget-object v8, v12, v13

    .line 554
    .line 555
    aget v8, v8, v18

    .line 556
    .line 557
    if-ge v8, v10, :cond_1a

    .line 558
    .line 559
    move v10, v8

    .line 560
    move v14, v13

    .line 561
    :cond_1a
    add-int/lit8 v13, v13, 0x1

    .line 562
    .line 563
    const/16 v8, 0x100

    .line 564
    .line 565
    const/16 v18, 0x1

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_1b
    aget-object v8, v12, v14

    .line 569
    .line 570
    if-eq v1, v14, :cond_1c

    .line 571
    .line 572
    aget v13, v8, v17

    .line 573
    .line 574
    aget v14, v9, v17

    .line 575
    .line 576
    aput v14, v8, v17

    .line 577
    .line 578
    aput v13, v9, v17

    .line 579
    .line 580
    const/16 v18, 0x1

    .line 581
    .line 582
    aget v13, v8, v18

    .line 583
    .line 584
    aget v14, v9, v18

    .line 585
    .line 586
    aput v14, v8, v18

    .line 587
    .line 588
    aput v13, v9, v18

    .line 589
    .line 590
    aget v13, v8, v16

    .line 591
    .line 592
    aget v14, v9, v16

    .line 593
    .line 594
    aput v14, v8, v16

    .line 595
    .line 596
    aput v13, v9, v16

    .line 597
    .line 598
    aget v13, v8, v19

    .line 599
    .line 600
    aget v14, v9, v19

    .line 601
    .line 602
    aput v14, v8, v19

    .line 603
    .line 604
    aput v13, v9, v19

    .line 605
    .line 606
    :cond_1c
    if-eq v10, v3, :cond_1e

    .line 607
    .line 608
    add-int/2addr v5, v1

    .line 609
    const/16 v18, 0x1

    .line 610
    .line 611
    shr-int/lit8 v5, v5, 0x1

    .line 612
    .line 613
    aput v5, v7, v3

    .line 614
    .line 615
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 616
    .line 617
    if-ge v3, v10, :cond_1d

    .line 618
    .line 619
    aput v1, v7, v3

    .line 620
    .line 621
    goto :goto_a

    .line 622
    :cond_1d
    move v5, v1

    .line 623
    move v3, v10

    .line 624
    :cond_1e
    move v1, v11

    .line 625
    const/16 v8, 0x100

    .line 626
    .line 627
    goto :goto_8

    .line 628
    :cond_1f
    add-int/2addr v5, v6

    .line 629
    const/16 v18, 0x1

    .line 630
    .line 631
    shr-int/lit8 v1, v5, 0x1

    .line 632
    .line 633
    aput v1, v7, v3

    .line 634
    .line 635
    add-int/lit8 v3, v3, 0x1

    .line 636
    .line 637
    const/16 v5, 0x100

    .line 638
    .line 639
    :goto_b
    if-ge v3, v5, :cond_20

    .line 640
    .line 641
    aput v6, v7, v3

    .line 642
    .line 643
    add-int/lit8 v3, v3, 0x1

    .line 644
    .line 645
    goto :goto_b

    .line 646
    :cond_20
    const/16 v1, 0x300

    .line 647
    .line 648
    new-array v1, v1, [B

    .line 649
    .line 650
    new-array v3, v5, [I

    .line 651
    .line 652
    move/from16 v8, v17

    .line 653
    .line 654
    :goto_c
    if-ge v8, v5, :cond_21

    .line 655
    .line 656
    aget-object v9, v12, v8

    .line 657
    .line 658
    aget v9, v9, v19

    .line 659
    .line 660
    aput v8, v3, v9

    .line 661
    .line 662
    add-int/lit8 v8, v8, 0x1

    .line 663
    .line 664
    goto :goto_c

    .line 665
    :cond_21
    move/from16 v8, v17

    .line 666
    .line 667
    move v9, v8

    .line 668
    :goto_d
    if-ge v8, v5, :cond_22

    .line 669
    .line 670
    aget v5, v3, v8

    .line 671
    .line 672
    add-int/lit8 v10, v9, 0x1

    .line 673
    .line 674
    aget-object v5, v12, v5

    .line 675
    .line 676
    aget v11, v5, v17

    .line 677
    .line 678
    int-to-byte v11, v11

    .line 679
    aput-byte v11, v1, v9

    .line 680
    .line 681
    add-int/lit8 v11, v9, 0x2

    .line 682
    .line 683
    const/16 v18, 0x1

    .line 684
    .line 685
    aget v13, v5, v18

    .line 686
    .line 687
    int-to-byte v13, v13

    .line 688
    aput-byte v13, v1, v10

    .line 689
    .line 690
    add-int/lit8 v9, v9, 0x3

    .line 691
    .line 692
    aget v5, v5, v16

    .line 693
    .line 694
    int-to-byte v5, v5

    .line 695
    aput-byte v5, v1, v11

    .line 696
    .line 697
    add-int/lit8 v8, v8, 0x1

    .line 698
    .line 699
    const/16 v5, 0x100

    .line 700
    .line 701
    goto :goto_d

    .line 702
    :cond_22
    iput-object v1, v0, Lt3;->ο:[B

    .line 703
    .line 704
    move/from16 v1, v17

    .line 705
    .line 706
    :goto_e
    iget-object v3, v0, Lt3;->ο:[B

    .line 707
    .line 708
    array-length v5, v3

    .line 709
    if-ge v1, v5, :cond_23

    .line 710
    .line 711
    aget-byte v5, v3, v1

    .line 712
    .line 713
    add-int/lit8 v8, v1, 0x2

    .line 714
    .line 715
    aget-byte v9, v3, v8

    .line 716
    .line 717
    aput-byte v9, v3, v1

    .line 718
    .line 719
    aput-byte v5, v3, v8

    .line 720
    .line 721
    div-int/lit8 v3, v1, 0x3

    .line 722
    .line 723
    aput-boolean v17, v26, v3

    .line 724
    .line 725
    add-int/lit8 v1, v1, 0x3

    .line 726
    .line 727
    goto :goto_e

    .line 728
    :cond_23
    move/from16 v1, v17

    .line 729
    .line 730
    move v3, v1

    .line 731
    :goto_f
    if-ge v1, v4, :cond_31

    .line 732
    .line 733
    iget-object v5, v0, Lt3;->μ:[B

    .line 734
    .line 735
    add-int/lit8 v8, v3, 0x1

    .line 736
    .line 737
    aget-byte v9, v5, v3

    .line 738
    .line 739
    and-int/2addr v9, v6

    .line 740
    add-int/lit8 v10, v3, 0x2

    .line 741
    .line 742
    aget-byte v8, v5, v8

    .line 743
    .line 744
    and-int/2addr v8, v6

    .line 745
    add-int/lit8 v3, v3, 0x3

    .line 746
    .line 747
    aget-byte v5, v5, v10

    .line 748
    .line 749
    and-int/2addr v5, v6

    .line 750
    aget v10, v7, v8

    .line 751
    .line 752
    add-int/lit8 v11, v10, -0x1

    .line 753
    .line 754
    const/16 v13, 0x3e8

    .line 755
    .line 756
    move v15, v2

    .line 757
    move v14, v13

    .line 758
    move v13, v11

    .line 759
    :goto_10
    const/16 v11, 0x100

    .line 760
    .line 761
    :goto_11
    if-lt v10, v11, :cond_24

    .line 762
    .line 763
    if-ltz v13, :cond_25

    .line 764
    .line 765
    :cond_24
    const/16 v18, 0x1

    .line 766
    .line 767
    goto :goto_12

    .line 768
    :cond_25
    const/16 v18, 0x1

    .line 769
    .line 770
    aput-boolean v18, v26, v15

    .line 771
    .line 772
    iget-object v5, v0, Lt3;->ν:[B

    .line 773
    .line 774
    int-to-byte v8, v15

    .line 775
    aput-byte v8, v5, v1

    .line 776
    .line 777
    add-int/lit8 v1, v1, 0x1

    .line 778
    .line 779
    goto :goto_f

    .line 780
    :goto_12
    if-ge v10, v11, :cond_2a

    .line 781
    .line 782
    aget-object v20, v12, v10

    .line 783
    .line 784
    aget v21, v20, v18

    .line 785
    .line 786
    sub-int v2, v21, v8

    .line 787
    .line 788
    if-lt v2, v14, :cond_26

    .line 789
    .line 790
    move v10, v11

    .line 791
    goto :goto_13

    .line 792
    :cond_26
    add-int/lit8 v10, v10, 0x1

    .line 793
    .line 794
    if-gez v2, :cond_27

    .line 795
    .line 796
    neg-int v2, v2

    .line 797
    :cond_27
    aget v21, v20, v17

    .line 798
    .line 799
    sub-int v6, v21, v9

    .line 800
    .line 801
    if-gez v6, :cond_28

    .line 802
    .line 803
    neg-int v6, v6

    .line 804
    :cond_28
    add-int/2addr v2, v6

    .line 805
    if-ge v2, v14, :cond_2a

    .line 806
    .line 807
    aget v6, v20, v16

    .line 808
    .line 809
    sub-int/2addr v6, v5

    .line 810
    if-gez v6, :cond_29

    .line 811
    .line 812
    neg-int v6, v6

    .line 813
    :cond_29
    add-int/2addr v2, v6

    .line 814
    if-ge v2, v14, :cond_2a

    .line 815
    .line 816
    aget v15, v20, v19

    .line 817
    .line 818
    move v14, v2

    .line 819
    :cond_2a
    :goto_13
    if-ltz v13, :cond_30

    .line 820
    .line 821
    aget-object v2, v12, v13

    .line 822
    .line 823
    const/16 v18, 0x1

    .line 824
    .line 825
    aget v6, v2, v18

    .line 826
    .line 827
    sub-int v6, v8, v6

    .line 828
    .line 829
    if-lt v6, v14, :cond_2b

    .line 830
    .line 831
    const/4 v2, -0x1

    .line 832
    const/16 v6, 0xff

    .line 833
    .line 834
    const/4 v13, -0x1

    .line 835
    goto :goto_11

    .line 836
    :cond_2b
    add-int/lit8 v13, v13, -0x1

    .line 837
    .line 838
    if-gez v6, :cond_2c

    .line 839
    .line 840
    neg-int v6, v6

    .line 841
    :cond_2c
    aget v20, v2, v17

    .line 842
    .line 843
    sub-int v11, v20, v9

    .line 844
    .line 845
    if-gez v11, :cond_2d

    .line 846
    .line 847
    neg-int v11, v11

    .line 848
    :cond_2d
    add-int/2addr v6, v11

    .line 849
    if-ge v6, v14, :cond_2f

    .line 850
    .line 851
    aget v11, v2, v16

    .line 852
    .line 853
    sub-int/2addr v11, v5

    .line 854
    if-gez v11, :cond_2e

    .line 855
    .line 856
    neg-int v11, v11

    .line 857
    :cond_2e
    add-int/2addr v6, v11

    .line 858
    if-ge v6, v14, :cond_2f

    .line 859
    .line 860
    aget v15, v2, v19

    .line 861
    .line 862
    move v14, v6

    .line 863
    :cond_2f
    const/4 v2, -0x1

    .line 864
    const/16 v6, 0xff

    .line 865
    .line 866
    goto :goto_10

    .line 867
    :cond_30
    const/16 v18, 0x1

    .line 868
    .line 869
    const/4 v2, -0x1

    .line 870
    const/16 v6, 0xff

    .line 871
    .line 872
    goto :goto_11

    .line 873
    :cond_31
    const/4 v1, 0x0

    .line 874
    iput-object v1, v0, Lt3;->μ:[B

    .line 875
    .line 876
    const/16 v1, 0x8

    .line 877
    .line 878
    iput v1, v0, Lt3;->ξ:I

    .line 879
    .line 880
    const/4 v1, 0x7

    .line 881
    iput v1, v0, Lt3;->ρ:I

    .line 882
    .line 883
    iget-object v1, v0, Lt3;->ε:Ljava/lang/Integer;

    .line 884
    .line 885
    if-eqz v1, :cond_32

    .line 886
    .line 887
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    invoke-virtual {v0, v1}, Lt3;->γ(I)I

    .line 892
    .line 893
    .line 894
    move-result v1

    .line 895
    iput v1, v0, Lt3;->ζ:I

    .line 896
    .line 897
    goto :goto_14

    .line 898
    :cond_32
    iget-boolean v1, v0, Lt3;->χ:Z

    .line 899
    .line 900
    if-eqz v1, :cond_33

    .line 901
    .line 902
    move/from16 v1, v17

    .line 903
    .line 904
    invoke-virtual {v0, v1}, Lt3;->γ(I)I

    .line 905
    .line 906
    .line 907
    move-result v1

    .line 908
    iput v1, v0, Lt3;->ζ:I

    .line 909
    .line 910
    :cond_33
    :goto_14
    return-void
.end method

.method public final γ(I)I
    .locals 10

    .line 1
    iget-object v0, p0, Lt3;->ο:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v2, p0, Lt3;->ο:[B

    .line 20
    .line 21
    array-length v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/high16 v4, 0x1000000

    .line 24
    .line 25
    move v5, v4

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-ge v3, v2, :cond_2

    .line 28
    .line 29
    iget-object v6, p0, Lt3;->ο:[B

    .line 30
    .line 31
    add-int/lit8 v7, v3, 0x1

    .line 32
    .line 33
    aget-byte v8, v6, v3

    .line 34
    .line 35
    and-int/lit16 v8, v8, 0xff

    .line 36
    .line 37
    sub-int v8, v0, v8

    .line 38
    .line 39
    add-int/lit8 v9, v3, 0x2

    .line 40
    .line 41
    aget-byte v7, v6, v7

    .line 42
    .line 43
    and-int/lit16 v7, v7, 0xff

    .line 44
    .line 45
    sub-int v7, v1, v7

    .line 46
    .line 47
    aget-byte v6, v6, v9

    .line 48
    .line 49
    and-int/lit16 v6, v6, 0xff

    .line 50
    .line 51
    sub-int v6, p1, v6

    .line 52
    .line 53
    mul-int/2addr v8, v8

    .line 54
    mul-int/2addr v7, v7

    .line 55
    add-int/2addr v7, v8

    .line 56
    mul-int/2addr v6, v6

    .line 57
    add-int/2addr v6, v7

    .line 58
    div-int/lit8 v9, v9, 0x3

    .line 59
    .line 60
    iget-object v7, p0, Lt3;->π:[Z

    .line 61
    .line 62
    aget-boolean v7, v7, v9

    .line 63
    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    if-ge v6, v5, :cond_1

    .line 67
    .line 68
    move v5, v6

    .line 69
    move v4, v9

    .line 70
    :cond_1
    add-int/lit8 v3, v3, 0x3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return v4
.end method

.method public final δ()V
    .locals 12

    .line 1
    iget-object v0, p0, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    iget-object v0, p0, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget v0, p0, Lt3;->α:I

    .line 14
    .line 15
    if-ne v4, v0, :cond_0

    .line 16
    .line 17
    iget v1, p0, Lt3;->β:I

    .line 18
    .line 19
    if-eq v8, v1, :cond_1

    .line 20
    .line 21
    :cond_0
    iget v1, p0, Lt3;->β:I

    .line 22
    .line 23
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Landroid/graphics/Canvas;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v1, v0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    :cond_1
    mul-int v0, v4, v8

    .line 42
    .line 43
    new-array v2, v0, [I

    .line 44
    .line 45
    iget-object v1, p0, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    move v7, v4

    .line 51
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 52
    .line 53
    .line 54
    mul-int/lit8 v1, v0, 0x3

    .line 55
    .line 56
    new-array v1, v1, [B

    .line 57
    .line 58
    iput-object v1, p0, Lt3;->μ:[B

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, p0, Lt3;->χ:Z

    .line 62
    .line 63
    move v3, v1

    .line 64
    move v4, v3

    .line 65
    move v5, v4

    .line 66
    :goto_0
    const/4 v6, 0x3

    .line 67
    if-ge v3, v0, :cond_3

    .line 68
    .line 69
    aget v7, v2, v3

    .line 70
    .line 71
    if-nez v7, :cond_2

    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    :cond_2
    iget-object v8, p0, Lt3;->μ:[B

    .line 76
    .line 77
    add-int/lit8 v9, v5, 0x1

    .line 78
    .line 79
    and-int/lit16 v10, v7, 0xff

    .line 80
    .line 81
    int-to-byte v10, v10

    .line 82
    aput-byte v10, v8, v5

    .line 83
    .line 84
    add-int/lit8 v10, v5, 0x2

    .line 85
    .line 86
    shr-int/lit8 v11, v7, 0x8

    .line 87
    .line 88
    and-int/lit16 v11, v11, 0xff

    .line 89
    .line 90
    int-to-byte v11, v11

    .line 91
    aput-byte v11, v8, v9

    .line 92
    .line 93
    add-int/2addr v5, v6

    .line 94
    shr-int/lit8 v6, v7, 0x10

    .line 95
    .line 96
    and-int/lit16 v6, v6, 0xff

    .line 97
    .line 98
    int-to-byte v6, v6

    .line 99
    aput-byte v6, v8, v10

    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    mul-int/lit8 v4, v4, 0x64

    .line 105
    .line 106
    int-to-double v2, v4

    .line 107
    int-to-double v4, v0

    .line 108
    div-double/2addr v2, v4

    .line 109
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    .line 110
    .line 111
    cmpl-double v0, v2, v4

    .line 112
    .line 113
    if-lez v0, :cond_4

    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    :cond_4
    iput-boolean v1, p0, Lt3;->χ:Z

    .line 117
    .line 118
    const-string p0, "AnimatedGifEncoder"

    .line 119
    .line 120
    invoke-static {p0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v1, "got pixels for frame with "

    .line 129
    .line 130
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, "% transparent pixels"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_5
    return-void
.end method

.method public final ε()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 9
    .line 10
    const/16 v1, 0xf9

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lt3;->ε:Ljava/lang/Integer;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, p0, Lt3;->χ:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    move v0, v2

    .line 32
    move v3, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x1

    .line 35
    move v3, v1

    .line 36
    :goto_0
    iget v4, p0, Lt3;->σ:I

    .line 37
    .line 38
    if-ltz v4, :cond_1

    .line 39
    .line 40
    and-int/lit8 v3, v4, 0x7

    .line 41
    .line 42
    :cond_1
    shl-int/lit8 v1, v3, 0x2

    .line 43
    .line 44
    iget-object v3, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 45
    .line 46
    or-int/2addr v0, v1

    .line 47
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write(I)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, Lt3;->θ:I

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lt3;->ι(I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 56
    .line 57
    iget v1, p0, Lt3;->ζ:I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 63
    .line 64
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final ζ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 9
    .line 10
    const/16 v1, 0xff

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 16
    .line 17
    const/16 v1, 0xb

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    move v2, v0

    .line 24
    :goto_0
    iget-object v3, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 25
    .line 26
    if-ge v2, v1, :cond_0

    .line 27
    .line 28
    const-string v4, "NETSCAPE2.0"

    .line 29
    .line 30
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    int-to-byte v4, v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write(I)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x3

    .line 42
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write(I)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lt3;->η:I

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lt3;->ι(I)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final η()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lt3;->ο:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lt3;->ο:[B

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    rsub-int v0, v0, 0x300

    .line 14
    .line 15
    move v1, v3

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final θ()V
    .locals 14

    .line 1
    new-instance v0, Lzo0;

    .line 2
    .line 3
    iget v1, p0, Lt3;->α:I

    .line 4
    .line 5
    iget v2, p0, Lt3;->β:I

    .line 6
    .line 7
    iget-object v3, p0, Lt3;->ν:[B

    .line 8
    .line 9
    iget v4, p0, Lt3;->ξ:I

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/16 v5, 0x138b

    .line 15
    .line 16
    new-array v6, v5, [I

    .line 17
    .line 18
    iput-object v6, v0, Lzo0;->ζ:[I

    .line 19
    .line 20
    new-array v7, v5, [I

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    iput v8, v0, Lzo0;->η:I

    .line 24
    .line 25
    iput-boolean v8, v0, Lzo0;->θ:Z

    .line 26
    .line 27
    iput v8, v0, Lzo0;->μ:I

    .line 28
    .line 29
    iput v8, v0, Lzo0;->ν:I

    .line 30
    .line 31
    const/16 v9, 0x11

    .line 32
    .line 33
    new-array v9, v9, [I

    .line 34
    .line 35
    fill-array-data v9, :array_0

    .line 36
    .line 37
    .line 38
    iput-object v9, v0, Lzo0;->ξ:[I

    .line 39
    .line 40
    const/16 v9, 0x100

    .line 41
    .line 42
    new-array v9, v9, [B

    .line 43
    .line 44
    iput-object v9, v0, Lzo0;->π:[B

    .line 45
    .line 46
    iput-object v3, v0, Lzo0;->α:[B

    .line 47
    .line 48
    const/4 v9, 0x2

    .line 49
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iget-object p0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V

    .line 56
    .line 57
    .line 58
    mul-int/2addr v1, v2

    .line 59
    iput v1, v0, Lzo0;->β:I

    .line 60
    .line 61
    iput v8, v0, Lzo0;->γ:I

    .line 62
    .line 63
    add-int/lit8 v2, v4, 0x1

    .line 64
    .line 65
    iput v2, v0, Lzo0;->ι:I

    .line 66
    .line 67
    iput-boolean v8, v0, Lzo0;->θ:Z

    .line 68
    .line 69
    iput v2, v0, Lzo0;->δ:I

    .line 70
    .line 71
    const/4 v10, 0x1

    .line 72
    shl-int v2, v10, v2

    .line 73
    .line 74
    sub-int/2addr v2, v10

    .line 75
    iput v2, v0, Lzo0;->ε:I

    .line 76
    .line 77
    shl-int v2, v10, v4

    .line 78
    .line 79
    iput v2, v0, Lzo0;->κ:I

    .line 80
    .line 81
    add-int/lit8 v4, v2, 0x1

    .line 82
    .line 83
    iput v4, v0, Lzo0;->λ:I

    .line 84
    .line 85
    add-int/2addr v2, v9

    .line 86
    iput v2, v0, Lzo0;->η:I

    .line 87
    .line 88
    iput v8, v0, Lzo0;->ο:I

    .line 89
    .line 90
    const/4 v2, -0x1

    .line 91
    if-nez v1, :cond_0

    .line 92
    .line 93
    move v1, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    sub-int/2addr v1, v10

    .line 96
    iput v1, v0, Lzo0;->β:I

    .line 97
    .line 98
    iput v10, v0, Lzo0;->γ:I

    .line 99
    .line 100
    aget-byte v1, v3, v8

    .line 101
    .line 102
    and-int/lit16 v1, v1, 0xff

    .line 103
    .line 104
    :goto_0
    move v3, v5

    .line 105
    move v4, v8

    .line 106
    :goto_1
    const/high16 v9, 0x10000

    .line 107
    .line 108
    if-ge v3, v9, :cond_1

    .line 109
    .line 110
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    mul-int/lit8 v3, v3, 0x2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    rsub-int/lit8 v3, v4, 0x8

    .line 116
    .line 117
    move v4, v8

    .line 118
    :goto_2
    if-ge v4, v5, :cond_2

    .line 119
    .line 120
    iget-object v9, v0, Lzo0;->ζ:[I

    .line 121
    .line 122
    aput v2, v9, v4

    .line 123
    .line 124
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    iget v4, v0, Lzo0;->κ:I

    .line 128
    .line 129
    invoke-virtual {v0, v4, p0}, Lzo0;->α(ILjava/io/OutputStream;)V

    .line 130
    .line 131
    .line 132
    :goto_3
    iget v4, v0, Lzo0;->β:I

    .line 133
    .line 134
    if-nez v4, :cond_3

    .line 135
    .line 136
    move v4, v2

    .line 137
    goto :goto_4

    .line 138
    :cond_3
    add-int/lit8 v4, v4, -0x1

    .line 139
    .line 140
    iput v4, v0, Lzo0;->β:I

    .line 141
    .line 142
    iget-object v4, v0, Lzo0;->α:[B

    .line 143
    .line 144
    iget v9, v0, Lzo0;->γ:I

    .line 145
    .line 146
    add-int/lit8 v11, v9, 0x1

    .line 147
    .line 148
    iput v11, v0, Lzo0;->γ:I

    .line 149
    .line 150
    aget-byte v4, v4, v9

    .line 151
    .line 152
    and-int/lit16 v4, v4, 0xff

    .line 153
    .line 154
    :goto_4
    if-eq v4, v2, :cond_b

    .line 155
    .line 156
    shl-int/lit8 v9, v4, 0xc

    .line 157
    .line 158
    add-int/2addr v9, v1

    .line 159
    shl-int v11, v4, v3

    .line 160
    .line 161
    xor-int/2addr v11, v1

    .line 162
    aget v12, v6, v11

    .line 163
    .line 164
    if-ne v12, v9, :cond_4

    .line 165
    .line 166
    aget v1, v7, v11

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_4
    if-ltz v12, :cond_8

    .line 170
    .line 171
    rsub-int v12, v11, 0x138b

    .line 172
    .line 173
    if-nez v11, :cond_5

    .line 174
    .line 175
    move v12, v10

    .line 176
    :cond_5
    sub-int/2addr v11, v12

    .line 177
    if-gez v11, :cond_6

    .line 178
    .line 179
    add-int/lit16 v11, v11, 0x138b

    .line 180
    .line 181
    :cond_6
    aget v13, v6, v11

    .line 182
    .line 183
    if-ne v13, v9, :cond_7

    .line 184
    .line 185
    aget v1, v7, v11

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    if-gez v13, :cond_5

    .line 189
    .line 190
    :cond_8
    invoke-virtual {v0, v1, p0}, Lzo0;->α(ILjava/io/OutputStream;)V

    .line 191
    .line 192
    .line 193
    iget v1, v0, Lzo0;->η:I

    .line 194
    .line 195
    const/16 v12, 0x1000

    .line 196
    .line 197
    if-ge v1, v12, :cond_9

    .line 198
    .line 199
    add-int/lit8 v12, v1, 0x1

    .line 200
    .line 201
    iput v12, v0, Lzo0;->η:I

    .line 202
    .line 203
    aput v1, v7, v11

    .line 204
    .line 205
    aput v9, v6, v11

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_9
    move v1, v8

    .line 209
    :goto_5
    if-ge v1, v5, :cond_a

    .line 210
    .line 211
    iget-object v9, v0, Lzo0;->ζ:[I

    .line 212
    .line 213
    aput v2, v9, v1

    .line 214
    .line 215
    add-int/lit8 v1, v1, 0x1

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_a
    iget v1, v0, Lzo0;->κ:I

    .line 219
    .line 220
    add-int/lit8 v9, v1, 0x2

    .line 221
    .line 222
    iput v9, v0, Lzo0;->η:I

    .line 223
    .line 224
    iput-boolean v10, v0, Lzo0;->θ:Z

    .line 225
    .line 226
    invoke-virtual {v0, v1, p0}, Lzo0;->α(ILjava/io/OutputStream;)V

    .line 227
    .line 228
    .line 229
    :goto_6
    move v1, v4

    .line 230
    goto :goto_3

    .line 231
    :cond_b
    invoke-virtual {v0, v1, p0}, Lzo0;->α(ILjava/io/OutputStream;)V

    .line 232
    .line 233
    .line 234
    iget v1, v0, Lzo0;->λ:I

    .line 235
    .line 236
    invoke-virtual {v0, v1, p0}, Lzo0;->α(ILjava/io/OutputStream;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write(I)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :array_0
    .array-data 4
        0x0
        0x1
        0x3
        0x7
        0xf
        0x1f
        0x3f
        0x7f
        0xff
        0x1ff
        0x3ff
        0x7ff
        0xfff
        0x1fff
        0x3fff
        0x7fff
        0xffff
    .end array-data
.end method

.method public final ι(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 2
    .line 3
    and-int/lit16 v1, p1, 0xff

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lt3;->κ:Ljava/io/OutputStream;

    .line 9
    .line 10
    shr-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    and-int/lit16 p1, p1, 0xff

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
