.class public final Lpg3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public final a:[F

.field public final b:[F

.field public final c:[F

.field public final d:[F

.field public final e:[F

.field public final f:[F

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Ljava/nio/FloatBuffer;

.field public q:[Z

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:J

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    iput-object v1, p0, Lpg3;->a:[F

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    iput-object v1, p0, Lpg3;->b:[F

    .line 13
    .line 14
    new-array v1, v0, [F

    .line 15
    .line 16
    iput-object v1, p0, Lpg3;->c:[F

    .line 17
    .line 18
    new-array v1, v0, [F

    .line 19
    .line 20
    iput-object v1, p0, Lpg3;->d:[F

    .line 21
    .line 22
    new-array v0, v0, [F

    .line 23
    .line 24
    iput-object v0, p0, Lpg3;->e:[F

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    new-array v0, v0, [F

    .line 28
    .line 29
    iput-object v0, p0, Lpg3;->f:[F

    .line 30
    .line 31
    const/high16 v0, 0x3f800000    # 1.0f

    .line 32
    .line 33
    iput v0, p0, Lpg3;->u:F

    .line 34
    .line 35
    iput v0, p0, Lpg3;->v:F

    .line 36
    .line 37
    iput v0, p0, Lpg3;->w:F

    .line 38
    .line 39
    const v0, 0x3e99999a    # 0.3f

    .line 40
    .line 41
    .line 42
    iput v0, p0, Lpg3;->x:F

    .line 43
    .line 44
    const/high16 v0, -0x41800000    # -0.25f

    .line 45
    .line 46
    iput v0, p0, Lpg3;->z:F

    .line 47
    .line 48
    const v0, 0x3e4ccccd    # 0.2f

    .line 49
    .line 50
    .line 51
    iput v0, p0, Lpg3;->A:F

    .line 52
    .line 53
    const v0, 0x3f3851ec    # 0.72f

    .line 54
    .line 55
    .line 56
    iput v0, p0, Lpg3;->B:F

    .line 57
    .line 58
    const v0, 0x3f0f5c29    # 0.56f

    .line 59
    .line 60
    .line 61
    iput v0, p0, Lpg3;->C:F

    .line 62
    .line 63
    const/high16 v0, 0x41900000    # 18.0f

    .line 64
    .line 65
    iput v0, p0, Lpg3;->D:F

    .line 66
    .line 67
    const/high16 v0, -0x3e200000    # -28.0f

    .line 68
    .line 69
    iput v0, p0, Lpg3;->E:F

    .line 70
    .line 71
    const/high16 v0, 0x40c00000    # 6.0f

    .line 72
    .line 73
    iput v0, p0, Lpg3;->F:F

    .line 74
    .line 75
    const/high16 v0, 0x43430000    # 195.0f

    .line 76
    .line 77
    iput v0, p0, Lpg3;->G:F

    .line 78
    .line 79
    return-void
.end method

.method public static a(Ldk;FFFFFFFFFFFFF)V
    .locals 15

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v4, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move/from16 v1, p1

    .line 6
    .line 7
    move/from16 v2, p2

    .line 8
    .line 9
    move/from16 v3, p3

    .line 10
    .line 11
    move/from16 v7, p13

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v7}, Ldk;->d(FFFFFFF)V

    .line 14
    .line 15
    .line 16
    const/4 v12, 0x0

    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    move-object v7, p0

    .line 20
    move/from16 v8, p4

    .line 21
    .line 22
    move/from16 v9, p5

    .line 23
    .line 24
    move/from16 v10, p6

    .line 25
    .line 26
    move/from16 v14, p13

    .line 27
    .line 28
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 29
    .line 30
    .line 31
    move/from16 v8, p7

    .line 32
    .line 33
    move/from16 v9, p8

    .line 34
    .line 35
    move/from16 v10, p9

    .line 36
    .line 37
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 38
    .line 39
    .line 40
    move/from16 v8, p1

    .line 41
    .line 42
    move/from16 v9, p2

    .line 43
    .line 44
    move/from16 v10, p3

    .line 45
    .line 46
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 47
    .line 48
    .line 49
    move/from16 v8, p7

    .line 50
    .line 51
    move/from16 v9, p8

    .line 52
    .line 53
    move/from16 v10, p9

    .line 54
    .line 55
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    const/4 v1, 0x0

    .line 60
    const/4 v2, 0x0

    .line 61
    move-object/from16 p1, p0

    .line 62
    .line 63
    move/from16 p2, p10

    .line 64
    .line 65
    move/from16 p3, p11

    .line 66
    .line 67
    move/from16 p4, p12

    .line 68
    .line 69
    move/from16 p8, p13

    .line 70
    .line 71
    move/from16 p6, v0

    .line 72
    .line 73
    move/from16 p7, v1

    .line 74
    .line 75
    move/from16 p5, v2

    .line 76
    .line 77
    invoke-virtual/range {p1 .. p8}, Ldk;->d(FFFFFFF)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static b(Ljava/lang/String;I)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1, p0}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    new-array v0, p0, [I

    .line 13
    .line 14
    const v1, 0x8b81

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {p1, v1, v0, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 19
    .line 20
    .line 21
    aget v0, v0, v2

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    return p1

    .line 26
    :cond_0
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "OpenGL shader compilation failed: "

    .line 31
    .line 32
    invoke-static {p1, p0}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lc80;->h(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return v2
.end method


# virtual methods
.method public final c(II)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    const/16 v0, 0x400

    .line 4
    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    if-ltz p2, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x100

    .line 10
    .line 11
    if-ge p2, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lpg3;->q:[Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    mul-int/2addr p2, v0

    .line 18
    add-int/2addr p2, p1

    .line 19
    aget-boolean p0, p0, p2

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const-string p0, "textMask"

    .line 26
    .line 27
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x4100

    .line 4
    .line 5
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 9
    .line 10
    if-eqz v1, :cond_14

    .line 11
    .line 12
    iget v1, v0, Lpg3;->s:I

    .line 13
    .line 14
    if-eqz v1, :cond_14

    .line 15
    .line 16
    iget v1, v0, Lpg3;->t:I

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iget-wide v3, v0, Lpg3;->y:J

    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long v5, v3, v5

    .line 31
    .line 32
    const/high16 v6, 0x43b40000    # 360.0f

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    if-eqz v5, :cond_6

    .line 36
    .line 37
    sub-long v3, v1, v3

    .line 38
    .line 39
    long-to-float v3, v3

    .line 40
    const v4, 0x4e6e6b28    # 1.0E9f

    .line 41
    .line 42
    .line 43
    div-float/2addr v3, v4

    .line 44
    const v4, 0x3d4ccccd    # 0.05f

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v7, v4}, Lci0;->C(FFF)F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget v5, v0, Lpg3;->D:F

    .line 52
    .line 53
    const/high16 v8, 0x41b80000    # 23.0f

    .line 54
    .line 55
    mul-float/2addr v8, v3

    .line 56
    add-float/2addr v8, v5

    .line 57
    rem-float/2addr v8, v6

    .line 58
    iput v8, v0, Lpg3;->D:F

    .line 59
    .line 60
    iget v5, v0, Lpg3;->E:F

    .line 61
    .line 62
    const/high16 v9, 0x41f80000    # 31.0f

    .line 63
    .line 64
    mul-float/2addr v9, v3

    .line 65
    add-float/2addr v9, v5

    .line 66
    rem-float/2addr v9, v6

    .line 67
    iput v9, v0, Lpg3;->E:F

    .line 68
    .line 69
    iget v5, v0, Lpg3;->F:F

    .line 70
    .line 71
    const/high16 v10, 0x41100000    # 9.0f

    .line 72
    .line 73
    mul-float/2addr v10, v3

    .line 74
    add-float/2addr v10, v5

    .line 75
    rem-float/2addr v10, v6

    .line 76
    iput v10, v0, Lpg3;->F:F

    .line 77
    .line 78
    iget v5, v0, Lpg3;->G:F

    .line 79
    .line 80
    const/high16 v11, 0x41400000    # 12.0f

    .line 81
    .line 82
    mul-float/2addr v11, v3

    .line 83
    add-float/2addr v11, v5

    .line 84
    rem-float/2addr v11, v6

    .line 85
    iput v11, v0, Lpg3;->G:F

    .line 86
    .line 87
    iget v5, v0, Lpg3;->z:F

    .line 88
    .line 89
    iget v11, v0, Lpg3;->B:F

    .line 90
    .line 91
    mul-float/2addr v11, v3

    .line 92
    add-float/2addr v11, v5

    .line 93
    iput v11, v0, Lpg3;->z:F

    .line 94
    .line 95
    iget v5, v0, Lpg3;->A:F

    .line 96
    .line 97
    iget v11, v0, Lpg3;->C:F

    .line 98
    .line 99
    mul-float/2addr v11, v3

    .line 100
    add-float/2addr v11, v5

    .line 101
    iput v11, v0, Lpg3;->A:F

    .line 102
    .line 103
    float-to-double v11, v8

    .line 104
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v13

    .line 108
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 109
    .line 110
    .line 111
    move-result-wide v13

    .line 112
    double-to-float v3, v13

    .line 113
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v11

    .line 117
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v11

    .line 121
    double-to-float v5, v11

    .line 122
    float-to-double v8, v9

    .line 123
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide v11

    .line 127
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 128
    .line 129
    .line 130
    move-result-wide v11

    .line 131
    double-to-float v11, v11

    .line 132
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v8

    .line 136
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 137
    .line 138
    .line 139
    move-result-wide v8

    .line 140
    double-to-float v8, v8

    .line 141
    float-to-double v9, v10

    .line 142
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v12

    .line 146
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 147
    .line 148
    .line 149
    move-result-wide v12

    .line 150
    double-to-float v12, v12

    .line 151
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v9

    .line 155
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v9

    .line 159
    double-to-float v9, v9

    .line 160
    mul-float v10, v8, v9

    .line 161
    .line 162
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    iget v13, v0, Lpg3;->w:F

    .line 167
    .line 168
    mul-float/2addr v10, v13

    .line 169
    mul-float v13, v3, v11

    .line 170
    .line 171
    mul-float v14, v13, v9

    .line 172
    .line 173
    mul-float v15, v5, v12

    .line 174
    .line 175
    sub-float/2addr v14, v15

    .line 176
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    iget v15, v0, Lpg3;->x:F

    .line 181
    .line 182
    mul-float/2addr v14, v15

    .line 183
    add-float/2addr v14, v10

    .line 184
    mul-float/2addr v11, v5

    .line 185
    mul-float v10, v11, v9

    .line 186
    .line 187
    mul-float v15, v3, v12

    .line 188
    .line 189
    add-float/2addr v15, v10

    .line 190
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    mul-float/2addr v10, v4

    .line 195
    add-float/2addr v10, v14

    .line 196
    mul-float/2addr v8, v12

    .line 197
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    iget v14, v0, Lpg3;->w:F

    .line 202
    .line 203
    mul-float/2addr v8, v14

    .line 204
    mul-float/2addr v13, v12

    .line 205
    mul-float/2addr v5, v9

    .line 206
    add-float/2addr v5, v13

    .line 207
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    iget v13, v0, Lpg3;->x:F

    .line 212
    .line 213
    mul-float/2addr v5, v13

    .line 214
    add-float/2addr v5, v8

    .line 215
    mul-float/2addr v11, v12

    .line 216
    mul-float/2addr v3, v9

    .line 217
    sub-float/2addr v11, v3

    .line 218
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    mul-float/2addr v3, v4

    .line 223
    add-float/2addr v3, v5

    .line 224
    iget v4, v0, Lpg3;->u:F

    .line 225
    .line 226
    neg-float v5, v4

    .line 227
    add-float/2addr v5, v10

    .line 228
    sub-float/2addr v4, v10

    .line 229
    iget v8, v0, Lpg3;->v:F

    .line 230
    .line 231
    neg-float v9, v8

    .line 232
    add-float/2addr v9, v3

    .line 233
    sub-float/2addr v8, v3

    .line 234
    cmpl-float v3, v5, v4

    .line 235
    .line 236
    if-ltz v3, :cond_1

    .line 237
    .line 238
    iput v7, v0, Lpg3;->z:F

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_1
    iget v3, v0, Lpg3;->z:F

    .line 242
    .line 243
    cmpg-float v10, v3, v5

    .line 244
    .line 245
    if-gtz v10, :cond_2

    .line 246
    .line 247
    iput v5, v0, Lpg3;->z:F

    .line 248
    .line 249
    iget v3, v0, Lpg3;->B:F

    .line 250
    .line 251
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    iput v3, v0, Lpg3;->B:F

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_2
    cmpl-float v3, v3, v4

    .line 259
    .line 260
    if-ltz v3, :cond_3

    .line 261
    .line 262
    iput v4, v0, Lpg3;->z:F

    .line 263
    .line 264
    iget v3, v0, Lpg3;->B:F

    .line 265
    .line 266
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    neg-float v3, v3

    .line 271
    iput v3, v0, Lpg3;->B:F

    .line 272
    .line 273
    :cond_3
    :goto_0
    cmpl-float v3, v9, v8

    .line 274
    .line 275
    if-ltz v3, :cond_4

    .line 276
    .line 277
    iput v7, v0, Lpg3;->A:F

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_4
    iget v3, v0, Lpg3;->A:F

    .line 281
    .line 282
    cmpg-float v4, v3, v9

    .line 283
    .line 284
    if-gtz v4, :cond_5

    .line 285
    .line 286
    iput v9, v0, Lpg3;->A:F

    .line 287
    .line 288
    iget v3, v0, Lpg3;->C:F

    .line 289
    .line 290
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    iput v3, v0, Lpg3;->C:F

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_5
    cmpl-float v3, v3, v8

    .line 298
    .line 299
    if-ltz v3, :cond_6

    .line 300
    .line 301
    iput v8, v0, Lpg3;->A:F

    .line 302
    .line 303
    iget v3, v0, Lpg3;->C:F

    .line 304
    .line 305
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    neg-float v3, v3

    .line 310
    iput v3, v0, Lpg3;->C:F

    .line 311
    .line 312
    :cond_6
    :goto_1
    iput-wide v1, v0, Lpg3;->y:J

    .line 313
    .line 314
    iget-object v8, v0, Lpg3;->c:[F

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    invoke-static {v8, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 318
    .line 319
    .line 320
    iget v2, v0, Lpg3;->z:F

    .line 321
    .line 322
    iget v3, v0, Lpg3;->A:F

    .line 323
    .line 324
    invoke-static {v8, v1, v2, v3, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 325
    .line 326
    .line 327
    iget v10, v0, Lpg3;->F:F

    .line 328
    .line 329
    const/4 v12, 0x0

    .line 330
    const/high16 v13, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v9, 0x0

    .line 333
    const/4 v11, 0x0

    .line 334
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 335
    .line 336
    .line 337
    iget v10, v0, Lpg3;->E:F

    .line 338
    .line 339
    const/high16 v12, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 343
    .line 344
    .line 345
    iget v10, v0, Lpg3;->D:F

    .line 346
    .line 347
    const/4 v12, 0x0

    .line 348
    const/high16 v11, 0x3f800000    # 1.0f

    .line 349
    .line 350
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 351
    .line 352
    .line 353
    const/4 v11, 0x0

    .line 354
    const/4 v13, 0x0

    .line 355
    move-object v12, v8

    .line 356
    iget-object v8, v0, Lpg3;->d:[F

    .line 357
    .line 358
    iget-object v10, v0, Lpg3;->b:[F

    .line 359
    .line 360
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v18, v8

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/16 v19, 0x0

    .line 368
    .line 369
    iget-object v14, v0, Lpg3;->e:[F

    .line 370
    .line 371
    const/4 v15, 0x0

    .line 372
    iget-object v2, v0, Lpg3;->a:[F

    .line 373
    .line 374
    move-object/from16 v16, v2

    .line 375
    .line 376
    invoke-static/range {v14 .. v19}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 377
    .line 378
    .line 379
    iget v2, v0, Lpg3;->G:F

    .line 380
    .line 381
    rem-float/2addr v2, v6

    .line 382
    add-float/2addr v2, v6

    .line 383
    rem-float/2addr v2, v6

    .line 384
    const/high16 v3, 0x42700000    # 60.0f

    .line 385
    .line 386
    div-float v4, v2, v3

    .line 387
    .line 388
    const/high16 v5, 0x40000000    # 2.0f

    .line 389
    .line 390
    rem-float/2addr v4, v5

    .line 391
    const/high16 v5, 0x3f800000    # 1.0f

    .line 392
    .line 393
    sub-float/2addr v4, v5

    .line 394
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    sub-float/2addr v5, v4

    .line 399
    const v4, 0x3f5c28f6    # 0.86f

    .line 400
    .line 401
    .line 402
    mul-float/2addr v5, v4

    .line 403
    cmpg-float v3, v2, v3

    .line 404
    .line 405
    const/4 v6, 0x3

    .line 406
    const/4 v8, 0x1

    .line 407
    const/4 v9, 0x2

    .line 408
    if-gez v3, :cond_7

    .line 409
    .line 410
    new-array v2, v6, [F

    .line 411
    .line 412
    aput v4, v2, v1

    .line 413
    .line 414
    aput v5, v2, v8

    .line 415
    .line 416
    aput v7, v2, v9

    .line 417
    .line 418
    goto :goto_2

    .line 419
    :cond_7
    const/high16 v3, 0x42f00000    # 120.0f

    .line 420
    .line 421
    cmpg-float v3, v2, v3

    .line 422
    .line 423
    if-gez v3, :cond_8

    .line 424
    .line 425
    new-array v2, v6, [F

    .line 426
    .line 427
    aput v5, v2, v1

    .line 428
    .line 429
    aput v4, v2, v8

    .line 430
    .line 431
    aput v7, v2, v9

    .line 432
    .line 433
    goto :goto_2

    .line 434
    :cond_8
    const/high16 v3, 0x43340000    # 180.0f

    .line 435
    .line 436
    cmpg-float v3, v2, v3

    .line 437
    .line 438
    if-gez v3, :cond_9

    .line 439
    .line 440
    new-array v2, v6, [F

    .line 441
    .line 442
    aput v7, v2, v1

    .line 443
    .line 444
    aput v4, v2, v8

    .line 445
    .line 446
    aput v5, v2, v9

    .line 447
    .line 448
    goto :goto_2

    .line 449
    :cond_9
    const/high16 v3, 0x43700000    # 240.0f

    .line 450
    .line 451
    cmpg-float v3, v2, v3

    .line 452
    .line 453
    if-gez v3, :cond_a

    .line 454
    .line 455
    new-array v2, v6, [F

    .line 456
    .line 457
    aput v7, v2, v1

    .line 458
    .line 459
    aput v5, v2, v8

    .line 460
    .line 461
    aput v4, v2, v9

    .line 462
    .line 463
    goto :goto_2

    .line 464
    :cond_a
    const/high16 v3, 0x43960000    # 300.0f

    .line 465
    .line 466
    cmpg-float v2, v2, v3

    .line 467
    .line 468
    if-gez v2, :cond_b

    .line 469
    .line 470
    new-array v2, v6, [F

    .line 471
    .line 472
    aput v5, v2, v1

    .line 473
    .line 474
    aput v7, v2, v8

    .line 475
    .line 476
    aput v4, v2, v9

    .line 477
    .line 478
    goto :goto_2

    .line 479
    :cond_b
    new-array v2, v6, [F

    .line 480
    .line 481
    aput v4, v2, v1

    .line 482
    .line 483
    aput v7, v2, v8

    .line 484
    .line 485
    aput v5, v2, v9

    .line 486
    .line 487
    :goto_2
    aget v3, v2, v1

    .line 488
    .line 489
    aget v4, v2, v8

    .line 490
    .line 491
    aget v2, v2, v9

    .line 492
    .line 493
    const v5, 0x3e0f5c28    # 0.13999999f

    .line 494
    .line 495
    .line 496
    add-float/2addr v3, v5

    .line 497
    iget-object v7, v0, Lpg3;->f:[F

    .line 498
    .line 499
    aput v3, v7, v1

    .line 500
    .line 501
    add-float/2addr v4, v5

    .line 502
    aput v4, v7, v8

    .line 503
    .line 504
    add-float/2addr v2, v5

    .line 505
    aput v2, v7, v9

    .line 506
    .line 507
    iget v2, v0, Lpg3;->g:I

    .line 508
    .line 509
    invoke-static {v2}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 510
    .line 511
    .line 512
    const v2, 0x84c0

    .line 513
    .line 514
    .line 515
    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 516
    .line 517
    .line 518
    const/16 v2, 0xde1

    .line 519
    .line 520
    iget v3, v0, Lpg3;->h:I

    .line 521
    .line 522
    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 523
    .line 524
    .line 525
    iget v2, v0, Lpg3;->o:I

    .line 526
    .line 527
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 528
    .line 529
    .line 530
    iget v2, v0, Lpg3;->m:I

    .line 531
    .line 532
    invoke-static {v2, v8, v1, v14, v1}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 533
    .line 534
    .line 535
    iget v2, v0, Lpg3;->n:I

    .line 536
    .line 537
    invoke-static {v2, v8, v7, v1}, Landroid/opengl/GLES20;->glUniform3fv(II[FI)V

    .line 538
    .line 539
    .line 540
    iget-object v2, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 541
    .line 542
    const/4 v3, 0x0

    .line 543
    const-string v4, "cubeVertices"

    .line 544
    .line 545
    if-eqz v2, :cond_13

    .line 546
    .line 547
    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 548
    .line 549
    .line 550
    iget v2, v0, Lpg3;->i:I

    .line 551
    .line 552
    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 553
    .line 554
    .line 555
    iget v2, v0, Lpg3;->j:I

    .line 556
    .line 557
    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 558
    .line 559
    .line 560
    iget v2, v0, Lpg3;->k:I

    .line 561
    .line 562
    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 563
    .line 564
    .line 565
    iget v2, v0, Lpg3;->l:I

    .line 566
    .line 567
    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 568
    .line 569
    .line 570
    iget v7, v0, Lpg3;->i:I

    .line 571
    .line 572
    iget-object v12, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 573
    .line 574
    if-eqz v12, :cond_12

    .line 575
    .line 576
    const/4 v8, 0x3

    .line 577
    const/16 v9, 0x1406

    .line 578
    .line 579
    const/4 v10, 0x0

    .line 580
    const/16 v11, 0x1c

    .line 581
    .line 582
    invoke-static/range {v7 .. v12}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 583
    .line 584
    .line 585
    iget-object v2, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 586
    .line 587
    if-eqz v2, :cond_11

    .line 588
    .line 589
    invoke-virtual {v2, v6}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 590
    .line 591
    .line 592
    iget v7, v0, Lpg3;->j:I

    .line 593
    .line 594
    iget-object v12, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 595
    .line 596
    if-eqz v12, :cond_10

    .line 597
    .line 598
    const/4 v8, 0x2

    .line 599
    const/16 v9, 0x1406

    .line 600
    .line 601
    const/4 v10, 0x0

    .line 602
    const/16 v11, 0x1c

    .line 603
    .line 604
    invoke-static/range {v7 .. v12}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 605
    .line 606
    .line 607
    iget-object v2, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 608
    .line 609
    if-eqz v2, :cond_f

    .line 610
    .line 611
    const/4 v5, 0x5

    .line 612
    invoke-virtual {v2, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 613
    .line 614
    .line 615
    iget v6, v0, Lpg3;->k:I

    .line 616
    .line 617
    iget-object v11, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 618
    .line 619
    if-eqz v11, :cond_e

    .line 620
    .line 621
    const/4 v7, 0x1

    .line 622
    const/16 v8, 0x1406

    .line 623
    .line 624
    const/4 v9, 0x0

    .line 625
    const/16 v10, 0x1c

    .line 626
    .line 627
    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 628
    .line 629
    .line 630
    iget-object v2, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 631
    .line 632
    if-eqz v2, :cond_d

    .line 633
    .line 634
    const/4 v5, 0x6

    .line 635
    invoke-virtual {v2, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 636
    .line 637
    .line 638
    iget v6, v0, Lpg3;->l:I

    .line 639
    .line 640
    iget-object v11, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 641
    .line 642
    if-eqz v11, :cond_c

    .line 643
    .line 644
    const/4 v7, 0x1

    .line 645
    const/16 v8, 0x1406

    .line 646
    .line 647
    const/4 v9, 0x0

    .line 648
    const/16 v10, 0x1c

    .line 649
    .line 650
    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 651
    .line 652
    .line 653
    const/4 v2, 0x4

    .line 654
    iget v3, v0, Lpg3;->r:I

    .line 655
    .line 656
    invoke-static {v2, v1, v3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 657
    .line 658
    .line 659
    iget v1, v0, Lpg3;->i:I

    .line 660
    .line 661
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 662
    .line 663
    .line 664
    iget v1, v0, Lpg3;->j:I

    .line 665
    .line 666
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 667
    .line 668
    .line 669
    iget v1, v0, Lpg3;->k:I

    .line 670
    .line 671
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 672
    .line 673
    .line 674
    iget v0, v0, Lpg3;->l:I

    .line 675
    .line 676
    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 677
    .line 678
    .line 679
    return-void

    .line 680
    :cond_c
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v3

    .line 684
    :cond_d
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    throw v3

    .line 688
    :cond_e
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    throw v3

    .line 692
    :cond_f
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    throw v3

    .line 696
    :cond_10
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v3

    .line 700
    :cond_11
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    throw v3

    .line 704
    :cond_12
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    throw v3

    .line 708
    :cond_13
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v3

    .line 712
    :cond_14
    :goto_3
    return-void
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iput v1, v0, Lpg3;->s:I

    .line 8
    .line 9
    iput v2, v0, Lpg3;->t:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v3, v3, v1, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 13
    .line 14
    .line 15
    int-to-float v1, v1

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ge v2, v4, :cond_0

    .line 18
    .line 19
    move v2, v4

    .line 20
    :cond_0
    int-to-float v2, v2

    .line 21
    div-float v8, v1, v2

    .line 22
    .line 23
    const v9, 0x3dcccccd    # 0.1f

    .line 24
    .line 25
    .line 26
    const/high16 v10, 0x41a00000    # 20.0f

    .line 27
    .line 28
    iget-object v5, v0, Lpg3;->a:[F

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/high16 v7, 0x42400000    # 48.0f

    .line 32
    .line 33
    invoke-static/range {v5 .. v10}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    .line 34
    .line 35
    .line 36
    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {v1, v2}, Ljava/lang/Math;->tan(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    double-to-float v1, v1

    .line 47
    const/high16 v2, 0x40a00000    # 5.0f

    .line 48
    .line 49
    mul-float/2addr v1, v2

    .line 50
    iput v1, v0, Lpg3;->v:F

    .line 51
    .line 52
    mul-float/2addr v1, v8

    .line 53
    iput v1, v0, Lpg3;->u:F

    .line 54
    .line 55
    iget v2, v0, Lpg3;->s:I

    .line 56
    .line 57
    if-eqz v2, :cond_10

    .line 58
    .line 59
    iget v2, v0, Lpg3;->t:I

    .line 60
    .line 61
    if-eqz v2, :cond_10

    .line 62
    .line 63
    iget-object v2, v0, Lpg3;->q:[Z

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_b

    .line 68
    .line 69
    :cond_1
    const v2, 0x3f2e147b    # 0.68f

    .line 70
    .line 71
    .line 72
    mul-float/2addr v1, v2

    .line 73
    const v2, 0x40066666    # 2.1f

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    iput v6, v0, Lpg3;->w:F

    .line 81
    .line 82
    const/high16 v1, 0x40800000    # 4.0f

    .line 83
    .line 84
    div-float v1, v6, v1

    .line 85
    .line 86
    iput v1, v0, Lpg3;->x:F

    .line 87
    .line 88
    neg-float v8, v6

    .line 89
    neg-float v7, v1

    .line 90
    move v2, v3

    .line 91
    move v5, v2

    .line 92
    :goto_0
    const/16 v15, 0x400

    .line 93
    .line 94
    const/16 v9, 0x100

    .line 95
    .line 96
    if-ge v2, v9, :cond_7

    .line 97
    .line 98
    move v9, v3

    .line 99
    :goto_1
    if-ge v9, v15, :cond_6

    .line 100
    .line 101
    invoke-virtual {v0, v9, v2}, Lpg3;->c(II)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_5

    .line 106
    .line 107
    add-int/lit8 v10, v9, -0x1

    .line 108
    .line 109
    invoke-virtual {v0, v10, v2}, Lpg3;->c(II)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-nez v10, :cond_2

    .line 114
    .line 115
    add-int/lit8 v5, v5, 0x1

    .line 116
    .line 117
    :cond_2
    add-int/lit8 v10, v9, 0x1

    .line 118
    .line 119
    invoke-virtual {v0, v10, v2}, Lpg3;->c(II)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-nez v10, :cond_3

    .line 124
    .line 125
    add-int/lit8 v5, v5, 0x1

    .line 126
    .line 127
    :cond_3
    add-int/lit8 v10, v2, -0x1

    .line 128
    .line 129
    invoke-virtual {v0, v9, v10}, Lpg3;->c(II)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-nez v10, :cond_4

    .line 134
    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    :cond_4
    add-int/lit8 v10, v2, 0x1

    .line 138
    .line 139
    invoke-virtual {v0, v9, v10}, Lpg3;->c(II)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-nez v10, :cond_5

    .line 144
    .line 145
    add-int/lit8 v5, v5, 0x1

    .line 146
    .line 147
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_7
    move v2, v9

    .line 154
    move v9, v7

    .line 155
    new-instance v7, Ldk;

    .line 156
    .line 157
    mul-int/lit8 v5, v5, 0x6

    .line 158
    .line 159
    add-int/lit8 v5, v5, 0xc

    .line 160
    .line 161
    mul-int/lit8 v5, v5, 0x7

    .line 162
    .line 163
    const/16 v10, 0xf

    .line 164
    .line 165
    invoke-direct {v7, v3, v10}, Ldk;-><init>(BI)V

    .line 166
    .line 167
    .line 168
    if-ge v5, v4, :cond_8

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    move v4, v5

    .line 172
    :goto_2
    new-array v4, v4, [F

    .line 173
    .line 174
    iput-object v4, v7, Ldk;->j:Ljava/lang/Object;

    .line 175
    .line 176
    const/high16 v13, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v14, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const v10, 0x3d4ccccd    # 0.05f

    .line 181
    .line 182
    .line 183
    const/4 v11, 0x0

    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 187
    .line 188
    .line 189
    move-object v5, v7

    .line 190
    move v4, v8

    .line 191
    move v8, v10

    .line 192
    const/high16 v11, 0x3f800000    # 1.0f

    .line 193
    .line 194
    move v7, v9

    .line 195
    const/high16 v9, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/high16 v10, 0x3f800000    # 1.0f

    .line 198
    .line 199
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 200
    .line 201
    .line 202
    move v13, v7

    .line 203
    const/4 v10, 0x0

    .line 204
    move v7, v1

    .line 205
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 206
    .line 207
    .line 208
    move v9, v13

    .line 209
    const/high16 v13, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v11, 0x0

    .line 212
    move-object v7, v5

    .line 213
    move v10, v8

    .line 214
    move v8, v4

    .line 215
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 216
    .line 217
    .line 218
    move/from16 v16, v9

    .line 219
    .line 220
    move v8, v10

    .line 221
    const/high16 v11, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v9, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    move v7, v1

    .line 227
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 228
    .line 229
    .line 230
    const/4 v11, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    move v9, v7

    .line 233
    move v10, v8

    .line 234
    move v8, v4

    .line 235
    move-object v7, v5

    .line 236
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 237
    .line 238
    .line 239
    move v1, v9

    .line 240
    move/from16 v19, v10

    .line 241
    .line 242
    const/high16 v11, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/high16 v12, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const v8, -0x42b33333    # -0.05f

    .line 247
    .line 248
    .line 249
    const/high16 v9, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v10, 0x3f800000    # 1.0f

    .line 252
    .line 253
    move/from16 v7, v16

    .line 254
    .line 255
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 256
    .line 257
    .line 258
    move v9, v7

    .line 259
    const/4 v11, 0x0

    .line 260
    move-object v7, v5

    .line 261
    move v10, v8

    .line 262
    move v8, v4

    .line 263
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 264
    .line 265
    .line 266
    move/from16 v16, v9

    .line 267
    .line 268
    const/4 v12, 0x0

    .line 269
    move v9, v1

    .line 270
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 271
    .line 272
    .line 273
    move v8, v10

    .line 274
    const/high16 v11, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v12, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v9, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/high16 v10, 0x3f800000    # 1.0f

    .line 281
    .line 282
    move/from16 v7, v16

    .line 283
    .line 284
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 285
    .line 286
    .line 287
    const/4 v11, 0x0

    .line 288
    const/4 v12, 0x0

    .line 289
    move v9, v1

    .line 290
    move-object v7, v5

    .line 291
    move v10, v8

    .line 292
    move v8, v4

    .line 293
    invoke-virtual/range {v7 .. v14}, Ldk;->d(FFFFFFF)V

    .line 294
    .line 295
    .line 296
    move v7, v9

    .line 297
    move v8, v10

    .line 298
    const/high16 v11, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v9, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v10, 0x0

    .line 305
    invoke-virtual/range {v5 .. v12}, Ldk;->d(FFFFFFF)V

    .line 306
    .line 307
    .line 308
    iget v1, v0, Lpg3;->w:F

    .line 309
    .line 310
    const/high16 v6, 0x40000000    # 2.0f

    .line 311
    .line 312
    mul-float/2addr v1, v6

    .line 313
    const/high16 v9, 0x44800000    # 1024.0f

    .line 314
    .line 315
    div-float/2addr v1, v9

    .line 316
    iget v9, v0, Lpg3;->x:F

    .line 317
    .line 318
    mul-float/2addr v9, v6

    .line 319
    const/high16 v6, 0x43800000    # 256.0f

    .line 320
    .line 321
    div-float/2addr v9, v6

    .line 322
    move v6, v3

    .line 323
    :goto_3
    if-ge v6, v2, :cond_f

    .line 324
    .line 325
    int-to-float v10, v6

    .line 326
    mul-float/2addr v10, v9

    .line 327
    sub-float v24, v7, v10

    .line 328
    .line 329
    sub-float v18, v24, v9

    .line 330
    .line 331
    move v10, v3

    .line 332
    :goto_4
    if-ge v10, v15, :cond_e

    .line 333
    .line 334
    invoke-virtual {v0, v10, v6}, Lpg3;->c(II)Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-eqz v11, :cond_d

    .line 339
    .line 340
    int-to-float v11, v10

    .line 341
    mul-float/2addr v11, v1

    .line 342
    add-float v17, v11, v4

    .line 343
    .line 344
    add-float v11, v17, v1

    .line 345
    .line 346
    add-int/lit8 v12, v10, -0x1

    .line 347
    .line 348
    invoke-virtual {v0, v12, v6}, Lpg3;->c(II)Z

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    if-nez v12, :cond_9

    .line 353
    .line 354
    const v29, 0x3eeb851f    # 0.46f

    .line 355
    .line 356
    .line 357
    move/from16 v20, v17

    .line 358
    .line 359
    move/from16 v21, v18

    .line 360
    .line 361
    move/from16 v23, v17

    .line 362
    .line 363
    move/from16 v25, v19

    .line 364
    .line 365
    move/from16 v26, v17

    .line 366
    .line 367
    move/from16 v27, v24

    .line 368
    .line 369
    move/from16 v28, v8

    .line 370
    .line 371
    move-object/from16 v16, v5

    .line 372
    .line 373
    move/from16 v22, v19

    .line 374
    .line 375
    move/from16 v19, v8

    .line 376
    .line 377
    invoke-static/range {v16 .. v29}, Lpg3;->a(Ldk;FFFFFFFFFFFFF)V

    .line 378
    .line 379
    .line 380
    move/from16 v5, v22

    .line 381
    .line 382
    move/from16 v22, v19

    .line 383
    .line 384
    move/from16 v19, v5

    .line 385
    .line 386
    move-object/from16 v5, v16

    .line 387
    .line 388
    :goto_5
    move/from16 v8, v17

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_9
    move/from16 v22, v8

    .line 392
    .line 393
    goto :goto_5

    .line 394
    :goto_6
    add-int/lit8 v12, v10, 0x1

    .line 395
    .line 396
    invoke-virtual {v0, v12, v6}, Lpg3;->c(II)Z

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    if-nez v12, :cond_a

    .line 401
    .line 402
    const v29, 0x3eeb851f    # 0.46f

    .line 403
    .line 404
    .line 405
    move/from16 v20, v11

    .line 406
    .line 407
    move/from16 v21, v18

    .line 408
    .line 409
    move/from16 v23, v11

    .line 410
    .line 411
    move/from16 v25, v22

    .line 412
    .line 413
    move/from16 v26, v11

    .line 414
    .line 415
    move/from16 v27, v24

    .line 416
    .line 417
    move/from16 v28, v19

    .line 418
    .line 419
    move-object/from16 v16, v5

    .line 420
    .line 421
    move/from16 v17, v11

    .line 422
    .line 423
    invoke-static/range {v16 .. v29}, Lpg3;->a(Ldk;FFFFFFFFFFFFF)V

    .line 424
    .line 425
    .line 426
    move/from16 v20, v17

    .line 427
    .line 428
    :goto_7
    move/from16 v11, v18

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_a
    move/from16 v20, v11

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :goto_8
    add-int/lit8 v12, v6, -0x1

    .line 435
    .line 436
    invoke-virtual {v0, v10, v12}, Lpg3;->c(II)Z

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    if-nez v12, :cond_b

    .line 441
    .line 442
    const v29, 0x3f147ae1    # 0.58f

    .line 443
    .line 444
    .line 445
    move/from16 v21, v24

    .line 446
    .line 447
    move/from16 v25, v22

    .line 448
    .line 449
    move/from16 v22, v19

    .line 450
    .line 451
    move/from16 v23, v20

    .line 452
    .line 453
    move/from16 v18, v24

    .line 454
    .line 455
    move/from16 v26, v8

    .line 456
    .line 457
    move/from16 v27, v18

    .line 458
    .line 459
    move/from16 v28, v25

    .line 460
    .line 461
    move-object/from16 v16, v5

    .line 462
    .line 463
    move/from16 v17, v8

    .line 464
    .line 465
    invoke-static/range {v16 .. v29}, Lpg3;->a(Ldk;FFFFFFFFFFFFF)V

    .line 466
    .line 467
    .line 468
    move/from16 v8, v18

    .line 469
    .line 470
    move/from16 v22, v25

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_b
    move/from16 v17, v8

    .line 474
    .line 475
    move/from16 v8, v24

    .line 476
    .line 477
    :goto_9
    add-int/lit8 v12, v6, 0x1

    .line 478
    .line 479
    invoke-virtual {v0, v10, v12}, Lpg3;->c(II)Z

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    if-nez v12, :cond_c

    .line 484
    .line 485
    const v29, 0x3f147ae1    # 0.58f

    .line 486
    .line 487
    .line 488
    move/from16 v21, v11

    .line 489
    .line 490
    move/from16 v25, v22

    .line 491
    .line 492
    move/from16 v23, v20

    .line 493
    .line 494
    move/from16 v24, v11

    .line 495
    .line 496
    move/from16 v26, v17

    .line 497
    .line 498
    move/from16 v27, v11

    .line 499
    .line 500
    move/from16 v28, v19

    .line 501
    .line 502
    move/from16 v16, v25

    .line 503
    .line 504
    move/from16 v25, v19

    .line 505
    .line 506
    move/from16 v19, v16

    .line 507
    .line 508
    move-object/from16 v16, v5

    .line 509
    .line 510
    move/from16 v18, v11

    .line 511
    .line 512
    invoke-static/range {v16 .. v29}, Lpg3;->a(Ldk;FFFFFFFFFFFFF)V

    .line 513
    .line 514
    .line 515
    move/from16 v22, v19

    .line 516
    .line 517
    move/from16 v19, v25

    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_c
    move/from16 v18, v11

    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_d
    move/from16 v22, v8

    .line 524
    .line 525
    move/from16 v8, v24

    .line 526
    .line 527
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 528
    .line 529
    move/from16 v24, v8

    .line 530
    .line 531
    move/from16 v8, v22

    .line 532
    .line 533
    goto/16 :goto_4

    .line 534
    .line 535
    :cond_e
    move/from16 v22, v8

    .line 536
    .line 537
    add-int/lit8 v6, v6, 0x1

    .line 538
    .line 539
    goto/16 :goto_3

    .line 540
    .line 541
    :cond_f
    iget-object v1, v5, Ldk;->j:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v1, [F

    .line 544
    .line 545
    iget v2, v5, Ldk;->i:I

    .line 546
    .line 547
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    array-length v2, v1

    .line 552
    div-int/lit8 v2, v2, 0x7

    .line 553
    .line 554
    iput v2, v0, Lpg3;->r:I

    .line 555
    .line 556
    array-length v2, v1

    .line 557
    mul-int/lit8 v2, v2, 0x4

    .line 558
    .line 559
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 579
    .line 580
    .line 581
    iput-object v2, v0, Lpg3;->p:Ljava/nio/FloatBuffer;

    .line 582
    .line 583
    :cond_10
    :goto_b
    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    invoke-static {v1, v1, v1, v2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0xb44

    .line 10
    .line 11
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x405

    .line 15
    .line 16
    invoke-static {v1}, Landroid/opengl/GLES20;->glCullFace(I)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0xb71

    .line 20
    .line 21
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x203

    .line 25
    .line 26
    invoke-static {v1}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    .line 27
    .line 28
    .line 29
    const/16 v1, 0xbe2

    .line 30
    .line 31
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 32
    .line 33
    .line 34
    const/16 v1, 0x302

    .line 35
    .line 36
    const/16 v3, 0x303

    .line 37
    .line 38
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 39
    .line 40
    .line 41
    const v1, 0x8b31

    .line 42
    .line 43
    .line 44
    const-string v3, "\n    attribute vec3 aPosition;\n    attribute vec2 aTextureCoordinate;\n    attribute float aCap;\n    attribute float aShade;\n    uniform mat4 uModelViewProjection;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        vTextureCoordinate = aTextureCoordinate;\n        vCap = aCap;\n        vShade = aShade;\n        gl_Position = uModelViewProjection * vec4(aPosition, 1.0);\n    }\n"

    .line 45
    .line 46
    invoke-static {v3, v1}, Lpg3;->b(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const v3, 0x8b30

    .line 51
    .line 52
    .line 53
    const-string v4, "\n    precision mediump float;\n    uniform sampler2D uTexture;\n    uniform vec3 uColor;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        float capAlpha = texture2D(uTexture, vTextureCoordinate).a;\n        float alpha = mix(1.0, capAlpha, vCap);\n        if (alpha < 0.04) discard;\n        gl_FragColor = vec4(uColor * vShade, smoothstep(0.04, 0.72, alpha));\n    }\n"

    .line 54
    .line 55
    invoke-static {v4, v3}, Lpg3;->b(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v4, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 64
    .line 65
    .line 66
    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 67
    .line 68
    .line 69
    invoke-static {v4}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    new-array v6, v5, [I

    .line 74
    .line 75
    const v7, 0x8b82

    .line 76
    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    invoke-static {v4, v7, v6, v8}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 80
    .line 81
    .line 82
    aget v6, v6, v8

    .line 83
    .line 84
    if-ne v6, v5, :cond_3

    .line 85
    .line 86
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 90
    .line 91
    .line 92
    iput v4, v0, Lpg3;->g:I

    .line 93
    .line 94
    const-string v1, "aPosition"

    .line 95
    .line 96
    invoke-static {v4, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, v0, Lpg3;->i:I

    .line 101
    .line 102
    iget v1, v0, Lpg3;->g:I

    .line 103
    .line 104
    const-string v3, "aTextureCoordinate"

    .line 105
    .line 106
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    iput v1, v0, Lpg3;->j:I

    .line 111
    .line 112
    iget v1, v0, Lpg3;->g:I

    .line 113
    .line 114
    const-string v3, "aCap"

    .line 115
    .line 116
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iput v1, v0, Lpg3;->k:I

    .line 121
    .line 122
    iget v1, v0, Lpg3;->g:I

    .line 123
    .line 124
    const-string v3, "aShade"

    .line 125
    .line 126
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, v0, Lpg3;->l:I

    .line 131
    .line 132
    iget v1, v0, Lpg3;->g:I

    .line 133
    .line 134
    const-string v3, "uModelViewProjection"

    .line 135
    .line 136
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iput v1, v0, Lpg3;->m:I

    .line 141
    .line 142
    iget v1, v0, Lpg3;->g:I

    .line 143
    .line 144
    const-string v3, "uColor"

    .line 145
    .line 146
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput v1, v0, Lpg3;->n:I

    .line 151
    .line 152
    iget v1, v0, Lpg3;->g:I

    .line 153
    .line 154
    const-string v3, "uTexture"

    .line 155
    .line 156
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    iput v1, v0, Lpg3;->o:I

    .line 161
    .line 162
    const/16 v1, 0x100

    .line 163
    .line 164
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 165
    .line 166
    const/16 v4, 0x400

    .line 167
    .line 168
    invoke-static {v4, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v1, Landroid/graphics/Paint;

    .line 176
    .line 177
    invoke-direct {v1, v5}, Landroid/graphics/Paint;-><init>(I)V

    .line 178
    .line 179
    .line 180
    const/4 v3, -0x1

    .line 181
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 182
    .line 183
    .line 184
    const/high16 v3, 0x43340000    # 180.0f

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 187
    .line 188
    .line 189
    sget-object v3, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 190
    .line 191
    invoke-static {v3, v5}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 196
    .line 197
    .line 198
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 201
    .line 202
    .line 203
    sget-object v3, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 204
    .line 205
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 209
    .line 210
    .line 211
    const-string v2, "Hello World!"

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    const/high16 v4, 0x44740000    # 976.0f

    .line 218
    .line 219
    cmpl-float v6, v3, v4

    .line 220
    .line 221
    if-lez v6, :cond_0

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    div-float/2addr v4, v3

    .line 228
    mul-float/2addr v4, v6

    .line 229
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 230
    .line 231
    .line 232
    :cond_0
    new-instance v3, Landroid/graphics/Canvas;

    .line 233
    .line 234
    invoke-direct {v3, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    int-to-float v6, v6

    .line 246
    const/high16 v7, 0x40000000    # 2.0f

    .line 247
    .line 248
    div-float/2addr v6, v7

    .line 249
    iget v10, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 250
    .line 251
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 252
    .line 253
    add-float/2addr v10, v4

    .line 254
    div-float/2addr v10, v7

    .line 255
    sub-float/2addr v6, v10

    .line 256
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    int-to-float v4, v4

    .line 261
    div-float/2addr v4, v7

    .line 262
    invoke-virtual {v3, v2, v4, v6, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 263
    .line 264
    .line 265
    const/high16 v1, 0x40000

    .line 266
    .line 267
    new-array v10, v1, [I

    .line 268
    .line 269
    const/16 v15, 0x400

    .line 270
    .line 271
    const/16 v16, 0x100

    .line 272
    .line 273
    const/4 v11, 0x0

    .line 274
    const/16 v12, 0x400

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const/4 v14, 0x0

    .line 278
    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 279
    .line 280
    .line 281
    new-array v2, v1, [Z

    .line 282
    .line 283
    move v3, v8

    .line 284
    :goto_0
    if-ge v3, v1, :cond_2

    .line 285
    .line 286
    aget v4, v10, v3

    .line 287
    .line 288
    ushr-int/lit8 v4, v4, 0x18

    .line 289
    .line 290
    const/16 v6, 0x60

    .line 291
    .line 292
    if-lt v4, v6, :cond_1

    .line 293
    .line 294
    move v4, v5

    .line 295
    goto :goto_1

    .line 296
    :cond_1
    move v4, v8

    .line 297
    :goto_1
    aput-boolean v4, v2, v3

    .line 298
    .line 299
    add-int/lit8 v3, v3, 0x1

    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_2
    iput-object v2, v0, Lpg3;->q:[Z

    .line 303
    .line 304
    new-array v1, v5, [I

    .line 305
    .line 306
    invoke-static {v5, v1, v8}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 307
    .line 308
    .line 309
    aget v2, v1, v8

    .line 310
    .line 311
    const/16 v3, 0xde1

    .line 312
    .line 313
    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 314
    .line 315
    .line 316
    const/16 v2, 0x2801

    .line 317
    .line 318
    const/16 v4, 0x2703

    .line 319
    .line 320
    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 321
    .line 322
    .line 323
    const/16 v2, 0x2800

    .line 324
    .line 325
    const/16 v4, 0x2601

    .line 326
    .line 327
    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 328
    .line 329
    .line 330
    const/16 v2, 0x2802

    .line 331
    .line 332
    const v4, 0x812f

    .line 333
    .line 334
    .line 335
    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 336
    .line 337
    .line 338
    const/16 v2, 0x2803

    .line 339
    .line 340
    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 341
    .line 342
    .line 343
    invoke-static {v3, v8, v9, v8}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 344
    .line 345
    .line 346
    invoke-static {v3}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 350
    .line 351
    .line 352
    aget v1, v1, v8

    .line 353
    .line 354
    iput v1, v0, Lpg3;->h:I

    .line 355
    .line 356
    const/high16 v11, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v12, 0x0

    .line 359
    iget-object v2, v0, Lpg3;->b:[F

    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    const/4 v4, 0x0

    .line 363
    const/4 v5, 0x0

    .line 364
    const/high16 v6, 0x40a00000    # 5.0f

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    const/4 v8, 0x0

    .line 368
    const/4 v9, 0x0

    .line 369
    const/4 v10, 0x0

    .line 370
    invoke-static/range {v2 .. v12}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :cond_3
    invoke-static {v4}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const-string v1, "OpenGL program link failed: "

    .line 379
    .line 380
    invoke-static {v1, v0}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {v0}, Lc80;->h(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    return-void
.end method
