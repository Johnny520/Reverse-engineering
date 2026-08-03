.class public final synthetic Ldb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ldb/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ldb/f;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldb/f;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldb/f;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ly9/e;

    .line 11
    .line 12
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ly9/d;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    move-object/from16 v5, p3

    .line 25
    .line 26
    check-cast v5, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v6, v1, Ly9/e;->b:Lib/b;

    .line 38
    .line 39
    iget-object v7, v2, Ly9/d;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v8, v2, Ly9/d;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v7, v8}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-nez v8, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v6, v6, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 55
    .line 56
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v8, "custom_title_"

    .line 61
    .line 62
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {v3}, La7/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v6, v8, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v6, "custom_color_"

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-static {v4}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v3, v6, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const-string v4, "custom_text_color_"

    .line 89
    .line 90
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v5}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_1

    .line 110
    .line 111
    new-instance v4, Lrb/g;

    .line 112
    .line 113
    const/16 v5, 0x16

    .line 114
    .line 115
    invoke-direct {v4, v1, v5, v2}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    :cond_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 122
    .line 123
    return-object v1

    .line 124
    :pswitch_0
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Laa/c;

    .line 127
    .line 128
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, Lc9/n0;

    .line 131
    .line 132
    move-object/from16 v12, p1

    .line 133
    .line 134
    check-cast v12, Lfg/a;

    .line 135
    .line 136
    move-object/from16 v3, p2

    .line 137
    .line 138
    check-cast v3, Li0/h0;

    .line 139
    .line 140
    move-object/from16 v4, p3

    .line 141
    .line 142
    check-cast v4, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    and-int/lit8 v5, v4, 0x6

    .line 152
    .line 153
    if-nez v5, :cond_3

    .line 154
    .line 155
    invoke-virtual {v3, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_2

    .line 160
    .line 161
    const/4 v5, 0x4

    .line 162
    goto :goto_1

    .line 163
    :cond_2
    const/4 v5, 0x2

    .line 164
    :goto_1
    or-int/2addr v4, v5

    .line 165
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 166
    .line 167
    const/16 v6, 0x12

    .line 168
    .line 169
    if-eq v5, v6, :cond_4

    .line 170
    .line 171
    const/4 v5, 0x1

    .line 172
    goto :goto_2

    .line 173
    :cond_4
    const/4 v5, 0x0

    .line 174
    :goto_2
    and-int/lit8 v6, v4, 0x1

    .line 175
    .line 176
    invoke-virtual {v3, v6, v5}, Li0/h0;->S(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_5

    .line 181
    .line 182
    new-instance v5, Lwb/rj;

    .line 183
    .line 184
    const/16 v6, 0x18

    .line 185
    .line 186
    invoke-direct {v5, v12, v1, v2, v6}, Lwb/rj;-><init>(Lfg/a;Ljava/lang/Object;Lfg/a;I)V

    .line 187
    .line 188
    .line 189
    const v1, 0x17fb4315

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v5, v3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 193
    .line 194
    .line 195
    move-result-object v18

    .line 196
    shl-int/lit8 v1, v4, 0x18

    .line 197
    .line 198
    const/high16 v2, 0xe000000

    .line 199
    .line 200
    and-int/2addr v1, v2

    .line 201
    or-int/lit16 v1, v1, 0x186

    .line 202
    .line 203
    const/16 v21, 0xc00

    .line 204
    .line 205
    move-object/from16 v19, v3

    .line 206
    .line 207
    const/4 v3, 0x0

    .line 208
    const-string v4, "\u53d1\u9001\u6536\u85cf\u8bed\u97f3"

    .line 209
    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const-wide/16 v7, 0x0

    .line 213
    .line 214
    const-wide/16 v9, 0x0

    .line 215
    .line 216
    const/4 v11, 0x0

    .line 217
    const-wide/16 v13, 0x0

    .line 218
    .line 219
    const-wide/16 v15, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    move/from16 v20, v1

    .line 224
    .line 225
    invoke-static/range {v3 .. v21}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    move-object/from16 v19, v3

    .line 230
    .line 231
    invoke-virtual/range {v19 .. v19}, Li0/h0;->V()V

    .line 232
    .line 233
    .line 234
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 235
    .line 236
    return-object v1

    .line 237
    :pswitch_1
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Lfb/c;

    .line 240
    .line 241
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v2, Li0/a1;

    .line 244
    .line 245
    move-object/from16 v3, p1

    .line 246
    .line 247
    check-cast v3, Lh/b0;

    .line 248
    .line 249
    move-object/from16 v4, p2

    .line 250
    .line 251
    check-cast v4, Li0/h0;

    .line 252
    .line 253
    move-object/from16 v5, p3

    .line 254
    .line 255
    check-cast v5, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    and-int/lit8 v3, v5, 0x11

    .line 265
    .line 266
    const/16 v6, 0x10

    .line 267
    .line 268
    const/4 v7, 0x0

    .line 269
    const/4 v8, 0x1

    .line 270
    if-eq v3, v6, :cond_6

    .line 271
    .line 272
    move v3, v8

    .line 273
    goto :goto_4

    .line 274
    :cond_6
    move v3, v7

    .line 275
    :goto_4
    and-int/2addr v5, v8

    .line 276
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_b

    .line 281
    .line 282
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 283
    .line 284
    const/high16 v5, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-static {v3, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    const/16 v3, 0x18

    .line 291
    .line 292
    int-to-float v10, v3

    .line 293
    const/4 v3, 0x6

    .line 294
    int-to-float v13, v3

    .line 295
    const/4 v14, 0x6

    .line 296
    const/4 v11, 0x0

    .line 297
    const/4 v12, 0x0

    .line 298
    invoke-static/range {v9 .. v14}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    sget-object v5, Lp/j;->c:Lp/e;

    .line 303
    .line 304
    sget-object v6, Ly0/b;->s:Ly0/e;

    .line 305
    .line 306
    invoke-static {v5, v6, v4, v7}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    iget-wide v9, v4, Li0/h0;->T:J

    .line 311
    .line 312
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    invoke-static {v4, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 325
    .line 326
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 330
    .line 331
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 332
    .line 333
    .line 334
    iget-boolean v11, v4, Li0/h0;->S:Z

    .line 335
    .line 336
    if-eqz v11, :cond_7

    .line 337
    .line 338
    invoke-virtual {v4, v10}, Li0/h0;->k(Lfg/a;)V

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_7
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 343
    .line 344
    .line 345
    :goto_5
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 346
    .line 347
    invoke-static {v10, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 351
    .line 352
    invoke-static {v5, v4, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    sget-object v6, Lx1/f;->f:Lx1/e;

    .line 360
    .line 361
    invoke-static {v6, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    sget-object v5, Lx1/f;->g:Lx1/d;

    .line 365
    .line 366
    invoke-static {v5, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 367
    .line 368
    .line 369
    sget-object v5, Lx1/f;->c:Lx1/e;

    .line 370
    .line 371
    invoke-static {v5, v4, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    const v3, -0x478e7f18

    .line 375
    .line 376
    .line 377
    invoke-virtual {v4, v3}, Li0/h0;->a0(I)V

    .line 378
    .line 379
    .line 380
    iget-object v1, v1, Lfb/c;->j:Ljava/util/List;

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_a

    .line 391
    .line 392
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, Lfb/q1;

    .line 397
    .line 398
    sget-object v5, Lwb/y2;->n:Lwb/y2;

    .line 399
    .line 400
    invoke-virtual {v4, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    invoke-virtual {v4, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v9

    .line 408
    or-int/2addr v6, v9

    .line 409
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    if-nez v6, :cond_8

    .line 414
    .line 415
    sget-object v6, Li0/l;->a:Li0/e;

    .line 416
    .line 417
    if-ne v9, v6, :cond_9

    .line 418
    .line 419
    :cond_8
    new-instance v9, Lwb/xi;

    .line 420
    .line 421
    const/16 v6, 0x12

    .line 422
    .line 423
    invoke-direct {v9, v3, v6, v2}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_9
    check-cast v9, Lfg/a;

    .line 430
    .line 431
    const/16 v6, 0x180

    .line 432
    .line 433
    invoke-virtual {v5, v3, v9, v4, v6}, Lwb/y2;->p0(Lfb/q1;Lfg/a;Li0/h0;I)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_a
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 441
    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_b
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 445
    .line 446
    .line 447
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 448
    .line 449
    return-object v1

    .line 450
    :pswitch_2
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 451
    .line 452
    move-object v3, v1

    .line 453
    check-cast v3, Landroid/content/Context;

    .line 454
    .line 455
    iget-object v1, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 456
    .line 457
    move-object v4, v1

    .line 458
    check-cast v4, Ljava/lang/String;

    .line 459
    .line 460
    move-object/from16 v1, p1

    .line 461
    .line 462
    check-cast v1, Lh/b0;

    .line 463
    .line 464
    move-object/from16 v10, p2

    .line 465
    .line 466
    check-cast v10, Li0/h0;

    .line 467
    .line 468
    move-object/from16 v2, p3

    .line 469
    .line 470
    check-cast v2, Ljava/lang/Integer;

    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    and-int/lit8 v1, v2, 0x11

    .line 480
    .line 481
    const/16 v5, 0x10

    .line 482
    .line 483
    const/4 v6, 0x1

    .line 484
    if-eq v1, v5, :cond_c

    .line 485
    .line 486
    move v1, v6

    .line 487
    goto :goto_8

    .line 488
    :cond_c
    const/4 v1, 0x0

    .line 489
    :goto_8
    and-int/2addr v2, v6

    .line 490
    invoke-virtual {v10, v2, v1}, Li0/h0;->S(IZ)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_d

    .line 495
    .line 496
    sget-object v2, Lwb/y2;->i:Lwb/y2;

    .line 497
    .line 498
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 499
    .line 500
    invoke-virtual {v10, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Lbi/b;

    .line 505
    .line 506
    invoke-virtual {v1}, Lbi/b;->h()J

    .line 507
    .line 508
    .line 509
    move-result-wide v6

    .line 510
    const/16 v1, 0xc

    .line 511
    .line 512
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 513
    .line 514
    .line 515
    move-result-wide v8

    .line 516
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 517
    .line 518
    const/high16 v5, 0x3f800000    # 1.0f

    .line 519
    .line 520
    invoke-static {v1, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 521
    .line 522
    .line 523
    move-result-object v11

    .line 524
    const/16 v1, 0x19

    .line 525
    .line 526
    int-to-float v12, v1

    .line 527
    const/4 v1, 0x6

    .line 528
    int-to-float v15, v1

    .line 529
    const/16 v16, 0x6

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v14, 0x0

    .line 533
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    const v11, 0x186180

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v2 .. v11}, Lwb/y2;->D1(Landroid/content/Context;Ljava/lang/String;Ly0/o;JJLi0/h0;I)V

    .line 541
    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_d
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 545
    .line 546
    .line 547
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 548
    .line 549
    return-object v1

    .line 550
    :pswitch_3
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 551
    .line 552
    move-object v5, v1

    .line 553
    check-cast v5, Lfg/a;

    .line 554
    .line 555
    iget-object v1, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v1, Li0/a1;

    .line 558
    .line 559
    move-object/from16 v2, p1

    .line 560
    .line 561
    check-cast v2, Lth/a;

    .line 562
    .line 563
    move-object/from16 v8, p2

    .line 564
    .line 565
    check-cast v8, Li0/h0;

    .line 566
    .line 567
    move-object/from16 v3, p3

    .line 568
    .line 569
    check-cast v3, Ljava/lang/Integer;

    .line 570
    .line 571
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    and-int/lit8 v2, v3, 0x11

    .line 579
    .line 580
    const/16 v4, 0x10

    .line 581
    .line 582
    const/4 v6, 0x1

    .line 583
    if-eq v2, v4, :cond_e

    .line 584
    .line 585
    move v2, v6

    .line 586
    goto :goto_a

    .line 587
    :cond_e
    const/4 v2, 0x0

    .line 588
    :goto_a
    and-int/2addr v3, v6

    .line 589
    invoke-virtual {v8, v3, v2}, Li0/h0;->S(IZ)Z

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    if-eqz v2, :cond_10

    .line 594
    .line 595
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    sget-object v3, Li0/l;->a:Li0/e;

    .line 600
    .line 601
    if-ne v2, v3, :cond_f

    .line 602
    .line 603
    new-instance v2, Lwb/gl;

    .line 604
    .line 605
    const/16 v3, 0x16

    .line 606
    .line 607
    invoke-direct {v2, v1, v3}, Lwb/gl;-><init>(Li0/a1;I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :cond_f
    move-object v3, v2

    .line 614
    check-cast v3, Lfg/a;

    .line 615
    .line 616
    const/16 v9, 0x1b6

    .line 617
    .line 618
    const/16 v10, 0x30

    .line 619
    .line 620
    const-string v2, "\u4e0a\u4f20\u672c\u5730\u63d2\u4ef6"

    .line 621
    .line 622
    const-string v4, "\u8fd4\u56de"

    .line 623
    .line 624
    const/4 v6, 0x0

    .line 625
    const/4 v7, 0x0

    .line 626
    invoke-static/range {v2 .. v10}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 627
    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_10
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 631
    .line 632
    .line 633
    :goto_b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 634
    .line 635
    return-object v1

    .line 636
    :pswitch_4
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v1, Lwb/c3;

    .line 639
    .line 640
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v2, Lfg/l;

    .line 643
    .line 644
    move-object/from16 v3, p1

    .line 645
    .line 646
    check-cast v3, Lr/d;

    .line 647
    .line 648
    move-object/from16 v4, p2

    .line 649
    .line 650
    check-cast v4, Li0/h0;

    .line 651
    .line 652
    move-object/from16 v5, p3

    .line 653
    .line 654
    check-cast v5, Ljava/lang/Integer;

    .line 655
    .line 656
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    and-int/lit8 v3, v5, 0x11

    .line 664
    .line 665
    const/16 v6, 0x10

    .line 666
    .line 667
    const/4 v7, 0x1

    .line 668
    if-eq v3, v6, :cond_11

    .line 669
    .line 670
    move v3, v7

    .line 671
    goto :goto_c

    .line 672
    :cond_11
    const/4 v3, 0x0

    .line 673
    :goto_c
    and-int/2addr v5, v7

    .line 674
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 675
    .line 676
    .line 677
    move-result v3

    .line 678
    if-eqz v3, :cond_12

    .line 679
    .line 680
    iget-object v1, v1, Lwb/c3;->b:Ljava/util/List;

    .line 681
    .line 682
    const-string v3, "\u6682\u65e0\u529f\u80fd"

    .line 683
    .line 684
    const/16 v5, 0x30

    .line 685
    .line 686
    invoke-static {v1, v3, v2, v4, v5}, Lwb/ho;->H0(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 687
    .line 688
    .line 689
    goto :goto_d

    .line 690
    :cond_12
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 691
    .line 692
    .line 693
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 694
    .line 695
    return-object v1

    .line 696
    :pswitch_5
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v1, Lfg/a;

    .line 699
    .line 700
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v2, Lwb/t5;

    .line 703
    .line 704
    move-object/from16 v3, p1

    .line 705
    .line 706
    check-cast v3, Lp/u;

    .line 707
    .line 708
    move-object/from16 v4, p2

    .line 709
    .line 710
    check-cast v4, Li0/h0;

    .line 711
    .line 712
    move-object/from16 v5, p3

    .line 713
    .line 714
    check-cast v5, Ljava/lang/Integer;

    .line 715
    .line 716
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 717
    .line 718
    .line 719
    move-result v5

    .line 720
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    and-int/lit8 v3, v5, 0x11

    .line 724
    .line 725
    const/4 v6, 0x0

    .line 726
    const/4 v7, 0x1

    .line 727
    const/16 v8, 0x10

    .line 728
    .line 729
    if-eq v3, v8, :cond_13

    .line 730
    .line 731
    move v3, v7

    .line 732
    goto :goto_e

    .line 733
    :cond_13
    move v3, v6

    .line 734
    :goto_e
    and-int/2addr v5, v7

    .line 735
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-eqz v3, :cond_1b

    .line 740
    .line 741
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    sget-object v5, Li0/l;->a:Li0/e;

    .line 746
    .line 747
    if-ne v3, v5, :cond_14

    .line 748
    .line 749
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 750
    .line 751
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 752
    .line 753
    .line 754
    move-result-object v3

    .line 755
    invoke-virtual {v4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    :cond_14
    check-cast v3, Li0/a1;

    .line 759
    .line 760
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v9

    .line 764
    check-cast v9, Ljava/lang/Boolean;

    .line 765
    .line 766
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 767
    .line 768
    .line 769
    move-result v9

    .line 770
    invoke-static {v9, v4}, Lwb/ho;->L6(ZLi0/h0;)J

    .line 771
    .line 772
    .line 773
    move-result-wide v9

    .line 774
    sget-object v11, Ly0/l;->a:Ly0/l;

    .line 775
    .line 776
    const/high16 v12, 0x3f800000    # 1.0f

    .line 777
    .line 778
    invoke-static {v11, v12}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 779
    .line 780
    .line 781
    move-result-object v13

    .line 782
    const/16 v14, 0xc

    .line 783
    .line 784
    int-to-float v15, v14

    .line 785
    invoke-static {v15}, Lv/e;->a(F)Lv/d;

    .line 786
    .line 787
    .line 788
    move-result-object v12

    .line 789
    invoke-static {v13, v12}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 790
    .line 791
    .line 792
    move-result-object v12

    .line 793
    sget-object v13, Lf1/c0;->b:Lf1/m0;

    .line 794
    .line 795
    invoke-static {v12, v9, v10, v13}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 796
    .line 797
    .line 798
    move-result-object v9

    .line 799
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v10

    .line 803
    if-ne v10, v5, :cond_15

    .line 804
    .line 805
    new-instance v10, Lwb/gj;

    .line 806
    .line 807
    const/16 v5, 0x9

    .line 808
    .line 809
    invoke-direct {v10, v3, v5}, Lwb/gj;-><init>(Li0/a1;I)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    :cond_15
    check-cast v10, Lfg/l;

    .line 816
    .line 817
    invoke-static {v9, v1, v10}, Lwb/ho;->N6(Ly0/o;Lfg/a;Lfg/l;)Ly0/o;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    int-to-float v3, v8

    .line 822
    const/16 v5, 0xe

    .line 823
    .line 824
    int-to-float v5, v5

    .line 825
    invoke-static {v1, v3, v5}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    sget-object v3, Ly0/b;->q:Ly0/f;

    .line 830
    .line 831
    sget-object v5, Lp/j;->a:Lp/c;

    .line 832
    .line 833
    const/16 v8, 0x30

    .line 834
    .line 835
    invoke-static {v5, v3, v4, v8}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    iget-wide v8, v4, Li0/h0;->T:J

    .line 840
    .line 841
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 842
    .line 843
    .line 844
    move-result v5

    .line 845
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 846
    .line 847
    .line 848
    move-result-object v8

    .line 849
    invoke-static {v4, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    sget-object v9, Lx1/g;->f:Lx1/f;

    .line 854
    .line 855
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    sget-object v9, Lx1/f;->b:Lx1/y;

    .line 859
    .line 860
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 861
    .line 862
    .line 863
    iget-boolean v10, v4, Li0/h0;->S:Z

    .line 864
    .line 865
    if-eqz v10, :cond_16

    .line 866
    .line 867
    invoke-virtual {v4, v9}, Li0/h0;->k(Lfg/a;)V

    .line 868
    .line 869
    .line 870
    goto :goto_f

    .line 871
    :cond_16
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 872
    .line 873
    .line 874
    :goto_f
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 875
    .line 876
    invoke-static {v10, v4, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 880
    .line 881
    invoke-static {v3, v4, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 889
    .line 890
    invoke-static {v8, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    sget-object v5, Lx1/f;->g:Lx1/d;

    .line 894
    .line 895
    invoke-static {v5, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 896
    .line 897
    .line 898
    sget-object v12, Lx1/f;->c:Lx1/e;

    .line 899
    .line 900
    invoke-static {v12, v4, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    const/16 v1, 0x2a

    .line 904
    .line 905
    int-to-float v1, v1

    .line 906
    invoke-static {v11, v1}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    invoke-static {v15}, Lv/e;->a(F)Lv/d;

    .line 911
    .line 912
    .line 913
    move-result-object v11

    .line 914
    invoke-static {v1, v11}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    sget-object v11, Lbi/d;->a:Li0/m2;

    .line 919
    .line 920
    invoke-virtual {v4, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v16

    .line 924
    check-cast v16, Lbi/b;

    .line 925
    .line 926
    move/from16 v17, v15

    .line 927
    .line 928
    invoke-virtual/range {v16 .. v16}, Lbi/b;->k()J

    .line 929
    .line 930
    .line 931
    move-result-wide v14

    .line 932
    invoke-static {v1, v14, v15, v13}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    sget-object v13, Ly0/b;->k:Ly0/g;

    .line 937
    .line 938
    invoke-static {v13, v6}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 939
    .line 940
    .line 941
    move-result-object v13

    .line 942
    iget-wide v14, v4, Li0/h0;->T:J

    .line 943
    .line 944
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 945
    .line 946
    .line 947
    move-result v14

    .line 948
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 949
    .line 950
    .line 951
    move-result-object v15

    .line 952
    invoke-static {v4, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 957
    .line 958
    .line 959
    iget-boolean v6, v4, Li0/h0;->S:Z

    .line 960
    .line 961
    if-eqz v6, :cond_17

    .line 962
    .line 963
    invoke-virtual {v4, v9}, Li0/h0;->k(Lfg/a;)V

    .line 964
    .line 965
    .line 966
    goto :goto_10

    .line 967
    :cond_17
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 968
    .line 969
    .line 970
    :goto_10
    invoke-static {v10, v4, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    invoke-static {v3, v4, v15}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    invoke-static {v14, v4, v8, v4, v5}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 977
    .line 978
    .line 979
    invoke-static {v12, v4, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    iget-object v1, v2, Lwb/t5;->b:Ljava/lang/String;

    .line 983
    .line 984
    invoke-static {v7, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 989
    .line 990
    .line 991
    move-result v6

    .line 992
    if-nez v6, :cond_18

    .line 993
    .line 994
    const-string v1, "\u7b7e"

    .line 995
    .line 996
    :cond_18
    invoke-virtual {v4, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v6

    .line 1000
    check-cast v6, Lbi/b;

    .line 1001
    .line 1002
    invoke-virtual {v6}, Lbi/b;->f()J

    .line 1003
    .line 1004
    .line 1005
    move-result-wide v13

    .line 1006
    move-object v6, v10

    .line 1007
    sget-object v10, Lm2/k;->l:Lm2/k;

    .line 1008
    .line 1009
    const/16 v25, 0x0

    .line 1010
    .line 1011
    const v26, 0x3ffba

    .line 1012
    .line 1013
    .line 1014
    move-object v15, v5

    .line 1015
    const/4 v5, 0x0

    .line 1016
    move-object/from16 v18, v8

    .line 1017
    .line 1018
    move-object/from16 v16, v9

    .line 1019
    .line 1020
    const-wide/16 v8, 0x0

    .line 1021
    .line 1022
    move-object/from16 v19, v11

    .line 1023
    .line 1024
    const/4 v11, 0x0

    .line 1025
    move-object/from16 v20, v6

    .line 1026
    .line 1027
    move/from16 v21, v7

    .line 1028
    .line 1029
    move-wide v6, v13

    .line 1030
    move-object v14, v12

    .line 1031
    const-wide/16 v12, 0x0

    .line 1032
    .line 1033
    move-object/from16 v22, v14

    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    move-object/from16 v24, v15

    .line 1037
    .line 1038
    move-object/from16 v23, v16

    .line 1039
    .line 1040
    const-wide/16 v15, 0x0

    .line 1041
    .line 1042
    move/from16 v27, v17

    .line 1043
    .line 1044
    const/16 v17, 0x0

    .line 1045
    .line 1046
    move-object/from16 v28, v18

    .line 1047
    .line 1048
    const/16 v18, 0x0

    .line 1049
    .line 1050
    move-object/from16 v29, v19

    .line 1051
    .line 1052
    const/16 v19, 0x0

    .line 1053
    .line 1054
    move-object/from16 v30, v20

    .line 1055
    .line 1056
    const/16 v20, 0x0

    .line 1057
    .line 1058
    move/from16 v31, v21

    .line 1059
    .line 1060
    const/16 v21, 0x0

    .line 1061
    .line 1062
    move-object/from16 v32, v22

    .line 1063
    .line 1064
    const/16 v22, 0x0

    .line 1065
    .line 1066
    move-object/from16 v33, v24

    .line 1067
    .line 1068
    const/high16 v24, 0x180000

    .line 1069
    .line 1070
    move-object v0, v4

    .line 1071
    move-object v4, v1

    .line 1072
    move-object/from16 v1, v23

    .line 1073
    .line 1074
    move-object/from16 v23, v0

    .line 1075
    .line 1076
    move-object/from16 v36, v29

    .line 1077
    .line 1078
    move-object/from16 v0, v30

    .line 1079
    .line 1080
    move-object/from16 v35, v32

    .line 1081
    .line 1082
    move-object/from16 v34, v33

    .line 1083
    .line 1084
    const/16 v30, 0xc

    .line 1085
    .line 1086
    move-object/from16 v29, v28

    .line 1087
    .line 1088
    move-object/from16 v28, v2

    .line 1089
    .line 1090
    move/from16 v2, v31

    .line 1091
    .line 1092
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1093
    .line 1094
    .line 1095
    move-object/from16 v4, v23

    .line 1096
    .line 1097
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 1098
    .line 1099
    .line 1100
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1101
    .line 1102
    float-to-double v6, v5

    .line 1103
    const-wide/16 v8, 0x0

    .line 1104
    .line 1105
    cmpl-double v6, v6, v8

    .line 1106
    .line 1107
    if-lez v6, :cond_19

    .line 1108
    .line 1109
    goto :goto_11

    .line 1110
    :cond_19
    const-string v6, "invalid weight; must be greater than zero"

    .line 1111
    .line 1112
    invoke-static {v6}, Lq/a;->a(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    :goto_11
    new-instance v15, Lp/q0;

    .line 1116
    .line 1117
    invoke-direct {v15, v5, v2}, Lp/q0;-><init>(FZ)V

    .line 1118
    .line 1119
    .line 1120
    const/16 v19, 0x0

    .line 1121
    .line 1122
    const/16 v20, 0xe

    .line 1123
    .line 1124
    const/16 v17, 0x0

    .line 1125
    .line 1126
    const/16 v18, 0x0

    .line 1127
    .line 1128
    move/from16 v16, v27

    .line 1129
    .line 1130
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v5

    .line 1134
    sget-object v6, Lp/j;->c:Lp/e;

    .line 1135
    .line 1136
    sget-object v7, Ly0/b;->s:Ly0/e;

    .line 1137
    .line 1138
    const/4 v8, 0x0

    .line 1139
    invoke-static {v6, v7, v4, v8}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v6

    .line 1143
    iget-wide v7, v4, Li0/h0;->T:J

    .line 1144
    .line 1145
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 1146
    .line 1147
    .line 1148
    move-result v7

    .line 1149
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v8

    .line 1153
    invoke-static {v4, v5}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v5

    .line 1157
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 1158
    .line 1159
    .line 1160
    iget-boolean v9, v4, Li0/h0;->S:Z

    .line 1161
    .line 1162
    if-eqz v9, :cond_1a

    .line 1163
    .line 1164
    invoke-virtual {v4, v1}, Li0/h0;->k(Lfg/a;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_12

    .line 1168
    :cond_1a
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 1169
    .line 1170
    .line 1171
    :goto_12
    invoke-static {v0, v4, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1172
    .line 1173
    .line 1174
    invoke-static {v3, v4, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    move-object/from16 v0, v29

    .line 1178
    .line 1179
    move-object/from16 v15, v34

    .line 1180
    .line 1181
    invoke-static {v7, v4, v0, v4, v15}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 1182
    .line 1183
    .line 1184
    move-object/from16 v14, v35

    .line 1185
    .line 1186
    invoke-static {v14, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    move-object/from16 v0, v28

    .line 1190
    .line 1191
    iget-object v1, v0, Lwb/t5;->b:Ljava/lang/String;

    .line 1192
    .line 1193
    move-object/from16 v3, v36

    .line 1194
    .line 1195
    invoke-virtual {v4, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v5

    .line 1199
    check-cast v5, Lbi/b;

    .line 1200
    .line 1201
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 1202
    .line 1203
    .line 1204
    move-result-wide v6

    .line 1205
    sget-object v10, Lm2/k;->j:Lm2/k;

    .line 1206
    .line 1207
    const/16 v25, 0x0

    .line 1208
    .line 1209
    const v26, 0x3ffba

    .line 1210
    .line 1211
    .line 1212
    const/4 v5, 0x0

    .line 1213
    const-wide/16 v8, 0x0

    .line 1214
    .line 1215
    const/4 v11, 0x0

    .line 1216
    const-wide/16 v12, 0x0

    .line 1217
    .line 1218
    const/4 v14, 0x0

    .line 1219
    const-wide/16 v15, 0x0

    .line 1220
    .line 1221
    const/16 v17, 0x0

    .line 1222
    .line 1223
    const/16 v18, 0x0

    .line 1224
    .line 1225
    const/16 v19, 0x0

    .line 1226
    .line 1227
    const/16 v20, 0x0

    .line 1228
    .line 1229
    const/16 v21, 0x0

    .line 1230
    .line 1231
    const/16 v22, 0x0

    .line 1232
    .line 1233
    const/high16 v24, 0x180000

    .line 1234
    .line 1235
    move-object/from16 v23, v4

    .line 1236
    .line 1237
    move-object v4, v1

    .line 1238
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1239
    .line 1240
    .line 1241
    move-object/from16 v4, v23

    .line 1242
    .line 1243
    iget-object v0, v0, Lwb/t5;->c:Ljava/util/List;

    .line 1244
    .line 1245
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1246
    .line 1247
    .line 1248
    move-result v0

    .line 1249
    const-string v1, " \u4eba"

    .line 1250
    .line 1251
    invoke-static {v0, v1}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-virtual {v4, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    check-cast v1, Lbi/b;

    .line 1260
    .line 1261
    invoke-virtual {v1}, Lbi/b;->h()J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v6

    .line 1265
    invoke-static/range {v30 .. v30}, Lx6/d;->D(I)J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v8

    .line 1269
    const v26, 0x3ffea

    .line 1270
    .line 1271
    .line 1272
    const/4 v10, 0x0

    .line 1273
    const/16 v24, 0x6000

    .line 1274
    .line 1275
    move-object v4, v0

    .line 1276
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1277
    .line 1278
    .line 1279
    move-object/from16 v4, v23

    .line 1280
    .line 1281
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v4, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    check-cast v0, Lbi/b;

    .line 1289
    .line 1290
    invoke-virtual {v0}, Lbi/b;->h()J

    .line 1291
    .line 1292
    .line 1293
    move-result-wide v6

    .line 1294
    const/16 v0, 0x16

    .line 1295
    .line 1296
    invoke-static {v0}, Lx6/d;->D(I)J

    .line 1297
    .line 1298
    .line 1299
    move-result-wide v8

    .line 1300
    const-string v4, "\u203a"

    .line 1301
    .line 1302
    const/16 v24, 0x6006

    .line 1303
    .line 1304
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1305
    .line 1306
    .line 1307
    move-object/from16 v4, v23

    .line 1308
    .line 1309
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_13

    .line 1313
    :cond_1b
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1314
    .line 1315
    .line 1316
    :goto_13
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1317
    .line 1318
    return-object v0

    .line 1319
    :pswitch_6
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v1, Lsh/x;

    .line 1322
    .line 1323
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1324
    .line 1325
    move-object v4, v2

    .line 1326
    check-cast v4, Lr/z;

    .line 1327
    .line 1328
    move-object/from16 v2, p1

    .line 1329
    .line 1330
    check-cast v2, Lp/x0;

    .line 1331
    .line 1332
    move-object/from16 v12, p2

    .line 1333
    .line 1334
    check-cast v12, Li0/h0;

    .line 1335
    .line 1336
    move-object/from16 v3, p3

    .line 1337
    .line 1338
    check-cast v3, Ljava/lang/Integer;

    .line 1339
    .line 1340
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1341
    .line 1342
    .line 1343
    move-result v3

    .line 1344
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1345
    .line 1346
    .line 1347
    and-int/lit8 v5, v3, 0x6

    .line 1348
    .line 1349
    if-nez v5, :cond_1d

    .line 1350
    .line 1351
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v5

    .line 1355
    if-eqz v5, :cond_1c

    .line 1356
    .line 1357
    const/4 v5, 0x4

    .line 1358
    goto :goto_14

    .line 1359
    :cond_1c
    const/4 v5, 0x2

    .line 1360
    :goto_14
    or-int/2addr v3, v5

    .line 1361
    :cond_1d
    and-int/lit8 v5, v3, 0x13

    .line 1362
    .line 1363
    const/16 v6, 0x12

    .line 1364
    .line 1365
    const/4 v7, 0x1

    .line 1366
    if-eq v5, v6, :cond_1e

    .line 1367
    .line 1368
    move v5, v7

    .line 1369
    goto :goto_15

    .line 1370
    :cond_1e
    const/4 v5, 0x0

    .line 1371
    :goto_15
    and-int/2addr v3, v7

    .line 1372
    invoke-virtual {v12, v3, v5}, Li0/h0;->S(IZ)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v3

    .line 1376
    if-eqz v3, :cond_20

    .line 1377
    .line 1378
    sget-object v3, Lp/h1;->c:Lp/a0;

    .line 1379
    .line 1380
    iget-object v1, v1, Lsh/x;->e:Lm/a;

    .line 1381
    .line 1382
    const/4 v5, 0x0

    .line 1383
    invoke-static {v3, v1, v5}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v3

    .line 1387
    invoke-interface {v2}, Lp/x0;->c()F

    .line 1388
    .line 1389
    .line 1390
    move-result v1

    .line 1391
    const/16 v5, 0x8

    .line 1392
    .line 1393
    int-to-float v5, v5

    .line 1394
    add-float/2addr v1, v5

    .line 1395
    invoke-interface {v2}, Lp/x0;->a()F

    .line 1396
    .line 1397
    .line 1398
    move-result v2

    .line 1399
    const/16 v5, 0x54

    .line 1400
    .line 1401
    int-to-float v5, v5

    .line 1402
    add-float/2addr v2, v5

    .line 1403
    const/4 v5, 0x5

    .line 1404
    invoke-static {v1, v2, v5}, Lp/d;->b(FFI)Lp/z0;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v5

    .line 1408
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    sget-object v2, Li0/l;->a:Li0/e;

    .line 1413
    .line 1414
    if-ne v1, v2, :cond_1f

    .line 1415
    .line 1416
    new-instance v1, Lwb/jk;

    .line 1417
    .line 1418
    const/4 v2, 0x3

    .line 1419
    invoke-direct {v1, v2}, Lwb/jk;-><init>(I)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v12, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1423
    .line 1424
    .line 1425
    :cond_1f
    move-object v11, v1

    .line 1426
    check-cast v11, Lfg/l;

    .line 1427
    .line 1428
    const/high16 v13, 0x30000000

    .line 1429
    .line 1430
    const/16 v14, 0x1f8

    .line 1431
    .line 1432
    const/4 v6, 0x0

    .line 1433
    const/4 v7, 0x0

    .line 1434
    const/4 v8, 0x0

    .line 1435
    const/4 v9, 0x0

    .line 1436
    const/4 v10, 0x0

    .line 1437
    invoke-static/range {v3 .. v14}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1438
    .line 1439
    .line 1440
    goto :goto_16

    .line 1441
    :cond_20
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 1442
    .line 1443
    .line 1444
    :goto_16
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1445
    .line 1446
    return-object v1

    .line 1447
    :pswitch_7
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v1, Lwb/m5;

    .line 1450
    .line 1451
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1452
    .line 1453
    check-cast v2, Li0/a1;

    .line 1454
    .line 1455
    move-object/from16 v3, p1

    .line 1456
    .line 1457
    check-cast v3, Lr/d;

    .line 1458
    .line 1459
    move-object/from16 v4, p2

    .line 1460
    .line 1461
    check-cast v4, Li0/h0;

    .line 1462
    .line 1463
    move-object/from16 v5, p3

    .line 1464
    .line 1465
    check-cast v5, Ljava/lang/Integer;

    .line 1466
    .line 1467
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1468
    .line 1469
    .line 1470
    move-result v5

    .line 1471
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    and-int/lit8 v3, v5, 0x11

    .line 1475
    .line 1476
    const/16 v6, 0x10

    .line 1477
    .line 1478
    const/4 v7, 0x0

    .line 1479
    const/4 v8, 0x1

    .line 1480
    if-eq v3, v6, :cond_21

    .line 1481
    .line 1482
    move v3, v8

    .line 1483
    goto :goto_17

    .line 1484
    :cond_21
    move v3, v7

    .line 1485
    :goto_17
    and-int/2addr v5, v8

    .line 1486
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1487
    .line 1488
    .line 1489
    move-result v3

    .line 1490
    if-eqz v3, :cond_24

    .line 1491
    .line 1492
    iget-object v3, v1, Lwb/m5;->a:Lwb/s0;

    .line 1493
    .line 1494
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    check-cast v5, Ljava/util/Set;

    .line 1499
    .line 1500
    iget-object v6, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 1501
    .line 1502
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v5

    .line 1506
    invoke-virtual {v4, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v6

    .line 1510
    invoke-virtual {v4, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v8

    .line 1514
    or-int/2addr v6, v8

    .line 1515
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v8

    .line 1519
    if-nez v6, :cond_22

    .line 1520
    .line 1521
    sget-object v6, Li0/l;->a:Li0/e;

    .line 1522
    .line 1523
    if-ne v8, v6, :cond_23

    .line 1524
    .line 1525
    :cond_22
    new-instance v8, Lwb/x1;

    .line 1526
    .line 1527
    const/4 v6, 0x4

    .line 1528
    invoke-direct {v8, v3, v2, v6}, Lwb/x1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v4, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1532
    .line 1533
    .line 1534
    :cond_23
    check-cast v8, Lfg/a;

    .line 1535
    .line 1536
    invoke-static {v1, v5, v8, v4, v7}, Lwb/ho;->U1(Lwb/m5;ZLfg/a;Li0/h0;I)V

    .line 1537
    .line 1538
    .line 1539
    goto :goto_18

    .line 1540
    :cond_24
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1541
    .line 1542
    .line 1543
    :goto_18
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1544
    .line 1545
    return-object v1

    .line 1546
    :pswitch_8
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v1, Lx9/f;

    .line 1549
    .line 1550
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v2, Lfg/l;

    .line 1553
    .line 1554
    move-object/from16 v3, p1

    .line 1555
    .line 1556
    check-cast v3, Lr/d;

    .line 1557
    .line 1558
    move-object/from16 v4, p2

    .line 1559
    .line 1560
    check-cast v4, Li0/h0;

    .line 1561
    .line 1562
    move-object/from16 v5, p3

    .line 1563
    .line 1564
    check-cast v5, Ljava/lang/Integer;

    .line 1565
    .line 1566
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1567
    .line 1568
    .line 1569
    move-result v5

    .line 1570
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    and-int/lit8 v3, v5, 0x11

    .line 1574
    .line 1575
    const/16 v6, 0x10

    .line 1576
    .line 1577
    const/4 v7, 0x1

    .line 1578
    if-eq v3, v6, :cond_25

    .line 1579
    .line 1580
    move v3, v7

    .line 1581
    goto :goto_19

    .line 1582
    :cond_25
    const/4 v3, 0x0

    .line 1583
    :goto_19
    and-int/2addr v5, v7

    .line 1584
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v3

    .line 1588
    if-eqz v3, :cond_26

    .line 1589
    .line 1590
    new-instance v3, Lb0/q;

    .line 1591
    .line 1592
    const/16 v5, 0x17

    .line 1593
    .line 1594
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1595
    .line 1596
    .line 1597
    const v1, 0x5d7ce566

    .line 1598
    .line 1599
    .line 1600
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v1

    .line 1604
    const/16 v2, 0x30

    .line 1605
    .line 1606
    const/4 v3, 0x0

    .line 1607
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1608
    .line 1609
    .line 1610
    goto :goto_1a

    .line 1611
    :cond_26
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1612
    .line 1613
    .line 1614
    :goto_1a
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1615
    .line 1616
    return-object v1

    .line 1617
    :pswitch_9
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1618
    .line 1619
    check-cast v1, Ljava/util/ArrayList;

    .line 1620
    .line 1621
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1622
    .line 1623
    check-cast v2, Ljava/util/List;

    .line 1624
    .line 1625
    move-object/from16 v3, p1

    .line 1626
    .line 1627
    check-cast v3, Lr/d;

    .line 1628
    .line 1629
    move-object/from16 v4, p2

    .line 1630
    .line 1631
    check-cast v4, Li0/h0;

    .line 1632
    .line 1633
    move-object/from16 v5, p3

    .line 1634
    .line 1635
    check-cast v5, Ljava/lang/Integer;

    .line 1636
    .line 1637
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1638
    .line 1639
    .line 1640
    move-result v5

    .line 1641
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1642
    .line 1643
    .line 1644
    and-int/lit8 v3, v5, 0x11

    .line 1645
    .line 1646
    const/16 v6, 0x10

    .line 1647
    .line 1648
    const/4 v7, 0x1

    .line 1649
    if-eq v3, v6, :cond_27

    .line 1650
    .line 1651
    move v3, v7

    .line 1652
    goto :goto_1b

    .line 1653
    :cond_27
    const/4 v3, 0x0

    .line 1654
    :goto_1b
    and-int/2addr v5, v7

    .line 1655
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1656
    .line 1657
    .line 1658
    move-result v3

    .line 1659
    if-eqz v3, :cond_28

    .line 1660
    .line 1661
    const/16 v3, 0xa

    .line 1662
    .line 1663
    int-to-float v7, v3

    .line 1664
    const/4 v9, 0x0

    .line 1665
    const/16 v10, 0xd

    .line 1666
    .line 1667
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 1668
    .line 1669
    const/4 v6, 0x0

    .line 1670
    const/4 v8, 0x0

    .line 1671
    invoke-static/range {v5 .. v10}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v3

    .line 1675
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1676
    .line 1677
    .line 1678
    move-result v1

    .line 1679
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1680
    .line 1681
    .line 1682
    move-result v2

    .line 1683
    const-string v5, "/"

    .line 1684
    .line 1685
    const-string v6, " \u9879"

    .line 1686
    .line 1687
    const-string v7, "\u804a\u5929 \u00b7 "

    .line 1688
    .line 1689
    invoke-static {v1, v2, v7, v5, v6}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v1

    .line 1693
    const/16 v2, 0x30

    .line 1694
    .line 1695
    const/16 v5, 0xc

    .line 1696
    .line 1697
    invoke-static {v1, v3, v4, v2, v5}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1698
    .line 1699
    .line 1700
    goto :goto_1c

    .line 1701
    :cond_28
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1702
    .line 1703
    .line 1704
    :goto_1c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1705
    .line 1706
    return-object v1

    .line 1707
    :pswitch_a
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1708
    .line 1709
    check-cast v1, Lv8/a;

    .line 1710
    .line 1711
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1712
    .line 1713
    check-cast v2, Lfg/l;

    .line 1714
    .line 1715
    move-object/from16 v3, p1

    .line 1716
    .line 1717
    check-cast v3, Lr/d;

    .line 1718
    .line 1719
    move-object/from16 v4, p2

    .line 1720
    .line 1721
    check-cast v4, Li0/h0;

    .line 1722
    .line 1723
    move-object/from16 v5, p3

    .line 1724
    .line 1725
    check-cast v5, Ljava/lang/Integer;

    .line 1726
    .line 1727
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1728
    .line 1729
    .line 1730
    move-result v5

    .line 1731
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1732
    .line 1733
    .line 1734
    and-int/lit8 v3, v5, 0x11

    .line 1735
    .line 1736
    const/16 v6, 0x10

    .line 1737
    .line 1738
    const/4 v7, 0x1

    .line 1739
    if-eq v3, v6, :cond_29

    .line 1740
    .line 1741
    move v3, v7

    .line 1742
    goto :goto_1d

    .line 1743
    :cond_29
    const/4 v3, 0x0

    .line 1744
    :goto_1d
    and-int/2addr v5, v7

    .line 1745
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v3

    .line 1749
    if-eqz v3, :cond_2a

    .line 1750
    .line 1751
    new-instance v3, Lb0/q;

    .line 1752
    .line 1753
    const/16 v5, 0x16

    .line 1754
    .line 1755
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1756
    .line 1757
    .line 1758
    const v1, 0xab480f1

    .line 1759
    .line 1760
    .line 1761
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v1

    .line 1765
    const/16 v2, 0x30

    .line 1766
    .line 1767
    const/4 v3, 0x0

    .line 1768
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1769
    .line 1770
    .line 1771
    goto :goto_1e

    .line 1772
    :cond_2a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1773
    .line 1774
    .line 1775
    :goto_1e
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1776
    .line 1777
    return-object v1

    .line 1778
    :pswitch_b
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1779
    .line 1780
    check-cast v1, Ljava/util/List;

    .line 1781
    .line 1782
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1783
    .line 1784
    check-cast v2, Lfg/a;

    .line 1785
    .line 1786
    move-object/from16 v3, p1

    .line 1787
    .line 1788
    check-cast v3, Lr/d;

    .line 1789
    .line 1790
    move-object/from16 v4, p2

    .line 1791
    .line 1792
    check-cast v4, Li0/h0;

    .line 1793
    .line 1794
    move-object/from16 v5, p3

    .line 1795
    .line 1796
    check-cast v5, Ljava/lang/Integer;

    .line 1797
    .line 1798
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1799
    .line 1800
    .line 1801
    move-result v5

    .line 1802
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1803
    .line 1804
    .line 1805
    and-int/lit8 v3, v5, 0x11

    .line 1806
    .line 1807
    const/16 v6, 0x10

    .line 1808
    .line 1809
    const/4 v7, 0x1

    .line 1810
    if-eq v3, v6, :cond_2b

    .line 1811
    .line 1812
    move v3, v7

    .line 1813
    goto :goto_1f

    .line 1814
    :cond_2b
    const/4 v3, 0x0

    .line 1815
    :goto_1f
    and-int/2addr v5, v7

    .line 1816
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v3

    .line 1820
    if-eqz v3, :cond_2c

    .line 1821
    .line 1822
    new-instance v3, Lb0/q;

    .line 1823
    .line 1824
    const/16 v5, 0x18

    .line 1825
    .line 1826
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1827
    .line 1828
    .line 1829
    const v1, 0x52831c53

    .line 1830
    .line 1831
    .line 1832
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v1

    .line 1836
    const/16 v2, 0x30

    .line 1837
    .line 1838
    const/4 v3, 0x0

    .line 1839
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1840
    .line 1841
    .line 1842
    goto :goto_20

    .line 1843
    :cond_2c
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1844
    .line 1845
    .line 1846
    :goto_20
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1847
    .line 1848
    return-object v1

    .line 1849
    :pswitch_c
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1850
    .line 1851
    check-cast v1, Landroid/content/SharedPreferences;

    .line 1852
    .line 1853
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1854
    .line 1855
    check-cast v2, Lfg/a;

    .line 1856
    .line 1857
    move-object/from16 v3, p1

    .line 1858
    .line 1859
    check-cast v3, Lr/d;

    .line 1860
    .line 1861
    move-object/from16 v4, p2

    .line 1862
    .line 1863
    check-cast v4, Li0/h0;

    .line 1864
    .line 1865
    move-object/from16 v5, p3

    .line 1866
    .line 1867
    check-cast v5, Ljava/lang/Integer;

    .line 1868
    .line 1869
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1870
    .line 1871
    .line 1872
    move-result v5

    .line 1873
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1874
    .line 1875
    .line 1876
    and-int/lit8 v3, v5, 0x11

    .line 1877
    .line 1878
    const/16 v6, 0x10

    .line 1879
    .line 1880
    const/4 v7, 0x1

    .line 1881
    if-eq v3, v6, :cond_2d

    .line 1882
    .line 1883
    move v3, v7

    .line 1884
    goto :goto_21

    .line 1885
    :cond_2d
    const/4 v3, 0x0

    .line 1886
    :goto_21
    and-int/2addr v5, v7

    .line 1887
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v3

    .line 1891
    if-eqz v3, :cond_2e

    .line 1892
    .line 1893
    new-instance v3, Lb0/q;

    .line 1894
    .line 1895
    const/16 v5, 0x19

    .line 1896
    .line 1897
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1898
    .line 1899
    .line 1900
    const v1, 0x4b47c667    # 1.3092455E7f

    .line 1901
    .line 1902
    .line 1903
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v1

    .line 1907
    const/16 v2, 0x30

    .line 1908
    .line 1909
    const/4 v3, 0x0

    .line 1910
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1911
    .line 1912
    .line 1913
    goto :goto_22

    .line 1914
    :cond_2e
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1915
    .line 1916
    .line 1917
    :goto_22
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1918
    .line 1919
    return-object v1

    .line 1920
    :pswitch_d
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1921
    .line 1922
    check-cast v1, Ljava/lang/String;

    .line 1923
    .line 1924
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1925
    .line 1926
    check-cast v2, Lfg/a;

    .line 1927
    .line 1928
    move-object/from16 v3, p1

    .line 1929
    .line 1930
    check-cast v3, Lr/d;

    .line 1931
    .line 1932
    move-object/from16 v4, p2

    .line 1933
    .line 1934
    check-cast v4, Li0/h0;

    .line 1935
    .line 1936
    move-object/from16 v5, p3

    .line 1937
    .line 1938
    check-cast v5, Ljava/lang/Integer;

    .line 1939
    .line 1940
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1941
    .line 1942
    .line 1943
    move-result v5

    .line 1944
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1945
    .line 1946
    .line 1947
    and-int/lit8 v3, v5, 0x11

    .line 1948
    .line 1949
    const/16 v6, 0x10

    .line 1950
    .line 1951
    const/4 v7, 0x1

    .line 1952
    if-eq v3, v6, :cond_2f

    .line 1953
    .line 1954
    move v3, v7

    .line 1955
    goto :goto_23

    .line 1956
    :cond_2f
    const/4 v3, 0x0

    .line 1957
    :goto_23
    and-int/2addr v5, v7

    .line 1958
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 1959
    .line 1960
    .line 1961
    move-result v3

    .line 1962
    if-eqz v3, :cond_30

    .line 1963
    .line 1964
    new-instance v3, Lwb/rf;

    .line 1965
    .line 1966
    const/4 v5, 0x0

    .line 1967
    invoke-direct {v3, v1, v2, v5}, Lwb/rf;-><init>(Ljava/lang/String;Lfg/a;I)V

    .line 1968
    .line 1969
    .line 1970
    const v1, 0x189176ce

    .line 1971
    .line 1972
    .line 1973
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v1

    .line 1977
    const/16 v2, 0x30

    .line 1978
    .line 1979
    const/4 v3, 0x0

    .line 1980
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1981
    .line 1982
    .line 1983
    goto :goto_24

    .line 1984
    :cond_30
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1985
    .line 1986
    .line 1987
    :goto_24
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1988
    .line 1989
    return-object v1

    .line 1990
    :pswitch_e
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 1991
    .line 1992
    check-cast v1, Lwb/mu;

    .line 1993
    .line 1994
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 1995
    .line 1996
    check-cast v2, Li0/a1;

    .line 1997
    .line 1998
    move-object/from16 v3, p1

    .line 1999
    .line 2000
    check-cast v3, Lr/d;

    .line 2001
    .line 2002
    move-object/from16 v4, p2

    .line 2003
    .line 2004
    check-cast v4, Li0/h0;

    .line 2005
    .line 2006
    move-object/from16 v5, p3

    .line 2007
    .line 2008
    check-cast v5, Ljava/lang/Integer;

    .line 2009
    .line 2010
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2011
    .line 2012
    .line 2013
    move-result v5

    .line 2014
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2015
    .line 2016
    .line 2017
    and-int/lit8 v3, v5, 0x11

    .line 2018
    .line 2019
    const/16 v6, 0x10

    .line 2020
    .line 2021
    const/4 v7, 0x1

    .line 2022
    if-eq v3, v6, :cond_31

    .line 2023
    .line 2024
    move v3, v7

    .line 2025
    goto :goto_25

    .line 2026
    :cond_31
    const/4 v3, 0x0

    .line 2027
    :goto_25
    and-int/2addr v5, v7

    .line 2028
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 2029
    .line 2030
    .line 2031
    move-result v3

    .line 2032
    if-eqz v3, :cond_32

    .line 2033
    .line 2034
    new-instance v3, Lb0/q;

    .line 2035
    .line 2036
    const/16 v5, 0x15

    .line 2037
    .line 2038
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2039
    .line 2040
    .line 2041
    const v1, -0x323876a4

    .line 2042
    .line 2043
    .line 2044
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v1

    .line 2048
    const/16 v2, 0x30

    .line 2049
    .line 2050
    const/4 v3, 0x0

    .line 2051
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 2052
    .line 2053
    .line 2054
    goto :goto_26

    .line 2055
    :cond_32
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 2056
    .line 2057
    .line 2058
    :goto_26
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2059
    .line 2060
    return-object v1

    .line 2061
    :pswitch_f
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2062
    .line 2063
    check-cast v1, Ljava/util/Set;

    .line 2064
    .line 2065
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2066
    .line 2067
    check-cast v2, Li0/a1;

    .line 2068
    .line 2069
    move-object/from16 v3, p1

    .line 2070
    .line 2071
    check-cast v3, Lr/d;

    .line 2072
    .line 2073
    move-object/from16 v4, p2

    .line 2074
    .line 2075
    check-cast v4, Li0/h0;

    .line 2076
    .line 2077
    move-object/from16 v5, p3

    .line 2078
    .line 2079
    check-cast v5, Ljava/lang/Integer;

    .line 2080
    .line 2081
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2082
    .line 2083
    .line 2084
    move-result v5

    .line 2085
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2086
    .line 2087
    .line 2088
    and-int/lit8 v3, v5, 0x11

    .line 2089
    .line 2090
    const/16 v6, 0x10

    .line 2091
    .line 2092
    const/4 v7, 0x0

    .line 2093
    const/4 v8, 0x1

    .line 2094
    if-eq v3, v6, :cond_33

    .line 2095
    .line 2096
    move v3, v8

    .line 2097
    goto :goto_27

    .line 2098
    :cond_33
    move v3, v7

    .line 2099
    :goto_27
    and-int/2addr v5, v8

    .line 2100
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 2101
    .line 2102
    .line 2103
    move-result v3

    .line 2104
    if-eqz v3, :cond_35

    .line 2105
    .line 2106
    move-object v3, v1

    .line 2107
    check-cast v3, Ljava/util/Collection;

    .line 2108
    .line 2109
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 2110
    .line 2111
    .line 2112
    move-result v3

    .line 2113
    if-nez v3, :cond_34

    .line 2114
    .line 2115
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v2

    .line 2119
    check-cast v2, Lwb/t0;

    .line 2120
    .line 2121
    iget-object v2, v2, Lwb/t0;->h:Ljava/lang/String;

    .line 2122
    .line 2123
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 2124
    .line 2125
    .line 2126
    move-result v1

    .line 2127
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2128
    .line 2129
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2133
    .line 2134
    .line 2135
    const-string v2, " \u00b7 "

    .line 2136
    .line 2137
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2138
    .line 2139
    .line 2140
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2141
    .line 2142
    .line 2143
    const-string v1, " \u9879"

    .line 2144
    .line 2145
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2146
    .line 2147
    .line 2148
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v1

    .line 2152
    goto :goto_28

    .line 2153
    :cond_34
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v1

    .line 2157
    check-cast v1, Lwb/t0;

    .line 2158
    .line 2159
    iget-object v1, v1, Lwb/t0;->h:Ljava/lang/String;

    .line 2160
    .line 2161
    :goto_28
    invoke-static {v1, v4, v7}, Lwb/ho;->E2(Ljava/lang/String;Li0/h0;I)V

    .line 2162
    .line 2163
    .line 2164
    goto :goto_29

    .line 2165
    :cond_35
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 2166
    .line 2167
    .line 2168
    :goto_29
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2169
    .line 2170
    return-object v1

    .line 2171
    :pswitch_10
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2172
    .line 2173
    check-cast v1, Ljava/lang/String;

    .line 2174
    .line 2175
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2176
    .line 2177
    check-cast v2, Li0/a1;

    .line 2178
    .line 2179
    move-object/from16 v3, p1

    .line 2180
    .line 2181
    check-cast v3, Lr/d;

    .line 2182
    .line 2183
    move-object/from16 v4, p2

    .line 2184
    .line 2185
    check-cast v4, Li0/h0;

    .line 2186
    .line 2187
    move-object/from16 v5, p3

    .line 2188
    .line 2189
    check-cast v5, Ljava/lang/Integer;

    .line 2190
    .line 2191
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2192
    .line 2193
    .line 2194
    move-result v5

    .line 2195
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    and-int/lit8 v3, v5, 0x11

    .line 2199
    .line 2200
    const/16 v6, 0x10

    .line 2201
    .line 2202
    const/4 v7, 0x1

    .line 2203
    if-eq v3, v6, :cond_36

    .line 2204
    .line 2205
    move v3, v7

    .line 2206
    goto :goto_2a

    .line 2207
    :cond_36
    const/4 v3, 0x0

    .line 2208
    :goto_2a
    and-int/2addr v5, v7

    .line 2209
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v3

    .line 2213
    if-eqz v3, :cond_37

    .line 2214
    .line 2215
    new-instance v3, Lb0/q;

    .line 2216
    .line 2217
    const/16 v5, 0x1a

    .line 2218
    .line 2219
    invoke-direct {v3, v1, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2220
    .line 2221
    .line 2222
    const v1, 0x6419d64f

    .line 2223
    .line 2224
    .line 2225
    invoke-static {v1, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v1

    .line 2229
    const/16 v2, 0x30

    .line 2230
    .line 2231
    const/4 v3, 0x0

    .line 2232
    invoke-static {v3, v1, v4, v2, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 2233
    .line 2234
    .line 2235
    goto :goto_2b

    .line 2236
    :cond_37
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 2237
    .line 2238
    .line 2239
    :goto_2b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2240
    .line 2241
    return-object v1

    .line 2242
    :pswitch_11
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2243
    .line 2244
    check-cast v1, Ldb/f;

    .line 2245
    .line 2246
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2247
    .line 2248
    check-cast v2, Lc9/r0;

    .line 2249
    .line 2250
    move-object/from16 v3, p1

    .line 2251
    .line 2252
    check-cast v3, Ljava/lang/String;

    .line 2253
    .line 2254
    move-object/from16 v4, p2

    .line 2255
    .line 2256
    check-cast v4, Ljava/lang/String;

    .line 2257
    .line 2258
    move-object/from16 v5, p3

    .line 2259
    .line 2260
    check-cast v5, Ljava/lang/String;

    .line 2261
    .line 2262
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2266
    .line 2267
    .line 2268
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2269
    .line 2270
    .line 2271
    invoke-virtual {v1, v3, v4, v5}, Ldb/f;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    invoke-virtual {v2}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    :goto_2c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2278
    .line 2279
    return-object v1

    .line 2280
    :pswitch_12
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2281
    .line 2282
    check-cast v1, Ljava/util/ArrayList;

    .line 2283
    .line 2284
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2285
    .line 2286
    check-cast v2, Li0/a1;

    .line 2287
    .line 2288
    move-object/from16 v3, p1

    .line 2289
    .line 2290
    check-cast v3, Lr/d;

    .line 2291
    .line 2292
    move-object/from16 v4, p2

    .line 2293
    .line 2294
    check-cast v4, Li0/h0;

    .line 2295
    .line 2296
    move-object/from16 v5, p3

    .line 2297
    .line 2298
    check-cast v5, Ljava/lang/Integer;

    .line 2299
    .line 2300
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2301
    .line 2302
    .line 2303
    move-result v5

    .line 2304
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2305
    .line 2306
    .line 2307
    and-int/lit8 v3, v5, 0x11

    .line 2308
    .line 2309
    const/16 v6, 0x10

    .line 2310
    .line 2311
    const/4 v7, 0x0

    .line 2312
    const/4 v8, 0x1

    .line 2313
    if-eq v3, v6, :cond_38

    .line 2314
    .line 2315
    move v3, v8

    .line 2316
    goto :goto_2d

    .line 2317
    :cond_38
    move v3, v7

    .line 2318
    :goto_2d
    and-int/2addr v5, v8

    .line 2319
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 2320
    .line 2321
    .line 2322
    move-result v3

    .line 2323
    if-eqz v3, :cond_3a

    .line 2324
    .line 2325
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2326
    .line 2327
    .line 2328
    move-result v3

    .line 2329
    if-nez v3, :cond_39

    .line 2330
    .line 2331
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v2

    .line 2335
    check-cast v2, Lwb/t0;

    .line 2336
    .line 2337
    iget-object v2, v2, Lwb/t0;->h:Ljava/lang/String;

    .line 2338
    .line 2339
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2340
    .line 2341
    .line 2342
    move-result v1

    .line 2343
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2344
    .line 2345
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2346
    .line 2347
    .line 2348
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2349
    .line 2350
    .line 2351
    const-string v2, " \u00b7 "

    .line 2352
    .line 2353
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2354
    .line 2355
    .line 2356
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2357
    .line 2358
    .line 2359
    const-string v1, " \u9879"

    .line 2360
    .line 2361
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v1

    .line 2368
    goto :goto_2e

    .line 2369
    :cond_39
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v1

    .line 2373
    check-cast v1, Lwb/t0;

    .line 2374
    .line 2375
    iget-object v1, v1, Lwb/t0;->h:Ljava/lang/String;

    .line 2376
    .line 2377
    :goto_2e
    invoke-static {v1, v4, v7}, Lwb/ho;->E2(Ljava/lang/String;Li0/h0;I)V

    .line 2378
    .line 2379
    .line 2380
    goto :goto_2f

    .line 2381
    :cond_3a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 2382
    .line 2383
    .line 2384
    :goto_2f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2385
    .line 2386
    return-object v1

    .line 2387
    :pswitch_13
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2388
    .line 2389
    check-cast v1, Landroid/text/Spannable;

    .line 2390
    .line 2391
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2392
    .line 2393
    check-cast v2, Lq2/c;

    .line 2394
    .line 2395
    move-object/from16 v3, p1

    .line 2396
    .line 2397
    check-cast v3, Li2/f0;

    .line 2398
    .line 2399
    move-object/from16 v4, p2

    .line 2400
    .line 2401
    check-cast v4, Ljava/lang/Integer;

    .line 2402
    .line 2403
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2404
    .line 2405
    .line 2406
    move-result v4

    .line 2407
    move-object/from16 v5, p3

    .line 2408
    .line 2409
    check-cast v5, Ljava/lang/Integer;

    .line 2410
    .line 2411
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2412
    .line 2413
    .line 2414
    move-result v5

    .line 2415
    new-instance v6, Ll2/b;

    .line 2416
    .line 2417
    iget-object v7, v3, Li2/f0;->f:Lm2/p;

    .line 2418
    .line 2419
    iget-object v8, v3, Li2/f0;->c:Lm2/k;

    .line 2420
    .line 2421
    if-nez v8, :cond_3b

    .line 2422
    .line 2423
    sget-object v8, Lm2/k;->i:Lm2/k;

    .line 2424
    .line 2425
    :cond_3b
    iget-object v9, v3, Li2/f0;->d:Lm2/i;

    .line 2426
    .line 2427
    if-eqz v9, :cond_3c

    .line 2428
    .line 2429
    iget v9, v9, Lm2/i;->a:I

    .line 2430
    .line 2431
    goto :goto_30

    .line 2432
    :cond_3c
    const/4 v9, 0x0

    .line 2433
    :goto_30
    iget-object v3, v3, Li2/f0;->e:Lm2/j;

    .line 2434
    .line 2435
    if-eqz v3, :cond_3d

    .line 2436
    .line 2437
    iget v3, v3, Lm2/j;->a:I

    .line 2438
    .line 2439
    goto :goto_31

    .line 2440
    :cond_3d
    const v3, 0xffff

    .line 2441
    .line 2442
    .line 2443
    :goto_31
    iget-object v2, v2, Lq2/c;->h:Ljava/lang/Object;

    .line 2444
    .line 2445
    check-cast v2, Lq2/d;

    .line 2446
    .line 2447
    iget-object v10, v2, Lq2/d;->e:Lm2/d;

    .line 2448
    .line 2449
    check-cast v10, Lm2/e;

    .line 2450
    .line 2451
    invoke-virtual {v10, v7, v8, v9, v3}, Lm2/e;->b(Lm2/p;Lm2/k;II)Lm2/r;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v3

    .line 2455
    instance-of v7, v3, Lm2/r;

    .line 2456
    .line 2457
    if-nez v7, :cond_3e

    .line 2458
    .line 2459
    new-instance v7, Lb5/c;

    .line 2460
    .line 2461
    iget-object v8, v2, Lq2/d;->j:Lb5/c;

    .line 2462
    .line 2463
    invoke-direct {v7, v3, v8}, Lb5/c;-><init>(Lm2/r;Lb5/c;)V

    .line 2464
    .line 2465
    .line 2466
    iput-object v7, v2, Lq2/d;->j:Lb5/c;

    .line 2467
    .line 2468
    iget-object v2, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 2469
    .line 2470
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2471
    .line 2472
    .line 2473
    check-cast v2, Landroid/graphics/Typeface;

    .line 2474
    .line 2475
    goto :goto_32

    .line 2476
    :cond_3e
    iget-object v2, v3, Lm2/r;->g:Ljava/lang/Object;

    .line 2477
    .line 2478
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2479
    .line 2480
    .line 2481
    check-cast v2, Landroid/graphics/Typeface;

    .line 2482
    .line 2483
    :goto_32
    const/4 v3, 0x1

    .line 2484
    invoke-direct {v6, v2, v3}, Ll2/b;-><init>(Ljava/lang/Object;I)V

    .line 2485
    .line 2486
    .line 2487
    const/16 v2, 0x21

    .line 2488
    .line 2489
    invoke-interface {v1, v6, v4, v5, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2490
    .line 2491
    .line 2492
    goto/16 :goto_2c

    .line 2493
    .line 2494
    :pswitch_14
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2495
    .line 2496
    check-cast v1, Lfg/l;

    .line 2497
    .line 2498
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2499
    .line 2500
    check-cast v2, Ll/d;

    .line 2501
    .line 2502
    move-object/from16 v3, p1

    .line 2503
    .line 2504
    check-cast v3, Lp/u;

    .line 2505
    .line 2506
    move-object/from16 v3, p2

    .line 2507
    .line 2508
    check-cast v3, Li0/h0;

    .line 2509
    .line 2510
    move-object/from16 v4, p3

    .line 2511
    .line 2512
    check-cast v4, Ljava/lang/Integer;

    .line 2513
    .line 2514
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2515
    .line 2516
    .line 2517
    move-result v4

    .line 2518
    and-int/lit8 v5, v4, 0x11

    .line 2519
    .line 2520
    const/16 v6, 0x10

    .line 2521
    .line 2522
    const/4 v7, 0x0

    .line 2523
    const/4 v8, 0x1

    .line 2524
    if-eq v5, v6, :cond_3f

    .line 2525
    .line 2526
    move v5, v8

    .line 2527
    goto :goto_33

    .line 2528
    :cond_3f
    move v5, v7

    .line 2529
    :goto_33
    and-int/2addr v4, v8

    .line 2530
    invoke-virtual {v3, v4, v5}, Li0/h0;->S(IZ)Z

    .line 2531
    .line 2532
    .line 2533
    move-result v4

    .line 2534
    if-eqz v4, :cond_41

    .line 2535
    .line 2536
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v4

    .line 2540
    sget-object v5, Li0/l;->a:Li0/e;

    .line 2541
    .line 2542
    if-ne v4, v5, :cond_40

    .line 2543
    .line 2544
    new-instance v4, Ll/e;

    .line 2545
    .line 2546
    invoke-direct {v4}, Ll/e;-><init>()V

    .line 2547
    .line 2548
    .line 2549
    invoke-virtual {v3, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2550
    .line 2551
    .line 2552
    :cond_40
    check-cast v4, Ll/e;

    .line 2553
    .line 2554
    iget-object v5, v4, Ll/e;->a:Lw0/p;

    .line 2555
    .line 2556
    invoke-virtual {v5}, Lw0/p;->clear()V

    .line 2557
    .line 2558
    .line 2559
    invoke-interface {v1, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2560
    .line 2561
    .line 2562
    invoke-virtual {v4, v2, v3, v7}, Ll/e;->a(Ll/d;Li0/h0;I)V

    .line 2563
    .line 2564
    .line 2565
    goto :goto_34

    .line 2566
    :cond_41
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 2567
    .line 2568
    .line 2569
    :goto_34
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2570
    .line 2571
    return-object v1

    .line 2572
    :pswitch_15
    iget-object v1, v0, Ldb/f;->h:Ljava/lang/Object;

    .line 2573
    .line 2574
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2575
    .line 2576
    iget-object v2, v0, Ldb/f;->i:Ljava/lang/Object;

    .line 2577
    .line 2578
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 2579
    .line 2580
    move-object/from16 v3, p1

    .line 2581
    .line 2582
    check-cast v3, Ljava/lang/Integer;

    .line 2583
    .line 2584
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2585
    .line 2586
    .line 2587
    move-result v3

    .line 2588
    move-object/from16 v4, p2

    .line 2589
    .line 2590
    check-cast v4, Ljava/lang/Integer;

    .line 2591
    .line 2592
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2593
    .line 2594
    .line 2595
    move-object/from16 v4, p3

    .line 2596
    .line 2597
    check-cast v4, Ljava/lang/Boolean;

    .line 2598
    .line 2599
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2600
    .line 2601
    .line 2602
    if-gez v3, :cond_42

    .line 2603
    .line 2604
    const/4 v3, 0x0

    .line 2605
    :cond_42
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 2606
    .line 2607
    .line 2608
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 2609
    .line 2610
    .line 2611
    goto/16 :goto_2c

    .line 2612
    .line 2613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
