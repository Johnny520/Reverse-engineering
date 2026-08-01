.class public final Lt9;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltq;
.implements Lmk0;
.implements Lvz0;


# instance fields
.field public r:J

.field public s:Lx01;

.field public t:J

.field public u:Lk50;

.field public v:Lv50;

.field public w:Lx01;

.field public x:Lv50;


# virtual methods
.method public final B(Ld60;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ld60;->d:Ldd;

    .line 6
    .line 7
    iget-object v3, v0, Lt9;->s:Lx01;

    .line 8
    .line 9
    sget-object v4, Lpf1;->i:Lfz;

    .line 10
    .line 11
    if-ne v3, v4, :cond_1

    .line 12
    .line 13
    iget-wide v2, v0, Lt9;->r:J

    .line 14
    .line 15
    sget-wide v4, Lff;->g:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lff;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v1, v0, Lt9;->r:J

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    const/16 v5, 0x7e

    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    invoke-static/range {v0 .. v5}, Luq;->v(Luq;JJI)V

    .line 32
    .line 33
    .line 34
    move-object v1, v0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_1
    sget-object v7, Lqt;->Q:Lqt;

    .line 39
    .line 40
    invoke-interface {v2}, Luq;->c()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    iget-wide v5, v0, Lt9;->t:J

    .line 45
    .line 46
    invoke-static {v3, v4, v5, v6}, Lq11;->a(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ld60;->getLayoutDirection()Lk50;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, v0, Lt9;->u:Lk50;

    .line 57
    .line 58
    if-ne v3, v4, :cond_2

    .line 59
    .line 60
    iget-object v3, v0, Lt9;->w:Lx01;

    .line 61
    .line 62
    iget-object v4, v0, Lt9;->s:Lx01;

    .line 63
    .line 64
    invoke-static {v3, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    iget-object v3, v0, Lt9;->v:Lv50;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v3, Lc7;

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    invoke-direct {v3, v4, v0, v1}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v3}, Lr60;->v(Loe0;Lhw;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lt9;->x:Lv50;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    iput-object v4, v0, Lt9;->x:Lv50;

    .line 89
    .line 90
    :goto_0
    iput-object v3, v0, Lt9;->v:Lv50;

    .line 91
    .line 92
    invoke-interface {v2}, Luq;->c()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    iput-wide v4, v0, Lt9;->t:J

    .line 97
    .line 98
    invoke-virtual {v1}, Ld60;->getLayoutDirection()Lk50;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, v0, Lt9;->u:Lk50;

    .line 103
    .line 104
    iget-object v4, v0, Lt9;->s:Lx01;

    .line 105
    .line 106
    iput-object v4, v0, Lt9;->w:Lx01;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-wide v4, v0, Lt9;->r:J

    .line 112
    .line 113
    sget-wide v8, Lff;->g:J

    .line 114
    .line 115
    invoke-static {v4, v5, v8, v9}, Lff;->c(JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_0

    .line 120
    .line 121
    iget-wide v4, v0, Lt9;->r:J

    .line 122
    .line 123
    instance-of v0, v3, Lxm0;

    .line 124
    .line 125
    const/16 v6, 0x20

    .line 126
    .line 127
    const-wide v8, 0xffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    check-cast v3, Lxm0;

    .line 135
    .line 136
    iget-object v0, v3, Lxm0;->a:Lst0;

    .line 137
    .line 138
    iget v2, v0, Lst0;->a:F

    .line 139
    .line 140
    iget v3, v0, Lst0;->b:F

    .line 141
    .line 142
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    int-to-long v10, v2

    .line 147
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v2, v2

    .line 152
    shl-long/2addr v10, v6

    .line 153
    and-long/2addr v2, v8

    .line 154
    or-long/2addr v2, v10

    .line 155
    iget v10, v0, Lst0;->c:F

    .line 156
    .line 157
    iget v11, v0, Lst0;->a:F

    .line 158
    .line 159
    sub-float/2addr v10, v11

    .line 160
    iget v11, v0, Lst0;->d:F

    .line 161
    .line 162
    iget v0, v0, Lst0;->b:F

    .line 163
    .line 164
    sub-float/2addr v11, v0

    .line 165
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    int-to-long v12, v0

    .line 170
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-long v10, v0

    .line 175
    shl-long/2addr v12, v6

    .line 176
    and-long/2addr v8, v10

    .line 177
    or-long/2addr v8, v12

    .line 178
    move-wide/from16 v26, v4

    .line 179
    .line 180
    move-wide v3, v2

    .line 181
    move-wide/from16 v1, v26

    .line 182
    .line 183
    move-wide v5, v8

    .line 184
    const/4 v8, 0x3

    .line 185
    move-object/from16 v0, p1

    .line 186
    .line 187
    invoke-virtual/range {v0 .. v8}, Ld60;->C(JJJLo30;I)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_2

    .line 191
    .line 192
    :cond_3
    move-object v0, v1

    .line 193
    instance-of v1, v3, Lym0;

    .line 194
    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    check-cast v3, Lym0;

    .line 198
    .line 199
    iget-object v1, v3, Lym0;->b:Ld6;

    .line 200
    .line 201
    if-eqz v1, :cond_4

    .line 202
    .line 203
    :goto_1
    invoke-virtual {v0, v1, v4, v5, v7}, Ld60;->e(Ld6;JLo30;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_4
    iget-object v1, v3, Lym0;->a:Lbw0;

    .line 209
    .line 210
    iget v3, v1, Lbw0;->b:F

    .line 211
    .line 212
    iget v10, v1, Lbw0;->a:F

    .line 213
    .line 214
    iget-wide v11, v1, Lbw0;->h:J

    .line 215
    .line 216
    shr-long/2addr v11, v6

    .line 217
    long-to-int v11, v11

    .line 218
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    int-to-long v12, v12

    .line 227
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    int-to-long v14, v14

    .line 232
    shl-long/2addr v12, v6

    .line 233
    and-long/2addr v14, v8

    .line 234
    or-long/2addr v12, v14

    .line 235
    iget v14, v1, Lbw0;->c:F

    .line 236
    .line 237
    sub-float/2addr v14, v10

    .line 238
    iget v1, v1, Lbw0;->d:F

    .line 239
    .line 240
    sub-float/2addr v1, v3

    .line 241
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    int-to-long v14, v3

    .line 246
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    move-wide/from16 v16, v8

    .line 251
    .line 252
    int-to-long v8, v1

    .line 253
    shl-long/2addr v14, v6

    .line 254
    and-long v8, v8, v16

    .line 255
    .line 256
    or-long/2addr v8, v14

    .line 257
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    int-to-long v14, v1

    .line 262
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    int-to-long v10, v1

    .line 267
    shl-long/2addr v14, v6

    .line 268
    and-long v10, v10, v16

    .line 269
    .line 270
    or-long/2addr v10, v14

    .line 271
    iget-object v1, v2, Ldd;->d:Lcd;

    .line 272
    .line 273
    iget-object v1, v1, Lcd;->c:Lbd;

    .line 274
    .line 275
    shr-long v14, v12, v6

    .line 276
    .line 277
    long-to-int v3, v14

    .line 278
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 279
    .line 280
    .line 281
    move-result v19

    .line 282
    and-long v12, v12, v16

    .line 283
    .line 284
    long-to-int v12, v12

    .line 285
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 286
    .line 287
    .line 288
    move-result v20

    .line 289
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    shr-long v13, v8, v6

    .line 294
    .line 295
    long-to-int v13, v13

    .line 296
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    add-float v21, v13, v3

    .line 301
    .line 302
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    and-long v8, v8, v16

    .line 307
    .line 308
    long-to-int v8, v8

    .line 309
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    add-float v22, v8, v3

    .line 314
    .line 315
    shr-long v8, v10, v6

    .line 316
    .line 317
    long-to-int v3, v8

    .line 318
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 319
    .line 320
    .line 321
    move-result v23

    .line 322
    and-long v8, v10, v16

    .line 323
    .line 324
    long-to-int v3, v8

    .line 325
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 326
    .line 327
    .line 328
    move-result v24

    .line 329
    const/4 v3, 0x3

    .line 330
    invoke-static {v2, v4, v5, v7, v3}, Ldd;->a(Ldd;JLo30;I)Lw5;

    .line 331
    .line 332
    .line 333
    move-result-object v25

    .line 334
    move-object/from16 v18, v1

    .line 335
    .line 336
    invoke-interface/range {v18 .. v25}, Lbd;->h(FFFFFFLw5;)V

    .line 337
    .line 338
    .line 339
    goto :goto_2

    .line 340
    :cond_5
    instance-of v1, v3, Lwm0;

    .line 341
    .line 342
    if-eqz v1, :cond_6

    .line 343
    .line 344
    check-cast v3, Lwm0;

    .line 345
    .line 346
    iget-object v1, v3, Lwm0;->a:Ld6;

    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_6
    invoke-static {}, Lxc;->j()V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :goto_2
    invoke-virtual {v0}, Ld60;->a()V

    .line 355
    .line 356
    .line 357
    return-void
.end method

.method public final S(Lf01;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt9;->s:Lx01;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ld01;->b(Lf01;Lx01;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final z()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lt9;->t:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lt9;->u:Lk50;

    .line 10
    .line 11
    iput-object v0, p0, Lt9;->v:Lv50;

    .line 12
    .line 13
    iput-object v0, p0, Lt9;->w:Lx01;

    .line 14
    .line 15
    invoke-static {p0}, Lkl;->r(Ltq;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
