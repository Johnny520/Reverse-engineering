.class public final Laa/e;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public volatile e:Z


# direct methods
.method public static k(Laa/a;Ljava/util/LinkedHashMap;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Laa/a;->g:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, Laa/a;->h:Z

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    instance-of p0, v0, Ljava/util/Collection;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    check-cast p0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public static l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z
    .locals 3

    .line 1
    iget-object p3, p3, Ll8/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1b

    .line 12
    .line 13
    invoke-static {p3, p2}, Laa/f;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1c

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-static {p3, p2}, Laa/f;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    .line 36
    .line 37
    instance-of p0, p1, Ljava/util/Collection;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    move-object p0, p1

    .line 42
    check-cast p0, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1c

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 69
    .line 70
    invoke-static {p2, p1, p2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    sparse-switch p2, :sswitch_data_0

    .line 79
    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :sswitch_0
    const-string p2, "location"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_d

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :sswitch_1
    const-string p2, "redpacket"

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_9

    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :sswitch_2
    const-string p2, "transfer"

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :sswitch_3
    const-string p2, "\u8bed\u97f3\u804a\u5929"

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_14

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :sswitch_4
    const-string p2, "red_packet"

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_9

    .line 130
    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :sswitch_5
    const-string p2, "\u89c6\u9891\u804a\u5929"

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_14

    .line 140
    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :sswitch_6
    const-string p2, "\u5730\u56fe\u4f4d\u7f6e"

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_d

    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :sswitch_7
    const-string p2, "\u52a8\u753b\u8868\u60c5"

    .line 154
    .line 155
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-nez p1, :cond_8

    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :sswitch_8
    const-string p2, "voice"

    .line 164
    .line 165
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-nez p1, :cond_6

    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :sswitch_9
    const-string p2, "video"

    .line 174
    .line 175
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-nez p1, :cond_7

    .line 180
    .line 181
    goto/16 :goto_3

    .line 182
    .line 183
    :sswitch_a
    const-string p2, "music"

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_4

    .line 190
    .line 191
    goto/16 :goto_3

    .line 192
    .line 193
    :sswitch_b
    const-string p2, "image"

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_b

    .line 200
    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :sswitch_c
    const-string p2, "emoji"

    .line 204
    .line 205
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-nez p1, :cond_8

    .line 210
    .line 211
    goto/16 :goto_3

    .line 212
    .line 213
    :sswitch_d
    const-string p2, "\u89c6\u9891\u53f7"

    .line 214
    .line 215
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_f

    .line 220
    .line 221
    goto/16 :goto_3

    .line 222
    .line 223
    :sswitch_e
    const-string p2, "\u62cd\u4e00\u62cd"

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_e

    .line 230
    .line 231
    goto/16 :goto_3

    .line 232
    .line 233
    :sswitch_f
    const-string p2, "\u5c0f\u89c6\u9891"

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-nez p1, :cond_7

    .line 240
    .line 241
    goto/16 :goto_3

    .line 242
    .line 243
    :sswitch_10
    const-string p2, "\u5c0f\u7a0b\u5e8f"

    .line 244
    .line 245
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-nez p1, :cond_1a

    .line 250
    .line 251
    goto/16 :goto_3

    .line 252
    .line 253
    :sswitch_11
    const-string p2, "voip"

    .line 254
    .line 255
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-nez p1, :cond_14

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :sswitch_12
    const-string p2, "text"

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-nez p1, :cond_a

    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :sswitch_13
    const-string p2, "link"

    .line 274
    .line 275
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-nez p1, :cond_10

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :sswitch_14
    const-string p2, "card"

    .line 284
    .line 285
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-nez p1, :cond_c

    .line 290
    .line 291
    goto/16 :goto_3

    .line 292
    .line 293
    :sswitch_15
    const-string p2, "\u97f3\u4e50"

    .line 294
    .line 295
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    if-nez p1, :cond_4

    .line 300
    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :cond_4
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    goto/16 :goto_4

    .line 308
    .line 309
    :sswitch_16
    const-string p2, "\u94fe\u63a5"

    .line 310
    .line 311
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-nez p1, :cond_10

    .line 316
    .line 317
    goto/16 :goto_3

    .line 318
    .line 319
    :sswitch_17
    const-string p2, "\u901a\u8bdd"

    .line 320
    .line 321
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-nez p1, :cond_14

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :sswitch_18
    const-string p2, "\u8f6c\u8d26"

    .line 330
    .line 331
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-nez p1, :cond_5

    .line 336
    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :cond_5
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    goto/16 :goto_4

    .line 344
    .line 345
    :sswitch_19
    const-string p2, "\u8bed\u97f3"

    .line 346
    .line 347
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    if-nez p1, :cond_6

    .line 352
    .line 353
    goto/16 :goto_3

    .line 354
    .line 355
    :cond_6
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    goto/16 :goto_4

    .line 360
    .line 361
    :sswitch_1a
    const-string p2, "\u89c6\u9891"

    .line 362
    .line 363
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-nez p1, :cond_7

    .line 368
    .line 369
    goto/16 :goto_3

    .line 370
    .line 371
    :cond_7
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    goto/16 :goto_4

    .line 376
    .line 377
    :sswitch_1b
    const-string p2, "\u8868\u60c5"

    .line 378
    .line 379
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-nez p1, :cond_8

    .line 384
    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :cond_8
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    goto/16 :goto_4

    .line 392
    .line 393
    :sswitch_1c
    const-string p2, "\u7ea2\u5305"

    .line 394
    .line 395
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-nez p1, :cond_9

    .line 400
    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :cond_9
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    goto/16 :goto_4

    .line 408
    .line 409
    :sswitch_1d
    const-string p2, "\u7cfb\u7edf"

    .line 410
    .line 411
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    if-nez p1, :cond_13

    .line 416
    .line 417
    goto/16 :goto_3

    .line 418
    .line 419
    :sswitch_1e
    const-string p2, "\u6587\u7ae0"

    .line 420
    .line 421
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    if-nez p1, :cond_10

    .line 426
    .line 427
    goto/16 :goto_3

    .line 428
    .line 429
    :sswitch_1f
    const-string p2, "\u6587\u672c"

    .line 430
    .line 431
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    if-nez p1, :cond_a

    .line 436
    .line 437
    goto/16 :goto_3

    .line 438
    .line 439
    :sswitch_20
    const-string p2, "\u6587\u5b57"

    .line 440
    .line 441
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    if-nez p1, :cond_a

    .line 446
    .line 447
    goto/16 :goto_3

    .line 448
    .line 449
    :cond_a
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    goto/16 :goto_4

    .line 454
    .line 455
    :sswitch_21
    const-string p2, "\u6587\u4ef6"

    .line 456
    .line 457
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    if-nez p1, :cond_10

    .line 462
    .line 463
    goto/16 :goto_3

    .line 464
    .line 465
    :sswitch_22
    const-string p2, "\u56fe\u7247"

    .line 466
    .line 467
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-nez p1, :cond_b

    .line 472
    .line 473
    goto/16 :goto_3

    .line 474
    .line 475
    :cond_b
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    goto/16 :goto_4

    .line 480
    .line 481
    :sswitch_23
    const-string p2, "\u5730\u56fe"

    .line 482
    .line 483
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    if-nez p1, :cond_d

    .line 488
    .line 489
    goto/16 :goto_3

    .line 490
    .line 491
    :sswitch_24
    const-string p2, "\u540d\u7247"

    .line 492
    .line 493
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result p1

    .line 497
    if-nez p1, :cond_c

    .line 498
    .line 499
    goto/16 :goto_3

    .line 500
    .line 501
    :cond_c
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    goto/16 :goto_4

    .line 506
    .line 507
    :sswitch_25
    const-string p2, "\u4f4d\u7f6e"

    .line 508
    .line 509
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result p1

    .line 513
    if-nez p1, :cond_d

    .line 514
    .line 515
    goto/16 :goto_3

    .line 516
    .line 517
    :cond_d
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLocation()Z

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    goto/16 :goto_4

    .line 522
    .line 523
    :sswitch_26
    const-string p2, "pat"

    .line 524
    .line 525
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result p1

    .line 529
    if-nez p1, :cond_e

    .line 530
    .line 531
    goto/16 :goto_3

    .line 532
    .line 533
    :cond_e
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 534
    .line 535
    .line 536
    move-result p1

    .line 537
    goto/16 :goto_4

    .line 538
    .line 539
    :sswitch_27
    const-string p2, "app"

    .line 540
    .line 541
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    if-nez p1, :cond_15

    .line 546
    .line 547
    goto/16 :goto_3

    .line 548
    .line 549
    :sswitch_28
    const-string p2, "video_number"

    .line 550
    .line 551
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result p1

    .line 555
    if-nez p1, :cond_f

    .line 556
    .line 557
    goto/16 :goto_3

    .line 558
    .line 559
    :sswitch_29
    const-string p2, "\u89c6\u9891\u53f7\u94fe\u63a5"

    .line 560
    .line 561
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result p1

    .line 565
    if-nez p1, :cond_f

    .line 566
    .line 567
    goto/16 :goto_3

    .line 568
    .line 569
    :cond_f
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 570
    .line 571
    .line 572
    move-result p1

    .line 573
    goto/16 :goto_4

    .line 574
    .line 575
    :sswitch_2a
    const-string p2, "miniprogram"

    .line 576
    .line 577
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result p1

    .line 581
    if-nez p1, :cond_1a

    .line 582
    .line 583
    goto/16 :goto_3

    .line 584
    .line 585
    :sswitch_2b
    const-string p2, "\u6587\u7ae0/\u94fe\u63a5"

    .line 586
    .line 587
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result p1

    .line 591
    if-nez p1, :cond_10

    .line 592
    .line 593
    goto/16 :goto_3

    .line 594
    .line 595
    :cond_10
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

    .line 596
    .line 597
    .line 598
    move-result p1

    .line 599
    if-nez p1, :cond_12

    .line 600
    .line 601
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 602
    .line 603
    .line 604
    move-result p1

    .line 605
    if-nez p1, :cond_12

    .line 606
    .line 607
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    if-eqz p1, :cond_11

    .line 612
    .line 613
    goto :goto_1

    .line 614
    :cond_11
    :goto_0
    move p1, v1

    .line 615
    goto/16 :goto_4

    .line 616
    .line 617
    :cond_12
    :goto_1
    move p1, v0

    .line 618
    goto/16 :goto_4

    .line 619
    .line 620
    :sswitch_2c
    const-string p2, "system"

    .line 621
    .line 622
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    move-result p1

    .line 626
    if-nez p1, :cond_13

    .line 627
    .line 628
    goto :goto_3

    .line 629
    :cond_13
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 630
    .line 631
    .line 632
    move-result p1

    .line 633
    goto :goto_4

    .line 634
    :sswitch_2d
    const-string p2, "\u89c6\u9891\u8bed\u97f3\u804a\u5929"

    .line 635
    .line 636
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result p1

    .line 640
    if-nez p1, :cond_14

    .line 641
    .line 642
    goto :goto_3

    .line 643
    :sswitch_2e
    const-string p2, "\u89c6\u9891/\u8bed\u97f3\u804a\u5929"

    .line 644
    .line 645
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result p1

    .line 649
    if-nez p1, :cond_14

    .line 650
    .line 651
    goto :goto_3

    .line 652
    :cond_14
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 653
    .line 654
    .line 655
    move-result p1

    .line 656
    goto :goto_4

    .line 657
    :sswitch_2f
    const-string p2, "appmsg"

    .line 658
    .line 659
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result p1

    .line 663
    if-nez p1, :cond_15

    .line 664
    .line 665
    goto :goto_3

    .line 666
    :cond_15
    iget p1, p4, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 667
    .line 668
    if-gtz p1, :cond_16

    .line 669
    .line 670
    goto :goto_2

    .line 671
    :cond_16
    and-int/lit16 p2, p1, 0xff

    .line 672
    .line 673
    const p3, 0xffff

    .line 674
    .line 675
    .line 676
    and-int/2addr p3, p1

    .line 677
    ushr-int/lit8 v2, p1, 0x10

    .line 678
    .line 679
    if-nez v2, :cond_17

    .line 680
    .line 681
    goto :goto_2

    .line 682
    :cond_17
    const/16 v2, 0x2710

    .line 683
    .line 684
    if-eq p3, v2, :cond_18

    .line 685
    .line 686
    const/16 v2, 0x2712

    .line 687
    .line 688
    if-eq p3, v2, :cond_18

    .line 689
    .line 690
    if-eqz p2, :cond_19

    .line 691
    .line 692
    if-ne p3, p2, :cond_19

    .line 693
    .line 694
    move p1, p2

    .line 695
    goto :goto_2

    .line 696
    :cond_18
    move p1, p3

    .line 697
    :cond_19
    :goto_2
    const/16 p2, 0x31

    .line 698
    .line 699
    if-ne p1, p2, :cond_11

    .line 700
    .line 701
    goto :goto_1

    .line 702
    :sswitch_30
    const-string p2, "mini_program"

    .line 703
    .line 704
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result p1

    .line 708
    if-nez p1, :cond_1a

    .line 709
    .line 710
    :goto_3
    goto :goto_0

    .line 711
    :cond_1a
    invoke-virtual {p4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMiniProgram()Z

    .line 712
    .line 713
    .line 714
    move-result p1

    .line 715
    :goto_4
    if-eqz p1, :cond_3

    .line 716
    .line 717
    :cond_1b
    :goto_5
    return v0

    .line 718
    :cond_1c
    :goto_6
    return v1

    .line 719
    :sswitch_data_0
    .sparse-switch
        -0x65d05d64 -> :sswitch_30
        -0x541b1240 -> :sswitch_2f
        -0x43af5db7 -> :sswitch_2e
        -0x3e5ddbb0 -> :sswitch_2d
        -0x34e38dd1 -> :sswitch_2c
        -0x315d7e03 -> :sswitch_2b
        -0x2a2e45b3 -> :sswitch_2a
        -0x23ddd6cd -> :sswitch_29
        -0x8352c73 -> :sswitch_28
        0x17a21 -> :sswitch_27
        0x1b0a3 -> :sswitch_26
        0xa19c1 -> :sswitch_25
        0xa9fda -> :sswitch_24
        0xae5ce -> :sswitch_23
        0xafb09 -> :sswitch_22
        0xc9a4f -> :sswitch_21
        0xca6b0 -> :sswitch_20
        0xcb285 -> :sswitch_1f
        0xcc639 -> :sswitch_1e
        0xfa144 -> :sswitch_1d
        0xfa8a3 -> :sswitch_1c
        0x10e55d -> :sswitch_1b
        0x11478b -> :sswitch_1a
        0x1189a6 -> :sswitch_19
        0x11eb3a -> :sswitch_18
        0x11ff03 -> :sswitch_17
        0x126e67 -> :sswitch_16
        0x12b4bd -> :sswitch_15
        0x2e7b10 -> :sswitch_14
        0x32affa -> :sswitch_13
        0x36452d -> :sswitch_12
        0x3751a0 -> :sswitch_11
        0x168ba33 -> :sswitch_10
        0x16adbda -> :sswitch_f
        0x17cb85a -> :sswitch_e
        0x217fdcc -> :sswitch_d
        0x5c28046 -> :sswitch_c
        0x5faa95b -> :sswitch_b
        0x636ee25 -> :sswitch_a
        0x6b0147b -> :sswitch_9
        0x6b2e132 -> :sswitch_8
        0x275bc430 -> :sswitch_7
        0x28f2c40f -> :sswitch_6
        0x40ed72ea -> :sswitch_5
        0x41bdfbf6 -> :sswitch_4
        0x41e59a45 -> :sswitch_3
        0x4c58b7eb -> :sswitch_2
        0x70e39459 -> :sswitch_1
        0x714f9fb5 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "message_block"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Laa/g;

    .line 5
    .line 6
    const-string v0, "\u62e6\u622a\u6307\u5b9a\u6210\u5458\u6216\u4f1a\u8bdd\u7684\u6d88\u606f\uff0c\u4e0d\u663e\u793a\u4e5f\u4e0d\u5f39\u901a\u77e5"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "message_block"

    .line 11
    .line 12
    const-string v3, "\u5c4f\u853d\u6d88\u606f"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 5
    .line 6
    new-instance v0, Laa/c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1, p1}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/16 p1, 0x8

    .line 13
    .line 14
    const-string v1, "message_block"

    .line 15
    .line 16
    const-string v2, "\u5c4f\u853d\u6d88\u606f"

    .line 17
    .line 18
    sget-object v3, Lr8/c;->j:Lr8/c;

    .line 19
    .line 20
    invoke-static {p1, v0, v1, v2, v3}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5c4f\u853d\u6d88\u606f"

    .line 2
    .line 3
    return-object v0
.end method
