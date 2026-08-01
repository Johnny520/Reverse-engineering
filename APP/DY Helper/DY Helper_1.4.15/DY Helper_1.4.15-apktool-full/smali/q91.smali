.class public final Lq91;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Ljava/lang/String;

.field public β:Lw32;

.field public γ:Lf50;

.field public δ:I

.field public ε:Z

.field public ζ:I

.field public η:I

.field public θ:J

.field public ι:Lyr;

.field public κ:Ls2;

.field public λ:Z

.field public μ:J

.field public ν:Ln01;

.field public ξ:Lo91;

.field public ο:Lnp0;

.field public π:J

.field public ρ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw32;Lf50;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq91;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lq91;->β:Lw32;

    .line 7
    .line 8
    iput-object p3, p0, Lq91;->γ:Lf50;

    .line 9
    .line 10
    iput p4, p0, Lq91;->δ:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lq91;->ε:Z

    .line 13
    .line 14
    iput p6, p0, Lq91;->ζ:I

    .line 15
    .line 16
    iput p7, p0, Lq91;->η:I

    .line 17
    .line 18
    sget-wide p1, Lem0;->α:J

    .line 19
    .line 20
    iput-wide p1, p0, Lq91;->θ:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    int-to-long p2, p1

    .line 24
    const/16 p4, 0x20

    .line 25
    .line 26
    shl-long p4, p2, p4

    .line 27
    .line 28
    const-wide p6, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p2, p6

    .line 34
    or-long/2addr p2, p4

    .line 35
    iput-wide p2, p0, Lq91;->μ:J

    .line 36
    .line 37
    invoke-static {p1, p1, p1, p1}, Lzo;->η(IIII)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    iput-wide p1, p0, Lq91;->π:J

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ParagraphLayoutCache(paragraph="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lq91;->κ:Ls2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "<paragraph>"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "null"

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", lastDensity="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, Lq91;->θ:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Lem0;->β(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", history="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-wide v1, p0, Lq91;->ρ:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ", constraints=$)"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final α(JLnp0;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-wide v2, v0, Lq91;->ρ:J

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    shl-long/2addr v2, v4

    .line 9
    const-wide/16 v5, 0x3

    .line 10
    .line 11
    or-long/2addr v2, v5

    .line 12
    iput-wide v2, v0, Lq91;->ρ:J

    .line 13
    .line 14
    iget v2, v0, Lq91;->η:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-le v2, v3, :cond_5

    .line 18
    .line 19
    iget-object v2, v0, Lq91;->β:Lw32;

    .line 20
    .line 21
    iget-object v5, v0, Lq91;->ν:Ln01;

    .line 22
    .line 23
    iget-object v6, v0, Lq91;->ι:Lyr;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v7, v0, Lq91;->γ:Lf50;

    .line 29
    .line 30
    invoke-static {v5, v1, v2, v6, v7}, Ljx0;->Α(Ln01;Lnp0;Lw32;Lyr;Lf50;)Ln01;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v0, Lq91;->ν:Ln01;

    .line 35
    .line 36
    iget v5, v0, Lq91;->η:I

    .line 37
    .line 38
    iget-object v10, v2, Ln01;->γ:Lzr;

    .line 39
    .line 40
    iget v6, v2, Ln01;->η:F

    .line 41
    .line 42
    iget v7, v2, Ln01;->ζ:F

    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v13, 0x0

    .line 49
    if-nez v8, :cond_0

    .line 50
    .line 51
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    :cond_0
    sget-object v6, Lo01;->α:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v7, v2, Ln01;->ε:Lw32;

    .line 60
    .line 61
    const/16 v14, 0xf

    .line 62
    .line 63
    invoke-static {v13, v13, v14}, Lzo;->β(III)J

    .line 64
    .line 65
    .line 66
    move-result-wide v8

    .line 67
    iget-object v11, v2, Ln01;->δ:Lf50;

    .line 68
    .line 69
    const/4 v12, 0x1

    .line 70
    invoke-static/range {v6 .. v12}, Lp91;->α(Ljava/lang/String;Lw32;JLzr;Lf50;I)Ls2;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6}, Ls2;->β()F

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    sget-object v6, Lo01;->β:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v7, v2, Ln01;->ε:Lw32;

    .line 81
    .line 82
    invoke-static {v13, v13, v14}, Lzo;->β(III)J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    iget-object v11, v2, Ln01;->δ:Lf50;

    .line 87
    .line 88
    const/4 v12, 0x2

    .line 89
    invoke-static/range {v6 .. v12}, Lp91;->α(Ljava/lang/String;Lw32;JLzr;Lf50;I)Ls2;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v6}, Ls2;->β()F

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    sub-float v7, v6, v15

    .line 98
    .line 99
    iput v15, v2, Ln01;->η:F

    .line 100
    .line 101
    iput v7, v2, Ln01;->ζ:F

    .line 102
    .line 103
    move v6, v15

    .line 104
    :cond_1
    const/4 v2, 0x1

    .line 105
    if-eq v5, v2, :cond_3

    .line 106
    .line 107
    sub-int/2addr v5, v2

    .line 108
    int-to-float v2, v5

    .line 109
    mul-float/2addr v7, v2

    .line 110
    add-float/2addr v7, v6

    .line 111
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-gez v2, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move v13, v2

    .line 119
    :goto_0
    invoke-static/range {p1 .. p2}, Lyo;->η(J)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-le v13, v2, :cond_4

    .line 124
    .line 125
    move v13, v2

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static/range {p1 .. p2}, Lyo;->ι(J)I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    :cond_4
    :goto_1
    invoke-static/range {p1 .. p2}, Lyo;->η(J)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-static/range {p1 .. p2}, Lyo;->κ(J)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-static/range {p1 .. p2}, Lyo;->θ(J)I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    invoke-static {v5, v6, v13, v2}, Lzo;->α(IIII)J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    goto :goto_2

    .line 148
    :cond_5
    move-wide/from16 v5, p1

    .line 149
    .line 150
    :goto_2
    iget-object v2, v0, Lq91;->κ:Ls2;

    .line 151
    .line 152
    const/4 v7, 0x3

    .line 153
    const/4 v8, 0x0

    .line 154
    const-wide v9, 0xffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    const/16 v11, 0x20

    .line 160
    .line 161
    if-nez v2, :cond_6

    .line 162
    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :cond_6
    iget-object v12, v0, Lq91;->ξ:Lo91;

    .line 166
    .line 167
    if-nez v12, :cond_7

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_7
    invoke-interface {v12}, Lo91;->α()Z

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    if-eqz v12, :cond_8

    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_8
    iget-object v12, v0, Lq91;->ο:Lnp0;

    .line 180
    .line 181
    if-eq v1, v12, :cond_9

    .line 182
    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_9
    iget-wide v12, v0, Lq91;->π:J

    .line 186
    .line 187
    invoke-static {v5, v6, v12, v13}, Lyo;->β(JJ)Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-eqz v12, :cond_a

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_a
    invoke-static {v5, v6}, Lyo;->θ(J)I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    iget-wide v13, v0, Lq91;->π:J

    .line 199
    .line 200
    invoke-static {v13, v14}, Lyo;->θ(J)I

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-eq v12, v13, :cond_b

    .line 205
    .line 206
    goto/16 :goto_6

    .line 207
    .line 208
    :cond_b
    invoke-static {v5, v6}, Lyo;->κ(J)I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    iget-wide v13, v0, Lq91;->π:J

    .line 213
    .line 214
    invoke-static {v13, v14}, Lyo;->κ(J)I

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-eq v12, v13, :cond_c

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_c
    invoke-static {v5, v6}, Lyo;->η(J)I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    int-to-float v12, v12

    .line 226
    invoke-virtual {v2}, Ls2;->β()F

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    cmpg-float v12, v12, v13

    .line 231
    .line 232
    if-ltz v12, :cond_12

    .line 233
    .line 234
    iget-object v2, v2, Ls2;->δ:Lk32;

    .line 235
    .line 236
    iget-boolean v2, v2, Lk32;->δ:Z

    .line 237
    .line 238
    if-eqz v2, :cond_d

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_d
    :goto_3
    iget-wide v1, v0, Lq91;->π:J

    .line 242
    .line 243
    invoke-static {v5, v6, v1, v2}, Lyo;->β(JJ)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_11

    .line 248
    .line 249
    iget-object v1, v0, Lq91;->κ:Ls2;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v2, v1, Ls2;->α:Lw2;

    .line 255
    .line 256
    iget-object v2, v2, Lw2;->ι:Lpp0;

    .line 257
    .line 258
    invoke-virtual {v2}, Lpp0;->γ()F

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {v1}, Ls2;->γ()F

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-static {v2}, Lv71;->γ(F)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-virtual {v1}, Ls2;->β()F

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-static {v4}, Lv71;->γ(F)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    int-to-long v12, v2

    .line 283
    shl-long/2addr v12, v11

    .line 284
    int-to-long v14, v4

    .line 285
    and-long/2addr v14, v9

    .line 286
    or-long/2addr v12, v14

    .line 287
    invoke-static {v5, v6, v12, v13}, Lzo;->δ(JJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v12

    .line 291
    iput-wide v12, v0, Lq91;->μ:J

    .line 292
    .line 293
    iget v2, v0, Lq91;->δ:I

    .line 294
    .line 295
    if-ne v2, v7, :cond_e

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_e
    shr-long v14, v12, v11

    .line 299
    .line 300
    long-to-int v2, v14

    .line 301
    int-to-float v2, v2

    .line 302
    invoke-virtual {v1}, Ls2;->γ()F

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    cmpg-float v2, v2, v4

    .line 307
    .line 308
    if-ltz v2, :cond_10

    .line 309
    .line 310
    and-long/2addr v9, v12

    .line 311
    long-to-int v2, v9

    .line 312
    int-to-float v2, v2

    .line 313
    invoke-virtual {v1}, Ls2;->β()F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    cmpg-float v1, v2, v1

    .line 318
    .line 319
    if-gez v1, :cond_f

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_f
    :goto_4
    move v3, v8

    .line 323
    :cond_10
    :goto_5
    iput-boolean v3, v0, Lq91;->λ:Z

    .line 324
    .line 325
    iput-wide v5, v0, Lq91;->π:J

    .line 326
    .line 327
    :cond_11
    return v8

    .line 328
    :cond_12
    :goto_6
    iget-object v2, v0, Lq91;->ξ:Lo91;

    .line 329
    .line 330
    if-eqz v2, :cond_13

    .line 331
    .line 332
    iget-object v12, v0, Lq91;->ο:Lnp0;

    .line 333
    .line 334
    if-ne v1, v12, :cond_13

    .line 335
    .line 336
    invoke-interface {v2}, Lo91;->α()Z

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-eqz v12, :cond_14

    .line 341
    .line 342
    :cond_13
    iput-object v1, v0, Lq91;->ο:Lnp0;

    .line 343
    .line 344
    iget-object v14, v0, Lq91;->α:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v2, v0, Lq91;->β:Lw32;

    .line 347
    .line 348
    invoke-static {v2, v1}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 349
    .line 350
    .line 351
    move-result-object v15

    .line 352
    iget-object v1, v0, Lq91;->ι:Lyr;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object v2, v0, Lq91;->γ:Lf50;

    .line 358
    .line 359
    new-instance v13, Lw2;

    .line 360
    .line 361
    sget-object v16, Ljz;->ε:Ljz;

    .line 362
    .line 363
    move-object/from16 v17, v16

    .line 364
    .line 365
    move-object/from16 v19, v1

    .line 366
    .line 367
    move-object/from16 v18, v2

    .line 368
    .line 369
    invoke-direct/range {v13 .. v19}, Lw2;-><init>(Ljava/lang/String;Lw32;Ljava/util/List;Ljava/util/List;Lf50;Lyr;)V

    .line 370
    .line 371
    .line 372
    move-object v2, v13

    .line 373
    :cond_14
    iput-object v2, v0, Lq91;->ξ:Lo91;

    .line 374
    .line 375
    iget-boolean v1, v0, Lq91;->ε:Z

    .line 376
    .line 377
    iget v12, v0, Lq91;->δ:I

    .line 378
    .line 379
    invoke-interface {v2}, Lo91;->β()F

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    invoke-static {v5, v6, v1, v12, v13}, Lkn0;->υ(JZIF)J

    .line 384
    .line 385
    .line 386
    move-result-wide v18

    .line 387
    iget-boolean v1, v0, Lq91;->ε:Z

    .line 388
    .line 389
    iget v12, v0, Lq91;->δ:I

    .line 390
    .line 391
    iget v13, v0, Lq91;->ζ:I

    .line 392
    .line 393
    if-nez v1, :cond_17

    .line 394
    .line 395
    if-ne v12, v4, :cond_15

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_15
    const/4 v1, 0x4

    .line 399
    if-ne v12, v1, :cond_16

    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_16
    const/4 v1, 0x5

    .line 403
    if-ne v12, v1, :cond_17

    .line 404
    .line 405
    :goto_7
    move/from16 v16, v3

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_17
    if-ge v13, v3, :cond_18

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_18
    move/from16 v16, v13

    .line 412
    .line 413
    :goto_8
    new-instance v14, Ls2;

    .line 414
    .line 415
    move-object v15, v2

    .line 416
    check-cast v15, Lw2;

    .line 417
    .line 418
    move/from16 v17, v12

    .line 419
    .line 420
    invoke-direct/range {v14 .. v19}, Ls2;-><init>(Lw2;IIJ)V

    .line 421
    .line 422
    .line 423
    iput-wide v5, v0, Lq91;->π:J

    .line 424
    .line 425
    invoke-virtual {v14}, Ls2;->γ()F

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-static {v1}, Lv71;->γ(F)I

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    invoke-virtual {v14}, Ls2;->β()F

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    invoke-static {v2}, Lv71;->γ(F)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    int-to-long v12, v1

    .line 442
    shl-long/2addr v12, v11

    .line 443
    int-to-long v1, v2

    .line 444
    and-long/2addr v1, v9

    .line 445
    or-long/2addr v1, v12

    .line 446
    invoke-static {v5, v6, v1, v2}, Lzo;->δ(JJ)J

    .line 447
    .line 448
    .line 449
    move-result-wide v1

    .line 450
    iput-wide v1, v0, Lq91;->μ:J

    .line 451
    .line 452
    iget v4, v0, Lq91;->δ:I

    .line 453
    .line 454
    if-ne v4, v7, :cond_19

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_19
    shr-long v4, v1, v11

    .line 458
    .line 459
    long-to-int v4, v4

    .line 460
    int-to-float v4, v4

    .line 461
    invoke-virtual {v14}, Ls2;->γ()F

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    cmpg-float v4, v4, v5

    .line 466
    .line 467
    if-ltz v4, :cond_1a

    .line 468
    .line 469
    and-long/2addr v1, v9

    .line 470
    long-to-int v1, v1

    .line 471
    int-to-float v1, v1

    .line 472
    invoke-virtual {v14}, Ls2;->β()F

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    cmpg-float v1, v1, v2

    .line 477
    .line 478
    if-gez v1, :cond_1b

    .line 479
    .line 480
    :cond_1a
    move v8, v3

    .line 481
    :cond_1b
    :goto_9
    iput-boolean v8, v0, Lq91;->λ:Z

    .line 482
    .line 483
    iput-object v14, v0, Lq91;->κ:Ls2;

    .line 484
    .line 485
    return v3
.end method

.method public final β()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq91;->κ:Ls2;

    .line 3
    .line 4
    iput-object v0, p0, Lq91;->ξ:Lo91;

    .line 5
    .line 6
    iput-object v0, p0, Lq91;->ο:Lnp0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v0, v0, v0}, Lzo;->η(IIII)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, p0, Lq91;->π:J

    .line 14
    .line 15
    int-to-long v1, v0

    .line 16
    const/16 v3, 0x20

    .line 17
    .line 18
    shl-long v3, v1, v3

    .line 19
    .line 20
    const-wide v5, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v1, v5

    .line 26
    or-long/2addr v1, v3

    .line 27
    iput-wide v1, p0, Lq91;->μ:J

    .line 28
    .line 29
    iput-boolean v0, p0, Lq91;->λ:Z

    .line 30
    .line 31
    return-void
.end method

.method public final γ(Lyr;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq91;->ι:Lyr;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget v1, Lem0;->β:I

    .line 6
    .line 7
    invoke-interface {p1}, Lyr;->β()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p1}, Lyr;->θ()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Lem0;->α(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v1, Lem0;->α:J

    .line 21
    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput-object p1, p0, Lq91;->ι:Lyr;

    .line 25
    .line 26
    iput-wide v1, p0, Lq91;->θ:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-wide v3, p0, Lq91;->θ:J

    .line 32
    .line 33
    cmp-long v0, v3, v1

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iput-object p1, p0, Lq91;->ι:Lyr;

    .line 39
    .line 40
    iput-wide v1, p0, Lq91;->θ:J

    .line 41
    .line 42
    iget-wide v0, p0, Lq91;->ρ:J

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    shl-long/2addr v0, p1

    .line 46
    const-wide/16 v2, 0x1

    .line 47
    .line 48
    or-long/2addr v0, v2

    .line 49
    iput-wide v0, p0, Lq91;->ρ:J

    .line 50
    .line 51
    invoke-virtual {p0}, Lq91;->β()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final δ(Ljava/lang/String;Lw32;Lf50;IZII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq91;->α:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lq91;->β:Lw32;

    .line 4
    .line 5
    iput-object p3, p0, Lq91;->γ:Lf50;

    .line 6
    .line 7
    iput p4, p0, Lq91;->δ:I

    .line 8
    .line 9
    iput-boolean p5, p0, Lq91;->ε:Z

    .line 10
    .line 11
    iput p6, p0, Lq91;->ζ:I

    .line 12
    .line 13
    iput p7, p0, Lq91;->η:I

    .line 14
    .line 15
    iget-wide p1, p0, Lq91;->ρ:J

    .line 16
    .line 17
    const/4 p3, 0x2

    .line 18
    shl-long/2addr p1, p3

    .line 19
    const-wide/16 p3, 0x2

    .line 20
    .line 21
    or-long/2addr p1, p3

    .line 22
    iput-wide p1, p0, Lq91;->ρ:J

    .line 23
    .line 24
    invoke-virtual {p0}, Lq91;->β()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
