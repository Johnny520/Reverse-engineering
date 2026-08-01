.class public final synthetic Ldt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldt1;->ε:I

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
    .locals 12

    .line 1
    iget p0, p0, Ldt1;->ε:I

    .line 2
    .line 3
    const-string v0, "host_long_press_speed"

    .line 4
    .line 5
    const/16 v1, 0x64

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    sget-object v3, Ls62;->α:Ls62;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v6, p1

    .line 15
    check-cast v6, Lth0;

    .line 16
    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, v6, Lth0;->α:Ljava/lang/String;

    .line 21
    .line 22
    iget-wide v0, v6, Lth0;->γ:J

    .line 23
    .line 24
    sget-object p1, Lbv1;->α:Lbv1;

    .line 25
    .line 26
    iget-object p1, v6, Lth0;->ζ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p1}, Lbv1;->Δ(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v6}, Lth0;->α()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    iget-object v2, v6, Lth0;->ε:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move-object v9, p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v9, v2

    .line 56
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v3, " # "

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const-wide/16 v4, 0x0

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    cmp-long v3, v0, v4

    .line 78
    .line 79
    if-lez v3, :cond_2

    .line 80
    .line 81
    const-string p0, "UID: "

    .line 82
    .line 83
    invoke-static {v0, v1, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const-string p0, "\u672a\u77e5\u4f1a\u8bdd"

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    move-object p0, v8

    .line 99
    :goto_1
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    cmp-long p0, v0, v4

    .line 103
    .line 104
    if-lez p0, :cond_5

    .line 105
    .line 106
    const-string v3, " UID:"

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const/16 v3, 0x20

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object v4, v6, Lth0;->η:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    if-lez p0, :cond_6

    .line 152
    .line 153
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 161
    .line 162
    invoke-static {p1, p0, p1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    new-instance v5, Llu1;

    .line 167
    .line 168
    invoke-direct/range {v5 .. v11}, Llu1;-><init>(Lth0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    move-object p0, v5

    .line 172
    :goto_2
    return-object p0

    .line 173
    :pswitch_0
    check-cast p1, Landroid/app/Activity;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    const-string p0, "profile_uid_show_enabled"

    .line 179
    .line 180
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-nez p0, :cond_8

    .line 185
    .line 186
    const-string p0, "profile_bookmark_show_enabled"

    .line 187
    .line 188
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-eqz p0, :cond_7

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    move v2, v4

    .line 196
    :cond_8
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_1
    check-cast p1, Landroid/app/Activity;

    .line 202
    .line 203
    const-string p0, "immersive_status_bar_enabled"

    .line 204
    .line 205
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_2
    check-cast p1, Landroid/app/Activity;

    .line 211
    .line 212
    const-string p0, "liquid_glass_bottom_bar_enabled"

    .line 213
    .line 214
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_3
    check-cast p1, Landroid/app/Activity;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    const-string p0, "comment_audio_download_trigger_mode"

    .line 225
    .line 226
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-interface {p1, p0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 231
    .line 232
    .line 233
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    goto :goto_4

    .line 235
    :catchall_0
    move p0, v2

    .line 236
    :goto_4
    if-eq p0, v2, :cond_9

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    move v2, v4

    .line 240
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_4
    check-cast p1, Landroid/app/Activity;

    .line 246
    .line 247
    const-string p0, "comment_image_watermark_enabled"

    .line 248
    .line 249
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :pswitch_5
    check-cast p1, Landroid/app/Activity;

    .line 255
    .line 256
    const-string p0, "precise_time_enabled"

    .line 257
    .line 258
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :pswitch_6
    check-cast p1, Landroid/app/Activity;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const-string p0, "comment_bg_mode"

    .line 269
    .line 270
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-interface {p1, p0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 275
    .line 276
    .line 277
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 278
    goto :goto_6

    .line 279
    :catchall_1
    move p0, v4

    .line 280
    :goto_6
    if-eqz p0, :cond_a

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_a
    move v2, v4

    .line 284
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0

    .line 289
    :pswitch_7
    check-cast p1, Landroid/app/Activity;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    const-string p0, "force_legacy_comment_panel_enabled"

    .line 295
    .line 296
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    if-nez p0, :cond_c

    .line 301
    .line 302
    const-string p0, "hide_comment_input_bar_enabled"

    .line 303
    .line 304
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    if-nez p0, :cond_c

    .line 309
    .line 310
    const-string p0, "hide_comment_related_search_enabled"

    .line 311
    .line 312
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    if-nez p0, :cond_c

    .line 317
    .line 318
    const-string p0, "hide_comment_keyboard_entrance_enabled"

    .line 319
    .line 320
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-nez p0, :cond_c

    .line 325
    .line 326
    const-string p0, "hide_comment_search_entry_enabled"

    .line 327
    .line 328
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    if-eqz p0, :cond_b

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_b
    move v2, v4

    .line 336
    :cond_c
    :goto_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0

    .line 341
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result p0

    .line 347
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 348
    .line 349
    const-string p1, "download_top_notification_alpha"

    .line 350
    .line 351
    invoke-static {p0, v4, v1}, Lj81;->μ(III)I

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 356
    .line 357
    .line 358
    return-object v3

    .line 359
    :pswitch_9
    check-cast p1, Landroid/app/Activity;

    .line 360
    .line 361
    const-string p0, "comment_control_custom_enabled"

    .line 362
    .line 363
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    return-object p0

    .line 368
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    sget-object p1, Lbv1;->α:Lbv1;

    .line 375
    .line 376
    const-string p1, "comment_bg_image_alpha"

    .line 377
    .line 378
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 379
    .line 380
    .line 381
    return-object v3

    .line 382
    :pswitch_b
    check-cast p1, Landroid/app/Activity;

    .line 383
    .line 384
    const-string p0, "live_room_audience_exact_count_enabled"

    .line 385
    .line 386
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    sget-object p1, Lbv1;->α:Lbv1;

    .line 398
    .line 399
    if-ge p0, v2, :cond_d

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_d
    move v2, p0

    .line 403
    :goto_9
    const-string p0, "video_length_alert_minutes"

    .line 404
    .line 405
    invoke-static {p0, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 406
    .line 407
    .line 408
    return-object v3

    .line 409
    :pswitch_d
    check-cast p1, Landroid/app/Activity;

    .line 410
    .line 411
    const-string p0, "feed_follow_confirm_enabled"

    .line 412
    .line 413
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    return-object p0

    .line 418
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    sget-object p1, Lbv1;->α:Lbv1;

    .line 425
    .line 426
    if-ge p0, v2, :cond_e

    .line 427
    .line 428
    goto :goto_a

    .line 429
    :cond_e
    move v2, p0

    .line 430
    :goto_a
    const-string p0, "duration_alert_minutes"

    .line 431
    .line 432
    invoke-static {p0, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 433
    .line 434
    .line 435
    return-object v3

    .line 436
    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    sget-object p1, Lbv1;->α:Lbv1;

    .line 443
    .line 444
    const-string p1, "group_apply_auto_approval_interval_seconds"

    .line 445
    .line 446
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 447
    .line 448
    .line 449
    return-object v3

    .line 450
    :pswitch_10
    check-cast p1, Landroid/app/Activity;

    .line 451
    .line 452
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    sget-object p0, Lbv1;->α:Lbv1;

    .line 456
    .line 457
    invoke-static {}, Lbv1;->ψ()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    if-eqz p1, :cond_f

    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_f
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    :cond_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    if-eqz p1, :cond_11

    .line 477
    .line 478
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    check-cast p1, Lku1;

    .line 483
    .line 484
    iget-object p1, p1, Lku1;->α:Ljava/lang/String;

    .line 485
    .line 486
    const-string v0, "feed_right_control_hide_"

    .line 487
    .line 488
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-static {p1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 493
    .line 494
    .line 495
    move-result p1

    .line 496
    if-eqz p1, :cond_10

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_11
    :goto_b
    move v2, v4

    .line 500
    :goto_c
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    return-object p0

    .line 505
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result p0

    .line 511
    sget-object p1, Lbv1;->α:Lbv1;

    .line 512
    .line 513
    if-ge p0, v2, :cond_12

    .line 514
    .line 515
    goto :goto_d

    .line 516
    :cond_12
    move v2, p0

    .line 517
    :goto_d
    const-string p0, "im_auto_read_interval_minutes"

    .line 518
    .line 519
    invoke-static {p0, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 520
    .line 521
    .line 522
    return-object v3

    .line 523
    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    .line 524
    .line 525
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 526
    .line 527
    .line 528
    move-result p0

    .line 529
    sget-object p1, Lbv1;->α:Lbv1;

    .line 530
    .line 531
    const-string p1, "filter_min_digg"

    .line 532
    .line 533
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 534
    .line 535
    .line 536
    return-object v3

    .line 537
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result p0

    .line 543
    sget-object p1, Lbv1;->α:Lbv1;

    .line 544
    .line 545
    const-string p1, "filter_max_duration_sec"

    .line 546
    .line 547
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 548
    .line 549
    .line 550
    return-object v3

    .line 551
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result p0

    .line 557
    sget-object p1, Lbv1;->α:Lbv1;

    .line 558
    .line 559
    const-string p1, "filter_min_duration_sec"

    .line 560
    .line 561
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 562
    .line 563
    .line 564
    return-object v3

    .line 565
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 566
    .line 567
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result p0

    .line 571
    sget-object p1, Lbv1;->α:Lbv1;

    .line 572
    .line 573
    const/4 p1, 0x5

    .line 574
    invoke-static {p0, v2, p1}, Lj81;->μ(III)I

    .line 575
    .line 576
    .line 577
    move-result p0

    .line 578
    invoke-static {v0, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 579
    .line 580
    .line 581
    return-object v3

    .line 582
    :pswitch_16
    check-cast p1, Landroid/app/Activity;

    .line 583
    .line 584
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    const-string p0, "offline_cache_count_enabled"

    .line 588
    .line 589
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 590
    .line 591
    .line 592
    move-result p0

    .line 593
    const-string p1, "offline_cache_count"

    .line 594
    .line 595
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 600
    .line 601
    .line 602
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 603
    :catchall_2
    const/16 p1, 0xa

    .line 604
    .line 605
    const/16 v0, 0x1f4

    .line 606
    .line 607
    invoke-static {v1, p1, v0}, Lj81;->μ(III)I

    .line 608
    .line 609
    .line 610
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    return-object p0

    .line 615
    :pswitch_17
    check-cast p1, Landroid/app/Activity;

    .line 616
    .line 617
    const-string p0, "feed_enable_preload"

    .line 618
    .line 619
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    return-object p0

    .line 624
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 625
    .line 626
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 627
    .line 628
    .line 629
    move-result p0

    .line 630
    sget-object p1, Lbv1;->α:Lbv1;

    .line 631
    .line 632
    const-string p1, "profile_video_comment_bar_alpha"

    .line 633
    .line 634
    invoke-static {p0, v4, v1}, Lj81;->μ(III)I

    .line 635
    .line 636
    .line 637
    move-result p0

    .line 638
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 639
    .line 640
    .line 641
    return-object v3

    .line 642
    :pswitch_19
    check-cast p1, Ljava/lang/Integer;

    .line 643
    .line 644
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result p0

    .line 648
    sget-object p1, Lbv1;->α:Lbv1;

    .line 649
    .line 650
    const-string p1, "profile_video_search_alpha"

    .line 651
    .line 652
    invoke-static {p0, v4, v1}, Lj81;->μ(III)I

    .line 653
    .line 654
    .line 655
    move-result p0

    .line 656
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 657
    .line 658
    .line 659
    return-object v3

    .line 660
    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    .line 661
    .line 662
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 663
    .line 664
    .line 665
    move-result p0

    .line 666
    sget-object p1, Lbv1;->α:Lbv1;

    .line 667
    .line 668
    const-string p1, "info_bar_text_size"

    .line 669
    .line 670
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 671
    .line 672
    .line 673
    return-object v3

    .line 674
    :pswitch_1b
    check-cast p1, Landroid/app/Activity;

    .line 675
    .line 676
    const-string p0, "feed_double_tap_like_block_enabled"

    .line 677
    .line 678
    invoke-static {p1, p0, v4}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    return-object p0

    .line 683
    :pswitch_1c
    check-cast p1, Landroid/app/Activity;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    const-string p0, "video_speed_hook_enabled"

    .line 689
    .line 690
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 691
    .line 692
    .line 693
    move-result p0

    .line 694
    if-nez p0, :cond_14

    .line 695
    .line 696
    const/4 p0, 0x2

    .line 697
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 698
    .line 699
    .line 700
    move-result-object p1

    .line 701
    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 702
    .line 703
    .line 704
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 705
    goto :goto_e

    .line 706
    :catchall_3
    move p1, p0

    .line 707
    :goto_e
    if-eq p1, p0, :cond_13

    .line 708
    .line 709
    goto :goto_f

    .line 710
    :cond_13
    move v2, v4

    .line 711
    :cond_14
    :goto_f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 712
    .line 713
    .line 714
    move-result-object p0

    .line 715
    return-object p0

    .line 716
    nop

    .line 717
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
