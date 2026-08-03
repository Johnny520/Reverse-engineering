.class public final synthetic Lp8/p;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lp8/p;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lp8/p;->n:I

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
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lxa/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lxa/n;->b(Ljava/lang/reflect/Method;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lxa/n;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lxa/n;->b(Ljava/lang/reflect/Method;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lxa/n;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lxa/n;->b(Ljava/lang/reflect/Method;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lxa/n;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lxa/n;->c(Ljava/lang/reflect/Method;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_3
    check-cast p1, Lq1/b;

    .line 91
    .line 92
    iget-object p1, p1, Lq1/b;->a:Landroid/view/KeyEvent;

    .line 93
    .line 94
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lw/b1;

    .line 97
    .line 98
    iget-object v1, v0, Lw/b1;->f:Lh0/j1;

    .line 99
    .line 100
    iget-boolean v2, v0, Lw/b1;->d:Z

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/4 v4, 0x1

    .line 107
    const/4 v5, 0x0

    .line 108
    if-nez v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-static {v3}, Ljava/lang/Character;->isISOControl(I)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_4

    .line 119
    .line 120
    iget-object v3, v0, Lw/b1;->i:Lw/f0;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    const/high16 v7, -0x80000000

    .line 130
    .line 131
    and-int/2addr v7, v6

    .line 132
    if-eqz v7, :cond_0

    .line 133
    .line 134
    const v7, 0x7fffffff

    .line 135
    .line 136
    .line 137
    and-int/2addr v6, v7

    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iput-object v6, v3, Lw/f0;->a:Ljava/lang/Integer;

    .line 143
    .line 144
    move-object v3, v5

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    iget-object v7, v3, Lw/f0;->a:Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v7, :cond_3

    .line 149
    .line 150
    iput-object v5, v3, Lw/f0;->a:Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-static {v3, v6}, Landroid/view/KeyCharacterMap;->getDeadChar(II)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-nez v3, :cond_1

    .line 165
    .line 166
    move-object v7, v5

    .line 167
    :cond_1
    if-eqz v7, :cond_2

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    goto :goto_0

    .line 178
    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    :goto_0
    if-eqz v3, :cond_4

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v6, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    new-instance v6, Ln2/a;

    .line 202
    .line 203
    invoke-direct {v6, v3, v4}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_4
    move-object v6, v5

    .line 208
    :goto_1
    const/4 v3, 0x0

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    if-eqz v2, :cond_5

    .line 212
    .line 213
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {v0, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    iput-object v5, v1, Lh0/j1;->a:Ljava/lang/Float;

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_5
    :goto_2
    move v4, v3

    .line 224
    goto :goto_3

    .line 225
    :cond_6
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    const/4 v6, 0x2

    .line 230
    if-ne v5, v6, :cond_5

    .line 231
    .line 232
    iget-object v5, v0, Lw/b1;->j:Lw/n0;

    .line 233
    .line 234
    invoke-virtual {v5, p1}, Lw/n0;->a(Landroid/view/KeyEvent;)Lw/m0;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    iget-boolean v5, p1, Lw/m0;->g:Z

    .line 241
    .line 242
    if-eqz v5, :cond_7

    .line 243
    .line 244
    if-nez v2, :cond_7

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_7
    new-instance v2, Lgg/q;

    .line 248
    .line 249
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-boolean v4, v2, Lgg/q;->g:Z

    .line 253
    .line 254
    new-instance v3, Lb0/s;

    .line 255
    .line 256
    const/16 v5, 0x18

    .line 257
    .line 258
    invoke-direct {v3, p1, v0, v2, v5}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 259
    .line 260
    .line 261
    new-instance p1, Lh0/s0;

    .line 262
    .line 263
    iget-object v5, v0, Lw/b1;->c:Ln2/s;

    .line 264
    .line 265
    iget-object v6, v0, Lw/b1;->g:Lb5/k;

    .line 266
    .line 267
    iget-object v7, v0, Lw/b1;->a:Lw/q0;

    .line 268
    .line 269
    invoke-virtual {v7}, Lw/q0;->d()Lw/m1;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-direct {p1, v5, v6, v7, v1}, Lh0/s0;-><init>(Ln2/s;Lb5/k;Lw/m1;Lh0/j1;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, p1}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    iget-wide v6, p1, Lh0/s0;->f:J

    .line 280
    .line 281
    iget-wide v8, v5, Ln2/s;->b:J

    .line 282
    .line 283
    invoke-static {v6, v7, v8, v9}, Li2/m0;->b(JJ)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_8

    .line 288
    .line 289
    iget-object v1, p1, Lh0/s0;->g:Li2/g;

    .line 290
    .line 291
    iget-object v3, v5, Ln2/s;->a:Li2/g;

    .line 292
    .line 293
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-nez v1, :cond_9

    .line 298
    .line 299
    :cond_8
    iget-object v1, v0, Lw/b1;->k:Lfg/l;

    .line 300
    .line 301
    iget-wide v6, p1, Lh0/s0;->f:J

    .line 302
    .line 303
    const/4 v3, 0x4

    .line 304
    iget-object p1, p1, Lh0/s0;->g:Li2/g;

    .line 305
    .line 306
    invoke-static {v5, p1, v6, v7, v3}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_9
    iget-object p1, v0, Lw/b1;->h:Lw/q1;

    .line 314
    .line 315
    if-eqz p1, :cond_a

    .line 316
    .line 317
    iput-boolean v4, p1, Lw/q1;->e:Z

    .line 318
    .line 319
    :cond_a
    iget-boolean v4, v2, Lgg/q;->g:Z

    .line 320
    .line 321
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    return-object p1

    .line 326
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 327
    .line 328
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Lqg/u0;

    .line 331
    .line 332
    invoke-virtual {v0, p1}, Lqg/u0;->l(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 336
    .line 337
    return-object p1

    .line 338
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lp8/d0;

    .line 346
    .line 347
    invoke-virtual {v0, p1}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 351
    .line 352
    return-object p1

    .line 353
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lp8/d0;

    .line 361
    .line 362
    invoke-virtual {v0, p1}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 366
    .line 367
    return-object p1

    .line 368
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lp8/d0;

    .line 376
    .line 377
    invoke-virtual {v0, p1}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Lp8/t;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    const/4 v2, 0x0

    .line 408
    if-eqz v1, :cond_b

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const-class v3, Ljava/lang/String;

    .line 415
    .line 416
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    if-eqz v1, :cond_b

    .line 421
    .line 422
    const-string v1, "com.tencent.mm.plugin.sns.model."

    .line 423
    .line 424
    invoke-static {p1, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 425
    .line 426
    .line 427
    move-result p1

    .line 428
    if-eqz p1, :cond_b

    .line 429
    .line 430
    array-length p1, v0

    .line 431
    const/4 v1, 0x1

    .line 432
    if-ne p1, v1, :cond_b

    .line 433
    .line 434
    aget-object p1, v0, v2

    .line 435
    .line 436
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-nez p1, :cond_b

    .line 441
    .line 442
    move v2, v1

    .line 443
    :cond_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    return-object p1

    .line 448
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lp8/t;

    .line 456
    .line 457
    invoke-static {v0, p1}, Lp8/t;->b(Lp8/t;Ljava/lang/reflect/Method;)Z

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    return-object p1

    .line 466
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lp8/t;

    .line 474
    .line 475
    invoke-static {v0, p1}, Lp8/t;->b(Lp8/t;Ljava/lang/reflect/Method;)Z

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    return-object p1

    .line 484
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, Lp8/t;

    .line 492
    .line 493
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    const/4 v2, 0x0

    .line 509
    if-nez v1, :cond_c

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 516
    .line 517
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-eqz v1, :cond_c

    .line 522
    .line 523
    const-string v1, "com.tencent.mm.plugin.sns.model."

    .line 524
    .line 525
    invoke-static {p1, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 526
    .line 527
    .line 528
    move-result p1

    .line 529
    if-eqz p1, :cond_c

    .line 530
    .line 531
    array-length p1, v0

    .line 532
    const/4 v1, 0x7

    .line 533
    if-ne p1, v1, :cond_c

    .line 534
    .line 535
    aget-object p1, v0, v2

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 538
    .line 539
    .line 540
    move-result p1

    .line 541
    if-nez p1, :cond_c

    .line 542
    .line 543
    const/4 p1, 0x1

    .line 544
    aget-object v1, v0, p1

    .line 545
    .line 546
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 547
    .line 548
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-eqz v1, :cond_c

    .line 553
    .line 554
    const/4 v1, 0x2

    .line 555
    aget-object v1, v0, v1

    .line 556
    .line 557
    const-class v5, Ljava/lang/String;

    .line 558
    .line 559
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    if-eqz v1, :cond_c

    .line 564
    .line 565
    const/4 v1, 0x3

    .line 566
    aget-object v1, v0, v1

    .line 567
    .line 568
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_c

    .line 573
    .line 574
    const/4 v1, 0x4

    .line 575
    aget-object v1, v0, v1

    .line 576
    .line 577
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    if-eqz v1, :cond_c

    .line 582
    .line 583
    const/4 v1, 0x5

    .line 584
    aget-object v1, v0, v1

    .line 585
    .line 586
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    if-eqz v1, :cond_c

    .line 591
    .line 592
    const/4 v1, 0x6

    .line 593
    aget-object v0, v0, v1

    .line 594
    .line 595
    invoke-static {v0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_c

    .line 600
    .line 601
    move v2, p1

    .line 602
    :cond_c
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    return-object p1

    .line 607
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Method;

    .line 608
    .line 609
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v0, Lp8/t;

    .line 615
    .line 616
    invoke-static {v0, p1}, Lp8/t;->a(Lp8/t;Ljava/lang/reflect/Method;)Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    return-object p1

    .line 625
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Method;

    .line 626
    .line 627
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Lp8/t;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    const/4 v2, 0x0

    .line 650
    if-nez v1, :cond_d

    .line 651
    .line 652
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 657
    .line 658
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    if-eqz v1, :cond_d

    .line 663
    .line 664
    const-string v1, "com.tencent.mm.plugin.sns.model."

    .line 665
    .line 666
    invoke-static {p1, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 667
    .line 668
    .line 669
    move-result p1

    .line 670
    if-eqz p1, :cond_d

    .line 671
    .line 672
    array-length p1, v0

    .line 673
    const/4 v1, 0x4

    .line 674
    if-ne p1, v1, :cond_d

    .line 675
    .line 676
    aget-object p1, v0, v2

    .line 677
    .line 678
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 679
    .line 680
    .line 681
    move-result p1

    .line 682
    if-nez p1, :cond_d

    .line 683
    .line 684
    const/4 p1, 0x1

    .line 685
    aget-object v1, v0, p1

    .line 686
    .line 687
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 688
    .line 689
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-eqz v1, :cond_d

    .line 694
    .line 695
    const/4 v1, 0x2

    .line 696
    aget-object v1, v0, v1

    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    if-nez v1, :cond_d

    .line 703
    .line 704
    const/4 v1, 0x3

    .line 705
    aget-object v0, v0, v1

    .line 706
    .line 707
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-nez v0, :cond_d

    .line 712
    .line 713
    move v2, p1

    .line 714
    :cond_d
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    return-object p1

    .line 719
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Method;

    .line 720
    .line 721
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v0, Lp8/t;

    .line 727
    .line 728
    invoke-static {v0, p1}, Lp8/t;->a(Lp8/t;Ljava/lang/reflect/Method;)Z

    .line 729
    .line 730
    .line 731
    move-result p1

    .line 732
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    return-object p1

    .line 737
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Method;

    .line 738
    .line 739
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v0, Lp8/q;

    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-static {p1}, Lp8/q;->a(Ljava/lang/reflect/Method;)Z

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    const/4 v2, 0x0

    .line 758
    if-eqz v1, :cond_e

    .line 759
    .line 760
    const-string v1, "com.tencent.mm.plugin.sns.model."

    .line 761
    .line 762
    invoke-static {p1, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 763
    .line 764
    .line 765
    move-result p1

    .line 766
    if-eqz p1, :cond_e

    .line 767
    .line 768
    array-length p1, v0

    .line 769
    const/4 v1, 0x1

    .line 770
    if-ne p1, v1, :cond_e

    .line 771
    .line 772
    aget-object p1, v0, v2

    .line 773
    .line 774
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 775
    .line 776
    .line 777
    move-result p1

    .line 778
    if-nez p1, :cond_e

    .line 779
    .line 780
    aget-object p1, v0, v2

    .line 781
    .line 782
    const-class v0, Ljava/lang/String;

    .line 783
    .line 784
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result p1

    .line 788
    if-nez p1, :cond_e

    .line 789
    .line 790
    move v2, v1

    .line 791
    :cond_e
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 792
    .line 793
    .line 794
    move-result-object p1

    .line 795
    return-object p1

    .line 796
    :pswitch_10
    check-cast p1, Ljava/lang/reflect/Method;

    .line 797
    .line 798
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v0, Lp8/q;

    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-static {p1}, Lp8/q;->a(Ljava/lang/reflect/Method;)Z

    .line 813
    .line 814
    .line 815
    move-result p1

    .line 816
    const/4 v1, 0x0

    .line 817
    if-eqz p1, :cond_f

    .line 818
    .line 819
    array-length p1, v0

    .line 820
    const/4 v2, 0x1

    .line 821
    if-ne p1, v2, :cond_f

    .line 822
    .line 823
    aget-object p1, v0, v1

    .line 824
    .line 825
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 826
    .line 827
    .line 828
    move-result p1

    .line 829
    if-nez p1, :cond_f

    .line 830
    .line 831
    aget-object p1, v0, v1

    .line 832
    .line 833
    const-class v0, Ljava/lang/String;

    .line 834
    .line 835
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result p1

    .line 839
    if-nez p1, :cond_f

    .line 840
    .line 841
    move v1, v2

    .line 842
    :cond_f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 843
    .line 844
    .line 845
    move-result-object p1

    .line 846
    return-object p1

    .line 847
    :pswitch_11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 848
    .line 849
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v0, Lp8/q;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-static {p1}, Lp8/q;->a(Ljava/lang/reflect/Method;)Z

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    const/4 v2, 0x0

    .line 868
    if-eqz v1, :cond_10

    .line 869
    .line 870
    const-string v1, "com.tencent.mm.plugin.sns.model."

    .line 871
    .line 872
    invoke-static {p1, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 873
    .line 874
    .line 875
    move-result p1

    .line 876
    if-eqz p1, :cond_10

    .line 877
    .line 878
    array-length p1, v0

    .line 879
    const/4 v1, 0x2

    .line 880
    if-ne p1, v1, :cond_10

    .line 881
    .line 882
    aget-object p1, v0, v2

    .line 883
    .line 884
    const-class v1, Ljava/lang/String;

    .line 885
    .line 886
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result p1

    .line 890
    if-eqz p1, :cond_10

    .line 891
    .line 892
    const/4 p1, 0x1

    .line 893
    aget-object v0, v0, p1

    .line 894
    .line 895
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_10

    .line 900
    .line 901
    move v2, p1

    .line 902
    :cond_10
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 903
    .line 904
    .line 905
    move-result-object p1

    .line 906
    return-object p1

    .line 907
    :pswitch_data_0
    .packed-switch 0x0
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
