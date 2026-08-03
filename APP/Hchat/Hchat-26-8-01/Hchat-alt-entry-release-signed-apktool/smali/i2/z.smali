.class public final synthetic Li2/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li2/z;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 7
    iput p2, p0, Li2/z;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Li2/z;->g:I

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x7

    .line 10
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x6

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x1

    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    move v11, v12

    .line 24
    :cond_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast v0, Lng/j;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_1
    check-cast v0, Landroid/speech/tts/Voice;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_2
    check-cast v0, Landroid/speech/tts/Voice;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    xor-int/2addr v0, v12

    .line 60
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_4
    check-cast v0, Ls1/d0;

    .line 79
    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget v0, v0, Ls1/d0;->a:I

    .line 84
    .line 85
    if-ne v0, v9, :cond_2

    .line 86
    .line 87
    move v11, v12

    .line 88
    :cond_2
    :goto_0
    xor-int/lit8 v0, v11, 0x1

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :pswitch_5
    check-cast v0, Ls1/d0;

    .line 96
    .line 97
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_6
    check-cast v0, Ls0/h;

    .line 101
    .line 102
    sget-object v2, Ly1/i0;->b:Li0/m2;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v2}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Landroid/content/Context;

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v2, "android.software.leanback"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_3

    .line 124
    .line 125
    sget-object v0, Lm/f;->a:Lm/e;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    sget-object v0, Lm/e;->c:Lm/d;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    sget-object v0, Lm/h;->b:Lm/g;

    .line 134
    .line 135
    :goto_1
    return-object v0

    .line 136
    :pswitch_7
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v2, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_4

    .line 148
    .line 149
    move-object v10, v2

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    const/4 v10, 0x0

    .line 152
    :goto_2
    if-eqz v10, :cond_5

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-array v2, v9, [C

    .line 160
    .line 161
    fill-array-data v2, :array_0

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v2}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-array v3, v12, [C

    .line 169
    .line 170
    const/16 v4, 0x3a

    .line 171
    .line 172
    aput-char v4, v3, v11

    .line 173
    .line 174
    invoke-static {v2, v3, v8}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-lt v3, v7, :cond_7

    .line 183
    .line 184
    const/16 v3, 0x3c

    .line 185
    .line 186
    invoke-static {v0, v3, v11, v8}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-gez v3, :cond_7

    .line 191
    .line 192
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-ne v0, v6, :cond_6

    .line 197
    .line 198
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ljava/lang/String;

    .line 210
    .line 211
    :goto_3
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    goto :goto_4

    .line 220
    :cond_7
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const-string v2, "filename"

    .line 226
    .line 227
    invoke-static {v0, v2}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_8

    .line 236
    .line 237
    const-string v3, "voiceurl"

    .line 238
    .line 239
    invoke-static {v0, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :cond_8
    move-object v10, v3

    .line 244
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_9

    .line 249
    .line 250
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    :cond_9
    :goto_4
    return-object v10

    .line 255
    :pswitch_8
    check-cast v0, Log/f;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-object v2, v0

    .line 261
    check-cast v2, Log/i;

    .line 262
    .line 263
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Log/g;

    .line 268
    .line 269
    invoke-virtual {v0, v12}, Log/g;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Ljava/lang/String;

    .line 274
    .line 275
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 276
    .line 277
    :try_start_0
    const-string v3, "x"

    .line 278
    .line 279
    invoke-static {v0, v3, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_a

    .line 284
    .line 285
    invoke-virtual {v0, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const/16 v3, 0x10

    .line 290
    .line 291
    invoke-static {v3}, La/a;->w(I)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    goto :goto_5

    .line 299
    :catchall_0
    move-exception v0

    .line 300
    goto :goto_6

    .line 301
    :cond_a
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    goto :goto_7

    .line 310
    :goto_6
    new-instance v3, Lsf/f;

    .line 311
    .line 312
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    move-object v0, v3

    .line 316
    :goto_7
    nop

    .line 317
    instance-of v3, v0, Lsf/f;

    .line 318
    .line 319
    if-eqz v3, :cond_b

    .line 320
    .line 321
    const/4 v10, 0x0

    .line 322
    goto :goto_8

    .line 323
    :cond_b
    move-object v10, v0

    .line 324
    :goto_8
    check-cast v10, Ljava/lang/Integer;

    .line 325
    .line 326
    if-nez v10, :cond_c

    .line 327
    .line 328
    invoke-virtual {v2}, Log/i;->c()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    goto :goto_a

    .line 333
    :cond_c
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 334
    .line 335
    :try_start_1
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-static {v0}, Ljava/lang/Character;->toChars(I)[C

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    new-instance v3, Ljava/lang/String;

    .line 347
    .line 348
    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([C)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 349
    .line 350
    .line 351
    goto :goto_9

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    new-instance v3, Lsf/f;

    .line 354
    .line 355
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 356
    .line 357
    .line 358
    :goto_9
    invoke-virtual {v2}, Log/i;->c()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    instance-of v2, v3, Lsf/f;

    .line 363
    .line 364
    if-eqz v2, :cond_d

    .line 365
    .line 366
    move-object v3, v0

    .line 367
    :cond_d
    move-object v0, v3

    .line 368
    check-cast v0, Ljava/lang/CharSequence;

    .line 369
    .line 370
    :goto_a
    return-object v0

    .line 371
    :pswitch_9
    check-cast v0, Ljava/lang/reflect/Field;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 381
    .line 382
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_e

    .line 387
    .line 388
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-nez v0, :cond_e

    .line 393
    .line 394
    move v11, v12

    .line 395
    :cond_e
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    return-object v0

    .line 400
    :pswitch_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_b
    check-cast v0, Ljava/lang/Integer;

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    new-instance v2, Lk/w1;

    .line 420
    .line 421
    invoke-direct {v2, v0}, Lk/w1;-><init>(I)V

    .line 422
    .line 423
    .line 424
    return-object v2

    .line 425
    :pswitch_c
    check-cast v0, Ls0/h;

    .line 426
    .line 427
    sget v2, Lk/k;->a:I

    .line 428
    .line 429
    sget-object v2, Ly1/i0;->b:Li0/m2;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v2}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    move-object v4, v2

    .line 439
    check-cast v4, Landroid/content/Context;

    .line 440
    .line 441
    sget-object v2, Ly1/h1;->h:Li0/m2;

    .line 442
    .line 443
    invoke-static {v0, v2}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object v5, v2

    .line 448
    check-cast v5, Lu2/c;

    .line 449
    .line 450
    sget-object v2, Lk/j1;->a:Li0/u;

    .line 451
    .line 452
    invoke-static {v0, v2}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, Lk/i1;

    .line 457
    .line 458
    if-nez v0, :cond_f

    .line 459
    .line 460
    const/4 v10, 0x0

    .line 461
    goto :goto_b

    .line 462
    :cond_f
    new-instance v3, Lk/j;

    .line 463
    .line 464
    iget-wide v6, v0, Lk/i1;->a:J

    .line 465
    .line 466
    iget-object v8, v0, Lk/i1;->b:Lp/z0;

    .line 467
    .line 468
    invoke-direct/range {v3 .. v8}, Lk/j;-><init>(Landroid/content/Context;Lu2/c;JLp/x0;)V

    .line 469
    .line 470
    .line 471
    move-object v10, v3

    .line 472
    :goto_b
    return-object v10

    .line 473
    :pswitch_d
    check-cast v0, Ljava/lang/Long;

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    return-object v5

    .line 479
    :pswitch_e
    check-cast v0, Lv1/a1;

    .line 480
    .line 481
    return-object v5

    .line 482
    :pswitch_f
    check-cast v0, Lx1/h0;

    .line 483
    .line 484
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 485
    .line 486
    .line 487
    return-object v5

    .line 488
    :pswitch_10
    check-cast v0, Ljava/lang/reflect/Method;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_11
    check-cast v0, Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    xor-int/2addr v0, v12

    .line 511
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    :pswitch_12
    check-cast v0, Log/f;

    .line 517
    .line 518
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    check-cast v0, Log/i;

    .line 522
    .line 523
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    check-cast v0, Log/g;

    .line 528
    .line 529
    invoke-virtual {v0, v9}, Log/g;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    check-cast v0, Ljava/lang/String;

    .line 534
    .line 535
    if-eqz v0, :cond_12

    .line 536
    .line 537
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-eqz v2, :cond_10

    .line 542
    .line 543
    goto :goto_c

    .line 544
    :cond_10
    invoke-static {v0}, Lj8/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    if-eqz v2, :cond_11

    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_11
    const/16 v2, 0xa0

    .line 556
    .line 557
    invoke-static {v2, v0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    goto :goto_d

    .line 562
    :cond_12
    :goto_c
    const-string v0, ""

    .line 563
    .line 564
    :goto_d
    return-object v0

    .line 565
    :pswitch_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 569
    .line 570
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 571
    .line 572
    .line 573
    const-string v3, "getContent"

    .line 574
    .line 575
    const-string v4, "getMsgContent"

    .line 576
    .line 577
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    move v4, v11

    .line 582
    :goto_e
    if-lt v4, v9, :cond_17

    .line 583
    .line 584
    const-string v3, "content"

    .line 585
    .line 586
    const-string v4, "msgContent"

    .line 587
    .line 588
    const-string v5, "field_content"

    .line 589
    .line 590
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    :goto_f
    if-lt v11, v7, :cond_13

    .line 595
    .line 596
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    new-instance v2, Ldg/n;

    .line 601
    .line 602
    invoke-direct {v2, v0, v8}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 603
    .line 604
    .line 605
    return-object v2

    .line 606
    :cond_13
    aget-object v3, v5, v11

    .line 607
    .line 608
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    instance-of v4, v3, Ljava/lang/String;

    .line 613
    .line 614
    if-eqz v4, :cond_14

    .line 615
    .line 616
    check-cast v3, Ljava/lang/String;

    .line 617
    .line 618
    goto :goto_10

    .line 619
    :cond_14
    const/4 v3, 0x0

    .line 620
    :goto_10
    if-eqz v3, :cond_16

    .line 621
    .line 622
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-nez v4, :cond_15

    .line 627
    .line 628
    goto :goto_11

    .line 629
    :cond_15
    const/4 v3, 0x0

    .line 630
    :goto_11
    if-eqz v3, :cond_16

    .line 631
    .line 632
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    :cond_16
    add-int/lit8 v11, v11, 0x1

    .line 636
    .line 637
    goto :goto_f

    .line 638
    :cond_17
    aget-object v5, v3, v4

    .line 639
    .line 640
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    new-array v12, v11, [Ljava/lang/Class;

    .line 645
    .line 646
    invoke-static {v6, v5, v12}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 647
    .line 648
    .line 649
    move-result-object v5

    .line 650
    if-eqz v5, :cond_1b

    .line 651
    .line 652
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    array-length v6, v6

    .line 660
    if-nez v6, :cond_18

    .line 661
    .line 662
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    const-class v12, Ljava/lang/String;

    .line 667
    .line 668
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    if-eqz v6, :cond_18

    .line 673
    .line 674
    goto :goto_12

    .line 675
    :cond_18
    const/4 v5, 0x0

    .line 676
    :goto_12
    if-eqz v5, :cond_1b

    .line 677
    .line 678
    new-array v6, v11, [Ljava/lang/Object;

    .line 679
    .line 680
    invoke-static {v5, v0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    instance-of v6, v5, Ljava/lang/String;

    .line 685
    .line 686
    if-eqz v6, :cond_19

    .line 687
    .line 688
    check-cast v5, Ljava/lang/String;

    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_19
    const/4 v5, 0x0

    .line 692
    :goto_13
    if-eqz v5, :cond_1b

    .line 693
    .line 694
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    if-nez v6, :cond_1a

    .line 699
    .line 700
    goto :goto_14

    .line 701
    :cond_1a
    const/4 v5, 0x0

    .line 702
    :goto_14
    if-eqz v5, :cond_1b

    .line 703
    .line 704
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    :cond_1b
    add-int/lit8 v4, v4, 0x1

    .line 708
    .line 709
    goto :goto_e

    .line 710
    :pswitch_14
    check-cast v0, Lhh/o;

    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0}, Lhh/o;->q()Lhh/p;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-static {v0}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    return-object v0

    .line 724
    :pswitch_15
    check-cast v0, Lwb/jv;

    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    iget-object v0, v0, Lwb/jv;->a:Ljava/lang/String;

    .line 730
    .line 731
    return-object v0

    .line 732
    :pswitch_16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    check-cast v0, Ljava/lang/Integer;

    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    new-instance v2, Lt2/r;

    .line 742
    .line 743
    invoke-direct {v2, v0}, Lt2/r;-><init>(I)V

    .line 744
    .line 745
    .line 746
    return-object v2

    .line 747
    :pswitch_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    check-cast v0, Ljava/util/List;

    .line 751
    .line 752
    new-instance v2, Lt2/s;

    .line 753
    .line 754
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 759
    .line 760
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    sget-object v5, Li2/e0;->e:Lp4/t;

    .line 765
    .line 766
    if-eqz v4, :cond_1d

    .line 767
    .line 768
    :cond_1c
    const/4 v3, 0x0

    .line 769
    goto :goto_15

    .line 770
    :cond_1d
    if-eqz v3, :cond_1c

    .line 771
    .line 772
    iget-object v4, v5, Lp4/t;->i:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v4, Lfg/l;

    .line 775
    .line 776
    invoke-interface {v4, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    check-cast v3, Lt2/r;

    .line 781
    .line 782
    :goto_15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    iget v3, v3, Lt2/r;->a:I

    .line 786
    .line 787
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    if-eqz v0, :cond_1e

    .line 792
    .line 793
    move-object v10, v0

    .line 794
    check-cast v10, Ljava/lang/Boolean;

    .line 795
    .line 796
    goto :goto_16

    .line 797
    :cond_1e
    const/4 v10, 0x0

    .line 798
    :goto_16
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    invoke-direct {v2, v3, v0}, Lt2/s;-><init>(IZ)V

    .line 806
    .line 807
    .line 808
    return-object v2

    .line 809
    :pswitch_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    check-cast v0, Ljava/lang/Integer;

    .line 813
    .line 814
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    new-instance v2, Lt2/e;

    .line 819
    .line 820
    invoke-direct {v2, v0}, Lt2/e;-><init>(I)V

    .line 821
    .line 822
    .line 823
    return-object v2

    .line 824
    :pswitch_19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    check-cast v0, Ljava/lang/Integer;

    .line 828
    .line 829
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    new-instance v2, Li2/j;

    .line 834
    .line 835
    invoke-direct {v2, v0}, Li2/j;-><init>(I)V

    .line 836
    .line 837
    .line 838
    return-object v2

    .line 839
    :pswitch_1a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    check-cast v0, Ljava/util/List;

    .line 843
    .line 844
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    if-eqz v2, :cond_1f

    .line 849
    .line 850
    check-cast v2, Ljava/lang/Boolean;

    .line 851
    .line 852
    goto :goto_17

    .line 853
    :cond_1f
    const/4 v2, 0x0

    .line 854
    :goto_17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 866
    .line 867
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    sget-object v4, Li2/e0;->b:Lp4/t;

    .line 872
    .line 873
    if-eqz v3, :cond_21

    .line 874
    .line 875
    :cond_20
    const/4 v10, 0x0

    .line 876
    goto :goto_18

    .line 877
    :cond_21
    if-eqz v0, :cond_20

    .line 878
    .line 879
    iget-object v3, v4, Lp4/t;->i:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v3, Lfg/l;

    .line 882
    .line 883
    invoke-interface {v3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    move-object v10, v0

    .line 888
    check-cast v10, Li2/j;

    .line 889
    .line 890
    :goto_18
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    iget v0, v10, Li2/j;->a:I

    .line 894
    .line 895
    new-instance v3, Li2/w;

    .line 896
    .line 897
    invoke-direct {v3, v0, v2}, Li2/w;-><init>(IZ)V

    .line 898
    .line 899
    .line 900
    return-object v3

    .line 901
    :pswitch_1b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    check-cast v0, Ljava/util/List;

    .line 905
    .line 906
    new-instance v13, Li2/f0;

    .line 907
    .line 908
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    sget v5, Lf1/w;->h:I

    .line 913
    .line 914
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 915
    .line 916
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    if-eqz v2, :cond_23

    .line 920
    .line 921
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v11

    .line 925
    if-eqz v11, :cond_22

    .line 926
    .line 927
    sget-wide v14, Lf1/w;->g:J

    .line 928
    .line 929
    new-instance v2, Lf1/w;

    .line 930
    .line 931
    invoke-direct {v2, v14, v15}, Lf1/w;-><init>(J)V

    .line 932
    .line 933
    .line 934
    goto :goto_19

    .line 935
    :cond_22
    check-cast v2, Ljava/lang/Integer;

    .line 936
    .line 937
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    invoke-static {v2}, Lf1/c0;->c(I)J

    .line 942
    .line 943
    .line 944
    move-result-wide v14

    .line 945
    new-instance v2, Lf1/w;

    .line 946
    .line 947
    invoke-direct {v2, v14, v15}, Lf1/w;-><init>(J)V

    .line 948
    .line 949
    .line 950
    goto :goto_19

    .line 951
    :cond_23
    const/4 v2, 0x0

    .line 952
    :goto_19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    iget-wide v14, v2, Lf1/w;->a:J

    .line 956
    .line 957
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    sget-object v11, Lu2/o;->b:[Lu2/p;

    .line 962
    .line 963
    sget-object v11, Li2/d0;->v:Li2/c0;

    .line 964
    .line 965
    iget-object v11, v11, Li2/c0;->h:Lfg/l;

    .line 966
    .line 967
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    if-eqz v2, :cond_24

    .line 971
    .line 972
    invoke-interface {v11, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    check-cast v2, Lu2/o;

    .line 977
    .line 978
    goto :goto_1a

    .line 979
    :cond_24
    const/4 v2, 0x0

    .line 980
    :goto_1a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    move-object v12, v11

    .line 984
    iget-wide v10, v2, Lu2/o;->a:J

    .line 985
    .line 986
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    sget-object v9, Lm2/k;->h:Lm2/k;

    .line 991
    .line 992
    sget-object v9, Li2/d0;->m:Lp4/t;

    .line 993
    .line 994
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result v17

    .line 998
    if-eqz v17, :cond_26

    .line 999
    .line 1000
    :cond_25
    const/16 v18, 0x0

    .line 1001
    .line 1002
    goto :goto_1b

    .line 1003
    :cond_26
    if-eqz v2, :cond_25

    .line 1004
    .line 1005
    iget-object v9, v9, Lp4/t;->i:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v9, Lfg/l;

    .line 1008
    .line 1009
    invoke-interface {v9, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    check-cast v2, Lm2/k;

    .line 1014
    .line 1015
    move-object/from16 v18, v2

    .line 1016
    .line 1017
    :goto_1b
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    sget-object v7, Li2/d0;->t:Lp4/t;

    .line 1022
    .line 1023
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v9

    .line 1027
    if-eqz v9, :cond_28

    .line 1028
    .line 1029
    :cond_27
    const/16 v19, 0x0

    .line 1030
    .line 1031
    goto :goto_1c

    .line 1032
    :cond_28
    if-eqz v2, :cond_27

    .line 1033
    .line 1034
    iget-object v7, v7, Lp4/t;->i:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v7, Lfg/l;

    .line 1037
    .line 1038
    invoke-interface {v7, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    check-cast v2, Lm2/i;

    .line 1043
    .line 1044
    move-object/from16 v19, v2

    .line 1045
    .line 1046
    :goto_1c
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v2

    .line 1050
    sget-object v6, Li2/d0;->u:Lp4/t;

    .line 1051
    .line 1052
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v7

    .line 1056
    if-eqz v7, :cond_2a

    .line 1057
    .line 1058
    :cond_29
    const/16 v20, 0x0

    .line 1059
    .line 1060
    goto :goto_1d

    .line 1061
    :cond_2a
    if-eqz v2, :cond_29

    .line 1062
    .line 1063
    iget-object v6, v6, Lp4/t;->i:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v6, Lfg/l;

    .line 1066
    .line 1067
    invoke-interface {v6, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    check-cast v2, Lm2/j;

    .line 1072
    .line 1073
    move-object/from16 v20, v2

    .line 1074
    .line 1075
    :goto_1d
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    if-eqz v2, :cond_2b

    .line 1080
    .line 1081
    check-cast v2, Ljava/lang/String;

    .line 1082
    .line 1083
    move-object/from16 v22, v2

    .line 1084
    .line 1085
    goto :goto_1e

    .line 1086
    :cond_2b
    const/16 v22, 0x0

    .line 1087
    .line 1088
    :goto_1e
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    if-eqz v2, :cond_2c

    .line 1096
    .line 1097
    invoke-interface {v12, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v2

    .line 1101
    check-cast v2, Lu2/o;

    .line 1102
    .line 1103
    goto :goto_1f

    .line 1104
    :cond_2c
    const/4 v2, 0x0

    .line 1105
    :goto_1f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    iget-wide v6, v2, Lu2/o;->a:J

    .line 1109
    .line 1110
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    sget-object v3, Li2/d0;->n:Lp4/t;

    .line 1115
    .line 1116
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v4

    .line 1120
    if-eqz v4, :cond_2e

    .line 1121
    .line 1122
    :cond_2d
    const/16 v25, 0x0

    .line 1123
    .line 1124
    goto :goto_20

    .line 1125
    :cond_2e
    if-eqz v2, :cond_2d

    .line 1126
    .line 1127
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v3, Lfg/l;

    .line 1130
    .line 1131
    invoke-interface {v3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v2

    .line 1135
    check-cast v2, Lt2/a;

    .line 1136
    .line 1137
    move-object/from16 v25, v2

    .line 1138
    .line 1139
    :goto_20
    const/16 v2, 0x9

    .line 1140
    .line 1141
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    sget-object v3, Li2/d0;->k:Lp4/t;

    .line 1146
    .line 1147
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v4

    .line 1151
    if-eqz v4, :cond_30

    .line 1152
    .line 1153
    :cond_2f
    const/16 v26, 0x0

    .line 1154
    .line 1155
    goto :goto_21

    .line 1156
    :cond_30
    if-eqz v2, :cond_2f

    .line 1157
    .line 1158
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v3, Lfg/l;

    .line 1161
    .line 1162
    invoke-interface {v3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    check-cast v2, Lt2/p;

    .line 1167
    .line 1168
    move-object/from16 v26, v2

    .line 1169
    .line 1170
    :goto_21
    const/16 v2, 0xa

    .line 1171
    .line 1172
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    sget-object v3, Lp2/b;->i:Lp2/b;

    .line 1177
    .line 1178
    sget-object v3, Li2/d0;->y:Lp4/t;

    .line 1179
    .line 1180
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v4

    .line 1184
    if-eqz v4, :cond_32

    .line 1185
    .line 1186
    :cond_31
    const/16 v27, 0x0

    .line 1187
    .line 1188
    goto :goto_22

    .line 1189
    :cond_32
    if-eqz v2, :cond_31

    .line 1190
    .line 1191
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v3, Lfg/l;

    .line 1194
    .line 1195
    invoke-interface {v3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v2

    .line 1199
    check-cast v2, Lp2/b;

    .line 1200
    .line 1201
    move-object/from16 v27, v2

    .line 1202
    .line 1203
    :goto_22
    const/16 v2, 0xb

    .line 1204
    .line 1205
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    if-eqz v2, :cond_34

    .line 1213
    .line 1214
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v3

    .line 1218
    if-eqz v3, :cond_33

    .line 1219
    .line 1220
    sget-wide v2, Lf1/w;->g:J

    .line 1221
    .line 1222
    new-instance v4, Lf1/w;

    .line 1223
    .line 1224
    invoke-direct {v4, v2, v3}, Lf1/w;-><init>(J)V

    .line 1225
    .line 1226
    .line 1227
    goto :goto_23

    .line 1228
    :cond_33
    check-cast v2, Ljava/lang/Integer;

    .line 1229
    .line 1230
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    invoke-static {v2}, Lf1/c0;->c(I)J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v2

    .line 1238
    new-instance v4, Lf1/w;

    .line 1239
    .line 1240
    invoke-direct {v4, v2, v3}, Lf1/w;-><init>(J)V

    .line 1241
    .line 1242
    .line 1243
    goto :goto_23

    .line 1244
    :cond_34
    const/4 v4, 0x0

    .line 1245
    :goto_23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    iget-wide v2, v4, Lf1/w;->a:J

    .line 1249
    .line 1250
    const/16 v4, 0xc

    .line 1251
    .line 1252
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v4

    .line 1256
    sget-object v8, Li2/d0;->j:Lp4/t;

    .line 1257
    .line 1258
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v9

    .line 1262
    if-eqz v9, :cond_36

    .line 1263
    .line 1264
    :cond_35
    const/16 v30, 0x0

    .line 1265
    .line 1266
    goto :goto_24

    .line 1267
    :cond_36
    if-eqz v4, :cond_35

    .line 1268
    .line 1269
    iget-object v8, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 1270
    .line 1271
    check-cast v8, Lfg/l;

    .line 1272
    .line 1273
    invoke-interface {v8, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v4

    .line 1277
    check-cast v4, Lt2/l;

    .line 1278
    .line 1279
    move-object/from16 v30, v4

    .line 1280
    .line 1281
    :goto_24
    const/16 v4, 0xd

    .line 1282
    .line 1283
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    sget-object v4, Lf1/q0;->d:Lf1/q0;

    .line 1288
    .line 1289
    sget-object v4, Li2/d0;->o:Lp4/t;

    .line 1290
    .line 1291
    invoke-static {v0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v5

    .line 1295
    if-eqz v5, :cond_38

    .line 1296
    .line 1297
    :cond_37
    const/16 v31, 0x0

    .line 1298
    .line 1299
    goto :goto_25

    .line 1300
    :cond_38
    if-eqz v0, :cond_37

    .line 1301
    .line 1302
    iget-object v4, v4, Lp4/t;->i:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v4, Lfg/l;

    .line 1305
    .line 1306
    invoke-interface {v4, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    check-cast v0, Lf1/q0;

    .line 1311
    .line 1312
    move-object/from16 v31, v0

    .line 1313
    .line 1314
    :goto_25
    const v32, 0xc020

    .line 1315
    .line 1316
    .line 1317
    const/16 v21, 0x0

    .line 1318
    .line 1319
    move-wide/from16 v28, v2

    .line 1320
    .line 1321
    move-wide/from16 v23, v6

    .line 1322
    .line 1323
    move-wide/from16 v16, v10

    .line 1324
    .line 1325
    invoke-direct/range {v13 .. v32}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 1326
    .line 1327
    .line 1328
    return-object v13

    .line 1329
    :pswitch_1c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    check-cast v0, Ljava/util/List;

    .line 1333
    .line 1334
    new-instance v17, Li2/u;

    .line 1335
    .line 1336
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    sget-object v5, Li2/d0;->q:Li2/c0;

    .line 1341
    .line 1342
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1343
    .line 1344
    invoke-static {v2, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1345
    .line 1346
    .line 1347
    if-eqz v2, :cond_39

    .line 1348
    .line 1349
    iget-object v5, v5, Li2/c0;->h:Lfg/l;

    .line 1350
    .line 1351
    invoke-interface {v5, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v2

    .line 1355
    check-cast v2, Lt2/k;

    .line 1356
    .line 1357
    goto :goto_26

    .line 1358
    :cond_39
    const/4 v2, 0x0

    .line 1359
    :goto_26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1360
    .line 1361
    .line 1362
    iget v2, v2, Lt2/k;->a:I

    .line 1363
    .line 1364
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v5

    .line 1368
    sget-object v11, Li2/d0;->r:Li2/c0;

    .line 1369
    .line 1370
    invoke-static {v5, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    if-eqz v5, :cond_3a

    .line 1374
    .line 1375
    iget-object v11, v11, Li2/c0;->h:Lfg/l;

    .line 1376
    .line 1377
    invoke-interface {v11, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v5

    .line 1381
    check-cast v5, Lt2/m;

    .line 1382
    .line 1383
    goto :goto_27

    .line 1384
    :cond_3a
    const/4 v5, 0x0

    .line 1385
    :goto_27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1386
    .line 1387
    .line 1388
    iget v5, v5, Lt2/m;->a:I

    .line 1389
    .line 1390
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v9

    .line 1394
    sget-object v11, Lu2/o;->b:[Lu2/p;

    .line 1395
    .line 1396
    sget-object v11, Li2/d0;->v:Li2/c0;

    .line 1397
    .line 1398
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    if-eqz v9, :cond_3b

    .line 1402
    .line 1403
    iget-object v11, v11, Li2/c0;->h:Lfg/l;

    .line 1404
    .line 1405
    invoke-interface {v11, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v9

    .line 1409
    check-cast v9, Lu2/o;

    .line 1410
    .line 1411
    goto :goto_28

    .line 1412
    :cond_3b
    const/4 v9, 0x0

    .line 1413
    :goto_28
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    iget-wide v11, v9, Lu2/o;->a:J

    .line 1417
    .line 1418
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v7

    .line 1422
    sget-object v9, Lt2/q;->c:Lt2/q;

    .line 1423
    .line 1424
    sget-object v9, Li2/d0;->l:Lp4/t;

    .line 1425
    .line 1426
    invoke-static {v7, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v13

    .line 1430
    if-eqz v13, :cond_3d

    .line 1431
    .line 1432
    :cond_3c
    const/16 v22, 0x0

    .line 1433
    .line 1434
    goto :goto_29

    .line 1435
    :cond_3d
    if-eqz v7, :cond_3c

    .line 1436
    .line 1437
    iget-object v9, v9, Lp4/t;->i:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v9, Lfg/l;

    .line 1440
    .line 1441
    invoke-interface {v9, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v7

    .line 1445
    check-cast v7, Lt2/q;

    .line 1446
    .line 1447
    move-object/from16 v22, v7

    .line 1448
    .line 1449
    :goto_29
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v6

    .line 1453
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1454
    .line 1455
    .line 1456
    move-result v7

    .line 1457
    sget-object v9, Li2/e0;->a:Lp4/t;

    .line 1458
    .line 1459
    if-eqz v7, :cond_3f

    .line 1460
    .line 1461
    :cond_3e
    const/16 v23, 0x0

    .line 1462
    .line 1463
    goto :goto_2a

    .line 1464
    :cond_3f
    if-eqz v6, :cond_3e

    .line 1465
    .line 1466
    iget-object v7, v9, Lp4/t;->i:Ljava/lang/Object;

    .line 1467
    .line 1468
    check-cast v7, Lfg/l;

    .line 1469
    .line 1470
    invoke-interface {v7, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v6

    .line 1474
    check-cast v6, Li2/w;

    .line 1475
    .line 1476
    move-object/from16 v23, v6

    .line 1477
    .line 1478
    :goto_2a
    const/4 v6, 0x5

    .line 1479
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v6

    .line 1483
    sget-object v7, Lt2/i;->d:Lt2/i;

    .line 1484
    .line 1485
    sget-object v7, Li2/d0;->A:Lp4/t;

    .line 1486
    .line 1487
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v9

    .line 1491
    if-eqz v9, :cond_41

    .line 1492
    .line 1493
    :cond_40
    const/16 v24, 0x0

    .line 1494
    .line 1495
    goto :goto_2b

    .line 1496
    :cond_41
    if-eqz v6, :cond_40

    .line 1497
    .line 1498
    iget-object v7, v7, Lp4/t;->i:Ljava/lang/Object;

    .line 1499
    .line 1500
    check-cast v7, Lfg/l;

    .line 1501
    .line 1502
    invoke-interface {v7, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v6

    .line 1506
    check-cast v6, Lt2/i;

    .line 1507
    .line 1508
    move-object/from16 v24, v6

    .line 1509
    .line 1510
    :goto_2b
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v6

    .line 1514
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1515
    .line 1516
    .line 1517
    move-result v7

    .line 1518
    sget-object v8, Li2/e0;->c:Lp4/t;

    .line 1519
    .line 1520
    if-eqz v7, :cond_43

    .line 1521
    .line 1522
    :cond_42
    const/4 v6, 0x0

    .line 1523
    goto :goto_2c

    .line 1524
    :cond_43
    if-eqz v6, :cond_42

    .line 1525
    .line 1526
    iget-object v7, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v7, Lfg/l;

    .line 1529
    .line 1530
    invoke-interface {v7, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v6

    .line 1534
    check-cast v6, Lt2/e;

    .line 1535
    .line 1536
    :goto_2c
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1537
    .line 1538
    .line 1539
    iget v6, v6, Lt2/e;->a:I

    .line 1540
    .line 1541
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v4

    .line 1545
    sget-object v7, Li2/d0;->s:Li2/c0;

    .line 1546
    .line 1547
    invoke-static {v4, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1548
    .line 1549
    .line 1550
    if-eqz v4, :cond_44

    .line 1551
    .line 1552
    iget-object v7, v7, Li2/c0;->h:Lfg/l;

    .line 1553
    .line 1554
    invoke-interface {v7, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v4

    .line 1558
    check-cast v4, Lt2/d;

    .line 1559
    .line 1560
    goto :goto_2d

    .line 1561
    :cond_44
    const/4 v4, 0x0

    .line 1562
    :goto_2d
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1563
    .line 1564
    .line 1565
    iget v4, v4, Lt2/d;->a:I

    .line 1566
    .line 1567
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    invoke-static {v0, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    move-result v3

    .line 1575
    sget-object v7, Li2/e0;->d:Lp4/t;

    .line 1576
    .line 1577
    if-eqz v3, :cond_46

    .line 1578
    .line 1579
    :cond_45
    move/from16 v18, v2

    .line 1580
    .line 1581
    move/from16 v26, v4

    .line 1582
    .line 1583
    move/from16 v19, v5

    .line 1584
    .line 1585
    move/from16 v25, v6

    .line 1586
    .line 1587
    move-wide/from16 v20, v11

    .line 1588
    .line 1589
    const/16 v27, 0x0

    .line 1590
    .line 1591
    goto :goto_2e

    .line 1592
    :cond_46
    if-eqz v0, :cond_45

    .line 1593
    .line 1594
    iget-object v3, v7, Lp4/t;->i:Ljava/lang/Object;

    .line 1595
    .line 1596
    check-cast v3, Lfg/l;

    .line 1597
    .line 1598
    invoke-interface {v3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    move-object v10, v0

    .line 1603
    check-cast v10, Lt2/s;

    .line 1604
    .line 1605
    move/from16 v18, v2

    .line 1606
    .line 1607
    move/from16 v26, v4

    .line 1608
    .line 1609
    move/from16 v19, v5

    .line 1610
    .line 1611
    move/from16 v25, v6

    .line 1612
    .line 1613
    move-object/from16 v27, v10

    .line 1614
    .line 1615
    move-wide/from16 v20, v11

    .line 1616
    .line 1617
    :goto_2e
    invoke-direct/range {v17 .. v27}, Li2/u;-><init>(IIJLt2/q;Li2/w;Lt2/i;IILt2/s;)V

    .line 1618
    .line 1619
    .line 1620
    return-object v17

    .line 1621
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

    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    :array_0
    .array-data 2
        0xas
        0xds
    .end array-data
.end method
