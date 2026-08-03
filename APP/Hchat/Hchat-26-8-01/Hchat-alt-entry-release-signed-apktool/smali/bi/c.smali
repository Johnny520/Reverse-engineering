.class public final synthetic Lbi/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbi/c;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbi/c;->g:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-wide/16 v3, 0x1e

    .line 7
    .line 8
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v1, Lk/i1;

    .line 17
    .line 18
    invoke-direct {v1}, Lk/i1;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    sget-object v1, Lk/v0;->a:Li0/u;

    .line 23
    .line 24
    sget-object v1, Lk/e0;->a:Lk/e0;

    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v2, "CompositionLocal LocalHostDefaultProvider not present"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :pswitch_2
    const-string v1, "Unexpected call to default provider"

    .line 36
    .line 37
    invoke-static {v1}, Li0/m;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 38
    .line 39
    .line 40
    new-instance v1, Laf/d;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :pswitch_3
    sget-object v1, Lh0/i;->a:Lh0/k1;

    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_4
    sget-object v1, Lh0/n0;->a:Li0/u;

    .line 50
    .line 51
    return-object v7

    .line 52
    :pswitch_5
    sget-object v1, Lqg/c0;->a:Lxg/e;

    .line 53
    .line 54
    sget-object v1, Lxg/d;->i:Lxg/d;

    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_6
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    .line 58
    .line 59
    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-wide/16 v7, 0xf

    .line 63
    .line 64
    invoke-virtual {v1, v7, v8, v6}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1, v3, v4, v6}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v3, Lfb/h2;->d:Lfb/w;

    .line 73
    .line 74
    invoke-virtual {v1, v3}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->followSslRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    return-object v1

    .line 91
    :pswitch_7
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    .line 92
    .line 93
    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-wide/16 v2, 0x8

    .line 97
    .line 98
    invoke-virtual {v1, v2, v3, v6}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1, v2, v3, v6}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v2, Lfb/h2;->b:Lfb/w;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    return-object v1

    .line 117
    :pswitch_8
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    .line 118
    .line 119
    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-wide/16 v7, 0x14

    .line 123
    .line 124
    invoke-virtual {v1, v7, v8, v6}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-wide/16 v7, 0x78

    .line 129
    .line 130
    invoke-virtual {v1, v7, v8, v6}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, v3, v4, v6}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    return-object v1

    .line 143
    :pswitch_9
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->N()Lme/yun/silk/SilkCodec;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    return-object v1

    .line 148
    :pswitch_a
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->k()Lsf/n;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    return-object v1

    .line 153
    :pswitch_b
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->h()Lsf/n;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    return-object v1

    .line 158
    :pswitch_c
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->g()Lsf/n;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    return-object v1

    .line 163
    :pswitch_d
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->u()Lsf/n;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    return-object v1

    .line 168
    :pswitch_e
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->s()Lsf/n;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    return-object v1

    .line 173
    :pswitch_f
    sget-object v1, Ld9/m;->j:Landroid/graphics/Paint;

    .line 174
    .line 175
    return-object v5

    .line 176
    :pswitch_10
    sget-object v1, Ld0/f;->a:Li0/u;

    .line 177
    .line 178
    return-object v7

    .line 179
    :pswitch_11
    new-instance v1, Lci/z;

    .line 180
    .line 181
    invoke-direct {v1}, Lci/z;-><init>()V

    .line 182
    .line 183
    .line 184
    return-object v1

    .line 185
    :pswitch_12
    sget-object v1, Lci/y;->a:Li0/m2;

    .line 186
    .line 187
    return-object v7

    .line 188
    :pswitch_13
    new-instance v1, Lw0/p;

    .line 189
    .line 190
    invoke-direct {v1}, Lw0/p;-><init>()V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :pswitch_14
    new-instance v1, Lw0/p;

    .line 195
    .line 196
    invoke-direct {v1}, Lw0/p;-><init>()V

    .line 197
    .line 198
    .line 199
    return-object v1

    .line 200
    :pswitch_15
    sget-object v1, Lca/e0;->q:Ljava/util/Set;

    .line 201
    .line 202
    return-object v5

    .line 203
    :pswitch_16
    sget-object v1, Lc9/b0;->a:Landroid/os/Handler;

    .line 204
    .line 205
    return-object v5

    .line 206
    :pswitch_17
    new-instance v1, Landroid/content/Intent;

    .line 207
    .line 208
    const-string v3, "android.intent.action.GET_CONTENT"

    .line 209
    .line 210
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v3, "android.intent.category.OPENABLE"

    .line 214
    .line 215
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 216
    .line 217
    .line 218
    const-string v3, "*/*"

    .line 219
    .line 220
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 224
    .line 225
    .line 226
    const-string v2, "\u9009\u62e9\u804a\u5929\u5206\u7ec4\u6587\u4ef6"

    .line 227
    .line 228
    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :pswitch_18
    sget-object v1, Lbi/n;->a:Li0/m2;

    .line 237
    .line 238
    return-object v7

    .line 239
    :pswitch_19
    new-instance v8, Li2/n0;

    .line 240
    .line 241
    const/16 v1, 0x11

    .line 242
    .line 243
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 244
    .line 245
    .line 246
    move-result-wide v11

    .line 247
    const-wide/16 v17, 0x0

    .line 248
    .line 249
    const v19, 0xfffffd

    .line 250
    .line 251
    .line 252
    const-wide/16 v9, 0x0

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const-wide/16 v14, 0x0

    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    invoke-direct/range {v8 .. v19}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 260
    .line 261
    .line 262
    new-instance v9, Li2/n0;

    .line 263
    .line 264
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 265
    .line 266
    .line 267
    move-result-wide v12

    .line 268
    const v1, 0x3f99999a    # 1.2f

    .line 269
    .line 270
    .line 271
    const-wide v2, 0x200000000L

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    invoke-static {v2, v3, v1}, Lx6/d;->R(JF)J

    .line 277
    .line 278
    .line 279
    move-result-wide v18

    .line 280
    const v20, 0xfdfffd

    .line 281
    .line 282
    .line 283
    const-wide/16 v10, 0x0

    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const-wide/16 v15, 0x0

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    invoke-direct/range {v9 .. v20}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 291
    .line 292
    .line 293
    new-instance v10, Li2/n0;

    .line 294
    .line 295
    const/16 v1, 0x10

    .line 296
    .line 297
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v13

    .line 301
    const-wide/16 v19, 0x0

    .line 302
    .line 303
    const v21, 0xfffffd

    .line 304
    .line 305
    .line 306
    const-wide/16 v11, 0x0

    .line 307
    .line 308
    const/4 v15, 0x0

    .line 309
    const-wide/16 v16, 0x0

    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    invoke-direct/range {v10 .. v21}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 314
    .line 315
    .line 316
    new-instance v11, Li2/n0;

    .line 317
    .line 318
    const/16 v1, 0xe

    .line 319
    .line 320
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v14

    .line 324
    const-wide/16 v20, 0x0

    .line 325
    .line 326
    const v22, 0xfffffd

    .line 327
    .line 328
    .line 329
    const-wide/16 v12, 0x0

    .line 330
    .line 331
    const/16 v16, 0x0

    .line 332
    .line 333
    const-wide/16 v17, 0x0

    .line 334
    .line 335
    const/16 v19, 0x0

    .line 336
    .line 337
    invoke-direct/range {v11 .. v22}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 338
    .line 339
    .line 340
    new-instance v12, Li2/n0;

    .line 341
    .line 342
    const/16 v1, 0x11

    .line 343
    .line 344
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v15

    .line 348
    const-wide/16 v21, 0x0

    .line 349
    .line 350
    const v23, 0xfffffd

    .line 351
    .line 352
    .line 353
    const-wide/16 v13, 0x0

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const-wide/16 v18, 0x0

    .line 358
    .line 359
    const/16 v20, 0x0

    .line 360
    .line 361
    invoke-direct/range {v12 .. v23}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 362
    .line 363
    .line 364
    new-instance v13, Li2/n0;

    .line 365
    .line 366
    const/16 v1, 0xd

    .line 367
    .line 368
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 369
    .line 370
    .line 371
    move-result-wide v16

    .line 372
    const-wide/16 v22, 0x0

    .line 373
    .line 374
    const v24, 0xfffffd

    .line 375
    .line 376
    .line 377
    const-wide/16 v14, 0x0

    .line 378
    .line 379
    const/16 v18, 0x0

    .line 380
    .line 381
    const-wide/16 v19, 0x0

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    invoke-direct/range {v13 .. v24}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 386
    .line 387
    .line 388
    new-instance v15, Li2/n0;

    .line 389
    .line 390
    const/16 v1, 0xb

    .line 391
    .line 392
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 393
    .line 394
    .line 395
    move-result-wide v17

    .line 396
    const-wide/16 v23, 0x0

    .line 397
    .line 398
    const v25, 0xfffffd

    .line 399
    .line 400
    .line 401
    move-object v14, v15

    .line 402
    const-wide/16 v15, 0x0

    .line 403
    .line 404
    const/16 v19, 0x0

    .line 405
    .line 406
    const-wide/16 v20, 0x0

    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    invoke-direct/range {v14 .. v25}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 411
    .line 412
    .line 413
    new-instance v15, Li2/n0;

    .line 414
    .line 415
    const/16 v1, 0x11

    .line 416
    .line 417
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 418
    .line 419
    .line 420
    move-result-wide v18

    .line 421
    const-wide/16 v24, 0x0

    .line 422
    .line 423
    const v26, 0xfffffd

    .line 424
    .line 425
    .line 426
    const-wide/16 v16, 0x0

    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const-wide/16 v21, 0x0

    .line 431
    .line 432
    const/16 v23, 0x0

    .line 433
    .line 434
    invoke-direct/range {v15 .. v26}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 435
    .line 436
    .line 437
    new-instance v16, Li2/n0;

    .line 438
    .line 439
    const/16 v1, 0x10

    .line 440
    .line 441
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 442
    .line 443
    .line 444
    move-result-wide v19

    .line 445
    const-wide/16 v25, 0x0

    .line 446
    .line 447
    const v27, 0xfffffd

    .line 448
    .line 449
    .line 450
    const-wide/16 v17, 0x0

    .line 451
    .line 452
    const/16 v21, 0x0

    .line 453
    .line 454
    const-wide/16 v22, 0x0

    .line 455
    .line 456
    const/16 v24, 0x0

    .line 457
    .line 458
    invoke-direct/range {v16 .. v27}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 459
    .line 460
    .line 461
    new-instance v17, Li2/n0;

    .line 462
    .line 463
    const/16 v1, 0xe

    .line 464
    .line 465
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 466
    .line 467
    .line 468
    move-result-wide v20

    .line 469
    sget-object v22, Lm2/k;->l:Lm2/k;

    .line 470
    .line 471
    const-wide/16 v26, 0x0

    .line 472
    .line 473
    const v28, 0xfffff9

    .line 474
    .line 475
    .line 476
    const-wide/16 v18, 0x0

    .line 477
    .line 478
    const-wide/16 v23, 0x0

    .line 479
    .line 480
    const/16 v25, 0x0

    .line 481
    .line 482
    invoke-direct/range {v17 .. v28}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 483
    .line 484
    .line 485
    new-instance v18, Li2/n0;

    .line 486
    .line 487
    const/16 v1, 0x20

    .line 488
    .line 489
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v21

    .line 493
    const-wide/16 v27, 0x0

    .line 494
    .line 495
    const v29, 0xfffffd

    .line 496
    .line 497
    .line 498
    const-wide/16 v19, 0x0

    .line 499
    .line 500
    const/16 v23, 0x0

    .line 501
    .line 502
    const-wide/16 v24, 0x0

    .line 503
    .line 504
    const/16 v26, 0x0

    .line 505
    .line 506
    invoke-direct/range {v18 .. v29}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 507
    .line 508
    .line 509
    new-instance v19, Li2/n0;

    .line 510
    .line 511
    const/16 v1, 0x18

    .line 512
    .line 513
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 514
    .line 515
    .line 516
    move-result-wide v22

    .line 517
    const-wide/16 v28, 0x0

    .line 518
    .line 519
    const v30, 0xfffffd

    .line 520
    .line 521
    .line 522
    const-wide/16 v20, 0x0

    .line 523
    .line 524
    const/16 v24, 0x0

    .line 525
    .line 526
    const-wide/16 v25, 0x0

    .line 527
    .line 528
    const/16 v27, 0x0

    .line 529
    .line 530
    invoke-direct/range {v19 .. v30}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 531
    .line 532
    .line 533
    new-instance v20, Li2/n0;

    .line 534
    .line 535
    const/16 v1, 0x14

    .line 536
    .line 537
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 538
    .line 539
    .line 540
    move-result-wide v23

    .line 541
    const-wide/16 v29, 0x0

    .line 542
    .line 543
    const v31, 0xfffffd

    .line 544
    .line 545
    .line 546
    const-wide/16 v21, 0x0

    .line 547
    .line 548
    const/16 v25, 0x0

    .line 549
    .line 550
    const-wide/16 v26, 0x0

    .line 551
    .line 552
    const/16 v28, 0x0

    .line 553
    .line 554
    invoke-direct/range {v20 .. v31}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 555
    .line 556
    .line 557
    new-instance v21, Li2/n0;

    .line 558
    .line 559
    const/16 v1, 0x12

    .line 560
    .line 561
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 562
    .line 563
    .line 564
    move-result-wide v24

    .line 565
    const-wide/16 v30, 0x0

    .line 566
    .line 567
    const v32, 0xfffffd

    .line 568
    .line 569
    .line 570
    const-wide/16 v22, 0x0

    .line 571
    .line 572
    const/16 v26, 0x0

    .line 573
    .line 574
    const-wide/16 v27, 0x0

    .line 575
    .line 576
    const/16 v29, 0x0

    .line 577
    .line 578
    invoke-direct/range {v21 .. v32}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v1, v20

    .line 582
    .line 583
    move-object/from16 v20, v19

    .line 584
    .line 585
    move-object/from16 v19, v18

    .line 586
    .line 587
    move-object/from16 v18, v17

    .line 588
    .line 589
    move-object/from16 v17, v16

    .line 590
    .line 591
    move-object/from16 v16, v15

    .line 592
    .line 593
    move-object v15, v14

    .line 594
    move-object v14, v13

    .line 595
    move-object v13, v12

    .line 596
    move-object v12, v11

    .line 597
    move-object v11, v10

    .line 598
    move-object v10, v9

    .line 599
    move-object v9, v8

    .line 600
    new-instance v8, Lbi/l;

    .line 601
    .line 602
    move-object/from16 v22, v21

    .line 603
    .line 604
    move-object/from16 v21, v1

    .line 605
    .line 606
    invoke-direct/range {v8 .. v22}, Lbi/l;-><init>(Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;)V

    .line 607
    .line 608
    .line 609
    return-object v8

    .line 610
    :pswitch_1a
    sget-object v1, Lbi/k;->a:Li0/m2;

    .line 611
    .line 612
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 613
    .line 614
    return-object v1

    .line 615
    :pswitch_1b
    sget-object v1, Lbi/g;->a:Li0/m2;

    .line 616
    .line 617
    return-object v7

    .line 618
    :pswitch_1c
    invoke-static {}, Lbi/d;->b()Lbi/b;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    return-object v1

    .line 623
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
