.class public final synthetic Lwb/k9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/k9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/k9;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/k9;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 13
    iput p4, p0, Lwb/k9;->g:I

    iput-object p1, p0, Lwb/k9;->i:Li0/a1;

    iput-object p2, p0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lwb/k9;->j:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/k9;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Lwb/uq;

    .line 9
    .line 10
    iget-object v2, v0, Lwb/k9;->i:Li0/a1;

    .line 11
    .line 12
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v4, 0x1

    .line 33
    add-int/2addr v2, v4

    .line 34
    iget-object v5, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    const-string v6, "hb_reply_enable"

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    const-string v6, "hb_reply_type"

    .line 46
    .line 47
    invoke-interface {v5, v6, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v6, v7

    .line 53
    :goto_0
    invoke-static {v5}, Lwb/ho;->d6(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v34

    .line 57
    invoke-static/range {v34 .. v34}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Lna/h;

    .line 62
    .line 63
    invoke-static {v6}, Lwb/ho;->K6(I)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    const-string v10, ""

    .line 68
    .line 69
    if-eqz v9, :cond_2

    .line 70
    .line 71
    const-string v9, "hb_reply_text"

    .line 72
    .line 73
    const-string v11, "\u8c22\u8c22\u8001\u677f"

    .line 74
    .line 75
    invoke-interface {v5, v9, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    if-eqz v9, :cond_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move-object v9, v11

    .line 83
    :goto_1
    const-string v12, "hb_reply_templates"

    .line 84
    .line 85
    invoke-interface {v5, v12, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    if-eqz v9, :cond_4

    .line 90
    .line 91
    move-object v11, v9

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const-string v9, "hb_reply_media_paths"

    .line 94
    .line 95
    invoke-interface {v5, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    if-eqz v11, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move-object v11, v10

    .line 103
    :cond_4
    :goto_2
    new-instance v9, Lna/j;

    .line 104
    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    new-instance v14, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v12, "_"

    .line 118
    .line 119
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    const-string v13, "\u6a21\u677f "

    .line 130
    .line 131
    invoke-static {v2, v13}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const-string v13, "hb_grab_mode"

    .line 136
    .line 137
    invoke-interface {v5, v13, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    move-object v14, v9

    .line 142
    move-object v9, v12

    .line 143
    move v12, v13

    .line 144
    invoke-static {v5}, Lwb/ho;->E6(Landroid/content/SharedPreferences;)I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    const-string v15, "hb_auto_delay_value"

    .line 149
    .line 150
    invoke-interface {v5, v15, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    if-gez v15, :cond_5

    .line 155
    .line 156
    move v15, v7

    .line 157
    :cond_5
    move-object/from16 v16, v2

    .line 158
    .line 159
    const-string v2, "hb_auto_delay_unit"

    .line 160
    .line 161
    invoke-interface {v5, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    move-object/from16 v17, v8

    .line 166
    .line 167
    int-to-long v7, v15

    .line 168
    if-ne v2, v4, :cond_6

    .line 169
    .line 170
    const-wide/16 v18, 0x3e8

    .line 171
    .line 172
    mul-long v7, v7, v18

    .line 173
    .line 174
    :cond_6
    const-string v15, "hb_auto_delay_random_min"

    .line 175
    .line 176
    const/16 v2, 0x1f4

    .line 177
    .line 178
    invoke-interface {v5, v15, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-gez v2, :cond_7

    .line 183
    .line 184
    const/4 v2, 0x0

    .line 185
    :cond_7
    move-object/from16 v19, v5

    .line 186
    .line 187
    int-to-long v4, v2

    .line 188
    const-string v2, "hb_auto_delay_random_max"

    .line 189
    .line 190
    const/16 v15, 0xbb8

    .line 191
    .line 192
    move-wide/from16 v21, v4

    .line 193
    .line 194
    move-object/from16 v4, v19

    .line 195
    .line 196
    invoke-interface {v4, v2, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-gez v2, :cond_8

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    :cond_8
    move-wide/from16 v23, v7

    .line 204
    .line 205
    int-to-long v7, v2

    .line 206
    const-string v2, "hb_skip_self"

    .line 207
    .line 208
    const/4 v5, 0x0

    .line 209
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    const-string v2, "hb_kw_mode"

    .line 214
    .line 215
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 216
    .line 217
    .line 218
    move-result v18

    .line 219
    const-string v5, "hb_keywords"

    .line 220
    .line 221
    invoke-interface {v4, v5, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    if-eqz v5, :cond_9

    .line 226
    .line 227
    move-object/from16 v25, v5

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_9
    move-object/from16 v25, v10

    .line 231
    .line 232
    :goto_3
    if-eqz v17, :cond_a

    .line 233
    .line 234
    move-object/from16 v5, v17

    .line 235
    .line 236
    iget v2, v5, Lna/h;->b:I

    .line 237
    .line 238
    move/from16 v29, v2

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_a
    move-object/from16 v5, v17

    .line 242
    .line 243
    const/4 v2, 0x2

    .line 244
    if-ne v6, v2, :cond_b

    .line 245
    .line 246
    const/16 v20, 0x1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_b
    move/from16 v20, v6

    .line 250
    .line 251
    :goto_4
    move/from16 v29, v20

    .line 252
    .line 253
    :goto_5
    if-eqz v5, :cond_c

    .line 254
    .line 255
    iget-object v2, v5, Lna/h;->c:Ljava/lang/String;

    .line 256
    .line 257
    if-eqz v2, :cond_c

    .line 258
    .line 259
    :goto_6
    move-object/from16 v30, v2

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_c
    invoke-static {v6, v11}, Lwb/ho;->s6(ILjava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    goto :goto_6

    .line 267
    :goto_7
    move-wide/from16 v19, v7

    .line 268
    .line 269
    if-eqz v5, :cond_d

    .line 270
    .line 271
    iget-wide v6, v5, Lna/h;->d:J

    .line 272
    .line 273
    :goto_8
    move-wide/from16 v31, v6

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_d
    invoke-static {v4}, Lwb/ho;->H6(Landroid/content/SharedPreferences;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v6

    .line 280
    goto :goto_8

    .line 281
    :goto_9
    if-eqz v5, :cond_e

    .line 282
    .line 283
    iget-boolean v2, v5, Lna/h;->e:Z

    .line 284
    .line 285
    const/4 v5, 0x0

    .line 286
    :goto_a
    move/from16 v33, v2

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_e
    const-string v2, "hb_reply_random"

    .line 290
    .line 291
    const/4 v5, 0x0

    .line 292
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    goto :goto_a

    .line 297
    :goto_b
    invoke-static {v4}, Lwb/ho;->c6(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v35

    .line 301
    const-string v2, "hb_notify_system_enable"

    .line 302
    .line 303
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 304
    .line 305
    .line 306
    move-result v37

    .line 307
    const-string v2, "hb_notify_toast_enable"

    .line 308
    .line 309
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 310
    .line 311
    .line 312
    move-result v38

    .line 313
    const-string v2, "hb_notify_sound_enable"

    .line 314
    .line 315
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 316
    .line 317
    .line 318
    move-result v39

    .line 319
    const-string v2, "hb_notify_sound_mode"

    .line 320
    .line 321
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 322
    .line 323
    .line 324
    move-result v40

    .line 325
    const-string v2, "hb_notify_vibrate_enable"

    .line 326
    .line 327
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v41

    .line 331
    const-string v5, "hb_notify_sound_uri"

    .line 332
    .line 333
    invoke-interface {v4, v5, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    if-eqz v5, :cond_f

    .line 338
    .line 339
    move-object/from16 v42, v5

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_f
    move-object/from16 v42, v10

    .line 343
    .line 344
    :goto_c
    const-string v5, "hb_notify_text"

    .line 345
    .line 346
    const-string v6, "\u62a2\u5230\u7ea2\u5305 {amount} \u5143"

    .line 347
    .line 348
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    if-eqz v7, :cond_10

    .line 353
    .line 354
    move-object/from16 v43, v7

    .line 355
    .line 356
    goto :goto_d

    .line 357
    :cond_10
    move-object/from16 v43, v6

    .line 358
    .line 359
    :goto_d
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    if-eqz v5, :cond_11

    .line 364
    .line 365
    goto :goto_e

    .line 366
    :cond_11
    move-object v5, v6

    .line 367
    :goto_e
    const-string v7, "hb_notify_toast_text"

    .line 368
    .line 369
    invoke-interface {v4, v7, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    if-eqz v5, :cond_12

    .line 374
    .line 375
    move-object/from16 v44, v5

    .line 376
    .line 377
    goto :goto_f

    .line 378
    :cond_12
    move-object/from16 v44, v6

    .line 379
    .line 380
    :goto_f
    const-string v5, "hb_notify_failed_system_enable"

    .line 381
    .line 382
    const/4 v2, 0x0

    .line 383
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v45

    .line 387
    const-string v5, "hb_notify_failed_toast_enable"

    .line 388
    .line 389
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 390
    .line 391
    .line 392
    move-result v46

    .line 393
    const-string v5, "hb_notify_failed_text"

    .line 394
    .line 395
    const-string v7, "\u672a\u62a2\u5230\u7ea2\u5305"

    .line 396
    .line 397
    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    if-eqz v8, :cond_13

    .line 402
    .line 403
    move-object/from16 v47, v8

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_13
    move-object/from16 v47, v7

    .line 407
    .line 408
    :goto_10
    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    if-eqz v5, :cond_14

    .line 413
    .line 414
    goto :goto_11

    .line 415
    :cond_14
    move-object v5, v7

    .line 416
    :goto_11
    const-string v8, "hb_notify_failed_toast_text"

    .line 417
    .line 418
    invoke-interface {v4, v8, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    if-eqz v5, :cond_15

    .line 423
    .line 424
    move-object/from16 v48, v5

    .line 425
    .line 426
    goto :goto_12

    .line 427
    :cond_15
    move-object/from16 v48, v7

    .line 428
    .line 429
    :goto_12
    const-string v5, "hb_announce_enable"

    .line 430
    .line 431
    const/4 v2, 0x0

    .line 432
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 433
    .line 434
    .line 435
    move-result v49

    .line 436
    const-string v5, "hb_announce_text"

    .line 437
    .line 438
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    if-eqz v4, :cond_16

    .line 443
    .line 444
    move-object/from16 v50, v4

    .line 445
    .line 446
    goto :goto_13

    .line 447
    :cond_16
    move-object/from16 v50, v6

    .line 448
    .line 449
    :goto_13
    const/4 v11, 0x0

    .line 450
    move-object/from16 v10, v16

    .line 451
    .line 452
    move-wide/from16 v16, v21

    .line 453
    .line 454
    const/16 v21, 0x0

    .line 455
    .line 456
    const-string v22, ""

    .line 457
    .line 458
    move-object v8, v14

    .line 459
    move-wide/from16 v52, v19

    .line 460
    .line 461
    move/from16 v20, v15

    .line 462
    .line 463
    move-wide/from16 v14, v23

    .line 464
    .line 465
    move/from16 v24, v18

    .line 466
    .line 467
    move-wide/from16 v18, v52

    .line 468
    .line 469
    const-string v23, ""

    .line 470
    .line 471
    const/16 v26, 0x0

    .line 472
    .line 473
    const/16 v27, 0x0

    .line 474
    .line 475
    const/16 v28, 0x0

    .line 476
    .line 477
    const/16 v36, 0x1

    .line 478
    .line 479
    invoke-direct/range {v8 .. v50}, Lna/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZIIJJJZILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/String;JZLjava/util/List;Ljava/util/List;ZZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 480
    .line 481
    .line 482
    const/4 v2, 0x0

    .line 483
    invoke-direct {v1, v3, v8, v2}, Lwb/uq;-><init>(ILna/j;Z)V

    .line 484
    .line 485
    .line 486
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 487
    .line 488
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :goto_14
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_0
    new-instance v2, Lwb/v0;

    .line 495
    .line 496
    iget-object v1, v0, Lwb/k9;->i:Li0/a1;

    .line 497
    .line 498
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    move-object v6, v3

    .line 503
    check-cast v6, Ljava/lang/String;

    .line 504
    .line 505
    new-instance v7, Lwb/di;

    .line 506
    .line 507
    const/16 v3, 0x12

    .line 508
    .line 509
    iget-object v4, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 510
    .line 511
    invoke-direct {v7, v4, v1, v3}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 512
    .line 513
    .line 514
    const/4 v8, 0x0

    .line 515
    const/16 v9, 0xe0

    .line 516
    .line 517
    const-string v3, "\u9009\u62e9\u76d1\u542c\u7fa4"

    .line 518
    .line 519
    sget-object v4, Lwb/u0;->h:Lwb/u0;

    .line 520
    .line 521
    const/4 v5, 0x1

    .line 522
    invoke-direct/range {v2 .. v9}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v0, Lwb/k9;->j:Li0/a1;

    .line 526
    .line 527
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    goto :goto_14

    .line 531
    :pswitch_1
    new-instance v1, Lwb/c4;

    .line 532
    .line 533
    iget-object v2, v0, Lwb/k9;->i:Li0/a1;

    .line 534
    .line 535
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    check-cast v3, Ljava/util/List;

    .line 540
    .line 541
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    check-cast v2, Ljava/util/List;

    .line 550
    .line 551
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    const/4 v4, 0x1

    .line 556
    add-int/2addr v2, v4

    .line 557
    new-instance v5, Lo9/q;

    .line 558
    .line 559
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 560
    .line 561
    .line 562
    move-result-wide v6

    .line 563
    new-instance v8, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    const-string v6, "_"

    .line 572
    .line 573
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    const-string v7, "\u6a21\u677f "

    .line 584
    .line 585
    invoke-static {v2, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    const-string v2, "group_member_reply_join_enable"

    .line 590
    .line 591
    iget-object v8, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 592
    .line 593
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 594
    .line 595
    .line 596
    move-result v9

    .line 597
    const-string v2, "group_member_reply_left_enable"

    .line 598
    .line 599
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 600
    .line 601
    .line 602
    move-result v10

    .line 603
    const-string v2, "group_member_reply_prompt_type"

    .line 604
    .line 605
    const-string v4, "text"

    .line 606
    .line 607
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    if-eqz v2, :cond_17

    .line 612
    .line 613
    move-object v11, v2

    .line 614
    goto :goto_15

    .line 615
    :cond_17
    move-object v11, v4

    .line 616
    :goto_15
    const-string v2, "group_member_reply_both_order"

    .line 617
    .line 618
    const-string v4, "text_first"

    .line 619
    .line 620
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    if-eqz v2, :cond_18

    .line 625
    .line 626
    move-object v12, v2

    .line 627
    goto :goto_16

    .line 628
    :cond_18
    move-object v12, v4

    .line 629
    :goto_16
    const-string v2, "group_member_reply_join_text"

    .line 630
    .line 631
    const-string v4, "[AtWx=%userWxid%]\n\u6b22\u8fce\u8fdb\u7fa4\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u8fdb\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u8fdb\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u8fdb\u7fa4\u8005ID\uff1a%userWxid%"

    .line 632
    .line 633
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    if-eqz v2, :cond_19

    .line 638
    .line 639
    move-object v13, v2

    .line 640
    goto :goto_17

    .line 641
    :cond_19
    move-object v13, v4

    .line 642
    :goto_17
    const-string v2, "group_member_reply_left_text"

    .line 643
    .line 644
    const-string v4, "\u9000\u7fa4\u901a\u77e5\uff1a\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u9000\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u9000\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u9000\u7fa4\u8005ID\uff1a%userWxid%"

    .line 645
    .line 646
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    if-eqz v2, :cond_1a

    .line 651
    .line 652
    move-object v14, v2

    .line 653
    goto :goto_18

    .line 654
    :cond_1a
    move-object v14, v4

    .line 655
    :goto_18
    const-string v2, "group_member_reply_join_card_title"

    .line 656
    .line 657
    const-string v4, "\u6b22\u8fce\uff1a%userName%"

    .line 658
    .line 659
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    if-eqz v2, :cond_1b

    .line 664
    .line 665
    move-object v15, v2

    .line 666
    goto :goto_19

    .line 667
    :cond_1b
    move-object v15, v4

    .line 668
    :goto_19
    const-string v2, "group_member_reply_join_card_desc"

    .line 669
    .line 670
    const-string v4, "ID\uff1a%userWxid%\n\u540d\u7247\uff1a%groupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 671
    .line 672
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    if-eqz v2, :cond_1c

    .line 677
    .line 678
    move-object/from16 v16, v2

    .line 679
    .line 680
    goto :goto_1a

    .line 681
    :cond_1c
    move-object/from16 v16, v4

    .line 682
    .line 683
    :goto_1a
    const-string v2, "group_member_reply_left_card_title"

    .line 684
    .line 685
    move-object/from16 v17, v5

    .line 686
    .line 687
    const-string v5, "\u79bb\u7fa4\uff1a%userName%"

    .line 688
    .line 689
    invoke-interface {v8, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    if-eqz v2, :cond_1d

    .line 694
    .line 695
    move-object v5, v2

    .line 696
    :cond_1d
    const-string v2, "group_member_reply_left_card_desc"

    .line 697
    .line 698
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    if-eqz v2, :cond_1e

    .line 703
    .line 704
    move-object/from16 v18, v2

    .line 705
    .line 706
    goto :goto_1b

    .line 707
    :cond_1e
    move-object/from16 v18, v4

    .line 708
    .line 709
    :goto_1b
    const-string v2, "group_member_reply_media_order"

    .line 710
    .line 711
    const-string v4, "none"

    .line 712
    .line 713
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    if-eqz v2, :cond_1f

    .line 718
    .line 719
    move-object/from16 v20, v2

    .line 720
    .line 721
    goto :goto_1c

    .line 722
    :cond_1f
    move-object/from16 v20, v4

    .line 723
    .line 724
    :goto_1c
    const-string v2, "group_member_reply_media_sequence"

    .line 725
    .line 726
    const-string v4, "image,voice,emoji,video,file,favorite"

    .line 727
    .line 728
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    if-eqz v2, :cond_20

    .line 733
    .line 734
    move-object/from16 v21, v2

    .line 735
    .line 736
    goto :goto_1d

    .line 737
    :cond_20
    move-object/from16 v21, v4

    .line 738
    .line 739
    :goto_1d
    const-string v2, "group_member_reply_join_image_paths"

    .line 740
    .line 741
    const-string v4, ""

    .line 742
    .line 743
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    if-nez v2, :cond_21

    .line 748
    .line 749
    move-object/from16 v22, v4

    .line 750
    .line 751
    goto :goto_1e

    .line 752
    :cond_21
    move-object/from16 v22, v2

    .line 753
    .line 754
    :goto_1e
    const-string v2, "group_member_reply_left_image_paths"

    .line 755
    .line 756
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    if-nez v2, :cond_22

    .line 761
    .line 762
    move-object/from16 v23, v4

    .line 763
    .line 764
    goto :goto_1f

    .line 765
    :cond_22
    move-object/from16 v23, v2

    .line 766
    .line 767
    :goto_1f
    const-string v2, "group_member_reply_join_voice_paths"

    .line 768
    .line 769
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    if-nez v2, :cond_23

    .line 774
    .line 775
    move-object/from16 v24, v4

    .line 776
    .line 777
    goto :goto_20

    .line 778
    :cond_23
    move-object/from16 v24, v2

    .line 779
    .line 780
    :goto_20
    const-string v2, "group_member_reply_left_voice_paths"

    .line 781
    .line 782
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    if-nez v2, :cond_24

    .line 787
    .line 788
    move-object/from16 v25, v4

    .line 789
    .line 790
    goto :goto_21

    .line 791
    :cond_24
    move-object/from16 v25, v2

    .line 792
    .line 793
    :goto_21
    const-string v2, "group_member_reply_join_emoji_paths"

    .line 794
    .line 795
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    if-nez v2, :cond_25

    .line 800
    .line 801
    move-object/from16 v26, v4

    .line 802
    .line 803
    goto :goto_22

    .line 804
    :cond_25
    move-object/from16 v26, v2

    .line 805
    .line 806
    :goto_22
    const-string v2, "group_member_reply_left_emoji_paths"

    .line 807
    .line 808
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    if-nez v2, :cond_26

    .line 813
    .line 814
    move-object/from16 v27, v4

    .line 815
    .line 816
    goto :goto_23

    .line 817
    :cond_26
    move-object/from16 v27, v2

    .line 818
    .line 819
    :goto_23
    const-string v2, "group_member_reply_join_video_paths"

    .line 820
    .line 821
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    if-nez v2, :cond_27

    .line 826
    .line 827
    move-object/from16 v28, v4

    .line 828
    .line 829
    goto :goto_24

    .line 830
    :cond_27
    move-object/from16 v28, v2

    .line 831
    .line 832
    :goto_24
    const-string v2, "group_member_reply_left_video_paths"

    .line 833
    .line 834
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    if-nez v2, :cond_28

    .line 839
    .line 840
    move-object/from16 v29, v4

    .line 841
    .line 842
    goto :goto_25

    .line 843
    :cond_28
    move-object/from16 v29, v2

    .line 844
    .line 845
    :goto_25
    const-string v2, "group_member_reply_join_file_paths"

    .line 846
    .line 847
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    if-nez v2, :cond_29

    .line 852
    .line 853
    move-object/from16 v30, v4

    .line 854
    .line 855
    goto :goto_26

    .line 856
    :cond_29
    move-object/from16 v30, v2

    .line 857
    .line 858
    :goto_26
    const-string v2, "group_member_reply_left_file_paths"

    .line 859
    .line 860
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    if-nez v2, :cond_2a

    .line 865
    .line 866
    move-object/from16 v31, v4

    .line 867
    .line 868
    goto :goto_27

    .line 869
    :cond_2a
    move-object/from16 v31, v2

    .line 870
    .line 871
    :goto_27
    const-string v2, "group_member_reply_join_favorite_paths"

    .line 872
    .line 873
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    if-nez v2, :cond_2b

    .line 878
    .line 879
    move-object/from16 v32, v4

    .line 880
    .line 881
    goto :goto_28

    .line 882
    :cond_2b
    move-object/from16 v32, v2

    .line 883
    .line 884
    :goto_28
    const-string v2, "group_member_reply_left_favorite_paths"

    .line 885
    .line 886
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    if-nez v2, :cond_2c

    .line 891
    .line 892
    move-object/from16 v33, v4

    .line 893
    .line 894
    goto :goto_29

    .line 895
    :cond_2c
    move-object/from16 v33, v2

    .line 896
    .line 897
    :goto_29
    const-string v2, "group_member_reply_prompt_delay_ms"

    .line 898
    .line 899
    const/4 v4, 0x0

    .line 900
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 901
    .line 902
    .line 903
    move-result v35

    .line 904
    const-string v2, "group_member_reply_image_delay_ms"

    .line 905
    .line 906
    const/16 v4, 0x64

    .line 907
    .line 908
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 909
    .line 910
    .line 911
    move-result v36

    .line 912
    const-string v2, "group_member_reply_voice_delay_ms"

    .line 913
    .line 914
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 915
    .line 916
    .line 917
    move-result v37

    .line 918
    const-string v2, "group_member_reply_emoji_delay_ms"

    .line 919
    .line 920
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 921
    .line 922
    .line 923
    move-result v38

    .line 924
    const-string v2, "group_member_reply_video_delay_ms"

    .line 925
    .line 926
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 927
    .line 928
    .line 929
    move-result v39

    .line 930
    const-string v2, "group_member_reply_file_delay_ms"

    .line 931
    .line 932
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 933
    .line 934
    .line 935
    move-result v40

    .line 936
    const-string v2, "group_member_reply_favorite_delay_ms"

    .line 937
    .line 938
    invoke-interface {v8, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 939
    .line 940
    .line 941
    move-result v41

    .line 942
    const/4 v8, 0x1

    .line 943
    const-string v19, "custom"

    .line 944
    .line 945
    const-string v34, "custom"

    .line 946
    .line 947
    move-object/from16 v52, v17

    .line 948
    .line 949
    move-object/from16 v17, v5

    .line 950
    .line 951
    move-object/from16 v5, v52

    .line 952
    .line 953
    invoke-direct/range {v5 .. v41}, Lo9/q;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIII)V

    .line 954
    .line 955
    .line 956
    const/4 v2, 0x0

    .line 957
    invoke-direct {v1, v3, v5, v2}, Lwb/c4;-><init>(ILo9/q;Z)V

    .line 958
    .line 959
    .line 960
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 961
    .line 962
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    goto/16 :goto_14

    .line 966
    .line 967
    :pswitch_2
    new-instance v1, Lwb/nu;

    .line 968
    .line 969
    iget-object v2, v0, Lwb/k9;->i:Li0/a1;

    .line 970
    .line 971
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v3

    .line 975
    check-cast v3, Ljava/util/List;

    .line 976
    .line 977
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    check-cast v2, Ljava/util/List;

    .line 986
    .line 987
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    const/4 v4, 0x1

    .line 992
    add-int/2addr v2, v4

    .line 993
    const-string v5, "transfer_delay_random_min"

    .line 994
    .line 995
    const-wide/16 v6, 0x1f4

    .line 996
    .line 997
    iget-object v8, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 998
    .line 999
    invoke-interface {v8, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 1000
    .line 1001
    .line 1002
    move-result-wide v9

    .line 1003
    const-wide/16 v11, 0x0

    .line 1004
    .line 1005
    const-wide/32 v13, 0x927c0

    .line 1006
    .line 1007
    .line 1008
    invoke-static/range {v9 .. v14}, Lr9/e0;->s(JJJ)J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v17

    .line 1012
    const-string v5, "transfer_delay_random_max"

    .line 1013
    .line 1014
    const-wide/16 v6, 0xbb8

    .line 1015
    .line 1016
    invoke-interface {v8, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 1017
    .line 1018
    .line 1019
    move-result-wide v15

    .line 1020
    const-wide/32 v19, 0x927c0

    .line 1021
    .line 1022
    .line 1023
    invoke-static/range {v15 .. v20}, Lr9/e0;->s(JJJ)J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v24

    .line 1027
    new-instance v15, Lua/i;

    .line 1028
    .line 1029
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1030
    .line 1031
    .line 1032
    move-result-wide v5

    .line 1033
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    const-string v9, "transfer_"

    .line 1036
    .line 1037
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    const-string v5, "_"

    .line 1044
    .line 1045
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v16

    .line 1055
    const-string v5, "\u6536\u6b3e\u6a21\u677f "

    .line 1056
    .line 1057
    invoke-static {v2, v5}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v2

    .line 1061
    const-string v5, "transfer_delay_mode"

    .line 1062
    .line 1063
    const/4 v6, 0x2

    .line 1064
    invoke-interface {v8, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1065
    .line 1066
    .line 1067
    move-result v19

    .line 1068
    const-string v5, "transfer_delay_ms"

    .line 1069
    .line 1070
    const-wide/16 v6, 0x0

    .line 1071
    .line 1072
    invoke-interface {v8, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 1073
    .line 1074
    .line 1075
    move-result-wide v9

    .line 1076
    invoke-static/range {v9 .. v14}, Lr9/e0;->s(JJJ)J

    .line 1077
    .line 1078
    .line 1079
    move-result-wide v20

    .line 1080
    const-string v5, "transfer_receive_account"

    .line 1081
    .line 1082
    const-string v6, "default"

    .line 1083
    .line 1084
    invoke-interface {v8, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    if-eqz v5, :cond_2d

    .line 1089
    .line 1090
    move-object/from16 v26, v5

    .line 1091
    .line 1092
    goto :goto_2a

    .line 1093
    :cond_2d
    move-object/from16 v26, v6

    .line 1094
    .line 1095
    :goto_2a
    const-string v5, "transfer_mode"

    .line 1096
    .line 1097
    const/4 v6, 0x0

    .line 1098
    invoke-interface {v8, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v27

    .line 1102
    const-string v5, "transfer_whitelist"

    .line 1103
    .line 1104
    const-string v7, ""

    .line 1105
    .line 1106
    invoke-interface {v8, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    if-nez v5, :cond_2e

    .line 1111
    .line 1112
    move-object/from16 v28, v7

    .line 1113
    .line 1114
    goto :goto_2b

    .line 1115
    :cond_2e
    move-object/from16 v28, v5

    .line 1116
    .line 1117
    :goto_2b
    const-string v5, "transfer_blacklist"

    .line 1118
    .line 1119
    invoke-interface {v8, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v5

    .line 1123
    if-nez v5, :cond_2f

    .line 1124
    .line 1125
    move-object/from16 v29, v7

    .line 1126
    .line 1127
    goto :goto_2c

    .line 1128
    :cond_2f
    move-object/from16 v29, v5

    .line 1129
    .line 1130
    :goto_2c
    const-string v5, "transfer_amount_enable"

    .line 1131
    .line 1132
    invoke-interface {v8, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v30

    .line 1136
    const-string v5, "transfer_amount_cond"

    .line 1137
    .line 1138
    invoke-interface {v8, v5, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1139
    .line 1140
    .line 1141
    move-result v31

    .line 1142
    const-string v4, "transfer_amount_value"

    .line 1143
    .line 1144
    const-string v5, "0"

    .line 1145
    .line 1146
    invoke-interface {v8, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v4

    .line 1150
    if-eqz v4, :cond_30

    .line 1151
    .line 1152
    move-object/from16 v32, v4

    .line 1153
    .line 1154
    goto :goto_2d

    .line 1155
    :cond_30
    move-object/from16 v32, v5

    .line 1156
    .line 1157
    :goto_2d
    const-string v4, "transfer_amount_action"

    .line 1158
    .line 1159
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1160
    .line 1161
    .line 1162
    move-result v33

    .line 1163
    const-string v4, "transfer_keyword_mode"

    .line 1164
    .line 1165
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1166
    .line 1167
    .line 1168
    move-result v34

    .line 1169
    const-string v4, "transfer_keywords"

    .line 1170
    .line 1171
    invoke-interface {v8, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v4

    .line 1175
    if-nez v4, :cond_31

    .line 1176
    .line 1177
    move-object/from16 v35, v7

    .line 1178
    .line 1179
    goto :goto_2e

    .line 1180
    :cond_31
    move-object/from16 v35, v4

    .line 1181
    .line 1182
    :goto_2e
    const-string v4, "transfer_quiet_enable"

    .line 1183
    .line 1184
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v36

    .line 1188
    const-string v4, "transfer_quiet_start_second"

    .line 1189
    .line 1190
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1191
    .line 1192
    .line 1193
    move-result v37

    .line 1194
    const-string v4, "transfer_quiet_end_second"

    .line 1195
    .line 1196
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1197
    .line 1198
    .line 1199
    move-result v38

    .line 1200
    const-string v4, "transfer_refund_rejected"

    .line 1201
    .line 1202
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1203
    .line 1204
    .line 1205
    move-result v39

    .line 1206
    invoke-static {v8}, Lwb/ho;->e6(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v40

    .line 1210
    const-string v4, "transfer_notify_system_enable"

    .line 1211
    .line 1212
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v42

    .line 1216
    const-string v4, "transfer_notify_toast_enable"

    .line 1217
    .line 1218
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v43

    .line 1222
    const-string v4, "transfer_notify_sound_enable"

    .line 1223
    .line 1224
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v44

    .line 1228
    const-string v4, "transfer_notify_sound_mode"

    .line 1229
    .line 1230
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1231
    .line 1232
    .line 1233
    move-result v45

    .line 1234
    const-string v4, "transfer_notify_vibrate_enable"

    .line 1235
    .line 1236
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v46

    .line 1240
    const-string v4, "transfer_notify_sound_uri"

    .line 1241
    .line 1242
    invoke-interface {v8, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v4

    .line 1246
    if-nez v4, :cond_32

    .line 1247
    .line 1248
    move-object/from16 v47, v7

    .line 1249
    .line 1250
    goto :goto_2f

    .line 1251
    :cond_32
    move-object/from16 v47, v4

    .line 1252
    .line 1253
    :goto_2f
    const-string v4, "transfer_notify_text"

    .line 1254
    .line 1255
    const-string v5, "\u5df2\u6536\u6b3e {amount} \u5143"

    .line 1256
    .line 1257
    invoke-interface {v8, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    if-eqz v4, :cond_33

    .line 1262
    .line 1263
    move-object/from16 v48, v4

    .line 1264
    .line 1265
    goto :goto_30

    .line 1266
    :cond_33
    move-object/from16 v48, v5

    .line 1267
    .line 1268
    :goto_30
    const-string v4, "transfer_notify_toast_text"

    .line 1269
    .line 1270
    invoke-interface {v8, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v4

    .line 1274
    if-eqz v4, :cond_34

    .line 1275
    .line 1276
    move-object/from16 v49, v4

    .line 1277
    .line 1278
    goto :goto_31

    .line 1279
    :cond_34
    move-object/from16 v49, v5

    .line 1280
    .line 1281
    :goto_31
    const-string v4, "transfer_announce_enable"

    .line 1282
    .line 1283
    invoke-interface {v8, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v50

    .line 1287
    const-string v4, "transfer_announce_text"

    .line 1288
    .line 1289
    const-string v5, "\u6536\u5230\u8f6c\u8d26 {amount} \u5143"

    .line 1290
    .line 1291
    invoke-interface {v8, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    if-eqz v4, :cond_35

    .line 1296
    .line 1297
    move-object/from16 v51, v4

    .line 1298
    .line 1299
    :goto_32
    move-wide/from16 v22, v17

    .line 1300
    .line 1301
    goto :goto_33

    .line 1302
    :cond_35
    move-object/from16 v51, v5

    .line 1303
    .line 1304
    goto :goto_32

    .line 1305
    :goto_33
    const/16 v18, 0x1

    .line 1306
    .line 1307
    const/16 v41, 0x1

    .line 1308
    .line 1309
    move-object/from16 v17, v2

    .line 1310
    .line 1311
    invoke-direct/range {v15 .. v51}, Lua/i;-><init>(Ljava/lang/String;Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 1312
    .line 1313
    .line 1314
    invoke-direct {v1, v3, v15, v6}, Lwb/nu;-><init>(ILua/i;Z)V

    .line 1315
    .line 1316
    .line 1317
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 1318
    .line 1319
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1320
    .line 1321
    .line 1322
    goto/16 :goto_14

    .line 1323
    .line 1324
    :pswitch_3
    new-instance v1, Lwb/i4;

    .line 1325
    .line 1326
    new-instance v2, Lwb/v0;

    .line 1327
    .line 1328
    iget-object v3, v0, Lwb/k9;->i:Li0/a1;

    .line 1329
    .line 1330
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v4

    .line 1334
    move-object v6, v4

    .line 1335
    check-cast v6, Ljava/lang/String;

    .line 1336
    .line 1337
    new-instance v7, Lwb/di;

    .line 1338
    .line 1339
    const/16 v4, 0x13

    .line 1340
    .line 1341
    iget-object v5, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 1342
    .line 1343
    invoke-direct {v7, v5, v3, v4}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1344
    .line 1345
    .line 1346
    const/4 v8, 0x0

    .line 1347
    const/16 v9, 0xe0

    .line 1348
    .line 1349
    const-string v3, "\u9009\u62e9\u6539\u540d\u76d1\u542c\u7fa4"

    .line 1350
    .line 1351
    sget-object v4, Lwb/u0;->h:Lwb/u0;

    .line 1352
    .line 1353
    const/4 v5, 0x1

    .line 1354
    invoke-direct/range {v2 .. v9}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 1355
    .line 1356
    .line 1357
    const/4 v3, 0x0

    .line 1358
    invoke-direct {v1, v2, v3}, Lwb/i4;-><init>(Lwb/v0;Z)V

    .line 1359
    .line 1360
    .line 1361
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 1362
    .line 1363
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1364
    .line 1365
    .line 1366
    goto/16 :goto_14

    .line 1367
    .line 1368
    :pswitch_4
    new-instance v1, Lwb/k4;

    .line 1369
    .line 1370
    iget-object v2, v0, Lwb/k9;->i:Li0/a1;

    .line 1371
    .line 1372
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v3

    .line 1376
    check-cast v3, Ljava/util/List;

    .line 1377
    .line 1378
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1379
    .line 1380
    .line 1381
    move-result v3

    .line 1382
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    check-cast v2, Ljava/util/List;

    .line 1387
    .line 1388
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1389
    .line 1390
    .line 1391
    move-result v2

    .line 1392
    add-int/lit8 v2, v2, 0x1

    .line 1393
    .line 1394
    new-instance v4, Lq9/g;

    .line 1395
    .line 1396
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v5

    .line 1400
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    const-string v8, "rename_"

    .line 1403
    .line 1404
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    const-string v5, "_"

    .line 1411
    .line 1412
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v5

    .line 1422
    const-string v6, "\u6539\u540d\u6a21\u677f "

    .line 1423
    .line 1424
    invoke-static {v2, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v6

    .line 1428
    iget-object v2, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 1429
    .line 1430
    const-string v7, "group_rename_delay_seconds"

    .line 1431
    .line 1432
    const/4 v14, 0x0

    .line 1433
    invoke-interface {v2, v7, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1434
    .line 1435
    .line 1436
    move-result v8

    .line 1437
    const-string v7, "group_rename_prompt_type"

    .line 1438
    .line 1439
    const-string v9, "text"

    .line 1440
    .line 1441
    invoke-interface {v2, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v7

    .line 1445
    if-eqz v7, :cond_36

    .line 1446
    .line 1447
    move-object v9, v7

    .line 1448
    :cond_36
    const-string v7, "group_rename_both_order"

    .line 1449
    .line 1450
    const-string v10, "text_first"

    .line 1451
    .line 1452
    invoke-interface {v2, v7, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v7

    .line 1456
    if-eqz v7, :cond_37

    .line 1457
    .line 1458
    move-object v10, v7

    .line 1459
    :cond_37
    const-string v7, "group_rename_text"

    .line 1460
    .line 1461
    const-string v11, "%userName% \u5c06\u7fa4\u5185\u6635\u79f0\u4ece\u201c%oldGroupNickname%\u201d\u4fee\u6539\u4e3a\u201c%newGroupNickname%\u201d"

    .line 1462
    .line 1463
    invoke-interface {v2, v7, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v7

    .line 1467
    if-eqz v7, :cond_38

    .line 1468
    .line 1469
    move-object v11, v7

    .line 1470
    :cond_38
    const-string v7, "group_rename_card_title"

    .line 1471
    .line 1472
    const-string v12, "%userName% \u4fee\u6539\u4e86\u7fa4\u5185\u6635\u79f0"

    .line 1473
    .line 1474
    invoke-interface {v2, v7, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v7

    .line 1478
    if-eqz v7, :cond_39

    .line 1479
    .line 1480
    move-object v12, v7

    .line 1481
    :cond_39
    const-string v7, "group_rename_card_desc"

    .line 1482
    .line 1483
    const-string v13, "\u65e7\u6635\u79f0\uff1a%oldGroupNickname%\n\u65b0\u6635\u79f0\uff1a%newGroupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 1484
    .line 1485
    invoke-interface {v2, v7, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v2

    .line 1489
    if-eqz v2, :cond_3a

    .line 1490
    .line 1491
    move-object v13, v2

    .line 1492
    :cond_3a
    const/4 v7, 0x1

    .line 1493
    invoke-direct/range {v4 .. v13}, Lq9/g;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    invoke-direct {v1, v3, v4, v14}, Lwb/k4;-><init>(ILq9/g;Z)V

    .line 1497
    .line 1498
    .line 1499
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 1500
    .line 1501
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1502
    .line 1503
    .line 1504
    goto/16 :goto_14

    .line 1505
    .line 1506
    :pswitch_5
    const-string v1, "last_time"

    .line 1507
    .line 1508
    const-wide/16 v2, 0x0

    .line 1509
    .line 1510
    iget-object v4, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 1511
    .line 1512
    invoke-interface {v4, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 1513
    .line 1514
    .line 1515
    move-result-wide v1

    .line 1516
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v1

    .line 1520
    iget-object v2, v0, Lwb/k9;->i:Li0/a1;

    .line 1521
    .line 1522
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1523
    .line 1524
    .line 1525
    const-string v1, "last_result"

    .line 1526
    .line 1527
    const-string v2, ""

    .line 1528
    .line 1529
    invoke-interface {v4, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v1

    .line 1533
    if-nez v1, :cond_3b

    .line 1534
    .line 1535
    goto :goto_34

    .line 1536
    :cond_3b
    move-object v2, v1

    .line 1537
    :goto_34
    iget-object v1, v0, Lwb/k9;->j:Li0/a1;

    .line 1538
    .line 1539
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1540
    .line 1541
    .line 1542
    goto/16 :goto_14

    .line 1543
    .line 1544
    :pswitch_6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1545
    .line 1546
    const-string v2, "zombie_check_auto_delete"

    .line 1547
    .line 1548
    iget-object v3, v0, Lwb/k9;->i:Li0/a1;

    .line 1549
    .line 1550
    iget-object v4, v0, Lwb/k9;->h:Landroid/content/SharedPreferences;

    .line 1551
    .line 1552
    const/4 v5, 0x1

    .line 1553
    invoke-static {v3, v1, v4, v2, v5}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 1554
    .line 1555
    .line 1556
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1557
    .line 1558
    iget-object v2, v0, Lwb/k9;->j:Li0/a1;

    .line 1559
    .line 1560
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    goto/16 :goto_14

    .line 1564
    .line 1565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
