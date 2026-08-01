.class public final Ljc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ljc;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Ljc;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ljc;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ljc;->d:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    sget-object v2, Lme0;->a:Lme0;

    .line 5
    .line 6
    sget-object v3, Lna1;->a:Lna1;

    .line 7
    .line 8
    iget-object v4, p0, Ljc;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ljc;->e:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Lji;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    and-int/lit8 v0, p2, 0x3

    .line 27
    .line 28
    if-eq v0, v5, :cond_0

    .line 29
    .line 30
    move v0, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v7

    .line 33
    :goto_0
    and-int/2addr p2, v6

    .line 34
    check-cast p1, Lpi;

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    check-cast p0, Lmh;

    .line 43
    .line 44
    check-cast v4, Lay0;

    .line 45
    .line 46
    sget-object p2, Ln2;->e:Lha;

    .line 47
    .line 48
    invoke-static {p2, v7}, Lza;->d(Lha;Z)Lxd0;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {p1, v2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v7, Lfi;->b:Lei;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v7, Lei;->b:Lcj;

    .line 70
    .line 71
    invoke-virtual {p1}, Lpi;->Z()V

    .line 72
    .line 73
    .line 74
    iget-boolean v8, p1, Lpi;->S:Z

    .line 75
    .line 76
    if-eqz v8, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1, v7}, Lpi;->k(Lhw;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1}, Lpi;->j0()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object v7, Lei;->e:Lm7;

    .line 86
    .line 87
    invoke-static {p1, v7, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p2, Lei;->d:Lm7;

    .line 91
    .line 92
    invoke-static {p1, p2, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object p2, Lei;->f:Lm7;

    .line 96
    .line 97
    iget-boolean v5, p1, Lpi;->S:Z

    .line 98
    .line 99
    if-nez v5, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {v5, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    :cond_2
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget-object p2, Lei;->c:Lm7;

    .line 119
    .line 120
    invoke-static {p1, p2, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p0, v4, p1, p2}, Lmh;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v6}, Lpi;->p(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 135
    .line 136
    .line 137
    :goto_2
    return-object v3

    .line 138
    :pswitch_0
    check-cast p1, Lji;

    .line 139
    .line 140
    check-cast p2, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    check-cast p0, Lw31;

    .line 147
    .line 148
    and-int/lit8 v0, p2, 0x3

    .line 149
    .line 150
    if-eq v0, v5, :cond_5

    .line 151
    .line 152
    move v0, v6

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move v0, v7

    .line 155
    :goto_3
    and-int/2addr p2, v6

    .line 156
    check-cast p1, Lpi;

    .line 157
    .line 158
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_8

    .line 163
    .line 164
    const-string p2, "indicator"

    .line 165
    .line 166
    invoke-static {p2}, Lpf1;->E(Ljava/lang/String;)Lpe0;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    if-nez v0, :cond_6

    .line 179
    .line 180
    sget-object v0, Lii;->a:Lr3;

    .line 181
    .line 182
    if-ne v1, v0, :cond_7

    .line 183
    .line 184
    :cond_6
    new-instance v1, Lo;

    .line 185
    .line 186
    const/16 v0, 0xd

    .line 187
    .line 188
    invoke-direct {v1, v0, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    check-cast v1, Lsw;

    .line 195
    .line 196
    invoke-static {p2, v1}, Lp30;->H(Lpe0;Lsw;)Lpe0;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast v4, Lei0;

    .line 201
    .line 202
    iget-wide v0, v4, Lei0;->c:J

    .line 203
    .line 204
    sget-object p2, Li4;->h:Lz01;

    .line 205
    .line 206
    invoke-static {p2, p1}, Lc11;->a(Lz01;Lji;)Lx01;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-static {p0, v0, v1, p2}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0, p1, v7}, Lza;->a(Lpe0;Lji;I)V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_8
    invoke-virtual {p1}, Lpi;->R()V

    .line 219
    .line 220
    .line 221
    :goto_4
    return-object v3

    .line 222
    :pswitch_1
    check-cast p1, Lji;

    .line 223
    .line 224
    check-cast p2, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    and-int/lit8 v0, p2, 0x3

    .line 231
    .line 232
    if-eq v0, v5, :cond_9

    .line 233
    .line 234
    move v0, v6

    .line 235
    goto :goto_5

    .line 236
    :cond_9
    move v0, v7

    .line 237
    :goto_5
    and-int/2addr p2, v6

    .line 238
    check-cast p1, Lpi;

    .line 239
    .line 240
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    if-eqz p2, :cond_a

    .line 245
    .line 246
    check-cast p0, Lda1;

    .line 247
    .line 248
    iget-object p0, p0, Lda1;->j:Ls71;

    .line 249
    .line 250
    check-cast v4, Lww;

    .line 251
    .line 252
    invoke-static {p0, v4, p1, v7}, Ld71;->a(Ls71;Lww;Lji;I)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_a
    invoke-virtual {p1}, Lpi;->R()V

    .line 257
    .line 258
    .line 259
    :goto_6
    return-object v3

    .line 260
    :pswitch_2
    check-cast p1, Lji;

    .line 261
    .line 262
    check-cast p2, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    and-int/lit8 v0, p2, 0x3

    .line 269
    .line 270
    if-eq v0, v5, :cond_b

    .line 271
    .line 272
    move v7, v6

    .line 273
    :cond_b
    and-int/2addr p2, v6

    .line 274
    check-cast p1, Lpi;

    .line 275
    .line 276
    invoke-virtual {p1, p2, v7}, Lpi;->O(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result p2

    .line 280
    if-eqz p2, :cond_f

    .line 281
    .line 282
    sget p2, Ldc;->c:F

    .line 283
    .line 284
    sget v0, Ldc;->d:F

    .line 285
    .line 286
    invoke-static {v2, p2, v0}, Ls11;->a(Lpe0;FF)Lpe0;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    check-cast p0, Ljn0;

    .line 291
    .line 292
    invoke-static {p2, p0}, Lrd0;->C(Lpe0;Ljn0;)Lpe0;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    sget-object p2, Lrd0;->c:Lr3;

    .line 297
    .line 298
    sget-object v0, Ln2;->o:Lga;

    .line 299
    .line 300
    check-cast v4, Lxw;

    .line 301
    .line 302
    const/16 v2, 0x36

    .line 303
    .line 304
    invoke-static {p2, v0, p1, v2}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-static {p1, p0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    sget-object v5, Lfi;->b:Lei;

    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    sget-object v5, Lei;->b:Lcj;

    .line 326
    .line 327
    invoke-virtual {p1}, Lpi;->Z()V

    .line 328
    .line 329
    .line 330
    iget-boolean v7, p1, Lpi;->S:Z

    .line 331
    .line 332
    if-eqz v7, :cond_c

    .line 333
    .line 334
    invoke-virtual {p1, v5}, Lpi;->k(Lhw;)V

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_c
    invoke-virtual {p1}, Lpi;->j0()V

    .line 339
    .line 340
    .line 341
    :goto_7
    sget-object v5, Lei;->e:Lm7;

    .line 342
    .line 343
    invoke-static {p1, v5, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    sget-object p2, Lei;->d:Lm7;

    .line 347
    .line 348
    invoke-static {p1, p2, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    sget-object p2, Lei;->f:Lm7;

    .line 352
    .line 353
    iget-boolean v2, p1, Lpi;->S:Z

    .line 354
    .line 355
    if-nez v2, :cond_d

    .line 356
    .line 357
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-static {v2, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-nez v2, :cond_e

    .line 370
    .line 371
    :cond_d
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 372
    .line 373
    .line 374
    :cond_e
    sget-object p2, Lei;->c:Lm7;

    .line 375
    .line 376
    invoke-static {p1, p2, p0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    sget-object p0, Lkw0;->a:Lkw0;

    .line 380
    .line 381
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    invoke-interface {v4, p0, p1, p2}, Lxw;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v6}, Lpi;->p(Z)V

    .line 389
    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_f
    invoke-virtual {p1}, Lpi;->R()V

    .line 393
    .line 394
    .line 395
    :goto_8
    return-object v3

    .line 396
    nop

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
