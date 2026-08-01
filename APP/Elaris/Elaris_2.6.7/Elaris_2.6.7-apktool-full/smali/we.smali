.class public final Lwe;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    sget-object v2, Lxe;->b:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_b

    .line 18
    .line 19
    :cond_0
    const-string v1, "external_browser"

    .line 20
    .line 21
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const-string v2, "unblock_risk_web"

    .line 26
    .line 27
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto/16 :goto_b

    .line 36
    .line 37
    :cond_1
    iget-object v3, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 38
    .line 39
    instance-of v4, v3, Landroid/content/Context;

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    check-cast v3, Landroid/content/Context;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_0
    iget-object v4, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 48
    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    goto/16 :goto_b

    .line 52
    .line 53
    :cond_3
    array-length v6, v4

    .line 54
    const/4 v7, 0x0

    .line 55
    move v8, v7

    .line 56
    :goto_1
    if-ge v8, v6, :cond_5

    .line 57
    .line 58
    aget-object v9, v4, v8

    .line 59
    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    instance-of v10, v9, Landroid/content/Context;

    .line 63
    .line 64
    if-eqz v10, :cond_4

    .line 65
    .line 66
    check-cast v9, Landroid/content/Context;

    .line 67
    .line 68
    move-object v3, v9

    .line 69
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    if-nez v3, :cond_6

    .line 73
    .line 74
    goto/16 :goto_b

    .line 75
    .line 76
    :cond_6
    iget-object v4, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 77
    .line 78
    array-length v6, v4

    .line 79
    move v8, v7

    .line 80
    :goto_2
    if-lt v8, v6, :cond_7

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    goto :goto_3

    .line 84
    :cond_7
    aget-object v9, v4, v8

    .line 85
    .line 86
    instance-of v10, v9, Landroid/content/Intent;

    .line 87
    .line 88
    if-eqz v10, :cond_8

    .line 89
    .line 90
    check-cast v9, Landroid/content/Intent;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_8
    instance-of v10, v9, [Landroid/content/Intent;

    .line 94
    .line 95
    if-eqz v10, :cond_18

    .line 96
    .line 97
    move-object v10, v9

    .line 98
    check-cast v10, [Landroid/content/Intent;

    .line 99
    .line 100
    array-length v10, v10

    .line 101
    if-lez v10, :cond_18

    .line 102
    .line 103
    check-cast v9, [Landroid/content/Intent;

    .line 104
    .line 105
    aget-object v9, v9, v7

    .line 106
    .line 107
    :goto_3
    if-nez v9, :cond_9

    .line 108
    .line 109
    goto/16 :goto_b

    .line 110
    .line 111
    :cond_9
    invoke-virtual {v9}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-nez v4, :cond_a

    .line 116
    .line 117
    const-string v6, ""

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v8, "/"

    .line 133
    .line 134
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    :goto_4
    iget-object v8, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 149
    .line 150
    instance-of v10, v8, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    if-eqz v10, :cond_b

    .line 153
    .line 154
    check-cast v8, Ljava/lang/reflect/Method;

    .line 155
    .line 156
    invoke-static {v8}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    goto :goto_5

    .line 161
    :cond_b
    const-string v8, "unknown"

    .line 162
    .line 163
    :goto_5
    invoke-static {v9}, Lxe;->c(Landroid/content/Intent;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-static {v10}, Lxe;->e(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_19

    .line 172
    .line 173
    invoke-static {v10}, Lxe;->g(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 177
    const/16 v12, 0x78

    .line 178
    .line 179
    const-string v13, ", host="

    .line 180
    .line 181
    const-string v14, ", comp="

    .line 182
    .line 183
    const-string v15, ", activity="

    .line 184
    .line 185
    const-string v16, "debug_log"

    .line 186
    .line 187
    const/16 v7, 0xb4

    .line 188
    .line 189
    if-nez v11, :cond_17

    .line 190
    .line 191
    :try_start_1
    invoke-static {v3, v9, v6}, Lxe;->f(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-nez v11, :cond_17

    .line 196
    .line 197
    if-eqz v2, :cond_d

    .line 198
    .line 199
    invoke-static {v10}, Lxe;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2}, Lxe;->e(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v17

    .line 207
    if-eqz v17, :cond_d

    .line 208
    .line 209
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 213
    if-eqz v17, :cond_c

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_c
    :try_start_2
    const-string v10, "url"

    .line 217
    .line 218
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    .line 220
    .line 221
    :catchall_0
    :try_start_3
    const-string v10, "key_url"

    .line 222
    .line 223
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    .line 225
    .line 226
    :catchall_1
    :try_start_4
    const-string v10, "target_url"

    .line 227
    .line 228
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 229
    .line 230
    .line 231
    :catchall_2
    :try_start_5
    const-string v10, "raw_url"

    .line 232
    .line 233
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 234
    .line 235
    .line 236
    :catchall_3
    :try_start_6
    const-string v10, "web_url"

    .line 237
    .line 238
    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 239
    .line 240
    .line 241
    :catchall_4
    :try_start_7
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 246
    .line 247
    .line 248
    :catchall_5
    :try_start_8
    const-string v10, "unwrapped QQ risk url"

    .line 249
    .line 250
    invoke-static {v10}, Lv4;->C(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    move-object v10, v2

    .line 254
    const/4 v2, 0x1

    .line 255
    goto :goto_7

    .line 256
    :cond_d
    :goto_6
    const/4 v2, 0x0

    .line 257
    :goto_7
    invoke-static {v10}, Lxe;->g(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v17

    .line 261
    if-eqz v17, :cond_e

    .line 262
    .line 263
    invoke-static/range {v16 .. v16}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_19

    .line 268
    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    const-string v1, "external browser kept internal auth/security web in QQ; upstream="

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-static {v3}, Lv4;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v1, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-static {v6, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-static {v10}, Lxe;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v1, v12}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_b

    .line 328
    .line 329
    :cond_e
    if-eqz v1, :cond_14

    .line 330
    .line 331
    invoke-static {v10}, Lxe;->e(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result v17

    .line 335
    if-nez v17, :cond_f

    .line 336
    .line 337
    const/4 v5, 0x0

    .line 338
    const/16 v17, 0x1

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_f
    const/16 v17, 0x1

    .line 342
    .line 343
    invoke-static {v10}, Lxe;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-static {v11}, Lxe;->e(Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v18
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 351
    const-string v5, ".qq.com"

    .line 352
    .line 353
    const-string v12, "qq.com"

    .line 354
    .line 355
    if-eqz v18, :cond_12

    .line 356
    .line 357
    :try_start_9
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v18

    .line 361
    if-nez v18, :cond_12

    .line 362
    .line 363
    invoke-static {v11}, Lxe;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    if-nez v12, :cond_11

    .line 372
    .line 373
    invoke-virtual {v11, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_10

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_10
    const/4 v5, 0x0

    .line 381
    goto :goto_9

    .line 382
    :cond_11
    :goto_8
    move/from16 v5, v17

    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_12
    invoke-static {v10}, Lxe;->i(Ljava/lang/String;)Z

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    if-eqz v11, :cond_13

    .line 390
    .line 391
    move/from16 v5, v17

    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_13
    invoke-static {v10}, Lxe;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-nez v12, :cond_11

    .line 403
    .line 404
    invoke-virtual {v11, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_10

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :goto_9
    xor-int/lit8 v5, v5, 0x1

    .line 412
    .line 413
    :goto_a
    if-nez v5, :cond_15

    .line 414
    .line 415
    invoke-static/range {v16 .. v16}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_19

    .line 420
    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v1, "external browser kept QQ official link in QQ; upstream="

    .line 427
    .line 428
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-static {v3}, Lv4;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-static {v1, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-static {v6, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-static {v10}, Lxe;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    const/16 v2, 0x78

    .line 466
    .line 467
    invoke-static {v1, v2}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_b

    .line 482
    .line 483
    :cond_14
    const/16 v17, 0x1

    .line 484
    .line 485
    :cond_15
    if-eqz v1, :cond_19

    .line 486
    .line 487
    invoke-static {v9, v4, v6, v2, v10}, Lxe;->j(Landroid/content/Intent;Landroid/content/ComponentName;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    if-eqz v1, :cond_19

    .line 492
    .line 493
    invoke-static {v10}, Lxe;->e(Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-eqz v1, :cond_16

    .line 498
    .line 499
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 500
    .line 501
    .line 502
    :cond_16
    invoke-static {v3, v9, v10}, Lxe;->k(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_19

    .line 507
    .line 508
    invoke-static {v10}, Lxe;->e(Ljava/lang/String;)Z

    .line 509
    .line 510
    .line 511
    const/4 v5, 0x0

    .line 512
    invoke-virtual {v0, v5}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    new-instance v0, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    const-string v1, "redirected QQ web link to external browser; upstream="

    .line 521
    .line 522
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v1, ", rootStart="

    .line 529
    .line 530
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    move/from16 v1, v17

    .line 534
    .line 535
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    const-string v1, ", skipConfirm=false"

    .line 539
    .line 540
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    goto :goto_b

    .line 551
    :cond_17
    invoke-static/range {v16 .. v16}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-eqz v0, :cond_19

    .line 556
    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    const-string v1, "web guard skipped internal auth/security web before rewrite; upstream="

    .line 563
    .line 564
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-static {v3}, Lv4;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-static {v1, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-static {v6, v7}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-static {v10}, Lxe;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    const/16 v2, 0x78

    .line 602
    .line 603
    invoke-static {v1, v2}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :cond_18
    const/4 v5, 0x0

    .line 619
    add-int/lit8 v8, v8, 0x1

    .line 620
    .line 621
    const/4 v7, 0x0

    .line 622
    goto/16 :goto_2

    .line 623
    .line 624
    :catchall_6
    move-exception v0

    .line 625
    const-string v1, "tryHandleWebIntent failed: "

    .line 626
    .line 627
    invoke-static {v1, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    :cond_19
    :goto_b
    return-void
.end method
