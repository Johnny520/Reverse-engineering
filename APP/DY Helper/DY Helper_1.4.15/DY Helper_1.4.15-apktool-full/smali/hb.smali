.class public final synthetic Lhb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhb;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb;->ζ:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lhb;->ε:I

    .line 2
    .line 3
    const v1, 0x7f0dba13    # 1.883873E38f

    .line 4
    .line 5
    .line 6
    const v2, 0x7f0dba12

    .line 7
    .line 8
    .line 9
    const v3, 0x7f0dba19

    .line 10
    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const/high16 v5, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    sget-object v9, Ls62;->α:Ls62;

    .line 20
    .line 21
    iget-object p0, p0, Lhb;->ζ:Landroid/view/View;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    sget-object v0, Lq71;->α:Lq71;

    .line 27
    .line 28
    invoke-static {p0}, Lq71;->μ(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object v9

    .line 32
    :pswitch_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/γ;->й(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-object v9

    .line 38
    :pswitch_1
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v7}, Landroid/view/View;->setAlpha(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v8}, Landroid/view/View;->setClickable(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 48
    .line 49
    .line 50
    return-object v9

    .line 51
    :pswitch_2
    new-instance v0, Ljb;

    .line 52
    .line 53
    invoke-direct {v0, p0, v8}, Ljb;-><init>(Landroid/view/View;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-object v9

    .line 60
    :pswitch_3
    const/4 v0, 0x3

    .line 61
    invoke-static {p0, v0}, Lsb;->ε(Landroid/view/View;I)V

    .line 62
    .line 63
    .line 64
    return-object v9

    .line 65
    :pswitch_4
    invoke-static {p0}, Lsb;->ξ(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :pswitch_5
    sget-object v0, Lsb;->α:Lsb;

    .line 70
    .line 71
    invoke-static {p0}, Lsb;->γ(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    return-object v9

    .line 75
    :pswitch_6
    invoke-static {p0}, Lsb;->ο(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    return-object v9

    .line 79
    :pswitch_7
    :try_start_0
    sget-object v0, Lsb;->α:Lsb;

    .line 80
    .line 81
    invoke-static {p0}, Lsb;->π(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string v0, "rba3364bb45bf3577"

    .line 91
    .line 92
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-object v9

    .line 96
    :pswitch_8
    :try_start_1
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_0
    sget-object v0, Lsb;->α:Lsb;

    .line 111
    .line 112
    invoke-static {p0}, Lsb;->Τ(Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    cmpg-float v0, v0, v5

    .line 133
    .line 134
    if-nez v0, :cond_1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p0, v5}, Landroid/view/View;->setAlpha(F)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    goto :goto_3

    .line 143
    :cond_2
    :goto_1
    invoke-virtual {p0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    instance-of v1, v0, Ljava/lang/Integer;

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    check-cast v0, Ljava/lang/Integer;

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    move-object v0, v6

    .line 155
    :goto_2
    if-eqz v0, :cond_7

    .line 156
    .line 157
    invoke-virtual {p0, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eq v2, v3, :cond_4

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 179
    .line 180
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_5

    .line 188
    .line 189
    invoke-virtual {p0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    cmpg-float v0, v0, v5

    .line 197
    .line 198
    if-nez v0, :cond_6

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    invoke-virtual {p0, v5}, Landroid/view/View;->setAlpha(F)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const-string v0, "rdfda5c987517c87b"

    .line 210
    .line 211
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    return-object v9

    .line 215
    :pswitch_9
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-eqz v0, :cond_8

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 222
    .line 223
    .line 224
    :catchall_2
    :cond_8
    :try_start_3
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 225
    .line 226
    .line 227
    :catchall_3
    :try_start_4
    invoke-virtual {p0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v8}, Landroid/view/View;->setMinimumHeight(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_a

    .line 238
    .line 239
    invoke-virtual {p0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 246
    .line 247
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {p0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :catchall_4
    move-exception p0

    .line 256
    goto :goto_6

    .line 257
    :cond_9
    :goto_5
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 258
    .line 259
    if-eqz v1, :cond_a

    .line 260
    .line 261
    iput v8, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 262
    .line 263
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    .line 265
    .line 266
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eq v0, v4, :cond_b

    .line 271
    .line 272
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 273
    .line 274
    .line 275
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    cmpg-float v0, v0, v7

    .line 280
    .line 281
    if-nez v0, :cond_c

    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_c
    invoke-virtual {p0, v7}, Landroid/view/View;->setAlpha(F)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 285
    .line 286
    .line 287
    goto :goto_7

    .line 288
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    const-string v0, "r45fab6f41990f933"

    .line 293
    .line 294
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :goto_7
    return-object v9

    .line 298
    :pswitch_a
    :try_start_5
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_d

    .line 303
    .line 304
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 305
    .line 306
    .line 307
    :catchall_5
    :cond_d
    :try_start_6
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 308
    .line 309
    .line 310
    :catchall_6
    :try_start_7
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    cmpg-float v0, v0, v7

    .line 315
    .line 316
    if-nez v0, :cond_e

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_e
    invoke-virtual {p0, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 320
    .line 321
    .line 322
    :goto_8
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-eqz v0, :cond_f

    .line 327
    .line 328
    invoke-virtual {p0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 329
    .line 330
    .line 331
    goto :goto_9

    .line 332
    :catchall_7
    move-exception p0

    .line 333
    goto :goto_a

    .line 334
    :cond_f
    :goto_9
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    cmpg-float v0, v0, v5

    .line 339
    .line 340
    if-nez v0, :cond_10

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_10
    invoke-virtual {p0, v5}, Landroid/view/View;->setAlpha(F)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 344
    .line 345
    .line 346
    goto :goto_b

    .line 347
    :goto_a
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    const-string v0, "rc9e97d46da0d1275"

    .line 352
    .line 353
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :goto_b
    return-object v9

    .line 357
    :pswitch_b
    sget-object v0, Lsb;->α:Lsb;

    .line 358
    .line 359
    :try_start_8
    invoke-static {p0}, Lsb;->Υ(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 363
    .line 364
    if-eqz v0, :cond_11

    .line 365
    .line 366
    move-object v0, p0

    .line 367
    check-cast v0, Landroid/view/ViewGroup;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    :goto_c
    if-ge v8, v0, :cond_11

    .line 374
    .line 375
    move-object v1, p0

    .line 376
    check-cast v1, Landroid/view/ViewGroup;

    .line 377
    .line 378
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-static {v1}, Lsb;->Φ(Landroid/view/View;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 386
    .line 387
    .line 388
    add-int/lit8 v8, v8, 0x1

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :catchall_8
    move-exception p0

    .line 392
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    const-string v0, "r56cb17b1bb811424"

    .line 397
    .line 398
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_11
    return-object v9

    .line 402
    :pswitch_c
    sget-object v0, Lsb;->α:Lsb;

    .line 403
    .line 404
    invoke-static {p0}, Lsb;->а(Landroid/view/View;)V

    .line 405
    .line 406
    .line 407
    invoke-static {}, Lsb;->β()V

    .line 408
    .line 409
    .line 410
    return-object v9

    .line 411
    :pswitch_d
    invoke-static {p0}, Lsb;->α(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    return-object v9

    .line 415
    :pswitch_e
    sget-object v0, Lsb;->α:Lsb;

    .line 416
    .line 417
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_12

    .line 428
    .line 429
    invoke-static {p0}, Lsb;->Υ(Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    :cond_12
    invoke-static {p0}, Lsb;->Τ(Landroid/view/View;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_15

    .line 444
    .line 445
    invoke-virtual {p0, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    const v0, 0x7f0dba1b

    .line 449
    .line 450
    .line 451
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    instance-of v2, v1, Ljava/lang/Float;

    .line 456
    .line 457
    if-eqz v2, :cond_13

    .line 458
    .line 459
    check-cast v1, Ljava/lang/Float;

    .line 460
    .line 461
    goto :goto_d

    .line 462
    :cond_13
    move-object v1, v6

    .line 463
    :goto_d
    invoke-virtual {p0, v0, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    if-eqz v1, :cond_14

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    :cond_14
    invoke-virtual {p0, v5}, Landroid/view/View;->setAlpha(F)V

    .line 473
    .line 474
    .line 475
    :cond_15
    return-object v9

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
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
