.class public final synthetic Lwb/pb;
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
    iput p1, p0, Lwb/pb;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/pb;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_3
    check-cast p1, Lwb/to;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of p1, p1, Lwb/so;

    .line 44
    .line 45
    xor-int/2addr p1, v5

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :pswitch_4
    check-cast p1, Lsf/e;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "\u5468"

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_5
    check-cast p1, Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, Landroid/webkit/WebView;

    .line 79
    .line 80
    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, v5}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v5}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_6
    check-cast p1, Laa/h;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v0, p1, Laa/h;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    iget-object v0, p1, Laa/h;->a:Ljava/lang/String;

    .line 122
    .line 123
    :cond_0
    return-object v0

    .line 124
    :pswitch_7
    check-cast p1, Lx8/s;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget p1, p1, Lx8/s;->b:I

    .line 130
    .line 131
    invoke-static {p1}, Lwb/ho;->R4(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    xor-int/2addr p1, v5

    .line 146
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :pswitch_9
    check-cast p1, Ldb/a;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object p1, p1, Ldb/a;->b:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_a
    check-cast p1, Lwb/eu;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lwb/cu;->c:Lwb/cu;

    .line 173
    .line 174
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_1

    .line 179
    .line 180
    move v3, v4

    .line 181
    goto :goto_0

    .line 182
    :cond_1
    sget-object v0, Lwb/cu;->b:Lwb/cu;

    .line 183
    .line 184
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_2

    .line 189
    .line 190
    move v3, v5

    .line 191
    goto :goto_0

    .line 192
    :cond_2
    sget-object v0, Lwb/cu;->a:Lwb/cu;

    .line 193
    .line 194
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_4

    .line 199
    .line 200
    instance-of p1, p1, Lwb/du;

    .line 201
    .line 202
    if-eqz p1, :cond_3

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    invoke-static {}, Lokio/a;->k()V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    :goto_1
    return-object v2

    .line 214
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    return-object v1

    .line 220
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 226
    .line 227
    return-object v1

    .line 228
    :pswitch_d
    check-cast p1, Lwb/q4;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    sget-object v0, Lwb/p4;->b:Lwb/p4;

    .line 234
    .line 235
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_5

    .line 240
    .line 241
    move v3, v4

    .line 242
    goto :goto_3

    .line 243
    :cond_5
    sget-object v0, Lwb/p4;->a:Lwb/p4;

    .line 244
    .line 245
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_8

    .line 250
    .line 251
    sget-object v0, Lwb/p4;->c:Lwb/p4;

    .line 252
    .line 253
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_8

    .line 258
    .line 259
    instance-of v0, p1, Lwb/n4;

    .line 260
    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_6
    instance-of p1, p1, Lwb/o4;

    .line 265
    .line 266
    if-eqz p1, :cond_7

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_7
    invoke-static {}, Lokio/a;->k()V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_8
    :goto_2
    move v3, v5

    .line 274
    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    :goto_4
    return-object v2

    .line 279
    :pswitch_e
    check-cast p1, Lwb/vv;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    instance-of p1, p1, Lwb/uv;

    .line 285
    .line 286
    xor-int/2addr p1, v5

    .line 287
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    return-object p1

    .line 292
    :pswitch_f
    check-cast p1, Lwb/b6;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    sget-object v0, Lwb/z5;->b:Lwb/z5;

    .line 298
    .line 299
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_9

    .line 304
    .line 305
    move v3, v4

    .line 306
    goto :goto_6

    .line 307
    :cond_9
    sget-object v0, Lwb/z5;->c:Lwb/z5;

    .line 308
    .line 309
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_c

    .line 314
    .line 315
    instance-of v0, p1, Lwb/x5;

    .line 316
    .line 317
    if-nez v0, :cond_c

    .line 318
    .line 319
    sget-object v0, Lwb/z5;->a:Lwb/z5;

    .line 320
    .line 321
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_a

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_a
    instance-of v0, p1, Lwb/a6;

    .line 329
    .line 330
    if-nez v0, :cond_d

    .line 331
    .line 332
    instance-of v0, p1, Lwb/v5;

    .line 333
    .line 334
    if-nez v0, :cond_d

    .line 335
    .line 336
    instance-of v0, p1, Lwb/u5;

    .line 337
    .line 338
    if-nez v0, :cond_d

    .line 339
    .line 340
    instance-of v0, p1, Lwb/w5;

    .line 341
    .line 342
    if-nez v0, :cond_d

    .line 343
    .line 344
    instance-of p1, p1, Lwb/y5;

    .line 345
    .line 346
    if-eqz p1, :cond_b

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_b
    invoke-static {}, Lokio/a;->k()V

    .line 350
    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_c
    :goto_5
    move v3, v5

    .line 354
    :cond_d
    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    :goto_7
    return-object v2

    .line 359
    :pswitch_10
    check-cast p1, Laa/h;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-object v0, p1, Laa/h;->b:Ljava/lang/String;

    .line 365
    .line 366
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_e

    .line 371
    .line 372
    iget-object v0, p1, Laa/h;->a:Ljava/lang/String;

    .line 373
    .line 374
    :cond_e
    return-object v0

    .line 375
    :pswitch_11
    check-cast p1, Lwb/tq;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    sget-object v0, Lwb/pq;->b:Lwb/pq;

    .line 381
    .line 382
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    move v3, v4

    .line 389
    goto :goto_9

    .line 390
    :cond_f
    sget-object v0, Lwb/pq;->d:Lwb/pq;

    .line 391
    .line 392
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_12

    .line 397
    .line 398
    sget-object v0, Lwb/pq;->a:Lwb/pq;

    .line 399
    .line 400
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_12

    .line 405
    .line 406
    sget-object v0, Lwb/pq;->c:Lwb/pq;

    .line 407
    .line 408
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-nez v0, :cond_12

    .line 413
    .line 414
    instance-of v0, p1, Lwb/oq;

    .line 415
    .line 416
    if-nez v0, :cond_12

    .line 417
    .line 418
    instance-of v0, p1, Lwb/qq;

    .line 419
    .line 420
    if-eqz v0, :cond_10

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_10
    instance-of v0, p1, Lwb/sq;

    .line 424
    .line 425
    if-nez v0, :cond_13

    .line 426
    .line 427
    instance-of v0, p1, Lwb/nq;

    .line 428
    .line 429
    if-nez v0, :cond_13

    .line 430
    .line 431
    instance-of p1, p1, Lwb/rq;

    .line 432
    .line 433
    if-eqz p1, :cond_11

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :cond_11
    invoke-static {}, Lokio/a;->k()V

    .line 437
    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_12
    :goto_8
    move v3, v5

    .line 441
    :cond_13
    :goto_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    :goto_a
    return-object v2

    .line 446
    :pswitch_12
    check-cast p1, Lwb/b4;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    sget-object v0, Lwb/w3;->c:Lwb/w3;

    .line 452
    .line 453
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-eqz v0, :cond_14

    .line 458
    .line 459
    move v3, v4

    .line 460
    goto :goto_c

    .line 461
    :cond_14
    sget-object v0, Lwb/w3;->b:Lwb/w3;

    .line 462
    .line 463
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-nez v0, :cond_17

    .line 468
    .line 469
    sget-object v0, Lwb/w3;->d:Lwb/w3;

    .line 470
    .line 471
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-nez v0, :cond_17

    .line 476
    .line 477
    sget-object v0, Lwb/w3;->a:Lwb/w3;

    .line 478
    .line 479
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-nez v0, :cond_17

    .line 484
    .line 485
    instance-of v0, p1, Lwb/x3;

    .line 486
    .line 487
    if-nez v0, :cond_17

    .line 488
    .line 489
    instance-of v0, p1, Lwb/y3;

    .line 490
    .line 491
    if-eqz v0, :cond_15

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_15
    instance-of v0, p1, Lwb/a4;

    .line 495
    .line 496
    if-nez v0, :cond_18

    .line 497
    .line 498
    instance-of p1, p1, Lwb/z3;

    .line 499
    .line 500
    if-eqz p1, :cond_16

    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_16
    invoke-static {}, Lokio/a;->k()V

    .line 504
    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_17
    :goto_b
    move v3, v5

    .line 508
    :cond_18
    :goto_c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    :goto_d
    return-object v2

    .line 513
    :pswitch_13
    check-cast p1, Lwb/l4;

    .line 514
    .line 515
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    sget-object v0, Lwb/h4;->c:Lwb/h4;

    .line 519
    .line 520
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_19

    .line 525
    .line 526
    move v3, v4

    .line 527
    goto :goto_f

    .line 528
    :cond_19
    sget-object v0, Lwb/h4;->b:Lwb/h4;

    .line 529
    .line 530
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    if-nez v0, :cond_1c

    .line 535
    .line 536
    sget-object v0, Lwb/h4;->d:Lwb/h4;

    .line 537
    .line 538
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-nez v0, :cond_1c

    .line 543
    .line 544
    sget-object v0, Lwb/h4;->a:Lwb/h4;

    .line 545
    .line 546
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_1c

    .line 551
    .line 552
    instance-of v0, p1, Lwb/i4;

    .line 553
    .line 554
    if-eqz v0, :cond_1a

    .line 555
    .line 556
    goto :goto_e

    .line 557
    :cond_1a
    instance-of v0, p1, Lwb/j4;

    .line 558
    .line 559
    if-nez v0, :cond_1d

    .line 560
    .line 561
    instance-of p1, p1, Lwb/k4;

    .line 562
    .line 563
    if-eqz p1, :cond_1b

    .line 564
    .line 565
    goto :goto_f

    .line 566
    :cond_1b
    invoke-static {}, Lokio/a;->k()V

    .line 567
    .line 568
    .line 569
    goto :goto_10

    .line 570
    :cond_1c
    :goto_e
    move v3, v5

    .line 571
    :cond_1d
    :goto_f
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    :goto_10
    return-object v2

    .line 576
    :pswitch_14
    check-cast p1, Lwb/r3;

    .line 577
    .line 578
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    sget-object v0, Lwb/r3;->g:Lwb/r3;

    .line 582
    .line 583
    if-ne p1, v0, :cond_1e

    .line 584
    .line 585
    goto :goto_11

    .line 586
    :cond_1e
    move v4, v5

    .line 587
    :goto_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    return-object p1

    .line 592
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    sparse-switch v0, :sswitch_data_0

    .line 602
    .line 603
    .line 604
    goto :goto_12

    .line 605
    :sswitch_0
    const-string v0, "greetAcceptedLabels"

    .line 606
    .line 607
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    if-nez p1, :cond_20

    .line 612
    .line 613
    goto :goto_12

    .line 614
    :sswitch_1
    const-string v0, "greetAccepted"

    .line 615
    .line 616
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    if-nez p1, :cond_1f

    .line 621
    .line 622
    goto :goto_12

    .line 623
    :sswitch_2
    const-string v0, "steps"

    .line 624
    .line 625
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result p1

    .line 629
    if-nez p1, :cond_20

    .line 630
    .line 631
    goto :goto_12

    .line 632
    :sswitch_3
    const-string v0, "rules"

    .line 633
    .line 634
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result p1

    .line 638
    if-nez p1, :cond_1f

    .line 639
    .line 640
    goto :goto_12

    .line 641
    :sswitch_4
    const-string v0, "main"

    .line 642
    .line 643
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    goto :goto_12

    .line 647
    :sswitch_5
    const-string v0, "ai"

    .line 648
    .line 649
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result p1

    .line 653
    if-nez p1, :cond_1f

    .line 654
    .line 655
    goto :goto_12

    .line 656
    :sswitch_6
    const-string v0, "autoAccept"

    .line 657
    .line 658
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result p1

    .line 662
    if-nez p1, :cond_1f

    .line 663
    .line 664
    goto :goto_12

    .line 665
    :cond_1f
    move v3, v5

    .line 666
    goto :goto_13

    .line 667
    :sswitch_7
    const-string v0, "autoAcceptLabels"

    .line 668
    .line 669
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result p1

    .line 673
    if-nez p1, :cond_20

    .line 674
    .line 675
    goto :goto_12

    .line 676
    :sswitch_8
    const-string v0, "ruleEditor"

    .line 677
    .line 678
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result p1

    .line 682
    if-nez p1, :cond_20

    .line 683
    .line 684
    :goto_12
    move v3, v4

    .line 685
    :cond_20
    :goto_13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    return-object p1

    .line 690
    :pswitch_16
    check-cast p1, Lwb/v3;

    .line 691
    .line 692
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    sget-object v0, Lwb/u3;->a:Lwb/u3;

    .line 696
    .line 697
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_21

    .line 702
    .line 703
    move v3, v4

    .line 704
    goto :goto_14

    .line 705
    :cond_21
    instance-of v0, p1, Lwb/s3;

    .line 706
    .line 707
    if-eqz v0, :cond_22

    .line 708
    .line 709
    move v3, v5

    .line 710
    goto :goto_14

    .line 711
    :cond_22
    instance-of p1, p1, Lwb/t3;

    .line 712
    .line 713
    if-eqz p1, :cond_23

    .line 714
    .line 715
    :goto_14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    goto :goto_15

    .line 720
    :cond_23
    invoke-static {}, Lokio/a;->k()V

    .line 721
    .line 722
    .line 723
    :goto_15
    return-object v2

    .line 724
    :pswitch_17
    check-cast p1, Lna/h;

    .line 725
    .line 726
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    iget p1, p1, Lna/h;->b:I

    .line 730
    .line 731
    if-ne p1, v3, :cond_24

    .line 732
    .line 733
    goto :goto_16

    .line 734
    :cond_24
    move v5, p1

    .line 735
    :goto_16
    packed-switch v5, :pswitch_data_1

    .line 736
    .line 737
    .line 738
    :pswitch_18
    const-string p1, "\u5173\u95ed"

    .line 739
    .line 740
    goto :goto_17

    .line 741
    :pswitch_19
    const-string p1, "\u6536\u85cf"

    .line 742
    .line 743
    goto :goto_17

    .line 744
    :pswitch_1a
    const-string p1, "XML"

    .line 745
    .line 746
    goto :goto_17

    .line 747
    :pswitch_1b
    const-string p1, "\u6587\u4ef6"

    .line 748
    .line 749
    goto :goto_17

    .line 750
    :pswitch_1c
    const-string p1, "\u8868\u60c5"

    .line 751
    .line 752
    goto :goto_17

    .line 753
    :pswitch_1d
    const-string p1, "\u89c6\u9891"

    .line 754
    .line 755
    goto :goto_17

    .line 756
    :pswitch_1e
    const-string p1, "\u8bed\u97f3"

    .line 757
    .line 758
    goto :goto_17

    .line 759
    :pswitch_1f
    const-string p1, "\u56fe\u7247"

    .line 760
    .line 761
    goto :goto_17

    .line 762
    :pswitch_20
    const-string p1, "\u6587\u5b57"

    .line 763
    .line 764
    :goto_17
    return-object p1

    .line 765
    :pswitch_21
    check-cast p1, Lwb/j2;

    .line 766
    .line 767
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    sget-object v0, Lwb/j2;->g:Lwb/j2;

    .line 771
    .line 772
    if-ne p1, v0, :cond_25

    .line 773
    .line 774
    goto :goto_18

    .line 775
    :cond_25
    move v4, v5

    .line 776
    :goto_18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object p1

    .line 780
    return-object p1

    .line 781
    :pswitch_22
    check-cast p1, Lwb/q5;

    .line 782
    .line 783
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    sget-object v0, Lwb/p5;->a:Lwb/p5;

    .line 787
    .line 788
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    if-eqz v0, :cond_26

    .line 793
    .line 794
    goto :goto_19

    .line 795
    :cond_26
    instance-of v0, p1, Lwb/o5;

    .line 796
    .line 797
    if-eqz v0, :cond_28

    .line 798
    .line 799
    check-cast p1, Lwb/o5;

    .line 800
    .line 801
    iget-object p1, p1, Lwb/o5;->b:Lwb/t5;

    .line 802
    .line 803
    if-nez p1, :cond_27

    .line 804
    .line 805
    goto :goto_19

    .line 806
    :cond_27
    move v4, v5

    .line 807
    :goto_19
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    goto :goto_1a

    .line 812
    :cond_28
    invoke-static {}, Lokio/a;->k()V

    .line 813
    .line 814
    .line 815
    :goto_1a
    return-object v2

    .line 816
    :pswitch_23
    check-cast p1, Lwb/a0;

    .line 817
    .line 818
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    sget-object v0, Lwb/w;->d:Lwb/w;

    .line 822
    .line 823
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-eqz v0, :cond_29

    .line 828
    .line 829
    move v3, v4

    .line 830
    goto :goto_1c

    .line 831
    :cond_29
    sget-object v0, Lwb/w;->e:Lwb/w;

    .line 832
    .line 833
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-nez v0, :cond_2c

    .line 838
    .line 839
    sget-object v0, Lwb/w;->b:Lwb/w;

    .line 840
    .line 841
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-nez v0, :cond_2c

    .line 846
    .line 847
    sget-object v0, Lwb/w;->a:Lwb/w;

    .line 848
    .line 849
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    if-nez v0, :cond_2c

    .line 854
    .line 855
    sget-object v0, Lwb/w;->c:Lwb/w;

    .line 856
    .line 857
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v0

    .line 861
    if-nez v0, :cond_2c

    .line 862
    .line 863
    instance-of v0, p1, Lwb/y;

    .line 864
    .line 865
    if-eqz v0, :cond_2a

    .line 866
    .line 867
    goto :goto_1b

    .line 868
    :cond_2a
    instance-of v0, p1, Lwb/z;

    .line 869
    .line 870
    if-nez v0, :cond_2d

    .line 871
    .line 872
    instance-of p1, p1, Lwb/x;

    .line 873
    .line 874
    if-eqz p1, :cond_2b

    .line 875
    .line 876
    goto :goto_1c

    .line 877
    :cond_2b
    invoke-static {}, Lokio/a;->k()V

    .line 878
    .line 879
    .line 880
    goto :goto_1d

    .line 881
    :cond_2c
    :goto_1b
    move v3, v5

    .line 882
    :cond_2d
    :goto_1c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    :goto_1d
    return-object v2

    .line 887
    :pswitch_24
    check-cast p1, Lwb/e6;

    .line 888
    .line 889
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    iget-object p1, p1, Lwb/e6;->b:Ljava/lang/String;

    .line 893
    .line 894
    return-object p1

    .line 895
    :pswitch_25
    check-cast p1, Lwb/wo;

    .line 896
    .line 897
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 898
    .line 899
    .line 900
    instance-of p1, p1, Lwb/vo;

    .line 901
    .line 902
    xor-int/2addr p1, v5

    .line 903
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 904
    .line 905
    .line 906
    move-result-object p1

    .line 907
    return-object p1

    .line 908
    nop

    .line 909
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
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

    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    :sswitch_data_0
    .sparse-switch
        -0x46bf8877 -> :sswitch_8
        -0x4125c18a -> :sswitch_7
        -0x367cc069 -> :sswitch_6
        0xc28 -> :sswitch_5
        0x3305b9 -> :sswitch_4
        0x67d48f7 -> :sswitch_3
        0x68ad327 -> :sswitch_2
        0x35f2b9d0 -> :sswitch_1
        0x5b8969ef -> :sswitch_0
    .end sparse-switch

    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_20
        :pswitch_18
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch
.end method
