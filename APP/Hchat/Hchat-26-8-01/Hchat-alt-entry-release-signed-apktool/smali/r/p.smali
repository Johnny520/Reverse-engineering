.class public final Lr/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/o0;


# instance fields
.field public final a:Lr/q;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Lv1/o0;

.field public final f:F

.field public final g:Z

.field public final h:Lqg/t;

.field public final i:Lu2/c;

.field public final j:J

.field public final k:Ljava/lang/Object;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:Lm/p1;

.field public final p:I

.field public final q:I


# direct methods
.method public constructor <init>(Lr/q;IZFLv1/o0;FZLqg/t;Lu2/c;JLjava/util/List;IIILm/p1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/p;->a:Lr/q;

    .line 5
    .line 6
    iput p2, p0, Lr/p;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lr/p;->c:Z

    .line 9
    .line 10
    iput p4, p0, Lr/p;->d:F

    .line 11
    .line 12
    iput-object p5, p0, Lr/p;->e:Lv1/o0;

    .line 13
    .line 14
    iput p6, p0, Lr/p;->f:F

    .line 15
    .line 16
    iput-boolean p7, p0, Lr/p;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, Lr/p;->h:Lqg/t;

    .line 19
    .line 20
    iput-object p9, p0, Lr/p;->i:Lu2/c;

    .line 21
    .line 22
    iput-wide p10, p0, Lr/p;->j:J

    .line 23
    .line 24
    iput-object p12, p0, Lr/p;->k:Ljava/lang/Object;

    .line 25
    .line 26
    iput p13, p0, Lr/p;->l:I

    .line 27
    .line 28
    iput p14, p0, Lr/p;->m:I

    .line 29
    .line 30
    iput p15, p0, Lr/p;->n:I

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, Lr/p;->o:Lm/p1;

    .line 35
    .line 36
    move/from16 p1, p17

    .line 37
    .line 38
    iput p1, p0, Lr/p;->p:I

    .line 39
    .line 40
    move/from16 p1, p18

    .line 41
    .line 42
    iput p1, p0, Lr/p;->q:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(IZ)Lr/p;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lr/p;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lr/p;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    iget-object v4, v0, Lr/p;->a:Lr/q;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget v4, v4, Lr/q;->q:I

    .line 22
    .line 23
    iget v5, v0, Lr/p;->b:I

    .line 24
    .line 25
    sub-int v6, v5, v1

    .line 26
    .line 27
    if-ltz v6, :cond_0

    .line 28
    .line 29
    if-ge v6, v4, :cond_0

    .line 30
    .line 31
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lr/q;

    .line 36
    .line 37
    invoke-static {v2}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lr/q;

    .line 42
    .line 43
    iget-boolean v7, v4, Lr/q;->s:Z

    .line 44
    .line 45
    if-nez v7, :cond_0

    .line 46
    .line 47
    iget-boolean v7, v5, Lr/q;->s:Z

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    :cond_0
    const/16 v18, 0x0

    .line 52
    .line 53
    goto/16 :goto_c

    .line 54
    .line 55
    :cond_1
    iget v7, v4, Lr/q;->o:I

    .line 56
    .line 57
    iget v8, v0, Lr/p;->m:I

    .line 58
    .line 59
    iget v9, v0, Lr/p;->l:I

    .line 60
    .line 61
    if-gez v1, :cond_2

    .line 62
    .line 63
    iget v4, v4, Lr/q;->q:I

    .line 64
    .line 65
    add-int/2addr v7, v4

    .line 66
    sub-int/2addr v7, v9

    .line 67
    iget v4, v5, Lr/q;->o:I

    .line 68
    .line 69
    iget v5, v5, Lr/q;->q:I

    .line 70
    .line 71
    add-int/2addr v4, v5

    .line 72
    sub-int/2addr v4, v8

    .line 73
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    neg-int v5, v1

    .line 78
    if-le v4, v5, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    sub-int/2addr v9, v7

    .line 82
    iget v4, v5, Lr/q;->o:I

    .line 83
    .line 84
    sub-int/2addr v8, v4

    .line 85
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-le v4, v1, :cond_0

    .line 90
    .line 91
    :goto_0
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v5, 0x0

    .line 96
    move v7, v5

    .line 97
    :goto_1
    if-ge v7, v4, :cond_c

    .line 98
    .line 99
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, Lr/q;

    .line 104
    .line 105
    iget-boolean v9, v8, Lr/q;->c:Z

    .line 106
    .line 107
    iget-object v10, v8, Lr/q;->w:[I

    .line 108
    .line 109
    iget-boolean v11, v8, Lr/q;->s:Z

    .line 110
    .line 111
    if-eqz v11, :cond_4

    .line 112
    .line 113
    :cond_3
    move/from16 v19, v4

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :cond_4
    iget v11, v8, Lr/q;->o:I

    .line 120
    .line 121
    add-int/2addr v11, v1

    .line 122
    iput v11, v8, Lr/q;->o:I

    .line 123
    .line 124
    array-length v11, v10

    .line 125
    move v12, v5

    .line 126
    :goto_2
    if-ge v12, v11, :cond_8

    .line 127
    .line 128
    and-int/lit8 v13, v12, 0x1

    .line 129
    .line 130
    if-eqz v9, :cond_5

    .line 131
    .line 132
    if-nez v13, :cond_6

    .line 133
    .line 134
    :cond_5
    if-nez v9, :cond_7

    .line 135
    .line 136
    if-nez v13, :cond_7

    .line 137
    .line 138
    :cond_6
    aget v13, v10, v12

    .line 139
    .line 140
    add-int/2addr v13, v1

    .line 141
    aput v13, v10, v12

    .line 142
    .line 143
    :cond_7
    add-int/lit8 v12, v12, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_8
    if-eqz p2, :cond_3

    .line 147
    .line 148
    iget-object v10, v8, Lr/q;->b:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    move v11, v5

    .line 155
    :goto_3
    if-ge v11, v10, :cond_3

    .line 156
    .line 157
    iget-object v12, v8, Lr/q;->m:Ls/z;

    .line 158
    .line 159
    iget-object v13, v8, Lr/q;->k:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object v12, v12, Ls/z;->a:Lf/k0;

    .line 162
    .line 163
    invoke-virtual {v12, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    check-cast v12, Ls/x;

    .line 168
    .line 169
    if-eqz v12, :cond_9

    .line 170
    .line 171
    iget-object v12, v12, Ls/x;->a:[Ls/t;

    .line 172
    .line 173
    aget-object v12, v12, v11

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    const/4 v12, 0x0

    .line 177
    :goto_4
    if-eqz v12, :cond_b

    .line 178
    .line 179
    iget-wide v13, v12, Ls/t;->j:J

    .line 180
    .line 181
    const-wide v15, 0xffffffffL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    const/16 v17, 0x20

    .line 187
    .line 188
    if-eqz v9, :cond_a

    .line 189
    .line 190
    move/from16 v19, v4

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    shr-long v3, v13, v17

    .line 195
    .line 196
    long-to-int v3, v3

    .line 197
    and-long/2addr v13, v15

    .line 198
    long-to-int v4, v13

    .line 199
    add-int/2addr v4, v1

    .line 200
    :goto_5
    int-to-long v13, v3

    .line 201
    shl-long v13, v13, v17

    .line 202
    .line 203
    int-to-long v3, v4

    .line 204
    and-long/2addr v3, v15

    .line 205
    or-long/2addr v3, v13

    .line 206
    goto :goto_6

    .line 207
    :cond_a
    move/from16 v19, v4

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    shr-long v3, v13, v17

    .line 212
    .line 213
    long-to-int v3, v3

    .line 214
    add-int/2addr v3, v1

    .line 215
    and-long/2addr v13, v15

    .line 216
    long-to-int v4, v13

    .line 217
    goto :goto_5

    .line 218
    :goto_6
    iput-wide v3, v12, Ls/t;->j:J

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_b
    move/from16 v19, v4

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 226
    .line 227
    move/from16 v4, v19

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 231
    .line 232
    move/from16 v4, v19

    .line 233
    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :cond_c
    new-instance v4, Lr/p;

    .line 237
    .line 238
    iget-boolean v3, v0, Lr/p;->c:Z

    .line 239
    .line 240
    if-nez v3, :cond_e

    .line 241
    .line 242
    if-lez v1, :cond_d

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_d
    :goto_9
    move v7, v5

    .line 246
    goto :goto_b

    .line 247
    :cond_e
    :goto_a
    const/4 v5, 0x1

    .line 248
    goto :goto_9

    .line 249
    :goto_b
    int-to-float v8, v1

    .line 250
    iget v1, v0, Lr/p;->p:I

    .line 251
    .line 252
    iget v3, v0, Lr/p;->q:I

    .line 253
    .line 254
    iget-object v5, v0, Lr/p;->a:Lr/q;

    .line 255
    .line 256
    iget-object v9, v0, Lr/p;->e:Lv1/o0;

    .line 257
    .line 258
    iget v10, v0, Lr/p;->f:F

    .line 259
    .line 260
    iget-boolean v11, v0, Lr/p;->g:Z

    .line 261
    .line 262
    iget-object v12, v0, Lr/p;->h:Lqg/t;

    .line 263
    .line 264
    iget-object v13, v0, Lr/p;->i:Lu2/c;

    .line 265
    .line 266
    iget-wide v14, v0, Lr/p;->j:J

    .line 267
    .line 268
    move/from16 v21, v1

    .line 269
    .line 270
    iget v1, v0, Lr/p;->l:I

    .line 271
    .line 272
    move/from16 v17, v1

    .line 273
    .line 274
    iget v1, v0, Lr/p;->m:I

    .line 275
    .line 276
    move/from16 v18, v1

    .line 277
    .line 278
    iget v1, v0, Lr/p;->n:I

    .line 279
    .line 280
    move/from16 v19, v1

    .line 281
    .line 282
    iget-object v1, v0, Lr/p;->o:Lm/p1;

    .line 283
    .line 284
    move-object/from16 v20, v1

    .line 285
    .line 286
    move-object/from16 v16, v2

    .line 287
    .line 288
    move/from16 v22, v3

    .line 289
    .line 290
    invoke-direct/range {v4 .. v22}, Lr/p;-><init>(Lr/q;IZFLv1/o0;FZLqg/t;Lu2/c;JLjava/util/List;IIILm/p1;II)V

    .line 291
    .line 292
    .line 293
    return-object v4

    .line 294
    :goto_c
    return-object v18
.end method

.method public final b()J
    .locals 7

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0}, Lv1/o0;->g()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v1, v1

    .line 12
    const/16 v3, 0x20

    .line 13
    .line 14
    shl-long/2addr v1, v3

    .line 15
    int-to-long v3, v0

    .line 16
    const-wide v5, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v3, v5

    .line 22
    or-long v0, v1, v3

    .line 23
    .line 24
    return-wide v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->e()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/p;->e:Lv1/o0;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o0;->i()Lfg/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
