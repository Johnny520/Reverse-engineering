.class public abstract Lk/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(Ly0/o;Lfg/l;Li0/h0;I)V
    .locals 4

    .line 1
    const v0, -0x3799f46e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    and-int/lit8 v1, v0, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    :goto_2
    and-int/2addr v0, v3

    .line 40
    invoke-virtual {p2, v0, v1}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-static {p0, p1}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p2, v0}, Lp/d;->c(Li0/h0;Ly0/o;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 55
    .line 56
    .line 57
    :goto_3
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    new-instance v0, Lb0/q;

    .line 64
    .line 65
    const/16 v1, 0x8

    .line 66
    .line 67
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 71
    .line 72
    :cond_4
    return-void
.end method

.method public static final b(Lk1/b;Ljava/lang/String;Ly0/o;Lv1/s0;Lf1/n;Li0/h0;I)V
    .locals 8

    .line 1
    sget-object v0, Ly0/b;->k:Ly0/g;

    .line 2
    .line 3
    const v1, 0x441d0e20

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v1, p6, 0x6

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    and-int/lit8 v1, p6, 0x8

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p5, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p5, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v2

    .line 32
    :goto_1
    or-int/2addr v1, p6

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v1, p6

    .line 35
    :goto_2
    and-int/lit8 v3, p6, 0x30

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    if-nez v3, :cond_4

    .line 40
    .line 41
    invoke-virtual {p5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    move v3, v4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/16 v3, 0x10

    .line 50
    .line 51
    :goto_3
    or-int/2addr v1, v3

    .line 52
    :cond_4
    and-int/lit16 v3, p6, 0x180

    .line 53
    .line 54
    if-nez v3, :cond_6

    .line 55
    .line 56
    invoke-virtual {p5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    const/16 v3, 0x100

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    const/16 v3, 0x80

    .line 66
    .line 67
    :goto_4
    or-int/2addr v1, v3

    .line 68
    :cond_6
    and-int/lit16 v3, p6, 0xc00

    .line 69
    .line 70
    if-nez v3, :cond_8

    .line 71
    .line 72
    invoke-virtual {p5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    const/16 v0, 0x800

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    const/16 v0, 0x400

    .line 82
    .line 83
    :goto_5
    or-int/2addr v1, v0

    .line 84
    :cond_8
    and-int/lit16 v0, p6, 0x6000

    .line 85
    .line 86
    if-nez v0, :cond_a

    .line 87
    .line 88
    invoke-virtual {p5, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    const/16 v0, 0x4000

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_9
    const/16 v0, 0x2000

    .line 98
    .line 99
    :goto_6
    or-int/2addr v1, v0

    .line 100
    :cond_a
    const/high16 v0, 0x30000

    .line 101
    .line 102
    and-int/2addr v0, p6

    .line 103
    if-nez v0, :cond_c

    .line 104
    .line 105
    const/high16 v0, 0x3f800000    # 1.0f

    .line 106
    .line 107
    invoke-virtual {p5, v0}, Li0/h0;->c(F)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_b

    .line 112
    .line 113
    const/high16 v0, 0x20000

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_b
    const/high16 v0, 0x10000

    .line 117
    .line 118
    :goto_7
    or-int/2addr v1, v0

    .line 119
    :cond_c
    const/high16 v0, 0x180000

    .line 120
    .line 121
    and-int/2addr v0, p6

    .line 122
    if-nez v0, :cond_e

    .line 123
    .line 124
    invoke-virtual {p5, p4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_d

    .line 129
    .line 130
    const/high16 v0, 0x100000

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_d
    const/high16 v0, 0x80000

    .line 134
    .line 135
    :goto_8
    or-int/2addr v1, v0

    .line 136
    :cond_e
    const v0, 0x92493

    .line 137
    .line 138
    .line 139
    and-int/2addr v0, v1

    .line 140
    const v3, 0x92492

    .line 141
    .line 142
    .line 143
    const/4 v5, 0x0

    .line 144
    const/4 v6, 0x1

    .line 145
    if-eq v0, v3, :cond_f

    .line 146
    .line 147
    move v0, v6

    .line 148
    goto :goto_9

    .line 149
    :cond_f
    move v0, v5

    .line 150
    :goto_9
    and-int/lit8 v3, v1, 0x1

    .line 151
    .line 152
    invoke-virtual {p5, v3, v0}, Li0/h0;->S(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_16

    .line 157
    .line 158
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 159
    .line 160
    sget-object v3, Li0/l;->a:Li0/e;

    .line 161
    .line 162
    if-eqz p1, :cond_13

    .line 163
    .line 164
    const v7, 0x7133d784

    .line 165
    .line 166
    .line 167
    invoke-virtual {p5, v7}, Li0/h0;->a0(I)V

    .line 168
    .line 169
    .line 170
    and-int/lit8 v1, v1, 0x70

    .line 171
    .line 172
    if-ne v1, v4, :cond_10

    .line 173
    .line 174
    move v1, v6

    .line 175
    goto :goto_a

    .line 176
    :cond_10
    move v1, v5

    .line 177
    :goto_a
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-nez v1, :cond_11

    .line 182
    .line 183
    if-ne v4, v3, :cond_12

    .line 184
    .line 185
    :cond_11
    new-instance v4, Lca/s;

    .line 186
    .line 187
    const/16 v1, 0x9

    .line 188
    .line 189
    invoke-direct {v4, p1, v1}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_12
    check-cast v4, Lfg/l;

    .line 196
    .line 197
    invoke-static {v0, v4}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {p5, v5}, Li0/h0;->p(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_b

    .line 205
    :cond_13
    const v1, 0x713643c2

    .line 206
    .line 207
    .line 208
    invoke-virtual {p5, v1}, Li0/h0;->a0(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p5, v5}, Li0/h0;->p(Z)V

    .line 212
    .line 213
    .line 214
    :goto_b
    invoke-interface {p2, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Lc1/h;->c(Ly0/o;)Ly0/o;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0, p0, p3, p4, v2}, Lc1/h;->g(Ly0/o;Lk1/b;Lv1/s0;Lf1/n;I)Ly0/o;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    if-ne v1, v3, :cond_14

    .line 231
    .line 232
    sget-object v1, Lk/u0;->a:Lk/u0;

    .line 233
    .line 234
    invoke-virtual {p5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_14
    check-cast v1, Lv1/n0;

    .line 238
    .line 239
    iget-wide v2, p5, Li0/h0;->T:J

    .line 240
    .line 241
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-static {p5, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p5}, Li0/h0;->l()Ls0/h;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    sget-object v4, Lx1/g;->f:Lx1/f;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    sget-object v4, Lx1/f;->b:Lx1/y;

    .line 259
    .line 260
    invoke-virtual {p5}, Li0/h0;->d0()V

    .line 261
    .line 262
    .line 263
    iget-boolean v5, p5, Li0/h0;->S:Z

    .line 264
    .line 265
    if-eqz v5, :cond_15

    .line 266
    .line 267
    invoke-virtual {p5, v4}, Li0/h0;->k(Lfg/a;)V

    .line 268
    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_15
    invoke-virtual {p5}, Li0/h0;->n0()V

    .line 272
    .line 273
    .line 274
    :goto_c
    sget-object v4, Lx1/f;->e:Lx1/e;

    .line 275
    .line 276
    invoke-static {v4, p5, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 280
    .line 281
    invoke-static {v1, p5, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 285
    .line 286
    invoke-static {v1, p5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 287
    .line 288
    .line 289
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 290
    .line 291
    invoke-static {v1, p5, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 299
    .line 300
    invoke-static {v1, p5, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p5, v6}, Li0/h0;->p(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_16
    invoke-virtual {p5}, Li0/h0;->V()V

    .line 308
    .line 309
    .line 310
    :goto_d
    invoke-virtual {p5}, Li0/h0;->t()Li0/r1;

    .line 311
    .line 312
    .line 313
    move-result-object p5

    .line 314
    if-eqz p5, :cond_17

    .line 315
    .line 316
    new-instance v0, Lc9/c0;

    .line 317
    .line 318
    const/4 v7, 0x3

    .line 319
    move-object v1, p0

    .line 320
    move-object v2, p1

    .line 321
    move-object v3, p2

    .line 322
    move-object v4, p3

    .line 323
    move-object v5, p4

    .line 324
    move v6, p6

    .line 325
    invoke-direct/range {v0 .. v7}, Lc9/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 326
    .line 327
    .line 328
    iput-object v0, p5, Li0/r1;->d:Lfg/p;

    .line 329
    .line 330
    :cond_17
    return-void
.end method

.method public static final c(Lm1/f;Ljava/lang/String;Ly0/o;Lf1/n;Li0/h0;I)V
    .locals 14

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move/from16 v0, p5

    .line 4
    .line 5
    sget-object v1, Ly1/h1;->h:Li0/m2;

    .line 6
    .line 7
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lu2/c;

    .line 12
    .line 13
    iget v2, p0, Lm1/f;->j:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    invoke-interface {v1}, Lu2/c;->d()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-long v6, v2

    .line 25
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    int-to-long v2, v2

    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    shl-long/2addr v6, v4

    .line 33
    const-wide v8, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v2, v8

    .line 39
    or-long/2addr v2, v6

    .line 40
    invoke-virtual {v5, v2, v3}, Li0/h0;->e(J)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Li0/l;->a:Li0/e;

    .line 51
    .line 52
    if-ne v3, v2, :cond_4

    .line 53
    .line 54
    :cond_0
    new-instance v2, Lm1/c;

    .line 55
    .line 56
    invoke-direct {v2}, Lm1/c;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Lm1/f;->f:Lm1/g0;

    .line 60
    .line 61
    invoke-static {v2, v3}, Lm1/b;->a(Lm1/c;Lm1/g0;)V

    .line 62
    .line 63
    .line 64
    iget v3, p0, Lm1/f;->b:F

    .line 65
    .line 66
    iget v6, p0, Lm1/f;->c:F

    .line 67
    .line 68
    invoke-interface {v1, v3}, Lu2/c;->x0(F)F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-interface {v1, v6}, Lu2/c;->x0(F)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    int-to-long v6, v3

    .line 81
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-long v10, v1

    .line 86
    shl-long/2addr v6, v4

    .line 87
    and-long/2addr v10, v8

    .line 88
    or-long/2addr v6, v10

    .line 89
    iget v1, p0, Lm1/f;->d:F

    .line 90
    .line 91
    iget v3, p0, Lm1/f;->e:F

    .line 92
    .line 93
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_1

    .line 98
    .line 99
    shr-long v10, v6, v4

    .line 100
    .line 101
    long-to-int v1, v10

    .line 102
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :cond_1
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_2

    .line 111
    .line 112
    and-long v10, v6, v8

    .line 113
    .line 114
    long-to-int v3, v10

    .line 115
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    :cond_2
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    int-to-long v10, v1

    .line 124
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    int-to-long v12, v1

    .line 129
    shl-long v3, v10, v4

    .line 130
    .line 131
    and-long/2addr v8, v12

    .line 132
    or-long/2addr v3, v8

    .line 133
    new-instance v1, Lm1/j0;

    .line 134
    .line 135
    invoke-direct {v1, v2}, Lm1/j0;-><init>(Lm1/c;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Lm1/f;->a:Ljava/lang/String;

    .line 139
    .line 140
    iget-wide v8, p0, Lm1/f;->g:J

    .line 141
    .line 142
    iget v10, p0, Lm1/f;->h:I

    .line 143
    .line 144
    const-wide/16 v11, 0x10

    .line 145
    .line 146
    cmp-long v11, v8, v11

    .line 147
    .line 148
    if-eqz v11, :cond_3

    .line 149
    .line 150
    new-instance v11, Lf1/n;

    .line 151
    .line 152
    invoke-direct {v11, v8, v9, v10}, Lf1/n;-><init>(JI)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const/4 v11, 0x0

    .line 157
    :goto_0
    iget-boolean p0, p0, Lm1/f;->i:Z

    .line 158
    .line 159
    new-instance v8, Le1/e;

    .line 160
    .line 161
    invoke-direct {v8, v6, v7}, Le1/e;-><init>(J)V

    .line 162
    .line 163
    .line 164
    iget-object v6, v1, Lm1/j0;->e:Li0/j1;

    .line 165
    .line 166
    invoke-virtual {v6, v8}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object v6, v1, Lm1/j0;->f:Li0/j1;

    .line 170
    .line 171
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v6, p0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object p0, v1, Lm1/j0;->g:Lm1/e0;

    .line 179
    .line 180
    iget-object v6, p0, Lm1/e0;->g:Li0/j1;

    .line 181
    .line 182
    invoke-virtual {v6, v11}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object v6, p0, Lm1/e0;->i:Li0/j1;

    .line 186
    .line 187
    new-instance v7, Le1/e;

    .line 188
    .line 189
    invoke-direct {v7, v3, v4}, Le1/e;-><init>(J)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v7}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iput-object v2, p0, Lm1/e0;->c:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v3, v1

    .line 201
    :cond_4
    check-cast v3, Lm1/j0;

    .line 202
    .line 203
    and-int/lit8 p0, v0, 0x70

    .line 204
    .line 205
    const/16 v1, 0x8

    .line 206
    .line 207
    or-int/2addr p0, v1

    .line 208
    and-int/lit16 v1, v0, 0x380

    .line 209
    .line 210
    or-int/2addr p0, v1

    .line 211
    and-int/lit16 v1, v0, 0x1c00

    .line 212
    .line 213
    or-int/2addr p0, v1

    .line 214
    const v1, 0xe000

    .line 215
    .line 216
    .line 217
    and-int/2addr v1, v0

    .line 218
    or-int/2addr p0, v1

    .line 219
    const/high16 v1, 0x70000

    .line 220
    .line 221
    and-int/2addr v1, v0

    .line 222
    or-int/2addr p0, v1

    .line 223
    const/high16 v1, 0x380000

    .line 224
    .line 225
    and-int/2addr v0, v1

    .line 226
    or-int v6, p0, v0

    .line 227
    .line 228
    move-object v0, v3

    .line 229
    sget-object v3, Lv1/g;->b:Lv1/s0;

    .line 230
    .line 231
    move-object v1, p1

    .line 232
    move-object/from16 v2, p2

    .line 233
    .line 234
    move-object/from16 v4, p3

    .line 235
    .line 236
    invoke-static/range {v0 .. v6}, Lk/n;->b(Lk1/b;Ljava/lang/String;Ly0/o;Lv1/s0;Lf1/n;Li0/h0;I)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public static final d(Lf1/g;Ljava/lang/String;Ly0/o;Lv1/s0;Li0/h0;II)V
    .locals 8

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    sget-object p3, Lv1/g;->b:Lv1/s0;

    .line 6
    .line 7
    :cond_0
    move-object v3, p3

    .line 8
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p6

    .line 16
    if-nez p3, :cond_1

    .line 17
    .line 18
    sget-object p3, Li0/l;->a:Li0/e;

    .line 19
    .line 20
    if-ne p6, p3, :cond_2

    .line 21
    .line 22
    :cond_1
    iget-object p3, p0, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result p6

    .line 28
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    int-to-long v0, p6

    .line 33
    const/16 p6, 0x20

    .line 34
    .line 35
    shl-long/2addr v0, p6

    .line 36
    int-to-long v4, p3

    .line 37
    const-wide v6, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v4, v6

    .line 43
    or-long/2addr v0, v4

    .line 44
    new-instance p6, Lk1/a;

    .line 45
    .line 46
    invoke-direct {p6, p0, v0, v1}, Lk1/a;-><init>(Lf1/g;J)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    iput p0, p6, Lk1/a;->g:I

    .line 51
    .line 52
    invoke-virtual {p4, p6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    move-object v0, p6

    .line 56
    check-cast v0, Lk1/a;

    .line 57
    .line 58
    and-int/lit8 p0, p5, 0x70

    .line 59
    .line 60
    const/16 p3, 0x8

    .line 61
    .line 62
    or-int/2addr p0, p3

    .line 63
    and-int/lit16 p3, p5, 0x380

    .line 64
    .line 65
    or-int/2addr p0, p3

    .line 66
    and-int/lit16 p3, p5, 0x1c00

    .line 67
    .line 68
    or-int/2addr p0, p3

    .line 69
    const p3, 0xe000

    .line 70
    .line 71
    .line 72
    and-int/2addr p3, p5

    .line 73
    or-int/2addr p0, p3

    .line 74
    const/high16 p3, 0x70000

    .line 75
    .line 76
    and-int/2addr p3, p5

    .line 77
    or-int/2addr p0, p3

    .line 78
    const/high16 p3, 0x380000

    .line 79
    .line 80
    and-int/2addr p3, p5

    .line 81
    or-int v6, p0, p3

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    move-object v1, p1

    .line 85
    move-object v2, p2

    .line 86
    move-object v5, p4

    .line 87
    invoke-static/range {v0 .. v6}, Lk/n;->b(Lk1/b;Ljava/lang/String;Ly0/o;Lv1/s0;Lf1/n;Li0/h0;I)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static e(Landroid/widget/EdgeEffect;FFLu2/c;)F
    .locals 8

    .line 1
    sget v0, Lk/f0;->a:F

    .line 2
    .line 3
    const v0, 0x43c10b3d

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, Lu2/c;->d()F

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    mul-float/2addr p3, v0

    .line 11
    const/high16 v0, 0x43200000    # 160.0f

    .line 12
    .line 13
    mul-float/2addr p3, v0

    .line 14
    const v0, 0x3f570a3d    # 0.84f

    .line 15
    .line 16
    .line 17
    mul-float/2addr p3, v0

    .line 18
    float-to-double v0, p3

    .line 19
    const p3, 0x3eb33333    # 0.35f

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    mul-float/2addr v2, p3

    .line 27
    float-to-double v2, v2

    .line 28
    sget p3, Lk/f0;->a:F

    .line 29
    .line 30
    float-to-double v4, p3

    .line 31
    mul-double/2addr v4, v0

    .line 32
    div-double/2addr v2, v4

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sget-wide v2, Lk/f0;->b:D

    .line 38
    .line 39
    sget-wide v6, Lk/f0;->c:D

    .line 40
    .line 41
    div-double/2addr v2, v6

    .line 42
    mul-double/2addr v2, v0

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    mul-double/2addr v0, v4

    .line 48
    double-to-float p3, v0

    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/16 v2, 0x1f

    .line 53
    .line 54
    if-lt v0, v2, :cond_0

    .line 55
    .line 56
    invoke-static {p0}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v3, v1

    .line 62
    :goto_0
    mul-float/2addr v3, p2

    .line 63
    cmpg-float p2, p3, v3

    .line 64
    .line 65
    if-gtz p2, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, Lig/a;->X(F)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-lt v0, v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return p1

    .line 87
    :cond_3
    return v1
.end method

.method public static f(Lf1/h0;)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lk/m;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    sget-object v4, Lf1/c0;->b:Lf1/m0;

    .line 7
    .line 8
    move-object v3, p0

    .line 9
    invoke-direct/range {v0 .. v5}, Lk/m;-><init>(JLf1/h0;Lf1/r0;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final g(Ly0/o;JLf1/r0;)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lk/m;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x2

    .line 5
    move-wide v1, p1

    .line 6
    move-object v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lk/m;-><init>(JLf1/h0;Lf1/r0;I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final h(JLm/p1;)V
    .locals 2

    .line 1
    sget-object v0, Lm/p1;->g:Lm/p1;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne p2, v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0, p1}, Lu2/a;->g(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 16
    .line 17
    invoke-static {p0}, Lo/b;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lu2/a;->h(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    const-string p0, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 29
    .line 30
    invoke-static {p0}, Lo/b;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static i(Ly0/o;Ln/k;Lk/y0;ZLf2/i;Lfg/a;I)Ly0/o;
    .locals 8

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    move v4, p3

    .line 7
    and-int/lit8 p3, p6, 0x10

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    move-object v6, p4

    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    new-instance v0, Lk/u;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move-object v1, p1

    .line 20
    move-object v2, p2

    .line 21
    move-object v7, p5

    .line 22
    invoke-direct/range {v0 .. v7}, Lk/u;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move-object v7, p5

    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    new-instance v0, Lk/u;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct/range {v0 .. v7}, Lk/u;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-static {p1, v1, v2}, Lk/v0;->a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lk/u;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct/range {v0 .. v7}, Lk/u;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    new-instance p2, Lk/v;

    .line 60
    .line 61
    invoke-direct {p2, v2, v4, v6, v7}, Lk/v;-><init>(Lk/y0;ZLf2/i;Lfg/a;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p2}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    move v4, p1

    .line 7
    and-int/lit8 p1, p5, 0x2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    move-object v5, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move-object v5, p2

    .line 15
    :goto_0
    and-int/lit8 p1, p5, 0x8

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move-object v1, p3

    .line 22
    :goto_1
    new-instance v0, Lk/u;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v7, p4

    .line 28
    invoke-direct/range {v0 .. v7}, Lk/u;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static k(Ly0/o;Ln/k;Lfg/a;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lk/z;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Lk/z;-><init>(Lfg/a;Ln/k;)V

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

.method public static final l(Ly0/o;Z)Ly0/o;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lk/h0;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 10
    .line 11
    :goto_0
    invoke-interface {p0, p1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final m(Lx1/j;)Lk/k0;
    .locals 2

    .line 1
    sget-object v0, Lk/l0;->v:Lk/b;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->j(Lx1/j;Ljava/lang/Object;)Lx1/e2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lk/l0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lk/l0;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Lk/l0;->u:Lx1/j;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public static final n(Ly0/o;Ln/k;Z)Ly0/o;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Lk/p0;

    .line 4
    .line 5
    invoke-direct {p2, p1}, Lk/p0;-><init>(Ln/k;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p2, Ly0/l;->a:Ly0/l;

    .line 10
    .line 11
    :goto_0
    invoke-interface {p0, p2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final o(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget p0, Lq1/a;->O:I

    .line 6
    .line 7
    sget-wide v2, Lq1/a;->h:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lq1/a;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-wide v2, Lq1/a;->r:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Lq1/a;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-wide v2, Lq1/a;->E:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Lq1/a;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    sget-wide v2, Lq1/a;->q:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Lq1/a;->a(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static final p(Li0/h0;)Z
    .locals 1

    .line 1
    sget-object v0, Ly1/i0;->a:Li0/u;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/res/Configuration;

    .line 8
    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

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

.method public static final q(Li0/h0;)Lk/w1;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Li0/h0;->d(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Li0/l;->a:Li0/e;

    .line 15
    .line 16
    if-ne v3, v2, :cond_1

    .line 17
    .line 18
    :cond_0
    new-instance v3, Lk/s1;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v3, v2}, Lk/s1;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    check-cast v3, Lfg/a;

    .line 28
    .line 29
    sget-object v2, Lk/w1;->j:Lp4/t;

    .line 30
    .line 31
    invoke-static {v1, v2, v3, p0, v0}, Lv0/k;->e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lk/w1;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final r(Ly0/o;Lk/w1;ZZ)Ly0/o;
    .locals 10

    .line 1
    sget-object v0, Lm/p1;->g:Lm/p1;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move-object v4, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 8
    .line 9
    move-object v4, v1

    .line 10
    :goto_0
    const/4 v7, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz p3, :cond_2

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    move-object v4, v7

    .line 16
    iget-object v7, p1, Lk/w1;->d:Ln/k;

    .line 17
    .line 18
    sget p3, Lk/y;->a:F

    .line 19
    .line 20
    sget-object p3, Ly0/l;->a:Ly0/l;

    .line 21
    .line 22
    if-ne v5, v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lk/o0;->c:Lk/o0;

    .line 25
    .line 26
    invoke-static {p3, v0}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    sget-object v0, Lk/o0;->b:Lk/o0;

    .line 32
    .line 33
    invoke-static {p3, v0}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    :goto_1
    invoke-interface {p0, p3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v2, Lk/x1;

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    const/4 v3, 0x0

    .line 45
    move v8, v6

    .line 46
    move-object v6, p1

    .line 47
    invoke-direct/range {v2 .. v9}, Lk/x1;-><init>(Lk/k1;Lm/p;Lm/p1;Lm/i2;Ln/k;ZZ)V

    .line 48
    .line 49
    .line 50
    move-object v3, v6

    .line 51
    invoke-interface {p0, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v3, p1

    .line 57
    move-object v5, v4

    .line 58
    move-object v4, v7

    .line 59
    iget-object v8, v3, Lk/w1;->d:Ln/k;

    .line 60
    .line 61
    move-object v4, v5

    .line 62
    const/4 v5, 0x0

    .line 63
    move-object v2, p0

    .line 64
    invoke-static/range {v2 .. v8}, Lk/n;->s(Ly0/o;Lm/i2;Lm/p1;Lk/k1;ZLm/p;Ln/k;)Ly0/o;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_2
    new-instance p1, Lk/z1;

    .line 69
    .line 70
    invoke-direct {p1, v3, p2}, Lk/z1;-><init>(Lk/w1;Z)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, p1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public static s(Ly0/o;Lm/i2;Lm/p1;Lk/k1;ZLm/p;Ln/k;)Ly0/o;
    .locals 8

    .line 1
    sget v0, Lk/y;->a:F

    .line 2
    .line 3
    sget-object v0, Lm/p1;->g:Lm/p1;

    .line 4
    .line 5
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lk/o0;->c:Lk/o0;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lk/o0;->b:Lk/o0;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v0, Lk/x1;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v4, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v1, p3

    .line 32
    move v6, p4

    .line 33
    move-object v2, p5

    .line 34
    move-object v5, p6

    .line 35
    invoke-direct/range {v0 .. v7}, Lk/x1;-><init>(Lk/k1;Lm/p;Lm/p1;Lm/i2;Ln/k;ZZ)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final t(JF)J
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
    sub-float/2addr v1, p2

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p0, v3

    .line 22
    long-to-int p0, p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sub-float/2addr p0, p2

    .line 28
    invoke-static {v2, p0}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-long p1, p1

    .line 37
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long v1, p0

    .line 42
    shl-long p0, p1, v0

    .line 43
    .line 44
    and-long v0, v1, v3

    .line 45
    .line 46
    or-long/2addr p0, v0

    .line 47
    return-wide p0
.end method
