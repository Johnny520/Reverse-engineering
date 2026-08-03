.class public final synthetic Lwb/j7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Ljava/util/ArrayList;

.field public final synthetic r:Lfg/p;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;Ljava/util/List;Li0/a1;Li0/a1;Ljava/util/ArrayList;Lfg/p;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 1

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    iput v0, p0, Lwb/j7;->g:I

    .line 4
    .line 5
    iput-object p1, p0, Lwb/j7;->h:Lsh/x;

    .line 6
    .line 7
    iput-object p2, p0, Lwb/j7;->i:Lr/z;

    .line 8
    .line 9
    iput-object p3, p0, Lwb/j7;->j:Ljava/util/List;

    .line 10
    .line 11
    iput-object p4, p0, Lwb/j7;->k:Lfg/a;

    .line 12
    .line 13
    iput-object p5, p0, Lwb/j7;->l:Ljava/util/List;

    .line 14
    .line 15
    iput-object p6, p0, Lwb/j7;->m:Lfg/a;

    .line 16
    .line 17
    iput-object p7, p0, Lwb/j7;->n:Ljava/util/List;

    .line 18
    .line 19
    iput-object p8, p0, Lwb/j7;->o:Li0/a1;

    .line 20
    .line 21
    iput-object p9, p0, Lwb/j7;->p:Li0/a1;

    .line 22
    .line 23
    iput-object p10, p0, Lwb/j7;->q:Ljava/util/ArrayList;

    .line 24
    .line 25
    iput-object p11, p0, Lwb/j7;->r:Lfg/p;

    .line 26
    .line 27
    iput-object p12, p0, Lwb/j7;->s:Li0/a1;

    .line 28
    .line 29
    iput-object p13, p0, Lwb/j7;->t:Li0/a1;

    .line 30
    .line 31
    iput-object p14, p0, Lwb/j7;->u:Li0/a1;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/j7;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lp/x0;

    .line 11
    .line 12
    move-object/from16 v11, p2

    .line 13
    .line 14
    check-cast v11, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v3, v2, 0x6

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v3

    .line 41
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v3, 0x0

    .line 51
    :goto_1
    and-int/2addr v2, v5

    .line 52
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 59
    .line 60
    iget-object v3, v0, Lwb/j7;->h:Lsh/x;

    .line 61
    .line 62
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1}, Lp/x0;->c()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    add-float/2addr v3, v4

    .line 77
    invoke-interface {v1}, Lp/x0;->a()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v4, 0x54

    .line 82
    .line 83
    int-to-float v4, v4

    .line 84
    add-float/2addr v1, v4

    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v15, v0, Lwb/j7;->j:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v11, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v3, v0, Lwb/j7;->k:Lfg/a;

    .line 97
    .line 98
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    or-int/2addr v1, v5

    .line 103
    iget-object v5, v0, Lwb/j7;->l:Ljava/util/List;

    .line 104
    .line 105
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    or-int/2addr v1, v6

    .line 110
    iget-object v6, v0, Lwb/j7;->m:Lfg/a;

    .line 111
    .line 112
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    or-int/2addr v1, v7

    .line 117
    iget-object v7, v0, Lwb/j7;->n:Ljava/util/List;

    .line 118
    .line 119
    invoke-virtual {v11, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    or-int/2addr v1, v8

    .line 124
    iget-object v8, v0, Lwb/j7;->o:Li0/a1;

    .line 125
    .line 126
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    or-int/2addr v1, v9

    .line 131
    iget-object v9, v0, Lwb/j7;->p:Li0/a1;

    .line 132
    .line 133
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    or-int/2addr v1, v10

    .line 138
    iget-object v10, v0, Lwb/j7;->q:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v11, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    or-int/2addr v1, v12

    .line 145
    iget-object v12, v0, Lwb/j7;->r:Lfg/p;

    .line 146
    .line 147
    invoke-virtual {v11, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    or-int/2addr v1, v13

    .line 152
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    if-nez v1, :cond_3

    .line 157
    .line 158
    sget-object v1, Li0/l;->a:Li0/e;

    .line 159
    .line 160
    if-ne v13, v1, :cond_4

    .line 161
    .line 162
    :cond_3
    move-object/from16 v23, v12

    .line 163
    .line 164
    new-instance v12, Lwb/v9;

    .line 165
    .line 166
    const/16 v25, 0x1

    .line 167
    .line 168
    iget-object v13, v0, Lwb/j7;->s:Li0/a1;

    .line 169
    .line 170
    iget-object v14, v0, Lwb/j7;->t:Li0/a1;

    .line 171
    .line 172
    iget-object v1, v0, Lwb/j7;->u:Li0/a1;

    .line 173
    .line 174
    move-object/from16 v24, v1

    .line 175
    .line 176
    move-object/from16 v16, v3

    .line 177
    .line 178
    move-object/from16 v17, v5

    .line 179
    .line 180
    move-object/from16 v18, v6

    .line 181
    .line 182
    move-object/from16 v19, v7

    .line 183
    .line 184
    move-object/from16 v21, v8

    .line 185
    .line 186
    move-object/from16 v22, v9

    .line 187
    .line 188
    move-object/from16 v20, v10

    .line 189
    .line 190
    invoke-direct/range {v12 .. v25}, Lwb/v9;-><init>(Li0/a1;Li0/a1;Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Lfg/p;Li0/a1;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object v13, v12

    .line 197
    :cond_4
    move-object v10, v13

    .line 198
    check-cast v10, Lfg/l;

    .line 199
    .line 200
    const/4 v12, 0x0

    .line 201
    const/16 v13, 0x1f8

    .line 202
    .line 203
    iget-object v3, v0, Lwb/j7;->i:Lr/z;

    .line 204
    .line 205
    const/4 v5, 0x0

    .line 206
    const/4 v6, 0x0

    .line 207
    const/4 v7, 0x0

    .line 208
    const/4 v8, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 215
    .line 216
    .line 217
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 218
    .line 219
    return-object v1

    .line 220
    :pswitch_0
    move-object/from16 v1, p1

    .line 221
    .line 222
    check-cast v1, Lp/x0;

    .line 223
    .line 224
    move-object/from16 v11, p2

    .line 225
    .line 226
    check-cast v11, Li0/h0;

    .line 227
    .line 228
    move-object/from16 v2, p3

    .line 229
    .line 230
    check-cast v2, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    and-int/lit8 v3, v2, 0x6

    .line 240
    .line 241
    if-nez v3, :cond_7

    .line 242
    .line 243
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_6

    .line 248
    .line 249
    const/4 v3, 0x4

    .line 250
    goto :goto_3

    .line 251
    :cond_6
    const/4 v3, 0x2

    .line 252
    :goto_3
    or-int/2addr v2, v3

    .line 253
    :cond_7
    and-int/lit8 v3, v2, 0x13

    .line 254
    .line 255
    const/16 v4, 0x12

    .line 256
    .line 257
    const/4 v5, 0x1

    .line 258
    if-eq v3, v4, :cond_8

    .line 259
    .line 260
    move v3, v5

    .line 261
    goto :goto_4

    .line 262
    :cond_8
    const/4 v3, 0x0

    .line 263
    :goto_4
    and-int/2addr v2, v5

    .line 264
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_b

    .line 269
    .line 270
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 271
    .line 272
    iget-object v3, v0, Lwb/j7;->h:Lsh/x;

    .line 273
    .line 274
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 275
    .line 276
    const/4 v4, 0x0

    .line 277
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-interface {v1}, Lp/x0;->c()F

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    const/16 v4, 0x8

    .line 286
    .line 287
    int-to-float v4, v4

    .line 288
    add-float/2addr v3, v4

    .line 289
    invoke-interface {v1}, Lp/x0;->a()F

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    const/16 v4, 0x54

    .line 294
    .line 295
    int-to-float v4, v4

    .line 296
    add-float/2addr v1, v4

    .line 297
    const/4 v4, 0x5

    .line 298
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    iget-object v15, v0, Lwb/j7;->j:Ljava/util/List;

    .line 303
    .line 304
    invoke-virtual {v11, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    iget-object v3, v0, Lwb/j7;->k:Lfg/a;

    .line 309
    .line 310
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    or-int/2addr v1, v5

    .line 315
    iget-object v5, v0, Lwb/j7;->l:Ljava/util/List;

    .line 316
    .line 317
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    or-int/2addr v1, v6

    .line 322
    iget-object v6, v0, Lwb/j7;->m:Lfg/a;

    .line 323
    .line 324
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    or-int/2addr v1, v7

    .line 329
    iget-object v7, v0, Lwb/j7;->n:Ljava/util/List;

    .line 330
    .line 331
    invoke-virtual {v11, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    or-int/2addr v1, v8

    .line 336
    iget-object v8, v0, Lwb/j7;->o:Li0/a1;

    .line 337
    .line 338
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    or-int/2addr v1, v9

    .line 343
    iget-object v9, v0, Lwb/j7;->p:Li0/a1;

    .line 344
    .line 345
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    or-int/2addr v1, v10

    .line 350
    iget-object v10, v0, Lwb/j7;->q:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v11, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    or-int/2addr v1, v12

    .line 357
    iget-object v12, v0, Lwb/j7;->r:Lfg/p;

    .line 358
    .line 359
    invoke-virtual {v11, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    or-int/2addr v1, v13

    .line 364
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    if-nez v1, :cond_9

    .line 369
    .line 370
    sget-object v1, Li0/l;->a:Li0/e;

    .line 371
    .line 372
    if-ne v13, v1, :cond_a

    .line 373
    .line 374
    :cond_9
    move-object/from16 v23, v12

    .line 375
    .line 376
    new-instance v12, Lwb/v9;

    .line 377
    .line 378
    const/16 v25, 0x0

    .line 379
    .line 380
    iget-object v13, v0, Lwb/j7;->s:Li0/a1;

    .line 381
    .line 382
    iget-object v14, v0, Lwb/j7;->t:Li0/a1;

    .line 383
    .line 384
    iget-object v1, v0, Lwb/j7;->u:Li0/a1;

    .line 385
    .line 386
    move-object/from16 v24, v1

    .line 387
    .line 388
    move-object/from16 v16, v3

    .line 389
    .line 390
    move-object/from16 v17, v5

    .line 391
    .line 392
    move-object/from16 v18, v6

    .line 393
    .line 394
    move-object/from16 v19, v7

    .line 395
    .line 396
    move-object/from16 v21, v8

    .line 397
    .line 398
    move-object/from16 v22, v9

    .line 399
    .line 400
    move-object/from16 v20, v10

    .line 401
    .line 402
    invoke-direct/range {v12 .. v25}, Lwb/v9;-><init>(Li0/a1;Li0/a1;Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Lfg/p;Li0/a1;I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    move-object v13, v12

    .line 409
    :cond_a
    move-object v10, v13

    .line 410
    check-cast v10, Lfg/l;

    .line 411
    .line 412
    const/4 v12, 0x0

    .line 413
    const/16 v13, 0x1f8

    .line 414
    .line 415
    iget-object v3, v0, Lwb/j7;->i:Lr/z;

    .line 416
    .line 417
    const/4 v5, 0x0

    .line 418
    const/4 v6, 0x0

    .line 419
    const/4 v7, 0x0

    .line 420
    const/4 v8, 0x0

    .line 421
    const/4 v9, 0x0

    .line 422
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 423
    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_b
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 427
    .line 428
    .line 429
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 430
    .line 431
    return-object v1

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
