.class public final Lm/j1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lgg/q;

.field public i:Lgg/q;

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lgg/r;

.field public final synthetic n:Lgg/u;

.field public final synthetic o:Lgg/u;

.field public final synthetic p:F

.field public final synthetic q:Lm/l1;

.field public final synthetic r:F

.field public final synthetic s:Lm/o2;


# direct methods
.method public constructor <init>(Lgg/r;Lgg/u;Lgg/u;FLm/l1;FLm/o2;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/j1;->m:Lgg/r;

    .line 2
    .line 3
    iput-object p2, p0, Lm/j1;->n:Lgg/u;

    .line 4
    .line 5
    iput-object p3, p0, Lm/j1;->o:Lgg/u;

    .line 6
    .line 7
    iput p4, p0, Lm/j1;->p:F

    .line 8
    .line 9
    iput-object p5, p0, Lm/j1;->q:Lm/l1;

    .line 10
    .line 11
    iput p6, p0, Lm/j1;->r:F

    .line 12
    .line 13
    iput-object p7, p0, Lm/j1;->s:Lm/o2;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lyf/i;-><init>(ILwf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    new-instance v0, Lm/j1;

    .line 2
    .line 3
    iget v6, p0, Lm/j1;->r:F

    .line 4
    .line 5
    iget-object v7, p0, Lm/j1;->s:Lm/o2;

    .line 6
    .line 7
    iget-object v1, p0, Lm/j1;->m:Lgg/r;

    .line 8
    .line 9
    iget-object v2, p0, Lm/j1;->n:Lgg/u;

    .line 10
    .line 11
    iget-object v3, p0, Lm/j1;->o:Lgg/u;

    .line 12
    .line 13
    iget v4, p0, Lm/j1;->p:F

    .line 14
    .line 15
    iget-object v5, p0, Lm/j1;->q:Lm/l1;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lm/j1;-><init>(Lgg/r;Lgg/u;Lgg/u;FLm/l1;FLm/o2;Lwf/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lm/j1;->l:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm/m2;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm/j1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/j1;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lm/j1;->k:I

    .line 4
    .line 5
    iget-object v1, v7, Lm/j1;->o:Lgg/u;

    .line 6
    .line 7
    iget-object v2, v7, Lm/j1;->m:Lgg/r;

    .line 8
    .line 9
    const/4 v15, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    iget-object v4, v7, Lm/j1;->n:Lgg/u;

    .line 13
    .line 14
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    if-eq v0, v3, :cond_2

    .line 19
    .line 20
    if-eq v0, v6, :cond_1

    .line 21
    .line 22
    if-ne v0, v15, :cond_0

    .line 23
    .line 24
    iget-object v0, v7, Lm/j1;->i:Lgg/q;

    .line 25
    .line 26
    iget-object v8, v7, Lm/j1;->h:Lgg/q;

    .line 27
    .line 28
    iget-object v9, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v9, Lm/m2;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v13, v5

    .line 36
    move v11, v6

    .line 37
    move-object v12, v9

    .line 38
    move v9, v3

    .line 39
    move-object v3, v8

    .line 40
    move-object v8, v0

    .line 41
    move-object/from16 v0, p1

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :cond_1
    iget v0, v7, Lm/j1;->j:I

    .line 53
    .line 54
    iget-object v8, v7, Lm/j1;->h:Lgg/q;

    .line 55
    .line 56
    iget-object v9, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lm/m2;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v18, v1

    .line 64
    .line 65
    move-object/from16 v19, v2

    .line 66
    .line 67
    move-object v13, v5

    .line 68
    move-object v5, v7

    .line 69
    move-object v12, v9

    .line 70
    move v9, v3

    .line 71
    move-object v7, v4

    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_2
    iget-object v0, v7, Lm/j1;->i:Lgg/q;

    .line 75
    .line 76
    iget-object v8, v7, Lm/j1;->h:Lgg/q;

    .line 77
    .line 78
    iget-object v9, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v9, Lm/m2;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v14, v0

    .line 86
    move-object v13, v5

    .line 87
    move v11, v6

    .line 88
    move-object v12, v9

    .line 89
    move-object/from16 v0, p1

    .line 90
    .line 91
    move v9, v3

    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lm/m2;

    .line 100
    .line 101
    new-instance v8, Lgg/q;

    .line 102
    .line 103
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-boolean v3, v8, Lgg/q;->g:Z

    .line 107
    .line 108
    :goto_0
    move-object v13, v8

    .line 109
    :goto_1
    iget-boolean v8, v13, Lgg/q;->g:Z

    .line 110
    .line 111
    sget-object v16, Lsf/n;->a:Lsf/n;

    .line 112
    .line 113
    if-eqz v8, :cond_c

    .line 114
    .line 115
    const/4 v8, 0x0

    .line 116
    iput-boolean v8, v13, Lgg/q;->g:Z

    .line 117
    .line 118
    iget v8, v2, Lgg/r;->g:F

    .line 119
    .line 120
    iget-object v9, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v9, Li/l;

    .line 123
    .line 124
    iget-object v9, v9, Li/l;->h:Li0/j1;

    .line 125
    .line 126
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    sub-float/2addr v8, v9

    .line 137
    iget-object v9, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v9, Lm/h1;

    .line 140
    .line 141
    iget-boolean v9, v9, Lm/h1;->c:Z

    .line 142
    .line 143
    iget-object v10, v7, Lm/j1;->q:Lm/l1;

    .line 144
    .line 145
    if-nez v9, :cond_4

    .line 146
    .line 147
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    iget v11, v7, Lm/j1;->p:F

    .line 152
    .line 153
    cmpg-float v9, v9, v11

    .line 154
    .line 155
    if-gez v9, :cond_5

    .line 156
    .line 157
    :cond_4
    move-object v12, v0

    .line 158
    move v9, v3

    .line 159
    move v11, v6

    .line 160
    move-object v14, v13

    .line 161
    move-object v13, v5

    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_5
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    mul-float/2addr v8, v11

    .line 169
    invoke-virtual {v10, v0, v8}, Lm/l1;->e(Lm/m2;F)F

    .line 170
    .line 171
    .line 172
    iget-object v9, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v9, Li/l;

    .line 175
    .line 176
    iget-object v10, v9, Li/l;->h:Li0/j1;

    .line 177
    .line 178
    invoke-virtual {v10}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    add-float/2addr v10, v8

    .line 189
    invoke-static {v9, v10}, Li/d;->j(Li/l;F)Li/l;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iput-object v8, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 194
    .line 195
    iget v9, v2, Lgg/r;->g:F

    .line 196
    .line 197
    iget-object v8, v8, Li/l;->h:Li0/j1;

    .line 198
    .line 199
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    sub-float/2addr v9, v8

    .line 210
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    iget v9, v7, Lm/j1;->r:F

    .line 215
    .line 216
    div-float/2addr v8, v9

    .line 217
    invoke-static {v8}, Lig/a;->X(F)I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    const/16 v9, 0x64

    .line 222
    .line 223
    if-le v8, v9, :cond_6

    .line 224
    .line 225
    move v8, v9

    .line 226
    :cond_6
    iget-object v9, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v9, Li/l;

    .line 229
    .line 230
    iget v10, v2, Lgg/r;->g:F

    .line 231
    .line 232
    move v11, v8

    .line 233
    new-instance v8, Leb/o;

    .line 234
    .line 235
    const/4 v14, 0x3

    .line 236
    move-object v12, v9

    .line 237
    iget-object v9, v7, Lm/j1;->q:Lm/l1;

    .line 238
    .line 239
    move-object/from16 v17, v12

    .line 240
    .line 241
    iget-object v12, v7, Lm/j1;->s:Lm/o2;

    .line 242
    .line 243
    move v3, v10

    .line 244
    move-object v10, v1

    .line 245
    move v1, v11

    .line 246
    move-object v11, v2

    .line 247
    move-object/from16 v2, v17

    .line 248
    .line 249
    invoke-direct/range {v8 .. v14}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v18, v13

    .line 253
    .line 254
    move-object v13, v8

    .line 255
    move-object/from16 v8, v18

    .line 256
    .line 257
    move-object/from16 v18, v10

    .line 258
    .line 259
    move-object/from16 v19, v11

    .line 260
    .line 261
    iput-object v0, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v8, v7, Lm/j1;->h:Lgg/q;

    .line 264
    .line 265
    const/4 v10, 0x0

    .line 266
    iput-object v10, v7, Lm/j1;->i:Lgg/q;

    .line 267
    .line 268
    iput v1, v7, Lm/j1;->j:I

    .line 269
    .line 270
    iput v6, v7, Lm/j1;->k:I

    .line 271
    .line 272
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v10, Lgg/r;

    .line 276
    .line 277
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iget-object v11, v2, Li/l;->h:Li0/j1;

    .line 281
    .line 282
    invoke-virtual {v11}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    check-cast v11, Ljava/lang/Number;

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    iput v11, v10, Lgg/r;->g:F

    .line 293
    .line 294
    new-instance v11, Ljava/lang/Float;

    .line 295
    .line 296
    invoke-direct {v11, v3}, Ljava/lang/Float;-><init>(F)V

    .line 297
    .line 298
    .line 299
    sget-object v3, Li/x;->b:Lg1/d;

    .line 300
    .line 301
    invoke-static {v1, v6, v3}, Li/d;->p(IILi/v;)Li/l1;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    move-object v12, v11

    .line 306
    move-object v11, v9

    .line 307
    new-instance v9, Lc9/k;

    .line 308
    .line 309
    const/16 v14, 0x9

    .line 310
    .line 311
    move-object/from16 v20, v12

    .line 312
    .line 313
    move-object v12, v0

    .line 314
    move-object/from16 v0, v20

    .line 315
    .line 316
    invoke-direct/range {v9 .. v14}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    move v11, v1

    .line 320
    move-object v1, v0

    .line 321
    move-object v0, v2

    .line 322
    move-object v2, v3

    .line 323
    const/4 v3, 0x1

    .line 324
    move-object v13, v5

    .line 325
    move-object v5, v7

    .line 326
    move-object v7, v4

    .line 327
    move-object v4, v9

    .line 328
    const/4 v9, 0x1

    .line 329
    invoke-static/range {v0 .. v5}, Li/d;->g(Li/l;Ljava/lang/Float;Li/k;ZLfg/l;Lyf/c;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-ne v0, v13, :cond_7

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_7
    move-object/from16 v0, v16

    .line 337
    .line 338
    :goto_2
    if-ne v0, v13, :cond_8

    .line 339
    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :cond_8
    move v0, v11

    .line 343
    :goto_3
    iget-boolean v1, v8, Lgg/q;->g:Z

    .line 344
    .line 345
    if-nez v1, :cond_a

    .line 346
    .line 347
    const-wide/16 v1, 0x32

    .line 348
    .line 349
    int-to-long v3, v0

    .line 350
    sub-long/2addr v1, v3

    .line 351
    iput-object v12, v5, Lm/j1;->l:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v8, v5, Lm/j1;->h:Lgg/q;

    .line 354
    .line 355
    iput-object v8, v5, Lm/j1;->i:Lgg/q;

    .line 356
    .line 357
    iput v15, v5, Lm/j1;->k:I

    .line 358
    .line 359
    iget-object v0, v5, Lm/j1;->q:Lm/l1;

    .line 360
    .line 361
    iget-object v3, v5, Lm/j1;->s:Lm/o2;

    .line 362
    .line 363
    move v11, v6

    .line 364
    move-object v4, v7

    .line 365
    move-object v7, v5

    .line 366
    move-wide v5, v1

    .line 367
    move-object/from16 v1, v18

    .line 368
    .line 369
    move-object/from16 v2, v19

    .line 370
    .line 371
    invoke-static/range {v0 .. v7}, Lm/l1;->d(Lm/l1;Lgg/u;Lgg/r;Lm/o2;Lgg/u;JLyf/c;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-ne v0, v13, :cond_9

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_9
    move-object v3, v8

    .line 379
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    iput-boolean v0, v8, Lgg/q;->g:Z

    .line 386
    .line 387
    move v6, v11

    .line 388
    move-object v0, v12

    .line 389
    move-object v5, v13

    .line 390
    move-object v13, v3

    .line 391
    move v3, v9

    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :cond_a
    move-object v4, v7

    .line 395
    move-object v7, v5

    .line 396
    move v3, v9

    .line 397
    move-object v0, v12

    .line 398
    move-object v5, v13

    .line 399
    move-object/from16 v1, v18

    .line 400
    .line 401
    move-object/from16 v2, v19

    .line 402
    .line 403
    goto/16 :goto_0

    .line 404
    .line 405
    :goto_5
    invoke-virtual {v10, v12, v8}, Lm/l1;->e(Lm/m2;F)F

    .line 406
    .line 407
    .line 408
    iput-object v12, v7, Lm/j1;->l:Ljava/lang/Object;

    .line 409
    .line 410
    iput-object v14, v7, Lm/j1;->h:Lgg/q;

    .line 411
    .line 412
    iput-object v14, v7, Lm/j1;->i:Lgg/q;

    .line 413
    .line 414
    iput v9, v7, Lm/j1;->k:I

    .line 415
    .line 416
    iget-object v0, v7, Lm/j1;->q:Lm/l1;

    .line 417
    .line 418
    iget-object v3, v7, Lm/j1;->s:Lm/o2;

    .line 419
    .line 420
    const-wide/16 v5, 0x32

    .line 421
    .line 422
    invoke-static/range {v0 .. v7}, Lm/l1;->d(Lm/l1;Lgg/u;Lgg/r;Lm/o2;Lgg/u;JLyf/c;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    if-ne v0, v13, :cond_b

    .line 427
    .line 428
    :goto_6
    return-object v13

    .line 429
    :cond_b
    move-object v8, v14

    .line 430
    :goto_7
    check-cast v0, Ljava/lang/Boolean;

    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    iput-boolean v0, v14, Lgg/q;->g:Z

    .line 437
    .line 438
    move-object/from16 v7, p0

    .line 439
    .line 440
    move v3, v9

    .line 441
    move v6, v11

    .line 442
    move-object v0, v12

    .line 443
    move-object v5, v13

    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_c
    return-object v16
.end method
