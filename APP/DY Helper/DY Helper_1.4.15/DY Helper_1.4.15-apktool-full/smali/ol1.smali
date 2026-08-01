.class public final Lol1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final β:Ln2;

.field public final γ:Lj42;

.field public final δ:Lv11;

.field public ε:Z

.field public ζ:Z

.field public η:Z

.field public θ:Lr0;

.field public ι:J

.field public final κ:Lk1;

.field public final λ:La21;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lol1;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    new-instance p1, Ln2;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0}, Ln2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xc0

    .line 13
    .line 14
    new-array v1, v0, [J

    .line 15
    .line 16
    iput-object v1, p1, Ln2;->γ:Ljava/lang/Object;

    .line 17
    .line 18
    new-array v0, v0, [J

    .line 19
    .line 20
    iput-object v0, p1, Ln2;->δ:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p1, p0, Lol1;->β:Ln2;

    .line 23
    .line 24
    new-instance p1, Lj42;

    .line 25
    .line 26
    invoke-direct {p1}, Lj42;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lol1;->γ:Lj42;

    .line 30
    .line 31
    new-instance p1, Lv11;

    .line 32
    .line 33
    invoke-direct {p1}, Lv11;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lol1;->δ:Lv11;

    .line 37
    .line 38
    const-wide/16 v0, -0x1

    .line 39
    .line 40
    iput-wide v0, p0, Lol1;->ι:J

    .line 41
    .line 42
    new-instance p1, Lk1;

    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    invoke-direct {p1, v0, p0}, Lk1;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lol1;->κ:Lk1;

    .line 49
    .line 50
    new-instance p1, La21;

    .line 51
    .line 52
    invoke-direct {p1}, La21;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lol1;->λ:La21;

    .line 56
    .line 57
    return-void
.end method

.method public static δ(Lyp0;)J
    .locals 5

    .line 1
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 2
    .line 3
    iget-object v0, p0, Lk31;->δ:Lq31;

    .line 4
    .line 5
    iget-object p0, p0, Lk31;->γ:Lgm0;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    iget-object v3, p0, Lq31;->Ρ:Lw81;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v3}, Lw81;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, Lyh;->Χ([F)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    const-wide v0, 0x7fffffff7fffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_0
    iget-wide v3, p0, Lq31;->Ε:J

    .line 34
    .line 35
    invoke-static {v1, v2, v3, v4}, Lum0;->γ(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-wide v1
.end method

.method public static η(Lyp0;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyp0;->η:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 6
    .line 7
    iget-object v0, v0, Lk31;->δ:Lq31;

    .line 8
    .line 9
    iget-object v0, v0, Lq31;->Ρ:Lw81;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lw81;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->Χ([F)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lyp0;->η:Z

    .line 26
    .line 27
    iget-boolean v1, p0, Lyp0;->ι:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Lol1;->δ(Lyp0;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iput-wide v1, p0, Lyp0;->θ:J

    .line 36
    .line 37
    iput-boolean v0, p0, Lyp0;->ι:Z

    .line 38
    .line 39
    :cond_1
    iget-wide v1, p0, Lyp0;->θ:J

    .line 40
    .line 41
    const-wide v3, 0x7fffffff7fffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v3, v4}, Lum0;->α(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget-object v1, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 57
    .line 58
    iget p0, p0, Lk21;->η:I

    .line 59
    .line 60
    :goto_0
    if-ge v0, p0, :cond_2

    .line 61
    .line 62
    aget-object v2, v1, v0

    .line 63
    .line 64
    check-cast v2, Lyp0;

    .line 65
    .line 66
    invoke-static {v2}, Lol1;->η(Lyp0;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lol1;->θ:Lr0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lol1;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lol1;->θ:Lr0;

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-boolean v3, v0, Lol1;->ε:Z

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    iget-boolean v6, v0, Lol1;->ζ:Z

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v6, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    move v6, v4

    .line 33
    :goto_1
    iget-object v7, v0, Lol1;->β:Ln2;

    .line 34
    .line 35
    iget-object v8, v0, Lol1;->γ:Lj42;

    .line 36
    .line 37
    if-eqz v3, :cond_7

    .line 38
    .line 39
    iput-boolean v5, v0, Lol1;->ε:Z

    .line 40
    .line 41
    iget-object v3, v0, Lol1;->δ:Lv11;

    .line 42
    .line 43
    iget-object v9, v3, Lv11;->α:[Ljava/lang/Object;

    .line 44
    .line 45
    iget v3, v3, Lv11;->β:I

    .line 46
    .line 47
    move v10, v5

    .line 48
    :goto_2
    if-ge v10, v3, :cond_3

    .line 49
    .line 50
    aget-object v11, v9, v10

    .line 51
    .line 52
    check-cast v11, Lp70;

    .line 53
    .line 54
    invoke-interface {v11}, Lp70;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v10, v10, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-object v3, v7, Ln2;->γ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, [J

    .line 63
    .line 64
    iget v9, v7, Ln2;->β:I

    .line 65
    .line 66
    move v10, v5

    .line 67
    :goto_3
    array-length v11, v3

    .line 68
    add-int/lit8 v11, v11, -0x2

    .line 69
    .line 70
    if-ge v10, v11, :cond_6

    .line 71
    .line 72
    if-ge v10, v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v11, v10, 0x2

    .line 75
    .line 76
    aget-wide v11, v3, v11

    .line 77
    .line 78
    const/16 v13, 0x3c

    .line 79
    .line 80
    shr-long v13, v11, v13

    .line 81
    .line 82
    long-to-int v13, v13

    .line 83
    and-int/2addr v13, v4

    .line 84
    if-eqz v13, :cond_5

    .line 85
    .line 86
    aget-wide v13, v3, v10

    .line 87
    .line 88
    add-int/lit8 v13, v10, 0x1

    .line 89
    .line 90
    aget-wide v13, v3, v13

    .line 91
    .line 92
    long-to-int v11, v11

    .line 93
    const v12, 0x1ffffff

    .line 94
    .line 95
    .line 96
    and-int/2addr v11, v12

    .line 97
    iget-object v12, v8, Lj42;->α:Ln11;

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Lsm0;->β(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    if-nez v11, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    invoke-static {}, Lγ;->β()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    :goto_4
    add-int/lit8 v10, v10, 0x3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    iget-object v3, v7, Ln2;->γ:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, [J

    .line 116
    .line 117
    iget v4, v7, Ln2;->β:I

    .line 118
    .line 119
    move v9, v5

    .line 120
    :goto_5
    array-length v10, v3

    .line 121
    add-int/lit8 v10, v10, -0x2

    .line 122
    .line 123
    if-ge v9, v10, :cond_7

    .line 124
    .line 125
    if-ge v9, v4, :cond_7

    .line 126
    .line 127
    add-int/lit8 v10, v9, 0x2

    .line 128
    .line 129
    aget-wide v11, v3, v10

    .line 130
    .line 131
    const-wide v13, -0x1000000000000001L    # -3.1050361846014175E231

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    and-long/2addr v11, v13

    .line 137
    aput-wide v11, v3, v10

    .line 138
    .line 139
    add-int/lit8 v9, v9, 0x3

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    iget-boolean v3, v0, Lol1;->ζ:Z

    .line 143
    .line 144
    const/16 v13, 0x8

    .line 145
    .line 146
    if-eqz v3, :cond_c

    .line 147
    .line 148
    iput-boolean v5, v0, Lol1;->ζ:Z

    .line 149
    .line 150
    iget-object v3, v8, Lj42;->α:Ln11;

    .line 151
    .line 152
    const/16 v16, 0x7

    .line 153
    .line 154
    iget-object v4, v3, Lsm0;->γ:[Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v3, v3, Lsm0;->α:[J

    .line 157
    .line 158
    const-wide/16 v17, 0x80

    .line 159
    .line 160
    array-length v9, v3

    .line 161
    add-int/lit8 v9, v9, -0x2

    .line 162
    .line 163
    if-ltz v9, :cond_d

    .line 164
    .line 165
    move v10, v5

    .line 166
    const-wide/16 v19, 0xff

    .line 167
    .line 168
    :goto_6
    aget-wide v11, v3, v10

    .line 169
    .line 170
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    not-long v14, v11

    .line 176
    shl-long v14, v14, v16

    .line 177
    .line 178
    and-long/2addr v14, v11

    .line 179
    and-long v14, v14, v21

    .line 180
    .line 181
    cmp-long v14, v14, v21

    .line 182
    .line 183
    if-eqz v14, :cond_b

    .line 184
    .line 185
    sub-int v14, v10, v9

    .line 186
    .line 187
    not-int v14, v14

    .line 188
    ushr-int/lit8 v14, v14, 0x1f

    .line 189
    .line 190
    rsub-int/lit8 v14, v14, 0x8

    .line 191
    .line 192
    move v15, v5

    .line 193
    :goto_7
    if-ge v15, v14, :cond_a

    .line 194
    .line 195
    and-long v23, v11, v19

    .line 196
    .line 197
    cmp-long v23, v23, v17

    .line 198
    .line 199
    if-gez v23, :cond_9

    .line 200
    .line 201
    shl-int/lit8 v23, v10, 0x3

    .line 202
    .line 203
    add-int v23, v23, v15

    .line 204
    .line 205
    aget-object v23, v4, v23

    .line 206
    .line 207
    if-nez v23, :cond_8

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_8
    invoke-static {}, Lγ;->β()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_9
    :goto_8
    shr-long/2addr v11, v13

    .line 215
    add-int/lit8 v15, v15, 0x1

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_a
    if-ne v14, v13, :cond_e

    .line 219
    .line 220
    :cond_b
    if-eq v10, v9, :cond_e

    .line 221
    .line 222
    add-int/lit8 v10, v10, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_c
    const/16 v16, 0x7

    .line 226
    .line 227
    const-wide/16 v17, 0x80

    .line 228
    .line 229
    :cond_d
    const-wide/16 v19, 0xff

    .line 230
    .line 231
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    :cond_e
    if-eqz v6, :cond_f

    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    :cond_f
    iget-boolean v3, v0, Lol1;->η:Z

    .line 242
    .line 243
    if-eqz v3, :cond_12

    .line 244
    .line 245
    iput-boolean v5, v0, Lol1;->η:Z

    .line 246
    .line 247
    iget-object v3, v7, Ln2;->γ:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, [J

    .line 250
    .line 251
    iget v4, v7, Ln2;->β:I

    .line 252
    .line 253
    iget-object v6, v7, Ln2;->δ:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v6, [J

    .line 256
    .line 257
    move v9, v5

    .line 258
    move v10, v9

    .line 259
    :goto_9
    array-length v11, v3

    .line 260
    add-int/lit8 v11, v11, -0x2

    .line 261
    .line 262
    if-ge v9, v11, :cond_11

    .line 263
    .line 264
    array-length v11, v6

    .line 265
    add-int/lit8 v11, v11, -0x2

    .line 266
    .line 267
    if-ge v10, v11, :cond_11

    .line 268
    .line 269
    if-ge v9, v4, :cond_11

    .line 270
    .line 271
    add-int/lit8 v11, v9, 0x2

    .line 272
    .line 273
    aget-wide v14, v3, v11

    .line 274
    .line 275
    sget-wide v23, Lnl1;->γ:J

    .line 276
    .line 277
    cmp-long v12, v14, v23

    .line 278
    .line 279
    if-eqz v12, :cond_10

    .line 280
    .line 281
    aget-wide v14, v3, v9

    .line 282
    .line 283
    aput-wide v14, v6, v10

    .line 284
    .line 285
    add-int/lit8 v12, v10, 0x1

    .line 286
    .line 287
    add-int/lit8 v14, v9, 0x1

    .line 288
    .line 289
    aget-wide v14, v3, v14

    .line 290
    .line 291
    aput-wide v14, v6, v12

    .line 292
    .line 293
    add-int/lit8 v12, v10, 0x2

    .line 294
    .line 295
    aget-wide v14, v3, v11

    .line 296
    .line 297
    aput-wide v14, v6, v12

    .line 298
    .line 299
    add-int/lit8 v10, v10, 0x3

    .line 300
    .line 301
    :cond_10
    add-int/lit8 v9, v9, 0x3

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_11
    iput v10, v7, Ln2;->β:I

    .line 305
    .line 306
    iput-object v6, v7, Ln2;->γ:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v3, v7, Ln2;->δ:Ljava/lang/Object;

    .line 309
    .line 310
    :cond_12
    iget-wide v3, v8, Lj42;->β:J

    .line 311
    .line 312
    cmp-long v1, v3, v1

    .line 313
    .line 314
    if-lez v1, :cond_13

    .line 315
    .line 316
    goto :goto_d

    .line 317
    :cond_13
    iget-object v1, v8, Lj42;->α:Ln11;

    .line 318
    .line 319
    iget-object v2, v1, Lsm0;->γ:[Ljava/lang/Object;

    .line 320
    .line 321
    iget-object v1, v1, Lsm0;->α:[J

    .line 322
    .line 323
    array-length v3, v1

    .line 324
    add-int/lit8 v3, v3, -0x2

    .line 325
    .line 326
    if-ltz v3, :cond_18

    .line 327
    .line 328
    move v4, v5

    .line 329
    :goto_a
    aget-wide v6, v1, v4

    .line 330
    .line 331
    not-long v9, v6

    .line 332
    shl-long v9, v9, v16

    .line 333
    .line 334
    and-long/2addr v9, v6

    .line 335
    and-long v9, v9, v21

    .line 336
    .line 337
    cmp-long v9, v9, v21

    .line 338
    .line 339
    if-eqz v9, :cond_17

    .line 340
    .line 341
    sub-int v9, v4, v3

    .line 342
    .line 343
    not-int v9, v9

    .line 344
    ushr-int/lit8 v9, v9, 0x1f

    .line 345
    .line 346
    rsub-int/lit8 v9, v9, 0x8

    .line 347
    .line 348
    move v10, v5

    .line 349
    :goto_b
    if-ge v10, v9, :cond_16

    .line 350
    .line 351
    and-long v11, v6, v19

    .line 352
    .line 353
    cmp-long v11, v11, v17

    .line 354
    .line 355
    if-gez v11, :cond_15

    .line 356
    .line 357
    shl-int/lit8 v11, v4, 0x3

    .line 358
    .line 359
    add-int/2addr v11, v10

    .line 360
    aget-object v11, v2, v11

    .line 361
    .line 362
    if-nez v11, :cond_14

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_14
    invoke-static {}, Lγ;->β()V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :cond_15
    :goto_c
    shr-long/2addr v6, v13

    .line 370
    add-int/lit8 v10, v10, 0x1

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_16
    if-ne v9, v13, :cond_18

    .line 374
    .line 375
    :cond_17
    if-eq v4, v3, :cond_18

    .line 376
    .line 377
    add-int/lit8 v4, v4, 0x1

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_18
    const-wide/16 v1, -0x1

    .line 381
    .line 382
    iput-wide v1, v8, Lj42;->β:J

    .line 383
    .line 384
    :goto_d
    iget-wide v1, v8, Lj42;->β:J

    .line 385
    .line 386
    const-wide/16 v3, 0x0

    .line 387
    .line 388
    cmp-long v1, v1, v3

    .line 389
    .line 390
    if-lez v1, :cond_19

    .line 391
    .line 392
    invoke-virtual {v0}, Lol1;->θ()V

    .line 393
    .line 394
    .line 395
    :cond_19
    return-void
.end method

.method public final β(Lyp0;)J
    .locals 8

    .line 1
    iget p1, p1, Lyp0;->ζ:I

    .line 2
    .line 3
    const v0, 0x1ffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    iget-object p0, p0, Lol1;->β:Ln2;

    .line 8
    .line 9
    iget-object v1, p0, Ln2;->γ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    iget p0, p0, Ln2;->β:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    array-length v3, v1

    .line 17
    add-int/lit8 v3, v3, -0x2

    .line 18
    .line 19
    const-wide v4, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ge v2, v3, :cond_1

    .line 25
    .line 26
    if-ge v2, p0, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v2, 0x2

    .line 29
    .line 30
    aget-wide v6, v1, v3

    .line 31
    .line 32
    long-to-int v3, v6

    .line 33
    and-int/2addr v3, v0

    .line 34
    if-ne v3, p1, :cond_0

    .line 35
    .line 36
    aget-wide p0, v1, v2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-wide p0, v4

    .line 43
    :goto_1
    cmp-long v0, p0, v4

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-wide p0, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    return-wide p0

    .line 53
    :cond_2
    const/16 v0, 0x20

    .line 54
    .line 55
    shr-long v1, p0, v0

    .line 56
    .line 57
    long-to-int v1, v1

    .line 58
    long-to-int p0, p0

    .line 59
    int-to-long v1, v1

    .line 60
    shl-long v0, v1, v0

    .line 61
    .line 62
    int-to-long p0, p0

    .line 63
    const-wide v2, 0xffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr p0, v2

    .line 69
    or-long/2addr p0, v0

    .line 70
    return-wide p0
.end method

.method public final γ(Lyp0;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, v1, Lyp0;->η:Z

    .line 7
    .line 8
    iget-object v3, v1, Lyp0;->Κ:Lk31;

    .line 9
    .line 10
    iget-object v4, v3, Lk31;->δ:Lq31;

    .line 11
    .line 12
    iget-object v5, v1, Lyp0;->Λ:Lbq0;

    .line 13
    .line 14
    iget-object v5, v5, Lbq0;->π:Lox0;

    .line 15
    .line 16
    invoke-virtual {v5}, Lox0;->н()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-virtual {v5}, Lox0;->м()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    int-to-float v6, v6

    .line 25
    int-to-float v5, v5

    .line 26
    iget-object v7, v0, Lol1;->λ:La21;

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    iput v8, v7, La21;->α:F

    .line 30
    .line 31
    iput v8, v7, La21;->β:F

    .line 32
    .line 33
    iput v6, v7, La21;->γ:F

    .line 34
    .line 35
    iput v5, v7, La21;->δ:F

    .line 36
    .line 37
    :goto_0
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v8, 0x20

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v9, v4, Lq31;->σ:Lyp0;

    .line 47
    .line 48
    iget-object v10, v9, Lyp0;->Κ:Lk31;

    .line 49
    .line 50
    iget-object v10, v10, Lk31;->δ:Lq31;

    .line 51
    .line 52
    if-ne v4, v10, :cond_0

    .line 53
    .line 54
    iget-boolean v10, v9, Lyp0;->η:Z

    .line 55
    .line 56
    if-nez v10, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v9}, Lol1;->β(Lyp0;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    const-wide v11, 0x7fffffff7fffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v9, v10, v11, v12}, Lum0;->α(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-nez v11, :cond_0

    .line 72
    .line 73
    shr-long v11, v9, v8

    .line 74
    .line 75
    long-to-int v4, v11

    .line 76
    int-to-float v4, v4

    .line 77
    and-long/2addr v9, v5

    .line 78
    long-to-int v9, v9

    .line 79
    int-to-float v9, v9

    .line 80
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    int-to-long v10, v4

    .line 85
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    int-to-long v12, v4

    .line 90
    shl-long v9, v10, v8

    .line 91
    .line 92
    and-long v11, v12, v5

    .line 93
    .line 94
    or-long/2addr v9, v11

    .line 95
    invoke-virtual {v7, v9, v10}, La21;->γ(J)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    iget-object v9, v4, Lq31;->Ρ:Lw81;

    .line 100
    .line 101
    if-eqz v9, :cond_1

    .line 102
    .line 103
    invoke-interface {v9}, Lw81;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-static {v9}, Lyh;->Χ([F)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-nez v10, :cond_1

    .line 112
    .line 113
    invoke-static {v9, v7}, Lbd;->Ζ([FLa21;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    iget-wide v9, v4, Lq31;->Ε:J

    .line 117
    .line 118
    shr-long v11, v9, v8

    .line 119
    .line 120
    long-to-int v11, v11

    .line 121
    int-to-float v11, v11

    .line 122
    and-long/2addr v9, v5

    .line 123
    long-to-int v9, v9

    .line 124
    int-to-float v9, v9

    .line 125
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    int-to-long v10, v10

    .line 130
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    int-to-long v12, v9

    .line 135
    shl-long v8, v10, v8

    .line 136
    .line 137
    and-long/2addr v5, v12

    .line 138
    or-long/2addr v5, v8

    .line 139
    invoke-virtual {v7, v5, v6}, La21;->γ(J)V

    .line 140
    .line 141
    .line 142
    iget-object v4, v4, Lq31;->υ:Lq31;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_2
    :goto_1
    iget v4, v7, La21;->α:F

    .line 146
    .line 147
    float-to-int v11, v4

    .line 148
    iget v4, v7, La21;->β:F

    .line 149
    .line 150
    float-to-int v12, v4

    .line 151
    iget v4, v7, La21;->γ:F

    .line 152
    .line 153
    float-to-int v13, v4

    .line 154
    iget v4, v7, La21;->δ:F

    .line 155
    .line 156
    float-to-int v14, v4

    .line 157
    iget v10, v1, Lyp0;->ζ:I

    .line 158
    .line 159
    iget-boolean v4, v1, Lyp0;->λ:Z

    .line 160
    .line 161
    iput-boolean v2, v1, Lyp0;->λ:Z

    .line 162
    .line 163
    iget-object v9, v0, Lol1;->β:Ln2;

    .line 164
    .line 165
    if-eqz v4, :cond_4

    .line 166
    .line 167
    const v4, 0x1ffffff

    .line 168
    .line 169
    .line 170
    and-int v15, v10, v4

    .line 171
    .line 172
    move/from16 v16, v4

    .line 173
    .line 174
    iget-object v4, v9, Ln2;->γ:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, [J

    .line 177
    .line 178
    move-wide/from16 v17, v5

    .line 179
    .line 180
    iget v5, v9, Ln2;->β:I

    .line 181
    .line 182
    move/from16 v19, v8

    .line 183
    .line 184
    const/4 v6, 0x0

    .line 185
    :goto_2
    array-length v8, v4

    .line 186
    add-int/lit8 v8, v8, -0x2

    .line 187
    .line 188
    if-ge v6, v8, :cond_4

    .line 189
    .line 190
    if-ge v6, v5, :cond_4

    .line 191
    .line 192
    add-int/lit8 v8, v6, 0x2

    .line 193
    .line 194
    move/from16 v20, v8

    .line 195
    .line 196
    aget-wide v7, v4, v20

    .line 197
    .line 198
    move/from16 v21, v2

    .line 199
    .line 200
    long-to-int v2, v7

    .line 201
    and-int v2, v2, v16

    .line 202
    .line 203
    if-ne v2, v15, :cond_3

    .line 204
    .line 205
    int-to-long v2, v11

    .line 206
    shl-long v2, v2, v19

    .line 207
    .line 208
    int-to-long v9, v12

    .line 209
    and-long v9, v9, v17

    .line 210
    .line 211
    or-long/2addr v2, v9

    .line 212
    aput-wide v2, v4, v6

    .line 213
    .line 214
    add-int/lit8 v6, v6, 0x1

    .line 215
    .line 216
    int-to-long v2, v13

    .line 217
    shl-long v2, v2, v19

    .line 218
    .line 219
    int-to-long v9, v14

    .line 220
    and-long v9, v9, v17

    .line 221
    .line 222
    or-long/2addr v2, v9

    .line 223
    aput-wide v2, v4, v6

    .line 224
    .line 225
    const/16 v2, 0x3f

    .line 226
    .line 227
    shr-long v2, v7, v2

    .line 228
    .line 229
    const-wide/16 v5, 0x1

    .line 230
    .line 231
    and-long/2addr v2, v5

    .line 232
    const/16 v5, 0x3c

    .line 233
    .line 234
    shl-long/2addr v2, v5

    .line 235
    or-long/2addr v2, v7

    .line 236
    aput-wide v2, v4, v20

    .line 237
    .line 238
    :goto_3
    const/4 v2, 0x0

    .line 239
    goto :goto_6

    .line 240
    :cond_3
    add-int/lit8 v6, v6, 0x3

    .line 241
    .line 242
    move/from16 v2, v21

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_4
    move/from16 v21, v2

    .line 246
    .line 247
    invoke-virtual {v1}, Lyp0;->σ()Lyp0;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    if-eqz v2, :cond_5

    .line 252
    .line 253
    iget v2, v2, Lyp0;->ζ:I

    .line 254
    .line 255
    :goto_4
    move v15, v2

    .line 256
    goto :goto_5

    .line 257
    :cond_5
    const/4 v2, -0x1

    .line 258
    goto :goto_4

    .line 259
    :goto_5
    const/16 v2, 0x400

    .line 260
    .line 261
    invoke-virtual {v3, v2}, Lk31;->δ(I)Z

    .line 262
    .line 263
    .line 264
    move-result v16

    .line 265
    const/16 v2, 0x10

    .line 266
    .line 267
    invoke-virtual {v3, v2}, Lk31;->δ(I)Z

    .line 268
    .line 269
    .line 270
    move-result v17

    .line 271
    iget-object v2, v0, Lol1;->γ:Lj42;

    .line 272
    .line 273
    iget-object v2, v2, Lj42;->α:Ln11;

    .line 274
    .line 275
    invoke-virtual {v2, v10}, Lsm0;->α(I)Z

    .line 276
    .line 277
    .line 278
    move-result v18

    .line 279
    const/16 v19, 0x200

    .line 280
    .line 281
    invoke-static/range {v9 .. v19}, Ln2;->γ(Ln2;IIIIIIZZZI)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :goto_6
    iput-boolean v2, v1, Lyp0;->κ:Z

    .line 286
    .line 287
    move/from16 v3, v21

    .line 288
    .line 289
    iput-boolean v3, v0, Lol1;->ε:Z

    .line 290
    .line 291
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    iget-object v3, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 296
    .line 297
    iget v1, v1, Lk21;->η:I

    .line 298
    .line 299
    move v7, v2

    .line 300
    :goto_7
    if-ge v7, v1, :cond_7

    .line 301
    .line 302
    aget-object v2, v3, v7

    .line 303
    .line 304
    check-cast v2, Lyp0;

    .line 305
    .line 306
    invoke-virtual {v2}, Lyp0;->Θ()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-eqz v4, :cond_6

    .line 311
    .line 312
    invoke-virtual {v0, v2}, Lol1;->γ(Lyp0;)V

    .line 313
    .line 314
    .line 315
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_7
    return-void
.end method

.method public final ε(Lyp0;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lyp0;->Θ()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lyp0;->Κ:Lk31;

    .line 10
    .line 11
    if-eqz v2, :cond_12

    .line 12
    .line 13
    iget-boolean v2, v1, Lyp0;->κ:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_a

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Lyp0;->σ()Lyp0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide v4, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-boolean v7, v2, Lyp0;->η:Z

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    iget-boolean v7, v2, Lyp0;->ι:Z

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    iput-boolean v6, v2, Lyp0;->ι:Z

    .line 40
    .line 41
    invoke-static {v2}, Lol1;->δ(Lyp0;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    iput-wide v7, v2, Lyp0;->θ:J

    .line 46
    .line 47
    :cond_1
    iget-wide v7, v2, Lyp0;->θ:J

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-nez v2, :cond_3

    .line 51
    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-wide v7, v4

    .line 56
    :goto_0
    iget-object v9, v3, Lk31;->δ:Lq31;

    .line 57
    .line 58
    invoke-static {v7, v8, v4, v5}, Lum0;->α(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_11

    .line 63
    .line 64
    iget-object v4, v9, Lq31;->Ρ:Lw81;

    .line 65
    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v4}, Lw81;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4}, Lyh;->Χ([F)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    goto/16 :goto_8

    .line 79
    .line 80
    :cond_4
    iget-boolean v4, v1, Lyp0;->η:Z

    .line 81
    .line 82
    if-nez v4, :cond_10

    .line 83
    .line 84
    iget-wide v9, v9, Lq31;->Ε:J

    .line 85
    .line 86
    invoke-static {v7, v8, v9, v10}, Lum0;->γ(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    iget-object v4, v1, Lyp0;->Λ:Lbq0;

    .line 91
    .line 92
    iget-object v4, v4, Lbq0;->π:Lox0;

    .line 93
    .line 94
    invoke-virtual {v4}, Lox0;->н()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-virtual {v4}, Lox0;->м()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iget v11, v1, Lyp0;->ζ:I

    .line 103
    .line 104
    iget-boolean v10, v1, Lyp0;->λ:Z

    .line 105
    .line 106
    iget-object v12, v0, Lol1;->β:Ln2;

    .line 107
    .line 108
    const v13, 0x1ffffff

    .line 109
    .line 110
    .line 111
    const-wide v14, 0xffffffffL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    const/16 v16, 0x20

    .line 117
    .line 118
    if-eqz v10, :cond_d

    .line 119
    .line 120
    const-wide/16 v17, 0x1

    .line 121
    .line 122
    const/16 v19, 0x3f

    .line 123
    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    iget v2, v2, Lyp0;->ζ:I

    .line 127
    .line 128
    move/from16 v20, v4

    .line 129
    .line 130
    const/16 v21, 0x19

    .line 131
    .line 132
    shr-long v3, v7, v16

    .line 133
    .line 134
    long-to-int v3, v3

    .line 135
    and-long/2addr v7, v14

    .line 136
    long-to-int v4, v7

    .line 137
    and-int v7, v11, v13

    .line 138
    .line 139
    iget-object v8, v12, Ln2;->γ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v8, [J

    .line 142
    .line 143
    iget v11, v12, Ln2;->β:I

    .line 144
    .line 145
    move v10, v6

    .line 146
    move/from16 v23, v13

    .line 147
    .line 148
    const/16 v22, 0x3c

    .line 149
    .line 150
    :goto_1
    array-length v13, v8

    .line 151
    add-int/lit8 v13, v13, -0x2

    .line 152
    .line 153
    if-ge v10, v13, :cond_8

    .line 154
    .line 155
    if-ge v10, v11, :cond_8

    .line 156
    .line 157
    add-int/lit8 v13, v10, 0x2

    .line 158
    .line 159
    move-wide/from16 v24, v14

    .line 160
    .line 161
    aget-wide v14, v8, v13

    .line 162
    .line 163
    long-to-int v13, v14

    .line 164
    and-int v13, v13, v23

    .line 165
    .line 166
    if-ne v13, v2, :cond_7

    .line 167
    .line 168
    aget-wide v13, v8, v10

    .line 169
    .line 170
    shr-long v5, v13, v16

    .line 171
    .line 172
    long-to-int v5, v5

    .line 173
    long-to-int v6, v13

    .line 174
    add-int/2addr v5, v3

    .line 175
    add-int/2addr v6, v4

    .line 176
    add-int v13, v5, v9

    .line 177
    .line 178
    add-int v14, v6, v20

    .line 179
    .line 180
    add-int/lit8 v10, v10, 0x3

    .line 181
    .line 182
    :goto_2
    array-length v15, v8

    .line 183
    add-int/lit8 v15, v15, -0x2

    .line 184
    .line 185
    if-ge v10, v15, :cond_7

    .line 186
    .line 187
    if-ge v10, v11, :cond_7

    .line 188
    .line 189
    add-int/lit8 v15, v10, 0x2

    .line 190
    .line 191
    move/from16 v26, v2

    .line 192
    .line 193
    move/from16 v27, v3

    .line 194
    .line 195
    aget-wide v2, v8, v15

    .line 196
    .line 197
    move/from16 v28, v4

    .line 198
    .line 199
    long-to-int v4, v2

    .line 200
    and-int v4, v4, v23

    .line 201
    .line 202
    if-ne v4, v7, :cond_6

    .line 203
    .line 204
    move-wide/from16 v29, v2

    .line 205
    .line 206
    aget-wide v2, v8, v10

    .line 207
    .line 208
    move-object v4, v8

    .line 209
    shr-long v7, v2, v16

    .line 210
    .line 211
    long-to-int v7, v7

    .line 212
    long-to-int v2, v2

    .line 213
    sub-int v3, v5, v7

    .line 214
    .line 215
    sub-int v2, v6, v2

    .line 216
    .line 217
    int-to-long v7, v5

    .line 218
    shl-long v7, v7, v16

    .line 219
    .line 220
    int-to-long v5, v6

    .line 221
    and-long v5, v5, v24

    .line 222
    .line 223
    or-long/2addr v5, v7

    .line 224
    aput-wide v5, v4, v10

    .line 225
    .line 226
    add-int/lit8 v5, v10, 0x1

    .line 227
    .line 228
    int-to-long v6, v13

    .line 229
    shl-long v6, v6, v16

    .line 230
    .line 231
    int-to-long v8, v14

    .line 232
    and-long v8, v8, v24

    .line 233
    .line 234
    or-long/2addr v6, v8

    .line 235
    aput-wide v6, v4, v5

    .line 236
    .line 237
    shr-long v5, v29, v19

    .line 238
    .line 239
    and-long v5, v5, v17

    .line 240
    .line 241
    shl-long v5, v5, v22

    .line 242
    .line 243
    or-long v5, v29, v5

    .line 244
    .line 245
    aput-wide v5, v4, v15

    .line 246
    .line 247
    if-nez v3, :cond_5

    .line 248
    .line 249
    if-eqz v2, :cond_8

    .line 250
    .line 251
    :cond_5
    add-int/lit8 v10, v10, 0x3

    .line 252
    .line 253
    sget-wide v4, Lnl1;->β:J

    .line 254
    .line 255
    and-long v4, v29, v4

    .line 256
    .line 257
    and-int v6, v10, v23

    .line 258
    .line 259
    int-to-long v6, v6

    .line 260
    shl-long v6, v6, v21

    .line 261
    .line 262
    or-long/2addr v4, v6

    .line 263
    invoke-virtual {v12, v3, v2, v4, v5}, Ln2;->ε(IIJ)V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_6
    move-object v4, v8

    .line 268
    add-int/lit8 v10, v10, 0x3

    .line 269
    .line 270
    move/from16 v2, v26

    .line 271
    .line 272
    move/from16 v3, v27

    .line 273
    .line 274
    move/from16 v4, v28

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_7
    move/from16 v26, v2

    .line 278
    .line 279
    move/from16 v27, v3

    .line 280
    .line 281
    move/from16 v28, v4

    .line 282
    .line 283
    move-object v4, v8

    .line 284
    add-int/lit8 v10, v10, 0x3

    .line 285
    .line 286
    move-object v8, v4

    .line 287
    move-wide/from16 v14, v24

    .line 288
    .line 289
    move/from16 v2, v26

    .line 290
    .line 291
    move/from16 v3, v27

    .line 292
    .line 293
    move/from16 v4, v28

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :cond_8
    :goto_3
    const/4 v2, 0x0

    .line 299
    goto/16 :goto_9

    .line 300
    .line 301
    :cond_9
    move/from16 v20, v4

    .line 302
    .line 303
    move/from16 v23, v13

    .line 304
    .line 305
    move-wide/from16 v24, v14

    .line 306
    .line 307
    const/16 v21, 0x19

    .line 308
    .line 309
    const/16 v22, 0x3c

    .line 310
    .line 311
    shr-long v2, v7, v16

    .line 312
    .line 313
    long-to-int v2, v2

    .line 314
    and-long v3, v7, v24

    .line 315
    .line 316
    long-to-int v3, v3

    .line 317
    add-int/2addr v9, v2

    .line 318
    add-int v4, v3, v20

    .line 319
    .line 320
    and-int v5, v11, v23

    .line 321
    .line 322
    iget-object v6, v12, Ln2;->γ:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v6, [J

    .line 325
    .line 326
    iget v7, v12, Ln2;->β:I

    .line 327
    .line 328
    const/4 v8, 0x0

    .line 329
    :goto_4
    array-length v10, v6

    .line 330
    add-int/lit8 v10, v10, -0x2

    .line 331
    .line 332
    if-ge v8, v10, :cond_8

    .line 333
    .line 334
    if-ge v8, v7, :cond_8

    .line 335
    .line 336
    add-int/lit8 v10, v8, 0x2

    .line 337
    .line 338
    aget-wide v13, v6, v10

    .line 339
    .line 340
    long-to-int v11, v13

    .line 341
    and-int v11, v11, v23

    .line 342
    .line 343
    if-ne v11, v5, :cond_c

    .line 344
    .line 345
    move-object v11, v6

    .line 346
    aget-wide v5, v11, v8

    .line 347
    .line 348
    move v15, v8

    .line 349
    int-to-long v7, v2

    .line 350
    shl-long v7, v7, v16

    .line 351
    .line 352
    move-wide/from16 v26, v7

    .line 353
    .line 354
    int-to-long v7, v3

    .line 355
    and-long v7, v7, v24

    .line 356
    .line 357
    or-long v7, v26, v7

    .line 358
    .line 359
    aput-wide v7, v11, v15

    .line 360
    .line 361
    add-int/lit8 v8, v15, 0x1

    .line 362
    .line 363
    move/from16 v26, v2

    .line 364
    .line 365
    move/from16 v27, v3

    .line 366
    .line 367
    int-to-long v2, v9

    .line 368
    shl-long v2, v2, v16

    .line 369
    .line 370
    move-wide/from16 v28, v2

    .line 371
    .line 372
    int-to-long v2, v4

    .line 373
    and-long v2, v2, v24

    .line 374
    .line 375
    or-long v2, v28, v2

    .line 376
    .line 377
    aput-wide v2, v11, v8

    .line 378
    .line 379
    shr-long v2, v13, v19

    .line 380
    .line 381
    and-long v2, v2, v17

    .line 382
    .line 383
    shl-long v2, v2, v22

    .line 384
    .line 385
    or-long/2addr v2, v13

    .line 386
    aput-wide v2, v11, v10

    .line 387
    .line 388
    shr-long v2, v5, v16

    .line 389
    .line 390
    long-to-int v2, v2

    .line 391
    sub-int v2, v26, v2

    .line 392
    .line 393
    long-to-int v3, v5

    .line 394
    sub-int v3, v27, v3

    .line 395
    .line 396
    if-eqz v2, :cond_a

    .line 397
    .line 398
    const/4 v4, 0x1

    .line 399
    goto :goto_5

    .line 400
    :cond_a
    const/4 v4, 0x0

    .line 401
    :goto_5
    if-eqz v3, :cond_b

    .line 402
    .line 403
    const/4 v5, 0x1

    .line 404
    goto :goto_6

    .line 405
    :cond_b
    const/4 v5, 0x0

    .line 406
    :goto_6
    or-int/2addr v4, v5

    .line 407
    if-eqz v4, :cond_8

    .line 408
    .line 409
    add-int/lit8 v8, v15, 0x3

    .line 410
    .line 411
    sget-wide v4, Lnl1;->β:J

    .line 412
    .line 413
    and-long/2addr v4, v13

    .line 414
    and-int v6, v8, v23

    .line 415
    .line 416
    int-to-long v6, v6

    .line 417
    shl-long v6, v6, v21

    .line 418
    .line 419
    or-long/2addr v4, v6

    .line 420
    invoke-virtual {v12, v2, v3, v4, v5}, Ln2;->ε(IIJ)V

    .line 421
    .line 422
    .line 423
    goto :goto_3

    .line 424
    :cond_c
    move/from16 v26, v2

    .line 425
    .line 426
    move/from16 v27, v3

    .line 427
    .line 428
    move-object v11, v6

    .line 429
    move v15, v8

    .line 430
    add-int/lit8 v8, v15, 0x3

    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_d
    move/from16 v20, v4

    .line 434
    .line 435
    move/from16 v23, v13

    .line 436
    .line 437
    move-wide/from16 v24, v14

    .line 438
    .line 439
    const/4 v4, 0x1

    .line 440
    iput-boolean v4, v1, Lyp0;->λ:Z

    .line 441
    .line 442
    const/16 v4, 0x400

    .line 443
    .line 444
    invoke-virtual {v3, v4}, Lk31;->δ(I)Z

    .line 445
    .line 446
    .line 447
    move-result v17

    .line 448
    const/16 v4, 0x10

    .line 449
    .line 450
    invoke-virtual {v3, v4}, Lk31;->δ(I)Z

    .line 451
    .line 452
    .line 453
    move-result v18

    .line 454
    iget-object v3, v0, Lol1;->γ:Lj42;

    .line 455
    .line 456
    iget-object v3, v3, Lj42;->α:Ln11;

    .line 457
    .line 458
    invoke-virtual {v3, v11}, Lsm0;->α(I)Z

    .line 459
    .line 460
    .line 461
    move-result v19

    .line 462
    if-eqz v2, :cond_f

    .line 463
    .line 464
    iget v2, v2, Lyp0;->ζ:I

    .line 465
    .line 466
    shr-long v3, v7, v16

    .line 467
    .line 468
    long-to-int v3, v3

    .line 469
    and-long v4, v7, v24

    .line 470
    .line 471
    long-to-int v4, v4

    .line 472
    and-int v13, v11, v23

    .line 473
    .line 474
    iget-object v5, v12, Ln2;->γ:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v5, [J

    .line 477
    .line 478
    iget v6, v12, Ln2;->β:I

    .line 479
    .line 480
    add-int/lit8 v6, v6, -0x3

    .line 481
    .line 482
    move/from16 v22, v6

    .line 483
    .line 484
    :goto_7
    if-ltz v22, :cond_8

    .line 485
    .line 486
    add-int/lit8 v6, v22, 0x2

    .line 487
    .line 488
    aget-wide v6, v5, v6

    .line 489
    .line 490
    long-to-int v6, v6

    .line 491
    and-int v6, v6, v23

    .line 492
    .line 493
    if-ne v6, v2, :cond_e

    .line 494
    .line 495
    aget-wide v5, v5, v22

    .line 496
    .line 497
    shr-long v7, v5, v16

    .line 498
    .line 499
    long-to-int v7, v7

    .line 500
    long-to-int v5, v5

    .line 501
    add-int v14, v7, v3

    .line 502
    .line 503
    add-int v15, v5, v4

    .line 504
    .line 505
    add-int v16, v14, v9

    .line 506
    .line 507
    add-int v4, v15, v20

    .line 508
    .line 509
    move/from16 v20, v18

    .line 510
    .line 511
    move/from16 v21, v19

    .line 512
    .line 513
    move/from16 v18, v2

    .line 514
    .line 515
    move/from16 v19, v17

    .line 516
    .line 517
    move/from16 v17, v4

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v22}, Ln2;->β(IIIIIIZZZI)V

    .line 520
    .line 521
    .line 522
    goto/16 :goto_3

    .line 523
    .line 524
    :cond_e
    move-object v10, v12

    .line 525
    add-int/lit8 v22, v22, -0x3

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_f
    move-object v10, v12

    .line 529
    shr-long v2, v7, v16

    .line 530
    .line 531
    long-to-int v12, v2

    .line 532
    and-long v2, v7, v24

    .line 533
    .line 534
    long-to-int v13, v2

    .line 535
    add-int v14, v12, v9

    .line 536
    .line 537
    add-int v15, v13, v20

    .line 538
    .line 539
    const/16 v16, 0x0

    .line 540
    .line 541
    const/16 v20, 0x220

    .line 542
    .line 543
    invoke-static/range {v10 .. v20}, Ln2;->γ(Ln2;IIIIIIZZZI)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_3

    .line 547
    .line 548
    :cond_10
    invoke-virtual/range {p0 .. p1}, Lol1;->γ(Lyp0;)V

    .line 549
    .line 550
    .line 551
    invoke-static {v1}, Lol1;->η(Lyp0;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_3

    .line 555
    .line 556
    :cond_11
    :goto_8
    invoke-virtual/range {p0 .. p1}, Lol1;->γ(Lyp0;)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_3

    .line 560
    .line 561
    :goto_9
    iput-boolean v2, v1, Lyp0;->κ:Z

    .line 562
    .line 563
    const/4 v4, 0x1

    .line 564
    iput-boolean v4, v0, Lol1;->ε:Z

    .line 565
    .line 566
    invoke-virtual {v0}, Lol1;->θ()V

    .line 567
    .line 568
    .line 569
    :cond_12
    :goto_a
    return-void
.end method

.method public final ζ(Lyp0;)V
    .locals 10

    .line 1
    iget-boolean v0, p1, Lyp0;->λ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v0, p1, Lyp0;->ζ:I

    .line 6
    .line 7
    const v1, 0x1ffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v2, p0, Lol1;->β:Ln2;

    .line 12
    .line 13
    iget-object v3, v2, Ln2;->γ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [J

    .line 16
    .line 17
    iget v2, v2, Ln2;->β:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    array-length v6, v3

    .line 22
    add-int/lit8 v6, v6, -0x2

    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    if-ge v5, v6, :cond_1

    .line 26
    .line 27
    if-ge v5, v2, :cond_1

    .line 28
    .line 29
    add-int/lit8 v6, v5, 0x2

    .line 30
    .line 31
    aget-wide v8, v3, v6

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    and-int/2addr v8, v1

    .line 35
    if-ne v8, v0, :cond_0

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    aput-wide v0, v3, v5

    .line 40
    .line 41
    add-int/2addr v5, v7

    .line 42
    aput-wide v0, v3, v5

    .line 43
    .line 44
    sget-wide v0, Lnl1;->γ:J

    .line 45
    .line 46
    aput-wide v0, v3, v6

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v5, v5, 0x3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iput-boolean v4, p1, Lyp0;->λ:Z

    .line 53
    .line 54
    iput-boolean v7, p1, Lyp0;->κ:Z

    .line 55
    .line 56
    iput-boolean v7, p0, Lol1;->ε:Z

    .line 57
    .line 58
    iput-boolean v7, p0, Lol1;->η:Z

    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final θ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lol1;->θ:Lr0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, Lol1;->γ:Lj42;

    .line 9
    .line 10
    iget-wide v2, v2, Lj42;->β:J

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    if-gez v4, :cond_1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-wide v4, p0, Lol1;->ι:J

    .line 22
    .line 23
    cmp-long v4, v4, v2

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    :goto_1
    return-void

    .line 30
    :cond_2
    iget-object v1, p0, Lol1;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    const/16 v0, 0x10

    .line 42
    .line 43
    int-to-long v6, v0

    .line 44
    add-long/2addr v6, v4

    .line 45
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    iput-wide v2, p0, Lol1;->ι:J

    .line 50
    .line 51
    sub-long/2addr v2, v4

    .line 52
    new-instance v0, Lr0;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    iget-object v5, p0, Lol1;->κ:Lk1;

    .line 56
    .line 57
    invoke-direct {v0, v4, v5}, Lr0;-><init>(ILp70;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lol1;->θ:Lr0;

    .line 64
    .line 65
    return-void
.end method
