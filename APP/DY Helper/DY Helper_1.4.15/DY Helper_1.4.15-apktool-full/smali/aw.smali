.class public final Law;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;
.implements Lbw;
.implements Lqa0;
.implements Lc41;
.implements Lao;


# instance fields
.field public Α:Z

.field public final Β:Lkv1;

.field public final Γ:Lyv;

.field public final Δ:Lvv;

.field public final Ε:Lvv;

.field public Ζ:Lwa0;

.field public final Η:Lx91;

.field public final Θ:Lt91;

.field public final Ι:Lθ;

.field public final Κ:Lx91;

.field public final Λ:Lq2;

.field public τ:Lep0;

.field public υ:La80;

.field public φ:La80;

.field public χ:La80;

.field public ψ:Le80;

.field public ω:La80;


# direct methods
.method public constructor <init>(Lep0;Lp70;La80;La80;La80;Le80;La80;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lq01;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Law;->τ:Lep0;

    .line 14
    .line 15
    iput-object p3, p0, Law;->υ:La80;

    .line 16
    .line 17
    iput-object p4, p0, Law;->φ:La80;

    .line 18
    .line 19
    iput-object p5, p0, Law;->χ:La80;

    .line 20
    .line 21
    iput-object p6, p0, Law;->ψ:Le80;

    .line 22
    .line 23
    iput-object p7, p0, Law;->ω:La80;

    .line 24
    .line 25
    iput-boolean p8, p0, Law;->Α:Z

    .line 26
    .line 27
    new-instance p1, Lkv1;

    .line 28
    .line 29
    invoke-direct {p1, p2}, Lkv1;-><init>(Lp70;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Law;->Β:Lkv1;

    .line 33
    .line 34
    new-instance p1, Lyv;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lyv;-><init>(Law;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Law;->Γ:Lyv;

    .line 40
    .line 41
    new-instance p1, Lvv;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lvv;-><init>(Law;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Law;->Δ:Lvv;

    .line 47
    .line 48
    new-instance p1, Lvv;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lvv;-><init>(Law;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Law;->Ε:Lvv;

    .line 54
    .line 55
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {p1}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Law;->Η:Lx91;

    .line 62
    .line 63
    new-instance p1, Lt91;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    invoke-direct {p1, p2}, Lt91;-><init>(F)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Law;->Θ:Lt91;

    .line 70
    .line 71
    new-instance p1, Lθ;

    .line 72
    .line 73
    const/16 p2, 0xd

    .line 74
    .line 75
    invoke-direct {p1, p2, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Law;->Ι:Lθ;

    .line 79
    .line 80
    sget-object p1, Lxn0;->κ:Lxn0;

    .line 81
    .line 82
    new-instance p2, Lx91;

    .line 83
    .line 84
    const/4 p3, 0x0

    .line 85
    invoke-direct {p2, p3, p1}, Lx91;-><init>(Ljava/lang/Object;Lxn0;)V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, Law;->Κ:Lx91;

    .line 89
    .line 90
    invoke-static {}, Lpd2;->α()Lq2;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lpd2;->α()Lq2;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Law;->Λ:Lq2;

    .line 98
    .line 99
    return-void
.end method

.method public static final В(Law;Lcw;Lvv;)V
    .locals 4

    .line 1
    iget-object v0, p2, Lvv;->ε:Lt91;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt91;->η()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p2, p2, Lvv;->ζ:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v0, v1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    if-le p2, v1, :cond_1

    .line 18
    .line 19
    int-to-float v1, p2

    .line 20
    div-float/2addr v0, v1

    .line 21
    float-to-int v0, v0

    .line 22
    int-to-float v0, v0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ln;

    .line 30
    .line 31
    invoke-virtual {v1, v0, v0}, Ln;->Η(FF)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v1, p0, Law;->ψ:Le80;

    .line 35
    .line 36
    new-instance v2, Luv;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, p2, v3, p0}, Luv;-><init>(IILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, p1, v2}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Ln;

    .line 52
    .line 53
    neg-float p1, v0

    .line 54
    invoke-virtual {p0, p1, p1}, Ln;->Η(FF)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, Lm6;->ζ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ln;

    .line 66
    .line 67
    neg-float p2, v0

    .line 68
    invoke-virtual {p1, p2, p2}, Ln;->Η(FF)V

    .line 69
    .line 70
    .line 71
    throw p0
.end method


# virtual methods
.method public final Ζ()V
    .locals 2

    .line 1
    new-instance v0, Lη;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lln0;->а(Lq01;Lp70;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final Μ(Laq0;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Laq0;->ε:Lfe;

    .line 6
    .line 7
    iget-boolean v3, v0, Law;->Α:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Laq0;->γ()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v3, v0, Law;->Γ:Lyv;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lfe;->β()F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {v2}, Lfe;->θ()F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-interface {v2}, Lcw;->α()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    iget v9, v3, Lyv;->ε:F

    .line 37
    .line 38
    cmpg-float v9, v4, v9

    .line 39
    .line 40
    const/4 v11, 0x1

    .line 41
    if-nez v9, :cond_2

    .line 42
    .line 43
    iget v9, v3, Lyv;->ζ:F

    .line 44
    .line 45
    cmpg-float v9, v5, v9

    .line 46
    .line 47
    if-nez v9, :cond_2

    .line 48
    .line 49
    iget-wide v12, v3, Lyv;->η:J

    .line 50
    .line 51
    invoke-static {v6, v7, v12, v13}, Ljw1;->α(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    iget-object v9, v3, Lyv;->θ:Lnp0;

    .line 58
    .line 59
    if-eq v8, v9, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v9, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    move v9, v11

    .line 65
    :goto_1
    if-eqz v9, :cond_3

    .line 66
    .line 67
    iput v4, v3, Lyv;->ε:F

    .line 68
    .line 69
    iput v5, v3, Lyv;->ζ:F

    .line 70
    .line 71
    iput-wide v6, v3, Lyv;->η:J

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iput-object v8, v3, Lyv;->θ:Lnp0;

    .line 77
    .line 78
    :cond_3
    if-eqz v9, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Law;->И()V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget-object v4, v0, Law;->Δ:Lvv;

    .line 84
    .line 85
    invoke-virtual {v0, v1, v4}, Law;->З(Lcw;Lvv;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Law;->Η:Lx91;

    .line 89
    .line 90
    invoke-virtual {v4}, Lx91;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const-wide v5, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    const/16 v7, 0x20

    .line 106
    .line 107
    if-eqz v4, :cond_9

    .line 108
    .line 109
    iget-object v4, v0, Law;->Ζ:Lwa0;

    .line 110
    .line 111
    if-nez v4, :cond_5

    .line 112
    .line 113
    invoke-static {v0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-interface {v4}, Lua0;->β()Lwa0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iput-object v4, v0, Law;->Ζ:Lwa0;

    .line 126
    .line 127
    :cond_5
    invoke-interface {v2}, Lcw;->α()J

    .line 128
    .line 129
    .line 130
    move-result-wide v8

    .line 131
    shr-long/2addr v8, v7

    .line 132
    long-to-int v8, v8

    .line 133
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    float-to-int v8, v8

    .line 138
    if-ge v8, v11, :cond_6

    .line 139
    .line 140
    move v8, v11

    .line 141
    :cond_6
    invoke-interface {v2}, Lcw;->α()J

    .line 142
    .line 143
    .line 144
    move-result-wide v12

    .line 145
    and-long/2addr v12, v5

    .line 146
    long-to-int v9, v12

    .line 147
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    float-to-int v9, v9

    .line 152
    if-ge v9, v11, :cond_7

    .line 153
    .line 154
    move v9, v11

    .line 155
    :cond_7
    int-to-long v12, v8

    .line 156
    shl-long/2addr v12, v7

    .line 157
    int-to-long v8, v9

    .line 158
    and-long/2addr v8, v5

    .line 159
    or-long/2addr v8, v12

    .line 160
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    iget-object v12, v12, Lyp0;->Γ:Lyr;

    .line 165
    .line 166
    new-instance v13, Lxv;

    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    invoke-direct {v13, v12, v14, v0}, Lxv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v4, v8, v9, v13}, Laq0;->Η(Lwa0;JLa80;)V

    .line 173
    .line 174
    .line 175
    iget-object v8, v0, Law;->Θ:Lt91;

    .line 176
    .line 177
    invoke-virtual {v8}, Lt91;->η()F

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    iget-object v9, v4, Lwa0;->α:Lbb0;

    .line 182
    .line 183
    iget v12, v9, Lbb0;->θ:F

    .line 184
    .line 185
    cmpg-float v12, v12, v8

    .line 186
    .line 187
    if-nez v12, :cond_8

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    iput v8, v9, Lbb0;->θ:F

    .line 191
    .line 192
    iget-object v9, v9, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 193
    .line 194
    invoke-virtual {v9, v8}, Landroid/graphics/RenderNode;->setAlpha(F)Z

    .line 195
    .line 196
    .line 197
    :goto_2
    invoke-static {v1, v4}, Lln0;->φ(Lcw;Lwa0;)V

    .line 198
    .line 199
    .line 200
    :cond_9
    iget-object v4, v0, Law;->ω:La80;

    .line 201
    .line 202
    if-eqz v4, :cond_a

    .line 203
    .line 204
    invoke-interface {v4, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-virtual {v1}, Laq0;->γ()V

    .line 208
    .line 209
    .line 210
    iget-object v4, v0, Law;->φ:La80;

    .line 211
    .line 212
    if-eqz v4, :cond_1d

    .line 213
    .line 214
    invoke-interface {v4, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    check-cast v4, Lie0;

    .line 219
    .line 220
    if-eqz v4, :cond_1d

    .line 221
    .line 222
    iget-object v8, v3, Lyv;->Θ:Law;

    .line 223
    .line 224
    iget-object v8, v8, Law;->Β:Lkv1;

    .line 225
    .line 226
    iget-object v8, v8, Lkv1;->α:Lp70;

    .line 227
    .line 228
    invoke-interface {v8}, Lp70;->invoke()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    check-cast v8, Liv1;

    .line 233
    .line 234
    iget-object v3, v3, Lyv;->μ:Ljp1;

    .line 235
    .line 236
    iget-object v9, v4, Lie0;->γ:Lla;

    .line 237
    .line 238
    iget v12, v4, Lie0;->β:F

    .line 239
    .line 240
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object v0, v0, Law;->Λ:Lq2;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget v4, v4, Lie0;->α:F

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    cmpg-float v14, v4, v13

    .line 255
    .line 256
    if-lez v14, :cond_1d

    .line 257
    .line 258
    cmpg-float v14, v12, v13

    .line 259
    .line 260
    if-gtz v14, :cond_b

    .line 261
    .line 262
    goto/16 :goto_10

    .line 263
    .line 264
    :cond_b
    invoke-interface {v2}, Lcw;->α()J

    .line 265
    .line 266
    .line 267
    move-result-wide v14

    .line 268
    move-wide/from16 v16, v5

    .line 269
    .line 270
    shr-long v5, v14, v7

    .line 271
    .line 272
    long-to-int v5, v5

    .line 273
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    cmpg-float v6, v6, v13

    .line 278
    .line 279
    if-lez v6, :cond_1d

    .line 280
    .line 281
    move/from16 v18, v11

    .line 282
    .line 283
    and-long v10, v14, v16

    .line 284
    .line 285
    long-to-int v10, v10

    .line 286
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    cmpg-float v11, v11, v13

    .line 291
    .line 292
    if-gtz v11, :cond_c

    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    .line 296
    :cond_c
    invoke-virtual {v1, v4}, Laq0;->υ(F)F

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    invoke-static {v14, v15}, Ljw1;->β(J)F

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    const/high16 v13, 0x40000000    # 2.0f

    .line 305
    .line 306
    div-float/2addr v11, v13

    .line 307
    cmpl-float v14, v4, v11

    .line 308
    .line 309
    if-lez v14, :cond_d

    .line 310
    .line 311
    move v4, v11

    .line 312
    :cond_d
    iget-boolean v11, v9, Lla;->ζ:Z

    .line 313
    .line 314
    iget-wide v14, v9, Lla;->α:J

    .line 315
    .line 316
    invoke-static {}, Lp91;->π()Z

    .line 317
    .line 318
    .line 319
    move-result v19

    .line 320
    if-nez v19, :cond_e

    .line 321
    .line 322
    move-object/from16 v22, v2

    .line 323
    .line 324
    move/from16 v16, v5

    .line 325
    .line 326
    move/from16 v19, v10

    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    goto/16 :goto_f

    .line 330
    .line 331
    :cond_e
    invoke-interface {v2}, Lcw;->α()J

    .line 332
    .line 333
    .line 334
    move-result-wide v19

    .line 335
    if-eqz v11, :cond_f

    .line 336
    .line 337
    const-string v21, "BloomStrokeDual"

    .line 338
    .line 339
    :goto_3
    move/from16 v22, v7

    .line 340
    .line 341
    move-object/from16 v7, v21

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_f
    const-string v21, "BloomStrokeSingle"

    .line 345
    .line 346
    goto :goto_3

    .line 347
    :goto_4
    if-eqz v11, :cond_10

    .line 348
    .line 349
    sget-object v21, Lev1;->γ:Ljava/lang/String;

    .line 350
    .line 351
    :goto_5
    move/from16 v23, v13

    .line 352
    .line 353
    move-object/from16 v13, v21

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_10
    sget-object v21, Lev1;->β:Ljava/lang/String;

    .line 357
    .line 358
    goto :goto_5

    .line 359
    :goto_6
    invoke-interface {v3, v7, v13}, Ljp1;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    shr-long v6, v19, v22

    .line 364
    .line 365
    long-to-int v6, v6

    .line 366
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    const/high16 v7, 0x3f000000    # 0.5f

    .line 371
    .line 372
    mul-float/2addr v6, v7

    .line 373
    move/from16 v22, v7

    .line 374
    .line 375
    move-object v13, v8

    .line 376
    and-long v7, v19, v16

    .line 377
    .line 378
    long-to-int v7, v7

    .line 379
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    mul-float v7, v7, v22

    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v8, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 389
    .line 390
    move/from16 v16, v5

    .line 391
    .line 392
    const-string v5, "halfView"

    .line 393
    .line 394
    invoke-static {v8, v5, v6, v7}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 395
    .line 396
    .line 397
    float-to-double v5, v6

    .line 398
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 399
    .line 400
    .line 401
    move-result-wide v5

    .line 402
    double-to-float v5, v5

    .line 403
    float-to-double v6, v7

    .line 404
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 405
    .line 406
    .line 407
    move-result-wide v6

    .line 408
    double-to-float v6, v6

    .line 409
    iget-object v7, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 410
    .line 411
    const-string v8, "halfViewFloor"

    .line 412
    .line 413
    invoke-static {v7, v8, v5, v6}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v2}, Lcw;->α()J

    .line 417
    .line 418
    .line 419
    move-result-wide v5

    .line 420
    invoke-static {v5, v6}, Ljw1;->β(J)F

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    div-float v7, v7, v23

    .line 425
    .line 426
    instance-of v8, v13, Lxo1;

    .line 427
    .line 428
    if-eqz v8, :cond_11

    .line 429
    .line 430
    move-object v8, v13

    .line 431
    check-cast v8, Lxo1;

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_11
    const/4 v8, 0x0

    .line 435
    :goto_7
    if-nez v8, :cond_12

    .line 436
    .line 437
    iget-object v5, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 438
    .line 439
    invoke-static {v5, v7, v7, v7, v7}, Lц;->ξ(Landroid/graphics/RuntimeShader;FFFF)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v22, v2

    .line 443
    .line 444
    move/from16 v19, v10

    .line 445
    .line 446
    move/from16 v20, v11

    .line 447
    .line 448
    goto/16 :goto_e

    .line 449
    .line 450
    :cond_12
    iget-object v13, v8, Lxo1;->δ:Lea1;

    .line 451
    .line 452
    move/from16 v17, v7

    .line 453
    .line 454
    iget-object v7, v8, Lxo1;->γ:Lea1;

    .line 455
    .line 456
    move/from16 v19, v10

    .line 457
    .line 458
    iget-object v10, v8, Lxo1;->β:Lea1;

    .line 459
    .line 460
    iget-object v8, v8, Lxo1;->α:Lea1;

    .line 461
    .line 462
    move/from16 v20, v11

    .line 463
    .line 464
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    move-object/from16 v22, v2

    .line 469
    .line 470
    sget-object v2, Lnp0;->ε:Lnp0;

    .line 471
    .line 472
    if-ne v11, v2, :cond_13

    .line 473
    .line 474
    move/from16 v2, v18

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_13
    const/4 v2, 0x0

    .line 478
    :goto_8
    if-eqz v2, :cond_14

    .line 479
    .line 480
    invoke-virtual {v8, v5, v6}, Lea1;->α(J)F

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    goto :goto_9

    .line 485
    :cond_14
    invoke-virtual {v10, v5, v6}, Lea1;->α(J)F

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    :goto_9
    if-eqz v2, :cond_15

    .line 490
    .line 491
    invoke-virtual {v10, v5, v6}, Lea1;->α(J)F

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    goto :goto_a

    .line 496
    :cond_15
    invoke-virtual {v8, v5, v6}, Lea1;->α(J)F

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    :goto_a
    if-eqz v2, :cond_16

    .line 501
    .line 502
    invoke-virtual {v7, v5, v6}, Lea1;->α(J)F

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    goto :goto_b

    .line 507
    :cond_16
    invoke-virtual {v13, v5, v6}, Lea1;->α(J)F

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    :goto_b
    if-eqz v2, :cond_17

    .line 512
    .line 513
    invoke-virtual {v13, v5, v6}, Lea1;->α(J)F

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    goto :goto_c

    .line 518
    :cond_17
    invoke-virtual {v7, v5, v6}, Lea1;->α(J)F

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    :goto_c
    cmpl-float v5, v11, v17

    .line 523
    .line 524
    if-lez v5, :cond_18

    .line 525
    .line 526
    move/from16 v11, v17

    .line 527
    .line 528
    :cond_18
    cmpl-float v5, v8, v17

    .line 529
    .line 530
    if-lez v5, :cond_19

    .line 531
    .line 532
    move/from16 v8, v17

    .line 533
    .line 534
    :cond_19
    cmpl-float v5, v2, v17

    .line 535
    .line 536
    if-lez v5, :cond_1a

    .line 537
    .line 538
    move/from16 v2, v17

    .line 539
    .line 540
    :cond_1a
    cmpl-float v5, v10, v17

    .line 541
    .line 542
    if-lez v5, :cond_1b

    .line 543
    .line 544
    move/from16 v7, v17

    .line 545
    .line 546
    goto :goto_d

    .line 547
    :cond_1b
    move v7, v10

    .line 548
    :goto_d
    iget-object v5, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 549
    .line 550
    invoke-static {v5, v11, v8, v2, v7}, Lц;->ξ(Landroid/graphics/RuntimeShader;FFFF)V

    .line 551
    .line 552
    .line 553
    :goto_e
    const-string v2, "strokeWidth"

    .line 554
    .line 555
    iget-object v5, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 556
    .line 557
    invoke-static {v5, v2, v4}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 558
    .line 559
    .line 560
    iget v2, v9, Lla;->γ:F

    .line 561
    .line 562
    invoke-virtual {v1, v2}, Laq0;->υ(F)F

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    const-string v2, "innerBlurRadius"

    .line 567
    .line 568
    iget-object v4, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 569
    .line 570
    invoke-static {v4, v2, v1}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 571
    .line 572
    .line 573
    mul-float/2addr v1, v1

    .line 574
    iget-object v2, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 575
    .line 576
    const-string v4, "innerBlurRadiusSq"

    .line 577
    .line 578
    invoke-static {v2, v4, v1}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 579
    .line 580
    .line 581
    const-string v1, "highlightAlpha"

    .line 582
    .line 583
    iget-object v2, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 584
    .line 585
    invoke-static {v2, v1, v12}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 586
    .line 587
    .line 588
    const/high16 v1, 0x3f800000    # 1.0f

    .line 589
    .line 590
    invoke-static {v14, v15, v1}, Lci;->β(JF)J

    .line 591
    .line 592
    .line 593
    move-result-wide v1

    .line 594
    iget-object v4, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 595
    .line 596
    invoke-static {v1, v2}, Lkn0;->Τ(J)I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    const-string v2, "strokeColor"

    .line 601
    .line 602
    invoke-static {v4, v2, v1}, Lц;->σ(Landroid/graphics/RuntimeShader;Ljava/lang/String;I)V

    .line 603
    .line 604
    .line 605
    invoke-static {v14, v15}, Lci;->δ(J)F

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    iget-object v2, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 610
    .line 611
    const-string v4, "strokeAlphaMul"

    .line 612
    .line 613
    invoke-static {v2, v4, v1}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 614
    .line 615
    .line 616
    iget-object v1, v9, Lla;->δ:Lpr0;

    .line 617
    .line 618
    xor-int/lit8 v2, v20, 0x1

    .line 619
    .line 620
    const-string v4, "1"

    .line 621
    .line 622
    invoke-static {v3, v4, v1, v2}, Lyh;->η(Lb3;Ljava/lang/String;Lpr0;Z)V

    .line 623
    .line 624
    .line 625
    const-string v1, "2"

    .line 626
    .line 627
    iget-object v4, v9, Lla;->ε:Lpr0;

    .line 628
    .line 629
    invoke-static {v3, v1, v4, v2}, Lyh;->η(Lb3;Ljava/lang/String;Lpr0;Z)V

    .line 630
    .line 631
    .line 632
    iget-object v1, v3, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 633
    .line 634
    :goto_f
    if-nez v1, :cond_1c

    .line 635
    .line 636
    goto :goto_10

    .line 637
    :cond_1c
    invoke-virtual {v0, v1}, Lq2;->ζ(Landroid/graphics/Shader;)V

    .line 638
    .line 639
    .line 640
    iget v1, v9, Lla;->β:I

    .line 641
    .line 642
    invoke-virtual {v0, v1}, Lq2;->δ(I)V

    .line 643
    .line 644
    .line 645
    move-object/from16 v1, v22

    .line 646
    .line 647
    iget-object v1, v1, Lfe;->ζ:Lm6;

    .line 648
    .line 649
    invoke-virtual {v1}, Lm6;->υ()Lde;

    .line 650
    .line 651
    .line 652
    move-result-object v13

    .line 653
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 654
    .line 655
    .line 656
    move-result v16

    .line 657
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 658
    .line 659
    .line 660
    move-result v17

    .line 661
    const/4 v14, 0x0

    .line 662
    const/4 v15, 0x0

    .line 663
    move-object/from16 v18, v0

    .line 664
    .line 665
    invoke-interface/range {v13 .. v18}, Lde;->κ(FFFFLq2;)V

    .line 666
    .line 667
    .line 668
    move-object/from16 v1, v18

    .line 669
    .line 670
    const/4 v0, 0x0

    .line 671
    invoke-virtual {v1, v0}, Lq2;->ζ(Landroid/graphics/Shader;)V

    .line 672
    .line 673
    .line 674
    :cond_1d
    :goto_10
    return-void
.end method

.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, Lch1;->ε:I

    .line 9
    .line 10
    iget p4, p2, Lch1;->ζ:I

    .line 11
    .line 12
    new-instance v0, Lwa;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-direct {v0, p0, v1, p2}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkz;->ε:Lkz;

    .line 20
    .line 21
    invoke-interface {p1, p3, p4, p0, v0}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final ξ(Lq31;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Law;->τ:Lep0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Law;->Κ:Lx91;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final Г(Lcw;Lvv;ILwa0;IILwa0;IIFLjava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    move/from16 v2, p5

    .line 4
    .line 5
    move/from16 v3, p6

    .line 6
    .line 7
    move-object/from16 v4, p11

    .line 8
    .line 9
    iget-object v5, p2, Lvv;->κ:[Lin;

    .line 10
    .line 11
    iget-object v6, p2, Lvv;->ι:[I

    .line 12
    .line 13
    iget-object v7, p2, Lvv;->θ:[I

    .line 14
    .line 15
    iget-object v8, p2, Lvv;->η:[Ljava/lang/String;

    .line 16
    .line 17
    aget-object v5, v5, p3

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    aget-object v9, v8, p3

    .line 22
    .line 23
    invoke-static {v9, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    aget v9, v7, p3

    .line 30
    .line 31
    if-ne v9, v2, :cond_0

    .line 32
    .line 33
    aget v9, v6, p3

    .line 34
    .line 35
    if-ne v9, v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v5, p0, Law;->Γ:Lyv;

    .line 39
    .line 40
    move-object/from16 v9, p12

    .line 41
    .line 42
    invoke-virtual {v5, v4, v9}, Lyv;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    int-to-float v9, v2

    .line 47
    const/high16 v10, 0x3f000000    # 0.5f

    .line 48
    .line 49
    sub-float/2addr v9, v10

    .line 50
    int-to-float v11, v3

    .line 51
    sub-float/2addr v11, v10

    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v10, v5, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 56
    .line 57
    const-string v12, "maxCoord"

    .line 58
    .line 59
    invoke-static {v10, v12, v9, v11}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 60
    .line 61
    .line 62
    const-string v9, "child"

    .line 63
    .line 64
    invoke-static {v5, v9}, Lg81;->ρ(Lb3;Ljava/lang/String;)La3;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    iget-object v0, p2, Lvv;->κ:[Lin;

    .line 69
    .line 70
    aput-object v5, v0, p3

    .line 71
    .line 72
    aput-object v4, v8, p3

    .line 73
    .line 74
    aput v2, v7, p3

    .line 75
    .line 76
    aput v3, v6, p3

    .line 77
    .line 78
    :goto_0
    invoke-virtual {v1, v5}, Lwa0;->ι(Lin;)V

    .line 79
    .line 80
    .line 81
    move/from16 v0, p8

    .line 82
    .line 83
    int-to-long v2, v0

    .line 84
    const/16 v0, 0x20

    .line 85
    .line 86
    shl-long/2addr v2, v0

    .line 87
    move/from16 v0, p9

    .line 88
    .line 89
    int-to-long v4, v0

    .line 90
    const-wide v6, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v4, v6

    .line 96
    or-long/2addr v2, v4

    .line 97
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-object p0, p0, Lyp0;->Γ:Lyr;

    .line 102
    .line 103
    new-instance v0, Lwv;

    .line 104
    .line 105
    move/from16 v4, p10

    .line 106
    .line 107
    invoke-direct {v0, p0, v4, v1}, Lwv;-><init>(Lyr;FLwa0;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 p0, p7

    .line 111
    .line 112
    invoke-interface {p1, p0, v2, v3, v0}, Lcw;->Η(Lwa0;JLa80;)V

    .line 113
    .line 114
    .line 115
    const/4 p0, 0x0

    .line 116
    invoke-virtual {v1, p0}, Lwa0;->ι(Lin;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final Д()V
    .locals 0

    .line 1
    iget-object p0, p0, Law;->Γ:Lyv;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Е(Lcw;Lvv;Lwa0;FFIFFII)V
    .locals 4

    .line 1
    iget-object p0, p0, Law;->Γ:Lyv;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    cmpg-float p0, p5, p0

    .line 8
    .line 9
    const-wide/16 p9, 0x0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    move-wide p5, p9

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    int-to-float p0, p6

    .line 16
    div-float/2addr p5, p0

    .line 17
    float-to-int p0, p5

    .line 18
    neg-int p0, p0

    .line 19
    int-to-long p5, p0

    .line 20
    const/16 p0, 0x20

    .line 21
    .line 22
    shl-long v0, p5, p0

    .line 23
    .line 24
    const-wide v2, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr p5, v2

    .line 30
    or-long/2addr p5, v0

    .line 31
    :goto_0
    invoke-virtual {p3, p5, p6}, Lwa0;->λ(J)V

    .line 32
    .line 33
    .line 34
    neg-float p0, p7

    .line 35
    neg-float p2, p8

    .line 36
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 37
    .line 38
    .line 39
    move-result-object p5

    .line 40
    iget-object p5, p5, Lm6;->ζ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p5, Ln;

    .line 43
    .line 44
    invoke-virtual {p5, p0, p2}, Ln;->Η(FF)V

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 48
    .line 49
    .line 50
    move-result-object p5

    .line 51
    invoke-virtual {p5}, Lm6;->Ζ()J

    .line 52
    .line 53
    .line 54
    move-result-wide p6

    .line 55
    invoke-virtual {p5}, Lm6;->υ()Lde;

    .line 56
    .line 57
    .line 58
    move-result-object p8

    .line 59
    invoke-interface {p8}, Lde;->θ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :try_start_1
    iget-object p8, p5, Lm6;->ζ:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p8, Ln;

    .line 65
    .line 66
    invoke-virtual {p8, p4, p4, p9, p10}, Ln;->Ε(FFJ)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p3}, Lln0;->φ(Lcw;Lwa0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    :try_start_2
    invoke-virtual {p5}, Lm6;->υ()Lde;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-interface {p3}, Lde;->ζ()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p5, p6, p7}, Lm6;->Υ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, Lm6;->ζ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Ln;

    .line 89
    .line 90
    neg-float p0, p0

    .line 91
    neg-float p2, p2

    .line 92
    invoke-virtual {p1, p0, p2}, Ln;->Η(FF)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_0
    move-exception p3

    .line 97
    goto :goto_1

    .line 98
    :catchall_1
    move-exception p3

    .line 99
    :try_start_3
    invoke-virtual {p5}, Lm6;->υ()Lde;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-interface {p4}, Lde;->ζ()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p5, p6, p7}, Lm6;->Υ(J)V

    .line 107
    .line 108
    .line 109
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 110
    :goto_1
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p1, p1, Lm6;->ζ:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Ln;

    .line 117
    .line 118
    neg-float p0, p0

    .line 119
    neg-float p2, p2

    .line 120
    invoke-virtual {p1, p0, p2}, Ln;->Η(FF)V

    .line 121
    .line 122
    .line 123
    throw p3
.end method

.method public final Ж()V
    .locals 4

    .line 1
    iget-object v0, p0, Law;->Δ:Lvv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvv;->β()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Law;->Ε:Lvv;

    .line 7
    .line 8
    invoke-virtual {v0}, Lvv;->β()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Law;->Ζ:Lwa0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1, v0}, Lua0;->α(Lwa0;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Law;->Ζ:Lwa0;

    .line 28
    .line 29
    iget-object v1, p0, Law;->Η:Lx91;

    .line 30
    .line 31
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Law;->Γ:Lyv;

    .line 37
    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    iput v1, p0, Lyv;->ε:F

    .line 41
    .line 42
    iput v1, p0, Lyv;->ζ:F

    .line 43
    .line 44
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    iput-wide v1, p0, Lyv;->η:J

    .line 50
    .line 51
    sget-object v1, Lnp0;->ε:Lnp0;

    .line 52
    .line 53
    iput-object v1, p0, Lyv;->θ:Lnp0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput v1, p0, Lyv;->ι:F

    .line 57
    .line 58
    iput-object v0, p0, Lyv;->κ:Lin;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    iput v2, p0, Lyv;->λ:I

    .line 62
    .line 63
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 64
    .line 65
    iput v2, p0, Lyv;->σ:F

    .line 66
    .line 67
    iput v2, p0, Lyv;->τ:F

    .line 68
    .line 69
    iput v2, p0, Lyv;->υ:F

    .line 70
    .line 71
    iput v2, p0, Lyv;->φ:F

    .line 72
    .line 73
    const/4 v3, -0x1

    .line 74
    iput v3, p0, Lyv;->χ:I

    .line 75
    .line 76
    iput-object v0, p0, Lyv;->ψ:Lin;

    .line 77
    .line 78
    iput v2, p0, Lyv;->ω:F

    .line 79
    .line 80
    iput v2, p0, Lyv;->Α:F

    .line 81
    .line 82
    iput v2, p0, Lyv;->Β:F

    .line 83
    .line 84
    iput-object v0, p0, Lyv;->Γ:La3;

    .line 85
    .line 86
    iput v3, p0, Lyv;->Δ:I

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iput v0, p0, Lyv;->Ε:I

    .line 90
    .line 91
    iput v0, p0, Lyv;->Ζ:I

    .line 92
    .line 93
    iput v1, p0, Lyv;->Η:F

    .line 94
    .line 95
    return-void
.end method

.method public final З(Lcw;Lvv;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v7, v2, Lvv;->α:Lwa0;

    .line 8
    .line 9
    if-nez v7, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v3, v2, Lvv;->ε:Lt91;

    .line 13
    .line 14
    invoke-virtual {v3}, Lt91;->η()F

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    iget v6, v2, Lvv;->δ:I

    .line 19
    .line 20
    invoke-interface {v1}, Lcw;->α()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    const/16 v8, 0x20

    .line 25
    .line 26
    shr-long/2addr v3, v8

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x2

    .line 33
    int-to-float v9, v4

    .line 34
    mul-float/2addr v9, v5

    .line 35
    add-float/2addr v3, v9

    .line 36
    float-to-int v3, v3

    .line 37
    invoke-interface {v1}, Lcw;->α()J

    .line 38
    .line 39
    .line 40
    move-result-wide v10

    .line 41
    const-wide v12, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v10, v12

    .line 47
    long-to-int v10, v10

    .line 48
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    add-float/2addr v10, v9

    .line 53
    float-to-int v10, v10

    .line 54
    const/4 v14, 0x1

    .line 55
    if-gt v6, v14, :cond_2

    .line 56
    .line 57
    iput v14, v2, Lvv;->ζ:I

    .line 58
    .line 59
    int-to-long v3, v3

    .line 60
    shl-long/2addr v3, v8

    .line 61
    int-to-long v9, v10

    .line 62
    and-long/2addr v9, v12

    .line 63
    or-long/2addr v3, v9

    .line 64
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-object v6, v6, Lyp0;->Γ:Lyr;

    .line 69
    .line 70
    new-instance v9, Lzv;

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    invoke-direct {v9, v6, v0, v2, v10}, Lzv;-><init>(Lyr;Lq01;Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v7, v3, v4, v9}, Lcw;->Η(Lwa0;JLa80;)V

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    cmpg-float v0, v5, v0

    .line 81
    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    const-wide/16 v2, 0x0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    float-to-int v0, v5

    .line 88
    neg-int v0, v0

    .line 89
    int-to-long v2, v0

    .line 90
    shl-long v4, v2, v8

    .line 91
    .line 92
    and-long/2addr v2, v12

    .line 93
    or-long/2addr v2, v4

    .line 94
    :goto_0
    invoke-virtual {v7, v2, v3}, Lwa0;->λ(J)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v7}, Lln0;->φ(Lcw;Lwa0;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    if-gt v6, v4, :cond_5

    .line 102
    .line 103
    iput v4, v2, Lvv;->ζ:I

    .line 104
    .line 105
    div-int/lit8 v4, v3, 0x2

    .line 106
    .line 107
    if-ge v4, v14, :cond_3

    .line 108
    .line 109
    move v4, v14

    .line 110
    :cond_3
    div-int/lit8 v9, v10, 0x2

    .line 111
    .line 112
    if-ge v9, v14, :cond_4

    .line 113
    .line 114
    :goto_1
    move v11, v8

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move v14, v9

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    int-to-long v8, v4

    .line 119
    shl-long/2addr v8, v11

    .line 120
    int-to-long v14, v14

    .line 121
    and-long v11, v14, v12

    .line 122
    .line 123
    or-long/2addr v8, v11

    .line 124
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    iget-object v4, v4, Lyp0;->Γ:Lyr;

    .line 129
    .line 130
    new-instance v11, Lzv;

    .line 131
    .line 132
    const/4 v12, 0x1

    .line 133
    invoke-direct {v11, v4, v0, v2, v12}, Lzv;-><init>(Lyr;Lq01;Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v1, v7, v8, v9, v11}, Lcw;->Η(Lwa0;JLa80;)V

    .line 137
    .line 138
    .line 139
    int-to-float v4, v6

    .line 140
    iget-object v8, v0, Law;->τ:Lep0;

    .line 141
    .line 142
    move v9, v3

    .line 143
    move-object v3, v7

    .line 144
    iget v7, v8, Lep0;->δ:F

    .line 145
    .line 146
    iget v8, v8, Lep0;->ε:F

    .line 147
    .line 148
    invoke-virtual/range {v0 .. v10}, Law;->Е(Lcw;Lvv;Lwa0;FFIFFII)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    move/from16 v17, v3

    .line 153
    .line 154
    move/from16 v16, v5

    .line 155
    .line 156
    move v3, v6

    .line 157
    move-object v15, v7

    .line 158
    move v11, v8

    .line 159
    move/from16 v18, v10

    .line 160
    .line 161
    iput v4, v2, Lvv;->ζ:I

    .line 162
    .line 163
    div-int/lit8 v4, v17, 0x2

    .line 164
    .line 165
    if-ge v4, v14, :cond_6

    .line 166
    .line 167
    move v5, v14

    .line 168
    goto :goto_3

    .line 169
    :cond_6
    move v5, v4

    .line 170
    :goto_3
    div-int/lit8 v10, v18, 0x2

    .line 171
    .line 172
    if-ge v10, v14, :cond_7

    .line 173
    .line 174
    move v6, v14

    .line 175
    goto :goto_4

    .line 176
    :cond_7
    move v6, v10

    .line 177
    :goto_4
    const/4 v4, 0x0

    .line 178
    invoke-virtual {v2, v4}, Lvv;->α(I)Lwa0;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    int-to-long v7, v5

    .line 183
    shl-long/2addr v7, v11

    .line 184
    int-to-long v9, v6

    .line 185
    and-long/2addr v9, v12

    .line 186
    or-long/2addr v7, v9

    .line 187
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    iget-object v9, v9, Lyp0;->Γ:Lyr;

    .line 192
    .line 193
    new-instance v10, Lzv;

    .line 194
    .line 195
    const/4 v11, 0x2

    .line 196
    invoke-direct {v10, v9, v0, v2, v11}, Lzv;-><init>(Lyr;Lq01;Ljava/lang/Object;I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v1, v4, v7, v8, v10}, Lcw;->Η(Lwa0;JLa80;)V

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x4

    .line 203
    if-eq v3, v7, :cond_10

    .line 204
    .line 205
    const/16 v7, 0x8

    .line 206
    .line 207
    if-eq v3, v7, :cond_d

    .line 208
    .line 209
    const/16 v7, 0x10

    .line 210
    .line 211
    if-ne v3, v7, :cond_c

    .line 212
    .line 213
    div-int/lit8 v7, v5, 0x4

    .line 214
    .line 215
    if-ge v7, v14, :cond_8

    .line 216
    .line 217
    move v8, v14

    .line 218
    goto :goto_5

    .line 219
    :cond_8
    move v8, v7

    .line 220
    :goto_5
    div-int/lit8 v7, v6, 0x4

    .line 221
    .line 222
    if-ge v7, v14, :cond_9

    .line 223
    .line 224
    move v9, v14

    .line 225
    goto :goto_6

    .line 226
    :cond_9
    move v9, v7

    .line 227
    :goto_6
    invoke-virtual {v2, v14}, Lvv;->α(I)Lwa0;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    const-string v11, "Downsample4x"

    .line 232
    .line 233
    const-string v12, "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"

    .line 234
    .line 235
    move v10, v3

    .line 236
    const/4 v3, 0x0

    .line 237
    move v13, v10

    .line 238
    const/high16 v10, 0x3e800000    # 0.25f

    .line 239
    .line 240
    invoke-virtual/range {v0 .. v12}, Law;->Г(Lcw;Lvv;ILwa0;IILwa0;IIFLjava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    move-object v4, v7

    .line 244
    move v5, v8

    .line 245
    move v6, v9

    .line 246
    div-int/lit8 v8, v5, 0x2

    .line 247
    .line 248
    if-ge v8, v14, :cond_a

    .line 249
    .line 250
    move v8, v14

    .line 251
    :cond_a
    div-int/lit8 v9, v6, 0x2

    .line 252
    .line 253
    if-ge v9, v14, :cond_b

    .line 254
    .line 255
    move v9, v14

    .line 256
    :cond_b
    const-string v11, "Downsample2x"

    .line 257
    .line 258
    const-string v12, "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"

    .line 259
    .line 260
    const/4 v3, 0x1

    .line 261
    const/high16 v10, 0x3f000000    # 0.5f

    .line 262
    .line 263
    move-object/from16 v0, p0

    .line 264
    .line 265
    move-object/from16 v1, p1

    .line 266
    .line 267
    move-object/from16 v2, p2

    .line 268
    .line 269
    move-object v7, v15

    .line 270
    invoke-virtual/range {v0 .. v12}, Law;->Г(Lcw;Lvv;ILwa0;IILwa0;IIFLjava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_7
    move-object v3, v7

    .line 274
    goto/16 :goto_c

    .line 275
    .line 276
    :cond_c
    move v13, v3

    .line 277
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 278
    .line 279
    new-instance v1, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    const-string v2, "Unsupported scaleFactor: "

    .line 282
    .line 283
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v2, " (must be 1/2/4/8/16)"

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v0

    .line 306
    :cond_d
    move v13, v3

    .line 307
    move-object v3, v15

    .line 308
    div-int/lit8 v0, v5, 0x4

    .line 309
    .line 310
    if-ge v0, v14, :cond_e

    .line 311
    .line 312
    move v8, v14

    .line 313
    goto :goto_8

    .line 314
    :cond_e
    move v8, v0

    .line 315
    :goto_8
    div-int/lit8 v0, v6, 0x4

    .line 316
    .line 317
    if-ge v0, v14, :cond_f

    .line 318
    .line 319
    move v9, v14

    .line 320
    goto :goto_9

    .line 321
    :cond_f
    move v9, v0

    .line 322
    :goto_9
    const-string v11, "Downsample4x"

    .line 323
    .line 324
    const-string v12, "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"

    .line 325
    .line 326
    move-object v7, v3

    .line 327
    const/4 v3, 0x0

    .line 328
    const/high16 v10, 0x3e800000    # 0.25f

    .line 329
    .line 330
    move-object/from16 v0, p0

    .line 331
    .line 332
    move-object/from16 v1, p1

    .line 333
    .line 334
    move-object/from16 v2, p2

    .line 335
    .line 336
    invoke-virtual/range {v0 .. v12}, Law;->Г(Lcw;Lvv;ILwa0;IILwa0;IIFLjava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_10
    move v13, v3

    .line 341
    move-object v3, v15

    .line 342
    div-int/lit8 v0, v5, 0x2

    .line 343
    .line 344
    if-ge v0, v14, :cond_11

    .line 345
    .line 346
    move v8, v14

    .line 347
    goto :goto_a

    .line 348
    :cond_11
    move v8, v0

    .line 349
    :goto_a
    div-int/lit8 v0, v6, 0x2

    .line 350
    .line 351
    if-ge v0, v14, :cond_12

    .line 352
    .line 353
    move v9, v14

    .line 354
    goto :goto_b

    .line 355
    :cond_12
    move v9, v0

    .line 356
    :goto_b
    const-string v11, "Downsample2x"

    .line 357
    .line 358
    const-string v12, "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"

    .line 359
    .line 360
    move-object v7, v3

    .line 361
    const/4 v3, 0x0

    .line 362
    const/high16 v10, 0x3f000000    # 0.5f

    .line 363
    .line 364
    move-object/from16 v0, p0

    .line 365
    .line 366
    move-object/from16 v1, p1

    .line 367
    .line 368
    move-object/from16 v2, p2

    .line 369
    .line 370
    invoke-virtual/range {v0 .. v12}, Law;->Г(Lcw;Lvv;ILwa0;IILwa0;IIFLjava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_7

    .line 374
    :goto_c
    int-to-float v4, v13

    .line 375
    iget-object v1, v0, Law;->τ:Lep0;

    .line 376
    .line 377
    iget v7, v1, Lep0;->δ:F

    .line 378
    .line 379
    iget v8, v1, Lep0;->ε:F

    .line 380
    .line 381
    move-object/from16 v1, p1

    .line 382
    .line 383
    move-object/from16 v2, p2

    .line 384
    .line 385
    move v6, v13

    .line 386
    move/from16 v5, v16

    .line 387
    .line 388
    move/from16 v9, v17

    .line 389
    .line 390
    move/from16 v10, v18

    .line 391
    .line 392
    invoke-virtual/range {v0 .. v10}, Law;->Е(Lcw;Lvv;Lwa0;FFIFFII)V

    .line 393
    .line 394
    .line 395
    return-void
.end method

.method public final И()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Law;->Α:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Law;->Δ:Lvv;

    .line 7
    .line 8
    iget-object v1, v0, Lvv;->α:Lwa0;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lvv;->λ:Law;

    .line 13
    .line 14
    invoke-static {v1}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Lua0;->β()Lwa0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Lvv;->α:Lwa0;

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Law;->Γ:Lyv;

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    iput v2, v1, Lyv;->Δ:I

    .line 32
    .line 33
    iget-object v3, p0, Law;->υ:La80;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    iput v4, v1, Lyv;->ι:F

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    iput-object v5, v1, Lyv;->κ:Lin;

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    iput v6, v1, Lyv;->λ:I

    .line 46
    .line 47
    invoke-interface {v3, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Law;->Д()V

    .line 51
    .line 52
    .line 53
    iget-object v3, v0, Lvv;->α:Lwa0;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    iget-object v7, v1, Lyv;->κ:Lin;

    .line 58
    .line 59
    invoke-virtual {v3, v7}, Lwa0;->ι(Lin;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget v3, v1, Lyv;->ι:F

    .line 63
    .line 64
    iget-object v7, v0, Lvv;->ε:Lt91;

    .line 65
    .line 66
    invoke-virtual {v7, v3}, Lt91;->θ(F)V

    .line 67
    .line 68
    .line 69
    iget v3, v1, Lyv;->λ:I

    .line 70
    .line 71
    if-ge v3, v6, :cond_3

    .line 72
    .line 73
    move v3, v6

    .line 74
    :cond_3
    iput v3, v0, Lvv;->δ:I

    .line 75
    .line 76
    iget v0, v1, Lyv;->Ε:I

    .line 77
    .line 78
    iget v3, v1, Lyv;->Ζ:I

    .line 79
    .line 80
    iget v7, v1, Lyv;->Η:F

    .line 81
    .line 82
    iget-object v8, p0, Law;->Η:Lx91;

    .line 83
    .line 84
    if-eq v0, v3, :cond_8

    .line 85
    .line 86
    const v0, 0x3a83126f    # 0.001f

    .line 87
    .line 88
    .line 89
    cmpg-float v0, v7, v0

    .line 90
    .line 91
    if-gtz v0, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iget-object v0, p0, Law;->Ε:Lvv;

    .line 95
    .line 96
    iget-object v9, v0, Lvv;->α:Lwa0;

    .line 97
    .line 98
    if-nez v9, :cond_5

    .line 99
    .line 100
    iget-object v9, v0, Lvv;->λ:Law;

    .line 101
    .line 102
    invoke-static {v9}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-interface {v9}, Lua0;->β()Lwa0;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    iput-object v9, v0, Lvv;->α:Lwa0;

    .line 115
    .line 116
    :cond_5
    iput v3, v1, Lyv;->Δ:I

    .line 117
    .line 118
    iget-object v3, p0, Law;->υ:La80;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iput v4, v1, Lyv;->ι:F

    .line 124
    .line 125
    iput-object v5, v1, Lyv;->κ:Lin;

    .line 126
    .line 127
    iput v6, v1, Lyv;->λ:I

    .line 128
    .line 129
    invoke-interface {v3, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Law;->Д()V

    .line 133
    .line 134
    .line 135
    iget-object v3, v0, Lvv;->α:Lwa0;

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    iget-object v4, v1, Lyv;->κ:Lin;

    .line 140
    .line 141
    invoke-virtual {v3, v4}, Lwa0;->ι(Lin;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    iget v3, v1, Lyv;->ι:F

    .line 145
    .line 146
    iget-object v4, v0, Lvv;->ε:Lt91;

    .line 147
    .line 148
    invoke-virtual {v4, v3}, Lt91;->θ(F)V

    .line 149
    .line 150
    .line 151
    iget v3, v1, Lyv;->λ:I

    .line 152
    .line 153
    if-ge v3, v6, :cond_7

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_7
    move v6, v3

    .line 157
    :goto_0
    iput v6, v0, Lvv;->δ:I

    .line 158
    .line 159
    iput v2, v1, Lyv;->Δ:I

    .line 160
    .line 161
    iget-object p0, p0, Law;->Θ:Lt91;

    .line 162
    .line 163
    invoke-virtual {p0, v7}, Lt91;->θ(F)V

    .line 164
    .line 165
    .line 166
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v8, p0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_8
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v8, p0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final ч()V
    .locals 2

    .line 1
    sget-object v0, Llp1;->α:Lm02;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls1;->θ(Lao;Lm02;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljp1;

    .line 8
    .line 9
    iget-object v1, p0, Law;->Γ:Lyv;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object v0, v1, Lyv;->μ:Ljp1;

    .line 18
    .line 19
    iget-boolean v0, p0, Law;->Α:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Law;->Δ:Lvv;

    .line 24
    .line 25
    iget-object v1, v0, Lvv;->α:Lwa0;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, v0, Lvv;->λ:Law;

    .line 30
    .line 31
    invoke-static {v1}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lua0;->β()Lwa0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, Lvv;->α:Lwa0;

    .line 44
    .line 45
    :cond_0
    new-instance v0, Lη;

    .line 46
    .line 47
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-direct {v0, v1, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v0}, Lln0;->а(Lq01;Lp70;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final ш()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Law;->Ж()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object p0, p0, Law;->Κ:Lx91;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
