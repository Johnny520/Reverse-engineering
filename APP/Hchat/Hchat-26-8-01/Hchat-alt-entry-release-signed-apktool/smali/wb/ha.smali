.class public final synthetic Lwb/ha;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/ha;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 9
    iput p3, p0, Lwb/ha;->g:I

    iput-object p1, p0, Lwb/ha;->h:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/ha;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    iget-object p2, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Li0/l;->a:Li0/e;

    .line 43
    .line 44
    if-ne v1, v0, :cond_2

    .line 45
    .line 46
    :cond_1
    new-instance v1, Lh9/c;

    .line 47
    .line 48
    const/16 v0, 0xd

    .line 49
    .line 50
    invoke-direct {v1, p2, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    check-cast v1, Lfg/a;

    .line 57
    .line 58
    const/16 p2, 0x36

    .line 59
    .line 60
    const-string v0, "\u7acb\u5373\u6e05\u7a7a\u4e0a\u4e0b\u6587"

    .line 61
    .line 62
    const-string v2, "\u6e05\u9664\u5f53\u524d\u8fd0\u884c\u4e2d\u7684 AI \u5bf9\u8bdd\u8bb0\u5fc6"

    .line 63
    .line 64
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 75
    .line 76
    check-cast p2, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    and-int/lit8 v0, p2, 0x3

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    const/4 v2, 0x1

    .line 86
    if-eq v0, v1, :cond_4

    .line 87
    .line 88
    move v0, v2

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    const/4 v0, 0x0

    .line 91
    :goto_2
    and-int/2addr p2, v2

    .line 92
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_7

    .line 97
    .line 98
    iget-object p2, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    sget-object v0, Li0/l;->a:Li0/e;

    .line 111
    .line 112
    if-ne v1, v0, :cond_6

    .line 113
    .line 114
    :cond_5
    new-instance v1, Lh9/c;

    .line 115
    .line 116
    const/16 v0, 0xe

    .line 117
    .line 118
    invoke-direct {v1, p2, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    check-cast v1, Lfg/a;

    .line 125
    .line 126
    const/16 p2, 0x36

    .line 127
    .line 128
    const-string v0, "\u7acb\u5373\u6e05\u7a7a\u4e0a\u4e0b\u6587"

    .line 129
    .line 130
    const-string v2, "\u6e05\u9664\u5f53\u524d\u8fd0\u884c\u4e2d\u7684\u5c0f\u667a\u5bf9\u8bdd\u8bb0\u5fc6"

    .line 131
    .line 132
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 137
    .line 138
    .line 139
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 140
    .line 141
    return-object p1

    .line 142
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 143
    .line 144
    check-cast p2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    const/4 p2, 0x1

    .line 150
    invoke-static {p2}, Li0/r;->C(I)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iget-object v0, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 155
    .line 156
    invoke-static {v0, p1, p2}, Lwb/ho;->U3(Landroid/content/Context;Li0/h0;I)V

    .line 157
    .line 158
    .line 159
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 160
    .line 161
    return-object p1

    .line 162
    :pswitch_2
    move-object v3, p1

    .line 163
    check-cast v3, Li0/h0;

    .line 164
    .line 165
    check-cast p2, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    and-int/lit8 p2, p1, 0x3

    .line 172
    .line 173
    const/4 v0, 0x2

    .line 174
    const/4 v6, 0x0

    .line 175
    const/4 v7, 0x1

    .line 176
    if-eq p2, v0, :cond_8

    .line 177
    .line 178
    move p2, v7

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move p2, v6

    .line 181
    :goto_5
    and-int/2addr p1, v7

    .line 182
    invoke-virtual {v3, p1, p2}, Li0/h0;->S(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_19

    .line 187
    .line 188
    iget-object p1, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 189
    .line 190
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    sget-object v8, Li0/l;->a:Li0/e;

    .line 199
    .line 200
    if-nez p2, :cond_9

    .line 201
    .line 202
    if-ne v0, v8, :cond_a

    .line 203
    .line 204
    :cond_9
    new-instance v0, Lh9/c;

    .line 205
    .line 206
    const/4 p2, 0x2

    .line 207
    invoke-direct {v0, p1, p2}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_a
    move-object v2, v0

    .line 214
    check-cast v2, Lfg/a;

    .line 215
    .line 216
    const/16 v4, 0x36

    .line 217
    .line 218
    const/4 v5, 0x0

    .line 219
    const-string v0, "KavaRef"

    .line 220
    .line 221
    const-string v1, "HighCapable"

    .line 222
    .line 223
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 224
    .line 225
    .line 226
    const/4 p2, 0x0

    .line 227
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-nez v0, :cond_b

    .line 239
    .line 240
    if-ne v1, v8, :cond_c

    .line 241
    .line 242
    :cond_b
    new-instance v1, Lh9/c;

    .line 243
    .line 244
    const/4 v0, 0x3

    .line 245
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :cond_c
    move-object v2, v1

    .line 252
    check-cast v2, Lfg/a;

    .line 253
    .line 254
    const/16 v4, 0x36

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    const-string v0, "DexKit"

    .line 258
    .line 259
    const-string v1, "LuckyPray"

    .line 260
    .line 261
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 262
    .line 263
    .line 264
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-nez v0, :cond_d

    .line 276
    .line 277
    if-ne v1, v8, :cond_e

    .line 278
    .line 279
    :cond_d
    new-instance v1, Lh9/c;

    .line 280
    .line 281
    const/4 v0, 0x4

    .line 282
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_e
    move-object v2, v1

    .line 289
    check-cast v2, Lfg/a;

    .line 290
    .line 291
    const/16 v4, 0x36

    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    const-string v0, "FastKV"

    .line 295
    .line 296
    const-string v1, "BillyWei01"

    .line 297
    .line 298
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 299
    .line 300
    .line 301
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-nez v0, :cond_f

    .line 313
    .line 314
    if-ne v1, v8, :cond_10

    .line 315
    .line 316
    :cond_f
    new-instance v1, Lh9/c;

    .line 317
    .line 318
    const/4 v0, 0x5

    .line 319
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_10
    move-object v2, v1

    .line 326
    check-cast v2, Lfg/a;

    .line 327
    .line 328
    const/16 v4, 0x36

    .line 329
    .line 330
    const/4 v5, 0x0

    .line 331
    const-string v0, "WeChat Pad"

    .line 332
    .line 333
    const-string v1, "lovejiuwu"

    .line 334
    .line 335
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 336
    .line 337
    .line 338
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-nez v0, :cond_11

    .line 350
    .line 351
    if-ne v1, v8, :cond_12

    .line 352
    .line 353
    :cond_11
    new-instance v1, Lh9/c;

    .line 354
    .line 355
    const/4 v0, 0x6

    .line 356
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_12
    move-object v2, v1

    .line 363
    check-cast v2, Lfg/a;

    .line 364
    .line 365
    const/16 v4, 0x36

    .line 366
    .line 367
    const/4 v5, 0x0

    .line 368
    const-string v0, "LSPosed"

    .line 369
    .line 370
    const-string v1, "LSPosed"

    .line 371
    .line 372
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 373
    .line 374
    .line 375
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    if-nez v0, :cond_13

    .line 387
    .line 388
    if-ne v1, v8, :cond_14

    .line 389
    .line 390
    :cond_13
    new-instance v1, Lh9/c;

    .line 391
    .line 392
    const/4 v0, 0x7

    .line 393
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_14
    move-object v2, v1

    .line 400
    check-cast v2, Lfg/a;

    .line 401
    .line 402
    const/16 v4, 0x36

    .line 403
    .line 404
    const/4 v5, 0x0

    .line 405
    const-string v0, "Miuix"

    .line 406
    .line 407
    const-string v1, "YuKongA"

    .line 408
    .line 409
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 410
    .line 411
    .line 412
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-nez v0, :cond_15

    .line 424
    .line 425
    if-ne v1, v8, :cond_16

    .line 426
    .line 427
    :cond_15
    new-instance v1, Lh9/c;

    .line 428
    .line 429
    const/16 v0, 0x8

    .line 430
    .line 431
    invoke-direct {v1, p1, v0}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_16
    move-object v2, v1

    .line 438
    check-cast v2, Lfg/a;

    .line 439
    .line 440
    const/16 v4, 0x36

    .line 441
    .line 442
    const/4 v5, 0x0

    .line 443
    const-string v0, "BeanShell-Android"

    .line 444
    .line 445
    const-string v1, "CopyLibs"

    .line 446
    .line 447
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 448
    .line 449
    .line 450
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result p2

    .line 457
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-nez p2, :cond_17

    .line 462
    .line 463
    if-ne v0, v8, :cond_18

    .line 464
    .line 465
    :cond_17
    new-instance v0, Lh9/c;

    .line 466
    .line 467
    const/16 p2, 0x9

    .line 468
    .line 469
    invoke-direct {v0, p1, p2}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :cond_18
    move-object v2, v0

    .line 476
    check-cast v2, Lfg/a;

    .line 477
    .line 478
    const/16 v4, 0x36

    .line 479
    .line 480
    const/4 v5, 0x0

    .line 481
    const-string v0, "Silk Codec"

    .line 482
    .line 483
    const-string v1, "YunJavaPro"

    .line 484
    .line 485
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 486
    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_19
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 490
    .line 491
    .line 492
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 493
    .line 494
    return-object p1

    .line 495
    :pswitch_3
    check-cast p1, Li0/h0;

    .line 496
    .line 497
    check-cast p2, Ljava/lang/Integer;

    .line 498
    .line 499
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    const/4 p2, 0x1

    .line 503
    invoke-static {p2}, Li0/r;->C(I)I

    .line 504
    .line 505
    .line 506
    move-result p2

    .line 507
    iget-object v0, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 508
    .line 509
    invoke-static {v0, p1, p2}, Lwb/ho;->k1(Landroid/content/Context;Li0/h0;I)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_4

    .line 513
    .line 514
    :pswitch_4
    move-object v3, p1

    .line 515
    check-cast v3, Li0/h0;

    .line 516
    .line 517
    check-cast p2, Ljava/lang/Integer;

    .line 518
    .line 519
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    and-int/lit8 p2, p1, 0x3

    .line 524
    .line 525
    const/4 v0, 0x2

    .line 526
    const/4 v6, 0x0

    .line 527
    const/4 v7, 0x1

    .line 528
    if-eq p2, v0, :cond_1a

    .line 529
    .line 530
    move p2, v7

    .line 531
    goto :goto_7

    .line 532
    :cond_1a
    move p2, v6

    .line 533
    :goto_7
    and-int/2addr p1, v7

    .line 534
    invoke-virtual {v3, p1, p2}, Li0/h0;->S(IZ)Z

    .line 535
    .line 536
    .line 537
    move-result p1

    .line 538
    if-eqz p1, :cond_1f

    .line 539
    .line 540
    iget-object p1, p0, Lwb/ha;->h:Landroid/content/Context;

    .line 541
    .line 542
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result p2

    .line 546
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    sget-object v8, Li0/l;->a:Li0/e;

    .line 551
    .line 552
    if-nez p2, :cond_1b

    .line 553
    .line 554
    if-ne v0, v8, :cond_1c

    .line 555
    .line 556
    :cond_1b
    new-instance v0, Lh9/c;

    .line 557
    .line 558
    const/16 p2, 0xa

    .line 559
    .line 560
    invoke-direct {v0, p1, p2}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    :cond_1c
    move-object v2, v0

    .line 567
    check-cast v2, Lfg/a;

    .line 568
    .line 569
    const/16 v4, 0x36

    .line 570
    .line 571
    const/4 v5, 0x0

    .line 572
    const-string v0, "Telegram Channel"

    .line 573
    .line 574
    const-string v1, "Hchat_ci"

    .line 575
    .line 576
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 577
    .line 578
    .line 579
    const/4 p2, 0x0

    .line 580
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result p2

    .line 587
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    if-nez p2, :cond_1d

    .line 592
    .line 593
    if-ne v0, v8, :cond_1e

    .line 594
    .line 595
    :cond_1d
    new-instance v0, Lh9/c;

    .line 596
    .line 597
    const/16 p2, 0xb

    .line 598
    .line 599
    invoke-direct {v0, p1, p2}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_1e
    move-object v2, v0

    .line 606
    check-cast v2, Lfg/a;

    .line 607
    .line 608
    const/16 v4, 0x36

    .line 609
    .line 610
    const/4 v5, 0x0

    .line 611
    const-string v0, "Telegram Group"

    .line 612
    .line 613
    const-string v1, "Hchat_Group"

    .line 614
    .line 615
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 616
    .line 617
    .line 618
    goto :goto_8

    .line 619
    :cond_1f
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 620
    .line 621
    .line 622
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 623
    .line 624
    return-object p1

    .line 625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
