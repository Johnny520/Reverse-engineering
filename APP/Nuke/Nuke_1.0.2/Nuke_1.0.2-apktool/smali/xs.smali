.class public final Lxs;
.super Liy0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:Lr30;

.field public final j:I

.field public final k:Lr30;

.field public l:Lf63;

.field public final m:Lq30;

.field public final n:Lvs;

.field public o:Lre0;

.field public final p:Lzd;


# direct methods
.method public constructor <init>(Lr30;ILr30;Ld63;Lq30;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Liy0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p4, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lxs;->i:Lr30;

    .line 10
    .line 11
    iput p2, p0, Lxs;->j:I

    .line 12
    .line 13
    iput-object p3, p0, Lxs;->k:Lr30;

    .line 14
    .line 15
    move-object p2, p4

    .line 16
    check-cast p2, Lkj0;

    .line 17
    .line 18
    iget-object p2, p2, Lkj0;->i:[Ljava/lang/Object;

    .line 19
    .line 20
    array-length p2, p2

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    move-object p2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p2, Lf63;

    .line 26
    .line 27
    invoke-direct {p2, p4}, Lf63;-><init>(Ld63;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iput-object p2, p0, Lxs;->l:Lf63;

    .line 31
    .line 32
    iput-object p5, p0, Lxs;->m:Lq30;

    .line 33
    .line 34
    new-instance p2, Lvs;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lvs;-><init>(Lr30;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lxs;->n:Lvs;

    .line 40
    .line 41
    iput-object v0, p0, Lxs;->o:Lre0;

    .line 42
    .line 43
    new-instance p1, Lzd;

    .line 44
    .line 45
    const/4 p2, 0x4

    .line 46
    const/4 p3, -0x1

    .line 47
    invoke-direct {p1, p2, p3}, Lxs1;-><init>(II)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lxs;->p:Lzd;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const-string p0, "interfaces == null"

    .line 54
    .line 55
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    const-string p0, "thisClass == null"

    .line 60
    .line 61
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p1, Lz70;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Leh1;

    .line 8
    .line 9
    iget-object v2, p1, Lz70;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Leh1;

    .line 12
    .line 13
    iget-object v3, p1, Lz70;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lb42;

    .line 16
    .line 17
    iget-object v4, p0, Lxs;->i:Lr30;

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Lb42;->p(Lr30;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lxs;->n:Lvs;

    .line 23
    .line 24
    invoke-virtual {v4}, Lvs;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, Lz70;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Leh1;

    .line 33
    .line 34
    invoke-virtual {p1, v4}, Leh1;->k(Lxs1;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lvs;->o()Lx20;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    new-instance v4, Lre0;

    .line 44
    .line 45
    invoke-direct {v4, p1}, Lre0;-><init>(Lx20;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v4}, Leh1;->l(Lxs1;)Lxs1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lre0;

    .line 53
    .line 54
    iput-object p1, p0, Lxs;->o:Lre0;

    .line 55
    .line 56
    :cond_0
    iget-object p1, p0, Lxs;->k:Lr30;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lb42;->p(Lr30;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object p1, p0, Lxs;->l:Lf63;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Leh1;->l(Lxs1;)Lxs1;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lf63;

    .line 72
    .line 73
    iput-object p1, p0, Lxs;->l:Lf63;

    .line 74
    .line 75
    :cond_2
    iget-object p1, p0, Lxs;->m:Lq30;

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v3, p1}, Lb42;->o(Lq30;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-object p0, p0, Lxs;->p:Lzd;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->q:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    const/16 p0, 0x20

    .line 2
    .line 3
    return p0
.end method

.method public final d(Lz70;Lyn;)V
    .locals 17

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
    invoke-virtual {v2}, Lyn;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v4, v1, Lz70;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lb42;

    .line 14
    .line 15
    iget-object v5, v0, Lxs;->i:Lr30;

    .line 16
    .line 17
    invoke-virtual {v4, v5}, Lb42;->m(Lr30;)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v7, -0x1

    .line 22
    iget-object v8, v0, Lxs;->k:Lr30;

    .line 23
    .line 24
    if-nez v8, :cond_0

    .line 25
    .line 26
    move v4, v7

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v4, v8}, Lb42;->m(Lr30;)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    :goto_0
    iget-object v9, v0, Lxs;->l:Lf63;

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    if-nez v9, :cond_1

    .line 36
    .line 37
    move v9, v10

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v9}, Lxs1;->f()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    :goto_1
    iget-object v11, v0, Lxs;->p:Lzd;

    .line 44
    .line 45
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v11, v0, Lxs;->m:Lq30;

    .line 49
    .line 50
    if-nez v11, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-object v1, v1, Lz70;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lb42;

    .line 56
    .line 57
    invoke-virtual {v1, v11}, Lb42;->l(Lq30;)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    :goto_2
    iget-object v1, v0, Lxs;->n:Lvs;

    .line 62
    .line 63
    invoke-virtual {v1}, Lvs;->p()Z

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-eqz v12, :cond_3

    .line 68
    .line 69
    move v1, v10

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-virtual {v1}, Lxs1;->f()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    :goto_3
    iget-object v12, v0, Lxs;->o:Lre0;

    .line 76
    .line 77
    if-nez v12, :cond_4

    .line 78
    .line 79
    move v12, v10

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    invoke-virtual {v12}, Lxs1;->f()I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    :goto_4
    iget v13, v0, Lxs;->j:I

    .line 86
    .line 87
    if-eqz v3, :cond_8

    .line 88
    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Liy0;->f()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const/16 v14, 0x20

    .line 102
    .line 103
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v5, v5, Lr30;->h:Lo43;

    .line 107
    .line 108
    invoke-virtual {v5}, Lo43;->b()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v2, v3, v10}, Lyn;->c(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v6}, Lpp0;->K(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v5, "  class_idx:           "

    .line 127
    .line 128
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const/4 v5, 0x4

    .line 133
    invoke-virtual {v2, v3, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v14, "  access_flags:        "

    .line 139
    .line 140
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/16 v14, 0x7631

    .line 144
    .line 145
    const/4 v15, 0x1

    .line 146
    invoke-static {v13, v14, v15}, Lup0;->x(III)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v14

    .line 150
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v2, v3, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v14, "  superclass_idx:      "

    .line 163
    .line 164
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v4}, Lpp0;->K(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v14, " // "

    .line 175
    .line 176
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v15, "<none>"

    .line 180
    .line 181
    if-nez v8, :cond_5

    .line 182
    .line 183
    move-object v8, v15

    .line 184
    goto :goto_5

    .line 185
    :cond_5
    iget-object v8, v8, Lr30;->h:Lo43;

    .line 186
    .line 187
    invoke-virtual {v8}, Lo43;->b()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    :goto_5
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v2, v3, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v9}, Lpp0;->K(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    const-string v8, "  interfaces_off:      "

    .line 206
    .line 207
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v2, v3, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    if-eqz v9, :cond_6

    .line 215
    .line 216
    iget-object v0, v0, Lxs;->l:Lf63;

    .line 217
    .line 218
    iget-object v0, v0, Lf63;->l:Ld63;

    .line 219
    .line 220
    move-object v3, v0

    .line 221
    check-cast v3, Lkj0;

    .line 222
    .line 223
    iget-object v3, v3, Lkj0;->i:[Ljava/lang/Object;

    .line 224
    .line 225
    array-length v3, v3

    .line 226
    move v8, v10

    .line 227
    :goto_6
    if-ge v8, v3, :cond_6

    .line 228
    .line 229
    new-instance v5, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v10, "    "

    .line 232
    .line 233
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v0, v8}, Ld63;->getType(I)Lo43;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    invoke-virtual {v10}, Lo43;->b()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    const/4 v10, 0x0

    .line 252
    invoke-virtual {v2, v5, v10}, Lyn;->c(Ljava/lang/String;I)V

    .line 253
    .line 254
    .line 255
    add-int/lit8 v8, v8, 0x1

    .line 256
    .line 257
    const/4 v5, 0x4

    .line 258
    const/4 v10, 0x0

    .line 259
    goto :goto_6

    .line 260
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v3, "  source_file_idx:     "

    .line 263
    .line 264
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v7}, Lpp0;->K(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    if-nez v11, :cond_7

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_7
    invoke-virtual {v11}, Lq30;->b()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v15

    .line 284
    :goto_7
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const/4 v3, 0x4

    .line 292
    invoke-virtual {v2, v0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 293
    .line 294
    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    invoke-static/range {v16 .. v16}, Lpp0;->K(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const-string v5, "  annotations_off:     "

    .line 302
    .line 303
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v2, v0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 308
    .line 309
    .line 310
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    const-string v5, "  class_data_off:      "

    .line 315
    .line 316
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v2, v0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 321
    .line 322
    .line 323
    invoke-static {v12}, Lpp0;->K(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const-string v5, "  static_values_off:   "

    .line 328
    .line 329
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v2, v0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 334
    .line 335
    .line 336
    :cond_8
    invoke-virtual {v2, v6}, Lyn;->j(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v13}, Lyn;->j(I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4}, Lyn;->j(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v9}, Lyn;->j(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v7}, Lyn;->j(I)V

    .line 349
    .line 350
    .line 351
    const/4 v10, 0x0

    .line 352
    invoke-virtual {v2, v10}, Lyn;->j(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v1}, Lyn;->j(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v12}, Lyn;->j(I)V

    .line 359
    .line 360
    .line 361
    return-void
.end method
