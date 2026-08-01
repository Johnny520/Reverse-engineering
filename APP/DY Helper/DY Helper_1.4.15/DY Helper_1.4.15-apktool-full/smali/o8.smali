.class public final Lo8;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lbw;
.implements Lc41;
.implements Lzr1;


# instance fields
.field public Α:Lu81;

.field public τ:J

.field public υ:Liv1;

.field public φ:J

.field public χ:Lnp0;

.field public ψ:Lu81;

.field public ω:Liv1;


# virtual methods
.method public final Ζ()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lo8;->φ:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lo8;->χ:Lnp0;

    .line 10
    .line 11
    iput-object v0, p0, Lo8;->ψ:Lu81;

    .line 12
    .line 13
    iput-object v0, p0, Lo8;->ω:Liv1;

    .line 14
    .line 15
    invoke-static {p0}, Lyh;->Σ(Lbw;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final Μ(Laq0;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Laq0;->ε:Lfe;

    .line 6
    .line 7
    iget-object v3, v0, Lo8;->υ:Liv1;

    .line 8
    .line 9
    sget-object v4, Lkn0;->ξ:Lpl1;

    .line 10
    .line 11
    if-ne v3, v4, :cond_1

    .line 12
    .line 13
    iget-wide v2, v0, Lo8;->τ:J

    .line 14
    .line 15
    sget-wide v4, Lci;->η:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lci;->γ(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v1, v0, Lo8;->τ:J

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/16 v6, 0x7e

    .line 27
    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    invoke-static/range {v0 .. v6}, Lcw;->а(Lcw;JJFI)V

    .line 33
    .line 34
    .line 35
    move-object v1, v0

    .line 36
    :cond_0
    move-object v6, v1

    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_1
    sget-object v3, Lt30;->π:Lt30;

    .line 40
    .line 41
    invoke-interface {v2}, Lcw;->α()J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    iget-wide v6, v0, Lo8;->φ:J

    .line 46
    .line 47
    invoke-static {v4, v5, v6, v7}, Ljw1;->α(JJ)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v5, v0, Lo8;->χ:Lnp0;

    .line 58
    .line 59
    if-ne v4, v5, :cond_2

    .line 60
    .line 61
    iget-object v4, v0, Lo8;->ω:Liv1;

    .line 62
    .line 63
    iget-object v5, v0, Lo8;->υ:Liv1;

    .line 64
    .line 65
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    iget-object v4, v0, Lo8;->ψ:Lu81;

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v4, Lp3;

    .line 78
    .line 79
    const/4 v5, 0x1

    .line 80
    invoke-direct {v4, v0, v5, v1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v4}, Lln0;->а(Lq01;Lp70;)V

    .line 84
    .line 85
    .line 86
    iget-object v4, v0, Lo8;->Α:Lu81;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    iput-object v5, v0, Lo8;->Α:Lu81;

    .line 90
    .line 91
    :goto_0
    iput-object v4, v0, Lo8;->ψ:Lu81;

    .line 92
    .line 93
    invoke-interface {v2}, Lcw;->α()J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    iput-wide v5, v0, Lo8;->φ:J

    .line 98
    .line 99
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iput-object v5, v0, Lo8;->χ:Lnp0;

    .line 104
    .line 105
    iget-object v5, v0, Lo8;->υ:Liv1;

    .line 106
    .line 107
    iput-object v5, v0, Lo8;->ω:Liv1;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-wide v5, v0, Lo8;->τ:J

    .line 113
    .line 114
    sget-wide v7, Lci;->η:J

    .line 115
    .line 116
    invoke-static {v5, v6, v7, v8}, Lci;->γ(JJ)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_0

    .line 121
    .line 122
    iget-wide v5, v0, Lo8;->τ:J

    .line 123
    .line 124
    instance-of v0, v4, Ls81;

    .line 125
    .line 126
    const/16 v7, 0x20

    .line 127
    .line 128
    const-wide v8, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    check-cast v4, Ls81;

    .line 136
    .line 137
    iget-object v0, v4, Ls81;->α:Lml1;

    .line 138
    .line 139
    iget v2, v0, Lml1;->α:F

    .line 140
    .line 141
    iget v4, v0, Lml1;->β:F

    .line 142
    .line 143
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    int-to-long v10, v2

    .line 148
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    int-to-long v12, v2

    .line 153
    shl-long/2addr v10, v7

    .line 154
    and-long v7, v12, v8

    .line 155
    .line 156
    or-long/2addr v7, v10

    .line 157
    iget v2, v0, Lml1;->γ:F

    .line 158
    .line 159
    iget v4, v0, Lml1;->α:F

    .line 160
    .line 161
    sub-float/2addr v2, v4

    .line 162
    iget v4, v0, Lml1;->δ:F

    .line 163
    .line 164
    iget v0, v0, Lml1;->β:F

    .line 165
    .line 166
    sub-float/2addr v4, v0

    .line 167
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-long v9, v0

    .line 172
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    int-to-long v11, v0

    .line 177
    const/16 v0, 0x20

    .line 178
    .line 179
    shl-long/2addr v9, v0

    .line 180
    const-wide v13, 0xffffffffL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    and-long/2addr v11, v13

    .line 186
    or-long/2addr v9, v11

    .line 187
    move-wide/from16 v23, v7

    .line 188
    .line 189
    move-object v8, v3

    .line 190
    move-wide/from16 v3, v23

    .line 191
    .line 192
    const/high16 v7, 0x3f800000    # 1.0f

    .line 193
    .line 194
    move-wide v1, v5

    .line 195
    move-wide v5, v9

    .line 196
    const/4 v9, 0x3

    .line 197
    move-object/from16 v0, p1

    .line 198
    .line 199
    invoke-virtual/range {v0 .. v9}, Laq0;->Λ(JJJFLkn0;I)V

    .line 200
    .line 201
    .line 202
    move-object v6, v0

    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_3
    move-wide/from16 v23, v5

    .line 206
    .line 207
    move-object v6, v1

    .line 208
    move-wide/from16 v0, v23

    .line 209
    .line 210
    instance-of v5, v4, Lt81;

    .line 211
    .line 212
    if-eqz v5, :cond_5

    .line 213
    .line 214
    check-cast v4, Lt81;

    .line 215
    .line 216
    iget-object v5, v4, Lt81;->β:Lx2;

    .line 217
    .line 218
    if-eqz v5, :cond_4

    .line 219
    .line 220
    invoke-virtual {v6, v5, v0, v1, v3}, Laq0;->ζ(Lz91;JLkn0;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_4
    iget-object v4, v4, Lt81;->α:Lwo1;

    .line 226
    .line 227
    iget-wide v10, v4, Lwo1;->θ:J

    .line 228
    .line 229
    shr-long/2addr v10, v7

    .line 230
    long-to-int v5, v10

    .line 231
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    iget v10, v4, Lwo1;->α:F

    .line 236
    .line 237
    iget v11, v4, Lwo1;->β:F

    .line 238
    .line 239
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    int-to-long v12, v10

    .line 244
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    int-to-long v10, v10

    .line 249
    shl-long/2addr v12, v7

    .line 250
    and-long/2addr v10, v8

    .line 251
    or-long/2addr v10, v12

    .line 252
    invoke-virtual {v4}, Lwo1;->β()F

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    invoke-virtual {v4}, Lwo1;->α()F

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    int-to-long v12, v12

    .line 265
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    int-to-long v14, v4

    .line 270
    shl-long/2addr v12, v7

    .line 271
    and-long/2addr v14, v8

    .line 272
    or-long/2addr v12, v14

    .line 273
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    int-to-long v14, v4

    .line 278
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    int-to-long v4, v4

    .line 283
    shl-long/2addr v14, v7

    .line 284
    and-long/2addr v4, v8

    .line 285
    or-long/2addr v4, v14

    .line 286
    iget-object v14, v2, Lfe;->ε:Lee;

    .line 287
    .line 288
    iget-object v15, v14, Lee;->γ:Lde;

    .line 289
    .line 290
    move/from16 p0, v7

    .line 291
    .line 292
    move-wide/from16 v16, v8

    .line 293
    .line 294
    shr-long v7, v10, p0

    .line 295
    .line 296
    long-to-int v7, v7

    .line 297
    move-wide/from16 v8, v16

    .line 298
    .line 299
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v16

    .line 303
    and-long/2addr v10, v8

    .line 304
    long-to-int v10, v10

    .line 305
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 306
    .line 307
    .line 308
    move-result v17

    .line 309
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    move-wide/from16 v18, v8

    .line 314
    .line 315
    shr-long v8, v12, p0

    .line 316
    .line 317
    long-to-int v8, v8

    .line 318
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    add-float/2addr v8, v7

    .line 323
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    and-long v9, v12, v18

    .line 328
    .line 329
    long-to-int v9, v9

    .line 330
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    add-float/2addr v9, v7

    .line 335
    shr-long v10, v4, p0

    .line 336
    .line 337
    long-to-int v7, v10

    .line 338
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 339
    .line 340
    .line 341
    move-result v20

    .line 342
    and-long v4, v4, v18

    .line 343
    .line 344
    long-to-int v4, v4

    .line 345
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 346
    .line 347
    .line 348
    move-result v21

    .line 349
    const/high16 v4, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v5, 0x3

    .line 352
    move-wide/from16 v23, v0

    .line 353
    .line 354
    move-object v0, v2

    .line 355
    move-wide/from16 v1, v23

    .line 356
    .line 357
    invoke-static/range {v0 .. v5}, Lfe;->γ(Lfe;JLkn0;FI)Lq2;

    .line 358
    .line 359
    .line 360
    move-result-object v22

    .line 361
    move/from16 v18, v8

    .line 362
    .line 363
    move/from16 v19, v9

    .line 364
    .line 365
    invoke-interface/range {v15 .. v22}, Lde;->η(FFFFFFLq2;)V

    .line 366
    .line 367
    .line 368
    goto :goto_1

    .line 369
    :cond_5
    move-wide v1, v0

    .line 370
    instance-of v0, v4, Lr81;

    .line 371
    .line 372
    if-eqz v0, :cond_6

    .line 373
    .line 374
    check-cast v4, Lr81;

    .line 375
    .line 376
    iget-object v0, v4, Lr81;->α:Lz91;

    .line 377
    .line 378
    invoke-virtual {v6, v0, v1, v2, v3}, Laq0;->ζ(Lz91;JLkn0;)V

    .line 379
    .line 380
    .line 381
    goto :goto_1

    .line 382
    :cond_6
    invoke-static {}, Lγ;->κ()V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :goto_1
    invoke-virtual {v6}, Laq0;->γ()V

    .line 387
    .line 388
    .line 389
    return-void
.end method

.method public final Ω(Ljs1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lo8;->υ:Liv1;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lhs1;->β(Ljs1;Liv1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final γ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
