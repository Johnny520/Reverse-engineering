.class public abstract Lr60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static a:Lr00;


# direct methods
.method public static final A([F)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    aput v1, p0, v0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    aput v2, p0, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput v2, p0, v0

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    aput v2, p0, v0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    aput v2, p0, v0

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    aput v1, p0, v0

    .line 27
    .line 28
    const/4 v0, 0x6

    .line 29
    aput v2, p0, v0

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    aput v2, p0, v0

    .line 33
    .line 34
    const/16 v0, 0x8

    .line 35
    .line 36
    aput v2, p0, v0

    .line 37
    .line 38
    const/16 v0, 0x9

    .line 39
    .line 40
    aput v2, p0, v0

    .line 41
    .line 42
    const/16 v0, 0xa

    .line 43
    .line 44
    aput v1, p0, v0

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    aput v2, p0, v0

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    aput v2, p0, v0

    .line 53
    .line 54
    const/16 v0, 0xd

    .line 55
    .line 56
    aput v2, p0, v0

    .line 57
    .line 58
    const/16 v0, 0xe

    .line 59
    .line 60
    aput v2, p0, v0

    .line 61
    .line 62
    const/16 v0, 0xf

    .line 63
    .line 64
    aput v1, p0, v0

    .line 65
    .line 66
    return-void
.end method

.method public static final B(Ljava/util/List;Ld6;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ld6;->a:Landroid/graphics/Path;

    .line 6
    .line 7
    iget-object v3, v1, Ld6;->a:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v5

    .line 22
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Path;->rewind()V

    .line 23
    .line 24
    .line 25
    if-ne v1, v4, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 29
    .line 30
    :goto_1
    invoke-virtual {v3, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v1, Llp0;->b:Llp0;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lwp0;

    .line 47
    .line 48
    :goto_2
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v10, 0x0

    .line 53
    move v11, v5

    .line 54
    move v4, v10

    .line 55
    move v5, v4

    .line 56
    move v12, v5

    .line 57
    move v13, v12

    .line 58
    move v14, v13

    .line 59
    move v15, v14

    .line 60
    :goto_3
    if-ge v11, v2, :cond_10

    .line 61
    .line 62
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Lwp0;

    .line 67
    .line 68
    instance-of v7, v6, Llp0;

    .line 69
    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 73
    .line 74
    .line 75
    move-object v10, v6

    .line 76
    move v4, v12

    .line 77
    move v14, v4

    .line 78
    move v5, v13

    .line 79
    move v15, v5

    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :cond_3
    instance-of v7, v6, Lpp0;

    .line 83
    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    move-object v1, v6

    .line 87
    check-cast v1, Lpp0;

    .line 88
    .line 89
    iget v12, v1, Lpp0;->b:F

    .line 90
    .line 91
    iget v13, v1, Lpp0;->c:F

    .line 92
    .line 93
    invoke-virtual {v3, v12, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 94
    .line 95
    .line 96
    move-object v10, v6

    .line 97
    move v14, v12

    .line 98
    move v15, v13

    .line 99
    goto/16 :goto_7

    .line 100
    .line 101
    :cond_4
    instance-of v7, v6, Ltp0;

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    move-object v1, v6

    .line 106
    check-cast v1, Ltp0;

    .line 107
    .line 108
    iget v7, v1, Ltp0;->c:F

    .line 109
    .line 110
    iget v1, v1, Ltp0;->b:F

    .line 111
    .line 112
    invoke-virtual {v3, v1, v7}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 113
    .line 114
    .line 115
    add-float/2addr v14, v1

    .line 116
    add-float/2addr v15, v7

    .line 117
    :goto_4
    move-object v10, v6

    .line 118
    goto/16 :goto_7

    .line 119
    .line 120
    :cond_5
    instance-of v7, v6, Lop0;

    .line 121
    .line 122
    if-eqz v7, :cond_6

    .line 123
    .line 124
    move-object v1, v6

    .line 125
    check-cast v1, Lop0;

    .line 126
    .line 127
    iget v7, v1, Lop0;->c:F

    .line 128
    .line 129
    iget v1, v1, Lop0;->b:F

    .line 130
    .line 131
    invoke-virtual {v3, v1, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 132
    .line 133
    .line 134
    move v14, v1

    .line 135
    move-object v10, v6

    .line 136
    move v15, v7

    .line 137
    goto/16 :goto_7

    .line 138
    .line 139
    :cond_6
    instance-of v7, v6, Lsp0;

    .line 140
    .line 141
    if-eqz v7, :cond_7

    .line 142
    .line 143
    move-object v1, v6

    .line 144
    check-cast v1, Lsp0;

    .line 145
    .line 146
    iget v1, v1, Lsp0;->b:F

    .line 147
    .line 148
    invoke-virtual {v3, v1, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 149
    .line 150
    .line 151
    add-float/2addr v14, v1

    .line 152
    goto :goto_4

    .line 153
    :cond_7
    instance-of v7, v6, Lnp0;

    .line 154
    .line 155
    if-eqz v7, :cond_8

    .line 156
    .line 157
    const/high16 v1, 0x40e00000    # 7.0f

    .line 158
    .line 159
    invoke-virtual {v3, v1, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 160
    .line 161
    .line 162
    move v14, v1

    .line 163
    goto :goto_4

    .line 164
    :cond_8
    instance-of v7, v6, Lvp0;

    .line 165
    .line 166
    if-eqz v7, :cond_9

    .line 167
    .line 168
    move-object v1, v6

    .line 169
    check-cast v1, Lvp0;

    .line 170
    .line 171
    iget v1, v1, Lvp0;->b:F

    .line 172
    .line 173
    invoke-virtual {v3, v10, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 174
    .line 175
    .line 176
    add-float/2addr v15, v1

    .line 177
    goto :goto_4

    .line 178
    :cond_9
    instance-of v7, v6, Lrp0;

    .line 179
    .line 180
    if-eqz v7, :cond_a

    .line 181
    .line 182
    move-object v1, v6

    .line 183
    check-cast v1, Lrp0;

    .line 184
    .line 185
    iget v4, v1, Lrp0;->b:F

    .line 186
    .line 187
    iget v5, v1, Lrp0;->c:F

    .line 188
    .line 189
    move-object v7, v6

    .line 190
    iget v6, v1, Lrp0;->d:F

    .line 191
    .line 192
    move-object v8, v7

    .line 193
    iget v7, v1, Lrp0;->e:F

    .line 194
    .line 195
    move-object v9, v8

    .line 196
    iget v8, v1, Lrp0;->f:F

    .line 197
    .line 198
    move-object/from16 v16, v9

    .line 199
    .line 200
    iget v9, v1, Lrp0;->g:F

    .line 201
    .line 202
    move-object/from16 v10, v16

    .line 203
    .line 204
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 205
    .line 206
    .line 207
    iget v4, v1, Lrp0;->d:F

    .line 208
    .line 209
    add-float/2addr v4, v14

    .line 210
    iget v5, v1, Lrp0;->e:F

    .line 211
    .line 212
    add-float/2addr v5, v15

    .line 213
    iget v6, v1, Lrp0;->f:F

    .line 214
    .line 215
    add-float/2addr v14, v6

    .line 216
    iget v1, v1, Lrp0;->g:F

    .line 217
    .line 218
    :goto_5
    add-float/2addr v15, v1

    .line 219
    goto/16 :goto_7

    .line 220
    .line 221
    :cond_a
    move-object v10, v6

    .line 222
    instance-of v6, v10, Lmp0;

    .line 223
    .line 224
    if-eqz v6, :cond_b

    .line 225
    .line 226
    move-object v1, v10

    .line 227
    check-cast v1, Lmp0;

    .line 228
    .line 229
    iget v4, v1, Lmp0;->b:F

    .line 230
    .line 231
    iget v5, v1, Lmp0;->c:F

    .line 232
    .line 233
    iget v6, v1, Lmp0;->d:F

    .line 234
    .line 235
    iget v7, v1, Lmp0;->e:F

    .line 236
    .line 237
    iget v8, v1, Lmp0;->f:F

    .line 238
    .line 239
    iget v9, v1, Lmp0;->g:F

    .line 240
    .line 241
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 242
    .line 243
    .line 244
    iget v4, v1, Lmp0;->d:F

    .line 245
    .line 246
    iget v5, v1, Lmp0;->e:F

    .line 247
    .line 248
    iget v6, v1, Lmp0;->f:F

    .line 249
    .line 250
    iget v1, v1, Lmp0;->g:F

    .line 251
    .line 252
    move v15, v1

    .line 253
    move v14, v6

    .line 254
    goto :goto_7

    .line 255
    :cond_b
    instance-of v6, v10, Lup0;

    .line 256
    .line 257
    if-eqz v6, :cond_d

    .line 258
    .line 259
    iget-boolean v1, v1, Lwp0;->a:Z

    .line 260
    .line 261
    if-eqz v1, :cond_c

    .line 262
    .line 263
    sub-float v1, v14, v4

    .line 264
    .line 265
    sub-float v4, v15, v5

    .line 266
    .line 267
    move v5, v4

    .line 268
    move v4, v1

    .line 269
    goto :goto_6

    .line 270
    :cond_c
    const/4 v4, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    :goto_6
    move-object v1, v10

    .line 273
    check-cast v1, Lup0;

    .line 274
    .line 275
    iget v6, v1, Lup0;->b:F

    .line 276
    .line 277
    iget v7, v1, Lup0;->c:F

    .line 278
    .line 279
    const/high16 v8, 0x41200000    # 10.0f

    .line 280
    .line 281
    iget v9, v1, Lup0;->d:F

    .line 282
    .line 283
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 284
    .line 285
    .line 286
    iget v4, v1, Lup0;->b:F

    .line 287
    .line 288
    add-float/2addr v4, v14

    .line 289
    iget v5, v1, Lup0;->c:F

    .line 290
    .line 291
    add-float/2addr v5, v15

    .line 292
    const/high16 v6, 0x41200000    # 10.0f

    .line 293
    .line 294
    add-float/2addr v14, v6

    .line 295
    iget v1, v1, Lup0;->d:F

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_d
    instance-of v6, v10, Lqp0;

    .line 299
    .line 300
    if-eqz v6, :cond_f

    .line 301
    .line 302
    iget-boolean v1, v1, Lwp0;->a:Z

    .line 303
    .line 304
    const/high16 v16, 0x40000000    # 2.0f

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    mul-float v14, v14, v16

    .line 309
    .line 310
    sub-float/2addr v14, v4

    .line 311
    mul-float v15, v15, v16

    .line 312
    .line 313
    sub-float/2addr v15, v5

    .line 314
    :cond_e
    move v4, v14

    .line 315
    move v5, v15

    .line 316
    const/high16 v8, 0x41400000    # 12.0f

    .line 317
    .line 318
    const/high16 v9, 0x40000000    # 2.0f

    .line 319
    .line 320
    const v6, 0x418c28f6    # 17.52f

    .line 321
    .line 322
    .line 323
    const/high16 v7, 0x40000000    # 2.0f

    .line 324
    .line 325
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 326
    .line 327
    .line 328
    const v1, 0x418c28f6    # 17.52f

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41400000    # 12.0f

    .line 332
    .line 333
    move v14, v4

    .line 334
    move/from16 v5, v16

    .line 335
    .line 336
    move v15, v5

    .line 337
    move v4, v1

    .line 338
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 339
    .line 340
    move-object v1, v10

    .line 341
    const/4 v10, 0x0

    .line 342
    goto/16 :goto_3

    .line 343
    .line 344
    :cond_f
    invoke-static {}, Lxc;->j()V

    .line 345
    .line 346
    .line 347
    :cond_10
    return-void
.end method

.method public static C([FFF)V
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    mul-float/2addr v0, p1

    .line 11
    const/4 v1, 0x4

    .line 12
    aget v1, p0, v1

    .line 13
    .line 14
    mul-float/2addr v1, p2

    .line 15
    add-float/2addr v1, v0

    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    aget v0, p0, v0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    mul-float/2addr v0, v2

    .line 22
    add-float/2addr v0, v1

    .line 23
    const/16 v1, 0xc

    .line 24
    .line 25
    aget v3, p0, v1

    .line 26
    .line 27
    add-float/2addr v0, v3

    .line 28
    const/4 v3, 0x1

    .line 29
    aget v3, p0, v3

    .line 30
    .line 31
    mul-float/2addr v3, p1

    .line 32
    const/4 v4, 0x5

    .line 33
    aget v4, p0, v4

    .line 34
    .line 35
    mul-float/2addr v4, p2

    .line 36
    add-float/2addr v4, v3

    .line 37
    const/16 v3, 0x9

    .line 38
    .line 39
    aget v3, p0, v3

    .line 40
    .line 41
    mul-float/2addr v3, v2

    .line 42
    add-float/2addr v3, v4

    .line 43
    const/16 v4, 0xd

    .line 44
    .line 45
    aget v5, p0, v4

    .line 46
    .line 47
    add-float/2addr v3, v5

    .line 48
    const/4 v5, 0x2

    .line 49
    aget v5, p0, v5

    .line 50
    .line 51
    mul-float/2addr v5, p1

    .line 52
    const/4 v6, 0x6

    .line 53
    aget v6, p0, v6

    .line 54
    .line 55
    mul-float/2addr v6, p2

    .line 56
    add-float/2addr v6, v5

    .line 57
    const/16 v5, 0xa

    .line 58
    .line 59
    aget v5, p0, v5

    .line 60
    .line 61
    mul-float/2addr v5, v2

    .line 62
    add-float/2addr v5, v6

    .line 63
    const/16 v6, 0xe

    .line 64
    .line 65
    aget v7, p0, v6

    .line 66
    .line 67
    add-float/2addr v5, v7

    .line 68
    const/4 v7, 0x3

    .line 69
    aget v7, p0, v7

    .line 70
    .line 71
    mul-float/2addr v7, p1

    .line 72
    const/4 p1, 0x7

    .line 73
    aget p1, p0, p1

    .line 74
    .line 75
    mul-float/2addr p1, p2

    .line 76
    add-float/2addr p1, v7

    .line 77
    const/16 p2, 0xb

    .line 78
    .line 79
    aget p2, p0, p2

    .line 80
    .line 81
    mul-float/2addr p2, v2

    .line 82
    add-float/2addr p2, p1

    .line 83
    const/16 p1, 0xf

    .line 84
    .line 85
    aget v2, p0, p1

    .line 86
    .line 87
    add-float/2addr p2, v2

    .line 88
    aput v0, p0, v1

    .line 89
    .line 90
    aput v3, p0, v4

    .line 91
    .line 92
    aput v5, p0, v6

    .line 93
    .line 94
    aput p2, p0, p1

    .line 95
    .line 96
    return-void
.end method

.method public static final D(Loe0;Ljava/lang/Object;Lsw;)V
    .locals 9

    .line 1
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 2
    .line 3
    iget-boolean v0, v0, Loe0;->q:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 13
    .line 14
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 15
    .line 16
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    if-eqz p0, :cond_c

    .line 21
    .line 22
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 23
    .line 24
    iget-object v1, v1, Lmj0;->f:Loe0;

    .line 25
    .line 26
    iget v1, v1, Loe0;->g:I

    .line 27
    .line 28
    const/high16 v2, 0x40000

    .line 29
    .line 30
    and-int/2addr v1, v2

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v1, :cond_a

    .line 33
    .line 34
    :goto_1
    if-eqz v0, :cond_a

    .line 35
    .line 36
    iget v1, v0, Loe0;->f:I

    .line 37
    .line 38
    and-int/2addr v1, v2

    .line 39
    if-eqz v1, :cond_9

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    move-object v4, v3

    .line 43
    :goto_2
    if-eqz v1, :cond_9

    .line 44
    .line 45
    instance-of v5, v1, Lh91;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    check-cast v1, Lh91;

    .line 51
    .line 52
    invoke-interface {v1}, Lh91;->k()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    invoke-interface {p2, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    :cond_1
    if-nez v6, :cond_8

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_2
    iget v5, v1, Loe0;->f:I

    .line 76
    .line 77
    and-int/2addr v5, v2

    .line 78
    if-eqz v5, :cond_8

    .line 79
    .line 80
    instance-of v5, v1, Lsm;

    .line 81
    .line 82
    if-eqz v5, :cond_8

    .line 83
    .line 84
    move-object v5, v1

    .line 85
    check-cast v5, Lsm;

    .line 86
    .line 87
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    :goto_3
    if-eqz v5, :cond_7

    .line 91
    .line 92
    iget v8, v5, Loe0;->f:I

    .line 93
    .line 94
    and-int/2addr v8, v2

    .line 95
    if-eqz v8, :cond_6

    .line 96
    .line 97
    add-int/lit8 v7, v7, 0x1

    .line 98
    .line 99
    if-ne v7, v6, :cond_3

    .line 100
    .line 101
    move-object v1, v5

    .line 102
    goto :goto_4

    .line 103
    :cond_3
    if-nez v4, :cond_4

    .line 104
    .line 105
    new-instance v4, Lsh0;

    .line 106
    .line 107
    const/16 v8, 0x10

    .line 108
    .line 109
    new-array v8, v8, [Loe0;

    .line 110
    .line 111
    invoke-direct {v4, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    if-eqz v1, :cond_5

    .line 115
    .line 116
    invoke-virtual {v4, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v1, v3

    .line 120
    :cond_5
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_6
    :goto_4
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    if-ne v7, v6, :cond_8

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_8
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_2

    .line 134
    :cond_9
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_a
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_b

    .line 142
    .line 143
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_b
    move-object v0, v3

    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_c
    :goto_5
    return-void
.end method

.method public static final E(Lrm;Ljava/lang/String;Lsw;)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Loe0;

    .line 3
    .line 4
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 5
    .line 6
    iget-boolean v0, v0, Loe0;->q:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 11
    .line 12
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v0, Lsh0;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    new-array v2, v1, [Loe0;

    .line 20
    .line 21
    invoke-direct {v0, v2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    check-cast p0, Loe0;

    .line 25
    .line 26
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 27
    .line 28
    iget-object v2, p0, Loe0;->i:Loe0;

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-static {v0, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    iget p0, v0, Lsh0;->f:I

    .line 40
    .line 41
    if-eqz p0, :cond_e

    .line 42
    .line 43
    add-int/lit8 p0, p0, -0x1

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lsh0;->k(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Loe0;

    .line 50
    .line 51
    iget v2, p0, Loe0;->g:I

    .line 52
    .line 53
    const/high16 v3, 0x40000

    .line 54
    .line 55
    and-int/2addr v2, v3

    .line 56
    if-eqz v2, :cond_d

    .line 57
    .line 58
    move-object v2, p0

    .line 59
    :goto_1
    if-eqz v2, :cond_d

    .line 60
    .line 61
    iget-boolean v4, v2, Loe0;->q:Z

    .line 62
    .line 63
    if-eqz v4, :cond_d

    .line 64
    .line 65
    iget v4, v2, Loe0;->f:I

    .line 66
    .line 67
    and-int/2addr v4, v3

    .line 68
    if-eqz v4, :cond_c

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    move-object v5, v2

    .line 72
    move-object v6, v4

    .line 73
    :goto_2
    if-eqz v5, :cond_c

    .line 74
    .line 75
    instance-of v7, v5, Lh91;

    .line 76
    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    check-cast v5, Lh91;

    .line 80
    .line 81
    invoke-interface {v5}, Lh91;->k()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_3

    .line 90
    .line 91
    invoke-interface {p2, v5}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lg91;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    sget-object v5, Lg91;->d:Lg91;

    .line 99
    .line 100
    :goto_3
    sget-object v7, Lg91;->f:Lg91;

    .line 101
    .line 102
    if-ne v5, v7, :cond_4

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_4
    sget-object v7, Lg91;->e:Lg91;

    .line 106
    .line 107
    if-eq v5, v7, :cond_2

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_5
    iget v7, v5, Loe0;->f:I

    .line 111
    .line 112
    and-int/2addr v7, v3

    .line 113
    if-eqz v7, :cond_b

    .line 114
    .line 115
    instance-of v7, v5, Lsm;

    .line 116
    .line 117
    if-eqz v7, :cond_b

    .line 118
    .line 119
    move-object v7, v5

    .line 120
    check-cast v7, Lsm;

    .line 121
    .line 122
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    :goto_4
    const/4 v9, 0x1

    .line 126
    if-eqz v7, :cond_a

    .line 127
    .line 128
    iget v10, v7, Loe0;->f:I

    .line 129
    .line 130
    and-int/2addr v10, v3

    .line 131
    if-eqz v10, :cond_9

    .line 132
    .line 133
    add-int/lit8 v8, v8, 0x1

    .line 134
    .line 135
    if-ne v8, v9, :cond_6

    .line 136
    .line 137
    move-object v5, v7

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    if-nez v6, :cond_7

    .line 140
    .line 141
    new-instance v6, Lsh0;

    .line 142
    .line 143
    new-array v9, v1, [Loe0;

    .line 144
    .line 145
    invoke-direct {v6, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    if-eqz v5, :cond_8

    .line 149
    .line 150
    invoke-virtual {v6, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    move-object v5, v4

    .line 154
    :cond_8
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_9
    :goto_5
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_a
    if-ne v8, v9, :cond_b

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_b
    :goto_6
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    goto :goto_2

    .line 168
    :cond_c
    iget-object v2, v2, Loe0;->i:Loe0;

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_d
    invoke-static {v0, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_e
    :goto_7
    return-void
.end method

.method public static final F(Lh91;Lsw;)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Loe0;

    .line 3
    .line 4
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 5
    .line 6
    iget-boolean v0, v0, Loe0;->q:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 11
    .line 12
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v0, Lsh0;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    new-array v2, v1, [Loe0;

    .line 20
    .line 21
    invoke-direct {v0, v2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object v2, p0

    .line 25
    check-cast v2, Loe0;

    .line 26
    .line 27
    iget-object v2, v2, Loe0;->d:Loe0;

    .line 28
    .line 29
    iget-object v3, v2, Loe0;->i:Loe0;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    invoke-static {v0, v2}, Lpf1;->e(Lsh0;Loe0;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    iget v2, v0, Lsh0;->f:I

    .line 41
    .line 42
    if-eqz v2, :cond_e

    .line 43
    .line 44
    add-int/lit8 v2, v2, -0x1

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Lsh0;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Loe0;

    .line 51
    .line 52
    iget v3, v2, Loe0;->g:I

    .line 53
    .line 54
    const/high16 v4, 0x40000

    .line 55
    .line 56
    and-int/2addr v3, v4

    .line 57
    if-eqz v3, :cond_d

    .line 58
    .line 59
    move-object v3, v2

    .line 60
    :goto_1
    if-eqz v3, :cond_d

    .line 61
    .line 62
    iget-boolean v5, v3, Loe0;->q:Z

    .line 63
    .line 64
    if-eqz v5, :cond_d

    .line 65
    .line 66
    iget v5, v3, Loe0;->f:I

    .line 67
    .line 68
    and-int/2addr v5, v4

    .line 69
    if-eqz v5, :cond_c

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    move-object v6, v3

    .line 73
    move-object v7, v5

    .line 74
    :goto_2
    if-eqz v6, :cond_c

    .line 75
    .line 76
    instance-of v8, v6, Lh91;

    .line 77
    .line 78
    if-eqz v8, :cond_5

    .line 79
    .line 80
    check-cast v6, Lh91;

    .line 81
    .line 82
    invoke-interface {p0}, Lh91;->k()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-interface {v6}, Lh91;->k()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v8, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    if-ne v8, v9, :cond_3

    .line 105
    .line 106
    invoke-interface {p1, v6}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Lg91;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    sget-object v6, Lg91;->d:Lg91;

    .line 114
    .line 115
    :goto_3
    sget-object v8, Lg91;->f:Lg91;

    .line 116
    .line 117
    if-ne v6, v8, :cond_4

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_4
    sget-object v8, Lg91;->e:Lg91;

    .line 121
    .line 122
    if-eq v6, v8, :cond_2

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_5
    iget v8, v6, Loe0;->f:I

    .line 126
    .line 127
    and-int/2addr v8, v4

    .line 128
    if-eqz v8, :cond_b

    .line 129
    .line 130
    instance-of v8, v6, Lsm;

    .line 131
    .line 132
    if-eqz v8, :cond_b

    .line 133
    .line 134
    move-object v8, v6

    .line 135
    check-cast v8, Lsm;

    .line 136
    .line 137
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 138
    .line 139
    const/4 v9, 0x0

    .line 140
    :goto_4
    const/4 v10, 0x1

    .line 141
    if-eqz v8, :cond_a

    .line 142
    .line 143
    iget v11, v8, Loe0;->f:I

    .line 144
    .line 145
    and-int/2addr v11, v4

    .line 146
    if-eqz v11, :cond_9

    .line 147
    .line 148
    add-int/lit8 v9, v9, 0x1

    .line 149
    .line 150
    if-ne v9, v10, :cond_6

    .line 151
    .line 152
    move-object v6, v8

    .line 153
    goto :goto_5

    .line 154
    :cond_6
    if-nez v7, :cond_7

    .line 155
    .line 156
    new-instance v7, Lsh0;

    .line 157
    .line 158
    new-array v10, v1, [Loe0;

    .line 159
    .line 160
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    if-eqz v6, :cond_8

    .line 164
    .line 165
    invoke-virtual {v7, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move-object v6, v5

    .line 169
    :cond_8
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_5
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_a
    if-ne v9, v10, :cond_b

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_b
    :goto_6
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    goto :goto_2

    .line 183
    :cond_c
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_d
    invoke-static {v0, v2}, Lpf1;->e(Lsh0;Loe0;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_e
    :goto_7
    return-void
.end method

.method public static final G(J)D
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    ushr-long v0, p0, v0

    .line 4
    .line 5
    long-to-double v0, v0

    .line 6
    const-wide/high16 v2, 0x40a0000000000000L    # 2048.0

    .line 7
    .line 8
    mul-double/2addr v0, v2

    .line 9
    const-wide/16 v2, 0x7ff

    .line 10
    .line 11
    and-long/2addr p0, v2

    .line 12
    long-to-double p0, p0

    .line 13
    add-double/2addr v0, p0

    .line 14
    return-wide v0
.end method

.method public static final a(Lkm;Lpe0;Ljn0;Ln2;Lga;Lf21;ZLaj0;Ln2;Lj5;Lmh;Lji;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p11

    .line 4
    .line 5
    check-cast v11, Lpi;

    .line 6
    .line 7
    const v0, 0x6eeaae29

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v0}, Lpi;->X(I)Lpi;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v11, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x4

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    :goto_0
    or-int v0, p12, v0

    .line 24
    .line 25
    move-object/from16 v3, p1

    .line 26
    .line 27
    invoke-virtual {v11, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v4, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v4

    .line 39
    const v4, 0x365b6d80

    .line 40
    .line 41
    .line 42
    or-int/2addr v0, v4

    .line 43
    const v4, 0x12492493

    .line 44
    .line 45
    .line 46
    and-int/2addr v4, v0

    .line 47
    const v5, 0x12492492

    .line 48
    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    const/4 v7, 0x0

    .line 52
    if-ne v4, v5, :cond_2

    .line 53
    .line 54
    move v4, v7

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v4, v6

    .line 57
    :goto_2
    and-int/lit8 v5, v0, 0x1

    .line 58
    .line 59
    invoke-virtual {v11, v5, v4}, Lpi;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_f

    .line 64
    .line 65
    invoke-virtual {v11}, Lpi;->T()V

    .line 66
    .line 67
    .line 68
    and-int/lit8 v4, p12, 0x1

    .line 69
    .line 70
    const v5, -0x1c00001

    .line 71
    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v11}, Lpi;->y()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    invoke-virtual {v11}, Lpi;->R()V

    .line 83
    .line 84
    .line 85
    and-int/2addr v0, v5

    .line 86
    move-object/from16 v2, p2

    .line 87
    .line 88
    move-object/from16 v6, p3

    .line 89
    .line 90
    move-object/from16 v8, p4

    .line 91
    .line 92
    move-object/from16 v3, p5

    .line 93
    .line 94
    move/from16 v4, p6

    .line 95
    .line 96
    move-object/from16 v7, p7

    .line 97
    .line 98
    move-object/from16 v9, p8

    .line 99
    .line 100
    move-object/from16 v5, p9

    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_4
    :goto_3
    new-instance v4, Lln0;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    invoke-direct {v4, v8, v8, v8, v8}, Lln0;-><init>(FFFF)V

    .line 108
    .line 109
    .line 110
    sget-object v9, Ln2;->O:Ln2;

    .line 111
    .line 112
    sget-object v10, Ln2;->o:Lga;

    .line 113
    .line 114
    and-int/lit8 v12, v0, 0xe

    .line 115
    .line 116
    const/high16 v13, 0x30000

    .line 117
    .line 118
    or-int/2addr v12, v13

    .line 119
    new-instance v13, Ldo0;

    .line 120
    .line 121
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-static {v11}, Lm31;->a(Lji;)Lml;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    sget-object v15, Lxc1;->a:Ljava/util/Map;

    .line 129
    .line 130
    const/high16 v15, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    move/from16 p11, v5

    .line 137
    .line 138
    const/high16 v5, 0x43c80000    # 400.0f

    .line 139
    .line 140
    invoke-static {v8, v5, v15, v6}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    sget-object v8, Ldj;->h:Lg41;

    .line 145
    .line 146
    invoke-virtual {v11, v8}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Lym;

    .line 151
    .line 152
    sget-object v15, Ldj;->n:Lg41;

    .line 153
    .line 154
    invoke-virtual {v11, v15}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    check-cast v15, Lk50;

    .line 159
    .line 160
    and-int/lit8 v16, v12, 0xe

    .line 161
    .line 162
    xor-int/lit8 v6, v16, 0x6

    .line 163
    .line 164
    if-le v6, v2, :cond_5

    .line 165
    .line 166
    invoke-virtual {v11, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-nez v6, :cond_6

    .line 171
    .line 172
    :cond_5
    and-int/lit8 v6, v12, 0x6

    .line 173
    .line 174
    if-ne v6, v2, :cond_7

    .line 175
    .line 176
    :cond_6
    const/4 v6, 0x1

    .line 177
    goto :goto_4

    .line 178
    :cond_7
    move v6, v7

    .line 179
    :goto_4
    invoke-virtual {v11, v14}, Lpi;->f(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    or-int/2addr v6, v12

    .line 184
    invoke-virtual {v11, v5}, Lpi;->f(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    or-int/2addr v6, v12

    .line 189
    invoke-virtual {v11, v13}, Lpi;->f(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    or-int/2addr v6, v12

    .line 194
    invoke-virtual {v11, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    or-int/2addr v6, v8

    .line 199
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    invoke-virtual {v11, v8}, Lpi;->d(I)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    or-int/2addr v6, v8

    .line 208
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    sget-object v12, Lii;->a:Lr3;

    .line 213
    .line 214
    if-nez v6, :cond_8

    .line 215
    .line 216
    if-ne v8, v12, :cond_9

    .line 217
    .line 218
    :cond_8
    new-instance v6, Lqn0;

    .line 219
    .line 220
    invoke-direct {v6, v7, v1, v15}, Lqn0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    new-instance v8, Leo0;

    .line 224
    .line 225
    invoke-direct {v8, v1, v6, v13}, Leo0;-><init>(Lkm;Lqn0;Ldo0;)V

    .line 226
    .line 227
    .line 228
    new-instance v6, Lf21;

    .line 229
    .line 230
    invoke-direct {v6, v8, v14, v5}, Lf21;-><init>(Lj21;Lml;Lo31;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v8, v6

    .line 237
    :cond_9
    move-object v5, v8

    .line 238
    check-cast v5, Lf21;

    .line 239
    .line 240
    and-int v6, v0, p11

    .line 241
    .line 242
    and-int/lit8 v0, v0, 0xe

    .line 243
    .line 244
    or-int/lit16 v0, v0, 0x1b0

    .line 245
    .line 246
    and-int/lit8 v8, v0, 0xe

    .line 247
    .line 248
    xor-int/lit8 v8, v8, 0x6

    .line 249
    .line 250
    if-le v8, v2, :cond_a

    .line 251
    .line 252
    invoke-virtual {v11, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    if-nez v8, :cond_b

    .line 257
    .line 258
    :cond_a
    and-int/lit8 v0, v0, 0x6

    .line 259
    .line 260
    if-ne v0, v2, :cond_c

    .line 261
    .line 262
    :cond_b
    const/4 v7, 0x1

    .line 263
    :cond_c
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    if-nez v7, :cond_d

    .line 268
    .line 269
    if-ne v0, v12, :cond_e

    .line 270
    .line 271
    :cond_d
    new-instance v0, Ljm;

    .line 272
    .line 273
    invoke-direct {v0, v1}, Ljm;-><init>(Lkm;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v11, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_e
    check-cast v0, Ljm;

    .line 280
    .line 281
    sget-object v2, Ln2;->T:Ln2;

    .line 282
    .line 283
    invoke-static {v11}, Lbn0;->a(Lji;)Lj5;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    move-object v3, v5

    .line 288
    move-object v5, v7

    .line 289
    move-object v8, v10

    .line 290
    move-object v7, v0

    .line 291
    move v0, v6

    .line 292
    move-object v6, v9

    .line 293
    move-object v9, v2

    .line 294
    move-object v2, v4

    .line 295
    const/4 v4, 0x1

    .line 296
    :goto_5
    invoke-virtual {v11}, Lpi;->q()V

    .line 297
    .line 298
    .line 299
    shr-int/lit8 v10, v0, 0x3

    .line 300
    .line 301
    and-int/lit8 v10, v10, 0xe

    .line 302
    .line 303
    or-int/lit16 v10, v10, 0x6000

    .line 304
    .line 305
    shl-int/lit8 v0, v0, 0x3

    .line 306
    .line 307
    and-int/lit8 v0, v0, 0x70

    .line 308
    .line 309
    or-int/2addr v0, v10

    .line 310
    const v10, 0x36180d80

    .line 311
    .line 312
    .line 313
    or-int v12, v0, v10

    .line 314
    .line 315
    const v13, 0x1b6d86

    .line 316
    .line 317
    .line 318
    move-object/from16 v0, p1

    .line 319
    .line 320
    move-object/from16 v10, p10

    .line 321
    .line 322
    invoke-static/range {v0 .. v13}, Lw60;->b(Lpe0;Lkm;Ljn0;Lf21;ZLj5;Ln2;Laj0;Lga;Ln2;Lmh;Lji;II)V

    .line 323
    .line 324
    .line 325
    move-object v10, v5

    .line 326
    move-object v5, v8

    .line 327
    move-object v8, v7

    .line 328
    move v7, v4

    .line 329
    move-object v4, v6

    .line 330
    move-object v6, v3

    .line 331
    move-object v3, v2

    .line 332
    goto :goto_6

    .line 333
    :cond_f
    invoke-virtual {v11}, Lpi;->R()V

    .line 334
    .line 335
    .line 336
    move-object/from16 v3, p2

    .line 337
    .line 338
    move-object/from16 v4, p3

    .line 339
    .line 340
    move-object/from16 v5, p4

    .line 341
    .line 342
    move-object/from16 v6, p5

    .line 343
    .line 344
    move/from16 v7, p6

    .line 345
    .line 346
    move-object/from16 v8, p7

    .line 347
    .line 348
    move-object/from16 v9, p8

    .line 349
    .line 350
    move-object/from16 v10, p9

    .line 351
    .line 352
    :goto_6
    invoke-virtual {v11}, Lpi;->r()Lht0;

    .line 353
    .line 354
    .line 355
    move-result-object v13

    .line 356
    if-eqz v13, :cond_10

    .line 357
    .line 358
    new-instance v0, Lsn0;

    .line 359
    .line 360
    move-object/from16 v1, p0

    .line 361
    .line 362
    move-object/from16 v2, p1

    .line 363
    .line 364
    move-object/from16 v11, p10

    .line 365
    .line 366
    move/from16 v12, p12

    .line 367
    .line 368
    invoke-direct/range {v0 .. v12}, Lsn0;-><init>(Lkm;Lpe0;Ljn0;Ln2;Lga;Lf21;ZLaj0;Ln2;Lj5;Lmh;I)V

    .line 369
    .line 370
    .line 371
    iput-object v0, v13, Lht0;->d:Lww;

    .line 372
    .line 373
    :cond_10
    return-void
.end method

.method public static final b(Lhw;Lpe0;Ld80;Lr70;Lji;I)V
    .locals 7

    .line 1
    check-cast p4, Lpi;

    .line 2
    .line 3
    const v0, 0x3ee63d6d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p5

    .line 19
    invoke-virtual {p4, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    invoke-virtual {p4, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const/16 v1, 0x100

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v1, 0x80

    .line 41
    .line 42
    :goto_2
    or-int/2addr v0, v1

    .line 43
    invoke-virtual {p4, p3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/16 v1, 0x800

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/16 v1, 0x400

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    and-int/lit16 v1, v0, 0x493

    .line 56
    .line 57
    const/16 v2, 0x492

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    if-eq v1, v2, :cond_4

    .line 61
    .line 62
    move v1, v3

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/4 v1, 0x0

    .line 65
    :goto_4
    and-int/2addr v0, v3

    .line 66
    invoke-virtual {p4, v0, v1}, Lpi;->O(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-static {p0, p4}, Lr60;->z(Ljava/lang/Object;Lji;)Loh0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Lp70;

    .line 77
    .line 78
    invoke-direct {v1, p2, p1, p3, v0}, Lp70;-><init>(Ld80;Lpe0;Lr70;Loh0;)V

    .line 79
    .line 80
    .line 81
    const v0, -0x379ecb6b

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1, p4}, Lkl;->w(ILex;Lji;)Lmh;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/4 v1, 0x6

    .line 89
    invoke-static {v0, p4, v1}, Lv50;->a(Lmh;Lji;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-virtual {p4}, Lpi;->R()V

    .line 94
    .line 95
    .line 96
    :goto_5
    invoke-virtual {p4}, Lpi;->r()Lht0;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-eqz p4, :cond_6

    .line 101
    .line 102
    new-instance v0, Ln00;

    .line 103
    .line 104
    const/4 v6, 0x1

    .line 105
    move-object v1, p0

    .line 106
    move-object v2, p1

    .line 107
    move-object v3, p2

    .line 108
    move-object v4, p3

    .line 109
    move v5, p5

    .line 110
    invoke-direct/range {v0 .. v6}, Ln00;-><init>(Ljava/lang/Object;Lpe0;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p4, Lht0;->d:Lww;

    .line 114
    .line 115
    :cond_6
    return-void
.end method

.method public static final c(JLs71;Lww;Lji;I)V
    .locals 6

    .line 1
    check-cast p4, Lpi;

    .line 2
    .line 3
    const v0, -0x28d355e8

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p0, p1}, Lpi;->e(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p5

    .line 19
    invoke-virtual {p4, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    and-int/lit16 v1, p5, 0x180

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {p4, p3}, Lpi;->h(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const/16 v1, 0x100

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v1, 0x80

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v1

    .line 47
    :cond_3
    and-int/lit16 v1, v0, 0x93

    .line 48
    .line 49
    const/16 v2, 0x92

    .line 50
    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/4 v1, 0x0

    .line 56
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 57
    .line 58
    invoke-virtual {p4, v2, v1}, Lpi;->O(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    sget-object v1, Ld71;->a:Lej;

    .line 65
    .line 66
    invoke-virtual {p4, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ls71;

    .line 71
    .line 72
    invoke-virtual {v2, p2}, Ls71;->c(Ls71;)Ls71;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v3, Lxj;->a:Lej;

    .line 77
    .line 78
    new-instance v4, Lff;

    .line 79
    .line 80
    invoke-direct {v4, p0, p1}, Lff;-><init>(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v4}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v1, v2}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    filled-new-array {v3, v1}, [Lct0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    shr-int/lit8 v0, v0, 0x3

    .line 96
    .line 97
    and-int/lit8 v0, v0, 0x70

    .line 98
    .line 99
    const/16 v2, 0x8

    .line 100
    .line 101
    or-int/2addr v0, v2

    .line 102
    invoke-static {v1, p3, p4, v0}, Li4;->c([Lct0;Lww;Lji;I)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    invoke-virtual {p4}, Lpi;->R()V

    .line 107
    .line 108
    .line 109
    :goto_4
    invoke-virtual {p4}, Lpi;->r()Lht0;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    if-eqz p4, :cond_6

    .line 114
    .line 115
    new-instance v0, Lbt0;

    .line 116
    .line 117
    move-wide v1, p0

    .line 118
    move-object v3, p2

    .line 119
    move-object v4, p3

    .line 120
    move v5, p5

    .line 121
    invoke-direct/range {v0 .. v5}, Lbt0;-><init>(JLs71;Lww;I)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p4, Lht0;->d:Lww;

    .line 125
    .line 126
    :cond_6
    return-void
.end method

.method public static final d(II)J
    .locals 4

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "start and end cannot be negative. [start: "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", end: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x5d

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    int-to-long v0, p0

    .line 37
    const/16 p0, 0x20

    .line 38
    .line 39
    shl-long/2addr v0, p0

    .line 40
    int-to-long p0, p1

    .line 41
    const-wide v2, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr p0, v2

    .line 47
    or-long/2addr p0, v0

    .line 48
    sget v0, Ll71;->c:I

    .line 49
    .line 50
    return-wide p0
.end method

.method public static final e(F)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    cmpg-float p0, p0, v0

    .line 14
    .line 15
    if-gez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final f(Lqb1;Lnr0;J)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, Lqb1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lpm;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v4, v1, Lpm;->b:Ltb1;

    .line 15
    .line 16
    iget-object v5, v1, Lpm;->a:Ltb1;

    .line 17
    .line 18
    invoke-static {v0}, Lw60;->i(Lnr0;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-wide v7, v0, Lnr0;->b:J

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    iget-object v6, v5, Ltb1;->d:[Lil;

    .line 31
    .line 32
    array-length v13, v6

    .line 33
    invoke-static {v6, v12, v13, v11}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput v12, v5, Ltb1;->e:I

    .line 37
    .line 38
    iget-object v6, v4, Ltb1;->d:[Lil;

    .line 39
    .line 40
    array-length v13, v6

    .line 41
    invoke-static {v6, v12, v13, v11}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput v12, v4, Ltb1;->e:I

    .line 45
    .line 46
    iput-wide v9, v1, Lpm;->c:J

    .line 47
    .line 48
    :cond_0
    invoke-static {v0}, Lw60;->k(Lnr0;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    iget-object v6, v0, Lnr0;->k:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v6, :cond_1

    .line 57
    .line 58
    sget-object v6, Lhs;->d:Lhs;

    .line 59
    .line 60
    :cond_1
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    move v14, v12

    .line 65
    :goto_0
    if-ge v14, v13, :cond_2

    .line 66
    .line 67
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    check-cast v15, Lly;

    .line 72
    .line 73
    iget-wide v9, v15, Lly;->a:J

    .line 74
    .line 75
    iget-wide v11, v15, Lly;->c:J

    .line 76
    .line 77
    invoke-static {v11, v12, v2, v3}, Lok0;->e(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v11

    .line 81
    invoke-virtual {v1, v9, v10, v11, v12}, Lpm;->a(JJ)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v14, v14, 0x1

    .line 85
    .line 86
    const-wide/16 v9, 0x0

    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    iget-wide v9, v0, Lnr0;->l:J

    .line 92
    .line 93
    invoke-static {v9, v10, v2, v3}, Lok0;->e(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    invoke-virtual {v1, v7, v8, v2, v3}, Lpm;->a(JJ)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-static {v0}, Lw60;->k(Lnr0;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-wide v2, v1, Lpm;->c:J

    .line 107
    .line 108
    sub-long v2, v7, v2

    .line 109
    .line 110
    const-wide/16 v9, 0x28

    .line 111
    .line 112
    cmp-long v0, v2, v9

    .line 113
    .line 114
    if-lez v0, :cond_4

    .line 115
    .line 116
    iget-object v0, v5, Ltb1;->d:[Lil;

    .line 117
    .line 118
    array-length v2, v0

    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-static {v0, v6, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iput v6, v5, Ltb1;->e:I

    .line 125
    .line 126
    iget-object v0, v4, Ltb1;->d:[Lil;

    .line 127
    .line 128
    array-length v2, v0

    .line 129
    invoke-static {v0, v6, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput v6, v4, Ltb1;->e:I

    .line 133
    .line 134
    const-wide/16 v2, 0x0

    .line 135
    .line 136
    iput-wide v2, v1, Lpm;->c:J

    .line 137
    .line 138
    :cond_4
    iput-wide v7, v1, Lpm;->c:J

    .line 139
    .line 140
    return-void
.end method

.method public static final g(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    .line 6
    .line 7
    invoke-static {v0, p0}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static h()[F
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static i(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;
    .locals 1

    if-ltz p3, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    const-string v0, "invalid start value"

    .line 2
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p3, :cond_1

    if-gt p3, v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "invalid end value"

    .line 4
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    :goto_1
    if-ltz p6, :cond_2

    goto :goto_2

    .line 5
    :cond_2
    const-string v0, "invalid maxLines value"

    .line 6
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    :goto_2
    if-ltz p2, :cond_3

    goto :goto_3

    .line 7
    :cond_3
    const-string v0, "invalid width value"

    .line 8
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    :goto_3
    if-ltz p8, :cond_4

    goto :goto_4

    .line 9
    :cond_4
    const-string v0, "invalid ellipsizedWidth value"

    .line 10
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    :goto_4
    const/4 v0, 0x0

    .line 11
    invoke-static {p0, v0, p3, p1, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p4}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 13
    invoke-virtual {p0, p5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 14
    invoke-virtual {p0, p6}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 15
    invoke-virtual {p0, p7}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 16
    invoke-virtual {p0, p8}, Landroid/text/StaticLayout$Builder;->setEllipsizedWidth(I)Landroid/text/StaticLayout$Builder;

    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 18
    invoke-virtual {p0, p10}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 19
    invoke-virtual {p0, p11}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 20
    invoke-virtual {p0, p14}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1, p1}, Landroid/text/StaticLayout$Builder;->setIndents([I[I)Landroid/text/StaticLayout$Builder;

    .line 22
    invoke-virtual {p0, p9}, Landroid/text/StaticLayout$Builder;->setJustificationMode(I)Landroid/text/StaticLayout$Builder;

    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Landroid/text/StaticLayout$Builder;->setUseLineSpacingFromFallbacks(Z)Landroid/text/StaticLayout$Builder;

    .line 24
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_5

    .line 25
    invoke-static {}, Lz0;->a()Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object p2

    .line 26
    invoke-static {p2, p12}, Lz0;->b(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object p2

    .line 27
    invoke-static {p2, p13}, Lz0;->n(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object p2

    .line 28
    invoke-static {p2}, Lz0;->c(Landroid/graphics/text/LineBreakConfig$Builder;)Landroid/graphics/text/LineBreakConfig;

    move-result-object p2

    .line 29
    invoke-static {p0, p2}, Lz0;->i(Landroid/text/StaticLayout$Builder;Landroid/graphics/text/LineBreakConfig;)V

    :cond_5
    const/16 p2, 0x23

    if-lt p1, p2, :cond_6

    .line 30
    invoke-static {p0}, Luq0;->c(Landroid/text/StaticLayout$Builder;)V

    .line 31
    :cond_6
    invoke-virtual {p0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/os/Bundle;Landroid/os/Bundle;)Ldx0;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    :cond_0
    if-nez p0, :cond_1

    .line 5
    .line 6
    new-instance p0, Ldx0;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lr9;

    .line 17
    .line 18
    sget-object v0, Lis;->d:Lis;

    .line 19
    .line 20
    invoke-direct {p1, v0}, Lr9;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldx0;->a:Lr9;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    const-class p1, Ldx0;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-instance v0, Lfd0;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Lfd0;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Lfd0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v0}, Lfd0;->b()V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    iput-boolean p0, v0, Lfd0;->p:Z

    .line 83
    .line 84
    iget p0, v0, Lfd0;->l:I

    .line 85
    .line 86
    if-lez p0, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    sget-object v0, Lfd0;->q:Lfd0;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :goto_1
    new-instance p0, Ldx0;

    .line 95
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance p1, Lr9;

    .line 105
    .line 106
    invoke-direct {p1, v0}, Lr9;-><init>(Ljava/util/Map;)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Ldx0;->a:Lr9;

    .line 110
    .line 111
    return-object p0
.end method

.method public static final k()Lsh0;
    .locals 3

    .line 1
    sget-object v0, Lz21;->b:Lo8;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo8;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lsh0;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lsh0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [Loi;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lo8;->m(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final l(Ln2;Lhw;)Ldn;
    .locals 1

    .line 1
    sget-object v0, Lz21;->a:Lo8;

    .line 2
    .line 3
    new-instance v0, Ldn;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Ldn;-><init>(Ln2;Lhw;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final m(Lhw;)Ldn;
    .locals 2

    .line 1
    sget-object v0, Lz21;->a:Lo8;

    .line 2
    .line 3
    new-instance v0, Ldn;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1, p0}, Ldn;-><init>(Ln2;Lhw;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final n([F[F)F
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    mul-float/2addr v3, v4

    .line 11
    add-float/2addr v1, v3

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1
.end method

.method public static final o(JZIF)J
    .locals 0

    .line 1
    if-nez p2, :cond_2

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    if-ne p3, p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x4

    .line 8
    if-ne p3, p2, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p2, 0x5

    .line 12
    if-ne p3, p2, :cond_3

    .line 13
    .line 14
    :cond_2
    :goto_0
    invoke-static {p0, p1}, Lpj;->d(J)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_3

    .line 19
    .line 20
    invoke-static {p0, p1}, Lpj;->h(J)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const p2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {p0, p1}, Lpj;->j(J)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-ne p3, p2, :cond_4

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_4
    invoke-static {p4}, Lv50;->e(F)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-static {p0, p1}, Lpj;->j(J)I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    invoke-static {p3, p4, p2}, Lw60;->n(III)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    :goto_2
    invoke-static {p0, p1}, Lpj;->g(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-static {p1, p2, p1, p0}, Lo30;->o(IIII)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    return-wide p0
.end method

.method public static final p(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final q(J)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/high16 v2, 0x40000000    # 2.0f

    .line 11
    .line 12
    div-float/2addr v1, v2

    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v3

    .line 19
    long-to-int p0, p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    div-float/2addr p0, v2

    .line 25
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long v1, p1

    .line 30
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-long p0, p0

    .line 35
    shl-long v0, v1, v0

    .line 36
    .line 37
    and-long/2addr p0, v3

    .line 38
    or-long/2addr p0, v0

    .line 39
    return-wide p0
.end method

.method public static final r()Lr00;
    .locals 7

    .line 1
    sget-object v0, Lr60;->a:Lr00;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lq00;

    .line 7
    .line 8
    const-string v1, "Filled.Warning"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lq00;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget v1, Lib1;->a:I

    .line 14
    .line 15
    new-instance v1, Lg31;

    .line 16
    .line 17
    sget-wide v2, Lff;->b:J

    .line 18
    .line 19
    invoke-direct {v1, v2, v3}, Lg31;-><init>(J)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lx1;

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lx1;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/high16 v3, 0x3f800000    # 1.0f

    .line 30
    .line 31
    const/high16 v4, 0x41a80000    # 21.0f

    .line 32
    .line 33
    invoke-virtual {v2, v3, v4}, Lx1;->o(FF)V

    .line 34
    .line 35
    .line 36
    const/high16 v5, 0x41b00000    # 22.0f

    .line 37
    .line 38
    invoke-virtual {v2, v5}, Lx1;->j(F)V

    .line 39
    .line 40
    .line 41
    const/high16 v5, 0x41400000    # 12.0f

    .line 42
    .line 43
    const/high16 v6, 0x40000000    # 2.0f

    .line 44
    .line 45
    invoke-virtual {v2, v5, v6}, Lx1;->m(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lx1;->m(FF)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lx1;->g()V

    .line 52
    .line 53
    .line 54
    const/high16 v3, 0x41900000    # 18.0f

    .line 55
    .line 56
    const/high16 v4, 0x41500000    # 13.0f

    .line 57
    .line 58
    invoke-virtual {v2, v4, v3}, Lx1;->o(FF)V

    .line 59
    .line 60
    .line 61
    const/high16 v3, -0x40000000    # -2.0f

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lx1;->j(F)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Lx1;->v(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v6}, Lx1;->j(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v6}, Lx1;->v(F)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lx1;->g()V

    .line 76
    .line 77
    .line 78
    const/high16 v5, 0x41600000    # 14.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4, v5}, Lx1;->o(FF)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lx1;->j(F)V

    .line 84
    .line 85
    .line 86
    const/high16 v3, -0x3f800000    # -4.0f

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lx1;->v(F)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v6}, Lx1;->j(F)V

    .line 92
    .line 93
    .line 94
    const/high16 v3, 0x40800000    # 4.0f

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Lx1;->v(F)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lx1;->g()V

    .line 100
    .line 101
    .line 102
    iget-object v2, v2, Lx1;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-static {v0, v2, v1}, Lq00;->a(Lq00;Ljava/util/ArrayList;Lg31;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lq00;->b()Lr00;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lr60;->a:Lr00;

    .line 114
    .line 115
    return-object v0
.end method

.method public static final s([FJ)J
    .locals 12

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-wide p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v1, p0, v1

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    aget v2, p0, v2

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    aget v3, p0, v3

    .line 18
    .line 19
    const/4 v4, 0x5

    .line 20
    aget v4, p0, v4

    .line 21
    .line 22
    const/4 v5, 0x7

    .line 23
    aget v5, p0, v5

    .line 24
    .line 25
    const/16 v6, 0xc

    .line 26
    .line 27
    aget v6, p0, v6

    .line 28
    .line 29
    const/16 v7, 0xd

    .line 30
    .line 31
    aget v7, p0, v7

    .line 32
    .line 33
    const/16 v8, 0xf

    .line 34
    .line 35
    aget p0, p0, v8

    .line 36
    .line 37
    const/16 v8, 0x20

    .line 38
    .line 39
    shr-long v9, p1, v8

    .line 40
    .line 41
    long-to-int v9, v9

    .line 42
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const-wide v10, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr p1, v10

    .line 52
    long-to-int p1, p1

    .line 53
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    mul-float/2addr v2, v9

    .line 58
    mul-float/2addr v5, p1

    .line 59
    add-float/2addr v5, v2

    .line 60
    add-float/2addr v5, p0

    .line 61
    const/high16 p0, 0x3f800000    # 1.0f

    .line 62
    .line 63
    div-float/2addr p0, v5

    .line 64
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    const v2, 0x7fffffff

    .line 69
    .line 70
    .line 71
    and-int/2addr p2, v2

    .line 72
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 73
    .line 74
    if-ge p2, v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p0, 0x0

    .line 78
    :goto_0
    mul-float/2addr v0, v9

    .line 79
    mul-float/2addr v3, p1

    .line 80
    add-float/2addr v3, v0

    .line 81
    add-float/2addr v3, v6

    .line 82
    mul-float/2addr v3, p0

    .line 83
    mul-float/2addr v1, v9

    .line 84
    mul-float/2addr v4, p1

    .line 85
    add-float/2addr v4, v1

    .line 86
    add-float/2addr v4, v7

    .line 87
    mul-float/2addr v4, p0

    .line 88
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    int-to-long p0, p0

    .line 93
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    int-to-long v0, p2

    .line 98
    shl-long/2addr p0, v8

    .line 99
    and-long/2addr v0, v10

    .line 100
    or-long/2addr p0, v0

    .line 101
    return-wide p0
.end method

.method public static final t([FLih0;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    aget v2, v0, v2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aget v3, v0, v3

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    aget v4, v0, v4

    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    aget v5, v0, v5

    .line 22
    .line 23
    const/4 v6, 0x5

    .line 24
    aget v6, v0, v6

    .line 25
    .line 26
    const/4 v7, 0x7

    .line 27
    aget v7, v0, v7

    .line 28
    .line 29
    const/16 v8, 0xc

    .line 30
    .line 31
    aget v8, v0, v8

    .line 32
    .line 33
    const/16 v9, 0xd

    .line 34
    .line 35
    aget v9, v0, v9

    .line 36
    .line 37
    const/16 v10, 0xf

    .line 38
    .line 39
    aget v0, v0, v10

    .line 40
    .line 41
    iget v10, v1, Lih0;->a:F

    .line 42
    .line 43
    iget v11, v1, Lih0;->b:F

    .line 44
    .line 45
    iget v12, v1, Lih0;->c:F

    .line 46
    .line 47
    iget v13, v1, Lih0;->d:F

    .line 48
    .line 49
    mul-float v14, v4, v10

    .line 50
    .line 51
    mul-float v15, v7, v11

    .line 52
    .line 53
    add-float v16, v14, v15

    .line 54
    .line 55
    add-float v16, v16, v0

    .line 56
    .line 57
    const/high16 v17, 0x3f800000    # 1.0f

    .line 58
    .line 59
    div-float v16, v17, v16

    .line 60
    .line 61
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v18

    .line 65
    const v19, 0x7fffffff

    .line 66
    .line 67
    .line 68
    move/from16 p0, v0

    .line 69
    .line 70
    and-int v0, v18, v19

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    move/from16 v20, v2

    .line 75
    .line 76
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 77
    .line 78
    if-ge v0, v2, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move/from16 v16, v18

    .line 82
    .line 83
    :goto_0
    mul-float v0, v20, v10

    .line 84
    .line 85
    mul-float v21, v5, v11

    .line 86
    .line 87
    add-float v22, v0, v21

    .line 88
    .line 89
    add-float v22, v22, v8

    .line 90
    .line 91
    mul-float v2, v22, v16

    .line 92
    .line 93
    mul-float/2addr v10, v3

    .line 94
    mul-float/2addr v11, v6

    .line 95
    add-float v22, v10, v11

    .line 96
    .line 97
    add-float v22, v22, v9

    .line 98
    .line 99
    move/from16 v23, v0

    .line 100
    .line 101
    mul-float v0, v22, v16

    .line 102
    .line 103
    mul-float/2addr v7, v13

    .line 104
    add-float/2addr v14, v7

    .line 105
    add-float v14, v14, p0

    .line 106
    .line 107
    div-float v14, v17, v14

    .line 108
    .line 109
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    move/from16 v22, v3

    .line 114
    .line 115
    and-int v3, v16, v19

    .line 116
    .line 117
    move/from16 v16, v4

    .line 118
    .line 119
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 120
    .line 121
    if-ge v3, v4, :cond_2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    move/from16 v14, v18

    .line 125
    .line 126
    :goto_1
    mul-float/2addr v5, v13

    .line 127
    add-float v3, v23, v5

    .line 128
    .line 129
    add-float/2addr v3, v8

    .line 130
    mul-float/2addr v3, v14

    .line 131
    mul-float/2addr v6, v13

    .line 132
    add-float/2addr v10, v6

    .line 133
    add-float/2addr v10, v9

    .line 134
    mul-float/2addr v10, v14

    .line 135
    mul-float v4, v16, v12

    .line 136
    .line 137
    add-float/2addr v15, v4

    .line 138
    add-float v15, v15, p0

    .line 139
    .line 140
    div-float v13, v17, v15

    .line 141
    .line 142
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    and-int v14, v14, v19

    .line 147
    .line 148
    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 149
    .line 150
    if-ge v14, v15, :cond_3

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    move/from16 v13, v18

    .line 154
    .line 155
    :goto_2
    mul-float v14, v20, v12

    .line 156
    .line 157
    add-float v21, v14, v21

    .line 158
    .line 159
    add-float v21, v21, v8

    .line 160
    .line 161
    mul-float v15, v21, v13

    .line 162
    .line 163
    mul-float v12, v12, v22

    .line 164
    .line 165
    add-float/2addr v11, v12

    .line 166
    add-float/2addr v11, v9

    .line 167
    mul-float/2addr v11, v13

    .line 168
    add-float/2addr v4, v7

    .line 169
    add-float v4, v4, p0

    .line 170
    .line 171
    div-float v17, v17, v4

    .line 172
    .line 173
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    and-int v4, v4, v19

    .line 178
    .line 179
    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 180
    .line 181
    if-ge v4, v7, :cond_4

    .line 182
    .line 183
    move/from16 v18, v17

    .line 184
    .line 185
    :cond_4
    add-float/2addr v14, v5

    .line 186
    add-float/2addr v14, v8

    .line 187
    mul-float v14, v14, v18

    .line 188
    .line 189
    add-float/2addr v12, v6

    .line 190
    add-float/2addr v12, v9

    .line 191
    mul-float v12, v12, v18

    .line 192
    .line 193
    invoke-static {v15, v14}, Ljava/lang/Math;->min(FF)F

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    iput v4, v1, Lih0;->a:F

    .line 206
    .line 207
    invoke-static {v11, v12}, Ljava/lang/Math;->min(FF)F

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-static {v10, v4}, Ljava/lang/Math;->min(FF)F

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    iput v4, v1, Lih0;->b:F

    .line 220
    .line 221
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    iput v2, v1, Lih0;->c:F

    .line 234
    .line 235
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-static {v10, v2}, Ljava/lang/Math;->max(FF)F

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    iput v0, v1, Lih0;->d:F

    .line 248
    .line 249
    return-void
.end method

.method public static u(Ljava/lang/Object;)Lgp0;
    .locals 2

    .line 1
    sget-object v0, Ln2;->U:Ln2;

    .line 2
    .line 3
    new-instance v1, Lgp0;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static final v(Loe0;Lhw;)V
    .locals 2

    .line 1
    iget-object v0, p0, Loe0;->j:Lnk0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnk0;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Lmk0;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnk0;-><init>(Lmk0;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Loe0;->j:Lnk0;

    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lpf1;->R(Lrm;)Ldn0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lw3;

    .line 20
    .line 21
    invoke-virtual {p0}, Lw3;->getSnapshotObserver()Lfn0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Lp3;->v:Lp3;

    .line 26
    .line 27
    iget-object p0, p0, Lfn0;->a:Le31;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p1}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final w([F[FI[F)V
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "At least one point must be provided"

    .line 6
    .line 7
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    if-lt v1, v0, :cond_1

    .line 12
    .line 13
    add-int/lit8 v1, v0, -0x1

    .line 14
    .line 15
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    new-array v3, v2, [[F

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v5, v2, :cond_2

    .line 22
    .line 23
    new-array v6, v0, [F

    .line 24
    .line 25
    aput-object v6, v3, v5

    .line 26
    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v5, v4

    .line 31
    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 32
    .line 33
    if-ge v5, v0, :cond_4

    .line 34
    .line 35
    aget-object v7, v3, v4

    .line 36
    .line 37
    aput v6, v7, v5

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    :goto_2
    if-ge v6, v2, :cond_3

    .line 41
    .line 42
    add-int/lit8 v7, v6, -0x1

    .line 43
    .line 44
    aget-object v7, v3, v7

    .line 45
    .line 46
    aget v7, v7, v5

    .line 47
    .line 48
    aget v8, p0, v5

    .line 49
    .line 50
    mul-float/2addr v7, v8

    .line 51
    aget-object v8, v3, v6

    .line 52
    .line 53
    aput v7, v8, v5

    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    new-array v5, v2, [[F

    .line 62
    .line 63
    move v7, v4

    .line 64
    :goto_3
    if-ge v7, v2, :cond_5

    .line 65
    .line 66
    new-array v8, v0, [F

    .line 67
    .line 68
    aput-object v8, v5, v7

    .line 69
    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    new-array v7, v2, [[F

    .line 74
    .line 75
    move v8, v4

    .line 76
    :goto_4
    if-ge v8, v2, :cond_6

    .line 77
    .line 78
    new-array v9, v2, [F

    .line 79
    .line 80
    aput-object v9, v7, v8

    .line 81
    .line 82
    add-int/lit8 v8, v8, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move v8, v4

    .line 86
    :goto_5
    if-ge v8, v2, :cond_d

    .line 87
    .line 88
    aget-object v9, v5, v8

    .line 89
    .line 90
    aget-object v10, v3, v8

    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v10, v4, v9, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    move v10, v4

    .line 102
    :goto_6
    if-ge v10, v8, :cond_8

    .line 103
    .line 104
    aget-object v11, v5, v10

    .line 105
    .line 106
    invoke-static {v9, v11}, Lr60;->n([F[F)F

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    move v13, v4

    .line 111
    :goto_7
    if-ge v13, v0, :cond_7

    .line 112
    .line 113
    aget v14, v9, v13

    .line 114
    .line 115
    aget v15, v11, v13

    .line 116
    .line 117
    mul-float/2addr v15, v12

    .line 118
    sub-float/2addr v14, v15

    .line 119
    aput v14, v9, v13

    .line 120
    .line 121
    add-int/lit8 v13, v13, 0x1

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    invoke-static {v9, v9}, Lr60;->n([F[F)F

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    float-to-double v10, v10

    .line 132
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    double-to-float v10, v10

    .line 137
    const v11, 0x358637bd    # 1.0E-6f

    .line 138
    .line 139
    .line 140
    cmpg-float v12, v10, v11

    .line 141
    .line 142
    if-gez v12, :cond_9

    .line 143
    .line 144
    move v10, v11

    .line 145
    :cond_9
    div-float v10, v6, v10

    .line 146
    .line 147
    move v11, v4

    .line 148
    :goto_8
    if-ge v11, v0, :cond_a

    .line 149
    .line 150
    aget v12, v9, v11

    .line 151
    .line 152
    mul-float/2addr v12, v10

    .line 153
    aput v12, v9, v11

    .line 154
    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_a
    aget-object v10, v7, v8

    .line 159
    .line 160
    move v11, v4

    .line 161
    :goto_9
    if-ge v11, v2, :cond_c

    .line 162
    .line 163
    if-ge v11, v8, :cond_b

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    goto :goto_a

    .line 167
    :cond_b
    aget-object v12, v3, v11

    .line 168
    .line 169
    invoke-static {v9, v12}, Lr60;->n([F[F)F

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    :goto_a
    aput v12, v10, v11

    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_d
    move v0, v1

    .line 182
    :goto_b
    const/4 v2, -0x1

    .line 183
    if-ge v2, v0, :cond_f

    .line 184
    .line 185
    aget-object v2, v5, v0

    .line 186
    .line 187
    move-object/from16 v3, p1

    .line 188
    .line 189
    invoke-static {v2, v3}, Lr60;->n([F[F)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    aget-object v4, v7, v0

    .line 194
    .line 195
    add-int/lit8 v6, v0, 0x1

    .line 196
    .line 197
    if-gt v6, v1, :cond_e

    .line 198
    .line 199
    move v8, v1

    .line 200
    :goto_c
    aget v9, v4, v8

    .line 201
    .line 202
    aget v10, p3, v8

    .line 203
    .line 204
    mul-float/2addr v9, v10

    .line 205
    sub-float/2addr v2, v9

    .line 206
    if-eq v8, v6, :cond_e

    .line 207
    .line 208
    add-int/lit8 v8, v8, -0x1

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_e
    aget v4, v4, v0

    .line 212
    .line 213
    div-float/2addr v2, v4

    .line 214
    aput v2, p3, v0

    .line 215
    .line 216
    add-int/lit8 v0, v0, -0x1

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_f
    return-void
.end method

.method public static final x([Ljava/lang/Object;Lqx0;Lhw;Lji;I)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p3, Lpi;

    .line 2
    .line 3
    iget-wide v0, p3, Lpi;->T:J

    .line 4
    .line 5
    const/16 v2, 0x24

    .line 6
    .line 7
    invoke-static {v2}, Lp30;->q(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lbx0;->a:Lg41;

    .line 21
    .line 22
    invoke-virtual {p3, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v5, v0

    .line 27
    check-cast v5, Lzw0;

    .line 28
    .line 29
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    sget-object v2, Lii;->a:Lr3;

    .line 35
    .line 36
    if-ne v0, v2, :cond_2

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v5, v6}, Lzw0;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p1, v0}, Lqx0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v1

    .line 52
    :goto_0
    if-nez v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p2}, Lhw;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_1
    move-object v7, v0

    .line 59
    new-instance v3, Lvw0;

    .line 60
    .line 61
    move-object v8, p0

    .line 62
    move-object v4, p1

    .line 63
    invoke-direct/range {v3 .. v8}, Lvw0;-><init>(Lqx0;Lzw0;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v0, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v8, p0

    .line 72
    move-object v4, p1

    .line 73
    :goto_1
    check-cast v0, Lvw0;

    .line 74
    .line 75
    iget-object p0, v0, Lvw0;->h:[Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v8, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    iget-object v1, v0, Lvw0;->g:Ljava/lang/Object;

    .line 84
    .line 85
    :cond_3
    if-nez v1, :cond_4

    .line 86
    .line 87
    invoke-interface {p2}, Lhw;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_4
    invoke-virtual {p3, v0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    and-int/lit8 p1, p4, 0x70

    .line 96
    .line 97
    xor-int/lit8 p1, p1, 0x30

    .line 98
    .line 99
    const/16 p2, 0x20

    .line 100
    .line 101
    if-le p1, p2, :cond_5

    .line 102
    .line 103
    invoke-virtual {p3, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    :cond_5
    and-int/lit8 p1, p4, 0x30

    .line 110
    .line 111
    if-ne p1, p2, :cond_7

    .line 112
    .line 113
    :cond_6
    const/4 p1, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_7
    const/4 p1, 0x0

    .line 116
    :goto_2
    or-int/2addr p0, p1

    .line 117
    invoke-virtual {p3, v5}, Lpi;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    or-int/2addr p0, p1

    .line 122
    invoke-virtual {p3, v6}, Lpi;->f(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    or-int/2addr p0, p1

    .line 127
    invoke-virtual {p3, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    or-int/2addr p0, p1

    .line 132
    invoke-virtual {p3, v8}, Lpi;->h(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    or-int/2addr p0, p1

    .line 137
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-nez p0, :cond_9

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    move-object v8, v1

    .line 147
    goto :goto_4

    .line 148
    :cond_9
    :goto_3
    new-instance v3, Llu0;

    .line 149
    .line 150
    move-object v7, v6

    .line 151
    move-object v9, v8

    .line 152
    move-object v8, v1

    .line 153
    move-object v6, v5

    .line 154
    move-object v5, v4

    .line 155
    move-object v4, v0

    .line 156
    invoke-direct/range {v3 .. v9}, Llu0;-><init>(Lvw0;Lqx0;Lzw0;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object p1, v3

    .line 163
    :goto_4
    check-cast p1, Lhw;

    .line 164
    .line 165
    invoke-static {p1, p3}, Ls91;->e(Lhw;Lji;)V

    .line 166
    .line 167
    .line 168
    return-object v8
.end method

.method public static final y([Ljava/lang/Object;Lqx0;Lhw;Lji;I)Ljava/lang/Object;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    shl-int/lit8 p4, p4, 0x3

    .line 7
    .line 8
    and-int/lit16 p4, p4, 0x1c00

    .line 9
    .line 10
    const/16 v0, 0x180

    .line 11
    .line 12
    or-int/2addr p4, v0

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Lr60;->x([Ljava/lang/Object;Lqx0;Lhw;Lji;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final z(Ljava/lang/Object;Lji;)Loh0;
    .locals 2

    .line 1
    check-cast p1, Lpi;

    .line 2
    .line 3
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lii;->a:Lr3;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    check-cast v0, Loh0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
