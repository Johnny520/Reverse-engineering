.class public final synthetic Lhi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lhi;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lhi;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget v0, p0, Lhi;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lhi;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lum1;

    .line 9
    .line 10
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/app/AlertDialog;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    check-cast p0, Lmv1;

    .line 21
    .line 22
    iget-boolean p1, p0, Lmv1;->ε:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lmv1;->ζ:Lp70;

    .line 27
    .line 28
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :pswitch_1
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 33
    .line 34
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->ζ(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    check-cast p0, Lmw0;

    .line 39
    .line 40
    sget p1, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 41
    .line 42
    invoke-virtual {p0}, Lmw0;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    check-cast p0, Lfx;

    .line 47
    .line 48
    invoke-virtual {p0}, Lfx;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    check-cast p0, Lgx;

    .line 53
    .line 54
    invoke-virtual {p0}, Lgx;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    check-cast p0, Landroid/view/ViewGroup;

    .line 59
    .line 60
    sget-object p1, Lql;->α:Lql;

    .line 61
    .line 62
    invoke-static {p0}, Lql;->τ(Landroid/view/ViewGroup;)Lol;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 v0, 0x0

    .line 67
    const/4 v1, 0x0

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    iget-object v2, p1, Lol;->γ:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2}, Lql;->Δ(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    new-instance v3, Lnl;

    .line 79
    .line 80
    invoke-static {v2}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-boolean p1, p1, Lol;->δ:Z

    .line 85
    .line 86
    invoke-direct {v3, v2, p1}, Lnl;-><init>(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_2
    invoke-static {p0}, Lql;->π(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_a

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    const-wide/16 v3, -0x1

    .line 102
    .line 103
    move v5, v0

    .line 104
    move-object v6, v1

    .line 105
    :goto_0
    if-ge v5, v2, :cond_6

    .line 106
    .line 107
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-nez v8, :cond_5

    .line 116
    .line 117
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-gez v8, :cond_3

    .line 130
    .line 131
    move v8, v0

    .line 132
    :cond_3
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-gez v9, :cond_4

    .line 145
    .line 146
    move v9, v0

    .line 147
    :cond_4
    int-to-long v10, v8

    .line 148
    int-to-long v8, v9

    .line 149
    mul-long/2addr v10, v8

    .line 150
    cmp-long v8, v10, v3

    .line 151
    .line 152
    if-lez v8, :cond_5

    .line 153
    .line 154
    move-object v6, v7

    .line 155
    move-wide v3, v10

    .line 156
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_6
    if-nez v6, :cond_9

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-lez v2, :cond_7

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_7
    move-object p1, v1

    .line 169
    :goto_1
    if-eqz p1, :cond_8

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_2

    .line 176
    :cond_8
    move-object v6, v1

    .line 177
    :cond_9
    :goto_2
    if-eqz v6, :cond_a

    .line 178
    .line 179
    invoke-static {v6}, Lql;->η(Landroid/view/View;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    goto :goto_3

    .line 184
    :cond_a
    move-object p1, v1

    .line 185
    :goto_3
    if-eqz p1, :cond_c

    .line 186
    .line 187
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_b

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_b
    new-instance v3, Lnl;

    .line 195
    .line 196
    invoke-static {p1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {p1}, Lql;->υ(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-direct {v3, v2, p1}, Lnl;-><init>(Ljava/lang/String;Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    :goto_4
    invoke-static {p0}, Lql;->η(Landroid/view/View;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-eqz p1, :cond_e

    .line 213
    .line 214
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_d

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_d
    new-instance v3, Lnl;

    .line 222
    .line 223
    invoke-static {p1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {p1}, Lql;->υ(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-direct {v3, v2, p1}, Lnl;-><init>(Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_e
    :goto_5
    move-object v3, v1

    .line 236
    :goto_6
    const/4 p1, 0x1

    .line 237
    if-nez v3, :cond_12

    .line 238
    .line 239
    invoke-static {p0}, Lql;->π(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {p0}, Lql;->τ(Landroid/view/ViewGroup;)Lol;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    if-eqz v3, :cond_f

    .line 248
    .line 249
    iget-object v3, v3, Lol;->γ:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v3}, Lql;->Δ(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    goto :goto_7

    .line 256
    :cond_f
    move v3, v0

    .line 257
    :goto_7
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    if-eqz v4, :cond_10

    .line 262
    .line 263
    move v0, p1

    .line 264
    :cond_10
    if-eqz v2, :cond_11

    .line 265
    .line 266
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    goto :goto_8

    .line 271
    :cond_11
    const/4 v2, -0x1

    .line 272
    :goto_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    new-instance v5, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v6, "[SimilarEmoji] url unavailable after click scan attached="

    .line 283
    .line 284
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v0, ", candidateReady="

    .line 291
    .line 292
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v0, ", recyclerChildren="

    .line 299
    .line 300
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v0, ", container="

    .line 307
    .line 308
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    const/4 v2, 0x4

    .line 319
    const-string v3, "r44059b78c5c3e9e3"

    .line 320
    .line 321
    invoke-static {v3, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    sget-object v0, Lql;->β:Landroid/os/Handler;

    .line 332
    .line 333
    new-instance v1, Lyi;

    .line 334
    .line 335
    const-string v2, "\u672a\u627e\u5230\u8868\u60c5\u5730\u5740"

    .line 336
    .line 337
    invoke-direct {v1, p1, p0, v2}, Lyi;-><init>(ILandroid/content/Context;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 341
    .line 342
    .line 343
    goto/16 :goto_d

    .line 344
    .line 345
    :cond_12
    iget-object v0, v3, Lnl;->α:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v0}, Lql;->μ(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget v2, Lcom/example/dyhelper/MainHook;->β:I

    .line 351
    .line 352
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    :goto_9
    instance-of v4, v2, Landroid/content/ContextWrapper;

    .line 357
    .line 358
    if-eqz v4, :cond_15

    .line 359
    .line 360
    instance-of v4, v2, Landroid/app/Activity;

    .line 361
    .line 362
    if-eqz v4, :cond_14

    .line 363
    .line 364
    move-object v1, v2

    .line 365
    check-cast v1, Landroid/app/Activity;

    .line 366
    .line 367
    :cond_13
    :goto_a
    move-object v9, v1

    .line 368
    goto :goto_b

    .line 369
    :cond_14
    check-cast v2, Landroid/content/ContextWrapper;

    .line 370
    .line 371
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    goto :goto_9

    .line 376
    :cond_15
    instance-of v4, v2, Landroid/app/Activity;

    .line 377
    .line 378
    if-eqz v4, :cond_13

    .line 379
    .line 380
    move-object v1, v2

    .line 381
    check-cast v1, Landroid/app/Activity;

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :goto_b
    if-nez v9, :cond_16

    .line 385
    .line 386
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    sget-object v0, Lql;->β:Landroid/os/Handler;

    .line 394
    .line 395
    new-instance v1, Lyi;

    .line 396
    .line 397
    const-string v2, "\u65e0\u6cd5\u83b7\u53d6\u754c\u9762\u4e0a\u4e0b\u6587"

    .line 398
    .line 399
    invoke-direct {v1, p1, p0, v2}, Lyi;-><init>(ILandroid/content/Context;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 403
    .line 404
    .line 405
    goto/16 :goto_d

    .line 406
    .line 407
    :cond_16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    if-nez v1, :cond_17

    .line 416
    .line 417
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    sget-object v0, Lql;->β:Landroid/os/Handler;

    .line 425
    .line 426
    new-instance v1, Lyi;

    .line 427
    .line 428
    const-string v2, "\u5bbf\u4e3b\u56fe\u7247\u7ec4\u4ef6\u4e0d\u53ef\u7528"

    .line 429
    .line 430
    invoke-direct {v1, p1, p0, v2}, Lyi;-><init>(ILandroid/content/Context;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 434
    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_17
    sget-object p0, Lqy0;->α:Lqy0;

    .line 438
    .line 439
    invoke-static {v0}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iget-boolean v8, v3, Lnl;->β:Z

    .line 444
    .line 445
    new-instance v5, Ln5;

    .line 446
    .line 447
    invoke-direct {v5, v9, v1}, Ln5;-><init>(Landroid/app/Activity;Ljava/lang/ClassLoader;)V

    .line 448
    .line 449
    .line 450
    new-instance v12, Ln;

    .line 451
    .line 452
    const/16 v2, 0x15

    .line 453
    .line 454
    invoke-direct {v12, v2, v1}, Ln;-><init>(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_18

    .line 470
    .line 471
    const-string p0, "\u672a\u627e\u5230\u8868\u60c5\u4e0b\u8f7d\u94fe\u63a5"

    .line 472
    .line 473
    invoke-static {v9, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_18
    invoke-static {v9}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    iget-object v1, v0, Liu;->β:Ljava/lang/String;

    .line 482
    .line 483
    if-eqz v1, :cond_1a

    .line 484
    .line 485
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-eqz v1, :cond_19

    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_19
    invoke-virtual {v0}, Liu;->α()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_1a

    .line 497
    .line 498
    const-string v0, "DYHelper"

    .line 499
    .line 500
    const-string v1, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 501
    .line 502
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    :cond_1a
    :goto_c
    invoke-static {v9}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p0}, Lqy0;->ж()I

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    invoke-static {v9}, Lqy0;->А(Landroid/content/Context;)Z

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    const-string p0, "comment_emoji_convert_format_enabled"

    .line 517
    .line 518
    invoke-static {v9, p0, p1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    const-string p0, "\u4e0b\u8f7d\u8868\u60c5"

    .line 523
    .line 524
    const-string p1, "\u6b63\u5728\u8fde\u63a5..."

    .line 525
    .line 526
    invoke-static {v9, p0, p1}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const-string p0, "\u5f00\u59cb\u4e0b\u8f7d\u8868\u60c5..."

    .line 530
    .line 531
    invoke-static {v9, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    new-instance v4, Lwx0;

    .line 535
    .line 536
    invoke-direct/range {v4 .. v12}, Lwx0;-><init>(Ln5;Ljava/lang/String;ZZLandroid/app/Activity;IZLn;)V

    .line 537
    .line 538
    .line 539
    const/16 p0, 0x17

    .line 540
    .line 541
    const-string p1, "dl-comment-emoji-prepare"

    .line 542
    .line 543
    invoke-static {p0, v4, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    :goto_d
    return-void

    .line 547
    :pswitch_6
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 548
    .line 549
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->β(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :pswitch_7
    check-cast p0, Lei;

    .line 554
    .line 555
    invoke-virtual {p0}, Lei;->invoke()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_data_0
    .packed-switch 0x0
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
