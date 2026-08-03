.class public abstract Lp/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp/c;

.field public static final b:Lp/c;

.field public static final c:Lp/c0;

.field public static final d:Lo9/e;

.field public static final e:Lo9/e;

.field public static final f:Lo9/e;

.field public static final g:Lo9/e;

.field public static final h:I = 0x9

.field public static final i:I = 0x6

.field public static final j:I = 0xa

.field public static final k:I = 0x5

.field public static final l:I = 0xf


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lp/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp/d;->a:Lp/c;

    .line 8
    .line 9
    new-instance v0, Lp/c;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lp/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lp/d;->b:Lp/c;

    .line 16
    .line 17
    new-instance v0, Lp/c0;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lp/d;->c:Lp/c0;

    .line 23
    .line 24
    new-instance v0, Lo9/e;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    invoke-direct {v0, v1}, Lo9/e;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lp/d;->d:Lo9/e;

    .line 31
    .line 32
    new-instance v0, Lo9/e;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-direct {v0, v1}, Lo9/e;-><init>(I)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lp/d;->e:Lo9/e;

    .line 39
    .line 40
    new-instance v0, Lo9/e;

    .line 41
    .line 42
    const/4 v1, 0x7

    .line 43
    invoke-direct {v0, v1}, Lo9/e;-><init>(I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lp/d;->f:Lo9/e;

    .line 47
    .line 48
    new-instance v0, Lo9/e;

    .line 49
    .line 50
    const/16 v1, 0x8

    .line 51
    .line 52
    invoke-direct {v0, v1}, Lo9/e;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lp/d;->g:Lo9/e;

    .line 56
    .line 57
    return-void
.end method

.method public static a(IF)Lp/z0;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v1, v0

    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    int-to-float p1, v0

    .line 8
    :cond_0
    new-instance p0, Lp/z0;

    .line 9
    .line 10
    invoke-direct {p0, v1, p1, v1, p1}, Lp/z0;-><init>(FFFF)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public static b(FFI)Lp/z0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v1, v0

    .line 3
    int-to-float v2, v0

    .line 4
    and-int/lit8 p2, p2, 0x8

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    int-to-float p1, v0

    .line 9
    :cond_0
    new-instance p2, Lp/z0;

    .line 10
    .line 11
    invoke-direct {p2, v1, p0, v2, p1}, Lp/z0;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    return-object p2
.end method

.method public static final c(Li0/h0;Ly0/o;)V
    .locals 5

    .line 1
    sget-object v0, Lp/n;->c:Lp/n;

    .line 2
    .line 3
    iget-wide v1, p0, Li0/h0;->T:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p0, p1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Li0/h0;->l()Ls0/h;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lx1/g;->f:Lx1/f;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v3, Lx1/f;->b:Lx1/y;

    .line 23
    .line 24
    iget-object v4, p0, Li0/h0;->a:Lx1/f2;

    .line 25
    .line 26
    invoke-virtual {p0}, Li0/h0;->d0()V

    .line 27
    .line 28
    .line 29
    iget-boolean v4, p0, Li0/h0;->S:Z

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Li0/h0;->k(Lfg/a;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Li0/h0;->n0()V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object v3, Lx1/f;->e:Lx1/e;

    .line 41
    .line 42
    invoke-static {v3, p0, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 46
    .line 47
    invoke-static {v0, p0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 51
    .line 52
    invoke-static {v0, p0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 56
    .line 57
    invoke-static {v0, p0, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 65
    .line 66
    invoke-static {v0, p0, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    invoke-virtual {p0, p1}, Li0/h0;->p(Z)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static final d(Lp/b;Li0/h0;)Lp/j0;
    .locals 2

    .line 1
    new-instance v0, Lp/j0;

    .line 2
    .line 3
    sget-object v1, Ly1/h1;->h:Li0/m2;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu2/c;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lp/j0;-><init>(Lp/r1;Lu2/c;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final e(Lv1/m0;)Lp/c1;
    .locals 1

    .line 1
    invoke-interface {p0}, Lv1/m0;->X()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lp/c1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lp/c1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static final f(Lp/c1;)F
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget p0, p0, Lp/c1;->a:F

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static final g()Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/l0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static h(Lp/b1;IIIIILv1/p0;Ljava/util/List;[Lv1/b1;I)Lv1/o0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move/from16 v5, p9

    .line 12
    .line 13
    int-to-long v6, v3

    .line 14
    new-array v8, v5, [I

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    :goto_0
    if-ge v11, v5, :cond_5

    .line 25
    .line 26
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v17

    .line 30
    move-object/from16 v9, v17

    .line 31
    .line 32
    check-cast v9, Lv1/m0;

    .line 33
    .line 34
    invoke-static {v9}, Lp/d;->e(Lv1/m0;)Lp/c1;

    .line 35
    .line 36
    .line 37
    move-result-object v17

    .line 38
    invoke-static/range {v17 .. v17}, Lp/d;->f(Lp/c1;)F

    .line 39
    .line 40
    .line 41
    move-result v17

    .line 42
    cmpl-float v18, v17, v16

    .line 43
    .line 44
    if-lez v18, :cond_0

    .line 45
    .line 46
    add-float v15, v15, v17

    .line 47
    .line 48
    add-int/lit8 v12, v12, 0x1

    .line 49
    .line 50
    move-wide/from16 v18, v6

    .line 51
    .line 52
    move/from16 v20, v11

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_0
    sub-int v14, v1, v13

    .line 56
    .line 57
    aget-object v17, p8, v11

    .line 58
    .line 59
    move-wide/from16 v18, v6

    .line 60
    .line 61
    if-nez v17, :cond_3

    .line 62
    .line 63
    const v6, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v1, v6, :cond_1

    .line 67
    .line 68
    move/from16 v20, v11

    .line 69
    .line 70
    move/from16 v21, v12

    .line 71
    .line 72
    const v6, 0x7fffffff

    .line 73
    .line 74
    .line 75
    :goto_1
    const/4 v7, 0x0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move/from16 v20, v11

    .line 78
    .line 79
    move/from16 v21, v12

    .line 80
    .line 81
    if-gez v14, :cond_2

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v6, v14

    .line 86
    goto :goto_1

    .line 87
    :goto_2
    invoke-interface {v0, v7, v6, v2, v7}, Lp/b1;->b(IIIZ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    invoke-interface {v9, v11, v12}, Lv1/m0;->Q(J)Lv1/b1;

    .line 92
    .line 93
    .line 94
    move-result-object v17

    .line 95
    :goto_3
    move-object/from16 v6, v17

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    move/from16 v20, v11

    .line 99
    .line 100
    move/from16 v21, v12

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    invoke-interface {v0, v6}, Lp/b1;->d(Lv1/b1;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-interface {v0, v6}, Lp/b1;->e(Lv1/b1;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    aput v7, v8, v20

    .line 112
    .line 113
    sub-int v11, v14, v7

    .line 114
    .line 115
    if-gez v11, :cond_4

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    :cond_4
    invoke-static {v3, v11}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    add-int/2addr v7, v14

    .line 123
    add-int/2addr v13, v7

    .line 124
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    aput-object v6, p8, v20

    .line 129
    .line 130
    move/from16 v12, v21

    .line 131
    .line 132
    :goto_5
    add-int/lit8 v11, v20, 0x1

    .line 133
    .line 134
    move-wide/from16 v6, v18

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    move-wide/from16 v18, v6

    .line 138
    .line 139
    move/from16 v21, v12

    .line 140
    .line 141
    if-nez v21, :cond_6

    .line 142
    .line 143
    sub-int/2addr v13, v14

    .line 144
    const/4 v7, 0x0

    .line 145
    goto/16 :goto_f

    .line 146
    .line 147
    :cond_6
    const v6, 0x7fffffff

    .line 148
    .line 149
    .line 150
    if-eq v1, v6, :cond_7

    .line 151
    .line 152
    move v3, v1

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    move/from16 v3, p1

    .line 155
    .line 156
    :goto_6
    const/4 v6, 0x1

    .line 157
    add-int/lit8 v12, v21, -0x1

    .line 158
    .line 159
    int-to-long v11, v12

    .line 160
    mul-long v11, v11, v18

    .line 161
    .line 162
    sub-int/2addr v3, v13

    .line 163
    int-to-long v6, v3

    .line 164
    sub-long/2addr v6, v11

    .line 165
    const-wide/16 v18, 0x0

    .line 166
    .line 167
    cmp-long v3, v6, v18

    .line 168
    .line 169
    if-gez v3, :cond_8

    .line 170
    .line 171
    move-wide/from16 v6, v18

    .line 172
    .line 173
    :cond_8
    long-to-float v3, v6

    .line 174
    div-float/2addr v3, v15

    .line 175
    const/4 v9, 0x0

    .line 176
    :goto_7
    if-ge v9, v5, :cond_9

    .line 177
    .line 178
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    check-cast v14, Lv1/m0;

    .line 183
    .line 184
    invoke-static {v14}, Lp/d;->e(Lv1/m0;)Lp/c1;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-static {v14}, Lp/d;->f(Lp/c1;)F

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    mul-float/2addr v14, v3

    .line 193
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    int-to-long v14, v14

    .line 198
    sub-long/2addr v6, v14

    .line 199
    add-int/lit8 v9, v9, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_9
    move v14, v10

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    :goto_8
    if-ge v9, v5, :cond_f

    .line 206
    .line 207
    aget-object v15, p8, v9

    .line 208
    .line 209
    if-nez v15, :cond_e

    .line 210
    .line 211
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Lv1/m0;

    .line 216
    .line 217
    invoke-static {v15}, Lp/d;->e(Lv1/m0;)Lp/c1;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1}, Lp/d;->f(Lp/c1;)F

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    cmpl-float v18, v17, v16

    .line 226
    .line 227
    if-lez v18, :cond_a

    .line 228
    .line 229
    :goto_9
    move/from16 v18, v3

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_a
    const-string v18, "All weights <= 0 should have placeables"

    .line 233
    .line 234
    invoke-static/range {v18 .. v18}, Lq/a;->b(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :goto_a
    invoke-static {v6, v7}, Ljava/lang/Long;->signum(J)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    move-wide/from16 v19, v6

    .line 243
    .line 244
    int-to-long v6, v3

    .line 245
    sub-long v6, v19, v6

    .line 246
    .line 247
    mul-float v17, v17, v18

    .line 248
    .line 249
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 250
    .line 251
    .line 252
    move-result v17

    .line 253
    add-int v3, v17, v3

    .line 254
    .line 255
    const/4 v4, 0x0

    .line 256
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v1, :cond_b

    .line 261
    .line 262
    iget-boolean v1, v1, Lp/c1;->b:Z

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_b
    const/4 v1, 0x1

    .line 266
    :goto_b
    if-eqz v1, :cond_c

    .line 267
    .line 268
    const v1, 0x7fffffff

    .line 269
    .line 270
    .line 271
    if-eq v3, v1, :cond_d

    .line 272
    .line 273
    move v4, v3

    .line 274
    :goto_c
    const/4 v1, 0x1

    .line 275
    goto :goto_d

    .line 276
    :cond_c
    const v1, 0x7fffffff

    .line 277
    .line 278
    .line 279
    :cond_d
    const/4 v4, 0x0

    .line 280
    goto :goto_c

    .line 281
    :goto_d
    invoke-interface {v0, v4, v3, v2, v1}, Lp/b1;->b(IIIZ)J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    invoke-interface {v15, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v0, v3}, Lp/b1;->d(Lv1/b1;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-interface {v0, v3}, Lp/b1;->e(Lv1/b1;)I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    aput v4, v8, v9

    .line 298
    .line 299
    add-int/2addr v10, v4

    .line 300
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    aput-object v3, p8, v9

    .line 305
    .line 306
    move v14, v4

    .line 307
    goto :goto_e

    .line 308
    :cond_e
    move/from16 v18, v3

    .line 309
    .line 310
    move-wide/from16 v19, v6

    .line 311
    .line 312
    const/4 v1, 0x1

    .line 313
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 314
    .line 315
    move/from16 v1, p3

    .line 316
    .line 317
    move-object/from16 v4, p7

    .line 318
    .line 319
    move/from16 v3, v18

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_f
    int-to-long v1, v10

    .line 323
    add-long/2addr v1, v11

    .line 324
    long-to-int v7, v1

    .line 325
    sub-int v1, p3, v13

    .line 326
    .line 327
    if-gez v7, :cond_10

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    :cond_10
    if-le v7, v1, :cond_11

    .line 331
    .line 332
    move v7, v1

    .line 333
    :cond_11
    move v10, v14

    .line 334
    :goto_f
    add-int/2addr v7, v13

    .line 335
    if-gez v7, :cond_12

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    :cond_12
    move/from16 v1, p1

    .line 339
    .line 340
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    move/from16 v1, p2

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    new-array v3, v5, [I

    .line 356
    .line 357
    move-object/from16 v2, p6

    .line 358
    .line 359
    invoke-interface {v0, v4, v2, v8, v3}, Lp/b1;->j(ILv1/p0;[I[I)V

    .line 360
    .line 361
    .line 362
    move v5, v1

    .line 363
    move-object/from16 v1, p8

    .line 364
    .line 365
    invoke-interface/range {v0 .. v5}, Lp/b1;->f([Lv1/b1;Lv1/p0;[III)Lv1/o0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0
.end method

.method public static final i(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/t0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/t0;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final j(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/v;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/v;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final k(Ly0/o;Lp/x0;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/y0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/y0;-><init>(Lp/x0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final l(Ly0/o;F)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/v0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p1, p1, p1}, Lp/v0;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final m(Ly0/o;FF)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/v0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p1, p2}, Lp/v0;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static n(Ly0/o;FFI)Ly0/o;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    int-to-float p1, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    int-to-float p2, v1

    .line 12
    :cond_1
    invoke-static {p0, p1, p2}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final o(Ly0/o;FFFF)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/v0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lp/v0;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static p(Ly0/o;FFFFI)Ly0/o;
    .locals 2

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    int-to-float p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    int-to-float p2, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p5, 0x4

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    int-to-float p3, v1

    .line 17
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 18
    .line 19
    if-eqz p5, :cond_3

    .line 20
    .line 21
    int-to-float p4, v1

    .line 22
    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Lp/d;->o(Ly0/o;FFFF)Ly0/o;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final q(Lb3/a;)Lp/k0;
    .locals 4

    .line 1
    new-instance v0, Lp/k0;

    .line 2
    .line 3
    iget v1, p0, Lb3/a;->a:I

    .line 4
    .line 5
    iget v2, p0, Lb3/a;->b:I

    .line 6
    .line 7
    iget v3, p0, Lb3/a;->c:I

    .line 8
    .line 9
    iget p0, p0, Lb3/a;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p0}, Lp/k0;-><init>(IIII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final r(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final s(Ly0/o;Lp/n0;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/o0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/o0;-><init>(Lp/n0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final t(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/j1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/j1;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final u(Ly0/o;Lp/s0;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/g0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp/g0;-><init>(Lp/s0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
