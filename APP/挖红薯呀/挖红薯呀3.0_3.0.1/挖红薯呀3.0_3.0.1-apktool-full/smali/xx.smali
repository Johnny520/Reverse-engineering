.class public final Lxx;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lcn0;


# instance fields
.field public d:Lvx;

.field public final e:Lux;

.field public final f:Lw3;

.field public g:Lww;

.field public h:Lhw;

.field public i:J

.field public j:Z

.field public final k:[F

.field public l:[F

.field public m:Z

.field public n:Lym;

.field public o:Lk50;

.field public final p:Ldd;

.field public q:I

.field public r:J

.field public s:Lv50;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public final x:Ls2;


# direct methods
.method public constructor <init>(Lvx;Lux;Lw3;Lww;Lhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxx;->d:Lvx;

    .line 5
    .line 6
    iput-object p2, p0, Lxx;->e:Lux;

    .line 7
    .line 8
    iput-object p3, p0, Lxx;->f:Lw3;

    .line 9
    .line 10
    iput-object p4, p0, Lxx;->g:Lww;

    .line 11
    .line 12
    iput-object p5, p0, Lxx;->h:Lhw;

    .line 13
    .line 14
    const-wide p1, 0x7fffffff7fffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lxx;->i:J

    .line 20
    .line 21
    invoke-static {}, Lr60;->h()[F

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lxx;->k:[F

    .line 26
    .line 27
    invoke-static {}, Li4;->d()Lzm;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lxx;->n:Lym;

    .line 32
    .line 33
    sget-object p1, Lk50;->d:Lk50;

    .line 34
    .line 35
    iput-object p1, p0, Lxx;->o:Lk50;

    .line 36
    .line 37
    new-instance p1, Ldd;

    .line 38
    .line 39
    invoke-direct {p1}, Ldd;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lxx;->p:Ldd;

    .line 43
    .line 44
    sget-wide p1, Lt81;->a:J

    .line 45
    .line 46
    iput-wide p1, p0, Lxx;->r:J

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lxx;->v:Z

    .line 50
    .line 51
    new-instance p1, Ls2;

    .line 52
    .line 53
    const/16 p2, 0xd

    .line 54
    .line 55
    invoke-direct {p1, p2, p0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lxx;->x:Ls2;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()[F
    .locals 4

    .line 1
    iget-object v0, p0, Lxx;->l:[F

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lr60;->h()[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lxx;->l:[F

    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p0, Lxx;->u:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    aget p0, v0, v2

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_3

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    iput-boolean v2, p0, Lxx;->u:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Lxx;->b()[F

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-boolean p0, p0, Lxx;->v:Z

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    invoke-static {v1, v0}, Ls91;->B([F[F)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    :cond_3
    return-object v0

    .line 44
    :cond_4
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 45
    .line 46
    aput p0, v0, v2

    .line 47
    .line 48
    return-object v3
.end method

.method public final b()[F
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lxx;->t:Z

    .line 4
    .line 5
    iget-object v2, v0, Lxx;->k:[F

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, Lxx;->d:Lvx;

    .line 10
    .line 11
    iget-wide v3, v1, Lvx;->v:J

    .line 12
    .line 13
    const-wide v5, 0x7fffffff7fffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr v5, v3

    .line 19
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v5, v5, v7

    .line 25
    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-wide v3, v0, Lxx;->i:J

    .line 29
    .line 30
    invoke-static {v3, v4}, Lo30;->C(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Lr60;->q(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    :cond_0
    const/16 v5, 0x20

    .line 39
    .line 40
    shr-long v5, v3, v5

    .line 41
    .line 42
    long-to-int v5, v5

    .line 43
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const-wide v6, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v3, v6

    .line 53
    long-to-int v3, v3

    .line 54
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iget-object v1, v1, Lvx;->a:Lzx;

    .line 59
    .line 60
    iget v4, v1, Lzx;->j:F

    .line 61
    .line 62
    iget v1, v1, Lzx;->k:F

    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    double-to-float v8, v8

    .line 71
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    double-to-float v9, v9

    .line 76
    neg-float v10, v8

    .line 77
    const/4 v11, 0x0

    .line 78
    mul-float v12, v11, v9

    .line 79
    .line 80
    mul-float v13, v11, v8

    .line 81
    .line 82
    sub-float v14, v12, v13

    .line 83
    .line 84
    add-float/2addr v12, v13

    .line 85
    move-wide v15, v6

    .line 86
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    double-to-float v6, v6

    .line 91
    move v7, v11

    .line 92
    move v13, v12

    .line 93
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v11

    .line 97
    double-to-float v11, v11

    .line 98
    neg-float v12, v6

    .line 99
    mul-float v17, v8, v6

    .line 100
    .line 101
    mul-float/2addr v8, v11

    .line 102
    mul-float v18, v9, v6

    .line 103
    .line 104
    mul-float v19, v9, v11

    .line 105
    .line 106
    mul-float v20, v7, v11

    .line 107
    .line 108
    mul-float v21, v13, v6

    .line 109
    .line 110
    add-float v21, v21, v20

    .line 111
    .line 112
    const/high16 v20, -0x80000000

    .line 113
    .line 114
    mul-float v20, v20, v6

    .line 115
    .line 116
    mul-float v6, v13, v11

    .line 117
    .line 118
    add-float v6, v6, v20

    .line 119
    .line 120
    move v13, v7

    .line 121
    move/from16 v20, v8

    .line 122
    .line 123
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide v7

    .line 127
    double-to-float v7, v7

    .line 128
    move/from16 v22, v13

    .line 129
    .line 130
    move v8, v14

    .line 131
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v13

    .line 135
    double-to-float v13, v13

    .line 136
    neg-float v14, v7

    .line 137
    mul-float v15, v14, v11

    .line 138
    .line 139
    mul-float v16, v13, v17

    .line 140
    .line 141
    add-float v16, v16, v15

    .line 142
    .line 143
    mul-float/2addr v11, v13

    .line 144
    mul-float v17, v17, v7

    .line 145
    .line 146
    add-float v17, v17, v11

    .line 147
    .line 148
    mul-float v11, v7, v9

    .line 149
    .line 150
    mul-float/2addr v9, v13

    .line 151
    mul-float/2addr v14, v12

    .line 152
    mul-float v15, v13, v20

    .line 153
    .line 154
    add-float/2addr v15, v14

    .line 155
    mul-float/2addr v13, v12

    .line 156
    mul-float v7, v7, v20

    .line 157
    .line 158
    add-float/2addr v7, v13

    .line 159
    mul-float v17, v17, v4

    .line 160
    .line 161
    mul-float/2addr v11, v4

    .line 162
    mul-float/2addr v7, v4

    .line 163
    mul-float v16, v16, v1

    .line 164
    .line 165
    mul-float/2addr v9, v1

    .line 166
    mul-float/2addr v15, v1

    .line 167
    const/high16 v1, 0x3f800000    # 1.0f

    .line 168
    .line 169
    mul-float v18, v18, v1

    .line 170
    .line 171
    mul-float/2addr v10, v1

    .line 172
    mul-float v19, v19, v1

    .line 173
    .line 174
    array-length v4, v2

    .line 175
    const/4 v12, 0x0

    .line 176
    const/16 v13, 0x10

    .line 177
    .line 178
    if-ge v4, v13, :cond_1

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_1
    aput v17, v2, v12

    .line 182
    .line 183
    const/4 v4, 0x1

    .line 184
    aput v11, v2, v4

    .line 185
    .line 186
    const/4 v4, 0x2

    .line 187
    aput v7, v2, v4

    .line 188
    .line 189
    const/4 v4, 0x3

    .line 190
    aput v22, v2, v4

    .line 191
    .line 192
    const/4 v4, 0x4

    .line 193
    aput v16, v2, v4

    .line 194
    .line 195
    const/4 v4, 0x5

    .line 196
    aput v9, v2, v4

    .line 197
    .line 198
    const/4 v4, 0x6

    .line 199
    aput v15, v2, v4

    .line 200
    .line 201
    const/4 v4, 0x7

    .line 202
    aput v22, v2, v4

    .line 203
    .line 204
    const/16 v4, 0x8

    .line 205
    .line 206
    aput v18, v2, v4

    .line 207
    .line 208
    const/16 v4, 0x9

    .line 209
    .line 210
    aput v10, v2, v4

    .line 211
    .line 212
    const/16 v4, 0xa

    .line 213
    .line 214
    aput v19, v2, v4

    .line 215
    .line 216
    const/16 v4, 0xb

    .line 217
    .line 218
    aput v22, v2, v4

    .line 219
    .line 220
    neg-float v4, v5

    .line 221
    mul-float v17, v17, v4

    .line 222
    .line 223
    mul-float v16, v16, v3

    .line 224
    .line 225
    sub-float v17, v17, v16

    .line 226
    .line 227
    add-float v17, v17, v21

    .line 228
    .line 229
    add-float v17, v17, v5

    .line 230
    .line 231
    const/16 v5, 0xc

    .line 232
    .line 233
    aput v17, v2, v5

    .line 234
    .line 235
    mul-float/2addr v11, v4

    .line 236
    mul-float/2addr v9, v3

    .line 237
    sub-float/2addr v11, v9

    .line 238
    add-float/2addr v11, v8

    .line 239
    add-float/2addr v11, v3

    .line 240
    const/16 v5, 0xd

    .line 241
    .line 242
    aput v11, v2, v5

    .line 243
    .line 244
    mul-float/2addr v4, v7

    .line 245
    mul-float/2addr v3, v15

    .line 246
    sub-float/2addr v4, v3

    .line 247
    add-float/2addr v4, v6

    .line 248
    const/16 v3, 0xe

    .line 249
    .line 250
    aput v4, v2, v3

    .line 251
    .line 252
    const/16 v3, 0xf

    .line 253
    .line 254
    aput v1, v2, v3

    .line 255
    .line 256
    :goto_0
    iput-boolean v12, v0, Lxx;->t:Z

    .line 257
    .line 258
    invoke-static {v2}, Lw60;->z([F)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    iput-boolean v1, v0, Lxx;->v:Z

    .line 263
    .line 264
    :cond_2
    return-object v2
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxx;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lxx;->j:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lxx;->f:Lw3;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lxx;->f(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final d(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxx;->f:Lw3;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw3;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/high16 v1, -0x3f800000    # -4.0f

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lw3;->I(F)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lxx;->d:Lvx;

    .line 13
    .line 14
    iget-wide v1, p0, Lvx;->t:J

    .line 15
    .line 16
    invoke-static {v1, v2, p1, p2}, Lw20;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iput-wide p1, p0, Lvx;->t:J

    .line 23
    .line 24
    iget-wide v1, p0, Lvx;->u:J

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, v1, v2}, Lvx;->h(JJ)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-interface {p0, v0, v0}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final e(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lxx;->i:J

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, Ld30;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lxx;->f:Lw3;

    .line 10
    .line 11
    iget-boolean v1, v0, Lw3;->o:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/high16 v1, -0x3f800000    # -4.0f

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lw3;->I(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-wide p1, p0, Lxx;->i:J

    .line 21
    .line 22
    invoke-virtual {p0}, Lxx;->c()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final f(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxx;->m:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    iput-boolean p1, p0, Lxx;->m:Z

    .line 6
    .line 7
    iget-object v0, p0, Lxx;->f:Lw3;

    .line 8
    .line 9
    iget-object v1, v0, Lw3;->G:Ldh0;

    .line 10
    .line 11
    iget-boolean v2, v0, Lw3;->I:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lw3;->H:Ldh0;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ldh0;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p1, v0, Lw3;->H:Ldh0;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    new-instance p1, Ldh0;

    .line 39
    .line 40
    invoke-direct {p1}, Ldh0;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, Lw3;->H:Ldh0;

    .line 44
    .line 45
    :cond_2
    invoke-virtual {p1, p0}, Ldh0;->a(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lxx;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-wide v0, p0, Lxx;->r:J

    .line 6
    .line 7
    sget-wide v2, Lt81;->a:J

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lxx;->d:Lvx;

    .line 15
    .line 16
    iget-wide v0, v0, Lvx;->u:J

    .line 17
    .line 18
    iget-wide v2, p0, Lxx;->i:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Ld30;->a(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lxx;->d:Lvx;

    .line 27
    .line 28
    iget-wide v1, p0, Lxx;->r:J

    .line 29
    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    shr-long/2addr v1, v3

    .line 33
    long-to-int v1, v1

    .line 34
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget-wide v4, p0, Lxx;->i:J

    .line 39
    .line 40
    shr-long/2addr v4, v3

    .line 41
    long-to-int v2, v4

    .line 42
    int-to-float v2, v2

    .line 43
    mul-float/2addr v1, v2

    .line 44
    iget-wide v4, p0, Lxx;->r:J

    .line 45
    .line 46
    const-wide v6, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v4, v6

    .line 52
    long-to-int v2, v4

    .line 53
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget-wide v4, p0, Lxx;->i:J

    .line 58
    .line 59
    and-long/2addr v4, v6

    .line 60
    long-to-int v4, v4

    .line 61
    int-to-float v4, v4

    .line 62
    mul-float/2addr v2, v4

    .line 63
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    int-to-long v4, v1

    .line 68
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    int-to-long v1, v1

    .line 73
    shl-long v3, v4, v3

    .line 74
    .line 75
    and-long/2addr v1, v6

    .line 76
    or-long/2addr v1, v3

    .line 77
    invoke-virtual {v0, v1, v2}, Lvx;->g(J)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    iget-object v0, p0, Lxx;->d:Lvx;

    .line 81
    .line 82
    iget-object v1, p0, Lxx;->n:Lym;

    .line 83
    .line 84
    iget-object v2, p0, Lxx;->o:Lk50;

    .line 85
    .line 86
    iget-wide v3, p0, Lxx;->i:J

    .line 87
    .line 88
    iget-wide v5, v0, Lvx;->u:J

    .line 89
    .line 90
    invoke-static {v5, v6, v3, v4}, Ld30;->a(JJ)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    iput-wide v3, v0, Lvx;->u:J

    .line 97
    .line 98
    iget-wide v5, v0, Lvx;->t:J

    .line 99
    .line 100
    invoke-virtual {v0, v5, v6, v3, v4}, Lvx;->h(JJ)V

    .line 101
    .line 102
    .line 103
    iget-wide v3, v0, Lvx;->i:J

    .line 104
    .line 105
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    cmp-long v3, v3, v5

    .line 111
    .line 112
    if-nez v3, :cond_2

    .line 113
    .line 114
    const/4 v3, 0x1

    .line 115
    iput-boolean v3, v0, Lvx;->g:Z

    .line 116
    .line 117
    invoke-virtual {v0}, Lvx;->a()V

    .line 118
    .line 119
    .line 120
    :cond_2
    iput-object v1, v0, Lvx;->b:Lym;

    .line 121
    .line 122
    iput-object v2, v0, Lvx;->c:Lk50;

    .line 123
    .line 124
    iget-object v1, p0, Lxx;->x:Ls2;

    .line 125
    .line 126
    iput-object v1, v0, Lvx;->d:Lsw;

    .line 127
    .line 128
    invoke-virtual {v0}, Lvx;->f()V

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-virtual {p0, v0}, Lxx;->f(Z)V

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void
.end method
