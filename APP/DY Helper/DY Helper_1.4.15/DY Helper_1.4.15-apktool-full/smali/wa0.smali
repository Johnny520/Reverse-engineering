.class public final Lwa0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lbb0;

.field public β:Lyr;

.field public γ:Lnp0;

.field public δ:La80;

.field public final ε:Lb0;

.field public ζ:Landroid/graphics/Outline;

.field public η:Z

.field public θ:J

.field public ι:J

.field public κ:F

.field public λ:Lu81;

.field public μ:Lz91;

.field public ν:Lx2;

.field public ξ:Z

.field public ο:Lfe;

.field public π:Lq2;

.field public ρ:I

.field public final σ:Lsf;

.field public τ:Z

.field public υ:J

.field public φ:J

.field public χ:J

.field public ψ:Z

.field public ω:Landroid/graphics/RectF;


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

.method public constructor <init>(Lbb0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwa0;->α:Lbb0;

    .line 5
    .line 6
    sget-object v0, Ls1;->γ:Lzr;

    .line 7
    .line 8
    iput-object v0, p0, Lwa0;->β:Lyr;

    .line 9
    .line 10
    sget-object v0, Lnp0;->ε:Lnp0;

    .line 11
    .line 12
    iput-object v0, p0, Lwa0;->γ:Lnp0;

    .line 13
    .line 14
    sget-object v0, La1;->ξ:La1;

    .line 15
    .line 16
    iput-object v0, p0, Lwa0;->δ:La80;

    .line 17
    .line 18
    new-instance v0, Lb0;

    .line 19
    .line 20
    const/16 v1, 0xb

    .line 21
    .line 22
    invoke-direct {v0, v1, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lwa0;->ε:Lb0;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lwa0;->η:Z

    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    iput-wide v0, p0, Lwa0;->θ:J

    .line 33
    .line 34
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    iput-wide v2, p0, Lwa0;->ι:J

    .line 40
    .line 41
    new-instance v4, Lsf;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v4, p0, Lwa0;->σ:Lsf;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    iput-boolean v4, p1, Lbb0;->π:Z

    .line 50
    .line 51
    invoke-virtual {p1}, Lbb0;->α()V

    .line 52
    .line 53
    .line 54
    iput-wide v0, p0, Lwa0;->υ:J

    .line 55
    .line 56
    iput-wide v0, p0, Lwa0;->φ:J

    .line 57
    .line 58
    iput-wide v2, p0, Lwa0;->χ:J

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lwa0;->α:Lbb0;

    .line 4
    .line 5
    iget-object v2, v1, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 6
    .line 7
    iget-boolean v3, v0, Lwa0;->η:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_a

    .line 11
    .line 12
    iget-boolean v3, v0, Lwa0;->ψ:Z

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    iget v5, v1, Lbb0;->μ:F

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    cmpl-float v5, v5, v6

    .line 20
    .line 21
    if-lez v5, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-boolean v4, v1, Lbb0;->π:Z

    .line 25
    .line 26
    invoke-virtual {v1}, Lbb0;->α()V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v2, v3}, Landroid/graphics/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    .line 31
    .line 32
    .line 33
    iput-boolean v4, v1, Lbb0;->η:Z

    .line 34
    .line 35
    invoke-virtual {v1}, Lbb0;->α()V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    :goto_0
    iget-object v5, v0, Lwa0;->μ:Lz91;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    if-eqz v5, :cond_7

    .line 44
    .line 45
    iget-object v3, v0, Lwa0;->ω:Landroid/graphics/RectF;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    new-instance v3, Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Lwa0;->ω:Landroid/graphics/RectF;

    .line 55
    .line 56
    :cond_2
    instance-of v7, v5, Lx2;

    .line 57
    .line 58
    const-string v8, "Unable to obtain android.graphics.Path"

    .line 59
    .line 60
    if-eqz v7, :cond_6

    .line 61
    .line 62
    move-object v9, v5

    .line 63
    check-cast v9, Lx2;

    .line 64
    .line 65
    iget-object v9, v9, Lx2;->α:Landroid/graphics/Path;

    .line 66
    .line 67
    invoke-virtual {v9, v3, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 68
    .line 69
    .line 70
    iget-object v9, v0, Lwa0;->ζ:Landroid/graphics/Outline;

    .line 71
    .line 72
    if-nez v9, :cond_3

    .line 73
    .line 74
    new-instance v9, Landroid/graphics/Outline;

    .line 75
    .line 76
    invoke-direct {v9}, Landroid/graphics/Outline;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v9, v0, Lwa0;->ζ:Landroid/graphics/Outline;

    .line 80
    .line 81
    :cond_3
    if-eqz v7, :cond_5

    .line 82
    .line 83
    move-object v7, v5

    .line 84
    check-cast v7, Lx2;

    .line 85
    .line 86
    iget-object v7, v7, Lx2;->α:Landroid/graphics/Path;

    .line 87
    .line 88
    invoke-virtual {v9, v7}, Landroid/graphics/Outline;->setPath(Landroid/graphics/Path;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9}, Landroid/graphics/Outline;->canClip()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    xor-int/2addr v7, v6

    .line 96
    iput-boolean v7, v0, Lwa0;->ξ:Z

    .line 97
    .line 98
    iput-object v5, v0, Lwa0;->μ:Lz91;

    .line 99
    .line 100
    iget v5, v1, Lbb0;->θ:F

    .line 101
    .line 102
    invoke-virtual {v9, v5}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v9}, Landroid/graphics/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    .line 120
    .line 121
    .line 122
    iput-boolean v6, v1, Lbb0;->η:Z

    .line 123
    .line 124
    invoke-virtual {v1}, Lbb0;->α()V

    .line 125
    .line 126
    .line 127
    iget-boolean v3, v0, Lwa0;->ξ:Z

    .line 128
    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    iget-boolean v3, v0, Lwa0;->ψ:Z

    .line 132
    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    iput-boolean v4, v1, Lbb0;->π:Z

    .line 136
    .line 137
    invoke-virtual {v1}, Lbb0;->α()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/graphics/RenderNode;->discardDisplayList()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :cond_4
    iget-boolean v2, v0, Lwa0;->ψ:Z

    .line 146
    .line 147
    iput-boolean v2, v1, Lbb0;->π:Z

    .line 148
    .line 149
    invoke-virtual {v1}, Lbb0;->α()V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 155
    .line 156
    invoke-direct {v0, v8}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 161
    .line 162
    invoke-direct {v0, v8}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_7
    iput-boolean v3, v1, Lbb0;->π:Z

    .line 167
    .line 168
    invoke-virtual {v1}, Lbb0;->α()V

    .line 169
    .line 170
    .line 171
    iget-object v3, v0, Lwa0;->ζ:Landroid/graphics/Outline;

    .line 172
    .line 173
    if-nez v3, :cond_8

    .line 174
    .line 175
    new-instance v3, Landroid/graphics/Outline;

    .line 176
    .line 177
    invoke-direct {v3}, Landroid/graphics/Outline;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object v3, v0, Lwa0;->ζ:Landroid/graphics/Outline;

    .line 181
    .line 182
    :cond_8
    move-object v7, v3

    .line 183
    iget-wide v8, v0, Lwa0;->φ:J

    .line 184
    .line 185
    invoke-static {v8, v9}, Ls1;->Ζ(J)J

    .line 186
    .line 187
    .line 188
    move-result-wide v8

    .line 189
    iget-wide v10, v0, Lwa0;->θ:J

    .line 190
    .line 191
    iget-wide v12, v0, Lwa0;->ι:J

    .line 192
    .line 193
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmp-long v3, v12, v14

    .line 199
    .line 200
    if-nez v3, :cond_9

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_9
    move-wide v8, v12

    .line 204
    :goto_1
    const/16 v3, 0x20

    .line 205
    .line 206
    shr-long v12, v10, v3

    .line 207
    .line 208
    long-to-int v5, v12

    .line 209
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    const-wide v13, 0xffffffffL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    and-long/2addr v10, v13

    .line 223
    long-to-int v10, v10

    .line 224
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    move-wide v15, v13

    .line 237
    shr-long v13, v8, v3

    .line 238
    .line 239
    long-to-int v3, v13

    .line 240
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 241
    .line 242
    .line 243
    move-result v13

    .line 244
    add-float/2addr v13, v5

    .line 245
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    and-long/2addr v8, v15

    .line 254
    long-to-int v13, v8

    .line 255
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    add-float/2addr v8, v10

    .line 260
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    move v9, v11

    .line 265
    move v11, v8

    .line 266
    move v8, v12

    .line 267
    iget v12, v0, Lwa0;->κ:F

    .line 268
    .line 269
    move v10, v5

    .line 270
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 271
    .line 272
    .line 273
    iget v5, v1, Lbb0;->θ:F

    .line 274
    .line 275
    invoke-virtual {v7, v5}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 276
    .line 277
    .line 278
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 283
    .line 284
    .line 285
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v7}, Landroid/graphics/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    .line 293
    .line 294
    .line 295
    iput-boolean v6, v1, Lbb0;->η:Z

    .line 296
    .line 297
    invoke-virtual {v1}, Lbb0;->α()V

    .line 298
    .line 299
    .line 300
    :cond_a
    :goto_2
    iput-boolean v4, v0, Lwa0;->η:Z

    .line 301
    .line 302
    return-void
.end method

.method public final β()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lwa0;->τ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget v0, p0, Lwa0;->ρ:I

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, Lwa0;->σ:Lsf;

    .line 10
    .line 11
    iget-object v1, v0, Lsf;->β:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lwa0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lwa0;->ρ:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    iput v2, v1, Lwa0;->ρ:I

    .line 22
    .line 23
    invoke-virtual {v1}, Lwa0;->β()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Lsf;->β:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v0, v0, Lsf;->δ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lc21;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    iget-object v1, v0, Lc21;->β:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v0, Lc21;->α:[J

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
    check-cast v11, Lwa0;

    .line 89
    .line 90
    iget v12, v11, Lwa0;->ρ:I

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x1

    .line 93
    .line 94
    iput v12, v11, Lwa0;->ρ:I

    .line 95
    .line 96
    invoke-virtual {v11}, Lwa0;->β()V

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
    invoke-virtual {v0}, Lc21;->β()V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object p0, p0, Lwa0;->α:Lbb0;

    .line 114
    .line 115
    iget-object p0, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/graphics/RenderNode;->discardDisplayList()V

    .line 118
    .line 119
    .line 120
    :cond_6
    return-void
.end method

.method public final γ(Lcw;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lwa0;->σ:Lsf;

    .line 2
    .line 3
    iget-object v1, v0, Lsf;->β:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lwa0;

    .line 6
    .line 7
    iput-object v1, v0, Lsf;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, v0, Lsf;->δ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lc21;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lc21;->θ()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, Lsf;->ε:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lc21;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget v2, Luq1;->α:I

    .line 28
    .line 29
    new-instance v2, Lc21;

    .line 30
    .line 31
    invoke-direct {v2}, Lc21;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Lsf;->ε:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v1}, Lc21;->ι(Lc21;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lc21;->β()V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v0, Lsf;->α:Z

    .line 44
    .line 45
    iget-object p0, p0, Lwa0;->δ:La80;

    .line 46
    .line 47
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput-boolean p0, v0, Lsf;->α:Z

    .line 52
    .line 53
    iget-object p1, v0, Lsf;->γ:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lwa0;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget v1, p1, Lwa0;->ρ:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    iput v1, p1, Lwa0;->ρ:I

    .line 64
    .line 65
    invoke-virtual {p1}, Lwa0;->β()V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object p1, v0, Lsf;->ε:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lc21;

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    invoke-virtual {p1}, Lc21;->θ()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    iget-object v0, p1, Lc21;->β:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, p1, Lc21;->α:[J

    .line 83
    .line 84
    array-length v2, v1

    .line 85
    add-int/lit8 v2, v2, -0x2

    .line 86
    .line 87
    if-ltz v2, :cond_6

    .line 88
    .line 89
    move v3, p0

    .line 90
    :goto_0
    aget-wide v4, v1, v3

    .line 91
    .line 92
    not-long v6, v4

    .line 93
    const/4 v8, 0x7

    .line 94
    shl-long/2addr v6, v8

    .line 95
    and-long/2addr v6, v4

    .line 96
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v6, v8

    .line 102
    cmp-long v6, v6, v8

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    sub-int v6, v3, v2

    .line 107
    .line 108
    not-int v6, v6

    .line 109
    ushr-int/lit8 v6, v6, 0x1f

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    rsub-int/lit8 v6, v6, 0x8

    .line 114
    .line 115
    move v8, p0

    .line 116
    :goto_1
    if-ge v8, v6, :cond_4

    .line 117
    .line 118
    const-wide/16 v9, 0xff

    .line 119
    .line 120
    and-long/2addr v9, v4

    .line 121
    const-wide/16 v11, 0x80

    .line 122
    .line 123
    cmp-long v9, v9, v11

    .line 124
    .line 125
    if-gez v9, :cond_3

    .line 126
    .line 127
    shl-int/lit8 v9, v3, 0x3

    .line 128
    .line 129
    add-int/2addr v9, v8

    .line 130
    aget-object v9, v0, v9

    .line 131
    .line 132
    check-cast v9, Lwa0;

    .line 133
    .line 134
    iget v10, v9, Lwa0;->ρ:I

    .line 135
    .line 136
    add-int/lit8 v10, v10, -0x1

    .line 137
    .line 138
    iput v10, v9, Lwa0;->ρ:I

    .line 139
    .line 140
    invoke-virtual {v9}, Lwa0;->β()V

    .line 141
    .line 142
    .line 143
    :cond_3
    shr-long/2addr v4, v7

    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-ne v6, v7, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v3, v2, :cond_6

    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {p1}, Lc21;->β()V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final δ()Lu81;
    .locals 14

    .line 1
    iget-object v0, p0, Lwa0;->λ:Lu81;

    .line 2
    .line 3
    iget-object v1, p0, Lwa0;->μ:Lz91;

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
    new-instance v0, Lr81;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lr81;-><init>(Lz91;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lwa0;->λ:Lu81;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, Lwa0;->φ:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Ls1;->Ζ(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Lwa0;->θ:J

    .line 25
    .line 26
    iget-wide v4, p0, Lwa0;->ι:J

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
    iget v0, p0, Lwa0;->κ:F

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
    new-instance v1, Lt81;

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
    invoke-static/range {v6 .. v11}, Lu81;->α(FFFFJ)Lwo1;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v1, v0}, Lt81;-><init>(Lwo1;)V

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
    new-instance v1, Ls81;

    .line 112
    .line 113
    new-instance v0, Lml1;

    .line 114
    .line 115
    invoke-direct {v0, v6, v7, v8, v9}, Lml1;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, Ls81;-><init>(Lml1;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    iput-object v1, p0, Lwa0;->λ:Lu81;

    .line 122
    .line 123
    return-object v1
.end method

.method public final ε(Lyr;Lnp0;JLa80;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lwa0;->φ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p3, p4}, Lbn0;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p3, p0, Lwa0;->φ:J

    .line 10
    .line 11
    iget-wide v0, p0, Lwa0;->υ:J

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, p3, p4}, Lwa0;->θ(JJ)V

    .line 14
    .line 15
    .line 16
    iget-wide p3, p0, Lwa0;->ι:J

    .line 17
    .line 18
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p3, p3, v0

    .line 24
    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    iput-boolean p3, p0, Lwa0;->η:Z

    .line 29
    .line 30
    invoke-virtual {p0}, Lwa0;->α()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iput-object p1, p0, Lwa0;->β:Lyr;

    .line 34
    .line 35
    iput-object p2, p0, Lwa0;->γ:Lnp0;

    .line 36
    .line 37
    iput-object p5, p0, Lwa0;->δ:La80;

    .line 38
    .line 39
    invoke-virtual {p0}, Lwa0;->ζ()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final ζ()V
    .locals 10

    .line 1
    iget-object v0, p0, Lwa0;->β:Lyr;

    .line 2
    .line 3
    iget-object v1, p0, Lwa0;->γ:Lnp0;

    .line 4
    .line 5
    iget-object v2, p0, Lwa0;->ε:Lb0;

    .line 6
    .line 7
    iget-object v3, p0, Lwa0;->α:Lbb0;

    .line 8
    .line 9
    iget-object v4, v3, Lbb0;->β:Lfe;

    .line 10
    .line 11
    iget-object v5, v3, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 12
    .line 13
    invoke-virtual {v5}, Landroid/graphics/RenderNode;->beginRecording()Landroid/graphics/RecordingCanvas;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    :try_start_0
    iget-object v7, v3, Lbb0;->α:Lge;

    .line 18
    .line 19
    iget-object v8, v7, Lge;->α:Ll0;

    .line 20
    .line 21
    iget-object v9, v8, Ll0;->α:Landroid/graphics/Canvas;

    .line 22
    .line 23
    iput-object v6, v8, Ll0;->α:Landroid/graphics/Canvas;

    .line 24
    .line 25
    iget-object v6, v4, Lfe;->ζ:Lm6;

    .line 26
    .line 27
    invoke-virtual {v6, v0}, Lm6;->Σ(Lyr;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6, v1}, Lm6;->Τ(Lnp0;)V

    .line 31
    .line 32
    .line 33
    iput-object p0, v6, Lm6;->η:Ljava/lang/Object;

    .line 34
    .line 35
    iget-wide v0, v3, Lbb0;->δ:J

    .line 36
    .line 37
    invoke-virtual {v6, v0, v1}, Lm6;->Υ(J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v8}, Lm6;->Ρ(Lde;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v4}, Lb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iget-object p0, v7, Lge;->α:Ll0;

    .line 47
    .line 48
    iput-object v9, p0, Ll0;->α:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/graphics/RenderNode;->endRecording()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    invoke-virtual {v5}, Landroid/graphics/RenderNode;->endRecording()V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final η(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lwa0;->χ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lo41;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-wide p1, p0, Lwa0;->χ:J

    .line 10
    .line 11
    const-wide v0, 0x7fffffff7fffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, p1

    .line 17
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    iget-object p0, p0, Lwa0;->α:Lbb0;

    .line 25
    .line 26
    iget-object p0, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/RenderNode;->resetPivot()Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/16 v0, 0x20

    .line 35
    .line 36
    shr-long v0, p1, v0

    .line 37
    .line 38
    long-to-int v0, v0

    .line 39
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0, v0}, Landroid/graphics/RenderNode;->setPivotX(F)Z

    .line 44
    .line 45
    .line 46
    const-wide v0, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr p1, v0

    .line 52
    long-to-int p1, p1

    .line 53
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p0, p1}, Landroid/graphics/RenderNode;->setPivotY(F)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final θ(JJ)V
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v2

    .line 12
    long-to-int p1, p1

    .line 13
    iget-object p0, p0, Lwa0;->α:Lbb0;

    .line 14
    .line 15
    iget-object p2, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 16
    .line 17
    shr-long v4, p3, v0

    .line 18
    .line 19
    long-to-int v0, v4

    .line 20
    add-int/2addr v0, v1

    .line 21
    and-long/2addr v2, p3

    .line 22
    long-to-int v2, v2

    .line 23
    add-int/2addr v2, p1

    .line 24
    invoke-virtual {p2, v1, p1, v0, v2}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    .line 25
    .line 26
    .line 27
    invoke-static {p3, p4}, Ls1;->Ζ(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p0, Lbb0;->δ:J

    .line 32
    .line 33
    return-void
.end method

.method public final ι(Lin;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lwa0;->α:Lbb0;

    .line 2
    .line 3
    iget-object v0, p0, Lbb0;->τ:Lin;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lbb0;->τ:Lin;

    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x1f

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lin;->γ()Landroid/graphics/RenderEffect;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    invoke-static {p0, p1}, Lp1;->χ(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final κ(JJF)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lwa0;->θ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lo41;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Lwa0;->ι:J

    .line 10
    .line 11
    invoke-static {v0, v1, p3, p4}, Ljw1;->α(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lwa0;->κ:F

    .line 18
    .line 19
    cmpg-float v0, v0, p5

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lwa0;->μ:Lz91;

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
    iput-object v0, p0, Lwa0;->λ:Lu81;

    .line 31
    .line 32
    iput-object v0, p0, Lwa0;->μ:Lz91;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lwa0;->η:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lwa0;->ξ:Z

    .line 39
    .line 40
    iput-wide p1, p0, Lwa0;->θ:J

    .line 41
    .line 42
    iput-wide p3, p0, Lwa0;->ι:J

    .line 43
    .line 44
    iput p5, p0, Lwa0;->κ:F

    .line 45
    .line 46
    invoke-virtual {p0}, Lwa0;->α()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final λ(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lwa0;->υ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lum0;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Lwa0;->υ:J

    .line 10
    .line 11
    iget-wide v0, p0, Lwa0;->φ:J

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0, v1}, Lwa0;->θ(JJ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
