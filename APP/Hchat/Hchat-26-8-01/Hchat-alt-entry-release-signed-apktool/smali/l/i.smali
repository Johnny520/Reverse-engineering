.class public abstract Ll/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ll/d;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, Ly2/m;->a:Li0/u;

    .line 2
    .line 3
    new-instance v1, Ll/d;

    .line 4
    .line 5
    sget-wide v2, Lf1/w;->c:J

    .line 6
    .line 7
    sget-wide v4, Lf1/w;->b:J

    .line 8
    .line 9
    const v0, 0x3ec28f5c    # 0.38f

    .line 10
    .line 11
    .line 12
    invoke-static {v4, v5, v0}, Lf1/w;->b(JF)J

    .line 13
    .line 14
    .line 15
    move-result-wide v8

    .line 16
    invoke-static {v4, v5, v0}, Lf1/w;->b(JF)J

    .line 17
    .line 18
    .line 19
    move-result-wide v10

    .line 20
    move-wide v6, v4

    .line 21
    invoke-direct/range {v1 .. v11}, Ll/d;-><init>(JJJJJ)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ll/i;->a:Ll/d;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Ll/d;Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const v5, -0x1f76910f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v5}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v5, v4, 0x6

    .line 18
    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v5, 0x2

    .line 30
    :goto_0
    or-int/2addr v5, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v4

    .line 33
    :goto_1
    and-int/lit8 v6, v4, 0x30

    .line 34
    .line 35
    if-nez v6, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    const/16 v6, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v6, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v5, v6

    .line 49
    :cond_3
    and-int/lit16 v6, v4, 0x180

    .line 50
    .line 51
    if-nez v6, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    const/16 v6, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v6, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v5, v6

    .line 65
    :cond_5
    and-int/lit16 v6, v5, 0x93

    .line 66
    .line 67
    const/16 v7, 0x92

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x1

    .line 71
    if-eq v6, v7, :cond_6

    .line 72
    .line 73
    move v6, v9

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move v6, v8

    .line 76
    :goto_4
    and-int/lit8 v7, v5, 0x1

    .line 77
    .line 78
    invoke-virtual {v0, v7, v6}, Li0/h0;->S(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_b

    .line 83
    .line 84
    sget v6, Ll/f;->d:F

    .line 85
    .line 86
    sget v7, Ll/f;->e:F

    .line 87
    .line 88
    invoke-static {v7}, Lv/e;->a(F)Lv/d;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    int-to-float v7, v8

    .line 93
    invoke-static {v6, v7}, Lu2/f;->a(FF)I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-lez v10, :cond_7

    .line 98
    .line 99
    move v12, v9

    .line 100
    goto :goto_5

    .line 101
    :cond_7
    move v12, v8

    .line 102
    :goto_5
    sget-wide v13, Lf1/e0;->a:J

    .line 103
    .line 104
    invoke-static {v6, v7}, Lu2/f;->a(FF)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-gtz v6, :cond_9

    .line 109
    .line 110
    if-eqz v12, :cond_8

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    move-object v6, v2

    .line 114
    goto :goto_7

    .line 115
    :cond_9
    :goto_6
    new-instance v10, Lc1/p;

    .line 116
    .line 117
    move-wide v15, v13

    .line 118
    invoke-direct/range {v10 .. v16}, Lc1/p;-><init>(Lf1/r0;ZJJ)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, v10}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    :goto_7
    iget-wide v10, v1, Ll/d;->a:J

    .line 126
    .line 127
    sget-object v7, Lf1/c0;->b:Lf1/m0;

    .line 128
    .line 129
    invoke-static {v6, v10, v11, v7}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v7, Lp/n0;->h:Lp/n0;

    .line 134
    .line 135
    invoke-static {v6, v7}, Lp/d;->s(Ly0/o;Lp/n0;)Ly0/o;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    const/4 v7, 0x0

    .line 140
    sget v10, Ll/f;->i:F

    .line 141
    .line 142
    invoke-static {v6, v7, v10, v9}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-static {v0}, Lk/n;->q(Li0/h0;)Lk/w1;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-static {v6, v7, v9, v9}, Lk/n;->r(Ly0/o;Lk/w1;ZZ)Ly0/o;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    shl-int/lit8 v5, v5, 0x3

    .line 155
    .line 156
    and-int/lit16 v5, v5, 0x1c00

    .line 157
    .line 158
    sget-object v7, Lp/j;->c:Lp/e;

    .line 159
    .line 160
    sget-object v10, Ly0/b;->s:Ly0/e;

    .line 161
    .line 162
    invoke-static {v7, v10, v0, v8}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    iget-wide v10, v0, Li0/h0;->T:J

    .line 167
    .line 168
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-static {v0, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 181
    .line 182
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 186
    .line 187
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 188
    .line 189
    .line 190
    iget-boolean v12, v0, Li0/h0;->S:Z

    .line 191
    .line 192
    if-eqz v12, :cond_a

    .line 193
    .line 194
    invoke-virtual {v0, v11}, Li0/h0;->k(Lfg/a;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_a
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 199
    .line 200
    .line 201
    :goto_8
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 202
    .line 203
    invoke-static {v11, v0, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 207
    .line 208
    invoke-static {v7, v0, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 216
    .line 217
    invoke-static {v8, v0, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 221
    .line 222
    invoke-static {v7, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 223
    .line 224
    .line 225
    sget-object v7, Lx1/f;->c:Lx1/e;

    .line 226
    .line 227
    invoke-static {v7, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    shr-int/lit8 v5, v5, 0x6

    .line 231
    .line 232
    and-int/lit8 v5, v5, 0x70

    .line 233
    .line 234
    or-int/lit8 v5, v5, 0x6

    .line 235
    .line 236
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    sget-object v6, Lp/u;->a:Lp/u;

    .line 241
    .line 242
    invoke-virtual {v3, v6, v0, v5}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v9}, Li0/h0;->p(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_b
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 250
    .line 251
    .line 252
    :goto_9
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    if-eqz v6, :cond_c

    .line 257
    .line 258
    new-instance v0, Lb0/r;

    .line 259
    .line 260
    const/4 v5, 0x5

    .line 261
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 262
    .line 263
    .line 264
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 265
    .line 266
    :cond_c
    return-void
.end method

.method public static final b(Ly0/o;Ll/d;Lfg/l;Li0/h0;II)V
    .locals 8

    .line 1
    const v0, -0x2548d191

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    or-int/lit8 v1, p4, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x2

    .line 23
    :goto_0
    or-int/2addr v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p5, 0x2

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x30

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    const/16 v3, 0x20

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    const/16 v3, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v1, v3

    .line 43
    :goto_3
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    const/16 v3, 0x100

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    const/16 v3, 0x80

    .line 53
    .line 54
    :goto_4
    or-int/2addr v1, v3

    .line 55
    and-int/lit16 v3, v1, 0x93

    .line 56
    .line 57
    const/16 v4, 0x92

    .line 58
    .line 59
    if-eq v3, v4, :cond_5

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    const/4 v3, 0x0

    .line 64
    :goto_5
    and-int/lit8 v4, v1, 0x1

    .line 65
    .line 66
    invoke-virtual {p3, v4, v3}, Li0/h0;->S(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_8

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    sget-object p0, Ly0/l;->a:Ly0/l;

    .line 75
    .line 76
    :cond_6
    if-eqz v2, :cond_7

    .line 77
    .line 78
    sget-object p1, Ll/i;->a:Ll/d;

    .line 79
    .line 80
    :cond_7
    new-instance v0, Ldb/f;

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    invoke-direct {v0, p2, v2, p1}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const v2, -0xeebf658

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v0, p3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    shr-int/lit8 v2, v1, 0x3

    .line 94
    .line 95
    and-int/lit8 v2, v2, 0xe

    .line 96
    .line 97
    or-int/lit16 v2, v2, 0x180

    .line 98
    .line 99
    shl-int/lit8 v1, v1, 0x3

    .line 100
    .line 101
    and-int/lit8 v1, v1, 0x70

    .line 102
    .line 103
    or-int/2addr v1, v2

    .line 104
    invoke-static {p1, p0, v0, p3, v1}, Ll/i;->a(Ll/d;Ly0/o;Ls0/d;Li0/h0;I)V

    .line 105
    .line 106
    .line 107
    :goto_6
    move-object v3, p0

    .line 108
    move-object v4, p1

    .line 109
    goto :goto_7

    .line 110
    :cond_8
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :goto_7
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_9

    .line 119
    .line 120
    new-instance v2, Lb0/r;

    .line 121
    .line 122
    move-object v5, p2

    .line 123
    move v6, p4

    .line 124
    move v7, p5

    .line 125
    invoke-direct/range {v2 .. v7}, Lb0/r;-><init>(Ly0/o;Ll/d;Lfg/l;II)V

    .line 126
    .line 127
    .line 128
    iput-object v2, p0, Li0/r1;->d:Lfg/p;

    .line 129
    .line 130
    :cond_9
    return-void
.end method

.method public static final c(Ljava/lang/String;ZLl/d;Ly0/o;Lfg/q;Lfg/a;Li0/h0;I)V
    .locals 32

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v7, p4

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    move-object/from16 v9, p6

    .line 10
    .line 11
    move/from16 v10, p7

    .line 12
    .line 13
    const v0, -0x774762b3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v10, 0x6

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v9, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    :goto_0
    or-int/2addr v0, v10

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v10

    .line 37
    :goto_1
    and-int/lit8 v3, v10, 0x30

    .line 38
    .line 39
    const/16 v4, 0x20

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    invoke-virtual {v9, v1}, Li0/h0;->g(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    move v3, v4

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v3, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v3

    .line 54
    :cond_3
    and-int/lit16 v3, v10, 0x180

    .line 55
    .line 56
    if-nez v3, :cond_5

    .line 57
    .line 58
    invoke-virtual {v9, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    const/16 v3, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v3, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v3

    .line 70
    :cond_5
    and-int/lit16 v3, v10, 0xc00

    .line 71
    .line 72
    if-nez v3, :cond_7

    .line 73
    .line 74
    move-object/from16 v3, p3

    .line 75
    .line 76
    invoke-virtual {v9, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    const/16 v5, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v5, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v0, v5

    .line 88
    goto :goto_5

    .line 89
    :cond_7
    move-object/from16 v3, p3

    .line 90
    .line 91
    :goto_5
    and-int/lit16 v5, v10, 0x6000

    .line 92
    .line 93
    if-nez v5, :cond_9

    .line 94
    .line 95
    invoke-virtual {v9, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_8

    .line 100
    .line 101
    const/16 v5, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v5, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v0, v5

    .line 107
    :cond_9
    const/high16 v5, 0x30000

    .line 108
    .line 109
    and-int/2addr v5, v10

    .line 110
    const/high16 v12, 0x20000

    .line 111
    .line 112
    if-nez v5, :cond_b

    .line 113
    .line 114
    invoke-virtual {v9, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_a

    .line 119
    .line 120
    move v5, v12

    .line 121
    goto :goto_7

    .line 122
    :cond_a
    const/high16 v5, 0x10000

    .line 123
    .line 124
    :goto_7
    or-int/2addr v0, v5

    .line 125
    :cond_b
    move v13, v0

    .line 126
    const v0, 0x12493

    .line 127
    .line 128
    .line 129
    and-int/2addr v0, v13

    .line 130
    const v5, 0x12492

    .line 131
    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    if-eq v0, v5, :cond_c

    .line 135
    .line 136
    const/4 v0, 0x1

    .line 137
    goto :goto_8

    .line 138
    :cond_c
    move v0, v14

    .line 139
    :goto_8
    and-int/lit8 v5, v13, 0x1

    .line 140
    .line 141
    invoke-virtual {v9, v5, v0}, Li0/h0;->S(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_17

    .line 146
    .line 147
    sget-object v0, Ll/f;->f:Ly0/f;

    .line 148
    .line 149
    sget-object v5, Lp/j;->a:Lp/c;

    .line 150
    .line 151
    sget v5, Ll/f;->h:F

    .line 152
    .line 153
    invoke-static {v5}, Lp/j;->g(F)Lp/h;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    and-int/lit8 v11, v13, 0x70

    .line 158
    .line 159
    if-ne v11, v4, :cond_d

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    goto :goto_9

    .line 163
    :cond_d
    move v4, v14

    .line 164
    :goto_9
    const/high16 v11, 0x70000

    .line 165
    .line 166
    and-int/2addr v11, v13

    .line 167
    if-ne v11, v12, :cond_e

    .line 168
    .line 169
    const/4 v11, 0x1

    .line 170
    goto :goto_a

    .line 171
    :cond_e
    move v11, v14

    .line 172
    :goto_a
    or-int/2addr v4, v11

    .line 173
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    if-nez v4, :cond_f

    .line 178
    .line 179
    sget-object v4, Li0/l;->a:Li0/e;

    .line 180
    .line 181
    if-ne v11, v4, :cond_10

    .line 182
    .line 183
    :cond_f
    new-instance v11, Ll/g;

    .line 184
    .line 185
    invoke-direct {v11, v1, v8, v14}, Ll/g;-><init>(ZLfg/a;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_10
    move-object v4, v11

    .line 192
    check-cast v4, Lfg/a;

    .line 193
    .line 194
    move v11, v5

    .line 195
    const/16 v5, 0xc

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    move v12, v11

    .line 199
    move-object v11, v0

    .line 200
    move-object/from16 v0, p3

    .line 201
    .line 202
    invoke-static/range {v0 .. v5}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const/high16 v0, 0x3f800000    # 1.0f

    .line 207
    .line 208
    invoke-static {v3, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    sget v2, Ll/f;->a:F

    .line 213
    .line 214
    sget v3, Ll/f;->b:F

    .line 215
    .line 216
    sget v4, Ll/f;->c:F

    .line 217
    .line 218
    invoke-static {v1, v2, v4, v3, v4}, Lp/h1;->l(Ly0/o;FFFF)Ly0/o;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const/4 v2, 0x0

    .line 223
    const/4 v3, 0x2

    .line 224
    invoke-static {v1, v12, v2, v3}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    const/16 v2, 0x36

    .line 229
    .line 230
    invoke-static {v15, v11, v9, v2}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    iget-wide v3, v9, Li0/h0;->T:J

    .line 235
    .line 236
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-static {v9, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 254
    .line 255
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 256
    .line 257
    .line 258
    iget-boolean v11, v9, Li0/h0;->S:Z

    .line 259
    .line 260
    if-eqz v11, :cond_11

    .line 261
    .line 262
    invoke-virtual {v9, v5}, Li0/h0;->k(Lfg/a;)V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_11
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 267
    .line 268
    .line 269
    :goto_b
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 270
    .line 271
    invoke-static {v11, v9, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 275
    .line 276
    invoke-static {v2, v9, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 284
    .line 285
    invoke-static {v4, v9, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 289
    .line 290
    invoke-static {v3, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 291
    .line 292
    .line 293
    sget-object v12, Lx1/f;->c:Lx1/e;

    .line 294
    .line 295
    invoke-static {v12, v9, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    if-nez v7, :cond_12

    .line 299
    .line 300
    const v1, -0x5f3ebcd6

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9, v1}, Li0/h0;->a0(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v9, v14}, Li0/h0;->p(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_f

    .line 310
    :cond_12
    const v1, -0x5f3ebcd5

    .line 311
    .line 312
    .line 313
    invoke-virtual {v9, v1}, Li0/h0;->a0(I)V

    .line 314
    .line 315
    .line 316
    sget v18, Ll/f;->j:F

    .line 317
    .line 318
    const/16 v19, 0x0

    .line 319
    .line 320
    const/16 v22, 0x2

    .line 321
    .line 322
    sget-object v17, Ly0/l;->a:Ly0/l;

    .line 323
    .line 324
    move/from16 v20, v18

    .line 325
    .line 326
    move/from16 v21, v18

    .line 327
    .line 328
    invoke-static/range {v17 .. v22}, Lp/h1;->i(Ly0/o;FFFFI)Ly0/o;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    sget-object v15, Ly0/b;->g:Ly0/g;

    .line 333
    .line 334
    invoke-static {v15, v14}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 335
    .line 336
    .line 337
    move-result-object v15

    .line 338
    move/from16 v17, v14

    .line 339
    .line 340
    move-object/from16 v18, v15

    .line 341
    .line 342
    iget-wide v14, v9, Li0/h0;->T:J

    .line 343
    .line 344
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 349
    .line 350
    .line 351
    move-result-object v15

    .line 352
    invoke-static {v9, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 357
    .line 358
    .line 359
    iget-boolean v0, v9, Li0/h0;->S:Z

    .line 360
    .line 361
    if-eqz v0, :cond_13

    .line 362
    .line 363
    invoke-virtual {v9, v5}, Li0/h0;->k(Lfg/a;)V

    .line 364
    .line 365
    .line 366
    :goto_c
    move-object/from16 v0, v18

    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_13
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 370
    .line 371
    .line 372
    goto :goto_c

    .line 373
    :goto_d
    invoke-static {v11, v9, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v2, v9, v15}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v14, v9, v4, v9, v3}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v12, v9, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    if-eqz p1, :cond_14

    .line 386
    .line 387
    iget-wide v0, v6, Ll/d;->c:J

    .line 388
    .line 389
    goto :goto_e

    .line 390
    :cond_14
    iget-wide v0, v6, Ll/d;->e:J

    .line 391
    .line 392
    :goto_e
    new-instance v2, Lf1/w;

    .line 393
    .line 394
    invoke-direct {v2, v0, v1}, Lf1/w;-><init>(J)V

    .line 395
    .line 396
    .line 397
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-interface {v7, v2, v9, v0}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    const/4 v0, 0x1

    .line 405
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 406
    .line 407
    .line 408
    move/from16 v0, v17

    .line 409
    .line 410
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 411
    .line 412
    .line 413
    :goto_f
    if-eqz p1, :cond_15

    .line 414
    .line 415
    iget-wide v0, v6, Ll/d;->b:J

    .line 416
    .line 417
    :goto_10
    move-wide/from16 v21, v0

    .line 418
    .line 419
    goto :goto_11

    .line 420
    :cond_15
    iget-wide v0, v6, Ll/d;->d:J

    .line 421
    .line 422
    goto :goto_10

    .line 423
    :goto_11
    sget v28, Ll/f;->g:I

    .line 424
    .line 425
    sget-wide v23, Ll/f;->m:J

    .line 426
    .line 427
    sget-object v25, Ll/f;->n:Lm2/k;

    .line 428
    .line 429
    sget-wide v29, Ll/f;->o:J

    .line 430
    .line 431
    sget-wide v26, Ll/f;->p:J

    .line 432
    .line 433
    new-instance v11, Li2/n0;

    .line 434
    .line 435
    const v31, 0xfd7f78

    .line 436
    .line 437
    .line 438
    move-object/from16 v20, v11

    .line 439
    .line 440
    invoke-direct/range {v20 .. v31}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x3f800000    # 1.0f

    .line 444
    .line 445
    float-to-double v1, v0

    .line 446
    const-wide/16 v3, 0x0

    .line 447
    .line 448
    cmpl-double v1, v1, v3

    .line 449
    .line 450
    if-lez v1, :cond_16

    .line 451
    .line 452
    goto :goto_12

    .line 453
    :cond_16
    const-string v1, "invalid weight; must be greater than zero"

    .line 454
    .line 455
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    :goto_12
    new-instance v10, Lp/q0;

    .line 459
    .line 460
    const/4 v1, 0x1

    .line 461
    invoke-direct {v10, v0, v1}, Lp/q0;-><init>(FZ)V

    .line 462
    .line 463
    .line 464
    and-int/lit8 v0, v13, 0xe

    .line 465
    .line 466
    const/high16 v2, 0x180000

    .line 467
    .line 468
    or-int v18, v0, v2

    .line 469
    .line 470
    const/16 v19, 0x3b8

    .line 471
    .line 472
    const/4 v12, 0x0

    .line 473
    const/4 v13, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x1

    .line 476
    const/16 v16, 0x0

    .line 477
    .line 478
    move v0, v1

    .line 479
    move-object/from16 v17, v9

    .line 480
    .line 481
    move-object/from16 v9, p0

    .line 482
    .line 483
    invoke-static/range {v9 .. v19}, Lw/s;->b(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIILi0/h0;II)V

    .line 484
    .line 485
    .line 486
    move-object/from16 v9, v17

    .line 487
    .line 488
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 489
    .line 490
    .line 491
    goto :goto_13

    .line 492
    :cond_17
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 493
    .line 494
    .line 495
    :goto_13
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    if-eqz v9, :cond_18

    .line 500
    .line 501
    new-instance v0, Ll/h;

    .line 502
    .line 503
    move-object/from16 v1, p0

    .line 504
    .line 505
    move/from16 v2, p1

    .line 506
    .line 507
    move-object/from16 v4, p3

    .line 508
    .line 509
    move-object v3, v6

    .line 510
    move-object v5, v7

    .line 511
    move-object v6, v8

    .line 512
    move/from16 v7, p7

    .line 513
    .line 514
    invoke-direct/range {v0 .. v7}, Ll/h;-><init>(Ljava/lang/String;ZLl/d;Ly0/o;Lfg/q;Lfg/a;I)V

    .line 515
    .line 516
    .line 517
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 518
    .line 519
    :cond_18
    return-void
.end method
