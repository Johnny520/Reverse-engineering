.class public final synthetic Lsh/m1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lsh/m1;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lsh/m1;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lsh/m1;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsh/m1;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 16
    .line 17
    invoke-static {v2}, Lwb/y2;->H(Li0/a1;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 24
    .line 25
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object/from16 v26, p1

    .line 32
    .line 33
    check-cast v26, Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lsh/m1;->h:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lua/i;

    .line 45
    .line 46
    const v37, -0x200001

    .line 47
    .line 48
    .line 49
    const/16 v38, 0x1

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    const-wide/16 v8, 0x0

    .line 57
    .line 58
    const-wide/16 v10, 0x0

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x0

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x0

    .line 83
    .line 84
    const/16 v27, 0x0

    .line 85
    .line 86
    const/16 v28, 0x0

    .line 87
    .line 88
    const/16 v29, 0x0

    .line 89
    .line 90
    const/16 v30, 0x0

    .line 91
    .line 92
    const/16 v31, 0x0

    .line 93
    .line 94
    const/16 v32, 0x0

    .line 95
    .line 96
    const/16 v33, 0x0

    .line 97
    .line 98
    const/16 v34, 0x0

    .line 99
    .line 100
    const/16 v35, 0x0

    .line 101
    .line 102
    const/16 v36, 0x0

    .line 103
    .line 104
    invoke-static/range {v2 .. v38}, Lua/i;->a(Lua/i;Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)Lua/i;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 112
    .line 113
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 114
    .line 115
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    return-object v1

    .line 121
    :pswitch_1
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, Ljava/util/List;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Lwb/s0;

    .line 133
    .line 134
    if-eqz v1, :cond_1

    .line 135
    .line 136
    iget-object v1, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 139
    .line 140
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_1
    sget-object v1, Lwb/j2;->g:Lwb/j2;

    .line 144
    .line 145
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 146
    .line 147
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :pswitch_2
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, Lx8/b;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 159
    .line 160
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v1, Lx8/b;->s:Ljava/util/List;

    .line 164
    .line 165
    new-instance v2, Lsf/e;

    .line 166
    .line 167
    const-string v3, "\u89c4\u5219\u56de\u590d"

    .line 168
    .line 169
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v0, Lsh/m1;->i:Li0/a1;

    .line 173
    .line 174
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :pswitch_3
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 187
    .line 188
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Ldb/c;

    .line 193
    .line 194
    invoke-static {v3}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v1, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Ldb/a;

    .line 203
    .line 204
    if-eqz v3, :cond_2

    .line 205
    .line 206
    new-instance v4, Lwb/yq;

    .line 207
    .line 208
    new-instance v5, Lwb/b3;

    .line 209
    .line 210
    iget v6, v3, Ldb/a;->a:I

    .line 211
    .line 212
    invoke-static {v6}, Lwb/ho;->Z6(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    iget-object v7, v3, Ldb/a;->b:Ljava/lang/String;

    .line 217
    .line 218
    new-instance v8, Lwb/q7;

    .line 219
    .line 220
    const/4 v3, 0x3

    .line 221
    invoke-direct {v8, v1, v2, v3}, Lwb/q7;-><init>(ILi0/a1;I)V

    .line 222
    .line 223
    .line 224
    const/4 v9, 0x0

    .line 225
    const-string v10, "|"

    .line 226
    .line 227
    invoke-direct/range {v5 .. v10}, Lwb/b3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;ZLjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-direct {v4, v1, v5}, Lwb/yq;-><init>(ILwb/b3;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, v0, Lsh/m1;->i:Li0/a1;

    .line 234
    .line 235
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 239
    .line 240
    return-object v1

    .line 241
    :pswitch_4
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, Ljava/util/List;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 249
    .line 250
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    move-object v4, v3

    .line 255
    check-cast v4, Ldb/c;

    .line 256
    .line 257
    new-instance v9, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_3

    .line 275
    .line 276
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Lwb/s0;

    .line 281
    .line 282
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_3
    const/16 v27, 0x0

    .line 289
    .line 290
    const v28, 0x3fffdf

    .line 291
    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    const/4 v6, 0x0

    .line 295
    const/4 v7, 0x0

    .line 296
    const/4 v8, 0x0

    .line 297
    const-wide/16 v10, 0x0

    .line 298
    .line 299
    const/4 v12, 0x0

    .line 300
    const/4 v13, 0x0

    .line 301
    const/4 v14, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const-wide/16 v18, 0x0

    .line 308
    .line 309
    const/16 v20, 0x0

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    const/16 v23, 0x0

    .line 316
    .line 317
    const/16 v24, 0x0

    .line 318
    .line 319
    const/16 v25, 0x0

    .line 320
    .line 321
    const/16 v26, 0x0

    .line 322
    .line 323
    invoke-static/range {v4 .. v28}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    sget-object v1, Lwb/xq;->b:Lwb/xq;

    .line 331
    .line 332
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 333
    .line 334
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :pswitch_5
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, Lv8/a;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 347
    .line 348
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    sget-object v1, Lwb/g;->i:Lwb/g;

    .line 352
    .line 353
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 354
    .line 355
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :pswitch_6
    move-object/from16 v1, p1

    .line 361
    .line 362
    check-cast v1, Lv8/a;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 368
    .line 369
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    sget-object v1, Lwb/g;->l:Lwb/g;

    .line 373
    .line 374
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 375
    .line 376
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :pswitch_7
    move-object/from16 v1, p1

    .line 382
    .line 383
    check-cast v1, Lv8/a;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 389
    .line 390
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sget-object v1, Lwb/g;->k:Lwb/g;

    .line 394
    .line 395
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 396
    .line 397
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_0

    .line 401
    .line 402
    :pswitch_8
    move-object/from16 v1, p1

    .line 403
    .line 404
    check-cast v1, Ljava/util/List;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 410
    .line 411
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    move-object v4, v3

    .line 416
    check-cast v4, Ldb/c;

    .line 417
    .line 418
    new-instance v9, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_4

    .line 436
    .line 437
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Lwb/s0;

    .line 442
    .line 443
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 444
    .line 445
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    goto :goto_2

    .line 449
    :cond_4
    const/16 v27, 0x0

    .line 450
    .line 451
    const v28, 0x3fffdf

    .line 452
    .line 453
    .line 454
    const/4 v5, 0x0

    .line 455
    const/4 v6, 0x0

    .line 456
    const/4 v7, 0x0

    .line 457
    const/4 v8, 0x0

    .line 458
    const-wide/16 v10, 0x0

    .line 459
    .line 460
    const/4 v12, 0x0

    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    const/16 v16, 0x0

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    const-wide/16 v18, 0x0

    .line 469
    .line 470
    const/16 v20, 0x0

    .line 471
    .line 472
    const/16 v21, 0x0

    .line 473
    .line 474
    const/16 v22, 0x0

    .line 475
    .line 476
    const/16 v23, 0x0

    .line 477
    .line 478
    const/16 v24, 0x0

    .line 479
    .line 480
    const/16 v25, 0x0

    .line 481
    .line 482
    const/16 v26, 0x0

    .line 483
    .line 484
    invoke-static/range {v4 .. v28}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    sget-object v1, Lwb/cu;->b:Lwb/cu;

    .line 492
    .line 493
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 494
    .line 495
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_0

    .line 499
    .line 500
    :pswitch_9
    move-object/from16 v1, p1

    .line 501
    .line 502
    check-cast v1, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 509
    .line 510
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    check-cast v3, Ldb/c;

    .line 515
    .line 516
    invoke-static {v3}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-static {v1, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Ldb/a;

    .line 525
    .line 526
    if-eqz v3, :cond_5

    .line 527
    .line 528
    new-instance v4, Lwb/du;

    .line 529
    .line 530
    new-instance v5, Lwb/b3;

    .line 531
    .line 532
    iget v6, v3, Ldb/a;->a:I

    .line 533
    .line 534
    invoke-static {v6}, Lwb/ho;->Z6(I)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    iget-object v7, v3, Ldb/a;->b:Ljava/lang/String;

    .line 539
    .line 540
    new-instance v8, Lwb/q7;

    .line 541
    .line 542
    const/4 v3, 0x0

    .line 543
    invoke-direct {v8, v1, v2, v3}, Lwb/q7;-><init>(ILi0/a1;I)V

    .line 544
    .line 545
    .line 546
    const/4 v9, 0x0

    .line 547
    const-string v10, "|"

    .line 548
    .line 549
    invoke-direct/range {v5 .. v10}, Lwb/b3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;ZLjava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-direct {v4, v5}, Lwb/du;-><init>(Lwb/b3;)V

    .line 553
    .line 554
    .line 555
    iget-object v1, v0, Lsh/m1;->i:Li0/a1;

    .line 556
    .line 557
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    :cond_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 561
    .line 562
    return-object v1

    .line 563
    :pswitch_a
    move-object/from16 v1, p1

    .line 564
    .line 565
    check-cast v1, Ljava/lang/Integer;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 572
    .line 573
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    check-cast v4, Ljava/lang/Number;

    .line 578
    .line 579
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eq v2, v4, :cond_6

    .line 584
    .line 585
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    iget-object v1, v0, Lsh/m1;->i:Li0/a1;

    .line 589
    .line 590
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    move-object v3, v2

    .line 595
    check-cast v3, Ldb/c;

    .line 596
    .line 597
    const/16 v26, 0x0

    .line 598
    .line 599
    const v27, 0x3fffdf

    .line 600
    .line 601
    .line 602
    const/4 v4, 0x0

    .line 603
    const/4 v5, 0x0

    .line 604
    const/4 v6, 0x0

    .line 605
    const/4 v7, 0x0

    .line 606
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 607
    .line 608
    const-wide/16 v9, 0x0

    .line 609
    .line 610
    const/4 v11, 0x0

    .line 611
    const/4 v12, 0x0

    .line 612
    const/4 v13, 0x0

    .line 613
    const/4 v14, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    const/16 v16, 0x0

    .line 616
    .line 617
    const-wide/16 v17, 0x0

    .line 618
    .line 619
    const/16 v19, 0x0

    .line 620
    .line 621
    const/16 v20, 0x0

    .line 622
    .line 623
    const/16 v21, 0x0

    .line 624
    .line 625
    const/16 v22, 0x0

    .line 626
    .line 627
    const/16 v23, 0x0

    .line 628
    .line 629
    const/16 v24, 0x0

    .line 630
    .line 631
    const/16 v25, 0x0

    .line 632
    .line 633
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    :cond_6
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 641
    .line 642
    return-object v1

    .line 643
    :pswitch_b
    move-object/from16 v1, p1

    .line 644
    .line 645
    check-cast v1, Ljava/util/List;

    .line 646
    .line 647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 651
    .line 652
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 656
    .line 657
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 658
    .line 659
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    goto/16 :goto_0

    .line 663
    .line 664
    :pswitch_c
    move-object/from16 v1, p1

    .line 665
    .line 666
    check-cast v1, Lwb/t0;

    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 672
    .line 673
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    const-string v1, ""

    .line 677
    .line 678
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 679
    .line 680
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_0

    .line 684
    .line 685
    :pswitch_d
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, Ljava/lang/Boolean;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 694
    .line 695
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    if-eqz v2, :cond_7

    .line 699
    .line 700
    const-string v1, ""

    .line 701
    .line 702
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 703
    .line 704
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    :cond_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 708
    .line 709
    return-object v1

    .line 710
    :pswitch_e
    move-object/from16 v1, p1

    .line 711
    .line 712
    check-cast v1, Ljava/lang/Integer;

    .line 713
    .line 714
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    if-nez v2, :cond_8

    .line 719
    .line 720
    const-string v2, ""

    .line 721
    .line 722
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 723
    .line 724
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    :cond_8
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 728
    .line 729
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_0

    .line 733
    .line 734
    :pswitch_f
    move-object/from16 v1, p1

    .line 735
    .line 736
    check-cast v1, Ljava/lang/String;

    .line 737
    .line 738
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 742
    .line 743
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    const-string v1, ""

    .line 747
    .line 748
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 749
    .line 750
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    goto/16 :goto_0

    .line 754
    .line 755
    :pswitch_10
    move-object/from16 v1, p1

    .line 756
    .line 757
    check-cast v1, Ljava/lang/Boolean;

    .line 758
    .line 759
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 764
    .line 765
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    if-eqz v2, :cond_9

    .line 769
    .line 770
    const-string v1, ""

    .line 771
    .line 772
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 773
    .line 774
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    :cond_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 778
    .line 779
    return-object v1

    .line 780
    :pswitch_11
    move-object/from16 v1, p1

    .line 781
    .line 782
    check-cast v1, Ljava/lang/Boolean;

    .line 783
    .line 784
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 789
    .line 790
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    if-eqz v2, :cond_a

    .line 794
    .line 795
    const-string v1, ""

    .line 796
    .line 797
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 798
    .line 799
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    :cond_a
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 803
    .line 804
    return-object v1

    .line 805
    :pswitch_12
    move-object/from16 v1, p1

    .line 806
    .line 807
    check-cast v1, Lwb/t0;

    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 813
    .line 814
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    const-string v1, ""

    .line 818
    .line 819
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 820
    .line 821
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    goto/16 :goto_0

    .line 825
    .line 826
    :pswitch_13
    move-object/from16 v1, p1

    .line 827
    .line 828
    check-cast v1, Ljava/lang/Integer;

    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 831
    .line 832
    .line 833
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 834
    .line 835
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    const-string v1, ""

    .line 839
    .line 840
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 841
    .line 842
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_0

    .line 846
    .line 847
    :pswitch_14
    move-object/from16 v1, p1

    .line 848
    .line 849
    check-cast v1, Ljava/lang/Integer;

    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 856
    .line 857
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    if-nez v2, :cond_b

    .line 861
    .line 862
    const-string v1, "0"

    .line 863
    .line 864
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 865
    .line 866
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    :cond_b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 870
    .line 871
    return-object v1

    .line 872
    :pswitch_15
    move-object/from16 v1, p1

    .line 873
    .line 874
    check-cast v1, Ljava/lang/Integer;

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 881
    .line 882
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    if-nez v2, :cond_c

    .line 886
    .line 887
    const-string v1, ""

    .line 888
    .line 889
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 890
    .line 891
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    :cond_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 895
    .line 896
    return-object v1

    .line 897
    :pswitch_16
    move-object/from16 v1, p1

    .line 898
    .line 899
    check-cast v1, Ljava/lang/Integer;

    .line 900
    .line 901
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 902
    .line 903
    .line 904
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 905
    .line 906
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    const-string v1, ""

    .line 910
    .line 911
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 912
    .line 913
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_0

    .line 917
    .line 918
    :pswitch_17
    move-object/from16 v1, p1

    .line 919
    .line 920
    check-cast v1, Ljava/lang/String;

    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 926
    .line 927
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    const-string v1, ""

    .line 931
    .line 932
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 933
    .line 934
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    goto/16 :goto_0

    .line 938
    .line 939
    :pswitch_18
    move-object/from16 v1, p1

    .line 940
    .line 941
    check-cast v1, Ljava/lang/String;

    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 947
    .line 948
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 949
    .line 950
    .line 951
    const-string v1, ""

    .line 952
    .line 953
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 954
    .line 955
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_0

    .line 959
    .line 960
    :pswitch_19
    move-object/from16 v1, p1

    .line 961
    .line 962
    check-cast v1, Ljava/lang/String;

    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 968
    .line 969
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    const-string v1, ""

    .line 973
    .line 974
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 975
    .line 976
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_0

    .line 980
    .line 981
    :pswitch_1a
    move-object/from16 v1, p1

    .line 982
    .line 983
    check-cast v1, Lwb/t0;

    .line 984
    .line 985
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 989
    .line 990
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    const-string v1, ""

    .line 994
    .line 995
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 996
    .line 997
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    goto/16 :goto_0

    .line 1001
    .line 1002
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1003
    .line 1004
    check-cast v1, Ljava/lang/String;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    iget-object v2, v0, Lsh/m1;->h:Li0/a1;

    .line 1010
    .line 1011
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    const-string v1, ""

    .line 1015
    .line 1016
    iget-object v2, v0, Lsh/m1;->i:Li0/a1;

    .line 1017
    .line 1018
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    goto/16 :goto_0

    .line 1022
    .line 1023
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1024
    .line 1025
    check-cast v1, Ljava/lang/Boolean;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v2

    .line 1031
    iget-object v3, v0, Lsh/m1;->h:Li0/a1;

    .line 1032
    .line 1033
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    check-cast v3, Lfg/l;

    .line 1038
    .line 1039
    if-eqz v3, :cond_d

    .line 1040
    .line 1041
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    :cond_d
    iget-object v1, v0, Lsh/m1;->i:Li0/a1;

    .line 1045
    .line 1046
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    check-cast v1, Ln1/a;

    .line 1051
    .line 1052
    if-eqz v2, :cond_e

    .line 1053
    .line 1054
    const/16 v2, 0x15

    .line 1055
    .line 1056
    goto :goto_3

    .line 1057
    :cond_e
    const/16 v2, 0x16

    .line 1058
    .line 1059
    :goto_3
    check-cast v1, Ln1/c;

    .line 1060
    .line 1061
    invoke-virtual {v1, v2}, Ln1/c;->a(I)V

    .line 1062
    .line 1063
    .line 1064
    goto/16 :goto_0

    .line 1065
    .line 1066
    nop

    .line 1067
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
