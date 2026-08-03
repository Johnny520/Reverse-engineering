.class public Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

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

.method public static of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private readDate(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x3e8

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    mul-long/2addr v3, v1

    .line 18
    :cond_0
    new-instance p1, Ljava/util/Date;

    .line 19
    .line 20
    invoke-direct {p1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/16 v4, 0x6e

    .line 44
    .line 45
    if-ne v0, v4, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readNullOrNewDate()Ljava/util/Date;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_4
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->useSimpleFormatter:Z

    .line 53
    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    :cond_5
    move-object v7, p1

    .line 61
    goto/16 :goto_9

    .line 62
    .line 63
    :cond_6
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 64
    .line 65
    if-nez v0, :cond_7

    .line 66
    .line 67
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 68
    .line 69
    if-eqz v0, :cond_8

    .line 70
    .line 71
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 82
    .line 83
    if-eqz p1, :cond_21

    .line 84
    .line 85
    mul-long/2addr v3, v1

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_8
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 89
    .line 90
    const-wide/16 v4, 0x0

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    if-eqz v0, :cond_1b

    .line 94
    .line 95
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 96
    .line 97
    if-eqz v0, :cond_c

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readMillisFromString()J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    goto :goto_0

    .line 110
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readMillis19()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    :goto_0
    cmp-long v0, v6, v4

    .line 115
    .line 116
    if-nez v0, :cond_b

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->wasNull()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_a

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_b
    :goto_1
    new-instance p1, Ljava/util/Date;

    .line 132
    .line 133
    invoke-direct {p1, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 134
    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getLocale()Ljava/util/Locale;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_18

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-nez v8, :cond_17

    .line 156
    .line 157
    const-string v8, "null"

    .line 158
    .line 159
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_d

    .line 164
    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :cond_d
    iget-object v8, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 168
    .line 169
    const/16 v9, 0x2d

    .line 170
    .line 171
    invoke-virtual {v8, v9}, Ljava/lang/String;->indexOf(I)I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    const/4 v10, -0x1

    .line 176
    if-eq v8, v10, :cond_e

    .line 177
    .line 178
    invoke-virtual {v7, v9}, Ljava/lang/String;->indexOf(I)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-ne v8, v10, :cond_e

    .line 183
    .line 184
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/TypeUtils;->isInteger(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_e

    .line 189
    .line 190
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 191
    .line 192
    .line 193
    move-result-wide v0

    .line 194
    new-instance p1, Ljava/util/Date;

    .line 195
    .line 196
    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 197
    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_e
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasHour:Z

    .line 201
    .line 202
    const/16 v9, 0x13

    .line 203
    .line 204
    if-nez v8, :cond_12

    .line 205
    .line 206
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasDay:Z

    .line 207
    .line 208
    if-nez v8, :cond_f

    .line 209
    .line 210
    invoke-virtual {v0, v7}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;)Ljava/time/temporal/TemporalAccessor;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v6, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    .line 215
    .line 216
    invoke-interface {v0, v6}, Ljava/time/temporal/TemporalAccessor;->get(Ljava/time/temporal/TemporalField;)I

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    sget-object v7, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    .line 221
    .line 222
    invoke-interface {v0, v7}, Ljava/time/temporal/TemporalAccessor;->get(Ljava/time/temporal/TemporalField;)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/4 v7, 0x1

    .line 227
    invoke-static {v6, v0, v7}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v6, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 232
    .line 233
    invoke-static {v0, v6}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    goto/16 :goto_3

    .line 238
    .line 239
    :cond_f
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-ne v8, v9, :cond_10

    .line 244
    .line 245
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 246
    .line 247
    invoke-virtual {p1, v8}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-eqz v8, :cond_10

    .line 252
    .line 253
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-static {v7, v6, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime(Ljava/lang/String;II)Ljava/time/LocalDateTime;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    goto :goto_3

    .line 262
    :cond_10
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 263
    .line 264
    if-eqz v8, :cond_11

    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    const/16 v9, 0xa

    .line 271
    .line 272
    if-le v8, v9, :cond_11

    .line 273
    .line 274
    invoke-virtual {v7, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v6, v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    goto :goto_2

    .line 283
    :cond_11
    invoke-static {v7, v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :goto_2
    sget-object v6, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 288
    .line 289
    invoke-static {v0, v6}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    goto :goto_3

    .line 294
    :cond_12
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    if-ne v8, v9, :cond_15

    .line 299
    .line 300
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmm16:Z

    .line 301
    .line 302
    if-nez v8, :cond_13

    .line 303
    .line 304
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 305
    .line 306
    invoke-virtual {p1, v8}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    if-nez v8, :cond_13

    .line 311
    .line 312
    const-string v8, "yyyy-MM-dd hh:mm:ss"

    .line 313
    .line 314
    iget-object v10, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-eqz v8, :cond_15

    .line 321
    .line 322
    :cond_13
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmm16:Z

    .line 323
    .line 324
    if-eqz v0, :cond_14

    .line 325
    .line 326
    const/16 v9, 0x10

    .line 327
    .line 328
    :cond_14
    invoke-static {v7, v6, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime(Ljava/lang/String;II)Ljava/time/LocalDateTime;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    goto :goto_3

    .line 333
    :cond_15
    iget-boolean v6, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasDay:Z

    .line 334
    .line 335
    if-eqz v6, :cond_16

    .line 336
    .line 337
    invoke-static {v7, v0}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    goto :goto_3

    .line 342
    :cond_16
    invoke-static {v7, v0}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    sget-object v6, Ljava/time/LocalDate;->MIN:Ljava/time/LocalDate;

    .line 347
    .line 348
    invoke-static {v6, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    :goto_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-virtual {v0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    goto :goto_5

    .line 365
    :cond_17
    :goto_4
    return-object v3

    .line 366
    :cond_18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    :goto_5
    if-nez p1, :cond_19

    .line 371
    .line 372
    return-object v3

    .line 373
    :cond_19
    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-virtual {p1}, Ljava/time/LocalTime;->getNano()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    cmp-long v0, v6, v4

    .line 386
    .line 387
    const v3, 0xf4240

    .line 388
    .line 389
    .line 390
    if-gez v0, :cond_1a

    .line 391
    .line 392
    if-lez p1, :cond_1a

    .line 393
    .line 394
    const-wide/16 v4, 0x1

    .line 395
    .line 396
    add-long/2addr v6, v4

    .line 397
    mul-long/2addr v6, v1

    .line 398
    div-int/2addr p1, v3

    .line 399
    add-int/lit16 p1, p1, -0x3e8

    .line 400
    .line 401
    :goto_6
    int-to-long v0, p1

    .line 402
    add-long/2addr v6, v0

    .line 403
    move-wide v3, v6

    .line 404
    goto :goto_8

    .line 405
    :cond_1a
    mul-long/2addr v6, v1

    .line 406
    div-int/2addr p1, v3

    .line 407
    goto :goto_6

    .line 408
    :cond_1b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isDate()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_1c

    .line 413
    .line 414
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readDate()Ljava/util/Date;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    return-object p1

    .line 419
    :cond_1c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_1d

    .line 424
    .line 425
    const/16 v11, 0x6c

    .line 426
    .line 427
    const/16 v12, 0x22

    .line 428
    .line 429
    const/16 v8, 0x22

    .line 430
    .line 431
    const/16 v9, 0x76

    .line 432
    .line 433
    const/16 v10, 0x61

    .line 434
    .line 435
    move-object v7, p1

    .line 436
    invoke-virtual/range {v7 .. v12}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatchIdent(CCCCC)Z

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-eqz p1, :cond_1e

    .line 441
    .line 442
    const/16 p1, 0x3a

    .line 443
    .line 444
    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 445
    .line 446
    .line 447
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 448
    .line 449
    .line 450
    move-result-wide v8

    .line 451
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 452
    .line 453
    .line 454
    invoke-virtual {v7, v6}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_1d
    move-object v7, p1

    .line 459
    :cond_1e
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->readMillisFromString()J

    .line 460
    .line 461
    .line 462
    move-result-wide v8

    .line 463
    :goto_7
    cmp-long p1, v8, v4

    .line 464
    .line 465
    if-nez p1, :cond_1f

    .line 466
    .line 467
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->wasNull()Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-eqz p1, :cond_1f

    .line 472
    .line 473
    return-object v3

    .line 474
    :cond_1f
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 475
    .line 476
    if-eqz p1, :cond_20

    .line 477
    .line 478
    mul-long v3, v8, v1

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_20
    move-wide v3, v8

    .line 482
    :cond_21
    :goto_8
    new-instance p1, Ljava/util/Date;

    .line 483
    .line 484
    invoke-direct {p1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 485
    .line 486
    .line 487
    return-object p1

    .line 488
    :goto_9
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 493
    .line 494
    if-eqz v0, :cond_22

    .line 495
    .line 496
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 497
    .line 498
    iget-object v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 499
    .line 500
    iget-object v2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 501
    .line 502
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 503
    .line 504
    .line 505
    goto :goto_a

    .line 506
    :catch_0
    move-exception v0

    .line 507
    goto :goto_b

    .line 508
    :cond_22
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 509
    .line 510
    iget-object v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 511
    .line 512
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    :goto_a
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 516
    .line 517
    .line 518
    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 519
    return-object p1

    .line 520
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string v2, "parse error : "

    .line 523
    .line 524
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    invoke-static {p1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 539
    .line 540
    .line 541
    const/4 p1, 0x0

    .line 542
    return-object p1
.end method


# virtual methods
.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->readDate(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->readDate(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
