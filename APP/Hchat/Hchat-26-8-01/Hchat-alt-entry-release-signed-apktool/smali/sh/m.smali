.class public final synthetic Lsh/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;Ljava/lang/Object;ZI)V
    .locals 0

    .line 18
    iput p6, p0, Lsh/m;->g:I

    iput-object p1, p0, Lsh/m;->i:Ljava/lang/Object;

    iput-object p2, p0, Lsh/m;->j:Ljava/lang/Object;

    iput-object p3, p0, Lsh/m;->k:Ljava/lang/Object;

    iput-object p4, p0, Lsh/m;->l:Ljava/lang/Object;

    iput-boolean p5, p0, Lsh/m;->h:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lsh/a;ZLjava/lang/String;Lsh/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lsh/m;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsh/m;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lsh/m;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lsh/m;->h:Z

    .line 12
    .line 13
    iput-object p4, p0, Lsh/m;->j:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lsh/m;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lwb/t4;ZLfg/l;Li0/a1;Li0/a1;)V
    .locals 1

    .line 19
    const/4 v0, 0x3

    iput v0, p0, Lsh/m;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/m;->i:Ljava/lang/Object;

    iput-boolean p2, p0, Lsh/m;->h:Z

    iput-object p3, p0, Lsh/m;->j:Ljava/lang/Object;

    iput-object p4, p0, Lsh/m;->k:Ljava/lang/Object;

    iput-object p5, p0, Lsh/m;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/lang/String;Lfg/l;Lfg/a;)V
    .locals 1

    .line 20
    const/4 v0, 0x4

    iput v0, p0, Lsh/m;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsh/m;->h:Z

    iput-object p2, p0, Lsh/m;->j:Ljava/lang/Object;

    iput-object p3, p0, Lsh/m;->i:Ljava/lang/Object;

    iput-object p4, p0, Lsh/m;->k:Ljava/lang/Object;

    iput-object p5, p0, Lsh/m;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsh/m;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lsh/m;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, Lfg/l;

    .line 12
    .line 13
    iget-object v1, v0, Lsh/m;->i:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, v0, Lsh/m;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Lfg/l;

    .line 22
    .line 23
    iget-object v1, v0, Lsh/m;->l:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, Lfg/a;

    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Lr/d;

    .line 31
    .line 32
    move-object/from16 v8, p2

    .line 33
    .line 34
    check-cast v8, Li0/h0;

    .line 35
    .line 36
    move-object/from16 v2, p3

    .line 37
    .line 38
    check-cast v2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v1, v2, 0x11

    .line 48
    .line 49
    const/16 v3, 0x10

    .line 50
    .line 51
    const/4 v9, 0x1

    .line 52
    if-eq v1, v3, :cond_0

    .line 53
    .line 54
    move v1, v9

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v1, 0x0

    .line 57
    :goto_0
    and-int/2addr v2, v9

    .line 58
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    new-instance v2, Lwb/ug;

    .line 65
    .line 66
    iget-boolean v3, v0, Lsh/m;->h:Z

    .line 67
    .line 68
    invoke-direct/range {v2 .. v7}, Lwb/ug;-><init>(ZLfg/l;Ljava/lang/String;Lfg/l;Lfg/a;)V

    .line 69
    .line 70
    .line 71
    const v1, 0x7415145c

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v2, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/16 v2, 0x30

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-static {v3, v1, v8, v2, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 89
    .line 90
    return-object v1

    .line 91
    :pswitch_0
    iget-object v1, v0, Lsh/m;->i:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v2, v1

    .line 94
    check-cast v2, Lwb/t4;

    .line 95
    .line 96
    iget-object v1, v0, Lsh/m;->j:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v6, v1

    .line 99
    check-cast v6, Lfg/l;

    .line 100
    .line 101
    iget-object v1, v0, Lsh/m;->k:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Li0/a1;

    .line 104
    .line 105
    iget-object v3, v0, Lsh/m;->l:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Li0/a1;

    .line 108
    .line 109
    move-object/from16 v5, p1

    .line 110
    .line 111
    check-cast v5, Lth/a;

    .line 112
    .line 113
    move-object/from16 v7, p2

    .line 114
    .line 115
    check-cast v7, Li0/h0;

    .line 116
    .line 117
    move-object/from16 v4, p3

    .line 118
    .line 119
    check-cast v4, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 v8, v4, 0x6

    .line 129
    .line 130
    if-nez v8, :cond_4

    .line 131
    .line 132
    and-int/lit8 v8, v4, 0x8

    .line 133
    .line 134
    if-nez v8, :cond_2

    .line 135
    .line 136
    invoke-virtual {v7, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    invoke-virtual {v7, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    :goto_2
    if-eqz v8, :cond_3

    .line 146
    .line 147
    const/4 v8, 0x4

    .line 148
    goto :goto_3

    .line 149
    :cond_3
    const/4 v8, 0x2

    .line 150
    :goto_3
    or-int/2addr v4, v8

    .line 151
    :cond_4
    and-int/lit8 v8, v4, 0x13

    .line 152
    .line 153
    const/16 v9, 0x12

    .line 154
    .line 155
    const/4 v10, 0x0

    .line 156
    const/4 v11, 0x1

    .line 157
    if-eq v8, v9, :cond_5

    .line 158
    .line 159
    move v8, v11

    .line 160
    goto :goto_4

    .line 161
    :cond_5
    move v8, v10

    .line 162
    :goto_4
    and-int/lit8 v9, v4, 0x1

    .line 163
    .line 164
    invoke-virtual {v7, v9, v8}, Li0/h0;->S(IZ)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_7

    .line 169
    .line 170
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    iget-boolean v8, v0, Lsh/m;->h:Z

    .line 181
    .line 182
    if-eqz v8, :cond_6

    .line 183
    .line 184
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_6

    .line 195
    .line 196
    move v10, v11

    .line 197
    :cond_6
    shl-int/lit8 v3, v4, 0x9

    .line 198
    .line 199
    and-int/lit16 v8, v3, 0x1c00

    .line 200
    .line 201
    move v3, v1

    .line 202
    move v4, v10

    .line 203
    invoke-static/range {v2 .. v8}, Lwb/ho;->M1(Lwb/t4;ZZLth/a;Lfg/l;Li0/h0;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 211
    .line 212
    return-object v1

    .line 213
    :pswitch_1
    iget-object v1, v0, Lsh/m;->i:Ljava/lang/Object;

    .line 214
    .line 215
    move-object v3, v1

    .line 216
    check-cast v3, Ldb/c;

    .line 217
    .line 218
    iget-object v1, v0, Lsh/m;->j:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v4, v1

    .line 221
    check-cast v4, Lfg/l;

    .line 222
    .line 223
    iget-object v1, v0, Lsh/m;->k:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v5, v1

    .line 226
    check-cast v5, Lfg/p;

    .line 227
    .line 228
    iget-object v1, v0, Lsh/m;->l:Ljava/lang/Object;

    .line 229
    .line 230
    move-object v6, v1

    .line 231
    check-cast v6, Lfg/l;

    .line 232
    .line 233
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, Lr/d;

    .line 236
    .line 237
    move-object/from16 v8, p2

    .line 238
    .line 239
    check-cast v8, Li0/h0;

    .line 240
    .line 241
    move-object/from16 v2, p3

    .line 242
    .line 243
    check-cast v2, Ljava/lang/Integer;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    and-int/lit8 v1, v2, 0x11

    .line 253
    .line 254
    const/16 v7, 0x10

    .line 255
    .line 256
    const/4 v9, 0x1

    .line 257
    if-eq v1, v7, :cond_8

    .line 258
    .line 259
    move v1, v9

    .line 260
    goto :goto_6

    .line 261
    :cond_8
    const/4 v1, 0x0

    .line 262
    :goto_6
    and-int/2addr v2, v9

    .line 263
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_9

    .line 268
    .line 269
    new-instance v2, Lwb/nf;

    .line 270
    .line 271
    iget-boolean v7, v0, Lsh/m;->h:Z

    .line 272
    .line 273
    invoke-direct/range {v2 .. v7}, Lwb/nf;-><init>(Ldb/c;Lfg/l;Lfg/p;Lfg/l;Z)V

    .line 274
    .line 275
    .line 276
    const v1, -0x353455ba    # -6673699.0f

    .line 277
    .line 278
    .line 279
    invoke-static {v1, v2, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    const/16 v2, 0x30

    .line 284
    .line 285
    const/4 v3, 0x0

    .line 286
    invoke-static {v3, v1, v8, v2, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_9
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 291
    .line 292
    .line 293
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 294
    .line 295
    return-object v1

    .line 296
    :pswitch_2
    iget-object v1, v0, Lsh/m;->i:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, Lfg/l;

    .line 299
    .line 300
    iget-object v2, v0, Lsh/m;->j:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v2, Li0/a1;

    .line 303
    .line 304
    iget-object v3, v0, Lsh/m;->k:Ljava/lang/Object;

    .line 305
    .line 306
    move-object v7, v3

    .line 307
    check-cast v7, Lfg/a;

    .line 308
    .line 309
    iget-object v3, v0, Lsh/m;->l:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v3, Ljava/util/Set;

    .line 312
    .line 313
    move-object/from16 v4, p1

    .line 314
    .line 315
    check-cast v4, Lth/a;

    .line 316
    .line 317
    move-object/from16 v10, p2

    .line 318
    .line 319
    check-cast v10, Li0/h0;

    .line 320
    .line 321
    move-object/from16 v5, p3

    .line 322
    .line 323
    check-cast v5, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    and-int/lit8 v4, v5, 0x11

    .line 333
    .line 334
    const/16 v6, 0x10

    .line 335
    .line 336
    const/4 v8, 0x1

    .line 337
    const/4 v9, 0x0

    .line 338
    if-eq v4, v6, :cond_a

    .line 339
    .line 340
    move v4, v8

    .line 341
    goto :goto_8

    .line 342
    :cond_a
    move v4, v9

    .line 343
    :goto_8
    and-int/2addr v5, v8

    .line 344
    invoke-virtual {v10, v5, v4}, Li0/h0;->S(IZ)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_12

    .line 349
    .line 350
    invoke-virtual {v10, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    invoke-virtual {v10, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    or-int/2addr v4, v5

    .line 359
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    sget-object v6, Li0/l;->a:Li0/e;

    .line 364
    .line 365
    if-nez v4, :cond_b

    .line 366
    .line 367
    if-ne v5, v6, :cond_c

    .line 368
    .line 369
    :cond_b
    new-instance v5, Lwb/o1;

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    invoke-direct {v5, v1, v2, v4}, Lwb/o1;-><init>(Lfg/l;Li0/a1;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v10, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_c
    check-cast v5, Lfg/a;

    .line 379
    .line 380
    move-object v1, v3

    .line 381
    check-cast v1, Ljava/util/Collection;

    .line 382
    .line 383
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    iget-boolean v8, v0, Lsh/m;->h:Z

    .line 388
    .line 389
    const/4 v11, 0x0

    .line 390
    if-nez v4, :cond_e

    .line 391
    .line 392
    if-eqz v8, :cond_d

    .line 393
    .line 394
    const-string v4, "\u53d6\u6d88\u5168\u9009"

    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_d
    const-string v4, "\u5168\u9009"

    .line 398
    .line 399
    goto :goto_9

    .line 400
    :cond_e
    move-object v4, v11

    .line 401
    :goto_9
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-nez v1, :cond_11

    .line 406
    .line 407
    const v1, -0x797af7e4

    .line 408
    .line 409
    .line 410
    invoke-virtual {v10, v1}, Li0/h0;->a0(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    invoke-virtual {v10, v8}, Li0/h0;->g(Z)Z

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    or-int/2addr v1, v11

    .line 422
    invoke-virtual {v10, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    or-int/2addr v1, v11

    .line 427
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v11

    .line 431
    if-nez v1, :cond_f

    .line 432
    .line 433
    if-ne v11, v6, :cond_10

    .line 434
    .line 435
    :cond_f
    new-instance v11, Lwb/p1;

    .line 436
    .line 437
    const/4 v1, 0x0

    .line 438
    invoke-direct {v11, v8, v3, v2, v1}, Lwb/p1;-><init>(ZLjava/util/Set;Li0/a1;I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v10, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_10
    check-cast v11, Lfg/a;

    .line 445
    .line 446
    invoke-virtual {v10, v9}, Li0/h0;->p(Z)V

    .line 447
    .line 448
    .line 449
    :goto_a
    move-object v9, v11

    .line 450
    goto :goto_b

    .line 451
    :cond_11
    const v1, -0x79783c75

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v1}, Li0/h0;->a0(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v9}, Li0/h0;->p(Z)V

    .line 458
    .line 459
    .line 460
    goto :goto_a

    .line 461
    :goto_b
    const/16 v11, 0x186

    .line 462
    .line 463
    const/4 v12, 0x0

    .line 464
    move-object v8, v4

    .line 465
    const-string v4, "\u4fdd\u5b58\u9009\u62e9"

    .line 466
    .line 467
    const-string v6, "\u8fd4\u56de"

    .line 468
    .line 469
    invoke-static/range {v4 .. v12}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 470
    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_12
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 474
    .line 475
    .line 476
    :goto_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 477
    .line 478
    return-object v1

    .line 479
    :pswitch_3
    iget-object v1, v0, Lsh/m;->i:Ljava/lang/Object;

    .line 480
    .line 481
    move-object v2, v1

    .line 482
    check-cast v2, Ljava/lang/String;

    .line 483
    .line 484
    iget-object v1, v0, Lsh/m;->k:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v1, Lsh/a;

    .line 487
    .line 488
    iget-object v3, v0, Lsh/m;->j:Ljava/lang/Object;

    .line 489
    .line 490
    move-object/from16 v25, v3

    .line 491
    .line 492
    check-cast v25, Ljava/lang/String;

    .line 493
    .line 494
    iget-object v3, v0, Lsh/m;->l:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v3, Lsh/a;

    .line 497
    .line 498
    move-object/from16 v4, p1

    .line 499
    .line 500
    check-cast v4, Lp/u;

    .line 501
    .line 502
    move-object/from16 v5, p2

    .line 503
    .line 504
    check-cast v5, Li0/h0;

    .line 505
    .line 506
    move-object/from16 v6, p3

    .line 507
    .line 508
    check-cast v6, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    and-int/lit8 v4, v6, 0x11

    .line 518
    .line 519
    const/16 v7, 0x10

    .line 520
    .line 521
    const/4 v8, 0x1

    .line 522
    const/4 v9, 0x0

    .line 523
    if-eq v4, v7, :cond_13

    .line 524
    .line 525
    move v4, v8

    .line 526
    goto :goto_d

    .line 527
    :cond_13
    move v4, v9

    .line 528
    :goto_d
    and-int/2addr v6, v8

    .line 529
    invoke-virtual {v5, v6, v4}, Li0/h0;->S(IZ)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_17

    .line 534
    .line 535
    const v4, -0x45063202

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 539
    .line 540
    .line 541
    sget-object v4, Lbi/m;->a:Li0/m2;

    .line 542
    .line 543
    invoke-virtual {v5, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    check-cast v6, Lbi/l;

    .line 548
    .line 549
    iget-object v6, v6, Lbi/l;->h:Li0/j1;

    .line 550
    .line 551
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    check-cast v6, Li2/n0;

    .line 556
    .line 557
    iget-object v6, v6, Li2/n0;->a:Li2/f0;

    .line 558
    .line 559
    iget-wide v6, v6, Li2/f0;->b:J

    .line 560
    .line 561
    sget-object v8, Lm2/k;->j:Lm2/k;

    .line 562
    .line 563
    iget-boolean v10, v0, Lsh/m;->h:Z

    .line 564
    .line 565
    if-eqz v10, :cond_14

    .line 566
    .line 567
    iget-wide v11, v1, Lsh/a;->a:J

    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_14
    iget-wide v11, v1, Lsh/a;->b:J

    .line 571
    .line 572
    :goto_e
    const/16 v23, 0x0

    .line 573
    .line 574
    const v24, 0x3ffaa

    .line 575
    .line 576
    .line 577
    move-object v1, v3

    .line 578
    const/4 v3, 0x0

    .line 579
    move v13, v9

    .line 580
    const/4 v9, 0x0

    .line 581
    move-object/from16 v21, v5

    .line 582
    .line 583
    move v14, v10

    .line 584
    move-wide/from16 v29, v11

    .line 585
    .line 586
    move-object v12, v4

    .line 587
    move-wide/from16 v4, v29

    .line 588
    .line 589
    const-wide/16 v10, 0x0

    .line 590
    .line 591
    move-object v15, v12

    .line 592
    const/4 v12, 0x0

    .line 593
    move/from16 v17, v13

    .line 594
    .line 595
    move/from16 v16, v14

    .line 596
    .line 597
    const-wide/16 v13, 0x0

    .line 598
    .line 599
    move-object/from16 v18, v15

    .line 600
    .line 601
    const/4 v15, 0x0

    .line 602
    move/from16 v19, v16

    .line 603
    .line 604
    const/16 v16, 0x0

    .line 605
    .line 606
    move/from16 v20, v17

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    move-object/from16 v22, v18

    .line 611
    .line 612
    const/16 v18, 0x0

    .line 613
    .line 614
    move/from16 v26, v19

    .line 615
    .line 616
    const/16 v19, 0x0

    .line 617
    .line 618
    move/from16 v27, v20

    .line 619
    .line 620
    const/16 v20, 0x0

    .line 621
    .line 622
    move-object/from16 v28, v22

    .line 623
    .line 624
    const/high16 v22, 0x180000

    .line 625
    .line 626
    move/from16 v0, v27

    .line 627
    .line 628
    move-object/from16 v27, v1

    .line 629
    .line 630
    move v1, v0

    .line 631
    move-object/from16 v0, v28

    .line 632
    .line 633
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v2, v21

    .line 637
    .line 638
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 639
    .line 640
    .line 641
    if-eqz v25, :cond_16

    .line 642
    .line 643
    const v3, -0x45021db2

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    check-cast v0, Lbi/l;

    .line 654
    .line 655
    iget-object v0, v0, Lbi/l;->d:Li0/j1;

    .line 656
    .line 657
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    check-cast v0, Li2/n0;

    .line 662
    .line 663
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 664
    .line 665
    iget-wide v8, v0, Li2/f0;->b:J

    .line 666
    .line 667
    move-object/from16 v3, v27

    .line 668
    .line 669
    if-eqz v26, :cond_15

    .line 670
    .line 671
    iget-wide v3, v3, Lsh/a;->a:J

    .line 672
    .line 673
    :goto_f
    move-wide v6, v3

    .line 674
    move-object/from16 v4, v25

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_15
    iget-wide v3, v3, Lsh/a;->b:J

    .line 678
    .line 679
    goto :goto_f

    .line 680
    :goto_10
    const/16 v25, 0x0

    .line 681
    .line 682
    const v26, 0x3ffea

    .line 683
    .line 684
    .line 685
    const/4 v5, 0x0

    .line 686
    const/4 v10, 0x0

    .line 687
    const/4 v11, 0x0

    .line 688
    const-wide/16 v12, 0x0

    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const-wide/16 v15, 0x0

    .line 692
    .line 693
    const/16 v17, 0x0

    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    const/16 v19, 0x0

    .line 698
    .line 699
    const/16 v20, 0x0

    .line 700
    .line 701
    const/16 v21, 0x0

    .line 702
    .line 703
    const/16 v22, 0x0

    .line 704
    .line 705
    const/16 v24, 0x0

    .line 706
    .line 707
    move-object/from16 v23, v2

    .line 708
    .line 709
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 713
    .line 714
    .line 715
    goto :goto_11

    .line 716
    :cond_16
    const v0, -0x44ff7c89

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2, v0}, Li0/h0;->a0(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 723
    .line 724
    .line 725
    goto :goto_11

    .line 726
    :cond_17
    move-object v2, v5

    .line 727
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 728
    .line 729
    .line 730
    :goto_11
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
