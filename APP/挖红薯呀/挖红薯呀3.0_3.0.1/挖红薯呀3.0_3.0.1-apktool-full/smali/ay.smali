.class public final Lay;
.super Lbb1;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public b:[F

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:J

.field public f:Ljava/util/List;

.field public g:Z

.field public h:Ld6;

.field public i:Lsw;

.field public final j:Ls2;

.field public k:Ljava/lang/String;

.field public l:F

.field public m:F

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lay;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lay;->d:Z

    .line 13
    .line 14
    sget-wide v1, Lff;->g:J

    .line 15
    .line 16
    iput-wide v1, p0, Lay;->e:J

    .line 17
    .line 18
    sget v1, Lib1;->a:I

    .line 19
    .line 20
    sget-object v1, Lhs;->d:Lhs;

    .line 21
    .line 22
    iput-object v1, p0, Lay;->f:Ljava/util/List;

    .line 23
    .line 24
    iput-boolean v0, p0, Lay;->g:Z

    .line 25
    .line 26
    new-instance v1, Ls2;

    .line 27
    .line 28
    const/16 v2, 0xe

    .line 29
    .line 30
    invoke-direct {v1, v2, p0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lay;->j:Ls2;

    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    iput-object v1, p0, Lay;->k:Ljava/lang/String;

    .line 38
    .line 39
    const/high16 v1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    iput v1, p0, Lay;->l:F

    .line 42
    .line 43
    iput v1, p0, Lay;->m:F

    .line 44
    .line 45
    iput-boolean v0, p0, Lay;->n:Z

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Luq;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lay;->n:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    iget-object v1, v0, Lay;->b:[F

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lr60;->h()[F

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lay;->b:[F

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v1}, Lr60;->A([F)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 v3, 0x0

    .line 23
    invoke-static {v1, v3, v3}, Lr60;->C([FFF)V

    .line 24
    .line 25
    .line 26
    array-length v3, v1

    .line 27
    const/4 v4, 0x1

    .line 28
    const/4 v5, 0x7

    .line 29
    const/4 v6, 0x3

    .line 30
    const/4 v7, 0x6

    .line 31
    const/4 v8, 0x2

    .line 32
    const/4 v9, 0x5

    .line 33
    const/4 v10, 0x4

    .line 34
    const/16 v11, 0x10

    .line 35
    .line 36
    if-ge v3, v11, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-wide/16 v12, 0x0

    .line 40
    .line 41
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v14

    .line 45
    double-to-float v3, v14

    .line 46
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    double-to-float v12, v12

    .line 51
    aget v13, v1, v2

    .line 52
    .line 53
    aget v14, v1, v10

    .line 54
    .line 55
    mul-float v15, v12, v13

    .line 56
    .line 57
    mul-float v16, v3, v14

    .line 58
    .line 59
    add-float v16, v16, v15

    .line 60
    .line 61
    neg-float v15, v3

    .line 62
    mul-float/2addr v13, v15

    .line 63
    mul-float/2addr v14, v12

    .line 64
    add-float/2addr v14, v13

    .line 65
    aget v13, v1, v4

    .line 66
    .line 67
    aget v17, v1, v9

    .line 68
    .line 69
    mul-float v18, v12, v13

    .line 70
    .line 71
    mul-float v19, v3, v17

    .line 72
    .line 73
    add-float v19, v19, v18

    .line 74
    .line 75
    mul-float/2addr v13, v15

    .line 76
    mul-float v17, v17, v12

    .line 77
    .line 78
    add-float v17, v17, v13

    .line 79
    .line 80
    aget v13, v1, v8

    .line 81
    .line 82
    aget v18, v1, v7

    .line 83
    .line 84
    mul-float v20, v12, v13

    .line 85
    .line 86
    mul-float v21, v3, v18

    .line 87
    .line 88
    add-float v21, v21, v20

    .line 89
    .line 90
    mul-float/2addr v13, v15

    .line 91
    mul-float v18, v18, v12

    .line 92
    .line 93
    add-float v18, v18, v13

    .line 94
    .line 95
    aget v13, v1, v6

    .line 96
    .line 97
    aget v20, v1, v5

    .line 98
    .line 99
    mul-float v22, v12, v13

    .line 100
    .line 101
    mul-float v3, v3, v20

    .line 102
    .line 103
    add-float v3, v3, v22

    .line 104
    .line 105
    mul-float/2addr v15, v13

    .line 106
    mul-float v12, v12, v20

    .line 107
    .line 108
    add-float/2addr v12, v15

    .line 109
    aput v16, v1, v2

    .line 110
    .line 111
    aput v19, v1, v4

    .line 112
    .line 113
    aput v21, v1, v8

    .line 114
    .line 115
    aput v3, v1, v6

    .line 116
    .line 117
    aput v14, v1, v10

    .line 118
    .line 119
    aput v17, v1, v9

    .line 120
    .line 121
    aput v18, v1, v7

    .line 122
    .line 123
    aput v12, v1, v5

    .line 124
    .line 125
    :goto_1
    iget v3, v0, Lay;->l:F

    .line 126
    .line 127
    iget v12, v0, Lay;->m:F

    .line 128
    .line 129
    array-length v13, v1

    .line 130
    if-ge v13, v11, :cond_2

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    aget v11, v1, v2

    .line 134
    .line 135
    mul-float/2addr v11, v3

    .line 136
    aput v11, v1, v2

    .line 137
    .line 138
    aget v11, v1, v4

    .line 139
    .line 140
    mul-float/2addr v11, v3

    .line 141
    aput v11, v1, v4

    .line 142
    .line 143
    aget v4, v1, v8

    .line 144
    .line 145
    mul-float/2addr v4, v3

    .line 146
    aput v4, v1, v8

    .line 147
    .line 148
    aget v4, v1, v6

    .line 149
    .line 150
    mul-float/2addr v4, v3

    .line 151
    aput v4, v1, v6

    .line 152
    .line 153
    aget v3, v1, v10

    .line 154
    .line 155
    mul-float/2addr v3, v12

    .line 156
    aput v3, v1, v10

    .line 157
    .line 158
    aget v3, v1, v9

    .line 159
    .line 160
    mul-float/2addr v3, v12

    .line 161
    aput v3, v1, v9

    .line 162
    .line 163
    aget v3, v1, v7

    .line 164
    .line 165
    mul-float/2addr v3, v12

    .line 166
    aput v3, v1, v7

    .line 167
    .line 168
    aget v3, v1, v5

    .line 169
    .line 170
    mul-float/2addr v3, v12

    .line 171
    aput v3, v1, v5

    .line 172
    .line 173
    const/16 v3, 0x8

    .line 174
    .line 175
    aget v4, v1, v3

    .line 176
    .line 177
    const/high16 v5, 0x3f800000    # 1.0f

    .line 178
    .line 179
    mul-float/2addr v4, v5

    .line 180
    aput v4, v1, v3

    .line 181
    .line 182
    const/16 v3, 0x9

    .line 183
    .line 184
    aget v4, v1, v3

    .line 185
    .line 186
    mul-float/2addr v4, v5

    .line 187
    aput v4, v1, v3

    .line 188
    .line 189
    const/16 v3, 0xa

    .line 190
    .line 191
    aget v4, v1, v3

    .line 192
    .line 193
    mul-float/2addr v4, v5

    .line 194
    aput v4, v1, v3

    .line 195
    .line 196
    const/16 v3, 0xb

    .line 197
    .line 198
    aget v4, v1, v3

    .line 199
    .line 200
    mul-float/2addr v4, v5

    .line 201
    aput v4, v1, v3

    .line 202
    .line 203
    :goto_2
    const/high16 v3, -0x80000000

    .line 204
    .line 205
    invoke-static {v1, v3, v3}, Lr60;->C([FFF)V

    .line 206
    .line 207
    .line 208
    iput-boolean v2, v0, Lay;->n:Z

    .line 209
    .line 210
    :cond_3
    iget-boolean v1, v0, Lay;->g:Z

    .line 211
    .line 212
    if-eqz v1, :cond_6

    .line 213
    .line 214
    iget-object v1, v0, Lay;->f:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-nez v1, :cond_5

    .line 221
    .line 222
    iget-object v1, v0, Lay;->h:Ld6;

    .line 223
    .line 224
    if-nez v1, :cond_4

    .line 225
    .line 226
    invoke-static {}, Lf6;->a()Ld6;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iput-object v1, v0, Lay;->h:Ld6;

    .line 231
    .line 232
    :cond_4
    iget-object v3, v0, Lay;->f:Ljava/util/List;

    .line 233
    .line 234
    invoke-static {v3, v1}, Lr60;->B(Ljava/util/List;Ld6;)V

    .line 235
    .line 236
    .line 237
    :cond_5
    iput-boolean v2, v0, Lay;->g:Z

    .line 238
    .line 239
    :cond_6
    invoke-interface/range {p1 .. p1}, Luq;->t()Lo8;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v1}, Lo8;->h()J

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-interface {v5}, Lbd;->i()V

    .line 252
    .line 253
    .line 254
    :try_start_0
    iget-object v5, v1, Lo8;->a:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v5, Lx1;

    .line 257
    .line 258
    iget-object v5, v5, Lx1;->e:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v5, Lo8;

    .line 261
    .line 262
    iget-object v6, v0, Lay;->b:[F

    .line 263
    .line 264
    if-eqz v6, :cond_7

    .line 265
    .line 266
    invoke-virtual {v5}, Lo8;->f()Lbd;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-interface {v7, v6}, Lbd;->n([F)V

    .line 271
    .line 272
    .line 273
    :cond_7
    iget-object v6, v0, Lay;->h:Ld6;

    .line 274
    .line 275
    iget-object v7, v0, Lay;->f:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_8

    .line 282
    .line 283
    if-eqz v6, :cond_8

    .line 284
    .line 285
    invoke-virtual {v5}, Lo8;->f()Lbd;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-interface {v5, v6}, Lbd;->p(Ld6;)V

    .line 290
    .line 291
    .line 292
    :cond_8
    iget-object v0, v0, Lay;->c:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    :goto_3
    if-ge v2, v5, :cond_9

    .line 299
    .line 300
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    check-cast v6, Lbb1;

    .line 305
    .line 306
    move-object/from16 v7, p1

    .line 307
    .line 308
    invoke-virtual {v6, v7}, Lbb1;->a(Luq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    .line 310
    .line 311
    add-int/lit8 v2, v2, 0x1

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :catchall_0
    move-exception v0

    .line 315
    goto :goto_4

    .line 316
    :cond_9
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-interface {v0}, Lbd;->g()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v3, v4}, Lo8;->q(J)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :goto_4
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-interface {v2}, Lbd;->g()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v3, v4}, Lo8;->q(J)V

    .line 335
    .line 336
    .line 337
    throw v0
.end method

.method public final b()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Lay;->i:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Ls2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lay;->i:Lsw;

    .line 2
    .line 3
    return-void
.end method

.method public final e(ILbb1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lay;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0, p2}, Lay;->g(Lbb1;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lay;->j:Ls2;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lbb1;->d(Ls2;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lbb1;->c()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final f(J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lay;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    cmp-long v2, p1, v0

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    iget-wide v2, p0, Lay;->e:J

    .line 13
    .line 14
    cmp-long v0, v2, v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-wide p1, p0, Lay;->e:J

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget v0, Lib1;->a:I

    .line 22
    .line 23
    invoke-static {v2, v3}, Lff;->h(J)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p1, p2}, Lff;->h(J)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    cmpg-float v0, v0, v1

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-static {v2, v3}, Lff;->g(J)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {p1, p2}, Lff;->g(J)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    cmpg-float v0, v0, v1

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    invoke-static {v2, v3}, Lff;->e(J)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p1, p2}, Lff;->e(J)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    cmpg-float p1, v0, p1

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/4 p1, 0x0

    .line 61
    iput-boolean p1, p0, Lay;->d:Z

    .line 62
    .line 63
    sget-wide p1, Lff;->g:J

    .line 64
    .line 65
    iput-wide p1, p0, Lay;->e:J

    .line 66
    .line 67
    :cond_3
    :goto_0
    return-void
.end method

.method public final g(Lbb1;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lkp0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lkp0;

    .line 6
    .line 7
    iget-object p1, p1, Lkp0;->b:Lg31;

    .line 8
    .line 9
    iget-boolean v0, p0, Lay;->d:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-eqz p1, :cond_3

    .line 15
    .line 16
    iget-wide v0, p1, Lg31;->l:J

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Lay;->f(J)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    instance-of v0, p1, Lay;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    check-cast p1, Lay;

    .line 27
    .line 28
    iget-boolean v0, p1, Lay;->d:Z

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lay;->d:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-wide v0, p1, Lay;->e:J

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Lay;->f(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lay;->d:Z

    .line 44
    .line 45
    sget-wide v0, Lff;->g:J

    .line 46
    .line 47
    iput-wide v0, p0, Lay;->e:J

    .line 48
    .line 49
    :cond_3
    :goto_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VGroup: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lay;->k:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lay;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lbb1;

    .line 27
    .line 28
    const-string v4, "\t"

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, "\n"

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
