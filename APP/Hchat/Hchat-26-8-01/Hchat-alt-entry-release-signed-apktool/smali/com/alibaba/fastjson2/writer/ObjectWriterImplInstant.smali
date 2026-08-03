.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 12
    .line 13
    iget-object v3, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :goto_0
    move-object/from16 v4, p2

    .line 23
    .line 24
    check-cast v4, Ljava/time/Instant;

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInstant(Ljava/time/Instant;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-nez v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isFormatyyyyMMddhhmmss19()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget-object v3, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v3, 0x0

    .line 49
    goto :goto_2

    .line 50
    :cond_4
    :goto_1
    move v3, v5

    .line 51
    :goto_2
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    if-nez v3, :cond_5

    .line 56
    .line 57
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd8:Z

    .line 58
    .line 59
    if-nez v6, :cond_5

    .line 60
    .line 61
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 62
    .line 63
    if-eqz v6, :cond_6

    .line 64
    .line 65
    :cond_5
    move-object v6, v2

    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_6
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v4, v3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 77
    .line 78
    if-nez v4, :cond_7

    .line 79
    .line 80
    iget-object v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 81
    .line 82
    if-nez v4, :cond_8

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_8

    .line 89
    .line 90
    :cond_7
    move-object v8, v3

    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_8
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 94
    .line 95
    if-nez v4, :cond_9

    .line 96
    .line 97
    iget-object v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v4, :cond_a

    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_a

    .line 106
    .line 107
    :cond_9
    move-object v8, v3

    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_a
    move-object v6, v2

    .line 111
    invoke-virtual {v3}, Ljava/time/ZonedDateTime;->getYear()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-ltz v2, :cond_c

    .line 116
    .line 117
    const/16 v4, 0x270f

    .line 118
    .line 119
    if-gt v2, v4, :cond_c

    .line 120
    .line 121
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 122
    .line 123
    if-nez v4, :cond_b

    .line 124
    .line 125
    iget-object v4, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 126
    .line 127
    if-nez v4, :cond_c

    .line 128
    .line 129
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_c

    .line 134
    .line 135
    :cond_b
    move-object v4, v3

    .line 136
    goto :goto_3

    .line 137
    :cond_c
    move-object v8, v3

    .line 138
    goto :goto_4

    .line 139
    :goto_3
    invoke-virtual {v4}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    move-object v5, v4

    .line 144
    invoke-virtual {v5}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    move-object v7, v5

    .line 149
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getHour()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    move-object v8, v7

    .line 158
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->getNano()I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    const v10, 0xf4240

    .line 167
    .line 168
    .line 169
    div-int/2addr v9, v10

    .line 170
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-virtual {v8}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const/4 v10, 0x1

    .line 179
    move/from16 v28, v9

    .line 180
    .line 181
    move v9, v8

    .line 182
    move/from16 v8, v28

    .line 183
    .line 184
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :goto_4
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-nez v2, :cond_d

    .line 193
    .line 194
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :cond_d
    if-nez v2, :cond_e

    .line 199
    .line 200
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/JSONWriter;->writeZonedDateTime(Ljava/time/ZonedDateTime;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_e
    invoke-virtual {v2, v8}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :goto_5
    invoke-interface {v8}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    .line 217
    .line 218
    .line 219
    move-result-wide v2

    .line 220
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :goto_6
    invoke-interface {v8}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    .line 229
    .line 230
    .line 231
    move-result-wide v2

    .line 232
    const-wide/16 v4, 0x3e8

    .line 233
    .line 234
    div-long/2addr v2, v4

    .line 235
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :goto_7
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v4}, Ljava/time/Instant;->getEpochSecond()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 248
    .line 249
    if-eq v2, v8, :cond_10

    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    sget-object v9, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 256
    .line 257
    if-ne v8, v9, :cond_f

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_f
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2, v4}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    goto :goto_9

    .line 273
    :cond_10
    :goto_8
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    :goto_9
    int-to-long v8, v2

    .line 278
    add-long/2addr v6, v8

    .line 279
    const-wide/32 v8, 0x15180

    .line 280
    .line 281
    .line 282
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 283
    .line 284
    .line 285
    move-result-wide v10

    .line 286
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->floorMod(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    long-to-int v2, v6

    .line 291
    const-wide/32 v6, 0xafa6c

    .line 292
    .line 293
    .line 294
    add-long/2addr v6, v10

    .line 295
    const-wide/16 v8, 0x0

    .line 296
    .line 297
    cmp-long v4, v6, v8

    .line 298
    .line 299
    const-wide/16 v12, 0x1

    .line 300
    .line 301
    const-wide/32 v14, 0x23ab1

    .line 302
    .line 303
    .line 304
    const-wide/16 v16, 0x190

    .line 305
    .line 306
    if-gez v4, :cond_11

    .line 307
    .line 308
    const-wide/32 v18, 0xafa6d

    .line 309
    .line 310
    .line 311
    add-long v10, v10, v18

    .line 312
    .line 313
    div-long/2addr v10, v14

    .line 314
    sub-long/2addr v10, v12

    .line 315
    mul-long v18, v10, v16

    .line 316
    .line 317
    neg-long v10, v10

    .line 318
    mul-long/2addr v10, v14

    .line 319
    add-long/2addr v6, v10

    .line 320
    goto :goto_a

    .line 321
    :cond_11
    move-wide/from16 v18, v8

    .line 322
    .line 323
    :goto_a
    mul-long v10, v6, v16

    .line 324
    .line 325
    const-wide/16 v20, 0x24f

    .line 326
    .line 327
    add-long v10, v10, v20

    .line 328
    .line 329
    div-long/2addr v10, v14

    .line 330
    const-wide/16 v14, 0x16d

    .line 331
    .line 332
    mul-long v20, v10, v14

    .line 333
    .line 334
    const-wide/16 v22, 0x4

    .line 335
    .line 336
    div-long v24, v10, v22

    .line 337
    .line 338
    add-long v24, v24, v20

    .line 339
    .line 340
    const-wide/16 v20, 0x64

    .line 341
    .line 342
    div-long v26, v10, v20

    .line 343
    .line 344
    sub-long v24, v24, v26

    .line 345
    .line 346
    div-long v26, v10, v16

    .line 347
    .line 348
    add-long v26, v26, v24

    .line 349
    .line 350
    sub-long v24, v6, v26

    .line 351
    .line 352
    cmp-long v4, v24, v8

    .line 353
    .line 354
    if-gez v4, :cond_12

    .line 355
    .line 356
    sub-long/2addr v10, v12

    .line 357
    mul-long/2addr v14, v10

    .line 358
    div-long v12, v10, v22

    .line 359
    .line 360
    add-long/2addr v12, v14

    .line 361
    div-long v14, v10, v20

    .line 362
    .line 363
    sub-long/2addr v12, v14

    .line 364
    div-long v14, v10, v16

    .line 365
    .line 366
    add-long/2addr v14, v12

    .line 367
    sub-long v24, v6, v14

    .line 368
    .line 369
    :cond_12
    move-wide/from16 v6, v24

    .line 370
    .line 371
    add-long v10, v10, v18

    .line 372
    .line 373
    long-to-int v4, v6

    .line 374
    mul-int/lit8 v6, v4, 0x5

    .line 375
    .line 376
    add-int/lit8 v6, v6, 0x2

    .line 377
    .line 378
    div-int/lit16 v6, v6, 0x99

    .line 379
    .line 380
    add-int/lit8 v7, v6, 0x2

    .line 381
    .line 382
    rem-int/lit8 v7, v7, 0xc

    .line 383
    .line 384
    add-int/2addr v7, v5

    .line 385
    mul-int/lit16 v12, v6, 0x132

    .line 386
    .line 387
    add-int/lit8 v12, v12, 0x5

    .line 388
    .line 389
    div-int/lit8 v12, v12, 0xa

    .line 390
    .line 391
    sub-int/2addr v4, v12

    .line 392
    add-int/2addr v4, v5

    .line 393
    div-int/lit8 v6, v6, 0xa

    .line 394
    .line 395
    int-to-long v5, v6

    .line 396
    add-long/2addr v10, v5

    .line 397
    const-wide/32 v5, -0x3b9ac9ff

    .line 398
    .line 399
    .line 400
    cmp-long v5, v10, v5

    .line 401
    .line 402
    if-ltz v5, :cond_17

    .line 403
    .line 404
    const-wide/32 v5, 0x3b9ac9ff

    .line 405
    .line 406
    .line 407
    cmp-long v5, v10, v5

    .line 408
    .line 409
    if-gtz v5, :cond_17

    .line 410
    .line 411
    long-to-int v5, v10

    .line 412
    int-to-long v10, v2

    .line 413
    cmp-long v2, v10, v8

    .line 414
    .line 415
    if-ltz v2, :cond_16

    .line 416
    .line 417
    const-wide/32 v8, 0x1517f

    .line 418
    .line 419
    .line 420
    cmp-long v2, v10, v8

    .line 421
    .line 422
    if-gtz v2, :cond_16

    .line 423
    .line 424
    const-wide/16 v8, 0xe10

    .line 425
    .line 426
    div-long v8, v10, v8

    .line 427
    .line 428
    long-to-int v2, v8

    .line 429
    mul-int/lit16 v6, v2, 0xe10

    .line 430
    .line 431
    int-to-long v8, v6

    .line 432
    sub-long/2addr v10, v8

    .line 433
    const-wide/16 v8, 0x3c

    .line 434
    .line 435
    div-long v8, v10, v8

    .line 436
    .line 437
    long-to-int v6, v8

    .line 438
    mul-int/lit8 v8, v6, 0x3c

    .line 439
    .line 440
    int-to-long v8, v8

    .line 441
    sub-long/2addr v10, v8

    .line 442
    long-to-int v8, v10

    .line 443
    if-eqz v3, :cond_13

    .line 444
    .line 445
    move v3, v5

    .line 446
    move v5, v2

    .line 447
    move v2, v3

    .line 448
    move v3, v7

    .line 449
    move v7, v8

    .line 450
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_13
    move v3, v5

    .line 455
    move v5, v2

    .line 456
    move v2, v3

    .line 457
    move v3, v7

    .line 458
    move v7, v8

    .line 459
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 460
    .line 461
    if-eqz v1, :cond_14

    .line 462
    .line 463
    move-object/from16 v1, p1

    .line 464
    .line 465
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime14(IIIIII)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_14
    move-object/from16 v1, p1

    .line 470
    .line 471
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 472
    .line 473
    if-eqz v5, :cond_15

    .line 474
    .line 475
    invoke-virtual {v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :cond_15
    invoke-virtual {v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD8(III)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :cond_16
    new-instance v1, Ljava/time/DateTimeException;

    .line 484
    .line 485
    const-string v2, "Invalid secondOfDay "

    .line 486
    .line 487
    invoke-static {v10, v11, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v1

    .line 495
    :cond_17
    new-instance v1, Ljava/time/DateTimeException;

    .line 496
    .line 497
    const-string v2, "Invalid year "

    .line 498
    .line 499
    invoke-static {v10, v11, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v1
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/Instant;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInstant(Ljava/time/Instant;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
