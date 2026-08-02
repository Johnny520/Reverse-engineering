.class public final Lsi1;
.super Lio1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final f:Ln4;

.field public final g:Ljn;

.field public h:Lzt2;


# direct methods
.method public constructor <init>(Lim2;Ln4;Ljw;Le70;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lio1;-><init>(Lim2;Lmn0;Le70;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lsi1;->f:Ln4;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x6

    .line 8
    const p3, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p2, p1}, Lfg1;->a(IILhn;)Ljn;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lsi1;->g:Ljn;

    .line 16
    .line 17
    return-void
.end method

.method public static final c(Lsi1;Lim2;Loi1;FFLu00;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v9, v5, Lio1;->e:Lsz0;

    .line 13
    .line 14
    instance-of v2, v1, Lpi1;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Lpi1;

    .line 20
    .line 21
    iget v3, v2, Lpi1;->p:I

    .line 22
    .line 23
    const/high16 v4, -0x80000000

    .line 24
    .line 25
    and-int v6, v3, v4

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr v3, v4

    .line 30
    iput v3, v2, Lpi1;->p:I

    .line 31
    .line 32
    :goto_0
    move-object v10, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v2, Lpi1;

    .line 35
    .line 36
    invoke-direct {v2, v5, v1}, Lpi1;-><init>(Lsi1;Lu00;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v1, v10, Lpi1;->n:Ljava/lang/Object;

    .line 41
    .line 42
    iget v2, v10, Lpi1;->p:I

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    sget-object v13, La83;->a:La83;

    .line 47
    .line 48
    const/4 v14, 0x2

    .line 49
    const/4 v15, 0x1

    .line 50
    sget-object v3, Lk20;->h:Lk20;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    if-eq v2, v15, :cond_2

    .line 55
    .line 56
    if-ne v2, v14, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v13

    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v12

    .line 68
    :cond_2
    iget v0, v10, Lpi1;->m:F

    .line 69
    .line 70
    iget-object v2, v10, Lpi1;->l:Lz62;

    .line 71
    .line 72
    iget-object v4, v10, Lpi1;->k:Lim2;

    .line 73
    .line 74
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v12, v3

    .line 78
    move-object/from16 v16, v13

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v1, v3

    .line 86
    new-instance v3, Lo72;

    .line 87
    .line 88
    invoke-direct {v3}, Lo72;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, v3, Lo72;->i:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v16, v13

    .line 94
    .line 95
    iget-wide v12, v0, Loi1;->b:J

    .line 96
    .line 97
    iget-wide v14, v0, Loi1;->a:J

    .line 98
    .line 99
    iget-object v0, v9, Lsz0;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lbb2;

    .line 102
    .line 103
    move-object v4, v3

    .line 104
    const/16 p2, 0x20

    .line 105
    .line 106
    shr-long v2, v14, p2

    .line 107
    .line 108
    long-to-int v2, v2

    .line 109
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {v0, v2, v12, v13}, Lbb2;->a(FJ)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v9, Lsz0;->j:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lbb2;

    .line 119
    .line 120
    const-wide v2, 0xffffffffL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    and-long/2addr v14, v2

    .line 126
    long-to-int v6, v14

    .line 127
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v0, v6, v12, v13}, Lbb2;->a(FJ)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v5, Lsi1;->g:Ljn;

    .line 135
    .line 136
    invoke-static {v0}, Lsi1;->g(Ljn;)Loi1;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    iget-wide v12, v0, Loi1;->b:J

    .line 143
    .line 144
    iget-wide v14, v0, Loi1;->a:J

    .line 145
    .line 146
    iget-object v6, v9, Lsz0;->i:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v6, Lbb2;

    .line 149
    .line 150
    move-wide/from16 v17, v2

    .line 151
    .line 152
    shr-long v2, v14, p2

    .line 153
    .line 154
    long-to-int v2, v2

    .line 155
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-virtual {v6, v2, v12, v13}, Lbb2;->a(FJ)V

    .line 160
    .line 161
    .line 162
    iget-object v2, v9, Lsz0;->j:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Lbb2;

    .line 165
    .line 166
    and-long v14, v14, v17

    .line 167
    .line 168
    long-to-int v3, v14

    .line 169
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v2, v3, v12, v13}, Lbb2;->a(FJ)V

    .line 174
    .line 175
    .line 176
    move-object v3, v4

    .line 177
    iget-object v2, v3, Lo72;->i:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Loi1;

    .line 180
    .line 181
    invoke-virtual {v2, v0}, Loi1;->a(Loi1;)Loi1;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-object v0, v3, Lo72;->i:Ljava/lang/Object;

    .line 186
    .line 187
    :goto_2
    move-object v0, v1

    .line 188
    goto :goto_3

    .line 189
    :cond_4
    move-object v3, v4

    .line 190
    goto :goto_2

    .line 191
    :goto_3
    new-instance v1, Lz62;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v3, Lo72;->i:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Loi1;

    .line 199
    .line 200
    iget-wide v12, v2, Loi1;->a:J

    .line 201
    .line 202
    invoke-virtual {v7, v12, v13}, Lim2;->e(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v12

    .line 206
    invoke-virtual {v7, v12, v13}, Lim2;->g(J)F

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    iput v2, v1, Lz62;->h:F

    .line 211
    .line 212
    invoke-static {v2}, Lrp0;->S(F)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_5
    new-instance v2, Lo72;

    .line 221
    .line 222
    invoke-direct {v2}, Lo72;-><init>()V

    .line 223
    .line 224
    .line 225
    const/16 v4, 0x1e

    .line 226
    .line 227
    invoke-static {v11, v4}, Ls11;->a(FI)Lid;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iput-object v4, v2, Lo72;->i:Ljava/lang/Object;

    .line 232
    .line 233
    move-object v4, v0

    .line 234
    new-instance v0, Lqi1;

    .line 235
    .line 236
    const/4 v8, 0x0

    .line 237
    move/from16 v6, p4

    .line 238
    .line 239
    move-object v12, v4

    .line 240
    move/from16 v4, p3

    .line 241
    .line 242
    invoke-direct/range {v0 .. v8}, Lqi1;-><init>(Lz62;Lo72;Lo72;FLsi1;FLim2;Lt00;)V

    .line 243
    .line 244
    .line 245
    iput-object v7, v10, Lpi1;->k:Lim2;

    .line 246
    .line 247
    iput-object v1, v10, Lpi1;->l:Lz62;

    .line 248
    .line 249
    iput v6, v10, Lpi1;->m:F

    .line 250
    .line 251
    const/4 v2, 0x1

    .line 252
    iput v2, v10, Lpi1;->p:I

    .line 253
    .line 254
    invoke-virtual {v5, v0, v10}, Lio1;->b(Lmn0;Lu00;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v12, :cond_6

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_6
    move-object v2, v1

    .line 262
    move v0, v6

    .line 263
    move-object v4, v7

    .line 264
    :goto_4
    iget-object v1, v9, Lsz0;->i:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v1, Lbb2;

    .line 267
    .line 268
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v3}, Lbb2;->b(F)F

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    iget-object v6, v9, Lsz0;->j:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v6, Lbb2;

    .line 278
    .line 279
    invoke-virtual {v6, v3}, Lbb2;->b(F)F

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-static {v1, v3}, Lea3;->a(FF)J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    const-wide/16 v8, 0x0

    .line 288
    .line 289
    cmp-long v1, v6, v8

    .line 290
    .line 291
    if-nez v1, :cond_9

    .line 292
    .line 293
    iget v1, v2, Lz62;->h:F

    .line 294
    .line 295
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    const/high16 v3, 0x42c80000    # 100.0f

    .line 300
    .line 301
    div-float/2addr v1, v3

    .line 302
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    iget v1, v2, Lz62;->h:F

    .line 307
    .line 308
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {v4, v1}, Lim2;->d(F)F

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    mul-float/2addr v1, v0

    .line 317
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 318
    .line 319
    mul-float/2addr v1, v0

    .line 320
    cmpg-float v0, v1, v11

    .line 321
    .line 322
    if-nez v0, :cond_7

    .line 323
    .line 324
    move-wide v6, v8

    .line 325
    goto :goto_6

    .line 326
    :cond_7
    iget-object v0, v4, Lim2;->d:Lqv1;

    .line 327
    .line 328
    sget-object v2, Lqv1;->i:Lqv1;

    .line 329
    .line 330
    if-ne v0, v2, :cond_8

    .line 331
    .line 332
    invoke-static {v1, v11}, Lea3;->a(FF)J

    .line 333
    .line 334
    .line 335
    move-result-wide v0

    .line 336
    :goto_5
    move-wide v6, v0

    .line 337
    goto :goto_6

    .line 338
    :cond_8
    invoke-static {v11, v1}, Lea3;->a(FF)J

    .line 339
    .line 340
    .line 341
    move-result-wide v0

    .line 342
    goto :goto_5

    .line 343
    :cond_9
    :goto_6
    iget-object v0, v5, Lio1;->b:Lmn0;

    .line 344
    .line 345
    new-instance v1, Lda3;

    .line 346
    .line 347
    invoke-direct {v1, v6, v7}, Lda3;-><init>(J)V

    .line 348
    .line 349
    .line 350
    const/4 v2, 0x0

    .line 351
    iput-object v2, v10, Lpi1;->k:Lim2;

    .line 352
    .line 353
    iput-object v2, v10, Lpi1;->l:Lz62;

    .line 354
    .line 355
    const/4 v2, 0x2

    .line 356
    iput v2, v10, Lpi1;->p:I

    .line 357
    .line 358
    invoke-interface {v0, v1, v10}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-ne v0, v12, :cond_a

    .line 363
    .line 364
    :goto_7
    return-object v12

    .line 365
    :cond_a
    :goto_8
    return-object v16
.end method

.method public static final d(Lsi1;Lo72;Lz62;Lim2;Lo72;JLu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    instance-of v3, v2, Lri1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lri1;

    .line 11
    .line 12
    iget v4, v3, Lri1;->q:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lri1;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lri1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lu00;-><init>(Lt00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lri1;->p:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Lri1;->q:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-ne v4, v6, :cond_1

    .line 38
    .line 39
    iget-object p0, v3, Lri1;->o:Lo72;

    .line 40
    .line 41
    iget-object p1, v3, Lri1;->n:Lim2;

    .line 42
    .line 43
    iget-object v0, v3, Lri1;->m:Lz62;

    .line 44
    .line 45
    iget-object v1, v3, Lri1;->l:Lo72;

    .line 46
    .line 47
    iget-object v3, v3, Lri1;->k:Lsi1;

    .line 48
    .line 49
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v7, p0

    .line 53
    move-object v5, p1

    .line 54
    move-object p1, v1

    .line 55
    move-object p0, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_2
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    cmp-long v2, v0, v7

    .line 69
    .line 70
    if-gez v2, :cond_3

    .line 71
    .line 72
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    new-instance v2, Lh50;

    .line 76
    .line 77
    const/4 v4, 0x5

    .line 78
    invoke-direct {v2, p0, v5, v4}, Lh50;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 79
    .line 80
    .line 81
    iput-object p0, v3, Lri1;->k:Lsi1;

    .line 82
    .line 83
    iput-object p1, v3, Lri1;->l:Lo72;

    .line 84
    .line 85
    iput-object p2, v3, Lri1;->m:Lz62;

    .line 86
    .line 87
    iput-object p3, v3, Lri1;->n:Lim2;

    .line 88
    .line 89
    iput-object p4, v3, Lri1;->o:Lo72;

    .line 90
    .line 91
    iput v6, v3, Lri1;->q:I

    .line 92
    .line 93
    invoke-static {v0, v1, v2, v3}, Lga3;->f(JLmn0;Lu00;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v0, Lk20;->h:Lk20;

    .line 98
    .line 99
    if-ne v2, v0, :cond_4

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_4
    move-object v0, p2

    .line 103
    move-object v5, p3

    .line 104
    move-object v7, p4

    .line 105
    :goto_1
    check-cast v2, Loi1;

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    iget-object v1, p1, Lo72;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Loi1;

    .line 112
    .line 113
    iget-boolean v1, v1, Loi1;->c:Z

    .line 114
    .line 115
    iget-wide v3, v2, Loi1;->a:J

    .line 116
    .line 117
    iget-wide v8, v2, Loi1;->b:J

    .line 118
    .line 119
    new-instance v10, Loi1;

    .line 120
    .line 121
    move/from16 p7, v1

    .line 122
    .line 123
    move-wide p3, v3

    .line 124
    move-wide/from16 p5, v8

    .line 125
    .line 126
    move-object p2, v10

    .line 127
    invoke-direct/range {p2 .. p7}, Loi1;-><init>(JJZ)V

    .line 128
    .line 129
    .line 130
    move-object v1, p2

    .line 131
    iput-object v1, p1, Lo72;->i:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v5, v3, v4}, Lim2;->e(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    invoke-virtual {v5, v3, v4}, Lim2;->i(J)F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    iput p1, v0, Lz62;->h:F

    .line 142
    .line 143
    const/4 p1, 0x0

    .line 144
    const/16 v1, 0x1e

    .line 145
    .line 146
    invoke-static {p1, v1}, Ls11;->a(FI)Lid;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, v7, Lo72;->i:Ljava/lang/Object;

    .line 151
    .line 152
    iget-object p0, p0, Lio1;->e:Lsz0;

    .line 153
    .line 154
    iget-wide v3, v2, Loi1;->b:J

    .line 155
    .line 156
    iget-wide v1, v2, Loi1;->a:J

    .line 157
    .line 158
    iget-object p1, p0, Lsz0;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Lbb2;

    .line 161
    .line 162
    const/16 v5, 0x20

    .line 163
    .line 164
    shr-long v7, v1, v5

    .line 165
    .line 166
    long-to-int v5, v7

    .line 167
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-virtual {p1, v5, v3, v4}, Lbb2;->a(FJ)V

    .line 172
    .line 173
    .line 174
    iget-object p0, p0, Lsz0;->j:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lbb2;

    .line 177
    .line 178
    const-wide v7, 0xffffffffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    and-long/2addr v1, v7

    .line 184
    long-to-int p1, v1

    .line 185
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-virtual {p0, p1, v3, v4}, Lbb2;->a(FJ)V

    .line 190
    .line 191
    .line 192
    iget p0, v0, Lz62;->h:F

    .line 193
    .line 194
    invoke-static {p0}, Lrp0;->S(F)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    xor-int/2addr p0, v6

    .line 199
    goto :goto_2

    .line 200
    :cond_5
    const/4 p0, 0x0

    .line 201
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0
.end method

.method public static g(Ljn;)Loi1;
    .locals 3

    .line 1
    new-instance v0, Lni1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lni1;-><init>(Lfq;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Llm0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, v0, v2, v1}, Llm0;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Ltp0;->B(Lmn0;)Lvo2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lvo2;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lvo2;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Loi1;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    :goto_1
    move-object v2, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v2, v0}, Loi1;->a(Loi1;)Loi1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    return-object v2
.end method


# virtual methods
.method public final e(Lgm2;F)F
    .locals 3

    .line 1
    iget-object p0, p0, Lio1;->a:Lim2;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lim2;->d(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p2}, Lim2;->h(F)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p1, p1, Lgm2;->a:Lim2;

    .line 12
    .line 13
    iget-object p2, p1, Lim2;->k:Lkl2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, p2, v0, v1, v2}, Lim2;->c(Lkl2;JI)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    invoke-virtual {p0, p1, p2}, Lim2;->e(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-virtual {p0, p1, p2}, Lim2;->g(J)F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public final f(Lh12;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lsi1;->f:Ln4;

    .line 2
    .line 3
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    neg-float v1, v1

    .line 12
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    neg-float v0, v0

    .line 17
    iget-object v2, p1, Lh12;->a:Ljava/util/List;

    .line 18
    .line 19
    new-instance v3, Lrs1;

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Lrs1;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    move v6, v5

    .line 32
    :goto_0
    iget-wide v7, v3, Lrs1;->a:J

    .line 33
    .line 34
    if-ge v6, v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lo12;

    .line 41
    .line 42
    iget-wide v9, v3, Lo12;->j:J

    .line 43
    .line 44
    invoke-static {v7, v8, v9, v10}, Lrs1;->e(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    new-instance v3, Lrs1;

    .line 49
    .line 50
    invoke-direct {v3, v7, v8}, Lrs1;-><init>(J)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 v2, 0x20

    .line 57
    .line 58
    shr-long v3, v7, v2

    .line 59
    .line 60
    long-to-int v3, v3

    .line 61
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    mul-float/2addr v3, v0

    .line 66
    const-wide v9, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long v6, v7, v9

    .line 72
    .line 73
    long-to-int v0, v6

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    mul-float/2addr v0, v1

    .line 79
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    int-to-long v3, v1

    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-long v0, v0

    .line 89
    shl-long v2, v3, v2

    .line 90
    .line 91
    and-long/2addr v0, v9

    .line 92
    or-long v7, v2, v0

    .line 93
    .line 94
    iget-object v0, p0, Lio1;->a:Lim2;

    .line 95
    .line 96
    invoke-virtual {v0, v7, v8}, Lim2;->e(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    invoke-virtual {v0, v1, v2}, Lim2;->i(J)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    const/4 v2, 0x0

    .line 105
    cmpg-float v3, v1, v2

    .line 106
    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    cmpl-float v1, v1, v2

    .line 111
    .line 112
    iget-object v0, v0, Lim2;->a:Lbm2;

    .line 113
    .line 114
    if-lez v1, :cond_2

    .line 115
    .line 116
    invoke-interface {v0}, Lbm2;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-interface {v0}, Lbm2;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    :goto_1
    if-eqz v5, :cond_3

    .line 126
    .line 127
    new-instance v6, Loi1;

    .line 128
    .line 129
    iget-object p1, p1, Lh12;->a:Ljava/util/List;

    .line 130
    .line 131
    invoke-static {p1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lo12;

    .line 136
    .line 137
    iget-wide v9, p1, Lo12;->b:J

    .line 138
    .line 139
    const/4 v11, 0x0

    .line 140
    invoke-direct/range {v6 .. v11}, Loi1;-><init>(JJZ)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Lsi1;->g:Ljn;

    .line 144
    .line 145
    invoke-interface {p0, v6}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    instance-of p0, p0, Loq;

    .line 150
    .line 151
    xor-int/lit8 p0, p0, 0x1

    .line 152
    .line 153
    return p0

    .line 154
    :cond_3
    iget-boolean p0, p0, Lio1;->d:Z

    .line 155
    .line 156
    return p0
.end method
