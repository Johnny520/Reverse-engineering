.class public final synthetic Led;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Led;->d:I

    .line 2
    .line 3
    iput-object p3, p0, Led;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Led;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Led;->d:I

    iput-object p2, p0, Led;->e:Ljava/lang/Object;

    iput-object p3, p0, Led;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Led;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, Lna1;->a:Lna1;

    .line 7
    .line 8
    iget-object v5, p0, Led;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Led;->e:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Ls71;

    .line 16
    .line 17
    check-cast v5, Lww;

    .line 18
    .line 19
    check-cast p1, Lji;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Lj50;->A(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p0, v5, p1, p2}, Ld71;->a(Ls71;Lww;Lji;I)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :pswitch_0
    check-cast p0, Lwt0;

    .line 35
    .line 36
    check-cast v5, Lmm;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    check-cast p2, Ljava/lang/Float;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget p2, p0, Lwt0;->d:F

    .line 50
    .line 51
    sub-float/2addr p1, p2

    .line 52
    iget-object p2, v5, Lmm;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, Lny0;

    .line 55
    .line 56
    invoke-interface {p2, p1}, Lny0;->a(F)F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget p2, p0, Lwt0;->d:F

    .line 61
    .line 62
    add-float/2addr p2, p1

    .line 63
    iput p2, p0, Lwt0;->d:F

    .line 64
    .line 65
    return-object v4

    .line 66
    :pswitch_1
    check-cast p0, Landroid/content/Context;

    .line 67
    .line 68
    check-cast v5, Landroid/graphics/Bitmap;

    .line 69
    .line 70
    check-cast p1, Lji;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-static {p0, v5, p1, p2}, Lzc0;->I(Landroid/content/Context;Landroid/graphics/Bitmap;Lji;I)Lna1;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_2
    check-cast p0, Ltop/anjao2024/xp1whs/MainActivity;

    .line 84
    .line 85
    check-cast v5, Lgp0;

    .line 86
    .line 87
    check-cast p1, Lji;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    invoke-static {p0, v5, p1, p2}, Ltop/anjao2024/xp1whs/MainActivity;->h(Ltop/anjao2024/xp1whs/MainActivity;Lgp0;Lji;I)Lna1;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_3
    check-cast p0, Ltop/anjao2024/xp1whs/MainActivity;

    .line 101
    .line 102
    check-cast v5, Loh0;

    .line 103
    .line 104
    check-cast p1, Lji;

    .line 105
    .line 106
    check-cast p2, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-static {p0, v5, p1, p2}, Ltop/anjao2024/xp1whs/MainActivity;->g(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_4
    check-cast p0, Lmh;

    .line 118
    .line 119
    check-cast v5, Lf90;

    .line 120
    .line 121
    check-cast p1, Lji;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    and-int/lit8 v0, p2, 0x3

    .line 130
    .line 131
    if-eq v0, v1, :cond_0

    .line 132
    .line 133
    move v0, v3

    .line 134
    goto :goto_0

    .line 135
    :cond_0
    move v0, v2

    .line 136
    :goto_0
    and-int/2addr p2, v3

    .line 137
    check-cast p1, Lpi;

    .line 138
    .line 139
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_1

    .line 144
    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p0, v5, p1, p2}, Lmh;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 154
    .line 155
    .line 156
    :goto_1
    return-object v4

    .line 157
    :pswitch_5
    check-cast p0, Ln70;

    .line 158
    .line 159
    check-cast v5, Lr70;

    .line 160
    .line 161
    check-cast p1, Ly41;

    .line 162
    .line 163
    check-cast p2, Lpj;

    .line 164
    .line 165
    new-instance v0, Ls70;

    .line 166
    .line 167
    invoke-direct {v0, p0, p1}, Ls70;-><init>(Ln70;Ly41;)V

    .line 168
    .line 169
    .line 170
    iget-wide p0, p2, Lpj;->a:J

    .line 171
    .line 172
    invoke-interface {v5, v0, p0, p1}, Lr70;->a(Ls70;J)Lyd0;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_6
    check-cast p0, Ln70;

    .line 178
    .line 179
    check-cast v5, Lm70;

    .line 180
    .line 181
    check-cast p1, Lji;

    .line 182
    .line 183
    check-cast p2, Ljava/lang/Integer;

    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    and-int/lit8 v0, p2, 0x3

    .line 190
    .line 191
    if-eq v0, v1, :cond_2

    .line 192
    .line 193
    move v0, v3

    .line 194
    goto :goto_2

    .line 195
    :cond_2
    move v0, v2

    .line 196
    :goto_2
    and-int/2addr p2, v3

    .line 197
    move-object v10, p1

    .line 198
    check-cast v10, Lpi;

    .line 199
    .line 200
    invoke-virtual {v10, p2, v0}, Lpi;->O(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_8

    .line 205
    .line 206
    iget-object p1, p0, Ln70;->b:Lq70;

    .line 207
    .line 208
    invoke-virtual {p1}, Lq70;->invoke()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    move-object v6, p1

    .line 213
    check-cast v6, Lo70;

    .line 214
    .line 215
    iget p1, v5, Lm70;->c:I

    .line 216
    .line 217
    iget-object p2, v5, Lm70;->a:Ljava/lang/Object;

    .line 218
    .line 219
    invoke-interface {v6}, Lo70;->a()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const/4 v1, -0x1

    .line 224
    if-ge p1, v0, :cond_4

    .line 225
    .line 226
    invoke-interface {v6, p1}, Lo70;->c(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_3

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_3
    :goto_3
    move v8, p1

    .line 238
    goto :goto_5

    .line 239
    :cond_4
    :goto_4
    invoke-interface {v6, p2}, Lo70;->e(Ljava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-eq p1, v1, :cond_3

    .line 244
    .line 245
    iput p1, v5, Lm70;->c:I

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :goto_5
    if-eq v8, v1, :cond_5

    .line 249
    .line 250
    const p1, -0x6339ef97

    .line 251
    .line 252
    .line 253
    invoke-virtual {v10, p1}, Lpi;->W(I)V

    .line 254
    .line 255
    .line 256
    iget-object v7, p0, Ln70;->a:Lww0;

    .line 257
    .line 258
    iget-object v9, v5, Lm70;->a:Ljava/lang/Object;

    .line 259
    .line 260
    const/4 v11, 0x0

    .line 261
    invoke-static/range {v6 .. v11}, Lv50;->c(Lo70;Ljava/lang/Object;ILjava/lang/Object;Lji;I)V

    .line 262
    .line 263
    .line 264
    :goto_6
    invoke-virtual {v10, v2}, Lpi;->p(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_5
    const p0, -0x63716822

    .line 269
    .line 270
    .line 271
    invoke-virtual {v10, p0}, Lpi;->W(I)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :goto_7
    invoke-virtual {v10, v5}, Lpi;->h(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-nez p0, :cond_6

    .line 284
    .line 285
    sget-object p0, Lii;->a:Lr3;

    .line 286
    .line 287
    if-ne p1, p0, :cond_7

    .line 288
    .line 289
    :cond_6
    new-instance p1, Lo;

    .line 290
    .line 291
    const/4 p0, 0x6

    .line 292
    invoke-direct {p1, p0, v5}, Lo;-><init>(ILjava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, p1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_7
    check-cast p1, Lsw;

    .line 299
    .line 300
    invoke-static {p2, p1, v10}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_8
    invoke-virtual {v10}, Lpi;->R()V

    .line 305
    .line 306
    .line 307
    :goto_8
    return-object v4

    .line 308
    :pswitch_7
    check-cast p0, Lim;

    .line 309
    .line 310
    check-cast v5, Lpi0;

    .line 311
    .line 312
    check-cast p1, Lji;

    .line 313
    .line 314
    check-cast p2, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-static {v3}, Lj50;->A(I)I

    .line 320
    .line 321
    .line 322
    move-result p2

    .line 323
    invoke-virtual {p0, v5, p1, p2}, Lim;->a(Lpi0;Lji;I)V

    .line 324
    .line 325
    .line 326
    return-object v4

    .line 327
    :pswitch_8
    check-cast p0, Lol;

    .line 328
    .line 329
    check-cast v5, Ly2;

    .line 330
    .line 331
    check-cast p1, Lji;

    .line 332
    .line 333
    check-cast p2, Ljava/lang/Integer;

    .line 334
    .line 335
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {v3}, Lj50;->A(I)I

    .line 339
    .line 340
    .line 341
    move-result p2

    .line 342
    invoke-virtual {p0, v5, p1, p2}, Lol;->a(Ly2;Lji;I)V

    .line 343
    .line 344
    .line 345
    return-object v4

    .line 346
    :pswitch_9
    check-cast p0, Liu0;

    .line 347
    .line 348
    check-cast v5, Lz11;

    .line 349
    .line 350
    check-cast p1, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    instance-of v0, p2, Lvh;

    .line 357
    .line 358
    if-eqz v0, :cond_9

    .line 359
    .line 360
    check-cast p2, Lvh;

    .line 361
    .line 362
    iget-object p0, p0, Liu0;->f:Lsh0;

    .line 363
    .line 364
    invoke-virtual {p0, p2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_9
    instance-of v0, p2, Lhv0;

    .line 369
    .line 370
    if-nez v0, :cond_b

    .line 371
    .line 372
    instance-of v0, p2, Lku0;

    .line 373
    .line 374
    if-eqz v0, :cond_a

    .line 375
    .line 376
    invoke-static {v5, p1, p2}, Lpf1;->N(Lz11;ILjava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    check-cast p2, Lku0;

    .line 380
    .line 381
    invoke-virtual {p0, p2}, Liu0;->e(Lku0;)V

    .line 382
    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_a
    instance-of p0, p2, Lht0;

    .line 386
    .line 387
    if-eqz p0, :cond_b

    .line 388
    .line 389
    invoke-static {v5, p1, p2}, Lpf1;->N(Lz11;ILjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    check-cast p2, Lht0;

    .line 393
    .line 394
    invoke-virtual {p2}, Lht0;->c()V

    .line 395
    .line 396
    .line 397
    :cond_b
    :goto_9
    return-object v4

    .line 398
    :pswitch_a
    check-cast p0, Lpe0;

    .line 399
    .line 400
    check-cast v5, Lsw;

    .line 401
    .line 402
    check-cast p1, Lji;

    .line 403
    .line 404
    check-cast p2, Ljava/lang/Integer;

    .line 405
    .line 406
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-static {v3}, Lj50;->A(I)I

    .line 410
    .line 411
    .line 412
    move-result p2

    .line 413
    invoke-static {p0, v5, p1, p2}, Ls91;->b(Lpe0;Lsw;Lji;I)V

    .line 414
    .line 415
    .line 416
    return-object v4

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
