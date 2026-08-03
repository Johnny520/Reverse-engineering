.class public final synthetic Lb0/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/l;->h:Li0/a1;

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
    iget v0, p0, Lb0/l;->g:I

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
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Lwb/b3;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ltz p1, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 41
    .line 42
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-ge p1, v1, :cond_0

    .line 53
    .line 54
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 80
    .line 81
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1}, La/a;->b0(Ljava/util/List;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-ge p1, v1, :cond_1

    .line 92
    .line 93
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lna/h;

    .line 108
    .line 109
    add-int/lit8 p1, p1, 0x1

    .line 110
    .line 111
    invoke-virtual {v1, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 118
    .line 119
    return-object p1

    .line 120
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-lez p1, :cond_2

    .line 127
    .line 128
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 129
    .line 130
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Ljava/util/List;

    .line 135
    .line 136
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Lna/h;

    .line 145
    .line 146
    add-int/lit8 p1, p1, -0x1

    .line 147
    .line 148
    invoke-virtual {v1, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    return-object p1

    .line 157
    :pswitch_4
    check-cast p1, Li0/a0;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p1, Lw/g1;

    .line 163
    .line 164
    const/4 v0, 0x1

    .line 165
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 166
    .line 167
    invoke-direct {p1, v1, v0}, Lw/g1;-><init>(Li0/a1;I)V

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 177
    .line 178
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 182
    .line 183
    return-object p1

    .line 184
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 185
    .line 186
    const/16 v0, 0x13

    .line 187
    .line 188
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 189
    .line 190
    invoke-static {p1, p1, v0, v1}, Lbc/e;->r(Ljava/lang/String;Ljava/lang/String;ILi0/a1;)V

    .line 191
    .line 192
    .line 193
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 194
    .line 195
    return-object p1

    .line 196
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 197
    .line 198
    const/16 v0, 0x13

    .line 199
    .line 200
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 201
    .line 202
    invoke-static {p1, p1, v0, v1}, Lbc/e;->r(Ljava/lang/String;Ljava/lang/String;ILi0/a1;)V

    .line 203
    .line 204
    .line 205
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 206
    .line 207
    return-object p1

    .line 208
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 209
    .line 210
    const/16 v0, 0x8

    .line 211
    .line 212
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 213
    .line 214
    invoke-static {p1, p1, v0, v1}, Lbc/e;->r(Ljava/lang/String;Ljava/lang/String;ILi0/a1;)V

    .line 215
    .line 216
    .line 217
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_9
    check-cast p1, Lc9/a;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance v0, Lwb/x0;

    .line 226
    .line 227
    const/4 v1, 0x1

    .line 228
    invoke-direct {v0, p1, v1}, Lwb/x0;-><init>(Lc9/a;Z)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lb0/l;->h:Li0/a1;

    .line 232
    .line 233
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 237
    .line 238
    return-object p1

    .line 239
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 245
    .line 246
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 250
    .line 251
    return-object p1

    .line 252
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 258
    .line 259
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 263
    .line 264
    return-object p1

    .line 265
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 271
    .line 272
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 276
    .line 277
    return-object p1

    .line 278
    :pswitch_d
    check-cast p1, Le1/b;

    .line 279
    .line 280
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 281
    .line 282
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Lfg/l;

    .line 287
    .line 288
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 292
    .line 293
    return-object p1

    .line 294
    :pswitch_e
    check-cast p1, Li0/a0;

    .line 295
    .line 296
    new-instance p1, Lw/g1;

    .line 297
    .line 298
    const/4 v0, 0x0

    .line 299
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 300
    .line 301
    invoke-direct {p1, v1, v0}, Lw/g1;-><init>(Li0/a1;I)V

    .line 302
    .line 303
    .line 304
    return-object p1

    .line 305
    :pswitch_f
    check-cast p1, Ljava/util/List;

    .line 306
    .line 307
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 308
    .line 309
    if-eqz v0, :cond_3

    .line 310
    .line 311
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 315
    .line 316
    return-object p1

    .line 317
    :pswitch_10
    check-cast p1, Lg0/i;

    .line 318
    .line 319
    iget-boolean v0, p1, Lg0/i;->c:Z

    .line 320
    .line 321
    if-eqz v0, :cond_4

    .line 322
    .line 323
    iget-object p1, p1, Lg0/i;->b:Li2/g;

    .line 324
    .line 325
    goto :goto_0

    .line 326
    :cond_4
    iget-object p1, p1, Lg0/i;->a:Li2/g;

    .line 327
    .line 328
    :goto_0
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 329
    .line 330
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 334
    .line 335
    return-object p1

    .line 336
    :pswitch_11
    check-cast p1, Lx1/h0;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 342
    .line 343
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Lfg/l;

    .line 348
    .line 349
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 353
    .line 354
    return-object p1

    .line 355
    :pswitch_12
    check-cast p1, Li2/k0;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-wide v0, p1, Li2/k0;->c:J

    .line 361
    .line 362
    const-wide v2, 0xffffffffL

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    and-long/2addr v0, v2

    .line 368
    long-to-int p1, v0

    .line 369
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 374
    .line 375
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 379
    .line 380
    return-object p1

    .line 381
    :pswitch_13
    check-cast p1, Ljava/lang/Float;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 387
    .line 388
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Lfg/l;

    .line 393
    .line 394
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    check-cast p1, Ljava/lang/Number;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    return-object p1

    .line 409
    :pswitch_14
    check-cast p1, Ljava/lang/Float;

    .line 410
    .line 411
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 415
    .line 416
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    check-cast v0, Lfg/l;

    .line 421
    .line 422
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 426
    .line 427
    return-object p1

    .line 428
    :pswitch_15
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 429
    .line 430
    check-cast p1, Lv1/t;

    .line 431
    .line 432
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 436
    .line 437
    return-object p1

    .line 438
    :pswitch_16
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 439
    .line 440
    check-cast p1, Ljava/lang/String;

    .line 441
    .line 442
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 446
    .line 447
    return-object p1

    .line 448
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 454
    .line 455
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, Ljava/util/Set;

    .line 460
    .line 461
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-eqz v1, :cond_5

    .line 466
    .line 467
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Ljava/util/Set;

    .line 472
    .line 473
    invoke-static {v1, p1}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    goto :goto_1

    .line 478
    :cond_5
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    check-cast v1, Ljava/util/Set;

    .line 483
    .line 484
    invoke-static {v1, p1}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    :goto_1
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 492
    .line 493
    return-object p1

    .line 494
    :pswitch_18
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 495
    .line 496
    check-cast p1, Ljava/lang/String;

    .line 497
    .line 498
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 502
    .line 503
    return-object p1

    .line 504
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 505
    .line 506
    const/16 v0, 0x32

    .line 507
    .line 508
    iget-object v1, p0, Lb0/l;->h:Li0/a1;

    .line 509
    .line 510
    invoke-static {p1, p1, v0, v1}, Lbc/e;->r(Ljava/lang/String;Ljava/lang/String;ILi0/a1;)V

    .line 511
    .line 512
    .line 513
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 514
    .line 515
    return-object p1

    .line 516
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 522
    .line 523
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 527
    .line 528
    return-object p1

    .line 529
    :pswitch_1b
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 530
    .line 531
    check-cast p1, Lv1/t;

    .line 532
    .line 533
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 537
    .line 538
    return-object p1

    .line 539
    :pswitch_1c
    iget-object v0, p0, Lb0/l;->h:Li0/a1;

    .line 540
    .line 541
    check-cast p1, Lv1/t;

    .line 542
    .line 543
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 547
    .line 548
    return-object p1

    .line 549
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
