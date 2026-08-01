.class public final Lcq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Li12;
.implements Lrx0;


# instance fields
.field public final synthetic ε:Lfq0;

.field public final synthetic ζ:Lkq0;


# direct methods
.method public constructor <init>(Lkq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcq0;->ζ:Lkq0;

    .line 5
    .line 6
    iget-object p1, p1, Lkq0;->λ:Lfq0;

    .line 7
    .line 8
    iput-object p1, p0, Lcq0;->ε:Lfq0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    iget-object p0, p0, Lfq0;->ε:Lnp0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Θ(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Θ(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ν(IILjava/util/Map;La80;La80;)Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lfq0;->Ν(IILjava/util/Map;La80;La80;)Lqx0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final Ξ(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->Ξ(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ψ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Ψ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    iget p0, p0, Lfq0;->ζ:F

    .line 4
    .line 5
    return p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    iget p0, p0, Lfq0;->η:F

    .line 4
    .line 5
    return p0
.end method

.method public final ν()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfq0;->ν()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final σ(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->σ(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final τ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->τ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final υ(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfq0;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final φ(Le80;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object p0, p0, Lcq0;->ζ:Lkq0;

    .line 2
    .line 3
    iget-object v0, p0, Lkq0;->ε:Lyp0;

    .line 4
    .line 5
    iget-object v1, p0, Lkq0;->κ:Lb21;

    .line 6
    .line 7
    sget-object v2, Ls62;->α:Ls62;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lyp0;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lh21;

    .line 22
    .line 23
    iget-object v4, v4, Lh21;->ε:Lk21;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Lk21;->ι(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, p0, Lkq0;->η:I

    .line 30
    .line 31
    if-ge v4, v5, :cond_0

    .line 32
    .line 33
    iget-object p0, v3, Lyp0;->Λ:Lbq0;

    .line 34
    .line 35
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 36
    .line 37
    invoke-virtual {p0}, Lox0;->ц()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    iget-object v3, p0, Lkq0;->ο:Lb21;

    .line 43
    .line 44
    iget-object v4, p0, Lkq0;->ν:Lb21;

    .line 45
    .line 46
    iget-object v5, p0, Lkq0;->π:Lk21;

    .line 47
    .line 48
    iget v6, v5, Lk21;->η:I

    .line 49
    .line 50
    iget v7, p0, Lkq0;->θ:I

    .line 51
    .line 52
    if-lt v6, v7, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string v6, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    .line 56
    .line 57
    invoke-static {v6}, Lam0;->α(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v1, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Lyp0;

    .line 65
    .line 66
    iget v7, v5, Lk21;->η:I

    .line 67
    .line 68
    iget v8, p0, Lkq0;->θ:I

    .line 69
    .line 70
    if-ne v7, v8, :cond_2

    .line 71
    .line 72
    invoke-virtual {v5, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-object v5, v5, Lk21;->ε:[Ljava/lang/Object;

    .line 77
    .line 78
    aget-object v7, v5, v8

    .line 79
    .line 80
    aput-object v2, v5, v8

    .line 81
    .line 82
    :goto_1
    iget v5, p0, Lkq0;->θ:I

    .line 83
    .line 84
    const/4 v7, 0x1

    .line 85
    add-int/2addr v5, v7

    .line 86
    iput v5, p0, Lkq0;->θ:I

    .line 87
    .line 88
    invoke-virtual {v4, v2}, Lb21;->β(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/4 v8, 0x0

    .line 93
    if-nez v5, :cond_8

    .line 94
    .line 95
    if-nez v6, :cond_8

    .line 96
    .line 97
    invoke-virtual {v0}, Lyp0;->Η()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_3

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    invoke-virtual {p0}, Lkq0;->γ()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v2}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_6

    .line 112
    .line 113
    invoke-virtual {v3, v2}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-nez v1, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0}, Lkq0;->κ()Lyp0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Lh21;

    .line 133
    .line 134
    iget-object v5, v5, Lh21;->ε:Lk21;

    .line 135
    .line 136
    invoke-virtual {v5, v1}, Lk21;->ι(Ljava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Lh21;

    .line 145
    .line 146
    iget-object v6, v6, Lh21;->ε:Lk21;

    .line 147
    .line 148
    iget v6, v6, Lk21;->η:I

    .line 149
    .line 150
    invoke-virtual {p0, v5, v6}, Lkq0;->ζ(II)V

    .line 151
    .line 152
    .line 153
    iget v5, p0, Lkq0;->σ:I

    .line 154
    .line 155
    add-int/2addr v5, v7

    .line 156
    iput v5, p0, Lkq0;->σ:I

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lh21;

    .line 164
    .line 165
    iget-object v1, v1, Lh21;->ε:Lk21;

    .line 166
    .line 167
    iget v1, v1, Lk21;->η:I

    .line 168
    .line 169
    new-instance v5, Lyp0;

    .line 170
    .line 171
    const/4 v6, 0x2

    .line 172
    invoke-direct {v5, v6}, Lyp0;-><init>(I)V

    .line 173
    .line 174
    .line 175
    iput-boolean v7, v0, Lyp0;->υ:Z

    .line 176
    .line 177
    invoke-virtual {v0, v1, v5}, Lyp0;->Α(ILyp0;)V

    .line 178
    .line 179
    .line 180
    iput-boolean v8, v0, Lyp0;->υ:Z

    .line 181
    .line 182
    iget v1, p0, Lkq0;->σ:I

    .line 183
    .line 184
    add-int/2addr v1, v7

    .line 185
    iput v1, p0, Lkq0;->σ:I

    .line 186
    .line 187
    move-object v1, v5

    .line 188
    :goto_2
    invoke-virtual {v4, v2, v1}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    check-cast v1, Lyp0;

    .line 192
    .line 193
    check-cast p1, Lan;

    .line 194
    .line 195
    invoke-virtual {p0, v1, p1}, Lkq0;->ι(Lyp0;Lan;)V

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_3
    invoke-virtual {v0}, Lyp0;->Η()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-nez p1, :cond_7

    .line 203
    .line 204
    new-instance p0, Liq0;

    .line 205
    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    new-instance p1, Ljq0;

    .line 211
    .line 212
    invoke-direct {p1, p0}, Ljq0;-><init>(Lkq0;)V

    .line 213
    .line 214
    .line 215
    move-object p0, p1

    .line 216
    :goto_4
    invoke-virtual {v3, v2, p0}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_8
    if-nez v5, :cond_a

    .line 221
    .line 222
    if-eqz v6, :cond_a

    .line 223
    .line 224
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    check-cast v5, Lh21;

    .line 229
    .line 230
    iget-object v5, v5, Lh21;->ε:Lk21;

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Lk21;->ι(Ljava/lang/Object;)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    check-cast v9, Lh21;

    .line 241
    .line 242
    iget-object v9, v9, Lh21;->ε:Lk21;

    .line 243
    .line 244
    iget v9, v9, Lk21;->η:I

    .line 245
    .line 246
    invoke-virtual {p0, v5, v9}, Lkq0;->ζ(II)V

    .line 247
    .line 248
    .line 249
    iget v5, p0, Lkq0;->σ:I

    .line 250
    .line 251
    add-int/2addr v5, v7

    .line 252
    iput v5, p0, Lkq0;->σ:I

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v2, v6}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lyp0;->Η()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_9

    .line 265
    .line 266
    new-instance v1, Liq0;

    .line 267
    .line 268
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_9
    new-instance v1, Ljq0;

    .line 273
    .line 274
    invoke-direct {v1, p0}, Ljq0;-><init>(Lkq0;)V

    .line 275
    .line 276
    .line 277
    :goto_5
    invoke-virtual {v3, v2, v1}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Lyp0;->Η()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_a

    .line 285
    .line 286
    invoke-virtual {p0}, Lkq0;->γ()V

    .line 287
    .line 288
    .line 289
    :cond_a
    invoke-virtual {v4, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Lyp0;

    .line 294
    .line 295
    if-eqz v0, :cond_b

    .line 296
    .line 297
    iget-object v1, p0, Lkq0;->ι:Lb21;

    .line 298
    .line 299
    invoke-virtual {v1, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Ldq0;

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_b
    const/4 v1, 0x0

    .line 307
    :goto_6
    if-eqz v1, :cond_c

    .line 308
    .line 309
    iget-boolean v1, v1, Ldq0;->δ:Z

    .line 310
    .line 311
    if-ne v1, v7, :cond_c

    .line 312
    .line 313
    check-cast p1, Lan;

    .line 314
    .line 315
    invoke-virtual {p0, v0, p1}, Lkq0;->ι(Lyp0;Lan;)V

    .line 316
    .line 317
    .line 318
    :cond_c
    :goto_7
    invoke-virtual {v4, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Lyp0;

    .line 323
    .line 324
    if-eqz p0, :cond_e

    .line 325
    .line 326
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 327
    .line 328
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 329
    .line 330
    invoke-virtual {p0}, Lox0;->ц()Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    move-object p1, p0

    .line 335
    check-cast p1, Lh21;

    .line 336
    .line 337
    iget-object v0, p1, Lh21;->ε:Lk21;

    .line 338
    .line 339
    iget v0, v0, Lk21;->η:I

    .line 340
    .line 341
    :goto_8
    if-ge v8, v0, :cond_d

    .line 342
    .line 343
    invoke-virtual {p1, v8}, Lh21;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, Lox0;

    .line 348
    .line 349
    iget-object v1, v1, Lox0;->κ:Lbq0;

    .line 350
    .line 351
    iput-boolean v7, v1, Lbq0;->β:Z

    .line 352
    .line 353
    add-int/lit8 v8, v8, 0x1

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_d
    return-object p0

    .line 357
    :cond_e
    sget-object p0, Ljz;->ε:Ljz;

    .line 358
    .line 359
    return-object p0
.end method

.method public final д(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->д(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final е(IILjava/util/Map;La80;)Lqx0;
    .locals 6

    .line 1
    iget-object v0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lfq0;->Ν(IILjava/util/Map;La80;La80;)Lqx0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final к(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->к(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final п(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->п(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final с(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lcq0;->ε:Lfq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfq0;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method
