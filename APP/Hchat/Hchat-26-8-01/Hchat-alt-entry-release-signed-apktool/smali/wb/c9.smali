.class public final synthetic Lwb/c9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/c9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/c9;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/c9;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 19
    .line 20
    instance-of v1, v0, Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Landroid/app/Activity;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-nez v1, :cond_1

    .line 30
    .line 31
    const-string p1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object v0, Lwb/wq;->a:Lwb/wq;

    .line 43
    .line 44
    new-instance v2, Lwb/w6;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iget-object v4, p0, Lwb/c9;->i:Li0/a1;

    .line 48
    .line 49
    invoke-direct {v2, p1, p2, v4, v3}, Lwb/w6;-><init>(IILi0/a1;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, p2, v2}, Lwb/wq;->b(Landroid/app/Activity;ILfg/l;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iget-object v0, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 71
    .line 72
    instance-of v1, v0, Landroid/app/Activity;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    move-object v1, v0

    .line 77
    check-cast v1, Landroid/app/Activity;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/4 v1, 0x0

    .line 81
    :goto_2
    if-nez v1, :cond_3

    .line 82
    .line 83
    const-string p1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 84
    .line 85
    const/4 p2, 0x0

    .line 86
    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    sget-object v0, Lwb/wq;->a:Lwb/wq;

    .line 95
    .line 96
    new-instance v2, Lwb/w6;

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    iget-object v4, p0, Lwb/c9;->i:Li0/a1;

    .line 100
    .line 101
    invoke-direct {v2, p1, p2, v4, v3}, Lwb/w6;-><init>(IILi0/a1;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1, p2, v2}, Lwb/wq;->b(Landroid/app/Activity;ILfg/l;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 111
    .line 112
    check-cast p2, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    and-int/lit8 v0, p2, 0x3

    .line 119
    .line 120
    const/4 v1, 0x2

    .line 121
    const/4 v2, 0x1

    .line 122
    const/4 v3, 0x0

    .line 123
    if-eq v0, v1, :cond_4

    .line 124
    .line 125
    move v0, v2

    .line 126
    goto :goto_4

    .line 127
    :cond_4
    move v0, v3

    .line 128
    :goto_4
    and-int/2addr p2, v2

    .line 129
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_d

    .line 134
    .line 135
    iget-object p2, p0, Lwb/c9;->i:Li0/a1;

    .line 136
    .line 137
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 144
    .line 145
    invoke-static {v1, v0, v3}, Lwb/ho;->Q6(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    or-int/2addr v4, v5

    .line 158
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    sget-object v6, Li0/l;->a:Li0/e;

    .line 163
    .line 164
    if-nez v4, :cond_5

    .line 165
    .line 166
    if-ne v5, v6, :cond_6

    .line 167
    .line 168
    :cond_5
    new-instance v5, Lwb/dd;

    .line 169
    .line 170
    const/4 v4, 0x5

    .line 171
    invoke-direct {v5, v1, p2, v4}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    check-cast v5, Lfg/a;

    .line 178
    .line 179
    const-string v4, "\u9009\u62e9\u7cfb\u7edf\u94c3\u58f0"

    .line 180
    .line 181
    const/4 v7, 0x6

    .line 182
    invoke-static {v4, v0, v5, p1, v7}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 183
    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-static {v0, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    check-cast v4, Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_7

    .line 200
    .line 201
    const-string v4, "\u672a\u9009\u62e9"

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_7
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    check-cast v4, Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v1, v4, v2}, Lwb/ho;->Q6(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    :goto_5
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    or-int/2addr v5, v8

    .line 223
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    if-nez v5, :cond_8

    .line 228
    .line 229
    if-ne v8, v6, :cond_9

    .line 230
    .line 231
    :cond_8
    new-instance v8, Lwb/dd;

    .line 232
    .line 233
    const/4 v5, 0x6

    .line 234
    invoke-direct {v8, v1, p2, v5}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    check-cast v8, Lfg/a;

    .line 241
    .line 242
    const-string v5, "\u4ece\u6587\u4ef6\u9009\u62e9\u94c3\u58f0"

    .line 243
    .line 244
    invoke-static {v5, v4, v8, p1, v7}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    check-cast v4, Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-nez v4, :cond_c

    .line 258
    .line 259
    const v4, 0x4b65f3b5    # 1.5070133E7f

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v4}, Li0/h0;->a0(I)V

    .line 263
    .line 264
    .line 265
    invoke-static {v0, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    or-int/2addr v0, v2

    .line 277
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    if-nez v0, :cond_a

    .line 282
    .line 283
    if-ne v2, v6, :cond_b

    .line 284
    .line 285
    :cond_a
    new-instance v2, Lwb/dd;

    .line 286
    .line 287
    const/4 v0, 0x7

    .line 288
    invoke-direct {v2, v1, p2, v0}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_b
    check-cast v2, Lfg/a;

    .line 295
    .line 296
    const/16 p2, 0x36

    .line 297
    .line 298
    const-string v0, "\u6e05\u7a7a\u94c3\u58f0"

    .line 299
    .line 300
    const-string v1, "\u6062\u590d\u8ddf\u968f\u7cfb\u7edf"

    .line 301
    .line 302
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_c
    const p2, 0x4b6a074b    # 1.5337291E7f

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 320
    .line 321
    .line 322
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 323
    .line 324
    return-object p1

    .line 325
    :pswitch_2
    move-object v5, p1

    .line 326
    check-cast v5, Li0/h0;

    .line 327
    .line 328
    check-cast p2, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    and-int/lit8 p2, p1, 0x3

    .line 335
    .line 336
    const/4 v0, 0x2

    .line 337
    const/4 v1, 0x1

    .line 338
    if-eq p2, v0, :cond_e

    .line 339
    .line 340
    move p2, v1

    .line 341
    goto :goto_7

    .line 342
    :cond_e
    const/4 p2, 0x0

    .line 343
    :goto_7
    and-int/2addr p1, v1

    .line 344
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-eqz p1, :cond_11

    .line 349
    .line 350
    iget-object p1, p0, Lwb/c9;->i:Li0/a1;

    .line 351
    .line 352
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    check-cast p2, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    iget-object p2, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 363
    .line 364
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    if-nez v1, :cond_f

    .line 373
    .line 374
    sget-object v1, Li0/l;->a:Li0/e;

    .line 375
    .line 376
    if-ne v2, v1, :cond_10

    .line 377
    .line 378
    :cond_f
    new-instance v2, Lwb/q1;

    .line 379
    .line 380
    const/4 v1, 0x1

    .line 381
    invoke-direct {v2, p2, p1, v1}, Lwb/q1;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_10
    move-object v4, v2

    .line 388
    check-cast v4, Lfg/l;

    .line 389
    .line 390
    const/16 v6, 0x1b0

    .line 391
    .line 392
    const/16 v7, 0x8

    .line 393
    .line 394
    const-string v1, "\u60ac\u6d6e\u5feb\u6377\u83dc\u5355"

    .line 395
    .line 396
    const-string v2, "\u5728\u5fae\u4fe1\u9875\u9762\u663e\u793a\u53ef\u81ea\u7531\u62d6\u52a8\u548c\u505c\u653e\u7684\u5feb\u6377\u5165\u53e3"

    .line 397
    .line 398
    const/4 v3, 0x0

    .line 399
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 400
    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_11
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 404
    .line 405
    .line 406
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 407
    .line 408
    return-object p1

    .line 409
    :pswitch_3
    move-object v3, p1

    .line 410
    check-cast v3, Li0/h0;

    .line 411
    .line 412
    check-cast p2, Ljava/lang/Integer;

    .line 413
    .line 414
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    and-int/lit8 p2, p1, 0x3

    .line 419
    .line 420
    const/4 v0, 0x2

    .line 421
    const/4 v6, 0x0

    .line 422
    const/4 v7, 0x1

    .line 423
    if-eq p2, v0, :cond_12

    .line 424
    .line 425
    move p2, v7

    .line 426
    goto :goto_9

    .line 427
    :cond_12
    move p2, v6

    .line 428
    :goto_9
    and-int/2addr p1, v7

    .line 429
    invoke-virtual {v3, p1, p2}, Li0/h0;->S(IZ)Z

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    if-eqz p1, :cond_1b

    .line 434
    .line 435
    iget-object p1, p0, Lwb/c9;->i:Li0/a1;

    .line 436
    .line 437
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p2

    .line 441
    check-cast p2, Ljava/lang/Boolean;

    .line 442
    .line 443
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result p2

    .line 447
    if-eqz p2, :cond_13

    .line 448
    .line 449
    const-string p2, "\u5fae\u4fe1\u5df2\u5728\u767d\u540d\u5355"

    .line 450
    .line 451
    :goto_a
    move-object v1, p2

    .line 452
    goto :goto_b

    .line 453
    :cond_13
    const-string p2, "\u5fae\u4fe1\u53ef\u80fd\u4ecd\u53d7\u7cfb\u7edf\u7701\u7535\u5f71\u54cd"

    .line 454
    .line 455
    goto :goto_a

    .line 456
    :goto_b
    const/4 v4, 0x6

    .line 457
    const/4 v5, 0x4

    .line 458
    const-string v0, "\u7535\u6c60\u4f18\u5316\u767d\u540d\u5355"

    .line 459
    .line 460
    const/4 v2, 0x0

    .line 461
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 462
    .line 463
    .line 464
    const/4 p2, 0x0

    .line 465
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 466
    .line 467
    .line 468
    iget-object v0, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 469
    .line 470
    invoke-virtual {v3, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    sget-object v4, Li0/l;->a:Li0/e;

    .line 479
    .line 480
    if-nez v1, :cond_14

    .line 481
    .line 482
    if-ne v2, v4, :cond_15

    .line 483
    .line 484
    :cond_14
    new-instance v2, Lh9/c;

    .line 485
    .line 486
    const/16 v1, 0xc

    .line 487
    .line 488
    invoke-direct {v2, v0, v1}, Lh9/c;-><init>(Landroid/content/Context;I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    :cond_15
    check-cast v2, Lfg/a;

    .line 495
    .line 496
    const-string v1, "\u6253\u5f00\u7535\u6c60\u4f18\u5316\u8bbe\u7f6e"

    .line 497
    .line 498
    const-string v5, "\u5efa\u8bae\u628a\u5fae\u4fe1\u8bbe\u7f6e\u4e3a\u4e0d\u9650\u5236"

    .line 499
    .line 500
    const/16 v8, 0x36

    .line 501
    .line 502
    invoke-static {v1, v5, v2, v3, v8}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 503
    .line 504
    .line 505
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 506
    .line 507
    .line 508
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    check-cast v1, Ljava/lang/Boolean;

    .line 513
    .line 514
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-eqz v1, :cond_16

    .line 519
    .line 520
    const-string v1, "\u5f53\u524d\u5df2\u5ffd\u7565\u4f18\u5316"

    .line 521
    .line 522
    goto :goto_c

    .line 523
    :cond_16
    const-string v1, "\u5f53\u524d\u672a\u5ffd\u7565\u4f18\u5316"

    .line 524
    .line 525
    :goto_c
    invoke-virtual {v3, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    if-nez v2, :cond_17

    .line 534
    .line 535
    if-ne v5, v4, :cond_18

    .line 536
    .line 537
    :cond_17
    new-instance v5, Lwb/dd;

    .line 538
    .line 539
    const/4 v2, 0x2

    .line 540
    invoke-direct {v5, v0, p1, v2}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_18
    check-cast v5, Lfg/a;

    .line 547
    .line 548
    const/4 v2, 0x6

    .line 549
    const-string v9, "\u5237\u65b0\u72b6\u6001"

    .line 550
    .line 551
    invoke-static {v9, v1, v5, v3, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 552
    .line 553
    .line 554
    invoke-static {p2, v3, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v3, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result p2

    .line 561
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    if-nez p2, :cond_19

    .line 566
    .line 567
    if-ne v1, v4, :cond_1a

    .line 568
    .line 569
    :cond_19
    new-instance v1, Lwb/dd;

    .line 570
    .line 571
    const/4 p2, 0x3

    .line 572
    invoke-direct {v1, v0, p1, p2}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    :cond_1a
    check-cast v1, Lfg/a;

    .line 579
    .line 580
    const-string p1, "\u7acb\u5373\u5e94\u7528\u4fdd\u6d3b"

    .line 581
    .line 582
    const-string p2, "\u91cd\u65b0\u542f\u52a8\u670d\u52a1\u5e76\u5e94\u7528 WakeLock / Root \u767d\u540d\u5355"

    .line 583
    .line 584
    invoke-static {p1, p2, v1, v3, v8}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 585
    .line 586
    .line 587
    goto :goto_d

    .line 588
    :cond_1b
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 589
    .line 590
    .line 591
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 592
    .line 593
    return-object p1

    .line 594
    :pswitch_4
    move-object v4, p1

    .line 595
    check-cast v4, Li0/h0;

    .line 596
    .line 597
    check-cast p2, Ljava/lang/Integer;

    .line 598
    .line 599
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 600
    .line 601
    .line 602
    move-result p1

    .line 603
    and-int/lit8 p2, p1, 0x3

    .line 604
    .line 605
    const/4 v0, 0x2

    .line 606
    const/4 v6, 0x0

    .line 607
    const/4 v7, 0x1

    .line 608
    if-eq p2, v0, :cond_1c

    .line 609
    .line 610
    move p2, v7

    .line 611
    goto :goto_e

    .line 612
    :cond_1c
    move p2, v6

    .line 613
    :goto_e
    and-int/2addr p1, v7

    .line 614
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    if-eqz p1, :cond_1f

    .line 619
    .line 620
    iget-object p1, p0, Lwb/c9;->i:Li0/a1;

    .line 621
    .line 622
    invoke-static {p1}, Lwb/ho;->g2(Li0/a1;)I

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object p2

    .line 630
    sget-object v8, Li0/l;->a:Li0/e;

    .line 631
    .line 632
    if-ne p2, v8, :cond_1d

    .line 633
    .line 634
    new-instance p2, Lwb/ud;

    .line 635
    .line 636
    const/4 v0, 0x5

    .line 637
    invoke-direct {p2, p1, v0}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    :cond_1d
    move-object v3, p2

    .line 644
    check-cast v3, Lfg/a;

    .line 645
    .line 646
    const/16 v5, 0xc30

    .line 647
    .line 648
    iget-object v0, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 649
    .line 650
    sget-object v1, Lba/n;->o:Lba/n;

    .line 651
    .line 652
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 653
    .line 654
    .line 655
    const/4 p2, 0x0

    .line 656
    invoke-static {p2, v4, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 657
    .line 658
    .line 659
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object p2

    .line 663
    check-cast p2, Ljava/lang/Number;

    .line 664
    .line 665
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object p2

    .line 673
    if-ne p2, v8, :cond_1e

    .line 674
    .line 675
    new-instance p2, Lwb/ud;

    .line 676
    .line 677
    const/4 v1, 0x6

    .line 678
    invoke-direct {p2, p1, v1}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    :cond_1e
    move-object v3, p2

    .line 685
    check-cast v3, Lfg/a;

    .line 686
    .line 687
    const/16 v5, 0xc30

    .line 688
    .line 689
    sget-object v1, Lba/n;->p:Lba/n;

    .line 690
    .line 691
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 692
    .line 693
    .line 694
    goto :goto_f

    .line 695
    :cond_1f
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 696
    .line 697
    .line 698
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 699
    .line 700
    return-object p1

    .line 701
    :pswitch_5
    check-cast p1, Li0/h0;

    .line 702
    .line 703
    check-cast p2, Ljava/lang/Integer;

    .line 704
    .line 705
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 706
    .line 707
    .line 708
    move-result p2

    .line 709
    and-int/lit8 v0, p2, 0x3

    .line 710
    .line 711
    const/4 v1, 0x2

    .line 712
    const/4 v2, 0x1

    .line 713
    if-eq v0, v1, :cond_20

    .line 714
    .line 715
    move v0, v2

    .line 716
    goto :goto_10

    .line 717
    :cond_20
    const/4 v0, 0x0

    .line 718
    :goto_10
    and-int/2addr p2, v2

    .line 719
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 720
    .line 721
    .line 722
    move-result p2

    .line 723
    if-eqz p2, :cond_23

    .line 724
    .line 725
    iget-object p2, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 726
    .line 727
    invoke-virtual {p1, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    if-nez v0, :cond_21

    .line 736
    .line 737
    sget-object v0, Li0/l;->a:Li0/e;

    .line 738
    .line 739
    if-ne v1, v0, :cond_22

    .line 740
    .line 741
    :cond_21
    new-instance v1, Lwb/dd;

    .line 742
    .line 743
    const/4 v0, 0x4

    .line 744
    iget-object v2, p0, Lwb/c9;->i:Li0/a1;

    .line 745
    .line 746
    invoke-direct {v1, p2, v2, v0}, Lwb/dd;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    :cond_22
    check-cast v1, Lfg/a;

    .line 753
    .line 754
    const/16 p2, 0x36

    .line 755
    .line 756
    const-string v0, "\u6062\u590d\u9ed8\u8ba4"

    .line 757
    .line 758
    const-string v2, "\u6062\u590d\u521d\u59cb\u83dc\u5355\u540d\u79f0\u793a\u4f8b"

    .line 759
    .line 760
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 761
    .line 762
    .line 763
    goto :goto_11

    .line 764
    :cond_23
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 765
    .line 766
    .line 767
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 768
    .line 769
    return-object p1

    .line 770
    :pswitch_6
    move-object v4, p1

    .line 771
    check-cast v4, Li0/h0;

    .line 772
    .line 773
    check-cast p2, Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result p1

    .line 779
    and-int/lit8 p2, p1, 0x3

    .line 780
    .line 781
    const/4 v0, 0x2

    .line 782
    const/4 v6, 0x0

    .line 783
    const/4 v7, 0x1

    .line 784
    if-eq p2, v0, :cond_24

    .line 785
    .line 786
    move p2, v7

    .line 787
    goto :goto_12

    .line 788
    :cond_24
    move p2, v6

    .line 789
    :goto_12
    and-int/2addr p1, v7

    .line 790
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 791
    .line 792
    .line 793
    move-result p1

    .line 794
    if-eqz p1, :cond_27

    .line 795
    .line 796
    iget-object p1, p0, Lwb/c9;->i:Li0/a1;

    .line 797
    .line 798
    invoke-static {p1}, Lwb/ho;->g2(Li0/a1;)I

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object p2

    .line 806
    sget-object v8, Li0/l;->a:Li0/e;

    .line 807
    .line 808
    if-ne p2, v8, :cond_25

    .line 809
    .line 810
    new-instance p2, Lwb/ud;

    .line 811
    .line 812
    const/16 v0, 0x11

    .line 813
    .line 814
    invoke-direct {p2, p1, v0}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    :cond_25
    move-object v3, p2

    .line 821
    check-cast v3, Lfg/a;

    .line 822
    .line 823
    const/16 v5, 0xc30

    .line 824
    .line 825
    iget-object v0, p0, Lwb/c9;->h:Landroid/content/Context;

    .line 826
    .line 827
    sget-object v1, Lba/n;->m:Lba/n;

    .line 828
    .line 829
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 830
    .line 831
    .line 832
    const/4 p2, 0x0

    .line 833
    invoke-static {p2, v4, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 834
    .line 835
    .line 836
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object p2

    .line 840
    check-cast p2, Ljava/lang/Number;

    .line 841
    .line 842
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object p2

    .line 850
    if-ne p2, v8, :cond_26

    .line 851
    .line 852
    new-instance p2, Lwb/ud;

    .line 853
    .line 854
    const/16 v1, 0x12

    .line 855
    .line 856
    invoke-direct {p2, p1, v1}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    :cond_26
    move-object v3, p2

    .line 863
    check-cast v3, Lfg/a;

    .line 864
    .line 865
    const/16 v5, 0xc30

    .line 866
    .line 867
    sget-object v1, Lba/n;->n:Lba/n;

    .line 868
    .line 869
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 870
    .line 871
    .line 872
    goto :goto_13

    .line 873
    :cond_27
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 874
    .line 875
    .line 876
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 877
    .line 878
    return-object p1

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
