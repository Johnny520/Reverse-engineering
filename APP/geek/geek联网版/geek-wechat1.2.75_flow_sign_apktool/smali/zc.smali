.class public final Lzc;
.super Lyc;


# instance fields
.field public d0:Ljava/util/ArrayList;

.field public final e0:Lr5;

.field public final f0:Ljg;

.field public g0:Lqc;

.field public h0:Z

.field public final i0:Ler;

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:[Lf9;

.field public o0:[Lf9;

.field public p0:I

.field public q0:Z

.field public r0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lyc;-><init>()V

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
    iput-object v0, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lr5;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lr5;-><init>(Lzc;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lzc;->e0:Lr5;

    .line 17
    .line 18
    new-instance v0, Ljg;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, Ljg;->b:Z

    .line 25
    .line 26
    iput-boolean v1, v0, Ljg;->c:Z

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Ljg;->e:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    iput-object v1, v0, Ljg;->f:Lqc;

    .line 42
    .line 43
    new-instance v2, Lu7;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v2, v0, Ljg;->g:Lu7;

    .line 49
    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v2, v0, Ljg;->h:Ljava/util/ArrayList;

    .line 56
    .line 57
    iput-object p0, v0, Ljg;->a:Lzc;

    .line 58
    .line 59
    iput-object p0, v0, Ljg;->d:Lzc;

    .line 60
    .line 61
    iput-object v0, p0, Lzc;->f0:Ljg;

    .line 62
    .line 63
    iput-object v1, p0, Lzc;->g0:Lqc;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Lzc;->h0:Z

    .line 67
    .line 68
    new-instance v1, Ler;

    .line 69
    .line 70
    invoke-direct {v1}, Ler;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lzc;->i0:Ler;

    .line 74
    .line 75
    iput v0, p0, Lzc;->l0:I

    .line 76
    .line 77
    iput v0, p0, Lzc;->m0:I

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    new-array v2, v1, [Lf9;

    .line 81
    .line 82
    iput-object v2, p0, Lzc;->n0:[Lf9;

    .line 83
    .line 84
    new-array v1, v1, [Lf9;

    .line 85
    .line 86
    iput-object v1, p0, Lzc;->o0:[Lf9;

    .line 87
    .line 88
    const/16 v1, 0x107

    .line 89
    .line 90
    iput v1, p0, Lzc;->p0:I

    .line 91
    .line 92
    iput-boolean v0, p0, Lzc;->q0:Z

    .line 93
    .line 94
    iput-boolean v0, p0, Lzc;->r0:Z

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final B(Lyc;I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_1

    .line 3
    .line 4
    iget p2, p0, Lzc;->l0:I

    .line 5
    .line 6
    add-int/2addr p2, v0

    .line 7
    iget-object v1, p0, Lzc;->o0:[Lf9;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-lt p2, v2, :cond_0

    .line 11
    .line 12
    array-length p2, v1

    .line 13
    mul-int/lit8 p2, p2, 0x2

    .line 14
    .line 15
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, [Lf9;

    .line 20
    .line 21
    iput-object p2, p0, Lzc;->o0:[Lf9;

    .line 22
    .line 23
    :cond_0
    iget-object p2, p0, Lzc;->o0:[Lf9;

    .line 24
    .line 25
    iget v1, p0, Lzc;->l0:I

    .line 26
    .line 27
    new-instance v2, Lf9;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    iget-boolean v4, p0, Lzc;->h0:Z

    .line 31
    .line 32
    invoke-direct {v2, p1, v3, v4}, Lf9;-><init>(Lyc;IZ)V

    .line 33
    .line 34
    .line 35
    aput-object v2, p2, v1

    .line 36
    .line 37
    add-int/2addr v1, v0

    .line 38
    iput v1, p0, Lzc;->l0:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    if-ne p2, v0, :cond_3

    .line 42
    .line 43
    iget p2, p0, Lzc;->m0:I

    .line 44
    .line 45
    add-int/2addr p2, v0

    .line 46
    iget-object v1, p0, Lzc;->n0:[Lf9;

    .line 47
    .line 48
    array-length v2, v1

    .line 49
    if-lt p2, v2, :cond_2

    .line 50
    .line 51
    array-length p2, v1

    .line 52
    mul-int/lit8 p2, p2, 0x2

    .line 53
    .line 54
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, [Lf9;

    .line 59
    .line 60
    iput-object p2, p0, Lzc;->n0:[Lf9;

    .line 61
    .line 62
    :cond_2
    iget-object p2, p0, Lzc;->n0:[Lf9;

    .line 63
    .line 64
    iget v1, p0, Lzc;->m0:I

    .line 65
    .line 66
    new-instance v2, Lf9;

    .line 67
    .line 68
    iget-boolean v3, p0, Lzc;->h0:Z

    .line 69
    .line 70
    invoke-direct {v2, p1, v0, v3}, Lf9;-><init>(Lyc;IZ)V

    .line 71
    .line 72
    .line 73
    aput-object v2, p2, v1

    .line 74
    .line 75
    add-int/2addr v1, v0

    .line 76
    iput v1, p0, Lzc;->m0:I

    .line 77
    .line 78
    :cond_3
    return-void
.end method

.method public final C(Ler;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, Lyc;->a(Ler;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lzc;->d0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    move v5, v4

    .line 17
    :goto_0
    const/4 v6, 0x1

    .line 18
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    iget-object v7, v0, Lzc;->d0:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    check-cast v7, Lyc;

    .line 27
    .line 28
    iget-object v8, v7, Lyc;->H:[Z

    .line 29
    .line 30
    aput-boolean v3, v8, v3

    .line 31
    .line 32
    aput-boolean v3, v8, v6

    .line 33
    .line 34
    instance-of v7, v7, Lo7;

    .line 35
    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    move v5, v6

    .line 39
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v4, 0x2

    .line 43
    if-eqz v5, :cond_7

    .line 44
    .line 45
    move v5, v3

    .line 46
    :goto_1
    if-ge v5, v2, :cond_7

    .line 47
    .line 48
    iget-object v7, v0, Lzc;->d0:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    check-cast v7, Lyc;

    .line 55
    .line 56
    instance-of v8, v7, Lo7;

    .line 57
    .line 58
    if-eqz v8, :cond_6

    .line 59
    .line 60
    check-cast v7, Lo7;

    .line 61
    .line 62
    move v8, v3

    .line 63
    :goto_2
    iget v9, v7, Lso;->e0:I

    .line 64
    .line 65
    if-ge v8, v9, :cond_6

    .line 66
    .line 67
    iget-object v9, v7, Lso;->d0:[Lyc;

    .line 68
    .line 69
    aget-object v9, v9, v8

    .line 70
    .line 71
    iget v10, v7, Lo7;->f0:I

    .line 72
    .line 73
    if-eqz v10, :cond_4

    .line 74
    .line 75
    if-ne v10, v6, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    if-eq v10, v4, :cond_3

    .line 79
    .line 80
    const/4 v11, 0x3

    .line 81
    if-ne v10, v11, :cond_5

    .line 82
    .line 83
    :cond_3
    iget-object v9, v9, Lyc;->H:[Z

    .line 84
    .line 85
    aput-boolean v6, v9, v6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    :goto_3
    iget-object v9, v9, Lyc;->H:[Z

    .line 89
    .line 90
    aput-boolean v6, v9, v3

    .line 91
    .line 92
    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    move v5, v3

    .line 99
    :goto_5
    if-ge v5, v2, :cond_a

    .line 100
    .line 101
    iget-object v7, v0, Lzc;->d0:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Lyc;

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    instance-of v8, v7, Ltk;

    .line 113
    .line 114
    if-nez v8, :cond_8

    .line 115
    .line 116
    instance-of v8, v7, Lko;

    .line 117
    .line 118
    if-eqz v8, :cond_9

    .line 119
    .line 120
    :cond_8
    invoke-virtual {v7, v1}, Lyc;->a(Ler;)V

    .line 121
    .line 122
    .line 123
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_a
    move v5, v3

    .line 127
    :goto_6
    if-ge v5, v2, :cond_16

    .line 128
    .line 129
    iget-object v7, v0, Lzc;->d0:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Lyc;

    .line 136
    .line 137
    instance-of v8, v7, Lzc;

    .line 138
    .line 139
    if-eqz v8, :cond_f

    .line 140
    .line 141
    iget-object v8, v7, Lyc;->c0:[I

    .line 142
    .line 143
    aget v9, v8, v3

    .line 144
    .line 145
    aget v8, v8, v6

    .line 146
    .line 147
    if-ne v9, v4, :cond_b

    .line 148
    .line 149
    invoke-virtual {v7, v6}, Lyc;->w(I)V

    .line 150
    .line 151
    .line 152
    :cond_b
    if-ne v8, v4, :cond_c

    .line 153
    .line 154
    invoke-virtual {v7, v6}, Lyc;->x(I)V

    .line 155
    .line 156
    .line 157
    :cond_c
    invoke-virtual {v7, v1}, Lyc;->a(Ler;)V

    .line 158
    .line 159
    .line 160
    if-ne v9, v4, :cond_d

    .line 161
    .line 162
    invoke-virtual {v7, v9}, Lyc;->w(I)V

    .line 163
    .line 164
    .line 165
    :cond_d
    if-ne v8, v4, :cond_e

    .line 166
    .line 167
    invoke-virtual {v7, v8}, Lyc;->x(I)V

    .line 168
    .line 169
    .line 170
    :cond_e
    move/from16 v16, v6

    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :cond_f
    const/4 v8, -0x1

    .line 175
    iput v8, v7, Lyc;->h:I

    .line 176
    .line 177
    iget-object v9, v7, Lyc;->B:Llc;

    .line 178
    .line 179
    iget-object v10, v7, Lyc;->c0:[I

    .line 180
    .line 181
    iget-object v11, v7, Lyc;->A:Llc;

    .line 182
    .line 183
    iget-object v12, v7, Lyc;->y:Llc;

    .line 184
    .line 185
    iget-object v13, v7, Lyc;->z:Llc;

    .line 186
    .line 187
    iget-object v14, v7, Lyc;->x:Llc;

    .line 188
    .line 189
    iput v8, v7, Lyc;->i:I

    .line 190
    .line 191
    iget-object v8, v0, Lyc;->c0:[I

    .line 192
    .line 193
    aget v15, v8, v3

    .line 194
    .line 195
    move/from16 v16, v6

    .line 196
    .line 197
    const/4 v6, 0x4

    .line 198
    if-eq v15, v4, :cond_10

    .line 199
    .line 200
    aget v15, v10, v3

    .line 201
    .line 202
    if-ne v15, v6, :cond_10

    .line 203
    .line 204
    iget v15, v14, Llc;->e:I

    .line 205
    .line 206
    invoke-virtual {v0}, Lyc;->l()I

    .line 207
    .line 208
    .line 209
    move-result v17

    .line 210
    iget v3, v13, Llc;->e:I

    .line 211
    .line 212
    sub-int v3, v17, v3

    .line 213
    .line 214
    invoke-virtual {v1, v14}, Ler;->j(Ljava/lang/Object;)Lh40;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    iput-object v6, v14, Llc;->g:Lh40;

    .line 219
    .line 220
    invoke-virtual {v1, v13}, Ler;->j(Ljava/lang/Object;)Lh40;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    iput-object v6, v13, Llc;->g:Lh40;

    .line 225
    .line 226
    iget-object v6, v14, Llc;->g:Lh40;

    .line 227
    .line 228
    invoke-virtual {v1, v6, v15}, Ler;->d(Lh40;I)V

    .line 229
    .line 230
    .line 231
    iget-object v6, v13, Llc;->g:Lh40;

    .line 232
    .line 233
    invoke-virtual {v1, v6, v3}, Ler;->d(Lh40;I)V

    .line 234
    .line 235
    .line 236
    iput v4, v7, Lyc;->h:I

    .line 237
    .line 238
    iput v15, v7, Lyc;->N:I

    .line 239
    .line 240
    sub-int/2addr v3, v15

    .line 241
    iput v3, v7, Lyc;->J:I

    .line 242
    .line 243
    iget v6, v7, Lyc;->Q:I

    .line 244
    .line 245
    if-ge v3, v6, :cond_10

    .line 246
    .line 247
    iput v6, v7, Lyc;->J:I

    .line 248
    .line 249
    :cond_10
    aget v3, v8, v16

    .line 250
    .line 251
    if-eq v3, v4, :cond_13

    .line 252
    .line 253
    aget v3, v10, v16

    .line 254
    .line 255
    const/4 v6, 0x4

    .line 256
    if-ne v3, v6, :cond_13

    .line 257
    .line 258
    iget v3, v12, Llc;->e:I

    .line 259
    .line 260
    invoke-virtual {v0}, Lyc;->i()I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    iget v8, v11, Llc;->e:I

    .line 265
    .line 266
    sub-int/2addr v6, v8

    .line 267
    invoke-virtual {v1, v12}, Ler;->j(Ljava/lang/Object;)Lh40;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    iput-object v8, v12, Llc;->g:Lh40;

    .line 272
    .line 273
    invoke-virtual {v1, v11}, Ler;->j(Ljava/lang/Object;)Lh40;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    iput-object v8, v11, Llc;->g:Lh40;

    .line 278
    .line 279
    iget-object v8, v12, Llc;->g:Lh40;

    .line 280
    .line 281
    invoke-virtual {v1, v8, v3}, Ler;->d(Lh40;I)V

    .line 282
    .line 283
    .line 284
    iget-object v8, v11, Llc;->g:Lh40;

    .line 285
    .line 286
    invoke-virtual {v1, v8, v6}, Ler;->d(Lh40;I)V

    .line 287
    .line 288
    .line 289
    iget v8, v7, Lyc;->P:I

    .line 290
    .line 291
    if-gtz v8, :cond_11

    .line 292
    .line 293
    iget v8, v7, Lyc;->V:I

    .line 294
    .line 295
    const/16 v10, 0x8

    .line 296
    .line 297
    if-ne v8, v10, :cond_12

    .line 298
    .line 299
    :cond_11
    invoke-virtual {v1, v9}, Ler;->j(Ljava/lang/Object;)Lh40;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    iput-object v8, v9, Llc;->g:Lh40;

    .line 304
    .line 305
    iget v9, v7, Lyc;->P:I

    .line 306
    .line 307
    add-int/2addr v9, v3

    .line 308
    invoke-virtual {v1, v8, v9}, Ler;->d(Lh40;I)V

    .line 309
    .line 310
    .line 311
    :cond_12
    iput v4, v7, Lyc;->i:I

    .line 312
    .line 313
    iput v3, v7, Lyc;->O:I

    .line 314
    .line 315
    sub-int/2addr v6, v3

    .line 316
    iput v6, v7, Lyc;->K:I

    .line 317
    .line 318
    iget v3, v7, Lyc;->R:I

    .line 319
    .line 320
    if-ge v6, v3, :cond_13

    .line 321
    .line 322
    iput v3, v7, Lyc;->K:I

    .line 323
    .line 324
    :cond_13
    instance-of v3, v7, Ltk;

    .line 325
    .line 326
    if-nez v3, :cond_15

    .line 327
    .line 328
    instance-of v3, v7, Lko;

    .line 329
    .line 330
    if-eqz v3, :cond_14

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_14
    invoke-virtual {v7, v1}, Lyc;->a(Ler;)V

    .line 334
    .line 335
    .line 336
    :cond_15
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 337
    .line 338
    move/from16 v6, v16

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    goto/16 :goto_6

    .line 342
    .line 343
    :cond_16
    move/from16 v16, v6

    .line 344
    .line 345
    iget v2, v0, Lzc;->l0:I

    .line 346
    .line 347
    if-lez v2, :cond_17

    .line 348
    .line 349
    const/4 v2, 0x0

    .line 350
    invoke-static {v0, v1, v2}, Lg80;->a(Lzc;Ler;I)V

    .line 351
    .line 352
    .line 353
    :cond_17
    iget v2, v0, Lzc;->m0:I

    .line 354
    .line 355
    if-lez v2, :cond_18

    .line 356
    .line 357
    move/from16 v2, v16

    .line 358
    .line 359
    invoke-static {v0, v1, v2}, Lg80;->a(Lzc;Ler;I)V

    .line 360
    .line 361
    .line 362
    :cond_18
    return-void
.end method

.method public final D(IZ)Z
    .locals 19

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lzc;->f0:Ljg;

    .line 6
    .line 7
    iget-object v3, v2, Ljg;->e:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v4, v2, Ljg;->a:Lzc;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-virtual {v4, v5}, Lyc;->h(I)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v7, v4, Lyc;->c0:[I

    .line 17
    .line 18
    iget-object v8, v4, Lyc;->e:Lr90;

    .line 19
    .line 20
    iget-object v9, v4, Lyc;->d:Lto;

    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    invoke-virtual {v4, v10}, Lyc;->h(I)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    invoke-virtual {v4}, Lyc;->m()I

    .line 28
    .line 29
    .line 30
    move-result v12

    .line 31
    invoke-virtual {v4}, Lyc;->n()I

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    const/4 v14, 0x2

    .line 38
    if-eq v6, v14, :cond_0

    .line 39
    .line 40
    if-ne v11, v14, :cond_4

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v15

    .line 46
    :goto_0
    if-ge v5, v15, :cond_2

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v17

    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    move-object/from16 v10, v17

    .line 55
    .line 56
    check-cast v10, Lvb0;

    .line 57
    .line 58
    iget v14, v10, Lvb0;->f:I

    .line 59
    .line 60
    if-ne v14, v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v10}, Lvb0;->k()Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/4 v10, 0x1

    .line 71
    const/4 v14, 0x2

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move/from16 v5, p2

    .line 74
    .line 75
    :goto_1
    if-nez v0, :cond_3

    .line 76
    .line 77
    if-eqz v5, :cond_4

    .line 78
    .line 79
    const/4 v10, 0x2

    .line 80
    if-ne v6, v10, :cond_4

    .line 81
    .line 82
    const/4 v14, 0x1

    .line 83
    invoke-virtual {v4, v14}, Lyc;->w(I)V

    .line 84
    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-virtual {v2, v4, v5}, Ljg;->d(Lzc;I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-virtual {v4, v10}, Lyc;->y(I)V

    .line 92
    .line 93
    .line 94
    iget-object v5, v9, Lvb0;->e:Lug;

    .line 95
    .line 96
    invoke-virtual {v4}, Lyc;->l()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    invoke-virtual {v5, v10}, Lug;->d(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    const/4 v10, 0x2

    .line 105
    const/4 v14, 0x1

    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    if-ne v11, v10, :cond_4

    .line 109
    .line 110
    invoke-virtual {v4, v14}, Lyc;->x(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v14}, Ljg;->d(Lzc;I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {v4, v5}, Lyc;->v(I)V

    .line 118
    .line 119
    .line 120
    iget-object v5, v8, Lvb0;->e:Lug;

    .line 121
    .line 122
    invoke-virtual {v4}, Lyc;->i()I

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    invoke-virtual {v5, v10}, Lug;->d(I)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_2
    const/4 v5, 0x4

    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    aget v7, v7, v16

    .line 135
    .line 136
    const/4 v14, 0x1

    .line 137
    if-eq v7, v14, :cond_6

    .line 138
    .line 139
    if-ne v7, v5, :cond_5

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    const/4 v14, 0x1

    .line 143
    goto :goto_4

    .line 144
    :cond_6
    :goto_3
    invoke-virtual {v4}, Lyc;->l()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    add-int/2addr v5, v12

    .line 149
    iget-object v7, v9, Lvb0;->i:Lkg;

    .line 150
    .line 151
    invoke-virtual {v7, v5}, Lkg;->d(I)V

    .line 152
    .line 153
    .line 154
    iget-object v7, v9, Lvb0;->e:Lug;

    .line 155
    .line 156
    sub-int/2addr v5, v12

    .line 157
    invoke-virtual {v7, v5}, Lug;->d(I)V

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x1

    .line 161
    const/16 v18, 0x1

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_7
    const/4 v14, 0x1

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    aget v7, v7, v14

    .line 168
    .line 169
    if-eq v7, v14, :cond_9

    .line 170
    .line 171
    if-ne v7, v5, :cond_8

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_8
    :goto_4
    move/from16 v18, v16

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_9
    :goto_5
    invoke-virtual {v4}, Lyc;->i()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    add-int/2addr v5, v13

    .line 182
    iget-object v7, v8, Lvb0;->i:Lkg;

    .line 183
    .line 184
    invoke-virtual {v7, v5}, Lkg;->d(I)V

    .line 185
    .line 186
    .line 187
    iget-object v7, v8, Lvb0;->e:Lug;

    .line 188
    .line 189
    sub-int/2addr v5, v13

    .line 190
    invoke-virtual {v7, v5}, Lug;->d(I)V

    .line 191
    .line 192
    .line 193
    move/from16 v18, v14

    .line 194
    .line 195
    :goto_6
    invoke-virtual {v2}, Ljg;->g()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    move/from16 v5, v16

    .line 203
    .line 204
    :goto_7
    if-ge v5, v2, :cond_c

    .line 205
    .line 206
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    add-int/lit8 v5, v5, 0x1

    .line 211
    .line 212
    check-cast v7, Lvb0;

    .line 213
    .line 214
    iget v8, v7, Lvb0;->f:I

    .line 215
    .line 216
    if-eq v8, v0, :cond_a

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_a
    iget-object v8, v7, Lvb0;->b:Lyc;

    .line 220
    .line 221
    if-ne v8, v4, :cond_b

    .line 222
    .line 223
    iget-boolean v8, v7, Lvb0;->g:Z

    .line 224
    .line 225
    if-nez v8, :cond_b

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_b
    invoke-virtual {v7}, Lvb0;->e()V

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    move/from16 v5, v16

    .line 237
    .line 238
    :cond_d
    :goto_8
    if-ge v5, v2, :cond_12

    .line 239
    .line 240
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    add-int/lit8 v5, v5, 0x1

    .line 245
    .line 246
    check-cast v7, Lvb0;

    .line 247
    .line 248
    iget v8, v7, Lvb0;->f:I

    .line 249
    .line 250
    if-eq v8, v0, :cond_e

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_e
    if-nez v18, :cond_f

    .line 254
    .line 255
    iget-object v8, v7, Lvb0;->b:Lyc;

    .line 256
    .line 257
    if-ne v8, v4, :cond_f

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_f
    iget-object v8, v7, Lvb0;->h:Lkg;

    .line 261
    .line 262
    iget-boolean v8, v8, Lkg;->j:Z

    .line 263
    .line 264
    if-nez v8, :cond_10

    .line 265
    .line 266
    :goto_9
    move/from16 v5, v16

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_10
    iget-object v8, v7, Lvb0;->i:Lkg;

    .line 270
    .line 271
    iget-boolean v8, v8, Lkg;->j:Z

    .line 272
    .line 273
    if-nez v8, :cond_11

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_11
    instance-of v8, v7, Lg9;

    .line 277
    .line 278
    if-nez v8, :cond_d

    .line 279
    .line 280
    iget-object v7, v7, Lvb0;->e:Lug;

    .line 281
    .line 282
    iget-boolean v7, v7, Lkg;->j:Z

    .line 283
    .line 284
    if-nez v7, :cond_d

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_12
    move v5, v14

    .line 288
    :goto_a
    invoke-virtual {v4, v6}, Lyc;->w(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v11}, Lyc;->x(I)V

    .line 292
    .line 293
    .line 294
    return v5
.end method

.method public final E()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lg80;->h:[Z

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iput v3, v1, Lyc;->N:I

    .line 7
    .line 8
    iput v3, v1, Lyc;->O:I

    .line 9
    .line 10
    invoke-virtual {v1}, Lyc;->l()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-virtual {v1}, Lyc;->i()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iput-boolean v3, v1, Lzc;->q0:Z

    .line 27
    .line 28
    iput-boolean v3, v1, Lzc;->r0:Z

    .line 29
    .line 30
    iget v0, v1, Lzc;->p0:I

    .line 31
    .line 32
    and-int/lit8 v6, v0, 0x40

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    const/16 v8, 0x40

    .line 36
    .line 37
    if-ne v6, v8, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 v6, 0x80

    .line 41
    .line 42
    and-int/2addr v0, v6

    .line 43
    if-ne v0, v6, :cond_1

    .line 44
    .line 45
    :goto_0
    move v0, v7

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v0, v3

    .line 48
    :goto_1
    iget-object v6, v1, Lzc;->i0:Ler;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iput-boolean v3, v6, Ler;->f:Z

    .line 54
    .line 55
    iget v8, v1, Lzc;->p0:I

    .line 56
    .line 57
    if-eqz v8, :cond_2

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iput-boolean v7, v6, Ler;->f:Z

    .line 62
    .line 63
    :cond_2
    iget-object v8, v1, Lyc;->c0:[I

    .line 64
    .line 65
    aget v9, v8, v7

    .line 66
    .line 67
    aget v10, v8, v3

    .line 68
    .line 69
    iget-object v11, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 70
    .line 71
    const/4 v12, 0x2

    .line 72
    if-eq v10, v12, :cond_4

    .line 73
    .line 74
    if-ne v9, v12, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v13, v3

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    :goto_2
    move v13, v7

    .line 80
    :goto_3
    iput v3, v1, Lzc;->l0:I

    .line 81
    .line 82
    iput v3, v1, Lzc;->m0:I

    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    move v0, v3

    .line 89
    :goto_4
    if-ge v0, v14, :cond_6

    .line 90
    .line 91
    iget-object v15, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    check-cast v15, Lyc;

    .line 98
    .line 99
    move/from16 v16, v7

    .line 100
    .line 101
    instance-of v7, v15, Lzc;

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    check-cast v15, Lzc;

    .line 106
    .line 107
    invoke-virtual {v15}, Lzc;->E()V

    .line 108
    .line 109
    .line 110
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    move/from16 v7, v16

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move/from16 v16, v7

    .line 116
    .line 117
    move v0, v3

    .line 118
    move v15, v0

    .line 119
    :goto_5
    if-eqz v7, :cond_17

    .line 120
    .line 121
    move/from16 v17, v12

    .line 122
    .line 123
    add-int/lit8 v12, v0, 0x1

    .line 124
    .line 125
    :try_start_0
    invoke-virtual {v6}, Ler;->r()V

    .line 126
    .line 127
    .line 128
    iput v3, v1, Lzc;->l0:I

    .line 129
    .line 130
    iput v3, v1, Lzc;->m0:I

    .line 131
    .line 132
    invoke-virtual {v1, v6}, Lyc;->f(Ler;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 133
    .line 134
    .line 135
    move v0, v3

    .line 136
    :goto_6
    if-ge v0, v14, :cond_7

    .line 137
    .line 138
    move/from16 v18, v3

    .line 139
    .line 140
    :try_start_1
    iget-object v3, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Lyc;

    .line 147
    .line 148
    invoke-virtual {v3, v6}, Lyc;->f(Ler;)V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x1

    .line 152
    .line 153
    move/from16 v3, v18

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :catch_0
    move-exception v0

    .line 157
    goto :goto_a

    .line 158
    :cond_7
    move/from16 v18, v3

    .line 159
    .line 160
    invoke-virtual {v1, v6}, Lzc;->C(Ler;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    .line 162
    .line 163
    :try_start_2
    iget-object v0, v6, Ler;->b:Liy;

    .line 164
    .line 165
    iget-boolean v3, v6, Ler;->f:Z

    .line 166
    .line 167
    if-eqz v3, :cond_a

    .line 168
    .line 169
    move/from16 v3, v18

    .line 170
    .line 171
    :goto_7
    iget v7, v6, Ler;->i:I

    .line 172
    .line 173
    if-ge v3, v7, :cond_9

    .line 174
    .line 175
    iget-object v7, v6, Ler;->e:[Lp6;

    .line 176
    .line 177
    aget-object v7, v7, v3

    .line 178
    .line 179
    iget-boolean v7, v7, Lp6;->e:Z

    .line 180
    .line 181
    if-nez v7, :cond_8

    .line 182
    .line 183
    invoke-virtual {v6, v0}, Ler;->o(Liy;)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    move/from16 v0, v18

    .line 191
    .line 192
    :goto_8
    iget v3, v6, Ler;->i:I

    .line 193
    .line 194
    if-ge v0, v3, :cond_b

    .line 195
    .line 196
    iget-object v3, v6, Ler;->e:[Lp6;

    .line 197
    .line 198
    aget-object v3, v3, v0

    .line 199
    .line 200
    iget-object v7, v3, Lp6;->a:Lh40;

    .line 201
    .line 202
    iget v3, v3, Lp6;->b:F

    .line 203
    .line 204
    iput v3, v7, Lh40;->e:F

    .line 205
    .line 206
    add-int/lit8 v0, v0, 0x1

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_a
    invoke-virtual {v6, v0}, Ler;->o(Liy;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 210
    .line 211
    .line 212
    :cond_b
    :goto_9
    move-object/from16 v19, v2

    .line 213
    .line 214
    move/from16 v20, v16

    .line 215
    .line 216
    goto :goto_b

    .line 217
    :catch_1
    move-exception v0

    .line 218
    move/from16 v7, v16

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :catch_2
    move-exception v0

    .line 222
    move/from16 v18, v3

    .line 223
    .line 224
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 225
    .line 226
    .line 227
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 228
    .line 229
    move-object/from16 v19, v2

    .line 230
    .line 231
    new-instance v2, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    move/from16 v20, v7

    .line 234
    .line 235
    const-string v7, "EXCEPTION : "

    .line 236
    .line 237
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :goto_b
    if-eqz v20, :cond_c

    .line 251
    .line 252
    aput-boolean v18, v19, v17

    .line 253
    .line 254
    invoke-virtual {v1, v6}, Lyc;->A(Ler;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    move/from16 v2, v18

    .line 264
    .line 265
    :goto_c
    if-ge v2, v0, :cond_d

    .line 266
    .line 267
    iget-object v3, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Lyc;

    .line 274
    .line 275
    invoke-virtual {v3, v6}, Lyc;->A(Ler;)V

    .line 276
    .line 277
    .line 278
    add-int/lit8 v2, v2, 0x1

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_c
    invoke-virtual {v1, v6}, Lyc;->A(Ler;)V

    .line 282
    .line 283
    .line 284
    move/from16 v0, v18

    .line 285
    .line 286
    :goto_d
    if-ge v0, v14, :cond_d

    .line 287
    .line 288
    iget-object v2, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    check-cast v2, Lyc;

    .line 295
    .line 296
    invoke-virtual {v2, v6}, Lyc;->A(Ler;)V

    .line 297
    .line 298
    .line 299
    add-int/lit8 v0, v0, 0x1

    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_d
    if-eqz v13, :cond_10

    .line 303
    .line 304
    const/16 v0, 0x8

    .line 305
    .line 306
    if-ge v12, v0, :cond_10

    .line 307
    .line 308
    aget-boolean v0, v19, v17

    .line 309
    .line 310
    if-eqz v0, :cond_10

    .line 311
    .line 312
    move/from16 v0, v18

    .line 313
    .line 314
    move v2, v0

    .line 315
    move v3, v2

    .line 316
    :goto_e
    if-ge v0, v14, :cond_e

    .line 317
    .line 318
    iget-object v7, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    check-cast v7, Lyc;

    .line 325
    .line 326
    move/from16 v20, v0

    .line 327
    .line 328
    iget v0, v7, Lyc;->N:I

    .line 329
    .line 330
    invoke-virtual {v7}, Lyc;->l()I

    .line 331
    .line 332
    .line 333
    move-result v21

    .line 334
    add-int v0, v21, v0

    .line 335
    .line 336
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    iget v0, v7, Lyc;->O:I

    .line 341
    .line 342
    invoke-virtual {v7}, Lyc;->i()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    add-int/2addr v7, v0

    .line 347
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    add-int/lit8 v0, v20, 0x1

    .line 352
    .line 353
    goto :goto_e

    .line 354
    :cond_e
    iget v0, v1, Lyc;->Q:I

    .line 355
    .line 356
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iget v2, v1, Lyc;->R:I

    .line 361
    .line 362
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    move/from16 v3, v17

    .line 367
    .line 368
    if-ne v10, v3, :cond_f

    .line 369
    .line 370
    invoke-virtual {v1}, Lyc;->l()I

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-ge v7, v0, :cond_f

    .line 375
    .line 376
    invoke-virtual {v1, v0}, Lyc;->y(I)V

    .line 377
    .line 378
    .line 379
    aput v3, v8, v18

    .line 380
    .line 381
    move/from16 v0, v16

    .line 382
    .line 383
    move v15, v0

    .line 384
    goto :goto_f

    .line 385
    :cond_f
    move/from16 v0, v18

    .line 386
    .line 387
    :goto_f
    if-ne v9, v3, :cond_11

    .line 388
    .line 389
    invoke-virtual {v1}, Lyc;->i()I

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    if-ge v7, v2, :cond_11

    .line 394
    .line 395
    invoke-virtual {v1, v2}, Lyc;->v(I)V

    .line 396
    .line 397
    .line 398
    aput v3, v8, v16

    .line 399
    .line 400
    move/from16 v0, v16

    .line 401
    .line 402
    move v15, v0

    .line 403
    goto :goto_10

    .line 404
    :cond_10
    move/from16 v0, v18

    .line 405
    .line 406
    :cond_11
    :goto_10
    iget v2, v1, Lyc;->Q:I

    .line 407
    .line 408
    invoke-virtual {v1}, Lyc;->l()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v1}, Lyc;->l()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-le v2, v3, :cond_12

    .line 421
    .line 422
    invoke-virtual {v1, v2}, Lyc;->y(I)V

    .line 423
    .line 424
    .line 425
    aput v16, v8, v18

    .line 426
    .line 427
    move/from16 v0, v16

    .line 428
    .line 429
    move v15, v0

    .line 430
    :cond_12
    iget v2, v1, Lyc;->R:I

    .line 431
    .line 432
    invoke-virtual {v1}, Lyc;->i()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    invoke-virtual {v1}, Lyc;->i()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-le v2, v3, :cond_13

    .line 445
    .line 446
    invoke-virtual {v1, v2}, Lyc;->v(I)V

    .line 447
    .line 448
    .line 449
    aput v16, v8, v16

    .line 450
    .line 451
    move/from16 v0, v16

    .line 452
    .line 453
    move v15, v0

    .line 454
    :cond_13
    if-nez v15, :cond_15

    .line 455
    .line 456
    aget v2, v8, v18

    .line 457
    .line 458
    const/4 v3, 0x2

    .line 459
    if-ne v2, v3, :cond_14

    .line 460
    .line 461
    if-lez v4, :cond_14

    .line 462
    .line 463
    invoke-virtual {v1}, Lyc;->l()I

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-le v2, v4, :cond_14

    .line 468
    .line 469
    move/from16 v2, v16

    .line 470
    .line 471
    iput-boolean v2, v1, Lzc;->q0:Z

    .line 472
    .line 473
    aput v2, v8, v18

    .line 474
    .line 475
    invoke-virtual {v1, v4}, Lyc;->y(I)V

    .line 476
    .line 477
    .line 478
    move v0, v2

    .line 479
    move v15, v0

    .line 480
    goto :goto_11

    .line 481
    :cond_14
    move/from16 v2, v16

    .line 482
    .line 483
    :goto_11
    aget v3, v8, v2

    .line 484
    .line 485
    const/4 v7, 0x2

    .line 486
    if-ne v3, v7, :cond_16

    .line 487
    .line 488
    if-lez v5, :cond_16

    .line 489
    .line 490
    invoke-virtual {v1}, Lyc;->i()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-le v3, v5, :cond_16

    .line 495
    .line 496
    iput-boolean v2, v1, Lzc;->r0:Z

    .line 497
    .line 498
    aput v2, v8, v2

    .line 499
    .line 500
    invoke-virtual {v1, v5}, Lyc;->v(I)V

    .line 501
    .line 502
    .line 503
    const/4 v0, 0x1

    .line 504
    const/4 v15, 0x1

    .line 505
    goto :goto_12

    .line 506
    :cond_15
    const/4 v7, 0x2

    .line 507
    :cond_16
    :goto_12
    move v2, v7

    .line 508
    move v7, v0

    .line 509
    move v0, v12

    .line 510
    move v12, v2

    .line 511
    move/from16 v3, v18

    .line 512
    .line 513
    move-object/from16 v2, v19

    .line 514
    .line 515
    const/16 v16, 0x1

    .line 516
    .line 517
    goto/16 :goto_5

    .line 518
    .line 519
    :cond_17
    move/from16 v18, v3

    .line 520
    .line 521
    iput-object v11, v1, Lzc;->d0:Ljava/util/ArrayList;

    .line 522
    .line 523
    if-eqz v15, :cond_18

    .line 524
    .line 525
    aput v10, v8, v18

    .line 526
    .line 527
    const/16 v16, 0x1

    .line 528
    .line 529
    aput v9, v8, v16

    .line 530
    .line 531
    :cond_18
    iget-object v0, v6, Ler;->k:Lk8;

    .line 532
    .line 533
    invoke-virtual {v1, v0}, Lzc;->u(Lk8;)V

    .line 534
    .line 535
    .line 536
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzc;->i0:Ler;

    .line 2
    .line 3
    invoke-virtual {v0}, Ler;->r()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lzc;->j0:I

    .line 8
    .line 9
    iput v0, p0, Lzc;->k0:I

    .line 10
    .line 11
    iget-object v0, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Lyc;->s()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final u(Lk8;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lyc;->u(Lk8;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lyc;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lyc;->u(Lk8;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final z(ZZ)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lyc;->z(ZZ)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lzc;->d0:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lyc;

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2}, Lyc;->z(ZZ)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
