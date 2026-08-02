.class public final Lnj;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmc0;
.implements Los1;
.implements Lon2;


# instance fields
.field public A:Leq2;

.field public B:Lte;

.field public v:J

.field public w:Leq2;

.field public x:J

.field public y:Ld61;

.field public z:Lte;


# virtual methods
.method public final L()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lnj;->x:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lnj;->y:Ld61;

    .line 10
    .line 11
    iput-object v0, p0, Lnj;->z:Lte;

    .line 12
    .line 13
    iput-object v0, p0, Lnj;->A:Leq2;

    .line 14
    .line 15
    invoke-static {p0}, Lci0;->M(Lmc0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final P(Lt61;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lt61;->h:Lsp;

    .line 6
    .line 7
    iget-object v3, v0, Lnj;->w:Leq2;

    .line 8
    .line 9
    sget-object v4, Lsp0;->h:Liu0;

    .line 10
    .line 11
    if-ne v3, v4, :cond_1

    .line 12
    .line 13
    iget-wide v2, v0, Lnj;->v:J

    .line 14
    .line 15
    sget-wide v4, Lju;->g:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lju;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v1, v0, Lnj;->v:J

    .line 24
    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    const/16 v7, 0x7e

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    invoke-static/range {v0 .. v7}, Lnc0;->i0(Lnc0;JJJI)V

    .line 34
    .line 35
    .line 36
    move-object v1, v0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    sget-object v7, Lxi0;->h:Lxi0;

    .line 41
    .line 42
    invoke-interface {v2}, Lnc0;->d()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    iget-wide v5, v0, Lnj;->x:J

    .line 47
    .line 48
    invoke-static {v3, v4, v5, v6}, Lgr2;->a(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Lt61;->getLayoutDirection()Ld61;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, v0, Lnj;->y:Ld61;

    .line 59
    .line 60
    if-ne v3, v4, :cond_2

    .line 61
    .line 62
    iget-object v3, v0, Lnj;->A:Leq2;

    .line 63
    .line 64
    iget-object v4, v0, Lnj;->w:Leq2;

    .line 65
    .line 66
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    iget-object v3, v0, Lnj;->z:Lte;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance v3, Lr1;

    .line 79
    .line 80
    const/16 v4, 0x8

    .line 81
    .line 82
    invoke-direct {v3, v4, v0, v1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v3}, Ls11;->S(Lth1;Lxm0;)V

    .line 86
    .line 87
    .line 88
    iget-object v3, v0, Lnj;->B:Lte;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    iput-object v4, v0, Lnj;->B:Lte;

    .line 92
    .line 93
    :goto_0
    iput-object v3, v0, Lnj;->z:Lte;

    .line 94
    .line 95
    invoke-interface {v2}, Lnc0;->d()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    iput-wide v4, v0, Lnj;->x:J

    .line 100
    .line 101
    invoke-virtual {v1}, Lt61;->getLayoutDirection()Ld61;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iput-object v4, v0, Lnj;->y:Ld61;

    .line 106
    .line 107
    iget-object v4, v0, Lnj;->w:Leq2;

    .line 108
    .line 109
    iput-object v4, v0, Lnj;->A:Leq2;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-wide v4, v0, Lnj;->v:J

    .line 115
    .line 116
    sget-wide v8, Lju;->g:J

    .line 117
    .line 118
    invoke-static {v4, v5, v8, v9}, Lju;->c(JJ)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_0

    .line 123
    .line 124
    iget-wide v4, v0, Lnj;->v:J

    .line 125
    .line 126
    instance-of v0, v3, Ltv1;

    .line 127
    .line 128
    const/16 v6, 0x20

    .line 129
    .line 130
    const-wide v8, 0xffffffffL

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    check-cast v3, Ltv1;

    .line 138
    .line 139
    iget-object v0, v3, Ltv1;->j:Lo62;

    .line 140
    .line 141
    iget v2, v0, Lo62;->a:F

    .line 142
    .line 143
    iget v3, v0, Lo62;->b:F

    .line 144
    .line 145
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    int-to-long v10, v2

    .line 150
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    int-to-long v2, v2

    .line 155
    shl-long/2addr v10, v6

    .line 156
    and-long/2addr v2, v8

    .line 157
    or-long/2addr v2, v10

    .line 158
    invoke-static {v0}, Ltl;->W(Lo62;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    move-wide/from16 v26, v4

    .line 163
    .line 164
    move-wide v3, v2

    .line 165
    move-wide/from16 v1, v26

    .line 166
    .line 167
    move-wide v5, v8

    .line 168
    const/4 v8, 0x3

    .line 169
    move-object/from16 v0, p1

    .line 170
    .line 171
    invoke-virtual/range {v0 .. v8}, Lt61;->c0(JJJLop0;I)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_2

    .line 175
    .line 176
    :cond_3
    move-object v0, v1

    .line 177
    instance-of v1, v3, Luv1;

    .line 178
    .line 179
    if-eqz v1, :cond_5

    .line 180
    .line 181
    check-cast v3, Luv1;

    .line 182
    .line 183
    iget-object v1, v3, Luv1;->k:Ly9;

    .line 184
    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    :goto_1
    invoke-virtual {v0, v1, v4, v5, v7}, Lt61;->t(Ly9;JLop0;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_2

    .line 191
    .line 192
    :cond_4
    iget-object v1, v3, Luv1;->j:Ldb2;

    .line 193
    .line 194
    iget v3, v1, Ldb2;->b:F

    .line 195
    .line 196
    iget v10, v1, Ldb2;->a:F

    .line 197
    .line 198
    iget-wide v11, v1, Ldb2;->h:J

    .line 199
    .line 200
    shr-long/2addr v11, v6

    .line 201
    long-to-int v11, v11

    .line 202
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    int-to-long v12, v12

    .line 211
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    int-to-long v14, v14

    .line 216
    shl-long/2addr v12, v6

    .line 217
    and-long/2addr v14, v8

    .line 218
    or-long/2addr v12, v14

    .line 219
    iget v14, v1, Ldb2;->c:F

    .line 220
    .line 221
    sub-float/2addr v14, v10

    .line 222
    iget v1, v1, Ldb2;->d:F

    .line 223
    .line 224
    sub-float/2addr v1, v3

    .line 225
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    int-to-long v14, v3

    .line 230
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    move-wide/from16 v16, v8

    .line 235
    .line 236
    int-to-long v8, v1

    .line 237
    shl-long/2addr v14, v6

    .line 238
    and-long v8, v8, v16

    .line 239
    .line 240
    or-long/2addr v8, v14

    .line 241
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    int-to-long v14, v1

    .line 246
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    int-to-long v10, v1

    .line 251
    shl-long/2addr v14, v6

    .line 252
    and-long v10, v10, v16

    .line 253
    .line 254
    or-long/2addr v10, v14

    .line 255
    iget-object v1, v2, Lsp;->h:Lrp;

    .line 256
    .line 257
    iget-object v1, v1, Lrp;->c:Lqp;

    .line 258
    .line 259
    shr-long v14, v12, v6

    .line 260
    .line 261
    long-to-int v3, v14

    .line 262
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 263
    .line 264
    .line 265
    move-result v19

    .line 266
    and-long v12, v12, v16

    .line 267
    .line 268
    long-to-int v12, v12

    .line 269
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 270
    .line 271
    .line 272
    move-result v20

    .line 273
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    shr-long v13, v8, v6

    .line 278
    .line 279
    long-to-int v13, v13

    .line 280
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 281
    .line 282
    .line 283
    move-result v13

    .line 284
    add-float v21, v13, v3

    .line 285
    .line 286
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    and-long v8, v8, v16

    .line 291
    .line 292
    long-to-int v8, v8

    .line 293
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    add-float v22, v8, v3

    .line 298
    .line 299
    shr-long v8, v10, v6

    .line 300
    .line 301
    long-to-int v3, v8

    .line 302
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v23

    .line 306
    and-long v8, v10, v16

    .line 307
    .line 308
    long-to-int v3, v8

    .line 309
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v24

    .line 313
    const/4 v3, 0x3

    .line 314
    invoke-static {v2, v4, v5, v7, v3}, Lsp;->a(Lsp;JLop0;I)Lq9;

    .line 315
    .line 316
    .line 317
    move-result-object v25

    .line 318
    move-object/from16 v18, v1

    .line 319
    .line 320
    invoke-interface/range {v18 .. v25}, Lqp;->j(FFFFFFLq9;)V

    .line 321
    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_5
    instance-of v1, v3, Lsv1;

    .line 325
    .line 326
    if-eqz v1, :cond_6

    .line 327
    .line 328
    check-cast v3, Lsv1;

    .line 329
    .line 330
    iget-object v1, v3, Lsv1;->j:Ly9;

    .line 331
    .line 332
    goto/16 :goto_1

    .line 333
    .line 334
    :cond_6
    invoke-static {}, Lc80;->s()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :goto_2
    invoke-virtual {v0}, Lt61;->a()V

    .line 339
    .line 340
    .line 341
    return-void
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnj;->w:Leq2;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxn2;->c(Lzn2;Leq2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
