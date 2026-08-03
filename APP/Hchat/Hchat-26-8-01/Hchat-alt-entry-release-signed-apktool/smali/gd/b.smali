.class public final Lgd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lh6/f;


# instance fields
.field public final a:Lud/e;

.field public final b:Lbc/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lac/p;->p()Lh6/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    iput v1, v0, Lh6/g;->c:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lh6/g;->i:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Lh6/g;->a()Lh6/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lgd/b;->c:Lh6/f;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lud/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgd/b;->a:Lud/e;

    .line 5
    .line 6
    iget-object p1, p1, Lud/e;->k:Lud/u;

    .line 7
    .line 8
    iget-object p1, p1, Lud/u;->a:Lbc/g;

    .line 9
    .line 10
    iput-object p1, p0, Lgd/b;->b:Lbc/g;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lfd/a;Lqd/j;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lfc/f;

    .line 2
    .line 3
    iget-object v1, p0, Lgd/b;->b:Lbc/g;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfc/f;-><init>(Lbc/g;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final b(Lud/e;Lfd/a;)Lhd/a;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Lgd/b;->b:Lbc/g;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lfd/a;

    .line 12
    .line 13
    invoke-direct {v2, v0, v3}, Lfd/a;-><init>(Lud/e;Lbc/g;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v4, Lfd/a;

    .line 18
    .line 19
    invoke-direct {v4, v0, v2}, Lfd/a;-><init>(Lud/e;Lfd/a;)V

    .line 20
    .line 21
    .line 22
    move-object v2, v4

    .line 23
    :goto_0
    iget-object v4, v0, Lud/e;->m:Lod/a;

    .line 24
    .line 25
    new-instance v5, Lhd/a;

    .line 26
    .line 27
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lod/a;->j()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v5, v6}, Lhd/a;->Z(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lod/a;->n()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-virtual {v4}, Lod/a;->f()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0}, Lud/e;->c0()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v4, v0, Lud/e;->o:Lb5/k;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-object v4, v0, Lud/e;->o:Lb5/k;

    .line 59
    .line 60
    iget v4, v4, Lb5/k;->b:I

    .line 61
    .line 62
    iget-object v4, v0, Lud/e;->p:Lqd/j;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    sget-object v6, Lqd/j;->k:Lqd/e;

    .line 67
    .line 68
    invoke-virtual {v4, v6}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_3

    .line 73
    .line 74
    sget-object v6, Lmd/a;->v:Lmd/a;

    .line 75
    .line 76
    iget-object v7, v0, Lmd/e;->g:Lmd/f;

    .line 77
    .line 78
    invoke-virtual {v7, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1, v2, v4}, Lgd/b;->a(Lfd/a;Lqd/j;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v5, v4}, Lhd/a;->a0(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v4, v0, Lud/e;->q:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_4

    .line 98
    .line 99
    iget-object v4, v0, Lud/e;->q:Ljava/util/List;

    .line 100
    .line 101
    new-instance v6, Lgd/a;

    .line 102
    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-direct {v6, v1, v2, v7}, Lgd/a;-><init>(Lgd/b;Lfd/a;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v6}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual {v5, v4}, Lhd/a;->Y(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    new-instance v4, Lfc/f;

    .line 115
    .line 116
    invoke-direct {v4, v3}, Lfc/f;-><init>(Lbc/g;)V

    .line 117
    .line 118
    .line 119
    iget-object v6, v3, Lbc/g;->F:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v4, v0}, Ljd/c;->b(Lfc/f;Lnd/b0;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v0}, Ljd/c;->d(Lfc/f;Lnd/b0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4}, Lfd/a;->b(Lfc/f;)V

    .line 128
    .line 129
    .line 130
    iget-object v4, v4, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v4, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v4, v5, Lhd/a;->e:Ljava/util/ArrayList;

    .line 141
    .line 142
    iget-object v4, v0, Lud/e;->u:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    sget-object v8, Lmd/a;->s:Lmd/a;

    .line 153
    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Lud/g;

    .line 161
    .line 162
    iget-object v9, v7, Lmd/e;->g:Lmd/f;

    .line 163
    .line 164
    iget-object v10, v7, Lud/g;->l:Lod/c;

    .line 165
    .line 166
    invoke-virtual {v9, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-eqz v8, :cond_5

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    new-instance v8, Lhd/b;

    .line 174
    .line 175
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    iget-object v9, v10, Lod/c;->h:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v10}, Lod/c;->b()Z

    .line 181
    .line 182
    .line 183
    new-instance v9, Lfc/f;

    .line 184
    .line 185
    invoke-direct {v9, v3}, Lfc/f;-><init>(Lbc/g;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v9, v7}, Lfd/a;->c(Lfc/f;Lud/g;)V

    .line 189
    .line 190
    .line 191
    iget-object v9, v9, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v7, v7, Lud/g;->m:Lb5/k;

    .line 197
    .line 198
    iget v7, v7, Lb5/k;->b:I

    .line 199
    .line 200
    iget-object v7, v5, Lhd/a;->e:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    iput-object v4, v5, Lhd/a;->f:Ljava/util/ArrayList;

    .line 212
    .line 213
    iget-object v4, v0, Lud/e;->t:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_e

    .line 224
    .line 225
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    check-cast v7, Lud/r;

    .line 230
    .line 231
    iget-object v9, v7, Lmd/e;->g:Lmd/f;

    .line 232
    .line 233
    iget-object v10, v7, Lud/r;->n:La5/a;

    .line 234
    .line 235
    iget-object v11, v7, Lud/r;->k:Lod/d;

    .line 236
    .line 237
    invoke-virtual {v9, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eqz v9, :cond_7

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_7
    new-instance v9, Lhd/b;

    .line 245
    .line 246
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    iget-object v12, v11, Lod/d;->g:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v13, v11, Lod/d;->n:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    iget-object v12, v7, Lud/r;->t:Lqd/j;

    .line 257
    .line 258
    invoke-virtual {v1, v2, v12}, Lgd/b;->a(Lfd/a;Lqd/j;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    iget-object v11, v11, Lod/d;->i:Ljava/util/List;

    .line 262
    .line 263
    new-instance v12, Lgd/a;

    .line 264
    .line 265
    const/4 v13, 0x1

    .line 266
    invoke-direct {v12, v1, v2, v13}, Lgd/a;-><init>(Lgd/b;Lfd/a;I)V

    .line 267
    .line 268
    .line 269
    invoke-static {v11, v12}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    new-instance v11, Lfd/g;

    .line 273
    .line 274
    invoke-direct {v11, v2, v7}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 275
    .line 276
    .line 277
    new-instance v12, Lfc/b;

    .line 278
    .line 279
    invoke-direct {v12, v3}, Lfc/b;-><init>(Lbc/g;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v12}, Lfd/g;->b(Lfc/f;)Z

    .line 283
    .line 284
    .line 285
    iget-object v12, v12, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object v12, v7, Lud/r;->m:Lb5/k;

    .line 291
    .line 292
    iget v12, v12, Lb5/k;->b:I

    .line 293
    .line 294
    iget-boolean v12, v7, Lud/r;->p:Z

    .line 295
    .line 296
    if-eqz v12, :cond_8

    .line 297
    .line 298
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 299
    .line 300
    :goto_4
    move-object/from16 v16, v3

    .line 301
    .line 302
    move-object/from16 p2, v4

    .line 303
    .line 304
    move-object/from16 v19, v6

    .line 305
    .line 306
    goto/16 :goto_8

    .line 307
    .line 308
    :cond_8
    iget-object v12, v7, Lud/r;->l:Lud/e;

    .line 309
    .line 310
    iget-object v12, v12, Lud/e;->k:Lud/u;

    .line 311
    .line 312
    invoke-virtual {v12}, Lud/u;->c()Lfc/b;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    :try_start_0
    invoke-virtual {v11, v12}, Lfd/g;->d(Lfc/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Lfc/b;->w()Lbc/d;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    check-cast v11, Lfc/a;

    .line 324
    .line 325
    iget-object v12, v11, Lfc/a;->b:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    if-eqz v15, :cond_9

    .line 332
    .line 333
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_9
    invoke-virtual {v12, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    iget-object v11, v11, Lfc/a;->c:Lb/e;

    .line 341
    .line 342
    iget-object v15, v11, Lb/e;->h:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v15, Ljava/util/Map;

    .line 345
    .line 346
    iget-boolean v13, v7, Lud/r;->p:Z

    .line 347
    .line 348
    if-eqz v13, :cond_a

    .line 349
    .line 350
    const-wide/16 v13, 0x0

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_a
    iget-object v13, v10, La5/a;->i:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v13, Lac/k;

    .line 356
    .line 357
    iget v13, v13, Lac/k;->h:I

    .line 358
    .line 359
    int-to-long v13, v13

    .line 360
    :goto_5
    const-wide/16 v16, 0x10

    .line 361
    .line 362
    add-long v13, v13, v16

    .line 363
    .line 364
    move-object/from16 v16, v3

    .line 365
    .line 366
    array-length v3, v12

    .line 367
    move-object/from16 p2, v4

    .line 368
    .line 369
    new-instance v4, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 375
    .line 376
    .line 377
    move-result v17

    .line 378
    const/16 v18, 0x0

    .line 379
    .line 380
    move-object/from16 v19, v6

    .line 381
    .line 382
    move/from16 v6, v18

    .line 383
    .line 384
    :goto_6
    if-ge v6, v3, :cond_c

    .line 385
    .line 386
    aget-object v20, v12, v6

    .line 387
    .line 388
    add-int/lit8 v21, v6, 0x2

    .line 389
    .line 390
    move/from16 v22, v3

    .line 391
    .line 392
    new-instance v3, La2/a;

    .line 393
    .line 394
    move/from16 v23, v6

    .line 395
    .line 396
    const/16 v6, 0x13

    .line 397
    .line 398
    invoke-direct {v3, v6}, La2/a;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-interface {v15, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    check-cast v6, Ljava/lang/Integer;

    .line 410
    .line 411
    iget-object v6, v11, Lb/e;->i:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v6, Ljava/util/NavigableMap;

    .line 414
    .line 415
    move-object/from16 v21, v11

    .line 416
    .line 417
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    check-cast v6, Lhc/a;

    .line 426
    .line 427
    instance-of v11, v6, Lic/a;

    .line 428
    .line 429
    if-eqz v11, :cond_b

    .line 430
    .line 431
    check-cast v6, Lic/a;

    .line 432
    .line 433
    iget v6, v6, Lic/a;->g:I

    .line 434
    .line 435
    move-object/from16 v24, v12

    .line 436
    .line 437
    int-to-long v11, v6

    .line 438
    const-wide/16 v25, 0x2

    .line 439
    .line 440
    mul-long v11, v11, v25

    .line 441
    .line 442
    add-long/2addr v11, v13

    .line 443
    invoke-static {v11, v12}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_b
    move-object/from16 v24, v12

    .line 448
    .line 449
    :goto_7
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    add-int v3, v3, v17

    .line 457
    .line 458
    add-int v18, v3, v18

    .line 459
    .line 460
    add-int/lit8 v6, v23, 0x1

    .line 461
    .line 462
    move-object/from16 v11, v21

    .line 463
    .line 464
    move/from16 v3, v22

    .line 465
    .line 466
    move-object/from16 v12, v24

    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_c
    :goto_8
    iget-boolean v3, v7, Lud/r;->p:Z

    .line 470
    .line 471
    if-eqz v3, :cond_d

    .line 472
    .line 473
    const-wide/16 v13, 0x0

    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_d
    iget-object v3, v10, La5/a;->i:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v3, Lac/k;

    .line 479
    .line 480
    iget v3, v3, Lac/k;->h:I

    .line 481
    .line 482
    int-to-long v13, v3

    .line 483
    :goto_9
    invoke-static {v13, v14}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    iget-object v3, v5, Lhd/a;->f:Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-object/from16 v4, p2

    .line 492
    .line 493
    move-object/from16 v3, v16

    .line 494
    .line 495
    move-object/from16 v6, v19

    .line 496
    .line 497
    goto/16 :goto_3

    .line 498
    .line 499
    :catch_0
    move-exception v0

    .line 500
    new-instance v2, Laf/g;

    .line 501
    .line 502
    const-string v3, "Method generation error"

    .line 503
    .line 504
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 505
    .line 506
    .line 507
    throw v2

    .line 508
    :cond_e
    iget-object v3, v0, Lud/e;->v:Ljava/util/List;

    .line 509
    .line 510
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    if-eqz v4, :cond_f

    .line 515
    .line 516
    goto :goto_b

    .line 517
    :cond_f
    new-instance v4, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 520
    .line 521
    .line 522
    move-result v6

    .line 523
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 524
    .line 525
    .line 526
    iput-object v4, v5, Lhd/a;->g:Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    if-eqz v4, :cond_11

    .line 537
    .line 538
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    check-cast v4, Lud/e;

    .line 543
    .line 544
    iget-object v6, v4, Lmd/e;->g:Lmd/f;

    .line 545
    .line 546
    invoke-virtual {v6, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    if-eqz v6, :cond_10

    .line 551
    .line 552
    goto :goto_a

    .line 553
    :cond_10
    invoke-virtual {v1, v4, v2}, Lgd/b;->b(Lud/e;Lfd/a;)Lhd/a;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    iget-object v6, v5, Lhd/a;->g:Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_11
    :goto_b
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 564
    .line 565
    invoke-virtual {v0}, Lod/a;->o()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-nez v0, :cond_12

    .line 570
    .line 571
    invoke-virtual {v2}, Lfd/a;->l()Ljava/util/Set;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    new-instance v2, Lcom/alibaba/fastjson2/writer/b;

    .line 576
    .line 577
    const/16 v3, 0x13

    .line 578
    .line 579
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 580
    .line 581
    .line 582
    invoke-static {v0, v2}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 587
    .line 588
    .line 589
    :cond_12
    return-object v5
.end method
