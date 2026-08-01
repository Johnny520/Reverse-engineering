.class public final Lhm;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lhm;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lhm;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lhm;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Lhm;->e:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lji;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    and-int/lit8 v0, p2, 0x3

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    move v0, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v4

    .line 28
    :goto_0
    and-int/2addr p2, v3

    .line 29
    check-cast p1, Lpi;

    .line 30
    .line 31
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    const-string p2, "indicatorRipple"

    .line 38
    .line 39
    invoke-static {p2}, Lpf1;->E(Ljava/lang/String;)Lpe0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget-object v0, Li4;->h:Lz01;

    .line 44
    .line 45
    invoke-static {v0, p1}, Lc11;->a(Lz01;Lji;)Lx01;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v2, 0x7e7ff

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v0, v2}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p0, Lld0;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-static {v0, v2}, Luv0;->a(FI)Lwv0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p2, p0, v0}, Lc10;->a(Lpe0;Lg30;Lf10;)Lpe0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0, p1, v4}, Lza;->a(Lpe0;Lji;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 73
    .line 74
    .line 75
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    check-cast p1, Lji;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    check-cast p0, Ly2;

    .line 85
    .line 86
    and-int/lit8 v0, p2, 0x3

    .line 87
    .line 88
    if-eq v0, v2, :cond_2

    .line 89
    .line 90
    move v0, v3

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move v0, v4

    .line 93
    :goto_2
    and-int/2addr p2, v3

    .line 94
    check-cast p1, Lpi;

    .line 95
    .line 96
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_8

    .line 101
    .line 102
    sget-object p2, Lr4;->a:Lej;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget-object p2, Lr4;->b:Lg41;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Landroid/content/Context;

    .line 114
    .line 115
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    const v0, 0x7f0a0036

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    iget-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lpe0;

    .line 129
    .line 130
    sget-object v2, Lm2;->a:Lln0;

    .line 131
    .line 132
    invoke-static {v0}, Ls11;->d(Lpe0;)Lpe0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p1, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-nez v2, :cond_3

    .line 145
    .line 146
    sget-object v2, Lii;->a:Lr3;

    .line 147
    .line 148
    if-ne v5, v2, :cond_4

    .line 149
    .line 150
    :cond_3
    new-instance v5, Lnl;

    .line 151
    .line 152
    invoke-direct {v5, p2, v4}, Lnl;-><init>(Ljava/lang/String;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    check-cast v5, Lsw;

    .line 159
    .line 160
    sget-object p2, Lme0;->a:Lme0;

    .line 161
    .line 162
    invoke-static {p2, v5}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-interface {v0, p2}, Lpe0;->c(Lpe0;)Lpe0;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    sget-object v0, Ln2;->e:Lha;

    .line 171
    .line 172
    invoke-static {v0, v3}, Lza;->d(Lha;Z)Lxd0;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    sget-object v6, Lfi;->b:Lei;

    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v6, Lei;->b:Lcj;

    .line 194
    .line 195
    invoke-virtual {p1}, Lpi;->Z()V

    .line 196
    .line 197
    .line 198
    iget-boolean v7, p1, Lpi;->S:Z

    .line 199
    .line 200
    if-eqz v7, :cond_5

    .line 201
    .line 202
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_5
    invoke-virtual {p1}, Lpi;->j0()V

    .line 207
    .line 208
    .line 209
    :goto_3
    sget-object v6, Lei;->e:Lm7;

    .line 210
    .line 211
    invoke-static {p1, v6, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object v0, Lei;->d:Lm7;

    .line 215
    .line 216
    invoke-static {p1, v0, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lei;->f:Lm7;

    .line 220
    .line 221
    iget-boolean v5, p1, Lpi;->S:Z

    .line 222
    .line 223
    if-nez v5, :cond_6

    .line 224
    .line 225
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v5, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_7

    .line 238
    .line 239
    :cond_6
    invoke-static {v2, p1, v2, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 240
    .line 241
    .line 242
    :cond_7
    sget-object v0, Lei;->c:Lm7;

    .line 243
    .line 244
    invoke-static {p1, v0, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object p0, p0, Ly2;->g:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Lmh;

    .line 250
    .line 251
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-virtual {p0, p1, p2}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_8
    invoke-virtual {p1}, Lpi;->R()V

    .line 263
    .line 264
    .line 265
    :goto_4
    return-object v1

    .line 266
    :pswitch_1
    check-cast p1, Lji;

    .line 267
    .line 268
    check-cast p2, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    check-cast p0, Lpi0;

    .line 275
    .line 276
    and-int/lit8 v0, p2, 0x3

    .line 277
    .line 278
    if-eq v0, v2, :cond_9

    .line 279
    .line 280
    move v0, v3

    .line 281
    goto :goto_5

    .line 282
    :cond_9
    move v0, v4

    .line 283
    :goto_5
    and-int/2addr p2, v3

    .line 284
    check-cast p1, Lpi;

    .line 285
    .line 286
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    if-eqz p2, :cond_d

    .line 291
    .line 292
    sget-object p2, Ls11;->a:Lrt;

    .line 293
    .line 294
    iget-object v0, p0, Lpi0;->e:Lfd1;

    .line 295
    .line 296
    invoke-static {p2, v0}, Lrd0;->Y(Lpe0;Lfd1;)Lpe0;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    sget v0, Loi0;->a:F

    .line 301
    .line 302
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 303
    .line 304
    invoke-static {p2, v2, v0}, Ls11;->a(Lpe0;FF)Lpe0;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    new-instance v0, Lsx0;

    .line 309
    .line 310
    const/16 v2, 0xe

    .line 311
    .line 312
    invoke-direct {v0, v2}, Lsx0;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-static {p2, v0}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    sget v0, Loi0;->b:F

    .line 320
    .line 321
    new-instance v2, Lv8;

    .line 322
    .line 323
    new-instance v5, Ls8;

    .line 324
    .line 325
    invoke-direct {v5, v4}, Ls8;-><init>(I)V

    .line 326
    .line 327
    .line 328
    invoke-direct {v2, v0, v3, v5}, Lv8;-><init>(FZLs8;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Ln2;->o:Lga;

    .line 332
    .line 333
    iget-object p0, p0, Lpi0;->f:Lmh;

    .line 334
    .line 335
    const/16 v4, 0x36

    .line 336
    .line 337
    invoke-static {v2, v0, p1, v4}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    sget-object v5, Lfi;->b:Lei;

    .line 354
    .line 355
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    sget-object v5, Lei;->b:Lcj;

    .line 359
    .line 360
    invoke-virtual {p1}, Lpi;->Z()V

    .line 361
    .line 362
    .line 363
    iget-boolean v6, p1, Lpi;->S:Z

    .line 364
    .line 365
    if-eqz v6, :cond_a

    .line 366
    .line 367
    invoke-virtual {p1, v5}, Lpi;->k(Lhw;)V

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_a
    invoke-virtual {p1}, Lpi;->j0()V

    .line 372
    .line 373
    .line 374
    :goto_6
    sget-object v5, Lei;->e:Lm7;

    .line 375
    .line 376
    invoke-static {p1, v5, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    sget-object v0, Lei;->d:Lm7;

    .line 380
    .line 381
    invoke-static {p1, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    sget-object v0, Lei;->f:Lm7;

    .line 385
    .line 386
    iget-boolean v4, p1, Lpi;->S:Z

    .line 387
    .line 388
    if-nez v4, :cond_b

    .line 389
    .line 390
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-static {v4, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-nez v4, :cond_c

    .line 403
    .line 404
    :cond_b
    invoke-static {v2, p1, v2, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 405
    .line 406
    .line 407
    :cond_c
    sget-object v0, Lei;->c:Lm7;

    .line 408
    .line 409
    invoke-static {p1, v0, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    const/4 p2, 0x6

    .line 413
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    sget-object v0, Lkw0;->a:Lkw0;

    .line 418
    .line 419
    invoke-virtual {p0, v0, p1, p2}, Lmh;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_d
    invoke-virtual {p1}, Lpi;->R()V

    .line 427
    .line 428
    .line 429
    :goto_7
    return-object v1

    .line 430
    nop

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
