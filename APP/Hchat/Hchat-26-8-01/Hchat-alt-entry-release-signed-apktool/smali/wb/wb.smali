.class public final synthetic Lwb/wb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/wb;->g:I

    iput-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/wb;->i:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/wb;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/wb;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/wb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/wb;->i:Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "sdk_id"

    .line 17
    .line 18
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-string v1, "enable"

    .line 35
    .line 36
    :goto_1
    iget-object v2, p0, Lwb/wb;->i:Li0/a1;

    .line 37
    .line 38
    iget-object v3, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    invoke-static {v2, p1, v3, v1, v0}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lwb/wb;->i:Li0/a1;

    .line 51
    .line 52
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 56
    .line 57
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v1, "game_emoji_rps_result"

    .line 62
    .line 63
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v1, p0, Lwb/wb;->i:Li0/a1;

    .line 78
    .line 79
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v1, "game_emoji_dice_result"

    .line 89
    .line 90
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const-string v1, "show_region"

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const-string v1, "show_gender"

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const-string v1, "global_prefix_enable"

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    const-string v1, "message_bubble_separate_dark_mode"

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const-string v1, "message_bubble_enable"

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    const-string v1, "fake_mini_program_base_lib_enable"

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const/16 v0, 0xa

    .line 158
    .line 159
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const/16 v1, 0x3c

    .line 164
    .line 165
    const/4 v2, 0x1

    .line 166
    if-eqz v0, :cond_0

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v3, v2, v1}, Lr9/e0;->r(III)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-eqz v3, :cond_0

    .line 181
    .line 182
    move-object p1, v3

    .line 183
    :cond_0
    iget-object v3, p0, Lwb/wb;->i:Li0/a1;

    .line 184
    .line 185
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    if-nez v0, :cond_1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_1
    iget-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 192
    .line 193
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-static {v0, v2, v1}, Lr9/e0;->r(III)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const-string v1, "fake_voice_duration_seconds"

    .line 206
    .line 207
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 212
    .line 213
    .line 214
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 215
    .line 216
    return-object p1

    .line 217
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const-string v1, "fake_voice_duration_enable"

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    const-string v1, "sns_comment_custom_mark_enable"

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    const-string v1, "sns_custom_mark_enable"

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :pswitch_d
    check-cast p1, Ljava/lang/String;

    .line 248
    .line 249
    iget-object v0, p0, Lwb/wb;->i:Li0/a1;

    .line 250
    .line 251
    iget-object v1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 252
    .line 253
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const-string v1, "moments_keyword_block_keywords"

    .line 258
    .line 259
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    const-string v1, "moments_keyword_block_enable"

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    const-string v1, "round_avatar_enable"

    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    const-string v1, "fake_wallet_balance_enable_business"

    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    const-string v1, "fake_wallet_balance_enable_lqt"

    .line 305
    .line 306
    goto/16 :goto_1

    .line 307
    .line 308
    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    const-string v1, "fake_wallet_balance_enable_balance"

    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    const-string v1, "fake_location_enable"

    .line 325
    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    const-string v1, "skip_global_mini_program_splash_ads_enable"

    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    const-string v1, "skip_mini_program_video_ads_enable"

    .line 345
    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    const-string v1, "show_member"

    .line 355
    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    const-string v1, "enable"

    .line 365
    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 369
    .line 370
    iget-object v0, p0, Lwb/wb;->i:Li0/a1;

    .line 371
    .line 372
    iget-object v1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 373
    .line 374
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const-string v1, "chat_time_format"

    .line 379
    .line 380
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_0

    .line 388
    .line 389
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const-string v0, "custom"

    .line 395
    .line 396
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_2

    .line 401
    .line 402
    goto :goto_3

    .line 403
    :cond_2
    const-string v0, "hidden"

    .line 404
    .line 405
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result p1

    .line 409
    if-eqz p1, :cond_3

    .line 410
    .line 411
    goto :goto_3

    .line 412
    :cond_3
    const-string v0, "original"

    .line 413
    .line 414
    :goto_3
    iget-object p1, p0, Lwb/wb;->i:Li0/a1;

    .line 415
    .line 416
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iget-object v0, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 420
    .line 421
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Ljava/lang/String;

    .line 430
    .line 431
    const-string v1, "chat_time_mode"

    .line 432
    .line 433
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    const/16 v0, 0xa

    .line 448
    .line 449
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    const/4 v0, 0x0

    .line 454
    if-eqz p1, :cond_5

    .line 455
    .line 456
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result p1

    .line 460
    const/4 v1, 0x1

    .line 461
    if-ge p1, v1, :cond_4

    .line 462
    .line 463
    move p1, v1

    .line 464
    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    goto :goto_4

    .line 469
    :cond_5
    move-object p1, v0

    .line 470
    :goto_4
    if-eqz p1, :cond_6

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    :cond_6
    if-nez v0, :cond_7

    .line 481
    .line 482
    const-string v0, ""

    .line 483
    .line 484
    :cond_7
    iget-object v1, p0, Lwb/wb;->i:Li0/a1;

    .line 485
    .line 486
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    if-eqz p1, :cond_8

    .line 490
    .line 491
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    iget-object v0, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 496
    .line 497
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const-string v1, "fake_like_auto_select_count"

    .line 502
    .line 503
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 508
    .line 509
    .line 510
    :cond_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 511
    .line 512
    return-object p1

    .line 513
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 514
    .line 515
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    iget-object v1, p0, Lwb/wb;->i:Li0/a1;

    .line 520
    .line 521
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    iget-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 525
    .line 526
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    const-string v1, "fake_like_auto_select"

    .line 531
    .line 532
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 533
    .line 534
    .line 535
    move-result-object p1

    .line 536
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 537
    .line 538
    .line 539
    goto/16 :goto_0

    .line 540
    .line 541
    :pswitch_1c
    check-cast p1, Ljava/lang/Boolean;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    iget-object v1, p0, Lwb/wb;->i:Li0/a1;

    .line 548
    .line 549
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    iget-object p1, p0, Lwb/wb;->h:Landroid/content/SharedPreferences;

    .line 553
    .line 554
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    const-string v1, "fake_like_random_order"

    .line 559
    .line 560
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 565
    .line 566
    .line 567
    goto/16 :goto_0

    .line 568
    .line 569
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
