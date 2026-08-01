.class public final synthetic Loq1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Loq1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Loq1;->ε:I

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    const-string v2, "DYHelper"

    .line 7
    .line 8
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    const-class v4, Lil0;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    sget-object v6, Ls62;->α:Ls62;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, Landroid/widget/Switch;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v1, Lbv1;->α:Lbv1;

    .line 34
    .line 35
    const-string v1, "live_room_audience_exact_count_enabled"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    return-object v6

    .line 41
    :pswitch_0
    move-object/from16 v0, p1

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    move-object/from16 v1, p2

    .line 50
    .line 51
    check-cast v1, Landroid/widget/Switch;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v1, "spark_show_top_notification"

    .line 57
    .line 58
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    return-object v6

    .line 62
    :pswitch_1
    move-object/from16 v0, p1

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    move-object/from16 v1, p2

    .line 71
    .line 72
    check-cast v1, Landroid/widget/Switch;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const-string v1, "download_show_top_notification"

    .line 78
    .line 79
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return-object v6

    .line 83
    :pswitch_2
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    move-object/from16 v1, p2

    .line 92
    .line 93
    check-cast v1, Landroid/widget/Switch;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v1, Lbv1;->α:Lbv1;

    .line 99
    .line 100
    const-string v1, "feed_follow_confirm_enabled"

    .line 101
    .line 102
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 103
    .line 104
    .line 105
    return-object v6

    .line 106
    :pswitch_3
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    move-object/from16 v1, p2

    .line 115
    .line 116
    check-cast v1, Landroid/widget/Switch;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object v1, Lbv1;->α:Lbv1;

    .line 122
    .line 123
    const-string v1, "profile_bookmark_show_enabled"

    .line 124
    .line 125
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    return-object v6

    .line 129
    :pswitch_4
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    move-object/from16 v1, p2

    .line 138
    .line 139
    check-cast v1, Landroid/widget/Switch;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v1, Lbv1;->α:Lbv1;

    .line 145
    .line 146
    const-string v1, "profile_bookmark_hook_enabled"

    .line 147
    .line 148
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    return-object v6

    .line 152
    :pswitch_5
    move-object/from16 v0, p1

    .line 153
    .line 154
    check-cast v0, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    move-object/from16 v1, p2

    .line 161
    .line 162
    check-cast v1, Landroid/widget/Switch;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v1, Lbv1;->α:Lbv1;

    .line 168
    .line 169
    const-string v1, "profile_uid_show_enabled"

    .line 170
    .line 171
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    return-object v6

    .line 175
    :pswitch_6
    move-object/from16 v0, p1

    .line 176
    .line 177
    check-cast v0, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    move-object/from16 v1, p2

    .line 184
    .line 185
    check-cast v1, Landroid/widget/Switch;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v1, Lbv1;->α:Lbv1;

    .line 191
    .line 192
    const-string v1, "video_length_alert_enabled"

    .line 193
    .line 194
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    return-object v6

    .line 198
    :pswitch_7
    move-object/from16 v0, p1

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    move-object/from16 v8, p2

    .line 207
    .line 208
    check-cast v8, Landroid/widget/Switch;

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object v8, Lbv1;->α:Lbv1;

    .line 214
    .line 215
    const-string v8, "immersive_navigation_bar_enabled"

    .line 216
    .line 217
    invoke-static {v8, v7}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 218
    .line 219
    .line 220
    :try_start_0
    sget-object v7, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 221
    .line 222
    const-string v7, "setNavigationBarEnabled"

    .line 223
    .line 224
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v4, v7, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v3, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    .line 238
    .line 239
    goto :goto_0

    .line 240
    :catch_0
    move-exception v0

    .line 241
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    const-string v3, "\u901a\u77e5\u6c89\u6d78\u5f0f\u5bfc\u822a\u680f Hook \u5931\u8d25: "

    .line 246
    .line 247
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v2, v0, v5, v1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :goto_0
    return-object v6

    .line 255
    :pswitch_8
    move-object/from16 v0, p1

    .line 256
    .line 257
    check-cast v0, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    move-object/from16 v8, p2

    .line 264
    .line 265
    check-cast v8, Landroid/widget/Switch;

    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget-object v8, Lbv1;->α:Lbv1;

    .line 271
    .line 272
    const-string v8, "immersive_status_bar_enabled"

    .line 273
    .line 274
    invoke-static {v8, v7}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 275
    .line 276
    .line 277
    :try_start_1
    sget-object v7, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 278
    .line 279
    const-string v7, "setEnabled"

    .line 280
    .line 281
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v4, v7, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {v3, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 294
    .line 295
    .line 296
    goto :goto_1

    .line 297
    :catch_1
    move-exception v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    const-string v3, "\u901a\u77e5\u6c89\u6d78\u5f0f\u72b6\u6001\u680f Hook \u5931\u8d25: "

    .line 303
    .line 304
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v2, v0, v5, v1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :goto_1
    return-object v6

    .line 312
    :pswitch_9
    move-object/from16 v0, p1

    .line 313
    .line 314
    check-cast v0, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    move-object/from16 v1, p2

    .line 321
    .line 322
    check-cast v1, Landroid/widget/Switch;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    sget-object v1, Lbv1;->α:Lbv1;

    .line 328
    .line 329
    const-string v1, "precise_time_enabled"

    .line 330
    .line 331
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 332
    .line 333
    .line 334
    return-object v6

    .line 335
    :pswitch_a
    move-object/from16 v0, p1

    .line 336
    .line 337
    check-cast v0, Ljava/lang/Boolean;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    move-object/from16 v1, p2

    .line 344
    .line 345
    check-cast v1, Landroid/widget/Switch;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    sget-object v1, Lbv1;->α:Lbv1;

    .line 351
    .line 352
    const-string v1, "duration_alert_enabled"

    .line 353
    .line 354
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 355
    .line 356
    .line 357
    return-object v6

    .line 358
    :pswitch_b
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    move-object/from16 v1, p2

    .line 367
    .line 368
    check-cast v1, Landroid/widget/Switch;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    sget-object v1, Lbv1;->α:Lbv1;

    .line 374
    .line 375
    const-string v1, "im_auto_read_include_interactive"

    .line 376
    .line 377
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 378
    .line 379
    .line 380
    return-object v6

    .line 381
    :pswitch_c
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, Ljava/lang/Boolean;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    move-object/from16 v1, p2

    .line 390
    .line 391
    check-cast v1, Landroid/widget/Switch;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    sget-object v1, Lbv1;->α:Lbv1;

    .line 397
    .line 398
    const-string v1, "im_auto_read_enabled"

    .line 399
    .line 400
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 401
    .line 402
    .line 403
    return-object v6

    .line 404
    :pswitch_d
    move-object/from16 v0, p1

    .line 405
    .line 406
    check-cast v0, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    move-object/from16 v1, p2

    .line 413
    .line 414
    check-cast v1, Landroid/widget/Switch;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    const-string v1, "offline_cache_count_enabled"

    .line 420
    .line 421
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 422
    .line 423
    .line 424
    return-object v6

    .line 425
    :pswitch_e
    move-object/from16 v0, p1

    .line 426
    .line 427
    check-cast v0, Ljava/lang/Boolean;

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    move-object/from16 v1, p2

    .line 434
    .line 435
    check-cast v1, Landroid/widget/Switch;

    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    sget-object v1, Lbv1;->α:Lbv1;

    .line 441
    .line 442
    const-string v1, "comment_control_custom_enabled"

    .line 443
    .line 444
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 445
    .line 446
    .line 447
    return-object v6

    .line 448
    :pswitch_f
    move-object/from16 v0, p1

    .line 449
    .line 450
    check-cast v0, Ljava/lang/Boolean;

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    move-object/from16 v1, p2

    .line 457
    .line 458
    check-cast v1, Landroid/widget/Switch;

    .line 459
    .line 460
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    const-string v1, "live_photo_merge_after_download"

    .line 464
    .line 465
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 466
    .line 467
    .line 468
    return-object v6

    .line 469
    :pswitch_10
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, Ljava/lang/Boolean;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    move-object/from16 v1, p2

    .line 478
    .line 479
    check-cast v1, Landroid/widget/Switch;

    .line 480
    .line 481
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    const-string v1, "comment_emoji_convert_format_enabled"

    .line 485
    .line 486
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 487
    .line 488
    .line 489
    return-object v6

    .line 490
    :pswitch_11
    move-object/from16 v0, p1

    .line 491
    .line 492
    check-cast v0, Ljava/lang/Boolean;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    move-object/from16 v1, p2

    .line 499
    .line 500
    check-cast v1, Landroid/widget/Switch;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    sget-object v1, Lbv1;->α:Lbv1;

    .line 506
    .line 507
    const-string v1, "feed_preload_debug_log"

    .line 508
    .line 509
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 510
    .line 511
    .line 512
    return-object v6

    .line 513
    :pswitch_12
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    move-object/from16 v1, p2

    .line 522
    .line 523
    check-cast v1, Landroid/widget/Switch;

    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    sget-object v1, Lbv1;->α:Lbv1;

    .line 529
    .line 530
    const-string v1, "comment_panel_hook_enabled"

    .line 531
    .line 532
    invoke-static {v1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 533
    .line 534
    .line 535
    return-object v6

    .line 536
    :pswitch_13
    move-object/from16 v0, p1

    .line 537
    .line 538
    check-cast v0, Lwp1;

    .line 539
    .line 540
    move-object/from16 v0, p2

    .line 541
    .line 542
    check-cast v0, Lp32;

    .line 543
    .line 544
    iget v0, v0, Lp32;->α:I

    .line 545
    .line 546
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    return-object v0

    .line 551
    :pswitch_14
    move-object/from16 v0, p1

    .line 552
    .line 553
    check-cast v0, Lwp1;

    .line 554
    .line 555
    move-object/from16 v1, p2

    .line 556
    .line 557
    check-cast v1, Lq32;

    .line 558
    .line 559
    iget v2, v1, Lq32;->α:I

    .line 560
    .line 561
    new-instance v3, Lp32;

    .line 562
    .line 563
    invoke-direct {v3, v2}, Lp32;-><init>(I)V

    .line 564
    .line 565
    .line 566
    sget-object v2, Ljx0;->ξ:Ln5;

    .line 567
    .line 568
    invoke-static {v3, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    iget-boolean v1, v1, Lq32;->β:Z

    .line 573
    .line 574
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    return-object v0

    .line 587
    :pswitch_15
    move-object/from16 v0, p1

    .line 588
    .line 589
    check-cast v0, Lwp1;

    .line 590
    .line 591
    move-object/from16 v0, p2

    .line 592
    .line 593
    check-cast v0, Lrr0;

    .line 594
    .line 595
    iget v0, v0, Lrr0;->α:I

    .line 596
    .line 597
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    return-object v0

    .line 602
    :pswitch_16
    move-object/from16 v0, p1

    .line 603
    .line 604
    check-cast v0, Lwp1;

    .line 605
    .line 606
    move-object/from16 v0, p2

    .line 607
    .line 608
    check-cast v0, Lxy;

    .line 609
    .line 610
    iget v0, v0, Lxy;->α:I

    .line 611
    .line 612
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    return-object v0

    .line 617
    :pswitch_17
    move-object/from16 v0, p1

    .line 618
    .line 619
    check-cast v0, Lwp1;

    .line 620
    .line 621
    move-object/from16 v1, p2

    .line 622
    .line 623
    check-cast v1, Lkh1;

    .line 624
    .line 625
    iget-boolean v2, v1, Lkh1;->α:Z

    .line 626
    .line 627
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    sget-object v3, Lrq1;->α:Ln5;

    .line 632
    .line 633
    iget v1, v1, Lkh1;->β:I

    .line 634
    .line 635
    new-instance v3, Lxy;

    .line 636
    .line 637
    invoke-direct {v3, v1}, Lxy;-><init>(I)V

    .line 638
    .line 639
    .line 640
    sget-object v1, Ljx0;->λ:Ln5;

    .line 641
    .line 642
    invoke-static {v3, v1, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    return-object v0

    .line 655
    :pswitch_18
    move-object/from16 v0, p1

    .line 656
    .line 657
    check-cast v0, Lwp1;

    .line 658
    .line 659
    move-object/from16 v1, p2

    .line 660
    .line 661
    check-cast v1, Lo32;

    .line 662
    .line 663
    iget-object v2, v1, Lo32;->α:Lux1;

    .line 664
    .line 665
    sget-object v3, Lrq1;->θ:Ln5;

    .line 666
    .line 667
    invoke-static {v2, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    iget-object v4, v1, Lo32;->β:Lux1;

    .line 672
    .line 673
    invoke-static {v4, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    iget-object v5, v1, Lo32;->γ:Lux1;

    .line 678
    .line 679
    invoke-static {v5, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    iget-object v1, v1, Lo32;->δ:Lux1;

    .line 684
    .line 685
    invoke-static {v1, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    filled-new-array {v2, v4, v5, v0}, [Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    return-object v0

    .line 698
    :pswitch_19
    move-object/from16 v0, p1

    .line 699
    .line 700
    check-cast v0, Lwp1;

    .line 701
    .line 702
    move-object/from16 v1, p2

    .line 703
    .line 704
    check-cast v1, Lux1;

    .line 705
    .line 706
    iget-object v2, v1, Lux1;->α:Lf32;

    .line 707
    .line 708
    invoke-interface {v2}, Lf32;->β()J

    .line 709
    .line 710
    .line 711
    move-result-wide v2

    .line 712
    new-instance v4, Lci;

    .line 713
    .line 714
    invoke-direct {v4, v2, v3}, Lci;-><init>(J)V

    .line 715
    .line 716
    .line 717
    sget-object v2, Lrq1;->π:Lqq1;

    .line 718
    .line 719
    invoke-static {v4, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    iget-wide v3, v1, Lux1;->β:J

    .line 724
    .line 725
    new-instance v6, Ly32;

    .line 726
    .line 727
    invoke-direct {v6, v3, v4}, Ly32;-><init>(J)V

    .line 728
    .line 729
    .line 730
    sget-object v3, Lrq1;->χ:Lqq1;

    .line 731
    .line 732
    invoke-static {v6, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    iget-object v4, v1, Lux1;->γ:Ld60;

    .line 737
    .line 738
    sget-object v7, Ld60;->ζ:Ld60;

    .line 739
    .line 740
    sget-object v7, Lrq1;->ν:Ln5;

    .line 741
    .line 742
    invoke-static {v4, v7, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    iget-object v4, v1, Lux1;->δ:Lb60;

    .line 747
    .line 748
    sget-object v8, Lrq1;->υ:Ln5;

    .line 749
    .line 750
    invoke-static {v4, v8, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v8

    .line 754
    iget-object v4, v1, Lux1;->ε:Lc60;

    .line 755
    .line 756
    sget-object v9, Lrq1;->φ:Ln5;

    .line 757
    .line 758
    invoke-static {v4, v9, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v9

    .line 762
    const/4 v4, -0x1

    .line 763
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v10

    .line 767
    iget-object v11, v1, Lux1;->η:Ljava/lang/String;

    .line 768
    .line 769
    iget-wide v12, v1, Lux1;->θ:J

    .line 770
    .line 771
    new-instance v4, Ly32;

    .line 772
    .line 773
    invoke-direct {v4, v12, v13}, Ly32;-><init>(J)V

    .line 774
    .line 775
    .line 776
    invoke-static {v4, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v12

    .line 780
    iget-object v3, v1, Lux1;->ι:Lr8;

    .line 781
    .line 782
    sget-object v4, Lrq1;->ξ:Ln5;

    .line 783
    .line 784
    invoke-static {v3, v4, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v13

    .line 788
    iget-object v3, v1, Lux1;->κ:Lg32;

    .line 789
    .line 790
    sget-object v4, Lrq1;->λ:Ln5;

    .line 791
    .line 792
    invoke-static {v3, v4, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v14

    .line 796
    iget-object v3, v1, Lux1;->λ:Lav0;

    .line 797
    .line 798
    sget-object v4, Lav0;->η:Lav0;

    .line 799
    .line 800
    sget-object v4, Lrq1;->Α:Ln5;

    .line 801
    .line 802
    invoke-static {v3, v4, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v15

    .line 806
    iget-wide v3, v1, Lux1;->μ:J

    .line 807
    .line 808
    move-object/from16 p0, v5

    .line 809
    .line 810
    new-instance v5, Lci;

    .line 811
    .line 812
    invoke-direct {v5, v3, v4}, Lci;-><init>(J)V

    .line 813
    .line 814
    .line 815
    invoke-static {v5, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v16

    .line 819
    iget-object v2, v1, Lux1;->ν:Lc32;

    .line 820
    .line 821
    sget-object v3, Lrq1;->κ:Ln5;

    .line 822
    .line 823
    invoke-static {v2, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v17

    .line 827
    iget-object v1, v1, Lux1;->ξ:Lfv1;

    .line 828
    .line 829
    sget-object v2, Lfv1;->δ:Lfv1;

    .line 830
    .line 831
    sget-object v2, Lrq1;->ο:Ln5;

    .line 832
    .line 833
    invoke-static {v1, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v18

    .line 837
    move-object/from16 v5, p0

    .line 838
    .line 839
    filled-new-array/range {v5 .. v18}, [Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    return-object v0

    .line 848
    :pswitch_1a
    move-object/from16 v0, p1

    .line 849
    .line 850
    check-cast v0, Lwp1;

    .line 851
    .line 852
    move-object/from16 v0, p2

    .line 853
    .line 854
    check-cast v0, La72;

    .line 855
    .line 856
    iget-object v0, v0, La72;->α:Ljava/lang/String;

    .line 857
    .line 858
    return-object v0

    .line 859
    :pswitch_1b
    move-object/from16 v0, p1

    .line 860
    .line 861
    check-cast v0, Lwp1;

    .line 862
    .line 863
    move-object/from16 v1, p2

    .line 864
    .line 865
    check-cast v1, Lr91;

    .line 866
    .line 867
    iget v2, v1, Lr91;->α:I

    .line 868
    .line 869
    new-instance v3, Lz22;

    .line 870
    .line 871
    invoke-direct {v3, v2}, Lz22;-><init>(I)V

    .line 872
    .line 873
    .line 874
    sget-object v2, Lrq1;->ρ:Lqq1;

    .line 875
    .line 876
    invoke-static {v3, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    iget v2, v1, Lr91;->β:I

    .line 881
    .line 882
    new-instance v3, Le32;

    .line 883
    .line 884
    invoke-direct {v3, v2}, Le32;-><init>(I)V

    .line 885
    .line 886
    .line 887
    sget-object v2, Lrq1;->σ:Lqq1;

    .line 888
    .line 889
    invoke-static {v3, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    iget-wide v2, v1, Lr91;->γ:J

    .line 894
    .line 895
    new-instance v6, Ly32;

    .line 896
    .line 897
    invoke-direct {v6, v2, v3}, Ly32;-><init>(J)V

    .line 898
    .line 899
    .line 900
    sget-object v2, Lrq1;->χ:Lqq1;

    .line 901
    .line 902
    invoke-static {v6, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v6

    .line 906
    iget-object v2, v1, Lr91;->δ:Lh32;

    .line 907
    .line 908
    sget-object v3, Lh32;->γ:Lh32;

    .line 909
    .line 910
    sget-object v3, Lrq1;->μ:Ln5;

    .line 911
    .line 912
    invoke-static {v2, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v7

    .line 916
    iget-object v2, v1, Lr91;->ε:Lkh1;

    .line 917
    .line 918
    sget-object v3, Ljx0;->κ:Ln5;

    .line 919
    .line 920
    invoke-static {v2, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v8

    .line 924
    iget-object v2, v1, Lr91;->ζ:Lwr0;

    .line 925
    .line 926
    sget-object v3, Lwr0;->δ:Lwr0;

    .line 927
    .line 928
    sget-object v3, Lrq1;->Γ:Ln5;

    .line 929
    .line 930
    invoke-static {v2, v3, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v9

    .line 934
    iget v2, v1, Lr91;->η:I

    .line 935
    .line 936
    new-instance v3, Lrr0;

    .line 937
    .line 938
    invoke-direct {v3, v2}, Lrr0;-><init>(I)V

    .line 939
    .line 940
    .line 941
    sget-object v2, Ljx0;->μ:Ln5;

    .line 942
    .line 943
    invoke-static {v3, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v10

    .line 947
    iget v2, v1, Lr91;->θ:I

    .line 948
    .line 949
    new-instance v3, Lrg0;

    .line 950
    .line 951
    invoke-direct {v3, v2}, Lrg0;-><init>(I)V

    .line 952
    .line 953
    .line 954
    sget-object v2, Lrq1;->τ:Lqq1;

    .line 955
    .line 956
    invoke-static {v3, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v11

    .line 960
    iget-object v1, v1, Lr91;->ι:Lq32;

    .line 961
    .line 962
    sget-object v2, Ljx0;->ν:Ln5;

    .line 963
    .line 964
    invoke-static {v1, v2, v0}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v12

    .line 968
    filled-new-array/range {v4 .. v12}, [Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    return-object v0

    .line 977
    :pswitch_1c
    move-object/from16 v0, p1

    .line 978
    .line 979
    check-cast v0, Lwp1;

    .line 980
    .line 981
    move-object/from16 v0, p2

    .line 982
    .line 983
    check-cast v0, Lq72;

    .line 984
    .line 985
    iget-object v0, v0, Lq72;->α:Ljava/lang/String;

    .line 986
    .line 987
    return-object v0

    .line 988
    nop

    .line 989
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
