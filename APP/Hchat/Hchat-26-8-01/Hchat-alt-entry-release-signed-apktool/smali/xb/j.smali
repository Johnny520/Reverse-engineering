.class public final Lxb/j;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:Ls1/t;

.field public h:Ls1/k0;

.field public i:Lfg/p;

.field public j:Ls1/k0;

.field public k:Lgg/t;

.field public l:J

.field public m:J

.field public n:J

.field public o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lfg/l;

.field public final synthetic s:Lfg/p;

.field public final synthetic t:Lfg/a;

.field public final synthetic u:Lfg/l;


# direct methods
.method public constructor <init>(Lfg/l;Lfg/p;Lfg/a;Lfg/l;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb/j;->r:Lfg/l;

    .line 2
    .line 3
    iput-object p2, p0, Lxb/j;->s:Lfg/p;

    .line 4
    .line 5
    iput-object p3, p0, Lxb/j;->t:Lfg/a;

    .line 6
    .line 7
    iput-object p4, p0, Lxb/j;->u:Lfg/l;

    .line 8
    .line 9
    invoke-direct {p0, p5}, Lyf/h;-><init>(Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lxb/j;

    .line 2
    .line 3
    iget-object v3, p0, Lxb/j;->t:Lfg/a;

    .line 4
    .line 5
    iget-object v4, p0, Lxb/j;->u:Lfg/l;

    .line 6
    .line 7
    iget-object v1, p0, Lxb/j;->r:Lfg/l;

    .line 8
    .line 9
    iget-object v2, p0, Lxb/j;->s:Lfg/p;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lxb/j;-><init>(Lfg/l;Lfg/p;Lfg/a;Lfg/l;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lxb/j;->q:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxb/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxb/j;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lxb/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxb/j;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ls1/k0;

    .line 6
    .line 7
    iget v2, v0, Lxb/j;->p:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    sget-object v8, Lxf/a;->g:Lxf/a;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    if-eq v2, v6, :cond_2

    .line 19
    .line 20
    if-eq v2, v4, :cond_1

    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    iget-wide v1, v0, Lxb/j;->n:J

    .line 25
    .line 26
    iget-wide v9, v0, Lxb/j;->m:J

    .line 27
    .line 28
    iget v4, v0, Lxb/j;->o:I

    .line 29
    .line 30
    iget-wide v11, v0, Lxb/j;->l:J

    .line 31
    .line 32
    iget-object v6, v0, Lxb/j;->k:Lgg/t;

    .line 33
    .line 34
    iget-object v13, v0, Lxb/j;->j:Ls1/k0;

    .line 35
    .line 36
    iget-object v14, v0, Lxb/j;->i:Lfg/p;

    .line 37
    .line 38
    iget-object v15, v0, Lxb/j;->h:Ls1/k0;

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v3, p1

    .line 44
    .line 45
    move-wide/from16 v21, v1

    .line 46
    .line 47
    move-object v2, v13

    .line 48
    move-object v1, v15

    .line 49
    move-wide/from16 v23, v9

    .line 50
    .line 51
    move-object v9, v14

    .line 52
    move-wide v14, v11

    .line 53
    move-wide/from16 v10, v21

    .line 54
    .line 55
    move-wide/from16 v12, v23

    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    return-object v1

    .line 66
    :cond_1
    iget-object v2, v0, Lxb/j;->g:Ls1/t;

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v4, p1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v2, p1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, v0, Lxb/j;->q:Ljava/lang/Object;

    .line 84
    .line 85
    iput v6, v0, Lxb/j;->p:I

    .line 86
    .line 87
    sget-object v2, Ls1/l;->g:Ls1/l;

    .line 88
    .line 89
    invoke-static {v1, v5, v2, v0}, Lm/y2;->a(Ls1/k0;ZLs1/l;Lwf/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-ne v2, v8, :cond_4

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_4
    :goto_0
    check-cast v2, Ls1/t;

    .line 98
    .line 99
    iput-object v1, v0, Lxb/j;->q:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v2, v0, Lxb/j;->g:Ls1/t;

    .line 102
    .line 103
    iput v4, v0, Lxb/j;->p:I

    .line 104
    .line 105
    invoke-static {v1, v0, v4}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-ne v4, v8, :cond_5

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_5
    :goto_1
    check-cast v4, Ls1/t;

    .line 114
    .line 115
    iget-object v9, v0, Lxb/j;->r:Lfg/l;

    .line 116
    .line 117
    invoke-interface {v9, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    new-instance v4, Le1/b;

    .line 121
    .line 122
    const-wide/16 v9, 0x0

    .line 123
    .line 124
    invoke-direct {v4, v9, v10}, Le1/b;-><init>(J)V

    .line 125
    .line 126
    .line 127
    iget-object v9, v0, Lxb/j;->s:Lfg/p;

    .line 128
    .line 129
    invoke-interface {v9, v2, v4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget-wide v10, v2, Ls1/t;->a:J

    .line 133
    .line 134
    iget-object v2, v1, Ls1/k0;->l:Ls1/l0;

    .line 135
    .line 136
    iget-object v2, v2, Ls1/l0;->z:Ls1/k;

    .line 137
    .line 138
    iget-object v2, v2, Ls1/k;->a:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    move v12, v5

    .line 145
    :goto_2
    if-ge v12, v4, :cond_7

    .line 146
    .line 147
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    move-object v14, v13

    .line 152
    check-cast v14, Ls1/t;

    .line 153
    .line 154
    iget-wide v14, v14, Ls1/t;->a:J

    .line 155
    .line 156
    invoke-static {v14, v15, v10, v11}, Ls1/s;->e(JJ)Z

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    if-eqz v14, :cond_6

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    add-int/lit8 v12, v12, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_7
    move-object v13, v7

    .line 167
    :goto_3
    check-cast v13, Ls1/t;

    .line 168
    .line 169
    if-eqz v13, :cond_8

    .line 170
    .line 171
    iget-boolean v2, v13, Ls1/t;->d:Z

    .line 172
    .line 173
    if-ne v2, v6, :cond_8

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    move v6, v5

    .line 177
    :goto_4
    xor-int/lit8 v2, v6, 0x1

    .line 178
    .line 179
    if-nez v6, :cond_9

    .line 180
    .line 181
    goto/16 :goto_f

    .line 182
    .line 183
    :cond_9
    move-wide v12, v10

    .line 184
    :goto_5
    new-instance v4, Lgg/t;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-wide v10, v4, Lgg/t;->g:J

    .line 190
    .line 191
    move-object v6, v4

    .line 192
    move-wide v14, v12

    .line 193
    move v4, v2

    .line 194
    move-wide v12, v10

    .line 195
    move-object v2, v1

    .line 196
    :goto_6
    iput-object v7, v0, Lxb/j;->q:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v7, v0, Lxb/j;->g:Ls1/t;

    .line 199
    .line 200
    iput-object v1, v0, Lxb/j;->h:Ls1/k0;

    .line 201
    .line 202
    iput-object v9, v0, Lxb/j;->i:Lfg/p;

    .line 203
    .line 204
    iput-object v2, v0, Lxb/j;->j:Ls1/k0;

    .line 205
    .line 206
    iput-object v6, v0, Lxb/j;->k:Lgg/t;

    .line 207
    .line 208
    iput-wide v14, v0, Lxb/j;->l:J

    .line 209
    .line 210
    iput v4, v0, Lxb/j;->o:I

    .line 211
    .line 212
    iput-wide v12, v0, Lxb/j;->m:J

    .line 213
    .line 214
    iput-wide v10, v0, Lxb/j;->n:J

    .line 215
    .line 216
    iput v3, v0, Lxb/j;->p:I

    .line 217
    .line 218
    sget-object v3, Ls1/l;->h:Ls1/l;

    .line 219
    .line 220
    invoke-virtual {v2, v3, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    if-ne v3, v8, :cond_a

    .line 225
    .line 226
    :goto_7
    return-object v8

    .line 227
    :cond_a
    :goto_8
    check-cast v3, Ls1/k;

    .line 228
    .line 229
    iget-object v7, v3, Ls1/k;->a:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    move-object/from16 p1, v1

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    :goto_9
    if-ge v1, v5, :cond_c

    .line 239
    .line 240
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v16

    .line 244
    move/from16 v17, v1

    .line 245
    .line 246
    move-object/from16 v1, v16

    .line 247
    .line 248
    check-cast v1, Ls1/t;

    .line 249
    .line 250
    move-object/from16 v18, v2

    .line 251
    .line 252
    iget-wide v1, v1, Ls1/t;->a:J

    .line 253
    .line 254
    move/from16 v19, v4

    .line 255
    .line 256
    move/from16 v20, v5

    .line 257
    .line 258
    iget-wide v4, v6, Lgg/t;->g:J

    .line 259
    .line 260
    invoke-static {v1, v2, v4, v5}, Ls1/s;->e(JJ)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_b

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_b
    add-int/lit8 v1, v17, 0x1

    .line 268
    .line 269
    move-object/from16 v2, v18

    .line 270
    .line 271
    move/from16 v4, v19

    .line 272
    .line 273
    move/from16 v5, v20

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_c
    move-object/from16 v18, v2

    .line 277
    .line 278
    move/from16 v19, v4

    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    :goto_a
    move-object/from16 v1, v16

    .line 283
    .line 284
    check-cast v1, Ls1/t;

    .line 285
    .line 286
    if-eqz v1, :cond_12

    .line 287
    .line 288
    invoke-static {v1}, Ls1/s;->d(Ls1/t;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_10

    .line 293
    .line 294
    iget-object v2, v3, Ls1/k;->a:Ljava/lang/Object;

    .line 295
    .line 296
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    const/4 v4, 0x0

    .line 301
    :goto_b
    if-ge v4, v3, :cond_e

    .line 302
    .line 303
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    move-object v7, v5

    .line 308
    check-cast v7, Ls1/t;

    .line 309
    .line 310
    iget-boolean v7, v7, Ls1/t;->d:Z

    .line 311
    .line 312
    if-eqz v7, :cond_d

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_e
    const/4 v5, 0x0

    .line 319
    :goto_c
    check-cast v5, Ls1/t;

    .line 320
    .line 321
    if-nez v5, :cond_f

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_f
    iget-wide v1, v5, Ls1/t;->a:J

    .line 325
    .line 326
    iput-wide v1, v6, Lgg/t;->g:J

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_10
    iget-wide v2, v1, Ls1/t;->g:J

    .line 330
    .line 331
    iget-wide v4, v1, Ls1/t;->c:J

    .line 332
    .line 333
    invoke-static {v2, v3, v4, v5}, Le1/b;->b(JJ)Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-nez v2, :cond_11

    .line 338
    .line 339
    goto :goto_e

    .line 340
    :cond_11
    :goto_d
    move-object/from16 v1, p1

    .line 341
    .line 342
    move-object/from16 v2, v18

    .line 343
    .line 344
    move/from16 v4, v19

    .line 345
    .line 346
    const/4 v3, 0x3

    .line 347
    const/4 v5, 0x0

    .line 348
    const/4 v7, 0x0

    .line 349
    goto/16 :goto_6

    .line 350
    .line 351
    :cond_12
    const/4 v1, 0x0

    .line 352
    :goto_e
    if-eqz v1, :cond_13

    .line 353
    .line 354
    invoke-virtual {v1}, Ls1/t;->b()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_14

    .line 359
    .line 360
    :cond_13
    const/4 v7, 0x0

    .line 361
    goto :goto_f

    .line 362
    :cond_14
    invoke-static {v1}, Ls1/s;->d(Ls1/t;)Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-eqz v2, :cond_15

    .line 367
    .line 368
    move-object v7, v1

    .line 369
    goto :goto_f

    .line 370
    :cond_15
    const/4 v2, 0x0

    .line 371
    invoke-static {v1, v2}, Ls1/s;->h(Ls1/t;Z)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    new-instance v5, Le1/b;

    .line 376
    .line 377
    invoke-direct {v5, v3, v4}, Le1/b;-><init>(J)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v9, v1, v5}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    iget-wide v10, v1, Ls1/t;->a:J

    .line 384
    .line 385
    move-object/from16 v1, p1

    .line 386
    .line 387
    move v5, v2

    .line 388
    move-wide v12, v14

    .line 389
    move/from16 v2, v19

    .line 390
    .line 391
    const/4 v3, 0x3

    .line 392
    const/4 v7, 0x0

    .line 393
    goto/16 :goto_5

    .line 394
    .line 395
    :goto_f
    if-nez v7, :cond_16

    .line 396
    .line 397
    iget-object v1, v0, Lxb/j;->t:Lfg/a;

    .line 398
    .line 399
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    goto :goto_10

    .line 403
    :cond_16
    iget-object v1, v0, Lxb/j;->u:Lfg/l;

    .line 404
    .line 405
    invoke-interface {v1, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    :goto_10
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 409
    .line 410
    return-object v1
.end method
