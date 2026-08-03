.class public final Lg2/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ly1/t;

.field public final b:Lac/k;

.field public final c:Lg2/e;

.field public final d:Lf/f0;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Lb0/c;

.field public i:J

.field public final j:Ld1/c0;

.field public final k:Le1/a;


# direct methods
.method public constructor <init>(Ly1/t;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/b;->a:Ly1/t;

    .line 5
    .line 6
    new-instance p1, Lac/k;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v0, v1}, Lac/k;-><init>(IC)V

    .line 11
    .line 12
    .line 13
    const/16 v0, 0xc0

    .line 14
    .line 15
    new-array v1, v0, [J

    .line 16
    .line 17
    iput-object v1, p1, Lac/k;->i:Ljava/lang/Object;

    .line 18
    .line 19
    new-array v0, v0, [J

    .line 20
    .line 21
    iput-object v0, p1, Lac/k;->j:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p1, p0, Lg2/b;->b:Lac/k;

    .line 24
    .line 25
    new-instance p1, Lg2/e;

    .line 26
    .line 27
    invoke-direct {p1}, Lg2/e;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lg2/b;->c:Lg2/e;

    .line 31
    .line 32
    new-instance p1, Lf/f0;

    .line 33
    .line 34
    invoke-direct {p1}, Lf/f0;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lg2/b;->d:Lf/f0;

    .line 38
    .line 39
    const-wide/16 v0, -0x1

    .line 40
    .line 41
    iput-wide v0, p0, Lg2/b;->i:J

    .line 42
    .line 43
    new-instance p1, Ld1/c0;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    invoke-direct {p1, p0, v0}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lg2/b;->j:Ld1/c0;

    .line 50
    .line 51
    new-instance p1, Le1/a;

    .line 52
    .line 53
    invoke-direct {p1}, Le1/a;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lg2/b;->k:Le1/a;

    .line 57
    .line 58
    return-void
.end method

.method public static c(Lx1/i1;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ly1/o1;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/o1;->b()[F

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lf1/c0;->o([F)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static e(Lx1/f0;)J
    .locals 5

    .line 1
    iget-object p0, p0, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object v0, p0, Lx1/b1;->d:Lx1/i1;

    .line 4
    .line 5
    iget-object p0, p0, Lx1/b1;->c:Lx1/r;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lg2/b;->c(Lx1/i1;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const-wide v0, 0x7fffffff7fffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide v0

    .line 25
    :cond_0
    iget-wide v3, p0, Lx1/i1;->F:J

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v4}, Lu2/j;->d(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    iget-object p0, p0, Lx1/i1;->w:Lx1/i1;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-wide v1
.end method

.method public static h(Lx1/f0;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx1/f0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 6
    .line 7
    iget-object v0, v0, Lx1/b1;->d:Lx1/i1;

    .line 8
    .line 9
    invoke-static {v0}, Lg2/b;->c(Lx1/i1;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lx1/f0;->i:Z

    .line 17
    .line 18
    iget-boolean v1, p0, Lx1/f0;->k:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lg2/b;->e(Lx1/f0;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iput-wide v1, p0, Lx1/f0;->j:J

    .line 27
    .line 28
    iput-boolean v0, p0, Lx1/f0;->k:Z

    .line 29
    .line 30
    :cond_0
    iget-wide v1, p0, Lx1/f0;->j:J

    .line 31
    .line 32
    const-wide v3, 0x7fffffff7fffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2, v3, v4}, Lu2/j;->b(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v1, p0, Lj0/b;->g:[Ljava/lang/Object;

    .line 48
    .line 49
    iget p0, p0, Lj0/b;->i:I

    .line 50
    .line 51
    :goto_0
    if-ge v0, p0, :cond_1

    .line 52
    .line 53
    aget-object v2, v1, v0

    .line 54
    .line 55
    check-cast v2, Lx1/f0;

    .line 56
    .line 57
    invoke-static {v2}, Lg2/b;->h(Lx1/f0;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg2/b;->h:Lb0/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lg2/b;->a:Ly1/t;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lg2/b;->h:Lb0/c;

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    iget-boolean v1, v0, Lg2/b;->e:Z

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v11, 0x0

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    iget-boolean v3, v0, Lg2/b;->f:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v12, v11

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    move v12, v2

    .line 33
    :goto_1
    iget-object v15, v0, Lg2/b;->b:Lac/k;

    .line 34
    .line 35
    move v3, v2

    .line 36
    iget-object v2, v0, Lg2/b;->c:Lg2/e;

    .line 37
    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    iput-boolean v11, v0, Lg2/b;->e:Z

    .line 41
    .line 42
    iget-object v1, v0, Lg2/b;->d:Lf/f0;

    .line 43
    .line 44
    iget-object v4, v1, Lf/f0;->a:[Ljava/lang/Object;

    .line 45
    .line 46
    iget v1, v1, Lf/f0;->b:I

    .line 47
    .line 48
    move v5, v11

    .line 49
    :goto_2
    if-ge v5, v1, :cond_3

    .line 50
    .line 51
    aget-object v6, v4, v5

    .line 52
    .line 53
    check-cast v6, Lfg/a;

    .line 54
    .line 55
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object v1, v15, Lac/k;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, [J

    .line 64
    .line 65
    iget v4, v15, Lac/k;->h:I

    .line 66
    .line 67
    move v5, v11

    .line 68
    :goto_3
    array-length v6, v1

    .line 69
    add-int/lit8 v6, v6, -0x2

    .line 70
    .line 71
    if-ge v5, v6, :cond_9

    .line 72
    .line 73
    if-ge v5, v4, :cond_9

    .line 74
    .line 75
    add-int/lit8 v6, v5, 0x2

    .line 76
    .line 77
    aget-wide v6, v1, v6

    .line 78
    .line 79
    const/16 v8, 0x3c

    .line 80
    .line 81
    move/from16 v16, v3

    .line 82
    .line 83
    move/from16 v17, v4

    .line 84
    .line 85
    shr-long v3, v6, v8

    .line 86
    .line 87
    long-to-int v3, v3

    .line 88
    and-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    if-eqz v3, :cond_8

    .line 91
    .line 92
    aget-wide v3, v1, v5

    .line 93
    .line 94
    add-int/lit8 v8, v5, 0x1

    .line 95
    .line 96
    const-wide/16 v28, 0x0

    .line 97
    .line 98
    aget-wide v13, v1, v8

    .line 99
    .line 100
    long-to-int v6, v6

    .line 101
    const v7, 0x1ffffff

    .line 102
    .line 103
    .line 104
    and-int/2addr v6, v7

    .line 105
    iget-object v7, v2, Lg2/e;->a:Lf/w;

    .line 106
    .line 107
    invoke-virtual {v7, v6}, Lf/k;->b(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    check-cast v6, Lg2/d;

    .line 112
    .line 113
    :goto_4
    if-eqz v6, :cond_7

    .line 114
    .line 115
    iget-object v7, v6, Lg2/d;->d:Lg2/d;

    .line 116
    .line 117
    move/from16 v30, v12

    .line 118
    .line 119
    iget-wide v11, v6, Lg2/d;->g:J

    .line 120
    .line 121
    sub-long v18, v9, v11

    .line 122
    .line 123
    cmp-long v8, v18, v28

    .line 124
    .line 125
    if-gez v8, :cond_5

    .line 126
    .line 127
    const-wide/high16 v18, -0x8000000000000000L

    .line 128
    .line 129
    cmp-long v8, v11, v18

    .line 130
    .line 131
    if-nez v8, :cond_4

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_4
    const/4 v8, 0x0

    .line 135
    goto :goto_6

    .line 136
    :cond_5
    :goto_5
    move/from16 v8, v16

    .line 137
    .line 138
    :goto_6
    iput-wide v3, v6, Lg2/d;->e:J

    .line 139
    .line 140
    iput-wide v13, v6, Lg2/d;->f:J

    .line 141
    .line 142
    if-eqz v8, :cond_6

    .line 143
    .line 144
    iput-wide v9, v6, Lg2/d;->g:J

    .line 145
    .line 146
    iget-wide v11, v2, Lg2/e;->d:J

    .line 147
    .line 148
    move-wide/from16 v19, v3

    .line 149
    .line 150
    iget-wide v3, v2, Lg2/e;->e:J

    .line 151
    .line 152
    iget-object v8, v2, Lg2/e;->g:[F

    .line 153
    .line 154
    move-wide/from16 v25, v3

    .line 155
    .line 156
    move-object/from16 v18, v6

    .line 157
    .line 158
    move-object/from16 v27, v8

    .line 159
    .line 160
    move-wide/from16 v23, v11

    .line 161
    .line 162
    move-wide/from16 v21, v13

    .line 163
    .line 164
    invoke-virtual/range {v18 .. v27}, Lg2/d;->a(JJJJ[F)V

    .line 165
    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_6
    move-wide/from16 v19, v3

    .line 169
    .line 170
    move-wide/from16 v21, v13

    .line 171
    .line 172
    :goto_7
    move-object v6, v7

    .line 173
    move-wide/from16 v3, v19

    .line 174
    .line 175
    move-wide/from16 v13, v21

    .line 176
    .line 177
    move/from16 v12, v30

    .line 178
    .line 179
    const/4 v11, 0x0

    .line 180
    goto :goto_4

    .line 181
    :cond_7
    :goto_8
    move/from16 v30, v12

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_8
    const-wide/16 v28, 0x0

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :goto_9
    add-int/lit8 v5, v5, 0x3

    .line 188
    .line 189
    move/from16 v3, v16

    .line 190
    .line 191
    move/from16 v4, v17

    .line 192
    .line 193
    move/from16 v12, v30

    .line 194
    .line 195
    const/4 v11, 0x0

    .line 196
    goto/16 :goto_3

    .line 197
    .line 198
    :cond_9
    move/from16 v30, v12

    .line 199
    .line 200
    const-wide/16 v28, 0x0

    .line 201
    .line 202
    iget-object v1, v15, Lac/k;->i:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, [J

    .line 205
    .line 206
    iget v3, v15, Lac/k;->h:I

    .line 207
    .line 208
    const/4 v4, 0x0

    .line 209
    :goto_a
    array-length v5, v1

    .line 210
    add-int/lit8 v5, v5, -0x2

    .line 211
    .line 212
    if-ge v4, v5, :cond_b

    .line 213
    .line 214
    if-ge v4, v3, :cond_b

    .line 215
    .line 216
    add-int/lit8 v5, v4, 0x2

    .line 217
    .line 218
    aget-wide v6, v1, v5

    .line 219
    .line 220
    const-wide v11, -0x1000000000000001L    # -3.1050361846014175E231

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v6, v11

    .line 226
    aput-wide v6, v1, v5

    .line 227
    .line 228
    add-int/lit8 v4, v4, 0x3

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_a
    move/from16 v30, v12

    .line 232
    .line 233
    const-wide/16 v28, 0x0

    .line 234
    .line 235
    :cond_b
    iget-boolean v1, v0, Lg2/b;->f:Z

    .line 236
    .line 237
    const/16 v16, 0x7

    .line 238
    .line 239
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    if-eqz v1, :cond_10

    .line 245
    .line 246
    const/4 v1, 0x0

    .line 247
    iput-boolean v1, v0, Lg2/b;->f:Z

    .line 248
    .line 249
    iget-wide v4, v2, Lg2/e;->d:J

    .line 250
    .line 251
    iget-wide v6, v2, Lg2/e;->e:J

    .line 252
    .line 253
    iget-object v8, v2, Lg2/e;->g:[F

    .line 254
    .line 255
    iget-object v1, v2, Lg2/e;->a:Lf/w;

    .line 256
    .line 257
    const-wide/16 v19, 0x80

    .line 258
    .line 259
    iget-object v11, v1, Lf/k;->c:[Ljava/lang/Object;

    .line 260
    .line 261
    iget-object v1, v1, Lf/k;->a:[J

    .line 262
    .line 263
    array-length v12, v1

    .line 264
    add-int/lit8 v12, v12, -0x2

    .line 265
    .line 266
    if-ltz v12, :cond_f

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/16 v14, 0x8

    .line 270
    .line 271
    const-wide/16 v21, 0xff

    .line 272
    .line 273
    :goto_b
    move-wide/from16 v23, v4

    .line 274
    .line 275
    aget-wide v3, v1, v13

    .line 276
    .line 277
    move v5, v14

    .line 278
    move-object/from16 v25, v15

    .line 279
    .line 280
    not-long v14, v3

    .line 281
    shl-long v14, v14, v16

    .line 282
    .line 283
    and-long/2addr v14, v3

    .line 284
    and-long v14, v14, v17

    .line 285
    .line 286
    cmp-long v14, v14, v17

    .line 287
    .line 288
    if-eqz v14, :cond_e

    .line 289
    .line 290
    sub-int v14, v13, v12

    .line 291
    .line 292
    not-int v14, v14

    .line 293
    ushr-int/lit8 v14, v14, 0x1f

    .line 294
    .line 295
    rsub-int/lit8 v14, v14, 0x8

    .line 296
    .line 297
    move-wide/from16 v26, v3

    .line 298
    .line 299
    const/4 v15, 0x0

    .line 300
    :goto_c
    if-ge v15, v14, :cond_d

    .line 301
    .line 302
    and-long v3, v26, v21

    .line 303
    .line 304
    cmp-long v3, v3, v19

    .line 305
    .line 306
    if-gez v3, :cond_c

    .line 307
    .line 308
    shl-int/lit8 v3, v13, 0x3

    .line 309
    .line 310
    add-int/2addr v3, v15

    .line 311
    aget-object v3, v11, v3

    .line 312
    .line 313
    check-cast v3, Lg2/d;

    .line 314
    .line 315
    :goto_d
    if-eqz v3, :cond_c

    .line 316
    .line 317
    move-object/from16 v31, v1

    .line 318
    .line 319
    move v1, v5

    .line 320
    move-wide/from16 v4, v23

    .line 321
    .line 322
    invoke-virtual/range {v2 .. v10}, Lg2/e;->a(Lg2/d;JJ[FJ)V

    .line 323
    .line 324
    .line 325
    iget-object v3, v3, Lg2/d;->d:Lg2/d;

    .line 326
    .line 327
    move v5, v1

    .line 328
    move-object/from16 v1, v31

    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_c
    move-object/from16 v31, v1

    .line 332
    .line 333
    move v1, v5

    .line 334
    move-wide/from16 v4, v23

    .line 335
    .line 336
    shr-long v26, v26, v1

    .line 337
    .line 338
    add-int/lit8 v15, v15, 0x1

    .line 339
    .line 340
    move-wide/from16 v23, v4

    .line 341
    .line 342
    move v5, v1

    .line 343
    move-object/from16 v1, v31

    .line 344
    .line 345
    goto :goto_c

    .line 346
    :cond_d
    move-object/from16 v31, v1

    .line 347
    .line 348
    move v1, v5

    .line 349
    move-wide/from16 v4, v23

    .line 350
    .line 351
    if-ne v14, v1, :cond_11

    .line 352
    .line 353
    goto :goto_e

    .line 354
    :cond_e
    move-object/from16 v31, v1

    .line 355
    .line 356
    move v1, v5

    .line 357
    move-wide/from16 v4, v23

    .line 358
    .line 359
    :goto_e
    if-eq v13, v12, :cond_11

    .line 360
    .line 361
    add-int/lit8 v13, v13, 0x1

    .line 362
    .line 363
    move v14, v1

    .line 364
    move-object/from16 v15, v25

    .line 365
    .line 366
    move-object/from16 v1, v31

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_f
    move-object/from16 v25, v15

    .line 370
    .line 371
    const/16 v1, 0x8

    .line 372
    .line 373
    goto :goto_f

    .line 374
    :cond_10
    move-object/from16 v25, v15

    .line 375
    .line 376
    const/16 v1, 0x8

    .line 377
    .line 378
    const-wide/16 v19, 0x80

    .line 379
    .line 380
    :goto_f
    const-wide/16 v21, 0xff

    .line 381
    .line 382
    :cond_11
    if-eqz v30, :cond_12

    .line 383
    .line 384
    iget-wide v4, v2, Lg2/e;->d:J

    .line 385
    .line 386
    iget-wide v6, v2, Lg2/e;->e:J

    .line 387
    .line 388
    iget-object v8, v2, Lg2/e;->g:[F

    .line 389
    .line 390
    iget-object v3, v2, Lg2/e;->b:Lg2/d;

    .line 391
    .line 392
    if-eqz v3, :cond_12

    .line 393
    .line 394
    :goto_10
    if-eqz v3, :cond_12

    .line 395
    .line 396
    iget-object v11, v3, Lg2/d;->b:Ls/d;

    .line 397
    .line 398
    invoke-static {v11}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-static {v11}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 403
    .line 404
    .line 405
    move-result-object v12

    .line 406
    check-cast v12, Ly1/t;

    .line 407
    .line 408
    invoke-virtual {v12}, Ly1/t;->getRectManager()Lg2/b;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    invoke-virtual {v12, v11}, Lg2/b;->b(Lx1/f0;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v12

    .line 416
    iput-wide v12, v3, Lg2/d;->e:J

    .line 417
    .line 418
    const/16 v23, 0x20

    .line 419
    .line 420
    shr-long v14, v12, v23

    .line 421
    .line 422
    long-to-int v14, v14

    .line 423
    iget-object v11, v11, Lx1/f0;->M:Lx1/j0;

    .line 424
    .line 425
    iget-object v11, v11, Lx1/j0;->p:Lx1/v0;

    .line 426
    .line 427
    iget v15, v11, Lv1/b1;->g:I

    .line 428
    .line 429
    add-int/2addr v15, v14

    .line 430
    const-wide v26, 0xffffffffL

    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    and-long v12, v12, v26

    .line 436
    .line 437
    long-to-int v12, v12

    .line 438
    iget v11, v11, Lv1/b1;->h:I

    .line 439
    .line 440
    add-int/2addr v11, v12

    .line 441
    int-to-long v12, v15

    .line 442
    shl-long v12, v12, v23

    .line 443
    .line 444
    int-to-long v14, v11

    .line 445
    and-long v14, v14, v26

    .line 446
    .line 447
    or-long v11, v12, v14

    .line 448
    .line 449
    iput-wide v11, v3, Lg2/d;->f:J

    .line 450
    .line 451
    invoke-virtual/range {v2 .. v10}, Lg2/e;->a(Lg2/d;JJ[FJ)V

    .line 452
    .line 453
    .line 454
    iget-object v3, v3, Lg2/d;->d:Lg2/d;

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_12
    iget-boolean v3, v0, Lg2/b;->g:Z

    .line 458
    .line 459
    if-eqz v3, :cond_15

    .line 460
    .line 461
    const/4 v3, 0x0

    .line 462
    iput-boolean v3, v0, Lg2/b;->g:Z

    .line 463
    .line 464
    move-object/from16 v4, v25

    .line 465
    .line 466
    iget-object v5, v4, Lac/k;->i:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v5, [J

    .line 469
    .line 470
    iget v6, v4, Lac/k;->h:I

    .line 471
    .line 472
    iget-object v7, v4, Lac/k;->j:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v7, [J

    .line 475
    .line 476
    move v8, v3

    .line 477
    move v11, v8

    .line 478
    :goto_11
    array-length v12, v5

    .line 479
    add-int/lit8 v12, v12, -0x2

    .line 480
    .line 481
    if-ge v8, v12, :cond_14

    .line 482
    .line 483
    array-length v12, v7

    .line 484
    add-int/lit8 v12, v12, -0x2

    .line 485
    .line 486
    if-ge v11, v12, :cond_14

    .line 487
    .line 488
    if-ge v8, v6, :cond_14

    .line 489
    .line 490
    add-int/lit8 v12, v8, 0x2

    .line 491
    .line 492
    aget-wide v13, v5, v12

    .line 493
    .line 494
    sget-wide v23, Lg2/a;->c:J

    .line 495
    .line 496
    cmp-long v13, v13, v23

    .line 497
    .line 498
    if-eqz v13, :cond_13

    .line 499
    .line 500
    aget-wide v13, v5, v8

    .line 501
    .line 502
    aput-wide v13, v7, v11

    .line 503
    .line 504
    add-int/lit8 v13, v11, 0x1

    .line 505
    .line 506
    add-int/lit8 v14, v8, 0x1

    .line 507
    .line 508
    aget-wide v14, v5, v14

    .line 509
    .line 510
    aput-wide v14, v7, v13

    .line 511
    .line 512
    add-int/lit8 v13, v11, 0x2

    .line 513
    .line 514
    aget-wide v14, v5, v12

    .line 515
    .line 516
    aput-wide v14, v7, v13

    .line 517
    .line 518
    add-int/lit8 v11, v11, 0x3

    .line 519
    .line 520
    :cond_13
    add-int/lit8 v8, v8, 0x3

    .line 521
    .line 522
    goto :goto_11

    .line 523
    :cond_14
    iput v11, v4, Lac/k;->h:I

    .line 524
    .line 525
    iput-object v7, v4, Lac/k;->i:Ljava/lang/Object;

    .line 526
    .line 527
    iput-object v5, v4, Lac/k;->j:Ljava/lang/Object;

    .line 528
    .line 529
    goto :goto_12

    .line 530
    :cond_15
    const/4 v3, 0x0

    .line 531
    :goto_12
    iget-wide v4, v2, Lg2/e;->c:J

    .line 532
    .line 533
    cmp-long v4, v4, v9

    .line 534
    .line 535
    if-lez v4, :cond_16

    .line 536
    .line 537
    goto :goto_17

    .line 538
    :cond_16
    iget-object v4, v2, Lg2/e;->a:Lf/w;

    .line 539
    .line 540
    iget-object v5, v4, Lf/k;->c:[Ljava/lang/Object;

    .line 541
    .line 542
    iget-object v4, v4, Lf/k;->a:[J

    .line 543
    .line 544
    array-length v6, v4

    .line 545
    add-int/lit8 v6, v6, -0x2

    .line 546
    .line 547
    if-ltz v6, :cond_1a

    .line 548
    .line 549
    move v7, v3

    .line 550
    :goto_13
    aget-wide v8, v4, v7

    .line 551
    .line 552
    not-long v10, v8

    .line 553
    shl-long v10, v10, v16

    .line 554
    .line 555
    and-long/2addr v10, v8

    .line 556
    and-long v10, v10, v17

    .line 557
    .line 558
    cmp-long v10, v10, v17

    .line 559
    .line 560
    if-eqz v10, :cond_19

    .line 561
    .line 562
    sub-int v10, v7, v6

    .line 563
    .line 564
    not-int v10, v10

    .line 565
    ushr-int/lit8 v10, v10, 0x1f

    .line 566
    .line 567
    rsub-int/lit8 v10, v10, 0x8

    .line 568
    .line 569
    move-wide v11, v8

    .line 570
    move v8, v3

    .line 571
    :goto_14
    if-ge v8, v10, :cond_18

    .line 572
    .line 573
    and-long v13, v11, v21

    .line 574
    .line 575
    cmp-long v9, v13, v19

    .line 576
    .line 577
    if-gez v9, :cond_17

    .line 578
    .line 579
    shl-int/lit8 v9, v7, 0x3

    .line 580
    .line 581
    add-int/2addr v9, v8

    .line 582
    aget-object v9, v5, v9

    .line 583
    .line 584
    check-cast v9, Lg2/d;

    .line 585
    .line 586
    :goto_15
    if-eqz v9, :cond_17

    .line 587
    .line 588
    iget-object v9, v9, Lg2/d;->d:Lg2/d;

    .line 589
    .line 590
    goto :goto_15

    .line 591
    :cond_17
    shr-long/2addr v11, v1

    .line 592
    add-int/lit8 v8, v8, 0x1

    .line 593
    .line 594
    goto :goto_14

    .line 595
    :cond_18
    if-ne v10, v1, :cond_1a

    .line 596
    .line 597
    :cond_19
    if-eq v7, v6, :cond_1a

    .line 598
    .line 599
    add-int/lit8 v7, v7, 0x1

    .line 600
    .line 601
    goto :goto_13

    .line 602
    :cond_1a
    iget-object v1, v2, Lg2/e;->b:Lg2/d;

    .line 603
    .line 604
    if-eqz v1, :cond_1b

    .line 605
    .line 606
    :goto_16
    if-eqz v1, :cond_1b

    .line 607
    .line 608
    iget-object v1, v1, Lg2/d;->d:Lg2/d;

    .line 609
    .line 610
    goto :goto_16

    .line 611
    :cond_1b
    const-wide/16 v3, -0x1

    .line 612
    .line 613
    iput-wide v3, v2, Lg2/e;->c:J

    .line 614
    .line 615
    :goto_17
    iget-wide v1, v2, Lg2/e;->c:J

    .line 616
    .line 617
    cmp-long v1, v1, v28

    .line 618
    .line 619
    if-lez v1, :cond_1c

    .line 620
    .line 621
    invoke-virtual {v0}, Lg2/b;->i()V

    .line 622
    .line 623
    .line 624
    :cond_1c
    return-void
.end method

.method public final b(Lx1/f0;)J
    .locals 9

    .line 1
    iget p1, p1, Lx1/f0;->h:I

    .line 2
    .line 3
    const v0, 0x1ffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    iget-object v1, p0, Lg2/b;->b:Lac/k;

    .line 8
    .line 9
    iget-object v2, v1, Lac/k;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [J

    .line 12
    .line 13
    iget v1, v1, Lac/k;->h:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    array-length v4, v2

    .line 17
    add-int/lit8 v4, v4, -0x2

    .line 18
    .line 19
    const-wide v5, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ge v3, v4, :cond_1

    .line 25
    .line 26
    if-ge v3, v1, :cond_1

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x2

    .line 29
    .line 30
    aget-wide v7, v2, v4

    .line 31
    .line 32
    long-to-int v4, v7

    .line 33
    and-int/2addr v4, v0

    .line 34
    if-ne v4, p1, :cond_0

    .line 35
    .line 36
    aget-wide v0, v2, v3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-wide v0, v5

    .line 43
    :goto_1
    cmp-long p1, v0, v5

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    const-wide v0, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    return-wide v0

    .line 53
    :cond_2
    const/16 p1, 0x20

    .line 54
    .line 55
    shr-long v2, v0, p1

    .line 56
    .line 57
    long-to-int v2, v2

    .line 58
    long-to-int v0, v0

    .line 59
    int-to-long v1, v2

    .line 60
    shl-long/2addr v1, p1

    .line 61
    int-to-long v3, v0

    .line 62
    const-wide v5, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v3, v5

    .line 68
    or-long v0, v1, v3

    .line 69
    .line 70
    return-wide v0
.end method

.method public final d(Lx1/f0;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, v1, Lx1/f0;->i:Z

    .line 7
    .line 8
    iget-object v3, v1, Lx1/f0;->L:Lx1/b1;

    .line 9
    .line 10
    iget-object v4, v3, Lx1/b1;->d:Lx1/i1;

    .line 11
    .line 12
    iget-object v5, v1, Lx1/f0;->M:Lx1/j0;

    .line 13
    .line 14
    iget-object v5, v5, Lx1/j0;->p:Lx1/v0;

    .line 15
    .line 16
    invoke-virtual {v5}, Lx1/v0;->w0()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-virtual {v5}, Lx1/v0;->r0()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    int-to-float v6, v6

    .line 25
    int-to-float v5, v5

    .line 26
    iget-object v7, v0, Lg2/b;->k:Le1/a;

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    iput v8, v7, Le1/a;->a:F

    .line 30
    .line 31
    iput v8, v7, Le1/a;->b:F

    .line 32
    .line 33
    iput v6, v7, Le1/a;->c:F

    .line 34
    .line 35
    iput v5, v7, Le1/a;->d:F

    .line 36
    .line 37
    :goto_0
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v8, 0x20

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v9, v4, Lx1/i1;->u:Lx1/f0;

    .line 47
    .line 48
    iget-object v10, v9, Lx1/f0;->L:Lx1/b1;

    .line 49
    .line 50
    iget-object v10, v10, Lx1/b1;->d:Lx1/i1;

    .line 51
    .line 52
    if-ne v4, v10, :cond_0

    .line 53
    .line 54
    iget-boolean v10, v9, Lx1/f0;->i:Z

    .line 55
    .line 56
    if-nez v10, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v9}, Lg2/b;->b(Lx1/f0;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    const-wide v11, 0x7fffffff7fffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v9, v10, v11, v12}, Lu2/j;->b(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-nez v11, :cond_0

    .line 72
    .line 73
    shr-long v11, v9, v8

    .line 74
    .line 75
    long-to-int v4, v11

    .line 76
    int-to-float v4, v4

    .line 77
    and-long/2addr v9, v5

    .line 78
    long-to-int v9, v9

    .line 79
    int-to-float v9, v9

    .line 80
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    int-to-long v10, v4

    .line 85
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    int-to-long v12, v4

    .line 90
    shl-long v9, v10, v8

    .line 91
    .line 92
    and-long v11, v12, v5

    .line 93
    .line 94
    or-long/2addr v9, v11

    .line 95
    invoke-virtual {v7, v9, v10}, Le1/a;->c(J)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    iget-object v9, v4, Lx1/i1;->R:Lx1/q1;

    .line 100
    .line 101
    if-eqz v9, :cond_1

    .line 102
    .line 103
    check-cast v9, Ly1/o1;

    .line 104
    .line 105
    invoke-virtual {v9}, Ly1/o1;->b()[F

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-static {v9}, Lf1/c0;->o([F)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-nez v10, :cond_1

    .line 114
    .line 115
    invoke-static {v9, v7}, Lf1/i0;->c([FLe1/a;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    iget-wide v9, v4, Lx1/i1;->F:J

    .line 119
    .line 120
    shr-long v11, v9, v8

    .line 121
    .line 122
    long-to-int v11, v11

    .line 123
    int-to-float v11, v11

    .line 124
    and-long/2addr v9, v5

    .line 125
    long-to-int v9, v9

    .line 126
    int-to-float v9, v9

    .line 127
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    int-to-long v10, v10

    .line 132
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    int-to-long v12, v9

    .line 137
    shl-long v8, v10, v8

    .line 138
    .line 139
    and-long/2addr v5, v12

    .line 140
    or-long/2addr v5, v8

    .line 141
    invoke-virtual {v7, v5, v6}, Le1/a;->c(J)V

    .line 142
    .line 143
    .line 144
    iget-object v4, v4, Lx1/i1;->w:Lx1/i1;

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    :goto_1
    iget v4, v7, Le1/a;->a:F

    .line 148
    .line 149
    float-to-int v11, v4

    .line 150
    iget v4, v7, Le1/a;->b:F

    .line 151
    .line 152
    float-to-int v12, v4

    .line 153
    iget v4, v7, Le1/a;->c:F

    .line 154
    .line 155
    float-to-int v13, v4

    .line 156
    iget v4, v7, Le1/a;->d:F

    .line 157
    .line 158
    float-to-int v14, v4

    .line 159
    iget v10, v1, Lx1/f0;->h:I

    .line 160
    .line 161
    iget-boolean v4, v1, Lx1/f0;->m:Z

    .line 162
    .line 163
    iput-boolean v2, v1, Lx1/f0;->m:Z

    .line 164
    .line 165
    iget-object v9, v0, Lg2/b;->b:Lac/k;

    .line 166
    .line 167
    if-eqz v4, :cond_4

    .line 168
    .line 169
    const v4, 0x1ffffff

    .line 170
    .line 171
    .line 172
    and-int v15, v10, v4

    .line 173
    .line 174
    move/from16 v16, v4

    .line 175
    .line 176
    iget-object v4, v9, Lac/k;->i:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v4, [J

    .line 179
    .line 180
    move-wide/from16 v17, v5

    .line 181
    .line 182
    iget v5, v9, Lac/k;->h:I

    .line 183
    .line 184
    move/from16 v19, v8

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    :goto_2
    array-length v8, v4

    .line 188
    add-int/lit8 v8, v8, -0x2

    .line 189
    .line 190
    if-ge v6, v8, :cond_4

    .line 191
    .line 192
    if-ge v6, v5, :cond_4

    .line 193
    .line 194
    add-int/lit8 v8, v6, 0x2

    .line 195
    .line 196
    move/from16 v20, v8

    .line 197
    .line 198
    aget-wide v7, v4, v20

    .line 199
    .line 200
    move/from16 v21, v2

    .line 201
    .line 202
    long-to-int v2, v7

    .line 203
    and-int v2, v2, v16

    .line 204
    .line 205
    if-ne v2, v15, :cond_3

    .line 206
    .line 207
    int-to-long v2, v11

    .line 208
    shl-long v2, v2, v19

    .line 209
    .line 210
    int-to-long v9, v12

    .line 211
    and-long v9, v9, v17

    .line 212
    .line 213
    or-long/2addr v2, v9

    .line 214
    aput-wide v2, v4, v6

    .line 215
    .line 216
    add-int/lit8 v6, v6, 0x1

    .line 217
    .line 218
    int-to-long v2, v13

    .line 219
    shl-long v2, v2, v19

    .line 220
    .line 221
    int-to-long v9, v14

    .line 222
    and-long v9, v9, v17

    .line 223
    .line 224
    or-long/2addr v2, v9

    .line 225
    aput-wide v2, v4, v6

    .line 226
    .line 227
    const/16 v2, 0x3f

    .line 228
    .line 229
    shr-long v2, v7, v2

    .line 230
    .line 231
    const-wide/16 v5, 0x1

    .line 232
    .line 233
    and-long/2addr v2, v5

    .line 234
    const/16 v5, 0x3c

    .line 235
    .line 236
    shl-long/2addr v2, v5

    .line 237
    or-long/2addr v2, v7

    .line 238
    aput-wide v2, v4, v20

    .line 239
    .line 240
    :goto_3
    const/4 v2, 0x0

    .line 241
    goto :goto_6

    .line 242
    :cond_3
    add-int/lit8 v6, v6, 0x3

    .line 243
    .line 244
    move/from16 v2, v21

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_4
    move/from16 v21, v2

    .line 248
    .line 249
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    if-eqz v2, :cond_5

    .line 254
    .line 255
    iget v2, v2, Lx1/f0;->h:I

    .line 256
    .line 257
    :goto_4
    move v15, v2

    .line 258
    goto :goto_5

    .line 259
    :cond_5
    const/4 v2, -0x1

    .line 260
    goto :goto_4

    .line 261
    :goto_5
    const/16 v2, 0x400

    .line 262
    .line 263
    invoke-virtual {v3, v2}, Lx1/b1;->d(I)Z

    .line 264
    .line 265
    .line 266
    move-result v16

    .line 267
    const/16 v2, 0x10

    .line 268
    .line 269
    invoke-virtual {v3, v2}, Lx1/b1;->d(I)Z

    .line 270
    .line 271
    .line 272
    move-result v17

    .line 273
    iget-object v2, v0, Lg2/b;->c:Lg2/e;

    .line 274
    .line 275
    iget-object v2, v2, Lg2/e;->a:Lf/w;

    .line 276
    .line 277
    invoke-virtual {v2, v10}, Lf/k;->a(I)Z

    .line 278
    .line 279
    .line 280
    move-result v18

    .line 281
    const/16 v19, 0x200

    .line 282
    .line 283
    invoke-static/range {v9 .. v19}, Lac/k;->A(Lac/k;IIIIIIZZZI)V

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :goto_6
    iput-boolean v2, v1, Lx1/f0;->l:Z

    .line 288
    .line 289
    move/from16 v3, v21

    .line 290
    .line 291
    iput-boolean v3, v0, Lg2/b;->e:Z

    .line 292
    .line 293
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iget-object v3, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 298
    .line 299
    iget v1, v1, Lj0/b;->i:I

    .line 300
    .line 301
    move v7, v2

    .line 302
    :goto_7
    if-ge v7, v1, :cond_7

    .line 303
    .line 304
    aget-object v2, v3, v7

    .line 305
    .line 306
    check-cast v2, Lx1/f0;

    .line 307
    .line 308
    invoke-virtual {v2}, Lx1/f0;->H()Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_6

    .line 313
    .line 314
    invoke-virtual {v0, v2}, Lg2/b;->d(Lx1/f0;)V

    .line 315
    .line 316
    .line 317
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_7
    return-void
.end method

.method public final f(Lx1/f0;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lx1/f0;->H()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lx1/f0;->L:Lx1/b1;

    .line 10
    .line 11
    if-eqz v2, :cond_11

    .line 12
    .line 13
    iget-boolean v2, v1, Lx1/f0;->l:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide v4, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-boolean v7, v2, Lx1/f0;->i:Z

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    iget-boolean v7, v2, Lx1/f0;->k:Z

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    iput-boolean v6, v2, Lx1/f0;->k:Z

    .line 40
    .line 41
    invoke-static {v2}, Lg2/b;->e(Lx1/f0;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    iput-wide v7, v2, Lx1/f0;->j:J

    .line 46
    .line 47
    :cond_1
    iget-wide v7, v2, Lx1/f0;->j:J

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-nez v2, :cond_3

    .line 51
    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-wide v7, v4

    .line 56
    :goto_0
    iget-object v9, v3, Lx1/b1;->d:Lx1/i1;

    .line 57
    .line 58
    invoke-static {v7, v8, v4, v5}, Lu2/j;->b(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_10

    .line 63
    .line 64
    invoke-static {v9}, Lg2/b;->c(Lx1/i1;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_10

    .line 69
    .line 70
    iget-boolean v4, v1, Lx1/f0;->i:Z

    .line 71
    .line 72
    if-nez v4, :cond_f

    .line 73
    .line 74
    iget-wide v9, v9, Lx1/i1;->F:J

    .line 75
    .line 76
    invoke-static {v7, v8, v9, v10}, Lu2/j;->d(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    iget-object v4, v1, Lx1/f0;->M:Lx1/j0;

    .line 81
    .line 82
    iget-object v4, v4, Lx1/j0;->p:Lx1/v0;

    .line 83
    .line 84
    invoke-virtual {v4}, Lx1/v0;->w0()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-virtual {v4}, Lx1/v0;->r0()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    iget v11, v1, Lx1/f0;->h:I

    .line 93
    .line 94
    iget-boolean v10, v1, Lx1/f0;->m:Z

    .line 95
    .line 96
    iget-object v12, v0, Lg2/b;->b:Lac/k;

    .line 97
    .line 98
    const v13, 0x1ffffff

    .line 99
    .line 100
    .line 101
    const-wide v14, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    const/16 v16, 0x20

    .line 107
    .line 108
    if-eqz v10, :cond_c

    .line 109
    .line 110
    const-wide/16 v17, 0x1

    .line 111
    .line 112
    const/16 v19, 0x3f

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    iget v2, v2, Lx1/f0;->h:I

    .line 117
    .line 118
    move/from16 v20, v4

    .line 119
    .line 120
    const/16 v21, 0x19

    .line 121
    .line 122
    shr-long v3, v7, v16

    .line 123
    .line 124
    long-to-int v3, v3

    .line 125
    and-long/2addr v7, v14

    .line 126
    long-to-int v4, v7

    .line 127
    and-int v7, v11, v13

    .line 128
    .line 129
    iget-object v8, v12, Lac/k;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v8, [J

    .line 132
    .line 133
    iget v11, v12, Lac/k;->h:I

    .line 134
    .line 135
    move v10, v6

    .line 136
    move/from16 v23, v13

    .line 137
    .line 138
    const/16 v22, 0x3c

    .line 139
    .line 140
    :goto_1
    array-length v13, v8

    .line 141
    add-int/lit8 v13, v13, -0x2

    .line 142
    .line 143
    if-ge v10, v13, :cond_7

    .line 144
    .line 145
    if-ge v10, v11, :cond_7

    .line 146
    .line 147
    add-int/lit8 v13, v10, 0x2

    .line 148
    .line 149
    move-wide/from16 v24, v14

    .line 150
    .line 151
    aget-wide v14, v8, v13

    .line 152
    .line 153
    long-to-int v13, v14

    .line 154
    and-int v13, v13, v23

    .line 155
    .line 156
    if-ne v13, v2, :cond_6

    .line 157
    .line 158
    aget-wide v13, v8, v10

    .line 159
    .line 160
    shr-long v5, v13, v16

    .line 161
    .line 162
    long-to-int v5, v5

    .line 163
    long-to-int v6, v13

    .line 164
    add-int/2addr v5, v3

    .line 165
    add-int/2addr v6, v4

    .line 166
    add-int v13, v5, v9

    .line 167
    .line 168
    add-int v14, v6, v20

    .line 169
    .line 170
    add-int/lit8 v10, v10, 0x3

    .line 171
    .line 172
    :goto_2
    array-length v15, v8

    .line 173
    add-int/lit8 v15, v15, -0x2

    .line 174
    .line 175
    if-ge v10, v15, :cond_6

    .line 176
    .line 177
    if-ge v10, v11, :cond_6

    .line 178
    .line 179
    add-int/lit8 v15, v10, 0x2

    .line 180
    .line 181
    move/from16 v26, v2

    .line 182
    .line 183
    move/from16 v27, v3

    .line 184
    .line 185
    aget-wide v2, v8, v15

    .line 186
    .line 187
    move/from16 v28, v4

    .line 188
    .line 189
    long-to-int v4, v2

    .line 190
    and-int v4, v4, v23

    .line 191
    .line 192
    if-ne v4, v7, :cond_5

    .line 193
    .line 194
    move-wide/from16 v29, v2

    .line 195
    .line 196
    aget-wide v2, v8, v10

    .line 197
    .line 198
    move-object v4, v8

    .line 199
    shr-long v7, v2, v16

    .line 200
    .line 201
    long-to-int v7, v7

    .line 202
    long-to-int v2, v2

    .line 203
    sub-int v3, v5, v7

    .line 204
    .line 205
    sub-int v2, v6, v2

    .line 206
    .line 207
    int-to-long v7, v5

    .line 208
    shl-long v7, v7, v16

    .line 209
    .line 210
    int-to-long v5, v6

    .line 211
    and-long v5, v5, v24

    .line 212
    .line 213
    or-long/2addr v5, v7

    .line 214
    aput-wide v5, v4, v10

    .line 215
    .line 216
    add-int/lit8 v5, v10, 0x1

    .line 217
    .line 218
    int-to-long v6, v13

    .line 219
    shl-long v6, v6, v16

    .line 220
    .line 221
    int-to-long v8, v14

    .line 222
    and-long v8, v8, v24

    .line 223
    .line 224
    or-long/2addr v6, v8

    .line 225
    aput-wide v6, v4, v5

    .line 226
    .line 227
    shr-long v5, v29, v19

    .line 228
    .line 229
    and-long v5, v5, v17

    .line 230
    .line 231
    shl-long v5, v5, v22

    .line 232
    .line 233
    or-long v5, v29, v5

    .line 234
    .line 235
    aput-wide v5, v4, v15

    .line 236
    .line 237
    if-nez v3, :cond_4

    .line 238
    .line 239
    if-eqz v2, :cond_7

    .line 240
    .line 241
    :cond_4
    add-int/lit8 v10, v10, 0x3

    .line 242
    .line 243
    sget-wide v4, Lg2/a;->b:J

    .line 244
    .line 245
    and-long v4, v29, v4

    .line 246
    .line 247
    and-int v6, v10, v23

    .line 248
    .line 249
    int-to-long v6, v6

    .line 250
    shl-long v6, v6, v21

    .line 251
    .line 252
    or-long/2addr v4, v6

    .line 253
    invoke-virtual {v12, v3, v2, v4, v5}, Lac/k;->O(IIJ)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_5
    move-object v4, v8

    .line 258
    add-int/lit8 v10, v10, 0x3

    .line 259
    .line 260
    move/from16 v2, v26

    .line 261
    .line 262
    move/from16 v3, v27

    .line 263
    .line 264
    move/from16 v4, v28

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_6
    move/from16 v26, v2

    .line 268
    .line 269
    move/from16 v27, v3

    .line 270
    .line 271
    move/from16 v28, v4

    .line 272
    .line 273
    move-object v4, v8

    .line 274
    add-int/lit8 v10, v10, 0x3

    .line 275
    .line 276
    move-object v8, v4

    .line 277
    move-wide/from16 v14, v24

    .line 278
    .line 279
    move/from16 v2, v26

    .line 280
    .line 281
    move/from16 v3, v27

    .line 282
    .line 283
    move/from16 v4, v28

    .line 284
    .line 285
    const/4 v6, 0x0

    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :cond_7
    :goto_3
    const/4 v2, 0x0

    .line 289
    goto/16 :goto_8

    .line 290
    .line 291
    :cond_8
    move/from16 v20, v4

    .line 292
    .line 293
    move/from16 v23, v13

    .line 294
    .line 295
    move-wide/from16 v24, v14

    .line 296
    .line 297
    const/16 v21, 0x19

    .line 298
    .line 299
    const/16 v22, 0x3c

    .line 300
    .line 301
    shr-long v2, v7, v16

    .line 302
    .line 303
    long-to-int v2, v2

    .line 304
    and-long v3, v7, v24

    .line 305
    .line 306
    long-to-int v3, v3

    .line 307
    add-int/2addr v9, v2

    .line 308
    add-int v4, v3, v20

    .line 309
    .line 310
    and-int v5, v11, v23

    .line 311
    .line 312
    iget-object v6, v12, Lac/k;->i:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v6, [J

    .line 315
    .line 316
    iget v7, v12, Lac/k;->h:I

    .line 317
    .line 318
    const/4 v8, 0x0

    .line 319
    :goto_4
    array-length v10, v6

    .line 320
    add-int/lit8 v10, v10, -0x2

    .line 321
    .line 322
    if-ge v8, v10, :cond_7

    .line 323
    .line 324
    if-ge v8, v7, :cond_7

    .line 325
    .line 326
    add-int/lit8 v10, v8, 0x2

    .line 327
    .line 328
    aget-wide v13, v6, v10

    .line 329
    .line 330
    long-to-int v11, v13

    .line 331
    and-int v11, v11, v23

    .line 332
    .line 333
    if-ne v11, v5, :cond_b

    .line 334
    .line 335
    move-object v11, v6

    .line 336
    aget-wide v5, v11, v8

    .line 337
    .line 338
    move v15, v8

    .line 339
    int-to-long v7, v2

    .line 340
    shl-long v7, v7, v16

    .line 341
    .line 342
    move-wide/from16 v26, v7

    .line 343
    .line 344
    int-to-long v7, v3

    .line 345
    and-long v7, v7, v24

    .line 346
    .line 347
    or-long v7, v26, v7

    .line 348
    .line 349
    aput-wide v7, v11, v15

    .line 350
    .line 351
    add-int/lit8 v8, v15, 0x1

    .line 352
    .line 353
    move/from16 v26, v2

    .line 354
    .line 355
    move/from16 v27, v3

    .line 356
    .line 357
    int-to-long v2, v9

    .line 358
    shl-long v2, v2, v16

    .line 359
    .line 360
    move-wide/from16 v28, v2

    .line 361
    .line 362
    int-to-long v2, v4

    .line 363
    and-long v2, v2, v24

    .line 364
    .line 365
    or-long v2, v28, v2

    .line 366
    .line 367
    aput-wide v2, v11, v8

    .line 368
    .line 369
    shr-long v2, v13, v19

    .line 370
    .line 371
    and-long v2, v2, v17

    .line 372
    .line 373
    shl-long v2, v2, v22

    .line 374
    .line 375
    or-long/2addr v2, v13

    .line 376
    aput-wide v2, v11, v10

    .line 377
    .line 378
    shr-long v2, v5, v16

    .line 379
    .line 380
    long-to-int v2, v2

    .line 381
    sub-int v2, v26, v2

    .line 382
    .line 383
    long-to-int v3, v5

    .line 384
    sub-int v3, v27, v3

    .line 385
    .line 386
    if-eqz v2, :cond_9

    .line 387
    .line 388
    const/4 v4, 0x1

    .line 389
    goto :goto_5

    .line 390
    :cond_9
    const/4 v4, 0x0

    .line 391
    :goto_5
    if-eqz v3, :cond_a

    .line 392
    .line 393
    const/4 v5, 0x1

    .line 394
    goto :goto_6

    .line 395
    :cond_a
    const/4 v5, 0x0

    .line 396
    :goto_6
    or-int/2addr v4, v5

    .line 397
    if-eqz v4, :cond_7

    .line 398
    .line 399
    add-int/lit8 v8, v15, 0x3

    .line 400
    .line 401
    sget-wide v4, Lg2/a;->b:J

    .line 402
    .line 403
    and-long/2addr v4, v13

    .line 404
    and-int v6, v8, v23

    .line 405
    .line 406
    int-to-long v6, v6

    .line 407
    shl-long v6, v6, v21

    .line 408
    .line 409
    or-long/2addr v4, v6

    .line 410
    invoke-virtual {v12, v2, v3, v4, v5}, Lac/k;->O(IIJ)V

    .line 411
    .line 412
    .line 413
    goto :goto_3

    .line 414
    :cond_b
    move/from16 v26, v2

    .line 415
    .line 416
    move/from16 v27, v3

    .line 417
    .line 418
    move-object v11, v6

    .line 419
    move v15, v8

    .line 420
    add-int/lit8 v8, v15, 0x3

    .line 421
    .line 422
    goto :goto_4

    .line 423
    :cond_c
    move/from16 v20, v4

    .line 424
    .line 425
    move/from16 v23, v13

    .line 426
    .line 427
    move-wide/from16 v24, v14

    .line 428
    .line 429
    const/4 v4, 0x1

    .line 430
    iput-boolean v4, v1, Lx1/f0;->m:Z

    .line 431
    .line 432
    const/16 v4, 0x400

    .line 433
    .line 434
    invoke-virtual {v3, v4}, Lx1/b1;->d(I)Z

    .line 435
    .line 436
    .line 437
    move-result v17

    .line 438
    const/16 v4, 0x10

    .line 439
    .line 440
    invoke-virtual {v3, v4}, Lx1/b1;->d(I)Z

    .line 441
    .line 442
    .line 443
    move-result v18

    .line 444
    iget-object v3, v0, Lg2/b;->c:Lg2/e;

    .line 445
    .line 446
    iget-object v3, v3, Lg2/e;->a:Lf/w;

    .line 447
    .line 448
    invoke-virtual {v3, v11}, Lf/k;->a(I)Z

    .line 449
    .line 450
    .line 451
    move-result v19

    .line 452
    if-eqz v2, :cond_e

    .line 453
    .line 454
    iget v2, v2, Lx1/f0;->h:I

    .line 455
    .line 456
    shr-long v3, v7, v16

    .line 457
    .line 458
    long-to-int v3, v3

    .line 459
    and-long v4, v7, v24

    .line 460
    .line 461
    long-to-int v4, v4

    .line 462
    and-int v13, v11, v23

    .line 463
    .line 464
    iget-object v5, v12, Lac/k;->i:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v5, [J

    .line 467
    .line 468
    iget v6, v12, Lac/k;->h:I

    .line 469
    .line 470
    add-int/lit8 v6, v6, -0x3

    .line 471
    .line 472
    move/from16 v22, v6

    .line 473
    .line 474
    :goto_7
    if-ltz v22, :cond_7

    .line 475
    .line 476
    add-int/lit8 v6, v22, 0x2

    .line 477
    .line 478
    aget-wide v6, v5, v6

    .line 479
    .line 480
    long-to-int v6, v6

    .line 481
    and-int v6, v6, v23

    .line 482
    .line 483
    if-ne v6, v2, :cond_d

    .line 484
    .line 485
    aget-wide v6, v5, v22

    .line 486
    .line 487
    shr-long v10, v6, v16

    .line 488
    .line 489
    long-to-int v5, v10

    .line 490
    long-to-int v6, v6

    .line 491
    add-int v14, v5, v3

    .line 492
    .line 493
    add-int v15, v6, v4

    .line 494
    .line 495
    add-int v16, v14, v9

    .line 496
    .line 497
    add-int v4, v15, v20

    .line 498
    .line 499
    move/from16 v20, v18

    .line 500
    .line 501
    move/from16 v21, v19

    .line 502
    .line 503
    move/from16 v18, v2

    .line 504
    .line 505
    move/from16 v19, v17

    .line 506
    .line 507
    move/from16 v17, v4

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v22}, Lac/k;->z(IIIIIIZZZI)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_3

    .line 513
    .line 514
    :cond_d
    move-object v10, v12

    .line 515
    add-int/lit8 v22, v22, -0x3

    .line 516
    .line 517
    goto :goto_7

    .line 518
    :cond_e
    move-object v10, v12

    .line 519
    shr-long v2, v7, v16

    .line 520
    .line 521
    long-to-int v12, v2

    .line 522
    and-long v2, v7, v24

    .line 523
    .line 524
    long-to-int v13, v2

    .line 525
    add-int v14, v12, v9

    .line 526
    .line 527
    add-int v15, v13, v20

    .line 528
    .line 529
    const/16 v16, 0x0

    .line 530
    .line 531
    const/16 v20, 0x220

    .line 532
    .line 533
    invoke-static/range {v10 .. v20}, Lac/k;->A(Lac/k;IIIIIIZZZI)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_3

    .line 537
    .line 538
    :cond_f
    invoke-virtual/range {p0 .. p1}, Lg2/b;->d(Lx1/f0;)V

    .line 539
    .line 540
    .line 541
    invoke-static {v1}, Lg2/b;->h(Lx1/f0;)V

    .line 542
    .line 543
    .line 544
    goto/16 :goto_3

    .line 545
    .line 546
    :cond_10
    invoke-virtual/range {p0 .. p1}, Lg2/b;->d(Lx1/f0;)V

    .line 547
    .line 548
    .line 549
    goto/16 :goto_3

    .line 550
    .line 551
    :goto_8
    iput-boolean v2, v1, Lx1/f0;->l:Z

    .line 552
    .line 553
    const/4 v4, 0x1

    .line 554
    iput-boolean v4, v0, Lg2/b;->e:Z

    .line 555
    .line 556
    invoke-virtual {v0}, Lg2/b;->i()V

    .line 557
    .line 558
    .line 559
    :cond_11
    :goto_9
    return-void
.end method

.method public final g(Lx1/f0;)V
    .locals 10

    .line 1
    iget-boolean v0, p1, Lx1/f0;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v0, p1, Lx1/f0;->h:I

    .line 6
    .line 7
    const v1, 0x1ffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v2, p0, Lg2/b;->b:Lac/k;

    .line 12
    .line 13
    iget-object v3, v2, Lac/k;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [J

    .line 16
    .line 17
    iget v2, v2, Lac/k;->h:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    array-length v6, v3

    .line 22
    add-int/lit8 v6, v6, -0x2

    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    if-ge v5, v6, :cond_1

    .line 26
    .line 27
    if-ge v5, v2, :cond_1

    .line 28
    .line 29
    add-int/lit8 v6, v5, 0x2

    .line 30
    .line 31
    aget-wide v8, v3, v6

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    and-int/2addr v8, v1

    .line 35
    if-ne v8, v0, :cond_0

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    aput-wide v0, v3, v5

    .line 40
    .line 41
    add-int/2addr v5, v7

    .line 42
    aput-wide v0, v3, v5

    .line 43
    .line 44
    sget-wide v0, Lg2/a;->c:J

    .line 45
    .line 46
    aput-wide v0, v3, v6

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v5, v5, 0x3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iput-boolean v4, p1, Lx1/f0;->m:Z

    .line 53
    .line 54
    iput-boolean v7, p1, Lx1/f0;->l:Z

    .line 55
    .line 56
    iput-boolean v7, p0, Lg2/b;->e:Z

    .line 57
    .line 58
    iput-boolean v7, p0, Lg2/b;->g:Z

    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final i()V
    .locals 8

    .line 1
    iget-object v0, p0, Lg2/b;->h:Lb0/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, Lg2/b;->c:Lg2/e;

    .line 9
    .line 10
    iget-wide v2, v2, Lg2/e;->c:J

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    if-gez v4, :cond_1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-wide v4, p0, Lg2/b;->i:J

    .line 22
    .line 23
    cmp-long v4, v4, v2

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    :goto_1
    return-void

    .line 30
    :cond_2
    iget-object v1, p0, Lg2/b;->a:Ly1/t;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    const/16 v0, 0x10

    .line 42
    .line 43
    int-to-long v6, v0

    .line 44
    add-long/2addr v6, v4

    .line 45
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    iput-wide v2, p0, Lg2/b;->i:J

    .line 50
    .line 51
    sub-long/2addr v2, v4

    .line 52
    new-instance v0, Lb0/c;

    .line 53
    .line 54
    const/4 v4, 0x6

    .line 55
    iget-object v5, p0, Lg2/b;->j:Ld1/c0;

    .line 56
    .line 57
    invoke-direct {v0, v5, v4}, Lb0/c;-><init>(Lfg/a;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lg2/b;->h:Lb0/c;

    .line 64
    .line 65
    return-void
.end method
