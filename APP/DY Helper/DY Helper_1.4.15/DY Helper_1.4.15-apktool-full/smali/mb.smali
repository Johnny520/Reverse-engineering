.class public final synthetic Lmb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Z

.field public final synthetic η:Landroid/view/View;

.field public final synthetic θ:Z

.field public final synthetic ι:Z

.field public final synthetic κ:Z


# direct methods
.method public synthetic constructor <init>(ZZLandroid/view/View;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lmb;->ε:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lmb;->ζ:Z

    .line 7
    .line 8
    iput-object p3, p0, Lmb;->η:Landroid/view/View;

    .line 9
    .line 10
    iput-boolean p4, p0, Lmb;->θ:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lmb;->ι:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lmb;->κ:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-boolean v0, p0, Lmb;->ε:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lmb;->ζ:Z

    .line 4
    .line 5
    iget-object v2, p0, Lmb;->η:Landroid/view/View;

    .line 6
    .line 7
    iget-boolean v3, p0, Lmb;->θ:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lmb;->ι:Z

    .line 10
    .line 11
    iget-boolean p0, p0, Lmb;->κ:Z

    .line 12
    .line 13
    sget-object v5, Lsb;->α:Lsb;

    .line 14
    .line 15
    const v6, 0x7f0dba11

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const v8, 0x7f0dba1b

    .line 20
    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    if-eqz v0, :cond_8

    .line 24
    .line 25
    const v10, 0x7f0dba13    # 1.883873E38f

    .line 26
    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    const v1, 0x7f0dba1a

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    if-eqz v11, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-virtual {v2, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    new-instance v11, Lgb;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    invoke-virtual {v2, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    instance-of v14, v13, Ljava/lang/Float;

    .line 64
    .line 65
    if-eqz v14, :cond_2

    .line 66
    .line 67
    check-cast v13, Ljava/lang/Float;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v13, v9

    .line 71
    :goto_0
    if-eqz v13, :cond_3

    .line 72
    .line 73
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    :goto_1
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput v12, v11, Lgb;->α:I

    .line 86
    .line 87
    iput v13, v11, Lgb;->β:F

    .line 88
    .line 89
    invoke-virtual {v2, v1, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v2, v6, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    invoke-virtual {v2, v10, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/16 v3, 0x8

    .line 107
    .line 108
    if-eq v1, v3, :cond_6

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    cmpg-float v1, v1, v7

    .line 118
    .line 119
    if-nez v1, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    invoke-virtual {v2, v7}, Landroid/view/View;->setAlpha(F)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    invoke-virtual {v2, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    invoke-static {v2}, Lsb;->Τ(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    :cond_9
    :goto_3
    invoke-static {}, Lsb;->Η()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    sget-boolean v3, Lsb;->π:Z

    .line 146
    .line 147
    sget v6, Lsb;->φ:I

    .line 148
    .line 149
    const/4 v10, 0x0

    .line 150
    const/16 v11, 0x64

    .line 151
    .line 152
    invoke-static {v6, v10, v11}, Lj81;->μ(III)I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    int-to-float v6, v6

    .line 157
    const/high16 v10, 0x42c80000    # 100.0f

    .line 158
    .line 159
    div-float/2addr v6, v10

    .line 160
    const/high16 v10, 0x3f800000    # 1.0f

    .line 161
    .line 162
    if-eqz v1, :cond_b

    .line 163
    .line 164
    if-eqz v3, :cond_b

    .line 165
    .line 166
    if-nez v0, :cond_b

    .line 167
    .line 168
    if-nez v4, :cond_a

    .line 169
    .line 170
    if-nez p0, :cond_a

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    invoke-static {v6, v7, v10}, Lj81;->λ(FFF)F

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    goto :goto_5

    .line 182
    :cond_b
    :goto_4
    move-object p0, v9

    .line 183
    :goto_5
    const v1, 0x7f0dba12

    .line 184
    .line 185
    .line 186
    if-eqz p0, :cond_10

    .line 187
    .line 188
    if-eqz v4, :cond_e

    .line 189
    .line 190
    invoke-virtual {v2, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    instance-of v3, v0, Ljava/lang/Float;

    .line 195
    .line 196
    if-eqz v3, :cond_c

    .line 197
    .line 198
    move-object v9, v0

    .line 199
    check-cast v9, Ljava/lang/Float;

    .line 200
    .line 201
    :cond_c
    if-eqz v9, :cond_d

    .line 202
    .line 203
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    goto :goto_6

    .line 208
    :cond_d
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v2, v8, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    invoke-static {p0, v7, v10}, Lj81;->λ(FFF)F

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    invoke-static {v0, v7, v10}, Lj81;->λ(FFF)F

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    mul-float/2addr v0, p0

    .line 232
    goto :goto_7

    .line 233
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    :goto_7
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    cmpg-float p0, p0, v0

    .line 242
    .line 243
    if-nez p0, :cond_f

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_f
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 247
    .line 248
    .line 249
    :goto_8
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {v2, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_10
    invoke-virtual {v2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-static {p0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-eqz p0, :cond_13

    .line 266
    .line 267
    invoke-virtual {v2, v1, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    instance-of v1, p0, Ljava/lang/Float;

    .line 275
    .line 276
    if-eqz v1, :cond_11

    .line 277
    .line 278
    check-cast p0, Ljava/lang/Float;

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_11
    move-object p0, v9

    .line 282
    :goto_9
    invoke-virtual {v2, v8, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    if-nez v0, :cond_13

    .line 286
    .line 287
    if-eqz p0, :cond_12

    .line 288
    .line 289
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    :cond_12
    invoke-virtual {v2, v10}, Landroid/view/View;->setAlpha(F)V

    .line 294
    .line 295
    .line 296
    :cond_13
    :goto_a
    invoke-static {}, Lsb;->Η()Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    if-eqz p0, :cond_15

    .line 301
    .line 302
    invoke-static {v2}, Lsb;->Ι(Landroid/view/View;)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-eqz p0, :cond_14

    .line 307
    .line 308
    invoke-static {v2}, Lsb;->γ(Landroid/view/View;)V

    .line 309
    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_14
    invoke-virtual {v5, v2}, Lsb;->Λ(Landroid/view/View;)Z

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    if-eqz p0, :cond_15

    .line 317
    .line 318
    invoke-static {v2}, Lsb;->γ(Landroid/view/View;)V

    .line 319
    .line 320
    .line 321
    :cond_15
    :goto_b
    sget-object p0, Ls62;->α:Ls62;

    .line 322
    .line 323
    return-object p0
.end method
