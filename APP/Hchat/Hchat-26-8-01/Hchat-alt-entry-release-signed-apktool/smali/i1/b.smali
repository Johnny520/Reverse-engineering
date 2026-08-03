.class public final Li1/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final a:Li1/d;

.field public b:Lu2/c;

.field public c:Lu2/m;

.field public d:Lfg/l;

.field public final e:Lb1/f;

.field public f:Landroid/graphics/Outline;

.field public g:Z

.field public h:J

.field public i:J

.field public j:F

.field public k:Lf1/c0;

.field public l:Lf1/j;

.field public m:Lf1/j;

.field public n:Z

.field public o:Lh1/b;

.field public p:Lf1/h;

.field public q:I

.field public final r:Lb/f;

.field public s:Z

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v1, "robolectric"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Li1/d;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/b;->a:Li1/d;

    .line 5
    .line 6
    sget-object v0, Lh1/c;->a:Lu2/d;

    .line 7
    .line 8
    iput-object v0, p0, Li1/b;->b:Lu2/c;

    .line 9
    .line 10
    sget-object v0, Lu2/m;->g:Lu2/m;

    .line 11
    .line 12
    iput-object v0, p0, Li1/b;->c:Lu2/m;

    .line 13
    .line 14
    sget-object v0, Li1/a;->h:Li1/a;

    .line 15
    .line 16
    iput-object v0, p0, Li1/b;->d:Lfg/l;

    .line 17
    .line 18
    new-instance v0, Lb1/f;

    .line 19
    .line 20
    const/16 v1, 0xd

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Li1/b;->e:Lb1/f;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Li1/b;->g:Z

    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    iput-wide v0, p0, Li1/b;->h:J

    .line 33
    .line 34
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    iput-wide v2, p0, Li1/b;->i:J

    .line 40
    .line 41
    new-instance v4, Lb/f;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v4, p0, Li1/b;->r:Lb/f;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-interface {p1, v4}, Li1/d;->r(Z)V

    .line 50
    .line 51
    .line 52
    iput-wide v0, p0, Li1/b;->t:J

    .line 53
    .line 54
    iput-wide v0, p0, Li1/b;->u:J

    .line 55
    .line 56
    iput-wide v2, p0, Li1/b;->v:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Li1/b;->g:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_10

    .line 7
    .line 8
    iget-boolean v1, v0, Li1/b;->w:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, v0, Li1/b;->a:Li1/d;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v4}, Li1/d;->M()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v1, v1, v5

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v4, v2}, Li1/d;->r(Z)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v4, v3, v5, v6}, Li1/d;->e(Landroid/graphics/Outline;J)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v1, v0, Li1/b;->l:Lf1/j;

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    if-eqz v1, :cond_d

    .line 45
    .line 46
    iget-object v8, v0, Li1/b;->x:Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    new-instance v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v8, v0, Li1/b;->x:Landroid/graphics/RectF;

    .line 56
    .line 57
    :cond_2
    instance-of v9, v1, Lf1/j;

    .line 58
    .line 59
    const-string v10, "Unable to obtain android.graphics.Path"

    .line 60
    .line 61
    if-eqz v9, :cond_c

    .line 62
    .line 63
    iget-object v11, v1, Lf1/j;->a:Landroid/graphics/Path;

    .line 64
    .line 65
    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 66
    .line 67
    .line 68
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v12, 0x1c

    .line 71
    .line 72
    const/4 v13, 0x1

    .line 73
    if-gt v11, v12, :cond_5

    .line 74
    .line 75
    iget-object v12, v1, Lf1/j;->a:Landroid/graphics/Path;

    .line 76
    .line 77
    invoke-virtual {v12}, Landroid/graphics/Path;->isConvex()Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-eqz v12, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iget-object v9, v0, Li1/b;->f:Landroid/graphics/Outline;

    .line 85
    .line 86
    if-eqz v9, :cond_4

    .line 87
    .line 88
    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    .line 89
    .line 90
    .line 91
    :cond_4
    iput-boolean v13, v0, Li1/b;->n:Z

    .line 92
    .line 93
    move-object v12, v3

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_1
    iget-object v12, v0, Li1/b;->f:Landroid/graphics/Outline;

    .line 96
    .line 97
    if-nez v12, :cond_6

    .line 98
    .line 99
    new-instance v12, Landroid/graphics/Outline;

    .line 100
    .line 101
    invoke-direct {v12}, Landroid/graphics/Outline;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v12, v0, Li1/b;->f:Landroid/graphics/Outline;

    .line 105
    .line 106
    :cond_6
    const/16 v14, 0x1e

    .line 107
    .line 108
    if-lt v11, v14, :cond_8

    .line 109
    .line 110
    if-eqz v9, :cond_7

    .line 111
    .line 112
    iget-object v9, v1, Lf1/j;->a:Landroid/graphics/Path;

    .line 113
    .line 114
    invoke-static {v12, v9}, Lg3/o0;->k(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    invoke-static {v10}, Lj8/o;->w(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_8
    if-eqz v9, :cond_b

    .line 123
    .line 124
    iget-object v9, v1, Lf1/j;->a:Landroid/graphics/Path;

    .line 125
    .line 126
    invoke-virtual {v12, v9}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    invoke-virtual {v12}, Landroid/graphics/Outline;->canClip()Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    xor-int/2addr v9, v13

    .line 134
    iput-boolean v9, v0, Li1/b;->n:Z

    .line 135
    .line 136
    :goto_3
    iput-object v1, v0, Li1/b;->l:Lf1/j;

    .line 137
    .line 138
    if-eqz v12, :cond_9

    .line 139
    .line 140
    invoke-interface {v4}, Li1/d;->a()F

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v12, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 145
    .line 146
    .line 147
    move-object v3, v12

    .line 148
    :cond_9
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    int-to-long v9, v1

    .line 165
    shl-long/2addr v9, v7

    .line 166
    int-to-long v7, v8

    .line 167
    and-long/2addr v5, v7

    .line 168
    or-long/2addr v5, v9

    .line 169
    invoke-interface {v4, v3, v5, v6}, Li1/d;->e(Landroid/graphics/Outline;J)V

    .line 170
    .line 171
    .line 172
    iget-boolean v1, v0, Li1/b;->n:Z

    .line 173
    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    iget-boolean v1, v0, Li1/b;->w:Z

    .line 177
    .line 178
    if-eqz v1, :cond_a

    .line 179
    .line 180
    invoke-interface {v4, v2}, Li1/d;->r(Z)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v4}, Li1/d;->j()V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_5

    .line 187
    .line 188
    :cond_a
    iget-boolean v1, v0, Li1/b;->w:Z

    .line 189
    .line 190
    invoke-interface {v4, v1}, Li1/d;->r(Z)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_5

    .line 194
    .line 195
    :cond_b
    invoke-static {v10}, Lj8/o;->w(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_c
    invoke-static {v10}, Lj8/o;->w(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_d
    iget-boolean v1, v0, Li1/b;->w:Z

    .line 204
    .line 205
    invoke-interface {v4, v1}, Li1/d;->r(Z)V

    .line 206
    .line 207
    .line 208
    iget-object v1, v0, Li1/b;->f:Landroid/graphics/Outline;

    .line 209
    .line 210
    if-nez v1, :cond_e

    .line 211
    .line 212
    new-instance v1, Landroid/graphics/Outline;

    .line 213
    .line 214
    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    .line 215
    .line 216
    .line 217
    iput-object v1, v0, Li1/b;->f:Landroid/graphics/Outline;

    .line 218
    .line 219
    :cond_e
    move-object v8, v1

    .line 220
    iget-wide v9, v0, Li1/b;->u:J

    .line 221
    .line 222
    invoke-static {v9, v10}, Lr9/e0;->q0(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v9

    .line 226
    iget-wide v11, v0, Li1/b;->h:J

    .line 227
    .line 228
    iget-wide v13, v0, Li1/b;->i:J

    .line 229
    .line 230
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    cmp-long v1, v13, v15

    .line 236
    .line 237
    if-nez v1, :cond_f

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_f
    move-wide v9, v13

    .line 241
    :goto_4
    shr-long v13, v11, v7

    .line 242
    .line 243
    long-to-int v1, v13

    .line 244
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    and-long/2addr v11, v5

    .line 253
    long-to-int v11, v11

    .line 254
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    shr-long v13, v9, v7

    .line 267
    .line 268
    long-to-int v14, v13

    .line 269
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 270
    .line 271
    .line 272
    move-result v13

    .line 273
    add-float/2addr v13, v1

    .line 274
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    and-long/2addr v9, v5

    .line 283
    long-to-int v15, v9

    .line 284
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    add-float/2addr v9, v11

    .line 289
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    iget v13, v0, Li1/b;->j:F

    .line 294
    .line 295
    move v11, v1

    .line 296
    move v10, v12

    .line 297
    move v12, v9

    .line 298
    move v9, v3

    .line 299
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v4}, Li1/d;->a()F

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 307
    .line 308
    .line 309
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    int-to-long v9, v1

    .line 326
    shl-long/2addr v9, v7

    .line 327
    int-to-long v11, v3

    .line 328
    and-long/2addr v5, v11

    .line 329
    or-long/2addr v5, v9

    .line 330
    invoke-interface {v4, v8, v5, v6}, Li1/d;->e(Landroid/graphics/Outline;J)V

    .line 331
    .line 332
    .line 333
    :cond_10
    :goto_5
    iput-boolean v2, v0, Li1/b;->g:Z

    .line 334
    .line 335
    return-void
.end method

.method public final b()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Li1/b;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget v0, p0, Li1/b;->q:I

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, Li1/b;->r:Lb/f;

    .line 10
    .line 11
    iget-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Li1/b;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v1, Li1/b;->q:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    iput v2, v1, Li1/b;->q:I

    .line 22
    .line 23
    invoke-virtual {v1}, Li1/b;->b()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v0, v0, Lb/f;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lf/l0;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    iget-object v1, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v0, Lf/l0;->a:[J

    .line 38
    .line 39
    array-length v3, v2

    .line 40
    add-int/lit8 v3, v3, -0x2

    .line 41
    .line 42
    if-ltz v3, :cond_4

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    move v5, v4

    .line 46
    :goto_0
    aget-wide v6, v2, v5

    .line 47
    .line 48
    not-long v8, v6

    .line 49
    const/4 v10, 0x7

    .line 50
    shl-long/2addr v8, v10

    .line 51
    and-long/2addr v8, v6

    .line 52
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v8, v10

    .line 58
    cmp-long v8, v8, v10

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    sub-int v8, v5, v3

    .line 63
    .line 64
    not-int v8, v8

    .line 65
    ushr-int/lit8 v8, v8, 0x1f

    .line 66
    .line 67
    const/16 v9, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v8, v8, 0x8

    .line 70
    .line 71
    move v10, v4

    .line 72
    :goto_1
    if-ge v10, v8, :cond_2

    .line 73
    .line 74
    const-wide/16 v11, 0xff

    .line 75
    .line 76
    and-long/2addr v11, v6

    .line 77
    const-wide/16 v13, 0x80

    .line 78
    .line 79
    cmp-long v11, v11, v13

    .line 80
    .line 81
    if-gez v11, :cond_1

    .line 82
    .line 83
    shl-int/lit8 v11, v5, 0x3

    .line 84
    .line 85
    add-int/2addr v11, v10

    .line 86
    aget-object v11, v1, v11

    .line 87
    .line 88
    check-cast v11, Li1/b;

    .line 89
    .line 90
    iget v12, v11, Li1/b;->q:I

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x1

    .line 93
    .line 94
    iput v12, v11, Li1/b;->q:I

    .line 95
    .line 96
    invoke-virtual {v11}, Li1/b;->b()V

    .line 97
    .line 98
    .line 99
    :cond_1
    shr-long/2addr v6, v9

    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    if-ne v8, v9, :cond_4

    .line 104
    .line 105
    :cond_3
    if-eq v5, v3, :cond_4

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {v0}, Lf/l0;->b()V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object v0, p0, Li1/b;->a:Li1/d;

    .line 114
    .line 115
    invoke-interface {v0}, Li1/d;->j()V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-void
.end method

.method public final c(Lh1/d;)V
    .locals 14

    .line 1
    iget-object v0, p0, Li1/b;->r:Lb/f;

    .line 2
    .line 3
    iget-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li1/b;

    .line 6
    .line 7
    iput-object v1, v0, Lb/f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, v0, Lb/f;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lf/l0;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lf/l0;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, Lb/f;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lf/l0;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget-object v2, Lf/s0;->a:Lf/l0;

    .line 28
    .line 29
    new-instance v2, Lf/l0;

    .line 30
    .line 31
    invoke-direct {v2}, Lf/l0;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Lb/f;->e:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v1}, Lf/l0;->j(Lf/l0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lf/l0;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v0, Lb/f;->a:Z

    .line 44
    .line 45
    iget-object v1, p0, Li1/b;->d:Lfg/l;

    .line 46
    .line 47
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-boolean p1, v0, Lb/f;->a:Z

    .line 52
    .line 53
    iget-object v1, v0, Lb/f;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Li1/b;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget v2, v1, Li1/b;->q:I

    .line 60
    .line 61
    add-int/lit8 v2, v2, -0x1

    .line 62
    .line 63
    iput v2, v1, Li1/b;->q:I

    .line 64
    .line 65
    invoke-virtual {v1}, Li1/b;->b()V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object v0, v0, Lb/f;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lf/l0;

    .line 71
    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    invoke-virtual {v0}, Lf/l0;->h()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    iget-object v1, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v2, v0, Lf/l0;->a:[J

    .line 83
    .line 84
    array-length v3, v2

    .line 85
    add-int/lit8 v3, v3, -0x2

    .line 86
    .line 87
    if-ltz v3, :cond_6

    .line 88
    .line 89
    move v4, p1

    .line 90
    :goto_0
    aget-wide v5, v2, v4

    .line 91
    .line 92
    not-long v7, v5

    .line 93
    const/4 v9, 0x7

    .line 94
    shl-long/2addr v7, v9

    .line 95
    and-long/2addr v7, v5

    .line 96
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v7, v9

    .line 102
    cmp-long v7, v7, v9

    .line 103
    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    sub-int v7, v4, v3

    .line 107
    .line 108
    not-int v7, v7

    .line 109
    ushr-int/lit8 v7, v7, 0x1f

    .line 110
    .line 111
    const/16 v8, 0x8

    .line 112
    .line 113
    rsub-int/lit8 v7, v7, 0x8

    .line 114
    .line 115
    move v9, p1

    .line 116
    :goto_1
    if-ge v9, v7, :cond_4

    .line 117
    .line 118
    const-wide/16 v10, 0xff

    .line 119
    .line 120
    and-long/2addr v10, v5

    .line 121
    const-wide/16 v12, 0x80

    .line 122
    .line 123
    cmp-long v10, v10, v12

    .line 124
    .line 125
    if-gez v10, :cond_3

    .line 126
    .line 127
    shl-int/lit8 v10, v4, 0x3

    .line 128
    .line 129
    add-int/2addr v10, v9

    .line 130
    aget-object v10, v1, v10

    .line 131
    .line 132
    check-cast v10, Li1/b;

    .line 133
    .line 134
    iget v11, v10, Li1/b;->q:I

    .line 135
    .line 136
    add-int/lit8 v11, v11, -0x1

    .line 137
    .line 138
    iput v11, v10, Li1/b;->q:I

    .line 139
    .line 140
    invoke-virtual {v10}, Li1/b;->b()V

    .line 141
    .line 142
    .line 143
    :cond_3
    shr-long/2addr v5, v8

    .line 144
    add-int/lit8 v9, v9, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-ne v7, v8, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v4, v3, :cond_6

    .line 150
    .line 151
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {v0}, Lf/l0;->b()V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final d()Lf1/c0;
    .locals 14

    .line 1
    iget-object v0, p0, Li1/b;->k:Lf1/c0;

    .line 2
    .line 3
    iget-object v1, p0, Li1/b;->l:Lf1/j;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    new-instance v0, Lf1/j0;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lf1/j0;-><init>(Lf1/j;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Li1/b;->k:Lf1/c0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, Li1/b;->u:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Lr9/e0;->q0(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Li1/b;->h:J

    .line 25
    .line 26
    iget-wide v4, p0, Li1/b;->i:J

    .line 27
    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-wide v0, v4

    .line 39
    :goto_0
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, v2, v4

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-wide v7, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v7

    .line 54
    long-to-int v2, v2

    .line 55
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    shr-long v9, v0, v4

    .line 60
    .line 61
    long-to-int v3, v9

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-float/2addr v3, v6

    .line 67
    and-long/2addr v0, v7

    .line 68
    long-to-int v0, v0

    .line 69
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-float v9, v0, v2

    .line 74
    .line 75
    iget v0, p0, Li1/b;->j:F

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    cmpl-float v1, v0, v1

    .line 79
    .line 80
    if-lez v1, :cond_3

    .line 81
    .line 82
    new-instance v1, Lf1/l0;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-long v10, v5

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v12, v0

    .line 94
    shl-long v4, v10, v4

    .line 95
    .line 96
    and-long/2addr v7, v12

    .line 97
    or-long v10, v4, v7

    .line 98
    .line 99
    move v7, v2

    .line 100
    move v8, v3

    .line 101
    invoke-static/range {v6 .. v11}, Lbe/h;->b(FFFFJ)Le1/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v1, v0}, Lf1/l0;-><init>(Le1/d;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move v7, v2

    .line 110
    move v8, v3

    .line 111
    new-instance v1, Lf1/k0;

    .line 112
    .line 113
    new-instance v0, Le1/c;

    .line 114
    .line 115
    invoke-direct {v0, v6, v7, v8, v9}, Le1/c;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, Lf1/k0;-><init>(Le1/c;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    iput-object v1, p0, Li1/b;->k:Lf1/c0;

    .line 122
    .line 123
    return-object v1
.end method

.method public final e(Lu2/c;Lu2/m;JLfg/l;)V
    .locals 6

    .line 1
    iget-wide v0, p0, Li1/b;->u:J

    .line 2
    .line 3
    invoke-static {v0, v1, p3, p4}, Lu2/l;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Li1/b;->a:Li1/d;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-wide p3, p0, Li1/b;->u:J

    .line 12
    .line 13
    iget-wide v2, p0, Li1/b;->t:J

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    shr-long v4, v2, v0

    .line 18
    .line 19
    long-to-int v0, v4

    .line 20
    const-wide v4, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    long-to-int v2, v2

    .line 27
    invoke-interface {v1, v0, v2, p3, p4}, Li1/d;->y(IIJ)V

    .line 28
    .line 29
    .line 30
    iget-wide p3, p0, Li1/b;->i:J

    .line 31
    .line 32
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long p3, p3, v2

    .line 38
    .line 39
    if-nez p3, :cond_0

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    iput-boolean p3, p0, Li1/b;->g:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Li1/b;->a()V

    .line 45
    .line 46
    .line 47
    :cond_0
    iput-object p1, p0, Li1/b;->b:Lu2/c;

    .line 48
    .line 49
    iput-object p2, p0, Li1/b;->c:Lu2/m;

    .line 50
    .line 51
    iput-object p5, p0, Li1/b;->d:Lfg/l;

    .line 52
    .line 53
    iget-object p3, p0, Li1/b;->e:Lb1/f;

    .line 54
    .line 55
    invoke-interface {v1, p1, p2, p0, p3}, Li1/d;->m(Lu2/c;Lu2/m;Li1/b;Lb1/f;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/b;->a:Li1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/d;->a()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    cmpg-float v1, v1, p1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {v0, p1}, Li1/d;->n(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final g(Lf1/n0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/b;->a:Li1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/d;->d()Lf1/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Li1/d;->L(Lf1/n0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final h(FJJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Li1/b;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1, p2, p3}, Le1/b;->b(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Li1/b;->i:J

    .line 10
    .line 11
    invoke-static {v0, v1, p4, p5}, Le1/e;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Li1/b;->j:F

    .line 18
    .line 19
    cmpg-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Li1/b;->l:Lf1/j;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Li1/b;->k:Lf1/c0;

    .line 31
    .line 32
    iput-object v0, p0, Li1/b;->l:Lf1/j;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Li1/b;->g:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Li1/b;->n:Z

    .line 39
    .line 40
    iput-wide p2, p0, Li1/b;->h:J

    .line 41
    .line 42
    iput-wide p4, p0, Li1/b;->i:J

    .line 43
    .line 44
    iput p1, p0, Li1/b;->j:F

    .line 45
    .line 46
    invoke-virtual {p0}, Li1/b;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final i(J)V
    .locals 5

    .line 1
    iget-wide v0, p0, Li1/b;->t:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lu2/j;->b(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Li1/b;->t:J

    .line 10
    .line 11
    iget-wide v0, p0, Li1/b;->u:J

    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    shr-long v2, p1, v2

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p1, v3

    .line 24
    long-to-int p1, p1

    .line 25
    iget-object p2, p0, Li1/b;->a:Li1/d;

    .line 26
    .line 27
    invoke-interface {p2, v2, p1, v0, v1}, Li1/d;->y(IIJ)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
