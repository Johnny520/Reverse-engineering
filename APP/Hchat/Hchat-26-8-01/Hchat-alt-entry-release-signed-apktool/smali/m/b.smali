.class public final synthetic Lm/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lm/b;->g:I

    iput-object p1, p0, Lm/b;->h:Ljava/lang/Object;

    iput-object p3, p0, Lm/b;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Lm/b;->g:I

    iput-object p2, p0, Lm/b;->h:Ljava/lang/Object;

    iput-object p3, p0, Lm/b;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Lhb/r;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p2, 0x9

    .line 2
    .line 3
    iput p2, p0, Lm/b;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lm/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lm/b;->i:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm/b;->g:I

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x5

    .line 9
    const/4 v5, 0x4

    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x0

    .line 14
    const/16 v12, 0x20

    .line 15
    .line 16
    const/4 v13, 0x0

    .line 17
    const/4 v14, 0x1

    .line 18
    sget-object v15, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    const-wide v16, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-object v8, v0, Lm/b;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v9, v0, Lm/b;->h:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v9, Li0/j1;

    .line 33
    .line 34
    check-cast v8, Lwb/x2;

    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, Lvb/a;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lwb/s2;

    .line 44
    .line 45
    check-cast v8, Lwb/t2;

    .line 46
    .line 47
    iget-object v3, v8, Lwb/t2;->a:Lwb/c3;

    .line 48
    .line 49
    invoke-direct {v2, v1, v3, v5}, Lwb/s2;-><init>(Lvb/a;Lwb/c3;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v15

    .line 56
    :pswitch_0
    check-cast v9, Lwb/x4;

    .line 57
    .line 58
    check-cast v8, Landroid/content/Context;

    .line 59
    .line 60
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const-string v2, "https://"

    .line 69
    .line 70
    iget-object v3, v9, Lwb/x4;->a:Li2/g;

    .line 71
    .line 72
    iget-object v3, v3, Li2/g;->g:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    new-instance v4, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    move v6, v13

    .line 90
    :goto_0
    if-ge v6, v5, :cond_2

    .line 91
    .line 92
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Li2/e;

    .line 97
    .line 98
    iget-object v9, v7, Li2/e;->a:Ljava/lang/Object;

    .line 99
    .line 100
    iget v10, v7, Li2/e;->c:I

    .line 101
    .line 102
    iget v11, v7, Li2/e;->b:I

    .line 103
    .line 104
    iget-object v12, v7, Li2/e;->d:Ljava/lang/String;

    .line 105
    .line 106
    instance-of v9, v9, Li2/h0;

    .line 107
    .line 108
    if-eqz v9, :cond_0

    .line 109
    .line 110
    const-string v9, "md_link"

    .line 111
    .line 112
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_0

    .line 117
    .line 118
    invoke-static {v1, v1, v11, v10}, Li2/h;->b(IIII)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_0

    .line 123
    .line 124
    new-instance v9, Li2/e;

    .line 125
    .line 126
    iget-object v7, v7, Li2/e;->a:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast v7, Li2/h0;

    .line 132
    .line 133
    iget-object v7, v7, Li2/h0;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {v9, v12, v11, v10, v7}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 145
    .line 146
    :cond_2
    invoke-static {v4}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Li2/e;

    .line 151
    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    iget-object v1, v1, Li2/e;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_3

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    :try_start_0
    const-string v3, "://"

    .line 174
    .line 175
    invoke-static {v1, v3, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_4

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :goto_1
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    new-instance v2, Landroid/content/Intent;

    .line 191
    .line 192
    const-string v3, "android.intent.action.VIEW"

    .line 193
    .line 194
    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 195
    .line 196
    .line 197
    const/high16 v1, 0x10000000

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    .line 208
    .line 209
    :catchall_0
    :cond_5
    :goto_2
    return-object v15

    .line 210
    :pswitch_1
    check-cast v9, Luh/b;

    .line 211
    .line 212
    check-cast v8, Lxb/i;

    .line 213
    .line 214
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, Lth/g;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8}, Lxb/i;->a()F

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v9, v1, v11, v4}, Luh/b;->a(Luh/b;FLuh/a;I)Luh/b;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    return-object v1

    .line 230
    :pswitch_2
    check-cast v9, Ljava/util/List;

    .line 231
    .line 232
    check-cast v8, Ljava/util/List;

    .line 233
    .line 234
    move-object/from16 v1, p1

    .line 235
    .line 236
    check-cast v1, Lv1/a1;

    .line 237
    .line 238
    if-eqz v9, :cond_6

    .line 239
    .line 240
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    move v3, v13

    .line 245
    :goto_3
    if-ge v3, v2, :cond_6

    .line 246
    .line 247
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    check-cast v4, Lsf/e;

    .line 252
    .line 253
    iget-object v5, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v5, Lv1/b1;

    .line 256
    .line 257
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v4, Lu2/j;

    .line 260
    .line 261
    iget-wide v10, v4, Lu2/j;->a:J

    .line 262
    .line 263
    invoke-static {v1, v5, v10, v11}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 264
    .line 265
    .line 266
    add-int/lit8 v3, v3, 0x1

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_6
    if-eqz v8, :cond_8

    .line 270
    .line 271
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    :goto_4
    if-ge v13, v2, :cond_8

    .line 276
    .line 277
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Lsf/e;

    .line 282
    .line 283
    iget-object v4, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v4, Lv1/b1;

    .line 286
    .line 287
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v3, Lfg/a;

    .line 290
    .line 291
    if-eqz v3, :cond_7

    .line 292
    .line 293
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, Lu2/j;

    .line 298
    .line 299
    iget-wide v9, v3, Lu2/j;->a:J

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_7
    move-wide v9, v6

    .line 303
    :goto_5
    invoke-static {v1, v4, v9, v10}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v13, v13, 0x1

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_8
    return-object v15

    .line 310
    :pswitch_3
    check-cast v9, Lw/n1;

    .line 311
    .line 312
    check-cast v8, Li2/e;

    .line 313
    .line 314
    move-object/from16 v1, p1

    .line 315
    .line 316
    check-cast v1, Lf1/d0;

    .line 317
    .line 318
    iget-object v2, v9, Lw/n1;->b:Li2/g;

    .line 319
    .line 320
    iget-object v3, v9, Lw/n1;->a:Li0/j1;

    .line 321
    .line 322
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    check-cast v4, Li2/k0;

    .line 327
    .line 328
    if-eqz v4, :cond_9

    .line 329
    .line 330
    iget-object v4, v4, Li2/k0;->a:Li2/j0;

    .line 331
    .line 332
    if-eqz v4, :cond_9

    .line 333
    .line 334
    iget-object v4, v4, Li2/j0;->a:Li2/g;

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_9
    move-object v4, v11

    .line 338
    :goto_6
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_b

    .line 343
    .line 344
    :cond_a
    :goto_7
    move-object v6, v11

    .line 345
    goto :goto_8

    .line 346
    :cond_b
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Li2/k0;

    .line 351
    .line 352
    if-eqz v2, :cond_a

    .line 353
    .line 354
    iget-object v3, v2, Li2/k0;->b:Li2/o;

    .line 355
    .line 356
    invoke-static {v8, v2}, Lw/n1;->c(Li2/e;Li2/k0;)Li2/e;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    if-nez v4, :cond_c

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_c
    iget v5, v4, Li2/e;->c:I

    .line 364
    .line 365
    iget v4, v4, Li2/e;->b:I

    .line 366
    .line 367
    invoke-virtual {v2, v4, v5}, Li2/k0;->i(II)Lf1/j;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-virtual {v2, v4}, Li2/k0;->b(I)Le1/c;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    sub-int/2addr v5, v14

    .line 376
    invoke-virtual {v2, v5}, Li2/k0;->b(I)Le1/c;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v3, v4}, Li2/o;->d(I)I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    invoke-virtual {v3, v5}, Li2/o;->d(I)I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    if-ne v4, v3, :cond_d

    .line 389
    .line 390
    iget v2, v2, Le1/c;->a:F

    .line 391
    .line 392
    iget v3, v7, Le1/c;->a:F

    .line 393
    .line 394
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    :cond_d
    iget v2, v7, Le1/c;->b:F

    .line 399
    .line 400
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    int-to-long v3, v3

    .line 405
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    int-to-long v7, v2

    .line 410
    shl-long v2, v3, v12

    .line 411
    .line 412
    and-long v4, v7, v16

    .line 413
    .line 414
    or-long/2addr v2, v4

    .line 415
    const-wide v4, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    xor-long/2addr v2, v4

    .line 421
    invoke-virtual {v6, v2, v3}, Lf1/j;->i(J)V

    .line 422
    .line 423
    .line 424
    :goto_8
    if-eqz v6, :cond_e

    .line 425
    .line 426
    new-instance v11, Lvh/e;

    .line 427
    .line 428
    invoke-direct {v11, v6, v14}, Lvh/e;-><init>(Ljava/lang/Object;I)V

    .line 429
    .line 430
    .line 431
    :cond_e
    if-eqz v11, :cond_f

    .line 432
    .line 433
    invoke-interface {v1, v11}, Lf1/d0;->Q0(Lf1/r0;)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v1, v14}, Lf1/d0;->r(Z)V

    .line 437
    .line 438
    .line 439
    :cond_f
    return-object v15

    .line 440
    :pswitch_4
    check-cast v9, Li2/e;

    .line 441
    .line 442
    check-cast v8, Lw/r0;

    .line 443
    .line 444
    iget-object v1, v8, Lw/r0;->b:Li0/g1;

    .line 445
    .line 446
    move-object/from16 v2, p1

    .line 447
    .line 448
    check-cast v2, Lw/v0;

    .line 449
    .line 450
    iget-object v4, v9, Li2/e;->a:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v4, Li2/m;

    .line 453
    .line 454
    invoke-virtual {v4}, Li2/m;->a()Li2/l0;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    if-eqz v6, :cond_10

    .line 459
    .line 460
    iget-object v6, v6, Li2/l0;->a:Li2/f0;

    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_10
    move-object v6, v11

    .line 464
    :goto_9
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    and-int/2addr v7, v14

    .line 469
    if-eqz v7, :cond_11

    .line 470
    .line 471
    invoke-virtual {v4}, Li2/m;->a()Li2/l0;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    if-eqz v7, :cond_11

    .line 476
    .line 477
    iget-object v7, v7, Li2/l0;->b:Li2/f0;

    .line 478
    .line 479
    goto :goto_a

    .line 480
    :cond_11
    move-object v7, v11

    .line 481
    :goto_a
    if-eqz v6, :cond_12

    .line 482
    .line 483
    invoke-virtual {v6, v7}, Li2/f0;->c(Li2/f0;)Li2/f0;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    :cond_12
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    and-int/2addr v3, v6

    .line 492
    if-eqz v3, :cond_13

    .line 493
    .line 494
    invoke-virtual {v4}, Li2/m;->a()Li2/l0;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    if-eqz v3, :cond_13

    .line 499
    .line 500
    iget-object v3, v3, Li2/l0;->c:Li2/f0;

    .line 501
    .line 502
    goto :goto_b

    .line 503
    :cond_13
    move-object v3, v11

    .line 504
    :goto_b
    if-eqz v7, :cond_14

    .line 505
    .line 506
    invoke-virtual {v7, v3}, Li2/f0;->c(Li2/f0;)Li2/f0;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    :cond_14
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    and-int/2addr v1, v5

    .line 515
    if-eqz v1, :cond_15

    .line 516
    .line 517
    invoke-virtual {v4}, Li2/m;->a()Li2/l0;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    if-eqz v1, :cond_15

    .line 522
    .line 523
    iget-object v11, v1, Li2/l0;->d:Li2/f0;

    .line 524
    .line 525
    :cond_15
    if-eqz v3, :cond_16

    .line 526
    .line 527
    invoke-virtual {v3, v11}, Li2/f0;->c(Li2/f0;)Li2/f0;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    :cond_16
    new-instance v1, Lgg/q;

    .line 532
    .line 533
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 534
    .line 535
    .line 536
    iget-object v3, v2, Lw/v0;->a:Li2/g;

    .line 537
    .line 538
    new-instance v4, Lb0/s;

    .line 539
    .line 540
    const/16 v5, 0x16

    .line 541
    .line 542
    invoke-direct {v4, v1, v9, v11, v5}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    new-instance v1, Li2/d;

    .line 549
    .line 550
    invoke-direct {v1, v3}, Li2/d;-><init>(Li2/g;)V

    .line 551
    .line 552
    .line 553
    iget-object v3, v1, Li2/d;->i:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    :goto_c
    if-ge v13, v5, :cond_17

    .line 560
    .line 561
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v6, Li2/c;

    .line 566
    .line 567
    const/high16 v7, -0x80000000

    .line 568
    .line 569
    invoke-virtual {v6, v7}, Li2/c;->a(I)Li2/e;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    invoke-virtual {v4, v6}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    check-cast v6, Li2/e;

    .line 578
    .line 579
    new-instance v7, Li2/c;

    .line 580
    .line 581
    iget-object v8, v6, Li2/e;->a:Ljava/lang/Object;

    .line 582
    .line 583
    iget v9, v6, Li2/e;->b:I

    .line 584
    .line 585
    iget v10, v6, Li2/e;->c:I

    .line 586
    .line 587
    iget-object v6, v6, Li2/e;->d:Ljava/lang/String;

    .line 588
    .line 589
    invoke-direct {v7, v6, v9, v10, v8}, Li2/c;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3, v13, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    add-int/lit8 v13, v13, 0x1

    .line 596
    .line 597
    goto :goto_c

    .line 598
    :cond_17
    invoke-virtual {v1}, Li2/d;->e()Li2/g;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    iput-object v1, v2, Lw/v0;->b:Li2/g;

    .line 603
    .line 604
    return-object v15

    .line 605
    :pswitch_5
    check-cast v9, Ljava/util/List;

    .line 606
    .line 607
    check-cast v8, Lw/s0;

    .line 608
    .line 609
    move-object/from16 v1, p1

    .line 610
    .line 611
    check-cast v1, Lv1/a1;

    .line 612
    .line 613
    iget-object v2, v8, Lw/s0;->a:Lfg/a;

    .line 614
    .line 615
    invoke-static {v9, v2}, Lw/s;->m(Ljava/util/List;Lfg/a;)Ljava/util/ArrayList;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    if-eqz v2, :cond_19

    .line 620
    .line 621
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    :goto_d
    if-ge v13, v3, :cond_19

    .line 626
    .line 627
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    check-cast v4, Lsf/e;

    .line 632
    .line 633
    iget-object v5, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v5, Lv1/b1;

    .line 636
    .line 637
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v4, Lfg/a;

    .line 640
    .line 641
    if-eqz v4, :cond_18

    .line 642
    .line 643
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    check-cast v4, Lu2/j;

    .line 648
    .line 649
    iget-wide v8, v4, Lu2/j;->a:J

    .line 650
    .line 651
    goto :goto_e

    .line 652
    :cond_18
    move-wide v8, v6

    .line 653
    :goto_e
    invoke-static {v1, v5, v8, v9}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 654
    .line 655
    .line 656
    add-int/lit8 v13, v13, 0x1

    .line 657
    .line 658
    goto :goto_d

    .line 659
    :cond_19
    return-object v15

    .line 660
    :pswitch_6
    check-cast v9, Lw/q0;

    .line 661
    .line 662
    move-object/from16 v17, v8

    .line 663
    .line 664
    check-cast v17, Lf1/s;

    .line 665
    .line 666
    move-object/from16 v16, p1

    .line 667
    .line 668
    check-cast v16, Lx1/h0;

    .line 669
    .line 670
    invoke-virtual/range {v16 .. v16}, Lx1/h0;->e()V

    .line 671
    .line 672
    .line 673
    iget-object v1, v9, Lw/q0;->s:Li0/j1;

    .line 674
    .line 675
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    check-cast v1, Ljava/lang/Boolean;

    .line 680
    .line 681
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-nez v1, :cond_1a

    .line 686
    .line 687
    iget-object v1, v9, Lw/q0;->t:Li0/j1;

    .line 688
    .line 689
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    check-cast v1, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 696
    .line 697
    .line 698
    move-result v1

    .line 699
    if-eqz v1, :cond_1b

    .line 700
    .line 701
    :cond_1a
    const/16 v24, 0x0

    .line 702
    .line 703
    const/16 v25, 0x7e

    .line 704
    .line 705
    const-wide/16 v18, 0x0

    .line 706
    .line 707
    const-wide/16 v20, 0x0

    .line 708
    .line 709
    const/16 v22, 0x0

    .line 710
    .line 711
    const/16 v23, 0x0

    .line 712
    .line 713
    invoke-static/range {v16 .. v25}, Lh1/d;->V0(Lh1/d;Lf1/s;JJFLh1/c;II)V

    .line 714
    .line 715
    .line 716
    :cond_1b
    return-object v15

    .line 717
    :pswitch_7
    check-cast v9, Ln2/s;

    .line 718
    .line 719
    check-cast v8, Lfg/l;

    .line 720
    .line 721
    move-object/from16 v1, p1

    .line 722
    .line 723
    check-cast v1, Ln2/s;

    .line 724
    .line 725
    invoke-static {v9, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    if-nez v2, :cond_1c

    .line 730
    .line 731
    invoke-interface {v8, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    :cond_1c
    return-object v15

    .line 735
    :pswitch_8
    check-cast v9, Lgg/s;

    .line 736
    .line 737
    check-cast v8, Landroid/app/Activity;

    .line 738
    .line 739
    move-object/from16 v1, p1

    .line 740
    .line 741
    check-cast v1, Landroid/widget/TextView;

    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    iget v2, v9, Lgg/s;->g:I

    .line 747
    .line 748
    if-nez v2, :cond_1e

    .line 749
    .line 750
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 759
    .line 760
    and-int/lit8 v2, v2, 0x30

    .line 761
    .line 762
    if-ne v2, v12, :cond_1d

    .line 763
    .line 764
    const/16 v2, 0xeb

    .line 765
    .line 766
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    goto :goto_10

    .line 771
    :cond_1d
    invoke-static {v12, v12, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 772
    .line 773
    .line 774
    move-result v2

    .line 775
    goto :goto_10

    .line 776
    :cond_1e
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 785
    .line 786
    and-int/lit8 v2, v2, 0x30

    .line 787
    .line 788
    if-ne v2, v12, :cond_1f

    .line 789
    .line 790
    const/16 v2, 0x80

    .line 791
    .line 792
    :goto_f
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    goto :goto_10

    .line 797
    :cond_1f
    const/16 v2, 0xb2

    .line 798
    .line 799
    goto :goto_f

    .line 800
    :goto_10
    iget v3, v9, Lgg/s;->g:I

    .line 801
    .line 802
    if-nez v3, :cond_20

    .line 803
    .line 804
    const v3, 0x1010036

    .line 805
    .line 806
    .line 807
    goto :goto_11

    .line 808
    :cond_20
    const v3, 0x1010038

    .line 809
    .line 810
    .line 811
    :goto_11
    invoke-virtual {v8}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 812
    .line 813
    .line 814
    move-result-object v4

    .line 815
    filled-new-array {v3}, [I

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    :try_start_1
    invoke-virtual {v3, v13, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 827
    .line 828
    .line 829
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 830
    :catchall_1
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 834
    .line 835
    .line 836
    iget v1, v9, Lgg/s;->g:I

    .line 837
    .line 838
    add-int/2addr v1, v14

    .line 839
    iput v1, v9, Lgg/s;->g:I

    .line 840
    .line 841
    return-object v15

    .line 842
    :pswitch_9
    check-cast v9, Lth/i;

    .line 843
    .line 844
    move-object/from16 v17, v8

    .line 845
    .line 846
    check-cast v17, Lv1/b1;

    .line 847
    .line 848
    move-object/from16 v16, p1

    .line 849
    .line 850
    check-cast v16, Lv1/a1;

    .line 851
    .line 852
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    iget-boolean v1, v9, Lth/i;->A:Z

    .line 856
    .line 857
    if-eqz v1, :cond_21

    .line 858
    .line 859
    iget-object v1, v9, Lth/i;->I:Lnb/a;

    .line 860
    .line 861
    const/16 v21, 0x2

    .line 862
    .line 863
    const-wide/16 v18, 0x0

    .line 864
    .line 865
    move-object/from16 v20, v1

    .line 866
    .line 867
    invoke-static/range {v16 .. v21}, Lv1/a1;->H(Lv1/a1;Lv1/b1;JLnb/a;I)V

    .line 868
    .line 869
    .line 870
    goto :goto_12

    .line 871
    :cond_21
    move-object/from16 v1, v16

    .line 872
    .line 873
    move-object/from16 v8, v17

    .line 874
    .line 875
    invoke-static {v1, v8, v6, v7}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 876
    .line 877
    .line 878
    :goto_12
    return-object v15

    .line 879
    :pswitch_a
    check-cast v9, Li/c;

    .line 880
    .line 881
    check-cast v8, Li/c;

    .line 882
    .line 883
    move-object/from16 v1, p1

    .line 884
    .line 885
    check-cast v1, Lf1/d0;

    .line 886
    .line 887
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v9}, Li/c;->d()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    check-cast v2, Ljava/lang/Number;

    .line 895
    .line 896
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    invoke-interface {v1, v2}, Lf1/d0;->n(F)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v8}, Li/c;->d()Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    check-cast v2, Ljava/lang/Number;

    .line 908
    .line 909
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    invoke-interface {v1, v2}, Lf1/d0;->g(F)V

    .line 914
    .line 915
    .line 916
    return-object v15

    .line 917
    :pswitch_b
    check-cast v9, Li0/g1;

    .line 918
    .line 919
    check-cast v8, Li0/g1;

    .line 920
    .line 921
    move-object/from16 v1, p1

    .line 922
    .line 923
    check-cast v1, Lu2/l;

    .line 924
    .line 925
    iget-wide v2, v1, Lu2/l;->a:J

    .line 926
    .line 927
    shr-long/2addr v2, v12

    .line 928
    long-to-int v2, v2

    .line 929
    invoke-virtual {v9, v2}, Li0/g1;->h(I)V

    .line 930
    .line 931
    .line 932
    iget-wide v1, v1, Lu2/l;->a:J

    .line 933
    .line 934
    and-long v1, v1, v16

    .line 935
    .line 936
    long-to-int v1, v1

    .line 937
    invoke-virtual {v8, v1}, Li0/g1;->h(I)V

    .line 938
    .line 939
    .line 940
    return-object v15

    .line 941
    :pswitch_c
    check-cast v9, Llg/a;

    .line 942
    .line 943
    check-cast v8, Li0/a1;

    .line 944
    .line 945
    move-object/from16 v1, p1

    .line 946
    .line 947
    check-cast v1, Ljava/lang/Float;

    .line 948
    .line 949
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    iget v2, v9, Llg/a;->a:F

    .line 954
    .line 955
    iget v3, v9, Llg/a;->b:F

    .line 956
    .line 957
    invoke-static {v1, v2, v3}, Lr9/e0;->q(FFF)F

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    check-cast v2, Lfg/l;

    .line 966
    .line 967
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 975
    .line 976
    return-object v1

    .line 977
    :pswitch_d
    check-cast v9, Lsh/e0;

    .line 978
    .line 979
    check-cast v8, Lp/r1;

    .line 980
    .line 981
    move-object/from16 v1, p1

    .line 982
    .line 983
    check-cast v1, Lp/r1;

    .line 984
    .line 985
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    new-instance v2, Lp/z;

    .line 989
    .line 990
    invoke-direct {v2, v8, v1}, Lp/z;-><init>(Lp/r1;Lp/r1;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    iget-object v1, v9, Lsh/e0;->a:Li0/j1;

    .line 997
    .line 998
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    return-object v15

    .line 1002
    :pswitch_e
    check-cast v9, Lv0/f;

    .line 1003
    .line 1004
    check-cast v8, Lv0/d;

    .line 1005
    .line 1006
    move-object/from16 v1, p1

    .line 1007
    .line 1008
    check-cast v1, Ljava/util/Map;

    .line 1009
    .line 1010
    new-instance v2, Ls/x0;

    .line 1011
    .line 1012
    invoke-direct {v2, v9, v1, v8}, Ls/x0;-><init>(Lv0/f;Ljava/util/Map;Lv0/d;)V

    .line 1013
    .line 1014
    .line 1015
    return-object v2

    .line 1016
    :pswitch_f
    check-cast v9, Ls/x0;

    .line 1017
    .line 1018
    move-object/from16 v1, p1

    .line 1019
    .line 1020
    check-cast v1, Li0/a0;

    .line 1021
    .line 1022
    iget-object v1, v9, Ls/x0;->i:Lf/l0;

    .line 1023
    .line 1024
    invoke-virtual {v1, v8}, Lf/l0;->i(Ljava/lang/Object;)V

    .line 1025
    .line 1026
    .line 1027
    new-instance v1, Lci/w;

    .line 1028
    .line 1029
    const/4 v2, 0x6

    .line 1030
    invoke-direct {v1, v9, v2, v8}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    return-object v1

    .line 1034
    :pswitch_10
    check-cast v9, Ls/d;

    .line 1035
    .line 1036
    check-cast v8, Ls/e;

    .line 1037
    .line 1038
    move-object/from16 v1, p1

    .line 1039
    .line 1040
    check-cast v1, Lg2/c;

    .line 1041
    .line 1042
    iget-object v1, v9, Ls/d;->u:Lg2/d;

    .line 1043
    .line 1044
    if-eqz v1, :cond_22

    .line 1045
    .line 1046
    invoke-virtual {v1}, Lg2/d;->b()V

    .line 1047
    .line 1048
    .line 1049
    :cond_22
    iput-object v11, v9, Ls/d;->u:Lg2/d;

    .line 1050
    .line 1051
    iget-object v1, v8, Ls/e;->b:Lqg/l;

    .line 1052
    .line 1053
    if-eqz v1, :cond_26

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    :cond_23
    sget-object v2, Lqg/y0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1059
    .line 1060
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    invoke-virtual {v1, v2, v15}, Lqg/y0;->Y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v2

    .line 1068
    sget-object v3, Lqg/v;->d:Ll3/q;

    .line 1069
    .line 1070
    if-ne v2, v3, :cond_24

    .line 1071
    .line 1072
    goto :goto_13

    .line 1073
    :cond_24
    sget-object v3, Lqg/v;->e:Ll3/q;

    .line 1074
    .line 1075
    if-ne v2, v3, :cond_25

    .line 1076
    .line 1077
    goto :goto_13

    .line 1078
    :cond_25
    sget-object v3, Lqg/v;->f:Ll3/q;

    .line 1079
    .line 1080
    if-eq v2, v3, :cond_23

    .line 1081
    .line 1082
    invoke-virtual {v1, v2}, Lqg/y0;->r(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    :cond_26
    :goto_13
    iput-object v11, v8, Ls/e;->b:Lqg/l;

    .line 1086
    .line 1087
    return-object v15

    .line 1088
    :pswitch_11
    check-cast v9, Lrg/e;

    .line 1089
    .line 1090
    check-cast v8, Lrg/d;

    .line 1091
    .line 1092
    move-object/from16 v1, p1

    .line 1093
    .line 1094
    check-cast v1, Ljava/lang/Throwable;

    .line 1095
    .line 1096
    iget-object v1, v9, Lrg/e;->i:Landroid/os/Handler;

    .line 1097
    .line 1098
    invoke-virtual {v1, v8}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1099
    .line 1100
    .line 1101
    return-object v15

    .line 1102
    :pswitch_12
    check-cast v9, Ljava/util/Set;

    .line 1103
    .line 1104
    check-cast v8, Ljava/lang/String;

    .line 1105
    .line 1106
    move-object/from16 v1, p1

    .line 1107
    .line 1108
    check-cast v1, Landroid/widget/TextView;

    .line 1109
    .line 1110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    invoke-static {v1}, Lr9/d0;->c0(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    invoke-interface {v9, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    if-nez v2, :cond_27

    .line 1126
    .line 1127
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    invoke-static {v1, v8, v13}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v2

    .line 1134
    if-eqz v2, :cond_28

    .line 1135
    .line 1136
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    const/16 v3, 0x14

    .line 1141
    .line 1142
    if-gt v2, v3, :cond_28

    .line 1143
    .line 1144
    const-string v2, "\u5143"

    .line 1145
    .line 1146
    invoke-static {v1, v2, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v2

    .line 1150
    if-nez v2, :cond_28

    .line 1151
    .line 1152
    const-string v2, "/"

    .line 1153
    .line 1154
    invoke-static {v1, v2, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v1

    .line 1158
    if-nez v1, :cond_28

    .line 1159
    .line 1160
    :cond_27
    move v13, v14

    .line 1161
    :cond_28
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    return-object v1

    .line 1166
    :pswitch_13
    check-cast v9, Ljava/util/ArrayList;

    .line 1167
    .line 1168
    check-cast v8, Ljava/lang/String;

    .line 1169
    .line 1170
    move-object/from16 v1, p1

    .line 1171
    .line 1172
    check-cast v1, Log/f;

    .line 1173
    .line 1174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    check-cast v1, Log/i;

    .line 1178
    .line 1179
    invoke-virtual {v1}, Log/i;->a()Ljava/util/List;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    invoke-static {v14, v1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    check-cast v1, Ljava/lang/String;

    .line 1188
    .line 1189
    if-eqz v1, :cond_29

    .line 1190
    .line 1191
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v1

    .line 1195
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    goto :goto_14

    .line 1200
    :cond_29
    move-object v1, v11

    .line 1201
    :goto_14
    const-string v2, ""

    .line 1202
    .line 1203
    if-nez v1, :cond_2a

    .line 1204
    .line 1205
    move-object v1, v2

    .line 1206
    :cond_2a
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v3

    .line 1210
    if-eqz v3, :cond_2b

    .line 1211
    .line 1212
    goto :goto_19

    .line 1213
    :cond_2b
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    const-string v2, "notify@all"

    .line 1217
    .line 1218
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v2

    .line 1222
    if-eqz v2, :cond_2c

    .line 1223
    .line 1224
    const-string v1, "\u6240\u6709\u4eba"

    .line 1225
    .line 1226
    goto :goto_18

    .line 1227
    :cond_2c
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    if-eqz v2, :cond_2d

    .line 1232
    .line 1233
    invoke-virtual {v2, v1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v3

    .line 1237
    goto :goto_15

    .line 1238
    :cond_2d
    move-object v3, v11

    .line 1239
    :goto_15
    if-eqz v2, :cond_2e

    .line 1240
    .line 1241
    invoke-virtual {v2, v8, v1}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    goto :goto_16

    .line 1246
    :cond_2e
    move-object v2, v11

    .line 1247
    :goto_16
    if-eqz v3, :cond_2f

    .line 1248
    .line 1249
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 1250
    .line 1251
    goto :goto_17

    .line 1252
    :cond_2f
    move-object v4, v11

    .line 1253
    :goto_17
    if-eqz v3, :cond_30

    .line 1254
    .line 1255
    iget-object v11, v3, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 1256
    .line 1257
    :cond_30
    filled-new-array {v2, v4, v11, v1}, [Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    invoke-static {v2}, Lhb/r;->i([Ljava/lang/String;)Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v2

    .line 1265
    const/16 v3, 0xa

    .line 1266
    .line 1267
    invoke-virtual {v2, v3, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v2

    .line 1271
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    const/16 v3, 0xd

    .line 1275
    .line 1276
    invoke-virtual {v2, v3, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1281
    .line 1282
    .line 1283
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v2

    .line 1287
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v2

    .line 1291
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v3

    .line 1295
    if-eqz v3, :cond_31

    .line 1296
    .line 1297
    goto :goto_18

    .line 1298
    :cond_31
    move-object v1, v2

    .line 1299
    :goto_18
    const-string v2, "@"

    .line 1300
    .line 1301
    const-string v3, "\u2005"

    .line 1302
    .line 1303
    invoke-static {v2, v1, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    :goto_19
    return-object v2

    .line 1308
    :pswitch_14
    check-cast v9, Ljava/io/RandomAccessFile;

    .line 1309
    .line 1310
    check-cast v8, Ljava/io/File;

    .line 1311
    .line 1312
    move-object/from16 v1, p1

    .line 1313
    .line 1314
    check-cast v1, Ljava/lang/Long;

    .line 1315
    .line 1316
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1317
    .line 1318
    .line 1319
    move-result-wide v1

    .line 1320
    sget-object v3, Lp8/b;->a:Lp8/b;

    .line 1321
    .line 1322
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 1323
    .line 1324
    .line 1325
    move-result-wide v3

    .line 1326
    invoke-static {v9, v3, v4, v1, v2}, Lp8/b;->d(Ljava/io/RandomAccessFile;JJ)Lp8/a;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v1

    .line 1330
    return-object v1

    .line 1331
    :pswitch_15
    check-cast v9, Lp/s1;

    .line 1332
    .line 1333
    check-cast v8, Landroid/view/View;

    .line 1334
    .line 1335
    move-object/from16 v1, p1

    .line 1336
    .line 1337
    check-cast v1, Li0/a0;

    .line 1338
    .line 1339
    invoke-virtual {v9, v8}, Lp/s1;->a(Landroid/view/View;)V

    .line 1340
    .line 1341
    .line 1342
    new-instance v1, Lci/w;

    .line 1343
    .line 1344
    invoke-direct {v1, v9, v4, v8}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    return-object v1

    .line 1348
    :pswitch_16
    check-cast v9, Lp/w0;

    .line 1349
    .line 1350
    check-cast v8, Lv1/b1;

    .line 1351
    .line 1352
    move-object/from16 v1, p1

    .line 1353
    .line 1354
    check-cast v1, Lv1/a1;

    .line 1355
    .line 1356
    iget-boolean v2, v9, Lp/w0;->y:Z

    .line 1357
    .line 1358
    iget v3, v9, Lp/w0;->u:F

    .line 1359
    .line 1360
    if-eqz v2, :cond_32

    .line 1361
    .line 1362
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 1363
    .line 1364
    .line 1365
    move-result v2

    .line 1366
    iget v3, v9, Lp/w0;->v:F

    .line 1367
    .line 1368
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 1369
    .line 1370
    .line 1371
    move-result v3

    .line 1372
    invoke-static {v1, v8, v2, v3}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 1373
    .line 1374
    .line 1375
    goto :goto_1a

    .line 1376
    :cond_32
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 1377
    .line 1378
    .line 1379
    move-result v2

    .line 1380
    iget v3, v9, Lp/w0;->v:F

    .line 1381
    .line 1382
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 1383
    .line 1384
    .line 1385
    move-result v3

    .line 1386
    invoke-virtual {v1, v8, v2, v3, v10}, Lv1/a1;->A(Lv1/b1;IIF)V

    .line 1387
    .line 1388
    .line 1389
    :goto_1a
    return-object v15

    .line 1390
    :pswitch_17
    check-cast v9, Lp/u0;

    .line 1391
    .line 1392
    move-object v2, v8

    .line 1393
    check-cast v2, Lv1/b1;

    .line 1394
    .line 1395
    move-object/from16 v1, p1

    .line 1396
    .line 1397
    check-cast v1, Lv1/a1;

    .line 1398
    .line 1399
    iget-object v3, v9, Lp/u0;->u:Lfg/l;

    .line 1400
    .line 1401
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v3

    .line 1405
    check-cast v3, Lu2/j;

    .line 1406
    .line 1407
    iget-wide v3, v3, Lu2/j;->a:J

    .line 1408
    .line 1409
    iget-boolean v5, v9, Lp/u0;->v:Z

    .line 1410
    .line 1411
    if-eqz v5, :cond_33

    .line 1412
    .line 1413
    shr-long v5, v3, v12

    .line 1414
    .line 1415
    long-to-int v5, v5

    .line 1416
    and-long v3, v3, v16

    .line 1417
    .line 1418
    long-to-int v3, v3

    .line 1419
    invoke-static {v1, v2, v5, v3}, Lv1/a1;->F(Lv1/a1;Lv1/b1;II)V

    .line 1420
    .line 1421
    .line 1422
    goto :goto_1b

    .line 1423
    :cond_33
    shr-long v5, v3, v12

    .line 1424
    .line 1425
    long-to-int v5, v5

    .line 1426
    and-long v3, v3, v16

    .line 1427
    .line 1428
    long-to-int v4, v3

    .line 1429
    move v3, v5

    .line 1430
    const/4 v5, 0x0

    .line 1431
    const/16 v6, 0xc

    .line 1432
    .line 1433
    invoke-static/range {v1 .. v6}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 1434
    .line 1435
    .line 1436
    :goto_1b
    return-object v15

    .line 1437
    :pswitch_18
    check-cast v9, Lo9/p;

    .line 1438
    .line 1439
    check-cast v8, Ljava/lang/String;

    .line 1440
    .line 1441
    move-object/from16 v1, p1

    .line 1442
    .line 1443
    check-cast v1, Ljava/lang/String;

    .line 1444
    .line 1445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1446
    .line 1447
    .line 1448
    new-instance v2, Landroid/os/Handler;

    .line 1449
    .line 1450
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v3

    .line 1454
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1455
    .line 1456
    .line 1457
    new-instance v3, Leb/g0;

    .line 1458
    .line 1459
    invoke-direct {v3, v9, v8, v1}, Leb/g0;-><init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1463
    .line 1464
    .line 1465
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1466
    .line 1467
    return-object v1

    .line 1468
    :pswitch_19
    check-cast v9, Lm/g3;

    .line 1469
    .line 1470
    check-cast v8, Lfg/l;

    .line 1471
    .line 1472
    move-object/from16 v1, p1

    .line 1473
    .line 1474
    check-cast v1, Ljava/lang/Long;

    .line 1475
    .line 1476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1477
    .line 1478
    .line 1479
    iget v1, v9, Lm/g3;->e:F

    .line 1480
    .line 1481
    iput v10, v9, Lm/g3;->e:F

    .line 1482
    .line 1483
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    invoke-interface {v8, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    return-object v15

    .line 1491
    :pswitch_1a
    check-cast v9, Lm/m2;

    .line 1492
    .line 1493
    check-cast v8, Lm/o2;

    .line 1494
    .line 1495
    move-object/from16 v1, p1

    .line 1496
    .line 1497
    check-cast v1, Lm/y;

    .line 1498
    .line 1499
    iget-boolean v4, v1, Lm/y;->b:Z

    .line 1500
    .line 1501
    if-eqz v4, :cond_34

    .line 1502
    .line 1503
    const/high16 v2, -0x40800000    # -1.0f

    .line 1504
    .line 1505
    :cond_34
    iget-wide v4, v1, Lm/y;->a:J

    .line 1506
    .line 1507
    iget-object v1, v8, Lm/o2;->d:Lm/p1;

    .line 1508
    .line 1509
    sget-object v6, Lm/p1;->h:Lm/p1;

    .line 1510
    .line 1511
    if-ne v1, v6, :cond_35

    .line 1512
    .line 1513
    invoke-static {v4, v5, v10, v14}, Le1/b;->a(JFI)J

    .line 1514
    .line 1515
    .line 1516
    move-result-wide v3

    .line 1517
    goto :goto_1c

    .line 1518
    :cond_35
    invoke-static {v4, v5, v10, v3}, Le1/b;->a(JFI)J

    .line 1519
    .line 1520
    .line 1521
    move-result-wide v3

    .line 1522
    :goto_1c
    invoke-static {v3, v4, v2}, Le1/b;->f(JF)J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v1

    .line 1526
    invoke-virtual {v9, v14, v1, v2}, Lm/m2;->a(IJ)J

    .line 1527
    .line 1528
    .line 1529
    return-object v15

    .line 1530
    :pswitch_1b
    check-cast v9, Lm/m;

    .line 1531
    .line 1532
    check-cast v8, Lm/t0;

    .line 1533
    .line 1534
    move-object/from16 v1, p1

    .line 1535
    .line 1536
    check-cast v1, Lm/y;

    .line 1537
    .line 1538
    iget-wide v3, v1, Lm/y;->a:J

    .line 1539
    .line 1540
    invoke-static {v3, v4, v2}, Le1/b;->f(JF)J

    .line 1541
    .line 1542
    .line 1543
    move-result-wide v1

    .line 1544
    iget-object v3, v8, Lm/t0;->Q:Lm/p1;

    .line 1545
    .line 1546
    sget-object v4, Lm/s0;->a:Lm/r0;

    .line 1547
    .line 1548
    sget-object v4, Lm/p1;->g:Lm/p1;

    .line 1549
    .line 1550
    if-ne v3, v4, :cond_36

    .line 1551
    .line 1552
    and-long v1, v1, v16

    .line 1553
    .line 1554
    :goto_1d
    long-to-int v1, v1

    .line 1555
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1556
    .line 1557
    .line 1558
    move-result v1

    .line 1559
    goto :goto_1e

    .line 1560
    :cond_36
    shr-long/2addr v1, v12

    .line 1561
    goto :goto_1d

    .line 1562
    :goto_1e
    iget-object v2, v9, Lm/m;->a:Lm/n;

    .line 1563
    .line 1564
    iget-object v2, v2, Lm/n;->a:Lb0/l;

    .line 1565
    .line 1566
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v1

    .line 1570
    invoke-virtual {v2, v1}, Lb0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    return-object v15

    .line 1574
    :pswitch_1c
    check-cast v9, Lm/c;

    .line 1575
    .line 1576
    check-cast v8, Lm/i;

    .line 1577
    .line 1578
    move-object/from16 v1, p1

    .line 1579
    .line 1580
    check-cast v1, Ljava/lang/Throwable;

    .line 1581
    .line 1582
    iget-object v1, v9, Lm/c;->a:Lj0/b;

    .line 1583
    .line 1584
    invoke-virtual {v1, v8}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 1585
    .line 1586
    .line 1587
    return-object v15

    .line 1588
    nop

    .line 1589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
