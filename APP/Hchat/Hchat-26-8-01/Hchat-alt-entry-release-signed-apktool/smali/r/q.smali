.class public final Lr/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Z

.field public final d:Ly0/e;

.field public final e:Ly0/f;

.field public final f:Lu2/m;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ls/z;

.field public final n:J

.field public o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:Z

.field public t:I

.field public u:I

.field public v:I

.field public final w:[I


# direct methods
.method public constructor <init>(ILjava/util/List;ZLy0/e;Ly0/f;Lu2/m;IIIJLjava/lang/Object;Ljava/lang/Object;Ls/z;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lr/q;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lr/q;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lr/q;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lr/q;->d:Ly0/e;

    .line 11
    .line 12
    iput-object p5, p0, Lr/q;->e:Ly0/f;

    .line 13
    .line 14
    iput-object p6, p0, Lr/q;->f:Lu2/m;

    .line 15
    .line 16
    iput p7, p0, Lr/q;->g:I

    .line 17
    .line 18
    iput p8, p0, Lr/q;->h:I

    .line 19
    .line 20
    iput p9, p0, Lr/q;->i:I

    .line 21
    .line 22
    iput-wide p10, p0, Lr/q;->j:J

    .line 23
    .line 24
    iput-object p12, p0, Lr/q;->k:Ljava/lang/Object;

    .line 25
    .line 26
    move-object/from16 p1, p13

    .line 27
    .line 28
    iput-object p1, p0, Lr/q;->l:Ljava/lang/Object;

    .line 29
    .line 30
    move-object/from16 p1, p14

    .line 31
    .line 32
    iput-object p1, p0, Lr/q;->m:Ls/z;

    .line 33
    .line 34
    move-wide/from16 p3, p15

    .line 35
    .line 36
    iput-wide p3, p0, Lr/q;->n:J

    .line 37
    .line 38
    const/high16 p1, -0x80000000

    .line 39
    .line 40
    iput p1, p0, Lr/q;->t:I

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 p3, 0x0

    .line 47
    move p4, p3

    .line 48
    move p5, p4

    .line 49
    move p6, p5

    .line 50
    :goto_0
    if-ge p4, p1, :cond_2

    .line 51
    .line 52
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lv1/b1;

    .line 57
    .line 58
    iget-boolean v1, p0, Lr/q;->c:Z

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget v2, v0, Lv1/b1;->h:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    iget v2, v0, Lv1/b1;->g:I

    .line 66
    .line 67
    :goto_1
    add-int/2addr p5, v2

    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    iget v0, v0, Lv1/b1;->h:I

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    iget v0, v0, Lv1/b1;->g:I

    .line 74
    .line 75
    :goto_2
    invoke-static {p6, v0}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result p6

    .line 79
    add-int/lit8 p4, p4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iput p5, p0, Lr/q;->p:I

    .line 83
    .line 84
    iget p1, p0, Lr/q;->i:I

    .line 85
    .line 86
    add-int/2addr p5, p1

    .line 87
    if-gez p5, :cond_3

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move p3, p5

    .line 91
    :goto_3
    iput p3, p0, Lr/q;->q:I

    .line 92
    .line 93
    iput p6, p0, Lr/q;->r:I

    .line 94
    .line 95
    iget-object p1, p0, Lr/q;->b:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    mul-int/lit8 p1, p1, 0x2

    .line 102
    .line 103
    new-array p1, p1, [I

    .line 104
    .line 105
    iput-object p1, p0, Lr/q;->w:[I

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr/q;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide v0, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr p1, v0

    .line 11
    :goto_0
    long-to-int p1, p1

    .line 12
    return p1

    .line 13
    :cond_0
    const/16 v0, 0x20

    .line 14
    .line 15
    shr-long/2addr p1, v0

    .line 16
    goto :goto_0
.end method

.method public final b(I)J
    .locals 6

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lr/q;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    iget p1, p0, Lr/q;->o:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iget-boolean v4, p0, Lr/q;->c:Z

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    int-to-long v3, v3

    .line 26
    shl-long v2, v3, v2

    .line 27
    .line 28
    int-to-long v4, p1

    .line 29
    and-long/2addr v0, v4

    .line 30
    or-long/2addr v0, v2

    .line 31
    return-wide v0

    .line 32
    :cond_0
    int-to-long v4, p1

    .line 33
    shl-long/2addr v4, v2

    .line 34
    int-to-long v2, v3

    .line 35
    and-long/2addr v0, v2

    .line 36
    or-long/2addr v0, v4

    .line 37
    return-wide v0

    .line 38
    :cond_1
    mul-int/lit8 p1, p1, 0x2

    .line 39
    .line 40
    iget-object v3, p0, Lr/q;->w:[I

    .line 41
    .line 42
    aget v4, v3, p1

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    aget p1, v3, p1

    .line 47
    .line 48
    int-to-long v3, v4

    .line 49
    shl-long v2, v3, v2

    .line 50
    .line 51
    int-to-long v4, p1

    .line 52
    and-long/2addr v0, v4

    .line 53
    or-long/2addr v0, v2

    .line 54
    return-wide v0
.end method

.method public final c(Lv1/a1;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lr/q;->t:I

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "position() should be called first"

    .line 13
    .line 14
    invoke-static {v2}, Lo/b;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v7, v0, Lr/q;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    const/4 v2, 0x0

    .line 24
    move v9, v2

    .line 25
    :goto_1
    if-ge v9, v8, :cond_11

    .line 26
    .line 27
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lv1/b1;

    .line 32
    .line 33
    iget v3, v0, Lr/q;->u:I

    .line 34
    .line 35
    iget-boolean v4, v0, Lr/q;->c:Z

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget v5, v2, Lv1/b1;->h:I

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iget v5, v2, Lv1/b1;->g:I

    .line 43
    .line 44
    :goto_2
    sub-int/2addr v3, v5

    .line 45
    iget v5, v0, Lr/q;->v:I

    .line 46
    .line 47
    invoke-virtual {v0, v9}, Lr/q;->b(I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    iget-object v6, v0, Lr/q;->k:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v12, v0, Lr/q;->m:Ls/z;

    .line 54
    .line 55
    iget-object v12, v12, Ls/z;->a:Lf/k0;

    .line 56
    .line 57
    invoke-virtual {v12, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Ls/x;

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    iget-object v6, v6, Ls/x;->a:[Ls/t;

    .line 67
    .line 68
    aget-object v6, v6, v9

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-object v6, v12

    .line 72
    :goto_3
    if-eqz v6, :cond_8

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    iput-wide v10, v6, Ls/t;->p:J

    .line 77
    .line 78
    move-object v15, v7

    .line 79
    move/from16 v16, v8

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    iget-wide v13, v6, Ls/t;->p:J

    .line 83
    .line 84
    move-object v15, v7

    .line 85
    move/from16 v16, v8

    .line 86
    .line 87
    sget-wide v7, Ls/t;->q:J

    .line 88
    .line 89
    invoke-static {v13, v14, v7, v8}, Lu2/j;->b(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-nez v7, :cond_4

    .line 94
    .line 95
    iget-wide v10, v6, Ls/t;->p:J

    .line 96
    .line 97
    :cond_4
    iget-object v7, v6, Ls/t;->o:Li0/j1;

    .line 98
    .line 99
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, Lu2/j;

    .line 104
    .line 105
    iget-wide v7, v7, Lu2/j;->a:J

    .line 106
    .line 107
    invoke-static {v10, v11, v7, v8}, Lu2/j;->d(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    invoke-virtual {v0, v10, v11}, Lr/q;->a(J)I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-gt v13, v3, :cond_5

    .line 116
    .line 117
    invoke-virtual {v0, v7, v8}, Lr/q;->a(J)I

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-le v13, v3, :cond_6

    .line 122
    .line 123
    :cond_5
    invoke-virtual {v0, v10, v11}, Lr/q;->a(J)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-lt v3, v5, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0, v7, v8}, Lr/q;->a(J)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-lt v3, v5, :cond_7

    .line 134
    .line 135
    :cond_6
    iget-object v3, v6, Ls/t;->f:Li0/j1;

    .line 136
    .line 137
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_7

    .line 148
    .line 149
    iget-object v3, v6, Ls/t;->a:Lqg/t;

    .line 150
    .line 151
    new-instance v5, Ls/s;

    .line 152
    .line 153
    const/4 v10, 0x1

    .line 154
    invoke-direct {v5, v6, v12, v10}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 155
    .line 156
    .line 157
    const/4 v10, 0x3

    .line 158
    invoke-static {v3, v12, v5, v10}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 159
    .line 160
    .line 161
    :cond_7
    move-wide v10, v7

    .line 162
    :goto_4
    iget-object v12, v6, Ls/t;->l:Li1/b;

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    move-object v15, v7

    .line 166
    move/from16 v16, v8

    .line 167
    .line 168
    :goto_5
    iget-wide v7, v0, Lr/q;->j:J

    .line 169
    .line 170
    invoke-static {v10, v11, v7, v8}, Lu2/j;->d(JJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    if-nez p2, :cond_9

    .line 175
    .line 176
    if-eqz v6, :cond_9

    .line 177
    .line 178
    iput-wide v7, v6, Ls/t;->k:J

    .line 179
    .line 180
    :cond_9
    const/4 v3, 0x0

    .line 181
    if-eqz v4, :cond_b

    .line 182
    .line 183
    if-eqz v12, :cond_a

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 189
    .line 190
    .line 191
    iget-wide v4, v2, Lv1/b1;->k:J

    .line 192
    .line 193
    invoke-static {v7, v8, v4, v5}, Lu2/j;->d(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v4

    .line 197
    invoke-virtual {v2, v4, v5, v3, v12}, Lv1/b1;->B0(JFLi1/b;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_8

    .line 201
    .line 202
    :cond_a
    const/4 v5, 0x0

    .line 203
    const/4 v6, 0x6

    .line 204
    move-wide v3, v7

    .line 205
    invoke-static/range {v1 .. v6}, Lv1/a1;->H(Lv1/a1;Lv1/b1;JLnb/a;I)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_b
    move-wide v4, v7

    .line 211
    sget-object v6, Lu2/m;->g:Lu2/m;

    .line 212
    .line 213
    const-wide v7, 0xffffffffL

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    const/16 v10, 0x20

    .line 219
    .line 220
    if-eqz v12, :cond_e

    .line 221
    .line 222
    invoke-virtual {v1}, Lv1/a1;->m()Lu2/m;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    if-eq v11, v6, :cond_d

    .line 227
    .line 228
    invoke-virtual {v1}, Lv1/a1;->w()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_c

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_c
    invoke-virtual {v1}, Lv1/a1;->w()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    iget v11, v2, Lv1/b1;->g:I

    .line 240
    .line 241
    sub-int/2addr v6, v11

    .line 242
    shr-long v13, v4, v10

    .line 243
    .line 244
    long-to-int v11, v13

    .line 245
    sub-int/2addr v6, v11

    .line 246
    and-long/2addr v4, v7

    .line 247
    long-to-int v4, v4

    .line 248
    int-to-long v5, v6

    .line 249
    shl-long/2addr v5, v10

    .line 250
    int-to-long v10, v4

    .line 251
    and-long/2addr v7, v10

    .line 252
    or-long v4, v5, v7

    .line 253
    .line 254
    invoke-static {v1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 255
    .line 256
    .line 257
    iget-wide v6, v2, Lv1/b1;->k:J

    .line 258
    .line 259
    invoke-static {v4, v5, v6, v7}, Lu2/j;->d(JJ)J

    .line 260
    .line 261
    .line 262
    move-result-wide v4

    .line 263
    invoke-virtual {v2, v4, v5, v3, v12}, Lv1/b1;->B0(JFLi1/b;)V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    :goto_6
    invoke-static {v1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 268
    .line 269
    .line 270
    iget-wide v6, v2, Lv1/b1;->k:J

    .line 271
    .line 272
    invoke-static {v4, v5, v6, v7}, Lu2/j;->d(JJ)J

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    invoke-virtual {v2, v4, v5, v3, v12}, Lv1/b1;->B0(JFLi1/b;)V

    .line 277
    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_e
    sget v11, Lv1/d1;->b:I

    .line 281
    .line 282
    sget-object v11, Lv1/c1;->h:Lv1/c1;

    .line 283
    .line 284
    invoke-virtual {v1}, Lv1/a1;->m()Lu2/m;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    if-eq v12, v6, :cond_10

    .line 289
    .line 290
    invoke-virtual {v1}, Lv1/a1;->w()I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-nez v6, :cond_f

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_f
    invoke-virtual {v1}, Lv1/a1;->w()I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    iget v12, v2, Lv1/b1;->g:I

    .line 302
    .line 303
    sub-int/2addr v6, v12

    .line 304
    shr-long v12, v4, v10

    .line 305
    .line 306
    long-to-int v12, v12

    .line 307
    sub-int/2addr v6, v12

    .line 308
    and-long/2addr v4, v7

    .line 309
    long-to-int v4, v4

    .line 310
    int-to-long v5, v6

    .line 311
    shl-long/2addr v5, v10

    .line 312
    int-to-long v12, v4

    .line 313
    and-long/2addr v7, v12

    .line 314
    or-long v4, v5, v7

    .line 315
    .line 316
    invoke-static {v1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 317
    .line 318
    .line 319
    iget-wide v6, v2, Lv1/b1;->k:J

    .line 320
    .line 321
    invoke-static {v4, v5, v6, v7}, Lu2/j;->d(JJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-virtual {v2, v4, v5, v3, v11}, Lv1/b1;->A0(JFLfg/l;)V

    .line 326
    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_10
    :goto_7
    invoke-static {v1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 330
    .line 331
    .line 332
    iget-wide v6, v2, Lv1/b1;->k:J

    .line 333
    .line 334
    invoke-static {v4, v5, v6, v7}, Lu2/j;->d(JJ)J

    .line 335
    .line 336
    .line 337
    move-result-wide v4

    .line 338
    invoke-virtual {v2, v4, v5, v3, v11}, Lv1/b1;->A0(JFLfg/l;)V

    .line 339
    .line 340
    .line 341
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 342
    .line 343
    move-object v7, v15

    .line 344
    move/from16 v8, v16

    .line 345
    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :cond_11
    return-void
.end method

.method public final d(III)V
    .locals 10

    .line 1
    iput p1, p0, Lr/q;->o:I

    .line 2
    .line 3
    iget-boolean v0, p0, Lr/q;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v1, p3

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, p2

    .line 10
    :goto_0
    iput v1, p0, Lr/q;->t:I

    .line 11
    .line 12
    iget-object v1, p0, Lr/q;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_1
    if-ge v3, v2, :cond_4

    .line 20
    .line 21
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lv1/b1;

    .line 26
    .line 27
    mul-int/lit8 v5, v3, 0x2

    .line 28
    .line 29
    iget-object v6, p0, Lr/q;->w:[I

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v7, p0, Lr/q;->d:Ly0/e;

    .line 34
    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    iget v8, v4, Lv1/b1;->g:I

    .line 38
    .line 39
    iget-object v9, p0, Lr/q;->f:Lu2/m;

    .line 40
    .line 41
    invoke-virtual {v7, v8, p2, v9}, Ly0/e;->a(IILu2/m;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    aput v7, v6, v5

    .line 46
    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    aput p1, v6, v5

    .line 50
    .line 51
    iget v4, v4, Lv1/b1;->h:I

    .line 52
    .line 53
    :goto_2
    add-int/2addr p1, v4

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    const-string p1, "null horizontalAlignment when isVertical == true"

    .line 56
    .line 57
    invoke-static {p1}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lokio/a;->c()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    aput p1, v6, v5

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    iget-object v7, p0, Lr/q;->e:Ly0/f;

    .line 69
    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    iget v8, v4, Lv1/b1;->h:I

    .line 73
    .line 74
    invoke-virtual {v7, v8, p3}, Ly0/f;->a(II)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    aput v7, v6, v5

    .line 79
    .line 80
    iget v4, v4, Lv1/b1;->g:I

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const-string p1, "null verticalAlignment when isVertical == false"

    .line 87
    .line 88
    invoke-static {p1}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lokio/a;->c()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    iget p1, p0, Lr/q;->g:I

    .line 96
    .line 97
    neg-int p1, p1

    .line 98
    iput p1, p0, Lr/q;->u:I

    .line 99
    .line 100
    iget p1, p0, Lr/q;->t:I

    .line 101
    .line 102
    iget p2, p0, Lr/q;->h:I

    .line 103
    .line 104
    add-int/2addr p1, p2

    .line 105
    iput p1, p0, Lr/q;->v:I

    .line 106
    .line 107
    return-void
.end method
