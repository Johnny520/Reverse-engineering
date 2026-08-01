.class public final Lig0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:Lvt0;

.field public i:Lvt0;

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lwt0;

.field public final synthetic n:Lzt0;

.field public final synthetic o:Lzt0;

.field public final synthetic p:F

.field public final synthetic q:Lfn;

.field public final synthetic r:F

.field public final synthetic s:Llz0;


# direct methods
.method public constructor <init>(Lwt0;Lzt0;Lzt0;FLfn;FLlz0;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lig0;->m:Lwt0;

    .line 2
    .line 3
    iput-object p2, p0, Lig0;->n:Lzt0;

    .line 4
    .line 5
    iput-object p3, p0, Lig0;->o:Lzt0;

    .line 6
    .line 7
    iput p4, p0, Lig0;->p:F

    .line 8
    .line 9
    iput-object p5, p0, Lig0;->q:Lfn;

    .line 10
    .line 11
    iput p6, p0, Lig0;->r:F

    .line 12
    .line 13
    iput-object p7, p0, Lig0;->s:Llz0;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lm51;-><init>(ILik;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 9

    .line 1
    new-instance v0, Lig0;

    .line 2
    .line 3
    iget v6, p0, Lig0;->r:F

    .line 4
    .line 5
    iget-object v7, p0, Lig0;->s:Llz0;

    .line 6
    .line 7
    iget-object v1, p0, Lig0;->m:Lwt0;

    .line 8
    .line 9
    iget-object v2, p0, Lig0;->n:Lzt0;

    .line 10
    .line 11
    iget-object v3, p0, Lig0;->o:Lzt0;

    .line 12
    .line 13
    iget v4, p0, Lig0;->p:F

    .line 14
    .line 15
    iget-object v5, p0, Lig0;->q:Lfn;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lig0;-><init>(Lwt0;Lzt0;Lzt0;FLfn;FLlz0;Lik;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lig0;->l:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljz0;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lig0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lig0;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lig0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lig0;->k:I

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    iget-object v1, v7, Lig0;->o:Lzt0;

    .line 7
    .line 8
    iget-object v2, v7, Lig0;->m:Lwt0;

    .line 9
    .line 10
    const/4 v9, 0x3

    .line 11
    const/4 v10, 0x2

    .line 12
    const/4 v11, 0x1

    .line 13
    iget-object v12, v7, Lig0;->n:Lzt0;

    .line 14
    .line 15
    sget-object v13, Lzk;->d:Lzk;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v11, :cond_2

    .line 20
    .line 21
    if-eq v0, v10, :cond_1

    .line 22
    .line 23
    if-ne v0, v9, :cond_0

    .line 24
    .line 25
    iget-object v0, v7, Lig0;->i:Lvt0;

    .line 26
    .line 27
    iget-object v3, v7, Lig0;->h:Lvt0;

    .line 28
    .line 29
    iget-object v4, v7, Lig0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Ljz0;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v11, v0

    .line 37
    move-object v6, v3

    .line 38
    move-object v14, v4

    .line 39
    move-object v4, v12

    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v8

    .line 50
    :cond_1
    iget v0, v7, Lig0;->j:I

    .line 51
    .line 52
    iget-object v3, v7, Lig0;->h:Lvt0;

    .line 53
    .line 54
    iget-object v4, v7, Lig0;->l:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljz0;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v21, v1

    .line 62
    .line 63
    move-object/from16 v22, v2

    .line 64
    .line 65
    move-object v11, v3

    .line 66
    move-object v14, v4

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_2
    iget-object v0, v7, Lig0;->i:Lvt0;

    .line 70
    .line 71
    iget-object v3, v7, Lig0;->h:Lvt0;

    .line 72
    .line 73
    iget-object v4, v7, Lig0;->l:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljz0;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v6, v3

    .line 81
    move-object v14, v4

    .line 82
    move-object v4, v12

    .line 83
    move-object v12, v0

    .line 84
    move-object/from16 v0, p1

    .line 85
    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_3
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v7, Lig0;->l:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljz0;

    .line 94
    .line 95
    new-instance v3, Lvt0;

    .line 96
    .line 97
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-boolean v11, v3, Lvt0;->d:Z

    .line 101
    .line 102
    move-object v6, v3

    .line 103
    :goto_0
    iget-boolean v3, v6, Lvt0;->d:Z

    .line 104
    .line 105
    sget-object v20, Lna1;->a:Lna1;

    .line 106
    .line 107
    if-eqz v3, :cond_c

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    iput-boolean v3, v6, Lvt0;->d:Z

    .line 111
    .line 112
    iget v3, v2, Lwt0;->d:F

    .line 113
    .line 114
    iget-object v4, v12, Lzt0;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Lw7;

    .line 117
    .line 118
    iget-object v4, v4, Lw7;->e:Lgp0;

    .line 119
    .line 120
    invoke-virtual {v4}, Lgp0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    sub-float/2addr v3, v4

    .line 131
    iget-object v4, v1, Lzt0;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v4, Lfg0;

    .line 134
    .line 135
    iget-boolean v4, v4, Lfg0;->c:Z

    .line 136
    .line 137
    iget-object v5, v7, Lig0;->q:Lfn;

    .line 138
    .line 139
    if-nez v4, :cond_4

    .line 140
    .line 141
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    iget v14, v7, Lig0;->p:F

    .line 146
    .line 147
    cmpg-float v4, v4, v14

    .line 148
    .line 149
    if-gez v4, :cond_5

    .line 150
    .line 151
    :cond_4
    move-object v14, v0

    .line 152
    move-object v4, v12

    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_5
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    mul-float/2addr v3, v14

    .line 160
    invoke-virtual {v5, v0, v3}, Lfn;->c(Ljz0;F)F

    .line 161
    .line 162
    .line 163
    iget-object v4, v12, Lzt0;->d:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Lw7;

    .line 166
    .line 167
    iget-object v5, v4, Lw7;->e:Lgp0;

    .line 168
    .line 169
    invoke-virtual {v5}, Lgp0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    add-float/2addr v5, v3

    .line 180
    const/4 v3, 0x0

    .line 181
    const/16 v14, 0x1e

    .line 182
    .line 183
    invoke-static {v4, v5, v3, v14}, Lpf1;->q(Lw7;FFI)Lw7;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iput-object v3, v12, Lzt0;->d:Ljava/lang/Object;

    .line 188
    .line 189
    iget v4, v2, Lwt0;->d:F

    .line 190
    .line 191
    iget-object v3, v3, Lw7;->e:Lgp0;

    .line 192
    .line 193
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    sub-float/2addr v4, v3

    .line 204
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    iget v4, v7, Lig0;->r:F

    .line 209
    .line 210
    div-float/2addr v3, v4

    .line 211
    invoke-static {v3}, Lrd0;->Q(F)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    const/16 v4, 0x64

    .line 216
    .line 217
    if-le v3, v4, :cond_6

    .line 218
    .line 219
    move v14, v4

    .line 220
    goto :goto_1

    .line 221
    :cond_6
    move v14, v3

    .line 222
    :goto_1
    iget-object v3, v12, Lzt0;->d:Ljava/lang/Object;

    .line 223
    .line 224
    move-object v15, v3

    .line 225
    check-cast v15, Lw7;

    .line 226
    .line 227
    iget v3, v2, Lwt0;->d:F

    .line 228
    .line 229
    new-instance v18, Lhg0;

    .line 230
    .line 231
    move-object v4, v2

    .line 232
    iget-object v2, v7, Lig0;->q:Lfn;

    .line 233
    .line 234
    iget-object v5, v7, Lig0;->s:Llz0;

    .line 235
    .line 236
    move v11, v3

    .line 237
    move-object v3, v1

    .line 238
    move-object/from16 v1, v18

    .line 239
    .line 240
    invoke-direct/range {v1 .. v6}, Lhg0;-><init>(Lfn;Lzt0;Lwt0;Llz0;Lvt0;)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v16, v2

    .line 244
    .line 245
    move-object/from16 v21, v3

    .line 246
    .line 247
    move-object/from16 v22, v4

    .line 248
    .line 249
    iput-object v0, v7, Lig0;->l:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v6, v7, Lig0;->h:Lvt0;

    .line 252
    .line 253
    iput-object v8, v7, Lig0;->i:Lvt0;

    .line 254
    .line 255
    iput v14, v7, Lig0;->j:I

    .line 256
    .line 257
    iput v10, v7, Lig0;->k:I

    .line 258
    .line 259
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance v2, Lwt0;

    .line 263
    .line 264
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    iget-object v3, v15, Lw7;->e:Lgp0;

    .line 268
    .line 269
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    iput v3, v2, Lwt0;->d:F

    .line 280
    .line 281
    new-instance v1, Ljava/lang/Float;

    .line 282
    .line 283
    invoke-direct {v1, v11}, Ljava/lang/Float;-><init>(F)V

    .line 284
    .line 285
    .line 286
    sget-object v3, Lcr;->b:Lxc;

    .line 287
    .line 288
    move-object v4, v15

    .line 289
    move-object v15, v2

    .line 290
    new-instance v2, Lp91;

    .line 291
    .line 292
    invoke-direct {v2, v14, v3}, Lp91;-><init>(ILbr;)V

    .line 293
    .line 294
    .line 295
    move v3, v14

    .line 296
    new-instance v14, Ly6;

    .line 297
    .line 298
    const/16 v19, 0x2

    .line 299
    .line 300
    move-object/from16 v17, v0

    .line 301
    .line 302
    move v11, v3

    .line 303
    move-object v0, v4

    .line 304
    invoke-direct/range {v14 .. v19}, Ly6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    move-object v4, v14

    .line 308
    move-object/from16 v14, v17

    .line 309
    .line 310
    const/4 v3, 0x1

    .line 311
    move-object v5, v7

    .line 312
    invoke-static/range {v0 .. v5}, Lz60;->h(Lw7;Ljava/lang/Float;Lv7;ZLsw;Ljk;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v13, :cond_7

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_7
    move-object/from16 v0, v20

    .line 320
    .line 321
    :goto_2
    if-ne v0, v13, :cond_8

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_8
    move v0, v11

    .line 325
    move-object v11, v6

    .line 326
    :goto_3
    iget-boolean v1, v11, Lvt0;->d:Z

    .line 327
    .line 328
    if-nez v1, :cond_a

    .line 329
    .line 330
    const-wide/16 v1, 0x32

    .line 331
    .line 332
    int-to-long v3, v0

    .line 333
    sub-long v5, v1, v3

    .line 334
    .line 335
    iput-object v14, v7, Lig0;->l:Ljava/lang/Object;

    .line 336
    .line 337
    iput-object v11, v7, Lig0;->h:Lvt0;

    .line 338
    .line 339
    iput-object v11, v7, Lig0;->i:Lvt0;

    .line 340
    .line 341
    iput v9, v7, Lig0;->k:I

    .line 342
    .line 343
    iget-object v0, v7, Lig0;->q:Lfn;

    .line 344
    .line 345
    iget-object v3, v7, Lig0;->s:Llz0;

    .line 346
    .line 347
    move-object v4, v12

    .line 348
    move-object/from16 v1, v21

    .line 349
    .line 350
    move-object/from16 v2, v22

    .line 351
    .line 352
    invoke-static/range {v0 .. v7}, Lfn;->b(Lfn;Lzt0;Lwt0;Llz0;Lzt0;JLjk;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v13, :cond_9

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_9
    move-object v6, v11

    .line 360
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    iput-boolean v0, v11, Lvt0;->d:Z

    .line 367
    .line 368
    move-object v12, v4

    .line 369
    move-object v0, v14

    .line 370
    :goto_5
    const/4 v11, 0x1

    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_a
    move-object v6, v11

    .line 374
    move-object v0, v14

    .line 375
    move-object/from16 v1, v21

    .line 376
    .line 377
    move-object/from16 v2, v22

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :goto_6
    invoke-virtual {v5, v14, v3}, Lfn;->c(Ljz0;F)F

    .line 381
    .line 382
    .line 383
    iput-object v14, v7, Lig0;->l:Ljava/lang/Object;

    .line 384
    .line 385
    iput-object v6, v7, Lig0;->h:Lvt0;

    .line 386
    .line 387
    iput-object v6, v7, Lig0;->i:Lvt0;

    .line 388
    .line 389
    const/4 v11, 0x1

    .line 390
    iput v11, v7, Lig0;->k:I

    .line 391
    .line 392
    iget-object v0, v7, Lig0;->q:Lfn;

    .line 393
    .line 394
    iget-object v3, v7, Lig0;->s:Llz0;

    .line 395
    .line 396
    move-object v12, v6

    .line 397
    const-wide/16 v5, 0x32

    .line 398
    .line 399
    invoke-static/range {v0 .. v7}, Lfn;->b(Lfn;Lzt0;Lwt0;Llz0;Lzt0;JLjk;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-ne v0, v13, :cond_b

    .line 404
    .line 405
    :goto_7
    return-object v13

    .line 406
    :cond_b
    move-object v6, v12

    .line 407
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    iput-boolean v0, v12, Lvt0;->d:Z

    .line 414
    .line 415
    move-object/from16 v7, p0

    .line 416
    .line 417
    move-object v12, v4

    .line 418
    move-object v0, v14

    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_c
    return-object v20
.end method
