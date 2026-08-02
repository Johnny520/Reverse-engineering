.class public final Lqi1;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Ly62;

.field public m:Ly62;

.field public n:I

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lz62;

.field public final synthetic r:Lo72;

.field public final synthetic s:Lo72;

.field public final synthetic t:F

.field public final synthetic u:Lsi1;

.field public final synthetic v:F

.field public final synthetic w:Lim2;


# direct methods
.method public constructor <init>(Lz62;Lo72;Lo72;FLsi1;FLim2;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqi1;->q:Lz62;

    .line 2
    .line 3
    iput-object p2, p0, Lqi1;->r:Lo72;

    .line 4
    .line 5
    iput-object p3, p0, Lqi1;->s:Lo72;

    .line 6
    .line 7
    iput p4, p0, Lqi1;->t:F

    .line 8
    .line 9
    iput-object p5, p0, Lqi1;->u:Lsi1;

    .line 10
    .line 11
    iput p6, p0, Lqi1;->v:F

    .line 12
    .line 13
    iput-object p7, p0, Lqi1;->w:Lim2;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ltw2;-><init>(ILt00;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lgm2;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lqi1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lqi1;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lqi1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 9

    .line 1
    new-instance v0, Lqi1;

    .line 2
    .line 3
    iget v6, p0, Lqi1;->v:F

    .line 4
    .line 5
    iget-object v7, p0, Lqi1;->w:Lim2;

    .line 6
    .line 7
    iget-object v1, p0, Lqi1;->q:Lz62;

    .line 8
    .line 9
    iget-object v2, p0, Lqi1;->r:Lo72;

    .line 10
    .line 11
    iget-object v3, p0, Lqi1;->s:Lo72;

    .line 12
    .line 13
    iget v4, p0, Lqi1;->t:F

    .line 14
    .line 15
    iget-object v5, p0, Lqi1;->u:Lsi1;

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    invoke-direct/range {v0 .. v8}, Lqi1;-><init>(Lz62;Lo72;Lo72;FLsi1;FLim2;Lt00;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, v0, Lqi1;->p:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lqi1;->o:I

    .line 4
    .line 5
    iget-object v1, v7, Lqi1;->s:Lo72;

    .line 6
    .line 7
    const/4 v15, 0x0

    .line 8
    iget-object v2, v7, Lqi1;->q:Lz62;

    .line 9
    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v6, v7, Lqi1;->r:Lo72;

    .line 14
    .line 15
    sget-object v8, Lk20;->h:Lk20;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v5, :cond_2

    .line 20
    .line 21
    if-eq v0, v4, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    iget-object v0, v7, Lqi1;->m:Ly62;

    .line 26
    .line 27
    iget-object v9, v7, Lqi1;->l:Ly62;

    .line 28
    .line 29
    iget-object v10, v7, Lqi1;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v10, Lgm2;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v13, v0

    .line 37
    move/from16 v23, v3

    .line 38
    .line 39
    move v12, v5

    .line 40
    move-object v14, v8

    .line 41
    move-object v8, v10

    .line 42
    move-object/from16 v0, p1

    .line 43
    .line 44
    move v10, v4

    .line 45
    move-object v4, v6

    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v15

    .line 54
    :cond_1
    iget v0, v7, Lqi1;->n:I

    .line 55
    .line 56
    iget-object v9, v7, Lqi1;->l:Ly62;

    .line 57
    .line 58
    iget-object v10, v7, Lqi1;->p:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v10, Lgm2;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v11, v2

    .line 66
    move-object v3, v8

    .line 67
    move-object v13, v9

    .line 68
    move-object v8, v10

    .line 69
    move-object v10, v1

    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_2
    iget-object v0, v7, Lqi1;->m:Ly62;

    .line 73
    .line 74
    iget-object v9, v7, Lqi1;->l:Ly62;

    .line 75
    .line 76
    iget-object v10, v7, Lqi1;->p:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v10, Lgm2;

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v13, v0

    .line 84
    move/from16 v23, v3

    .line 85
    .line 86
    move v12, v5

    .line 87
    move-object v14, v8

    .line 88
    move-object v8, v10

    .line 89
    move-object/from16 v0, p1

    .line 90
    .line 91
    move v10, v4

    .line 92
    move-object v4, v6

    .line 93
    goto/16 :goto_8

    .line 94
    .line 95
    :cond_3
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v7, Lqi1;->p:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lgm2;

    .line 101
    .line 102
    new-instance v9, Ly62;

    .line 103
    .line 104
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-boolean v5, v9, Ly62;->h:Z

    .line 108
    .line 109
    move-object v13, v9

    .line 110
    :goto_0
    iget-boolean v9, v13, Ly62;->h:Z

    .line 111
    .line 112
    sget-object v22, La83;->a:La83;

    .line 113
    .line 114
    if-eqz v9, :cond_c

    .line 115
    .line 116
    const/4 v9, 0x0

    .line 117
    iput-boolean v9, v13, Ly62;->h:Z

    .line 118
    .line 119
    iget v9, v2, Lz62;->h:F

    .line 120
    .line 121
    iget-object v10, v6, Lo72;->i:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v10, Lid;

    .line 124
    .line 125
    iget-object v10, v10, Lid;->i:Lnx1;

    .line 126
    .line 127
    invoke-virtual {v10}, Lnx1;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    check-cast v10, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    sub-float/2addr v9, v10

    .line 138
    iget-object v10, v1, Lo72;->i:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v10, Loi1;

    .line 141
    .line 142
    iget-boolean v10, v10, Loi1;->c:Z

    .line 143
    .line 144
    iget-object v11, v7, Lqi1;->u:Lsi1;

    .line 145
    .line 146
    if-nez v10, :cond_4

    .line 147
    .line 148
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    iget v12, v7, Lqi1;->t:F

    .line 153
    .line 154
    cmpg-float v10, v10, v12

    .line 155
    .line 156
    if-gez v10, :cond_5

    .line 157
    .line 158
    :cond_4
    move/from16 v23, v3

    .line 159
    .line 160
    move v10, v4

    .line 161
    move v12, v5

    .line 162
    move-object v4, v6

    .line 163
    move-object v14, v8

    .line 164
    move-object v8, v0

    .line 165
    goto/16 :goto_6

    .line 166
    .line 167
    :cond_5
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    mul-float/2addr v9, v12

    .line 172
    invoke-virtual {v11, v0, v9}, Lsi1;->e(Lgm2;F)F

    .line 173
    .line 174
    .line 175
    iget-object v10, v6, Lo72;->i:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v10, Lid;

    .line 178
    .line 179
    iget-object v11, v10, Lid;->i:Lnx1;

    .line 180
    .line 181
    invoke-virtual {v11}, Lnx1;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    check-cast v11, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    add-float/2addr v11, v9

    .line 192
    invoke-static {v10, v11}, Ls11;->D(Lid;F)Lid;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    iput-object v9, v6, Lo72;->i:Ljava/lang/Object;

    .line 197
    .line 198
    iget v10, v2, Lz62;->h:F

    .line 199
    .line 200
    iget-object v9, v9, Lid;->i:Lnx1;

    .line 201
    .line 202
    invoke-virtual {v9}, Lnx1;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    check-cast v9, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    sub-float/2addr v10, v9

    .line 213
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    iget v10, v7, Lqi1;->v:F

    .line 218
    .line 219
    div-float/2addr v9, v10

    .line 220
    invoke-static {v9}, Lgf1;->Q(F)I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    const/16 v10, 0x64

    .line 225
    .line 226
    if-le v9, v10, :cond_6

    .line 227
    .line 228
    move v9, v10

    .line 229
    :cond_6
    iget-object v10, v6, Lo72;->i:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v10, Lid;

    .line 232
    .line 233
    iget v11, v2, Lz62;->h:F

    .line 234
    .line 235
    new-instance v20, Lh9;

    .line 236
    .line 237
    const/4 v14, 0x2

    .line 238
    move v12, v9

    .line 239
    iget-object v9, v7, Lqi1;->u:Lsi1;

    .line 240
    .line 241
    move/from16 v16, v12

    .line 242
    .line 243
    iget-object v12, v7, Lqi1;->w:Lim2;

    .line 244
    .line 245
    move-object v3, v8

    .line 246
    move v5, v11

    .line 247
    move-object/from16 v8, v20

    .line 248
    .line 249
    move-object v11, v2

    .line 250
    move-object v2, v10

    .line 251
    move-object v10, v1

    .line 252
    move/from16 v1, v16

    .line 253
    .line 254
    invoke-direct/range {v8 .. v14}, Lh9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v18, v9

    .line 258
    .line 259
    iput-object v0, v7, Lqi1;->p:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v13, v7, Lqi1;->l:Ly62;

    .line 262
    .line 263
    iput-object v15, v7, Lqi1;->m:Ly62;

    .line 264
    .line 265
    iput v1, v7, Lqi1;->n:I

    .line 266
    .line 267
    iput v4, v7, Lqi1;->o:I

    .line 268
    .line 269
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v8, Lz62;

    .line 273
    .line 274
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 275
    .line 276
    .line 277
    iget-object v9, v2, Lid;->i:Lnx1;

    .line 278
    .line 279
    invoke-virtual {v9}, Lnx1;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    check-cast v9, Ljava/lang/Number;

    .line 284
    .line 285
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    iput v9, v8, Lz62;->h:F

    .line 290
    .line 291
    new-instance v9, Ljava/lang/Float;

    .line 292
    .line 293
    invoke-direct {v9, v5}, Ljava/lang/Float;-><init>(F)V

    .line 294
    .line 295
    .line 296
    sget-object v5, Lhd0;->b:Lc80;

    .line 297
    .line 298
    invoke-static {v1, v5, v4}, Lup0;->J(ILgd0;I)Lm43;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    new-instance v16, Lpc;

    .line 303
    .line 304
    const/16 v21, 0x7

    .line 305
    .line 306
    move-object/from16 v19, v0

    .line 307
    .line 308
    move-object/from16 v17, v8

    .line 309
    .line 310
    invoke-direct/range {v16 .. v21}, Lpc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v0, v16

    .line 314
    .line 315
    move-object/from16 v8, v19

    .line 316
    .line 317
    invoke-static {v2, v9, v5, v0, v7}, Lte;->n(Lid;Ljava/lang/Float;Lfj0;Lin0;Ltw2;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-ne v0, v3, :cond_7

    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_7
    move-object/from16 v0, v22

    .line 325
    .line 326
    :goto_1
    if-ne v0, v3, :cond_8

    .line 327
    .line 328
    move-object v14, v3

    .line 329
    goto/16 :goto_7

    .line 330
    .line 331
    :cond_8
    move v0, v1

    .line 332
    :goto_2
    iget-boolean v1, v13, Ly62;->h:Z

    .line 333
    .line 334
    if-nez v1, :cond_a

    .line 335
    .line 336
    const-wide/16 v16, 0x32

    .line 337
    .line 338
    int-to-long v1, v0

    .line 339
    sub-long v1, v16, v1

    .line 340
    .line 341
    iput-object v8, v7, Lqi1;->p:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object v13, v7, Lqi1;->l:Ly62;

    .line 344
    .line 345
    iput-object v13, v7, Lqi1;->m:Ly62;

    .line 346
    .line 347
    const/4 v0, 0x3

    .line 348
    iput v0, v7, Lqi1;->o:I

    .line 349
    .line 350
    move/from16 v23, v0

    .line 351
    .line 352
    iget-object v0, v7, Lqi1;->u:Lsi1;

    .line 353
    .line 354
    move-object v5, v3

    .line 355
    iget-object v3, v7, Lqi1;->w:Lim2;

    .line 356
    .line 357
    move-object v14, v5

    .line 358
    const/4 v12, 0x1

    .line 359
    move-object/from16 v24, v10

    .line 360
    .line 361
    move v10, v4

    .line 362
    move-object v4, v6

    .line 363
    move-wide v5, v1

    .line 364
    move-object/from16 v1, v24

    .line 365
    .line 366
    move-object v2, v11

    .line 367
    invoke-static/range {v0 .. v7}, Lsi1;->d(Lsi1;Lo72;Lz62;Lim2;Lo72;JLu00;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-ne v0, v14, :cond_9

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_9
    move-object v9, v13

    .line 375
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    iput-boolean v0, v13, Ly62;->h:Z

    .line 382
    .line 383
    :goto_4
    move-object v6, v4

    .line 384
    move-object v0, v8

    .line 385
    move-object v13, v9

    .line 386
    move v4, v10

    .line 387
    move v5, v12

    .line 388
    move-object v8, v14

    .line 389
    :goto_5
    move/from16 v3, v23

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_a
    move-object v1, v10

    .line 394
    const/16 v23, 0x3

    .line 395
    .line 396
    move-object v0, v8

    .line 397
    move-object v2, v11

    .line 398
    const/4 v5, 0x1

    .line 399
    move-object v8, v3

    .line 400
    goto :goto_5

    .line 401
    :goto_6
    invoke-virtual {v11, v8, v9}, Lsi1;->e(Lgm2;F)F

    .line 402
    .line 403
    .line 404
    iput-object v8, v7, Lqi1;->p:Ljava/lang/Object;

    .line 405
    .line 406
    iput-object v13, v7, Lqi1;->l:Ly62;

    .line 407
    .line 408
    iput-object v13, v7, Lqi1;->m:Ly62;

    .line 409
    .line 410
    iput v12, v7, Lqi1;->o:I

    .line 411
    .line 412
    iget-object v0, v7, Lqi1;->u:Lsi1;

    .line 413
    .line 414
    iget-object v3, v7, Lqi1;->w:Lim2;

    .line 415
    .line 416
    const-wide/16 v5, 0x32

    .line 417
    .line 418
    invoke-static/range {v0 .. v7}, Lsi1;->d(Lsi1;Lo72;Lz62;Lim2;Lo72;JLu00;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    if-ne v0, v14, :cond_b

    .line 423
    .line 424
    :goto_7
    return-object v14

    .line 425
    :cond_b
    move-object v9, v13

    .line 426
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 427
    .line 428
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    iput-boolean v0, v13, Ly62;->h:Z

    .line 433
    .line 434
    move-object/from16 v7, p0

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_c
    return-object v22
.end method
