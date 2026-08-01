.class public final Lj61;
.super Lav0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Lnr0;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lyk;

.field public final synthetic l:Lbg;

.field public final synthetic m:Lsw;

.field public final synthetic n:Lsw;

.field public final synthetic o:Lag;

.field public final synthetic p:Lhs0;


# direct methods
.method public constructor <init>(Lyk;Lbg;Lsw;Lsw;Lag;Lhs0;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj61;->k:Lyk;

    .line 2
    .line 3
    iput-object p2, p0, Lj61;->l:Lbg;

    .line 4
    .line 5
    iput-object p3, p0, Lj61;->m:Lsw;

    .line 6
    .line 7
    iput-object p4, p0, Lj61;->n:Lsw;

    .line 8
    .line 9
    iput-object p5, p0, Lj61;->o:Lag;

    .line 10
    .line 11
    iput-object p6, p0, Lj61;->p:Lhs0;

    .line 12
    .line 13
    invoke-direct {p0, p7}, Lav0;-><init>(Lik;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 8

    .line 1
    new-instance v0, Lj61;

    .line 2
    .line 3
    iget-object v5, p0, Lj61;->o:Lag;

    .line 4
    .line 5
    iget-object v6, p0, Lj61;->p:Lhs0;

    .line 6
    .line 7
    iget-object v1, p0, Lj61;->k:Lyk;

    .line 8
    .line 9
    iget-object v2, p0, Lj61;->l:Lbg;

    .line 10
    .line 11
    iget-object v3, p0, Lj61;->m:Lsw;

    .line 12
    .line 13
    iget-object v4, p0, Lj61;->n:Lsw;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lj61;-><init>(Lyk;Lbg;Lsw;Lsw;Lag;Lhs0;Lik;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lj61;->j:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr51;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lj61;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lj61;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lj61;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj61;->o:Lag;

    .line 4
    .line 5
    iget-object v1, v1, Lag;->e:Ldg;

    .line 6
    .line 7
    iget v2, v0, Lj61;->i:I

    .line 8
    .line 9
    const/16 v6, 0x8

    .line 10
    .line 11
    const/4 v8, 0x3

    .line 12
    sget-object v9, Ljr0;->e:Ljr0;

    .line 13
    .line 14
    iget-object v10, v0, Lj61;->k:Lyk;

    .line 15
    .line 16
    iget-object v11, v0, Lj61;->n:Lsw;

    .line 17
    .line 18
    sget-object v12, Lrb0;->a:Lrb0;

    .line 19
    .line 20
    iget-object v14, v0, Lj61;->l:Lbg;

    .line 21
    .line 22
    sget-object v19, Lna1;->a:Lna1;

    .line 23
    .line 24
    iget-object v13, v0, Lj61;->m:Lsw;

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    const/16 v20, 0x0

    .line 28
    .line 29
    iget-object v7, v0, Lj61;->p:Lhs0;

    .line 30
    .line 31
    sget-object v4, Lzk;->d:Lzk;

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v20

    .line 42
    :pswitch_0
    iget-object v0, v0, Lj61;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lc40;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v15, v7

    .line 50
    const/4 v14, 0x0

    .line 51
    goto/16 :goto_c

    .line 52
    .line 53
    :pswitch_1
    iget-object v2, v0, Lj61;->h:Lnr0;

    .line 54
    .line 55
    iget-object v5, v0, Lj61;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Lnr0;

    .line 58
    .line 59
    iget-object v9, v0, Lj61;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v9, Lc40;

    .line 62
    .line 63
    iget-object v14, v0, Lj61;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v14, Lr51;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v6, p1

    .line 71
    .line 72
    move-object v15, v7

    .line 73
    move-object v8, v9

    .line 74
    move-object/from16 p1, v13

    .line 75
    .line 76
    move-object v3, v14

    .line 77
    const/4 v14, 0x0

    .line 78
    goto/16 :goto_a

    .line 79
    .line 80
    :pswitch_2
    iget-object v2, v0, Lj61;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lnr0;

    .line 83
    .line 84
    iget-object v0, v0, Lj61;->j:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lc40;

    .line 87
    .line 88
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v8, v0

    .line 92
    move-object v15, v7

    .line 93
    const/4 v14, 0x0

    .line 94
    move-object/from16 v0, p1

    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :pswitch_3
    iget-object v2, v0, Lj61;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Lc40;

    .line 101
    .line 102
    iget-object v5, v0, Lj61;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Lnr0;

    .line 105
    .line 106
    iget-object v3, v0, Lj61;->j:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lr51;

    .line 109
    .line 110
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v15, v2

    .line 114
    move-object v6, v14

    .line 115
    const/4 v14, 0x0

    .line 116
    move-object/from16 v2, p1

    .line 117
    .line 118
    move-object/from16 p1, v13

    .line 119
    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :pswitch_4
    iget-object v0, v0, Lj61;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lc40;

    .line 125
    .line 126
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :pswitch_5
    iget-object v2, v0, Lj61;->g:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Lc40;

    .line 135
    .line 136
    iget-object v3, v0, Lj61;->f:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v3, Lnr0;

    .line 139
    .line 140
    iget-object v5, v0, Lj61;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v5, Lr51;

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v6, v13

    .line 148
    move-object v13, v3

    .line 149
    move-object v3, v6

    .line 150
    move-object/from16 v15, p1

    .line 151
    .line 152
    move-object v6, v14

    .line 153
    const/4 v14, 0x0

    .line 154
    goto/16 :goto_3

    .line 155
    .line 156
    :pswitch_6
    iget-object v2, v0, Lj61;->f:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, Lc40;

    .line 159
    .line 160
    iget-object v3, v0, Lj61;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v3, Lr51;

    .line 163
    .line 164
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    move-object v5, v3

    .line 168
    move-object v3, v13

    .line 169
    move-object v6, v14

    .line 170
    const/4 v14, 0x0

    .line 171
    move-object/from16 v13, p1

    .line 172
    .line 173
    goto/16 :goto_2

    .line 174
    .line 175
    :pswitch_7
    iget-object v2, v0, Lj61;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Lr51;

    .line 178
    .line 179
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v3, p1

    .line 183
    .line 184
    :cond_0
    move-object v5, v2

    .line 185
    goto :goto_0

    .line 186
    :pswitch_8
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v2, v0, Lj61;->j:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, Lr51;

    .line 192
    .line 193
    iput-object v2, v0, Lj61;->j:Ljava/lang/Object;

    .line 194
    .line 195
    iput v15, v0, Lj61;->i:I

    .line 196
    .line 197
    invoke-static {v2, v0, v8}, Lm61;->c(Lr51;Lav0;I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    if-ne v3, v4, :cond_0

    .line 202
    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :goto_0
    move-object/from16 v16, v3

    .line 206
    .line 207
    check-cast v16, Lnr0;

    .line 208
    .line 209
    invoke-virtual/range {v16 .. v16}, Lnr0;->a()V

    .line 210
    .line 211
    .line 212
    sget-object v2, Lm61;->a:Lnq;

    .line 213
    .line 214
    new-instance v2, Lcg;

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    invoke-direct {v2, v7, v3, v6}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v10, v3, v2, v15}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    sget-object v3, Lm61;->a:Lnq;

    .line 225
    .line 226
    if-eq v14, v3, :cond_1

    .line 227
    .line 228
    move-object v3, v13

    .line 229
    new-instance v13, Lh61;

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    move/from16 v17, v15

    .line 234
    .line 235
    move-object v15, v7

    .line 236
    move/from16 v7, v17

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    invoke-direct/range {v13 .. v18}, Lh61;-><init>(Lbg;Lhs0;Lnr0;Lik;I)V

    .line 241
    .line 242
    .line 243
    move-object v6, v14

    .line 244
    move-object v7, v15

    .line 245
    move-object/from16 v14, v17

    .line 246
    .line 247
    move-object v15, v13

    .line 248
    move-object/from16 v13, v16

    .line 249
    .line 250
    invoke-static {v10, v2, v15}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_1
    move-object v3, v13

    .line 255
    move-object v6, v14

    .line 256
    move-object/from16 v13, v16

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    :goto_1
    if-nez v3, :cond_3

    .line 260
    .line 261
    iput-object v5, v0, Lj61;->j:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v2, v0, Lj61;->f:Ljava/lang/Object;

    .line 264
    .line 265
    const/4 v13, 0x2

    .line 266
    iput v13, v0, Lj61;->i:I

    .line 267
    .line 268
    invoke-static {v5, v9, v0}, Lm61;->g(Lr51;Ljr0;Ly9;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    if-ne v13, v4, :cond_2

    .line 273
    .line 274
    goto/16 :goto_b

    .line 275
    .line 276
    :cond_2
    :goto_2
    check-cast v13, Lnr0;

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_3
    iput-object v5, v0, Lj61;->j:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object v13, v0, Lj61;->f:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v2, v0, Lj61;->g:Ljava/lang/Object;

    .line 284
    .line 285
    iput v8, v0, Lj61;->i:I

    .line 286
    .line 287
    invoke-static {v5, v9, v0}, Lm61;->f(Lr51;Ljr0;Ly9;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    if-ne v15, v4, :cond_4

    .line 292
    .line 293
    goto/16 :goto_b

    .line 294
    .line 295
    :cond_4
    :goto_3
    check-cast v15, Lsb0;

    .line 296
    .line 297
    invoke-static {v15, v12}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v17

    .line 301
    if-eqz v17, :cond_6

    .line 302
    .line 303
    iget-wide v8, v13, Lnr0;->c:J

    .line 304
    .line 305
    new-instance v1, Lok0;

    .line 306
    .line 307
    invoke-direct {v1, v8, v9}, Lok0;-><init>(J)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v3, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    iput-object v2, v0, Lj61;->j:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object v14, v0, Lj61;->f:Ljava/lang/Object;

    .line 316
    .line 317
    iput-object v14, v0, Lj61;->g:Ljava/lang/Object;

    .line 318
    .line 319
    const/4 v1, 0x4

    .line 320
    iput v1, v0, Lj61;->i:I

    .line 321
    .line 322
    invoke-static {v5, v0}, Lm61;->a(Lr51;Ly9;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-ne v0, v4, :cond_5

    .line 327
    .line 328
    goto/16 :goto_b

    .line 329
    .line 330
    :cond_5
    move-object v0, v2

    .line 331
    :goto_4
    new-instance v1, Li61;

    .line 332
    .line 333
    const/4 v2, 0x0

    .line 334
    invoke-direct {v1, v7, v14, v2}, Li61;-><init>(Lhs0;Lik;I)V

    .line 335
    .line 336
    .line 337
    invoke-static {v10, v0, v1}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 338
    .line 339
    .line 340
    return-object v19

    .line 341
    :cond_6
    instance-of v13, v15, Lqb0;

    .line 342
    .line 343
    if-eqz v13, :cond_7

    .line 344
    .line 345
    check-cast v15, Lqb0;

    .line 346
    .line 347
    iget-object v13, v15, Lqb0;->a:Lnr0;

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_7
    instance-of v13, v15, Lpb0;

    .line 351
    .line 352
    if-eqz v13, :cond_19

    .line 353
    .line 354
    move-object v13, v14

    .line 355
    :goto_5
    if-nez v13, :cond_8

    .line 356
    .line 357
    new-instance v15, Li61;

    .line 358
    .line 359
    const/4 v8, 0x1

    .line 360
    invoke-direct {v15, v7, v14, v8}, Li61;-><init>(Lhs0;Lik;I)V

    .line 361
    .line 362
    .line 363
    invoke-static {v10, v2, v15}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    goto :goto_6

    .line 368
    :cond_8
    invoke-virtual {v13}, Lnr0;->a()V

    .line 369
    .line 370
    .line 371
    new-instance v8, Li61;

    .line 372
    .line 373
    const/4 v15, 0x2

    .line 374
    invoke-direct {v8, v7, v14, v15}, Li61;-><init>(Lhs0;Lik;I)V

    .line 375
    .line 376
    .line 377
    invoke-static {v10, v2, v8}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    :goto_6
    if-eqz v13, :cond_18

    .line 382
    .line 383
    if-nez v11, :cond_a

    .line 384
    .line 385
    iget-boolean v0, v1, Ln;->x:Z

    .line 386
    .line 387
    if-eqz v0, :cond_9

    .line 388
    .line 389
    iget-object v0, v1, Ln;->y:Lhw;

    .line 390
    .line 391
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    :cond_9
    return-object v19

    .line 395
    :cond_a
    iput-object v5, v0, Lj61;->j:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object v13, v0, Lj61;->f:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v2, v0, Lj61;->g:Ljava/lang/Object;

    .line 400
    .line 401
    const/4 v8, 0x5

    .line 402
    iput v8, v0, Lj61;->i:I

    .line 403
    .line 404
    invoke-virtual {v5}, Lr51;->f()Lnc1;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    move-object v15, v2

    .line 409
    move-object/from16 p1, v3

    .line 410
    .line 411
    invoke-interface {v8}, Lnc1;->b()J

    .line 412
    .line 413
    .line 414
    move-result-wide v2

    .line 415
    new-instance v8, Lf61;

    .line 416
    .line 417
    invoke-direct {v8, v13, v14}, Lf61;-><init>(Lnr0;Lik;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5, v2, v3, v8, v0}, Lr51;->n(JLww;Ly9;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    if-ne v2, v4, :cond_b

    .line 425
    .line 426
    goto/16 :goto_b

    .line 427
    .line 428
    :cond_b
    move-object v3, v5

    .line 429
    move-object v5, v13

    .line 430
    :goto_7
    check-cast v2, Lnr0;

    .line 431
    .line 432
    if-nez v2, :cond_d

    .line 433
    .line 434
    iget-wide v2, v5, Lnr0;->c:J

    .line 435
    .line 436
    iget-boolean v0, v1, Ln;->x:Z

    .line 437
    .line 438
    if-eqz v0, :cond_c

    .line 439
    .line 440
    iget-object v0, v1, Ln;->y:Lhw;

    .line 441
    .line 442
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    :cond_c
    return-object v19

    .line 446
    :cond_d
    sget-object v8, Lm61;->a:Lnq;

    .line 447
    .line 448
    new-instance v8, Le;

    .line 449
    .line 450
    const/16 v13, 0xc

    .line 451
    .line 452
    invoke-direct {v8, v15, v7, v14, v13}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 453
    .line 454
    .line 455
    const/4 v13, 0x1

    .line 456
    invoke-static {v10, v14, v8, v13}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    sget-object v13, Lm61;->a:Lnq;

    .line 461
    .line 462
    if-eq v6, v13, :cond_e

    .line 463
    .line 464
    new-instance v13, Lh61;

    .line 465
    .line 466
    const/16 v18, 0x1

    .line 467
    .line 468
    move-object/from16 v16, v2

    .line 469
    .line 470
    move-object v15, v7

    .line 471
    move-object/from16 v17, v14

    .line 472
    .line 473
    move-object v14, v6

    .line 474
    invoke-direct/range {v13 .. v18}, Lh61;-><init>(Lbg;Lhs0;Lnr0;Lik;I)V

    .line 475
    .line 476
    .line 477
    move-object/from16 v14, v17

    .line 478
    .line 479
    invoke-static {v10, v8, v13}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 480
    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_e
    move-object v15, v7

    .line 484
    :goto_8
    if-nez p1, :cond_10

    .line 485
    .line 486
    iput-object v8, v0, Lj61;->j:Ljava/lang/Object;

    .line 487
    .line 488
    iput-object v5, v0, Lj61;->f:Ljava/lang/Object;

    .line 489
    .line 490
    iput-object v14, v0, Lj61;->g:Ljava/lang/Object;

    .line 491
    .line 492
    const/4 v2, 0x6

    .line 493
    iput v2, v0, Lj61;->i:I

    .line 494
    .line 495
    invoke-static {v3, v9, v0}, Lm61;->g(Lr51;Ljr0;Ly9;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    if-ne v0, v4, :cond_f

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_f
    move-object v2, v5

    .line 503
    :goto_9
    move-object v3, v0

    .line 504
    check-cast v3, Lnr0;

    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_10
    iput-object v3, v0, Lj61;->j:Ljava/lang/Object;

    .line 508
    .line 509
    iput-object v8, v0, Lj61;->f:Ljava/lang/Object;

    .line 510
    .line 511
    iput-object v5, v0, Lj61;->g:Ljava/lang/Object;

    .line 512
    .line 513
    iput-object v2, v0, Lj61;->h:Lnr0;

    .line 514
    .line 515
    const/4 v6, 0x7

    .line 516
    iput v6, v0, Lj61;->i:I

    .line 517
    .line 518
    invoke-static {v3, v9, v0}, Lm61;->f(Lr51;Ljr0;Ly9;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v6

    .line 522
    if-ne v6, v4, :cond_11

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_11
    :goto_a
    check-cast v6, Lsb0;

    .line 526
    .line 527
    invoke-static {v6, v12}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v7

    .line 531
    if-eqz v7, :cond_13

    .line 532
    .line 533
    iget-wide v1, v2, Lnr0;->c:J

    .line 534
    .line 535
    new-instance v5, Lok0;

    .line 536
    .line 537
    invoke-direct {v5, v1, v2}, Lok0;-><init>(J)V

    .line 538
    .line 539
    .line 540
    move-object/from16 v1, p1

    .line 541
    .line 542
    invoke-interface {v1, v5}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    iput-object v8, v0, Lj61;->j:Ljava/lang/Object;

    .line 546
    .line 547
    iput-object v14, v0, Lj61;->f:Ljava/lang/Object;

    .line 548
    .line 549
    iput-object v14, v0, Lj61;->g:Ljava/lang/Object;

    .line 550
    .line 551
    iput-object v14, v0, Lj61;->h:Lnr0;

    .line 552
    .line 553
    const/16 v1, 0x8

    .line 554
    .line 555
    iput v1, v0, Lj61;->i:I

    .line 556
    .line 557
    invoke-static {v3, v0}, Lm61;->a(Lr51;Ly9;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    if-ne v0, v4, :cond_12

    .line 562
    .line 563
    :goto_b
    return-object v4

    .line 564
    :cond_12
    move-object v0, v8

    .line 565
    :goto_c
    new-instance v1, Li61;

    .line 566
    .line 567
    const/4 v8, 0x5

    .line 568
    invoke-direct {v1, v15, v14, v8}, Li61;-><init>(Lhs0;Lik;I)V

    .line 569
    .line 570
    .line 571
    invoke-static {v10, v0, v1}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 572
    .line 573
    .line 574
    return-object v19

    .line 575
    :cond_13
    instance-of v0, v6, Lqb0;

    .line 576
    .line 577
    if-eqz v0, :cond_14

    .line 578
    .line 579
    check-cast v6, Lqb0;

    .line 580
    .line 581
    iget-object v3, v6, Lqb0;->a:Lnr0;

    .line 582
    .line 583
    move-object v2, v5

    .line 584
    goto :goto_d

    .line 585
    :cond_14
    instance-of v0, v6, Lpb0;

    .line 586
    .line 587
    if-eqz v0, :cond_17

    .line 588
    .line 589
    move-object v2, v5

    .line 590
    move-object v3, v14

    .line 591
    :goto_d
    if-eqz v3, :cond_15

    .line 592
    .line 593
    invoke-virtual {v3}, Lnr0;->a()V

    .line 594
    .line 595
    .line 596
    new-instance v0, Li61;

    .line 597
    .line 598
    const/4 v1, 0x3

    .line 599
    invoke-direct {v0, v15, v14, v1}, Li61;-><init>(Lhs0;Lik;I)V

    .line 600
    .line 601
    .line 602
    invoke-static {v10, v8, v0}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 603
    .line 604
    .line 605
    iget-wide v0, v3, Lnr0;->c:J

    .line 606
    .line 607
    new-instance v2, Lok0;

    .line 608
    .line 609
    invoke-direct {v2, v0, v1}, Lok0;-><init>(J)V

    .line 610
    .line 611
    .line 612
    invoke-interface {v11, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    return-object v19

    .line 616
    :cond_15
    new-instance v0, Li61;

    .line 617
    .line 618
    const/4 v3, 0x4

    .line 619
    invoke-direct {v0, v15, v14, v3}, Li61;-><init>(Lhs0;Lik;I)V

    .line 620
    .line 621
    .line 622
    invoke-static {v10, v8, v0}, Lm61;->e(Lyk;Lc40;Lww;)Lr31;

    .line 623
    .line 624
    .line 625
    iget-wide v2, v2, Lnr0;->c:J

    .line 626
    .line 627
    iget-boolean v0, v1, Ln;->x:Z

    .line 628
    .line 629
    if-eqz v0, :cond_16

    .line 630
    .line 631
    iget-object v0, v1, Ln;->y:Lhw;

    .line 632
    .line 633
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    :cond_16
    return-object v19

    .line 637
    :cond_17
    invoke-static {}, Lxc;->j()V

    .line 638
    .line 639
    .line 640
    return-object v20

    .line 641
    :cond_18
    return-object v19

    .line 642
    :cond_19
    invoke-static {}, Lxc;->j()V

    .line 643
    .line 644
    .line 645
    return-object v20

    .line 646
    nop

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
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
