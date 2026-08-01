.class public final synthetic Lct1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lct1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lct1;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lct1;->ε:I

    .line 2
    .line 3
    const-string v1, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Ls62;->α:Ls62;

    .line 9
    .line 10
    iget-object p0, p0, Lct1;->ζ:Landroid/content/Context;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    check-cast p2, Landroid/widget/Switch;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lbv1;->α:Lbv1;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const-string v1, "clean_progress_bar_only_in_clean_mode"

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eq p1, v0, :cond_0

    .line 44
    .line 45
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eq p0, v0, :cond_2

    .line 53
    .line 54
    new-instance p0, Ljg;

    .line 55
    .line 56
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    :goto_0
    return-object v5

    .line 70
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v0, Lbv1;->α:Lbv1;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const-string v1, "clean_progress_bar_restore_alpha_on_pause"

    .line 83
    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eq p1, v0, :cond_3

    .line 91
    .line 92
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eq p0, v0, :cond_5

    .line 100
    .line 101
    new-instance p0, Ljg;

    .line 102
    .line 103
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    :goto_1
    return-object v5

    .line 117
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v0, Lbv1;->α:Lbv1;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const-string v1, "clean_mode_enabled"

    .line 130
    .line 131
    if-nez v0, :cond_7

    .line 132
    .line 133
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eq p1, v0, :cond_6

    .line 138
    .line 139
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eq p0, v0, :cond_8

    .line 147
    .line 148
    new-instance p0, Ljg;

    .line 149
    .line 150
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    :goto_2
    return-object v5

    .line 164
    :pswitch_2
    sget-object v0, Lbv1;->α:Lbv1;

    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const-string v0, "spark_fake_days_enabled"

    .line 170
    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-static {}, Lx9;->θ()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_9

    .line 178
    .line 179
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v4}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_9
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 194
    .line 195
    .line 196
    sget-object p1, Lry1;->α:Lry1;

    .line 197
    .line 198
    sget-object p1, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 201
    .line 202
    .line 203
    sget-object p1, Lry1;->υ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 206
    .line 207
    .line 208
    sget-object p1, Lry1;->Τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 211
    .line 212
    .line 213
    const-string p1, "\u706b\u82b1\u6570\u636e\u5df2\u6e05\u9664\uff0c\u7b49\u5f85\u91cd\u65b0\u6536\u96c6"

    .line 214
    .line 215
    invoke-static {p1}, Lry1;->ю(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const-string p1, "\u8bf7\u8fd4\u56de\u6d88\u606f\u5217\u8868\u5e76\u91cd\u65b0\u8fdb\u5165\u4ee5\u5237\u65b0\u706b\u82b1\u663e\u793a"

    .line 219
    .line 220
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 225
    .line 226
    .line 227
    :goto_3
    return-object v5

    .line 228
    :pswitch_3
    sget-object v0, Lbv1;->α:Lbv1;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    const-string v0, "spark_custom_renew_enabled"

    .line 234
    .line 235
    if-eqz p1, :cond_a

    .line 236
    .line 237
    invoke-static {}, Lx9;->θ()Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-nez v2, :cond_a

    .line 242
    .line 243
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v4}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_a
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 258
    .line 259
    .line 260
    :goto_4
    return-object v5

    .line 261
    :pswitch_4
    sget-object v0, Lbv1;->α:Lbv1;

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    const-string v0, "spark_include_group_chat"

    .line 267
    .line 268
    if-eqz p1, :cond_b

    .line 269
    .line 270
    invoke-static {}, Lx9;->θ()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-nez v2, :cond_b

    .line 275
    .line 276
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v4}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 287
    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_b
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 291
    .line 292
    .line 293
    :goto_5
    return-object v5

    .line 294
    :pswitch_5
    sget-object v0, Lbv1;->α:Lbv1;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    const-string v0, "pet_elf_auto_mutual_message_enabled"

    .line 300
    .line 301
    if-eqz p1, :cond_c

    .line 302
    .line 303
    invoke-static {}, Lx9;->η()Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-nez v3, :cond_c

    .line 308
    .line 309
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 314
    .line 315
    .line 316
    invoke-static {v0, v2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_c
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 324
    .line 325
    .line 326
    :goto_6
    return-object v5

    .line 327
    :pswitch_6
    sget-object v0, Lbv1;->α:Lbv1;

    .line 328
    .line 329
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    const-string v0, "spark_auto_renew_enabled"

    .line 333
    .line 334
    if-eqz p1, :cond_d

    .line 335
    .line 336
    invoke-static {}, Lx9;->θ()Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-nez v2, :cond_d

    .line 341
    .line 342
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 347
    .line 348
    .line 349
    invoke-static {v0, v4}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_d
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 357
    .line 358
    .line 359
    :goto_7
    return-object v5

    .line 360
    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    sget-object v0, Lbv1;->α:Lbv1;

    .line 364
    .line 365
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    const-string v1, "toptab_skip_hidden_page_enabled"

    .line 373
    .line 374
    if-nez v0, :cond_f

    .line 375
    .line 376
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eq p1, v0, :cond_e

    .line 381
    .line 382
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 383
    .line 384
    .line 385
    :cond_e
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 386
    .line 387
    .line 388
    move-result p0

    .line 389
    if-eq p0, v0, :cond_10

    .line 390
    .line 391
    new-instance p0, Ljg;

    .line 392
    .line 393
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_f
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 401
    .line 402
    .line 403
    invoke-static {}, Lv71;->ν()V

    .line 404
    .line 405
    .line 406
    :cond_10
    :goto_8
    return-object v5

    .line 407
    :pswitch_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    const-string v0, "toptab_center_align"

    .line 411
    .line 412
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 413
    .line 414
    .line 415
    return-object v5

    .line 416
    :pswitch_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    sget-object v0, Lbv1;->α:Lbv1;

    .line 420
    .line 421
    const-string v0, "share_panel_enabled"

    .line 422
    .line 423
    invoke-static {p0, v0, p1}, Lbv1;->υ(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 424
    .line 425
    .line 426
    move-result p0

    .line 427
    if-nez p0, :cond_11

    .line 428
    .line 429
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 430
    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_11
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 434
    .line 435
    .line 436
    :goto_9
    return-object v5

    .line 437
    :pswitch_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    sget-object v0, Lbv1;->α:Lbv1;

    .line 441
    .line 442
    const-string v0, "volume_key_enabled"

    .line 443
    .line 444
    invoke-static {p0, v0, p1}, Lbv1;->υ(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 445
    .line 446
    .line 447
    move-result p0

    .line 448
    if-nez p0, :cond_12

    .line 449
    .line 450
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 451
    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_12
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 455
    .line 456
    .line 457
    :goto_a
    return-object v5

    .line 458
    :pswitch_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    const-string v0, "feed_right_auto_scroll_button_enabled"

    .line 462
    .line 463
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 464
    .line 465
    .line 466
    return-object v5

    .line 467
    :pswitch_c
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    const-string v0, "feed_right_dislike_button_enabled"

    .line 471
    .line 472
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 473
    .line 474
    .line 475
    return-object v5

    .line 476
    :pswitch_d
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const-string v0, "voice_replace_confirm_before_send"

    .line 480
    .line 481
    invoke-static {p0, v0, p1, p2, v2}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 482
    .line 483
    .line 484
    return-object v5

    .line 485
    :pswitch_e
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    const-string v0, "voice_replace_enabled"

    .line 489
    .line 490
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 491
    .line 492
    .line 493
    return-object v5

    .line 494
    :pswitch_f
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    const-string v0, "idle_exit_show_countdown"

    .line 498
    .line 499
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 500
    .line 501
    .line 502
    return-object v5

    .line 503
    :pswitch_10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    const-string v0, "idle_exit_lock_screen"

    .line 507
    .line 508
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 509
    .line 510
    .line 511
    return-object v5

    .line 512
    :pswitch_11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    const-string v0, "idle_auto_exit_enabled"

    .line 516
    .line 517
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 518
    .line 519
    .line 520
    return-object v5

    .line 521
    :pswitch_12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    const-string v0, "comment_bookmark_auto_scan_enabled"

    .line 525
    .line 526
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 527
    .line 528
    .line 529
    return-object v5

    .line 530
    :pswitch_13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    sget-object v0, Lbv1;->α:Lbv1;

    .line 534
    .line 535
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    const-string v1, "clean_progress_bar_enabled"

    .line 543
    .line 544
    if-nez v0, :cond_14

    .line 545
    .line 546
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-eq p1, v0, :cond_13

    .line 551
    .line 552
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 553
    .line 554
    .line 555
    :cond_13
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 556
    .line 557
    .line 558
    move-result p0

    .line 559
    if-eq p0, v0, :cond_15

    .line 560
    .line 561
    new-instance p0, Ljg;

    .line 562
    .line 563
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 567
    .line 568
    .line 569
    goto :goto_b

    .line 570
    :cond_14
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 571
    .line 572
    .line 573
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :cond_15
    :goto_b
    return-object v5

    .line 577
    :pswitch_14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    sget-object v0, Lbv1;->α:Lbv1;

    .line 581
    .line 582
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    const-string v1, "clean_pause_show_bottom_bar"

    .line 590
    .line 591
    if-nez v0, :cond_17

    .line 592
    .line 593
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eq p1, v0, :cond_16

    .line 598
    .line 599
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 600
    .line 601
    .line 602
    :cond_16
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 603
    .line 604
    .line 605
    move-result p0

    .line 606
    if-eq p0, v0, :cond_18

    .line 607
    .line 608
    new-instance p0, Ljg;

    .line 609
    .line 610
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 614
    .line 615
    .line 616
    goto :goto_c

    .line 617
    :cond_17
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 618
    .line 619
    .line 620
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :cond_18
    :goto_c
    return-object v5

    .line 624
    :pswitch_15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    sget-object v0, Lbv1;->α:Lbv1;

    .line 628
    .line 629
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    const-string v1, "clean_touch_restore_controls"

    .line 637
    .line 638
    if-nez v0, :cond_1a

    .line 639
    .line 640
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-eq p1, v0, :cond_19

    .line 645
    .line 646
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 647
    .line 648
    .line 649
    :cond_19
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 650
    .line 651
    .line 652
    move-result p0

    .line 653
    if-eq p0, v0, :cond_1b

    .line 654
    .line 655
    new-instance p0, Ljg;

    .line 656
    .line 657
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 661
    .line 662
    .line 663
    goto :goto_d

    .line 664
    :cond_1a
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 665
    .line 666
    .line 667
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    :cond_1b
    :goto_d
    return-object v5

    .line 671
    :pswitch_16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    sget-object v0, Lbv1;->α:Lbv1;

    .line 675
    .line 676
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 680
    .line 681
    .line 682
    move-result v0

    .line 683
    const-string v1, "clean_auto_hide"

    .line 684
    .line 685
    if-nez v0, :cond_1d

    .line 686
    .line 687
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eq p1, v0, :cond_1c

    .line 692
    .line 693
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 694
    .line 695
    .line 696
    :cond_1c
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 697
    .line 698
    .line 699
    move-result p0

    .line 700
    if-eq p0, v0, :cond_1e

    .line 701
    .line 702
    new-instance p0, Ljg;

    .line 703
    .line 704
    invoke-direct {p0, p2, v0, v3}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 708
    .line 709
    .line 710
    goto :goto_e

    .line 711
    :cond_1d
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 712
    .line 713
    .line 714
    invoke-static {v1}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    :cond_1e
    :goto_e
    return-object v5

    .line 718
    :pswitch_17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    const-string v0, "hide_tab_publish"

    .line 722
    .line 723
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 724
    .line 725
    .line 726
    return-object v5

    .line 727
    :pswitch_18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    const-string v0, "bottom_bar_hide_badge"

    .line 731
    .line 732
    invoke-static {p0, v0, p1, p2, v4}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 733
    .line 734
    .line 735
    return-object v5

    .line 736
    :pswitch_19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    const-string v0, "bottom_bar_show_text"

    .line 740
    .line 741
    invoke-static {p0, v0, p1, p2, v2}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 742
    .line 743
    .line 744
    return-object v5

    .line 745
    :pswitch_data_0
    .packed-switch 0x0
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
