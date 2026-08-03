.class public final synthetic Lwb/hj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/hj;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/hj;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/hj;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/hj;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/hj;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/hj;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/hj;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v4, v0, Lwb/hj;->i:Li0/a1;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v3, :cond_7

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v7, v0, Lwb/hj;->h:Li0/a1;

    .line 45
    .line 46
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/util/List;

    .line 57
    .line 58
    const-string v8, "group_member"

    .line 59
    .line 60
    invoke-static {v8, v3, v4}, Lwb/ho;->C5(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Laa/a;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v3}, Lwb/ho;->p6(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    if-eqz v9, :cond_0

    .line 69
    .line 70
    :goto_1
    move-object v13, v9

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    goto :goto_1

    .line 81
    :goto_2
    if-eqz v4, :cond_1

    .line 82
    .line 83
    iget-object v3, v4, Laa/a;->a:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    :goto_3
    move-object v11, v3

    .line 88
    goto :goto_4

    .line 89
    :cond_1
    invoke-static {v13, v13}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const-string v9, "|"

    .line 94
    .line 95
    invoke-static {v8, v9, v3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    goto :goto_3

    .line 100
    :goto_4
    if-eqz v4, :cond_3

    .line 101
    .line 102
    iget-object v3, v4, Laa/a;->d:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_2

    .line 111
    .line 112
    move-object v5, v3

    .line 113
    :cond_2
    if-eqz v5, :cond_3

    .line 114
    .line 115
    move-object v14, v5

    .line 116
    goto :goto_5

    .line 117
    :cond_3
    move-object v14, v13

    .line 118
    :goto_5
    if-eqz v4, :cond_4

    .line 119
    .line 120
    iget-boolean v6, v4, Laa/a;->e:Z

    .line 121
    .line 122
    :cond_4
    move v15, v6

    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    iget-object v3, v4, Laa/a;->f:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    :goto_6
    move-object/from16 v16, v3

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_5
    const-string v3, "block"

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :goto_7
    if-eqz v4, :cond_6

    .line 136
    .line 137
    iget-object v3, v4, Laa/a;->g:Ljava/util/Set;

    .line 138
    .line 139
    if-eqz v3, :cond_6

    .line 140
    .line 141
    :goto_8
    move-object/from16 v17, v3

    .line 142
    .line 143
    goto :goto_9

    .line 144
    :cond_6
    invoke-static {v7}, Lwb/ho;->h5(Ljava/util/List;)Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    goto :goto_8

    .line 149
    :goto_9
    new-instance v10, Laa/a;

    .line 150
    .line 151
    const-string v12, "group_member"

    .line 152
    .line 153
    invoke-direct/range {v10 .. v17}, Laa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-ne v1, v6, :cond_d

    .line 166
    .line 167
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Laa/a;

    .line 172
    .line 173
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const/4 v3, 0x0

    .line 184
    move v7, v3

    .line 185
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_9

    .line 190
    .line 191
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    check-cast v8, Laa/a;

    .line 196
    .line 197
    iget-object v9, v8, Laa/a;->b:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v10, v1, Laa/a;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-eqz v9, :cond_8

    .line 206
    .line 207
    iget-object v8, v8, Laa/a;->c:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v9, v1, Laa/a;->c:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_8

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_9
    const/4 v7, -0x1

    .line 222
    :goto_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-ltz v7, :cond_a

    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_a
    move-object v2, v5

    .line 230
    :goto_c
    if-eqz v2, :cond_b

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    goto :goto_d

    .line 237
    :cond_b
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    check-cast v2, Ljava/util/List;

    .line 242
    .line 243
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    :goto_d
    if-ltz v7, :cond_c

    .line 248
    .line 249
    goto :goto_e

    .line 250
    :cond_c
    move v6, v3

    .line 251
    :goto_e
    new-instance v3, Lwb/i5;

    .line 252
    .line 253
    invoke-direct {v3, v2, v1, v6}, Lwb/i5;-><init>(ILaa/a;Z)V

    .line 254
    .line 255
    .line 256
    iget-object v1, v0, Lwb/hj;->j:Li0/a1;

    .line 257
    .line 258
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto :goto_f

    .line 262
    :cond_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v1, :cond_e

    .line 267
    .line 268
    new-instance v1, Lwb/h5;

    .line 269
    .line 270
    const-string v3, "\u6279\u91cf\u6dfb\u52a0\u7fa4\u6210\u5458"

    .line 271
    .line 272
    invoke-direct {v1, v3, v2}, Lwb/h5;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 273
    .line 274
    .line 275
    iget-object v2, v0, Lwb/hj;->k:Li0/a1;

    .line 276
    .line 277
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_e
    :goto_f
    iget-object v1, v0, Lwb/hj;->l:Li0/a1;

    .line 281
    .line 282
    invoke-interface {v1, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :goto_10
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 286
    .line 287
    return-object v1

    .line 288
    :pswitch_0
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, Ljava/util/List;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    new-instance v2, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    iget-object v4, v0, Lwb/hj;->i:Li0/a1;

    .line 313
    .line 314
    const/4 v5, 0x1

    .line 315
    if-eqz v3, :cond_14

    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    check-cast v3, Lwb/s0;

    .line 322
    .line 323
    iget-object v6, v0, Lwb/hj;->h:Li0/a1;

    .line 324
    .line 325
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    check-cast v6, Ljava/util/List;

    .line 330
    .line 331
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    check-cast v4, Ljava/util/List;

    .line 336
    .line 337
    iget-object v7, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 338
    .line 339
    const-string v8, "contact"

    .line 340
    .line 341
    invoke-static {v8, v7, v4}, Lwb/ho;->C5(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Laa/a;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    iget-object v7, v3, Lwb/s0;->b:Ljava/lang/String;

    .line 346
    .line 347
    iget-object v9, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    if-eqz v10, :cond_f

    .line 354
    .line 355
    move-object v15, v9

    .line 356
    goto :goto_12

    .line 357
    :cond_f
    move-object v15, v7

    .line 358
    :goto_12
    new-instance v11, Laa/a;

    .line 359
    .line 360
    if-eqz v4, :cond_10

    .line 361
    .line 362
    iget-object v7, v4, Laa/a;->a:Ljava/lang/String;

    .line 363
    .line 364
    if-eqz v7, :cond_10

    .line 365
    .line 366
    :goto_13
    move-object v12, v7

    .line 367
    goto :goto_14

    .line 368
    :cond_10
    invoke-static {v9, v9}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    const-string v9, "|"

    .line 373
    .line 374
    invoke-static {v8, v9, v7}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    goto :goto_13

    .line 379
    :goto_14
    iget-object v14, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 380
    .line 381
    if-eqz v4, :cond_11

    .line 382
    .line 383
    iget-boolean v5, v4, Laa/a;->e:Z

    .line 384
    .line 385
    :cond_11
    move/from16 v16, v5

    .line 386
    .line 387
    if-eqz v4, :cond_12

    .line 388
    .line 389
    iget-object v3, v4, Laa/a;->f:Ljava/lang/String;

    .line 390
    .line 391
    if-eqz v3, :cond_12

    .line 392
    .line 393
    :goto_15
    move-object/from16 v17, v3

    .line 394
    .line 395
    goto :goto_16

    .line 396
    :cond_12
    const-string v3, "block"

    .line 397
    .line 398
    goto :goto_15

    .line 399
    :goto_16
    if-eqz v4, :cond_13

    .line 400
    .line 401
    iget-object v3, v4, Laa/a;->g:Ljava/util/Set;

    .line 402
    .line 403
    if-eqz v3, :cond_13

    .line 404
    .line 405
    :goto_17
    move-object/from16 v18, v3

    .line 406
    .line 407
    goto :goto_18

    .line 408
    :cond_13
    invoke-static {v6}, Lwb/ho;->h5(Ljava/util/List;)Ljava/util/Set;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    goto :goto_17

    .line 413
    :goto_18
    const-string v13, "contact"

    .line 414
    .line 415
    invoke-direct/range {v11 .. v18}, Laa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_11

    .line 422
    :cond_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    const/4 v3, 0x0

    .line 427
    if-ne v1, v5, :cond_1a

    .line 428
    .line 429
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, Ljava/util/List;

    .line 434
    .line 435
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    const/4 v6, 0x0

    .line 440
    move v7, v6

    .line 441
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    if-eqz v8, :cond_16

    .line 446
    .line 447
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    check-cast v8, Laa/a;

    .line 452
    .line 453
    iget-object v9, v8, Laa/a;->b:Ljava/lang/String;

    .line 454
    .line 455
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    check-cast v10, Laa/a;

    .line 460
    .line 461
    iget-object v10, v10, Laa/a;->b:Ljava/lang/String;

    .line 462
    .line 463
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    if-eqz v9, :cond_15

    .line 468
    .line 469
    iget-object v8, v8, Laa/a;->c:Ljava/lang/String;

    .line 470
    .line 471
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    check-cast v9, Laa/a;

    .line 476
    .line 477
    iget-object v9, v9, Laa/a;->c:Ljava/lang/String;

    .line 478
    .line 479
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    if-eqz v8, :cond_15

    .line 484
    .line 485
    goto :goto_1a

    .line 486
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 487
    .line 488
    goto :goto_19

    .line 489
    :cond_16
    const/4 v7, -0x1

    .line 490
    :goto_1a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-ltz v7, :cond_17

    .line 495
    .line 496
    goto :goto_1b

    .line 497
    :cond_17
    move-object v1, v3

    .line 498
    :goto_1b
    if-eqz v1, :cond_18

    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    goto :goto_1c

    .line 505
    :cond_18
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, Ljava/util/List;

    .line 510
    .line 511
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    :goto_1c
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    check-cast v2, Laa/a;

    .line 520
    .line 521
    if-ltz v7, :cond_19

    .line 522
    .line 523
    goto :goto_1d

    .line 524
    :cond_19
    move v5, v6

    .line 525
    :goto_1d
    new-instance v4, Lwb/i5;

    .line 526
    .line 527
    invoke-direct {v4, v1, v2, v5}, Lwb/i5;-><init>(ILaa/a;Z)V

    .line 528
    .line 529
    .line 530
    iget-object v1, v0, Lwb/hj;->j:Li0/a1;

    .line 531
    .line 532
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto :goto_1e

    .line 536
    :cond_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    if-nez v1, :cond_1b

    .line 541
    .line 542
    new-instance v1, Lwb/h5;

    .line 543
    .line 544
    const-string v4, "\u6279\u91cf\u6dfb\u52a0\u540d\u5355"

    .line 545
    .line 546
    invoke-direct {v1, v4, v2}, Lwb/h5;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 547
    .line 548
    .line 549
    iget-object v2, v0, Lwb/hj;->k:Li0/a1;

    .line 550
    .line 551
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_1b
    :goto_1e
    iget-object v1, v0, Lwb/hj;->l:Li0/a1;

    .line 555
    .line 556
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_10

    .line 560
    .line 561
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
