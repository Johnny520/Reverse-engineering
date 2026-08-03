.class public abstract Lw/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ls0/d;

.field public static final b:Ls0/d;

.field public static final c:Lm/a;

.field public static final d:Lw/n0;

.field public static final e:Ls1/a;

.field public static final f:Lb5/k;

.field public static final g:I = 0x9

.field public static final h:I = 0xa

.field public static final i:I = 0xc


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ll/b;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ll/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ls0/d;

    .line 8
    .line 9
    const v2, 0x2d481636

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lw/s;->a:Ls0/d;

    .line 17
    .line 18
    new-instance v0, Ll/b;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-direct {v0, v1}, Ll/b;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Ls0/d;

    .line 25
    .line 26
    const v2, 0x1d0170c9

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lw/s;->b:Ls0/d;

    .line 33
    .line 34
    new-instance v0, Lw/n0;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, v1}, Lw/n0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lm/a;

    .line 41
    .line 42
    const/16 v2, 0x17

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lw/s;->c:Lm/a;

    .line 48
    .line 49
    new-instance v0, Lw/n0;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, v1}, Lw/n0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lw/s;->d:Lw/n0;

    .line 56
    .line 57
    new-instance v0, Ls1/a;

    .line 58
    .line 59
    const/16 v1, 0x3fe

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ls1/a;-><init>(I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lw/s;->e:Ls1/a;

    .line 65
    .line 66
    new-instance v0, Lb5/k;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    const/4 v2, 0x5

    .line 70
    invoke-direct {v0, v1, v1, v2}, Lb5/k;-><init>(III)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lw/s;->f:Lb5/k;

    .line 74
    .line 75
    return-void
.end method

.method public static final A(II)V
    .locals 2

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "both minLines "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " and maxLines "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " must be greater than zero"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lo/b;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    if-gt p0, p1, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "minLines "

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, " must be less than or equal to maxLines "

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lo/b;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static final B(III)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p0, :cond_0

    .line 3
    .line 4
    if-gt p0, p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, " -> "

    .line 10
    .line 11
    const-string v1, " is not in range of transformed text [0, "

    .line 12
    .line 13
    const-string v2, "OffsetMapping.originalToTransformed returned invalid mapping: "

    .line 14
    .line 15
    invoke-static {p2, p0, v2, v0, v1}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x5d

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lo/b;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public static final C(III)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p0, :cond_0

    .line 3
    .line 4
    if-gt p0, p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, " -> "

    .line 10
    .line 11
    const-string v1, " is not in range of original text [0, "

    .line 12
    .line 13
    const-string v2, "OffsetMapping.transformedToOriginal returned invalid mapping: "

    .line 14
    .line 15
    invoke-static {p2, p0, v2, v0, v1}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x5d

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lo/b;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public static final a(Li2/g;Ly0/o;Li2/n0;Lfg/l;ILjava/util/Map;Li0/h0;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v12, p6

    .line 6
    .line 7
    move/from16 v13, p7

    .line 8
    .line 9
    const v0, -0x5013ac4b

    .line 10
    .line 11
    .line 12
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v13, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v12, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v13

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v13

    .line 31
    :goto_1
    and-int/lit8 v4, v13, 0x30

    .line 32
    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    move-object/from16 v4, p1

    .line 36
    .line 37
    invoke-virtual {v12, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v0, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move-object/from16 v4, p1

    .line 51
    .line 52
    :goto_3
    and-int/lit16 v5, v13, 0x180

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x100

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_4
    const/16 v5, 0x80

    .line 66
    .line 67
    :goto_4
    or-int/2addr v0, v5

    .line 68
    :cond_5
    and-int/lit16 v5, v13, 0xc00

    .line 69
    .line 70
    if-nez v5, :cond_7

    .line 71
    .line 72
    move-object/from16 v5, p3

    .line 73
    .line 74
    invoke-virtual {v12, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    const/16 v6, 0x800

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    const/16 v6, 0x400

    .line 84
    .line 85
    :goto_5
    or-int/2addr v0, v6

    .line 86
    goto :goto_6

    .line 87
    :cond_7
    move-object/from16 v5, p3

    .line 88
    .line 89
    :goto_6
    and-int/lit16 v6, v13, 0x6000

    .line 90
    .line 91
    const/4 v14, 0x1

    .line 92
    if-nez v6, :cond_9

    .line 93
    .line 94
    invoke-virtual {v12, v14}, Li0/h0;->d(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_8

    .line 99
    .line 100
    const/16 v6, 0x4000

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_8
    const/16 v6, 0x2000

    .line 104
    .line 105
    :goto_7
    or-int/2addr v0, v6

    .line 106
    :cond_9
    const/high16 v6, 0x30000

    .line 107
    .line 108
    and-int/2addr v6, v13

    .line 109
    if-nez v6, :cond_b

    .line 110
    .line 111
    invoke-virtual {v12, v14}, Li0/h0;->g(Z)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_a

    .line 116
    .line 117
    const/high16 v6, 0x20000

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_a
    const/high16 v6, 0x10000

    .line 121
    .line 122
    :goto_8
    or-int/2addr v0, v6

    .line 123
    :cond_b
    const/high16 v6, 0x180000

    .line 124
    .line 125
    and-int/2addr v6, v13

    .line 126
    if-nez v6, :cond_d

    .line 127
    .line 128
    const v6, 0x7fffffff

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v6}, Li0/h0;->d(I)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_c

    .line 136
    .line 137
    const/high16 v6, 0x100000

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    const/high16 v6, 0x80000

    .line 141
    .line 142
    :goto_9
    or-int/2addr v0, v6

    .line 143
    :cond_d
    const/high16 v6, 0x36c00000

    .line 144
    .line 145
    or-int/2addr v0, v6

    .line 146
    const v6, 0x12492493

    .line 147
    .line 148
    .line 149
    and-int/2addr v6, v0

    .line 150
    const v7, 0x12492492

    .line 151
    .line 152
    .line 153
    const/4 v15, 0x0

    .line 154
    if-ne v6, v7, :cond_e

    .line 155
    .line 156
    move v6, v15

    .line 157
    goto :goto_a

    .line 158
    :cond_e
    move v6, v14

    .line 159
    :goto_a
    and-int/lit8 v7, v0, 0x1

    .line 160
    .line 161
    invoke-virtual {v12, v7, v6}, Li0/h0;->S(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_19

    .line 166
    .line 167
    const/4 v7, 0x1

    .line 168
    const v6, 0x7fffffff

    .line 169
    .line 170
    .line 171
    invoke-static {v7, v6}, Lw/s;->A(II)V

    .line 172
    .line 173
    .line 174
    sget-object v8, Lh0/n0;->a:Li0/u;

    .line 175
    .line 176
    invoke-virtual {v12, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-nez v8, :cond_18

    .line 181
    .line 182
    const v8, 0x5eb28b71

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v8}, Li0/h0;->a0(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v15}, Li0/h0;->p(Z)V

    .line 189
    .line 190
    .line 191
    sget-object v8, Lw/d;->a:Lsf/e;

    .line 192
    .line 193
    iget-object v8, v1, Li2/g;->h:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    iget-object v9, v1, Li2/g;->g:Ljava/util/List;

    .line 200
    .line 201
    if-eqz v9, :cond_10

    .line 202
    .line 203
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    move v11, v15

    .line 208
    :goto_b
    if-ge v11, v10, :cond_10

    .line 209
    .line 210
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v16

    .line 214
    move-object/from16 v6, v16

    .line 215
    .line 216
    check-cast v6, Li2/e;

    .line 217
    .line 218
    iget-object v7, v6, Li2/e;->a:Ljava/lang/Object;

    .line 219
    .line 220
    instance-of v7, v7, Li2/h0;

    .line 221
    .line 222
    if-eqz v7, :cond_f

    .line 223
    .line 224
    iget-object v7, v6, Li2/e;->d:Ljava/lang/String;

    .line 225
    .line 226
    const-string v3, "androidx.compose.foundation.text.inlineContent"

    .line 227
    .line 228
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_f

    .line 233
    .line 234
    iget v3, v6, Li2/e;->b:I

    .line 235
    .line 236
    iget v6, v6, Li2/e;->c:I

    .line 237
    .line 238
    invoke-static {v15, v8, v3, v6}, Li2/h;->b(IIII)Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-eqz v3, :cond_f

    .line 243
    .line 244
    move v3, v14

    .line 245
    goto :goto_c

    .line 246
    :cond_f
    add-int/lit8 v11, v11, 0x1

    .line 247
    .line 248
    const v6, 0x7fffffff

    .line 249
    .line 250
    .line 251
    const/4 v7, 0x1

    .line 252
    goto :goto_b

    .line 253
    :cond_10
    move v3, v15

    .line 254
    :goto_c
    invoke-static {v1}, Lf8/i;->N(Li2/g;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    sget-object v7, Ly1/h1;->k:Li0/m2;

    .line 259
    .line 260
    invoke-virtual {v12, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    move-object v8, v7

    .line 265
    check-cast v8, Lm2/d;

    .line 266
    .line 267
    if-nez v3, :cond_12

    .line 268
    .line 269
    if-nez v6, :cond_12

    .line 270
    .line 271
    const v0, 0x5eb64fb6

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 275
    .line 276
    .line 277
    const/4 v0, 0x0

    .line 278
    invoke-static {v1, v2, v8, v0, v12}, Lw/n;->a(Li2/g;Li2/n0;Lm2/d;Ljava/util/List;Li0/h0;)V

    .line 279
    .line 280
    .line 281
    const/4 v10, 0x0

    .line 282
    const/4 v11, 0x0

    .line 283
    const/4 v4, 0x1

    .line 284
    const/4 v5, 0x1

    .line 285
    const/4 v9, 0x0

    .line 286
    move-object/from16 v0, p1

    .line 287
    .line 288
    move-object/from16 v3, p3

    .line 289
    .line 290
    const v6, 0x7fffffff

    .line 291
    .line 292
    .line 293
    const/4 v7, 0x1

    .line 294
    invoke-static/range {v0 .. v11}, Lw/s;->z(Ly0/o;Li2/g;Li2/n0;Lfg/l;IZIILm2/d;Ljava/util/List;Lfg/l;Lfg/l;)Ly0/o;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    move v10, v7

    .line 299
    sget-object v0, Lw/c;->c:Lw/c;

    .line 300
    .line 301
    iget-wide v1, v12, Li0/h0;->T:J

    .line 302
    .line 303
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v12, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    sget-object v4, Lx1/g;->f:Lx1/f;

    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    sget-object v4, Lx1/f;->b:Lx1/y;

    .line 321
    .line 322
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 323
    .line 324
    .line 325
    iget-boolean v5, v12, Li0/h0;->S:Z

    .line 326
    .line 327
    if-eqz v5, :cond_11

    .line 328
    .line 329
    invoke-virtual {v12, v4}, Li0/h0;->k(Lfg/a;)V

    .line 330
    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_11
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 334
    .line 335
    .line 336
    :goto_d
    sget-object v4, Lx1/f;->e:Lx1/e;

    .line 337
    .line 338
    invoke-static {v4, v12, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 342
    .line 343
    invoke-static {v0, v12, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 347
    .line 348
    invoke-static {v0, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 349
    .line 350
    .line 351
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 352
    .line 353
    invoke-static {v0, v12, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 361
    .line 362
    invoke-static {v1, v12, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v14}, Li0/h0;->p(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v15}, Li0/h0;->p(Z)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_f

    .line 372
    .line 373
    :cond_12
    const/4 v10, 0x1

    .line 374
    const v1, 0x5ec5cfb6

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v1}, Li0/h0;->a0(I)V

    .line 378
    .line 379
    .line 380
    and-int/lit8 v1, v0, 0xe

    .line 381
    .line 382
    const/4 v2, 0x4

    .line 383
    if-ne v1, v2, :cond_13

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_13
    move v14, v15

    .line 387
    :goto_e
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    sget-object v2, Li0/l;->a:Li0/e;

    .line 392
    .line 393
    if-nez v14, :cond_14

    .line 394
    .line 395
    if-ne v1, v2, :cond_15

    .line 396
    .line 397
    :cond_14
    invoke-static/range {p0 .. p0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {v12, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :cond_15
    check-cast v1, Li0/a1;

    .line 405
    .line 406
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, Li2/g;

    .line 411
    .line 412
    invoke-virtual {v12, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    if-nez v5, :cond_16

    .line 421
    .line 422
    if-ne v6, v2, :cond_17

    .line 423
    .line 424
    :cond_16
    new-instance v6, Lb0/l;

    .line 425
    .line 426
    const/16 v2, 0xc

    .line 427
    .line 428
    invoke-direct {v6, v1, v2}, Lb0/l;-><init>(Li0/a1;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_17
    check-cast v6, Lfg/l;

    .line 435
    .line 436
    shr-int/lit8 v1, v0, 0x3

    .line 437
    .line 438
    and-int/lit16 v1, v1, 0x38e

    .line 439
    .line 440
    shr-int/lit8 v2, v0, 0xc

    .line 441
    .line 442
    const v5, 0xe000

    .line 443
    .line 444
    .line 445
    and-int/2addr v2, v5

    .line 446
    or-int/2addr v1, v2

    .line 447
    shl-int/lit8 v2, v0, 0x9

    .line 448
    .line 449
    const/high16 v5, 0x70000

    .line 450
    .line 451
    and-int/2addr v2, v5

    .line 452
    or-int/2addr v1, v2

    .line 453
    shl-int/lit8 v2, v0, 0x6

    .line 454
    .line 455
    const/high16 v5, 0x380000

    .line 456
    .line 457
    and-int/2addr v5, v2

    .line 458
    or-int/2addr v1, v5

    .line 459
    const/high16 v5, 0x1c00000

    .line 460
    .line 461
    and-int/2addr v5, v2

    .line 462
    or-int/2addr v1, v5

    .line 463
    const/high16 v5, 0xe000000

    .line 464
    .line 465
    and-int/2addr v5, v2

    .line 466
    or-int/2addr v1, v5

    .line 467
    const/high16 v5, 0x70000000

    .line 468
    .line 469
    and-int/2addr v2, v5

    .line 470
    or-int/2addr v1, v2

    .line 471
    shr-int/lit8 v0, v0, 0x15

    .line 472
    .line 473
    and-int/lit16 v0, v0, 0x380

    .line 474
    .line 475
    or-int/lit16 v9, v0, 0x6000

    .line 476
    .line 477
    move-object/from16 v0, p1

    .line 478
    .line 479
    move-object/from16 v2, p3

    .line 480
    .line 481
    move-object v5, v8

    .line 482
    move-object v7, v12

    .line 483
    move v8, v1

    .line 484
    move-object v1, v4

    .line 485
    move-object/from16 v4, p2

    .line 486
    .line 487
    invoke-static/range {v0 .. v9}, Lw/s;->h(Ly0/o;Li2/g;Lfg/l;ZLi2/n0;Lm2/d;Lfg/l;Li0/h0;II)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v15}, Li0/h0;->p(Z)V

    .line 491
    .line 492
    .line 493
    :goto_f
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 494
    .line 495
    move-object v6, v0

    .line 496
    move v5, v10

    .line 497
    goto :goto_10

    .line 498
    :cond_18
    invoke-static {}, Lah/a;->d()V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :cond_19
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 503
    .line 504
    .line 505
    move/from16 v5, p4

    .line 506
    .line 507
    move-object/from16 v6, p5

    .line 508
    .line 509
    :goto_10
    invoke-virtual {v12}, Li0/h0;->t()Li0/r1;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    if-eqz v8, :cond_1a

    .line 514
    .line 515
    new-instance v0, Lc9/j0;

    .line 516
    .line 517
    move-object/from16 v1, p0

    .line 518
    .line 519
    move-object/from16 v2, p1

    .line 520
    .line 521
    move-object/from16 v3, p2

    .line 522
    .line 523
    move-object/from16 v4, p3

    .line 524
    .line 525
    move v7, v13

    .line 526
    invoke-direct/range {v0 .. v7}, Lc9/j0;-><init>(Li2/g;Ly0/o;Li2/n0;Lfg/l;ILjava/util/Map;I)V

    .line 527
    .line 528
    .line 529
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 530
    .line 531
    :cond_1a
    return-void
.end method

.method public static final b(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIILi0/h0;II)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v7, p6

    .line 6
    .line 7
    move-object/from16 v12, p8

    .line 8
    .line 9
    move/from16 v13, p9

    .line 10
    .line 11
    move/from16 v14, p10

    .line 12
    .line 13
    const v0, -0x3e089999

    .line 14
    .line 15
    .line 16
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v13, 0x6

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v12, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x2

    .line 32
    :goto_0
    or-int/2addr v0, v13

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v0, v13

    .line 35
    :goto_1
    and-int/lit8 v2, v13, 0x30

    .line 36
    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    invoke-virtual {v12, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v2, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v2

    .line 51
    :cond_3
    and-int/lit16 v2, v13, 0x180

    .line 52
    .line 53
    if-nez v2, :cond_5

    .line 54
    .line 55
    move-object/from16 v2, p2

    .line 56
    .line 57
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const/16 v3, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v3, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v0, v3

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    move-object/from16 v2, p2

    .line 71
    .line 72
    :goto_4
    and-int/lit8 v3, v14, 0x8

    .line 73
    .line 74
    if-eqz v3, :cond_7

    .line 75
    .line 76
    or-int/lit16 v0, v0, 0xc00

    .line 77
    .line 78
    :cond_6
    move-object/from16 v4, p3

    .line 79
    .line 80
    goto :goto_6

    .line 81
    :cond_7
    and-int/lit16 v4, v13, 0xc00

    .line 82
    .line 83
    if-nez v4, :cond_6

    .line 84
    .line 85
    move-object/from16 v4, p3

    .line 86
    .line 87
    invoke-virtual {v12, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_8

    .line 92
    .line 93
    const/16 v5, 0x800

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_8
    const/16 v5, 0x400

    .line 97
    .line 98
    :goto_5
    or-int/2addr v0, v5

    .line 99
    :goto_6
    and-int/lit8 v5, v14, 0x10

    .line 100
    .line 101
    if-eqz v5, :cond_a

    .line 102
    .line 103
    or-int/lit16 v0, v0, 0x6000

    .line 104
    .line 105
    :cond_9
    move/from16 v6, p4

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_a
    and-int/lit16 v6, v13, 0x6000

    .line 109
    .line 110
    if-nez v6, :cond_9

    .line 111
    .line 112
    move/from16 v6, p4

    .line 113
    .line 114
    invoke-virtual {v12, v6}, Li0/h0;->d(I)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-eqz v9, :cond_b

    .line 119
    .line 120
    const/16 v9, 0x4000

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_b
    const/16 v9, 0x2000

    .line 124
    .line 125
    :goto_7
    or-int/2addr v0, v9

    .line 126
    :goto_8
    and-int/lit8 v9, v14, 0x20

    .line 127
    .line 128
    const/high16 v10, 0x30000

    .line 129
    .line 130
    if-eqz v9, :cond_d

    .line 131
    .line 132
    or-int/2addr v0, v10

    .line 133
    :cond_c
    move/from16 v10, p5

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_d
    and-int/2addr v10, v13

    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    move/from16 v10, p5

    .line 140
    .line 141
    invoke-virtual {v12, v10}, Li0/h0;->g(Z)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_e

    .line 146
    .line 147
    const/high16 v11, 0x20000

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_e
    const/high16 v11, 0x10000

    .line 151
    .line 152
    :goto_9
    or-int/2addr v0, v11

    .line 153
    :goto_a
    const/high16 v11, 0x180000

    .line 154
    .line 155
    and-int/2addr v11, v13

    .line 156
    if-nez v11, :cond_10

    .line 157
    .line 158
    invoke-virtual {v12, v7}, Li0/h0;->d(I)Z

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    if-eqz v11, :cond_f

    .line 163
    .line 164
    const/high16 v11, 0x100000

    .line 165
    .line 166
    goto :goto_b

    .line 167
    :cond_f
    const/high16 v11, 0x80000

    .line 168
    .line 169
    :goto_b
    or-int/2addr v0, v11

    .line 170
    :cond_10
    and-int/lit16 v11, v14, 0x80

    .line 171
    .line 172
    const/high16 v15, 0xc00000

    .line 173
    .line 174
    if-eqz v11, :cond_12

    .line 175
    .line 176
    or-int/2addr v0, v15

    .line 177
    :cond_11
    move/from16 v15, p7

    .line 178
    .line 179
    goto :goto_d

    .line 180
    :cond_12
    and-int/2addr v15, v13

    .line 181
    if-nez v15, :cond_11

    .line 182
    .line 183
    move/from16 v15, p7

    .line 184
    .line 185
    invoke-virtual {v12, v15}, Li0/h0;->d(I)Z

    .line 186
    .line 187
    .line 188
    move-result v16

    .line 189
    if-eqz v16, :cond_13

    .line 190
    .line 191
    const/high16 v16, 0x800000

    .line 192
    .line 193
    goto :goto_c

    .line 194
    :cond_13
    const/high16 v16, 0x400000

    .line 195
    .line 196
    :goto_c
    or-int v0, v0, v16

    .line 197
    .line 198
    :goto_d
    const/high16 v16, 0x6000000

    .line 199
    .line 200
    or-int v16, v0, v16

    .line 201
    .line 202
    move/from16 v17, v0

    .line 203
    .line 204
    and-int/lit16 v0, v14, 0x200

    .line 205
    .line 206
    move/from16 v18, v0

    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    if-eqz v18, :cond_14

    .line 210
    .line 211
    const/high16 v16, 0x36000000

    .line 212
    .line 213
    or-int v16, v17, v16

    .line 214
    .line 215
    goto :goto_10

    .line 216
    :cond_14
    const/high16 v17, 0x30000000

    .line 217
    .line 218
    and-int v17, v13, v17

    .line 219
    .line 220
    if-nez v17, :cond_17

    .line 221
    .line 222
    const/high16 v17, 0x40000000    # 2.0f

    .line 223
    .line 224
    and-int v17, v13, v17

    .line 225
    .line 226
    if-nez v17, :cond_15

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v17

    .line 232
    goto :goto_e

    .line 233
    :cond_15
    invoke-virtual {v12, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v17

    .line 237
    :goto_e
    if-eqz v17, :cond_16

    .line 238
    .line 239
    const/high16 v17, 0x20000000

    .line 240
    .line 241
    goto :goto_f

    .line 242
    :cond_16
    const/high16 v17, 0x10000000

    .line 243
    .line 244
    :goto_f
    or-int v16, v16, v17

    .line 245
    .line 246
    :cond_17
    :goto_10
    const v17, 0x12492493

    .line 247
    .line 248
    .line 249
    and-int v0, v16, v17

    .line 250
    .line 251
    const v1, 0x12492492

    .line 252
    .line 253
    .line 254
    move/from16 v17, v9

    .line 255
    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v10, 0x1

    .line 258
    if-eq v0, v1, :cond_18

    .line 259
    .line 260
    move v0, v10

    .line 261
    goto :goto_11

    .line 262
    :cond_18
    move v0, v9

    .line 263
    :goto_11
    and-int/lit8 v1, v16, 0x1

    .line 264
    .line 265
    invoke-virtual {v12, v1, v0}, Li0/h0;->S(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_21

    .line 270
    .line 271
    if-eqz v3, :cond_19

    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    goto :goto_12

    .line 276
    :cond_19
    move-object/from16 v18, v4

    .line 277
    .line 278
    :goto_12
    if-eqz v5, :cond_1a

    .line 279
    .line 280
    move/from16 v16, v10

    .line 281
    .line 282
    goto :goto_13

    .line 283
    :cond_1a
    move/from16 v16, v6

    .line 284
    .line 285
    :goto_13
    if-eqz v17, :cond_1b

    .line 286
    .line 287
    move/from16 v17, v10

    .line 288
    .line 289
    goto :goto_14

    .line 290
    :cond_1b
    move/from16 v17, p5

    .line 291
    .line 292
    :goto_14
    if-eqz v11, :cond_1c

    .line 293
    .line 294
    move v15, v10

    .line 295
    :cond_1c
    invoke-static {v15, v7}, Lw/s;->A(II)V

    .line 296
    .line 297
    .line 298
    sget-object v0, Lh0/n0;->a:Li0/u;

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-nez v0, :cond_20

    .line 305
    .line 306
    const v0, 0x1546143f    # 4.0001753E-26f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v9}, Li0/h0;->p(Z)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Ly1/h1;->k:Li0/m2;

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object v5, v0

    .line 322
    check-cast v5, Lm2/d;

    .line 323
    .line 324
    sget-object v0, Lw/n;->a:Li0/m2;

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object v11, v0

    .line 331
    check-cast v11, Ljava/util/concurrent/Executor;

    .line 332
    .line 333
    if-eqz v11, :cond_1d

    .line 334
    .line 335
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-static {v0}, Lw/n;->b(I)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_1d

    .line 344
    .line 345
    const v0, 0x4ac313f6    # 6392315.0f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 349
    .line 350
    .line 351
    sget-object v0, Ly1/h1;->n:Li0/m2;

    .line 352
    .line 353
    invoke-virtual {v12, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, Lu2/m;

    .line 358
    .line 359
    sget-object v1, Ly1/h1;->h:Li0/m2;

    .line 360
    .line 361
    invoke-virtual {v12, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    move-object v4, v1

    .line 366
    check-cast v4, Lu2/c;

    .line 367
    .line 368
    move-object v2, v0

    .line 369
    :try_start_0
    new-instance v0, Lca/x;

    .line 370
    .line 371
    const/16 v6, 0xd

    .line 372
    .line 373
    move-object/from16 v3, p0

    .line 374
    .line 375
    move-object/from16 v1, p2

    .line 376
    .line 377
    invoke-direct/range {v0 .. v6}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v11, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 381
    .line 382
    .line 383
    :catch_0
    invoke-virtual {v12, v9}, Li0/h0;->p(Z)V

    .line 384
    .line 385
    .line 386
    goto :goto_15

    .line 387
    :cond_1d
    const v0, 0x4adbba47    # 7200035.5f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v9}, Li0/h0;->p(Z)V

    .line 394
    .line 395
    .line 396
    :goto_15
    if-nez v18, :cond_1e

    .line 397
    .line 398
    const v0, 0x1554c093

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v9}, Li0/h0;->p(Z)V

    .line 405
    .line 406
    .line 407
    new-instance v0, Lg0/k;

    .line 408
    .line 409
    move-object/from16 v1, p0

    .line 410
    .line 411
    move-object/from16 v2, p2

    .line 412
    .line 413
    move-object v3, v5

    .line 414
    move v6, v7

    .line 415
    move v7, v15

    .line 416
    move/from16 v4, v16

    .line 417
    .line 418
    move/from16 v5, v17

    .line 419
    .line 420
    invoke-direct/range {v0 .. v7}, Lg0/k;-><init>(Ljava/lang/String;Li2/n0;Lm2/d;IZII)V

    .line 421
    .line 422
    .line 423
    move-object v15, v1

    .line 424
    invoke-interface {v8, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    move v14, v10

    .line 429
    move-object/from16 v3, v18

    .line 430
    .line 431
    goto :goto_16

    .line 432
    :cond_1e
    move v7, v15

    .line 433
    move/from16 v4, v16

    .line 434
    .line 435
    move/from16 v5, v17

    .line 436
    .line 437
    move-object/from16 v15, p0

    .line 438
    .line 439
    const v0, 0x154aedf1

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 443
    .line 444
    .line 445
    new-instance v1, Li2/g;

    .line 446
    .line 447
    invoke-direct {v1, v15}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    sget-object v0, Ly1/h1;->k:Li0/m2;

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, Lm2/d;

    .line 457
    .line 458
    move v2, v10

    .line 459
    const/4 v10, 0x0

    .line 460
    const/4 v11, 0x0

    .line 461
    move v3, v9

    .line 462
    const/4 v9, 0x0

    .line 463
    move-object v6, v8

    .line 464
    move-object v8, v0

    .line 465
    move-object v0, v6

    .line 466
    move/from16 v6, p6

    .line 467
    .line 468
    move v14, v2

    .line 469
    move v13, v3

    .line 470
    move-object/from16 v3, v18

    .line 471
    .line 472
    move-object/from16 v2, p2

    .line 473
    .line 474
    invoke-static/range {v0 .. v11}, Lw/s;->z(Ly0/o;Li2/g;Li2/n0;Lfg/l;IZIILm2/d;Ljava/util/List;Lfg/l;Lfg/l;)Ly0/o;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v12, v13}, Li0/h0;->p(Z)V

    .line 479
    .line 480
    .line 481
    move-object v0, v1

    .line 482
    :goto_16
    sget-object v1, Lw/c;->c:Lw/c;

    .line 483
    .line 484
    iget-wide v8, v12, Li0/h0;->T:J

    .line 485
    .line 486
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-static {v12, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 499
    .line 500
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 504
    .line 505
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 506
    .line 507
    .line 508
    iget-boolean v9, v12, Li0/h0;->S:Z

    .line 509
    .line 510
    if-eqz v9, :cond_1f

    .line 511
    .line 512
    invoke-virtual {v12, v8}, Li0/h0;->k(Lfg/a;)V

    .line 513
    .line 514
    .line 515
    goto :goto_17

    .line 516
    :cond_1f
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 517
    .line 518
    .line 519
    :goto_17
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 520
    .line 521
    invoke-static {v8, v12, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 525
    .line 526
    invoke-static {v1, v12, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 530
    .line 531
    invoke-static {v1, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 532
    .line 533
    .line 534
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 535
    .line 536
    invoke-static {v1, v12, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 544
    .line 545
    invoke-static {v1, v12, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v14}, Li0/h0;->p(Z)V

    .line 549
    .line 550
    .line 551
    move v6, v5

    .line 552
    move v8, v7

    .line 553
    move v5, v4

    .line 554
    move-object v4, v3

    .line 555
    goto :goto_18

    .line 556
    :cond_20
    invoke-static {}, Lah/a;->d()V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :cond_21
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 561
    .line 562
    .line 563
    move v5, v6

    .line 564
    move v8, v15

    .line 565
    move/from16 v6, p5

    .line 566
    .line 567
    :goto_18
    invoke-virtual {v12}, Li0/h0;->t()Li0/r1;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    if-eqz v11, :cond_22

    .line 572
    .line 573
    new-instance v0, Lw/j;

    .line 574
    .line 575
    move-object/from16 v1, p0

    .line 576
    .line 577
    move-object/from16 v2, p1

    .line 578
    .line 579
    move-object/from16 v3, p2

    .line 580
    .line 581
    move/from16 v7, p6

    .line 582
    .line 583
    move/from16 v9, p9

    .line 584
    .line 585
    move/from16 v10, p10

    .line 586
    .line 587
    invoke-direct/range {v0 .. v10}, Lw/j;-><init>(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIIII)V

    .line 588
    .line 589
    .line 590
    iput-object v0, v11, Li0/r1;->d:Lfg/p;

    .line 591
    .line 592
    :cond_22
    return-void
.end method

.method public static final c(Li2/g;Ly0/o;Li2/n0;ZIILfg/l;Lfg/l;Li0/h0;I)V
    .locals 17

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v8, p7

    .line 4
    .line 5
    move-object/from16 v15, p8

    .line 6
    .line 7
    move/from16 v0, p9

    .line 8
    .line 9
    const v1, -0xeb2f629

    .line 10
    .line 11
    .line 12
    invoke-virtual {v15, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v1, v0, 0x6

    .line 16
    .line 17
    move-object/from16 v9, p0

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v15, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x2

    .line 30
    :goto_0
    or-int/2addr v1, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v0

    .line 33
    :goto_1
    and-int/lit8 v3, v0, 0x30

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v3, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v1, v3

    .line 49
    :cond_3
    and-int/lit16 v3, v0, 0x180

    .line 50
    .line 51
    move-object/from16 v11, p2

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-virtual {v15, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v3, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v3

    .line 67
    :cond_5
    const v3, 0x1b6c00

    .line 68
    .line 69
    .line 70
    or-int/2addr v1, v3

    .line 71
    const/high16 v3, 0xc00000

    .line 72
    .line 73
    and-int/2addr v3, v0

    .line 74
    const/high16 v4, 0x800000

    .line 75
    .line 76
    if-nez v3, :cond_7

    .line 77
    .line 78
    invoke-virtual {v15, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_6

    .line 83
    .line 84
    move v3, v4

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/high16 v3, 0x400000

    .line 87
    .line 88
    :goto_4
    or-int/2addr v1, v3

    .line 89
    :cond_7
    const v3, 0x492493

    .line 90
    .line 91
    .line 92
    and-int/2addr v3, v1

    .line 93
    const v5, 0x492492

    .line 94
    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x1

    .line 98
    if-eq v3, v5, :cond_8

    .line 99
    .line 100
    move v3, v7

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    move v3, v6

    .line 103
    :goto_5
    and-int/lit8 v5, v1, 0x1

    .line 104
    .line 105
    invoke-virtual {v15, v5, v3}, Li0/h0;->S(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_11

    .line 110
    .line 111
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    sget-object v5, Li0/l;->a:Li0/e;

    .line 116
    .line 117
    if-ne v3, v5, :cond_9

    .line 118
    .line 119
    new-instance v3, Lr9/p;

    .line 120
    .line 121
    const/16 v10, 0x12

    .line 122
    .line 123
    invoke-direct {v3, v10}, Lr9/p;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v15, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_9
    check-cast v3, Lfg/l;

    .line 130
    .line 131
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    if-ne v10, v5, :cond_a

    .line 136
    .line 137
    const/4 v10, 0x0

    .line 138
    invoke-static {v10}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v15, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    check-cast v10, Li0/a1;

    .line 146
    .line 147
    const/high16 v12, 0x1c00000

    .line 148
    .line 149
    and-int/2addr v12, v1

    .line 150
    if-ne v12, v4, :cond_b

    .line 151
    .line 152
    move v4, v7

    .line 153
    goto :goto_6

    .line 154
    :cond_b
    move v4, v6

    .line 155
    :goto_6
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    if-nez v4, :cond_c

    .line 160
    .line 161
    if-ne v12, v5, :cond_d

    .line 162
    .line 163
    :cond_c
    new-instance v12, Lw/q;

    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    invoke-direct {v12, v10, v4, v8}, Lw/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_d
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 173
    .line 174
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 175
    .line 176
    invoke-static {v4, v8, v12}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-interface {v2, v4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    const/high16 v12, 0x380000

    .line 185
    .line 186
    and-int v13, v1, v12

    .line 187
    .line 188
    const/high16 v14, 0x100000

    .line 189
    .line 190
    if-ne v13, v14, :cond_e

    .line 191
    .line 192
    move v6, v7

    .line 193
    :cond_e
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    if-nez v6, :cond_f

    .line 198
    .line 199
    if-ne v13, v5, :cond_10

    .line 200
    .line 201
    :cond_f
    new-instance v13, Lw/o;

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    invoke-direct {v13, v10, v3, v5}, Lw/o;-><init>(Li0/a1;Lfg/l;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v15, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_10
    check-cast v13, Lfg/l;

    .line 211
    .line 212
    const v5, 0xe38e

    .line 213
    .line 214
    .line 215
    and-int/2addr v5, v1

    .line 216
    const/high16 v6, 0x70000

    .line 217
    .line 218
    shl-int/lit8 v10, v1, 0x6

    .line 219
    .line 220
    and-int/2addr v6, v10

    .line 221
    or-int/2addr v5, v6

    .line 222
    shl-int/lit8 v1, v1, 0x3

    .line 223
    .line 224
    and-int/2addr v1, v12

    .line 225
    or-int v16, v5, v1

    .line 226
    .line 227
    move-object v12, v13

    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    move-object v10, v4

    .line 231
    invoke-static/range {v9 .. v16}, Lw/s;->a(Li2/g;Ly0/o;Li2/n0;Lfg/l;ILjava/util/Map;Li0/h0;I)V

    .line 232
    .line 233
    .line 234
    const v1, 0x7fffffff

    .line 235
    .line 236
    .line 237
    move v6, v1

    .line 238
    move v4, v7

    .line 239
    move v5, v4

    .line 240
    move-object v7, v3

    .line 241
    goto :goto_7

    .line 242
    :cond_11
    invoke-virtual/range {p8 .. p8}, Li0/h0;->V()V

    .line 243
    .line 244
    .line 245
    move/from16 v4, p3

    .line 246
    .line 247
    move/from16 v5, p4

    .line 248
    .line 249
    move/from16 v6, p5

    .line 250
    .line 251
    move-object/from16 v7, p6

    .line 252
    .line 253
    :goto_7
    invoke-virtual/range {p8 .. p8}, Li0/h0;->t()Li0/r1;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    if-eqz v10, :cond_12

    .line 258
    .line 259
    new-instance v0, Lw/p;

    .line 260
    .line 261
    move-object/from16 v1, p0

    .line 262
    .line 263
    move-object/from16 v3, p2

    .line 264
    .line 265
    move/from16 v9, p9

    .line 266
    .line 267
    invoke-direct/range {v0 .. v9}, Lw/p;-><init>(Li2/g;Ly0/o;Li2/n0;ZIILfg/l;Lfg/l;I)V

    .line 268
    .line 269
    .line 270
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 271
    .line 272
    :cond_12
    return-void
.end method

.method public static final d(Lh0/d1;Ls0/d;Li0/h0;I)V
    .locals 8

    .line 1
    const v0, 0x5b67725a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eq v1, v2, :cond_4

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move v1, v3

    .line 49
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    const v1, -0x34c94080

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lh0/d1;->k()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    new-instance v1, Lh0/u0;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v1, p0, v4, v2}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Lc0/k;->c(Lh0/u0;)Ly0/o;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v2, p0, Lh0/d1;->x:Lb/e;

    .line 84
    .line 85
    new-instance v5, Lh0/v0;

    .line 86
    .line 87
    invoke-direct {v5, p0, v4}, Lh0/v0;-><init>(Lh0/d1;Lwf/c;)V

    .line 88
    .line 89
    .line 90
    new-instance v6, Lh0/w0;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-direct {v6, p0, v4, v7}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 94
    .line 95
    .line 96
    new-instance v4, Lh0/t0;

    .line 97
    .line 98
    invoke-direct {v4, p0, v7}, Lh0/t0;-><init>(Lh0/d1;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2, v5, v6, v4}, Lc0/k;->d(Ly0/o;Lb/e;Lh0/v0;Lh0/w0;Lh0/t0;)Ly0/o;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :goto_4
    and-int/lit8 v0, v0, 0x70

    .line 106
    .line 107
    invoke-static {v1, p1, p2, v0}, Lb0/o;->b(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 115
    .line 116
    .line 117
    :goto_5
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    new-instance v0, Lw/r;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-direct {v0, p0, p1, p3, v1}, Lw/r;-><init>(Lh0/d1;Ls0/d;II)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 130
    .line 131
    :cond_7
    return-void
.end method

.method public static final e(Lh0/d1;Ls0/d;Li0/h0;I)V
    .locals 3

    .line 1
    const v0, 0x7c0599e6

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    if-eq v1, v2, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const/4 v1, 0x0

    .line 48
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    and-int/lit8 v0, v0, 0x7e

    .line 57
    .line 58
    invoke-static {p0, p1, p2, v0}, Lw/s;->d(Lh0/d1;Ls0/d;Li0/h0;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 63
    .line 64
    .line 65
    :goto_4
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p2, :cond_6

    .line 70
    .line 71
    new-instance v0, Lw/r;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, p1, p3, v1}, Lw/r;-><init>(Lh0/d1;Ls0/d;II)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 78
    .line 79
    :cond_6
    return-void
.end method

.method public static final f(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;Li0/h0;II)V
    .locals 60

    move-object/from16 v3, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v14, p3

    move-object/from16 v0, p4

    move/from16 v15, p7

    move/from16 v1, p8

    move-object/from16 v5, p10

    move-object/from16 v2, p11

    move/from16 v4, p12

    move-object/from16 v6, p14

    move/from16 v7, p15

    move/from16 v8, p16

    const v9, 0x1d9f981

    .line 1
    invoke-virtual {v6, v9}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v9, v7, 0x6

    if-nez v9, :cond_1

    invoke-virtual {v6, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v7

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    and-int/lit8 v16, v7, 0x30

    const/16 v17, 0x10

    if-nez v16, :cond_3

    invoke-virtual {v6, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    move/from16 v16, v17

    :goto_2
    or-int v9, v9, v16

    :cond_3
    and-int/lit16 v12, v7, 0x180

    const/16 v19, 0x80

    const/16 v20, 0x100

    if-nez v12, :cond_5

    invoke-virtual {v6, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move/from16 v12, v20

    goto :goto_3

    :cond_4
    move/from16 v12, v19

    :goto_3
    or-int/2addr v9, v12

    :cond_5
    and-int/lit16 v12, v7, 0xc00

    const/16 v21, 0x400

    if-nez v12, :cond_7

    invoke-virtual {v6, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_4

    :cond_6
    move/from16 v12, v21

    :goto_4
    or-int/2addr v9, v12

    :cond_7
    and-int/lit16 v12, v7, 0x6000

    const/16 v22, 0x2000

    if-nez v12, :cond_9

    invoke-virtual {v6, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v12, v22

    :goto_5
    or-int/2addr v9, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int v24, v7, v12

    const/high16 v25, 0x20000

    const/high16 v26, 0x10000

    move-object/from16 v11, p5

    if-nez v24, :cond_b

    invoke-virtual {v6, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_a

    move/from16 v27, v25

    goto :goto_6

    :cond_a
    move/from16 v27, v26

    :goto_6
    or-int v9, v9, v27

    :cond_b
    const/high16 v27, 0x180000

    and-int v28, v7, v27

    const/4 v7, 0x0

    if-nez v28, :cond_d

    invoke-virtual {v6, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v28, 0x80000

    :goto_7
    or-int v9, v9, v28

    :cond_d
    const/high16 v28, 0xc00000

    and-int v28, p15, v28

    move-object/from16 v7, p6

    if-nez v28, :cond_f

    invoke-virtual {v6, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v29, 0x400000

    :goto_8
    or-int v9, v9, v29

    :cond_f
    const/high16 v29, 0x6000000

    and-int v29, p15, v29

    if-nez v29, :cond_11

    invoke-virtual {v6, v15}, Li0/h0;->g(Z)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v29, 0x2000000

    :goto_9
    or-int v9, v9, v29

    :cond_11
    const/high16 v29, 0x30000000

    and-int v29, p15, v29

    if-nez v29, :cond_13

    invoke-virtual {v6, v1}, Li0/h0;->d(I)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v29, 0x10000000

    :goto_a
    or-int v9, v9, v29

    :cond_13
    and-int/lit8 v29, v8, 0x6

    move/from16 v11, p9

    if-nez v29, :cond_15

    invoke-virtual {v6, v11}, Li0/h0;->d(I)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v29, 0x4

    goto :goto_b

    :cond_14
    const/16 v29, 0x2

    :goto_b
    or-int v29, v8, v29

    goto :goto_c

    :cond_15
    move/from16 v29, v8

    :goto_c
    and-int/lit8 v30, v8, 0x30

    if-nez v30, :cond_17

    invoke-virtual {v6, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/16 v17, 0x20

    :cond_16
    or-int v29, v29, v17

    :cond_17
    move/from16 v17, v12

    and-int/lit16 v12, v8, 0x180

    if-nez v12, :cond_19

    invoke-virtual {v6, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    move/from16 v19, v20

    :cond_18
    or-int v29, v29, v19

    :cond_19
    and-int/lit16 v12, v8, 0xc00

    if-nez v12, :cond_1b

    invoke-virtual {v6, v4}, Li0/h0;->g(Z)Z

    move-result v12

    if-eqz v12, :cond_1a

    const/16 v21, 0x800

    :cond_1a
    or-int v29, v29, v21

    :cond_1b
    and-int/lit16 v12, v8, 0x6000

    const/4 v11, 0x0

    if-nez v12, :cond_1d

    invoke-virtual {v6, v11}, Li0/h0;->g(Z)Z

    move-result v12

    if-eqz v12, :cond_1c

    const/16 v22, 0x4000

    :cond_1c
    or-int v29, v29, v22

    :cond_1d
    and-int v12, v8, v17

    if-nez v12, :cond_1f

    move-object/from16 v12, p13

    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1e

    goto :goto_d

    :cond_1e
    move/from16 v25, v26

    :goto_d
    or-int v29, v29, v25

    goto :goto_e

    :cond_1f
    move-object/from16 v12, p13

    :goto_e
    or-int v11, v29, v27

    const v17, 0x12492493

    const/16 v20, 0x20

    and-int v13, v9, v17

    const v4, 0x12492492

    if-ne v13, v4, :cond_21

    const v4, 0x92493

    and-int/2addr v4, v11

    const v13, 0x92492

    if-eq v4, v13, :cond_20

    goto :goto_f

    :cond_20
    const/4 v4, 0x0

    goto :goto_10

    :cond_21
    :goto_f
    const/4 v4, 0x1

    :goto_10
    and-int/lit8 v13, v9, 0x1

    invoke-virtual {v6, v13, v4}, Li0/h0;->S(IZ)Z

    move-result v4

    if-eqz v4, :cond_71

    invoke-virtual {v6}, Li0/h0;->X()V

    and-int/lit8 v4, p15, 0x1

    if-eqz v4, :cond_23

    invoke-virtual {v6}, Li0/h0;->B()Z

    move-result v4

    if-eqz v4, :cond_22

    goto :goto_11

    .line 2
    :cond_22
    invoke-virtual {v6}, Li0/h0;->V()V

    :cond_23
    :goto_11
    invoke-virtual {v6}, Li0/h0;->q()V

    .line 3
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v4

    .line 4
    sget-object v13, Li0/l;->a:Li0/e;

    if-ne v4, v13, :cond_24

    .line 5
    new-instance v4, Ld1/v;

    invoke-direct {v4}, Ld1/v;-><init>()V

    .line 6
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 7
    :cond_24
    check-cast v4, Ld1/v;

    .line 8
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_25

    .line 9
    sget-object v7, Lf0/t;->a:Lf0/s;

    .line 10
    new-instance v7, Lf0/c;

    .line 11
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 13
    :cond_25
    check-cast v7, Lf0/c;

    .line 14
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_26

    .line 15
    new-instance v8, Ln2/t;

    invoke-direct {v8, v7}, Ln2/t;-><init>(Ln2/n;)V

    .line 16
    invoke-virtual {v6, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 17
    :cond_26
    check-cast v8, Ln2/t;

    move-object/from16 v22, v7

    .line 18
    sget-object v7, Ly1/h1;->h:Li0/m2;

    .line 19
    invoke-virtual {v6, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    .line 20
    check-cast v7, Lu2/c;

    move-object/from16 v17, v7

    .line 21
    sget-object v7, Ly1/h1;->k:Li0/m2;

    .line 22
    invoke-virtual {v6, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    .line 23
    check-cast v7, Lm2/d;

    move-object/from16 v25, v7

    .line 24
    sget-object v7, Lh0/l1;->a:Li0/u;

    .line 25
    invoke-virtual {v6, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh0/k1;

    move-object/from16 v26, v8

    .line 26
    iget-wide v7, v7, Lh0/k1;->b:J

    move/from16 v27, v9

    .line 27
    sget-object v9, Ly1/h1;->i:Li0/m2;

    .line 28
    invoke-virtual {v6, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v9

    .line 29
    check-cast v9, Ld1/l;

    .line 30
    sget-object v12, Ly1/h1;->u:Li0/m2;

    .line 31
    invoke-virtual {v6, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v12

    .line 32
    check-cast v12, Ly1/o2;

    move-object/from16 v29, v12

    .line 33
    sget-object v12, Ly1/h1;->q:Li0/m2;

    .line 34
    invoke-virtual {v6, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v12

    .line 35
    check-cast v12, Ly1/g2;

    .line 36
    sget-object v14, Lm/p1;->g:Lm/p1;

    const/4 v15, 0x1

    if-ne v1, v15, :cond_27

    if-nez p7, :cond_27

    .line 37
    iget-boolean v15, v5, Ln2/j;->a:Z

    if-eqz v15, :cond_27

    .line 38
    sget-object v15, Lm/p1;->h:Lm/p1;

    goto :goto_12

    :cond_27
    move-object v15, v14

    :goto_12
    const v1, -0xcbd7bf2

    .line 39
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v1

    .line 40
    sget-object v5, Lw/j1;->g:Lp4/t;

    move/from16 v30, v11

    .line 41
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    invoke-virtual {v6, v11}, Li0/h0;->d(I)Z

    move-result v11

    move/from16 v31, v11

    .line 42
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v31, :cond_29

    if-ne v11, v13, :cond_28

    goto :goto_13

    :cond_28
    move-object/from16 v31, v4

    goto :goto_14

    .line 43
    :cond_29
    :goto_13
    new-instance v11, Lv0/a;

    move-object/from16 v31, v4

    const/4 v4, 0x5

    invoke-direct {v11, v15, v4}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 44
    invoke-virtual {v6, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 45
    :goto_14
    check-cast v11, Lfg/a;

    const/4 v4, 0x0

    invoke-static {v1, v5, v11, v6, v4}, Lv0/k;->e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lw/j1;

    .line 46
    invoke-virtual {v6, v4}, Li0/h0;->p(Z)V

    .line 47
    iget-object v1, v11, Lw/j1;->f:Li0/j1;

    .line 48
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/p1;

    if-eq v1, v15, :cond_2b

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    if-ne v15, v14, :cond_2a

    .line 50
    const-string v1, "only single-line, non-wrap text fields can scroll horizontally"

    goto :goto_15

    .line 51
    :cond_2a
    const-string v1, "single-line, non-wrap text fields can only scroll horizontally"

    .line 52
    :goto_15
    const-string v2, "Mismatching scroller orientation; "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    and-int/lit8 v1, v27, 0xe

    const/4 v4, 0x4

    if-ne v1, v4, :cond_2c

    const/4 v5, 0x1

    goto :goto_16

    :cond_2c
    const/4 v5, 0x0

    :goto_16
    const v32, 0xe000

    and-int v14, v27, v32

    const/16 v15, 0x4000

    if-ne v14, v15, :cond_2d

    const/4 v14, 0x1

    goto :goto_17

    :cond_2d
    const/4 v14, 0x0

    :goto_17
    or-int/2addr v5, v14

    .line 54
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v14

    const/16 v15, 0x8

    if-nez v5, :cond_2f

    if-ne v14, v13, :cond_2e

    goto :goto_18

    :cond_2e
    move/from16 v27, v1

    goto/16 :goto_1a

    .line 55
    :cond_2f
    :goto_18
    iget-object v5, v3, Ln2/s;->a:Li2/g;

    .line 56
    invoke-static {v0, v5}, Lw/s;->p(Lj8/o;Li2/g;)Ln2/z;

    move-result-object v5

    iget-object v14, v5, Ln2/z;->b:Lb5/k;

    .line 57
    iget-object v4, v3, Ln2/s;->c:Li2/m0;

    if-eqz v4, :cond_30

    move/from16 v27, v1

    .line 58
    iget-wide v0, v4, Li2/m0;->a:J

    .line 59
    sget v4, Li2/m0;->c:I

    move-wide/from16 v33, v0

    shr-long v0, v33, v20

    long-to-int v0, v0

    invoke-virtual {v14, v0}, Lb5/k;->l(I)I

    const-wide v35, 0xffffffffL

    and-long v1, v33, v35

    long-to-int v1, v1

    .line 60
    invoke-virtual {v14, v1}, Lb5/k;->l(I)I

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 63
    new-instance v1, Li2/d;

    .line 64
    iget-object v4, v5, Ln2/z;->a:Li2/g;

    .line 65
    invoke-direct {v1, v4}, Li2/d;-><init>(Li2/g;)V

    .line 66
    new-instance v33, Li2/f0;

    const/16 v51, 0x0

    const v52, 0xefff

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const-wide/16 v48, 0x0

    sget-object v50, Lt2/l;->c:Lt2/l;

    invoke-direct/range {v33 .. v52}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    move-object/from16 v4, v33

    .line 67
    new-instance v5, Li2/c;

    invoke-direct {v5, v4, v2, v0, v15}, Li2/c;-><init>(Li2/b;III)V

    iget-object v0, v1, Li2/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-virtual {v1}, Li2/d;->e()Li2/g;

    move-result-object v0

    .line 69
    new-instance v1, Ln2/z;

    invoke-direct {v1, v0, v14}, Ln2/z;-><init>(Li2/g;Lb5/k;)V

    move-object v14, v1

    goto :goto_19

    :cond_30
    move/from16 v27, v1

    move-object v14, v5

    .line 70
    :goto_19
    invoke-virtual {v6, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 71
    :goto_1a
    move-object v0, v14

    check-cast v0, Ln2/z;

    .line 72
    iget-object v1, v0, Ln2/z;->a:Li2/g;

    .line 73
    iget-object v5, v0, Ln2/z;->b:Lb5/k;

    .line 74
    invoke-virtual {v6}, Li0/h0;->A()Li0/r1;

    move-result-object v2

    if-eqz v2, :cond_70

    .line 75
    iget v4, v2, Li0/r1;->b:I

    const/16 v21, 0x1

    or-int/lit8 v4, v4, 0x1

    .line 76
    iput v4, v2, Li0/r1;->b:I

    .line 77
    invoke-virtual {v6, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v4

    .line 78
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v14

    if-nez v4, :cond_32

    if-ne v14, v13, :cond_31

    goto :goto_1b

    :cond_31
    move/from16 v15, p7

    move-object/from16 v34, v0

    move-object v0, v1

    move-object/from16 v35, v5

    move-object/from16 v20, v11

    move-object v11, v13

    move-object v4, v14

    move-object/from16 v12, v17

    move-object/from16 v13, v25

    move-object/from16 v14, p3

    goto :goto_1c

    .line 79
    :cond_32
    :goto_1b
    new-instance v4, Lw/q0;

    move-object v14, v12

    .line 80
    new-instance v12, Lw/x0;

    const/16 v33, 0x4

    const/16 v18, 0x0

    move/from16 v15, p7

    move-object/from16 v20, v11

    move-object v11, v13

    move-object/from16 v16, v17

    move-object/from16 v17, v25

    move-object v13, v1

    move-object v1, v14

    move-object/from16 v14, p3

    .line 81
    invoke-direct/range {v12 .. v18}, Lw/x0;-><init>(Li2/g;Li2/n0;ZLu2/c;Lm2/d;I)V

    move-object/from16 v34, v0

    move-object/from16 v35, v5

    move-object v5, v12

    move-object v0, v13

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    .line 82
    invoke-direct {v4, v5, v2, v1}, Lw/q0;-><init>(Lw/x0;Li0/r1;Ly1/g2;)V

    .line 83
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 84
    :goto_1c
    move-object v1, v4

    check-cast v1, Lw/q0;

    .line 85
    iget-object v2, v3, Ln2/s;->a:Li2/g;

    iget-wide v4, v3, Ln2/s;->b:J

    .line 86
    iput-object v10, v1, Lw/q0;->u:Lfg/l;

    .line 87
    iput-wide v7, v1, Lw/q0;->z:J

    .line 88
    iget-object v7, v1, Lw/q0;->r:Lb5/c;

    move-object/from16 v8, p11

    .line 89
    iput-object v8, v7, Lb5/c;->b:Ljava/lang/Object;

    .line 90
    iput-object v9, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 91
    iput-object v2, v1, Lw/q0;->j:Li2/g;

    .line 92
    iget-object v2, v1, Lw/q0;->a:Lw/x0;

    .line 93
    iget-object v7, v2, Lw/x0;->a:Li2/g;

    .line 94
    invoke-static {v7, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_35

    .line 95
    iget-object v7, v2, Lw/x0;->b:Li2/n0;

    .line 96
    invoke-static {v7, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_35

    .line 97
    iget-boolean v7, v2, Lw/x0;->e:Z

    if-ne v7, v15, :cond_35

    .line 98
    iget v7, v2, Lw/x0;->f:I

    move-object/from16 v16, v0

    const/4 v0, 0x1

    if-ne v7, v0, :cond_33

    .line 99
    iget v7, v2, Lw/x0;->c:I

    const v0, 0x7fffffff

    if-ne v7, v0, :cond_33

    .line 100
    iget v0, v2, Lw/x0;->d:I

    const/4 v7, 0x1

    if-ne v0, v7, :cond_33

    .line 101
    iget-object v0, v2, Lw/x0;->g:Lu2/c;

    .line 102
    invoke-static {v0, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 103
    iget-object v0, v2, Lw/x0;->i:Ljava/util/List;

    .line 104
    sget-object v7, Ltf/t;->g:Ltf/t;

    invoke-static {v0, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 105
    iget-object v0, v2, Lw/x0;->h:Lm2/d;

    if-eq v0, v13, :cond_34

    :cond_33
    :goto_1d
    move-object/from16 v17, v12

    goto :goto_1e

    :cond_34
    move-object/from16 v16, v12

    goto :goto_1f

    :cond_35
    move-object/from16 v16, v0

    goto :goto_1d

    .line 106
    :goto_1e
    new-instance v12, Lw/x0;

    const/16 v18, 0x0

    move-object/from16 v59, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v59

    invoke-direct/range {v12 .. v18}, Lw/x0;-><init>(Li2/g;Li2/n0;ZLu2/c;Lm2/d;I)V

    move-object v2, v12

    .line 107
    :goto_1f
    iget-object v0, v1, Lw/q0;->a:Lw/x0;

    const/4 v15, 0x1

    if-eq v0, v2, :cond_36

    iput-boolean v15, v1, Lw/q0;->p:Z

    .line 108
    :cond_36
    iput-object v2, v1, Lw/q0;->a:Lw/x0;

    .line 109
    iget-object v0, v1, Lw/q0;->d:Lb/e;

    .line 110
    iget-object v2, v1, Lw/q0;->e:Ln2/y;

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    iget-object v7, v3, Ln2/s;->c:Li2/m0;

    .line 113
    iget-object v12, v0, Lb/e;->i:Ljava/lang/Object;

    check-cast v12, Lk5/n;

    invoke-virtual {v12}, Lk5/n;->c()Li2/m0;

    move-result-object v12

    invoke-static {v7, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 114
    iget-object v13, v0, Lb/e;->h:Ljava/lang/Object;

    check-cast v13, Ln2/s;

    .line 115
    iget-object v13, v13, Ln2/s;->a:Li2/g;

    .line 116
    iget-object v13, v13, Li2/g;->h:Ljava/lang/String;

    .line 117
    iget-object v15, v3, Ln2/s;->a:Li2/g;

    .line 118
    iget-object v8, v15, Li2/g;->h:Ljava/lang/String;

    .line 119
    invoke-static {v13, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_37

    .line 120
    new-instance v8, Lk5/n;

    invoke-direct {v8, v15, v4, v5}, Lk5/n;-><init>(Li2/g;J)V

    iput-object v8, v0, Lb/e;->i:Ljava/lang/Object;

    move-object v13, v9

    const/4 v8, 0x1

    :goto_20
    const/4 v9, 0x0

    goto :goto_21

    .line 121
    :cond_37
    iget-object v8, v0, Lb/e;->h:Ljava/lang/Object;

    check-cast v8, Ln2/s;

    move-object v13, v9

    .line 122
    iget-wide v8, v8, Ln2/s;->b:J

    .line 123
    invoke-static {v8, v9, v4, v5}, Li2/m0;->b(JJ)Z

    move-result v8

    if-nez v8, :cond_38

    .line 124
    iget-object v8, v0, Lb/e;->i:Ljava/lang/Object;

    check-cast v8, Lk5/n;

    invoke-static {v4, v5}, Li2/m0;->f(J)I

    move-result v9

    invoke-static {v4, v5}, Li2/m0;->e(J)I

    move-result v15

    invoke-virtual {v8, v9, v15}, Lk5/n;->h(II)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    goto :goto_21

    :cond_38
    const/4 v8, 0x0

    goto :goto_20

    :goto_21
    const/4 v15, -0x1

    if-nez v7, :cond_39

    .line 125
    iget-object v7, v0, Lb/e;->i:Ljava/lang/Object;

    check-cast v7, Lk5/n;

    .line 126
    iput v15, v7, Lk5/n;->j:I

    .line 127
    iput v15, v7, Lk5/n;->k:I

    move/from16 v17, v8

    goto :goto_22

    :cond_39
    move/from16 v17, v8

    .line 128
    iget-wide v7, v7, Li2/m0;->a:J

    .line 129
    invoke-static {v7, v8}, Li2/m0;->c(J)Z

    move-result v18

    if-nez v18, :cond_3a

    .line 130
    iget-object v15, v0, Lb/e;->i:Ljava/lang/Object;

    check-cast v15, Lk5/n;

    move-wide/from16 v36, v7

    invoke-static/range {v36 .. v37}, Li2/m0;->f(J)I

    move-result v7

    invoke-static/range {v36 .. v37}, Li2/m0;->e(J)I

    move-result v8

    invoke-virtual {v15, v7, v8}, Lk5/n;->g(II)V

    :cond_3a
    :goto_22
    const/4 v15, 0x3

    const-wide/16 v7, 0x0

    if-nez v17, :cond_3c

    if-nez v9, :cond_3b

    if-nez v12, :cond_3b

    goto :goto_23

    :cond_3b
    move-object v12, v3

    const/4 v9, 0x0

    goto :goto_24

    .line 131
    :cond_3c
    :goto_23
    iget-object v9, v0, Lb/e;->i:Ljava/lang/Object;

    check-cast v9, Lk5/n;

    const/4 v12, -0x1

    .line 132
    iput v12, v9, Lk5/n;->j:I

    .line 133
    iput v12, v9, Lk5/n;->k:I

    const/4 v9, 0x0

    .line 134
    invoke-static {v3, v9, v7, v8, v15}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    move-result-object v12

    .line 135
    :goto_24
    iget-object v7, v0, Lb/e;->h:Ljava/lang/Object;

    check-cast v7, Ln2/s;

    .line 136
    iput-object v12, v0, Lb/e;->h:Ljava/lang/Object;

    if-eqz v2, :cond_3d

    .line 137
    invoke-virtual {v2, v7, v12}, Ln2/y;->a(Ln2/s;Ln2/s;)V

    .line 138
    :cond_3d
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_3e

    .line 139
    new-instance v0, Lw/q1;

    .line 140
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 141
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 142
    :cond_3e
    move-object v12, v0

    check-cast v12, Lw/q1;

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 144
    iget-boolean v0, v12, Lw/q1;->e:Z

    if-nez v0, :cond_40

    .line 145
    iget-object v0, v12, Lw/q1;->d:Ljava/lang/Long;

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    goto :goto_25

    :cond_3f
    const-wide/16 v17, 0x0

    :goto_25
    const/16 v0, 0x1388

    int-to-long v9, v0

    add-long v17, v17, v9

    cmp-long v0, v7, v17

    if-lez v0, :cond_41

    .line 146
    :cond_40
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v12, Lw/q1;->d:Ljava/lang/Long;

    .line 147
    invoke-virtual {v12, v3}, Lw/q1;->a(Ln2/s;)V

    .line 148
    :cond_41
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_42

    .line 149
    invoke-static {v6}, Li0/r;->n(Li0/h0;)Lqg/t;

    move-result-object v0

    .line 150
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 151
    :cond_42
    move-object v8, v0

    check-cast v8, Lqg/t;

    .line 152
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_43

    .line 153
    new-instance v0, Lt/c;

    invoke-direct {v0}, Lt/c;-><init>()V

    .line 154
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 155
    :cond_43
    move-object v9, v0

    check-cast v9, Lt/c;

    .line 156
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_44

    .line 157
    new-instance v0, Lh0/d1;

    invoke-direct {v0, v12}, Lh0/d1;-><init>(Lw/q1;)V

    .line 158
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 159
    :cond_44
    move-object v2, v0

    check-cast v2, Lh0/d1;

    move-object/from16 v0, v35

    .line 160
    iput-object v0, v2, Lh0/d1;->b:Lb5/k;

    .line 161
    iget-object v7, v1, Lw/q0;->v:Lw/w;

    .line 162
    iput-object v7, v2, Lh0/d1;->c:Lfg/l;

    .line 163
    iput-object v1, v2, Lh0/d1;->d:Lw/q0;

    .line 164
    iget-object v7, v2, Lh0/d1;->e:Li0/j1;

    invoke-virtual {v7, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 165
    new-instance v7, Li2/m0;

    invoke-direct {v7, v4, v5}, Li2/m0;-><init>(J)V

    .line 166
    iput-object v7, v2, Lh0/d1;->v:Li2/m0;

    .line 167
    sget-object v4, Ly1/h1;->f:Li0/m2;

    .line 168
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly1/y0;

    .line 169
    iput-object v4, v2, Lh0/d1;->g:Ly1/y0;

    .line 170
    iput-object v8, v2, Lh0/d1;->h:Lqg/t;

    .line 171
    sget-object v4, Ly1/h1;->r:Li0/m2;

    .line 172
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly1/h2;

    .line 173
    sget-object v4, Ly1/h1;->l:Li0/m2;

    .line 174
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln1/a;

    .line 175
    iput-object v4, v2, Lh0/d1;->j:Ln1/a;

    move-object/from16 v4, v31

    .line 176
    iput-object v4, v2, Lh0/d1;->k:Ld1/v;

    .line 177
    iget-object v5, v2, Lh0/d1;->l:Li0/j1;

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 178
    invoke-virtual {v5, v7}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 179
    iget-object v5, v2, Lh0/d1;->m:Li0/j1;

    invoke-static/range {p12 .. p12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 180
    invoke-virtual {v5, v7}, Li0/j1;->setValue(Ljava/lang/Object;)V

    const v5, 0x753a5109

    .line 181
    invoke-virtual {v6, v5}, Li0/h0;->a0(I)V

    .line 182
    iget-object v5, v14, Li2/n0;->a:Li2/f0;

    .line 183
    iget-object v5, v5, Li2/f0;->k:Lp2/b;

    .line 184
    sget-object v7, Lh0/r;->a:Li0/m2;

    const v7, 0x19a9604b

    .line 185
    invoke-virtual {v6, v7}, Li0/h0;->a0(I)V

    .line 186
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1c

    if-ge v7, v10, :cond_45

    const/4 v7, 0x0

    .line 187
    invoke-virtual {v6, v7}, Li0/h0;->p(Z)V

    move v3, v7

    const/4 v7, 0x0

    goto :goto_26

    .line 188
    :cond_45
    sget-object v7, Ly1/i0;->b:Li0/m2;

    .line 189
    invoke-virtual {v6, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    .line 190
    check-cast v7, Landroid/content/Context;

    .line 191
    sget-object v10, Lh0/r;->a:Li0/m2;

    .line 192
    invoke-virtual {v6, v10}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v10

    .line 193
    check-cast v10, Lwf/g;

    .line 194
    invoke-virtual {v6, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v18

    invoke-virtual {v6, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v28

    or-int v18, v18, v28

    invoke-virtual {v6, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v28

    or-int v18, v18, v28

    .line 195
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v15

    if-nez v18, :cond_46

    if-ne v15, v11, :cond_47

    .line 196
    :cond_46
    sget-object v15, Lh0/r;->b:Lh0/q;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    new-instance v15, Lh0/p;

    sget-object v3, Lh0/t;->g:Lh0/t;

    invoke-direct {v15, v10, v7, v3, v5}, Lh0/p;-><init>(Lwf/g;Landroid/content/Context;Lh0/t;Lp2/b;)V

    .line 198
    invoke-virtual {v6, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 199
    :cond_47
    move-object v7, v15

    check-cast v7, Lh0/p;

    const/4 v3, 0x0

    .line 200
    invoke-virtual {v6, v3}, Li0/h0;->p(Z)V

    .line 201
    :goto_26
    iput-object v7, v2, Lh0/d1;->i:Lh0/p;

    .line 202
    invoke-virtual {v6, v3}, Li0/h0;->p(Z)V

    .line 203
    invoke-virtual {v1}, Lw/q0;->b()Z

    .line 204
    invoke-virtual {v6, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v3

    move/from16 v10, v30

    and-int/lit16 v15, v10, 0x1c00

    const/16 v5, 0x800

    if-ne v15, v5, :cond_48

    const/4 v5, 0x1

    goto :goto_27

    :cond_48
    const/4 v5, 0x0

    :goto_27
    or-int/2addr v3, v5

    and-int v5, v10, v32

    const/16 v7, 0x4000

    if-ne v5, v7, :cond_49

    const/4 v5, 0x1

    goto :goto_28

    :cond_49
    const/4 v5, 0x0

    :goto_28
    or-int/2addr v3, v5

    move-object/from16 v5, v26

    invoke-virtual {v6, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    move-object/from16 v18, v1

    move/from16 v7, v27

    const/4 v1, 0x4

    if-ne v7, v1, :cond_4a

    const/4 v1, 0x1

    goto :goto_29

    :cond_4a
    const/4 v1, 0x0

    :goto_29
    or-int/2addr v1, v3

    and-int/lit8 v3, v10, 0x70

    xor-int/lit8 v3, v3, 0x30

    move/from16 v30, v10

    const/16 v10, 0x20

    if-le v3, v10, :cond_4c

    move-object/from16 v10, p10

    invoke-virtual {v6, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_4b

    goto :goto_2a

    :cond_4b
    move/from16 v24, v1

    move/from16 v26, v3

    goto :goto_2b

    :cond_4c
    move-object/from16 v10, p10

    :goto_2a
    move/from16 v24, v1

    and-int/lit8 v1, v30, 0x30

    move/from16 v26, v3

    const/16 v3, 0x20

    if-ne v1, v3, :cond_4d

    :goto_2b
    const/4 v1, 0x1

    goto :goto_2c

    :cond_4d
    const/4 v1, 0x0

    :goto_2c
    or-int v1, v24, v1

    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v6, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v6, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v6, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    .line 205
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4e

    if-ne v3, v11, :cond_4f

    :cond_4e
    move-object/from16 v35, v0

    goto :goto_2d

    :cond_4f
    move-object/from16 v35, v0

    move-object v0, v3

    move-object v3, v5

    move/from16 v27, v7

    move-object/from16 v24, v9

    move-object v5, v10

    move-object/from16 v53, v13

    move-object/from16 v1, v18

    move/from16 v13, v26

    move-object/from16 v14, v29

    move/from16 v9, p12

    move-object v10, v6

    move-object/from16 v18, v12

    move-object v12, v4

    move-object v4, v2

    move-object v2, v8

    move-object/from16 v8, p0

    goto :goto_2e

    .line 206
    :goto_2d
    new-instance v0, Lw/z;

    move-object v3, v5

    move/from16 v27, v7

    move-object v5, v10

    move-object/from16 v53, v13

    move-object/from16 v1, v18

    move/from16 v13, v26

    move-object/from16 v14, v29

    move-object v7, v2

    move-object v10, v6

    move-object/from16 v18, v12

    move-object/from16 v6, v35

    move/from16 v2, p12

    move-object v12, v4

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v9}, Lw/z;-><init>(Lw/q0;ZLn2/t;Ln2/s;Ln2/j;Lb5/k;Lh0/d1;Lqg/t;Lt/c;)V

    move-object/from16 v24, v9

    move v9, v2

    move-object v2, v8

    move-object v8, v4

    move-object v4, v7

    .line 207
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 208
    :goto_2e
    check-cast v0, Lfg/l;

    .line 209
    sget-object v6, Ly0/l;->a:Ly0/l;

    invoke-static {v6, v12}, Ld1/d;->j(Ly0/o;Ld1/v;)Ly0/o;

    move-result-object v7

    .line 210
    invoke-static {v7, v0}, Ld1/d;->s(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v0

    .line 211
    invoke-static {v0, v9}, Lk/n;->l(Ly0/o;Z)Ly0/o;

    move-result-object v0

    .line 212
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7, v10}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v7

    .line 213
    invoke-virtual {v10, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v26

    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v29

    or-int v26, v26, v29

    invoke-virtual {v10, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v29

    or-int v26, v26, v29

    invoke-virtual {v10, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v29

    or-int v26, v26, v29

    move-object/from16 v29, v0

    const/16 v0, 0x20

    if-le v13, v0, :cond_51

    invoke-virtual {v10, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v31

    if-nez v31, :cond_50

    goto :goto_2f

    :cond_50
    move-object/from16 v31, v1

    goto :goto_30

    :cond_51
    :goto_2f
    move-object/from16 v31, v1

    and-int/lit8 v1, v30, 0x30

    if-ne v1, v0, :cond_52

    :goto_30
    const/4 v0, 0x1

    goto :goto_31

    :cond_52
    const/4 v0, 0x0

    :goto_31
    or-int v0, v26, v0

    .line 214
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_54

    if-ne v1, v11, :cond_53

    goto :goto_32

    :cond_53
    move-object v0, v1

    move-object/from16 v54, v2

    move-object/from16 v26, v3

    move-object/from16 v32, v12

    move-object/from16 v55, v29

    move-object/from16 v1, v31

    move-object v12, v6

    move-object/from16 v29, v7

    goto :goto_33

    .line 215
    :cond_54
    :goto_32
    new-instance v0, Lf0/b;

    move-object v1, v6

    const/4 v6, 0x0

    move-object/from16 v26, v2

    move-object v2, v7

    const/4 v7, 0x5

    move-object/from16 v32, v12

    move-object/from16 v54, v26

    move-object/from16 v55, v29

    move-object v12, v1

    move-object/from16 v1, v31

    invoke-direct/range {v0 .. v7}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    move-object/from16 v29, v2

    move-object/from16 v26, v3

    .line 216
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 217
    :goto_33
    check-cast v0, Lfg/p;

    sget-object v2, Lsf/n;->a:Lsf/n;

    invoke-static {v0, v10, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 218
    new-instance v0, Lw/w;

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7}, Lw/w;-><init>(Lw/q0;I)V

    const v2, 0x845fed

    .line 219
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lc0/g;

    const/4 v5, 0x3

    invoke-direct {v3, v0, v5}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v12, v2, v3}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    move-result-object v0

    move-object v2, v0

    .line 220
    new-instance v0, Lc9/u;

    const/4 v6, 0x3

    move v3, v9

    move-object/from16 v5, v35

    move-object v9, v2

    move-object/from16 v2, v32

    invoke-direct/range {v0 .. v6}, Lc9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v31, v2

    move-object v6, v5

    if-eqz p12, :cond_55

    .line 221
    new-instance v2, Lf0/h;

    invoke-direct {v2, v0, v7}, Lf0/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v9, v2}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    move-result-object v0

    goto :goto_34

    :cond_55
    move-object v0, v9

    .line 222
    :goto_34
    iget-object v2, v4, Lh0/d1;->z:Lh0/q0;

    .line 223
    iget-object v3, v4, Lh0/d1;->y:Lh0/b1;

    .line 224
    new-instance v5, Lc0/g;

    const/4 v9, 0x6

    invoke-direct {v5, v4, v9}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2, v3, v5}, Ls1/h0;->b(Ly0/o;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    move-result-object v0

    .line 225
    sget-object v2, Ls1/q;->a:Ls1/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ls1/s;->b:Ls1/a;

    invoke-static {v0, v2}, Ls1/s;->g(Ly0/o;Ls1/a;)Ly0/o;

    move-result-object v7

    .line 226
    new-instance v0, Lb0/s;

    const/16 v2, 0x15

    invoke-direct {v0, v1, v8, v6, v2}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v12, v0}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v32

    .line 227
    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v0

    const/16 v5, 0x800

    if-ne v15, v5, :cond_56

    const/4 v2, 0x1

    goto :goto_35

    :cond_56
    const/4 v2, 0x0

    :goto_35
    or-int/2addr v0, v2

    invoke-virtual {v10, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    move/from16 v15, v27

    const/4 v2, 0x4

    if-ne v15, v2, :cond_57

    const/4 v2, 0x1

    goto :goto_36

    :cond_57
    const/4 v2, 0x0

    :goto_36
    or-int/2addr v0, v2

    invoke-virtual {v10, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 228
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_58

    if-ne v2, v11, :cond_59

    .line 229
    :cond_58
    new-instance v0, Lhb/x;

    move/from16 v2, p12

    move-object v5, v8

    move-object v3, v14

    invoke-direct/range {v0 .. v6}, Lhb/x;-><init>(Lw/q0;ZLy1/o2;Lh0/d1;Ln2/s;Lb5/k;)V

    .line 230
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v2, v0

    .line 231
    :cond_59
    check-cast v2, Lfg/l;

    invoke-static {v12, v2}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v23

    .line 232
    new-instance v0, Lf0/e;

    move-object/from16 v2, p0

    move-object v3, v1

    move-object v5, v6

    move-object/from16 v9, v26

    move-object/from16 v8, v31

    move-object/from16 v1, v34

    move-object v6, v4

    move-object/from16 v26, v14

    move/from16 v4, p12

    move-object v14, v7

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v8}, Lf0/e;-><init>(Ln2/z;Ln2/s;Lw/q0;ZLb5/k;Lh0/d1;Ln2/j;Ld1/v;)V

    move-object v1, v3

    move-object v8, v6

    move-object v6, v5

    if-eqz p12, :cond_5b

    .line 233
    move-object/from16 v2, v26

    check-cast v2, Ly1/v1;

    .line 234
    iget-object v2, v2, Ly1/v1;->c:Li0/j1;

    .line 235
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5b

    .line 236
    iget-object v2, v1, Lw/q0;->A:Li0/j1;

    .line 237
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/m0;

    .line 238
    iget-wide v2, v2, Li2/m0;->a:J

    .line 239
    invoke-static {v2, v3}, Li2/m0;->c(J)Z

    move-result v2

    if-eqz v2, :cond_5b

    .line 240
    iget-object v2, v1, Lw/q0;->B:Li0/j1;

    .line 241
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/m0;

    .line 242
    iget-wide v2, v2, Li2/m0;->a:J

    .line 243
    invoke-static {v2, v3}, Li2/m0;->c(J)Z

    move-result v2

    if-nez v2, :cond_5a

    goto :goto_37

    :cond_5a
    const/4 v2, 0x1

    goto :goto_38

    :cond_5b
    :goto_37
    const/4 v2, 0x0

    :goto_38
    if-eqz v2, :cond_5c

    move-object v2, v0

    .line 244
    new-instance v0, Lc9/k0;

    const/4 v5, 0x3

    move-object/from16 v3, p0

    move-object v4, v6

    move-object v6, v2

    move-object v2, v1

    move-object/from16 v1, p6

    invoke-direct/range {v0 .. v5}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v2

    move-object/from16 v35, v4

    invoke-static {v12, v0}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    move-result-object v0

    move-object/from16 v31, v0

    goto :goto_39

    :cond_5c
    move-object/from16 v35, v6

    move-object v6, v0

    move-object/from16 v31, v12

    .line 245
    :goto_39
    invoke-virtual {v10, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v0

    .line 246
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5d

    if-ne v2, v11, :cond_5e

    .line 247
    :cond_5d
    new-instance v2, Lh0/t0;

    const/4 v0, 0x1

    invoke-direct {v2, v8, v0}, Lh0/t0;-><init>(Lh0/d1;I)V

    .line 248
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 249
    :cond_5e
    check-cast v2, Lfg/l;

    invoke-static {v8, v2, v10}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 250
    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    const/4 v2, 0x4

    if-ne v15, v2, :cond_5f

    const/4 v2, 0x1

    goto :goto_3a

    :cond_5f
    const/4 v2, 0x0

    :goto_3a
    or-int/2addr v0, v2

    const/16 v3, 0x20

    if-le v13, v3, :cond_60

    invoke-virtual {v10, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_61

    :cond_60
    and-int/lit8 v2, v30, 0x30

    if-ne v2, v3, :cond_62

    :cond_61
    const/4 v2, 0x1

    goto :goto_3b

    :cond_62
    const/4 v2, 0x0

    :goto_3b
    or-int/2addr v0, v2

    .line 251
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_64

    if-ne v2, v11, :cond_63

    goto :goto_3c

    :cond_63
    move-object v13, v7

    goto :goto_3d

    .line 252
    :cond_64
    :goto_3c
    new-instance v0, Lc9/k;

    const/16 v5, 0xc

    move-object/from16 v3, p0

    move-object v4, v7

    move-object v2, v9

    invoke-direct/range {v0 .. v5}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v13, v4

    .line 253
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v2, v0

    .line 254
    :goto_3d
    check-cast v2, Lfg/l;

    invoke-static {v13, v2, v10}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    move-object v4, v8

    .line 255
    iget-object v8, v1, Lw/q0;->v:Lw/w;

    move/from16 v15, p8

    const/4 v0, 0x1

    if-ne v15, v0, :cond_65

    const/4 v5, 0x1

    goto :goto_3e

    :cond_65
    const/4 v5, 0x0

    .line 256
    :goto_3e
    iget v9, v13, Ln2/j;->e:I

    .line 257
    new-instance v0, Lw/c1;

    move-object/from16 v3, p0

    move/from16 v15, p12

    move-object v2, v4

    move-object/from16 v56, v6

    move-object/from16 v7, v18

    move-object/from16 v6, v35

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v9}, Lw/c1;-><init>(Lw/q0;Lh0/d1;Ln2/s;ZZLb5/k;Lw/q1;Lfg/l;I)V

    move-object v4, v2

    invoke-static {v12, v0}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    move-result-object v0

    .line 258
    iget v2, v13, Ln2/j;->d:I

    const/4 v3, 0x7

    if-ne v2, v3, :cond_66

    goto :goto_3f

    :cond_66
    const/16 v3, 0x8

    if-ne v2, v3, :cond_67

    :goto_3f
    const/4 v7, 0x0

    goto :goto_40

    :cond_67
    const/4 v7, 0x1

    .line 259
    :goto_40
    invoke-interface/range {v29 .. v29}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 260
    invoke-virtual {v10, v7}, Li0/h0;->g(Z)Z

    move-result v3

    move-object/from16 v5, v22

    invoke-virtual {v10, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    .line 261
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_68

    if-ne v8, v11, :cond_69

    .line 262
    :cond_68
    new-instance v8, Lu/c;

    invoke-direct {v8, v7, v5}, Lu/c;-><init>(ZLf0/c;)V

    .line 263
    invoke-virtual {v10, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 264
    :cond_69
    check-cast v8, Lfg/a;

    invoke-static {v2, v7, v8}, Le0/b;->a(ZZLfg/a;)Ly0/o;

    move-result-object v2

    .line 265
    sget-object v3, Lw/f;->a:Li0/u;

    .line 266
    invoke-virtual {v10, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf1/s;

    .line 267
    sget-object v7, Lw/f;->b:Li0/u;

    .line 268
    invoke-virtual {v10, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf1/w;

    .line 269
    iget-wide v7, v7, Lf1/w;->a:J

    const v9, 0x4dffeb3b    # 5.3670077E8f

    move-object/from16 v17, v14

    .line 270
    invoke-static {v9}, Lf1/c0;->c(I)J

    move-result-wide v13

    .line 271
    invoke-static {v7, v8, v13, v14}, Lf1/w;->c(JJ)Z

    move-result v9

    if-nez v9, :cond_6a

    .line 272
    new-instance v3, Lf1/t0;

    invoke-direct {v3, v7, v8}, Lf1/t0;-><init>(J)V

    .line 273
    :cond_6a
    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    .line 274
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_6b

    if-ne v8, v11, :cond_6c

    .line 275
    :cond_6b
    new-instance v8, Lm/b;

    const/16 v7, 0x16

    invoke-direct {v8, v1, v7, v3}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 276
    invoke-virtual {v10, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 277
    :cond_6c
    check-cast v8, Lfg/l;

    invoke-static {v12, v8}, Lc1/h;->f(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v3

    move-object/from16 v11, p2

    .line 278
    invoke-interface {v11, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v3

    .line 279
    invoke-static {v3, v5, v1, v4}, Lf0/q;->m(Ly0/o;Lf0/c;Lw/q0;Lh0/d1;)Ly0/o;

    move-result-object v3

    .line 280
    invoke-interface {v3, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    move-object/from16 v3, v55

    .line 281
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    .line 282
    new-instance v3, Li0/q0;

    move-object/from16 v13, v53

    const/4 v5, 0x3

    invoke-direct {v3, v13, v5, v1}, Li0/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v2, v3}, Lq1/d;->e(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v2

    .line 283
    new-instance v3, Li0/q0;

    const/4 v5, 0x2

    invoke-direct {v3, v1, v5, v4}, Li0/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v2, v3}, Lq1/d;->e(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v2

    .line 284
    invoke-interface {v2, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    .line 285
    new-instance v2, Lh0/f;

    move-object/from16 v3, v20

    const/4 v7, 0x1

    invoke-direct {v2, v3, v15, v7}, Lh0/f;-><init>(Ljava/lang/Object;ZI)V

    .line 286
    new-instance v5, Ly0/j;

    invoke-direct {v5, v2}, Ly0/j;-><init>(Lfg/q;)V

    invoke-interface {v0, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    move-object/from16 v14, v17

    .line 287
    invoke-interface {v0, v14}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    move-object/from16 v2, v56

    .line 288
    invoke-interface {v0, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    .line 289
    new-instance v2, Lw/w;

    const/4 v7, 0x0

    invoke-direct {v2, v1, v7}, Lw/w;-><init>(Lw/q0;I)V

    invoke-static {v0, v2}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v0

    .line 290
    new-instance v2, Lb0/q;

    move-object/from16 v8, v54

    const/4 v5, 0x6

    invoke-direct {v2, v4, v5, v8}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v0, v2}, Lc0/k;->a(Ly0/o;Lb0/q;)Ly0/o;

    move-result-object v0

    if-eqz v15, :cond_6d

    .line 291
    invoke-virtual {v1}, Lw/q0;->b()Z

    move-result v2

    if-eqz v2, :cond_6d

    .line 292
    iget-object v2, v1, Lw/q0;->q:Li0/j1;

    .line 293
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6d

    .line 294
    move-object/from16 v2, v26

    check-cast v2, Ly1/v1;

    .line 295
    iget-object v2, v2, Ly1/v1;->c:Li0/j1;

    .line 296
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6d

    const/4 v7, 0x1

    :cond_6d
    if-eqz v7, :cond_6f

    .line 297
    invoke-static {}, Lk/c1;->a()Z

    move-result v2

    if-nez v2, :cond_6e

    move-object v2, v12

    goto :goto_41

    .line 298
    :cond_6e
    new-instance v2, Lf0/h;

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5}, Lf0/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v12, v2}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    move-result-object v2

    :goto_41
    move-object v12, v2

    :cond_6f
    move-object v2, v0

    .line 299
    new-instance v0, Lw/x;

    move-object/from16 v8, p4

    move/from16 v5, p8

    move-object/from16 v57, v2

    move-object v14, v4

    move-object/from16 v17, v6

    move v15, v7

    move-object/from16 v18, v16

    move-object/from16 v11, v23

    move-object/from16 v13, v24

    move-object/from16 v9, v31

    move-object/from16 v10, v32

    move-object/from16 v7, p0

    move-object/from16 v16, p5

    move/from16 v4, p9

    move-object v2, v1

    move-object v6, v3

    move-object/from16 v3, p3

    move-object/from16 v1, p13

    invoke-direct/range {v0 .. v18}, Lw/x;-><init>(Lfg/q;Lw/q0;Li2/n0;IILw/j1;Ln2/s;Lj8/o;Ly0/o;Ly0/o;Ly0/o;Ly0/o;Lt/c;Lh0/d1;ZLfg/l;Lb5/k;Lu2/c;)V

    move-object v4, v14

    const v1, -0x308d4209

    move-object/from16 v6, p14

    invoke-static {v1, v0, v6}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    move-result-object v0

    const/16 v1, 0x180

    move-object/from16 v2, v57

    invoke-static {v2, v4, v0, v6, v1}, Lw/s;->g(Ly0/o;Lh0/d1;Ls0/d;Li0/h0;I)V

    goto :goto_42

    .line 300
    :cond_70
    const-string v0, "no recompose scope found"

    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    return-void

    .line 301
    :cond_71
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 302
    :goto_42
    invoke-virtual {v6}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_72

    move-object v1, v0

    new-instance v0, Lw/y;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v58, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lw/y;-><init>(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;II)V

    move-object/from16 v1, v58

    .line 303
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    :cond_72
    return-void
.end method

.method public static final g(Ly0/o;Lh0/d1;Ls0/d;Li0/h0;I)V
    .locals 8

    .line 1
    const v0, 0x795d8dec

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

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
    or-int/2addr v0, p4

    .line 17
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

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
    and-int/lit16 v1, v0, 0x93

    .line 30
    .line 31
    const/16 v2, 0x92

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
    and-int/lit8 v2, v0, 0x1

    .line 40
    .line 41
    invoke-virtual {p3, v2, v1}, Li0/h0;->S(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    sget-object v1, Ly0/b;->g:Ly0/g;

    .line 48
    .line 49
    invoke-static {v1, v3}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-wide v4, p3, Li0/h0;->T:J

    .line 54
    .line 55
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p3}, Li0/h0;->l()Ls0/h;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {p3, p0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 73
    .line 74
    invoke-virtual {p3}, Li0/h0;->d0()V

    .line 75
    .line 76
    .line 77
    iget-boolean v7, p3, Li0/h0;->S:Z

    .line 78
    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    invoke-virtual {p3, v6}, Li0/h0;->k(Lfg/a;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-virtual {p3}, Li0/h0;->n0()V

    .line 86
    .line 87
    .line 88
    :goto_3
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 89
    .line 90
    invoke-static {v6, p3, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 94
    .line 95
    invoke-static {v1, p3, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 103
    .line 104
    invoke-static {v2, p3, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 108
    .line 109
    invoke-static {v1, p3}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 113
    .line 114
    invoke-static {v1, p3, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    shr-int/lit8 v0, v0, 0x3

    .line 118
    .line 119
    and-int/lit8 v0, v0, 0x7e

    .line 120
    .line 121
    invoke-static {p1, p2, p3, v0}, Lw/s;->e(Lh0/d1;Ls0/d;Li0/h0;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 129
    .line 130
    .line 131
    :goto_4
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    if-eqz p3, :cond_5

    .line 136
    .line 137
    new-instance v0, Lb0/k;

    .line 138
    .line 139
    const/4 v5, 0x4

    .line 140
    move-object v1, p0

    .line 141
    move-object v2, p1

    .line 142
    move-object v3, p2

    .line 143
    move v4, p4

    .line 144
    invoke-direct/range {v0 .. v5}, Lb0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;II)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p3, Li0/r1;->d:Lfg/p;

    .line 148
    .line 149
    :cond_5
    return-void
.end method

.method public static final h(Ly0/o;Li2/g;Lfg/l;ZLi2/n0;Lm2/d;Lfg/l;Li0/h0;II)V
    .locals 25

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v7, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v0, p7

    .line 12
    .line 13
    move/from16 v1, p8

    .line 14
    .line 15
    move/from16 v5, p9

    .line 16
    .line 17
    const v8, -0x7e46da9f

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v8}, Li0/h0;->b0(I)Li0/h0;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v8, v1, 0x6

    .line 24
    .line 25
    if-nez v8, :cond_1

    .line 26
    .line 27
    move-object/from16 v8, p0

    .line 28
    .line 29
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    if-eqz v11, :cond_0

    .line 34
    .line 35
    const/4 v11, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v11, 0x2

    .line 38
    :goto_0
    or-int/2addr v11, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object/from16 v8, p0

    .line 41
    .line 42
    move v11, v1

    .line 43
    :goto_1
    and-int/lit8 v12, v1, 0x30

    .line 44
    .line 45
    const/16 v13, 0x10

    .line 46
    .line 47
    const/16 v14, 0x20

    .line 48
    .line 49
    if-nez v12, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    if-eqz v12, :cond_2

    .line 56
    .line 57
    move v12, v14

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v12, v13

    .line 60
    :goto_2
    or-int/2addr v11, v12

    .line 61
    :cond_3
    and-int/lit16 v12, v1, 0x180

    .line 62
    .line 63
    const/16 v15, 0x80

    .line 64
    .line 65
    if-nez v12, :cond_5

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-eqz v12, :cond_4

    .line 72
    .line 73
    const/16 v12, 0x100

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    move v12, v15

    .line 77
    :goto_3
    or-int/2addr v11, v12

    .line 78
    :cond_5
    and-int/lit16 v12, v1, 0xc00

    .line 79
    .line 80
    const/16 v17, 0x400

    .line 81
    .line 82
    const/16 v18, 0x800

    .line 83
    .line 84
    if-nez v12, :cond_7

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Li0/h0;->g(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-eqz v12, :cond_6

    .line 91
    .line 92
    move/from16 v12, v18

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    move/from16 v12, v17

    .line 96
    .line 97
    :goto_4
    or-int/2addr v11, v12

    .line 98
    :cond_7
    and-int/lit16 v12, v1, 0x6000

    .line 99
    .line 100
    const/16 v19, 0x2000

    .line 101
    .line 102
    const/16 v20, 0x4000

    .line 103
    .line 104
    if-nez v12, :cond_9

    .line 105
    .line 106
    sget-object v12, Ltf/u;->g:Ltf/u;

    .line 107
    .line 108
    invoke-virtual {v0, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_8

    .line 113
    .line 114
    move/from16 v12, v20

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    move/from16 v12, v19

    .line 118
    .line 119
    :goto_5
    or-int/2addr v11, v12

    .line 120
    :cond_9
    const/high16 v12, 0x30000

    .line 121
    .line 122
    and-int/2addr v12, v1

    .line 123
    if-nez v12, :cond_b

    .line 124
    .line 125
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-eqz v12, :cond_a

    .line 130
    .line 131
    const/high16 v12, 0x20000

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_a
    const/high16 v12, 0x10000

    .line 135
    .line 136
    :goto_6
    or-int/2addr v11, v12

    .line 137
    :cond_b
    const/high16 v12, 0x180000

    .line 138
    .line 139
    and-int/2addr v12, v1

    .line 140
    const/4 v10, 0x1

    .line 141
    if-nez v12, :cond_d

    .line 142
    .line 143
    invoke-virtual {v0, v10}, Li0/h0;->d(I)Z

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-eqz v12, :cond_c

    .line 148
    .line 149
    const/high16 v12, 0x100000

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_c
    const/high16 v12, 0x80000

    .line 153
    .line 154
    :goto_7
    or-int/2addr v11, v12

    .line 155
    :cond_d
    const/high16 v12, 0xc00000

    .line 156
    .line 157
    and-int/2addr v12, v1

    .line 158
    move/from16 v22, v10

    .line 159
    .line 160
    const/4 v10, 0x1

    .line 161
    if-nez v12, :cond_f

    .line 162
    .line 163
    invoke-virtual {v0, v10}, Li0/h0;->g(Z)Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_e

    .line 168
    .line 169
    const/high16 v12, 0x800000

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_e
    const/high16 v12, 0x400000

    .line 173
    .line 174
    :goto_8
    or-int/2addr v11, v12

    .line 175
    :cond_f
    const/high16 v12, 0x6000000

    .line 176
    .line 177
    and-int/2addr v12, v1

    .line 178
    move/from16 v23, v11

    .line 179
    .line 180
    const v11, 0x7fffffff

    .line 181
    .line 182
    .line 183
    if-nez v12, :cond_11

    .line 184
    .line 185
    invoke-virtual {v0, v11}, Li0/h0;->d(I)Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-eqz v12, :cond_10

    .line 190
    .line 191
    const/high16 v12, 0x4000000

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_10
    const/high16 v12, 0x2000000

    .line 195
    .line 196
    :goto_9
    or-int v12, v23, v12

    .line 197
    .line 198
    move/from16 v23, v12

    .line 199
    .line 200
    :cond_11
    const/high16 v12, 0x30000000

    .line 201
    .line 202
    and-int/2addr v12, v1

    .line 203
    move/from16 v24, v12

    .line 204
    .line 205
    const/4 v12, 0x1

    .line 206
    if-nez v24, :cond_13

    .line 207
    .line 208
    invoke-virtual {v0, v12}, Li0/h0;->d(I)Z

    .line 209
    .line 210
    .line 211
    move-result v24

    .line 212
    if-eqz v24, :cond_12

    .line 213
    .line 214
    const/high16 v24, 0x20000000

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_12
    const/high16 v24, 0x10000000

    .line 218
    .line 219
    :goto_a
    or-int v23, v23, v24

    .line 220
    .line 221
    :cond_13
    move/from16 v10, v23

    .line 222
    .line 223
    and-int/lit8 v23, v5, 0x6

    .line 224
    .line 225
    if-nez v23, :cond_15

    .line 226
    .line 227
    invoke-virtual {v0, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v23

    .line 231
    if-eqz v23, :cond_14

    .line 232
    .line 233
    const/16 v16, 0x4

    .line 234
    .line 235
    goto :goto_b

    .line 236
    :cond_14
    const/16 v16, 0x2

    .line 237
    .line 238
    :goto_b
    or-int v16, v5, v16

    .line 239
    .line 240
    goto :goto_c

    .line 241
    :cond_15
    move/from16 v16, v5

    .line 242
    .line 243
    :goto_c
    and-int/lit8 v21, v5, 0x30

    .line 244
    .line 245
    const/4 v11, 0x0

    .line 246
    if-nez v21, :cond_17

    .line 247
    .line 248
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v21

    .line 252
    if-eqz v21, :cond_16

    .line 253
    .line 254
    move v13, v14

    .line 255
    :cond_16
    or-int v16, v16, v13

    .line 256
    .line 257
    :cond_17
    and-int/lit16 v13, v5, 0x180

    .line 258
    .line 259
    if-nez v13, :cond_19

    .line 260
    .line 261
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    if-eqz v13, :cond_18

    .line 266
    .line 267
    const/16 v15, 0x100

    .line 268
    .line 269
    :cond_18
    or-int v16, v16, v15

    .line 270
    .line 271
    :cond_19
    and-int/lit16 v13, v5, 0xc00

    .line 272
    .line 273
    if-nez v13, :cond_1b

    .line 274
    .line 275
    move-object/from16 v13, p6

    .line 276
    .line 277
    invoke-virtual {v0, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    if-eqz v15, :cond_1a

    .line 282
    .line 283
    move/from16 v17, v18

    .line 284
    .line 285
    :cond_1a
    or-int v16, v16, v17

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_1b
    move-object/from16 v13, p6

    .line 289
    .line 290
    :goto_d
    and-int/lit16 v15, v5, 0x6000

    .line 291
    .line 292
    if-nez v15, :cond_1e

    .line 293
    .line 294
    const v15, 0x8000

    .line 295
    .line 296
    .line 297
    and-int/2addr v15, v5

    .line 298
    if-nez v15, :cond_1c

    .line 299
    .line 300
    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    goto :goto_e

    .line 305
    :cond_1c
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    :goto_e
    if-eqz v15, :cond_1d

    .line 310
    .line 311
    move/from16 v19, v20

    .line 312
    .line 313
    :cond_1d
    or-int v16, v16, v19

    .line 314
    .line 315
    :cond_1e
    move/from16 v15, v16

    .line 316
    .line 317
    const v16, 0x12492493

    .line 318
    .line 319
    .line 320
    and-int v12, v10, v16

    .line 321
    .line 322
    const v9, 0x12492492

    .line 323
    .line 324
    .line 325
    const/4 v11, 0x0

    .line 326
    if-ne v12, v9, :cond_20

    .line 327
    .line 328
    and-int/lit16 v9, v15, 0x2493

    .line 329
    .line 330
    const/16 v12, 0x2492

    .line 331
    .line 332
    if-eq v9, v12, :cond_1f

    .line 333
    .line 334
    goto :goto_f

    .line 335
    :cond_1f
    move v9, v11

    .line 336
    goto :goto_10

    .line 337
    :cond_20
    :goto_f
    const/4 v9, 0x1

    .line 338
    :goto_10
    and-int/lit8 v12, v10, 0x1

    .line 339
    .line 340
    invoke-virtual {v0, v12, v9}, Li0/h0;->S(IZ)Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-eqz v9, :cond_3f

    .line 345
    .line 346
    invoke-static {v2}, Lf8/i;->N(Li2/g;)Z

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    sget-object v12, Li0/l;->a:Li0/e;

    .line 351
    .line 352
    if-eqz v9, :cond_24

    .line 353
    .line 354
    const v9, 0x8ae5063

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v9}, Li0/h0;->a0(I)V

    .line 358
    .line 359
    .line 360
    and-int/lit8 v9, v10, 0x70

    .line 361
    .line 362
    if-ne v9, v14, :cond_21

    .line 363
    .line 364
    const/4 v9, 0x1

    .line 365
    goto :goto_11

    .line 366
    :cond_21
    move v9, v11

    .line 367
    :goto_11
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    if-nez v9, :cond_22

    .line 372
    .line 373
    if-ne v15, v12, :cond_23

    .line 374
    .line 375
    :cond_22
    new-instance v15, Lw/n1;

    .line 376
    .line 377
    invoke-direct {v15, v2}, Lw/n1;-><init>(Li2/g;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_23
    check-cast v15, Lw/n1;

    .line 384
    .line 385
    invoke-virtual {v0, v11}, Li0/h0;->p(Z)V

    .line 386
    .line 387
    .line 388
    move-object v9, v15

    .line 389
    goto :goto_12

    .line 390
    :cond_24
    const v9, 0x8af50dc

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v9}, Li0/h0;->a0(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v11}, Li0/h0;->p(Z)V

    .line 397
    .line 398
    .line 399
    const/4 v9, 0x0

    .line 400
    :goto_12
    invoke-static {v2}, Lf8/i;->N(Li2/g;)Z

    .line 401
    .line 402
    .line 403
    move-result v15

    .line 404
    if-eqz v15, :cond_28

    .line 405
    .line 406
    const v15, 0x8b25723

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v15}, Li0/h0;->a0(I)V

    .line 410
    .line 411
    .line 412
    and-int/lit8 v15, v10, 0x70

    .line 413
    .line 414
    if-ne v15, v14, :cond_25

    .line 415
    .line 416
    const/4 v14, 0x1

    .line 417
    goto :goto_13

    .line 418
    :cond_25
    move v14, v11

    .line 419
    :goto_13
    invoke-virtual {v0, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v15

    .line 423
    or-int/2addr v14, v15

    .line 424
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v15

    .line 428
    if-nez v14, :cond_26

    .line 429
    .line 430
    if-ne v15, v12, :cond_27

    .line 431
    .line 432
    :cond_26
    new-instance v15, Lsh/v1;

    .line 433
    .line 434
    const/4 v14, 0x3

    .line 435
    invoke-direct {v15, v9, v14, v2}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_27
    check-cast v15, Lfg/a;

    .line 442
    .line 443
    invoke-virtual {v0, v11}, Li0/h0;->p(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_15

    .line 447
    :cond_28
    const v15, 0x8b3d321

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v15}, Li0/h0;->a0(I)V

    .line 451
    .line 452
    .line 453
    and-int/lit8 v15, v10, 0x70

    .line 454
    .line 455
    if-ne v15, v14, :cond_29

    .line 456
    .line 457
    const/4 v14, 0x1

    .line 458
    goto :goto_14

    .line 459
    :cond_29
    move v14, v11

    .line 460
    :goto_14
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v15

    .line 464
    if-nez v14, :cond_2a

    .line 465
    .line 466
    if-ne v15, v12, :cond_2b

    .line 467
    .line 468
    :cond_2a
    new-instance v15, Lv0/a;

    .line 469
    .line 470
    const/4 v14, 0x3

    .line 471
    invoke-direct {v15, v2, v14}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_2b
    check-cast v15, Lfg/a;

    .line 478
    .line 479
    invoke-virtual {v0, v11}, Li0/h0;->p(Z)V

    .line 480
    .line 481
    .line 482
    :goto_15
    if-eqz v4, :cond_2c

    .line 483
    .line 484
    sget-object v14, Lw/d;->a:Lsf/e;

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    goto :goto_16

    .line 489
    :cond_2c
    new-instance v14, Lsf/e;

    .line 490
    .line 491
    const/4 v11, 0x0

    .line 492
    invoke-direct {v14, v11, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    move-object/from16 v18, v11

    .line 496
    .line 497
    :goto_16
    iget-object v11, v14, Lsf/e;->g:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v11, Ljava/util/List;

    .line 500
    .line 501
    iget-object v14, v14, Lsf/e;->h:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v14, Ljava/util/List;

    .line 504
    .line 505
    if-eqz v4, :cond_2e

    .line 506
    .line 507
    const v1, 0x8b8a5ec

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-ne v1, v12, :cond_2d

    .line 518
    .line 519
    invoke-static/range {v18 .. v18}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :cond_2d
    check-cast v1, Li0/a1;

    .line 527
    .line 528
    move-object/from16 v21, v1

    .line 529
    .line 530
    const/4 v1, 0x0

    .line 531
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v1, v21

    .line 535
    .line 536
    goto :goto_17

    .line 537
    :cond_2e
    const/4 v1, 0x0

    .line 538
    const v4, 0x8b9fcbc    # 1.11937E-33f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v4}, Li0/h0;->a0(I)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 545
    .line 546
    .line 547
    move-object/from16 v1, v18

    .line 548
    .line 549
    :goto_17
    if-eqz p3, :cond_31

    .line 550
    .line 551
    const v4, 0x8bb68fd

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v4}, Li0/h0;->a0(I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    move/from16 v18, v4

    .line 562
    .line 563
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    if-nez v18, :cond_2f

    .line 568
    .line 569
    if-ne v4, v12, :cond_30

    .line 570
    .line 571
    :cond_2f
    new-instance v4, Lb0/l;

    .line 572
    .line 573
    const/16 v5, 0xd

    .line 574
    .line 575
    invoke-direct {v4, v1, v5}, Lb0/l;-><init>(Li0/a1;I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    :cond_30
    check-cast v4, Lfg/l;

    .line 582
    .line 583
    const/4 v5, 0x0

    .line 584
    invoke-virtual {v0, v5}, Li0/h0;->p(Z)V

    .line 585
    .line 586
    .line 587
    move-object/from16 v18, v4

    .line 588
    .line 589
    goto :goto_18

    .line 590
    :cond_31
    const/4 v5, 0x0

    .line 591
    const v4, 0x8bc7ffc

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v4}, Li0/h0;->a0(I)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v5}, Li0/h0;->p(Z)V

    .line 598
    .line 599
    .line 600
    :goto_18
    shr-int/lit8 v4, v10, 0x3

    .line 601
    .line 602
    and-int/lit8 v4, v4, 0xe

    .line 603
    .line 604
    invoke-static {v2, v7, v6, v11, v0}, Lw/n;->a(Li2/g;Li2/n0;Lm2/d;Ljava/util/List;Li0/h0;)V

    .line 605
    .line 606
    .line 607
    invoke-interface {v15}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v15

    .line 611
    check-cast v15, Li2/g;

    .line 612
    .line 613
    invoke-virtual {v0, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v20

    .line 617
    and-int/lit16 v10, v10, 0x380

    .line 618
    .line 619
    const/16 v5, 0x100

    .line 620
    .line 621
    if-ne v10, v5, :cond_32

    .line 622
    .line 623
    const/4 v5, 0x1

    .line 624
    goto :goto_19

    .line 625
    :cond_32
    const/4 v5, 0x0

    .line 626
    :goto_19
    or-int v5, v20, v5

    .line 627
    .line 628
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    if-nez v5, :cond_33

    .line 633
    .line 634
    if-ne v10, v12, :cond_34

    .line 635
    .line 636
    :cond_33
    new-instance v10, Lw/k;

    .line 637
    .line 638
    const/4 v5, 0x0

    .line 639
    invoke-direct {v10, v9, v3, v5}, Lw/k;-><init>(Lw/n1;Lfg/l;I)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    :cond_34
    check-cast v10, Lfg/l;

    .line 646
    .line 647
    move-object v5, v8

    .line 648
    move-object v3, v9

    .line 649
    move-object v8, v10

    .line 650
    move-object v2, v12

    .line 651
    move-object/from16 v16, v13

    .line 652
    .line 653
    move-object/from16 v17, v14

    .line 654
    .line 655
    move/from16 v9, v22

    .line 656
    .line 657
    const/4 v10, 0x1

    .line 658
    const/4 v12, 0x1

    .line 659
    move-object v13, v6

    .line 660
    move-object v14, v11

    .line 661
    move-object v6, v15

    .line 662
    move-object/from16 v15, v18

    .line 663
    .line 664
    const v11, 0x7fffffff

    .line 665
    .line 666
    .line 667
    move/from16 v18, v4

    .line 668
    .line 669
    const/4 v4, 0x0

    .line 670
    invoke-static/range {v5 .. v16}, Lw/s;->z(Ly0/o;Li2/g;Li2/n0;Lfg/l;IZIILm2/d;Ljava/util/List;Lfg/l;Lfg/l;)Ly0/o;

    .line 671
    .line 672
    .line 673
    move-result-object v6

    .line 674
    if-nez p3, :cond_37

    .line 675
    .line 676
    const v1, 0x8ce8017

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v5

    .line 690
    if-nez v1, :cond_35

    .line 691
    .line 692
    if-ne v5, v2, :cond_36

    .line 693
    .line 694
    :cond_35
    new-instance v5, Lw/l;

    .line 695
    .line 696
    const/4 v1, 0x0

    .line 697
    invoke-direct {v5, v3, v1}, Lw/l;-><init>(Lw/n1;I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    :cond_36
    check-cast v5, Lfg/a;

    .line 704
    .line 705
    new-instance v1, Lw/s0;

    .line 706
    .line 707
    invoke-direct {v1, v5}, Lw/s0;-><init>(Lfg/a;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v4}, Li0/h0;->p(Z)V

    .line 711
    .line 712
    .line 713
    goto :goto_1a

    .line 714
    :cond_37
    const v5, 0x8d13291

    .line 715
    .line 716
    .line 717
    invoke-virtual {v0, v5}, Li0/h0;->a0(I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v7

    .line 728
    if-nez v5, :cond_38

    .line 729
    .line 730
    if-ne v7, v2, :cond_39

    .line 731
    .line 732
    :cond_38
    new-instance v7, Lw/l;

    .line 733
    .line 734
    const/4 v5, 0x1

    .line 735
    invoke-direct {v7, v3, v5}, Lw/l;-><init>(Lw/n1;I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    :cond_39
    check-cast v7, Lfg/a;

    .line 742
    .line 743
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    if-nez v5, :cond_3a

    .line 752
    .line 753
    if-ne v8, v2, :cond_3b

    .line 754
    .line 755
    :cond_3a
    new-instance v8, Lb0/j;

    .line 756
    .line 757
    const/16 v2, 0xe

    .line 758
    .line 759
    invoke-direct {v8, v1, v2}, Lb0/j;-><init>(Li0/a1;I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    :cond_3b
    check-cast v8, Lfg/a;

    .line 766
    .line 767
    new-instance v1, Lw/o1;

    .line 768
    .line 769
    const/4 v2, 0x0

    .line 770
    invoke-direct {v1, v7, v2, v8}, Lw/o1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v0, v4}, Li0/h0;->p(Z)V

    .line 774
    .line 775
    .line 776
    :goto_1a
    iget-wide v7, v0, Li0/h0;->T:J

    .line 777
    .line 778
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    invoke-static {v0, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 787
    .line 788
    .line 789
    move-result-object v6

    .line 790
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 791
    .line 792
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 796
    .line 797
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 798
    .line 799
    .line 800
    iget-boolean v8, v0, Li0/h0;->S:Z

    .line 801
    .line 802
    if-eqz v8, :cond_3c

    .line 803
    .line 804
    invoke-virtual {v0, v7}, Li0/h0;->k(Lfg/a;)V

    .line 805
    .line 806
    .line 807
    goto :goto_1b

    .line 808
    :cond_3c
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 809
    .line 810
    .line 811
    :goto_1b
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 812
    .line 813
    invoke-static {v7, v0, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 817
    .line 818
    invoke-static {v1, v0, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 826
    .line 827
    invoke-static {v2, v0, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 831
    .line 832
    invoke-static {v1, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 833
    .line 834
    .line 835
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 836
    .line 837
    invoke-static {v1, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    if-nez v3, :cond_3d

    .line 841
    .line 842
    const v1, -0x19d78e09

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 846
    .line 847
    .line 848
    :goto_1c
    invoke-virtual {v0, v4}, Li0/h0;->p(Z)V

    .line 849
    .line 850
    .line 851
    goto :goto_1d

    .line 852
    :cond_3d
    const v1, -0x115988b6

    .line 853
    .line 854
    .line 855
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v3, v0, v4}, Lw/n1;->a(Li0/h0;I)V

    .line 859
    .line 860
    .line 861
    goto :goto_1c

    .line 862
    :goto_1d
    if-nez v17, :cond_3e

    .line 863
    .line 864
    const v1, -0x19d6c7af

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v4}, Li0/h0;->p(Z)V

    .line 871
    .line 872
    .line 873
    move-object/from16 v2, p1

    .line 874
    .line 875
    :goto_1e
    const/4 v1, 0x1

    .line 876
    goto :goto_1f

    .line 877
    :cond_3e
    const v1, -0x19d6c7ae

    .line 878
    .line 879
    .line 880
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 881
    .line 882
    .line 883
    move-object/from16 v2, p1

    .line 884
    .line 885
    move-object/from16 v14, v17

    .line 886
    .line 887
    move/from16 v1, v18

    .line 888
    .line 889
    invoke-static {v2, v14, v0, v1}, Lw/d;->a(Li2/g;Ljava/util/List;Li0/h0;I)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0, v4}, Li0/h0;->p(Z)V

    .line 893
    .line 894
    .line 895
    goto :goto_1e

    .line 896
    :goto_1f
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 897
    .line 898
    .line 899
    goto :goto_20

    .line 900
    :cond_3f
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 901
    .line 902
    .line 903
    :goto_20
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 904
    .line 905
    .line 906
    move-result-object v10

    .line 907
    if-eqz v10, :cond_40

    .line 908
    .line 909
    new-instance v0, Lw/m;

    .line 910
    .line 911
    move-object/from16 v1, p0

    .line 912
    .line 913
    move-object/from16 v3, p2

    .line 914
    .line 915
    move/from16 v4, p3

    .line 916
    .line 917
    move-object/from16 v5, p4

    .line 918
    .line 919
    move-object/from16 v6, p5

    .line 920
    .line 921
    move-object/from16 v7, p6

    .line 922
    .line 923
    move/from16 v8, p8

    .line 924
    .line 925
    move/from16 v9, p9

    .line 926
    .line 927
    invoke-direct/range {v0 .. v9}, Lw/m;-><init>(Ly0/o;Li2/g;Lfg/l;ZLi2/n0;Lm2/d;Lfg/l;II)V

    .line 928
    .line 929
    .line 930
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 931
    .line 932
    :cond_40
    return-void
.end method

.method public static final i(Lh0/d1;ZLi0/h0;I)V
    .locals 11

    .line 1
    const v0, 0x25552d88

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

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
    invoke-virtual {p2, p1}, Li0/h0;->g(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v1, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v1

    .line 30
    and-int/lit8 v1, v0, 0x13

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    move v1, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v1, v5

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_d

    .line 48
    .line 49
    if-eqz p1, :cond_c

    .line 50
    .line 51
    const v1, 0x5b336eec

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lh0/d1;->d:Lw/q0;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {v3}, Lw/q0;->d()Lw/m1;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    iget-object v3, v3, Lw/m1;->a:Li2/k0;

    .line 69
    .line 70
    iget-object v7, p0, Lh0/d1;->d:Lw/q0;

    .line 71
    .line 72
    if-eqz v7, :cond_3

    .line 73
    .line 74
    iget-boolean v7, v7, Lw/q0;->p:Z

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move v7, v4

    .line 78
    :goto_3
    if-nez v7, :cond_4

    .line 79
    .line 80
    move-object v6, v3

    .line 81
    :cond_4
    if-nez v6, :cond_5

    .line 82
    .line 83
    const v0, 0x5b336eeb

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_5
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-wide v7, v1, Ln2/s;->b:J

    .line 102
    .line 103
    invoke-static {v7, v8}, Li2/m0;->c(J)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_8

    .line 108
    .line 109
    const v1, 0x7dc11ac6

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lh0/d1;->b:Lb5/k;

    .line 116
    .line 117
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget-wide v7, v3, Ln2/s;->b:J

    .line 122
    .line 123
    shr-long v2, v7, v2

    .line 124
    .line 125
    long-to-int v2, v2

    .line 126
    invoke-virtual {v1, v2}, Lb5/k;->l(I)I

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lh0/d1;->b:Lb5/k;

    .line 130
    .line 131
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-wide v7, v3, Ln2/s;->b:J

    .line 136
    .line 137
    const-wide v9, 0xffffffffL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    and-long/2addr v7, v9

    .line 143
    long-to-int v3, v7

    .line 144
    invoke-virtual {v1, v3}, Lb5/k;->l(I)I

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v2}, Li2/k0;->a(I)Lt2/j;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    sub-int/2addr v3, v4

    .line 152
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v6, v2}, Li2/k0;->a(I)Lt2/j;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v3, p0, Lh0/d1;->d:Lw/q0;

    .line 161
    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    iget-object v3, v3, Lw/q0;->m:Li0/j1;

    .line 165
    .line 166
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-ne v3, v4, :cond_6

    .line 177
    .line 178
    const v3, 0x7dc77b9a

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v3}, Li0/h0;->a0(I)V

    .line 182
    .line 183
    .line 184
    shl-int/lit8 v3, v0, 0x6

    .line 185
    .line 186
    and-int/lit16 v3, v3, 0x380

    .line 187
    .line 188
    or-int/lit8 v3, v3, 0x6

    .line 189
    .line 190
    invoke-static {v4, v1, p0, p2, v3}, Lf8/i;->a(ZLt2/j;Lh0/d1;Li0/h0;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    const v1, 0x7dcb87ae

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 204
    .line 205
    .line 206
    :goto_4
    iget-object v1, p0, Lh0/d1;->d:Lw/q0;

    .line 207
    .line 208
    if-eqz v1, :cond_7

    .line 209
    .line 210
    iget-object v1, v1, Lw/q0;->n:Li0/j1;

    .line 211
    .line 212
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-ne v1, v4, :cond_7

    .line 223
    .line 224
    const v1, 0x7dcccf7b

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 228
    .line 229
    .line 230
    shl-int/lit8 v0, v0, 0x6

    .line 231
    .line 232
    and-int/lit16 v0, v0, 0x380

    .line 233
    .line 234
    or-int/lit8 v0, v0, 0x6

    .line 235
    .line 236
    invoke-static {v5, v2, p0, p2, v0}, Lf8/i;->a(ZLt2/j;Lh0/d1;Li0/h0;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_7
    const v0, 0x7dd0d7ce    # 3.4699993E37f

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 250
    .line 251
    .line 252
    :goto_5
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_8
    const v0, 0x7dd12d0e

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 263
    .line 264
    .line 265
    :goto_6
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 266
    .line 267
    if-eqz v0, :cond_b

    .line 268
    .line 269
    iget-object v1, v0, Lw/q0;->l:Li0/j1;

    .line 270
    .line 271
    iget-object v2, p0, Lh0/d1;->t:Ln2/s;

    .line 272
    .line 273
    iget-object v2, v2, Ln2/s;->a:Li2/g;

    .line 274
    .line 275
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iget-object v3, v3, Ln2/s;->a:Li2/g;

    .line 282
    .line 283
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 284
    .line 285
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-nez v2, :cond_9

    .line 290
    .line 291
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_9
    invoke-virtual {v0}, Lw/q0;->b()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_b

    .line 301
    .line 302
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_a

    .line 313
    .line 314
    invoke-virtual {p0}, Lh0/d1;->r()V

    .line 315
    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_a
    invoke-virtual {p0}, Lh0/d1;->o()V

    .line 319
    .line 320
    .line 321
    :cond_b
    :goto_7
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 322
    .line 323
    .line 324
    :goto_8
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_c
    const v0, 0x768ee72a

    .line 329
    .line 330
    .line 331
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lh0/d1;->o()V

    .line 338
    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 342
    .line 343
    .line 344
    :goto_9
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    if-eqz p2, :cond_e

    .line 349
    .line 350
    new-instance v0, Lw/v;

    .line 351
    .line 352
    invoke-direct {v0, p0, p1, p3}, Lw/v;-><init>(Lh0/d1;ZI)V

    .line 353
    .line 354
    .line 355
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 356
    .line 357
    :cond_e
    return-void
.end method

.method public static final j(Lh0/d1;Li0/h0;I)V
    .locals 11

    .line 1
    const v0, -0x5597ad88

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v2, v6

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p1, v0, v2}, Li0/h0;->S(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_c

    .line 33
    .line 34
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 35
    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v0, v0, Lw/q0;->o:Li0/j1;

    .line 39
    .line 40
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v3, :cond_b

    .line 51
    .line 52
    invoke-virtual {p0}, Lh0/d1;->m()Li2/g;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_b

    .line 57
    .line 58
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_b

    .line 65
    .line 66
    const v0, -0x7de7ecc8

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    sget-object v5, Li0/l;->a:Li0/e;

    .line 81
    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    if-ne v2, v5, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v2, Lh0/y0;

    .line 87
    .line 88
    invoke-direct {v2, p0}, Lh0/y0;-><init>(Lh0/d1;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v2, Lw/y0;

    .line 95
    .line 96
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lu2/c;

    .line 103
    .line 104
    iget-object v7, p0, Lh0/d1;->b:Lb5/k;

    .line 105
    .line 106
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iget-wide v8, v8, Ln2/s;->b:J

    .line 111
    .line 112
    sget v10, Li2/m0;->c:I

    .line 113
    .line 114
    const/16 v10, 0x20

    .line 115
    .line 116
    shr-long/2addr v8, v10

    .line 117
    long-to-int v8, v8

    .line 118
    invoke-virtual {v7, v8}, Lb5/k;->l(I)I

    .line 119
    .line 120
    .line 121
    iget-object v7, p0, Lh0/d1;->d:Lw/q0;

    .line 122
    .line 123
    if-eqz v7, :cond_4

    .line 124
    .line 125
    invoke-virtual {v7}, Lw/q0;->d()Lw/m1;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    const/4 v7, 0x0

    .line 131
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v7, v7, Lw/m1;->a:Li2/k0;

    .line 135
    .line 136
    iget-object v9, v7, Li2/k0;->a:Li2/j0;

    .line 137
    .line 138
    iget-object v9, v9, Li2/j0;->a:Li2/g;

    .line 139
    .line 140
    iget-object v9, v9, Li2/g;->h:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    invoke-static {v8, v6, v9}, Lr9/e0;->r(III)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v7, v8}, Li2/k0;->c(I)Le1/c;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    iget v8, v7, Le1/c;->a:F

    .line 155
    .line 156
    sget v9, Lw/z0;->a:F

    .line 157
    .line 158
    invoke-interface {v0, v9}, Lu2/c;->x0(F)F

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    int-to-float v1, v1

    .line 163
    div-float/2addr v0, v1

    .line 164
    add-float/2addr v0, v8

    .line 165
    iget v1, v7, Le1/c;->d:F

    .line 166
    .line 167
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-long v7, v0

    .line 172
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    int-to-long v0, v0

    .line 177
    shl-long/2addr v7, v10

    .line 178
    const-wide v9, 0xffffffffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    and-long/2addr v0, v9

    .line 184
    or-long/2addr v0, v7

    .line 185
    invoke-virtual {p1, v0, v1}, Li0/h0;->e(J)Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    if-nez v7, :cond_5

    .line 194
    .line 195
    if-ne v8, v5, :cond_6

    .line 196
    .line 197
    :cond_5
    new-instance v8, Lw/c0;

    .line 198
    .line 199
    invoke-direct {v8, v0, v1}, Lw/c0;-><init>(J)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_6
    check-cast v8, Lh0/l;

    .line 206
    .line 207
    invoke-virtual {p1, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    invoke-virtual {p1, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    or-int/2addr v7, v9

    .line 216
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    if-nez v7, :cond_7

    .line 221
    .line 222
    if-ne v9, v5, :cond_8

    .line 223
    .line 224
    :cond_7
    new-instance v9, Lw/q;

    .line 225
    .line 226
    invoke-direct {v9, v2, v3, p0}, Lw/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 233
    .line 234
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 235
    .line 236
    invoke-static {v3, v2, v9}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {p1, v0, v1}, Li0/h0;->e(J)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    if-nez v3, :cond_9

    .line 249
    .line 250
    if-ne v7, v5, :cond_a

    .line 251
    .line 252
    :cond_9
    new-instance v7, Lca/c;

    .line 253
    .line 254
    const/16 v3, 0x10

    .line 255
    .line 256
    invoke-direct {v7, v0, v1, v3}, Lca/c;-><init>(JI)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_a
    check-cast v7, Lfg/l;

    .line 263
    .line 264
    invoke-static {v2, v7}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-wide/16 v2, 0x0

    .line 269
    .line 270
    const/4 v5, 0x0

    .line 271
    move-object v4, p1

    .line 272
    move-object v0, v8

    .line 273
    invoke-static/range {v0 .. v5}, Lw/b;->a(Lh0/l;Ly0/o;JLi0/h0;I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v6}, Li0/h0;->p(Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_b
    const v0, -0x7dd3f3f6

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, v6}, Li0/h0;->p(Z)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_c
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 291
    .line 292
    .line 293
    :goto_3
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-eqz v0, :cond_d

    .line 298
    .line 299
    new-instance v1, Lb0/t;

    .line 300
    .line 301
    const/16 v2, 0x16

    .line 302
    .line 303
    invoke-direct {v1, p2, v2, p0}, Lb0/t;-><init>(IILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 307
    .line 308
    :cond_d
    return-void
.end method

.method public static final k(Lv1/a1;ILn2/z;Li2/k0;ZI)Le1/c;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p2, p2, Ln2/z;->b:Lb5/k;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lb5/k;->l(I)I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, p1}, Li2/k0;->c(I)Le1/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Le1/c;->e:Le1/c;

    .line 14
    .line 15
    :goto_0
    iget p2, p1, Le1/c;->a:F

    .line 16
    .line 17
    sget p3, Lw/z0;->a:F

    .line 18
    .line 19
    invoke-interface {p0, p3}, Lu2/c;->G0(F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    int-to-float p3, p5

    .line 26
    sub-float/2addr p3, p2

    .line 27
    int-to-float v0, p0

    .line 28
    sub-float/2addr p3, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move p3, p2

    .line 31
    :goto_1
    if-eqz p4, :cond_2

    .line 32
    .line 33
    int-to-float p0, p5

    .line 34
    sub-float/2addr p0, p2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    int-to-float p0, p0

    .line 37
    add-float/2addr p0, p2

    .line 38
    :goto_2
    iget p2, p1, Le1/c;->b:F

    .line 39
    .line 40
    iget p1, p1, Le1/c;->d:F

    .line 41
    .line 42
    new-instance p4, Le1/c;

    .line 43
    .line 44
    invoke-direct {p4, p3, p2, p0, p1}, Le1/c;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    return-object p4
.end method

.method public static final l(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 p1, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, p1

    .line 8
    long-to-int p1, v0

    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static final m(Ljava/util/List;Lfg/a;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    if-ge v2, v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lv1/m0;

    .line 35
    .line 36
    invoke-interface {v3}, Lv1/m0;->X()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v4, Lw/p1;

    .line 44
    .line 45
    iget-object v4, v4, Lw/p1;->a:Le9/a;

    .line 46
    .line 47
    iget-object v5, v4, Le9/a;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Lw/n1;

    .line 50
    .line 51
    iget-object v4, v4, Le9/a;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Li2/e;

    .line 54
    .line 55
    iget-object v5, v5, Lw/n1;->a:Li0/j1;

    .line 56
    .line 57
    invoke-virtual {v5}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Li2/k0;

    .line 62
    .line 63
    if-nez v5, :cond_0

    .line 64
    .line 65
    new-instance v4, Lk/s1;

    .line 66
    .line 67
    const/16 v5, 0x13

    .line 68
    .line 69
    invoke-direct {v4, v5}, Lk/s1;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Li/u1;

    .line 73
    .line 74
    invoke-direct {v5, v1, v1, v4}, Li/u1;-><init>(IILfg/a;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    invoke-static {v4, v5}, Lw/n1;->c(Li2/e;Li2/k0;)Li2/e;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v4, :cond_1

    .line 83
    .line 84
    new-instance v4, Lk/s1;

    .line 85
    .line 86
    const/16 v5, 0x14

    .line 87
    .line 88
    invoke-direct {v4, v5}, Lk/s1;-><init>(I)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Li/u1;

    .line 92
    .line 93
    invoke-direct {v5, v1, v1, v4}, Li/u1;-><init>(IILfg/a;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget v6, v4, Li2/e;->b:I

    .line 98
    .line 99
    iget v4, v4, Li2/e;->c:I

    .line 100
    .line 101
    invoke-virtual {v5, v6, v4}, Li2/k0;->i(II)Lf1/j;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Lf1/j;->e()Le1/c;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v4}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget v5, v4, Lu2/k;->c:I

    .line 114
    .line 115
    iget v6, v4, Lu2/k;->a:I

    .line 116
    .line 117
    sub-int/2addr v5, v6

    .line 118
    invoke-virtual {v4}, Lu2/k;->a()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    new-instance v7, Lv0/a;

    .line 123
    .line 124
    const/4 v8, 0x6

    .line 125
    invoke-direct {v7, v4, v8}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    new-instance v4, Li/u1;

    .line 129
    .line 130
    invoke-direct {v4, v5, v6, v7}, Li/u1;-><init>(IILfg/a;)V

    .line 131
    .line 132
    .line 133
    move-object v5, v4

    .line 134
    :goto_1
    iget v4, v5, Li/u1;->g:I

    .line 135
    .line 136
    iget v6, v5, Li/u1;->h:I

    .line 137
    .line 138
    invoke-static {v4, v4, v6, v6}, Lf8/i;->u(IIII)J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    invoke-interface {v3, v6, v7}, Lv1/m0;->Q(J)Lv1/b1;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-instance v4, Lsf/e;

    .line 147
    .line 148
    iget-object v5, v5, Li/u1;->i:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v5, Lfg/a;

    .line 151
    .line 152
    invoke-direct {v4, v3, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_2
    return-object p1

    .line 163
    :cond_3
    const/4 p0, 0x0

    .line 164
    return-object p0
.end method

.method public static final n(F)I
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    double-to-float p0, v0

    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final o(Lw/q0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lw/q0;->e:Ln2/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Lw/q0;->d:Lb/e;

    .line 7
    .line 8
    iget-object v3, p0, Lw/q0;->v:Lw/w;

    .line 9
    .line 10
    iget-object v2, v2, Lb/e;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ln2/s;

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    const/4 v6, 0x3

    .line 17
    invoke-static {v2, v1, v4, v5, v6}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v3, v2}, Lw/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Ln2/y;->a:Ln2/t;

    .line 25
    .line 26
    iget-object v3, v2, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    iget-object v0, v2, Ln2/t;->a:Ln2/n;

    .line 35
    .line 36
    invoke-interface {v0}, Ln2/n;->d()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eq v4, v0, :cond_0

    .line 45
    .line 46
    :cond_2
    :goto_0
    iput-object v1, p0, Lw/q0;->e:Ln2/y;

    .line 47
    .line 48
    return-void
.end method

.method public static final p(Lj8/o;Li2/g;)Ln2/z;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Li2/g;->h:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    iget-object v0, p1, Li2/g;->h:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x64

    .line 17
    .line 18
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    move v5, v4

    .line 24
    :goto_0
    if-ge v5, v3, :cond_0

    .line 25
    .line 26
    invoke-static {v5, v1, v5}, Lw/s;->B(III)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {p0, v1, p0}, Lw/s;->B(III)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_1
    if-ge v4, v2, :cond_1

    .line 40
    .line 41
    invoke-static {v4, p0, v4}, Lw/s;->C(III)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {v1, p0, v1}, Lw/s;->C(III)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Ln2/z;

    .line 51
    .line 52
    new-instance v1, Lb5/k;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v3, 0x5

    .line 63
    invoke-direct {v1, v2, v0, v3}, Lb5/k;-><init>(III)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Ln2/z;-><init>(Li2/g;Lb5/k;)V

    .line 67
    .line 68
    .line 69
    return-object p0
.end method

.method public static final q(ILjava/lang/String;)I
    .locals 11

    .line 1
    invoke-static {}, Lw/s;->u()Ll3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {v0}, Ll3/i;->c()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    if-eqz v4, :cond_5

    .line 19
    .line 20
    const-string v2, "charSequence cannot be null"

    .line 21
    .line 22
    invoke-static {p1, v2}, Lac/p;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Ll3/i;->e:Ll3/f;

    .line 26
    .line 27
    iget-object v4, v0, Ll3/f;->b:Lb5/c;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v0, -0x1

    .line 33
    if-ltz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-lt p0, v2, :cond_2

    .line 40
    .line 41
    :cond_1
    move-object v5, p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    instance-of v2, p1, Landroid/text/Spanned;

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    check-cast v2, Landroid/text/Spanned;

    .line 49
    .line 50
    add-int/lit8 v5, p0, 0x1

    .line 51
    .line 52
    const-class v6, Ll3/v;

    .line 53
    .line 54
    invoke-interface {v2, p0, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, [Ll3/v;

    .line 59
    .line 60
    array-length v6, v5

    .line 61
    if-lez v6, :cond_3

    .line 62
    .line 63
    aget-object v3, v5, v3

    .line 64
    .line 65
    invoke-interface {v2, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    move-object v5, p1

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    add-int/lit8 v2, p0, -0x10

    .line 72
    .line 73
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    add-int/lit8 v3, p0, 0x10

    .line 82
    .line 83
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    new-instance v10, Ll3/p;

    .line 88
    .line 89
    invoke-direct {v10, p0}, Ll3/p;-><init>(I)V

    .line 90
    .line 91
    .line 92
    const v8, 0x7fffffff

    .line 93
    .line 94
    .line 95
    const/4 v9, 0x1

    .line 96
    move-object v5, p1

    .line 97
    invoke-virtual/range {v4 .. v10}, Lb5/c;->G(Ljava/lang/CharSequence;IIIZLl3/o;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ll3/p;

    .line 102
    .line 103
    iget v2, p1, Ll3/p;->i:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :goto_1
    move v2, v0

    .line 107
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne v2, v0, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move-object v1, p1

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    const-string p0, "Not initialized yet"

    .line 117
    .line 118
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return p0

    .line 123
    :cond_6
    move-object v5, p1

    .line 124
    :goto_3
    if-eqz v1, :cond_7

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    return p0

    .line 131
    :cond_7
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1, v5}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/text/BreakIterator;->following(I)I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    return p0
.end method

.method public static final r(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static final s(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    :goto_0
    if-lez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final t(ILjava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {}, Lw/s;->u()Ll3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    add-int/lit8 v2, p0, -0x1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, p1, v2}, Ll3/i;->b(Ljava/lang/CharSequence;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, -0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v0

    .line 32
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->preceding(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public static final u()Ll3/i;
    .locals 3

    .line 1
    invoke-static {}, Ll3/i;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ll3/i;->a()Ll3/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ll3/i;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public static final v(Landroid/view/KeyEvent;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isAltPressed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isMetaPressed()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    or-int/2addr v0, v1

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v3

    .line 29
    :goto_1
    or-int/2addr v0, v1

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    :cond_2
    or-int p0, v0, v3

    .line 35
    .line 36
    return p0
.end method

.method public static final w(Lw/q0;Ln2/s;Lb5/k;)V
    .locals 11

    .line 1
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lw0/f;->e()Lfg/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    move-object v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-static {v1}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lw/q0;->d()Lw/m1;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    iget-object v8, p0, Lw/q0;->e:Ln2/y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    if-nez v8, :cond_2

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lw/q0;->c()Lv1/t;

    .line 38
    .line 39
    .line 40
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    if-nez v7, :cond_3

    .line 42
    .line 43
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :try_start_3
    iget-object v5, p0, Lw/q0;->a:Lw/x0;

    .line 48
    .line 49
    iget-object v6, v0, Lw/m1;->a:Li2/k0;

    .line 50
    .line 51
    invoke-virtual {p0}, Lw/q0;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    move-object v4, p1

    .line 56
    move-object v10, p2

    .line 57
    invoke-static/range {v4 .. v10}, Lw/s;->x(Ln2/s;Lw/x0;Li2/k0;Lv1/t;Ln2/y;ZLb5/k;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public static x(Ln2/s;Lw/x0;Li2/k0;Lv1/t;Ln2/y;ZLb5/k;)V
    .locals 5

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    iget-wide v0, p0, Ln2/s;->b:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Li2/m0;->e(J)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p6, p0}, Lb5/k;->l(I)I

    .line 12
    .line 13
    .line 14
    sget-object p5, Lw/a1;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p5, p2, Li2/k0;->a:Li2/j0;

    .line 17
    .line 18
    iget-object p5, p5, Li2/j0;->a:Li2/g;

    .line 19
    .line 20
    iget-object p5, p5, Li2/g;->h:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    const-wide v0, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-ge p0, p5, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2, p0}, Li2/k0;->b(I)Le1/c;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-eqz p0, :cond_2

    .line 39
    .line 40
    add-int/lit8 p0, p0, -0x1

    .line 41
    .line 42
    invoke-virtual {p2, p0}, Li2/k0;->b(I)Le1/c;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p1, Lw/x0;->b:Li2/n0;

    .line 48
    .line 49
    iget-object p2, p1, Lw/x0;->g:Lu2/c;

    .line 50
    .line 51
    iget-object p1, p1, Lw/x0;->h:Lm2/d;

    .line 52
    .line 53
    invoke-static {p0, p2, p1}, Lw/a1;->b(Li2/n0;Lu2/c;Lm2/d;)J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    new-instance p2, Le1/c;

    .line 58
    .line 59
    and-long/2addr p0, v0

    .line 60
    long-to-int p0, p0

    .line 61
    int-to-float p0, p0

    .line 62
    const/4 p1, 0x0

    .line 63
    const/high16 p5, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-direct {p2, p1, p1, p5, p0}, Le1/c;-><init>(FFFF)V

    .line 66
    .line 67
    .line 68
    move-object p0, p2

    .line 69
    :goto_0
    iget p1, p0, Le1/c;->b:F

    .line 70
    .line 71
    iget p2, p0, Le1/c;->a:F

    .line 72
    .line 73
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    int-to-long p5, p5

    .line 78
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-long v2, v2

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    shl-long/2addr p5, v4

    .line 86
    and-long/2addr v2, v0

    .line 87
    or-long/2addr p5, v2

    .line 88
    invoke-interface {p3, p5, p6}, Lv1/t;->m0(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide p5

    .line 92
    shr-long v2, p5, v4

    .line 93
    .line 94
    long-to-int p3, v2

    .line 95
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    and-long/2addr p5, v0

    .line 100
    long-to-int p5, p5

    .line 101
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result p5

    .line 105
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    int-to-long v2, p3

    .line 110
    invoke-static {p5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    int-to-long p5, p3

    .line 115
    shl-long/2addr v2, v4

    .line 116
    and-long/2addr p5, v0

    .line 117
    or-long/2addr p5, v2

    .line 118
    iget p3, p0, Le1/c;->c:F

    .line 119
    .line 120
    sub-float/2addr p3, p2

    .line 121
    iget p0, p0, Le1/c;->d:F

    .line 122
    .line 123
    sub-float/2addr p0, p1

    .line 124
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    int-to-long p1, p1

    .line 129
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    int-to-long v2, p0

    .line 134
    shl-long p0, p1, v4

    .line 135
    .line 136
    and-long p2, v2, v0

    .line 137
    .line 138
    or-long/2addr p0, p2

    .line 139
    invoke-static {p5, p6, p0, p1}, Lac/p;->a(JJ)Le1/c;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p1, p4, Ln2/y;->a:Ln2/t;

    .line 144
    .line 145
    iget-object p1, p1, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ln2/y;

    .line 152
    .line 153
    invoke-static {p1, p4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_3

    .line 158
    .line 159
    iget-object p1, p4, Ln2/y;->b:Ln2/n;

    .line 160
    .line 161
    invoke-interface {p1, p0}, Ln2/n;->h(Le1/c;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    :goto_1
    return-void
.end method

.method public static final y(Ln2/t;Lw/q0;Ln2/s;Ln2/j;Lb5/k;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lw/q0;->d:Lb/e;

    .line 2
    .line 3
    iget-object v1, p1, Lw/q0;->v:Lw/w;

    .line 4
    .line 5
    iget-object v2, p1, Lw/q0;->w:Lw/w;

    .line 6
    .line 7
    new-instance v3, Lgg/u;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Lb0/s;

    .line 13
    .line 14
    const/16 v5, 0x17

    .line 15
    .line 16
    invoke-direct {v4, v0, v1, v3, v5}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ln2/t;->a:Ln2/n;

    .line 20
    .line 21
    invoke-interface {v0, p2, p3, v4, v2}, Ln2/n;->a(Ln2/s;Ln2/j;Lb0/s;Lw/w;)V

    .line 22
    .line 23
    .line 24
    new-instance p3, Ln2/y;

    .line 25
    .line 26
    invoke-direct {p3, p0, v0}, Ln2/y;-><init>(Ln2/t;Ln2/n;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    invoke-virtual {p0, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p3, p1, Lw/q0;->e:Ln2/y;

    .line 37
    .line 38
    invoke-static {p1, p2, p4}, Lw/s;->w(Lw/q0;Ln2/s;Lb5/k;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final z(Ly0/o;Li2/g;Li2/n0;Lfg/l;IZIILm2/d;Ljava/util/List;Lfg/l;Lfg/l;)Ly0/o;
    .locals 12

    .line 1
    new-instance v0, Lg0/f;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v4, p3

    .line 6
    move/from16 v5, p4

    .line 7
    .line 8
    move/from16 v6, p5

    .line 9
    .line 10
    move/from16 v7, p6

    .line 11
    .line 12
    move/from16 v8, p7

    .line 13
    .line 14
    move-object/from16 v3, p8

    .line 15
    .line 16
    move-object/from16 v9, p9

    .line 17
    .line 18
    move-object/from16 v10, p10

    .line 19
    .line 20
    move-object/from16 v11, p11

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, Lg0/f;-><init>(Li2/g;Li2/n0;Lm2/d;Lfg/l;IZIILjava/util/List;Lfg/l;Lfg/l;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
