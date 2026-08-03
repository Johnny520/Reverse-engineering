.class public final synthetic Lwb/vn;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/vn;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/vn;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/vn;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/vn;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/vn;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/vn;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const-string v4, "\u8bfb\u53d6\u7fa4\u804a\u5931\u8d25"

    .line 10
    .line 11
    iget-object v5, v0, Lwb/vn;->k:Li0/a1;

    .line 12
    .line 13
    iget-object v6, v0, Lwb/vn;->j:Li0/a1;

    .line 14
    .line 15
    iget-object v7, v0, Lwb/vn;->i:Li0/a1;

    .line 16
    .line 17
    iget-object v8, v0, Lwb/vn;->h:Ljava/util/List;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    move-object/from16 v9, p2

    .line 27
    .line 28
    check-cast v9, Ljava/lang/Throwable;

    .line 29
    .line 30
    sget-object v10, Lwb/ho;->a:Log/k;

    .line 31
    .line 32
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-interface {v7, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    :cond_0
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ge v4, v3, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v3, v4

    .line 62
    :goto_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move-object v6, v3

    .line 82
    check-cast v6, Lwb/s0;

    .line 83
    .line 84
    iget-object v6, v6, Lwb/s0;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_5

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    move-object v8, v6

    .line 114
    check-cast v8, Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v4, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Lwb/s0;

    .line 121
    .line 122
    if-eqz v6, :cond_4

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    new-instance v7, Lwb/s0;

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    const/16 v16, 0x1e0

    .line 129
    .line 130
    const/4 v10, 0x1

    .line 131
    const-string v11, ""

    .line 132
    .line 133
    const-string v12, ""

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    move-object v9, v8

    .line 138
    invoke-direct/range {v7 .. v16}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 139
    .line 140
    .line 141
    move-object v6, v7

    .line 142
    :goto_3
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :goto_4
    return-object v2

    .line 150
    :pswitch_0
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, Ljava/util/List;

    .line 153
    .line 154
    move-object/from16 v9, p2

    .line 155
    .line 156
    check-cast v9, Ljava/lang/Throwable;

    .line 157
    .line 158
    sget-object v10, Lwb/ho;->a:Log/k;

    .line 159
    .line 160
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-interface {v7, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    if-eqz v9, :cond_7

    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_6

    .line 172
    .line 173
    move-object v4, v1

    .line 174
    :cond_6
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_7
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-ge v4, v3, :cond_8

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    move v3, v4

    .line 190
    :goto_5
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_9

    .line 204
    .line 205
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    move-object v6, v3

    .line 210
    check-cast v6, Lwb/s0;

    .line 211
    .line 212
    iget-object v6, v6, Lwb/s0;->a:Ljava/lang/String;

    .line 213
    .line 214
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_b

    .line 236
    .line 237
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    move-object v8, v6

    .line 242
    check-cast v8, Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v4, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, Lwb/s0;

    .line 249
    .line 250
    if-eqz v6, :cond_a

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_a
    new-instance v7, Lwb/s0;

    .line 254
    .line 255
    const/4 v15, 0x0

    .line 256
    const/16 v16, 0x1e0

    .line 257
    .line 258
    const/4 v10, 0x1

    .line 259
    const-string v11, ""

    .line 260
    .line 261
    const-string v12, ""

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const/4 v14, 0x0

    .line 265
    move-object v9, v8

    .line 266
    invoke-direct/range {v7 .. v16}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 267
    .line 268
    .line 269
    move-object v6, v7

    .line 270
    :goto_8
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_b
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_9
    return-object v2

    .line 278
    :pswitch_1
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, Ljava/util/List;

    .line 281
    .line 282
    move-object/from16 v9, p2

    .line 283
    .line 284
    check-cast v9, Ljava/lang/Throwable;

    .line 285
    .line 286
    sget-object v10, Lwb/ho;->a:Log/k;

    .line 287
    .line 288
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 289
    .line 290
    invoke-interface {v7, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    if-eqz v9, :cond_d

    .line 294
    .line 295
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-eqz v1, :cond_c

    .line 300
    .line 301
    move-object v4, v1

    .line 302
    :cond_c
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_e

    .line 306
    :cond_d
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-ge v4, v3, :cond_e

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_e
    move v3, v4

    .line 318
    :goto_a
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 319
    .line 320
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_f

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    move-object v6, v3

    .line 338
    check-cast v6, Lwb/s0;

    .line 339
    .line 340
    iget-object v6, v6, Lwb/s0;->a:Ljava/lang/String;

    .line 341
    .line 342
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    if-eqz v6, :cond_11

    .line 364
    .line 365
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    move-object v8, v6

    .line 370
    check-cast v8, Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v4, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    check-cast v6, Lwb/s0;

    .line 377
    .line 378
    if-eqz v6, :cond_10

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_10
    new-instance v7, Lwb/s0;

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    const/16 v16, 0x1e0

    .line 385
    .line 386
    const/4 v10, 0x1

    .line 387
    const-string v11, ""

    .line 388
    .line 389
    const-string v12, ""

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const/4 v14, 0x0

    .line 393
    move-object v9, v8

    .line 394
    invoke-direct/range {v7 .. v16}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 395
    .line 396
    .line 397
    move-object v6, v7

    .line 398
    :goto_d
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    goto :goto_c

    .line 402
    :cond_11
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :goto_e
    return-object v2

    .line 406
    :pswitch_2
    move-object/from16 v1, p1

    .line 407
    .line 408
    check-cast v1, Ljava/util/List;

    .line 409
    .line 410
    move-object/from16 v9, p2

    .line 411
    .line 412
    check-cast v9, Ljava/lang/Throwable;

    .line 413
    .line 414
    sget-object v10, Lwb/ho;->a:Log/k;

    .line 415
    .line 416
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-interface {v7, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    if-eqz v9, :cond_13

    .line 422
    .line 423
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    if-eqz v1, :cond_12

    .line 428
    .line 429
    move-object v4, v1

    .line 430
    :cond_12
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto :goto_13

    .line 434
    :cond_13
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-ge v4, v3, :cond_14

    .line 443
    .line 444
    goto :goto_f

    .line 445
    :cond_14
    move v3, v4

    .line 446
    :goto_f
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 447
    .line 448
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_15

    .line 460
    .line 461
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    move-object v6, v3

    .line 466
    check-cast v6, Lwb/s0;

    .line 467
    .line 468
    iget-object v6, v6, Lwb/s0;->a:Ljava/lang/String;

    .line 469
    .line 470
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    goto :goto_10

    .line 474
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 481
    .line 482
    .line 483
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-eqz v6, :cond_17

    .line 492
    .line 493
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    move-object v8, v6

    .line 498
    check-cast v8, Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {v4, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    check-cast v6, Lwb/s0;

    .line 505
    .line 506
    if-eqz v6, :cond_16

    .line 507
    .line 508
    goto :goto_12

    .line 509
    :cond_16
    new-instance v7, Lwb/s0;

    .line 510
    .line 511
    const/4 v15, 0x0

    .line 512
    const/16 v16, 0x1e0

    .line 513
    .line 514
    const/4 v10, 0x1

    .line 515
    const-string v11, ""

    .line 516
    .line 517
    const-string v12, ""

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v14, 0x0

    .line 521
    move-object v9, v8

    .line 522
    invoke-direct/range {v7 .. v16}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 523
    .line 524
    .line 525
    move-object v6, v7

    .line 526
    :goto_12
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto :goto_11

    .line 530
    :cond_17
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    :goto_13
    return-object v2

    .line 534
    nop

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
