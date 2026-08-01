.class public final Lya0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lw81;


# instance fields
.field public final Α:Lb0;

.field public ε:Lwa0;

.field public final ζ:Lua0;

.field public final η:Landroidx/compose/ui/platform/AndroidComposeView;

.field public θ:Le80;

.field public ι:Lp70;

.field public κ:J

.field public λ:Z

.field public final μ:[F

.field public ν:[F

.field public ξ:Z

.field public ο:Lyr;

.field public π:Lnp0;

.field public final ρ:Lfe;

.field public σ:I

.field public τ:J

.field public υ:Lu81;

.field public φ:Z

.field public χ:Z

.field public ψ:Z

.field public ω:Z


# direct methods
.method public constructor <init>(Lwa0;Lua0;Landroidx/compose/ui/platform/AndroidComposeView;Le80;Lp70;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lya0;->ε:Lwa0;

    .line 5
    .line 6
    iput-object p2, p0, Lya0;->ζ:Lua0;

    .line 7
    .line 8
    iput-object p3, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    iput-object p4, p0, Lya0;->θ:Le80;

    .line 11
    .line 12
    iput-object p5, p0, Lya0;->ι:Lp70;

    .line 13
    .line 14
    const p1, 0x7fffffff

    .line 15
    .line 16
    .line 17
    int-to-long p1, p1

    .line 18
    const/16 p3, 0x20

    .line 19
    .line 20
    shl-long p3, p1, p3

    .line 21
    .line 22
    const-wide v0, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v0

    .line 28
    or-long/2addr p1, p3

    .line 29
    iput-wide p1, p0, Lya0;->κ:J

    .line 30
    .line 31
    invoke-static {}, Lbd;->λ()[F

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lya0;->μ:[F

    .line 36
    .line 37
    new-instance p1, Lzr;

    .line 38
    .line 39
    const/high16 p2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-direct {p1, p2, p2}, Lzr;-><init>(FF)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lya0;->ο:Lyr;

    .line 45
    .line 46
    sget-object p1, Lnp0;->ε:Lnp0;

    .line 47
    .line 48
    iput-object p1, p0, Lya0;->π:Lnp0;

    .line 49
    .line 50
    new-instance p1, Lfe;

    .line 51
    .line 52
    invoke-direct {p1}, Lfe;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lya0;->ρ:Lfe;

    .line 56
    .line 57
    sget-wide p1, Lr52;->α:J

    .line 58
    .line 59
    iput-wide p1, p0, Lya0;->τ:J

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Lya0;->ψ:Z

    .line 63
    .line 64
    new-instance p1, Lb0;

    .line 65
    .line 66
    const/16 p2, 0xc

    .line 67
    .line 68
    invoke-direct {p1, p2, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lya0;->Α:Lb0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lya0;->θ:Le80;

    .line 3
    .line 4
    iput-object v0, p0, Lya0;->ι:Lp70;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lya0;->λ:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lya0;->μ(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lya0;->ζ:Lua0;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lya0;->ε:Lwa0;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lua0;->α(Lwa0;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->щ:Lcw1;

    .line 25
    .line 26
    :cond_0
    iget-object v2, v1, Lcw1;->η:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    .line 29
    .line 30
    iget-object v3, v1, Lcw1;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lk21;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Lk21;->κ(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    if-nez v2, :cond_0

    .line 44
    .line 45
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    iget-object v1, v1, Lcw1;->η:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 50
    .line 51
    invoke-direct {v2, p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Κ:Lv11;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final getUnderlyingMatrix-sQKQjiQ()[F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lya0;->λ()[F

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lya0;->ξ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lya0;->λ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lya0;->μ(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final α(Lio1;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lio1;->ε:I

    .line 6
    .line 7
    iget v3, v0, Lya0;->σ:I

    .line 8
    .line 9
    or-int/2addr v2, v3

    .line 10
    iget-object v3, v1, Lio1;->τ:Lnp0;

    .line 11
    .line 12
    iput-object v3, v0, Lya0;->π:Lnp0;

    .line 13
    .line 14
    iget-object v3, v1, Lio1;->σ:Lyr;

    .line 15
    .line 16
    iput-object v3, v0, Lya0;->ο:Lyr;

    .line 17
    .line 18
    and-int/lit16 v3, v2, 0x1000

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-wide v4, v1, Lio1;->ν:J

    .line 23
    .line 24
    iput-wide v4, v0, Lya0;->τ:J

    .line 25
    .line 26
    :cond_0
    and-int/lit8 v4, v2, 0x1

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 31
    .line 32
    iget v5, v1, Lio1;->ζ:F

    .line 33
    .line 34
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 35
    .line 36
    iget v6, v4, Lbb0;->κ:F

    .line 37
    .line 38
    cmpg-float v6, v6, v5

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iput v5, v4, Lbb0;->κ:F

    .line 44
    .line 45
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Landroid/graphics/RenderNode;->setScaleX(F)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    and-int/lit8 v4, v2, 0x2

    .line 51
    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 55
    .line 56
    iget v5, v1, Lio1;->η:F

    .line 57
    .line 58
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 59
    .line 60
    iget v6, v4, Lbb0;->λ:F

    .line 61
    .line 62
    cmpg-float v6, v6, v5

    .line 63
    .line 64
    if-nez v6, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iput v5, v4, Lbb0;->λ:F

    .line 68
    .line 69
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Landroid/graphics/RenderNode;->setScaleY(F)Z

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    and-int/lit8 v4, v2, 0x4

    .line 75
    .line 76
    if-eqz v4, :cond_6

    .line 77
    .line 78
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 79
    .line 80
    iget v5, v1, Lio1;->θ:F

    .line 81
    .line 82
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 83
    .line 84
    iget v6, v4, Lbb0;->θ:F

    .line 85
    .line 86
    cmpg-float v6, v6, v5

    .line 87
    .line 88
    if-nez v6, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    iput v5, v4, Lbb0;->θ:F

    .line 92
    .line 93
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Landroid/graphics/RenderNode;->setAlpha(F)Z

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_2
    and-int/lit8 v4, v2, 0x8

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    .line 102
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 103
    .line 104
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 105
    .line 106
    :cond_7
    and-int/lit8 v4, v2, 0x10

    .line 107
    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 111
    .line 112
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 113
    .line 114
    :cond_8
    and-int/lit8 v4, v2, 0x20

    .line 115
    .line 116
    const/4 v5, 0x0

    .line 117
    const/4 v6, 0x1

    .line 118
    if-eqz v4, :cond_a

    .line 119
    .line 120
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 121
    .line 122
    iget v7, v1, Lio1;->ι:F

    .line 123
    .line 124
    iget-object v8, v4, Lwa0;->α:Lbb0;

    .line 125
    .line 126
    iget v9, v8, Lbb0;->μ:F

    .line 127
    .line 128
    cmpg-float v9, v9, v7

    .line 129
    .line 130
    if-nez v9, :cond_9

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    iput v7, v8, Lbb0;->μ:F

    .line 134
    .line 135
    iget-object v8, v8, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 136
    .line 137
    invoke-virtual {v8, v7}, Landroid/graphics/RenderNode;->setElevation(F)Z

    .line 138
    .line 139
    .line 140
    iput-boolean v6, v4, Lwa0;->η:Z

    .line 141
    .line 142
    invoke-virtual {v4}, Lwa0;->α()V

    .line 143
    .line 144
    .line 145
    :goto_3
    iget v4, v1, Lio1;->ι:F

    .line 146
    .line 147
    cmpl-float v4, v4, v5

    .line 148
    .line 149
    if-lez v4, :cond_a

    .line 150
    .line 151
    iget-boolean v4, v0, Lya0;->ω:Z

    .line 152
    .line 153
    if-nez v4, :cond_a

    .line 154
    .line 155
    iget-object v4, v0, Lya0;->ι:Lp70;

    .line 156
    .line 157
    if-eqz v4, :cond_a

    .line 158
    .line 159
    invoke-interface {v4}, Lp70;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_a
    and-int/lit8 v4, v2, 0x40

    .line 163
    .line 164
    if-eqz v4, :cond_b

    .line 165
    .line 166
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 167
    .line 168
    iget-wide v7, v1, Lio1;->κ:J

    .line 169
    .line 170
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 171
    .line 172
    iget-wide v9, v4, Lbb0;->ν:J

    .line 173
    .line 174
    invoke-static {v7, v8, v9, v10}, Lci;->γ(JJ)Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-nez v9, :cond_b

    .line 179
    .line 180
    iput-wide v7, v4, Lbb0;->ν:J

    .line 181
    .line 182
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 183
    .line 184
    invoke-static {v7, v8}, Lkn0;->Τ(J)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-virtual {v4, v7}, Landroid/graphics/RenderNode;->setAmbientShadowColor(I)Z

    .line 189
    .line 190
    .line 191
    :cond_b
    and-int/lit16 v4, v2, 0x80

    .line 192
    .line 193
    if-eqz v4, :cond_c

    .line 194
    .line 195
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 196
    .line 197
    iget-wide v7, v1, Lio1;->λ:J

    .line 198
    .line 199
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 200
    .line 201
    iget-wide v9, v4, Lbb0;->ξ:J

    .line 202
    .line 203
    invoke-static {v7, v8, v9, v10}, Lci;->γ(JJ)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-nez v9, :cond_c

    .line 208
    .line 209
    iput-wide v7, v4, Lbb0;->ξ:J

    .line 210
    .line 211
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 212
    .line 213
    invoke-static {v7, v8}, Lkn0;->Τ(J)I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    invoke-virtual {v4, v7}, Landroid/graphics/RenderNode;->setSpotShadowColor(I)Z

    .line 218
    .line 219
    .line 220
    :cond_c
    and-int/lit16 v4, v2, 0x400

    .line 221
    .line 222
    if-eqz v4, :cond_d

    .line 223
    .line 224
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 225
    .line 226
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 227
    .line 228
    :cond_d
    and-int/lit16 v4, v2, 0x100

    .line 229
    .line 230
    if-eqz v4, :cond_e

    .line 231
    .line 232
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 233
    .line 234
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 235
    .line 236
    :cond_e
    and-int/lit16 v4, v2, 0x200

    .line 237
    .line 238
    if-eqz v4, :cond_f

    .line 239
    .line 240
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 241
    .line 242
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 243
    .line 244
    :cond_f
    and-int/lit16 v4, v2, 0x800

    .line 245
    .line 246
    if-eqz v4, :cond_11

    .line 247
    .line 248
    iget-object v4, v0, Lya0;->ε:Lwa0;

    .line 249
    .line 250
    iget v7, v1, Lio1;->μ:F

    .line 251
    .line 252
    iget-object v4, v4, Lwa0;->α:Lbb0;

    .line 253
    .line 254
    iget v8, v4, Lbb0;->ο:F

    .line 255
    .line 256
    cmpg-float v8, v8, v7

    .line 257
    .line 258
    if-nez v8, :cond_10

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_10
    iput v7, v4, Lbb0;->ο:F

    .line 262
    .line 263
    iget-object v4, v4, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 264
    .line 265
    invoke-virtual {v4, v7}, Landroid/graphics/RenderNode;->setCameraDistance(F)Z

    .line 266
    .line 267
    .line 268
    :cond_11
    :goto_4
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    const/4 v4, 0x0

    .line 274
    const-wide v9, 0xffffffffL

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    const/16 v11, 0x20

    .line 280
    .line 281
    if-eqz v3, :cond_13

    .line 282
    .line 283
    iget-wide v12, v0, Lya0;->τ:J

    .line 284
    .line 285
    sget-wide v14, Lr52;->α:J

    .line 286
    .line 287
    cmp-long v3, v12, v14

    .line 288
    .line 289
    if-nez v3, :cond_12

    .line 290
    .line 291
    move v3, v6

    .line 292
    goto :goto_5

    .line 293
    :cond_12
    move v3, v4

    .line 294
    :goto_5
    iget-object v14, v0, Lya0;->ε:Lwa0;

    .line 295
    .line 296
    if-eqz v3, :cond_14

    .line 297
    .line 298
    invoke-virtual {v14, v7, v8}, Lwa0;->η(J)V

    .line 299
    .line 300
    .line 301
    :cond_13
    move-wide v15, v9

    .line 302
    goto :goto_6

    .line 303
    :cond_14
    shr-long/2addr v12, v11

    .line 304
    long-to-int v3, v12

    .line 305
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    iget-wide v12, v0, Lya0;->κ:J

    .line 310
    .line 311
    shr-long/2addr v12, v11

    .line 312
    long-to-int v12, v12

    .line 313
    int-to-float v12, v12

    .line 314
    mul-float/2addr v3, v12

    .line 315
    iget-wide v12, v0, Lya0;->τ:J

    .line 316
    .line 317
    and-long/2addr v12, v9

    .line 318
    long-to-int v12, v12

    .line 319
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    move-wide v15, v9

    .line 324
    iget-wide v9, v0, Lya0;->κ:J

    .line 325
    .line 326
    and-long/2addr v9, v15

    .line 327
    long-to-int v9, v9

    .line 328
    int-to-float v9, v9

    .line 329
    mul-float/2addr v12, v9

    .line 330
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    int-to-long v9, v3

    .line 335
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    int-to-long v12, v3

    .line 340
    shl-long/2addr v9, v11

    .line 341
    and-long/2addr v12, v15

    .line 342
    or-long/2addr v9, v12

    .line 343
    invoke-virtual {v14, v9, v10}, Lwa0;->η(J)V

    .line 344
    .line 345
    .line 346
    :goto_6
    and-int/lit16 v3, v2, 0x4000

    .line 347
    .line 348
    if-eqz v3, :cond_15

    .line 349
    .line 350
    iget-object v3, v0, Lya0;->ε:Lwa0;

    .line 351
    .line 352
    iget-boolean v9, v1, Lio1;->ο:Z

    .line 353
    .line 354
    iget-boolean v10, v3, Lwa0;->ψ:Z

    .line 355
    .line 356
    if-eq v10, v9, :cond_15

    .line 357
    .line 358
    iput-boolean v9, v3, Lwa0;->ψ:Z

    .line 359
    .line 360
    iput-boolean v6, v3, Lwa0;->η:Z

    .line 361
    .line 362
    invoke-virtual {v3}, Lwa0;->α()V

    .line 363
    .line 364
    .line 365
    :cond_15
    const/high16 v3, 0x20000

    .line 366
    .line 367
    and-int/2addr v3, v2

    .line 368
    if-eqz v3, :cond_16

    .line 369
    .line 370
    iget-object v3, v0, Lya0;->ε:Lwa0;

    .line 371
    .line 372
    iget-object v9, v1, Lio1;->υ:Lin;

    .line 373
    .line 374
    invoke-virtual {v3, v9}, Lwa0;->ι(Lin;)V

    .line 375
    .line 376
    .line 377
    :cond_16
    const/high16 v3, 0x40000

    .line 378
    .line 379
    and-int/2addr v3, v2

    .line 380
    if-eqz v3, :cond_17

    .line 381
    .line 382
    iget-object v3, v0, Lya0;->ε:Lwa0;

    .line 383
    .line 384
    iget-object v3, v3, Lwa0;->α:Lbb0;

    .line 385
    .line 386
    :cond_17
    const/high16 v3, 0x80000

    .line 387
    .line 388
    and-int/2addr v3, v2

    .line 389
    if-eqz v3, :cond_1a

    .line 390
    .line 391
    iget-object v3, v0, Lya0;->ε:Lwa0;

    .line 392
    .line 393
    iget v9, v1, Lio1;->φ:I

    .line 394
    .line 395
    iget-object v3, v3, Lwa0;->α:Lbb0;

    .line 396
    .line 397
    iget v10, v3, Lbb0;->ι:I

    .line 398
    .line 399
    if-ne v10, v9, :cond_18

    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_18
    iput v9, v3, Lbb0;->ι:I

    .line 403
    .line 404
    iget-object v10, v3, Lbb0;->ε:Landroid/graphics/Paint;

    .line 405
    .line 406
    if-nez v10, :cond_19

    .line 407
    .line 408
    new-instance v10, Landroid/graphics/Paint;

    .line 409
    .line 410
    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 411
    .line 412
    .line 413
    iput-object v10, v3, Lbb0;->ε:Landroid/graphics/Paint;

    .line 414
    .line 415
    :cond_19
    invoke-static {v9}, Lxb;->в(I)Landroid/graphics/BlendMode;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v3}, Lbb0;->γ()V

    .line 423
    .line 424
    .line 425
    :cond_1a
    :goto_7
    const v3, 0x8000

    .line 426
    .line 427
    .line 428
    and-int/2addr v3, v2

    .line 429
    if-eqz v3, :cond_1f

    .line 430
    .line 431
    iget-object v3, v0, Lya0;->ε:Lwa0;

    .line 432
    .line 433
    iget v9, v1, Lio1;->π:I

    .line 434
    .line 435
    if-nez v9, :cond_1b

    .line 436
    .line 437
    move v10, v4

    .line 438
    goto :goto_8

    .line 439
    :cond_1b
    if-ne v9, v6, :cond_1c

    .line 440
    .line 441
    move v10, v6

    .line 442
    goto :goto_8

    .line 443
    :cond_1c
    const/4 v10, 0x2

    .line 444
    if-ne v9, v10, :cond_1e

    .line 445
    .line 446
    :goto_8
    iget-object v3, v3, Lwa0;->α:Lbb0;

    .line 447
    .line 448
    iget v9, v3, Lbb0;->υ:I

    .line 449
    .line 450
    if-ne v9, v10, :cond_1d

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_1d
    iput v10, v3, Lbb0;->υ:I

    .line 454
    .line 455
    invoke-virtual {v3}, Lbb0;->γ()V

    .line 456
    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_1e
    const-string v0, "Not supported composition strategy"

    .line 460
    .line 461
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :cond_1f
    :goto_9
    and-int/lit16 v3, v2, 0x1f1b

    .line 466
    .line 467
    if-eqz v3, :cond_20

    .line 468
    .line 469
    iput-boolean v6, v0, Lya0;->φ:Z

    .line 470
    .line 471
    iput-boolean v6, v0, Lya0;->χ:Z

    .line 472
    .line 473
    :cond_20
    iget-object v3, v0, Lya0;->υ:Lu81;

    .line 474
    .line 475
    iget-object v9, v1, Lio1;->χ:Lu81;

    .line 476
    .line 477
    invoke-static {v3, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-nez v3, :cond_27

    .line 482
    .line 483
    iget-object v3, v1, Lio1;->χ:Lu81;

    .line 484
    .line 485
    iput-object v3, v0, Lya0;->υ:Lu81;

    .line 486
    .line 487
    if-nez v3, :cond_21

    .line 488
    .line 489
    goto/16 :goto_b

    .line 490
    .line 491
    :cond_21
    iget-object v9, v0, Lya0;->ε:Lwa0;

    .line 492
    .line 493
    instance-of v10, v3, Ls81;

    .line 494
    .line 495
    if-eqz v10, :cond_22

    .line 496
    .line 497
    move-object v4, v3

    .line 498
    check-cast v4, Ls81;

    .line 499
    .line 500
    iget-object v4, v4, Ls81;->α:Lml1;

    .line 501
    .line 502
    iget v7, v4, Lml1;->α:F

    .line 503
    .line 504
    iget v8, v4, Lml1;->β:F

    .line 505
    .line 506
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    int-to-long v12, v10

    .line 511
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 512
    .line 513
    .line 514
    move-result v10

    .line 515
    move v14, v11

    .line 516
    move-wide/from16 v17, v12

    .line 517
    .line 518
    int-to-long v11, v10

    .line 519
    shl-long v17, v17, v14

    .line 520
    .line 521
    and-long v10, v11, v15

    .line 522
    .line 523
    or-long v18, v17, v10

    .line 524
    .line 525
    iget v10, v4, Lml1;->γ:F

    .line 526
    .line 527
    sub-float/2addr v10, v7

    .line 528
    iget v4, v4, Lml1;->δ:F

    .line 529
    .line 530
    sub-float/2addr v4, v8

    .line 531
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 532
    .line 533
    .line 534
    move-result v7

    .line 535
    int-to-long v7, v7

    .line 536
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    int-to-long v10, v4

    .line 541
    shl-long/2addr v7, v14

    .line 542
    and-long/2addr v10, v15

    .line 543
    or-long v20, v7, v10

    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    move-object/from16 v17, v9

    .line 548
    .line 549
    invoke-virtual/range {v17 .. v22}, Lwa0;->κ(JJF)V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_a

    .line 553
    .line 554
    :cond_22
    move v14, v11

    .line 555
    instance-of v10, v3, Lr81;

    .line 556
    .line 557
    const-wide/16 v11, 0x0

    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    if-eqz v10, :cond_23

    .line 561
    .line 562
    move-object v10, v3

    .line 563
    check-cast v10, Lr81;

    .line 564
    .line 565
    iget-object v10, v10, Lr81;->α:Lz91;

    .line 566
    .line 567
    iput-object v13, v9, Lwa0;->λ:Lu81;

    .line 568
    .line 569
    iput-wide v7, v9, Lwa0;->ι:J

    .line 570
    .line 571
    iput-wide v11, v9, Lwa0;->θ:J

    .line 572
    .line 573
    iput v5, v9, Lwa0;->κ:F

    .line 574
    .line 575
    iput-boolean v6, v9, Lwa0;->η:Z

    .line 576
    .line 577
    iput-boolean v4, v9, Lwa0;->ξ:Z

    .line 578
    .line 579
    iput-object v10, v9, Lwa0;->μ:Lz91;

    .line 580
    .line 581
    invoke-virtual {v9}, Lwa0;->α()V

    .line 582
    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_23
    instance-of v10, v3, Lt81;

    .line 586
    .line 587
    if-eqz v10, :cond_26

    .line 588
    .line 589
    move-object v10, v3

    .line 590
    check-cast v10, Lt81;

    .line 591
    .line 592
    move/from16 v17, v14

    .line 593
    .line 594
    iget-object v14, v10, Lt81;->β:Lx2;

    .line 595
    .line 596
    if-eqz v14, :cond_24

    .line 597
    .line 598
    iput-object v13, v9, Lwa0;->λ:Lu81;

    .line 599
    .line 600
    iput-wide v7, v9, Lwa0;->ι:J

    .line 601
    .line 602
    iput-wide v11, v9, Lwa0;->θ:J

    .line 603
    .line 604
    iput v5, v9, Lwa0;->κ:F

    .line 605
    .line 606
    iput-boolean v6, v9, Lwa0;->η:Z

    .line 607
    .line 608
    iput-boolean v4, v9, Lwa0;->ξ:Z

    .line 609
    .line 610
    iput-object v14, v9, Lwa0;->μ:Lz91;

    .line 611
    .line 612
    invoke-virtual {v9}, Lwa0;->α()V

    .line 613
    .line 614
    .line 615
    goto :goto_a

    .line 616
    :cond_24
    iget-object v4, v10, Lt81;->α:Lwo1;

    .line 617
    .line 618
    iget v7, v4, Lwo1;->α:F

    .line 619
    .line 620
    iget v8, v4, Lwo1;->β:F

    .line 621
    .line 622
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    int-to-long v10, v7

    .line 627
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    int-to-long v7, v7

    .line 632
    shl-long v10, v10, v17

    .line 633
    .line 634
    and-long/2addr v7, v15

    .line 635
    or-long v18, v10, v7

    .line 636
    .line 637
    invoke-virtual {v4}, Lwo1;->β()F

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    invoke-virtual {v4}, Lwo1;->α()F

    .line 642
    .line 643
    .line 644
    move-result v8

    .line 645
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    int-to-long v10, v7

    .line 650
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    int-to-long v7, v7

    .line 655
    shl-long v10, v10, v17

    .line 656
    .line 657
    and-long/2addr v7, v15

    .line 658
    or-long v20, v10, v7

    .line 659
    .line 660
    iget-wide v7, v4, Lwo1;->θ:J

    .line 661
    .line 662
    shr-long v7, v7, v17

    .line 663
    .line 664
    long-to-int v4, v7

    .line 665
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 666
    .line 667
    .line 668
    move-result v22

    .line 669
    move-object/from16 v17, v9

    .line 670
    .line 671
    invoke-virtual/range {v17 .. v22}, Lwa0;->κ(JJF)V

    .line 672
    .line 673
    .line 674
    :goto_a
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 675
    .line 676
    const/16 v7, 0x21

    .line 677
    .line 678
    if-ge v4, v7, :cond_28

    .line 679
    .line 680
    instance-of v4, v3, Lr81;

    .line 681
    .line 682
    if-nez v4, :cond_25

    .line 683
    .line 684
    instance-of v4, v3, Lt81;

    .line 685
    .line 686
    if-eqz v4, :cond_28

    .line 687
    .line 688
    check-cast v3, Lt81;

    .line 689
    .line 690
    iget-object v3, v3, Lt81;->α:Lwo1;

    .line 691
    .line 692
    invoke-static {v3}, Lu81;->κ(Lwo1;)Z

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    if-nez v3, :cond_28

    .line 697
    .line 698
    :cond_25
    iget-object v3, v0, Lya0;->ι:Lp70;

    .line 699
    .line 700
    if-eqz v3, :cond_28

    .line 701
    .line 702
    invoke-interface {v3}, Lp70;->invoke()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    goto :goto_b

    .line 706
    :cond_26
    invoke-static {}, Lγ;->κ()V

    .line 707
    .line 708
    .line 709
    return-void

    .line 710
    :cond_27
    move v6, v4

    .line 711
    :cond_28
    :goto_b
    iget v1, v1, Lio1;->ε:I

    .line 712
    .line 713
    iput v1, v0, Lya0;->σ:I

    .line 714
    .line 715
    if-nez v2, :cond_29

    .line 716
    .line 717
    if-eqz v6, :cond_2b

    .line 718
    .line 719
    :cond_29
    iget-object v0, v0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 720
    .line 721
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    if-eqz v1, :cond_2a

    .line 726
    .line 727
    invoke-interface {v1, v0, v0}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 728
    .line 729
    .line 730
    :cond_2a
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    if-eqz v1, :cond_2b

    .line 735
    .line 736
    invoke-virtual {v0, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->Λ(F)V

    .line 737
    .line 738
    .line 739
    :cond_2b
    return-void
.end method

.method public final β(JZ)J
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lya0;->κ()[F

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    const-wide p0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lya0;->λ()[F

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_1
    iget-boolean p0, p0, Lya0;->ψ:Z

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return-wide p1

    .line 24
    :cond_2
    invoke-static {p3, p1, p2}, Lbd;->Ε([FJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final γ(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lya0;->κ:J

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, Lbn0;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/high16 v0, -0x3f800000    # -4.0f

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Λ(F)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-wide p1, p0, Lya0;->κ:J

    .line 23
    .line 24
    iget-boolean p1, p0, Lya0;->ξ:Z

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-boolean p1, p0, Lya0;->λ:Z

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    invoke-virtual {p0, p1}, Lya0;->μ(Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final δ(La21;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lya0;->κ()[F

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lya0;->λ()[F

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    iget-boolean p0, p0, Lya0;->ψ:Z

    .line 13
    .line 14
    if-nez p0, :cond_2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    iput p0, p1, La21;->α:F

    .line 20
    .line 21
    iput p0, p1, La21;->β:F

    .line 22
    .line 23
    iput p0, p1, La21;->γ:F

    .line 24
    .line 25
    iput p0, p1, La21;->δ:F

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {p2, p1}, Lbd;->Ζ([FLa21;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public final ε(Le80;Lp70;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lya0;->ζ:Lua0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lya0;->ε:Lwa0;

    .line 6
    .line 7
    iget-boolean v1, v1, Lwa0;->τ:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "layer should have been released before reuse"

    .line 12
    .line 13
    invoke-static {v1}, Lam0;->α(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Lua0;->β()Lwa0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lya0;->ε:Lwa0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lya0;->λ:Z

    .line 24
    .line 25
    iput-object p1, p0, Lya0;->θ:Le80;

    .line 26
    .line 27
    iput-object p2, p0, Lya0;->ι:Lp70;

    .line 28
    .line 29
    iput-boolean v0, p0, Lya0;->φ:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lya0;->χ:Z

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lya0;->ψ:Z

    .line 35
    .line 36
    iget-object p1, p0, Lya0;->μ:[F

    .line 37
    .line 38
    invoke-static {p1}, Lbd;->Χ([F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lya0;->ν:[F

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, Lbd;->Χ([F)V

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-wide p1, Lr52;->α:J

    .line 49
    .line 50
    iput-wide p1, p0, Lya0;->τ:J

    .line 51
    .line 52
    iput-boolean v0, p0, Lya0;->ω:Z

    .line 53
    .line 54
    const p1, 0x7fffffff

    .line 55
    .line 56
    .line 57
    int-to-long p1, p1

    .line 58
    const/16 v1, 0x20

    .line 59
    .line 60
    shl-long v1, p1, v1

    .line 61
    .line 62
    const-wide v3, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr p1, v3

    .line 68
    or-long/2addr p1, v1

    .line 69
    iput-wide p1, p0, Lya0;->κ:J

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lya0;->υ:Lu81;

    .line 73
    .line 74
    iput v0, p0, Lya0;->σ:I

    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 78
    .line 79
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    throw p0
.end method

.method public final ζ(Lde;Lwa0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya0;->θ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya0;->ε:Lwa0;

    .line 5
    .line 6
    iget-object v0, v0, Lwa0;->α:Lbb0;

    .line 7
    .line 8
    iget v0, v0, Lbb0;->μ:F

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    cmpl-float v0, v0, v1

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iput-boolean v0, p0, Lya0;->ω:Z

    .line 19
    .line 20
    iget-object v0, p0, Lya0;->ρ:Lfe;

    .line 21
    .line 22
    iget-object v1, v0, Lfe;->ζ:Lm6;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lm6;->Ρ(Lde;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v1, Lm6;->η:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p0, p0, Lya0;->ε:Lwa0;

    .line 30
    .line 31
    invoke-static {v0, p0}, Lln0;->φ(Lcw;Lwa0;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final η(J)V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, -0x3f800000    # -4.0f

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Λ(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lya0;->ε:Lwa0;

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Lwa0;->λ(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-interface {p0, v1, v1}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final θ()V
    .locals 9

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lya0;->ξ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-wide v0, p0, Lya0;->τ:J

    .line 9
    .line 10
    sget-wide v2, Lr52;->α:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lya0;->ε:Lwa0;

    .line 18
    .line 19
    iget-wide v0, v0, Lwa0;->φ:J

    .line 20
    .line 21
    iget-wide v2, p0, Lya0;->κ:J

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Lbn0;->α(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lya0;->ε:Lwa0;

    .line 30
    .line 31
    iget-wide v1, p0, Lya0;->τ:J

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    shr-long/2addr v1, v3

    .line 36
    long-to-int v1, v1

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-wide v4, p0, Lya0;->κ:J

    .line 42
    .line 43
    shr-long/2addr v4, v3

    .line 44
    long-to-int v2, v4

    .line 45
    int-to-float v2, v2

    .line 46
    mul-float/2addr v1, v2

    .line 47
    iget-wide v4, p0, Lya0;->τ:J

    .line 48
    .line 49
    const-wide v6, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v4, v6

    .line 55
    long-to-int v2, v4

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget-wide v4, p0, Lya0;->κ:J

    .line 61
    .line 62
    and-long/2addr v4, v6

    .line 63
    long-to-int v4, v4

    .line 64
    int-to-float v4, v4

    .line 65
    mul-float/2addr v2, v4

    .line 66
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    int-to-long v4, v1

    .line 71
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    int-to-long v1, v1

    .line 76
    shl-long v3, v4, v3

    .line 77
    .line 78
    and-long/2addr v1, v6

    .line 79
    or-long/2addr v1, v3

    .line 80
    invoke-virtual {v0, v1, v2}, Lwa0;->η(J)V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_0
    iget-object v3, p0, Lya0;->ε:Lwa0;

    .line 84
    .line 85
    iget-object v4, p0, Lya0;->ο:Lyr;

    .line 86
    .line 87
    iget-object v5, p0, Lya0;->π:Lnp0;

    .line 88
    .line 89
    iget-wide v6, p0, Lya0;->κ:J

    .line 90
    .line 91
    iget-object v8, p0, Lya0;->Α:Lb0;

    .line 92
    .line 93
    invoke-virtual/range {v3 .. v8}, Lwa0;->ε(Lyr;Lnp0;JLa80;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {p0, v0}, Lya0;->μ(Z)V

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void
.end method

.method public final ι(J)Z
    .locals 21

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const-wide v3, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long v5, p1, v3

    .line 16
    .line 17
    long-to-int v1, v5

    .line 18
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    move-object/from16 v5, p0

    .line 23
    .line 24
    iget-object v5, v5, Lya0;->ε:Lwa0;

    .line 25
    .line 26
    iget-boolean v6, v5, Lwa0;->ψ:Z

    .line 27
    .line 28
    if-eqz v6, :cond_9

    .line 29
    .line 30
    invoke-virtual {v5}, Lwa0;->δ()Lu81;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    instance-of v6, v5, Ls81;

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    check-cast v5, Ls81;

    .line 39
    .line 40
    iget-object v0, v5, Ls81;->α:Lml1;

    .line 41
    .line 42
    iget v3, v0, Lml1;->α:F

    .line 43
    .line 44
    cmpg-float v3, v3, v2

    .line 45
    .line 46
    if-gtz v3, :cond_6

    .line 47
    .line 48
    iget v3, v0, Lml1;->γ:F

    .line 49
    .line 50
    cmpg-float v2, v2, v3

    .line 51
    .line 52
    if-gez v2, :cond_6

    .line 53
    .line 54
    iget v2, v0, Lml1;->β:F

    .line 55
    .line 56
    cmpg-float v2, v2, v1

    .line 57
    .line 58
    if-gtz v2, :cond_6

    .line 59
    .line 60
    iget v0, v0, Lml1;->δ:F

    .line 61
    .line 62
    cmpg-float v0, v1, v0

    .line 63
    .line 64
    if-gez v0, :cond_6

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_0
    instance-of v6, v5, Lt81;

    .line 69
    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    check-cast v5, Lt81;

    .line 73
    .line 74
    iget-object v5, v5, Lt81;->α:Lwo1;

    .line 75
    .line 76
    iget v6, v5, Lwo1;->α:F

    .line 77
    .line 78
    iget-wide v7, v5, Lwo1;->ζ:J

    .line 79
    .line 80
    iget-wide v9, v5, Lwo1;->θ:J

    .line 81
    .line 82
    iget-wide v11, v5, Lwo1;->η:J

    .line 83
    .line 84
    iget v13, v5, Lwo1;->δ:F

    .line 85
    .line 86
    iget v14, v5, Lwo1;->β:F

    .line 87
    .line 88
    iget v15, v5, Lwo1;->γ:F

    .line 89
    .line 90
    move/from16 v16, v0

    .line 91
    .line 92
    move/from16 p1, v1

    .line 93
    .line 94
    iget-wide v0, v5, Lwo1;->ε:J

    .line 95
    .line 96
    cmpg-float v17, v2, v6

    .line 97
    .line 98
    if-ltz v17, :cond_6

    .line 99
    .line 100
    cmpl-float v17, v2, v15

    .line 101
    .line 102
    if-gez v17, :cond_6

    .line 103
    .line 104
    cmpg-float v17, p1, v14

    .line 105
    .line 106
    if-ltz v17, :cond_6

    .line 107
    .line 108
    cmpl-float v17, p1, v13

    .line 109
    .line 110
    if-ltz v17, :cond_1

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :cond_1
    move-wide/from16 v17, v3

    .line 115
    .line 116
    shr-long v3, v0, v16

    .line 117
    .line 118
    long-to-int v3, v3

    .line 119
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    move-wide/from16 v19, v0

    .line 124
    .line 125
    shr-long v0, v7, v16

    .line 126
    .line 127
    long-to-int v0, v0

    .line 128
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-float/2addr v1, v4

    .line 133
    invoke-virtual {v5}, Lwo1;->β()F

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    cmpg-float v1, v1, v4

    .line 138
    .line 139
    if-gtz v1, :cond_5

    .line 140
    .line 141
    move v4, v0

    .line 142
    shr-long v0, v9, v16

    .line 143
    .line 144
    long-to-int v0, v0

    .line 145
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    move/from16 p0, v0

    .line 150
    .line 151
    move/from16 p2, v1

    .line 152
    .line 153
    shr-long v0, v11, v16

    .line 154
    .line 155
    long-to-int v0, v0

    .line 156
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    add-float v1, v1, p2

    .line 161
    .line 162
    invoke-virtual {v5}, Lwo1;->β()F

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    cmpg-float v1, v1, v16

    .line 167
    .line 168
    if-gtz v1, :cond_5

    .line 169
    .line 170
    move/from16 v16, v0

    .line 171
    .line 172
    and-long v0, v19, v17

    .line 173
    .line 174
    long-to-int v0, v0

    .line 175
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    and-long v9, v9, v17

    .line 180
    .line 181
    long-to-int v9, v9

    .line 182
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    add-float/2addr v10, v1

    .line 187
    invoke-virtual {v5}, Lwo1;->α()F

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    cmpg-float v1, v10, v1

    .line 192
    .line 193
    if-gtz v1, :cond_5

    .line 194
    .line 195
    and-long v7, v7, v17

    .line 196
    .line 197
    long-to-int v1, v7

    .line 198
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    and-long v10, v11, v17

    .line 203
    .line 204
    long-to-int v8, v10

    .line 205
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    add-float/2addr v10, v7

    .line 210
    invoke-virtual {v5}, Lwo1;->α()F

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    cmpg-float v7, v10, v7

    .line 215
    .line 216
    if-gtz v7, :cond_5

    .line 217
    .line 218
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    add-float/2addr v3, v6

    .line 223
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    add-float/2addr v0, v14

    .line 228
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    sub-float v4, v15, v4

    .line 233
    .line 234
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    add-float/2addr v1, v14

    .line 239
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    sub-float/2addr v15, v7

    .line 244
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    sub-float v7, v13, v7

    .line 249
    .line 250
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    sub-float/2addr v13, v8

    .line 255
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    add-float/2addr v8, v6

    .line 260
    cmpg-float v6, v2, v3

    .line 261
    .line 262
    if-gez v6, :cond_2

    .line 263
    .line 264
    cmpg-float v6, p1, v0

    .line 265
    .line 266
    if-gez v6, :cond_2

    .line 267
    .line 268
    iget-wide v6, v5, Lwo1;->ε:J

    .line 269
    .line 270
    move v5, v0

    .line 271
    move v4, v3

    .line 272
    move/from16 v3, p1

    .line 273
    .line 274
    invoke-static/range {v2 .. v7}, Lu81;->λ(FFFFJ)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    return v0

    .line 279
    :cond_2
    move/from16 v3, p1

    .line 280
    .line 281
    cmpg-float v0, v2, v8

    .line 282
    .line 283
    if-gez v0, :cond_3

    .line 284
    .line 285
    cmpl-float v0, v3, v13

    .line 286
    .line 287
    if-lez v0, :cond_3

    .line 288
    .line 289
    iget-wide v6, v5, Lwo1;->θ:J

    .line 290
    .line 291
    move v4, v8

    .line 292
    move v5, v13

    .line 293
    invoke-static/range {v2 .. v7}, Lu81;->λ(FFFFJ)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    return v0

    .line 298
    :cond_3
    cmpl-float v0, v2, v4

    .line 299
    .line 300
    if-lez v0, :cond_4

    .line 301
    .line 302
    cmpg-float v0, v3, v1

    .line 303
    .line 304
    if-gez v0, :cond_4

    .line 305
    .line 306
    iget-wide v6, v5, Lwo1;->ζ:J

    .line 307
    .line 308
    move v5, v1

    .line 309
    invoke-static/range {v2 .. v7}, Lu81;->λ(FFFFJ)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    return v0

    .line 314
    :cond_4
    cmpl-float v0, v2, v15

    .line 315
    .line 316
    if-lez v0, :cond_9

    .line 317
    .line 318
    cmpl-float v0, v3, v7

    .line 319
    .line 320
    if-lez v0, :cond_9

    .line 321
    .line 322
    move v13, v7

    .line 323
    iget-wide v6, v5, Lwo1;->η:J

    .line 324
    .line 325
    move v5, v13

    .line 326
    move v4, v15

    .line 327
    invoke-static/range {v2 .. v7}, Lu81;->λ(FFFFJ)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    return v0

    .line 332
    :cond_5
    move/from16 v3, p1

    .line 333
    .line 334
    invoke-static {}, Ly2;->α()Lx2;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v0, v5}, Lz91;->α(Lz91;Lwo1;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v2, v3}, Lu81;->ι(Lz91;FF)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    return v0

    .line 346
    :cond_6
    :goto_0
    const/4 v0, 0x0

    .line 347
    return v0

    .line 348
    :cond_7
    move v3, v1

    .line 349
    instance-of v0, v5, Lr81;

    .line 350
    .line 351
    if-eqz v0, :cond_8

    .line 352
    .line 353
    check-cast v5, Lr81;

    .line 354
    .line 355
    iget-object v0, v5, Lr81;->α:Lz91;

    .line 356
    .line 357
    invoke-static {v0, v2, v3}, Lu81;->ι(Lz91;FF)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    return v0

    .line 362
    :cond_8
    invoke-static {}, Lγ;->κ()V

    .line 363
    .line 364
    .line 365
    const/4 v0, 0x0

    .line 366
    return v0

    .line 367
    :cond_9
    :goto_1
    const/4 v0, 0x1

    .line 368
    return v0
.end method

.method public final κ()[F
    .locals 4

    .line 1
    iget-object v0, p0, Lya0;->ν:[F

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lbd;->λ()[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lya0;->ν:[F

    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p0, Lya0;->χ:Z

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
    iput-boolean v2, p0, Lya0;->χ:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Lya0;->λ()[F

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-boolean p0, p0, Lya0;->ψ:Z

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    invoke-static {v1, v0}, Lbd;->Β([F[F)Z

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

.method public final λ()[F
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lya0;->φ:Z

    .line 4
    .line 5
    iget-object v2, v0, Lya0;->μ:[F

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, Lya0;->ε:Lwa0;

    .line 10
    .line 11
    iget-wide v3, v1, Lwa0;->χ:J

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
    iget-wide v3, v0, Lya0;->κ:J

    .line 29
    .line 30
    invoke-static {v3, v4}, Ls1;->Ζ(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Li91;->λ(J)J

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
    iget-object v1, v1, Lwa0;->α:Lbb0;

    .line 59
    .line 60
    iget v4, v1, Lbb0;->κ:F

    .line 61
    .line 62
    iget v1, v1, Lbb0;->λ:F

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    float-to-double v7, v6

    .line 66
    const-wide v9, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    mul-double/2addr v7, v9

    .line 72
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    double-to-float v9, v9

    .line 77
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v10

    .line 81
    double-to-float v10, v10

    .line 82
    neg-float v11, v9

    .line 83
    mul-float v12, v6, v10

    .line 84
    .line 85
    mul-float v13, v6, v9

    .line 86
    .line 87
    sub-float v14, v12, v13

    .line 88
    .line 89
    add-float/2addr v12, v13

    .line 90
    move v13, v6

    .line 91
    move-wide v15, v7

    .line 92
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    double-to-float v6, v6

    .line 97
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v7

    .line 101
    double-to-float v7, v7

    .line 102
    neg-float v8, v6

    .line 103
    mul-float v17, v9, v6

    .line 104
    .line 105
    mul-float/2addr v9, v7

    .line 106
    mul-float v18, v10, v6

    .line 107
    .line 108
    mul-float v19, v10, v7

    .line 109
    .line 110
    mul-float v20, v13, v7

    .line 111
    .line 112
    mul-float v21, v12, v6

    .line 113
    .line 114
    add-float v21, v21, v20

    .line 115
    .line 116
    const/high16 v20, -0x80000000

    .line 117
    .line 118
    mul-float v20, v20, v6

    .line 119
    .line 120
    mul-float/2addr v12, v7

    .line 121
    add-float v12, v12, v20

    .line 122
    .line 123
    move/from16 v20, v13

    .line 124
    .line 125
    move v6, v14

    .line 126
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v13

    .line 130
    double-to-float v13, v13

    .line 131
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v14

    .line 135
    double-to-float v14, v14

    .line 136
    neg-float v15, v13

    .line 137
    mul-float v16, v15, v7

    .line 138
    .line 139
    mul-float v22, v14, v17

    .line 140
    .line 141
    add-float v22, v22, v16

    .line 142
    .line 143
    mul-float/2addr v7, v14

    .line 144
    mul-float v17, v17, v13

    .line 145
    .line 146
    add-float v17, v17, v7

    .line 147
    .line 148
    mul-float v7, v13, v10

    .line 149
    .line 150
    mul-float/2addr v10, v14

    .line 151
    mul-float/2addr v15, v8

    .line 152
    mul-float v16, v14, v9

    .line 153
    .line 154
    add-float v16, v16, v15

    .line 155
    .line 156
    mul-float/2addr v14, v8

    .line 157
    mul-float/2addr v13, v9

    .line 158
    add-float/2addr v13, v14

    .line 159
    mul-float v17, v17, v4

    .line 160
    .line 161
    mul-float/2addr v7, v4

    .line 162
    mul-float/2addr v13, v4

    .line 163
    mul-float v22, v22, v1

    .line 164
    .line 165
    mul-float/2addr v10, v1

    .line 166
    mul-float v16, v16, v1

    .line 167
    .line 168
    const/high16 v1, 0x3f800000    # 1.0f

    .line 169
    .line 170
    mul-float v18, v18, v1

    .line 171
    .line 172
    mul-float/2addr v11, v1

    .line 173
    mul-float v19, v19, v1

    .line 174
    .line 175
    array-length v4, v2

    .line 176
    const/4 v8, 0x0

    .line 177
    const/16 v9, 0x10

    .line 178
    .line 179
    if-ge v4, v9, :cond_1

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_1
    aput v17, v2, v8

    .line 183
    .line 184
    const/4 v4, 0x1

    .line 185
    aput v7, v2, v4

    .line 186
    .line 187
    const/4 v4, 0x2

    .line 188
    aput v13, v2, v4

    .line 189
    .line 190
    const/4 v4, 0x3

    .line 191
    aput v20, v2, v4

    .line 192
    .line 193
    const/4 v4, 0x4

    .line 194
    aput v22, v2, v4

    .line 195
    .line 196
    const/4 v4, 0x5

    .line 197
    aput v10, v2, v4

    .line 198
    .line 199
    const/4 v4, 0x6

    .line 200
    aput v16, v2, v4

    .line 201
    .line 202
    const/4 v4, 0x7

    .line 203
    aput v20, v2, v4

    .line 204
    .line 205
    const/16 v4, 0x8

    .line 206
    .line 207
    aput v18, v2, v4

    .line 208
    .line 209
    const/16 v4, 0x9

    .line 210
    .line 211
    aput v11, v2, v4

    .line 212
    .line 213
    const/16 v4, 0xa

    .line 214
    .line 215
    aput v19, v2, v4

    .line 216
    .line 217
    const/16 v4, 0xb

    .line 218
    .line 219
    aput v20, v2, v4

    .line 220
    .line 221
    neg-float v4, v5

    .line 222
    mul-float v17, v17, v4

    .line 223
    .line 224
    mul-float v22, v22, v3

    .line 225
    .line 226
    sub-float v17, v17, v22

    .line 227
    .line 228
    add-float v17, v17, v21

    .line 229
    .line 230
    add-float v17, v17, v5

    .line 231
    .line 232
    const/16 v5, 0xc

    .line 233
    .line 234
    aput v17, v2, v5

    .line 235
    .line 236
    mul-float/2addr v7, v4

    .line 237
    mul-float/2addr v10, v3

    .line 238
    sub-float/2addr v7, v10

    .line 239
    add-float/2addr v7, v6

    .line 240
    add-float/2addr v7, v3

    .line 241
    const/16 v5, 0xd

    .line 242
    .line 243
    aput v7, v2, v5

    .line 244
    .line 245
    mul-float/2addr v4, v13

    .line 246
    mul-float v3, v3, v16

    .line 247
    .line 248
    sub-float/2addr v4, v3

    .line 249
    add-float/2addr v4, v12

    .line 250
    const/16 v3, 0xe

    .line 251
    .line 252
    aput v4, v2, v3

    .line 253
    .line 254
    const/16 v3, 0xf

    .line 255
    .line 256
    aput v1, v2, v3

    .line 257
    .line 258
    :goto_0
    iput-boolean v8, v0, Lya0;->φ:Z

    .line 259
    .line 260
    invoke-static {v2}, Lyh;->Χ([F)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    iput-boolean v1, v0, Lya0;->ψ:Z

    .line 265
    .line 266
    :cond_2
    return-object v2
.end method

.method public final μ(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lya0;->ξ:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    iput-boolean p1, p0, Lya0;->ξ:Z

    .line 6
    .line 7
    iget-object v0, p0, Lya0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Κ:Lv11;

    .line 10
    .line 11
    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Μ:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Λ:Lv11;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Lv11;->α(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Λ:Lv11;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    new-instance p1, Lv11;

    .line 39
    .line 40
    invoke-direct {p1}, Lv11;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Λ:Lv11;

    .line 44
    .line 45
    :cond_2
    invoke-virtual {p1, p0}, Lv11;->α(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method
