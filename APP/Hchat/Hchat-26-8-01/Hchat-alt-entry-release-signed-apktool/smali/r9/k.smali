.class public final synthetic Lr9/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:J

.field public final synthetic h:Lgg/u;

.field public final synthetic i:Lr9/f0;

.field public final synthetic j:Lgg/u;

.field public final synthetic k:Lr9/z;


# direct methods
.method public synthetic constructor <init>(Lr9/d0;JLgg/u;Lr9/f0;Lgg/u;Lr9/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lr9/k;->g:J

    .line 5
    .line 6
    iput-object p4, p0, Lr9/k;->h:Lgg/u;

    .line 7
    .line 8
    iput-object p5, p0, Lr9/k;->i:Lr9/f0;

    .line 9
    .line 10
    iput-object p6, p0, Lr9/k;->j:Lgg/u;

    .line 11
    .line 12
    iput-object p7, p0, Lr9/k;->k:Lr9/z;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-wide v1, p0, Lr9/k;->g:J

    .line 11
    .line 12
    iget-object v3, p0, Lr9/k;->i:Lr9/f0;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x3

    .line 17
    sparse-switch v0, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :sswitch_0
    const-string v0, "msgId"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    iget-wide v0, v3, Lr9/f0;->b:J

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :sswitch_1
    const-string v0, "type"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lr9/k;->h:Lgg/u;

    .line 50
    .line 51
    iget-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/lang/Integer;

    .line 54
    .line 55
    const/16 v1, 0x2712

    .line 56
    .line 57
    const/16 v2, 0x2710

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget v0, v3, Lr9/f0;->a:I

    .line 67
    .line 68
    if-gtz v0, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    and-int/lit16 v3, v0, 0xff

    .line 72
    .line 73
    const v4, 0xffff

    .line 74
    .line 75
    .line 76
    and-int/2addr v4, v0

    .line 77
    ushr-int/lit8 v7, v0, 0x10

    .line 78
    .line 79
    if-nez v7, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    if-eq v4, v2, :cond_5

    .line 83
    .line 84
    if-eq v4, v1, :cond_5

    .line 85
    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    if-ne v4, v3, :cond_6

    .line 89
    .line 90
    move v0, v3

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    move v0, v4

    .line 93
    :cond_6
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v3, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 98
    .line 99
    move p1, v0

    .line 100
    :goto_1
    if-eq p1, v5, :cond_f

    .line 101
    .line 102
    if-eq p1, v6, :cond_e

    .line 103
    .line 104
    const/16 v0, 0x22

    .line 105
    .line 106
    if-eq p1, v0, :cond_d

    .line 107
    .line 108
    const/16 v0, 0x25

    .line 109
    .line 110
    if-eq p1, v0, :cond_c

    .line 111
    .line 112
    const/16 v0, 0x3e

    .line 113
    .line 114
    if-eq p1, v0, :cond_b

    .line 115
    .line 116
    const/16 v0, 0x42

    .line 117
    .line 118
    if-eq p1, v0, :cond_a

    .line 119
    .line 120
    if-eq p1, v2, :cond_9

    .line 121
    .line 122
    if-eq p1, v1, :cond_8

    .line 123
    .line 124
    const/16 v0, 0x2a

    .line 125
    .line 126
    if-eq p1, v0, :cond_a

    .line 127
    .line 128
    const/16 v0, 0x2b

    .line 129
    .line 130
    if-eq p1, v0, :cond_7

    .line 131
    .line 132
    packed-switch p1, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    const-string p1, "\u672a\u77e5\u6d88\u606f"

    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_0
    const-string p1, "\u901a\u8bdd\u6d88\u606f"

    .line 139
    .line 140
    return-object p1

    .line 141
    :pswitch_1
    const-string p1, "\u94fe\u63a5/\u5361\u7247"

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_2
    const-string p1, "\u4f4d\u7f6e"

    .line 145
    .line 146
    return-object p1

    .line 147
    :pswitch_3
    const-string p1, "\u8868\u60c5"

    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_7
    const-string p1, "\u89c6\u9891"

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_8
    const-string p1, "\u64a4\u56de\u6d88\u606f"

    .line 154
    .line 155
    return-object p1

    .line 156
    :cond_9
    const-string p1, "\u7cfb\u7edf\u6d88\u606f"

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_a
    const-string p1, "\u540d\u7247"

    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_b
    const-string p1, "\u5c0f\u89c6\u9891"

    .line 163
    .line 164
    return-object p1

    .line 165
    :cond_c
    const-string p1, "\u597d\u53cb\u7533\u8bf7"

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_d
    const-string p1, "\u8bed\u97f3"

    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_e
    const-string p1, "\u56fe\u7247"

    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_f
    const-string p1, "\u6587\u5b57"

    .line 175
    .line 176
    return-object p1

    .line 177
    :sswitch_2
    const-string v0, "time"

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-nez p1, :cond_10

    .line 184
    .line 185
    goto/16 :goto_4

    .line 186
    .line 187
    :cond_10
    iget-object p1, p0, Lr9/k;->j:Lgg/u;

    .line 188
    .line 189
    iget-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v0, :cond_11

    .line 194
    .line 195
    return-object v0

    .line 196
    :cond_11
    invoke-static {v1, v2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v1, p0, Lr9/k;->k:Lr9/z;

    .line 209
    .line 210
    iget-object v1, v1, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    :sswitch_3
    const-string v0, "relativeTime"

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_12

    .line 229
    .line 230
    goto/16 :goto_4

    .line 231
    .line 232
    :cond_12
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p1}, Ljava/time/LocalDate;->now(Ljava/time/ZoneId;)Ljava/time/LocalDate;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ljava/time/LocalDate;->toEpochDay()J

    .line 241
    .line 242
    .line 243
    move-result-wide v3

    .line 244
    invoke-static {v1, v2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0, p1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/time/LocalDate;->toEpochDay()J

    .line 257
    .line 258
    .line 259
    move-result-wide v5

    .line 260
    sub-long/2addr v3, v5

    .line 261
    const-wide/16 v5, 0x1

    .line 262
    .line 263
    cmp-long p1, v3, v5

    .line 264
    .line 265
    if-lez p1, :cond_13

    .line 266
    .line 267
    new-instance p1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v0, "\u5929\u524d"

    .line 276
    .line 277
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    return-object p1

    .line 285
    :cond_13
    if-nez p1, :cond_14

    .line 286
    .line 287
    const-string p1, "\u6628\u5929"

    .line 288
    .line 289
    return-object p1

    .line 290
    :cond_14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 291
    .line 292
    .line 293
    move-result-wide v3

    .line 294
    sub-long/2addr v3, v1

    .line 295
    const-wide/16 v0, 0x0

    .line 296
    .line 297
    cmp-long p1, v3, v0

    .line 298
    .line 299
    if-gtz p1, :cond_15

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :cond_15
    const-wide/32 v0, 0xea60

    .line 303
    .line 304
    .line 305
    div-long v0, v3, v0

    .line 306
    .line 307
    const-wide/32 v7, 0x36ee80

    .line 308
    .line 309
    .line 310
    div-long/2addr v3, v7

    .line 311
    cmp-long p1, v0, v5

    .line 312
    .line 313
    if-gez p1, :cond_16

    .line 314
    .line 315
    :goto_2
    const-string p1, "\u521a\u521a"

    .line 316
    .line 317
    return-object p1

    .line 318
    :cond_16
    cmp-long p1, v3, v5

    .line 319
    .line 320
    if-gez p1, :cond_17

    .line 321
    .line 322
    new-instance p1, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v0, "\u5206\u949f\u524d"

    .line 331
    .line 332
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    return-object p1

    .line 340
    :cond_17
    if-gez p1, :cond_18

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_18
    move-wide v5, v3

    .line 344
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string v0, "\u5c0f\u65f6\u524d"

    .line 353
    .line 354
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    return-object p1

    .line 362
    :sswitch_4
    const-string v0, "typeHex"

    .line 363
    .line 364
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    if-nez p1, :cond_19

    .line 369
    .line 370
    goto/16 :goto_4

    .line 371
    .line 372
    :cond_19
    iget p1, v3, Lr9/f0;->a:I

    .line 373
    .line 374
    const/16 v0, 0x10

    .line 375
    .line 376
    invoke-static {p1, v0}, Ljava/lang/Integer;->toUnsignedString(II)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    const-string v0, "0x"

    .line 381
    .line 382
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    return-object p1

    .line 387
    :sswitch_5
    const-string v0, "typeDec"

    .line 388
    .line 389
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    if-nez p1, :cond_1a

    .line 394
    .line 395
    goto/16 :goto_4

    .line 396
    .line 397
    :cond_1a
    iget p1, v3, Lr9/f0;->a:I

    .line 398
    .line 399
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    return-object p1

    .line 404
    :sswitch_6
    const-string v0, "mentionedUsers"

    .line 405
    .line 406
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    if-nez p1, :cond_1b

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_1b
    invoke-static {v3}, Lr9/d0;->f(Lr9/f0;)Ll8/c;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 418
    .line 419
    .line 420
    move-result p1

    .line 421
    if-eqz p1, :cond_1f

    .line 422
    .line 423
    if-eq p1, v5, :cond_1e

    .line 424
    .line 425
    if-eq p1, v4, :cond_23

    .line 426
    .line 427
    if-eq p1, v6, :cond_1d

    .line 428
    .line 429
    const/4 v0, 0x4

    .line 430
    if-ne p1, v0, :cond_1c

    .line 431
    .line 432
    iget-object p1, v3, Lr9/f0;->i:Ljava/lang/String;

    .line 433
    .line 434
    invoke-static {p1}, Lr9/d0;->f0(Ljava/lang/String;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 439
    .line 440
    .line 441
    move-result p1

    .line 442
    const-string v0, "@"

    .line 443
    .line 444
    const-string v1, "\u4eba"

    .line 445
    .line 446
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    return-object p1

    .line 451
    :cond_1c
    invoke-static {}, Lokio/a;->k()V

    .line 452
    .line 453
    .line 454
    const/4 p1, 0x0

    .line 455
    return-object p1

    .line 456
    :cond_1d
    const-string p1, "\u7fa4\u516c\u544a"

    .line 457
    .line 458
    return-object p1

    .line 459
    :cond_1e
    const-string p1, "@\u6211"

    .line 460
    .line 461
    return-object p1

    .line 462
    :cond_1f
    const-string p1, ""

    .line 463
    .line 464
    return-object p1

    .line 465
    :sswitch_7
    const-string v0, "msgSvrId"

    .line 466
    .line 467
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-nez p1, :cond_20

    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_20
    iget-wide v0, v3, Lr9/f0;->c:J

    .line 475
    .line 476
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    return-object p1

    .line 481
    :sswitch_8
    const-string v0, "atUserList"

    .line 482
    .line 483
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    if-nez p1, :cond_21

    .line 488
    .line 489
    goto :goto_4

    .line 490
    :cond_21
    invoke-static {v3}, Lr9/d0;->f(Lr9/f0;)Ll8/c;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    if-eq p1, v4, :cond_23

    .line 499
    .line 500
    if-eq p1, v6, :cond_22

    .line 501
    .line 502
    iget-object p1, v3, Lr9/f0;->i:Ljava/lang/String;

    .line 503
    .line 504
    return-object p1

    .line 505
    :cond_22
    const-string p1, "\u7fa4\u516c\u544a\u5168\u4f53"

    .line 506
    .line 507
    return-object p1

    .line 508
    :cond_23
    const-string p1, "@\u6240\u6709\u4eba"

    .line 509
    .line 510
    return-object p1

    .line 511
    :sswitch_9
    const-string v0, "rawAtUserList"

    .line 512
    .line 513
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    if-nez p1, :cond_24

    .line 518
    .line 519
    :goto_4
    const/4 p1, 0x0

    .line 520
    return-object p1

    .line 521
    :cond_24
    iget-object p1, v3, Lr9/f0;->i:Ljava/lang/String;

    .line 522
    .line 523
    return-object p1

    .line 524
    nop

    .line 525
    :sswitch_data_0
    .sparse-switch
        -0x7f6bbd5c -> :sswitch_9
        -0x4d353fa4 -> :sswitch_8
        -0x4d272717 -> :sswitch_7
        -0x47ff1c81 -> :sswitch_6
        -0x32d98598 -> :sswitch_5
        -0x32d9767f -> :sswitch_4
        -0x4368447 -> :sswitch_3
        0x3652cd -> :sswitch_2
        0x368f3a -> :sswitch_1
        0x635d47c -> :sswitch_0
    .end sparse-switch

    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
