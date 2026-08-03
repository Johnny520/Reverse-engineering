.class public final synthetic Lwb/ad;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/ad;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ad;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ad;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ad;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/ad;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ln1/a;

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    check-cast v0, Ln1/c;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ln1/c;->a(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lwb/ad;->h:Li0/a1;

    .line 27
    .line 28
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lfg/l;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lwb/ad;->j:Li0/a1;

    .line 40
    .line 41
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lfg/a;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Float;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iget-object v1, p0, Lwb/ad;->h:Li0/a1;

    .line 64
    .line 65
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Landroid/media/MediaPlayer;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v2, p0, Lwb/ad;->i:Li0/a1;

    .line 74
    .line 75
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    int-to-float v2, v2

    .line 86
    const/4 v3, 0x0

    .line 87
    const/high16 v4, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-static {p1, v3, v4}, Lr9/e0;->q(FFF)F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    mul-float/2addr p1, v2

    .line 94
    float-to-int p1, p1

    .line 95
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    :catchall_0
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_1
    check-cast p1, Le1/b;

    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, p0, Lwb/ad;->h:Li0/a1;

    .line 116
    .line 117
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 123
    .line 124
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 128
    .line 129
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lfg/l;

    .line 134
    .line 135
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 139
    .line 140
    return-object p1

    .line 141
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    const/4 v0, 0x1

    .line 148
    if-ne p1, v0, :cond_3

    .line 149
    .line 150
    iget-object v1, p0, Lwb/ad;->h:Li0/a1;

    .line 151
    .line 152
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/util/Set;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iget-object v1, p0, Lwb/ad;->i:Li0/a1;

    .line 160
    .line 161
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Ljava/util/Set;

    .line 166
    .line 167
    :goto_1
    new-instance v2, Lwb/lo;

    .line 168
    .line 169
    new-instance v3, Lwb/v0;

    .line 170
    .line 171
    if-ne p1, v0, :cond_4

    .line 172
    .line 173
    const-string v0, "\u9009\u62e9\u8bc4\u8bba\u9ed1\u540d\u5355"

    .line 174
    .line 175
    :goto_2
    move-object v4, v0

    .line 176
    goto :goto_3

    .line 177
    :cond_4
    const-string v0, "\u9009\u62e9\u8bc4\u8bba\u767d\u540d\u5355"

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :goto_3
    check-cast v1, Ljava/lang/Iterable;

    .line 181
    .line 182
    invoke-static {v1}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    new-instance v8, Lwb/jk;

    .line 187
    .line 188
    const/16 v0, 0x1a

    .line 189
    .line 190
    invoke-direct {v8, v0}, Lwb/jk;-><init>(I)V

    .line 191
    .line 192
    .line 193
    const/4 v9, 0x1

    .line 194
    const/16 v10, 0xc0

    .line 195
    .line 196
    sget-object v5, Lwb/u0;->g:Lwb/u0;

    .line 197
    .line 198
    const/4 v6, 0x1

    .line 199
    invoke-direct/range {v3 .. v10}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 200
    .line 201
    .line 202
    invoke-direct {v2, p1, v3}, Lwb/lo;-><init>(ILwb/v0;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lwb/ad;->j:Li0/a1;

    .line 206
    .line 207
    invoke-interface {p1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_0

    .line 211
    :pswitch_3
    check-cast p1, Lr/h;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object v0, Lwb/p0;->B:Ls0/d;

    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    const/4 v2, 0x3

    .line 220
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lwb/p7;

    .line 224
    .line 225
    const/16 v3, 0xa

    .line 226
    .line 227
    iget-object v4, p0, Lwb/ad;->h:Li0/a1;

    .line 228
    .line 229
    iget-object v5, p0, Lwb/ad;->i:Li0/a1;

    .line 230
    .line 231
    iget-object v6, p0, Lwb/ad;->j:Li0/a1;

    .line 232
    .line 233
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/p7;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 234
    .line 235
    .line 236
    new-instance v3, Ls0/d;

    .line 237
    .line 238
    const v4, -0x38e4061c

    .line 239
    .line 240
    .line 241
    const/4 v5, 0x1

    .line 242
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 243
    .line 244
    .line 245
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 246
    .line 247
    .line 248
    goto :goto_0

    .line 249
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    const/4 v0, 0x1

    .line 256
    if-ne p1, v0, :cond_5

    .line 257
    .line 258
    iget-object v1, p0, Lwb/ad;->h:Li0/a1;

    .line 259
    .line 260
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Ljava/util/Set;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_5
    iget-object v1, p0, Lwb/ad;->i:Li0/a1;

    .line 268
    .line 269
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Ljava/util/Set;

    .line 274
    .line 275
    :goto_4
    new-instance v2, Lwb/ro;

    .line 276
    .line 277
    new-instance v3, Lwb/v0;

    .line 278
    .line 279
    if-ne p1, v0, :cond_6

    .line 280
    .line 281
    const-string v0, "\u9009\u62e9\u70b9\u8d5e\u9ed1\u540d\u5355"

    .line 282
    .line 283
    :goto_5
    move-object v4, v0

    .line 284
    goto :goto_6

    .line 285
    :cond_6
    const-string v0, "\u9009\u62e9\u70b9\u8d5e\u767d\u540d\u5355"

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :goto_6
    check-cast v1, Ljava/lang/Iterable;

    .line 289
    .line 290
    invoke-static {v1}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    new-instance v8, Lwb/jk;

    .line 295
    .line 296
    const/16 v0, 0x12

    .line 297
    .line 298
    invoke-direct {v8, v0}, Lwb/jk;-><init>(I)V

    .line 299
    .line 300
    .line 301
    const/4 v9, 0x1

    .line 302
    const/16 v10, 0xc0

    .line 303
    .line 304
    sget-object v5, Lwb/u0;->g:Lwb/u0;

    .line 305
    .line 306
    const/4 v6, 0x1

    .line 307
    invoke-direct/range {v3 .. v10}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 308
    .line 309
    .line 310
    invoke-direct {v2, p1, v3}, Lwb/ro;-><init>(ILwb/v0;)V

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, Lwb/ad;->j:Li0/a1;

    .line 314
    .line 315
    invoke-interface {p1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :pswitch_5
    check-cast p1, Lx8/b;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iget-object v0, p1, Lx8/b;->a:Ljava/lang/String;

    .line 326
    .line 327
    iget-object v1, p0, Lwb/ad;->h:Li0/a1;

    .line 328
    .line 329
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 333
    .line 334
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    const-string p1, "ruleEditor"

    .line 338
    .line 339
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 340
    .line 341
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :pswitch_6
    check-cast p1, Ldb/c;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v0, p1, Ldb/c;->a:Ljava/lang/String;

    .line 352
    .line 353
    iget-object v1, p0, Lwb/ad;->h:Li0/a1;

    .line 354
    .line 355
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 359
    .line 360
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    sget-object p1, Lwb/xq;->b:Lwb/xq;

    .line 364
    .line 365
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 366
    .line 367
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result p1

    .line 378
    if-eqz p1, :cond_7

    .line 379
    .line 380
    iget-object v0, p0, Lwb/ad;->h:Li0/a1;

    .line 381
    .line 382
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, Ljava/util/Set;

    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_7
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 390
    .line 391
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Ljava/util/Set;

    .line 396
    .line 397
    :goto_7
    new-instance v1, Lwb/n4;

    .line 398
    .line 399
    new-instance v2, Lwb/v0;

    .line 400
    .line 401
    if-eqz p1, :cond_8

    .line 402
    .line 403
    const-string v3, "\u9009\u62e9\u4ec5\u751f\u6548\u804a\u5929"

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_8
    const-string v3, "\u9009\u62e9\u6392\u9664\u804a\u5929"

    .line 407
    .line 408
    :goto_8
    move-object v4, v0

    .line 409
    check-cast v4, Ljava/lang/Iterable;

    .line 410
    .line 411
    const/4 v8, 0x0

    .line 412
    const/16 v9, 0x3e

    .line 413
    .line 414
    const-string v5, ","

    .line 415
    .line 416
    const/4 v6, 0x0

    .line 417
    const/4 v7, 0x0

    .line 418
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    new-instance v7, Lwb/jk;

    .line 423
    .line 424
    const/16 v0, 0x14

    .line 425
    .line 426
    invoke-direct {v7, v0}, Lwb/jk;-><init>(I)V

    .line 427
    .line 428
    .line 429
    const/4 v8, 0x1

    .line 430
    const/16 v9, 0xc0

    .line 431
    .line 432
    sget-object v4, Lwb/u0;->i:Lwb/u0;

    .line 433
    .line 434
    const/4 v5, 0x1

    .line 435
    invoke-direct/range {v2 .. v9}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v1, v2, p1}, Lwb/n4;-><init>(Lwb/v0;Z)V

    .line 439
    .line 440
    .line 441
    iget-object p1, p0, Lwb/ad;->j:Li0/a1;

    .line 442
    .line 443
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :pswitch_8
    check-cast p1, Lwb/k5;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lwb/ad;->h:Li0/a1;

    .line 454
    .line 455
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    sget-object v0, Lwb/k5;->l:Lwb/k5;

    .line 459
    .line 460
    if-ne p1, v0, :cond_9

    .line 461
    .line 462
    const/4 p1, 0x0

    .line 463
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 464
    .line 465
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :cond_9
    const-string p1, ""

    .line 469
    .line 470
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 471
    .line 472
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    iget-object v0, p0, Lwb/ad;->h:Li0/a1;

    .line 483
    .line 484
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Ljava/lang/Number;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    const/4 v1, 0x1

    .line 495
    if-ne v0, v1, :cond_a

    .line 496
    .line 497
    iget-object v0, p0, Lwb/ad;->i:Li0/a1;

    .line 498
    .line 499
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_a
    iget-object v0, p0, Lwb/ad;->j:Li0/a1;

    .line 504
    .line 505
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 509
    .line 510
    return-object p1

    .line 511
    :pswitch_a
    check-cast p1, Lr/h;

    .line 512
    .line 513
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    sget-object v0, Lwb/p0;->d1:Ls0/d;

    .line 517
    .line 518
    const/4 v1, 0x0

    .line 519
    const/4 v2, 0x3

    .line 520
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 521
    .line 522
    .line 523
    new-instance v0, Lwb/p7;

    .line 524
    .line 525
    const/16 v3, 0x8

    .line 526
    .line 527
    iget-object v4, p0, Lwb/ad;->h:Li0/a1;

    .line 528
    .line 529
    iget-object v5, p0, Lwb/ad;->i:Li0/a1;

    .line 530
    .line 531
    iget-object v6, p0, Lwb/ad;->j:Li0/a1;

    .line 532
    .line 533
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/p7;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 534
    .line 535
    .line 536
    new-instance v3, Ls0/d;

    .line 537
    .line 538
    const v4, 0x481c69ac

    .line 539
    .line 540
    .line 541
    const/4 v5, 0x1

    .line 542
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 543
    .line 544
    .line 545
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_0

    .line 549
    .line 550
    nop

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
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
