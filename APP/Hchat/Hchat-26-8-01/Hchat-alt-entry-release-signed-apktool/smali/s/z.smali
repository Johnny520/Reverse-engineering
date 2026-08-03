.class public final Ls/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf/k0;

.field public b:Lac/k;

.field public c:I

.field public final d:Lf/l0;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:Ls/w;

.field public final k:Ly0/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lf/r0;->a:[J

    .line 5
    .line 6
    new-instance v0, Lf/k0;

    .line 7
    .line 8
    invoke-direct {v0}, Lf/k0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls/z;->a:Lf/k0;

    .line 12
    .line 13
    sget-object v0, Lf/s0;->a:Lf/l0;

    .line 14
    .line 15
    new-instance v0, Lf/l0;

    .line 16
    .line 17
    invoke-direct {v0}, Lf/l0;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ls/z;->d:Lf/l0;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ls/z;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Ls/z;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ls/z;->g:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ls/z;->h:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Ls/z;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    new-instance v0, Ls/v;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Ls/v;-><init>(Ls/z;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Ls/z;->k:Ly0/o;

    .line 63
    .line 64
    return-void
.end method

.method public static b(Lr/q;ILs/x;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lr/q;->b(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    iget-boolean v3, p0, Lr/q;->c:Z

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-static {v0, p1, v1, v2, v3}, Lu2/j;->a(IIJI)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x2

    .line 17
    invoke-static {p1, v0, v1, v2, v3}, Lu2/j;->a(IIJI)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    :goto_0
    iget-object p1, p2, Ls/x;->a:[Ls/t;

    .line 22
    .line 23
    array-length p2, p1

    .line 24
    move v5, v0

    .line 25
    :goto_1
    if-ge v0, p2, :cond_2

    .line 26
    .line 27
    aget-object v6, p1, v0

    .line 28
    .line 29
    add-int/lit8 v7, v5, 0x1

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v5}, Lr/q;->b(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    invoke-static {v8, v9, v1, v2}, Lu2/j;->c(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    invoke-static {v3, v4, v8, v9}, Lu2/j;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    iput-wide v8, v6, Ls/t;->j:J

    .line 46
    .line 47
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    move v5, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return-void
.end method

.method public static g([ILr/q;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    aget v1, p0, v0

    .line 6
    .line 7
    iget p1, p1, Lr/q;->q:I

    .line 8
    .line 9
    add-int/2addr v1, p1

    .line 10
    aput v1, p0, v0

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public final a()J
    .locals 13

    .line 1
    iget-object v0, p0, Ls/z;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Ls/t;

    .line 17
    .line 18
    iget-object v6, v5, Ls/t;->l:Li1/b;

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    const/16 v7, 0x20

    .line 23
    .line 24
    shr-long v8, v2, v7

    .line 25
    .line 26
    long-to-int v8, v8

    .line 27
    iget-wide v9, v5, Ls/t;->j:J

    .line 28
    .line 29
    shr-long/2addr v9, v7

    .line 30
    long-to-int v9, v9

    .line 31
    iget-wide v10, v6, Li1/b;->u:J

    .line 32
    .line 33
    shr-long/2addr v10, v7

    .line 34
    long-to-int v10, v10

    .line 35
    add-int/2addr v9, v10

    .line 36
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    const-wide v9, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v2, v9

    .line 46
    long-to-int v2, v2

    .line 47
    iget-wide v11, v5, Ls/t;->j:J

    .line 48
    .line 49
    and-long/2addr v11, v9

    .line 50
    long-to-int v3, v11

    .line 51
    iget-wide v5, v6, Li1/b;->u:J

    .line 52
    .line 53
    and-long/2addr v5, v9

    .line 54
    long-to-int v5, v5

    .line 55
    add-int/2addr v3, v5

    .line 56
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    int-to-long v5, v8

    .line 61
    shl-long/2addr v5, v7

    .line 62
    int-to-long v2, v2

    .line 63
    and-long/2addr v2, v9

    .line 64
    or-long/2addr v2, v5

    .line 65
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-wide v2
.end method

.method public final c(IIILjava/util/ArrayList;Lac/k;Lr/n;ZZZIILqg/t;Lf1/z;)V
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v4, p4

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    iget-object v6, v0, Ls/z;->b:Lac/k;

    .line 10
    .line 11
    iput-object v5, v0, Ls/z;->b:Lac/k;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    const/4 v8, 0x0

    .line 18
    move v9, v8

    .line 19
    :goto_0
    iget-object v11, v0, Ls/z;->a:Lf/k0;

    .line 20
    .line 21
    if-ge v9, v7, :cond_3

    .line 22
    .line 23
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    check-cast v12, Lr/q;

    .line 28
    .line 29
    iget-object v13, v12, Lr/q;->b:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    move v14, v8

    .line 36
    :goto_1
    if-ge v14, v13, :cond_2

    .line 37
    .line 38
    iget-object v15, v12, Lr/q;->b:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v15

    .line 44
    check-cast v15, Lv1/b1;

    .line 45
    .line 46
    invoke-virtual {v15}, Lv1/b1;->X()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v15

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    instance-of v10, v15, Ls/l;

    .line 53
    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    check-cast v15, Ls/l;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_0
    move-object/from16 v15, v16

    .line 60
    .line 61
    :goto_2
    if-eqz v15, :cond_1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    add-int/lit8 v14, v14, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const/16 v16, 0x0

    .line 71
    .line 72
    invoke-virtual {v11}, Lf/k0;->i()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0}, Ls/z;->d()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    :goto_3
    iget v7, v0, Ls/z;->c:I

    .line 83
    .line 84
    invoke-static {v4}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    check-cast v9, Lr/q;

    .line 89
    .line 90
    if-eqz v9, :cond_5

    .line 91
    .line 92
    iget v9, v9, Lr/q;->a:I

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move v9, v8

    .line 96
    :goto_4
    iput v9, v0, Ls/z;->c:I

    .line 97
    .line 98
    const/16 v12, 0x20

    .line 99
    .line 100
    if-eqz p7, :cond_6

    .line 101
    .line 102
    int-to-long v13, v8

    .line 103
    shl-long/2addr v13, v12

    .line 104
    const-wide v17, 0xffffffffL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    int-to-long v9, v1

    .line 110
    and-long v9, v9, v17

    .line 111
    .line 112
    or-long/2addr v9, v13

    .line 113
    goto :goto_5

    .line 114
    :cond_6
    const-wide v17, 0xffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    int-to-long v9, v1

    .line 120
    shl-long/2addr v9, v12

    .line 121
    int-to-long v13, v8

    .line 122
    and-long v13, v13, v17

    .line 123
    .line 124
    or-long/2addr v9, v13

    .line 125
    :goto_5
    if-nez p8, :cond_8

    .line 126
    .line 127
    if-nez p9, :cond_7

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_7
    move v13, v8

    .line 131
    goto :goto_7

    .line 132
    :cond_8
    :goto_6
    const/4 v13, 0x1

    .line 133
    :goto_7
    iget-object v14, v11, Lf/k0;->b:[Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v15, v11, Lf/k0;->a:[J

    .line 136
    .line 137
    move/from16 v19, v12

    .line 138
    .line 139
    array-length v12, v15

    .line 140
    add-int/lit8 v12, v12, -0x2

    .line 141
    .line 142
    const-wide/16 v20, 0x80

    .line 143
    .line 144
    const-wide/16 v22, 0xff

    .line 145
    .line 146
    const/16 v24, 0x7

    .line 147
    .line 148
    iget-object v1, v0, Ls/z;->d:Lf/l0;

    .line 149
    .line 150
    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    move/from16 p9, v13

    .line 156
    .line 157
    if-ltz v12, :cond_c

    .line 158
    .line 159
    move-object/from16 v27, v14

    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    :goto_8
    const/16 p7, 0x8

    .line 163
    .line 164
    aget-wide v13, v15, v8

    .line 165
    .line 166
    not-long v2, v13

    .line 167
    shl-long v2, v2, v24

    .line 168
    .line 169
    and-long/2addr v2, v13

    .line 170
    and-long v2, v2, v25

    .line 171
    .line 172
    cmp-long v2, v2, v25

    .line 173
    .line 174
    if-eqz v2, :cond_b

    .line 175
    .line 176
    sub-int v2, v8, v12

    .line 177
    .line 178
    not-int v2, v2

    .line 179
    ushr-int/lit8 v2, v2, 0x1f

    .line 180
    .line 181
    rsub-int/lit8 v2, v2, 0x8

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    :goto_9
    if-ge v3, v2, :cond_a

    .line 185
    .line 186
    and-long v28, v13, v22

    .line 187
    .line 188
    cmp-long v28, v28, v20

    .line 189
    .line 190
    if-gez v28, :cond_9

    .line 191
    .line 192
    shl-int/lit8 v28, v8, 0x3

    .line 193
    .line 194
    add-int v28, v28, v3

    .line 195
    .line 196
    move/from16 v29, v3

    .line 197
    .line 198
    aget-object v3, v27, v28

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_9
    move/from16 v29, v3

    .line 205
    .line 206
    :goto_a
    shr-long v13, v13, p7

    .line 207
    .line 208
    add-int/lit8 v3, v29, 0x1

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_a
    move/from16 v3, p7

    .line 212
    .line 213
    if-ne v2, v3, :cond_c

    .line 214
    .line 215
    :cond_b
    if-eq v8, v12, :cond_c

    .line 216
    .line 217
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    const/4 v3, 0x0

    .line 225
    :goto_b
    iget-object v8, v0, Ls/z;->i:Ljava/util/ArrayList;

    .line 226
    .line 227
    iget-object v13, v0, Ls/z;->f:Ljava/util/ArrayList;

    .line 228
    .line 229
    iget-object v14, v0, Ls/z;->e:Ljava/util/ArrayList;

    .line 230
    .line 231
    if-ge v3, v2, :cond_1d

    .line 232
    .line 233
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    check-cast v15, Lr/q;

    .line 238
    .line 239
    iget-object v12, v15, Lr/q;->k:Ljava/lang/Object;

    .line 240
    .line 241
    move/from16 v34, v2

    .line 242
    .line 243
    iget-object v2, v15, Lr/q;->b:Ljava/util/List;

    .line 244
    .line 245
    invoke-virtual {v1, v12}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move/from16 v35, v3

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    move-object/from16 v28, v15

    .line 255
    .line 256
    const/4 v15, 0x0

    .line 257
    :goto_c
    if-ge v15, v3, :cond_1b

    .line 258
    .line 259
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v27

    .line 263
    check-cast v27, Lv1/b1;

    .line 264
    .line 265
    move-object/from16 v29, v2

    .line 266
    .line 267
    invoke-virtual/range {v27 .. v27}, Lv1/b1;->X()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    move/from16 v27, v3

    .line 272
    .line 273
    instance-of v3, v2, Ls/l;

    .line 274
    .line 275
    if-eqz v3, :cond_d

    .line 276
    .line 277
    check-cast v2, Ls/l;

    .line 278
    .line 279
    goto :goto_d

    .line 280
    :cond_d
    move-object/from16 v2, v16

    .line 281
    .line 282
    :goto_d
    if-eqz v2, :cond_1a

    .line 283
    .line 284
    invoke-virtual {v11, v12}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    move-object/from16 v27, v2

    .line 289
    .line 290
    check-cast v27, Ls/x;

    .line 291
    .line 292
    if-eqz v6, :cond_e

    .line 293
    .line 294
    invoke-virtual {v6, v12}, Lac/k;->o(Ljava/lang/Object;)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    :goto_e
    const/4 v3, -0x1

    .line 299
    goto :goto_f

    .line 300
    :cond_e
    const/4 v2, -0x1

    .line 301
    goto :goto_e

    .line 302
    :goto_f
    if-ne v2, v3, :cond_f

    .line 303
    .line 304
    if-eqz v6, :cond_f

    .line 305
    .line 306
    const/4 v3, 0x1

    .line 307
    goto :goto_10

    .line 308
    :cond_f
    const/4 v3, 0x0

    .line 309
    :goto_10
    if-nez v27, :cond_14

    .line 310
    .line 311
    new-instance v8, Ls/x;

    .line 312
    .line 313
    invoke-direct {v8, v0}, Ls/x;-><init>(Ls/z;)V

    .line 314
    .line 315
    .line 316
    move/from16 v31, p10

    .line 317
    .line 318
    move/from16 v32, p11

    .line 319
    .line 320
    move-object/from16 v29, p12

    .line 321
    .line 322
    move-object/from16 v30, p13

    .line 323
    .line 324
    move-object/from16 v27, v8

    .line 325
    .line 326
    invoke-static/range {v27 .. v32}, Ls/x;->b(Ls/x;Lr/q;Lqg/t;Lf1/z;II)V

    .line 327
    .line 328
    .line 329
    move-object/from16 v15, v28

    .line 330
    .line 331
    invoke-virtual {v11, v12, v8}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    iget v12, v15, Lr/q;->a:I

    .line 335
    .line 336
    if-eq v12, v2, :cond_11

    .line 337
    .line 338
    const/4 v12, -0x1

    .line 339
    if-eq v2, v12, :cond_11

    .line 340
    .line 341
    if-ge v2, v7, :cond_10

    .line 342
    .line 343
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto/16 :goto_16

    .line 347
    .line 348
    :cond_10
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto/16 :goto_16

    .line 352
    .line 353
    :cond_11
    const/4 v2, 0x0

    .line 354
    invoke-virtual {v15, v2}, Lr/q;->b(I)J

    .line 355
    .line 356
    .line 357
    move-result-wide v12

    .line 358
    iget-boolean v2, v15, Lr/q;->c:Z

    .line 359
    .line 360
    if-eqz v2, :cond_12

    .line 361
    .line 362
    and-long v12, v12, v17

    .line 363
    .line 364
    :goto_11
    long-to-int v2, v12

    .line 365
    goto :goto_12

    .line 366
    :cond_12
    shr-long v12, v12, v19

    .line 367
    .line 368
    goto :goto_11

    .line 369
    :goto_12
    invoke-static {v15, v2, v8}, Ls/z;->b(Lr/q;ILs/x;)V

    .line 370
    .line 371
    .line 372
    if-eqz v3, :cond_1c

    .line 373
    .line 374
    iget-object v2, v8, Ls/x;->a:[Ls/t;

    .line 375
    .line 376
    array-length v3, v2

    .line 377
    const/4 v8, 0x0

    .line 378
    :goto_13
    if-ge v8, v3, :cond_1c

    .line 379
    .line 380
    aget-object v12, v2, v8

    .line 381
    .line 382
    if-eqz v12, :cond_13

    .line 383
    .line 384
    invoke-virtual {v12}, Ls/t;->a()V

    .line 385
    .line 386
    .line 387
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 388
    .line 389
    goto :goto_13

    .line 390
    :cond_14
    move-object/from16 v15, v28

    .line 391
    .line 392
    if-eqz p9, :cond_1c

    .line 393
    .line 394
    move/from16 v31, p10

    .line 395
    .line 396
    move/from16 v32, p11

    .line 397
    .line 398
    move-object/from16 v29, p12

    .line 399
    .line 400
    move-object/from16 v30, p13

    .line 401
    .line 402
    move-object/from16 v28, v15

    .line 403
    .line 404
    invoke-static/range {v27 .. v32}, Ls/x;->b(Ls/x;Lr/q;Lqg/t;Lf1/z;II)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v12, v27

    .line 408
    .line 409
    move-object/from16 v2, v28

    .line 410
    .line 411
    iget-object v13, v12, Ls/x;->a:[Ls/t;

    .line 412
    .line 413
    array-length v14, v13

    .line 414
    const/4 v15, 0x0

    .line 415
    :goto_14
    if-ge v15, v14, :cond_16

    .line 416
    .line 417
    move/from16 v27, v3

    .line 418
    .line 419
    aget-object v3, v13, v15

    .line 420
    .line 421
    move-object/from16 v28, v13

    .line 422
    .line 423
    move/from16 v29, v14

    .line 424
    .line 425
    if-eqz v3, :cond_15

    .line 426
    .line 427
    iget-wide v13, v3, Ls/t;->j:J

    .line 428
    .line 429
    sget-wide v4, Ls/t;->q:J

    .line 430
    .line 431
    invoke-static {v13, v14, v4, v5}, Lu2/j;->b(JJ)Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-nez v4, :cond_15

    .line 436
    .line 437
    iget-wide v4, v3, Ls/t;->j:J

    .line 438
    .line 439
    invoke-static {v4, v5, v9, v10}, Lu2/j;->d(JJ)J

    .line 440
    .line 441
    .line 442
    move-result-wide v4

    .line 443
    iput-wide v4, v3, Ls/t;->j:J

    .line 444
    .line 445
    :cond_15
    add-int/lit8 v15, v15, 0x1

    .line 446
    .line 447
    move-object/from16 v4, p4

    .line 448
    .line 449
    move-object/from16 v5, p5

    .line 450
    .line 451
    move/from16 v3, v27

    .line 452
    .line 453
    move-object/from16 v13, v28

    .line 454
    .line 455
    move/from16 v14, v29

    .line 456
    .line 457
    goto :goto_14

    .line 458
    :cond_16
    move/from16 v27, v3

    .line 459
    .line 460
    if-eqz v27, :cond_19

    .line 461
    .line 462
    iget-object v3, v12, Ls/x;->a:[Ls/t;

    .line 463
    .line 464
    array-length v4, v3

    .line 465
    const/4 v5, 0x0

    .line 466
    :goto_15
    if-ge v5, v4, :cond_19

    .line 467
    .line 468
    aget-object v12, v3, v5

    .line 469
    .line 470
    if-eqz v12, :cond_18

    .line 471
    .line 472
    invoke-virtual {v12}, Ls/t;->b()Z

    .line 473
    .line 474
    .line 475
    move-result v13

    .line 476
    if-eqz v13, :cond_17

    .line 477
    .line 478
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    iget-object v13, v0, Ls/z;->j:Ls/w;

    .line 482
    .line 483
    if-eqz v13, :cond_17

    .line 484
    .line 485
    invoke-static {v13}, Lx1/k;->l(Lx1/m;)V

    .line 486
    .line 487
    .line 488
    :cond_17
    invoke-virtual {v12}, Ls/t;->a()V

    .line 489
    .line 490
    .line 491
    :cond_18
    add-int/lit8 v5, v5, 0x1

    .line 492
    .line 493
    goto :goto_15

    .line 494
    :cond_19
    const/4 v3, 0x0

    .line 495
    invoke-virtual {v0, v2, v3}, Ls/z;->f(Lr/q;Z)V

    .line 496
    .line 497
    .line 498
    goto :goto_16

    .line 499
    :cond_1a
    move-object/from16 v2, v28

    .line 500
    .line 501
    add-int/lit8 v15, v15, 0x1

    .line 502
    .line 503
    move-object/from16 v4, p4

    .line 504
    .line 505
    move-object/from16 v5, p5

    .line 506
    .line 507
    move/from16 v3, v27

    .line 508
    .line 509
    move-object/from16 v2, v29

    .line 510
    .line 511
    goto/16 :goto_c

    .line 512
    .line 513
    :cond_1b
    invoke-virtual {v0, v12}, Ls/z;->e(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    :cond_1c
    :goto_16
    add-int/lit8 v3, v35, 0x1

    .line 517
    .line 518
    move-object/from16 v4, p4

    .line 519
    .line 520
    move-object/from16 v5, p5

    .line 521
    .line 522
    move/from16 v2, v34

    .line 523
    .line 524
    goto/16 :goto_b

    .line 525
    .line 526
    :cond_1d
    const/4 v2, 0x1

    .line 527
    new-array v3, v2, [I

    .line 528
    .line 529
    if-eqz p9, :cond_23

    .line 530
    .line 531
    if-eqz v6, :cond_23

    .line 532
    .line 533
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    if-nez v4, :cond_20

    .line 538
    .line 539
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    if-le v4, v2, :cond_1e

    .line 544
    .line 545
    new-instance v2, Ls/y;

    .line 546
    .line 547
    const/4 v4, 0x2

    .line 548
    invoke-direct {v2, v6, v4}, Ls/y;-><init>(Lac/k;I)V

    .line 549
    .line 550
    .line 551
    invoke-static {v14, v2}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 552
    .line 553
    .line 554
    :cond_1e
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    const/4 v4, 0x0

    .line 559
    :goto_17
    if-ge v4, v2, :cond_1f

    .line 560
    .line 561
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    check-cast v5, Lr/q;

    .line 566
    .line 567
    invoke-static {v3, v5}, Ls/z;->g([ILr/q;)I

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    sub-int v7, p10, v7

    .line 572
    .line 573
    iget-object v9, v5, Lr/q;->k:Ljava/lang/Object;

    .line 574
    .line 575
    invoke-virtual {v11, v9}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v9

    .line 579
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    check-cast v9, Ls/x;

    .line 583
    .line 584
    invoke-static {v5, v7, v9}, Ls/z;->b(Lr/q;ILs/x;)V

    .line 585
    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    invoke-virtual {v0, v5, v7}, Ls/z;->f(Lr/q;Z)V

    .line 589
    .line 590
    .line 591
    add-int/lit8 v4, v4, 0x1

    .line 592
    .line 593
    goto :goto_17

    .line 594
    :cond_1f
    const/4 v4, 0x1

    .line 595
    const/4 v7, 0x0

    .line 596
    invoke-static {v3, v7, v4, v7}, Ljava/util/Arrays;->fill([IIII)V

    .line 597
    .line 598
    .line 599
    goto :goto_18

    .line 600
    :cond_20
    move v4, v2

    .line 601
    :goto_18
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    if-nez v2, :cond_23

    .line 606
    .line 607
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-le v2, v4, :cond_21

    .line 612
    .line 613
    new-instance v2, Ls/y;

    .line 614
    .line 615
    const/4 v4, 0x0

    .line 616
    invoke-direct {v2, v6, v4}, Ls/y;-><init>(Lac/k;I)V

    .line 617
    .line 618
    .line 619
    invoke-static {v13, v2}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 620
    .line 621
    .line 622
    :cond_21
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    const/4 v4, 0x0

    .line 627
    :goto_19
    if-ge v4, v2, :cond_22

    .line 628
    .line 629
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    check-cast v5, Lr/q;

    .line 634
    .line 635
    invoke-static {v3, v5}, Ls/z;->g([ILr/q;)I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    add-int v7, v7, p11

    .line 640
    .line 641
    iget v9, v5, Lr/q;->q:I

    .line 642
    .line 643
    sub-int/2addr v7, v9

    .line 644
    iget-object v9, v5, Lr/q;->k:Ljava/lang/Object;

    .line 645
    .line 646
    invoke-virtual {v11, v9}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v9

    .line 650
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    check-cast v9, Ls/x;

    .line 654
    .line 655
    invoke-static {v5, v7, v9}, Ls/z;->b(Lr/q;ILs/x;)V

    .line 656
    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    invoke-virtual {v0, v5, v7}, Ls/z;->f(Lr/q;Z)V

    .line 660
    .line 661
    .line 662
    add-int/lit8 v4, v4, 0x1

    .line 663
    .line 664
    goto :goto_19

    .line 665
    :cond_22
    const/4 v4, 0x1

    .line 666
    const/4 v7, 0x0

    .line 667
    invoke-static {v3, v7, v4, v7}, Ljava/util/Arrays;->fill([IIII)V

    .line 668
    .line 669
    .line 670
    :cond_23
    iget-object v2, v1, Lf/l0;->b:[Ljava/lang/Object;

    .line 671
    .line 672
    iget-object v4, v1, Lf/l0;->a:[J

    .line 673
    .line 674
    array-length v5, v4

    .line 675
    add-int/lit8 v5, v5, -0x2

    .line 676
    .line 677
    iget-object v7, v0, Ls/z;->h:Ljava/util/ArrayList;

    .line 678
    .line 679
    iget-object v9, v0, Ls/z;->g:Ljava/util/ArrayList;

    .line 680
    .line 681
    if-ltz v5, :cond_37

    .line 682
    .line 683
    move-object v12, v1

    .line 684
    move-object v15, v2

    .line 685
    const/4 v10, 0x0

    .line 686
    :goto_1a
    aget-wide v1, v4, v10

    .line 687
    .line 688
    move-object/from16 v28, v12

    .line 689
    .line 690
    move-object/from16 v27, v13

    .line 691
    .line 692
    not-long v12, v1

    .line 693
    shl-long v12, v12, v24

    .line 694
    .line 695
    and-long/2addr v12, v1

    .line 696
    and-long v12, v12, v25

    .line 697
    .line 698
    cmp-long v12, v12, v25

    .line 699
    .line 700
    if-eqz v12, :cond_36

    .line 701
    .line 702
    sub-int v12, v10, v5

    .line 703
    .line 704
    not-int v12, v12

    .line 705
    ushr-int/lit8 v12, v12, 0x1f

    .line 706
    .line 707
    const/16 v13, 0x8

    .line 708
    .line 709
    rsub-int/lit8 v12, v12, 0x8

    .line 710
    .line 711
    const/4 v13, 0x0

    .line 712
    :goto_1b
    if-ge v13, v12, :cond_35

    .line 713
    .line 714
    and-long v29, v1, v22

    .line 715
    .line 716
    cmp-long v29, v29, v20

    .line 717
    .line 718
    if-gez v29, :cond_34

    .line 719
    .line 720
    shl-int/lit8 v29, v10, 0x3

    .line 721
    .line 722
    add-int v29, v29, v13

    .line 723
    .line 724
    move-wide/from16 v30, v1

    .line 725
    .line 726
    aget-object v1, v15, v29

    .line 727
    .line 728
    invoke-virtual {v11, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    check-cast v2, Ls/x;

    .line 733
    .line 734
    if-nez v2, :cond_24

    .line 735
    .line 736
    goto/16 :goto_22

    .line 737
    .line 738
    :cond_24
    move-object/from16 v29, v4

    .line 739
    .line 740
    move/from16 v32, v13

    .line 741
    .line 742
    move-object/from16 v4, p5

    .line 743
    .line 744
    invoke-virtual {v4, v1}, Lac/k;->o(Ljava/lang/Object;)I

    .line 745
    .line 746
    .line 747
    move-result v13

    .line 748
    move-object/from16 v34, v14

    .line 749
    .line 750
    iget v14, v2, Ls/x;->e:I

    .line 751
    .line 752
    move-object/from16 v35, v15

    .line 753
    .line 754
    const/4 v15, 0x1

    .line 755
    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    .line 756
    .line 757
    .line 758
    move-result v14

    .line 759
    iput v14, v2, Ls/x;->e:I

    .line 760
    .line 761
    rsub-int/lit8 v14, v14, 0x1

    .line 762
    .line 763
    iget v15, v2, Ls/x;->d:I

    .line 764
    .line 765
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 766
    .line 767
    .line 768
    move-result v14

    .line 769
    iput v14, v2, Ls/x;->d:I

    .line 770
    .line 771
    const/4 v14, -0x1

    .line 772
    if-ne v13, v14, :cond_2e

    .line 773
    .line 774
    iget-object v13, v2, Ls/x;->a:[Ls/t;

    .line 775
    .line 776
    array-length v15, v13

    .line 777
    const/4 v14, 0x0

    .line 778
    const/16 v33, 0x0

    .line 779
    .line 780
    const/16 v36, 0x0

    .line 781
    .line 782
    :goto_1c
    if-ge v14, v15, :cond_2c

    .line 783
    .line 784
    move-object/from16 v37, v13

    .line 785
    .line 786
    aget-object v13, v37, v14

    .line 787
    .line 788
    add-int/lit8 v38, v36, 0x1

    .line 789
    .line 790
    if-eqz v13, :cond_2a

    .line 791
    .line 792
    invoke-virtual {v13}, Ls/t;->b()Z

    .line 793
    .line 794
    .line 795
    move-result v39

    .line 796
    if-eqz v39, :cond_25

    .line 797
    .line 798
    move/from16 v39, v14

    .line 799
    .line 800
    goto :goto_1d

    .line 801
    :cond_25
    move/from16 v39, v14

    .line 802
    .line 803
    iget-object v14, v13, Ls/t;->i:Li0/j1;

    .line 804
    .line 805
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v14

    .line 809
    check-cast v14, Ljava/lang/Boolean;

    .line 810
    .line 811
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 812
    .line 813
    .line 814
    move-result v14

    .line 815
    if-eqz v14, :cond_26

    .line 816
    .line 817
    invoke-virtual {v13}, Ls/t;->c()V

    .line 818
    .line 819
    .line 820
    iget-object v14, v2, Ls/x;->a:[Ls/t;

    .line 821
    .line 822
    aput-object v16, v14, v36

    .line 823
    .line 824
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    iget-object v13, v0, Ls/z;->j:Ls/w;

    .line 828
    .line 829
    if-eqz v13, :cond_2b

    .line 830
    .line 831
    invoke-static {v13}, Lx1/k;->l(Lx1/m;)V

    .line 832
    .line 833
    .line 834
    goto :goto_1e

    .line 835
    :cond_26
    iget-object v14, v13, Ls/t;->l:Li1/b;

    .line 836
    .line 837
    if-eqz v14, :cond_27

    .line 838
    .line 839
    invoke-virtual {v13}, Ls/t;->b()Z

    .line 840
    .line 841
    .line 842
    :cond_27
    invoke-virtual {v13}, Ls/t;->b()Z

    .line 843
    .line 844
    .line 845
    move-result v14

    .line 846
    if-eqz v14, :cond_29

    .line 847
    .line 848
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    iget-object v13, v0, Ls/z;->j:Ls/w;

    .line 852
    .line 853
    if-eqz v13, :cond_28

    .line 854
    .line 855
    invoke-static {v13}, Lx1/k;->l(Lx1/m;)V

    .line 856
    .line 857
    .line 858
    :cond_28
    :goto_1d
    const/16 v33, 0x1

    .line 859
    .line 860
    goto :goto_1e

    .line 861
    :cond_29
    invoke-virtual {v13}, Ls/t;->c()V

    .line 862
    .line 863
    .line 864
    iget-object v13, v2, Ls/x;->a:[Ls/t;

    .line 865
    .line 866
    aput-object v16, v13, v36

    .line 867
    .line 868
    goto :goto_1e

    .line 869
    :cond_2a
    move/from16 v39, v14

    .line 870
    .line 871
    :cond_2b
    :goto_1e
    add-int/lit8 v14, v39, 0x1

    .line 872
    .line 873
    move-object/from16 v13, v37

    .line 874
    .line 875
    move/from16 v36, v38

    .line 876
    .line 877
    goto :goto_1c

    .line 878
    :cond_2c
    if-nez v33, :cond_2d

    .line 879
    .line 880
    invoke-virtual {v0, v1}, Ls/z;->e(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    :cond_2d
    move-object/from16 v33, v8

    .line 884
    .line 885
    goto/16 :goto_21

    .line 886
    .line 887
    :cond_2e
    iget-object v14, v2, Ls/x;->b:Lu2/a;

    .line 888
    .line 889
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    iget-wide v14, v14, Lu2/a;->a:J

    .line 893
    .line 894
    move-object/from16 v33, v8

    .line 895
    .line 896
    move-object/from16 v8, p6

    .line 897
    .line 898
    invoke-virtual {v8, v13, v14, v15}, Lr/n;->a(IJ)Lr/q;

    .line 899
    .line 900
    .line 901
    move-result-object v14

    .line 902
    const/4 v15, 0x1

    .line 903
    iput-boolean v15, v14, Lr/q;->s:Z

    .line 904
    .line 905
    iget-object v15, v2, Ls/x;->a:[Ls/t;

    .line 906
    .line 907
    array-length v8, v15

    .line 908
    move-object/from16 v37, v14

    .line 909
    .line 910
    const/4 v14, 0x0

    .line 911
    :goto_1f
    if-ge v14, v8, :cond_31

    .line 912
    .line 913
    move/from16 v36, v8

    .line 914
    .line 915
    aget-object v8, v15, v14

    .line 916
    .line 917
    if-eqz v8, :cond_2f

    .line 918
    .line 919
    iget-object v8, v8, Ls/t;->f:Li0/j1;

    .line 920
    .line 921
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    check-cast v8, Ljava/lang/Boolean;

    .line 926
    .line 927
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 928
    .line 929
    .line 930
    move-result v8

    .line 931
    move/from16 v38, v14

    .line 932
    .line 933
    const/4 v14, 0x1

    .line 934
    if-ne v8, v14, :cond_30

    .line 935
    .line 936
    goto :goto_20

    .line 937
    :cond_2f
    move/from16 v38, v14

    .line 938
    .line 939
    :cond_30
    add-int/lit8 v14, v38, 0x1

    .line 940
    .line 941
    move/from16 v8, v36

    .line 942
    .line 943
    goto :goto_1f

    .line 944
    :cond_31
    if-eqz v6, :cond_32

    .line 945
    .line 946
    invoke-virtual {v6, v1}, Lac/k;->o(Ljava/lang/Object;)I

    .line 947
    .line 948
    .line 949
    move-result v8

    .line 950
    if-ne v13, v8, :cond_32

    .line 951
    .line 952
    invoke-virtual {v0, v1}, Ls/z;->e(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    goto :goto_21

    .line 956
    :cond_32
    :goto_20
    iget v1, v2, Ls/x;->c:I

    .line 957
    .line 958
    move/from16 v40, p10

    .line 959
    .line 960
    move/from16 v41, p11

    .line 961
    .line 962
    move-object/from16 v38, p12

    .line 963
    .line 964
    move-object/from16 v39, p13

    .line 965
    .line 966
    move/from16 v42, v1

    .line 967
    .line 968
    move-object/from16 v36, v2

    .line 969
    .line 970
    invoke-virtual/range {v36 .. v42}, Ls/x;->a(Lr/q;Lqg/t;Lf1/z;III)V

    .line 971
    .line 972
    .line 973
    move-object/from16 v1, v37

    .line 974
    .line 975
    iget v2, v0, Ls/z;->c:I

    .line 976
    .line 977
    if-ge v13, v2, :cond_33

    .line 978
    .line 979
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    goto :goto_21

    .line 983
    :cond_33
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    :goto_21
    const/16 v13, 0x8

    .line 987
    .line 988
    goto :goto_23

    .line 989
    :cond_34
    move-wide/from16 v30, v1

    .line 990
    .line 991
    :goto_22
    move-object/from16 v29, v4

    .line 992
    .line 993
    move-object/from16 v33, v8

    .line 994
    .line 995
    move/from16 v32, v13

    .line 996
    .line 997
    move-object/from16 v34, v14

    .line 998
    .line 999
    move-object/from16 v35, v15

    .line 1000
    .line 1001
    move-object/from16 v4, p5

    .line 1002
    .line 1003
    goto :goto_21

    .line 1004
    :goto_23
    shr-long v1, v30, v13

    .line 1005
    .line 1006
    add-int/lit8 v8, v32, 0x1

    .line 1007
    .line 1008
    move v13, v8

    .line 1009
    move-object/from16 v4, v29

    .line 1010
    .line 1011
    move-object/from16 v8, v33

    .line 1012
    .line 1013
    move-object/from16 v14, v34

    .line 1014
    .line 1015
    move-object/from16 v15, v35

    .line 1016
    .line 1017
    goto/16 :goto_1b

    .line 1018
    .line 1019
    :cond_35
    move-object/from16 v29, v4

    .line 1020
    .line 1021
    move-object/from16 v33, v8

    .line 1022
    .line 1023
    move-object/from16 v34, v14

    .line 1024
    .line 1025
    move-object/from16 v35, v15

    .line 1026
    .line 1027
    const/16 v13, 0x8

    .line 1028
    .line 1029
    move-object/from16 v4, p5

    .line 1030
    .line 1031
    if-ne v12, v13, :cond_38

    .line 1032
    .line 1033
    goto :goto_24

    .line 1034
    :cond_36
    move-object/from16 v29, v4

    .line 1035
    .line 1036
    move-object/from16 v33, v8

    .line 1037
    .line 1038
    move-object/from16 v34, v14

    .line 1039
    .line 1040
    move-object/from16 v35, v15

    .line 1041
    .line 1042
    const/16 v13, 0x8

    .line 1043
    .line 1044
    move-object/from16 v4, p5

    .line 1045
    .line 1046
    :goto_24
    if-eq v10, v5, :cond_38

    .line 1047
    .line 1048
    add-int/lit8 v10, v10, 0x1

    .line 1049
    .line 1050
    move-object/from16 v13, v27

    .line 1051
    .line 1052
    move-object/from16 v12, v28

    .line 1053
    .line 1054
    move-object/from16 v4, v29

    .line 1055
    .line 1056
    move-object/from16 v8, v33

    .line 1057
    .line 1058
    move-object/from16 v14, v34

    .line 1059
    .line 1060
    move-object/from16 v15, v35

    .line 1061
    .line 1062
    goto/16 :goto_1a

    .line 1063
    .line 1064
    :cond_37
    move-object/from16 v4, p5

    .line 1065
    .line 1066
    move-object/from16 v28, v1

    .line 1067
    .line 1068
    move-object/from16 v27, v13

    .line 1069
    .line 1070
    move-object/from16 v34, v14

    .line 1071
    .line 1072
    :cond_38
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v1

    .line 1076
    if-nez v1, :cond_3e

    .line 1077
    .line 1078
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    const/4 v15, 0x1

    .line 1083
    if-le v1, v15, :cond_39

    .line 1084
    .line 1085
    new-instance v1, Ls/y;

    .line 1086
    .line 1087
    const/4 v2, 0x3

    .line 1088
    invoke-direct {v1, v4, v2}, Ls/y;-><init>(Lac/k;I)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v9, v1}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1092
    .line 1093
    .line 1094
    :cond_39
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1095
    .line 1096
    .line 1097
    move-result v1

    .line 1098
    const/4 v2, 0x0

    .line 1099
    :goto_25
    if-ge v2, v1, :cond_3d

    .line 1100
    .line 1101
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    check-cast v5, Lr/q;

    .line 1106
    .line 1107
    iget-object v6, v5, Lr/q;->k:Ljava/lang/Object;

    .line 1108
    .line 1109
    invoke-virtual {v11, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v6

    .line 1113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1114
    .line 1115
    .line 1116
    check-cast v6, Ls/x;

    .line 1117
    .line 1118
    invoke-static {v3, v5}, Ls/z;->g([ILr/q;)I

    .line 1119
    .line 1120
    .line 1121
    move-result v8

    .line 1122
    if-eqz p8, :cond_3b

    .line 1123
    .line 1124
    invoke-static/range {p4 .. p4}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v6

    .line 1128
    check-cast v6, Lr/q;

    .line 1129
    .line 1130
    const/4 v10, 0x0

    .line 1131
    invoke-virtual {v6, v10}, Lr/q;->b(I)J

    .line 1132
    .line 1133
    .line 1134
    move-result-wide v12

    .line 1135
    iget-boolean v6, v6, Lr/q;->c:Z

    .line 1136
    .line 1137
    if-eqz v6, :cond_3a

    .line 1138
    .line 1139
    and-long v12, v12, v17

    .line 1140
    .line 1141
    :goto_26
    long-to-int v6, v12

    .line 1142
    goto :goto_27

    .line 1143
    :cond_3a
    shr-long v12, v12, v19

    .line 1144
    .line 1145
    goto :goto_26

    .line 1146
    :cond_3b
    iget v6, v6, Ls/x;->f:I

    .line 1147
    .line 1148
    :goto_27
    sub-int/2addr v6, v8

    .line 1149
    move/from16 v8, p2

    .line 1150
    .line 1151
    move/from16 v10, p3

    .line 1152
    .line 1153
    invoke-virtual {v5, v6, v8, v10}, Lr/q;->d(III)V

    .line 1154
    .line 1155
    .line 1156
    const/4 v15, 0x1

    .line 1157
    if-eqz p9, :cond_3c

    .line 1158
    .line 1159
    invoke-virtual {v0, v5, v15}, Ls/z;->f(Lr/q;Z)V

    .line 1160
    .line 1161
    .line 1162
    :cond_3c
    add-int/lit8 v2, v2, 0x1

    .line 1163
    .line 1164
    goto :goto_25

    .line 1165
    :cond_3d
    move/from16 v8, p2

    .line 1166
    .line 1167
    move/from16 v10, p3

    .line 1168
    .line 1169
    const/4 v2, 0x0

    .line 1170
    const/4 v15, 0x1

    .line 1171
    invoke-static {v3, v2, v15, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_28

    .line 1175
    :cond_3e
    move/from16 v8, p2

    .line 1176
    .line 1177
    move/from16 v10, p3

    .line 1178
    .line 1179
    const/4 v15, 0x1

    .line 1180
    :goto_28
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v1

    .line 1184
    if-nez v1, :cond_41

    .line 1185
    .line 1186
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    if-le v1, v15, :cond_3f

    .line 1191
    .line 1192
    new-instance v1, Ls/y;

    .line 1193
    .line 1194
    const/4 v2, 0x1

    .line 1195
    invoke-direct {v1, v4, v2}, Ls/y;-><init>(Lac/k;I)V

    .line 1196
    .line 1197
    .line 1198
    invoke-static {v7, v1}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1199
    .line 1200
    .line 1201
    :cond_3f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1202
    .line 1203
    .line 1204
    move-result v1

    .line 1205
    const/4 v2, 0x0

    .line 1206
    :goto_29
    if-ge v2, v1, :cond_41

    .line 1207
    .line 1208
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v4

    .line 1212
    check-cast v4, Lr/q;

    .line 1213
    .line 1214
    iget-object v5, v4, Lr/q;->k:Ljava/lang/Object;

    .line 1215
    .line 1216
    invoke-virtual {v11, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v5

    .line 1220
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    .line 1222
    .line 1223
    check-cast v5, Ls/x;

    .line 1224
    .line 1225
    invoke-static {v3, v4}, Ls/z;->g([ILr/q;)I

    .line 1226
    .line 1227
    .line 1228
    move-result v6

    .line 1229
    iget v5, v5, Ls/x;->g:I

    .line 1230
    .line 1231
    iget v12, v4, Lr/q;->q:I

    .line 1232
    .line 1233
    sub-int/2addr v5, v12

    .line 1234
    add-int/2addr v5, v6

    .line 1235
    invoke-virtual {v4, v5, v8, v10}, Lr/q;->d(III)V

    .line 1236
    .line 1237
    .line 1238
    const/4 v15, 0x1

    .line 1239
    if-eqz p9, :cond_40

    .line 1240
    .line 1241
    invoke-virtual {v0, v4, v15}, Ls/z;->f(Lr/q;Z)V

    .line 1242
    .line 1243
    .line 1244
    :cond_40
    add-int/lit8 v2, v2, 0x1

    .line 1245
    .line 1246
    goto :goto_29

    .line 1247
    :cond_41
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1248
    .line 1249
    .line 1250
    move-object/from16 v4, p4

    .line 1251
    .line 1252
    const/4 v2, 0x0

    .line 1253
    invoke-virtual {v4, v2, v9}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->clear()V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->clear()V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual/range {v28 .. v28}, Lf/l0;->b()V

    .line 1272
    .line 1273
    .line 1274
    return-void
.end method

.method public final d()V
    .locals 15

    .line 1
    iget-object v0, p0, Ls/z;->a:Lf/k0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf/k0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, v0, Lf/k0;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, v0, Lf/k0;->a:[J

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    add-int/lit8 v3, v3, -0x2

    .line 15
    .line 16
    if-ltz v3, :cond_4

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    :goto_0
    aget-wide v6, v2, v5

    .line 21
    .line 22
    not-long v8, v6

    .line 23
    const/4 v10, 0x7

    .line 24
    shl-long/2addr v8, v10

    .line 25
    and-long/2addr v8, v6

    .line 26
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v8, v10

    .line 32
    cmp-long v8, v8, v10

    .line 33
    .line 34
    if-eqz v8, :cond_3

    .line 35
    .line 36
    sub-int v8, v5, v3

    .line 37
    .line 38
    not-int v8, v8

    .line 39
    ushr-int/lit8 v8, v8, 0x1f

    .line 40
    .line 41
    const/16 v9, 0x8

    .line 42
    .line 43
    rsub-int/lit8 v8, v8, 0x8

    .line 44
    .line 45
    move v10, v4

    .line 46
    :goto_1
    if-ge v10, v8, :cond_2

    .line 47
    .line 48
    const-wide/16 v11, 0xff

    .line 49
    .line 50
    and-long/2addr v11, v6

    .line 51
    const-wide/16 v13, 0x80

    .line 52
    .line 53
    cmp-long v11, v11, v13

    .line 54
    .line 55
    if-gez v11, :cond_1

    .line 56
    .line 57
    shl-int/lit8 v11, v5, 0x3

    .line 58
    .line 59
    add-int/2addr v11, v10

    .line 60
    aget-object v11, v1, v11

    .line 61
    .line 62
    check-cast v11, Ls/x;

    .line 63
    .line 64
    iget-object v11, v11, Ls/x;->a:[Ls/t;

    .line 65
    .line 66
    array-length v12, v11

    .line 67
    move v13, v4

    .line 68
    :goto_2
    if-ge v13, v12, :cond_1

    .line 69
    .line 70
    aget-object v14, v11, v13

    .line 71
    .line 72
    if-eqz v14, :cond_0

    .line 73
    .line 74
    invoke-virtual {v14}, Ls/t;->c()V

    .line 75
    .line 76
    .line 77
    :cond_0
    add-int/lit8 v13, v13, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    shr-long/2addr v6, v9

    .line 81
    add-int/lit8 v10, v10, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    if-ne v8, v9, :cond_4

    .line 85
    .line 86
    :cond_3
    if-eq v5, v3, :cond_4

    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {v0}, Lf/k0;->a()V

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/z;->a:Lf/k0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ls/x;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, Ls/x;->a:[Ls/t;

    .line 12
    .line 13
    array-length v0, p1

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    aget-object v2, p1, v1

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ls/t;->c()V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public final f(Lr/q;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Ls/z;->a:Lf/k0;

    .line 6
    .line 7
    iget-object v3, v0, Lr/q;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v2, Ls/x;

    .line 17
    .line 18
    iget-object v2, v2, Ls/x;->a:[Ls/t;

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v4, v3, :cond_3

    .line 24
    .line 25
    aget-object v7, v2, v4

    .line 26
    .line 27
    add-int/lit8 v13, v5, 0x1

    .line 28
    .line 29
    if-eqz v7, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lr/q;->b(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide v14

    .line 35
    iget-wide v5, v7, Ls/t;->j:J

    .line 36
    .line 37
    sget-wide v8, Ls/t;->q:J

    .line 38
    .line 39
    invoke-static {v5, v6, v8, v9}, Lu2/j;->b(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_1

    .line 44
    .line 45
    invoke-static {v5, v6, v14, v15}, Lu2/j;->b(JJ)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_1

    .line 50
    .line 51
    invoke-static {v14, v15, v5, v6}, Lu2/j;->c(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    iget-object v8, v7, Ls/t;->d:Li/y;

    .line 56
    .line 57
    if-nez v8, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    iget-object v9, v7, Ls/t;->o:Li0/j1;

    .line 61
    .line 62
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, Lu2/j;

    .line 67
    .line 68
    iget-wide v9, v9, Lu2/j;->a:J

    .line 69
    .line 70
    invoke-static {v9, v10, v5, v6}, Lu2/j;->c(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide v9

    .line 74
    invoke-virtual {v7, v9, v10}, Ls/t;->e(J)V

    .line 75
    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    invoke-virtual {v7, v5}, Ls/t;->d(Z)V

    .line 79
    .line 80
    .line 81
    move/from16 v5, p2

    .line 82
    .line 83
    iput-boolean v5, v7, Ls/t;->e:Z

    .line 84
    .line 85
    iget-object v6, v7, Ls/t;->a:Lqg/t;

    .line 86
    .line 87
    move-object v11, v6

    .line 88
    new-instance v6, Lc0/i;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    const/4 v11, 0x0

    .line 92
    move-object/from16 v16, v12

    .line 93
    .line 94
    const/4 v12, 0x5

    .line 95
    move-object/from16 v0, v16

    .line 96
    .line 97
    invoke-direct/range {v6 .. v12}, Lc0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V

    .line 98
    .line 99
    .line 100
    const/4 v8, 0x3

    .line 101
    const/4 v9, 0x0

    .line 102
    invoke-static {v0, v9, v6, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    :goto_1
    move/from16 v5, p2

    .line 107
    .line 108
    :goto_2
    iput-wide v14, v7, Ls/t;->j:J

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_2
    move/from16 v5, p2

    .line 112
    .line 113
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    move-object/from16 v0, p1

    .line 116
    .line 117
    move v5, v13

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
.end method
