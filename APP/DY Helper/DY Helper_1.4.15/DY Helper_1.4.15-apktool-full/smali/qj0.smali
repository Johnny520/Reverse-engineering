.class public final synthetic Lqj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lqj0;->ε:I

    .line 2
    .line 3
    iput-boolean p2, p0, Lqj0;->ζ:Z

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
    .locals 6

    .line 1
    iget v0, p0, Lqj0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    const-string p0, "group_apply_auto_approval_cold_start_enabled"

    .line 17
    .line 18
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const-string p0, "group_apply_auto_approval_polling_enabled"

    .line 25
    .line 26
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x1

    .line 33
    :cond_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Landroid/app/Activity;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const-string p0, "im_conversation_delete_entry_enabled"

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 p1, 0x0

    .line 58
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_1
    check-cast p1, Landroid/app/Activity;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 69
    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    sget-object p0, Lbe0;->α:Lbe0;

    .line 73
    .line 74
    invoke-virtual {p0}, Lbe0;->ζ()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    const/4 p0, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/4 p0, 0x0

    .line 83
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_2
    check-cast p1, Landroid/app/Activity;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    const-string p0, "pet_elf_camp_auto_harvest"

    .line 99
    .line 100
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_4

    .line 105
    .line 106
    const-string p0, "pet_elf_camp_auto_plant"

    .line 107
    .line 108
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-nez p0, :cond_4

    .line 113
    .line 114
    const-string p0, "pet_elf_camp_auto_water"

    .line 115
    .line 116
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_5

    .line 121
    .line 122
    :cond_4
    const/4 p1, 0x1

    .line 123
    :cond_5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_3
    check-cast p1, Landroid/app/Activity;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 134
    .line 135
    const/4 p1, 0x0

    .line 136
    if-eqz p0, :cond_7

    .line 137
    .line 138
    const-string p0, "spark_auto_mode"

    .line 139
    .line 140
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    const/4 v0, 0x1

    .line 145
    if-nez p0, :cond_6

    .line 146
    .line 147
    const-string p0, "spark_auto_renew_enabled"

    .line 148
    .line 149
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_6

    .line 154
    .line 155
    const-string p0, "pet_elf_auto_task_enabled"

    .line 156
    .line 157
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_6

    .line 162
    .line 163
    const-string p0, "pet_elf_auto_claim_enabled"

    .line 164
    .line 165
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-nez p0, :cond_6

    .line 170
    .line 171
    const-string p0, "pet_elf_closeness_auto_claim_enabled"

    .line 172
    .line 173
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-nez p0, :cond_6

    .line 178
    .line 179
    const-string p0, "pet_elf_auto_feed_enabled"

    .line 180
    .line 181
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_6

    .line 186
    .line 187
    const-string p0, "pet_elf_auto_success_toast_enabled"

    .line 188
    .line 189
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_6

    .line 194
    .line 195
    const-string p0, "spark_include_group_chat"

    .line 196
    .line 197
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-nez p0, :cond_6

    .line 202
    .line 203
    const-string p0, "spark_custom_renew_enabled"

    .line 204
    .line 205
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-nez p0, :cond_6

    .line 210
    .line 211
    const-string p0, "spark_fake_days_enabled"

    .line 212
    .line 213
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    if-eqz p0, :cond_7

    .line 218
    .line 219
    :cond_6
    move p1, v0

    .line 220
    :cond_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_4
    check-cast p1, Landroid/app/Activity;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 231
    .line 232
    const/4 p1, 0x0

    .line 233
    if-eqz p0, :cond_8

    .line 234
    .line 235
    const-string p0, "idle_auto_exit_enabled"

    .line 236
    .line 237
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-eqz p0, :cond_8

    .line 242
    .line 243
    const/4 p1, 0x1

    .line 244
    :cond_8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_5
    check-cast p1, Landroid/app/Activity;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 255
    .line 256
    const/4 p1, 0x0

    .line 257
    if-eqz p0, :cond_d

    .line 258
    .line 259
    const-string p0, "toptab_discovered_tabs"

    .line 260
    .line 261
    const-string v0, "[]"

    .line 262
    .line 263
    invoke-static {p0, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 268
    .line 269
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    invoke-static {p1, p0}, Lj81;->Σ(II)Lxm0;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    instance-of v1, p0, Ljava/util/Collection;

    .line 281
    .line 282
    const/4 v2, 0x1

    .line 283
    if-eqz v1, :cond_a

    .line 284
    .line 285
    move-object v1, p0

    .line 286
    check-cast v1, Ljava/util/Collection;

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_a

    .line 293
    .line 294
    :cond_9
    move p0, p1

    .line 295
    goto :goto_2

    .line 296
    :cond_a
    invoke-virtual {p0}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    :cond_b
    move-object v1, p0

    .line 301
    check-cast v1, Lwm0;

    .line 302
    .line 303
    iget-boolean v1, v1, Lwm0;->η:Z

    .line 304
    .line 305
    if-eqz v1, :cond_9

    .line 306
    .line 307
    move-object v1, p0

    .line 308
    check-cast v1, Lwm0;

    .line 309
    .line 310
    invoke-virtual {v1}, Lwm0;->nextInt()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-instance v3, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string v4, "toptab_hide_"

    .line 324
    .line 325
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v1, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_b

    .line 340
    .line 341
    move p0, v2

    .line 342
    :goto_2
    const-string v0, "toptab_center_align"

    .line 343
    .line 344
    invoke-static {v0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    const-string v1, "toptab_skip_hidden_page_enabled"

    .line 349
    .line 350
    invoke-static {v1, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 351
    .line 352
    .line 353
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    if-nez p0, :cond_c

    .line 355
    .line 356
    if-nez v0, :cond_c

    .line 357
    .line 358
    if-nez v1, :cond_d

    .line 359
    .line 360
    :cond_c
    move p1, v2

    .line 361
    :catchall_0
    :cond_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    return-object p0

    .line 366
    :pswitch_6
    check-cast p1, Landroid/app/Activity;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 372
    .line 373
    const/4 p1, 0x0

    .line 374
    if-eqz p0, :cond_11

    .line 375
    .line 376
    const-string p0, "clean_mode_enabled"

    .line 377
    .line 378
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    if-nez p0, :cond_10

    .line 383
    .line 384
    const-string p0, "bottom_bar_hidden"

    .line 385
    .line 386
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 387
    .line 388
    .line 389
    move-result p0

    .line 390
    if-nez p0, :cond_10

    .line 391
    .line 392
    const-string p0, "clean_auto_hide"

    .line 393
    .line 394
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    if-nez p0, :cond_10

    .line 399
    .line 400
    const-string p0, "clean_touch_restore_controls"

    .line 401
    .line 402
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    if-nez p0, :cond_10

    .line 407
    .line 408
    const-string p0, "clean_pause_show_bottom_bar"

    .line 409
    .line 410
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    if-nez p0, :cond_10

    .line 415
    .line 416
    sget-object p0, Lbh;->κ:Lrz;

    .line 417
    .line 418
    if-eqz p0, :cond_e

    .line 419
    .line 420
    invoke-virtual {p0}, Lμ;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_e

    .line 425
    .line 426
    goto :goto_3

    .line 427
    :cond_e
    invoke-virtual {p0}, Lχ;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_11

    .line 436
    .line 437
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    check-cast v0, Lbh;

    .line 442
    .line 443
    invoke-static {v0}, Ls1;->π(Lbh;)Lch;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iget-boolean v0, v0, Lch;->α:Z

    .line 448
    .line 449
    if-eqz v0, :cond_f

    .line 450
    .line 451
    :cond_10
    const/4 p1, 0x1

    .line 452
    :cond_11
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :pswitch_7
    check-cast p1, Landroid/app/Activity;

    .line 458
    .line 459
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 463
    .line 464
    const/4 p1, 0x0

    .line 465
    if-eqz p0, :cond_12

    .line 466
    .line 467
    const-string p0, "comment_bookmark_auto_scan_enabled"

    .line 468
    .line 469
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 470
    .line 471
    .line 472
    move-result p0

    .line 473
    if-eqz p0, :cond_12

    .line 474
    .line 475
    const/4 p1, 0x1

    .line 476
    :cond_12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    return-object p0

    .line 481
    :pswitch_8
    check-cast p1, Landroid/app/Activity;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 487
    .line 488
    const/4 p1, 0x0

    .line 489
    if-eqz p0, :cond_13

    .line 490
    .line 491
    const-string p0, "voice_replace_enabled"

    .line 492
    .line 493
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    if-eqz p0, :cond_13

    .line 498
    .line 499
    const/4 p1, 0x1

    .line 500
    :cond_13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    return-object p0

    .line 505
    :pswitch_9
    check-cast p1, Landroid/app/Activity;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 511
    .line 512
    const/4 p1, 0x0

    .line 513
    if-eqz p0, :cond_15

    .line 514
    .line 515
    const-string p0, "hide_tab_familiar"

    .line 516
    .line 517
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    if-nez p0, :cond_14

    .line 522
    .line 523
    const-string p0, "hide_tab_publish"

    .line 524
    .line 525
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 526
    .line 527
    .line 528
    move-result p0

    .line 529
    if-nez p0, :cond_14

    .line 530
    .line 531
    const-string p0, "hide_tab_notification"

    .line 532
    .line 533
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 534
    .line 535
    .line 536
    move-result p0

    .line 537
    if-nez p0, :cond_14

    .line 538
    .line 539
    const-string p0, "hide_tab_profile"

    .line 540
    .line 541
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 542
    .line 543
    .line 544
    move-result p0

    .line 545
    if-nez p0, :cond_14

    .line 546
    .line 547
    const-string p0, "hide_tab_explore"

    .line 548
    .line 549
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    if-nez p0, :cond_14

    .line 554
    .line 555
    const-string p0, "hide_tab_mall"

    .line 556
    .line 557
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 558
    .line 559
    .line 560
    move-result p0

    .line 561
    if-nez p0, :cond_14

    .line 562
    .line 563
    const-string p0, "hide_tab_nearby"

    .line 564
    .line 565
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 566
    .line 567
    .line 568
    move-result p0

    .line 569
    if-eqz p0, :cond_15

    .line 570
    .line 571
    :cond_14
    const/4 p1, 0x1

    .line 572
    :cond_15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    return-object p0

    .line 577
    :pswitch_a
    check-cast p1, Landroid/app/Activity;

    .line 578
    .line 579
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 583
    .line 584
    const/4 p1, 0x0

    .line 585
    if-eqz p0, :cond_17

    .line 586
    .line 587
    const-string p0, "feed_right_dislike_button_enabled"

    .line 588
    .line 589
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 590
    .line 591
    .line 592
    move-result p0

    .line 593
    if-nez p0, :cond_16

    .line 594
    .line 595
    const-string p0, "feed_right_auto_scroll_button_enabled"

    .line 596
    .line 597
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 598
    .line 599
    .line 600
    move-result p0

    .line 601
    if-eqz p0, :cond_17

    .line 602
    .line 603
    :cond_16
    const/4 p1, 0x1

    .line 604
    :cond_17
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    return-object p0

    .line 609
    :pswitch_b
    check-cast p1, Landroid/app/Activity;

    .line 610
    .line 611
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 615
    .line 616
    const/4 p1, 0x0

    .line 617
    if-eqz p0, :cond_18

    .line 618
    .line 619
    const-string p0, "chapter_ad_skip_enabled"

    .line 620
    .line 621
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 622
    .line 623
    .line 624
    move-result p0

    .line 625
    if-eqz p0, :cond_18

    .line 626
    .line 627
    const/4 p1, 0x1

    .line 628
    :cond_18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    return-object p0

    .line 633
    :pswitch_c
    move-object v0, p1

    .line 634
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    const-string p1, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF4518038363F602FB27277D72D3045CBD1C0F1AC2CEC712C69EB23AA4EB3FE0BEAAF173013EA92E0C5"

    .line 640
    .line 641
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    const/4 v4, 0x6

    .line 646
    const/4 v5, 0x0

    .line 647
    const/4 v2, 0x0

    .line 648
    const/4 v3, 0x0

    .line 649
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 650
    .line 651
    .line 652
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 653
    .line 654
    if-eqz p0, :cond_19

    .line 655
    .line 656
    const/4 v4, 0x6

    .line 657
    const/4 v5, 0x0

    .line 658
    const-string v1, "onRefreshInteractiveNoticeEvent"

    .line 659
    .line 660
    const/4 v2, 0x0

    .line 661
    const/4 v3, 0x0

    .line 662
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 663
    .line 664
    .line 665
    :cond_19
    sget-object p0, Ls62;->α:Ls62;

    .line 666
    .line 667
    return-object p0

    .line 668
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 669
    .line 670
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    new-instance v0, Lqj0;

    .line 674
    .line 675
    const/4 v1, 0x5

    .line 676
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 677
    .line 678
    invoke-direct {v0, v1, p0}, Lqj0;-><init>(IZ)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 682
    .line 683
    .line 684
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 685
    .line 686
    return-object p0

    .line 687
    :pswitch_e
    move-object v0, p1

    .line 688
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    const/4 v4, 0x6

    .line 694
    const/4 v5, 0x0

    .line 695
    const-string v1, "int"

    .line 696
    .line 697
    const/4 v2, 0x0

    .line 698
    const/4 v3, 0x0

    .line 699
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 703
    .line 704
    .line 705
    new-instance p1, Lqj0;

    .line 706
    .line 707
    const/4 v1, 0x4

    .line 708
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 709
    .line 710
    invoke-direct {p1, v1, p0}, Lqj0;-><init>(IZ)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethods(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 714
    .line 715
    .line 716
    goto :goto_4

    .line 717
    :pswitch_f
    move-object v0, p1

    .line 718
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 719
    .line 720
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    const/4 v4, 0x6

    .line 724
    const/4 v5, 0x0

    .line 725
    const-string v1, "bolts.Task"

    .line 726
    .line 727
    const/4 v2, 0x0

    .line 728
    const/4 v3, 0x0

    .line 729
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 730
    .line 731
    .line 732
    const-class p1, Ljava/lang/String;

    .line 733
    .line 734
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object p1

    .line 738
    filled-new-array {p1}, [Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p1

    .line 742
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 743
    .line 744
    .line 745
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 746
    .line 747
    if-eqz p0, :cond_1a

    .line 748
    .line 749
    const-string p0, "/aweme/v1/notice/del/"

    .line 750
    .line 751
    filled-new-array {p0}, [Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object p0

    .line 755
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 756
    .line 757
    .line 758
    :cond_1a
    sget-object p0, Ls62;->α:Ls62;

    .line 759
    .line 760
    return-object p0

    .line 761
    :pswitch_10
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 762
    .line 763
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    new-instance v0, Lqj0;

    .line 767
    .line 768
    const/4 v1, 0x2

    .line 769
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 770
    .line 771
    invoke-direct {v0, v1, p0}, Lqj0;-><init>(IZ)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 775
    .line 776
    .line 777
    goto :goto_4

    .line 778
    :pswitch_11
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 779
    .line 780
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    new-instance v0, Lqj0;

    .line 784
    .line 785
    const/4 v1, 0x3

    .line 786
    iget-boolean p0, p0, Lqj0;->ζ:Z

    .line 787
    .line 788
    invoke-direct {v0, v1, p0}, Lqj0;-><init>(IZ)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 792
    .line 793
    .line 794
    goto :goto_4

    .line 795
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
