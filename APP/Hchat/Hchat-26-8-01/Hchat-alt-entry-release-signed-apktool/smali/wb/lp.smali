.class public final synthetic Lwb/lp;
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
    iput p2, p0, Lwb/lp;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/lp;->h:Li0/a1;

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
    .locals 10

    .line 1
    iget v0, p0, Lwb/lp;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv1/t;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lv1/t;->b0()Lv1/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Lv1/t;->m(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    new-instance v2, Lu2/k;

    .line 24
    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    shr-long v4, v0, v3

    .line 28
    .line 29
    long-to-int v4, v4

    .line 30
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    float-to-int v5, v5

    .line 35
    const-wide v6, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v0, v6

    .line 41
    long-to-int v0, v0

    .line 42
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    float-to-int v1, v1

    .line 47
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    float-to-int v4, v4

    .line 52
    invoke-interface {p1}, Lv1/t;->F()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    shr-long/2addr v8, v3

    .line 57
    long-to-int v3, v8

    .line 58
    add-int/2addr v4, v3

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    float-to-int v0, v0

    .line 64
    invoke-interface {p1}, Lv1/t;->F()J

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    and-long/2addr v6, v8

    .line 69
    long-to-int p1, v6

    .line 70
    add-int/2addr v0, p1

    .line 71
    invoke-direct {v2, v5, v1, v4, v0}, Lu2/k;-><init>(IIII)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lwb/lp;->h:Li0/a1;

    .line 75
    .line 76
    invoke-interface {p1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, Lu2/l;

    .line 83
    .line 84
    iget-wide v0, p1, Lu2/l;->a:J

    .line 85
    .line 86
    new-instance p1, Lu2/l;

    .line 87
    .line 88
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 92
    .line 93
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_1
    check-cast p1, Le1/b;

    .line 100
    .line 101
    iget-object p1, p0, Lwb/lp;->h:Li0/a1;

    .line 102
    .line 103
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Lfg/a;

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_2
    check-cast p1, Lv1/t;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Lv1/t;->F()J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    const-wide v2, 0xffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    and-long/2addr v0, v2

    .line 132
    long-to-int p1, v0

    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 138
    .line 139
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 149
    .line 150
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 160
    .line 161
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 171
    .line 172
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 182
    .line 183
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 193
    .line 194
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 204
    .line 205
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 215
    .line 216
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 226
    .line 227
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 233
    .line 234
    const/16 v0, 0x20

    .line 235
    .line 236
    :goto_1
    iget-object v1, p0, Lwb/lp;->h:Li0/a1;

    .line 237
    .line 238
    invoke-static {p1, p1, v0, v1}, Lbc/e;->r(Ljava/lang/String;Ljava/lang/String;ILi0/a1;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 249
    .line 250
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 258
    .line 259
    .line 260
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 261
    .line 262
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 273
    .line 274
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 285
    .line 286
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 297
    .line 298
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    new-instance v0, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    const/4 v2, 0x0

    .line 318
    :goto_2
    if-ge v2, v1, :cond_3

    .line 319
    .line 320
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_2

    .line 329
    .line 330
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 331
    .line 332
    .line 333
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 341
    .line 342
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 350
    .line 351
    .line 352
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 353
    .line 354
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :pswitch_13
    check-cast p1, Ljava/util/List;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 365
    .line 366
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 377
    .line 378
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 389
    .line 390
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 401
    .line 402
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 413
    .line 414
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :pswitch_18
    check-cast p1, Lf1/d0;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 425
    .line 426
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    check-cast v0, Ljava/lang/Number;

    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-interface {p1, v0}, Lf1/d0;->s(F)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_0

    .line 440
    .line 441
    :pswitch_19
    check-cast p1, Lu2/l;

    .line 442
    .line 443
    iget-wide v0, p1, Lu2/l;->a:J

    .line 444
    .line 445
    const-wide v2, 0xffffffffL

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    and-long/2addr v0, v2

    .line 451
    long-to-int p1, v0

    .line 452
    int-to-float p1, p1

    .line 453
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 458
    .line 459
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 465
    .line 466
    const/16 v0, 0x3e8

    .line 467
    .line 468
    goto/16 :goto_1

    .line 469
    .line 470
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v0, p0, Lwb/lp;->h:Li0/a1;

    .line 476
    .line 477
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_0

    .line 481
    .line 482
    nop

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_b
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
