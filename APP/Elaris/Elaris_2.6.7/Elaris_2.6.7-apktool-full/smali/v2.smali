.class public final Lv2;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    const-string p0, "direct_download_write"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_d

    .line 10
    .line 11
    :cond_0
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    array-length v2, p0

    .line 19
    if-lez v2, :cond_1

    .line 20
    .line 21
    aget-object p0, p0, v0

    .line 22
    .line 23
    instance-of v2, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v1

    .line 31
    :goto_0
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    instance-of v3, v2, Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_d

    .line 40
    .line 41
    :cond_2
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2}, La3;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {p0}, La3;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, La3;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    invoke-static {v2}, La3;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    goto/16 :goto_c

    .line 72
    .line 73
    :cond_4
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 74
    .line 75
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_6

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    if-nez v2, :cond_5

    .line 91
    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :cond_5
    invoke-static {v2}, La3;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "/data/data/com.tencent.mobileqq/qqfile_recv/"

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    const-string v4, "/data/user/0/com.tencent.mobileqq/qqfile_recv/"

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_6

    .line 119
    .line 120
    const-string v4, "/android/data/com.tencent.mobileqq/"

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_1c

    .line 127
    .line 128
    const-string v4, "/tencent/qqfile_recv/"

    .line 129
    .line 130
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    if-eqz v3, :cond_1c

    .line 135
    .line 136
    :catchall_0
    :cond_6
    invoke-static {}, La3;->d()Ljava/io/File;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-nez v3, :cond_7

    .line 141
    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_7
    :goto_1
    const-string v4, "/"

    .line 145
    .line 146
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    const/4 v6, 0x1

    .line 151
    if-eqz v5, :cond_8

    .line 152
    .line 153
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    goto :goto_1

    .line 158
    :cond_8
    const/16 v5, 0x5c

    .line 159
    .line 160
    const/16 v7, 0x2f

    .line 161
    .line 162
    invoke-virtual {p0, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-nez p0, :cond_9

    .line 167
    .line 168
    move-object p0, v1

    .line 169
    goto :goto_2

    .line 170
    :cond_9
    invoke-virtual {p0, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    :goto_2
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-eqz v8, :cond_a

    .line 183
    .line 184
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    goto :goto_2

    .line 189
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    const-string v9, "../"

    .line 194
    .line 195
    if-nez v8, :cond_c

    .line 196
    .line 197
    :cond_b
    :goto_3
    move-object p0, v1

    .line 198
    goto :goto_4

    .line 199
    :cond_c
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 200
    .line 201
    invoke-virtual {p0, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    const-string v10, ".troopthumb/"

    .line 206
    .line 207
    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-nez v10, :cond_b

    .line 212
    .line 213
    const-string v10, "troopthumb/"

    .line 214
    .line 215
    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-nez v10, :cond_b

    .line 220
    .line 221
    const-string v10, "/.troopthumb/"

    .line 222
    .line 223
    invoke-virtual {v8, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    if-nez v10, :cond_b

    .line 228
    .line 229
    const-string v10, "/troopthumb/"

    .line 230
    .line 231
    invoke-virtual {v8, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_d

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_d
    const-string v8, "QQfile_recv"

    .line 239
    .line 240
    invoke-static {p0, v8}, La3;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    const-string v8, "MobileQQ"

    .line 245
    .line 246
    invoke-static {p0, v8}, La3;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    const-string v8, "QQ"

    .line 251
    .line 252
    invoke-static {p0, v8}, La3;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    const-string v8, "."

    .line 257
    .line 258
    invoke-virtual {p0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-nez v8, :cond_b

    .line 263
    .line 264
    const-string v8, "/../"

    .line 265
    .line 266
    invoke-virtual {p0, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    if-nez v8, :cond_b

    .line 271
    .line 272
    invoke-virtual {p0, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-eqz v8, :cond_e

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_e
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-nez v8, :cond_f

    .line 284
    .line 285
    goto/16 :goto_c

    .line 286
    .line 287
    :cond_f
    invoke-virtual {p0, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    if-nez v8, :cond_1c

    .line 292
    .line 293
    invoke-virtual {p0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-eqz v8, :cond_10

    .line 298
    .line 299
    goto/16 :goto_c

    .line 300
    .line 301
    :cond_10
    new-instance v8, Ljava/io/File;

    .line 302
    .line 303
    invoke-direct {v8, v3, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :try_start_1
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 307
    .line 308
    .line 309
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 310
    goto :goto_5

    .line 311
    :catchall_1
    invoke-virtual {v8}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    :goto_5
    invoke-static {v3}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v8}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    if-eqz v9, :cond_14

    .line 324
    .line 325
    if-nez v3, :cond_11

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_11
    invoke-virtual {v9, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v3, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    if-nez v3, :cond_12

    .line 337
    .line 338
    move-object v3, v1

    .line 339
    goto :goto_6

    .line 340
    :cond_12
    invoke-virtual {v3, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    :goto_6
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-eqz v5, :cond_13

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_13
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    :goto_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    :cond_14
    :goto_8
    if-nez v0, :cond_15

    .line 360
    .line 361
    goto/16 :goto_c

    .line 362
    .line 363
    :cond_15
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-eqz v0, :cond_16

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-nez v3, :cond_16

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 376
    .line 377
    .line 378
    :cond_16
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_1b

    .line 383
    .line 384
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    const/4 v4, 0x0

    .line 393
    if-eqz v0, :cond_19

    .line 394
    .line 395
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-nez v5, :cond_17

    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_17
    :goto_9
    const/16 v5, 0x270f

    .line 403
    .line 404
    if-gt v6, v5, :cond_19

    .line 405
    .line 406
    invoke-static {v0, v3, v6}, La3;->k(Ljava/io/File;Ljava/lang/String;I)Ljava/io/File;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    if-nez v7, :cond_18

    .line 415
    .line 416
    move-object v4, v5

    .line 417
    goto :goto_a

    .line 418
    :cond_18
    add-int/lit8 v6, v6, 0x1

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_19
    :goto_a
    if-nez v4, :cond_1a

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_1a
    invoke-static {v4}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    move-object v1, v0

    .line 429
    goto :goto_b

    .line 430
    :cond_1b
    move-object v1, v9

    .line 431
    :goto_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    const-string v3, "legacy download redirect selected write="

    .line 434
    .line 435
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    const-string v3, " relative="

    .line 442
    .line 443
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-string p0, " old="

    .line 450
    .line 451
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :cond_1c
    :goto_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 465
    .line 466
    .line 467
    move-result p0

    .line 468
    if-lez p0, :cond_1d

    .line 469
    .line 470
    invoke-virtual {p1, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    :cond_1d
    :goto_d
    return-void
.end method
