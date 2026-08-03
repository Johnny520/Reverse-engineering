.class public final synthetic Lb4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lb4/b;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le8/b;)V
    .locals 0

    .line 1
    const/16 p1, 0x1d

    .line 2
    .line 3
    iput p1, p0, Lb4/b;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lb4/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Le8/b;->l(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, Ldb/a;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, v1, p1}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_2
    check-cast p1, Ldb/a;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, Ldb/a;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_3
    check-cast p1, Ldb/a;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget p1, p1, Ldb/a;->a:I

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    if-ne p1, v0, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const/4 v0, 0x0

    .line 81
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    const-wide/16 v2, 0x0

    .line 93
    .line 94
    cmp-long p1, v0, v2

    .line 95
    .line 96
    if-lez p1, :cond_2

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/4 p1, 0x0

    .line 101
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :pswitch_5
    check-cast p1, Log/f;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast p1, Log/i;

    .line 112
    .line 113
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Log/g;

    .line 118
    .line 119
    const/4 v1, 0x1

    .line 120
    invoke-virtual {v0, v1}, Log/g;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ljava/lang/String;

    .line 125
    .line 126
    :try_start_0
    const-string v2, "x"

    .line 127
    .line 128
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/16 v1, 0x10

    .line 139
    .line 140
    invoke-static {v1}, La/a;->w(I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    goto :goto_3

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto :goto_4

    .line 150
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    goto :goto_5

    .line 159
    :goto_4
    new-instance v1, Lsf/f;

    .line 160
    .line 161
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    move-object v0, v1

    .line 165
    :goto_5
    nop

    .line 166
    instance-of v1, v0, Lsf/f;

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    :cond_4
    check-cast v0, Ljava/lang/Integer;

    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v0, Ljava/lang/String;

    .line 187
    .line 188
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_5
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_6
    return-object v0

    .line 197
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-lez p1, :cond_6

    .line 207
    .line 208
    const/4 p1, 0x1

    .line 209
    goto :goto_7

    .line 210
    :cond_6
    const/4 p1, 0x0

    .line 211
    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Field;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    const-class v0, Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    const-class v1, Landroid/view/MenuItem;

    .line 256
    .line 257
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const-string v1, "onMMMenuItemSelected"

    .line 262
    .line 263
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    return-object p1

    .line 268
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Field;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    return-object p1

    .line 286
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    const-string v1, "notify"

    .line 297
    .line 298
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_9

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    array-length p1, v0

    .line 308
    if-nez p1, :cond_7

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_7
    array-length p1, v0

    .line 312
    if-eqz p1, :cond_8

    .line 313
    .line 314
    array-length p1, v0

    .line 315
    const/4 v1, 0x1

    .line 316
    sub-int/2addr p1, v1

    .line 317
    aget-object p1, v0, p1

    .line 318
    .line 319
    const-class v0, Landroid/app/Notification;

    .line 320
    .line 321
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_9

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_8
    const-string p1, "Array is empty."

    .line 329
    .line 330
    invoke-static {p1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const/4 p1, 0x0

    .line 334
    goto :goto_a

    .line 335
    :cond_9
    :goto_8
    const/4 v1, 0x0

    .line 336
    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    :goto_a
    return-object p1

    .line 341
    :pswitch_c
    check-cast p1, Lca/a0;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object p1, p1, Lca/a0;->c:Ljava/util/List;

    .line 347
    .line 348
    new-instance v0, Ldg/n;

    .line 349
    .line 350
    const/4 v1, 0x6

    .line 351
    invoke-direct {v0, p1, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 352
    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_d
    check-cast p1, Lwb/jv;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 361
    .line 362
    return-object p1

    .line 363
    :pswitch_e
    check-cast p1, Lwb/jv;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget-boolean p1, p1, Lwb/jv;->c:Z

    .line 369
    .line 370
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    return-object p1

    .line 375
    :pswitch_f
    check-cast p1, Lhb/t;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    iget p1, p1, Lhb/t;->b:I

    .line 381
    .line 382
    if-gtz p1, :cond_a

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_a
    and-int/lit16 v0, p1, 0xff

    .line 386
    .line 387
    const v1, 0xffff

    .line 388
    .line 389
    .line 390
    and-int/2addr v1, p1

    .line 391
    ushr-int/lit8 v2, p1, 0x10

    .line 392
    .line 393
    if-nez v2, :cond_b

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_b
    const/16 v2, 0x2710

    .line 397
    .line 398
    if-eq v1, v2, :cond_c

    .line 399
    .line 400
    const/16 v2, 0x2712

    .line 401
    .line 402
    if-eq v1, v2, :cond_c

    .line 403
    .line 404
    if-eqz v0, :cond_d

    .line 405
    .line 406
    if-ne v1, v0, :cond_d

    .line 407
    .line 408
    move p1, v0

    .line 409
    goto :goto_b

    .line 410
    :cond_c
    move p1, v1

    .line 411
    :cond_d
    :goto_b
    const/4 v0, 0x3

    .line 412
    if-ne p1, v0, :cond_e

    .line 413
    .line 414
    const/4 p1, 0x1

    .line 415
    goto :goto_c

    .line 416
    :cond_e
    const/4 p1, 0x0

    .line 417
    :goto_c
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    return-object p1

    .line 422
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 428
    .line 429
    .line 430
    move-result p1

    .line 431
    xor-int/lit8 p1, p1, 0x1

    .line 432
    .line 433
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    return-object p1

    .line 438
    :pswitch_11
    check-cast p1, Lhb/t;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iget-object v0, p1, Lhb/t;->g:Lk8/t;

    .line 444
    .line 445
    if-eqz v0, :cond_f

    .line 446
    .line 447
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 448
    .line 449
    goto :goto_d

    .line 450
    :cond_f
    const/4 v0, 0x0

    .line 451
    :goto_d
    if-nez v0, :cond_10

    .line 452
    .line 453
    const-string v0, ""

    .line 454
    .line 455
    :cond_10
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_11

    .line 460
    .line 461
    iget-object v0, p1, Lhb/t;->d:Ljava/lang/String;

    .line 462
    .line 463
    :cond_11
    return-object v0

    .line 464
    :pswitch_12
    check-cast p1, Lhb/t;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    iget p1, p1, Lhb/t;->b:I

    .line 470
    .line 471
    if-gtz p1, :cond_12

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_12
    and-int/lit16 v0, p1, 0xff

    .line 475
    .line 476
    const v1, 0xffff

    .line 477
    .line 478
    .line 479
    and-int/2addr v1, p1

    .line 480
    ushr-int/lit8 v2, p1, 0x10

    .line 481
    .line 482
    if-nez v2, :cond_13

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_13
    const/16 v2, 0x2710

    .line 486
    .line 487
    if-eq v1, v2, :cond_14

    .line 488
    .line 489
    const/16 v2, 0x2712

    .line 490
    .line 491
    if-eq v1, v2, :cond_14

    .line 492
    .line 493
    if-eqz v0, :cond_15

    .line 494
    .line 495
    if-ne v1, v0, :cond_15

    .line 496
    .line 497
    move p1, v0

    .line 498
    goto :goto_e

    .line 499
    :cond_14
    move p1, v1

    .line 500
    :cond_15
    :goto_e
    const/4 v0, 0x1

    .line 501
    if-ne p1, v0, :cond_16

    .line 502
    .line 503
    goto :goto_f

    .line 504
    :cond_16
    const/4 v0, 0x0

    .line 505
    :goto_f
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    return-object p1

    .line 510
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 511
    .line 512
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    return-object p1

    .line 517
    :pswitch_14
    check-cast p1, Ljava/lang/reflect/Method;

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-nez v0, :cond_17

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    array-length v0, v0

    .line 540
    if-nez v0, :cond_17

    .line 541
    .line 542
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    move-result-object p1

    .line 546
    const-class v0, Ljava/lang/String;

    .line 547
    .line 548
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result p1

    .line 552
    if-eqz p1, :cond_17

    .line 553
    .line 554
    const/4 p1, 0x1

    .line 555
    goto :goto_10

    .line 556
    :cond_17
    const/4 p1, 0x0

    .line 557
    :goto_10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 558
    .line 559
    .line 560
    move-result-object p1

    .line 561
    return-object p1

    .line 562
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 563
    .line 564
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    const/4 v1, 0x0

    .line 572
    if-lez v0, :cond_18

    .line 573
    .line 574
    const-string v0, "wxid_hchat_group_"

    .line 575
    .line 576
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 577
    .line 578
    .line 579
    move-result p1

    .line 580
    if-nez p1, :cond_18

    .line 581
    .line 582
    const/4 v1, 0x1

    .line 583
    :cond_18
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    return-object p1

    .line 588
    :pswitch_16
    check-cast p1, Lc9/a;

    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget-object p1, p1, Lc9/a;->a:Ljava/lang/String;

    .line 594
    .line 595
    return-object p1

    .line 596
    :pswitch_17
    check-cast p1, Ljava/lang/reflect/Field;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 602
    .line 603
    .line 604
    move-result p1

    .line 605
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 606
    .line 607
    .line 608
    move-result p1

    .line 609
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    return-object p1

    .line 614
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/Field;

    .line 615
    .line 616
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    const-class v1, Ljava/lang/String;

    .line 624
    .line 625
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_19

    .line 630
    .line 631
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 636
    .line 637
    .line 638
    move-result p1

    .line 639
    if-nez p1, :cond_19

    .line 640
    .line 641
    const/4 p1, 0x1

    .line 642
    goto :goto_11

    .line 643
    :cond_19
    const/4 p1, 0x0

    .line 644
    :goto_11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    return-object p1

    .line 649
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-static {p1}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    return-object p1

    .line 666
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    move-result-object p1

    .line 673
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 674
    .line 675
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    const-class v1, Landroid/view/MenuItem;

    .line 679
    .line 680
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    const-string v1, "onMMMenuItemSelected"

    .line 685
    .line 686
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    return-object p1

    .line 691
    :pswitch_1b
    check-cast p1, Ljava/util/List;

    .line 692
    .line 693
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    invoke-static {p1}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object p1

    .line 700
    check-cast p1, Lwb/jv;

    .line 701
    .line 702
    if-eqz p1, :cond_1a

    .line 703
    .line 704
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    if-eqz v0, :cond_1a

    .line 709
    .line 710
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 711
    .line 712
    invoke-virtual {v0, p1}, Lh8/a;->h(Ljava/lang/String;)Z

    .line 713
    .line 714
    .line 715
    :cond_1a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 716
    .line 717
    return-object p1

    .line 718
    :pswitch_1c
    check-cast p1, Lb4/d;

    .line 719
    .line 720
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    return-object p1

    .line 724
    nop

    .line 725
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
